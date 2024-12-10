package X;

import java.io.File;

/* renamed from: X.ArX  reason: case insensitive filesystem */
public abstract class C21721ArX extends C21722ArY {
    public static final String A04(File file) {
        C18070vi.A0d(file, 0);
        String A0i = AnonymousClass8BS.A0i(file);
        int A0E = AnonymousClass1YF.A0E(A0i, ".", A0i.length() - 1);
        if (A0E != -1) {
            return C108955ca.A0q(0, A0E, A0i);
        }
        return A0i;
    }

    public static final boolean A05(File file) {
        C18070vi.A0d(file, 0);
        C27349DcL dcL = new C27349DcL(new C27174DXj(file, AnonymousClass00R.A01));
        while (true) {
            boolean z = true;
            while (true) {
                if (!dcL.hasNext()) {
                    return z;
                }
                File A0T = AnonymousClass8BS.A0T(dcL);
                if (A0T.delete() || !A0T.exists()) {
                    if (z) {
                    }
                }
                z = false;
            }
        }
    }

    public static final String A03(File file) {
        return AnonymousClass1YF.A0M(AnonymousClass8BS.A0i(file), "", '.');
    }
}
