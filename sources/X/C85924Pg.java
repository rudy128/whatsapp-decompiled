package X;

import android.content.res.Resources;
import android.view.ViewGroup;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;
import com.whatsapp.calling.header.ui.CallScreenHeaderView;

/* renamed from: X.4Pg  reason: invalid class name and case insensitive filesystem */
public final class C85924Pg {
    public Boolean A00;

    public final void A00(CallScreenHeaderView callScreenHeaderView, boolean z) {
        int i;
        int i2;
        Boolean valueOf = Boolean.valueOf(z);
        if (!C18070vi.A18(valueOf, this.A00)) {
            if (z) {
                i = callScreenHeaderView.getResources().getDimensionPixelSize(2131165654);
                i2 = C72463Mc.A06(callScreenHeaderView);
            } else {
                i = 0;
                i2 = 0;
            }
            Resources resources = callScreenHeaderView.getResources();
            int i3 = 2131169432;
            if (z) {
                i3 = 2131169452;
            }
            float A002 = AnonymousClass3MW.A00(resources, i3);
            Resources resources2 = callScreenHeaderView.getResources();
            int i4 = 2131169436;
            if (z) {
                i4 = 2131169432;
            }
            float A003 = AnonymousClass3MW.A00(resources2, i4);
            Resources resources3 = callScreenHeaderView.getResources();
            int i5 = 2131165623;
            if (z) {
                i5 = 2131165624;
            }
            int dimensionPixelSize = resources3.getDimensionPixelSize(i5);
            if (C72463Mc.A1Y(this.A00)) {
                C29051bX r2 = new C29051bX();
                r2.A03 = true;
                r2.A0W(250);
                C74343Zp r1 = new C74343Zp(i);
                r1.A0E(callScreenHeaderView.getTitleView$app_product_calling_calling());
                r2.A0a(r1);
                C74343Zp r12 = new C74343Zp(i2);
                r12.A0E(callScreenHeaderView.getSubtitleView$app_product_calling_calling());
                r2.A0a(r12);
                C74353Zq r13 = new C74353Zq(A002);
                r13.A0E(callScreenHeaderView.getTitleView$app_product_calling_calling());
                r2.A0a(r13);
                C74353Zq r14 = new C74353Zq(A003);
                r14.A0E(callScreenHeaderView.getSubtitleView$app_product_calling_calling());
                r2.A0a(r14);
                C74333Zo r15 = new C74333Zo(dimensionPixelSize);
                r15.A0E(callScreenHeaderView.getTitleView$app_product_calling_calling());
                r15.A0E(callScreenHeaderView.getSubtitleView$app_product_calling_calling());
                r2.A0a(r15);
                C29191bl.A02(callScreenHeaderView, r2);
            } else {
                TextEmojiLabel titleView$app_product_calling_calling = callScreenHeaderView.getTitleView$app_product_calling_calling();
                ViewGroup.LayoutParams layoutParams = titleView$app_product_calling_calling.getLayoutParams();
                if (layoutParams != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.topMargin = i;
                    marginLayoutParams.setMarginEnd(dimensionPixelSize);
                    marginLayoutParams.setMarginStart(dimensionPixelSize);
                    titleView$app_product_calling_calling.setLayoutParams(marginLayoutParams);
                    callScreenHeaderView.getTitleView$app_product_calling_calling().setTextSize(0, A002);
                    callScreenHeaderView.getSubtitleView$app_product_calling_calling().setTextSize(0, A003);
                    WaTextView subtitleView$app_product_calling_calling = callScreenHeaderView.getSubtitleView$app_product_calling_calling();
                    ViewGroup.LayoutParams layoutParams2 = subtitleView$app_product_calling_calling.getLayoutParams();
                    if (layoutParams2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                        marginLayoutParams2.topMargin = i2;
                        marginLayoutParams2.setMarginEnd(dimensionPixelSize);
                        marginLayoutParams2.setMarginStart(dimensionPixelSize);
                        subtitleView$app_product_calling_calling.setLayoutParams(marginLayoutParams2);
                    } else {
                        throw AnonymousClass000.A0s("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    }
                } else {
                    throw AnonymousClass000.A0s("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
            }
            this.A00 = valueOf;
        }
    }
}
