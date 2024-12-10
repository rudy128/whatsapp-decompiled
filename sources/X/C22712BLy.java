package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.settings.chat.theme.adapter.ThemesWallpaperCategoryLayoutManager;

/* renamed from: X.BLy  reason: case insensitive filesystem */
public final class C22712BLy extends C40611uz {
    public int A00;
    public final int A01;
    public final int A02;
    public final ThemesWallpaperCategoryLayoutManager A03;

    public void A05(Rect rect, View view, C38021qZ r17, RecyclerView recyclerView) {
        int i;
        int i2;
        View view2 = view;
        boolean A17 = C18070vi.A17(rect, view2);
        C38021qZ r0 = r17;
        RecyclerView recyclerView2 = recyclerView;
        AnonymousClass3Ma.A1O(recyclerView2, 2, r0);
        int A002 = RecyclerView.A00(view2) - 2;
        if (A002 < 0) {
            super.A05(rect, view2, r0, recyclerView2);
            return;
        }
        ThemesWallpaperCategoryLayoutManager themesWallpaperCategoryLayoutManager = this.A03;
        int i3 = themesWallpaperCategoryLayoutManager.A00;
        int i4 = themesWallpaperCategoryLayoutManager.A01;
        int i5 = this.A01;
        int i6 = this.A02;
        int i7 = i6 * 2;
        int i8 = ((i4 - ((i5 + i6) * i3)) - i7) / 2;
        int i9 = A002 % i3;
        int i10 = A002 / i3;
        int layoutDirection = recyclerView2.getLayoutDirection();
        boolean z = true;
        boolean A1T = AnonymousClass000.A1T(layoutDirection, A17 ? 1 : 0);
        int i11 = i7 / i3;
        int i12 = i3 - 1;
        if (i9 != 0) {
            A17 = false;
        }
        if (i9 != i12) {
            z = false;
        }
        if (A17) {
            i = i8;
            i2 = 0;
        } else if (z) {
            i = 0;
            i2 = i8;
        } else {
            i = i6 / 2;
            i2 = i;
        }
        if (this.A00 == 2) {
            if (!A17) {
                i8 -= i11 * i9;
            }
            i = i8;
            i2 = 0;
        }
        int i13 = i;
        if (A1T) {
            i13 = i2;
            i2 = i;
        }
        if (i10 == 0) {
            i6 = 0;
        }
        rect.set(i13, i6, i2, 0);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("\n  ThemesWallpaperCategoryItemDecorator/getItemOffsets\n  Item: span count: ");
        A10.append(i3);
        A10.append(" statusPos:");
        A10.append(A002);
        BEB.A1N(A10, i13, i6, i2, i9);
        A10.append(i10);
        AnonymousClass1Y7.A01(AnonymousClass000.A0y("\n  ", A10));
    }

    public C22712BLy(ThemesWallpaperCategoryLayoutManager themesWallpaperCategoryLayoutManager, int i, int i2, int i3) {
        this.A03 = themesWallpaperCategoryLayoutManager;
        this.A02 = i;
        this.A01 = i2;
        this.A00 = i3;
    }
}
