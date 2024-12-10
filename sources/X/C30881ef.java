package X;

/* renamed from: X.1ef  reason: invalid class name and case insensitive filesystem */
public final class C30881ef {
    public int A00 = 3;

    public String toString() {
        int i = this.A00;
        if (i == 1) {
            return "available";
        }
        if (i != 3) {
            return "available-waiting-timeout";
        }
        return "un-available";
    }
}
