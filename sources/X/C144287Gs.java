package X;

import android.content.Context;
import android.net.Uri;
import android.webkit.CookieManager;
import com.whatsapp.util.Log;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.7Gs  reason: invalid class name and case insensitive filesystem */
public final class C144287Gs implements AnonymousClass879 {
    public C110125ey A00;
    public C22821Di A01;
    public final URL A02;

    public void CCw(Context context, C22821Di r8) {
        String str;
        try {
            this.A01 = r8;
            if (this.A00 == null) {
                if (context == null) {
                    str = "FlowsLogger/WebCachePruner.makeWebView - Activity context is cleaned up";
                } else if (!context.getPackageManager().hasSystemFeature("android.software.webview")) {
                    str = "FlowsLogger/WebCachePruner.makeWebView - WebView feature is not supported.";
                } else {
                    C110125ey r1 = new C110125ey(context);
                    this.A00 = r1;
                    C137536vc.A01(r1);
                    r1.clearCache(true);
                    CookieManager.getInstance().setAcceptCookie(false);
                    C110125ey r0 = this.A00;
                    if (r0 != null) {
                        r0.getSettings().setJavaScriptEnabled(true);
                    }
                    C110125ey r12 = this.A00;
                    if (r12 != null) {
                        r12.A03(new AnonymousClass6ZC());
                    }
                    C110125ey r13 = this.A00;
                    if (r13 != null) {
                        r13.A04(new C114145qE(this));
                    }
                }
                Log.e(str);
            }
            URL url = this.A02;
            Uri A0F = C108955ca.A0F(url.toString());
            ArrayList A0z = C17880vN.A0z(4);
            List asList = Arrays.asList(new String[]{"https"});
            if (!asList.isEmpty()) {
                C133646pF A002 = C114195qJ.A00(A0F, A0z, asList);
                C110125ey r14 = this.A00;
                if (r14 != null) {
                    r14.A01 = A002;
                    r14.loadUrl(url.toString());
                    return;
                }
                return;
            }
            throw AnonymousClass000.A0k("Cannot set 0 schemes");
        } catch (Exception e) {
            C108995ce.A1M("FlowsLogger/WebCachePruner.makeWebView - Exception while cleaning up web cache ", AnonymousClass000.A10(), e);
        }
    }

    public C144287Gs(URL url) {
        this.A02 = url;
    }
}
