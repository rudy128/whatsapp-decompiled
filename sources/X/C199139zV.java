package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.StringTokenizer;

/* renamed from: X.9zV  reason: invalid class name and case insensitive filesystem */
public final class C199139zV {
    public final C18010vc A00;
    public final C18100vl A01 = AnonymousClass1DF.A01(new C21947AvB(this));

    public C199139zV(C18010vc r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public static final String A00(int i, int i2, int i3) {
        Locale locale = Locale.US;
        Object[] objArr = new Object[5];
        C17880vN.A1T(objArr, i, 0);
        C17880vN.A1T(objArr, i3, 1);
        C17880vN.A1T(objArr, i2, 2);
        C17880vN.A1T(objArr, 0, 3);
        objArr[4] = "bandwidths";
        return C108955ca.A12(locale, "%d_%d_%d_%d_%s", Arrays.copyOf(objArr, 5));
    }

    public final ArrayList A01(int i, int i2, int i3) {
        StringTokenizer stringTokenizer = new StringTokenizer(C17880vN.A0C(this.A01).getString(A00(i, i2, i3), ""), ",");
        ArrayList A13 = AnonymousClass000.A13();
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            C18070vi.A0X(nextToken);
            C17890vO.A1D(A13, Integer.parseInt(nextToken));
        }
        return A13;
    }
}
