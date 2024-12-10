package com.whatsapp.biz.catalog.view;

import X.AnonymousClass10I;
import X.AnonymousClass11S;
import X.AnonymousClass1E7;
import X.AnonymousClass1EG;
import X.AnonymousClass1HF;
import X.AnonymousClass1M9;
import X.AnonymousClass1PM;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass4aX;
import X.C121666La;
import X.C17880vN;
import X.C17890vO;
import X.C18000vb;
import X.C20471AMi;
import X.C24261Jm;
import X.C24921Me;
import X.C25001Mm;
import X.C26911Ty;
import X.C27191Vc;
import X.C27641Ww;
import X.C36211nW;
import X.C38471rL;
import X.C42741yf;
import X.C62762rw;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.components.AspectRatioFrameLayout;
import com.whatsapp.jid.UserJid;
import com.whatsapp.jobqueue.job.GetVNameCertificateJob;

public class CatalogHeader extends AspectRatioFrameLayout implements C36211nW {
    public ImageView A00;
    public AnonymousClass11S A01;
    public TextEmojiLabel A02;
    public C25001Mm A03;
    public C26911Ty A04;
    public AnonymousClass1M9 A05;
    public AnonymousClass1PM A06;
    public C24921Me A07;
    public C27191Vc A08;
    public C18000vb A09;
    public AnonymousClass10I A0A;
    public boolean A0B;
    public boolean A0C;
    public TextView A0D;
    public GetVNameCertificateJob A0E;

    public void BvB() {
    }

    public void BvC() {
    }

    public void setOnTextClickListener(C38471rL r2) {
        TextView textView = this.A0D;
        if (textView != null && !TextUtils.isEmpty(textView.getText())) {
            this.A0D.setOnClickListener(r2);
        }
        TextEmojiLabel textEmojiLabel = this.A02;
        if (textEmojiLabel != null && !TextUtils.isEmpty(textEmojiLabel.getText())) {
            this.A02.setOnClickListener(r2);
        }
    }

    public CatalogHeader(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A02();
        A03(context, attributeSet);
    }

    public float getAspectRatio() {
        return this.A00;
    }

    public void setUp(UserJid userJid) {
        String str;
        this.A00 = AnonymousClass3MW.A0H(this, 2131428904);
        TextView A0E2 = C17880vN.A0E(this, 2131428903);
        this.A0D = A0E2;
        AnonymousClass1HF.A0q(A0E2, true);
        if (!this.A01.A0O(userJid)) {
            AnonymousClass4aX.A08(C24261Jm.A00(getContext(), 2131231229), -1);
            C27641Ww.A0B(this.A0D, this.A09, 2131231229);
            TextView textView = this.A0D;
            if (textView != null) {
                textView.setCompoundDrawablePadding(C62762rw.A01(getContext(), 8.0f));
            }
        }
        TextEmojiLabel A0W = AnonymousClass3MX.A0W(this, 2131428902);
        this.A02 = A0W;
        AnonymousClass1HF.A0q(A0W, true);
        C42741yf A022 = this.A06.A02(userJid);
        if (A022 == null) {
            if (this.A0E == null) {
                GetVNameCertificateJob getVNameCertificateJob = new GetVNameCertificateJob(userJid);
                this.A0E = getVNameCertificateJob;
                this.A03.A01(getVNameCertificateJob);
            }
            str = null;
        } else {
            str = A022.A08;
        }
        AnonymousClass1E7 A0H = this.A05.A0H(userJid);
        TextView textView2 = this.A0D;
        if (textView2 != null) {
            if (AnonymousClass1EG.A0H(str)) {
                str = this.A07.A0I(A0H);
            }
            textView2.setText(str);
        }
        this.A04.A0D(new C20471AMi(this, userJid, 3), userJid);
        C17890vO.A0u(new C121666La(this, this.A08, A0H), this.A0A);
    }

    public CatalogHeader(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CatalogHeader(Context context) {
        this(context, (AttributeSet) null);
    }
}
