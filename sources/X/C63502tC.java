package X;

import java.io.File;

/* renamed from: X.2tC  reason: invalid class name and case insensitive filesystem */
public final class C63502tC {
    public static final C63502tC A00 = new Object();

    public static final void A01(String str) {
        C18070vi.A0d(str, 0);
        C63502tC r2 = A00;
        File file = new File(str);
        if (!file.exists()) {
            return;
        }
        if (file.isDirectory()) {
            r2.A00(file);
        } else if (!file.delete()) {
            file.delete();
        }
    }

    private final void A00(File file) {
        File[] listFiles;
        if (file.exists() && (listFiles = file.listFiles()) != null) {
            C99014s7 r2 = new C99014s7(listFiles);
            while (r2.hasNext()) {
                File file2 = (File) r2.next();
                if (file2.isDirectory()) {
                    A00(file2);
                } else if (!file2.delete()) {
                    file2.delete();
                }
            }
        }
        if (!file.delete()) {
            file.delete();
        }
    }
}
