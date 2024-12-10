package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.9d1  reason: invalid class name and case insensitive filesystem */
public class C185709d1 {
    public final RecyclerView A00;
    public final AnonymousClass8HQ A01 = new AnonymousClass8HQ();
    public final BAV A02;

    public C185709d1(RecyclerView recyclerView, BAV bav) {
        this.A00 = recyclerView;
        this.A02 = bav;
        RecyclerView recyclerView2 = this.A00;
        recyclerView2.setNestedScrollingEnabled(true);
        recyclerView2.setAdapter(this.A01);
    }
}
