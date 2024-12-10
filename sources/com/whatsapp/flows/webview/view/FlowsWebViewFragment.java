package com.whatsapp.flows.webview.view;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass11P;
import X.AnonymousClass181;
import X.AnonymousClass1HF;
import X.AnonymousClass1KB;
import X.AnonymousClass1L4;
import X.AnonymousClass1YF;
import X.AnonymousClass3MW;
import X.AnonymousClass3Ma;
import X.AnonymousClass6WN;
import X.AnonymousClass75Z;
import X.AnonymousClass793;
import X.AnonymousClass7AT;
import X.AnonymousClass7F7;
import X.AnonymousClass890;
import X.C108955ca;
import X.C108975cc;
import X.C108995ce;
import X.C110125ey;
import X.C114195qJ;
import X.C129686iC;
import X.C130516jY;
import X.C133646pF;
import X.C144267Gq;
import X.C146747Ql;
import X.C155897tU;
import X.C158127zm;
import X.C158137zn;
import X.C158147zo;
import X.C158157zp;
import X.C160948As;
import X.C17880vN;
import X.C17890vO;
import X.C18000vb;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C18100vl;
import X.C181849Sb;
import X.C18460wS;
import X.C196109uT;
import X.C20081A6h;
import X.C220418j;
import X.C28281Zt;
import X.C72453Mb;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import androidx.fragment.app.Fragment;
import com.whatsapp.flows.webview.viewmodel.WaFlowsViewModel;
import com.whatsapp.webview.ui.WebViewWrapperView;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
import javax.net.ssl.HttpsURLConnection;

