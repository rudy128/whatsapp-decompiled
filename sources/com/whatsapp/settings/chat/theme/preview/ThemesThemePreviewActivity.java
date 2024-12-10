package com.whatsapp.settings.chat.theme.preview;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1DF;
import X.AnonymousClass1DS;
import X.AnonymousClass1FB;
import X.AnonymousClass1K1;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass47H;
import X.AnonymousClass47Q;
import X.AnonymousClass4VO;
import X.AnonymousClass5QO;
import X.AnonymousClass5UM;
import X.AnonymousClass5UO;
import X.AnonymousClass5UP;
import X.C17880vN;
import X.C18070vi;
import X.C18100vl;
import X.C72463Mc;
import X.C72473Md;
import X.C72483Me;
import X.C74393Zu;
import X.C80373x2;
import X.C87864Xj;
import X.C88434Zr;
import X.C89974dK;
import X.C91034f2;
import X.C91634g0;
import X.C91814gI;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.CheckBox;
import com.whatsapp.WaImageView;
import com.whatsapp.collections.MarginCorrectedViewPager;
import com.whatsapp.conversation.themes.viewModel.ChatThemeViewModel;
import com.whatsapp.settings.chat.theme.adapter.CirclePageIndicator;
import java.util.List;
import java.util.Set;

public final class ThemesThemePreviewActivity extends AnonymousClass47H {
    public CheckBox A00;
    public WaImageView A01;
    public MarginCorrectedViewPager A02;
    public AnonymousClass4VO A03;
    public CirclePageIndicator A04;
    public C87864Xj A05;
    public boolean A06;
    public View A07;
    public View A08;
    public View A09;
    public boolean A0A;
    public final Set A0B;
    public final C18100vl A0C;

    public ThemesThemePreviewActivity() {
        this(0);
        this.A0C = AnonymousClass1DF.A01(AnonymousClass5QO.A00);
        this.A0B = C17880vN.A14();
    }

    public void onRestoreInstanceState(Bundle bundle) {
        C18070vi.A0d(bundle, 0);
        super.onRestoreInstanceState(bundle);
        A4l().setCurrentItem(bundle.getInt("selected_index"));
    }

    public void onSaveInstanceState(Bundle bundle) {
        C18070vi.A0d(bundle, 0);
        super.onSaveInstanceState(bundle);
        if (A4l().getAdapter() != null) {
            bundle.putInt("selected_index", A4l().getCurrentItem());
        }
    }

    public static final void A03(C88434Zr r2, ThemesThemePreviewActivity themesThemePreviewActivity) {
        ContextThemeWrapper contextThemeWrapper;
        if (r2 instanceof C80373x2) {
            contextThemeWrapper = new ContextThemeWrapper(themesThemePreviewActivity, ((C80373x2) r2).A00);
        } else {
            contextThemeWrapper = themesThemePreviewActivity;
        }
        WaImageView waImageView = themesThemePreviewActivity.A01;
        if (waImageView == null) {
            C18070vi.A11("themeButton");
            throw null;
        } else {
            AnonymousClass3MX.A1B(contextThemeWrapper, waImageView, 2131232486);
        }
    }

    public void A2y() {
        if (!this.A0A) {
            this.A0A = true;
            AnonymousClass1K1 A0K = C72473Md.A0K(this);
            AnonymousClass10E r2 = A0K.AAQ;
            C72483Me.A0q(r2, this);
            AnonymousClass10G r1 = r2.A00;
            AnonymousClass1FB.A0K(r2, r1, this, r1.A45);
            AnonymousClass1FB.A0L(r2, r1, this, r1.A5A);
            AnonymousClass47Q.A0d(A0K, r2, this);
            this.A05 = (C87864Xj) r1.A1a.get();
        }
    }

    public final MarginCorrectedViewPager A4l() {
        MarginCorrectedViewPager marginCorrectedViewPager = this.A02;
        if (marginCorrectedViewPager != null) {
            return marginCorrectedViewPager;
        }
        C18070vi.A11("pager");
        throw null;
    }

