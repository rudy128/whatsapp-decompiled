package X;

import android.net.Uri;
import java.io.File;
import java.util.NavigableSet;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.D9p  reason: case insensitive filesystem */
public class C26692D9p implements E9Q {
    public long A00;
    public long A01;
    public E8Z A02;
    public E9Q A03;
    public C28651ECk A04;
    public DSC A05;
    public ECl A06;
    public CTZ A07;
    public CXX A08;
    public long A09;
    public long A0A;
    public long A0B;
    public boolean A0C = false;
    public final int A0D;
    public final int A0E;
    public final long A0F;
    public final BPF A0G;
    public final C26029Cqn A0H;
    public final C24357Bzs A0I;
    public final CZH A0J;
    public final C27066DRp A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final AtomicBoolean A0P;

    private void A02() {
        try {
            C25304Cd8.A01("exo-closecurrentstream");
            DSC dsc = this.A05;
            if (dsc == null) {
                hashCode();
            } else {
                hashCode();
                File file = dsc.A06;
                if (file != null) {
                    file.getPath();
                }
            }
            if (this.A03 != null) {
                ECl eCl = this.A06;
                if (eCl != null) {
                    eCl.C9A(A00(), this, true);
                }
                this.A03.close();
                this.A03 = null;
            }
            DSC dsc2 = this.A05;
            if (dsc2 != null && !dsc2.A08) {
                Object[] objArr = new Object[5];
                objArr[0] = this.A0I;
                AnonymousClass3MX.A1S(objArr, 1, dsc2.A05);
                C17890vO.A1N(objArr, dsc2.A04);
                objArr[3] = this.A0J.A04;
                objArr[4] = this.A07.A06;
                C25922Cog.A01("FbHttpCacheDataSource", "Cache data sink close stream. Type:%s, Offset:%d, FileSize:%d, Vid:%s, Key:%s", objArr);
                E8Z e8z = this.A02;
                if (e8z != null) {
                    try {
                        e8z.close();
                        this.A02 = null;
                    } catch (C24193Bx3 unused) {
                    }
                }
            }
        } finally {
            DSC dsc3 = this.A05;
            if (dsc3 != null && !dsc3.A08) {
                A03(dsc3);
            }
            this.A05 = null;
            C25304Cd8.A00();
        }
    }

    public Uri Bb3() {
        return null;
    }

    private C26115Csd A00() {
        Uri uri;
        File file;
        CTZ ctz = this.A07;
        long j = ctz.A02;
        long j2 = ctz.A01;
        if (j2 == -1) {
            j2 = Long.MAX_VALUE;
        }
        DSC dsc = this.A05;
        if (dsc != null && this.A0K.checkCachedLockedCacheSpan && dsc.A08) {
            j -= dsc.A05;
            j2 = Math.min(dsc.A04 - j, j2);
        }
        if (this.A0K.enableVideoMemoryCache || dsc == null || (file = dsc.A06) == null) {
            uri = null;
        } else {
            uri = Uri.fromFile(file);
        }
        CTZ ctz2 = this.A07;
        long j3 = ctz2.A00;
        return new C26115Csd(uri, ctz2.A05, ctz2.A06, (byte[]) null, ctz2.A03, j3, j, j2);
    }

