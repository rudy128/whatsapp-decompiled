package X;

public class AXF implements C33661jB {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public AXF(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A03 = str;
        this.A02 = obj;
    }

    public void C3L(A7B a7b) {
        if (this.A00 != 0) {
            ((AnonymousClass1FU) this.A02).CEx();
            return;
        }
        String str = this.A03;
        AQF.A00((C22459B8r) this.A02, (AQF) this.A01, str);
    }

    public void C3X(A7B a7b) {
        if (this.A00 != 0) {
            ((AnonymousClass1FU) this.A02).CEx();
            return;
        }
        String str = this.A03;
        AQF.A00((C22459B8r) this.A02, (AQF) this.A01, str);
    }

    public void C3Y(C186089dd r8) {
        if (this.A00 != 0) {
            C186089dd r2 = r8;
            C18070vi.A0d(r8, 0);
            if (!(r8 instanceof C176028zf)) {
                ((AnonymousClass1FU) this.A02).CEx();
                return;
            }
            AnonymousClass1FP r3 = (AnonymousClass1FP) this.A02;
            r3.A05.CGN(new C21456AkN(r2, r3, this.A01, this.A03, 38));
            return;
        }
        AQF aqf = (AQF) this.A01;
        String str = this.A03;
        aqf.A00.remove(str);
        aqf.A01.remove(str);
    }
}
