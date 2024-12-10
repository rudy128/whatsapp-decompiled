package X;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1x0  reason: invalid class name and case insensitive filesystem */
public final class C41751x0 {
    public boolean A00;
    public final C33251iW A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final Map A06;

    public C41751x0(C33251iW r2, AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5, AnonymousClass00H r6) {
        C18070vi.A0d(r2, 1);
        C18070vi.A0d(r3, 2);
        C18070vi.A0d(r4, 3);
        C18070vi.A0d(r5, 4);
        C18070vi.A0d(r6, 5);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.A01 = r2;
        this.A02 = r3;
        this.A05 = r4;
        this.A03 = r6;
        this.A06 = linkedHashMap;
        this.A04 = r5;
    }

    public static final void A00(Context context, View.OnClickListener onClickListener, C114375qh r7, C23291Fl r8, C41751x0 r9) {
        C114425qm r4 = new C114425qm(r7, r9, 0);
        C90594eK BZQ = r8.BZQ(2131896391, 3500, true);
        BZQ.A01.A0C(r4);
        BZQ.A06(new AnonymousClass78B(BZQ, r4, onClickListener, 1), 2131897301);
        BZQ.A04(C19740yt.A00(context, AnonymousClass1YL.A00(context, 2130971311, 2131102579)));
        BZQ.A03();
        r9.A06.clear();
    }

    public void A03() {
        this.A00 = true;
        ((C41811x6) ((C41801x5) this.A02.get()).A04.get()).A00 = false;
        ((C41831x8) ((C41821x7) this.A05.get()).A0E.get()).A00 = false;
    }

    public void A04() {
        this.A00 = false;
        ((C41811x6) ((C41801x5) this.A02.get()).A04.get()).A00 = true;
        ((C41831x8) ((C41821x7) this.A05.get()).A0E.get()).A00 = true;
    }

    public void A05(Context context, AnonymousClass206 r11) {
        AnonymousClass77K A002;
        Map map = this.A06;
        AnonymousClass206 r6 = r11;
        String str = r11.A0v.A01;
        if (!map.containsKey(str)) {
            if (A02(r11)) {
                C18070vi.A0X(str);
                map.put(str, r11);
            }
            if (C1402870s.A00(r11) && (r11 instanceof AnonymousClass210) && (A002 = C63672tV.A00(r11)) != null) {
                if (A002.A05 || A002.A06) {
                    int ordinal = ((AnonymousClass72B) this.A03.get()).A02(false).ordinal();
                    Context context2 = context;
                    if (ordinal == 1 || ordinal == 2) {
                        C41821x7 r3 = (C41821x7) this.A05.get();
                        r3.A01.CGF(new C146857Qw(r3, context, r11, 4));
                    } else if (ordinal == 3) {
                        C41801x5 r4 = (C41801x5) this.A02.get();
                        AnonymousClass77K A003 = C63672tV.A00(r11);
                        C27354DcQ A012 = AnonymousClass1ZT.A01();
                        if (A003 != null) {
                            if (A003.A05) {
                                A012.add(C122646Re.FACEBOOK);
                            }
                            if (A003.A06) {
                                A012.add(C122646Re.INSTAGRAM);
                            }
                        }
                        r4.A01.CGF(new C146617Py(r4, context2, r6, AnonymousClass1ZT.A02(A012), 29));
                    }
                }
            }
        }
    }

