package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.text.Html;
import android.util.Patterns;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.7Fe  reason: invalid class name and case insensitive filesystem */
public class C143887Fe implements C201511a {
    public static final Pattern A0V = Pattern.compile("(?i)\\bcharset=\\s*\"?([^\\s;\"]*)", 34);
    public static final Pattern A0W = Pattern.compile("<head[^>]*>(.*)</head>", 34);
    public static final Pattern A0X = Pattern.compile("\\s*([^=]+)\\s*=\\s*(?:\"([^\"]+)\"|\\'([^\\']+)\\')", 34);
    public static final Pattern A0Y = Pattern.compile("<link([^>]+?)/?>", 34);
    public static final Pattern A0Z = Pattern.compile("https://(www\\.)?pbs\\.twimg\\.com/profile_images", 2);
    public static final Pattern A0a = Pattern.compile("https://(www\\.)?pbs\\.twimg\\.com", 2);
    public static final Set A0b = AnonymousClass1AP.A01("og:image", "og:image:type", "og:video", "og:video:type", "og:video:url", "og:video:secure_url", "og:video:width", "og:video:height", "image", "og:thumbnail", "thumbnail", "twitter:image", "og:title", "title", "twitter:title", "og:description", "description", "twitter:description", "og:url", "og:site_name", "twitter:url", "invite_link_type_v2", "parent_group_subject", "og:is_fb_video", "og:should_overlay_share_button", "og:should_overlay_share_button_wa_preq_test");
    public static final Pattern A0c = Pattern.compile("<meta([^>]+?)/?>", 34);
    public static final Pattern A0d = Pattern.compile("<title[^>]*>(.*)</title>", 34);
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public AnonymousClass64L A04;
    public AnonymousClass6g9 A05;
    public C24004Btq A06;
    public Integer A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public HashMap A0C = C17880vN.A11();
    public LinkedHashSet A0D = C17880vN.A14();
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public byte[] A0I;
    public byte[] A0J;
    public byte[] A0K;
    public long A0L;
    public long A0M;
    public long A0N;
    public Bitmap A0O;
    public boolean A0P;
    public final AnonymousClass181 A0Q;
    public final C18030ve A0R;
    public final String A0S;
    public final C18100vl A0T = AnonymousClass7S3.A00(this, 0);
    public final C32011gU A0U;

    private final AnonymousClass6g9 A01(Map map, String... strArr) {
        AnonymousClass6g9 A002;
        int length = strArr.length;
        int i = 0;
        while (true) {
            HttpURLConnection httpURLConnection = null;
            if (i >= length) {
                return null;
            }
            String A0s = C17880vN.A0s(strArr[i], map);
            if (A0s != null && Patterns.WEB_URL.matcher(A0s).matches()) {
                try {
                    httpURLConnection = A05((String) null, new URL(A0s));
                    if (!(httpURLConnection == null || (A002 = A00(A0s, httpURLConnection.getHeaderField("Content-Type"), httpURLConnection.getContentLength())) == null)) {
                        A09(httpURLConnection);
                        return A002;
                    }
                } catch (IOException e) {
                    Log.w("WebPageInfo/getGifOnPage Cannot connect.", e);
                } catch (Throwable th) {
                    A09((HttpURLConnection) null);
                    throw th;
                }
                A09(httpURLConnection);
            }
            i++;
        }
    }

    public static final String A04(HashMap hashMap, String... strArr) {
        for (String A1G : strArr) {
            String A1G2 = C108945cZ.A1G(A1G, hashMap);
            if (A1G2 != null) {
                int length = A1G2.length() - 1;
                int i = 0;
                boolean z = false;
                while (i <= length) {
                    int i2 = length;
                    if (!z) {
                        i2 = i;
                    }
                    boolean A0u = C109005cf.A0u(A1G2, i2);
                    if (z) {
                        if (!A0u) {
                            break;
                        }
                        length--;
                    } else if (!A0u) {
                        z = true;
                    } else {
                        i++;
                    }
                }
                return C108985cd.A0g(length, i, A1G2);
            }
        }
        return null;
    }

