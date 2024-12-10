package X;

import androidx.recyclerview.widget.RecyclerView;

public class BMD extends C39711tW {
    public final DOZ A00;
    public final DFL A01;
    public final E8A A02;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BMD)) {
            return false;
        }
        BMD bmd = (BMD) obj;
        return bmd.A02 == this.A02 && bmd.A01 == this.A01;
    }

    public void A04(RecyclerView recyclerView, int i, int i2) {
        if (i != 0 || i2 != 0) {
            DFL dfl = this.A01;
            E8A e8a = this.A02;
            C25681CkC.A03(this.A00, dfl, C108985cd.A0J(dfl).A02(), e8a);
        }
    }

    public BMD(DOZ doz, DFL dfl, E8A e8a) {
        this.A01 = dfl;
        this.A00 = doz;
        this.A02 = e8a;
    }
}
