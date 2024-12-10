package X;

/* renamed from: X.4ii  reason: invalid class name and case insensitive filesystem */
public final class C93274ii implements C106705Ww {
    public final float A00;
    public final AnonymousClass4ZN A01;
    public final Integer A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C93274ii) {
                C93274ii r5 = (C93274ii) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || Float.compare(this.A00, r5.A00) != 0 || !C18070vi.A18(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0B(AnonymousClass000.A0L(this.A01), this.A00) + AnonymousClass001.A0k(this.A02);
    }

    public C93274ii(AnonymousClass4ZN r1, Integer num, float f) {
        this.A01 = r1;
        this.A00 = f;
        this.A02 = num;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("DominantSpeaker(name=");
        A10.append(this.A01);
        A10.append(", audioLevel=");
        A10.append(this.A00);
        A10.append(", colorIndex=");
        return AnonymousClass001.A1F(this.A02, A10);
    }
}
