package X;

import android.app.Application;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public final class A6E {
    public final Application A00;
    public final AnonymousClass11S A01;
    public final C18000vb A02;

    public static final BigDecimal A02(List list) {
        C18070vi.A0d(list, 0);
        BigDecimal bigDecimal = new BigDecimal(0);
        Iterator it = list.iterator();
        A6S a6s = null;
        while (it.hasNext()) {
            C194209rM A0J = AnonymousClass8BR.A0J(it);
            C20287AEv aEv = A0J.A01;
            long j = A0J.A00;
            A6S a6s2 = aEv.A07;
            BigDecimal bigDecimal2 = aEv.A09;
            if (bigDecimal2 == null || a6s2 == null || (a6s != null && !a6s.equals(a6s2))) {
                return null;
            }
            BigDecimal valueOf = BigDecimal.valueOf(j);
            C18070vi.A0X(valueOf);
            BigDecimal multiply = bigDecimal2.multiply(valueOf);
            C18070vi.A0X(multiply);
            bigDecimal = bigDecimal.add(multiply);
            C18070vi.A0X(bigDecimal);
            a6s = a6s2;
        }
        return bigDecimal;
    }

    public final String A04(BigDecimal bigDecimal, List list, boolean z) {
        A6S a6s;
        ADV adv = (ADV) C29431cG.A0c(list);
        if (adv != null) {
            a6s = adv.A01;
        } else {
            a6s = null;
        }
        if (bigDecimal == null || a6s == null || bigDecimal.compareTo(BigDecimal.ZERO) < 0) {
            return null;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        if (z) {
            A10.append(8722);
        }
        String A0y = AnonymousClass000.A0y(a6s.A03(this.A02, bigDecimal, true), A10);
        C18070vi.A0X(A0y);
        return A0y;
    }

    public A6E(Application application, AnonymousClass11S r2, C18000vb r3) {
        C18070vi.A0o(application, r3, r2);
        this.A00 = application;
        this.A02 = r3;
        this.A01 = r2;
    }

    public static final BigDecimal A00(C195679tj r5, BigDecimal bigDecimal, BigDecimal bigDecimal2, List list) {
        A6S a6s;
        float f;
        BigDecimal subtract;
        ADV adv = (ADV) C29431cG.A0c(list);
        if (adv != null) {
            a6s = adv.A01;
        } else {
            a6s = null;
        }
        if (bigDecimal == null || r5 == null || a6s == null) {
            return null;
        }
        int i = r5.A00;
        if (i == 1) {
            return C197309wU.A00(a6s, C17900vP.A01(AnonymousClass1YD.A04(r5.A03)));
        }
        if (i != 2) {
            return null;
        }
        if (!(bigDecimal2 == null || (subtract = bigDecimal.subtract(bigDecimal2)) == null)) {
            bigDecimal = subtract;
        }
        int A002 = A6S.A00(a6s.A00);
        String str = r5.A03;
        Float f2 = null;
        try {
            if (C182189Tk.A00.A03(str)) {
                f2 = Float.valueOf(Float.parseFloat(str));
                if (f2 != null) {
                    f = f2.floatValue();
                    BigDecimal multiply = bigDecimal.multiply(new BigDecimal(String.valueOf(((double) f) / 100.0d)));
                    C18070vi.A0X(multiply);
                    return multiply.setScale(A002, RoundingMode.UP);
                }
            }
        } catch (NumberFormatException unused) {
        }
        f = 0.0f;
        BigDecimal multiply2 = bigDecimal.multiply(new BigDecimal(String.valueOf(((double) f) / 100.0d)));
        C18070vi.A0X(multiply2);
        return multiply2.setScale(A002, RoundingMode.UP);
    }

    public static final BigDecimal A01(Date date, List list) {
        A6S a6s;
        boolean A15 = C18070vi.A15(list, date);
        C194209rM r0 = (C194209rM) C29431cG.A0c(list);
        if (r0 != null) {
            a6s = r0.A01.A07;
        } else {
            a6s = null;
        }
        BigDecimal bigDecimal = new BigDecimal(A15 ? 1 : 0);
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                C194209rM A0J = AnonymousClass8BR.A0J(it);
                C20287AEv aEv = A0J.A01;
                long j = A0J.A00;
                if (!C18070vi.A18(a6s, aEv.A07)) {
                    break;
                }
                BigDecimal A002 = AnonymousClass9PG.A00(aEv.A04, aEv.A09, date);
                BigDecimal bigDecimal2 = aEv.A09;
                if (!(A002 == null || bigDecimal2 == null)) {
                    BigDecimal subtract = bigDecimal2.subtract(A002);
                    C18070vi.A0X(subtract);
                    if (subtract.compareTo(BigDecimal.ZERO) > 0) {
                        BigDecimal subtract2 = bigDecimal2.subtract(A002);
                        C18070vi.A0X(subtract2);
                        BigDecimal valueOf = BigDecimal.valueOf(j);
                        C18070vi.A0X(valueOf);
                        BigDecimal multiply = subtract2.multiply(valueOf);
                        C18070vi.A0X(multiply);
                        bigDecimal = bigDecimal.add(multiply);
                        C18070vi.A0X(bigDecimal);
                    }
                }
            } else if (bigDecimal.compareTo(BigDecimal.ZERO) > 0) {
                return bigDecimal;
            }
        }
        return null;
    }

    public final String A03(BigDecimal bigDecimal, BigDecimal bigDecimal2, List list) {
        A6S a6s;
        BigDecimal subtract;
        ADV adv = (ADV) C29431cG.A0c(list);
        if (adv != null) {
            a6s = adv.A01;
        } else {
            a6s = null;
        }
        if (bigDecimal == null || a6s == null) {
            return null;
        }
        if (!(bigDecimal2 == null || (subtract = bigDecimal.subtract(bigDecimal2)) == null)) {
            bigDecimal = subtract;
        }
        return A04(bigDecimal, list, false);
    }
}
