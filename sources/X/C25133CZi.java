package X;

/* renamed from: X.CZi  reason: case insensitive filesystem */
public final class C25133CZi {
    public final int value;

    public int hashCode() {
        return this.value;
    }

    public boolean equals(Object obj) {
        int i = this.value;
        if (!(obj instanceof C25133CZi) || i != ((C25133CZi) obj).value) {
            return false;
        }
        return true;
    }

    public String toString() {
        int i = this.value;
        if (i == 0) {
            return "None";
        }
        if (i == 1) {
            return "Software";
        }
        if (i == 2) {
            return "Hardware";
        }
        if (i == -1) {
            return "Auto";
        }
        return "Unknown";
    }

    public /* synthetic */ C25133CZi(int i) {
        this.value = i;
    }
}
