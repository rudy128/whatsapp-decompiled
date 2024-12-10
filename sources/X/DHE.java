package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class DHE implements EAZ, C28562E7o {
    public static boolean A0Y;
    public static final Object A0Z = C17880vN.A0p();
    public int A00;
    public EAJ A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public E7q A08;
    public boolean A09;
    public final int A0A;
    public final Context A0B;
    public final Handler A0C;
    public final EDC A0D;
    public final C25639CjS A0E;
    public final C25752ClM A0F;
    public final CL0 A0G;
    public final CZT A0H;
    public final C24824CLs A0I;
    public final Object A0J = C17880vN.A0p();
    public final Map A0K;
    public final Map A0L = C17880vN.A11();
    public final Map A0M = AnonymousClass8BR.A17();
    public final int A0N;
    public final Handler A0O;
    public final HandlerThread A0P;
    public final C24764CJc A0Q;
    public final C25998CqE A0R;
    public final C25516ChE A0S;
    public final Object A0T;
    public final boolean A0U;
    public volatile C26052CrM A0V;
    public volatile Exception A0W;
    public volatile boolean A0X;

    /* JADX WARNING: type inference failed for: r0v44, types: [X.DEE, java.lang.Object, X.E4f] */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0096, code lost:
        r0 = r1.getLooper();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public DHE(android.content.Context r13, android.opengl.EGLContext r14, X.C25998CqE r15, X.C25752ClM r16, X.C26052CrM r17, X.C25516ChE r18, X.CZT r19) {
        /*
            r12 = this;
            r4 = 0
            r12.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = X.AnonymousClass8BR.A17()
            r12.A0M = r0
            java.util.HashMap r0 = X.C17880vN.A11()
            r12.A0L = r0
            java.lang.Object r0 = X.C17880vN.A0p()
            r12.A0J = r0
            r2 = r18
            r12.A0S = r2
            java.lang.Object r3 = A0Z
            r12.A0T = r3
            X.CAL r1 = X.C25516ChE.A01
            X.CjS r0 = X.C25639CjS.A01
            java.util.Map r2 = r2.A00
            java.lang.Object r0 = X.BE8.A0e(r1, r0, r2)
            X.CjS r0 = (X.C25639CjS) r0
            r12.A0E = r0
            r12.A0B = r13
            r12.A0R = r15
            X.CJc r0 = new X.CJc
            r0.<init>()
            r12.A0Q = r0
            r0 = r16
            r12.A0F = r0
            r0 = r17
            r12.A0V = r0
            r5 = r19
            r12.A0H = r5
            boolean r0 = r5.A02()
            A0Y = r0
            X.CAL r1 = X.C25516ChE.A05
            r0 = 60000(0xea60, float:8.4078E-41)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = X.BE8.A0e(r1, r0, r2)
            int r0 = X.AnonymousClass000.A0M(r0)
            r12.A0A = r0
            X.CAL r1 = X.C25516ChE.A04
            r0 = 1000(0x3e8, float:1.401E-42)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = X.BE8.A0e(r1, r0, r2)
            int r0 = X.AnonymousClass000.A0M(r0)
            r12.A0N = r0
            X.CAL r0 = X.C25516ChE.A09
            java.lang.Object r0 = r2.get(r0)
            android.os.Handler r0 = (android.os.Handler) r0
            r6 = 0
            if (r0 == 0) goto L_0x01a6
            r12.A0P = r4
            r12.A0O = r0
        L_0x007d:
            X.CAL r0 = X.C25516ChE.A08
            java.lang.Object r0 = X.C26159CtX.A00(r0, r2)
            X.CLs r0 = (X.C24824CLs) r0
            r12.A0I = r0
            android.os.Handler r1 = r12.A0O
            X.DAg r10 = new X.DAg
            r10.<init>(r12)
            android.content.Context r7 = r0.A00
            r0 = 2
            X.C18070vi.A0f(r14, r0, r3)
            if (r1 == 0) goto L_0x009c
            android.os.Looper r0 = r1.getLooper()
            if (r0 != 0) goto L_0x00a0
        L_0x009c:
            android.os.Looper r0 = android.os.Looper.getMainLooper()
        L_0x00a0:
            android.os.Handler r11 = new android.os.Handler
            r11.<init>(r0)
            r1 = 1
            r0 = 3
            X.Ct3 r9 = new X.Ct3
            r9.<init>(r3, r0)
            r9.A04(r14, r1)
            java.lang.String r0 = "LiteVideoProcessor"
            X.Cgc r8 = new X.Cgc
            r8.<init>((java.lang.String) r0)
            X.CdJ r0 = X.EBD.A07
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r6)
            java.util.Map r6 = r8.A00
            r6.put(r0, r1)
            X.CdJ r0 = X.EBD.A0G
            r6.put(r0, r11)
            X.CdJ r0 = X.EBD.A01
            r6.put(r0, r1)
            X.CdJ r0 = X.EBD.A0D
            r6.put(r0, r10)
            X.CdJ r0 = X.EBD.A03
            r6.put(r0, r9)
            X.CdJ r0 = X.EBD.A02
            r6.put(r0, r3)
            X.Ch9 r0 = new X.Ch9
            r0.<init>(r8)
            X.DDU r6 = new X.DDU
            r6.<init>(r7, r0)
            X.BUa r0 = new X.BUa
            r0.<init>(r6)
            r6.A02(r0)
            X.BUW r0 = new X.BUW
            r0.<init>(r6)
            r6.A02(r0)
            X.BUZ r0 = new X.BUZ
            r0.<init>()
            r0.A00 = r6
            r6.A02(r0)
            X.BUd r3 = X.EDC.A01
            X.BPv r0 = new X.BPv
            r0.<init>(r6)
            r6.A01(r0, r3)
            X.CL0 r0 = new X.CL0
            r0.<init>(r6)
            r12.A0G = r0
            X.DDU r0 = r0.A00
            r0.CG0()
            X.EDK r6 = r0.BP7(r3)
            X.EDC r6 = (X.EDC) r6
            r12.A0D = r6
            X.DAh r0 = new X.DAh
            r0.<init>(r12)
            X.BPv r6 = (X.C22807BPv) r6
            r6.A08 = r0
            android.os.Handler r0 = r6.A01
            r12.A0C = r0
            X.CAL r0 = X.C25516ChE.A06
            java.lang.Object r0 = r2.get(r0)
            X.E7q r0 = (X.E7q) r0
            r12.A08 = r0
            X.CAL r0 = X.C25516ChE.A07
            r2.get(r0)
            X.CAL r0 = X.C25516ChE.A02
            java.lang.Object r0 = X.BE8.A0e(r0, r1, r2)
            boolean r0 = X.AnonymousClass000.A1Y(r0)
            r3 = 1
            if (r0 == 0) goto L_0x019a
            r12.A09 = r3
            java.util.concurrent.ConcurrentHashMap r0 = X.AnonymousClass8BR.A17()
            r12.A0K = r0
            X.C26159CtX.A01(r15)
            X.Cyc r0 = r6.A06
            X.Cr9 r4 = r0.A04
            X.C18070vi.A0X(r4)
            X.Ck6 r0 = r6.A05
            if (r0 == 0) goto L_0x0198
            X.ChF r3 = r0.A01
        L_0x015d:
            X.C26159CtX.A01(r3)
            X.DDh r0 = new X.DDh
            r0.<init>(r15, r3, r4)
            r12.A01 = r0
        L_0x0167:
            X.CAL r0 = X.C25516ChE.A03
            java.lang.Object r0 = X.BE8.A0e(r0, r1, r2)
            boolean r0 = X.AnonymousClass000.A1Y(r0)
            r12.A03 = r0
            X.CAL r0 = X.C25516ChE.A0B
            java.lang.Object r0 = X.BE8.A0e(r0, r1, r2)
            boolean r0 = X.AnonymousClass000.A1Y(r0)
            r12.A05 = r0
            X.CAL r0 = X.C25516ChE.A0A
            java.lang.Object r0 = X.BE8.A0e(r0, r1, r2)
            boolean r0 = X.AnonymousClass000.A1Y(r0)
            r12.A0U = r0
            X.CAL r0 = X.C25516ChE.A0C
            java.lang.Object r0 = X.BE8.A0e(r0, r1, r2)
            boolean r0 = X.AnonymousClass000.A1Y(r0)
            r12.A06 = r0
            return
        L_0x0198:
            r3 = 0
            goto L_0x015d
        L_0x019a:
            boolean r0 = r5 instanceof X.BWA
            if (r0 != 0) goto L_0x019f
            r3 = 0
        L_0x019f:
            r12.A09 = r3
            r12.A0K = r4
            r12.A01 = r4
            goto L_0x0167
        L_0x01a6:
            X.CAL r1 = X.C25516ChE.A0D
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            java.lang.Object r0 = X.BE8.A0e(r1, r0, r2)
            boolean r0 = X.AnonymousClass000.A1Y(r0)
            if (r0 != 0) goto L_0x01de
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "AR-Frame-Lite-Renderer-Render-Thread-"
            r1.append(r0)
            int r0 = r12.hashCode()
            java.lang.String r1 = X.C17880vN.A0t(r1, r0)
            android.os.HandlerThread r0 = new android.os.HandlerThread
            r0.<init>(r1)
            r12.A0P = r0
            android.os.Looper r1 = X.BE7.A0G(r0)
            X.C26159CtX.A01(r1)
            android.os.Handler r0 = new android.os.Handler
            r0.<init>(r1)
            r12.A0O = r0
            goto L_0x007d
        L_0x01de:
            r12.A0P = r4
            r12.A0O = r4
            goto L_0x007d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DHE.<init>(android.content.Context, android.opengl.EGLContext, X.CqE, X.ClM, X.CrM, X.ChE, X.CZT):void");
    }

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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public synchronized void BJS(long r14) {
        /*
            r13 = this;
            monitor-enter(r13)
            java.lang.String r0 = "ArFrameLiteRenderer.drawFrame()"
            android.os.Trace.beginSection(r0)     // Catch:{ all -> 0x01a5 }
            java.util.Map r5 = r13.A0M     // Catch:{ all -> 0x01a5 }
            boolean r0 = r5.isEmpty()     // Catch:{ all -> 0x01a5 }
            r4 = 1
            r1 = r0 ^ 1
            java.lang.String r0 = "init() hasn't been called yet!"
            X.C26159CtX.A04(r1, r0)     // Catch:{ all -> 0x01a5 }
            X.CJc r1 = r13.A0Q     // Catch:{ all -> 0x01a5 }
            monitor-enter(r1)     // Catch:{ all -> 0x01a5 }
            r1.A00 = r14     // Catch:{ all -> 0x019d }
            monitor-exit(r1)     // Catch:{ all -> 0x01a5 }
            java.util.Map r1 = r13.A0K     // Catch:{ all -> 0x01a5 }
            if (r1 == 0) goto L_0x0132
            java.lang.String r0 = "ArFrameLiteRenderer.renderAsync()"
            android.os.Trace.beginSection(r0)     // Catch:{ all -> 0x01a0 }
            java.util.Iterator r12 = X.AnonymousClass000.A15(r1)     // Catch:{ all -> 0x01a0 }
        L_0x0027:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x01a0 }
            if (r0 == 0) goto L_0x011a
            java.util.Map$Entry r1 = X.AnonymousClass000.A16(r12)     // Catch:{ all -> 0x01a0 }
            java.lang.Object r0 = r1.getKey()     // Catch:{ all -> 0x01a0 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x01a0 }
            java.lang.Object r6 = r1.getValue()     // Catch:{ all -> 0x01a0 }
            X.DE2 r6 = (X.DE2) r6     // Catch:{ all -> 0x01a0 }
            java.lang.Object r3 = r5.get(r0)     // Catch:{ all -> 0x01a0 }
            X.DDp r3 = (X.C26783DDp) r3     // Catch:{ all -> 0x01a0 }
            X.C26159CtX.A01(r3)     // Catch:{ all -> 0x01a0 }
            boolean r0 = r13.A02     // Catch:{ all -> 0x01a0 }
            if (r0 != 0) goto L_0x005a
            X.EAJ r2 = r13.A01     // Catch:{ all -> 0x01a0 }
            X.C26159CtX.A01(r2)     // Catch:{ all -> 0x01a0 }
            X.CWU r1 = r6.A02     // Catch:{ all -> 0x01a0 }
            monitor-enter(r1)     // Catch:{ all -> 0x01a0 }
            r1.A01 = r2     // Catch:{ all -> 0x012f }
            monitor-exit(r1)     // Catch:{ all -> 0x01a0 }
            X.DDk r0 = r6.A04     // Catch:{ all -> 0x01a0 }
            r0.BCi(r2)     // Catch:{ all -> 0x01a0 }
        L_0x005a:
            X.EAJ r8 = r13.A01     // Catch:{ all -> 0x01a0 }
            X.EA3 r2 = r3.BRy()     // Catch:{ all -> 0x01a0 }
            java.lang.Object r3 = r6.A05     // Catch:{ InterruptedException -> 0x0027 }
            monitor-enter(r3)     // Catch:{ InterruptedException -> 0x0027 }
        L_0x0063:
            int r0 = r6.A00     // Catch:{ all -> 0x0117 }
            if (r0 < r4) goto L_0x0077
            r0 = 5000(0x1388, double:2.4703E-320)
            r3.wait(r0)     // Catch:{ all -> 0x0117 }
            int r0 = r6.A00     // Catch:{ all -> 0x0117 }
            if (r0 < r4) goto L_0x0063
            java.lang.String r0 = "media pipeline rendering took too long :("
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0w(r0)     // Catch:{ all -> 0x0117 }
        L_0x0076:
            throw r0     // Catch:{ all -> 0x0117 }
        L_0x0077:
            int r0 = r0 + 1
            r6.A00 = r0     // Catch:{ all -> 0x0117 }
            X.CWU r10 = r6.A02     // Catch:{ all -> 0x0117 }
            monitor-enter(r10)     // Catch:{ all -> 0x0117 }
            X.EAJ r0 = r10.A01     // Catch:{ all -> 0x0113 }
            X.C26159CtX.A01(r0)     // Catch:{ all -> 0x0113 }
            java.util.LinkedList r1 = r10.A03     // Catch:{ all -> 0x0113 }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x0113 }
            if (r0 == 0) goto L_0x00d6
            X.BUV r11 = new X.BUV     // Catch:{ all -> 0x0113 }
            r11.<init>()     // Catch:{ all -> 0x0113 }
            java.lang.String r0 = "glBufferedInputInput"
            r11.A00 = r0     // Catch:{ all -> 0x0113 }
            X.BUS r9 = new X.BUS     // Catch:{ all -> 0x0113 }
            r9.<init>()     // Catch:{ all -> 0x0113 }
            java.lang.String r0 = "glBufferedInputOutput"
            r9.A00 = r0     // Catch:{ all -> 0x0113 }
            X.CjS r1 = r10.A02     // Catch:{ all -> 0x0113 }
            r0 = 0
            X.DE4 r7 = new X.DE4     // Catch:{ all -> 0x0113 }
            r7.<init>(r1, r11, r9, r0)     // Catch:{ all -> 0x0113 }
            X.CWX r0 = r2.Bbf()     // Catch:{ all -> 0x0113 }
            X.C26159CtX.A01(r0)     // Catch:{ all -> 0x0113 }
            X.CWX r0 = r2.Bbf()     // Catch:{ all -> 0x0113 }
            int r9 = r0.A01     // Catch:{ all -> 0x0113 }
            X.CWX r0 = r2.Bbf()     // Catch:{ all -> 0x0113 }
            int r1 = r0.A00     // Catch:{ all -> 0x0113 }
            int r0 = r2.BQb()     // Catch:{ all -> 0x0113 }
            r7.A03(r9, r1, r0)     // Catch:{ all -> 0x0113 }
            X.EAJ r0 = r10.A01     // Catch:{ all -> 0x0113 }
            r7.BCi(r0)     // Catch:{ all -> 0x0113 }
            int r0 = r10.A00     // Catch:{ all -> 0x0113 }
            int r0 = r0 + 1
            r10.A00 = r0     // Catch:{ all -> 0x0113 }
        L_0x00ca:
            X.C26159CtX.A01(r7)     // Catch:{ all -> 0x0113 }
            long r0 = r2.BaR()     // Catch:{ all -> 0x0113 }
            X.DE1 r9 = r7.A08     // Catch:{ all -> 0x0113 }
            r9.A03 = r0     // Catch:{ all -> 0x0113 }
            goto L_0x00de
        L_0x00d6:
            r0 = 0
            java.lang.Object r7 = r1.remove(r0)     // Catch:{ all -> 0x0113 }
            X.DE4 r7 = (X.DE4) r7     // Catch:{ all -> 0x0113 }
            goto L_0x00ca
        L_0x00de:
            monitor-exit(r10)     // Catch:{ all -> 0x0117 }
            X.DDk r0 = r6.A04     // Catch:{ all -> 0x0117 }
            r0.A00(r8, r2, r7)     // Catch:{ all -> 0x0117 }
            X.CJI r2 = r6.A03     // Catch:{ all -> 0x0117 }
            r1 = 37143(0x9117, float:5.2048E-41)
            r0 = 0
            long r0 = android.opengl.GLES30.glFenceSync(r1, r0)     // Catch:{ all -> 0x0117 }
            r2.A00 = r0     // Catch:{ all -> 0x0117 }
            java.lang.String r0 = "after gl fence"
            X.C26058CrU.A01(r0)     // Catch:{ all -> 0x0117 }
            long r1 = r2.A00     // Catch:{ all -> 0x0117 }
            r8 = 0
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x010b
            android.opengl.GLES20.glFlush()     // Catch:{ all -> 0x0117 }
            java.util.List r0 = r6.A06     // Catch:{ all -> 0x0117 }
            r0.add(r7)     // Catch:{ all -> 0x0117 }
            r3.notifyAll()     // Catch:{ all -> 0x0117 }
            monitor-exit(r3)     // Catch:{ all -> 0x0117 }
            goto L_0x0027
        L_0x010b:
            java.lang.String r0 = "gl fence creation failed"
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0w(r0)     // Catch:{ all -> 0x0117 }
            goto L_0x0076
        L_0x0113:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0117 }
            goto L_0x0076
        L_0x0117:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0117 }
            throw r0     // Catch:{ InterruptedException -> 0x0027 }
        L_0x011a:
            java.lang.Object r1 = r13.A0J     // Catch:{ all -> 0x01a0 }
            monitor-enter(r1)     // Catch:{ all -> 0x01a0 }
            int r0 = r13.A00     // Catch:{ all -> 0x012c }
            int r0 = r0 + 1
            r13.A00 = r0     // Catch:{ all -> 0x012c }
            monitor-exit(r1)     // Catch:{ all -> 0x012c }
            r0 = 0
            r13.A00(r14, r0)     // Catch:{ all -> 0x01a0 }
            android.os.Trace.endSection()     // Catch:{ all -> 0x01a5 }
            goto L_0x0196
        L_0x012c:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x012c }
            goto L_0x0131
        L_0x012f:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x01a0 }
        L_0x0131:
            throw r0     // Catch:{ all -> 0x01a0 }
        L_0x0132:
            java.lang.String r0 = "ArFrameLiteRenderer.renderSync()"
            android.os.Trace.beginSection(r0)     // Catch:{ IllegalStateException -> 0x0193 }
            java.lang.Object r3 = r13.A0J     // Catch:{ IllegalStateException -> 0x0193 }
            monitor-enter(r3)     // Catch:{ IllegalStateException -> 0x0193 }
        L_0x013a:
            boolean r0 = r13.A04     // Catch:{ all -> 0x0190 }
            if (r0 != 0) goto L_0x018b
            boolean r0 = r13.A05     // Catch:{ all -> 0x0190 }
            r13.A00(r14, r0)     // Catch:{ all -> 0x0190 }
            X.CZT r0 = r13.A0H     // Catch:{ InterruptedException -> 0x018b }
            boolean r0 = r0 instanceof X.BWA     // Catch:{ InterruptedException -> 0x018b }
            if (r0 == 0) goto L_0x0161
            r5 = 0
        L_0x014b:
            int r0 = r13.A0A     // Catch:{ InterruptedException -> 0x018b }
            long r0 = (long) r0     // Catch:{ InterruptedException -> 0x018b }
            r3.wait(r0)     // Catch:{ InterruptedException -> 0x018b }
            long r5 = r5 + r0
            boolean r0 = r13.A04     // Catch:{ InterruptedException -> 0x018b }
            if (r0 != 0) goto L_0x0167
            boolean r0 = r13.A0X     // Catch:{ InterruptedException -> 0x018b }
            if (r0 != 0) goto L_0x0167
            r1 = 10000(0x2710, double:4.9407E-320)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x014b
            goto L_0x0167
        L_0x0161:
            int r0 = r13.A0A     // Catch:{ InterruptedException -> 0x018b }
            long r0 = (long) r0     // Catch:{ InterruptedException -> 0x018b }
            r3.wait(r0)     // Catch:{ InterruptedException -> 0x018b }
        L_0x0167:
            boolean r0 = r13.A04     // Catch:{ InterruptedException -> 0x018b }
            if (r0 != 0) goto L_0x013a
            java.lang.Exception r2 = r13.A0W     // Catch:{ InterruptedException -> 0x018b }
            r0 = 0
            r13.A0W = r0     // Catch:{ InterruptedException -> 0x018b }
            if (r2 == 0) goto L_0x0185
            boolean r0 = r2 instanceof java.lang.RuntimeException     // Catch:{ InterruptedException -> 0x018b }
            if (r0 != 0) goto L_0x018a
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ InterruptedException -> 0x018b }
            java.lang.String r0 = "ARFrameLiteRenderer render failed with exception: "
            java.lang.String r0 = X.C17900vP.A0C(r0, r1, r2)     // Catch:{ InterruptedException -> 0x018b }
            java.lang.RuntimeException r0 = X.BE6.A0o(r0, r2)     // Catch:{ InterruptedException -> 0x018b }
            throw r0     // Catch:{ InterruptedException -> 0x018b }
        L_0x0185:
            X.DZi r2 = new X.DZi     // Catch:{ InterruptedException -> 0x018b }
            r2.<init>()     // Catch:{ InterruptedException -> 0x018b }
        L_0x018a:
            throw r2     // Catch:{ InterruptedException -> 0x018b }
        L_0x018b:
            r0 = 0
            r13.A04 = r0     // Catch:{ all -> 0x0190 }
            monitor-exit(r3)     // Catch:{ all -> 0x0190 }
            goto L_0x0193
        L_0x0190:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0190 }
            throw r0     // Catch:{ IllegalStateException -> 0x0193 }
        L_0x0193:
            android.os.Trace.endSection()     // Catch:{ all -> 0x01a5 }
        L_0x0196:
            r13.A02 = r4     // Catch:{ all -> 0x01a5 }
            android.os.Trace.endSection()     // Catch:{ all -> 0x01aa }
            monitor-exit(r13)
            return
        L_0x019d:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x01a5 }
            goto L_0x01a4
        L_0x01a0:
            r0 = move-exception
            android.os.Trace.endSection()     // Catch:{ all -> 0x01a5 }
        L_0x01a4:
            throw r0     // Catch:{ all -> 0x01a5 }
        L_0x01a5:
            r0 = move-exception
            android.os.Trace.endSection()     // Catch:{ all -> 0x01aa }
            throw r0     // Catch:{ all -> 0x01aa }
        L_0x01aa:
            r0 = move-exception
            monitor-exit(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DHE.BJS(long):void");
    }

    public void CJq(Surface surface) {
        C25742ClC clC = new C25742ClC(surface, false);
        clC.A04 = 0;
        C25752ClM clM = this.A0F;
        clC.A01 = (clM.A09 + clM.A04) % 360;
        DE3 de3 = new DE3((C28656ECq) null, this.A0E, clC);
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        de3.A06 = -1;
        de3.A05 = -1;
        de3.A09 = timeUnit;
        de3.A0D = this.A09;
        int i = 1;
        if (this.A0U) {
            i = 2;
        }
        de3.A03 = i;
        C17880vN.A1O(de3, this.A0L, 0);
        DDR.A08(this.A0D).A03(de3, 0);
    }

    public void cancel() {
        this.A0X = true;
    }

    private void A00(long j, boolean z) {
        if (this.A0K == null || ((C22807BPv) this.A0D).A06.A04.A04.A01 >= 3) {
            EDC edc = this.A0D;
            ((C22807BPv) edc).A07.A01(Long.valueOf(j), z);
            return;
        }
        throw AnonymousClass8BR.A0w("enableAsyncRendering can be only enabled for devices supporting open gl es 3");
    }

    public void BB7(MediaEffect mediaEffect) {
        C27076DTa.A00(this.A0C, this, mediaEffect, 34);
    }

    public void BBq(int i) {
        this.A0C.post(new AnonymousClass7RP(this, i, 12));
    }

    public void BJ2(long j) {
        if (!this.A09) {
            Trace.beginSection("ArFrameLiteRenderer.displayFrame()");
            try {
                synchronized (this.A0J) {
                    CountDownLatch A0u = BE7.A0u();
                    this.A0C.post(new DTZ(this, A0u, j));
                    A0u.await((long) this.A0A, TimeUnit.MILLISECONDS);
                }
            } catch (InterruptedException unused) {
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
            Trace.endSection();
        }
    }

    public SurfaceTexture BT6(int i) {
        Map map = this.A0M;
        Integer valueOf = Integer.valueOf(i);
        C26159CtX.A04(map.containsKey(valueOf), "init() hasn't been called yet!");
        try {
            C25745ClF clF = ((C26783DDp) C26159CtX.A00(valueOf, map)).A08;
            if (clF.A0A) {
                return null;
            }
            clF.A04.await(5000, TimeUnit.MILLISECONDS);
            return clF.A00;
        } catch (InterruptedException unused) {
            return null;
        }
    }

    /* JADX WARNING: type inference failed for: r1v9, types: [X.DGu, java.lang.Object] */
    public synchronized void Bd6() {
        RuntimeException th;
        boolean z;
        C25092CXd cXd;
        boolean z2;
        synchronized (this) {
            this.A0X = false;
            HashMap A062 = this.A0V.A06(C24322BzJ.VIDEO);
            C26159CtX.A01(A062);
            Iterator A0i = C17890vO.A0i(A062);
            while (A0i.hasNext()) {
                Map.Entry A16 = AnonymousClass000.A16(A0i);
                C25271CcJ A0Q2 = BE9.A0Q(((C25833Cmm) A16.getValue()).A04);
                File file = A0Q2.A05;
                try {
                    if (A0Q2.A04 == C24250By8.MULTI_PHOTO) {
                        throw BE6.A0m();
                    }
                    if (A0Q2.A02(A0Y)) {
                        C26159CtX.A01(file);
                        cXd = new Object().BKv(Uri.fromFile(file));
                        z = true;
                    } else {
                        C26159CtX.A01(file);
                        E7q e7q = this.A08;
                        if (e7q != null) {
                            cXd = BE7.A0I(e7q, file);
                        } else {
                            cXd = C25872Cng.A01(this.A0B, Uri.fromFile(file).toString());
                            C26159CtX.A01(cXd);
                        }
                        z = false;
                    }
                    C26159CtX.A01(cXd);
                    int i = cXd.A05;
                    int i2 = i;
                    boolean z3 = this.A03;
                    if (z3 && i % 16 != 0) {
                        i2 = ((i / 16) * 16) + 16;
                    }
                    int i3 = cXd.A03;
                    int i4 = i3;
                    if (z3 && i3 % 16 != 0) {
                        i4 = ((i3 / 16) * 16) + 16;
                    }
                    int i5 = cXd.A04;
                    CRD crd = new CRD(i2, i4, i5, cXd.A02);
                    Integer num = (Integer) A16.getKey();
                    C24764CJc cJc = this.A0Q;
                    if (this.A0H instanceof BWA) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    C26783DDp dDp = new C26783DDp(new C25745ClF(crd, cJc, this.A0T, z2, z), !z);
                    dDp.A0B.A00 = "transcoderVideoInput";
                    StringBuilder A10 = AnonymousClass000.A10();
                    BE8.A1C(A10, i);
                    A10.append(i3);
                    BE6.A1K(A10);
                    A10.append("rotation:");
                    A10.append(i5);
                    if (z3 && !(i % 16 == 0 && i3 % 16 == 0)) {
                        A10.append(",multipleOf16FixEnabled:true");
                        dDp.A03 = C108965cb.A04(((float) i) / ((float) i2), ((float) i3) / ((float) i4));
                    }
                    this.A0M.put(num, dDp);
                    Map map = this.A0K;
                    if (map != null) {
                        map.put(num, new DE2(this.A0E));
                    }
                    CV8 cv8 = this.A0E.A00;
                    String obj = A10.toString();
                    synchronized (cv8) {
                        try {
                            cv8.A00.put("ARFrameLiteRenderer.inputMetadata", obj);
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    }
                } catch (IOException e) {
                    th = AnonymousClass8BR.A0x(e);
                    throw th;
                }
            }
            this.A0C.post(new C27081DTg(this.A0M, this, this.A0K, 29));
        }
    }

    public void Bzo() {
        if (this.A07) {
            Iterator A15 = AnonymousClass000.A15(this.A0L);
            while (A15.hasNext()) {
                Map.Entry A16 = AnonymousClass000.A16(A15);
                DDR.A08(this.A0D).A03((EAK) A16.getValue(), AnonymousClass8BV.A04(A16));
                this.A07 = false;
            }
        }
    }

    public void Bzp() {
        Iterator A15 = AnonymousClass000.A15(this.A0L);
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            DDR.A08(this.A0D).A02(AnonymousClass8BV.A04(A16), A16.getValue());
            this.A07 = true;
        }
    }

    public void CEe(MediaEffect mediaEffect) {
        C27076DTa.A00(this.A0C, this, mediaEffect, 35);
    }

    public void CQV(int i, Bitmap bitmap) {
        boolean z;
        boolean z2 = this.A0H instanceof BWA;
        if (z2) {
            z = true;
        } else {
            z = false;
            BT6(i);
        }
        Object A0w = AnonymousClass000.A0w(this.A0M, i);
        C26159CtX.A01(A0w);
        C25745ClF clF = ((C26783DDp) A0w).A08;
        if (z) {
            try {
                clF.A04.await(5000, TimeUnit.MILLISECONDS);
            } catch (InterruptedException unused) {
            }
        }
        if (z2) {
            CountDownLatch A0u = BE7.A0u();
            try {
                this.A0C.post(new C27081DTg(A0u, clF, bitmap, 28));
                long j = 0;
                do {
                    long j2 = (long) this.A0A;
                    A0u.await(j2, TimeUnit.MILLISECONDS);
                    j += j2;
                    if (A0u.getCount() <= 0 || this.A0X || j >= 10000) {
                    }
                    long j22 = (long) this.A0A;
                    A0u.await(j22, TimeUnit.MILLISECONDS);
                    j += j22;
                    return;
                } while (j >= 10000);
            } catch (InterruptedException e) {
                throw AnonymousClass8BR.A0x(e);
            }
        } else {
            CZB czb = clF.A03;
            if (czb != null) {
                GLES20.glBindTexture(3553, czb.A00);
                GLUtils.texImage2D(3553, 0, bitmap, 0);
                GLES20.glFlush();
            }
        }
    }

    public void finalize() {
        HandlerThread handlerThread = this.A0P;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            try {
                handlerThread.join(1000);
            } catch (InterruptedException unused) {
                AnonymousClass8BS.A0x();
            }
        }
    }

    public void flush() {
        if (this.A0K != null) {
            try {
                Object obj = this.A0J;
                synchronized (obj) {
                    int i = this.A00;
                    while (i > 0) {
                        obj.wait((long) this.A0A);
                        int i2 = this.A00;
                        if (i2 < i) {
                            i = i2;
                        } else {
                            StringBuilder A10 = AnonymousClass000.A10();
                            A10.append("waiting for finishing render queue took too long :( ");
                            A10.append(i);
                            throw BEA.A0h(" ", A10, i2);
                        }
                    }
                }
            } catch (InterruptedException unused) {
            }
        }
    }

    public final void release() {
        Map map = this.A0K;
        if (map != null) {
            Iterator A0l = C17890vO.A0l(map);
            while (A0l.hasNext()) {
                DE2 de2 = (DE2) A0l.next();
                synchronized (de2.A05) {
                    DE4 de4 = de2.A01;
                    if (de4 != null) {
                        de2.A02.A00(de4);
                        de2.A01 = null;
                    }
                    for (DE4 A002 : de2.A06) {
                        de2.A02.A00(A002);
                    }
                    CWU cwu = de2.A02;
                    synchronized (cwu) {
                        try {
                            int i = cwu.A00;
                            LinkedList linkedList = cwu.A03;
                            boolean A1T = AnonymousClass000.A1T(i, linkedList.size());
                            StringBuilder A10 = AnonymousClass000.A10();
                            A10.append("not all buffers were returned, we have a memory leak :(");
                            A10.append(i);
                            C17890vO.A14(" ", A10, linkedList);
                            String obj = A10.toString();
                            if (A1T) {
                                Iterator it = linkedList.iterator();
                                while (it.hasNext()) {
                                    it.next();
                                }
                            } else {
                                throw AnonymousClass000.A0k(obj);
                            }
                        } catch (Exception e) {
                            throw AnonymousClass8BR.A0x(e);
                        }
                    }
                    de2.A04.BIY();
                }
            }
        }
        boolean z = this.A0H instanceof BWA;
        if (z) {
            Iterator A15 = AnonymousClass000.A15(this.A0L);
            while (A15.hasNext()) {
                Map.Entry A16 = AnonymousClass000.A16(A15);
                DDR.A08(this.A0D).A02(AnonymousClass8BV.A04(A16), A16.getValue());
                this.A07 = true;
            }
        }
        this.A0G.A00.destroy();
        if (z) {
            EDC edc = this.A0D;
            int i2 = this.A0N;
            CountDownLatch countDownLatch = ((C22807BPv) edc).A0A;
            if (countDownLatch != null) {
                try {
                    countDownLatch.await((long) i2, TimeUnit.MILLISECONDS);
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    public void CCl(C28560E7m e7m) {
    }

    public void CCm(C28560E7m e7m, C28561E7n e7n) {
    }
}
