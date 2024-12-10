package X;

public final class DSD implements Comparable {
    public final byte A00;

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return C18070vi.A00(this.A00 & 255, ((DSD) obj).A00 & 255);
    }

    public boolean equals(Object obj) {
        byte b = this.A00;
        if (!(obj instanceof DSD) || b != ((DSD) obj).A00) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.A00;
    }

    public String toString() {
        return String.valueOf(this.A00 & 255);
    }

    public /* synthetic */ DSD(byte b) {
        this.A00 = b;
    }
}
