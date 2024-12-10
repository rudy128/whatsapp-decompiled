package X;

/* renamed from: X.DGy  reason: case insensitive filesystem */
public abstract class C26867DGy implements E9F {
    public void Bnq(C25820CmX cmX) {
        if (this instanceof BVz) {
            BVz bVz = (BVz) this;
            bVz.A03.A0S = true;
            C64062u9.A0Q(bVz.A02);
        }
    }

    public void C23(double d) {
        if (this instanceof BVz) {
            BVz bVz = (BVz) this;
            int i = bVz.A00;
            boolean z = true;
            int i2 = bVz.A01;
            int i3 = (int) (((((double) (i - 1)) + d) * 100.0d) / ((double) i2));
            DPW dpw = bVz.A03;
            if (dpw.A02 != null) {
                if (!dpw.A0S) {
                    C28531E6f e6f = dpw.A02;
                    if (e6f != null) {
                        e6f.C22(i3);
                    }
                    z = false;
                }
                dpw.A0S = z;
                if (i3 < 5 || i3 % 5 == 0) {
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("VideoTranscoder/transcode/progress ");
                    A10.append(i);
                    A10.append('/');
                    A10.append(i2);
                    A10.append(' ');
                    C17900vP.A0o(A10, i3);
                }
            }
        }
    }
}
