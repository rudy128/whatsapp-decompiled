package X;

import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;

public class DL3 implements C28664EDb {
    public final /* synthetic */ CollapsingToolbarLayout A00;

    public DL3(CollapsingToolbarLayout collapsingToolbarLayout) {
        this.A00 = collapsingToolbarLayout;
    }

    public void BzS(AppBarLayout appBarLayout, int i) {
        int i2;
        int height;
        CollapsingToolbarLayout collapsingToolbarLayout = this.A00;
        collapsingToolbarLayout.A00 = i;
        AnonymousClass1HO r0 = collapsingToolbarLayout.A09;
        if (r0 != null) {
            i2 = r0.A05();
        } else {
            i2 = 0;
        }
        int childCount = collapsingToolbarLayout.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = collapsingToolbarLayout.getChildAt(i3);
            BI7 bi7 = (BI7) childAt.getLayoutParams();
            C25070CWd A002 = CollapsingToolbarLayout.A00(childAt);
            int i4 = bi7.A01;
            if (i4 == 1) {
                int i5 = -i;
                height = ((collapsingToolbarLayout.getHeight() - CollapsingToolbarLayout.A00(childAt).A01) - childAt.getHeight()) - AnonymousClass3MW.A0B(childAt).bottomMargin;
                if (i5 < 0) {
                    height = 0;
                } else if (i5 <= height) {
                    height = i5;
                }
            } else if (i4 == 2) {
                height = BE6.A04((float) (-i), bi7.A00);
            }
            if (A002.A02 != height) {
                A002.A02 = height;
                A002.A00();
            }
        }
        collapsingToolbarLayout.A05();
        if (collapsingToolbarLayout.A05 != null && i2 > 0) {
            collapsingToolbarLayout.postInvalidateOnAnimation();
        }
        int height2 = collapsingToolbarLayout.getHeight();
        int minimumHeight = (height2 - collapsingToolbarLayout.getMinimumHeight()) - i2;
        C26249Cvn cvn = collapsingToolbarLayout.A0U;
        float f = (float) minimumHeight;
        float min = Math.min(1.0f, ((float) (height2 - collapsingToolbarLayout.getScrimVisibleHeightTrigger())) / f);
        cvn.A0N = min;
        cvn.A0O = min + ((1.0f - min) * 0.5f);
        cvn.A0S = collapsingToolbarLayout.A00 + minimumHeight;
        cvn.A07(((float) Math.abs(i)) / f);
    }
}
