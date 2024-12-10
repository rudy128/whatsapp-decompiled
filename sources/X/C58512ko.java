package X;

/* renamed from: X.2ko  reason: invalid class name and case insensitive filesystem */
public class C58512ko {
    public final long A00;
    public final long A01;
    public final Long A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C58512ko r7 = (C58512ko) obj;
            if (!(this.A01 == r7.A01 && this.A00 == r7.A00 && C42171xk.A00(this.A02, r7.A02))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[3];
        C17890vO.A1L(objArr, this.A01);
        C17890vO.A1M(objArr, this.A00);
        return AnonymousClass000.A0P(this.A02, objArr, 2);
    }

    public C58512ko(Long l, long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
        this.A02 = l;
    }
}
