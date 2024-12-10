package com.whatsapp.registration.accountdefence.ui;

import X.A3H;
import X.A9B;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass11S;
import X.AnonymousClass1EG;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1LU;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4CG;
import X.C106485Wa;
import X.C110885hR;
import X.C17880vN;
import X.C17960vV;
import X.C18000vb;
import X.C21449AkG;
import X.C57352iw;
import X.C72463Mc;
import X.C72473Md;
import X.C72483Me;
import X.C91024f1;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.Me;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.wds.components.textlayout.WDSTextLayout;

public class OldDeviceSecureAccountActivity extends AnonymousClass1FY implements C106485Wa {
    public AnonymousClass1LU A00;
    public C57352iw A01;
    public WDSTextLayout A02;
    public AnonymousClass00H A03;
    public boolean A04;

    public OldDeviceSecureAccountActivity() {
        this(0);
    }

    public void A2y() {
        if (!this.A04) {
            this.A04 = true;
            AnonymousClass10E A0L = C72473Md.A0L(this);
            C72483Me.A0q(A0L, this);
            AnonymousClass10G r1 = A0L.A00;
            AnonymousClass1FB.A0K(A0L, r1, this, r1.A45);
            AnonymousClass1FB.A0L(A0L, r1, this, r1.A5A);
            this.A00 = AnonymousClass3MY.A0Z(A0L);
            this.A03 = AnonymousClass3MX.A10(A0L);
            this.A01 = C72463Mc.A0i(r1);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131624011);
        this.A01.A00(this);
        this.A02 = (WDSTextLayout) C110885hR.A0A(this, 2131433264);
        AnonymousClass3MZ.A1L(C110885hR.A0A(this, 2131429138), this, 16);
        AnonymousClass3MY.A10(this, this.A02, 2131886339);
        AnonymousClass3MX.A0L(this, 2131436281).setText(2131886340);
        View A08 = AnonymousClass3MX.A08(this, 2131626291);
        AnonymousClass3MZ.A1L(A08.findViewById(2131427638), this, 17);
        TextView A0E = C17880vN.A0E(A08, 2131429943);
        TextEmojiLabel A0W = AnonymousClass3MX.A0W(A08, 2131429938);
        AnonymousClass3MY.A1X(C17880vN.A0q(this, AnonymousClass1EG.A03(this, C72463Mc.A01(this)), AnonymousClass3MW.A1a(), 0, 2131886338), A0E);
        AnonymousClass3Ma.A1L(this.A0E, A0W);
        AnonymousClass3Ma.A1K(A0W, this.A08);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Object[] A1b = AnonymousClass3MW.A1b();
        A1b[0] = AnonymousClass1EG.A03(this, C72463Mc.A01(this));
        AnonymousClass11S r0 = this.A02;
        r0.A0I();
        Me me = r0.A00;
        C17960vV.A07(me);
        String str = me.jabber_id;
        C17960vV.A07(str);
        C18000vb r2 = this.A00;
        String str2 = me.cc;
        A0W.setText(spannableStringBuilder.append(Html.fromHtml(C17880vN.A0q(this, r2.A0G(A9B.A0H(str2, str.substring(str2.length()))), A1b, 1, 2131886337))).append(" ").append(A3H.A02(this, new C21449AkG((Object) this, 42), getString(2131886336), "learn-more")));
        AnonymousClass4CG.A00(A08, this.A02);
    }

    public OldDeviceSecureAccountActivity(int i) {
        this.A04 = false;
        C91024f1.A00(this, 49);
    }
}
