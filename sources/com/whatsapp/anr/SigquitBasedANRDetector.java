package com.whatsapp.anr;

import X.A1V;
import X.AnonymousClass00H;
import X.AnonymousClass11C;
import X.AnonymousClass11P;
import X.C18030ve;
import X.C223919s;
import X.C22501Ai;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.regex.Pattern;

public class SigquitBasedANRDetector {
    public HandlerThread A00;
    public Pattern A01;
    public Pattern A02;
    public String A03;
    public final C22501Ai A04;
    public final AnonymousClass11P A05;
    public final C18030ve A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09;
    public final Object A0A = new Object();
    public final Object A0B = new Object();
    public volatile Handler A0C;
    public volatile boolean A0D;
    public volatile boolean A0E;

    public static native void init(SigquitBasedANRDetector sigquitBasedANRDetector, int i);

    public static native boolean startDetector();

    public SigquitBasedANRDetector(AnonymousClass11C r4, AnonymousClass11P r5, C18030ve r6, AnonymousClass00H r7, AnonymousClass00H r8, AnonymousClass00H r9) {
        int i = Build.VERSION.SDK_INT;
        C22501Ai r1 = new C22501Ai(r4);
        this.A05 = r5;
        this.A06 = r6;
        this.A08 = r7;
        this.A09 = r8;
        this.A04 = r1;
        this.A07 = r9;
        init(this, i);
    }

    public static void A00(SigquitBasedANRDetector sigquitBasedANRDetector, String str) {
        if (Build.VERSION.SDK_INT < 33) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append("sigquit_exitinfo_");
                sb.append(C223919s.A00);
                ((A1V) sigquitBasedANRDetector.A08.get()).A01(str, sb.toString());
            } catch (IOException e) {
                Log.e("SigquitBasedANRDetector/failed-to-save-sigquit", e);
            }
        }
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void anrDetected(java.lang.String r13) {
        /*
            r12 = this;
            long r8 = android.os.SystemClock.uptimeMillis()
            long r10 = android.os.SystemClock.elapsedRealtimeNanos()
            boolean r0 = android.os.Debug.isDebuggerConnected()
            if (r0 != 0) goto L_0x00b0
            java.lang.String r3 = "SigquitBasedANRDetector"
            java.lang.String r0 = "On anrDetected call"
            android.util.Log.i(r3, r0)
            r4 = r12
            boolean r0 = r12.A0E
            if (r0 == 0) goto L_0x00b0
            java.util.regex.Pattern r0 = r12.A01
            if (r0 != 0) goto L_0x0028
            java.lang.String r1 = "^$^\\s*(\"main\".*?$\\s*\\|\\s+group=\"main\"(?s).*?$^\\s*$)"
            r0 = 8
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r1, r0)
            r12.A01 = r0
        L_0x0028:
            r5 = r13
            java.util.regex.Matcher r1 = r0.matcher(r13)
            boolean r0 = r1.find()
            if (r0 == 0) goto L_0x006e
            r0 = 1
            java.lang.String r2 = r1.group(r0)
            if (r2 == 0) goto L_0x006e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "ANR detected. Main thread: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            android.util.Log.w(r3, r0)
            java.util.regex.Pattern r0 = r12.A02
            if (r0 != 0) goto L_0x005c
            java.lang.String r1 = "^\\s*[ank#](?s).*"
            r0 = 8
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r1, r0)
            r12.A02 = r0
        L_0x005c:
            java.util.regex.Matcher r1 = r0.matcher(r2)
            boolean r0 = r1.find()
            if (r0 == 0) goto L_0x006e
            java.lang.String r6 = r1.group()
        L_0x006a:
            java.lang.Object r2 = r12.A0A
            monitor-enter(r2)
            goto L_0x0070
        L_0x006e:
            r6 = 0
            goto L_0x006a
        L_0x0070:
            boolean r0 = r12.A0D     // Catch:{ all -> 0x00ad }
            r1 = 1
            if (r0 == 0) goto L_0x0078
            if (r6 == 0) goto L_0x008c
            goto L_0x007b
        L_0x0078:
            r12.A0D = r1     // Catch:{ all -> 0x00ad }
            goto L_0x0088
        L_0x007b:
            java.lang.String r0 = r12.A03     // Catch:{ all -> 0x00ad }
            boolean r0 = r6.equals(r0)     // Catch:{ all -> 0x00ad }
            if (r0 != 0) goto L_0x008c
            java.lang.String r0 = "Detected a new ANR before the end of the previous one"
            android.util.Log.w(r3, r0)     // Catch:{ all -> 0x00ad }
        L_0x0088:
            r12.A03 = r6     // Catch:{ all -> 0x00ad }
            monitor-exit(r2)     // Catch:{ all -> 0x00ad }
            goto L_0x008e
        L_0x008c:
            r1 = 0
            goto L_0x0088
        L_0x008e:
            if (r1 == 0) goto L_0x00b0
            X.00H r0 = r12.A09
            java.lang.Object r1 = r0.get()
            X.1O1 r1 = (X.AnonymousClass1O1) r1
            java.util.HashSet r0 = r1.A00
            java.lang.String r7 = X.AnonymousClass1O1.A00(r1, r0)
            android.os.Handler r0 = r12.A0C
            if (r0 == 0) goto L_0x00b0
            android.os.Handler r0 = r12.A0C
            X.Aj6 r3 = new X.Aj6
            r3.<init>(r4, r5, r6, r7, r8, r10)
            r0.post(r3)
            return
        L_0x00ad:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00ad }
            throw r0
        L_0x00b0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.anr.SigquitBasedANRDetector.anrDetected(java.lang.String):void");
    }
}
