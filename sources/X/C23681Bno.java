package X;

/* renamed from: X.Bno  reason: case insensitive filesystem */
public final class C23681Bno extends C4D {
    public final Object A00;
    public final String A01;

    public C23681Bno(String str, Object obj) {
        C18070vi.A0d(str, 1);
        this.A01 = str;
        this.A00 = obj;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C23681Bno) {
                C23681Bno bno = (C23681Bno) obj;
                if (!C18070vi.A18(this.A01, bno.A01) || !C18070vi.A18(this.A00, bno.A00)) {
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
        A10.append("VariableUpdate(variableIdentifier=");
        A10.append(this.A01);
        A10.append(", value=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
