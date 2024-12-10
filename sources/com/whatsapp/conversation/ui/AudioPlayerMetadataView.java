package com.whatsapp.conversation.ui;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass033;
import X.AnonymousClass1HF;
import X.AnonymousClass3MW;
import X.AnonymousClass4IO;
import X.C18000vb;
import X.C27641Ww;
import X.C72473Md;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class AudioPlayerMetadataView extends LinearLayout implements AnonymousClass009 {
    public C18000vb A00;
    public AnonymousClass031 A01;
    public TextView A02;
    public boolean A03;

    public void A01() {
        if (!this.A03) {
            this.A03 = true;
            this.A00 = C72473Md.A0S((AnonymousClass033) generatedComponent());
        }
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A01;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public void setDescription(String str) {
        this.A02.setText(str);
    }

    public AudioPlayerMetadataView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01();
        A00(context, attributeSet);
    }

    private void A00(Context context, AttributeSet attributeSet) {
        ViewGroup viewGroup;
        View.inflate(context, 2131626023, this);
        setOrientation(0);
        setGravity(17);
        View A06 = AnonymousClass1HF.A06(this, 2131429812);
        View A062 = AnonymousClass1HF.A06(this, 2131435610);
        this.A02 = AnonymousClass3MW.A0J(this, 2131429927);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass4IO.A00);
            boolean z = obtainStyledAttributes.getBoolean(2, true);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            obtainStyledAttributes.recycle();
            C27641Ww.A05(A06, this.A00, A06.getPaddingLeft(), dimensionPixelSize2);
            C27641Ww.A03(A06, dimensionPixelSize, AnonymousClass3MW.A0B(A06).rightMargin);
            if (!z && (viewGroup = (ViewGroup) A062.getParent()) != null) {
                viewGroup.removeView(A062);
            }
        }
    }

    public AudioPlayerMetadataView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        A01();
    }

    public AudioPlayerMetadataView(Context context) {
        super(context);
        A01();
        A00(context, (AttributeSet) null);
    }
}
