package com.whatsapp.biz;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass10E;
import X.AnonymousClass11P;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass72R;
import X.C18000vb;
import X.C18070vi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public final class BusinessHoursView extends LinearLayout implements AnonymousClass009 {
    public BusinessHoursContentView A00;
    public AnonymousClass72R A01;
    public AnonymousClass11P A02;
    public C18000vb A03;
    public AnonymousClass031 A04;
    public boolean A05;
    public ImageView A06;
    public boolean A07;

    public final void setBusinessProfileAnalyticsManager(AnonymousClass72R r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public final void setTime(AnonymousClass11P r2) {
        C18070vi.A0d(r2, 0);
        this.A02 = r2;
    }

    public final void setWhatsAppLocale(C18000vb r2) {
        C18070vi.A0d(r2, 0);
        this.A03 = r2;
    }

    public static final void A01(BusinessHoursView businessHoursView) {
        BusinessHoursContentView businessHoursContentView = businessHoursView.A00;
        if (businessHoursContentView != null) {
            businessHoursContentView.setFullView(businessHoursView.A05);
        }
        ImageView imageView = businessHoursView.A06;
        if (imageView != null) {
            Context context = businessHoursView.getContext();
            int i = 2131232029;
            if (businessHoursView.A05) {
                i = 2131232031;
            }
            AnonymousClass3MX.A1B(context, imageView, i);
        }
    }

    public void A02() {
        if (!this.A07) {
            this.A07 = true;
            AnonymousClass10E A0O = AnonymousClass3MW.A0O(generatedComponent());
            this.A01 = (AnonymousClass72R) A0O.A00.A0h.get();
            this.A02 = AnonymousClass10E.A6O(A0O);
            this.A03 = AnonymousClass10E.A6Q(A0O);
        }
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A04;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A04 = r0;
        }
        return r0.generatedComponent();
    }

    public final AnonymousClass72R getBusinessProfileAnalyticsManager() {
        AnonymousClass72R r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("businessProfileAnalyticsManager");
        throw null;
    }

    public final AnonymousClass11P getTime() {
        AnonymousClass11P r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("time");
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

    public final void setContentViewGravity(int i) {
        BusinessHoursContentView businessHoursContentView = this.A00;
        if (businessHoursContentView != null) {
            businessHoursContentView.setDescriptionViewGravityAndPadding(i);
        }
    }

    public BusinessHoursView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A02();
        A00();
    }

    private final void A00() {
        View inflate = AnonymousClass3MZ.A0D(this).inflate(2131624367, this, true);
        setFocusable(true);
        this.A00 = (BusinessHoursContentView) inflate.findViewById(2131428531);
        this.A06 = AnonymousClass3MW.A0H(inflate, 2131428530);
    }

    public BusinessHoursView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A02();
        A00();
    }

    public BusinessHoursView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet);
        A02();
    }

    public BusinessHoursView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A02();
        A00();
    }

    public BusinessHoursView(Context context) {
        super(context);
        A02();
        A00();
    }
}
