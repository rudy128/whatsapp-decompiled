package X;

import android.util.Base64;
import com.whatsapp.util.Log;

public class ASX implements B83, B85, C436820m {
    public void BDb(C19998A2m a2m, AnonymousClass206 r11) {
        if (r11 instanceof C443823f) {
            C443823f r112 = (C443823f) r11;
            if (r112.A03 == null || r112.A01 == null || r112.A00 <= 0) {
                Log.w("FMessageMediaExpressPathNotify/buildE2EMessage unable to send media express path noitfy message due to missing params");
                throw AnonymousClass8BW.A0S(26);
            }
            AnonymousClass8X8 r3 = a2m.A00;
            C163898Wt A01 = AnonymousClass8X8.A01(r3);
            C164728Zy r0 = ((C166368cm) A01.A00).mediaNotifyMessage_;
            if (r0 == null) {
                r0 = C164728Zy.DEFAULT_INSTANCE;
            }
            C23624Bmt A0O = r0.A0O();
            String str = r112.A03;
            AnonymousClass205 r5 = r112.A0v;
            if (C20133A8t.A0D(r5, str)) {
                String str2 = r112.A03;
                C164728Zy r1 = (C164728Zy) C17880vN.A0G(A0O);
                int i = C164728Zy.EXPRESS_PATH_URL_FIELD_NUMBER;
                str2.getClass();
                r1.bitField0_ |= 1;
                r1.expressPathUrl_ = str2;
                long j = r112.A00;
                if (j >= 0) {
                    C164728Zy r7 = (C164728Zy) C17880vN.A0G(A0O);
                    r7.bitField0_ |= 4;
                    r7.fileLength_ = j;
                    try {
                        byte[] A1a = AnonymousClass8BT.A1a(r112.A01);
                        DSQ dsq = DSQ.A00;
                        C23581BmB A03 = C17900vP.A03(A0O, A1a);
                        C164728Zy r12 = (C164728Zy) A0O.A00;
                        r12.bitField0_ |= 2;
                        r12.fileEncSha256_ = A03;
                        if (r112.A02 == null) {
                            A01.A0G(C179839Kc.MEDIA_NOTIFY_MESSAGE);
                            C164728Zy r02 = (C164728Zy) A0O.A0C();
                            C166368cm A0H = AnonymousClass8BS.A0H(A01);
                            r02.getClass();
                            A0H.mediaNotifyMessage_ = r02;
                            A0H.bitField0_ |= 65536;
                            r3.A0N(A01);
                            return;
                        }
                        C166208cW r03 = ((C166418cr) r3.A00).documentMessage_;
                        if (r03 == null) {
                            r03 = C166208cW.DEFAULT_INSTANCE;
                        }
                        C162748Si r4 = (C162748Si) r03.A0O();
                        if (C20133A8t.A0D(r5, r112.A03)) {
                            String str3 = r112.A03;
                            C166208cW A0X = AnonymousClass8BT.A0X(r4);
                            str3.getClass();
                            A0X.bitField0_ |= 1;
                            A0X.url_ = str3;
                            long j2 = r112.A00;
                            if (j2 >= 0) {
                                C166208cW A0X2 = AnonymousClass8BT.A0X(r4);
                                A0X2.bitField0_ |= 16;
                                A0X2.fileLength_ = j2;
                                try {
                                    C23581BmB A0F = AnonymousClass8BR.A0F(Base64.decode(r112.A02, 2), 0);
                                    C166208cW A0X3 = AnonymousClass8BT.A0X(r4);
                                    A0X3.bitField0_ |= 8;
                                    A0X3.fileSha256_ = A0F;
                                    C23581BmB A0F2 = AnonymousClass8BR.A0F(Base64.decode(r112.A01, 2), 0);
                                    C166208cW A0X4 = AnonymousClass8BT.A0X(r4);
                                    A0X4.bitField0_ |= 256;
                                    A0X4.fileEncSha256_ = A0F2;
                                    C166208cW A0X5 = AnonymousClass8BT.A0X(r4);
                                    A0X5.bitField0_ |= 2;
                                    A0X5.mimetype_ = "document";
                                    r3.A0J(r4);
                                } catch (Exception e) {
                                    Log.e("fmessagemediaexpresspathnotify/createdocumentmessagebuilder", e);
                                    throw AnonymousClass8BW.A0S(14);
                                }
                            } else {
                                throw AnonymousClass8BW.A0S(13);
                            }
                        } else {
                            throw AnonymousClass8BW.A0S(15);
                        }
                    } catch (Exception e2) {
                        Log.e("fmessagemediaexpresspathnotify/createdocumentmessagebuilder", e2);
                        throw AnonymousClass8BW.A0S(14);
                    }
                } else {
                    throw AnonymousClass8BW.A0S(13);
                }
            } else {
                throw AnonymousClass8BW.A0S(15);
            }
        } else {
            throw AnonymousClass000.A0k("FMessageMediaExpressPathNotifyProtobuf/not supported message");
        }
    }

