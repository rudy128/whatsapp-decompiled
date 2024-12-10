package com.whatsapp.contact.picker;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass3MW;
import X.AnonymousClass86s;
import X.C108945cZ;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ScrollView;

public class SharedTextPreviewScrollView extends ScrollView implements AnonymousClass009 {
    public AnonymousClass86s A00;
    public AnonymousClass031 A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A01;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public SharedTextPreviewScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
    }

    public void fling(int i) {
        super.fling(i);
        this.A03 = true;
    }

    public AnonymousClass86s getOnEndScrollListener() {
        return this.A00;
    }

    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (!this.A03 && this.A04) {
            return;
        }
        if (((float) C108945cZ.A05(i2, i4)) < 1.0f || i2 >= getMeasuredHeight() || i2 == 0) {
            AnonymousClass86s r0 = this.A00;
            if (r0 != null) {
                r0.Bse();
            }
            this.A03 = false;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        AnonymousClass86s r0;
        if (motionEvent.getActionMasked() == 1) {
            this.A04 = false;
            if (!this.A03 && (r0 = this.A00) != null) {
                r0.Bse();
            }
        } else if (motionEvent.getActionMasked() == 2) {
            this.A04 = true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public boolean performClick() {
        super.performClick();
        return true;
    }

    public void setOnEndScrollListener(AnonymousClass86s r1) {
        this.A00 = r1;
    }

    public SharedTextPreviewScrollView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
    }

    public SharedTextPreviewScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
    }

    public SharedTextPreviewScrollView(Context context) {
        super(context);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
    }
}
