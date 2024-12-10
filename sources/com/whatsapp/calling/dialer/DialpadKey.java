package com.whatsapp.calling.dialer;

import X.AnonymousClass1Y1;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4IY;
import X.C18070vi;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public final class DialpadKey extends LinearLayout {
    public TextView A00;
    public TextView A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialpadKey(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        if (attributeSet != null) {
            LinearLayout.LayoutParams A0D = AnonymousClass3Ma.A0D();
            A0D.gravity = 17;
            setLayoutParams(A0D);
            setGravity(17);
            setOrientation(1);
            View.inflate(context, 2131625088, this);
            this.A01 = AnonymousClass3Ma.A0E(this, 2131429994);
            this.A00 = AnonymousClass3Ma.A0E(this, 2131429993);
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AnonymousClass4IY.A05, 0, 0);
            C18070vi.A0X(obtainStyledAttributes);
            try {
                String string = obtainStyledAttributes.getString(0);
                String string2 = obtainStyledAttributes.getString(1);
                TextView textView = this.A01;
                if (textView == null) {
                    C18070vi.A11("numberTv");
                } else {
                    textView.setText(string);
                    TextView textView2 = this.A00;
                    if (textView2 == null) {
                        C18070vi.A11("lettersTv");
                    } else {
                        textView2.setText(string2);
                        return;
                    }
                }
                throw null;
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    public /* synthetic */ DialpadKey(Context context, AttributeSet attributeSet, int i, AnonymousClass1Y1 r5) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialpadKey(Context context) {
        super(context, (AttributeSet) null);
        C18070vi.A0d(context, 1);
    }
}
