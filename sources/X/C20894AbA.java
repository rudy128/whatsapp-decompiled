package X;

/* renamed from: X.AbA  reason: case insensitive filesystem */
public abstract class C20894AbA implements C437420t {
    public final AnonymousClass118 A00;
    public final C18000vb A01;
    public final C22520BBd A02;

    public final AnonymousClass3KT BXU(AnonymousClass206 r5) {
        String A0S;
        String A0I;
        String str;
        int i;
        String A0k;
        C18070vi.A0d(r5, 0);
        C438921i r52 = (C438921i) r5;
        if (A3I.A02(r52)) {
            String A19 = r52.A19();
            C62572rc r0 = r52.A02;
            if (r0 != null) {
                i = r0.A01;
            } else {
                i = 0;
            }
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("👤 ");
            if (A19 == null || A19.length() <= 0) {
                AnonymousClass118 r02 = this.A00;
                if (i == 1) {
                    A0k = r02.A00.getString(2131889020);
                } else {
                    A0k = C72473Md.A0k(AnonymousClass3MW.A05(r02), i, 2131755251);
                }
            } else {
                A0k = AnonymousClass1EG.A0E(A19, 128);
            }
            A0I = AnonymousClass000.A0y(A0k, A10);
        } else {
            String str2 = r52.A01;
            if ((str2 == null || str2.length() <= 0) && ((A0S = r52.A0S()) == null || A0S.length() <= 0)) {
                String BVQ = this.A02.BVQ(r52);
                if (A3I.A02(r52)) {
                    BVQ = null;
                }
                C56302hF r2 = C61522pp.A03;
                if (BVQ == null || BVQ.length() == 0) {
                    BVQ = r52.A19();
                }
                String A002 = r2.A00(BVQ, "📄", this.A00.A00.getString(2131889022));
                StringBuilder A102 = AnonymousClass000.A10();
                A102.append('(');
                String A0B = C17900vP.A0B(C62272r8.A04.A09(this.A01, r52), A102);
                if (r52.A00 <= 0 || A0B == null) {
                    A0B = "";
                }
                A0I = AnonymousClass1YF.A0I(C17890vO.A0Z(A0B, AnonymousClass000.A11(A002), ' '));
            } else {
                C56302hF r3 = C61522pp.A03;
                String A0S2 = r52.A0S();
                if (A0S2 == null || A0S2.length() == 0) {
                    str = r52.A01;
                } else {
                    str = r52.A0S();
                }
                A0I = r3.A00(str, "📄", this.A00.A00.getString(2131889022));
            }
        }
        return new C690335q(A0I);
    }

    public C20894AbA(AnonymousClass118 r1, C18000vb r2, C22520BBd bBd) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = bBd;
    }
}
