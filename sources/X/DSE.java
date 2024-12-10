package X;

public final class DSE implements Comparable {
    public final int A00;

    public int hashCode() {
        return this.A00;
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return C18070vi.A00(this.A00 ^ Integer.MIN_VALUE, ((DSE) obj).A00 ^ Integer.MIN_VALUE);
    }

    public boolean equals(Object obj) {
        int i = this.A00;
        if (!(obj instanceof DSE) || i != ((DSE) obj).A00) {
            return false;
        }
        return true;
    }

    public String toString() {
        return String.valueOf(BE7.A0C(this.A00));
    }

    public /* synthetic */ DSE(int i) {
        this.A00 = i;
    }
}
