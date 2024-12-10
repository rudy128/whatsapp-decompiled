package X;

/* renamed from: X.8Qy  reason: invalid class name and case insensitive filesystem */
public final class C162518Qy extends C180219Lp {
    public final C19300xz A00;
    public final C180229Lq A01;
    public final Object A02;

    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof C180219Lp)) {
                return false;
            }
            C162518Qy r4 = (C162518Qy) ((C180219Lp) obj);
            if (!this.A02.equals(r4.A02) || !this.A00.equals(r4.A00)) {
                return false;
            }
            C180229Lq r1 = this.A01;
            C180229Lq r0 = r4.A01;
            return r1 == null ? r0 == null : r1.equals(r0);
        }
    }

    public C162518Qy(C19300xz r1, C180229Lq r2, Object obj) {
        this.A02 = obj;
        this.A00 = r1;
        this.A01 = r2;
    }

    public int hashCode() {
        return ((((-721379959 ^ this.A02.hashCode()) * 1000003) ^ this.A00.hashCode()) * 1000003) ^ C17880vN.A02(this.A01);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        AnonymousClass000.A1G(A10, "Event{code=");
        A10.append(", payload=");
        A10.append(this.A02);
        A10.append(", priority=");
        A10.append(this.A00);
        A10.append(", productData=");
        return AnonymousClass8BX.A0d(this.A01, A10);
    }
}
