package X;

import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.URLUtil;
import android.widget.Toast;
import com.whatsapp.util.Log;
import com.whatsapp.webview.ui.WaInAppBrowsingActivity;

/* renamed from: X.79F  reason: invalid class name */
public final class AnonymousClass79F implements DownloadListener {
    public static final C41661wr A05 = new C41661wr("[\\\\/%\"]");
    public final AnonymousClass00H A00;
    public final C18100vl A01 = AnonymousClass1DF.A00(AnonymousClass00R.A0C, new C155027s5(this));
    public final Context A02;
    public final C126826dM A03;
    public final AnonymousClass00H A04;

    public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        C126826dM r0;
        Object r4;
        if (str == null) {
            Log.e("SecureWebViewDownloadListener/onDownloadStart/ url is null");
            return;
        }
        Uri A0F = C108955ca.A0F(str);
        String host = A0F.getHost();
        if (host == null || !AnonymousClass3MW.A11(this.A01).contains(C108975cc.A0d(host))) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("SecureWebViewDownloadListener/onDownloadStart/ host ");
            A10.append(A0F.getHost());
            C17890vO.A19(A10, " is not allowlisted for download");
            r0 = this.A03;
            r4 = new AnonymousClass6Q3(str);
        } else {
            DownloadManager.Request request = new DownloadManager.Request(A0F);
            String guessFileName = URLUtil.guessFileName(str, str3, str4);
            C18070vi.A0X(guessFileName);
            String A002 = A05.A00(guessFileName, "_");
            request.addRequestHeader("Cookie", CookieManager.getInstance().getCookie(str));
            request.addRequestHeader("User-Agent", ((AnonymousClass11W) this.A04.get()).A02());
            request.setTitle(A002);
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, A002);
            request.setNotificationVisibility(1);
            Log.i("SecureWebViewDownloadListener/onDownloadStart/ enqueueing download");
            Context context = this.A02;
            Object systemService = context.getSystemService("download");
            C18070vi.A0z(systemService, "null cannot be cast to non-null type android.app.DownloadManager");
            ((DownloadManager) systemService).enqueue(request);
            Toast.makeText(context, 2131889568, 1).show();
            r0 = this.A03;
            r4 = new AnonymousClass6Q4(str);
        }
        WaInAppBrowsingActivity waInAppBrowsingActivity = r0.A00;
        if (C18020vd.A05(C18040vf.A02, waInAppBrowsingActivity.A0E, 12181) && (r4 instanceof AnonymousClass6Q3)) {
            if (waInAppBrowsingActivity.A07 != null) {
                waInAppBrowsingActivity.startActivity(C72473Md.A0D(waInAppBrowsingActivity.getIntent().getStringExtra("webview_url")));
                C110125ey r2 = waInAppBrowsingActivity.A03;
                if (r2 == null) {
                    return;
                }
                if (!r2.canGoBack()) {
                    waInAppBrowsingActivity.A4b().A00();
                    waInAppBrowsingActivity.finish();
                } else if (C18070vi.A18(((AnonymousClass6Q3) r4).A00, r2.getUrl())) {
                    r2.goBack();
                }
            } else {
                AnonymousClass3MW.A1F();
                throw null;
            }
        }
    }

    public AnonymousClass79F(Context context, C126826dM r4, AnonymousClass00H r5, AnonymousClass00H r6) {
        C18070vi.A0k(r5, r6);
        this.A02 = context;
        this.A00 = r5;
        this.A04 = r6;
        this.A03 = r4;
    }
}
