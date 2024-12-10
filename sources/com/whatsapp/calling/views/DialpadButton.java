package com.whatsapp.calling.views;

import X.AnonymousClass3Ma;
import X.AnonymousClass4IY;
import X.C17880vN;
import X.C72453Mb;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DialpadButton extends LinearLayout {
    public DialpadButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: finally extract failed */
    public DialpadButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LinearLayout.LayoutParams A0D = AnonymousClass3Ma.A0D();
        A0D.gravity = 17;
        setLayoutParams(A0D);
        setGravity(17);
        setOrientation(1);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AnonymousClass4IY.A04, 0, i);
        try {
            String string = obtainStyledAttributes.getString(1);
            String string2 = obtainStyledAttributes.getString(0);
            boolean z = obtainStyledAttributes.getBoolean(2, false);
            obtainStyledAttributes.recycle();
            View.inflate(getContext(), 2131627501, this);
            C72453Mb.A1F(this, string, 2131429991);
            TextView A0E = C17880vN.A0E(this, 2131429990);
            if (z || !TextUtils.isEmpty(string2)) {
                A0E.setText(string2);
            } else {
                A0E.setVisibility(4);
            }
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public DialpadButton(Context context) {
        this(context, (AttributeSet) null);
    }
}
