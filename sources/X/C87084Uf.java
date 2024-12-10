package X;

/* renamed from: X.4Uf  reason: invalid class name and case insensitive filesystem */
public final class C87084Uf {
    public final int A00;
    public final String A01;
    public final C22821Di A02;
    public final C87704Wq A03;

    public C87084Uf(C87704Wq r2, String str, C22821Di r4, int i) {
        C18070vi.A0d(str, 2);
        this.A00 = i;
        this.A01 = str;
        this.A03 = r2;
        this.A02 = r4;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C87084Uf) {
                C87084Uf r5 = (C87084Uf) obj;
                if (this.A00 != r5.A00 || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A02, AnonymousClass000.A0N(this.A03, C17890vO.A02(this.A01, this.A00 * 31)));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("DogfoodDiagnosticsReportUiState(reportType=");
        A10.append(this.A00);
        A10.append(", description=");
        A10.append(this.A01);
        A10.append(", debugInfosManager=");
        A10.append(this.A03);
        A10.append(", onSelected=");
        return AnonymousClass001.A1F(this.A02, A10);
    }
}
