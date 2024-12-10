package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.whatsapp.util.Log;
import com.whatsapp.videoplayback.YoutubePlayerTouchOverlay;
import java.io.InputStream;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: X.6Ms  reason: invalid class name and case insensitive filesystem */
public class C122086Ms extends AnonymousClass70X {
    public int A00 = 0;
    public int A01 = 0;
    public int A02 = 1;
    public int A03 = -1;
    public long A04 = -9223372036854775807L;
    public C21132Af0 A05;
    public JSONObject A06;
    public boolean A07 = false;
    public boolean A08 = false;
    public Bitmap[] A09;
    public final Context A0A;
    public final ViewGroup A0B;
    public final WebView A0C;
    public final AnonymousClass1L9 A0D;
    public final AnonymousClass1KB A0E;
    public final C24149BwF A0F;
    public final YoutubePlayerTouchOverlay A0G;
    public final Bitmap A0H;
    public final C18030ve A0I;
    public final C32011gU A0J;
    public final String A0K;

    public static void A00(C122086Ms r3) {
        Log.i("InlineYoutubeVideoPlayer/loadDataWithBaseURL");
        C18030ve r2 = r3.A0I;
        if (r2 == null || !C18020vd.A05(C18040vf.A01, r2, 12633)) {
            A01(r3);
        } else {
            AnonymousClass7RJ.A00(r3.A0E, r3, 18);
        }
    }

    public static void A01(C122086Ms r10) {
        Log.i("InlineYoutubeVideoPlayer/loadWebViewDataWithBaseURL");
        WebView webView = r10.A0C;
        Locale locale = Locale.US;
        String str = r10.A0K;
        C17960vV.A06(str);
        Object[] A1a = AnonymousClass3MW.A1a();
        JSONObject jSONObject = r10.A06;
        C17960vV.A07(jSONObject);
        A1a[0] = jSONObject;
        webView.loadDataWithBaseURL("https://whatsapp.com", String.format(locale, str, A1a), "text/html", C19620yd.A0A, "https://youtube.com");
    }

    public static void A02(C122086Ms r11, String str, int i) {
        JSONObject jSONObject;
        int i2;
        YoutubePlayerTouchOverlay youtubePlayerTouchOverlay = r11.A0G;
        youtubePlayerTouchOverlay.setInlineVideoPlaybackControlView(r11.A0F);
        youtubePlayerTouchOverlay.A00 = i;
        C108975cc.A0v(youtubePlayerTouchOverlay, i);
        WebView webView = r11.A0C;
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setMediaPlaybackRequiresUserGesture(false);
        webView.getSettings().setUserAgentString(WebSettings.getDefaultUserAgent(r11.A0A));
        webView.getSettings().setAllowFileAccess(false);
        webView.getSettings().setAllowUniversalAccessFromFileURLs(false);
        webView.addJavascriptInterface(new C131766ld(r11), "YoutubeJsInterface");
        C18070vi.A0d(r11.A0J, 0);
        String A022 = C63712tZ.A02(Uri.parse(C32011gU.A00(str)));
        int i3 = 0;
        try {
            String queryParameter = Uri.parse(str).getQueryParameter("t");
            if (queryParameter != null) {
                if (queryParameter.contains("h")) {
                    String[] split = queryParameter.split("h");
                    i2 = Integer.parseInt(split[0]) * 3600;
                    queryParameter = split[1];
                } else {
                    i2 = 0;
                }
                if (queryParameter.contains("m")) {
                    String[] split2 = queryParameter.split("m");
                    i2 += Integer.parseInt(split2[0]) * 60;
                    queryParameter = split2[1];
                }
                if (queryParameter.contains("s")) {
                    queryParameter = queryParameter.split("s")[0];
                }
                i3 = i2 + Integer.parseInt(queryParameter);
            }
        } catch (Exception unused) {
        }
        if (A022 == null) {
            A03(r11, "Unable to parse youtube id.", "youtube_id_parse_failed", false);
            return;
        }
        try {
            JSONObject A15 = C17880vN.A15();
            JSONObject A152 = C17880vN.A15();
            A152.put("onReady", "onPlayerReady").put("onError", "onPlayerError").put("onStateChange", "onPlayerStateChange");
            A15.put("start", i3).put("rel", 0).put("modestbranding", 0).put("iv_load_policy", 3).put("autohide", 1).put("autoplay", 1).put("cc_load_policy", 1).put("playsinline", 1).put("controls", 0);
            jSONObject = C17880vN.A15().put("videoId", A022).put("events", A152).put("height", "100%").put("width", "100%").put("playerVars", A15);
        } catch (Exception e) {
            Log.e((Throwable) e);
            jSONObject = null;
        }
        r11.A06 = jSONObject;
        if (jSONObject == null) {
            A03(r11, "Invalid player params.", "invalid_player_params", true);
            return;
        }
        webView.setWebViewClient(new C110155f1(r11));
        r11.A09 = new Bitmap[]{r11.A0H};
        webView.setWebChromeClient(new C110085eu(r11, 1));
    }

