package com.whatsapp.messaging.receiver;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C61702q7;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.messaging.receiver.PersistedIntStore$startDelayedPersistTaskIfNeeded$1", f = "PersistedIntStore.kt", i = {}, l = {97}, m = "invokeSuspend", n = {}, s = {})
public final class PersistedIntStore$startDelayedPersistTaskIfNeeded$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ C61702q7 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PersistedIntStore$startDelayedPersistTaskIfNeeded$1(C61702q7 r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new PersistedIntStore$startDelayedPersistTaskIfNeeded$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new PersistedIntStore$startDelayedPersistTaskIfNeeded$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            X.1g4 r3 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r6.label
            r2 = 1
            if (r0 == 0) goto L_0x0011
            if (r0 != r2) goto L_0x006a
            X.C30691eM.A01(r7)
        L_0x000c:
            X.2q7 r5 = r6.this$0
            monitor-enter(r5)
            r1 = 0
            goto L_0x001f
        L_0x0011:
            X.C30691eM.A01(r7)
            r0 = 10000(0x2710, double:4.9407E-320)
            r6.label = r2
            java.lang.Object r0 = X.C62882s9.A00(r6, r0)
            if (r0 != r3) goto L_0x000c
            return r3
        L_0x001f:
            r5.A03 = r1     // Catch:{ all -> 0x0067 }
            boolean r0 = r5.A02     // Catch:{ all -> 0x0067 }
            if (r0 == 0) goto L_0x0063
            r5.A02 = r1     // Catch:{ all -> 0x0067 }
            java.util.LinkedHashSet r0 = r5.A00     // Catch:{ all -> 0x0067 }
            int[] r4 = X.C29431cG.A1B(r0)     // Catch:{ all -> 0x0067 }
            monitor-exit(r5)
            int r1 = r4.length
            android.content.SharedPreferences r0 = r5.A04
            if (r1 != 0) goto L_0x0042
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "key"
            android.content.SharedPreferences$Editor r3 = r1.remove(r0)
        L_0x003d:
            r3.commit()
            monitor-enter(r5)
            goto L_0x0060
        L_0x0042:
            android.content.SharedPreferences$Editor r3 = r0.edit()
            X.C18070vi.A0X(r3)
            java.lang.String r2 = "key"
            int r0 = r1 * 4
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r0)
            java.nio.IntBuffer r0 = r1.asIntBuffer()
            r0.put(r4)
            byte[] r0 = r1.array()
            X.AnonymousClass2UR.A00(r3, r2, r0)
            goto L_0x003d
        L_0x0060:
            X.C61702q7.A00(r5)     // Catch:{ all -> 0x0067 }
        L_0x0063:
            monitor-exit(r5)
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0067:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x006a:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.messaging.receiver.PersistedIntStore$startDelayedPersistTaskIfNeeded$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
