package X;

public final class CZX {
    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof CZX) && Float.compare(1.0f, 1.0f) == 0 && Float.compare(0.5f, 0.5f) == 0 && Float.compare(8.0f, 8.0f) == 0 && Float.compare(1.5f, 1.5f) == 0);
    }

    public int hashCode() {
        return AnonymousClass000.A0C(AnonymousClass000.A0B(AnonymousClass000.A0B(AnonymousClass000.A0B(31, 1.0f), 0.5f), 8.0f), 1.5f);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        C108975cc.A16(A10, "Rotation(enabled=");
        A10.append(", speed=");
        A10.append(1.0f);
        A10.append(", variance=");
        A10.append(0.5f);
        A10.append(", multiplier2D=");
        A10.append(8.0f);
        A10.append(", multiplier3D=");
        return AnonymousClass001.A1K(A10, 1.5f);
    }
}
