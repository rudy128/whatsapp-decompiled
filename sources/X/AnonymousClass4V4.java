package X;

/* renamed from: X.4V4  reason: invalid class name */
public final class AnonymousClass4V4 {
    public final AnonymousClass708 A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final C22821Di A04;
    public final boolean A05;

    public AnonymousClass4V4(AnonymousClass708 r2, String str, String str2, String str3, C22821Di r6, boolean z) {
        C18070vi.A0g(r2, 2, str3);
        this.A05 = z;
        this.A00 = r2;
        this.A03 = str;
        this.A02 = str2;
        this.A01 = str3;
        this.A04 = r6;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4V4) {
                AnonymousClass4V4 r5 = (AnonymousClass4V4) obj;
                if (this.A05 != r5.A05 || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A04, r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A04, C17890vO.A02(this.A01, C17890vO.A02(this.A02, C17890vO.A02(this.A03, AnonymousClass000.A0N(this.A00, AnonymousClass3MX.A03(this.A05))))));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MLScopeStorageModel(isModelMandatory=");
        A10.append(this.A05);
        A10.append(", mlModelV2=");
        A10.append(this.A00);
        A10.append(", userReadableModelName=");
        A10.append(this.A03);
        A10.append(", dialogTitle=");
        A10.append(this.A02);
        A10.append(", dialogMessage=");
        A10.append(this.A01);
        A10.append(", removedListener=");
        return AnonymousClass001.A1F(this.A04, A10);
    }
}
