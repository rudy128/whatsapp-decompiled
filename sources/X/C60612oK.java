package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.2oK  reason: invalid class name and case insensitive filesystem */
public abstract class C60612oK {
    public static boolean A00(AnonymousClass206 r1) {
        if (!r1.A0v() || (r1 instanceof AnonymousClass23U)) {
            return false;
        }
        return true;
    }

    public static byte[] A01(UserJid userJid, UserJid userJid2, String str, String str2, byte[] bArr) {
        StringBuilder A11 = AnonymousClass000.A11(str2);
        A11.append(userJid.getRawString());
        return C20058A5h.A00(bArr, AnonymousClass001.A1H(userJid2.getRawString(), str, A11).getBytes(C26571Sq.A05), 32);
    }
}
