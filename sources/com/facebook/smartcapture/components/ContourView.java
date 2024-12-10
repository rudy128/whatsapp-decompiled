package com.facebook.smartcapture.components;

import X.AnonymousClass3MW;
import X.AnonymousClass6VZ;
import X.C17880vN;
import X.C18070vi;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

public final class ContourView extends FrameLayout {
    public int A00;
    public int A01;
    public boolean A02;
    public final float A03;
    public final float A04;
    public final int A05;
    public final ImageView A06 = AnonymousClass3MW.A0H(this, 2131431857);
    public final ImageView A07 = AnonymousClass3MW.A0H(this, 2131431858);
    public final ImageView A08 = AnonymousClass3MW.A0H(this, 2131431859);
    public final ImageView A09 = AnonymousClass3MW.A0H(this, 2131431860);
    public final TextView A0A = C17880vN.A0E(this, 2131436463);
    public final DarkenedFrameView A0B = ((DarkenedFrameView) findViewById(2131429768));
    public final DottedAlignmentView A0C = ((DottedAlignmentView) findViewById(2131430153));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContourView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        View.inflate(getContext(), 2131624697, this);
        Resources resources = getResources();
        this.A03 = resources.getDimension(2131166144);
        this.A04 = resources.getDimension(2131166147);
        this.A05 = AnonymousClass6VZ.A00(context, 2130971043);
        this.A01 = 0;
        this.A00 = 0;
        setAlpha(0.0f);
        this.A02 = true;
    }

    public final void setTextTip(CharSequence charSequence) {
        this.A0A.setText(charSequence);
    }

    public final View getTextTip() {
        return this.A0A;
    }
}
