package X;

/* renamed from: X.CVf  reason: case insensitive filesystem */
public class C25051CVf {
    public int A00;
    public int A01;

    public void A00(int i) {
        int i2;
        int i3 = this.A01;
        if (i3 < i || (i2 = this.A00) <= 0) {
            Object[] A1a = AnonymousClass8BR.A1a();
            BEA.A1V(A1a, i, 0, i3, 1);
            AnonymousClass3Ma.A1S(A1a, this.A00);
            EAY eay = C26265CwA.A00;
            if (eay.BfN(6)) {
                eay.CSX("com.facebook.imagepipeline.memory.BasePool.Counter", BE7.A0o("Unexpected decrement of %d. Current numBytes = %d, count = %d", A1a));
                return;
            }
            return;
        }
        this.A00 = i2 - 1;
        this.A01 = i3 - i;
    }
}