public final class FlowsWebViewFragment extends Hilt_FlowsWebViewFragment implements C160948As {
    public C110125ey A00;
    public AnonymousClass1KB A01;
    public AnonymousClass181 A02;
    public AnonymousClass11P A03;
    public C18000vb A04;
    public C18030ve A05;
    public AnonymousClass890 A06;
    public AnonymousClass7F7 A07;
    public WaFlowsViewModel A08;
    public C220418j A09;
    public AnonymousClass1L4 A0A;
    public AnonymousClass00H A0B;
    public AnonymousClass00H A0C;
    public String A0D;
    public String A0E;
    public C129686iC A0F;
    public WebViewWrapperView A0G;
    public boolean A0H;
    public final ViewTreeObserver.OnGlobalLayoutListener A0I = new AnonymousClass793(this, 8);

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C110125ey r0;
        String str;
        String str2;
        WebSettings settings;
        String str3;
        String str4;
        AnonymousClass890 r1;
        C18070vi.A0d(layoutInflater, 0);
        View inflate = layoutInflater.inflate(2131625337, viewGroup, false);
        Fragment fragment = this.A0E;
        if ((fragment instanceof AnonymousClass890) && (r1 = (AnonymousClass890) fragment) != null) {
            this.A06 = r1;
        }
        this.A0G = (WebViewWrapperView) AnonymousClass1HF.A06(inflate, 2131437061);
        C18030ve r12 = this.A05;
        if (r12 != null) {
            C18040vf r6 = C18040vf.A02;
            boolean A052 = C18020vd.A05(r6, r12, 8869);
            WebViewWrapperView webViewWrapperView = this.A0G;
            if (A052) {
                if (webViewWrapperView != null) {
                    AnonymousClass00H r02 = this.A0C;
                    if (r02 != null) {
                        webViewWrapperView.setCustomOrCreateWebView(((C144267Gq) r02.get()).A00);
                    } else {
                        C18070vi.A11("flowsWebPreloader");
                        throw null;
                    }
                }
            } else if (webViewWrapperView != null) {
                webViewWrapperView.setCustomOrCreateWebView((C110125ey) null);
            }
            WebViewWrapperView webViewWrapperView2 = this.A0G;
            if (webViewWrapperView2 != null) {
                webViewWrapperView2.setWebViewDelegate(this);
            }
            WebViewWrapperView webViewWrapperView3 = this.A0G;
            if (webViewWrapperView3 != null) {
                r0 = webViewWrapperView3.A02;
            } else {
                r0 = null;
            }
            this.A00 = r0;
            this.A0H = false;
            if (r0 != null) {
                r0.getSettings().setJavaScriptEnabled(true);
            }
            C110125ey r03 = this.A00;
            if (r03 != null) {
                r03.getViewTreeObserver().addOnGlobalLayoutListener(this.A0I);
            }
            String str5 = this.A0D;
            if (str5 == null) {
                C18070vi.A11("launchURL");
                throw null;
            }
            Uri A0F2 = C108955ca.A0F(str5);
            ArrayList A0z = C17880vN.A0z(4);
            List asList = Arrays.asList(new String[]{"https"});
            if (!asList.isEmpty()) {
                C133646pF A002 = C114195qJ.A00(A0F2, A0z, asList);
                C110125ey r04 = this.A00;
                if (r04 != null) {
                    r04.A01 = A002;
                }
                AnonymousClass7AT.A01(A1G(), A25().A00, new C158127zm(this), 30);
                AnonymousClass7AT.A01(A1G(), A25().A04, new C158137zn(this), 30);
                AnonymousClass7AT.A01(A1G(), A25().A03, new C158147zo(this), 30);
                AnonymousClass7AT.A01(A1G(), A25().A05, new C158157zp(this), 30);
                String str6 = this.A0D;
                if (str6 == null) {
                    C18070vi.A11("launchURL");
                    throw null;
                }
                AnonymousClass00H r05 = this.A0C;
                if (r05 != null) {
                    ((C144267Gq) r05.get()).A02 = C108955ca.A0m();
                    C18030ve r13 = this.A05;
                    if (r13 != null) {
                        if (C18020vd.A05(r6, r13, 7574)) {
                            AnonymousClass00H r06 = this.A0B;
                            if (r06 != null) {
                                C20081A6h a6h = (C20081A6h) r06.get();
                                int A003 = WaFlowsViewModel.A00(A25());
                                AnonymousClass00H r07 = this.A0C;
                                if (r07 != null) {
                                    switch (((C144267Gq) r07.get()).A01.intValue()) {
                                        case 0:
                                            str4 = "none";
                                            break;
                                        case 1:
                                            str4 = "start";
                                            break;
                                        case 2:
                                            str4 = "failed";
                                            break;
                                        default:
                                            str4 = "success";
                                            break;
                                    }
                                    a6h.A06(A003, "preload_status", str4);
                                } else {
                                    str3 = "flowsWebPreloader";
                                }
                            } else {
                                str3 = "flowsScreenNavigationLogger";
                            }
                            C18070vi.A11(str3);
                            throw null;
                        }
                        C110125ey r08 = this.A00;
                        if (r08 == null || (settings = r08.getSettings()) == null) {
                            str2 = null;
                        } else {
                            str2 = settings.getUserAgentString();
                        }
                        this.A0E = str2;
                        C18030ve r14 = this.A05;
                        if (r14 != null) {
                            if (C18020vd.A05(r6, r14, 8418)) {
                                AnonymousClass00H r09 = this.A0B;
                                if (r09 != null) {
                                    ((C20081A6h) r09.get()).A0B(Integer.valueOf(WaFlowsViewModel.A00(A25())), "webview_fragment_create_end");
                                }
                                str = "flowsScreenNavigationLogger";
                                C18070vi.A11(str);
                                throw null;
                            }
                            AnonymousClass00H r010 = this.A0B;
                            if (r010 != null) {
                                ((C20081A6h) r010.get()).A0B(Integer.valueOf(WaFlowsViewModel.A03(A25())), "html_start");
                                AnonymousClass00H r011 = this.A0C;
                                if (r011 != null) {
                                    if (((C144267Gq) r011.get()).A00 != null) {
                                        C18030ve r15 = this.A05;
                                        if (r15 == null) {
                                            AnonymousClass3MW.A1A();
                                            throw null;
                                        } else if (C18020vd.A05(r6, r15, 8869)) {
                                            C110125ey r3 = this.A00;
                                            if (r3 != null) {
                                                AnonymousClass890 r2 = this.A06;
                                                C18030ve r012 = this.A05;
                                                if (r012 != null) {
                                                    AnonymousClass6WN.A00(new C155897tU(r3, new AnonymousClass75Z(r012, r2)));
                                                } else {
                                                    AnonymousClass3MW.A1A();
                                                    throw null;
                                                }
                                            }
                                            C18070vi.A0b(inflate);
                                            return inflate;
                                        }
                                    }
                                    C110125ey r013 = this.A00;
                                    if (r013 != null) {
                                        r013.loadUrl(str6);
                                    }
                                    C18070vi.A0b(inflate);
                                    return inflate;
                                }
                            }
                            str = "flowsScreenNavigationLogger";
                            C18070vi.A11(str);
                            throw null;
                        }
                        AnonymousClass3MW.A1A();
                        throw null;
                    }
                    AnonymousClass3MW.A1A();
                    throw null;
                }
                str = "flowsWebPreloader";
                C18070vi.A11(str);
                throw null;
            }
            throw AnonymousClass000.A0k("Cannot set 0 schemes");
        }
        AnonymousClass3MW.A1A();
        throw null;
    }

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        WebViewWrapperView webViewWrapperView = this.A0G;
        if (webViewWrapperView != null) {
            C72453Mb.A1D(webViewWrapperView.A01);
        }
    }

    public /* synthetic */ void BJ8(String str) {
    }

    public /* synthetic */ void C0Q(PermissionRequest permissionRequest) {
    }

    public /* synthetic */ void C0R() {
    }

    public WebResourceResponse C3Q(String str) {
        HttpsURLConnection httpsURLConnection;
        C18030ve r2 = this.A05;
        if (r2 != null) {
            if (C18020vd.A05(C18040vf.A02, r2, 7350)) {
                String str2 = this.A0D;
                if (str2 == null) {
                    C18070vi.A11("launchURL");
                    throw null;
                } else if (str.startsWith(str2)) {
                    try {
                        URLConnection openConnection = new URL(str).openConnection();
                        C18070vi.A0z(openConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
                        httpsURLConnection = (HttpsURLConnection) openConnection;
                        C220418j r0 = this.A09;
                        if (r0 != null) {
                            httpsURLConnection.setSSLSocketFactory(r0.A02());
                            httpsURLConnection.setRequestMethod("GET");
                            httpsURLConnection.setRequestProperty("User-Agent", this.A0E);
                            if (httpsURLConnection.getResponseCode() == 200) {
                                String contentType = httpsURLConnection.getContentType();
                                C18070vi.A0X(contentType);
                                String[] A1Y = C17880vN.A1Y();
                                A1Y[0] = ";";
                                String A0w = C17880vN.A0w(AnonymousClass1YF.A0S(contentType, A1Y, 0), 0);
                                String contentEncoding = httpsURLConnection.getContentEncoding();
                                if (contentEncoding == null) {
                                    contentEncoding = "utf-8";
                                }
                                AnonymousClass181 r1 = this.A02;
                                if (r1 != null) {
                                    WebResourceResponse webResourceResponse = new WebResourceResponse(A0w, contentEncoding, new ByteArrayInputStream(C108975cc.A1O(C181849Sb.A00(new BufferedReader(new InputStreamReader(C108995ce.A0N(r1, httpsURLConnection, 5)))))));
                                    httpsURLConnection.disconnect();
                                    return webResourceResponse;
                                }
                                C18070vi.A11("statistics");
                                throw null;
                            }
                            httpsURLConnection.disconnect();
                            return null;
                        }
                        C18070vi.A11("sslFactoryCreator");
                        throw null;
                    } catch (Exception e) {
                        if (e.getCause() instanceof CertificateException) {
                            AnonymousClass1KB r12 = this.A01;
                            if (r12 != null) {
                                r12.A0J(C146747Ql.A00(this, 34));
                            } else {
                                AnonymousClass3MW.A1C();
                                throw null;
                            }
                        }
                    } catch (Throwable th) {
                        httpsURLConnection.disconnect();
                        throw th;
                    }
                }
            }
            return null;
        }
        AnonymousClass3MW.A1A();
        throw null;
    }

    public /* synthetic */ void CAX(int i, int i2) {
    }

    public boolean CM4(String str) {
        return false;
    }

    public /* synthetic */ void CRT(String str) {
    }

    public /* synthetic */ void CRU(String str) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0098  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1s() {
        /*
            r9 = this;
            X.5ey r0 = r9.A00
            if (r0 == 0) goto L_0x000f
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            if (r1 == 0) goto L_0x000f
            android.view.ViewTreeObserver$OnGlobalLayoutListener r0 = r9.A0I
            r1.removeOnGlobalLayoutListener(r0)
        L_0x000f:
            com.whatsapp.flows.webview.viewmodel.WaFlowsViewModel r8 = r9.A25()
            X.1DT r6 = r8.A02
            java.lang.Number r0 = X.C108945cZ.A1C(r6)
            r4 = 0
            java.lang.String r3 = "flow_success"
            r7 = 2
            if (r0 == 0) goto L_0x0084
            int r0 = r0.intValue()
            if (r0 != 0) goto L_0x0080
            java.lang.String r5 = "flow_error"
        L_0x0027:
            boolean r0 = r5.equals(r3)
            if (r0 == 0) goto L_0x0056
            X.0ve r2 = r8.A0F
            r1 = 8132(0x1fc4, float:1.1395E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0056
            X.00H r0 = r8.A0N
            X.9tn r3 = X.C108965cb.A0O(r0)
            if (r3 == 0) goto L_0x0056
            X.00H r0 = r8.A0K
            java.lang.Object r2 = r0.get()
            X.A25 r2 = (X.A25) r2
            X.1PM r1 = r8.A0D
            X.00H r0 = r8.A0Q
            java.lang.Object r0 = X.C18070vi.A0E(r0)
            X.A0M r0 = (X.A0M) r0
            r2.A02(r1, r0, r3, r7)
        L_0x0056:
            X.00H r0 = r8.A0P
            java.lang.Object r2 = r0.get()
            X.A2M r2 = (X.A2M) r2
            java.lang.Number r0 = X.C108945cZ.A1C(r6)
            r1 = 1
            if (r0 == 0) goto L_0x006c
            int r0 = r0.intValue()
            if (r0 != 0) goto L_0x006c
            r4 = 1
        L_0x006c:
            r2.A03(r5, r1, r4)
            X.00H r0 = r9.A0C
            if (r0 == 0) goto L_0x0098
            java.lang.Object r0 = r0.get()
            X.7Gq r0 = (X.C144267Gq) r0
            r0.A00()
            super.A1s()
            return
        L_0x0080:
            if (r0 != r7) goto L_0x0084
            r5 = r3
            goto L_0x0027
        L_0x0084:
            X.00H r0 = r8.A0M
            java.lang.Object r2 = r0.get()
            X.8si r2 = (X.C172058si) r2
            int r1 = com.whatsapp.flows.webview.viewmodel.WaFlowsViewModel.A00(r8)
            r0 = 22
            r2.A0F(r1, r0)
            java.lang.String r5 = "user_interrupted"
            goto L_0x0027
        L_0x0098:
            java.lang.String r0 = "flowsWebPreloader"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.flows.webview.view.FlowsWebViewFragment.A1s():void");
    }

    public final WaFlowsViewModel A25() {
        WaFlowsViewModel waFlowsViewModel = this.A08;
        if (waFlowsViewModel != null) {
            return waFlowsViewModel;
        }
        C18070vi.A11("waFlowsViewModel");
        throw null;
    }

    public void Bx9(boolean z, String str) {
        Date date;
        String str2;
        String str3;
        if (!z && !this.A0H && str != null && !AnonymousClass1YF.A0Y(str, "flows_service_workers_cache_version", false)) {
            this.A0H = true;
            C110125ey r3 = this.A00;
            if (r3 != null) {
                AnonymousClass890 r2 = this.A06;
                C18030ve r0 = this.A05;
                if (r0 != null) {
                    AnonymousClass6WN.A00(new C155897tU(r3, new AnonymousClass75Z(r0, r2)));
                } else {
                    AnonymousClass3MW.A1A();
                    throw null;
                }
            }
            C110125ey r6 = this.A00;
            if (r6 != null) {
                if (C28281Zt.A0B(A1D())) {
                    str2 = "dark";
                } else {
                    str2 = "light";
                }
                C18000vb r02 = this.A04;
                if (r02 != null) {
                    if (TextUtils.getLayoutDirectionFromLocale(r02.A0N()) == 1) {
                        str3 = "rtl";
                    } else {
                        str3 = "ltr";
                    }
                    String id = TimeZone.getDefault().getID();
                    C18000vb r03 = this.A04;
                    if (r03 != null) {
                        String A062 = r03.A06();
                        StringBuilder A15 = C108955ca.A15(A062);
                        A15.append("\n        var meta = document.createElement('meta');\n        meta.setAttribute('name', 'viewport');\n        meta.setAttribute('content', 'width=device-width, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, user-scalable=no');\n        meta.setAttribute('theme', '");
                        A15.append(str2);
                        A15.append("');\n        meta.setAttribute('layoutDirection', '");
                        A15.append(str3);
                        A15.append("');\n        meta.setAttribute('locale', '");
                        A15.append(A062);
                        A15.append("');\n        meta.setAttribute('timeZone', '");
                        A15.append(id);
                        r6.evaluateJavascript(AnonymousClass000.A0y("');\n        meta.setAttribute('supportedStyles', 'background_color');\n        document.getElementsByTagName('head')[0].appendChild(meta);\n        ", A15), (ValueCallback) null);
                    }
                }
                AnonymousClass3MW.A1M();
                throw null;
            }
            C129686iC r62 = this.A0F;
            if (r62 != null) {
                long currentTimeMillis = System.currentTimeMillis() + ((long) (r62.A00 * 1000));
                C196109uT r7 = r62.A03;
                r7.A01();
                r7.A00();
                int i = 0;
                Date date2 = new Date(r7.A01());
                r7.A00();
                if (currentTimeMillis > date2.getTime()) {
                    r7.A01();
                    if (Integer.valueOf(r7.A00()).equals(0)) {
                        Date date3 = new Date(r7.A01());
                        r7.A00();
                        if (date3.getTime() > 0) {
                            date = date3;
                        } else {
                            date = new Date(currentTimeMillis);
                        }
                        if (date3.getTime() > 0) {
                            i = 1;
                        }
                        C18100vl r4 = r7.A01;
                        C17880vN.A1C(C17890vO.A0A(r4), "flows_need_cleanup_after_target_date", i);
                        C17880vN.A1D(C17890vO.A0A(r4), "flows_target_cleanup_date", date.getTime());
                    }
                }
            }
            AnonymousClass00H r04 = this.A0C;
            if (r04 != null) {
                ((C144267Gq) r04.get()).A01 = AnonymousClass00R.A0N;
                AnonymousClass00H r05 = this.A0B;
                if (r05 != null) {
                    ((C20081A6h) r05.get()).A0B(Integer.valueOf(WaFlowsViewModel.A03(A25())), "html_end");
                } else {
                    C18070vi.A11("flowsScreenNavigationLogger");
                    throw null;
                }
            } else {
                C18070vi.A11("flowsWebPreloader");
                throw null;
            }
        }
    }

    public void CAW(String str) {
        AnonymousClass890 r0 = this.A06;
        if (r0 != null) {
            r0.CAV(str);
        }
    }

    public C130516jY CCt() {
        C130516jY r1 = new C130516jY();
        r1.A05 = false;
        r1.A02 = false;
        r1.A04 = true;
        return r1;
    }

    public void A1z(Bundle bundle) {
        String str;
        super.A1z(bundle);
        WaFlowsViewModel waFlowsViewModel = (WaFlowsViewModel) AnonymousClass3Ma.A0I(this).A00(WaFlowsViewModel.class);
        C18070vi.A0d(waFlowsViewModel, 0);
        this.A08 = waFlowsViewModel;
        Bundle bundle2 = this.A06;
        if (bundle2 == null || (str = bundle2.getString("url")) == null) {
            str = "about:blank";
        }
        this.A0D = str;
        AnonymousClass7F7 r0 = this.A07;
        if (r0 != null) {
            this.A0F = r0.A00();
        } else {
            C18070vi.A11("flowsWebCacheCleanerHelper");
            throw null;
        }
    }

    public /* synthetic */ List BTe() {
        return C18460wS.A00;
    }

    public /* synthetic */ boolean Bfd() {
        return false;
    }

    public /* synthetic */ boolean BeT(String str) {
        return false;
    }

    public /* synthetic */ boolean C5Y(ValueCallback valueCallback) {
        return false;
    }
}
