package X;

import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import com.whatsapp.biz.catalog.manager.CatalogManager;
import com.whatsapp.comments.MessageCommentsManager;
import com.whatsapp.jid.UserJid;

/* renamed from: X.4gF  reason: invalid class name and case insensitive filesystem */
public class C91784gF implements C24051Ir {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C91784gF(Object obj, Object obj2, Object obj3, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
        this.A03 = obj3;
    }

    public static C24071It A00(AnonymousClass1FD r2, Object obj, Object obj2, Object obj3, int i) {
        return new C24071It(new C91784gF(obj, obj2, obj3, i), r2);
    }

    public /* synthetic */ AnonymousClass1J2 BG9(Class cls) {
        switch (this.A00) {
            case 1:
                Handler handler = (Handler) this.A03;
                AnonymousClass1K2 r1 = ((AnonymousClass4JA) this.A01).A00;
                AnonymousClass10E r0 = r1.A01;
                AnonymousClass11P A6O = AnonymousClass10E.A6O(r0);
                C18030ve A8r = AnonymousClass10E.A8r(r0);
                AnonymousClass1KB A12 = AnonymousClass10E.A12(r0);
                AnonymousClass10I AL1 = AnonymousClass10E.AL1(r0);
                C32011gU A0d = AnonymousClass3MY.A0d(r0);
                AnonymousClass18K A0g = AnonymousClass3Ma.A0g(r0);
                C18000vb A6Q = AnonymousClass10E.A6Q(r0);
                AnonymousClass4QJ A9z = AnonymousClass10G.A9z(r0.A00);
                AnonymousClass1PM A0f = AnonymousClass3MZ.A0f(r0);
                C19830z4 A0c = AnonymousClass3Ma.A0c(r0);
                AnonymousClass1K1 r12 = r1.A00;
                C86434Rp A122 = AnonymousClass1K1.A12(r12);
                Application A002 = AnonymousClass0YX.A00(r0.Ao9);
                BDO bdo = (BDO) r0.A9v.get();
                C822444b r34 = (C822444b) r0.A1O.get();
                C32981i4 r35 = (C32981i4) r0.A3G.get();
                AnonymousClass1T6 r39 = (AnonymousClass1T6) r0.A6B.get();
                AnonymousClass1OZ r40 = (AnonymousClass1OZ) r0.A6N.get();
                AnonymousClass1c4 r41 = (AnonymousClass1c4) r0.A7C.get();
                C85184Mk r42 = (C85184Mk) r12.A55.get();
                AnonymousClass1QD r43 = (AnonymousClass1QD) r0.A89.get();
                C23651Hc r23 = (C23651Hc) r0.ACD.get();
                C26911Ty r24 = (C26911Ty) r0.A1J.get();
                C36211nW r25 = (C36211nW) this.A02;
                C20114A7x a7x = (C20114A7x) r0.A1q.get();
                CatalogManager catalogManager = (CatalogManager) r0.A1s.get();
                return new AnonymousClass3TA(A002, handler, A12, AnonymousClass10E.A17(r0), (AnonymousClass181) r0.AA9.get(), (C25001Mm) r0.ABf.get(), r23, r24, r25, a7x, catalogManager, bdo, A0f, A122, A6O, A0c, A6Q, r34, r35, A8r, A0g, A0d, r39, r40, r41, r42, r43, A9z, AL1, C000200d.A00(r0.A85));
            case 3:
                return ((C56362hL) this.A01).A00((AnonymousClass1EC) this.A02, (AnonymousClass1EC) this.A03);
            case 4:
                AnonymousClass1K2 r02 = ((C96254nY) ((C106935Xt) this.A01)).A00;
                AnonymousClass10E r13 = r02.A01;
                AnonymousClass11P A6O2 = AnonymousClass10E.A6O(r13);
                C36401np A0e = AnonymousClass3MY.A0e(r13.A00);
                AnonymousClass11S A17 = AnonymousClass10E.A17(r13);
                AnonymousClass10I AL12 = AnonymousClass10E.AL1(r13);
                AnonymousClass1CJ A0d2 = AnonymousClass3Ma.A0d(r13);
                AnonymousClass1M9 A4z = AnonymousClass10E.A4z(r13);
                C24671Lf A0S = AnonymousClass3Ma.A0S(r13);
                C36531o3 A0T = AnonymousClass3Ma.A0T(r13);
                AnonymousClass1MZ A0V = AnonymousClass3MY.A0V(r13);
                C195899u7 r18 = (C195899u7) r13.A4q.get();
                C53112c0 r132 = (C53112c0) r13.A3b.get();
                C27161Uy r14 = (C27161Uy) r13.A4r.get();
                return new AnonymousClass3VF((C84294Iy) r02.A00.A1a.get(), A17, A4z, A0S, r132, r14, A0T, A6O2, A0d2, r18, A0V, (C194389re) r13.A7Y.get(), (AnonymousClass1MX) r13.A7x.get(), (C41001ve) r13.A4k.get(), (AnonymousClass1EC) this.A02, (AnonymousClass1HB) this.A03, A0e, AL12);
            case 7:
                AnonymousClass10E r03 = ((AnonymousClass4JG) this.A02).A00.A01;
                AnonymousClass10I AL13 = AnonymousClass10E.AL1(r03);
                return new AnonymousClass3UN((C139166yK) r03.A00.A0S.get(), (UserJid) this.A03, (C136036tA) this.A01, AL13);
            default:
                C60282nh.A01();
                throw null;
        }
    }

