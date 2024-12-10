package X;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLES30;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Trace;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public final class DDv implements E98, EDG, C28562E7o, Handler.Callback {
    public static final int[] A0e = {0, 1, 2, 3, 4};
    public float A00;
    public int A01;
    public Handler A02;
    public CJH A03;
    public C25376Ceb A04;
    public EDJ A05;
    public List A06;
    public boolean A07;
    public boolean A08;
    public float A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public Long A0G;
    public boolean A0H;
    public final ConditionVariable A0I;
    public final C26856DGn A0J;
    public final C26779DDj A0K;
    public final C26784DDr A0L;
    public final C25639CjS A0M;
    public final C26850DGh A0N;
    public final boolean A0O;
    public final Context A0P;
    public final E4C A0Q;
    public final CJU A0R;
    public final List A0S;
    public final AtomicInteger A0T;
    public final boolean A0U;
    public final boolean A0V;
    public volatile Handler A0W;
    public volatile C26045Cr9 A0X;
    public volatile EA3 A0Y;
    public volatile Long A0Z;
    public volatile Long A0a;
    public volatile boolean A0b;
    public volatile Long A0c;
    public volatile CountDownLatch A0d;

    /* JADX WARNING: type inference failed for: r0v2, types: [X.DGh, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x003e, code lost:
        if (android.os.Build.VERSION.SDK_INT < 29) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public DDv(android.content.Context r8, android.os.Handler r9, android.os.Handler r10, X.E4C r11, X.C25639CjS r12, X.EDJ r13, boolean r14, boolean r15, boolean r16, boolean r17) {
        /*
            r7 = this;
            r2 = 0
            r4 = 1
            r7.<init>()
            r7.A0M = r12
            r7.A0P = r8
            r7.A0O = r14
            r7.A0U = r15
            r7.A0Q = r11
            r7.A05 = r13
            r6 = 0
            if (r16 == 0) goto L_0x0019
            android.os.ConditionVariable r6 = new android.os.ConditionVariable
            r6.<init>()
        L_0x0019:
            r7.A0I = r6
            X.DDr r0 = new X.DDr
            r0.<init>(r12)
            r7.A0L = r0
            X.DGn r0 = new X.DGn
            r0.<init>()
            r7.A0J = r0
            X.DGh r0 = new X.DGh
            r0.<init>()
            r7.A0N = r0
            java.util.ArrayList r0 = X.AnonymousClass000.A13()
            r7.A0S = r0
            r5 = 1
            if (r17 == 0) goto L_0x0040
            int r3 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            r0 = 1
            if (r3 >= r1) goto L_0x0041
        L_0x0040:
            r0 = 0
        L_0x0041:
            r7.A0V = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>(r2)
            r7.A0T = r0
            r7.A0H = r4
            r0 = 1065353216(0x3f800000, float:1.0)
            r7.A00 = r0
            X.CJU r1 = new X.CJU
            r1.<init>(r7)
            r7.A0R = r1
            if (r6 != 0) goto L_0x005a
            r5 = 0
        L_0x005a:
            X.DDj r0 = new X.DDj
            r0.<init>(r10, r1, r12, r5)
            r7.A0K = r0
            X.DGn r1 = r7.A0J
            X.DGo r0 = new X.DGo
            r0.<init>(r7, r2)
            r1.A02(r0)
            android.os.Looper r1 = r9.getLooper()
            android.os.Handler r0 = new android.os.Handler
            r0.<init>(r1, r7)
            r7.A02 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DDv.<init>(android.content.Context, android.os.Handler, android.os.Handler, X.E4C, X.CjS, X.EDJ, boolean, boolean, boolean, boolean):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|(1:8)|(3:9|10|(1:13))|21|22) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x002c */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004d A[Catch:{ all -> 0x0058 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0038 A[Catch:{ all -> 0x0047 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final X.EA3 A00(android.os.Handler r14, X.EA3 r15, X.C25841Cmv r16, java.lang.Integer r17, boolean r18, boolean r19, boolean r20) {
        /*
            r13 = this;
            r3 = 0
            r5 = r13
            r7 = r15
            java.lang.String r0 = "GlProcessorGraph.renderSingleOutputInSeparateThread"
            android.os.Trace.beginSection(r0)     // Catch:{ all -> 0x0047 }
            java.util.concurrent.CountDownLatch r9 = X.BE7.A0u()     // Catch:{ all -> 0x0047 }
            java.lang.Long r0 = r13.A0Z     // Catch:{ all -> 0x0047 }
            java.lang.Long r0 = A04(r13, r0)     // Catch:{ all -> 0x0047 }
            r13.A0Z = r0     // Catch:{ all -> 0x0047 }
            r10 = 0
            X.3CR r4 = new X.3CR     // Catch:{ all -> 0x0047 }
            r6 = r16
            r8 = r17
            r11 = r19
            r12 = r20
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0047 }
            r14.post(r4)     // Catch:{ all -> 0x0047 }
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x002c }
            r0 = 10
            r9.await(r0, r2)     // Catch:{ InterruptedException -> 0x002c }
        L_0x002c:
            java.lang.Long r0 = r13.A0a     // Catch:{ all -> 0x0047 }
            java.lang.Long r0 = A05(r0)     // Catch:{ all -> 0x0047 }
            r13.A0a = r0     // Catch:{ all -> 0x0047 }
            X.EA3 r4 = r13.A0Y     // Catch:{ all -> 0x0047 }
            if (r4 != 0) goto L_0x0039
            r4 = r15
        L_0x0039:
            boolean r0 = r13.A0b     // Catch:{ all -> 0x0045 }
            if (r0 == 0) goto L_0x0052
            if (r18 != 0) goto L_0x0052
            X.Cjt r0 = r6.A07     // Catch:{ all -> 0x0045 }
            r0.A01(r4, r3)     // Catch:{ all -> 0x0045 }
            goto L_0x0052
        L_0x0045:
            r2 = move-exception
            goto L_0x0049
        L_0x0047:
            r2 = move-exception
            r4 = r15
        L_0x0049:
            X.Cr9 r1 = r13.A0X     // Catch:{ all -> 0x0058 }
            if (r1 == 0) goto L_0x0052
            java.lang.String r0 = "MediaPipeline.renderSingleOutputInSeparateThread() failed."
            X.C27222Da1.A00(r1, r0, r2)     // Catch:{ all -> 0x0058 }
        L_0x0052:
            android.os.Trace.endSection()
            r13.A0Y = r3
            return r4
        L_0x0058:
            r0 = move-exception
            android.os.Trace.endSection()
            r13.A0Y = r3
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DDv.A00(android.os.Handler, X.EA3, X.Cmv, java.lang.Integer, boolean, boolean, boolean):X.EA3");
    }

    /* JADX WARNING: Removed duplicated region for block: B:62:0x00d3 A[Catch:{ all -> 0x012b }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x012a A[Catch:{ all -> 0x012b }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0133  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.EA3 A01(X.DDv r13, X.EA3 r14, X.C25841Cmv r15, java.lang.Integer r16, boolean r17, boolean r18, boolean r19) {
        /*
            r2 = 0
            if (r18 == 0) goto L_0x0068
            android.os.ConditionVariable r7 = r13.A0I     // Catch:{ all -> 0x012e }
            if (r7 == 0) goto L_0x0010
            boolean r0 = r13.A0H     // Catch:{ all -> 0x012e }
            if (r0 == 0) goto L_0x0010
            r13.A02(r14)     // Catch:{ all -> 0x012e }
            r13.A0H = r2     // Catch:{ all -> 0x012e }
        L_0x0010:
            r3 = r14
            boolean r0 = r13.A0b     // Catch:{ all -> 0x012e }
            if (r0 == 0) goto L_0x0057
            X.DDj r4 = r13.A0K     // Catch:{ all -> 0x012e }
            if (r4 == 0) goto L_0x0057
            java.lang.String r0 = "PreProcessCpuFrames"
            android.os.Trace.beginSection(r0)     // Catch:{ all -> 0x012e }
            X.C18070vi.A0d(r14, r2)     // Catch:{ all -> 0x012e }
            boolean r0 = r4.A02     // Catch:{ all -> 0x012e }
            if (r0 == 0) goto L_0x0054
            X.CyL r1 = r4.A04     // Catch:{ all -> 0x012e }
            int r0 = r14.BQb()     // Catch:{ all -> 0x012e }
            r1.A00 = r0     // Catch:{ all -> 0x012e }
            X.DDn r0 = r4.A07     // Catch:{ all -> 0x012e }
            r0.A02(r14)     // Catch:{ all -> 0x012e }
            boolean r0 = r4.A08     // Catch:{ all -> 0x012e }
            if (r0 != 0) goto L_0x0054
            boolean r0 = r4.A03     // Catch:{ all -> 0x012e }
            if (r0 == 0) goto L_0x0054
            X.DE4 r0 = r4.A00     // Catch:{ all -> 0x012e }
            if (r0 == 0) goto L_0x004f
            X.DE1 r8 = r0.A08     // Catch:{ all -> 0x012e }
            X.C18070vi.A0X(r8)     // Catch:{ all -> 0x012e }
            long r0 = r8.A03     // Catch:{ all -> 0x012e }
            long r5 = r14.BaR()     // Catch:{ all -> 0x012e }
            int r4 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r4 > 0) goto L_0x0054
            r3 = r8
            goto L_0x0054
        L_0x004f:
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()     // Catch:{ all -> 0x012e }
            throw r0     // Catch:{ all -> 0x012e }
        L_0x0054:
            android.os.Trace.endSection()     // Catch:{ all -> 0x012e }
        L_0x0057:
            if (r7 == 0) goto L_0x0069
            X.DDj r0 = r13.A0K     // Catch:{ all -> 0x012b }
            if (r0 == 0) goto L_0x0069
            boolean r0 = r0.A02     // Catch:{ all -> 0x012b }
            if (r0 == 0) goto L_0x0069
            r7.block()     // Catch:{ all -> 0x012b }
            r7.close()     // Catch:{ all -> 0x012b }
            goto L_0x0069
        L_0x0068:
            r3 = r14
        L_0x0069:
            if (r16 == 0) goto L_0x0074
            X.DDr r1 = r13.A0L     // Catch:{ all -> 0x012b }
            int r0 = r16.intValue()     // Catch:{ all -> 0x012b }
            r1.A01(r0)     // Catch:{ all -> 0x012b }
        L_0x0074:
            if (r17 == 0) goto L_0x007b
            X.EA3 r3 = r13.A02(r3)     // Catch:{ all -> 0x012b }
            goto L_0x00d0
        L_0x007b:
            boolean r0 = r13.A0U     // Catch:{ all -> 0x012b }
            if (r0 == 0) goto L_0x00ca
            X.DDr r11 = r13.A0L     // Catch:{ all -> 0x012b }
            boolean r0 = r11.A02()     // Catch:{ all -> 0x012b }
            if (r0 == 0) goto L_0x00ca
            java.util.List r10 = r15.A01()     // Catch:{ all -> 0x012b }
            int r9 = r10.size()     // Catch:{ all -> 0x012b }
            r8 = 5
            r7 = 0
        L_0x0091:
            int[] r0 = A0e     // Catch:{ all -> 0x012b }
            r6 = r0[r7]     // Catch:{ all -> 0x012b }
            r5 = 0
            r4 = 0
        L_0x0097:
            if (r4 >= r9) goto L_0x00c5
            java.lang.Object r1 = r10.get(r4)     // Catch:{ all -> 0x012b }
            X.EAK r1 = (X.EAK) r1     // Catch:{ all -> 0x012b }
            int r0 = r1.BVx()     // Catch:{ all -> 0x012b }
            boolean r12 = r1.Beb(r3)     // Catch:{ all -> 0x012b }
            if (r12 == 0) goto L_0x00af
            if (r6 == r0) goto L_0x00b6
            if (r6 != 0) goto L_0x00b2
            if (r0 == r8) goto L_0x00b6
        L_0x00af:
            int r4 = r4 + 1
            goto L_0x0097
        L_0x00b2:
            if (r6 != r8) goto L_0x00af
            if (r0 != 0) goto L_0x00af
        L_0x00b6:
            if (r5 != 0) goto L_0x00bf
            r11.A01(r6)     // Catch:{ all -> 0x012b }
            X.EA3 r5 = r13.A02(r3)     // Catch:{ all -> 0x012b }
        L_0x00bf:
            X.Cjt r0 = r15.A07     // Catch:{ all -> 0x012b }
            r0.A01(r5, r1)     // Catch:{ all -> 0x012b }
            goto L_0x00af
        L_0x00c5:
            int r7 = r7 + 1
            if (r7 >= r8) goto L_0x00d0
            goto L_0x0091
        L_0x00ca:
            X.EA3 r3 = r13.A02(r3)     // Catch:{ all -> 0x012b }
            r6 = 1
            goto L_0x00d1
        L_0x00d0:
            r6 = 0
        L_0x00d1:
            if (r19 == 0) goto L_0x012a
            boolean r0 = r13.A0b     // Catch:{ all -> 0x012b }
            if (r0 == 0) goto L_0x0111
            X.DDj r5 = r13.A0K     // Catch:{ all -> 0x012b }
            if (r5 == 0) goto L_0x0111
            java.lang.String r0 = "PostProcessCpuFrames"
            android.os.Trace.beginSection(r0)     // Catch:{ all -> 0x012b }
            X.C18070vi.A0d(r14, r2)     // Catch:{ all -> 0x012b }
            boolean r0 = r5.A02     // Catch:{ all -> 0x012b }
            if (r0 == 0) goto L_0x010e
            boolean r0 = r5.A08     // Catch:{ all -> 0x012b }
            if (r0 != 0) goto L_0x010e
            X.CWX r1 = r14.Bbf()     // Catch:{ all -> 0x012b }
            if (r1 == 0) goto L_0x010e
            boolean r0 = r1.A00()     // Catch:{ all -> 0x012b }
            if (r0 == 0) goto L_0x010e
            X.DE4 r4 = r5.A00     // Catch:{ all -> 0x012b }
            if (r4 == 0) goto L_0x0106
            int r2 = r1.A01     // Catch:{ all -> 0x012b }
            int r1 = r1.A00     // Catch:{ all -> 0x012b }
            int r0 = r14.BQb()     // Catch:{ all -> 0x012b }
            r4.A03(r2, r1, r0)     // Catch:{ all -> 0x012b }
        L_0x0106:
            X.DDn r0 = r5.A01     // Catch:{ all -> 0x012b }
            r0.A02(r14)     // Catch:{ all -> 0x012b }
            r0 = 1
            r5.A03 = r0     // Catch:{ all -> 0x012b }
        L_0x010e:
            android.os.Trace.endSection()     // Catch:{ all -> 0x012b }
        L_0x0111:
            if (r6 == 0) goto L_0x0119
            X.Cjt r1 = r15.A07     // Catch:{ all -> 0x012b }
            r0 = 0
            r1.A01(r3, r0)     // Catch:{ all -> 0x012b }
        L_0x0119:
            java.util.concurrent.atomic.AtomicInteger r0 = r13.A0T     // Catch:{ all -> 0x012b }
            r0.incrementAndGet()     // Catch:{ all -> 0x012b }
            X.DGn r2 = r13.A0J     // Catch:{ all -> 0x012b }
            X.DGl r1 = X.C26854DGl.A00     // Catch:{ all -> 0x012b }
            X.C18070vi.A0Z(r1)     // Catch:{ all -> 0x012b }
            r0 = 0
            r2.CCm(r1, r0)     // Catch:{ all -> 0x012b }
            return r3
        L_0x012a:
            return r3
        L_0x012b:
            r2 = move-exception
            r14 = r3
            goto L_0x012f
        L_0x012e:
            r2 = move-exception
        L_0x012f:
            X.Cr9 r1 = r13.A0X
            if (r1 == 0) goto L_0x0138
            java.lang.String r0 = "GlProcessorGraph.processCpuAndGpuFrames() failed."
            X.C27222Da1.A00(r1, r0, r2)
        L_0x0138:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DDv.A01(X.DDv, X.EA3, X.Cmv, java.lang.Integer, boolean, boolean, boolean):X.EA3");
    }

    public void Bd8(C26045Cr9 cr9) {
        C18070vi.A0d(cr9, 0);
        if (A09()) {
            return;
        }
        if (!this.A08 || this.A0W != null) {
            Trace.beginSection("GlProcessorGraph.init");
            this.A0X = cr9;
            cr9.A03(this.A0L);
            C26779DDj dDj = this.A0K;
            if (dDj != null) {
                cr9.A03(dDj);
            }
            Handler handler = this.A02;
            if (handler == null || !C18070vi.A18(handler.getLooper(), cr9.A00.getLooper())) {
                this.A02 = new Handler(cr9.A00.getLooper(), this);
            }
            List list = this.A06;
            if (list != null) {
                A06(this, new DGe(list), (C28561E7n) null);
                this.A06 = null;
            }
            Trace.endSection();
        }
    }

    public void CCl(C28560E7m e7m) {
        A06(this, e7m, (C28561E7n) null);
    }

    public void CF9(C25841Cmv cmv, Long l) {
        C25841Cmv cmv2 = cmv;
        if (cmv.A06.A00.get(AnonymousClass001.A1I("input_", AnonymousClass3MZ.A19(cmv, 0), 0)) != null) {
            try {
                Trace.beginSection("GlProcessorGraph.renderInternal");
                EA3 A002 = cmv.A00();
                if (this.A0O) {
                    DDn dDn = (DDn) cmv.A07.A00.get(0);
                    if (dDn != null) {
                        if (dDn.A05.A00.size() == 0) {
                        }
                    }
                    Trace.endSection();
                }
                if (this.A02 == null || !Bcs() || !this.A08) {
                    C18070vi.A0b(A002);
                    A01(this, A002, cmv2, (Integer) null, false, true, true);
                } else {
                    C18070vi.A0b(A002);
                    A03(A002, cmv, false);
                }
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
            Trace.endSection();
        }
    }

    public EA3 CFA(EA3 ea3, C25841Cmv cmv) {
        C25841Cmv cmv2 = cmv;
        EA3 ea32 = ea3;
        C18070vi.A0i(ea3, cmv);
        try {
            Trace.beginSection("GlProcessorGraph.render");
            ea32 = (this.A02 == null || !Bcs() || !this.A08) ? A01(this, ea32, cmv2, (Integer) null, true, true, true) : A03(ea3, cmv, true);
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
        Trace.endSection();
        return ea32;
    }

    public boolean handleMessage(Message message) {
        C18070vi.A0d(message, 0);
        int i = message.what;
        if (i == 1) {
            Object obj = message.obj;
            if (obj != null) {
                A07((C28560E7m) obj, (C28561E7n) null);
                return true;
            }
            throw AnonymousClass000.A0n("Required value was null.");
        } else if (i != 2) {
            if (i == 3 && this.A0b) {
                Object obj2 = message.obj;
                if (obj2 != null) {
                    Object[] objArr = (Object[]) obj2;
                    if (this.A07) {
                        this.A0d = new CountDownLatch(1);
                    }
                    Object obj3 = objArr[0];
                    C18070vi.A0z(obj3, "null cannot be cast to non-null type com.facebook.onecamera.components.mediapipeline.mediagraph.interfaces.MediaGraphIO");
                    Object obj4 = objArr[1];
                    C18070vi.A0z(obj4, "null cannot be cast to non-null type com.facebook.onecamera.components.mediapipeline.gl.interfaces.GlFrame");
                    A01(this, (EA3) obj4, (C25841Cmv) obj3, (Integer) null, true, true, true);
                    if (this.A07) {
                        this.A0c = A04(this, this.A0c);
                        CountDownLatch countDownLatch = this.A0d;
                        if (countDownLatch != null) {
                            countDownLatch.countDown();
                        }
                    }
                } else {
                    throw AnonymousClass000.A0n("Required value was null.");
                }
            }
            return true;
        } else {
            Object obj5 = message.obj;
            if (obj5 != null) {
                Object[] objArr2 = (Object[]) obj5;
                Object obj6 = objArr2[0];
                C18070vi.A0z(obj6, "null cannot be cast to non-null type com.facebook.videocodec.effects.renderers.common.RendererEvent");
                Object obj7 = objArr2[1];
                C18070vi.A0z(obj7, "null cannot be cast to non-null type com.facebook.videocodec.effects.renderers.common.RendererEventListener");
                A07((C28560E7m) obj6, (C28561E7n) obj7);
                return true;
            }
            throw AnonymousClass000.A0n("Required value was null.");
        }
    }

    /* JADX WARNING: type inference failed for: r0v65, types: [X.DGd, java.lang.Object, X.E7m] */
    /* JADX WARNING: type inference failed for: r0v68, types: [X.DGb, java.lang.Object, X.E7m] */
    /* JADX WARNING: type inference failed for: r0v71, types: [X.DGc, java.lang.Object, X.E7m] */
    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    private final X.EA3 A02(X.EA3 r22) {
        /*
            r21 = this;
            r19 = r22
            r5 = r21
            android.os.Handler r2 = r5.A02
            boolean r0 = r5.A0b
            if (r0 == 0) goto L_0x0024
            boolean r0 = r5.Bcs()
            if (r0 == 0) goto L_0x0024
            if (r2 == 0) goto L_0x0025
            android.os.Looper r1 = android.os.Looper.myLooper()
            android.os.Looper r0 = r2.getLooper()
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 != 0) goto L_0x0025
            boolean r0 = r5.A08
            if (r0 == 0) goto L_0x0025
        L_0x0024:
            return r19
        L_0x0025:
            java.lang.String r0 = "ProcessGlRenderer"
            android.os.Trace.beginSection(r0)
            int r2 = r19.BQb()
            int r0 = r5.A0A
            r4 = 1
            r3 = 0
            if (r2 != r0) goto L_0x003c
            int r1 = r19.BVv()
            int r0 = r5.A0E
            if (r1 == r0) goto L_0x0089
        L_0x003c:
            r5.A0A = r2
            int r0 = r19.BVv()
            r5.A0E = r0
            int r2 = r2 + r0
            int r0 = r2 % 180
            if (r0 == 0) goto L_0x00a0
            int r6 = r5.A0D
            int r2 = r5.A0F
        L_0x004d:
            X.DGn r7 = r5.A0J
            float r1 = r5.A09
            X.DGd r0 = new X.DGd
            r0.<init>()
            r0.A02 = r6
            r0.A01 = r2
            r0.A00 = r1
            r6 = 0
            r7.CCm(r0, r6)
            int r0 = r5.A0E
            int r0 = r0 % 180
            if (r0 == 0) goto L_0x009b
            int r2 = r5.A0B
            int r1 = r5.A0C
        L_0x006a:
            X.DGb r0 = new X.DGb
            r0.<init>()
            r0.A01 = r2
            r0.A00 = r1
            r7.CCm(r0, r6)
            int r0 = r5.A0E
            int r2 = r0 / 90
            int r0 = r5.A0A
            int r1 = -r0
            X.DGc r0 = new X.DGc
            r0.<init>()
            r0.A00 = r2
            r0.A01 = r1
            r7.CCm(r0, r6)
        L_0x0089:
            X.DGn r2 = r5.A0J
            X.DGk r1 = X.C26853DGk.A00
            X.C18070vi.A0Z(r1)
            r18 = 0
            r0 = r18
            r2.CCm(r1, r0)
            X.DDr r2 = r5.A0L
            monitor-enter(r2)
            goto L_0x00a5
        L_0x009b:
            int r2 = r5.A0C
            int r1 = r5.A0B
            goto L_0x006a
        L_0x00a0:
            int r6 = r5.A0F
            int r2 = r5.A0D
            goto L_0x004d
        L_0x00a5:
            r2.A02 = r4     // Catch:{ all -> 0x0270 }
            X.CZh r0 = r2.A06     // Catch:{ all -> 0x0270 }
            java.util.List r0 = r0.A00     // Catch:{ all -> 0x0270 }
            r20 = r0
            int r17 = X.BE7.A08(r20)     // Catch:{ all -> 0x0270 }
            r6 = 0
        L_0x00b2:
            r0 = r17
            if (r6 >= r0) goto L_0x0210
            r0 = r20
            java.lang.Object r7 = r0.get(r6)     // Catch:{ all -> 0x0270 }
            X.C18070vi.A0X(r7)     // Catch:{ all -> 0x0270 }
            r9 = r7
            X.DDs r9 = (X.C26785DDs) r9     // Catch:{ all -> 0x0270 }
            long r0 = r19.BaR()     // Catch:{ all -> 0x0270 }
            long r0 = X.C17880vN.A04(r0)     // Catch:{ all -> 0x0270 }
            X.E9y r8 = r9.A03     // Catch:{ all -> 0x0270 }
            if (r8 == 0) goto L_0x020c
            boolean r8 = r8.isEnabled()     // Catch:{ all -> 0x0270 }
            if (r8 != r4) goto L_0x020c
            X.E4E r8 = r9.A05     // Catch:{ all -> 0x0270 }
            boolean r0 = r8.Bea(r0)     // Catch:{ all -> 0x0270 }
            if (r0 == 0) goto L_0x020c
            X.Cr9 r8 = r2.A01     // Catch:{ all -> 0x0270 }
            if (r8 == 0) goto L_0x0255
            X.CWX r11 = r19.Bbf()     // Catch:{ all -> 0x0270 }
            if (r11 == 0) goto L_0x0107
            boolean r0 = r11.A00()     // Catch:{ all -> 0x0270 }
            if (r0 == 0) goto L_0x0107
            X.DE4 r10 = X.C26784DDr.A00(r2)     // Catch:{ all -> 0x0270 }
            int r0 = r11.A01     // Catch:{ all -> 0x0270 }
            float r0 = (float) r0     // Catch:{ all -> 0x0270 }
            float r1 = r2.A00     // Catch:{ all -> 0x0270 }
            int r9 = X.BE6.A04(r0, r1)     // Catch:{ all -> 0x0270 }
            int r0 = r11.A00     // Catch:{ all -> 0x0270 }
            float r0 = (float) r0     // Catch:{ all -> 0x0270 }
            int r1 = X.BE6.A04(r0, r1)     // Catch:{ all -> 0x0270 }
            int r0 = r19.BQb()     // Catch:{ all -> 0x0270 }
            r10.A03(r9, r1, r0)     // Catch:{ all -> 0x0270 }
        L_0x0107:
            r10 = r7
            X.DDs r10 = (X.C26785DDs) r10     // Catch:{ all -> 0x0202 }
            X.EAJ r16 = r8.A01()     // Catch:{ all -> 0x0202 }
            X.DE4 r0 = X.C26784DDr.A00(r2)     // Catch:{ all -> 0x0202 }
            X.DE1 r0 = r0.A08     // Catch:{ all -> 0x0202 }
            X.C18070vi.A0X(r0)     // Catch:{ all -> 0x0202 }
            X.DE4 r9 = X.C26784DDr.A00(r2)     // Catch:{ all -> 0x0202 }
            if (r16 == 0) goto L_0x01f4
            monitor-enter(r9)     // Catch:{ all -> 0x0202 }
            X.CZB r14 = r19.getTexture()     // Catch:{ all -> 0x01f0 }
            if (r14 == 0) goto L_0x01f3
            java.lang.RuntimeException r0 = r9.Bif()     // Catch:{ all -> 0x01eb }
            if (r0 != 0) goto L_0x01e7
            r0 = r19
            X.CWX r13 = r9.CR7(r0)     // Catch:{ all -> 0x01eb }
            X.CWX r1 = r19.Bbf()     // Catch:{ all -> 0x01eb }
            if (r1 == 0) goto L_0x01e7
            if (r13 == 0) goto L_0x01e7
            boolean r0 = r1.A00()     // Catch:{ all -> 0x01eb }
            if (r0 == 0) goto L_0x01e7
            boolean r0 = r13.A00()     // Catch:{ all -> 0x01eb }
            if (r0 == 0) goto L_0x01e7
            X.Cie r11 = r10.A06     // Catch:{ all -> 0x01eb }
            float[] r15 = r1.A03     // Catch:{ all -> 0x01eb }
            float[] r12 = r13.A03     // Catch:{ all -> 0x01eb }
            long r0 = r19.BaR()     // Catch:{ all -> 0x01eb }
            r11.A01 = r14     // Catch:{ all -> 0x01eb }
            r11.A04 = r15     // Catch:{ all -> 0x01eb }
            r11.A05 = r12     // Catch:{ all -> 0x01eb }
            float[] r12 = X.C25599Cie.A06     // Catch:{ all -> 0x01eb }
            r11.A03 = r12     // Catch:{ all -> 0x01eb }
            r11.A02 = r12     // Catch:{ all -> 0x01eb }
            r11.A00 = r0     // Catch:{ all -> 0x01eb }
            int r1 = r13.A01     // Catch:{ all -> 0x01eb }
            int r0 = r13.A00     // Catch:{ all -> 0x01eb }
            android.opengl.GLES20.glViewport(r3, r3, r1, r0)     // Catch:{ all -> 0x01eb }
            r1 = 1065353216(0x3f800000, float:1.0)
            r0 = 0
            android.opengl.GLES20.glClearColor(r0, r0, r0, r1)     // Catch:{ all -> 0x01eb }
            r0 = 16640(0x4100, float:2.3318E-41)
            android.opengl.GLES20.glClear(r0)     // Catch:{ all -> 0x01eb }
            X.E9y r14 = r10.A03     // Catch:{ all -> 0x01eb }
            if (r14 == 0) goto L_0x0187
            int r0 = r10.A01     // Catch:{ all -> 0x01eb }
            int r12 = r13.A01     // Catch:{ all -> 0x01eb }
            if (r0 != r12) goto L_0x017e
            int r1 = r10.A00     // Catch:{ all -> 0x01eb }
            int r0 = r13.A00     // Catch:{ all -> 0x01eb }
            if (r1 == r0) goto L_0x0187
        L_0x017e:
            r10.A01 = r12     // Catch:{ all -> 0x01eb }
            int r0 = r13.A00     // Catch:{ all -> 0x01eb }
            r10.A00 = r0     // Catch:{ all -> 0x01eb }
            r14.C83(r12, r0)     // Catch:{ all -> 0x01eb }
        L_0x0187:
            X.EAJ r0 = r10.A02     // Catch:{ all -> 0x01eb }
            if (r0 == 0) goto L_0x01e7
            X.E9y r0 = r10.A03     // Catch:{ all -> 0x01eb }
            if (r0 == 0) goto L_0x01e7
            boolean r0 = r0.isEnabled()     // Catch:{ all -> 0x01eb }
            if (r0 == 0) goto L_0x01e7
            long r0 = r11.A00     // Catch:{ all -> 0x01eb }
            long r0 = X.C17880vN.A04(r0)     // Catch:{ all -> 0x01eb }
            boolean r12 = r10.A04     // Catch:{ all -> 0x01eb }
            if (r12 != 0) goto L_0x01a4
            X.BVq r12 = r10.A08     // Catch:{ all -> 0x01eb }
            r12.BsM(r11, r0)     // Catch:{ all -> 0x01eb }
        L_0x01a4:
            X.E9y r13 = r10.A03     // Catch:{ all -> 0x01eb }
            boolean r12 = r13 instanceof X.EDQ     // Catch:{ all -> 0x01eb }
            if (r12 == 0) goto L_0x01b6
            java.lang.String r12 = "null cannot be cast to non-null type com.facebook.videocodec.effects.common.OutputAwareGLRenderer"
            X.C18070vi.A0z(r13, r12)     // Catch:{ all -> 0x01eb }
            X.EDQ r13 = (X.EDQ) r13     // Catch:{ all -> 0x01eb }
            X.CNe r12 = r10.A07     // Catch:{ all -> 0x01eb }
            r13.CIi(r12)     // Catch:{ all -> 0x01eb }
        L_0x01b6:
            X.E9y r10 = r10.A03     // Catch:{ all -> 0x01eb }
            X.C18070vi.A0b(r10)     // Catch:{ all -> 0x01eb }
            boolean r0 = r10.BsM(r11, r0)     // Catch:{ all -> 0x01eb }
            if (r0 == 0) goto L_0x01e7
            r9.COr()     // Catch:{ all -> 0x01eb }
            r16.Big()     // Catch:{ all -> 0x01f0 }
            monitor-exit(r9)     // Catch:{ all -> 0x0202 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0202 }
            java.lang.String r0 = "GL Error after renderFrame(): "
            java.lang.String r0 = X.AnonymousClass001.A1E(r7, r0, r1)     // Catch:{ all -> 0x0202 }
            X.C26058CrU.A01(r0)     // Catch:{ all -> 0x0202 }
            X.DE4 r0 = X.C26784DDr.A00(r2)     // Catch:{ all -> 0x0202 }
            X.DE1 r7 = r0.A08     // Catch:{ all -> 0x0202 }
            X.C18070vi.A0X(r7)     // Catch:{ all -> 0x0202 }
            boolean r0 = r2.A02     // Catch:{ all -> 0x01e5 }
            r0 = r0 ^ 1
            r2.A02 = r0     // Catch:{ all -> 0x01e5 }
            goto L_0x020a
        L_0x01e5:
            r1 = move-exception
            goto L_0x0205
        L_0x01e7:
            r16.Big()     // Catch:{ all -> 0x01f0 }
            goto L_0x01f3
        L_0x01eb:
            r0 = move-exception
            r16.Big()     // Catch:{ all -> 0x01f0 }
            throw r0     // Catch:{ all -> 0x01f0 }
        L_0x01f0:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0202 }
            throw r0     // Catch:{ all -> 0x0202 }
        L_0x01f3:
            monitor-exit(r9)     // Catch:{ all -> 0x0202 }
        L_0x01f4:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0202 }
            java.lang.String r0 = "GL Error after skip renderFrame(): "
            java.lang.String r0 = X.AnonymousClass001.A1E(r7, r0, r1)     // Catch:{ all -> 0x0202 }
            X.C26058CrU.A01(r0)     // Catch:{ all -> 0x0202 }
            goto L_0x020c
        L_0x0202:
            r1 = move-exception
            r7 = r19
        L_0x0205:
            java.lang.String r0 = "GlRenderChain.doFrame() error!"
            X.C27222Da1.A00(r8, r0, r1)     // Catch:{ all -> 0x0270 }
        L_0x020a:
            r19 = r7
        L_0x020c:
            int r6 = r6 + 1
            goto L_0x00b2
        L_0x0210:
            monitor-exit(r2)
            android.os.Trace.endSection()
            boolean r0 = r5.A0V
            if (r0 == 0) goto L_0x0024
            X.Cr9 r0 = r5.A0X
            if (r0 == 0) goto L_0x026b
            X.Ct3 r0 = r0.A04
            int r1 = r0.A01
            r0 = 3
            if (r1 < r0) goto L_0x0024
            java.lang.String r0 = "WaitForGpuCompletion"
            android.os.Trace.beginSection(r0)
            java.lang.Long r2 = r5.A0G
            if (r2 == 0) goto L_0x0241
            long r6 = r2.longValue()
            r0 = 500000000(0x1dcd6500, double:2.47032823E-315)
            android.opengl.GLES30.glClientWaitSync(r6, r4, r0)
            long r0 = r2.longValue()
            android.opengl.GLES30.glDeleteSync(r0)
            r0 = r18
            r5.A0G = r0
        L_0x0241:
            r0 = 37143(0x9117, float:5.2048E-41)
            long r0 = android.opengl.GLES30.glFenceSync(r0, r3)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.A0G = r0
            android.opengl.GLES20.glFlush()
            android.os.Trace.endSection()
            return r19
        L_0x0255:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0270 }
            java.lang.String r0 = "GlRenderChain.init() must be called before doFrame() with enabled "
            r1.append(r0)     // Catch:{ all -> 0x0270 }
            r1.append(r7)     // Catch:{ all -> 0x0270 }
            r0 = 32
            r1.append(r0)     // Catch:{ all -> 0x0270 }
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0m(r1)     // Catch:{ all -> 0x0270 }
            throw r0     // Catch:{ all -> 0x0270 }
        L_0x026b:
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()
            throw r0
        L_0x0270:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DDv.A02(X.EA3):X.EA3");
    }

    private final EA3 A03(EA3 ea3, C25841Cmv cmv, boolean z) {
        EA3 ea32 = ea3;
        if (this.A0b) {
            try {
                Trace.beginSection("GlProcessorGraph.renderInSeparateThread");
                Handler handler = this.A02;
                if (handler != null) {
                    C25841Cmv cmv2 = cmv;
                    boolean z2 = z;
                    if (this.A0T.get() >= this.A01) {
                        if (!z && this.A0U && this.A0L.A02()) {
                            List A012 = cmv2.A01();
                            int size = A012.size();
                            boolean[] zArr = new boolean[5];
                            int i = 0;
                            for (int i2 = 0; i2 < 5; i2++) {
                                int i3 = A0e[i2];
                                int i4 = 0;
                                while (true) {
                                    if (i4 >= size) {
                                        break;
                                    }
                                    EAK eak = (EAK) A012.get(i4);
                                    zArr[i2] = false;
                                    int BVx = eak.BVx();
                                    if (i3 != BVx) {
                                        if (i3 != 0) {
                                            if (i3 == 5 && BVx == 0) {
                                            }
                                            i4++;
                                        } else if (BVx != 5) {
                                            continue;
                                            i4++;
                                        }
                                    }
                                    if (eak.Beb(ea32)) {
                                        zArr[i2] = true;
                                        i++;
                                        break;
                                    }
                                    i4++;
                                }
                            }
                            int i5 = 0;
                            int i6 = 0;
                            while (true) {
                                if (zArr[i6]) {
                                    int i7 = A0e[i6];
                                    boolean A1P = AnonymousClass000.A1P(i5);
                                    boolean A1T = AnonymousClass000.A1T(i5, i - 1);
                                    EA3 ea33 = null;
                                    for (int i8 = 0; i8 < size; i8++) {
                                        EAK eak2 = (EAK) A012.get(i8);
                                        int BVx2 = eak2.BVx();
                                        if (i7 != BVx2) {
                                            if (i7 != 0) {
                                                if (i7 == 5 && BVx2 == 0) {
                                                }
                                            } else if (BVx2 != 5) {
                                            }
                                        }
                                        if (eak2.Beb(ea32)) {
                                            if (ea33 == null) {
                                                ea33 = A00(handler, ea32, cmv2, Integer.valueOf(i7), true, A1P, A1T);
                                            }
                                            cmv2.A07.A01(ea33, eak2);
                                        }
                                    }
                                    i5++;
                                }
                                i6++;
                                if (i6 >= 5) {
                                    break;
                                }
                            }
                        } else {
                            ea32 = A00(handler, ea32, cmv2, (Integer) null, z2, true, true);
                        }
                    } else {
                        handler.removeMessages(3);
                        Object[] A1b = AnonymousClass3MW.A1b();
                        AnonymousClass001.A1Q(cmv2, ea32, A1b);
                        C108955ca.A1F(handler, A1b, 3);
                        if (this.A0b && !z) {
                            cmv2.A07.A01(ea32, (EAK) null);
                        }
                    }
                }
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
            Trace.endSection();
        }
        return ea32;
    }

    public static final Long A04(DDv dDv, Long l) {
        if (l != null) {
            GLES20.glFlush();
            GLES30.glDeleteSync(l.longValue());
        }
        C26045Cr9 cr9 = dDv.A0X;
        if (cr9 == null) {
            throw C17880vN.A0g();
        } else if (cr9.A04.A01 < 3) {
            return null;
        } else {
            Long valueOf = Long.valueOf(GLES30.glFenceSync(37143, 0));
            GLES20.glFlush();
            return valueOf;
        }
    }

    public static final Long A05(Long l) {
        if (l == null) {
            return null;
        }
        Trace.beginSection("WaitForGpuCompletion");
        GLES20.glFlush();
        long longValue = l.longValue();
        GLES30.glWaitSync(longValue, 0, -1);
        GLES30.glDeleteSync(longValue);
        Trace.endSection();
        return null;
    }

    private final void A08(List list) {
        IllegalStateException th;
        EAJ eaj;
        if (this.A0X == null) {
            this.A06 = list;
            return;
        }
        List list2 = this.A0S;
        ArrayList A10 = C17880vN.A10(list2);
        ArrayList A13 = AnonymousClass000.A13();
        list2.clear();
        ArrayList A132 = AnonymousClass000.A13();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C28607E9y e9y = (C28607E9y) list.get(i);
            list2.add(e9y);
            if (!A10.remove(e9y)) {
                A13.add(e9y);
            }
            C26785DDs BGB = this.A0Q.BGB(i);
            C28607E9y e9y2 = BGB.A03;
            if (e9y2 != e9y) {
                if (e9y2 != null) {
                    e9y2.C85();
                }
                BGB.A03 = e9y;
                BGB.A04 = e9y instanceof EDP;
                if (!(e9y == null || (eaj = BGB.A02) == null)) {
                    e9y.C84(eaj.BXf());
                }
            }
            A132.add(BGB);
        }
        int size2 = A10.size();
        for (int i2 = 0; i2 < size2; i2++) {
            C28607E9y e9y3 = (C28607E9y) A10.get(i2);
            if (e9y3 instanceof C28561E7n) {
                ((C28561E7n) e9y3).CKM((C26856DGn) null);
            }
            if (e9y3 instanceof DGT) {
                DGT dgt = (DGT) e9y3;
                C26294Cx6.A01(BE8.A0Z(dgt), "null", "FbMsqrdRenderer", "FbMsqrdRenderer %s - setLogger %s");
                dgt.A0d = null;
            }
        }
        C26856DGn dGn = this.A0J;
        EDJ edj = this.A05;
        int size3 = A13.size();
        for (int i3 = 0; i3 < size3; i3++) {
            C28607E9y e9y4 = (C28607E9y) A13.get(i3);
            if (e9y4 instanceof C28561E7n) {
                ((C28561E7n) e9y4).CKM(dGn);
            }
            if (e9y4 instanceof DGT) {
                DGT dgt2 = (DGT) e9y4;
                C26294Cx6.A01(BE8.A0Z(dgt2), BE8.A0Z(edj), "FbMsqrdRenderer", "FbMsqrdRenderer %s - setLogger %s");
                dgt2.A0d = edj;
                boolean z = edj instanceof BUX;
                if (z) {
                    C26294Cx6.A07("FbMsqrdRenderer", "Dummy Logger used !!!");
                }
                QuickPerformanceLogger A002 = AnonymousClass9TA.A00();
                if (A002 != null) {
                    short s = 2;
                    if (z) {
                        s = 3;
                    }
                    A002.markerGenerate(11282540, s, 1, TimeUnit.MILLISECONDS);
                }
            }
        }
        C26784DDr dDr = this.A0L;
        synchronized (dDr) {
            C26045Cr9 cr9 = dDr.A01;
            if (cr9 != null) {
                ArrayList A133 = AnonymousClass000.A13();
                ArrayList A102 = C17880vN.A10(A132);
                C25132CZh cZh = dDr.A06;
                List list3 = cZh.A00;
                int A082 = BE7.A08(list3);
                for (int i4 = 0; i4 < A082; i4++) {
                    Object obj = list3.get(i4);
                    C18070vi.A0X(obj);
                    C26785DDs dDs = (C26785DDs) obj;
                    if (A102.remove(dDs)) {
                        A132.set(A132.indexOf(dDs), dDs);
                    } else {
                        A133.add(dDs);
                    }
                }
                int size4 = A133.size();
                for (int i5 = 0; i5 < size4; i5++) {
                    C26785DDs dDs2 = (C26785DDs) A133.get(i5);
                    if (dDs2 instanceof E98) {
                        cr9.A04(dDs2);
                    }
                }
                int size5 = A102.size();
                for (int i6 = 0; i6 < size5; i6++) {
                    C26785DDs dDs3 = (C26785DDs) A102.get(i6);
                    if (dDs3 instanceof E98) {
                        cr9.A03(dDs3);
                    }
                }
                cZh.A00();
                synchronized (cZh) {
                    try {
                        if (!A132.isEmpty()) {
                            int size6 = A132.size();
                            ArrayList A0y = BE9.A0y(cZh.A00, size6);
                            A0y.addAll(cZh.A00);
                            boolean z2 = false;
                            for (int i7 = 0; i7 < size6; i7++) {
                                Object obj2 = A132.get(i7);
                                if (!cZh.A00.contains(obj2)) {
                                    A0y.add(obj2);
                                    z2 = true;
                                }
                            }
                            if (z2) {
                                cZh.A00 = Collections.unmodifiableList(A0y);
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            } else {
                th = AnonymousClass000.A0n("GlRenderChain.init() must be called before setGlRenderers()");
                throw th;
            }
        }
    }

    private final boolean A09() {
        Looper looper;
        if (this.A08 && this.A0W != null) {
            Looper myLooper = Looper.myLooper();
            Handler handler = this.A0W;
            if (handler != null) {
                looper = handler.getLooper();
            } else {
                looper = null;
            }
            if (C18070vi.A18(myLooper, looper)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public boolean Bcs() {
        List list = this.A0L.A06.A00;
        int A082 = BE7.A08(list);
        for (int i = 0; i < A082; i++) {
            C28607E9y e9y = ((C26785DDs) list.get(i)).A03;
            if (e9y != null && e9y.isEnabled()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [java.lang.Object, X.E7m] */
    /* JADX WARNING: type inference failed for: r0v9, types: [X.DGb, java.lang.Object, X.E7m] */
    /* JADX WARNING: type inference failed for: r0v10, types: [X.DGa, java.lang.Object, X.E7m] */
    /* JADX WARNING: type inference failed for: r0v12, types: [X.DGc, java.lang.Object, X.E7m] */
    /* JADX WARNING: type inference failed for: r0v13, types: [X.DGd, java.lang.Object, X.E7m] */
    public void CRE(int i, int i2, int i3, int i4, int i5, boolean z) {
        Integer num;
        if (i == 0) {
            float f = this.A00;
            this.A0C = BE6.A04((float) i2, f);
            this.A0B = BE6.A04((float) i3, f);
            this.A0F = i4;
            this.A0D = i5;
            this.A09 = C72463Mc.A00(this.A0P);
            this.A0A = 0;
            this.A0E = 0;
            C26779DDj dDj = this.A0K;
            if (dDj != null) {
                int i6 = this.A0C;
                int i7 = this.A0B;
                C26359CyL cyL = dDj.A04;
                if (i6 > 0 && i7 > 0) {
                    int max = Math.max(i6, i7);
                    int i8 = (i6 * 600) / max;
                    cyL.A02 = i8;
                    int i9 = (i7 * 600) / max;
                    cyL.A01 = i9;
                    cyL.A02 = i8 - (i8 % 2);
                    cyL.A01 = i9 - (i9 % 2);
                }
                if (cyL.A0G) {
                    cyL.A08.post(cyL.A0B);
                    if (cyL.A06) {
                        ConditionVariable conditionVariable = cyL.A07;
                        conditionVariable.block();
                        conditionVariable.close();
                    }
                }
            }
            C26856DGn dGn = this.A0J;
            dGn.CCm(new Object(), (C28561E7n) null);
            int i10 = this.A0C;
            int i11 = this.A0B;
            ? obj = new Object();
            obj.A01 = i10;
            obj.A00 = i11;
            dGn.CCm(obj, (C28561E7n) null);
            if (z) {
                num = AnonymousClass00R.A00;
            } else {
                num = AnonymousClass00R.A01;
            }
            ? obj2 = new Object();
            obj2.A00 = num;
            dGn.CCm(obj2, (C28561E7n) null);
            int i12 = this.A0E / 90;
            int i13 = this.A0A;
            ? obj3 = new Object();
            obj3.A00 = i12;
            obj3.A01 = i13;
            dGn.CCm(obj3, (C28561E7n) null);
            int i14 = this.A0F;
            int i15 = this.A0D;
            float f2 = this.A09;
            ? obj4 = new Object();
            obj4.A02 = i14;
            obj4.A01 = i15;
            obj4.A00 = f2;
            dGn.CCm(obj4, (C28561E7n) null);
        }
    }

    public static final void A06(DDv dDv, C28560E7m e7m, C28561E7n e7n) {
        Message obtainMessage;
        if (!e7m.BIP()) {
            dDv.A07(e7m, e7n);
        } else if (!dDv.A08 || dDv.A02 != null) {
            Handler handler = dDv.A02;
            if (handler != null) {
                if (e7n != null) {
                    Object[] objArr = new Object[2];
                    AnonymousClass3MY.A1V(e7m, e7n, objArr);
                    obtainMessage = handler.obtainMessage(2, objArr);
                } else {
                    obtainMessage = handler.obtainMessage(1, e7m);
                }
                handler.sendMessage(obtainMessage);
                return;
            }
            throw C17880vN.A0g();
        }
    }

    private final void A07(C28560E7m e7m, C28561E7n e7n) {
        CJH cjh;
        C0O Bap = e7m.Bap();
        int ordinal = Bap.ordinal();
        if (ordinal == 33) {
            A08(((DGe) e7m).A00);
        } else if (ordinal == 39) {
            throw AnonymousClass000.A0s("mIsSingleFrameSource");
        } else if (ordinal != 38) {
            if (Bap == C0O.A0V) {
                this.A0T.set(0);
            }
            this.A0J.CCm(e7m, e7n);
        }
        if (Bap == C0O.A0V && (cjh = this.A03) != null) {
            List<C28607E9y> list = this.A0S;
            C18070vi.A0d(list, 0);
            C22805BPt bPt = cjh.A00;
            EDJ edj = bPt.A05;
            if (edj != null) {
                ArrayList A13 = AnonymousClass000.A13();
                for (C28607E9y e9y : list) {
                    if ((e9y instanceof DGT) && !(e9y instanceof BVq) && e9y.isEnabled()) {
                        C24763CJb cJb = new C24763CJb();
                        DGT dgt = (DGT) e9y;
                        HashMap A11 = C17880vN.A11();
                        A11.put("filter_type", "msqrd");
                        String str = dgt.A0A;
                        if (str != null) {
                            A11.put("effect_id", str);
                        }
                        String str2 = dgt.A0B;
                        if (str2 != null) {
                            A11.put("effect_instance_id", str2);
                        }
                        C191959nT r0 = dgt.A0b;
                        if (r0 != null) {
                            A11.put("effect_session_id", r0.A08);
                        }
                        cJb.A00 = A11;
                        A13.add(cJb);
                    }
                }
                Handler BSH = bPt.A06.BSH("Lite-Controller-Thread");
                C18070vi.A0X(BSH);
                C27076DTa.A00(BSH, A13, edj, 0);
            }
        }
    }

    public void BCi(EAJ eaj) {
        if (!A09()) {
            Trace.beginSection("GlProcessorGraph.init");
            this.A0b = true;
            C26856DGn dGn = this.A0J;
            C25553Chr chr = dGn.A01;
            if (chr.A00.compareAndSet(false, true)) {
                C25553Chr.A00(chr);
            }
            dGn.A00.A01.set(true);
            Trace.endSection();
        }
    }

    public void BIY() {
        if (A09()) {
            Trace.beginSection("GlProcessorGraph.detach wait");
            CountDownLatch countDownLatch = this.A0d;
            if (countDownLatch != null) {
                countDownLatch.await(10, TimeUnit.SECONDS);
            }
            this.A0c = A05(this.A0c);
        } else {
            Trace.beginSection("GlProcessorGraph.detach");
            this.A0b = false;
            Long l = this.A0G;
            if (l != null) {
                GLES30.glDeleteSync(l.longValue());
                this.A0G = null;
            }
            Long l2 = this.A0Z;
            if (l2 != null) {
                GLES30.glDeleteSync(l2.longValue());
                this.A0Z = null;
            }
            Long l3 = this.A0a;
            if (l3 != null) {
                GLES30.glDeleteSync(l3.longValue());
                this.A0a = null;
            }
            Long l4 = this.A0c;
            if (l4 != null) {
                GLES30.glDeleteSync(l4.longValue());
                this.A0c = null;
            }
            C26856DGn dGn = this.A0J;
            dGn.A01.A00.set(false);
            dGn.A00.A01.set(false);
        }
        Trace.endSection();
    }

    public void release() {
        if (!A09()) {
            Trace.beginSection("GlProcessorGraph.release");
            List list = this.A0S;
            if (AnonymousClass000.A1a(list)) {
                this.A06 = C17880vN.A10(list);
                A08(C18460wS.A00);
            }
            C26856DGn dGn = this.A0J;
            Arrays.fill(dGn.A01.A02, false);
            dGn.A00.A00.A00();
            dGn.A02.clear();
            Trace.endSection();
        }
    }

    public void CCm(C28560E7m e7m, C28561E7n e7n) {
        A06(this, e7m, e7n);
    }
}
