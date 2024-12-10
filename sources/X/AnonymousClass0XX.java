package X;

/* renamed from: X.0XX  reason: invalid class name */
public class AnonymousClass0XX implements C16720su {
    public final int A00;

    public AnonymousClass0XX(int i) {
        this.A00 = i;
    }

    public void BEo(C06850Zx r8, AnonymousClass0XV r9, long j, boolean z, boolean z2) {
        C06850Zx r2 = r8;
        AnonymousClass0XV r1 = r9;
        long j2 = j;
        boolean z3 = z2;
        if (this.A00 != 0) {
            r9.A0f(r8, j, z2);
        } else {
            r1.A0g(r2, j2, z, z3);
        }
    }

    public boolean CM2(AnonymousClass0XV r4) {
        if (this.A00 == 0) {
            return true;
        }
        C06370Yb A0L = r4.A0L();
        boolean z = false;
        if (A0L != null && A0L.A09()) {
            z = true;
        }
        return !z;
    }
}
