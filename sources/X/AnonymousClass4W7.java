package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.4W7  reason: invalid class name */
public abstract class AnonymousClass4W7 {
    public static final void A00(Drawable drawable, View view) {
        C18070vi.A0d(view, 0);
        if (view instanceof ImageButton) {
            ((ImageView) view).setImageDrawable(drawable);
        } else if (view instanceof WDSButton) {
            ((WDSButton) view).setIcon(drawable);
        }
    }

    public static final void A01(View view, int i) {
        C18070vi.A0d(view, 0);
        if (view instanceof ImageButton) {
            ((ImageView) view).setImageResource(i);
        } else if (view instanceof WDSButton) {
            ((WDSButton) view).setIcon(i);
        }
    }
}
