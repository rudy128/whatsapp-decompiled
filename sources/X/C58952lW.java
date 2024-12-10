package X;

/* renamed from: X.2lW  reason: invalid class name and case insensitive filesystem */
public final class C58952lW {
    public final C164088Xm A00;
    public final AnonymousClass9KN A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C58952lW) {
                C58952lW r5 = (C58952lW) obj;
                if (this.A01 != r5.A01 || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0L(this.A01) + AnonymousClass001.A0k(this.A00);
    }

    public C58952lW(C164088Xm r1, AnonymousClass9KN r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PlaceholderMessageResendResponseResult(resultType=");
        A10.append(this.A01);
        A10.append(", placeholderMessageResendResponse=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
