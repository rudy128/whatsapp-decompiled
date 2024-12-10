package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/* renamed from: X.70r  reason: invalid class name and case insensitive filesystem */
public abstract class C1402770r {
    public static final void A00(Resources resources, TextView textView, TextView textView2) {
        C18070vi.A0d(resources, 0);
        if (textView != null) {
            C29261bv.A08(textView, 2132084412);
            AnonymousClass3MX.A1C(textView.getContext(), textView, 2131103383);
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = 0;
                marginLayoutParams.bottomMargin = 0;
                textView.setLayoutParams(marginLayoutParams);
            } else {
                throw AnonymousClass000.A0s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        if (textView2 != null) {
            C29261bv.A08(textView2, 2132084414);
            A02(textView2, false);
            ViewGroup.LayoutParams layoutParams2 = textView2.getLayoutParams();
            if (layoutParams2 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams2.topMargin = resources.getDimensionPixelSize(2131168779);
                marginLayoutParams2.bottomMargin = 0;
                textView2.setLayoutParams(marginLayoutParams2);
                return;
            }
            throw AnonymousClass000.A0s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    public static final void A02(TextView textView, boolean z) {
        C18070vi.A0d(textView, 0);
        Context context = textView.getContext();
        int i = 2131103225;
        if (z) {
            i = 2131103226;
        }
        AnonymousClass3MX.A1C(context, textView, i);
    }

    public static final void A01(ImageView imageView, int i, boolean z) {
        Context context = imageView.getContext();
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(2131169369);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(2131169365);
        int i2 = (dimensionPixelSize2 - dimensionPixelSize) / 2;
        if (i2 < 0) {
            i2 = 0;
        }
        int i3 = 2131103052;
        if (z) {
            i3 = 2131103383;
        }
        int A00 = C19740yt.A00(context, i3);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(i);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams != null) {
            C108955ca.A1I(imageView, dimensionPixelSize2, layoutParams);
            imageView.setPadding(i2, i2, i2, i2);
            imageView.setBackground(shapeDrawable);
            imageView.setColorFilter(A00);
            return;
        }
        throw AnonymousClass3MY.A0k();
    }
}
