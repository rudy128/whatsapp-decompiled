package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public class BMG extends C39711tW {
    public int A00 = -1;
    public boolean A01;
    public final BM9 A02;
    public final DOZ A03;
    public final DFL A04;

    public void A03(RecyclerView recyclerView, int i) {
        C38251qy layoutManager;
        View A05;
        boolean z = true;
        if (i != 1) {
            if (i == 0 && (layoutManager = recyclerView.getLayoutManager()) != null && (A05 = this.A02.A05(layoutManager)) != null) {
                int A002 = RecyclerView.A00(A05);
                if (A002 != this.A00 || this.A01) {
                    A00(this.A03, this.A04, A002, this.A01);
                    this.A00 = A002;
                    z = false;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        this.A01 = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            BMG bmg = (BMG) obj;
            return this.A02 == bmg.A02 && this.A04.A04 == bmg.A04.A04;
        }
        return false;
    }

    public static void A00(DOZ doz, DFL dfl, int i, boolean z) {
        C20046A4p a4p;
        E8A A0A = dfl.A0A(97);
        if (A0A != null) {
            a4p = new C20046A4p();
            a4p.A03(Integer.valueOf(i), 0);
            a4p.A03(Boolean.valueOf(z), 1);
            a4p.A03(doz, 2);
        } else {
            A0A = dfl.A0A(51);
            if (A0A != null) {
                a4p = new C20046A4p();
                a4p.A03(Integer.valueOf(i), 0);
                a4p.A03(doz, 1);
            } else {
                return;
            }
        }
        C26209Cul.A03(doz, dfl, a4p, A0A);
    }

    public int hashCode() {
        return AnonymousClass000.A0L(this.A02) + this.A04.A04;
    }

    public BMG(BM9 bm9, DOZ doz, DFL dfl) {
        this.A03 = doz;
        this.A04 = dfl;
        this.A02 = bm9;
    }
}
