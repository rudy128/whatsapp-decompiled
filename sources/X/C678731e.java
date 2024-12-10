package X;

/* renamed from: X.31e  reason: invalid class name and case insensitive filesystem */
public final class C678731e implements C201511a {
    public final int A00;

    public C678731e(C18030ve r3) {
        C18070vi.A0d(r3, 1);
        this.A00 = C18020vd.A00(C18040vf.A02, r3, 3115);
    }

    public String A00(int i) {
        double A002;
        String str;
        float f = ((float) i) / 1024.0f;
        boolean z = false;
        if (f < 1.0f) {
            A002 = (double) i;
            str = "MB";
        } else {
            A002 = ((double) C22339B3q.A00(((double) f) * 10.0d)) / 10.0d;
            str = "GB";
        }
        int i2 = (int) A002;
        if (A002 == ((double) i2) * 1.0d) {
            z = true;
        }
        boolean z2 = !z;
        StringBuilder A10 = AnonymousClass000.A10();
        if (z2) {
            A10.append(A002);
        } else {
            A10.append(i2);
        }
        String A1H = AnonymousClass001.A1H(" ", str, A10);
        C18070vi.A0X(A1H);
        return A1H;
    }
}
