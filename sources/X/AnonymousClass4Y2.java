package X;

/* renamed from: X.4Y2  reason: invalid class name */
public final class AnonymousClass4Y2 {
    public final float A00;

    public AnonymousClass4Y2() {
        this(0.0f);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass4Y2) && Float.compare(this.A00, ((AnonymousClass4Y2) obj).A00) == 0);
    }

    public int hashCode() {
        return Float.floatToIntBits(this.A00);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AudioLevel(botAudioLevel=");
        return AnonymousClass001.A1K(A10, this.A00);
    }

    public AnonymousClass4Y2(float f) {
        this.A00 = f;
    }
}
