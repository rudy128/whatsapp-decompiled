package X;

import android.net.Uri;

/* renamed from: X.9UB  reason: invalid class name */
public abstract class AnonymousClass9UB {
    public static final Uri A00;
    public static final Uri A01;
    public static final Uri A02;
    public static final String A03;

    static {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("com.whatsapp");
        String A0y = AnonymousClass000.A0y(".provider.migrate.ios", A10);
        A03 = A0y;
        Uri build = new Uri.Builder().scheme("content").authority(A0y).build();
        A00 = build;
        A02 = Uri.withAppendedPath(build, "files");
        A01 = Uri.withAppendedPath(build, "file");
    }
}
