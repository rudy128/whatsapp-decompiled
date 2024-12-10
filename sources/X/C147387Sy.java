package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7Sy  reason: invalid class name and case insensitive filesystem */
public final class C147387Sy extends ArrayList<C39611tM<?>> {
    public static final AnonymousClass6FD A00 = new C39611tM(2131895518, 1);
    public static final AnonymousClass6FD A01 = new C39611tM(2131895311, 27);
    public static final AnonymousClass6FD A02 = new C39611tM(2131895520, 1);
    public static final AnonymousClass6FD A03 = new C39611tM(2131895844, 24);
    public static final AnonymousClass6FD A04 = new C39611tM(2131888815, 1);
    public static final AnonymousClass6FD A05 = new C39611tM(2131891563, 1);
    public static final AnonymousClass6FD A06 = new C39611tM(2131895521, 1);
    public static final AnonymousClass6FD A07 = new C39611tM(C17880vN.A0h(), 13);
    public static final AnonymousClass6FD A08 = new C39611tM(AnonymousClass3MY.A0f(), 13);
    public static final AnonymousClass6FD A09 = new C39611tM(2131893093, 1);
    public static final AnonymousClass6FD A0A = new C39611tM(2131895523, 1);
    public static final AnonymousClass6FD A0B = new C39611tM(2131895517, 101);
    public static final AnonymousClass6FD A0C = new C39611tM(2131895524, 1);
    public C147397Sz latestBucket = null;
    public final C32011gU linkifyWeb;
    public final C138036wQ messageSearchResultRenderer;
    public final C144347Gy timeBucketsProvider;

    public void A01(AnonymousClass206 r4, boolean z) {
        C147397Sz A002 = this.timeBucketsProvider.A00(r4.A0I);
        if (!C42171xk.A00(A002, this.latestBucket)) {
            AnonymousClass6FD.A02(C108945cZ.A0N(A002.toString(), Boolean.valueOf(z)), this, 12);
            this.latestBucket = A002;
        }
    }

    public C147387Sy(AnonymousClass118 r3, C18000vb r4, C32011gU r5, C138036wQ r6) {
        this.linkifyWeb = r5;
        this.messageSearchResultRenderer = r6;
        this.timeBucketsProvider = new C144347Gy(r3.A00, r4);
    }

    public void A00(C18030ve r8, List list, boolean z) {
        Object r3;
        int i;
        C441822l r2;
        list.size();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass206 A0Y = C17880vN.A0Y(it);
            if (A0Y != null) {
                if (z) {
                    A01(A0Y, false);
                }
                C138036wQ r0 = this.messageSearchResultRenderer;
                int i2 = A0Y.A0u;
                if (C138036wQ.A00(r0, i2)) {
                    C138036wQ r1 = this.messageSearchResultRenderer;
                    r3 = null;
                    if (C138036wQ.A00(r1, i2)) {
                        ((AnonymousClass20Z) r1.A00.getValue()).A00(i2);
                        StringBuilder A10 = AnonymousClass000.A10();
                        A10.append("View type should not be less than 0. ");
                        A10.append(i2);
                        C17960vV.A0F(false, AnonymousClass001.A1I(" return view type = ", A10, -1));
                    }
                } else {
                    if (A0Y instanceof AnonymousClass210) {
                        ArrayList A042 = this.linkifyWeb.A04(A0Y.A0P(), true);
                        i = 7;
                        r2 = A0Y;
                        if (A042 != null) {
                            i = 19;
                            r2 = A0Y;
                        }
                    } else if (A0Y instanceof C438921i) {
                        i = 11;
                        r2 = A0Y;
                    } else if (A0Y instanceof AnonymousClass218) {
                        i = 20;
                        r2 = A0Y;
                    } else if (!(A0Y instanceof C441822l)) {
                        if (!(A0Y instanceof AnonymousClass22Q)) {
                            if (A0Y instanceof C438421d) {
                                i = 16;
                                r2 = A0Y;
                            } else if (A0Y instanceof AnonymousClass21Y) {
                                i = 17;
                                r2 = A0Y;
                            } else if (A0Y instanceof C440021t) {
                                i = 18;
                                r2 = A0Y;
                            } else if (A0Y instanceof C441322g) {
                                i = 51;
                                r2 = A0Y;
                            } else if (A0Y instanceof C441522i) {
                                i = 53;
                                r2 = A0Y;
                            } else if ((A0Y instanceof C442222p) || (A0Y instanceof C442022n)) {
                                i = 21;
                                r2 = A0Y;
                            } else if ((A0Y instanceof AnonymousClass22H) && C18020vd.A05(C18040vf.A02, r8, 2662)) {
                                i = 26;
                                r2 = A0Y;
                            }
                        }
                        r3 = new AnonymousClass2NZ(A0Y);
                    } else if (AnonymousClass9RY.A00(A0Y) != null) {
                        i = 40;
                        r2 = A0Y;
                    } else {
                        C441822l r22 = (C441822l) A0Y;
                        boolean A1L = r22.A1L();
                        i = 14;
                        r2 = r22;
                        if (A1L) {
                            i = 15;
                            r2 = r22;
                        }
                    }
                    r3 = new C39611tM(r2, i);
                }
                add(r3);
            }
        }
    }
}
