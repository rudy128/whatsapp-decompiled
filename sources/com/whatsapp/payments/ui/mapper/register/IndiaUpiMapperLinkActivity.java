package com.whatsapp.payments.ui.mapper.register;

import X.AXS;
import X.AZ6;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass3MY;
import X.AnonymousClass5JN;
import X.AnonymousClass9R2;
import X.C17880vN;
import X.C18070vi;
import X.C18090vk;
import X.C20338AGu;
import X.C72453Mb;
import X.C72473Md;
import X.C72483Me;
import X.C91024f1;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.Window;
import android.widget.TextView;
import com.facebook.msys.mci.DefaultCrypto;

public final class IndiaUpiMapperLinkActivity extends AnonymousClass1FY {
    public TextView A00;
    public AXS A01;
    public AZ6 A02;
    public IndiaUpiMapperLinkViewModel A03;
    public boolean A04;
    public boolean A05;
    public final C18090vk A06;

    public IndiaUpiMapperLinkActivity() {
        this(0);
        this.A06 = new AnonymousClass5JN(this);
    }

    public void A2y() {
        if (!this.A05) {
            this.A05 = true;
            AnonymousClass10E A0L = C72473Md.A0L(this);
            C72483Me.A0q(A0L, this);
            AnonymousClass10G r1 = A0L.A00;
            AnonymousClass1FB.A0K(A0L, r1, this, r1.A45);
            AnonymousClass1FB.A0L(A0L, r1, this, r1.A5A);
            this.A02 = (AZ6) A0L.A5D.get();
            this.A01 = (AXS) A0L.A5F.get();
        }
    }

    public final AZ6 A4b() {
        AZ6 az6 = this.A02;
        if (az6 != null) {
            return az6;
        }
        C18070vi.A11("indiaUpiFieldStatsLogger");
        throw null;
    }

    public void onBackPressed() {
        String str;
        String str2;
        super.onBackPressed();
        AZ6 A4b = A4b();
        if (this.A04) {
            str = "alias_switch_in_progress";
        } else {
            str = "alias_in_progress";
        }
        Intent intent = getIntent();
        if (intent != null) {
            str2 = intent.getStringExtra("extra_referral_screen");
        } else {
            str2 = null;
        }
        A4b.BiL(1, str, str2, 1);
    }

    public void onCreate(Bundle bundle) {
        String str;
        String str2;
        String str3;
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.addFlags(DefaultCrypto.BUFFER_SIZE);
        }
        setContentView(2131625635);
        TextView textView = (TextView) AnonymousClass3MY.A0H(this, 2131432297);
        C18070vi.A0d(textView, 0);
        this.A00 = textView;
        IndiaUpiMapperLinkViewModel indiaUpiMapperLinkViewModel = (IndiaUpiMapperLinkViewModel) this.A06.invoke();
        C18070vi.A0d(indiaUpiMapperLinkViewModel, 0);
        this.A03 = indiaUpiMapperLinkViewModel;
        if (bundle == null) {
            this.A04 = false;
            TextView textView2 = this.A00;
            if (textView2 != null) {
                textView2.setText(2131891859);
                IndiaUpiMapperLinkViewModel indiaUpiMapperLinkViewModel2 = this.A03;
                if (indiaUpiMapperLinkViewModel2 != null) {
                    indiaUpiMapperLinkViewModel2.A0T(false);
                }
                str = "indiaUpiMapperLinkViewModel";
                C18070vi.A11(str);
                throw null;
            }
            str = "titleTextView";
            C18070vi.A11(str);
            throw null;
        }
        AnonymousClass9R2.A00(this, 2131232759);
        IndiaUpiMapperLinkViewModel indiaUpiMapperLinkViewModel3 = this.A03;
        if (indiaUpiMapperLinkViewModel3 != null) {
            indiaUpiMapperLinkViewModel3.A05.A0A(this, new C20338AGu(this, 6));
            onConfigurationChanged(getResources().getConfiguration());
            AZ6 A4b = A4b();
            if (this.A04) {
                str2 = "alias_switch_in_progress";
            } else {
                str2 = "alias_in_progress";
            }
            Intent intent = getIntent();
            if (intent != null) {
                str3 = intent.getStringExtra("extra_referral_screen");
            } else {
                str3 = null;
            }
            A4b.BiL((Integer) null, str2, str3, 0);
            return;
        }
        str = "indiaUpiMapperLinkViewModel";
        C18070vi.A11(str);
        throw null;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        String str;
        String str2;
        if (C72453Mb.A0B(menuItem) == 16908332) {
            AZ6 A4b = A4b();
            Integer A0j = C17880vN.A0j();
            if (this.A04) {
                str = "alias_switch_in_progress";
            } else {
                str = "alias_in_progress";
            }
            Intent intent = getIntent();
            if (intent != null) {
                str2 = intent.getStringExtra("extra_referral_screen");
            } else {
                str2 = null;
            }
            A4b.BiL(A0j, str, str2, 1);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public IndiaUpiMapperLinkActivity(int i) {
        this.A05 = false;
        C91024f1.A00(this, 16);
    }
}
