package X;

/* renamed from: X.AkY  reason: case insensitive filesystem */
public class C21467AkY implements Runnable {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public C21467AkY(AnonymousClass1FL r2, C36721oM r3, String str) {
        this.A00 = 7;
        this.A01 = r3;
        this.A03 = str;
        this.A02 = r2;
    }

    public static void A00(AnonymousClass10I r1, Object obj, Object obj2, String str, int i) {
        r1.CGF(new C21467AkY(obj, obj2, str, i));
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:871)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:128)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void run() {
        /*
            r19 = this;
            r5 = r19
            int r0 = r5.A00
            switch(r0) {
                case 0: goto L_0x02cd;
                case 1: goto L_0x0bb6;
                case 2: goto L_0x0b5b;
                case 3: goto L_0x0afa;
                case 4: goto L_0x0ae5;
                case 5: goto L_0x0ac7;
                case 6: goto L_0x0a61;
                case 7: goto L_0x0a53;
                case 8: goto L_0x09f9;
                case 9: goto L_0x02aa;
                case 10: goto L_0x0285;
                case 11: goto L_0x09eb;
                case 12: goto L_0x0271;
                case 13: goto L_0x0253;
                case 14: goto L_0x09d1;
                case 15: goto L_0x08fb;
                case 16: goto L_0x0865;
                case 17: goto L_0x083b;
                case 18: goto L_0x0202;
                case 19: goto L_0x01df;
                case 20: goto L_0x01bc;
                case 21: goto L_0x0192;
                case 22: goto L_0x0169;
                case 23: goto L_0x012a;
                case 24: goto L_0x0821;
                case 25: goto L_0x07fe;
                case 26: goto L_0x07c8;
                case 27: goto L_0x07a0;
                case 28: goto L_0x0790;
                case 29: goto L_0x0778;
                case 30: goto L_0x0728;
                case 31: goto L_0x071e;
                case 32: goto L_0x0700;
                case 33: goto L_0x05ff;
                case 34: goto L_0x00fe;
                case 35: goto L_0x00cb;
                case 36: goto L_0x0577;
                case 37: goto L_0x0563;
                case 38: goto L_0x0556;
                case 39: goto L_0x0549;
                case 40: goto L_0x04d0;
                case 41: goto L_0x003b;
                case 42: goto L_0x0457;
                case 43: goto L_0x042f;
                case 44: goto L_0x03e9;
                case 45: goto L_0x03db;
                case 46: goto L_0x03a5;
                case 47: goto L_0x0391;
                case 48: goto L_0x0349;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r4 = r5.A01
            X.1ey r4 = (X.C31071ey) r4
            java.lang.String r1 = r5.A03
            java.lang.Object r3 = r5.A02
            X.Af0 r3 = (X.C21132Af0) r3
            if (r1 == 0) goto L_0x003a
            X.00H r2 = r4.A09
            java.lang.Object r0 = r2.get()
            X.9uF r0 = (X.C195969uF) r0
            r0.A02(r1)
            X.1QS r0 = r4.A07
            X.1KH r0 = X.AnonymousClass8BR.A0R(r0)
            boolean r1 = r0.A0L(r1)
            if (r1 == 0) goto L_0x0033
            java.lang.Object r0 = r2.get()
            X.9uF r0 = (X.C195969uF) r0
            r0.A01()
        L_0x0033:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r3.A0B(r0)
        L_0x003a:
            return
        L_0x003b:
            java.lang.Object r3 = r5.A01
            com.whatsapp.migration.transferinfra.connection.WifiDirectScannerConnectionHandler r3 = (com.whatsapp.migration.transferinfra.connection.WifiDirectScannerConnectionHandler) r3
            java.lang.String r6 = r5.A03
            java.lang.Object r4 = r5.A02
            java.util.concurrent.CountDownLatch r4 = (java.util.concurrent.CountDownLatch) r4
            r0 = 2
            X.C18070vi.A0d(r4, r0)
            r7 = 1
            X.8vT r0 = r3.A03
            if (r0 != 0) goto L_0x0054
            java.lang.String r0 = "p2p/WifiDirectScannerConnectionHandler/ WifiDirect is not initialized, we shouldn't be here."
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x0054:
            com.whatsapp.migration.transferinfra.connection.WifiDirectScannerConnectionHandler.A03(r3)
            r5 = 0
        L_0x0058:
            X.8vT r10 = r3.A03     // Catch:{ InterruptedException -> 0x0bcf }
            if (r10 == 0) goto L_0x00aa
            r1 = 0
            android.net.wifi.p2p.WifiP2pConfig r9 = new android.net.wifi.p2p.WifiP2pConfig     // Catch:{ InterruptedException -> 0x0bcf }
            r9.<init>()     // Catch:{ InterruptedException -> 0x0bcf }
            r9.deviceAddress = r6     // Catch:{ InterruptedException -> 0x0bcf }
            android.net.wifi.WpsInfo r0 = r9.wps     // Catch:{ InterruptedException -> 0x0bcf }
            r0.setup = r1     // Catch:{ InterruptedException -> 0x0bcf }
            android.net.wifi.p2p.WifiP2pManager$Channel r8 = r10.A00     // Catch:{ InterruptedException -> 0x0bcf }
            r2 = 0
            if (r8 == 0) goto L_0x0078
            android.net.wifi.p2p.nsd.WifiP2pDnsSdServiceRequest r1 = r10.A00     // Catch:{ InterruptedException -> 0x0bcf }
            if (r1 == 0) goto L_0x0078
            android.net.wifi.p2p.WifiP2pManager r0 = r10.A01     // Catch:{ InterruptedException -> 0x0bcf }
            if (r0 == 0) goto L_0x0078
            r0.removeServiceRequest(r8, r1, r2)     // Catch:{ InterruptedException -> 0x0bcf }
        L_0x0078:
            r10.A00 = r2     // Catch:{ InterruptedException -> 0x0bcf }
            android.net.wifi.p2p.WifiP2pManager$Channel r8 = r10.A00     // Catch:{ InterruptedException -> 0x0bcf }
            if (r8 == 0) goto L_0x00aa
            android.net.wifi.p2p.WifiP2pManager r2 = r10.A01     // Catch:{ InterruptedException -> 0x0bcf }
            if (r2 == 0) goto L_0x00aa
            java.lang.String r1 = "connect"
            X.AAD r0 = new X.AAD     // Catch:{ InterruptedException -> 0x0bcf }
            r0.<init>(r1)     // Catch:{ InterruptedException -> 0x0bcf }
            r2.connect(r8, r9, r0)     // Catch:{ InterruptedException -> 0x0bcf }
            boolean r0 = r0.A00()     // Catch:{ InterruptedException -> 0x0bcf }
            if (r0 != r7) goto L_0x00aa
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x0bcf }
            r0 = 30
            boolean r0 = r4.await(r0, r2)     // Catch:{ InterruptedException -> 0x0bcf }
            if (r0 != 0) goto L_0x003a
            java.lang.String r0 = "p2p/WifiDirectScannerConnectionHandler/ Connect successful but network not connected"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ InterruptedException -> 0x0bcf }
            X.8vT r0 = r3.A03     // Catch:{ InterruptedException -> 0x0bcf }
            if (r0 == 0) goto L_0x003a
            r3.A05()     // Catch:{ InterruptedException -> 0x0bcf }
            goto L_0x0bce
        L_0x00aa:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ InterruptedException -> 0x0bcf }
            java.lang.String r0 = "p2p/WifiDirectScannerConnectionHandler/ Unable to connect, attempt #"
            r1.append(r0)     // Catch:{ InterruptedException -> 0x0bcf }
            int r0 = r5 + 1
            java.lang.String r0 = X.C17880vN.A0t(r1, r0)     // Catch:{ InterruptedException -> 0x0bcf }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ InterruptedException -> 0x0bcf }
            r0 = 1000(0x3e8, double:4.94E-321)
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x0bcf }
            int r5 = r5 + 1
            r0 = 10
            if (r5 < r0) goto L_0x0058
            r3.A05()
            return
        L_0x00cb:
            java.lang.Object r0 = r5.A01
            android.content.Context r0 = (android.content.Context) r0
            java.lang.String r3 = r5.A03
            java.lang.Object r1 = r5.A02
            X.AIw r1 = (X.C20383AIw) r1
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            android.content.Intent r2 = r0.getLaunchIntentForPackage(r3)
            X.00H r0 = r1.A00
            if (r2 == 0) goto L_0x0bd5
            java.lang.Object r1 = r0.get()
            X.6xn r1 = (X.C138846xn) r1
            r0 = 0
            X.C18070vi.A0d(r3, r0)
            java.util.List r0 = X.C138846xn.A01
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L_0x003a
            java.util.concurrent.ConcurrentHashMap r1 = r1.A00
            X.6qL r0 = new X.6qL
            r0.<init>(r2)
            r1.put(r3, r0)
            return
        L_0x00fe:
            java.lang.Object r0 = r5.A01
            X.7LK r0 = (X.AnonymousClass7LK) r0
            java.lang.String r4 = r5.A03
            java.lang.Object r3 = r5.A02
            X.1BI r3 = (X.AnonymousClass1BI) r3
            X.6e8 r2 = r0.A00
            java.lang.StringBuilder r1 = X.C18070vi.A0K(r4)
            java.lang.String r0 = "ChatSupportTicketManager/contactSupport/onSuccess called, ticketId="
            X.C17900vP.A0f(r0, r4, r1)
            X.89p r0 = r2.A00
            r0.BoV(r3)
            java.lang.String r0 = "no_ticket_created"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x003a
            X.6nD r2 = r2.A01
            X.10I r1 = r2.A01
            r0 = 24
            X.AnonymousClass8BT.A1K(r1, r2, r4, r0)
            return
        L_0x012a:
            java.lang.Object r3 = r5.A01
            X.3TA r3 = (X.AnonymousClass3TA) r3
            java.lang.String r6 = r5.A03
            java.lang.Object r4 = r5.A02
            X.36w r4 = (X.C693536w) r4
            java.lang.Integer r1 = r3.A06
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            r2 = 0
            if (r1 != r0) goto L_0x0152
            java.lang.String r0 = r3.A0A
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0152
            java.lang.Integer r0 = X.AnonymousClass00R.A0N
            r3.A06 = r0
            boolean r0 = r3.A0B
            if (r0 == 0) goto L_0x014d
            r3.A04 = r4
        L_0x014d:
            r0 = 0
            X.AnonymousClass3TA.A06(r3, r0, r2, r2)
            return
        L_0x0152:
            X.4O2 r0 = r3.A01
            if (r0 == 0) goto L_0x003a
            java.lang.String r0 = r0.A02
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x003a
            java.lang.Integer r0 = X.AnonymousClass00R.A0N
            r3.A06 = r0
            r1 = 1
            X.36w r0 = r3.A04
            X.AnonymousClass3TA.A06(r3, r0, r2, r1)
            return
        L_0x0169:
            java.lang.Object r6 = r5.A01
            X.3TA r6 = (X.AnonymousClass3TA) r6
            java.lang.String r4 = r5.A03
            java.lang.Object r3 = r5.A02
            X.85B r3 = (X.AnonymousClass85B) r3
            java.lang.Integer r1 = r6.A07
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            if (r1 != r0) goto L_0x003a
            java.lang.String r0 = r6.A0A
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x003a
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            r6.A07 = r0
            r2 = 0
            r1 = 0
            r0 = 1
            X.AnonymousClass3TA.A07(r6, r1, r0, r2)
            X.4O2 r0 = new X.4O2
            r0.<init>(r6, r3, r4)
            goto L_0x023b
        L_0x0192:
            java.lang.Object r6 = r5.A01
            X.3TA r6 = (X.AnonymousClass3TA) r6
            java.lang.String r4 = r5.A03
            java.lang.Object r3 = r5.A02
            X.85B r3 = (X.AnonymousClass85B) r3
            java.lang.Integer r1 = r6.A06
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            if (r1 != r0) goto L_0x003a
            java.lang.String r0 = r6.A0A
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x003a
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            r6.A06 = r0
            r2 = 0
            r1 = 0
            r0 = 1
            X.AnonymousClass3TA.A06(r6, r1, r0, r2)
            X.4O2 r0 = new X.4O2
            r0.<init>(r6, r3, r4)
            r6.A01 = r0
            return
        L_0x01bc:
            java.lang.Object r4 = r5.A01
            X.3TA r4 = (X.AnonymousClass3TA) r4
            java.lang.String r3 = r5.A03
            java.lang.Object r2 = r5.A02
            X.36w r2 = (X.C693536w) r2
            java.lang.Integer r1 = r4.A08
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            if (r1 != r0) goto L_0x003a
            java.lang.String r0 = r4.A0A
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x003a
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            r4.A07 = r0
            boolean r0 = r4.A0B
            if (r0 == 0) goto L_0x003a
            r4.A05 = r2
            return
        L_0x01df:
            java.lang.Object r4 = r5.A01
            X.3TA r4 = (X.AnonymousClass3TA) r4
            java.lang.String r3 = r5.A03
            java.lang.Object r2 = r5.A02
            X.36w r2 = (X.C693536w) r2
            java.lang.Integer r1 = r4.A08
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            if (r1 != r0) goto L_0x003a
            java.lang.String r0 = r4.A0A
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x003a
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            r4.A06 = r0
            boolean r0 = r4.A0B
            if (r0 == 0) goto L_0x003a
            r4.A04 = r2
            return
        L_0x0202:
            java.lang.Object r6 = r5.A01
            X.3TA r6 = (X.AnonymousClass3TA) r6
            java.lang.String r3 = r5.A03
            java.lang.Object r5 = r5.A02
            X.36w r5 = (X.C693536w) r5
            java.lang.Integer r2 = r6.A07
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            r1 = 0
            if (r2 != r0) goto L_0x023e
            java.lang.String r0 = r6.A0A
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x023e
            java.lang.Integer r0 = X.AnonymousClass00R.A0N
            r6.A07 = r0
            X.7Fe r4 = r6.A00
            if (r4 == 0) goto L_0x0234
            boolean r0 = r6.A0D
            if (r0 == 0) goto L_0x0234
            X.1DT r3 = r6.A0M
            X.4DX r2 = X.AnonymousClass4DX.LARGE_THUMBNAIL_LOADED
            r1 = 0
            X.4UK r0 = new X.4UK
            r0.<init>(r4, r2, r1)
            r3.A0E(r0)
        L_0x0234:
            boolean r0 = r6.A0B
            if (r0 == 0) goto L_0x023a
            r6.A05 = r5
        L_0x023a:
            r0 = 0
        L_0x023b:
            r6.A02 = r0
            return
        L_0x023e:
            X.4O2 r0 = r6.A02
            if (r0 == 0) goto L_0x003a
            java.lang.String r0 = r0.A02
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x003a
            java.lang.Integer r0 = X.AnonymousClass00R.A0N
            r6.A07 = r0
            r0 = 1
            X.AnonymousClass3TA.A07(r6, r5, r1, r0)
            return
        L_0x0253:
            java.lang.Object r3 = r5.A01
            com.whatsapp.conversation.conversationrow.messagerating.MessageRatingViewModel r3 = (com.whatsapp.conversation.conversationrow.messagerating.MessageRatingViewModel) r3
            java.lang.Object r1 = r5.A02
            X.1BI r1 = (X.AnonymousClass1BI) r1
            java.lang.String r0 = r5.A03
            X.206 r0 = com.whatsapp.conversation.conversationrow.messagerating.MessageRatingViewModel.A00(r3, r1, r0)
            if (r0 == 0) goto L_0x003a
            X.9j9 r2 = r3.A04
            long r0 = r0.A0x
            java.lang.Integer r1 = r2.A00(r0)
            X.1DT r0 = r3.A01
            r0.A0E(r1)
            return
        L_0x0271:
            java.lang.Object r0 = r5.A01
            android.app.Activity r0 = (android.app.Activity) r0
            java.lang.Object r2 = r5.A02
            X.01n r2 = (X.C003401n) r2
            java.lang.String r1 = r5.A03
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto L_0x003a
            r2.A0S(r1)
            return
        L_0x0285:
            java.lang.Object r1 = r5.A01
            X.3uI r1 = (X.C79063uI) r1
            java.lang.Object r3 = r5.A02
            android.graphics.drawable.Drawable r3 = (android.graphics.drawable.Drawable) r3
            java.lang.String r2 = r5.A03
            r0 = 0
            com.whatsapp.WaImageView r1 = r1.A00
            if (r1 == 0) goto L_0x003a
            r1.setImageDrawable(r3)
            r1.setVisibility(r0)
            java.lang.Integer r0 = X.C137596vi.A00(r2)
            if (r0 == 0) goto L_0x003a
            android.view.animation.Animation r0 = r1.getAnimation()
            if (r0 != 0) goto L_0x003a
            X.C42491yG.A04(r1)
            return
        L_0x02aa:
            java.lang.Object r4 = r5.A01
            X.3uP r4 = (X.AnonymousClass3uP) r4
            java.lang.Object r3 = r5.A02
            com.whatsapp.TextEmojiLabel r3 = (com.whatsapp.TextEmojiLabel) r3
            java.lang.String r2 = r5.A03
            X.206 r0 = r4.getFMessage()
            X.205 r1 = r0.A0v
            java.lang.Object r0 = r4.getTag()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003a
            X.00H r0 = r4.A1v
            r0.get()
            X.AnonymousClass4XA.A00(r3, r2)
            return
        L_0x02cd:
            java.lang.Object r4 = r5.A01
            X.A7S r4 = (X.A7S) r4
            java.lang.Object r2 = r5.A02
            com.whatsapp.jid.GroupJid r2 = (com.whatsapp.jid.GroupJid) r2
            java.lang.String r1 = r5.A03
            X.1TA r0 = r4.A0A
            X.2Q4 r7 = r0.A03(r2)
            if (r7 == 0) goto L_0x003a
            java.lang.String r6 = r7.A00
            boolean r0 = r6.equals(r1)
            if (r0 != 0) goto L_0x003a
            X.190 r3 = r4.A00
            java.lang.String r1 = "linked-group-call/downgrade-ongoing-call"
            r0 = 0
            r2 = 0
            r3.A0G(r1, r2, r0)
            X.1TD r5 = r4.A09
            long r0 = r7.A01()
            X.9Bw r3 = r5.A05(r0)
            if (r3 == 0) goto L_0x003a
            monitor-enter(r7)
            com.whatsapp.jid.GroupJid r0 = r7.A02     // Catch:{ all -> 0x0bdf }
            boolean r0 = X.C42171xk.A00(r0, r2)     // Catch:{ all -> 0x0bdf }
            if (r0 != 0) goto L_0x030a
            r7.A02 = r2     // Catch:{ all -> 0x0bdf }
            r7.A02()     // Catch:{ all -> 0x0bdf }
        L_0x030a:
            monitor-exit(r7)
            r3.A0I(r2)
            r3.A0K(r7)
            X.0ve r2 = r4.A0C
            r1 = 12680(0x3188, float:1.7768E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0345
            r5.A0B(r3)
        L_0x0320:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "VoiceService/maybeClearCallLogWithSameGroupJid Cleaning up zombie call: "
            X.C17900vP.A0f(r0, r6, r1)
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            java.lang.String r0 = X.C40811vJ.A09(r6)
            r3.add(r0)
            X.A99 r0 = r4.A05
            java.util.concurrent.ScheduledThreadPoolExecutor r2 = r0.A1E
            if (r2 == 0) goto L_0x003a
            r1 = 30
            X.Ajy r0 = new X.Ajy
            r0.<init>(r4, r3, r1)
            r2.execute(r0)
            return
        L_0x0345:
            r5.A0A(r3)
            goto L_0x0320
        L_0x0349:
            java.lang.Object r3 = r5.A01
            X.9gp r3 = (X.C188069gp) r3
            java.lang.String r4 = r5.A03
            java.lang.Object r11 = r5.A02
            java.util.Map r11 = (java.util.Map) r11
            r0 = 2
            X.C18070vi.A0d(r11, r0)
            X.00H r0 = r3.A06     // Catch:{ 1oV -> 0x0381 }
            X.1OZ r2 = X.C17880vN.A0U(r0)     // Catch:{ 1oV -> 0x0381 }
            r0 = 32000(0x7d00, double:1.581E-319)
            r2.A0E(r0)     // Catch:{ 1oV -> 0x0381 }
            X.A8q r5 = r3.A02     // Catch:{ 1oV -> 0x0381 }
            X.C18070vi.A0b(r4)     // Catch:{ 1oV -> 0x0381 }
            java.lang.String r0 = "DeepLink"
            X.9rx r8 = new X.9rx     // Catch:{ 1oV -> 0x0381 }
            r8.<init>(r4, r0, r11)     // Catch:{ 1oV -> 0x0381 }
            java.lang.String r9 = "deeplink"
            r0 = 1
            X.AbG r6 = new X.AbG     // Catch:{ 1oV -> 0x0381 }
            r6.<init>(r3, r0)     // Catch:{ 1oV -> 0x0381 }
            r0 = 0
            X.AbJ r7 = new X.AbJ     // Catch:{ 1oV -> 0x0381 }
            r7.<init>(r3, r0)     // Catch:{ 1oV -> 0x0381 }
            r10 = 0
            r5.A0B(r6, r7, r8, r9, r10, r11)     // Catch:{ 1oV -> 0x0381 }
            return
        L_0x0381:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.1KB r1 = r3.A01
            r1.A04()
            r0 = 2131896261(0x7f1227c5, float:1.9427378E38)
            r1.A05(r0)
            return
        L_0x0391:
            java.lang.Object r3 = r5.A01
            com.whatsapp.notification.AndroidWear r3 = (com.whatsapp.notification.AndroidWear) r3
            java.lang.String r2 = r5.A03
            java.lang.Object r1 = r5.A02
            X.205 r1 = (X.AnonymousClass205) r1
            X.1iW r0 = r3.A01
            r0.A0j(r1, r2)
            r0 = 0
            com.whatsapp.notification.AndroidWear.A03(r3, r0)
            return
        L_0x03a5:
            java.lang.Object r1 = r5.A01
            com.whatsapp.notification.AndroidWear r1 = (com.whatsapp.notification.AndroidWear) r1
            java.lang.Object r0 = r5.A02
            X.1E7 r0 = (X.AnonymousClass1E7) r0
            java.lang.String r6 = r5.A03
            X.1BI r11 = X.AnonymousClass1E7.A00(r0)
            X.1i1 r0 = r1.A04
            r12 = 2
            r0.A0C(r11, r12)
            X.1iW r2 = r1.A01
            X.C17960vV.A07(r11)
            java.util.List r7 = java.util.Collections.singletonList(r11)
            r9 = 0
            r3 = 0
            r5 = r3
            r8 = r3
            r4 = r3
            r10 = r9
            r2.A0O(r3, r4, r5, r6, r7, r8, r9, r10)
            X.1hl r10 = r1.A03
            r13 = 3
            r14 = 1
            r16 = r14
            r15 = r14
            r17 = r9
            r10.A01(r11, r12, r13, r14, r15, r16, r17)
            com.whatsapp.notification.AndroidWear.A03(r1, r9)
            return
        L_0x03db:
            java.lang.Object r2 = r5.A01
            X.BB1 r2 = (X.BB1) r2
            java.lang.Object r1 = r5.A02
            java.util.Map r1 = (java.util.Map) r1
            java.lang.String r0 = r5.A03
            r2.C7h(r0, r1)
            return
        L_0x03e9:
            java.lang.Object r6 = r5.A01
            X.4Mk r6 = (X.C85184Mk) r6
            java.lang.String r1 = r5.A03
            java.lang.Object r4 = r5.A02
            X.5aE r4 = (X.C107565aE) r4
            java.net.URL r0 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0426 }
            r0.<init>(r1)     // Catch:{ MalformedURLException -> 0x0426 }
            java.lang.String r0 = r0.getHost()     // Catch:{ MalformedURLException -> 0x0426 }
            if (r0 == 0) goto L_0x0426
            X.1IX r3 = X.AnonymousClass1IX.of(r0)
            X.A7K r2 = X.A7K.A00()
            java.lang.String r1 = "url_domains"
            if (r3 == 0) goto L_0x040f
            X.29S r0 = r2.A00
            r0.A06(r1, r3)
        L_0x040f:
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterLinkPreviewCheckResponseImpl> r1 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterLinkPreviewCheckResponseImpl.class
            java.lang.String r0 = "NewsletterLinkPreviewCheck"
            X.AIj r1 = X.AIj.A00(r2, r1, r0)
            X.00H r0 = r6.A01
            X.A2g r1 = X.C108975cc.A0J(r1, r0)
            X.5Tc r0 = new X.5Tc
            r0.<init>(r4)
            r1.A04(r0)
            return
        L_0x0426:
            java.lang.String r0 = "NewsletterLinkPreviewChecker/failed to parse the url"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r4.BhY()
            return
        L_0x042f:
            java.lang.Object r6 = r5.A01
            X.AW1 r6 = (X.AW1) r6
            java.lang.Object r4 = r5.A02
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            r3 = 0
            boolean r1 = X.AnonymousClass8BU.A1X(r4)
            java.lang.Object r2 = r6.A0G
            monitor-enter(r2)
            boolean r0 = r6.A00     // Catch:{ all -> 0x04c8 }
            if (r0 != 0) goto L_0x04c6
            r4.run()     // Catch:{ all -> 0x044d }
            r6.A00 = r1     // Catch:{ all -> 0x044d }
            monitor-enter(r2)     // Catch:{ all -> 0x04c8 }
            r6.A00 = r3     // Catch:{ all -> 0x0452 }
            monitor-exit(r2)     // Catch:{ all -> 0x04c8 }
            goto L_0x04c6
        L_0x044d:
            r0 = move-exception
            monitor-enter(r2)     // Catch:{ all -> 0x04c8 }
            r6.A00 = r3     // Catch:{ all -> 0x0452 }
            goto L_0x0455
        L_0x0452:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x04c8 }
            goto L_0x0456
        L_0x0455:
            monitor-exit(r2)     // Catch:{ all -> 0x04c8 }
        L_0x0456:
            throw r0     // Catch:{ all -> 0x04c8 }
        L_0x0457:
            java.lang.Object r6 = r5.A01
            X.6iJ r6 = (X.C129756iJ) r6
            java.lang.String r13 = r5.A03
            java.lang.Object r4 = r5.A02
            X.89E r4 = (X.AnonymousClass89E) r4
            r3 = 1
            java.lang.String r1 = X.C17970vW.A04(r13)
            if (r1 == 0) goto L_0x04cb
            java.util.Map r2 = r6.A03
            monitor-enter(r2)
            java.lang.Object r0 = r2.get(r1)     // Catch:{ all -> 0x04c8 }
            X.68k r0 = (X.C1195068k) r0     // Catch:{ all -> 0x04c8 }
            if (r0 == 0) goto L_0x0478
            boolean r0 = r0.A01     // Catch:{ all -> 0x04c8 }
            if (r0 != r3) goto L_0x0478
            goto L_0x04c6
        L_0x0478:
            X.9W5 r0 = r6.A00     // Catch:{ all -> 0x04c8 }
            long r14 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x04c8 }
            X.7KB r10 = new X.7KB     // Catch:{ all -> 0x04c8 }
            r10.<init>(r4, r6, r13)     // Catch:{ all -> 0x04c8 }
            X.10H r0 = r0.A00     // Catch:{ all -> 0x04c8 }
            X.10E r3 = r0.A00     // Catch:{ all -> 0x04c8 }
            X.11P r5 = X.AnonymousClass10E.A6O(r3)     // Catch:{ all -> 0x04c8 }
            X.181 r4 = X.C108965cb.A0H(r3)     // Catch:{ all -> 0x04c8 }
            X.00S r0 = r3.AAV     // Catch:{ all -> 0x04c8 }
            java.lang.Object r7 = r0.get()     // Catch:{ all -> 0x04c8 }
            X.11Z r7 = (X.AnonymousClass11Z) r7     // Catch:{ all -> 0x04c8 }
            X.00S r0 = r3.A9a     // Catch:{ all -> 0x04c8 }
            java.lang.Object r12 = r0.get()     // Catch:{ all -> 0x04c8 }
            X.1Kg r12 = (X.C24421Kg) r12     // Catch:{ all -> 0x04c8 }
            X.00S r0 = r3.A6A     // Catch:{ all -> 0x04c8 }
            java.lang.Object r9 = r0.get()     // Catch:{ all -> 0x04c8 }
            X.1Kb r9 = (X.C24371Kb) r9     // Catch:{ all -> 0x04c8 }
            X.0ve r8 = X.AnonymousClass10E.A8r(r3)     // Catch:{ all -> 0x04c8 }
            X.118 r6 = X.AnonymousClass3MZ.A0l(r3)     // Catch:{ all -> 0x04c8 }
            X.1U8 r11 = X.AnonymousClass10E.AI5(r3)     // Catch:{ all -> 0x04c8 }
            X.68k r3 = new X.68k     // Catch:{ all -> 0x04c8 }
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x04c8 }
            r2.put(r1, r3)     // Catch:{ all -> 0x04c8 }
            java.lang.Object r0 = r2.get(r1)     // Catch:{ all -> 0x04c8 }
            X.68k r0 = (X.C1195068k) r0     // Catch:{ all -> 0x04c8 }
            if (r0 == 0) goto L_0x04c6
            r0.A03()     // Catch:{ all -> 0x04c8 }
        L_0x04c6:
            monitor-exit(r2)
            return
        L_0x04c8:
            r1 = move-exception
            monitor-exit(r2)
            throw r1
        L_0x04cb:
            java.lang.IllegalArgumentException r1 = X.C17890vO.A0K()
            throw r1
        L_0x04d0:
            java.lang.Object r12 = r5.A01
            X.7Ka r12 = (X.C145127Ka) r12
            java.lang.String r11 = r5.A03
            java.lang.Object r13 = r5.A02
            X.206 r13 = (X.AnonymousClass206) r13
            r10 = 0
            r0 = 0
            r12.A00 = r0
            java.util.ArrayList r9 = X.AnonymousClass000.A13()
            X.11P r0 = r12.A01
            long r5 = X.AnonymousClass11P.A01(r0)
            java.util.concurrent.ConcurrentHashMap r8 = r12.A0C
            X.10w r0 = X.AnonymousClass2V0.A00(r8)
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r14 = r0.iterator()
        L_0x04f6:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x053f
            java.util.Map$Entry r3 = X.AnonymousClass000.A16(r14)
            java.lang.Object r0 = r3.getValue()
            X.C18070vi.A0X(r0)
            long r1 = X.C17880vN.A05(r0)
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x04f6
            java.lang.Object r0 = r3.getKey()
            X.C18070vi.A0X(r0)
            r9.add(r0)
            java.lang.Integer r1 = X.AnonymousClass00R.A00
            X.205 r0 = r13.A0v
            X.1BI r0 = r0.A00
            X.C145127Ka.A01(r0, r12, r1, r11)
            boolean r0 = r13 instanceof X.AnonymousClass21V
            if (r0 == 0) goto L_0x04f6
            r7 = r13
            X.21V r7 = (X.AnonymousClass21V) r7
            long r3 = r7.A00
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x04f6
            r7.A00 = r5
            X.00H r0 = r12.A09
            java.lang.Object r0 = r0.get()
            X.1Nt r0 = (X.C25321Nt) r0
            r0.A05(r13)
            goto L_0x04f6
        L_0x053f:
            java.lang.String[] r0 = new java.lang.String[r10]
            java.lang.Object[] r0 = r9.toArray(r0)
            X.AnonymousClass4Z0.A02(r8, r0)
            return
        L_0x0549:
            java.lang.Object r3 = r5.A01
            X.7Ka r3 = (X.C145127Ka) r3
            java.lang.String r2 = r5.A03
            java.lang.Object r0 = r5.A02
            X.206 r0 = (X.AnonymousClass206) r0
            java.lang.Integer r1 = X.AnonymousClass00R.A0N
            goto L_0x056f
        L_0x0556:
            java.lang.Object r3 = r5.A01
            X.7Ka r3 = (X.C145127Ka) r3
            java.lang.String r2 = r5.A03
            java.lang.Object r0 = r5.A02
            X.206 r0 = (X.AnonymousClass206) r0
            java.lang.Integer r1 = X.AnonymousClass00R.A01
            goto L_0x056f
        L_0x0563:
            java.lang.Object r3 = r5.A01
            X.7Ka r3 = (X.C145127Ka) r3
            java.lang.String r2 = r5.A03
            java.lang.Object r0 = r5.A02
            X.206 r0 = (X.AnonymousClass206) r0
            java.lang.Integer r1 = X.AnonymousClass00R.A0Y
        L_0x056f:
            X.205 r0 = r0.A0v
            X.1BI r0 = r0.A00
            X.C145127Ka.A01(r0, r3, r1, r2)
            return
        L_0x0577:
            java.lang.Object r4 = r5.A01
            X.7Po r4 = (X.C146557Po) r4
            java.lang.Object r3 = r5.A02
            android.location.Address r3 = (android.location.Address) r3
            java.lang.String r2 = r5.A03
            r5 = 0
            if (r3 == 0) goto L_0x05b4
            int r0 = r3.getMaxAddressLineIndex()
            if (r0 < 0) goto L_0x0596
            java.lang.Object r0 = r4.A03
            X.75M r0 = (X.AnonymousClass75M) r0
            com.whatsapp.location.PlaceInfo r1 = r0.A1D
            java.lang.String r0 = r3.getAddressLine(r5)
            r1.A06 = r0
        L_0x0596:
            java.lang.Object r1 = r4.A03
            X.75M r1 = (X.AnonymousClass75M) r1
            com.whatsapp.location.PlaceInfo r0 = r1.A1D
            r0.A04 = r2
            java.lang.String r0 = r3.getLocality()
            if (r0 == 0) goto L_0x05b4
            java.lang.String r0 = r3.getLocality()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x05b4
            java.lang.String r0 = r3.getLocality()
            r1.A0Z = r0
        L_0x05b4:
            java.lang.Object r4 = r4.A03
            X.75M r4 = (X.AnonymousClass75M) r4
            X.01E r1 = r4.A0P
            r0 = 2131432269(0x7f0b134d, float:1.848629E38)
            android.widget.TextView r3 = X.AnonymousClass3MX.A0L(r1, r0)
            android.view.View r1 = r4.A0C
            r0 = 2131432180(0x7f0b12f4, float:1.848611E38)
            android.widget.TextView r2 = X.C17880vN.A0E(r1, r0)
            java.lang.Integer r1 = r4.A0X
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            if (r1 != r0) goto L_0x05f6
            java.lang.String r1 = r4.A0Z
        L_0x05d2:
            if (r3 == 0) goto L_0x05e2
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            int r0 = X.C72453Mb.A01(r0)
            r3.setVisibility(r0)
            r3.setText(r1)
        L_0x05e2:
            if (r2 == 0) goto L_0x05f2
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x05ec
            r5 = 8
        L_0x05ec:
            r2.setVisibility(r5)
            r2.setText(r1)
        L_0x05f2:
            X.AnonymousClass75M.A0A(r4)
            return
        L_0x05f6:
            com.whatsapp.location.PlaceInfo r0 = r4.A1D
            java.lang.String r1 = r0.A06
            if (r1 != 0) goto L_0x05d2
            java.lang.String r1 = r0.A04
            goto L_0x05d2
        L_0x05ff:
            java.lang.Object r14 = r5.A01
            com.whatsapp.group.newgroup.NewGroup r14 = (com.whatsapp.group.newgroup.NewGroup) r14
            java.lang.Object r6 = r5.A02
            java.util.List r6 = (java.util.List) r6
            java.lang.String r5 = r5.A03
            java.lang.ref.WeakReference r0 = X.AnonymousClass3MW.A0z(r14)
            X.00H r1 = r14.A0d
            java.lang.Object r1 = r1.get()
            X.2jS r1 = (X.C57672jS) r1
            X.1EB r4 = r1.A00()
            X.1EC r1 = r14.A0S
            if (r1 == 0) goto L_0x0650
            X.1M9 r1 = r14.A09
            X.1E7 r2 = r1.A0H(r4)
            java.lang.String r10 = r4.getRawString()
            long r12 = X.AnonymousClass8BS.A01(r14)
            com.whatsapp.WaEditText r1 = r14.A07
            r11 = 0
            if (r1 == 0) goto L_0x063a
            android.text.Editable r1 = r1.getText()
            if (r1 == 0) goto L_0x063a
            java.lang.String r11 = r1.toString()
        L_0x063a:
            r8 = 0
            X.1yX r7 = new X.1yX
            r9 = r8
            r7.<init>(r8, r9, r10, r11, r12)
            r2.A0M = r7
            X.1M9 r1 = r14.A09
            r11 = 0
            X.1M2 r1 = r1.A04
            r7 = r1
            r8 = r2
            r9 = r4
            r10 = r5
            r7.A0U(r8, r9, r10, r11)
        L_0x0650:
            X.126 r3 = r14.A0Q
            r2 = 1
            r1 = 0
            r3.A0U(r4, r6, r2, r1)
            X.11E r1 = r14.A07
            boolean r1 = r1.A09()
            if (r1 == 0) goto L_0x06b6
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r1 = "newgroup/go create group:"
            X.C17900vP.A0Y(r4, r1, r2)
            r18 = 30
            X.AkN r13 = new X.AkN
            r15 = r4
            r16 = r6
            r17 = r5
            r13.<init>(r14, r15, r16, r17, r18)
            X.0yx r1 = X.AnonymousClass8BR.A0B(r4, r13)
            r14.A05 = r1
            X.122 r2 = r14.A0J
            X.1PQ r3 = r14.A0W
            long r9 = X.AnonymousClass8BS.A01(r14)
            r7 = 2
            int r8 = r14.A00
            X.2Mh r1 = r3.A07(r4, r5, r6, r7, r8, r9)
            r2.BBM(r1)
            X.1KB r3 = r14.A05
            r1 = 38
            X.Aik r2 = new X.Aik
            r2.<init>(r0, r1)
            r0 = 10000(0x2710, double:4.9407E-320)
            r3.A0K(r2, r0)
        L_0x069a:
            X.00H r0 = r14.A0c
            java.lang.Object r4 = r0.get()
            X.4Zv r4 = (X.C88474Zv) r4
            X.3zc r3 = new X.3zc
            r3.<init>()
            r2 = 92
            r1 = 7
            r0 = 0
            X.C88474Zv.A00(r3, r4, r2, r1, r0)
            X.18K r1 = r4.A01
            X.0vt r0 = X.C88474Zv.A05
            r1.CC6(r3, r0)
            return
        L_0x06b6:
            java.lang.String r1 = "newgroup/no network access, fail to create group"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.122 r2 = r14.A0J
            X.1PQ r3 = r14.A0W
            long r9 = X.AnonymousClass8BS.A01(r14)
            r7 = 3
            int r8 = r14.A00
            X.2Mh r1 = r3.A07(r4, r5, r6, r7, r8, r9)
            r2.BBM(r1)
            java.io.File r1 = com.whatsapp.group.newgroup.NewGroup.A03(r14)
            if (r1 == 0) goto L_0x06f3
            X.1Up r2 = r14.A0V     // Catch:{ IOException -> 0x06ed }
            byte[] r1 = X.C64062u9.A0W(r1)     // Catch:{ IOException -> 0x06ed }
            X.2d4 r5 = r2.A0C(r1)     // Catch:{ IOException -> 0x06ed }
            X.1M9 r1 = r14.A09     // Catch:{ IOException -> 0x06ed }
            X.1E7 r4 = r1.A0H(r4)     // Catch:{ IOException -> 0x06ed }
            X.1Tv r3 = r14.A0D     // Catch:{ IOException -> 0x06ed }
            byte[] r2 = r5.A00     // Catch:{ IOException -> 0x06ed }
            byte[] r1 = r5.A01     // Catch:{ IOException -> 0x06ed }
            r3.A02(r4, r2, r1)     // Catch:{ IOException -> 0x06ed }
            goto L_0x06f3
        L_0x06ed:
            r2 = move-exception
            java.lang.String r1 = "newgroup/failed to update photo"
            com.whatsapp.util.Log.e(r1, r2)
        L_0x06f3:
            X.1KB r3 = r14.A05
            r2 = 39
            X.Aik r1 = new X.Aik
            r1.<init>(r0, r2)
            r3.A0J(r1)
            goto L_0x069a
        L_0x0700:
            java.lang.Object r6 = r5.A01
            X.AS5 r6 = (X.AS5) r6
            java.lang.Object r4 = r5.A02
            java.lang.String r3 = r5.A03
            X.9ir r2 = r6.A00
            X.9t0 r0 = r6.A04
            java.lang.String r1 = r0.A02
            java.lang.String r0 = r0.A01
            X.8tc r2 = r2.A00(r1, r0, r3)
            r1 = 3
            X.AU4 r0 = new X.AU4
            r0.<init>(r6, r4, r1)
            r2.CBv(r0)
            return
        L_0x071e:
            java.lang.Object r1 = r5.A01
            X.1Di r1 = (X.C22821Di) r1
            java.lang.Object r0 = r5.A02
            r1.invoke(r0)
            return
        L_0x0728:
            java.lang.Object r3 = r5.A01
            com.whatsapp.email.UpdateEmailActivity r3 = (com.whatsapp.email.UpdateEmailActivity) r3
            java.lang.String r4 = r5.A03
            java.lang.Object r2 = r5.A02
            java.lang.Number r2 = (java.lang.Number) r2
            r1 = 1
            X.C18070vi.A0d(r4, r1)
            r0 = 5
            X.AnonymousClass4Yv.A00(r3, r0)
            X.00H r0 = r3.A4b()
            java.lang.Object r5 = r0.get()
            X.9kJ r5 = (X.C190059kJ) r5
            java.lang.String r6 = r3.A0A
            int r8 = r3.A00
            int r0 = r4.length()
            if (r0 != 0) goto L_0x0769
            r9 = 4
        L_0x074f:
            r10 = 2
            java.lang.String r7 = java.lang.String.valueOf(r2)
            r11 = r10
            r5.A00(r6, r7, r8, r9, r10, r11)
            X.AnonymousClass4Yv.A00(r3, r1)
            if (r2 == 0) goto L_0x0773
            int r1 = r2.intValue()
            r0 = 533(0x215, float:7.47E-43)
            if (r1 != r0) goto L_0x076e
            com.whatsapp.email.UpdateEmailActivity.A0Q(r3)
            return
        L_0x0769:
            int r9 = com.whatsapp.email.UpdateEmailActivity.A03(r3)
            goto L_0x074f
        L_0x076e:
            r0 = 403(0x193, float:5.65E-43)
            r2 = 4
            if (r1 == r0) goto L_0x0774
        L_0x0773:
            r2 = 3
        L_0x0774:
            X.AnonymousClass4Yv.A01(r3, r2)
            return
        L_0x0778:
            java.lang.Object r2 = r5.A01
            com.whatsapp.documentpicker.DocumentPreviewActivity r2 = (com.whatsapp.documentpicker.DocumentPreviewActivity) r2
            java.lang.Object r3 = r5.A02
            java.lang.String r4 = r5.A03
            java.lang.String r5 = com.whatsapp.documentpicker.DocumentPreviewActivity.A03(r2)
            X.1KB r0 = r2.A05
            r6 = 4
            X.7Pw r1 = new X.7Pw
            r1.<init>(r2, r3, r4, r5, r6)
            r0.A0J(r1)
            return
        L_0x0790:
            java.lang.Object r2 = r5.A01
            X.1La r2 = (X.C24621La) r2
            java.lang.String r1 = "status_distribution"
            java.lang.Object r0 = r5.A02
            X.1DS r0 = (X.AnonymousClass1DS) r0
            java.lang.String r1 = r2.A02(r1)
            goto L_0x0abb
        L_0x07a0:
            java.lang.Object r0 = r5.A01
            X.A5I r0 = (X.A5I) r0
            java.lang.String r3 = r5.A03
            java.lang.Object r2 = r5.A02
            X.Af0 r2 = (X.C21132Af0) r2
            X.1KH r0 = r0.A01
            X.AEs r0 = r0.A08(r3)
            if (r0 == 0) goto L_0x07b6
            r2.A0B(r0)
            return
        L_0x07b6:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Payments: failed to read payment method from credId: "
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r3, r1)
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0w(r0)
            r2.A0C(r0)
            return
        L_0x07c8:
            java.lang.Object r0 = r5.A01
            X.1pi r0 = (X.C37541pi) r0
            java.lang.Object r1 = r5.A02
            X.206 r1 = (X.AnonymousClass206) r1
            java.lang.String r3 = r5.A03
            X.1Cd r0 = r0.A00
            X.1au r5 = r0.A05()
            android.content.ContentValues r4 = X.C17880vN.A08()     // Catch:{ all -> 0x07f9 }
            java.lang.String r2 = "message_row_id"
            long r0 = r1.A0x     // Catch:{ all -> 0x07f9 }
            X.C17880vN.A19(r4, r2, r0)     // Catch:{ all -> 0x07f9 }
            java.lang.String r0 = "message_template_id"
            r4.put(r0, r3)     // Catch:{ all -> 0x07f9 }
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x07f9 }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x07f9 }
            java.lang.String r2 = "messages_hydrated_four_row_template"
            java.lang.String r1 = "addTemplateId/INSERT_MESSAGES_HYDRATED_FOUR_ROW_TEMPLATE"
            r0 = 5
            r3.A09(r2, r1, r4, r0)     // Catch:{ all -> 0x07f9 }
            r5.close()
            return
        L_0x07f9:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x0bb1 }
            throw r1
        L_0x07fe:
            java.lang.Object r6 = r5.A01
            X.1NI r6 = (X.AnonymousClass1NI) r6
            java.lang.Object r4 = r5.A02
            X.1BI r4 = (X.AnonymousClass1BI) r4
            java.lang.String r3 = r5.A03
            r2 = 0
            X.1CJ r1 = r6.A01
            X.1ci r0 = r1.A0A(r4)
            if (r0 != 0) goto L_0x081b
            X.1ci r0 = new X.1ci
            r0.<init>((X.AnonymousClass1BI) r4)
            r0.A0k = r3
            r1.A0K(r0, r4)
        L_0x081b:
            r0.A0k = r3
            X.AnonymousClass1NI.A00(r0, r6, r4, r2)
            return
        L_0x0821:
            java.lang.Object r3 = r5.A01
            X.1Qz r3 = (X.C26141Qz) r3
            java.lang.String r2 = r5.A03
            java.lang.Object r1 = r5.A02
            r0 = 2
            X.C18070vi.A0d(r1, r0)
            X.00H r0 = r3.A0C
            java.lang.Object r0 = r0.get()
            X.2aQ r0 = (X.C52132aQ) r0
            java.util.concurrent.ConcurrentHashMap r0 = r0.A00
            r0.put(r2, r1)
            return
        L_0x083b:
            java.lang.Object r4 = r5.A01
            X.4aY r4 = (X.AnonymousClass4aY) r4
            java.lang.Object r2 = r5.A02
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            java.lang.String r1 = r5.A03
            r0 = 16
            X.AkY r3 = new X.AkY
            r3.<init>(r4, r2, r1, r0)
            X.00H r0 = r4.A51
            java.lang.Object r0 = r0.get()
            X.2gI r0 = (X.C55742gI) r0
            X.9tU r0 = r0.A00
            X.Af0 r2 = r0.A01(r2)
            r1 = 11
            X.7Nc r0 = new X.7Nc
            r0.<init>(r3, r1)
            r2.A09(r0)
            return
        L_0x0865:
            java.lang.Object r2 = r5.A01
            X.4aY r2 = (X.AnonymousClass4aY) r2
            java.lang.Object r9 = r5.A02
            com.whatsapp.jid.UserJid r9 = (com.whatsapp.jid.UserJid) r9
            java.lang.String r10 = r5.A03
            X.00H r0 = r2.A51
            java.lang.Object r0 = r0.get()
            X.2gI r0 = (X.C55742gI) r0
            X.A8Q r3 = r0.A02
            r1 = 17
            r0 = 0
            r3.A08(r1, r0, r0)
            X.00H r0 = r2.A5Y
            java.lang.Object r0 = r0.get()
            X.4PK r0 = (X.AnonymousClass4PK) r0
            X.00H r0 = r0.A04
            r4 = 0
            java.lang.Object r0 = r0.get()
            X.9kg r0 = (X.C190289kg) r0
            r0.A00()
            X.11S r0 = r2.A1O
            boolean r11 = r0.A0O(r9)
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            r1 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            if (r0 != 0) goto L_0x08e4
            X.5cQ r0 = r2.A2Q
            X.1FY r3 = r0.getActivityNullable()
            X.5cQ r0 = r2.A2Q
            X.1FY r0 = r0.getActivityNullable()
            android.content.Intent r4 = X.AnonymousClass1LU.A1n(r0, r4, r1)
            X.1KB r5 = r2.A1L
            X.00H r0 = r2.A51
            java.lang.Object r0 = r0.get()
            X.2gI r0 = (X.C55742gI) r0
            X.00H r0 = r0.A05
            java.lang.Object r8 = r0.get()
            com.whatsapp.biz.catalog.manager.CatalogManager r8 = (com.whatsapp.biz.catalog.manager.CatalogManager) r8
            X.00H r0 = r2.A51
            java.lang.Object r0 = r0.get()
            X.2gI r0 = (X.C55742gI) r0
            X.00H r0 = r0.A04
            java.lang.Object r6 = r0.get()
            X.A7x r6 = (X.C20114A7x) r6
            X.00H r0 = r2.A51
            java.lang.Object r0 = r0.get()
            X.2gI r0 = (X.C55742gI) r0
            X.A8Q r7 = r0.A02
            X.C20057A5g.A00(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        L_0x08e4:
            X.11S r0 = r2.A1O
            r0.A0O(r9)
            r1 = 11
            X.5cQ r0 = r2.A2Q
            X.1FY r0 = r0.getActivityNullable()
            android.content.Intent r1 = X.AnonymousClass1LU.A0z(r0, r9, r3, r1)
            X.5cQ r0 = r2.A2Q
            r0.startActivity(r1)
            return
        L_0x08fb:
            java.lang.Object r7 = r5.A01
            X.9ea r7 = (X.C186679ea) r7
            java.lang.Object r6 = r5.A02
            X.205 r6 = (X.AnonymousClass205) r6
            java.lang.String r4 = r5.A03
            X.00H r3 = r7.A01
            java.lang.Object r0 = r3.get()
            X.9ls r0 = (X.C191009ls) r0
            X.00H r0 = r0.A00
            X.206 r2 = X.AnonymousClass1W2.A01(r6, r0)
            if (r2 != 0) goto L_0x091e
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "CatalogNFMStructuredMessageLoggingDelegate/logInteraction: unable to find FMessageInteractive with key="
            X.C17900vP.A0X(r6, r0, r1)
        L_0x091e:
            X.00H r0 = r7.A02
            java.lang.Object r8 = X.C18070vi.A0E(r0)
            X.9lB r8 = (X.C190579lB) r8
            r3.get()
            java.lang.Object r5 = r3.get()
            X.9ls r5 = (X.C191009ls) r5
            if (r2 == 0) goto L_0x0968
            r0 = 1
            boolean r0 = r2.A11(r0)
            if (r0 != 0) goto L_0x0968
            X.00H r0 = r5.A01
            java.lang.Object r5 = r0.get()
            X.2qT r5 = (X.C61902qT) r5
            long r0 = r2.A0x
            android.database.Cursor r7 = X.C61902qT.A00(r5, r0)
            java.lang.String r0 = "message_template_id"
            int r5 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0961 }
            java.lang.String r0 = "message_hsm_tag"
            int r1 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0961 }
            boolean r0 = r7.moveToLast()     // Catch:{ all -> 0x0961 }
            if (r0 == 0) goto L_0x096a
            r7.getString(r5)     // Catch:{ all -> 0x0961 }
            r7.getString(r1)     // Catch:{ all -> 0x0961 }
            r1 = 1
            goto L_0x096b
        L_0x0961:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0963 }
        L_0x0963:
            r1 = move-exception
            X.CDX.A00(r7, r0)
            throw r1
        L_0x0968:
            r7 = 0
            goto L_0x0976
        L_0x096a:
            r1 = 0
        L_0x096b:
            r7.close()
            r0 = 1
            if (r1 != 0) goto L_0x0972
            r0 = 0
        L_0x0972:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
        L_0x0976:
            org.json.JSONObject r5 = X.C17880vN.A15()
            java.lang.String r1 = "cta"
            java.lang.String r0 = "catalog_message"
            r5.put(r1, r0)
            java.lang.String r0 = r6.A01
            X.C18070vi.A0X(r0)
            java.lang.String r1 = X.AnonymousClass8BY.A0Y(r0)
            X.C18070vi.A0X(r1)
            java.lang.String r0 = "catalog_message_id"
            r5.put(r0, r1)
            if (r7 != 0) goto L_0x0996
            java.lang.Object r7 = org.json.JSONObject.NULL
        L_0x0996:
            java.lang.String r0 = "is_template"
            java.lang.String r11 = X.AnonymousClass8BV.A0r(r7, r0, r5)
            r0 = 1
            r9 = 0
            if (r2 == 0) goto L_0x09cf
            java.lang.Object r7 = r3.get()
            X.9ls r7 = (X.C191009ls) r7
            X.1BI r9 = r6.A00
            boolean r5 = r2.A11(r0)
            int r5 = r7.A00(r9, r4, r5)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r5)
            r3.get()
            boolean r0 = r2.A11(r0)
            if (r0 == 0) goto L_0x09c4
            X.1Dx r0 = com.whatsapp.jid.PhoneUserJid.Companion
            com.whatsapp.jid.PhoneUserJid r9 = X.C22951Dx.A01(r4)
        L_0x09c4:
            r12 = 0
            r14 = 4
            r15 = 22
            r13 = 0
            r16 = 1
            r8.A00(r9, r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x09cf:
            r10 = r9
            goto L_0x09c4
        L_0x09d1:
            java.lang.Object r0 = r5.A01
            X.8ns r0 = (X.C169968ns) r0
            java.lang.Object r4 = r5.A02
            android.content.Context r4 = (android.content.Context) r4
            java.lang.String r3 = r5.A03
            X.1L9 r2 = r0.A00
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "tel:"
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r3, r1)
            X.AnonymousClass8BV.A13(r4, r2, r0)
            return
        L_0x09eb:
            java.lang.Object r2 = r5.A01
            X.3uI r2 = (X.C79063uI) r2
            java.lang.Object r1 = r5.A02
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            java.lang.String r0 = r5.A03
            X.C79063uI.setEmojiView$lambda$8(r2, r1, r0)
            return
        L_0x09f9:
            java.lang.Object r0 = r5.A01
            X.1i1 r0 = (X.C32951i1) r0
            java.lang.Object r2 = r5.A02
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2
            java.lang.String r8 = r5.A03
            r0.A09()
            java.lang.String r9 = ""
            java.lang.String r4 = r2.getString(r8, r9)
            r10 = 1
            X.C18070vi.A0d(r4, r10)
            char[] r1 = new char[r10]
            r0 = 44
            r3 = 0
            r1[r3] = r0
            r7 = 0
            java.util.List r0 = X.AnonymousClass1YF.A0R(r4, r1)
            java.lang.String[] r1 = X.C108955ca.A1b(r0)
            java.lang.Long r0 = X.C63782tg.A05(r1, r3)
            r5 = 0
            if (r0 != 0) goto L_0x0a4e
            r3 = 0
        L_0x0a2a:
            java.lang.Long r0 = X.C63782tg.A05(r1, r10)
            if (r0 == 0) goto L_0x0a34
            long r5 = r0.longValue()
        L_0x0a34:
            r0 = 1
            long r3 = r3 + r0
            android.content.SharedPreferences$Editor r2 = r2.edit()
            r0 = 2
            java.lang.Long[] r1 = new java.lang.Long[r0]
            X.AnonymousClass3MX.A1S(r1, r7, r3)
            X.AnonymousClass3MX.A1S(r1, r10, r5)
            java.lang.String r0 = ","
            java.lang.String r0 = X.C200410p.A0I(r0, r9, r9, r1)
            X.C17880vN.A1E(r2, r8, r0)
            return
        L_0x0a4e:
            long r3 = r0.longValue()
            goto L_0x0a2a
        L_0x0a53:
            java.lang.Object r2 = r5.A01
            X.1oM r2 = (X.C36721oM) r2
            java.lang.String r1 = r5.A03
            java.lang.Object r0 = r5.A02
            X.1FL r0 = (X.AnonymousClass1FL) r0
            r2.A01(r0, r1)
            return
        L_0x0a61:
            java.lang.Object r3 = r5.A01
            com.whatsapp.companiondevice.LinkedDeviceEnterNicknameViewModel r3 = (com.whatsapp.companiondevice.LinkedDeviceEnterNicknameViewModel) r3
            java.lang.Object r6 = r5.A02
            com.whatsapp.jid.DeviceJid r6 = (com.whatsapp.jid.DeviceJid) r6
            java.lang.String r5 = r5.A03
            X.1RK r4 = r3.A00
            X.1MQ r0 = r4.A0H
            X.1MO r2 = r0.A04
            android.content.ContentValues r9 = X.C17880vN.A08()
            java.lang.String r0 = "nickname"
            r9.put(r0, r5)
            X.1MP r0 = r2.A02
            X.1au r7 = r0.A06()
            r0 = r7
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0ac2 }
            X.1Ev r8 = r0.A02     // Catch:{ all -> 0x0ac2 }
            java.lang.String r10 = "devices"
            java.lang.String r11 = "device_id = ?"
            java.lang.String[] r13 = X.C17880vN.A1Y()     // Catch:{ all -> 0x0ac2 }
            java.lang.String r1 = r6.getRawString()     // Catch:{ all -> 0x0ac2 }
            r0 = 0
            r13[r0] = r1     // Catch:{ all -> 0x0ac2 }
            java.lang.String r12 = "setDeviceNickname/UPDATE_DEVICES"
            r8.A02(r9, r10, r11, r12, r13)     // Catch:{ all -> 0x0ac2 }
            monitor-enter(r2)     // Catch:{ all -> 0x0ac2 }
            X.10w r0 = r2.A00     // Catch:{ all -> 0x0abf }
            if (r0 == 0) goto L_0x0aa8
            java.lang.Object r0 = r0.get(r6)     // Catch:{ all -> 0x0abf }
            X.4Zh r0 = (X.C88344Zh) r0     // Catch:{ all -> 0x0abf }
            if (r0 == 0) goto L_0x0aa8
            r0.A03 = r5     // Catch:{ all -> 0x0abf }
        L_0x0aa8:
            monitor-exit(r2)     // Catch:{ all -> 0x0abf }
            r7.close()
            X.4Zh r1 = X.AnonymousClass1RK.A00(r4, r6)
            if (r1 == 0) goto L_0x0ab7
            r0 = 37
            X.AnonymousClass35V.A00(r4, r1, r0)
        L_0x0ab7:
            X.1wy r0 = r3.A01
            X.1Wu r1 = X.C27621Wu.A00
        L_0x0abb:
            r0.A0E(r1)
            return
        L_0x0abf:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0abf }
            throw r0     // Catch:{ all -> 0x0ac2 }
        L_0x0ac2:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x0bb1 }
            throw r1
        L_0x0ac7:
            java.lang.Object r6 = r5.A01
            com.whatsapp.community.JoinGroupBottomSheetFragment r6 = (com.whatsapp.community.JoinGroupBottomSheetFragment) r6
            java.lang.Object r4 = r5.A02
            android.widget.TextView r4 = (android.widget.TextView) r4
            java.lang.String r3 = r5.A03
            com.whatsapp.TextEmojiLabel r0 = r6.A0K
            android.content.Context r2 = r0.getContext()
            android.text.TextPaint r1 = r4.getPaint()
            X.1KW r0 = r6.A0c
            java.lang.CharSequence r0 = X.C43251zV.A03(r2, r1, r0, r3)
            r4.setText(r0)
            return
        L_0x0ae5:
            java.lang.Object r4 = r5.A01
            com.whatsapp.catalogcategory.view.viewmodel.CatalogCategoryGroupsViewModel r4 = (com.whatsapp.catalogcategory.view.viewmodel.CatalogCategoryGroupsViewModel) r4
            java.lang.String r3 = r5.A03
            java.lang.Object r2 = r5.A02
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            X.9oc r1 = r4.A04
            X.B0c r0 = new X.B0c
            r0.<init>(r4, r2)
            r1.A00(r2, r3, r0)
            return
        L_0x0afa:
            java.lang.Object r6 = r5.A01
            X.A99 r6 = (X.A99) r6
            java.lang.String r7 = r5.A03
            java.lang.Object r2 = r5.A02
            java.util.List r2 = (java.util.List) r2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "voip/actionStartNewOutgoingCall async start for callId "
            X.C17900vP.A0f(r0, r7, r1)
            long r3 = android.os.SystemClock.elapsedRealtime()
            com.whatsapp.voipcalling.CallInfo r0 = X.AnonymousClass8BR.A0r(r6)
            boolean r0 = com.whatsapp.voipcalling.Voip.A09(r0, r7)
            if (r0 != 0) goto L_0x0b21
            java.lang.String r0 = "voip/actionStartNewOutgoingCall async operation canceled"
        L_0x0b1d:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0b21:
            X.181 r1 = r6.A24
            r0 = 1
            r1.A08(r0)
            java.util.Iterator r2 = r2.iterator()
        L_0x0b2b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0b43
            java.lang.Object r1 = r2.next()
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            X.00H r0 = r6.A3Q
            java.lang.Object r0 = r0.get()
            X.2nK r0 = (X.C60062nK) r0
            r0.A02(r1)
            goto L_0x0b2b
        L_0x0b43:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "voip/actionStartNewOutgoingCall async operation elapsed "
            r2.append(r0)
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r0 = r0 - r3
            r2.append(r0)
            java.lang.String r0 = " ms"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r2)
            goto L_0x0b1d
        L_0x0b5b:
            java.lang.Object r4 = r5.A01
            X.A99 r4 = (X.A99) r4
            java.lang.Object r3 = r5.A02
            X.1BI r3 = (X.AnonymousClass1BI) r3
            java.lang.String r5 = r5.A03
            X.1Uq r1 = r4.A2m
            X.1Cd r0 = r1.A03
            X.1au r8 = r0.A05()
            X.1LW r0 = r1.A01     // Catch:{ all -> 0x0bac }
            long r0 = r0.A09(r3)     // Catch:{ all -> 0x0bac }
            r2 = 1
            android.content.ContentValues r10 = new android.content.ContentValues     // Catch:{ all -> 0x0bac }
            r10.<init>(r2)     // Catch:{ all -> 0x0bac }
            java.lang.String r6 = "is_upcoming"
            r7 = 0
            X.AnonymousClass8BT.A13(r10, r6, r7)     // Catch:{ all -> 0x0bac }
            java.lang.String r12 = "key_chat_row_id = ? AND key_id = ?"
            r6 = r8
            X.1av r6 = (X.C28801av) r6     // Catch:{ all -> 0x0bac }
            X.1Ev r9 = r6.A02     // Catch:{ all -> 0x0bac }
            java.lang.String r11 = "scheduled_calls"
            java.lang.String[] r14 = X.C17880vN.A1Z()     // Catch:{ all -> 0x0bac }
            X.C17880vN.A1V(r14, r7, r0)     // Catch:{ all -> 0x0bac }
            r14[r2] = r5     // Catch:{ all -> 0x0bac }
            java.lang.String r13 = "ScheduledCallsStore/UPDATE_IS_UPCOMING_SCHEDULED_CALL_BY_KEY_ID_CHAT_JID"
            int r0 = r9.A02(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0bac }
            if (r0 != 0) goto L_0x0b9e
            java.lang.String r0 = "ScheduledCallsStore/updateScheduledCallIsUpcomingToFalse (by key ID and chat JID) failed to update"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0bac }
        L_0x0b9e:
            r8.close()
            X.1KB r1 = r4.A22
            X.AkY r0 = new X.AkY
            r0.<init>(r4, r3, r5, r2)
            r1.A0J(r0)
            return
        L_0x0bac:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x0bb1 }
            throw r1
        L_0x0bb1:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        L_0x0bb6:
            java.lang.Object r0 = r5.A01
            X.A99 r0 = (X.A99) r0
            java.lang.Object r4 = r5.A02
            java.lang.String r3 = r5.A03
            X.00H r0 = r0.A3S
            X.10T r2 = X.C17880vN.A0V(r0)
            r1 = 3
            X.35P r0 = new X.35P
            r0.<init>(r1, r3, r4)
            r2.notifyAllObservers(r0)
            return
        L_0x0bce:
            return
        L_0x0bcf:
            java.lang.String r0 = "p2p/WifiDirectScannerConnectionHandler/ interrupted while connecting to service"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0bd5:
            java.lang.Object r0 = r0.get()
            X.6xn r0 = (X.C138846xn) r0
            r0.A00(r3)
            return
        L_0x0bdf:
            r1 = move-exception
            monitor-exit(r7)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21467AkY.run():void");
    }

    public C21467AkY(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A03 = str;
        this.A02 = obj2;
    }

    public C21467AkY(AnonymousClass1DT r2, C24621La r3) {
        this.A00 = 28;
        this.A01 = r3;
        this.A03 = "status_distribution";
        this.A02 = r2;
    }

    public C21467AkY(AW1 aw1, Runnable runnable) {
        this.A00 = 43;
        this.A01 = aw1;
        this.A03 = "NewsletterBatchedMessagesManager/onOfflineResumeCompleted channel orphan my reaction processing";
        this.A02 = runnable;
    }
}
