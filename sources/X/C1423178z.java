package X;

import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.78z  reason: invalid class name and case insensitive filesystem */
public final class C1423178z implements ViewTreeObserver.OnGlobalLayoutListener {
    public boolean A00;
    public final RecyclerView A01;
    public final C112715lv A02;

    public void onGlobalLayout() {
        if (this.A00) {
            this.A02.A05(this.A01);
            this.A00 = false;
        }
    }

    public C1423178z(RecyclerView recyclerView, C112715lv r2) {
        this.A01 = recyclerView;
        this.A02 = r2;
    }
}
