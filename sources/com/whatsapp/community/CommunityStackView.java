package com.whatsapp.community;

import X.AnonymousClass000;
import X.AnonymousClass10E;
import X.AnonymousClass1E7;
import X.AnonymousClass1J8;
import X.AnonymousClass1VW;
import X.AnonymousClass3MW;
import X.AnonymousClass3MZ;
import X.AnonymousClass3NL;
import X.AnonymousClass3PG;
import X.C1600086t;
import X.C18000vb;
import X.C18030ve;
import X.C37451pZ;
import X.C94184kB;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import com.whatsapp.WaImageView;

public class CommunityStackView extends AnonymousClass3PG implements C1600086t {
    public WaImageView A00;
    public AnonymousClass1VW A01;
    public C18000vb A02;
    public C18030ve A03;

    public CommunityStackView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public View getTransitionView() {
        return this.A00;
    }

    public void setParentGroupProfilePhoto(AnonymousClass1E7 r5, C37451pZ r6) {
        C94184kB r2 = new C94184kB(this.A01, AnonymousClass000.A0Y(this).getDimensionPixelSize(2131166364));
        r2.CIg(r5.A0J);
        r6.A05(this.A00, r2, r5, false);
    }

    public CommunityStackView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A01) {
            this.A01 = true;
            AnonymousClass10E A0O = AnonymousClass3MW.A0O(generatedComponent());
            this.A03 = AnonymousClass10E.A8r(A0O);
            this.A02 = AnonymousClass10E.A6Q(A0O);
            this.A01 = AnonymousClass3MZ.A0e(A0O);
        }
        LayoutInflater.from(context).inflate(AnonymousClass1J8.A08(this.A03) ? 2131624602 : 2131624601, this, true);
        this.A00 = AnonymousClass3MW.A0R(this, 2131433421);
        AnonymousClass3NL.A01(context, AnonymousClass3MW.A0G(this, 2131429286), this.A02, 2131233148);
    }

    public CommunityStackView(Context context) {
        this(context, (AttributeSet) null);
    }
}
