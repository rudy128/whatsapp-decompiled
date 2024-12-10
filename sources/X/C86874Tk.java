package X;

/* renamed from: X.4Tk  reason: invalid class name and case insensitive filesystem */
public final class C86874Tk {
    public final int A00;
    public final Object A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C86874Tk) {
                C86874Tk r5 = (C86874Tk) obj;
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

    public C86874Tk(int i, Object obj) {
        this.A00 = i;
        this.A01 = obj;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Item(type=");
        A10.append(this.A00);
        A10.append(", data=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
