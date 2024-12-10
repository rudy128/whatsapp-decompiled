package X;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* renamed from: X.ClD  reason: case insensitive filesystem */
public class C25743ClD {
    public static final ViewGroup.MarginLayoutParams A09;
    public BLm A00;
    public final BVF A01;
    public final CU5 A02;
    public final C24782CKb A03;
    public volatile C37981qV A04;
    public volatile BM9 A05;
    public volatile BM0 A06;
    public volatile Integer A07;
    public volatile List A08;

    static {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        marginLayoutParams.setMargins(0, 0, 0, 0);
        A09 = marginLayoutParams;
    }

    public C25743ClD(BVF bvf, CU5 cu5, C24782CKb cKb) {
        this.A02 = cu5;
        this.A03 = cKb;
        this.A01 = bvf;
    }

    public void A00(int i, int i2, boolean z) {
        if (C26176Ctu.A03()) {
            CU5 cu5 = this.A02;
            RecyclerView recyclerView = cu5.A07;
            if (recyclerView == null) {
                cu5.A01 = i;
                cu5.A02 = i2;
                cu5.A0A = z;
            } else if (z) {
                recyclerView.A0l(i, i2);
            } else {
                recyclerView.scrollBy(i, i2);
            }
        } else {
            throw AnonymousClass8BR.A0w("Cannot doScrollBy off the main thread!");
        }
    }

    public void A01(int i, boolean z) {
        if (C26176Ctu.A03()) {
            CU5 cu5 = this.A02;
            RecyclerView recyclerView = cu5.A07;
            if (recyclerView == null) {
                cu5.A00 = i;
                cu5.A09 = z;
            } else if (z) {
                recyclerView.A0g(i);
            } else {
                recyclerView.A0f(i);
                BVF bvf = this.A01;
                DFL dfl = bvf.A00;
                E8A A0A = dfl.A0A(51);
                E8A A0A2 = dfl.A0A(97);
                if (A0A != null || A0A2 != null) {
                    BMG.A00(bvf.A02, dfl, i, false);
                }
            }
        } else {
            throw AnonymousClass8BR.A0w("Cannot doScrollTo off the main thread!");
        }
    }
}
