package X;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* renamed from: X.AHl  reason: case insensitive filesystem */
public class C20355AHl implements C22531BBo, C22398B6b, AnonymousClass86L {
    public static final String A0E = A5Z.A01("GreedyScheduler");
    public Boolean A00;
    public boolean A01;
    public C198379yF A02;
    public final Context A03;
    public final AnonymousClass00I A04;
    public final C20359AHp A05;
    public final C22399B6c A06;
    public final C191229mE A07;
    public final Object A08 = C17880vN.A0p();
    public final Map A09 = C17880vN.A11();
    public final Map A0A = C17880vN.A11();
    public final AnonymousClass9u6 A0B = new AnonymousClass9u6();
    public final C189179ie A0C;
    public final C71973Kb A0D;

    public boolean Bcf() {
        return false;
    }

    public void BEL(String str) {
        Runnable runnable;
        Boolean bool = this.A00;
        if (bool == null) {
            bool = Boolean.valueOf(C197049w4.A00(this.A03, this.A04));
            this.A00 = bool;
        }
        if (!bool.booleanValue()) {
            A5Z.A00().A05(A0E, "Ignoring schedule request in non-main process");
            return;
        }
        if (!this.A01) {
            this.A05.A02(this);
            this.A01 = true;
        }
        A5Z A002 = A5Z.A00();
        String str2 = A0E;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Cancelling work ID ");
        AnonymousClass8BW.A16(A002, str, str2, A10);
        C198379yF r2 = this.A02;
        if (!(r2 == null || (runnable = (Runnable) r2.A02.remove(str)) == null)) {
            ((C20348AHe) r2.A00).A00.removeCallbacks(runnable);
        }
        for (AnonymousClass9UL r22 : this.A0B.A02(str)) {
            this.A07.A00(r22);
            C22399B6c b6c = this.A06;
            C18070vi.A0d(r22, 1);
            b6c.COf(r22, -512);
        }
    }

    public void BtY(C193279pp r7, boolean z) {
        AnonymousClass1OB r4;
        AnonymousClass9UL A002 = this.A0B.A00(r7);
        if (A002 != null) {
            this.A07.A00(A002);
        }
        Object obj = this.A08;
        synchronized (obj) {
            r4 = (AnonymousClass1OB) this.A09.remove(r7);
        }
        if (r4 != null) {
            AnonymousClass8BX.A12(A5Z.A00(), r7, "Stopping tracking for ", A0E, AnonymousClass000.A10());
            r4.BEM((CancellationException) null);
        }
        if (!z) {
            synchronized (obj) {
                this.A0A.remove(r7);
            }
        }
    }

