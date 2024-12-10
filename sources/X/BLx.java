package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public final class BLx extends C40611uz {
    public final int A00;
    public final int A01;
    public final int A02;

    public void A05(Rect rect, View view, C38021qZ r17, RecyclerView recyclerView) {
        C112365lM r2;
        int i;
        int i2;
        int i3;
        int i4;
        GridLayoutManager gridLayoutManager;
        View view2 = view;
        boolean A17 = C18070vi.A17(rect, view2);
        RecyclerView recyclerView2 = recyclerView;
        C18070vi.A0d(recyclerView2, 2);
        C38391rD r22 = recyclerView2.A0B;
        if (r22 instanceof C112365lM) {
            r2 = (C112365lM) r22;
        } else {
            r2 = null;
        }
        int A002 = RecyclerView.A00(view2);
        if (r2 != null) {
            switch (r2.getItemViewType(A002)) {
                case 42:
                case 43:
                case 44:
                    boolean z = true;
                    int i5 = r2.A00;
                    Integer valueOf = Integer.valueOf(i5);
                    if (i5 <= -1 || valueOf == null) {
                        i5 = 1;
                    }
                    int i6 = A002 - i5;
                    C38251qy layoutManager = recyclerView2.getLayoutManager();
                    if (!(layoutManager instanceof GridLayoutManager) || (gridLayoutManager = (GridLayoutManager) layoutManager) == null) {
                        i = 1;
                    } else {
                        i = gridLayoutManager.A00;
                    }
                    int i7 = i6 % i;
                    int i8 = i6 / i;
                    boolean A1T = AnonymousClass000.A1T(recyclerView2.getLayoutDirection(), A17 ? 1 : 0);
                    int i9 = this.A02;
                    int i10 = i9 / 2;
                    int i11 = i - A17;
                    if (i7 != 0) {
                        A17 = false;
                    }
                    if (i7 != i11) {
                        z = false;
                    }
                    if (A17) {
                        i2 = this.A00;
                        i3 = 0;
                    } else if (z) {
                        i2 = 0;
                        i3 = this.A00;
                    } else {
                        i2 = i9;
                        i3 = i9;
                    }
                    if (this.A01 == 2) {
                        i4 = this.A00;
                        if (!A17) {
                            i4 -= i10 * i7;
                        }
                        i3 = 0;
                    }
                    int i12 = i3;
                    if (!A1T) {
                        i12 = i4;
                        i4 = i3;
                    }
                    if (i8 == 0) {
                        i9 = 0;
                    }
                    rect.set(i12, i9, i4, 0);
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("\n  VerticalGridSpacingItemDecorator/getItemOffsets\n  Item: ");
                    A10.append(A002);
                    A10.append(" statusPos:");
                    A10.append(i6);
                    BEB.A1N(A10, i12, i9, i4, i7);
                    A10.append(i8);
                    AnonymousClass1Y7.A01(AnonymousClass000.A0y("\n  ", A10));
                    return;
                default:
                    return;
            }
        }
    }

    public BLx(int i, int i2, int i3) {
        this.A02 = i;
        this.A00 = i2;
        this.A01 = i3;
    }
}
