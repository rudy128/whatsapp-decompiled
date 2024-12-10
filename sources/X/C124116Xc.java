package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;

/* renamed from: X.6Xc  reason: invalid class name and case insensitive filesystem */
public abstract class C124116Xc {
    public static final LayerDrawable A00(Context context, int i) {
        C18070vi.A0d(context, 0);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131168877);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.setIntrinsicHeight(dimensionPixelSize);
        shapeDrawable.setIntrinsicWidth(dimensionPixelSize);
        shapeDrawable.getPaint().setColor(i);
        Drawable A00 = C24261Jm.A00(context, 2131233310);
        int A01 = C62762rw.A01(context, 14.0f);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable, A00});
        layerDrawable.setLayerInset(1, A01, A01, A01, A01);
        return layerDrawable;
    }
}
