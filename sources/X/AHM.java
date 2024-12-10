package X;

import androidx.recyclerview.widget.RecyclerView;

public final class AHM implements C40451uj {
    public int A00 = -1;
    public final RecyclerView A01;
    public final AnonymousClass8I0 A02;

    public void BoA(Object obj, int i, int i2) {
        this.A02.A01.A04(obj, i, i2);
    }

    public void Bw0(int i, int i2) {
        int i3 = this.A00;
        if (i3 == -1 || i3 > i) {
            this.A00 = i;
            this.A01.A0f(0);
        }
        this.A02.A01.A02(i, i2);
    }

    public void Byk(int i, int i2) {
        this.A02.A01.A01(i, i2);
    }

    public void C34(int i, int i2) {
        this.A02.A01.A03(i, i2);
    }

    public AHM(RecyclerView recyclerView, AnonymousClass8I0 r3) {
        this.A02 = r3;
        this.A01 = recyclerView;
    }
}
