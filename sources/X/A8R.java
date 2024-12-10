package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import java.util.Collection;
import java.util.List;

public class A8R {
    public final AnonymousClass11S A00;
    public final C26111Qw A01;
    public final AnonymousClass1U5 A02;
    public final C32981i4 A03;
    public final C18030ve A04;
    public final AnonymousClass1W6 A05;
    public final C35551mQ A06;
    public final JniBridge A07;
    public final C32541hM A08;
    public final AnonymousClass1UD A09;
    public final C26011Qm A0A;
    public final C24751Ln A0B;
    public final AnonymousClass1MB A0C;
    public final C59392mE A0D;
    public final AnonymousClass00H A0E;

    private C163738Wd A00(DeviceJid deviceJid, C166258cb r7) {
        AnonymousClass1BI r1;
        if (!(r7 == null || (r7.bitField0_ & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) == 0)) {
            C166278cd r0 = r7.contextInfo_;
            C166278cd r12 = r0;
            if (r0 == null) {
                r0 = C166278cd.DEFAULT_INSTANCE;
            }
            if ((r0.bitField0_ & 4) != 0) {
                if (r12 == null) {
                    r12 = C166278cd.DEFAULT_INSTANCE;
                }
                C23624Bmt A0O = r12.A0O();
                try {
                    C166278cd r13 = (C166278cd) A0O.A00;
                    if ((r13.bitField0_ & 2) != 0) {
                        String str = r13.participant_;
                        C22931Dv r02 = AnonymousClass1BI.A00;
                        r1 = C22931Dv.A01(str);
                    } else {
                        String str2 = r13.remoteJid_;
                        C22931Dv r03 = AnonymousClass1BI.A00;
                        r1 = C22931Dv.A01(str2);
                    }
                    if (this.A00.A0O(r1) || C42701yb.A01(r1)) {
                        boolean A0M = C22971Dz.A0M(deviceJid);
                        UserJid A022 = C22941Dw.A02(((C166278cd) A0O.A00).participant_);
                        if (A0M && A022 != null && !C22971Dz.A0T(A022) && !C22971Dz.A0M(A022)) {
                            UserJid A0F = this.A0B.A0F(A022);
                            if (A0F != null) {
                                String rawString = A0F.getRawString();
                                C166278cd A0L = AnonymousClass8BW.A0L(A0O, rawString);
                                A0L.bitField0_ |= 2;
                                A0L.participant_ = rawString;
                            } else {
                                C166278cd A0D2 = AnonymousClass8BS.A0D(A0O);
                                A0D2.bitField0_ &= -3;
                                A0D2.participant_ = C166278cd.DEFAULT_INSTANCE.participant_;
                            }
                        }
                    } else {
                        C166278cd A0D3 = AnonymousClass8BS.A0D(A0O);
                        A0D3.bitField0_ &= -2;
                        A0D3.stanzaId_ = C166278cd.DEFAULT_INSTANCE.stanzaId_;
                        C166278cd A0D4 = AnonymousClass8BS.A0D(A0O);
                        A0D4.bitField0_ &= -9;
                        A0D4.remoteJid_ = C166278cd.DEFAULT_INSTANCE.remoteJid_;
                        C166278cd A0D5 = AnonymousClass8BS.A0D(A0O);
                        A0D5.bitField0_ &= -3;
                        A0D5.participant_ = C166278cd.DEFAULT_INSTANCE.participant_;
                        C166278cd A0D6 = AnonymousClass8BS.A0D(A0O);
                        A0D6.quotedMessage_ = null;
                        A0D6.bitField0_ &= -5;
                    }
                    C163738Wd r14 = (C163738Wd) r7.A0O();
                    r14.A0G((C166278cd) A0O.A0C());
                    return r14;
                } catch (AnonymousClass11T e) {
                    Log.e("E2eMessageBuilder/clearBotExtendedTextMessageProto/Invalid jid", e);
                }
            }
        }
        return null;
    }

    public static C166418cr A01(C18030ve r6, C166418cr r7, String str, String str2) {
        C166048cG r4;
        C23624Bmt A0N = C164758a1.DEFAULT_INSTANCE.A0N();
        if (r7 != null) {
            r4 = r7.messageContextInfo_;
            if (r4 == null) {
                r4 = C166048cG.DEFAULT_INSTANCE;
            }
            AnonymousClass8X8 r0 = (AnonymousClass8X8) r7.A0O();
            C20133A8t.A09(r6, r0);
            C164758a1 r1 = (C164758a1) C17880vN.A0G(A0N);
            C166418cr A0e = AnonymousClass8BR.A0e(r0);
            A0e.getClass();
            r1.message_ = A0e;
            r1.bitField0_ |= 2;
        } else {
            r4 = null;
        }
        if (str != null) {
            C164758a1 r12 = (C164758a1) C17880vN.A0G(A0N);
            r12.bitField0_ |= 1;
            r12.destinationJid_ = str;
        }
        if (str2 != null) {
            C164758a1 r13 = (C164758a1) C17880vN.A0G(A0N);
            r13.bitField0_ |= 4;
            r13.phash_ = str2;
        }
        AnonymousClass8X8 A002 = C166418cr.A00();
        C166418cr A0M = AnonymousClass8BS.A0M(A002);
        C164758a1 r02 = (C164758a1) A0N.A0C();
        r02.getClass();
        A0M.deviceSentMessage_ = r02;
        A0M.bitField0_ |= 33554432;
        if (r4 != null) {
            A002.A0V(r4);
        }
        return AnonymousClass8BR.A0e(A002);
    }

    public static C166418cr A02(C166418cr r5, int i) {
        C23624Bmt A0N = C166418cr.DEFAULT_INSTANCE.A0N();
        A0N.A0F(r5);
        AnonymousClass8X8 r4 = (AnonymousClass8X8) A0N;
        C18070vi.A0d(r4, 0);
        C163938Wx r3 = (C163938Wx) r4.A0G().A0O();
        C23581BmB A012 = DSQ.A01(AnonymousClass8BV.A1a(i), 0, i);
        C166048cG r1 = (C166048cG) C17880vN.A0G(r3);
        int i2 = C166048cG.BOT_MESSAGE_SECRET_FIELD_NUMBER;
        r1.bitField0_ |= 8;
        r1.paddingBytes_ = A012;
        r4.A0U(r3);
        return AnonymousClass8BR.A0e(r4);
    }

