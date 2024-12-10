package X;

import android.os.Handler;

/* renamed from: X.3Ce  reason: invalid class name and case insensitive filesystem */
public class C70703Ce implements Runnable {
    public int A00 = 0;
    public long A01 = 0;
    public Handler A02;
    public boolean A03 = false;
    public boolean A04 = false;
    public final C19880zA A05;
    public final C19880zA A06;
    public final C19880zA A07;
    public final AnonymousClass190 A08;
    public final AnonymousClass11S A09;
    public final C26261Rl A0A;
    public final C25001Mm A0B;
    public final C57052iS A0C;
    public final C54172di A0D;
    public final AnonymousClass1M9 A0E;
    public final C24921Me A0F;
    public final AnonymousClass12E A0G;
    public final C26861Tt A0H;
    public final C26191Re A0I;
    public final AnonymousClass1Q0 A0J;
    public final C19830z4 A0K;
    public final C18000vb A0L;
    public final C25181Nf A0M;
    public final C26291Ro A0N;
    public final C24661Le A0O;
    public final C26281Rn A0P;
    public final C196039uM A0Q;
    public final AnonymousClass19F A0R;
    public final AnonymousClass18K A0S;
    public final AnonymousClass126 A0T;
    public final C203911y A0U;
    public final C26221Rh A0V;
    public final C33701jF A0W;
    public final C27001Ui A0X;
    public final C33841jT A0Y;
    public final C54562eL A0Z;
    public final AnonymousClass00H A0a;
    public final AnonymousClass00H A0b;
    public final C19880zA A0c;
    public final C19880zA A0d;
    public final AnonymousClass11O A0e;
    public final C183549Yr A0f;
    public final C52582b9 A0g;

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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void run() {
        /*
            r20 = this;
            r2 = 0
            r1 = 1
            r0 = r20
            X.2ET r3 = new X.2ET     // Catch:{ all -> 0x0407 }
            r3.<init>()     // Catch:{ all -> 0x0407 }
            java.lang.String r3 = "registername/initializer/run"
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ all -> 0x0407 }
            long r6 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x0407 }
            long r4 = r0.A01     // Catch:{ all -> 0x0407 }
            r9 = 0
            int r3 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r3 != 0) goto L_0x001c
            r0.A01 = r6     // Catch:{ all -> 0x0407 }
        L_0x001c:
            X.00H r5 = r0.A0b     // Catch:{ all -> 0x0407 }
            java.lang.Object r4 = r5.get()     // Catch:{ all -> 0x0407 }
            X.2nO r4 = (X.C60102nO) r4     // Catch:{ all -> 0x0407 }
            java.lang.String r3 = "RegistrationInitializer"
            r4.A02(r3)     // Catch:{ all -> 0x0407 }
            java.lang.Object r5 = r5.get()     // Catch:{ all -> 0x0407 }
            X.2nO r5 = (X.C60102nO) r5     // Catch:{ all -> 0x0407 }
            java.lang.String r4 = "entry_point"
            java.lang.String r3 = "registration"
            r5.A03(r4, r3)     // Catch:{ all -> 0x0407 }
            r8 = 3
            X.1Tt r3 = r0.A0H     // Catch:{ all -> 0x0407 }
            r3.A01()     // Catch:{ all -> 0x0407 }
            java.lang.StringBuilder r6 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0407 }
            java.lang.String r3 = "when full sync request, the abprop updated at "
            r6.append(r3)     // Catch:{ all -> 0x0407 }
            X.19F r5 = r0.A0R     // Catch:{ all -> 0x0407 }
            long r3 = r5.A02()     // Catch:{ all -> 0x0407 }
            X.C17890vO.A16(r6, r3)     // Catch:{ all -> 0x0407 }
            long r5 = r5.A02()     // Catch:{ all -> 0x0407 }
            r3 = 0
            int r4 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r4 > 0) goto L_0x005f
            X.190 r5 = r0.A08     // Catch:{ all -> 0x0407 }
            java.lang.String r4 = "abprop-not-updated before registration full sync request"
            r5.A0G(r4, r3, r2)     // Catch:{ all -> 0x0407 }
        L_0x005f:
            android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x0407 }
            X.2R1 r4 = X.AnonymousClass2R1.A0M     // Catch:{ all -> 0x0407 }
            X.2sh r5 = new X.2sh     // Catch:{ all -> 0x0407 }
            r5.<init>(r4, r3)     // Catch:{ all -> 0x0407 }
            r5.A03 = r1     // Catch:{ all -> 0x0407 }
            X.2qq r4 = X.C62132qq.A0C     // Catch:{ all -> 0x0407 }
            r5.A00 = r4     // Catch:{ all -> 0x0407 }
            r5.A02 = r1     // Catch:{ all -> 0x0407 }
            X.2re r7 = r5.A02()     // Catch:{ all -> 0x0407 }
            android.os.Handler r4 = r0.A02     // Catch:{ all -> 0x0407 }
            X.12E r5 = r0.A0G     // Catch:{ all -> 0x0407 }
            if (r4 == 0) goto L_0x00d0
            X.2rf r6 = r5.A03(r7)     // Catch:{ all -> 0x0407 }
        L_0x007f:
            android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x0407 }
            X.1Re r7 = r0.A0I     // Catch:{ all -> 0x0407 }
            java.lang.String r4 = "DeviceSyncManager/syncAllNonContactUsersFromConversations"
            com.whatsapp.util.Log.i((java.lang.String) r4)     // Catch:{ all -> 0x0407 }
            java.util.HashSet r9 = X.C17880vN.A12()     // Catch:{ all -> 0x0407 }
            X.1Nd r4 = r7.A03     // Catch:{ all -> 0x0407 }
            java.util.HashSet r10 = r4.A0D()     // Catch:{ all -> 0x0407 }
            X.1M9 r4 = r7.A01     // Catch:{ all -> 0x0407 }
            java.util.ArrayList r4 = r4.A0L()     // Catch:{ all -> 0x0407 }
            java.util.Iterator r12 = r4.iterator()     // Catch:{ all -> 0x0407 }
        L_0x009d:
            boolean r4 = r12.hasNext()     // Catch:{ all -> 0x0407 }
            if (r4 == 0) goto L_0x00e1
            X.1E7 r11 = X.C17880vN.A0O(r12)     // Catch:{ all -> 0x0407 }
            X.1BI r4 = r11.A0J     // Catch:{ all -> 0x0407 }
            boolean r4 = X.C63412t2.A03(r4)     // Catch:{ all -> 0x0407 }
            if (r4 != 0) goto L_0x009d
            java.lang.Class<com.whatsapp.jid.UserJid> r5 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r4 = r11.A06(r5)     // Catch:{ all -> 0x0407 }
            if (r4 == 0) goto L_0x009d
            boolean r4 = r11.A0B()     // Catch:{ all -> 0x0407 }
            if (r4 != 0) goto L_0x009d
            X.1BI r4 = r11.A0J     // Catch:{ all -> 0x0407 }
            boolean r4 = r10.contains(r4)     // Catch:{ all -> 0x0407 }
            if (r4 == 0) goto L_0x009d
            com.whatsapp.jid.Jid r4 = r11.A06(r5)     // Catch:{ all -> 0x0407 }
            X.C17960vV.A07(r4)     // Catch:{ all -> 0x0407 }
            r9.add(r4)     // Catch:{ all -> 0x0407 }
            goto L_0x009d
        L_0x00d0:
            X.2P4 r4 = X.AnonymousClass12E.A00(r5, r7, r1)     // Catch:{ all -> 0x0407 }
            java.lang.Object r6 = r4.get()     // Catch:{ InterruptedException | ExecutionException -> 0x00db }
            X.2rf r6 = (X.C62602rf) r6     // Catch:{ InterruptedException | ExecutionException -> 0x00db }
            goto L_0x00dd
        L_0x00db:
            X.2rf r6 = X.C62602rf.A03     // Catch:{ all -> 0x0407 }
        L_0x00dd:
            X.AnonymousClass12E.A02(r5, r7, r6)     // Catch:{ all -> 0x0407 }
            goto L_0x007f
        L_0x00e1:
            boolean r4 = r9.isEmpty()     // Catch:{ all -> 0x0407 }
            if (r4 != 0) goto L_0x00f2
            com.whatsapp.jid.UserJid[] r4 = new com.whatsapp.jid.UserJid[r2]     // Catch:{ all -> 0x0407 }
            java.lang.Object[] r4 = r9.toArray(r4)     // Catch:{ all -> 0x0407 }
            com.whatsapp.jid.UserJid[] r4 = (com.whatsapp.jid.UserJid[]) r4     // Catch:{ all -> 0x0407 }
            r7.A01(r4, r8)     // Catch:{ all -> 0x0407 }
        L_0x00f2:
            java.lang.StringBuilder r5 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0407 }
            java.lang.String r4 = "registername/initializer/sync/done result="
            X.C17900vP.A0Y(r6, r4, r5)     // Catch:{ all -> 0x0407 }
            if (r6 == 0) goto L_0x010f
            int r5 = r6.A00     // Catch:{ all -> 0x0407 }
            if (r5 != 0) goto L_0x0105
            r0.A00 = r1     // Catch:{ all -> 0x0407 }
            goto L_0x03fd
        L_0x0105:
            r4 = 4
            if (r5 == r4) goto L_0x010b
            r4 = 6
            if (r5 != r4) goto L_0x010f
        L_0x010b:
            r0.A00 = r8     // Catch:{ all -> 0x0407 }
            goto L_0x03fd
        L_0x010f:
            java.lang.String r4 = "registername/setconnection/active"
            com.whatsapp.util.Log.i((java.lang.String) r4)     // Catch:{ all -> 0x0407 }
            X.11y r4 = r0.A0U     // Catch:{ all -> 0x0407 }
            r4.A03(r1)     // Catch:{ all -> 0x0407 }
            long r10 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x0407 }
            long r4 = r0.A01     // Catch:{ all -> 0x0407 }
            long r10 = r10 - r4
            X.126 r7 = r0.A0T     // Catch:{ all -> 0x0407 }
            X.00H r9 = r7.A12     // Catch:{ all -> 0x0407 }
            java.lang.Object r4 = r9.get()     // Catch:{ all -> 0x0407 }
            X.127 r4 = (X.AnonymousClass127) r4     // Catch:{ all -> 0x0407 }
            boolean r4 = r4.A01     // Catch:{ all -> 0x0407 }
            if (r4 == 0) goto L_0x0132
            r5 = 90000(0x15f90, double:4.4466E-319)
            goto L_0x0135
        L_0x0132:
            r5 = 45000(0xafc8, double:2.2233E-319)
        L_0x0135:
            boolean r4 = r7.A0l()     // Catch:{ all -> 0x0407 }
            r12 = 200(0xc8, double:9.9E-322)
            if (r4 == 0) goto L_0x0146
            int r4 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r4 >= 0) goto L_0x0146
            long r10 = r10 + r12
            android.os.SystemClock.sleep(r12)     // Catch:{ all -> 0x0407 }
            goto L_0x0135
        L_0x0146:
            int r4 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r4 < 0) goto L_0x015d
            boolean r4 = r7.A0l()     // Catch:{ all -> 0x0407 }
            if (r4 == 0) goto L_0x015d
            java.lang.Object r4 = r9.get()     // Catch:{ all -> 0x0407 }
            X.127 r4 = (X.AnonymousClass127) r4     // Catch:{ all -> 0x0407 }
            boolean r4 = r4.A01     // Catch:{ all -> 0x0407 }
            if (r4 != 0) goto L_0x015d
            r7.A0N(r8)     // Catch:{ all -> 0x0407 }
        L_0x015d:
            android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x0407 }
            java.lang.String r4 = "registername/shouldrefreshlists"
            com.whatsapp.util.Log.i((java.lang.String) r4)     // Catch:{ all -> 0x0407 }
            X.0z4 r4 = r0.A0K     // Catch:{ all -> 0x0407 }
            android.content.SharedPreferences$Editor r6 = X.C19830z4.A00(r4)     // Catch:{ all -> 0x0407 }
            java.lang.String r5 = "refresh_broadcast_lists"
            X.C17880vN.A1F(r6, r5, r1)     // Catch:{ all -> 0x0407 }
            X.1Rh r5 = r0.A0V     // Catch:{ all -> 0x0407 }
            r5.A00()     // Catch:{ all -> 0x0407 }
            X.1Rl r5 = r0.A0A     // Catch:{ all -> 0x0407 }
            r5.A01(r3)     // Catch:{ all -> 0x0407 }
            X.0zA r6 = r0.A06     // Catch:{ all -> 0x0407 }
            boolean r5 = r6.A07()     // Catch:{ all -> 0x0407 }
            if (r5 == 0) goto L_0x018c
            r6.A03()     // Catch:{ all -> 0x0407 }
            java.lang.String r3 = "loadSettingToSharedPreferences"
            java.lang.NullPointerException r3 = X.AnonymousClass000.A0s(r3)     // Catch:{ all -> 0x0407 }
        L_0x018b:
            throw r3     // Catch:{ all -> 0x0407 }
        L_0x018c:
            X.1Rn r5 = r0.A0P     // Catch:{ all -> 0x0407 }
            r5.A00()     // Catch:{ all -> 0x0407 }
            X.1Ro r5 = r0.A0N     // Catch:{ all -> 0x0407 }
            X.1Cd r5 = r5.A00     // Catch:{ all -> 0x0407 }
            r5.A06()     // Catch:{ all -> 0x0407 }
            java.io.File r5 = r5.A03     // Catch:{ all -> 0x0407 }
            boolean r5 = r5.exists()     // Catch:{ all -> 0x0407 }
            if (r5 == 0) goto L_0x01b3
            X.1Le r5 = r0.A0O     // Catch:{ all -> 0x0407 }
            boolean r5 = r5.A0I()     // Catch:{ all -> 0x0407 }
            if (r5 != 0) goto L_0x01b3
            X.1Mm r6 = r0.A0B     // Catch:{ all -> 0x0407 }
            X.0zA r5 = r0.A07     // Catch:{ all -> 0x0407 }
            com.whatsapp.jobqueue.job.GetStatusPrivacyJob r5 = X.C50252Ts.A00(r5)     // Catch:{ all -> 0x0407 }
            r6.A01(r5)     // Catch:{ all -> 0x0407 }
        L_0x01b3:
            X.1jF r5 = r0.A0W     // Catch:{ all -> 0x0407 }
            r5.A01(r1, r2)     // Catch:{ all -> 0x0407 }
            java.lang.String r5 = "registername/reintialized payments"
            com.whatsapp.util.Log.i((java.lang.String) r5)     // Catch:{ all -> 0x0407 }
            android.content.SharedPreferences$Editor r6 = X.C19830z4.A00(r4)     // Catch:{ all -> 0x0407 }
            java.lang.String r5 = "registration_biz_registered_on_device"
            X.C17880vN.A1F(r6, r5, r2)     // Catch:{ all -> 0x0407 }
            android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x0407 }
            java.util.HashMap r7 = X.C17880vN.A11()     // Catch:{ all -> 0x0407 }
            X.1Nf r5 = r0.A0M     // Catch:{ all -> 0x0407 }
            r8 = 50
            java.util.ArrayList r5 = r5.A02(r8)     // Catch:{ all -> 0x0407 }
            java.util.Iterator r11 = r5.iterator()     // Catch:{ all -> 0x0407 }
        L_0x01d9:
            boolean r5 = r11.hasNext()     // Catch:{ all -> 0x0407 }
            if (r5 == 0) goto L_0x020b
            X.1E7 r10 = X.C17880vN.A0O(r11)     // Catch:{ all -> 0x0407 }
            java.lang.Class<X.1BI> r9 = X.AnonymousClass1BI.class
            com.whatsapp.jid.Jid r6 = r10.A06(r9)     // Catch:{ all -> 0x0407 }
            X.1BI r6 = (X.AnonymousClass1BI) r6     // Catch:{ all -> 0x0407 }
            if (r6 == 0) goto L_0x01d9
            boolean r5 = X.C22971Dz.A0d(r6)     // Catch:{ all -> 0x0407 }
            if (r5 == 0) goto L_0x01f7
            X.C17890vO.A0z(r6, r7, r2)     // Catch:{ all -> 0x0407 }
            goto L_0x01d9
        L_0x01f7:
            X.1Ui r14 = r0.A0X     // Catch:{ all -> 0x0407 }
            com.whatsapp.jid.Jid r15 = r10.A06(r9)     // Catch:{ all -> 0x0407 }
            X.1BI r15 = (X.AnonymousClass1BI) r15     // Catch:{ all -> 0x0407 }
            java.lang.String r16 = "RegistrationInitializer.runInternal_A"
            r18 = 2
            r17 = r2
            r19 = r2
            r14.A03(r15, r16, r17, r18, r19)     // Catch:{ all -> 0x0407 }
            goto L_0x01d9
        L_0x020b:
            X.1M9 r5 = r0.A0E     // Catch:{ all -> 0x0407 }
            java.util.ArrayList r10 = r5.A0L()     // Catch:{ all -> 0x0407 }
            X.1Me r9 = r0.A0F     // Catch:{ Exception -> 0x026f }
            X.0vb r6 = r0.A0L     // Catch:{ Exception -> 0x026f }
            X.7Rj r5 = new X.7Rj     // Catch:{ Exception -> 0x026f }
            r5.<init>(r9, r6)     // Catch:{ Exception -> 0x026f }
            java.util.Collections.sort(r10, r5)     // Catch:{ Exception -> 0x026f }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ Exception -> 0x026f }
            r9 = 0
        L_0x0222:
            boolean r5 = r10.hasNext()     // Catch:{ Exception -> 0x026f }
            if (r5 == 0) goto L_0x0245
            X.1E7 r5 = X.C17880vN.A0O(r10)     // Catch:{ Exception -> 0x026f }
            com.whatsapp.jid.Jid r6 = X.AnonymousClass1E7.A01(r5)     // Catch:{ Exception -> 0x026f }
            com.whatsapp.jid.UserJid r6 = (com.whatsapp.jid.UserJid) r6     // Catch:{ Exception -> 0x026f }
            boolean r5 = r5.A10     // Catch:{ Exception -> 0x026f }
            if (r5 == 0) goto L_0x0222
            if (r6 == 0) goto L_0x0222
            boolean r5 = r7.containsKey(r6)     // Catch:{ Exception -> 0x026f }
            if (r5 != 0) goto L_0x0222
            int r9 = r9 + 1
            X.C17890vO.A0z(r6, r7, r2)     // Catch:{ Exception -> 0x026f }
            if (r9 <= r8) goto L_0x0222
        L_0x0245:
            X.1Ui r14 = r0.A0X     // Catch:{ Exception -> 0x026f }
            java.lang.String r16 = "RegistrationInitializer.runInternal_A"
            r18 = 2
            java.util.Iterator r6 = X.C17890vO.A0i(r7)     // Catch:{ Exception -> 0x026f }
        L_0x024f:
            boolean r5 = r6.hasNext()     // Catch:{ Exception -> 0x026f }
            if (r5 == 0) goto L_0x0280
            java.util.Map$Entry r5 = X.AnonymousClass000.A16(r6)     // Catch:{ Exception -> 0x026f }
            java.lang.Object r15 = r5.getKey()     // Catch:{ Exception -> 0x026f }
            X.1BI r15 = (X.AnonymousClass1BI) r15     // Catch:{ Exception -> 0x026f }
            java.lang.Object r5 = r5.getValue()     // Catch:{ Exception -> 0x026f }
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ Exception -> 0x026f }
            int r17 = r5.intValue()     // Catch:{ Exception -> 0x026f }
            r19 = r2
            r14.A03(r15, r16, r17, r18, r19)     // Catch:{ Exception -> 0x026f }
            goto L_0x024f
        L_0x026f:
            r7 = move-exception
            java.lang.StringBuilder r6 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0407 }
            java.lang.String r5 = "RegistrationInitializer/prefetchPhotos failed - "
            r6.append(r5)     // Catch:{ all -> 0x0407 }
            java.lang.String r5 = r7.getMessage()     // Catch:{ all -> 0x0407 }
            X.C17890vO.A19(r6, r5)     // Catch:{ all -> 0x0407 }
        L_0x0280:
            X.11S r6 = r0.A09     // Catch:{ all -> 0x0407 }
            r6.A0I()     // Catch:{ all -> 0x0407 }
            X.1E8 r5 = r6.A0D     // Catch:{ all -> 0x0407 }
            if (r5 == 0) goto L_0x029b
            int r5 = r5.A07     // Catch:{ all -> 0x0407 }
            if (r5 != 0) goto L_0x029b
            X.1Ui r5 = r0.A0X     // Catch:{ all -> 0x0407 }
            com.whatsapp.jid.PhoneUserJid r6 = X.AnonymousClass11S.A00(r6)     // Catch:{ all -> 0x0407 }
            java.lang.String r7 = "RegistrationInitializer.runInternal_A"
            r10 = r2
            r8 = r2
            r9 = r1
            r5.A03(r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0407 }
        L_0x029b:
            r10 = 0
        L_0x029c:
            X.2eL r5 = r0.A0Z     // Catch:{ all -> 0x0407 }
            X.2lS r6 = r5.A02     // Catch:{ all -> 0x0407 }
            monitor-enter(r6)     // Catch:{ all -> 0x0407 }
            java.util.HashMap r5 = r6.A00     // Catch:{ all -> 0x0331 }
            boolean r5 = r5.isEmpty()     // Catch:{ all -> 0x0331 }
            monitor-exit(r6)     // Catch:{ all -> 0x0407 }
            r8 = 10000(0x2710, double:4.9407E-320)
            if (r5 != 0) goto L_0x02b7
            long r5 = (long) r10     // Catch:{ all -> 0x0407 }
            int r7 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r7 >= 0) goto L_0x02b7
            android.os.SystemClock.sleep(r12)     // Catch:{ all -> 0x0407 }
            int r10 = r10 + 200
            goto L_0x029c
        L_0x02b7:
            android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x0407 }
            r0.A04 = r1     // Catch:{ all -> 0x0407 }
            X.9uM r5 = r0.A0Q     // Catch:{ all -> 0x0407 }
            r5.A00(r3)     // Catch:{ all -> 0x0407 }
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0407 }
            android.content.SharedPreferences$Editor r7 = X.C19830z4.A00(r4)     // Catch:{ all -> 0x0407 }
            java.lang.String r3 = "registration_initialized_time"
            X.C17880vN.A1D(r7, r3, r5)     // Catch:{ all -> 0x0407 }
            X.1jT r5 = r0.A0Y     // Catch:{ all -> 0x0407 }
            r3 = 3
            X.C33841jT.A03(r5, r3, r1)     // Catch:{ all -> 0x0407 }
            X.0zA r5 = r0.A05     // Catch:{ all -> 0x0407 }
            boolean r3 = r5.A07()     // Catch:{ all -> 0x0407 }
            if (r3 == 0) goto L_0x02e8
            r5.A03()     // Catch:{ all -> 0x0407 }
            java.lang.String r3 = "setReceivedCertRelatedNack"
            java.lang.NullPointerException r3 = X.AnonymousClass000.A0s(r3)     // Catch:{ all -> 0x0407 }
            goto L_0x018b
        L_0x02e8:
            android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x0407 }
            java.lang.String r3 = "registername/setregverified"
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ all -> 0x0407 }
            r5 = 0
            r0.A01 = r5     // Catch:{ all -> 0x0407 }
            java.lang.String r3 = "registername/fin/done"
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ all -> 0x0407 }
            boolean r3 = r4.A2Q()     // Catch:{ all -> 0x0407 }
            if (r3 != 0) goto L_0x0309
            java.lang.String r3 = "RegistrationInitializer/Enabling archive2.0"
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ all -> 0x0407 }
            X.1Q0 r3 = r0.A0J     // Catch:{ all -> 0x0407 }
            r3.A04()     // Catch:{ all -> 0x0407 }
        L_0x0309:
            X.2di r6 = r0.A0D     // Catch:{ all -> 0x0407 }
            monitor-enter(r6)     // Catch:{ all -> 0x0407 }
            X.00H r3 = r6.A02     // Catch:{ all -> 0x0331 }
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x0331 }
            X.1HV r3 = (X.AnonymousClass1HV) r3     // Catch:{ all -> 0x0331 }
            X.0z4 r3 = r3.A01     // Catch:{ all -> 0x0331 }
            boolean r3 = r3.A2S()     // Catch:{ all -> 0x0331 }
            if (r3 != 0) goto L_0x0335
            java.lang.String r3 = "MDOptInInitializer/forceOptIn updated"
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ all -> 0x0331 }
            monitor-enter(r6)     // Catch:{ all -> 0x0331 }
            java.lang.String r3 = "MDOptInInitializer/Opting In"
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ all -> 0x032e }
            X.2j6 r3 = r6.A00     // Catch:{ all -> 0x032e }
            r3.A00()     // Catch:{ all -> 0x032e }
            monitor-exit(r6)     // Catch:{ all -> 0x0331 }
            goto L_0x0335
        L_0x032e:
            r3 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0331 }
            throw r3     // Catch:{ all -> 0x0331 }
        L_0x0331:
            r3 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0407 }
            goto L_0x018b
        L_0x0335:
            monitor-exit(r6)     // Catch:{ all -> 0x0407 }
            X.2iS r6 = r0.A0C     // Catch:{ all -> 0x0407 }
            X.9nK r3 = r6.A00()     // Catch:{ all -> 0x0407 }
            if (r3 == 0) goto L_0x03e3
            java.lang.String r3 = r4.A0p()     // Catch:{ all -> 0x0407 }
            if (r3 == 0) goto L_0x037a
            X.00H r8 = r4.A00     // Catch:{ all -> 0x0407 }
            android.content.SharedPreferences r5 = X.C17880vN.A0B(r8)     // Catch:{ all -> 0x0407 }
            java.lang.String r3 = "pref_wfs_pw"
            r7 = 0
            java.lang.String r3 = r5.getString(r3, r7)     // Catch:{ all -> 0x0407 }
            if (r3 == 0) goto L_0x037a
            android.content.SharedPreferences r5 = X.C17880vN.A0B(r8)     // Catch:{ all -> 0x0407 }
            java.lang.String r3 = "pref_wfs_id_sign"
            java.lang.String r3 = r5.getString(r3, r7)     // Catch:{ all -> 0x0407 }
            if (r3 == 0) goto L_0x037a
            X.9nK r3 = r6.A00()     // Catch:{ all -> 0x0407 }
            X.C17960vV.A07(r3)     // Catch:{ all -> 0x0407 }
            X.00H r3 = r3.A0A     // Catch:{ all -> 0x0407 }
            java.lang.Object r8 = r3.get()     // Catch:{ all -> 0x0407 }
            X.6jy r8 = (X.C130766jy) r8     // Catch:{ all -> 0x0407 }
            X.10I r7 = r8.A02     // Catch:{ all -> 0x0407 }
            r5 = 42
            X.7Qp r3 = new X.7Qp     // Catch:{ all -> 0x0407 }
            r3.<init>(r8, r5)     // Catch:{ all -> 0x0407 }
            r7.CGF(r3)     // Catch:{ all -> 0x0407 }
        L_0x037a:
            r4.A0t()     // Catch:{ all -> 0x0407 }
            java.util.ArrayList r3 = r4.A0t()     // Catch:{ all -> 0x0407 }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x0407 }
            if (r3 != 0) goto L_0x03e3
            X.00H r5 = r4.A00     // Catch:{ all -> 0x0407 }
            android.content.SharedPreferences r3 = X.C17880vN.A0B(r5)     // Catch:{ all -> 0x0407 }
            java.lang.String r9 = "pref_nta_source"
            r4 = -1
            int r3 = r3.getInt(r9, r4)     // Catch:{ all -> 0x0407 }
            r8 = -1
            if (r3 == r4) goto L_0x03e3
            android.content.SharedPreferences r3 = X.C17880vN.A0B(r5)     // Catch:{ all -> 0x0407 }
            java.lang.String r5 = "pref_nta_disclosure_id"
            int r3 = r3.getInt(r5, r4)     // Catch:{ all -> 0x0407 }
            if (r3 == r4) goto L_0x03e3
            X.9nK r4 = r6.A00()     // Catch:{ all -> 0x0407 }
            X.C17960vV.A07(r4)     // Catch:{ all -> 0x0407 }
            X.00H r3 = r4.A09     // Catch:{ all -> 0x0407 }
            java.lang.Object r10 = r3.get()     // Catch:{ all -> 0x0407 }
            X.6jW r10 = (X.C130496jW) r10     // Catch:{ all -> 0x0407 }
            X.0z4 r7 = r4.A05     // Catch:{ all -> 0x0407 }
            X.00H r6 = r7.A00     // Catch:{ all -> 0x0407 }
            android.content.SharedPreferences r3 = X.C17880vN.A0B(r6)     // Catch:{ all -> 0x0407 }
            int r13 = r3.getInt(r5, r8)     // Catch:{ all -> 0x0407 }
            android.content.SharedPreferences r5 = X.C17880vN.A0B(r6)     // Catch:{ all -> 0x0407 }
            java.lang.String r4 = "pref_nta_discloure_version"
            java.lang.String r3 = ""
            java.lang.String r11 = r5.getString(r4, r3)     // Catch:{ all -> 0x0407 }
            X.C18070vi.A0X(r11)     // Catch:{ all -> 0x0407 }
            android.content.SharedPreferences r3 = X.C17880vN.A0B(r6)     // Catch:{ all -> 0x0407 }
            int r14 = r3.getInt(r9, r8)     // Catch:{ all -> 0x0407 }
            java.util.ArrayList r12 = r7.A0t()     // Catch:{ all -> 0x0407 }
            X.10I r3 = r10.A02     // Catch:{ all -> 0x0407 }
            X.3CD r9 = new X.3CD     // Catch:{ all -> 0x0407 }
            r9.<init>(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0407 }
            r3.CGF(r9)     // Catch:{ all -> 0x0407 }
        L_0x03e3:
            X.00H r3 = r0.A0a     // Catch:{ all -> 0x0407 }
            java.lang.Object r5 = r3.get()     // Catch:{ all -> 0x0407 }
            X.2Kj r5 = (X.C47892Kj) r5     // Catch:{ all -> 0x0407 }
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0407 }
            java.lang.String r3 = "RegistrationObservable/notifyRegistrationComplete isCompanionMode="
            X.C17900vP.A0n(r3, r4, r2)     // Catch:{ all -> 0x0407 }
            r4 = 2
            X.7KP r3 = new X.7KP     // Catch:{ all -> 0x0407 }
            r3.<init>(r2, r4)     // Catch:{ all -> 0x0407 }
            r5.notifyAllObservers(r3)     // Catch:{ all -> 0x0407 }
        L_0x03fd:
            r0.A03 = r1
            android.os.Handler r0 = r0.A02
            if (r0 == 0) goto L_0x0406
            r0.sendEmptyMessage(r2)
        L_0x0406:
            return
        L_0x0407:
            r3 = move-exception
            r0.A03 = r1
            android.os.Handler r0 = r0.A02
            if (r0 == 0) goto L_0x0411
            r0.sendEmptyMessage(r2)
        L_0x0411:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70703Ce.run():void");
    }

    public C70703Ce(Handler handler, C19880zA r4, C19880zA r5, C19880zA r6, C19880zA r7, C19880zA r8, AnonymousClass190 r9, AnonymousClass11S r10, C26261Rl r11, C25001Mm r12, C57052iS r13, C54172di r14, AnonymousClass1M9 r15, C24921Me r16, AnonymousClass12E r17, C26861Tt r18, C26191Re r19, AnonymousClass1Q0 r20, C19830z4 r21, AnonymousClass11O r22, C18000vb r23, C25181Nf r24, C26291Ro r25, C24661Le r26, C26281Rn r27, C196039uM r28, AnonymousClass19F r29, AnonymousClass18K r30, AnonymousClass126 r31, C203911y r32, C26221Rh r33, C33701jF r34, C27001Ui r35, C183549Yr r36, C33841jT r37, C52582b9 r38, C54562eL r39, AnonymousClass00H r40, AnonymousClass00H r41) {
        this.A0f = r36;
        this.A02 = handler;
        this.A0c = r4;
        this.A09 = r10;
        this.A0S = r30;
        this.A0J = r20;
        this.A0O = r26;
        this.A0B = r12;
        this.A0E = r15;
        this.A0F = r16;
        this.A0L = r23;
        this.A0d = r5;
        this.A0Z = r39;
        this.A0T = r31;
        this.A0I = r19;
        this.A0G = r17;
        this.A0U = r32;
        this.A0X = r35;
        this.A0Y = r37;
        this.A0K = r21;
        this.A0V = r33;
        this.A0A = r11;
        this.A0a = r40;
        this.A07 = r6;
        this.A0P = r27;
        this.A0Q = r28;
        this.A0W = r34;
        this.A05 = r7;
        this.A06 = r8;
        this.A0N = r25;
        this.A0M = r24;
        this.A0e = r22;
        this.A0b = r41;
        this.A0D = r14;
        this.A0H = r18;
        this.A0C = r13;
        this.A0g = r38;
        this.A0R = r29;
        this.A08 = r9;
    }
}
