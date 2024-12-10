package X;

import java.io.File;

/* renamed from: X.C8p  reason: case insensitive filesystem */
public abstract class C24544C8p {
    public static void A00(File file) {
        if (file.exists()) {
            if (file.isDirectory()) {
                return;
            }
            if (!file.delete()) {
                throw new C24206BxI(file.getAbsolutePath(), new C24190Bx0(file.getAbsolutePath()));
            }
        }
        if (!file.mkdirs() && !file.isDirectory()) {
            throw new C24206BxI(file.getAbsolutePath());
        }
    }
}
