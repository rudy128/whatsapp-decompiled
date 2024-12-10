package X;

import java.io.File;

/* renamed from: X.9uy  reason: invalid class name and case insensitive filesystem */
public abstract class C196389uy {
    public static final boolean A01(File file) {
        if (file != null && file.exists()) {
            if (!file.isDirectory()) {
                return true;
            }
            String[] list = file.list();
            return (list == null || list.length == 0) ? false : true;
        }
    }

    public static final void A00(File file) {
        boolean isFile = file.isFile();
        boolean A01 = A01(file);
        if (isFile) {
            if (!A01) {
                return;
            }
        } else if (A01 && file.isDirectory()) {
            String[] list = file.list();
            if (list != null) {
                for (String A0e : list) {
                    A00(C17880vN.A0e(file, A0e));
                }
            }
        } else {
            return;
        }
        file.delete();
    }
}
