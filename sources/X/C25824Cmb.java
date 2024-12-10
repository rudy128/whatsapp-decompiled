package X;

/* renamed from: X.Cmb  reason: case insensitive filesystem */
public final class C25824Cmb {
    public final int A00;

    public static final /* synthetic */ C25824Cmb A00(int i) {
        return new C25824Cmb(i);
    }

    public final /* synthetic */ int A01() {
        return this.A00;
    }

    public int hashCode() {
        return this.A00;
    }

    public boolean equals(Object obj) {
        int i = this.A00;
        if (!(obj instanceof C25824Cmb) || i != ((C25824Cmb) obj).A00) {
            return false;
        }
        return true;
    }

    public String toString() {
        int i = this.A00;
        if (i == 0) {
            return "None";
        }
        if (i == 1) {
            return "All";
        }
        if (i == 2) {
            return "Weight";
        }
        if (i == 3) {
            return "Style";
        }
        return "Invalid";
    }

    public /* synthetic */ C25824Cmb(int i) {
        this.A00 = i;
    }
}
