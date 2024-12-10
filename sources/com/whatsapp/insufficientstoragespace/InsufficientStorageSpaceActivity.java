package com.whatsapp.insufficientstoragespace;

import X.AFV;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass11Z;
import X.AnonymousClass18K;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1L9;
import X.AnonymousClass1LU;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.C1403871f;
import X.C18070vi;
import X.C72473Md;
import X.C72483Me;
import X.C81413zC;
import X.C83974Hj;
import X.C88584aA;
import X.C89954dI;
import X.C91014f0;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.util.Log;
import java.util.Locale;

public class InsufficientStorageSpaceActivity extends AnonymousClass1FY {
    public long A00;
    public AnonymousClass18K A01;
    public AnonymousClass1LU A02;
    public ScrollView A03;
    public C1403871f A04;
    public boolean A05;

    public InsufficientStorageSpaceActivity() {
        this(0);
    }

    public void A4K() {
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
            this.A01 = AnonymousClass3Ma.A0g(A0L);
        }
    }

    public void onCreate(Bundle bundle) {
        boolean z;
        int i;
        int i2;
        String A0x;
        View.OnClickListener r1;
        super.onCreate(bundle);
        AnonymousClass18K r12 = this.A01;
        C18070vi.A0d(r12, 1);
        String A002 = C83974Hj.A00(r12, 6);
        setContentView(2131624060);
        this.A03 = (ScrollView) findViewById(2131431750);
        TextView A0I = AnonymousClass3MW.A0I(this, 2131428456);
        TextView A0I2 = AnonymousClass3MW.A0I(this, 2131431751);
        TextView A0I3 = AnonymousClass3MW.A0I(this, 2131431748);
        long longExtra = getIntent().getLongExtra("spaceNeededInBytes", -1);
        this.A00 = longExtra;
        long A022 = (longExtra - ((AnonymousClass11Z) this.A0C.get()).A02()) + SearchActionVerificationClientService.MS_TO_NS;
        if (getIntent() == null || !getIntent().getBooleanExtra("allowSkipKey", false)) {
            z = false;
            i = 2131891416;
            i2 = 2131891421;
            A0x = AnonymousClass3MW.A0x(getResources(), C88584aA.A02(this.A00, A022), new Object[1], 0, 2131891419);
        } else {
            z = true;
            i = 2131891417;
            i2 = 2131891420;
            A0x = getResources().getString(2131891418);
        }
        A0I2.setText(i2);
        A0I3.setText(A0x);
        A0I.setText(i);
        if (z) {
            r1 = new AFV(12, A002, this);
        } else {
            r1 = new C89954dI(this, 22);
        }
        A0I.setOnClickListener(r1);
        if (z) {
            View findViewById = findViewById(2131428454);
            findViewById.setVisibility(0);
            C89954dI.A00(findViewById, this, 23);
        }
        C1403871f r0 = new C1403871f(this.A03, findViewById(2131428324), getResources().getDimensionPixelSize(2131168631));
        this.A04 = r0;
        r0.A02();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A04.A02();
    }

    public void onResume() {
        super.onResume();
        long A022 = ((AnonymousClass11Z) this.A0C.get()).A02();
        Locale locale = Locale.ENGLISH;
        Object[] A1b = AnonymousClass3MW.A1b();
        boolean z = false;
        A1b[0] = Long.valueOf(A022);
        A1b[1] = Long.valueOf(this.A00);
        Log.i(String.format(locale, "insufficient-storage-activity/internal-storage available: %,d required: %,d", A1b));
        if (A022 > this.A00) {
            Log.i("insufficient-storage-activity/space-available/finishing-the-activity");
            if (this.A00 > 0) {
                C81413zC r2 = new C81413zC();
                r2.A02 = Long.valueOf(this.A00);
                if (findViewById(2131428454).getVisibility() == 0) {
                    z = true;
                }
                r2.A00 = Boolean.valueOf(z);
                r2.A01 = 1;
                this.A01.CC7(r2);
            }
            finish();
        }
    }

    public void onBackPressed() {
        AnonymousClass1L9.A02(this);
    }

    public InsufficientStorageSpaceActivity(int i) {
        this.A05 = false;
        C91014f0.A00(this, 28);
    }
}
