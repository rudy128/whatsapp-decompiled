package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.viewpager.widget.ViewPager;

/* renamed from: X.1XQ  reason: invalid class name */
public abstract class AnonymousClass1XQ extends ViewPager {
    public boolean A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1XQ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
    }

    public void A0G(int i) {
        int max;
        if (this.A00 && (max = Math.max(getCurrentItem(), i)) > this.A07) {
            setOffscreenPageLimit(max);
        }
        super.A0G(i);
    }

    public final boolean getPersistingEnabled() {
        return this.A00;
    }

    public final void setPersistingEnabled(boolean z) {
        this.A00 = z;
    }
}
