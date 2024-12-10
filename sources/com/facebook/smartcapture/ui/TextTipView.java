package com.facebook.smartcapture.ui;

import X.AnonymousClass1HF;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass6VZ;
import X.BVO;
import X.C17880vN;
import X.C18070vi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import java.util.Map;

public final class TextTipView extends FrameLayout {
    public BVO A00;
    public final ImageView A01 = AnonymousClass3MW.A0H(this, 2131431863);
    public final Map A02;
    public final ProgressBar A03;
    public final TextView A04 = C17880vN.A0E(this, 2131436464);
    public final TextView A05 = C17880vN.A0E(this, 2131436465);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextTipView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        View.inflate(context, 2131627184, this);
        AnonymousClass1HF.A0L(ColorStateList.valueOf(AnonymousClass6VZ.A00(AnonymousClass3MY.A04(this), 2130971021)), findViewById(2131434730));
        ProgressBar progressBar = (ProgressBar) findViewById(2131433723);
        this.A03 = progressBar;
        C18070vi.A0d(progressBar, 1);
        progressBar.getIndeterminateDrawable().setColorFilter(AnonymousClass6VZ.A00(context, 2130971018), PorterDuff.Mode.SRC_IN);
        this.A02 = C17880vN.A11();
    }
}
