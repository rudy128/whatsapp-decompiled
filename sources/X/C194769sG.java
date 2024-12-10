package X;

/* renamed from: X.9sG  reason: invalid class name and case insensitive filesystem */
public final class C194769sG {
    public final C192979pL A00;
    public final C195599tb A01;
    public final String A02;
    public final String A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C194769sG) {
                C194769sG r5 = (C194769sG) obj;
                if (!C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A00, AnonymousClass000.A0N(this.A01, C17890vO.A02(this.A03, C17880vN.A03(this.A02))));
    }

    public C194769sG(C192979pL r1, C195599tb r2, String str, String str2) {
        this.A02 = str;
        this.A03 = str2;
        this.A01 = r2;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ArEffectsMaskEffect(id=");
        AnonymousClass8BT.A1W(A10, this.A02);
        A10.append(this.A03);
        A10.append(", bestInstance=");
        A10.append(this.A01);
        A10.append(", thumbnail=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
