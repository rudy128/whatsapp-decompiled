package X;

/* renamed from: X.42t  reason: invalid class name and case insensitive filesystem */
public final class C821242t extends C83284En {
    public final int A00;
    public final Integer A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C821242t) {
                C821242t r5 = (C821242t) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (AnonymousClass001.A0k(this.A01) * 31) + this.A00;
    }

    public C821242t(int i, Integer num) {
        this.A01 = num;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("StickerSent(stickerSendOriginType=");
        A10.append(this.A01);
        A10.append(", position=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
