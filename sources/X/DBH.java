package X;

public class DBH implements E4L {
    public void CFN(C25979Cps cps, Throwable th) {
        String A0U;
        Object A01 = cps.A01();
        Class<DRN> cls = DRN.class;
        Object[] A1a = AnonymousClass8BR.A1a();
        AnonymousClass000.A1L(A1a, System.identityHashCode(this));
        AnonymousClass000.A1M(A1a, System.identityHashCode(cps));
        if (A01 == null) {
            A0U = null;
        } else {
            A0U = C17890vO.A0U(A01);
        }
        A1a[2] = A0U;
        EAY eay = C26265CwA.A00;
        if (eay.BfN(5)) {
            eay.CRu(cls.getSimpleName(), BE7.A0o("Finalized without closing: %x %x (type = %s)", A1a));
        }
    }
}
