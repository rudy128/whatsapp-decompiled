package X;

import android.content.Context;
import android.webkit.WebMessagePort;
import com.whatsapp.util.Log;
import org.json.JSONObject;

/* renamed from: X.7Gq  reason: invalid class name and case insensitive filesystem */
public final class C144267Gq implements AnonymousClass890 {
    public C110125ey A00;
    public Integer A01 = AnonymousClass00R.A00;
    public Long A02;
    public boolean A03;
    public final C18030ve A04;
    public final Runnable A05 = C146747Ql.A00(this, 30);
    public final AnonymousClass1KB A06;
    public final AnonymousClass11P A07;

    public final void A00() {
        this.A03 = false;
        C137536vc.A00(this.A00);
        this.A00 = null;
    }

    public final void A01(Context context) {
        C18070vi.A0d(context, 0);
        if (!context.getPackageManager().hasSystemFeature("android.software.webview")) {
            Log.e("FlowsLogger/FlowsWebPreloader.preloadWebView - WebView feature is not supported.");
            return;
        }
        C18030ve r2 = this.A04;
        C18040vf r1 = C18040vf.A02;
        if (!C18020vd.A05(r1, r2, 8869)) {
            long A002 = ((long) C18020vd.A00(r1, r2, 7154)) * 60000;
            Long l = this.A02;
            if (l != null && l.longValue() + A002 > System.currentTimeMillis()) {
                return;
            }
        }
        this.A06.A0J(new C146797Qq(this, context, 8));
    }

    public void CAV(String str) {
    }

    public C144267Gq(AnonymousClass1KB r2, AnonymousClass11P r3, C18030ve r4) {
        C18070vi.A0o(r2, r4, r3);
        this.A06 = r2;
        this.A04 = r4;
        this.A07 = r3;
    }

    public void CAU(WebMessagePort webMessagePort, JSONObject jSONObject) {
        A00();
    }
}
