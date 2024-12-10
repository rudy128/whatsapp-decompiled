package X;

/* renamed from: X.9pz  reason: invalid class name and case insensitive filesystem */
public final class C193379pz {
    public final double A00;
    public final double A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C193379pz) {
                C193379pz r7 = (C193379pz) obj;
                if (!(Double.compare(this.A01, r7.A01) == 0 && Double.compare(this.A00, r7.A00) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (AnonymousClass000.A0I(Double.doubleToLongBits(this.A01)) * 31) + AnonymousClass000.A0I(Double.doubleToLongBits(this.A00));
    }

    public C193379pz(double d, double d2) {
        this.A01 = d;
        this.A00 = d2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ArEffectSupportedArEngineVersions(minVersion=");
        A10.append(this.A01);
        A10.append(", maxVersion=");
        A10.append(this.A00);
        return AnonymousClass001.A1J(A10);
    }
}
