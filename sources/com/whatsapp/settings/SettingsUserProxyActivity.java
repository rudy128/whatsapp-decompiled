package com.whatsapp.settings;

import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass11C;
import X.AnonymousClass1EG;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1K1;
import X.AnonymousClass1KB;
import X.AnonymousClass1L9;
import X.AnonymousClass1YL;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.C110885hR;
import X.C17880vN;
import X.C17890vO;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C24261Jm;
import X.C26181Rd;
import X.C26302CxJ;
import X.C28281Zt;
import X.C36721oM;
import X.C72453Mb;
import X.C72473Md;
import X.C72483Me;
import X.C88074Yf;
import X.C88214Yt;
import X.C89974dK;
import X.C90274do;
import X.C90874em;
import X.C91034f2;
import X.C91614fy;
import X.C92244gz;
import X.C98334qx;
import X.C98844ro;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewStub;
import androidx.appcompat.widget.SwitchCompat;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;
import java.util.concurrent.Executor;

public class SettingsUserProxyActivity extends AnonymousClass1FY implements C26181Rd {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public SwitchCompat A05;
    public WaTextView A06;
    public WaTextView A07;
    public WaTextView A08;
    public C36721oM A09;
    public SettingsUserProxyViewModel A0A;
    public boolean A0B;

    public SettingsUserProxyActivity() {
        this(0);
    }

    private void A03(Intent intent) {
        if (intent == null || intent.getBooleanExtra("intent_proxy_has_changed", true)) {
            this.A0A.A0V();
            SettingsUserProxyViewModel settingsUserProxyViewModel = this.A0A;
            if (settingsUserProxyViewModel.A0X() && settingsUserProxyViewModel.A02 != null) {
                SettingsUserProxyViewModel.A03(settingsUserProxyViewModel);
            }
            if (!this.A05.isChecked()) {
                this.A05.setChecked(true);
            }
        }
    }

    public /* synthetic */ void BvR() {
    }

    public /* synthetic */ void BvS() {
    }

    public /* synthetic */ void BvT() {
    }

    public /* synthetic */ void BvU() {
    }

    public /* synthetic */ void BvV() {
    }

    public static void A0Q(SettingsUserProxyActivity settingsUserProxyActivity, boolean z) {
        int i;
        int i2;
        if (settingsUserProxyActivity.A02 != 0 && settingsUserProxyActivity.A00 != 0 && settingsUserProxyActivity.A03 != 0 && !settingsUserProxyActivity.A0A.A0Y()) {
            SpannableString spannableString = new SpannableString(settingsUserProxyActivity.A07.getText());
            SpannableString spannableString2 = new SpannableString(settingsUserProxyActivity.A06.getText());
            if (z) {
                i = settingsUserProxyActivity.A03;
            } else {
                i = settingsUserProxyActivity.A00;
            }
            spannableString.setSpan(new ForegroundColorSpan(i), 0, spannableString.length(), 0);
            if (z) {
                i2 = settingsUserProxyActivity.A02;
            } else {
                i2 = settingsUserProxyActivity.A00;
            }
            spannableString2.setSpan(new ForegroundColorSpan(i2), 0, spannableString2.length(), 0);
            settingsUserProxyActivity.A07.setText(spannableString);
            settingsUserProxyActivity.A06.setText(spannableString2);
        }
    }

