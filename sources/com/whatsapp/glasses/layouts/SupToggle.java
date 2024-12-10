package com.whatsapp.glasses.layouts;

import X.AnonymousClass1Y1;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.C18070vi;
import X.C19740yt;
import X.C72453Mb;
import X.C72473Md;
import android.animation.LayoutTransition;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.Map;

public final class SupToggle extends RelativeLayout {
    public int A00;
    public int A01;
    public int A02;
    public ImageView A03;
    public ImageView A04;
    public Map A05;
    public final int A06;
    public final int A07;
    public final View A08;
    public final View A09;
    public final View A0A;
    public final RelativeLayout A0B;
    public final TextView A0C;
    public final StatusIndicator A0D;
    public final View A0E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SupToggle(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        View inflate = LayoutInflater.from(context).inflate(2131627151, this);
        C18070vi.A0X(inflate);
        this.A0E = inflate;
        this.A0B = (RelativeLayout) C18070vi.A05(inflate, 2131435933);
        View A052 = C18070vi.A05(inflate, 2131435932);
        this.A09 = A052;
        this.A04 = (ImageView) C18070vi.A05(inflate, 2131435929);
        this.A03 = (ImageView) C18070vi.A05(inflate, 2131435928);
        StatusIndicator statusIndicator = (StatusIndicator) C18070vi.A05(inflate, 2131435930);
        this.A0D = statusIndicator;
        this.A08 = C18070vi.A05(inflate, 2131431153);
        this.A06 = C19740yt.A00(context, 2131102659);
        this.A01 = C19740yt.A00(context, 2131102661);
        this.A00 = C19740yt.A00(inflate.getContext(), 2131102655);
        View A053 = C18070vi.A05(inflate, 2131431463);
        this.A0A = A053;
        this.A0C = AnonymousClass3Ma.A0E(A053, 2131431465);
        this.A02 = getResources().getDimensionPixelSize(2131168984);
        this.A07 = getResources().getDimensionPixelSize(2131168983);
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.disableTransitionType(1);
        layoutTransition.setInterpolator(1, new AccelerateDecelerateInterpolator());
        layoutTransition.setDuration(150);
        layoutTransition.setAnimateParentHierarchy(false);
        setLayoutTransition(layoutTransition);
        Drawable background = A052.getBackground();
        C18070vi.A0z(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        this.A02 = background.getIntrinsicHeight();
        statusIndicator.setParentView(inflate);
    }

    public static final void setTrackHeight$lambda$2$lambda$1(SupToggle supToggle, ValueAnimator valueAnimator, ValueAnimator valueAnimator2) {
        C18070vi.A0d(supToggle, 0);
        View view = supToggle.A09;
        int A022 = C72473Md.A02(valueAnimator);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = A022;
        view.setLayoutParams(layoutParams);
    }

    public final void setSupCloseIcon(ImageView imageView) {
        C18070vi.A0d(imageView, 0);
        this.A03 = imageView;
    }

    public final void setSupIcon(ImageView imageView) {
        C18070vi.A0d(imageView, 0);
        this.A04 = imageView;
    }

    public final Map getImageBitmaps() {
        return this.A05;
    }

    public final ImageView getSupCloseIcon() {
        return this.A03;
    }

    public final ImageView getSupIcon() {
        return this.A04;
    }

    public final void setDoublePressPromptVisibility(boolean z) {
        this.A0D.setDoublePressPromptVisibility(z);
    }

    public final void setImageBitmaps(Map map) {
        this.A05 = map;
        this.A0D.A04 = map;
    }

    public final void setStatusIndicatorVisibility(boolean z) {
        this.A0D.setVisibility(C72453Mb.A07(z ? 1 : 0));
    }

    public final void setViewVisible(boolean z) {
        this.A0E.setVisibility(C72453Mb.A07(z ? 1 : 0));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SupToggle(Context context, AttributeSet attributeSet, int i, int i2, AnonymousClass1Y1 r7) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i2), (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SupToggle(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C18070vi.A0d(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SupToggle(Context context) {
        this(context, (AttributeSet) null, 0);
        C18070vi.A0d(context, 1);
    }
}