    public void CGu(A2t... a2tArr) {
        long max;
        A5Z A002;
        String str;
        StringBuilder A10;
        String str2;
        Boolean bool = this.A00;
        if (bool == null) {
            bool = Boolean.valueOf(C197049w4.A00(this.A03, this.A04));
            this.A00 = bool;
        }
        if (!bool.booleanValue()) {
            A5Z.A00().A05(A0E, "Ignoring schedule request in a secondary process");
            return;
        }
        if (!this.A01) {
            this.A05.A02(this);
            this.A01 = true;
        }
        HashSet A12 = C17880vN.A12();
        HashSet A122 = C17880vN.A12();
        for (A2t a2t : a2tArr) {
            C193279pp A003 = AnonymousClass9OL.A00(a2t);
            AnonymousClass9u6 r4 = this.A0B;
            if (!r4.A03(A003)) {
                synchronized (this.A08) {
                    C193279pp A004 = AnonymousClass9OL.A00(a2t);
                    Map map = this.A0A;
                    AnonymousClass9ZU r11 = (AnonymousClass9ZU) map.get(A004);
                    if (r11 == null) {
                        r11 = new AnonymousClass9ZU(a2t.A02, System.currentTimeMillis());
                        map.put(A004, r11);
                    }
                    max = r11.A01 + (((long) Math.max((a2t.A02 - r11.A00) - 5, 0)) * C20113A7w.A0L);
                }
                long max2 = Math.max(a2t.A00(), max);
                long currentTimeMillis = System.currentTimeMillis();
                if (a2t.A0G == AnonymousClass00R.A00) {
                    if (currentTimeMillis < max2) {
                        C198379yF r10 = this.A02;
                        if (r10 != null) {
                            Map map2 = r10.A02;
                            String str3 = a2t.A0M;
                            Runnable runnable = (Runnable) map2.remove(str3);
                            if (runnable != null) {
                                ((C20348AHe) r10.A00).A00.removeCallbacks(runnable);
                            }
                            C21471Akc akc = new C21471Akc((Object) r10, (Object) a2t, 21);
                            map2.put(str3, akc);
                            ((C20348AHe) r10.A00).A00.postDelayed(akc, max2 - System.currentTimeMillis());
                        }
                    } else if (AnonymousClass8BR.A1T(C20078A6e.A08, a2t.A0B)) {
                        int i = Build.VERSION.SDK_INT;
                        if (i >= 23) {
                            C20078A6e a6e = a2t.A0B;
                            if (a6e.A04()) {
                                A002 = A5Z.A00();
                                str = A0E;
                                A10 = AnonymousClass000.A10();
                                A10.append("Ignoring ");
                                A10.append(a2t);
                                str2 = ". Requires device idle.";
                            } else if (i >= 24 && a6e.A03()) {
                                A002 = A5Z.A00();
                                str = A0E;
                                A10 = AnonymousClass000.A10();
                                A10.append("Ignoring ");
                                A10.append(a2t);
                                str2 = ". Requires ContentUri triggers.";
                            }
                            AnonymousClass8BW.A16(A002, str2, str, A10);
                        }
                        A12.add(a2t);
                        A122.add(a2t.A0M);
                    } else if (!r4.A03(AnonymousClass9OL.A00(a2t))) {
                        A5Z A005 = A5Z.A00();
                        String str4 = A0E;
                        StringBuilder A102 = AnonymousClass000.A10();
                        A102.append("Starting work for ");
                        AnonymousClass8BW.A16(A005, a2t.A0M, str4, A102);
                        A00(r4, this, AnonymousClass9OL.A00(a2t));
                    }
                }
            }
        }
        synchronized (this.A08) {
            if (!A12.isEmpty()) {
                String join = TextUtils.join(",", A122);
                A5Z A006 = A5Z.A00();
                String str5 = A0E;
                StringBuilder A103 = AnonymousClass000.A10();
                A103.append("Starting tracking for ");
                AnonymousClass8BW.A16(A006, join, str5, A103);
                Iterator it = A12.iterator();
                while (it.hasNext()) {
                    A2t a2t2 = (A2t) it.next();
                    C193279pp A007 = AnonymousClass9OL.A00(a2t2);
                    Map map3 = this.A09;
                    if (!map3.containsKey(A007)) {
                        map3.put(A007, C197029w2.A00(this, this.A0C, a2t2, ((C20367AHx) this.A0D).A03));
                    }
                }
            }
        }
    }

    public C20355AHl(Context context, AnonymousClass00I r5, C20359AHp aHp, C22399B6c b6c, C186369e5 r8, C71973Kb r9) {
        this.A03 = context;
        B4N b4n = r5.A05;
        this.A02 = new C198379yF(r5.A03, b4n, this);
        this.A07 = new C191229mE(b4n, b6c);
        this.A0D = r9;
        this.A0C = new C189179ie(r8);
        this.A04 = r5;
        this.A05 = aHp;
        this.A06 = b6c;
    }

    public static void A00(AnonymousClass9u6 r3, C20355AHl aHl, C193279pp r5) {
        AnonymousClass9UL A012 = r3.A01(r5);
        C191229mE r2 = aHl.A07;
        C18070vi.A0d(A012, 0);
        C21471Akc akc = new C21471Akc((Object) r2, (Object) A012, 22);
        synchronized (r2.A03) {
            r2.A04.put(A012, akc);
        }
        B4N b4n = r2.A01;
        ((C20348AHe) b4n).A00.postDelayed(akc, r2.A00);
        C20356AHm aHm = (C20356AHm) aHl.A06;
        aHm.A01.BKq(new C27081DTg(A012, aHm.A00, (Object) null, 10));
    }

    public void Bpt(C180159Lj r7, A2t a2t) {
        C193279pp A002 = AnonymousClass9OL.A00(a2t);
        if (r7 instanceof AnonymousClass8KC) {
            AnonymousClass9u6 r4 = this.A0B;
            if (!r4.A03(A002)) {
                AnonymousClass8BX.A12(A5Z.A00(), A002, "Constraints met: Scheduling work ID ", A0E, AnonymousClass000.A10());
                A00(r4, this, A002);
                return;
            }
            return;
        }
        AnonymousClass8BX.A12(A5Z.A00(), A002, "Constraints not met: Cancelling work ID ", A0E, AnonymousClass000.A10());
        AnonymousClass9UL A003 = this.A0B.A00(A002);
        if (A003 != null) {
            this.A07.A00(A003);
            this.A06.COf(A003, ((AnonymousClass8KB) r7).A00);
        }
    }
}
