package X;

import android.content.res.Resources;
import android.os.Build;

/* renamed from: X.1bw  reason: invalid class name and case insensitive filesystem */
public abstract class C29271bw {
    public static final C002100z A00 = new C002100z(16);
    public static final C29281bx A01;

    static {
        C29281bx r0;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            r0 = new C29291by();
        } else if (i >= 28) {
            r0 = new AnonymousClass8EE();
        } else if (i >= 26) {
            r0 = new AnonymousClass8EF();
        } else if (i < 24 || !AnonymousClass8EH.A01()) {
            r0 = new C29281bx();
        } else {
            r0 = new AnonymousClass8EH();
        }
        A01 = r0;
    }

    public static String A00(Resources resources, String str, int i, int i2, int i3) {
        StringBuilder sb = new StringBuilder();
        sb.append(resources.getResourcePackageName(i));
        sb.append('-');
        sb.append(str);
        sb.append('-');
        sb.append(i2);
        sb.append('-');
        sb.append(i);
        sb.append('-');
        sb.append(i3);
        return sb.toString();
    }
}
