package X;

public final class BTH extends C3J {
    public final float A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof BTH) && Float.compare(this.A00, ((BTH) obj).A00) == 0);
    }

    public int hashCode() {
        return AnonymousClass000.A05(this.A00) + 2;
    }

    public BTH(float f) {
        this.A00 = f;
    }
}