    public static final void A0Q(ThemesThemePreviewActivity themesThemePreviewActivity, int i) {
        C74393Zu A0j = C72463Mc.A0j(themesThemePreviewActivity);
        if (A0j != null) {
            int A002 = C74393Zu.A00(A0j, i, i);
            List list = A0j.A0B;
            AnonymousClass4VO r1 = (AnonymousClass4VO) list.get(A002);
            if (themesThemePreviewActivity.A06 || !C18070vi.A18(r1.A01.A03, "DEFAULT")) {
                C88434Zr r0 = (C88434Zr) A0j.A01.get(i, (Object) null);
                if (r0 == null) {
                    r0 = ((AnonymousClass4VO) list.get(C74393Zu.A00(A0j, i, i))).A00;
                }
                A03(r0, themesThemePreviewActivity);
                CheckBox checkBox = themesThemePreviewActivity.A00;
                if (checkBox != null) {
                    checkBox.setVisibility(8);
                    WaImageView waImageView = themesThemePreviewActivity.A01;
                    if (waImageView != null) {
                        waImageView.setVisibility(0);
                        return;
                    }
                }
                C18070vi.A11("showDoodleCheckbox");
                throw null;
            }
            CheckBox checkBox2 = themesThemePreviewActivity.A00;
            if (checkBox2 != null) {
                checkBox2.setVisibility(0);
                WaImageView waImageView2 = themesThemePreviewActivity.A01;
                if (waImageView2 != null) {
                    waImageView2.setVisibility(8);
                    return;
                }
            }
            C18070vi.A11("showDoodleCheckbox");
            throw null;
            C18070vi.A11("themeButton");
            throw null;
        }
    }

    public void onCreate(Bundle bundle) {
        AnonymousClass1DS r3;
        String str;
        super.onCreate(bundle);
        this.A08 = AnonymousClass3MY.A0C(this, 2131429504);
        this.A07 = AnonymousClass3MY.A0C(this, 2131427815);
        this.A09 = AnonymousClass3MY.A0C(this, 2131436428);
        MarginCorrectedViewPager marginCorrectedViewPager = (MarginCorrectedViewPager) AnonymousClass3MY.A0C(this, 2131436980);
        C18070vi.A0d(marginCorrectedViewPager, 0);
        this.A02 = marginCorrectedViewPager;
        A4l().setSaveEnabled(false);
        A4l().setPageMargin(AnonymousClass3MW.A01(getResources(), 2131165870));
        CirclePageIndicator circlePageIndicator = (CirclePageIndicator) AnonymousClass3MY.A0C(this, 2131433404);
        this.A04 = circlePageIndicator;
        if (circlePageIndicator != null) {
            circlePageIndicator.A07 = true;
            MarginCorrectedViewPager A4l = A4l();
            CirclePageIndicator circlePageIndicator2 = this.A04;
            if (circlePageIndicator2 != null) {
                A4l.A0K(circlePageIndicator2);
                boolean booleanExtra = getIntent().getBooleanExtra("is_bubble_colors", false);
                this.A06 = booleanExtra;
                ChatThemeViewModel A4e = A4e();
                if (!booleanExtra) {
                    r3 = A4e.A08;
                } else {
                    r3 = A4e.A0A;
                }
                this.A00 = (CheckBox) AnonymousClass3MY.A0C(this, 2131429196);
                this.A01 = (WaImageView) AnonymousClass3MY.A0C(this, 2131436107);
                if (!this.A06) {
                    CheckBox checkBox = this.A00;
                    if (checkBox == null) {
                        str = "showDoodleCheckbox";
                        C18070vi.A11(str);
                        throw null;
                    }
                    checkBox.setChecked(true);
                }
                WaImageView waImageView = this.A01;
                if (waImageView == null) {
                    str = "themeButton";
                    C18070vi.A11(str);
                    throw null;
                }
                C89974dK.A00(waImageView, this, 23);
                A4l().A0K(new C91814gI(new AnonymousClass5UM(this), 0));
                C91634g0.A00(this, r3, new AnonymousClass5UO(this), 35);
                if (!this.A06) {
                    C91634g0.A00(this, A4e().A0A, new AnonymousClass5UP(this), 35);
                    return;
                }
                return;
            }
        }
        C18070vi.A11("pagerIndicator");
        throw null;
    }

    public ThemesThemePreviewActivity(int i) {
        this.A0A = false;
        C91034f2.A00(this, 31);
    }
}
