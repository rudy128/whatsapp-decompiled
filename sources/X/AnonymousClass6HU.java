package X;

/* renamed from: X.6HU  reason: invalid class name */
public final class AnonymousClass6HU extends C123236Tq {
    public final C136636u8 A00;
    public final AnonymousClass1E7 A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6HU) {
                AnonymousClass6HU r5 = (AnonymousClass6HU) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0L(this.A00) + AnonymousClass001.A0k(this.A01);
    }

    public AnonymousClass6HU(AnonymousClass1E7 r1, C136636u8 r2) {
        this.A00 = r2;
        this.A01 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Success(stickerInfo=");
        C108965cb.A1R(this.A00, A10);
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
