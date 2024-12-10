package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* renamed from: X.06G  reason: invalid class name */
public class AnonymousClass06G extends AnonymousClass0N3 {
    public Drawable A00;
    public ColorStateList A01 = null;
    public PorterDuff.Mode A02 = null;
    public boolean A03 = false;
    public boolean A04 = false;
    public final SeekBar A05;

    public void A02(AttributeSet attributeSet, int i) {
        super.A02(attributeSet, i);
        SeekBar seekBar = this.A05;
        Context context = seekBar.getContext();
        int[] iArr = C002501d.A06;
        C002401c A002 = C002401c.A00(context, attributeSet, iArr, i, 0);
        Context context2 = seekBar.getContext();
        TypedArray typedArray = A002.A02;
        AnonymousClass1HF.A0K(context2, typedArray, attributeSet, seekBar, iArr, i);
        Drawable A042 = A002.A04(0);
        if (A042 != null) {
            seekBar.setThumb(A042);
        }
        A03(A002.A03(1));
        if (typedArray.hasValue(3)) {
            this.A02 = C005902p.A00(this.A02, typedArray.getInt(3, -1));
            this.A04 = true;
        }
        if (typedArray.hasValue(2)) {
            this.A01 = A002.A01(2);
            this.A03 = true;
        }
        typedArray.recycle();
        A00();
    }

    private void A00() {
        Drawable drawable = this.A00;
        if (drawable == null) {
            return;
        }
        if (this.A03 || this.A04) {
            Drawable A022 = C27831Xu.A02(drawable.mutate());
            this.A00 = A022;
            if (this.A03) {
                C27831Xu.A03(this.A01, A022);
            }
            if (this.A04) {
                C27831Xu.A07(this.A02, this.A00);
            }
            if (this.A00.isStateful()) {
                AnonymousClass000.A17(this.A00, this.A05);
            }
        }
    }

    public void A03(Drawable drawable) {
        Drawable drawable2 = this.A00;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.A00 = drawable;
        if (drawable != null) {
            SeekBar seekBar = this.A05;
            drawable.setCallback(seekBar);
            C27831Xu.A0G(seekBar.getLayoutDirection(), drawable);
            if (drawable.isStateful()) {
                AnonymousClass000.A17(drawable, seekBar);
            }
            A00();
        }
        this.A05.invalidate();
    }

    public AnonymousClass06G(SeekBar seekBar) {
        super(seekBar);
        this.A05 = seekBar;
    }
}
