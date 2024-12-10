package com.whatsapp.ml.v2.scheduler;

import X.AnonymousClass1OS;
import X.C24489C6h;
import X.C25749ClJ;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.ml.v2.scheduler.MLProcessScheduler$schedule$1", f = "MLProcessScheduler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class MLProcessScheduler$schedule$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C24489C6h $request;
    public int label;
    public final /* synthetic */ C25749ClJ this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MLProcessScheduler$schedule$1(C25749ClJ clJ, C24489C6h c6h, C30391dr r4) {
        super(2, r4);
        this.this$0 = clJ;
        this.$request = c6h;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new MLProcessScheduler$schedule$1(this.this$0, this.$request, r5);
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [java.lang.Object, X.C5I] */
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.label
            if (r0 != 0) goto L_0x00ad
            X.C30691eM.A01(r8)
            X.ClJ r0 = r7.this$0
            X.4XD r0 = r0.A01
            r0.A01()
            X.ClJ r2 = r7.this$0
            X.C6h r1 = r7.$request
            boolean r0 = r1 instanceof X.C24027BuE
            if (r0 == 0) goto L_0x0033
            X.00H r0 = r2.A08
        L_0x0018:
            java.lang.Object r0 = r0.get()
            X.E8F r0 = (X.E8F) r0
            r0.C4P(r1)
        L_0x0021:
            X.ClJ r0 = r7.this$0
            X.0vl r0 = r0.A0B
            java.lang.Object r3 = r0.getValue()
            X.Cij r3 = (X.C25604Cij) r3
            X.C6h r5 = r7.$request
            r0 = 0
            X.C18070vi.A0d(r5, r0)
            monitor-enter(r3)
            goto L_0x003a
        L_0x0033:
            boolean r0 = r1 instanceof X.C173708vb
            if (r0 == 0) goto L_0x0021
            X.00H r0 = r2.A09
            goto L_0x0018
        L_0x003a:
            java.util.Map r6 = r3.A04     // Catch:{ all -> 0x00aa }
            java.lang.Object r0 = r5.A02()     // Catch:{ all -> 0x00aa }
            java.lang.Object r2 = r6.get(r0)     // Catch:{ all -> 0x00aa }
            X.C5I r2 = (X.C5I) r2     // Catch:{ all -> 0x00aa }
            r4 = 0
            if (r2 == 0) goto L_0x0064
            X.C6h r1 = r2.A01     // Catch:{ all -> 0x00aa }
            boolean r0 = r5.A03()     // Catch:{ all -> 0x00aa }
            if (r0 == 0) goto L_0x0059
            boolean r0 = r1.A03()     // Catch:{ all -> 0x00aa }
            if (r0 != 0) goto L_0x0059
            r2.A01 = r5     // Catch:{ all -> 0x00aa }
        L_0x0059:
            int r0 = r3.A00     // Catch:{ all -> 0x00aa }
            int r0 = r0 + 1
            r3.A00 = r0     // Catch:{ all -> 0x00aa }
            r2.A00 = r0     // Catch:{ all -> 0x00aa }
        L_0x0061:
            r3.A01 = r4     // Catch:{ all -> 0x00aa }
            goto L_0x00a1
        L_0x0064:
            java.util.LinkedList r2 = r3.A03     // Catch:{ all -> 0x00aa }
            int r0 = r2.size()     // Catch:{ all -> 0x00aa }
            int r1 = r3.A02     // Catch:{ all -> 0x00aa }
            if (r0 < r1) goto L_0x0087
            X.C25604Cij.A00(r3)     // Catch:{ all -> 0x00aa }
        L_0x0071:
            int r0 = r2.size()     // Catch:{ all -> 0x00aa }
            if (r0 < r1) goto L_0x0087
            java.lang.Object r0 = r2.removeLast()     // Catch:{ all -> 0x00aa }
            X.C5I r0 = (X.C5I) r0     // Catch:{ all -> 0x00aa }
            X.C6h r0 = r0.A01     // Catch:{ all -> 0x00aa }
            java.lang.Object r0 = r0.A02()     // Catch:{ all -> 0x00aa }
            r6.remove(r0)     // Catch:{ all -> 0x00aa }
            goto L_0x0071
        L_0x0087:
            int r0 = r3.A00     // Catch:{ all -> 0x00aa }
            int r0 = r0 + 1
            r3.A00 = r0     // Catch:{ all -> 0x00aa }
            X.C5I r1 = new X.C5I     // Catch:{ all -> 0x00aa }
            r1.<init>()     // Catch:{ all -> 0x00aa }
            r1.A01 = r5     // Catch:{ all -> 0x00aa }
            r1.A00 = r0     // Catch:{ all -> 0x00aa }
            r2.add(r1)     // Catch:{ all -> 0x00aa }
            java.lang.Object r0 = r5.A02()     // Catch:{ all -> 0x00aa }
            r6.put(r0, r1)     // Catch:{ all -> 0x00aa }
            goto L_0x0061
        L_0x00a1:
            monitor-exit(r3)
            X.ClJ r0 = r7.this$0
            r0.A01()
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x00aa:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x00ad:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ml.v2.scheduler.MLProcessScheduler$schedule$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MLProcessScheduler$schedule$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
