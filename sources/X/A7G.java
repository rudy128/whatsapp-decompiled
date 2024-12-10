package X;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class A7G {
    public static final String A09 = A5Z.A01("WorkContinuationImpl");
    public boolean A00;
    public BDL A01;
    public final A7W A02;
    public final Integer A03;
    public final String A04;
    public final List A05;
    public final List A06;
    public final List A07;
    public final List A08;

    public static boolean A01(A7G a7g, Set set) {
        List list = a7g.A05;
        set.addAll(list);
        HashSet A002 = A00(a7g);
        for (Object contains : set) {
            if (A002.contains(contains)) {
                return true;
            }
        }
        List<A7G> list2 = a7g.A06;
        if (list2 != null && !list2.isEmpty()) {
            for (A7G A012 : list2) {
                if (A01(A012, set)) {
                    return true;
                }
            }
        }
        set.removeAll(list);
        return false;
    }

    public BDL A02() {
        if (!this.A00) {
            C21471Akc akc = new C21471Akc(this);
            this.A02.A06.BKq(akc);
            this.A01 = (C20346AHc) akc.A01;
        } else {
            A5Z A002 = A5Z.A00();
            String str = A09;
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Already enqueued work ids (");
            A10.append(TextUtils.join(", ", this.A05));
            A002.A06(str, AnonymousClass8BU.A0q(A10));
        }
        return this.A01;
    }

    public A7G(A7W a7w, Integer num, String str, List list, List list2) {
        this.A02 = a7w;
        this.A04 = str;
        this.A03 = num;
        this.A07 = list;
        this.A06 = list2;
        this.A05 = AnonymousClass000.A14(list);
        this.A08 = AnonymousClass000.A13();
        if (list2 != null) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                this.A08.addAll(((A7G) it.next()).A08);
            }
        }
        int i = 0;
        while (i < list.size()) {
            if (num != AnonymousClass00R.A00 || ((C185319cO) list.get(i)).A00.A09 == Long.MAX_VALUE) {
                String A0H = C18070vi.A0H(((C185319cO) list.get(i)).A02);
                this.A05.add(A0H);
                this.A08.add(A0H);
                i++;
            } else {
                throw AnonymousClass000.A0k("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
            }
        }
    }

    public static HashSet A00(A7G a7g) {
        HashSet A12 = C17880vN.A12();
        List<A7G> list = a7g.A06;
        if (list != null && !list.isEmpty()) {
            for (A7G a7g2 : list) {
                A12.addAll(a7g2.A05);
            }
        }
        return A12;
    }

    public final A7G A03(C162248Jv r7) {
        List singletonList = Collections.singletonList(r7);
        if (singletonList.isEmpty()) {
            return this;
        }
        return new A7G(this.A02, AnonymousClass00R.A01, this.A04, singletonList, Collections.singletonList(this));
    }

    public A7G() {
    }
}
