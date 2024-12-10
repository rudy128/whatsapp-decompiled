package X;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.6ju  reason: invalid class name and case insensitive filesystem */
public final class C130726ju {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public final int A04;
    public final ViewTreeObserver.OnGlobalLayoutListener A05;
    public final GridLayoutManager A06;
    public final RecyclerView A07;
    public final C112185l4 A08;

    public C130726ju(Context context, ViewGroup viewGroup, RecyclerView recyclerView, C112185l4 r8) {
        int i;
        this.A07 = recyclerView;
        this.A08 = r8;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131168921);
        this.A04 = dimensionPixelSize;
        if (viewGroup != null) {
            i = viewGroup.getWidth();
        } else {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            AnonymousClass1L9.A00(context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            i = displayMetrics.widthPixels;
        }
        this.A03 = i;
        this.A05 = new AnonymousClass793(this, 16);
        int i2 = i / dimensionPixelSize;
        this.A00 = i2;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(context, i2 <= 0 ? 1 : i2);
        this.A06 = gridLayoutManager;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(gridLayoutManager);
        }
        C112645lo r0 = new C112645lo(this, 1);
        if (recyclerView != null) {
            recyclerView.A0r(r0);
            recyclerView.setItemAnimator((C37961qT) null);
        }
    }
}
