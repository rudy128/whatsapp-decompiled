package com.whatsapp.settings.chat.theme.preview;

import X.A34;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1DF;
import X.AnonymousClass1FB;
import X.AnonymousClass1K1;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass478;
import X.AnonymousClass47H;
import X.AnonymousClass47Q;
import X.AnonymousClass4QK;
import X.AnonymousClass5QM;
import X.AnonymousClass5UJ;
import X.AnonymousClass5VV;
import X.C17880vN;
import X.C17960vV;
import X.C18070vi;
import X.C18100vl;
import X.C18460wS;
import X.C72453Mb;
import X.C72473Md;
import X.C72483Me;
import X.C87864Xj;
import X.C89974dK;
import X.C91034f2;
import X.C91634g0;
import X.C91814gI;
import android.os.Bundle;
import android.view.MenuItem;
import com.whatsapp.WaImageView;
import com.whatsapp.collections.MarginCorrectedViewPager;
import com.whatsapp.settings.chat.theme.adapter.CirclePageIndicator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public final class ThemesDownloadablePreviewActivity extends AnonymousClass47H {
    public WaImageView A00;
    public MarginCorrectedViewPager A01;
    public CirclePageIndicator A02;
    public AnonymousClass478 A03;
    public C87864Xj A04;
    public List A05;
    public boolean A06;
    public final AnonymousClass4QK A07;
    public final Set A08;
    public final C18100vl A09;

    public ThemesDownloadablePreviewActivity() {
        this(0);
        this.A08 = C17880vN.A12();
        this.A07 = new AnonymousClass4QK(this);
        this.A09 = AnonymousClass1DF.A01(AnonymousClass5QM.A00);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (AnonymousClass3MY.A01(menuItem, 0) != 16908332) {
            return false;
        }
        C72453Mb.A13(this);
        return true;
    }

    public void A2y() {
        if (!this.A06) {
            this.A06 = true;
            AnonymousClass1K1 A0K = C72473Md.A0K(this);
            AnonymousClass10E r2 = A0K.AAQ;
            C72483Me.A0q(r2, this);
            AnonymousClass10G r1 = r2.A00;
            AnonymousClass1FB.A0K(r2, r1, this, r1.A45);
            AnonymousClass1FB.A0L(r2, r1, this, r1.A5A);
            AnonymousClass47Q.A0d(A0K, r2, this);
            this.A04 = (C87864Xj) r1.A1a.get();
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

    public void onDestroy() {
        Collection<A34> values;
        AnonymousClass478 r0 = this.A03;
        if (!(r0 == null || (values = r0.A09.values()) == null)) {
            for (A34 A0B : values) {
                A0B.A0B(true);
            }
        }
        super.onDestroy();
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Object, X.4rD] */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass3MY.A0C(this, 2131429504).setBackgroundColor(AnonymousClass3Ma.A00(this, 2130970830, 2131102245));
        ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("THUMBNAIL_URIS_KEY");
        C17960vV.A07(parcelableArrayListExtra);
        C18070vi.A0X(parcelableArrayListExtra);
        this.A05 = parcelableArrayListExtra;
        List integerArrayListExtra = getIntent().getIntegerArrayListExtra("WHATSAPP_THUMBNAIL_RES_KEY");
        if (integerArrayListExtra == null) {
            integerArrayListExtra = C18460wS.A00;
        }
        MarginCorrectedViewPager marginCorrectedViewPager = (MarginCorrectedViewPager) AnonymousClass3MY.A0C(this, 2131436980);
        C18070vi.A0d(marginCorrectedViewPager, 0);
        this.A01 = marginCorrectedViewPager;
        A4l().setPageMargin(getResources().getDimensionPixelOffset(2131166582));
        CirclePageIndicator circlePageIndicator = (CirclePageIndicator) AnonymousClass3MY.A0C(this, 2131433404);
        this.A02 = circlePageIndicator;
        if (circlePageIndicator != null) {
            circlePageIndicator.A07 = true;
            MarginCorrectedViewPager A4l = A4l();
            CirclePageIndicator circlePageIndicator2 = this.A02;
            if (circlePageIndicator2 != null) {
                A4l.A0K(circlePageIndicator2);
                ? obj = new Object();
                obj.element = getIntent().getIntExtra("STARTING_POSITION_KEY", 0);
                WaImageView waImageView = (WaImageView) AnonymousClass3MY.A0C(this, 2131436107);
                this.A00 = waImageView;
                if (waImageView != null) {
                    waImageView.setVisibility(0);
                    A4l().A0K(new C91814gI(new AnonymousClass5UJ(this), 0));
                    C91634g0.A00(this, A4e().A0A, new AnonymousClass5VV(this, integerArrayListExtra, obj), 33);
                    WaImageView waImageView2 = this.A00;
                    if (waImageView2 != null) {
                        C89974dK.A00(waImageView2, this, 21);
                        return;
                    }
                }
                C18070vi.A11("themeButton");
                throw null;
            }
        }
        C18070vi.A11("pagerIndicator");
        throw null;
    }

    public void onBackPressed() {
        C72453Mb.A13(this);
    }

    public ThemesDownloadablePreviewActivity(int i) {
        this.A06 = false;
        C91034f2.A00(this, 28);
    }
}
