package X;

import com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel;
import com.whatsapp.jid.Jid;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: X.ATl  reason: case insensitive filesystem */
public class C20653ATl implements C22508BAp {
    public C172208t3 A00;
    public C20654ATm A01;
    public C20646ATe A02;
    public C20650ATi A03;
    public C20644ATc A04;
    public C20648ATg A05;
    public C20645ATd A06;
    public BAX A07;
    public BAY A08;
    public AP5 A09;
    public AP6 A0A;
    public AP6 A0B;
    public C184249ae A0C;
    public C186579eQ A0D;
    public BusinessDirectoryContextualSearchViewModel A0E;
    public C20647ATf A0F;
    public final B51 A0G;
    public final C22420B7c A0H;
    public final B52 A0I;
    public final C22422B7e A0J;
    public final B54 A0K;
    public final B55 A0L;
    public final AnonymousClass9XW A0M;
    public final AnonymousClass1XN A0N;
    public final Set A0O = C17880vN.A12();
    public final C22421B7d A0P;
    public final B53 A0Q;
    public final C199299zl A0R;
    public final AnonymousClass1M9 A0S;
    public final B8M A0T;
    public final AnonymousClass3KM A0U;

    public void A04(C20079A6f a6f) {
        AnonymousClass10E r0;
        A01();
        B53 b53 = this.A0Q;
        C191659mx r10 = this.A0M.A00;
        C20536AOv aOv = (C20536AOv) b53;
        int i = aOv.A00;
        Object obj = aOv.A01;
        if (i != 0) {
            r0 = ((C37391pS) obj).A00;
        } else {
            r0 = ((AnonymousClass1K2) obj).A01;
        }
        AnonymousClass190 A0N2 = AnonymousClass3MY.A0N(r0);
        AnonymousClass10I AL1 = AnonymousClass10E.AL1(r0);
        C18000vb A6Q = AnonymousClass10E.A6Q(r0);
        C18030ve A8r = AnonymousClass10E.A8r(r0);
        C22416B6y A0B2 = AnonymousClass8BT.A0B(r0);
        C24521Kq A0F2 = AnonymousClass8BU.A0F(r0);
        AnonymousClass10G r02 = r0.A00;
        C169128kP r1 = new C169128kP(A0N2, A0B2, AnonymousClass8BT.A0E(r02), a6f, A0F2, A6Q, A8r, this, r10, AnonymousClass8BT.A0O(r02), AL1);
        r1.A00 = "2.0";
        r1.A0E();
        this.A00 = r1;
    }

    public void A05(List list, List list2) {
        A01();
        C20647ATf aTf = new C20647ATf(this, list);
        this.A0F = aTf;
        C169168kT BGy = this.A0J.BGy(aTf, this.A0M.A00, (String) null, list, list2);
        BGy.A0E();
        this.A00 = BGy;
    }

    public void A00() {
        Set<C20462ALz> set = this.A0O;
        for (C20462ALz aLz : set) {
            A34 a34 = aLz.A06;
            if (a34.A09() != 2 && !C108945cZ.A1T(a34)) {
                aLz.A0D();
            }
        }
        set.clear();
    }

    public void A01() {
        C172208t3 r0 = this.A00;
        if (r0 != null && r0.A06.A09() != 2 && !C108945cZ.A1T(this.A00.A06)) {
            this.A00.A0D();
            this.A00 = null;
        }
    }

