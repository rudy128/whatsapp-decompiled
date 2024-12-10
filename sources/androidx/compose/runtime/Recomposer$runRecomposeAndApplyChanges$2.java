package androidx.compose.runtime;

import X.C06990aB;
import X.C17860vL;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C36001nB;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2", f = "Recomposer.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1}, l = {540, 551}, m = "invokeSuspend", n = {"parentFrameClock", "toRecompose", "toInsert", "toApply", "toLateApply", "toComplete", "modifiedValues", "alreadyComposed", "parentFrameClock", "toRecompose", "toInsert", "toApply", "toLateApply", "toComplete", "modifiedValues", "alreadyComposed"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7"})
public final class Recomposer$runRecomposeAndApplyChanges$2 extends C30431dv implements C36001nB {
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public Object L$7;
    public int label;
    public final /* synthetic */ Recomposer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Recomposer$runRecomposeAndApplyChanges$2(Recomposer recomposer, C30391dr r3) {
        super(3, r3);
        this.this$0 = recomposer;
    }

    public final Object A01(C17860vL r3, C30391dr r4) {
        Recomposer$runRecomposeAndApplyChanges$2 recomposer$runRecomposeAndApplyChanges$2 = new Recomposer$runRecomposeAndApplyChanges$2(this.this$0, r4);
        recomposer$runRecomposeAndApplyChanges$2.L$0 = r3;
        return recomposer$runRecomposeAndApplyChanges$2.invokeSuspend(C27621Wu.A00);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return A01((C17860vL) obj2, (C30391dr) obj3);
    }

    public static final /* synthetic */ void A00(C06990aB r0, C06990aB r1, List list, List list2, List list3, Set set, Set set2) {
        list.clear();
        list2.clear();
        list3.clear();
        set.clear();
        set2.clear();
        r0.clear();
        r1.clear();
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0082  */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            X.1g4 r3 = X.AnonymousClass3F6.A03()
            int r1 = r13.label
            r0 = 2
            r2 = 1
            if (r1 == 0) goto L_0x00a3
            if (r1 == r2) goto L_0x0057
            if (r1 != r0) goto L_0x00cc
            java.lang.Object r7 = r13.L$7
            X.0aB r7 = (X.C06990aB) r7
            java.lang.Object r6 = r13.L$6
            X.0aB r6 = (X.C06990aB) r6
            java.lang.Object r12 = r13.L$5
            java.util.Set r12 = (java.util.Set) r12
            java.lang.Object r11 = r13.L$4
            java.util.Set r11 = (java.util.Set) r11
            java.lang.Object r10 = r13.L$3
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r9 = r13.L$2
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r8 = r13.L$1
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r1 = r13.L$0
            X.0vL r1 = (X.C17860vL) r1
            X.C30691eM.A01(r14)
        L_0x0031:
            androidx.compose.runtime.Recomposer r0 = r13.this$0
            androidx.compose.runtime.Recomposer.A0I(r0)
        L_0x0036:
            androidx.compose.runtime.Recomposer r0 = r13.this$0
            java.lang.Object r0 = r0.A0B
            monitor-enter(r0)
            monitor-exit(r0)
            androidx.compose.runtime.Recomposer r0 = r13.this$0
            r13.L$0 = r1
            r13.L$1 = r8
            r13.L$2 = r9
            r13.L$3 = r10
            r13.L$4 = r11
            r13.L$5 = r12
            r13.L$6 = r6
            r13.L$7 = r7
            r13.label = r2
            java.lang.Object r0 = r0.A06(r13)
            if (r0 != r3) goto L_0x007a
            return r3
        L_0x0057:
            java.lang.Object r7 = r13.L$7
            X.0aB r7 = (X.C06990aB) r7
            java.lang.Object r6 = r13.L$6
            X.0aB r6 = (X.C06990aB) r6
            java.lang.Object r12 = r13.L$5
            java.util.Set r12 = (java.util.Set) r12
            java.lang.Object r11 = r13.L$4
            java.util.Set r11 = (java.util.Set) r11
            java.lang.Object r10 = r13.L$3
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r9 = r13.L$2
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r8 = r13.L$1
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r1 = r13.L$0
            X.0vL r1 = (X.C17860vL) r1
            X.C30691eM.A01(r14)
        L_0x007a:
            androidx.compose.runtime.Recomposer r0 = r13.this$0
            boolean r0 = androidx.compose.runtime.Recomposer.A0R(r0)
            if (r0 == 0) goto L_0x0036
            androidx.compose.runtime.Recomposer r5 = r13.this$0
            X.0kC r4 = new X.0kC
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r13.L$0 = r1
            r13.L$1 = r8
            r13.L$2 = r9
            r13.L$3 = r10
            r13.L$4 = r11
            r13.L$5 = r12
            r13.L$6 = r6
            r13.L$7 = r7
            r0 = 2
            r13.label = r0
            java.lang.Object r0 = r1.CSE(r13, r4)
            if (r0 != r3) goto L_0x0031
            return r3
        L_0x00a3:
            X.C30691eM.A01(r14)
            java.lang.Object r1 = r13.L$0
            X.0vL r1 = (X.C17860vL) r1
            java.util.ArrayList r8 = X.AnonymousClass000.A13()
            java.util.ArrayList r9 = X.AnonymousClass000.A13()
            java.util.ArrayList r10 = X.AnonymousClass000.A13()
            java.util.LinkedHashSet r11 = new java.util.LinkedHashSet
            r11.<init>()
            java.util.LinkedHashSet r12 = new java.util.LinkedHashSet
            r12.<init>()
            X.0aB r6 = new X.0aB
            r6.<init>()
            X.0aB r7 = new X.0aB
            r7.<init>()
            goto L_0x0036
        L_0x00cc:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