    public static C166418cr A03(C166418cr r3, AnonymousClass206 r4) {
        if (r4 == null || r4.A0I() == null || !AnonymousClass000.A1O(r3.bitField0_ & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH) || (AnonymousClass8BS.A0I(r3).bitField0_ & 1) == 0) {
            return r3;
        }
        AnonymousClass8X8 r32 = (AnonymousClass8X8) r3.A0O();
        C166368cm r0 = ((C166418cr) r32.A00).protocolMessage_;
        if (r0 == null) {
            r0 = C166368cm.DEFAULT_INSTANCE;
        }
        C23624Bmt A0O = r0.A0O();
        C166368cm r02 = ((C166418cr) r32.A00).protocolMessage_;
        if (r02 == null) {
            r02 = C166368cm.DEFAULT_INSTANCE;
        }
        C166408cq r03 = r02.key_;
        if (r03 == null) {
            r03 = C166408cq.DEFAULT_INSTANCE;
        }
        AnonymousClass8X7 A0f = AnonymousClass8BR.A0f(r03);
        A0f.A0K(false);
        AnonymousClass8X7.A01(r4.A0I(), A0f);
        C166408cq A0Z = AnonymousClass8BU.A0Z(A0f, A0O);
        C166368cm r1 = (C166368cm) A0O.A00;
        A0Z.getClass();
        r1.key_ = A0Z;
        r1.bitField0_ |= 1;
        r32.A0O((C166368cm) A0O.A0C());
        return AnonymousClass8BR.A0e(r32);
    }

    private String A04(AnonymousClass205 r8) {
        AnonymousClass206 A052;
        DeviceJid A002;
        UserJid userJid;
        C59392mE r6 = this.A0D;
        AnonymousClass205 A012 = r6.A01(r8);
        AnonymousClass1W2 r5 = this.A05.A01;
        AnonymousClass206 A053 = r5.A05(A012);
        if (A053 != null) {
            C692036h r0 = this.A08.A00(A053.A0x).A03;
            if (r0 == null || (userJid = r0.A00) == null) {
                AnonymousClass206 A0K = A053.A0K();
                if (!(A0K == null || (A052 = r5.A05(r6.A01(A0K.A0v))) == null || (A002 = this.A0A.A00(A052)) == null)) {
                    UserJid userJid2 = A002.userJid;
                    if (!this.A00.A0O(userJid2)) {
                        return C22971Dz.A06(userJid2);
                    }
                }
            } else if (!this.A00.A0O(userJid)) {
                return userJid.getRawString();
            }
        }
        return null;
    }

