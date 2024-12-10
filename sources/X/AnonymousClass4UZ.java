package X;

/* renamed from: X.4UZ  reason: invalid class name */
public final class AnonymousClass4UZ {
    public final C86844Th A00;
    public final AnonymousClass1EC A01;
    public final String A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4UZ) {
                AnonymousClass4UZ r5 = (AnonymousClass4UZ) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A02, r5.A02) || this.A03 != r5.A03) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(C17890vO.A02(this.A02, AnonymousClass000.A0N(this.A00, AnonymousClass000.A0L(this.A01))), this.A03);
    }

    public AnonymousClass4UZ(C86844Th r1, AnonymousClass1EC r2, String str, boolean z) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = str;
        this.A03 = z;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ExitGroupFlowUiState(groupJid=");
        A10.append(this.A01);
        A10.append(", results=");
        A10.append(this.A00);
        A10.append(", blockSpamReportOrigin=");
        A10.append(this.A02);
        A10.append(", isGroupCag=");
        return C17900vP.A0F(A10, this.A03);
    }
}
