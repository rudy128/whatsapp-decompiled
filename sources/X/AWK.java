package X;

public class AWK implements B8M {
    public final int A00;
    public final Object A01;

    public AWK(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public C173718vc BGw(C22508BAp bAp, C191659mx r15, C19989A2b a2b, String str) {
        AnonymousClass10E r1;
        int i = this.A00;
        Object obj = this.A01;
        if (i != 0) {
            r1 = ((AnonymousClass10H) obj).A00;
        } else {
            r1 = ((AnonymousClass1K2) obj).A01;
        }
        AnonymousClass190 A0N = AnonymousClass3MY.A0N(r1);
        AnonymousClass10I AL1 = AnonymousClass10E.AL1(r1);
        C18000vb A6Q = AnonymousClass10E.A6Q(r1);
        return new C173718vc(A0N, AnonymousClass8BT.A0B(r1), AnonymousClass8BU.A0F(r1), A6Q, AnonymousClass10E.A8r(r1), bAp, r15, a2b, (C183279Xq) r1.A00.A1B.get(), AL1, str);
    }
}
