package X;

public class DED implements C28499E4e {
    public final int A00;
    public final Object A01;

    public DED(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void Bzn(int i, int i2, int i3, int i4) {
        if (this.A00 != 0) {
            C22811BPz bPz = (C22811BPz) this.A01;
            DF0 df0 = bPz.A02;
            C28111Yx.A02(df0);
            df0.A03 = i;
            df0.A01 = i2;
            df0.A02 = i3;
            DF0 df02 = bPz.A02;
            C28111Yx.A02(df02);
            df02.A00 = ((((i4 + 45) + 360) / 90) % 4) * 90;
            return;
        }
        ((C22810BPy) this.A01).A00 = i4 + i3;
    }
}
