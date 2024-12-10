package X;

/* renamed from: X.4Ty  reason: invalid class name and case insensitive filesystem */
public final class C87014Ty {
    public final Integer A00;
    public final String A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C87014Ty) {
                C87014Ty r5 = (C87014Ty) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A02, r5.A02) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A022 = C17890vO.A02(this.A02, C17880vN.A03(this.A01));
        Integer num = this.A00;
        int i = 0;
        if (num != null) {
            i = 79627 + num.intValue();
        }
        return A022 + i;
    }

    public C87014Ty(Integer num, String str, String str2) {
        C18070vi.A0j(str, str2);
        this.A01 = str;
        this.A02 = str2;
        this.A00 = num;
    }

    public String toString() {
        String str;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BlockReason(code=");
        A10.append(this.A01);
        A10.append(", reason=");
        A10.append(this.A02);
        A10.append(", messageType=");
        if (this.A00 != null) {
            str = "Otp";
        } else {
            str = "null";
        }
        return C17900vP.A0B(str, A10);
    }
}
