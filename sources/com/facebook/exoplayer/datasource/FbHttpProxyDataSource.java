package com.facebook.exoplayer.datasource;

import X.C24357Bzs;
import X.C24857CNa;
import X.C26056CrS;
import X.C26729DBg;
import X.C27066DRp;
import X.C28570E8b;
import X.C28651ECk;
import X.CZH;
import X.E9Q;
import X.ECl;
import android.net.Uri;
import java.util.List;
import java.util.Map;

public class FbHttpProxyDataSource implements E9Q, C28651ECk {
    public C28651ECk A00;
    public ECl A01;
    public long A02 = 0;
    public final CZH A03;
    public final C27066DRp A04;
    public final C24857CNa A05;
    public final C24357Bzs A06;

    public static void A00(FbHttpProxyDataSource fbHttpProxyDataSource, String str, Map map) {
        List list = (List) map.get(str);
        if (list != null) {
            fbHttpProxyDataSource.A01.C9C(str, list.get(0));
        }
    }

    public synchronized void close() {
        this.A00.close();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0027, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int read(byte[] r7, int r8, int r9) {
        /*
            r6 = this;
            monitor-enter(r6)
            long r0 = r6.A02     // Catch:{ all -> 0x0028 }
            r3 = 0
            r5 = -1
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x000c
            monitor-exit(r6)
            return r5
        L_0x000c:
            r3 = -1
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x0018
            long r2 = (long) r9
            long r0 = java.lang.Math.min(r2, r0)     // Catch:{ all -> 0x0028 }
            int r9 = (int) r0     // Catch:{ all -> 0x0028 }
        L_0x0018:
            X.ECk r0 = r6.A00     // Catch:{ all -> 0x0028 }
            int r4 = r0.read(r7, r8, r9)     // Catch:{ all -> 0x0028 }
            if (r4 == r5) goto L_0x0026
            long r2 = r6.A02     // Catch:{ all -> 0x0028 }
            long r0 = (long) r4     // Catch:{ all -> 0x0028 }
            long r2 = r2 - r0
            r6.A02 = r2     // Catch:{ all -> 0x0028 }
        L_0x0026:
            monitor-exit(r6)
            return r4
        L_0x0028:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.exoplayer.datasource.FbHttpProxyDataSource.read(byte[], int, int):int");
    }

    public Map BYJ() {
        return this.A00.BYJ();
    }

    public Uri Bb3() {
        return this.A00.Bb3();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0053, code lost:
        if (r1 != false) goto L_0x0055;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x005c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized long CAj(X.C26115Csd r28) {
        /*
            r27 = this;
            r11 = r27
            monitor-enter(r11)
            r13 = r28
            android.net.Uri r0 = r13.A04     // Catch:{ all -> 0x023d }
            r16 = r0
            X.CkW r8 = r13.A05     // Catch:{ all -> 0x023d }
            X.Chq r0 = r8.A0F     // Catch:{ all -> 0x023d }
            boolean r7 = r0.A02     // Catch:{ all -> 0x023d }
            java.lang.String r2 = r0.A00     // Catch:{ all -> 0x023d }
            java.lang.String r1 = r0.A01     // Catch:{ all -> 0x023d }
            X.CZH r0 = r11.A03     // Catch:{ all -> 0x023d }
            java.lang.String r10 = r0.A04     // Catch:{ all -> 0x023d }
            X.Chq r9 = new X.Chq     // Catch:{ all -> 0x023d }
            r9.<init>(r2, r1, r7)     // Catch:{ all -> 0x023d }
            X.CqI r6 = r8.A0E     // Catch:{ all -> 0x023d }
            if (r6 != 0) goto L_0x0024
            X.Bxp r0 = X.C24235Bxp.A00     // Catch:{ all -> 0x023d }
            X.CqI r6 = r0.mHttpPriority     // Catch:{ all -> 0x023d }
        L_0x0024:
            if (r7 == 0) goto L_0x005f
            X.DRp r5 = r11.A04     // Catch:{ all -> 0x023d }
            boolean r0 = r5.enableHttpPriorityForPrefetch     // Catch:{ all -> 0x023d }
            if (r0 == 0) goto L_0x0038
            boolean r0 = r5.useHttpPriorityIncrementalForPrefetch     // Catch:{ all -> 0x023d }
            if (r0 == 0) goto L_0x0047
            byte r1 = r6.A00     // Catch:{ all -> 0x023d }
            r0 = 1
        L_0x0033:
            X.CqI r6 = new X.CqI     // Catch:{ all -> 0x023d }
            r6.<init>(r1, r0)     // Catch:{ all -> 0x023d }
        L_0x0038:
            boolean r0 = r5.useLowerHttpPriorityForUnimportantPrefetch     // Catch:{ all -> 0x023d }
            if (r0 == 0) goto L_0x004b
            long r0 = r13.A03     // Catch:{ all -> 0x023d }
            r3 = 50000(0xc350, double:2.47033E-319)
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            r1 = 1
            if (r2 > 0) goto L_0x004c
            goto L_0x004b
        L_0x0047:
            byte r1 = r6.A00     // Catch:{ all -> 0x023d }
            r0 = 0
            goto L_0x0033
        L_0x004b:
            r1 = 0
        L_0x004c:
            boolean r0 = r5.useLowerHttpPriorityForAllPrefetch     // Catch:{ all -> 0x023d }
            if (r0 == 0) goto L_0x0053
            if (r1 == 0) goto L_0x0055
            goto L_0x0092
        L_0x0053:
            if (r1 == 0) goto L_0x009a
        L_0x0055:
            boolean r0 = r5.useHttpPriorityIncrementalForPrefetch     // Catch:{ all -> 0x023d }
            if (r0 == 0) goto L_0x005c
            X.Bxp r0 = X.C24235Bxp.A06     // Catch:{ all -> 0x023d }
            goto L_0x0098
        L_0x005c:
            X.Bxp r0 = X.C24235Bxp.A05     // Catch:{ all -> 0x023d }
            goto L_0x0098
        L_0x005f:
            X.DRp r5 = r11.A04     // Catch:{ all -> 0x023d }
            boolean r0 = r5.enableHttpPriorityForStreaming     // Catch:{ all -> 0x023d }
            if (r0 == 0) goto L_0x009a
            boolean r0 = r5.useHttpPriorityIncrementalForStreaming     // Catch:{ all -> 0x023d }
            if (r0 == 0) goto L_0x007c
            X.Bxp r0 = X.C24235Bxp.A04     // Catch:{ all -> 0x023d }
        L_0x006b:
            X.CqI r6 = r0.mHttpPriority     // Catch:{ all -> 0x023d }
            int r1 = r5.bufferedDurationBasedHttpPriorityUpperBoundMs     // Catch:{ all -> 0x023d }
            if (r1 <= 0) goto L_0x009a
            int r0 = r8.A00     // Catch:{ all -> 0x023d }
            if (r0 <= r1) goto L_0x009a
            boolean r1 = r5.useHttpPriorityWarmupForLongBufferedStreaming     // Catch:{ all -> 0x023d }
            boolean r0 = r5.useHttpPriorityIncrementalForLongBufferedStreaming     // Catch:{ all -> 0x023d }
            if (r1 == 0) goto L_0x0085
            goto L_0x007f
        L_0x007c:
            X.Bxp r0 = X.C24235Bxp.A03     // Catch:{ all -> 0x023d }
            goto L_0x006b
        L_0x007f:
            if (r0 == 0) goto L_0x0082
            goto L_0x008d
        L_0x0082:
            X.Bxp r0 = X.C24235Bxp.A09     // Catch:{ all -> 0x023d }
            goto L_0x008f
        L_0x0085:
            if (r0 == 0) goto L_0x008a
            X.Bxp r0 = X.C24235Bxp.A02     // Catch:{ all -> 0x023d }
            goto L_0x008f
        L_0x008a:
            X.Bxp r0 = X.C24235Bxp.A01     // Catch:{ all -> 0x023d }
            goto L_0x008f
        L_0x008d:
            X.Bxp r0 = X.C24235Bxp.A0A     // Catch:{ all -> 0x023d }
        L_0x008f:
            X.CqI r6 = r0.mHttpPriority     // Catch:{ all -> 0x023d }
            goto L_0x009a
        L_0x0092:
            boolean r0 = r5.useHttpPriorityIncrementalForPrefetch     // Catch:{ all -> 0x023d }
            if (r0 == 0) goto L_0x00d3
            X.Bxp r0 = X.C24235Bxp.A08     // Catch:{ all -> 0x023d }
        L_0x0098:
            X.CqI r6 = r0.mHttpPriority     // Catch:{ all -> 0x023d }
        L_0x009a:
            byte[] r0 = r13.A08     // Catch:{ all -> 0x023d }
            r19 = r0
            long r14 = r13.A01     // Catch:{ all -> 0x023d }
            long r2 = r13.A03     // Catch:{ all -> 0x023d }
            long r0 = r13.A02     // Catch:{ all -> 0x023d }
            java.lang.String r4 = r13.A06     // Catch:{ all -> 0x023d }
            r18 = r4
            int r4 = r13.A00     // Catch:{ all -> 0x023d }
            r20 = r4
            r12 = 0
            X.CkW r4 = new X.CkW     // Catch:{ all -> 0x023d }
            r4.<init>(r6, r9, r8)     // Catch:{ all -> 0x023d }
            X.Csd r9 = new X.Csd     // Catch:{ all -> 0x023d }
            r17 = r4
            r21 = r14
            r23 = r2
            r25 = r0
            r15 = r9
            r15.<init>(r16, r17, r18, r19, r20, r21, r23, r25)     // Catch:{ all -> 0x023d }
            boolean r0 = r5.enableVideoPlayerServerSideBweAnnotations     // Catch:{ all -> 0x023d }
            if (r0 == 0) goto L_0x00f0
            X.Bzs r1 = r11.A06     // Catch:{ all -> 0x023d }
            X.Bzs r0 = X.C24357Bzs.DASH_VIDEO     // Catch:{ all -> 0x023d }
            if (r1 == r0) goto L_0x00d6
            X.Bzs r0 = X.C24357Bzs.PROGRESSIVE     // Catch:{ all -> 0x023d }
            if (r1 == r0) goto L_0x00d6
            X.Bzs r0 = X.C24357Bzs.LIVE_VIDEO     // Catch:{ all -> 0x023d }
            if (r1 != r0) goto L_0x00f0
            goto L_0x00d6
        L_0x00d3:
            X.Bxp r0 = X.C24235Bxp.A07     // Catch:{ all -> 0x023d }
            goto L_0x0098
        L_0x00d6:
            if (r7 == 0) goto L_0x00db
            java.lang.Integer r0 = X.AnonymousClass00R.A01     // Catch:{ all -> 0x023d }
            goto L_0x00dd
        L_0x00db:
            java.lang.Integer r0 = X.AnonymousClass00R.A0C     // Catch:{ all -> 0x023d }
        L_0x00dd:
            java.lang.String r2 = "x-fb-ssbwe-annotation-request-type"
            int r0 = r0.intValue()     // Catch:{ all -> 0x023d }
            int r0 = 1 - r0
            if (r0 == 0) goto L_0x00f9
            java.lang.String r1 = "android-playing-video"
        L_0x00e9:
            X.CkW r0 = r9.A05     // Catch:{ all -> 0x023d }
            java.util.Map r0 = r0.A0N     // Catch:{ all -> 0x023d }
            r0.put(r2, r1)     // Catch:{ all -> 0x023d }
        L_0x00f0:
            com.facebook.video.heroplayer.setting.FbAutogeneratedSettings r0 = r5.autogenSettings     // Catch:{ all -> 0x023d }
            if (r0 == 0) goto L_0x0144
            boolean r0 = r0.enableSloHttpHeaderLogging     // Catch:{ all -> 0x023d }
            if (r0 == 0) goto L_0x0144
            goto L_0x00fc
        L_0x00f9:
            java.lang.String r1 = "android-prefetch-video"
            goto L_0x00e9
        L_0x00fc:
            if (r10 == 0) goto L_0x010f
            X.Cgv r1 = X.C25499Cgv.A01     // Catch:{ all -> 0x023d }
            monitor-enter(r1)     // Catch:{ all -> 0x023d }
            android.util.LruCache r0 = r1.A00     // Catch:{ all -> 0x023a }
            java.lang.Object r0 = r0.get(r10)     // Catch:{ all -> 0x023a }
            boolean r0 = X.AnonymousClass000.A1W(r0)
            monitor-exit(r1)     // Catch:{ all -> 0x023d }
            if (r0 == 0) goto L_0x010f
            goto L_0x0144
        L_0x010f:
            java.util.Map r4 = r8.A0N     // Catch:{ all -> 0x023d }
            java.lang.String r1 = "x-fb-qpl-ec"
            boolean r0 = r4.containsKey(r1)     // Catch:{ all -> 0x023d }
            if (r0 != 0) goto L_0x011c
            X.C25868Cnb.A02(r13)     // Catch:{ all -> 0x023d }
        L_0x011c:
            java.lang.String r3 = X.C17880vN.A0s(r1, r4)     // Catch:{ all -> 0x023d }
            if (r3 == 0) goto L_0x0144
            X.CkW r0 = r9.A05     // Catch:{ all -> 0x023d }
            java.util.Map r2 = r0.A0N     // Catch:{ all -> 0x023d }
            r2.clear()     // Catch:{ all -> 0x023d }
            java.util.Iterator r1 = X.AnonymousClass000.A15(r4)     // Catch:{ all -> 0x023d }
        L_0x012d:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x023d }
            if (r0 == 0) goto L_0x013b
            java.util.Map$Entry r0 = X.AnonymousClass000.A16(r1)     // Catch:{ all -> 0x023d }
            X.C108985cd.A1T(r0, r2)     // Catch:{ all -> 0x023d }
            goto L_0x012d
        L_0x013b:
            X.Cgv r1 = X.C25499Cgv.A01     // Catch:{ all -> 0x023d }
            monitor-enter(r1)     // Catch:{ all -> 0x023d }
            android.util.LruCache r0 = r1.A00     // Catch:{ all -> 0x023a }
            r0.put(r10, r3)     // Catch:{ all -> 0x023a }
            monitor-exit(r1)     // Catch:{ all -> 0x023d }
        L_0x0144:
            X.ECl r1 = r11.A01     // Catch:{ IOException -> 0x0238 }
            if (r1 == 0) goto L_0x014d
            X.Bzr r0 = X.C24356Bzr.NOT_CACHED     // Catch:{ IOException -> 0x0238 }
            r1.C9D(r9, r0)     // Catch:{ IOException -> 0x0238 }
        L_0x014d:
            X.ECk r1 = r11.A00     // Catch:{ IOException -> 0x0238 }
            long r6 = r1.CAj(r9)     // Catch:{ IOException -> 0x0238 }
            r8 = 1
            boolean r0 = r5.enableCaseInsensitiveHttpResponseHeaderKey     // Catch:{ all -> 0x023d }
            boolean r4 = X.AnonymousClass000.A1O(r0)
            java.util.Map r3 = r1.BYJ()     // Catch:{ all -> 0x023d }
            if (r3 == 0) goto L_0x01f4
            X.ECl r0 = r11.A01     // Catch:{ all -> 0x023d }
            if (r0 == 0) goto L_0x01f4
            java.lang.String r2 = "X-FB-Connection-Quality"
            java.util.List r0 = X.C25868Cnb.A01(r2, r3, r4)     // Catch:{ all -> 0x023d }
            if (r0 == 0) goto L_0x0175
            java.lang.String r1 = X.C17880vN.A0w(r0, r12)     // Catch:{ all -> 0x023d }
            X.ECl r0 = r11.A01     // Catch:{ all -> 0x023d }
            r0.C9C(r2, r1)     // Catch:{ all -> 0x023d }
        L_0x0175:
            java.lang.String r2 = "x-fb-cec-video-limit"
            java.util.List r0 = X.AnonymousClass8BS.A0t(r2, r3)     // Catch:{ all -> 0x023d }
            if (r0 == 0) goto L_0x0186
            java.lang.String r1 = X.C17880vN.A0w(r0, r12)     // Catch:{ all -> 0x023d }
            X.ECl r0 = r11.A01     // Catch:{ all -> 0x023d }
            r0.C9C(r2, r1)     // Catch:{ all -> 0x023d }
        L_0x0186:
            java.lang.String r0 = "up-ttfb"
            A00(r11, r0, r3)     // Catch:{ all -> 0x023d }
            java.lang.String r0 = "x-fb-log-session-id"
            A00(r11, r0, r3)     // Catch:{ all -> 0x023d }
            java.lang.String r0 = "x-fb-log-transaction-id"
            A00(r11, r0, r3)     // Catch:{ all -> 0x023d }
            java.lang.String r0 = "x-fb-session-id"
            A00(r11, r0, r3)     // Catch:{ all -> 0x023d }
            java.lang.String r0 = "x-fb-response-time-ms"
            A00(r11, r0, r3)     // Catch:{ all -> 0x023d }
            java.lang.String r0 = "x-bwe-mean"
            A00(r11, r0, r3)     // Catch:{ all -> 0x023d }
            java.lang.String r0 = "x-bwe-std-dev"
            A00(r11, r0, r3)     // Catch:{ all -> 0x023d }
            java.lang.String r0 = "x-fb-dynamic-predictive-response-chunk-size"
            A00(r11, r0, r3)     // Catch:{ all -> 0x023d }
            java.util.Iterator r13 = X.AnonymousClass000.A15(r3)     // Catch:{ all -> 0x023d }
        L_0x01b2:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x023d }
            if (r0 == 0) goto L_0x01f4
            java.util.Map$Entry r5 = X.AnonymousClass000.A16(r13)     // Catch:{ all -> 0x023d }
            java.lang.Object r0 = r5.getKey()     // Catch:{ all -> 0x023d }
            if (r0 == 0) goto L_0x01b2
            java.lang.Object r0 = r5.getValue()     // Catch:{ all -> 0x023d }
            if (r0 == 0) goto L_0x01b2
            java.lang.Object r0 = r5.getValue()     // Catch:{ all -> 0x023d }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x023d }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x023d }
            if (r0 != 0) goto L_0x01b2
            java.lang.String r1 = X.C17880vN.A0x(r5)     // Catch:{ all -> 0x023d }
            java.lang.String r0 = "x-fb-ull-"
            boolean r0 = r1.startsWith(r0)     // Catch:{ all -> 0x023d }
            if (r0 == 0) goto L_0x01b2
            X.ECl r2 = r11.A01     // Catch:{ all -> 0x023d }
            java.lang.String r1 = X.C17880vN.A0x(r5)     // Catch:{ all -> 0x023d }
            java.lang.Object r0 = r5.getValue()     // Catch:{ all -> 0x023d }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x023d }
            java.lang.Object r0 = r0.get(r12)     // Catch:{ all -> 0x023d }
            r2.C9C(r1, r0)     // Catch:{ all -> 0x023d }
            goto L_0x01b2
        L_0x01f4:
            long r2 = X.C25868Cnb.A00(r3, r4)     // Catch:{ all -> 0x023d }
            long r4 = r9.A03     // Catch:{ all -> 0x023d }
            long r2 = r2 - r4
            r0 = 0
            long r2 = java.lang.Math.max(r0, r2)     // Catch:{ all -> 0x023d }
            r16 = -1
            int r0 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x020e
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x020e
            r11.A02 = r6     // Catch:{ all -> 0x023d }
            goto L_0x0210
        L_0x020e:
            r11.A02 = r2     // Catch:{ all -> 0x023d }
        L_0x0210:
            java.lang.String r15 = "com.facebook.exoplayer.datasource.FbHttpProxyDataSource"
            java.lang.String r14 = "Opening data spec Offset: %d, Length %d Open Length %d Videoid %s Key %s"
            r0 = 5
            java.lang.Object[] r13 = new java.lang.Object[r0]     // Catch:{ all -> 0x023d }
            X.AnonymousClass3MX.A1S(r13, r12, r4)     // Catch:{ all -> 0x023d }
            long r0 = r9.A02     // Catch:{ all -> 0x023d }
            X.AnonymousClass3MX.A1S(r13, r8, r0)     // Catch:{ all -> 0x023d }
            java.lang.Long r4 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x023d }
            X.AnonymousClass001.A1R(r4, r10, r13)     // Catch:{ all -> 0x023d }
            java.lang.String r5 = r9.A06     // Catch:{ all -> 0x023d }
            r4 = 4
            r13[r4] = r5     // Catch:{ all -> 0x023d }
            X.C25922Cog.A01(r15, r14, r13)     // Catch:{ all -> 0x023d }
            int r4 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r4 == 0) goto L_0x0236
            long r2 = java.lang.Math.min(r6, r2)     // Catch:{ all -> 0x023d }
        L_0x0236:
            monitor-exit(r11)
            return r2
        L_0x0238:
            r0 = move-exception
            goto L_0x023c
        L_0x023a:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x023d }
        L_0x023c:
            throw r0     // Catch:{ all -> 0x023d }
        L_0x023d:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.exoplayer.datasource.FbHttpProxyDataSource.CAj(X.Csd):long");
    }

    public FbHttpProxyDataSource(C28651ECk eCk, ECl eCl, C24857CNa cNa, CZH czh, C27066DRp dRp, int i) {
        C24357Bzs bzs;
        this.A03 = czh;
        this.A00 = eCk;
        this.A01 = eCl;
        C24357Bzs[] values = C24357Bzs.values();
        int length = values.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                bzs = C24357Bzs.UNKNOWN;
                break;
            }
            bzs = values[i2];
            if (bzs.value == i) {
                break;
            }
            i2++;
        }
        this.A06 = bzs;
        this.A04 = dRp;
        this.A05 = cNa;
    }

    public void BBr(C28570E8b e8b) {
        C26056CrS.A01(e8b);
        if (e8b instanceof ECl) {
            this.A01 = (ECl) e8b;
        } else {
            this.A01 = new C26729DBg(e8b);
        }
    }
}
