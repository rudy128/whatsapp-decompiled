package X;

import java.io.Serializable;

/* renamed from: X.AiQ  reason: case insensitive filesystem */
public class C21339AiQ implements Serializable {
    public static final long serialVersionUID = 0;
    public String sha1Hash;
    public String sha256Hash;

    public boolean equals(Object obj) {
        if (!(obj instanceof C21339AiQ)) {
            return false;
        }
        return this.sha256Hash.equals(((C21339AiQ) obj).sha256Hash);
    }

    public C21339AiQ(String str) {
        if (str.length() == 43) {
            this.sha256Hash = str;
            return;
        }
        throw new SecurityException("Invalid SHA256 key hash - should be 256-bit.");
    }

    public int hashCode() {
        return AnonymousClass000.A0P(this.sha256Hash, AnonymousClass3MW.A1a(), 0);
    }
}
