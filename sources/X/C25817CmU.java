package X;

import java.util.Map;

/* renamed from: X.CmU  reason: case insensitive filesystem */
public final class C25817CmU {
    public long A00;
    public C24865CNj A01;
    public C25814CmR A02;
    public C25794Cm6 A03;
    public CQY A04;
    public Float A05;
    public Float A06;
    public Long A07;
    public Long A08;
    public Long A09;
    public Long A0A;
    public String A0B;
    public String A0C;
    public Map A0D;
    public boolean A0E;
    public boolean A0F;
    public final AnonymousClass18K A0G;
    public final C18100vl A0H;
    public final AnonymousClass11P A0I;

    public synchronized void A01(C24474C5p c5p) {
        String str;
        Boolean bool;
        String str2;
        Integer num;
        if (!C72453Mb.A1a(this.A0H)) {
            C23844Br1 br1 = new C23844Br1();
            C25822CmZ cmZ = C25822CmZ.A0B;
            br1.A01 = cmZ.A01();
            String A002 = cmZ.A00();
            if (A002 == null) {
                A002 = "NULL";
            }
            br1.A02 = A002;
            String A022 = cmZ.A02();
            if (A022 != null) {
                br1.A03 = A022;
            }
            if (this.A0E) {
                str = "call";
            } else {
                str = "ringing";
            }
            br1.A04 = str;
            br1.A00 = C108955ca.A0m();
            String str3 = C24459C4z.A00;
            if (str3 != null) {
                br1.A05 = str3;
            }
            String str4 = C24459C4z.A03;
            if (str4 != null) {
                br1.A06 = str4;
            }
            String str5 = C24459C4z.A01;
            if (str5 != null) {
                br1.A07 = str5;
            }
            String str6 = C24459C4z.A02;
            if (str6 != null) {
                br1.A0A = str6;
            }
            String str7 = "connection_error";
            if (!(c5p instanceof C22951BWx)) {
                if (c5p instanceof C22952BWy) {
                    str7 = "call_start_error";
                } else if (c5p instanceof C22953BWz) {
                    str7 = "call_error";
                } else if (c5p instanceof BX0) {
                    str7 = "telemetry_error";
                } else {
                    C24712CGy.A01.A04("sup:SUPMediaStreamWamLogger", "MediaStreamErrorEvent not valid type", (Throwable) null);
                }
            }
            br1.A08 = str7;
            br1.A09 = c5p.A00();
            String str8 = this.A0B;
            if (str8 != null) {
                br1.A0B = str8;
            }
            synchronized (cmZ) {
                bool = C25822CmZ.A02;
            }
            if (C18070vi.A19(bool, true)) {
                str2 = "continuity";
            } else {
                str2 = "initiation";
            }
            br1.A0C = str2;
            synchronized (cmZ) {
                num = C25822CmZ.A04;
            }
            if (num != null) {
                br1.A0D = C24592CAn.A00(num);
            }
            this.A0G.CC0(br1, C18180vt.A06, true);
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void A00() {
        /*
            r11 = this;
            X.CmZ r10 = X.C25822CmZ.A0B
            monitor-enter(r10)
            java.lang.Boolean r0 = X.C25822CmZ.A03     // Catch:{ all -> 0x0191 }
            if (r0 == 0) goto L_0x000c
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0191 }
            goto L_0x000d
        L_0x000c:
            r0 = 0
        L_0x000d:
            monitor-exit(r10)
            if (r0 == 0) goto L_0x0190
            boolean r0 = r11.A0F
            if (r0 == 0) goto L_0x0018
            r0 = 0
            r11.A02(r0)
        L_0x0018:
            monitor-enter(r10)
            java.lang.Long r0 = X.C108955ca.A0m()     // Catch:{ all -> 0x0191 }
            X.C25822CmZ.A05 = r0     // Catch:{ all -> 0x0191 }
            java.lang.Boolean r9 = X.AnonymousClass000.A0h()     // Catch:{ all -> 0x0191 }
            X.C25822CmZ.A03 = r9     // Catch:{ all -> 0x0191 }
            monitor-exit(r10)
            r8 = r11
            monitor-enter(r8)
            r2 = r10
            monitor-enter(r2)     // Catch:{ all -> 0x018c }
            java.lang.Long r0 = X.C25822CmZ.A06     // Catch:{ all -> 0x0189 }
            monitor-exit(r2)     // Catch:{ all -> 0x018c }
            r3 = 0
            if (r0 != 0) goto L_0x0032
            goto L_0x011e
        L_0x0032:
            monitor-enter(r2)     // Catch:{ all -> 0x018c }
            java.lang.Long r0 = X.C25822CmZ.A05     // Catch:{ all -> 0x0189 }
            monitor-exit(r2)     // Catch:{ all -> 0x018c }
            if (r0 != 0) goto L_0x003c
            java.lang.String r2 = "sessionEndTime"
            goto L_0x0120
        L_0x003c:
            monitor-enter(r2)     // Catch:{ all -> 0x018c }
            java.lang.String r0 = X.C25822CmZ.A0A     // Catch:{ all -> 0x0189 }
            monitor-exit(r2)     // Catch:{ all -> 0x018c }
            if (r0 != 0) goto L_0x004a
            boolean r0 = r11.A0E     // Catch:{ all -> 0x018c }
            if (r0 == 0) goto L_0x004a
            java.lang.String r2 = "broadcastId"
            goto L_0x0120
        L_0x004a:
            monitor-enter(r2)     // Catch:{ all -> 0x018c }
            java.lang.Boolean r0 = X.C25822CmZ.A01     // Catch:{ all -> 0x0189 }
            monitor-exit(r2)     // Catch:{ all -> 0x018c }
            if (r0 == 0) goto L_0x0142
            X.0vl r0 = r11.A0H     // Catch:{ Exception -> 0x0107 }
            boolean r0 = X.C72453Mb.A1a(r0)     // Catch:{ Exception -> 0x0107 }
            if (r0 != 0) goto L_0x0142
            X.Br4 r3 = new X.Br4     // Catch:{ Exception -> 0x0107 }
            r3.<init>()     // Catch:{ Exception -> 0x0107 }
            java.lang.String r0 = r10.A01()     // Catch:{ Exception -> 0x0107 }
            r3.A08 = r0     // Catch:{ Exception -> 0x0107 }
            X.Cm6 r1 = r11.A03     // Catch:{ Exception -> 0x0107 }
            java.lang.Long r0 = r1.A01()     // Catch:{ Exception -> 0x0107 }
            if (r0 == 0) goto L_0x0075
            long r4 = r0.longValue()     // Catch:{ Exception -> 0x0107 }
            java.lang.Long r0 = java.lang.Long.valueOf(r4)     // Catch:{ Exception -> 0x0107 }
            r3.A00 = r0     // Catch:{ Exception -> 0x0107 }
        L_0x0075:
            monitor-enter(r1)     // Catch:{ Exception -> 0x0107 }
            java.lang.Long r0 = r1.A03     // Catch:{ all -> 0x0104 }
            monitor-exit(r1)     // Catch:{ Exception -> 0x0107 }
            if (r0 == 0) goto L_0x007d
            r3.A01 = r0     // Catch:{ Exception -> 0x0107 }
        L_0x007d:
            monitor-enter(r10)     // Catch:{ Exception -> 0x0107 }
            java.lang.String r0 = X.C25822CmZ.A0A     // Catch:{ all -> 0x0101 }
            monitor-exit(r10)     // Catch:{ Exception -> 0x0107 }
            if (r0 == 0) goto L_0x0085
            r3.A09 = r0     // Catch:{ Exception -> 0x0107 }
        L_0x0085:
            monitor-enter(r10)     // Catch:{ Exception -> 0x0107 }
            java.lang.Long r0 = X.C25822CmZ.A05     // Catch:{ all -> 0x0101 }
            monitor-exit(r10)     // Catch:{ Exception -> 0x0107 }
            X.C18070vi.A0b(r0)     // Catch:{ Exception -> 0x0107 }
            r3.A02 = r0     // Catch:{ Exception -> 0x0107 }
            monitor-enter(r10)     // Catch:{ Exception -> 0x0107 }
            java.lang.Long r0 = X.C25822CmZ.A06     // Catch:{ all -> 0x0101 }
            monitor-exit(r10)     // Catch:{ Exception -> 0x0107 }
            X.C18070vi.A0b(r0)     // Catch:{ Exception -> 0x0107 }
            r3.A03 = r0     // Catch:{ Exception -> 0x0107 }
            java.lang.Long r0 = r11.A08     // Catch:{ Exception -> 0x0107 }
            r6 = 0
            if (r0 == 0) goto L_0x00da
            long r4 = r0.longValue()     // Catch:{ Exception -> 0x0107 }
        L_0x00a1:
            java.lang.Long r0 = java.lang.Long.valueOf(r4)     // Catch:{ Exception -> 0x0107 }
            r3.A04 = r0     // Catch:{ Exception -> 0x0107 }
            boolean r0 = r11.A0E     // Catch:{ Exception -> 0x0107 }
            if (r0 == 0) goto L_0x00d7
            java.lang.String r0 = "call"
        L_0x00ad:
            r3.A0A = r0     // Catch:{ Exception -> 0x0107 }
            java.lang.Long r0 = r11.A09     // Catch:{ Exception -> 0x0107 }
            if (r0 == 0) goto L_0x00b7
            long r6 = r0.longValue()     // Catch:{ Exception -> 0x0107 }
        L_0x00b7:
            java.lang.Long r0 = java.lang.Long.valueOf(r6)     // Catch:{ Exception -> 0x0107 }
            r3.A05 = r0     // Catch:{ Exception -> 0x0107 }
            java.lang.String r0 = X.C24459C4z.A00     // Catch:{ Exception -> 0x0107 }
            if (r0 == 0) goto L_0x00c3
            r3.A0B = r0     // Catch:{ Exception -> 0x0107 }
        L_0x00c3:
            java.lang.String r0 = X.C24459C4z.A03     // Catch:{ Exception -> 0x0107 }
            if (r0 == 0) goto L_0x00c9
            r3.A0C = r0     // Catch:{ Exception -> 0x0107 }
        L_0x00c9:
            java.lang.String r0 = X.C24459C4z.A01     // Catch:{ Exception -> 0x0107 }
            if (r0 == 0) goto L_0x00cf
            r3.A0D = r0     // Catch:{ Exception -> 0x0107 }
        L_0x00cf:
            java.lang.String r0 = X.C24459C4z.A02     // Catch:{ Exception -> 0x0107 }
            if (r0 == 0) goto L_0x00d5
            r3.A0E = r0     // Catch:{ Exception -> 0x0107 }
        L_0x00d5:
            monitor-enter(r10)     // Catch:{ Exception -> 0x0107 }
            goto L_0x00dd
        L_0x00d7:
            java.lang.String r0 = "ringing"
            goto L_0x00ad
        L_0x00da:
            r4 = 0
            goto L_0x00a1
        L_0x00dd:
            java.lang.Integer r0 = X.C25822CmZ.A04     // Catch:{ all -> 0x0101 }
            monitor-exit(r10)     // Catch:{ Exception -> 0x0107 }
            if (r0 == 0) goto L_0x00e8
            java.lang.String r0 = X.C24592CAn.A00(r0)     // Catch:{ Exception -> 0x0107 }
            r3.A0F = r0     // Catch:{ Exception -> 0x0107 }
        L_0x00e8:
            java.lang.Long r0 = r1.A02()     // Catch:{ Exception -> 0x0107 }
            if (r0 == 0) goto L_0x00f0
            r3.A06 = r0     // Catch:{ Exception -> 0x0107 }
        L_0x00f0:
            java.lang.Long r0 = r1.A03()     // Catch:{ Exception -> 0x0107 }
            if (r0 == 0) goto L_0x00f8
            r3.A07 = r0     // Catch:{ Exception -> 0x0107 }
        L_0x00f8:
            X.18K r2 = r11.A0G     // Catch:{ Exception -> 0x0107 }
            X.0vt r1 = X.C18180vt.A06     // Catch:{ Exception -> 0x0107 }
            r0 = 1
            r2.CC0(r3, r1, r0)     // Catch:{ Exception -> 0x0107 }
            goto L_0x0142
        L_0x0101:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ Exception -> 0x0107 }
            goto L_0x0106
        L_0x0104:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ Exception -> 0x0107 }
        L_0x0106:
            throw r0     // Catch:{ Exception -> 0x0107 }
        L_0x0107:
            r3 = move-exception
            X.Cn1 r2 = X.C24712CGy.A01     // Catch:{ all -> 0x018c }
            java.lang.String r1 = "sup:SUPMediaStreamWamLogger"
            java.lang.String r0 = "Error logging session event"
            r2.A05(r1, r0, r3)     // Catch:{ all -> 0x018c }
            java.lang.String r0 = "TELEMETRY_SESSION_LOGGING_ERROR"
            X.BX0 r1 = new X.BX0     // Catch:{ all -> 0x018c }
            r1.<init>(r0)     // Catch:{ all -> 0x018c }
            X.BTj r0 = new X.BTj     // Catch:{ all -> 0x018c }
            r0.<init>(r3)     // Catch:{ all -> 0x018c }
            goto L_0x013f
        L_0x011e:
            java.lang.String r2 = "sessionStartTime"
        L_0x0120:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x018c }
            java.lang.String r0 = "Session telemetry event: "
            r1.append(r0)     // Catch:{ all -> 0x018c }
            r1.append(r2)     // Catch:{ all -> 0x018c }
            java.lang.String r0 = " is null"
            java.lang.String r2 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ all -> 0x018c }
            X.Cn1 r1 = X.C24712CGy.A01     // Catch:{ all -> 0x018c }
            java.lang.String r0 = "sup:SUPMediaStreamWamLogger"
            r1.A04(r0, r2, r3)     // Catch:{ all -> 0x018c }
            java.lang.String r0 = "TELEMETRY_SESSION_VALIDATION_ERROR"
            X.BX0 r1 = X.C22874BTj.A00(r0, r2)     // Catch:{ all -> 0x018c }
        L_0x013f:
            r11.A01(r1)     // Catch:{ all -> 0x018c }
        L_0x0142:
            r1 = 0
            r11.A09 = r1     // Catch:{ all -> 0x018c }
            r11.A08 = r1     // Catch:{ all -> 0x018c }
            X.Cm6 r2 = r11.A03     // Catch:{ all -> 0x018c }
            monitor-enter(r2)     // Catch:{ all -> 0x018c }
            r2.A03 = r1     // Catch:{ all -> 0x0189 }
            r2.A01 = r1     // Catch:{ all -> 0x0189 }
            monitor-enter(r2)     // Catch:{ all -> 0x0189 }
            r2.A02 = r1     // Catch:{ all -> 0x0186 }
            java.lang.Long r0 = r2.A03     // Catch:{ all -> 0x0186 }
            if (r0 != 0) goto L_0x0157
            r2.A03 = r1     // Catch:{ all -> 0x0186 }
        L_0x0157:
            monitor-exit(r2)     // Catch:{ all -> 0x0189 }
            monitor-enter(r2)     // Catch:{ all -> 0x0189 }
            r2.A00 = r1     // Catch:{ all -> 0x0186 }
            java.lang.Integer r0 = r2.A01     // Catch:{ all -> 0x0186 }
            if (r0 != 0) goto L_0x0161
            r2.A01 = r1     // Catch:{ all -> 0x0186 }
        L_0x0161:
            monitor-exit(r2)     // Catch:{ all -> 0x0189 }
            monitor-exit(r2)     // Catch:{ all -> 0x018c }
            r2 = r10
            monitor-enter(r2)     // Catch:{ all -> 0x018c }
            X.C25822CmZ.A08 = r1     // Catch:{ all -> 0x0189 }
            X.C25822CmZ.A0A = r1     // Catch:{ all -> 0x0189 }
            X.C25822CmZ.A07 = r1     // Catch:{ all -> 0x0189 }
            X.C25822CmZ.A09 = r1     // Catch:{ all -> 0x0189 }
            r0 = 1
            X.C25822CmZ.A00 = r0     // Catch:{ all -> 0x0189 }
            X.C25822CmZ.A03 = r9     // Catch:{ all -> 0x0189 }
            X.C25822CmZ.A01 = r1     // Catch:{ all -> 0x0189 }
            X.C25822CmZ.A02 = r1     // Catch:{ all -> 0x0189 }
            X.C25822CmZ.A06 = r1     // Catch:{ all -> 0x0189 }
            X.C25822CmZ.A05 = r1     // Catch:{ all -> 0x0189 }
            monitor-exit(r2)     // Catch:{ all -> 0x018c }
            X.CmR r0 = r11.A02     // Catch:{ all -> 0x018c }
            r0.A01()     // Catch:{ all -> 0x018c }
            java.util.Map r0 = r11.A0D     // Catch:{ all -> 0x018c }
            r0.clear()     // Catch:{ all -> 0x018c }
            goto L_0x018f
        L_0x0186:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0189 }
            throw r0     // Catch:{ all -> 0x0189 }
        L_0x0189:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x018c }
            throw r0     // Catch:{ all -> 0x018c }
        L_0x018c:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L_0x018f:
            monitor-exit(r8)
        L_0x0190:
            return
        L_0x0191:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25817CmU.A00():void");
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void A02(boolean r17) {
        /*
            r16 = this;
            r4 = r16
            boolean r0 = r4.A0F
            r5 = r17
            if (r0 != 0) goto L_0x0013
            if (r17 == 0) goto L_0x0010
            java.lang.Long r0 = X.C108955ca.A0m()
            r4.A0A = r0
        L_0x0010:
            r4.A0F = r5
            return
        L_0x0013:
            if (r17 != 0) goto L_0x0010
            monitor-enter(r4)
            long r12 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0371 }
            java.lang.Long r1 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x0371 }
            r4.A07 = r1     // Catch:{ all -> 0x0371 }
            java.lang.Long r0 = r4.A0A     // Catch:{ all -> 0x0371 }
            r3 = 0
            if (r0 == 0) goto L_0x009f
            if (r1 == 0) goto L_0x00cb
            long r10 = r0.longValue()     // Catch:{ all -> 0x0371 }
            boolean r0 = r4.A0E     // Catch:{ all -> 0x0371 }
            r8 = 0
            if (r0 == 0) goto L_0x008e
            long r6 = r4.A00     // Catch:{ all -> 0x0371 }
            r1 = -1
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x004e
            X.Cn1 r2 = X.C24712CGy.A01     // Catch:{ all -> 0x0371 }
            java.lang.String r1 = "sup:SUPMediaStreamWamLogger"
            java.lang.String r0 = "Live timestamp is invalid"
            r2.A04(r1, r0, r3)     // Catch:{ all -> 0x0371 }
            java.lang.String r0 = "TELEMETRY_LIVE_TIMESTAMP_INVALID"
            X.BX0 r1 = new X.BX0     // Catch:{ all -> 0x0371 }
            r1.<init>(r0)     // Catch:{ all -> 0x0371 }
        L_0x0049:
            r4.A01(r1)     // Catch:{ all -> 0x0371 }
            goto L_0x00fb
        L_0x004e:
            int r0 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x0063
            X.Cn1 r2 = X.C24712CGy.A01     // Catch:{ all -> 0x0371 }
            java.lang.String r1 = "sup:SUPMediaStreamWamLogger"
            java.lang.String r0 = "Live timestamp is after end timestamp"
            r2.A04(r1, r0, r3)     // Catch:{ all -> 0x0371 }
            java.lang.String r0 = "TELEMETRY_LIVE_TIMESTAMP_AFTER_END_TIMESTAMP"
            X.BX0 r1 = new X.BX0     // Catch:{ all -> 0x0371 }
            r1.<init>(r0)     // Catch:{ all -> 0x0371 }
            goto L_0x0049
        L_0x0063:
            int r0 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r0 >= 0) goto L_0x0069
            long r12 = r12 - r10
            goto L_0x007b
        L_0x0069:
            long r2 = r6 - r10
            long r12 = r12 - r6
            java.lang.Long r0 = r4.A09     // Catch:{ all -> 0x0371 }
            if (r0 == 0) goto L_0x008b
            long r0 = r0.longValue()     // Catch:{ all -> 0x0371 }
        L_0x0074:
            long r0 = r0 + r2
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0371 }
            r4.A09 = r0     // Catch:{ all -> 0x0371 }
        L_0x007b:
            java.lang.Long r0 = r4.A08     // Catch:{ all -> 0x0371 }
            if (r0 == 0) goto L_0x0083
            long r8 = r0.longValue()     // Catch:{ all -> 0x0371 }
        L_0x0083:
            long r8 = r8 + r12
            java.lang.Long r0 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x0371 }
            r4.A08 = r0     // Catch:{ all -> 0x0371 }
            goto L_0x00fb
        L_0x008b:
            r0 = 0
            goto L_0x0074
        L_0x008e:
            long r12 = r12 - r10
            java.lang.Long r0 = r4.A09     // Catch:{ all -> 0x0371 }
            if (r0 == 0) goto L_0x0097
            long r8 = r0.longValue()     // Catch:{ all -> 0x0371 }
        L_0x0097:
            long r8 = r8 + r12
            java.lang.Long r0 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x0371 }
            r4.A09 = r0     // Catch:{ all -> 0x0371 }
            goto L_0x00fb
        L_0x009f:
            X.Cn1 r2 = X.C24712CGy.A01     // Catch:{ all -> 0x0371 }
            java.lang.String r1 = "sup:SUPMediaStreamWamLogger"
            java.lang.String r0 = "Aggregate session data: startTimestamp is null"
            r2.A04(r1, r0, r3)     // Catch:{ all -> 0x0371 }
            java.lang.String r0 = "TELEMETRY_START_TIMESTAMP_IS_NULL"
            X.BX0 r2 = new X.BX0     // Catch:{ all -> 0x0371 }
            r2.<init>(r0)     // Catch:{ all -> 0x0371 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0371 }
            java.lang.String r0 = "endTimestamp is "
            r1.append(r0)     // Catch:{ all -> 0x0371 }
            java.lang.Long r0 = r4.A07     // Catch:{ all -> 0x0371 }
            java.lang.String r0 = X.C17890vO.A0V(r0, r1)     // Catch:{ all -> 0x0371 }
            java.lang.Throwable r1 = new java.lang.Throwable     // Catch:{ all -> 0x0371 }
            r1.<init>(r0)     // Catch:{ all -> 0x0371 }
            X.BTj r0 = new X.BTj     // Catch:{ all -> 0x0371 }
            r0.<init>(r1)     // Catch:{ all -> 0x0371 }
            r4.A01(r2)     // Catch:{ all -> 0x0371 }
        L_0x00cb:
            java.lang.Long r0 = r4.A07     // Catch:{ all -> 0x0371 }
            if (r0 != 0) goto L_0x00fb
            X.Cn1 r2 = X.C24712CGy.A01     // Catch:{ all -> 0x0371 }
            java.lang.String r1 = "sup:SUPMediaStreamWamLogger"
            java.lang.String r0 = "Aggregate session data: endTimestamp is null"
            r2.A04(r1, r0, r3)     // Catch:{ all -> 0x0371 }
            java.lang.String r0 = "TELEMETRY_END_TIMESTAMP_IS_NULL"
            X.BX0 r2 = new X.BX0     // Catch:{ all -> 0x0371 }
            r2.<init>(r0)     // Catch:{ all -> 0x0371 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0371 }
            java.lang.String r0 = "startTimestamp is "
            r1.append(r0)     // Catch:{ all -> 0x0371 }
            java.lang.Long r0 = r4.A0A     // Catch:{ all -> 0x0371 }
            java.lang.String r0 = X.C17890vO.A0V(r0, r1)     // Catch:{ all -> 0x0371 }
            java.lang.Throwable r1 = new java.lang.Throwable     // Catch:{ all -> 0x0371 }
            r1.<init>(r0)     // Catch:{ all -> 0x0371 }
            X.BTj r0 = new X.BTj     // Catch:{ all -> 0x0371 }
            r0.<init>(r1)     // Catch:{ all -> 0x0371 }
            r4.A01(r2)     // Catch:{ all -> 0x0371 }
        L_0x00fb:
            X.0vl r3 = r4.A0H     // Catch:{ all -> 0x036f }
            boolean r0 = X.C72453Mb.A1a(r3)     // Catch:{ all -> 0x036f }
            if (r0 != 0) goto L_0x0147
            X.CNj r12 = r4.A01     // Catch:{ all -> 0x036f }
            r1 = 0
            r8 = r12
            X.BWQ r8 = (X.BWQ) r8     // Catch:{ all -> 0x036f }
            if (r8 == 0) goto L_0x011e
            org.json.JSONArray r0 = r8.A00     // Catch:{ all -> 0x036f }
            if (r0 == 0) goto L_0x0115
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x036f }
            if (r0 != 0) goto L_0x0117
        L_0x0115:
            java.lang.String r0 = ""
        L_0x0117:
            int r0 = r0.length()     // Catch:{ all -> 0x036f }
            r6 = 0
            if (r0 != 0) goto L_0x011f
        L_0x011e:
            r6 = 1
        L_0x011f:
            java.lang.String r0 = X.C24459C4z.A01     // Catch:{ all -> 0x036f }
            if (r0 != 0) goto L_0x014e
            java.lang.String r3 = "deviceType"
        L_0x0125:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x036f }
            java.lang.String r0 = "Sup session end: "
            r2.append(r0)     // Catch:{ all -> 0x036f }
            r2.append(r3)     // Catch:{ all -> 0x036f }
            java.lang.String r0 = " is null"
            java.lang.String r3 = X.AnonymousClass000.A0y(r0, r2)     // Catch:{ all -> 0x036f }
            X.Cn1 r2 = X.C24712CGy.A01     // Catch:{ all -> 0x036f }
            java.lang.String r0 = "sup:SUPMediaStreamWamLogger"
            r2.A04(r0, r3, r1)     // Catch:{ all -> 0x036f }
            java.lang.String r0 = "TELEMETRY_SUP_SESSION_END_VALIDATION_ERROR"
            X.BX0 r0 = X.C22874BTj.A00(r0, r3)     // Catch:{ all -> 0x036f }
            r4.A01(r0)     // Catch:{ all -> 0x036f }
        L_0x0147:
            X.CmR r0 = r4.A02     // Catch:{ all -> 0x036f }
            r0.A01()     // Catch:{ all -> 0x036f }
            goto L_0x0364
        L_0x014e:
            java.lang.String r0 = X.C24459C4z.A03     // Catch:{ all -> 0x036f }
            if (r0 != 0) goto L_0x0155
            java.lang.String r3 = "deviceBuildType"
            goto L_0x0125
        L_0x0155:
            java.lang.String r0 = X.C24459C4z.A02     // Catch:{ all -> 0x036f }
            if (r0 != 0) goto L_0x015c
            java.lang.String r3 = "socVersion"
            goto L_0x0125
        L_0x015c:
            java.lang.String r0 = X.C24459C4z.A00     // Catch:{ all -> 0x036f }
            if (r0 != 0) goto L_0x0163
            java.lang.String r3 = "buildFlavor"
            goto L_0x0125
        L_0x0163:
            java.lang.Long r0 = r4.A0A     // Catch:{ all -> 0x036f }
            if (r0 != 0) goto L_0x016a
            java.lang.String r3 = "startTimestamp"
            goto L_0x0125
        L_0x016a:
            java.lang.Long r0 = r4.A07     // Catch:{ all -> 0x036f }
            if (r0 != 0) goto L_0x0171
            java.lang.String r3 = "endTimestamp"
            goto L_0x0125
        L_0x0171:
            java.lang.String r0 = r4.A0B     // Catch:{ all -> 0x036f }
            if (r0 != 0) goto L_0x0178
            java.lang.String r3 = "glassesSessionId"
            goto L_0x0125
        L_0x0178:
            X.CmZ r15 = X.C25822CmZ.A0B     // Catch:{ all -> 0x036f }
            java.lang.String r0 = r15.A00()     // Catch:{ all -> 0x036f }
            if (r0 != 0) goto L_0x0183
            java.lang.String r3 = "appColdStartSessionId"
            goto L_0x0125
        L_0x0183:
            java.lang.String r0 = r15.A02()     // Catch:{ all -> 0x036f }
            if (r0 != 0) goto L_0x018c
            java.lang.String r3 = "warmStartSessionId"
            goto L_0x0125
        L_0x018c:
            X.Cm6 r2 = r4.A03     // Catch:{ all -> 0x036f }
            monitor-enter(r2)     // Catch:{ all -> 0x036f }
            java.lang.Long r0 = r2.A03     // Catch:{ all -> 0x036c }
            monitor-exit(r2)     // Catch:{ all -> 0x036f }
            if (r0 != 0) goto L_0x0197
            java.lang.String r3 = "initialBatteryLevel"
            goto L_0x0125
        L_0x0197:
            java.lang.Long r0 = r2.A01()     // Catch:{ all -> 0x036f }
            if (r0 != 0) goto L_0x01a0
            java.lang.String r3 = "currentBatteryLevel"
            goto L_0x0125
        L_0x01a0:
            java.lang.Long r0 = r2.A03()     // Catch:{ all -> 0x036f }
            if (r0 != 0) goto L_0x01aa
            java.lang.String r3 = "initialThermalThrottlingState"
            goto L_0x0125
        L_0x01aa:
            java.lang.Long r0 = r2.A02()     // Catch:{ all -> 0x036f }
            if (r0 != 0) goto L_0x01b4
            java.lang.String r3 = "currentThermalThrottlingState"
            goto L_0x0125
        L_0x01b4:
            if (r6 == 0) goto L_0x01ba
            java.lang.String r3 = "latencyRecords"
            goto L_0x0125
        L_0x01ba:
            boolean r0 = X.C72453Mb.A1a(r3)     // Catch:{ Exception -> 0x0349 }
            if (r0 != 0) goto L_0x0147
            java.lang.Long r11 = r4.A0A     // Catch:{ Exception -> 0x0349 }
            X.C18070vi.A0b(r11)     // Catch:{ Exception -> 0x0349 }
            long r6 = r11.longValue()     // Catch:{ Exception -> 0x0349 }
            java.lang.Long r10 = r4.A07     // Catch:{ Exception -> 0x0349 }
            X.C18070vi.A0b(r10)     // Catch:{ Exception -> 0x0349 }
            long r0 = r10.longValue()     // Catch:{ Exception -> 0x0349 }
            X.Br8 r9 = new X.Br8     // Catch:{ Exception -> 0x0349 }
            r9.<init>()     // Catch:{ Exception -> 0x0349 }
            java.lang.String r3 = r15.A01()     // Catch:{ Exception -> 0x0349 }
            r9.A06 = r3     // Catch:{ Exception -> 0x0349 }
            java.lang.String r3 = r15.A00()     // Catch:{ Exception -> 0x0349 }
            X.C18070vi.A0b(r3)     // Catch:{ Exception -> 0x0349 }
            r9.A07 = r3     // Catch:{ Exception -> 0x0349 }
            java.lang.String r3 = r15.A02()     // Catch:{ Exception -> 0x0349 }
            X.C18070vi.A0b(r3)     // Catch:{ Exception -> 0x0349 }
            r9.A08 = r3     // Catch:{ Exception -> 0x0349 }
            monitor-enter(r2)     // Catch:{ Exception -> 0x0349 }
            java.lang.Long r3 = r2.A03     // Catch:{ all -> 0x0343 }
            monitor-exit(r2)     // Catch:{ Exception -> 0x0349 }
            X.C18070vi.A0b(r3)     // Catch:{ Exception -> 0x0349 }
            r9.A00 = r3     // Catch:{ Exception -> 0x0349 }
            java.lang.Long r3 = r2.A01()     // Catch:{ Exception -> 0x0349 }
            X.C18070vi.A0b(r3)     // Catch:{ Exception -> 0x0349 }
            r9.A01 = r3     // Catch:{ Exception -> 0x0349 }
            boolean r3 = r4.A0E     // Catch:{ Exception -> 0x0349 }
            if (r3 == 0) goto L_0x0212
            java.lang.String r3 = "call"
        L_0x0207:
            r9.A09 = r3     // Catch:{ Exception -> 0x0349 }
            X.CmR r3 = r4.A02     // Catch:{ Exception -> 0x0349 }
            java.lang.String r13 = "null cannot be cast to non-null type com.whatsapp.glasses.logging.SUPMediaStreamABRObserverImpl"
            X.C18070vi.A0z(r3, r13)     // Catch:{ Exception -> 0x0349 }
            monitor-enter(r3)     // Catch:{ Exception -> 0x0349 }
            goto L_0x0215
        L_0x0212:
            java.lang.String r3 = "ringing"
            goto L_0x0207
        L_0x0215:
            org.json.JSONArray r13 = r3.A00     // Catch:{ all -> 0x0346 }
            int r13 = r13.length()     // Catch:{ all -> 0x0346 }
            if (r13 <= 0) goto L_0x023e
            org.json.JSONArray r14 = r3.A00     // Catch:{ all -> 0x0346 }
            r13 = 0
            org.json.JSONObject r14 = r14.getJSONObject(r13)     // Catch:{ all -> 0x0346 }
            java.lang.String r13 = "start_time_ms"
            r14.put(r13, r6)     // Catch:{ all -> 0x0346 }
            org.json.JSONArray r13 = r3.A00     // Catch:{ all -> 0x0346 }
            org.json.JSONObject r14 = X.BE9.A11(r13)     // Catch:{ all -> 0x0346 }
            java.lang.String r13 = "end_time_ms"
            r14.put(r13, r0)     // Catch:{ all -> 0x0346 }
            org.json.JSONArray r13 = r3.A00     // Catch:{ all -> 0x0346 }
            java.lang.String r13 = r13.toString()     // Catch:{ all -> 0x0346 }
            X.C18070vi.A0b(r13)     // Catch:{ all -> 0x0346 }
            goto L_0x0240
        L_0x023e:
            java.lang.String r13 = ""
        L_0x0240:
            monitor-exit(r3)     // Catch:{ Exception -> 0x0349 }
            r9.A0A = r13     // Catch:{ Exception -> 0x0349 }
            monitor-enter(r3)     // Catch:{ Exception -> 0x0349 }
            org.json.JSONArray r13 = r3.A01     // Catch:{ all -> 0x0346 }
            int r13 = r13.length()     // Catch:{ all -> 0x0346 }
            if (r13 <= 0) goto L_0x026d
            org.json.JSONArray r14 = r3.A01     // Catch:{ all -> 0x0346 }
            r13 = 0
            org.json.JSONObject r14 = r14.getJSONObject(r13)     // Catch:{ all -> 0x0346 }
            java.lang.String r13 = "start_time_ms"
            r14.put(r13, r6)     // Catch:{ all -> 0x0346 }
            org.json.JSONArray r13 = r3.A01     // Catch:{ all -> 0x0346 }
            org.json.JSONObject r14 = X.BE9.A11(r13)     // Catch:{ all -> 0x0346 }
            java.lang.String r13 = "end_time_ms"
            r14.put(r13, r0)     // Catch:{ all -> 0x0346 }
            org.json.JSONArray r13 = r3.A01     // Catch:{ all -> 0x0346 }
            java.lang.String r13 = r13.toString()     // Catch:{ all -> 0x0346 }
            X.C18070vi.A0b(r13)     // Catch:{ all -> 0x0346 }
            goto L_0x026f
        L_0x026d:
            java.lang.String r13 = ""
        L_0x026f:
            monitor-exit(r3)     // Catch:{ Exception -> 0x0349 }
            r9.A0B = r13     // Catch:{ Exception -> 0x0349 }
            monitor-enter(r3)     // Catch:{ Exception -> 0x0349 }
            org.json.JSONArray r13 = r3.A02     // Catch:{ all -> 0x0346 }
            int r13 = r13.length()     // Catch:{ all -> 0x0346 }
            if (r13 <= 0) goto L_0x029c
            org.json.JSONArray r14 = r3.A02     // Catch:{ all -> 0x0346 }
            r13 = 0
            org.json.JSONObject r14 = r14.getJSONObject(r13)     // Catch:{ all -> 0x0346 }
            java.lang.String r13 = "start_time_ms"
            r14.put(r13, r6)     // Catch:{ all -> 0x0346 }
            org.json.JSONArray r13 = r3.A02     // Catch:{ all -> 0x0346 }
            org.json.JSONObject r14 = X.BE9.A11(r13)     // Catch:{ all -> 0x0346 }
            java.lang.String r13 = "end_time_ms"
            r14.put(r13, r0)     // Catch:{ all -> 0x0346 }
            org.json.JSONArray r13 = r3.A02     // Catch:{ all -> 0x0346 }
            java.lang.String r13 = r13.toString()     // Catch:{ all -> 0x0346 }
            X.C18070vi.A0b(r13)     // Catch:{ all -> 0x0346 }
            goto L_0x029e
        L_0x029c:
            java.lang.String r13 = ""
        L_0x029e:
            monitor-exit(r3)     // Catch:{ Exception -> 0x0349 }
            r9.A0C = r13     // Catch:{ Exception -> 0x0349 }
            monitor-enter(r3)     // Catch:{ Exception -> 0x0349 }
            org.json.JSONArray r13 = r3.A03     // Catch:{ all -> 0x0346 }
            int r13 = r13.length()     // Catch:{ all -> 0x0346 }
            if (r13 <= 0) goto L_0x02cb
            org.json.JSONArray r14 = r3.A03     // Catch:{ all -> 0x0346 }
            r13 = 0
            org.json.JSONObject r14 = r14.getJSONObject(r13)     // Catch:{ all -> 0x0346 }
            java.lang.String r13 = "start_time_ms"
            r14.put(r13, r6)     // Catch:{ all -> 0x0346 }
            org.json.JSONArray r6 = r3.A03     // Catch:{ all -> 0x0346 }
            org.json.JSONObject r7 = X.BE9.A11(r6)     // Catch:{ all -> 0x0346 }
            java.lang.String r6 = "end_time_ms"
            r7.put(r6, r0)     // Catch:{ all -> 0x0346 }
            org.json.JSONArray r0 = r3.A03     // Catch:{ all -> 0x0346 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0346 }
            X.C18070vi.A0b(r0)     // Catch:{ all -> 0x0346 }
            goto L_0x02cd
        L_0x02cb:
            java.lang.String r0 = ""
        L_0x02cd:
            monitor-exit(r3)     // Catch:{ Exception -> 0x0349 }
            r9.A0D = r0     // Catch:{ Exception -> 0x0349 }
            java.lang.String r0 = X.C24459C4z.A00     // Catch:{ Exception -> 0x0349 }
            X.C18070vi.A0b(r0)     // Catch:{ Exception -> 0x0349 }
            r9.A0E = r0     // Catch:{ Exception -> 0x0349 }
            java.lang.String r0 = X.C24459C4z.A03     // Catch:{ Exception -> 0x0349 }
            X.C18070vi.A0b(r0)     // Catch:{ Exception -> 0x0349 }
            r9.A0F = r0     // Catch:{ Exception -> 0x0349 }
            java.lang.String r0 = X.C24459C4z.A01     // Catch:{ Exception -> 0x0349 }
            X.C18070vi.A0b(r0)     // Catch:{ Exception -> 0x0349 }
            r9.A0G = r0     // Catch:{ Exception -> 0x0349 }
            java.lang.String r0 = X.C24459C4z.A02     // Catch:{ Exception -> 0x0349 }
            X.C18070vi.A0b(r0)     // Catch:{ Exception -> 0x0349 }
            r9.A0I = r0     // Catch:{ Exception -> 0x0349 }
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.glasses.logging.SUPMediaStreamLatencyManagerImpl"
            X.C18070vi.A0z(r12, r0)     // Catch:{ Exception -> 0x0349 }
            org.json.JSONArray r0 = r8.A00     // Catch:{ Exception -> 0x0349 }
            if (r0 == 0) goto L_0x02fb
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0349 }
            if (r0 != 0) goto L_0x02fd
        L_0x02fb:
            java.lang.String r0 = ""
        L_0x02fd:
            r9.A0H = r0     // Catch:{ Exception -> 0x0349 }
            java.lang.String r0 = r4.A0B     // Catch:{ Exception -> 0x0349 }
            X.C18070vi.A0b(r0)     // Catch:{ Exception -> 0x0349 }
            r9.A0J = r0     // Catch:{ Exception -> 0x0349 }
            r9.A02 = r10     // Catch:{ Exception -> 0x0349 }
            r9.A03 = r11     // Catch:{ Exception -> 0x0349 }
            java.lang.Long r0 = r2.A02()     // Catch:{ Exception -> 0x0349 }
            X.C18070vi.A0b(r0)     // Catch:{ Exception -> 0x0349 }
            r9.A04 = r0     // Catch:{ Exception -> 0x0349 }
            java.lang.Long r0 = r2.A03()     // Catch:{ Exception -> 0x0349 }
            X.C18070vi.A0b(r0)     // Catch:{ Exception -> 0x0349 }
            r9.A05 = r0     // Catch:{ Exception -> 0x0349 }
            monitor-enter(r15)     // Catch:{ Exception -> 0x0349 }
            java.lang.Integer r0 = X.C25822CmZ.A04     // Catch:{ all -> 0x0340 }
            monitor-exit(r15)     // Catch:{ Exception -> 0x0349 }
            if (r0 == 0) goto L_0x0328
            java.lang.String r0 = X.C24592CAn.A00(r0)     // Catch:{ Exception -> 0x0349 }
            r9.A0K = r0     // Catch:{ Exception -> 0x0349 }
        L_0x0328:
            X.18K r2 = r4.A0G     // Catch:{ Exception -> 0x0349 }
            X.0vt r1 = X.C18180vt.A06     // Catch:{ Exception -> 0x0349 }
            r0 = 1
            r2.CC0(r9, r1, r0)     // Catch:{ Exception -> 0x0349 }
            r3.A01()     // Catch:{ Exception -> 0x0349 }
            org.json.JSONArray r0 = X.AnonymousClass8BR.A1A()     // Catch:{ Exception -> 0x0349 }
            r8.A00 = r0     // Catch:{ Exception -> 0x0349 }
            monitor-enter(r15)     // Catch:{ Exception -> 0x0349 }
            r0 = 0
            X.C25822CmZ.A09 = r0     // Catch:{ all -> 0x0340 }
            monitor-exit(r15)     // Catch:{ Exception -> 0x0349 }
            goto L_0x0147
        L_0x0340:
            r0 = move-exception
            monitor-exit(r15)     // Catch:{ Exception -> 0x0349 }
            goto L_0x0348
        L_0x0343:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ Exception -> 0x0349 }
            goto L_0x0348
        L_0x0346:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ Exception -> 0x0349 }
        L_0x0348:
            throw r0     // Catch:{ Exception -> 0x0349 }
        L_0x0349:
            r3 = move-exception
            X.Cn1 r2 = X.C24712CGy.A01     // Catch:{ all -> 0x036f }
            java.lang.String r1 = "sup:SUPMediaStreamWamLogger"
            java.lang.String r0 = "Error logging sup session end event"
            r2.A05(r1, r0, r3)     // Catch:{ all -> 0x036f }
            java.lang.String r0 = "TELEMETRY_SUP_SESSION_END_LOGGING_ERROR"
            X.BX0 r1 = new X.BX0     // Catch:{ all -> 0x036f }
            r1.<init>(r0)     // Catch:{ all -> 0x036f }
            X.BTj r0 = new X.BTj     // Catch:{ all -> 0x036f }
            r0.<init>(r3)     // Catch:{ all -> 0x036f }
            r4.A01(r1)     // Catch:{ all -> 0x036f }
            goto L_0x0147
        L_0x0364:
            r0 = 0
            r4.A0A = r0     // Catch:{ all -> 0x0371 }
            r4.A07 = r0     // Catch:{ all -> 0x0371 }
            monitor-exit(r4)
            goto L_0x0010
        L_0x036c:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x036f }
            throw r0     // Catch:{ all -> 0x036f }
        L_0x036f:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0371 }
        L_0x0371:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25817CmU.A02(boolean):void");
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.Cm6, java.lang.Object] */
    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C25817CmU(AnonymousClass11P r4, C18030ve r5, AnonymousClass18K r6) {
        this();
        C18070vi.A0o(r6, r4, r5);
        this.A0G = r6;
        this.A0I = r4;
        this.A02 = new C25814CmR(r4);
        this.A03 = new Object();
        this.A04 = new CQY();
        this.A01 = new C24865CNj();
        this.A0H = AnonymousClass1DF.A00(AnonymousClass00R.A01, new DWX(r5, 12));
    }

    public C25817CmU() {
        this.A0D = AnonymousClass8BR.A17();
        this.A00 = -1;
    }
}
