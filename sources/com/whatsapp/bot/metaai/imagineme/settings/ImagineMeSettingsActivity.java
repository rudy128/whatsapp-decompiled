package com.whatsapp.bot.metaai.imagineme.settings;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1DF;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1K1;
import X.AnonymousClass1LU;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3NL;
import X.AnonymousClass73Z;
import X.AnonymousClass782;
import X.AnonymousClass79Z;
import X.AnonymousClass7AT;
import X.AnonymousClass7yE;
import X.AnonymousClass7yF;
import X.AnonymousClass7yG;
import X.AnonymousClass7yH;
import X.AnonymousClass7yI;
import X.AnonymousClass7yJ;
import X.AnonymousClass7yK;
import X.C108955ca;
import X.C109005cf;
import X.C110885hR;
import X.C148627hk;
import X.C148637hl;
import X.C148647hm;
import X.C148657hn;
import X.C148667ho;
import X.C155237sQ;
import X.C18100vl;
import X.C36401np;
import X.C36531o3;
import X.C39401t1;
import X.C39411t2;
import X.C99274sY;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;

public final class ImagineMeSettingsActivity extends AnonymousClass1FY {
    public AnonymousClass73Z A00;
    public C36531o3 A01;
    public AnonymousClass1LU A02;
    public C36401np A03;
    public boolean A04;
    public final C18100vl A05;
    public final C18100vl A06;
    public final C18100vl A07;
    public final C18100vl A08;

    public void A2y() {
        if (!this.A04) {
            this.A04 = true;
            AnonymousClass1K1 A0K = C108955ca.A0K(this);
            AnonymousClass10E A0A = C109005cf.A0A(A0K, this);
            AnonymousClass1FB.A0M(A0A, this);
            AnonymousClass10G r1 = A0A.A00;
            C109005cf.A0d(A0A, r1, this);
            C109005cf.A0e(A0A, r1, this, r1.A5A);
            this.A00 = (AnonymousClass73Z) A0K.A0E.get();
            this.A01 = AnonymousClass3Ma.A0T(A0A);
            this.A03 = AnonymousClass3MY.A0e(r1);
            this.A02 = AnonymousClass3MY.A0Z(A0A);
        }
    }

    public ImagineMeSettingsActivity(int i) {
        this.A04 = false;
        AnonymousClass79Z.A00(this, 23);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 2) {
            ImagineMeSettingsViewModel.A00((ImagineMeSettingsViewModel) this.A07.getValue());
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131624058);
        Toolbar A0F = AnonymousClass3Ma.A0F(this);
        AnonymousClass3NL.A02(this, A0F, this.A00, 2131231675);
        A0F.setBackgroundResource(C108955ca.A02(this));
        A0F.setNavigationOnClickListener(new AnonymousClass782(this, 35));
        setSupportActionBar(A0F);
        AnonymousClass3MZ.A1H(C110885hR.A0A(this, 2131431574), this, 33);
        AnonymousClass3MX.A0v(this.A05).A05(new AnonymousClass782(this, 34));
        C18100vl r4 = this.A06;
        Rect rect = C39401t1.A0A;
        ((WaTextView) r4.getValue()).setAccessibilityHelper(new C39411t2((TextView) r4.getValue(), this.A08));
        AnonymousClass3Ma.A1L(this.A0E, (TextEmojiLabel) r4.getValue());
        C18100vl r3 = this.A07;
        ImagineMeSettingsViewModel.A00((ImagineMeSettingsViewModel) AnonymousClass7AT.A00(this, ((ImagineMeSettingsViewModel) AnonymousClass7AT.A00(this, ((ImagineMeSettingsViewModel) AnonymousClass7AT.A00(this, ((ImagineMeSettingsViewModel) AnonymousClass7AT.A00(this, ((ImagineMeSettingsViewModel) AnonymousClass7AT.A00(this, ((ImagineMeSettingsViewModel) AnonymousClass7AT.A00(this, ((ImagineMeSettingsViewModel) AnonymousClass7AT.A00(this, ((ImagineMeSettingsViewModel) r3.getValue()).A06, r3, new AnonymousClass7yE(this), 11)).A01, r3, new AnonymousClass7yF(this), 11)).A02, r3, new AnonymousClass7yG(this), 11)).A05, r3, new AnonymousClass7yH(this), 11)).A04, r3, new AnonymousClass7yI(this), 11)).A03, r3, new AnonymousClass7yJ(this), 11)).A00, r3, new AnonymousClass7yK(this), 11));
    }

    public ImagineMeSettingsActivity() {
        this(0);
        this.A07 = C99274sY.A00(new C148657hn(this), new C148647hm(this), new C155237sQ(this), AnonymousClass3MW.A15(ImagineMeSettingsViewModel.class));
        this.A08 = AnonymousClass1DF.A01(new C148667ho(this));
        this.A05 = AnonymousClass1DF.A01(new C148627hk(this));
        this.A06 = AnonymousClass1DF.A01(new C148637hl(this));
    }
}
