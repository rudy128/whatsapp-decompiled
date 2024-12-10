package X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* renamed from: X.BLr  reason: case insensitive filesystem */
public abstract class C22707BLr extends C38391rD {
    public int A00;
    public int A01;
    public RecyclerView A02;
    public List A03 = AnonymousClass000.A13();
    public final C24753CIq A04;

    public void A0T(RecyclerView recyclerView) {
        this.A02 = null;
    }

    public long A0M(int i) {
        return (long) ((DFE) this.A03.get(i)).A01.A04;
    }

    public int A0Q() {
        return this.A03.size();
    }

    public C22707BLr(C24753CIq cIq) {
        this.A04 = cIq;
        A0K(true);
    }

    public void A0S(RecyclerView recyclerView) {
        this.A02 = recyclerView;
    }
}
