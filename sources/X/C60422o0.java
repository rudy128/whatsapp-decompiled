package X;

import java.io.File;
import java.util.List;

/* renamed from: X.2o0  reason: invalid class name and case insensitive filesystem */
public abstract class C60422o0 {
    public static final C56232h8 A00(C61382pa r16, C26551So r17, String str, int i, boolean z) {
        C26551So r3 = r17;
        C18070vi.A0d(r3, 0);
        int i2 = i;
        return new C56232h8(r16, (C184589bC) null, r3, (File) null, (String) null, (String) null, "optimistic", str, (List) null, (int[]) null, i2, 0, 1, 0, true, z, true, AnonymousClass000.A1T(i2, 3), false);
    }

    public static final C56232h8 A01(C184589bC r21, C26551So r22, File file, int i) {
        String str;
        C26551So r3 = r22;
        boolean A06 = C63972u0.A06(r3);
        boolean z = !A06;
        if (A06) {
            str = "newsletter";
        } else {
            str = "mms";
        }
        return new C56232h8((C61382pa) null, r21, r3, file, (String) null, (String) null, str, (String) null, (List) null, (int[]) null, 0, 0, i, 0, true, true, z, false, false);
    }
}
