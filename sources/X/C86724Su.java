package X;

/* renamed from: X.4Su  reason: invalid class name and case insensitive filesystem */
public final class C86724Su {
    public final int A00;
    public final Long A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C86724Su) {
                C86724Su r5 = (C86724Su) obj;
                if (this.A00 != r5.A00 || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.A00 * 31) + AnonymousClass001.A0k(this.A01);
    }

    public C86724Su(Long l, int i) {
        this.A00 = i;
        this.A01 = l;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("FlipCameraAccessoryButtonConfiguration(iconRes=");
        A10.append(this.A00);
        A10.append(", rotationAnimationDuration=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
