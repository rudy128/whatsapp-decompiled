package com.whatsapp.spamwarning;

import X.AnonymousClass000;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass129;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1L9;
import X.AnonymousClass1LU;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass3NP;
import X.C17900vP;
import X.C23651Hc;
import X.C26181Rd;
import X.C72473Md;
import X.C72483Me;
import X.C91034f2;
import X.C92234gy;
import android.os.Bundle;
import android.widget.TextView;
import com.whatsapp.CircularProgressBar;

public class SpamWarningActivity extends AnonymousClass1FY {
    public int A00;
    public C23651Hc A01;
    public AnonymousClass1LU A02;
    public AnonymousClass129 A03;
    public C26181Rd A04;
    public boolean A05;

    public SpamWarningActivity() {
        this(0);
    }

    public void A2y() {
        if (!this.A05) {
            this.A05 = true;
            AnonymousClass10E A0L = C72473Md.A0L(this);
            C72483Me.A0q(A0L, this);
            AnonymousClass10G r1 = A0L.A00;
            AnonymousClass1FB.A0K(A0L, r1, this, r1.A45);
            AnonymousClass1FB.A0L(A0L, r1, this, r1.A5A);
            this.A02 = AnonymousClass3MY.A0Z(A0L);
            this.A03 = AnonymousClass3Ma.A0t(A0L);
            this.A01 = (C23651Hc) A0L.ACD.get();
        }
    }

    public void onDestroy() {
        C26181Rd r1 = this.A04;
        if (r1 != null) {
            this.A01.unregisterObserver(r1);
            this.A04 = null;
        }
        super.onDestroy();
    }

    public void onBackPressed() {
        super.onBackPressed();
        AnonymousClass1L9.A02(this);
    }

    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        setContentView(2131624111);
        setTitle(2131896276);
        int intExtra = getIntent().getIntExtra("spam_warning_reason_key", 100);
        this.A00 = getIntent().getIntExtra("expiry_in_seconds", -1);
        String stringExtra = getIntent().getStringExtra("spam_warning_message_key");
        String stringExtra2 = getIntent().getStringExtra("faq_url_key");
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SpamWarningActivity started with code ");
        A10.append(intExtra);
        A10.append(" and expiry (in seconds) ");
        C17900vP.A0o(A10, this.A00);
        switch (intExtra) {
            case 101:
                i = 2131896279;
                break;
            case 102:
                i = 2131896277;
                break;
            case 103:
                i = 2131896278;
                break;
            case 104:
                i = 2131896281;
                break;
            case 106:
                i = 2131896280;
                break;
            default:
                i = 2131896273;
                if (this.A00 == -1) {
                    i = 2131896275;
                    break;
                }
                break;
        }
        AnonymousClass3Ma.A1G(findViewById(2131428455), this, stringExtra2, 23);
        TextView A0L = AnonymousClass3MX.A0L(this, 2131435538);
        if (stringExtra == null || stringExtra.isEmpty()) {
            A0L.setText(i);
        } else {
            A0L.setText(stringExtra);
        }
        if (this.A00 == -1) {
            AnonymousClass3MX.A1H(this, 2131434181, 8);
            if (this.A01.A02() || this.A01.A05 == 1) {
                startActivity(AnonymousClass1LU.A02(this));
                finish();
                return;
            }
            C92234gy r1 = new C92234gy(this);
            this.A04 = r1;
            this.A01.A00(r1);
            return;
        }
        AnonymousClass3MX.A1H(this, 2131435537, 8);
        CircularProgressBar circularProgressBar = (CircularProgressBar) findViewById(2131434181);
        circularProgressBar.setVisibility(0);
        circularProgressBar.A0I = true;
        circularProgressBar.setMax(this.A00 * 1000);
        new AnonymousClass3NP(circularProgressBar, this, 1000 * ((long) this.A00)).start();
    }

    public SpamWarningActivity(int i) {
        this.A05 = false;
        C91034f2.A00(this, 43);
    }
}
