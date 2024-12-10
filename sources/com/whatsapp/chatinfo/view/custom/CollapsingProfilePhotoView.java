package com.whatsapp.chatinfo.view.custom;

import X.AnonymousClass000;
import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass033;
import X.AnonymousClass1HF;
import X.AnonymousClass1Y5;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.C17880vN;
import X.C18000vb;
import X.C72453Mb;
import X.C72463Mc;
import X.C72473Md;
import X.C72483Me;
import X.C90584eJ;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.whatsapp.wds.components.profilephoto.WDSProfilePhoto;

public class CollapsingProfilePhotoView extends FrameLayout implements AnonymousClass009 {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public ImageView A07;
    public C18000vb A08;
    public WDSProfilePhoto A09;
    public AnonymousClass031 A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public final int A0E;

    public void A02(int i, int i2) {
        if (i != -1 && i2 != -1) {
            this.A06 = i;
            this.A01 = i2;
            if (this.A02 != 0) {
                int i3 = (i - i2) / 2;
                if (!AnonymousClass3MY.A1b(this.A08)) {
                    i = (this.A02 - i2) - ((int) this.A00);
                }
                this.A04 = i - i3;
            }
        }
    }

    public void A01() {
        if (!this.A0D) {
            this.A0D = true;
            this.A08 = C72473Md.A0S((AnonymousClass033) generatedComponent());
        }
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A0A;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A0A = r0;
        }
        return r0.generatedComponent();
    }

    public WDSProfilePhoto getProfileImage() {
        return this.A09;
    }

    public void setAnimationValue(float f) {
        float f2;
        float f3;
        if (!this.A0B) {
            this.A0B = AnonymousClass000.A1R((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1)));
        }
        boolean A1b = AnonymousClass3MY.A1b(this.A08);
        int i = this.A04;
        if (i != -1) {
            float f4 = this.A00;
            if (f4 != -1.0f) {
                float width = 1.0f - ((1.0f - (f4 / ((float) this.A09.getWidth()))) * f);
                float width2 = (((float) this.A09.getWidth()) - this.A00) / 2.0f;
                if (A1b) {
                    f2 = -(((float) (this.A05 - this.A04)) + width2);
                } else {
                    f2 = ((float) (this.A04 - this.A05)) - width2;
                }
                this.A09.setTranslationX(f2 * f);
                this.A09.setScaleX(width);
                this.A09.setScaleY(width);
                int width3 = this.A07.getWidth();
                if (this.A0C && width3 > 0) {
                    float f5 = this.A00;
                    float f6 = (float) width3;
                    float f7 = 1.0f - ((1.0f - (f5 / f6)) * f);
                    float f8 = (f6 - f5) / 2.0f;
                    if (A1b) {
                        f3 = -(((float) (this.A03 - this.A04)) + f8);
                    } else {
                        f3 = ((float) (this.A04 - this.A03)) - f8;
                    }
                    this.A07.setTranslationX(f3 * f);
                    this.A07.setScaleX(f7);
                    this.A07.setScaleY(f7);
                    return;
                }
                return;
            }
        }
        Object[] A1b2 = AnonymousClass3MW.A1b();
        C17880vN.A1T(A1b2, i, 0);
        A1b2[1] = Float.valueOf(this.A00);
        String.format("Required values not set: profilePhotoCollapsedX = %s , targetDimen = %s", A1b2);
    }

    public void setHaloEnabled(boolean z) {
        if (this.A0C != z) {
            this.A0C = z;
            this.A07.setVisibility(C72453Mb.A07(z ? 1 : 0));
        }
    }

    public CollapsingProfilePhotoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01();
        boolean A1B = C72483Me.A1B(this);
        this.A0E = C72463Mc.A06(this);
        this.A06 = -1;
        this.A01 = -1;
        this.A0B = A1B;
        A00(context);
    }

    private void A00(Context context) {
        View.inflate(context, 2131624553, this);
        this.A09 = (WDSProfilePhoto) AnonymousClass1HF.A06(this, 2131437028);
        this.A07 = AnonymousClass3MW.A0G(this, 2131434162);
        C90584eJ.A00(this.A09.getViewTreeObserver(), this, 11);
        AnonymousClass1Y5.A02(this.A09, 2131886435);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!this.A0B) {
            int left = this.A09.getLeft();
            this.A05 = left;
            this.A03 = left;
        }
    }

    public void setCollapsedProfilePhotoDimen(float f) {
        this.A00 = f;
    }

    public CollapsingProfilePhotoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01();
        boolean A1B = C72483Me.A1B(this);
        this.A0E = C72463Mc.A06(this);
        this.A06 = -1;
        this.A01 = -1;
        this.A0B = A1B;
        A00(context);
    }

    public CollapsingProfilePhotoView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A01();
    }

    public CollapsingProfilePhotoView(Context context) {
        super(context);
        A01();
        boolean A1B = C72483Me.A1B(this);
        this.A0E = C72463Mc.A06(this);
        this.A06 = -1;
        this.A01 = -1;
        this.A0B = A1B;
        A00(context);
    }
}
