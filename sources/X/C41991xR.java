package X;

import android.view.View;
import java.util.List;

/* renamed from: X.1xR  reason: invalid class name and case insensitive filesystem */
public class C41991xR {
    public int A00;
    public int A01;
    public int A02 = 0;
    public int A03;
    public int A04;
    public int A05;
    public int A06 = 0;
    public int A07;
    public int A08;
    public List A09 = null;
    public boolean A0A;
    public boolean A0B = true;

    public View A00(C37931qQ r7) {
        List list = this.A09;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = ((C42011xT) this.A09.get(i)).A0H;
                C38491rN r2 = (C38491rN) view.getLayoutParams();
                if ((r2.A00.A00 & 8) == 0 && this.A01 == r2.A00()) {
                    A01(view);
                    return view;
                }
            }
            return null;
        }
        View A022 = r7.A02(this.A01);
        this.A01 += this.A03;
        return A022;
    }

    public void A01(View view) {
        int i;
        int A002;
        int size = this.A09.size();
        View view2 = null;
        int i2 = Integer.MAX_VALUE;
        int i3 = 0;
        while (true) {
            if (i3 < size) {
                View view3 = ((C42011xT) this.A09.get(i3)).A0H;
                C38491rN r1 = (C38491rN) view3.getLayoutParams();
                if (view3 != view && (r1.A00.A00 & 8) == 0 && (A002 = (r1.A00() - this.A01) * this.A03) >= 0 && A002 < i2) {
                    view2 = view3;
                    if (A002 == 0) {
                        break;
                    }
                    i2 = A002;
                }
                i3++;
            } else if (view2 == null) {
                i = -1;
            }
        }
        i = ((C38491rN) view2.getLayoutParams()).A00();
        this.A01 = i;
    }
}
