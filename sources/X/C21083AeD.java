package X;

/* renamed from: X.AeD  reason: case insensitive filesystem */
public class C21083AeD implements B9V {
    public final int A00;
    public final Object A01;

    public C21083AeD(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void C9b(int i, int i2, long j, long j2) {
        if (this.A00 != 0) {
            Integer[] numArr = new Integer[1];
            C17880vN.A1T(numArr, i + ((int) (((float) i2) * (((float) j) / ((float) j2)))), 0);
            ((A34) this.A01).A0C(numArr);
            return;
        }
        Integer[] numArr2 = new Integer[1];
        AnonymousClass000.A1L(numArr2, i + ((int) (((float) i2) * (((float) j) / ((float) j2)))));
        ((A34) this.A01).A0C(numArr2);
    }
}
