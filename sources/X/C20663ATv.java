package X;

import com.whatsapp.biz.catalog.manager.CatalogManager;
import com.whatsapp.jid.UserJid;
import java.util.List;
import java.util.Map;

/* renamed from: X.ATv  reason: case insensitive filesystem */
public abstract class C20663ATv implements C1606989o {
    public void BE5(C138506xC r13) {
        IllegalStateException th;
        UserJid userJid;
        try {
            if (r13.A00 == 0) {
                Object obj = r13.A03.A00;
                if (obj != null) {
                    C172588tf r3 = (C172588tf) this;
                    C138476x9 r7 = r3.A04;
                    boolean z = r3 instanceof C168508j0;
                    if (z) {
                        userJid = ((C168508j0) r3).A02.A04;
                    } else if (r3 instanceof C168548j4) {
                        userJid = ((C168548j4) r3).A04.A01;
                    } else if (r3 instanceof C168538j3) {
                        userJid = ((C168538j3) r3).A07.A01;
                    } else if (r3 instanceof C168528j2) {
                        userJid = ((C168528j2) r3).A08.A08;
                    } else if (r3 instanceof C168518j1) {
                        userJid = ((C168518j1) r3).A04.A05;
                    } else if (r3 instanceof C168488iy) {
                        userJid = ((C168488iy) r3).A01.A02;
                    } else {
                        userJid = ((C168498iz) r3).A01.A00;
                    }
                    int i = r3.A00;
                    C138476x9.A00(userJid, r7, i, 1, -1);
                    C199279zj r5 = r3.A03;
                    C180309Ma A04 = r3.A04();
                    C18070vi.A0d(userJid, 0);
                    C199279zj.A00(userJid, A04, r5, i, 0);
                    if (z) {
                        C168508j0 r32 = (C168508j0) r3;
                        AN4 an4 = (AN4) obj;
                        StringBuilder A0K = C18070vi.A0K(an4);
                        A0K.append("GetSingleCollectionGraphQLService/sendRequest/success jid=");
                        C195689tk r1 = r32.A02;
                        C17900vP.A0b(r1.A04, A0K);
                        C168508j0.A00(r32);
                        r32.A03.C7a(an4, r1);
                        return;
                    } else if (r3 instanceof C168548j4) {
                        C168548j4 r33 = (C168548j4) r3;
                        AN6 an6 = (AN6) obj;
                        C18070vi.A0d(an6, 0);
                        r33.A0A.A02("plm_details_view_tag");
                        r33.A02.A0I(r33.A04.A01, an6.A02);
                        List list = an6.A01;
                        if (list == null || list.isEmpty()) {
                            AN6.A00(r33.A05, 4);
                            r33.A00.A0G("GetProductListGraphQLService/onSuccessResponse error", "error_code=0", true);
                            return;
                        }
                        r33.A05.CBu(an6);
                        return;
                    } else if (r3 instanceof C168538j3) {
                        C168538j3 r34 = (C168538j3) r3;
                        C185559cm r4 = (C185559cm) obj;
                        C18070vi.A0d(r4, 0);
                        r34.A0A.A02("view_product_tag");
                        C26911Ty r12 = r34.A01;
                        C195469tO r6 = r34.A07;
                        UserJid userJid2 = r6.A01;
                        r12.A0I(userJid2, r4.A02);
                        C20287AEv aEv = r4.A01;
                        if (aEv != null) {
                            C20114A7x a7x = r34.A02;
                            a7x.A0I(aEv, userJid2);
                            a7x.A0H(r4.A00, userJid2);
                            r34.A04.BuA(r6, aEv.A0H);
                            return;
                        }
                        return;
                    } else if (r3 instanceof C168528j2) {
                        r3.A05.CGF(new C21450AkH(r3, obj, 7));
                        return;
                    } else if (r3 instanceof C168518j1) {
                        C168518j1 r35 = (C168518j1) r3;
                        C194219rN r42 = (C194219rN) obj;
                        C18070vi.A0d(r42, 0);
                        C168518j1.A00(r35);
                        C195539tV r52 = r35.A04;
                        r35.A01.A0H(r42.A01, r52.A05);
                        r35.A02.A00(r42, r52);
                        return;
                    } else if (r3 instanceof C168488iy) {
                        C168488iy r36 = (C168488iy) r3;
                        AN7 an7 = (AN7) obj;
                        C18070vi.A0d(an7, 0);
                        if (an7.A01.isEmpty()) {
                            r36.A03.Btm(r36.A01, 0);
                            return;
                        }
                        B7E b7e = r36.A03;
                        C195149ss r14 = r36.A01;
                        ANN ann = (ANN) b7e;
                        if (ann.A00 != 0) {
                            ((BAI) ann.A01).BuE(r14, an7);
                            return;
                        } else {
                            ((BAH) ann.A01).C7i(an7);
                            return;
                        }
                    } else {
                        C168498iz r37 = (C168498iz) r3;
                        C192999pN r43 = (C192999pN) obj;
                        C18070vi.A0d(r43, 0);
                        C183879Zy r62 = r37.A00;
                        C193509qD r53 = r37.A01;
                        C18070vi.A0d(r53, 0);
                        CatalogManager catalogManager = r62.A01;
                        C20114A7x A00 = CatalogManager.A00(catalogManager);
                        List list2 = r43.A00;
                        C198639yf A002 = C20114A7x.A00(A00, A76.A02(A00, r53.A00));
                        synchronized (A00) {
                            try {
                                A002.A04 = list2;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                        ((AnonymousClass1KB) catalogManager.A0N.getValue()).A0J(new C21455AkM(r62.A00, r53, r43, 28));
                        return;
                    }
                } else {
                    th = AnonymousClass000.A0n("No GraphQL Response available");
                }
            } else {
                Map map = r13.A04.A00;
                if (map != null) {
                    C172228t5 r38 = (C172228t5) this;
                    try {
                        if (AnonymousClass8BR.A1Y(map)) {
                            C1404571m r2 = (C1404571m) C17890vO.A0l(map).next();
                            r38.A03(r2, r38.A00.A00(r2.A01));
                            return;
                        }
                        throw AnonymousClass000.A0k("GraphQL errors map is empty");
                    } catch (Exception e) {
                        r38.Bsw(e);
                        return;
                    }
                } else {
                    th = AnonymousClass000.A0n("Error response received but no errors found");
                }
            }
            throw th;
        } catch (Exception e2) {
            Bsw(e2);
        }
    }
}
