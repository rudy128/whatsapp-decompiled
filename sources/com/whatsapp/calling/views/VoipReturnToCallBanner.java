package com.whatsapp.calling.views;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass033;
import X.AnonymousClass3MW;
import X.C108955ca;
import X.C108975cc;
import X.C110665gi;
import X.C17880vN;
import X.C27691Xc;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.WaImageView;

public class VoipReturnToCallBanner extends C110665gi implements AnonymousClass009 {
    public AnonymousClass031 A00;
    public boolean A01;
    public final TextView A02;
    public final TextView A03;
    public final WaImageView A04;

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A00;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public void setCallNotificationTimer(long j) {
        TextView textView = this.A02;
        textView.setVisibility(0);
        C108975cc.A0y(textView, this.A09, C17880vN.A04(j));
        textView.setTag(Long.valueOf(j));
    }

    public VoipReturnToCallBanner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        if (!this.A01) {
            this.A01 = true;
            C27691Xc.A0o((C27691Xc) ((AnonymousClass033) generatedComponent()), this);
        }
    }

    public VoipReturnToCallBanner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A01) {
            this.A01 = true;
            C27691Xc.A0o((C27691Xc) ((AnonymousClass033) generatedComponent()), this);
        }
        View inflate = LayoutInflater.from(context).inflate(2131627505, this, true);
        TextView A0J = AnonymousClass3MW.A0J(inflate, 2131428709);
        this.A02 = A0J;
        this.A03 = AnonymousClass3MW.A0J(inflate, 2131428710);
        this.A04 = AnonymousClass3MW.A0R(inflate, 2131428708);
        A0J.setFocusable(true);
        C108955ca.A1K(A0J, this, 4);
        setBannerClickListener(context, this);
        AnonymousClass3MW.A1Q(this);
        A04();
        AnonymousClass3MW.A1S(A0J);
        A0J.setTag((Object) null);
    }

    public VoipReturnToCallBanner(Context context) {
        this(context, (AttributeSet) null);
    }
}
