package com.whatsapp.qrcode.contactqr;

import X.AnonymousClass009;
import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass031;
import X.AnonymousClass10E;
import X.AnonymousClass11S;
import X.AnonymousClass1E7;
import X.AnonymousClass1EC;
import X.AnonymousClass1HF;
import X.AnonymousClass1PM;
import X.AnonymousClass1PU;
import X.AnonymousClass1VW;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.C000200d;
import X.C18020vd;
import X.C18040vf;
import X.C22971Dz;
import X.C24262ByL;
import X.C24921Me;
import X.C25912CoW;
import X.C27191Vc;
import X.C2V;
import X.C42141xh;
import X.C42741yf;
import X.C43421zm;
import X.C57292iq;
import X.C72043Kk;
import X.C72453Mb;
import X.C72463Mc;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.QrImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.util.Log;
import java.util.EnumMap;

public class ContactQrContactCardView extends LinearLayout implements AnonymousClass009 {
    public AnonymousClass11S A00;
    public C72043Kk A01;
    public C42141xh A02;
    public C42141xh A03;
    public AnonymousClass1VW A04;
    public AnonymousClass1PM A05;
    public C24921Me A06;
    public C27191Vc A07;
    public AnonymousClass1PU A08;
    public AnonymousClass00H A09;
    public AnonymousClass031 A0A;
    public View A0B;
    public View A0C;
    public QrImageView A0D;
    public C42141xh A0E;
    public WaTextView A0F;
    public ThumbnailButton A0G;
    public boolean A0H;

    public void A02(AnonymousClass1E7 r10, boolean z) {
        C42141xh r4;
        int i;
        AnonymousClass1E7 r42 = r10;
        if (!r10.A0g || !z) {
            this.A04.A0C(this.A0G, r10);
        } else {
            this.A0G.setImageBitmap(this.A07.A04(getContext(), r42, "ContactQrContactCardView.setContact", AnonymousClass3MW.A00(getResources(), 2131166090), getResources().getDimensionPixelSize(2131166091), false));
        }
        if (r10.A0F()) {
            C42141xh r2 = this.A03;
            r2.A01.setText(this.A06.A0I(r10));
            boolean A032 = this.A08.A03((AnonymousClass1EC) r10.A06(AnonymousClass1EC.class));
            C42141xh r0 = this.A02;
            int i2 = 2131891133;
            if (A032) {
                i2 = 2131893522;
            }
            r0.A01.setText(i2);
            return;
        }
        if (C22971Dz.A0V(r10.A0J)) {
            C42141xh r22 = this.A03;
            r22.A01.setText(this.A06.A0I(r10));
            r4 = this.A02;
            i = 2131888109;
        } else if (!r10.A0C()) {
            C42141xh r02 = this.A03;
            r02.A01.setText(r10.A0c);
            r4 = this.A02;
            i = 2131888846;
        } else {
            C42741yf A022 = this.A05.A02(AnonymousClass3MZ.A0x(r10));
            if (r10.A0O() || (A022 != null && A022.A03 == 3)) {
                C42141xh r03 = this.A03;
                r03.A01.setText(r10.A0c);
                this.A03.A03(1);
                r4 = this.A02;
                i = 2131887562;
                if (C18020vd.A05(C18040vf.A02, ((C57292iq) this.A09.get()).A00, 5846)) {
                    i = 2131887563;
                }
            } else {
                C42141xh r04 = this.A03;
                r04.A01.setText(r10.A0c);
                r4 = this.A02;
                i = 2131892074;
            }
        }
        r4.A01.setText(i);
    }

    public void A01() {
        if (!this.A0H) {
            this.A0H = true;
            AnonymousClass10E A0O = AnonymousClass3MW.A0O(generatedComponent());
            this.A00 = AnonymousClass10E.A17(A0O);
            this.A04 = AnonymousClass3MZ.A0e(A0O);
            this.A06 = AnonymousClass3MZ.A0g(A0O);
            this.A08 = AnonymousClass3MZ.A12(A0O);
            this.A05 = AnonymousClass3MZ.A0f(A0O);
            this.A07 = AnonymousClass3MZ.A0j(A0O);
            this.A09 = C000200d.A00(A0O.A6p);
            this.A01 = AnonymousClass3MZ.A0T(A0O.A00);
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

    public void setCustomUrl(String str) {
        this.A0E.A01.setText(str);
    }

    public void setCustomUrlVisible(boolean z) {
        C42141xh r0 = this.A0E;
        r0.A01.setVisibility(C72453Mb.A07(z ? 1 : 0));
    }

    public void setPrompt(String str) {
        this.A0F.setText(str);
    }

    public void setQrCode(String str) {
        try {
            this.A0D.setQrCode(C25912CoW.A00(AnonymousClass00R.A01, str, new EnumMap(C24262ByL.class)));
            this.A0D.invalidate();
        } catch (C2V e) {
            Log.e("ContactQrContactCardView/failed to set QR code", e);
        }
    }

    public void setQrCodeContentDescription(CharSequence charSequence) {
        this.A0B.setContentDescription(charSequence);
    }

    public void setStyle(int i) {
        C43421zm.A04(this.A03.A01);
        if (i == 1) {
            C72463Mc.A0v(getContext(), getContext(), this, 2130971952, 2131103094);
            setPadding(0, getResources().getDimensionPixelOffset(2131166101), 0, getPaddingBottom());
            AnonymousClass3MW.A0B(this.A0F).setMargins(0, this.A0F.getResources().getDimensionPixelSize(2131166102), 0, 0);
            WaTextView waTextView = this.A0F;
            waTextView.setTextSize(0, AnonymousClass3MW.A00(waTextView.getResources(), 2131166103));
            AnonymousClass3MX.A1C(getContext(), this.A0F, 2131103439);
            this.A0C.setVisibility(0);
            return;
        }
        AnonymousClass3MY.A0w(getContext(), this.A0B, 2131886255);
    }

    public ContactQrContactCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01();
        A00(context);
    }

    private void A00(Context context) {
        View.inflate(context, 2131624687, this);
        this.A0G = (ThumbnailButton) AnonymousClass1HF.A06(this, 2131434167);
        this.A03 = C42141xh.A01(this, this.A01, 2131436208);
        this.A0E = C42141xh.A01(this, this.A01, 2131429762);
        this.A02 = C42141xh.A01(this, this.A01, 2131435885);
        this.A0B = AnonymousClass1HF.A06(this, 2131434247);
        this.A0D = (QrImageView) AnonymousClass1HF.A06(this, 2131434246);
        this.A0F = AnonymousClass3MW.A0T(this, 2131434207);
        this.A0C = AnonymousClass1HF.A06(this, 2131434259);
    }

    public ContactQrContactCardView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A01();
    }

    public ContactQrContactCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01();
        A00(context);
    }

    public ContactQrContactCardView(Context context) {
        super(context);
        A01();
        A00(context);
    }
}