    public C122086Ms(Context context, Bitmap bitmap, AnonymousClass1L9 r9, AnonymousClass1KB r10, C18030ve r11, C32011gU r12, C56912iE r13, C63172sd r14, AnonymousClass206 r15, C24149BwF bwF, String str, int i) {
        String str2;
        boolean z;
        InputStream openRawResource;
        this.A0A = context;
        this.A0I = r11;
        this.A0E = r10;
        this.A0J = r12;
        this.A0D = r9;
        this.A0H = bitmap;
        this.A0F = bwF;
        Log.i("InlineYoutubeVideoPlayer/init");
        if (r15 != null && r13.A00(r15)) {
            C21132Af0 af0 = new C21132Af0();
            if (!r15.A0t()) {
                AnonymousClass10I r5 = r14.A02;
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append(r15.A0v.A01);
                r5.CGO(new AnonymousClass7R0(r14, r15, af0, 22), AnonymousClass000.A0y("counterAbuseTokenUtils", A10));
            } else {
                C134706r1 A002 = C63172sd.A00(r14, r15);
                if (A002 != null) {
                    af0.A0B(A002);
                } else {
                    af0.A0C(new C122876Sg());
                }
            }
            this.A05 = af0;
        }
        try {
            openRawResource = this.A0A.getResources().openRawResource(2132017264);
            str2 = new String(AnonymousClass1EY.A04(openRawResource));
            if (openRawResource != null) {
                openRawResource.close();
            }
        } catch (Exception e) {
            Log.e((Throwable) e);
            A03(this, "Unable to load youtube html frame.", "youtube_html_frame_load_failed", false);
            str2 = null;
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
        }
        this.A0K = str2;
        if (r11 != null) {
            z = C18020vd.A05(C18040vf.A01, r11, 12633);
        } else {
            z = false;
        }
        LayoutInflater from = LayoutInflater.from(context);
        String str3 = str;
        int i2 = i;
        if (z) {
            ViewGroup viewGroup = (ViewGroup) from.inflate(2131625704, (ViewGroup) null);
            this.A0B = viewGroup;
            this.A0G = (YoutubePlayerTouchOverlay) AnonymousClass1HF.A06(viewGroup, 2131437098);
            this.A0C = new WebView(context);
            r10.A0J(new C21454AkL(this, str3, i2, 13));
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) from.inflate(2131625703, (ViewGroup) null);
        this.A0B = viewGroup2;
        this.A0G = (YoutubePlayerTouchOverlay) AnonymousClass1HF.A06(viewGroup2, 2131437098);
        this.A0C = (WebView) AnonymousClass1HF.A06(viewGroup2, 2131437099);
        A02(this, str3, i2);
        return;
        throw th;
    }

    public static void A03(C122086Ms r2, String str, String str2, boolean z) {
        String A1H = AnonymousClass001.A1H("InlineYoutubeVideoPlayer: ", str, AnonymousClass000.A10());
        AnonymousClass88Q r0 = r2.A09;
        if (r0 != null) {
            r0.BtC(A1H, str2, z);
        }
    }
}
