package com.whatsapp.jobqueue.job;

import X.A1O;
import X.AnonymousClass000;
import X.AnonymousClass0DT;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass11S;
import X.AnonymousClass12N;
import X.AnonymousClass1E1;
import X.AnonymousClass1HV;
import X.AnonymousClass1MR;
import X.AnonymousClass1OZ;
import X.AnonymousClass1P3;
import X.AnonymousClass1T8;
import X.AnonymousClass205;
import X.AnonymousClass231;
import X.AnonymousClass23D;
import X.AnonymousClass23F;
import X.AnonymousClass23J;
import X.AnonymousClass25B;
import X.AnonymousClass342;
import X.AnonymousClass344;
import X.AnonymousClass3EF;
import X.AnonymousClass8X8;
import X.AnonymousClass9IM;
import X.C000100c;
import X.C166418cr;
import X.C17880vN;
import X.C17890vO;
import X.C17900vP;
import X.C17960vV;
import X.C180009Kt;
import X.C18070vi;
import X.C181349Qd;
import X.C191449mc;
import X.C194589ry;
import X.C195829ty;
import X.C196049uN;
import X.C199410f;
import X.C22488B9u;
import X.C23141Ev;
import X.C24751Ln;
import X.C25581Ot;
import X.C26351Ru;
import X.C26391Ry;
import X.C28791au;
import X.C28801av;
import X.C32501hI;
import X.C42521yJ;
import X.C49352Qd;
import X.C57252im;
import X.C57612jM;
import X.C58302kT;
import X.C58762lD;
import X.C60132nR;
import X.C63962tz;
import X.C72443Lz;
import android.content.ContentValues;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.jobqueue.requirement.AxolotlPeerDeviceSessionRequirement;
import com.whatsapp.util.Log;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.whispersystems.jobqueue.Job;
import org.whispersystems.jobqueue.requirements.Requirement;

