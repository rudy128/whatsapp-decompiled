package X;

import com.whatsapp.newsletter.iq.BaseNewslettersJob;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.3VS  reason: invalid class name */
public final class AnonymousClass3VS extends AnonymousClass1J2 implements AnonymousClass1GC {
    public BaseNewslettersJob A00;
    public final AnonymousClass1DS A01;
    public final AnonymousClass1DS A02;
    public final AnonymousClass1DT A03 = AnonymousClass3MW.A0L();
    public final AnonymousClass1DT A04;
    public final AnonymousClass1DT A05;
    public final AnonymousClass11S A06;
    public final AnonymousClass1M9 A07;
    public final C24751Ln A08;
    public final C29681ch A09;
    public final C76823oU A0A;
    public final C98904ru A0B;
    public final C192799p0 A0C;
    public final AnonymousClass10I A0D;
    public final boolean A0E;
    public final long A0F;
    public final C175298yU A0G;

    public void C6U(C27581Wq r3, AnonymousClass1F9 r4) {
        C18070vi.A0d(r3, 1);
        int ordinal = r3.ordinal();
        if (ordinal == 2) {
            this.A0G.registerObserver(this);
        } else if (ordinal == 3) {
            this.A0G.unregisterObserver(this);
        }
    }

    /* JADX WARNING: type inference failed for: r0v30, types: [X.43Q, java.lang.Object] */
    public static final void A00(AnonymousClass9IV r7, AnonymousClass3VS r8, List<C195569tY> list) {
        AnonymousClass1DT r6;
        ArrayList arrayList;
        ArrayList A10;
        AnonymousClass1BI r1;
        boolean z;
        if (list == null) {
            list = r8.A0C.A01(r7, r8.A09);
            if (((long) list.size()) > r8.A0F) {
                list = C18460wS.A00;
            }
        }
        ArrayList A13 = AnonymousClass000.A13();
        for (C195569tY r4 : list) {
            AnonymousClass1E2 r2 = r4.A03;
            if (r2 != null) {
                AnonymousClass1BI A0D2 = r8.A08.A0D(r2);
                if (A0D2 == null) {
                    A0D2 = r2;
                }
                AnonymousClass1BI r12 = A0D2;
                if (r12 != null) {
                    AnonymousClass1E7 A0H = r8.A07.A0H(r12);
                    C179509Ig r22 = r4.A01;
                    Set set = (Set) r8.A0A.A05.A06();
                    if (set != null) {
                        z = set.contains(A0H);
                    } else {
                        z = false;
                    }
                    A13.add(new AnonymousClass4NS(r22, A0H, z));
                }
            }
        }
        List A012 = C41681wt.A01(A13);
        AnonymousClass11S r0 = r8.A06;
        r0.A0I();
        AnonymousClass1E8 r02 = r0.A0D;
        if (!(r02 == null || (r1 = r02.A0J) == null)) {
            AnonymousClass1E7 A0H2 = r8.A07.A0H(r1);
            C46162Dk r03 = r8.A0A.A00;
            if (r03 == null) {
                C18070vi.A11("newsletterInfo");
                throw null;
            }
            A012.add(new AnonymousClass4NS(r03.A02, A0H2, false));
        }
        List<AnonymousClass4NS> A0y = C29431cG.A0y(A012, r8.A0B);
        ArrayList A14 = AnonymousClass000.A14(A0y);
        ArrayList A132 = AnonymousClass000.A13();
        for (AnonymousClass4NS r13 : A0y) {
            C18070vi.A0d(r13, 1);
            ? obj = new Object();
            obj.A00 = r13;
            A132.add(obj);
        }
        A14.addAll(A132);
        if (A14.isEmpty()) {
            A14.add(new AnonymousClass43T(""));
        }
        if (r7 == AnonymousClass9IV.SHORT) {
            r8.A04.A0E(A14);
            if (A14.size() >= 11) {
                A10 = C17880vN.A10(A14.subList(0, 10));
                A10.add(new AnonymousClass43S(A14.size() - 10));
            } else {
                A10 = C17880vN.A10(A14);
            }
            if (A10.isEmpty()) {
                A10.add(new AnonymousClass43T(""));
            }
            A14 = A10;
            r6 = r8.A05;
        } else {
            AnonymousClass1DT r14 = r8.A05;
            Object A062 = r14.A06();
            r6 = r8.A04;
            if (A062 != null) {
                Collection collection = (Collection) r14.A06();
                if (collection != null) {
                    ArrayList A0k = C29431cG.A0k(A14, collection);
                    ArrayList A133 = AnonymousClass000.A13();
                    Iterator it = A0k.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        if (next instanceof AnonymousClass43Q) {
                            A133.add(next);
                        }
                    }
                    HashSet A12 = C17880vN.A12();
                    arrayList = AnonymousClass000.A13();
                    for (Object next2 : A133) {
                        if (A12.add(((AnonymousClass43Q) next2).A00.A00.A0J)) {
                            arrayList.add(next2);
                        }
                    }
                } else {
                    arrayList = null;
                }
                r6.A0E(arrayList);
                return;
            }
        }
        r6.A0E(A14);
    }

    public final void A0T(AnonymousClass9IV r3) {
        this.A0D.CGN(new C21458AkP(r3, this));
    }

    public AnonymousClass3VS(AnonymousClass11S r2, AnonymousClass1M9 r3, C24921Me r4, C24751Ln r5, C29681ch r6, C175298yU r7, AnonymousClass1c4 r8, C76823oU r9, C192799p0 r10, AnonymousClass10I r11, long j) {
        C18070vi.A0w(r4, r8, r2, r11, r3);
        C18070vi.A0q(r5, r10, r7);
        this.A06 = r2;
        this.A0D = r11;
        this.A07 = r3;
        this.A08 = r5;
        this.A0C = r10;
        this.A0G = r7;
        this.A09 = r6;
        this.A0F = j;
        this.A0A = r9;
        this.A0E = r8.A03();
        this.A0B = new C98904ru(r2, r4);
        AnonymousClass1DT A0L = AnonymousClass3MW.A0L();
        this.A05 = A0L;
        this.A02 = A0L;
        AnonymousClass1DT A0L2 = AnonymousClass3MW.A0L();
        this.A04 = A0L2;
        this.A01 = A0L2;
    }
}
