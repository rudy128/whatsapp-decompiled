package X;

import android.text.TextUtils;

/* renamed from: X.A6q  reason: case insensitive filesystem */
public abstract class C20088A6q {
    public static void A04(StringBuilder sb, StringBuilder sb2) {
        sb.append("");
        sb2.append(A00(sb.toString()));
    }

    public static String A00(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("[data localized ");
        A10.append(str.getBytes().length);
        return AnonymousClass000.A0y(" bytes]", A10);
    }

    public static String A01(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int length = (str.length() + 1) / 2;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("[");
        A10.append(length);
        A10.append(" char]");
        return AnonymousClass000.A0y(str.substring(length), A10);
    }

    public static String A02(String str) {
        if (TextUtils.isEmpty(str) || !str.contains("@")) {
            return "";
        }
        return "SCRUBBED-VPA";
    }

    public static void A03(StringBuilder sb, String str) {
        sb.append(A00(str));
    }
}
