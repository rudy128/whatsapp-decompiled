package com.whatsapp.webview.ui;

import X.A5E;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00H;
import X.AnonymousClass01C;
import X.AnonymousClass02n;
import X.AnonymousClass1LU;
import X.AnonymousClass1YE;
import X.AnonymousClass1YF;
import X.AnonymousClass1YL;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass3NL;
import X.AnonymousClass4Yv;
import X.AnonymousClass4a6;
import X.AnonymousClass4aX;
import X.AnonymousClass6Pt;
import X.AnonymousClass6Pu;
import X.AnonymousClass6Pv;
import X.AnonymousClass6Pw;
import X.AnonymousClass6Px;
import X.AnonymousClass6Py;
import X.AnonymousClass6ZK;
import X.AnonymousClass6ZL;
import X.AnonymousClass73I;
import X.AnonymousClass758;
import X.AnonymousClass785;
import X.AnonymousClass7AH;
import X.AnonymousClass7AL;
import X.AnonymousClass7AM;
import X.AnonymousClass7RN;
import X.C010105w;
import X.C108945cZ;
import X.C108955ca;
import X.C108975cc;
import X.C108985cd;
import X.C110125ey;
import X.C114925sD;
import X.C124276Xs;
import X.C124506Yp;
import X.C126836dN;
import X.C128006fI;
import X.C128766ge;
import X.C130266j9;
import X.C130516jY;
import X.C131846ll;
import X.C131856lm;
import X.C133236oO;
import X.C137536vc;
import X.C138376wy;
import X.C138676xV;
import X.C1406772n;
import X.C1411774p;
import X.C1412174t;
import X.C1412774z;
import X.C1605889b;
import X.C160948As;
import X.C17880vN;
import X.C17890vO;
import X.C17960vV;
import X.C18020vd;
import X.C18040vf;
import X.C18070vi;
import X.C29351c6;
import X.C29431cG;
import X.C36361nl;
import X.C72453Mb;
import X.C72463Mc;
import X.C72813Np;
import X.C73203Rj;
import X.C74743cP;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.PermissionRequest;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.whatsapp.SecondaryProcessAbstractAppShellDelegate;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class WaInAppBrowsingActivity extends C114925sD implements C160948As {
    public int A00 = 1;
    public C010105w A01;
    public SwipeRefreshLayout A02;
    public C110125ey A03;
    public AnonymousClass6ZK A04;
    public AnonymousClass6ZL A05;
    public C36361nl A06;
    public AnonymousClass1LU A07;
    public C1605889b A08;
    public C131846ll A09;
    public C138376wy A0A;
    public C133236oO A0B;
    public C126836dN A0C;
    public AnonymousClass00H A0D;
    public String A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public C010105w A0R;
    public C138676xV A0S;

    public void A4d() {
    }

    public void A4e(int i) {
    }

    public boolean A4j() {
        return true;
    }

    public boolean A4k(String str) {
        String str2;
        if (str == null || str.length() == 0 || (str2 = this.A0E) == null || !AnonymousClass1YF.A0Y(str, str2, false)) {
            return false;
        }
        Intent A0A2 = C17880vN.A0A();
        A0A2.putExtra("webview_callback", str);
        A4f(-1, A0A2);
        return true;
    }

    public /* synthetic */ void BJ8(String str) {
    }

    public boolean Bfd() {
        return false;
    }

    public boolean CM4(String str) {
        int i;
        String str2;
        Object obj;
        Object obj2;
        boolean A0A2;
        if (!A4k(str)) {
            Uri A0F2 = C108955ca.A0F(str);
            String scheme = A0F2.getScheme();
            if ("http".equals(scheme)) {
                String A072 = AnonymousClass1YE.A07(str, "http://", "https://", false);
                C110125ey r0 = this.A03;
                if (r0 != null) {
                    r0.loadUrl(A072);
                }
            } else if (!getIntent().getBooleanExtra("webview_deeplink_enabled", false) || "https".equals(scheme)) {
                try {
                    C110125ey r02 = this.A03;
                    if (r02 != null) {
                        str2 = r02.getUrl();
                    } else {
                        str2 = null;
                    }
                    C17960vV.A07(str2);
                    C18070vi.A0X(str2);
                    boolean booleanExtra = getIntent().getBooleanExtra("webview_avoid_external", false);
                    Resources A0D2 = C108955ca.A0D(this);
                    if (URLUtil.isHttpsUrl(str)) {
                        Uri A0F3 = C108955ca.A0F(str2);
                        Uri A0F4 = C108955ca.A0F(str);
                        if (!booleanExtra) {
                            return false;
                        }
                        StringBuilder A10 = AnonymousClass000.A10();
                        A10.append("SecuredWebViewUtil/checkUrl: Tried to open external link when blocked: ");
                        C17890vO.A19(A10, A0V(Uri.parse(str)));
                        C17960vV.A0H(C18070vi.A18(A0F3.getHost(), A0F4.getHost()), A0D2.getString(2131898966));
                        return false;
                    }
                    StringBuilder A102 = AnonymousClass000.A10();
                    A102.append("SecuredWebViewUtil/checkUrl: Tried to open non-HTTPS content on ");
                    C17890vO.A19(A102, A0V(Uri.parse(str)));
                    throw AnonymousClass000.A0k(A0D2.getString(2131898967));
                } catch (IllegalStateException e) {
                    e = e;
                    i = 43;
                    runOnUiThread(new AnonymousClass7RN(this, e, i));
                    return true;
                } catch (IllegalArgumentException e2) {
                    e = e2;
                    i = 44;
                    runOnUiThread(new AnonymousClass7RN(this, e, i));
                    return true;
                }
            } else if (this.A01 == null) {
                C131846ll r03 = this.A09;
                if (r03 != null) {
                    Iterator it = ((Iterable) C18070vi.A0E(r03.A00)).iterator();
                    loop0:
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        C131856lm r9 = (C131856lm) obj;
                        String A0H2 = C18070vi.A0H(A0F2);
                        if (!(r9 instanceof AnonymousClass6Pt)) {
                            if (!(r9 instanceof AnonymousClass6Pu)) {
                                if (!(r9 instanceof AnonymousClass6Pv)) {
                                    AnonymousClass6Pw r92 = (AnonymousClass6Pw) r9;
                                    Uri A0F5 = C108955ca.A0F(A0H2);
                                    String scheme2 = A0F5.getScheme();
                                    int A0E2 = r92.A00.A0E(A0F5);
                                    List A0s = C108985cd.A0s(C108955ca.A0v(r92.A01, 4642), 1);
                                    ArrayList A0E3 = C29351c6.A0E(A0s);
                                    Iterator it2 = A0s.iterator();
                                    while (it2.hasNext()) {
                                        A0E3.add(AnonymousClass1YF.A0I(C17880vN.A0v(it2)));
                                    }
                                    if (!C29431cG.A18(AnonymousClass6Pw.A02, scheme2)) {
                                        if (!(A0E3 instanceof Collection) || !A0E3.isEmpty()) {
                                            Iterator it3 = A0E3.iterator();
                                            while (true) {
                                                if (it3.hasNext()) {
                                                    if (C18070vi.A18(it3.next(), scheme2)) {
                                                        break loop0;
                                                    }
                                                } else {
                                                    break;
                                                }
                                            }
                                        }
                                        if (!(A0E2 == 1 || A0E2 == 10)) {
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                } else {
                                    ArrayList arrayList = AnonymousClass6Pv.A01;
                                    if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
                                        Iterator it4 = arrayList.iterator();
                                        while (it4.hasNext()) {
                                            if (AnonymousClass1YE.A0A(A0H2, C17880vN.A0v(it4), true)) {
                                                break loop0;
                                            }
                                        }
                                        continue;
                                    }
                                }
                            } else if (AnonymousClass1YE.A0A(A0H2, "https://play.google.com/store/apps/details?", false)) {
                                break;
                            } else {
                                A0A2 = AnonymousClass1YE.A0A(A0H2, "market://", false);
                            }
                        } else {
                            String scheme3 = C108955ca.A0F(A0H2).getScheme();
                            if (C18020vd.A05(C18040vf.A02, ((AnonymousClass6Pt) r9).A00, 12341)) {
                                A0A2 = "intent".equalsIgnoreCase(scheme3);
                            } else {
                                continue;
                            }
                        }
                        if (A0A2) {
                            break;
                        }
                    }
                    C131856lm r6 = (C131856lm) obj;
                    if (r6 != null) {
                        if (getIntent().getBooleanExtra("show_app_redirection_dialog", false)) {
                            if (!(r6 instanceof AnonymousClass6Pw) || !SecondaryProcessAbstractAppShellDelegate.COMPRESSED_WHATSAPP_LIB_NAME.equals(A0F2.getScheme())) {
                                obj2 = AnonymousClass6Px.A00;
                            } else {
                                obj2 = AnonymousClass6Py.A00;
                            }
                            if (C18070vi.A18(obj2, AnonymousClass6Px.A00)) {
                                Uri A0F6 = C108955ca.A0F(str);
                                if (this.A01 == null && !AnonymousClass4Yv.A02(this)) {
                                    C73203Rj A002 = AnonymousClass4a6.A00(this);
                                    A002.A0E(2131898519);
                                    A002.A0D(2131898518);
                                    A002.A0Z(new C1412774z(A0F6, this, r6, 4), 2131899286);
                                    AnonymousClass758.A00(A002, this, 40, 2131898766);
                                    C010105w create = A002.create();
                                    this.A01 = create;
                                    if (create != null) {
                                        create.show();
                                        return true;
                                    }
                                }
                            }
                        }
                        C131846ll r04 = this.A09;
                        if (r04 != null) {
                            r04.A00(this, A0F2, r6);
                            return true;
                        }
                    }
                }
                C18070vi.A11("appsStoreDeeplinkManager");
                throw null;
            }
        }
        return true;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        C18070vi.A0d(menu, 0);
        if (this.A0O) {
            C108975cc.A0p(menu, 2131432656, 2131898516);
            C108975cc.A0p(menu, 2131432655, 2131898515);
            C108975cc.A0p(menu, 2131432653, 2131898500);
            C108975cc.A0p(menu, 2131432658, 2131898521);
            C108975cc.A0p(menu, 2131432654, 2131898507);
        }
        return super.onCreateOptionsMenu(menu);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.6ge, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v4, types: [X.6ge, java.lang.Object] */
    public static String A0V(Uri uri) {
        String query;
        C128766ge r1;
        String str;
        C128006fI r4 = C124506Yp.A00;
        String scheme = uri.getScheme();
        String authority = uri.getAuthority();
        if (scheme == null || "".equals(scheme) || authority == null || "".equals(authority)) {
            ? obj = new Object();
            obj.A01 = uri.getPath();
            obj.A02 = scheme;
            obj.A00 = authority;
            query = uri.getQuery();
            r1 = obj;
        } else {
            if (TextUtils.isEmpty(uri.getPath())) {
                str = null;
            } else {
                str = "/--sanitized--";
            }
            query = C124276Xs.A00(uri, r4);
            ? obj2 = new Object();
            obj2.A02 = scheme;
            obj2.A00 = authority;
            obj2.A01 = str;
            r1 = obj2;
        }
        String str2 = r1.A02;
        String str3 = r1.A00;
        String str4 = r1.A01;
        StringBuilder A10 = AnonymousClass000.A10();
        if (!TextUtils.isEmpty(str2)) {
            C108975cc.A14(A10, str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            A10.append("//");
            A10.append(str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            A10.append(str4);
        }
        if (!TextUtils.isEmpty(query)) {
            A10.append('?');
            A10.append(query);
        }
        return A10.toString();
    }

    public final C133236oO A4b() {
        C133236oO r0 = this.A0B;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("webViewProvider");
        throw null;
    }

    public void A4c() {
        if (this.A0M) {
            C73203Rj A002 = AnonymousClass4a6.A00(this);
            setTitle(getString(2131888335));
            A002.A0D(2131888333);
            A002.A0g(this, new AnonymousClass7AM(this, 25), 2131888334);
            AnonymousClass7AL.A00(this, A002, 9, 2131898718);
            AnonymousClass3MY.A1G(A002);
            return;
        }
        A4f(0, A0Q(this));
    }

    public void A4i(String str, boolean z) {
        if (this.A0R == null && !AnonymousClass4Yv.A02(this)) {
            C73203Rj A002 = AnonymousClass4a6.A00(this);
            A002.A0S(str);
            A002.A0T(false);
            A002.A0Z(new C1412174t(3, this, z), 2131899286);
            this.A0R = A002.A0C();
        }
    }

    public List BTe() {
        C1605889b r0 = this.A08;
        if (r0 != null) {
            return C18070vi.A0M(r0);
        }
        C18070vi.A11("navigationTimingLoggerJsInjector");
        throw null;
    }

    public void Bx9(boolean z, String str) {
        if (!z) {
            A4d();
        }
    }

    public void C0R() {
        AnonymousClass00H r0 = this.A0D;
        if (r0 != null) {
            C130266j9 r2 = (C130266j9) r0.get();
            C010105w r1 = r2.A00;
            if (r1 != null) {
                if (r1.isShowing()) {
                    r1.isShowing();
                }
                r2.A00 = null;
                return;
            }
            return;
        }
        C18070vi.A11("videoCapturePermissionHandler");
        throw null;
    }

    public boolean C5Y(ValueCallback valueCallback) {
        String str;
        C138676xV r6 = this.A0S;
        if (r6 == null) {
            C18070vi.A11("mediaPickerLauncher");
            throw null;
        }
        boolean z = r6.A07;
        if (!z && !r6.A06) {
            return false;
        }
        ValueCallback valueCallback2 = r6.A00;
        if (valueCallback2 != null) {
            valueCallback2.onReceiveValue((Object) null);
        }
        r6.A00 = valueCallback;
        if (z) {
            try {
                int i = r6.A01;
                AnonymousClass02n r5 = r6.A04;
                AnonymousClass01C r10 = r6.A02;
                boolean A052 = C18020vd.A05(C18040vf.A02, r6.A05, 7951);
                Intent A0A2 = C17880vN.A0A();
                String packageName = r10.getPackageName();
                if (A052) {
                    str = "com.whatsapp.gallerypicker.GalleryPickerBottomSheetActivity";
                } else {
                    str = "com.whatsapp.gallerypicker.GalleryPicker";
                }
                A0A2.setClassName(packageName, str);
                A0A2.putExtra("max_items", i);
                A0A2.putExtra("skip_max_items_new_limit", true);
                A0A2.putExtra("preview", true);
                A0A2.putExtra("origin", 37);
                A0A2.putExtra("send", false);
                A0A2.putExtra("include_media", 1);
                A0A2.putExtra("media_sharing_user_journey_origin", 20);
                r5.A02((C1406772n) null, A0A2);
                return true;
            } catch (ActivityNotFoundException e) {
                Log.e("MediaPickerLauncher/onShowFileChooser: Could not launch gallery picker for image upload in web view", e);
                r6.A00 = null;
                return false;
            }
        } else {
            Intent A0G2 = C108945cZ.A0G("android.intent.action.OPEN_DOCUMENT");
            A0G2.addCategory("android.intent.category.OPENABLE");
            A0G2.setType("*/*");
            boolean z2 = false;
            A0G2.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/png", "image/jpeg", "image/jpg", "application/pdf"});
            if (r6.A01 > 1) {
                z2 = true;
            }
            A0G2.putExtra("android.intent.extra.ALLOW_MULTIPLE", z2);
            r6.A03.A02((C1406772n) null, A0G2);
            return true;
        }
    }

    public void CAW(String str) {
        if (str == null || str.length() == 0) {
            A4f(0, A0Q(this));
        } else {
            A4i(str, true);
        }
    }

    public void CAX(int i, int i2) {
        SwipeRefreshLayout swipeRefreshLayout;
        boolean z;
        if (this.A0L) {
            if (i > 0) {
                if (i2 == 0 && (swipeRefreshLayout = this.A02) != null) {
                    z = false;
                } else {
                    return;
                }
            } else if (i == 0 && i2 > 0 && (swipeRefreshLayout = this.A02) != null) {
                z = true;
            } else {
                return;
            }
            swipeRefreshLayout.setEnabled(z);
        }
    }

    public void onBackPressed() {
        C110125ey r0;
        if (!this.A0H || (r0 = this.A03) == null || !r0.canGoBack()) {
            A4c();
            return;
        }
        CRT(C18070vi.A0F(this, 2131898511));
        CRU("");
        C110125ey r02 = this.A03;
        if (r02 != null) {
            r02.goBack();
        }
        A4e(27);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x01cf, code lost:
        if (X.C18070vi.A18(A4b().A04, r2) != false) goto L_0x01d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x01e7, code lost:
        if (X.C18070vi.A18(A4b().A01, r5.A01) == false) goto L_0x01e9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r18) {
        /*
            r17 = this;
            r9 = r17
            r0 = r18
            super.onCreate(r0)
            X.6dN r1 = r9.A0C
            if (r1 == 0) goto L_0x0394
            android.content.pm.PackageInfo r0 = X.C1403370z.A01(r9)
            if (r0 == 0) goto L_0x02c2
            java.lang.String r6 = r0.versionName
        L_0x0013:
            r8 = 1
            if (r6 == 0) goto L_0x0033
            X.0ve r1 = r1.A00
            r0 = 11790(0x2e0e, float:1.6521E-41)
            org.json.JSONObject r1 = r1.A0J(r0)
            java.lang.String r0 = "versions"
            org.json.JSONArray r5 = r1.optJSONArray(r0)
            if (r5 != 0) goto L_0x0286
            X.0wS r7 = X.C18460wS.A00
        L_0x0028:
            boolean r0 = r7 instanceof java.util.Collection
            if (r0 == 0) goto L_0x025f
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x025f
        L_0x0032:
            r8 = 0
        L_0x0033:
            java.lang.String r1 = "webview_url"
            if (r8 == 0) goto L_0x0049
            java.lang.String r0 = X.C108955ca.A0r(r9, r1)
            android.net.Uri r0 = android.net.Uri.parse(r0)
            android.content.Intent r0 = X.AnonymousClass3MY.A07(r0)
            r9.startActivity(r0)
            r9.finish()
        L_0x0049:
            r0 = 2131625591(0x7f0e0677, float:1.8878394E38)
            r9.setContentView((int) r0)
            android.content.Intent r2 = r9.getIntent()
            java.lang.String r0 = "webview_callback"
            java.lang.String r0 = r2.getStringExtra(r0)
            r9.A0E = r0
            java.lang.String r0 = "webview_open_new_tab_in_external_browser"
            r4 = 0
            boolean r0 = r2.getBooleanExtra(r0, r4)
            r9.A0N = r0
            java.lang.String r0 = "webview_title_show_domain_only"
            boolean r0 = r2.getBooleanExtra(r0, r4)
            r9.A0P = r0
            java.lang.String r0 = "allow_image_file_upload"
            boolean r0 = r2.getBooleanExtra(r0, r4)
            r9.A0G = r0
            java.lang.String r0 = "allow_document_file_upload"
            boolean r0 = r2.getBooleanExtra(r0, r4)
            r9.A0F = r0
            java.lang.String r3 = "max_images_allowed_for_upload"
            int r0 = r9.A00
            int r0 = r2.getIntExtra(r3, r0)
            r9.A00 = r0
            java.lang.String r0 = "webview_toolbar_v2"
            boolean r0 = r2.getBooleanExtra(r0, r4)
            r9.A0Q = r0
            java.lang.String r0 = "extra_toolbar_show_advance_iab_menu"
            boolean r0 = r2.getBooleanExtra(r0, r4)
            r9.A0O = r0
            java.lang.String r0 = "extra_learn_mode_action"
            boolean r0 = r2.getBooleanExtra(r0, r4)
            r9.A0I = r0
            java.lang.String r0 = "webview_should_ask_before_close"
            boolean r0 = r2.getBooleanExtra(r0, r4)
            r9.A0M = r0
            java.lang.String r0 = "webview_can_navigate_back"
            boolean r0 = r2.getBooleanExtra(r0, r4)
            r9.A0H = r0
            java.lang.String r0 = "webview_javascript_enabled"
            boolean r0 = r2.getBooleanExtra(r0, r4)
            r9.A0J = r0
            java.lang.String r0 = "webview_navigation_bar_enabled"
            boolean r0 = r2.getBooleanExtra(r0, r4)
            r9.A0K = r0
            java.lang.String r0 = "webview_pull_to_refresh_enabled"
            boolean r0 = r2.getBooleanExtra(r0, r4)
            if (r0 == 0) goto L_0x00d3
            X.0ve r3 = r9.A0E
            r2 = 12586(0x312a, float:1.7637E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r3, r2)
            if (r0 == 0) goto L_0x00d3
            r4 = 1
        L_0x00d3:
            r9.A0L = r4
            r0 = 2131436270(0x7f0b22ee, float:1.8494406E38)
            android.view.View r12 = X.AnonymousClass3MY.A0H(r9, r0)
            androidx.appcompat.widget.Toolbar r12 = (androidx.appcompat.widget.Toolbar) r12
            X.01n r0 = X.AnonymousClass3MY.A0K(r9, r12)
            if (r0 == 0) goto L_0x0156
            X.C72473Md.A18(r9)
            r0 = 2131427815(0x7f0b01e7, float:1.8477257E38)
            android.view.View r13 = X.AnonymousClass3MY.A0H(r9, r0)
            com.google.android.material.appbar.AppBarLayout r13 = (com.google.android.material.appbar.AppBarLayout) r13
            r0 = 2131431505(0x7f0b1051, float:1.8484741E38)
            android.view.View r14 = X.AnonymousClass3MY.A0H(r9, r0)
            com.whatsapp.WaImageView r14 = (com.whatsapp.WaImageView) r14
            r0 = 2131437048(0x7f0b25f8, float:1.8495984E38)
            android.view.View r10 = X.AnonymousClass3MY.A0H(r9, r0)
            android.widget.TextView r10 = (android.widget.TextView) r10
            r0 = 2131437049(0x7f0b25f9, float:1.8495986E38)
            android.view.View r11 = X.AnonymousClass3MY.A0H(r9, r0)
            android.widget.TextView r11 = (android.widget.TextView) r11
            boolean r0 = r9.A0I
            if (r0 == 0) goto L_0x011b
            r0 = 2131437047(0x7f0b25f7, float:1.8495982E38)
            android.view.View r2 = r9.findViewById(r0)
            r0 = 17
            X.AnonymousClass3MZ.A1M(r2, r9, r0)
        L_0x011b:
            boolean r0 = r9.A0Q
            if (r0 == 0) goto L_0x0153
            r2 = 2131233368(0x7f080a58, float:1.8082872E38)
            r0 = 2131101222(0x7f060626, float:1.7814848E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass4aX.A02(r9, r2, r0)
            r12.setOverflowIcon(r0)
            r0 = 8
            r14.setVisibility(r0)
            r0 = 17
            r10.setGravity(r0)
            r11.setGravity(r0)
            r3 = 2130970827(0x7f0408cb, float:1.7550375E38)
            r2 = 2131102235(0x7f060a1b, float:1.7816902E38)
            int r0 = X.AnonymousClass1YL.A00(r9, r3, r2)
            X.AnonymousClass3MX.A1A(r9, r13, r0)
            int r0 = X.AnonymousClass1YL.A00(r9, r3, r2)
            X.C28281Zt.A05(r9, r0)
            r0 = 2131233611(0x7f080b4b, float:1.8083364E38)
            X.AnonymousClass3MY.A0v(r9, r12, r0)
        L_0x0153:
            r9.A4h(r10, r11, r12, r13, r14)
        L_0x0156:
            X.6ZL r0 = r9.A05
            if (r0 == 0) goto L_0x0391
            boolean r15 = r9.A0G
            boolean r2 = r9.A0F
            int r14 = r9.A00
            X.1K2 r0 = r0.A00
            X.10E r0 = r0.A01
            X.0ve r11 = X.AnonymousClass10E.A8r(r0)
            X.1LU r12 = X.AnonymousClass3MY.A0Z(r0)
            X.11C r10 = X.AnonymousClass3Ma.A0a(r0)
            X.00S r0 = r0.A3u
            java.lang.Object r13 = r0.get()
            X.1NL r13 = (X.AnonymousClass1NL) r13
            X.6xV r8 = new X.6xV
            r16 = r2
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            r9.A0S = r8
            r0 = 2131437061(0x7f0b2605, float:1.849601E38)
            android.view.View r3 = X.AnonymousClass3MY.A0H(r9, r0)
            com.whatsapp.webview.ui.WebViewWrapperView r3 = (com.whatsapp.webview.ui.WebViewWrapperView) r3
            r0 = 2131435953(0x7f0b21b1, float:1.8493763E38)
            android.view.View r0 = r9.findViewById(r0)
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r0 = (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) r0
            r9.A02 = r0
            r2 = 0
            if (r0 == 0) goto L_0x019b
            r0.setActivated(r2)
        L_0x019b:
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r0 = r9.A02
            if (r0 == 0) goto L_0x01a2
            r0.setRefreshing(r2)
        L_0x01a2:
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r0 = r9.A02
            if (r0 == 0) goto L_0x01a9
            r0.setEnabled(r2)
        L_0x01a9:
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r2 = r9.A02
            if (r2 == 0) goto L_0x01b4
            X.7Ai r0 = new X.7Ai
            r0.<init>(r9)
            r2.A0E = r0
        L_0x01b4:
            X.6jY r5 = r9.CCt()
            java.lang.String r2 = X.C108955ca.A0r(r9, r1)
            X.6oO r0 = r9.A4b()
            java.lang.String r0 = r0.A04
            if (r0 == 0) goto L_0x01d1
            X.6oO r0 = r9.A4b()
            java.lang.String r0 = r0.A04
            boolean r0 = X.C18070vi.A18(r0, r2)
            r4 = 1
            if (r0 == 0) goto L_0x01d2
        L_0x01d1:
            r4 = 0
        L_0x01d2:
            X.6oO r0 = r9.A4b()
            java.lang.String r0 = r0.A01
            if (r0 == 0) goto L_0x01e9
            X.6oO r0 = r9.A4b()
            java.lang.String r2 = r0.A01
            java.lang.String r0 = r5.A01
            boolean r0 = X.C18070vi.A18(r2, r0)
            r2 = 0
            if (r0 != 0) goto L_0x01ea
        L_0x01e9:
            r2 = 1
        L_0x01ea:
            boolean r0 = r5.A03
            if (r0 == 0) goto L_0x01f0
            if (r4 != 0) goto L_0x01f2
        L_0x01f0:
            if (r2 == 0) goto L_0x01f9
        L_0x01f2:
            X.6oO r0 = r9.A4b()
            r0.A00()
        L_0x01f9:
            X.6oO r2 = r9.A4b()
            java.lang.String r0 = r5.A01
            r2.A01 = r0
            X.6oO r2 = r9.A4b()
            java.lang.String r0 = X.C108955ca.A0r(r9, r1)
            r2.A04 = r0
            X.6oO r0 = r9.A4b()
            X.5ey r0 = r0.A00
            r3.setCustomOrCreateWebView(r0)
            r3.setWebViewDelegate(r9)
            X.5ey r0 = r3.A02
            r9.A03 = r0
            r5 = 1
            if (r0 != 0) goto L_0x02d4
            android.content.Intent r2 = r9.getIntent()
            java.lang.String r0 = "webview_fallback_to_external_browser_on_webview_errors"
            r4 = 0
            boolean r0 = r2.getBooleanExtra(r0, r4)
            java.lang.String r3 = X.C108955ca.A0r(r9, r1)
            if (r0 == 0) goto L_0x02c9
            if (r3 == 0) goto L_0x02c9
            int r0 = r3.length()
            if (r0 == 0) goto L_0x02c9
            X.190 r2 = r9.A03
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "source activity: "
            r1.append(r0)
            X.C17900vP.A0a(r9, r1)
            r0 = 32
            java.lang.String r1 = X.C17890vO.A0c(r1, r0)
            java.lang.String r0 = "unable-to-load-in-app-web-view"
            r2.A0G(r0, r1, r4)
            X.1LU r0 = r9.A07
            if (r0 == 0) goto L_0x02c5
            android.net.Uri r0 = X.C108955ca.A0F(r3)
            X.AnonymousClass1LU.A1p(r0)
            r9.finish()
            return
        L_0x025f:
            java.util.Iterator r2 = r7.iterator()
        L_0x0263:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0032
            java.lang.Object r0 = r2.next()
            X.6rf r0 = (X.C135106rf) r0
            java.lang.String r1 = r0.A00
            java.lang.String r0 = r0.A01
            int r0 = r6.compareTo(r0)
            if (r1 != 0) goto L_0x027c
            if (r0 >= 0) goto L_0x0033
            goto L_0x0263
        L_0x027c:
            if (r0 < 0) goto L_0x0263
            int r0 = r6.compareTo(r1)
            if (r0 > 0) goto L_0x0263
            goto L_0x0033
        L_0x0286:
            r1 = 0
            int r0 = r5.length()
            X.1Oc r0 = X.C28851b7.A08(r1, r0)
            java.util.ArrayList r7 = X.AnonymousClass000.A13()
            java.util.Iterator r4 = r0.iterator()
        L_0x0297:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0028
            r0 = r4
            X.20T r0 = (X.AnonymousClass20T) r0
            int r0 = r0.A00()
            org.json.JSONObject r3 = r5.optJSONObject(r0)
            r1 = 0
            if (r3 == 0) goto L_0x0297
            java.lang.String r0 = "minVersion"
            java.lang.String r2 = r3.optString(r0, r1)
            if (r2 == 0) goto L_0x0297
            java.lang.String r0 = "maxVersion"
            java.lang.String r1 = r3.optString(r0, r1)
            X.6rf r0 = new X.6rf
            r0.<init>(r2, r1)
            r7.add(r0)
            goto L_0x0297
        L_0x02c2:
            r6 = 0
            goto L_0x0013
        L_0x02c5:
            java.lang.String r0 = "waIntents"
            goto L_0x0399
        L_0x02c9:
            r0 = 2131898514(0x7f123092, float:1.9431948E38)
            java.lang.String r0 = r9.getString(r0)
            r9.A4i(r0, r5)
            return
        L_0x02d4:
            boolean r1 = r9.A0J
            android.webkit.WebSettings r0 = r0.getSettings()
            r0.setJavaScriptEnabled(r1)
            android.content.Intent r1 = r9.getIntent()
            java.lang.String r0 = "allow_file_download"
            r4 = 0
            boolean r0 = r1.getBooleanExtra(r0, r4)
            if (r0 == 0) goto L_0x0315
            X.6ZK r0 = r9.A04
            if (r0 == 0) goto L_0x0397
            X.6dM r6 = new X.6dM
            r6.<init>(r9)
            X.1K2 r0 = r0.A00
            X.10E r1 = r0.A01
            X.00V r0 = r1.Ao9
            android.content.Context r3 = X.C000500i.A00(r0)
            X.00S r0 = r1.A04
            X.00H r2 = X.C000200d.A00(r0)
            X.00S r0 = r1.ABB
            X.00H r0 = X.C000200d.A00(r0)
            X.79F r1 = new X.79F
            r1.<init>(r3, r6, r2, r0)
            X.5ey r0 = r9.A03
            if (r0 == 0) goto L_0x0315
            r0.setDownloadListener(r1)
        L_0x0315:
            boolean r0 = r9.A4j()
            if (r0 == 0) goto L_0x0324
            android.view.Window r1 = r9.getWindow()
            r0 = 8192(0x2000, float:1.14794E-41)
            r1.setFlags(r0, r0)
        L_0x0324:
            X.6oO r0 = r9.A4b()
            X.5ey r0 = r0.A00
            X.6oO r3 = r9.A4b()
            if (r0 != 0) goto L_0x037e
            X.5ey r2 = r9.A03
            android.content.Intent r1 = r9.getIntent()
            java.lang.String r0 = "clear_webview"
            boolean r0 = r1.getBooleanExtra(r0, r5)
            if (r0 == 0) goto L_0x033f
            r2 = 0
        L_0x033f:
            r3.A00 = r2
            X.5ey r0 = r9.A03
            if (r0 == 0) goto L_0x0348
            r9.A4g(r0)
        L_0x0348:
            r0 = 2131432921(0x7f0b15d9, float:1.8487613E38)
            android.view.View r3 = X.AnonymousClass3MY.A0C(r9, r0)
            com.whatsapp.webview.ui.views.WebViewNavigationBarView r3 = (com.whatsapp.webview.ui.views.WebViewNavigationBarView) r3
            boolean r0 = r9.A0K
            if (r0 == 0) goto L_0x0378
            X.0ve r2 = r9.A0E
            r1 = 11114(0x2b6a, float:1.5574E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0378
            r3.setVisibility(r4)
            r3.setUpWithLiveData(r9)
        L_0x0367:
            X.6oO r0 = r9.A4b()
            X.1DS r2 = r0.A07
            X.81u r1 = new X.81u
            r1.<init>(r9)
            r0 = 41
            X.AnonymousClass7AS.A00(r9, r2, r1, r0)
            return
        L_0x0378:
            r0 = 8
            r3.setVisibility(r0)
            goto L_0x0367
        L_0x037e:
            java.lang.String r0 = r3.A03
            r9.CRU(r0)
            X.6oO r0 = r9.A4b()
            java.lang.String r0 = r0.A02
            if (r0 != 0) goto L_0x038d
            java.lang.String r0 = ""
        L_0x038d:
            r9.CRT(r0)
            goto L_0x0348
        L_0x0391:
            java.lang.String r0 = "mediaPickerLauncherFactory"
            goto L_0x0399
        L_0x0394:
            java.lang.String r0 = "webViewVersionsUtils"
            goto L_0x0399
        L_0x0397:
            java.lang.String r0 = "downloadListenerFactory"
        L_0x0399:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.webview.ui.WaInAppBrowsingActivity.onCreate(android.os.Bundle):void");
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int i;
        if (C72453Mb.A0B(menuItem) == 2131432656) {
            CRT(C18070vi.A0F(this, 2131898511));
            CRU("");
            C110125ey r0 = this.A03;
            if (r0 != null) {
                r0.reload();
            }
            i = 25;
        } else if (menuItem.getItemId() == 2131432655) {
            C110125ey r3 = this.A03;
            if (r3 != null) {
                if (this.A0A != null) {
                    if (URLUtil.isHttpsUrl(r3.getUrl())) {
                        A5E.A00().A03().A05(r3.getContext(), AnonymousClass3MY.A07(C108955ca.A0F(r3.getUrl())));
                    } else {
                        C108955ca.A1H(r3, 2131898503, -1);
                    }
                    i = 21;
                } else {
                    C18070vi.A11("webViewIntentUtils");
                    throw null;
                }
            }
            return super.onOptionsItemSelected(menuItem);
        } else {
            String str = null;
            if (menuItem.getItemId() == 2131432653) {
                ClipboardManager A092 = this.A08.A09();
                if (A092 != null) {
                    try {
                        C110125ey r02 = this.A03;
                        if (r02 != null) {
                            str = r02.getUrl();
                        }
                        A092.setPrimaryClip(ClipData.newPlainText("url", str));
                        A4e(22);
                        C110125ey r2 = this.A03;
                        if (r2 != null) {
                            C108955ca.A1H(r2, 2131898510, -1);
                        }
                    } catch (NullPointerException | SecurityException e) {
                        Log.e("WaInAppBrowsingActivity/onOptionsItemSelected", e);
                    }
                }
            } else {
                if (menuItem.getItemId() == 2131432658) {
                    if (this.A0A != null) {
                        C110125ey r03 = this.A03;
                        if (r03 != null) {
                            str = r03.getUrl();
                        }
                        C138376wy.A00(this, str);
                        i = 23;
                    }
                } else if (menuItem.getItemId() == 2131432654 && this.A03 != null) {
                    C138376wy r04 = this.A0A;
                    if (r04 != null) {
                        AnonymousClass3MW.A0a(r04.A00).A01(this, "about-viewing-business-websites");
                    }
                }
                C18070vi.A11("webViewIntentUtils");
                throw null;
            }
            return super.onOptionsItemSelected(menuItem);
        }
        A4e(i);
        return super.onOptionsItemSelected(menuItem);
    }

    public static final Intent A0Q(WaInAppBrowsingActivity waInAppBrowsingActivity) {
        Intent A0A2 = C17880vN.A0A();
        String stringExtra = waInAppBrowsingActivity.getIntent().getStringExtra("webview_callback");
        if (stringExtra != null) {
            A0A2.putExtra("webview_callback", stringExtra);
        }
        return A0A2;
    }

    public void A4f(int i, Intent intent) {
        setResult(i, intent);
        finish();
    }

    public void A4g(WebView webView) {
        C110125ey r0;
        CRT(C18070vi.A0F(this, 2131898511));
        String stringExtra = getIntent().getStringExtra("webview_url");
        if (A4k(stringExtra)) {
            return;
        }
        if (AnonymousClass3MY.A1a(getIntent(), "webview_post_on_initial_request")) {
            String stringExtra2 = getIntent().getStringExtra("webview_initial_body_params");
            if (stringExtra2 == null) {
                stringExtra2 = "";
            }
            C110125ey r1 = this.A03;
            if (r1 != null) {
                C17960vV.A07(stringExtra);
                r1.postUrl(stringExtra, C108975cc.A1O(stringExtra2));
            }
        } else if (stringExtra != null && (r0 = this.A03) != null) {
            r0.loadUrl(stringExtra);
        }
    }

    public void A4h(TextView textView, TextView textView2, Toolbar toolbar, AppBarLayout appBarLayout, WaImageView waImageView) {
        C18070vi.A0h(appBarLayout, toolbar);
        if (!this.A0Q) {
            AnonymousClass3MX.A1A(this, appBarLayout, AnonymousClass1YL.A00(this, 2130970830, 2131102245));
        }
        C74743cP A002 = AnonymousClass3NL.A00(this, this.A00, 2131231675);
        A002.setColorFilter(AnonymousClass3Ma.A01(this, getResources(), 2130969324, 2131100309), PorterDuff.Mode.SRC_ATOP);
        toolbar.setNavigationIcon((Drawable) A002);
        toolbar.setNavigationOnClickListener(new AnonymousClass785(this, 16));
    }

    public void C0Q(PermissionRequest permissionRequest) {
        String[] resources = permissionRequest.getResources();
        if (resources != null && resources.length == 1 && "android.webkit.resource.VIDEO_CAPTURE".equals(resources[0])) {
            AnonymousClass00H r0 = this.A0D;
            if (r0 != null) {
                C130266j9 r3 = (C130266j9) r0.get();
                if (!C18020vd.A05(C18040vf.A02, r3.A05, 10464)) {
                    return;
                }
                if (r3.A04.A04(AnonymousClass73I.A01()) != 0) {
                    r3.A02.A08(2131898302, 1);
                } else if (r3.A03.A00("android.hardware.camera.any")) {
                    r3.A01 = true;
                    C73203Rj A002 = AnonymousClass4a6.A00(this);
                    A002.A0S(C17880vN.A0q(this, permissionRequest.getOrigin().getHost(), new Object[1], 0, 2131898506));
                    A002.A0i(this, new AnonymousClass7AH(permissionRequest, r3, 20), getString(2131886648));
                    A002.A0h(this, new AnonymousClass7AH(permissionRequest, r3, 21), getString(2131887174));
                    A002.A0G(new C1411774p(permissionRequest, r3));
                    r3.A00 = A002.A0C();
                }
            } else {
                C18070vi.A11("videoCapturePermissionHandler");
                throw null;
            }
        }
    }

    public C130516jY CCt() {
        boolean booleanExtra = getIntent().getBooleanExtra("clear_webview", true);
        C130516jY r2 = new C130516jY();
        r2.A06 = this.A0N;
        r2.A03 = booleanExtra;
        r2.A01 = getIntent().getStringExtra("webview_session_id");
        return r2;
    }

    public void CRT(String str) {
        A4b().A02 = str;
        if (getSupportActionBar() != null) {
            String stringExtra = getIntent().getStringExtra("webview_title");
            WaTextView waTextView = (WaTextView) AnonymousClass3MY.A0H(this, 2131437048);
            if (stringExtra != null && stringExtra.length() != 0) {
                waTextView.setText(stringExtra);
            } else if (str.length() > 0) {
                waTextView.setText(str);
            }
            if (this.A0P) {
                C72463Mc.A0y(this, waTextView, 2130970831, 2131102246);
                waTextView.A0L();
            }
        }
    }

    public void CRU(String str) {
        CharSequence A032;
        A4b().A03 = str;
        if (getSupportActionBar() != null && str != null && !"about:blank".equals(str) && !getIntent().getBooleanExtra("webview_hide_url", false)) {
            TextView textView = (TextView) AnonymousClass3MY.A0H(this, 2131437049);
            WaTextView waTextView = (WaTextView) AnonymousClass3MY.A0H(this, 2131437048);
            if (str.length() == 0) {
                C72463Mc.A0y(this, waTextView, 2130971113, 2131102439);
                waTextView.A0L();
                textView.setVisibility(8);
                A032 = "";
            } else {
                C72463Mc.A0y(this, waTextView, 2130970831, 2131102246);
                waTextView.A0J();
                String host = C108955ca.A0F(str).getHost();
                if (host != null && C108955ca.A1Z("www.", host)) {
                    host = C108955ca.A0z(host, 4);
                }
                textView.setVisibility(0);
                Spanned fromHtml = Html.fromHtml(AnonymousClass001.A1H("i ", host, AnonymousClass000.A10()));
                A032 = C72813Np.A03(textView.getPaint(), AnonymousClass4aX.A08(AnonymousClass3MX.A06(this, 2131233337), AnonymousClass3Ma.A00(this, 2130969234, 2131100231)), fromHtml);
            }
            textView.setText(A032);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.A03 != null && CCt().A03) {
            C110125ey r1 = this.A03;
            if (r1 != null) {
                r1.clearCache(true);
            }
            C137536vc.A00(this.A03);
            this.A03 = null;
        }
    }

    public /* synthetic */ boolean BeT(String str) {
        return false;
    }

    public WebResourceResponse C3Q(String str) {
        return null;
    }
}
