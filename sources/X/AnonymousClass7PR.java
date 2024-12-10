package X;

import java.io.File;
import java.io.FileFilter;
import java.util.Set;

/* renamed from: X.7PR  reason: invalid class name */
public class AnonymousClass7PR implements FileFilter {
    public final int A00;
    public final Object A01;

    public AnonymousClass7PR(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final boolean accept(File file) {
        int i = this.A00;
        Object obj = this.A01;
        if (i == 0) {
            return !((Set) obj).contains(file.getName());
        }
        C111325jX r1 = (C111325jX) obj;
        C18070vi.A0d(file, 1);
        if (!file.isFile()) {
            return false;
        }
        String A09 = C64062u9.A09(file.getAbsolutePath());
        C18070vi.A0X(A09);
        String A0N = C26511Sk.A0N(A09);
        try {
            Set set = r1.A03;
            if ((!C108945cZ.A1U(set) || set.contains(A0N)) && !file.isHidden() && file.canRead()) {
                return true;
            }
            return false;
        } catch (SecurityException unused) {
            return false;
        }
    }
}
