package X;

import java.io.File;
import java.util.Arrays;

/* renamed from: X.7Ew  reason: invalid class name and case insensitive filesystem */
public final class C143807Ew implements C72113Kr {
    public final C139536z0 A00;

    public C143807Ew(C139536z0 r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public void Bqf() {
        File[] listFiles;
        for (C122616Rb r4 : C122616Rb.A00) {
            int i = 0;
            File A02 = this.A00.A02(r4, false);
            if (A02 != null) {
                C64062u9.A0H(A02, 604800000);
                String[] list = A02.list();
                if (list != null) {
                    i = list.length;
                }
                if (i > r4.maxPhotos && (listFiles = A02.listFiles()) != null) {
                    Arrays.sort(listFiles, new C147027Rn(12));
                    for (File delete : C200410p.A0R(listFiles, r4.maxPhotos)) {
                        delete.delete();
                    }
                }
            }
        }
    }
}
