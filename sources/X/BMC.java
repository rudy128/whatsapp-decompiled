package X;

import androidx.recyclerview.widget.RecyclerView;

public class BMC extends C39711tW {
    public boolean A00 = false;
    public final /* synthetic */ BM9 A01;

    public BMC(BM9 bm9) {
        this.A01 = bm9;
    }

    public void A03(RecyclerView recyclerView, int i) {
        if (i == 0 && this.A00) {
            this.A00 = false;
            this.A01.A07();
        }
    }

    public void A04(RecyclerView recyclerView, int i, int i2) {
        if (i != 0 || i2 != 0) {
            this.A00 = true;
        }
    }
}