public class SendPeerMessageJob extends Job implements C22488B9u {
    public static final DeviceJid[] A0E = new DeviceJid[0];
    public static final long serialVersionUID = 1;
    public transient C32501hI A00;
    public transient AnonymousClass1P3 A01;
    public transient C25581Ot A02;
    public transient AnonymousClass12N A03;
    public transient AnonymousClass11S A04;
    public transient C26351Ru A05;
    public transient C24751Ln A06;
    public transient AnonymousClass1MR A07;
    public transient C26391Ry A08;
    public transient C57252im A09;
    public transient AnonymousClass1OZ A0A;
    public transient AnonymousClass1HV A0B;
    public transient C57612jM A0C;
    public final transient byte[] A0D;
    public final long peerMessageRowId;
    public final int retryCount;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SendPeerMessageJob(com.whatsapp.jid.DeviceJid r4, X.AnonymousClass231 r5, byte[] r6, int r7) {
        /*
            r3 = this;
            int r2 = r5.A0u
            r0 = 35
            if (r2 == r0) goto L_0x00a0
            r0 = 47
            if (r2 == r0) goto L_0x009c
            r0 = 50
            if (r2 == r0) goto L_0x0098
            r0 = 84
            if (r2 == r0) goto L_0x0095
            r0 = 101(0x65, float:1.42E-43)
            if (r2 == r0) goto L_0x0092
            r0 = 104(0x68, float:1.46E-43)
            if (r2 == r0) goto L_0x008f
            r0 = 107(0x6b, float:1.5E-43)
            if (r2 == r0) goto L_0x008c
            r0 = 38
            if (r2 == r0) goto L_0x0088
            r0 = 39
            if (r2 == r0) goto L_0x0084
            r0 = 70
            if (r2 == r0) goto L_0x0081
            r0 = 71
            if (r2 == r0) goto L_0x007e
            r0 = 75
            if (r2 == r0) goto L_0x007b
            r0 = 76
            if (r2 != r0) goto L_0x00a3
            java.lang.String r1 = "peer_data_sticker_request_response"
        L_0x0038:
            X.9lc r2 = new X.9lc
            r2.<init>()
            r0 = 1
            r2.A02 = r0
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r1)
            java.lang.String r0 = "-"
            X.AnonymousClass206.A06(r5, r0, r1)
            java.lang.String r0 = r1.toString()
            r2.A00 = r0
            X.3EB r0 = new X.3EB
            r0.<init>()
            java.util.List r1 = r2.A01
            r1.add(r0)
            com.whatsapp.jobqueue.requirement.AxolotlPeerDeviceSessionRequirement r0 = new com.whatsapp.jobqueue.requirement.AxolotlPeerDeviceSessionRequirement
            r0.<init>(r4)
            r1.add(r0)
            if (r6 == 0) goto L_0x006b
            X.3EF r0 = new X.3EF
            r0.<init>(r4, r6)
            r1.add(r0)
        L_0x006b:
            org.whispersystems.jobqueue.JobParameters r0 = r2.A00()
            r3.<init>(r0)
            long r0 = r5.A0x
            r3.peerMessageRowId = r0
            r3.A0D = r6
            r3.retryCount = r7
            return
        L_0x007b:
            java.lang.String r1 = "peer_data_link_preview_request_response"
            goto L_0x0038
        L_0x007e:
            java.lang.String r1 = "peer_data_request_unknown_response"
            goto L_0x0038
        L_0x0081:
            java.lang.String r1 = "peer_data_operation_request"
            goto L_0x0038
        L_0x0084:
            java.lang.String r1 = "syncd-key-request"
            goto L_0x0038
        L_0x0088:
            java.lang.String r1 = "syncd-key-share"
            goto L_0x0038
        L_0x008c:
            java.lang.String r1 = "peer_data_companion_meta_nonce_fetch_response"
            goto L_0x0038
        L_0x008f:
            java.lang.String r1 = "peer_data_full_history_on_demand_request_response"
            goto L_0x0038
        L_0x0092:
            java.lang.String r1 = "peer_data_waffle_nonce_fetch_response"
            goto L_0x0038
        L_0x0095:
            java.lang.String r1 = "peer_data_placeholder_resend_response"
            goto L_0x0038
        L_0x0098:
            java.lang.String r1 = "syncd-fatal-exception-notification"
            goto L_0x0038
        L_0x009c:
            java.lang.String r1 = "sync-security-settings"
            goto L_0x0038
        L_0x00a0:
            java.lang.String r1 = "device-history-sync-notification"
            goto L_0x0038
        L_0x00a3:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Cannot send message of type "
            java.lang.String r1 = X.AnonymousClass001.A1I(r0, r1, r2)
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendPeerMessageJob.<init>(com.whatsapp.jid.DeviceJid, X.231, byte[], int):void");
    }

    public void A0A() {
        String str;
        String str2;
        PhoneUserJid phoneUserJid;
        String str3;
        String str4;
        int i;
        boolean A0N = this.A04.A0N();
        if (this.A0B.A01.A2S() || A0N) {
            if (AnonymousClass11S.A00(this.A04) == null) {
                str = "SendPeerMessageJob/onRun/no my user id (unregistered?).";
            } else {
                AnonymousClass231 A022 = this.A08.A02(this.peerMessageRowId);
                if (A022 == null) {
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("SendPeerMessageJob/onRun/no message found (");
                    A10.append(this.peerMessageRowId);
                    str = AnonymousClass000.A0y(").", A10);
                } else {
                    DeviceJid deviceJid = A022.A00;
                    StringBuilder A102 = AnonymousClass000.A10();
                    A102.append("SendPeerMessageJob/onRun/start send");
                    StringBuilder A103 = AnonymousClass000.A10();
                    A103.append("; peer_msg_row_id=");
                    A102.append(C17880vN.A0u(A103, this.peerMessageRowId));
                    A102.append("; type=");
                    int i2 = A022.A0u;
                    A102.append(i2);
                    A102.append("; recipient=");
                    A102.append(deviceJid);
                    A102.append("; id=");
                    AnonymousClass205 r12 = A022.A0v;
                    String str5 = r12.A01;
                    C17890vO.A1A(A102, str5);
                    C199410f A023 = this.A07.A02();
                    if (deviceJid == null || A023.isEmpty()) {
                        str = "SendPeerMessageJob/onRun/no target device or no companion device exists.";
                    } else if (!A023.contains(deviceJid)) {
                        str = "SendPeerMessageJob/onRun/target device is not in db.";
                    } else {
                        C58762lD r13 = new C58762lD();
                        r13.A02 = deviceJid;
                        r13.A06 = "message";
                        r13.A08 = str5;
                        AnonymousClass8X8 A002 = C166418cr.A00();
                        try {
                            this.A03.A01(C181349Qd.A00(A002).A00(), A022);
                        } catch (AnonymousClass1T8 unused) {
                            C17900vP.A0X(r12, "SendPeerMessageJob/getPlaintextFromE2EForOwn/fail to build protobuf message, key=", AnonymousClass000.A10());
                        }
                        C166418cr r5 = (C166418cr) A002.A0C();
                        if (AnonymousClass25B.A00(A022) == null || this.retryCount <= 0) {
                            str2 = "text";
                        } else {
                            str2 = "pay";
                        }
                        if (i2 == 73 || !r12.A02 || !(deviceJid instanceof C42521yJ)) {
                            phoneUserJid = null;
                        } else {
                            phoneUserJid = this.A06.A0D((AnonymousClass1E1) deviceJid.userJid);
                        }
                        String A003 = this.A0C.A00(deviceJid, A022, r12);
                        C60132nR A004 = r13.A00();
                        A1O a1o = new A1O((DeviceJid) null, deviceJid, (UserJid) null, r12, A004, (String) null, (String) null, this.retryCount, i2, A022.A01, A022.A0G());
                        String str6 = A022.A0f;
                        Integer valueOf = Integer.valueOf(A022.A05);
                        if ((A022 instanceof AnonymousClass23F) || (A022 instanceof AnonymousClass23D)) {
                            str3 = "high";
                        } else {
                            str3 = null;
                        }
                        ArrayList A13 = AnonymousClass000.A13();
                        Jid jid = a1o.A06;
                        AnonymousClass205 r14 = a1o.A08;
                        if (r14.A02 || a1o.A01 == 8) {
                            str4 = "to";
                        } else {
                            str4 = "from";
                        }
                        C17960vV.A07(jid);
                        C17890vO.A0n(jid, str4, A13);
                        C17890vO.A11(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str2, A13);
                        String str7 = r14.A01;
                        C18070vi.A0X(str7);
                        C17890vO.A11(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str7, A13);
                        if (str6 != null) {
                            C17890vO.A11("phash", str6, A13);
                        }
                        DeviceJid deviceJid2 = a1o.A05;
                        if (deviceJid2 != null) {
                            C17890vO.A0n(deviceJid2, "participant", A13);
                        }
                        UserJid userJid = a1o.A07;
                        if (userJid != null) {
                            C17890vO.A0n(userJid, "recipient", A13);
                        }
                        if (phoneUserJid != null) {
                            C17890vO.A0n(phoneUserJid, "recipient_pn", A13);
                        }
                        if (A003 != null) {
                            C17890vO.A11("recipient_username", A003, A13);
                        }
                        int i3 = a1o.A01;
                        if (i3 != 0) {
                            C17890vO.A11("edit", String.valueOf(i3), A13);
                        }
                        if (!(valueOf == null || valueOf.intValue() <= 0 || a1o.A03 != 0 || i3 == 7 || i3 == 8)) {
                            C17890vO.A11("expiration", valueOf.toString(), A13);
                        }
                        if ("peer".length() != 0) {
                            C17890vO.A11("category", "peer", A13);
                        }
                        if (!(str3 == null || str3.length() == 0)) {
                            C17890vO.A11("push_priority", str3, A13);
                        }
                        a1o.A02(A13);
                        HashSet A12 = C17880vN.A12();
                        A12.add(AnonymousClass9IM.META_NODE);
                        A12.add(AnonymousClass9IM.COMMON_ENC);
                        A12.add(AnonymousClass9IM.ENC_NODE_CREATION);
                        A12.add(AnonymousClass9IM.PADDING);
                        A12.add(AnonymousClass9IM.COMPANION_MODE_ADV);
                        C196049uN r9 = new C196049uN(new AnonymousClass342(this, r5), new AnonymousClass344(this), new C191449mc((C194589ry) null));
                        C195829ty r21 = new C195829ty(C49352Qd.DISABLED, (C58302kT) null, r5, A022, (String) null, Collections.emptySet(), false, false, false, false, false, false, false);
                        for (C72443Lz r11 : this.A09.A00()) {
                            AnonymousClass9IM Ba7 = r11.Ba7();
                            if (A12.contains(Ba7)) {
                                C18070vi.A0d(Ba7, 0);
                                if (!r9.A04.contains(Ba7)) {
                                    try {
                                        r11.BLq(r9, r21, a1o);
                                    } catch (C180009Kt unused2) {
                                    }
                                }
                            }
                        }
                        this.A0A.A07(Message.obtain((Handler) null, 0, 8, 0, a1o.A01()), A004).get();
                        A022.A01 = true;
                        C26391Ry r52 = this.A08;
                        long j = A022.A0x;
                        C17960vV.A01();
                        C28791au A062 = r52.A00.A06();
                        try {
                            ContentValues A082 = C17880vN.A08();
                            C17880vN.A18(A082, "acked", 1);
                            C23141Ev r112 = ((C28801av) A062).A02;
                            String[] strArr = new String[1];
                            C17880vN.A1U(strArr, 0, j);
                            if (((long) r112.A02(A082, "peer_messages", "_id = ?", "PeerMessagesTable.SET_MESSAGE_ACKED", strArr)) == 0) {
                                C17900vP.A0l("peer-messages-store/markAckReceived/cannot set ack received for message: ", AnonymousClass000.A10(), j);
                            }
                            A062.close();
                            C17890vO.A0s(this.A05, A022, 12);
                            if (A022 instanceof AnonymousClass23J) {
                                i = ((AnonymousClass23J) A022).A03;
                            } else {
                                i = -1;
                            }
                            StringBuilder A104 = AnonymousClass000.A10();
                            A104.append("SendPeerMessageJob/onRun/end send");
                            StringBuilder A105 = AnonymousClass000.A10();
                            A105.append("; peer_msg_row_id=");
                            C17890vO.A10(C17880vN.A0u(A105, this.peerMessageRowId), "; id=", str5, A104);
                            C17900vP.A0j(" ; syncType=", A104, i);
                            return;
                        } catch (Throwable th) {
                            AnonymousClass0DT.A00(th, th);
                            throw th;
                        }
                    }
                }
            }
            Log.e(str);
            return;
        }
        Log.w("SendPeerMessageJob/onRun/wap4 disable.");
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
    }

    public void A08() {
        Set singleton;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SendPeerMessageJob/onAdded/job added=");
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("; peer_msg_row_id=");
        C17890vO.A1A(A10, C17880vN.A0u(A102, this.peerMessageRowId));
        for (Requirement requirement : this.parameters.requirements) {
            if (requirement instanceof AxolotlPeerDeviceSessionRequirement) {
                AxolotlPeerDeviceSessionRequirement axolotlPeerDeviceSessionRequirement = (AxolotlPeerDeviceSessionRequirement) requirement;
                DeviceJid A062 = DeviceJid.Companion.A06(axolotlPeerDeviceSessionRequirement.targetJidRawString);
                C17960vV.A07(A062);
                if (!axolotlPeerDeviceSessionRequirement.A01.A02().contains(A062) || axolotlPeerDeviceSessionRequirement.A00.A0b(C63962tz.A02(A062))) {
                    singleton = Collections.emptySet();
                } else {
                    singleton = Collections.singleton(A062);
                }
            } else if (requirement instanceof AnonymousClass3EF) {
                AnonymousClass3EF r3 = (AnonymousClass3EF) requirement;
                if (!r3.Bfv()) {
                    singleton = Collections.singleton(r3.A00);
                }
            }
            if (!singleton.isEmpty()) {
                this.A00.A04((DeviceJid[]) singleton.toArray(A0E), 5, false);
            }
        }
    }

    public void A09() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SendPeerMessageJob/onCanceled/cancel send job");
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("; peer_msg_row_id=");
        C17890vO.A1B(A10, C17880vN.A0u(A102, this.peerMessageRowId));
    }

    public boolean A0C(Exception exc) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SendPeerMessageJob/onShouldReply/exception while running");
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("; peer_msg_row_id=");
        C17890vO.A13(C17880vN.A0u(A102, this.peerMessageRowId), A10, exc);
        return true;
    }

    public void CIZ(Context context) {
        C000100c A0H = C17890vO.A0H(context);
        this.A04 = A0H.BA6();
        this.A0A = A0H.BAA();
        AnonymousClass10E r2 = (AnonymousClass10E) A0H;
        this.A02 = (C25581Ot) r2.A9z.get();
        this.A06 = (C24751Ln) r2.ABe.get();
        this.A08 = (C26391Ry) r2.A8N.get();
        this.A01 = (AnonymousClass1P3) r2.A9y.get();
        this.A07 = (AnonymousClass1MR) r2.ABD.get();
        this.A0B = (AnonymousClass1HV) r2.A6x.get();
        this.A00 = (C32501hI) r2.A8Y.get();
        AnonymousClass10G r1 = r2.Ao8.A00;
        this.A0C = (C57612jM) r1.A4B.get();
        this.A03 = (AnonymousClass12N) r2.A41.get();
        this.A05 = (C26351Ru) r2.A8M.get();
        this.A09 = (C57252im) r1.A3C.get();
    }

    public SendPeerMessageJob(DeviceJid deviceJid, AnonymousClass231 r4) {
        this(deviceJid, r4, (byte[]) null, 0);
    }
}
