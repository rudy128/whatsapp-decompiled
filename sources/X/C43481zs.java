package X;

import java.util.Arrays;

/* renamed from: X.1zs  reason: invalid class name and case insensitive filesystem */
public abstract class C43481zs {
    public static final String A00;
    public static final String A01;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT ");
        String[] strArr = C43491zt.A00;
        sb.append(C43501zu.A00(", ", (CharSequence[]) Arrays.copyOf(strArr, 35)));
        sb.append(" FROM settings WHERE jid = ?");
        A01 = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SELECT ");
        sb2.append(C43501zu.A00(", ", (CharSequence[]) Arrays.copyOf(strArr, 35)));
        sb2.append(" FROM settings");
        A00 = sb2.toString();
    }
}
