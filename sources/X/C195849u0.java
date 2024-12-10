package X;

import android.app.Activity;

/* renamed from: X.9u0  reason: invalid class name and case insensitive filesystem */
public final class C195849u0 {
    public boolean A00;
    public final Activity A01;
    public final AnonymousClass1KB A02;
    public final C72073Kn A03;
    public final C37551pj A04;
    public final C188509hX A05;
    public final C61532pq A06;
    public final C24671Lf A07;
    public final C19830z4 A08;
    public final C24751Ln A09;
    public final AnonymousClass12L A0A;
    public final AnonymousClass1OZ A0B;
    public final Runnable A0C = new C21445AkC(this, 29);
    public final boolean A0D;
    public final Runnable A0E = new C21445AkC(this, 28);

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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void A02(java.lang.String r7) {
        /*
            r6 = this;
            X.9hX r3 = r6.A05
            com.whatsapp.jid.UserJid r5 = r3.A03
            boolean r2 = r3.A0A
            X.1pj r4 = r6.A04
            X.10I r1 = r4.A0G
            r0 = 7
            X.C21451AkI.A01(r1, r3, r4, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "BlockListResponseHandler/general_request_success jid="
            X.C17900vP.A0Y(r5, r0, r1)
            r3 = 1
            r6.A00 = r3
            if (r2 == 0) goto L_0x002d
            com.whatsapp.jid.UserJid r2 = X.C37551pj.A01(r4, r5)
            monitor-enter(r4)
            java.util.Set r0 = r4.A0K     // Catch:{ all -> 0x0051 }
            boolean r1 = r0.add(r5)     // Catch:{ all -> 0x0051 }
            if (r2 == 0) goto L_0x003e
            r0.add(r2)     // Catch:{ all -> 0x0051 }
            goto L_0x003e
        L_0x002d:
            r3 = 0
            com.whatsapp.jid.UserJid r2 = X.C37551pj.A01(r4, r5)
            monitor-enter(r4)
            java.util.Set r0 = r4.A0K     // Catch:{ all -> 0x0051 }
            boolean r1 = r0.remove(r5)     // Catch:{ all -> 0x0051 }
            if (r2 == 0) goto L_0x003e
            r0.remove(r2)     // Catch:{ all -> 0x0051 }
        L_0x003e:
            monitor-exit(r4)
            if (r1 == 0) goto L_0x0049
            X.C37551pj.A06(r4, r5, r7, r3)
            if (r2 == 0) goto L_0x0049
            X.C37551pj.A06(r4, r2, r7, r3)
        L_0x0049:
            X.1KB r1 = r6.A02
            java.lang.Runnable r0 = r6.A0C
            r1.CGP(r0)
            return
        L_0x0051:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C195849u0.A02(java.lang.String):void");
    }

    public C195849u0(Activity activity, AnonymousClass1KB r4, C72073Kn r5, C37551pj r6, C188509hX r7, C61532pq r8, C24671Lf r9, C19830z4 r10, C24751Ln r11, AnonymousClass12L r12, AnonymousClass1OZ r13, boolean z) {
        C18070vi.A0w(r4, r12, r13, r6, r9);
        C18070vi.A0l(r11, r10);
        this.A02 = r4;
        this.A0A = r12;
        this.A0B = r13;
        this.A04 = r6;
        this.A07 = r9;
        this.A09 = r11;
        this.A08 = r10;
        this.A01 = activity;
        this.A03 = r5;
        this.A06 = r8;
        this.A05 = r7;
        this.A0D = z;
    }

    public final void A00() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BlockListResponseHandler/general_request_timeout jid=");
        C17900vP.A0b(this.A05.A03, A10);
        this.A02.CGP(this.A0E);
    }

    public final void A01(int i) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BlockListResponseHandler/general_request_failed ");
        A10.append(i);
        A10.append(" | ");
        C17900vP.A0b(this.A05.A03, A10);
        this.A02.CGP(this.A0C);
    }
}
