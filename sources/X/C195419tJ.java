package X;

/* renamed from: X.9tJ  reason: invalid class name and case insensitive filesystem */
public final class C195419tJ {
    public String A00;
    public final int A01;
    public final C195419tJ A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public C195419tJ(C195419tJ r2, String str, String str2, String str3, String str4, int i) {
        C18070vi.A0d(str4, 5);
        this.A00 = str;
        this.A04 = str2;
        this.A05 = str3;
        this.A03 = str4;
        this.A02 = r2;
        this.A01 = i;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C195419tJ) {
                C195419tJ r5 = (C195419tJ) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A04, r5.A04) || !C18070vi.A18(this.A05, r5.A05) || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A02, r5.A02) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((C17890vO.A02(this.A03, ((((C17900vP.A00(this.A00) * 31) + C17900vP.A00(this.A04)) * 31) + C17900vP.A00(this.A05)) * 31 * 31) + C17880vN.A02(this.A02)) * 31) + this.A01;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ValidationError(type=");
        A10.append(this.A00);
        A10.append(", field=");
        A10.append(this.A04);
        A10.append(", rule=");
        A10.append(this.A05);
        C108975cc.A17(A10, ", id=");
        A10.append(", error=");
        A10.append(this.A03);
        A10.append(", cause=");
        A10.append(this.A02);
        A10.append(", e2eFailureReason=");
        return AnonymousClass001.A1L(A10, this.A01);
    }
}
