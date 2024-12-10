package com.whatsapp.registration.accountdefence.ui;

import X.A9B;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass19D;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1K1;
import X.AnonymousClass1LU;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4CG;
import X.AnonymousClass5YV;
import X.C000200d;
import X.C106485Wa;
import X.C110885hR;
import X.C17880vN;
import X.C17960vV;
import X.C21449AkG;
import X.C22881Do;
import X.C27301Vn;
import X.C36401np;
import X.C36801oU;
import X.C72453Mb;
import X.C72463Mc;
import X.C72473Md;
import X.C72483Me;
import X.C84474Jq;
import X.C88364Zk;
import X.C91024f1;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.textlayout.WDSTextLayout;

public class OldDeviceMoveAccountNoticeActivity extends AnonymousClass1FY implements AnonymousClass5YV, C106485Wa {
    public C84474Jq A00;
    public C36801oU A01;
    public C27301Vn A02;
    public AnonymousClass19D A03;
    public AnonymousClass1LU A04;
    public C36401np A05;
    public WDSTextLayout A06;
    public AnonymousClass00H A07;
    public AnonymousClass00H A08;
    public AnonymousClass00H A09;
    public String A0A;
    public boolean A0B;

    public OldDeviceMoveAccountNoticeActivity() {
        this(0);
    }

    public void A2y() {
        if (!this.A0B) {
            this.A0B = true;
            AnonymousClass1K1 A0K = C72473Md.A0K(this);
            AnonymousClass10E r2 = A0K.AAQ;
            C72483Me.A0q(r2, this);
            AnonymousClass10G r3 = r2.A00;
            AnonymousClass1FB.A0K(r2, r3, this, r3.A45);
            AnonymousClass1FB.A0L(r2, r3, this, r3.A5A);
            this.A05 = AnonymousClass3MY.A0e(r3);
            this.A04 = AnonymousClass3MY.A0Z(r2);
            this.A03 = C72463Mc.A0e(r2);
            this.A08 = C000200d.A00(r2.A5t);
            this.A09 = C000200d.A00(r2.A6N);
            this.A07 = C000200d.A00(r2.A08);
            this.A02 = (C27301Vn) r2.A9A.get();
            this.A01 = (C36801oU) r2.A4c.get();
            this.A00 = (C84474Jq) A0K.A3T.get();
        }
    }

    public boolean C5Z() {
        CEx();
        return true;
    }

    public void onCreate(Bundle bundle) {
        ViewStub A0G;
        int i;
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("server_token");
        C17960vV.A07(stringExtra);
        this.A0A = stringExtra;
        setContentView(2131624010);
        if (this.A0A.A2L()) {
            A0G = AnonymousClass3MX.A0G(this, 2131436250);
            i = 2131436281;
        } else {
            A0G = AnonymousClass3MX.A0G(this, 2131436247);
            i = 2131436280;
        }
        ((TextView) A0G.inflate()).setText(2131886331);
        A9B.A0T(this, this.A03, i);
        WDSTextLayout wDSTextLayout = (WDSTextLayout) C110885hR.A0A(this, 2131433263);
        this.A06 = wDSTextLayout;
        AnonymousClass3MY.A10(this, wDSTextLayout, 2131886328);
        View A082 = AnonymousClass3MX.A08(this, 2131626290);
        View findViewById = A082.findViewById(2131432803);
        View findViewById2 = A082.findViewById(2131435717);
        TextEmojiLabel A0W = AnonymousClass3MX.A0W(A082, 2131428027);
        AnonymousClass3MZ.A1L(findViewById, this, 10);
        AnonymousClass3MZ.A1L(findViewById2, this, 11);
        SpannableStringBuilder A052 = this.A05.A05(A0W.getContext(), new C21449AkG((Object) this, 41), getString(2131886329), "create-backup");
        AnonymousClass3Ma.A1L(this.A0E, A0W);
        AnonymousClass3Ma.A1K(A0W, this.A08);
        A0W.setText(A052);
        AnonymousClass4CG.A00(A082, this.A06);
        AnonymousClass3MZ.A1L(C110885hR.A0A(this, 2131429138), this, 12);
    }

    public void onResume() {
        super.onResume();
        if (((C22881Do) this.A08.get()).A01 || C17880vN.A1W(C72453Mb.A0M(this), "show_post_reg_logged_out_dialog")) {
            Log.i("OldDeviceMoveAccountNoticeActivity/show-login-failed");
            this.A0A.A2C(false);
            this.A02.BEJ(20, "OldDeviceMoveAccountNoticeLoginFailed");
            C88364Zk.A01(this, C17880vN.A0I(this.A07), this.A0E, (C22881Do) this.A08.get());
        }
    }

    public OldDeviceMoveAccountNoticeActivity(int i) {
        this.A0B = false;
        C91024f1.A00(this, 47);
    }
}
