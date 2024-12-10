package com.whatsapp.account.delete;

import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1DT;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1LU;
import X.AnonymousClass1QO;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3NL;
import X.AnonymousClass4aX;
import X.C000200d;
import X.C108755cF;
import X.C17880vN;
import X.C17960vV;
import X.C18070vi;
import X.C19880zA;
import X.C221618v;
import X.C25011Mn;
import X.C33841jT;
import X.C37191p7;
import X.C41361wE;
import X.C72293Lj;
import X.C72453Mb;
import X.C72473Md;
import X.C72483Me;
import X.C825248h;
import X.C85034Lv;
import X.C90994ey;
import X.C96984oj;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.whatsapp.phonematching.ConnectionUnavailableDialogFragment;
import com.whatsapp.phonematching.Hilt_ConnectionProgressDialogFragment;

public class DeleteAccountActivity extends AnonymousClass1FY implements C108755cF {
    public C19880zA A00;
    public AnonymousClass1LU A01;
    public C25011Mn A02;
    public AnonymousClass1QO A03;
    public C85034Lv A04;
    public C33841jT A05;
    public AnonymousClass00H A06;
    public AnonymousClass00H A07;
    public boolean A08;
    public final AnonymousClass1DT A09;
    public final C72293Lj A0A;

    public DeleteAccountActivity() {
        this(0);
        this.A07 = C221618v.A00(C37191p7.class);
        this.A09 = AnonymousClass3MW.A0L();
        this.A0A = new C96984oj(this, 0);
    }

    public void A2y() {
        if (!this.A08) {
            this.A08 = true;
            AnonymousClass10E A0L = C72473Md.A0L(this);
            C72483Me.A0q(A0L, this);
            AnonymousClass10G r1 = A0L.A00;
            AnonymousClass1FB.A0K(A0L, r1, this, r1.A45);
            AnonymousClass1FB.A0L(A0L, r1, this, r1.A5A);
            this.A01 = AnonymousClass3MY.A0Z(A0L);
            this.A02 = AnonymousClass3MZ.A0y(A0L);
            this.A06 = C000200d.A00(A0L.A7C);
            this.A05 = (C33841jT) A0L.A9T.get();
            this.A03 = AnonymousClass3Ma.A0q(A0L);
            this.A00 = (C19880zA) A0L.A7k.get();
        }
    }

    public void Bxc() {
        A3q(new Intent(this, DeleteAccountFeedback.class), true);
    }

    public void CE1(C85034Lv r4) {
        C72293Lj r1 = this.A0A;
        C18070vi.A0d(r1, 0);
        ((C37191p7) this.A07.get()).A00.add(r1);
        this.A04 = r4;
    }

    public boolean CHU(String str, String str2) {
        return this.A02.A06(str, str2);
    }

    public void CQE() {
        C72293Lj r1 = this.A0A;
        C18070vi.A0d(r1, 0);
        ((C37191p7) this.A07.get()).A00.remove(r1);
        this.A04 = null;
    }

    public void BIv() {
        DialogFragment dialogFragment = (DialogFragment) getSupportFragmentManager().A0Q("PROGRESS");
        if (dialogFragment != null) {
            dialogFragment.A29();
        }
    }

    public void Bpm() {
        Bundle A0D = C17880vN.A0D();
        ConnectionUnavailableDialogFragment connectionUnavailableDialogFragment = new ConnectionUnavailableDialogFragment();
        connectionUnavailableDialogFragment.A1R(A0D);
        connectionUnavailableDialogFragment.A2C(getSupportFragmentManager(), "CONNECTION ERROR");
    }

    public void Byf() {
        BhQ(2131889268);
    }

    public void CN9() {
        Bundle A0D = C17880vN.A0D();
        Hilt_ConnectionProgressDialogFragment hilt_ConnectionProgressDialogFragment = new Hilt_ConnectionProgressDialogFragment();
        hilt_ConnectionProgressDialogFragment.A1R(A0D);
        hilt_ConnectionProgressDialogFragment.A2C(getSupportFragmentManager(), "PROGRESS");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131625063);
        setTitle(2131895841);
        C72473Md.A18(this);
        ImageView A0I = AnonymousClass3MX.A0I(this, 2131428972);
        AnonymousClass3NL.A01(this, A0I, this.A00, 2131232277);
        AnonymousClass4aX.A0D(A0I, C72483Me.A03(this));
        AnonymousClass3MX.A0L(this, 2131429874).setText(2131889259);
        AnonymousClass3MZ.A1N(findViewById(2131429870), this, 37);
        C72483Me.A0d(this, AnonymousClass3MX.A0L(this, 2131429909), getString(2131889260));
        C72483Me.A0d(this, AnonymousClass3MX.A0L(this, 2131429892), getString(2131889261));
        C72483Me.A0d(this, AnonymousClass3MX.A0L(this, 2131429910), getString(2131889262));
        C72483Me.A0d(this, AnonymousClass3MX.A0L(this, 2131429888), getString(2131889263));
        C72483Me.A0d(this, AnonymousClass3MX.A0L(this, 2131429901), getString(2131889264));
        if (!C41361wE.A09(getApplicationContext()) || this.A0A.A0f() == null) {
            AnonymousClass3MX.A1H(this, 2131429888, 8);
        }
        if (!this.A03.A03() && !this.A03.A02()) {
            AnonymousClass3MX.A1H(this, 2131429901, 8);
        } else if (this.A03.A02()) {
            C72483Me.A0d(this, AnonymousClass3MX.A0L(this, 2131429901), getString(2131889265));
        }
        boolean A1X = C72453Mb.A1X(this.A06);
        View findViewById = findViewById(2131429883);
        if (A1X) {
            C72483Me.A0d(this, (TextView) findViewById, getString(2131889266));
        } else {
            findViewById.setVisibility(8);
        }
        Fragment A0O = getSupportFragmentManager().A0O(2131429875);
        C17960vV.A07(A0O);
        C825248h.A00(findViewById(2131429878), this, A0O, 4);
    }

    public DeleteAccountActivity(int i) {
        this.A08 = false;
        C90994ey.A00(this, 3);
    }
}
