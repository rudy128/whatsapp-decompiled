package X;

import android.os.SystemClock;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/* renamed from: X.DBi  reason: case insensitive filesystem */
public class C26731DBi implements ECl {
    public int A00 = 0;
    public int A01;
    public long A02 = 0;
    public long A03;
    public long A04 = 0;
    public long A05;
    public long A06;
    public boolean A07 = false;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final C28409E0a A0C;
    public final C28617EAp A0D;
    public final /* synthetic */ C26680D9d A0E;

    public void Bug(C24356Bzr bzr, long j, long j2, long j3) {
    }

    public void Buh(long j, long j2) {
    }

    public void Bvw(C24356Bzr bzr) {
    }

    public void Bvx() {
    }

    public void CIV(long j) {
    }

    public C26731DBi(C28409E0a e0a, C28617EAp eAp, C26680D9d d9d, boolean z) {
        this.A0E = d9d;
        this.A0D = eAp;
        this.A0C = e0a;
        this.A08 = z;
    }

    public void Bn4(C26115Csd csd, Object obj, int i, boolean z) {
        int i2;
        int i3 = this.A01 + i;
        this.A01 = i3;
        if (this.A04 <= 0 && this.A0B && (i2 = this.A00) > 0 && i3 >= i2) {
            this.A04 = SystemClock.elapsedRealtime();
            this.A07 = true;
        }
    }

    public void C9A(C26115Csd csd, Object obj, boolean z) {
        if (this.A05 != 0) {
            A00(false);
        }
    }

    public void C9B(IOException iOException) {
        if (this.A05 != 0) {
            A00(true);
        }
    }

    public void C9C(String str, Object obj) {
        if (this.A0A && "x-fb-response-time-ms".equalsIgnoreCase(str) && obj != null) {
            try {
                this.A02 = Long.parseLong((String) obj);
            } catch (NumberFormatException unused) {
            }
        }
        if ("x-bwe-mean".equalsIgnoreCase(str) && obj != null) {
            try {
                for (String split : ((String) obj).split(";")) {
                    String[] split2 = split.split(":");
                    if (split2.length != 2) {
                        break;
                    }
                    if (split2[0].equalsIgnoreCase("aggressive")) {
                        Long.parseLong(split2[1]);
                    }
                    if (split2[0].equalsIgnoreCase("mean")) {
                        Long.parseLong(split2[1]);
                    }
                    if (split2[0].equalsIgnoreCase("conservative")) {
                        Long.parseLong(split2[1]);
                    }
                }
            } catch (NumberFormatException unused2) {
            }
        }
        if ("x-bwe-std-dev".equalsIgnoreCase(str) && obj != null) {
            try {
                Long.parseLong((String) obj);
            } catch (NumberFormatException unused3) {
            }
        }
        if ("x-mrtt-ms".equalsIgnoreCase(str) && obj != null) {
            try {
                Long.parseLong((String) obj);
            } catch (NumberFormatException unused4) {
            }
        }
        if ("x-fb-dynamic-predictive-response-chunk-size".equalsIgnoreCase(str) && obj != null) {
            try {
                this.A00 = Integer.parseInt((String) obj);
            } catch (NumberFormatException unused5) {
            }
        }
    }

    public void C9D(C26115Csd csd, C24356Bzr bzr) {
        String obj = csd.A04.toString();
        boolean z = csd.A05.A0Q;
        try {
            new URL(obj);
        } catch (MalformedURLException unused) {
        }
        this.A09 = AnonymousClass3Ma.A1Z(bzr, C24356Bzr.NOT_CACHED);
        this.A05 = SystemClock.elapsedRealtime();
        this.A02 = 0;
        this.A0A = z;
    }

