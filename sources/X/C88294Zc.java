package X;

/* renamed from: X.4Zc  reason: invalid class name and case insensitive filesystem */
public final class C88294Zc {
    public final AnonymousClass1E7 A00;
    public final Integer A01;
    public final Integer A02;

    public C88294Zc() {
        this((AnonymousClass1E7) null, AnonymousClass00R.A00, (Integer) null);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C88294Zc) {
                C88294Zc r5 = (C88294Zc) obj;
                if (this.A01 != r5.A01 || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Integer num = this.A01;
        return (((C72453Mb.A0E(num, A00(num)) * 31) + AnonymousClass001.A0k(this.A02)) * 31) + C17880vN.A02(this.A00);
    }

    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "INITIAL_STATE";
            case 1:
                return "PHOTO_FETCHED";
            case 2:
                return "LOADING_STATE";
            case 3:
                return "SUCCESS_STATE";
            default:
                return "ERROR_STATE";
        }
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("UiState(currentState=");
        A10.append(A00(this.A01));
        A10.append(", errorCode=");
        A10.append(this.A02);
        A10.append(", parentGroupContact=");
        return AnonymousClass001.A1F(this.A00, A10);
    }

    public C88294Zc(AnonymousClass1E7 r1, Integer num, Integer num2) {
        this.A01 = num;
        this.A02 = num2;
        this.A00 = r1;
    }
}
