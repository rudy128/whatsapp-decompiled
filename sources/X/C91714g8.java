package X;

import android.content.Intent;
import java.util.Set;

/* renamed from: X.4g8  reason: invalid class name and case insensitive filesystem */
public class C91714g8 implements C24051Ir {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C91714g8(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A00 = i;
        this.A02 = obj2;
        this.A04 = obj4;
        this.A01 = obj3;
        this.A03 = obj;
    }

    public AnonymousClass1J2 BG9(Class cls) {
        switch (this.A00) {
            case 0:
                C446324e r6 = (C446324e) this.A01;
                AnonymousClass1K2 r2 = ((AnonymousClass2XL) this.A03).A00;
                AnonymousClass10E r1 = r2.A01;
                C1408073d r8 = (C1408073d) r1.A11.get();
                return new AnonymousClass3V2(C19890zB.A00, r6, (AnonymousClass4JV) r2.A00.A2i.get(), r8, (AnonymousClass1BI) this.A02, (Set) this.A04, AnonymousClass3MZ.A1B(r1));
            case 3:
                AnonymousClass1Nb r4 = (AnonymousClass1Nb) this.A02;
                AnonymousClass10E r12 = ((C84484Jr) this.A01).A00.A01;
                C18030ve A8r = AnonymousClass10E.A8r(r12);
                AnonymousClass00H A002 = C000200d.A00(r12.A2f);
                AnonymousClass00H A003 = C000200d.A00(r12.AAB);
                AnonymousClass00H A004 = C000200d.A00(r12.A00.A4o);
                C18600wl A1B = AnonymousClass3MZ.A1B(r12);
                return new C111235jF((C19880zA) r12.A7n.get(), (C24661Le) this.A04, A8r, r4, (AnonymousClass1W6) this.A03, A002, A003, A004, A1B);
            default:
                C60282nh.A01();
                throw null;
        }
    }

    public /* synthetic */ AnonymousClass1J2 BGl(C24091Iv r47, Class cls) {
        switch (this.A00) {
            case 1:
                AnonymousClass1BI r16 = (AnonymousClass1BI) this.A04;
                AnonymousClass1K2 r2 = ((C84194In) this.A02).A00;
                AnonymousClass1K1 r0 = r2.A00;
                AnonymousClass10E r3 = r2.A01;
                AnonymousClass10I AL1 = AnonymousClass10E.AL1(r3);
                C18030ve A8r = AnonymousClass10E.A8r(r3);
                AnonymousClass10G r1 = r3.A00;
                C25181Nf A0m = AnonymousClass3MZ.A0m(r3);
                AnonymousClass11S A17 = AnonymousClass10E.A17(r3);
                C24921Me A0g = AnonymousClass3MZ.A0g(r3);
                AnonymousClass12L A0u = AnonymousClass3MZ.A0u(r3);
                C25491Ok A0h = AnonymousClass3MZ.A0h(r3);
                AnonymousClass1MB A0k = AnonymousClass3Ma.A0k(r3);
                C42221xp r30 = (C42221xp) r3.AA1.get();
                C85144Mg r34 = (C85144Mg) r0.A4T.get();
                AnonymousClass4SJ r35 = (AnonymousClass4SJ) r1.A2q.get();
                AnonymousClass1BI r36 = r16;
                AnonymousClass4RU r37 = (AnonymousClass4RU) r3.AB0.get();
                C37701pz r38 = (C37701pz) r1.A55.get();
                C36421nr r39 = (C36421nr) r1.A3t.get();
                AnonymousClass72R r24 = (AnonymousClass72R) r1.A0h.get();
                AnonymousClass1E7 r28 = (AnonymousClass1E7) this.A01;
                C58522kp r29 = (C58522kp) r1.A1M.get();
                C56342hJ r22 = (C56342hJ) r0.A1O.get();
                C84224Iq r21 = (C84224Iq) r0.A1N.get();
                C84214Ip r20 = (C84214Ip) r0.A1M.get();
                C84204Io r19 = (C84204Io) r0.A1L.get();
                return new C76813oT((Intent) this.A03, r19, r20, r21, r22, A17, r24, A0g, A0h, A0m, r28, r29, r30, A8r, A0u, A0k, r34, r35, r36, r37, r38, r39, AL1, C000200d.A00(r3.A2Y), C000200d.A00(r3.A2Z), C000200d.A00(r3.A2c), AnonymousClass3MZ.A1B(r3), AnonymousClass3MZ.A1C(r3));
            case 2:
                AnonymousClass10E r02 = ((AnonymousClass2XT) this.A01).A00.A01;
                C18000vb A6Q = AnonymousClass10E.A6Q(r02);
                AnonymousClass1QB r212 = (AnonymousClass1QB) r02.A4T.get();
                C73103Oz r192 = (C73103Oz) this.A03;
                return new AnonymousClass3UY((Intent) this.A04, r192, A6Q, r212, (AnonymousClass1BI) this.A02);
            default:
                return C72453Mb.A0a(this, cls);
        }
    }
}
