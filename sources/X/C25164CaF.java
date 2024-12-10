package X;

/* renamed from: X.CaF  reason: case insensitive filesystem */
public final class C25164CaF {
    public final C23681Bno A00;
    public final C25188Cae A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25164CaF) {
                C25164CaF caF = (C25164CaF) obj;
                if (!C18070vi.A18(this.A01, caF.A01) || !C18070vi.A18(this.A00, caF.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A00, AnonymousClass001.A0k(this.A01) * 31);
    }

    public C25164CaF(C23681Bno bno, C25188Cae cae) {
        this.A01 = cae;
        this.A00 = bno;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BloksTreeUpdateOperation(treeModification=");
        A10.append(this.A01);
        A10.append(", variableUpdate=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
