package com.whatsapp.companiondevice.optin.ui;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass10I;
import X.AnonymousClass11C;
import X.AnonymousClass129;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1KB;
import X.AnonymousClass1L9;
import X.AnonymousClass3Ma;
import X.C003401n;
import X.C110885hR;
import X.C17880vN;
import X.C18030ve;
import X.C24071It;
import X.C26302CxJ;
import X.C57452j6;
import X.C72463Mc;
import X.C72473Md;
import X.C72483Me;
import X.C73313Ui;
import X.C90584eJ;
import X.C90684eT;
import X.C91004ez;
import X.C91624fz;
import X.C91724g9;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.wds.components.button.WDSButton;

public class ForcedOptInActivity extends AnonymousClass1FY {
    public ProgressDialog A00;
    public View A01;
    public ScrollView A02;
    public TextEmojiLabel A03;
    public C57452j6 A04;
    public C73313Ui A05;
    public AnonymousClass129 A06;
    public WDSButton A07;
    public boolean A08;

    public ForcedOptInActivity() {
        this(0);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131625341);
        C003401n A0S = C72463Mc.A0S(this, (Toolbar) findViewById(2131436246));
        A0S.A0M(2131891914);
        A0S.A0W(true);
        this.A02 = (ScrollView) C110885hR.A0A(this, 2131434837);
        this.A01 = C110885hR.A0A(this, 2131436545);
        this.A03 = (TextEmojiLabel) C110885hR.A0A(this, 2131431582);
        this.A07 = (WDSButton) C110885hR.A0A(this, 2131436532);
        AnonymousClass1KB r6 = this.A05;
        AnonymousClass10I r10 = this.A05;
        this.A05 = (C73313Ui) new C24071It(new C91724g9(r6, this.A04, this.A07, this.A0A, r10), this).A00(C73313Ui.class);
        C18030ve r102 = this.A0E;
        AnonymousClass1KB r7 = this.A05;
        AnonymousClass1L9 r62 = this.A01;
        AnonymousClass11C r9 = this.A08;
        C26302CxJ.A0K(this, this.A06.A05("download-and-installation", "about-linked-devices"), r62, r7, this.A03, r9, r102, C17880vN.A0q(this, "learn-more", new Object[1], 0, 2131891911), "learn-more");
        C90584eJ.A00(this.A02.getViewTreeObserver(), this, 14);
        this.A02.getViewTreeObserver().addOnScrollChangedListener(new C90684eT(this, 1));
        AnonymousClass3Ma.A1B(this.A07, this, 7);
        C91624fz.A00(this, this.A05.A02, 20);
        C91624fz.A00(this, this.A05.A04, 21);
        C91624fz.A00(this, this.A05.A05, 22);
        C91624fz.A00(this, this.A05.A01, 23);
    }

    public void A2y() {
        if (!this.A08) {
            this.A08 = true;
            AnonymousClass10E A0L = C72473Md.A0L(this);
            C72483Me.A0q(A0L, this);
            AnonymousClass10G r1 = A0L.A00;
            AnonymousClass1FB.A0K(A0L, r1, this, r1.A45);
            AnonymousClass1FB.A0L(A0L, r1, this, r1.A5A);
            this.A06 = AnonymousClass3Ma.A0t(A0L);
            this.A04 = (C57452j6) r1.ADi.get();
        }
    }

    public ForcedOptInActivity(int i) {
        this.A08 = false;
        C91004ez.A00(this, 17);
    }
}
