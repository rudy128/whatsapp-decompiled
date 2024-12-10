package X;

import android.app.Application;
import com.whatsapp.jid.UserJid;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.8F7  reason: invalid class name */
public class AnonymousClass8F7 extends AnonymousClass8FK {
    public final AnonymousClass1DT A00 = AnonymousClass3MW.A0L();
    public final C196149uX A01;
    public final C26911Ty A02;
    public final UserJid A03;
    public final AnonymousClass11S A04;
    public final AnonymousClass1M6 A05;
    public final C39511tC A06;
    public final C18030ve A07;
    public final AnonymousClass10I A08;

    private void A03(C194209rM r4, Set set) {
        if (C18020vd.A05(C18040vf.A02, this.A07, 4983)) {
            for (Object add : r4.A02) {
                set.add(add);
            }
        }
    }

    public void A0S() {
        this.A06.unregisterObserver(this.A05);
    }

    public void A0V() {
        C21424Ajr.A00(this.A08, this, 29);
    }

    public AnonymousClass8F7(Application application, AnonymousClass11S r4, C196149uX r5, C26911Ty r6, C39511tC r7, C18030ve r8, UserJid userJid, AnonymousClass10I r10) {
        super(application);
        C20479AMq aMq = new C20479AMq(this, 0);
        this.A05 = aMq;
        this.A07 = r8;
        this.A08 = r10;
        this.A04 = r4;
        this.A02 = r6;
        this.A06 = r7;
        this.A01 = r5;
        this.A03 = userJid;
        r7.registerObserver(aMq);
    }

    public static long A00(String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C194209rM A0J = AnonymousClass8BR.A0J(it);
            if (A0J.A01.A0H.equals(str)) {
                return A0J.A00;
            }
        }
        return 0;
    }

    public String A0T(C18000vb r6, List list) {
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            i = (int) (((long) i) + AnonymousClass8BR.A0J(it).A00);
        }
        C18070vi.A0d(r6, 0);
        if (i == 0) {
            return "";
        }
        if (i <= 999) {
            String format = r6.A0L().format((long) i);
            C18070vi.A0b(format);
            return format;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(r6.A0L().format(999));
        return C17890vO.A0c(A10, '+');
    }

    public HashSet A0U(List list, List list2) {
        HashSet A12 = C17880vN.A12();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C194209rM A0J = AnonymousClass8BR.A0J(it);
            A12.add(A0J.A01.A0H);
            A03(A0J, A12);
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            C194209rM A0J2 = AnonymousClass8BR.A0J(it2);
            A12.add(A0J2.A01.A0H);
            A03(A0J2, A12);
        }
        return A12;
    }
}
