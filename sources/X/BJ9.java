package X;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import androidx.appcompat.widget.AppCompatSeekBar;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class BJ9 extends AppCompatSeekBar {
    public static final int A00(Context context, int i) {
        return C22339B3q.A01(((float) i) * (((float) C108965cb.A08(context).densityDpi) / 160.0f));
    }

    public final void A02(C24906COz cOz, int i) {
        List list;
        setSplitTrack(false);
        setThumb(getContext().getDrawable(2131232777));
        cOz.A00 = getThumb();
        getViewTreeObserver().addOnGlobalLayoutListener(new D5A(this, cOz, i));
        C24487C6e c6e = cOz.A02;
        if (!(c6e == null || (list = c6e.A04) == null)) {
            A03(list);
        }
        C24487C6e c6e2 = cOz.A02;
        if (c6e2 != null) {
            int i2 = c6e2.A01;
            if (Build.VERSION.SDK_INT >= 29) {
                Context A04 = AnonymousClass3MY.A04(this);
                Drawable thumb = getThumb();
                C18070vi.A0z(thumb, "null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
                A01(A04, (LayerDrawable) thumb, i2);
            }
        }
    }

    public final void A03(List list) {
        setBackground((Drawable) null);
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.LEFT_RIGHT;
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C17890vO.A1D(A13, Color.parseColor(C17890vO.A0Z(C17880vN.A0v(it), AnonymousClass000.A10(), '#')));
        }
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, C29431cG.A1B(A13));
        gradientDrawable.setCornerRadius(100.0f);
        setProgressDrawable(gradientDrawable);
        setThumbOffset(A00(AnonymousClass3MY.A04(this), 10));
    }

    private final void A01(Context context, LayerDrawable layerDrawable, int i) {
        if (layerDrawable.getNumberOfLayers() < 2) {
            C26294Cx6.A05("ParametricSlider", "Thumb drawable must have at least 2 layers, if the drawable has changed, please update this section that applies thumb border width to thumb drawable");
            return;
        }
        Drawable drawable = layerDrawable.getDrawable(0);
        C18070vi.A0z(drawable, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        Drawable drawable2 = layerDrawable.getDrawable(1);
        C18070vi.A0z(drawable2, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        ((GradientDrawable) drawable).setThickness(A00(context, i));
        ((GradientDrawable) drawable2).setThickness(C22339B3q.A01((((float) i) - 0.2f) * (((float) C108965cb.A08(context).densityDpi) / 160.0f)));
    }
}
