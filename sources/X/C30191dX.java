package X;

/* renamed from: X.1dX  reason: invalid class name and case insensitive filesystem */
public final class C30191dX {
    public final C219217x A00;
    public final AnonymousClass11S A01;

    public C30191dX(AnonymousClass11S r2, C219217x r3) {
        C18070vi.A0d(r2, 1);
        C18070vi.A0d(r3, 2);
        this.A01 = r2;
        this.A00 = r3;
    }

    public final boolean A00() {
        C219217x r1 = this.A00;
        if ((r1.A03("android.permission.READ_CONTACTS") != 0 || r1.A03("android.permission.WRITE_CONTACTS") != 0) && !this.A01.A0N()) {
            return false;
        }
        return true;
    }
}