    public static final HttpURLConnection A05(String str, URL url) {
        URL url2;
        try {
            URI uri = new URI(url.toString());
            if (!C18070vi.A18(uri.getScheme(), "https")) {
                uri = new URI("https", uri.getUserInfo(), uri.getHost(), uri.getPort(), uri.getPath(), uri.getQuery(), uri.getFragment());
            }
            url2 = new URL(uri.toASCIIString());
        } catch (MalformedURLException | URISyntaxException unused) {
            url2 = null;
        }
        if (url2 == null) {
            return null;
        }
        URLConnection openConnection = url2.openConnection();
        C18070vi.A0X(openConnection);
        if (!(openConnection instanceof HttpURLConnection)) {
            return null;
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
        httpURLConnection.setConnectTimeout(SearchActionVerificationClientService.NOTIFICATION_ID);
        httpURLConnection.setReadTimeout(SearchActionVerificationClientService.NOTIFICATION_ID);
        if (str != null) {
            httpURLConnection.setRequestProperty("Accept-Language", str);
        }
        httpURLConnection.setRequestProperty("User-Agent", "WhatsApp/2.23.20.0");
        return httpURLConnection;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00c5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        X.CDX.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00c9, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00cc, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00cd, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00d0, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final byte[] A0B(X.C143887Fe r11, java.lang.Integer r12, java.lang.String r13, int r14) {
        /*
            r1 = 0
            if (r13 == 0) goto L_0x00d1
            int r0 = r13.length()
            if (r0 == 0) goto L_0x00d1
            java.net.URL r3 = new java.net.URL
            r3.<init>(r13)
            java.lang.String r2 = r3.toString()
            java.lang.String r0 = X.C19620yd.A0A
            java.lang.String r0 = java.net.URLDecoder.decode(r13, r0)
            boolean r0 = X.C18070vi.A18(r2, r0)
            if (r0 == 0) goto L_0x0046
            java.lang.String r4 = r3.getProtocol()
            java.lang.String r5 = r3.getUserInfo()
            java.lang.String r6 = r3.getHost()
            int r7 = r3.getPort()
            java.lang.String r8 = r3.getPath()
            java.lang.String r9 = r3.getQuery()
            java.lang.String r10 = r3.getRef()
            java.net.URI r3 = new java.net.URI
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            java.net.URL r3 = r3.toURL()
            X.C18070vi.A0X(r3)
        L_0x0046:
            java.net.HttpURLConnection r4 = A05(r1, r3)
            if (r4 == 0) goto L_0x00d1
            r0 = 10000(0x2710, float:1.4013E-41)
            r4.setConnectTimeout(r0)
            r0 = 20000(0x4e20, float:2.8026E-41)
            r4.setReadTimeout(r0)
            java.lang.Integer r8 = X.AnonymousClass00R.A00
            if (r12 != r8) goto L_0x0070
            X.64L r0 = r11.A04
            if (r0 == 0) goto L_0x0070
            int r3 = r4.getResponseCode()
            r0 = 206(0xce, float:2.89E-43)
            if (r3 != r0) goto L_0x0079
            X.64L r1 = r11.A04
            if (r1 == 0) goto L_0x0070
            java.lang.Boolean r0 = X.AnonymousClass000.A0i()
            r1.A06 = r0
        L_0x0070:
            X.181 r1 = r11.A0Q
            r0 = 23
            X.9Hb r4 = X.C108995ce.A0N(r1, r4, r0)
            goto L_0x008d
        L_0x0079:
            X.64L r2 = r11.A04
            if (r2 == 0) goto L_0x007f
            r2.A06 = r1
        L_0x007f:
            int r1 = r3 / 100
            r0 = 2
            if (r1 == r0) goto L_0x0070
            if (r2 == 0) goto L_0x0070
            java.lang.Long r0 = X.C17880vN.A0n(r3)
            r2.A0E = r0
            goto L_0x0070
        L_0x008d:
            java.io.ByteArrayOutputStream r6 = X.C108945cZ.A15()     // Catch:{ all -> 0x00ca }
            r7 = 1024(0x400, float:1.435E-42)
            byte[] r5 = new byte[r7]     // Catch:{ all -> 0x00c3 }
            r3 = 0
            r2 = 0
        L_0x0097:
            int r1 = r4.read(r5, r3, r7)     // Catch:{ all -> 0x00c3 }
            r0 = -1
            if (r1 != r0) goto L_0x00a3
            byte[] r0 = r6.toByteArray()     // Catch:{ all -> 0x00c3 }
            goto L_0x00ac
        L_0x00a3:
            r6.write(r5, r3, r1)     // Catch:{ all -> 0x00c3 }
            int r2 = r2 + r1
            if (r2 <= r14) goto L_0x0097
            if (r12 != r8) goto L_0x00bd
            goto L_0x00b3
        L_0x00ac:
            r6.close()     // Catch:{ all -> 0x00ca }
            r4.close()
            return r0
        L_0x00b3:
            X.64L r1 = r11.A04     // Catch:{ all -> 0x00c3 }
            if (r1 == 0) goto L_0x00bd
            java.lang.Boolean r0 = X.AnonymousClass000.A0i()     // Catch:{ all -> 0x00c3 }
            r1.A03 = r0     // Catch:{ all -> 0x00c3 }
        L_0x00bd:
            X.6QU r0 = new X.6QU     // Catch:{ all -> 0x00c3 }
            r0.<init>()     // Catch:{ all -> 0x00c3 }
            throw r0     // Catch:{ all -> 0x00c3 }
        L_0x00c3:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00c5 }
        L_0x00c5:
            r0 = move-exception
            X.CDX.A00(r6, r1)     // Catch:{ all -> 0x00ca }
            throw r0     // Catch:{ all -> 0x00ca }
        L_0x00ca:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00cc }
        L_0x00cc:
            r0 = move-exception
            X.CDX.A00(r4, r1)
            throw r0
        L_0x00d1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C143887Fe.A0B(X.7Fe, java.lang.Integer, java.lang.String, int):byte[]");
    }

    public final void A0F() {
        this.A0B = null;
        this.A0A = null;
        this.A08 = null;
        this.A0D.clear();
        this.A0P = false;
        this.A02 = 0;
        this.A0E = false;
        this.A0G = false;
        this.A0H = false;
        this.A0C.clear();
    }

    public final void A0G(C19760yx r27, C18030ve r28) {
        String str;
        int i;
        int i2;
        int i3;
        Integer num = null;
        C19760yx r3 = r27;
        if (r27 != null) {
            str = (String) r3.A00;
        } else {
            str = null;
        }
        this.A0L = 0;
        long currentTimeMillis = System.currentTimeMillis();
        byte[] A0B2 = A0B(this, AnonymousClass00R.A00, str, C18020vd.A00(C18040vf.A02, r28, 3937) * EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH);
        if (A0B2 != null) {
            this.A0J = A0N(A0B2, 100, 100, 140, 140, false, false);
            if (str == null || str.length() == 0 || !A0Z.matcher(C32011gU.A00(str)).find() || this.A03 != 0) {
                if (this.A03 == 4) {
                    i = this.A01;
                    if (i > 1024) {
                        i = EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
                    }
                } else {
                    i = 300;
                }
                int i4 = this.A01;
                int i5 = this.A00;
                if (i4 > i5) {
                    i2 = i4;
                    if (i4 > 1024) {
                        i2 = EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
                    }
                    i3 = (i5 * i2) / i4;
                } else {
                    int i6 = i5;
                    if (i5 > 1024) {
                        i6 = EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
                    }
                    i2 = (i6 * i4) / i5;
                    if (i2 < 300) {
                        i3 = (i5 * 300) / i4;
                        i2 = 300;
                    } else {
                        i3 = i6;
                    }
                }
                this.A0K = A0N(A0B2, i, 75, i2, i3, true, false);
            }
            if (r27 != null) {
                num = (Integer) r3.A01;
            }
            AnonymousClass64L r0 = this.A04;
            if (r0 != null) {
                r0.A0A = num;
            }
            this.A0L = System.currentTimeMillis() - currentTimeMillis;
        }
    }

    public void A0H(C18030ve r7) {
        C18070vi.A0d(r7, 0);
        if (this.A0D.size() > 2) {
            Locale locale = Locale.US;
            Object[] objArr = new Object[1];
            C17880vN.A1T(objArr, this.A0D.size() - 2, 0);
            C108955ca.A1W("WebPageInfo/loadThumbRetrySmall Remaining %d thumbnails will not be loaded.", locale, Arrays.copyOf(objArr, 1));
        }
        int i = 0;
        for (C19760yx r2 : C29431cG.A0v(this.A0D, 2)) {
            i++;
            AnonymousClass64L r1 = this.A04;
            if (r1 != null) {
                r1.A0F = C17880vN.A0n(i);
            }
            try {
                A0G(r2, r7);
            } catch (AnonymousClass6QU unused) {
                Log.w("WebPageInfo/loadThumbRetrySmall Cannot fetch large thumbnail");
            }
        }
    }

    public final void A0I(C18030ve r4) {
        C18070vi.A0d(r4, 0);
        if (!this.A0D.isEmpty()) {
            A0G(((C19760yx[]) this.A0D.toArray(new C19760yx[0]))[0], r4);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0200, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:?, code lost:
        X.CDX.A00(r9, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0204, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0207, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:?, code lost:
        X.CDX.A00(r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x020b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:?, code lost:
        r0 = X.C108955ca.A13(r3);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:133:0x020c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:145:0x0233 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:154:0x0263 */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01af A[Catch:{ all -> 0x0200 }] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x01dc A[Catch:{ all -> 0x0200 }] */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0219  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x021d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x02ac  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x02bc A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x01d8 A[EDGE_INSN: B:199:0x01d8->B:111:0x01d8 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:204:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00d8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0J(X.C18030ve r20, java.lang.String r21) {
        /*
            r19 = this;
            r0 = 1
            r8 = r20
            X.C18070vi.A0d(r8, r0)
            X.64L r0 = new X.64L
            r0.<init>()
            r4 = r19
            r4.A04 = r0
            r0 = 0
            r4.A0M = r0
            long r16 = android.os.SystemClock.uptimeMillis()
            java.net.URI r0 = r4.A06()
            java.net.URL r6 = r0.toURL()
            X.C18070vi.A0b(r6)
            r0 = r21
            java.net.HttpURLConnection r5 = A05(r0, r6)
            r14 = 0
            if (r5 == 0) goto L_0x02cc
            r0 = 1
            r5.setInstanceFollowRedirects(r0)
            r13 = 2
            r3 = 0
            r5.connect()     // Catch:{ ProtocolException -> 0x0039 }
            int r1 = r5.getResponseCode()     // Catch:{ ProtocolException -> 0x0039 }
            goto L_0x0055
        L_0x0039:
            r2 = move-exception
            java.lang.String r0 = r2.toString()
            java.lang.String r1 = X.C108975cc.A0d(r0)
            java.lang.String r0 = "too many redirects"
            boolean r0 = X.AnonymousClass1YF.A0Y(r1, r0, r3)
            if (r0 != 0) goto L_0x0053
            java.lang.String r0 = "too many follow-up requests"
            boolean r0 = X.AnonymousClass1YF.A0Y(r1, r0, r3)
            if (r0 != 0) goto L_0x0053
            throw r2
        L_0x0053:
            r1 = 303(0x12f, float:4.25E-43)
        L_0x0055:
            int r0 = r1 / 100
            if (r0 != r13) goto L_0x006a
            r0 = 206(0xce, float:2.89E-43)
            if (r1 != r0) goto L_0x0067
            X.64L r1 = r4.A04
            if (r1 == 0) goto L_0x0067
            java.lang.Boolean r0 = X.AnonymousClass000.A0i()
            r1.A02 = r0
        L_0x0067:
            r7 = 0
            goto L_0x0133
        L_0x006a:
            r12 = 3
            if (r0 == r12) goto L_0x007c
            r4.A09(r5)
            X.64L r2 = r4.A04
            if (r2 == 0) goto L_0x02cc
            long r0 = (long) r1
        L_0x0075:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0C = r0
            return
        L_0x007c:
            r4.A09(r5)
            java.net.HttpURLConnection r11 = A05(r14, r6)
            r5 = r11
            if (r11 == 0) goto L_0x02cc
            r11.setInstanceFollowRedirects(r3)
            r11.connect()
            int r10 = r11.getResponseCode()
            java.lang.String r15 = ""
            r9 = 0
        L_0x0093:
            int r0 = r10 / 100
            if (r0 != r12) goto L_0x0114
            r0 = 20
            if (r9 >= r0) goto L_0x0114
            java.lang.String r0 = "Location"
            java.lang.String r7 = r11.getHeaderField(r0)
            if (r7 == 0) goto L_0x0114
            int r0 = r7.length()
            if (r0 == 0) goto L_0x0114
            java.lang.String r0 = "Set-Cookie"
            java.lang.String r2 = r11.getHeaderField(r0)
            if (r2 == 0) goto L_0x00da
            java.lang.String r0 = ";"
            java.util.List r1 = X.C108965cb.A0v(r2, r0, r3)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0111
            java.util.ListIterator r0 = X.C108955ca.A18(r1)
        L_0x00c1:
            boolean r18 = r0.hasPrevious()
            if (r18 == 0) goto L_0x0111
            int r18 = X.C108985cd.A08(r0)
            if (r18 == 0) goto L_0x00c1
            java.util.List r0 = X.C108985cd.A0t(r1, r0)
        L_0x00d1:
            java.lang.String[] r1 = X.C108955ca.A1b(r0)
            int r0 = r1.length
            if (r0 == 0) goto L_0x00da
            r2 = r1[r3]
        L_0x00da:
            if (r15 == 0) goto L_0x00ec
            int r0 = r15.length()
            if (r0 == 0) goto L_0x00ec
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r15)
            java.lang.String r0 = "; "
            java.lang.String r15 = X.AnonymousClass000.A0y(r0, r1)
        L_0x00ec:
            java.lang.String r15 = X.C17900vP.A0A(r15, r2)
            r4.A09(r11)
            java.net.URL r0 = new java.net.URL
            r0.<init>(r7)
            java.net.HttpURLConnection r11 = A05(r14, r0)
            if (r11 == 0) goto L_0x0114
            r11.setInstanceFollowRedirects(r3)
            java.lang.String r0 = "Cookie"
            r11.setRequestProperty(r0, r15)
            r11.connect()
            int r10 = r11.getResponseCode()
            int r9 = r9 + 1
            r5 = r11
            goto L_0x0093
        L_0x0111:
            X.0wS r0 = X.C18460wS.A00
            goto L_0x00d1
        L_0x0114:
            int r0 = r10 / 100
            if (r0 == r13) goto L_0x0122
            r4.A09(r5)
            X.64L r2 = r4.A04
            if (r2 == 0) goto L_0x02cc
            long r0 = (long) r10
            goto L_0x0075
        L_0x0122:
            r0 = 206(0xce, float:2.89E-43)
            if (r10 != r0) goto L_0x0130
            X.64L r1 = r4.A04
            if (r1 == 0) goto L_0x0130
            java.lang.Boolean r0 = X.AnonymousClass000.A0i()
            r1.A02 = r0
        L_0x0130:
            if (r5 != 0) goto L_0x0067
            return
        L_0x0133:
            java.lang.String r0 = "Content-Type"
            java.lang.String r1 = r5.getHeaderField(r0)     // Catch:{ all -> 0x02c7 }
            if (r1 == 0) goto L_0x017b
            java.util.regex.Pattern r0 = A0V     // Catch:{ all -> 0x02c7 }
            java.util.regex.Matcher r1 = r0.matcher(r1)     // Catch:{ all -> 0x02c7 }
            boolean r0 = r1.find()     // Catch:{ all -> 0x02c7 }
            if (r0 == 0) goto L_0x017b
            r0 = 1
            java.lang.String r10 = r1.group(r0)     // Catch:{ all -> 0x02c7 }
            X.C17960vV.A07(r10)     // Catch:{ all -> 0x02c7 }
            X.C18070vi.A0X(r10)     // Catch:{ all -> 0x02c7 }
            int r9 = r10.length()     // Catch:{ all -> 0x02c7 }
            int r9 = r9 - r0
            r2 = 0
            r11 = 0
        L_0x0159:
            if (r2 > r9) goto L_0x017e
            r0 = r9
            if (r11 != 0) goto L_0x015f
            r0 = r2
        L_0x015f:
            char r1 = r10.charAt(r0)     // Catch:{ all -> 0x02c7 }
            r0 = 32
            int r0 = X.C18070vi.A00(r1, r0)     // Catch:{ all -> 0x02c7 }
            boolean r0 = X.C108975cc.A1A(r0)
            if (r11 != 0) goto L_0x0176
            if (r0 != 0) goto L_0x0173
            r11 = 1
            goto L_0x0159
        L_0x0173:
            int r2 = r2 + 1
            goto L_0x0159
        L_0x0176:
            if (r0 == 0) goto L_0x017e
            int r9 = r9 + -1
            goto L_0x0159
        L_0x017b:
            java.lang.String r12 = ""
            goto L_0x0186
        L_0x017e:
            java.lang.String r0 = X.C108985cd.A0g(r9, r2, r10)     // Catch:{ all -> 0x02c7 }
            java.lang.String r12 = X.C108975cc.A0e(r0)     // Catch:{ all -> 0x02c7 }
        L_0x0186:
            java.lang.String r13 = r5.getContentType()     // Catch:{ all -> 0x02c7 }
            int r15 = r5.getContentLength()     // Catch:{ all -> 0x02c7 }
            r1 = 3938(0xf62, float:5.518E-42)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ all -> 0x02c7 }
            int r0 = X.C18020vd.A00(r0, r8, r1)     // Catch:{ all -> 0x02c7 }
            r10 = 1024(0x400, float:1.435E-42)
            int r2 = r0 * 1024
            X.181 r1 = r4.A0Q     // Catch:{ OutOfMemoryError -> 0x020c }
            r0 = 23
            X.9Hb r8 = X.C108995ce.A0N(r1, r5, r0)     // Catch:{ OutOfMemoryError -> 0x020c }
            java.io.ByteArrayOutputStream r9 = X.C108945cZ.A15()     // Catch:{ all -> 0x0205 }
            byte[] r1 = new byte[r10]     // Catch:{ all -> 0x01fe }
        L_0x01a8:
            int r11 = r8.read(r1, r7, r10)     // Catch:{ all -> 0x01fe }
            r0 = -1
            if (r11 == r0) goto L_0x01d8
            r9.write(r1, r7, r11)     // Catch:{ all -> 0x01fe }
            int r3 = r3 + r11
            if (r3 <= r2) goto L_0x01b6
            goto L_0x01ce
        L_0x01b6:
            byte[] r0 = r9.toByteArray()     // Catch:{ all -> 0x01fe }
            X.C18070vi.A0X(r0)     // Catch:{ all -> 0x01fe }
            java.lang.String r11 = X.C108955ca.A13(r0)     // Catch:{ all -> 0x01fe }
            java.util.regex.Pattern r0 = A0W     // Catch:{ all -> 0x01fe }
            java.util.regex.Matcher r0 = r0.matcher(r11)     // Catch:{ all -> 0x01fe }
            boolean r0 = r0.find()     // Catch:{ all -> 0x01fe }
            if (r0 == 0) goto L_0x01a8
            goto L_0x01d8
        L_0x01ce:
            X.64L r1 = r4.A04     // Catch:{ all -> 0x01fe }
            if (r1 == 0) goto L_0x01d8
            java.lang.Boolean r0 = X.AnonymousClass000.A0i()     // Catch:{ all -> 0x01fe }
            r1.A00 = r0     // Catch:{ all -> 0x01fe }
        L_0x01d8:
            X.64L r10 = r4.A04     // Catch:{ all -> 0x01fe }
            if (r10 == 0) goto L_0x01f0
            float r1 = (float) r3     // Catch:{ all -> 0x01fe }
            r0 = 1176256512(0x461c4000, float:10000.0)
            float r1 = r1 / r0
            double r0 = (double) r1     // Catch:{ all -> 0x01fe }
            double r2 = java.lang.Math.ceil(r0)     // Catch:{ all -> 0x01fe }
            r0 = 4621819117588971520(0x4024000000000000, double:10.0)
            double r2 = r2 * r0
            long r0 = (long) r2     // Catch:{ all -> 0x01fe }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x01fe }
            r10.A0D = r0     // Catch:{ all -> 0x01fe }
        L_0x01f0:
            byte[] r3 = r9.toByteArray()     // Catch:{ all -> 0x01fe }
            X.C18070vi.A0X(r3)     // Catch:{ all -> 0x01fe }
            r9.close()     // Catch:{ all -> 0x0205 }
            r8.close()     // Catch:{ OutOfMemoryError -> 0x020c }
            goto L_0x0216
        L_0x01fe:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0200 }
        L_0x0200:
            r0 = move-exception
            X.CDX.A00(r9, r1)     // Catch:{ all -> 0x0205 }
            throw r0     // Catch:{ all -> 0x0205 }
        L_0x0205:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0207 }
        L_0x0207:
            r0 = move-exception
            X.CDX.A00(r8, r1)     // Catch:{ OutOfMemoryError -> 0x020c }
            throw r0     // Catch:{ OutOfMemoryError -> 0x020c }
        L_0x020c:
            java.lang.System.gc()     // Catch:{ all -> 0x02c7 }
            java.lang.String r0 = "WebPageInfo/readData OutOfMemoryError"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x02c7 }
            byte[] r3 = new byte[r7]     // Catch:{ all -> 0x02c7 }
        L_0x0216:
            int r2 = r3.length     // Catch:{ all -> 0x02c7 }
            if (r2 != 0) goto L_0x021d
            r4.A09(r5)
            return
        L_0x021d:
            int r0 = r12.length()     // Catch:{ UnsupportedEncodingException -> 0x0233 }
            if (r0 != 0) goto L_0x022e
            java.nio.charset.Charset r1 = X.C26571Sq.A05     // Catch:{ UnsupportedEncodingException -> 0x0233 }
        L_0x0225:
            X.C18070vi.A0b(r1)     // Catch:{ UnsupportedEncodingException -> 0x0233 }
            java.lang.String r0 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0233 }
            r0.<init>(r3, r1)     // Catch:{ UnsupportedEncodingException -> 0x0233 }
            goto L_0x0237
        L_0x022e:
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r12)     // Catch:{ UnsupportedEncodingException -> 0x0233 }
            goto L_0x0225
        L_0x0233:
            java.lang.String r0 = X.C108955ca.A13(r3)     // Catch:{ all -> 0x02c7 }
        L_0x0237:
            r10 = r4
            r11 = r0
            r14 = r6
            java.lang.String r9 = r10.A03(r11, r12, r13, r14, r15)     // Catch:{ all -> 0x02c7 }
            int r0 = r12.length()     // Catch:{ all -> 0x02c7 }
            if (r0 != 0) goto L_0x0263
            if (r9 == 0) goto L_0x0263
            int r0 = r9.length()     // Catch:{ all -> 0x02c7 }
            if (r0 == 0) goto L_0x0263
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r9)     // Catch:{ UnsupportedEncodingException -> 0x0263 }
            X.C18070vi.A0X(r1)     // Catch:{ UnsupportedEncodingException -> 0x0263 }
            java.lang.String r0 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0263 }
            r0.<init>(r3, r1)     // Catch:{ UnsupportedEncodingException -> 0x0263 }
            r4.A0F()     // Catch:{ UnsupportedEncodingException -> 0x0263 }
            r7 = r4
            r8 = r0
            r10 = r13
            r11 = r6
            r12 = r15
            r7.A03(r8, r9, r10, r11, r12)     // Catch:{ UnsupportedEncodingException -> 0x0263 }
        L_0x0263:
            long r0 = (long) r2     // Catch:{ all -> 0x02c7 }
            r4.A0N = r0     // Catch:{ all -> 0x02c7 }
            r4.A09(r5)
            java.lang.String r1 = r4.A0B
            if (r1 == 0) goto L_0x027f
            int r0 = r1.length()
            if (r0 == 0) goto L_0x027f
            X.0vl r0 = r4.A0T
            boolean r0 = X.C72453Mb.A1a(r0)
            java.lang.String r0 = A02(r0, r1)
            r4.A0B = r0
        L_0x027f:
            java.lang.String r1 = r4.A0A
            if (r1 == 0) goto L_0x0295
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0295
            X.0vl r0 = r4.A0T
            boolean r0 = X.C72453Mb.A1a(r0)
            java.lang.String r1 = A02(r0, r1)
            r4.A0A = r1
        L_0x0295:
            java.lang.String r0 = r4.A0B
            if (r0 == 0) goto L_0x029f
            int r0 = r0.length()
            if (r0 != 0) goto L_0x02c5
        L_0x029f:
            if (r1 == 0) goto L_0x02a7
            int r0 = r1.length()
            if (r0 != 0) goto L_0x02c5
        L_0x02a7:
            r3 = 0
        L_0x02a8:
            X.64L r2 = r4.A04
            if (r2 == 0) goto L_0x02b2
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r2.A01 = r0
        L_0x02b2:
            long r0 = android.os.SystemClock.uptimeMillis()
            long r0 = r0 - r16
            r4.A0M = r0
            if (r3 == 0) goto L_0x02cc
            if (r2 == 0) goto L_0x02cc
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0B = r0
            return
        L_0x02c5:
            r3 = 1
            goto L_0x02a8
        L_0x02c7:
            r0 = move-exception
            r4.A09(r5)
            throw r0
        L_0x02cc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C143887Fe.A0J(X.0ve, java.lang.String):void");
    }

    public boolean A0L() {
        return false;
    }

    public final byte[] A0M(Bitmap bitmap, boolean z) {
        Bitmap bitmap2 = bitmap;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width > height) {
            width = height;
        }
        int i = width;
        if (width > 140) {
            width = 140;
        }
        return A0A(bitmap2, new Rect((bitmap.getWidth() - i) / 2, (bitmap.getHeight() - i) / 2, (bitmap.getWidth() + i) / 2, (bitmap.getHeight() + i) / 2), width, width, 80, z);
    }

    public final byte[] A0N(byte[] bArr, int i, int i2, int i3, int i4, boolean z, boolean z2) {
        byte[] A0M2;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        byte[] bArr2 = bArr;
        BitmapFactory.decodeByteArray(bArr2, 0, bArr2.length, options);
        int i5 = options.outWidth;
        this.A01 = i5;
        int i6 = options.outHeight;
        this.A00 = i6;
        if (i5 < i || i6 < i2) {
            return null;
        }
        options.inDither = true;
        options.inScaled = false;
        options.inPreferQualityOverSpeed = true;
        if (this.A0F) {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        int i7 = i3;
        int i8 = i4;
        Bitmap bitmap = AnonymousClass204.A0C(new AnonymousClass25O(options, (Long) null, i7, i8, !z), bArr2).A02;
        if (bitmap == null) {
            return null;
        }
        boolean z3 = z2;
        if (z) {
            A0M2 = A0A(bitmap, C108995ce.A0I(bitmap), i7, i8, 50, z3);
        } else {
            A0M2 = A0M(bitmap, z3);
        }
        bitmap.recycle();
        return A0M2;
    }

    private final AnonymousClass6g9 A00(String str, String str2, int i) {
        if (!"image/gif".equals(str2) || i == -1) {
            return null;
        }
        if (str.endsWith("giphy.gif")) {
            try {
                String host = new URI(str).getHost();
                C18070vi.A0b(host);
                if (AnonymousClass1YF.A0Y(host, "giphy.com", false)) {
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append(C108955ca.A0q(0, str.length() - 9, str));
                    A10.append("200.mp4");
                    str = A10.toString();
                    HttpURLConnection httpURLConnection = null;
                    try {
                        httpURLConnection = A05((String) null, new URL(str));
                        if (httpURLConnection != null) {
                            String headerField = httpURLConnection.getHeaderField("Content-Type");
                            if (C18070vi.A18(headerField, "video/mp4")) {
                                AnonymousClass6g9 r0 = new AnonymousClass6g9(str, httpURLConnection.getContentLength(), headerField);
                                A09(httpURLConnection);
                                return r0;
                            }
                        }
                    } catch (IOException e) {
                        Log.w("WebPageInfo/checkForMp4 Cannot connect.", e);
                    } catch (Throwable th) {
                        A09((HttpURLConnection) null);
                        throw th;
                    }
                    A09(httpURLConnection);
                }
            } catch (URISyntaxException e2) {
                Log.w("WebPageInfo/getGifInfo Cannot connect.", e2);
            }
        }
        return new AnonymousClass6g9(str, i, str2);
    }

    public static String A02(int i, String str) {
        if (i != 0) {
            return str;
        }
        String obj = Html.fromHtml(str).toString();
        C18070vi.A0b(obj);
        return obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01cd, code lost:
        X.AnonymousClass3Ma.A1P(r6, java.lang.Integer.valueOf(r7), r18);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0207, code lost:
        if (r12.equals("true") == false) goto L_0x0209;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0224, code lost:
        if (r0 != false) goto L_0x0226;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x022c, code lost:
        if (r6 == false) goto L_0x022e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0238, code lost:
        if (r11.equals("true") == false) goto L_0x023a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x02b2, code lost:
        if ("video/mp4".equalsIgnoreCase(X.C108945cZ.A1G("og:video:type", r2)) == false) goto L_0x02b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0341, code lost:
        if (r0 == false) goto L_0x0343;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x035b, code lost:
        if (X.AnonymousClass1YF.A0Y(r12, "embed", false) == false) goto L_0x0439;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x035d, code lost:
        if (r14 == false) goto L_0x0439;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x0437, code lost:
        if (r9 == false) goto L_0x0439;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0439, code lost:
        r11 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x045d, code lost:
        if (r0 != false) goto L_0x01cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x0660, code lost:
        if (r0 == false) goto L_0x0662;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x0446  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x044c  */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x0452  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x0458  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String A03(java.lang.String r26, java.lang.String r27, java.lang.String r28, java.net.URL r29, int r30) {
        /*
            r25 = this;
            r3 = r26
            java.util.regex.Pattern r0 = A0W
            java.util.regex.Matcher r1 = r0.matcher(r3)
            boolean r0 = r1.find()
            r4 = 1
            if (r0 == 0) goto L_0x0016
            java.lang.String r0 = r1.group(r4)
            if (r0 == 0) goto L_0x0016
            r3 = r0
        L_0x0016:
            java.util.HashMap r2 = X.C17880vN.A11()
            java.util.regex.Pattern r0 = A0c
            java.util.regex.Matcher r10 = r0.matcher(r3)
            r16 = 0
        L_0x0022:
            boolean r0 = r10.find()
            r5 = 0
            r1 = r25
            if (r0 == 0) goto L_0x00fc
            java.lang.String r0 = r10.group(r4)
            java.util.HashMap r9 = A07(r0)
            java.lang.String r8 = "content"
            int r0 = r27.length()
            if (r0 != 0) goto L_0x00b5
            java.lang.String r0 = "charset"
            java.lang.String r6 = X.C108945cZ.A1G(r0, r9)
            if (r6 == 0) goto L_0x0049
            int r0 = r6.length()
            if (r0 != 0) goto L_0x00a3
        L_0x0049:
            java.lang.String r0 = "http-equiv"
            java.lang.String r6 = X.C108945cZ.A1G(r0, r9)
            java.lang.String r0 = "Content-Type"
            boolean r0 = r0.equalsIgnoreCase(r6)
            if (r0 == 0) goto L_0x00b5
            java.lang.String r6 = X.C108945cZ.A1G(r8, r9)
            if (r6 == 0) goto L_0x00b5
            int r0 = r6.length()
            if (r0 == 0) goto L_0x00b5
            java.util.regex.Pattern r0 = A0V
            java.util.regex.Matcher r6 = r0.matcher(r6)
            boolean r0 = r6.find()
            if (r0 == 0) goto L_0x00b5
            java.lang.String r11 = r6.group(r4)
            X.C17960vV.A07(r11)
            X.C18070vi.A0X(r11)
            int r7 = r11.length()
            int r7 = r7 - r4
            r6 = 0
        L_0x007f:
            if (r6 > r7) goto L_0x0097
            r0 = r7
            if (r5 != 0) goto L_0x0085
            r0 = r6
        L_0x0085:
            boolean r0 = X.C109005cf.A0u(r11, r0)
            if (r5 != 0) goto L_0x0092
            if (r0 != 0) goto L_0x008f
            r5 = 1
            goto L_0x007f
        L_0x008f:
            int r6 = r6 + 1
            goto L_0x007f
        L_0x0092:
            if (r0 == 0) goto L_0x0097
            int r7 = r7 + -1
            goto L_0x007f
        L_0x0097:
            java.lang.String r0 = X.C108985cd.A0g(r7, r6, r11)
            java.lang.String r6 = X.C108975cc.A0e(r0)
            int r0 = r6.length()
        L_0x00a3:
            if (r0 <= 0) goto L_0x00b3
            java.lang.String r0 = X.C19620yd.A0A
            if (r0 == 0) goto L_0x00af
            boolean r0 = r0.equalsIgnoreCase(r6)
            if (r0 != 0) goto L_0x00b3
        L_0x00af:
            r1.A0F()
            return r6
        L_0x00b3:
            r16 = r6
        L_0x00b5:
            java.lang.String r0 = "property"
            java.lang.String r6 = X.C108945cZ.A1G(r0, r9)
            if (r6 == 0) goto L_0x00c3
            int r0 = r6.length()
            if (r0 != 0) goto L_0x00d9
        L_0x00c3:
            java.lang.String r0 = "name"
            java.lang.String r6 = X.C108945cZ.A1G(r0, r9)
            if (r6 == 0) goto L_0x00d1
            int r0 = r6.length()
            if (r0 != 0) goto L_0x00d9
        L_0x00d1:
            java.lang.String r0 = "itemprop"
            java.lang.String r6 = X.C108945cZ.A1G(r0, r9)
            if (r6 == 0) goto L_0x0022
        L_0x00d9:
            int r0 = r6.length()
            if (r0 == 0) goto L_0x0022
            java.util.Set r0 = A0b
            boolean r0 = r0.contains(r6)
            if (r0 == 0) goto L_0x0022
            java.lang.String r5 = X.C108945cZ.A1G(r8, r9)
            if (r5 == 0) goto L_0x0022
            X.0vl r0 = r1.A0T
            boolean r0 = X.C72453Mb.A1a(r0)
            java.lang.String r0 = A02(r0, r5)
            r2.put(r6, r0)
            goto L_0x0022
        L_0x00fc:
            java.lang.String r0 = X.C18070vi.A0H(r29)
            r7 = r28
            r6 = r30
            X.6g9 r7 = r1.A00(r0, r7, r6)
            if (r7 != 0) goto L_0x0138
            r0 = 3
            java.lang.String[] r7 = new java.lang.String[r0]
            java.lang.String r0 = "og:url"
            r7[r5] = r0
            java.lang.String r0 = "twitter:url"
            r7[r4] = r0
            r6 = 2
            java.lang.String r0 = "og:video"
            r7[r6] = r0
            X.6g9 r7 = r1.A01(r2, r7)
            if (r7 != 0) goto L_0x0138
            java.lang.String r0 = "og:image:type"
            java.lang.Object r6 = r2.get(r0)
            java.lang.String r0 = "image/gif"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x0138
            java.lang.String[] r6 = new java.lang.String[r4]
            java.lang.String r0 = "og:image"
            r6[r5] = r0
            X.6g9 r7 = r1.A01(r2, r6)
        L_0x0138:
            r1.A05 = r7
            r0 = 5
            java.lang.String[] r14 = new java.lang.String[r0]
            java.lang.String r9 = "og:image"
            r14[r5] = r9
            java.lang.String r13 = "twitter:image"
            r14[r4] = r13
            r0 = 2
            java.lang.String r12 = "image"
            r14[r0] = r12
            r0 = 3
            java.lang.String r11 = "og:thumbnail"
            r14[r0] = r11
            r6 = 4
            java.lang.String r0 = "thumbnail"
            r14[r6] = r0
            java.util.LinkedHashSet r18 = X.C17880vN.A14()
            r10 = 0
        L_0x0159:
            r15 = r14[r10]
            java.lang.String r8 = X.C108945cZ.A1G(r15, r2)
            if (r8 == 0) goto L_0x01d6
            X.64L r6 = r1.A04
            if (r6 == 0) goto L_0x016c
            int r0 = r15.hashCode()
            switch(r0) {
                case -1940224620: goto L_0x01b4;
                case -1137178311: goto L_0x01a7;
                case -436432438: goto L_0x019a;
                case 100313435: goto L_0x018d;
                default: goto L_0x016c;
            }
        L_0x016c:
            int r7 = r8.length()
            int r7 = r7 - r4
            r6 = 0
            r17 = 0
        L_0x0174:
            if (r6 > r7) goto L_0x01c1
            r0 = r7
            if (r17 != 0) goto L_0x017a
            r0 = r6
        L_0x017a:
            boolean r0 = X.C109005cf.A0u(r8, r0)
            if (r17 != 0) goto L_0x0188
            if (r0 != 0) goto L_0x0185
            r17 = 1
            goto L_0x0174
        L_0x0185:
            int r6 = r6 + 1
            goto L_0x0174
        L_0x0188:
            if (r0 == 0) goto L_0x01c1
            int r7 = r7 + -1
            goto L_0x0174
        L_0x018d:
            boolean r0 = r15.equals(r12)
            if (r0 == 0) goto L_0x016c
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r6.A07 = r0
            goto L_0x016c
        L_0x019a:
            boolean r0 = r15.equals(r11)
            if (r0 == 0) goto L_0x016c
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r6.A04 = r0
            goto L_0x016c
        L_0x01a7:
            boolean r0 = r15.equals(r9)
            if (r0 == 0) goto L_0x016c
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r6.A05 = r0
            goto L_0x016c
        L_0x01b4:
            boolean r0 = r15.equals(r13)
            if (r0 == 0) goto L_0x016c
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r6.A09 = r0
            goto L_0x016c
        L_0x01c1:
            java.lang.String r6 = X.C108985cd.A0g(r7, r6, r8)
            int r0 = r15.hashCode()
            switch(r0) {
                case -1940224620: goto L_0x0458;
                case -1137178311: goto L_0x0452;
                case -436432438: goto L_0x044c;
                case 100313435: goto L_0x0446;
                default: goto L_0x01cc;
            }
        L_0x01cc:
            r7 = 0
        L_0x01cd:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r0 = r18
            X.AnonymousClass3Ma.A1P(r6, r7, r0)
        L_0x01d6:
            int r10 = r10 + 1
            r0 = 5
            if (r10 < r0) goto L_0x0159
            r0 = r18
            r1.A0D = r0
            r8 = 1
            java.lang.String[] r6 = new java.lang.String[r4]
            java.lang.String r0 = "og:is_fb_video"
            r6[r5] = r0
            java.lang.String r12 = A04(r2, r6)
            java.lang.String[] r6 = new java.lang.String[r4]
            java.lang.String r0 = "og:should_overlay_share_button"
            r6[r5] = r0
            java.lang.String r11 = A04(r2, r6)
            java.lang.String[] r6 = new java.lang.String[r4]
            java.lang.String r0 = "og:should_overlay_share_button_wa_preq_test"
            r6[r5] = r0
            java.lang.String r10 = A04(r2, r6)
            java.lang.String r7 = "true"
            if (r12 == 0) goto L_0x0209
            boolean r6 = r12.equals(r7)
            r0 = 1
            if (r6 != 0) goto L_0x020a
        L_0x0209:
            r0 = 0
        L_0x020a:
            r1.A0E = r0
            if (r0 == 0) goto L_0x0231
            java.lang.String r6 = r29.getHost()
            X.C18070vi.A0b(r6)
            java.lang.String r0 = "facebook.com"
            boolean r0 = X.AnonymousClass1YF.A0Y(r6, r0, r5)
            if (r0 != 0) goto L_0x0226
            java.lang.String r0 = "fb.watch"
            boolean r0 = X.AnonymousClass1YF.A0Y(r6, r0, r5)
            r6 = 0
            if (r0 == 0) goto L_0x0227
        L_0x0226:
            r6 = 1
        L_0x0227:
            boolean r0 = r1.A0E
            if (r0 == 0) goto L_0x022e
            r0 = 1
            if (r6 != 0) goto L_0x022f
        L_0x022e:
            r0 = 0
        L_0x022f:
            r1.A0E = r0
        L_0x0231:
            if (r11 == 0) goto L_0x023a
            boolean r6 = r11.equals(r7)
            r0 = 1
            if (r6 != 0) goto L_0x023b
        L_0x023a:
            r0 = 0
        L_0x023b:
            r1.A0G = r0
            if (r10 == 0) goto L_0x0443
            boolean r0 = r10.equals(r7)
            if (r0 == 0) goto L_0x0443
        L_0x0245:
            r1.A0H = r8
            r10 = 3
            java.lang.String[] r6 = new java.lang.String[r10]
            java.lang.String r0 = "og:title"
            r6[r5] = r0
            java.lang.String r0 = "twitter:title"
            r6[r4] = r0
            java.lang.String r0 = "title"
            r12 = 2
            r6[r12] = r0
            java.lang.String r0 = A04(r2, r6)
            r1.A0B = r0
            java.lang.String[] r6 = new java.lang.String[r10]
            java.lang.String r0 = "og:description"
            r6[r5] = r0
            java.lang.String r0 = "twitter:description"
            r6[r4] = r0
            java.lang.String r0 = "description"
            r6[r12] = r0
            java.lang.String r0 = A04(r2, r6)
            r1.A0A = r0
            java.lang.String[] r6 = new java.lang.String[r12]
            java.lang.String r0 = "og:url"
            r6[r5] = r0
            java.lang.String r0 = "twitter:url"
            r6[r4] = r0
            java.lang.String r0 = A04(r2, r6)
            r1.A08 = r0
            if (r0 == 0) goto L_0x0289
            int r0 = r0.length()
            if (r0 != 0) goto L_0x029d
        L_0x0289:
            java.lang.String r6 = r29.getHost()
            if (r6 == 0) goto L_0x029d
            java.lang.String r0 = "call.whatsapp.com"
            boolean r0 = r6.equals(r0)
            if (r0 != r4) goto L_0x029d
            java.lang.String r0 = r29.toString()
            r1.A08 = r0
        L_0x029d:
            java.lang.String r8 = "og:video"
            boolean r0 = r2.containsKey(r8)
            java.lang.String r11 = "og:video:type"
            if (r0 == 0) goto L_0x02b4
            java.lang.String r6 = X.C108945cZ.A1G(r11, r2)
            java.lang.String r0 = "video/mp4"
            boolean r6 = r0.equalsIgnoreCase(r6)
            r0 = 1
            if (r6 != 0) goto L_0x02b5
        L_0x02b4:
            r0 = 0
        L_0x02b5:
            r1.A0P = r0
            if (r0 == 0) goto L_0x02e7
            java.lang.String r0 = "og:site_name"
            java.lang.String r6 = X.C108945cZ.A1G(r0, r2)
            java.lang.String r0 = "Facebook Watch"
            boolean r0 = r0.equalsIgnoreCase(r6)
            if (r0 == 0) goto L_0x02e7
            java.lang.String r6 = r1.A08
            if (r6 == 0) goto L_0x02e7
            int r0 = r6.length()
            if (r0 == 0) goto L_0x02e7
            android.net.Uri r0 = android.net.Uri.parse(r6)
            android.net.Uri$Builder r7 = r0.buildUpon()
            java.lang.String r6 = "fw"
            java.lang.String r0 = "1"
            android.net.Uri r0 = X.C17890vO.A0C(r7, r6, r0)
            java.lang.String r0 = r0.toString()
            r1.A08 = r0
        L_0x02e7:
            java.lang.String r0 = r1.A08
            if (r0 != 0) goto L_0x02ef
            java.lang.String r0 = X.C18070vi.A0H(r29)
        L_0x02ef:
            int r0 = X.C63712tZ.A01(r0)
            r1.A03 = r0
            java.lang.String[] r0 = new java.lang.String[r10]
            r0[r5] = r8
            java.lang.String r10 = "og:video:url"
            r0[r4] = r10
            java.lang.String r15 = "og:video:secure_url"
            r0[r12] = r15
            java.lang.String r12 = A04(r2, r0)
            int r7 = r1.A03
            java.lang.String r6 = X.C108945cZ.A1G(r11, r2)
            if (r7 == 0) goto L_0x0440
            r0 = 4
            if (r7 == r0) goto L_0x043c
            java.lang.String r0 = "video/mp4"
        L_0x0312:
            boolean r14 = r0.equalsIgnoreCase(r6)
        L_0x0316:
            int r13 = r1.A03
            r7 = 4
            X.0ve r11 = r1.A0R
            r6 = 12064(0x2f20, float:1.6905E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r11, r6)
            r11 = 1
            if (r0 == 0) goto L_0x0343
            java.lang.String r9 = X.C108945cZ.A1G(r9, r2)
            if (r9 == 0) goto L_0x0343
            int r0 = r9.length()
            if (r0 == 0) goto L_0x0343
            java.util.regex.Pattern r6 = A0Z
            java.lang.String r0 = X.C32011gU.A00(r9)
            java.util.regex.Matcher r0 = r6.matcher(r0)
            boolean r0 = r0.find()
            r9 = 1
            if (r0 != 0) goto L_0x0344
        L_0x0343:
            r9 = 0
        L_0x0344:
            r6 = 2
            if (r12 == 0) goto L_0x0436
            if (r13 == 0) goto L_0x0436
            java.lang.String r0 = r29.toString()
            boolean r0 = android.webkit.URLUtil.isHttpsUrl(r0)
            if (r0 == 0) goto L_0x0436
            if (r13 != r7) goto L_0x035d
            java.lang.String r0 = "embed"
            boolean r0 = X.AnonymousClass1YF.A0Y(r12, r0, r5)
            if (r0 == 0) goto L_0x0439
        L_0x035d:
            if (r14 == 0) goto L_0x0439
        L_0x035f:
            r1.A02 = r11
            if (r11 != 0) goto L_0x036d
            boolean r0 = r1.A0E
            if (r0 == 0) goto L_0x036d
            boolean r0 = r1.A0G
            if (r0 == 0) goto L_0x042d
            r1.A02 = r6
        L_0x036d:
            boolean r0 = r1.A0P
            r6 = 4
            if (r0 == 0) goto L_0x03b1
            int r0 = r1.A03
            if (r0 == 0) goto L_0x03b1
            if (r0 == r7) goto L_0x03b1
            r0 = 3
            java.lang.String[] r7 = X.C17880vN.A1b(r8, r10, r0, r4)
            r0 = 2
            r7[r0] = r15
            java.lang.String r9 = A04(r2, r7)
            if (r9 == 0) goto L_0x042b
            java.lang.String r0 = "og:video:width"
            java.lang.String r8 = X.C108945cZ.A1G(r0, r2)
            java.lang.String r0 = "og:video:height"
            java.lang.String r7 = X.C108945cZ.A1G(r0, r2)
            if (r8 == 0) goto L_0x0428
            int r0 = r8.length()
            if (r0 == 0) goto L_0x0428
            if (r7 == 0) goto L_0x0428
            int r0 = r7.length()
            if (r0 == 0) goto L_0x0428
            int r8 = java.lang.Integer.parseInt(r8)
            int r7 = java.lang.Integer.parseInt(r7)
        L_0x03aa:
            X.Btq r0 = new X.Btq
            r0.<init>(r9, r8, r7)
        L_0x03af:
            r1.A06 = r0
        L_0x03b1:
            java.util.LinkedHashSet r0 = r1.A0D
            java.util.LinkedHashSet r7 = new java.util.LinkedHashSet
            r7.<init>(r0)
            java.util.LinkedHashSet r0 = r1.A0D
            r0.clear()
            java.util.Iterator r15 = r7.iterator()
            X.C18070vi.A0X(r15)
        L_0x03c4:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0461
            java.lang.Object r13 = r15.next()
            X.0yx r13 = (X.C19760yx) r13
            java.lang.Object r11 = r13.A00
            java.lang.String r11 = (java.lang.String) r11
            int r0 = X.C108955ca.A05(r11)
            if (r0 <= 0) goto L_0x0422
            java.util.regex.Pattern r7 = A0a
            java.lang.String r0 = X.C32011gU.A00(r11)
            java.util.regex.Matcher r0 = r7.matcher(r0)
            boolean r0 = r0.find()
            if (r0 == 0) goto L_0x0422
            java.lang.String r14 = ":large"
            r12 = 2
            boolean r0 = r11.endsWith(r14)
            r10 = 3
            java.lang.String r9 = ":thumb"
            java.lang.String r8 = ":medium"
            java.lang.String r7 = ":small"
            if (r0 == 0) goto L_0x0404
            java.lang.String[] r0 = X.C17880vN.A1b(r8, r7, r10, r4)
            r0[r12] = r9
            r1.A08(r11, r14, r0)
            goto L_0x03c4
        L_0x0404:
            boolean r0 = r11.endsWith(r8)
            if (r0 == 0) goto L_0x0414
            java.lang.String[] r0 = X.C17880vN.A1b(r8, r7, r10, r4)
            r0[r12] = r9
            r1.A08(r11, r8, r0)
            goto L_0x03c4
        L_0x0414:
            boolean r0 = r11.endsWith(r7)
            if (r0 == 0) goto L_0x0422
            java.lang.String[] r0 = X.C17880vN.A1b(r7, r9, r12, r4)
            r1.A08(r11, r7, r0)
            goto L_0x03c4
        L_0x0422:
            java.util.LinkedHashSet r0 = r1.A0D
            r0.add(r13)
            goto L_0x03c4
        L_0x0428:
            r8 = -1
            r7 = -1
            goto L_0x03aa
        L_0x042b:
            r0 = 0
            goto L_0x03af
        L_0x042d:
            boolean r0 = r1.A0H
            if (r0 == 0) goto L_0x036d
            r0 = 3
            r1.A02 = r0
            goto L_0x036d
        L_0x0436:
            r11 = 7
            if (r9 != 0) goto L_0x035f
        L_0x0439:
            r11 = 0
            goto L_0x035f
        L_0x043c:
            java.lang.String r0 = "text/html"
            goto L_0x0312
        L_0x0440:
            r14 = 0
            goto L_0x0316
        L_0x0443:
            r8 = 0
            goto L_0x0245
        L_0x0446:
            boolean r0 = r15.equals(r12)
            r7 = 3
            goto L_0x045d
        L_0x044c:
            boolean r0 = r15.equals(r11)
            r7 = 5
            goto L_0x045d
        L_0x0452:
            boolean r0 = r15.equals(r9)
            r7 = 2
            goto L_0x045d
        L_0x0458:
            boolean r0 = r15.equals(r13)
            r7 = 1
        L_0x045d:
            if (r0 != 0) goto L_0x01cd
            goto L_0x01cc
        L_0x0461:
            java.util.LinkedHashSet r0 = r1.A0D
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0546
            java.util.regex.Pattern r0 = A0Y
            java.util.regex.Matcher r9 = r0.matcher(r3)
            r8 = 0
        L_0x0470:
            boolean r0 = r9.find()
            if (r0 == 0) goto L_0x04b3
            java.lang.String r0 = r9.group(r4)
            java.util.HashMap r7 = A07(r0)
            java.lang.String r0 = "rel"
            java.lang.String r10 = X.C108945cZ.A1G(r0, r7)
            if (r10 == 0) goto L_0x0470
            int r0 = r10.length()
            if (r0 == 0) goto L_0x0470
            java.lang.String r0 = "icon"
            boolean r0 = r0.equals(r10)
            if (r0 != 0) goto L_0x04ac
            java.lang.String r0 = "image_src"
            boolean r0 = r0.equals(r10)
            if (r0 != 0) goto L_0x04ac
            java.lang.String r0 = "apple-touch-icon-precomposed"
            boolean r0 = r0.equals(r10)
            if (r0 != 0) goto L_0x04ac
            java.lang.String r0 = "apple-touch-icon"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x0470
        L_0x04ac:
            java.lang.String r0 = "href"
            java.lang.Object r8 = r7.get(r0)
            goto L_0x0470
        L_0x04b3:
            if (r8 == 0) goto L_0x04c8
            X.64L r7 = r1.A04
            if (r7 == 0) goto L_0x04bf
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r7.A08 = r0
        L_0x04bf:
            java.util.LinkedHashSet r7 = r1.A0D
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            X.AnonymousClass3Ma.A1P(r8, r0, r7)
        L_0x04c8:
            java.util.LinkedHashSet r0 = r1.A0D
            java.util.LinkedHashSet r9 = X.C17880vN.A14()
            java.util.Iterator r11 = r0.iterator()
            X.C18070vi.A0X(r11)
        L_0x04d5:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0544
            java.lang.Object r8 = r11.next()
            X.C18070vi.A0X(r8)
            X.0yx r8 = (X.C19760yx) r8
            java.lang.Object r7 = r8.A00
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r0 = "WebPageInfo/ensureThumbUrl Bad URL"
            if (r7 == 0) goto L_0x0515
            int r10 = r7.length()
            if (r10 == 0) goto L_0x0515
            java.lang.String r10 = "http"
            r23 = 0
            boolean r10 = X.C108955ca.A1Z(r10, r7)
            if (r10 != 0) goto L_0x0515
            java.lang.String r10 = "//"
            boolean r10 = X.C108955ca.A1Z(r10, r7)
            if (r10 == 0) goto L_0x051d
            java.lang.StringBuilder r10 = X.AnonymousClass000.A10()
            java.lang.String r0 = r29.getProtocol()
            r10.append(r0)
            r0 = 58
            java.lang.String r7 = X.C17890vO.A0Z(r7, r10, r0)
        L_0x0515:
            if (r7 == 0) goto L_0x04d5
            java.lang.Object r0 = r8.A01
            X.AnonymousClass3Ma.A1P(r7, r0, r9)
            goto L_0x04d5
        L_0x051d:
            java.lang.String r18 = r29.getProtocol()     // Catch:{ MalformedURLException | URISyntaxException -> 0x053f }
            java.lang.String r19 = r29.getUserInfo()     // Catch:{ MalformedURLException | URISyntaxException -> 0x053f }
            java.lang.String r20 = r29.getHost()     // Catch:{ MalformedURLException | URISyntaxException -> 0x053f }
            int r21 = r29.getPort()     // Catch:{ MalformedURLException | URISyntaxException -> 0x053f }
            java.net.URI r17 = new java.net.URI     // Catch:{ MalformedURLException | URISyntaxException -> 0x053f }
            r22 = r7
            r24 = r23
            r17.<init>(r18, r19, r20, r21, r22, r23, r24)     // Catch:{ MalformedURLException | URISyntaxException -> 0x053f }
            java.net.URL r10 = r17.toURL()     // Catch:{ MalformedURLException | URISyntaxException -> 0x053f }
            java.lang.String r7 = r10.toString()     // Catch:{ MalformedURLException | URISyntaxException -> 0x053f }
            goto L_0x0515
        L_0x053f:
            r10 = move-exception
            com.whatsapp.util.Log.w(r0, r10)
            goto L_0x0515
        L_0x0544:
            r1.A0D = r9
        L_0x0546:
            java.util.HashMap r10 = r1.A0C
            java.lang.String r8 = "default_favicon_link"
            java.lang.StringBuilder r9 = X.AnonymousClass000.A10()
            java.net.URI r7 = r1.A06()
            java.lang.String r0 = "/"
            java.net.URI r0 = r7.resolve(r0)
            java.net.URL r0 = r0.toURL()
            r9.append(r0)
            java.lang.String r0 = "favicon.ico"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r9)
            r10.put(r8, r0)
            r0 = 5
            java.lang.String[] r7 = new java.lang.String[r0]
            java.lang.String r0 = "icon"
            r7[r5] = r0
            java.lang.String r0 = "apple-touch-icon"
            r7[r4] = r0
            r0 = 2
            r7[r0] = r8
            r5 = 3
            java.lang.String r0 = "shortcut icon"
            r7[r5] = r0
            java.lang.String r0 = "apple-touch-icon-precomposed"
            java.util.List r9 = X.C18070vi.A0O(r0, r7, r6)
            java.util.HashMap r8 = X.C17880vN.A11()
            java.util.regex.Pattern r0 = A0Y
            java.util.regex.Matcher r7 = r0.matcher(r3)
        L_0x058b:
            boolean r0 = r7.find()
            if (r0 == 0) goto L_0x05bf
            java.lang.String r0 = r7.group(r4)
            java.util.HashMap r5 = A07(r0)
            java.lang.String r0 = "rel"
            java.lang.String r6 = X.C108945cZ.A1G(r0, r5)
            java.lang.String r0 = "href"
            java.lang.String r5 = X.C108945cZ.A1G(r0, r5)
            if (r6 == 0) goto L_0x058b
            int r0 = r6.length()
            if (r0 == 0) goto L_0x058b
            boolean r0 = r9.contains(r6)
            if (r0 == 0) goto L_0x058b
            if (r5 == 0) goto L_0x058b
            int r0 = r5.length()
            if (r0 == 0) goto L_0x058b
            r8.put(r6, r5)
            goto L_0x058b
        L_0x05bf:
            r10.putAll(r8)
            java.lang.String r0 = r1.A0B
            if (r0 == 0) goto L_0x05cc
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0608
        L_0x05cc:
            java.util.regex.Pattern r0 = A0d
            java.util.regex.Matcher r8 = r0.matcher(r3)
        L_0x05d2:
            boolean r0 = r8.find()
            if (r0 == 0) goto L_0x0608
            java.lang.String r7 = r8.group(r4)
            X.C17960vV.A07(r7)
            X.C18070vi.A0X(r7)
            int r6 = r7.length()
            int r6 = r6 - r4
            r5 = 0
            r3 = 0
        L_0x05e9:
            if (r5 > r6) goto L_0x0601
            r0 = r6
            if (r3 != 0) goto L_0x05ef
            r0 = r5
        L_0x05ef:
            boolean r0 = X.C109005cf.A0u(r7, r0)
            if (r3 != 0) goto L_0x05fc
            if (r0 != 0) goto L_0x05f9
            r3 = 1
            goto L_0x05e9
        L_0x05f9:
            int r5 = r5 + 1
            goto L_0x05e9
        L_0x05fc:
            if (r0 == 0) goto L_0x0601
            int r6 = r6 + -1
            goto L_0x05e9
        L_0x0601:
            java.lang.String r0 = X.C108985cd.A0g(r6, r5, r7)
            r1.A0B = r0
            goto L_0x05d2
        L_0x0608:
            java.lang.String r3 = r1.A0B
            if (r3 == 0) goto L_0x061e
            int r0 = r3.length()
            if (r0 == 0) goto L_0x061e
            X.0vl r0 = r1.A0T
            boolean r0 = X.C72453Mb.A1a(r0)
            java.lang.String r0 = A02(r0, r3)
            r1.A0B = r0
        L_0x061e:
            java.lang.String r3 = r1.A0A
            if (r3 == 0) goto L_0x0634
            int r0 = r3.length()
            if (r0 == 0) goto L_0x0634
            X.0vl r0 = r1.A0T
            boolean r0 = X.C72453Mb.A1a(r0)
            java.lang.String r0 = A02(r0, r3)
            r1.A0A = r0
        L_0x0634:
            java.lang.String r0 = r29.toString()
            boolean r0 = X.C87504Vv.A01(r0)
            if (r0 == 0) goto L_0x0675
            java.lang.String r0 = "invite_link_type_v2"
            java.lang.String r4 = X.C108945cZ.A1G(r0, r2)
            if (r4 == 0) goto L_0x0662
            int r3 = r4.hashCode()
            r0 = -1942094678(0xffffffff8c3dfcaa, float:-1.4636064E-31)
            if (r3 == r0) goto L_0x067e
            r0 = 82464(0x14220, float:1.15557E-40)
            if (r3 == r0) goto L_0x0676
            r0 = 1717295874(0x665bdb02, float:2.5955956E23)
            if (r3 != r0) goto L_0x0662
            java.lang.String r0 = "DEFAULT_SUB"
            boolean r0 = r4.equals(r0)
            r3 = 3
        L_0x0660:
            if (r0 != 0) goto L_0x0663
        L_0x0662:
            r3 = 0
        L_0x0663:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r1.A07 = r0
            java.lang.String r0 = "parent_group_subject"
            java.lang.String r0 = X.C108945cZ.A1G(r0, r2)
            if (r0 == 0) goto L_0x0675
            r1.A09 = r0
            r1.A0A = r0
        L_0x0675:
            return r16
        L_0x0676:
            java.lang.String r0 = "SUB"
            boolean r0 = r4.equals(r0)
            r3 = 2
            goto L_0x0660
        L_0x067e:
            java.lang.String r0 = "PARENT"
            boolean r0 = r4.equals(r0)
            r3 = 1
            goto L_0x0660
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C143887Fe.A03(java.lang.String, java.lang.String, java.lang.String, java.net.URL, int):java.lang.String");
    }

    private final URI A06() {
        URL url = new URL(this.A0S);
        String host = url.getHost();
        if (host != null) {
            try {
                host = IDN.toASCII(host);
            } catch (IllegalArgumentException unused) {
            }
            if (host != null) {
                host = C108975cc.A0d(host);
            } else {
                host = null;
            }
        }
        String protocol = url.getProtocol();
        if (protocol != null) {
            protocol = C108975cc.A0d(protocol);
        }
        URI uri = url.toURI();
        return new URI(protocol, uri.getUserInfo(), host, uri.getPort(), uri.getPath(), uri.getQuery(), url.getRef());
    }

    private final void A09(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            try {
                AnonymousClass1EY.A02(new C179229Hb(this.A0Q, httpURLConnection.getInputStream(), (Integer) null, 23));
            } catch (IOException unused) {
            }
            httpURLConnection.disconnect();
        }
    }

    public Bitmap A0C() {
        byte[] bArr = this.A0K;
        if (bArr == null) {
            return null;
        }
        Bitmap bitmap = this.A0O;
        if (bitmap != null) {
            return bitmap;
        }
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inDither = true;
            options.inPreferredConfig = Bitmap.Config.RGB_565;
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            this.A0O = decodeByteArray;
            return decodeByteArray;
        } catch (OutOfMemoryError unused) {
            return null;
        }
    }

    public String A0D() {
        URL url;
        String str = this.A08;
        if (str == null || str.length() == 0) {
            url = new URL(this.A0S);
        } else {
            try {
                url = new URL(str);
            } catch (MalformedURLException unused) {
                url = new URL(this.A0S);
            }
        }
        String host = url.getHost();
        C18070vi.A0X(host);
        return host;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0037, code lost:
        if ("video/mp4".equals(r2) != false) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r1 == 0) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
        if (r1 == 0) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0K() {
        /*
            r7 = this;
            java.lang.String r0 = r7.A0B
            r6 = 0
            if (r0 == 0) goto L_0x000c
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L_0x000d
        L_0x000c:
            r0 = 1
        L_0x000d:
            r5 = r0 ^ 1
            java.lang.String r0 = r7.A0A
            if (r0 == 0) goto L_0x001a
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L_0x001b
        L_0x001a:
            r0 = 1
        L_0x001b:
            r4 = r0 ^ 1
            X.6g9 r3 = r7.A05
            r2 = 0
            if (r3 == 0) goto L_0x0042
            java.lang.String r1 = r3.A01
        L_0x0024:
            java.lang.String r0 = "image/gif"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0039
            if (r3 == 0) goto L_0x0030
            java.lang.String r2 = r3.A01
        L_0x0030:
            java.lang.String r0 = "video/mp4"
            boolean r1 = r0.equals(r2)
            r0 = 0
            if (r1 == 0) goto L_0x003a
        L_0x0039:
            r0 = 1
        L_0x003a:
            if (r5 != 0) goto L_0x0040
            if (r4 != 0) goto L_0x0040
            if (r0 == 0) goto L_0x0041
        L_0x0040:
            r6 = 1
        L_0x0041:
            return r6
        L_0x0042:
            r1 = r2
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C143887Fe.A0K():boolean");
    }

    public C143887Fe(AnonymousClass181 r2, C18030ve r3, C32011gU r4, String str) {
        C18070vi.A0s(r3, r4, r2, str);
        this.A0R = r3;
        this.A0U = r4;
        this.A0Q = r2;
        this.A0S = str;
    }

    public static final HashMap A07(String str) {
        HashMap A11 = C17880vN.A11();
        Pattern pattern = A0X;
        if (str == null) {
            str = "";
        }
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            String group = matcher.group(1);
            if (group != null) {
                String group2 = matcher.group(2);
                if (group2 == null) {
                    group2 = matcher.group(3);
                }
                A11.put(group, group2);
            }
        }
        return A11;
    }

    private final void A08(String str, String str2, String... strArr) {
        String A0q = C108955ca.A0q(0, str.length() - str2.length(), str);
        for (String A0A2 : strArr) {
            AnonymousClass3Ma.A1P(C17900vP.A0A(A0q, A0A2), C17880vN.A0h(), this.A0D);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0051 A[Catch:{ OutOfMemoryError -> 0x005a }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final byte[] A0A(android.graphics.Bitmap r8, android.graphics.Rect r9, int r10, int r11, int r12, boolean r13) {
        /*
            r7 = this;
            java.io.ByteArrayOutputStream r5 = X.C108945cZ.A15()
            if (r13 == 0) goto L_0x000a
            android.graphics.Bitmap$CompressFormat r4 = android.graphics.Bitmap.CompressFormat.PNG
        L_0x0008:
            r3 = 0
            goto L_0x000d
        L_0x000a:
            android.graphics.Bitmap$CompressFormat r4 = android.graphics.Bitmap.CompressFormat.JPEG
            goto L_0x0008
        L_0x000d:
            android.graphics.Bitmap$Config r0 = r8.getConfig()     // Catch:{ OutOfMemoryError -> 0x005a }
            if (r0 == 0) goto L_0x0055
            android.graphics.Bitmap r6 = android.graphics.Bitmap.createBitmap(r10, r11, r0)     // Catch:{ OutOfMemoryError -> 0x005a }
            android.graphics.Canvas r2 = X.C108955ca.A0E(r6)     // Catch:{ OutOfMemoryError -> 0x005a }
            android.graphics.Paint r1 = X.AnonymousClass3MW.A06()     // Catch:{ OutOfMemoryError -> 0x005a }
            r0 = 1
            r1.setAntiAlias(r0)     // Catch:{ OutOfMemoryError -> 0x005a }
            r1.setFilterBitmap(r0)     // Catch:{ OutOfMemoryError -> 0x005a }
            if (r13 != 0) goto L_0x002c
            r0 = -1
            r2.drawColor(r0)     // Catch:{ OutOfMemoryError -> 0x005a }
        L_0x002c:
            android.graphics.Rect r0 = new android.graphics.Rect     // Catch:{ OutOfMemoryError -> 0x005a }
            r0.<init>(r3, r3, r10, r11)     // Catch:{ OutOfMemoryError -> 0x005a }
            r2.drawBitmap(r8, r9, r0, r1)     // Catch:{ OutOfMemoryError -> 0x005a }
            if (r13 != 0) goto L_0x0047
            X.0ve r2 = r7.A0R     // Catch:{ OutOfMemoryError -> 0x005a }
            r1 = 11579(0x2d3b, float:1.6226E-41)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ OutOfMemoryError -> 0x005a }
            boolean r0 = X.C18020vd.A05(r0, r2, r1)     // Catch:{ OutOfMemoryError -> 0x005a }
            if (r0 == 0) goto L_0x0047
            byte[] r1 = X.C60892om.A00(r6, r12, r3, r3)     // Catch:{ OutOfMemoryError -> 0x005a }
            goto L_0x004b
        L_0x0047:
            byte[] r1 = X.C108955ca.A1a(r4, r6, r5, r12)     // Catch:{ OutOfMemoryError -> 0x005a }
        L_0x004b:
            boolean r0 = r6.isRecycled()     // Catch:{ OutOfMemoryError -> 0x005a }
            if (r0 != 0) goto L_0x0054
            r6.recycle()     // Catch:{ OutOfMemoryError -> 0x005a }
        L_0x0054:
            return r1
        L_0x0055:
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()     // Catch:{ OutOfMemoryError -> 0x005a }
            throw r0     // Catch:{ OutOfMemoryError -> 0x005a }
        L_0x005a:
            java.lang.System.gc()
            java.lang.String r0 = "WebPageInfo/convertToByteArray OutOfMemoryError"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            if (r13 != 0) goto L_0x0075
            X.0ve r2 = r7.A0R
            r1 = 11579(0x2d3b, float:1.6226E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0075
            byte[] r0 = X.C60892om.A00(r8, r12, r3, r3)
            return r0
        L_0x0075:
            byte[] r0 = X.C108955ca.A1a(r4, r8, r5, r12)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C143887Fe.A0A(android.graphics.Bitmap, android.graphics.Rect, int, int, int, boolean):byte[]");
    }

    public void A0E() {
        String str;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(" hasOgVideo:");
        A10.append(this.A0P);
        A10.append(10);
        A10.append("page loaded in ");
        A10.append(this.A0M);
        A10.append(" ms, ");
        A10.append(this.A0N);
        A10.append(" bytes");
        A10.append(10);
        long j = this.A0L;
        if (j > 0) {
            Locale locale = Locale.US;
            Object[] objArr = new Object[3];
            objArr[0] = Long.valueOf(j);
            objArr[1] = Integer.valueOf(this.A01);
            AnonymousClass3Ma.A1S(objArr, this.A00);
            A10.append(C108955ca.A12(locale, "image loaded in %dms, image dimension %dx%d", Arrays.copyOf(objArr, 3)));
            byte[] bArr = this.A0J;
            if (bArr != null) {
                Object[] objArr2 = new Object[1];
                C17880vN.A1T(objArr2, bArr.length, 0);
                A10.append(C108955ca.A12(locale, ", small thumbnail %dbytes", Arrays.copyOf(objArr2, 1)));
            }
            byte[] bArr2 = this.A0K;
            if (bArr2 != null) {
                Object[] objArr3 = new Object[1];
                C17880vN.A1T(objArr3, bArr2.length, 0);
                str = C108955ca.A12(locale, ", large thumbnail %dbytes", Arrays.copyOf(objArr3, 1));
            }
            C18070vi.A0X(A10.toString());
        }
        str = " image not loaded";
        A10.append(str);
        C18070vi.A0X(A10.toString());
    }
}
