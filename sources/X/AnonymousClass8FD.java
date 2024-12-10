package X;

import android.app.Application;
import com.whatsapp.jid.Jid;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Stack;

/* renamed from: X.8FD  reason: invalid class name */
public class AnonymousClass8FD extends AnonymousClass8FK implements C22557BCq, C22553BCk, C22495BAc, BAa, C22426B7i {
    public int A00;
    public int A01;
    public int A02;
    public C195699tl A03;
    public Jid A04;
    public Stack A05;
    public boolean A06;
    public boolean A07;
    public final AnonymousClass1DS A08;
    public final AnonymousClass1DS A09;
    public final C22801Dg A0A;
    public final C22801Dg A0B;
    public final C37361pP A0C;
    public final AM5 A0D;
    public final AM7 A0E;
    public final C20653ATl A0F;
    public final A5L A0G;
    public final C190509l4 A0H;
    public final C197639x1 A0I;
    public final AP5 A0J;
    public final A36 A0K;
    public final C184249ae A0L;
    public final C186579eQ A0M;
    public final C20531AOq A0N;
    public final AnonymousClass1XN A0O;
    public final C36921og A0P;
    public final C41731wy A0Q;
    public final C41731wy A0R;
    public final C41731wy A0S;
    public final C41731wy A0T;
    public final C41731wy A0U = AnonymousClass3MW.A0o();
    public final C41731wy A0V = AnonymousClass3MW.A0o();
    public final Set A0W;
    public final AnonymousClass1DS A0X;
    public final C26911Ty A0Y;
    public final C173738ve A0Z;

    public static void A08(C195699tl r13, AnonymousClass8FD r14) {
        r14.A02 = 1;
        r14.A0T.A0F(r14.A0S.A06());
        AP5 ap5 = r14.A0J;
        ap5.A0D((String) null);
        List emptyList = Collections.emptyList();
        C18070vi.A0d(emptyList, 0);
        List list = r13.A06;
        List list2 = r13.A09;
        List list3 = r13.A08;
        String str = r13.A03;
        String str2 = r13.A05;
        ap5.Bn0(new C195699tl(r13.A00, r13.A01, str, str2, r13.A04, r13.A02, emptyList, list, list2, list3));
        A0B(r14);
    }

    public static void A0E(AnonymousClass8FD r4, int i) {
        int i2;
        ArrayList arrayList;
        if (i == -1) {
            arrayList = C17880vN.A10(r4.A04());
            i2 = 1;
        } else if (i == 1 || i == 2 || i == 3) {
            arrayList = C17880vN.A10(r4.A04());
            i2 = 2;
        } else if (i == 4) {
            r4.A06();
            return;
        } else {
            return;
        }
        C174308wZ.A00(r4, arrayList, i2);
        A0F(r4, arrayList);
        r4.A0D.A05(C20531AOq.A00(r4.A0N), 28, i2);
    }

    private void A0L(boolean z) {
        this.A02 = 4;
        this.A00 = 4;
        this.A0A.A0E("nearby_business");
        A0K(z);
        C20653ATl aTl = this.A0F;
        C20079A6f a6f = this.A0N.A00.A01;
        String str = this.A0J.A0K;
        aTl.A03(A00(this), this.A0K.A02(), a6f, str);
    }

