package com.whatsapp.settings.chat.theme.preview;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1DF;
import X.AnonymousClass1FB;
import X.AnonymousClass1K1;
import X.AnonymousClass1b8;
import X.AnonymousClass3MY;
import X.AnonymousClass47H;
import X.AnonymousClass47Q;
import X.AnonymousClass5UL;
import X.C103715Lj;
import X.C18070vi;
import X.C18100vl;
import X.C72463Mc;
import X.C72473Md;
import X.C72483Me;
import X.C91034f2;
import X.C91814gI;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.CheckBox;
import com.whatsapp.collections.MarginCorrectedViewPager;
import com.whatsapp.settings.chat.theme.adapter.CirclePageIndicator;
import com.whatsapp.settings.chat.wallpaper.SolidColorWallpaper;

public final class ThemesSolidColorWallpaperPreview extends AnonymousClass47H {
    public CheckBox A00;
    public MarginCorrectedViewPager A01;
    public CirclePageIndicator A02;
    public int[] A03;
    public int[] A04;
    public View A05;
    public View A06;
    public View A07;
    public boolean A08;
    public final C18100vl A09;

    public ThemesSolidColorWallpaperPreview() {
        this(0);
        this.A09 = AnonymousClass1DF.A01(new C103715Lj(this));
    }

    public void onRestoreInstanceState(Bundle bundle) {
        C18070vi.A0d(bundle, 0);
        super.onRestoreInstanceState(bundle);
        A03(bundle.getInt("selected_index"));
    }

    public void onSaveInstanceState(Bundle bundle) {
        C18070vi.A0d(bundle, 0);
        super.onSaveInstanceState(bundle);
        int[] iArr = this.A04;
        if (iArr == null) {
            C18070vi.A11("values");
            throw null;
        } else {
            bundle.putInt("selected_index", iArr[A4l().getCurrentItem()]);
        }
    }

    public void A2y() {
        if (!this.A08) {
            this.A08 = true;
            AnonymousClass1K1 A0K = C72473Md.A0K(this);
            AnonymousClass10E r2 = A0K.AAQ;
            C72483Me.A0q(r2, this);
            AnonymousClass10G r1 = r2.A00;
            AnonymousClass1FB.A0K(r2, r1, this, r1.A45);
            AnonymousClass1FB.A0L(r2, r1, this, r1.A5A);
            AnonymousClass47Q.A0d(A0K, r2, this);
        }
    }

    public final MarginCorrectedViewPager A4l() {
        MarginCorrectedViewPager marginCorrectedViewPager = this.A01;
        if (marginCorrectedViewPager != null) {
            return marginCorrectedViewPager;
        }
        C18070vi.A11("pager");
        throw null;
    }

    private final void A03(int i) {
        int[] intArray = A4c().getResources().getIntArray(2130903072);
        C18070vi.A0X(intArray);
        int i2 = intArray[i];
        int[] iArr = this.A03;
        String str = "colors";
        if (iArr != null) {
            int length = iArr.length;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    break;
                } else if (iArr[i4] == i2) {
                    i3 = i4;
                    break;
                } else {
                    i4++;
                }
            }
            A4l().setCurrentItem(i3);
            CirclePageIndicator circlePageIndicator = this.A02;
            if (circlePageIndicator == null) {
                str = "pagerIndicator";
            } else {
                int length2 = intArray.length;
                circlePageIndicator.setCurrentPage(i3);
                circlePageIndicator.setPageCount(length2);
                circlePageIndicator.requestLayout();
                return;
            }
        }
        C18070vi.A11(str);
        throw null;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A06 = AnonymousClass3MY.A0C(this, 2131429504);
        this.A05 = AnonymousClass3MY.A0C(this, 2131427815);
        this.A07 = AnonymousClass3MY.A0C(this, 2131436428);
        Pair A032 = SolidColorWallpaper.A03(A4c());
        Object obj = A032.first;
        C18070vi.A0W(obj);
        this.A03 = (int[]) obj;
        Object obj2 = A032.second;
        C18070vi.A0W(obj2);
        this.A04 = (int[]) obj2;
        MarginCorrectedViewPager marginCorrectedViewPager = (MarginCorrectedViewPager) AnonymousClass3MY.A0C(this, 2131436980);
        C18070vi.A0d(marginCorrectedViewPager, 0);
        this.A01 = marginCorrectedViewPager;
        CirclePageIndicator circlePageIndicator = (CirclePageIndicator) AnonymousClass3MY.A0C(this, 2131433404);
        this.A02 = circlePageIndicator;
        if (circlePageIndicator != null) {
            circlePageIndicator.A07 = true;
            circlePageIndicator.setVisibility(0);
            MarginCorrectedViewPager A4l = A4l();
            CirclePageIndicator circlePageIndicator2 = this.A02;
            if (circlePageIndicator2 != null) {
                A4l.A0K(circlePageIndicator2);
                A4l().setSaveEnabled(false);
                A4l().setAdapter((AnonymousClass1b8) this.A09.getValue());
                A4d().setValue(100.0f);
                A4h(0.0f);
                A4g();
                A4l().setPageMargin((int) (C72463Mc.A00(this) * 15.0f));
                int intExtra = getIntent().getIntExtra("scw_preview_color", 0);
                A4l().A0K(new C91814gI(new AnonymousClass5UL(this), 0));
                A03(intExtra);
                return;
            }
        }
        C18070vi.A11("pagerIndicator");
        throw null;
    }

    public ThemesSolidColorWallpaperPreview(int i) {
        this.A08 = false;
        C91034f2.A00(this, 30);
    }
}
