package X;

import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;

public final class A2I {
    public final C24751Ln A00;
    public final JniBridge A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass190 A05;
    public final AnonymousClass11S A06;
    public final C26011Qm A07;
    public final AnonymousClass1W7 A08;

    public final A51 A01(AnonymousClass1BI r4, C166408cq r5, AnonymousClass205 r6) {
        if (r5 != null) {
            AnonymousClass11S r1 = this.A06;
            if (r6.A02 || r4 == null) {
                r4 = null;
            }
            return AnonymousClass9AT.A00(r1, r4, r5, r6, false);
        }
        throw AnonymousClass8BR.A0o(0);
    }

    public final AnonymousClass7PS A02(C194959sZ r10) {
        Object A002;
        AnonymousClass205 r0 = r10.A01;
        if (r0 != null) {
            AnonymousClass00H r2 = this.A04;
            AnonymousClass206 A012 = AnonymousClass1W2.A01(AnonymousClass8BV.A0L(r0, r2), this.A02);
            if (A012 != null) {
                byte[] A013 = this.A08.A01(A012.A0x);
                Object A014 = this.A07.A01(A012);
                UserJid userJid = r10.A00;
                AnonymousClass205 r1 = A012.A0v;
                if (C22971Dz.A0d(r1.A00)) {
                    if ((userJid instanceof AnonymousClass1E2) && (A014 instanceof PhoneUserJid)) {
                        A014 = this.A00.A0C((PhoneUserJid) A014);
                    } else if ((userJid instanceof PhoneUserJid) && (A014 instanceof AnonymousClass1E2)) {
                        A014 = this.A00.A0D((AnonymousClass1E1) A014);
                    }
                }
                AnonymousClass205 A022 = ((C59392mE) r2.get()).A02(r1);
                byte[] bArr = r10.A03;
                C21549Alw alw = new C21549Alw(r10, this);
                if (A013 == null || A013.length != 32) {
                    Log.e("MessageSecretCryptoHelper/encryptionParamValidation/message secret missing or invalid");
                    A002 = C30691eM.A00(AnonymousClass8BW.A0S(66));
                } else if (A022 == null) {
                    Log.e("MessageSecretCryptoHelper/encryptionParamValidation/parent key is null");
                    A002 = C30691eM.A00(AnonymousClass8BW.A0S(0));
                } else if (A014 == null) {
                    Log.e("MessageSecretCryptoHelper/encryptionParamValidation/targetSenderUserJid is null");
                    A002 = C30691eM.A00(AnonymousClass8BW.A0S(0));
                } else if (userJid == null) {
                    Log.e("MessageSecretCryptoHelper/encryptionParamValidation/senderUserJid is null");
                    A002 = C30691eM.A00(AnonymousClass8BW.A0S(0));
                } else {
                    A002 = ((C30671eK) alw.invoke(A022, A013, A014, userJid, bArr)).value;
                }
                C30691eM.A01(A002);
                return (AnonymousClass7PS) A002;
            }
            Log.e("MessageSecretCryptoHelper/encrypt/target message not found. Cannot proceed further");
            throw AnonymousClass8BW.A0S(71);
        }
        Log.e("MessageSecretCryptoHelper/encrypt/target message key is null");
        throw AnonymousClass8BW.A0S(0);
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [X.B84, java.lang.Object] */
    public static final B84 A00(UserJid userJid, AnonymousClass205 r2, String str) {
        B84 ats;
        if (C18070vi.A18(str, "Poll Vote")) {
            ats = new ATT(userJid, r2);
        } else if (!C18070vi.A18(str, "Event Response")) {
            return new Object();
        } else {
            ats = new ATS(userJid, r2);
        }
        return ats;
    }

    public final byte[] A03(C195579tZ r14) {
        C32711hd A0a;
        Object obj;
        AnonymousClass205 r2 = r14.A05;
        AnonymousClass205 r9 = A01(r14.A02, r14.A04, r2).A01;
        if (r9 != null) {
            AnonymousClass206 A012 = AnonymousClass1W2.A01(AnonymousClass8BV.A0L(r9, this.A04), this.A02);
            if (A012 == null) {
                Log.i("MessageSecretCryptoHelper/decrypt/target message was not found. Cannot decrypt the message. Save message as orphan if needed");
                return null;
            }
            byte[] A013 = this.A08.A01(A012.A0x);
            if (A013 == null) {
                AnonymousClass190 r3 = this.A05;
                StringBuilder A10 = AnonymousClass000.A10();
                AnonymousClass206.A06(A012, "parentMsgRowId = ", A10);
                AnonymousClass206.A07(A012, "; parentType = ", A10);
                A10.append("; parentHasSecret = ");
                A10.append(A012.A0t());
                r3.A0G("MessageSecretCryptoHelper/message secret not found for message", C17890vO.A0c(A10, ';'), true);
            }
            UserJid A014 = this.A07.A01(A012);
            DSQ dsq = r14.A00;
            DSQ dsq2 = r14.A01;
            UserJid userJid = r14.A03;
            C21550Alx alx = new C21550Alx(r14, this);
            if (A013 == null) {
                C17900vP.A0X(r9, "MessageSecretCryptoHelper/decryptionParamValidation/message secret missing for parent message key: ", AnonymousClass000.A10());
                A0a = AnonymousClass8BR.A0o(66);
            } else {
                int length = A013.length;
                if (length != 32) {
                    StringBuilder A102 = AnonymousClass000.A10();
                    A102.append("MessageSecretCryptoHelper/decryptionParamValidation/message secret of invalid length=");
                    A102.append(length);
                    C17900vP.A0X(r9, " for parent message key: ", A102);
                    A0a = AnonymousClass8BR.A0o(67);
                } else if (dsq == null || dsq.A02() != 12) {
                    A0a = AnonymousClass8BU.A0a("MessageSecretCryptoHelper/decryptionParamValidation/encIv missing or invalid", 11);
                } else if (dsq2 == null || dsq2.A02() == 0) {
                    A0a = AnonymousClass8BU.A0a("MessageSecretCryptoHelper/decryptionParamValidation/encPayload missing or invalid", 11);
                } else if (A014 == null) {
                    A0a = AnonymousClass8BU.A0a("MessageSecretCryptoHelper/decryptionParamValidation/targetSenderUserJid is null", 0);
                } else if (userJid == null) {
                    A0a = AnonymousClass8BU.A0a("MessageSecretCryptoHelper/decryptionParamValidation/senderUserJid is null", 0);
                } else {
                    obj = ((C30671eK) alx.invoke(AnonymousClass8BS.A1P(dsq), AnonymousClass8BS.A1P(dsq2), r9, A013, A014, userJid)).value;
                    C30691eM.A01(obj);
                    return (byte[]) obj;
                }
            }
            obj = C30691eM.A00(A0a);
            C30691eM.A01(obj);
            return (byte[]) obj;
        }
        Log.e("MessageSecretCryptoHelper/getMessage/cannot find message for given key");
        throw AnonymousClass8BT.A0b();
    }

    public A2I(AnonymousClass190 r2, AnonymousClass11S r3, C26011Qm r4, AnonymousClass1W7 r5, C24751Ln r6, JniBridge jniBridge, AnonymousClass00H r8, AnonymousClass00H r9, AnonymousClass00H r10) {
        C18070vi.A0w(r2, r3, jniBridge, r6, r8);
        C18070vi.A0q(r9, r5, r4);
        C18070vi.A0d(r10, 9);
        this.A05 = r2;
        this.A06 = r3;
        this.A01 = jniBridge;
        this.A00 = r6;
        this.A02 = r8;
        this.A04 = r9;
        this.A08 = r5;
        this.A07 = r4;
        this.A03 = r10;
    }
}
