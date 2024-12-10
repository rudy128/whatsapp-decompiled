package X;

import android.text.TextUtils;
import java.nio.CharBuffer;

/* renamed from: X.CqN  reason: case insensitive filesystem */
public class C26006CqN {
    public final String A00;
    public final String A01;
    public final String A02;

    public C26006CqN(String str, String str2, String str3) {
        this.A02 = str;
        this.A00 = str2;
        this.A01 = str3;
    }

    public static void A00(CharBuffer charBuffer) {
        int limit = charBuffer.limit() - charBuffer.position();
        if (limit >= 4 || limit <= 0) {
            throw AnonymousClass000.A0k("IPV4 octet must contain between 1 and 3 digits");
        }
        try {
            int parseInt = Integer.parseInt(charBuffer.toString(), 10);
            if (parseInt < 0 || parseInt > 255) {
                throw AnonymousClass001.A13("IPV4 octet value must be between 0 and 255, got ", AnonymousClass000.A10(), parseInt);
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(AnonymousClass001.A1E(charBuffer, "Unable to parse decimal octet ", AnonymousClass000.A10()), e);
        }
    }

    public String A01() {
        StringBuilder A10 = AnonymousClass000.A10();
        if (!TextUtils.isEmpty(this.A02)) {
            A10.append("<REDACTED>");
            A10.append("@");
        }
        String str = this.A00;
        if (!TextUtils.isEmpty(str)) {
            A10.append(str);
        }
        String str2 = this.A01;
        if (!TextUtils.isEmpty(str2)) {
            A10.append(":");
            A10.append(str2);
        }
        return A10.toString();
    }

    public String toString() {
        return A01();
    }

    public C26006CqN(String str, String str2) {
        this.A02 = str;
        this.A00 = str2;
        this.A01 = null;
    }
}
