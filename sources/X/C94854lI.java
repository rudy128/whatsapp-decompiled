package X;

/* renamed from: X.4lI  reason: invalid class name and case insensitive filesystem */
public final class C94854lI implements AnonymousClass5XY {
    public final Integer A00;
    public final Integer A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C94854lI) {
                C94854lI r5 = (C94854lI) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (AnonymousClass001.A0k(this.A00) * 31) + C17880vN.A02(this.A01);
    }

    public C94854lI(Integer num, Integer num2) {
        this.A00 = num;
        this.A01 = num2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("FlowsInteractionDetailsBehavior(cardIndex=");
        A10.append(this.A00);
        A10.append(", flowsEntryPoint=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
