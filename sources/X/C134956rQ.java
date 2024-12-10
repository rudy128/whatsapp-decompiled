package X;

/* renamed from: X.6rQ  reason: invalid class name and case insensitive filesystem */
public final class C134956rQ {
    public final AnonymousClass206 A00;
    public final AnonymousClass6R8 A01;

    public C134956rQ(AnonymousClass206 r2, AnonymousClass6R8 r3) {
        C18070vi.A0d(r3, 2);
        this.A00 = r2;
        this.A01 = r3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C134956rQ) {
                C134956rQ r5 = (C134956rQ) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, AnonymousClass001.A0k(this.A00) * 31);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("InFlightState(message=");
        A10.append(this.A00);
        A10.append(", state=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
