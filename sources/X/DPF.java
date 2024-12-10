package X;

public final class DPF implements B88 {
    /* JADX WARNING: type inference failed for: r1v5, types: [X.E8u, java.lang.Object] */
    public /* bridge */ /* synthetic */ Object CPg(Object obj) {
        Object A00;
        C20677AUj aUj;
        B89 b89 = (B89) obj;
        if (b89 != null) {
            C29621ca BXr = b89.BXr();
            C28473E2o e2o = null;
            if ((b89 instanceof C20677AUj) && (aUj = (C20677AUj) b89) != null) {
                e2o = aUj.A00;
            }
            C29621ca A0K = BXr.A0K("result");
            if (A0K == null && (A0K = BXr.A0K("update")) == null) {
                throw new C172908uD();
            }
            byte[] bArr = A0K.A01;
            if (!(e2o == null || bArr == null)) {
                Object A002 = CD9.A00(new C25171CaN(bArr));
                if (!(A002 instanceof AnonymousClass1IU)) {
                    try {
                        A002 = new C26261Cw6((C25846Cn2) A002);
                    } catch (Throwable th) {
                        A002 = C108945cZ.A1J(th);
                    }
                }
                C30691eM.A01(A002);
                Object A07 = ((C26261Cw6) A002).A07(e2o);
                C30691eM.A01(A07);
                Object A04 = new C26148CtD(new Object()).A04((C4V) A07);
                C30691eM.A01(A04);
                C180759Nu r1 = (C180759Nu) A04;
                if (r1 instanceof C173028uP) {
                    A00 = ((C173028uP) r1).A00;
                } else {
                    A00 = C30691eM.A00(new C173048uR(r1));
                }
                C30691eM.A01(A00);
                if (A00 != null) {
                    return A00;
                }
            }
        }
        return C17880vN.A15();
    }
}
