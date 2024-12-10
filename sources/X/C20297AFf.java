package X;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.GridLayoutManager;

/* renamed from: X.AFf  reason: case insensitive filesystem */
public final /* synthetic */ class C20297AFf implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C174908xX A01;

    public final void onGlobalLayout() {
        C174908xX r0 = this.A01;
        View view = this.A00;
        C38251qy r2 = r0.A01;
        if (!r0.A05.A01()) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) r2;
            int A002 = C181189Pm.A00(view);
            if (A002 != gridLayoutManager.A00) {
                gridLayoutManager.A1g(A002);
            }
        }
    }

    public /* synthetic */ C20297AFf(View view, C174908xX r2) {
        this.A01 = r2;
        this.A00 = view;
    }
}
