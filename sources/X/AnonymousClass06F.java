package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;

/* renamed from: X.06F  reason: invalid class name */
public class AnonymousClass06F extends AppCompatImageView implements C16540sb {
    public final /* synthetic */ AnonymousClass03I A00;

    public boolean BkC() {
        return false;
    }

    public boolean BkD() {
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass06F(Context context, AnonymousClass03I r4) {
        super(context, (AttributeSet) null, 2130968620);
        this.A00 = r4;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        AnonymousClass03N.A00(this, getContentDescription());
        setOnTouchListener(new AnonymousClass06M(this, this, r4, 0));
    }

    public boolean performClick() {
        if (!super.performClick()) {
            playSoundEffect(0);
            this.A00.A0L();
        }
        return true;
    }

    public boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (!(drawable == null || background == null)) {
            int width = getWidth();
            int height = getHeight();
            int max = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            C27831Xu.A0E(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
        }
        return frame;
    }
}
