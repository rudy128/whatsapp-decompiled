package X;

import android.os.Handler;

/* renamed from: X.DTf  reason: case insensitive filesystem */
public class C27080DTf implements Runnable {
    public final int A00;
    public final Object A01;

    public C27080DTf(C18480wV r1, int i) {
        this.A00 = i;
        this.A01 = r1;
    }

    public static void A00(Handler handler, Object obj, int i) {
        handler.post(new C27080DTf(obj, i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: android.animation.ValueAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: android.animation.AnimatorSet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: android.animation.ValueAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v16, resolved type: android.animation.ValueAnimator} */
    /* JADX WARNING: type inference failed for: r10v9, types: [X.CWG, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r11v5, types: [boolean] */
    /* JADX WARNING: type inference failed for: r1v56, types: [X.CWG, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v59, types: [X.CWG, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v61, types: [X.CWG, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
        if ("[DEFAULT]".equals(r1) != false) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0398, code lost:
        android.util.Log.w(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x039b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x04e1, code lost:
        if (java.lang.System.currentTimeMillis() > r10.A01) goto L_0x04e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x0736, code lost:
        if (java.lang.System.currentTimeMillis() > r4.A01) goto L_0x0738;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00c2, code lost:
        if (android.text.TextUtils.isEmpty(r2) != false) goto L_0x00c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:576:0x0aee, code lost:
        r1.postFrameCallback(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:577:0x0af1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01b9, code lost:
        r1.invoke(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01bc, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:307:0x062d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:439:0x08b7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x062d A[SYNTHETIC, Splitter:B:307:0x062d] */
    /* JADX WARNING: Removed duplicated region for block: B:439:0x08b7 A[SYNTHETIC, Splitter:B:439:0x08b7] */
    /* JADX WARNING: Removed duplicated region for block: B:492:0x0984  */
    /* JADX WARNING: Removed duplicated region for block: B:494:0x0988  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:256:0x04e4=Splitter:B:256:0x04e4, B:439:0x08b7=Splitter:B:439:0x08b7, B:375:0x0739=Splitter:B:375:0x0739, B:366:0x070b=Splitter:B:366:0x070b, B:307:0x062d=Splitter:B:307:0x062d} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r32 = this;
            r3 = r32
            int r0 = r3.A00
            switch(r0) {
                case 0: goto L_0x0125;
                case 1: goto L_0x0135;
                case 2: goto L_0x014c;
                case 3: goto L_0x01a7;
                case 4: goto L_0x01bd;
                case 5: goto L_0x01bd;
                case 6: goto L_0x09ff;
                case 7: goto L_0x01f7;
                case 8: goto L_0x020f;
                case 9: goto L_0x0223;
                case 10: goto L_0x022d;
                case 11: goto L_0x0255;
                case 12: goto L_0x025d;
                case 13: goto L_0x0277;
                case 14: goto L_0x0287;
                case 15: goto L_0x029c;
                case 16: goto L_0x02e2;
                case 17: goto L_0x0306;
                case 18: goto L_0x0315;
                case 19: goto L_0x0325;
                case 20: goto L_0x032d;
                case 21: goto L_0x0351;
                case 22: goto L_0x03aa;
                case 23: goto L_0x03b3;
                case 24: goto L_0x0449;
                case 25: goto L_0x0452;
                case 26: goto L_0x0462;
                case 27: goto L_0x0471;
                case 28: goto L_0x047b;
                case 29: goto L_0x0483;
                case 30: goto L_0x0007;
                case 31: goto L_0x0007;
                case 32: goto L_0x09c7;
                case 33: goto L_0x0a12;
                case 34: goto L_0x0a3a;
                case 35: goto L_0x0a8d;
                case 36: goto L_0x0a99;
                case 37: goto L_0x0aa4;
                case 38: goto L_0x011e;
                case 39: goto L_0x0af2;
                case 40: goto L_0x0afc;
                case 41: goto L_0x0b06;
                case 42: goto L_0x0b13;
                case 43: goto L_0x0b1b;
                case 44: goto L_0x0b31;
                case 45: goto L_0x0b52;
                case 46: goto L_0x0b5a;
                case 47: goto L_0x0b66;
                case 48: goto L_0x0b82;
                case 49: goto L_0x0bb3;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r3 = r3.A01
            X.0wV r3 = (X.C18480wV) r3
            r6 = 0
            java.lang.Object r10 = X.C18480wV.A0B
            monitor-enter(r10)
            X.0vy r7 = r3.A02     // Catch:{ all -> 0x011b }
            X.C18220vy.A02(r7)     // Catch:{ all -> 0x011b }
            android.content.Context r0 = r7.A00     // Catch:{ all -> 0x011b }
            X.2qW r9 = X.C61932qW.A00(r0)     // Catch:{ all -> 0x011b }
            X.0xE r4 = r3.A05     // Catch:{ all -> 0x0114 }
            X.Bm0 r5 = r4.A01()     // Catch:{ all -> 0x0114 }
            java.lang.Integer r2 = r5.A02     // Catch:{ all -> 0x0114 }
            java.lang.Integer r0 = X.AnonymousClass00R.A01     // Catch:{ all -> 0x0114 }
            if (r2 == r0) goto L_0x002a
            java.lang.Integer r0 = X.AnonymousClass00R.A00     // Catch:{ all -> 0x0114 }
            if (r2 != r0) goto L_0x010c
        L_0x002a:
            X.C18220vy.A02(r7)     // Catch:{ all -> 0x0114 }
            java.lang.String r1 = r7.A05     // Catch:{ all -> 0x0114 }
            java.lang.String r0 = "CHIME_ANDROID_SDK"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0114 }
            if (r0 != 0) goto L_0x0042
            java.lang.String r0 = "[DEFAULT]"
            X.C18220vy.A02(r7)     // Catch:{ all -> 0x0114 }
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x0114 }
            if (r0 == 0) goto L_0x00c4
        L_0x0042:
            java.lang.Integer r0 = X.AnonymousClass00R.A00     // Catch:{ all -> 0x0114 }
            if (r2 != r0) goto L_0x00c4
            X.0wC r0 = r3.A03     // Catch:{ all -> 0x0114 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0114 }
            X.2pg r0 = (X.C61432pg) r0     // Catch:{ all -> 0x0114 }
            android.content.SharedPreferences r7 = r0.A00     // Catch:{ all -> 0x0114 }
            monitor-enter(r7)     // Catch:{ all -> 0x0114 }
            java.lang.String r0 = "|S|id"
            r8 = 0
            java.lang.String r2 = r7.getString(r0, r8)     // Catch:{ all -> 0x00b9 }
            if (r2 != 0) goto L_0x00b7
            java.lang.String r0 = "|S||P|"
            java.lang.String r1 = r7.getString(r0, r8)     // Catch:{ all -> 0x00b9 }
            if (r1 != 0) goto L_0x0064
            r2 = r8
            goto L_0x00b7
        L_0x0064:
            r0 = 8
            byte[] r2 = android.util.Base64.decode(r1, r0)     // Catch:{ IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x00a6 }
            java.lang.String r0 = "RSA"
            java.security.KeyFactory r1 = java.security.KeyFactory.getInstance(r0)     // Catch:{ IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x00a6 }
            java.security.spec.X509EncodedKeySpec r0 = new java.security.spec.X509EncodedKeySpec     // Catch:{ IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x00a6 }
            r0.<init>(r2)     // Catch:{ IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x00a6 }
            java.security.PublicKey r0 = r1.generatePublic(r0)     // Catch:{ IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException -> 0x00a6 }
            if (r0 == 0) goto L_0x00b6
            byte[] r1 = r0.getEncoded()     // Catch:{ all -> 0x00b9 }
            java.lang.String r0 = "SHA1"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)     // Catch:{ NoSuchAlgorithmException -> 0x009d }
            byte[] r2 = r0.digest(r1)     // Catch:{ NoSuchAlgorithmException -> 0x009d }
            byte r0 = r2[r6]     // Catch:{ NoSuchAlgorithmException -> 0x009d }
            r0 = r0 & 15
            int r0 = r0 + 112
            r0 = r0 & 255(0xff, float:3.57E-43)
            byte r0 = (byte) r0     // Catch:{ NoSuchAlgorithmException -> 0x009d }
            r2[r6] = r0     // Catch:{ NoSuchAlgorithmException -> 0x009d }
            r1 = 8
            r0 = 11
            java.lang.String r2 = android.util.Base64.encodeToString(r2, r6, r1, r0)     // Catch:{ NoSuchAlgorithmException -> 0x009d }
            goto L_0x00b7
        L_0x009d:
            java.lang.String r1 = "ContentValues"
            java.lang.String r0 = "Unexpected error, device missing required algorithms"
            android.util.Log.w(r1, r0)     // Catch:{ all -> 0x00b9 }
            r2 = 0
            goto L_0x00b7
        L_0x00a6:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x00b9 }
            java.lang.String r0 = "Invalid key stored "
            java.lang.String r1 = X.AnonymousClass001.A1E(r2, r0, r1)     // Catch:{ all -> 0x00b9 }
            java.lang.String r0 = "ContentValues"
            android.util.Log.w(r0, r1)     // Catch:{ all -> 0x00b9 }
        L_0x00b6:
            r2 = r8
        L_0x00b7:
            monitor-exit(r7)     // Catch:{ all -> 0x00bb }
            goto L_0x00be
        L_0x00b9:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00bb }
        L_0x00bb:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x00bb }
            throw r0     // Catch:{ all -> 0x0114 }
        L_0x00be:
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0114 }
            if (r0 == 0) goto L_0x00fb
        L_0x00c4:
            byte r0 = X.C18840xF.A00     // Catch:{ all -> 0x0114 }
            java.util.UUID r1 = java.util.UUID.randomUUID()     // Catch:{ all -> 0x0114 }
            r0 = 17
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x0114 }
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)     // Catch:{ all -> 0x0114 }
            X.BEA.A1T(r0, r1)     // Catch:{ all -> 0x0114 }
            byte[] r2 = r0.array()     // Catch:{ all -> 0x0114 }
            byte r1 = r2[r6]     // Catch:{ all -> 0x0114 }
            r0 = 16
            r2[r0] = r1     // Catch:{ all -> 0x0114 }
            byte r0 = X.C18840xF.A01     // Catch:{ all -> 0x0114 }
            r1 = r1 & r0
            byte r0 = X.C18840xF.A00     // Catch:{ all -> 0x0114 }
            X.BE6.A1N(r2, r1, r0, r6)     // Catch:{ all -> 0x0114 }
            r0 = 11
            byte[] r1 = android.util.Base64.encode(r2, r0)     // Catch:{ all -> 0x0114 }
            java.nio.charset.Charset r0 = java.nio.charset.Charset.defaultCharset()     // Catch:{ all -> 0x0114 }
            java.lang.String r1 = X.BE6.A0q(r0, r1)     // Catch:{ all -> 0x0114 }
            r0 = 22
            java.lang.String r2 = r1.substring(r6, r0)     // Catch:{ all -> 0x0114 }
        L_0x00fb:
            X.CXF r1 = r5.A01()     // Catch:{ all -> 0x0114 }
            r1.A04 = r2     // Catch:{ all -> 0x0114 }
            java.lang.Integer r0 = X.AnonymousClass00R.A0C     // Catch:{ all -> 0x0114 }
            r1.A00 = r0     // Catch:{ all -> 0x0114 }
            X.Bm0 r5 = r1.A00()     // Catch:{ all -> 0x0114 }
            r4.A02(r5)     // Catch:{ all -> 0x0114 }
        L_0x010c:
            if (r9 == 0) goto L_0x0111
            r9.A01()     // Catch:{ all -> 0x011b }
        L_0x0111:
            monitor-exit(r10)     // Catch:{ all -> 0x011b }
            goto L_0x0ba3
        L_0x0114:
            r0 = move-exception
            if (r9 == 0) goto L_0x011a
            r9.A01()     // Catch:{ all -> 0x011b }
        L_0x011a:
            throw r0     // Catch:{ all -> 0x011b }
        L_0x011b:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x011b }
            throw r0
        L_0x011e:
            java.lang.String r0 = "success"
            java.lang.NullPointerException r1 = X.AnonymousClass000.A0s(r0)
            throw r1
        L_0x0125:
            java.lang.Object r3 = r3.A01
            android.os.MessageQueue r2 = android.os.Looper.myQueue()
            r1 = 1
            X.Cz3 r0 = new X.Cz3
            r0.<init>(r3, r1)
            r2.addIdleHandler(r0)
            return
        L_0x0135:
            java.lang.Object r2 = r3.A01
            X.Cyg r2 = (X.C26380Cyg) r2
            boolean r0 = r2.A0p
            if (r0 == 0) goto L_0x0bb2
            boolean r0 = r2.A0T
            if (r0 != 0) goto L_0x0bb2
            java.lang.String r1 = "release timed out: check after 5 secs"
            java.util.concurrent.TimeoutException r0 = new java.util.concurrent.TimeoutException
            r0.<init>(r1)
            X.C26380Cyg.A0C(r2, r0)
            return
        L_0x014c:
            java.lang.String r0 = "Encrypt link timed out!"
            java.lang.String r4 = "LinkSetup"
            X.C26294Cx6.A05(r4, r0)
            java.lang.Object r3 = r3.A01
            X.CuL r3 = (X.C26193CuL) r3
            r0 = 0
            r3.A01 = r0
            int r1 = r3.A00
            r0 = 1
            if (r1 >= r0) goto L_0x019f
            int r2 = r1 + 1
            r3.A00 = r2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Retrying with new channel! #"
            java.lang.String r0 = X.AnonymousClass001.A1I(r0, r1, r2)
            X.C26294Cx6.A05(r4, r0)
            com.facebook.wearable.datax.LocalChannel r1 = r3.A02
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            r1.close()     // Catch:{ all -> 0x0179 }
        L_0x0179:
            com.facebook.wearable.datax.Connection r1 = r3.A09
            r0 = 5
            com.facebook.wearable.datax.LocalChannel r2 = new com.facebook.wearable.datax.LocalChannel
            r2.<init>(r1, r0)
            r1 = 3
            X.DfX r0 = new X.DfX
            r0.<init>(r3, r1)
            r2.onReceived = r0
            X.Dof r0 = new X.Dof
            r0.<init>(r3)
            r2.onError = r0
            X.DnO r0 = X.C27887DnO.A00
            r2.onClosed = r0
            r3.A02 = r2
            X.Dgm r0 = new X.Dgm
            r0.<init>(r3)
            X.C26193CuL.A01(r3, r0)
            return
        L_0x019f:
            X.1Di r1 = r3.A0G
            X.BWJ r0 = new X.BWJ
            r0.<init>()
            goto L_0x01b9
        L_0x01a7:
            java.lang.String r1 = "LinkSetup"
            java.lang.String r0 = "Set link timed out!"
            X.C26294Cx6.A05(r1, r0)
            java.lang.Object r0 = r3.A01
            X.CuL r0 = (X.C26193CuL) r0
            X.1Di r1 = r0.A0G
            X.BWL r0 = new X.BWL
            r0.<init>()
        L_0x01b9:
            r1.invoke(r0)
            return
        L_0x01bd:
            java.lang.Object r5 = r3.A01
            X.CSZ r5 = (X.CSZ) r5
            long r6 = java.lang.System.currentTimeMillis()
        L_0x01c5:
            java.util.concurrent.ConcurrentLinkedQueue r1 = r5.A03
            java.lang.Object r0 = r1.peek()
            X.BTL r0 = (X.BTL) r0
            if (r0 == 0) goto L_0x0bb2
            long r3 = r0.A01
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 > 0) goto L_0x01e8
            long r2 = r5.A01
            java.lang.Object r0 = r1.poll()
            X.BTL r0 = (X.BTL) r0
            if (r0 == 0) goto L_0x01e6
            int r0 = r0.A00
        L_0x01e1:
            long r0 = (long) r0
            long r2 = r2 - r0
            r5.A01 = r2
            goto L_0x01c5
        L_0x01e6:
            r0 = 0
            goto L_0x01e1
        L_0x01e8:
            long r3 = r3 - r6
            java.util.concurrent.ScheduledExecutorService r2 = r5.A04
            r0 = 5
            X.DTf r1 = new X.DTf
            r1.<init>((java.lang.Object) r5, (int) r0)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            r2.schedule(r1, r3, r0)
            return
        L_0x01f7:
            java.lang.String r0 = "TIMEOUT"
            java.io.IOException r1 = X.C17880vN.A0f(r0)
            java.lang.Object r0 = r3.A01
            com.google.android.gms.tasks.TaskCompletionSource r0 = (com.google.android.gms.tasks.TaskCompletionSource) r0
            com.google.android.gms.tasks.zzw r0 = r0.zza
            boolean r0 = r0.zzd(r1)
            if (r0 == 0) goto L_0x0bb2
            java.lang.String r1 = "Rpc"
            java.lang.String r0 = "No response"
            goto L_0x0398
        L_0x020f:
            java.lang.Object r2 = r3.A01
            X.Cxy r2 = (X.C26341Cxy) r2
            monitor-enter(r2)
            int r1 = r2.A00     // Catch:{ all -> 0x0220 }
            r0 = 1
            if (r1 != r0) goto L_0x021e
            java.lang.String r0 = "Timed out while binding"
            r2.A01(r0)     // Catch:{ all -> 0x0220 }
        L_0x021e:
            monitor-exit(r2)
            return
        L_0x0220:
            r1 = move-exception
            monitor-exit(r2)
            throw r1
        L_0x0223:
            java.lang.Object r1 = r3.A01
            X.Cxy r1 = (X.C26341Cxy) r1
            java.lang.String r0 = "Service disconnected"
            r1.A01(r0)
            return
        L_0x022d:
            java.lang.Object r0 = r3.A01
            X.DIm r0 = (X.C26905DIm) r0
            android.content.Context r2 = r0.A0B
            java.util.concurrent.atomic.AtomicBoolean r1 = com.google.android.gms.common.GooglePlayServicesUtil.A02
            r0 = 1
            boolean r0 = r1.getAndSet(r0)
            if (r0 != 0) goto L_0x0bb2
            java.lang.String r0 = "notification"
            java.lang.Object r1 = r2.getSystemService(r0)     // Catch:{ SecurityException -> 0x024c }
            android.app.NotificationManager r1 = (android.app.NotificationManager) r1     // Catch:{ SecurityException -> 0x024c }
            if (r1 == 0) goto L_0x0bb2
            r0 = 10436(0x28c4, float:1.4624E-41)
            r1.cancel(r0)     // Catch:{ SecurityException -> 0x024c }
            return
        L_0x024c:
            r2 = move-exception
            java.lang.String r1 = "GooglePlayServicesUtil"
            java.lang.String r0 = "Suppressing Security Exception %s in cancelAvailabilityErrorNotifications."
            android.util.Log.d(r1, r0, r2)
            return
        L_0x0255:
            java.lang.Object r0 = r3.A01
            X.DIr r0 = (X.C26910DIr) r0
            X.C26910DIr.A04(r0)
            return
        L_0x025d:
            java.lang.Object r0 = r3.A01
            X.CLE r0 = (X.CLE) r0
            X.DIr r0 = r0.A00
            X.EDS r2 = r0.A04
            java.lang.String r0 = X.C17890vO.A0U(r2)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = " disconnecting because it was signed out."
            java.lang.String r0 = r1.concat(r0)
            r2.BIo(r0)
            return
        L_0x0277:
            java.lang.Object r0 = r3.A01
            X.Bi8 r0 = (X.C23501Bi8) r0
            X.E5E r2 = r0.A00
            r1 = 4
            X.Bcx r0 = new X.Bcx
            r0.<init>(r1)
            r2.CSl(r0)
            return
        L_0x0287:
            java.lang.Object r1 = r3.A01
            X.DIp r1 = (X.C26908DIp) r1
            java.util.concurrent.locks.Lock r0 = r1.A0B
            r0.lock()
            X.C26908DIp.A02(r1)     // Catch:{ all -> 0x0297 }
            r0.unlock()
            return
        L_0x0297:
            r1 = move-exception
            r0.unlock()
            throw r1
        L_0x029c:
            java.lang.Object r4 = r3.A01
            X.CqV r4 = (X.C26014CqV) r4
            java.lang.Object r3 = r4.A08
            monitor-enter(r3)
            boolean r0 = r4.A02()     // Catch:{ all -> 0x02df }
            if (r0 == 0) goto L_0x02dd
            java.lang.String r2 = "WakeLock"
            java.lang.String r0 = r4.A09     // Catch:{ all -> 0x02df }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x02df }
            java.lang.String r0 = " ** IS FORCE-RELEASED ON TIMEOUT **"
            X.BE7.A1K(r1, r0, r2)     // Catch:{ all -> 0x02df }
            java.util.Set r2 = r4.A0B     // Catch:{ all -> 0x02df }
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x02df }
            if (r0 != 0) goto L_0x02d1
            java.util.ArrayList r1 = X.C17880vN.A10(r2)     // Catch:{ all -> 0x02df }
            r2.clear()     // Catch:{ all -> 0x02df }
            int r0 = r1.size()     // Catch:{ all -> 0x02df }
            if (r0 <= 0) goto L_0x02d1
            r0 = 0
            r1.get(r0)     // Catch:{ all -> 0x02df }
            r0 = 0
            throw r0     // Catch:{ all -> 0x02df }
        L_0x02d1:
            boolean r0 = r4.A02()     // Catch:{ all -> 0x02df }
            if (r0 == 0) goto L_0x02dd
            r0 = 1
            r4.A00 = r0     // Catch:{ all -> 0x02df }
            X.C26014CqV.A00(r4)     // Catch:{ all -> 0x02df }
        L_0x02dd:
            monitor-exit(r3)     // Catch:{ all -> 0x02df }
            return
        L_0x02df:
            r1 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x02df }
            throw r1
        L_0x02e2:
            java.lang.Object r3 = r3.A01
            X.CWe r3 = (X.C25071CWe) r3
            r0 = 0
            r3.A01 = r0
            com.google.android.material.bottomsheet.BottomSheetBehavior r2 = r3.A03
            X.Cwc r0 = r2.A0N
            if (r0 == 0) goto L_0x02fb
            boolean r0 = r0.A0F()
            if (r0 == 0) goto L_0x02fb
            int r0 = r3.A00
            r3.A00(r0)
            return
        L_0x02fb:
            int r1 = r2.A0J
            r0 = 2
            if (r1 != r0) goto L_0x0bb2
            int r0 = r3.A00
            r2.A0X(r0)
            return
        L_0x0306:
            java.lang.Object r2 = r3.A01
            android.view.View r2 = (android.view.View) r2
            java.lang.Object r1 = X.BE9.A0j(r2)
            android.view.inputmethod.InputMethodManager r1 = (android.view.inputmethod.InputMethodManager) r1
            r0 = 1
            r1.showSoftInput(r2, r0)
            return
        L_0x0315:
            java.lang.Object r1 = r3.A01
            com.google.android.material.progressindicator.CircularProgressIndicator r1 = (com.google.android.material.progressindicator.CircularProgressIndicator) r1
            int r0 = r1.A07
            if (r0 <= 0) goto L_0x0320
            android.os.SystemClock.uptimeMillis()
        L_0x0320:
            r0 = 0
            r1.setVisibility(r0)
            return
        L_0x0325:
            java.lang.Object r0 = r3.A01
            com.google.android.material.progressindicator.CircularProgressIndicator r0 = (com.google.android.material.progressindicator.CircularProgressIndicator) r0
            com.google.android.material.progressindicator.CircularProgressIndicator.A00(r0)
            return
        L_0x032d:
            java.lang.Object r3 = r3.A01
            X.CWf r3 = (X.C25072CWf) r3
            r0 = 0
            r3.A01 = r0
            com.google.android.material.sidesheet.SideSheetBehavior r2 = r3.A03
            X.Cwc r0 = r2.A08
            if (r0 == 0) goto L_0x0346
            boolean r0 = r0.A0F()
            if (r0 == 0) goto L_0x0346
            int r0 = r3.A00
            r3.A00(r0)
            return
        L_0x0346:
            int r1 = r2.A05
            r0 = 2
            if (r1 != r0) goto L_0x0bb2
            int r0 = r3.A00
            r2.A0Q(r0)
            return
        L_0x0351:
            java.lang.Object r5 = r3.A01
            X.CtN r5 = (X.C26155CtN) r5
            X.BIE r4 = r5.A0J
            if (r4 == 0) goto L_0x0bb2
            android.content.Context r1 = r5.A0G
            if (r1 == 0) goto L_0x0bb2
            java.lang.String r0 = "window"
            java.lang.Object r0 = r1.getSystemService(r0)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.util.DisplayMetrics r1 = new android.util.DisplayMetrics
            r1.<init>()
            android.view.Display r0 = r0.getDefaultDisplay()
            r0.getRealMetrics(r1)
            int r3 = r1.heightPixels
            int[] r1 = X.C108945cZ.A1W()
            r4.getLocationOnScreen(r1)
            r0 = 1
            r0 = r1[r0]
            int r0 = X.AnonymousClass3MW.A02(r4, r0)
            int r3 = r3 - r0
            float r0 = r4.getTranslationY()
            int r0 = (int) r0
            int r3 = r3 + r0
            int r0 = r5.A02
            if (r3 >= r0) goto L_0x0bb2
            android.view.ViewGroup$LayoutParams r2 = r4.getLayoutParams()
            boolean r0 = r2 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 != 0) goto L_0x039c
            java.lang.String r1 = "BaseTransientBottomBar"
            java.lang.String r0 = "Unable to apply gesture inset because layout params are not MarginLayoutParams"
        L_0x0398:
            android.util.Log.w(r1, r0)
            return
        L_0x039c:
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            int r1 = r2.bottomMargin
            int r0 = r5.A02
            int r0 = r0 - r3
            int r1 = r1 + r0
            r2.bottomMargin = r1
            r4.requestLayout()
            return
        L_0x03aa:
            java.lang.Object r1 = r3.A01
            X.CtN r1 = (X.C26155CtN) r1
            r0 = 3
            r1.A0A(r0)
            return
        L_0x03b3:
            java.lang.Object r3 = r3.A01
            X.CtN r3 = (X.C26155CtN) r3
            X.BIE r4 = r3.A0J
            if (r4 == 0) goto L_0x0bb2
            android.view.ViewParent r0 = r4.getParent()
            if (r0 == 0) goto L_0x03c5
            r0 = 0
            r4.setVisibility(r0)
        L_0x03c5:
            int r0 = r4.A00
            r5 = 1
            if (r0 != r5) goto L_0x040d
            r5 = 2
            float[] r0 = new float[r5]
            r0 = {0, 1065353216} // fill-array
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofFloat(r0)
            android.animation.TimeInterpolator r0 = r3.A0D
            r2.setInterpolator(r0)
            r0 = 10
            X.C26323Cxg.A00(r2, r3, r0)
            float[] r0 = new float[r5]
            r0 = {1061997773, 1065353216} // fill-array
            android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofFloat(r0)
            android.animation.TimeInterpolator r0 = r3.A0E
            r1.setInterpolator(r0)
            r0 = 11
            X.C26323Cxg.A00(r1, r3, r0)
            android.animation.AnimatorSet r4 = new android.animation.AnimatorSet
            r4.<init>()
            android.animation.Animator[] r0 = new android.animation.Animator[r5]
            X.AnonymousClass3MY.A1V(r2, r1, r0)
            r4.playTogether(r0)
            int r0 = r3.A0A
            long r0 = (long) r0
            r4.setDuration(r0)
            r0 = 15
            X.BEQ.A00(r4, r3, r0)
        L_0x0409:
            r4.start()
            return
        L_0x040d:
            int r2 = r4.getHeight()
            android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x041e
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r0 = r1.bottomMargin
            int r2 = r2 + r0
        L_0x041e:
            float r0 = (float) r2
            r4.setTranslationY(r0)
            android.animation.ValueAnimator r4 = new android.animation.ValueAnimator
            r4.<init>()
            int[] r1 = X.C108945cZ.A1W()
            r0 = 0
            r1[r0] = r2
            r1[r5] = r0
            r4.setIntValues(r1)
            android.animation.TimeInterpolator r0 = r3.A0F
            r4.setInterpolator(r0)
            int r0 = r3.A0C
            long r0 = (long) r0
            r4.setDuration(r0)
            r0 = 14
            X.BEQ.A00(r4, r3, r0)
            r0 = 12
            X.C26323Cxg.A00(r4, r3, r0)
            goto L_0x0409
        L_0x0449:
            java.lang.Object r1 = r3.A01
            X.Bin r1 = (X.Bin) r1
            r0 = 1
            X.Bin.A00(r1, r0)
            return
        L_0x0452:
            java.lang.Object r1 = r3.A01
            X.Bio r1 = (X.Bio) r1
            android.widget.AutoCompleteTextView r0 = r1.A04
            boolean r0 = r0.isPopupShowing()
            X.Bio.A01(r1, r0)
            r1.A05 = r0
            return
        L_0x0462:
            java.lang.Object r0 = r3.A01
            com.google.android.material.textfield.TextInputLayout r0 = (com.google.android.material.textfield.TextInputLayout) r0
            X.BIm r0 = r0.A15
            com.google.android.material.internal.CheckableImageButton r0 = r0.A0G
            r0.performClick()
            r0.jumpDrawablesToCurrentState()
            return
        L_0x0471:
            java.lang.Object r0 = r3.A01
            com.google.android.material.textfield.TextInputLayout r0 = (com.google.android.material.textfield.TextInputLayout) r0
            android.widget.EditText r0 = r0.A0B
            r0.requestLayout()
            return
        L_0x047b:
            java.lang.Object r0 = r3.A01
            com.google.android.material.timepicker.ClockFaceView r0 = (com.google.android.material.timepicker.ClockFaceView) r0
            r0.A07()
            return
        L_0x0483:
            java.lang.Object r8 = r3.A01
            X.0wV r8 = (X.C18480wV) r8
            java.lang.Object r20 = X.C18480wV.A0B
            monitor-enter(r20)
            X.0vy r0 = r8.A02     // Catch:{ all -> 0x09c4 }
            r31 = r0
            X.C18220vy.A02(r31)     // Catch:{ all -> 0x09c4 }
            android.content.Context r0 = r0.A00     // Catch:{ all -> 0x09c4 }
            r30 = r0
            X.2qW r1 = X.C61932qW.A00(r30)     // Catch:{ all -> 0x09c4 }
            X.0xE r0 = r8.A05     // Catch:{ all -> 0x09bd }
            r29 = r0
            X.Bm0 r7 = r29.A01()     // Catch:{ all -> 0x09bd }
            if (r1 == 0) goto L_0x04a6
            r1.A01()     // Catch:{ all -> 0x09c4 }
        L_0x04a6:
            monitor-exit(r20)     // Catch:{ all -> 0x09c4 }
            java.lang.Integer r1 = r7.A02     // Catch:{ Blz -> 0x09b8 }
            java.lang.Integer r19 = X.AnonymousClass00R.A0Y     // Catch:{ Blz -> 0x09b8 }
            r0 = r19
            if (r1 == r0) goto L_0x06ac
            java.lang.Integer r5 = X.AnonymousClass00R.A0C     // Catch:{ Blz -> 0x09b8 }
            if (r1 == r5) goto L_0x06ac
            X.0xD r0 = r8.A04     // Catch:{ Blz -> 0x09b8 }
            boolean r0 = r0.A00(r7)     // Catch:{ Blz -> 0x09b8 }
            if (r0 == 0) goto L_0x0bb2
            X.0xA r4 = r8.A06     // Catch:{ Blz -> 0x09b8 }
            X.C18220vy.A02(r31)     // Catch:{ Blz -> 0x09b8 }
            r0 = r31
            X.0vz r0 = r0.A01     // Catch:{ Blz -> 0x09b8 }
            java.lang.String r9 = r0.A00     // Catch:{ Blz -> 0x09b8 }
            java.lang.String r6 = r7.A04     // Catch:{ Blz -> 0x09b8 }
            X.C18220vy.A02(r31)     // Catch:{ Blz -> 0x09b8 }
            java.lang.String r3 = r0.A03     // Catch:{ Blz -> 0x09b8 }
            java.lang.String r0 = r7.A06     // Catch:{ Blz -> 0x09b8 }
            r21 = r0
            X.0xB r10 = r4.A01     // Catch:{ Blz -> 0x09b8 }
            monitor-enter(r10)     // Catch:{ Blz -> 0x09b8 }
            int r0 = r10.A00     // Catch:{ all -> 0x06a8 }
            if (r0 == 0) goto L_0x04e3
            long r11 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x06a8 }
            long r0 = r10.A01     // Catch:{ all -> 0x06a8 }
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            r0 = 0
            if (r2 <= 0) goto L_0x04e4
        L_0x04e3:
            r0 = 1
        L_0x04e4:
            monitor-exit(r10)     // Catch:{ Blz -> 0x09b8 }
            java.lang.String r2 = "Firebase Installations Service is unavailable. Please try again later."
            if (r0 == 0) goto L_0x069f
            java.lang.Object[] r1 = X.AnonymousClass3MW.A1b()     // Catch:{ Blz -> 0x09b8 }
            r12 = 0
            boolean r11 = X.BE7.A1X(r3, r6, r1)     // Catch:{ Blz -> 0x09b8 }
            java.lang.String r0 = "projects/%s/installations/%s/authTokens:generate"
            java.lang.String r0 = java.lang.String.format(r0, r1)     // Catch:{ Blz -> 0x09b8 }
            java.net.URL r18 = X.C18790xA.A01(r0)     // Catch:{ Blz -> 0x09b8 }
        L_0x04fc:
            r0 = 32771(0x8003, float:4.5922E-41)
            android.net.TrafficStats.setThreadStatsTag(r0)     // Catch:{ Blz -> 0x09b8 }
            r0 = r18
            java.net.HttpURLConnection r13 = X.C18790xA.A00(r4, r9, r0)     // Catch:{ Blz -> 0x09b8 }
            java.lang.String r0 = "POST"
            r13.setRequestMethod(r0)     // Catch:{ IOException | AssertionError -> 0x062d, all -> 0x0699 }
            java.lang.String r14 = "Authorization"
            java.lang.StringBuilder r15 = X.AnonymousClass000.A10()     // Catch:{ IOException | AssertionError -> 0x062d, all -> 0x0699 }
            java.lang.String r1 = "FIS_v2 "
            r0 = r21
            java.lang.String r0 = X.AnonymousClass001.A1H(r1, r0, r15)     // Catch:{ IOException | AssertionError -> 0x062d, all -> 0x0699 }
            r13.addRequestProperty(r14, r0)     // Catch:{ IOException | AssertionError -> 0x062d, all -> 0x0699 }
            r13.setDoOutput(r11)     // Catch:{ IOException | AssertionError -> 0x062d, all -> 0x0699 }
            org.json.JSONObject r14 = X.C17880vN.A15()     // Catch:{ JSONException -> 0x0626, IOException | AssertionError -> 0x062d }
            java.lang.String r1 = "sdkVersion"
            java.lang.String r0 = "a:17.2.0"
            r14.put(r1, r0)     // Catch:{ JSONException -> 0x0626, IOException | AssertionError -> 0x062d }
            org.json.JSONObject r1 = X.C17880vN.A15()     // Catch:{ JSONException -> 0x0626, IOException | AssertionError -> 0x062d }
            java.lang.String r0 = "installation"
            r1.put(r0, r14)     // Catch:{ JSONException -> 0x0626, IOException | AssertionError -> 0x062d }
            java.lang.String r1 = r1.toString()     // Catch:{ IOException | AssertionError -> 0x062d, all -> 0x0699 }
            java.lang.String r0 = "UTF-8"
            byte[] r0 = r1.getBytes(r0)     // Catch:{ IOException | AssertionError -> 0x062d, all -> 0x0699 }
            X.C18790xA.A03(r13, r0)     // Catch:{ IOException | AssertionError -> 0x062d, all -> 0x0699 }
            int r1 = r13.getResponseCode()     // Catch:{ IOException | AssertionError -> 0x062d, all -> 0x0699 }
            r10.A00(r1)     // Catch:{ IOException | AssertionError -> 0x062d, all -> 0x0699 }
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 < r0) goto L_0x05d6
            r0 = 300(0x12c, float:4.2E-43)
            if (r1 >= r0) goto L_0x05d6
            java.io.InputStream r17 = r13.getInputStream()     // Catch:{ IOException | AssertionError -> 0x062d, all -> 0x0699 }
            java.nio.charset.Charset r14 = X.C18790xA.A03     // Catch:{ IOException | AssertionError -> 0x062d, all -> 0x0699 }
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch:{ IOException | AssertionError -> 0x062d, all -> 0x0699 }
            r0 = r17
            r1.<init>(r0, r14)     // Catch:{ IOException | AssertionError -> 0x062d, all -> 0x0699 }
            android.util.JsonReader r16 = new android.util.JsonReader     // Catch:{ IOException | AssertionError -> 0x062d, all -> 0x0699 }
            r0 = r16
            r0.<init>(r1)     // Catch:{ IOException | AssertionError -> 0x062d, all -> 0x0699 }
            X.CWG r1 = new X.CWG     // Catch:{ IOException | AssertionError -> 0x062d, all -> 0x0699 }
            r1.<init>()     // Catch:{ IOException | AssertionError -> 0x062d, all -> 0x0699 }
            java.lang.Long r0 = X.C17890vO.A0L()     // Catch:{ IOException | AssertionError -> 0x062d, all -> 0x0699 }
            r1.A01 = r0     // Catch:{ IOException | AssertionError -> 0x062d, all -> 0x0699 }
            r16.beginObject()     // Catch:{ IOException | AssertionError -> 0x062d, all -> 0x0699 }
        L_0x0573:
            boolean r0 = r16.hasNext()     // Catch:{ IOException | AssertionError -> 0x062d, all -> 0x0699 }
            if (r0 == 0) goto L_0x05c4
            java.lang.String r14 = r16.nextName()     // Catch:{ IOException | AssertionError -> 0x062d, all -> 0x0699 }
            java.lang.String r0 = "token"
            boolean r0 = r14.equals(r0)     // Catch:{ IOException | AssertionError -> 0x062d, all -> 0x0699 }
            if (r0 == 0) goto L_0x058c
            java.lang.String r0 = r16.nextString()     // Catch:{ IOException | AssertionError -> 0x062d, all -> 0x0699 }
            r1.A02 = r0     // Catch:{ IOException | AssertionError -> 0x062d, all -> 0x0699 }
            goto L_0x0573
        L_0x058c:
            java.lang.String r0 = "expiresIn"
            boolean r0 = r14.equals(r0)     // Catch:{ IOException | AssertionError -> 0x062d, all -> 0x0699 }
            if (r0 == 0) goto L_0x05c0
            java.lang.String r14 = r16.nextString()     // Catch:{ IOException | AssertionError -> 0x062d, all -> 0x0699 }
            java.util.regex.Pattern r0 = X.C18790xA.A04     // Catch:{ IOException | AssertionError -> 0x062d, all -> 0x0699 }
            boolean r15 = X.AnonymousClass8BU.A1V(r14, r0)     // Catch:{ IOException | AssertionError -> 0x062d, all -> 0x0699 }
            java.lang.String r0 = "Invalid Expiration Timestamp."
            X.C18210vx.A07(r15, r0)     // Catch:{ IOException | AssertionError -> 0x062d, all -> 0x0699 }
            if (r14 == 0) goto L_0x05a6
            goto L_0x05a9
        L_0x05a6:
            r14 = 0
            goto L_0x05b9
        L_0x05a9:
            int r0 = r14.length()     // Catch:{ IOException | AssertionError -> 0x062d, all -> 0x0699 }
            if (r0 == 0) goto L_0x05a6
            int r0 = r0 + -1
            java.lang.String r0 = X.AnonymousClass8BS.A0o(r14, r0)     // Catch:{ IOException | AssertionError -> 0x062d, all -> 0x0699 }
            long r14 = java.lang.Long.parseLong(r0)     // Catch:{ IOException | AssertionError -> 0x062d, all -> 0x0699 }
        L_0x05b9:
            java.lang.Long r0 = java.lang.Long.valueOf(r14)     // Catch:{ IOException | AssertionError -> 0x062d, all -> 0x0699 }
            r1.A01 = r0     // Catch:{ IOException | AssertionError -> 0x062d, all -> 0x0699 }
            goto L_0x0573
        L_0x05c0:
            r16.skipValue()     // Catch:{ IOException | AssertionError -> 0x062d, all -> 0x0699 }
            goto L_0x0573
        L_0x05c4:
            r16.endObject()     // Catch:{ IOException | AssertionError -> 0x062d, all -> 0x0699 }
            r16.close()     // Catch:{ IOException | AssertionError -> 0x062d, all -> 0x0699 }
            r17.close()     // Catch:{ IOException | AssertionError -> 0x062d, all -> 0x0699 }
            java.lang.Integer r0 = X.AnonymousClass00R.A00     // Catch:{ IOException | AssertionError -> 0x062d, all -> 0x0699 }
            r1.A00 = r0     // Catch:{ IOException | AssertionError -> 0x062d, all -> 0x0699 }
            X.Bm2 r3 = r1.A00()     // Catch:{ IOException | AssertionError -> 0x062d, all -> 0x0699 }
            goto L_0x0638
        L_0x05d6:
            r0 = 0
            X.C18790xA.A02(r0, r9, r3, r13)     // Catch:{ IOException | AssertionError -> 0x062d, all -> 0x0699 }
            r0 = 401(0x191, float:5.62E-43)
            if (r1 == r0) goto L_0x0614
            r0 = 404(0x194, float:5.66E-43)
            if (r1 == r0) goto L_0x0614
            r0 = 429(0x1ad, float:6.01E-43)
            if (r1 == r0) goto L_0x060a
            r0 = 500(0x1f4, float:7.0E-43)
            if (r1 < r0) goto L_0x05ef
            r0 = 600(0x258, float:8.41E-43)
            if (r1 >= r0) goto L_0x05ef
            goto L_0x062d
        L_0x05ef:
            java.lang.String r1 = "Firebase-Installations"
            java.lang.String r0 = "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase."
            android.util.Log.e(r1, r0)     // Catch:{ IOException | AssertionError -> 0x062d, all -> 0x0699 }
            X.CWG r1 = new X.CWG     // Catch:{ IOException | AssertionError -> 0x062d, all -> 0x0699 }
            r1.<init>()     // Catch:{ IOException | AssertionError -> 0x062d, all -> 0x0699 }
            java.lang.Long r0 = X.C17890vO.A0L()     // Catch:{ IOException | AssertionError -> 0x062d, all -> 0x0699 }
            r1.A01 = r0     // Catch:{ IOException | AssertionError -> 0x062d, all -> 0x0699 }
            java.lang.Integer r0 = X.AnonymousClass00R.A01     // Catch:{ IOException | AssertionError -> 0x062d, all -> 0x0699 }
            r1.A00 = r0     // Catch:{ IOException | AssertionError -> 0x062d, all -> 0x0699 }
            X.Bm2 r3 = r1.A00()     // Catch:{ IOException | AssertionError -> 0x062d, all -> 0x0699 }
            goto L_0x0638
        L_0x060a:
            java.lang.String r1 = "Firebase servers have received too many requests from this client in a short period of time. Please try again later."
            X.ByK r0 = X.C24261ByK.TOO_MANY_REQUESTS     // Catch:{ IOException | AssertionError -> 0x062d, all -> 0x0699 }
            X.Blz r14 = new X.Blz     // Catch:{ IOException | AssertionError -> 0x062d, all -> 0x0699 }
            r14.<init>(r0, r1)     // Catch:{ IOException | AssertionError -> 0x062d, all -> 0x0699 }
            goto L_0x062c
        L_0x0614:
            X.CWG r1 = new X.CWG     // Catch:{ IOException | AssertionError -> 0x062d, all -> 0x0699 }
            r1.<init>()     // Catch:{ IOException | AssertionError -> 0x062d, all -> 0x0699 }
            java.lang.Long r0 = X.C17890vO.A0L()     // Catch:{ IOException | AssertionError -> 0x062d, all -> 0x0699 }
            r1.A01 = r0     // Catch:{ IOException | AssertionError -> 0x062d, all -> 0x0699 }
            r1.A00 = r5     // Catch:{ IOException | AssertionError -> 0x062d, all -> 0x0699 }
            X.Bm2 r3 = r1.A00()     // Catch:{ IOException | AssertionError -> 0x062d, all -> 0x0699 }
            goto L_0x0638
        L_0x0626:
            r0 = move-exception
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException     // Catch:{ IOException | AssertionError -> 0x062d, all -> 0x0699 }
            r14.<init>(r0)     // Catch:{ IOException | AssertionError -> 0x062d, all -> 0x0699 }
        L_0x062c:
            throw r14     // Catch:{ IOException | AssertionError -> 0x062d, all -> 0x0699 }
        L_0x062d:
            r13.disconnect()     // Catch:{ Blz -> 0x09b8 }
            android.net.TrafficStats.clearThreadStatsTag()     // Catch:{ Blz -> 0x09b8 }
            int r12 = r12 + 1
            if (r12 <= r11) goto L_0x04fc
            goto L_0x0690
        L_0x0638:
            r13.disconnect()     // Catch:{ Blz -> 0x09b8 }
            android.net.TrafficStats.clearThreadStatsTag()     // Catch:{ Blz -> 0x09b8 }
            java.lang.Integer r0 = r3.A01     // Catch:{ Blz -> 0x09b8 }
            int r1 = r0.intValue()     // Catch:{ Blz -> 0x09b8 }
            r0 = 0
            if (r1 == r0) goto L_0x066a
            if (r1 == r11) goto L_0x0655
            r0 = 2
            if (r1 != r0) goto L_0x09b0
            r0 = 0
            monitor-enter(r8)     // Catch:{ Blz -> 0x09b8 }
            r8.A00 = r0     // Catch:{ all -> 0x0651 }
            goto L_0x0660
        L_0x0651:
            r3 = move-exception
            monitor-exit(r8)     // Catch:{ Blz -> 0x09b8 }
            goto L_0x09b7
        L_0x0655:
            java.lang.String r0 = "BAD CONFIG"
            X.CXF r7 = r7.A01()     // Catch:{ Blz -> 0x09b8 }
            r7.A05 = r0     // Catch:{ Blz -> 0x09b8 }
            r0 = r19
            goto L_0x0667
        L_0x0660:
            monitor-exit(r8)     // Catch:{ Blz -> 0x09b8 }
            X.CXF r7 = r7.A01()     // Catch:{ Blz -> 0x09b8 }
            java.lang.Integer r0 = X.AnonymousClass00R.A01     // Catch:{ Blz -> 0x09b8 }
        L_0x0667:
            r7.A00 = r0     // Catch:{ Blz -> 0x09b8 }
            goto L_0x068a
        L_0x066a:
            java.lang.String r5 = r3.A02     // Catch:{ Blz -> 0x09b8 }
            long r3 = r3.A00     // Catch:{ Blz -> 0x09b8 }
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ Blz -> 0x09b8 }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ Blz -> 0x09b8 }
            long r1 = r2.toSeconds(r0)     // Catch:{ Blz -> 0x09b8 }
            X.CXF r7 = r7.A01()     // Catch:{ Blz -> 0x09b8 }
            r7.A03 = r5     // Catch:{ Blz -> 0x09b8 }
            java.lang.Long r0 = java.lang.Long.valueOf(r3)     // Catch:{ Blz -> 0x09b8 }
            r7.A01 = r0     // Catch:{ Blz -> 0x09b8 }
            java.lang.Long r0 = java.lang.Long.valueOf(r1)     // Catch:{ Blz -> 0x09b8 }
            r7.A02 = r0     // Catch:{ Blz -> 0x09b8 }
        L_0x068a:
            X.Bm0 r2 = r7.A00()     // Catch:{ Blz -> 0x09b8 }
            goto L_0x091f
        L_0x0690:
            X.ByK r0 = X.C24261ByK.UNAVAILABLE     // Catch:{ Blz -> 0x09b8 }
            X.Blz r3 = new X.Blz     // Catch:{ Blz -> 0x09b8 }
            r3.<init>(r0, r2)     // Catch:{ Blz -> 0x09b8 }
            goto L_0x09b7
        L_0x0699:
            r3 = move-exception
            r13.disconnect()     // Catch:{ Blz -> 0x09b8 }
            goto L_0x09a1
        L_0x069f:
            X.ByK r0 = X.C24261ByK.UNAVAILABLE     // Catch:{ Blz -> 0x09b8 }
            X.Blz r3 = new X.Blz     // Catch:{ Blz -> 0x09b8 }
            r3.<init>(r0, r2)     // Catch:{ Blz -> 0x09b8 }
            goto L_0x09b7
        L_0x06a8:
            r3 = move-exception
            monitor-exit(r10)     // Catch:{ Blz -> 0x09b8 }
            goto L_0x09b7
        L_0x06ac:
            java.lang.String r6 = r7.A04     // Catch:{ Blz -> 0x09b8 }
            if (r6 == 0) goto L_0x070a
            int r1 = r6.length()     // Catch:{ Blz -> 0x09b8 }
            r0 = 11
            if (r1 != r0) goto L_0x070a
            X.0wC r0 = r8.A03     // Catch:{ Blz -> 0x09b8 }
            java.lang.Object r12 = r0.get()     // Catch:{ Blz -> 0x09b8 }
            X.2pg r12 = (X.C61432pg) r12     // Catch:{ Blz -> 0x09b8 }
            android.content.SharedPreferences r4 = r12.A00     // Catch:{ Blz -> 0x09b8 }
            monitor-enter(r4)     // Catch:{ Blz -> 0x09b8 }
            java.lang.String[] r11 = X.C61432pg.A02     // Catch:{ all -> 0x0706 }
            r10 = 4
            r9 = 0
        L_0x06c7:
            r5 = 0
            if (r9 >= r10) goto L_0x0704
            r3 = r11[r9]     // Catch:{ all -> 0x0706 }
            java.lang.String r2 = r12.A01     // Catch:{ all -> 0x0706 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0706 }
            java.lang.String r0 = "|T|"
            r1.append(r0)     // Catch:{ all -> 0x0706 }
            r1.append(r2)     // Catch:{ all -> 0x0706 }
            java.lang.String r0 = "|"
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r3, r1)     // Catch:{ all -> 0x0706 }
            java.lang.String r5 = r4.getString(r0, r5)     // Catch:{ all -> 0x0706 }
            if (r5 == 0) goto L_0x06f5
            boolean r0 = r5.isEmpty()     // Catch:{ all -> 0x0706 }
            if (r0 != 0) goto L_0x06f5
            java.lang.String r0 = "{"
            boolean r0 = r5.startsWith(r0)     // Catch:{ all -> 0x0706 }
            if (r0 == 0) goto L_0x0704
            goto L_0x06f8
        L_0x06f5:
            int r9 = r9 + 1
            goto L_0x06c7
        L_0x06f8:
            org.json.JSONObject r1 = X.C17880vN.A16(r5)     // Catch:{ JSONException -> 0x0703 }
            java.lang.String r0 = "token"
            java.lang.String r5 = r1.getString(r0)     // Catch:{ JSONException -> 0x0703 }
            goto L_0x0704
        L_0x0703:
            r5 = 0
        L_0x0704:
            monitor-exit(r4)     // Catch:{ all -> 0x0706 }
            goto L_0x070b
        L_0x0706:
            r3 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0706 }
            goto L_0x09b7
        L_0x070a:
            r5 = 0
        L_0x070b:
            X.0xA r0 = r8.A06     // Catch:{ Blz -> 0x09b8 }
            r28 = r0
            X.C18220vy.A02(r31)     // Catch:{ Blz -> 0x09b8 }
            r0 = r31
            X.0vz r1 = r0.A01     // Catch:{ Blz -> 0x09b8 }
            java.lang.String r0 = r1.A00     // Catch:{ Blz -> 0x09b8 }
            r27 = r0
            X.C18220vy.A02(r31)     // Catch:{ Blz -> 0x09b8 }
            java.lang.String r15 = r1.A03     // Catch:{ Blz -> 0x09b8 }
            X.C18220vy.A02(r31)     // Catch:{ Blz -> 0x09b8 }
            java.lang.String r14 = r1.A01     // Catch:{ Blz -> 0x09b8 }
            r0 = r28
            X.0xB r4 = r0.A01     // Catch:{ Blz -> 0x09b8 }
            monitor-enter(r4)     // Catch:{ Blz -> 0x09b8 }
            int r0 = r4.A00     // Catch:{ all -> 0x09ad }
            if (r0 == 0) goto L_0x0738
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x09ad }
            long r0 = r4.A01     // Catch:{ all -> 0x09ad }
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            r0 = 0
            if (r2 <= 0) goto L_0x0739
        L_0x0738:
            r0 = 1
        L_0x0739:
            monitor-exit(r4)     // Catch:{ Blz -> 0x09b8 }
            java.lang.String r9 = "Firebase Installations Service is unavailable. Please try again later."
            if (r0 == 0) goto L_0x09a5
            r3 = 1
            java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch:{ Blz -> 0x09b8 }
            r2 = 0
            r1[r2] = r15     // Catch:{ Blz -> 0x09b8 }
            java.lang.String r0 = "projects/%s/installations"
            java.lang.String r0 = java.lang.String.format(r0, r1)     // Catch:{ Blz -> 0x09b8 }
            java.net.URL r18 = X.C18790xA.A01(r0)     // Catch:{ Blz -> 0x09b8 }
        L_0x074e:
            r0 = 32769(0x8001, float:4.5919E-41)
            android.net.TrafficStats.setThreadStatsTag(r0)     // Catch:{ Blz -> 0x09b8 }
            r10 = r28
            r1 = r27
            r0 = r18
            java.net.HttpURLConnection r1 = X.C18790xA.A00(r10, r1, r0)     // Catch:{ Blz -> 0x09b8 }
            java.lang.String r0 = "POST"
            r1.setRequestMethod(r0)     // Catch:{ IOException | AssertionError -> 0x08b7, all -> 0x099d }
            r1.setDoOutput(r3)     // Catch:{ IOException | AssertionError -> 0x08b7, all -> 0x099d }
            if (r5 == 0) goto L_0x076d
            java.lang.String r0 = "x-goog-fis-android-iid-migration-auth"
            r1.addRequestProperty(r0, r5)     // Catch:{ IOException | AssertionError -> 0x08b7, all -> 0x099d }
        L_0x076d:
            org.json.JSONObject r12 = X.C17880vN.A15()     // Catch:{ JSONException -> 0x08b0, IOException | AssertionError -> 0x08b7 }
            java.lang.String r11 = "fid"
            r12.put(r11, r6)     // Catch:{ JSONException -> 0x08b0, IOException | AssertionError -> 0x08b7 }
            java.lang.String r0 = "appId"
            r12.put(r0, r14)     // Catch:{ JSONException -> 0x08b0, IOException | AssertionError -> 0x08b7 }
            java.lang.String r10 = "authVersion"
            java.lang.String r0 = "FIS_v2"
            r12.put(r10, r0)     // Catch:{ JSONException -> 0x08b0, IOException | AssertionError -> 0x08b7 }
            java.lang.String r10 = "sdkVersion"
            java.lang.String r0 = "a:17.2.0"
            r12.put(r10, r0)     // Catch:{ JSONException -> 0x08b0, IOException | AssertionError -> 0x08b7 }
            java.lang.String r10 = r12.toString()     // Catch:{ IOException | AssertionError -> 0x08b7, all -> 0x099d }
            java.lang.String r0 = "UTF-8"
            byte[] r0 = r10.getBytes(r0)     // Catch:{ IOException | AssertionError -> 0x08b7, all -> 0x099d }
            X.C18790xA.A03(r1, r0)     // Catch:{ IOException | AssertionError -> 0x08b7, all -> 0x099d }
            int r10 = r1.getResponseCode()     // Catch:{ IOException | AssertionError -> 0x08b7, all -> 0x099d }
            r4.A00(r10)     // Catch:{ IOException | AssertionError -> 0x08b7, all -> 0x099d }
            r0 = 200(0xc8, float:2.8E-43)
            if (r10 < r0) goto L_0x087b
            r0 = 300(0x12c, float:4.2E-43)
            if (r10 >= r0) goto L_0x087b
            java.io.InputStream r17 = r1.getInputStream()     // Catch:{ IOException | AssertionError -> 0x08b7, all -> 0x099d }
            java.nio.charset.Charset r12 = X.C18790xA.A03     // Catch:{ IOException | AssertionError -> 0x08b7, all -> 0x099d }
            java.io.InputStreamReader r10 = new java.io.InputStreamReader     // Catch:{ IOException | AssertionError -> 0x08b7, all -> 0x099d }
            r0 = r17
            r10.<init>(r0, r12)     // Catch:{ IOException | AssertionError -> 0x08b7, all -> 0x099d }
            android.util.JsonReader r16 = new android.util.JsonReader     // Catch:{ IOException | AssertionError -> 0x08b7, all -> 0x099d }
            r0 = r16
            r0.<init>(r10)     // Catch:{ IOException | AssertionError -> 0x08b7, all -> 0x099d }
            X.CWG r10 = new X.CWG     // Catch:{ IOException | AssertionError -> 0x08b7, all -> 0x099d }
            r10.<init>()     // Catch:{ IOException | AssertionError -> 0x08b7, all -> 0x099d }
            java.lang.Long r0 = X.C17890vO.A0L()     // Catch:{ IOException | AssertionError -> 0x08b7, all -> 0x099d }
            r10.A01 = r0     // Catch:{ IOException | AssertionError -> 0x08b7, all -> 0x099d }
            r22 = 0
            r25 = 0
            r26 = 0
            r24 = 0
            r16.beginObject()     // Catch:{ IOException | AssertionError -> 0x08b7, all -> 0x099d }
        L_0x07cf:
            boolean r0 = r16.hasNext()     // Catch:{ IOException | AssertionError -> 0x08b7, all -> 0x099d }
            if (r0 == 0) goto L_0x0868
            java.lang.String r0 = r16.nextName()     // Catch:{ IOException | AssertionError -> 0x08b7, all -> 0x099d }
            java.lang.String r12 = "name"
            boolean r12 = r0.equals(r12)     // Catch:{ IOException | AssertionError -> 0x08b7, all -> 0x099d }
            if (r12 == 0) goto L_0x07e6
            java.lang.String r24 = r16.nextString()     // Catch:{ IOException | AssertionError -> 0x08b7, all -> 0x099d }
            goto L_0x07cf
        L_0x07e6:
            boolean r12 = r0.equals(r11)     // Catch:{ IOException | AssertionError -> 0x08b7, all -> 0x099d }
            if (r12 == 0) goto L_0x07f1
            java.lang.String r25 = r16.nextString()     // Catch:{ IOException | AssertionError -> 0x08b7, all -> 0x099d }
            goto L_0x07cf
        L_0x07f1:
            java.lang.String r12 = "refreshToken"
            boolean r12 = r0.equals(r12)     // Catch:{ IOException | AssertionError -> 0x08b7, all -> 0x099d }
            if (r12 == 0) goto L_0x07fe
            java.lang.String r26 = r16.nextString()     // Catch:{ IOException | AssertionError -> 0x08b7, all -> 0x099d }
            goto L_0x07cf
        L_0x07fe:
            java.lang.String r12 = "authToken"
            boolean r0 = r0.equals(r12)     // Catch:{ IOException | AssertionError -> 0x08b7, all -> 0x099d }
            if (r0 == 0) goto L_0x0863
            r16.beginObject()     // Catch:{ IOException | AssertionError -> 0x08b7, all -> 0x099d }
        L_0x0809:
            boolean r0 = r16.hasNext()     // Catch:{ IOException | AssertionError -> 0x08b7, all -> 0x099d }
            if (r0 == 0) goto L_0x085a
            java.lang.String r12 = r16.nextName()     // Catch:{ IOException | AssertionError -> 0x08b7, all -> 0x099d }
            java.lang.String r0 = "token"
            boolean r0 = r12.equals(r0)     // Catch:{ IOException | AssertionError -> 0x08b7, all -> 0x099d }
            if (r0 == 0) goto L_0x0822
            java.lang.String r0 = r16.nextString()     // Catch:{ IOException | AssertionError -> 0x08b7, all -> 0x099d }
            r10.A02 = r0     // Catch:{ IOException | AssertionError -> 0x08b7, all -> 0x099d }
            goto L_0x0809
        L_0x0822:
            java.lang.String r0 = "expiresIn"
            boolean r0 = r12.equals(r0)     // Catch:{ IOException | AssertionError -> 0x08b7, all -> 0x099d }
            if (r0 == 0) goto L_0x0856
            java.lang.String r12 = r16.nextString()     // Catch:{ IOException | AssertionError -> 0x08b7, all -> 0x099d }
            java.util.regex.Pattern r0 = X.C18790xA.A04     // Catch:{ IOException | AssertionError -> 0x08b7, all -> 0x099d }
            boolean r13 = X.AnonymousClass8BU.A1V(r12, r0)     // Catch:{ IOException | AssertionError -> 0x08b7, all -> 0x099d }
            java.lang.String r0 = "Invalid Expiration Timestamp."
            X.C18210vx.A07(r13, r0)     // Catch:{ IOException | AssertionError -> 0x08b7, all -> 0x099d }
            if (r12 == 0) goto L_0x083c
            goto L_0x083f
        L_0x083c:
            r12 = 0
            goto L_0x084f
        L_0x083f:
            int r0 = r12.length()     // Catch:{ IOException | AssertionError -> 0x08b7, all -> 0x099d }
            if (r0 == 0) goto L_0x083c
            int r0 = r0 + -1
            java.lang.String r0 = X.AnonymousClass8BS.A0o(r12, r0)     // Catch:{ IOException | AssertionError -> 0x08b7, all -> 0x099d }
            long r12 = java.lang.Long.parseLong(r0)     // Catch:{ IOException | AssertionError -> 0x08b7, all -> 0x099d }
        L_0x084f:
            java.lang.Long r0 = java.lang.Long.valueOf(r12)     // Catch:{ IOException | AssertionError -> 0x08b7, all -> 0x099d }
            r10.A01 = r0     // Catch:{ IOException | AssertionError -> 0x08b7, all -> 0x099d }
            goto L_0x0809
        L_0x0856:
            r16.skipValue()     // Catch:{ IOException | AssertionError -> 0x08b7, all -> 0x099d }
            goto L_0x0809
        L_0x085a:
            X.Bm2 r22 = r10.A00()     // Catch:{ IOException | AssertionError -> 0x08b7, all -> 0x099d }
            r16.endObject()     // Catch:{ IOException | AssertionError -> 0x08b7, all -> 0x099d }
            goto L_0x07cf
        L_0x0863:
            r16.skipValue()     // Catch:{ IOException | AssertionError -> 0x08b7, all -> 0x099d }
            goto L_0x07cf
        L_0x0868:
            r16.endObject()     // Catch:{ IOException | AssertionError -> 0x08b7, all -> 0x099d }
            r16.close()     // Catch:{ IOException | AssertionError -> 0x08b7, all -> 0x099d }
            r17.close()     // Catch:{ IOException | AssertionError -> 0x08b7, all -> 0x099d }
            java.lang.Integer r23 = X.AnonymousClass00R.A00     // Catch:{ IOException | AssertionError -> 0x08b7, all -> 0x099d }
            X.Bm1 r0 = new X.Bm1     // Catch:{ IOException | AssertionError -> 0x08b7, all -> 0x099d }
            r21 = r0
            r21.<init>(r22, r23, r24, r25, r26)     // Catch:{ IOException | AssertionError -> 0x08b7, all -> 0x099d }
            goto L_0x08c3
        L_0x087b:
            r0 = r27
            X.C18790xA.A02(r14, r0, r15, r1)     // Catch:{ IOException | AssertionError -> 0x08b7, all -> 0x099d }
            r0 = 429(0x1ad, float:6.01E-43)
            if (r10 == r0) goto L_0x08a6
            r0 = 500(0x1f4, float:7.0E-43)
            if (r10 < r0) goto L_0x088d
            r0 = 600(0x258, float:8.41E-43)
            if (r10 >= r0) goto L_0x088d
            goto L_0x08b7
        L_0x088d:
            java.lang.String r10 = "Firebase-Installations"
            java.lang.String r0 = "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase."
            android.util.Log.e(r10, r0)     // Catch:{ IOException | AssertionError -> 0x08b7, all -> 0x099d }
            r22 = 0
            java.lang.Integer r23 = X.AnonymousClass00R.A01     // Catch:{ IOException | AssertionError -> 0x08b7, all -> 0x099d }
            X.Bm1 r0 = new X.Bm1     // Catch:{ IOException | AssertionError -> 0x08b7, all -> 0x099d }
            r25 = r22
            r26 = r22
            r21 = r0
            r24 = r22
            r21.<init>(r22, r23, r24, r25, r26)     // Catch:{ IOException | AssertionError -> 0x08b7, all -> 0x099d }
            goto L_0x08c3
        L_0x08a6:
            java.lang.String r10 = "Firebase servers have received too many requests from this client in a short period of time. Please try again later."
            X.ByK r0 = X.C24261ByK.TOO_MANY_REQUESTS     // Catch:{ IOException | AssertionError -> 0x08b7, all -> 0x099d }
            X.Blz r11 = new X.Blz     // Catch:{ IOException | AssertionError -> 0x08b7, all -> 0x099d }
            r11.<init>(r0, r10)     // Catch:{ IOException | AssertionError -> 0x08b7, all -> 0x099d }
            goto L_0x08b6
        L_0x08b0:
            r0 = move-exception
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException     // Catch:{ IOException | AssertionError -> 0x08b7, all -> 0x099d }
            r11.<init>(r0)     // Catch:{ IOException | AssertionError -> 0x08b7, all -> 0x099d }
        L_0x08b6:
            throw r11     // Catch:{ IOException | AssertionError -> 0x08b7, all -> 0x099d }
        L_0x08b7:
            r1.disconnect()     // Catch:{ Blz -> 0x09b8 }
            android.net.TrafficStats.clearThreadStatsTag()     // Catch:{ Blz -> 0x09b8 }
            int r2 = r2 + 1
            if (r2 <= r3) goto L_0x074e
            goto L_0x0995
        L_0x08c3:
            r1.disconnect()     // Catch:{ Blz -> 0x09b8 }
            android.net.TrafficStats.clearThreadStatsTag()     // Catch:{ Blz -> 0x09b8 }
            java.lang.Integer r1 = r0.A01     // Catch:{ Blz -> 0x09b8 }
            int r2 = r1.intValue()     // Catch:{ Blz -> 0x09b8 }
            r1 = 0
            if (r2 == r1) goto L_0x08de
            if (r2 != r3) goto L_0x08d5
            goto L_0x090f
        L_0x08d5:
            X.ByK r0 = X.C24261ByK.UNAVAILABLE     // Catch:{ Blz -> 0x09b8 }
            X.Blz r3 = new X.Blz     // Catch:{ Blz -> 0x09b8 }
            r3.<init>(r0, r9)     // Catch:{ Blz -> 0x09b8 }
            goto L_0x09b7
        L_0x08de:
            java.lang.String r10 = r0.A02     // Catch:{ Blz -> 0x09b8 }
            java.lang.String r9 = r0.A03     // Catch:{ Blz -> 0x09b8 }
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ Blz -> 0x09b8 }
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ Blz -> 0x09b8 }
            long r4 = r3.toSeconds(r1)     // Catch:{ Blz -> 0x09b8 }
            X.C4C r0 = r0.A00     // Catch:{ Blz -> 0x09b8 }
            X.Bm2 r0 = (X.C23574Bm2) r0     // Catch:{ Blz -> 0x09b8 }
            java.lang.String r3 = r0.A02     // Catch:{ Blz -> 0x09b8 }
            long r1 = r0.A00     // Catch:{ Blz -> 0x09b8 }
            X.CXF r7 = r7.A01()     // Catch:{ Blz -> 0x09b8 }
            r7.A04 = r10     // Catch:{ Blz -> 0x09b8 }
            java.lang.Integer r0 = X.AnonymousClass00R.A0N     // Catch:{ Blz -> 0x09b8 }
            r7.A00 = r0     // Catch:{ Blz -> 0x09b8 }
            r7.A03 = r3     // Catch:{ Blz -> 0x09b8 }
            r7.A06 = r9     // Catch:{ Blz -> 0x09b8 }
            java.lang.Long r0 = java.lang.Long.valueOf(r1)     // Catch:{ Blz -> 0x09b8 }
            r7.A01 = r0     // Catch:{ Blz -> 0x09b8 }
            java.lang.Long r0 = java.lang.Long.valueOf(r4)     // Catch:{ Blz -> 0x09b8 }
            r7.A02 = r0     // Catch:{ Blz -> 0x09b8 }
            goto L_0x091b
        L_0x090f:
            java.lang.String r0 = "BAD CONFIG"
            X.CXF r7 = r7.A01()     // Catch:{ Blz -> 0x09b8 }
            r7.A05 = r0     // Catch:{ Blz -> 0x09b8 }
            r0 = r19
            r7.A00 = r0     // Catch:{ Blz -> 0x09b8 }
        L_0x091b:
            X.Bm0 r2 = r7.A00()     // Catch:{ Blz -> 0x09b8 }
        L_0x091f:
            monitor-enter(r20)
            X.C18220vy.A02(r31)     // Catch:{ all -> 0x0992 }
            X.2qW r1 = X.C61932qW.A00(r30)     // Catch:{ all -> 0x0992 }
            r0 = r29
            r0.A02(r2)     // Catch:{ all -> 0x092d }
            goto L_0x0934
        L_0x092d:
            r0 = move-exception
            if (r1 == 0) goto L_0x0933
            r1.A01()     // Catch:{ all -> 0x0992 }
        L_0x0933:
            throw r0     // Catch:{ all -> 0x0992 }
        L_0x0934:
            if (r1 == 0) goto L_0x0939
            r1.A01()     // Catch:{ all -> 0x0992 }
        L_0x0939:
            monitor-exit(r20)     // Catch:{ all -> 0x0992 }
            monitor-enter(r8)
            java.util.Set r1 = r8.A01     // Catch:{ all -> 0x098f }
            int r0 = r1.size()     // Catch:{ all -> 0x098f }
            if (r0 == 0) goto L_0x095f
            java.lang.String r0 = r2.A04     // Catch:{ all -> 0x098f }
            boolean r0 = android.text.TextUtils.equals(r6, r0)     // Catch:{ all -> 0x098f }
            if (r0 != 0) goto L_0x095f
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x098f }
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x098f }
            if (r0 == 0) goto L_0x095f
            r1.next()     // Catch:{ all -> 0x098f }
            java.lang.String r0 = "onFidChanged"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)     // Catch:{ all -> 0x098f }
            throw r0     // Catch:{ all -> 0x098f }
        L_0x095f:
            monitor-exit(r8)
            java.lang.Integer r1 = r2.A02
            java.lang.Integer r0 = X.AnonymousClass00R.A0N
            if (r1 != r0) goto L_0x096c
            java.lang.String r0 = r2.A04
            monitor-enter(r8)
            r8.A00 = r0     // Catch:{ all -> 0x098f }
            goto L_0x097b
        L_0x096c:
            r0 = r19
            if (r1 != r0) goto L_0x097c
            X.ByK r1 = X.C24261ByK.BAD_CONFIG
            X.Blz r0 = new X.Blz
            r0.<init>(r1)
        L_0x0977:
            X.C18480wV.A02(r8, r0)
            return
        L_0x097b:
            monitor-exit(r8)
        L_0x097c:
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            if (r1 == r0) goto L_0x0988
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            if (r1 == r0) goto L_0x0988
            X.C18480wV.A01(r8, r2)
            return
        L_0x0988:
            java.lang.String r0 = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."
            java.io.IOException r0 = X.C17880vN.A0f(r0)
            goto L_0x0977
        L_0x098f:
            r1 = move-exception
            monitor-exit(r8)
            throw r1
        L_0x0992:
            r1 = move-exception
            monitor-exit(r20)     // Catch:{ all -> 0x0992 }
            throw r1
        L_0x0995:
            X.ByK r0 = X.C24261ByK.UNAVAILABLE     // Catch:{ Blz -> 0x09b8 }
            X.Blz r3 = new X.Blz     // Catch:{ Blz -> 0x09b8 }
            r3.<init>(r0, r9)     // Catch:{ Blz -> 0x09b8 }
            goto L_0x09b7
        L_0x099d:
            r3 = move-exception
            r1.disconnect()     // Catch:{ Blz -> 0x09b8 }
        L_0x09a1:
            android.net.TrafficStats.clearThreadStatsTag()     // Catch:{ Blz -> 0x09b8 }
            goto L_0x09b7
        L_0x09a5:
            X.ByK r0 = X.C24261ByK.UNAVAILABLE     // Catch:{ Blz -> 0x09b8 }
            X.Blz r3 = new X.Blz     // Catch:{ Blz -> 0x09b8 }
            r3.<init>(r0, r9)     // Catch:{ Blz -> 0x09b8 }
            goto L_0x09b7
        L_0x09ad:
            r3 = move-exception
            monitor-exit(r4)     // Catch:{ Blz -> 0x09b8 }
            goto L_0x09b7
        L_0x09b0:
            X.ByK r0 = X.C24261ByK.UNAVAILABLE     // Catch:{ Blz -> 0x09b8 }
            X.Blz r3 = new X.Blz     // Catch:{ Blz -> 0x09b8 }
            r3.<init>(r0, r2)     // Catch:{ Blz -> 0x09b8 }
        L_0x09b7:
            throw r3     // Catch:{ Blz -> 0x09b8 }
        L_0x09b8:
            r0 = move-exception
            X.C18480wV.A02(r8, r0)
            return
        L_0x09bd:
            r0 = move-exception
            if (r1 == 0) goto L_0x09c3
            r1.A01()     // Catch:{ all -> 0x09c4 }
        L_0x09c3:
            throw r0     // Catch:{ all -> 0x09c4 }
        L_0x09c4:
            r1 = move-exception
            monitor-exit(r20)     // Catch:{ all -> 0x09c4 }
            throw r1
        L_0x09c7:
            java.lang.Object r0 = r3.A01
            X.0yi r0 = (X.C19670yi) r0
            java.util.ArrayDeque r5 = r0.A01
            monitor-enter(r5)
            android.content.SharedPreferences r0 = r0.A00     // Catch:{ all -> 0x09fc }
            android.content.SharedPreferences$Editor r4 = r0.edit()     // Catch:{ all -> 0x09fc }
            java.lang.String r3 = "topic_operation_queue"
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x09fc }
            java.util.Iterator r1 = r5.iterator()     // Catch:{ all -> 0x09fc }
        L_0x09de:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x09fc }
            if (r0 == 0) goto L_0x09ef
            java.lang.String r0 = X.C17880vN.A0v(r1)     // Catch:{ all -> 0x09fc }
            r2.append(r0)     // Catch:{ all -> 0x09fc }
            X.BE6.A1K(r2)     // Catch:{ all -> 0x09fc }
            goto L_0x09de
        L_0x09ef:
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x09fc }
            android.content.SharedPreferences$Editor r0 = r4.putString(r3, r0)     // Catch:{ all -> 0x09fc }
            r0.commit()     // Catch:{ all -> 0x09fc }
            monitor-exit(r5)     // Catch:{ all -> 0x09fc }
            return
        L_0x09fc:
            r1 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x09fc }
            throw r1
        L_0x09ff:
            java.lang.Object r0 = r3.A01
            X.CvH r0 = (X.C26226CvH) r0
            android.os.Looper r0 = r0.A06
            if (r0 != 0) goto L_0x0a0e
            java.lang.String r0 = "looper"
            X.C18070vi.A11(r0)
            r1 = 0
            throw r1
        L_0x0a0e:
            r0.quit()
            return
        L_0x0a12:
            java.lang.Object r2 = r3.A01
            X.CNy r2 = (X.C24880CNy) r2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Service took too long to process intent: "
            r1.append(r0)
            android.content.Intent r0 = r2.A00
            java.lang.String r0 = r0.getAction()
            r1.append(r0)
            java.lang.String r0 = " finishing."
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)
            java.lang.String r0 = "FirebaseMessaging"
            android.util.Log.w(r0, r1)
            com.google.android.gms.tasks.TaskCompletionSource r1 = r2.A01
            r0 = 0
            r1.trySetResult(r0)
            return
        L_0x0a3a:
            java.lang.Object r8 = r3.A01
            X.CXG r8 = (X.CXG) r8
            X.CR0 r7 = r8.A04
            java.lang.ref.WeakReference r6 = r7.A03
            java.lang.Object r5 = r6.get()
            if (r5 == 0) goto L_0x0a5f
            X.E8A r4 = r7.A01
            X.A4p r2 = new X.A4p
            r2.<init>()
            r1 = 0
            java.lang.String r0 = r7.A02
            r2.A03(r0, r1)
            r0 = 1
            X.9zJ r1 = X.BE7.A0R(r2, r5, r0)
            X.Boh r0 = r7.A00
            X.C25974Cph.A00(r0, r1, r4)
        L_0x0a5f:
            boolean r0 = r8.A06
            if (r0 == 0) goto L_0x0a73
            boolean r0 = r8.A00
            if (r0 != 0) goto L_0x0bb2
            boolean r0 = r8.A01
            if (r0 != 0) goto L_0x0bb2
            android.os.Handler r2 = r8.A03
            long r0 = r8.A02
            r2.postDelayed(r3, r0)
            return
        L_0x0a73:
            java.lang.Object r2 = r6.get()
            X.DOZ r2 = (X.DOZ) r2
            if (r2 == 0) goto L_0x0bb2
            java.lang.String r1 = r7.A02
            X.C18070vi.A0b(r1)
            r0 = 2131428185(0x7f0b0359, float:1.8478007E38)
            java.lang.Object r0 = r2.A01(r0)
            java.util.AbstractMap r0 = (java.util.AbstractMap) r0
            r0.remove(r1)
            return
        L_0x0a8d:
            java.lang.Object r1 = r3.A01
            X.DNk r1 = (X.C26962DNk) r1
            int r0 = r1.A00
            if (r0 != 0) goto L_0x0bb2
            r1.A07()
            return
        L_0x0a99:
            android.view.Choreographer r1 = android.view.Choreographer.getInstance()
            java.lang.Object r0 = r3.A01
            X.CiZ r0 = (X.C25594CiZ) r0
            android.view.Choreographer$FrameCallback r0 = r0.A02
            goto L_0x0aee
        L_0x0aa4:
            java.lang.Object r2 = r3.A01
            X.CiZ r2 = (X.C25594CiZ) r2
            boolean r0 = r2.A00
            if (r0 == 0) goto L_0x0ac1
            X.0vl r0 = r2.A05
            java.lang.Object r0 = r0.getValue()
            android.os.Handler r0 = (android.os.Handler) r0
            r0.removeCallbacks(r3)
            android.view.Choreographer r1 = android.view.Choreographer.getInstance()
            android.view.Choreographer$FrameCallback r0 = r2.A02
            r1.removeFrameCallback(r0)
            return
        L_0x0ac1:
            r0 = 1
            r2.A01 = r0
            java.util.LinkedList r0 = r2.A04
            java.util.Iterator r1 = r0.iterator()
            X.C18070vi.A0X(r1)
        L_0x0acd:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0ae1
            java.lang.Object r0 = r1.next()
            X.C18070vi.A0X(r0)
            X.C108945cZ.A1P(r0)
            r1.remove()
            goto L_0x0acd
        L_0x0ae1:
            r0 = 0
            r2.A01 = r0
            boolean r0 = r2.A00
            if (r0 != 0) goto L_0x0bb2
            android.view.Choreographer r1 = android.view.Choreographer.getInstance()
            android.view.Choreographer$FrameCallback r0 = r2.A02
        L_0x0aee:
            r1.postFrameCallback(r0)
            return
        L_0x0af2:
            java.lang.Object r1 = r3.A01
            X.CQJ r1 = (X.CQJ) r1
            X.1Di r0 = r1.A02
            r0.invoke(r1)
            return
        L_0x0afc:
            java.lang.Object r0 = r3.A01
            X.CaI r0 = (X.C25167CaI) r0
            java.lang.Runnable r0 = r0.A01
            r0.run()
            return
        L_0x0b06:
            java.lang.Object r1 = r3.A01
            X.COA r1 = (X.COA) r1
            X.1Di r0 = r1.A00
            r0.invoke(r1)
            r0 = 0
            r1.A01 = r0
            return
        L_0x0b13:
            java.lang.Object r0 = r3.A01
            X.0vk r0 = (X.C18090vk) r0
            r0.invoke()
            return
        L_0x0b1b:
            java.lang.Object r0 = r3.A01
            X.2n7 r0 = (X.C59932n7) r0
            X.00H r0 = r0.A06
            java.lang.Object r2 = r0.get()
            X.10T r2 = (X.AnonymousClass10T) r2
            r1 = 0
            X.7KX r0 = new X.7KX
            r0.<init>(r1)
            r2.notifyAllObservers(r0)
            return
        L_0x0b31:
            java.lang.Object r2 = r3.A01
            X.3NZ r2 = (X.AnonymousClass3NZ) r2
            com.whatsapp.CodeInputField r1 = r2.A04
            java.lang.String r0 = r1.getCode()
            r1.setCode(r0)
            android.os.Handler r0 = r1.getHandler()
            if (r0 == 0) goto L_0x0bb2
            java.lang.Runnable r0 = r2.A01
            if (r0 == 0) goto L_0x0bb2
            android.os.Handler r1 = r1.getHandler()
            java.lang.Runnable r0 = r2.A01
            r1.removeCallbacks(r0)
            return
        L_0x0b52:
            java.lang.Object r0 = r3.A01
            java.util.Set r0 = (java.util.Set) r0
            r0.clear()
            return
        L_0x0b5a:
            java.lang.Object r0 = r3.A01
            X.3tk r0 = (X.C78843tk) r0
            X.1FY r0 = r0.CFa()
            r0.onBackPressed()
            return
        L_0x0b66:
            java.lang.Object r1 = r3.A01
            X.3tk r1 = (X.C78843tk) r1
            androidx.fragment.app.Fragment r0 = r1.getHost()
            boolean r0 = r0.A0j
            if (r0 != 0) goto L_0x0bb2
            X.1FY r0 = r1.CFa()
            boolean r0 = r0.Bed()
            if (r0 != 0) goto L_0x0bb2
            X.4aY r0 = r1.A04
            r0.A2T()
            return
        L_0x0b82:
            java.lang.Object r1 = r3.A01
            X.3tk r1 = (X.C78843tk) r1
            androidx.fragment.app.Fragment r0 = r1.getHost()
            boolean r0 = r0.A0j
            if (r0 != 0) goto L_0x0bb2
            X.1FY r0 = r1.CFa()
            boolean r0 = r0.Bed()
            if (r0 != 0) goto L_0x0bb2
            X.4aY r0 = r1.A04
            r0.A2U()
            X.4aY r0 = r1.A04
            r0.A2R()
            return
        L_0x0ba3:
            X.C18480wV.A01(r3, r5)
            java.util.concurrent.Executor r2 = r3.A09
            r1 = 29
            X.DTf r0 = new X.DTf
            r0.<init>((X.C18480wV) r3, (int) r1)
            r2.execute(r0)
        L_0x0bb2:
            return
        L_0x0bb3:
            java.lang.Object r0 = r3.A01
            X.5ah r0 = (X.C107835ah) r0
            r0.Br8()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27080DTf.run():void");
    }

    public C27080DTf(C25167CaI caI) {
        this.A00 = 40;
        this.A01 = caI;
    }

    public C27080DTf(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
