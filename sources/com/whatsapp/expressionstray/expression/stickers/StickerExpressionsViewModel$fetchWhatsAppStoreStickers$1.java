package com.whatsapp.expressionstray.expression.stickers;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C18600wl;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel$fetchWhatsAppStoreStickers$1", f = "StickerExpressionsViewModel.kt", i = {}, l = {530}, m = "invokeSuspend", n = {}, s = {})
public final class StickerExpressionsViewModel$fetchWhatsAppStoreStickers$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ Set $emojis;
    public final /* synthetic */ List $localResults;
    public int label;
    public final /* synthetic */ StickerExpressionsViewModel this$0;

    @DebugMetadata(c = "com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel$fetchWhatsAppStoreStickers$1$1", f = "StickerExpressionsViewModel.kt", i = {0, 1, 2, 2}, l = {533, 543, 558, 572}, m = "invokeSuspend", n = {"startTime", "startTime", "stickersFromJsonArray", "startTime"}, s = {"J$0", "J$0", "L$0", "J$0"})
    /* renamed from: com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel$fetchWhatsAppStoreStickers$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public long J$0;
        public Object L$0;
        public int label;

        public final C30391dr create(Object obj, C30391dr r6) {
            return new AnonymousClass1(list, set, r6);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:46:0x00e6, code lost:
            r16 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
            X.CDX.A00(r3, r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x00ea, code lost:
            throw r16;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x00ed, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
            X.CDX.A00(r14, r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x00f1, code lost:
            throw r2;
         */
        /* JADX WARNING: Removed duplicated region for block: B:101:0x0254 A[Catch:{ CancellationException -> 0x02cc, Exception -> 0x02b7 }] */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x00d7  */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x00e3 A[Catch:{ Exception -> 0x00f2 }] */
        /* JADX WARNING: Removed duplicated region for block: B:64:0x011c A[SYNTHETIC, Splitter:B:64:0x011c] */
        /* JADX WARNING: Removed duplicated region for block: B:67:0x0121 A[Catch:{ CancellationException -> 0x02cc, Exception -> 0x02b7 }] */
        /* JADX WARNING: Removed duplicated region for block: B:73:0x014a A[Catch:{ CancellationException -> 0x02cc, Exception -> 0x02b7 }] */
        /* JADX WARNING: Removed duplicated region for block: B:95:0x022a A[Catch:{ CancellationException -> 0x02cc, Exception -> 0x02b7 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r53) {
            /*
                r52 = this;
                X.1g4 r11 = X.C31751g4.COROUTINE_SUSPENDED
                r10 = r52
                int r1 = r10.label
                r12 = 2
                r9 = 1
                if (r1 == 0) goto L_0x0029
                if (r1 == r9) goto L_0x0026
                if (r1 == r12) goto L_0x0022
                r0 = 3
                if (r1 == r0) goto L_0x001a
                r0 = 4
                if (r1 != r0) goto L_0x02f5
                X.C30691eM.A01(r53)
            L_0x0017:
                X.1Wu r0 = X.C27621Wu.A00
                return r0
            L_0x001a:
                long r0 = r10.J$0
                java.lang.Object r14 = r10.L$0
                java.util.List r14 = (java.util.List) r14
                goto L_0x028e
            L_0x0022:
                long r0 = r10.J$0
                goto L_0x023c
            L_0x0026:
                long r0 = r10.J$0
                goto L_0x004b
            L_0x0029:
                X.C30691eM.A01(r53)
                com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel r2 = com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel.this
                long r0 = java.lang.System.currentTimeMillis()
                X.6bn r2 = r2.A0C     // Catch:{ CancellationException -> 0x02cc, Exception -> 0x02b7 }
                X.0ve r4 = r2.A00     // Catch:{ CancellationException -> 0x02cc, Exception -> 0x02b7 }
                r3 = 5423(0x152f, float:7.599E-42)
                X.0vf r2 = X.C18040vf.A02     // Catch:{ CancellationException -> 0x02cc, Exception -> 0x02b7 }
                int r2 = X.C18020vd.A00(r2, r4, r3)     // Catch:{ CancellationException -> 0x02cc, Exception -> 0x02b7 }
                long r2 = (long) r2     // Catch:{ CancellationException -> 0x02cc, Exception -> 0x02b7 }
                r10.J$0 = r0     // Catch:{ CancellationException -> 0x02cc, Exception -> 0x02b7 }
                r10.label = r9     // Catch:{ CancellationException -> 0x02cc, Exception -> 0x02b7 }
                java.lang.Object r2 = X.C62882s9.A00(r10, r2)     // Catch:{ CancellationException -> 0x02cc, Exception -> 0x02b7 }
                if (r2 != r11) goto L_0x004e
                goto L_0x02fa
            L_0x004b:
                X.C30691eM.A01(r53)     // Catch:{ CancellationException -> 0x02cc, Exception -> 0x02b7 }
            L_0x004e:
                java.util.Set r5 = r3     // Catch:{ CancellationException -> 0x02cc, Exception -> 0x02b7 }
                com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel r2 = com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel.this     // Catch:{ CancellationException -> 0x02cc, Exception -> 0x02b7 }
                X.6bn r2 = r2.A0C     // Catch:{ CancellationException -> 0x02cc, Exception -> 0x02b7 }
                X.0ve r3 = r2.A00     // Catch:{ CancellationException -> 0x02cc, Exception -> 0x02b7 }
                r2 = 5421(0x152d, float:7.596E-42)
                X.0vf r4 = X.C18040vf.A02     // Catch:{ CancellationException -> 0x02cc, Exception -> 0x02b7 }
                int r2 = X.C18020vd.A00(r4, r3, r2)     // Catch:{ CancellationException -> 0x02cc, Exception -> 0x02b7 }
                java.util.List r25 = X.C29431cG.A0v(r5, r2)     // Catch:{ CancellationException -> 0x02cc, Exception -> 0x02b7 }
                java.lang.String r3 = ","
                r13 = 0
                r8 = 0
                r2 = r25
                java.lang.String r3 = X.C29431cG.A0h(r3, r2, r13)     // Catch:{ CancellationException -> 0x02cc, Exception -> 0x02b7 }
                java.lang.String r2 = X.C19620yd.A0A     // Catch:{ CancellationException -> 0x02cc, Exception -> 0x02b7 }
                java.lang.String r2 = java.net.URLEncoder.encode(r3, r2)     // Catch:{ CancellationException -> 0x02cc, Exception -> 0x02b7 }
                com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel r3 = com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel.this     // Catch:{ CancellationException -> 0x02cc, Exception -> 0x02b7 }
                X.6h4 r7 = r3.A0D     // Catch:{ CancellationException -> 0x02cc, Exception -> 0x02b7 }
                X.C18070vi.A0b(r2)     // Catch:{ CancellationException -> 0x02cc, Exception -> 0x02b7 }
                java.lang.String r15 = " / "
                X.C18070vi.A0d(r2, r8)     // Catch:{ CancellationException -> 0x02cc, Exception -> 0x02b7 }
                org.json.JSONArray r24 = new org.json.JSONArray     // Catch:{ CancellationException -> 0x02cc, Exception -> 0x02b7 }
                r24.<init>()     // Catch:{ CancellationException -> 0x02cc, Exception -> 0x02b7 }
                r6 = 0
                java.lang.String r5 = "https://static.whatsapp.net/wa/static/sticker?cat=sticker_search&terms=%s&country=%s"
                java.lang.Object[] r3 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x00f7, all -> 0x00f4 }
                r3[r8] = r2     // Catch:{ Exception -> 0x00f7, all -> 0x00f4 }
                X.11S r2 = r7.A01     // Catch:{ Exception -> 0x00f7, all -> 0x00f4 }
                r2.A0I()     // Catch:{ Exception -> 0x00f7, all -> 0x00f4 }
                com.whatsapp.Me r2 = r2.A00     // Catch:{ Exception -> 0x00f7, all -> 0x00f4 }
                if (r2 == 0) goto L_0x0099
                java.lang.String r2 = X.C108965cb.A0p(r2)     // Catch:{ Exception -> 0x00f7, all -> 0x00f4 }
                if (r2 != 0) goto L_0x009b
            L_0x0099:
                java.lang.String r2 = "GB"
            L_0x009b:
                java.lang.String r2 = X.C108995ce.A0Y(r2, r5, r3, r9, r12)     // Catch:{ Exception -> 0x00f7, all -> 0x00f4 }
                java.net.URL r3 = new java.net.URL     // Catch:{ Exception -> 0x00f7, all -> 0x00f4 }
                r3.<init>(r2)     // Catch:{ Exception -> 0x00f7, all -> 0x00f4 }
                r2 = 9
                android.net.TrafficStats.setThreadStatsTag(r2)     // Catch:{ Exception -> 0x00f7, all -> 0x00f4 }
                java.net.URLConnection r5 = r3.openConnection()     // Catch:{ Exception -> 0x00f7, all -> 0x00f4 }
                java.lang.String r2 = "null cannot be cast to non-null type java.net.HttpURLConnection"
                X.C18070vi.A0z(r5, r2)     // Catch:{ Exception -> 0x00f7, all -> 0x00f4 }
                java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5     // Catch:{ Exception -> 0x00f7, all -> 0x00f4 }
                r5.connect()     // Catch:{ Exception -> 0x00f7, all -> 0x00f4 }
                java.io.InputStream r6 = r3.openStream()     // Catch:{ Exception -> 0x00f2 }
                java.io.BufferedInputStream r14 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x00f2 }
                r14.<init>(r6)     // Catch:{ Exception -> 0x00f2 }
                java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ all -> 0x00eb }
                r2.<init>(r14)     // Catch:{ all -> 0x00eb }
                java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ all -> 0x00eb }
                r3.<init>(r2)     // Catch:{ all -> 0x00eb }
                java.lang.String r2 = X.C181849Sb.A00(r3)     // Catch:{ all -> 0x00e4 }
                r3.close()     // Catch:{ all -> 0x00eb }
                int r3 = r2.length()     // Catch:{ all -> 0x00eb }
                if (r3 <= 0) goto L_0x00de
                org.json.JSONArray r3 = new org.json.JSONArray     // Catch:{ all -> 0x00eb }
                r3.<init>(r2)     // Catch:{ all -> 0x00eb }
                r24 = r3
            L_0x00de:
                r14.close()     // Catch:{ Exception -> 0x00f2 }
                if (r6 == 0) goto L_0x0125
                goto L_0x0122
            L_0x00e4:
                r2 = move-exception
                throw r2     // Catch:{ all -> 0x00e6 }
            L_0x00e6:
                r16 = move-exception
                X.CDX.A00(r3, r2)     // Catch:{ all -> 0x00eb }
                throw r16     // Catch:{ all -> 0x00eb }
            L_0x00eb:
                r3 = move-exception
                throw r3     // Catch:{ all -> 0x00ed }
            L_0x00ed:
                r2 = move-exception
                X.CDX.A00(r14, r3)     // Catch:{ Exception -> 0x00f2 }
                throw r2     // Catch:{ Exception -> 0x00f2 }
            L_0x00f2:
                r14 = move-exception
                goto L_0x00f9
            L_0x00f4:
                r2 = move-exception
                goto L_0x02b3
            L_0x00f7:
                r14 = move-exception
                r5 = r13
            L_0x00f9:
                X.190 r2 = r7.A00     // Catch:{ all -> 0x02a8 }
                r16 = r2
                java.lang.String r7 = "globalSearchProvider/query/error"
                java.lang.StringBuilder r3 = X.C17890vO.A0f(r14)     // Catch:{ all -> 0x02a8 }
                java.lang.String r2 = X.C108955ca.A10(r15, r3, r14)     // Catch:{ all -> 0x02a8 }
                r3.append(r2)     // Catch:{ all -> 0x02a8 }
                r3.append(r15)     // Catch:{ all -> 0x02a8 }
                java.lang.String r2 = r14.getLocalizedMessage()     // Catch:{ all -> 0x02a8 }
                java.lang.String r3 = X.AnonymousClass000.A0y(r2, r3)     // Catch:{ all -> 0x02a8 }
                r2 = r16
                r2.A0G(r7, r3, r8)     // Catch:{ all -> 0x02a8 }
                if (r6 == 0) goto L_0x011f
                r6.close()     // Catch:{ CancellationException -> 0x02cc, Exception -> 0x02b7 }
            L_0x011f:
                if (r5 == 0) goto L_0x0128
                goto L_0x0125
            L_0x0122:
                r6.close()     // Catch:{ CancellationException -> 0x02cc, Exception -> 0x02b7 }
            L_0x0125:
                r5.disconnect()     // Catch:{ CancellationException -> 0x02cc, Exception -> 0x02b7 }
            L_0x0128:
                android.net.TrafficStats.clearThreadStatsTag()     // Catch:{ CancellationException -> 0x02cc, Exception -> 0x02b7 }
                com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel r2 = com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel.this     // Catch:{ CancellationException -> 0x02cc, Exception -> 0x02b7 }
                X.6h4 r7 = r2.A0D     // Catch:{ CancellationException -> 0x02cc, Exception -> 0x02b7 }
                java.util.ArrayList r14 = X.AnonymousClass000.A13()     // Catch:{ CancellationException -> 0x02cc, Exception -> 0x02b7 }
                int r5 = r24.length()     // Catch:{ CancellationException -> 0x02cc, Exception -> 0x02b7 }
                X.6bn r2 = r7.A02     // Catch:{ CancellationException -> 0x02cc, Exception -> 0x02b7 }
                X.0ve r3 = r2.A00     // Catch:{ CancellationException -> 0x02cc, Exception -> 0x02b7 }
                r2 = 5424(0x1530, float:7.6E-42)
                int r2 = X.C18020vd.A00(r4, r3, r2)     // Catch:{ CancellationException -> 0x02cc, Exception -> 0x02b7 }
                int r23 = java.lang.Math.min(r5, r2)     // Catch:{ CancellationException -> 0x02cc, Exception -> 0x02b7 }
                r6 = 0
            L_0x0146:
                r2 = r23
                if (r6 >= r2) goto L_0x0224
                r2 = r24
                org.json.JSONObject r4 = r2.getJSONObject(r6)     // Catch:{ CancellationException -> 0x02cc, Exception -> 0x02b7 }
                X.00H r2 = r7.A03     // Catch:{ CancellationException -> 0x02cc, Exception -> 0x02b7 }
                java.lang.Object r3 = r2.get()     // Catch:{ CancellationException -> 0x02cc, Exception -> 0x02b7 }
                X.72H r3 = (X.AnonymousClass72H) r3     // Catch:{ CancellationException -> 0x02cc, Exception -> 0x02b7 }
                X.C18070vi.A0b(r4)     // Catch:{ CancellationException -> 0x02cc, Exception -> 0x02b7 }
                X.C18070vi.A0d(r4, r8)     // Catch:{ CancellationException -> 0x02cc, Exception -> 0x02b7 }
                java.lang.String r2 = "media-key"
                java.lang.String r22 = r4.getString(r2)     // Catch:{ Exception -> 0x0216 }
                java.lang.String r2 = "file-hash"
                java.lang.String r15 = r4.getString(r2)     // Catch:{ Exception -> 0x0216 }
                java.lang.String r2 = "enc-file-hash"
                java.lang.String r21 = r4.getString(r2)     // Catch:{ Exception -> 0x0216 }
                java.lang.String r2 = "direct-path"
                java.lang.String r20 = r4.getString(r2)     // Catch:{ Exception -> 0x0216 }
                java.lang.String r2 = "file-size"
                int r19 = r4.getInt(r2)     // Catch:{ Exception -> 0x0216 }
                java.lang.String r2 = "mimetype"
                java.lang.String r5 = r4.getString(r2)     // Catch:{ Exception -> 0x0216 }
                java.lang.String r2 = "height"
                int r18 = r4.getInt(r2)     // Catch:{ Exception -> 0x0216 }
                java.lang.String r2 = "width"
                int r17 = r4.getInt(r2)     // Catch:{ Exception -> 0x0216 }
                java.lang.String r2 = "sticker-pack-id"
                java.lang.String r16 = X.A6n.A02(r2, r4)     // Catch:{ Exception -> 0x0216 }
                X.1Ns r2 = r3.A00     // Catch:{ Exception -> 0x0214 }
                java.io.File r3 = r2.A04(r15, r5)     // Catch:{ Exception -> 0x0214 }
                boolean r2 = r3.exists()     // Catch:{ Exception -> 0x0214 }
                if (r2 != r9) goto L_0x0200
                java.lang.String r4 = r3.getAbsolutePath()     // Catch:{ Exception -> 0x0214 }
            L_0x01a4:
                X.77d r3 = new X.77d     // Catch:{ Exception -> 0x0214 }
                r28 = r13
                r29 = r13
                r30 = r13
                r31 = r13
                r32 = r13
                r33 = r13
                r34 = r13
                r35 = r13
                r36 = r13
                r37 = r13
                r38 = r13
                r39 = r13
                r40 = r13
                r42 = r8
                r43 = r8
                r44 = r8
                r45 = r8
                r46 = r8
                r47 = r8
                r48 = r8
                r49 = r8
                r50 = r8
                r51 = r8
                r26 = r3
                r27 = r13
                r41 = r8
                r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51)     // Catch:{ Exception -> 0x0214 }
                r2 = r22
                r3.A0D = r2     // Catch:{ Exception -> 0x0214 }
                r2 = r21
                r3.A0A = r2     // Catch:{ Exception -> 0x0214 }
                r3.A0C = r15     // Catch:{ Exception -> 0x0214 }
                r3.A0F = r15     // Catch:{ Exception -> 0x0214 }
                r2 = r20
                r3.A08 = r2     // Catch:{ Exception -> 0x0214 }
                r2 = r19
                r3.A00 = r2     // Catch:{ Exception -> 0x0214 }
                r3.A0E = r5     // Catch:{ Exception -> 0x0214 }
                r2 = r18
                r3.A02 = r2     // Catch:{ Exception -> 0x0214 }
                r2 = r17
                r3.A03 = r2     // Catch:{ Exception -> 0x0214 }
                r2 = r16
                r3.A0H = r2     // Catch:{ Exception -> 0x0214 }
                goto L_0x0202
            L_0x0200:
                r4 = r13
                goto L_0x01a4
            L_0x0202:
                if (r4 == 0) goto L_0x0208
                r3.A0B = r4     // Catch:{ Exception -> 0x0214 }
                r3.A01 = r9     // Catch:{ Exception -> 0x0214 }
            L_0x0208:
                java.lang.String r2 = "application/was"
                boolean r2 = r2.equals(r5)     // Catch:{ Exception -> 0x0214 }
                r3.A0Q = r2     // Catch:{ Exception -> 0x0214 }
                r14.add(r3)     // Catch:{ CancellationException -> 0x02cc, Exception -> 0x02b7 }
                goto L_0x0220
            L_0x0214:
                r4 = move-exception
                goto L_0x0217
            L_0x0216:
                r4 = move-exception
            L_0x0217:
                java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ CancellationException -> 0x02cc, Exception -> 0x02b7 }
                java.lang.String r2 = "StickerMaker/createStickerFromJsonObject/couldn't parse json object "
                X.C17900vP.A0X(r4, r2, r3)     // Catch:{ CancellationException -> 0x02cc, Exception -> 0x02b7 }
            L_0x0220:
                int r6 = r6 + 1
                goto L_0x0146
            L_0x0224:
                boolean r2 = r14.isEmpty()     // Catch:{ CancellationException -> 0x02cc, Exception -> 0x02b7 }
                if (r2 == 0) goto L_0x0254
                com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel r4 = com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel.this     // Catch:{ CancellationException -> 0x02cc, Exception -> 0x02b7 }
                java.util.List r3 = r2     // Catch:{ CancellationException -> 0x02cc, Exception -> 0x02b7 }
                X.0wS r2 = X.C18460wS.A00     // Catch:{ CancellationException -> 0x02cc, Exception -> 0x02b7 }
                r10.J$0 = r0     // Catch:{ CancellationException -> 0x02cc, Exception -> 0x02b7 }
                r10.label = r12     // Catch:{ CancellationException -> 0x02cc, Exception -> 0x02b7 }
                java.lang.Object r2 = com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel.A08(r4, r3, r2, r13, r10)     // Catch:{ CancellationException -> 0x02cc, Exception -> 0x02b7 }
                if (r2 != r11) goto L_0x023f
                goto L_0x02fb
            L_0x023c:
                X.C30691eM.A01(r53)     // Catch:{ CancellationException -> 0x02cc, Exception -> 0x02b7 }
            L_0x023f:
                com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel r5 = com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel.this     // Catch:{ CancellationException -> 0x02cc, Exception -> 0x02b7 }
                r2 = 0
                java.lang.Long r4 = new java.lang.Long     // Catch:{ CancellationException -> 0x02cc, Exception -> 0x02b7 }
                r4.<init>(r2)     // Catch:{ CancellationException -> 0x02cc, Exception -> 0x02b7 }
                r14 = 2
                r12 = r5
                r13 = r4
                r15 = r0
                r17 = r9
                com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel.A0C(r12, r13, r14, r15, r17)     // Catch:{ CancellationException -> 0x02cc, Exception -> 0x02b7 }
                X.1Wu r0 = X.C27621Wu.A00     // Catch:{ CancellationException -> 0x02cc, Exception -> 0x02b7 }
                return r0
            L_0x0254:
                X.737[] r3 = new X.AnonymousClass737[r8]     // Catch:{ CancellationException -> 0x02cc, Exception -> 0x02b7 }
                r2 = r25
                java.lang.Object[] r2 = r2.toArray(r3)     // Catch:{ CancellationException -> 0x02cc, Exception -> 0x02b7 }
                X.737[] r2 = (X.AnonymousClass737[]) r2     // Catch:{ CancellationException -> 0x02cc, Exception -> 0x02b7 }
                java.lang.String r4 = X.C137426vR.A00(r2)     // Catch:{ CancellationException -> 0x02cc, Exception -> 0x02b7 }
                java.util.ArrayList r5 = X.C29351c6.A0D(r14)     // Catch:{ CancellationException -> 0x02cc, Exception -> 0x02b7 }
                java.util.Iterator r3 = r14.iterator()     // Catch:{ CancellationException -> 0x02cc, Exception -> 0x02b7 }
            L_0x026a:
                boolean r2 = r3.hasNext()     // Catch:{ CancellationException -> 0x02cc, Exception -> 0x02b7 }
                if (r2 == 0) goto L_0x027c
                X.77d r2 = X.C108945cZ.A0x(r3)     // Catch:{ CancellationException -> 0x02cc, Exception -> 0x02b7 }
                r2.A09 = r4     // Catch:{ CancellationException -> 0x02cc, Exception -> 0x02b7 }
                r2.A0P = r9     // Catch:{ CancellationException -> 0x02cc, Exception -> 0x02b7 }
                r5.add(r2)     // Catch:{ CancellationException -> 0x02cc, Exception -> 0x02b7 }
                goto L_0x026a
            L_0x027c:
                com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel r4 = com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel.this     // Catch:{ CancellationException -> 0x02cc, Exception -> 0x02b7 }
                java.util.List r3 = r2     // Catch:{ CancellationException -> 0x02cc, Exception -> 0x02b7 }
                r10.L$0 = r14     // Catch:{ CancellationException -> 0x02cc, Exception -> 0x02b7 }
                r10.J$0 = r0     // Catch:{ CancellationException -> 0x02cc, Exception -> 0x02b7 }
                r2 = 3
                r10.label = r2     // Catch:{ CancellationException -> 0x02cc, Exception -> 0x02b7 }
                java.lang.Object r2 = com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel.A08(r4, r3, r5, r13, r10)     // Catch:{ CancellationException -> 0x02cc, Exception -> 0x02b7 }
                if (r2 != r11) goto L_0x0291
                goto L_0x02fc
            L_0x028e:
                X.C30691eM.A01(r53)     // Catch:{ CancellationException -> 0x02cc, Exception -> 0x02b7 }
            L_0x0291:
                com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel r5 = com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel.this     // Catch:{ CancellationException -> 0x02cc, Exception -> 0x02b7 }
                int r2 = r14.size()     // Catch:{ CancellationException -> 0x02cc, Exception -> 0x02b7 }
                long r2 = (long) r2     // Catch:{ CancellationException -> 0x02cc, Exception -> 0x02b7 }
                java.lang.Long r4 = new java.lang.Long     // Catch:{ CancellationException -> 0x02cc, Exception -> 0x02b7 }
                r4.<init>(r2)     // Catch:{ CancellationException -> 0x02cc, Exception -> 0x02b7 }
                r14 = 2
                r12 = r5
                r13 = r4
                r15 = r0
                r17 = r9
                com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel.A0C(r12, r13, r14, r15, r17)     // Catch:{ CancellationException -> 0x02cc, Exception -> 0x02b7 }
                goto L_0x0017
            L_0x02a8:
                r2 = move-exception
                if (r6 == 0) goto L_0x02ae
                r6.close()     // Catch:{ CancellationException -> 0x02cc, Exception -> 0x02b7 }
            L_0x02ae:
                if (r5 == 0) goto L_0x02b3
                r5.disconnect()     // Catch:{ CancellationException -> 0x02cc, Exception -> 0x02b7 }
            L_0x02b3:
                android.net.TrafficStats.clearThreadStatsTag()     // Catch:{ CancellationException -> 0x02cc, Exception -> 0x02b7 }
                throw r2     // Catch:{ CancellationException -> 0x02cc, Exception -> 0x02b7 }
            L_0x02b7:
                r4 = move-exception
                java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
                java.lang.String r2 = "StickerExpressionsViewModel/fetchDynamicStickers/error = "
                X.C17900vP.A0X(r4, r2, r3)
                com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel r2 = com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel.this
                r3 = 0
                r7 = 0
                r4 = 2
                r5 = r0
                com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel.A0C(r2, r3, r4, r5, r7)
                goto L_0x0017
            L_0x02cc:
                r2 = move-exception
                java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
                java.lang.String r0 = "StickerExpressionsViewModel/fetchDynamicStickers/cancel = "
                X.C17900vP.A0X(r2, r0, r1)
                com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel r0 = com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel.this
                X.1G4 r0 = r0.A0l
                java.lang.Object r0 = r0.getValue()
                boolean r0 = r0 instanceof X.AnonymousClass609
                if (r0 == 0) goto L_0x0017
                com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel r4 = com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel.this
                java.util.List r3 = r2
                X.0wS r2 = X.C18460wS.A00
                r1 = 0
                r10.L$0 = r1
                r0 = 4
                r10.label = r0
                java.lang.Object r0 = com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel.A08(r4, r3, r2, r1, r10)
                if (r0 != r11) goto L_0x0017
                return r11
            L_0x02f5:
                java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
                throw r0
            L_0x02fa:
                return r11
            L_0x02fb:
                return r11
            L_0x02fc:
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel$fetchWhatsAppStoreStickers$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerExpressionsViewModel$fetchWhatsAppStoreStickers$1(StickerExpressionsViewModel stickerExpressionsViewModel, List list, Set set, C30391dr r5) {
        super(2, r5);
        this.this$0 = stickerExpressionsViewModel;
        this.$emojis = set;
        this.$localResults = list;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new StickerExpressionsViewModel$fetchWhatsAppStoreStickers$1(this.this$0, this.$localResults, this.$emojis, r6);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r7 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            final StickerExpressionsViewModel stickerExpressionsViewModel = this.this$0;
            C18600wl r4 = stickerExpressionsViewModel.A0g;
            final Set set = this.$emojis;
            final List list = this.$localResults;
            AnonymousClass1 r0 = new AnonymousClass1((C30391dr) null);
            this.label = 1;
            if (C30451dy.A00(this, r4, r0) == r7) {
                return r7;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((StickerExpressionsViewModel$fetchWhatsAppStoreStickers$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
