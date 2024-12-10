package X;

import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.os.Handler;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class DE3 implements EAK, E98, E4Z {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public long A06;
    public EAJ A07;
    public C26045Cr9 A08;
    public TimeUnit A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public C24863CNg A0E;
    public final C25639CjS A0F;
    public final C25742ClC A0G;
    public final CNN A0H;
    public final C28656ECq A0I;
    public final C26246Cvk A0J;
    public volatile C25083CWt A0K;

    public void A00() {
        synchronized (this.A0G) {
            C25083CWt cWt = this.A0K;
            this.A0K = null;
            if (cWt != null) {
                EGLSurface eGLSurface = cWt.A00;
                if (eGLSurface != EGL14.EGL_NO_SURFACE) {
                    EGL14.eglDestroySurface(cWt.A01.A04, eGLSurface);
                }
                cWt.A00 = EGL14.EGL_NO_SURFACE;
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:25|26|27|28|29|30|31) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0065 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BCi(X.EAJ r9) {
        /*
            r8 = this;
            r8.A07 = r9
            r0 = 0
            r8.A0B = r0
            if (r9 == 0) goto L_0x0019
            X.CNL r0 = r9.BZy()
            X.Cgx r2 = r0.A01
            X.ClC r6 = r8.A0G
            android.graphics.SurfaceTexture r1 = r6.A05
            if (r1 != 0) goto L_0x001a
            android.view.Surface r1 = r6.A00()
            if (r1 != 0) goto L_0x001a
        L_0x0019:
            return
        L_0x001a:
            java.util.HashMap r5 = X.C25500Cgx.A01
            monitor-enter(r5)
            java.lang.Object r0 = r5.remove(r1)     // Catch:{ all -> 0x0095 }
            X.DE3 r0 = (X.DE3) r0     // Catch:{ all -> 0x0095 }
            if (r0 == 0) goto L_0x0028
            r0.A00()     // Catch:{ all -> 0x0095 }
        L_0x0028:
            r5.put(r1, r8)     // Catch:{ all -> 0x0095 }
            X.CNL r2 = r2.A00     // Catch:{ all -> 0x0095 }
            monitor-enter(r6)     // Catch:{ all -> 0x0095 }
            android.view.Surface r7 = r6.A00()     // Catch:{ all -> 0x0092 }
            X.C28111Yx.A02(r7)     // Catch:{ all -> 0x0092 }
            boolean r0 = r7.isValid()     // Catch:{ all -> 0x0092 }
            if (r0 == 0) goto L_0x008f
            X.EAJ r0 = r8.A07     // Catch:{ all -> 0x0092 }
            if (r0 == 0) goto L_0x0070
            X.Ct3 r0 = r0.BR3()     // Catch:{ all -> 0x0092 }
            int r0 = r0.A00     // Catch:{ all -> 0x0092 }
            r0 = r0 & 32
            if (r0 == 0) goto L_0x0070
            int r1 = r8.A00     // Catch:{ all -> 0x0092 }
            r0 = 7
            if (r1 == r0) goto L_0x0070
            r3 = 5
            X.EAJ r0 = r2.A00     // Catch:{ all -> 0x0092 }
            X.Ct3 r0 = r0.BR4()     // Catch:{ all -> 0x0092 }
            java.lang.Object r2 = r0.A07     // Catch:{ all -> 0x0092 }
            monitor-enter(r2)     // Catch:{ all -> 0x0092 }
            X.BRk r4 = new X.BRk     // Catch:{ all -> 0x006d }
            r4.<init>(r0)     // Catch:{ all -> 0x006d }
            X.Ct3 r1 = r4.A01     // Catch:{ all -> 0x006d }
            android.opengl.EGLConfig r0 = r1.A02     // Catch:{ all -> 0x006d }
            android.opengl.EGLConfig r0 = X.C26140Ct3.A01(r1, r3)     // Catch:{ RuntimeException -> 0x0065 }
        L_0x0065:
            android.opengl.EGLSurface r0 = X.C26140Ct3.A02(r0, r7, r1)     // Catch:{ all -> 0x006d }
            r4.A00 = r0     // Catch:{ all -> 0x006d }
            monitor-exit(r2)     // Catch:{ all -> 0x006d }
            goto L_0x008d
        L_0x006d:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x006d }
            goto L_0x008c
        L_0x0070:
            X.EAJ r0 = r2.A00     // Catch:{ all -> 0x0092 }
            X.Ct3 r0 = r0.BR3()     // Catch:{ all -> 0x0092 }
            java.lang.Object r2 = r0.A07     // Catch:{ all -> 0x0092 }
            monitor-enter(r2)     // Catch:{ all -> 0x0092 }
            X.BRk r4 = new X.BRk     // Catch:{ all -> 0x008a }
            r4.<init>(r0)     // Catch:{ all -> 0x008a }
            X.Ct3 r1 = r4.A01     // Catch:{ all -> 0x008a }
            android.opengl.EGLConfig r0 = r1.A02     // Catch:{ all -> 0x008a }
            android.opengl.EGLSurface r0 = X.C26140Ct3.A02(r0, r7, r1)     // Catch:{ all -> 0x008a }
            r4.A00 = r0     // Catch:{ all -> 0x008a }
            monitor-exit(r2)     // Catch:{ all -> 0x008a }
            goto L_0x008d
        L_0x008a:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x008a }
        L_0x008c:
            throw r0     // Catch:{ all -> 0x0092 }
        L_0x008d:
            r8.A0K = r4     // Catch:{ all -> 0x0092 }
        L_0x008f:
            monitor-exit(r6)     // Catch:{ all -> 0x0092 }
            monitor-exit(r5)
            return
        L_0x0092:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0092 }
            throw r0     // Catch:{ all -> 0x0095 }
        L_0x0095:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DE3.BCi(X.EAJ):void");
    }

    public void BIY() {
        Handler handler;
        EAJ eaj = this.A07;
        this.A07 = null;
        this.A0B = false;
        if (eaj != null) {
            eaj.BZy();
            C25742ClC clC = this.A0G;
            Object obj = clC.A05;
            if (!(obj == null && (obj = clC.A00()) == null)) {
                HashMap hashMap = C25500Cgx.A01;
                synchronized (hashMap) {
                    if (equals((DE3) hashMap.get(obj))) {
                        hashMap.remove(obj);
                    }
                    A00();
                }
            }
        }
        C26045Cr9 cr9 = this.A08;
        if (cr9 != null && (handler = cr9.A07.A01) != null) {
            handler.removeMessages(1, this);
        }
    }

    public String BR9() {
        return "GlSurfaceOutput";
    }

    public Object BU8() {
        return this.A0G;
    }

    public int BVt() {
        EAJ eaj = this.A07;
        if (eaj == null || (eaj.BR3().A00 & 32) == 0) {
            return 3;
        }
        return this.A02;
    }

    public int BVx() {
        int i = this.A0G.A02;
        int i2 = 1;
        if (i != 1) {
            i2 = 3;
            if (i != 3) {
                i2 = 4;
                if (i == 4) {
                    return i2;
                }
                return 0;
            }
        }
        return i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0047, code lost:
        if (r8 <= r1) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0059, code lost:
        if (r5.convert(r1, r3) >= 0) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x006e, code lost:
        if (r8 >= r1) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0070, code lost:
        r0 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x005f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean Beb(X.EA3 r11) {
        /*
            r10 = this;
            X.ClC r4 = r10.A0G
            monitor-enter(r4)
            X.CWt r0 = r10.A0K     // Catch:{ all -> 0x0077 }
            if (r0 == 0) goto L_0x0074
            boolean r0 = r4.A07     // Catch:{ all -> 0x0072 }
            if (r0 == 0) goto L_0x0074
            android.view.Surface r0 = r4.A06     // Catch:{ all -> 0x0072 }
            if (r0 != 0) goto L_0x0013
            android.graphics.SurfaceTexture r0 = r4.A05     // Catch:{ all -> 0x0072 }
            if (r0 == 0) goto L_0x0074
        L_0x0013:
            long r8 = r11.BaR()     // Catch:{ all -> 0x0077 }
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ all -> 0x0077 }
            r6 = 0
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x0074
            java.util.concurrent.TimeUnit r3 = r10.A09     // Catch:{ all -> 0x0077 }
            if (r3 == 0) goto L_0x002e
            long r1 = r10.A06     // Catch:{ all -> 0x0077 }
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x002e
            long r1 = r5.convert(r1, r3)     // Catch:{ all -> 0x0077 }
            goto L_0x0030
        L_0x002e:
            r1 = -1
        L_0x0030:
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0049
            java.util.concurrent.TimeUnit r3 = r10.A09     // Catch:{ all -> 0x0077 }
            if (r3 == 0) goto L_0x0043
            long r1 = r10.A05     // Catch:{ all -> 0x0077 }
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x0043
            long r1 = r5.convert(r1, r3)     // Catch:{ all -> 0x0077 }
            goto L_0x0045
        L_0x0043:
            r1 = -1
        L_0x0045:
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0070
        L_0x0049:
            java.util.concurrent.TimeUnit r3 = r10.A09     // Catch:{ all -> 0x0077 }
            if (r3 == 0) goto L_0x005b
            long r1 = r10.A05     // Catch:{ all -> 0x0077 }
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x005b
            long r1 = r5.convert(r1, r3)     // Catch:{ all -> 0x0077 }
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x0074
        L_0x005b:
            java.util.concurrent.TimeUnit r3 = r10.A09     // Catch:{ all -> 0x0077 }
            if (r3 == 0) goto L_0x006a
            long r1 = r10.A06     // Catch:{ all -> 0x0077 }
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x006a
            long r1 = r5.convert(r1, r3)     // Catch:{ all -> 0x0077 }
            goto L_0x006c
        L_0x006a:
            r1 = -1
        L_0x006c:
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0074
        L_0x0070:
            r0 = 1
            goto L_0x0075
        L_0x0072:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0077 }
        L_0x0074:
            r0 = 0
        L_0x0075:
            monitor-exit(r4)     // Catch:{ all -> 0x0077 }
            return r0
        L_0x0077:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0077 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DE3.Beb(X.EA3):boolean");
    }

    public boolean Bfh() {
        return this.A0C;
    }

    public RuntimeException Bif() {
        synchronized (this.A0G) {
            C25083CWt cWt = this.A0K;
            if (cWt == null) {
                this.A0F.A00(C0H.A0e);
                e = AnonymousClass000.A0n("Gl surface is null");
            } else {
                try {
                    cWt.A00();
                    return null;
                } catch (C27216DZt e) {
                    e = e;
                    this.A0F.A00(C0H.A0L);
                    return e;
                }
            }
        }
    }

    public void COr() {
        synchronized (this.A0G) {
            C24863CNg cNg = this.A0E;
            C25083CWt cWt = this.A0K;
            if (cNg != null) {
                if (cWt != null) {
                    C26140Ct3 ct3 = cWt.A01;
                    EGL14.eglQuerySurface(ct3.A04, cWt.A00, 12375, cWt.A04, 0);
                    EGL14.eglQuerySurface(ct3.A04, cWt.A00, 12374, cWt.A03, 0);
                }
                this.A0F.A00(C0H.A0g);
            } else {
                if (cWt != null) {
                }
                this.A0F.A00(C0H.A0g);
            }
            if (this.A0D) {
                C26140Ct3 ct32 = cWt.A01;
                EGLSurface eGLSurface = cWt.A00;
                synchronized (ct32.A07) {
                    EGL14.eglSwapBuffers(ct32.A04, eGLSurface);
                }
            } else {
                int i = this.A03;
                if (i != 0) {
                    EAJ eaj = this.A07;
                    if (eaj == null) {
                        this.A0F.A00(C0H.A0f);
                    } else if (i != 1) {
                        eaj.flush();
                    } else {
                        eaj.finish();
                    }
                }
                this.A0B = true;
            }
        }
        C26045Cr9 cr9 = this.A08;
        if (cr9 != null) {
            cr9.A07.A00(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c6, code lost:
        if (r6.A08 == false) goto L_0x00c8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.CWX CR7(X.EA3 r23) {
        /*
            r22 = this;
            r8 = r22
            X.Cvk r7 = r8.A0J
            X.ClC r6 = r8.A0G
            monitor-enter(r6)
            X.CWX r4 = r23.Bbf()     // Catch:{ all -> 0x00e4 }
            r2 = 0
            if (r4 == 0) goto L_0x00da
            boolean r0 = r4.A00()     // Catch:{ all -> 0x00e4 }
            if (r0 != 0) goto L_0x001e
            X.CjS r1 = r8.A0F     // Catch:{ all -> 0x00e4 }
            X.C0H r0 = X.C0H.A0i     // Catch:{ all -> 0x00e4 }
            r1.A00(r0)     // Catch:{ all -> 0x00e4 }
        L_0x001b:
            monitor-exit(r6)     // Catch:{ all -> 0x00e4 }
            goto L_0x00e3
        L_0x001e:
            X.CWt r9 = r8.A0K     // Catch:{ all -> 0x00e4 }
            if (r9 != 0) goto L_0x002a
            X.CjS r1 = r8.A0F     // Catch:{ all -> 0x00e4 }
            X.C0H r0 = X.C0H.A0h     // Catch:{ all -> 0x00e4 }
            r1.A00(r0)     // Catch:{ all -> 0x00e4 }
            goto L_0x001b
        L_0x002a:
            X.Ct3 r5 = r9.A01     // Catch:{ all -> 0x00e4 }
            android.opengl.EGLSurface r3 = r9.A00     // Catch:{ all -> 0x00e4 }
            int[] r2 = r9.A04     // Catch:{ all -> 0x00e4 }
            r1 = 12375(0x3057, float:1.7341E-41)
            android.opengl.EGLDisplay r0 = r5.A04     // Catch:{ all -> 0x00e4 }
            r10 = 0
            android.opengl.EGL14.eglQuerySurface(r0, r3, r1, r2, r10)     // Catch:{ all -> 0x00e4 }
            r0 = r2[r10]     // Catch:{ all -> 0x00e4 }
            r8.A04 = r0     // Catch:{ all -> 0x00e4 }
            android.opengl.EGLSurface r3 = r9.A00     // Catch:{ all -> 0x00e4 }
            int[] r2 = r9.A03     // Catch:{ all -> 0x00e4 }
            r1 = 12374(0x3056, float:1.734E-41)
            android.opengl.EGLDisplay r0 = r5.A04     // Catch:{ all -> 0x00e4 }
            android.opengl.EGL14.eglQuerySurface(r0, r3, r1, r2, r10)     // Catch:{ all -> 0x00e4 }
            r0 = r2[r10]     // Catch:{ all -> 0x00e4 }
            r8.A01 = r0     // Catch:{ all -> 0x00e4 }
            int r1 = r6.A04     // Catch:{ all -> 0x00e4 }
            r0 = 1
            if (r1 == 0) goto L_0x00a8
            if (r1 != r0) goto L_0x00b3
            X.CNN r10 = r8.A0H     // Catch:{ all -> 0x00e4 }
            long r2 = r23.BaR()     // Catch:{ all -> 0x00e4 }
            boolean r0 = r10.A01     // Catch:{ all -> 0x00e4 }
            if (r0 != 0) goto L_0x0089
            r20 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r15 = 0
        L_0x0062:
            r14 = 1
            r0 = 3
            if (r15 >= r0) goto L_0x0087
            long r18 = java.lang.System.nanoTime()     // Catch:{ all -> 0x00e4 }
            long r0 = android.os.SystemClock.elapsedRealtimeNanos()     // Catch:{ all -> 0x00e4 }
            long r16 = java.lang.System.nanoTime()     // Catch:{ all -> 0x00e4 }
            long r12 = r16 - r18
            if (r15 == 0) goto L_0x007a
            int r11 = (r12 > r20 ? 1 : (r12 == r20 ? 0 : -1))
            if (r11 >= 0) goto L_0x0084
        L_0x007a:
            long r18 = r18 + r16
            long r18 = r18 >> r14
            long r0 = r0 - r18
            r10.A00 = r0     // Catch:{ all -> 0x00e4 }
            r20 = r12
        L_0x0084:
            int r15 = r15 + 1
            goto L_0x0062
        L_0x0087:
            r10.A01 = r14     // Catch:{ all -> 0x00e4 }
        L_0x0089:
            long r0 = android.os.SystemClock.elapsedRealtimeNanos()     // Catch:{ all -> 0x00e4 }
            long r0 = r0 - r2
            float r11 = (float) r0     // Catch:{ all -> 0x00e4 }
            r0 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r11 = r11 / r0
            float r1 = java.lang.Math.abs(r11)     // Catch:{ all -> 0x00e4 }
            r0 = 1123024896(0x42f00000, float:120.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x00a0
            long r0 = r10.A00     // Catch:{ all -> 0x00e4 }
            long r2 = r2 - r0
        L_0x00a0:
            android.opengl.EGLSurface r1 = r9.A00     // Catch:{ all -> 0x00e4 }
            android.opengl.EGLDisplay r0 = r5.A04     // Catch:{ all -> 0x00e4 }
            android.opengl.EGLExt.eglPresentationTimeANDROID(r0, r1, r2)     // Catch:{ all -> 0x00e4 }
            goto L_0x00b3
        L_0x00a8:
            long r0 = r23.BaR()     // Catch:{ all -> 0x00e4 }
            android.opengl.EGLSurface r3 = r9.A00     // Catch:{ all -> 0x00e4 }
            android.opengl.EGLDisplay r2 = r5.A04     // Catch:{ all -> 0x00e4 }
            android.opengl.EGLExt.eglPresentationTimeANDROID(r2, r3, r0)     // Catch:{ all -> 0x00e4 }
        L_0x00b3:
            int r5 = r4.A01     // Catch:{ all -> 0x00e4 }
            int r4 = r4.A00     // Catch:{ all -> 0x00e4 }
            int r3 = r8.A04     // Catch:{ all -> 0x00e4 }
            int r2 = r8.A01     // Catch:{ all -> 0x00e4 }
            int r1 = r6.A01     // Catch:{ all -> 0x00e4 }
            boolean r0 = r23.Bev()     // Catch:{ all -> 0x00e4 }
            if (r0 == 0) goto L_0x00c8
            boolean r0 = r6.A08     // Catch:{ all -> 0x00e4 }
            r13 = 1
            if (r0 != 0) goto L_0x00c9
        L_0x00c8:
            r13 = 0
        L_0x00c9:
            boolean r0 = r8.A0A     // Catch:{ all -> 0x00e4 }
            r8 = r5
            r9 = r4
            r10 = r3
            r11 = r2
            r12 = r1
            r14 = r0
            r7.A07(r8, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x00e4 }
            X.CWX r2 = r7.A06()     // Catch:{ all -> 0x00e4 }
            goto L_0x001b
        L_0x00da:
            X.CjS r1 = r8.A0F     // Catch:{ all -> 0x00e4 }
            X.C0H r0 = X.C0H.A0j     // Catch:{ all -> 0x00e4 }
            r1.A00(r0)     // Catch:{ all -> 0x00e4 }
            goto L_0x001b
        L_0x00e3:
            return r2
        L_0x00e4:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x00e4 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DE3.CR7(X.EA3):X.CWX");
    }

    public boolean contains(Object obj) {
        return AnonymousClass000.A1Z(this.A0G, obj);
    }

    public void release() {
        Handler handler;
        C25742ClC clC = this.A0G;
        synchronized (clC) {
            clC.A01();
        }
        C26045Cr9 cr9 = this.A08;
        if (cr9 != null && (handler = cr9.A07.A01) != null) {
            handler.removeMessages(1, this);
        }
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.CNN, java.lang.Object] */
    public DE3(C28656ECq eCq, C25639CjS cjS, C25742ClC clC) {
        C26246Cvk bus;
        this.A0F = cjS;
        this.A0G = clC;
        if (clC.A03 != 1) {
            bus = new BUR();
        } else {
            bus = new BUS();
        }
        this.A0J = bus;
        this.A0I = eCq;
        bus.A00 = "glSurfaceOutput";
        this.A0D = true;
        this.A03 = 0;
        this.A02 = 0;
        this.A0H = new Object();
    }

    public void Bd8(C26045Cr9 cr9) {
        this.A08 = cr9;
    }

    public void CJf(C24863CNg cNg) {
        this.A0E = cNg;
    }

    public DE3() {
    }
}
