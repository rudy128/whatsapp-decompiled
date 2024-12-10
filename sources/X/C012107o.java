package X;

/* renamed from: X.07o  reason: invalid class name and case insensitive filesystem */
public final class C012107o extends AnonymousClass0PV {
    public static final C012107o A00 = new C012107o();

    public C012107o() {
        super(2, 0);
    }

    public String A04(int i) {
        if (i == 0) {
            return "removeIndex";
        }
        if (i == 1) {
            return "count";
        }
        return super.A04(i);
    }

    public void A06(C16270rz r6, C15750r8 r7, AnonymousClass0Qu r8, AnonymousClass0r9 r9) {
        C05840Vx r92 = (C05840Vx) r9;
        int[] iArr = r92.A03.A05;
        int i = r92.A00;
        int i2 = iArr[i];
        int i3 = iArr[i + 1];
        AnonymousClass0XV r2 = (AnonymousClass0XV) ((AnonymousClass0VP) r6).A00;
        if (i3 >= 0) {
            int i4 = (i3 + i2) - 1;
            if (i2 <= i4) {
                while (true) {
                    AnonymousClass0XV.A0B(r2, (AnonymousClass0XV) r2.A0R.A00(i4));
                    if (i4 != i2) {
                        i4--;
                    } else {
                        return;
                    }
                }
            }
        } else {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("count (");
            A10.append(i3);
            throw AnonymousClass001.A12(") must be greater than 0", A10);
        }
    }
}
