package X;

/* renamed from: X.9sF  reason: invalid class name and case insensitive filesystem */
public final class C194759sF {
    public final String A00;
    public final String A01;
    public final C192979pL A02;
    public final String A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C194759sF) {
                C194759sF r5 = (C194759sF) obj;
                if (!C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17890vO.A02(this.A00, C17890vO.A02(this.A01, C17880vN.A03(this.A03))) + AnonymousClass001.A0k(this.A02);
    }

    public C194759sF(C192979pL r1, String str, String str2, String str3) {
        this.A03 = str;
        this.A01 = str2;
        this.A00 = str3;
        this.A02 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MediaEffectInstructionVariant(id=");
        A10.append(this.A03);
        A10.append(", token=");
        A10.append(this.A01);
        A10.append(", text=");
        A10.append(this.A00);
        A10.append(", image=");
        return AnonymousClass001.A1F(this.A02, A10);
    }
}
