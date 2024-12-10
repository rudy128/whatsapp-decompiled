package com.whatsapp.companionmode.registration;

import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass112;
import X.AnonymousClass1FB;
import X.AnonymousClass1K1;
import X.AnonymousClass1LU;
import X.AnonymousClass1VJ;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass6UT;
import X.AnonymousClass79Z;
import X.C000200d;
import X.C108945cZ;
import X.C108955ca;
import X.C109005cf;
import X.C116395xC;
import X.C125746bc;
import X.C166908eI;
import X.C26721Tf;
import X.C47922Km;
import X.C58492km;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.widget.ProgressBar;

public class CompanionBootstrapActivity extends C166908eI {
    public C47922Km A00;
    public C26721Tf A01;
    public AnonymousClass1VJ A02;
    public AnonymousClass1LU A03;
    public AnonymousClass00H A04;
    public ProgressBar A05;
    public boolean A06;
    public final AnonymousClass6UT A07;
    public final C125746bc A08;

    public void onBackPressed() {
    }

    public void A2y() {
        if (!this.A06) {
            this.A06 = true;
            AnonymousClass1K1 A0K = C108955ca.A0K(this);
            AnonymousClass10E A0A = C109005cf.A0A(A0K, this);
            AnonymousClass1FB.A0M(A0A, this);
            AnonymousClass10G r1 = A0A.A00;
            C109005cf.A0d(A0A, r1, this);
            C109005cf.A0e(A0A, r1, this, r1.A5A);
            this.A00 = AnonymousClass1K1.A1f(A0K);
            this.A02 = (AnonymousClass1VJ) A0A.A2W.get();
            this.A00 = (C47922Km) A0A.AHo.get();
            this.A01 = (C26721Tf) A0A.A2V.get();
            this.A04 = C000200d.A00(A0A.AHp);
            this.A03 = AnonymousClass3MY.A0Z(A0A);
        }
    }

    public CompanionBootstrapActivity(int i) {
        this.A06 = false;
        AnonymousClass79Z.A00(this, 31);
    }

    public static void A03(CompanionBootstrapActivity companionBootstrapActivity, int i) {
        boolean A022 = AnonymousClass112.A02();
        ProgressBar progressBar = companionBootstrapActivity.A05;
        if (A022) {
            progressBar.setProgress(i, true);
            return;
        }
        int[] A1W = C108945cZ.A1W();
        A1W[0] = progressBar.getProgress();
        A1W[1] = i;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(progressBar, "progress", A1W);
        C108955ca.A1A(ofInt);
        ofInt.start();
    }

    public String A4b() {
        return "load_chats_from_primary_device";
    }

    public String A4c() {
        return "register_as_companion_loading";
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C26721Tf r0 = this.A01;
        C26721Tf.A00(r0).A07(this.A07);
        setContentView(2131624607);
        if (((C58492km) this.A04.get()).A01()) {
            AnonymousClass3MX.A0I(this, 2131431374).setImageResource(2131232046);
        }
        this.A05 = (ProgressBar) findViewById(2131434190);
        A03(this, (this.A00.A0A.get() * 100) / 3);
        this.A00.registerObserver(this.A08);
    }

    public void onDestroy() {
        super.onDestroy();
        C26721Tf r0 = this.A01;
        C26721Tf.A00(r0).A08(this.A07);
        this.A00.unregisterObserver(this.A08);
    }

    public CompanionBootstrapActivity() {
        this(0);
        this.A07 = new C116395xC(this, 0);
        this.A08 = new C125746bc(this);
    }
}