    public void A02(C184189aY r17, C190499l3 r18, C20079A6f a6f, Jid jid, String str) {
        C172208t3 BGx;
        AnonymousClass10E r1;
        A01();
        AnonymousClass1XN r2 = this.A0N;
        C184189aY r5 = r17;
        C190499l3 r6 = r18;
        C20079A6f a6f2 = a6f;
        Jid jid2 = jid;
        if (r2.A02()) {
            if (C18020vd.A05(C18040vf.A02, r2.A03, 3400)) {
                C20646ATe aTe = new C20646ATe(a6f2, this);
                this.A02 = aTe;
                B52 b52 = this.A0I;
                C191659mx r12 = this.A0M.A00;
                C20534AOt aOt = (C20534AOt) b52;
                int i = aOt.A00;
                Object obj = aOt.A01;
                if (i != 0) {
                    r1 = ((C37391pS) obj).A00;
                } else {
                    r1 = ((AnonymousClass1K2) obj).A01;
                }
                C18030ve A8r = AnonymousClass10E.A8r(r1);
                AnonymousClass190 A0N2 = AnonymousClass3MY.A0N(r1);
                AnonymousClass10I AL1 = AnonymousClass10E.AL1(r1);
                C18000vb A6Q = AnonymousClass10E.A6Q(r1);
                C22416B6y A0B2 = AnonymousClass8BT.A0B(r1);
                C24521Kq A0F2 = AnonymousClass8BU.A0F(r1);
                AnonymousClass10G r13 = r1.A00;
                BGx = new C169188kV(A0N2, A0B2, AnonymousClass8BT.A0E(r13), r5, r6, a6f2, A0F2, A6Q, A8r, aTe, r12, jid2, AnonymousClass8BT.A0O(r13), AL1);
                BGx.A0E();
                this.A00 = BGx;
            }
        }
        C20650ATi aTi = new C20650ATi(a6f2, this, jid2);
        this.A03 = aTi;
        BGx = this.A0H.BGx(r5, r6, a6f2, (AEQ) null, aTi, this.A0M.A00, "all_descendents", "all_descendents", str, "chaining");
        BGx.A0E();
        this.A00 = BGx;
    }

    public void A03(C184189aY r13, C190499l3 r14, C20079A6f a6f, String str) {
        if (!(this.A00 instanceof C169148kR)) {
            A01();
        }
        C20650ATi aTi = new C20650ATi(a6f, this, (Jid) null);
        this.A03 = aTi;
        C169208kX BGx = this.A0H.BGx(r13, r14, a6f, (AEQ) null, aTi, this.A0M.A00, "all_descendents", "all_descendents", str, "nearby");
        BGx.A0E();
        this.A00 = BGx;
    }

    public void BtA(C190599lD r4, int i) {
        C184249ae r2 = this.A0C;
        if (r2 != null) {
            C186569eP r1 = r2.A01;
            r1.A01 = 4;
            r1.A00 = i;
            r2.A00.A0E(r1);
        }
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C186569eP r1;
        List list = (List) obj;
        C184249ae r7 = this.A0C;
        if (r7 != null) {
            if (list.isEmpty()) {
                r1 = r7.A01;
                r1.A01 = 3;
            } else {
                ArrayList A13 = AnonymousClass000.A13();
                int i = 0;
                while (i < list.size()) {
                    AEQ aeq = (AEQ) list.get(i);
                    i++;
                    A13.add(new C174118wG(new C177679Ad(r7, i, 2, aeq), aeq.A00, aeq.A01));
                }
                r1 = r7.A01;
                r1.A01 = 1;
                List list2 = r1.A03;
                list2.clear();
                list2.addAll(A13);
            }
            r7.A00.A0E(r1);
        }
    }

    public C20653ATl(B51 b51, C22420B7c b7c, B52 b52, C22421B7d b7d, B53 b53, C22422B7e b7e, B54 b54, AnonymousClass3KM r9, B55 b55, C199299zl r11, AnonymousClass1M9 r12, AnonymousClass9XW r13, AnonymousClass1XN r14, B8M b8m) {
        this.A0S = r12;
        this.A0N = r14;
        this.A0M = r13;
        this.A0P = b7d;
        this.A0K = b54;
        this.A0L = b55;
        this.A0U = r9;
        this.A0I = b52;
        this.A0T = b8m;
        this.A0H = b7c;
        this.A0J = b7e;
        this.A0Q = b53;
        this.A0G = b51;
        this.A0R = r11;
    }
}
