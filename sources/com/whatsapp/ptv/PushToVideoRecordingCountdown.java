package com.whatsapp.ptv;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass10E;
import X.AnonymousClass11C;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.C17890vO;
import X.C18000vb;
import X.C18030ve;
import X.C18070vi;
import X.C72473Md;
import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.whatsapp.WaTextView;

public final class PushToVideoRecordingCountdown extends FrameLayout implements AnonymousClass009 {
    public int A00;
    public long A01;
    public AnonymousClass11C A02;
    public C18000vb A03;
    public C18030ve A04;
    public AnonymousClass031 A05;
    public WaTextView A06;
    public boolean A07;
    public final Handler A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PushToVideoRecordingCountdown(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        A03();
        this.A08 = C17890vO.A0D();
        A00();
    }

    public final void setAbProps(C18030ve r2) {
        C18070vi.A0d(r2, 0);
        this.A04 = r2;
    }

    public final void setSystemServices(AnonymousClass11C r2) {
        C18070vi.A0d(r2, 0);
        this.A02 = r2;
    }

    public final void setWhatsAppLocale(C18000vb r2) {
        C18070vi.A0d(r2, 0);
        this.A03 = r2;
    }

    public static final void A02(PushToVideoRecordingCountdown pushToVideoRecordingCountdown, int i) {
        pushToVideoRecordingCountdown.A00 = i;
        WaTextView waTextView = pushToVideoRecordingCountdown.A06;
        if (waTextView == null) {
            C18070vi.A11("textView");
            throw null;
        }
        int i2 = 8;
        if (i > 0) {
            i2 = 0;
        }
        waTextView.setVisibility(i2);
        waTextView.setText(waTextView.getWhatsAppLocale().A0L().format((long) i));
    }

    public void A03() {
        if (!this.A07) {
            this.A07 = true;
            AnonymousClass10E A0O = AnonymousClass3MW.A0O(generatedComponent());
            this.A04 = AnonymousClass10E.A8r(A0O);
            this.A02 = AnonymousClass3Ma.A0a(A0O);
            this.A03 = AnonymousClass10E.A6Q(A0O);
        }
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A05;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A05 = r0;
        }
        return r0.generatedComponent();
    }

    public final C18030ve getAbProps() {
        C18030ve r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1A();
        throw null;
    }

    public final AnonymousClass11C getSystemServices() {
        AnonymousClass11C r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1N();
        throw null;
    }

    public final C18000vb getWhatsAppLocale() {
        C18000vb r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1M();
        throw null;
    }

    private final void A00() {
        WaTextView waTextView = new WaTextView(AnonymousClass3MY.A04(this));
        waTextView.setVisibility(8);
        waTextView.setTextColor(waTextView.getResources().getColor(C72473Md.A06(waTextView)));
        waTextView.setShadowLayer(25.0f, 0.0f, 10.0f, waTextView.getResources().getColor(2131102301));
        this.A06 = waTextView;
        A01();
        WaTextView waTextView2 = this.A06;
        if (waTextView2 == null) {
            C18070vi.A11("textView");
            throw null;
        }
        waTextView2.setTypeface(waTextView2.getTypeface(), 1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        waTextView2.setLayoutParams(layoutParams);
        addView(waTextView2);
    }

    private final void A01() {
        int min = (int) Math.min((double) getResources().getDimensionPixelSize(2131168390), (double) (getWidth() / 2));
        WaTextView waTextView = this.A06;
        if (waTextView == null) {
            C18070vi.A11("textView");
            throw null;
        } else {
            waTextView.setTextSize(0, (float) min);
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        A01();
    }

    public final void setDelayOnFinishingCountdown(long j) {
        this.A01 = j;
    }

    public PushToVideoRecordingCountdown(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A03();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PushToVideoRecordingCountdown(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        A03();
        this.A08 = C17890vO.A0D();
        A00();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PushToVideoRecordingCountdown(Context context) {
        super(context);
        C18070vi.A0d(context, 1);
        A03();
        this.A08 = C17890vO.A0D();
        A00();
    }
}
