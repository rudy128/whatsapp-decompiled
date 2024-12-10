package X;

/* renamed from: X.BXk  reason: case insensitive filesystem */
public final class C22964BXk extends BYA {
    public final long A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C22964BXk) && this.A00 == ((C22964BXk) obj).A00);
    }

    public C22964BXk(long j) {
        super(1, AnonymousClass00R.A01);
        this.A00 = j;
    }

    public int hashCode() {
        return AnonymousClass000.A0I(this.A00);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("LowBattery(batteryPercent=");
        return C17900vP.A0E(A10, this.A00);
    }
}
