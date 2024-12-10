package X;

/* renamed from: X.25F  reason: invalid class name */
public final class AnonymousClass25F {
    public final AnonymousClass206 A00;
    public final Class A01;
    public volatile AnonymousClass229 A02;
    public volatile boolean A03;

    public AnonymousClass25F(AnonymousClass206 r2, Class cls, boolean z) {
        C18070vi.A0d(cls, 2);
        this.A00 = r2;
        this.A01 = cls;
        this.A03 = z;
    }

    public final void A00() {
        synchronized (this) {
            this.A03 = true;
        }
    }

    public final void A01() {
        synchronized (this) {
            this.A03 = false;
            this.A02 = null;
        }
    }

    public final void A02(AnonymousClass229 r2) {
        synchronized (this) {
            this.A02 = r2;
            A00();
        }
    }

    public boolean equals(Object obj) {
        boolean z;
        synchronized (this) {
            z = false;
            if (obj instanceof AnonymousClass25F) {
                AnonymousClass25F r4 = (AnonymousClass25F) obj;
                if (C42171xk.A00(this.A01, r4.A01) && C42171xk.A00(this.A02, r4.A02)) {
                    z = true;
                }
            }
        }
        return z;
    }

    public int hashCode() {
        int i;
        int hashCode;
        synchronized (this) {
            int hashCode2 = this.A00.hashCode() * 31;
            AnonymousClass229 r0 = this.A02;
            if (r0 != null) {
                i = r0.hashCode();
            } else {
                i = 0;
            }
            hashCode = ((hashCode2 + i) * 31) + this.A01.hashCode();
        }
        return hashCode;
    }
}
