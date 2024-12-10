package X;

/* renamed from: X.Cma  reason: case insensitive filesystem */
public final class C25823Cma {
    public final int A00;

    public static final /* synthetic */ C25823Cma A00(int i) {
        return new C25823Cma(i);
    }

    public final /* synthetic */ int A01() {
        return this.A00;
    }

    public int hashCode() {
        return this.A00;
    }

    public boolean equals(Object obj) {
        int i = this.A00;
        if (!(obj instanceof C25823Cma) || i != ((C25823Cma) obj).A00) {
            return false;
        }
        return true;
    }

    public String toString() {
        int i = this.A00;
        if (i == 0) {
            return "Normal";
        }
        if (i == 1) {
            return "Italic";
        }
        return "Invalid";
    }

    public /* synthetic */ C25823Cma(int i) {
        this.A00 = i;
    }
}
