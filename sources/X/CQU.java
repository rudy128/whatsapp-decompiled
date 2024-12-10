package X;

public final class CQU {
    public final C24296Byt A00;
    public final C62602rf A01;
    public final C188829i3 A02;

    public CQU(C62602rf r3, C188829i3 r4, String str, boolean z) {
        C24296Byt byt;
        C18070vi.A0d(str, 1);
        this.A01 = r3;
        this.A02 = r4;
        if (!z) {
            byt = C24296Byt.INVALID_PHONE_NUMBER;
        } else {
            if (r3 != null) {
                if (!r3.A00()) {
                    byt = C24296Byt.FAILURE_NEED_TO_RETRY;
                } else if (r4 != null) {
                    if (r4.A04 == 1) {
                        byt = C24296Byt.SUCCESS_USER_IN_WA;
                    } else {
                        byt = C24296Byt.SUCCESS_USER_NOT_IN_WA;
                    }
                }
            }
            byt = C24296Byt.INVALID_STATE;
        }
        this.A00 = byt;
    }
}
