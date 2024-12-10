package X;

/* renamed from: X.9pn  reason: invalid class name and case insensitive filesystem */
public final class C193259pn {
    public final long A00;
    public final long A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !C18070vi.A14(this, obj)) {
                return false;
            }
            C193259pn r7 = (C193259pn) obj;
            if (!(r7.A01 == this.A01 && r7.A00 == this.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass001.A0J(this.A00, AnonymousClass8BV.A00(this.A01));
    }

    public C193259pn(long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PeriodicityInfo{repeatIntervalMillis=");
        A10.append(this.A01);
        A10.append(", flexIntervalMillis=");
        A10.append(this.A00);
        return C17890vO.A0b(A10);
    }
}