    public static boolean A06(AnonymousClass206 r1) {
        if (r1 == null || C42701yb.A01(r1.A0v.A00) || !C42701yb.A01(r1.A0I())) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01d6, code lost:
        if (X.C18020vd.A05(r4, r6, 9924) != false) goto L_0x01e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0201, code lost:
        if (X.C18020vd.A05(r4, r6, 9924) == false) goto L_0x0203;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C166418cr A08(com.whatsapp.jid.DeviceJid r29, X.C166418cr r30, X.AnonymousClass206 r31, X.AnonymousClass205 r32, java.lang.String r33) {
        /*
            r28 = this;
            r1 = r30
            r5 = r28
            X.11S r7 = r5.A00
            r6 = r29
            com.whatsapp.jid.UserJid r0 = r6.userJid
            boolean r0 = r7.A0O(r0)
            r2 = r31
            r3 = r32
            if (r0 == 0) goto L_0x0049
            X.1BI r0 = r3.A00
            boolean r0 = X.C22971Dz.A0O(r0)
            if (r0 == 0) goto L_0x0046
            X.1Qw r0 = r5.A01
            java.util.Set r0 = r0.A03(r3)
            java.util.HashSet r6 = X.C17880vN.A12()
            java.util.Iterator r4 = r0.iterator()
        L_0x002a:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0295
            java.lang.Object r0 = r4.next()
            com.whatsapp.jid.DeviceJid r0 = (com.whatsapp.jid.DeviceJid) r0
            com.whatsapp.jid.UserJid r3 = r0.userJid
            boolean r0 = r7.A0O(r3)
            if (r0 != 0) goto L_0x002a
            com.whatsapp.jid.DeviceJid r0 = r3.getPrimaryDevice()
            r6.add(r0)
            goto L_0x002a
        L_0x0046:
            r3 = 0
            goto L_0x0299
        L_0x0049:
            int r0 = r1.bitField1_
            r7 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r7
            boolean r0 = X.AnonymousClass000.A1O(r0)
            if (r0 == 0) goto L_0x0169
            com.whatsapp.jid.UserJid r0 = r6.userJid
            boolean r0 = X.C42701yb.A01(r0)
            if (r0 == 0) goto L_0x0169
            X.Bmt r3 = r1.A0O()
            X.8X8 r3 = (X.AnonymousClass8X8) r3
            X.Bm6 r4 = r3.A00
            X.8cr r4 = (X.C166418cr) r4
            int r0 = r4.bitField1_
            r0 = r0 & r7
            boolean r0 = X.AnonymousClass000.A1O(r0)
            if (r0 == 0) goto L_0x00c1
            X.8Xc r0 = r4.botInvokeMessage_
            if (r0 != 0) goto L_0x0075
            X.8Xc r0 = X.C163988Xc.DEFAULT_INSTANCE
        L_0x0075:
            int r0 = r0.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x00c1
            int r4 = r4.bitField0_
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            r4 = r4 & r0
            boolean r0 = X.AnonymousClass000.A1O(r4)
            if (r0 != 0) goto L_0x008c
            java.lang.String r0 = "E2eMessageBuilder/createMessageForBot/E2E.Message doesn't have MessageContextInfo"
        L_0x0088:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r1
        L_0x008c:
            X.8cG r0 = r3.A0G()
            int r0 = r0.bitField0_
            r0 = r0 & 4
            if (r0 == 0) goto L_0x00be
            X.8cG r0 = r3.A0G()
            X.Bmt r4 = r0.A0O()
            X.8Wx r4 = (X.C163938Wx) r4
            com.whatsapp.wamsys.JniBridge r7 = r5.A07
            X.Bm6 r0 = r4.A00
            X.8cG r0 = (X.C166048cG) r0
            X.DSQ r0 = r0.messageSecret_
            byte[] r0 = r0.A06()
            X.2pN r0 = r7.WCMMessageSecretAPICreateWithSerialized(r0)
            if (r0 != 0) goto L_0x00b5
            java.lang.String r0 = "E2eMessageBuilder/createMessageForBot/MessageSecret is null"
            goto L_0x0088
        L_0x00b5:
            X.2bT r0 = r7.WcmBotMessageSecretAPICreateWithMessageSecret(r0)
            if (r0 != 0) goto L_0x00c4
            java.lang.String r0 = "E2eMessageBuilder/createMessageForBot/BotMessageSecret is null"
            goto L_0x0088
        L_0x00be:
            java.lang.String r0 = "E2eMessageBuilder/createMessageForBot/E2E.Message doesn't have MessageSecret"
            goto L_0x0088
        L_0x00c1:
            java.lang.String r0 = "E2eMessageBuilder/createMessageForBot/E2E.Message doesn't have BotInvokeMessage"
            goto L_0x0088
        L_0x00c4:
            com.whatsapp.wamsys.JniBridge.getInstance()
            com.facebook.simplejni.NativeHolder r8 = r0.A00
            r7 = 0
            r0 = 63
            java.lang.Object r0 = com.whatsapp.wamsys.JniBridge.jvidispatchOIO(r7, r0, r8)
            byte[] r0 = (byte[]) r0
            X.BmB r7 = X.AnonymousClass8BU.A0A(r4, r0, r7)
            X.Bm6 r1 = r4.A00
            X.8cG r1 = (X.C166048cG) r1
            int r0 = r1.bitField0_
            r0 = r0 | 32
            r1.bitField0_ = r0
            r1.botMessageSecret_ = r7
            X.Bm6 r1 = X.C17880vN.A0G(r4)
            X.8cG r1 = (X.C166048cG) r1
            int r0 = r1.bitField0_
            r0 = r0 & -5
            r1.bitField0_ = r0
            X.8cG r0 = X.C166048cG.DEFAULT_INSTANCE
            X.DSQ r0 = r0.messageSecret_
            r1.messageSecret_ = r0
            com.whatsapp.jid.UserJid r0 = r6.userJid
            r5.A09(r0, r4, r2)
            r5.A0A(r4, r2)
            X.AnonymousClass8X8.A05(r4, r3)
            X.Bm6 r0 = r3.A00
            X.8cr r0 = (X.C166418cr) r0
            X.8Xc r0 = r0.botInvokeMessage_
            if (r0 != 0) goto L_0x0109
            X.8Xc r0 = X.C163988Xc.DEFAULT_INSTANCE
        L_0x0109:
            X.8cr r0 = r0.message_
            if (r0 != 0) goto L_0x010f
            X.8cr r0 = X.C166418cr.DEFAULT_INSTANCE
        L_0x010f:
            X.8cb r0 = r0.extendedTextMessage_
            if (r0 != 0) goto L_0x0115
            X.8cb r0 = X.C166258cb.DEFAULT_INSTANCE
        L_0x0115:
            X.8Wd r1 = r5.A00(r6, r0)
            if (r1 == 0) goto L_0x0164
            X.Bm6 r0 = r3.A00
            X.8cr r0 = (X.C166418cr) r0
            X.8Xc r0 = r0.botInvokeMessage_
            if (r0 != 0) goto L_0x0125
            X.8Xc r0 = X.C163988Xc.DEFAULT_INSTANCE
        L_0x0125:
            X.8cr r0 = r0.message_
            if (r0 != 0) goto L_0x012b
            X.8cr r0 = X.C166418cr.DEFAULT_INSTANCE
        L_0x012b:
            X.Bmt r2 = r0.A0O()
            X.8X8 r2 = (X.AnonymousClass8X8) r2
            X.Bm6 r0 = r1.A0C()
            X.8cb r0 = (X.C166258cb) r0
            X.8cr r1 = X.AnonymousClass8X8.A04(r2, r0)
            r1.extendedTextMessage_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 32
            r1.bitField0_ = r0
            X.Bm6 r0 = r3.A00
            X.8cr r0 = (X.C166418cr) r0
            X.8Xc r0 = r0.botInvokeMessage_
            if (r0 != 0) goto L_0x014d
            X.8Xc r0 = X.C163988Xc.DEFAULT_INSTANCE
        L_0x014d:
            X.Bmt r0 = r0.A0O()
            X.8X6 r0 = (X.AnonymousClass8X6) r0
            X.8Xc r0 = X.AnonymousClass8X6.A01(r2, r0)
            X.8cr r2 = X.AnonymousClass8BV.A0J(r3, r0)
            r2.botInvokeMessage_ = r0
            int r1 = r2.bitField1_
            r0 = 4194304(0x400000, float:5.877472E-39)
            r1 = r1 | r0
            r2.bitField1_ = r1
        L_0x0164:
            X.8cr r1 = X.AnonymousClass8BR.A0e(r3)
            return r1
        L_0x0169:
            X.1BI r4 = r3.A00
            boolean r0 = X.C42701yb.A01(r4)
            if (r0 == 0) goto L_0x01a2
            X.Bmt r3 = r1.A0O()
            X.8X8 r3 = (X.AnonymousClass8X8) r3
            X.Bm6 r0 = r3.A00
            X.8cr r0 = (X.C166418cr) r0
            X.8cb r0 = r0.extendedTextMessage_
            if (r0 != 0) goto L_0x0181
            X.8cb r0 = X.C166258cb.DEFAULT_INSTANCE
        L_0x0181:
            X.8Wd r0 = r5.A00(r6, r0)
            if (r0 == 0) goto L_0x019d
            X.Bm6 r0 = r0.A0C()
            X.8cb r0 = (X.C166258cb) r0
            X.8cr r1 = X.AnonymousClass8X8.A04(r3, r0)
            r1.extendedTextMessage_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 32
            r1.bitField0_ = r0
            X.8cr r1 = X.AnonymousClass8BR.A0e(r3)
        L_0x019d:
            X.8cr r1 = r5.A07(r4, r1, r2)
            return r1
        L_0x01a2:
            com.whatsapp.jid.UserJid r0 = r6.userJid
            boolean r0 = X.C42701yb.A01(r0)
            if (r0 == 0) goto L_0x01b1
            com.whatsapp.jid.UserJid r0 = r6.userJid
            X.8cr r1 = r5.A07(r0, r1, r2)
            return r1
        L_0x01b1:
            boolean r0 = A06(r2)
            if (r0 == 0) goto L_0x01bc
            X.8cr r1 = A03(r1, r2)
            return r1
        L_0x01bc:
            X.1MB r0 = r5.A0C
            boolean r0 = r0.A02(r4)
            if (r0 == 0) goto L_0x01d8
            X.0ve r6 = r5.A04
            r0 = 9942(0x26d6, float:1.3932E-41)
            X.0vf r4 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r4, r6, r0)
            if (r0 == 0) goto L_0x01d8
            r0 = 9924(0x26c4, float:1.3906E-41)
            boolean r0 = X.C18020vd.A05(r4, r6, r0)
            if (r0 != 0) goto L_0x01e4
        L_0x01d8:
            X.0ve r6 = r5.A04
            r0 = 10609(0x2971, float:1.4866E-41)
            X.0vf r4 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r4, r6, r0)
            if (r0 == 0) goto L_0x0302
        L_0x01e4:
            X.Bmt r3 = r1.A0O()
            X.8X8 r3 = (X.AnonymousClass8X8) r3
            X.8cG r0 = r3.A0G()
            X.Bmt r2 = r0.A0O()
            r0 = 9942(0x26d6, float:1.3932E-41)
            boolean r0 = X.C18020vd.A05(r4, r6, r0)
            if (r0 == 0) goto L_0x0203
            r0 = 9924(0x26c4, float:1.3906E-41)
            boolean r0 = X.C18020vd.A05(r4, r6, r0)
            r8 = 1
            if (r0 != 0) goto L_0x0204
        L_0x0203:
            r8 = 0
        L_0x0204:
            r0 = 10609(0x2971, float:1.4866E-41)
            boolean r7 = X.C18020vd.A05(r4, r6, r0)
            X.1mQ r9 = r5.A06
            r0 = 1
            long[] r6 = new long[r0]
            r4 = 1
            X.7El r1 = new X.7El
            r1.<init>(r6, r9, r0)
            X.1NM r0 = r9.A07
            boolean r0 = r0.A03(r1)
            r5 = 0
            if (r0 == 0) goto L_0x0226
            X.11Z r0 = r9.A0B
            long r0 = r0.A01()
            r6[r5] = r0
        L_0x0226:
            X.118 r0 = r9.A09
            android.content.Context r10 = r0.A00
            r21 = r6[r5]
            X.11Z r0 = r9.A0B
            long r23 = r0.A02()
            java.lang.String r16 = android.os.Environment.getExternalStorageState()
            X.1mP r0 = r9.A0D
            android.util.Pair r11 = r0.A00()
            r12 = 0
            java.lang.String r13 = "supportPayload"
            r15 = r12
            r17 = r12
            r18 = r12
            r19 = r12
            r20 = r12
            r26 = r4
            r27 = r4
            r14 = r12
            r25 = r4
            java.lang.String r1 = r9.A04(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r23, r25, r26, r27)
            r0 = 2
            X.C18070vi.A0d(r1, r0)
            org.json.JSONObject r5 = X.C17880vN.A15()
            java.lang.String r0 = "version"
            r5.put(r0, r4)
            if (r8 == 0) goto L_0x0272
            org.json.JSONObject r1 = X.C17880vN.A16(r1)     // Catch:{ JSONException -> 0x026c }
            java.lang.String r0 = "debug_information"
            r5.put(r0, r1)     // Catch:{ JSONException -> 0x026c }
            goto L_0x0272
        L_0x026c:
            r1 = move-exception
            java.lang.String r0 = "SupportProtobuf: invalid JSON String for debugInfo"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0272:
            if (r7 == 0) goto L_0x0279
            java.lang.String r0 = "citations_carousel"
            r5.put(r0, r4)
        L_0x0279:
            java.lang.String r4 = X.C18070vi.A0H(r5)
            X.Bm6 r1 = X.C17880vN.A0G(r2)
            X.8cG r1 = (X.C166048cG) r1
            int r0 = X.C166048cG.BOT_MESSAGE_SECRET_FIELD_NUMBER
            int r0 = r1.bitField0_
            r0 = r0 | 2048(0x800, float:2.87E-42)
            r1.bitField0_ = r0
            r1.supportPayload_ = r4
            X.AnonymousClass8X8.A05(r2, r3)
            X.8cr r1 = X.AnonymousClass8BR.A0e(r3)
            return r1
        L_0x0295:
            java.lang.String r3 = X.C63442t5.A03(r6)
        L_0x0299:
            X.0ve r0 = r5.A04
            r4 = r33
            X.8cr r1 = A01(r0, r1, r4, r3)
            boolean r0 = A06(r2)
            if (r0 == 0) goto L_0x0302
            if (r31 == 0) goto L_0x0302
            int r0 = r1.bitField0_
            r5 = 33554432(0x2000000, float:9.403955E-38)
            r0 = r0 & r5
            boolean r0 = X.AnonymousClass000.A1O(r0)
            if (r0 == 0) goto L_0x0302
            X.8a1 r0 = r1.deviceSentMessage_
            if (r0 != 0) goto L_0x02ba
            X.8a1 r0 = X.C164758a1.DEFAULT_INSTANCE
        L_0x02ba:
            int r0 = r0.bitField0_
            r0 = r0 & 2
            if (r0 == 0) goto L_0x0302
            X.Bmt r4 = r1.A0O()
            X.8a1 r0 = r1.deviceSentMessage_
            if (r0 != 0) goto L_0x02ca
            X.8a1 r0 = X.C164758a1.DEFAULT_INSTANCE
        L_0x02ca:
            X.8cr r0 = r0.message_
            if (r0 != 0) goto L_0x02d0
            X.8cr r0 = X.C166418cr.DEFAULT_INSTANCE
        L_0x02d0:
            X.8cr r3 = A03(r0, r2)
            X.8a1 r0 = r1.deviceSentMessage_
            if (r0 != 0) goto L_0x02da
            X.8a1 r0 = X.C164758a1.DEFAULT_INSTANCE
        L_0x02da:
            X.Bmt r2 = X.AnonymousClass8BS.A07(r0)
            X.Bm6 r1 = r2.A00
            X.8a1 r1 = (X.C164758a1) r1
            r3.getClass()
            r1.message_ = r3
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
            X.Bm6 r0 = r2.A0C()
            X.8a1 r0 = (X.C164758a1) r0
            X.8cr r1 = X.AnonymousClass8BV.A0J(r4, r0)
            r1.deviceSentMessage_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | r5
            r1.bitField0_ = r0
            X.8cr r1 = X.AnonymousClass8BR.A0e(r4)
        L_0x0302:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A8R.A08(com.whatsapp.jid.DeviceJid, X.8cr, X.206, X.205, java.lang.String):X.8cr");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01a2, code lost:
        if (X.C18020vd.A05(r1, r3, 10986) == false) goto L_0x01a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01b4, code lost:
        if (X.C18020vd.A05(r1, r3, 10886) == false) goto L_0x01b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01c8, code lost:
        if (X.C18020vd.A05(r1, r3, 12303) == false) goto L_0x01ca;
     */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0228  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0238 A[LOOP:0: B:82:0x0232->B:84:0x0238, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A09(com.whatsapp.jid.UserJid r12, X.C163938Wx r13, X.AnonymousClass206 r14) {
        /*
            r11 = this;
            X.00H r0 = r11.A0E
            java.lang.Object r1 = r0.get()
            X.1PW r1 = (X.AnonymousClass1PW) r1
            r0 = 0
            X.C18070vi.A0d(r12, r0)
            X.00H r0 = r1.A02
            java.lang.Object r0 = r0.get()
            X.1Pl r0 = (X.C25741Pl) r0
            X.24e r0 = r0.A00(r12)
            if (r0 == 0) goto L_0x00b8
            java.lang.String r3 = r0.A0F
        L_0x001c:
            boolean r0 = X.AnonymousClass1EG.A0H(r3)
            if (r0 != 0) goto L_0x02b1
            X.Bm6 r0 = r13.A00
            X.8cG r0 = (X.C166048cG) r0
            X.8cN r1 = r0.botMetadata_
            if (r1 != 0) goto L_0x002c
            X.8cN r1 = X.C166118cN.DEFAULT_INSTANCE
        L_0x002c:
            X.8cN r0 = X.C166118cN.DEFAULT_INSTANCE
            X.Bmt r2 = r0.A0N()
            r2.A0F(r1)
            X.Bm6 r1 = X.C17880vN.A0G(r2)
            X.8cN r1 = (X.C166118cN) r1
            r3.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
            r1.personaId_ = r3
            if (r14 == 0) goto L_0x02a8
            java.lang.Class<X.Ac9> r0 = X.C20955Ac9.class
            X.25F r0 = X.C18070vi.A09(r14, r0)
            X.229 r5 = r0.A02
            X.Ac9 r5 = (X.C20955Ac9) r5
            if (r5 == 0) goto L_0x0099
            X.8aj r0 = X.C165188aj.DEFAULT_INSTANCE
            X.Bmt r4 = r0.A0N()
            java.lang.Integer r0 = r5.A01
            if (r0 == 0) goto L_0x0070
            int r3 = r0.intValue()
            X.Bm6 r1 = X.C17880vN.A0G(r4)
            X.8aj r1 = (X.C165188aj) r1
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            r1.selectedPromptIndex_ = r3
        L_0x0070:
            java.lang.String r3 = r5.A02
            if (r3 == 0) goto L_0x0082
            X.Bm6 r1 = X.C17880vN.A0G(r4)
            X.8aj r1 = (X.C165188aj) r1
            int r0 = r1.bitField0_
            r0 = r0 | 4
            r1.bitField0_ = r0
            r1.selectedPromptId_ = r3
        L_0x0082:
            X.Bm6 r0 = r4.A0C()
            X.8aj r0 = (X.C165188aj) r0
            X.Bm6 r1 = X.C17880vN.A0G(r2)
            X.8cN r1 = (X.C166118cN) r1
            r0.getClass()
            r1.suggestedPromptMetadata_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 8
            r1.bitField0_ = r0
        L_0x0099:
            X.Ac3 r0 = X.AnonymousClass9RU.A00(r14)
            if (r0 == 0) goto L_0x00b4
            X.8Yp r0 = r0.A00()
            X.Bm6 r1 = X.C17880vN.A0G(r2)
            X.8cN r1 = (X.C166118cN) r1
            r0.getClass()
            r1.searchMetadata_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 32
            r1.bitField0_ = r0
        L_0x00b4:
            java.lang.Class<X.9Mg> r1 = X.C180369Mg.class
            monitor-enter(r1)
            goto L_0x00bb
        L_0x00b8:
            r3 = 0
            goto L_0x001c
        L_0x00bb:
            java.lang.Class<X.Abz> r0 = X.C20945Abz.class
            X.25F r0 = r14.A0M(r0)     // Catch:{ all -> 0x028e }
            X.229 r5 = r0.A02     // Catch:{ all -> 0x028e }
            X.Abz r5 = (X.C20945Abz) r5     // Catch:{ all -> 0x028e }
            monitor-exit(r1)
            if (r5 == 0) goto L_0x0142
            X.8Yl r0 = X.C164338Yl.DEFAULT_INSTANCE
            X.Bmt r4 = r0.A0N()
            java.lang.String r3 = r5.A01
            X.Bm6 r1 = X.C17880vN.A0G(r4)
            X.8Yl r1 = (X.C164338Yl) r1
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            r1.destinationId_ = r3
            java.lang.Integer r0 = r5.A00
            int r0 = r0.intValue()
            switch(r0) {
                case 0: goto L_0x00ec;
                case 1: goto L_0x00ef;
                case 2: goto L_0x00f2;
                case 3: goto L_0x00f5;
                case 4: goto L_0x00f8;
                case 5: goto L_0x00fb;
                case 6: goto L_0x00fe;
                case 7: goto L_0x0101;
                case 8: goto L_0x0104;
                case 9: goto L_0x0107;
                case 10: goto L_0x010a;
                case 11: goto L_0x010d;
                case 12: goto L_0x0110;
                case 13: goto L_0x0113;
                case 14: goto L_0x0116;
                case 15: goto L_0x0119;
                default: goto L_0x00e7;
            }
        L_0x00e7:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x00ec:
            X.9KH r0 = X.AnonymousClass9KH.FAVICON
            goto L_0x011b
        L_0x00ef:
            X.9KH r0 = X.AnonymousClass9KH.CHATLIST
            goto L_0x011b
        L_0x00f2:
            X.9KH r0 = X.AnonymousClass9KH.AISEARCH_NULL_STATE_PAPER_PLANE
            goto L_0x011b
        L_0x00f5:
            X.9KH r0 = X.AnonymousClass9KH.AISEARCH_NULL_STATE_SUGGESTION
            goto L_0x011b
        L_0x00f8:
            X.9KH r0 = X.AnonymousClass9KH.AISEARCH_TYPE_AHEAD_SUGGESTION
            goto L_0x011b
        L_0x00fb:
            X.9KH r0 = X.AnonymousClass9KH.AISEARCH_TYPE_AHEAD_PAPER_PLANE
            goto L_0x011b
        L_0x00fe:
            X.9KH r0 = X.AnonymousClass9KH.AISEARCH_TYPE_AHEAD_RESULT_CHATLIST
            goto L_0x011b
        L_0x0101:
            X.9KH r0 = X.AnonymousClass9KH.AISEARCH_TYPE_AHEAD_RESULT_MESSAGES
            goto L_0x011b
        L_0x0104:
            X.9KH r0 = X.AnonymousClass9KH.AIVOICE_SEARCH_BAR
            goto L_0x011b
        L_0x0107:
            X.9KH r0 = X.AnonymousClass9KH.AIVOICE_FAVICON
            goto L_0x011b
        L_0x010a:
            X.9KH r0 = X.AnonymousClass9KH.AISTUDIO
            goto L_0x011b
        L_0x010d:
            X.9KH r0 = X.AnonymousClass9KH.DEEPLINK
            goto L_0x011b
        L_0x0110:
            X.9KH r0 = X.AnonymousClass9KH.NOTIFICATION
            goto L_0x011b
        L_0x0113:
            X.9KH r0 = X.AnonymousClass9KH.PROFILE_MESSAGE_BUTTON
            goto L_0x011b
        L_0x0116:
            X.9KH r0 = X.AnonymousClass9KH.FORWARD
            goto L_0x011b
        L_0x0119:
            X.9KH r0 = X.AnonymousClass9KH.APP_SHORTCUT
        L_0x011b:
            X.Bm6 r1 = X.C17880vN.A0G(r4)
            X.8Yl r1 = (X.C164338Yl) r1
            int r0 = r0.value
            r1.destinationEntryPoint_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
            X.Bm6 r0 = r4.A0C()
            X.8Yl r0 = (X.C164338Yl) r0
            X.Bm6 r1 = X.C17880vN.A0G(r2)
            X.8cN r1 = (X.C166118cN) r1
            r0.getClass()
            r1.botMetricsMetadata_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 16384(0x4000, float:2.2959E-41)
            r1.bitField0_ = r0
        L_0x0142:
            java.lang.Class<X.Aby> r0 = X.C20944Aby.class
            X.25F r0 = r14.A0M(r0)
            X.229 r1 = r0.A02
            X.Aby r1 = (X.C20944Aby) r1
            if (r1 == 0) goto L_0x0189
            X.8Ym r0 = X.C164348Ym.DEFAULT_INSTANCE
            X.Bmt r3 = r0.A0N()
            X.9IU r0 = r1.A00
            int r1 = r0.ordinal()
            r0 = 0
            if (r1 == r0) goto L_0x0285
            r0 = 1
            if (r1 != r0) goto L_0x0289
            X.9JY r0 = X.AnonymousClass9JY.LLAMA_PROD_PREMIUM
        L_0x0162:
            X.Bm6 r1 = X.C17880vN.A0G(r3)
            X.8Ym r1 = (X.C164348Ym) r1
            int r0 = r0.value
            r1.modelType_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            X.Bm6 r0 = r3.A0C()
            X.8Ym r0 = (X.C164348Ym) r0
            X.Bm6 r1 = X.C17880vN.A0G(r2)
            X.8cN r1 = (X.C166118cN) r1
            r0.getClass()
            r1.modelMetadata_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 128(0x80, float:1.794E-43)
            r1.bitField0_ = r0
        L_0x0189:
            X.1UD r4 = r11.A09
            boolean r10 = r4.A03()
            X.0ve r3 = r4.A00
            X.0vf r1 = X.C18040vf.A01
            r0 = 12539(0x30fb, float:1.7571E-41)
            boolean r0 = X.C18020vd.A05(r1, r3, r0)
            if (r0 == 0) goto L_0x01a4
            r0 = 10986(0x2aea, float:1.5395E-41)
            boolean r0 = X.C18020vd.A05(r1, r3, r0)
            r9 = 1
            if (r0 != 0) goto L_0x01a5
        L_0x01a4:
            r9 = 0
        L_0x01a5:
            r0 = 12539(0x30fb, float:1.7571E-41)
            boolean r0 = X.C18020vd.A05(r1, r3, r0)
            if (r0 == 0) goto L_0x01b6
            r0 = 10886(0x2a86, float:1.5255E-41)
            boolean r0 = X.C18020vd.A05(r1, r3, r0)
            r8 = 1
            if (r0 != 0) goto L_0x01b7
        L_0x01b6:
            r8 = 0
        L_0x01b7:
            boolean r7 = r4.A0D()
            boolean r0 = r4.A04()
            if (r0 == 0) goto L_0x01ca
            r0 = 12303(0x300f, float:1.724E-41)
            boolean r0 = X.C18020vd.A05(r1, r3, r0)
            r5 = 1
            if (r0 != 0) goto L_0x01cb
        L_0x01ca:
            r5 = 0
        L_0x01cb:
            r0 = 12074(0x2f2a, float:1.6919E-41)
            int r3 = X.C18020vd.A00(r1, r3, r0)
            X.8XR r0 = X.AnonymousClass8XR.DEFAULT_INSTANCE
            X.Bmt r6 = r0.A0N()
            java.util.ArrayList r1 = X.AnonymousClass000.A13()
            X.9KI r4 = X.AnonymousClass9KI.PROGRESS_INDICATOR
            X.Ats r0 = new X.Ats
            r0.<init>(r10)
            A05(r4, r1, r0)
            X.9KI r4 = X.AnonymousClass9KI.RICH_RESPONSE_HEADING
            X.Att r0 = new X.Att
            r0.<init>(r9)
            A05(r4, r1, r0)
            X.9KI r4 = X.AnonymousClass9KI.RICH_RESPONSE_NESTED_LIST
            X.Atu r0 = new X.Atu
            r0.<init>(r8)
            A05(r4, r1, r0)
            X.9KI r4 = X.AnonymousClass9KI.AI_MEMORY
            X.Atv r0 = new X.Atv
            r0.<init>(r7)
            A05(r4, r1, r0)
            X.9KI r4 = X.AnonymousClass9KI.RICH_RESPONSE_CODE
            X.Atw r0 = new X.Atw
            r0.<init>(r5)
            A05(r4, r1, r0)
            r0 = 0
            if (r3 != r0) goto L_0x0246
            X.9KI r0 = X.AnonymousClass9KI.WA_IG_1P_PLUGIN_RANKING_CONTROL
        L_0x0212:
            r1.add(r0)
        L_0x0215:
            java.util.ArrayList r3 = X.C29431cG.A0m(r1)
            X.Bm6 r4 = X.C17880vN.A0G(r6)
            X.8XR r4 = (X.AnonymousClass8XR) r4
            X.EDj r1 = r4.capabilities_
            r0 = r1
            X.DbR r0 = (X.C27296DbR) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x022e
            X.Bm7 r0 = X.C23577Bm6.A08(r1)
            r4.capabilities_ = r0
        L_0x022e:
            java.util.Iterator r3 = r3.iterator()
        L_0x0232:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0291
            java.lang.Object r0 = r3.next()
            X.9KI r0 = (X.AnonymousClass9KI) r0
            X.EDj r1 = r4.capabilities_
            int r0 = r0.value
            r1.BBE(r0)
            goto L_0x0232
        L_0x0246:
            r0 = 1
            if (r3 != r0) goto L_0x024c
            X.9KI r0 = X.AnonymousClass9KI.WA_IG_1P_PLUGIN_RANKING_UPDATE_1
            goto L_0x0212
        L_0x024c:
            r0 = 2
            if (r3 != r0) goto L_0x0252
            X.9KI r0 = X.AnonymousClass9KI.WA_IG_1P_PLUGIN_RANKING_UPDATE_2
            goto L_0x0212
        L_0x0252:
            r0 = 3
            if (r3 != r0) goto L_0x0258
            X.9KI r0 = X.AnonymousClass9KI.WA_IG_1P_PLUGIN_RANKING_UPDATE_3
            goto L_0x0212
        L_0x0258:
            r0 = 4
            if (r3 != r0) goto L_0x025e
            X.9KI r0 = X.AnonymousClass9KI.WA_IG_1P_PLUGIN_RANKING_UPDATE_4
            goto L_0x0212
        L_0x025e:
            r0 = 5
            if (r3 != r0) goto L_0x0264
            X.9KI r0 = X.AnonymousClass9KI.WA_IG_1P_PLUGIN_RANKING_UPDATE_5
            goto L_0x0212
        L_0x0264:
            r0 = 6
            if (r3 != r0) goto L_0x026a
            X.9KI r0 = X.AnonymousClass9KI.WA_IG_1P_PLUGIN_RANKING_UPDATE_6
            goto L_0x0212
        L_0x026a:
            r0 = 7
            if (r3 != r0) goto L_0x0270
            X.9KI r0 = X.AnonymousClass9KI.WA_IG_1P_PLUGIN_RANKING_UPDATE_7
            goto L_0x0212
        L_0x0270:
            r0 = 8
            if (r3 != r0) goto L_0x0277
            X.9KI r0 = X.AnonymousClass9KI.WA_IG_1P_PLUGIN_RANKING_UPDATE_8
            goto L_0x0212
        L_0x0277:
            r0 = 9
            if (r3 != r0) goto L_0x027e
            X.9KI r0 = X.AnonymousClass9KI.WA_IG_1P_PLUGIN_RANKING_UPDATE_9
            goto L_0x0212
        L_0x027e:
            r0 = 10
            if (r3 != r0) goto L_0x0215
            X.9KI r0 = X.AnonymousClass9KI.WA_IG_1P_PLUGIN_RANKING_UPDATE_10
            goto L_0x0212
        L_0x0285:
            X.9JY r0 = X.AnonymousClass9JY.LLAMA_PROD
            goto L_0x0162
        L_0x0289:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x028e:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0291:
            X.Bm6 r0 = r6.A0C()
            X.8XR r0 = (X.AnonymousClass8XR) r0
            X.Bm6 r1 = X.C17880vN.A0G(r2)
            X.8cN r1 = (X.C166118cN) r1
            r0.getClass()
            r1.capabilityMetadata_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 1024(0x400, float:1.435E-42)
            r1.bitField0_ = r0
        L_0x02a8:
            X.Bm6 r0 = r2.A0C()
            X.8cN r0 = (X.C166118cN) r0
            r13.A0H(r0)
        L_0x02b1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A8R.A09(com.whatsapp.jid.UserJid, X.8Wx, X.206):void");
    }

    public void A0A(C163938Wx r5, AnonymousClass206 r6) {
        String str;
        C23624Bmt A0N;
        if (r6 != null) {
            if (r6 instanceof AnonymousClass23O) {
                this.A0E.get();
                List list = r6.A0h;
                AnonymousClass1BI r2 = null;
                if (list != null && list.size() == 1 && !C42701yb.A01(((C70503Bi) list.get(0)).A00)) {
                    r2 = ((C70503Bi) list.get(0)).A00;
                }
                str = C22971Dz.A06(r2);
            } else {
                str = null;
            }
            AnonymousClass206 A0K = r6.A0K();
            if (A0K != null) {
                str = A04(A0K.A0v);
            }
            if (r6 instanceof AnonymousClass24B) {
                AnonymousClass205 r0 = ((AnonymousClass24B) r6).A03;
                if (r0 != null) {
                    str = A04(r0);
                } else {
                    return;
                }
            }
            if (!AnonymousClass1EG.A0H(str)) {
                C166048cG r1 = (C166048cG) r5.A00;
                if ((r1.bitField0_ & 64) != 0) {
                    C166118cN r02 = r1.botMetadata_;
                    if (r02 == null) {
                        r02 = C166118cN.DEFAULT_INSTANCE;
                    }
                    A0N = r02.A0O();
                } else {
                    A0N = C166118cN.DEFAULT_INSTANCE.A0N();
                }
                C166118cN r12 = (C166118cN) C17880vN.A0G(A0N);
                int i = C166118cN.AVATAR_METADATA_FIELD_NUMBER;
                str.getClass();
                r12.bitField0_ |= 16;
                r12.invokerJid_ = str;
                r5.A0H((C166118cN) A0N.A0C());
            }
        }
    }

    public A8R(AnonymousClass11S r1, C32541hM r2, AnonymousClass1UD r3, C26011Qm r4, C26111Qw r5, C24751Ln r6, AnonymousClass1U5 r7, C32981i4 r8, C18030ve r9, AnonymousClass1MB r10, C59392mE r11, AnonymousClass1W6 r12, C35551mQ r13, JniBridge jniBridge, AnonymousClass00H r15) {
        this.A04 = r9;
        this.A09 = r3;
        this.A00 = r1;
        this.A07 = jniBridge;
        this.A0E = r15;
        this.A05 = r12;
        this.A0D = r11;
        this.A0C = r10;
        this.A0B = r6;
        this.A08 = r2;
        this.A0A = r4;
        this.A03 = r8;
        this.A02 = r7;
        this.A01 = r5;
        this.A06 = r13;
    }

    public static final void A05(Object obj, Collection collection, C18090vk r3) {
        if (AnonymousClass000.A1Y(r3.invoke())) {
            collection.add(obj);
        }
    }

    public C166418cr A07(AnonymousClass1BI r8, C166418cr r9, AnonymousClass206 r10) {
        String str;
        AnonymousClass205 r0;
        UserJid A002 = C22941Dw.A00(r8);
        if (A002 == null) {
            return r9;
        }
        AnonymousClass8X8 r3 = (AnonymousClass8X8) r9.A0O();
        C166048cG A0G = r3.A0G();
        C23624Bmt A0N = C166048cG.DEFAULT_INSTANCE.A0N();
        A0N.A0F(A0G);
        C163938Wx r02 = (C163938Wx) A0N;
        A09(A002, r02, r10);
        A0A(r02, r10);
        AnonymousClass8X8.A05(r02, r3);
        if (AnonymousClass000.A1O(r9.bitField0_ & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH)) {
            C166368cm r03 = r9.protocolMessage_;
            C166368cm r1 = r03;
            if (r03 == null) {
                r03 = C166368cm.DEFAULT_INSTANCE;
            }
            if ((r03.bitField0_ & 16384) != 0) {
                if (r1 == null) {
                    r1 = C166368cm.DEFAULT_INSTANCE;
                }
                C165648bX r04 = r1.botFeedbackMessage_;
                if (r04 == null) {
                    r04 = C165648bX.DEFAULT_INSTANCE;
                }
                C23624Bmt A0O = r04.A0O();
                C165648bX r12 = (C165648bX) A0O.A00;
                if ((r12.bitField0_ & 1) != 0) {
                    C166408cq r6 = r12.messageKey_;
                    if (r6 == null) {
                        r6 = C166408cq.DEFAULT_INSTANCE;
                    }
                    AnonymousClass206 A0s = C108945cZ.A0s(AnonymousClass205.A01(AnonymousClass3MX.A0l(r6.remoteJid_), r6.id_, r6.fromMe_), this.A05);
                    if (A0s == null) {
                        str = "E2eMessageBuilder/appendProtocolMessageForBotFeedbackMessage/botResponseMessage is null";
                    } else {
                        C166408cq r05 = ((C165648bX) A0O.A00).messageKey_;
                        if (r05 == null) {
                            r05 = C166408cq.DEFAULT_INSTANCE;
                        }
                        AnonymousClass8X7 A0f = AnonymousClass8BR.A0f(r05);
                        C691536c A003 = C60492o7.A00(A0s);
                        if (A0s.A01 != 1 || A003 == null) {
                            r0 = A0s.A0v;
                        } else {
                            r0 = A003.A02;
                        }
                        String str2 = r0.A01;
                        C18070vi.A0X(str2);
                        A0f.A0H(str2);
                        A0f.A0G();
                        C166408cq A0Z = AnonymousClass8BU.A0Z(A0f, A0O);
                        C165648bX r13 = (C165648bX) A0O.A00;
                        A0Z.getClass();
                        r13.messageKey_ = A0Z;
                        r13.bitField0_ |= 1;
                        C23624Bmt A0O2 = AnonymousClass8BS.A0I(r9).A0O();
                        C165648bX r06 = (C165648bX) A0O.A0C();
                        C166368cm A0H = AnonymousClass8BS.A0H(A0O2);
                        r06.getClass();
                        A0H.botFeedbackMessage_ = r06;
                        A0H.bitField0_ |= 16384;
                        r3.A0O((C166368cm) A0O2.A0C());
                    }
                } else {
                    str = "E2eMessageBuilder/appendProtocolMessageForBotFeedbackMessage/botFeedbackMessage doesn't have MessageKey";
                }
                Log.w(str);
            }
        }
        if (AnonymousClass000.A1O(r9.bitField0_ & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH)) {
            C166368cm r07 = r9.protocolMessage_;
            C166368cm r2 = r07;
            C166368cm r14 = r07;
            if (r07 == null) {
                r07 = C166368cm.DEFAULT_INSTANCE;
            }
            if ((r07.bitField0_ & 1) != 0) {
                C166368cm r08 = r2;
                if (r2 == null) {
                    r08 = C166368cm.DEFAULT_INSTANCE;
                }
                if ((r08.bitField0_ & 2) != 0) {
                    if (r2 == null) {
                        r14 = C166368cm.DEFAULT_INSTANCE;
                    }
                    if (r14.A0R() == C179839Kc.REVOKE) {
                        if (r2 == null) {
                            r2 = C166368cm.DEFAULT_INSTANCE;
                        }
                        C166408cq r09 = r2.key_;
                        if (r09 == null) {
                            r09 = C166408cq.DEFAULT_INSTANCE;
                        }
                        AnonymousClass8X7 A0f2 = AnonymousClass8BR.A0f(r09);
                        A0f2.A0G();
                        C23624Bmt A0O3 = AnonymousClass8BS.A0I(r9).A0O();
                        C166408cq A0Z2 = AnonymousClass8BU.A0Z(A0f2, A0O3);
                        C166368cm r15 = (C166368cm) A0O3.A00;
                        A0Z2.getClass();
                        r15.key_ = A0Z2;
                        r15.bitField0_ |= 1;
                        r3.A0O((C166368cm) A0O3.A0C());
                    }
                }
            }
        }
        return AnonymousClass8BR.A0e(r3);
    }
}
