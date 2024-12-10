package com.whatsapp.search.views;

import X.AnonymousClass10E;
import X.AnonymousClass1Y5;
import X.AnonymousClass21V;
import X.AnonymousClass21Y;
import X.AnonymousClass22W;
import X.AnonymousClass25A;
import X.AnonymousClass3M2;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass7NE;
import X.C108955ca;
import X.C32021gV;
import X.C438421d;
import X.C440021t;
import X.C441122e;
import X.C441522i;
import X.C72463Mc;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import com.whatsapp.WaImageView;

public class MessageThumbView extends WaImageView {
    public int A00;
    public int A01;
    public C32021gV A02;
    public AnonymousClass21V A03;
    public boolean A04;
    public final AnonymousClass3M2 A05;

    private int getNotDownloadedContentDescription() {
        AnonymousClass21V r1 = this.A03;
        if ((r1 instanceof C438421d) || (r1 instanceof AnonymousClass22W)) {
            return 2131889011;
        }
        if (r1 instanceof C440021t) {
            return 2131889010;
        }
        if ((r1 instanceof AnonymousClass21Y) || (r1 instanceof C441122e)) {
            return 2131889014;
        }
        if (r1 instanceof C441522i) {
            return 2131889013;
        }
        return -1;
    }

    private void setStatus(int i) {
        Resources resources;
        int i2;
        if (this.A00 != null && this.A03 != null) {
            AnonymousClass1Y5.A01(this);
            if (i == 0 || i == 1) {
                resources = getResources();
                i2 = 2131891256;
            } else if (i == 2 || i == 3) {
                resources = getResources();
                i2 = 2131886435;
            } else {
                AnonymousClass1Y5.A02(this, 2131887592);
                setOnClickListener((View.OnClickListener) null);
                int notDownloadedContentDescription = getNotDownloadedContentDescription();
                if (notDownloadedContentDescription != -1) {
                    setContentDescription(AnonymousClass3MW.A0x(getResources(), AnonymousClass25A.A0C(this.A00, this.A03.A01), new Object[1], 0, notDownloadedContentDescription));
                    return;
                }
                return;
            }
            AnonymousClass3MX.A1D(resources, this, i2);
            setOnClickListener((View.OnClickListener) null);
        }
    }

    public void A05() {
        if (!this.A04) {
            this.A04 = true;
            AnonymousClass10E A0X = C72463Mc.A0X(this);
            this.A00 = AnonymousClass10E.A6Q(A0X);
            this.A02 = C108955ca.A0b(A0X);
        }
    }

    public void A06(AnonymousClass21V r3, boolean z) {
        if (this.A02 != null) {
            this.A03 = r3;
            AnonymousClass3M2 r1 = this.A05;
            r1.CN4(this);
            C32021gV r0 = this.A02;
            if (z) {
                r0.A0D(this, r3, r1);
            } else {
                r0.A0E(this, r3, r1);
            }
        }
    }

    public MessageThumbView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A05();
        this.A05 = new AnonymousClass7NE(this, 3);
    }

    public void setErrorPlaceholderResId(int i) {
        this.A00 = i;
    }

    public void setRadius(int i) {
        this.A01 = i;
    }

    public MessageThumbView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A05();
    }

    public MessageThumbView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A05();
        this.A05 = new AnonymousClass7NE(this, 3);
    }

    public MessageThumbView(Context context) {
        this(context, (AttributeSet) null);
    }
}
