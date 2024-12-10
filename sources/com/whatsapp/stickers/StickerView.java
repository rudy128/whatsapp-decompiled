package com.whatsapp.stickers;

import X.AnonymousClass1DF;
import X.AnonymousClass7RQ;
import X.C109515dZ;
import X.C115035tE;
import X.C153927qJ;
import X.C17890vO;
import X.C17970vW;
import X.C18070vi;
import X.C18100vl;
import X.C22781De;
import X.C38631rd;
import X.C6Y;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.widget.ImageView;

public final class StickerView extends C115035tE {
    public int A00;
    public C6Y A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final Handler A05 = C17890vO.A0D();
    public final C18100vl A06 = AnonymousClass1DF.A01(new C153927qJ(this));

    public void invalidateDrawable(Drawable drawable) {
        C18070vi.A0d(drawable, 0);
        if (C22781De.A03()) {
            super.invalidateDrawable(drawable);
        } else {
            this.A05.post(new AnonymousClass7RQ(this, drawable, 26));
        }
    }

    private final C6Y getProxyAnimationCallback() {
        return (C6Y) this.A06.getValue();
    }

    private final void setRepeatCount(Drawable drawable) {
        int i;
        if (drawable instanceof C109515dZ) {
            C109515dZ r3 = (C109515dZ) drawable;
            r3.A03 = this.A02;
            int i2 = this.A00;
            if (!r3.A04) {
                r3.A01 = i2;
            } else if (r3.A01 < i2) {
                r3.A01 = i2;
                r3.A00 = 0;
            }
        } else if (drawable instanceof C38631rd) {
            C38631rd r32 = (C38631rd) drawable;
            if (this.A02) {
                i = -1;
            } else {
                i = this.A00;
            }
            r32.A0d.setRepeatCount(i);
        }
    }

    public final void A06() {
        Boolean bool = C17970vW.A03;
        if (!this.A04) {
            Drawable drawable = getDrawable();
            setRepeatCount(drawable);
            if (drawable instanceof C38631rd) {
                C38631rd r1 = (C38631rd) drawable;
                if (!r1.isRunning()) {
                    r1.A08();
                    return;
                }
            }
            if (drawable instanceof Animatable) {
                Animatable animatable = (Animatable) drawable;
                if (!animatable.isRunning()) {
                    animatable.start();
                }
            }
        }
    }

    public final void A07() {
        Boolean bool = C17970vW.A03;
        if (!this.A04) {
            Drawable drawable = getDrawable();
            setRepeatCount(drawable);
            if (drawable instanceof Animatable) {
                Animatable animatable = (Animatable) drawable;
                if (!animatable.isRunning()) {
                    animatable.start();
                }
            }
        }
    }

    public final void setDisabled(boolean z) {
        this.A04 = z;
        setClickable(z);
        setEnabled(!z);
    }

    public void setImageDrawable(Drawable drawable) {
        C109515dZ r4;
        setScaleType(ImageView.ScaleType.FIT_CENTER);
        Drawable drawable2 = getDrawable();
        if (drawable2 != drawable && (drawable2 instanceof C109515dZ)) {
            C109515dZ r2 = (C109515dZ) drawable2;
            C6Y proxyAnimationCallback = getProxyAnimationCallback();
            C18070vi.A0d(proxyAnimationCallback, 0);
            r2.A07.remove(proxyAnimationCallback);
            r2.stop();
        }
        super.setImageDrawable(drawable);
        if ((drawable instanceof C109515dZ) && (r4 = (C109515dZ) drawable) != null) {
            C6Y proxyAnimationCallback2 = getProxyAnimationCallback();
            C18070vi.A0d(proxyAnimationCallback2, 0);
            r4.A07.add(proxyAnimationCallback2);
        }
    }

    public StickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A05();
    }

    public final void A08() {
        Drawable drawable = getDrawable();
        if (drawable instanceof C38631rd) {
            C38631rd r2 = (C38631rd) drawable;
            if (r2.isRunning()) {
                r2.A0d.setRepeatCount(0);
                return;
            }
        }
        if (drawable instanceof Animatable) {
            Animatable animatable = (Animatable) drawable;
            if (animatable.isRunning()) {
                animatable.stop();
            }
        }
    }

    public final boolean getLoopIndefinitely() {
        return this.A02;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.A03 && this.A02) {
            A07();
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        A08();
    }

    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (i != 0) {
            A08();
        } else if (this.A03 && this.A02) {
            A07();
        }
    }

    public final void setAnimationCallback(C6Y c6y) {
        this.A01 = c6y;
    }

    public final void setLoopIndefinitely(boolean z) {
        this.A02 = z;
    }

    public final void setMaxLoops(int i) {
        this.A00 = i;
    }

    public final void setUserVisibleForIndefiniteLoop(boolean z) {
        this.A03 = z;
    }

    public static final void A00(Drawable drawable, StickerView stickerView) {
        super.invalidateDrawable(drawable);
    }

    public StickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public StickerView(Context context) {
        super(context);
        A05();
    }
}
