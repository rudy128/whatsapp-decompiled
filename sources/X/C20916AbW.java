package X;

import java.util.Map;

/* renamed from: X.AbW  reason: case insensitive filesystem */
public final class C20916AbW implements C22522BBf {
    public final C219217x A00;
    public final C19997A2l A01;

    public C20916AbW(C219217x r2, C19997A2l a2l) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
        this.A01 = a2l;
    }

    public /* bridge */ /* synthetic */ Object CFt(Enum enumR, Object obj, Map map) {
        if (C108955ca.A04((C179949Kn) enumR, 1) != 4 || !this.A00.A0I()) {
            return null;
        }
        int A012 = this.A01.A01();
        if (A012 == 0) {
            return "INSTALLED";
        }
        if (A012 != 1) {
            return "INCORRECT_SIM_SELECTED";
        }
        return "NOT_INSTALLED";
    }

    public Class BL8() {
        return C179949Kn.class;
    }
}
