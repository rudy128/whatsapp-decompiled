package X;

import java.io.File;

/* renamed from: X.2UT  reason: invalid class name */
public abstract class AnonymousClass2UT {
    public static final File A00(File file, String str) {
        File A0e = C17880vN.A0e(file, str);
        if (A0e.exists() || A0e.mkdir()) {
            return A0e;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("UserNoticeContentManager/getDir/could not make directory ");
        C17890vO.A19(A10, A0e.getAbsolutePath());
        return null;
    }
}
