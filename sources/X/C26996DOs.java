package X;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.view.Surface;
import com.facebook.wearable.mediastream.model.SUPToggleState;
import com.whatsapp.glasses.SupDelegateImpl$setDelayedCollapseJob$1;
import com.whatsapp.glasses.SupDelegateImpl$startErrorToConnectJob$1;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.CallState;
import java.util.concurrent.CancellationException;

/* renamed from: X.DOs  reason: case insensitive filesystem */
public final class C26996DOs implements C28597E9o {
    public Surface A00;
    public SUPToggleState A01 = C22961BXh.A00;
    public A99 A02;
    public C25530ChS A03 = new C25530ChS(new C27140DWb(this, 1));
    public C22821Di A04;
    public AnonymousClass1OB A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public int A0A;
    public EDE A0B;
    public AnonymousClass1OB A0C;
    public boolean A0D;
    public final C26226CvH A0E;
    public final C26197CuS A0F;
    public final AnonymousClass1HQ A0G;
    public final AnonymousClass118 A0H;
    public final C18030ve A0I;
    public final AnonymousClass1OX A0J = AnonymousClass1OW.A01();
    public final AnonymousClass1VE A0K;
    public final C219217x A0L;
    public final C24820CLn A0M;

    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, X.CXk] */
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
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x011d A[Catch:{ IllegalArgumentException -> 0x02ca }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x014a A[Catch:{ IllegalArgumentException -> 0x02ca }] */
    public C26996DOs(X.AnonymousClass1HQ r38, X.AnonymousClass1VE r39, X.AnonymousClass118 r40, X.C219217x r41, X.C18030ve r42, X.CYR r43, X.C25817CmU r44, X.C25838Cms r45) {
        /*
            r37 = this;
            r3 = 1
            r10 = r40
            X.C18070vi.A0d(r10, r3)
            r6 = r38
            r4 = r39
            r2 = r41
            X.C18070vi.A0p(r4, r2, r6)
            r1 = r42
            r11 = r45
            X.C72473Md.A1J(r1, r11)
            r0 = 7
            r13 = r43
            X.C18070vi.A0d(r13, r0)
            r0 = 8
            r12 = r44
            X.C18070vi.A0d(r12, r0)
            r5 = r37
            r5.<init>()
            r5.A0H = r10
            r5.A0K = r4
            r5.A0L = r2
            r5.A0G = r6
            r5.A0I = r1
            X.CLn r2 = new X.CLn
            r2.<init>(r1)
            r5.A0M = r2
            r15 = 0
            X.CvH r4 = new X.CvH
            r17 = r15
            r18 = r15
            r19 = r15
            r20 = r15
            r21 = r15
            r22 = r15
            r23 = r15
            r14 = r4
            r16 = r15
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r5.A0E = r4
            X.BXh r1 = X.C22961BXh.A00
            r5.A01 = r1
            r8 = 1
            X.DWb r6 = new X.DWb
            r6.<init>(r5, r3)
            X.ChS r1 = new X.ChS
            r1.<init>(r6)
            r5.A03 = r1
            X.1OY r1 = X.AnonymousClass1OW.A01()
            r5.A0J = r1
            r1 = 6
            X.DWX r14 = new X.DWX
            r14.<init>(r5, r1)
            r9 = 2
            X.DWb r7 = new X.DWb
            r7.<init>(r5, r9)
            r1 = 7
            X.DWX r6 = new X.DWX
            r6.<init>(r5, r1)
            X.DWX r1 = new X.DWX
            r1.<init>(r5, r0)
            X.CuS r0 = new X.CuS
            r0.<init>(r14, r6, r1, r7)
            r5.A0F = r0
            X.BYC r0 = new X.BYC
            r0.<init>()
            X.C24712CGy.A00 = r0
            r4.A0H = r11
            r4.A0F = r13
            r4.A0G = r12
            r4.A0F(r3)
            X.CLq r1 = new X.CLq
            r1.<init>(r12)
            X.CLp r0 = X.C24450C4p.A00
            if (r0 != 0) goto L_0x00a7
            X.CLp r0 = new X.CLp
            r0.<init>(r1)
            X.C24450C4p.A00 = r0
        L_0x00a7:
            android.content.Context r0 = r10.A00     // Catch:{ IllegalArgumentException -> 0x02ca }
            X.C18070vi.A0X(r0)     // Catch:{ IllegalArgumentException -> 0x02ca }
            r4.A05 = r0     // Catch:{ IllegalArgumentException -> 0x02ca }
            r1 = 4
            r4.A00 = r1     // Catch:{ IllegalArgumentException -> 0x02ca }
            X.C24709CGv.A00 = r1     // Catch:{ IllegalArgumentException -> 0x02ca }
            X.0ve r7 = r2.A00     // Catch:{ IllegalArgumentException -> 0x02ca }
            r0 = 8266(0x204a, float:1.1583E-41)
            java.lang.String r0 = r7.A0I(r0)     // Catch:{ IllegalArgumentException -> 0x02ca }
            X.C25459CgC.A02 = r0     // Catch:{ IllegalArgumentException -> 0x02ca }
            r0 = 8267(0x204b, float:1.1585E-41)
            java.lang.String r0 = r7.A0I(r0)     // Catch:{ IllegalArgumentException -> 0x02ca }
            X.C25459CgC.A03 = r0     // Catch:{ IllegalArgumentException -> 0x02ca }
            r0 = 8268(0x204c, float:1.1586E-41)
            X.0vf r6 = X.C18040vf.A02     // Catch:{ IllegalArgumentException -> 0x02ca }
            boolean r0 = X.C18020vd.A05(r6, r7, r0)     // Catch:{ IllegalArgumentException -> 0x02ca }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ IllegalArgumentException -> 0x02ca }
            X.C25459CgC.A01 = r0     // Catch:{ IllegalArgumentException -> 0x02ca }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ IllegalArgumentException -> 0x02ca }
            boolean r0 = X.C18070vi.A18(r0, r3)     // Catch:{ IllegalArgumentException -> 0x02ca }
            if (r0 == 0) goto L_0x00e0
            X.C25459CgC.A00(r8)     // Catch:{ IllegalArgumentException -> 0x02ca }
        L_0x00e0:
            java.lang.String r10 = X.C25459CgC.A02     // Catch:{ IllegalArgumentException -> 0x02ca }
            if (r10 == 0) goto L_0x0178
            int r0 = r10.length()     // Catch:{ IllegalArgumentException -> 0x02ca }
            if (r0 == 0) goto L_0x0178
            java.lang.String r0 = "0"
            boolean r0 = r10.equals(r0)     // Catch:{ IllegalArgumentException -> 0x02ca }
            if (r0 != 0) goto L_0x0178
        L_0x00f2:
            X.C25459CgC.A00 = r3     // Catch:{ IllegalArgumentException -> 0x02ca }
            java.lang.Boolean r0 = X.C25459CgC.A01     // Catch:{ IllegalArgumentException -> 0x02ca }
            if (r0 == 0) goto L_0x0176
            boolean r0 = r0.booleanValue()     // Catch:{ IllegalArgumentException -> 0x02ca }
        L_0x00fc:
            X.C25459CgC.A00(r0)     // Catch:{ IllegalArgumentException -> 0x02ca }
        L_0x00ff:
            X.BWu r11 = new X.BWu     // Catch:{ IllegalArgumentException -> 0x02ca }
            r11.<init>(r2, r9)     // Catch:{ IllegalArgumentException -> 0x02ca }
            r4.A08 = r11     // Catch:{ IllegalArgumentException -> 0x02ca }
            X.BTZ r0 = r11.A02()     // Catch:{ IllegalArgumentException -> 0x02ca }
            r4.A0B(r0)     // Catch:{ IllegalArgumentException -> 0x02ca }
            r4.A01 = r1     // Catch:{ IllegalArgumentException -> 0x02ca }
            r0 = 6899(0x1af3, float:9.668E-42)
            java.lang.String r1 = X.C108955ca.A0v(r7, r0)     // Catch:{ IllegalArgumentException -> 0x02ca }
            java.lang.String r0 = "TCP"
            boolean r0 = r1.equals(r0)     // Catch:{ IllegalArgumentException -> 0x02ca }
            if (r0 == 0) goto L_0x014a
            java.lang.Integer r2 = X.AnonymousClass00R.A00     // Catch:{ IllegalArgumentException -> 0x02ca }
        L_0x011f:
            r4.A0I = r2     // Catch:{ IllegalArgumentException -> 0x02ca }
            X.Cn1 r12 = X.C24712CGy.A01     // Catch:{ IllegalArgumentException -> 0x02ca }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IllegalArgumentException -> 0x02ca }
            java.lang.String r0 = "streamingProtocol set to "
            r1.append(r0)     // Catch:{ IllegalArgumentException -> 0x02ca }
            java.lang.String r0 = X.C24592CAn.A00(r2)     // Catch:{ IllegalArgumentException -> 0x02ca }
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ IllegalArgumentException -> 0x02ca }
            java.lang.String r0 = "sup:MediaStreamController"
            r12.A01(r0, r1)     // Catch:{ IllegalArgumentException -> 0x02ca }
            java.lang.Integer r0 = X.AnonymousClass00R.A0C     // Catch:{ IllegalArgumentException -> 0x02ca }
            if (r2 != r0) goto L_0x0144
            X.Cq6 r0 = r4.A0D     // Catch:{ IllegalArgumentException -> 0x02ca }
            if (r0 != 0) goto L_0x0144
            r4.A0E(r8)     // Catch:{ IllegalArgumentException -> 0x02ca }
        L_0x0144:
            X.CmZ r1 = X.C25822CmZ.A0B     // Catch:{ IllegalArgumentException -> 0x02ca }
            java.lang.Integer r0 = r4.A0I     // Catch:{ IllegalArgumentException -> 0x02ca }
            monitor-enter(r1)     // Catch:{ IllegalArgumentException -> 0x02ca }
            goto L_0x0196
        L_0x014a:
            java.lang.String r0 = "BLE"
            boolean r0 = r1.equals(r0)     // Catch:{ IllegalArgumentException -> 0x02ca }
            if (r0 == 0) goto L_0x0155
            java.lang.Integer r2 = X.AnonymousClass00R.A01     // Catch:{ IllegalArgumentException -> 0x02ca }
            goto L_0x011f
        L_0x0155:
            java.lang.String r0 = "BTC"
            boolean r0 = r1.equals(r0)     // Catch:{ IllegalArgumentException -> 0x02ca }
            if (r0 == 0) goto L_0x0160
            java.lang.Integer r2 = X.AnonymousClass00R.A0C     // Catch:{ IllegalArgumentException -> 0x02ca }
            goto L_0x011f
        L_0x0160:
            java.lang.String r0 = "LINK_SWITCH"
            boolean r0 = r1.equals(r0)     // Catch:{ IllegalArgumentException -> 0x02ca }
            if (r0 == 0) goto L_0x016b
            java.lang.Integer r2 = X.AnonymousClass00R.A0N     // Catch:{ IllegalArgumentException -> 0x02ca }
            goto L_0x011f
        L_0x016b:
            java.lang.String r0 = "MWA_BTC"
            boolean r0 = r1.equals(r0)     // Catch:{ IllegalArgumentException -> 0x02ca }
            if (r0 == 0) goto L_0x02c2
            java.lang.Integer r2 = X.AnonymousClass00R.A0Y     // Catch:{ IllegalArgumentException -> 0x02ca }
            goto L_0x011f
        L_0x0176:
            r0 = 0
            goto L_0x00fc
        L_0x0178:
            java.lang.String r10 = X.C25459CgC.A03     // Catch:{ IllegalArgumentException -> 0x02ca }
            if (r10 == 0) goto L_0x018c
            int r0 = r10.length()     // Catch:{ IllegalArgumentException -> 0x02ca }
            if (r0 == 0) goto L_0x018c
            java.lang.String r0 = "0"
            boolean r0 = r10.equals(r0)     // Catch:{ IllegalArgumentException -> 0x02ca }
            if (r0 != 0) goto L_0x018c
            goto L_0x00f2
        L_0x018c:
            java.lang.Boolean r0 = X.C25459CgC.A01     // Catch:{ IllegalArgumentException -> 0x02ca }
            boolean r0 = X.C18070vi.A18(r0, r3)     // Catch:{ IllegalArgumentException -> 0x02ca }
            if (r0 == 0) goto L_0x00ff
            goto L_0x00f2
        L_0x0196:
            X.C25822CmZ.A04 = r0     // Catch:{ all -> 0x02c7 }
            monitor-exit(r1)     // Catch:{ IllegalArgumentException -> 0x02ca }
            r0 = 6894(0x1aee, float:9.66E-42)
            int r0 = X.C18020vd.A00(r6, r7, r0)     // Catch:{ IllegalArgumentException -> 0x02ca }
            r4.A02 = r0     // Catch:{ IllegalArgumentException -> 0x02ca }
            r0 = 6895(0x1aef, float:9.662E-42)
            int r0 = X.C18020vd.A00(r6, r7, r0)     // Catch:{ IllegalArgumentException -> 0x02ca }
            r4.A04 = r0     // Catch:{ IllegalArgumentException -> 0x02ca }
            r4.A0S = r8     // Catch:{ IllegalArgumentException -> 0x02ca }
            r0 = 6898(0x1af2, float:9.666E-42)
            java.lang.String r1 = r7.A0I(r0)     // Catch:{ IllegalArgumentException -> 0x02ca }
            r0 = 0
            X.C18070vi.A0d(r1, r0)     // Catch:{ IllegalArgumentException -> 0x02ca }
            r0 = 6891(0x1aeb, float:9.656E-42)
            float r0 = r7.A0E(r0)     // Catch:{ IllegalArgumentException -> 0x02ca }
            double r0 = (double) r0     // Catch:{ IllegalArgumentException -> 0x02ca }
            X.C24458C4y.A01 = r0     // Catch:{ IllegalArgumentException -> 0x02ca }
            r0 = 6890(0x1aea, float:9.655E-42)
            float r0 = r7.A0E(r0)     // Catch:{ IllegalArgumentException -> 0x02ca }
            double r0 = (double) r0     // Catch:{ IllegalArgumentException -> 0x02ca }
            X.C24458C4y.A00 = r0     // Catch:{ IllegalArgumentException -> 0x02ca }
            r0 = 6889(0x1ae9, float:9.654E-42)
            int r0 = X.C18020vd.A00(r6, r7, r0)     // Catch:{ IllegalArgumentException -> 0x02ca }
            X.C24458C4y.A02 = r0     // Catch:{ IllegalArgumentException -> 0x02ca }
            r0 = 6892(0x1aec, float:9.658E-42)
            int r0 = X.C18020vd.A00(r6, r7, r0)     // Catch:{ IllegalArgumentException -> 0x02ca }
            X.C24458C4y.A03 = r0     // Catch:{ IllegalArgumentException -> 0x02ca }
            r0 = 6893(0x1aed, float:9.659E-42)
            int r0 = X.C18020vd.A00(r6, r7, r0)     // Catch:{ IllegalArgumentException -> 0x02ca }
            X.C24457C4x.A00 = r0     // Catch:{ IllegalArgumentException -> 0x02ca }
            r0 = 6896(0x1af0, float:9.663E-42)
            int r0 = X.C18020vd.A00(r6, r7, r0)     // Catch:{ IllegalArgumentException -> 0x02ca }
            X.C24457C4x.A01 = r0     // Catch:{ IllegalArgumentException -> 0x02ca }
            X.C24457C4x.A02 = r8     // Catch:{ IllegalArgumentException -> 0x02ca }
            r0 = 6904(0x1af8, float:9.675E-42)
            boolean r0 = X.C18020vd.A05(r6, r7, r0)     // Catch:{ IllegalArgumentException -> 0x02ca }
            if (r0 == 0) goto L_0x0294
            r0 = 6906(0x1afa, float:9.677E-42)
            int r0 = X.C18020vd.A00(r6, r7, r0)     // Catch:{ IllegalArgumentException -> 0x02ca }
            long r2 = (long) r0     // Catch:{ IllegalArgumentException -> 0x02ca }
            r0 = 6905(0x1af9, float:9.676E-42)
            int r0 = X.C18020vd.A00(r6, r7, r0)     // Catch:{ IllegalArgumentException -> 0x02ca }
            long r0 = (long) r0     // Catch:{ IllegalArgumentException -> 0x02ca }
            X.Cii r10 = new X.Cii     // Catch:{ IllegalArgumentException -> 0x02ca }
            r10.<init>(r2, r0)     // Catch:{ IllegalArgumentException -> 0x02ca }
            r4.A0A = r10     // Catch:{ IllegalArgumentException -> 0x02ca }
            X.BTZ r17 = r11.A02()     // Catch:{ IllegalArgumentException -> 0x02ca }
            r0 = 6908(0x1afc, float:9.68E-42)
            int r0 = X.C18020vd.A00(r6, r7, r0)     // Catch:{ IllegalArgumentException -> 0x02ca }
            long r0 = (long) r0     // Catch:{ IllegalArgumentException -> 0x02ca }
            r35 = r0
            r0 = 6918(0x1b06, float:9.694E-42)
            float r0 = r7.A0E(r0)     // Catch:{ IllegalArgumentException -> 0x02ca }
            double r15 = (double) r0     // Catch:{ IllegalArgumentException -> 0x02ca }
            r0 = 6914(0x1b02, float:9.689E-42)
            int r28 = X.C18020vd.A00(r6, r7, r0)     // Catch:{ IllegalArgumentException -> 0x02ca }
            r0 = 6917(0x1b05, float:9.693E-42)
            int r29 = X.C18020vd.A00(r6, r7, r0)     // Catch:{ IllegalArgumentException -> 0x02ca }
            r0 = 6913(0x1b01, float:9.687E-42)
            int r30 = X.C18020vd.A00(r6, r7, r0)     // Catch:{ IllegalArgumentException -> 0x02ca }
            r0 = 6910(0x1afe, float:9.683E-42)
            java.lang.String r19 = X.C108955ca.A0v(r7, r0)     // Catch:{ IllegalArgumentException -> 0x02ca }
            r0 = 6909(0x1afd, float:9.682E-42)
            java.lang.String r20 = X.C108955ca.A0v(r7, r0)     // Catch:{ IllegalArgumentException -> 0x02ca }
            r0 = 6915(0x1b03, float:9.69E-42)
            int r31 = X.C18020vd.A00(r6, r7, r0)     // Catch:{ IllegalArgumentException -> 0x02ca }
            r0 = 6916(0x1b04, float:9.691E-42)
            float r0 = r7.A0E(r0)     // Catch:{ IllegalArgumentException -> 0x02ca }
            double r13 = (double) r0     // Catch:{ IllegalArgumentException -> 0x02ca }
            r0 = 6911(0x1aff, float:9.684E-42)
            int r32 = X.C18020vd.A00(r6, r7, r0)     // Catch:{ IllegalArgumentException -> 0x02ca }
            r0 = 6912(0x1b00, float:9.686E-42)
            float r0 = r7.A0E(r0)     // Catch:{ IllegalArgumentException -> 0x02ca }
            double r1 = (double) r0     // Catch:{ IllegalArgumentException -> 0x02ca }
            X.Drz r21 = X.C28141Drz.A00     // Catch:{ IllegalArgumentException -> 0x02ca }
            X.Cj5 r0 = new X.Cj5     // Catch:{ IllegalArgumentException -> 0x02ca }
            r22 = r15
            r24 = r13
            r26 = r1
            r33 = r35
            r16 = r0
            r18 = r10
            r16.<init>(r17, r18, r19, r20, r21, r22, r24, r26, r28, r29, r30, r31, r32, r33)     // Catch:{ IllegalArgumentException -> 0x02ca }
            r4.A09 = r0     // Catch:{ IllegalArgumentException -> 0x02ca }
            X.Cq6 r1 = r4.A0D     // Catch:{ IllegalArgumentException -> 0x02ca }
            if (r1 == 0) goto L_0x0294
            X.0vl r0 = r0.A0K     // Catch:{ IllegalArgumentException -> 0x02ca }
            java.lang.Object r0 = r0.getValue()     // Catch:{ IllegalArgumentException -> 0x02ca }
            X.CcE r0 = (X.C25269CcE) r0     // Catch:{ IllegalArgumentException -> 0x02ca }
            X.0vl r0 = r0.A00     // Catch:{ IllegalArgumentException -> 0x02ca }
            java.util.List r0 = X.AnonymousClass3MW.A11(r0)     // Catch:{ IllegalArgumentException -> 0x02ca }
            java.lang.Object r0 = X.C29431cG.A0d(r0)     // Catch:{ IllegalArgumentException -> 0x02ca }
            X.BTa r0 = (X.C22866BTa) r0     // Catch:{ IllegalArgumentException -> 0x02ca }
            X.1Oc r0 = r0.A06     // Catch:{ IllegalArgumentException -> 0x02ca }
            int r2 = r0.A00     // Catch:{ IllegalArgumentException -> 0x02ca }
            r1.A01 = r2     // Catch:{ IllegalArgumentException -> 0x02ca }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IllegalArgumentException -> 0x02ca }
            java.lang.String r0 = "minBitrate is "
            java.lang.String r1 = X.AnonymousClass001.A1I(r0, r1, r2)     // Catch:{ IllegalArgumentException -> 0x02ca }
            java.lang.String r0 = "sup:BtcThroughputHealth"
            r12.A01(r0, r1)     // Catch:{ IllegalArgumentException -> 0x02ca }
        L_0x0294:
            A03(r5, r8)     // Catch:{ IllegalArgumentException -> 0x02ca }
            X.CvH r1 = r5.A0E     // Catch:{ IllegalArgumentException -> 0x02ca }
            X.CuS r0 = r5.A0F     // Catch:{ IllegalArgumentException -> 0x02ca }
            X.CLC r0 = r0.A01     // Catch:{ IllegalArgumentException -> 0x02ca }
            r1.A0E = r0     // Catch:{ IllegalArgumentException -> 0x02ca }
            X.BXe r1 = new X.BXe     // Catch:{ IllegalArgumentException -> 0x02ca }
            r1.<init>(r5, r8)     // Catch:{ IllegalArgumentException -> 0x02ca }
            java.lang.String r0 = "sup:SUPDelegate_TOGGLED_CALLBACK"
            A01(r1, r5, r0)     // Catch:{ IllegalArgumentException -> 0x02ca }
            r5.A00()     // Catch:{ IllegalArgumentException -> 0x02ca }
            r0 = 0
            X.BXe r1 = new X.BXe     // Catch:{ IllegalArgumentException -> 0x02ca }
            r1.<init>(r5, r0)     // Catch:{ IllegalArgumentException -> 0x02ca }
            java.lang.String r0 = "sup:SUPDelegate_ON_DISCOVERED_CALLBACK"
            A01(r1, r5, r0)     // Catch:{ IllegalArgumentException -> 0x02ca }
            X.BXe r1 = new X.BXe     // Catch:{ IllegalArgumentException -> 0x02ca }
            r1.<init>(r5, r9)     // Catch:{ IllegalArgumentException -> 0x02ca }
            java.lang.String r0 = "sup:SUPDelegate_CONNECT_ON_DISCOVER"
            A01(r1, r5, r0)     // Catch:{ IllegalArgumentException -> 0x02ca }
            return
        L_0x02c2:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r1)     // Catch:{ IllegalArgumentException -> 0x02ca }
            goto L_0x02c9
        L_0x02c7:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ IllegalArgumentException -> 0x02ca }
        L_0x02c9:
            throw r0     // Catch:{ IllegalArgumentException -> 0x02ca }
        L_0x02ca:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "sup:SUPDelegate Error when initializing media stream controller "
            X.C17900vP.A0X(r2, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26996DOs.<init>(X.1HQ, X.1VE, X.118, X.17x, X.0ve, X.CYR, X.CmU, X.Cms):void");
    }

    public void CNW() {
        A0B(false);
        A03(this, 0);
        C26226CvH cvH = this.A0E;
        C25845Cn1 cn1 = C24712CGy.A01;
        cn1.A01("sup:MediaStreamController", "msc:release");
        if (!cvH.A0N) {
            cn1.A01("sup:MediaStreamController", "msc, not initialized, returning");
        } else {
            if (cvH.A0L) {
                cvH.A08();
                cvH.A07();
            }
            if (cvH.A0G == null || cvH.A05 != null) {
                cvH.A05().A03();
                cvH.A0X.set(false);
                cvH.A0N = false;
                cvH.A0M = false;
                cvH.A0W.set(false);
                C17890vO.A0D().postDelayed(new C27080DTf((Object) cvH, 6), 500);
            } else {
                C18070vi.A11("context");
                throw null;
            }
        }
        SUPToggleState.hingeOpen = true;
        this.A01 = C22961BXh.A00;
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [X.CNm, java.lang.Object] */
    private final void A00() {
        C26226CvH cvH = this.A0E;
        if (cvH.A0N) {
            C24712CGy.A01.A02("sup:SUPDelegate", "Already initialized, returning");
            return;
        }
        C25845Cn1 cn1 = C24712CGy.A01;
        cn1.A01("sup:MediaStreamController", "msc:init");
        if (cvH.A0N) {
            cn1.A01("sup:MediaStreamController", "msc: Already initialized");
            return;
        }
        Looper A0L2 = BEA.A0L("MediaStreamController", 0);
        C18070vi.A0X(A0L2);
        cvH.A06 = A0L2;
        cvH.A0C = new C26051CrL(cvH.A07, cvH.A0S);
        Looper looper = cvH.A06;
        if (looper == null) {
            C18070vi.A11("looper");
            throw null;
        }
        C27446DfX dfX = new C27446DfX(new CLA(cvH), 8);
        C27446DfX dfX2 = new C27446DfX(cvH.A0V, 9);
        C27447DfY dfY = new C27447DfY(cvH, 1);
        C27446DfX dfX3 = new C27446DfX(cvH, 10);
        ? obj = new Object();
        C25838Cms cms = cvH.A0H;
        CYR cyr = cvH.A0F;
        BTO bto = new BTO(cvH.A0I, cvH.A02, cvH.A01, cvH.A00);
        Context context = cvH.A05;
        if (context != null) {
            cvH.A0B = new C25010CTk(context, looper, bto, obj, cyr, cms, dfX, dfX2, dfX3, dfY);
            if (cvH.A0G == null || cvH.A05 != null) {
                C25625Cj5 cj5 = cvH.A09;
                if (cj5 != null) {
                    cj5.A06 = new C27976DpC(cvH);
                }
                C25603Cii cii = cvH.A0A;
                if (cii != null) {
                    cii.A03 = new C27553DhK(cvH);
                }
                C25822CmZ cmZ = C25822CmZ.A0B;
                Context context2 = cvH.A05;
                if (context2 != null) {
                    C25630CjG.A00.A00(context2);
                    synchronized (cmZ) {
                    }
                    cvH.A0N = true;
                    if (cvH.A0W.compareAndSet(true, false)) {
                        cvH.A06();
                        return;
                    }
                    return;
                }
            }
        }
        C18070vi.A11("context");
        throw null;
    }

    public static final void A01(C24491C6j c6j, C26996DOs dOs, String str) {
        C26226CvH cvH = dOs.A0E;
        cvH.A0K.put(str, c6j);
        if (cvH.A0X.get()) {
            c6j.A01();
        }
    }

    public static final void A02(C26996DOs dOs) {
        C134216qE r1;
        Log.i("sup:SUPDelegate onGlassesError");
        boolean z = false;
        if (dOs.Be0()) {
            CallInfo BO3 = dOs.A0G.BO3();
            if (BO3 != null && (r1 = BO3.self) != null) {
                if (dOs.A02 != null) {
                    z = true;
                }
                C17960vV.A0F(z, "VoipGlassesListener is null");
                if (AnonymousClass000.A1T(r1.A08, 6)) {
                    return;
                }
            } else {
                return;
            }
        } else if (dOs.A08) {
            dOs.A08 = false;
        } else {
            return;
        }
        A99 a99 = dOs.A02;
        if (a99 != null) {
            a99.A1E.execute(new C146427Pb(a99, 43));
        }
    }

    public static final void A03(C26996DOs dOs, int i) {
        C25817CmU cmU;
        int i2 = dOs.A0A;
        if (i2 != i) {
            dOs.A0A = i;
            C26226CvH cvH = dOs.A0E;
            if (i2 == 1 && (cmU = cvH.A0G) != null) {
                cmU.A00();
            }
            C25845Cn1 cn1 = C24712CGy.A01;
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Product type changed from ");
            A10.append(i2);
            cn1.A01("sup:MediaStreamController", AnonymousClass001.A1I(" to ", A10, i));
        }
    }

    public static void A05(C26996DOs dOs, boolean z) {
        C22821Di r1 = dOs.A04;
        if (r1 != null) {
            r1.invoke(Boolean.valueOf(z));
        }
    }

    public static final void A06(C26996DOs dOs, boolean z) {
        AnonymousClass1OB r0 = dOs.A0C;
        if (r0 != null) {
            r0.BEM((CancellationException) null);
        }
        dOs.A0C = AnonymousClass3MY.A0s(new SupDelegateImpl$startErrorToConnectJob$1(dOs, (C30391dr) null, z), dOs.A0J);
    }

    public static final boolean A07(C26996DOs dOs) {
        SUPToggleState sUPToggleState = dOs.A01;
        if (sUPToggleState instanceof C22959BXf) {
            C22959BXf bXf = (C22959BXf) sUPToggleState;
            if (bXf.A01 || bXf.A00.A00.A01 != AnonymousClass00R.A0C || A08(dOs)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static final boolean A08(C26996DOs dOs) {
        SUPToggleState sUPToggleState = dOs.A01;
        if (!(sUPToggleState instanceof C22959BXf)) {
            return false;
        }
        C24867CNl cNl = ((C22959BXf) sUPToggleState).A00.A00;
        if (C18070vi.A18(cNl, C22974BXu.A00) || C18070vi.A18(cNl, C22976BXw.A00) || C18070vi.A18(cNl, C22975BXv.A00)) {
            return true;
        }
        return false;
    }

    public static final boolean A09(CallInfo callInfo) {
        String str;
        CallState callState = callInfo.callState;
        C18070vi.A0X(callState);
        if (!AnonymousClass72U.A01(callState) || callInfo.callEnding) {
            str = "sup:SUPDelegate Video State is not possible because call is not active.";
        } else {
            C134216qE defaultPeerInfo = callInfo.getDefaultPeerInfo();
            if (defaultPeerInfo == null || defaultPeerInfo.A0B) {
                return true;
            }
            str = "sup:SUPDelegate Video state is not possible because audio video switch is not enabled for the peer.";
        }
        Log.i(str);
        return false;
    }

    public void A0A() {
        C22962BXi bXi;
        AnonymousClass1VE r5 = this.A0K;
        if (AnonymousClass1VE.A00(r5).getBoolean("smart_glasses_nux_tool_tip", false)) {
            bXi = new C22962BXi(false);
        } else {
            C24712CGy.A01.A01("sup:SUPDelegate", "Showing NUX tooltip");
            C17880vN.A1F(AnonymousClass1VE.A00(r5).edit(), "smart_glasses_nux_tool_tip", true);
            bXi = new C22962BXi(true);
        }
        this.A01 = bXi;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x005e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0B(boolean r6) {
        /*
            r5 = this;
            boolean r0 = r5.A0D
            if (r0 == r6) goto L_0x0077
            r5.A0D = r6
            X.CvH r4 = r5.A0E
            X.Cn1 r2 = X.C24712CGy.A01
            java.lang.String r1 = "sup:MediaStreamController"
            if (r6 == 0) goto L_0x0020
            java.lang.String r0 = "User has entered live format"
            r2.A01(r1, r0)
            r3 = 1
            r4.A0O = r3
            X.CmU r0 = r4.A0G
            if (r0 == 0) goto L_0x006b
            X.CmR r1 = r0.A02
            monitor-enter(r1)
            r1.A08 = r3     // Catch:{ all -> 0x0045 }
            goto L_0x006a
        L_0x0020:
            java.lang.String r0 = "User has exited live format"
            r2.A01(r1, r0)
            r3 = 0
            r4.A0O = r3
            X.CmU r0 = r4.A0G
            if (r0 == 0) goto L_0x0032
            X.CmR r1 = r0.A02
            monitor-enter(r1)
            r1.A08 = r3     // Catch:{ all -> 0x0045 }
            monitor-exit(r1)
        L_0x0032:
            int r1 = r4.A00
            r0 = 1
            if (r1 == r0) goto L_0x0049
            r0 = 2
            if (r1 == r0) goto L_0x0049
            r0 = 4
            if (r1 != r0) goto L_0x005a
            X.CmZ r1 = X.C25822CmZ.A0B
            java.lang.String r0 = "0"
            monitor-enter(r1)
            X.C25822CmZ.A0A = r0     // Catch:{ all -> 0x0045 }
            goto L_0x0048
        L_0x0045:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0048:
            monitor-exit(r1)
        L_0x0049:
            X.CmU r2 = r4.A0G
            if (r2 == 0) goto L_0x005a
            boolean r0 = r2.A0E
            if (r0 == 0) goto L_0x0054
            r2.A00()
        L_0x0054:
            r0 = -1
            r2.A00 = r0
            r2.A0E = r3
        L_0x005a:
            boolean r0 = r4.A0N
            if (r0 == 0) goto L_0x0066
            java.lang.Integer r0 = X.AnonymousClass00R.A0u
            r4.A0D(r0)
            r4.A07()
        L_0x0066:
            r4.A08()
            return
        L_0x006a:
            monitor-exit(r1)
        L_0x006b:
            X.CmU r2 = r4.A0G
            if (r2 == 0) goto L_0x0077
            long r0 = java.lang.System.currentTimeMillis()
            r2.A00 = r0
            r2.A0E = r3
        L_0x0077:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26996DOs.A0B(boolean):void");
    }

    public final void A0C(boolean z) {
        boolean z2;
        SUPToggleState sUPToggleState = this.A01;
        boolean z3 = sUPToggleState instanceof C22962BXi;
        if (z3 && ((z2 = ((C22962BXi) sUPToggleState).A00) || !AnonymousClass1VE.A00(this.A0K).getBoolean("smart_glasses_user_initiated", false))) {
            C25845Cn1 cn1 = C24712CGy.A01;
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Don't autoconnect user - seeing NUX tooltip: ");
            A10.append(z2);
            A10.append(" or has not initiated ");
            cn1.A01("sup:SUPDelegate", AnonymousClass3MY.A0r(A10, AnonymousClass1VE.A00(this.A0K).getBoolean("smart_glasses_user_initiated", false)));
        } else if (C40811vJ.A0N(this.A0L)) {
            if (z || z3) {
                boolean A1Z = AnonymousClass000.A1Z(this.A0E.A0I, AnonymousClass00R.A00);
                this.A01 = new C22963BXj(new C22873BTh(new BY9(100), false, false, false, A1Z), A1Z);
                this.A0F.A04();
                CPZ(z);
            }
            A00();
            this.A0E.A06();
        }
    }

    public boolean Be0() {
        SUPToggleState sUPToggleState = this.A01;
        if (!(sUPToggleState instanceof C22959BXf) || !((C22959BXf) sUPToggleState).A01) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Byg() {
        /*
            r6 = this;
            X.Cn1 r2 = X.C24712CGy.A01
            java.lang.String r1 = "sup:SUPDelegate"
            java.lang.String r0 = "Fire on mobile button clicked"
            r2.A01(r1, r0)
            r4 = 0
            r6.CPZ(r4)
            boolean r0 = r6.Be0()
            if (r0 == 0) goto L_0x0070
            X.CvH r0 = r6.A0E
            r0.A08()
            X.ChS r1 = r6.A03
            X.E8l r0 = r1.A00
            if (r0 == 0) goto L_0x0023
            X.DDo r0 = (X.C26782DDo) r0
            r0.BIY()
        L_0x0023:
            X.C25530ChS.A00(r1)
            com.facebook.wearable.mediastream.model.SUPToggleState r0 = r6.A01
            com.facebook.wearable.mediastream.model.SUPToggleState r0 = r0.toConnected(r4)
            r6.A01 = r0
            java.lang.String r0 = "sup:SUPDelegate onGlassesUnselecting"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1HQ r0 = r6.A0G
            com.whatsapp.voipcalling.CallInfo r5 = r0.BO3()
            if (r5 == 0) goto L_0x0078
            X.6qE r3 = r5.self
            r2 = 1
            if (r3 == 0) goto L_0x0071
            int r1 = r3.A08
            r0 = 6
            boolean r0 = X.AnonymousClass000.A1T(r1, r0)
            if (r0 == r2) goto L_0x004d
            int r0 = r3.A08
            if (r0 != 0) goto L_0x0071
        L_0x004d:
            X.A99 r1 = r6.A02
            if (r1 == 0) goto L_0x005d
            java.util.concurrent.ScheduledThreadPoolExecutor r3 = r1.A1E
            r0 = 43
            X.7Pb r2 = new X.7Pb
            r2.<init>(r1, r0)
        L_0x005a:
            r3.execute(r2)
        L_0x005d:
            X.CuS r1 = r6.A0F
            X.BY8 r0 = X.BY8.A00
            r1.A06(r0)
            A05(r6, r4)
            boolean r0 = A07(r6)
            if (r0 == 0) goto L_0x0070
            A06(r6, r4)
        L_0x0070:
            return
        L_0x0071:
            boolean r0 = r5.isCallOnHold()
            if (r0 != r2) goto L_0x0078
            goto L_0x004d
        L_0x0078:
            X.A99 r1 = r6.A02
            if (r1 == 0) goto L_0x0086
            java.util.concurrent.ScheduledThreadPoolExecutor r3 = r1.A1E
            r0 = 19
            X.7RK r2 = new X.7RK
            r2.<init>((int) r0, (java.lang.Object) r1, (boolean) r4)
            goto L_0x005a
        L_0x0086:
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26996DOs.Byg():void");
    }

    public void CPZ(boolean z) {
        AnonymousClass1OB r1 = this.A05;
        Boolean A0i = AnonymousClass000.A0i();
        if (r1 != null) {
            r1.BEM((CancellationException) null);
        }
        if (z) {
            SUPToggleState updatedStatusIndicatorAttributes = this.A01.getUpdatedStatusIndicatorAttributes(A0i, (C24867CNl) null, (Boolean) null, (Boolean) null, (Boolean) null);
            if (updatedStatusIndicatorAttributes != null) {
                this.A01 = updatedStatusIndicatorAttributes;
                C22821Di r0 = this.A04;
                if (r0 != null) {
                    r0.invoke(A0i);
                }
                this.A05 = AnonymousClass3MY.A0s(new SupDelegateImpl$setDelayedCollapseJob$1(this, (C30391dr) null), this.A0J);
                return;
            }
            return;
        }
        SUPToggleState sUPToggleState = this.A01;
        Boolean A0h = AnonymousClass000.A0h();
        SUPToggleState updatedStatusIndicatorAttributes2 = sUPToggleState.getUpdatedStatusIndicatorAttributes(A0h, (C24867CNl) null, (Boolean) null, (Boolean) null, (Boolean) null);
        if (updatedStatusIndicatorAttributes2 != null) {
            this.A01 = updatedStatusIndicatorAttributes2;
            C22821Di r02 = this.A04;
            if (r02 != null) {
                r02.invoke(A0h);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        if (r5.isCallOnHold() != false) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void CQY(com.whatsapp.voipcalling.CallInfo r5) {
        /*
            r4 = this;
            com.whatsapp.voipcalling.CallState r1 = r5.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            r3 = 1
            if (r1 == r0) goto L_0x0012
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r1 == r0) goto L_0x0012
            boolean r1 = r5.isCallOnHold()
            r0 = 0
            if (r1 == 0) goto L_0x0013
        L_0x0012:
            r0 = 1
        L_0x0013:
            r4.A0B(r0)
            X.6qE r2 = r5.self
            if (r2 == 0) goto L_0x0034
            int r1 = r2.A08
            r0 = 6
            boolean r0 = X.AnonymousClass000.A1T(r1, r0)
            if (r0 == r3) goto L_0x0027
            int r0 = r2.A08
            if (r0 != 0) goto L_0x0034
        L_0x0027:
            boolean r0 = r4.Be0()
            if (r0 == 0) goto L_0x0030
            r4.Byg()
        L_0x0030:
            A04(r4, r5)
            return
        L_0x0034:
            boolean r0 = r5.isCallOnHold()
            if (r0 == 0) goto L_0x0030
            goto L_0x0027
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26996DOs.CQY(com.whatsapp.voipcalling.CallInfo):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
        if (r1 != com.whatsapp.voipcalling.CallState.ACTIVE) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0029, code lost:
        if (r3.A07 != false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0038, code lost:
        if (r2 == false) goto L_0x003a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A04(X.C26996DOs r3, com.whatsapp.voipcalling.CallInfo r4) {
        /*
            boolean r0 = r4.isCallLinkLobbyOrJoiningState()
            if (r0 != 0) goto L_0x0041
            boolean r0 = r4.isCallOnHold()
            if (r0 != 0) goto L_0x0041
            com.whatsapp.voipcalling.CallState r1 = r4.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.RECEIVED_CALL
            if (r1 == r0) goto L_0x0041
            X.6qE r0 = r4.self
            r2 = 1
            if (r0 == 0) goto L_0x0023
            int r0 = r0.A08
            if (r0 != 0) goto L_0x0023
            boolean r0 = r4.isGroupCall
            if (r0 != 0) goto L_0x0041
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r1 != r0) goto L_0x0041
        L_0x0023:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.PRE_ACCEPT_RECEIVED
            if (r1 != r0) goto L_0x002b
            boolean r0 = r3.A07
            if (r0 != 0) goto L_0x0041
        L_0x002b:
            boolean r0 = r3.A06
            if (r0 == r2) goto L_0x0040
            r3.A06 = r2
            X.CvH r1 = r3.A0E
            boolean r0 = r3.A09
            if (r0 != 0) goto L_0x003a
            r0 = 1
            if (r2 != 0) goto L_0x003b
        L_0x003a:
            r0 = 0
        L_0x003b:
            r0 = r0 ^ 1
            r1.A0F(r0)
        L_0x0040:
            return
        L_0x0041:
            r2 = 0
            goto L_0x002b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26996DOs.A04(X.DOs, com.whatsapp.voipcalling.CallInfo):void");
    }

    public void BnY(EDC edc, EDE ede) {
        boolean A15 = C18070vi.A15(ede, edc);
        ((C22807BPv) edc).A07.A01((Long) null, A15);
        if (!C18070vi.A18(this.A0B, ede)) {
            this.A0B = ede;
            E8l e8l = this.A03.A00;
            if (e8l != null) {
                int i = A15;
                if (Build.VERSION.SDK_INT >= 34) {
                    i = 9;
                }
                BTZ btz = this.A0E.A07;
                ede.CJB(e8l, btz.A05, btz.A03, i);
            }
        }
    }
}