    public void C45() {
        A0H(this, true);
        this.A0D.A05(C20531AOq.A00(this.A0N), 30, 1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8FD(Application application, C37361pP r30, AnonymousClass9VN r31, C26911Ty r32, AM5 am5, AM7 am7, C20653ATl aTl, C173738ve r36, A5L a5l, C190509l4 r38, C197639x1 r39, C22427B7j b7j, C22433B7p b7p, C22434B7q b7q, AEQ aeq, Jid jid, AnonymousClass1XN r45, C36921og r46, String str, Set set, boolean z, boolean z2) {
        super(application);
        int i;
        int i2 = z2;
        boolean z3 = z;
        C184249ae r9 = (C184249ae) AnonymousClass12Q.A03(C184249ae.class);
        this.A0L = r9;
        C22801Dg A0R2 = C108945cZ.A0R();
        this.A0A = A0R2;
        C41731wy A0o = AnonymousClass3MW.A0o();
        this.A0S = A0o;
        C41731wy A0o2 = AnonymousClass3MW.A0o();
        this.A0T = A0o2;
        this.A0Q = AnonymousClass3MW.A0o();
        C22801Dg A0R3 = C108945cZ.A0R();
        this.A0B = A0R3;
        this.A0R = AnonymousClass3MW.A0o();
        this.A05 = new Stack();
        C37361pP r12 = r30;
        this.A0C = r12;
        this.A0O = r45;
        A36 BGJ = b7p.BGJ(new APN(this, 1));
        this.A0K = BGJ;
        this.A0D = am5;
        this.A0I = r39;
        this.A0W = set;
        C20653ATl aTl2 = aTl;
        this.A0F = aTl2;
        this.A0Y = r32;
        this.A0G = a5l;
        this.A0Z = r36;
        this.A0H = r38;
        this.A0P = r46;
        this.A0E = am7;
        C20531AOq BH2 = b7q.BH2(this, this, this);
        this.A0N = BH2;
        APG apg = new APG(this, 2);
        API api = new API(this, 1);
        AP5 BH0 = b7j.BH0(new APF(this, 1), apg, api, new APK(this, 1), BGJ, BH2, this, this, 1);
        this.A0J = BH0;
        this.A01 = r12.A02("saved_consumer_home_type") != null ? AnonymousClass000.A0M(r12.A02("saved_consumer_home_type")) : i2;
        this.A06 = r12.A02("saved_force_root_category") != null ? AnonymousClass000.A1Y(r12.A02("saved_force_root_category")) : z3;
        C186579eQ r1 = new C186579eQ(new AnonymousClass9X5(this), AnonymousClass3MZ.A0l(r31.A00.A02));
        this.A0M = r1;
        AnonymousClass1DT r0 = r9.A00;
        AnonymousClass1DT r17 = r0;
        this.A0X = r0;
        AnonymousClass1DT r15 = BH0.A06;
        this.A08 = r15;
        AnonymousClass1DT r14 = r1.A00;
        this.A09 = r14;
        BGJ.A09(r12);
        if (r12.A02("saved_parent_category") != null) {
            A0o.A0F(r12.A02("saved_parent_category"));
        }
        if (r12.A02("saved_second_level_category") != null) {
            A0o2.A0F(r12.A02("saved_second_level_category"));
        }
        if (r12.A02("saved_search_state_stack") != null) {
            Stack stack = new Stack();
            this.A05 = stack;
            stack.addAll((Collection) r12.A02("saved_search_state_stack"));
        }
        if (r12.A02("saved_search_state") != null) {
            i = AnonymousClass000.A0M(r12.A02("saved_search_state"));
        } else {
            i = 0;
        }
        this.A02 = i;
        if (A0o2.A06() == null) {
            AEQ aeq2 = aeq;
            if (aeq != null) {
                this.A0S.A0F(aeq2);
                this.A00 = 2;
                if (C196559vG.A01(aeq2.A00)) {
                    this.A02 = 2;
                } else {
                    this.A0T.A0F(aeq2);
                    this.A02 = 1;
                }
            }
        }
        Jid jid2 = jid;
        if (jid != null) {
            this.A04 = jid2;
            this.A02 = 3;
        }
        if ("nearby_business".equals(str)) {
            this.A02 = 4;
        }
        C20335AGr.A01(r17, A0R3, this, 32);
        C20335AGr.A01(r15, A0R3, this, 33);
        C20335AGr.A01(r14, A0R3, this, 29);
        C20335AGr.A01(A0o, A0R2, this, 30);
        C20335AGr.A01(A0o2, A0R2, this, 30);
        aTl2.A0C = r9;
        aTl2.A0D = r1;
        aTl2.A08 = BH0;
        C20335AGr.A01(BH2.A00, A0R3, this, 31);
    }

    public static C184189aY A00(AnonymousClass8FD r2) {
        AnonymousClass1DS r1 = r2.A08;
        if (r1.A06() != null) {
            return ((C188769hx) r1.A06()).A04;
        }
        return new C184189aY(150, (String) null);
    }

    private List A04() {
        C188769hx r1 = (C188769hx) this.A08.A06();
        if (C197639x1.A00(this.A0N.A00.A01) && r1 != null) {
            List list = r1.A0J;
            if (!list.isEmpty()) {
                return list;
            }
        }
        return AnonymousClass000.A13();
    }

    private void A05() {
        this.A0A.A0F("all_categories");
        A0F(this, C108965cb.A0s(new C174358we(2)));
        this.A02 = 0;
        C20653ATl aTl = this.A0F;
        C20079A6f a6f = this.A0N.A00.A01;
        C17960vV.A08(a6f, "Trying to fetch the categories, but the search location is null");
        aTl.A04(a6f);
    }

    private void A06() {
        this.A0B.A0E(AnonymousClass000.A13());
        AnonymousClass3MX.A1J(this.A0V, 3);
        this.A0D.A05(C20531AOq.A00(this.A0N), 28, 6);
    }

    private void A07(C184189aY r15) {
        String str;
        String str2;
        boolean z;
        List list;
        AEQ aeq = (AEQ) this.A0T.A06();
        AnonymousClass8FJ r3 = this.A0N.A00;
        if (r3.A01 != null && aeq != null) {
            C184189aY r4 = r15;
            if (r15 == null || r15.A01 == null) {
                A36 a36 = this.A0K;
                if (!a36.A01.isEmpty() || ((list = a36.A00) != null && !list.isEmpty())) {
                    z = false;
                } else {
                    z = true;
                }
                A0F(this, C108965cb.A0s(new C174088wD(z, A0N())));
            }
            this.A02 = 1;
            if (r15 == null || r15.A01 == null) {
                C188769hx r2 = this.A0J.A09;
                r2.A0I = false;
                r2.A0G = AnonymousClass000.A13();
                r2.A02 = 0;
            }
            if (A0N()) {
                str = "map_view_serp";
            } else {
                str = null;
            }
            C20653ATl aTl = this.A0F;
            C20079A6f a6f = r3.A01;
            A36 a362 = this.A0K;
            if (a362.A0B()) {
                str2 = "all_descendents";
            } else {
                str2 = "current";
            }
            String str3 = this.A0J.A0K;
            C190499l3 A022 = a362.A02();
            aTl.A01();
            C20650ATi aTi = new C20650ATi(a6f, aTl, (Jid) null);
            aTl.A03 = aTi;
            C169208kX BGx = aTl.A0H.BGx(r4, A022, a6f, aeq, aTi, aTl.A0M.A00, "all_descendents", str2, str3, str);
            BGx.A0E();
            aTl.A00 = BGx;
        }
    }

    public static void A09(C188769hx r13, AnonymousClass8FD r14) {
        String str;
        long j;
        if (r13.A05 != null) {
            AM7 am7 = r14.A0E;
            Integer A082 = r14.A0J.A08();
            int size = r13.A05.A06.size();
            String str2 = r13.A0F;
            int i = r14.A02;
            if (i == 4 || i == 1) {
                str = "businesses";
            } else {
                str = "recommendations";
            }
            A36 a36 = r14.A0K;
            List list = a36.A00;
            if (list != null) {
                j = (long) list.size();
            } else {
                j = 0;
            }
            am7.A01(a36.A05(), Boolean.valueOf(a36.A03), Boolean.valueOf(a36.A04), A082, str2, str, a36.A06(), size, A5L.A01(r14).intValue(), j);
        }
    }

    public static void A0A(AnonymousClass8FD r13) {
        AEQ aeq = (AEQ) r13.A0S.A06();
        if (aeq != null) {
            AnonymousClass8FJ r3 = r13.A0N.A00;
            if (r3.A01 != null) {
                A0F(r13, C108965cb.A0s(new C174358we(2)));
                r13.A02 = 2;
                C20653ATl aTl = r13.A0F;
                C20079A6f a6f = r3.A01;
                String str = r13.A0J.A0K;
                C184189aY r4 = null;
                if (C197639x1.A00(a6f)) {
                    r4 = new C184189aY(150, (String) null);
                }
                aTl.A01();
                C20648ATg aTg = new C20648ATg(a6f, aTl);
                aTl.A05 = aTg;
                C169208kX BGx = aTl.A0H.BGx(r4, (C190499l3) null, a6f, aeq, aTg, aTl.A0M.A00, "current", "immediate_children", str, (String) null);
                BGx.A0E();
                aTl.A00 = BGx;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        if (r2 == 2) goto L_0x000a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0B(X.AnonymousClass8FD r4) {
        /*
            X.AM7 r3 = r4.A0E
            int r2 = r4.A02
            if (r2 == 0) goto L_0x000a
            r0 = 2
            r1 = 2
            if (r2 != r0) goto L_0x000b
        L_0x000a:
            r1 = 3
        L_0x000b:
            java.lang.Integer r0 = X.A5L.A01(r4)
            r3.A04(r0, r1, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8FD.A0B(X.8FD):void");
    }

    public static void A0C(AnonymousClass8FD r3) {
        int i = r3.A02;
        if (i == 1) {
            A0G(r3, false);
        } else if (i != 3) {
            if (i == 4) {
                r3.A0L(false);
            }
        } else if (A0P(r3)) {
            r3.A0M(false);
        }
    }

    public static void A0D(AnonymousClass8FD r2) {
        C41731wy r1;
        int i;
        int i2 = r2.A01;
        if (i2 == 0) {
            r2.A0A.A0E("product_name");
            r1 = r2.A0V;
            i = 4;
        } else if (i2 == 1) {
            r1 = r2.A0V;
            i = 7;
        } else {
            return;
        }
        AnonymousClass3MX.A1J(r1, i);
    }

    public static void A0H(AnonymousClass8FD r2, boolean z) {
        int i = r2.A02;
        if (i == 0) {
            r2.A05();
        } else if (i == 1) {
            A0G(r2, z);
        } else if (i == 2) {
            A0A(r2);
        } else if (i == 3) {
            r2.A0M(z);
        } else if (i == 4) {
            r2.A0L(z);
        }
    }

    public static void A0I(AnonymousClass8FD r8, boolean z, boolean z2, boolean z3) {
        boolean z4 = r8.A07;
        Integer A0j = C17880vN.A0j();
        if (!z4) {
            AnonymousClass1DS r3 = r8.A0X;
            if (r3.A06() != null && !((C186569eP) r3.A06()).A03.isEmpty()) {
                if (z2) {
                    r8.A0J(A0j);
                }
                if (z3) {
                    r8.A0E.A04(A5L.A01(r8), 3, 3);
                }
                C184249ae r0 = r8.A0L;
                r0.A00.A0E(r0.A01);
                AM5 am5 = r8.A0D;
                long size = (long) ((C186569eP) r3.A06()).A03.size();
                C20531AOq aOq = r8.A0N;
                int A012 = aOq.A01();
                int A0G2 = aOq.A00.A0G();
                C171788sH r1 = new C171788sH();
                r1.A0C = C108955ca.A0e();
                r1.A0J = Long.valueOf(size);
                r1.A09 = Integer.valueOf(A012);
                if (A0G2 == 0) {
                    A0G2 = 2;
                }
                r1.A0D = Integer.valueOf(A0G2);
                AM5.A02(am5, r1);
                r8.A0S.A0E((Object) null);
                r8.A0A.A0E("all_categories");
                A36 a36 = r8.A0K;
                a36.A07();
                a36.A00 = null;
                r8.A02 = 0;
            }
        }
        if (r8.A0N.A00.A01 != null) {
            if (A0O(r8)) {
                r8.A05.pop();
            }
            if (z) {
                if (z2) {
                    r8.A0J(A0j);
                }
                if (z3) {
                    r8.A0E.A04(A5L.A01(r8), 3, 3);
                }
                r8.A05();
            } else {
                if (z2) {
                    r8.A0J(0);
                }
                A0D(r8);
                return;
            }
        }
        r8.A0S.A0E((Object) null);
        r8.A0A.A0E("all_categories");
        A36 a362 = r8.A0K;
        a362.A07();
        a362.A00 = null;
        r8.A02 = 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r1 == 2) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0J(java.lang.Integer r10) {
        /*
            r9 = this;
            X.AM7 r2 = r9.A0E
            int r1 = r9.A02
            if (r1 == 0) goto L_0x000c
            r0 = 2
            r6 = 2
            r7 = 30
            if (r1 != r0) goto L_0x000f
        L_0x000c:
            r6 = 3
            r7 = 63
        L_0x000f:
            java.lang.Integer r3 = X.A5L.A01(r9)
            r5 = 0
            r8 = 1
            r4 = r10
            r2.A08(r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8FD.A0J(java.lang.Integer):void");
    }

    private void A0K(boolean z) {
        if (!z || A00(this) == null || A00(this).A01 == null) {
            this.A0J.A0D((String) null);
            A0F(this, C108965cb.A0s(new C174088wD(false, A0N())));
        } else if (C197639x1.A00(this.A0N.A00.A01)) {
            AP5 ap5 = this.A0J;
            C188769hx r3 = ap5.A09;
            List list = r3.A0J;
            if (!list.isEmpty()) {
                list.add(new C174318wa(0));
                r3.A03 = 2;
                ap5.A0B();
            }
        }
    }

    private void A0M(boolean z) {
        Jid jid;
        C184189aY r4;
        AnonymousClass1XN r3 = this.A0O;
        if (C18020vd.A05(C18040vf.A02, r3.A03, 1616) && r3.A02() && (jid = this.A04) != null) {
            AnonymousClass8FJ r2 = this.A0N.A00;
            if (r2.A01 != null) {
                this.A02 = 3;
                this.A00 = 3;
                this.A0A.A0E("business_chaining");
                A0K(z);
                C190499l3 A022 = this.A0K.A02();
                if (A022.A01 == null) {
                    this.A0Y.A0D(new C20471AMi(this, A022, 8), C22941Dw.A00(jid));
                    return;
                }
                C20653ATl aTl = this.A0F;
                C20079A6f a6f = r2.A01;
                String str = this.A0J.A0K;
                if (C197639x1.A00(a6f)) {
                    r4 = A00(this);
                } else {
                    r4 = null;
                }
                aTl.A02(r4, A022, a6f, jid, str);
            }
        }
    }

    private boolean A0N() {
        C20079A6f a6f = this.A0N.A00.A01;
        if (a6f == null || a6f.A05()) {
            return false;
        }
        int i = a6f.A00;
        if (i == -1) {
            Double d = a6f.A05;
            if (d == null || d.doubleValue() > 9000.0d) {
                return false;
            }
        } else if (i < 12 || i > 14) {
            return false;
        }
        if (this.A02 != 1) {
            return false;
        }
        AnonymousClass1XN r1 = this.A0O;
        if (!r1.A02()) {
            return false;
        }
        if (C18020vd.A05(C18040vf.A02, r1.A03, 4236)) {
            return true;
        }
        return false;
    }

    public static boolean A0O(AnonymousClass8FD r2) {
        Stack stack = r2.A05;
        if (stack.isEmpty() || AnonymousClass000.A0M(stack.peek()) != 2) {
            return false;
        }
        return true;
    }

    public static boolean A0P(AnonymousClass8FD r4) {
        AnonymousClass1XN r3 = r4.A0O;
        if (!C18020vd.A05(C18040vf.A02, r3.A03, 2192) || !r3.A02() || r4.A04 == null || r4.A02 != 3) {
            return false;
        }
        return true;
    }

    public void A0S() {
        C20531AOq aOq = this.A0N;
        AnonymousClass8FJ r0 = aOq.A00;
        r0.A02.removeCallbacks(r0.A09);
        aOq.A04.A00();
        aOq.A01 = null;
        this.A0J.A09();
        C20653ATl aTl = this.A0F;
        aTl.A0C = null;
        aTl.A0D = null;
        aTl.A08 = null;
    }

    public AEQ A0T() {
        C41731wy r1 = this.A0S;
        if (r1.A06() == null) {
            return null;
        }
        AEQ aeq = (AEQ) r1.A06();
        AEQ aeq2 = (AEQ) this.A0T.A06();
        if (aeq2 != null) {
            Stack stack = this.A05;
            if (stack.isEmpty() || AnonymousClass000.A0M(stack.peek()) != 2) {
                return aeq;
            }
            return aeq2;
        }
        return aeq;
    }

    public void A0U() {
        int i = this.A02;
        if (i != 0) {
            if (i == 1) {
                AnonymousClass8FJ r4 = this.A0N.A00;
                int i2 = r4.A00;
                if (!(i2 == 4 || i2 == 3 || i2 == 6 || i2 == 5)) {
                    if (A0O(this)) {
                        this.A05.pop();
                        A0J(3);
                        this.A0E.A04(A5L.A01(this), 3, 3);
                        A36 a36 = this.A0K;
                        a36.A07();
                        a36.A00 = null;
                        this.A02 = 2;
                        if (!this.A07 && this.A09.A06() != null) {
                            C186579eQ r0 = this.A0M;
                            r0.A00.A0F(r0.A01);
                        } else if (r4.A01 != null) {
                            A0A(this);
                        }
                        this.A0T.A0E((Object) null);
                        C41731wy r1 = this.A0S;
                        r1.A0E(r1.A06());
                        return;
                    }
                    A0I(this, this.A06, true, true);
                    return;
                }
            } else if (i == 2) {
                int i3 = this.A0N.A00.A00;
                if (!(i3 == 4 || i3 == 3 || i3 == 6 || i3 == 5)) {
                    A0I(this, this.A06, true, false);
                    return;
                }
            } else if (i != 3) {
                if (i != 4) {
                    return;
                }
            }
            A0J((Integer) null);
            AnonymousClass3MX.A1J(this.A0V, 2);
            return;
        }
        A0J(0);
        A0D(this);
    }

    public void A0V() {
        AP5 ap5 = this.A0J;
        C188769hx r3 = (C188769hx) ap5.A06.A06();
        if (ap5.A09.A03 != 9 && r3 != null && r3.A05 != null) {
            AnonymousClass8FJ r2 = this.A0N.A00;
            if (r2.A01 != null) {
                ap5.A0A();
                C20079A6f a6f = r2.A01;
                if (C197639x1.A00(a6f) && !r3.A0H) {
                    int i = this.A02;
                    if (i == 1) {
                        A07(A00(this));
                    } else if (i != 3) {
                        if (i == 4) {
                            C20653ATl aTl = this.A0F;
                            String str = ap5.A0K;
                            aTl.A03(A00(this), this.A0K.A02(), a6f, str);
                        }
                    } else if (A0P(this)) {
                        C20653ATl aTl2 = this.A0F;
                        Jid jid = this.A04;
                        C20079A6f a6f2 = r2.A01;
                        String str2 = ap5.A0K;
                        aTl2.A02(A00(this), this.A0K.A02(), a6f2, jid, str2);
                    }
                }
            }
        }
    }

    public void A0W(int i) {
        int size;
        String str;
        String str2;
        C195699tl r0 = this.A03;
        if (r0 != null) {
            AM5 am5 = this.A0D;
            long size2 = (long) r0.A09.size();
            A36 a36 = this.A0K;
            List list = a36.A00;
            if (list == null) {
                size = 0;
            } else {
                size = list.size();
            }
            long j = (long) size;
            C20531AOq aOq = this.A0N;
            int A012 = aOq.A01();
            int i2 = this.A00;
            int A0G2 = aOq.A00.A0G();
            String str3 = this.A03.A04;
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
            String A062 = a36.A06();
            C171788sH A0J2 = AnonymousClass8BW.A0J(i);
            A0J2.A0I = Long.valueOf(size2);
            A0J2.A0K = Long.valueOf(j);
            A0J2.A09 = Integer.valueOf(A012);
            A0J2.A07 = Integer.valueOf(i2);
            if (A0G2 == 0) {
                A0G2 = 2;
            }
            A0J2.A0D = Integer.valueOf(A0G2);
            A0J2.A0O = str3;
            A0J2.A00 = A052;
            A0J2.A0P = str;
            A0J2.A0Q = str2;
            A0J2.A0R = A062;
            A0J2.A0S = am5.A01;
            A0J2.A0A = Integer.valueOf(am5.A00);
            A0J2.A0H = C108975cc.A0X();
            am5.A03.CC7(A0J2);
        }
    }

    public void BlM() {
        if (this.A0O.A05()) {
            AM5 am5 = this.A0D;
            Integer A002 = C20531AOq.A00(this.A0N);
            C171788sH A0J2 = AnonymousClass8BW.A0J(3);
            A0J2.A09 = A002;
            AM5.A02(am5, A0J2);
            this.A0Z.A02(true);
        }
        AnonymousClass3MX.A1K(this.A0Q, 3);
    }

    public void Bo2() {
        C197799xH A042 = this.A0K.A04();
        if (A042 != null) {
            this.A0R.A0E(A042);
        }
    }

    public void Bo8() {
        C41731wy r2;
        Integer num;
        int i;
        C20531AOq aOq = this.A0N;
        aOq.A03();
        AnonymousClass8FJ r4 = aOq.A00;
        int i2 = r4.A00;
        if (i2 != 0) {
            int i3 = 7;
            i = 2;
            if (i2 == 2) {
                r2 = this.A0U;
                if (this.A02 == 0) {
                    i3 = 6;
                }
                num = Integer.valueOf(i3);
                r2.A0F(C108945cZ.A0N(num, r4.A01));
            } else if (i2 == 4) {
                r2 = this.A0U;
                num = Integer.valueOf(i);
                r2.A0F(C108945cZ.A0N(num, r4.A01));
            } else if (i2 != 7) {
                return;
            }
        }
        r2 = this.A0U;
        i = 1;
        if (this.A02 == 0) {
            i = 0;
        }
        num = Integer.valueOf(i);
        r2.A0F(C108945cZ.A0N(num, r4.A01));
    }

    public void Boe(int i) {
        C20531AOq aOq;
        C41731wy r2;
        int i2;
        if (i == 0 || i == 7 || i == 6) {
            AM5 am5 = this.A0D;
            aOq = this.A0N;
            am5.A05(C20531AOq.A00(aOq), 29, 0);
            r2 = this.A0U;
            i2 = 8;
        } else if (i == 3) {
            AM5 am52 = this.A0D;
            aOq = this.A0N;
            am52.A05(C20531AOq.A00(aOq), 29, 3);
            r2 = this.A0U;
            i2 = 5;
        } else {
            return;
        }
        r2.A0F(C108945cZ.A0N(Integer.valueOf(i2), aOq.A00.A01));
    }

    public void Boh() {
        this.A0K.A07();
        this.A0E.A02((Boolean) null, A5L.A01(this), (String) null, 24);
        A0C(this);
    }

    public void Boj() {
        A36 a36 = this.A0K;
        a36.A07();
        a36.A00 = null;
        A0C(this);
        this.A0D.A05(C20531AOq.A00(this.A0N), 32, 5);
    }

    public void Bry(boolean z) {
        this.A0K.A02 = z;
        this.A0E.A02(Boolean.valueOf(z), A5L.A01(this), (String) null, 21);
        A0C(this);
    }

    public void BvZ(boolean z) {
        this.A0K.A03 = z;
        this.A0E.A02(Boolean.valueOf(z), A5L.A01(this), (String) null, 22);
        A0C(this);
    }

    public void BxG() {
        AnonymousClass3MX.A1J(this.A0V, 5);
    }

    public void BxL() {
        AnonymousClass3MX.A1J(this.A0Q, 0);
        this.A0D.A05(C20531AOq.A00(this.A0N), 34, 0);
    }

    public void BzZ(boolean z) {
        this.A0K.A04 = z;
        this.A0E.A02(Boolean.valueOf(z), A5L.A01(this), (String) null, 9);
        A0C(this);
    }

    public void C44() {
        C20531AOq aOq = this.A0N;
        aOq.A02();
        aOq.A00.A0H();
        AnonymousClass3MX.A1J(this.A0Q, 1);
        this.A0D.A05(C20531AOq.A00(aOq), 31, 0);
    }

    public void C4r() {
        this.A0S.A0E((Object) null);
        this.A0A.A0E("product_name");
        AnonymousClass3MX.A1J(this.A0V, 4);
        this.A0D.A05(C20531AOq.A00(this.A0N), 33, 5);
    }

    public static ArrayList A03(AnonymousClass8FD r6) {
        int i;
        C174078wC A002;
        ArrayList A13 = AnonymousClass000.A13();
        AnonymousClass8FJ r2 = r6.A0N.A00;
        Object A062 = r2.A06();
        r6.A08.A06();
        if (A062 != null) {
            A13.add(A062);
            Integer[] numArr = new Integer[2];
            boolean A1b = AnonymousClass8BU.A1b(numArr, C72453Mb.A1b(numArr, 2) ? 1 : 0);
            List asList = Arrays.asList(numArr);
            int i2 = r6.A02;
            if ((i2 == A1b || i2 == 4 || A0P(r6)) && asList.contains(Integer.valueOf(r2.A00))) {
                A36 a36 = r6.A0K;
                if (!(a36.A00 == null || (A002 = A36.A00(a36, r6, 76)) == null)) {
                    A13.add(A002);
                }
            }
        }
        if (r6.A02 == 0 && r2.A00 != 4) {
            Iterator it = r6.A0W.iterator();
            if (it.hasNext()) {
                it.next();
                throw AnonymousClass000.A0s("restartVisibilityState");
            }
        }
        int i3 = r2.A00;
        if (C18020vd.A05(C18040vf.A02, r6.A0O.A03, 1806) && (((i = r6.A02) == 2 || i == 0) && i3 != 4)) {
            LinkedList A14 = AnonymousClass8BR.A14();
            Application application = r6.A00;
            C18070vi.A0z(application, "null cannot be cast to non-null type T of androidx.lifecycle.AndroidViewModel.getApplication");
            A14.add(new C194259rR((Object) null, "-1", application.getString(2131886640)));
            if (r6.A02 == 2) {
                C41731wy r1 = r6.A0S;
                if (r1.A06() != null) {
                    AEQ aeq = (AEQ) r1.A06();
                    A14.add(new C194259rR(aeq, aeq.A00, aeq.A01));
                }
            }
            A13.add(new C174068wB(new C20530AOp(r6), A14));
        }
        return A13;
    }

    public static void A0F(AnonymousClass8FD r2, List list) {
        ArrayList A032 = A03(r2);
        A032.addAll(list);
        r2.A0B.A0E(A032);
    }

    public static void A0G(AnonymousClass8FD r1, boolean z) {
        C184189aY r0;
        r1.A0K(z);
        if (C197639x1.A00(r1.A0N.A00.A01)) {
            r0 = A00(r1);
        } else {
            r0 = null;
        }
        r1.A07(r0);
    }

    public void Bvn() {
        A06();
    }

    public void Byj() {
        Bo8();
    }
}
