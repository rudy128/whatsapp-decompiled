package X;

/* renamed from: X.6tL  reason: invalid class name and case insensitive filesystem */
public final class C136146tL {
    public final int A00;
    public final Long A01;
    public final Long A02;
    public final Long A03;
    public final String A04;
    public final String A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C136146tL) {
                C136146tL r5 = (C136146tL) obj;
                if (!C18070vi.A18(this.A04, r5.A04) || !C18070vi.A18(this.A05, r5.A05) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A03, r5.A03) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((C17890vO.A02(this.A05, C17880vN.A03(this.A04)) + AnonymousClass001.A0k(this.A01)) * 31) + AnonymousClass001.A0k(this.A02)) * 31) + C17880vN.A02(this.A03)) * 31) + this.A00;
    }

    public C136146tL(Long l, Long l2, Long l3, String str, String str2, int i) {
        this.A04 = str;
        this.A05 = str2;
        this.A01 = l;
        this.A02 = l2;
        this.A03 = l3;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("FlowsDatePickerInputParams(inputName=");
        A10.append(this.A04);
        A10.append(", inputType=");
        A10.append(this.A05);
        A10.append(", initialTsInMillis=");
        A10.append(this.A01);
        A10.append(", maxTsInMillis=");
        A10.append(this.A02);
        A10.append(", minTsInMillis=");
        A10.append(this.A03);
        A10.append(", flowsDatePickerMode=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
