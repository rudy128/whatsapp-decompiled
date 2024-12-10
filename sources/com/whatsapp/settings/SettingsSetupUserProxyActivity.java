package com.whatsapp.settings;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass48E;
import X.AnonymousClass4HR;
import X.AnonymousClass5PC;
import X.AnonymousClass5U9;
import X.C103665Le;
import X.C103675Lf;
import X.C17880vN;
import X.C18070vi;
import X.C18100vl;
import X.C72453Mb;
import X.C72473Md;
import X.C72483Me;
import X.C73173Rg;
import X.C88074Yf;
import X.C89974dK;
import X.C91034f2;
import X.C91634g0;
import X.C99274sY;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.whatsapp.WaTextView;
import com.whatsapp.wds.components.list.header.WDSSectionHeader;

public final class SettingsSetupUserProxyActivity extends AnonymousClass1FY {
    public View A00;
    public TextInputLayout A01;
    public WaTextView A02;
    public WaTextView A03;
    public boolean A04;
    public final C18100vl A05;

    public SettingsSetupUserProxyActivity() {
        this(0);
        this.A05 = C99274sY.A00(new C103675Lf(this), new C103665Le(this), new AnonymousClass5PC(this), AnonymousClass3MW.A15(SettingsSetupUserProxyViewModel.class));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0019, code lost:
        if (r0.equals(r1) == false) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(com.whatsapp.settings.SettingsSetupUserProxyActivity r4) {
        /*
            java.lang.Class<com.whatsapp.settings.SettingsUserProxyActivity> r0 = com.whatsapp.settings.SettingsUserProxyActivity.class
            android.content.Intent r2 = new android.content.Intent
            r2.<init>(r4, r0)
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r3 = "source"
            java.lang.String r0 = r0.getStringExtra(r3)
            if (r0 == 0) goto L_0x001b
            java.lang.String r1 = "deeplink"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x001c
        L_0x001b:
            r1 = 0
        L_0x001c:
            r2.putExtra(r3, r1)
            X.0vl r0 = r4.A05
            java.lang.Object r0 = r0.getValue()
            com.whatsapp.settings.SettingsSetupUserProxyViewModel r0 = (com.whatsapp.settings.SettingsSetupUserProxyViewModel) r0
            X.4Yf r1 = r0.A00
            X.4Yf r0 = r0.A01
            boolean r0 = X.C18070vi.A18(r1, r0)
            r1 = r0 ^ 1
            java.lang.String r0 = "intent_proxy_has_changed"
            r2.putExtra(r0, r1)
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r1 = r0.getStringExtra(r3)
            if (r1 == 0) goto L_0x004f
            java.lang.String r0 = "deeplink"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004f
            r4.startActivity(r2)
        L_0x004b:
            r4.finish()
            return
        L_0x004f:
            r0 = -1
            r4.setResult(r0, r2)
            goto L_0x004b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.settings.SettingsSetupUserProxyActivity.A03(com.whatsapp.settings.SettingsSetupUserProxyActivity):void");
    }

    public void A2y() {
        if (!this.A04) {
            this.A04 = true;
            AnonymousClass10E A0L = C72473Md.A0L(this);
            C72483Me.A0q(A0L, this);
            AnonymousClass10G r1 = A0L.A00;
            AnonymousClass1FB.A0K(A0L, r1, this, r1.A45);
            AnonymousClass1FB.A0L(A0L, r1, this, r1.A5A);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(2131894825);
        setContentView(2131624108);
        boolean A1T = C72473Md.A1T(this);
        View findViewById = findViewById(2131433989);
        if (findViewById != null) {
            if (findViewById instanceof ViewStub) {
                ViewStub viewStub = (ViewStub) findViewById;
                int i = 2131624109;
                if (AnonymousClass3MX.A1U(this)) {
                    i = 2131627597;
                }
                findViewById = AnonymousClass3MY.A0G(viewStub, i);
            }
            if (findViewById instanceof WDSSectionHeader) {
                ((WDSSectionHeader) findViewById).setHeaderText(2131894830);
            }
        }
        this.A01 = (TextInputLayout) AnonymousClass3MY.A0H(this, 2131434218);
        View findViewById2 = findViewById(2131429053);
        View findViewById3 = findViewById(2131432404);
        TextView A0E = C17880vN.A0E(findViewById2, 2131434223);
        this.A02 = C72453Mb.A0g(findViewById2, 2131434222);
        A0E.setText(2131894828);
        TextView A0E2 = C17880vN.A0E(findViewById3, 2131434223);
        this.A03 = C72453Mb.A0g(findViewById3, 2131434222);
        A0E2.setText(2131894829);
        C89974dK.A00(findViewById2, this, 2);
        C89974dK.A00(findViewById3, this, 3);
        this.A00 = AnonymousClass3MY.A0H(this, 2131434796);
        C18100vl r3 = this.A05;
        SettingsSetupUserProxyViewModel settingsSetupUserProxyViewModel = (SettingsSetupUserProxyViewModel) r3.getValue();
        Intent intent = getIntent();
        C18070vi.A0X(intent);
        C88074Yf A002 = AnonymousClass4HR.A00(C72453Mb.A0x(intent, "intent_host_name"), intent.getIntExtra("intent_chat_port", 443), intent.getIntExtra("intent_media_port", 587), intent.getBooleanExtra("intent_use_tls", A1T));
        settingsSetupUserProxyViewModel.A00 = A002;
        SettingsSetupUserProxyViewModel.A00(A002, settingsSetupUserProxyViewModel);
        TextInputLayout textInputLayout = this.A01;
        if (textInputLayout == null) {
            C18070vi.A11("proxyInputEditText");
            throw null;
        }
        EditText editText = textInputLayout.A0B;
        if (editText != null) {
            AnonymousClass48E.A00(editText, this, 15);
        }
        BVe().A09(new C73173Rg(this, 6), this);
        C91634g0.A00(this, ((SettingsSetupUserProxyViewModel) r3.getValue()).A02, new AnonymousClass5U9(this), 26);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (C72453Mb.A0B(menuItem) == 16908332) {
            A03(this);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public SettingsSetupUserProxyActivity(int i) {
        this.A04 = false;
        C91034f2.A00(this, 23);
    }
}
