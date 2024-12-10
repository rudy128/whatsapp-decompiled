package com.whatsapp.twofactor;

import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1LU;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass4a6;
import X.AnonymousClass4aX;
import X.AnonymousClass7RC;
import X.AnonymousClass89R;
import X.C000200d;
import X.C17890vO;
import X.C17960vV;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C30901eh;
import X.C36401np;
import X.C72473Md;
import X.C72483Me;
import X.C73203Rj;
import X.C88814ar;
import X.C90664eR;
import X.C90684eT;
import X.C91034f2;
import android.app.Dialog;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.whatsapp.WaTextView;
import java.util.List;

public class SettingsTwoFactorAuthActivity extends AnonymousClass1FY implements AnonymousClass89R {
    public int A00;
    public View A01;
    public View A02;
    public View A03;
    public ImageView A04;
    public ScrollView A05;
    public TextView A06;
    public TextView A07;
    public TextView A08;
    public WaTextView A09;
    public AnonymousClass1LU A0A;
    public C30901eh A0B;
    public C36401np A0C;
    public AnonymousClass00H A0D;
    public AnonymousClass00H A0E;
    public AnonymousClass00H A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public final Handler A0K;
    public final Runnable A0L;

    public SettingsTwoFactorAuthActivity() {
        this(0);
        this.A0K = C17890vO.A0D();
        this.A0L = new AnonymousClass7RC(this, 23);
    }

    public class ConfirmDisableDialog extends Hilt_SettingsTwoFactorAuthActivity_ConfirmDisableDialog {
        public Dialog A27(Bundle bundle) {
            C73203Rj A03 = AnonymousClass4a6.A03(this);
            A03.A0D(2131896038);
            return C73203Rj.A00(new C88814ar(this, 31), A03, 2131896037);
        }
    }

    public void A2y() {
        if (!this.A0J) {
            this.A0J = true;
            AnonymousClass10E A0L2 = C72473Md.A0L(this);
            C72483Me.A0q(A0L2, this);
            AnonymousClass10G r1 = A0L2.A00;
            AnonymousClass1FB.A0K(A0L2, r1, this, r1.A45);
            AnonymousClass1FB.A0L(A0L2, r1, this, r1.A5A);
            this.A0C = AnonymousClass3MY.A0e(r1);
            this.A0A = AnonymousClass3MY.A0Z(A0L2);
            this.A0F = C000200d.A00(r1.A3I);
            this.A0B = (C30901eh) A0L2.AB1.get();
            this.A0D = AnonymousClass3MX.A10(A0L2);
            this.A0E = C000200d.A00(A0L2.A3c);
        }
    }

    public void C9N(int i) {
        this.A0K.removeCallbacks(this.A0L);
        CEx();
        if (i == 405) {
            BhU(new Object[0], 2131897164, 2131897163);
        } else {
            BhQ(2131897192);
        }
        this.A05.CGN(new AnonymousClass7RC(this, 24));
    }

    public void C9O() {
        this.A0K.removeCallbacks(this.A0L);
        CEx();
        this.A05.CGN(new AnonymousClass7RC(this, 24));
        this.A05.A08(2131897172, 1);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C90664eR.A00(this.A05.getViewTreeObserver(), this, 9);
    }

    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        setTitle(2131896031);
        C72473Md.A18(this);
        setContentView(2131626930);
        this.A05 = (ScrollView) findViewById(2131434837);
        this.A04 = AnonymousClass3MX.A0I(this, 2131432209);
        this.A03 = findViewById(2131430412);
        this.A02 = findViewById(2131430019);
        this.A01 = findViewById(2131430018);
        this.A09 = (WaTextView) findViewById(2131429927);
        this.A06 = AnonymousClass3MX.A0L(this, 2131428959);
        this.A07 = AnonymousClass3MX.A0L(this, 2131428962);
        C18030ve r1 = this.A0E;
        C18040vf r3 = C18040vf.A02;
        this.A0H = C18020vd.A05(r3, r1, 5711);
        this.A0I = C18020vd.A05(r3, this.A0E, 8155);
        this.A0G = AnonymousClass3MY.A1a(getIntent(), "isEntryPointSecurityCheckup");
        if (this.A0H) {
            this.A08 = AnonymousClass3MX.A0L(this, 2131430011);
            i = 2131430010;
        } else {
            this.A08 = AnonymousClass3MX.A0L(this, 2131430010);
            i = 2131430011;
        }
        AnonymousClass3MX.A1H(this, i, 8);
        AnonymousClass3Ma.A1E(findViewById(2131430400), this, 8);
        AnonymousClass3Ma.A1E(this.A08, this, 9);
        AnonymousClass3Ma.A1E(this.A06, this, 10);
        boolean A052 = C18020vd.A05(r3, this.A0E, 5156);
        TextView textView = this.A07;
        if (A052) {
            textView.setVisibility(8);
        } else {
            AnonymousClass3Ma.A1E(textView, this, 11);
        }
        if (Build.VERSION.SDK_INT < 23) {
            int A032 = C72483Me.A03(this);
            AnonymousClass4aX.A0E(this.A08, A032);
            AnonymousClass4aX.A0E(this.A06, A032);
            AnonymousClass4aX.A0E(this.A07, A032);
        }
        this.A00 = getResources().getDimensionPixelSize(2131168631);
        this.A05.getViewTreeObserver().addOnScrollChangedListener(new C90684eT(this, 6));
        C90664eR.A00(this.A05.getViewTreeObserver(), this, 9);
    }

    public void onPause() {
        super.onPause();
        List list = this.A0B.A0A;
        C17960vV.A0D(list.contains(this));
        list.remove(this);
    }

    public void onResume() {
        super.onResume();
        View currentFocus = getCurrentFocus();
        if (currentFocus != null) {
            currentFocus.clearFocus();
        }
        List list = this.A0B.A0A;
        C17960vV.A0D(!list.contains(this));
        list.add(this);
        this.A05.CGN(new AnonymousClass7RC(this, 24));
    }

    public SettingsTwoFactorAuthActivity(int i) {
        this.A0J = false;
        C91034f2.A00(this, 48);
    }
}
