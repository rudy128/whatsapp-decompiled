package X;

/* renamed from: X.0VD  reason: invalid class name */
public final class AnonymousClass0VD implements C16220ru {
    public final float A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass0VD) && AnonymousClass000.A1P(Float.compare(this.A00, ((AnonymousClass0VD) obj).A00)));
    }

    public float CPR(C28644ECa eCa, long j) {
        return eCa.CPQ(this.A00);
    }

    public int hashCode() {
        return Float.floatToIntBits(this.A00);
    }

    public AnonymousClass0VD(float f) {
        this.A00 = f;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CornerSize(size = ");
        A10.append(this.A00);
        return AnonymousClass000.A0y(".dp)", A10);
    }
}
