package X;

public final class BY9 extends BYB {
    public final long A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof BY9) && this.A00 == ((BY9) obj).A00);
    }

    public BY9(long j) {
        super(1, AnonymousClass00R.A00);
        this.A00 = j;
    }

    public int hashCode() {
        return AnonymousClass000.A0I(this.A00);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("FullBattery(batteryPercent=");
        return C17900vP.A0E(A10, this.A00);
    }

    public BY9() {
        this(100);
    }
}
