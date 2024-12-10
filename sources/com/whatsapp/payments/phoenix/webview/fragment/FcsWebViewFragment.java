package com.whatsapp.payments.phoenix.webview.fragment;

import X.A2X;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass129;
import X.AnonymousClass1D6;
import X.AnonymousClass1D7;
import X.AnonymousClass1FL;
import X.AnonymousClass1YF;
import X.AnonymousClass3MW;
import X.AnonymousClass7NP;
import X.AnonymousClass7NQ;
import X.AnonymousClass7NS;
import X.B9Z;
import X.C108955ca;
import X.C108975cc;
import X.C108985cd;
import X.C110125ey;
import X.C114195qJ;
import X.C130516jY;
import X.C133646pF;
import X.C160948As;
import X.C17880vN;
import X.C17890vO;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C18460wS;
import X.C189549jQ;
import X.C19976A1m;
import X.C20129A8p;
import X.C20130A8q;
import X.C22579BDz;
import X.C29351c6;
import X.C72463Mc;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebResourceResponse;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.flows.phoenix.webview.FcsFlowsWebViewFragment;
import com.whatsapp.util.Log;
import com.whatsapp.webview.ui.WebViewWrapperView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FcsWebViewFragment extends Hilt_FcsWebViewFragment implements C160948As {
    public C110125ey A00;
    public C18030ve A01;
    public AnonymousClass129 A02;
    public AnonymousClass00H A03;
    public AnonymousClass00H A04;
    public AnonymousClass00H A05;
    public String A06;
    public int A07 = -1;
    public A2X A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public HashMap A0D;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        String str;
        C18070vi.A0d(layoutInflater, 0);
        View inflate = layoutInflater.inflate(2131625316, viewGroup, false);
        WebViewWrapperView webViewWrapperView = (WebViewWrapperView) C18070vi.A05(inflate, 2131437061);
        webViewWrapperView.setCustomOrCreateWebView((C110125ey) null);
        webViewWrapperView.setWebViewDelegate(this);
        this.A00 = webViewWrapperView.A02;
        String str2 = this.A06;
        if (str2 == null) {
            C18070vi.A11("launchURL");
            throw null;
        }
        Uri A0F = C108955ca.A0F(str2);
        HashMap hashMap = this.A0D;
        if (this instanceof FcsFlowsWebViewFragment) {
            FcsFlowsWebViewFragment fcsFlowsWebViewFragment = (FcsFlowsWebViewFragment) this;
            C18030ve r2 = fcsFlowsWebViewFragment.A01;
            if (r2 != null) {
                String A012 = C18020vd.A01(C18040vf.A02, r2, 5326);
                C18070vi.A0b(A012);
                List A0s = C108985cd.A0s(A012, 1);
                ArrayList A0D2 = C29351c6.A0D(A0s);
                Iterator it = A0s.iterator();
                while (it.hasNext()) {
                    A0D2.add(AnonymousClass1YF.A0I(C17880vN.A0v(it)));
                }
                if (!(A0D2 instanceof Collection) || !A0D2.isEmpty()) {
                    Iterator it2 = A0D2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        String A0v = C17880vN.A0v(it2);
                        String host = A0F.getHost();
                        if (host != null) {
                            if (host.equals(A0v)) {
                                break;
                            }
                            String A0Z = C17890vO.A0Z(A0v, AnonymousClass000.A10(), '.');
                            C18070vi.A0d(A0Z, 1);
                            if (host.endsWith(A0Z)) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (hashMap != null && !FcsFlowsWebViewFragment.A02(fcsFlowsWebViewFragment, hashMap)) {
                        Log.e("callback output payload doesn't have allowed types");
                        str = "phoenix-webview-payload-definition-error";
                        FcsFlowsWebViewFragment.A00(fcsFlowsWebViewFragment, str);
                        A05(AnonymousClass1D7.A0I(), false);
                        return inflate;
                    }
                }
                Log.e("Flows WebView cannot be loaded. Host not allowed.");
                str = "phoenix-webview-host-not-allowed-error";
                FcsFlowsWebViewFragment.A00(fcsFlowsWebViewFragment, str);
                A05(AnonymousClass1D7.A0I(), false);
                return inflate;
            }
            AnonymousClass3MW.A1A();
            throw null;
        }
        C110125ey r0 = this.A00;
        if (r0 != null) {
            r0.getSettings().setJavaScriptEnabled(true);
        }
        String str3 = this.A06;
        if (str3 == null) {
            C18070vi.A11("launchURL");
            throw null;
        }
        Uri A0F2 = C108955ca.A0F(str3);
        ArrayList A0z = C17880vN.A0z(4);
        List asList = Arrays.asList(new String[]{"https"});
        if (!asList.isEmpty()) {
            C133646pF A002 = C114195qJ.A00(A0F2, A0z, asList);
            C110125ey r02 = this.A00;
            if (r02 != null) {
                r02.A01 = A002;
            }
            CRT("");
            CRU("");
            String str4 = this.A06;
            if (str4 == null) {
                C18070vi.A11("launchURL");
                throw null;
            }
            A04(str4);
            return inflate;
        }
        throw AnonymousClass000.A0k("Cannot set 0 schemes");
    }

    public /* synthetic */ void C0Q(PermissionRequest permissionRequest) {
    }

    public /* synthetic */ void C0R() {
    }

    public void CAW(String str) {
    }

    private final void A04(String str) {
        Bundle bundle = this.A06;
        if (bundle == null || !bundle.getBoolean("use_post_request")) {
            C110125ey r0 = this.A00;
            if (r0 != null) {
                r0.loadUrl(str);
                return;
            }
            return;
        }
        C110125ey r1 = this.A00;
        if (r1 != null) {
            String str2 = this.A09;
            if (str2 == null) {
                C18070vi.A11("dataJson");
                throw null;
            } else {
                r1.postUrl(str, C108975cc.A1O(str2));
            }
        }
    }

    private final void A05(Map map, boolean z) {
        String str;
        C20129A8p a8p;
        C22579BDz bDz;
        CRT("");
        CRU("");
        if (this instanceof FcsFlowsWebViewFragment) {
            if (z) {
                AnonymousClass1D6[] r3 = new AnonymousClass1D6[3];
                r3[0] = AnonymousClass1D6.A01("action", A15().getString("next_action"));
                AnonymousClass1D6[] r4 = new AnonymousClass1D6[2];
                AnonymousClass1D6[] r8 = new AnonymousClass1D6[2];
                AnonymousClass1D6.A03(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, A15().getString("next_screen"), r8, 0);
                AnonymousClass1D6.A03(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "screen", r8, 1);
                AnonymousClass1D6.A03("next", AnonymousClass1D7.A0B(r8), r4, 0);
                AnonymousClass1D6.A03("data", map, r4, 1);
                AnonymousClass1D6.A03("action_payload", AnonymousClass1D7.A0B(r4), r3, 1);
                AnonymousClass1D6.A03("current_screen", A15().getString("current_screen"), r3, 2);
                map = AnonymousClass1D7.A0B(r3);
            } else {
                map = C108975cc.A0h("error", new C19976A1m(A15().getString("error_message"), (Map) null, -1));
            }
        }
        AnonymousClass1D6[] r2 = new AnonymousClass1D6[3];
        C72463Mc.A1H("resource_output", map, r2);
        C108985cd.A1G("status", Boolean.valueOf(z), r2);
        C72463Mc.A1I("callback_index", Integer.valueOf(this.A07), r2);
        LinkedHashMap A0B2 = AnonymousClass1D7.A0B(r2);
        AnonymousClass00H r0 = this.A04;
        if (r0 != null) {
            C189549jQ r1 = (C189549jQ) r0.get();
            String str2 = this.A0B;
            if (str2 == null) {
                str = "fdsManagerId";
            } else {
                C20130A8q A002 = r1.A00(str2);
                if (A002 != null && (a8p = A002.A00) != null && (bDz = (C22579BDz) a8p.A0A("open_web_view")) != null) {
                    bDz.BLG(A0B2);
                    return;
                }
                return;
            }
        } else {
            str = "fdsManagerRegistry";
        }
        C18070vi.A11(str);
        throw null;
    }

    public void CAX(int i, int i2) {
        A2X a2x;
        boolean z;
        if (i > 0) {
            if (i2 == 0) {
                a2x = this.A08;
                if (a2x != null) {
                    z = true;
                }
                C18070vi.A11("uiObserver");
                throw null;
            }
            return;
        } else if (i == 0 && i2 > 0) {
            a2x = this.A08;
            if (a2x != null) {
                z = false;
            }
            C18070vi.A11("uiObserver");
            throw null;
        } else {
            return;
        }
        a2x.A02(new AnonymousClass7NP(z));
    }

    public C130516jY CCt() {
        C130516jY r1 = new C130516jY();
        r1.A00 = 1;
        return r1;
    }

    public void CRT(String str) {
        A2X a2x = this.A08;
        if (a2x == null) {
            C18070vi.A11("uiObserver");
            throw null;
        } else {
            a2x.A02(new AnonymousClass7NS(str));
        }
    }

    public void CRU(String str) {
        if (str != null) {
            A2X a2x = this.A08;
            if (a2x == null) {
                C18070vi.A11("uiObserver");
                throw null;
            } else {
                a2x.A02(new AnonymousClass7NQ(str));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0035, code lost:
        if (com.whatsapp.flows.phoenix.webview.FcsFlowsWebViewFragment.A01(r4, r1, r3, r2) == false) goto L_0x006a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean A06(java.lang.String r8) {
        /*
            r7 = this;
            int r0 = r8.length()
            r6 = 0
            if (r0 == 0) goto L_0x003b
            r5 = 1
            r7.Bx9(r5, r8)
            java.lang.String r1 = r7.A0C
            java.lang.String r0 = "successURL"
            r2 = 0
            if (r1 == 0) goto L_0x0072
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x0058
            boolean r0 = r8.startsWith(r1)
            if (r0 == 0) goto L_0x0058
            android.net.Uri r4 = X.C108955ca.A0F(r8)
            java.util.HashMap r3 = X.C17880vN.A11()
            java.util.HashMap r2 = r7.A0D
            r1 = r7
            boolean r0 = r7 instanceof com.whatsapp.flows.phoenix.webview.FcsFlowsWebViewFragment
            if (r0 == 0) goto L_0x003c
            com.whatsapp.flows.phoenix.webview.FcsFlowsWebViewFragment r1 = (com.whatsapp.flows.phoenix.webview.FcsFlowsWebViewFragment) r1
            if (r2 == 0) goto L_0x0037
            boolean r0 = com.whatsapp.flows.phoenix.webview.FcsFlowsWebViewFragment.A01(r4, r1, r3, r2)
            if (r0 == 0) goto L_0x006a
        L_0x0037:
            r7.A05(r3, r5)
        L_0x003a:
            r6 = 1
        L_0x003b:
            return r6
        L_0x003c:
            java.util.Set r0 = r4.getQueryParameterNames()
            java.util.Iterator r2 = r0.iterator()
        L_0x0044:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0037
            java.lang.String r1 = X.C17880vN.A0v(r2)
            java.lang.String r0 = r4.getQueryParameter(r1)
            if (r0 == 0) goto L_0x0044
            r3.put(r1, r0)
            goto L_0x0044
        L_0x0058:
            java.lang.String r1 = r7.A0A
            java.lang.String r0 = "failureURL"
            if (r1 == 0) goto L_0x0072
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x003b
            boolean r0 = r8.startsWith(r1)
            if (r0 == 0) goto L_0x003b
        L_0x006a:
            X.1CQ r0 = X.AnonymousClass1D7.A0I()
            r7.A05(r0, r6)
            goto L_0x003a
        L_0x0072:
            X.C18070vi.A11(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.phoenix.webview.fragment.FcsWebViewFragment.A06(java.lang.String):boolean");
    }

    public void A1z(Bundle bundle) {
        String str;
        String str2;
        String str3;
        Serializable serializable;
        HashMap hashMap;
        String string;
        int i;
        String string2;
        String string3;
        super.A1z(bundle);
        Bundle bundle2 = this.A06;
        if (bundle2 == null || (str = bundle2.getString("url")) == null) {
            str = "about:blank";
        }
        this.A06 = str;
        Bundle bundle3 = this.A06;
        String str4 = "";
        if (bundle3 == null || (str2 = bundle3.getString("success_url")) == null) {
            str2 = str4;
        }
        this.A0C = str2;
        Bundle bundle4 = this.A06;
        if (bundle4 == null || (str3 = bundle4.getString("failure_url")) == null) {
            str3 = str4;
        }
        this.A0A = str3;
        Bundle bundle5 = this.A06;
        if (!(bundle5 == null || (string3 = bundle5.getString("post_data")) == null)) {
            str4 = string3;
        }
        this.A09 = str4;
        Bundle bundle6 = this.A06;
        if (bundle6 != null) {
            serializable = bundle6.getSerializable("callback_url_payload");
        } else {
            serializable = null;
        }
        if (serializable instanceof HashMap) {
            hashMap = (HashMap) serializable;
        } else {
            hashMap = null;
        }
        this.A0D = hashMap;
        Bundle bundle7 = this.A06;
        if (bundle7 == null || (string = bundle7.getString("fds_manager_id")) == null) {
            throw AnonymousClass000.A0n("'fds_manager_id' parameter not passed");
        }
        this.A0B = string;
        Bundle bundle8 = this.A06;
        if (bundle8 != null) {
            i = bundle8.getInt("callback_index");
        } else {
            i = -1;
        }
        this.A07 = i;
        Bundle bundle9 = this.A06;
        if (bundle9 == null || (string2 = bundle9.getString("fds_observer_id")) == null) {
            throw C17890vO.A0K();
        }
        AnonymousClass00H r0 = this.A05;
        if (r0 != null) {
            this.A08 = C108985cd.A0c(r0, string2);
        } else {
            C18070vi.A11("uiObserversFactory");
            throw null;
        }
    }

    public void A22(Menu menu, MenuInflater menuInflater) {
        boolean A15 = C18070vi.A15(menu, menuInflater);
        menu.clear();
        C108955ca.A1G(menu, A15 ? 1 : 0, 2131432656, 2131898516);
        C108955ca.A1G(menu, A15, 2131432654, 2131898507);
        C108955ca.A1G(menu, A15, 2131432655, 2131898515);
        if (this instanceof FcsFlowsWebViewFragment) {
            C108955ca.A1G(menu, 0, -1, 2131899401);
            menu.add(0, 2, 0, A1H(2131895214)).setShowAsAction(0);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00aa, code lost:
        if (X.AnonymousClass1YF.A0Y(X.C108955ca.A0v(r1, 3063), "extensions_help", false) == false) goto L_0x00ac;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A24(android.view.MenuItem r9) {
        /*
            r8 = this;
            int r1 = X.C72453Mb.A0B(r9)
            r0 = 2131432656(0x7f0b14d0, float:1.8487076E38)
            r4 = 1
            if (r1 != r0) goto L_0x001d
            java.lang.String r0 = ""
            r8.CRU(r0)
            X.5ey r0 = r8.A00
            if (r0 == 0) goto L_0x001c
            java.lang.String r0 = r0.getUrl()
            if (r0 == 0) goto L_0x001c
            r8.A04(r0)
        L_0x001c:
            return r4
        L_0x001d:
            r0 = 2131432654(0x7f0b14ce, float:1.8487072E38)
            if (r1 != r0) goto L_0x0034
            X.00H r0 = r8.A03
            if (r0 == 0) goto L_0x0070
            X.1o3 r2 = X.AnonymousClass3MW.A0a(r0)
            X.1FL r1 = r8.A1D()
            java.lang.String r0 = "about-viewing-business-websites"
            r2.A01(r1, r0)
            return r4
        L_0x0034:
            r0 = 2131432655(0x7f0b14cf, float:1.8487074E38)
            if (r1 != r0) goto L_0x0077
            X.5ey r0 = r8.A00
            if (r0 == 0) goto L_0x0077
            java.lang.String r1 = r0.getUrl()
            if (r1 == 0) goto L_0x0077
            boolean r0 = android.webkit.URLUtil.isHttpsUrl(r1)
            if (r0 == 0) goto L_0x0064
            X.A5E r0 = X.A5E.A00()
            X.8Qc r3 = r0.A03()
            java.lang.String r2 = "android.intent.action.VIEW"
            android.net.Uri r0 = X.C26215Cuu.A01(r1)
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r2, r0)
            X.1FL r0 = r8.A1B()
            r3.A05(r0, r1)
            return r4
        L_0x0064:
            X.5ey r2 = r8.A00
            if (r2 == 0) goto L_0x001c
            r1 = 2131898503(0x7f123087, float:1.9431926E38)
            r0 = -1
            X.C108955ca.A1H(r2, r1, r0)
            return r4
        L_0x0070:
            java.lang.String r0 = "contextualHelpHandler"
            X.C18070vi.A11(r0)
            goto L_0x0118
        L_0x0077:
            r4 = r8
            boolean r0 = r8 instanceof com.whatsapp.flows.phoenix.webview.FcsFlowsWebViewFragment
            if (r0 == 0) goto L_0x011a
            com.whatsapp.flows.phoenix.webview.FcsFlowsWebViewFragment r4 = (com.whatsapp.flows.phoenix.webview.FcsFlowsWebViewFragment) r4
            r7 = 0
            X.0ve r1 = r4.A01
            if (r1 == 0) goto L_0x0115
            r0 = 2069(0x815, float:2.899E-42)
            java.lang.String r6 = X.C108955ca.A0v(r1, r0)
            X.0ve r2 = r4.A01
            if (r2 == 0) goto L_0x0115
            r1 = 4393(0x1129, float:6.156E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            r5 = 0
            r3 = 2
            if (r0 == 0) goto L_0x00ac
            X.0ve r1 = r4.A01
            if (r1 == 0) goto L_0x010c
            r0 = 3063(0xbf7, float:4.292E-42)
            java.lang.String r1 = X.C108955ca.A0v(r1, r0)
            java.lang.String r0 = "extensions_help"
            boolean r0 = X.AnonymousClass1YF.A0Y(r1, r0, r7)
            r2 = 1
            if (r0 != 0) goto L_0x00ad
        L_0x00ac:
            r2 = 0
        L_0x00ad:
            int r1 = r9.getItemId()
            r0 = -1
            if (r1 == r0) goto L_0x00e9
            if (r1 != r3) goto L_0x011a
            X.1FL r0 = r4.A1B()
            if (r0 == 0) goto L_0x00e7
            android.content.Intent r0 = r0.getIntent()
            if (r0 == 0) goto L_0x00e7
            android.os.Bundle r2 = r0.getExtras()
            if (r2 == 0) goto L_0x00e7
            X.1Dw r1 = com.whatsapp.jid.UserJid.Companion
            java.lang.String r0 = "chat_id"
            java.lang.String r0 = r2.getString(r0)
            com.whatsapp.jid.UserJid r3 = r1.A04(r0)
            if (r3 == 0) goto L_0x00e7
            X.1RK r0 = r4.A04
            if (r0 == 0) goto L_0x010f
            X.Af0 r2 = r0.A04()
            r1 = 3
            X.7Ne r0 = new X.7Ne
            r0.<init>(r3, r4, r1)
            r2.A09(r0)
        L_0x00e7:
            r0 = 1
            return r0
        L_0x00e9:
            if (r2 == 0) goto L_0x00fd
            java.lang.String r0 = "whatsapp://help/extensions_help"
            android.net.Uri r2 = android.net.Uri.parse(r0)
        L_0x00f1:
            X.1L9 r1 = r4.A00
            if (r1 == 0) goto L_0x0106
            android.content.Context r0 = r4.A14()
            r1.CGU(r0, r2, r5)
            goto L_0x00e7
        L_0x00fd:
            X.129 r0 = r4.A02
            if (r0 == 0) goto L_0x0109
            android.net.Uri r2 = r0.A03(r6)
            goto L_0x00f1
        L_0x0106:
            java.lang.String r0 = "activityUtils"
            goto L_0x0111
        L_0x0109:
            java.lang.String r0 = "faqLinkFactory"
            goto L_0x0111
        L_0x010c:
            java.lang.String r0 = "abProps"
            goto L_0x0111
        L_0x010f:
            java.lang.String r0 = "companionDeviceManager"
        L_0x0111:
            X.C18070vi.A11(r0)
            throw r5
        L_0x0115:
            X.AnonymousClass3MW.A1A()
        L_0x0118:
            r0 = 0
            throw r0
        L_0x011a:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.phoenix.webview.fragment.FcsWebViewFragment.A24(android.view.MenuItem):boolean");
    }

    public void BJ8(String str) {
        CRU(str);
        if (str != null) {
            A06(str);
        }
    }

    public /* synthetic */ List BTe() {
        return C18460wS.A00;
    }

    public /* synthetic */ boolean Bfd() {
        return false;
    }

    public void Bx9(boolean z, String str) {
        B9Z b9z;
        AnonymousClass1FL A1B = A1B();
        if ((A1B instanceof B9Z) && (b9z = (B9Z) A1B) != null) {
            b9z.CL9(z);
        }
    }

    public boolean CM4(String str) {
        return A06(str);
    }

    public /* synthetic */ boolean BeT(String str) {
        return false;
    }

    public /* synthetic */ WebResourceResponse C3Q(String str) {
        return null;
    }

    public /* synthetic */ boolean C5Y(ValueCallback valueCallback) {
        return false;
    }
}
