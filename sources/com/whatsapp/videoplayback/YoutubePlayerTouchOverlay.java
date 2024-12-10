package com.whatsapp.videoplayback;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass3MW;
import X.C18070vi;
import X.C24149BwF;
import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;

public final class YoutubePlayerTouchOverlay extends RelativeLayout implements AnonymousClass009 {
    public int A00;
    public AnonymousClass031 A01;
    public boolean A02;
    public C24149BwF A03;

    private final void A00() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -1);
        layoutParams.setMargins(0, 0, 0, 0);
        setLayoutParams(layoutParams);
        requestLayout();
    }

    public void onConfigurationChanged(Configuration configuration) {
        C18070vi.A0d(configuration, 0);
        super.onConfigurationChanged(configuration);
        if (configuration.orientation == 2) {
            setLayoutParams(new RelativeLayout.LayoutParams(-2, -1));
        } else {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.A00);
            layoutParams.addRule(13);
            setLayoutParams(layoutParams);
        }
        requestLayout();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C18070vi.A0d(motionEvent, 0);
        int action = motionEvent.getAction();
        View childAt = getChildAt(0);
        if (childAt == null) {
            return super.onTouchEvent(motionEvent);
        }
        if (action == 3) {
            motionEvent.setAction(1);
            childAt.onTouchEvent(motionEvent);
        } else if (action != 2) {
            childAt.onTouchEvent(motionEvent);
            C24149BwF bwF = this.A03;
            if (bwF != null) {
                bwF.A0E();
                return true;
            }
        }
        return true;
    }

    public final void setInlineVideoPlaybackControlView(C24149BwF bwF) {
        C18070vi.A0d(bwF, 0);
        this.A03 = bwF;
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A01;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public YoutubePlayerTouchOverlay(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
        this.A00 = 400;
        A00();
    }

    public final void setVideoHeight(int i) {
        this.A00 = i;
    }

    public YoutubePlayerTouchOverlay(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
    }

    public YoutubePlayerTouchOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
        this.A00 = 400;
        A00();
    }

    public YoutubePlayerTouchOverlay(Context context) {
        super(context);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
        this.A00 = 400;
        A00();
    }
}
