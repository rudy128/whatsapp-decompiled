package com.whatsapp.businessdirectory.viewmodel;

import X.A1Z;
import X.A2L;
import X.A36;
import X.A5L;
import X.AEQ;
import X.AF0;
import X.AM5;
import X.AM7;
import X.AP5;
import X.APF;
import X.APG;
import X.APH;
import X.APK;
import X.APN;
import X.APT;
import X.APV;
import X.APX;
import X.ARO;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass11P;
import X.AnonymousClass12Q;
import X.AnonymousClass17D;
import X.AnonymousClass1DS;
import X.AnonymousClass1DT;
import X.AnonymousClass1KB;
import X.AnonymousClass1XN;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass48l;
import X.AnonymousClass7CB;
import X.AnonymousClass8BR;
import X.AnonymousClass8BS;
import X.AnonymousClass8BW;
import X.AnonymousClass8FJ;
import X.AnonymousClass8FK;
import X.AnonymousClass9X4;
import X.BAa;
import X.C108945cZ;
import X.C108955ca;
import X.C108975cc;
import X.C108985cd;
import X.C169278km;
import X.C171788sH;
import X.C173738ve;
import X.C174008w5;
import X.C174088wD;
import X.C174108wF;
import X.C174238wS;
import X.C174248wT;
import X.C174258wU;
import X.C174308wZ;
import X.C174318wa;
import X.C174338wc;
import X.C174348wd;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C18090vk;
import X.C184189aY;
import X.C184249ae;
import X.C185699d0;
import X.C186569eP;
import X.C188769hx;
import X.C189319it;
import X.C190499l3;
import X.C190509l4;
import X.C193609qN;
import X.C195189sw;
import X.C195699tl;
import X.C197639x1;
import X.C197799xH;
import X.C198299y7;
import X.C198529yU;
import X.C19989A2b;
import X.C20041A4k;
import X.C20079A6f;
import X.C20289AEx;
import X.C20335AGr;
import X.C20531AOq;
import X.C20653ATl;
import X.C21446AkD;
import X.C21459AkQ;
import X.C21528Alb;
import X.C21535Ali;
import X.C221618v;
import X.C22288B1q;
import X.C22426B7i;
import X.C22427B7j;
import X.C22433B7p;
import X.C22434B7q;
import X.C22436B7s;
import X.C22495BAc;
import X.C22553BCk;
import X.C22557BCq;
import X.C22801Dg;
import X.C36921og;
import X.C37361pP;
import X.C41731wy;
import android.app.Application;
import android.os.Handler;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class BusinessDirectoryContextualSearchViewModel extends AnonymousClass8FK implements C22557BCq, C22553BCk, C22495BAc, BAa, C22426B7i, C22436B7s {
    public int A00;
    public int A01;
    public AEQ A02;
    public Runnable A03;
    public Runnable A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public int A08;
    public int A09;
    public int A0A;
    public final Handler A0B;
    public final Handler A0C;
    public final AnonymousClass1DS A0D;
    public final C22801Dg A0E;
    public final C22801Dg A0F;
    public final AnonymousClass1DT A0G;
    public final AnonymousClass1DT A0H;
    public final C37361pP A0I;
    public final AnonymousClass1KB A0J;
    public final C185699d0 A0K;
    public final AM5 A0L;
    public final C20653ATl A0M;
    public final A5L A0N;
    public final C197639x1 A0O;
    public final AP5 A0P;
    public final A2L A0Q;
    public final A36 A0R;
    public final C184249ae A0S;
    public final C20531AOq A0T;
    public final AnonymousClass11P A0U;
    public final AnonymousClass1XN A0V;
    public final C36921og A0W;
    public final C41731wy A0X;
    public final C41731wy A0Y;
    public final C41731wy A0Z;
    public final C41731wy A0a;
    public final C41731wy A0b;
    public final AnonymousClass00H A0c;
    public final AnonymousClass00H A0d;
    public final AnonymousClass00H A0e = C221618v.A00(AnonymousClass17D.class);
    public final LinkedList A0f;
    public final C18090vk A0g;
    public final C189319it A0h;
    public final C198529yU A0i;
    public final C173738ve A0j;
    public final C20041A4k A0k;
    public final AnonymousClass7CB A0l;

    public static void A0H(BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel, String str, int i) {
        BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel2 = businessDirectoryContextualSearchViewModel;
        ((AM7) businessDirectoryContextualSearchViewModel.A0d.get()).A08(A5L.A00(businessDirectoryContextualSearchViewModel), (Integer) null, (Map) null, 2, 2, 0);
        C184189aY r9 = null;
        businessDirectoryContextualSearchViewModel.A02 = null;
        LinkedList linkedList = businessDirectoryContextualSearchViewModel.A0f;
        synchronized (linkedList) {
            String str2 = str;
            if (!TextUtils.isEmpty(str)) {
                AP5 ap5 = businessDirectoryContextualSearchViewModel.A0P;
                ap5.A0D(A05(businessDirectoryContextualSearchViewModel));
                boolean z = true;
                businessDirectoryContextualSearchViewModel.A01 = 1;
                AnonymousClass3MX.A1K(businessDirectoryContextualSearchViewModel.A0b, 3);
                linkedList.clear();
                if (A09(businessDirectoryContextualSearchViewModel).isEmpty()) {
                    ArrayList A13 = AnonymousClass000.A13();
                    A0J(businessDirectoryContextualSearchViewModel, A13);
                    A13.addAll(A06(businessDirectoryContextualSearchViewModel));
                    boolean z2 = true;
                    if (businessDirectoryContextualSearchViewModel.A01 != 1) {
                        z2 = false;
                    }
                    A13.add(new C174088wD(z2, false));
                    businessDirectoryContextualSearchViewModel.A0F.A0E(A13);
                }
                ap5.A09.A03 = 9;
                if (i != 2) {
                    z = false;
                }
                ap5.A04 = z;
                int i2 = businessDirectoryContextualSearchViewModel.A01;
                C20079A6f A042 = A04(businessDirectoryContextualSearchViewModel);
                if (C197639x1.A00(A04(businessDirectoryContextualSearchViewModel))) {
                    C188769hx r0 = (C188769hx) ap5.A06.A06();
                    if (r0 != null) {
                        r9 = r0.A04;
                    } else {
                        r9 = new C184189aY(150, (String) null);
                    }
                }
                A0B(r9, businessDirectoryContextualSearchViewModel.A0R.A02(), A042, businessDirectoryContextualSearchViewModel2, str2, ap5.A0K, i2, i);
            }
        }
    }

    public void A0T() {
        C184189aY r3;
        if (this.A01 == 1) {
            AP5 ap5 = this.A0P;
            AnonymousClass1DT r4 = ap5.A06;
            C188769hx r32 = (C188769hx) r4.A06();
            if (ap5.A09.A03 != 9 && r32 != null && r32.A0F != null) {
                ap5.A0A();
                if (C197639x1.A00(A04(this)) && !r32.A0H) {
                    String str = r32.A0F;
                    int i = this.A01;
                    C20079A6f A042 = A04(this);
                    if (C197639x1.A00(A04(this))) {
                        C188769hx r0 = (C188769hx) r4.A06();
                        if (r0 != null) {
                            r3 = r0.A04;
                        } else {
                            r3 = new C184189aY(150, (String) null);
                        }
                    } else {
                        r3 = null;
                    }
                    A0B(r3, this.A0R.A02(), A042, this, str, ap5.A0K, i, 1);
                }
            }
        }
    }

    public void BxG() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BusinessDirectoryContextualSearchViewModel(Application application, C37361pP r20, C189319it r21, AnonymousClass1KB r22, C185699d0 r23, AM5 am5, C20653ATl aTl, C198529yU r26, C173738ve r27, A5L a5l, C20041A4k a4k, C197639x1 r30, C22427B7j b7j, A2L a2l, C22433B7p b7p, C22434B7q b7q, AnonymousClass11P r35, AnonymousClass1XN r36, AnonymousClass7CB r37, C36921og r38, AnonymousClass00H r39, AnonymousClass00H r40) {
        super(application);
        C184249ae r6 = (C184249ae) AnonymousClass12Q.A03(C184249ae.class);
        this.A0S = r6;
        this.A0b = AnonymousClass3MW.A0o();
        C22801Dg A0R2 = C108945cZ.A0R();
        this.A0F = A0R2;
        this.A0a = AnonymousClass3MW.A0o();
        this.A0X = AnonymousClass3MW.A0o();
        this.A0Y = AnonymousClass3MW.A0o();
        C22801Dg A0R3 = C108945cZ.A0R();
        this.A0E = A0R3;
        this.A03 = new C21446AkD(this, 24);
        this.A0g = new C21528Alb(this, 23);
        this.A0U = r35;
        this.A0J = r22;
        C37361pP r9 = r20;
        this.A0I = r9;
        this.A0C = new Handler();
        this.A0f = AnonymousClass8BR.A14();
        this.A0V = r36;
        this.A0B = new Handler();
        this.A0O = r30;
        A2L a2l2 = a2l;
        this.A0Q = a2l2;
        this.A0Z = AnonymousClass3MW.A0o();
        C20653ATl aTl2 = aTl;
        this.A0M = aTl2;
        C185699d0 r1 = r23;
        this.A0K = r1;
        this.A0l = r37;
        this.A0N = a5l;
        C198529yU r5 = r26;
        this.A0i = r5;
        this.A0j = r27;
        this.A0W = r38;
        this.A0c = r39;
        this.A0k = a4k;
        this.A0L = am5;
        this.A0d = r40;
        aTl2.A0E = this;
        r5.A00 = this;
        boolean z = false;
        this.A01 = 0;
        A36 BGJ = b7p.BGJ(new APN(this, 0));
        this.A0R = BGJ;
        this.A0h = r21;
        C18070vi.A0d(r9, 0);
        r1.A00 = (String) r9.A02("saved_state_query_id");
        this.A05 = r9.A02("saved_search_session_started") != null ? AnonymousClass000.A1Y(r9.A02("saved_search_session_started")) : z;
        BGJ.A09(r9);
        C20531AOq BH2 = b7q.BH2(this, this, this);
        this.A0T = BH2;
        AP5 BH0 = b7j.BH0(new APF(this, 0), new APG(this, 0), new APH(), new APK(this, 0), BGJ, BH2, this, this, 0);
        this.A0P = BH0;
        AnonymousClass1DT r12 = r6.A00;
        this.A0D = r12;
        this.A06 = true;
        aTl2.A0C = r6;
        C20335AGr.A01(r12, A0R2, this, 25);
        C20335AGr.A01(BH0.A06, A0R2, this, 26);
        C20335AGr.A01(BH2.A00, A0R2, this, 27);
        this.A0G = a2l2.A02;
        this.A0H = a2l2.A01;
        C20335AGr.A01(a2l2.A00, A0R3, this, 28);
    }

    public static int A00(BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel, String str) {
        C18030ve r2 = businessDirectoryContextualSearchViewModel.A0V.A03;
        if (AnonymousClass8BS.A1L(r2) && C18020vd.A05(C18040vf.A02, r2, 2762) && str.length() >= 2) {
            A36 a36 = businessDirectoryContextualSearchViewModel.A0R;
            if (!a36.A0B() || a36.A02) {
                return 1;
            }
            return 0;
        }
        return 1;
    }

    public static AM7 A03(BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel) {
        return (AM7) businessDirectoryContextualSearchViewModel.A0d.get();
    }

    public static C20079A6f A04(BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel) {
        C20079A6f A022 = businessDirectoryContextualSearchViewModel.A0N.A02();
        if (A022 != null) {
            return A022;
        }
        C20041A4k a4k = businessDirectoryContextualSearchViewModel.A0k;
        C20079A6f a6f = a4k.A00;
        if (a6f == null) {
            return C20041A4k.A00(a4k);
        }
        return a6f;
    }

    public static String A05(BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel) {
        C188769hx r0 = (C188769hx) businessDirectoryContextualSearchViewModel.A0P.A06.A06();
        if (r0 != null) {
            return r0.A0F;
        }
        return null;
    }

    public static List A09(BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel) {
        C188769hx r2 = (C188769hx) businessDirectoryContextualSearchViewModel.A0P.A06.A06();
        if (C197639x1.A00(A04(businessDirectoryContextualSearchViewModel)) && r2 != null && businessDirectoryContextualSearchViewModel.A01 == 1) {
            List list = r2.A0J;
            if (!list.isEmpty()) {
                return list;
            }
        }
        return AnonymousClass000.A13();
    }

    private void A0A() {
        C37361pP r3 = this.A0I;
        String str = (String) r3.A02("saved_search_query");
        int i = 0;
        if (TextUtils.isEmpty(str) || !str.equals(A05(this))) {
            if (this.A07) {
                this.A01 = 1;
                this.A07 = false;
                r3.A04("saved_search_state", (Object) null);
                r3.A04("saved_search_query", (Object) null);
            } else if (this.A01 == 1) {
                ((AM7) this.A0d.get()).A08(A5L.A00(this), (Integer) null, (Map) null, 1, 1, 0);
            }
        } else if (r3.A02("saved_search_state") != null) {
            i = AnonymousClass000.A0M(r3.A02("saved_search_state"));
        }
        this.A01 = i;
        r3.A04("saved_search_state", (Object) null);
        r3.A04("saved_search_query", (Object) null);
    }

    public static void A0B(C184189aY r16, C190499l3 r17, C20079A6f a6f, BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel, String str, String str2, int i, int i2) {
        BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel2 = businessDirectoryContextualSearchViewModel;
        C198529yU r6 = businessDirectoryContextualSearchViewModel2.A0i;
        String str3 = businessDirectoryContextualSearchViewModel2.A0K.A00;
        C189319it r1 = businessDirectoryContextualSearchViewModel2.A0h;
        int i3 = 871826611;
        int i4 = i;
        if (i == 0) {
            i3 = 871830404;
        }
        C19989A2b A002 = r1.A00(i3);
        String str4 = str;
        C18070vi.A0d(str4, 0);
        A002.A00 = Integer.valueOf(C19989A2b.A04.getAndIncrement());
        A002.A02();
        C184189aY r3 = r16;
        C190499l3 r4 = r17;
        C20079A6f a6f2 = a6f;
        String str5 = str2;
        int i5 = i2;
        if (i == 0) {
            C198299y7 r2 = (C198299y7) r6.A04.get();
            C21459AkQ.A01(r2.A03, r2, new C22288B1q(r3, r4, a6f2, r6, A002, str, str3, str5, i2), str4, 44);
        } else if (i4 == 1) {
            C195189sw r7 = new C195189sw((C193609qN) null, str4, 30);
            r6.A01.get();
            C198529yU.A00(r3, r4, a6f2, r6, r7, A002, str4, str3, C108985cd.A0f(), str5, i5, false);
        }
    }

    public static void A0C(C188769hx r13, BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel) {
        long j;
        if (r13.A05 != null) {
            AM7 A032 = A03(businessDirectoryContextualSearchViewModel);
            Integer A082 = businessDirectoryContextualSearchViewModel.A0P.A08();
            int size = r13.A05.A06.size();
            String str = r13.A0F;
            A36 a36 = businessDirectoryContextualSearchViewModel.A0R;
            List list = a36.A00;
            if (list != null) {
                j = (long) list.size();
            } else {
                j = 0;
            }
            A032.A01(a36.A05(), Boolean.valueOf(a36.A03), Boolean.valueOf(a36.A04), A082, str, "query", a36.A06(), size, A5L.A00(businessDirectoryContextualSearchViewModel).intValue(), j);
        }
    }

    public static void A0F(BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel, AF0 af0) {
        businessDirectoryContextualSearchViewModel.A0Q.A02(new C20289AEx(System.currentTimeMillis(), af0.A0I, TextUtils.join(",", af0.A0L), af0.A0F));
    }

    public static void A0G(BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel, AF0 af0, String str, String str2, String str3, String str4, int i) {
        C18030ve r2 = businessDirectoryContextualSearchViewModel.A0V.A03;
        if (AnonymousClass8BS.A1L(r2) && C18020vd.A05(C18040vf.A02, r2, 2313)) {
            C190509l4 r22 = (C190509l4) businessDirectoryContextualSearchViewModel.A0c.get();
            String str5 = af0.A0F;
            String str6 = businessDirectoryContextualSearchViewModel.A0P.A0K;
            String str7 = af0.A0H;
            Double d = af0.A02;
            C18070vi.A0d(str5, 0);
            r22.A00();
            ARO aro = new ARO(r22, d, str5, str, str2, str6, str7, str3, str4, i, 1);
            r22.A00 = aro;
            r22.A02.registerObserver(aro);
        }
    }

    public static void A0I(BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel, AbstractCollection abstractCollection) {
        AEQ aeq = businessDirectoryContextualSearchViewModel.A02;
        if (aeq != null) {
            abstractCollection.add(new C174248wT(new AnonymousClass9X4(businessDirectoryContextualSearchViewModel), aeq.A01));
        }
    }

    public static void A0J(BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel, List list) {
        if (businessDirectoryContextualSearchViewModel.A0T.A00.A00 == 7 && businessDirectoryContextualSearchViewModel.A0V.A05()) {
            list.add(new C174238wS(businessDirectoryContextualSearchViewModel, (String) null));
        }
    }

    public static void A0K(BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel, List list) {
        A2L a2l = businessDirectoryContextualSearchViewModel.A0Q;
        ArrayList A012 = a2l.A01(AnonymousClass3MW.A10(a2l.A00), true);
        if (!A012.isEmpty()) {
            list.add(new C174008w5(new AnonymousClass48l(businessDirectoryContextualSearchViewModel, 7)));
        }
        list.addAll(A012);
    }

    public static void A0L(BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel, List list) {
        C20531AOq aOq = businessDirectoryContextualSearchViewModel.A0T;
        AnonymousClass8FJ r2 = aOq.A00;
        int i = r2.A00;
        if (i == 1 || i == 3 || i == 5 || i == 6 || i == 4) {
            if (r2.A06() != null) {
                list.add(r2.A06());
            }
            businessDirectoryContextualSearchViewModel.A0L.A06(C20531AOq.A00(aOq), 25, r2.A0G());
        }
    }

    public static boolean A0N(BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel) {
        C188769hx r0 = (C188769hx) businessDirectoryContextualSearchViewModel.A0P.A06.A06();
        if (r0 == null || TextUtils.isEmpty(r0.A0F)) {
            return false;
        }
        return true;
    }

    public void A0S() {
        this.A0P.A09();
        this.A0i.A00 = null;
        C20653ATl aTl = this.A0M;
        aTl.A0E = null;
        aTl.A0C = null;
    }

    public void A0U(int i) {
        int i2;
        long j;
        String str;
        String str2;
        AM5 am5 = this.A0L;
        C195699tl r0 = this.A0P.A09.A05;
        if (r0 != null) {
            i2 = r0.A09.size();
        } else {
            i2 = 0;
        }
        long j2 = (long) i2;
        A36 a36 = this.A0R;
        List list = a36.A00;
        if (list != null) {
            j = (long) list.size();
        } else {
            j = 0;
        }
        Boolean A052 = a36.A05();
        if (a36.A03) {
            str = "has_catalog";
        } else {
            str = null;
        }
        if (a36.A04) {
            str2 = "open_now";
        } else {
            str2 = null;
        }
        Integer A002 = A5L.A00(this);
        String A062 = a36.A06();
        C171788sH A0J2 = AnonymousClass8BW.A0J(i);
        A0J2.A09 = A002;
        A0J2.A0I = Long.valueOf(j2);
        A0J2.A0P = str;
        A0J2.A0K = Long.valueOf(j);
        A0J2.A00 = A052;
        A0J2.A0Q = str2;
        A0J2.A0R = A062;
        A0J2.A0S = am5.A01;
        A0J2.A0A = Integer.valueOf(am5.A00);
        A0J2.A0H = C108975cc.A0X();
        am5.A03.CC7(A0J2);
    }

    /* JADX WARNING: type inference failed for: r5v26, types: [X.8vq, java.lang.Object, X.8we] */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003e, code lost:
        if (r10.isEmpty() == false) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0V(X.C193609qN r42, X.A1Z r43, java.lang.String r44, java.lang.String r45, java.lang.String r46, java.util.List r47, java.util.List r48, java.util.List r49, boolean r50) {
        /*
            r41 = this;
            r2 = r41
            java.util.LinkedList r3 = r2.A0f
            monitor-enter(r3)
            android.os.Handler r1 = r2.A0B     // Catch:{ all -> 0x0247 }
            java.lang.Runnable r0 = r2.A03     // Catch:{ all -> 0x0247 }
            r1.removeCallbacks(r0)     // Catch:{ all -> 0x0247 }
            r4 = r44
            boolean r0 = r3.contains(r4)     // Catch:{ all -> 0x0247 }
            if (r0 != 0) goto L_0x0017
        L_0x0014:
            monitor-exit(r3)     // Catch:{ all -> 0x0247 }
            goto L_0x0246
        L_0x0017:
            java.lang.Object r0 = r3.peek()     // Catch:{ all -> 0x0247 }
            boolean r0 = r4.equals(r0)     // Catch:{ all -> 0x0247 }
            if (r0 != 0) goto L_0x0025
            r3.poll()     // Catch:{ all -> 0x0247 }
            goto L_0x0017
        L_0x0025:
            r7 = 0
            r1 = 1
            r15 = r48
            r10 = r49
            if (r50 != 0) goto L_0x0040
            boolean r0 = r47.isEmpty()     // Catch:{ all -> 0x0247 }
            if (r0 == 0) goto L_0x0040
            boolean r0 = r15.isEmpty()     // Catch:{ all -> 0x0247 }
            if (r0 == 0) goto L_0x0040
            boolean r0 = r10.isEmpty()     // Catch:{ all -> 0x0247 }
            r5 = 0
            if (r0 != 0) goto L_0x0041
        L_0x0040:
            r5 = 1
        L_0x0041:
            java.util.ArrayList r0 = A06(r2)     // Catch:{ all -> 0x0247 }
            if (r5 != 0) goto L_0x0071
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0247 }
            if (r5 != 0) goto L_0x0071
            int r5 = r2.A08     // Catch:{ all -> 0x0247 }
            int r5 = r5 + 1
            r2.A08 = r5     // Catch:{ all -> 0x0247 }
            r8 = 2131887062(0x7f1203d6, float:1.940872E38)
            X.A6f r7 = A04(r2)     // Catch:{ all -> 0x0247 }
            X.0vk r6 = r2.A0g     // Catch:{ all -> 0x0247 }
            X.8wV r5 = new X.8wV     // Catch:{ all -> 0x0247 }
            r5.<init>(r7, r6, r8)     // Catch:{ all -> 0x0247 }
            r0.add(r5)     // Catch:{ all -> 0x0247 }
            r5 = r43
            java.util.ArrayList r5 = A07(r2, r5, r4)     // Catch:{ all -> 0x0247 }
            r0.addAll(r5)     // Catch:{ all -> 0x0247 }
            if (r50 != 0) goto L_0x023f
            goto L_0x01ab
        L_0x0071:
            int r5 = r2.A09     // Catch:{ all -> 0x0247 }
            int r5 = r5 + 1
            r2.A09 = r5     // Catch:{ all -> 0x0247 }
            r14 = r42
            if (r42 == 0) goto L_0x008c
            java.util.List r6 = r14.A01     // Catch:{ all -> 0x0247 }
            boolean r5 = r6.isEmpty()     // Catch:{ all -> 0x0247 }
            if (r5 != 0) goto L_0x008c
            X.A2L r5 = r2.A0Q     // Catch:{ all -> 0x0247 }
            java.util.ArrayList r5 = r5.A01(r6, r7)     // Catch:{ all -> 0x0247 }
            r0.addAll(r5)     // Catch:{ all -> 0x0247 }
        L_0x008c:
            boolean r5 = r47.isEmpty()     // Catch:{ all -> 0x0247 }
            if (r5 != 0) goto L_0x00d8
            r15.size()     // Catch:{ all -> 0x0247 }
            java.util.ArrayList r13 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x0247 }
            java.util.Iterator r16 = r47.iterator()     // Catch:{ all -> 0x0247 }
        L_0x009d:
            boolean r5 = r16.hasNext()     // Catch:{ all -> 0x0247 }
            if (r5 == 0) goto L_0x00d5
            java.lang.Object r5 = r16.next()     // Catch:{ all -> 0x0247 }
            X.8nD r5 = (X.AnonymousClass8nD) r5     // Catch:{ all -> 0x0247 }
            X.00H r6 = r2.A0e     // Catch:{ all -> 0x0247 }
            r6.get()     // Catch:{ all -> 0x0247 }
            r6 = 17
            X.48h r12 = new X.48h     // Catch:{ all -> 0x0247 }
            r12.<init>(r2, r5, r6)     // Catch:{ all -> 0x0247 }
            X.C18070vi.A0d(r5, r7)     // Catch:{ all -> 0x0247 }
            boolean r11 = r5.A01     // Catch:{ all -> 0x0247 }
            java.lang.String r9 = r5.A01     // Catch:{ all -> 0x0247 }
            java.lang.String r8 = r5.A00     // Catch:{ all -> 0x0247 }
            java.lang.String r6 = r5.A03     // Catch:{ all -> 0x0247 }
            X.8wJ r5 = new X.8wJ     // Catch:{ all -> 0x0247 }
            r20 = r8
            r21 = r6
            r22 = r11
            r19 = r9
            r18 = r12
            r17 = r5
            r17.<init>(r18, r19, r20, r21, r22)     // Catch:{ all -> 0x0247 }
            r13.add(r5)     // Catch:{ all -> 0x0247 }
            goto L_0x009d
        L_0x00d5:
            r0.addAll(r13)     // Catch:{ all -> 0x0247 }
        L_0x00d8:
            if (r42 == 0) goto L_0x015a
            java.util.List r8 = r14.A00     // Catch:{ all -> 0x0247 }
            boolean r5 = r8.isEmpty()     // Catch:{ all -> 0x0247 }
            if (r5 != 0) goto L_0x015a
            X.00H r5 = r2.A0e     // Catch:{ all -> 0x0247 }
            r5.get()     // Catch:{ all -> 0x0247 }
            java.util.ArrayList r6 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x0247 }
            java.util.Iterator r12 = r8.iterator()     // Catch:{ all -> 0x0247 }
        L_0x00ef:
            boolean r5 = r12.hasNext()     // Catch:{ all -> 0x0247 }
            if (r5 == 0) goto L_0x014f
            java.lang.Object r5 = r12.next()     // Catch:{ all -> 0x0247 }
            X.AEx r5 = (X.C20289AEx) r5     // Catch:{ all -> 0x0247 }
            java.lang.String r9 = r5.A03     // Catch:{ all -> 0x0247 }
            java.lang.String r8 = r5.A01     // Catch:{ all -> 0x0247 }
            java.lang.String r11 = r5.A02     // Catch:{ all -> 0x0247 }
            java.lang.Double r18 = X.AnonymousClass8BV.A0Q()     // Catch:{ all -> 0x0247 }
            boolean r5 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x0247 }
            if (r5 == 0) goto L_0x014a
            java.util.ArrayList r30 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x0247 }
        L_0x010f:
            java.util.ArrayList r31 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x0247 }
            java.util.ArrayList r32 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x0247 }
            r17 = 0
            java.lang.String r23 = ""
            r35 = 3
            X.AF0 r5 = new X.AF0     // Catch:{ all -> 0x0247 }
            r21 = r17
            r22 = r17
            r26 = r23
            r28 = r17
            r29 = r17
            r33 = r17
            r34 = r17
            r37 = r7
            r38 = r7
            r39 = r7
            r40 = r7
            r19 = r18
            r20 = r17
            r25 = r23
            r27 = r8
            r36 = r7
            r24 = r9
            r16 = r5
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)     // Catch:{ all -> 0x0247 }
            r6.add(r5)     // Catch:{ all -> 0x0247 }
            goto L_0x00ef
        L_0x014a:
            java.util.List r30 = X.AnonymousClass8BT.A10(r11)     // Catch:{ all -> 0x0247 }
            goto L_0x010f
        L_0x014f:
            r47.size()     // Catch:{ all -> 0x0247 }
            r5 = 0
            java.util.ArrayList r5 = r2.A08(r5, r5, r6, r1)     // Catch:{ all -> 0x0247 }
            r0.addAll(r5)     // Catch:{ all -> 0x0247 }
        L_0x015a:
            boolean r5 = r10.isEmpty()     // Catch:{ all -> 0x0247 }
            if (r5 != 0) goto L_0x016b
            r47.size()     // Catch:{ all -> 0x0247 }
            r5 = 0
            java.util.ArrayList r5 = r2.A08(r5, r5, r10, r7)     // Catch:{ all -> 0x0247 }
            r0.addAll(r5)     // Catch:{ all -> 0x0247 }
        L_0x016b:
            boolean r5 = r15.isEmpty()     // Catch:{ all -> 0x0247 }
            if (r5 != 0) goto L_0x017f
            r47.size()     // Catch:{ all -> 0x0247 }
            r6 = r45
            r5 = r46
            java.util.ArrayList r5 = r2.A08(r6, r5, r15, r7)     // Catch:{ all -> 0x0247 }
            r0.addAll(r5)     // Catch:{ all -> 0x0247 }
        L_0x017f:
            if (r50 != 0) goto L_0x0237
            int r5 = r4.length()     // Catch:{ all -> 0x0247 }
            if (r5 <= r1) goto L_0x0199
            r5 = 6
            X.AFV r7 = new X.AFV     // Catch:{ all -> 0x0247 }
            r7.<init>(r5, r4, r2)     // Catch:{ all -> 0x0247 }
            r6 = 13
            X.8vq r5 = new X.8vq     // Catch:{ all -> 0x0247 }
            r5.<init>((int) r6)     // Catch:{ all -> 0x0247 }
            r5.A00 = r7     // Catch:{ all -> 0x0247 }
            r0.add(r5)     // Catch:{ all -> 0x0247 }
        L_0x0199:
            boolean r5 = r15.isEmpty()     // Catch:{ all -> 0x0247 }
            if (r5 == 0) goto L_0x01ab
            boolean r5 = r10.isEmpty()     // Catch:{ all -> 0x0247 }
            if (r5 == 0) goto L_0x01ab
            int r5 = r2.A0A     // Catch:{ all -> 0x0247 }
            int r5 = r5 + 1
            r2.A0A = r5     // Catch:{ all -> 0x0247 }
        L_0x01ab:
            X.AM7 r13 = A03(r2)     // Catch:{ all -> 0x0247 }
            int r12 = r47.size()     // Catch:{ all -> 0x0247 }
            int r11 = r15.size()     // Catch:{ all -> 0x0247 }
            int r10 = r10.size()     // Catch:{ all -> 0x0247 }
            java.lang.Integer r14 = X.A5L.A00(r2)     // Catch:{ all -> 0x0247 }
            r18 = 4
            java.util.LinkedHashMap r7 = X.C17880vN.A13()     // Catch:{ all -> 0x0247 }
            int r5 = r4.length()     // Catch:{ all -> 0x0247 }
            long r5 = (long) r5     // Catch:{ all -> 0x0247 }
            r8 = 2
            X.1D6[] r8 = new X.AnonymousClass1D6[r8]     // Catch:{ all -> 0x0247 }
            java.lang.String r9 = "length"
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0247 }
            X.C72463Mc.A1H(r9, r5, r8)     // Catch:{ all -> 0x0247 }
            r9 = 0
            java.lang.String r5 = X.AnonymousClass1YF.A0I(r4)     // Catch:{ all -> 0x0247 }
            int r6 = r5.length()     // Catch:{ all -> 0x0247 }
            r5 = 0
            if (r6 == 0) goto L_0x01f3
            java.lang.String r5 = X.AnonymousClass1YF.A0I(r4)     // Catch:{ all -> 0x0247 }
            java.lang.String r4 = "\\s+"
            java.util.List r5 = X.C108965cb.A0v(r5, r4, r9)     // Catch:{ all -> 0x0247 }
            java.lang.String[] r4 = new java.lang.String[r9]     // Catch:{ all -> 0x0247 }
            java.lang.Object[] r4 = r5.toArray(r4)     // Catch:{ all -> 0x0247 }
            int r5 = r4.length     // Catch:{ all -> 0x0247 }
        L_0x01f3:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0247 }
            java.lang.String r4 = "words"
            X.AnonymousClass1D6.A03(r4, r5, r8, r1)     // Catch:{ all -> 0x0247 }
            java.util.LinkedHashMap r5 = X.AnonymousClass1D7.A0C(r8)     // Catch:{ all -> 0x0247 }
            java.lang.String r4 = "query"
            r7.put(r4, r5)     // Catch:{ all -> 0x0247 }
            java.util.LinkedHashMap r6 = X.C17880vN.A13()     // Catch:{ all -> 0x0247 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x0247 }
            java.lang.String r4 = "category_count"
            r6.put(r4, r5)     // Catch:{ all -> 0x0247 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0247 }
            java.lang.String r4 = "local_biz_count"
            r6.put(r4, r5)     // Catch:{ all -> 0x0247 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0247 }
            java.lang.String r4 = "api_biz_count"
            r6.put(r4, r5)     // Catch:{ all -> 0x0247 }
            java.lang.String r4 = "result"
            r7.put(r4, r6)     // Catch:{ all -> 0x0247 }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0247 }
            r19 = 2
            r17 = r1
            r16 = r7
            r13.A08(r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x0247 }
            goto L_0x023f
        L_0x0237:
            X.8wa r4 = new X.8wa     // Catch:{ all -> 0x0247 }
            r4.<init>(r1)     // Catch:{ all -> 0x0247 }
            r0.add(r4)     // Catch:{ all -> 0x0247 }
        L_0x023f:
            X.1Dg r1 = r2.A0F     // Catch:{ all -> 0x0247 }
            r1.A0E(r0)     // Catch:{ all -> 0x0247 }
            goto L_0x0014
        L_0x0246:
            return
        L_0x0247:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0247 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel.A0V(X.9qN, X.A1Z, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, java.util.List, boolean):void");
    }

    public void BlM() {
        if (this.A0V.A05()) {
            AM5 am5 = this.A0L;
            Integer A002 = C20531AOq.A00(this.A0T);
            C171788sH A0J2 = AnonymousClass8BW.A0J(3);
            A0J2.A09 = A002;
            AM5.A02(am5, A0J2);
            this.A0j.A02(true);
        }
        AnonymousClass3MX.A1K(this.A0X, 3);
    }

    public void Bo2() {
        C197799xH A042 = this.A0R.A04();
        if (A042 != null) {
            this.A0Y.A0E(A042);
        }
    }

    public void Bo8() {
        this.A0a.A0F(C108945cZ.A0N(C108955ca.A0e(), A04(this)));
        this.A0T.A03();
    }

    public void Boe(int i) {
        C41731wy r2;
        int i2;
        if (i == 0 || i == 7 || i == 6) {
            this.A0L.A05(C20531AOq.A00(this.A0T), 29, 0);
            r2 = this.A0a;
            i2 = 8;
        } else if (i == 3) {
            this.A0L.A05(C20531AOq.A00(this.A0T), 29, 3);
            r2 = this.A0a;
            i2 = 5;
        } else {
            return;
        }
        r2.A0E(C108945cZ.A0N(Integer.valueOf(i2), A04(this)));
    }

    public void Boh() {
        this.A0R.A07();
        A03(this).A02((Boolean) null, A5L.A00(this), (String) null, 24);
        String A052 = A05(this);
        if (A052 == null) {
            A052 = "";
        }
        String A053 = A05(this);
        if (A053 == null) {
            A053 = "";
        }
        A0H(this, A052, A00(this, A053));
    }

    public void Boj() {
        Log.e("BusinessDirectoryContextualSearchViewModel/onRetryNetworkClicked Should not reach here - no filters on this screen");
    }

    public void Bry(boolean z) {
        this.A0R.A02 = z;
        A03(this).A02(Boolean.valueOf(z), A5L.A00(this), (String) null, 21);
        String A052 = A05(this);
        if (A052 == null) {
            A052 = "";
        }
        A0H(this, A052, 1);
    }

    public void BvZ(boolean z) {
        this.A0R.A03 = z;
        A03(this).A02(Boolean.valueOf(z), A5L.A00(this), (String) null, 22);
        String A052 = A05(this);
        if (A052 == null) {
            A052 = "";
        }
        A0H(this, A052, 1);
    }

    public void BxL() {
        AnonymousClass3MX.A1K(this.A0X, 0);
        this.A0L.A05(C20531AOq.A00(this.A0T), 34, 0);
    }

    public void BzZ(boolean z) {
        this.A0R.A04 = z;
        A03(this).A02(Boolean.valueOf(z), A5L.A00(this), (String) null, 9);
        String A052 = A05(this);
        if (A052 == null) {
            A052 = "";
        }
        A0H(this, A052, 1);
    }

    public void C43(String str) {
        if (this.A01 == 0 || !C197639x1.A00(A04(this))) {
            A0W(str);
            return;
        }
        AP5 ap5 = this.A0P;
        C188769hx r3 = ap5.A09;
        List list = r3.A0J;
        if (!list.isEmpty()) {
            list.add(new C174318wa(0));
            r3.A03 = 2;
            ap5.A0B();
        }
        A0H(this, str, 1);
    }

    public void C44() {
        C20531AOq aOq = this.A0T;
        aOq.A02();
        aOq.A00.A0H();
        AnonymousClass3MX.A1K(this.A0X, 1);
        this.A0L.A05(C20531AOq.A00(aOq), 31, 0);
    }

    public void C45() {
        synchronized (this.A0f) {
            A0E(this);
        }
    }

    public void C4r() {
        Log.e("BusinessDirectoryContextualSearchViewModel/onSeeAllCategoriesClicked Should not reach here, no category screen view");
    }

    public static ArrayList A06(BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel) {
        ArrayList A13 = AnonymousClass000.A13();
        if (businessDirectoryContextualSearchViewModel.A0T.A00.A06() != null) {
            A0I(businessDirectoryContextualSearchViewModel, A13);
        }
        return A13;
    }

    public static ArrayList A07(BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel, A1Z a1z, String str) {
        ArrayList A13 = AnonymousClass000.A13();
        if (a1z != null) {
            ArrayList A132 = AnonymousClass000.A13();
            A132.add(new C174338wc(str));
            List list = a1z.A00;
            if (list != null && !list.isEmpty()) {
                A132.add(new C174258wU(list, C21535Ali.A00(businessDirectoryContextualSearchViewModel, 17)));
            }
            AnonymousClass1DS r2 = businessDirectoryContextualSearchViewModel.A0D;
            if (r2.A06() != null && !((C186569eP) r2.A06()).A03.isEmpty()) {
                A132.add(new C174348wd(0));
                A132.addAll(((C186569eP) r2.A06()).A03);
            }
            A13.addAll(A132);
            return A13;
        }
        A13.add(new C174108wF(businessDirectoryContextualSearchViewModel, str, 0));
        return A13;
    }

    private ArrayList A08(String str, String str2, List list, boolean z) {
        String str3;
        ArrayList A13 = AnonymousClass000.A13();
        int i = 0;
        while (true) {
            List list2 = list;
            if (i >= list2.size()) {
                return A13;
            }
            C20079A6f A042 = A04(this);
            AF0 af0 = (AF0) list2.get(i);
            list2.size();
            String str4 = null;
            if (i > 0) {
                str3 = ((AF0) list2.get(i - 1)).A0H;
            } else {
                str3 = null;
            }
            if (i < AnonymousClass3MX.A01(list2)) {
                str4 = ((AF0) list2.get(i + 1)).A0H;
            }
            this.A0e.get();
            String str5 = str;
            String str6 = str2;
            boolean z2 = z;
            APT apt = new APT(this, af0, str5, str6, str3, str4, i, z2);
            APV apv = new APV(this, 1);
            APX apx = new APX(this, af0, str5, str6, str3, str4, i);
            C18070vi.A0d(af0, 1);
            A13.add(new C169278km(apt, apv, apx, af0, A042.A03(), z2));
            i++;
        }
    }

    public static void A0D(BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel) {
        if (!A0N(businessDirectoryContextualSearchViewModel)) {
            ArrayList A13 = AnonymousClass000.A13();
            A0L(businessDirectoryContextualSearchViewModel, A13);
            if (businessDirectoryContextualSearchViewModel.A0T.A09()) {
                A0J(businessDirectoryContextualSearchViewModel, A13);
                A0I(businessDirectoryContextualSearchViewModel, A13);
                A0K(businessDirectoryContextualSearchViewModel, A13);
            }
            businessDirectoryContextualSearchViewModel.A0E.A0E(A13);
        }
    }

    public static void A0E(BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel) {
        if (!A0N(businessDirectoryContextualSearchViewModel) || !businessDirectoryContextualSearchViewModel.A0T.A09()) {
            A0D(businessDirectoryContextualSearchViewModel);
            return;
        }
        String str = ((C188769hx) businessDirectoryContextualSearchViewModel.A0P.A06.A06()).A0F;
        synchronized (businessDirectoryContextualSearchViewModel.A0f) {
            businessDirectoryContextualSearchViewModel.A0M(str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0074, code lost:
        if (((X.C186569eP) r1.A06()).A03.isEmpty() == false) goto L_0x0085;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0M(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r4 = r6.trim()
            X.AP5 r0 = r5.A0P
            r0.A0D(r4)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r5.A0A()
            if (r0 != 0) goto L_0x008f
            java.util.LinkedList r0 = r5.A0f
            r0.add(r4)
            boolean r0 = r5.A05
            r3 = 1
            if (r0 != 0) goto L_0x0035
            X.7CB r2 = r5.A0l
            java.util.Random r0 = r2.A01
            if (r0 != 0) goto L_0x0029
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            r2.A01 = r0
        L_0x0029:
            long r0 = r0.nextLong()
            java.lang.String r0 = java.lang.Long.toHexString(r0)
            r2.A00 = r0
            r5.A05 = r3
        L_0x0035:
            int r0 = r5.A01
            if (r0 != r3) goto L_0x0041
            int r0 = A00(r5, r6)
            A0H(r5, r4, r0)
            return
        L_0x0041:
            android.os.Handler r3 = r5.A0B
            java.lang.Runnable r2 = r5.A03
            r0 = 500(0x1f4, double:2.47E-321)
            r3.postDelayed(r2, r0)
            java.lang.Runnable r1 = r5.A04
            if (r1 == 0) goto L_0x0053
            android.os.Handler r0 = r5.A0C
            r0.removeCallbacks(r1)
        L_0x0053:
            r1 = 37
            X.AkJ r0 = new X.AkJ
            r0.<init>(r1, r4, r5)
            r5.A04 = r0
            boolean r0 = r5.A06
            if (r0 != 0) goto L_0x0076
            X.1DS r1 = r5.A0D
            java.lang.Object r0 = r1.A06()
            if (r0 == 0) goto L_0x0076
            java.lang.Object r0 = r1.A06()
            X.9eP r0 = (X.C186569eP) r0
            java.util.List r0 = r0.A03
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0085
        L_0x0076:
            X.AOq r0 = r5.A0T
            X.8FJ r0 = r0.A00
            X.A6f r2 = r0.A01
            if (r2 == 0) goto L_0x0085
            X.ATl r1 = r5.A0M
            java.lang.Boolean r0 = X.C17960vV.A01
            r1.A04(r2)
        L_0x0085:
            android.os.Handler r3 = r5.A0C
            java.lang.Runnable r2 = r5.A04
            r0 = 500(0x1f4, double:2.47E-321)
            r3.postDelayed(r2, r0)
            return
        L_0x008f:
            java.util.LinkedList r2 = r5.A0f
            monitor-enter(r2)
            r2.clear()     // Catch:{ all -> 0x00a1 }
            android.os.Handler r1 = r5.A0B     // Catch:{ all -> 0x00a1 }
            java.lang.Runnable r0 = r5.A03     // Catch:{ all -> 0x00a1 }
            r1.removeCallbacks(r0)     // Catch:{ all -> 0x00a1 }
            A0E(r5)     // Catch:{ all -> 0x00a1 }
            monitor-exit(r2)     // Catch:{ all -> 0x00a1 }
            return
        L_0x00a1:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00a1 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel.A0M(java.lang.String):void");
    }

    public void A0W(String str) {
        if (!TextUtils.isEmpty(str) && (this.A01 == 1 || TextUtils.isEmpty(A05(this)))) {
            AM7 A032 = A03(this);
            int i = 1;
            if (this.A01 == 1) {
                i = 2;
            }
            A032.A08(A5L.A00(this), 1, (Map) null, i, 7, 4);
        }
        synchronized (this.A0f) {
            C185699d0 r1 = this.A0K;
            C18070vi.A0d(str, 0);
            if (str.length() == 0 || r1.A00 == null) {
                r1.A00 = C108985cd.A0f();
            }
            A0M(str);
        }
    }

    public void Bvn() {
        ArrayList A13 = AnonymousClass000.A13();
        C174308wZ.A00(this, A13, 2);
        this.A0E.A0E(A13);
        this.A0L.A05(C20531AOq.A00(this.A0T), 28, 2);
    }

    public void Byj() {
        Bo8();
    }
}
