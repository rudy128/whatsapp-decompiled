package X;

import java.io.File;

/* renamed from: X.C8o  reason: case insensitive filesystem */
public abstract class C24543C8o {
    public static boolean A00(File file) {
        File[] listFiles;
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File A00 : listFiles) {
                A00(A00);
            }
        }
        return file.delete();
    }
}
