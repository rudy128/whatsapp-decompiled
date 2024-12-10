package X;

/* renamed from: X.4Tu  reason: invalid class name and case insensitive filesystem */
public final class C86974Tu {
    public final int A00;
    public final int A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C86974Tu) {
                C86974Tu r5 = (C86974Tu) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.A01 * 31) + this.A00;
    }

    public C86974Tu(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MultiplePinsIndicatorData(currentPinCountToDisplay=");
        A10.append(this.A01);
        A10.append(", currentMessageIndex=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