    private DSC A01(EA9 ea9) {
        NavigableSet<DSC> BNz = ea9.BNz(this.A07.A06);
        if (BNz == null) {
            return null;
        }
        for (DSC dsc : BNz) {
            if (this.A07.A02 < dsc.A05) {
                return dsc;
            }
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [X.D9y, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0034, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0035, code lost:
        com.facebook.systrace.Systrace.A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0038, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A03(X.DSC r5) {
        /*
            r4 = this;
            X.Cqn r3 = r4.A0H
            X.ECn r0 = r3.A02()
            if (r0 == 0) goto L_0x0043
            X.DRp r0 = r4.A0K
            X.DRe r0 = r0.cache
            boolean r0 = r0.enableCacheInstrumentation
            if (r0 == 0) goto L_0x003c
            X.D9y r1 = X.C26700D9y.A04
            if (r1 != 0) goto L_0x001b
            X.D9y r1 = new X.D9y
            r1.<init>()
            X.C26700D9y.A04 = r1
        L_0x001b:
            X.DSC r2 = r4.A05
            java.lang.String r0 = "CacheInstrumentationListener.onReleaseHoleSpan"
            com.facebook.debug.tracer.Tracer.A00(r0)
            X.CNZ r1 = r1.A00     // Catch:{ all -> 0x0034 }
            monitor-enter(r1)     // Catch:{ all -> 0x0034 }
            java.util.TreeSet r0 = r1.A01     // Catch:{ all -> 0x0031 }
            r0.remove(r2)     // Catch:{ all -> 0x0031 }
            java.util.Map r0 = r1.A00     // Catch:{ all -> 0x0031 }
            r0.remove(r2)     // Catch:{ all -> 0x0031 }
            monitor-exit(r1)     // Catch:{ all -> 0x0034 }
            goto L_0x0039
        L_0x0031:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0034 }
            throw r0     // Catch:{ all -> 0x0034 }
        L_0x0034:
            r0 = move-exception
            com.facebook.systrace.Systrace.A01()
            throw r0
        L_0x0039:
            com.facebook.systrace.Systrace.A01()
        L_0x003c:
            X.ECn r0 = r3.A02()
            r0.CEG(r5)
        L_0x0043:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26692D9p.A03(X.DSC):void");
    }

    /* JADX WARNING: type inference failed for: r1v27, types: [X.D9y, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v6, types: [java.lang.Object, X.D9m] */
    /* JADX WARNING: type inference failed for: r14v5, types: [X.D9i, X.E9Q, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x05bc, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x05bd, code lost:
        com.facebook.systrace.Systrace.A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x05d7, code lost:
        if (r1 != -1) goto L_0x05d9;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x021a A[Catch:{ IOException -> 0x0560, all -> 0x04af, IOException -> 0x028f, all -> 0x05b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0234 A[Catch:{ IOException -> 0x0560, all -> 0x04af, IOException -> 0x028f, all -> 0x05b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0297 A[Catch:{ IOException -> 0x0560, all -> 0x04af, IOException -> 0x028f, all -> 0x05b7 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean A04(boolean r35) {
        /*
            r34 = this;
            java.lang.String r0 = "exo-opennextdatasource"
            X.C25304Cd8.A01(r0)     // Catch:{ all -> 0x0623 }
            r18 = 1
            r11 = 0
            r4 = r34
            r4.A02()     // Catch:{ all -> 0x0623 }
            X.CTZ r3 = r4.A07     // Catch:{ all -> 0x0623 }
            long r1 = r3.A01     // Catch:{ all -> 0x0623 }
            r5 = -1
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x001c
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x001c:
            r16 = 0
            int r0 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r0 != 0) goto L_0x0026
            X.C25304Cd8.A00()
            return r11
        L_0x0026:
            X.DRp r5 = r4.A0K     // Catch:{ all -> 0x0623 }
            boolean r0 = r5.shouldLoadBinaryDataFromManifest     // Catch:{ all -> 0x0623 }
            if (r0 == 0) goto L_0x00a3
            X.CkW r0 = r3.A05     // Catch:{ all -> 0x0623 }
            java.lang.String r2 = r0.A0G     // Catch:{ all -> 0x0623 }
            if (r2 == 0) goto L_0x00a3
            java.lang.String r1 = r0.A0H     // Catch:{ all -> 0x0623 }
            if (r1 == 0) goto L_0x00a3
            X.D9i r14 = new X.D9i     // Catch:{ IOException | IllegalArgumentException -> 0x0095 }
            r14.<init>()     // Catch:{ IOException | IllegalArgumentException -> 0x0095 }
            boolean r0 = r1.isEmpty()     // Catch:{ IOException | IllegalArgumentException -> 0x0095 }
            if (r0 != 0) goto L_0x0092
            boolean r0 = r2.isEmpty()     // Catch:{ IOException | IllegalArgumentException -> 0x0095 }
            if (r0 != 0) goto L_0x0092
            byte[] r7 = android.util.Base64.decode(r2, r11)     // Catch:{ IOException | IllegalArgumentException -> 0x0095 }
            byte[] r6 = android.util.Base64.decode(r1, r11)     // Catch:{ IOException | IllegalArgumentException -> 0x0095 }
            int r3 = r6.length     // Catch:{ IOException | IllegalArgumentException -> 0x0095 }
            int r2 = r7.length     // Catch:{ IOException | IllegalArgumentException -> 0x0095 }
            int r0 = r3 + r2
            byte[] r1 = new byte[r0]     // Catch:{ IOException | IllegalArgumentException -> 0x0095 }
            java.lang.System.arraycopy(r6, r11, r1, r11, r3)     // Catch:{ IOException | IllegalArgumentException -> 0x0095 }
            java.lang.System.arraycopy(r7, r11, r1, r3, r2)     // Catch:{ IOException | IllegalArgumentException -> 0x0095 }
        L_0x005b:
            X.BPH r0 = new X.BPH     // Catch:{ IOException | IllegalArgumentException -> 0x0095 }
            r0.<init>(r1)     // Catch:{ IOException | IllegalArgumentException -> 0x0095 }
            r14.A00 = r0     // Catch:{ IOException | IllegalArgumentException -> 0x0095 }
            r4.A03 = r14     // Catch:{ IOException | IllegalArgumentException -> 0x0095 }
            X.CTZ r8 = r4.A07     // Catch:{ IOException | IllegalArgumentException -> 0x0095 }
            android.net.Uri r15 = r8.A04     // Catch:{ IOException | IllegalArgumentException -> 0x0095 }
            byte[] r13 = r8.A07     // Catch:{ IOException | IllegalArgumentException -> 0x0095 }
            long r6 = r8.A00     // Catch:{ IOException | IllegalArgumentException -> 0x0095 }
            long r2 = r8.A02     // Catch:{ IOException | IllegalArgumentException -> 0x0095 }
            long r0 = r8.A01     // Catch:{ IOException | IllegalArgumentException -> 0x0095 }
            java.lang.String r12 = r8.A06     // Catch:{ IOException | IllegalArgumentException -> 0x0095 }
            int r10 = r8.A03     // Catch:{ IOException | IllegalArgumentException -> 0x0095 }
            X.CkW r9 = r8.A05     // Catch:{ IOException | IllegalArgumentException -> 0x0095 }
            X.Csd r8 = new X.Csd     // Catch:{ IOException | IllegalArgumentException -> 0x0095 }
            r19 = r8
            r20 = r15
            r21 = r9
            r22 = r12
            r23 = r13
            r24 = r10
            r25 = r6
            r27 = r2
            r29 = r0
            r19.<init>(r20, r21, r22, r23, r24, r25, r27, r29)     // Catch:{ IOException | IllegalArgumentException -> 0x0095 }
            r14.CAj(r8)     // Catch:{ IOException | IllegalArgumentException -> 0x0095 }
            goto L_0x061f
        L_0x0092:
            byte[] r1 = new byte[r11]     // Catch:{ IOException | IllegalArgumentException -> 0x0095 }
            goto L_0x005b
        L_0x0095:
            r3 = move-exception
            java.lang.String r2 = "FbHttpCacheDataSource"
            java.lang.String r1 = "Caught exception reading from manifest data source so ignoring"
            java.lang.Object[] r0 = new java.lang.Object[r11]     // Catch:{ all -> 0x0623 }
            java.lang.String r0 = java.lang.String.format(r1, r0)     // Catch:{ all -> 0x0623 }
            android.util.Log.e(r2, r0, r3)     // Catch:{ all -> 0x0623 }
        L_0x00a3:
            X.Cqn r0 = r4.A0H     // Catch:{ all -> 0x0623 }
            r33 = r0
            X.ECn r7 = r33.A02()     // Catch:{ all -> 0x0623 }
            X.Bzr r6 = X.C24356Bzr.NOT_CACHED     // Catch:{ all -> 0x0623 }
            if (r7 == 0) goto L_0x0198
            boolean r0 = r5.enableVrlQplLoggingEvents     // Catch:{ all -> 0x0623 }
            if (r0 == 0) goto L_0x00ce
            X.ECl r8 = r4.A06     // Catch:{ all -> 0x0623 }
            if (r8 == 0) goto L_0x00ce
            X.CTZ r1 = r4.A07     // Catch:{ all -> 0x0623 }
            long r2 = r1.A00     // Catch:{ all -> 0x0623 }
            int r0 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r0 != 0) goto L_0x00c3
            r8.Bvx()     // Catch:{ all -> 0x0623 }
            goto L_0x00ce
        L_0x00c3:
            X.CkW r0 = r1.A05     // Catch:{ all -> 0x0623 }
            int r0 = r0.A07     // Catch:{ all -> 0x0623 }
            if (r0 != 0) goto L_0x00ce
            long r0 = r1.A01     // Catch:{ all -> 0x0623 }
            r8.Buh(r2, r0)     // Catch:{ all -> 0x0623 }
        L_0x00ce:
            java.lang.Integer r2 = X.AnonymousClass00R.A01     // Catch:{ InterruptedException -> 0x018e }
            if (r35 == 0) goto L_0x00d4
            java.lang.Integer r2 = X.AnonymousClass00R.A0N     // Catch:{ InterruptedException -> 0x018e }
        L_0x00d4:
            boolean r0 = r5.enableLogSemiCachedEvents     // Catch:{ InterruptedException -> 0x018e }
            if (r0 == 0) goto L_0x0116
            X.CTZ r0 = r4.A07     // Catch:{ InterruptedException -> 0x018e }
            java.lang.String r3 = r0.A06     // Catch:{ InterruptedException -> 0x018e }
            long r0 = r0.A02     // Catch:{ InterruptedException -> 0x018e }
            X.DSC r1 = r7.CO9(r2, r3, r0)     // Catch:{ InterruptedException -> 0x018e }
            r4.A05 = r1     // Catch:{ InterruptedException -> 0x018e }
            if (r1 != 0) goto L_0x010f
            X.Bzr r6 = X.C24356Bzr.SEMI_CACHED     // Catch:{ InterruptedException -> 0x018e }
            boolean r1 = r5.enableCacheBlockWithoutTimeout     // Catch:{ InterruptedException -> 0x018e }
            X.CTZ r0 = r4.A07     // Catch:{ InterruptedException -> 0x018e }
            if (r1 == 0) goto L_0x00f9
            java.lang.String r3 = r0.A06     // Catch:{ InterruptedException -> 0x018e }
            long r0 = r0.A02     // Catch:{ InterruptedException -> 0x018e }
            X.DSC r1 = r7.CO7(r2, r3, r0)     // Catch:{ InterruptedException -> 0x018e }
        L_0x00f6:
            r4.A05 = r1     // Catch:{ InterruptedException -> 0x018e }
            goto L_0x0142
        L_0x00f9:
            java.lang.String r3 = r0.A06     // Catch:{ InterruptedException -> 0x018e }
            long r8 = r0.A02     // Catch:{ InterruptedException -> 0x018e }
            int r0 = r4.A0D     // Catch:{ InterruptedException -> 0x018e }
            long r0 = (long) r0     // Catch:{ InterruptedException -> 0x018e }
            r19 = r7
            r20 = r2
            r21 = r3
            r22 = r8
            r24 = r0
            X.DSC r1 = r19.CO8(r20, r21, r22, r24)     // Catch:{ InterruptedException -> 0x018e }
            goto L_0x00f6
        L_0x010f:
            boolean r0 = r1.A08     // Catch:{ InterruptedException -> 0x018e }
            if (r0 == 0) goto L_0x0142
            X.Bzr r6 = X.C24356Bzr.CACHED     // Catch:{ InterruptedException -> 0x018e }
            goto L_0x0142
        L_0x0116:
            X.Bzr r6 = X.C24356Bzr.CACHED     // Catch:{ InterruptedException -> 0x018e }
            boolean r0 = r5.enableCacheBlockWithoutTimeout     // Catch:{ InterruptedException -> 0x018e }
            if (r0 == 0) goto L_0x0129
            X.CTZ r0 = r4.A07     // Catch:{ InterruptedException -> 0x018e }
            java.lang.String r3 = r0.A06     // Catch:{ InterruptedException -> 0x018e }
            long r0 = r0.A02     // Catch:{ InterruptedException -> 0x018e }
            X.DSC r1 = r7.CO7(r2, r3, r0)     // Catch:{ InterruptedException -> 0x018e }
            r4.A05 = r1     // Catch:{ InterruptedException -> 0x018e }
            goto L_0x0142
        L_0x0129:
            X.CTZ r0 = r4.A07     // Catch:{ InterruptedException -> 0x018e }
            java.lang.String r3 = r0.A06     // Catch:{ InterruptedException -> 0x018e }
            long r8 = r0.A02     // Catch:{ InterruptedException -> 0x018e }
            int r0 = r4.A0D     // Catch:{ InterruptedException -> 0x018e }
            long r0 = (long) r0     // Catch:{ InterruptedException -> 0x018e }
            r19 = r7
            r20 = r2
            r21 = r3
            r22 = r8
            r24 = r0
            X.DSC r1 = r19.CO8(r20, r21, r22, r24)     // Catch:{ InterruptedException -> 0x018e }
            r4.A05 = r1     // Catch:{ InterruptedException -> 0x018e }
        L_0x0142:
            boolean r0 = r5.enableVrlQplLoggingEvents     // Catch:{ all -> 0x0623 }
            if (r0 == 0) goto L_0x0155
            X.ECl r10 = r4.A06     // Catch:{ all -> 0x0623 }
            if (r10 == 0) goto L_0x0155
            X.CTZ r8 = r4.A07     // Catch:{ all -> 0x0623 }
            long r2 = r8.A00     // Catch:{ all -> 0x0623 }
            int r0 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r0 != 0) goto L_0x0158
            r10.Bvw(r6)     // Catch:{ all -> 0x0623 }
        L_0x0155:
            X.DSC r0 = r4.A05     // Catch:{ all -> 0x0623 }
            goto L_0x017d
        L_0x0158:
            X.CkW r0 = r8.A05     // Catch:{ all -> 0x0623 }
            int r0 = r0.A07     // Catch:{ all -> 0x0623 }
            if (r0 != 0) goto L_0x0155
            long r8 = r8.A01     // Catch:{ all -> 0x0623 }
            boolean r0 = r5.fixNullCacheSpan     // Catch:{ all -> 0x0623 }
            if (r0 == 0) goto L_0x016a
            if (r1 == 0) goto L_0x0167
            goto L_0x016d
        L_0x0167:
            r0 = -1
            goto L_0x016f
        L_0x016a:
            long r0 = r1.A04     // Catch:{ all -> 0x0623 }
            goto L_0x016f
        L_0x016d:
            long r0 = r1.A04     // Catch:{ all -> 0x0623 }
        L_0x016f:
            r19 = r10
            r20 = r6
            r21 = r2
            r23 = r8
            r25 = r0
            r19.Bug(r20, r21, r23, r25)     // Catch:{ all -> 0x0623 }
            goto L_0x0155
        L_0x017d:
            if (r0 != 0) goto L_0x0180
            goto L_0x0192
        L_0x0180:
            r7.hashCode()     // Catch:{ all -> 0x0623 }
            r4.hashCode()     // Catch:{ all -> 0x0623 }
            java.io.File r0 = r0.A06     // Catch:{ all -> 0x0623 }
            if (r0 == 0) goto L_0x0198
            r0.getPath()     // Catch:{ all -> 0x0623 }
            goto L_0x0198
        L_0x018e:
            X.C25304Cd8.A00()
            return r11
        L_0x0192:
            r7.hashCode()     // Catch:{ all -> 0x0623 }
            r4.hashCode()     // Catch:{ all -> 0x0623 }
        L_0x0198:
            r4.A0C = r11     // Catch:{ all -> 0x0623 }
            X.DSC r1 = r4.A05     // Catch:{ all -> 0x0623 }
            if (r1 == 0) goto L_0x0307
            boolean r0 = r1.A08     // Catch:{ all -> 0x0623 }
            if (r0 == 0) goto L_0x0307
            long r0 = r1.A04     // Catch:{ all -> 0x0623 }
            r7 = -1
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1P(r2)
            r0 = r0 ^ 1
            X.C26056CrS.A03(r0)     // Catch:{ all -> 0x0623 }
            X.ECl r14 = r4.A06     // Catch:{ all -> 0x0623 }
            if (r14 == 0) goto L_0x01e3
            X.CTZ r9 = r4.A07     // Catch:{ all -> 0x0623 }
            android.net.Uri r0 = r9.A04     // Catch:{ all -> 0x0623 }
            r16 = r0
            byte[] r15 = r9.A07     // Catch:{ all -> 0x0623 }
            long r7 = r9.A00     // Catch:{ all -> 0x0623 }
            long r2 = r9.A02     // Catch:{ all -> 0x0623 }
            long r0 = r9.A01     // Catch:{ all -> 0x0623 }
            java.lang.String r13 = r9.A06     // Catch:{ all -> 0x0623 }
            int r12 = r9.A03     // Catch:{ all -> 0x0623 }
            X.CkW r10 = r9.A05     // Catch:{ all -> 0x0623 }
            X.Csd r9 = new X.Csd     // Catch:{ all -> 0x0623 }
            r19 = r9
            r20 = r16
            r21 = r10
            r22 = r13
            r23 = r15
            r24 = r12
            r25 = r7
            r27 = r2
            r29 = r0
            r19.<init>(r20, r21, r22, r23, r24, r25, r27, r29)     // Catch:{ all -> 0x0623 }
            r14.C9D(r9, r6)     // Catch:{ all -> 0x0623 }
        L_0x01e3:
            java.lang.String r0 = "exo-opencachedatasource"
            X.C25304Cd8.A01(r0)     // Catch:{ all -> 0x05b7 }
            X.DSC r0 = r4.A05     // Catch:{ all -> 0x05b7 }
            if (r0 != 0) goto L_0x01f9
            r4.hashCode()     // Catch:{ all -> 0x05b7 }
        L_0x01ef:
            X.DSC r6 = r4.A05     // Catch:{ all -> 0x05b7 }
            if (r6 == 0) goto L_0x0204
            boolean r1 = r6.A08     // Catch:{ all -> 0x05b7 }
            r0 = 1
            if (r1 != 0) goto L_0x0205
            goto L_0x0204
        L_0x01f9:
            r4.hashCode()     // Catch:{ all -> 0x05b7 }
            java.io.File r0 = r0.A06     // Catch:{ all -> 0x05b7 }
            if (r0 == 0) goto L_0x01ef
            r0.getPath()     // Catch:{ all -> 0x05b7 }
            goto L_0x01ef
        L_0x0204:
            r0 = 0
        L_0x0205:
            X.C26056CrS.A03(r0)     // Catch:{ all -> 0x05b7 }
            X.CTZ r8 = r4.A07     // Catch:{ all -> 0x05b7 }
            long r2 = r8.A02     // Catch:{ all -> 0x05b7 }
            long r0 = r6.A05     // Catch:{ all -> 0x05b7 }
            long r2 = r2 - r0
            long r6 = r6.A04     // Catch:{ all -> 0x05b7 }
            long r6 = r6 - r2
            long r0 = r8.A01     // Catch:{ all -> 0x05b7 }
            r9 = -1
            int r8 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r8 != 0) goto L_0x021f
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x021f:
            long r6 = java.lang.Math.min(r6, r0)     // Catch:{ all -> 0x05b7 }
            X.Csd r12 = r4.A00()     // Catch:{ all -> 0x05b7 }
            boolean r1 = r5.enableVideoMemoryCache     // Catch:{ all -> 0x05b7 }
            r10 = 3
            r9 = 2
            r0 = 6
            if (r1 != 0) goto L_0x0297
            X.DSC r1 = r4.A05     // Catch:{ all -> 0x05b7 }
            boolean r1 = r1.A02     // Catch:{ all -> 0x05b7 }
            if (r1 != 0) goto L_0x0297
            java.lang.String r16 = "FbHttpCacheDataSource"
            java.lang.String r14 = "Cache data source open spec(Cached). Type:%s, Offset:%d, FilePos:%d, Length:%d, Vid:%s, Key:%s"
            java.lang.Object[] r13 = new java.lang.Object[r0]     // Catch:{ all -> 0x05b7 }
            X.Bzs r0 = r4.A0I     // Catch:{ all -> 0x05b7 }
            r13[r11] = r0     // Catch:{ all -> 0x05b7 }
            X.CTZ r15 = r4.A07     // Catch:{ all -> 0x05b7 }
            long r0 = r15.A00     // Catch:{ all -> 0x05b7 }
            r8 = r18
            X.AnonymousClass3MX.A1S(r13, r8, r0)     // Catch:{ all -> 0x05b7 }
            X.AnonymousClass3MX.A1S(r13, r9, r2)     // Catch:{ all -> 0x05b7 }
            X.AnonymousClass3MX.A1S(r13, r10, r6)     // Catch:{ all -> 0x05b7 }
            X.CZH r0 = r4.A0J     // Catch:{ all -> 0x05b7 }
            java.lang.String r1 = r0.A04     // Catch:{ all -> 0x05b7 }
            r0 = 4
            r13[r0] = r1     // Catch:{ all -> 0x05b7 }
            java.lang.String r1 = r15.A06     // Catch:{ all -> 0x05b7 }
            r0 = 5
            r13[r0] = r1     // Catch:{ all -> 0x05b7 }
            r0 = r16
            X.C25922Cog.A01(r0, r14, r13)     // Catch:{ all -> 0x05b7 }
            X.BPF r10 = r4.A0G     // Catch:{ IOException -> 0x028f }
            r10.CAj(r12)     // Catch:{ IOException -> 0x028f }
            X.DRe r0 = r5.cache     // Catch:{ all -> 0x05b7 }
            boolean r0 = r0.enableCacheInstrumentation     // Catch:{ all -> 0x05b7 }
            if (r0 == 0) goto L_0x02f8
            X.CXX r9 = r4.A08     // Catch:{ all -> 0x05b7 }
            X.CTZ r0 = r4.A07     // Catch:{ all -> 0x05b7 }
            long r2 = r0.A00     // Catch:{ all -> 0x05b7 }
            java.lang.String r0 = "VideoRequestEvent.onOpenCacheDataSource"
            com.facebook.debug.tracer.Tracer.A00(r0)     // Catch:{ all -> 0x05b7 }
            int r0 = r9.A00     // Catch:{ all -> 0x04af }
            int r0 = r0 + 1
            r9.A00 = r0     // Catch:{ all -> 0x04af }
            long r0 = r9.A03     // Catch:{ all -> 0x04af }
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r8 <= 0) goto L_0x0282
            r9.A03 = r2     // Catch:{ all -> 0x04af }
        L_0x0282:
            long r0 = r9.A02     // Catch:{ all -> 0x04af }
            long r2 = r2 + r6
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r8 >= 0) goto L_0x028b
            r9.A02 = r2     // Catch:{ all -> 0x04af }
        L_0x028b:
            com.facebook.systrace.Systrace.A01()     // Catch:{ all -> 0x05b7 }
            goto L_0x02f8
        L_0x028f:
            r1 = move-exception
            X.BPF r0 = r4.A0G     // Catch:{ all -> 0x05b7 }
            r0.close()     // Catch:{ all -> 0x05b7 }
            goto L_0x0554
        L_0x0297:
            java.lang.String r16 = "FbHttpCacheDataSource"
            java.lang.String r14 = "Cache data source open spec(MemoryCached). Type:%s, Offset:%d, CachePos:%d, Length:%d, Vid:%s, Key:%s"
            java.lang.Object[] r13 = new java.lang.Object[r0]     // Catch:{ all -> 0x05b7 }
            X.Bzs r0 = r4.A0I     // Catch:{ all -> 0x05b7 }
            r13[r11] = r0     // Catch:{ all -> 0x05b7 }
            X.CTZ r15 = r4.A07     // Catch:{ all -> 0x05b7 }
            long r0 = r15.A00     // Catch:{ all -> 0x05b7 }
            r8 = r18
            X.AnonymousClass3MX.A1S(r13, r8, r0)     // Catch:{ all -> 0x05b7 }
            X.AnonymousClass3MX.A1S(r13, r9, r2)     // Catch:{ all -> 0x05b7 }
            X.AnonymousClass3MX.A1S(r13, r10, r6)     // Catch:{ all -> 0x05b7 }
            X.CZH r0 = r4.A0J     // Catch:{ all -> 0x05b7 }
            java.lang.String r1 = r0.A04     // Catch:{ all -> 0x05b7 }
            r0 = 4
            r13[r0] = r1     // Catch:{ all -> 0x05b7 }
            java.lang.String r1 = r15.A06     // Catch:{ all -> 0x05b7 }
            r0 = 5
            r13[r0] = r1     // Catch:{ all -> 0x05b7 }
            r0 = r16
            X.C25922Cog.A01(r0, r14, r13)     // Catch:{ all -> 0x05b7 }
            X.D9m r10 = new X.D9m     // Catch:{ all -> 0x05b7 }
            r10.<init>()     // Catch:{ all -> 0x05b7 }
            X.ECn r2 = r33.A02()     // Catch:{ all -> 0x05b7 }
            X.DSC r1 = r4.A05     // Catch:{ all -> 0x05b7 }
            java.lang.String r0 = "exo-openmemorydatasource"
            X.C25304Cd8.A01(r0)     // Catch:{ all -> 0x0550 }
            r10.A02 = r2     // Catch:{ all -> 0x0550 }
            byte[] r1 = r2.CDR(r1)     // Catch:{ all -> 0x0550 }
            if (r1 == 0) goto L_0x0301
            r10.A03 = r1     // Catch:{ all -> 0x0550 }
            long r8 = r12.A03     // Catch:{ all -> 0x0550 }
            r10.A00 = r8     // Catch:{ all -> 0x0550 }
            long r2 = r12.A02     // Catch:{ all -> 0x0550 }
            r12 = -1
            int r0 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r0 != 0) goto L_0x02ed
            int r0 = r1.length     // Catch:{ all -> 0x0550 }
            long r0 = (long) r0     // Catch:{ all -> 0x0550 }
            long r0 = r0 - r8
        L_0x02ea:
            r10.A01 = r0     // Catch:{ all -> 0x0550 }
            goto L_0x02f5
        L_0x02ed:
            int r0 = r1.length     // Catch:{ all -> 0x0550 }
            long r0 = (long) r0     // Catch:{ all -> 0x0550 }
            long r0 = r0 - r8
            long r0 = java.lang.Math.min(r2, r0)     // Catch:{ all -> 0x0550 }
            goto L_0x02ea
        L_0x02f5:
            X.C25304Cd8.A00()     // Catch:{ all -> 0x05b7 }
        L_0x02f8:
            r4.A00 = r6     // Catch:{ all -> 0x05b7 }
            r4.A03 = r10     // Catch:{ all -> 0x05b7 }
            X.C25304Cd8.A00()     // Catch:{ all -> 0x0623 }
            r8 = 0
            goto L_0x0308
        L_0x0301:
            X.Bx2 r0 = new X.Bx2     // Catch:{ all -> 0x0550 }
            r0.<init>()     // Catch:{ all -> 0x0550 }
            throw r0     // Catch:{ all -> 0x0550 }
        L_0x0307:
            r8 = 1
        L_0x0308:
            X.DRe r0 = r5.cache     // Catch:{ all -> 0x0623 }
            boolean r0 = r0.enableCacheInstrumentation     // Catch:{ all -> 0x0623 }
            if (r0 == 0) goto L_0x034a
            X.D9y r1 = X.C26700D9y.A04     // Catch:{ all -> 0x0623 }
            if (r1 != 0) goto L_0x0319
            X.D9y r1 = new X.D9y     // Catch:{ all -> 0x0623 }
            r1.<init>()     // Catch:{ all -> 0x0623 }
            X.C26700D9y.A04 = r1     // Catch:{ all -> 0x0623 }
        L_0x0319:
            X.DSC r7 = r4.A05     // Catch:{ all -> 0x0623 }
            X.CZH r6 = r4.A0J     // Catch:{ all -> 0x0623 }
            X.CTZ r0 = r4.A07     // Catch:{ all -> 0x0623 }
            android.net.Uri r0 = r0.A04     // Catch:{ all -> 0x0623 }
            java.lang.String r3 = r0.toString()     // Catch:{ all -> 0x0623 }
            java.lang.String r0 = "CacheInstrumentationListener.onOpenHoleSpan"
            com.facebook.debug.tracer.Tracer.A00(r0)     // Catch:{ all -> 0x0623 }
            if (r7 == 0) goto L_0x0347
            boolean r0 = r7.A08     // Catch:{ all -> 0x05bc }
            if (r0 != 0) goto L_0x0347
            X.CNZ r2 = r1.A00     // Catch:{ all -> 0x05bc }
            monitor-enter(r2)     // Catch:{ all -> 0x05bc }
            java.util.TreeSet r0 = r2.A01     // Catch:{ all -> 0x0344 }
            r0.add(r7)     // Catch:{ all -> 0x0344 }
            java.util.Map r1 = r2.A00     // Catch:{ all -> 0x0344 }
            X.CNY r0 = new X.CNY     // Catch:{ all -> 0x0344 }
            r0.<init>(r6, r3)     // Catch:{ all -> 0x0344 }
            r1.put(r7, r0)     // Catch:{ all -> 0x0344 }
            monitor-exit(r2)     // Catch:{ all -> 0x05bc }
            goto L_0x0347
        L_0x0344:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x05bc }
            throw r0     // Catch:{ all -> 0x05bc }
        L_0x0347:
            com.facebook.systrace.Systrace.A01()     // Catch:{ all -> 0x0623 }
        L_0x034a:
            if (r8 == 0) goto L_0x05c1
            X.DSC r0 = r4.A05     // Catch:{ all -> 0x0623 }
            if (r0 != 0) goto L_0x0361
            java.lang.String r3 = "FbHttpCacheDataSource"
            java.lang.String r2 = "Cache span locked. Skipping caching %s"
            r0 = r18
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x0623 }
            X.CZH r0 = r4.A0J     // Catch:{ all -> 0x0623 }
            java.lang.String r0 = r0.A04     // Catch:{ all -> 0x0623 }
            r1[r11] = r0     // Catch:{ all -> 0x0623 }
            X.C25922Cog.A01(r3, r2, r1)     // Catch:{ all -> 0x0623 }
        L_0x0361:
            java.lang.String r0 = "exo-openhttpdatastream"
            X.C25304Cd8.A01(r0)     // Catch:{ all -> 0x05b7 }
            X.ECn r0 = r33.A02()     // Catch:{ all -> 0x05b7 }
            X.DSC r13 = r4.A01(r0)     // Catch:{ all -> 0x05b7 }
            if (r13 != 0) goto L_0x0378
            X.ECn r0 = r33.A02()     // Catch:{ all -> 0x05b7 }
            X.DSC r13 = r4.A01(r0)     // Catch:{ all -> 0x05b7 }
        L_0x0378:
            X.CTZ r0 = r4.A07     // Catch:{ all -> 0x05b7 }
            long r2 = r0.A01     // Catch:{ all -> 0x05b7 }
            r19 = -1
            int r0 = (r2 > r19 ? 1 : (r2 == r19 ? 0 : -1))
            if (r0 != 0) goto L_0x0384
            r2 = -1
        L_0x0384:
            X.ECn r8 = r33.A02()     // Catch:{ all -> 0x05b7 }
            boolean r0 = r5.useShortKey     // Catch:{ all -> 0x05b7 }
            if (r0 == 0) goto L_0x03b3
            boolean r0 = r5.enableLongCacheKeyForContentLength     // Catch:{ all -> 0x05b7 }
            if (r0 == 0) goto L_0x03b3
            X.CTZ r1 = r4.A07     // Catch:{ all -> 0x05b7 }
            java.lang.String r9 = r1.A06     // Catch:{ all -> 0x05b7 }
            X.CZH r0 = r4.A0J     // Catch:{ all -> 0x05b7 }
            java.lang.String r7 = r0.A04     // Catch:{ all -> 0x05b7 }
            android.net.Uri r6 = r1.A04     // Catch:{ all -> 0x05b7 }
            boolean r1 = r4.A0M     // Catch:{ all -> 0x05b7 }
            boolean r0 = r5.skipThumbnailCacheKey     // Catch:{ all -> 0x05b7 }
            r26 = r11
            r27 = r11
            r21 = r6
            r22 = r9
            r23 = r7
            r24 = r1
            r25 = r11
            r28 = r0
            java.lang.String r9 = X.C25922Cog.A00(r21, r22, r23, r24, r25, r26, r27, r28)     // Catch:{ all -> 0x05b7 }
            goto L_0x03b7
        L_0x03b3:
            X.CTZ r0 = r4.A07     // Catch:{ all -> 0x05b7 }
            java.lang.String r9 = r0.A06     // Catch:{ all -> 0x05b7 }
        L_0x03b7:
            r12 = 2
            if (r8 == 0) goto L_0x03dd
            long r6 = r8.Bad(r9)     // Catch:{ all -> 0x05b7 }
            int r0 = (r6 > r19 ? 1 : (r6 == r19 ? 0 : -1))
            if (r0 == 0) goto L_0x03dd
            X.CTZ r0 = r4.A07     // Catch:{ all -> 0x05b7 }
            long r0 = r0.A02     // Catch:{ all -> 0x05b7 }
            int r10 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r10 < 0) goto L_0x03dd
            java.lang.String r5 = "FbHttpCacheDataSource"
            java.lang.String r4 = "Skip Http request because content length is %s and position is %s"
            java.lang.Object[] r3 = new java.lang.Object[r12]     // Catch:{ all -> 0x05b7 }
            X.AnonymousClass3MX.A1S(r3, r11, r6)     // Catch:{ all -> 0x05b7 }
            r2 = r18
            X.AnonymousClass3MX.A1S(r3, r2, r0)     // Catch:{ all -> 0x05b7 }
            X.BE7.A1M(r4, r5, r3)     // Catch:{ all -> 0x05b7 }
            goto L_0x05ac
        L_0x03dd:
            if (r13 == 0) goto L_0x03ea
            long r0 = r13.A05     // Catch:{ all -> 0x05b7 }
            X.CTZ r6 = r4.A07     // Catch:{ all -> 0x05b7 }
            long r6 = r6.A02     // Catch:{ all -> 0x05b7 }
            long r0 = r0 - r6
            long r2 = java.lang.Math.min(r0, r2)     // Catch:{ all -> 0x05b7 }
        L_0x03ea:
            X.Csd r0 = X.C26115Csd.A09     // Catch:{ all -> 0x05b7 }
            X.CTZ r6 = r4.A07     // Catch:{ all -> 0x05b7 }
            android.net.Uri r15 = r6.A04     // Catch:{ all -> 0x05b7 }
            long r12 = r6.A00     // Catch:{ all -> 0x05b7 }
            long r0 = r6.A02     // Catch:{ all -> 0x05b7 }
            java.lang.String r14 = r6.A06     // Catch:{ all -> 0x05b7 }
            int r10 = r6.A03     // Catch:{ all -> 0x05b7 }
            X.CkW r7 = r6.A05     // Catch:{ all -> 0x05b7 }
            r17 = 0
            X.Csd r6 = new X.Csd     // Catch:{ all -> 0x05b7 }
            r21 = r6
            r22 = r15
            r23 = r7
            r24 = r14
            r25 = r17
            r26 = r10
            r27 = r12
            r29 = r0
            r31 = r2
            r21.<init>(r22, r23, r24, r25, r26, r27, r29, r31)     // Catch:{ all -> 0x05b7 }
            X.CkW r13 = r6.A05     // Catch:{ all -> 0x05b7 }
            X.Chq r1 = r13.A0F     // Catch:{ all -> 0x05b7 }
            X.CZH r7 = r4.A0J     // Catch:{ all -> 0x05b7 }
            java.lang.String r0 = r7.A02     // Catch:{ all -> 0x05b7 }
            r1.A00 = r0     // Catch:{ all -> 0x05b7 }
            java.lang.String r0 = r7.A03     // Catch:{ all -> 0x05b7 }
            r1.A01 = r0     // Catch:{ all -> 0x05b7 }
            X.ECk r10 = r4.A04     // Catch:{ IOException -> 0x0560 }
            long r29 = r10.CAj(r6)     // Catch:{ IOException -> 0x0560 }
            java.util.Map r1 = r10.BYJ()     // Catch:{ all -> 0x05b7 }
            java.lang.String r0 = r7.A04     // Catch:{ all -> 0x05b7 }
            r16 = r0
            boolean r0 = r5.enableCaseInsensitiveHttpResponseHeaderKey     // Catch:{ all -> 0x05b7 }
            long r0 = X.C25868Cnb.A00(r1, r0)     // Catch:{ all -> 0x05b7 }
            r4.A01 = r0     // Catch:{ all -> 0x05b7 }
            boolean r7 = r5.enableVodContentLengthLogging     // Catch:{ all -> 0x05b7 }
            if (r7 == 0) goto L_0x0440
            X.ECl r7 = r4.A06     // Catch:{ all -> 0x05b7 }
            r7.CIV(r0)     // Catch:{ all -> 0x05b7 }
        L_0x0440:
            if (r8 == 0) goto L_0x0447
            long r0 = r4.A01     // Catch:{ all -> 0x05b7 }
            r8.CLA(r9, r0)     // Catch:{ all -> 0x05b7 }
        L_0x0447:
            X.CTZ r7 = r4.A07     // Catch:{ all -> 0x05b7 }
            long r0 = r7.A01     // Catch:{ all -> 0x05b7 }
            int r8 = (r0 > r19 ? 1 : (r0 == r19 ? 0 : -1))
            if (r8 != 0) goto L_0x0453
            long r0 = r4.A01     // Catch:{ all -> 0x05b7 }
            r7.A01 = r0     // Catch:{ all -> 0x05b7 }
        L_0x0453:
            java.lang.String r15 = "FbHttpCacheDataSource"
            java.lang.String r12 = "Cache data source open spec(HTTP). Type:%s, Offset:%d, Length:%d, OpenLength:%d, Vid:%s, Key:%s, seq:%d"
            r0 = 7
            java.lang.Object[] r9 = new java.lang.Object[r0]     // Catch:{ all -> 0x05b7 }
            X.Bzs r14 = r4.A0I     // Catch:{ all -> 0x05b7 }
            r9[r11] = r14     // Catch:{ all -> 0x05b7 }
            long r0 = r6.A01     // Catch:{ all -> 0x05b7 }
            r6 = r18
            X.AnonymousClass3MX.A1S(r9, r6, r0)     // Catch:{ all -> 0x05b7 }
            java.lang.Long r8 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x05b7 }
            r0 = 2
            r9[r0] = r8     // Catch:{ all -> 0x05b7 }
            java.lang.Long r6 = java.lang.Long.valueOf(r29)     // Catch:{ all -> 0x05b7 }
            r0 = 3
            r9[r0] = r6     // Catch:{ all -> 0x05b7 }
            r0 = 4
            r9[r0] = r16     // Catch:{ all -> 0x05b7 }
            java.lang.String r1 = r7.A06     // Catch:{ all -> 0x05b7 }
            r0 = 5
            r9[r0] = r1     // Catch:{ all -> 0x05b7 }
            int r0 = r13.A07     // Catch:{ all -> 0x05b7 }
            X.C17890vO.A1H(r9, r0)     // Catch:{ all -> 0x05b7 }
            X.C25922Cog.A01(r15, r12, r9)     // Catch:{ all -> 0x05b7 }
            r4.A03 = r10     // Catch:{ all -> 0x05b7 }
            X.DRe r0 = r5.cache     // Catch:{ all -> 0x05b7 }
            boolean r0 = r0.enableCacheInstrumentation     // Catch:{ all -> 0x05b7 }
            if (r0 == 0) goto L_0x04b7
            X.CXX r7 = r4.A08     // Catch:{ all -> 0x05b7 }
            X.CTZ r0 = r4.A07     // Catch:{ all -> 0x05b7 }
            long r2 = r0.A00     // Catch:{ all -> 0x05b7 }
            java.lang.String r0 = "VideoRequestEvent.onOpenHttpDataStream"
            com.facebook.debug.tracer.Tracer.A00(r0)     // Catch:{ all -> 0x05b7 }
            int r0 = r7.A01     // Catch:{ all -> 0x04af }
            int r0 = r0 + 1
            r7.A01 = r0     // Catch:{ all -> 0x04af }
            long r0 = r7.A03     // Catch:{ all -> 0x04af }
            int r9 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r9 <= 0) goto L_0x04a4
            r7.A03 = r2     // Catch:{ all -> 0x04af }
        L_0x04a4:
            long r0 = r7.A02     // Catch:{ all -> 0x04af }
            long r2 = r2 + r29
            int r9 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r9 >= 0) goto L_0x04b4
            r7.A02 = r2     // Catch:{ all -> 0x04af }
            goto L_0x04b4
        L_0x04af:
            r0 = move-exception
            com.facebook.systrace.Systrace.A01()     // Catch:{ all -> 0x05b7 }
            throw r0     // Catch:{ all -> 0x05b7 }
        L_0x04b4:
            com.facebook.systrace.Systrace.A01()     // Catch:{ all -> 0x05b7 }
        L_0x04b7:
            X.DSC r3 = r4.A05     // Catch:{ all -> 0x05b7 }
            if (r3 == 0) goto L_0x055c
            boolean r0 = r3.A08     // Catch:{ all -> 0x05b7 }
            if (r0 != 0) goto L_0x055c
            r1 = 0
            int r0 = (r29 > r1 ? 1 : (r29 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0555
            r0 = r33
            int r0 = r0.A00     // Catch:{ all -> 0x05b7 }
            long r0 = (long) r0     // Catch:{ all -> 0x05b7 }
            int r2 = (r29 > r0 ? 1 : (r29 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x0555
            boolean r7 = r4.A0L     // Catch:{ Bx3 -> 0x0546 }
            boolean r0 = r5.enableVideoMemoryCache     // Catch:{ Bx3 -> 0x0546 }
            if (r0 == 0) goto L_0x0526
            X.ECn r1 = r33.A02()     // Catch:{ Bx3 -> 0x0546 }
            X.D9e r0 = new X.D9e     // Catch:{ Bx3 -> 0x0546 }
            r0.<init>(r1)     // Catch:{ Bx3 -> 0x0546 }
            r4.A02 = r0     // Catch:{ Bx3 -> 0x0546 }
        L_0x04df:
            X.CTZ r5 = r4.A07     // Catch:{ Bx3 -> 0x0546 }
            android.net.Uri r12 = r5.A04     // Catch:{ Bx3 -> 0x0546 }
            long r2 = r5.A00     // Catch:{ Bx3 -> 0x0546 }
            long r0 = r5.A02     // Catch:{ Bx3 -> 0x0546 }
            java.lang.String r10 = r5.A06     // Catch:{ Bx3 -> 0x0546 }
            int r9 = r5.A03     // Catch:{ Bx3 -> 0x0546 }
            X.CkW r7 = r5.A05     // Catch:{ Bx3 -> 0x0546 }
            X.Csd r5 = new X.Csd     // Catch:{ Bx3 -> 0x0546 }
            r19 = r5
            r20 = r12
            r21 = r7
            r22 = r10
            r23 = r17
            r24 = r9
            r25 = r2
            r27 = r0
            r19.<init>(r20, r21, r22, r23, r24, r25, r27, r29)     // Catch:{ Bx3 -> 0x0546 }
            X.E8Z r0 = r4.A02     // Catch:{ Bx3 -> 0x0546 }
            r0.CAk(r5)     // Catch:{ Bx3 -> 0x0546 }
            java.lang.String r7 = "Cache data sink open spec. Type:%s, Offset:%d, Length:%d, OpenLength:%d Vid:%s, Key:%s"
            r0 = 6
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ Bx3 -> 0x0546 }
            r3[r11] = r14     // Catch:{ Bx3 -> 0x0546 }
            long r0 = r5.A01     // Catch:{ Bx3 -> 0x0546 }
            r2 = r18
            X.AnonymousClass3MX.A1S(r3, r2, r0)     // Catch:{ Bx3 -> 0x0546 }
            X.AnonymousClass001.A1R(r8, r6, r3)     // Catch:{ Bx3 -> 0x0546 }
            r0 = 4
            r3[r0] = r16     // Catch:{ Bx3 -> 0x0546 }
            X.CTZ r0 = r4.A07     // Catch:{ Bx3 -> 0x0546 }
            java.lang.String r1 = r0.A06     // Catch:{ Bx3 -> 0x0546 }
            r0 = 5
            r3[r0] = r1     // Catch:{ Bx3 -> 0x0546 }
            X.C25922Cog.A01(r15, r7, r3)     // Catch:{ Bx3 -> 0x0546 }
            goto L_0x055c
        L_0x0526:
            X.ECn r20 = r33.A02()     // Catch:{ Bx3 -> 0x0546 }
            boolean r9 = r4.A0O     // Catch:{ Bx3 -> 0x0546 }
            int r5 = r4.A0E     // Catch:{ Bx3 -> 0x0546 }
            X.DSC r3 = r4.A05     // Catch:{ Bx3 -> 0x0546 }
            long r0 = r4.A0F     // Catch:{ Bx3 -> 0x0546 }
            X.D9f r2 = new X.D9f     // Catch:{ Bx3 -> 0x0546 }
            r19 = r2
            r21 = r3
            r22 = r5
            r23 = r0
            r25 = r9
            r26 = r7
            r19.<init>(r20, r21, r22, r23, r25, r26)     // Catch:{ Bx3 -> 0x0546 }
            r4.A02 = r2     // Catch:{ Bx3 -> 0x0546 }
            goto L_0x04df
        L_0x0546:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x05b7 }
            java.io.IOException r1 = X.C17880vN.A0f(r0)     // Catch:{ all -> 0x05b7 }
            goto L_0x0554
        L_0x0550:
            r1 = move-exception
            X.C25304Cd8.A00()     // Catch:{ all -> 0x05b7 }
        L_0x0554:
            throw r1     // Catch:{ all -> 0x05b7 }
        L_0x0555:
            r4.A03(r3)     // Catch:{ all -> 0x05b7 }
            r0 = r17
            r4.A05 = r0     // Catch:{ all -> 0x05b7 }
        L_0x055c:
            X.C25304Cd8.A00()     // Catch:{ all -> 0x0623 }
            goto L_0x05b1
        L_0x0560:
            r6 = move-exception
            X.ECk r2 = r4.A04     // Catch:{ all -> 0x05b7 }
            r2.close()     // Catch:{ all -> 0x05b7 }
            boolean r0 = r6 instanceof X.BPM     // Catch:{ all -> 0x05b7 }
            if (r0 == 0) goto L_0x05b6
            r3 = r6
            X.BPM r3 = (X.BPM) r3     // Catch:{ all -> 0x05b7 }
            int r1 = r3.responseCode     // Catch:{ all -> 0x05b7 }
            r0 = 416(0x1a0, float:5.83E-43)
            if (r1 != r0) goto L_0x05b6
            java.util.Map r1 = r2.BYJ()     // Catch:{ all -> 0x05b7 }
            boolean r0 = r5.enableCaseInsensitiveHttpResponseHeaderKey     // Catch:{ all -> 0x05b7 }
            long r0 = X.C25868Cnb.A00(r1, r0)     // Catch:{ all -> 0x05b7 }
            r4.A01 = r0     // Catch:{ all -> 0x05b7 }
            if (r8 == 0) goto L_0x0584
            r8.CLA(r9, r0)     // Catch:{ all -> 0x05b7 }
        L_0x0584:
            X.CTZ r8 = r4.A07     // Catch:{ all -> 0x05b7 }
            long r1 = r8.A01     // Catch:{ all -> 0x05b7 }
            int r0 = (r1 > r19 ? 1 : (r1 == r19 ? 0 : -1))
            if (r0 != 0) goto L_0x0596
            long r1 = r4.A01     // Catch:{ all -> 0x05b7 }
            r6 = 0
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x0596
            r8.A01 = r1     // Catch:{ all -> 0x05b7 }
        L_0x0596:
            java.lang.String r2 = "FbHttpCacheDataSource"
            java.lang.String r1 = "Returning length 0 after 416 response"
            java.lang.Object[] r0 = new java.lang.Object[r11]     // Catch:{ all -> 0x05b7 }
            java.lang.String r0 = java.lang.String.format(r1, r0)     // Catch:{ all -> 0x05b7 }
            android.util.Log.e(r2, r0)     // Catch:{ all -> 0x05b7 }
            boolean r0 = r5.enable416Logging     // Catch:{ all -> 0x05b7 }
            if (r0 == 0) goto L_0x05ac
            X.ECl r0 = r4.A06     // Catch:{ all -> 0x05b7 }
            r0.C9B(r3)     // Catch:{ all -> 0x05b7 }
        L_0x05ac:
            X.C25304Cd8.A00()     // Catch:{ all -> 0x0623 }
            r0 = 0
            goto L_0x05b2
        L_0x05b1:
            r0 = 1
        L_0x05b2:
            X.C25304Cd8.A00()
            return r0
        L_0x05b6:
            throw r6     // Catch:{ all -> 0x05b7 }
        L_0x05b7:
            r0 = move-exception
            X.C25304Cd8.A00()     // Catch:{ all -> 0x0623 }
            goto L_0x05c0
        L_0x05bc:
            r0 = move-exception
            com.facebook.systrace.Systrace.A01()     // Catch:{ all -> 0x0623 }
        L_0x05c0:
            throw r0     // Catch:{ all -> 0x0623 }
        L_0x05c1:
            boolean r0 = r5.alwaysPerformContentLengthUpdateFirst     // Catch:{ all -> 0x0623 }
            if (r0 == 0) goto L_0x061f
            X.ECn r3 = r33.A02()     // Catch:{ all -> 0x0623 }
            if (r3 == 0) goto L_0x05dc
            X.CTZ r0 = r4.A07     // Catch:{ all -> 0x0623 }
            java.lang.String r0 = r0.A06     // Catch:{ all -> 0x0623 }
            long r1 = r3.Bad(r0)     // Catch:{ all -> 0x0623 }
            r6 = -1
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x05dc
        L_0x05d9:
            r4.A01 = r1     // Catch:{ all -> 0x0623 }
            goto L_0x061f
        L_0x05dc:
            X.CTZ r2 = r4.A07     // Catch:{ all -> 0x0623 }
            android.net.Uri r9 = r2.A04     // Catch:{ all -> 0x0623 }
            long r0 = r2.A00     // Catch:{ all -> 0x0623 }
            java.lang.String r8 = r2.A06     // Catch:{ all -> 0x0623 }
            int r7 = r2.A03     // Catch:{ all -> 0x0623 }
            X.CkW r6 = r2.A05     // Catch:{ all -> 0x0623 }
            r23 = 0
            r27 = 0
            r29 = 1
            X.Csd r2 = new X.Csd     // Catch:{ all -> 0x0623 }
            r19 = r2
            r20 = r9
            r21 = r6
            r22 = r8
            r24 = r7
            r25 = r0
            r19.<init>(r20, r21, r22, r23, r24, r25, r27, r29)     // Catch:{ all -> 0x0623 }
            X.ECk r0 = r4.A04     // Catch:{ IOException -> 0x0618 }
            r0.CAj(r2)     // Catch:{ IOException -> 0x0618 }
            java.util.Map r1 = r0.BYJ()     // Catch:{ all -> 0x0623 }
            boolean r0 = r5.enableCaseInsensitiveHttpResponseHeaderKey     // Catch:{ all -> 0x0623 }
            long r1 = X.C25868Cnb.A00(r1, r0)     // Catch:{ all -> 0x0623 }
            if (r3 == 0) goto L_0x05d9
            X.CTZ r0 = r4.A07     // Catch:{ all -> 0x0623 }
            java.lang.String r0 = r0.A06     // Catch:{ all -> 0x0623 }
            r3.CLA(r0, r1)     // Catch:{ all -> 0x0623 }
            goto L_0x05d9
        L_0x0618:
            r1 = move-exception
            X.ECk r0 = r4.A04     // Catch:{ all -> 0x0623 }
            r0.close()     // Catch:{ all -> 0x0623 }
            throw r1     // Catch:{ all -> 0x0623 }
        L_0x061f:
            X.C25304Cd8.A00()
            return r18
        L_0x0623:
            r0 = move-exception
            X.C25304Cd8.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26692D9p.A04(boolean):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0105, code lost:
        if (r10.A06 > 0) goto L_0x0107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0147, code lost:
        if (r3 != false) goto L_0x0149;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long CAj(X.C26115Csd r37) {
        /*
            r36 = this;
            r20 = 0
            r5 = r36
            r6 = r37
            java.lang.String r14 = r6.A06     // Catch:{ IOException -> 0x01b1 }
            X.CZH r9 = r5.A0J     // Catch:{ IOException -> 0x01b1 }
            java.lang.String r7 = r9.A04     // Catch:{ IOException -> 0x01b1 }
            android.net.Uri r0 = r6.A04     // Catch:{ IOException -> 0x01b1 }
            r35 = r0
            boolean r13 = r5.A0M     // Catch:{ IOException -> 0x01b1 }
            X.DRp r4 = r5.A0K     // Catch:{ IOException -> 0x01b1 }
            boolean r2 = r4.useShortKey     // Catch:{ IOException -> 0x01b1 }
            boolean r1 = r4.splitLastSegmentCachekey     // Catch:{ IOException -> 0x01b1 }
            boolean r0 = r4.skipThumbnailCacheKey     // Catch:{ IOException -> 0x01b1 }
            r21 = r1
            r22 = r0
            r16 = r14
            r17 = r7
            r18 = r13
            r19 = r2
            r15 = r35
            java.lang.String r11 = X.C25922Cog.A00(r15, r16, r17, r18, r19, r20, r21, r22)     // Catch:{ IOException -> 0x01b1 }
            boolean r0 = r4.checkThumbnailCache     // Catch:{ IOException -> 0x01b1 }
            r15 = 1
            if (r0 == 0) goto L_0x006e
            X.Cqn r0 = r5.A0H     // Catch:{ IOException -> 0x01b1 }
            X.ECn r29 = r0.A02()     // Catch:{ IOException -> 0x01b1 }
            long r2 = r6.A03     // Catch:{ IOException -> 0x01b1 }
            long r0 = r6.A02     // Catch:{ IOException -> 0x01b1 }
            r30 = r11
            r31 = r2
            r33 = r0
            boolean r8 = r29.BeB(r30, r31, r33)     // Catch:{ IOException -> 0x01b1 }
            if (r8 != 0) goto L_0x006e
            boolean r12 = r4.useShortKey     // Catch:{ IOException -> 0x01b1 }
            boolean r10 = r4.splitLastSegmentCachekey     // Catch:{ IOException -> 0x01b1 }
            boolean r8 = r4.skipThumbnailCacheKey     // Catch:{ IOException -> 0x01b1 }
            r21 = r35
            r22 = r14
            r23 = r7
            r24 = r13
            r25 = r12
            r26 = r15
            r27 = r10
            r28 = r8
            java.lang.String r30 = X.C25922Cog.A00(r21, r22, r23, r24, r25, r26, r27, r28)     // Catch:{ IOException -> 0x01b1 }
            r12 = 2
            long r0 = r0 / r12
            r33 = r0
            boolean r0 = r29.BeB(r30, r31, r33)     // Catch:{ IOException -> 0x01b1 }
            if (r0 == 0) goto L_0x006e
            r11 = r30
        L_0x006e:
            r12 = 2
            X.CTZ r0 = r5.A07     // Catch:{ IOException -> 0x01b1 }
            boolean r0 = X.AnonymousClass000.A1X(r0)
            X.C26056CrS.A03(r0)     // Catch:{ IOException -> 0x01b1 }
            X.CTZ r0 = new X.CTZ     // Catch:{ IOException -> 0x01b1 }
            r0.<init>(r6, r11)     // Catch:{ IOException -> 0x01b1 }
            r5.A07 = r0     // Catch:{ IOException -> 0x01b1 }
            X.DRe r0 = r4.cache     // Catch:{ IOException -> 0x01b1 }
            boolean r0 = r0.enableCacheInstrumentation     // Catch:{ IOException -> 0x01b1 }
            if (r0 == 0) goto L_0x00f4
            java.lang.String r0 = r35.toString()     // Catch:{ IOException -> 0x01b1 }
            X.CXX r10 = new X.CXX     // Catch:{ IOException -> 0x01b1 }
            r10.<init>(r9, r0)     // Catch:{ IOException -> 0x01b1 }
            r5.A08 = r10     // Catch:{ IOException -> 0x01b1 }
            X.Cqn r0 = r5.A0H     // Catch:{ IOException -> 0x01b1 }
            X.ECn r8 = r0.A02()     // Catch:{ IOException -> 0x01b1 }
            X.CTZ r9 = r5.A07     // Catch:{ IOException -> 0x01b1 }
            java.lang.String r0 = "VideoRequestEvent.onOpen"
            com.facebook.debug.tracer.Tracer.A00(r0)     // Catch:{ IOException -> 0x01b1 }
            long r2 = r9.A02     // Catch:{ all -> 0x01ac }
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x01ac }
            r10.A06 = r0     // Catch:{ all -> 0x01ac }
            long r0 = r9.A01     // Catch:{ all -> 0x01ac }
            r16 = -1
            int r13 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r13 == 0) goto L_0x00af
            long r16 = r0 + r2
        L_0x00af:
            java.lang.Long r0 = java.lang.Long.valueOf(r16)     // Catch:{ all -> 0x01ac }
            r10.A05 = r0     // Catch:{ all -> 0x01ac }
            java.lang.String r0 = r9.A06     // Catch:{ all -> 0x01ac }
            r10.A07 = r0     // Catch:{ all -> 0x01ac }
            java.util.NavigableSet r3 = r8.BNz(r0)     // Catch:{ all -> 0x01ac }
            boolean r0 = X.AnonymousClass000.A1W(r3)
            r10.A09 = r0     // Catch:{ all -> 0x01ac }
            r0 = -1
            if (r3 == 0) goto L_0x00e1
            java.lang.Object r2 = r3.first()     // Catch:{ all -> 0x01ac }
            X.DSC r2 = (X.DSC) r2     // Catch:{ all -> 0x01ac }
            long r8 = r2.A05     // Catch:{ all -> 0x01ac }
            java.lang.Object r13 = r3.last()     // Catch:{ all -> 0x01ac }
            X.DSC r13 = (X.DSC) r13     // Catch:{ all -> 0x01ac }
            long r2 = r13.A04     // Catch:{ all -> 0x01ac }
            int r14 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r14 == 0) goto L_0x00de
            long r0 = r13.A05     // Catch:{ all -> 0x01ac }
            long r0 = r0 + r2
        L_0x00de:
            r2 = r0
            r0 = r8
            goto L_0x00e3
        L_0x00e1:
            r2 = -1
        L_0x00e3:
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x01ac }
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x01ac }
            android.util.Pair r0 = android.util.Pair.create(r1, r0)     // Catch:{ all -> 0x01ac }
            r10.A04 = r0     // Catch:{ all -> 0x01ac }
            com.facebook.systrace.Systrace.A01()     // Catch:{ IOException -> 0x01b1 }
        L_0x00f4:
            X.CkW r10 = r6.A05     // Catch:{ IOException -> 0x01b1 }
            if (r10 == 0) goto L_0x0107
            X.DRe r0 = r4.cache     // Catch:{ IOException -> 0x01b1 }
            boolean r0 = r0.enableInitSegmentFix     // Catch:{ IOException -> 0x01b1 }
            if (r0 == 0) goto L_0x0107
            int r0 = r10.A07     // Catch:{ IOException -> 0x01b1 }
            if (r0 > 0) goto L_0x0107
            int r1 = r10.A06     // Catch:{ IOException -> 0x01b1 }
            r0 = 1
            if (r1 <= 0) goto L_0x0108
        L_0x0107:
            r0 = 0
        L_0x0108:
            r5.A04(r0)     // Catch:{ IOException -> 0x01b1 }
            java.lang.String r9 = "FbHttpCacheDataSource"
            java.lang.String r8 = "Cache data source open spec. Type:%s, Position:%d/%d, Length:%d, Vid:%s, Key:%s"
            r0 = 6
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ IOException -> 0x01b1 }
            X.Bzs r2 = r5.A0I     // Catch:{ IOException -> 0x01b1 }
            r3[r20] = r2     // Catch:{ IOException -> 0x01b1 }
            long r0 = r6.A03     // Catch:{ IOException -> 0x01b1 }
            X.AnonymousClass3MX.A1S(r3, r15, r0)     // Catch:{ IOException -> 0x01b1 }
            long r0 = r6.A01     // Catch:{ IOException -> 0x01b1 }
            X.AnonymousClass3MX.A1S(r3, r12, r0)     // Catch:{ IOException -> 0x01b1 }
            long r0 = r6.A02     // Catch:{ IOException -> 0x01b1 }
            X.C17890vO.A1O(r3, r0)     // Catch:{ IOException -> 0x01b1 }
            X.C72453Mb.A1T(r7, r11, r3)     // Catch:{ IOException -> 0x01b1 }
            X.C25922Cog.A01(r9, r8, r3)     // Catch:{ IOException -> 0x01b1 }
            com.facebook.video.heroplayer.setting.FbAutogeneratedSettings r3 = r4.autogenSettings     // Catch:{ IOException -> 0x01b1 }
            if (r3 == 0) goto L_0x0149
            boolean r3 = r3.enableSloHttpHeaderLogging     // Catch:{ IOException -> 0x01b1 }
            if (r3 == 0) goto L_0x0149
            if (r7 == 0) goto L_0x0152
            X.Cgv r8 = X.C25499Cgv.A01     // Catch:{ IOException -> 0x01b1 }
            monitor-enter(r8)     // Catch:{ IOException -> 0x01b1 }
            android.util.LruCache r3 = r8.A00     // Catch:{ all -> 0x0144 }
            java.lang.Object r3 = r3.get(r7)     // Catch:{ all -> 0x0144 }
            boolean r3 = X.AnonymousClass000.A1W(r3)
            monitor-exit(r8)     // Catch:{ IOException -> 0x01b1 }
            goto L_0x0147
        L_0x0144:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ IOException -> 0x01b1 }
            goto L_0x01b0
        L_0x0147:
            if (r3 == 0) goto L_0x0152
        L_0x0149:
            r10 = 0
            r8 = -1
            int r3 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r3 != 0) goto L_0x0195
            goto L_0x018e
        L_0x0152:
            if (r10 == 0) goto L_0x0155
            goto L_0x015b
        L_0x0155:
            X.C25868Cnb.A02(r6)     // Catch:{ IOException -> 0x01b1 }
            if (r10 == 0) goto L_0x0149
            goto L_0x0165
        L_0x015b:
            java.util.Map r8 = r10.A0N     // Catch:{ IOException -> 0x01b1 }
            java.lang.String r3 = "x-fb-qpl-ec"
            boolean r3 = r8.containsKey(r3)     // Catch:{ IOException -> 0x01b1 }
            if (r3 == 0) goto L_0x0155
        L_0x0165:
            java.util.Map r9 = r10.A0N     // Catch:{ IOException -> 0x01b1 }
            java.lang.String r3 = "x-fb-qpl-ec"
            java.lang.Object r8 = r9.get(r3)     // Catch:{ IOException -> 0x01b1 }
            if (r8 == 0) goto L_0x0149
            r9.clear()     // Catch:{ IOException -> 0x01b1 }
            java.util.Iterator r6 = X.AnonymousClass000.A15(r9)     // Catch:{ IOException -> 0x01b1 }
        L_0x0176:
            boolean r3 = r6.hasNext()     // Catch:{ IOException -> 0x01b1 }
            if (r3 == 0) goto L_0x0184
            java.util.Map$Entry r3 = X.AnonymousClass000.A16(r6)     // Catch:{ IOException -> 0x01b1 }
            X.C108985cd.A1T(r3, r9)     // Catch:{ IOException -> 0x01b1 }
            goto L_0x0176
        L_0x0184:
            X.Cgv r6 = X.C25499Cgv.A01     // Catch:{ IOException -> 0x01b1 }
            monitor-enter(r6)     // Catch:{ IOException -> 0x01b1 }
            android.util.LruCache r3 = r6.A00     // Catch:{ all -> 0x01a9 }
            r3.put(r7, r8)     // Catch:{ all -> 0x01a9 }
            monitor-exit(r6)     // Catch:{ IOException -> 0x01b1 }
            goto L_0x0149
        L_0x018e:
            long r6 = r5.A01     // Catch:{ IOException -> 0x01b1 }
            int r3 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r3 <= 0) goto L_0x0195
            return r6
        L_0x0195:
            boolean r3 = r4.enableUpdateProgressiveContentLengthFromCache     // Catch:{ IOException -> 0x01b1 }
            if (r3 == 0) goto L_0x01a8
            int r3 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r3 != 0) goto L_0x01a8
            X.Bzs r3 = X.C24357Bzs.PROGRESSIVE     // Catch:{ IOException -> 0x01b1 }
            if (r2 != r3) goto L_0x01a8
            long r6 = r5.A00     // Catch:{ IOException -> 0x01b1 }
            int r2 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r2 <= 0) goto L_0x01a8
            return r6
        L_0x01a8:
            return r0
        L_0x01a9:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ IOException -> 0x01b1 }
            goto L_0x01b0
        L_0x01ac:
            r0 = move-exception
            com.facebook.systrace.Systrace.A01()     // Catch:{ IOException -> 0x01b1 }
        L_0x01b0:
            throw r0     // Catch:{ IOException -> 0x01b1 }
        L_0x01b1:
            r2 = move-exception
            X.DRp r0 = r5.A0K
            X.DRe r0 = r0.cache
            boolean r0 = r0.enableCacheInstrumentation
            if (r0 == 0) goto L_0x01cd
            X.CXX r1 = r5.A08
            java.lang.String r0 = "VideoRequestEvent.onException"
            com.facebook.debug.tracer.Tracer.A00(r0)
            r0 = 1
            r1.A08 = r0     // Catch:{ all -> 0x01c5 }
            goto L_0x01ca
        L_0x01c5:
            r0 = move-exception
            com.facebook.systrace.Systrace.A01()
            throw r0
        L_0x01ca:
            com.facebook.systrace.Systrace.A01()
        L_0x01cd:
            X.ECl r0 = r5.A06
            if (r0 == 0) goto L_0x01d4
            r0.C9B(r2)
        L_0x01d4:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26692D9p.CAj(X.Csd):long");
    }

    /* JADX WARNING: type inference failed for: r2v5, types: [X.D9y, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0092, code lost:
        if (r0 > -1) goto L_0x0094;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void close() {
        /*
            r26 = this;
            r7 = r26
            X.DRp r0 = r7.A0K
            X.DRe r0 = r0.cache
            boolean r0 = r0.enableCacheInstrumentation
            if (r0 == 0) goto L_0x00b5
            X.D9y r2 = X.C26700D9y.A04
            if (r2 != 0) goto L_0x0015
            X.D9y r2 = new X.D9y
            r2.<init>()
            X.C26700D9y.A04 = r2
        L_0x0015:
            X.CXX r10 = r7.A08
            java.lang.String r0 = "CacheInstrumentationListener.onRequestComplete"
            com.facebook.debug.tracer.Tracer.A00(r0)
            X.CiM r9 = r2.A01     // Catch:{ all -> 0x00ad }
            if (r9 == 0) goto L_0x00b2
            boolean r0 = r10.A08     // Catch:{ all -> 0x00ad }
            if (r0 != 0) goto L_0x00b2
            boolean r0 = r10.A09     // Catch:{ all -> 0x00ad }
            if (r0 == 0) goto L_0x0067
            int r1 = r10.A01     // Catch:{ all -> 0x00ad }
            if (r1 != 0) goto L_0x0057
            X.Byy r16 = X.C24301Byy.CACHE_HIT     // Catch:{ all -> 0x00ad }
        L_0x002e:
            boolean r0 = r2.A03     // Catch:{ all -> 0x00ad }
            if (r0 != 0) goto L_0x00b2
            java.lang.String r8 = r2.A02     // Catch:{ all -> 0x00ad }
            X.CZH r0 = r10.A0A     // Catch:{ all -> 0x00ad }
            java.lang.String r6 = r0.A02     // Catch:{ all -> 0x00ad }
            X.ByY r0 = r0.A00     // Catch:{ all -> 0x00ad }
            java.lang.String r19 = r0.name()     // Catch:{ all -> 0x00ad }
            java.lang.String r5 = r10.A07     // Catch:{ all -> 0x00ad }
            java.lang.String r4 = r10.A0B     // Catch:{ all -> 0x00ad }
            long r2 = r10.A03     // Catch:{ all -> 0x00ad }
            r14 = r2
            r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r0 >= 0) goto L_0x0075
            long r0 = r10.A02     // Catch:{ all -> 0x00ad }
            r12 = -1
            int r11 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r11 <= 0) goto L_0x0075
            goto L_0x007b
        L_0x0057:
            int r0 = r10.A00     // Catch:{ all -> 0x00ad }
            if (r0 != 0) goto L_0x0060
            if (r1 <= 0) goto L_0x0072
            X.Byy r16 = X.C24301Byy.CACHE_PARTIAL_MISS     // Catch:{ all -> 0x00ad }
            goto L_0x002e
        L_0x0060:
            if (r0 <= 0) goto L_0x0072
            if (r1 <= 0) goto L_0x0072
            X.Byy r16 = X.C24301Byy.CACHE_PARTIAL_HIT     // Catch:{ all -> 0x00ad }
            goto L_0x002e
        L_0x0067:
            int r0 = r10.A00     // Catch:{ all -> 0x00ad }
            if (r0 != 0) goto L_0x0072
            int r0 = r10.A01     // Catch:{ all -> 0x00ad }
            if (r0 <= 0) goto L_0x0072
            X.Byy r16 = X.C24301Byy.CACHE_MISS     // Catch:{ all -> 0x00ad }
            goto L_0x002e
        L_0x0072:
            X.Byy r16 = X.C24301Byy.CACHE_UNKNOWN     // Catch:{ all -> 0x00ad }
            goto L_0x002e
        L_0x0075:
            java.lang.Long r0 = r10.A06     // Catch:{ all -> 0x00ad }
            long r2 = r0.longValue()     // Catch:{ all -> 0x00ad }
        L_0x007b:
            r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r0 >= 0) goto L_0x0085
            goto L_0x008c
        L_0x0085:
            java.lang.Long r0 = r10.A05     // Catch:{ all -> 0x00ad }
            long r0 = r0.longValue()     // Catch:{ all -> 0x00ad }
            goto L_0x0094
        L_0x008c:
            long r0 = r10.A02     // Catch:{ all -> 0x00ad }
            r12 = -1
            int r11 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r11 <= 0) goto L_0x0085
        L_0x0094:
            android.util.Pair r15 = r10.A04     // Catch:{ all -> 0x00ad }
            X.DRq r14 = new X.DRq     // Catch:{ all -> 0x00ad }
            r22 = r2
            r24 = r0
            r20 = r5
            r21 = r4
            r18 = r6
            r17 = r8
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r24)     // Catch:{ all -> 0x00ad }
            java.util.List r0 = r9.A01     // Catch:{ all -> 0x00ad }
            r0.add(r14)     // Catch:{ all -> 0x00ad }
            goto L_0x00b2
        L_0x00ad:
            r0 = move-exception
            com.facebook.systrace.Systrace.A01()
            throw r0
        L_0x00b2:
            com.facebook.systrace.Systrace.A01()
        L_0x00b5:
            r7.A02()
            r0 = 0
            r7.A07 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26692D9p.close():void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(13:17|(1:25)|26|(2:28|(3:30|31|32))|43|44|(3:46|47|48)|49|(2:57|58)|59|60|(3:62|(1:64)|65)|66) */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0097, code lost:
        if (r4 != -1) goto L_0x0099;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x00d6 */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00da A[Catch:{ IOException -> 0x00e3, all -> 0x00f7 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int read(byte[] r19, int r20, int r21) {
        /*
            r18 = this;
            r7 = r18
            X.Csd r8 = r7.A00()     // Catch:{ IOException -> 0x00e3 }
            boolean r0 = r7.A0C     // Catch:{ IOException -> 0x00e3 }
            r6 = 0
            r9 = 1
            if (r0 != 0) goto L_0x001f
            X.ECl r5 = r7.A06     // Catch:{ IOException -> 0x00e3 }
            if (r5 == 0) goto L_0x001d
            long r3 = r7.A01     // Catch:{ IOException -> 0x00e3 }
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1P(r0)
            r5.C9E(r8, r7, r9, r0)     // Catch:{ IOException -> 0x00e3 }
        L_0x001d:
            r7.A0C = r9     // Catch:{ IOException -> 0x00e3 }
        L_0x001f:
            X.E9Q r0 = r7.A03     // Catch:{ IOException -> 0x00e3 }
            r5 = -1
            if (r0 != 0) goto L_0x0034
            java.lang.String r3 = "FbHttpCacheDataSource"
            java.lang.String r2 = "Trying to read when datasource isn't set. cache-only: %b"
            java.lang.Object[] r1 = new java.lang.Object[r9]     // Catch:{ IOException -> 0x00e3 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)     // Catch:{ IOException -> 0x00e3 }
            r1[r6] = r0     // Catch:{ IOException -> 0x00e3 }
            X.C25922Cog.A01(r3, r2, r1)     // Catch:{ IOException -> 0x00e3 }
            return r5
        L_0x0034:
            r14 = 0
            r10 = r19
            r9 = r20
            r12 = r21
            int r4 = r0.read(r10, r9, r12)     // Catch:{ IOException -> 0x00e3 }
            if (r4 <= 0) goto L_0x0085
            long r2 = r7.A0B     // Catch:{ IOException -> 0x00e3 }
            long r0 = (long) r4     // Catch:{ IOException -> 0x00e3 }
            long r2 = r2 + r0
            r7.A0B = r2     // Catch:{ IOException -> 0x00e3 }
            X.DRp r11 = r7.A0K     // Catch:{ IOException -> 0x00e3 }
            X.DRe r0 = r11.cache     // Catch:{ IOException -> 0x00e3 }
            long r0 = r0.skipDeadSpanLockThresholdMs     // Catch:{ IOException -> 0x00e3 }
            int r13 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r13 <= 0) goto L_0x006e
            X.E9Q r1 = r7.A03     // Catch:{ IOException -> 0x00e3 }
            X.ECk r0 = r7.A04     // Catch:{ IOException -> 0x00e3 }
            if (r1 != r0) goto L_0x006e
            X.DSC r13 = r7.A05     // Catch:{ IOException -> 0x00e3 }
            if (r13 == 0) goto L_0x006e
            long r0 = r7.A0A     // Catch:{ IOException -> 0x00e3 }
            long r16 = r2 - r0
            r14 = 5120(0x1400, double:2.5296E-320)
            int r0 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r0 <= 0) goto L_0x006e
            r7.A0A = r2     // Catch:{ IOException -> 0x00e3 }
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IOException -> 0x00e3 }
            r13.A09 = r0     // Catch:{ IOException -> 0x00e3 }
        L_0x006e:
            int r11 = r11.numOfBytesBeforeLoaderThreadSleep     // Catch:{ IOException -> 0x00e3 }
            if (r11 <= 0) goto L_0x0099
            long r2 = r7.A0B     // Catch:{ IOException -> 0x00e3 }
            long r0 = r7.A09     // Catch:{ IOException -> 0x00e3 }
            long r13 = r2 - r0
            long r0 = (long) r11     // Catch:{ IOException -> 0x00e3 }
            int r11 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r11 < 0) goto L_0x0099
            r7.A09 = r2     // Catch:{ IOException -> 0x00e3 }
            r0 = 1
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x0085 }
            goto L_0x0099
        L_0x0085:
            if (r4 != r5) goto L_0x0096
            boolean r0 = r7.A04(r6)     // Catch:{ IOException -> 0x00e3 }
            if (r0 == 0) goto L_0x00e2
            X.E9Q r0 = r7.A03     // Catch:{ IOException -> 0x00e3 }
            int r4 = r0.read(r10, r9, r12)     // Catch:{ IOException -> 0x00e3 }
            if (r4 != r5) goto L_0x0096
            return r4
        L_0x0096:
            r0 = 0
            if (r4 == r5) goto L_0x009a
        L_0x0099:
            r0 = 1
        L_0x009a:
            X.C26056CrS.A03(r0)     // Catch:{ IOException -> 0x00e3 }
            X.CTZ r5 = r7.A07     // Catch:{ IOException -> 0x00e3 }
            long r2 = r5.A01     // Catch:{ IOException -> 0x00e3 }
            r11 = -1
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r0 == 0) goto L_0x00b6
            long r0 = (long) r4
            long r2 = r2 - r0
            r11 = 0
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1Q(r0)
            X.C26056CrS.A03(r0)     // Catch:{ IOException -> 0x00e3 }
            r5.A01 = r2     // Catch:{ IOException -> 0x00e3 }
        L_0x00b6:
            long r0 = r5.A00     // Catch:{ IOException -> 0x00e3 }
            long r2 = (long) r4     // Catch:{ IOException -> 0x00e3 }
            long r0 = r0 + r2
            r5.A00 = r0     // Catch:{ IOException -> 0x00e3 }
            long r0 = r5.A02     // Catch:{ IOException -> 0x00e3 }
            long r0 = r0 + r2
            r5.A02 = r0     // Catch:{ IOException -> 0x00e3 }
            X.E9Q r0 = r7.A03     // Catch:{ IOException -> 0x00e3 }
            X.ECk r2 = r7.A04     // Catch:{ IOException -> 0x00e3 }
            if (r0 != r2) goto L_0x00d6
            X.E8Z r1 = r7.A02     // Catch:{ IOException -> 0x00e3 }
            if (r1 == 0) goto L_0x00d6
            X.DSC r0 = r7.A05     // Catch:{ IOException -> 0x00e3 }
            if (r0 == 0) goto L_0x00d6
            boolean r0 = r0.A08     // Catch:{ IOException -> 0x00e3 }
            if (r0 != 0) goto L_0x00d6
            r1.write(r10, r9, r4)     // Catch:{ IOException -> 0x00d6 }
        L_0x00d6:
            X.ECl r1 = r7.A06     // Catch:{ IOException -> 0x00e3 }
            if (r1 == 0) goto L_0x00e2
            X.E9Q r0 = r7.A03     // Catch:{ IOException -> 0x00e3 }
            if (r0 != r2) goto L_0x00df
            r6 = 1
        L_0x00df:
            r1.Bn4(r8, r7, r4, r6)     // Catch:{ IOException -> 0x00e3 }
        L_0x00e2:
            return r4
        L_0x00e3:
            r2 = move-exception
            X.DRp r0 = r7.A0K
            X.DRe r0 = r0.cache
            boolean r0 = r0.enableCacheInstrumentation
            if (r0 == 0) goto L_0x00ff
            X.CXX r1 = r7.A08
            java.lang.String r0 = "VideoRequestEvent.onException"
            com.facebook.debug.tracer.Tracer.A00(r0)
            r0 = 1
            r1.A08 = r0     // Catch:{ all -> 0x00f7 }
            goto L_0x00fc
        L_0x00f7:
            r0 = move-exception
            com.facebook.systrace.Systrace.A01()
            throw r0
        L_0x00fc:
            com.facebook.systrace.Systrace.A01()
        L_0x00ff:
            X.ECl r0 = r7.A06
            if (r0 == 0) goto L_0x0106
            r0.C9B(r2)
        L_0x0106:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26692D9p.read(byte[], int, int):int");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.D9l, X.BPF] */
    public C26692D9p(C28651ECk eCk, ECl eCl, C26029Cqn cqn, C24357Bzs bzs, CZH czh, C27066DRp dRp, AtomicBoolean atomicBoolean, int i, long j, boolean z, boolean z2, boolean z3) {
        this.A0H = cqn;
        this.A0J = czh;
        this.A04 = eCk;
        this.A0G = new C26688D9l(false);
        this.A02 = null;
        this.A06 = eCl;
        this.A01 = 0;
        this.A00 = 0;
        this.A0D = i;
        this.A0N = z;
        this.A0M = z2;
        this.A0K = dRp;
        this.A0P = atomicBoolean;
        this.A0I = bzs;
        this.A0O = dRp.useBufferedCacheDataSink;
        this.A0E = dRp.bufferedCacheDataSinkSize;
        this.A0L = z3;
        this.A0F = j;
    }

    public void BBr(C28570E8b e8b) {
        C26056CrS.A01(e8b);
        if (e8b instanceof ECl) {
            this.A06 = (ECl) e8b;
        } else {
            this.A06 = new C26729DBg(e8b);
        }
    }
}