    public AnonymousClass1J2 BGl(C24091Iv r30, Class cls) {
        switch (this.A00) {
            case 0:
                C36251na r2 = ((AnonymousClass4K6) this.A01).A00;
                AnonymousClass10E r0 = r2.A02;
                C18030ve A8r = AnonymousClass10E.A8r(r0);
                AnonymousClass11S A17 = AnonymousClass10E.A17(r0);
                AnonymousClass1M9 A4z = AnonymousClass10E.A4z(r0);
                AnonymousClass11C A0a = AnonymousClass3Ma.A0a(r0);
                AnonymousClass1W6 A0s = AnonymousClass3Ma.A0s(r0);
                AnonymousClass126 A0X = AnonymousClass3MY.A0X(r0);
                C24681Lg A0o = AnonymousClass3MZ.A0o(r0);
                C42211xo A0i = AnonymousClass3Ma.A0i(r0);
                C18600wl A1B = AnonymousClass3MZ.A1B(r0);
                C18600wl A1C = AnonymousClass3MZ.A1C(r0);
                AnonymousClass1MZ A0V = AnonymousClass3MY.A0V(r0);
                C18010vc A0r = AnonymousClass3Ma.A0r(r0);
                return new AnonymousClass3VA((AnonymousClass4K7) r2.A01.A0Z.get(), A17, (C33251iW) r0.AB9.get(), (MessageCommentsManager) r0.A6P.get(), A4z, A0a, A0V, A0o, A8r, A0X, AnonymousClass3MY.A0Y(r0), A0i, (AnonymousClass1BI) this.A02, (C32511hJ) r0.A4O.get(), A0r, (AnonymousClass205) this.A03, A0s, A1B, A1C);
            case 2:
                AnonymousClass10E r5 = ((AnonymousClass4K9) this.A01).A00.A02;
                AnonymousClass11S A172 = AnonymousClass10E.A17(r5);
                AnonymousClass118 A0l = AnonymousClass3MZ.A0l(r5);
                AnonymousClass1CJ A0d = AnonymousClass3Ma.A0d(r5);
                AnonymousClass1W6 A0s2 = AnonymousClass3Ma.A0s(r5);
                C24751Ln A0q = AnonymousClass3MZ.A0q(r5);
                C24681Lg A0o2 = AnonymousClass3MZ.A0o(r5);
                return new C73353Va(A172, AnonymousClass3Ma.A0S(r5), A0l, A0d, AnonymousClass3MY.A0V(r5), A0o2, (AnonymousClass1WX) r5.A9N.get(), A0q, (C88124Yk) r5.A3n.get(), (C82984Cx) this.A03, (AnonymousClass205) this.A02, A0s2, (C30361do) r5.A74.get(), AnonymousClass3MZ.A1B(r5));
            case 5:
                AnonymousClass10E r1 = ((C84364Jf) this.A01).A00.A01;
                AnonymousClass10I AL1 = AnonymousClass10E.AL1(r1);
                AnonymousClass1M9 A4z2 = AnonymousClass10E.A4z(r1);
                C34511kb A0b = AnonymousClass3MZ.A0b(r1);
                C27141Uw r14 = (C27141Uw) r1.A4m.get();
                return new C73363Vb((Bundle) this.A02, (C56552he) r1.A45.get(), A0b, A4z2, r14, (AnonymousClass1EC) this.A03, AL1);
            case 6:
                AnonymousClass1K2 r22 = ((AnonymousClass4JQ) this.A02).A00;
                AnonymousClass1K1 r12 = r22.A00;
                AnonymousClass10E r9 = r22.A01;
                AnonymousClass10I AL12 = AnonymousClass10E.AL1(r9);
                AnonymousClass10E r3 = r12.AAQ;
                C80433x8 r10 = new C80433x8((C27191Vc) r3.A2i.get(), (AnonymousClass118) r3.ABY.get(), (AnonymousClass10I) r3.AC1.get());
                AnonymousClass1CJ A0d2 = AnonymousClass3Ma.A0d(r9);
                AnonymousClass10G r13 = r9.A00;
                C24751Ln A0q2 = AnonymousClass3MZ.A0q(r9);
                AnonymousClass1M9 A4z3 = AnonymousClass10E.A4z(r9);
                C18030ve A8r2 = AnonymousClass10E.A8r(r9);
                return new C76823oU((C19880zA) r9.A7k.get(), C19890zB.A00, (C84204Io) r12.A1L.get(), r10, A4z3, A0d2, (AnonymousClass1E7) this.A01, A0q2, A8r2, (AnonymousClass1BI) this.A03, (AnonymousClass4RU) r9.AB0.get(), (AnonymousClass1c4) r9.A7C.get(), (C35681md) r9.A7N.get(), (AnonymousClass4RH) r13.A3N.get(), (C86454Rr) r13.A3Q.get(), AL12, AnonymousClass3MZ.A1B(r9));
            default:
                return C72453Mb.A0a(this, cls);
        }
    }
}
