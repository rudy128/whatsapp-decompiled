package X;

/* renamed from: X.6HQ  reason: invalid class name */
public final class AnonymousClass6HQ extends C123226Tp {
    public final int A00;
    public final AnonymousClass778 A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6HQ) {
                AnonymousClass6HQ r5 = (AnonymousClass6HQ) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0L(this.A01) + this.A00;
    }

    public AnonymousClass6HQ(AnonymousClass778 r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CreateYourOwn(funStickerData=");
        A10.append(this.A01);
        A10.append(", origin=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
