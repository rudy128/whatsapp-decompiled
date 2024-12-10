package com.whatsapp.payments.ui;

import X.A19;
import X.A7W;
import X.AnonymousClass00R;
import X.AnonymousClass112;
import X.AnonymousClass19K;
import X.AnonymousClass1HF;
import X.AnonymousClass1LU;
import X.AnonymousClass1QS;
import X.AnonymousClass1RK;
import X.AnonymousClass1W6;
import X.AnonymousClass1YF;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass7AS;
import X.AnonymousClass7BN;
import X.AnonymousClass7Pq;
import X.AnonymousClass93T;
import X.C03180Gx;
import X.C04350Mv;
import X.C108955ca;
import X.C108975cc;
import X.C110125ey;
import X.C130516jY;
import X.C1412875a;
import X.C145937Ne;
import X.C156687ul;
import X.C156697um;
import X.C1583480i;
import X.C1605889b;
import X.C162248Jv;
import X.C17880vN;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C196269uj;
import X.C22941Dw;
import X.C26215Cuu;
import X.C29431cG;
import X.C72453Mb;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.AppBarLayout;
import com.whatsapp.WaImageView;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.viewmodel.MessageWithLinkViewModel;
import com.whatsapp.webview.util.ScheduledCookiesCleanupWorker;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public class MessageWithLinkWebViewActivity extends AnonymousClass93T {
    public AnonymousClass1RK A00;
    public C18030ve A01;
    public AnonymousClass1LU A02;
    public AnonymousClass1QS A03;
    public MessageWithLinkViewModel A04;
    public A19 A05;
    public AnonymousClass1W6 A06;
    public C1605889b A07;
    public AnonymousClass19K A08;
    public Integer A09;
    public boolean A0A;
    public int A0B = 4;
    public UserJid A0C;
    public C1412875a A0D;
    public String A0E = "link_to_webview";
    public String A0F;
    public boolean A0G;

    public void A4d() {
        String str;
        if (A4m()) {
            Looper myLooper = Looper.myLooper();
            UserJid userJid = this.A0C;
            C1412875a r2 = this.A0D;
            if (r2 == null) {
                if (myLooper != null && userJid != null) {
                    AnonymousClass1LU r5 = this.A02;
                    if (r5 != null) {
                        AnonymousClass1QS r7 = this.A03;
                        if (r7 != null) {
                            r2 = new C1412875a(this, myLooper, r5, userJid, r7);
                            this.A0D = r2;
                        } else {
                            str = "paymentsManager";
                        }
                    } else {
                        str = "waIntent";
                    }
                    C18070vi.A11(str);
                    throw null;
                }
                return;
            }
            C110125ey r1 = this.A03;
            C18070vi.A0z(r1, "null cannot be cast to non-null type com.facebook.secure.securewebview.SecureWebView");
            C18070vi.A0d(r1, 0);
            C1412875a.A03(new C156697um(r1, r2));
        }
    }

    public void A4f(int i, Intent intent) {
        if (i == 0) {
            A19 a19 = this.A05;
            if (a19 != null) {
                String str = this.A0E;
                int i2 = this.A0B;
                a19.A01(this.A0C, str, this.A0F, 1, i2);
            } else {
                C18070vi.A11("messageWithLinkLogging");
                throw null;
            }
        }
        super.A4f(i, intent);
    }

    public void A4h(TextView textView, TextView textView2, Toolbar toolbar, AppBarLayout appBarLayout, WaImageView waImageView) {
        C18070vi.A0d(appBarLayout, 0);
        C18070vi.A0s(toolbar, waImageView, textView, textView2);
        super.A4h(textView, textView2, toolbar, appBarLayout, waImageView);
        AnonymousClass3MY.A0H(this, 2131431505).setVisibility(8);
        ((TextView) AnonymousClass3MY.A0H(this, 2131437048)).setGravity(17);
        ((TextView) AnonymousClass3MY.A0H(this, 2131437049)).setGravity(17);
        appBarLayout.A03(new AnonymousClass7BN(appBarLayout, this));
    }

    public boolean A4j() {
        return false;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        C18070vi.A0d(menu, 0);
        boolean onCreateOptionsMenu = super.onCreateOptionsMenu(menu);
        if (this.A0G) {
            C108975cc.A0p(menu, 2131432657, 2131895214);
        }
        return onCreateOptionsMenu;
    }

    public void setContentView(View view) {
        C18070vi.A0d(view, 0);
        super.setContentView(view);
        C18030ve r2 = this.A01;
        if (r2 == null) {
            C18070vi.A11("abProp");
            throw null;
        } else if (C18020vd.A05(C18040vf.A02, r2, 12733) && AnonymousClass112.A03()) {
            AnonymousClass1HF.A0c(view, 1);
        }
    }

    public void A4e(int i) {
        if (C18020vd.A05(C18040vf.A02, this.A0E, 12180)) {
            A19 a19 = this.A05;
            if (a19 != null) {
                String str = this.A0E;
                int i2 = this.A0B;
                a19.A01(this.A0C, str, this.A0F, i, i2);
                return;
            }
            C18070vi.A11("messageWithLinkLogging");
            throw null;
        }
    }

    public boolean A4m() {
        return C18020vd.A05(C18040vf.A02, this.A0E, 3939);
    }

    public boolean Bfd() {
        return !C18020vd.A05(C18040vf.A02, this.A0E, 12019);
    }

    public C130516jY CCt() {
        boolean A052 = C18020vd.A05(C18040vf.A02, this.A0E, 10466);
        C130516jY CCt = super.CCt();
        CCt.A00 = C72453Mb.A03(A052 ? 1 : 0);
        return CCt;
    }

    public void A4g(WebView webView) {
        if (A4m() && (webView instanceof C110125ey)) {
            ((C110125ey) webView).A06.A02 = true;
        }
        super.A4g(webView);
    }

    public List BTe() {
        List BTe = super.BTe();
        C1605889b r0 = this.A07;
        if (r0 != null) {
            return C29431cG.A0l(r0, BTe);
        }
        C18070vi.A11("themeMetadataReaderJsInjector");
        throw null;
    }

    public void finish() {
        super.finish();
        if (Build.VERSION.SDK_INT >= 34) {
            overrideActivityTransition(1, 0, 2130772059);
        } else {
            overridePendingTransition(0, 2130772059);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        C1412875a r3;
        super.onActivityResult(i, i2, intent);
        if (i == 1000 && (r3 = this.A0D) != null) {
            String str = "FAILURE";
            if (intent == null) {
                C1412875a.A02(r3, str, (JSONObject) null);
                return;
            }
            if (i2 == -1) {
                str = "SUCCESS";
            } else if (i2 == 0) {
                str = "CANCELED";
            }
            C1412875a.A03(new C156687ul(r3, C17880vN.A15().put("responseData", C17880vN.A15().put("result", str)).put("method", intent.getStringExtra("method")).put("callbackID", intent.getStringExtra("callbackID"))));
        }
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        C18030ve r2 = this.A01;
        if (r2 != null) {
            if (C18020vd.A05(C18040vf.A02, r2, 11373)) {
                C03180Gx A012 = new C04350Mv().A01();
                Uri A013 = C26215Cuu.A01(getIntent().getStringExtra("webview_url"));
                Intent intent = A012.A00;
                intent.setData(A013);
                startActivity(intent, (Bundle) null);
                finish();
            }
            if (Build.VERSION.SDK_INT >= 34) {
                overrideActivityTransition(0, 2130772055, 0);
            } else {
                overridePendingTransition(2130772055, 0);
            }
            String stringExtra = getIntent().getStringExtra("webview_receiver_jid");
            if (stringExtra != null && (!AnonymousClass1YF.A0T(stringExtra))) {
                this.A0C = C22941Dw.A02(stringExtra);
            }
            this.A04 = (MessageWithLinkViewModel) AnonymousClass3MW.A0N(this).A00(MessageWithLinkViewModel.class);
            String stringExtra2 = getIntent().getStringExtra("message_cta_type");
            if (stringExtra2 == null) {
                stringExtra2 = "link_to_webview";
            }
            this.A0E = stringExtra2;
            this.A0B = C72453Mb.A06(stringExtra2.equals("marketing_msg_webview") ? 1 : 0);
            String stringExtra3 = getIntent().getStringExtra("webview_message_template_id");
            this.A0F = stringExtra3;
            A19 a19 = this.A05;
            if (a19 != null) {
                a19.A01(this.A0C, this.A0E, stringExtra3, 4, this.A0B);
                String stringExtra4 = getIntent().getStringExtra("message_id");
                String A0r = C108955ca.A0r(this, "webview_receiver_jid");
                boolean booleanExtra = getIntent().getBooleanExtra("report_menu_option", false);
                this.A0G = booleanExtra;
                if (!booleanExtra || stringExtra4 == null || A0r == null) {
                    this.A0G = false;
                } else {
                    this.A05.CGF(new AnonymousClass7Pq(this, stringExtra4, A0r, 17));
                }
                AnonymousClass19K r0 = this.A08;
                if (r0 != null) {
                    ((A7W) r0.get()).A0A("schedule_cookies_cleanup_worker_name");
                    AnonymousClass7AS.A00(this, A4b().A08, new C1583480i(this), 6);
                    return;
                }
                str = "workManagerLazy";
            } else {
                str = "messageWithLinkLogging";
            }
        } else {
            str = "abProp";
        }
        C18070vi.A11(str);
        throw null;
    }

    public void onDestroy() {
        super.onDestroy();
        C196269uj r3 = new C196269uj(ScheduledCookiesCleanupWorker.class);
        r3.A02(24, TimeUnit.HOURS);
        C162248Jv r32 = (C162248Jv) r3.A00();
        AnonymousClass19K r0 = this.A08;
        if (r0 != null) {
            ((A7W) r0.get()).A07(r32, AnonymousClass00R.A00, "schedule_cookies_cleanup_worker_name");
        } else {
            C18070vi.A11("workManagerLazy");
            throw null;
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (C72453Mb.A0B(menuItem) != 2131432657) {
            return super.onOptionsItemSelected(menuItem);
        }
        UserJid A022 = C22941Dw.A02(getIntent().getStringExtra("webview_receiver_jid"));
        if (A022 == null) {
            return true;
        }
        AnonymousClass1RK r0 = this.A00;
        if (r0 != null) {
            r0.A04().A09(new C145937Ne(A022, this, 24));
            return false;
        }
        C18070vi.A11("companionDeviceManager");
        throw null;
    }
}
