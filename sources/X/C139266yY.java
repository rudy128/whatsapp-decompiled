package X;

import com.whatsapp.mediacomposer.loaders.MediaFilesLoader$loadMediaFilesAsync$1;
import java.util.List;

/* renamed from: X.6yY  reason: invalid class name and case insensitive filesystem */
public final class C139266yY {
    public final AnonymousClass11C A00;
    public final C18030ve A01;
    public final AnonymousClass73D A02;
    public final C34501ka A03;
    public final C18010vc A04;
    public final C26521Sl A05;
    public final AnonymousClass10I A06;
    public final AnonymousClass00H A07;

    public final C41731wy A01(AnonymousClass1F9 r10, List list) {
        List list2 = list;
        C18070vi.A0d(list, 0);
        if (list.size() > 1) {
            if (C18020vd.A05(C18040vf.A02, this.A01, 7394)) {
                C41731wy A0o = AnonymousClass3MW.A0o();
                C128536gH r4 = new C128536gH(this);
                AnonymousClass3MW.A1X(C23761Hn.A01.A0A(10), new MediaFilesLoader$loadMediaFilesAsync$1(r4, this, A0o, list2, (C30391dr) null), AnonymousClass2SS.A00(r10));
                return A0o;
            }
        }
        C41731wy A0o2 = AnonymousClass3MW.A0o();
        this.A06.CGF(new AnonymousClass7R0(this, list, A0o2, 27));
        return A0o2;
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
    public static final void A00(android.net.Uri r14, X.C128536gH r15, X.C139266yY r16) {
        /*
            r3 = r16
            X.73D r0 = r3.A02
            r5 = r14
            X.72S r2 = r0.A02(r14)
            java.io.File r1 = r2.A0C()
            r4 = r15
            if (r1 != 0) goto L_0x002b
            X.1Sl r6 = r3.A05     // Catch:{ IOException -> 0x0022 }
            r0 = 0
            java.io.File r1 = r6.A0j(r14, r0)     // Catch:{ IOException -> 0x0022 }
            monitor-enter(r4)     // Catch:{ IOException -> 0x0022 }
            java.util.Collection r0 = r15.A00     // Catch:{ all -> 0x001f }
            r0.add(r1)     // Catch:{ all -> 0x001f }
            monitor-exit(r4)     // Catch:{ IOException -> 0x0022 }
            goto L_0x0029
        L_0x001f:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ IOException -> 0x0022 }
            throw r0     // Catch:{ IOException -> 0x0022 }
        L_0x0022:
            monitor-enter(r4)
            java.util.Set r0 = r15.A01     // Catch:{ all -> 0x00f7 }
            r0.add(r14)     // Catch:{ all -> 0x00f7 }
            monitor-exit(r4)
        L_0x0029:
            if (r1 == 0) goto L_0x0107
        L_0x002b:
            r2.A0N(r1)
            X.1ka r0 = r3.A03
            int r8 = X.AnonymousClass72S.A00(r2, r0)
            r7 = 13
            r6 = 3
            r0 = 1
            if (r8 == r0) goto L_0x0107
            if (r8 == r6) goto L_0x0046
            if (r8 == r7) goto L_0x0046
            monitor-enter(r4)
            java.util.Set r0 = r15.A01     // Catch:{ all -> 0x00f7 }
            r0.add(r14)     // Catch:{ all -> 0x00f7 }
            goto L_0x00fd
        L_0x0046:
            X.0vc r9 = r3.A04
            X.11C r8 = r3.A00
            java.lang.String r7 = "samsung"
            java.lang.String r6 = android.os.Build.MANUFACTURER
            boolean r6 = r7.equalsIgnoreCase(r6)
            r10 = 0
            if (r6 == 0) goto L_0x0080
            int r7 = X.C24191Jf.A02(r8, r9)
            r6 = 2016(0x7e0, float:2.825E-42)
            if (r7 >= r6) goto L_0x0080
            android.media.MediaCodecList r6 = new android.media.MediaCodecList
            r6.<init>(r10)
            android.media.MediaCodecInfo[] r9 = r6.getCodecInfos()
            int r8 = r9.length
        L_0x0067:
            if (r10 >= r8) goto L_0x0080
            r6 = r9[r10]
            java.lang.String r7 = r6.getName()
            java.util.Locale r6 = java.util.Locale.US
            java.lang.String r7 = r7.toLowerCase(r6)
            java.lang.String r6 = "exynos"
            boolean r6 = r7.contains(r6)
            if (r6 != 0) goto L_0x00d0
            int r10 = r10 + 1
            goto L_0x0067
        L_0x0080:
            X.0ve r8 = r3.A01
            r7 = 5913(0x1719, float:8.286E-42)
            X.0vf r6 = X.C18040vf.A02
            java.lang.String r6 = X.C18020vd.A01(r6, r8, r7)
            boolean r6 = X.C39761tb.A0E(r6)
            if (r6 != 0) goto L_0x00d0
            boolean r6 = X.C108985cd.A1V(r8)
            if (r6 != 0) goto L_0x00d0
            X.BPF r12 = new X.BPF
            r12.<init>()
            X.Csd r6 = X.C26115Csd.A09     // Catch:{ IOException | IllegalArgumentException -> 0x00c1 }
            android.net.Uri r7 = android.net.Uri.fromFile(r1)     // Catch:{ IOException | IllegalArgumentException -> 0x00c1 }
            long r10 = r1.length()     // Catch:{ IOException | IllegalArgumentException -> 0x00c1 }
            r8 = 0
            X.Csd r6 = new X.Csd     // Catch:{ IOException | IllegalArgumentException -> 0x00c1 }
            r6.<init>(r7, r8, r10)     // Catch:{ IOException | IllegalArgumentException -> 0x00c1 }
            long r15 = r12.CAj(r6)     // Catch:{ IOException | IllegalArgumentException -> 0x00c1 }
            X.Cqw r11 = new X.Cqw     // Catch:{ IOException | IllegalArgumentException -> 0x00c1 }
            r13 = r8
            r11.<init>(r12, r13, r15)     // Catch:{ IOException | IllegalArgumentException -> 0x00c1 }
            r6 = 0
            boolean r6 = X.C25374CeZ.A00(r11, r6)     // Catch:{ IOException | IllegalArgumentException -> 0x00c1 }
            r12.close()     // Catch:{ IOException -> 0x00be }
        L_0x00be:
            if (r6 == 0) goto L_0x00d0
            goto L_0x00d1
        L_0x00c1:
            r6 = move-exception
            java.lang.String r0 = "WaHeroPlayer/canExtractVideo"
            com.whatsapp.util.Log.e(r0, r6)     // Catch:{ all -> 0x00cb }
            r12.close()     // Catch:{ IOException -> 0x00d0 }
            goto L_0x00d0
        L_0x00cb:
            r0 = move-exception
            r12.close()     // Catch:{ IOException -> 0x00cf }
        L_0x00cf:
            throw r0
        L_0x00d0:
            r0 = 0
        L_0x00d1:
            monitor-enter(r2)
            r2.A0K = r0     // Catch:{ all -> 0x00fa }
            monitor-exit(r2)
            X.00H r0 = r3.A07     // Catch:{ 1Se -> 0x00e9 }
            java.lang.Object r0 = r0.get()     // Catch:{ 1Se -> 0x00e9 }
            X.6mw r0 = (X.C132516mw) r0     // Catch:{ 1Se -> 0x00e9 }
            X.71x r0 = r0.A00(r1)     // Catch:{ 1Se -> 0x00e9 }
            monitor-enter(r2)     // Catch:{ 1Se -> 0x00e9 }
            r2.A07 = r0     // Catch:{ all -> 0x00e6 }
            monitor-exit(r2)     // Catch:{ 1Se -> 0x00e9 }
            return
        L_0x00e6:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ 1Se -> 0x00e9 }
            throw r0     // Catch:{ 1Se -> 0x00e9 }
        L_0x00e9:
            r1 = move-exception
            java.lang.String r0 = "MediaFilesLoader/Bad video"
            com.whatsapp.util.Log.e(r0, r1)
            monitor-enter(r4)
            java.util.Set r0 = r4.A01     // Catch:{ all -> 0x00f7 }
            r0.add(r5)     // Catch:{ all -> 0x00f7 }
            monitor-exit(r4)
            return
        L_0x00f7:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x00fa:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x00fd:
            monitor-exit(r4)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "MediaFilesLoader/Bad type "
            X.C17900vP.A0X(r14, r0, r1)
        L_0x0107:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C139266yY.A00(android.net.Uri, X.6gH, X.6yY):void");
    }

    public C139266yY(AnonymousClass11C r1, C18030ve r2, AnonymousClass73D r3, C34501ka r4, C18010vc r5, C26521Sl r6, AnonymousClass10I r7, AnonymousClass00H r8) {
        C18070vi.A0w(r7, r2, r6, r4, r3);
        C18070vi.A0q(r5, r1, r8);
        this.A06 = r7;
        this.A01 = r2;
        this.A05 = r6;
        this.A03 = r4;
        this.A02 = r3;
        this.A04 = r5;
        this.A00 = r1;
        this.A07 = r8;
    }
}
