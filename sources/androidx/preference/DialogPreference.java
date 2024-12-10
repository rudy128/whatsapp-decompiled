package androidx.preference;

import X.AnonymousClass8BW;
import X.AnonymousClass9UH;
import X.C63882tq;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

public abstract class DialogPreference extends Preference {
    public int A00;
    public Drawable A01;
    public CharSequence A02;
    public CharSequence A03;
    public CharSequence A04;
    public CharSequence A05;

    public DialogPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass9UH.A02, i, i2);
        String A0b = AnonymousClass8BW.A0b(obtainStyledAttributes, 9, 0);
        this.A03 = A0b;
        if (A0b == null) {
            this.A03 = this.A0F;
        }
        this.A02 = AnonymousClass8BW.A0b(obtainStyledAttributes, 8, 1);
        Drawable drawable = obtainStyledAttributes.getDrawable(6);
        this.A01 = drawable == null ? obtainStyledAttributes.getDrawable(2) : drawable;
        this.A05 = AnonymousClass8BW.A0b(obtainStyledAttributes, 11, 3);
        this.A04 = AnonymousClass8BW.A0b(obtainStyledAttributes, 10, 4);
        this.A00 = obtainStyledAttributes.getResourceId(7, obtainStyledAttributes.getResourceId(5, 0));
        obtainStyledAttributes.recycle();
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C63882tq.A01(context, 2130969360, 16842897));
    }

    public DialogPreference(Context context) {
        this(context, (AttributeSet) null);
    }
}
