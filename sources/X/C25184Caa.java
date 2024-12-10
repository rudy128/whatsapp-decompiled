package X;

/* renamed from: X.Caa  reason: case insensitive filesystem */
public final class C25184Caa {
    public final C24327BzO A00;
    public final String A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25184Caa) {
                C25184Caa caa = (C25184Caa) obj;
                if (!C18070vi.A18(this.A02, caa.A02) || !C18070vi.A18(this.A01, caa.A01) || this.A00 != caa.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A00, C17890vO.A02(this.A01, C17880vN.A03(this.A02)));
    }

    public C25184Caa(C24327BzO bzO, String str, String str2) {
        C18070vi.A0j(str, str2);
        this.A02 = str;
        this.A01 = str2;
        this.A00 = bzO;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PrefetchChoice(categoryId=");
        A10.append(this.A02);
        A10.append(", choiceId=");
        A10.append(this.A01);
        A10.append(", priority=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
