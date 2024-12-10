package com.whatsapp.pushtorecordmedia;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass033;
import X.AnonymousClass1DS;
import X.AnonymousClass1F9;
import X.AnonymousClass3C5;
import X.AnonymousClass3MW;
import X.AnonymousClass6Z1;
import X.AnonymousClass7AQ;
import X.AnonymousClass7RB;
import X.AnonymousClass8AG;
import X.C108975cc;
import X.C129196hP;
import X.C17880vN;
import X.C18000vb;
import X.C18070vi;
import X.C22851Dl;
import X.C41111vp;
import X.C72473Md;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.whatsapp.WaTextView;

public final class MediaTimeDisplay extends FrameLayout implements AnonymousClass009 {
    public int A00;
    public C18000vb A01;
    public AnonymousClass8AG A02;
    public AnonymousClass031 A03;
    public Runnable A04;
    public boolean A05;
    public WaTextView A06;
    public boolean A07;
    public final C22851Dl A08;
    public final C22851Dl A09;
    public final C129196hP A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaTimeDisplay(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        A02();
        this.A0A = new C129196hP(new AnonymousClass7RB((Object) this, 11));
        this.A00 = 1;
        this.A08 = new AnonymousClass7AQ(this, 29);
        this.A09 = new AnonymousClass7AQ(this, 30);
        A00(attributeSet);
    }

    public final void A03(AnonymousClass1F9 r5, AnonymousClass8AG r6) {
        C18070vi.A0d(r5, 0);
        Runnable runnable = this.A04;
        if (runnable != null) {
            runnable.run();
        }
        this.A02 = r6;
        AnonymousClass1DS BV3 = r6.BV3();
        BV3.A0A(r5, this.A09);
        C41111vp BTO = r6.BTO();
        BTO.A0A(r5, this.A08);
        this.A04 = new AnonymousClass3C5(this, BTO, BV3, 30);
    }

    public final void setWhatsAppLocale(C18000vb r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public static final void A01(MediaTimeDisplay mediaTimeDisplay) {
        int duration;
        if (mediaTimeDisplay.A02 == null || mediaTimeDisplay.getVisibility() != 0 || !mediaTimeDisplay.A05 || mediaTimeDisplay.A00 != 0) {
            C129196hP r2 = mediaTimeDisplay.A0A;
            if (r2.A00) {
                r2.A00 = false;
                r2.A01.removeCallbacks(r2.A03);
            }
        } else {
            C129196hP r22 = mediaTimeDisplay.A0A;
            if (!r22.A00) {
                r22.A00 = true;
                r22.A01.post(r22.A03);
            }
        }
        if (mediaTimeDisplay.getVisibility() == 0) {
            AnonymousClass8AG r1 = mediaTimeDisplay.A02;
            if (r1 == null) {
                duration = 0;
            } else if (mediaTimeDisplay.A00 == 0) {
                duration = r1.getCurrentPosition();
            } else {
                duration = r1.getDuration();
            }
            WaTextView waTextView = mediaTimeDisplay.A06;
            if (waTextView == null) {
                C18070vi.A11("textView");
                throw null;
            } else {
                C108975cc.A0y(waTextView, mediaTimeDisplay.getWhatsAppLocale(), (long) ((int) Math.floor((double) C17880vN.A04((long) duration))));
            }
        }
    }

    public void A02() {
        if (!this.A07) {
            this.A07 = true;
            this.A01 = C72473Md.A0S((AnonymousClass033) generatedComponent());
        }
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A03;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A03 = r0;
        }
        return r0.generatedComponent();
    }

    public final C18000vb getWhatsAppLocale() {
        C18000vb r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1M();
        throw null;
    }

    public final void setTextColor(int i) {
        WaTextView waTextView = this.A06;
        if (waTextView == null) {
            C18070vi.A11("textView");
            throw null;
        } else {
            waTextView.setTextColor(i);
        }
    }

    private final void A00(AttributeSet attributeSet) {
        boolean z;
        float f;
        Context context = getContext();
        int i = -1;
        float f2 = 12.5f;
        int i2 = 2;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass6Z1.A01);
            C18070vi.A0X(obtainStyledAttributes);
            int color = obtainStyledAttributes.getColor(2, -1);
            z = obtainStyledAttributes.getBoolean(0, true);
            f = obtainStyledAttributes.getFloat(1, -1.0f);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(3, -1);
            if (dimensionPixelSize != -1) {
                f2 = (float) dimensionPixelSize;
                i2 = 0;
            }
            obtainStyledAttributes.recycle();
            i = color;
        } else {
            z = true;
            f = -1.0f;
        }
        C18070vi.A0b(context);
        WaTextView waTextView = new WaTextView(context);
        waTextView.setLines(1);
        waTextView.setSingleLine(true);
        waTextView.setTextColor(i);
        waTextView.setTextSize(i2, f2);
        waTextView.setTypeface(waTextView.getTypeface(), z ? 1 : 0);
        if (f != -1.0f) {
            waTextView.setLetterSpacing(f);
        }
        addView(waTextView);
        this.A06 = waTextView;
        A01(this);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        A01(this);
    }

    public MediaTimeDisplay(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A02();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaTimeDisplay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        A02();
        this.A0A = new C129196hP(new AnonymousClass7RB((Object) this, 11));
        this.A00 = 1;
        this.A08 = new AnonymousClass7AQ(this, 29);
        this.A09 = new AnonymousClass7AQ(this, 30);
        A00(attributeSet);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaTimeDisplay(Context context) {
        super(context);
        C18070vi.A0d(context, 1);
        A02();
        this.A0A = new C129196hP(new AnonymousClass7RB((Object) this, 11));
        this.A00 = 1;
        this.A08 = new AnonymousClass7AQ(this, 29);
        this.A09 = new AnonymousClass7AQ(this, 30);
        A00((AttributeSet) null);
    }
}
