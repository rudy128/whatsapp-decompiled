package X;

import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

public class A1I {
    public final C182669Vg A00;
    public final AnonymousClass2YR A01;
    public final C18030ve A02;
    public final C25461Oh A03;
    public final AnonymousClass10I A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;
    public final C189499jL A08;

    public File A01(C0L c0l) {
        File A002 = C198129xp.A00(c0l, (C198129xp) this.A05.get()).A00(c0l);
        if (!A002.exists()) {
            return null;
        }
        return A002;
    }

    public File A02(String str) {
        File A17 = C108945cZ.A17(AnonymousClass001.A1H("/", str, AnonymousClass000.A11(C17880vN.A0e(AnonymousClass8BR.A0t((AnonymousClass118) this.A07.get()), "NetworkResource/Dynamic").getAbsolutePath())));
        if (!A17.exists()) {
            return null;
        }
        return A17;
    }

    public A1I(C182669Vg r1, AnonymousClass2YR r2, C18030ve r3, C189499jL r4, C25461Oh r5, AnonymousClass10I r6, AnonymousClass00H r7, AnonymousClass00H r8, AnonymousClass00H r9) {
        this.A03 = r5;
        this.A02 = r3;
        this.A00 = r1;
        this.A07 = r7;
        this.A04 = r6;
        this.A06 = r8;
        this.A05 = r9;
        this.A08 = r4;
        this.A01 = r2;
    }

    public static void A00(A1I a1i, List list, boolean z) {
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C0L c0l = (C0L) it.next();
                C25461Oh r3 = a1i.A03;
                if (r3.A01(c0l.id) != 3) {
                    Integer num = ((CYT) a1i.A06.get()).A00(c0l).A02;
                    if (num != null) {
                        if (!C18020vd.A05(C18040vf.A02, a1i.A02, num.intValue())) {
                        }
                    }
                    if (z) {
                        a1i.A04.CGF(new C167248fh((C56532hc) a1i.A00.A00.A00.A4G.get(), c0l, (WeakReference) null));
                    } else {
                        a1i.A08.A00(c0l);
                    }
                    r3.A02(c0l.id, 1);
                }
            }
        }
    }
}
