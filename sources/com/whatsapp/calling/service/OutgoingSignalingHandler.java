package com.whatsapp.calling.service;

import X.A83;
import X.A99;
import X.AnonymousClass000;
import X.AnonymousClass00R;
import X.AnonymousClass10I;
import X.AnonymousClass11P;
import X.AnonymousClass11Q;
import X.AnonymousClass11S;
import X.AnonymousClass1E0;
import X.AnonymousClass1HQ;
import X.AnonymousClass1MD;
import X.AnonymousClass1OZ;
import X.AnonymousClass8BR;
import X.AnonymousClass8BS;
import X.AnonymousClass8BT;
import X.AnonymousClass8BX;
import X.C108945cZ;
import X.C108955ca;
import X.C108965cb;
import X.C140076zu;
import X.C173448v5;
import X.C17880vN;
import X.C17890vO;
import X.C17900vP;
import X.C17960vV;
import X.C18030ve;
import X.C18070vi;
import X.C186989f5;
import X.C190999lr;
import X.C191489mg;
import X.C192429oN;
import X.C194059r6;
import X.C20111A7t;
import X.C21403AjW;
import X.C21431Ajy;
import X.C21452AkJ;
import X.C25381Nz;
import X.C40811vJ;
import X.C54492eE;
import X.C58662l3;
import X.C59402mF;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.protocol.VoipStanzaChildNode;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.SignalingXmppCallback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class OutgoingSignalingHandler implements SignalingXmppCallback {
    public final C18030ve abProps;
    public final C190999lr callSendMethods;
    public final AnonymousClass11Q companionModeSharedPreferences;
    public final C20111A7t encryptionHelper;
    public final AnonymousClass11S meManager;
    public String outgoingCallAcceptStanzaId;
    public String outgoingCallOfferKey;
    public volatile C191489mg pendingCallOfferStanza;
    public final AnonymousClass11P time;
    public final A99 voiceService;
    public final AnonymousClass1HQ voipNative;
    public final AnonymousClass10I waWorkers;

    public static final VoipStanzaChildNode A01(C54492eE r5, String str) {
        ArrayList A0s = C108965cb.A0s(new VoipStanzaChildNode(PublicKeyCredentialControllerUtility.JSON_KEY_ID, (AnonymousClass1MD[]) null, (VoipStanzaChildNode[]) null, r5.A01));
        A0s.add(new VoipStanzaChildNode("value", (AnonymousClass1MD[]) null, (VoipStanzaChildNode[]) null, r5.A00));
        byte[] bArr = r5.A02;
        if (bArr != null) {
            A0s.add(new VoipStanzaChildNode(PublicKeyCredentialControllerUtility.JSON_KEY_SIGNATURE, (AnonymousClass1MD[]) null, (VoipStanzaChildNode[]) null, bArr));
        }
        return new VoipStanzaChildNode(str, (AnonymousClass1MD[]) null, (VoipStanzaChildNode[]) A0s.toArray(new VoipStanzaChildNode[0]), (byte[]) null);
    }

    public static VoipStanzaChildNode[] A04(Map map, Set set) {
        ArrayList arrayList;
        VoipStanzaChildNode[] voipStanzaChildNodeArr = null;
        Map map2 = map;
        Set set2 = set;
        if (map == null) {
            C17960vV.A0F(C108945cZ.A1U(set2), "no destination jids");
            arrayList = C17880vN.A10(set2);
        } else {
            C17960vV.A0F(map.keySet().equals(set2), "some device are not encrypted!");
            arrayList = null;
        }
        ArrayList A03 = A83.A03((C192429oN) null, (Integer) null, (String) null, (String) null, arrayList, Collections.emptyMap(), (Map) null, map2, 0, false, false, false, false, false);
        if (!A03.isEmpty()) {
            voipStanzaChildNodeArr = new VoipStanzaChildNode[A03.size()];
            for (int i = 0; i < A03.size(); i++) {
                voipStanzaChildNodeArr[i] = VoipStanzaChildNode.fromProtocolTreeNode(AnonymousClass8BR.A0m(A03, i));
            }
        }
        return voipStanzaChildNodeArr;
    }

    public void clearPendingCallOfferStanza() {
        this.pendingCallOfferStanza = null;
    }

    public boolean preSendTerminate(Jid jid, String str, boolean z) {
        C59402mF r0;
        sendPendingCallOfferStanza(jid, str, true);
        String str2 = this.outgoingCallOfferKey;
        if (str2 != null) {
            AnonymousClass1OZ A0U = C17880vN.A0U(this.callSendMethods.A03);
            C25381Nz r02 = A0U.A06;
            if (z) {
                LinkedHashMap linkedHashMap = r02.A00;
                synchronized (linkedHashMap) {
                    r0 = (C59402mF) linkedHashMap.remove(str2);
                }
                if (r0 != null) {
                    C17900vP.A0g("MessageClient/stopRetryingChallengedMessage, id=", str2, AnonymousClass000.A10());
                    A0U.A01.A0G("strong-auth-challenge-dropped-call-offer", (String) null, false);
                }
            } else {
                r02.A00(str2);
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("OutgoingSignalingHandler/preSendTerminate: dropped unacked offer: call id = ");
                A10.append(str);
                A10.append(", stanza id = ");
                C17890vO.A1B(A10, this.outgoingCallOfferKey);
            }
            this.outgoingCallOfferKey = null;
        }
        String str3 = this.outgoingCallAcceptStanzaId;
        if (str3 != null) {
            C17880vN.A0U(this.callSendMethods.A03).A06.A00(str3);
            this.outgoingCallAcceptStanzaId = null;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x011c, code lost:
        if (r2 == com.whatsapp.voipcalling.CallState.CONNECTED_LONELY) goto L_0x011e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0121, code lost:
        if (r0 == false) goto L_0x0123;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x012d, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r10.abProps, 8003) != false) goto L_0x012f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void sendCallStanza(com.whatsapp.jid.Jid r11, java.lang.String r12, com.whatsapp.protocol.VoipStanzaChildNode r13) {
        /*
            r10 = this;
            r6 = r13
            java.lang.String r1 = r13.tag
            r4 = r10
            X.11P r2 = r10.time
            X.11S r0 = r10.meManager
            java.lang.String r7 = X.AnonymousClass8BS.A0e(r0, r2)
            int r0 = r1.hashCode()
            r9 = 1
            r5 = r11
            r8 = r12
            switch(r0) {
                case -1624583601: goto L_0x002d;
                case -1423461112: goto L_0x0047;
                case -934710369: goto L_0x0079;
                case 103144406: goto L_0x007c;
                case 105650780: goto L_0x009f;
                case 112202875: goto L_0x00b0;
                case 1063018407: goto L_0x00c3;
                case 1184155715: goto L_0x00d6;
                case 1945493729: goto L_0x00f1;
                case 2035990113: goto L_0x00fd;
                default: goto L_0x0016;
            }
        L_0x0016:
            X.9lr r0 = r10.callSendMethods
            X.9f5 r3 = new X.9f5
            r3.<init>(r11, r7, r12, r13)
            X.00H r0 = r0.A03
            X.1OZ r2 = X.C17880vN.A0U(r0)
            android.os.Message r1 = X.AnonymousClass8BX.A0F(r3)
            java.lang.String r0 = r3.A03
            r2.A0G(r1, r0)
            return
        L_0x002d:
            java.lang.String r0 = "link_join"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0016
            X.A99 r3 = r10.voiceService
            X.9d6 r0 = r3.A0a
            if (r0 != 0) goto L_0x0016
            long r0 = android.os.SystemClock.elapsedRealtime()
            X.9d6 r2 = new X.9d6
            r2.<init>(r7, r0)
            r3.A0a = r2
            goto L_0x0016
        L_0x0047:
            java.lang.String r0 = "accept"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0016
            X.A99 r3 = r10.voiceService
            X.9d6 r0 = r3.A0Z
            if (r0 != 0) goto L_0x0060
            long r0 = android.os.SystemClock.elapsedRealtime()
            X.9d6 r2 = new X.9d6
            r2.<init>(r7, r0)
            r3.A0Z = r2
        L_0x0060:
            X.9f5 r3 = new X.9f5
            r3.<init>(r11, r7, r12, r13)
            X.0ve r2 = r10.abProps
            r1 = 9431(0x24d7, float:1.3216E-41)
            X.0vf r0 = X.C18040vf.A02
            int r0 = X.C18020vd.A00(r0, r2, r1)
            if (r0 <= 0) goto L_0x014a
            r10.outgoingCallAcceptStanzaId = r7
            X.9lr r0 = r10.callSendMethods
            r0.A00(r3)
            return
        L_0x0079:
            java.lang.String r0 = "reject"
            goto L_0x00b2
        L_0x007c:
            java.lang.String r0 = "lobby"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0016
            X.A99 r0 = r10.voiceService
            X.9d6 r0 = r0.A0c
            if (r0 != 0) goto L_0x0016
            boolean r0 = X.AnonymousClass8BT.A1Y(r12)
            if (r0 == 0) goto L_0x0016
            X.A99 r3 = r10.voiceService
            long r0 = android.os.SystemClock.elapsedRealtime()
            X.9d6 r2 = new X.9d6
            r2.<init>(r7, r0)
            r3.A0c = r2
            goto L_0x0016
        L_0x009f:
            java.lang.String r0 = "offer"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0016
            X.9mg r0 = new X.9mg
            r0.<init>(r11, r12, r13)
            r10.sendOfferStanza(r0)
            return
        L_0x00b0:
            java.lang.String r0 = "video"
        L_0x00b2:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0016
            X.9lr r1 = r10.callSendMethods
            X.9f5 r0 = new X.9f5
            r0.<init>(r11, r7, r12, r13)
            r1.A00(r0)
            return
        L_0x00c3:
            java.lang.String r0 = "enc_rekey"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0016
            X.10I r0 = r10.waWorkers
            X.Ak5 r3 = new X.Ak5
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r0.CGF(r3)
            return
        L_0x00d6:
            java.lang.String r0 = "link_query"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0016
            X.A99 r3 = r10.voiceService
            X.9d6 r0 = r3.A0b
            if (r0 != 0) goto L_0x0016
            long r0 = android.os.SystemClock.elapsedRealtime()
            X.9d6 r2 = new X.9d6
            r2.<init>(r7, r0)
            r3.A0b = r2
            goto L_0x0016
        L_0x00f1:
            java.lang.String r0 = "link_create"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0016
            X.A99.A49 = r7
            goto L_0x0016
        L_0x00fd:
            java.lang.String r0 = "terminate"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0016
            X.1HQ r0 = r10.voipNative
            com.whatsapp.voipcalling.CallInfo r1 = r0.BO3()
            if (r1 == 0) goto L_0x0123
            boolean r0 = r1.isBotCall
            boolean r3 = X.AnonymousClass000.A1O(r0)
            com.whatsapp.voipcalling.CallState r2 = r1.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r2 == r0) goto L_0x011e
            com.whatsapp.voipcalling.CallState r1 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            r0 = 0
            if (r2 != r1) goto L_0x011f
        L_0x011e:
            r0 = 1
        L_0x011f:
            if (r3 != 0) goto L_0x0148
            if (r0 != 0) goto L_0x0148
        L_0x0123:
            X.0ve r2 = r10.abProps
            r1 = 8003(0x1f43, float:1.1215E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0148
        L_0x012f:
            r10.preSendTerminate(r11, r12, r9)
            X.9f5 r3 = new X.9f5
            r3.<init>(r11, r7, r12, r13)
            X.9lr r0 = r10.callSendMethods
            if (r9 == 0) goto L_0x015c
            r0.A00(r3)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "OutgoingSignalingHandler/sendCallStanza: sending terminate with retry: call id = "
            X.C17900vP.A0f(r0, r12, r1)
            return
        L_0x0148:
            r9 = 0
            goto L_0x012f
        L_0x014a:
            X.9lr r0 = r10.callSendMethods
            X.00H r0 = r0.A03
            X.1OZ r2 = X.C17880vN.A0U(r0)
            android.os.Message r1 = X.AnonymousClass8BX.A0F(r3)
            java.lang.String r0 = r3.A03
            r2.A0G(r1, r0)
            return
        L_0x015c:
            X.00H r0 = r0.A03
            X.1OZ r2 = X.C17880vN.A0U(r0)
            android.os.Message r1 = X.AnonymousClass8BX.A0F(r3)
            java.lang.String r0 = r3.A03
            r2.A0G(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.service.OutgoingSignalingHandler.sendCallStanza(com.whatsapp.jid.Jid, java.lang.String, com.whatsapp.protocol.VoipStanzaChildNode):void");
    }

    public void sendOfferStanza(C191489mg r14) {
        boolean z;
        C191489mg r4 = r14;
        Jid jid = r14.A01;
        String str = r14.A04;
        VoipStanzaChildNode voipStanzaChildNode = r14.A03;
        String A0e = AnonymousClass8BS.A0e(this.meManager, this.time);
        this.outgoingCallOfferKey = A0e;
        CallInfo BO3 = this.voipNative.BO3();
        if (BO3 == null || !BO3.isBotCall) {
            z = false;
        } else {
            z = true;
            ((C140076zu) this.voiceService.A3X.get()).A02(AnonymousClass00R.A0C);
        }
        HashMap A11 = C17880vN.A11();
        Iterator A15 = AnonymousClass000.A15(r14.A05);
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            Object key = A16.getKey();
            if (A16.getValue() != null) {
                A11.put(key, A16.getValue());
            }
        }
        Set keySet = A11.keySet();
        boolean A1U = C108945cZ.A1U(keySet);
        if (A1U) {
            for (Object next : keySet) {
                C58662l3 r1 = this.encryptionHelper.A03;
                C18070vi.A0d(next, 0);
                if (r1.A02.contains(next)) {
                    C17900vP.A0Y(next, "VoiceService:sendOfferStanza waiting for PreKey job finishes with ", AnonymousClass000.A10());
                    this.pendingCallOfferStanza = r14;
                    return;
                }
            }
        }
        C21403AjW ajW = new C21403AjW(r4, this, jid, voipStanzaChildNode, str, A0e, A11, z, A1U);
        if (A1U || z) {
            Log.i("VoiceService:sendOfferStanza without delay");
            this.voiceService.A1E.execute(ajW);
            return;
        }
        ajW.run();
    }

    public static boolean A03(VoipStanzaChildNode voipStanzaChildNode) {
        AnonymousClass1MD A0h = AnonymousClass8BR.A0h(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "pkmsg");
        VoipStanzaChildNode A03 = C40811vJ.A03(voipStanzaChildNode, "enc");
        if (A03 != null) {
            return A03.hasAttribute(A0h);
        }
        VoipStanzaChildNode A032 = C40811vJ.A03(voipStanzaChildNode, "destination");
        if (A032 != null) {
            VoipStanzaChildNode[] childrenCopy = A032.getChildrenCopy();
            if (childrenCopy != null) {
                for (VoipStanzaChildNode A033 : childrenCopy) {
                    VoipStanzaChildNode A034 = C40811vJ.A03(A033, "enc");
                    if (A034 != null && A034.hasAttribute(A0h)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private C194059r6 rekeyEncryptionTask(byte[] bArr, DeviceJid deviceJid, String str, byte b) {
        this.voiceService.A3d.put(deviceJid, Byte.valueOf(b));
        C194059r6 encryptedE2EKey = getEncryptedE2EKey(bArr, deviceJid);
        if (encryptedE2EKey != null) {
            if (!AnonymousClass8BT.A1Y(str)) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("VoiceService:rekeyEncryptionTask(");
                AnonymousClass8BT.A1V(A10, str);
                A10.append(deviceJid);
                C17890vO.A1B(A10, ", the call has ended, do nothing)");
            } else {
                this.voiceService.A3d.remove(deviceJid);
                return encryptedE2EKey;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00f0 A[SYNTHETIC, Splitter:B:34:0x00f0] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Map getBulkEncryptedE2EKeys(java.util.Map r14, int r15, boolean r16) {
        /*
            r13 = this;
            X.A7t r3 = r13.encryptionHelper
            boolean r0 = r14.isEmpty()
            java.lang.Boolean r5 = X.AnonymousClass000.A0i()
            r2 = 0
            if (r0 != 0) goto L_0x0020
            X.2l3 r1 = r3.A03
            java.util.Set r0 = r14.keySet()
            r4 = 0
            java.util.HashSet r7 = r1.A00(r0, r4)
            if (r16 != 0) goto L_0x0039
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x0039
        L_0x0020:
            android.util.Pair r4 = X.C108945cZ.A0N(r5, r2)
        L_0x0024:
            java.lang.Object r0 = r4.first
            boolean r0 = X.AnonymousClass000.A1Y(r0)
            if (r0 != 0) goto L_0x0034
            X.A99 r2 = r13.voiceService
            r1 = 30
            r0 = 0
            r2.A0n(r1, r0)
        L_0x0034:
            java.lang.Object r0 = r4.second
            java.util.Map r0 = (java.util.Map) r0
            return r0
        L_0x0039:
            java.util.HashMap r8 = X.C17880vN.A11()
            java.util.Iterator r12 = X.AnonymousClass000.A15(r14)
        L_0x0041:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x013a
            java.util.Map$Entry r0 = X.AnonymousClass000.A16(r12)
            java.lang.Object r6 = r0.getKey()
            com.whatsapp.jid.DeviceJid r6 = (com.whatsapp.jid.DeviceJid) r6
            java.lang.Object r1 = r0.getValue()
            byte[] r1 = (byte[]) r1
            boolean r0 = r7.contains(r6)
            if (r0 != 0) goto L_0x0041
            X.8X8 r10 = X.C166418cr.A00()
            X.Bm6 r0 = r10.A00
            X.8cr r0 = (X.C166418cr) r0
            X.8bY r0 = r0.call_
            if (r0 != 0) goto L_0x006b
            X.8bY r0 = X.C165658bY.DEFAULT_INSTANCE
        L_0x006b:
            X.Bmt r11 = r0.A0O()
            X.8SY r11 = (X.AnonymousClass8SY) r11
            X.BmB r9 = X.AnonymousClass8BU.A0A(r11, r1, r4)
            X.Bm6 r1 = r11.A00
            X.8bY r1 = (X.C165658bY) r1
            int r0 = X.C165658bY.CALL_KEY_FIELD_NUMBER
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            r1.callKey_ = r9
            if (r15 != 0) goto L_0x00a9
            X.0ve r9 = r3.A0C
            r1 = 520(0x208, float:7.29E-43)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r9, r1)
            if (r0 == 0) goto L_0x00a9
            X.1eV r1 = r3.A08
            com.whatsapp.jid.UserJid r0 = r6.userJid
            X.Abw r9 = r1.A00(r0)
            java.util.Map r1 = r1.A02
            int r0 = r9.A00
            java.lang.Object r0 = X.AnonymousClass000.A0w(r1, r0)
            X.C17960vV.A07(r0)
            X.1eR r0 = (X.C30741eR) r0
            r0.A01(r9, r11)
        L_0x00a9:
            X.8cr r1 = X.AnonymousClass8BS.A0M(r10)
            X.Bm6 r0 = r11.A0C()
            X.8bY r0 = (X.C165658bY) r0
            r0.getClass()
            r1.call_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 512(0x200, float:7.175E-43)
            r1.bitField0_ = r0
            X.1U5 r1 = r3.A0B
            com.whatsapp.jid.UserJid r0 = r6.userJid
            X.9ge r9 = r1.A06(r0)
            if (r9 == 0) goto L_0x0115
            X.Bm6 r1 = r10.A0C()
            X.8cr r0 = X.C166418cr.DEFAULT_INSTANCE
            X.Bmt r0 = r0.A0N()
            r0.A0F(r1)
            X.8X8 r0 = (X.AnonymousClass8X8) r0
            X.AnonymousClass9AU.A03(r9, r0)
            if (r0 == 0) goto L_0x0115
            X.Bm6 r9 = r0.A0C()
        L_0x00e0:
            X.8cr r9 = (X.C166418cr) r9
            X.1P3 r0 = r3.A06
            boolean r0 = r0.A0Y()
            if (r0 != 0) goto L_0x010c
            boolean r0 = r3.A07()
            if (r0 != 0) goto L_0x010c
            X.1Ot r1 = r3.A07     // Catch:{ CancellationException -> 0x012c, InterruptedException -> 0x011a, ExecutionException -> 0x0140 }
            X.3DD r0 = new X.3DD     // Catch:{ CancellationException -> 0x012c, InterruptedException -> 0x011a, ExecutionException -> 0x0140 }
            r0.<init>(r6, r3, r9, r4)     // Catch:{ CancellationException -> 0x012c, InterruptedException -> 0x011a, ExecutionException -> 0x0140 }
            java.util.concurrent.Future r0 = r1.A01(r0)     // Catch:{ CancellationException -> 0x012c, InterruptedException -> 0x011a, ExecutionException -> 0x0140 }
            r3.A0I = r0     // Catch:{ CancellationException -> 0x012c, InterruptedException -> 0x011a, ExecutionException -> 0x0140 }
            java.util.concurrent.Future r0 = r3.A0I     // Catch:{ CancellationException -> 0x012c, InterruptedException -> 0x011a, ExecutionException -> 0x0140 }
            java.lang.Object r0 = r0.get()     // Catch:{ CancellationException -> 0x012c, InterruptedException -> 0x011a, ExecutionException -> 0x0140 }
            X.9r6 r0 = (X.C194059r6) r0     // Catch:{ CancellationException -> 0x012c, InterruptedException -> 0x011a, ExecutionException -> 0x0140 }
            r8.put(r6, r0)     // Catch:{ CancellationException -> 0x012c, InterruptedException -> 0x011a, ExecutionException -> 0x0140 }
            r3.A0I = r2
            goto L_0x0041
        L_0x010c:
            X.9r6 r0 = X.C20111A7t.A03(r3, r6, r9)
            r8.put(r6, r0)
            goto L_0x0041
        L_0x0115:
            X.Bm6 r9 = r10.A0C()
            goto L_0x00e0
        L_0x011a:
            r1 = move-exception
            java.lang.String r0 = "voip/encryption/encryptE2EKey interrupted"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0146 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x0146 }
            android.util.Pair r4 = X.C108945cZ.A0N(r0, r2)     // Catch:{ all -> 0x0146 }
            r3.A0I = r2
            goto L_0x0024
        L_0x012c:
            r1 = move-exception
            java.lang.String r0 = "voip/encryption/encryptE2EKey cancelled"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0146 }
            android.util.Pair r4 = X.C108945cZ.A0N(r5, r2)     // Catch:{ all -> 0x0146 }
            r3.A0I = r2
            goto L_0x0024
        L_0x013a:
            android.util.Pair r4 = X.C108945cZ.A0N(r5, r8)
            goto L_0x0024
        L_0x0140:
            r0 = move-exception
            java.lang.AssertionError r0 = X.AnonymousClass8BR.A0v(r0)     // Catch:{ all -> 0x0146 }
            throw r0     // Catch:{ all -> 0x0146 }
        L_0x0146:
            r0 = move-exception
            r3.A0I = r2
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.service.OutgoingSignalingHandler.getBulkEncryptedE2EKeys(java.util.Map, int, boolean):java.util.Map");
    }

    /* renamed from: lambda$sendCallStanza$0$com-whatsapp-calling-service-OutgoingSignalingHandler  reason: not valid java name */
    public /* synthetic */ void m36lambda$sendCallStanza$0$comwhatsappcallingserviceOutgoingSignalingHandler(Jid jid, String str, String str2, VoipStanzaChildNode voipStanzaChildNode) {
        if (jid instanceof C173448v5) {
            Parcelable.Creator creator = C173448v5.CREATOR;
            C173448v5 r2 = (C173448v5) jid;
            C17960vV.A07(r2);
            sendReKeyFanoutStanza(str, r2, str2, voipStanzaChildNode);
            return;
        }
        DeviceJid A00 = AnonymousClass1E0.A00(jid);
        C17960vV.A07(A00);
        sendReKeyStanza(str, A00, str2, voipStanzaChildNode);
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* renamed from: lambda$sendOfferStanza$1$com-whatsapp-calling-service-OutgoingSignalingHandler  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void m37lambda$sendOfferStanza$1$comwhatsappcallingserviceOutgoingSignalingHandler(boolean r9, com.whatsapp.protocol.VoipStanzaChildNode r10, boolean r11, com.whatsapp.jid.Jid r12, java.lang.String r13, java.util.Map r14, X.C191489mg r15, java.lang.String r16) {
        /*
            r8 = this;
            if (r9 == 0) goto L_0x003b
            X.A99 r0 = r8.voiceService
            X.1P3 r0 = r0.A2h
            int r4 = r0.A06()
            X.A7t r3 = r8.encryptionHelper
            X.1P3 r0 = r3.A06
            boolean r0 = r0.A0Y()
            if (r0 != 0) goto L_0x00d3
            boolean r0 = r3.A07()
            if (r0 != 0) goto L_0x00d3
            X.1Ot r2 = r3.A07     // Catch:{ InterruptedException | ExecutionException -> 0x002e }
            r1 = 7
            X.Akz r0 = new X.Akz     // Catch:{ InterruptedException | ExecutionException -> 0x002e }
            r0.<init>(r3, r1)     // Catch:{ InterruptedException | ExecutionException -> 0x002e }
            java.util.concurrent.Future r0 = r2.A01(r0)     // Catch:{ InterruptedException | ExecutionException -> 0x002e }
            java.lang.Object r0 = r0.get()     // Catch:{ InterruptedException | ExecutionException -> 0x002e }
            android.util.Pair r0 = (android.util.Pair) r0     // Catch:{ InterruptedException | ExecutionException -> 0x002e }
            goto L_0x00d7
        L_0x002e:
            r1 = move-exception
            java.lang.String r0 = "voip/encryption failed to generate identity key pair"
            com.whatsapp.util.Log.e(r0, r1)
            java.lang.String r0 = "Failed to generate identity key pair"
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0w(r0)
            throw r0
        L_0x003b:
            if (r11 == 0) goto L_0x00b9
            com.whatsapp.jid.UserJid r0 = com.whatsapp.voipcalling.Voip.JidHelper.convertToUserJid(r12)
            X.C17960vV.A07(r0)
            java.util.Map r3 = r8.sendOfferEncryptionTask(r13, r0, r14)
            if (r3 == 0) goto L_0x0174
            com.whatsapp.protocol.VoipStanzaChildNode r0 = r15.A02
            if (r0 == 0) goto L_0x0088
            java.util.Map r0 = r15.A05
            java.util.Set r0 = r0.keySet()
            com.whatsapp.protocol.VoipStanzaChildNode r1 = r15.A03
            com.whatsapp.protocol.VoipStanzaChildNode[] r0 = A04(r3, r0)
            com.whatsapp.protocol.VoipStanzaChildNode r10 = A02(r1, r0)
        L_0x005e:
            X.11S r0 = r8.meManager
            boolean r0 = r0.A0N()
            if (r0 == 0) goto L_0x0143
            boolean r0 = A03(r10)
            if (r0 == 0) goto L_0x0143
            X.11Q r0 = r8.companionModeSharedPreferences
            byte[] r1 = r0.A03()
            X.C17960vV.A07(r1)
            com.whatsapp.protocol.VoipStanzaChildNode$Builder r2 = X.C40811vJ.A02(r10)
            com.whatsapp.protocol.VoipStanzaChildNode[] r0 = r10.getChildrenCopy()
            r2.addChildren(r0)
            java.lang.String r0 = "device-identity"
            com.whatsapp.protocol.VoipStanzaChildNode r0 = X.AnonymousClass8BX.A0Q(r0, r1)
            goto L_0x013c
        L_0x0088:
            r2 = 1
            int r0 = r3.size()
            boolean r1 = X.AnonymousClass000.A1T(r0, r2)
            java.lang.String r0 = "cannot have multiple encrypted messages in old format!"
            X.C17960vV.A0F(r1, r0)
            int r0 = r3.size()
            if (r0 != r2) goto L_0x00b7
            com.whatsapp.jid.Jid r0 = r15.A01
            com.whatsapp.jid.DeviceJid r0 = X.AnonymousClass1E0.A00(r0)
            X.C17960vV.A07(r0)
            java.lang.Object r2 = r3.get(r0)
            X.C17960vV.A07(r2)
            X.9r6 r2 = (X.C194059r6) r2
        L_0x00ae:
            com.whatsapp.protocol.VoipStanzaChildNode r1 = r15.A03
            byte r0 = r15.A00
            com.whatsapp.protocol.VoipStanzaChildNode r10 = A00(r2, r1, r0)
            goto L_0x005e
        L_0x00b7:
            r2 = 0
            goto L_0x00ae
        L_0x00b9:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "VoiceService:sendOfferStanza without enc (Call ID = "
            r1.append(r0)
            r1.append(r13)
            java.lang.String r0 = ", peer = "
            r1.append(r0)
            r1.append(r12)
            java.lang.String r0 = ")"
            X.C17890vO.A1A(r1, r0)
            goto L_0x0143
        L_0x00d3:
            android.util.Pair r0 = X.C20111A7t.A00(r3)
        L_0x00d7:
            byte[] r4 = X.A8G.A03(r4)
            r7 = 0
            boolean r1 = X.C18070vi.A17(r10, r0)
            com.whatsapp.protocol.VoipStanzaChildNode$Builder r2 = X.C40811vJ.A02(r10)
            com.whatsapp.protocol.VoipStanzaChildNode[] r3 = r10.getChildrenCopy()
            r2.addChildren(r3)
            java.lang.String r3 = "registration"
            com.whatsapp.protocol.VoipStanzaChildNode r3 = X.AnonymousClass8BX.A0Q(r3, r4)
            r2.addChild(r3)
            java.lang.Object r3 = r0.first
            byte[] r3 = (byte[]) r3
            java.lang.Object r0 = r0.second
            X.2eE[] r0 = (X.C54492eE[]) r0
            r5 = r0[r1]
            r6 = r0[r7]
            java.lang.String r0 = "keys"
            com.whatsapp.protocol.VoipStanzaChildNode$Builder r4 = new com.whatsapp.protocol.VoipStanzaChildNode$Builder
            r4.<init>(r0)
            java.lang.String r0 = "identity"
            com.whatsapp.protocol.VoipStanzaChildNode r0 = X.AnonymousClass8BX.A0Q(r0, r3)
            r4.addChild(r0)
            java.lang.String r0 = "type"
            com.whatsapp.protocol.VoipStanzaChildNode$Builder r3 = new com.whatsapp.protocol.VoipStanzaChildNode$Builder
            r3.<init>(r0)
            byte[] r1 = new byte[r1]
            r0 = 5
            r1[r7] = r0
            r3.setData(r1)
            com.whatsapp.protocol.VoipStanzaChildNode r0 = r3.build()
            r4.addChild(r0)
            java.lang.String r0 = "skey"
            com.whatsapp.protocol.VoipStanzaChildNode r0 = A01(r6, r0)
            r4.addChild(r0)
            java.lang.String r0 = "key"
            com.whatsapp.protocol.VoipStanzaChildNode r0 = A01(r5, r0)
            r4.addChild(r0)
            com.whatsapp.protocol.VoipStanzaChildNode r0 = r4.build()
        L_0x013c:
            r2.addChild(r0)
            com.whatsapp.protocol.VoipStanzaChildNode r10 = r2.build()
        L_0x0143:
            if (r10 == 0) goto L_0x0179
            X.A99 r3 = r8.voiceService
            X.9d6 r0 = r3.A0d
            r4 = r16
            if (r0 != 0) goto L_0x0158
            long r0 = android.os.SystemClock.elapsedRealtime()
            X.9d6 r2 = new X.9d6
            r2.<init>(r4, r0)
            r3.A0d = r2
        L_0x0158:
            X.9lr r1 = r8.callSendMethods
            X.9f5 r0 = new X.9f5
            r0.<init>(r12, r4, r13, r10)
            r1.A00(r0)
        L_0x0162:
            if (r9 == 0) goto L_0x0173
            X.A99 r0 = r8.voiceService
            X.00H r0 = r0.A3X
            java.lang.Object r1 = r0.get()
            X.6zu r1 = (X.C140076zu) r1
            java.lang.Integer r0 = X.AnonymousClass00R.A0N
            r1.A02(r0)
        L_0x0173:
            return
        L_0x0174:
            java.lang.String r0 = "VoiceService:sendOfferStanza sendOfferEcryptionTask skipped or failed"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0179:
            r8.pendingCallOfferStanza = r15
            goto L_0x0162
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.service.OutgoingSignalingHandler.m37lambda$sendOfferStanza$1$comwhatsappcallingserviceOutgoingSignalingHandler(boolean, com.whatsapp.protocol.VoipStanzaChildNode, boolean, com.whatsapp.jid.Jid, java.lang.String, java.util.Map, X.9mg, java.lang.String):void");
    }

    public void maybeSendPendingOffer(DeviceJid deviceJid, String str) {
        VoipStanzaChildNode[] voipStanzaChildNodeArr;
        C191489mg r4 = this.pendingCallOfferStanza;
        if (r4 != null) {
            String str2 = r4.A04;
            if (str2.equals(str) && r4.A05.containsKey(deviceJid)) {
                this.pendingCallOfferStanza = null;
                VoipStanzaChildNode voipStanzaChildNode = r4.A02;
                if (voipStanzaChildNode != null) {
                    ArrayList A13 = AnonymousClass000.A13();
                    VoipStanzaChildNode[] childrenCopy = voipStanzaChildNode.getChildrenCopy();
                    C17960vV.A07(childrenCopy);
                    for (VoipStanzaChildNode voipStanzaChildNode2 : childrenCopy) {
                        AnonymousClass1MD[] attributesCopy = voipStanzaChildNode2.getAttributesCopy();
                        C17960vV.A07(attributesCopy);
                        int length = attributesCopy.length;
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                break;
                            }
                            AnonymousClass1MD r1 = attributesCopy[i];
                            if ("jid".equals(r1.A02)) {
                                DeviceJid A00 = AnonymousClass1E0.A00(r1.A01);
                                if (A00 != null && !A00.equals(deviceJid)) {
                                    A13.add(voipStanzaChildNode2);
                                }
                            } else {
                                i++;
                            }
                        }
                    }
                    if (!A13.isEmpty() && (voipStanzaChildNodeArr = (VoipStanzaChildNode[]) A13.toArray(new VoipStanzaChildNode[0])) != null) {
                        sendOfferStanza(new C191489mg(r4.A01, str2, A02(r4.A03, voipStanzaChildNodeArr)));
                    }
                }
            }
        }
    }

    public void sendOfferRetryRequest(DeviceJid deviceJid) {
        String A0s = C17880vN.A0s(deviceJid, this.voiceService.A3c);
        if (A0s != null) {
            C17900vP.A0Y(deviceJid, "voip/sendOfferRetryRequest for jid:", AnonymousClass000.A10());
            this.voiceService.A3c.remove(deviceJid);
            this.voiceService.A1E.execute(new C21452AkJ(41, A0s, deviceJid));
        }
    }

    public void sendPendingCallOfferStanza(Jid jid, String str, boolean z) {
        VoipStanzaChildNode A00;
        if (str != null) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("voip/sendPendingCallOfferStanza jid=");
            A10.append(jid);
            A10.append(" callId=");
            A10.append(str);
            A10.append(" callTerminated=");
            A10.append(z);
            A10.append(" pendingCallOfferStanza=(");
            A10.append(this.pendingCallOfferStanza);
            C17900vP.A0Y(this, "), this = ", A10);
        }
        C191489mg r5 = this.pendingCallOfferStanza;
        if (r5 != null) {
            String str2 = r5.A04;
            if (str2.equals(str)) {
                Jid jid2 = r5.A01;
                Jid jid3 = jid2;
                if (jid2 instanceof DeviceJid) {
                    jid3 = ((DeviceJid) jid3).userJid;
                }
                if (jid instanceof DeviceJid) {
                    jid = ((DeviceJid) jid).userJid;
                }
                if (jid3.equals(jid)) {
                    if (z) {
                        if (r5.A02 != null) {
                            A00 = A02(r5.A03, A04((Map) null, r5.A05.keySet()));
                        } else {
                            Boolean bool = C17960vV.A01;
                            A00 = A00((C194059r6) null, r5.A03, r5.A00);
                        }
                        r5 = new C191489mg(jid2, str2, A00);
                    }
                    this.pendingCallOfferStanza = null;
                    sendOfferStanza(r5);
                }
            }
        }
    }

    public void sendPendingRekeyRequest(DeviceJid deviceJid) {
        byte byteValue;
        Number A1E = C108945cZ.A1E(deviceJid, this.voiceService.A3d);
        if (A1E != null && (byteValue = A1E.byteValue()) >= 0 && byteValue <= 4) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("voip/sendPendingRekeyRequest for jid:");
            A10.append(deviceJid);
            C17900vP.A0Y(A1E, ", retry:", A10);
            this.voiceService.A1E.execute(new C21431Ajy(deviceJid, A1E, 36));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0036, code lost:
        r2 = X.AnonymousClass1E0.A00(r2.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003c, code lost:
        if (r2 == null) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003e, code lost:
        r0 = X.C40811vJ.A03(r8, "enc");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0044, code lost:
        if (r0 != null) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0046, code lost:
        r1 = "VoiceService:sendReKeyFanoutStanza:invalid enc node";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004d, code lost:
        r0 = r0.getDataCopy();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0051, code lost:
        if (r0 != null) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0053, code lost:
        r1 = "VoiceService:sendReKeyFanoutStanza:e2e key is empty";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0056, code lost:
        r6.put(r2, r0);
        r13.voiceService.A3d.put(r2, (byte) 0);
        r3 = r3 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void sendReKeyFanoutStanza(java.lang.String r14, X.C173448v5 r15, java.lang.String r16, com.whatsapp.protocol.VoipStanzaChildNode r17) {
        /*
            r13 = this;
            java.lang.String r0 = "destination"
            r4 = r17
            com.whatsapp.protocol.VoipStanzaChildNode r1 = X.C40811vJ.A03(r4, r0)
            if (r1 == 0) goto L_0x0090
            com.whatsapp.protocol.VoipStanzaChildNode[] r0 = r1.getChildrenCopy()
            if (r0 == 0) goto L_0x0090
            java.util.HashMap r6 = X.C17880vN.A11()
            com.whatsapp.protocol.VoipStanzaChildNode[] r7 = r1.getChildrenCopy()
            int r5 = r7.length
            r12 = 0
            r3 = 0
        L_0x001b:
            if (r3 >= r5) goto L_0x006d
            r8 = r7[r3]
            X.1MD[] r11 = r8.getAttributesCopy()
            X.C17960vV.A07(r11)
            int r10 = r11.length
            r9 = 0
        L_0x0028:
            if (r9 >= r10) goto L_0x006a
            r2 = r11[r9]
            java.lang.String r1 = "jid"
            java.lang.String r0 = r2.A02
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0067
            com.whatsapp.jid.Jid r0 = r2.A01
            com.whatsapp.jid.DeviceJid r2 = X.AnonymousClass1E0.A00(r0)
            if (r2 == 0) goto L_0x006a
            java.lang.String r0 = "enc"
            com.whatsapp.protocol.VoipStanzaChildNode r0 = X.C40811vJ.A03(r8, r0)
            if (r0 != 0) goto L_0x004d
            java.lang.String r1 = "VoiceService:sendReKeyFanoutStanza:invalid enc node"
        L_0x0048:
            r0 = 0
            X.C17960vV.A0F(r0, r1)
        L_0x004c:
            return
        L_0x004d:
            byte[] r0 = r0.getDataCopy()
            if (r0 != 0) goto L_0x0056
            java.lang.String r1 = "VoiceService:sendReKeyFanoutStanza:e2e key is empty"
            goto L_0x0048
        L_0x0056:
            r6.put(r2, r0)
            X.A99 r0 = r13.voiceService
            java.util.Map r1 = r0.A3d
            java.lang.Byte r0 = java.lang.Byte.valueOf(r12)
            r1.put(r2, r0)
            int r3 = r3 + 1
            goto L_0x001b
        L_0x0067:
            int r9 = r9 + 1
            goto L_0x0028
        L_0x006a:
            java.lang.String r1 = "VoiceService:sendReKeyFanoutStanza:no device jid"
            goto L_0x0048
        L_0x006d:
            r0 = 1
            java.util.Map r3 = r13.getBulkEncryptedE2EKeys(r6, r0, r0)
            if (r3 == 0) goto L_0x004c
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x004c
            java.util.Iterator r2 = X.AnonymousClass8BU.A0x(r3)
        L_0x007e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0093
            java.lang.Object r1 = r2.next()
            X.A99 r0 = r13.voiceService
            java.util.Map r0 = r0.A3d
            r0.remove(r1)
            goto L_0x007e
        L_0x0090:
            java.lang.String r1 = "VoiceService:sendReKeyFanoutStanza:bad message format"
            goto L_0x0048
        L_0x0093:
            java.util.Set r0 = r3.keySet()
            com.whatsapp.protocol.VoipStanzaChildNode[] r0 = A04(r3, r0)
            com.whatsapp.protocol.VoipStanzaChildNode r2 = A02(r4, r0)
            X.9lr r1 = r13.callSendMethods
            X.9f5 r0 = new X.9f5
            r3 = r16
            r0.<init>(r15, r14, r3, r2)
            r1.A00(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.service.OutgoingSignalingHandler.sendReKeyFanoutStanza(java.lang.String, X.8v5, java.lang.String, com.whatsapp.protocol.VoipStanzaChildNode):void");
    }

    public void sendReKeyStanza(String str, DeviceJid deviceJid, String str2, VoipStanzaChildNode voipStanzaChildNode) {
        String str3;
        VoipStanzaChildNode A03 = C40811vJ.A03(voipStanzaChildNode, "enc");
        if (A03 == null) {
            str3 = "invalid enc node!";
        } else {
            Byte A07 = C40811vJ.A07(A03);
            if (A07 == null) {
                str3 = "invalid retry count!";
            } else {
                byte[] dataCopy = A03.getDataCopy();
                if (dataCopy == null) {
                    Log.e("VoiceService:sendReKeyStanza, e2e key is empty");
                    str3 = "e2e key is empty!";
                } else {
                    byte byteValue = A07.byteValue();
                    C194059r6 rekeyEncryptionTask = rekeyEncryptionTask(dataCopy, deviceJid, str2, byteValue);
                    if (rekeyEncryptionTask != null) {
                        VoipStanzaChildNode A00 = A00(rekeyEncryptionTask, voipStanzaChildNode, byteValue);
                        if (this.meManager.A0N() && A03(A00)) {
                            byte[] A032 = this.companionModeSharedPreferences.A03();
                            C17960vV.A07(A032);
                            VoipStanzaChildNode.Builder A02 = C40811vJ.A02(A00);
                            A02.addChildren(A00.getChildrenCopy());
                            A02.addChild(AnonymousClass8BX.A0Q("device-identity", A032));
                            A00 = A02.build();
                        }
                        this.callSendMethods.A00(new C186989f5(deviceJid, str, str2, A00));
                        return;
                    }
                    return;
                }
            }
        }
        C17960vV.A0F(false, str3);
    }

    public OutgoingSignalingHandler(AnonymousClass11P r1, C18030ve r2, AnonymousClass11S r3, AnonymousClass10I r4, A99 a99, C190999lr r6, C20111A7t a7t, AnonymousClass11Q r8, AnonymousClass1HQ r9) {
        this.time = r1;
        this.abProps = r2;
        this.meManager = r3;
        this.waWorkers = r4;
        this.voiceService = a99;
        this.callSendMethods = r6;
        this.encryptionHelper = a7t;
        this.companionModeSharedPreferences = r8;
        this.voipNative = r9;
    }

    public static VoipStanzaChildNode A00(C194059r6 r8, VoipStanzaChildNode voipStanzaChildNode, byte b) {
        VoipStanzaChildNode voipStanzaChildNode2;
        VoipStanzaChildNode.Builder A02 = C40811vJ.A02(voipStanzaChildNode);
        if (r8 != null) {
            voipStanzaChildNode2 = VoipStanzaChildNode.fromProtocolTreeNode(A83.A01(r8, b));
        } else {
            voipStanzaChildNode2 = null;
        }
        VoipStanzaChildNode[] childrenCopy = voipStanzaChildNode.getChildrenCopy();
        if (childrenCopy != null) {
            for (VoipStanzaChildNode voipStanzaChildNode3 : childrenCopy) {
                if ("enc".equals(voipStanzaChildNode3.tag)) {
                    voipStanzaChildNode3 = voipStanzaChildNode2;
                    if (voipStanzaChildNode2 == null) {
                    }
                }
                A02.addChild(voipStanzaChildNode3);
            }
        }
        return A02.build();
    }

    public static VoipStanzaChildNode A02(VoipStanzaChildNode voipStanzaChildNode, VoipStanzaChildNode[] voipStanzaChildNodeArr) {
        VoipStanzaChildNode.Builder A02 = C40811vJ.A02(voipStanzaChildNode);
        VoipStanzaChildNode[] childrenCopy = voipStanzaChildNode.getChildrenCopy();
        if (childrenCopy != null) {
            for (VoipStanzaChildNode voipStanzaChildNode2 : childrenCopy) {
                if ("destination".equals(voipStanzaChildNode2.tag)) {
                    if (voipStanzaChildNodeArr != null) {
                        VoipStanzaChildNode.Builder builder = new VoipStanzaChildNode.Builder("destination");
                        builder.addChildren(voipStanzaChildNodeArr);
                        voipStanzaChildNode2 = builder.build();
                    }
                }
                A02.addChild(voipStanzaChildNode2);
            }
        }
        return A02.build();
    }

    private C194059r6 getEncryptedE2EKey(byte[] bArr, DeviceJid deviceJid) {
        HashMap A11 = C17880vN.A11();
        A11.put(deviceJid, bArr);
        Map bulkEncryptedE2EKeys = getBulkEncryptedE2EKeys(A11, 1, false);
        if (bulkEncryptedE2EKeys != null) {
            return (C194059r6) bulkEncryptedE2EKeys.get(deviceJid);
        }
        return null;
    }

    public Map sendOfferEncryptionTask(String str, UserJid userJid, Map map) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("VoiceService:sendOfferEcryptionTask, Call ID = ");
        A10.append(str);
        C17900vP.A0Y(userJid, ", peer = ", A10);
        Map bulkEncryptedE2EKeys = getBulkEncryptedE2EKeys(map, 0, false);
        if (bulkEncryptedE2EKeys != null) {
            CallInfo BO3 = this.voipNative.BO3();
            if (BO3 != null && ((BO3.isCaller || BO3.callLinkToken != null) && BO3.callId.equals(str) && C108955ca.A0T(BO3).equals(userJid))) {
                return bulkEncryptedE2EKeys;
            }
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("VoiceService:sendOfferEcryptionTask(");
            AnonymousClass8BT.A1V(A102, str);
            A102.append(userJid);
            C17890vO.A1B(A102, ", call state does not match, do nothing)");
        }
        return null;
    }
}
