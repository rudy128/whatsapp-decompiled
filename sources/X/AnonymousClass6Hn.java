package X;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6Hn  reason: invalid class name */
public class AnonymousClass6Hn extends AnonymousClass6MX implements AnonymousClass8AI {
    public final C19830z4 A00;
    public final AnonymousClass6pA A01;
    public final AnonymousClass722 A02;
    public final boolean A03;
    public volatile int A04;
    public volatile int A05;
    public volatile List A06 = C17880vN.A0z(0);
    public volatile List A07 = C17880vN.A0z(0);

    public Void A0J(Void... voidArr) {
        AnonymousClass722 r3 = this.A02;
        ArrayList A0D = r3.A0C.A0D(0);
        this.A05 = A0D.size();
        AnonymousClass00H r1 = r3.A0F;
        this.A04 = ((C136976ui) r1.get()).A05().size();
        if (this.A03) {
            this.A06 = C108945cZ.A0w(r1).A0G();
            this.A07 = A0D;
        }
        return super.A0J(voidArr);
    }

    public void Bzq(AnonymousClass725 r5) {
        AnonymousClass722 r3 = this.A02;
        HashSet hashSet = r3.A0I;
        String str = r5.A0H;
        hashSet.remove(str);
        if (r3.A04 != null) {
            for (int i = 0; i < r3.A04.size(); i++) {
                if (AnonymousClass725.A01(str, r3.A04, i)) {
                    r3.A04.set(i, r5);
                    AnonymousClass722.A01(r3, (String) null, r3.A04);
                    return;
                }
            }
        }
    }

    public void Bzr(List list) {
        String str;
        boolean z = true;
        boolean A1R = AnonymousClass000.A1R(this.A04);
        if (this.A05 <= 0) {
            z = false;
        }
        AnonymousClass722 r4 = this.A02;
        r4.A05 = A1R;
        r4.A06 = z;
        this.A01.A00(list.size());
        if (A1R) {
            str = "recents";
        } else if (z) {
            str = "starred";
        } else {
            str = null;
            if (list.size() > 0) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    AnonymousClass725 A0y = C108945cZ.A0y(it);
                    if (A0y.A0S == C108945cZ.A0w(r4.A0F).A09) {
                        str = A0y.A0H;
                        break;
                    }
                }
            }
        }
        HashSet hashSet = r4.A0I;
        hashSet.clear();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            AnonymousClass725 A0y2 = C108945cZ.A0y(it2);
            if (A0y2.A0W) {
                hashSet.add(A0y2.A0H);
            }
        }
        if (str == null) {
            AnonymousClass722.A01(r4, (String) null, list);
        } else {
            AnonymousClass722.A01(r4, str, list);
        }
        if (this.A03) {
            List list2 = this.A06;
            List list3 = this.A07;
            AnonymousClass7MX r1 = r4.A00;
            if (r1 != null) {
                r1.A03(r4.A02(list2, list3));
            }
        }
    }

    public void Bzs() {
        this.A02.A02 = null;
    }

    public void Bzt(String str) {
        AnonymousClass722 r2 = this.A02;
        r2.A0I.remove(str);
        if (r2.A04 != null) {
            for (int i = 0; i < r2.A04.size(); i++) {
                if (AnonymousClass725.A01(str, r2.A04, i)) {
                    r2.A04.remove(i);
                    AnonymousClass722.A01(r2, (String) null, r2.A04);
                    return;
                }
            }
        }
    }

    public AnonymousClass6Hn(C19830z4 r3, AnonymousClass1SB r4, AnonymousClass6pA r5, AnonymousClass722 r6, boolean z) {
        super(r4);
        this.A02 = r6;
        this.A00 = r3;
        this.A01 = r5;
        this.A00 = this;
        this.A03 = z;
    }
}
