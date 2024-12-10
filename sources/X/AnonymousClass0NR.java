package X;

/* renamed from: X.0NR  reason: invalid class name */
public final class AnonymousClass0NR {
    public AnonymousClass0QI A00;
    public boolean A01;
    public C27069DRu A02;
    public final C27069DRu A03;

    public /* synthetic */ AnonymousClass0NR(C27069DRu dRu, C27069DRu dRu2) {
        this((AnonymousClass0QI) null, dRu, dRu2, false);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass0NR) {
                AnonymousClass0NR r5 = (AnonymousClass0NR) obj;
                if (!C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A02, r5.A02) || this.A01 != r5.A01 || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0DV.A00(AnonymousClass000.A0N(this.A02, AnonymousClass000.A0L(this.A03)), this.A01) + AnonymousClass001.A0k(this.A00);
    }

    public final C27069DRu A00() {
        return this.A02;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("TextSubstitutionValue(original=");
        A10.append(this.A03);
        A10.append(", substitution=");
        A10.append(this.A02);
        A10.append(", isShowingSubstitution=");
        A10.append(this.A01);
        A10.append(", layoutCache=");
        return AnonymousClass001.A1F(this.A00, A10);
    }

    public final void A01(C27069DRu dRu) {
        this.A02 = dRu;
    }

    public AnonymousClass0NR(AnonymousClass0QI r3, C27069DRu dRu, C27069DRu dRu2, boolean z) {
        this.A03 = dRu;
        this.A02 = dRu2;
        this.A01 = false;
        this.A00 = null;
    }
}
