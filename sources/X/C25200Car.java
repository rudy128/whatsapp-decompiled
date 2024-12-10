package X;

/* renamed from: X.Car  reason: case insensitive filesystem */
public final class C25200Car {
    public int A00;
    public final long A01;
    public final long A02;
    public final String A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C25200Car car = (C25200Car) obj;
            if (!(this.A02 == car.A02 && this.A01 == car.A01 && this.A03.equals(car.A03))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = this.A00;
        if (i != 0) {
            return i;
        }
        int A09 = C108945cZ.A09(this.A03, (((527 + ((int) this.A02)) * 31) + ((int) this.A01)) * 31);
        this.A00 = A09;
        return A09;
    }

    public C25200Car(long j, String str, long j2) {
        this.A03 = str == null ? "" : str;
        this.A02 = j;
        this.A01 = j2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("RangedUri(referenceUri=");
        A10.append(this.A03);
        A10.append(", start=");
        A10.append(this.A02);
        A10.append(", length=");
        A10.append(this.A01);
        return AnonymousClass8BU.A0q(A10);
    }
}
