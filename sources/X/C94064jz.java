package X;

/* renamed from: X.4jz  reason: invalid class name and case insensitive filesystem */
public final class C94064jz implements AnonymousClass5XE {
    public final int A00;
    public final AnonymousClass1E7 A01;
    public final AnonymousClass4ZN A02;
    public final C22821Di A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C94064jz) {
                C94064jz r5 = (C94064jz) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A02, r5.A02) || this.A00 != r5.A00 || !C18070vi.A18(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A03, (((AnonymousClass000.A0L(this.A01) + AnonymousClass001.A0k(this.A02)) * 31) + this.A00) * 31);
    }

    public C94064jz(AnonymousClass1E7 r1, AnonymousClass4ZN r2, C22821Di r3, int i) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = i;
        this.A03 = r3;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Group(contact=");
        A10.append(this.A01);
        A10.append(", name=");
        A10.append(this.A02);
        A10.append(", itemCount=");
        A10.append(this.A00);
        A10.append(", onClick=");
        return AnonymousClass001.A1F(this.A03, A10);
    }
}
