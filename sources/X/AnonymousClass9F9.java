package X;

/* renamed from: X.9F9  reason: invalid class name */
public final class AnonymousClass9F9 extends AnonymousClass9CP {
    public final AnonymousClass9D9 A00;
    public final AnonymousClass9DG A01;

    public AnonymousClass9F9(C29621ca r24, AnonymousClass9F1 r25) {
        C29621ca r5 = r24;
        C108945cZ.A1N(r5);
        C29621ca r11 = r25.A00;
        C62672rm A0s = AnonymousClass8BR.A0s();
        String[] strArr = {"account", "action"};
        Class<String> cls = String.class;
        String[] strArr2 = new String[2];
        strArr2[0] = "account";
        Long A0Z = AnonymousClass8BW.A0Z("action", strArr2, 1);
        Long A0j = AnonymousClass8BU.A0j();
        Object A05 = A0s.A05(r11, cls, A0Z, A0j, (Object) null, strArr2, false);
        if (A05 == null) {
            throw AnonymousClass1O9.A00(A0s);
        } else if (A0s.A05(r5, cls, A0Z, A0j, A05, strArr, true) != null) {
            A8Z a8z = A8Z.A00;
            String[] strArr3 = {"account", "custom_payment_method"};
            C29621ca r2 = r5;
            int i = 0;
            while (true) {
                C29621ca A0Q = AnonymousClass8BS.A0Q(r2, strArr3, i);
                if (A0Q == null) {
                    AnonymousClass8BY.A11(r2, A0s, strArr3, i);
                    break;
                }
                i++;
                r2 = A0Q;
                if (i >= 2) {
                    C18070vi.A0d(a8z, 0);
                    AnonymousClass9D9 A03 = A8Z.A03(A0Q, A0s);
                    if (A03 != null) {
                        this.A00 = A03;
                        C18070vi.A0d(r11, 1);
                        AnonymousClass9DG A002 = A8Z.A00(r5, r11, A0s);
                        if (A002 != null) {
                            this.A01 = A002;
                            this.A00 = r5;
                            return;
                        }
                        throw AnonymousClass1O9.A00(A0s);
                    }
                }
            }
            throw AnonymousClass1O9.A00(A0s);
        } else {
            throw AnonymousClass1O9.A00(A0s);
        }
    }
}
