package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* renamed from: X.04S  reason: invalid class name */
public class AnonymousClass04S extends Drawable {
    public final ActionBarContainer A00;

    public int getOpacity() {
        return 0;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.A00;
        if (actionBarContainer.A04) {
            Drawable drawable = actionBarContainer.A01;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.A00;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Drawable drawable3 = actionBarContainer.A02;
        if (drawable3 != null && actionBarContainer.A05) {
            drawable3.draw(canvas);
        }
    }

    public void getOutline(Outline outline) {
        Drawable drawable;
        ActionBarContainer actionBarContainer = this.A00;
        if (!actionBarContainer.A04) {
            drawable = actionBarContainer.A00;
            if (drawable == null) {
                return;
            }
        } else if (actionBarContainer.A01 != null) {
            drawable = actionBarContainer.A00;
        } else {
            return;
        }
        drawable.getOutline(outline);
    }

    public AnonymousClass04S(ActionBarContainer actionBarContainer) {
        this.A00 = actionBarContainer;
    }
}
