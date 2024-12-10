package com.whatsapp.conversation.conversationrow.components;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass10E;
import X.AnonymousClass1HF;
import X.AnonymousClass3MW;
import X.AnonymousClass3MZ;
import X.AnonymousClass4aX;
import X.C17960vV;
import X.C18030ve;
import X.C28931bI;
import X.C32861hs;
import X.C98254qp;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.whatsapp.WaImageView;

public class ViewOnceDownloadProgressView extends FrameLayout implements AnonymousClass009 {
    public C18030ve A00;
    public C32861hs A01;
    public AnonymousClass031 A02;
    public boolean A03;
    public final C28931bI A04;
    public final WaImageView A05;

    public ViewOnceDownloadProgressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void A00(int i, int i2, int i3) {
        WaImageView waImageView = this.A05;
        Drawable drawable = null;
        if (i2 != -1) {
            Drawable A0B = AnonymousClass3MZ.A0B(this, i2);
            C17960vV.A07(A0B);
            drawable = AnonymousClass4aX.A08(A0B, getResources().getColor(i3));
        }
        waImageView.setBackgroundDrawable(drawable);
        Drawable A0B2 = AnonymousClass3MZ.A0B(this, i);
        C17960vV.A07(A0B2);
        waImageView.setImageDrawable(AnonymousClass4aX.A08(A0B2, getResources().getColor(i3)));
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A02;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A02 = r0;
        }
        return r0.generatedComponent();
    }

    public ViewOnceDownloadProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A03) {
            this.A03 = true;
            AnonymousClass10E A0O = AnonymousClass3MW.A0O(generatedComponent());
            this.A00 = AnonymousClass10E.A8q(A0O);
            this.A01 = (C32861hs) A0O.Agw.get();
        }
        View.inflate(context, 2131627405, this);
        this.A05 = (WaImageView) AnonymousClass1HF.A06(this, 2131436794);
        C28931bI A002 = C28931bI.A00(this, 2131436805);
        this.A04 = A002;
        A002.A07(new C98254qp(this, 26));
    }

    public ViewOnceDownloadProgressView(Context context) {
        this(context, (AttributeSet) null);
    }
}
