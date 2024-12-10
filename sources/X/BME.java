package X;

import androidx.recyclerview.widget.RecyclerView;

public class BME extends C39711tW {
    public final DOZ A00;
    public final DFL A01;
    public final E8A A02;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BME)) {
            return false;
        }
        BME bme = (BME) obj;
        return bme.A02 == this.A02 && bme.A01.A04(53, 0) == this.A01.A04(53, 0);
    }

    public void A04(RecyclerView recyclerView, int i, int i2) {
        String str;
        DFL dfl = this.A01;
        int A04 = dfl.A04(53, 0);
        if (A04 != 0) {
            if (recyclerView.canScrollVertically(A04)) {
                str = "can_scroll";
            } else {
                str = "cannot_scroll";
            }
            C20046A4p A0Q = BE7.A0Q(str);
            DOZ doz = this.A00;
            C25681CkC.A03(doz, dfl, BE7.A0R(A0Q, doz, 1), this.A02);
        }
    }

    public BME(DOZ doz, DFL dfl, E8A e8a) {
        this.A01 = dfl;
        this.A02 = e8a;
        this.A00 = doz;
    }
}
