package X;

public final class BWI extends C3V {
    public final C24276ByZ A00;

    public BWI(C24276ByZ byZ) {
        C18070vi.A0d(byZ, 1);
        this.A00 = byZ;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof BWI) && this.A00 == ((BWI) obj).A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }
}
