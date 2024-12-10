package com.whatsapp.settings;

import X.A9B;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass18K;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass5LX;
import X.AnonymousClass5LY;
import X.AnonymousClass5P9;
import X.C003401n;
import X.C18070vi;
import X.C18100vl;
import X.C191519mj;
import X.C30391dr;
import X.C72473Md;
import X.C72483Me;
import X.C91034f2;
import X.C99274sY;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;

public final class SettingsPasskeys extends AnonymousClass1FY {
    public int A00;
    public AnonymousClass18K A01;
    public boolean A02;
    public final C18100vl A03;

    public SettingsPasskeys() {
        this(0);
        this.A03 = C99274sY.A00(new AnonymousClass5LY(this), new AnonymousClass5LX(this), new AnonymousClass5P9(this), AnonymousClass3MW.A15(SettingsPasskeysViewModel.class));
    }

    public Dialog onCreateDialog(int i) {
        if (i == 1) {
            ProgressDialog A032 = A9B.A03(this, getString(2131894984));
            C18070vi.A0b(A032);
            return A032;
        }
        Dialog onCreateDialog = super.onCreateDialog(i);
        C18070vi.A0X(onCreateDialog);
        return onCreateDialog;
    }

    public void A2y() {
        if (!this.A02) {
            this.A02 = true;
            AnonymousClass10E A0L = C72473Md.A0L(this);
            C72483Me.A0q(A0L, this);
            AnonymousClass10G r1 = A0L.A00;
            AnonymousClass1FB.A0K(A0L, r1, this, r1.A45);
            AnonymousClass1FB.A0L(A0L, r1, this, r1.A5A);
            this.A01 = AnonymousClass3Ma.A0g(A0L);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A00 = getIntent().getIntExtra("passkey_creation_source", 0);
        C18100vl r3 = this.A03;
        SettingsPasskeysViewModel settingsPasskeysViewModel = (SettingsPasskeysViewModel) r3.getValue();
        settingsPasskeysViewModel.A00 = settingsPasskeysViewModel.A01.BGc(this.A00);
        setContentView(2131624106);
        AnonymousClass3MX.A1Q(new SettingsPasskeys$initializeViews$1(this, (C30391dr) null), AnonymousClass3MZ.A0H(this));
        C003401n supportActionBar = getSupportActionBar();
        C72473Md.A16(supportActionBar);
        supportActionBar.A0M(2131895957);
        C191519mj r2 = ((SettingsPasskeysViewModel) r3.getValue()).A00;
        if (r2 != null) {
            r2.A00((String) null, (Throwable) null, 20);
        } else {
            C18070vi.A11("logger");
            throw null;
        }
    }

    public SettingsPasskeys(int i) {
        this.A02 = false;
        C91034f2.A00(this, 19);
    }
}