    public void A2y() {
        if (!this.A0B) {
            this.A0B = true;
            AnonymousClass1K1 A0K = C72473Md.A0K(this);
            AnonymousClass10E r2 = A0K.AAQ;
            C72483Me.A0q(r2, this);
            AnonymousClass10G r1 = r2.A00;
            AnonymousClass1FB.A0K(r2, r1, this, r1.A45);
            AnonymousClass1FB.A0L(r2, r1, this, r1.A5A);
            this.A09 = (C36721oM) A0K.A0m.get();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A0A = (SettingsUserProxyViewModel) AnonymousClass3MW.A0N(this).A00(SettingsUserProxyViewModel.class);
        setTitle(2131894827);
        setContentView(2131626531);
        boolean A1T = C72473Md.A1T(this);
        this.A00 = C28281Zt.A00(this, 2130971172, AnonymousClass1YL.A00(this, 2130971190, 2131102526));
        this.A03 = C28281Zt.A00(this, 2130971174, AnonymousClass1YL.A00(this, 2130971198, 2131102533));
        this.A02 = C28281Zt.A00(this, 2130971170, AnonymousClass1YL.A00(this, 2130971197, 2131102532));
        this.A04 = C28281Zt.A00(this, 2130971170, 2131102296);
        this.A01 = C28281Zt.A00(this, 2130971170, 2131102295);
        SwitchCompat switchCompat = (SwitchCompat) findViewById(2131434225);
        this.A05 = switchCompat;
        switchCompat.setChecked(this.A0A.A0X());
        C90874em.A00(this.A05, this, 22);
        if (C18020vd.A05(C18040vf.A02, this.A0E, 8926)) {
            C36721oM r6 = this.A09;
            String string = getString(2131894820);
            TextEmojiLabel A0V = AnonymousClass3MX.A0V(this.A00, 2131434219);
            C18070vi.A0f(string, 0, A0V);
            r6.A00(this, A0V, string, "learn-more", "whatsapp-proxy");
        } else {
            C18030ve r13 = this.A0E;
            AnonymousClass1KB r10 = this.A05;
            AnonymousClass1L9 r9 = this.A01;
            AnonymousClass11C r12 = this.A08;
            C26302CxJ.A0K(this, Uri.parse("https://faq.whatsapp.com/520504143274092"), r9, r10, AnonymousClass3MX.A0V(this.A00, 2131434219), r12, r13, getString(2131894820), "learn-more");
        }
        this.A07 = (WaTextView) C110885hR.A0A(this, 2131431821);
        View findViewById = findViewById(2131431822);
        C89974dK.A00(findViewById, this, 15);
        C90274do.A00(findViewById, this, 16);
        this.A06 = (WaTextView) C110885hR.A0A(this, 2131429363);
        ViewStub A0G = AnonymousClass3MX.A0G(this, 2131429362);
        A0G.setLayoutResource(2131625788);
        if (this.A0A.A0Y()) {
            this.A08 = (WaTextView) A0G.inflate();
        }
        int i = 8;
        findViewById(2131429364).setVisibility(C72453Mb.A01(this.A0A.A0Y() ? 1 : 0));
        View findViewById2 = findViewById(2131436645);
        if (this.A0A.A0Y()) {
            i = 0;
        }
        findViewById2.setVisibility(i);
        A0Q(this, this.A0A.A0X());
        this.A0A.A0V();
        SettingsUserProxyViewModel settingsUserProxyViewModel = this.A0A;
        AnonymousClass00H r3 = settingsUserProxyViewModel.A0F;
        if (AnonymousClass3MW.A0l(r3).A07()) {
            AnonymousClass00H r5 = settingsUserProxyViewModel.A0E;
            C92244gz r2 = (C92244gz) r5.get();
            Number number = (Number) r2.A03.A00();
            if (number == null) {
                number = Integer.valueOf(C17890vO.A00(C88214Yt.A00(r2.A05), "proxy_connection_status"));
            }
            settingsUserProxyViewModel.A00 = number.intValue();
            C92244gz r22 = (C92244gz) r5.get();
            Number number2 = (Number) r22.A04.A00();
            if (number2 == null) {
                number2 = Integer.valueOf(C17890vO.A00(C88214Yt.A00(r22.A05), "proxy_media_connection_status"));
            }
            settingsUserProxyViewModel.A01 = number2.intValue();
            SettingsUserProxyViewModel.A04(settingsUserProxyViewModel, r3, r3.get());
            C98844ro.A02(settingsUserProxyViewModel.A0C, settingsUserProxyViewModel, 31);
        }
        AnonymousClass00H r52 = settingsUserProxyViewModel.A0E;
        C98334qx r23 = new C98334qx(settingsUserProxyViewModel, 16);
        Executor executor = settingsUserProxyViewModel.A08.A05;
        ((C92244gz) r52.get()).A03.A03(r23, executor);
        ((C92244gz) r52.get()).A04.A03(new C98334qx(settingsUserProxyViewModel, 17), executor);
        SettingsUserProxyViewModel settingsUserProxyViewModel2 = this.A0A;
        settingsUserProxyViewModel2.A05.A0F(AnonymousClass3MW.A0l(settingsUserProxyViewModel2.A0F).A01());
        SettingsUserProxyViewModel settingsUserProxyViewModel3 = this.A0A;
        settingsUserProxyViewModel3.A0W(C17890vO.A00(C88214Yt.A00(settingsUserProxyViewModel3.A0F), "proxy_connection_status"), A1T);
        C91614fy.A00(this, this.A0A.A05, 29);
        C91614fy.A00(this, this.A0A.A06, 30);
        C91614fy.A00(this, this.A0A.A07, 31);
        if ("deeplink".equals(getIntent().getStringExtra("source"))) {
            A03(getIntent());
        }
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        if (menu != null && this.A0A.A0Y()) {
            MenuItem findItem = menu.findItem(2131432625);
            if (findItem == null) {
                findItem = AnonymousClass3MX.A07(menu, 2131432625, 2131899418).setIcon(C24261Jm.A00(this, 2131232296));
                findItem.setShowAsAction(1);
            }
            findItem.setVisible(!AnonymousClass1EG.A0H(this.A0A.A02));
        }
        return super.onCreateOptionsMenu(menu);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 10001) {
            A03(intent);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 2131432625) {
            C88074Yf A0T = this.A0A.A0T();
            Uri.Builder builder = new Uri.Builder();
            String str = A0T.A02;
            if (str == null) {
                str = A0T.A05;
            }
            Uri build = builder.scheme("https").authority("wa.me").path("proxy").appendQueryParameter("host", str).appendQueryParameter("chatPort", String.valueOf(A0T.A00)).appendQueryParameter("mediaPort", String.valueOf(A0T.A01)).appendQueryParameter("chatTLS", String.valueOf(A0T.A06)).build();
            if (build != null) {
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                intent.putExtra("android.intent.extra.SUBJECT", getString(2131894833));
                intent.putExtra("android.intent.extra.TEXT", C17880vN.A0q(this, build.toString(), AnonymousClass3MW.A1a(), 0, 2131894832));
                intent.addFlags(524288);
                startActivity(Intent.createChooser(intent, getString(2131896079)));
            }
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public void onResume() {
        super.onResume();
        if (!this.A05.isChecked() && this.A0A.A0Y() && AnonymousClass1EG.A0H(this.A0A.A02)) {
            this.A0A.A0V();
            this.A05.setChecked(true);
        }
    }

    public void onStop() {
        super.onStop();
        SettingsUserProxyViewModel settingsUserProxyViewModel = this.A0A;
        AnonymousClass00H r1 = settingsUserProxyViewModel.A0F;
        SettingsUserProxyViewModel.A04(settingsUserProxyViewModel, r1, r1.get());
        AnonymousClass3MW.A0l(r1).A04(settingsUserProxyViewModel.A02);
    }

    public SettingsUserProxyActivity(int i) {
        this.A0B = false;
        C91034f2.A00(this, 25);
    }
}
