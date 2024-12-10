package X;

import com.whatsapp.media.WamediaManager;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* renamed from: X.72k  reason: invalid class name and case insensitive filesystem */
public final class C1406572k {
    public String A00;
    public boolean A01;
    public final AnonymousClass11C A02;
    public final C18030ve A03;
    public final WamediaManager A04;
    public final WamediaManager A05;
    public final C26631Sw A06;
    public final AnonymousClass72H A07;
    public final AnonymousClass11W A08;
    public final AnonymousClass181 A09;
    public final AnonymousClass11P A0A;
    public final C18000vb A0B;
    public final C19960A0r A0C;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0427, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:?, code lost:
        X.CDX.A00(r26, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x042d, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final X.C19760yx A00(java.lang.String r57, java.util.Set r58) {
        /*
            r56 = this;
            r8 = r56
            X.0ve r0 = r8.A03
            r55 = r0
            r2 = 12695(0x3197, float:1.779E-41)
            X.0vf r1 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r1, r0, r2)
            r7 = 0
            if (r0 != 0) goto L_0x0017
            java.lang.String r0 = "GiphyStickerProvider/executeRequest/giphy sticker api disabled"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r7
        L_0x0017:
            X.11P r0 = r8.A0A
            r54 = r0
            X.AnonymousClass11P.A01(r54)
            r0 = 9
            android.net.TrafficStats.setThreadStatsTag(r0)     // Catch:{ Exception -> 0x042e }
            java.net.URL r1 = new java.net.URL     // Catch:{ Exception -> 0x042e }
            r0 = r57
            r1.<init>(r0)     // Catch:{ Exception -> 0x042e }
            java.lang.String r0 = "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection"
            java.net.URLConnection r3 = r1.openConnection()     // Catch:{ Exception -> 0x042e }
            X.C18070vi.A0z(r3, r0)     // Catch:{ Exception -> 0x042e }
            javax.net.ssl.HttpsURLConnection r3 = (javax.net.ssl.HttpsURLConnection) r3     // Catch:{ Exception -> 0x042e }
            X.C18070vi.A0z(r3, r0)     // Catch:{ Exception -> 0x042e }
            X.11W r0 = r8.A08     // Catch:{ Exception -> 0x042e }
            X.C109005cf.A0o(r0, r3)     // Catch:{ Exception -> 0x042e }
            r3.connect()     // Catch:{ Exception -> 0x042e }
            int r2 = r3.getResponseCode()     // Catch:{ Exception -> 0x042e }
            r0 = 200(0xc8, float:2.8E-43)
            if (r2 == r0) goto L_0x0058
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x042e }
            java.lang.String r0 = "GiphyStickerProvider/executeRequest/failed "
            X.C17900vP.A0i(r0, r1, r2)     // Catch:{ Exception -> 0x042e }
            X.AnonymousClass11P.A01(r54)
            android.net.TrafficStats.clearThreadStatsTag()
            return r7
        L_0x0058:
            X.AnonymousClass11P.A01(r54)     // Catch:{ Exception -> 0x042e }
            r6 = 0
            r27 = 0
            r5 = 0
            X.181 r1 = r8.A09     // Catch:{ Exception -> 0x042e }
            r0 = 0
            X.9Hb r0 = X.C108995ce.A0N(r1, r3, r0)     // Catch:{ Exception -> 0x042e }
            android.util.JsonReader r26 = X.C108985cd.A0E(r0)     // Catch:{ Exception -> 0x042e }
            r26.beginObject()     // Catch:{ all -> 0x0425 }
        L_0x006d:
            boolean r0 = r26.hasNext()     // Catch:{ all -> 0x0425 }
            if (r0 == 0) goto L_0x03c0
            java.lang.String r2 = r26.nextName()     // Catch:{ all -> 0x0425 }
            if (r2 == 0) goto L_0x03b2
            int r1 = r2.hashCode()     // Catch:{ all -> 0x0425 }
            r0 = 3076010(0x2eefaa, float:4.310408E-39)
            if (r1 == r0) goto L_0x00a6
            r0 = 3347973(0x331605, float:4.69151E-39)
            if (r1 == r0) goto L_0x0099
            r0 = 1297692570(0x4d59379a, float:2.27768736E8)
            if (r1 != r0) goto L_0x03b2
            java.lang.String r0 = "pagination"
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x0425 }
            if (r0 == 0) goto L_0x03b2
            java.lang.String r27 = X.AnonymousClass73P.A02(r26)     // Catch:{ all -> 0x0425 }
            goto L_0x006d
        L_0x0099:
            java.lang.String r0 = "meta"
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x0425 }
            if (r0 == 0) goto L_0x03b2
            X.0yx r6 = X.AnonymousClass73P.A00(r26)     // Catch:{ all -> 0x0425 }
            goto L_0x006d
        L_0x00a6:
            java.lang.String r0 = "data"
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x0425 }
            if (r0 == 0) goto L_0x03b2
            java.util.ArrayList r5 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x0425 }
            r26.beginArray()     // Catch:{ all -> 0x0425 }
        L_0x00b5:
            boolean r0 = r26.hasNext()     // Catch:{ all -> 0x0425 }
            if (r0 == 0) goto L_0x03ad
            r26.beginObject()     // Catch:{ all -> 0x0425 }
            r25 = 0
            r2 = r7
            r12 = r7
            r11 = r7
            r24 = r7
        L_0x00c5:
            boolean r0 = r26.hasNext()     // Catch:{ all -> 0x0425 }
            if (r0 == 0) goto L_0x018a
            java.lang.String r1 = r26.nextName()     // Catch:{ all -> 0x0425 }
            if (r1 == 0) goto L_0x00d8
            int r0 = r1.hashCode()     // Catch:{ all -> 0x0425 }
            switch(r0) {
                case -1185250696: goto L_0x00dc;
                case -265713450: goto L_0x0160;
                case 110371416: goto L_0x016e;
                case 2027300355: goto L_0x017c;
                default: goto L_0x00d8;
            }     // Catch:{ all -> 0x0425 }
        L_0x00d8:
            r26.skipValue()     // Catch:{ all -> 0x0425 }
            goto L_0x00c5
        L_0x00dc:
            java.lang.String r0 = "images"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0425 }
            if (r0 == 0) goto L_0x00d8
            r26.beginObject()     // Catch:{ all -> 0x0425 }
        L_0x00e7:
            boolean r0 = r26.hasNext()     // Catch:{ all -> 0x0425 }
            if (r0 == 0) goto L_0x015b
            java.lang.String r1 = r26.nextName()     // Catch:{ all -> 0x0425 }
            java.lang.String r0 = "fixed_height"
            boolean r0 = X.C18070vi.A18(r1, r0)     // Catch:{ all -> 0x0425 }
            if (r0 == 0) goto L_0x0157
            r26.beginObject()     // Catch:{ all -> 0x0425 }
            r2 = 0
            r9 = -1
            r4 = r7
            r3 = -1
            r1 = -1
        L_0x0101:
            boolean r0 = r26.hasNext()     // Catch:{ all -> 0x0425 }
            if (r0 == 0) goto L_0x014c
            java.lang.String r10 = r26.nextName()     // Catch:{ all -> 0x0425 }
            if (r10 == 0) goto L_0x0114
            int r0 = r10.hashCode()     // Catch:{ all -> 0x0425 }
            switch(r0) {
                case -1221029593: goto L_0x013f;
                case 3530753: goto L_0x0132;
                case 3645340: goto L_0x0125;
                case 113126854: goto L_0x0118;
                default: goto L_0x0114;
            }     // Catch:{ all -> 0x0425 }
        L_0x0114:
            r26.skipValue()     // Catch:{ all -> 0x0425 }
            goto L_0x0101
        L_0x0118:
            java.lang.String r0 = "width"
            boolean r0 = r10.equals(r0)     // Catch:{ all -> 0x0425 }
            if (r0 == 0) goto L_0x0114
            int r9 = X.C108985cd.A02(r26)     // Catch:{ all -> 0x0425 }
            goto L_0x0101
        L_0x0125:
            java.lang.String r0 = "webp"
            boolean r0 = r10.equals(r0)     // Catch:{ all -> 0x0425 }
            if (r0 == 0) goto L_0x0114
            java.lang.String r4 = r26.nextString()     // Catch:{ all -> 0x0425 }
            goto L_0x0101
        L_0x0132:
            java.lang.String r0 = "size"
            boolean r0 = r10.equals(r0)     // Catch:{ all -> 0x0425 }
            if (r0 == 0) goto L_0x0114
            int r1 = X.C108985cd.A02(r26)     // Catch:{ all -> 0x0425 }
            goto L_0x0101
        L_0x013f:
            java.lang.String r0 = "height"
            boolean r0 = r10.equals(r0)     // Catch:{ all -> 0x0425 }
            if (r0 == 0) goto L_0x0114
            int r3 = X.C108985cd.A02(r26)     // Catch:{ all -> 0x0425 }
            goto L_0x0101
        L_0x014c:
            r26.endObject()     // Catch:{ all -> 0x0425 }
            if (r4 == 0) goto L_0x00e7
            X.77C r2 = new X.77C     // Catch:{ all -> 0x0425 }
            r2.<init>(r9, r3, r4, r1)     // Catch:{ all -> 0x0425 }
            goto L_0x00e7
        L_0x0157:
            r26.skipValue()     // Catch:{ all -> 0x0425 }
            goto L_0x00e7
        L_0x015b:
            r26.endObject()     // Catch:{ all -> 0x0425 }
            goto L_0x00c5
        L_0x0160:
            java.lang.String r0 = "username"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0425 }
            if (r0 == 0) goto L_0x00d8
            java.lang.String r24 = r26.nextString()     // Catch:{ all -> 0x0425 }
            goto L_0x00c5
        L_0x016e:
            java.lang.String r0 = "title"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0425 }
            if (r0 == 0) goto L_0x00d8
            java.lang.String r11 = r26.nextString()     // Catch:{ all -> 0x0425 }
            goto L_0x00c5
        L_0x017c:
            java.lang.String r0 = "alt_text"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0425 }
            if (r0 == 0) goto L_0x00d8
            java.lang.String r12 = r26.nextString()     // Catch:{ all -> 0x0425 }
            goto L_0x00c5
        L_0x018a:
            r26.endObject()     // Catch:{ all -> 0x0425 }
            if (r2 == 0) goto L_0x00b5
            int r0 = r2.A01     // Catch:{ all -> 0x0425 }
            long r0 = (long) r0     // Catch:{ all -> 0x0425 }
            r9 = 512000(0x7d000, double:2.529616E-318)
            int r3 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r3 >= 0) goto L_0x00b5
            int r10 = r2.A02     // Catch:{ all -> 0x0425 }
            int r9 = r2.A00     // Catch:{ all -> 0x0425 }
            if (r10 == r9) goto L_0x01a9
            r1 = 11142(0x2b86, float:1.5613E-41)
            r0 = r55
            boolean r0 = X.C25291Nq.A04(r0, r1)     // Catch:{ all -> 0x0425 }
            if (r0 == 0) goto L_0x00b5
        L_0x01a9:
            if (r12 == 0) goto L_0x01b4
            int r0 = r12.length()     // Catch:{ all -> 0x0425 }
            if (r0 <= 0) goto L_0x01b4
            r25 = r12
            goto L_0x01be
        L_0x01b4:
            if (r11 == 0) goto L_0x01be
            int r0 = r11.length()     // Catch:{ all -> 0x0425 }
            if (r0 <= 0) goto L_0x01be
            r25 = r11
        L_0x01be:
            r1 = 10161(0x27b1, float:1.4239E-41)
            r0 = r55
            boolean r0 = X.C25291Nq.A04(r0, r1)     // Catch:{ all -> 0x0425 }
            if (r0 == 0) goto L_0x0212
            r43 = 0
            X.77d r4 = new X.77d     // Catch:{ all -> 0x0425 }
            r30 = r7
            r31 = r7
            r32 = r7
            r33 = r7
            r34 = r7
            r35 = r7
            r36 = r7
            r37 = r7
            r38 = r7
            r39 = r7
            r40 = r7
            r41 = r7
            r42 = r7
            r45 = r43
            r46 = r43
            r47 = r43
            r48 = r43
            r49 = r43
            r50 = r43
            r51 = r43
            r52 = r43
            r53 = r43
            r28 = r4
            r29 = r7
            r44 = r43
            r28.<init>(r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53)     // Catch:{ all -> 0x0425 }
            java.lang.String r0 = r2.A03     // Catch:{ all -> 0x0425 }
            r4.A0I = r0     // Catch:{ all -> 0x0425 }
            r4.A03 = r10     // Catch:{ all -> 0x0425 }
            r4.A02 = r9     // Catch:{ all -> 0x0425 }
            r0 = 1
            r4.A0O = r0     // Catch:{ all -> 0x0425 }
            r0 = r25
            r4.A06 = r0     // Catch:{ all -> 0x0425 }
            goto L_0x032a
        L_0x0212:
            java.lang.String r2 = r2.A03     // Catch:{ all -> 0x0425 }
            boolean r1 = X.C137456vU.A01(r55)     // Catch:{ all -> 0x0425 }
            X.72H r0 = r8.A07     // Catch:{ Exception -> 0x03a2 }
            X.77d r4 = r0.A03(r7, r2, r1)     // Catch:{ Exception -> 0x03a2 }
            int r0 = r4.A00     // Catch:{ all -> 0x0425 }
            X.1Sw r11 = r8.A06     // Catch:{ all -> 0x0425 }
            com.whatsapp.media.WamediaManager r13 = r8.A05     // Catch:{ all -> 0x0425 }
            X.11C r12 = r8.A02     // Catch:{ all -> 0x0425 }
            r2 = 0
            long r0 = (long) r0     // Catch:{ all -> 0x0425 }
            r14 = 1048576(0x100000, double:5.180654E-318)
            int r3 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r3 > 0) goto L_0x00b5
            java.lang.String r23 = X.C60582oG.A00(r4, r10, r9, r2)     // Catch:{ all -> 0x0425 }
            X.17r r0 = r11.A01     // Catch:{ all -> 0x0425 }
            byte[] r12 = X.C60582oG.A01(r0, r12, r13, r4)     // Catch:{ all -> 0x0425 }
            if (r12 == 0) goto L_0x00b5
            java.lang.String r0 = r4.A0F     // Catch:{ all -> 0x0425 }
            r28 = r0
            X.C17960vV.A07(r28)     // Catch:{ all -> 0x0425 }
            X.C18070vi.A0X(r28)     // Catch:{ all -> 0x0425 }
            com.facebook.animated.webp.WebPImage r22 = X.C26611Su.A02(r12)     // Catch:{ all -> 0x0425 }
            if (r22 == 0) goto L_0x00b5
            int r1 = r22.getFrameCount()     // Catch:{ all -> 0x0425 }
            X.1Su r3 = r11.A07     // Catch:{ all -> 0x0425 }
            r0 = 1
            if (r1 != r0) goto L_0x026f
            r0 = r28
            android.graphics.Bitmap r1 = r3.A07(r0, r12, r10, r9)     // Catch:{ all -> 0x0425 }
            if (r1 == 0) goto L_0x0397
            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable     // Catch:{ all -> 0x0425 }
            r0.<init>(r1)     // Catch:{ all -> 0x0425 }
            java.util.concurrent.ConcurrentHashMap r2 = r11.A0F     // Catch:{ all -> 0x0425 }
            java.lang.ref.SoftReference r1 = new java.lang.ref.SoftReference     // Catch:{ all -> 0x0425 }
            r1.<init>(r0)     // Catch:{ all -> 0x0425 }
        L_0x0268:
            r0 = r23
            r2.put(r0, r1)     // Catch:{ all -> 0x0425 }
            goto L_0x032a
        L_0x026f:
            r0 = r23
            java.lang.String r1 = X.C26611Su.A04(r10, r9, r0)     // Catch:{ all -> 0x0425 }
            android.graphics.Bitmap r12 = X.C26611Su.A01(r3, r1)     // Catch:{ all -> 0x0425 }
            if (r12 != 0) goto L_0x0285
            r0 = r22
            android.graphics.Bitmap r12 = X.C26611Su.A00(r0, r3, r1, r10, r9)     // Catch:{ all -> 0x0425 }
            if (r12 != 0) goto L_0x0285
            goto L_0x00b5
        L_0x0285:
            int r21 = r12.getHeight()     // Catch:{ all -> 0x0425 }
            int r20 = r12.getWidth()     // Catch:{ all -> 0x0425 }
            int r0 = r21 / 10
            r19 = r0
            r15 = 0
            r3 = 0
            r13 = 0
        L_0x0294:
            r0 = r20
            if (r15 >= r0) goto L_0x02dc
            r14 = 0
        L_0x0299:
            int r0 = r21 - r19
            if (r14 >= r0) goto L_0x02d9
            int r0 = r12.getPixel(r15, r14)     // Catch:{ all -> 0x0425 }
            int r18 = android.graphics.Color.red(r0)     // Catch:{ all -> 0x0425 }
            int r17 = android.graphics.Color.blue(r0)     // Catch:{ all -> 0x0425 }
            int r16 = android.graphics.Color.green(r0)     // Catch:{ all -> 0x0425 }
            int r1 = android.graphics.Color.alpha(r0)     // Catch:{ all -> 0x0425 }
            r0 = 10
            if (r1 <= r0) goto L_0x02c7
            r1 = 230(0xe6, float:3.22E-43)
            r0 = r18
            if (r0 < r1) goto L_0x02ca
            r0 = r17
            if (r0 < r1) goto L_0x02c5
            r0 = r16
            if (r0 < r1) goto L_0x02c5
            int r2 = r2 + 1
        L_0x02c5:
            int r3 = r3 + 1
        L_0x02c7:
            int r14 = r14 + r19
            goto L_0x0299
        L_0x02ca:
            r1 = 20
            if (r0 > r1) goto L_0x02c5
            r0 = r17
            if (r0 > r1) goto L_0x02c5
            r0 = r16
            if (r0 > r1) goto L_0x02c5
            int r13 = r13 + 1
            goto L_0x02c5
        L_0x02d9:
            int r15 = r15 + 1
            goto L_0x0294
        L_0x02dc:
            double r0 = (double) r2     // Catch:{ all -> 0x0425 }
            double r2 = (double) r3     // Catch:{ all -> 0x0425 }
            r14 = 4606281698874543309(0x3feccccccccccccd, double:0.9)
            double r2 = r2 * r14
            int r14 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r14 > 0) goto L_0x00b5
            double r0 = (double) r13     // Catch:{ all -> 0x0425 }
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 > 0) goto L_0x00b5
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0425 }
            r0 = r28
            X.C108995ce.A1N(r1, r0)     // Catch:{ all -> 0x0425 }
            r0 = 95
            r1.append(r0)     // Catch:{ all -> 0x0425 }
            r1.append(r10)     // Catch:{ all -> 0x0425 }
            r1.append(r0)     // Catch:{ all -> 0x0425 }
            java.lang.String r34 = X.C17880vN.A0t(r1, r9)     // Catch:{ all -> 0x0425 }
            X.1KB r2 = r11.A02     // Catch:{ all -> 0x0425 }
            X.1Sz r1 = r11.A08     // Catch:{ all -> 0x0425 }
            X.0ve r0 = r11.A04     // Catch:{ all -> 0x0425 }
            X.6zD r28 = new X.6zD     // Catch:{ all -> 0x0425 }
            r37 = r10
            r38 = r9
            r29 = r12
            r30 = r22
            r31 = r2
            r32 = r0
            r33 = r1
            r35 = r10
            r36 = r9
            r28.<init>(r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)     // Catch:{ all -> 0x0425 }
            java.util.concurrent.ConcurrentHashMap r2 = r11.A0E     // Catch:{ all -> 0x0425 }
            java.lang.ref.WeakReference r1 = X.AnonymousClass3MW.A0z(r28)     // Catch:{ all -> 0x0425 }
            goto L_0x0268
        L_0x032a:
            r9 = 0
            r3 = 0
            if (r24 == 0) goto L_0x032f
            goto L_0x0332
        L_0x032f:
            r30 = r7
            goto L_0x0344
        L_0x0332:
            int r0 = r24.length()     // Catch:{ all -> 0x0425 }
            if (r0 == 0) goto L_0x032f
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0425 }
            r1 = 64
            r0 = r24
            java.lang.String r30 = X.C17890vO.A0Z(r0, r2, r1)     // Catch:{ all -> 0x0425 }
        L_0x0344:
            java.lang.String r31 = "Giphy"
            X.737[] r0 = new X.AnonymousClass737[r9]     // Catch:{ all -> 0x0425 }
            r1 = r58
            java.lang.Object[] r1 = r1.toArray(r0)     // Catch:{ all -> 0x0425 }
            X.737[] r1 = (X.AnonymousClass737[]) r1     // Catch:{ all -> 0x0425 }
            X.73B r0 = new X.73B     // Catch:{ all -> 0x0425 }
            r32 = r7
            r33 = r7
            r34 = r7
            r36 = r7
            r37 = r7
            r40 = r9
            r41 = r9
            r42 = r9
            r43 = r9
            r44 = r9
            r45 = r9
            r46 = r9
            r28 = r0
            r29 = r7
            r35 = r25
            r38 = r1
            r39 = r9
            r28.<init>(r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46)     // Catch:{ all -> 0x0425 }
            r4.A04 = r0     // Catch:{ all -> 0x0425 }
            r0 = r25
            r4.A06 = r0     // Catch:{ all -> 0x0425 }
            java.lang.String r0 = r4.A0B     // Catch:{ all -> 0x0425 }
            if (r0 == 0) goto L_0x0392
            com.whatsapp.media.WamediaManager r2 = r8.A04     // Catch:{ all -> 0x0425 }
            java.io.File r1 = X.C108945cZ.A17(r0)     // Catch:{ all -> 0x0425 }
            X.73B r0 = r4.A04     // Catch:{ all -> 0x0425 }
            if (r0 == 0) goto L_0x038f
            byte[] r3 = r0.A04()     // Catch:{ all -> 0x0425 }
        L_0x038f:
            r2.insertWebpMetadata(r1, r3)     // Catch:{ all -> 0x0425 }
        L_0x0392:
            r5.add(r4)     // Catch:{ all -> 0x0425 }
            goto L_0x00b5
        L_0x0397:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0425 }
            java.lang.String r1 = "StickerImageLoader/loadAndValidateGiphySticker failed to create drawable, hash: "
            X.C17900vP.A0e(r1, r0, r2)     // Catch:{ all -> 0x0425 }
            goto L_0x00b5
        L_0x03a2:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0425 }
            java.lang.String r0 = "BaseStickerProvider/getStickerFromUrl/error loading "
            X.C17900vP.A0e(r0, r2, r1)     // Catch:{ all -> 0x0425 }
            goto L_0x00b5
        L_0x03ad:
            r26.endArray()     // Catch:{ all -> 0x0425 }
            goto L_0x006d
        L_0x03b2:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0425 }
            java.lang.String r0 = "GiphyStickerProvider/executeRequest/unexpected key - "
            X.C17900vP.A0g(r0, r2, r1)     // Catch:{ all -> 0x0425 }
            r26.skipValue()     // Catch:{ all -> 0x0425 }
            goto L_0x006d
        L_0x03c0:
            r26.endObject()     // Catch:{ all -> 0x0425 }
            r26.close()     // Catch:{ Exception -> 0x042e }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x042e }
            java.lang.String r1 = "GiphyStickerProvider/executeRequest/next: "
            r0 = r27
            X.C17900vP.A0g(r1, r0, r2)     // Catch:{ Exception -> 0x042e }
            if (r6 == 0) goto L_0x03f9
            java.lang.Object r0 = r6.A00     // Catch:{ Exception -> 0x042e }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ Exception -> 0x042e }
            if (r0 == 0) goto L_0x03f9
            int r1 = r0.intValue()     // Catch:{ Exception -> 0x042e }
            r0 = 200(0xc8, float:2.8E-43)
            if (r0 != r1) goto L_0x03f9
            if (r5 == 0) goto L_0x03eb
            X.0yx r1 = new X.0yx     // Catch:{ Exception -> 0x042e }
            r0 = r27
            r1.<init>(r0, r5)     // Catch:{ Exception -> 0x042e }
            goto L_0x03f2
        L_0x03eb:
            X.0yx r1 = new X.0yx     // Catch:{ Exception -> 0x042e }
            r0 = r27
            r1.<init>(r0, r7)     // Catch:{ Exception -> 0x042e }
        L_0x03f2:
            X.AnonymousClass11P.A01(r54)
            android.net.TrafficStats.clearThreadStatsTag()
            return r1
        L_0x03f9:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x042e }
            if (r6 == 0) goto L_0x040c
            java.lang.Object r0 = r6.A00     // Catch:{ Exception -> 0x042e }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ Exception -> 0x042e }
        L_0x0403:
            r1.append(r0)     // Catch:{ Exception -> 0x042e }
            r0 = 40
            r1.append(r0)     // Catch:{ Exception -> 0x042e }
            goto L_0x040e
        L_0x040c:
            r0 = r7
            goto L_0x0403
        L_0x040e:
            if (r6 == 0) goto L_0x0411
            goto L_0x0413
        L_0x0411:
            r0 = r7
            goto L_0x0417
        L_0x0413:
            java.lang.Object r0 = r6.A01     // Catch:{ Exception -> 0x042e }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x042e }
        L_0x0417:
            java.lang.String r2 = X.C17900vP.A0B(r0, r1)     // Catch:{ Exception -> 0x042e }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x042e }
            java.lang.String r0 = "GiphyStickerProvider/executeRequest/got error: "
            X.C17900vP.A0g(r0, r2, r1)     // Catch:{ Exception -> 0x042e }
            goto L_0x0432
        L_0x0425:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0427 }
        L_0x0427:
            r1 = move-exception
            r0 = r26
            X.CDX.A00(r0, r2)     // Catch:{ Exception -> 0x042e }
            throw r1     // Catch:{ Exception -> 0x042e }
        L_0x042e:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ all -> 0x0439 }
        L_0x0432:
            X.AnonymousClass11P.A01(r54)
            android.net.TrafficStats.clearThreadStatsTag()
            return r7
        L_0x0439:
            r0 = move-exception
            X.AnonymousClass11P.A01(r54)
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1406572k.A00(java.lang.String, java.util.Set):X.0yx");
    }

    private final String A01(CharSequence charSequence, String str) {
        String str2;
        Locale A012 = this.A0C.A01();
        String[] strArr = new String[10];
        strArr[0] = "api_key";
        strArr[1] = C197569wu.A0K;
        strArr[2] = "q";
        strArr[3] = charSequence.toString();
        strArr[4] = "lang";
        strArr[5] = AnonymousClass73P.A00.A03(this.A0B, A012);
        strArr[6] = "rating";
        strArr[7] = "pg-13";
        strArr[8] = "limit";
        if (C25291Nq.A04(this.A03, 10161)) {
            str2 = "100";
        } else {
            str2 = "24";
        }
        strArr[9] = str2;
        String A002 = AnonymousClass6WU.A00("https://api.giphy.com/v1/stickers/search", strArr);
        if (str == null || str.length() == 0) {
            return A002;
        }
        return AnonymousClass6WU.A00(A002, "offset", str);
    }

    public C1406572k(AnonymousClass181 r1, AnonymousClass11C r2, AnonymousClass11P r3, C18000vb r4, C18030ve r5, C19960A0r a0r, WamediaManager wamediaManager, C26631Sw r8, AnonymousClass72H r9, AnonymousClass11W r10) {
        C18070vi.A0w(r10, r9, r3, r5, r1);
        C18070vi.A0x(wamediaManager, r4, a0r, r8, r2);
        this.A08 = r10;
        this.A04 = wamediaManager;
        this.A07 = r9;
        this.A0A = r3;
        this.A03 = r5;
        this.A09 = r1;
        this.A05 = wamediaManager;
        this.A0B = r4;
        this.A0C = a0r;
        this.A06 = r8;
        this.A02 = r2;
    }

    public static final List A02(C1406572k r3, String str, String str2, Set set) {
        C19760yx A002 = r3.A00(r3.A01(str, str2), set);
        int i = 0;
        while (A002 != null) {
            List list = (List) A002.A01;
            if ((list == null || list.isEmpty()) && A002.A00 != null && i < 6) {
                A002 = r3.A00(r3.A01(str, (String) A002.A00), set);
                i++;
            } else {
                r3.A00 = (String) A002.A00;
                return (List) A002.A01;
            }
        }
        r3.A01 = true;
        r3.A00 = null;
        return null;
    }
}
