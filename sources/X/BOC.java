package X;

public final class BOC extends C33 {
    public final Integer A00;
    public final String A01;
    public final boolean A02;
    public final String A03;

    public BOC(Integer num, String str, String str2, boolean z) {
        C18070vi.A0d(num, 3);
        this.A02 = z;
        this.A01 = str;
        this.A00 = num;
        this.A03 = str2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BOC) {
                BOC boc = (BOC) obj;
                if (this.A02 != boc.A02 || !C18070vi.A18(this.A01, boc.A01) || this.A00 != boc.A00 || !C18070vi.A18(this.A03, boc.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A022 = C17890vO.A02(this.A01, AnonymousClass3MX.A03(this.A02));
        Integer num = this.A00;
        return C108945cZ.A09(this.A03, (A022 + C72453Mb.A0E(num, C24525C7v.A00(num))) * 31);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AvatarGenerationEnd(fromCache=");
        A10.append(this.A02);
        A10.append(", requestId=");
        A10.append(this.A01);
        A10.append(", resultCode=");
        A10.append(C24525C7v.A00(this.A00));
        A10.append(", cdlResultCode=");
        return C17900vP.A0B(this.A03, A10);
    }
}
