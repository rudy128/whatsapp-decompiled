package com.whatsapp.payments.ui.viewmodel;

import X.A03;
import X.AnonymousClass10I;
import X.AnonymousClass11P;
import X.AnonymousClass1DT;
import X.AnonymousClass1J2;
import X.AnonymousClass1QS;
import X.AnonymousClass3MW;
import X.AnonymousClass8BR;
import X.AnonymousClass8BS;
import X.AnonymousClass8BU;
import X.AnonymousClass8pI;
import X.C18030ve;
import X.C196079uQ;
import X.C198769ys;
import X.C19962A0v;
import X.C24751Ln;
import X.C33351ig;
import X.C62862s7;
import com.whatsapp.jid.UserJid;
import java.util.concurrent.TimeUnit;

public class PaymentIncentiveViewModel extends AnonymousClass1J2 {
    public final AnonymousClass1DT A00 = AnonymousClass3MW.A0L();
    public final AnonymousClass1DT A01 = AnonymousClass3MW.A0L();
    public final AnonymousClass1DT A02 = AnonymousClass3MW.A0L();
    public final AnonymousClass11P A03;
    public final C196079uQ A04;
    public final AnonymousClass1QS A05;
    public final C33351ig A06;
    public final AnonymousClass10I A07;
    public final C24751Ln A08;

    public static boolean A03(C196079uQ r7, C19962A0v a0v, PaymentIncentiveViewModel paymentIncentiveViewModel) {
        if (r7 == null) {
            return false;
        }
        int A002 = a0v.A00(TimeUnit.MILLISECONDS.toSeconds(AnonymousClass11P.A01(paymentIncentiveViewModel.A03)));
        C18030ve r2 = r7.A07;
        if (!AnonymousClass8BS.A1M(r2) || A002 != 1) {
            return false;
        }
        C198769ys r1 = a0v.A01;
        A03 a03 = a0v.A02;
        return r1 != null && a03 != null && AnonymousClass8BS.A1M(r2) && r1.A05 > ((long) (a03.A01 + a03.A00)) && a03.A04;
    }

    public static int A00(UserJid userJid, PaymentIncentiveViewModel paymentIncentiveViewModel) {
        if (userJid == null) {
            return 6;
        }
        AnonymousClass1QS r3 = paymentIncentiveViewModel.A05;
        AnonymousClass8pI A002 = C62862s7.A00(paymentIncentiveViewModel.A08, AnonymousClass8BR.A0R(r3), userJid);
        long seconds = TimeUnit.MILLISECONDS.toSeconds(AnonymousClass11P.A01(paymentIncentiveViewModel.A03));
        C19962A0v A012 = paymentIncentiveViewModel.A06.A01();
        C196079uQ A0O = AnonymousClass8BU.A0O(r3);
        if (A0O == null) {
            return 6;
        }
        int A003 = A012.A00(seconds);
        C198769ys r7 = A012.A01;
        A03 a03 = A012.A02;
        int i = 6;
        if (r7 != null) {
            char c = 3;
            if (AnonymousClass8BS.A1M(A0O.A07) && a03 != null) {
                if (r7.A05 <= ((long) (a03.A01 + a03.A00))) {
                    c = 2;
                } else if (a03.A04) {
                    c = 1;
                }
            }
            int A013 = A0O.A01(A002, userJid, r7);
            if (!(c == 3 || A013 == 3)) {
                if (c == 2) {
                    i = 4;
                } else if (A013 != 0) {
                    i = 5;
                    if (A013 != 2) {
                        i = 0;
                    }
                } else {
                    i = 3;
                }
            }
        }
        if (A003 == 0) {
            return 6;
        }
        if (A003 == 4) {
            return 1;
        }
        if (A003 == 3) {
            return 6;
        }
        return i;
    }

    public PaymentIncentiveViewModel(AnonymousClass11P r2, C24751Ln r3, AnonymousClass1QS r4, C33351ig r5, AnonymousClass10I r6) {
        this.A03 = r2;
        this.A07 = r6;
        this.A05 = r4;
        this.A08 = r3;
        this.A04 = AnonymousClass8BU.A0O(r4);
        this.A06 = r5;
    }
}
