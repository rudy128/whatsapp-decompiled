package X;

/* renamed from: X.Ca3  reason: case insensitive filesystem */
public final class C25152Ca3 {
    public final E9O A00;
    public final String A01;

    public C25152Ca3(E9O e9o, String str) {
        C18070vi.A0d(str, 1);
        this.A01 = str;
        this.A00 = e9o;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25152Ca3) {
                C25152Ca3 ca3 = (C25152Ca3) obj;
                if (!C18070vi.A18(this.A01, ca3.A01) || !C18070vi.A18(this.A00, ca3.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A03(this.A01) + AnonymousClass001.A0k(this.A00);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BloksStackFrame(offset=");
        A10.append(this.A01);
        A10.append(", nextFrame=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
