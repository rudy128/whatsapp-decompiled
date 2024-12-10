package X;

import com.whatsapp.jid.UserJid;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.9zt  reason: invalid class name and case insensitive filesystem */
public class C199379zt {
    public final C190629lG A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public static String A00(UserJid userJid) {
        String str = userJid.user;
        try {
            MessageDigest A1I = C108945cZ.A1I();
            A1I.update(str.getBytes(CIB.A05));
            return C108955ca.A14(A1I.digest());
        } catch (NoSuchAlgorithmException e) {
            throw new IOException(e);
        }
    }

    public C199379zt(C190629lG r1, String str, String str2, String str3) {
        this.A02 = str;
        this.A01 = str2;
        this.A03 = str3;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("EncMetadata{scheme='");
        A10.append(this.A02);
        A10.append('\'');
        A10.append(", dataId='");
        A10.append(this.A01);
        A10.append('\'');
        A10.append(", sourceId='");
        A10.append(this.A03);
        A10.append('\'');
        A10.append(", keyInfo=");
        return AnonymousClass8BX.A0c(this.A00, A10);
    }
}
