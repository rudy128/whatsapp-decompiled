package X;

/* renamed from: X.6sq  reason: invalid class name and case insensitive filesystem */
public final class C135836sq {
    public final C134826rD A00;
    public final AnonymousClass206 A01;
    public final String A02;
    public final String A03;

    public C135836sq(C134826rD r2, AnonymousClass206 r3, String str, String str2) {
        C18070vi.A0d(str, 1);
        this.A02 = str;
        this.A03 = str2;
        this.A01 = r3;
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C135836sq) {
                C135836sq r5 = (C135836sq) obj;
                if (!C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0N(this.A01, C17890vO.A02(this.A03, C17880vN.A03(this.A02))) + AnonymousClass001.A0k(this.A00);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ContactReactionItem(key=");
        A10.append(this.A02);
        A10.append(", reaction=");
        A10.append(this.A03);
        A10.append(", message=");
        A10.append(this.A01);
        A10.append(", reactionSender=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