    public void A06(Context context, AnonymousClass206 r15, C23291Fl r16) {
        Runnable runnable;
        AnonymousClass10I r0;
        AnonymousClass77K A002;
        if (A02(r15)) {
            Map map = this.A06;
            String str = r15.A0v.A01;
            if (map.containsKey(str)) {
                C18070vi.A0X(str);
                map.put(str, r15);
                Collection<AnonymousClass206> values = map.values();
                if (values == null || !values.isEmpty()) {
                    for (AnonymousClass206 r02 : values) {
                        if (r02.A0H <= 0) {
                            return;
                        }
                    }
                }
                AnonymousClass00H r1 = this.A03;
                ((AnonymousClass72B) r1.get()).A02(true);
                Context context2 = context;
                C23291Fl r3 = r16;
                if (AnonymousClass74A.A08(map.values())) {
                    int ordinal = ((AnonymousClass72B) r1.get()).A02(false).ordinal();
                    if (ordinal == 1 || ordinal == 2) {
                        if (this.A00) {
                            C129246hU r9 = new C129246hU(context, r3, this, new HashSet(map.values()));
                            Collection values2 = map.values();
                            C18070vi.A0d(values2, 0);
                            ArrayList arrayList = new ArrayList();
                            for (Object next : values2) {
                                AnonymousClass77K A003 = C63672tV.A00((AnonymousClass206) next);
                                if (A003 != null && A003.A05) {
                                    arrayList.add(next);
                                }
                            }
                            C41821x7 r10 = (C41821x7) this.A05.get();
                            C30131dR r32 = (C30131dR) r10.A0H.get();
                            r32.A06("auto_xpost_status_share_view", "INIT_CROSSPOST", 927599499);
                            r32.A02(Boolean.valueOf(C18070vi.A18(((C35511mM) r10.A0B.get()).A01(C41821x7.A0I), true)), "is_auto_crosspost");
                            r0 = r10.A01;
                            runnable = new C21463AkU(context2, r9, r10, (Integer) 1, (List) arrayList);
                        } else {
                            return;
                        }
                    } else if (ordinal == 3) {
                        if (this.A00) {
                            HashSet hashSet = new HashSet(map.values());
                            ArrayList arrayList2 = new ArrayList();
                            AnonymousClass77K A004 = C63672tV.A00(r15);
                            if (A004 != null) {
                                if (A004.A05) {
                                    arrayList2.add(C122646Re.FACEBOOK);
                                }
                                if (A004.A06) {
                                    arrayList2.add(C122646Re.INSTAGRAM);
                                }
                            }
                            C41801x5 r92 = (C41801x5) this.A02.get();
                            ArrayList arrayList3 = new ArrayList(map.values());
                            C70363At r102 = new C70363At(context, r3, this, hashSet);
                            StringBuilder sb = new StringBuilder();
                            sb.append("CrosspostManager/checkEligibilityAndShowAutoCrosspostingSnackBar messages: ");
                            sb.append(arrayList3.size());
                            sb.append(", Crosspost entry point: ");
                            sb.append(1);
                            C18070vi.A0d(sb.toString(), 0);
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = new ArrayList();
                            Iterator it = arrayList3.iterator();
                            while (it.hasNext()) {
                                Object next2 = it.next();
                                AnonymousClass206 r12 = (AnonymousClass206) next2;
                                AnonymousClass77K A005 = C63672tV.A00(r12);
                                if ((A005 != null && A005.A05) || ((A002 = C63672tV.A00(r12)) != null && A002.A06)) {
                                    arrayList5.add(next2);
                                }
                            }
                            arrayList4.addAll(arrayList5);
                            if (!arrayList4.isEmpty()) {
                                r0 = r92.A01;
                                runnable = new AnonymousClass7R6(context2, r92, r102, arrayList2, arrayList3);
                            }
                            map.clear();
                            return;
                        }
                        return;
                    }
                    r0.CGF(runnable);
                    map.clear();
                    return;
                }
                A00(context, new AnonymousClass78B(this, new HashSet(map.values()), r3, 2), (C114375qh) null, r3, this);
            }
        }
    }

    public static final boolean A02(AnonymousClass206 r1) {
        if ((r1 instanceof AnonymousClass210) || (r1 instanceof C440021t) || (r1 instanceof C438421d) || (r1 instanceof AnonymousClass21Y)) {
            return true;
        }
        return r1 instanceof C441822l;
    }

    public static final void A01(C23291Fl r4, C41751x0 r5, Set set) {
        set.size();
        r4.BZQ(2131889344, 2000, false).A03();
        C60162nU r1 = ((C57602jL) ((C32741hg) r5.A04.get()).A0M.get()).A00;
        r1.A04("tap_undo");
        r1.A00();
        C33251iW r52 = r5.A01;
        if (((C56972iK) r52.A1Z.get()).A00()) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                AnonymousClass206 r3 = (AnonymousClass206) it.next();
                if (!AnonymousClass25A.A0p(r3)) {
                    AnonymousClass205 r12 = r3.A0v;
                    if (r12.A02 && C22971Dz.A0a(r12.A00)) {
                        ((C63742tc) r52.A16.A0N.get()).A04(r3, (Long) null, (String) null, 20);
                    }
                }
            }
        }
        r52.A0q(set, true);
    }

    public void A07(AnonymousClass206 r5) {
        HashMap hashMap;
        if (A02(r5)) {
            String str = r5.A0v.A01;
            C18070vi.A0X(str);
            this.A06.remove(str);
            AnonymousClass77K A002 = C63672tV.A00(r5);
            if (A002 != null && C1402870s.A00(r5)) {
                List singletonList = Collections.singletonList(r5);
                C18070vi.A0X(singletonList);
                if (AnonymousClass74A.A08(singletonList)) {
                    int ordinal = ((AnonymousClass72B) this.A03.get()).A02(false).ordinal();
                    if (ordinal == 1 || ordinal == 2) {
                        if (A002.A05) {
                            hashMap = ((C41831x8) ((C41821x7) this.A05.get()).A0E.get()).A05;
                        } else {
                            return;
                        }
                    } else if (ordinal == 3) {
                        hashMap = ((C41811x6) ((C41801x5) this.A02.get()).A04.get()).A04;
                    } else {
                        return;
                    }
                    hashMap.put(str, r5);
                }
            }
        }
    }
}
