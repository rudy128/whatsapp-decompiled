package X;

import com.whatsapp.jid.PhoneUserJid;

public final class A0E {
    public final AnonymousClass11P A00;
    public final AnonymousClass1QB A01;
    public final AnonymousClass1Q2 A02;
    public final C33301ib A03;
    public final AnonymousClass1QS A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass11S A06;

    public final synchronized void A01(AnonymousClass206 r13) {
        String str;
        AnonymousClass1KN r0;
        C18070vi.A0d(r13, 0);
        AW0 A002 = AnonymousClass25B.A00(r13);
        if (!(A002 == null || (str = A002.A0M) == null || str.length() == 0)) {
            AnonymousClass1QR A0O = AnonymousClass8BR.A0O(this.A04);
            C18070vi.A0X(A0O);
            AW0 A0J = AnonymousClass8BU.A0J(A0O, A002.A0M, (String) null);
            if (A0J != null) {
                AnonymousClass206 A003 = AnonymousClass8BR.A0N(this.A05).A00(A0J);
                if (A002.A0F()) {
                    int i = A0J.A02;
                    AnonymousClass1KN r1 = A002.A09;
                    if (!(i == 18 || (r0 = A0J.A09) == null || !r0.equals(r1))) {
                        if (A003 != null) {
                            if (A002.A0L()) {
                                A0J.A02 = 17;
                                A0J.A06 = AnonymousClass11P.A01(this.A00);
                                AnonymousClass25B.A02(A0J, A003);
                            }
                            AnonymousClass205 r7 = A003.A0v;
                            AW0 A004 = AnonymousClass25B.A00(A003);
                            C17960vV.A07(A004);
                            if (A0O.A0f(A004, r7, i, 0, 0)) {
                                StringBuilder A10 = AnonymousClass000.A10();
                                A10.append("msgStore/markPaymentRequestMessageFulfilled request message id: ");
                                AnonymousClass8BS.A1G("CoreMessageStore", AnonymousClass000.A0y(A0J.A0L, A10));
                                this.A02.A01(A003, 16);
                            }
                        } else {
                            if (A002.A0L()) {
                                A0J.A02 = 17;
                                A0J.A06 = AnonymousClass11P.A01(this.A00);
                            }
                            if (A0O.A0c(A0J)) {
                                StringBuilder A102 = AnonymousClass000.A10();
                                A102.append("msgStore/markPaymentRequestMessageFulfilled/ request message id: ");
                                AnonymousClass8BS.A1G("CoreMessageStore", AnonymousClass000.A0y(A0J.A0L, A102));
                                C33301ib r3 = this.A03;
                                r3.A06.CGF(new C70653Bz(r3, A0J, 25));
                            }
                        }
                    }
                } else if (A003 != null) {
                    StringBuilder A103 = AnonymousClass000.A10();
                    A103.append("msgStore/markPaymentRequestMessageFulfilled/ request message id: ");
                    A103.append(A0J.A0L);
                    A103.append(" status: ");
                    AnonymousClass8BS.A1G("PaymentRequestMessageManager", C17880vN.A0t(A103, A002.A02));
                    this.A02.A01(A003, 16);
                }
                this.A01.A0L(A003);
            }
        }
    }

    public static final boolean A00(A0E a0e, AW0 aw0, AnonymousClass206 r4) {
        int i;
        PhoneUserJid A002 = AnonymousClass11S.A00(a0e.A06);
        if (A002 == null || (C22971Dz.A0e(r4.A0v.A00) && !A002.equals(aw0.A0E) && !A002.equals(aw0.A0D))) {
            return false;
        }
        if (r4 instanceof AnonymousClass21G) {
            i = 15;
        } else if (r4 instanceof AnonymousClass21I) {
            i = 18;
        } else {
            throw AnonymousClass000.A0n(AnonymousClass1QE.A01("CoreMessageStore", "Handled message is not FMessagePaymentRequestDeclined or FMessagePaymentRequestCancelled"));
        }
        aw0.A02 = i;
        return true;
    }

    public A0E(AnonymousClass11S r1, AnonymousClass11P r2, AnonymousClass1QB r3, AnonymousClass1Q2 r4, C33301ib r5, AnonymousClass1QS r6, AnonymousClass00H r7) {
        C18070vi.A0w(r2, r1, r4, r3, r6);
        C18070vi.A0l(r7, r5);
        this.A00 = r2;
        this.A06 = r1;
        this.A02 = r4;
        this.A01 = r3;
        this.A04 = r6;
        this.A05 = r7;
        this.A03 = r5;
    }
}
