package X;

import android.util.Pair;
import com.whatsapp.util.Log;

/* renamed from: X.37B  reason: invalid class name */
public class AnonymousClass37B implements AnonymousClass1O5 {
    public C129996ii A00;
    public AnonymousClass2RD A01;
    public AnonymousClass2BR A02;
    public boolean A03 = true;
    public boolean A04;
    public final C56772i0 A05;
    public final AnonymousClass11P A06;
    public final AnonymousClass1OZ A07;
    public final AnonymousClass190 A08;
    public final AnonymousClass1KB A09;

    public void BrD(String str) {
        Log.i("devicePairRequest/onDeliveryFailure");
        this.A09.CGP(new C98764rg((Object) this, 23));
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00b0  */
    public void C7Z(X.C29621ca r23, java.lang.String r24) {
        /*
            r22 = this;
            java.lang.String r0 = "devicePairRequest/onSuccess"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r7 = 0
            r2 = r22
            r5 = r23
            if (r23 == 0) goto L_0x00c2
            java.lang.String r0 = "type"
            java.lang.String r1 = r5.A0Q(r0, r7)
            java.lang.String r0 = "result"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00c2
            java.lang.String r0 = "device"
            X.1ca r3 = r5.A0K(r0)
            if (r3 == 0) goto L_0x00c2
            java.lang.Class<com.whatsapp.jid.DeviceJid> r1 = com.whatsapp.jid.DeviceJid.class
            java.lang.String r0 = "jid"
            com.whatsapp.jid.Jid r8 = r3.A0F(r1, r0)
            com.whatsapp.jid.DeviceJid r8 = (com.whatsapp.jid.DeviceJid) r8
            if (r8 == 0) goto L_0x00c2
            java.lang.String r0 = "companion-props"
            X.1ca r0 = r5.A0K(r0)
            if (r0 == 0) goto L_0x0053
            byte[] r1 = r0.A01     // Catch:{ 1PN -> 0x004e }
            X.2BN r0 = X.AnonymousClass2BN.DEFAULT_INSTANCE     // Catch:{ 1PN -> 0x004e }
            X.Bm6 r3 = X.C23577Bm6.A07(r0, r1)     // Catch:{ 1PN -> 0x004e }
            X.2BN r3 = (X.AnonymousClass2BN) r3     // Catch:{ 1PN -> 0x004e }
            if (r3 == 0) goto L_0x0054
            int r0 = r3.platformType_
            X.2RG r9 = X.AnonymousClass2RG.A00(r0)
            if (r9 != 0) goto L_0x0056
            X.2RG r9 = X.AnonymousClass2RG.UNKNOWN
            goto L_0x0056
        L_0x004e:
            java.lang.String r0 = "DevicePairRequestProtocolHelper/parseDeviceInfo/failed to parse companion props"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0053:
            r3 = r7
        L_0x0054:
            X.2RG r9 = X.AnonymousClass2RG.UNKNOWN
        L_0x0056:
            X.11P r0 = r2.A06
            long r15 = X.AnonymousClass11P.A01(r0)
            if (r3 == 0) goto L_0x00b0
            java.lang.String r10 = r3.os_
        L_0x0060:
            X.2BR r0 = r2.A02
            if (r0 == 0) goto L_0x00ae
            int r14 = r0.currentIndex_
        L_0x0066:
            if (r3 == 0) goto L_0x006e
            boolean r0 = r3.requireFullSync_
            r21 = 1
            if (r0 != 0) goto L_0x0070
        L_0x006e:
            r21 = 0
        L_0x0070:
            r0 = 24
            byte[] r1 = new byte[r0]
            java.security.SecureRandom r0 = new java.security.SecureRandom
            r0.<init>()
            r0.nextBytes(r1)
            r0 = 3
            java.lang.String r13 = android.util.Base64.encodeToString(r1, r0)
            X.C18070vi.A0X(r13)
            if (r3 == 0) goto L_0x0097
            int r0 = r3.bitField0_
            r0 = r0 & 16
            if (r0 == 0) goto L_0x0097
            X.2BW r0 = r3.historySyncConfig_
            if (r0 != 0) goto L_0x0092
            X.2BW r0 = X.AnonymousClass2BW.DEFAULT_INSTANCE
        L_0x0092:
            X.2qr r7 = new X.2qr
            r7.<init>(r0)
        L_0x0097:
            r19 = 0
            r11 = 0
            X.4Zh r6 = new X.4Zh
            r12 = r11
            r17 = r15
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r17, r19, r21)
            X.2i0 r0 = r2.A05
            com.whatsapp.jid.DeviceJid r5 = r6.A08
            X.2sp r0 = r0.A00
            X.1RK r4 = r0.A0C
            java.lang.Object r3 = r4.A0M
            monitor-enter(r3)
            goto L_0x00b2
        L_0x00ae:
            r14 = 0
            goto L_0x0066
        L_0x00b0:
            r10 = r7
            goto L_0x0060
        L_0x00b2:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x00bf }
            java.lang.String r0 = "companion-device-manager/onDeviceReceived: "
            X.C17900vP.A0Y(r5, r0, r1)     // Catch:{ all -> 0x00bf }
            r4.A01 = r5     // Catch:{ all -> 0x00bf }
            monitor-exit(r3)     // Catch:{ all -> 0x00bf }
            goto L_0x0108
        L_0x00bf:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00bf }
            throw r0
        L_0x00c2:
            r6 = r7
            X.6ii r0 = r2.A00
            if (r0 == 0) goto L_0x0108
            boolean r0 = r2.A04
            if (r0 != 0) goto L_0x0108
            r0 = -1
            if (r23 == 0) goto L_0x0108
            java.lang.String r3 = "type"
            java.lang.String r4 = r5.A0Q(r3, r7)
            java.lang.String r3 = "result"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0108
            java.lang.String r3 = "retry-ts"
            X.1ca r4 = r5.A0K(r3)
            if (r4 == 0) goto L_0x0108
            java.lang.String r3 = "ts"
            java.lang.String r4 = r4.A0Q(r3, r7)
            boolean r3 = android.text.TextUtils.isEmpty(r4)
            if (r3 != 0) goto L_0x0108
            long r3 = X.C20099A7c.A04(r4, r0)
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 == 0) goto L_0x0108
            X.1KB r5 = r2.A09
            r0 = 9
            X.7Ph r1 = new X.7Ph
            r1.<init>(r2, r3, r0)
        L_0x0104:
            r5.CGP(r1)
            return
        L_0x0108:
            X.1KB r5 = r2.A09
            r0 = 41
            X.4rk r1 = new X.4rk
            r1.<init>(r2, r6, r0)
            goto L_0x0104
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass37B.C7Z(X.1ca, java.lang.String):void");
    }

    public AnonymousClass37B(AnonymousClass190 r2, AnonymousClass1KB r3, C56772i0 r4, AnonymousClass11P r5, AnonymousClass1OZ r6) {
        this.A06 = r5;
        this.A09 = r3;
        this.A08 = r2;
        this.A07 = r6;
        this.A05 = r4;
    }

    public void Bt9(C29621ca r5, String str) {
        Pair A012 = C60482o6.A01(r5);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("devicePairRequest/onError with errorCode :");
        A10.append(A012.first);
        A10.append(" and reason : ");
        C17890vO.A1A(A10, (String) A012.second);
        this.A09.CGP(new C98804rk(this, A012, 40));
    }

    public /* synthetic */ C22384B5n CM9(String str) {
        return C20958AcC.A00;
    }
}
