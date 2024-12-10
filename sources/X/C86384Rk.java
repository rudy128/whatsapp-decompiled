package X;

/* renamed from: X.4Rk  reason: invalid class name and case insensitive filesystem */
public final class C86384Rk {
    public boolean A00;
    public final AEQ A01;

    public C86384Rk(AEQ aeq, boolean z) {
        C18070vi.A0d(aeq, 1);
        this.A01 = aeq;
        this.A00 = z;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C86384Rk)) {
            C86384Rk r4 = (C86384Rk) obj;
            if (this.A00 == r4.A00) {
                return this.A01.equals(r4.A01);
            }
        }
        return false;
    }

    public int hashCode() {
        Object[] A1b = AnonymousClass3MW.A1b();
        A1b[0] = this.A01;
        return AnonymousClass000.A0P(Boolean.valueOf(this.A00), A1b, 1);
    }
}
