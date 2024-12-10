package com.whatsapp.payments.ui;

import X.A8C;
import X.AXS;
import X.AZ6;
import X.AnonymousClass00H;
import X.AnonymousClass1BI;
import X.AnonymousClass1LU;
import X.AnonymousClass1QL;
import X.AnonymousClass1QS;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass8BV;
import X.AnonymousClass9BD;
import X.AnonymousClass9YW;
import X.BB3;
import X.C003401n;
import X.C134126q5;
import X.C1418477e;
import X.C1601987n;
import X.C161498Es;
import X.C162148Jd;
import X.C166868eE;
import X.C171858sO;
import X.C17880vN;
import X.C17960vV;
import X.C18020vd;
import X.C18040vf;
import X.C192109no;
import X.C194529rs;
import X.C19954A0l;
import X.C20031A4a;
import X.C20061A5k;
import X.C20112A7u;
import X.C20750AXf;
import X.C20756AXl;
import X.C21006Acy;
import X.C219217x;
import X.C26521Sl;
import X.C32981i4;
import X.C36361nl;
import X.C63572tK;
import X.C72463Mc;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.whatsapp.PagerSlidingTabStrip;

public final class IndiaUpiQrTabActivity extends C166868eE {
    public static String A0L;
    public C36361nl A00;
    public PagerSlidingTabStrip A01;
    public C219217x A02;
    public C32981i4 A03;
    public AnonymousClass1LU A04;
    public C20756AXl A05;
    public AXS A06;
    public AnonymousClass1QL A07;
    public AnonymousClass1QS A08;
    public AZ6 A09;
    public C161498Es A0A;
    public IndiaUpiScanQrCodeFragment A0B;
    public A8C A0C;
    public C26521Sl A0D;
    public AnonymousClass00H A0E;
    public AnonymousClass00H A0F;
    public boolean A0G = false;
    public ViewPager A0H;
    public IndiaUpiMyQrFragment A0I;
    public C192109no A0J;
    public final C1601987n A0K = new C21006Acy(this, 0);

