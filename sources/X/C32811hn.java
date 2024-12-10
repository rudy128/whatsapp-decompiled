package X;

/* renamed from: X.1hn  reason: invalid class name and case insensitive filesystem */
public class C32811hn {
    public final AnonymousClass1SS A00;
    public final AnonymousClass11P A01;

    public C32811hn(AnonymousClass11P r1, AnonymousClass1SS r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public boolean A00(C56202h4 r8) {
        if (System.currentTimeMillis() - r8.A04 >= 86400000) {
            r8.A04 = System.currentTimeMillis();
            r8.A01 = 1;
        } else {
            int i = r8.A01;
            if (i >= 15) {
                return false;
            }
            r8.A01 = i + 1;
        }
        this.A00.A04(r8);
        return true;
    }
}
