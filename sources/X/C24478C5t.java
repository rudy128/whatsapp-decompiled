package X;

/* renamed from: X.C5t  reason: case insensitive filesystem */
public abstract class C24478C5t {
    public String A00() {
        if (this instanceof C24089BvH) {
            return "UNKNOWN";
        }
        if (this instanceof C24088BvG) {
            return "S2_RUX";
        }
        if (this instanceof C24087BvF) {
            return "S2_NUX_RUX";
        }
        if (this instanceof C24086BvE) {
            return "S2_NUX";
        }
        if (this instanceof C24085BvD) {
            return "S1_RUX";
        }
        if (this instanceof C24084BvC) {
            return "S1_NUX";
        }
        if (this instanceof C24083BvB) {
            return "MUX_RUX";
        }
        if (this instanceof C24082BvA) {
            return "MUX_NUX_RUX";
        }
        if (this instanceof C24081Bv9) {
            return "MUX_NUX";
        }
        C24080Bv8 bv8 = (C24080Bv8) this;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("INVALID_STATE_TRANSIT: ");
        A10.append(bv8.A01);
        A10.append("->");
        return AnonymousClass000.A0y(bv8.A00, A10);
    }
}
