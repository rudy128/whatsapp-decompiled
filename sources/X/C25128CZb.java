package X;

/* renamed from: X.CZb  reason: case insensitive filesystem */
public final class C25128CZb {
    public final int A00;

    public int hashCode() {
        return this.A00;
    }

    public boolean equals(Object obj) {
        int i = this.A00;
        if (!(obj instanceof C25128CZb) || i != ((C25128CZb) obj).A00) {
            return false;
        }
        return true;
    }

    public String toString() {
        int i = this.A00;
        if (i == 1) {
            return "Hyphens.None";
        }
        if (i == 2) {
            return "Hyphens.Auto";
        }
        if (i == Integer.MIN_VALUE) {
            return "Hyphens.Unspecified";
        }
        return "Invalid";
    }

    public /* synthetic */ C25128CZb(int i) {
        this.A00 = i;
    }
}
