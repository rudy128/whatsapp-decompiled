package X;

import java.util.Set;

/* renamed from: X.9m6  reason: invalid class name and case insensitive filesystem */
public final class C191149m6 {
    public AiK A00;
    public final AnonymousClass118 A01;
    public final C18010vc A02;
    public final Set A03 = C17880vN.A12();

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
    public final synchronized void A00(java.lang.String r5, byte[] r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            X.AiK r0 = r4.A00     // Catch:{ IOException -> 0x0036 }
            if (r0 == 0) goto L_0x0040
            X.9oK r1 = X.AiK.A00(r0, r5)     // Catch:{ IOException -> 0x0036 }
            if (r1 == 0) goto L_0x0040
            X.9HU r0 = r1.A00()     // Catch:{ IOException -> 0x0036 }
            r0.write(r6)     // Catch:{ IOException -> 0x0036 }
            r1.A01()     // Catch:{ IOException -> 0x0036 }
            java.util.Set r3 = r4.A03     // Catch:{ IOException -> 0x0036 }
            monitor-enter(r3)     // Catch:{ IOException -> 0x0036 }
            r3.add(r5)     // Catch:{ all -> 0x0033 }
            X.0vc r1 = r4.A02     // Catch:{ all -> 0x0033 }
            java.lang.String r0 = "phoenix"
            android.content.SharedPreferences$Editor r2 = X.AnonymousClass8BU.A08(r1, r0)     // Catch:{ all -> 0x0033 }
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ all -> 0x0033 }
            r0.<init>(r3)     // Catch:{ all -> 0x0033 }
            java.lang.String r1 = r0.toString()     // Catch:{ all -> 0x0033 }
            java.lang.String r0 = "fcs_config_cache_key_set"
            X.C17880vN.A1E(r2, r0, r1)     // Catch:{ all -> 0x0033 }
            monitor-exit(r3)     // Catch:{ IOException -> 0x0036 }
            goto L_0x0040
        L_0x0033:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ IOException -> 0x0036 }
            throw r0     // Catch:{ IOException -> 0x0036 }
        L_0x0036:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0042 }
            java.lang.String r0 = "FcsConfigDiskCache/writeToDisk: "
            X.C17900vP.A0X(r2, r0, r1)     // Catch:{ all -> 0x0042 }
        L_0x0040:
            monitor-exit(r4)
            return
        L_0x0042:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C191149m6.A00(java.lang.String, byte[]):void");
    }

    public C191149m6(AnonymousClass118 r2, C18010vc r3) {
        C18070vi.A0j(r2, r3);
        this.A01 = r2;
        this.A02 = r3;
    }
}