    /* JADX WARNING: type inference failed for: r6v4, types: [X.23f, X.206] */
    /* JADX WARNING: type inference failed for: r6v5, types: [X.23f, X.206] */
    public AnonymousClass206 CBG(C20077A6d a6d) {
        C443823f r6;
        byte[] bArr;
        C443823f r62;
        C166418cr r3 = a6d.A08;
        C166368cm A0I = AnonymousClass8BS.A0I(r3);
        if (A0I.A0R() == C179839Kc.MEDIA_NOTIFY_MESSAGE) {
            if ((A0I.bitField0_ & 65536) != 0) {
                AnonymousClass205 r5 = a6d.A0A;
                ? r63 = new AnonymousClass206(r5, 69, a6d.A03);
                C164728Zy r8 = AnonymousClass8BS.A0I(r3).mediaNotifyMessage_;
                if (r8 == null) {
                    r8 = C164728Zy.DEFAULT_INSTANCE;
                }
                if ((r8.bitField0_ & 1) == 0 || !C20133A8t.A0D(r5, r8.expressPathUrl_)) {
                    throw AnonymousClass8BR.A0o(15);
                }
                r63.A03 = r8.expressPathUrl_;
                int i = r8.bitField0_;
                if ((i & 4) != 0) {
                    long j = r8.fileLength_;
                    if (j >= 0) {
                        r63.A00 = j;
                        r6 = r63;
                        if ((i & 2) != 0) {
                            bArr = r8.fileEncSha256_.A06();
                            int length = bArr.length;
                            r62 = r63;
                            if (length != 32) {
                                StringBuilder A10 = AnonymousClass000.A10();
                                A10.append("FMessageMediaExpessPathNotify/bogus sha-256 enc hash received; length=");
                                A10.append(length);
                                C17900vP.A0X(r5, "; message.key=", A10);
                                throw AnonymousClass8BR.A0o(14);
                            }
                        }
                        return r6;
                    }
                }
                StringBuilder A102 = AnonymousClass000.A10();
                A102.append("FMessageMediaExpessPathNotify/bogus media size received; file_length=");
                A102.append(r8.fileLength_);
                C17890vO.A0w(A102);
                throw AnonymousClass8BT.A0c();
            }
            throw AnonymousClass8BR.A0o(11);
        } else if ((r3.bitField0_ & 64) == 0 || !"medianotify".equals(a6d.A0H)) {
            return null;
        } else {
            C166208cW r7 = r3.documentMessage_;
            if (r7 == null) {
                r7 = C166208cW.DEFAULT_INSTANCE;
            }
            C17960vV.A07(r7);
            AnonymousClass205 r4 = a6d.A0A;
            ? r64 = new AnonymousClass206(r4, 69, a6d.A03);
            if ((r7.bitField0_ & 1) == 0 || !C20133A8t.A0D(r4, r7.url_)) {
                throw AnonymousClass8BR.A0o(15);
            }
            r64.A03 = r7.url_;
            int i2 = r7.bitField0_;
            if ((i2 & 16) != 0) {
                long j2 = r7.fileLength_;
                if (j2 >= 0) {
                    r64.A00 = j2;
                    if (AnonymousClass000.A1O(i2 & 8)) {
                        byte[] A06 = r7.fileSha256_.A06();
                        int length2 = A06.length;
                        if (length2 == 32) {
                            r64.A02 = C108955ca.A14(A06);
                        } else {
                            StringBuilder A103 = AnonymousClass000.A10();
                            A103.append("FMessageMediaExpessPathNotify/bogus sha-256 hash received; length=");
                            A103.append(length2);
                            C17900vP.A0Z(r4, "; message.key=", A103);
                            throw AnonymousClass8BR.A0o(14);
                        }
                    }
                    r6 = r64;
                    if ((r7.bitField0_ & 256) != 0) {
                        bArr = r7.fileEncSha256_.A06();
                        int length3 = bArr.length;
                        r62 = r64;
                        if (length3 != 32) {
                            StringBuilder A104 = AnonymousClass000.A10();
                            A104.append("FMessageMediaExpessPathNotify/bogus sha-256 enc hash received; length=");
                            A104.append(length3);
                            C17900vP.A0X(r4, "; message.key=", A104);
                            throw AnonymousClass8BR.A0o(14);
                        }
                    }
                    return r6;
                }
            }
            throw AnonymousClass8BT.A0c();
        }
        r62.A01 = C108955ca.A14(bArr);
        r6 = r62;
        return r6;
    }
}
