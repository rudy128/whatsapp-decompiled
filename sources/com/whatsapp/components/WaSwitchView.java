package com.whatsapp.components;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass1HF;
import X.AnonymousClass3MW;
import X.C42491yG;
import X.C84144If;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import androidx.appcompat.widget.SwitchCompat;
import com.whatsapp.WaTextView;

public class WaSwitchView extends LinearLayout implements AnonymousClass009 {
    public AnonymousClass031 A00;
    public boolean A01;
    public final SwitchCompat A02;
    public final WaTextView A03;
    public final WaTextView A04;

    public WaSwitchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A00;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public void setChecked(boolean z) {
        this.A02.setChecked(z);
    }

    public void setDescription(CharSequence charSequence) {
        this.A03.setText(charSequence);
    }

    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.A02.setOnCheckedChangeListener(onCheckedChangeListener);
    }

    public void setSwitchClickable(boolean z) {
        this.A02.setClickable(z);
    }

    public void setTitle(CharSequence charSequence) {
        this.A04.setText(charSequence);
    }

    /* JADX INFO: finally extract failed */
    public WaSwitchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        int i3;
        int i4;
        int paddingLeft;
        int paddingTop;
        int paddingRight;
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        int i5 = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C84144If.A0Y, 0, 0);
            try {
                int resourceId = obtainStyledAttributes.getResourceId(2, 0);
                i3 = obtainStyledAttributes.getResourceId(0, 0);
                i2 = obtainStyledAttributes.getResourceId(3, 2132083422);
                i4 = obtainStyledAttributes.getResourceId(1, 0);
                obtainStyledAttributes.recycle();
                i5 = resourceId;
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            i4 = 0;
            i3 = 0;
            i2 = 0;
        }
        View.inflate(context, 2131627530, this);
        C42491yG.A02(this);
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(2131167078);
        if (getPaddingLeft() == 0) {
            paddingLeft = dimensionPixelOffset;
        } else {
            paddingLeft = getPaddingLeft();
        }
        if (getPaddingTop() == 0) {
            paddingTop = dimensionPixelOffset;
        } else {
            paddingTop = getPaddingTop();
        }
        if (getPaddingRight() == 0) {
            paddingRight = getResources().getDimensionPixelOffset(2131167079);
        } else {
            paddingRight = getPaddingRight();
        }
        setPadding(paddingLeft, paddingTop, paddingRight, getPaddingBottom() != 0 ? getPaddingBottom() : dimensionPixelOffset);
        setMinimumHeight(getResources().getDimensionPixelOffset(2131167080));
        WaTextView A0T = AnonymousClass3MW.A0T(this, 2131435964);
        this.A04 = A0T;
        if (i5 != 0) {
            A0T.setText(i5);
        }
        if (i2 != 0) {
            if (Build.VERSION.SDK_INT > 22) {
                A0T.setTextAppearance(i2);
            } else {
                A0T.setTextAppearance(context, i2);
            }
        }
        WaTextView A0T2 = AnonymousClass3MW.A0T(this, 2131435963);
        this.A03 = A0T2;
        if (i3 != 0) {
            A0T2.setText(i3);
        }
        if (i4 != 0) {
            if (Build.VERSION.SDK_INT > 22) {
                A0T2.setTextAppearance(i4);
            } else {
                A0T2.setTextAppearance(getContext(), i4);
            }
        }
        this.A02 = (SwitchCompat) AnonymousClass1HF.A06(this, 2131435965);
    }

    public WaSwitchView(Context context) {
        this(context, (AttributeSet) null);
    }
}
