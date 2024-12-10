package com.whatsapp.webview.ui;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass033;
import X.AnonymousClass10E;
import X.AnonymousClass118;
import X.AnonymousClass1HF;
import X.AnonymousClass1KB;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass6VO;
import X.AnonymousClass6YO;
import X.AnonymousClass79G;
import X.AnonymousClass7PF;
import X.AnonymousClass7PG;
import X.AnonymousClass86G;
import X.AnonymousClass86H;
import X.BVJ;
import X.C108945cZ;
import X.C108965cb;
import X.C109315dF;
import X.C110125ey;
import X.C113915ny;
import X.C114115qB;
import X.C114165qG;
import X.C130516jY;
import X.C133236oO;
import X.C137536vc;
import X.C137806w3;
import X.C160948As;
import X.C17990va;
import X.C18070vi;
import X.C27691Xc;
import X.C27701Xd;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebStorage;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.whatsapp.util.Log;

public final class WebViewWrapperView extends FrameLayout implements AnonymousClass009 {
    public ViewStub A00;
    public ProgressBar A01;
    public C110125ey A02;
    public AnonymousClass1KB A03;
    public AnonymousClass118 A04;
    public AnonymousClass86G A05;
    public AnonymousClass86H A06;
    public C130516jY A07;
    public AnonymousClass031 A08;
    public boolean A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WebViewWrapperView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        if (!this.A09) {
            this.A09 = true;
            C27691Xc r1 = (C27691Xc) ((AnonymousClass033) generatedComponent());
            this.A05 = (AnonymousClass86G) r1.A0G.get();
            this.A06 = (AnonymousClass86H) r1.A0H.get();
            AnonymousClass10E r12 = r1.A10;
            this.A03 = AnonymousClass10E.A12(r12);
            this.A04 = AnonymousClass3MZ.A0l(r12);
        }
        View A092 = AnonymousClass3MX.A09(LayoutInflater.from(context), this, 2131627613);
        C18070vi.A0z(A092, "null cannot be cast to non-null type android.widget.FrameLayout");
        addView(A092);
        this.A01 = (ProgressBar) AnonymousClass1HF.A06(A092, 2131434185);
        this.A00 = (ViewStub) C18070vi.A05(A092, 2131437053);
    }

    public final void setChromeClientFactory(AnonymousClass86G r2) {
        C18070vi.A0d(r2, 0);
        this.A05 = r2;
    }

    public final void setClientFactory(AnonymousClass86H r2) {
        C18070vi.A0d(r2, 0);
        this.A06 = r2;
    }

    public final void setGlobalUI(AnonymousClass1KB r2) {
        C18070vi.A0d(r2, 0);
        this.A03 = r2;
    }

    public final void setWaContext(AnonymousClass118 r2) {
        C18070vi.A0d(r2, 0);
        this.A04 = r2;
    }

    public final void setWebViewDelegate(C160948As r15) {
        BVJ bvj;
        C160948As r7 = r15;
        C18070vi.A0d(r15, 0);
        C110125ey r1 = this.A02;
        if (r1 != null) {
            C130516jY CCt = r15.CCt();
            this.A07 = CCt;
            Context A0E = C108945cZ.A0E(getWaContext());
            if (C137806w3.A00("START_SAFE_BROWSING")) {
                AnonymousClass79G r3 = new AnonymousClass79G(2);
                C113915ny r2 = C137806w3.A0l;
                if (r2.A00()) {
                    AnonymousClass6VO.A00(A0E, r3);
                } else if (r2.A01()) {
                    AnonymousClass6YO.A00.BZf().initSafeBrowsing(A0E, r3);
                } else {
                    throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                }
            }
            C137536vc.A01(r1);
            int i = CCt.A00;
            CookieManager instance = CookieManager.getInstance();
            if (i == 0) {
                instance.setAcceptCookie(false);
            } else if (i != 1) {
                r1.getSettings().setDomStorageEnabled(true);
                instance.setAcceptCookie(true);
                instance.setAcceptThirdPartyCookies(r1, true);
            } else {
                instance.removeAllCookies((ValueCallback) null);
                WebStorage.getInstance().deleteAllData();
                r1.getSettings().setDomStorageEnabled(true);
                instance.setAcceptCookie(true);
            }
            instance.flush();
            if (CCt.A02) {
                r1.clearCache(true);
            }
            AnonymousClass86H clientFactory = getClientFactory();
            ViewStub viewStub = this.A00;
            AnonymousClass10E r32 = ((AnonymousClass7PG) clientFactory).A00.A00;
            r1.A04(new C114165qG(viewStub, AnonymousClass3MY.A0N(r32), AnonymousClass10E.A12(r32), r7, (C133236oO) r32.A00.A5D.get()));
            AnonymousClass86G chromeClientFactory = getChromeClientFactory();
            ProgressBar progressBar = this.A01;
            C27701Xd r33 = ((AnonymousClass7PF) chromeClientFactory).A00;
            r1.A03(new C114115qB(progressBar, AnonymousClass3MZ.A0N(r33.A00), CCt, r15, C27691Xc.A05(r33.A01)));
            boolean z = r1 instanceof BVJ;
            if (z && (bvj = (BVJ) r1) != null) {
                bvj.A00 = r15;
            }
            boolean Bfd = r15.Bfd();
            if (z) {
                r1.setNestedScrollingEnabled(Bfd);
            }
            if (CCt.A06) {
                r1.getSettings().setSupportMultipleWindows(true);
            }
        }
    }

    private final Resources A00(Resources resources) {
        if (!(resources instanceof C17990va)) {
            return resources;
        }
        Resources resources2 = ((C17990va) resources).A00;
        C18070vi.A0X(resources2);
        return A00(resources2);
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A08;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A08 = r0;
        }
        return r0.generatedComponent();
    }

    public final AnonymousClass86G getChromeClientFactory() {
        AnonymousClass86G r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("chromeClientFactory");
        throw null;
    }

    public final AnonymousClass86H getClientFactory() {
        AnonymousClass86H r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("clientFactory");
        throw null;
    }

    public final AnonymousClass1KB getGlobalUI() {
        AnonymousClass1KB r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1C();
        throw null;
    }

    public final AnonymousClass118 getWaContext() {
        AnonymousClass118 r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("waContext");
        throw null;
    }

    public void onDetachedFromWindow() {
        C110125ey r0;
        C130516jY r3 = this.A07;
        if (r3 == null || r3.A03) {
            if (r3 != null && 1 == r3.A00) {
                CookieManager.getInstance().removeAllCookies((ValueCallback) null);
                CookieManager.getInstance().flush();
                WebStorage.getInstance().deleteAllData();
            }
            C130516jY r02 = this.A07;
            if (!(r02 == null || !r02.A02 || (r0 = this.A02) == null)) {
                r0.clearCache(true);
            }
            C137536vc.A00(this.A02);
            this.A02 = null;
            super.onDetachedFromWindow();
        }
    }

    public final C110125ey getWebView() {
        return this.A02;
    }

    public final void setCustomOrCreateWebView(C110125ey r6) {
        ViewGroup viewGroup;
        View rootView = getRootView();
        C18070vi.A0X(rootView);
        Resources A002 = A00(AnonymousClass3MX.A05(rootView));
        C110125ey r2 = null;
        if (r6 == null) {
            try {
                r6 = new BVJ(new C109315dF(AnonymousClass3MY.A04(rootView), A002));
            } catch (Exception e) {
                Log.e("WebViewWrapperView/createAndInsertWebView() can't create webview", e);
            }
        }
        r6.setId(2131432252);
        C108965cb.A12(r6, -1);
        ViewParent parent = r6.getParent();
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            viewGroup.removeView(r6);
        }
        AnonymousClass3MW.A0C(rootView, 2131437050).addView(r6, 0);
        r2 = r6;
        this.A02 = r2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WebViewWrapperView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C18070vi.A0d(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WebViewWrapperView(Context context) {
        this(context, (AttributeSet) null);
        C18070vi.A0d(context, 1);
    }
}
