package X;

/* renamed from: X.Bnp  reason: case insensitive filesystem */
public final class C23682Bnp extends C4D {
    public final Object A00;
    public final Object A01;
    public final String A02;
    public final String A03;

    public C23682Bnp(Object obj, Object obj2, String str, String str2) {
        C18070vi.A0d(str2, 3);
        this.A02 = str;
        this.A00 = obj;
        this.A03 = str2;
        this.A01 = obj2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C23682Bnp) {
                C23682Bnp bnp = (C23682Bnp) obj;
                if (!C18070vi.A18(this.A02, bnp.A02) || !C18070vi.A18(this.A00, bnp.A00) || !C18070vi.A18(this.A03, bnp.A03) || !C18070vi.A18(this.A01, bnp.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17890vO.A02(this.A03, AnonymousClass000.A0N(this.A00, C17880vN.A03(this.A02))) + AnonymousClass001.A0k(this.A01);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SnapshotAndVariableUpdate(dataModuleType=");
        A10.append(this.A02);
        A10.append(", snapshot=");
        A10.append(this.A00);
        A10.append(", variableIdentifier=");
        A10.append(this.A03);
        A10.append(", value=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
