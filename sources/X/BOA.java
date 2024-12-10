package X;

public final class BOA extends C33 {
    public final Integer A00;
    public final String A01;

    public BOA(String str, Integer num) {
        C18070vi.A0d(num, 2);
        this.A01 = str;
        this.A00 = num;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BOA) {
                BOA boa = (BOA) obj;
                if (!C18070vi.A18(this.A01, boa.A01) || this.A00 != boa.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A03 = C17880vN.A03(this.A01);
        Integer num = this.A00;
        return A03 + C72453Mb.A0E(num, C24525C7v.A00(num));
    }
}
