package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import java.util.HashMap;

/* renamed from: X.1il  reason: invalid class name and case insensitive filesystem */
public class C33401il extends C31911gK {
    public final AnonymousClass11S A00;
    public final C33251iW A01;
    public final AnonymousClass11P A02;
    public final AnonymousClass118 A03;
    public final C18000vb A04;
    public final AnonymousClass121 A05;
    public final C24751Ln A06;
    public final AnonymousClass1KI A07;
    public final C18030ve A08;
    public final AnonymousClass1QG A09;
    public final C33391ik A0A;
    public final AnonymousClass1QD A0B;
    public final C31061ex A0C;
    public final AnonymousClass1QO A0D;
    public final AnonymousClass1QS A0E;
    public final C33341if A0F;
    public final C33381ij A0G;
    public final C31041ev A0H;
    public final AnonymousClass1QE A0I = AnonymousClass1QE.A00("PaymentsMessageHandler", "infra", "COMMON");
    public final C33351ig A0J;
    public final AnonymousClass00H A0K;
    public final AnonymousClass12E A0L;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C33401il(X.AnonymousClass190 r11, X.AnonymousClass11S r12, X.C33251iW r13, X.AnonymousClass12E r14, X.AnonymousClass11P r15, X.AnonymousClass118 r16, X.C18000vb r17, X.AnonymousClass121 r18, X.C24751Ln r19, X.AnonymousClass1KI r20, X.C18030ve r21, X.AnonymousClass1QG r22, X.AnonymousClass1OZ r23, X.AnonymousClass1N7 r24, X.C33391ik r25, X.AnonymousClass1QD r26, X.C31061ex r27, X.AnonymousClass1QO r28, X.AnonymousClass1QS r29, X.C33341if r30, X.C33381ij r31, X.C31041ev r32, X.C33351ig r33, X.AnonymousClass10I r34, X.AnonymousClass00H r35) {
        /*
            r10 = this;
            r0 = 1
            int[] r8 = new int[r0]
            r1 = 0
            r0 = 247(0xf7, float:3.46E-43)
            r8[r1] = r0
            r9 = 1
            r3 = r10
            r5 = r23
            r7 = r34
            r4 = r11
            r6 = r24
            r3.<init>(r4, r5, r6, r7, r8, r9)
            java.lang.String r2 = "infra"
            java.lang.String r1 = "COMMON"
            java.lang.String r0 = "PaymentsMessageHandler"
            X.1QE r0 = X.AnonymousClass1QE.A00(r0, r2, r1)
            r10.A0I = r0
            r10.A02 = r15
            r0 = r21
            r10.A08 = r0
            r10.A00 = r12
            r0 = r16
            r10.A03 = r0
            r0 = r22
            r10.A09 = r0
            r0 = r17
            r10.A04 = r0
            r0 = r29
            r10.A0E = r0
            r0 = r19
            r10.A06 = r0
            r0 = r18
            r10.A05 = r0
            r10.A0L = r14
            r0 = r26
            r10.A0B = r0
            r10.A01 = r13
            r0 = r27
            r10.A0C = r0
            r0 = r28
            r10.A0D = r0
            r0 = r20
            r10.A07 = r0
            r0 = r30
            r10.A0F = r0
            r0 = r33
            r10.A0J = r0
            r0 = r32
            r10.A0H = r0
            r0 = r35
            r10.A0K = r0
            r0 = r31
            r10.A0G = r0
            r0 = r25
            r10.A0A = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33401il.<init>(X.190, X.11S, X.1iW, X.12E, X.11P, X.118, X.0vb, X.121, X.1Ln, X.1KI, X.0ve, X.1QG, X.1OZ, X.1N7, X.1ik, X.1QD, X.1ex, X.1QO, X.1QS, X.1if, X.1ij, X.1ev, X.1ig, X.10I, X.00H):void");
    }

    private void A01(UserJid userJid, C29621ca r11, int i) {
        C29621ca A0K2 = r11.A0K("eligible_offers");
        if (A0K2 != null) {
            C29621ca A0K3 = A0K2.A0K("offer");
            String A0Q = A0K2.A0Q("dhash", (String) null);
            if (A0K3 != null) {
                String A0Q2 = A0K3.A0Q(PublicKeyCredentialControllerUtility.JSON_KEY_ID, (String) null);
                UserJid userJid2 = userJid;
                if (userJid != null && this.A0D.A0D()) {
                    this.A0I.A06("onPaymentConsumerOfferEligibilityUpdate");
                    HashMap hashMap = new HashMap();
                    hashMap.put(Integer.valueOf(i), new C19760yx(A0Q2, A0Q));
                    AnonymousClass1QS r0 = this.A0E;
                    AnonymousClass1QS.A00(r0);
                    C62862s7.A02(this.A06, r0.A05, userJid2, (Boolean) null, (String) null, (HashMap) null, hashMap);
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r10v8, types: [X.20i, X.2ME, X.206] */
    /* JADX WARNING: type inference failed for: r9v12, types: [java.lang.Object, X.87L] */
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:210)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    public void A05(X.C29621ca r59, int r60) {
        /*
            r58 = this;
            r57 = r59
            r0 = r57
            X.1ca[] r0 = r0.A02
            r16 = r0
            if (r0 == 0) goto L_0x0ae1
            int r0 = r0.length
            r18 = r0
            if (r0 <= 0) goto L_0x0ae1
            r7 = 0
            r17 = 0
        L_0x0012:
            r0 = r16[r17]
            java.lang.String r5 = "type"
            java.lang.String r8 = ""
            java.lang.String r3 = r0.A0Q(r5, r8)
            java.lang.String r4 = r0.A00
            java.lang.String r1 = "pay"
            boolean r2 = r4.equals(r1)
            r6 = 1
            r1 = r58
            if (r2 == 0) goto L_0x0068
            java.lang.String r10 = "hash"
            r9 = 0
            java.lang.String r2 = r0.A0Q(r10, r9)
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0068
            java.lang.String r0 = r0.A0Q(r10, r9)
            byte[] r0 = r0.getBytes()
            byte[] r3 = android.util.Base64.decode(r0, r7)
            java.util.Arrays.toString(r3)
            X.2R1 r0 = X.AnonymousClass2R1.A0L
            X.2sh r2 = new X.2sh
            r2.<init>(r0, r9)
            r2.A03 = r6
            X.2qq r0 = X.C62132qq.A0M
            r2.A00 = r0
            r2.A03(r3)
            X.2re r2 = r2.A02()
            X.12E r0 = r1.A0L
            X.AnonymousClass12E.A00(r0, r2, r6)
        L_0x005f:
            int r17 = r17 + 1
            r1 = r17
            r0 = r18
            if (r1 >= r0) goto L_0x0ae1
            goto L_0x0012
        L_0x0068:
            java.lang.String r2 = "upi"
            boolean r2 = r4.equals(r2)
            java.lang.String r9 = "from"
            if (r2 == 0) goto L_0x00cd
            java.lang.Class<com.whatsapp.jid.Jid> r3 = com.whatsapp.jid.Jid.class
            r2 = r57
            com.whatsapp.jid.Jid r3 = r2.A0F(r3, r9)
            X.1Dw r2 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.jid.UserJid r10 = X.C22941Dw.A01(r3)
            r4 = 3
            java.lang.String r2 = "consumer_status"
            X.1ca r5 = r0.A0K(r2)
            if (r5 == 0) goto L_0x00c9
            java.lang.String r2 = "value"
            r3 = 0
            java.lang.String r6 = r5.A0Q(r2, r3)
            java.lang.String r2 = "dhash"
            java.lang.String r5 = r5.A0Q(r2, r3)
            if (r10 == 0) goto L_0x00c9
            X.1QO r2 = r1.A0D
            boolean r2 = r2.A0D()
            if (r2 == 0) goto L_0x00c9
            X.1QE r3 = r1.A0I
            java.lang.String r2 = "onPaymentConsumerStatusUpdate"
            r3.A06(r2)
            java.util.HashMap r13 = new java.util.HashMap
            r13.<init>()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            X.0yx r2 = new X.0yx
            r2.<init>(r6, r5)
            r13.put(r3, r2)
            X.1QS r2 = r1.A0E
            X.AnonymousClass1QS.A00(r2)
            X.1KH r9 = r2.A05
            X.1Ln r8 = r1.A06
            r11 = 0
            r14 = r11
            r12 = r11
            X.C62862s7.A02(r8, r9, r10, r11, r12, r13, r14)
        L_0x00c9:
            r1.A01(r10, r0, r4)
            goto L_0x005f
        L_0x00cd:
            java.lang.String r2 = "fbpay"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x00e8
            java.lang.Class<com.whatsapp.jid.Jid> r3 = com.whatsapp.jid.Jid.class
            r2 = r57
            com.whatsapp.jid.Jid r3 = r2.A0F(r3, r9)
            X.1Dw r2 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.jid.UserJid r2 = X.C22941Dw.A01(r3)
            r1.A01(r2, r0, r6)
            goto L_0x005f
        L_0x00e8:
            java.lang.String r2 = "document_verification_status"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x0146
            X.1QO r2 = r1.A0D
            boolean r2 = r2.A03()
            if (r2 == 0) goto L_0x005f
            java.lang.String r2 = "request_code"
            X.1ca r3 = r0.A0K(r2)
            if (r3 == 0) goto L_0x005f
            java.lang.String r2 = "value"
            r0 = 0
            java.lang.String r2 = r3.A0Q(r2, r0)
            java.lang.String r0 = "review_complete_allow"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0139
            X.1if r5 = r1.A0F
            r4 = 37
        L_0x0114:
            X.1ie r3 = r5.A05
            X.10I r2 = r3.A02
            r1 = 27
            X.7RM r0 = new X.7RM
            r0.<init>((java.lang.Object) r3, (int) r4, (int) r1)
            r2.CGF(r0)
            X.1KB r3 = r5.A01
            X.00H r0 = r5.A0C
        L_0x0126:
            java.lang.Object r2 = r0.get()
            r2.getClass()
            r1 = 40
            X.Ajs r0 = new X.Ajs
            r0.<init>((java.lang.Object) r2, (int) r1)
            r3.A0J(r0)
            goto L_0x005f
        L_0x0139:
            java.lang.String r0 = "review_complete_block"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x005f
            X.1if r5 = r1.A0F
            r4 = 38
            goto L_0x0114
        L_0x0146:
            java.lang.String r2 = "alias"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x01e3
            java.lang.String r6 = "alias_status"
            r9 = 0
            java.lang.String r2 = r0.A0Q(r6, r9)
            if (r2 == 0) goto L_0x01e3
            java.lang.String r9 = r0.A0Q(r6, r9)
            java.lang.String r2 = "deregistered"
            boolean r2 = r9.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x01e3
            X.1if r4 = r1.A0F
            X.1QO r1 = r4.A09
            X.0ve r3 = r1.A02
            r2 = 1458(0x5b2, float:2.043E-42)
            X.0vf r1 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r1, r3, r2)
            if (r1 == 0) goto L_0x005f
            X.1ex r5 = r4.A08
            java.lang.String r10 = "upiAlias"
            X.7Ik r9 = new X.7Ik     // Catch:{ 1UI -> 0x01b8 }
            r9.<init>()     // Catch:{ 1UI -> 0x01b8 }
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            java.lang.String r2 = "alias_value"
            r1 = 0
            java.lang.String r1 = r0.A0Q(r2, r1)     // Catch:{ 1UI -> 0x01b8 }
            X.77e r8 = new X.77e     // Catch:{ 1UI -> 0x01b8 }
            r8.<init>(r9, r3, r1, r10)     // Catch:{ 1UI -> 0x01b8 }
            java.lang.String r1 = "alias_type"
            java.lang.String r3 = r0.A0P(r1)     // Catch:{ 1UI -> 0x01b8 }
            java.lang.String r1 = "alias_id"
            java.lang.String r2 = r0.A0P(r1)     // Catch:{ 1UI -> 0x01b8 }
            java.lang.String r0 = r0.A0P(r6)     // Catch:{ 1UI -> 0x01b8 }
            X.AEC r1 = new X.AEC     // Catch:{ 1UI -> 0x01b8 }
            r1.<init>(r8, r3, r2, r0)     // Catch:{ 1UI -> 0x01b8 }
            X.1QJ r0 = r5.A09     // Catch:{ 1UI -> 0x01b8 }
            X.2tK r0 = r0.A02()     // Catch:{ 1UI -> 0x01b8 }
            if (r0 == 0) goto L_0x01cf
            X.1KJ r0 = r0.A02     // Catch:{ 1UI -> 0x01b8 }
            X.BD1 r0 = X.C31061ex.A00(r0, r5)     // Catch:{ 1UI -> 0x01b8 }
            X.A2y r0 = r0.BWS()     // Catch:{ 1UI -> 0x01b8 }
            if (r0 == 0) goto L_0x01cf
            r0.A03(r1)     // Catch:{ 1UI -> 0x01b8 }
            goto L_0x01cf
        L_0x01b8:
            r3 = move-exception
            X.1QE r2 = r5.A0D
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "removeAlias corrupt stream exception: "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            r2.A05(r0)
        L_0x01cf:
            X.1ie r3 = r4.A05
            X.10I r2 = r3.A02
            r1 = 30
            X.Ajs r0 = new X.Ajs
            r0.<init>((java.lang.Object) r3, (int) r1)
            r2.CGF(r0)
            X.1KB r3 = r4.A01
            X.00H r0 = r4.A0C
            goto L_0x0126
        L_0x01e3:
            java.lang.String r2 = "account-recovery"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x0250
            java.lang.String r5 = "UPI"
            java.lang.String r4 = "service"
            java.lang.String r2 = r0.A0P(r4)
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0221
            X.00H r2 = r1.A0K
            java.lang.Object r2 = r2.get()
            X.9sf r2 = (X.C195019sf) r2
            X.00H r2 = r2.A03
            java.lang.Object r2 = r2.get()
            X.2u4 r2 = (X.C64012u4) r2
            X.2mj r2 = X.C64012u4.A01(r2)
            java.lang.String r2 = r2.A01
            if (r2 == 0) goto L_0x02e4
            int r2 = r2.length()
            if (r2 == 0) goto L_0x02e4
            X.1QE r1 = r1.A0I
            java.lang.String r0 = "handleAccountRecoveryNotificationUpi/ignoring due to user already onboarded to payments on another account"
        L_0x021c:
            r1.A06(r0)
            goto L_0x005f
        L_0x0221:
            java.lang.String r3 = "BR"
            java.lang.String r2 = r0.A0P(r4)
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x005f
            X.00H r2 = r1.A0K
            java.lang.Object r2 = r2.get()
            X.9sf r2 = (X.C195019sf) r2
            X.00H r2 = r2.A03
            java.lang.Object r2 = r2.get()
            X.2u4 r2 = (X.C64012u4) r2
            X.2mj r2 = X.C64012u4.A01(r2)
            java.lang.String r2 = r2.A01
            if (r2 == 0) goto L_0x0337
            int r2 = r2.length()
            if (r2 == 0) goto L_0x0337
            X.1QE r1 = r1.A0I
            java.lang.String r0 = "handleAccountRecoveryNotificationBr/ignoring due to user already onboarded to payments on another account"
            goto L_0x021c
        L_0x0250:
            java.lang.String r2 = "alert"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x037f
            java.lang.String r2 = "id"
            java.lang.String r22 = r0.A0P(r2)
            java.lang.String r2 = "title"
            java.lang.String r23 = r0.A0P(r2)
            java.lang.String r2 = "description"
            java.lang.String r24 = r0.A0P(r2)
            java.lang.String r2 = "button_text"
            java.lang.String r25 = r0.A0P(r2)
            java.lang.String r2 = "scope"
            java.lang.String r26 = r0.A0P(r2)
            java.lang.String r4 = r0.A0P(r5)
            int r5 = r4.hashCode()
            r2 = 71338169(0x44088b9, float:2.2632272E-36)
            r3 = 1
            if (r5 == r2) goto L_0x02db
            r2 = 696544730(0x29846dda, float:5.881034E-14)
            if (r5 == r2) goto L_0x0299
            r2 = 1842428796(0x6dd13b7c, float:8.094285E27)
            if (r5 != r2) goto L_0x0299
            java.lang.String r2 = "WARNING"
            boolean r2 = r4.equals(r2)
            r27 = 2
        L_0x0297:
            if (r2 != 0) goto L_0x029b
        L_0x0299:
            r27 = 1
        L_0x029b:
            java.lang.String r2 = "dismissible"
            int r2 = r0.A0A(r2, r3)
            r28 = 0
            if (r2 != r3) goto L_0x02a7
            r28 = 1
        L_0x02a7:
            java.lang.String r2 = "phoenix"
            X.1ca r2 = r0.A0K(r2)
            if (r2 == 0) goto L_0x02d9
            java.lang.String r0 = "config"
            java.lang.String r2 = r2.A0P(r0)
            X.2rI r0 = new X.2rI
            r0.<init>(r2)
        L_0x02ba:
            r21 = 0
            X.3Bj r3 = new X.3Bj
            r19 = r3
            r20 = r0
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28)
            X.1QG r0 = r1.A09
            r0.A05(r3)
            X.1if r2 = r1.A0F
            java.lang.String r1 = r3.A06
            X.1ie r0 = r2.A05
            r0.A03(r1)
            X.1KB r3 = r2.A01
            X.00H r0 = r2.A0C
            goto L_0x0126
        L_0x02d9:
            r0 = 0
            goto L_0x02ba
        L_0x02db:
            java.lang.String r2 = "ADVISORY"
            boolean r2 = r4.equals(r2)
            r27 = 3
            goto L_0x0297
        L_0x02e4:
            X.1QO r3 = r1.A0D
            boolean r2 = r3.A03()
            if (r2 == 0) goto L_0x005f
            X.0ve r4 = r3.A02
            r3 = 1644(0x66c, float:2.304E-42)
            X.0vf r2 = X.C18040vf.A02
            boolean r2 = X.C18020vd.A05(r2, r4, r3)
            if (r2 == 0) goto L_0x005f
            java.lang.String r3 = "recovered"
            r2 = 0
            java.lang.String r2 = r0.A0Q(r3, r2)
            X.1QS r0 = r1.A0E
            X.C17960vV.A07(r0)
            X.AZ9 r5 = r0.A05(r5)
            X.C17960vV.A07(r5)
            r1.A06(r5)
            java.lang.String r0 = "1"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x005f
            X.1if r4 = r1.A0F
            X.C17960vV.A07(r5)
            X.3M8 r3 = r5.BPV()
            X.C17960vV.A07(r3)
            r2 = 1
            r0 = 0
            r3.CQQ(r0, r2)
            r4.A00 = r7
            X.1ex r2 = r4.A08
            r1 = 1
            X.AXO r0 = new X.AXO
            r0.<init>(r4, r3, r1)
            r2.A0B(r0, r5)
            goto L_0x005f
        L_0x0337:
            X.1QO r3 = r1.A0D
            boolean r2 = r3.A03()
            if (r2 == 0) goto L_0x005f
            X.0ve r4 = r3.A02
            r3 = 2000(0x7d0, float:2.803E-42)
            X.0vf r2 = X.C18040vf.A02
            boolean r2 = X.C18020vd.A05(r2, r4, r3)
            if (r2 == 0) goto L_0x005f
            java.lang.String r2 = "recovered"
            r4 = 0
            java.lang.String r3 = r0.A0Q(r2, r4)
            java.lang.String r2 = "1"
            boolean r5 = r2.equals(r3)
            java.lang.String r2 = "suspended-ts"
            java.lang.String r0 = r0.A0Q(r2, r4)
            r2 = 0
            long r2 = X.C20099A7c.A04(r0, r2)
            X.1QS r4 = r1.A0E
            java.lang.String r0 = "FBPAY"
            X.AZ9 r0 = r4.A05(r0)
            X.C17960vV.A07(r0)
            r1.A06(r0)
            X.3M8 r0 = r0.BPV()
            X.C17960vV.A07(r0)
            r0.CQQ(r2, r5)
            goto L_0x005f
        L_0x037f:
            java.lang.String r2 = "threeDS"
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L_0x03ee
            java.lang.String r2 = "pnd"
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L_0x03ee
            java.lang.String r2 = "balance"
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L_0x03ee
            java.lang.String r2 = "kyc"
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L_0x03ee
            java.lang.String r2 = "account-status"
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L_0x03ee
            java.lang.String r2 = "account-info"
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L_0x03ee
            java.lang.String r2 = "card-update"
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L_0x03ee
            java.lang.String r2 = "merchant-update"
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L_0x03ee
            java.lang.String r2 = "update-method"
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L_0x03ee
            java.lang.String r2 = "remove-method"
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L_0x03ee
            java.lang.String r2 = "account"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x04fb
            java.lang.String r6 = "event"
            r5 = 0
            java.lang.String r2 = r0.A0Q(r6, r5)
            if (r2 == 0) goto L_0x0457
            java.lang.String r5 = r0.A0Q(r6, r5)
            java.lang.String r2 = "DELETION"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0457
        L_0x03ee:
            X.1QO r2 = r1.A0D
            boolean r2 = r2.A04(r7)
            if (r2 == 0) goto L_0x005f
            X.1if r4 = r1.A0F
            X.1QE r2 = r4.A0B
            java.lang.String r1 = "PaymentsMessageHandler: onPaymentMethodUpdate"
            r2.A06(r1)
            X.1QS r3 = r4.A0A
            X.BD1 r1 = r3.A06()
            X.B8c r2 = r1.BWK()
            if (r2 == 0) goto L_0x005f
            X.1KI r1 = r4.A03
            java.util.ArrayList r2 = r2.CB8(r1, r0)
            int r1 = r2.size()
            if (r1 <= 0) goto L_0x005f
            java.lang.Object r1 = r2.get(r7)
            X.8pb r1 = (X.C170278pb) r1
            X.AEs r5 = r1.A08()
            if (r5 == 0) goto L_0x0449
            X.AnonymousClass1QS.A00(r3)
            X.A5I r2 = r3.A00
            X.C17960vV.A07(r2)
            java.lang.String r1 = r5.A0A
            X.Af0 r3 = r2.A02(r1)
            r2 = 1
            X.Ael r1 = new X.Ael
            r1.<init>(r5, r0, r4, r2)
            r3.A09(r1)
            r1 = 11
            X.Af1 r2 = new X.Af1
            r2.<init>(r0, r4, r1)
            X.1TJ r1 = r3.A00
            r0 = 0
            r1.A03(r2, r0)
            goto L_0x005f
        L_0x0449:
            X.1KB r3 = r4.A01
            r2 = 31
            X.3Bz r1 = new X.3Bz
            r1.<init>(r4, r0, r2)
            r3.A0J(r1)
            goto L_0x005f
        L_0x0457:
            java.lang.String r5 = "kyc-state"
            r2 = 0
            java.lang.String r2 = r0.A0Q(r5, r2)
            if (r2 == 0) goto L_0x04fb
            X.1QO r2 = r1.A0D
            boolean r2 = r2.A03()
            if (r2 == 0) goto L_0x005f
            X.2uv r3 = X.AnonymousClass2TR.A00(r0)
            if (r3 == 0) goto L_0x005f
            X.1QD r4 = r1.A0B
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            java.lang.String r2 = "state"
            java.lang.String r0 = r3.A02     // Catch:{ JSONException -> 0x04be }
            r5.put(r2, r0)     // Catch:{ JSONException -> 0x04be }
            java.lang.String r2 = "rejection-code"
            java.lang.Integer r0 = r3.A01     // Catch:{ JSONException -> 0x04be }
            r5.put(r2, r0)     // Catch:{ JSONException -> 0x04be }
            X.2uy r9 = r3.A00     // Catch:{ JSONException -> 0x04be }
            if (r9 == 0) goto L_0x04c3
            java.lang.String r6 = "actions-requested"
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x04be }
            r3.<init>()     // Catch:{ JSONException -> 0x04be }
            org.json.JSONArray r8 = new org.json.JSONArray     // Catch:{ JSONException -> 0x04be }
            r8.<init>()     // Catch:{ JSONException -> 0x04be }
            java.lang.String r2 = "obligation"
            java.lang.String r0 = r9.A00     // Catch:{ JSONException -> 0x04b5 }
            r3.put(r2, r0)     // Catch:{ JSONException -> 0x04b5 }
            java.util.List r0 = r9.A01     // Catch:{ JSONException -> 0x04b5 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ JSONException -> 0x04b5 }
        L_0x04a1:
            boolean r0 = r2.hasNext()     // Catch:{ JSONException -> 0x04b5 }
            if (r0 == 0) goto L_0x04af
            java.lang.Object r0 = r2.next()     // Catch:{ JSONException -> 0x04b5 }
            r8.put(r0)     // Catch:{ JSONException -> 0x04b5 }
            goto L_0x04a1
        L_0x04af:
            java.lang.String r0 = "actions"
            r3.put(r0, r8)     // Catch:{ JSONException -> 0x04b5 }
            goto L_0x04ba
        L_0x04b5:
            java.lang.String r0 = "PAY: PaymentKycActionsRequested toJson threw exception"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ JSONException -> 0x04be }
        L_0x04ba:
            r5.put(r6, r3)     // Catch:{ JSONException -> 0x04be }
            goto L_0x04c3
        L_0x04be:
            java.lang.String r0 = "PAY: PaymentKycInfo toJson threw exception"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x04c3:
            java.lang.String r3 = r5.toString()
            android.content.SharedPreferences r0 = r4.A03()
            android.content.SharedPreferences$Editor r2 = r0.edit()
            java.lang.String r0 = "payment_kyc_info"
            android.content.SharedPreferences$Editor r0 = r2.putString(r0, r3)
            r0.apply()
            android.content.SharedPreferences r0 = r4.A03()
            android.content.SharedPreferences$Editor r2 = r0.edit()
            java.lang.String r0 = "payment_kyc_update_ack"
            android.content.SharedPreferences$Editor r0 = r2.putBoolean(r0, r7)
            r0.apply()
            X.1if r0 = r1.A0F
            X.1ie r3 = r0.A05
            X.10I r2 = r3.A02
            r1 = 31
            X.Ajs r0 = new X.Ajs
            r0.<init>((java.lang.Object) r3, (int) r1)
            r2.CGF(r0)
            goto L_0x005f
        L_0x04fb:
            java.lang.String r2 = "merchant_status"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x0544
            java.lang.String r2 = "value"
            r13 = 0
            java.lang.String r3 = r0.A0Q(r2, r13)
            java.lang.String r2 = "true"
            boolean r3 = r2.equals(r3)
            java.lang.String r2 = "dhash"
            java.lang.String r12 = r0.A0Q(r2, r13)
            com.whatsapp.jid.Jid r2 = r1.A01
            X.1Dw r0 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.jid.UserJid r10 = X.C22941Dw.A01(r2)
            if (r10 == 0) goto L_0x005f
            X.1QO r0 = r1.A0D
            boolean r0 = r0.A0D()
            if (r0 == 0) goto L_0x005f
            X.1QE r2 = r1.A0I
            java.lang.String r0 = "onPaymentMerchantStatusUpdate"
            r2.A06(r0)
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r3)
            X.1QS r0 = r1.A0E
            X.AnonymousClass1QS.A00(r0)
            X.1KH r9 = r0.A05
            X.1Ln r8 = r1.A06
            r14 = r13
            X.C62862s7.A02(r8, r9, r10, r11, r12, r13, r14)
            goto L_0x005f
        L_0x0544:
            java.lang.String r2 = "invite"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x0637
            X.1QO r2 = r1.A0D
            boolean r2 = r2.A03()
            if (r2 == 0) goto L_0x005f
            java.lang.String r2 = "service"
            r4 = 0
            java.lang.String r3 = r0.A0Q(r2, r4)
            if (r3 == 0) goto L_0x056b
            java.util.Locale r2 = java.util.Locale.US
            java.lang.String r3 = r3.toUpperCase(r2)
            int r2 = r3.hashCode()
            switch(r2) {
                case 84238: goto L_0x0605;
                case 2402356: goto L_0x0610;
                case 66691660: goto L_0x061b;
                default: goto L_0x056b;
            }
        L_0x056b:
            r9 = 0
        L_0x056c:
            java.lang.String r2 = "invite-used"
            java.lang.String r2 = r0.A0Q(r2, r4)
            java.lang.String r0 = "1"
            boolean r5 = r0.equals(r2)
            com.whatsapp.jid.Jid r2 = r1.A01
            X.1Dw r0 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.jid.UserJid r6 = X.C22941Dw.A01(r2)
            X.0ve r3 = r1.A08
            r0 = 423(0x1a7, float:5.93E-43)
            X.0vf r2 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r2, r3, r0)
            if (r0 != 0) goto L_0x0594
            r0 = 544(0x220, float:7.62E-43)
            boolean r0 = X.C18020vd.A05(r2, r3, r0)
            if (r0 == 0) goto L_0x005f
        L_0x0594:
            X.1QD r2 = r1.A0B
            android.content.SharedPreferences r0 = r2.A03()
            java.lang.String r4 = "payments_invitee_jids_with_expiry"
            java.lang.String r0 = r0.getString(r4, r8)
            java.util.HashMap r0 = X.AnonymousClass1QD.A02(r2, r0)
            java.util.Set r0 = r0.keySet()
            boolean r0 = r0.contains(r6)
            if (r0 == 0) goto L_0x005f
            X.1ij r10 = r1.A0G
            X.11P r0 = r1.A02
            long r2 = X.AnonymousClass11P.A01(r0)
            X.1PP r0 = r10.A00
            X.205 r11 = r0.A01(r6, r7)
            r0 = 64
            X.98J r10 = new X.98J
            r10.<init>(r11, r0, r2)
            r10.A00 = r9
            r10.A01 = r5
            r10.A0d(r6)
            X.121 r2 = r1.A05
            r0 = 16
            r2.BBZ(r10, r0)
            X.1ik r3 = r1.A0A
            X.1QD r1 = r3.A03
            android.content.SharedPreferences r0 = r1.A03()
            java.lang.String r0 = r0.getString(r4, r8)
            java.util.HashMap r2 = X.AnonymousClass1QD.A02(r1, r0)
            r2.remove(r6)
            android.content.SharedPreferences r0 = r1.A03()
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = X.AnonymousClass1QD.A01(r2)
            android.content.SharedPreferences$Editor r0 = r1.putString(r4, r0)
            r0.apply()
            X.1ex r0 = r3.A04
            X.1ev r0 = r0.A0C
            X.1es r4 = r0.A02
            java.lang.String r3 = r6.getRawString()
            monitor-enter(r4)
            if (r5 == 0) goto L_0x0634
            goto L_0x0626
        L_0x0605:
            java.lang.String r2 = "UPI"
            boolean r2 = r3.equals(r2)
            r9 = 3
            if (r2 != 0) goto L_0x056c
            goto L_0x056b
        L_0x0610:
            java.lang.String r2 = "NOVI"
            boolean r2 = r3.equals(r2)
            r9 = 2
            if (r2 != 0) goto L_0x056c
            goto L_0x056b
        L_0x061b:
            java.lang.String r2 = "FBPAY"
            boolean r2 = r3.equals(r2)
            r9 = 1
            if (r2 != 0) goto L_0x056c
            goto L_0x056b
        L_0x0626:
            X.1er r2 = r4.A01     // Catch:{ all -> 0x0ade }
            X.2tF r1 = r2.A00()     // Catch:{ all -> 0x0ade }
            java.util.Set r0 = r1.A0F     // Catch:{ all -> 0x0ade }
            r0.add(r3)     // Catch:{ all -> 0x0ade }
            r2.A01(r1)     // Catch:{ all -> 0x0ade }
        L_0x0634:
            monitor-exit(r4)
            goto L_0x005f
        L_0x0637:
            java.lang.String r2 = "step_up"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x06b9
            X.1QO r2 = r1.A0D
            boolean r2 = r2.A03()
            if (r2 == 0) goto L_0x005f
            X.ADT r4 = X.C196789ve.A00(r0)
            if (r4 == 0) goto L_0x005f
            X.1QD r5 = r1.A0B
            org.json.JSONObject r0 = r4.A00()
            java.lang.String r3 = r0.toString()
            android.content.SharedPreferences r0 = r5.A03()
            android.content.SharedPreferences$Editor r2 = r0.edit()
            java.lang.String r0 = "payment_step_up_info"
            android.content.SharedPreferences$Editor r0 = r2.putString(r0, r3)
            r0.apply()
            X.118 r0 = r1.A03
            X.3Bj r9 = X.AnonymousClass9RN.A00(r0, r4)
            X.1QG r0 = r1.A09
            r0.A05(r9)
            android.content.SharedPreferences r0 = r5.A03()
            android.content.SharedPreferences$Editor r2 = r0.edit()
            java.lang.String r0 = "payment_step_up_update_ack"
            android.content.SharedPreferences$Editor r0 = r2.putBoolean(r0, r7)
            r0.apply()
            X.1if r3 = r1.A0F
            java.lang.String r2 = r4.A02
            X.1ie r0 = r3.A05
            r0.A03(r2)
            X.1KB r4 = r3.A01
            X.00H r0 = r3.A0C
            java.lang.Object r3 = r0.get()
            r3.getClass()
            r2 = 40
            X.Ajs r0 = new X.Ajs
            r0.<init>((java.lang.Object) r3, (int) r2)
            r4.A0J(r0)
            X.1QS r0 = r1.A0E
            X.BD1 r0 = r0.A06()
            X.BD4 r8 = r0.BRb()
            if (r8 == 0) goto L_0x005f
            java.lang.String r11 = "push_notification"
            r10 = 0
            r13 = 2
            r12 = r10
            r8.Bi2(r9, r10, r11, r12, r13)
            goto L_0x005f
        L_0x06b9:
            java.lang.String r2 = "transaction"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x005f
            boolean r2 = android.text.TextUtils.isEmpty(r3)
            if (r2 != 0) goto L_0x06d0
            java.lang.String r2 = "p2p"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x005f
        L_0x06d0:
            X.1ex r2 = r1.A0C
            X.AW0 r0 = r2.A03(r0)
            if (r0 == 0) goto L_0x005f
            X.1QE r9 = r1.A0I
            java.lang.String r2 = "onPaymentTransactionStatusUpdate"
            r9.A06(r2)
            java.lang.String r2 = r0.A0J
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0718
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r2 = "Handle transaction error: "
            r3.append(r2)
            java.lang.String r2 = r0.A0J
            r3.append(r2)
            java.lang.String r2 = " trans Id: "
            r3.append(r2)
            java.lang.String r2 = r0.A0K
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r9.A06(r2)
            X.1QS r2 = r1.A0E
            X.BD1 r2 = r2.A06()
            X.BDG r3 = r2.BPY()
            if (r3 == 0) goto L_0x0718
            java.lang.String r2 = r0.A0J
            r3.BcM(r2)
        L_0x0718:
            monitor-enter(r0)     // Catch:{ Exception -> 0x091d }
            boolean r2 = r0.A0K()     // Catch:{ all -> 0x091a }
            if (r2 != 0) goto L_0x0725
            int r3 = r0.A00     // Catch:{ all -> 0x091a }
            r2 = 1
            if (r3 != r2) goto L_0x0725
            goto L_0x0726
        L_0x0725:
            r2 = 0
        L_0x0726:
            monitor-exit(r0)     // Catch:{ Exception -> 0x091d }
            if (r2 == 0) goto L_0x0923
            int r3 = r0.A02     // Catch:{ Exception -> 0x091d }
            r2 = 106(0x6a, float:1.49E-43)
            if (r3 != r2) goto L_0x0923
            X.1QO r2 = r1.A0D     // Catch:{ Exception -> 0x091d }
            X.0ve r4 = r2.A02     // Catch:{ Exception -> 0x091d }
            r2 = 1746(0x6d2, float:2.447E-42)
            X.0vf r3 = X.C18040vf.A02     // Catch:{ Exception -> 0x091d }
            boolean r2 = X.C18020vd.A05(r3, r4, r2)     // Catch:{ Exception -> 0x091d }
            if (r2 == 0) goto L_0x0923
            r2 = 5049(0x13b9, float:7.075E-42)
            boolean r2 = X.C18020vd.A05(r3, r4, r2)     // Catch:{ Exception -> 0x091d }
            if (r2 == 0) goto L_0x0923
            com.whatsapp.jid.UserJid r2 = r0.A0E     // Catch:{ Exception -> 0x091d }
            r21 = r2
            if (r2 == 0) goto L_0x0923
            r2 = 0
            X.118 r12 = r1.A03     // Catch:{ Exception -> 0x0894 }
            r3 = 1
            java.lang.Object[] r11 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0894 }
            long r5 = r0.A05     // Catch:{ Exception -> 0x0894 }
            X.11P r14 = r1.A02     // Catch:{ Exception -> 0x0894 }
            r19 = 0
            int r3 = (r5 > r19 ? 1 : (r5 == r19 ? 0 : -1))
            if (r3 <= 0) goto L_0x0875
            android.content.Context r3 = r12.A00     // Catch:{ Exception -> 0x0894 }
            r20 = r3
            r19 = 2131896920(0x7f122a58, float:1.9428715E38)
            r3 = 1
            java.lang.Object[] r10 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0894 }
            X.0vb r13 = r1.A04     // Catch:{ Exception -> 0x0894 }
            long r3 = r14.A09(r5)     // Catch:{ Exception -> 0x0894 }
            X.11Y r15 = X.AnonymousClass11X.A00     // Catch:{ Exception -> 0x0894 }
            java.lang.String r15 = r15.A07(r13, r3)     // Catch:{ Exception -> 0x0894 }
            long r3 = r14.A09(r5)     // Catch:{ Exception -> 0x0894 }
            java.lang.String r3 = X.A8I.A00(r13, r3)     // Catch:{ Exception -> 0x0894 }
            java.lang.String r3 = X.A87.A03(r13, r15, r3)     // Catch:{ Exception -> 0x0894 }
            r10[r7] = r3     // Catch:{ Exception -> 0x0894 }
            r4 = r20
            r3 = r19
            java.lang.String r3 = r4.getString(r3, r10)     // Catch:{ Exception -> 0x0894 }
        L_0x0787:
            r11[r7] = r3     // Catch:{ Exception -> 0x0894 }
            r3 = 2131889232(0x7f120c50, float:1.9413122E38)
            java.lang.String r11 = r12.A02(r3, r11)     // Catch:{ Exception -> 0x0894 }
            java.lang.String r4 = r0.A0I     // Catch:{ Exception -> 0x0894 }
            X.1KI r3 = r1.A07     // Catch:{ Exception -> 0x0894 }
            r10 = 1
            X.1KJ r23 = r3.A01(r4)     // Catch:{ Exception -> 0x0894 }
            X.BDa r3 = r0.A08     // Catch:{ Exception -> 0x0894 }
            int r3 = r3.getValue()     // Catch:{ Exception -> 0x0894 }
            long r3 = (long) r3     // Catch:{ Exception -> 0x0894 }
            X.BDa r5 = r0.A08     // Catch:{ Exception -> 0x0894 }
            X.ARR r5 = (X.ARR) r5     // Catch:{ Exception -> 0x0894 }
            int r5 = r5.A00     // Catch:{ Exception -> 0x0894 }
            X.AE1 r6 = new X.AE1     // Catch:{ Exception -> 0x0894 }
            r6.<init>(r3, r5, r2)     // Catch:{ Exception -> 0x0894 }
            java.util.LinkedList r3 = new java.util.LinkedList     // Catch:{ Exception -> 0x0894 }
            r3.<init>()     // Catch:{ Exception -> 0x0894 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0894 }
            r5.<init>()     // Catch:{ Exception -> 0x0894 }
            java.lang.String r4 = "custom-item-"
            r5.append(r4)     // Catch:{ Exception -> 0x0894 }
            java.util.UUID r4 = java.util.UUID.randomUUID()     // Catch:{ Exception -> 0x0894 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0894 }
            r5.append(r4)     // Catch:{ Exception -> 0x0894 }
            java.lang.String r27 = r5.toString()     // Catch:{ Exception -> 0x0894 }
            X.C17960vV.A07(r6)     // Catch:{ Exception -> 0x0894 }
            r4 = 3
            X.C18070vi.A0d(r11, r4)     // Catch:{ Exception -> 0x0894 }
            X.AET r4 = new X.AET     // Catch:{ Exception -> 0x0894 }
            r28 = r2
            r30 = r2
            r31 = r2
            r24 = r4
            r25 = r6
            r26 = r2
            r29 = r11
            r32 = r7
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32)     // Catch:{ Exception -> 0x0894 }
            r3.add(r4)     // Catch:{ Exception -> 0x0894 }
            java.lang.String r34 = "pending"
            X.C17960vV.A07(r6)     // Catch:{ Exception -> 0x0894 }
            java.lang.String r37 = "ORDER"
            X.AEU r28 = new X.AEU     // Catch:{ Exception -> 0x0894 }
            r32 = r2
            r33 = r2
            r35 = r2
            r36 = r2
            r29 = r2
            r30 = r6
            r38 = r3
            r28.<init>(r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)     // Catch:{ Exception -> 0x0894 }
            X.1iW r5 = r1.A01     // Catch:{ Exception -> 0x0894 }
            X.C17960vV.A07(r11)     // Catch:{ Exception -> 0x0894 }
            X.C17960vV.A07(r6)     // Catch:{ Exception -> 0x0894 }
            java.lang.String r32 = X.C181549Qx.A00()     // Catch:{ Exception -> 0x0894 }
            java.lang.String r34 = "physical-goods"
            java.lang.String r3 = r0.A0K     // Catch:{ Exception -> 0x0894 }
            r50 = 0
            r52 = -1
            X.AEn r22 = new X.AEn     // Catch:{ Exception -> 0x0894 }
            r25 = r2
            r27 = r2
            r38 = r2
            r39 = r2
            r40 = r2
            r41 = r2
            r42 = r2
            r43 = r2
            r44 = r2
            r45 = r2
            r46 = r2
            r47 = r2
            r48 = r2
            r55 = r7
            r56 = r7
            r24 = r2
            r31 = r11
            r37 = r3
            r49 = r7
            r54 = r10
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r52, r54, r55, r56)     // Catch:{ Exception -> 0x0894 }
            java.lang.String r3 = "review_and_pay"
            X.AEe r4 = new X.AEe     // Catch:{ Exception -> 0x0894 }
            r4.<init>(r3, r2)     // Catch:{ Exception -> 0x0894 }
            X.ADl r3 = new X.ADl     // Catch:{ Exception -> 0x0894 }
            r3.<init>(r4, r7)     // Catch:{ Exception -> 0x0894 }
            java.util.List r3 = java.util.Collections.singletonList(r3)     // Catch:{ Exception -> 0x0894 }
            X.AEk r12 = new X.AEk     // Catch:{ Exception -> 0x0894 }
            r12.<init>(r3)     // Catch:{ Exception -> 0x0894 }
            X.AEE r11 = new X.AEE     // Catch:{ Exception -> 0x0894 }
            r11.<init>(r2, r2, r2, r2)     // Catch:{ Exception -> 0x0894 }
            X.1PP r4 = r5.A0x     // Catch:{ Exception -> 0x0894 }
            r3 = r21
            X.205 r10 = r4.A01(r3, r10)     // Catch:{ Exception -> 0x0894 }
            X.11P r3 = r5.A0K     // Catch:{ Exception -> 0x0894 }
            long r3 = X.AnonymousClass11P.A01(r3)     // Catch:{ Exception -> 0x0894 }
            X.21R r6 = new X.21R     // Catch:{ Exception -> 0x0894 }
            r6.<init>(r10, r3)     // Catch:{ Exception -> 0x0894 }
            byte[] r3 = r11.A03     // Catch:{ Exception -> 0x0894 }
            if (r3 != 0) goto L_0x0879
            goto L_0x0878
        L_0x0875:
            r3 = 0
            goto L_0x0787
        L_0x0878:
            r11 = r2
        L_0x0879:
            X.AEt r3 = new X.AEt     // Catch:{ Exception -> 0x0894 }
            r19 = r3
            r20 = r22
            r21 = r11
            r22 = r12
            r23 = r2
            r19.<init>(r20, r21, r22, r23, r24)     // Catch:{ Exception -> 0x0894 }
            r6.CIS(r3)     // Catch:{ Exception -> 0x0894 }
            r5.A0b(r6)     // Catch:{ Exception -> 0x0894 }
            X.122 r3 = r5.A0U     // Catch:{ Exception -> 0x0894 }
            r3.BBM(r6)     // Catch:{ Exception -> 0x0894 }
            goto L_0x0899
        L_0x0894:
            r3 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r3)     // Catch:{ Exception -> 0x091d }
            r6 = r2
        L_0x0899:
            X.1QD r5 = r1.A0B     // Catch:{ Exception -> 0x091d }
            android.content.SharedPreferences r3 = r5.A03()     // Catch:{ Exception -> 0x091d }
            java.lang.String r2 = "pref_bip_education_bottom_sheet"
            boolean r2 = r3.getBoolean(r2, r7)     // Catch:{ Exception -> 0x091d }
            if (r2 != 0) goto L_0x0903
            com.whatsapp.jid.UserJid r10 = r0.A0E     // Catch:{ Exception -> 0x091d }
            android.content.SharedPreferences r2 = r5.A03()     // Catch:{ Exception -> 0x091d }
            java.lang.String r12 = "pref_payment_completed_with_bip_jids"
            java.lang.String r4 = r2.getString(r12, r8)     // Catch:{ Exception -> 0x091d }
            java.util.HashSet r3 = new java.util.HashSet     // Catch:{ Exception -> 0x091d }
            r3.<init>()     // Catch:{ Exception -> 0x091d }
            boolean r2 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Exception -> 0x091d }
            if (r2 != 0) goto L_0x08cb
            java.lang.String r2 = ";"
            java.lang.String[] r2 = r4.split(r2)     // Catch:{ Exception -> 0x091d }
            java.util.List r2 = java.util.Arrays.asList(r2)     // Catch:{ Exception -> 0x091d }
            r3.addAll(r2)     // Catch:{ Exception -> 0x091d }
        L_0x08cb:
            java.lang.String r2 = r10.getRawString()     // Catch:{ Exception -> 0x091d }
            r3.add(r2)     // Catch:{ Exception -> 0x091d }
            android.content.SharedPreferences r2 = r5.A03()     // Catch:{ Exception -> 0x091d }
            android.content.SharedPreferences$Editor r11 = r2.edit()     // Catch:{ Exception -> 0x091d }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x091d }
            r10.<init>()     // Catch:{ Exception -> 0x091d }
            r8 = 0
            java.lang.String[] r2 = new java.lang.String[r7]     // Catch:{ Exception -> 0x091d }
            java.lang.Object[] r5 = r3.toArray(r2)     // Catch:{ Exception -> 0x091d }
            java.lang.String[] r5 = (java.lang.String[]) r5     // Catch:{ Exception -> 0x091d }
            int r4 = r5.length     // Catch:{ Exception -> 0x091d }
        L_0x08e9:
            if (r8 >= r4) goto L_0x08f8
            r3 = r5[r8]     // Catch:{ Exception -> 0x091d }
            r2 = 59
            r10.append(r2)     // Catch:{ Exception -> 0x091d }
            r10.append(r3)     // Catch:{ Exception -> 0x091d }
            int r8 = r8 + 1
            goto L_0x08e9
        L_0x08f8:
            java.lang.String r2 = r10.toString()     // Catch:{ Exception -> 0x091d }
            android.content.SharedPreferences$Editor r2 = r11.putString(r12, r2)     // Catch:{ Exception -> 0x091d }
            r2.apply()     // Catch:{ Exception -> 0x091d }
        L_0x0903:
            X.AEt r2 = r6.A00     // Catch:{ Exception -> 0x091d }
            X.C17960vV.A07(r2)     // Catch:{ Exception -> 0x091d }
            X.AEn r2 = r2.A02     // Catch:{ Exception -> 0x091d }
            X.8pG r5 = r0.A0A     // Catch:{ Exception -> 0x091d }
            java.lang.String r4 = r2.A0K     // Catch:{ Exception -> 0x091d }
            X.205 r2 = r6.A0v     // Catch:{ Exception -> 0x091d }
            java.lang.String r3 = r2.A01     // Catch:{ Exception -> 0x091d }
            X.AEo r2 = new X.AEo     // Catch:{ Exception -> 0x091d }
            r2.<init>(r4, r3)     // Catch:{ Exception -> 0x091d }
            r5.A02 = r2     // Catch:{ Exception -> 0x091d }
            goto L_0x0923
        L_0x091a:
            r2 = move-exception
            monitor-exit(r0)     // Catch:{ Exception -> 0x091d }
            throw r2     // Catch:{ Exception -> 0x091d }
        L_0x091d:
            r3 = move-exception
            java.lang.String r2 = "PAY: onPaymentTransactionStatusUpdate Order update for BIP failed, error"
            r9.A0A(r2, r3)
        L_0x0923:
            int r2 = r0.A02
            r4 = 405(0x195, float:5.68E-43)
            if (r2 != r4) goto L_0x0940
            X.11S r3 = r1.A00
            com.whatsapp.jid.UserJid r2 = r0.A0E
            boolean r2 = r3.A0O(r2)
            if (r2 == 0) goto L_0x0940
            X.8pG r2 = r0.A0A
            if (r2 == 0) goto L_0x0940
            X.AEo r2 = r2.A02
            if (r2 == 0) goto L_0x0940
            X.121 r2 = r1.A05
            r2.CQc(r0)
        L_0x0940:
            X.1BI r2 = r0.A0C
            if (r2 == 0) goto L_0x0964
            java.lang.String r2 = r0.A0L
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0964
            X.1BI r5 = r0.A0C
            boolean r3 = r0.A0Q
            java.lang.String r2 = r0.A0L
            X.205 r4 = new X.205
            r4.<init>(r5, r2, r3)
            X.121 r3 = r1.A05
            boolean r2 = r3.BfY(r4)
            if (r2 != 0) goto L_0x09b2
            r3.CQz(r0, r4)
            goto L_0x0a53
        L_0x0964:
            X.0ve r3 = r1.A08
            r2 = 4288(0x10c0, float:6.009E-42)
            X.0vf r8 = X.C18040vf.A02
            boolean r2 = X.C18020vd.A05(r8, r3, r2)
            if (r2 == 0) goto L_0x09b2
            java.lang.String r5 = r0.A0K
            if (r5 == 0) goto L_0x09b2
            int r2 = r0.A02
            if (r2 != r4) goto L_0x09b2
            X.8pG r2 = r0.A0A
            if (r2 == 0) goto L_0x09b2
            java.lang.String r21 = r2.A0G()
            if (r21 == 0) goto L_0x09b2
            X.1ev r4 = r1.A0H
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS
            X.0ve r3 = r4.A01
            r2 = 4853(0x12f5, float:6.8E-42)
            int r2 = X.C18020vd.A00(r8, r3, r2)
            long r2 = (long) r2
            long r24 = r6.toMillis(r2)
            java.lang.String r23 = "QRC"
            X.1eu r2 = r4.A03
            r19 = r4
            r20 = r2
            r22 = r5
            boolean r2 = X.C31041ev.A00(r19, r20, r21, r22, r23, r24)
            if (r2 != 0) goto L_0x09b2
            X.00H r2 = r4.A04
            java.lang.Object r2 = r2.get()
            X.1et r2 = (X.C31021et) r2
            java.lang.String r23 = "VPA"
            r20 = r2
            X.C31041ev.A00(r19, r20, r21, r22, r23, r24)
        L_0x09b2:
            X.1if r6 = r1.A0F
            int r3 = r0.A03
            r2 = 3
            r5 = 1
            if (r3 == r2) goto L_0x09bc
            if (r3 != r5) goto L_0x09cb
        L_0x09bc:
            X.1QR r2 = r6.A02
            boolean r2 = r2.A0d(r0)
            if (r2 != 0) goto L_0x09cb
            X.1QE r3 = r6.A0B
            java.lang.String r2 = "payments contact table NOT updated"
            r3.A06(r2)
        L_0x09cb:
            X.1QR r8 = r6.A02
            java.lang.String r10 = r0.A0L
            java.lang.String r4 = r0.A0K
            r2 = -1
            X.AW0 r4 = r8.A0N(r10, r4, r2)
            X.1QS r2 = r6.A0A
            X.BD1 r2 = r2.A06()
            r2.BKJ(r0, r4)
            if (r4 != 0) goto L_0x09f1
            int r3 = r0.A03
            r2 = 20
            if (r3 == r2) goto L_0x09ec
            r2 = 40
            if (r3 != r2) goto L_0x09f1
        L_0x09ec:
            X.1QD r2 = r6.A07
            r2.A0O(r5)
        L_0x09f1:
            java.lang.String r2 = r0.A0L
            boolean r2 = r8.A0e(r0, r4, r2)
            if (r2 == 0) goto L_0x0a39
            java.lang.String r5 = r0.A0L
            java.lang.String r4 = r0.A0K
            r2 = -1
            X.AW0 r8 = r8.A0N(r5, r4, r2)
            if (r8 == 0) goto L_0x0a53
            X.1QE r4 = r6.A0B
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r2 = "updatePaymentInfoWithoutMessage updated transaction with trans id: "
            r3.append(r2)
            java.lang.String r2 = r8.A0K
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r4.A06(r2)
            X.1ib r5 = r6.A04
            X.10I r4 = r5.A06
            r3 = 25
            X.3Bz r2 = new X.3Bz
            r2.<init>(r5, r8, r3)
            r4.CGF(r2)
            X.1KB r4 = r6.A01
            r3 = 32
            X.3Bz r2 = new X.3Bz
            r2.<init>(r6, r8, r3)
            r4.A0J(r2)
            goto L_0x0a53
        L_0x0a39:
            X.1QE r4 = r6.A0B
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r2 = "updatePaymentInfoWithoutMessage transaction was not updated: "
            r3.append(r2)
            java.lang.String r2 = r0.A0K
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            r2 = 0
            X.AnonymousClass1QE.A02(r4, r2, r3)
        L_0x0a53:
            X.8pG r2 = r0.A0A     // Catch:{ Exception -> 0x0a76 }
            if (r2 == 0) goto L_0x0a7c
            X.ADR r2 = r2.A01     // Catch:{ Exception -> 0x0a76 }
            if (r2 == 0) goto L_0x0a7c
            java.lang.String r2 = r2.A02     // Catch:{ Exception -> 0x0a76 }
            long r2 = java.lang.Long.parseLong(r2)     // Catch:{ Exception -> 0x0a76 }
            X.1ig r8 = r1.A0J     // Catch:{ Exception -> 0x0a76 }
            X.9ys r4 = r8.A02()     // Catch:{ Exception -> 0x0a76 }
            if (r4 == 0) goto L_0x0a7c
            X.2r1 r4 = r4.A08     // Catch:{ Exception -> 0x0a76 }
            long r4 = r4.A01     // Catch:{ Exception -> 0x0a76 }
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 != 0) goto L_0x0a7c
            r4 = 0
            r8.A06(r4, r2)     // Catch:{ Exception -> 0x0a76 }
            goto L_0x0a7c
        L_0x0a76:
            r3 = move-exception
            java.lang.String r2 = "PAY: onPaymentTransactionStatusUpdate error"
            r9.A0A(r2, r3)
        L_0x0a7c:
            X.1QS r3 = r1.A0E
            java.lang.String r1 = r0.A0I
            java.lang.String r2 = r3.A07(r1)
            X.2tK r1 = X.C63572tK.A0E
            java.lang.String r1 = "IN"
            if (r2 != r1) goto L_0x005f
            java.lang.String r1 = "UPI"
            X.AZ9 r1 = r3.A05(r1)
            if (r1 == 0) goto L_0x005f
            X.BD4 r5 = r1.BRb()
            if (r5 == 0) goto L_0x005f
            X.8sO r4 = r5.BHN()
            r1 = 3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4.A08 = r1
            java.lang.String r1 = "api_event"
            r4.A0b = r1
            r1 = 28
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4.A0B = r1
            X.A7u[] r1 = new X.C20112A7u[r7]
            X.A7u r3 = new X.A7u
            r3.<init>(r1)
            int r2 = r0.A03
            int r1 = r0.A02
            java.lang.String r2 = X.C20128A8n.A04(r2, r1)
            java.lang.String r1 = "transaction_status"
            r3.A07(r1, r2)
            java.lang.String r1 = r0.A0J
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0ad3
            java.lang.String r1 = "payments_error_code"
            java.lang.String r0 = r0.A0J
            r3.A07(r1, r0)
        L_0x0ad3:
            java.lang.String r0 = r3.toString()
            r4.A0Z = r0
            r5.BiH(r4)
            goto L_0x005f
        L_0x0ade:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x0ae1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33401il.A05(X.1ca, int):void");
    }

    public void A06(BD1 bd1) {
        BD4 BRb = bd1.BRb();
        if (BRb != null) {
            C171858sO BHN = BRb.BHN();
            BHN.A08 = 3;
            BHN.A0b = "api_event";
            BHN.A0B = 25;
            AnonymousClass1QE r2 = this.A0I;
            StringBuilder sb = new StringBuilder();
            sb.append("PaymentUserActionEvent accountRecovery event: ");
            sb.append(BHN.toString());
            r2.A06(sb.toString());
            BRb.BiH(BHN);
        }
    }
}