    public void onActivityResult(int i, int i2, Intent intent) {
        String str;
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            if (i2 != 0) {
                this.A0B.A29();
            } else if (this.A0A.A00 == 2) {
                ViewPager viewPager = this.A0H;
                boolean z = true;
                if (!C18020vd.A05(C18040vf.A02, this.A0E, 12944)) {
                    z = AnonymousClass3MY.A1b(this.A00);
                }
                viewPager.A0J(z ? 1 : 0, true);
            } else {
                finish();
            }
        } else if (i == 203) {
            if (i2 == -1 && intent != null) {
                Uri data = intent.getData();
                if (data != null) {
                    CNA(2131895077);
                    AnonymousClass3MW.A1T(new AnonymousClass9BD(data, this, this.A0D, this.A0B.A08.getWidth(), this.A0B.A08.getHeight()), this.A05, 0);
                    return;
                }
                this.A05.A08(2131889981, 0);
            }
        } else if (i == 1019) {
            if (i2 == -1 && intent != null) {
                String stringExtra = intent.getStringExtra("INTERNATIONAL_QR_SOURCE");
                C20756AXl aXl = this.A05;
                String str2 = (String) C20061A5k.A01((C1418477e) intent.getParcelableExtra("INTERNATIONAL_QR_PAYLOAD"));
                if (A4d()) {
                    str = "main_qr_code_camera";
                } else {
                    str = "payments_camera";
                }
                aXl.A01(this, (AnonymousClass1BI) null, (BB3) null, str2, stringExtra, str);
            }
        } else if (i == 1025) {
            if (i2 == -1 && intent != null && intent.getBooleanExtra("extra_open_transaction_confirmation_fragment", false)) {
                this.A0B.A0E = false;
                ((C19954A0l) this.A0F.get()).A00(this, new C194529rs(intent.getExtras(), true, true), new AnonymousClass9YW(this));
            }
            if (this.A07.A0D()) {
                this.A0B.A28();
                C161498Es r2 = this.A0A;
                if (r2.A00 == 1) {
                    r2.A00 = 2;
                    r2.A04();
                }
                this.A01.setVisibility(0);
                this.A01.A02();
            }
            this.A0B.A2A();
        }
    }

    public static void A03(C20112A7u a7u, IndiaUpiQrTabActivity indiaUpiQrTabActivity, Integer num, Integer num2) {
        C171858sO A072 = indiaUpiQrTabActivity.A09.A07(num, num2, "scan_qr_code", AnonymousClass8BV.A0o(indiaUpiQrTabActivity));
        A072.A01 = Boolean.valueOf(indiaUpiQrTabActivity.A07.A0D());
        AZ6 az6 = indiaUpiQrTabActivity.A09;
        C20112A7u A002 = C20750AXf.A00((Uri) indiaUpiQrTabActivity.getIntent().getParcelableExtra("actual_deep_link"), a7u);
        C20031A4a.A00(A072, az6.A03);
        C63572tK r0 = C63572tK.A0E;
        A072.A0R = "IN";
        AZ6.A00(A072, A002);
        az6.A02.CC7(A072);
    }

    public void A4b() {
        int A022 = this.A02.A02("android.permission.CAMERA");
        IndiaUpiScanQrCodeFragment indiaUpiScanQrCodeFragment = this.A0B;
        if (A022 != 0) {
            indiaUpiScanQrCodeFragment.A27();
            C134126q5 r5 = new C134126q5(this);
            r5.A01 = 2131232198;
            r5.A02 = 2131894284;
            r5.A0A = new int[]{2131899103};
            r5.A03 = 2131894285;
            r5.A08 = new int[]{2131899103};
            r5.A01(new String[]{"android.permission.CAMERA"});
            r5.A06 = true;
            CNh(r5.A00(), 1);
            return;
        }
        indiaUpiScanQrCodeFragment.A29();
    }

    public void onBackPressed() {
        this.A0B.A26();
        super.onBackPressed();
        C20112A7u A022 = C20112A7u.A02();
        A022.A07("qr_detection_result", "no_code");
        A03(A022, this, C17880vN.A0h(), C17880vN.A0j());
    }

    public void onStop() {
        this.A0J.A00(getWindow());
        super.onStop();
    }

    public void A2l(Fragment fragment) {
        super.A2l(fragment);
        if (fragment instanceof IndiaUpiMyQrFragment) {
            this.A0I = (IndiaUpiMyQrFragment) fragment;
        } else if (fragment instanceof IndiaUpiScanQrCodeFragment) {
            this.A0B = (IndiaUpiScanQrCodeFragment) fragment;
        }
    }

    public boolean A4c() {
        Uri uri = (Uri) getIntent().getParcelableExtra("actual_deep_link");
        if (uri == null || this.A03.A0E(uri) != 143) {
            return false;
        }
        return true;
    }

    public boolean A4d() {
        if (14 == getIntent().getIntExtra("extra_payments_entry_type", -1) || A4c()) {
            return true;
        }
        return false;
    }

    public void onCreate(Bundle bundle) {
        C161498Es r1;
        C72463Mc.A0t(this);
        super.onCreate(bundle);
        getWindow().addFlags(128);
        setContentView(2131625683);
        this.A0J = new C192109no();
        C003401n supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0M(2131895390);
            supportActionBar.A0W(true);
        }
        A0L = getIntent().getStringExtra("extra_account_holder_name");
        C003401n supportActionBar2 = getSupportActionBar();
        C17960vV.A07(supportActionBar2);
        supportActionBar2.A0W(true);
        this.A0H = (ViewPager) findViewById(2131433629);
        this.A01 = (PagerSlidingTabStrip) findViewById(2131433630);
        if (this.A07.A0D()) {
            this.A01.setVisibility(0);
            if (supportActionBar != null) {
                supportActionBar.A0M(2131895390);
            }
            r1 = new C161498Es(getSupportFragmentManager(), this, 2);
        } else {
            this.A01.setVisibility(8);
            r1 = new C161498Es(getSupportFragmentManager(), this, 1);
        }
        this.A0A = r1;
        this.A0H.setAdapter(r1);
        this.A0H.A0K(new C162148Jd(this, 0));
        this.A01.setLayoutDirection(0);
        this.A01.setViewPager(this.A0H);
        this.A0H.A0J(0, false);
        C161498Es.A00(this.A0A, 0);
        AXS axs = this.A06;
        this.A05 = new C20756AXl(this.A06, this.A0E, axs, this.A09, this.A0C);
        A03(C20112A7u.A03(new C20112A7u[0]), this, 0, (Integer) null);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        this.A0B.A26();
        C20112A7u A022 = C20112A7u.A02();
        A022.A07("qr_detection_result", "no_code");
        A03(A022, this, 1, C17880vN.A0j());
        finish();
        return true;
    }

    public void onStart() {
        super.onStart();
        this.A0J.A01(getWindow(), this.A08);
    }
}