    public void C9E(C26115Csd csd, Object obj, boolean z, boolean z2) {
        this.A0B = z2;
        this.A06 = SystemClock.elapsedRealtime();
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    private void A00(boolean r32) {
        /*
            r31 = this;
            long r8 = android.os.SystemClock.elapsedRealtime()
            r4 = r31
            long r0 = r4.A03
            r10 = 0
            int r2 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r2 > 0) goto L_0x0010
            long r0 = r4.A05
        L_0x0010:
            long r2 = r4.A06
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r5 < 0) goto L_0x0060
            int r5 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r5 < 0) goto L_0x0060
            boolean r5 = r4.A08
            if (r5 == 0) goto L_0x002d
            boolean r5 = r4.A07
            if (r5 == 0) goto L_0x002d
            int r5 = r4.A00
            if (r5 == 0) goto L_0x002d
            long r5 = r4.A04
            int r7 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            r10 = 1
            if (r7 != 0) goto L_0x002e
        L_0x002d:
            r10 = 0
        L_0x002e:
            long r6 = r4.A05
            long r0 = r0 - r6
            int r5 = (int) r0
            long r0 = r2 - r6
            int r11 = (int) r0
            if (r10 == 0) goto L_0x0039
            long r8 = r4.A04
        L_0x0039:
            long r8 = r8 - r2
            int r13 = (int) r8
            if (r10 == 0) goto L_0x02b6
            int r8 = r4.A00
        L_0x003f:
            boolean r12 = r4.A09
            if (r32 != 0) goto L_0x0049
            int r0 = r4.A01
            r16 = 0
            if (r0 > 0) goto L_0x004b
        L_0x0049:
            r16 = 1
        L_0x004b:
            boolean r1 = r4.A0B
            long r2 = r4.A02
            long r9 = (long) r5
            X.D9d r5 = r4.A0E
            if (r1 == 0) goto L_0x0076
            com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration r0 = r5.A03
            X.DRg r14 = r0.abrSetting
            boolean r0 = r14.enableBwOnlyEstimationForLongPoll
            if (r0 != 0) goto L_0x0076
            boolean r0 = r14.removeCDNResponseTimeForLongPoll
            if (r0 != 0) goto L_0x0076
        L_0x0060:
            r5 = 0
            r4.A05 = r5
            r4.A06 = r5
            r2 = 0
            r4.A01 = r2
            r4.A09 = r2
            r0 = -1
            r4.A03 = r0
            r4.A00 = r2
            r4.A07 = r2
            r4.A04 = r5
            return
        L_0x0076:
            r18 = r1 ^ 1
            com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration r0 = r5.A03
            r30 = r0
            X.DRg r14 = r0.abrSetting
            int r0 = r14.maxNumberSmallBwSamplesIgnored
            r1 = 0
            if (r0 <= 0) goto L_0x009e
            monitor-enter(r5)
            r0 = r30
            X.DRg r14 = r0.abrSetting     // Catch:{ all -> 0x02c8 }
            int r0 = r14.initSegmentBandwidthExclusionLimitBytes     // Catch:{ all -> 0x02c8 }
            if (r8 < r0) goto L_0x0093
            int r0 = r5.A00     // Catch:{ all -> 0x02c8 }
            if (r0 <= 0) goto L_0x00d4
            r5.A00 = r1     // Catch:{ all -> 0x02c8 }
            goto L_0x00d4
        L_0x0093:
            int r1 = r5.A00     // Catch:{ all -> 0x02c8 }
            int r0 = r14.maxNumberSmallBwSamplesIgnored     // Catch:{ all -> 0x02c8 }
            if (r1 >= r0) goto L_0x00c4
            int r1 = r1 + 1
            r5.A00 = r1     // Catch:{ all -> 0x02c8 }
            goto L_0x00c4
        L_0x009e:
            int r0 = r14.initSegmentBandwidthExclusionLimitBytes
            if (r8 < r0) goto L_0x00c7
        L_0x00a2:
            r17 = 1
        L_0x00a4:
            r0 = r30
            X.DRg r0 = r0.abrSetting
            boolean r0 = r0.removeCDNResponseTimeForLongPoll
            if (r0 == 0) goto L_0x00bf
            r14 = 0
            int r0 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r0 <= 0) goto L_0x00bf
            long r0 = (long) r11
            int r14 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r14 >= 0) goto L_0x00bf
            long r0 = r0 - r2
            int r11 = (int) r0
            r18 = 1
        L_0x00bb:
            X.CkD r5 = r5.A02
            monitor-enter(r5)
            goto L_0x00d6
        L_0x00bf:
            if (r18 != 0) goto L_0x00bb
            if (r17 == 0) goto L_0x0060
            goto L_0x00bb
        L_0x00c4:
            if (r1 >= r0) goto L_0x00d4
            monitor-exit(r5)
        L_0x00c7:
            r17 = 0
            r0 = r30
            X.DRg r0 = r0.abrSetting
            boolean r0 = r0.enableTtfbOnlyEstimation
            if (r0 != 0) goto L_0x00a4
            r18 = 0
            goto L_0x00a4
        L_0x00d4:
            monitor-exit(r5)
            goto L_0x00a2
        L_0x00d6:
            java.lang.String r0 = "onTransferFinished"
            X.C25304Cd8.A01(r0)     // Catch:{ all -> 0x02c3 }
            monitor-enter(r5)     // Catch:{ all -> 0x02c3 }
            int r0 = r5.A01     // Catch:{ all -> 0x02c0 }
            int r0 = r0 + 1
            r5.A01 = r0     // Catch:{ all -> 0x02c0 }
            r0 = 0
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x01a5
            if (r16 != 0) goto L_0x01a5
            if (r12 != 0) goto L_0x01a5
            long r2 = (long) r11     // Catch:{ all -> 0x02c0 }
            long r2 = r2 - r9
            long r11 = (long) r13     // Catch:{ all -> 0x02c0 }
            long r15 = r2 + r11
            long r6 = r6 + r15
            long r9 = r9 + r6
            r11 = 8000(0x1f40, double:3.9525E-320)
            int r6 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r6 <= 0) goto L_0x00fc
            long r0 = (long) r8     // Catch:{ all -> 0x02c0 }
            long r0 = r0 * r11
            long r0 = r0 / r15
        L_0x00fc:
            if (r8 <= 0) goto L_0x00ff
            goto L_0x0101
        L_0x00ff:
            r14 = 0
            goto L_0x0107
        L_0x0101:
            double r6 = (double) r8     // Catch:{ all -> 0x02c0 }
            double r6 = java.lang.Math.sqrt(r6)     // Catch:{ all -> 0x02c0 }
            int r14 = (int) r6     // Catch:{ all -> 0x02c0 }
        L_0x0107:
            long r7 = (long) r8     // Catch:{ all -> 0x02c0 }
            X.CiK r6 = r5.A05     // Catch:{ all -> 0x02c0 }
            r28 = 0
            monitor-enter(r6)     // Catch:{ all -> 0x02c0 }
            int r11 = (r2 > r28 ? 1 : (r2 == r28 ? 0 : -1))
            if (r11 <= 0) goto L_0x0174
            int r11 = (r15 > r2 ? 1 : (r15 == r2 ? 0 : -1))
            if (r11 <= 0) goto L_0x0174
            int r11 = (r7 > r28 ? 1 : (r7 == r28 ? 0 : -1))
            if (r11 <= 0) goto L_0x0174
            if (r18 == 0) goto L_0x0143
            java.util.Deque r13 = r6.A02     // Catch:{ all -> 0x02ba }
            boolean r11 = r13.isEmpty()     // Catch:{ all -> 0x02ba }
            if (r11 != 0) goto L_0x0140
            java.lang.Object r11 = r13.getLast()     // Catch:{ all -> 0x02ba }
            X.BRa r11 = (X.C22822BRa) r11     // Catch:{ all -> 0x02ba }
            long r11 = r11.A01     // Catch:{ all -> 0x02ba }
            long r26 = r2 - r11
        L_0x012d:
            long r24 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x02ba }
            X.BRa r11 = new X.BRa     // Catch:{ all -> 0x02ba }
            r19 = r11
            r20 = r2
            r22 = r7
            r19.<init>(r20, r22, r24, r26)     // Catch:{ all -> 0x02ba }
            r13.add(r11)     // Catch:{ all -> 0x02ba }
            goto L_0x0143
        L_0x0140:
            r26 = 0
            goto L_0x012d
        L_0x0143:
            if (r17 == 0) goto L_0x016e
            r22 = 8000(0x1f40, double:3.9525E-320)
            long r22 = r22 * r7
            long r15 = r15 - r2
            long r22 = r22 / r15
            java.util.Deque r11 = r6.A01     // Catch:{ all -> 0x02ba }
            boolean r2 = r11.isEmpty()     // Catch:{ all -> 0x02ba }
            if (r2 != 0) goto L_0x015e
            java.lang.Object r2 = r11.getLast()     // Catch:{ all -> 0x02ba }
            X.BRZ r2 = (X.BRZ) r2     // Catch:{ all -> 0x02ba }
            long r2 = r2.A00     // Catch:{ all -> 0x02ba }
            long r28 = r22 - r2
        L_0x015e:
            long r26 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x02ba }
            X.BRZ r2 = new X.BRZ     // Catch:{ all -> 0x02ba }
            r21 = r2
            r24 = r7
            r21.<init>(r22, r24, r26, r28)     // Catch:{ all -> 0x02ba }
            r11.add(r2)     // Catch:{ all -> 0x02ba }
        L_0x016e:
            X.C25580CiK.A00(r6)     // Catch:{ all -> 0x02ba }
            r2 = 1
            r6.A03 = r2     // Catch:{ all -> 0x02ba }
        L_0x0174:
            monitor-exit(r6)     // Catch:{ all -> 0x02c0 }
            if (r18 == 0) goto L_0x01a5
            if (r17 == 0) goto L_0x01a5
            monitor-enter(r5)     // Catch:{ all -> 0x02c0 }
            long r2 = r5.A03     // Catch:{ all -> 0x02bd }
            long r2 = java.lang.Math.max(r2, r9)     // Catch:{ all -> 0x02bd }
            r5.A03 = r2     // Catch:{ all -> 0x02bd }
            r6 = 0
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 <= 0) goto L_0x01a4
            X.Cl7 r3 = r5.A04     // Catch:{ all -> 0x02bd }
            float r2 = (float) r0     // Catch:{ all -> 0x02bd }
            r3.A01(r14, r2)     // Catch:{ all -> 0x02bd }
            float r1 = r3.A00()     // Catch:{ all -> 0x02bd }
            boolean r0 = java.lang.Float.isNaN(r1)     // Catch:{ all -> 0x02bd }
            if (r0 == 0) goto L_0x019b
            r0 = -1
            goto L_0x019c
        L_0x019b:
            long r0 = (long) r1     // Catch:{ all -> 0x02bd }
        L_0x019c:
            r5.A02 = r0     // Catch:{ all -> 0x02bd }
            int r0 = r5.A00     // Catch:{ all -> 0x02bd }
            int r0 = r0 + 1
            r5.A00 = r0     // Catch:{ all -> 0x02bd }
        L_0x01a4:
            monitor-exit(r5)     // Catch:{ all -> 0x02c0 }
        L_0x01a5:
            monitor-exit(r5)     // Catch:{ all -> 0x02c3 }
            com.facebook.http.historical.NetworkInfoMap r19 = com.facebook.http.historical.NetworkInfoMap.A01     // Catch:{ all -> 0x02c3 }
            monitor-enter(r19)     // Catch:{ all -> 0x02c3 }
            monitor-exit(r19)     // Catch:{ all -> 0x02c3 }
            r0 = r30
            com.facebook.exoplayer.bandwidthestimator.estimate.VideoBandwidthEstimate r10 = r5.A00(r0)     // Catch:{ all -> 0x02c3 }
            long r6 = r10.A05     // Catch:{ all -> 0x02c3 }
            r17 = 0
            int r0 = (r6 > r17 ? 1 : (r6 == r17 ? 0 : -1))
            if (r0 < 0) goto L_0x02b0
            long r2 = r10.A00     // Catch:{ all -> 0x02c3 }
            int r0 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r0 <= 0) goto L_0x02b0
            r0 = r30
            X.DRg r0 = r0.abrSetting     // Catch:{ all -> 0x02c3 }
            boolean r0 = r0.enableConfRiskBwCache     // Catch:{ all -> 0x02c3 }
            if (r0 == 0) goto L_0x02a6
            X.Bys r16 = X.C24295Bys.UNDEFINED     // Catch:{ all -> 0x02c3 }
            r1 = r30
            r0 = r16
            int r1 = r1.getHighBwRiskConfPct(r0)     // Catch:{ all -> 0x02c3 }
            com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration r8 = r10.A01     // Catch:{ all -> 0x02c3 }
            r13 = 0
            if (r8 == 0) goto L_0x01ee
            float r12 = r8.getMinBandwidthMultiplier()     // Catch:{ all -> 0x02c3 }
            int r0 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x01ee
        L_0x01dd:
            float r11 = r8.getMaxBandwidthMultiplier()     // Catch:{ all -> 0x02c3 }
            int r0 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x01f4
        L_0x01e5:
            X.DRg r0 = r8.abrSetting     // Catch:{ all -> 0x02c3 }
            float r9 = r0.bwWeightLimitForBWEDampening     // Catch:{ all -> 0x02c3 }
            int r0 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x01f9
            goto L_0x01fb
        L_0x01ee:
            r12 = 1050253722(0x3e99999a, float:0.3)
            if (r8 == 0) goto L_0x01f4
            goto L_0x01dd
        L_0x01f4:
            r11 = 1073741824(0x40000000, float:2.0)
            if (r8 == 0) goto L_0x01f9
            goto L_0x01e5
        L_0x01f9:
            r9 = 1145569280(0x44480000, float:800.0)
        L_0x01fb:
            if (r1 <= 0) goto L_0x0235
            r0 = 100
            if (r1 >= r0) goto L_0x0235
            r14 = 50
            r0 = 1
            if (r1 >= r14) goto L_0x0209
            int r1 = 100 - r1
            r0 = -1
        L_0x0209:
            float r15 = (float) r0     // Catch:{ all -> 0x02c3 }
            java.util.Map r0 = com.facebook.exoplayer.bandwidthestimator.estimate.VideoBandwidthEstimate.A08     // Catch:{ all -> 0x02c3 }
            java.lang.Object r0 = X.AnonymousClass000.A0w(r0, r1)     // Catch:{ all -> 0x02c3 }
            java.lang.Float r0 = (java.lang.Float) r0     // Catch:{ all -> 0x02c3 }
            float r0 = r0.floatValue()     // Catch:{ all -> 0x02c3 }
            float r15 = r15 * r0
            long r0 = r10.A03     // Catch:{ all -> 0x02c3 }
            float r14 = (float) r0     // Catch:{ all -> 0x02c3 }
            float r15 = r15 * r14
            float r14 = (float) r2     // Catch:{ all -> 0x02c3 }
            float r15 = r15 / r14
            r3 = 1065353216(0x3f800000, float:1.0)
            float r15 = r3 - r15
            long r0 = r10.A04     // Catch:{ all -> 0x02c3 }
            int r2 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r2 <= 0) goto L_0x022e
            float r2 = (float) r0     // Catch:{ all -> 0x02c3 }
            float r2 = r2 / r9
            float r3 = r3 - r2
            float r13 = java.lang.Math.max(r3, r13)     // Catch:{ all -> 0x02c3 }
        L_0x022e:
            float r15 = r15 - r13
            float r0 = X.BE8.A00(r15, r12, r11)     // Catch:{ all -> 0x02c3 }
            float r14 = r14 * r0
            long r2 = (long) r14     // Catch:{ all -> 0x02c3 }
        L_0x0235:
            r1 = r30
            r0 = r16
            int r14 = r1.getHighBwRiskConfPct(r0)     // Catch:{ all -> 0x02c3 }
            r13 = 0
            if (r8 == 0) goto L_0x0259
            float r12 = r8.getMaxTTFBMultiplier()     // Catch:{ all -> 0x02c3 }
            int r0 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x0259
        L_0x0248:
            float r11 = r8.getMinTTFBMultiplier()     // Catch:{ all -> 0x02c3 }
            int r0 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x025e
        L_0x0250:
            X.DRg r0 = r8.abrSetting     // Catch:{ all -> 0x02c3 }
            float r9 = r0.ttfbWeightLimitForBWEDampening     // Catch:{ all -> 0x02c3 }
            int r0 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x0263
            goto L_0x0265
        L_0x0259:
            r12 = 1077936128(0x40400000, float:3.0)
            if (r8 == 0) goto L_0x025e
            goto L_0x0248
        L_0x025e:
            r11 = 1056964608(0x3f000000, float:0.5)
            if (r8 == 0) goto L_0x0263
            goto L_0x0250
        L_0x0263:
            r9 = 1133903872(0x43960000, float:300.0)
        L_0x0265:
            if (r14 <= 0) goto L_0x02a6
            r0 = 100
            if (r14 >= r0) goto L_0x02a6
            int r0 = (r6 > r17 ? 1 : (r6 == r17 ? 0 : -1))
            if (r0 <= 0) goto L_0x02a6
            r1 = 50
            r0 = 1
            if (r14 >= r1) goto L_0x0277
            int r14 = 100 - r14
            r0 = -1
        L_0x0277:
            float r8 = (float) r0     // Catch:{ all -> 0x02c3 }
            java.util.Map r0 = com.facebook.exoplayer.bandwidthestimator.estimate.VideoBandwidthEstimate.A08     // Catch:{ all -> 0x02c3 }
            java.lang.Object r0 = X.AnonymousClass000.A0w(r0, r14)     // Catch:{ all -> 0x02c3 }
            java.lang.Float r0 = (java.lang.Float) r0     // Catch:{ all -> 0x02c3 }
            float r0 = r0.floatValue()     // Catch:{ all -> 0x02c3 }
            float r8 = r8 * r0
            long r0 = r10.A06     // Catch:{ all -> 0x02c3 }
            float r14 = (float) r0     // Catch:{ all -> 0x02c3 }
            float r8 = r8 * r14
            float r14 = (float) r6     // Catch:{ all -> 0x02c3 }
            float r8 = r8 / r14
            r7 = 1065353216(0x3f800000, float:1.0)
            float r8 = r8 + r7
            long r0 = r10.A07     // Catch:{ all -> 0x02c3 }
            int r6 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r6 <= 0) goto L_0x029b
            float r6 = (float) r0     // Catch:{ all -> 0x02c3 }
            float r6 = r6 / r9
            float r7 = r7 - r6
            float r13 = java.lang.Math.max(r7, r13)     // Catch:{ all -> 0x02c3 }
        L_0x029b:
            float r8 = r8 + r13
            float r0 = java.lang.Math.min(r8, r12)     // Catch:{ all -> 0x02c3 }
            float r0 = java.lang.Math.max(r0, r11)     // Catch:{ all -> 0x02c3 }
            float r14 = r14 * r0
            long r6 = (long) r14     // Catch:{ all -> 0x02c3 }
        L_0x02a6:
            int r0 = (r6 > r17 ? 1 : (r6 == r17 ? 0 : -1))
            if (r0 < 0) goto L_0x02b0
            int r0 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r0 <= 0) goto L_0x02b0
            monitor-enter(r19)     // Catch:{ all -> 0x02c3 }
            monitor-exit(r19)     // Catch:{ all -> 0x02c3 }
        L_0x02b0:
            X.C25304Cd8.A00()     // Catch:{ all -> 0x02c8 }
            monitor-exit(r5)
            goto L_0x0060
        L_0x02b6:
            int r8 = r4.A01
            goto L_0x003f
        L_0x02ba:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x02c0 }
            goto L_0x02bf
        L_0x02bd:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x02c0 }
        L_0x02bf:
            throw r0     // Catch:{ all -> 0x02c0 }
        L_0x02c0:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x02c3 }
            throw r0     // Catch:{ all -> 0x02c3 }
        L_0x02c3:
            r0 = move-exception
            X.C25304Cd8.A00()     // Catch:{ all -> 0x02c8 }
            throw r0     // Catch:{ all -> 0x02c8 }
        L_0x02c8:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26731DBi.A00(boolean):void");
    }
}
