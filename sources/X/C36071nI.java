package X;

import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import java.util.LinkedHashSet;

/* renamed from: X.1nI  reason: invalid class name and case insensitive filesystem */
public class C36071nI extends C31911gK {
    public final AnonymousClass190 A00;
    public final AnonymousClass11S A01;
    public final C25001Mm A02;
    public final AnonymousClass1M9 A03;
    public final AnonymousClass11P A04;
    public final AnonymousClass118 A05;
    public final C27301Vn A06;
    public final AnonymousClass1CJ A07;
    public final AnonymousClass1V2 A08;
    public final AnonymousClass1MW A09;
    public final C18030ve A0A;
    public final AnonymousClass126 A0B;
    public final AnonymousClass12M A0C;
    public final AnonymousClass1MG A0D;
    public final C26211Rg A0E;
    public final AnonymousClass10I A0F;
    public final AnonymousClass00H A0G;
    public final AnonymousClass00H A0H;
    public final AnonymousClass00H A0I;
    public final AnonymousClass00H A0J;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C36071nI(X.AnonymousClass190 r9, X.AnonymousClass11S r10, X.C25001Mm r11, X.AnonymousClass1M9 r12, X.AnonymousClass11P r13, X.AnonymousClass118 r14, X.C27301Vn r15, X.AnonymousClass1CJ r16, X.AnonymousClass1V2 r17, X.AnonymousClass1MW r18, X.C18030ve r19, X.AnonymousClass126 r20, X.AnonymousClass12M r21, X.AnonymousClass1MG r22, X.C26211Rg r23, X.AnonymousClass1OZ r24, X.AnonymousClass1N7 r25, X.AnonymousClass10I r26, X.AnonymousClass00H r27, X.AnonymousClass00H r28, X.AnonymousClass00H r29, X.AnonymousClass00H r30) {
        /*
            r8 = this;
            r0 = 1
            int[] r6 = new int[r0]
            r1 = 0
            r0 = 209(0xd1, float:2.93E-43)
            r6[r1] = r0
            r7 = 1
            r1 = r8
            r5 = r26
            r4 = r25
            r2 = r9
            r3 = r24
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r8.A04 = r13
            r0 = r19
            r8.A0A = r0
            r8.A00 = r9
            r8.A01 = r10
            r8.A05 = r14
            r8.A0F = r5
            r0 = r16
            r8.A07 = r0
            r8.A02 = r11
            r0 = r27
            r8.A0J = r0
            r0 = r22
            r8.A0D = r0
            r8.A03 = r12
            r0 = r20
            r8.A0B = r0
            r0 = r21
            r8.A0C = r0
            r0 = r23
            r8.A0E = r0
            r0 = r28
            r8.A0G = r0
            r0 = r18
            r8.A09 = r0
            r0 = r29
            r8.A0I = r0
            r8.A06 = r15
            r0 = r30
            r8.A0H = r0
            r0 = r17
            r8.A08 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36071nI.<init>(X.190, X.11S, X.1Mm, X.1M9, X.11P, X.118, X.1Vn, X.1CJ, X.1V2, X.1MW, X.0ve, X.126, X.12M, X.1MG, X.1Rg, X.1OZ, X.1N7, X.10I, X.00H, X.00H, X.00H, X.00H):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.A2B A01(X.C29621ca r7, int r8) {
        /*
            java.lang.Class<X.1EC> r1 = X.AnonymousClass1EC.class
            java.lang.String r0 = "jid"
            com.whatsapp.jid.Jid r3 = r7.A0F(r1, r0)
            com.whatsapp.jid.GroupJid r3 = (com.whatsapp.jid.GroupJid) r3
            java.lang.String r4 = ""
            java.lang.String r1 = "subject"
            r0 = 0
            java.lang.String r2 = r7.A0Q(r1, r0)     // Catch:{ 1UI -> 0x0021 }
            java.lang.String r1 = "subject_ts"
            r0 = 0
            int r0 = r7.A0A(r1, r0)     // Catch:{ 1UI -> 0x0024 }
            long r6 = (long) r0     // Catch:{ 1UI -> 0x0024 }
            r0 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 * r0
            goto L_0x002c
        L_0x0021:
            r1 = move-exception
            r2 = r4
            goto L_0x0025
        L_0x0024:
            r1 = move-exception
        L_0x0025:
            java.lang.String r0 = "cannot get group subject from notification"
            com.whatsapp.util.Log.e(r0, r1)
            r6 = 0
        L_0x002c:
            if (r3 == 0) goto L_0x003e
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x003e
            if (r2 == 0) goto L_0x0037
            r4 = r2
        L_0x0037:
            X.A2B r2 = new X.A2B
            r5 = r8
            r2.<init>(r3, r4, r5, r6)
            return r2
        L_0x003e:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36071nI.A01(X.1ca, int):X.A2B");
    }

    private LinkedHashSet A02(C29621ca r4, int i) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C29621ca A012 : r4.A0R("group")) {
            A2B A013 = A01(A012, i);
            if (A013 != null) {
                linkedHashSet.add(A013);
            }
        }
        return linkedHashSet;
    }

    private void A03(UserJid userJid, String str) {
        if (!TextUtils.isEmpty(str) && userJid != null) {
            AnonymousClass1M9 r1 = this.A03;
            AnonymousClass1E7 A0H2 = r1.A0H(userJid);
            A0H2.A0c = str;
            r1.A0W(A0H2);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v14, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v44, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v45, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v84, resolved type: X.3CE} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v48, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v49, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v197, resolved type: X.2Mh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v12, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v265, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v13, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v14, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v96, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v97, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v190, resolved type: X.3Cr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v107, resolved type: X.3Cr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v313, resolved type: X.2Mg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r51v19, resolved type: X.2Mg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r51v20, resolved type: X.2Mg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r51v21, resolved type: X.2Mg} */
    /* JADX WARNING: type inference failed for: r1v58, types: [java.lang.Object, X.2rm] */
    /* JADX WARNING: type inference failed for: r1v139, types: [X.2Me, X.2Mh, X.206] */
    /* JADX WARNING: type inference failed for: r3v22, types: [X.2MU, X.2Mh, X.206] */
    /* JADX WARNING: type inference failed for: r2v27, types: [X.206, X.2Mc] */
    /* JADX WARNING: type inference failed for: r4v85, types: [java.lang.Runnable] */
    /* JADX WARNING: type inference failed for: r3v75, types: [X.2MN, X.20i, X.206] */
    /* JADX WARNING: type inference failed for: r2v124, types: [X.2MU, X.2Mh, X.206] */
    /* JADX WARNING: type inference failed for: r5v177, types: [X.2pI, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v186, types: [X.206] */
    /* JADX WARNING: type inference failed for: r10v96, types: [X.2Mg] */
    /* JADX WARNING: type inference failed for: r10v97, types: [X.2Mg] */
    /* JADX WARNING: type inference failed for: r10v98, types: [X.2Mg] */
    /* JADX WARNING: type inference failed for: r10v99, types: [X.2Mg] */
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
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:1189:0x235f A[Catch:{ 11T -> 0x26d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1192:0x2381 A[Catch:{ 11T -> 0x26d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1196:0x2399 A[Catch:{ 11T -> 0x26d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1202:0x23a7 A[Catch:{ 11T -> 0x26d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1210:0x23e0 A[Catch:{ 11T -> 0x26d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1288:0x2642 A[Catch:{ 11T -> 0x26d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1289:0x2653 A[Catch:{ 11T -> 0x26d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1297:0x26b7 A[Catch:{ 11T -> 0x26d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:531:0x0fd6  */
    /* JADX WARNING: Removed duplicated region for block: B:534:0x0ff3  */
    public void A05(X.C29621ca r90, int r91) {
        /*
            r89 = this;
            r3 = r89
            com.whatsapp.jid.Jid r0 = r3.A00
            X.1BI r1 = X.C22971Dz.A00(r0)
            X.1Dw r0 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.jid.UserJid r9 = X.C22941Dw.A01(r1)
            r4 = r90
            X.1ca r1 = r4.A0I()
            boolean r0 = X.C22971Dz.A0T(r9)
            if (r0 == 0) goto L_0x1b78
            java.lang.Class<com.whatsapp.jid.PhoneUserJid> r2 = com.whatsapp.jid.PhoneUserJid.class
            java.lang.String r0 = "participant_pn"
            com.whatsapp.jid.Jid r0 = r4.A0F(r2, r0)
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            if (r0 == 0) goto L_0x002f
            X.126 r5 = r3.A0B
            java.util.Map r2 = java.util.Collections.singletonMap(r9, r0)
            r5.A0i(r2)
        L_0x002f:
            java.lang.String r5 = "addressing_mode"
            r2 = 0
            java.lang.String r2 = r4.A0Q(r5, r2)
            java.lang.String r36 = X.C42671yY.A00(r2)
            com.whatsapp.jid.Jid r5 = r3.A01
            android.os.Parcelable$Creator r2 = X.AnonymousClass1EC.CREATOR
            X.1EC r2 = X.C42941yz.A00(r5)
            java.lang.String r5 = "create"
            boolean r10 = X.C29621ca.A07(r1, r5)
            if (r10 != 0) goto L_0x0086
            X.00H r5 = r3.A0J
            java.lang.Object r6 = r5.get()
            X.2mo r6 = (X.C59742mo) r6
            r5 = r36
            boolean r5 = r6.A02(r2, r5)
            if (r5 == 0) goto L_0x0086
            java.lang.String r5 = "remove"
            boolean r5 = X.C29621ca.A07(r1, r5)
            if (r5 == 0) goto L_0x349c
            X.11S r5 = r3.A01
            r5.A0I()
            com.whatsapp.jid.PhoneUserJid r8 = r5.A0E
            X.C17960vV.A07(r8)
            X.190 r7 = r3.A00
            r6 = 34
            X.Ali r5 = new X.Ali
            r5.<init>((java.lang.Object) r7, (int) r6)
            java.util.LinkedHashMap r7 = X.A8d.A05(r1, r5)
            int r6 = r7.size()
            r5 = 1
            if (r6 != r5) goto L_0x349c
            boolean r5 = r7.containsKey(r8)
            if (r5 == 0) goto L_0x349c
        L_0x0086:
            java.lang.String r7 = "t"
            r21 = 0
            r5 = r21
            long r25 = r4.A0D(r7, r5)
            r79 = 1000(0x3e8, double:4.94E-321)
            long r25 = r25 * r79
            int r5 = (r25 > r21 ? 1 : (r25 == r21 ? 0 : -1))
            if (r5 != 0) goto L_0x009f
            X.11P r5 = r3.A04
            long r25 = X.AnonymousClass11P.A01(r5)
        L_0x009f:
            java.lang.String r5 = "add"
            boolean r5 = X.C29621ca.A07(r1, r5)
            if (r5 == 0) goto L_0x03e8
            X.190 r5 = r3.A00
            r4 = 34
            X.Ali r0 = new X.Ali
            r0.<init>((java.lang.Object) r5, (int) r4)
            java.util.LinkedHashMap r22 = X.A8d.A05(r1, r0)
            int r0 = r22.size()
            if (r0 <= 0) goto L_0x0120
            X.126 r0 = r3.A0B
            X.C17960vV.A07(r2)
            boolean r2 = r0.A0m()
            if (r2 == 0) goto L_0x0120
            java.lang.String r4 = "GroupNotificationHandler/handleAdd"
            X.1Ez r21 = new X.1Ez
            r2 = r21
            r2.<init>((java.lang.String) r4)
            java.lang.String r4 = "reason"
            r2 = 0
            java.lang.String r35 = r1.A0Q(r4, r2)
            r14 = 1
            X.2rV r3 = r3.A04(r14)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = "groupmgr/onGroupAddUsers "
            r2.append(r1)
            r2.append(r3)
            java.lang.String r1 = "/"
            r2.append(r1)
            java.util.Collection r1 = r22.values()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.1BI r1 = r3.A02
            X.1EC r1 = X.C42941yz.A00(r1)
            X.C17960vV.A07(r1)
            boolean r2 = r22.isEmpty()
            r4 = 2
            if (r2 != 0) goto L_0x012e
            r2 = r22
            boolean r2 = X.AnonymousClass126.A0H(r0, r1, r2)
            if (r2 == 0) goto L_0x0121
            X.12M r2 = r0.A0Z
            java.lang.String r0 = "lid_limbo"
            r2.A0H(r1, r0, r4)
        L_0x0119:
            r0 = 0
            X.C62502rV.A00(r0, r3, r0)
        L_0x011d:
            r21.A02()
        L_0x0120:
            return
        L_0x0121:
            X.00H r2 = r0.A19
            java.lang.Object r4 = r2.get()
            X.1fv r4 = (X.C31661fv) r4
            r2 = r22
            r4.A02(r2)
        L_0x012e:
            X.1Me r2 = r0.A0A
            r2.A0g(r1)
            X.1M9 r2 = r0.A08
            X.1E7 r9 = r2.A0G(r1)
            X.1MZ r7 = r0.A0O
            X.1MW r4 = r7.A08
            X.2tp r2 = r4.A0C(r1)
            r8 = 0
            if (r9 == 0) goto L_0x015d
            X.11S r5 = r0.A05
            r24 = r5
            boolean r5 = r2.A0W(r5)
            if (r5 != 0) goto L_0x017d
            r24.A0I()
            r5 = r24
            com.whatsapp.jid.PhoneUserJid r6 = r5.A0E
            r5 = r22
            boolean r5 = r5.containsKey(r6)
            if (r5 != 0) goto L_0x017d
        L_0x015d:
            java.lang.String r2 = "groupmgr/onGroupAddUsers/requerygroupinfo"
            com.whatsapp.util.Log.i((java.lang.String) r2)
            X.12M r5 = r0.A0Z
            java.lang.String r2 = "participant_me_not_included_change_recovery"
            r4 = 2
            r5.A0H(r1, r2, r4)
            X.1Ui r2 = r0.A0f
            if (r9 != 0) goto L_0x017a
            r0 = 0
        L_0x016f:
            java.lang.String r11 = "GroupChatManager.onGroupAddUsers"
            r9 = r2
            r10 = r1
            r12 = r0
            r13 = r4
            r14 = r8
            r9.A03(r10, r11, r12, r13, r14)
            goto L_0x0119
        L_0x017a:
            int r0 = r9.A08
            goto L_0x016f
        L_0x017d:
            java.util.ArrayList r20 = new java.util.ArrayList
            r20.<init>()
            int r5 = r22.size()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r5)
            boolean r5 = r7.A0K(r1)
            r18 = 1
            r17 = r5 ^ 1
            boolean r5 = r9.A12
            if (r5 == 0) goto L_0x025b
            boolean r5 = r7.A0K(r1)
            if (r5 == 0) goto L_0x025b
        L_0x019d:
            java.util.Collection r5 = r22.values()
            java.util.Iterator r16 = r5.iterator()
        L_0x01a5:
            boolean r5 = r16.hasNext()
            if (r5 == 0) goto L_0x025f
            java.lang.Object r10 = r16.next()
            X.2nJ r10 = (X.C60052nJ) r10
            com.whatsapp.jid.UserJid r5 = r10.A02
            java.lang.String r11 = r10.A04
            r9 = r20
            r9.add(r5)
            X.00H r9 = r0.A0v
            r9.get()
            java.lang.String r9 = "admin"
            boolean r9 = r9.equals(r11)
            if (r9 == 0) goto L_0x024c
            r30 = 1
        L_0x01c9:
            X.1MR r9 = r0.A0S
            java.util.HashSet r11 = r9.A0A(r5)
            java.util.HashSet r29 = X.C63872tp.A02(r11)
            X.11P r15 = r0.A0F
            long r31 = X.AnonymousClass11P.A01(r15)
            X.2sr r11 = new X.2sr
            r27 = r11
            r28 = r5
            r33 = r8
            r27.<init>(r28, r29, r30, r31, r33)
            r6.add(r11)
            boolean r11 = r10.A00()
            if (r11 == 0) goto L_0x0230
            X.00H r11 = r0.A0y
            java.lang.Object r13 = r11.get()
            X.2mo r13 = (X.C59742mo) r13
            X.C18070vi.A0d(r1, r8)
            X.1M9 r11 = r13.A01
            X.1E7 r11 = r11.A0G(r1)
            if (r11 == 0) goto L_0x020a
            java.lang.String r12 = "lid"
            java.lang.String r11 = r11.A0O
            boolean r11 = r12.equals(r11)
            if (r11 != 0) goto L_0x0216
        L_0x020a:
            com.whatsapp.jid.GroupJid r11 = X.C36321nh.A00(r1)
            X.1CJ r12 = r13.A02
            boolean r11 = r12.A0R(r11)
            if (r11 == 0) goto L_0x0230
        L_0x0216:
            X.1E2 r10 = r10.A00
            java.util.HashSet r9 = r9.A0A(r10)
            java.util.HashSet r29 = X.C63872tp.A02(r9)
            long r31 = X.AnonymousClass11P.A01(r15)
            X.2sr r9 = new X.2sr
            r27 = r9
            r28 = r10
            r27.<init>(r28, r29, r30, r31, r33)
            r6.add(r9)
        L_0x0230:
            if (r18 == 0) goto L_0x023d
            X.00H r9 = r0.A0z
            java.lang.Object r9 = r9.get()
            X.9u7 r9 = (X.C195899u7) r9
            r9.A02(r1, r5)
        L_0x023d:
            if (r17 == 0) goto L_0x01a5
            X.00H r9 = r0.A16
            java.lang.Object r9 = r9.get()
            X.9re r9 = (X.C194389re) r9
            r9.A01(r1, r5)
            goto L_0x01a5
        L_0x024c:
            java.lang.String r9 = "superadmin"
            boolean r9 = r9.equals(r11)
            r30 = 0
            if (r9 == 0) goto L_0x01c9
            r30 = 2
            goto L_0x01c9
        L_0x025b:
            r18 = 0
            goto L_0x019d
        L_0x025f:
            X.1Re r10 = r0.A0D
            com.whatsapp.jid.UserJid[] r9 = new com.whatsapp.jid.UserJid[r8]
            r5 = r20
            java.lang.Object[] r9 = r5.toArray(r9)
            com.whatsapp.jid.UserJid[] r9 = (com.whatsapp.jid.UserJid[]) r9
            r5 = 2
            r10.A01(r9, r5)
            X.10I r5 = r0.A0k
            r23 = r5
            X.7Pj r9 = new X.7Pj
            r5 = r20
            r9.<init>(r0, r5, r14)
            r5 = r23
            r5.CGF(r9)
            X.190 r5 = r0.A03
            X.C63872tp.A04(r5, r2, r6)
            X.0ve r9 = r0.A0U
            r5 = 11796(0x2e14, float:1.653E-41)
            X.0vf r15 = X.C18040vf.A02
            boolean r5 = X.C18020vd.A05(r15, r9, r5)
            if (r5 == 0) goto L_0x035b
            X.1MS r5 = r7.A06
            X.1E9 r10 = r2.A06
            X.C18070vi.A0d(r10, r8)
            java.util.Map r5 = r5.A05
            r5.put(r10, r2)
            r6.size()
            X.1DL r5 = r4.A05
            long r18 = r5.A09(r10)
            X.1Cd r5 = r4.A06
            X.1au r9 = r5.A05()
            X.1xA r17 = r9.BD0()     // Catch:{ all -> 0x1b85 }
            java.util.Iterator r16 = r6.iterator()     // Catch:{ all -> 0x1b7b }
        L_0x02b3:
            boolean r5 = r16.hasNext()     // Catch:{ all -> 0x1b7b }
            if (r5 == 0) goto L_0x0354
            java.lang.Object r5 = r16.next()     // Catch:{ all -> 0x1b7b }
            X.2sr r5 = (X.C63312sr) r5     // Catch:{ all -> 0x1b7b }
            com.whatsapp.jid.UserJid r7 = r5.A04     // Catch:{ all -> 0x1b7b }
            X.2sr r11 = r2.A0D(r7, r8)     // Catch:{ all -> 0x1b7b }
            if (r11 == 0) goto L_0x033e
            com.whatsapp.jid.UserJid r7 = r11.A04     // Catch:{ all -> 0x1b7b }
            long r31 = X.AnonymousClass1MW.A00(r4, r7)     // Catch:{ all -> 0x1b7b }
            r5 = 5
            android.content.ContentValues r12 = new android.content.ContentValues     // Catch:{ all -> 0x1b7b }
            r12.<init>(r5)     // Catch:{ all -> 0x1b7b }
            java.lang.String r6 = "group_jid_row_id"
            java.lang.Long r5 = java.lang.Long.valueOf(r18)     // Catch:{ all -> 0x1b7b }
            r12.put(r6, r5)     // Catch:{ all -> 0x1b7b }
            java.lang.String r6 = "user_jid_row_id"
            java.lang.Long r5 = java.lang.Long.valueOf(r31)     // Catch:{ all -> 0x1b7b }
            r12.put(r6, r5)     // Catch:{ all -> 0x1b7b }
            java.lang.String r6 = "rank"
            int r5 = r11.A01     // Catch:{ all -> 0x1b7b }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x1b7b }
            r12.put(r6, r5)     // Catch:{ all -> 0x1b7b }
            java.lang.String r6 = "pending"
            boolean r5 = r11.A03     // Catch:{ all -> 0x1b7b }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x1b7b }
            r12.put(r6, r5)     // Catch:{ all -> 0x1b7b }
            java.lang.String r6 = "add_timestamp"
            long r13 = r11.A02     // Catch:{ all -> 0x1b7b }
            java.lang.Long r5 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x1b7b }
            r12.put(r6, r5)     // Catch:{ all -> 0x1b7b }
            r5 = r9
            X.1av r5 = (X.C28801av) r5     // Catch:{ all -> 0x1b7b }
            X.1Ev r14 = r5.A02     // Catch:{ all -> 0x1b7b }
            java.lang.String r13 = "group_participant_user"
            java.lang.String r6 = "addGroupParticipants/INSERT_GROUP_PARTICIPANT_USER"
            r5 = 5
            r14.A09(r13, r6, r12, r5)     // Catch:{ all -> 0x1b7b }
            X.1MV r5 = r4.A07     // Catch:{ all -> 0x1b7b }
            X.10f r28 = r11.A00()     // Catch:{ all -> 0x1b7b }
            r27 = r5
            r29 = r10
            r30 = r7
            r27.A01(r28, r29, r30, r31)     // Catch:{ all -> 0x1b7b }
            X.1MU r6 = r4.A08     // Catch:{ all -> 0x1b7b }
            X.11S r5 = r4.A01     // Catch:{ all -> 0x1b7b }
            boolean r12 = r5.A0O(r7)     // Catch:{ all -> 0x1b7b }
            X.0ve r7 = r6.A01     // Catch:{ all -> 0x1b7b }
            r5 = 8088(0x1f98, float:1.1334E-41)
            boolean r5 = X.C18020vd.A05(r15, r7, r5)     // Catch:{ all -> 0x1b7b }
            if (r5 == 0) goto L_0x02b3
            if (r12 == 0) goto L_0x02b3
            int r5 = r11.A01     // Catch:{ all -> 0x1b7b }
            r6.A05(r9, r10, r5)     // Catch:{ all -> 0x1b7b }
            goto L_0x02b3
        L_0x033e:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x1b7b }
            r6.<init>()     // Catch:{ all -> 0x1b7b }
            java.lang.String r5 = "ParticipantUserStore/addGroupParticipants participant not in group:"
            r6.append(r5)     // Catch:{ all -> 0x1b7b }
            r6.append(r7)     // Catch:{ all -> 0x1b7b }
            java.lang.String r5 = r6.toString()     // Catch:{ all -> 0x1b7b }
            com.whatsapp.util.Log.e((java.lang.String) r5)     // Catch:{ all -> 0x1b7b }
            goto L_0x02b3
        L_0x0354:
            r17.A00()     // Catch:{ all -> 0x1b7b }
            r17.close()     // Catch:{ all -> 0x1b85 }
            goto L_0x035f
        L_0x035b:
            r7.A0B(r2)
            goto L_0x0362
        L_0x035f:
            r9.close()
        L_0x0362:
            r6 = 48
            X.3C4 r5 = new X.3C4
            r4 = r22
            r5.<init>(r0, r1, r4, r6)
            r4 = r23
            r4.CGF(r5)
            X.00H r6 = r0.A0n
            java.lang.Object r5 = r6.get()
            X.2l0 r5 = (X.C58632l0) r5
            r4 = r20
            java.util.List r5 = r5.A01(r1, r4)
            boolean r4 = r5.isEmpty()
            if (r4 == 0) goto L_0x03e5
            java.lang.Object r5 = r6.get()
            X.2l0 r5 = (X.C58632l0) r5
            X.C18070vi.A0d(r1, r8)
            X.1MZ r4 = r5.A01
            boolean r4 = r4.A0K(r1)
            if (r4 != 0) goto L_0x03e0
            X.1CJ r4 = r5.A00
            boolean r4 = r4.A0R(r1)
            if (r4 == 0) goto L_0x03e0
            com.whatsapp.jid.UserJid r5 = r3.A03
            r4 = r24
            boolean r4 = r4.A0O(r5)
            if (r4 == 0) goto L_0x03e0
        L_0x03a7:
            boolean r4 = r20.isEmpty()
            if (r4 != 0) goto L_0x03e0
            com.whatsapp.jid.UserJid r5 = r3.A03
            X.1CJ r4 = r0.A0I
            int r39 = r4.A06(r1)
            r29 = 0
            r33 = r29
            r36 = r29
            r37 = r29
            r27 = r0
            r28 = r2
            r30 = r29
            r31 = r1
            r32 = r5
            r34 = r3
            r38 = r20
            r40 = r25
            r42 = r8
            r27.A0Q(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r42)
        L_0x03d2:
            X.1KB r5 = r0.A04
            r4 = 49
            X.3C4 r3 = new X.3C4
            r3.<init>(r0, r1, r2, r4)
            r5.A0J(r3)
            goto L_0x011d
        L_0x03e0:
            r4 = 0
            X.C62502rV.A00(r4, r3, r4)
            goto L_0x03d2
        L_0x03e5:
            r20 = r5
            goto L_0x03a7
        L_0x03e8:
            if (r10 == 0) goto L_0x0403
            X.1ca r0 = r1.A0I()
            java.lang.String r4 = "type"
            java.lang.String r40 = ""
            r2 = r40
            java.lang.String r8 = r1.A0Q(r4, r2)
            java.lang.String r2 = "group"
            boolean r2 = X.C29621ca.A07(r0, r2)
            if (r2 == 0) goto L_0x0120
            goto L_0x1b8a
        L_0x0403:
            java.lang.String r5 = "delete"
            boolean r5 = X.C29621ca.A07(r1, r5)
            if (r5 == 0) goto L_0x0569
            java.lang.String r0 = "reason"
            r8 = 0
            java.lang.String r1 = r1.A0Q(r0, r8)
            java.lang.String r0 = "delete_parent"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0478
            r1 = 1
        L_0x041b:
            X.126 r11 = r3.A0B
            r10 = 1
            X.2rV r7 = r3.A04(r10)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "groupmgr/onGroupDelete "
            r2.append(r0)
            r2.append(r7)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1BI r0 = r7.A02
            X.1EC r12 = X.C42941yz.A00(r0)
            if (r12 == 0) goto L_0x27dc
            X.1MS r0 = r11.A0N
            java.util.Map r0 = r0.A05
            boolean r0 = r0.containsKey(r12)
            if (r0 != 0) goto L_0x0493
            X.00H r0 = r11.A0m
            java.lang.Object r0 = r0.get()
            X.1kb r0 = (X.C34511kb) r0
            X.1EC r2 = r0.A05(r12)
            if (r2 == 0) goto L_0x27dc
            X.1MG r0 = r11.A0a
            java.util.HashSet r3 = r0.A03(r2)
            java.util.Iterator r2 = r3.iterator()
        L_0x0460:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x048d
            java.lang.Object r0 = r2.next()
            X.A2B r0 = (X.A2B) r0
            com.whatsapp.jid.GroupJid r0 = r0.A02
            boolean r0 = r0.equals(r12)
            if (r0 != 0) goto L_0x0460
            r2.remove()
            goto L_0x0460
        L_0x0478:
            java.lang.String r0 = "integrity_delete_parent"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0482
            r1 = 2
            goto L_0x041b
        L_0x0482:
            java.lang.String r0 = "deactivate_general_chat"
            boolean r0 = r0.equals(r1)
            r1 = 0
            if (r0 == 0) goto L_0x041b
            r1 = 3
            goto L_0x041b
        L_0x048d:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x27dc
        L_0x0493:
            r14 = 2
            if (r1 != r14) goto L_0x04a9
            X.1CJ r1 = r11.A0I
            int r0 = r1.A06(r12)
            r17 = 0
            r5 = 3
            if (r0 == r10) goto L_0x26ea
            if (r0 == r5) goto L_0x27dc
            java.lang.String r0 = "groupmgr/onGroupDelete/Integrity Deactivate notification received for non-CAG"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r1 = 0
        L_0x04a9:
            X.AnonymousClass126.A0C(r11, r12)
            X.C62502rV.A00(r8, r7, r8)
            r15 = 3
            if (r1 != r10) goto L_0x053e
            X.1CJ r13 = r11.A0I
            int r0 = r13.A06(r12)
            if (r0 == r10) goto L_0x04e7
            X.1Uh r6 = r11.A0V
            X.1PQ r1 = r11.A0h
            X.1Me r2 = r11.A0A
            X.00H r0 = r11.A0m
            java.lang.Object r0 = r0.get()
            X.1kb r0 = (X.C34511kb) r0
            X.1EC r0 = r0.A05(r12)
            java.lang.String r5 = r2.A0Y(r0)
            X.1PP r0 = r1.A02
            X.205 r4 = r0.A01(r12, r10)
            r3 = 87
            X.2MU r2 = new X.2MU
            r0 = r25
            r2.<init>(r4, r3, r0)
            r2.A00 = r5
            r2.A0d(r9)
            r6.BcH(r2, r14)
        L_0x04e7:
            int r0 = r13.A06(r12)
            if (r0 != r10) goto L_0x050c
            X.00H r0 = r11.A0m
            java.lang.Object r0 = r0.get()
            X.1kb r0 = (X.C34511kb) r0
            r0.A0L(r12)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "groupmgr/onGroupDelete/deletedParentGroup/jid = "
            r1.append(r0)
            r1.append(r12)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x050c:
            int r1 = r13.A06(r12)
            if (r1 == r15) goto L_0x0565
            r0 = 6
            if (r1 != r0) goto L_0x0120
            X.0ve r2 = r11.A0U
            r1 = 5021(0x139d, float:7.036E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0120
            X.AnonymousClass126.A0B(r11, r12)
            X.1Uh r2 = r11.A0V
            r13.A06(r12)
        L_0x0529:
            r6 = 168(0xa8, float:2.35E-43)
            X.986 r1 = new X.986
            r3 = r1
            r4 = r8
            r5 = r7
            r7 = r25
            r3.<init>((X.C63872tp) r4, (X.C62502rV) r5, (int) r6, (long) r7)
            r1.A0d(r9)
            r0 = 3020(0xbcc, float:4.232E-42)
            r2.BcH(r1, r0)
            return
        L_0x053e:
            if (r1 != r15) goto L_0x0557
            X.0ve r2 = r11.A0U
            r1 = 5021(0x139d, float:7.036E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0120
            X.AnonymousClass126.A0B(r11, r12)
            X.1Uh r2 = r11.A0V
            X.1CJ r0 = r11.A0I
            r0.A06(r12)
            goto L_0x0529
        L_0x0557:
            if (r1 != 0) goto L_0x0120
            X.0ve r2 = r11.A0U
            r1 = 5021(0x139d, float:7.036E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0120
        L_0x0565:
            X.AnonymousClass126.A0B(r11, r12)
            return
        L_0x0569:
            java.lang.String r5 = "demote"
            boolean r5 = X.C29621ca.A07(r1, r5)
            if (r5 == 0) goto L_0x06e3
            X.190 r4 = r3.A00
            r2 = 34
            X.Ali r0 = new X.Ali
            r0.<init>((java.lang.Object) r4, (int) r2)
            java.util.LinkedHashMap r2 = X.A8d.A05(r1, r0)
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0120
            X.126 r5 = r3.A0B
            r0 = 1
            X.2rV r3 = r3.A04(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "groupmgr/onGroupDemoteUsers "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = "/"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1BI r0 = r3.A02
            X.1EC r4 = X.C42941yz.A00(r0)
            if (r4 == 0) goto L_0x29a2
            X.1MZ r9 = r5.A0O
            X.1MW r0 = r9.A08
            X.2tp r8 = r0.A0C(r4)
            X.1CJ r7 = r5.A0I
            int r6 = r7.A06(r4)
            r1 = 3
            r0 = 1
            r10 = 0
            if (r6 == r1) goto L_0x05c6
            r17 = 1
            if (r6 != r0) goto L_0x05c8
        L_0x05c6:
            r17 = 0
        L_0x05c8:
            boolean r16 = r7.A0R(r4)
            X.00H r0 = r5.A19
            java.lang.Object r0 = r0.get()
            X.1fv r0 = (X.C31661fv) r0
            r0.A02(r2)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Set r0 = r2.entrySet()
            java.util.Iterator r15 = r0.iterator()
            r14 = 0
        L_0x05ef:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0640
            java.lang.Object r2 = r15.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r11 = r2.getValue()
            X.2nJ r11 = (X.C60052nJ) r11
            boolean r0 = r11.A00()
            if (r0 == 0) goto L_0x0638
            X.1E2 r2 = r11.A00
            com.whatsapp.jid.UserJid r0 = r11.A02
            r1.add(r0)
        L_0x060e:
            X.2sr r11 = X.AnonymousClass126.A01(r8, r5, r0, r10)
            X.C17960vV.A07(r11)
            X.2sr r10 = X.AnonymousClass126.A01(r8, r5, r2, r10)
            X.11S r13 = r5.A05
            com.whatsapp.jid.UserJid r2 = r11.A04
            boolean r2 = r13.A0O(r2)
            if (r2 == 0) goto L_0x0624
            r14 = 1
        L_0x0624:
            boolean r0 = X.C22971Dz.A0T(r0)
            if (r0 == 0) goto L_0x0634
            r7.add(r11)
        L_0x062d:
            if (r10 == 0) goto L_0x0632
            r7.add(r10)
        L_0x0632:
            r10 = 0
            goto L_0x05ef
        L_0x0634:
            r12.add(r11)
            goto L_0x062d
        L_0x0638:
            java.lang.Object r0 = r2.getKey()
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            r2 = 0
            goto L_0x060e
        L_0x0640:
            if (r16 == 0) goto L_0x068a
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            if (r14 == 0) goto L_0x066f
            X.10f r0 = r8.A0B()
            X.1IZ r10 = r0.iterator()
        L_0x0651:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0680
            java.lang.Object r1 = r10.next()
            X.2sr r1 = (X.C63312sr) r1
            int r0 = r1.A01
            if (r0 != 0) goto L_0x0651
            X.11S r0 = r5.A05
            com.whatsapp.jid.UserJid r1 = r1.A04
            boolean r0 = r0.A0O(r1)
            if (r0 != 0) goto L_0x0651
            r2.add(r1)
            goto L_0x0651
        L_0x066f:
            X.11S r0 = r5.A05
            boolean r0 = r8.A0X(r0)
            if (r0 != 0) goto L_0x0680
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0680
            r2.addAll(r1)
        L_0x0680:
            r9.A0C(r8, r2)
            r9.A0D(r4, r2)
            r5.A0X(r4, r7)
            goto L_0x068d
        L_0x068a:
            r5.A0X(r4, r12)
        L_0x068d:
            if (r14 == 0) goto L_0x27e0
            X.1KB r2 = r5.A04
            r1 = 36
            X.7Qq r0 = new X.7Qq
            r0.<init>(r5, r4, r1)
            r2.A0J(r0)
            X.10I r2 = r5.A0k
            r1 = 37
            X.7Qq r0 = new X.7Qq
            r0.<init>(r5, r4, r1)
            r2.CGF(r0)
            r0 = 1
            if (r6 != r0) goto L_0x06c1
            X.0ve r2 = r5.A0U
            r1 = 8070(0x1f86, float:1.1308E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x06c1
            X.00H r0 = r5.A0t
            java.lang.Object r0 = r0.get()
            com.whatsapp.group.GetSubgroupsManager r0 = (com.whatsapp.group.GetSubgroupsManager) r0
            r0.A05(r4)
        L_0x06c1:
            if (r17 == 0) goto L_0x27e0
            X.1Uh r6 = r5.A0V
            X.1PQ r2 = r5.A0h
            com.whatsapp.jid.UserJid r1 = r3.A03
            X.11S r0 = r5.A05
            r0.A0I()
            com.whatsapp.jid.PhoneUserJid r0 = r0.A0E
            java.util.List r12 = java.util.Collections.singletonList(r0)
            r8 = 0
            r13 = 16
            r7 = r2
            r9 = r4
            r10 = r1
            r11 = r3
            r14 = r25
            X.2Mh r1 = r7.A05(r8, r9, r10, r11, r12, r13, r14)
            goto L_0x0b84
        L_0x06e3:
            java.lang.String r5 = "linked_group_demote"
            boolean r5 = X.C29621ca.A07(r1, r5)
            if (r5 == 0) goto L_0x077a
            X.190 r5 = r3.A00
            r4 = 34
            X.Ali r0 = new X.Ali
            r0.<init>((java.lang.Object) r5, (int) r4)
            java.util.LinkedHashMap r4 = X.A8d.A05(r1, r0)
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x0120
            X.C17960vV.A07(r2)
            X.1CJ r0 = r3.A07
            int r1 = r0.A06(r2)
            r0 = 3
            if (r1 != r0) goto L_0x0120
            X.126 r1 = r3.A0B
            r0 = 0
            X.2rV r5 = r3.A04(r0)
            X.1MZ r0 = r1.A0O
            boolean r0 = r0.A0K(r2)
            if (r0 != 0) goto L_0x0726
            X.11S r0 = r1.A05
            r0.A0I()
            com.whatsapp.jid.PhoneUserJid r0 = r0.A0E
            boolean r0 = r4.containsKey(r0)
            if (r0 == 0) goto L_0x0752
        L_0x0726:
            X.00H r0 = r1.A19
            java.lang.Object r0 = r0.get()
            X.1fv r0 = (X.C31661fv) r0
            r0.A02(r4)
            X.1Uh r8 = r1.A0V
            X.1PQ r7 = r1.A0h
            com.whatsapp.jid.UserJid r6 = r5.A03
            java.util.Set r0 = r4.keySet()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            r10 = 0
            r15 = 82
        L_0x0743:
            r9 = r7
            r11 = r2
            r12 = r6
            r13 = r5
            r14 = r1
            r16 = r25
            X.2Mh r1 = r9.A05(r10, r11, r12, r13, r14, r15, r16)
            r0 = 2
            r8.BcH(r1, r0)
        L_0x0752:
            X.11S r0 = r3.A01
            r0.A0I()
            com.whatsapp.jid.PhoneUserJid r0 = r0.A0E
            boolean r0 = r4.containsKey(r0)
            if (r0 == 0) goto L_0x0120
            X.00H r0 = r3.A0G
            java.lang.Object r0 = r0.get()
            X.1kb r0 = (X.C34511kb) r0
            X.1EC r5 = r0.A05(r2)
            if (r5 == 0) goto L_0x0120
            X.10I r4 = r3.A0F
            r1 = 16
            X.3C5 r0 = new X.3C5
            r0.<init>(r3, r5, r2, r1)
            r4.CGF(r0)
            return
        L_0x077a:
            java.lang.String r5 = "modify"
            boolean r5 = X.C29621ca.A07(r1, r5)
            if (r5 == 0) goto L_0x08eb
            X.190 r5 = r3.A00
            r4 = 34
            X.Ali r2 = new X.Ali
            r2.<init>((java.lang.Object) r5, (int) r4)
            java.util.LinkedHashMap r2 = X.A8d.A05(r1, r2)
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L_0x0120
            java.util.Collection r1 = r2.values()
            java.util.Iterator r1 = r1.iterator()
            java.lang.Object r1 = r1.next()
            X.2nJ r1 = (X.C60052nJ) r1
            com.whatsapp.jid.UserJid r10 = r1.A02
            com.whatsapp.jid.PhoneUserJid r7 = r1.A01
            X.126 r8 = r3.A0B
            r1 = 1
            X.2rV r6 = r3.A04(r1)
            X.C17960vV.A07(r9)
            X.C17960vV.A07(r10)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r1 = "groupmgr/onGroupParticipantChangedNumber "
            r3.append(r1)
            r3.append(r6)
            java.lang.String r1 = "/oldjid:"
            r3.append(r1)
            r3.append(r9)
            java.lang.String r1 = "/newjid:"
            r3.append(r1)
            r3.append(r10)
            java.lang.String r1 = r3.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.00H r1 = r8.A19
            java.lang.Object r1 = r1.get()
            X.1fv r1 = (X.C31661fv) r1
            r1.A02(r2)
            X.1BI r1 = r6.A02
            X.1EC r15 = X.C42941yz.A00(r1)
            X.C17960vV.A07(r15)
            X.1M9 r1 = r8.A08
            X.1E7 r12 = r1.A0G(r15)
            X.1MZ r11 = r8.A0O
            X.1MW r1 = r11.A08
            X.2tp r14 = r1.A0C(r15)
            r1 = 0
            X.2sr r13 = r14.A0D(r9, r1)
            r11.A04(r14, r9)
            X.11S r1 = r8.A05
            boolean r2 = r1.A0O(r10)
            if (r2 == 0) goto L_0x080d
            r11.A04(r14, r10)
        L_0x080d:
            X.1MR r2 = r8.A0S
            java.util.HashSet r4 = r2.A0A(r10)
            r3 = 0
            if (r13 == 0) goto L_0x08e8
            int r2 = r13.A01
        L_0x0818:
            r14.A0P(r10, r4, r2, r3)
            X.1Uv r3 = r8.A0d
            java.util.List r2 = java.util.Collections.singletonList(r9)
            r3.A0W(r15, r2)
            java.util.List r2 = java.util.Collections.singletonList(r9)
            X.AnonymousClass126.A08(r8, r15, r2)
            r5 = 2
            if (r12 == 0) goto L_0x0836
            boolean r2 = r14.A0W(r1)
            if (r2 == 0) goto L_0x0836
            if (r13 != 0) goto L_0x087d
        L_0x0836:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r2 = "groupmgr/onGroupParticipantChangedNumber/sendgetgroupinfo/"
            r4.append(r2)
            r3 = 1
            r2 = 0
            if (r12 != 0) goto L_0x0845
            r2 = 1
        L_0x0845:
            r4.append(r2)
            java.lang.String r2 = "/"
            r4.append(r2)
            boolean r1 = r14.A0W(r1)
            r1 = r1 ^ 1
            r4.append(r1)
            r4.append(r2)
            if (r13 == 0) goto L_0x085c
            r3 = 0
        L_0x085c:
            r4.append(r3)
            java.lang.String r1 = r4.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.12M r2 = r8.A0Z
            java.lang.String r1 = "participant_me_not_included_change_recovery"
            r2.A0H(r15, r1, r5)
            X.1Ui r14 = r8.A0f
            if (r12 != 0) goto L_0x08e5
            r1 = 0
        L_0x0872:
            java.lang.String r16 = "GroupChatManager.onGroupParticipantChangedNumber"
            r19 = 0
            r18 = r5
            r17 = r1
            r14.A03(r15, r16, r17, r18, r19)
        L_0x087d:
            boolean r1 = X.C22971Dz.A0T(r9)
            if (r1 == 0) goto L_0x08dc
            boolean r1 = X.C22971Dz.A0Y(r0)
            if (r1 == 0) goto L_0x08dc
        L_0x0889:
            boolean r1 = X.C22971Dz.A0T(r10)
            if (r1 == 0) goto L_0x08d3
            boolean r1 = X.C22971Dz.A0Y(r7)
            if (r1 == 0) goto L_0x08d3
        L_0x0895:
            X.1CJ r1 = r8.A0I
            int r2 = r1.A06(r15)
            r1 = 3
            if (r2 != r1) goto L_0x08aa
            boolean r1 = r11.A0K(r15)
            if (r1 != 0) goto L_0x08aa
            boolean r1 = r11.A0Q(r15, r10)
            if (r1 == 0) goto L_0x08ce
        L_0x08aa:
            if (r0 == 0) goto L_0x08ce
            if (r7 == 0) goto L_0x08ce
            X.1Uh r9 = r8.A0V
            X.1PQ r10 = r8.A0h
            X.1PP r2 = r10.A02
            r1 = 1
            X.205 r8 = r2.A01(r15, r1)
            r4 = 10
            X.2MN r3 = new X.2MN
            r1 = r25
            r3.<init>(r8, r4, r1)
            X.190 r1 = r10.A00
            r3.A02 = r1
            r3.A01 = r0
            r3.A18(r7)
            r9.BcH(r3, r5)
        L_0x08ce:
            r0 = 0
            X.C62502rV.A00(r0, r6, r0)
            return
        L_0x08d3:
            boolean r1 = X.C22971Dz.A0Y(r10)
            r7 = 0
            if (r1 == 0) goto L_0x0895
            r7 = r10
            goto L_0x0895
        L_0x08dc:
            boolean r0 = X.C22971Dz.A0Y(r9)
            if (r0 != 0) goto L_0x08e3
            r9 = 0
        L_0x08e3:
            r0 = r9
            goto L_0x0889
        L_0x08e5:
            int r1 = r12.A08
            goto L_0x0872
        L_0x08e8:
            r2 = 0
            goto L_0x0818
        L_0x08eb:
            java.lang.String r0 = "promote"
            boolean r0 = X.C29621ca.A07(r1, r0)
            if (r0 == 0) goto L_0x09b1
            X.190 r4 = r3.A00
            r2 = 34
            X.Ali r0 = new X.Ali
            r0.<init>((java.lang.Object) r4, (int) r2)
            java.util.LinkedHashMap r1 = X.A8d.A05(r1, r0)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0120
            X.126 r4 = r3.A0B
            r0 = 1
            X.2rV r3 = r3.A04(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "groupmgr/onGroupPromoteUsers "
            r2.append(r0)
            r2.append(r3)
            java.lang.String r0 = "/"
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1BI r0 = r3.A02
            X.1EC r2 = X.C42941yz.A00(r0)
            if (r2 == 0) goto L_0x29a2
            X.1MZ r0 = r4.A0O
            X.1MW r0 = r0.A08
            X.2tp r9 = r0.A0C(r2)
            X.1CJ r10 = r4.A0I
            int r7 = r10.A06(r2)
            r0 = 3
            r6 = 1
            if (r7 == r0) goto L_0x0946
            r15 = 1
            if (r7 != r6) goto L_0x0947
        L_0x0946:
            r15 = 0
        L_0x0947:
            X.00H r0 = r4.A0y
            java.lang.Object r0 = r0.get()
            X.2mo r0 = (X.C59742mo) r0
            X.1CJ r0 = r0.A02
            boolean r14 = r0.A0R(r2)
            X.00H r0 = r4.A19
            java.lang.Object r0 = r0.get()
            X.1fv r0 = (X.C31661fv) r0
            r0.A02(r1)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Collection r0 = r1.values()
            java.util.Iterator r13 = r0.iterator()
            r12 = 0
        L_0x0973:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x14e9
            java.lang.Object r1 = r13.next()
            X.2nJ r1 = (X.C60052nJ) r1
            com.whatsapp.jid.UserJid r11 = r1.A02
            boolean r0 = r1.A00()
            if (r0 == 0) goto L_0x09af
            X.1E2 r0 = r1.A00
        L_0x0989:
            X.2sr r1 = X.AnonymousClass126.A01(r9, r4, r11, r6)
            if (r14 == 0) goto L_0x0998
            X.2sr r0 = X.AnonymousClass126.A01(r9, r4, r0, r6)
            if (r0 == 0) goto L_0x0998
            r5.add(r0)
        L_0x0998:
            r8.add(r1)
            X.11S r0 = r4.A05
            boolean r0 = r0.A0O(r11)
            if (r0 == 0) goto L_0x0973
            X.1ci r1 = X.AnonymousClass1CJ.A00(r10, r2)
            if (r1 == 0) goto L_0x09ad
            X.1cj r0 = X.C29701cj.ADMIN
            r1.A0c = r0
        L_0x09ad:
            r12 = 1
            goto L_0x0973
        L_0x09af:
            r0 = 0
            goto L_0x0989
        L_0x09b1:
            java.lang.String r0 = "linked_group_promote"
            boolean r0 = X.C29621ca.A07(r1, r0)
            if (r0 == 0) goto L_0x0a22
            X.190 r5 = r3.A00
            r4 = 34
            X.Ali r0 = new X.Ali
            r0.<init>((java.lang.Object) r5, (int) r4)
            java.util.LinkedHashMap r4 = X.A8d.A05(r1, r0)
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x0120
            X.C17960vV.A07(r2)
            X.1CJ r0 = r3.A07
            int r1 = r0.A06(r2)
            r0 = 3
            if (r1 != r0) goto L_0x0120
            X.126 r7 = r3.A0B
            r8 = 0
            X.2rV r5 = r3.A04(r8)
            X.00H r6 = r7.A0m
            java.lang.Object r0 = r6.get()
            X.1kb r0 = (X.C34511kb) r0
            X.1EC r1 = r0.A05(r2)
            if (r1 == 0) goto L_0x0a03
            X.11S r0 = r7.A05
            r0.A0I()
            com.whatsapp.jid.PhoneUserJid r0 = r0.A0E
            boolean r0 = r4.containsKey(r0)
            if (r0 == 0) goto L_0x0a03
            java.lang.Object r0 = r6.get()
            X.1kb r0 = (X.C34511kb) r0
            r0.A0O(r1, r8)
        L_0x0a03:
            X.00H r0 = r7.A19
            java.lang.Object r0 = r0.get()
            X.1fv r0 = (X.C31661fv) r0
            r0.A02(r4)
            X.1Uh r8 = r7.A0V
            X.1PQ r7 = r7.A0h
            com.whatsapp.jid.UserJid r6 = r5.A03
            java.util.Set r0 = r4.keySet()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            r10 = 0
            r15 = 81
            goto L_0x0743
        L_0x0a22:
            java.lang.String r0 = "remove"
            boolean r0 = X.C29621ca.A07(r1, r0)
            if (r0 == 0) goto L_0x0aac
            java.lang.String r0 = "subject"
            r6 = 0
            java.lang.String r22 = r1.A0Q(r0, r6)
            X.190 r5 = r3.A00
            r4 = 34
            X.Ali r0 = new X.Ali
            r0.<init>((java.lang.Object) r5, (int) r4)
            java.util.LinkedHashMap r0 = X.A8d.A05(r1, r0)
            boolean r4 = r0.isEmpty()
            if (r4 != 0) goto L_0x0120
            X.126 r5 = r3.A0B
            X.C17960vV.A07(r2)
            boolean r2 = r5.A0m()
            if (r2 == 0) goto L_0x0120
            java.lang.String r2 = "reason"
            java.lang.String r21 = r1.A0Q(r2, r6)
            r11 = 1
            X.2rV r8 = r3.A04(r11)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = "groupmgr/onGroupRemoveUsers "
            r2.append(r1)
            r2.append(r8)
            java.lang.String r1 = "jids:"
            r2.append(r1)
            java.util.Set r1 = r0.keySet()
            java.lang.Object[] r1 = r1.toArray()
            java.lang.String r1 = java.util.Arrays.deepToString(r1)
            r2.append(r1)
            java.lang.String r1 = "/removedBy:"
            r2.append(r1)
            r2.append(r9)
            java.lang.String r1 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.1BI r1 = r8.A02
            X.1EC r7 = X.C42941yz.A00(r1)
            X.C17960vV.A07(r7)
            boolean r1 = r0.isEmpty()
            r2 = 2
            if (r1 != 0) goto L_0x1590
            boolean r1 = X.AnonymousClass126.A0H(r5, r7, r0)
            if (r1 == 0) goto L_0x1590
            X.C62502rV.A00(r6, r8, r6)
            X.12M r1 = r5.A0Z
            java.lang.String r0 = "lid_limbo"
            r1.A0H(r7, r0, r2)
            return
        L_0x0aac:
            java.lang.String r10 = "subject"
            boolean r0 = X.C29621ca.A07(r1, r10)
            if (r0 == 0) goto L_0x0b2a
            r0 = 0
            java.lang.String r0 = r1.A0Q(r10, r0)
            java.lang.String r5 = "s_t"
            java.lang.String r4 = r1.A0P(r5)
            long r4 = r1.A0E(r4, r5)
            java.lang.Class<com.whatsapp.jid.UserJid> r7 = com.whatsapp.jid.UserJid.class
            java.lang.String r6 = "s_o"
            com.whatsapp.jid.Jid r6 = r1.A0F(r7, r6)
            com.whatsapp.jid.UserJid r6 = (com.whatsapp.jid.UserJid) r6
            boolean r7 = X.C22971Dz.A0T(r6)
            if (r7 == 0) goto L_0x0ae7
            java.lang.Class<com.whatsapp.jid.PhoneUserJid> r8 = com.whatsapp.jid.PhoneUserJid.class
            java.lang.String r7 = "s_o_pn"
            com.whatsapp.jid.Jid r7 = r1.A0F(r8, r7)
            if (r7 == 0) goto L_0x0ae7
            X.126 r8 = r3.A0B
            java.util.Map r7 = java.util.Collections.singletonMap(r6, r7)
            r8.A0i(r7)
        L_0x0ae7:
            if (r2 == 0) goto L_0x2818
            X.1MW r7 = r3.A09
            boolean r7 = r7.A0O(r2)
            if (r7 != 0) goto L_0x2818
            X.1V2 r7 = r3.A08
            boolean r8 = r7.A02(r2, r4)
            if (r8 == 0) goto L_0x2818
            java.lang.Class<X.1EC> r8 = X.AnonymousClass1EC.class
            java.lang.String r6 = "parent_group_jid"
            com.whatsapp.jid.Jid r8 = r1.A0F(r8, r6)
            X.1EC r8 = (X.AnonymousClass1EC) r8
            X.00H r1 = r3.A0G
            java.lang.Object r1 = r1.get()
            X.1kb r1 = (X.C34511kb) r1
            X.1EC r6 = r1.A05(r2)
            if (r8 == 0) goto L_0x2c78
            if (r6 == 0) goto L_0x2c78
            boolean r1 = r8.equals(r6)
            if (r1 != 0) goto L_0x1891
            java.lang.String r0 = "GroupNotificationHandler/handleSubject/received a notification for a subgroup that is not in the local cache"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.12M r2 = r3.A0C
            java.lang.String r1 = "participant_me_not_included_change_recovery"
            r0 = 2
            r2.A0H(r8, r1, r0)
            r2.A0H(r6, r1, r0)
            return
        L_0x0b2a:
            java.lang.String r0 = "invite"
            boolean r5 = X.C29621ca.A07(r1, r0)
            r0 = 1
            if (r5 == 0) goto L_0x0b89
            java.lang.String r4 = "code"
            r2 = 0
            java.lang.String r5 = r1.A0Q(r4, r2)
            X.126 r4 = r3.A0B
            X.2rV r3 = r3.A04(r0)
            X.1BI r0 = r3.A02
            X.C17960vV.A07(r0)
            X.1EC r2 = X.C42941yz.A00(r0)
            if (r2 == 0) goto L_0x299d
            if (r5 == 0) goto L_0x299d
            java.util.Map r0 = r4.A1E
            r0.put(r2, r5)
            X.2cW r1 = new X.2cW
            r1.<init>(r2, r5)
            r0 = 6
            r4.A0O(r0, r1)
            X.1Uh r6 = r4.A0V
            X.1PQ r2 = r4.A0h
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "SystemMessageFactory/newInviteLinkRevokedMessage/stanzaMetadata="
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r11 = 21
            r8 = 0
            r7 = r2
            r9 = r8
            r10 = r3
            r12 = r25
            X.2Mh r1 = r7.A06(r8, r9, r10, r11, r12)
            com.whatsapp.jid.UserJid r0 = r3.A03
            r1.A0d(r0)
        L_0x0b84:
            r0 = 2
            r6.BcH(r1, r0)
            return
        L_0x0b89:
            java.lang.String r12 = "description"
            boolean r5 = X.C29621ca.A07(r1, r12)
            if (r5 == 0) goto L_0x0d2d
            X.1yX r8 = X.A8d.A04(r4, r4)
            com.whatsapp.jid.UserJid r1 = r8.A02
            r20 = r1
            boolean r1 = X.C22971Dz.A0T(r20)
            if (r1 == 0) goto L_0x0bb2
            com.whatsapp.jid.PhoneUserJid r4 = r8.A01
            boolean r1 = X.C22971Dz.A0Y(r4)
            if (r1 == 0) goto L_0x0bb2
            X.126 r2 = r3.A0B
            r1 = r20
            java.util.Map r1 = java.util.Collections.singletonMap(r1, r4)
            r2.A0i(r1)
        L_0x0bb2:
            X.126 r7 = r3.A0B
            X.2rV r9 = r3.A04(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = "groupmgr/onGroupNewDescription "
            r2.append(r1)
            r2.append(r9)
            java.lang.String r1 = "/"
            r2.append(r1)
            r2.append(r8)
            java.lang.String r1 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.1BI r1 = r9.A02
            X.1EC r6 = X.C42941yz.A00(r1)
            X.C17960vV.A07(r6)
            X.1CJ r1 = r7.A0I
            int r1 = r1.A06(r6)
            r19 = 1
            if (r1 != r0) goto L_0x0ca5
            X.1M9 r2 = r7.A08
            X.1E7 r1 = r2.A0G(r6)
            if (r1 == 0) goto L_0x0ca1
            X.1yX r1 = r1.A0M
            if (r1 == 0) goto L_0x0ca1
            java.lang.String r1 = r1.A03
            java.lang.String r11 = r8.A03
            boolean r1 = android.text.TextUtils.equals(r1, r11)
            if (r1 != 0) goto L_0x0d26
            java.lang.String r1 = "groupmgr/onParentGroupNewDescription/changed"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            r2.A0f(r6, r8)
            X.00H r1 = r7.A0n
            java.lang.Object r1 = r1.get()
            X.2l0 r1 = (X.C58632l0) r1
            X.1EC r13 = r1.A00(r6)
            if (r13 == 0) goto L_0x0c99
            X.1R3 r1 = r7.A0Q
            X.206 r10 = r1.A05(r6)
            X.206 r5 = r1.A05(r13)
            if (r10 == 0) goto L_0x29a7
            boolean r1 = r5 instanceof X.C436420i
            if (r1 == 0) goto L_0x29a7
            r12 = r5
            X.20i r12 = (X.C436420i) r12
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS
            long r3 = r8.A00
            long r1 = r1.toMillis(r3)
            long r14 = r12.A0I
            boolean r18 = X.A87.A04(r14, r1)
            long r14 = r12.A0I
            long r1 = r1 - r14
            long r16 = java.lang.Math.abs(r1)
            java.util.concurrent.TimeUnit r14 = java.util.concurrent.TimeUnit.MINUTES
            r1 = 15
            long r14 = r14.toMillis(r1)
            int r1 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            r15 = 0
            if (r1 > 0) goto L_0x0c49
            r15 = 1
        L_0x0c49:
            java.lang.String r1 = r12.A0P()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0c5a
            boolean r1 = android.text.TextUtils.isEmpty(r11)
            r14 = 1
            if (r1 == 0) goto L_0x0c5b
        L_0x0c5a:
            r14 = 0
        L_0x0c5b:
            int r2 = r12.A00
            r1 = 131(0x83, float:1.84E-43)
            if (r2 != r1) goto L_0x0c9e
            X.1BI r2 = r12.A0H()
            if (r2 == 0) goto L_0x0c9e
            r1 = r20
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0c9e
        L_0x0c6f:
            if (r18 == 0) goto L_0x29a7
            if (r15 == 0) goto L_0x29a7
            if (r14 == 0) goto L_0x29a7
            if (r19 == 0) goto L_0x29a7
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            long r0 = r0.toMillis(r3)
            r10.A0I = r0
            r10.A0i(r11)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            long r0 = r0.toMillis(r3)
            r5.A0I = r0
            r5.A0i(r11)
            X.1Uh r1 = r7.A0V
            r0 = 3016(0xbc8, float:4.226E-42)
            r1.BcH(r10, r0)
        L_0x0c94:
            r0 = 3015(0xbc7, float:4.225E-42)
            r7.A0O(r0, r5)
        L_0x0c99:
            r0 = 0
            X.C62502rV.A00(r0, r9, r0)
            return
        L_0x0c9e:
            r19 = 0
            goto L_0x0c6f
        L_0x0ca1:
            java.lang.String r0 = "groupmgr/onParentGroupNewDescription/new community"
            goto L_0x0d28
        L_0x0ca5:
            X.1M9 r1 = r7.A08
            X.1E7 r0 = r1.A0G(r6)
            if (r0 == 0) goto L_0x0d23
            X.1yX r0 = r0.A0M
            java.lang.String r0 = r0.A03
            java.lang.String r4 = r8.A03
            boolean r0 = android.text.TextUtils.equals(r0, r4)
            if (r0 != 0) goto L_0x0d20
            java.lang.String r0 = "groupmgr/onGroupNewDescription/changed"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r1.A0f(r6, r8)
            X.1R3 r0 = r7.A0Q
            X.206 r5 = r0.A05(r6)
            boolean r0 = r5 instanceof X.C436420i
            if (r0 == 0) goto L_0x29d4
            r10 = r5
            X.20i r10 = (X.C436420i) r10
            long r0 = r10.A0I
            long r2 = r8.A00
            long r2 = r2 * r79
            boolean r15 = X.A87.A04(r0, r2)
            long r0 = r10.A0I
            long r11 = r2 - r0
            long r13 = java.lang.Math.abs(r11)
            r11 = 90000(0x15f90, double:4.4466E-319)
            int r0 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            r12 = 0
            if (r0 > 0) goto L_0x0ce9
            r12 = 1
        L_0x0ce9:
            java.lang.String r0 = r10.A0P()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0cfa
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r11 = 1
            if (r0 == 0) goto L_0x0cfb
        L_0x0cfa:
            r11 = 0
        L_0x0cfb:
            int r1 = r10.A00
            r0 = 27
            if (r1 != r0) goto L_0x0d1d
            X.1BI r1 = r10.A0H()
            if (r1 == 0) goto L_0x0d1d
            r0 = r20
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0d1d
        L_0x0d0f:
            if (r15 == 0) goto L_0x29d4
            if (r12 == 0) goto L_0x29d4
            if (r11 == 0) goto L_0x29d4
            if (r19 == 0) goto L_0x29d4
            r5.A0I = r2
            r5.A0X = r4
            goto L_0x0c94
        L_0x0d1d:
            r19 = 0
            goto L_0x0d0f
        L_0x0d20:
            java.lang.String r0 = "groupmgr/onGroupNewSubject/did not change"
            goto L_0x0d28
        L_0x0d23:
            java.lang.String r0 = "groupmgr/onGroupNewDescription/new group"
            goto L_0x0d28
        L_0x0d26:
            java.lang.String r0 = "groupmgr/onParentGroupNewDescription/did not change"
        L_0x0d28:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x0c99
        L_0x0d2d:
            java.lang.String r5 = "locked"
            boolean r5 = X.C29621ca.A07(r1, r5)
            r6 = 0
            if (r5 == 0) goto L_0x0d4c
            X.126 r2 = r3.A0B
            X.2rV r3 = r3.A04(r0)
            java.lang.String r0 = "threshold"
            int r4 = r1.A0A(r0, r6)
            r7 = 1
            r1 = r2
            r2 = r9
            r5 = r25
            r1.A0f(r2, r3, r4, r5, r7)
            return
        L_0x0d4c:
            java.lang.String r5 = "unlocked"
            boolean r5 = X.C29621ca.A07(r1, r5)
            if (r5 == 0) goto L_0x0d64
            X.126 r1 = r3.A0B
            X.2rV r2 = r3.A04(r0)
            r0 = r1
            r1 = r9
            r3 = r6
            r4 = r25
            r0.A0f(r1, r2, r3, r4, r6)
            return
        L_0x0d64:
            java.lang.String r5 = "announcement"
            boolean r5 = X.C29621ca.A07(r1, r5)
            if (r5 == 0) goto L_0x0d72
            X.C17960vV.A07(r2)
        L_0x0d6f:
            monitor-enter(r3)
            goto L_0x29e1
        L_0x0d72:
            java.lang.String r5 = "not_announcement"
            boolean r5 = X.C29621ca.A07(r1, r5)
            if (r5 == 0) goto L_0x0d7f
            X.C17960vV.A07(r2)
            r0 = 0
            goto L_0x0d6f
        L_0x0d7f:
            java.lang.String r5 = "no_frequently_forwarded"
            boolean r5 = X.C29621ca.A07(r1, r5)
            if (r5 == 0) goto L_0x0df3
            X.126 r2 = r3.A0B
            X.2rV r0 = r3.A04(r0)
            r6 = 1
        L_0x0d8e:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r1 = "groupmgr/onGroupNoFrequentlyForwardedToggled "
            r3.append(r1)
            r3.append(r0)
            java.lang.String r1 = "/"
            r3.append(r1)
            r3.append(r6)
            java.lang.String r1 = r3.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.1BI r1 = r0.A02
            X.1EC r4 = X.C42941yz.A00(r1)
            X.C17960vV.A07(r4)
            X.1M9 r5 = r2.A08
            X.1E7 r1 = r5.A0G(r4)
            if (r1 == 0) goto L_0x2ae0
            boolean r1 = r1.A11
            if (r1 == r6) goto L_0x2c3f
            java.lang.String r1 = "groupmgr/onGroupAnnouncementsToggled/changed"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.1E7 r3 = r5.A0H(r4)
            boolean r1 = r3.A11
            if (r1 == r6) goto L_0x0dd8
            r3.A11 = r6
            X.1M2 r1 = r5.A04
            r1.A0R(r3)
            X.1MA r1 = r5.A03
            r1.A0B(r3)
        L_0x0dd8:
            X.1PQ r1 = r2.A0h
            r14 = 54
            if (r6 == 0) goto L_0x0de0
            r14 = 53
        L_0x0de0:
            r11 = 0
            r10 = r1
            r12 = r4
            r13 = r0
            r15 = r25
            X.2Mh r1 = r10.A06(r11, r12, r13, r14, r15)
            r1.A0d(r9)
            r0 = 3016(0xbc8, float:4.226E-42)
            r2.A0O(r0, r1)
            return
        L_0x0df3:
            java.lang.String r5 = "frequently_forwarded_ok"
            boolean r5 = X.C29621ca.A07(r1, r5)
            if (r5 == 0) goto L_0x0e02
            X.126 r2 = r3.A0B
            X.2rV r0 = r3.A04(r0)
            goto L_0x0d8e
        L_0x0e02:
            java.lang.String r5 = "revoke"
            boolean r5 = X.C29621ca.A07(r1, r5)
            if (r5 == 0) goto L_0x0ece
            java.lang.String r2 = "participant"
            java.util.List r1 = r1.A0R(r2)
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.util.Iterator r8 = r1.iterator()
        L_0x0e1e:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x0e57
            java.lang.Object r7 = r8.next()
            X.1ca r7 = (X.C29621ca) r7
            java.lang.Class<com.whatsapp.jid.UserJid> r2 = com.whatsapp.jid.UserJid.class
            java.lang.String r1 = "jid"
            com.whatsapp.jid.Jid r6 = r7.A0F(r2, r1)
            if (r6 == 0) goto L_0x0e1e
            java.lang.Class<com.whatsapp.jid.PhoneUserJid> r2 = com.whatsapp.jid.PhoneUserJid.class
            java.lang.String r1 = "phone_number"
            com.whatsapp.jid.Jid r2 = r7.A0F(r2, r1)
            boolean r1 = X.C22971Dz.A0T(r6)
            if (r1 == 0) goto L_0x0e47
            if (r2 == 0) goto L_0x0e47
            r5.put(r6, r2)
        L_0x0e47:
            java.lang.String r4 = "expiration"
            r1 = r21
            long r1 = r7.A0D(r4, r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r9.put(r6, r1)
            goto L_0x0e1e
        L_0x0e57:
            boolean r1 = r5.isEmpty()
            if (r1 != 0) goto L_0x0e62
            X.126 r1 = r3.A0B
            r1.A0i(r5)
        L_0x0e62:
            X.126 r2 = r3.A0B
            X.2rV r6 = r3.A04(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "groupmgr/onGroupInvitesRevoked "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1BI r0 = r6.A02
            X.1EC r5 = X.C42941yz.A00(r0)
            X.C17960vV.A07(r5)
            com.whatsapp.jid.UserJid r7 = r6.A03
            X.C17960vV.A07(r7)
            X.11S r1 = r2.A05
            boolean r0 = r1.A0O(r7)
            if (r0 == 0) goto L_0x0ea4
            X.1Ux r8 = r2.A0M
            X.10I r0 = r8.A02
            r12 = 25
            X.3Cr r4 = new X.3Cr
            r7 = r4
            r10 = r5
            r11 = r6
            r7.<init>((java.lang.Object) r8, (java.lang.Object) r9, (java.lang.Object) r10, (java.lang.Object) r11, (int) r12)
        L_0x0ea0:
            r0.CGF(r4)
            return
        L_0x0ea4:
            r1.A0I()
            com.whatsapp.jid.PhoneUserJid r1 = r1.A0E
            boolean r0 = r9.containsKey(r1)
            if (r0 == 0) goto L_0x0ec7
            X.1Ux r8 = r2.A0M
            java.lang.Object r0 = r9.get(r1)
            X.C17960vV.A07(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            long r10 = r0.longValue()
            X.10I r0 = r8.A02
            r9 = 4
            X.3CE r4 = new X.3CE
            r4.<init>(r5, r6, r7, r8, r9, r10)
            goto L_0x0ea0
        L_0x0ec7:
            java.lang.String r0 = "GroupChatManager/onGroupInvitesRevoked invalid notification received"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x08ce
        L_0x0ece:
            java.lang.String r5 = "not_ephemeral"
            boolean r5 = X.C29621ca.A07(r1, r5)
            if (r5 == 0) goto L_0x0f7b
            X.0ve r4 = r3.A0A
            r2 = 7141(0x1be5, float:1.0007E-41)
            X.0vf r1 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r1, r4, r2)
            X.126 r4 = r3.A0B
            X.2rV r0 = r3.A04(r0)
            r2 = 0
            if (r1 == 0) goto L_0x0fb8
            r3 = 0
        L_0x0eea:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r1 = "groupmgr/onGroupEphemeralChangedWithTrigger "
            r5.append(r1)
            r5.append(r0)
            java.lang.String r1 = "/"
            r5.append(r1)
            r5.append(r2)
            r5.append(r1)
            r5.append(r6)
            r5.append(r1)
            r5.append(r3)
            java.lang.String r1 = r5.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            if (r2 >= 0) goto L_0x0f15
            r2 = 0
        L_0x0f15:
            X.1BI r1 = r0.A02
            X.1EC r5 = X.C42941yz.A00(r1)
            X.C17960vV.A07(r5)
            X.00H r1 = r4.A0v
            java.lang.Object r7 = r1.get()
            X.2ca r7 = (X.C53472ca) r7
            r1 = 0
            X.C18070vi.A0d(r5, r1)
            X.1M9 r1 = r7.A00
            X.1E7 r1 = r1.A0G(r5)
            if (r1 == 0) goto L_0x2ae8
            int r1 = r1.A04
            if (r1 == r2) goto L_0x2ae4
            java.lang.String r1 = "groupmgr/onGroupEphemeralChanged/changed"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.1CJ r8 = r4.A0I
            X.1ci r7 = X.AnonymousClass1CJ.A00(r8, r5)
            X.1M9 r1 = r4.A08
            r1.A0e(r5, r2)
            if (r7 == 0) goto L_0x0120
            boolean r1 = r7.A0L(r3, r6)
            if (r1 == 0) goto L_0x0f59
            X.00H r1 = r4.A0r
            java.lang.Object r1 = r1.get()
            X.2if r1 = (X.C57182if) r1
            r1.A00(r7)
        L_0x0f59:
            r8.A0K(r7, r5)
            X.1PQ r1 = r4.A0h
            r14 = 56
            r11 = 0
            r10 = r1
            r12 = r5
            r13 = r0
            r15 = r25
            X.2Mh r1 = r10.A06(r11, r12, r13, r14, r15)
            X.2MS r1 = (X.AnonymousClass2MS) r1
            r1.A0d(r9)
            r1.A00 = r2
            r1.A04 = r6
            r1.A0Q = r3
        L_0x0f75:
            r0 = 3017(0xbc9, float:4.228E-42)
        L_0x0f77:
            r4.A0O(r0, r1)
            return
        L_0x0f7b:
            java.lang.String r5 = "ephemeral"
            boolean r5 = X.C29621ca.A07(r1, r5)
            if (r5 == 0) goto L_0x1010
            java.lang.String r4 = "expiration"
            java.lang.String r2 = r1.A0P(r4)
            int r2 = r1.A0B(r2, r4)
            X.0ve r7 = r3.A0A
            r5 = 7141(0x1be5, float:1.0007E-41)
            X.0vf r4 = X.C18040vf.A02
            boolean r4 = X.C18020vd.A05(r4, r7, r5)
            if (r4 == 0) goto L_0x0fb2
            java.lang.String r4 = "trigger"
            int r6 = r1.A0A(r4, r6)
            X.11S r1 = r3.A01
            boolean r1 = r1.A0O(r9)
            X.126 r4 = r3.A0B
            X.2rV r0 = r3.A04(r0)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
            goto L_0x0eea
        L_0x0fb2:
            X.126 r4 = r3.A0B
            X.2rV r0 = r3.A04(r0)
        L_0x0fb8:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r1 = "groupmgr/onGroupEphemeralChanged "
            r3.append(r1)
            r3.append(r0)
            java.lang.String r1 = "/"
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            if (r2 >= 0) goto L_0x0fd7
            r2 = 0
        L_0x0fd7:
            X.1BI r1 = r0.A02
            X.1EC r3 = X.C42941yz.A00(r1)
            X.C17960vV.A07(r3)
            X.00H r1 = r4.A0v
            java.lang.Object r1 = r1.get()
            X.2ca r1 = (X.C53472ca) r1
            X.C18070vi.A0d(r3, r6)
            X.1M9 r1 = r1.A00
            X.1E7 r1 = r1.A0G(r3)
            if (r1 == 0) goto L_0x2ae8
            int r1 = r1.A04
            if (r1 == r2) goto L_0x2ae4
            java.lang.String r1 = "groupmgr/onGroupEphemeralChanged/changed"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.1M9 r1 = r4.A08
            r1.A0e(r3, r2)
            X.1PQ r1 = r4.A0h
            r5 = r1
            r6 = r3
            r7 = r9
            r8 = r0
            r9 = r2
            r10 = r25
            X.2MS r1 = r5.A0C(r6, r7, r8, r9, r10)
            goto L_0x0f75
        L_0x1010:
            java.lang.String r5 = "expire"
            boolean r5 = X.C29621ca.A07(r1, r5)
            if (r5 == 0) goto L_0x105c
            java.lang.String r2 = "timestamp"
            r4 = r21
            long r1 = r1.A0D(r2, r4)
            X.126 r5 = r3.A0B
            X.2rV r6 = r3.A04(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "groupmgr/onGroupExpirationChanged "
            r3.append(r0)
            r3.append(r6)
            java.lang.String r0 = "/"
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            int r0 = (r1 > r21 ? 1 : (r1 == r21 ? 0 : -1))
            if (r0 >= 0) goto L_0x1049
            r1 = 0
        L_0x1049:
            X.1BI r0 = r6.A02
            X.1EC r4 = X.C42941yz.A00(r0)
            if (r4 == 0) goto L_0x08ce
            int r3 = (r1 > r21 ? 1 : (r1 == r21 ? 0 : -1))
            X.0z4 r0 = r5.A0G
            if (r3 != 0) goto L_0x14e4
            r0.A1Q(r4)
            goto L_0x08ce
        L_0x105c:
            java.lang.String r5 = "suspended"
            boolean r5 = X.C29621ca.A07(r1, r5)
            if (r5 == 0) goto L_0x106f
            X.126 r2 = r3.A0B
            X.2rV r1 = r3.A04(r0)
            r2.A0g(r1, r0)
            return
        L_0x106f:
            java.lang.String r5 = "unsuspended"
            boolean r5 = X.C29621ca.A07(r1, r5)
            if (r5 == 0) goto L_0x1082
            X.126 r1 = r3.A0B
            X.2rV r0 = r3.A04(r0)
            r1.A0g(r0, r6)
            return
        L_0x1082:
            java.lang.String r5 = "link"
            boolean r5 = X.C29621ca.A07(r1, r5)
            if (r5 == 0) goto L_0x10d8
            X.C17960vV.A07(r2)
            java.lang.String r4 = "link_type"
            r0 = 0
            java.lang.String r4 = r1.A0Q(r4, r0)
            java.lang.String r0 = "sub_group"
            boolean r0 = r0.equals(r4)
            r7 = 2
            r6 = 1
            if (r0 == 0) goto L_0x1935
            java.util.LinkedHashSet r4 = r3.A02(r1, r7)
            X.126 r1 = r3.A0B
            X.2rV r5 = r3.A04(r6)
            X.00H r0 = r1.A0u
            java.lang.Object r3 = r0.get()
            X.2jS r3 = (X.C57672jS) r3
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            X.1PQ r0 = r3.A02
            X.1PP r0 = r0.A02
            X.205 r11 = r0.A01(r2, r6)
            r12 = 0
            r13 = 110(0x6e, float:1.54E-43)
            X.98N r2 = new X.98N
            r10 = r2
            r14 = r25
            r10.<init>((X.AnonymousClass205) r11, (X.C62502rV) r12, (int) r13, (long) r14)
            r2.A03 = r5
        L_0x10ca:
            r2.A0d(r9)
            r2.A1F(r4)
            X.1Uh r1 = r1.A0V
            r0 = 3010(0xbc2, float:4.218E-42)
            r1.BcH(r2, r0)
            return
        L_0x10d8:
            java.lang.String r5 = "unlink"
            boolean r5 = X.C29621ca.A07(r1, r5)
            if (r5 == 0) goto L_0x1153
            X.C17960vV.A07(r2)
            java.lang.String r0 = "unlink_type"
            r4 = 0
            java.lang.String r6 = r1.A0Q(r0, r4)
            java.lang.String r0 = "unlink_reason"
            java.lang.String r4 = r1.A0Q(r0, r4)
            java.lang.String r0 = "unlink_group"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x1134
            r4 = 1
        L_0x10fd:
            java.lang.String r0 = "sub_group"
            boolean r0 = r0.equals(r6)
            r5 = 2
            r12 = 1
            if (r0 == 0) goto L_0x2b16
            java.util.LinkedHashSet r4 = r3.A02(r1, r5)
            X.126 r1 = r3.A0B
            X.2rV r5 = r3.A04(r12)
            X.00H r0 = r1.A0u
            java.lang.Object r3 = r0.get()
            X.2jS r3 = (X.C57672jS) r3
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            X.1PQ r0 = r3.A02
            X.1PP r0 = r0.A02
            X.205 r11 = r0.A01(r2, r12)
            r12 = 0
            r13 = 111(0x6f, float:1.56E-43)
            X.98O r2 = new X.98O
            r10 = r2
            r14 = r25
            r10.<init>((X.AnonymousClass205) r11, (X.C62502rV) r12, (int) r13, (long) r14)
            r2.A03 = r5
            goto L_0x10ca
        L_0x1134:
            java.lang.String r0 = "deactivate_group"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x113e
            r4 = 4
            goto L_0x10fd
        L_0x113e:
            java.lang.String r0 = "delete_parent"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x1148
            r4 = 2
            goto L_0x10fd
        L_0x1148:
            java.lang.String r0 = "integrity_delete_parent"
            boolean r0 = r0.equals(r4)
            r4 = 0
            if (r0 == 0) goto L_0x10fd
            r4 = 3
            goto L_0x10fd
        L_0x1153:
            java.lang.String r5 = "growth_locked"
            boolean r5 = X.C29621ca.A07(r1, r5)
            if (r5 == 0) goto L_0x116e
            X.A8d r0 = X.A8d.A00
            X.1cn r4 = r0.A09(r4)
            if (r4 == 0) goto L_0x2c58
            X.126 r3 = r3.A0B
            X.C17960vV.A07(r2)
            r0 = r25
            r3.A0c(r2, r4, r0)
            return
        L_0x116e:
            java.lang.String r5 = "growth_unlocked"
            boolean r5 = X.C29621ca.A07(r1, r5)
            if (r5 == 0) goto L_0x118c
            X.126 r4 = r3.A0B
            X.1EC r3 = X.C42941yz.A00(r2)
            X.C17960vV.A07(r3)
            X.1cn r2 = new X.1cn
            r0 = r21
            r2.<init>(r6, r0)
            r0 = r25
            r4.A0c(r3, r2, r0)
            return
        L_0x118c:
            java.lang.String r5 = "membership_approval_mode"
            boolean r5 = X.C29621ca.A07(r1, r5)
            if (r5 == 0) goto L_0x1309
            X.C17960vV.A07(r2)
            java.lang.String r0 = "group_join"
            java.util.List r4 = r1.A0R(r0)
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x0120
            java.lang.Object r4 = r4.get(r6)
            X.1ca r4 = (X.C29621ca) r4
            java.lang.String r0 = "state"
            java.lang.String r4 = r4.A0P(r0)
            java.lang.String r0 = "on"
            boolean r6 = r0.equals(r4)
            java.lang.String r0 = "off"
            boolean r0 = r0.equals(r4)
            if (r6 != 0) goto L_0x11d7
            if (r0 != 0) goto L_0x11d7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "GroupNotificationHandler/handleGroupMembershipApprovalModeChange/incorrect group_join.state="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            X.1UI r1 = new X.1UI
            r1.<init>((java.lang.String) r0)
            throw r1
        L_0x11d7:
            X.1V2 r0 = r3.A08
            X.1V1 r7 = r0.A00
            java.util.Map r8 = r7.A02
            monitor-enter(r8)
            java.lang.Object r0 = r8.get(r2)     // Catch:{ all -> 0x2c6f }
            X.2dq r0 = (X.C54252dq) r0     // Catch:{ all -> 0x2c6f }
            if (r0 != 0) goto L_0x11ea
            X.2dq r0 = X.AnonymousClass1V1.A00(r7, r2)     // Catch:{ all -> 0x2c6f }
        L_0x11ea:
            long r4 = r0.A01     // Catch:{ all -> 0x2c6f }
            monitor-exit(r8)     // Catch:{ all -> 0x2c6f }
            int r0 = (r4 > r25 ? 1 : (r4 == r25 ? 0 : -1))
            if (r0 <= 0) goto L_0x11fe
            X.0ve r5 = r3.A0A
            r4 = 8070(0x1f86, float:1.1308E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r5, r4)
            if (r0 == 0) goto L_0x11fe
            return
        L_0x11fe:
            X.1Cd r0 = r7.A01
            X.1au r5 = r0.A05()
            X.1xA r12 = r5.BD0()     // Catch:{ all -> 0x2c65 }
            android.content.ContentValues r14 = new android.content.ContentValues     // Catch:{ all -> 0x2c5b }
            r14.<init>()     // Catch:{ all -> 0x2c5b }
            java.lang.String r4 = "group_join_request_timestamp"
            java.lang.Long r0 = java.lang.Long.valueOf(r25)     // Catch:{ all -> 0x2c5b }
            r14.put(r4, r0)     // Catch:{ all -> 0x2c5b }
            X.1DL r0 = r7.A00     // Catch:{ all -> 0x2c5b }
            long r10 = r0.A09(r2)     // Catch:{ all -> 0x2c5b }
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x2c5b }
            X.1Ev r13 = r0.A02     // Catch:{ all -> 0x2c5b }
            java.lang.String r15 = "group_notification_version"
            java.lang.String r16 = "group_jid_row_id = ?"
            r4 = 1
            java.lang.String[] r0 = new java.lang.String[r4]     // Catch:{ all -> 0x2c5b }
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x2c5b }
            r8 = 0
            r0[r8] = r10     // Catch:{ all -> 0x2c5b }
            java.lang.String r17 = "UPDATE_GROUP_NOTIFICATION_GROUP_JOIN_REQUEST_TIMESTAMP"
            r18 = r0
            int r0 = r13.A02(r14, r15, r16, r17, r18)     // Catch:{ all -> 0x2c5b }
            if (r0 == r4) goto L_0x1244
            r19 = r25
            r13 = r7
            r14 = r2
            r15 = r25
            r17 = r21
            X.AnonymousClass1V1.A01(r13, r14, r15, r17, r19)     // Catch:{ all -> 0x2c5b }
        L_0x1244:
            r12.A00()     // Catch:{ all -> 0x2c5b }
            r4 = 29
            X.3Bx r0 = new X.3Bx     // Catch:{ all -> 0x2c5b }
            r0.<init>(r7, r2, r4)     // Catch:{ all -> 0x2c5b }
            r5.BJ7(r0)     // Catch:{ all -> 0x2c5b }
            r12.close()     // Catch:{ all -> 0x2c65 }
            r5.close()
            X.00H r0 = r3.A0G
            java.lang.Object r0 = r0.get()
            X.1kb r0 = (X.C34511kb) r0
            X.1EC r0 = r0.A05(r2)
            if (r0 == 0) goto L_0x1289
            X.1MW r0 = r3.A09
            boolean r0 = r0.A0O(r2)
            if (r0 != 0) goto L_0x1289
            X.0ve r5 = r3.A0A
            r4 = 8070(0x1f86, float:1.1308E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r5, r4)
            if (r0 == 0) goto L_0x1289
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            X.1MG r0 = r3.A0D
            boolean r0 = r0.A07(r2, r1)
            if (r0 == 0) goto L_0x0120
            X.1Rg r0 = r3.A0E
            goto L_0x1b74
        L_0x1289:
            java.lang.String r4 = "triggered"
            r0 = 0
            java.lang.String r1 = r1.A0Q(r4, r0)
            java.lang.String r0 = "server"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x129b
            r9 = 0
        L_0x129b:
            X.126 r4 = r3.A0B
            X.1MZ r0 = r4.A0O
            boolean r0 = r0.A0K(r2)
            if (r0 == 0) goto L_0x1306
            java.lang.String r5 = "admin"
        L_0x12a7:
            X.1M9 r3 = r4.A08
            X.1E7 r1 = r3.A0H(r2)
            boolean r0 = r1.A12
            if (r0 == r6) goto L_0x12bd
            r1.A12 = r6
            X.1M2 r0 = r3.A04
            r0.A0R(r1)
            X.1MA r0 = r3.A03
            r0.A0B(r1)
        L_0x12bd:
            if (r6 != 0) goto L_0x12d5
            X.00H r0 = r4.A0z
            java.lang.Object r0 = r0.get()
            X.9u7 r0 = (X.C195899u7) r0
            r0.A01(r2)
            X.00H r0 = r4.A16
            java.lang.Object r0 = r0.get()
            X.9re r0 = (X.C194389re) r0
            r0.A00(r2)
        L_0x12d5:
            X.1PQ r3 = r4.A0h
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "SystemMessageFactory/newGroupMembershipApprovalModeChangeSystemMessage/gjid="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r14 = 85
            if (r6 == 0) goto L_0x12f1
            r14 = 84
        L_0x12f1:
            r11 = 0
            r10 = r3
            r12 = r2
            r13 = r11
            r15 = r25
            X.2Mh r1 = r10.A06(r11, r12, r13, r14, r15)
            X.2MT r1 = (X.AnonymousClass2MT) r1
            r1.A0d(r9)
            r1.A00 = r5
            r0 = 3021(0xbcd, float:4.233E-42)
            goto L_0x0f77
        L_0x1306:
            java.lang.String r5 = "regular"
            goto L_0x12a7
        L_0x1309:
            java.lang.String r5 = "membership_approval_request"
            boolean r5 = X.C29621ca.A07(r1, r5)
            if (r5 == 0) goto L_0x1315
            java.lang.String r0 = "GroupNotificationHandler/handleGroupMembershipApprovalRequest/this client will process newer notification format in handleCreatedGroupMembershipApprovalRequests , ignoring"
            goto L_0x2c91
        L_0x1315:
            java.lang.String r5 = "revoked_membership_requests"
            boolean r5 = X.C29621ca.A07(r1, r5)
            if (r5 == 0) goto L_0x1368
            X.C17960vV.A07(r2)
            X.190 r6 = r3.A00
            r5 = 34
            X.Ali r4 = new X.Ali
            r4.<init>((java.lang.Object) r6, (int) r5)
            java.util.LinkedHashMap r4 = X.A8d.A05(r1, r4)
            X.126 r5 = r3.A0B
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L_0x1340
            X.00H r1 = r5.A19
            java.lang.Object r1 = r1.get()
            X.1fv r1 = (X.C31661fv) r1
            r1.A02(r4)
        L_0x1340:
            X.1MZ r1 = r5.A0O
            boolean r1 = r1.A0K(r2)
            java.util.Set r6 = r4.keySet()
            if (r1 == 0) goto L_0x1b21
            java.util.Iterator r3 = r6.iterator()
        L_0x1350:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0120
            java.lang.Object r1 = r3.next()
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            X.00H r0 = r5.A0z
            java.lang.Object r0 = r0.get()
            X.9u7 r0 = (X.C195899u7) r0
            r0.A02(r2, r1)
            goto L_0x1350
        L_0x1368:
            java.lang.String r5 = "member_add_mode"
            boolean r5 = X.C29621ca.A07(r1, r5)
            if (r5 == 0) goto L_0x13f5
            X.126 r4 = r3.A0B
            X.2rV r3 = r3.A04(r6)
            java.lang.String r2 = r1.A0M()
            java.lang.String r1 = "all_member_add"
            boolean r7 = r1.equals(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = "groupmgr/onGroupMemberAddModeToggled "
            r2.append(r1)
            r2.append(r3)
            java.lang.String r1 = "/"
            r2.append(r1)
            r2.append(r7)
            java.lang.String r1 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.1BI r1 = r3.A02
            X.1EC r5 = X.C42941yz.A00(r1)
            X.C17960vV.A07(r5)
            X.1M9 r6 = r4.A08
            X.1E7 r1 = r6.A0G(r5)
            if (r1 == 0) goto L_0x2c75
            int r1 = r1.A06
            if (r1 == r7) goto L_0x2c72
            java.lang.String r1 = "groupmgr/onGroupMemberAddModeToggled/changed"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.1E7 r2 = r6.A0H(r5)
            r2.A06 = r7
            X.1M2 r1 = r6.A04
            r1.A0R(r2)
            X.1MA r1 = r6.A03
            r1.A0B(r2)
            r2 = 0
            if (r7 != r0) goto L_0x13ca
            r2 = 1
        L_0x13ca:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "SystemMessageFactory/newGroupMemberAddModeModeChangeSystemMessage/gjid="
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r13 = 92
            if (r2 == 0) goto L_0x13e4
            r13 = 91
        L_0x13e4:
            r11 = 0
            X.2Mh r1 = new X.2Mh
            r10 = r1
            r12 = r3
            r14 = r25
            r10.<init>((X.C63872tp) r11, (X.C62502rV) r12, (int) r13, (long) r14)
            r1.A0d(r9)
            r0 = 3022(0xbce, float:4.235E-42)
            goto L_0x0f77
        L_0x13f5:
            java.lang.String r5 = "created_membership_requests"
            boolean r5 = X.C29621ca.A07(r1, r5)
            if (r5 == 0) goto L_0x147b
            java.lang.String r0 = "notify"
            r5 = 0
            java.lang.String r4 = r4.A0Q(r0, r5)
            X.C17960vV.A07(r2)
            java.lang.String r0 = "request_method"
            java.lang.String r6 = r1.A0P(r0)
            java.lang.String r8 = X.C181599Rc.A00(r6)
            if (r8 == 0) goto L_0x2d55
            java.lang.String r0 = "parent_group_jid"
            java.lang.String r6 = r1.A0Q(r0, r5)
            X.1yz r0 = X.AnonymousClass1EC.A01
            X.1EC r16 = r0.A02(r6)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.lang.String r10 = "non_admin_add"
            boolean r0 = r10.equals(r8)
            if (r0 == 0) goto L_0x2c95
            java.lang.String r0 = "requested_user"
            java.util.List r0 = r1.A0R(r0)
            java.util.Iterator r13 = r0.iterator()
        L_0x1436:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x2cb3
            java.lang.Object r12 = r13.next()
            X.1ca r12 = (X.C29621ca) r12
            java.lang.Class<com.whatsapp.jid.UserJid> r6 = com.whatsapp.jid.UserJid.class
            java.lang.String r0 = "jid"
            com.whatsapp.jid.Jid r11 = r12.A0F(r6, r0)
            com.whatsapp.jid.UserJid r11 = (com.whatsapp.jid.UserJid) r11
            java.lang.Class<com.whatsapp.jid.PhoneUserJid> r6 = com.whatsapp.jid.PhoneUserJid.class
            java.lang.String r0 = "phone_number"
            com.whatsapp.jid.Jid r12 = r12.A0F(r6, r0)
            boolean r0 = X.C22971Dz.A0T(r11)
            if (r0 == 0) goto L_0x1465
            if (r12 == 0) goto L_0x1465
            X.126 r6 = r3.A0B
            java.util.Map r0 = java.util.Collections.singletonMap(r11, r12)
            r6.A0i(r0)
        L_0x1465:
            X.C17960vV.A07(r11)
            X.9tC r0 = new X.9tC
            r14 = r0
            r15 = r2
            r17 = r11
            r18 = r9
            r19 = r8
            r20 = r25
            r14.<init>(r15, r16, r17, r18, r19, r20)
            r7.add(r0)
            goto L_0x1436
        L_0x147b:
            java.lang.String r5 = "allow_non_admin_sub_group_creation"
            boolean r5 = X.C29621ca.A07(r1, r5)
            if (r5 != 0) goto L_0x148c
            java.lang.String r5 = "not_allow_non_admin_sub_group_creation"
            boolean r5 = X.C29621ca.A07(r1, r5)
            if (r5 == 0) goto L_0x148f
            r0 = 0
        L_0x148c:
            monitor-enter(r3)
            goto L_0x2d6c
        L_0x148f:
            java.lang.String r5 = "allow_admin_reports"
            boolean r5 = X.C29621ca.A07(r1, r5)
            if (r5 == 0) goto L_0x14d7
            X.C17960vV.A07(r2)
            r5 = 1
        L_0x149b:
            X.126 r4 = r3.A0B
            X.00H r0 = r4.A1A
            java.lang.Object r0 = r0.get()
            X.2kV r0 = (X.C58322kV) r0
            X.0ve r3 = r0.A00
            r1 = 3695(0xe6f, float:5.178E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r3, r1)
            if (r0 == 0) goto L_0x0120
            X.1M9 r3 = r4.A08
            X.1E7 r1 = r3.A0H(r2)
            boolean r0 = r1.A0r
            if (r0 == r5) goto L_0x14c7
            r1.A0r = r5
            X.1M2 r0 = r3.A04
            r0.A0R(r1)
            X.1MA r0 = r3.A03
            r0.A0B(r1)
        L_0x14c7:
            X.1PQ r0 = r4.A0h
            r6 = r0
            r7 = r2
            r8 = r9
            r9 = r25
            r11 = r5
            X.2Mh r1 = r6.A09(r7, r8, r9, r11)
            r0 = 3027(0xbd3, float:4.242E-42)
            goto L_0x0f77
        L_0x14d7:
            java.lang.String r5 = "not_allow_admin_reports"
            boolean r5 = X.C29621ca.A07(r1, r5)
            if (r5 == 0) goto L_0x2da9
            X.C17960vV.A07(r2)
            r5 = 0
            goto L_0x149b
        L_0x14e4:
            r0.A1R(r4, r1)
            goto L_0x08ce
        L_0x14e9:
            if (r14 == 0) goto L_0x14ec
            r8 = r5
        L_0x14ec:
            r4.A0X(r2, r8)
            X.1M9 r0 = r4.A08
            X.1E7 r5 = r0.A0G(r2)
            if (r12 == 0) goto L_0x158b
            X.1KB r8 = r4.A04
            r1 = 35
            X.7Qq r0 = new X.7Qq
            r0.<init>(r4, r2, r1)
            r8.A0J(r0)
            if (r5 == 0) goto L_0x1534
            boolean r0 = r5.A0f
            if (r0 == 0) goto L_0x1534
            int r9 = r9.A06()
            if (r7 == r6) goto L_0x1536
            X.0ve r8 = r4.A0U
            r0 = 934(0x3a6, float:1.309E-42)
            X.0vf r1 = X.C18040vf.A02
            int r0 = X.C18020vd.A00(r1, r8, r0)
            if (r9 < r0) goto L_0x1534
            r0 = 1946(0x79a, float:2.727E-42)
            int r0 = X.C18020vd.A00(r1, r8, r0)
            if (r9 > r0) goto L_0x1534
            X.00H r0 = r4.A1C
            java.lang.Object r1 = r0.get()
            X.2lC r1 = (X.C58752lC) r1
            X.1PP r0 = r1.A01
            X.205 r0 = r0.A01(r2, r6)
            r1.A01(r0)
        L_0x1534:
            if (r7 != r6) goto L_0x154d
        L_0x1536:
            X.0ve r6 = r4.A0U
            r1 = 8070(0x1f86, float:1.1308E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r6, r1)
            if (r0 == 0) goto L_0x154d
            X.00H r0 = r4.A0t
            java.lang.Object r0 = r0.get()
            com.whatsapp.group.GetSubgroupsManager r0 = (com.whatsapp.group.GetSubgroupsManager) r0
            r0.A05(r2)
        L_0x154d:
            if (r15 == 0) goto L_0x158b
            X.1Uh r7 = r4.A0V
            X.1PQ r6 = r4.A0h
            com.whatsapp.jid.UserJid r1 = r3.A03
            X.11S r0 = r4.A05
            r0.A0I()
            com.whatsapp.jid.PhoneUserJid r0 = r0.A0E
            java.util.List r18 = java.util.Collections.singletonList(r0)
            r14 = 0
            r19 = 15
            r13 = r6
            r15 = r2
            r16 = r1
            r17 = r3
            r20 = r25
            X.2Mh r1 = r13.A05(r14, r15, r16, r17, r18, r19, r20)
            r0 = 2
            r7.BcH(r1, r0)
        L_0x1573:
            r0 = 0
            X.C62502rV.A00(r0, r3, r0)
            if (r12 == 0) goto L_0x0120
            if (r5 == 0) goto L_0x0120
            boolean r0 = r5.A12
            if (r0 == 0) goto L_0x0120
            X.00H r0 = r4.A10
            java.lang.Object r0 = r0.get()
            X.2xl r0 = (X.C66182xl) r0
            r0.A00(r2)
            return
        L_0x158b:
            r0 = 5
            r4.A0O(r0, r2)
            goto L_0x1573
        L_0x1590:
            X.1Me r1 = r5.A0A
            r1.A0g(r7)
            X.11S r10 = r5.A05
            r10.A0I()
            com.whatsapp.jid.PhoneUserJid r12 = r10.A0E
            X.C17960vV.A07(r12)
            X.1E2 r3 = r10.A09()
            X.1M9 r1 = r5.A08
            r34 = r1
            X.1E7 r4 = r1.A0G(r7)
            X.00H r1 = r5.A19
            java.lang.Object r1 = r1.get()
            X.1fv r1 = (X.C31661fv) r1
            r1.A02(r0)
            r20 = 1
            if (r9 == 0) goto L_0x15c0
            boolean r1 = r9.equals(r12)
            if (r1 == 0) goto L_0x15cd
        L_0x15c0:
            int r1 = r0.size()
            if (r1 != r11) goto L_0x15cd
            boolean r1 = r0.containsKey(r12)
            r12 = 1
            if (r1 != 0) goto L_0x15ce
        L_0x15cd:
            r12 = 0
        L_0x15ce:
            if (r9 == 0) goto L_0x15d6
            boolean r1 = r9.equals(r3)
            if (r1 == 0) goto L_0x15e3
        L_0x15d6:
            int r1 = r0.size()
            if (r1 != r11) goto L_0x15e3
            boolean r3 = r0.containsKey(r3)
            r1 = 1
            if (r3 != 0) goto L_0x15e4
        L_0x15e3:
            r1 = 0
        L_0x15e4:
            if (r12 != 0) goto L_0x17db
            if (r1 != 0) goto L_0x17db
            if (r4 == 0) goto L_0x17f5
            X.1MZ r13 = r5.A0O
            boolean r1 = r13.A0J(r7)
            if (r1 == 0) goto L_0x17f5
            X.1MW r1 = r13.A08
            r24 = r1
            X.2tp r12 = r1.A0C(r7)
            java.util.Set r1 = r0.keySet()
            boolean r20 = r12.A0Y(r1)
            if (r20 == 0) goto L_0x1607
            r13.A09(r12)
        L_0x1607:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.ArrayList r19 = new java.util.ArrayList
            r19.<init>()
            java.util.ArrayList r18 = new java.util.ArrayList
            r18.<init>()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r17 = r0.iterator()
        L_0x161e:
            boolean r0 = r17.hasNext()
            java.lang.String r1 = "default_sub_group_demote"
            if (r0 == 0) goto L_0x1724
            java.lang.Object r0 = r17.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r15 = r0.getKey()
            com.whatsapp.jid.UserJid r15 = (com.whatsapp.jid.UserJid) r15
            java.lang.Object r2 = r0.getValue()
            X.2nJ r2 = (X.C60052nJ) r2
            X.2sr r0 = r13.A04(r12, r15)
            if (r0 == 0) goto L_0x167b
            r11.add(r15)
            boolean r0 = r10.A0O(r15)
            if (r0 == 0) goto L_0x167b
            X.00H r0 = r5.A0m
            r3 = r0
            java.lang.Object r0 = r0.get()
            X.1kb r0 = (X.C34511kb) r0
            r0.A0I(r7)
            java.lang.Object r0 = r3.get()
            X.1kb r0 = (X.C34511kb) r0
            r0.A0H(r4, r7)
            boolean r0 = X.C22971Dz.A0T(r15)
            if (r0 == 0) goto L_0x167b
            r10.A0I()
            com.whatsapp.jid.PhoneUserJid r0 = r10.A0E
            X.C17960vV.A07(r0)
            X.2sr r0 = r13.A04(r12, r0)
            if (r0 == 0) goto L_0x167b
            r10.A0I()
            com.whatsapp.jid.PhoneUserJid r0 = r10.A0E
            X.C17960vV.A07(r0)
            r11.add(r0)
        L_0x167b:
            X.00H r0 = r5.A0m
            java.lang.Object r0 = r0.get()
            X.1kb r0 = (X.C34511kb) r0
            boolean r0 = r0.A0R(r7)
            if (r0 == 0) goto L_0x169c
            boolean r0 = X.C22971Dz.A0T(r15)
            if (r0 == 0) goto L_0x1720
            com.whatsapp.jid.PhoneUserJid r0 = r2.A01
        L_0x1691:
            if (r0 == 0) goto L_0x169c
            X.2sr r3 = r13.A04(r12, r0)
            if (r3 == 0) goto L_0x169c
            r11.add(r0)
        L_0x169c:
            r0 = r21
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x16ec
            X.00H r0 = r5.A0v
            r0.get()
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            boolean r0 = r2.A00()
            if (r0 == 0) goto L_0x16ec
            java.lang.String r0 = "superadmin"
            java.lang.String r1 = r2.A04
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x16ec
            java.lang.String r0 = "admin"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x16ec
            X.1E2 r0 = r2.A00
            r23 = r0
            X.1MR r1 = r5.A0S
            java.util.HashSet r0 = r1.A0A(r0)
            java.util.HashSet r1 = X.C63872tp.A02(r0)
            X.2sr r16 = new X.2sr
            r0 = 0
            r14 = r1
            r3 = r0
            r1 = r16
            r0 = r23
            r1.<init>((com.whatsapp.jid.UserJid) r0, (java.util.Set) r14, (int) r3, (boolean) r3)
            r0 = r18
            r0.add(r15)
            r1 = r19
            r0 = r16
            r1.add(r0)
        L_0x16ec:
            boolean r0 = r10.A0O(r15)
            if (r0 == 0) goto L_0x161e
            X.10I r1 = r5.A0k
            r32 = 42
            X.3Cr r0 = new X.3Cr
            r27 = r0
            r28 = r5
            r29 = r7
            r30 = r11
            r31 = r4
            r27.<init>((java.lang.Object) r28, (java.lang.Object) r29, (java.lang.Object) r30, (java.lang.Object) r31, (int) r32)
            r1.CGN(r0)
            X.00H r0 = r5.A0z
            java.lang.Object r0 = r0.get()
            X.9u7 r0 = (X.C195899u7) r0
            r0.A01(r7)
            X.00H r0 = r5.A16
            java.lang.Object r0 = r0.get()
            X.9re r0 = (X.C194389re) r0
            r0.A00(r7)
            goto L_0x161e
        L_0x1720:
            X.1E2 r0 = r2.A00
            goto L_0x1691
        L_0x1724:
            r16 = 0
            r0 = r21
            boolean r14 = r1.equals(r0)
            if (r14 == 0) goto L_0x1774
            X.190 r1 = r5.A03
            r0 = r19
            X.C63872tp.A04(r1, r12, r0)
            X.1Cd r0 = r13.A07
            X.1au r12 = r0.A05()
            X.1xA r3 = r12.BD0()     // Catch:{ all -> 0x27f3 }
            java.util.Iterator r2 = r18.iterator()     // Catch:{ all -> 0x27e9 }
        L_0x1743:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x27e9 }
            if (r0 == 0) goto L_0x1755
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x27e9 }
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1     // Catch:{ all -> 0x27e9 }
            r0 = r24
            r0.A0P(r7, r1)     // Catch:{ all -> 0x27e9 }
            goto L_0x1743
        L_0x1755:
            java.util.Iterator r2 = r19.iterator()     // Catch:{ all -> 0x27e9 }
        L_0x1759:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x27e9 }
            if (r0 == 0) goto L_0x176b
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x27e9 }
            X.2sr r1 = (X.C63312sr) r1     // Catch:{ all -> 0x27e9 }
            r0 = r24
            r0.A0I(r1, r7)     // Catch:{ all -> 0x27e9 }
            goto L_0x1759
        L_0x176b:
            r3.A00()     // Catch:{ all -> 0x27e9 }
            r3.close()     // Catch:{ all -> 0x27f3 }
            r12.close()
        L_0x1774:
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L_0x1782
            X.1Uv r0 = r5.A0d
            r0.A0W(r7, r11)
            X.AnonymousClass126.A08(r5, r7, r11)
        L_0x1782:
            X.00H r0 = r5.A0n
            java.lang.Object r0 = r0.get()
            X.2l0 r0 = (X.C58632l0) r0
            java.util.List r1 = r0.A01(r7, r11)
            r2 = 7
            if (r9 == 0) goto L_0x17b3
            boolean r0 = r1.contains(r9)
            if (r0 == 0) goto L_0x17b3
            r1.remove(r9)
            X.1PQ r0 = r5.A0h
            r31 = 5
            r27 = r0
            r28 = r7
            r29 = r9
            r30 = r8
            r32 = r25
            X.2Mh r3 = r27.A08(r28, r29, r30, r31, r32)
            X.1Uh r0 = r5.A0V
            r0.BcH(r3, r2)
            r16 = 1
        L_0x17b3:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x1811
            if (r14 == 0) goto L_0x17d4
            r17 = 94
        L_0x17bd:
            X.1PQ r0 = r5.A0h
            r11 = r0
            r12 = r6
            r13 = r7
            r14 = r9
            r15 = r8
            r16 = r1
            r18 = r25
            X.2Mh r1 = r11.A05(r12, r13, r14, r15, r16, r17, r18)
            X.1Uh r0 = r5.A0V
            r0.BcH(r1, r2)
            r16 = 1
            goto L_0x1811
        L_0x17d4:
            r17 = 14
            if (r9 != 0) goto L_0x17bd
            r17 = 13
            goto L_0x17bd
        L_0x17db:
            r16 = 0
            java.lang.String r0 = "groupmgr/onGroupRemoveUsers/me leaving"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.List r0 = java.util.Collections.singletonList(r7)
            r5.A0h(r0, r11)
            X.00H r0 = r5.A0m
            java.lang.Object r0 = r0.get()
            X.1kb r0 = (X.C34511kb) r0
            r0.A0H(r4, r7)
            goto L_0x1811
        L_0x17f5:
            r16 = 0
            java.lang.String r0 = "groupmgr/onGroupRemoveUsers/requerygroupinfo"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.12M r1 = r5.A0Z
            java.lang.String r0 = "participant_me_not_included_change_recovery"
            r1.A0H(r7, r0, r2)
            X.1Ui r1 = r5.A0f
            if (r4 != 0) goto L_0x188d
            r0 = 0
        L_0x1808:
            java.lang.String r13 = "GroupChatManager.onGroupRemoveUsers"
            r11 = r1
            r12 = r7
            r14 = r0
            r15 = r2
            r11.A03(r12, r13, r14, r15, r16)
        L_0x1811:
            r3 = r16 ^ 1
            if (r20 == 0) goto L_0x1887
            X.1MZ r0 = r5.A0O
            boolean r0 = r0.A0I(r7)
            if (r0 == 0) goto L_0x1881
            X.1yJ r2 = r10.A08()
        L_0x1821:
            X.C17960vV.A07(r2)
            com.whatsapp.jid.DeviceJid r2 = (com.whatsapp.jid.DeviceJid) r2
            X.1P3 r0 = r5.A0H
            boolean r0 = r0.A0Y()
            if (r0 == 0) goto L_0x1868
            X.AnonymousClass126.A09(r5, r2, r7, r8, r3)
        L_0x1831:
            if (r4 == 0) goto L_0x0120
            boolean r0 = android.text.TextUtils.isEmpty(r22)
            if (r0 != 0) goto L_0x0120
            java.lang.String r0 = r4.A0K()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0120
            java.lang.String r0 = "groupmgr/onGroupRemoveUsers/subjectchanged"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = r34
            X.1E7 r1 = r0.A0H(r7)
            r0 = r22
            r1.A0R = r0
            r0 = r34
            X.1M2 r0 = r0.A04
            r0.A0R(r1)
            r0 = r34
            X.1MA r0 = r0.A03
            r0.A0B(r1)
            X.1NI r1 = r5.A0L
            r0 = r22
            r1.A03(r7, r0)
            return
        L_0x1868:
            X.00H r0 = r5.A1B
            java.lang.Object r1 = r0.get()
            X.1Ot r1 = (X.C25581Ot) r1
            r14 = 14
            X.Ak4 r0 = new X.Ak4
            r9 = r0
            r10 = r5
            r11 = r8
            r12 = r7
            r13 = r2
            r15 = r3
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r1.A00(r0)
            goto L_0x1831
        L_0x1881:
            r10.A0I()
            X.1E3 r2 = r10.A02
            goto L_0x1821
        L_0x1887:
            if (r3 == 0) goto L_0x1831
            X.C62502rV.A00(r6, r8, r6)
            goto L_0x1831
        L_0x188d:
            int r0 = r4.A08
            goto L_0x1808
        L_0x1891:
            X.1MG r6 = r3.A0D
            long r79 = r79 * r4
            java.lang.Long r9 = java.lang.Long.valueOf(r79)
            r6.A04()
            X.1MF r1 = r6.A00
            r14 = 0
            X.1Lt r1 = r1.A00     // Catch:{ SQLiteDatabaseCorruptException | Error | RuntimeException -> 0x2813 }
            X.1au r13 = r1.A06()     // Catch:{ SQLiteDatabaseCorruptException | Error | RuntimeException -> 0x2813 }
            X.1xA r12 = r13.BD0()     // Catch:{ all -> 0x2809 }
            java.lang.String r11 = r2.getRawString()     // Catch:{ all -> 0x27ff }
            r1 = 2
            android.content.ContentValues r8 = new android.content.ContentValues     // Catch:{ all -> 0x27ff }
            r8.<init>(r1)     // Catch:{ all -> 0x27ff }
            r8.put(r10, r0)     // Catch:{ all -> 0x27ff }
            java.lang.String r1 = "subject_ts"
            r8.put(r1, r9)     // Catch:{ all -> 0x27ff }
            r1 = r13
            X.1av r1 = (X.C28801av) r1     // Catch:{ all -> 0x27ff }
            X.1Ev r9 = r1.A02     // Catch:{ all -> 0x27ff }
            java.lang.String r16 = "subgroup_info"
            java.lang.String r17 = "subgroup_raw_jid = ?"
            r1 = 1
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch:{ all -> 0x27ff }
            r1[r14] = r11     // Catch:{ all -> 0x27ff }
            java.lang.String r18 = "subgroup_info.updateSubgroupSubjectState"
            r14 = r9
            r15 = r8
            r19 = r1
            int r1 = r14.A02(r15, r16, r17, r18, r19)     // Catch:{ all -> 0x27ff }
            if (r1 != 0) goto L_0x18ef
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x27ff }
            r1.<init>()     // Catch:{ all -> 0x27ff }
            java.lang.String r0 = "SubgroupStore/setGroupMembershipApprovalState/Subgroup entry doesn't exist for"
            r1.append(r0)     // Catch:{ all -> 0x27ff }
            r1.append(r2)     // Catch:{ all -> 0x27ff }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x27ff }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x27ff }
            goto L_0x27f8
        L_0x18ef:
            r12.A00()     // Catch:{ all -> 0x27ff }
            r12.close()     // Catch:{ all -> 0x2809 }
            r13.close()     // Catch:{ SQLiteDatabaseCorruptException | Error | RuntimeException -> 0x2813 }
            X.0yx r1 = X.AnonymousClass1MG.A00(r6, r2)
            if (r1 == 0) goto L_0x0120
            java.lang.Object r6 = r1.A00
            X.2pm r6 = (X.C61492pm) r6
            if (r6 == 0) goto L_0x0120
            java.lang.Object r1 = r1.A01
            X.A2B r1 = (X.A2B) r1
            if (r1 == 0) goto L_0x0120
            java.util.Set r10 = r6.A02
            int r9 = r1.A00
            java.lang.Integer r8 = r1.A03
            java.lang.Long r6 = r1.A05
            r1 = 2
            X.C18070vi.A0d(r0, r1)
            r75 = 0
            X.A2B r1 = new X.A2B
            r74 = r8
            r76 = r6
            r77 = r0
            r78 = r9
            r72 = r1
            r73 = r2
            r72.<init>(r73, r74, r75, r76, r77, r78, r79)
            r10.add(r1)
            X.1Rg r0 = r3.A0E
            r0.A00(r2)
            r7.A01(r2, r4)
            return
        L_0x1935:
            java.lang.String r0 = "parent_group"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x197e
            java.util.LinkedHashSet r8 = r3.A02(r1, r6)
            X.126 r4 = r3.A0B
            X.2rV r0 = r3.A04(r6)
            int r1 = r8.size()
            if (r1 != r6) goto L_0x2c44
            java.util.List r1 = java.util.Collections.singletonList(r2)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r3 = r1.iterator()
        L_0x195a:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x2aec
            java.lang.Object r2 = r3.next()
            com.whatsapp.jid.GroupJid r2 = (com.whatsapp.jid.GroupJid) r2
            X.1CJ r1 = r4.A0I
            java.lang.String r12 = r1.A0F(r2)
            if (r12 != 0) goto L_0x1970
            java.lang.String r12 = ""
        L_0x1970:
            X.A2B r1 = new X.A2B
            r10 = r1
            r11 = r2
            r13 = r7
            r14 = r21
            r10.<init>(r11, r12, r13, r14)
            r5.add(r1)
            goto L_0x195a
        L_0x197e:
            java.lang.String r0 = "sibling_group"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x3487
            java.util.LinkedHashSet r4 = new java.util.LinkedHashSet
            r4.<init>()
            java.lang.String r8 = "group"
            java.util.List r0 = r1.A0R(r8)
            java.util.Iterator r11 = r0.iterator()
        L_0x1996:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x19bb
            java.lang.Object r5 = r11.next()
            X.1ca r5 = (X.C29621ca) r5
            X.A2B r10 = A01(r5, r7)
            if (r10 == 0) goto L_0x1996
            java.lang.String r0 = "hidden_group"
            X.1ca r0 = r5.A0K(r0)
            r5 = 0
            if (r0 == 0) goto L_0x19b2
            r5 = 1
        L_0x19b2:
            X.2lc r0 = new X.2lc
            r0.<init>(r10, r5)
            r4.add(r0)
            goto L_0x1996
        L_0x19bb:
            int r0 = r4.size()
            r13 = 0
            if (r0 != r6) goto L_0x19f9
            X.0ve r7 = r3.A0A
            X.0vf r5 = X.C18040vf.A01
            r0 = 3864(0xf18, float:5.415E-42)
            boolean r0 = X.C18020vd.A05(r5, r7, r0)
            if (r0 == 0) goto L_0x19f9
            java.util.List r1 = r1.A0R(r8)
            int r0 = r1.size()
            if (r0 != r6) goto L_0x19f9
            java.util.Iterator r1 = r1.iterator()
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x19f9
            java.lang.Object r5 = r1.next()
            X.1ca r5 = (X.C29621ca) r5
            java.lang.String r1 = "breakout"
            r0 = 0
            java.lang.String r1 = r5.A0Q(r1, r0)
            java.lang.String r0 = "true"
            boolean r0 = X.AnonymousClass026.A00(r1, r0)
            if (r0 == 0) goto L_0x19f9
            r13 = 1
        L_0x19f9:
            X.126 r5 = r3.A0B
            X.2rV r0 = r3.A04(r6)
            java.lang.String r1 = "groupmgr/onLinkingToCommunityDefaultGroup/"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            r1 = 10
            int r1 = X.C29351c6.A0C(r4, r1)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r1)
            java.util.Iterator r3 = r4.iterator()
        L_0x1a13:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x1a25
            java.lang.Object r1 = r3.next()
            X.2lc r1 = (X.C59012lc) r1
            X.A2B r1 = r1.A00
            r6.add(r1)
            goto L_0x1a13
        L_0x1a25:
            java.util.Set r8 = X.C29431cG.A12(r6)
            java.lang.Integer r12 = X.AnonymousClass00R.A0C
            X.00H r10 = r5.A0m
            java.lang.Object r1 = r10.get()
            X.1kb r1 = (X.C34511kb) r1
            X.1EC r11 = r1.A05(r2)
            if (r11 != 0) goto L_0x1b05
            X.190 r7 = r5.A03
            java.lang.String r6 = "Could not find parent group to link"
            r3 = 1
            java.lang.String r1 = "groupChatManager/nullParent"
            r7.A0G(r1, r6, r3)
        L_0x1a43:
            boolean r1 = r8.isEmpty()
            if (r1 != 0) goto L_0x2c44
            X.0ve r6 = r5.A0U
            X.0vf r3 = X.C18040vf.A01
            r1 = 3864(0xf18, float:5.415E-42)
            boolean r1 = X.C18020vd.A05(r3, r6, r1)
            if (r1 == 0) goto L_0x1ad4
            if (r13 == 0) goto L_0x1ad4
            java.lang.Object r1 = r10.get()
            X.1kb r1 = (X.C34511kb) r1
            X.1EC r1 = r1.A05(r2)
            if (r1 == 0) goto L_0x1ad4
            int r3 = r8.size()
            r1 = 1
            if (r3 != r1) goto L_0x1ad4
            java.util.Iterator r1 = r8.iterator()
            java.lang.Object r7 = r1.next()
            X.A2B r7 = (X.A2B) r7
            X.1PQ r6 = r5.A0h
            java.lang.Object r1 = r10.get()
            X.1kb r1 = (X.C34511kb) r1
            X.1EC r3 = r1.A05(r2)
            com.whatsapp.jid.GroupJid r8 = r7.A02
            java.lang.String r7 = r7.A06
            X.1PP r6 = r6.A02
            r1 = 1
            X.205 r11 = r6.A01(r2, r1)
            r13 = 139(0x8b, float:1.95E-43)
            X.97u r6 = new X.97u
            r10 = r6
            r12 = r0
            r14 = r25
            r10.<init>((X.AnonymousClass205) r11, (X.C62502rV) r12, (int) r13, (long) r14)
            r0 = 2
            r6.A00 = r0
            java.lang.String r0 = ""
            r6.A1F(r3, r0)
            java.util.List r3 = r6.A00
            r2 = 2
            r1 = 0
            X.2md r0 = new X.2md
            r0.<init>(r8, r7, r2, r1)
            r3.add(r0)
            r6.A0d(r9)
            X.1Uh r0 = r5.A0V
            r0.BcH(r6, r2)
        L_0x1ab2:
            java.util.Iterator r4 = r4.iterator()
        L_0x1ab6:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0120
            java.lang.Object r3 = r4.next()
            X.2lc r3 = (X.C59012lc) r3
            X.A2B r0 = r3.A00
            com.whatsapp.jid.GroupJid r0 = r0.A02
            X.1EC r2 = X.C42941yz.A00(r0)
            if (r2 == 0) goto L_0x1ab6
            X.1M9 r1 = r5.A08
            boolean r0 = r3.A01
            r1.A0d(r2, r0)
            goto L_0x1ab6
        L_0x1ad4:
            X.1Uh r7 = r5.A0V
            java.lang.Object r1 = r10.get()
            X.1kb r1 = (X.C34511kb) r1
            X.1EC r6 = r1.A05(r2)
            X.1PQ r1 = r5.A0h
            X.1PP r3 = r1.A02
            r1 = 1
            X.205 r11 = r3.A01(r2, r1)
            r12 = 0
            r13 = 108(0x6c, float:1.51E-43)
            X.98L r1 = new X.98L
            r10 = r1
            r14 = r25
            r10.<init>((X.AnonymousClass205) r11, (X.C62502rV) r12, (int) r13, (long) r14)
            r1.A03 = r0
            r1.A0d(r9)
            r1.A1F(r6)
            r1.A1G(r8)
            r0 = 3011(0xbc3, float:4.22E-42)
            r7.BcH(r1, r0)
            goto L_0x1ab2
        L_0x1b05:
            java.lang.Object r7 = r10.get()
            X.1kb r7 = (X.C34511kb) r7
            java.util.Iterator r6 = r8.iterator()
        L_0x1b0f:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x1a43
            java.lang.Object r3 = r6.next()
            X.A2B r3 = (X.A2B) r3
            X.1MG r1 = r7.A08
            r1.A05(r3, r11, r12)
            goto L_0x1b0f
        L_0x1b21:
            java.util.Iterator r4 = r6.iterator()
        L_0x1b25:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x1b3d
            java.lang.Object r3 = r4.next()
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3
            X.00H r1 = r5.A16
            java.lang.Object r1 = r1.get()
            X.9re r1 = (X.C194389re) r1
            r1.A01(r2, r3)
            goto L_0x1b25
        L_0x1b3d:
            X.A2B r1 = X.AnonymousClass126.A02(r5, r2)
            if (r1 == 0) goto L_0x0120
            X.0ve r4 = r5.A0U
            r3 = 8070(0x1f86, float:1.1308E-41)
            X.0vf r1 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r1, r4, r3)
            if (r1 == 0) goto L_0x0120
            X.11S r3 = r5.A05
            X.1E2 r1 = r3.A09()
            boolean r1 = r6.contains(r1)
            if (r1 != 0) goto L_0x1b66
            r3.A0I()
            com.whatsapp.jid.PhoneUserJid r1 = r3.A0E
            boolean r1 = r6.contains(r1)
            if (r1 == 0) goto L_0x0120
        L_0x1b66:
            X.1MG r1 = r5.A0a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r1.A07(r2, r0)
            if (r0 == 0) goto L_0x0120
            X.1Rg r0 = r5.A0b
        L_0x1b74:
            r0.A00(r2)
            return
        L_0x1b78:
            r0 = 0
            goto L_0x002f
        L_0x1b7b:
            r1 = move-exception
            r17.close()     // Catch:{ all -> 0x1b80 }
            goto L_0x1b84
        L_0x1b80:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x1b85 }
        L_0x1b84:
            throw r1     // Catch:{ all -> 0x1b85 }
        L_0x1b85:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x2c6a }
            throw r1
        L_0x1b8a:
            java.lang.String r2 = "id"
            r7 = 0
            java.lang.String r2 = r0.A0Q(r2, r7)     // Catch:{ 11T -> 0x26d9 }
            X.C17960vV.A07(r2)     // Catch:{ 11T -> 0x26d9 }
            X.1EC r6 = X.C22971Dz.A02(r2)     // Catch:{ 11T -> 0x26d9 }
            X.C17960vV.A07(r6)     // Catch:{ 11T -> 0x26d9 }
            java.lang.Class<com.whatsapp.jid.UserJid> r4 = com.whatsapp.jid.UserJid.class
            java.lang.String r2 = "creator"
            com.whatsapp.jid.Jid r34 = r0.A0F(r4, r2)     // Catch:{ 11T -> 0x26d9 }
            r2 = r34
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2     // Catch:{ 11T -> 0x26d9 }
            r34 = r2
            java.lang.String r2 = "creation"
            java.lang.String r2 = r0.A0Q(r2, r7)     // Catch:{ 11T -> 0x26d9 }
            r4 = r21
            long r27 = X.C20099A7c.A04(r2, r4)     // Catch:{ 11T -> 0x26d9 }
            long r27 = r27 * r79
            X.126 r2 = r3.A0B     // Catch:{ 11T -> 0x26d9 }
            r4 = r34
            r2.A0e(r4, r0)     // Catch:{ 11T -> 0x26d9 }
            java.lang.String r4 = "reason"
            java.lang.String r46 = r1.A0Q(r4, r7)     // Catch:{ 11T -> 0x26d9 }
            java.lang.String r4 = "key"
            java.lang.String r10 = r1.A0Q(r4, r7)     // Catch:{ 11T -> 0x26d9 }
            java.lang.String r4 = "new"
            boolean r33 = r4.equalsIgnoreCase(r8)     // Catch:{ 11T -> 0x26d9 }
            java.lang.String r4 = "subject"
            java.lang.String r31 = r0.A0Q(r4, r7)     // Catch:{ 11T -> 0x26d9 }
            java.lang.String r4 = "s_t"
            java.lang.String r8 = r0.A0Q(r4, r7)     // Catch:{ 11T -> 0x26d9 }
            r4 = r21
            long r19 = X.C20099A7c.A04(r8, r4)     // Catch:{ 11T -> 0x26d9 }
            long r19 = r19 * r79
            java.lang.String r8 = "a_v_id"
            long r48 = r0.A0D(r8, r4)     // Catch:{ 11T -> 0x26d9 }
            java.lang.String r4 = "ack"
            java.lang.String r5 = r0.A0Q(r4, r7)     // Catch:{ 11T -> 0x26d9 }
            if (r5 == 0) goto L_0x1bfd
            java.lang.String r4 = "false"
            boolean r4 = r5.equals(r4)     // Catch:{ 11T -> 0x26d9 }
            r35 = 0
            if (r4 != 0) goto L_0x1bff
        L_0x1bfd:
            r35 = 1
        L_0x1bff:
            X.190 r7 = r3.A00     // Catch:{ 11T -> 0x26d9 }
            r5 = 34
            X.Ali r4 = new X.Ali     // Catch:{ 11T -> 0x26d9 }
            r4.<init>((java.lang.Object) r7, (int) r5)     // Catch:{ 11T -> 0x26d9 }
            java.util.LinkedHashMap r42 = X.A8d.A05(r0, r4)     // Catch:{ 11T -> 0x26d9 }
            X.A8d r5 = X.A8d.A00     // Catch:{ 11T -> 0x26d9 }
            int r29 = X.A8d.A00(r0)     // Catch:{ 11T -> 0x26d9 }
            r8 = 0
            r32 = 0
            java.lang.String r4 = "ephemeral"
            X.1ca r7 = r0.A0K(r4)     // Catch:{ Exception -> 0x1c25 }
            if (r7 == 0) goto L_0x1c3e
            java.lang.String r4 = "trigger"
            int r32 = r7.A0A(r4, r8)     // Catch:{ Exception -> 0x1c25 }
            goto L_0x1c3e
        L_0x1c25:
            r7 = move-exception
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ 11T -> 0x26d9 }
            r8.<init>()     // Catch:{ 11T -> 0x26d9 }
            java.lang.String r4 = "GroupProtocolTreeNodeHelper/getEphemeralTrigger "
            r8.append(r4)     // Catch:{ 11T -> 0x26d9 }
            java.lang.String r4 = r7.getMessage()     // Catch:{ 11T -> 0x26d9 }
            r8.append(r4)     // Catch:{ 11T -> 0x26d9 }
            java.lang.String r4 = r8.toString()     // Catch:{ 11T -> 0x26d9 }
            com.whatsapp.util.Log.e(r4, r7)     // Catch:{ 11T -> 0x26d9 }
        L_0x1c3e:
            X.1cn r83 = r5.A09(r0)     // Catch:{ 11T -> 0x26d9 }
            java.lang.String r7 = "size"
            java.lang.String r4 = "0"
            java.lang.String r4 = r0.A0Q(r7, r4)     // Catch:{ 11T -> 0x26d9 }
            X.C17960vV.A07(r4)     // Catch:{ 11T -> 0x26d9 }
            int r7 = java.lang.Integer.parseInt(r4)     // Catch:{ 11T -> 0x26d9 }
            r9 = 1
            X.2rV r45 = r3.A04(r9)     // Catch:{ 11T -> 0x26d9 }
            java.lang.String r4 = "description"
            X.1ca r4 = r0.A0K(r4)     // Catch:{ 11T -> 0x26d9 }
            X.1yX r56 = X.A8d.A04(r0, r4)     // Catch:{ 11T -> 0x26d9 }
            java.lang.String r4 = "support"
            X.1ca r4 = r0.A0K(r4)     // Catch:{ 11T -> 0x26d9 }
            r13 = 0
            if (r4 == 0) goto L_0x1c6c
            r13 = 1
        L_0x1c6c:
            java.lang.String r4 = "locked"
            X.1ca r4 = r0.A0K(r4)     // Catch:{ 11T -> 0x26d9 }
            r15 = 0
            if (r4 == 0) goto L_0x1c76
            r15 = 1
        L_0x1c76:
            java.lang.String r4 = "announcement"
            X.1ca r4 = r0.A0K(r4)     // Catch:{ 11T -> 0x26d9 }
            r47 = 0
            if (r4 == 0) goto L_0x1c82
            r47 = 1
        L_0x1c82:
            java.lang.String r4 = "no_frequently_forwarded"
            X.1ca r4 = r0.A0K(r4)     // Catch:{ 11T -> 0x26d9 }
            r71 = 0
            if (r4 == 0) goto L_0x1c8e
            r71 = 1
        L_0x1c8e:
            java.lang.String r4 = "suspended"
            X.1ca r4 = r0.A0K(r4)     // Catch:{ 11T -> 0x26d9 }
            r72 = 0
            if (r4 == 0) goto L_0x1c9b
            r72 = 1
        L_0x1c9b:
            int r4 = r42.size()     // Catch:{ 11T -> 0x26d9 }
            int r54 = java.lang.Math.max(r7, r4)     // Catch:{ 11T -> 0x26d9 }
            int r44 = X.A8d.A02(r0)     // Catch:{ 11T -> 0x26d9 }
            X.1EC r4 = X.A8d.A03(r0)     // Catch:{ 11T -> 0x26d9 }
            java.lang.String r7 = "incognito"
            X.1ca r7 = r0.A0K(r7)     // Catch:{ 11T -> 0x26d9 }
            r12 = 0
            if (r7 == 0) goto L_0x1cb5
            r12 = 1
        L_0x1cb5:
            boolean r37 = X.A8d.A06(r0)     // Catch:{ 11T -> 0x26d9 }
            int r52 = r5.A07(r0)     // Catch:{ 11T -> 0x26d9 }
            int r55 = X.A8d.A01(r0)     // Catch:{ 11T -> 0x26d9 }
            java.lang.Class<com.whatsapp.jid.GroupJid> r7 = com.whatsapp.jid.GroupJid.class
            java.lang.String r5 = "context_group_jid"
            com.whatsapp.jid.Jid r30 = r1.A0F(r7, r5)     // Catch:{ 11T -> 0x26d9 }
            r1 = r30
            com.whatsapp.jid.GroupJid r1 = (com.whatsapp.jid.GroupJid) r1     // Catch:{ 11T -> 0x26d9 }
            r30 = r1
            java.lang.String r1 = "allow_admin_reports"
            X.1ca r1 = r0.A0K(r1)     // Catch:{ 11T -> 0x26d9 }
            r75 = 0
            if (r1 == 0) goto L_0x1cdb
            r75 = 1
        L_0x1cdb:
            java.lang.String r1 = "allow_non_admin_sub_group_creation"
            X.1ca r1 = r0.A0K(r1)     // Catch:{ 11T -> 0x26d9 }
            r11 = 0
            if (r1 == 0) goto L_0x1ce5
            r11 = 1
        L_0x1ce5:
            java.lang.String r1 = "group_history"
            X.1ca r1 = r0.A0K(r1)     // Catch:{ 11T -> 0x26d9 }
            r24 = 0
            if (r1 == 0) goto L_0x1cf1
            r24 = 1
        L_0x1cf1:
            java.lang.String r1 = "capi"
            X.1ca r1 = r0.A0K(r1)     // Catch:{ 11T -> 0x26d9 }
            if (r1 != 0) goto L_0x1cfa
            r9 = 0
        L_0x1cfa:
            java.lang.String r1 = "hidden_group"
            X.1ca r0 = r0.A0K(r1)     // Catch:{ 11T -> 0x26d9 }
            r23 = 0
            if (r0 == 0) goto L_0x1d06
            r23 = 1
        L_0x1d06:
            r0 = 1
            X.C18070vi.A0d(r6, r0)     // Catch:{ 11T -> 0x26d9 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ 11T -> 0x26d9 }
            r5.<init>()     // Catch:{ 11T -> 0x26d9 }
            java.lang.String r39 = "groupmgr/onGroupNewGroup/"
            r0 = r39
            r5.append(r0)     // Catch:{ 11T -> 0x26d9 }
            r0 = r27
            r5.append(r0)     // Catch:{ 11T -> 0x26d9 }
            java.lang.String r7 = "/"
            r5.append(r7)     // Catch:{ 11T -> 0x26d9 }
            r0 = r19
            r5.append(r0)     // Catch:{ 11T -> 0x26d9 }
            r5.append(r7)     // Catch:{ 11T -> 0x26d9 }
            r0 = r46
            r5.append(r0)     // Catch:{ 11T -> 0x26d9 }
            r5.append(r7)     // Catch:{ 11T -> 0x26d9 }
            r5.append(r13)     // Catch:{ 11T -> 0x26d9 }
            r5.append(r7)     // Catch:{ 11T -> 0x26d9 }
            r5.append(r15)     // Catch:{ 11T -> 0x26d9 }
            r5.append(r7)     // Catch:{ 11T -> 0x26d9 }
            r0 = r47
            r5.append(r0)     // Catch:{ 11T -> 0x26d9 }
            r5.append(r7)     // Catch:{ 11T -> 0x26d9 }
            r0 = r29
            r5.append(r0)     // Catch:{ 11T -> 0x26d9 }
            r5.append(r7)     // Catch:{ 11T -> 0x26d9 }
            r0 = r32
            r5.append(r0)     // Catch:{ 11T -> 0x26d9 }
            r5.append(r7)     // Catch:{ 11T -> 0x26d9 }
            r0 = r44
            r5.append(r0)     // Catch:{ 11T -> 0x26d9 }
            r5.append(r7)     // Catch:{ 11T -> 0x26d9 }
            r5.append(r12)     // Catch:{ 11T -> 0x26d9 }
            r5.append(r7)     // Catch:{ 11T -> 0x26d9 }
            r0 = r37
            r5.append(r0)     // Catch:{ 11T -> 0x26d9 }
            r5.append(r7)     // Catch:{ 11T -> 0x26d9 }
            r0 = r52
            r5.append(r0)     // Catch:{ 11T -> 0x26d9 }
            r5.append(r7)     // Catch:{ 11T -> 0x26d9 }
            r5.append(r11)     // Catch:{ 11T -> 0x26d9 }
            r5.append(r7)     // Catch:{ 11T -> 0x26d9 }
            r0 = r24
            r5.append(r0)     // Catch:{ 11T -> 0x26d9 }
            r5.append(r7)     // Catch:{ 11T -> 0x26d9 }
            r5.append(r9)     // Catch:{ 11T -> 0x26d9 }
            r5.append(r7)     // Catch:{ 11T -> 0x26d9 }
            r0 = r23
            r5.append(r0)     // Catch:{ 11T -> 0x26d9 }
            java.lang.String r0 = r5.toString()     // Catch:{ 11T -> 0x26d9 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 11T -> 0x26d9 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 11T -> 0x26d9 }
            r1.<init>()     // Catch:{ 11T -> 0x26d9 }
            r0 = r39
            r1.append(r0)     // Catch:{ 11T -> 0x26d9 }
            r0 = r42
            r1.append(r0)     // Catch:{ 11T -> 0x26d9 }
            java.lang.String r0 = r1.toString()     // Catch:{ 11T -> 0x26d9 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 11T -> 0x26d9 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 11T -> 0x26d9 }
            r1.<init>()     // Catch:{ 11T -> 0x26d9 }
            r0 = r39
            r1.append(r0)     // Catch:{ 11T -> 0x26d9 }
            r0 = r56
            r1.append(r0)     // Catch:{ 11T -> 0x26d9 }
            java.lang.String r0 = r1.toString()     // Catch:{ 11T -> 0x26d9 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 11T -> 0x26d9 }
            X.1CJ r0 = r2.A0I     // Catch:{ 11T -> 0x26d9 }
            r88 = r0
            boolean r0 = r0.A0P(r6)     // Catch:{ 11T -> 0x26d9 }
            r16 = r0 ^ 1
            r0 = r45
            com.whatsapp.jid.UserJid r0 = r0.A03     // Catch:{ 11T -> 0x26d9 }
            r43 = r0
            X.11S r8 = r2.A05     // Catch:{ 11T -> 0x26d9 }
            r0 = r34
            boolean r0 = r8.A0O(r0)     // Catch:{ 11T -> 0x26d9 }
            if (r0 == 0) goto L_0x1de2
            r0 = r43
            boolean r0 = r8.A0O(r0)     // Catch:{ 11T -> 0x26d9 }
            r17 = 1
            if (r0 != 0) goto L_0x1de4
        L_0x1de2:
            r17 = 0
        L_0x1de4:
            if (r43 == 0) goto L_0x1df2
            r1 = r42
            r0 = r43
            boolean r0 = r1.containsKey(r0)     // Catch:{ 11T -> 0x26d9 }
            r18 = 1
            if (r0 == 0) goto L_0x1df4
        L_0x1df2:
            r18 = 0
        L_0x1df4:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 11T -> 0x26d9 }
            r1.<init>()     // Catch:{ 11T -> 0x26d9 }
            java.lang.String r0 = "groupmgr/onGroupNewGroup/ new:"
            r1.append(r0)     // Catch:{ 11T -> 0x26d9 }
            r0 = r16
            r1.append(r0)     // Catch:{ 11T -> 0x26d9 }
            java.lang.String r0 = " mecreator:"
            r1.append(r0)     // Catch:{ 11T -> 0x26d9 }
            r0 = r17
            r1.append(r0)     // Catch:{ 11T -> 0x26d9 }
            java.lang.String r0 = " numberchange:"
            r1.append(r0)     // Catch:{ 11T -> 0x26d9 }
            r0 = r18
            r1.append(r0)     // Catch:{ 11T -> 0x26d9 }
            java.lang.String r0 = r1.toString()     // Catch:{ 11T -> 0x26d9 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 11T -> 0x26d9 }
            java.util.HashMap r38 = new java.util.HashMap     // Catch:{ 11T -> 0x26d9 }
            r38.<init>()     // Catch:{ 11T -> 0x26d9 }
            r41 = 0
            if (r17 == 0) goto L_0x1e77
            boolean r0 = android.text.TextUtils.isEmpty(r10)     // Catch:{ 11T -> 0x26d9 }
            if (r0 == 0) goto L_0x1e47
            X.00H r0 = r2.A0u     // Catch:{ 11T -> 0x26d9 }
            java.lang.Object r1 = r0.get()     // Catch:{ 11T -> 0x26d9 }
            X.2jS r1 = (X.C57672jS) r1     // Catch:{ 11T -> 0x26d9 }
            X.C17960vV.A07(r31)     // Catch:{ 11T -> 0x26d9 }
            r5 = 0
            r0 = r31
            X.C18070vi.A0d(r0, r5)     // Catch:{ 11T -> 0x26d9 }
            X.2hE r5 = X.AnonymousClass1EB.A01     // Catch:{ 11T -> 0x26d9 }
            X.11S r1 = r1.A00     // Catch:{ 11T -> 0x26d9 }
            X.1EB r5 = r5.A00(r1, r0)     // Catch:{ 11T -> 0x26d9 }
            goto L_0x1e72
        L_0x1e47:
            android.os.Parcelable$Creator r0 = X.AnonymousClass1EB.CREATOR     // Catch:{ 11T -> 0x26d9 }
            r5 = 0
            if (r10 == 0) goto L_0x1e75
            int r0 = r10.length()     // Catch:{ 11T -> 0x26d9 }
            if (r0 == 0) goto L_0x1e75
            com.whatsapp.jid.Jid r1 = X.C22911Dt.A00(r10)     // Catch:{ all -> 0x1e65 }
            boolean r0 = r1 instanceof X.AnonymousClass1EB     // Catch:{ all -> 0x1e65 }
            if (r0 == 0) goto L_0x1e5f
            X.1EB r1 = (X.AnonymousClass1EB) r1     // Catch:{ all -> 0x1e65 }
            if (r1 == 0) goto L_0x1e5f
            goto L_0x1e6b
        L_0x1e5f:
            X.11T r0 = new X.11T     // Catch:{ all -> 0x1e65 }
            r0.<init>((java.lang.String) r10)     // Catch:{ all -> 0x1e65 }
            throw r0     // Catch:{ all -> 0x1e65 }
        L_0x1e65:
            r0 = move-exception
            X.1IU r1 = new X.1IU     // Catch:{ 11T -> 0x26d9 }
            r1.<init>(r0)     // Catch:{ 11T -> 0x26d9 }
        L_0x1e6b:
            boolean r0 = r1 instanceof X.AnonymousClass1IU     // Catch:{ 11T -> 0x26d9 }
            if (r0 != 0) goto L_0x1e70
            r5 = r1
        L_0x1e70:
            X.1E9 r5 = (X.AnonymousClass1E9) r5     // Catch:{ 11T -> 0x26d9 }
        L_0x1e72:
            if (r5 == 0) goto L_0x1e75
            goto L_0x1e79
        L_0x1e75:
            r5 = 0
            goto L_0x1e79
        L_0x1e77:
            r5 = r41
        L_0x1e79:
            boolean r0 = r42.isEmpty()     // Catch:{ 11T -> 0x26d9 }
            if (r0 != 0) goto L_0x1e8c
            X.00H r0 = r2.A19     // Catch:{ 11T -> 0x26d9 }
            java.lang.Object r1 = r0.get()     // Catch:{ 11T -> 0x26d9 }
            X.1fv r1 = (X.C31661fv) r1     // Catch:{ 11T -> 0x26d9 }
            r0 = r42
            r1.A02(r0)     // Catch:{ 11T -> 0x26d9 }
        L_0x1e8c:
            if (r5 == 0) goto L_0x2051
            r0 = r88
            boolean r0 = r0.A0P(r5)     // Catch:{ 11T -> 0x26d9 }
            if (r0 == 0) goto L_0x2051
            X.1MZ r12 = r2.A0O     // Catch:{ 11T -> 0x26d9 }
            X.1MW r1 = r12.A08     // Catch:{ 11T -> 0x26d9 }
            X.2tp r53 = r1.A0C(r5)     // Catch:{ 11T -> 0x26d9 }
            X.1NI r0 = r2.A0L     // Catch:{ 11T -> 0x26d9 }
            r9 = 1
            java.lang.String[] r11 = new java.lang.String[r9]     // Catch:{ 11T -> 0x26d9 }
            X.1LW r10 = r0.A00     // Catch:{ 11T -> 0x26d9 }
            long r13 = r10.A09(r5)     // Catch:{ 11T -> 0x26d9 }
            java.lang.String r13 = java.lang.String.valueOf(r13)     // Catch:{ 11T -> 0x26d9 }
            r9 = 0
            r11[r9] = r13     // Catch:{ 11T -> 0x26d9 }
            X.1Cd r0 = r0.A02     // Catch:{ 11T -> 0x26d9 }
            X.1au r51 = r0.A05()     // Catch:{ 11T -> 0x26d9 }
            X.1xA r50 = r51.BD0()     // Catch:{ all -> 0x2045 }
            r0 = r51
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x203b }
            X.1Ev r14 = r0.A02     // Catch:{ all -> 0x203b }
            java.lang.String r13 = "message"
            java.lang.String r9 = "_id IN (   SELECT _id   FROM deleted_messages_ids_view   WHERE chat_row_id = ?)"
            java.lang.String r0 = "updateTempGroup/DELETE_MESSAGE"
            r14.A04(r13, r9, r0, r11)     // Catch:{ all -> 0x203b }
            r10.A0K(r5)     // Catch:{ all -> 0x203b }
            r50.A00()     // Catch:{ all -> 0x203b }
            r50.close()     // Catch:{ all -> 0x2045 }
            r51.close()     // Catch:{ 11T -> 0x26d9 }
            X.1Cd r0 = r12.A07     // Catch:{ 11T -> 0x26d9 }
            X.1au r51 = r0.A05()     // Catch:{ 11T -> 0x26d9 }
            X.1xA r50 = r51.BD0()     // Catch:{ all -> 0x2045 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x203b }
            r9.<init>()     // Catch:{ all -> 0x203b }
            java.lang.String r0 = "ParticipantUserStore/updateTempGroup "
            r9.append(r0)     // Catch:{ all -> 0x203b }
            r9.append(r5)     // Catch:{ all -> 0x203b }
            r9.append(r7)     // Catch:{ all -> 0x203b }
            r9.append(r6)     // Catch:{ all -> 0x203b }
            java.lang.String r0 = r9.toString()     // Catch:{ all -> 0x203b }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x203b }
            X.1Cd r0 = r1.A06     // Catch:{ all -> 0x203b }
            X.1au r14 = r0.A05()     // Catch:{ all -> 0x203b }
            X.1DL r0 = r1.A05     // Catch:{ all -> 0x2031 }
            long r9 = r0.A09(r5)     // Catch:{ all -> 0x2031 }
            long r12 = r0.A09(r6)     // Catch:{ all -> 0x2031 }
            r0 = 1
            java.lang.String[] r7 = new java.lang.String[r0]     // Catch:{ all -> 0x2031 }
            java.lang.String r0 = java.lang.Long.toString(r9)     // Catch:{ all -> 0x2031 }
            r9 = 0
            r7[r9] = r0     // Catch:{ all -> 0x2031 }
            r10 = 2
            android.content.ContentValues r0 = new android.content.ContentValues     // Catch:{ all -> 0x2031 }
            r0.<init>(r10)     // Catch:{ all -> 0x2031 }
            java.lang.String r11 = "group_jid_row_id"
            java.lang.Long r10 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x2031 }
            r0.put(r11, r10)     // Catch:{ all -> 0x2031 }
            java.lang.String r10 = "pending"
            java.lang.Integer r11 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x2031 }
            r0.put(r10, r11)     // Catch:{ all -> 0x2031 }
            java.lang.String r10 = "add_timestamp"
            r0.put(r10, r11)     // Catch:{ all -> 0x2031 }
            r10 = r14
            X.1av r10 = (X.C28801av) r10     // Catch:{ all -> 0x2031 }
            X.1Ev r10 = r10.A02     // Catch:{ all -> 0x2031 }
            java.lang.String r59 = "group_participant_user"
            java.lang.String r60 = "group_jid_row_id = ?"
            java.lang.String r61 = "updateTempGroup/UPDATE_GROUP_PARTICIPANT_USER"
            r57 = r10
            r58 = r0
            r62 = r7
            r57.A02(r58, r59, r60, r61, r62)     // Catch:{ all -> 0x2031 }
            r14.close()     // Catch:{ all -> 0x203b }
            X.1MS r0 = r1.A04     // Catch:{ all -> 0x203b }
            java.util.Map r0 = r0.A05     // Catch:{ all -> 0x203b }
            r0.remove(r5)     // Catch:{ all -> 0x203b }
            r50.A00()     // Catch:{ all -> 0x203b }
            r50.close()     // Catch:{ all -> 0x2045 }
            r51.close()     // Catch:{ 11T -> 0x26d9 }
            android.os.Handler r7 = X.AnonymousClass126.A1Z     // Catch:{ 11T -> 0x26d9 }
            r1 = 44
            X.7Qq r0 = new X.7Qq     // Catch:{ 11T -> 0x26d9 }
            r0.<init>(r2, r5, r1)     // Catch:{ 11T -> 0x26d9 }
            r7.post(r0)     // Catch:{ 11T -> 0x26d9 }
            X.1M9 r7 = r2.A08     // Catch:{ 11T -> 0x26d9 }
            X.1E7 r1 = r7.A0H(r5)     // Catch:{ 11T -> 0x26d9 }
            r0 = r37
            r1.A12 = r0     // Catch:{ 11T -> 0x26d9 }
            r8.A0I()     // Catch:{ 11T -> 0x26d9 }
            com.whatsapp.jid.PhoneUserJid r0 = r8.A0E     // Catch:{ 11T -> 0x26d9 }
            r1.A0K = r0     // Catch:{ 11T -> 0x26d9 }
            r0 = r55
            r1.A06 = r0     // Catch:{ 11T -> 0x26d9 }
            r0 = r47
            r1.A0f = r0     // Catch:{ 11T -> 0x26d9 }
            r0 = r56
            r1.A0M = r0     // Catch:{ 11T -> 0x26d9 }
            r1.A13 = r15     // Catch:{ 11T -> 0x26d9 }
            r0 = r23
            r1.A0n = r0     // Catch:{ 11T -> 0x26d9 }
            r0 = r36
            r1.A0O = r0     // Catch:{ 11T -> 0x26d9 }
            X.1M2 r0 = r7.A04     // Catch:{ 11T -> 0x26d9 }
            r10 = r0
            r11 = r1
            r12 = r6
            r13 = r31
            r14 = r27
            r10.A0U(r11, r12, r13, r14)     // Catch:{ 11T -> 0x26d9 }
            X.1MA r10 = r7.A03     // Catch:{ 11T -> 0x26d9 }
            java.lang.Class<X.1EB> r0 = X.AnonymousClass1EB.class
            com.whatsapp.jid.Jid r0 = r1.A06(r0)     // Catch:{ 11T -> 0x26d9 }
            X.1BI r0 = (X.AnonymousClass1BI) r0     // Catch:{ 11T -> 0x26d9 }
            r10.A0C(r0)     // Catch:{ 11T -> 0x26d9 }
            r10.A0C(r6)     // Catch:{ 11T -> 0x26d9 }
            r7.A0H(r6)     // Catch:{ 11T -> 0x26d9 }
            X.1Nd r10 = r2.A0E     // Catch:{ 11T -> 0x26d9 }
            X.1CJ r0 = r10.A02     // Catch:{ 11T -> 0x26d9 }
            X.AnonymousClass1CJ.A01(r0)     // Catch:{ 11T -> 0x26d9 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 11T -> 0x26d9 }
            r1.<init>()     // Catch:{ 11T -> 0x26d9 }
            java.lang.String r0 = "conversationsmgr/replacecontact:"
            r1.append(r0)     // Catch:{ 11T -> 0x26d9 }
            r1.append(r5)     // Catch:{ 11T -> 0x26d9 }
            java.lang.String r0 = " -> "
            r1.append(r0)     // Catch:{ 11T -> 0x26d9 }
            r1.append(r6)     // Catch:{ 11T -> 0x26d9 }
            java.lang.String r0 = r1.toString()     // Catch:{ 11T -> 0x26d9 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 11T -> 0x26d9 }
            r0 = r25
            X.C25161Nd.A01(r10, r5, r6, r0)     // Catch:{ 11T -> 0x26d9 }
            java.util.Set r0 = r42.entrySet()     // Catch:{ 11T -> 0x26d9 }
            java.util.Iterator r10 = r0.iterator()     // Catch:{ 11T -> 0x26d9 }
        L_0x1fdb:
            boolean r0 = r10.hasNext()     // Catch:{ 11T -> 0x26d9 }
            if (r0 == 0) goto L_0x214d
            java.lang.Object r1 = r10.next()     // Catch:{ 11T -> 0x26d9 }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ 11T -> 0x26d9 }
            java.lang.Object r5 = r1.getKey()     // Catch:{ 11T -> 0x26d9 }
            com.whatsapp.jid.UserJid r5 = (com.whatsapp.jid.UserJid) r5     // Catch:{ 11T -> 0x26d9 }
            r0 = r53
            X.2sr r0 = r0.A0D(r5, r9)     // Catch:{ 11T -> 0x26d9 }
            if (r0 != 0) goto L_0x1fdb
            java.lang.Object r0 = r1.getKey()     // Catch:{ 11T -> 0x26d9 }
            X.1BI r0 = (X.AnonymousClass1BI) r0     // Catch:{ 11T -> 0x26d9 }
            boolean r0 = r8.A0O(r0)     // Catch:{ 11T -> 0x26d9 }
            if (r0 != 0) goto L_0x1fdb
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ 11T -> 0x26d9 }
            r5.<init>()     // Catch:{ 11T -> 0x26d9 }
            java.lang.String r0 = "groupmgr/onGroupNewGroup/ identified new participant:"
            r5.append(r0)     // Catch:{ 11T -> 0x26d9 }
            java.lang.Object r0 = r1.getKey()     // Catch:{ 11T -> 0x26d9 }
            r5.append(r0)     // Catch:{ 11T -> 0x26d9 }
            java.lang.String r0 = r5.toString()     // Catch:{ 11T -> 0x26d9 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 11T -> 0x26d9 }
            r1.getValue()     // Catch:{ 11T -> 0x26d9 }
            java.lang.Object r5 = r1.getKey()     // Catch:{ 11T -> 0x26d9 }
            java.lang.Object r0 = r1.getValue()     // Catch:{ 11T -> 0x26d9 }
            X.2nJ r0 = (X.C60052nJ) r0     // Catch:{ 11T -> 0x26d9 }
            java.lang.String r1 = r0.A04     // Catch:{ 11T -> 0x26d9 }
            r0 = r38
            r0.put(r5, r1)     // Catch:{ 11T -> 0x26d9 }
            r10.remove()     // Catch:{ 11T -> 0x26d9 }
            goto L_0x1fdb
        L_0x2031:
            r1 = move-exception
            r14.close()     // Catch:{ all -> 0x2036 }
            goto L_0x203a
        L_0x2036:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x203b }
        L_0x203a:
            throw r1     // Catch:{ all -> 0x203b }
        L_0x203b:
            r1 = move-exception
            r50.close()     // Catch:{ all -> 0x2040 }
            goto L_0x2044
        L_0x2040:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x2045 }
        L_0x2044:
            throw r1     // Catch:{ all -> 0x2045 }
        L_0x2045:
            r1 = move-exception
            r51.close()     // Catch:{ all -> 0x204b }
            goto L_0x24ba
        L_0x204b:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ 11T -> 0x26d9 }
            goto L_0x24ba
        L_0x2051:
            X.1M9 r7 = r2.A08     // Catch:{ 11T -> 0x26d9 }
            X.1E7 r0 = r7.A0E(r6)     // Catch:{ 11T -> 0x26d9 }
            if (r0 != 0) goto L_0x210b
            X.1E7 r0 = new X.1E7     // Catch:{ 11T -> 0x26d9 }
            r0.<init>(r6)     // Catch:{ 11T -> 0x26d9 }
            X.2n9 r5 = new X.2n9     // Catch:{ 11T -> 0x26d9 }
            r57 = r5
            r58 = r0
            r59 = r34
            r60 = r56
            r61 = r31
            r62 = r36
            r63 = r29
            r64 = r55
            r65 = r9
            r66 = r27
            r68 = r13
            r69 = r15
            r70 = r47
            r73 = r12
            r74 = r37
            r76 = r11
            r77 = r24
            r78 = r23
            r57.<init>(r58, r59, r60, r61, r62, r63, r64, r65, r66, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78)     // Catch:{ 11T -> 0x26d9 }
            X.1E7 r10 = r5.A04     // Catch:{ 11T -> 0x26d9 }
            java.lang.String r9 = r5.A08     // Catch:{ 11T -> 0x26d9 }
            long r0 = r5.A03     // Catch:{ 11T -> 0x26d9 }
            r62 = r0
            X.1yX r0 = r5.A06     // Catch:{ 11T -> 0x26d9 }
            r61 = r0
            boolean r0 = r5.A0C     // Catch:{ 11T -> 0x26d9 }
            r60 = r0
            boolean r0 = r5.A0J     // Catch:{ 11T -> 0x26d9 }
            r59 = r0
            boolean r0 = r5.A0A     // Catch:{ 11T -> 0x26d9 }
            r58 = r0
            boolean r0 = r5.A0I     // Catch:{ 11T -> 0x26d9 }
            r57 = r0
            int r0 = r5.A01     // Catch:{ 11T -> 0x26d9 }
            r56 = r0
            com.whatsapp.jid.UserJid r0 = r5.A05     // Catch:{ 11T -> 0x26d9 }
            r55 = r0
            boolean r13 = r5.A0H     // Catch:{ 11T -> 0x26d9 }
            boolean r0 = r5.A0E     // Catch:{ 11T -> 0x26d9 }
            r53 = r0
            int r0 = r5.A02     // Catch:{ 11T -> 0x26d9 }
            r51 = r0
            boolean r15 = r5.A0F     // Catch:{ 11T -> 0x26d9 }
            java.lang.String r14 = r5.A07     // Catch:{ 11T -> 0x26d9 }
            boolean r12 = r5.A0G     // Catch:{ 11T -> 0x26d9 }
            boolean r11 = r5.A09     // Catch:{ 11T -> 0x26d9 }
            boolean r1 = r5.A0B     // Catch:{ 11T -> 0x26d9 }
            int r0 = r5.A00     // Catch:{ 11T -> 0x26d9 }
            boolean r5 = r5.A0D     // Catch:{ 11T -> 0x26d9 }
            java.lang.String r50 = "addGroupChatContact"
            com.whatsapp.util.Log.i((java.lang.String) r50)     // Catch:{ 11T -> 0x26d9 }
            r10.A0R = r9     // Catch:{ 11T -> 0x26d9 }
            java.lang.String r9 = java.lang.Long.toString(r62)     // Catch:{ 11T -> 0x26d9 }
            r10.A0X = r9     // Catch:{ 11T -> 0x26d9 }
            r9 = r60
            r10.A0j = r9     // Catch:{ 11T -> 0x26d9 }
            r9 = r59
            r10.A13 = r9     // Catch:{ 11T -> 0x26d9 }
            r9 = r58
            r10.A0f = r9     // Catch:{ 11T -> 0x26d9 }
            r9 = r57
            r10.A11 = r9     // Catch:{ 11T -> 0x26d9 }
            r9 = r56
            r10.A04 = r9     // Catch:{ 11T -> 0x26d9 }
            r9 = r55
            r10.A0K = r9     // Catch:{ 11T -> 0x26d9 }
            r10.A0t = r13     // Catch:{ 11T -> 0x26d9 }
            r9 = r61
            r10.A09(r9)     // Catch:{ 11T -> 0x26d9 }
            r9 = r53
            r10.A0k = r9     // Catch:{ 11T -> 0x26d9 }
            r9 = r51
            r10.A06 = r9     // Catch:{ 11T -> 0x26d9 }
            r10.A12 = r15     // Catch:{ 11T -> 0x26d9 }
            r10.A0O = r14     // Catch:{ 11T -> 0x26d9 }
            r10.A0r = r12     // Catch:{ 11T -> 0x26d9 }
            r10.A0e = r11     // Catch:{ 11T -> 0x26d9 }
            r10.A0i = r1     // Catch:{ 11T -> 0x26d9 }
            r10.A03 = r0     // Catch:{ 11T -> 0x26d9 }
            r10.A0n = r5     // Catch:{ 11T -> 0x26d9 }
            X.1M2 r0 = r7.A04     // Catch:{ 11T -> 0x26d9 }
            r0.A0O(r10)     // Catch:{ 11T -> 0x26d9 }
            goto L_0x214d
        L_0x210b:
            X.1Ui r5 = r2.A0f     // Catch:{ 11T -> 0x26d9 }
            int r1 = r0.A08     // Catch:{ 11T -> 0x26d9 }
            java.lang.String r59 = "GroupChatManager.onGroupNewGroup"
            r61 = 2
            r62 = 0
            r57 = r5
            r58 = r6
            r60 = r1
            r57.A03(r58, r59, r60, r61, r62)     // Catch:{ 11T -> 0x26d9 }
            r58 = r0
            r59 = r2
            r60 = r34
            r61 = r56
            r62 = r31
            r63 = r36
            r64 = r55
            r65 = r9
            r66 = r27
            r68 = r13
            r69 = r15
            r70 = r47
            r73 = r12
            r74 = r37
            r76 = r11
            r77 = r24
            r78 = r23
            boolean r1 = X.AnonymousClass126.A0G(r58, r59, r60, r61, r62, r63, r64, r65, r66, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78)     // Catch:{ 11T -> 0x26d9 }
            if (r1 == 0) goto L_0x214d
            r1 = r29
            r0.A04 = r1     // Catch:{ 11T -> 0x26d9 }
            r7.A0X(r0)     // Catch:{ 11T -> 0x26d9 }
        L_0x214d:
            r1 = 3
            r0 = r44
            if (r0 != r1) goto L_0x2153
            goto L_0x2190
        L_0x2153:
            r50 = 0
            r5 = 1
            if (r0 != r5) goto L_0x2197
            r0 = r88
            X.1ci r0 = X.AnonymousClass1CJ.A00(r0, r6)     // Catch:{ 11T -> 0x26d9 }
            if (r0 == 0) goto L_0x217d
            X.00H r0 = r2.A0m     // Catch:{ 11T -> 0x26d9 }
            java.lang.Object r1 = r0.get()     // Catch:{ 11T -> 0x26d9 }
            X.1kb r1 = (X.C34511kb) r1     // Catch:{ 11T -> 0x26d9 }
            r0 = r88
            X.1ci r9 = X.AnonymousClass1CJ.A00(r0, r6)     // Catch:{ 11T -> 0x26d9 }
            if (r9 == 0) goto L_0x2197
            r0 = r52
            if (r0 == r5) goto L_0x2175
            r5 = 0
        L_0x2175:
            r9.A0r = r5     // Catch:{ 11T -> 0x26d9 }
            X.1QW r0 = r1.A03     // Catch:{ 11T -> 0x26d9 }
            r0.A01(r9)     // Catch:{ 11T -> 0x26d9 }
            goto L_0x2197
        L_0x217d:
            if (r16 == 0) goto L_0x2197
            r0 = r52
            if (r0 == r5) goto L_0x2184
            r5 = 0
        L_0x2184:
            X.00H r0 = r2.A0o     // Catch:{ 11T -> 0x26d9 }
            java.lang.Object r0 = r0.get()     // Catch:{ 11T -> 0x26d9 }
            X.4Q3 r0 = (X.AnonymousClass4Q3) r0     // Catch:{ 11T -> 0x26d9 }
            r0.A00(r6, r5)     // Catch:{ 11T -> 0x26d9 }
            goto L_0x2197
        L_0x2190:
            r50 = 1
            r0 = r54
            X.AnonymousClass126.A0D(r2, r6, r0)     // Catch:{ 11T -> 0x26d9 }
        L_0x2197:
            java.lang.Integer r61 = X.AnonymousClass00R.A01     // Catch:{ 11T -> 0x26d9 }
            r51 = r2
            r52 = r4
            r53 = r6
            r54 = r61
            r55 = r31
            r56 = r44
            r57 = r19
            X.AnonymousClass126.A0E(r51, r52, r53, r54, r55, r56, r57)     // Catch:{ 11T -> 0x26d9 }
            X.1MZ r0 = r2.A0O     // Catch:{ 11T -> 0x26d9 }
            X.1MW r0 = r0.A08     // Catch:{ 11T -> 0x26d9 }
            X.2tp r13 = r0.A0C(r6)     // Catch:{ 11T -> 0x26d9 }
            java.lang.String r1 = "lid"
            r0 = r36
            boolean r36 = r1.equals(r0)     // Catch:{ 11T -> 0x26d9 }
            if (r36 == 0) goto L_0x21be
            r0 = 2
            goto L_0x21c2
        L_0x21be:
            r0 = 0
            if (r50 == 0) goto L_0x21c2
            r0 = 1
        L_0x21c2:
            r13.A00 = r0     // Catch:{ 11T -> 0x26d9 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 11T -> 0x26d9 }
            r1.<init>()     // Catch:{ 11T -> 0x26d9 }
            java.lang.String r0 = "groupmgr/onGroupNewGroup oldparticipants:"
            r1.append(r0)     // Catch:{ 11T -> 0x26d9 }
            X.10f r0 = r13.A07()     // Catch:{ 11T -> 0x26d9 }
            r1.append(r0)     // Catch:{ 11T -> 0x26d9 }
            java.lang.String r0 = r1.toString()     // Catch:{ 11T -> 0x26d9 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 11T -> 0x26d9 }
            boolean r15 = r13.A0W(r8)     // Catch:{ 11T -> 0x26d9 }
            java.lang.String r14 = "group_sync"
            r1 = 2
            X.2sm r5 = new X.2sm     // Catch:{ 11T -> 0x26d9 }
            r5.<init>(r14, r1)     // Catch:{ 11T -> 0x26d9 }
            if (r47 == 0) goto L_0x21f0
            boolean r0 = r13.A0X(r8)     // Catch:{ 11T -> 0x26d9 }
            if (r0 == 0) goto L_0x21fe
        L_0x21f0:
            X.00H r0 = r2.A12     // Catch:{ 11T -> 0x26d9 }
            java.lang.Object r0 = r0.get()     // Catch:{ 11T -> 0x26d9 }
            X.127 r0 = (X.AnonymousClass127) r0     // Catch:{ 11T -> 0x26d9 }
            boolean r0 = r0.A02     // Catch:{ 11T -> 0x26d9 }
            r59 = 1
            if (r0 == 0) goto L_0x2200
        L_0x21fe:
            r59 = 0
        L_0x2200:
            if (r36 != 0) goto L_0x2206
            r60 = 0
            if (r50 == 0) goto L_0x2208
        L_0x2206:
            r60 = 1
        L_0x2208:
            r0 = 1
            r66 = 1
            r11 = 0
            r57 = r11
            r51 = r13
            r52 = r2
            r53 = r5
            r54 = r41
            r55 = r42
            r56 = r11
            r58 = r0
            X.AnonymousClass126.A00(r51, r52, r53, r54, r55, r56, r57, r58, r59, r60)     // Catch:{ 11T -> 0x26d9 }
            X.1Me r5 = r2.A0A     // Catch:{ 11T -> 0x26d9 }
            r5.A0g(r6)     // Catch:{ 11T -> 0x26d9 }
            if (r16 == 0) goto L_0x23f0
            X.00H r5 = r2.A0p     // Catch:{ 11T -> 0x26d9 }
            r5.get()     // Catch:{ 11T -> 0x26d9 }
            boolean r5 = r13.A0X(r8)     // Catch:{ 11T -> 0x26d9 }
            if (r50 == 0) goto L_0x2280
            if (r5 != 0) goto L_0x224a
            X.1Uh r5 = r2.A0V     // Catch:{ 11T -> 0x26d9 }
            X.1PQ r9 = r2.A0h     // Catch:{ 11T -> 0x26d9 }
            r55 = 99
            r51 = r9
            r52 = r41
            r53 = r6
            r56 = r25
            X.2Mh r9 = r51.A06(r52, r53, r54, r55, r56)     // Catch:{ 11T -> 0x26d9 }
            X.122 r5 = r5.A01     // Catch:{ 11T -> 0x26d9 }
            r5.BBM(r9)     // Catch:{ 11T -> 0x26d9 }
        L_0x224a:
            java.lang.String r9 = "default_sub_group_admin_add"
            r5 = r46
            boolean r5 = r9.equals(r5)     // Catch:{ 11T -> 0x26d9 }
            if (r5 != 0) goto L_0x230c
            java.lang.String r9 = "invite"
            r5 = r46
            boolean r5 = r9.equals(r5)     // Catch:{ 11T -> 0x26d9 }
            if (r5 != 0) goto L_0x230c
            java.lang.String r9 = "auto_add"
            r5 = r46
            boolean r5 = r9.equals(r5)     // Catch:{ 11T -> 0x26d9 }
            if (r5 != 0) goto L_0x230c
            java.lang.String r9 = "linked_group_join"
            r5 = r46
            boolean r5 = r9.equals(r5)     // Catch:{ 11T -> 0x26d9 }
            if (r5 != 0) goto L_0x230c
            java.lang.String r9 = "invite_auto_add"
            r5 = r46
            boolean r5 = r9.equals(r5)     // Catch:{ 11T -> 0x26d9 }
            if (r5 != 0) goto L_0x230c
            if (r17 == 0) goto L_0x230c
            goto L_0x2329
        L_0x2280:
            int r5 = r42.size()     // Catch:{ 11T -> 0x26d9 }
            if (r5 != r0) goto L_0x22bf
            if (r4 == 0) goto L_0x22bf
            r5 = r44
            if (r5 != r1) goto L_0x22bf
            r5 = r88
            java.lang.String r9 = r5.A0F(r4)     // Catch:{ 11T -> 0x26d9 }
            r54 = 143(0x8f, float:2.0E-43)
            X.984 r5 = new X.984     // Catch:{ 11T -> 0x26d9 }
            r51 = r5
            r52 = r41
            r53 = r45
            r55 = r27
            r51.<init>((X.C63872tp) r52, (X.C62502rV) r53, (int) r54, (long) r55)     // Catch:{ 11T -> 0x26d9 }
            r5.A00 = r1     // Catch:{ 11T -> 0x26d9 }
            r5.A1F(r4, r9)     // Catch:{ 11T -> 0x26d9 }
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r37)     // Catch:{ 11T -> 0x26d9 }
            r10 = r31
            r9 = r23
            r5.A1G(r6, r12, r10, r9)     // Catch:{ 11T -> 0x26d9 }
            r9 = r34
            r5.A0d(r9)     // Catch:{ 11T -> 0x26d9 }
            r5.A0i(r10)     // Catch:{ 11T -> 0x26d9 }
            r9 = r46
            r5.A01 = r9     // Catch:{ 11T -> 0x26d9 }
            goto L_0x234a
        L_0x22bf:
            if (r17 == 0) goto L_0x2303
            X.1PU r10 = r2.A0j     // Catch:{ 11T -> 0x26d9 }
            r9 = 6
            r5 = r44
            if (r5 != r9) goto L_0x2303
            X.0ve r10 = r10.A02     // Catch:{ 11T -> 0x26d9 }
            r9 = 5021(0x139d, float:7.036E-42)
            X.0vf r5 = X.C18040vf.A02     // Catch:{ 11T -> 0x26d9 }
            boolean r5 = X.C18020vd.A05(r5, r10, r9)     // Catch:{ 11T -> 0x26d9 }
            if (r5 == 0) goto L_0x230c
            r5 = r88
            java.lang.String r10 = r5.A0F(r4)     // Catch:{ 11T -> 0x26d9 }
            r54 = 148(0x94, float:2.07E-43)
            X.98D r5 = new X.98D     // Catch:{ 11T -> 0x26d9 }
            r51 = r5
            r52 = r41
            r53 = r45
            r55 = r27
            r51.<init>((X.C63872tp) r52, (X.C62502rV) r53, (int) r54, (long) r55)     // Catch:{ 11T -> 0x26d9 }
            r9 = 6
            r5.A00 = r9     // Catch:{ 11T -> 0x26d9 }
            r5.A1F(r4, r10)     // Catch:{ 11T -> 0x26d9 }
            r9 = r31
            r5.A1G(r6, r9, r0)     // Catch:{ 11T -> 0x26d9 }
            r9 = r34
            r5.A0d(r9)     // Catch:{ 11T -> 0x26d9 }
            r9 = r31
            r5.A0i(r9)     // Catch:{ 11T -> 0x26d9 }
            r9 = r46
            r5.A0X = r9     // Catch:{ 11T -> 0x26d9 }
            goto L_0x234a
        L_0x2303:
            r5 = r44
            if (r5 != r0) goto L_0x230c
            X.1PQ r5 = r2.A0h     // Catch:{ 11T -> 0x26d9 }
            r55 = 167(0xa7, float:2.34E-43)
            goto L_0x2310
        L_0x230c:
            X.1PQ r5 = r2.A0h     // Catch:{ 11T -> 0x26d9 }
            r55 = 11
        L_0x2310:
            r51 = r5
            r52 = r41
            r53 = r6
            r54 = r45
            r56 = r27
            X.2Mh r5 = r51.A06(r52, r53, r54, r55, r56)     // Catch:{ 11T -> 0x26d9 }
            r9 = r31
            r5.A0i(r9)     // Catch:{ 11T -> 0x26d9 }
            r9 = r34
            r5.A0d(r9)     // Catch:{ 11T -> 0x26d9 }
            goto L_0x234a
        L_0x2329:
            r54 = 122(0x7a, float:1.71E-43)
            X.97v r5 = new X.97v     // Catch:{ 11T -> 0x26d9 }
            r51 = r5
            r52 = r41
            r53 = r45
            r55 = r27
            r51.<init>((X.C63872tp) r52, (X.C62502rV) r53, (int) r54, (long) r55)     // Catch:{ 11T -> 0x26d9 }
            r9 = 3
            r5.A00 = r9     // Catch:{ 11T -> 0x26d9 }
            r9 = r31
            r5.A1F(r4, r9)     // Catch:{ 11T -> 0x26d9 }
            r9 = r34
            r5.A0d(r9)     // Catch:{ 11T -> 0x26d9 }
            r9 = r31
            r5.A0i(r9)     // Catch:{ 11T -> 0x26d9 }
        L_0x234a:
            X.1Uh r10 = r2.A0V     // Catch:{ 11T -> 0x26d9 }
            r10.BcH(r5, r0)     // Catch:{ 11T -> 0x26d9 }
            if (r4 == 0) goto L_0x2377
            if (r23 == 0) goto L_0x2377
            X.0ve r12 = r2.A0U     // Catch:{ 11T -> 0x26d9 }
            r9 = 8530(0x2152, float:1.1953E-41)
            X.0vf r5 = X.C18040vf.A02     // Catch:{ 11T -> 0x26d9 }
            boolean r5 = X.C18020vd.A05(r5, r12, r9)     // Catch:{ 11T -> 0x26d9 }
            if (r5 == 0) goto L_0x2377
            X.1PQ r5 = r2.A0h     // Catch:{ 11T -> 0x26d9 }
            r55 = 177(0xb1, float:2.48E-43)
            r54 = r41
            r51 = r5
            r53 = r6
            r56 = r25
            X.2Mh r9 = r51.A06(r52, r53, r54, r55, r56)     // Catch:{ 11T -> 0x26d9 }
            r5 = r34
            r9.A0d(r5)     // Catch:{ 11T -> 0x26d9 }
            r10.BcH(r9, r1)     // Catch:{ 11T -> 0x26d9 }
        L_0x2377:
            java.lang.String r9 = "linked_group_join"
            r5 = r46
            boolean r64 = r9.equals(r5)     // Catch:{ 11T -> 0x26d9 }
            if (r4 == 0) goto L_0x2399
            X.A2B r56 = new X.A2B     // Catch:{ 11T -> 0x26d9 }
            r67 = r56
            r68 = r4
            r69 = r40
            r70 = r0
            r71 = r21
            r67.<init>(r68, r69, r70, r71)     // Catch:{ 11T -> 0x26d9 }
        L_0x2390:
            int r5 = r42.size()     // Catch:{ 11T -> 0x26d9 }
            r65 = 1
            if (r5 != r0) goto L_0x239c
            goto L_0x239f
        L_0x2399:
            r56 = r41
            goto L_0x2390
        L_0x239c:
            r65 = 0
            goto L_0x23a5
        L_0x239f:
            if (r4 == 0) goto L_0x239c
            r5 = r44
            if (r5 != r1) goto L_0x239c
        L_0x23a5:
            if (r31 == 0) goto L_0x23a9
            r40 = r31
        L_0x23a9:
            X.A2B r9 = new X.A2B     // Catch:{ 11T -> 0x26d9 }
            r67 = r9
            r68 = r6
            r69 = r40
            r70 = r44
            r71 = r19
            r67.<init>(r68, r69, r70, r71)     // Catch:{ 11T -> 0x26d9 }
            int r5 = r9.A00     // Catch:{ 11T -> 0x26d9 }
            if (r5 != r0) goto L_0x23cf
            com.whatsapp.jid.GroupJid r0 = r9.A02     // Catch:{ 11T -> 0x26d9 }
            X.1EC r5 = X.C42941yz.A00(r0)     // Catch:{ 11T -> 0x26d9 }
            if (r5 == 0) goto L_0x23cf
            X.00H r0 = r2.A0t     // Catch:{ 11T -> 0x26d9 }
            java.lang.Object r0 = r0.get()     // Catch:{ 11T -> 0x26d9 }
            com.whatsapp.group.GetSubgroupsManager r0 = (com.whatsapp.group.GetSubgroupsManager) r0     // Catch:{ 11T -> 0x26d9 }
            r0.A05(r5)     // Catch:{ 11T -> 0x26d9 }
        L_0x23cf:
            r60 = r41
            r55 = r9
            r57 = r2
            r58 = r34
            r59 = r41
            r62 = r27
            X.AnonymousClass126.A07(r55, r56, r57, r58, r59, r60, r61, r62, r64, r65)     // Catch:{ 11T -> 0x26d9 }
            if (r64 == 0) goto L_0x243f
            X.1NI r0 = r2.A0L     // Catch:{ 11T -> 0x26d9 }
            r81 = r0
            r82 = r6
            r84 = r31
            r85 = r44
            r86 = r27
            r81.A04(r82, r83, r84, r85, r86)     // Catch:{ 11T -> 0x26d9 }
            goto L_0x243f
        L_0x23f0:
            if (r17 != 0) goto L_0x243f
            r0 = r88
            X.1ci r0 = X.AnonymousClass1CJ.A00(r0, r6)     // Catch:{ 11T -> 0x26d9 }
            if (r0 != 0) goto L_0x23fd
            r10 = r41
            goto L_0x23ff
        L_0x23fd:
            X.1cn r10 = r0.A0h     // Catch:{ 11T -> 0x26d9 }
        L_0x23ff:
            X.1Rf r5 = r2.A0c     // Catch:{ 11T -> 0x26d9 }
            X.11P r9 = r2.A0F     // Catch:{ 11T -> 0x26d9 }
            long r55 = X.AnonymousClass11P.A01(r9)     // Catch:{ 11T -> 0x26d9 }
            r51 = r5
            r52 = r6
            r53 = r10
            r54 = r83
            X.2Mh r10 = r51.A00(r52, r53, r54, r55)     // Catch:{ 11T -> 0x26d9 }
            if (r10 == 0) goto L_0x241c
            X.1Uh r9 = r2.A0V     // Catch:{ 11T -> 0x26d9 }
            r5 = 8
            r9.BcH(r10, r5)     // Catch:{ 11T -> 0x26d9 }
        L_0x241c:
            X.1NI r5 = r2.A0L     // Catch:{ 11T -> 0x26d9 }
            r84 = r31
            boolean r9 = android.text.TextUtils.isEmpty(r31)     // Catch:{ 11T -> 0x26d9 }
            if (r9 == 0) goto L_0x2434
            java.lang.String r9 = r0.A0A()     // Catch:{ 11T -> 0x26d9 }
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch:{ 11T -> 0x26d9 }
            if (r9 != 0) goto L_0x2434
            java.lang.String r84 = r0.A0A()     // Catch:{ 11T -> 0x26d9 }
        L_0x2434:
            r81 = r5
            r82 = r6
            r85 = r44
            r86 = r27
            r81.A04(r82, r83, r84, r85, r86)     // Catch:{ 11T -> 0x26d9 }
        L_0x243f:
            if (r24 == 0) goto L_0x245f
            X.1Uh r5 = r2.A0V     // Catch:{ 11T -> 0x26d9 }
            X.1PQ r0 = r2.A0h     // Catch:{ 11T -> 0x26d9 }
            r55 = 150(0x96, float:2.1E-43)
            r54 = r41
            r51 = r0
            r52 = r41
            r53 = r6
            r56 = r27
            X.2Mh r9 = r51.A06(r52, r53, r54, r55, r56)     // Catch:{ 11T -> 0x26d9 }
            r0 = r41
            r9.A0d(r0)     // Catch:{ 11T -> 0x26d9 }
            r0 = 3019(0xbcb, float:4.23E-42)
            r5.BcH(r9, r0)     // Catch:{ 11T -> 0x26d9 }
        L_0x245f:
            if (r17 == 0) goto L_0x24db
            boolean r0 = r38.isEmpty()     // Catch:{ 11T -> 0x26d9 }
            if (r0 != 0) goto L_0x24db
            java.util.Set r0 = r38.entrySet()     // Catch:{ 11T -> 0x26d9 }
            java.util.Iterator r12 = r0.iterator()     // Catch:{ 11T -> 0x26d9 }
        L_0x246f:
            boolean r0 = r12.hasNext()     // Catch:{ 11T -> 0x26d9 }
            if (r0 == 0) goto L_0x24bb
            java.lang.Object r9 = r12.next()     // Catch:{ 11T -> 0x26d9 }
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9     // Catch:{ 11T -> 0x26d9 }
            java.lang.Object r10 = r9.getKey()     // Catch:{ 11T -> 0x26d9 }
            X.2pI r5 = new X.2pI     // Catch:{ 11T -> 0x26d9 }
            r5.<init>()     // Catch:{ 11T -> 0x26d9 }
            java.lang.Object r0 = r9.getKey()     // Catch:{ 11T -> 0x26d9 }
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0     // Catch:{ 11T -> 0x26d9 }
            X.C18070vi.A0d(r0, r11)     // Catch:{ 11T -> 0x26d9 }
            r5.A00 = r0     // Catch:{ 11T -> 0x26d9 }
            java.lang.Object r9 = r9.getValue()     // Catch:{ 11T -> 0x26d9 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ 11T -> 0x26d9 }
            X.C18070vi.A0d(r9, r11)     // Catch:{ 11T -> 0x26d9 }
            com.whatsapp.jid.UserJid r5 = r5.A00     // Catch:{ 11T -> 0x26d9 }
            java.lang.String r0 = "Required value was null."
            if (r5 == 0) goto L_0x24b5
            X.2nJ r0 = new X.2nJ     // Catch:{ 11T -> 0x26d9 }
            r53 = r41
            r56 = r41
            r51 = r0
            r52 = r41
            r54 = r5
            r55 = r9
            r51.<init>(r52, r53, r54, r55, r56)     // Catch:{ 11T -> 0x26d9 }
            r5 = r42
            r5.put(r10, r0)     // Catch:{ 11T -> 0x26d9 }
            goto L_0x246f
        L_0x24b5:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ 11T -> 0x26d9 }
            r1.<init>(r0)     // Catch:{ 11T -> 0x26d9 }
        L_0x24ba:
            throw r1     // Catch:{ 11T -> 0x26d9 }
        L_0x24bb:
            X.2sm r0 = new X.2sm     // Catch:{ 11T -> 0x26d9 }
            r0.<init>(r14, r1)     // Catch:{ 11T -> 0x26d9 }
            if (r36 != 0) goto L_0x24c6
            if (r50 != 0) goto L_0x24c6
            r66 = 0
        L_0x24c6:
            r62 = 1
            r64 = r11
            r65 = r11
            r57 = r13
            r58 = r2
            r59 = r0
            r60 = r41
            r61 = r42
            r63 = r11
            X.AnonymousClass126.A00(r57, r58, r59, r60, r61, r62, r63, r64, r65, r66)     // Catch:{ 11T -> 0x26d9 }
        L_0x24db:
            r8.A0I()     // Catch:{ 11T -> 0x26d9 }
            com.whatsapp.jid.PhoneUserJid r1 = r8.A0E     // Catch:{ 11T -> 0x26d9 }
            X.C17960vV.A07(r1)     // Catch:{ 11T -> 0x26d9 }
            r0 = r42
            boolean r0 = r0.containsKey(r1)     // Catch:{ 11T -> 0x26d9 }
            if (r0 != 0) goto L_0x24f7
            X.1E2 r1 = r8.A09()     // Catch:{ 11T -> 0x26d9 }
            r0 = r42
            boolean r0 = r0.containsKey(r1)     // Catch:{ 11T -> 0x26d9 }
            if (r0 == 0) goto L_0x25e3
        L_0x24f7:
            if (r17 != 0) goto L_0x25e3
            if (r15 != 0) goto L_0x25e3
            if (r18 != 0) goto L_0x25e3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 11T -> 0x26d9 }
            r1.<init>()     // Catch:{ 11T -> 0x26d9 }
            r0 = r39
            r1.append(r0)     // Catch:{ 11T -> 0x26d9 }
            r8.A0I()     // Catch:{ 11T -> 0x26d9 }
            com.whatsapp.jid.PhoneUserJid r0 = r8.A0E     // Catch:{ 11T -> 0x26d9 }
            r1.append(r0)     // Catch:{ 11T -> 0x26d9 }
            java.lang.String r0 = r1.toString()     // Catch:{ 11T -> 0x26d9 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 11T -> 0x26d9 }
            if (r16 != 0) goto L_0x2582
            X.0ve r5 = r2.A0U     // Catch:{ 11T -> 0x26d9 }
            r1 = 2367(0x93f, float:3.317E-42)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ 11T -> 0x26d9 }
            boolean r0 = X.C18020vd.A05(r0, r5, r1)     // Catch:{ 11T -> 0x26d9 }
            if (r0 == 0) goto L_0x25b6
            r1 = 2
            r0 = r44
            if (r0 == r1) goto L_0x252c
            r1 = 6
            if (r0 != r1) goto L_0x25b6
        L_0x252c:
            if (r4 == 0) goto L_0x25b6
            if (r23 != 0) goto L_0x25b6
            r0 = r88
            java.lang.String r5 = r0.A0F(r4)     // Catch:{ 11T -> 0x26d9 }
            int r0 = r2.A0K(r6)     // Catch:{ 11T -> 0x26d9 }
            r1 = 1
            if (r0 == r1) goto L_0x2585
            r5 = 4
            if (r0 == r5) goto L_0x2555
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ 11T -> 0x26d9 }
            r5.<init>()     // Catch:{ 11T -> 0x26d9 }
            java.lang.String r1 = "GroupChatManager/displaySubGroupLinkedWithJoinModeDisclaimer Unhandled groupJoinMode "
            r5.append(r1)     // Catch:{ 11T -> 0x26d9 }
            r5.append(r0)     // Catch:{ 11T -> 0x26d9 }
            java.lang.String r0 = r5.toString()     // Catch:{ 11T -> 0x26d9 }
            X.C17960vV.A0F(r11, r0)     // Catch:{ 11T -> 0x26d9 }
            goto L_0x25b6
        L_0x2555:
            X.1PQ r9 = r2.A0h     // Catch:{ 11T -> 0x26d9 }
            X.1PP r0 = r9.A02     // Catch:{ 11T -> 0x26d9 }
            X.205 r51 = r0.A01(r6, r1)     // Catch:{ 11T -> 0x26d9 }
            r53 = 104(0x68, float:1.46E-43)
            X.98P r0 = new X.98P     // Catch:{ 11T -> 0x26d9 }
            r50 = r0
            r52 = r41
            r54 = r25
            r50.<init>((X.AnonymousClass205) r51, (X.C62502rV) r52, (int) r53, (long) r54)     // Catch:{ 11T -> 0x26d9 }
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ 11T -> 0x26d9 }
            r12.<init>()     // Catch:{ 11T -> 0x26d9 }
            X.2md r10 = new X.2md     // Catch:{ 11T -> 0x26d9 }
            r5 = r41
            r10.<init>(r4, r5, r1, r11)     // Catch:{ 11T -> 0x26d9 }
            r12.add(r10)     // Catch:{ 11T -> 0x26d9 }
            r0.A1D(r12)     // Catch:{ 11T -> 0x26d9 }
            r5 = r34
            X.AnonymousClass1PQ.A01(r5, r0, r9, r1)     // Catch:{ 11T -> 0x26d9 }
            goto L_0x25af
        L_0x2582:
            r45 = r41
            goto L_0x25b6
        L_0x2585:
            X.1PQ r9 = r2.A0h     // Catch:{ 11T -> 0x26d9 }
            X.1PP r0 = r9.A02     // Catch:{ 11T -> 0x26d9 }
            X.205 r51 = r0.A01(r6, r1)     // Catch:{ 11T -> 0x26d9 }
            r53 = 102(0x66, float:1.43E-43)
            X.98R r0 = new X.98R     // Catch:{ 11T -> 0x26d9 }
            r50 = r0
            r52 = r41
            r54 = r25
            r50.<init>((X.AnonymousClass205) r51, (X.C62502rV) r52, (int) r53, (long) r54)     // Catch:{ 11T -> 0x26d9 }
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ 11T -> 0x26d9 }
            r12.<init>()     // Catch:{ 11T -> 0x26d9 }
            X.2md r10 = new X.2md     // Catch:{ 11T -> 0x26d9 }
            r10.<init>(r4, r5, r1, r11)     // Catch:{ 11T -> 0x26d9 }
            r12.add(r10)     // Catch:{ 11T -> 0x26d9 }
            r0.A1D(r12)     // Catch:{ 11T -> 0x26d9 }
            r5 = r34
            X.AnonymousClass1PQ.A01(r5, r0, r9, r1)     // Catch:{ 11T -> 0x26d9 }
        L_0x25af:
            X.1Uh r5 = r2.A0V     // Catch:{ 11T -> 0x26d9 }
            r1 = 3013(0xbc5, float:4.222E-42)
            r5.BcH(r0, r1)     // Catch:{ 11T -> 0x26d9 }
        L_0x25b6:
            r8.A0I()     // Catch:{ 11T -> 0x26d9 }
            com.whatsapp.jid.PhoneUserJid r0 = r8.A0E     // Catch:{ 11T -> 0x26d9 }
            java.util.List r61 = java.util.Collections.singletonList(r0)     // Catch:{ 11T -> 0x26d9 }
            r0 = r88
            java.lang.String r59 = r0.A0F(r4)     // Catch:{ 11T -> 0x26d9 }
            r50 = r2
            r51 = r41
            r52 = r30
            r53 = r4
            r54 = r6
            r55 = r43
            r56 = r34
            r57 = r45
            r58 = r46
            r60 = r31
            r62 = r44
            r63 = r25
            r65 = r16
            r50.A0Q(r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r65)     // Catch:{ 11T -> 0x26d9 }
            goto L_0x25ec
        L_0x25e3:
            if (r16 != 0) goto L_0x25ec
            r4 = r41
            r0 = r45
            X.C62502rV.A00(r4, r0, r4)     // Catch:{ 11T -> 0x26d9 }
        L_0x25ec:
            r0 = 3017(0xbc9, float:4.228E-42)
            if (r29 <= 0) goto L_0x262c
            if (r33 == 0) goto L_0x262c
            if (r17 == 0) goto L_0x25f7
            if (r18 != 0) goto L_0x268f
            goto L_0x2664
        L_0x25f7:
            r1 = r29
            r7.A0e(r6, r1)     // Catch:{ 11T -> 0x26d9 }
            X.0ve r5 = r2.A0U     // Catch:{ 11T -> 0x26d9 }
            r4 = 7141(0x1be5, float:1.0007E-41)
            X.0vf r1 = X.C18040vf.A02     // Catch:{ 11T -> 0x26d9 }
            boolean r4 = X.C18020vd.A05(r1, r5, r4)     // Catch:{ 11T -> 0x26d9 }
            X.1PQ r1 = r2.A0h     // Catch:{ 11T -> 0x26d9 }
            if (r4 == 0) goto L_0x261b
            r36 = r1
            r37 = r6
            r38 = r34
            r39 = r29
            r40 = r32
            r41 = r25
            X.2MS r1 = r36.A0B(r37, r38, r39, r40, r41)     // Catch:{ 11T -> 0x26d9 }
            goto L_0x268c
        L_0x261b:
            r36 = r1
            r37 = r6
            r38 = r34
            r39 = r41
            r40 = r29
            r41 = r25
            X.2MS r1 = r36.A0C(r37, r38, r39, r40, r41)     // Catch:{ 11T -> 0x26d9 }
            goto L_0x268c
        L_0x262c:
            if (r17 != 0) goto L_0x268f
            if (r29 <= 0) goto L_0x268f
            if (r15 != 0) goto L_0x268f
            if (r18 != 0) goto L_0x268f
            X.0ve r5 = r2.A0U     // Catch:{ 11T -> 0x26d9 }
            r4 = 7141(0x1be5, float:1.0007E-41)
            X.0vf r1 = X.C18040vf.A02     // Catch:{ 11T -> 0x26d9 }
            boolean r4 = X.C18020vd.A05(r1, r5, r4)     // Catch:{ 11T -> 0x26d9 }
            X.1PQ r1 = r2.A0h     // Catch:{ 11T -> 0x26d9 }
            if (r4 == 0) goto L_0x2653
            r40 = 5
            r36 = r1
            r37 = r6
            r38 = r41
            r39 = r29
            r41 = r25
            X.2MS r1 = r36.A0B(r37, r38, r39, r40, r41)     // Catch:{ 11T -> 0x26d9 }
            goto L_0x268c
        L_0x2653:
            r39 = r41
            r36 = r1
            r37 = r6
            r38 = r41
            r40 = r29
            r41 = r25
            X.2MS r1 = r36.A0C(r37, r38, r39, r40, r41)     // Catch:{ 11T -> 0x26d9 }
            goto L_0x268c
        L_0x2664:
            r1 = r29
            r7.A0e(r6, r1)     // Catch:{ 11T -> 0x26d9 }
            X.0ve r5 = r2.A0U     // Catch:{ 11T -> 0x26d9 }
            r4 = 7141(0x1be5, float:1.0007E-41)
            X.0vf r1 = X.C18040vf.A02     // Catch:{ 11T -> 0x26d9 }
            boolean r5 = X.C18020vd.A05(r1, r5, r4)     // Catch:{ 11T -> 0x26d9 }
            X.1PQ r1 = r2.A0h     // Catch:{ 11T -> 0x26d9 }
            r8.A0I()     // Catch:{ 11T -> 0x26d9 }
            com.whatsapp.jid.PhoneUserJid r4 = r8.A0E     // Catch:{ 11T -> 0x26d9 }
            if (r5 == 0) goto L_0x26a4
            r36 = r1
            r37 = r6
            r38 = r4
            r39 = r29
            r40 = r32
            r41 = r25
            X.2MS r1 = r36.A0B(r37, r38, r39, r40, r41)     // Catch:{ 11T -> 0x26d9 }
        L_0x268c:
            r2.A0O(r0, r1)     // Catch:{ 11T -> 0x26d9 }
        L_0x268f:
            X.00H r0 = r2.A15     // Catch:{ 11T -> 0x26d9 }
            java.lang.Object r0 = r0.get()     // Catch:{ 11T -> 0x26d9 }
            X.2jq r0 = (X.C57912jq) r0     // Catch:{ 11T -> 0x26d9 }
            r0.A00(r6)     // Catch:{ 11T -> 0x26d9 }
            X.1Mc r0 = r2.A0i     // Catch:{ 11T -> 0x26d9 }
            r1 = r35
            r4 = r43
            r0.A05(r6, r4, r1)     // Catch:{ 11T -> 0x26d9 }
            goto L_0x26b5
        L_0x26a4:
            r36 = r1
            r37 = r6
            r38 = r4
            r39 = r41
            r40 = r29
            r41 = r25
            X.2MS r1 = r36.A0C(r37, r38, r39, r40, r41)     // Catch:{ 11T -> 0x26d9 }
            goto L_0x268c
        L_0x26b5:
            if (r16 != 0) goto L_0x26ba
            r7.A0b(r6, r11)     // Catch:{ 11T -> 0x26d9 }
        L_0x26ba:
            X.00H r0 = r2.A0w     // Catch:{ 11T -> 0x26d9 }
            java.lang.Object r1 = r0.get()     // Catch:{ 11T -> 0x26d9 }
            X.10T r1 = (X.AnonymousClass10T) r1     // Catch:{ 11T -> 0x26d9 }
            X.4op r0 = new X.4op     // Catch:{ 11T -> 0x26d9 }
            r0.<init>(r13, r6, r11)     // Catch:{ 11T -> 0x26d9 }
            r1.notifyAllObservers(r0)     // Catch:{ 11T -> 0x26d9 }
            X.1V2 r2 = r3.A08     // Catch:{ 11T -> 0x26d9 }
            long r19 = r19 / r79
            r0 = r19
            r2.A01(r6, r0)     // Catch:{ 11T -> 0x26d9 }
            r0 = r48
            r2.A00(r6, r0)     // Catch:{ 11T -> 0x26d9 }
            return
        L_0x26d9:
            r1 = move-exception
            java.lang.String r0 = "GroupNotificationHandler/handleCreate/invalid-jid"
            com.whatsapp.util.Log.w(r0, r1)
            X.190 r3 = r3.A00
            java.lang.String r2 = "GroupNotificationHandler/handleCreate"
            java.lang.String r1 = "invalid-jid-received"
            r0 = 1
            r3.A0G(r2, r1, r0)
            return
        L_0x26ea:
            X.00H r3 = r11.A0m
            java.lang.Object r0 = r3.get()
            X.1kb r0 = (X.C34511kb) r0
            X.1MG r0 = r0.A08
            X.A2B r4 = r0.A02(r12)
            java.lang.Object r0 = r3.get()
            X.1kb r0 = (X.C34511kb) r0
            java.util.HashSet r16 = r0.A08(r12)
            java.util.Iterator r2 = r16.iterator()
        L_0x2706:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x271c
            java.lang.Object r0 = r2.next()
            X.A2B r0 = (X.A2B) r0
            int r0 = r0.A00
            if (r0 != r5) goto L_0x2706
            r2.remove()
            r17 = 1
            goto L_0x2706
        L_0x271c:
            java.lang.Object r0 = r3.get()
            X.1kb r0 = (X.C34511kb) r0
            java.util.HashSet r15 = r0.A07(r12)
            X.0ve r9 = r11.A0U
            r6 = 10539(0x292b, float:1.4768E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r13 = X.C18020vd.A05(r0, r9, r6)
            X.1M9 r2 = r11.A08
            if (r13 == 0) goto L_0x27d7
            r2.A0b(r12, r5)
        L_0x2737:
            X.AnonymousClass126.A0C(r11, r12)
            if (r17 == 0) goto L_0x276a
            if (r4 == 0) goto L_0x276a
            com.whatsapp.jid.GroupJid r4 = r4.A02
            X.1EC r4 = X.C42941yz.A00(r4)
            X.C17960vV.A07(r4)
            X.AnonymousClass126.A0C(r11, r4)
            boolean r0 = X.C18020vd.A05(r0, r9, r6)
            if (r0 == 0) goto L_0x27d2
            r2.A0b(r4, r5)
        L_0x2753:
            X.1Uh r2 = r11.A0V
            X.1PQ r0 = r11.A0h
            r21 = 17
            r20 = r8
            r17 = r0
            r18 = r4
            r19 = r8
            r22 = r25
            X.2Mh r0 = r17.A08(r18, r19, r20, r21, r22)
            r2.BcH(r0, r14)
        L_0x276a:
            java.lang.Object r2 = r3.get()
            X.1kb r2 = (X.C34511kb) r2
            java.util.List r0 = X.AnonymousClass2TL.A00(r16)
            r2.A0N(r12, r0)
            java.lang.Object r2 = r3.get()
            X.1kb r2 = (X.C34511kb) r2
            java.util.List r0 = X.AnonymousClass2TL.A00(r15)
            r2.A0N(r12, r0)
            java.util.Iterator r9 = r16.iterator()
        L_0x2788:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x27dc
            java.lang.Object r0 = r9.next()
            X.A2B r0 = (X.A2B) r0
            X.1Uh r4 = r11.A0V
            com.whatsapp.jid.GroupJid r0 = r0.A02
            X.1EC r3 = X.C42941yz.A00(r0)
            java.lang.String r0 = r1.A0F(r12)
            r6 = 0
            X.2md r2 = new X.2md
            r2.<init>(r12, r0, r10, r6)
            X.1PQ r0 = r11.A0h
            X.1PP r0 = r0.A02
            X.205 r14 = r0.A01(r3, r10)
            r16 = 105(0x69, float:1.47E-43)
            X.98S r3 = new X.98S
            r13 = r3
            r15 = r8
            r17 = r25
            r13.<init>((X.AnonymousClass205) r14, (X.C62502rV) r15, (int) r16, (long) r17)
            com.whatsapp.jid.GroupJid r5 = r2.A02
            java.lang.String r2 = r2.A03
            X.2md r0 = new X.2md
            r0.<init>(r5, r2, r10, r6)
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.C18070vi.A0X(r0)
            r3.A1D(r0)
            r0 = 3010(0xbc2, float:4.218E-42)
            r4.BcH(r3, r0)
            goto L_0x2788
        L_0x27d2:
            r2.A0c(r4, r10)
            goto L_0x2753
        L_0x27d7:
            r2.A0c(r12, r10)
            goto L_0x2737
        L_0x27dc:
            X.C62502rV.A00(r8, r7, r8)
            return
        L_0x27e0:
            r0 = 0
            X.C62502rV.A00(r0, r3, r0)
            r0 = 5
            r5.A0O(r0, r4)
            return
        L_0x27e9:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x27ee }
            goto L_0x27f2
        L_0x27ee:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x27f3 }
        L_0x27f2:
            throw r1     // Catch:{ all -> 0x27f3 }
        L_0x27f3:
            r1 = move-exception
            r12.close()     // Catch:{ all -> 0x2c6a }
            throw r1
        L_0x27f8:
            r12.close()     // Catch:{ all -> 0x2809 }
            r13.close()     // Catch:{ SQLiteDatabaseCorruptException | Error | RuntimeException -> 0x2813 }
            return
        L_0x27ff:
            r1 = move-exception
            r12.close()     // Catch:{ all -> 0x2804 }
            goto L_0x2808
        L_0x2804:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x2809 }
        L_0x2808:
            throw r1     // Catch:{ all -> 0x2809 }
        L_0x2809:
            r1 = move-exception
            r13.close()     // Catch:{ all -> 0x280e }
            goto L_0x2812
        L_0x280e:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ SQLiteDatabaseCorruptException | Error | RuntimeException -> 0x2813 }
        L_0x2812:
            throw r1     // Catch:{ SQLiteDatabaseCorruptException | Error | RuntimeException -> 0x2813 }
        L_0x2813:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            return
        L_0x2818:
            X.1V2 r1 = r3.A08
            r22 = r1
            boolean r1 = r1.A02(r2, r4)
            if (r1 == 0) goto L_0x2988
            X.126 r9 = r3.A0B
            r14 = 1
            X.2rV r8 = r3.A04(r14)
            long r20 = r4 * r79
            X.1BI r1 = r8.A02
            X.1EC r11 = X.C42941yz.A00(r1)
            X.C17960vV.A07(r11)
            X.1CJ r1 = r9.A0I
            int r3 = r1.A06(r11)
            r1 = 3
            r17 = 0
            if (r3 != r1) goto L_0x2980
            r10 = 1
            X.00H r1 = r9.A0m
            java.lang.Object r1 = r1.get()
            X.1kb r1 = (X.C34511kb) r1
            X.1EC r7 = r1.A05(r11)
        L_0x284c:
            X.1M9 r13 = r9.A08
            X.1E7 r3 = r13.A0G(r11)
            if (r3 == 0) goto L_0x28ca
            X.1Me r1 = r9.A0A
            java.lang.String r3 = r1.A0I(r3)
            boolean r1 = r3.equals(r0)
            if (r1 != 0) goto L_0x28c4
            X.AnonymousClass126.A0F(r9, r11, r7, r0, r10)
            java.lang.String r1 = "groupmgr/onGroupNewSubject/changed"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.1E7 r1 = r13.A0H(r11)
            r1.A0R = r0
            X.1M2 r12 = r13.A04
            r12.A0R(r1)
            X.1MA r12 = r13.A03
            r12.A0B(r1)
            if (r17 == 0) goto L_0x2890
            X.1KB r3 = r9.A04
            r1 = 38
            X.7Qq r0 = new X.7Qq
            r0.<init>(r9, r11, r1)
            r3.A0J(r0)
        L_0x2886:
            r0 = 0
            X.C62502rV.A00(r0, r8, r0)
        L_0x288a:
            r0 = r22
            r0.A01(r2, r4)
            return
        L_0x2890:
            r12 = 4
            X.1Uh r1 = r9.A0V
            if (r10 == 0) goto L_0x28aa
            X.1PQ r9 = r9.A0h
            r13 = r9
            r14 = r11
            r15 = r7
            r16 = r6
            r17 = r8
            r18 = r3
            r19 = r0
            X.2Mb r7 = r13.A0E(r14, r15, r16, r17, r18, r19, r20)
        L_0x28a6:
            r1.BcH(r7, r12)
            goto L_0x288a
        L_0x28aa:
            X.1PQ r7 = r9.A0h
            r16 = 0
            r15 = r7
            r17 = r11
            r18 = r8
            r19 = r14
            X.2Mh r7 = r15.A06(r16, r17, r18, r19, r20)
            X.98A r7 = (X.AnonymousClass98A) r7
            r7.A18(r0)
            r7.A01 = r3
            r7.A0d(r6)
            goto L_0x28a6
        L_0x28c4:
            java.lang.String r0 = "groupmgr/onGroupNewSubject/did not change"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x2886
        L_0x28ca:
            X.AnonymousClass126.A0F(r9, r11, r7, r0, r10)
            java.lang.String r1 = "groupmgr/onGroupNewSubject/new group"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.00H r1 = r9.A0y
            java.lang.Object r1 = r1.get()
            X.2mo r1 = (X.C59742mo) r1
            int r1 = r1.A00(r11)
            X.2tp r12 = new X.2tp
            r12.<init>(r11, r1)
            X.1E7 r10 = new X.1E7
            r10.<init>(r11)
            X.1yX r1 = X.C42661yX.A05
            r7 = 0
            java.lang.String r16 = "pn"
            r3 = 4
            X.C18070vi.A0d(r1, r3)
            r3 = 0
            java.lang.String r15 = "addGroupChatContact"
            com.whatsapp.util.Log.i((java.lang.String) r15)
            r10.A0R = r0
            java.lang.String r15 = java.lang.Long.toString(r20)
            r10.A0X = r15
            r10.A0j = r3
            r10.A13 = r3
            r10.A0f = r3
            r10.A11 = r3
            r10.A04 = r3
            r10.A0K = r7
            r10.A0t = r3
            r10.A09(r1)
            r10.A0k = r3
            r10.A06 = r3
            r10.A12 = r3
            r1 = r16
            r10.A0O = r1
            r10.A0r = r3
            r10.A0e = r3
            r10.A0i = r3
            r10.A03 = r3
            r10.A0n = r3
            X.1M2 r1 = r13.A04
            r1.A0O(r10)
            X.1MS r1 = r9.A0N
            X.C17960vV.A07(r11)
            X.C18070vi.A0d(r11, r3)
            java.util.Map r1 = r1.A05
            r1.put(r11, r12)
            if (r17 != 0) goto L_0x2975
            X.1Uh r3 = r9.A0V
            X.1PQ r1 = r9.A0h
            r19 = 11
            r15 = r1
            r16 = r7
            r17 = r11
            r18 = r8
            X.2Mh r1 = r15.A06(r16, r17, r18, r19, r20)
            r1.A0i(r0)
            r1.A0d(r6)
            r3.BcH(r1, r14)
        L_0x2952:
            X.0ve r3 = r9.A0U
            r1 = 7053(0x1b8d, float:9.883E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r3, r1)
            r7 = 2
            java.lang.String r6 = "new_subject"
            if (r0 == 0) goto L_0x2979
            int r0 = r12.A00
            if (r0 != 0) goto L_0x2979
            X.12M r3 = r9.A0Z
            java.lang.String r1 = r12.A0F()
            X.2sm r0 = new X.2sm
            r0.<init>(r6, r7, r1)
            r3.A0C(r0, r11)
            goto L_0x288a
        L_0x2975:
            X.C62502rV.A00(r7, r8, r7)
            goto L_0x2952
        L_0x2979:
            X.12M r0 = r9.A0Z
            r0.A0H(r11, r6, r7)
            goto L_0x288a
        L_0x2980:
            r10 = 0
            if (r3 != r14) goto L_0x2985
            r17 = 1
        L_0x2985:
            r7 = 0
            goto L_0x284c
        L_0x2988:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "GroupNotificationHandler/handleSubject/old timestamp, gjid="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x299d:
            java.lang.String r0 = "GroupChatManager/onGroupNewInviteCode received invite code for non-permanent group jid"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x29a2:
            r0 = 0
            X.C62502rV.A00(r0, r3, r0)
            return
        L_0x29a7:
            X.00H r1 = r7.A0u
            java.lang.Object r2 = r1.get()
            X.2jS r2 = (X.C57672jS) r2
            android.os.Handler r5 = X.AnonymousClass126.A1Z
            r4 = 3015(0xbc7, float:4.225E-42)
            X.C18070vi.A0d(r6, r0)
            r1 = 5
            X.C18070vi.A0d(r5, r1)
            X.128 r3 = r2.A01
            X.1PQ r2 = r2.A02
            X.2Mh r1 = r2.A0A(r6, r8, r9, r0)
            r3.BcH(r1, r4)
            r1 = 0
            X.2Mh r1 = r2.A0A(r13, r8, r1, r0)
            r0 = 3006(0xbbe, float:4.212E-42)
            android.os.Message r0 = r5.obtainMessage(r0, r1)
            r0.sendToTarget()
            return
        L_0x29d4:
            X.1PQ r1 = r7.A0h
            r0 = 0
            X.2Mh r1 = r1.A0A(r6, r8, r9, r0)
            r0 = 3006(0xbbe, float:4.212E-42)
            r7.A0O(r0, r1)
            return
        L_0x29e1:
            java.lang.String r7 = "v_id"
            r4 = r21
            long r4 = r1.A0D(r7, r4)     // Catch:{ all -> 0x3421 }
            X.1V2 r11 = r3.A08     // Catch:{ all -> 0x3421 }
            X.1V1 r7 = r11.A00     // Catch:{ all -> 0x3421 }
            java.util.Map r10 = r7.A02     // Catch:{ all -> 0x3421 }
            monitor-enter(r10)     // Catch:{ all -> 0x3421 }
            java.lang.Object r1 = r10.get(r2)     // Catch:{ all -> 0x2add }
            X.2dq r1 = (X.C54252dq) r1     // Catch:{ all -> 0x2add }
            if (r1 != 0) goto L_0x29fd
            X.2dq r1 = X.AnonymousClass1V1.A00(r7, r2)     // Catch:{ all -> 0x2add }
        L_0x29fd:
            long r7 = r1.A00     // Catch:{ all -> 0x2add }
            monitor-exit(r10)     // Catch:{ all -> 0x2add }
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 > 0) goto L_0x2abf
            X.126 r13 = r3.A0B     // Catch:{ all -> 0x3421 }
            r12 = 1
            X.2rV r10 = r3.A04(r12)     // Catch:{ all -> 0x3421 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x3421 }
            r7.<init>()     // Catch:{ all -> 0x3421 }
            java.lang.String r1 = "groupmgr/onGroupAnnouncementsToggled "
            r7.append(r1)     // Catch:{ all -> 0x3421 }
            r7.append(r10)     // Catch:{ all -> 0x3421 }
            java.lang.String r1 = "/"
            r7.append(r1)     // Catch:{ all -> 0x3421 }
            r7.append(r0)     // Catch:{ all -> 0x3421 }
            java.lang.String r1 = r7.toString()     // Catch:{ all -> 0x3421 }
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x3421 }
            X.1BI r1 = r10.A02     // Catch:{ all -> 0x3421 }
            X.1EC r8 = X.C42941yz.A00(r1)     // Catch:{ all -> 0x3421 }
            X.C17960vV.A07(r8)     // Catch:{ all -> 0x3421 }
            X.1M9 r14 = r13.A08     // Catch:{ all -> 0x3421 }
            X.1E7 r1 = r14.A0G(r8)     // Catch:{ all -> 0x3421 }
            if (r1 == 0) goto L_0x2aae
            boolean r1 = r1.A0f     // Catch:{ all -> 0x3421 }
            if (r1 == r0) goto L_0x2ab1
            java.lang.String r1 = "groupmgr/onGroupAnnouncementsToggled/changed"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x3421 }
            X.1E7 r7 = r14.A0H(r8)     // Catch:{ all -> 0x3421 }
            boolean r1 = r7.A0f     // Catch:{ all -> 0x3421 }
            if (r1 == r0) goto L_0x2a55
            r7.A0f = r0     // Catch:{ all -> 0x3421 }
            X.1M2 r1 = r14.A04     // Catch:{ all -> 0x3421 }
            r1.A0R(r7)     // Catch:{ all -> 0x3421 }
            X.1MA r1 = r14.A03     // Catch:{ all -> 0x3421 }
            r1.A0B(r7)     // Catch:{ all -> 0x3421 }
        L_0x2a55:
            X.1Uh r7 = r13.A0V     // Catch:{ all -> 0x3421 }
            X.1PQ r1 = r13.A0h     // Catch:{ all -> 0x3421 }
            r18 = 32
            if (r0 == 0) goto L_0x2a5f
            r18 = 31
        L_0x2a5f:
            r15 = 0
            r14 = r1
            r16 = r8
            r17 = r10
            r19 = r25
            X.2Mh r10 = r14.A06(r15, r16, r17, r18, r19)     // Catch:{ all -> 0x3421 }
            r10.A0d(r9)     // Catch:{ all -> 0x3421 }
            r1 = 3009(0xbc1, float:4.217E-42)
            r7.BcH(r10, r1)     // Catch:{ all -> 0x3421 }
            if (r0 != 0) goto L_0x2aba
            X.1MZ r0 = r13.A0O     // Catch:{ all -> 0x3421 }
            X.1MW r0 = r0.A08     // Catch:{ all -> 0x3421 }
            int r9 = r0.A09(r8)     // Catch:{ all -> 0x3421 }
            X.1CJ r0 = r13.A0I     // Catch:{ all -> 0x3421 }
            int r7 = r0.A06(r8)     // Catch:{ all -> 0x3421 }
            X.0ve r10 = r13.A0U     // Catch:{ all -> 0x3421 }
            r0 = 934(0x3a6, float:1.309E-42)
            X.0vf r1 = X.C18040vf.A02     // Catch:{ all -> 0x3421 }
            int r0 = X.C18020vd.A00(r1, r10, r0)     // Catch:{ all -> 0x3421 }
            if (r9 < r0) goto L_0x2aba
            r0 = 1946(0x79a, float:2.727E-42)
            int r0 = X.C18020vd.A00(r1, r10, r0)     // Catch:{ all -> 0x3421 }
            if (r9 > r0) goto L_0x2aba
            if (r7 == r12) goto L_0x2aba
            X.00H r0 = r13.A1C     // Catch:{ all -> 0x3421 }
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x3421 }
            X.2lC r1 = (X.C58752lC) r1     // Catch:{ all -> 0x3421 }
            X.C18070vi.A0d(r8, r6)     // Catch:{ all -> 0x3421 }
            X.1PP r0 = r1.A01     // Catch:{ all -> 0x3421 }
            X.205 r0 = r0.A01(r8, r12)     // Catch:{ all -> 0x3421 }
            r1.A01(r0)     // Catch:{ all -> 0x3421 }
            goto L_0x2aba
        L_0x2aae:
            java.lang.String r0 = "groupmgr/onGroupAnnouncementsToggled/new group"
            goto L_0x2ab3
        L_0x2ab1:
            java.lang.String r0 = "groupmgr/onGroupAnnouncementsToggled/did not change"
        L_0x2ab3:
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x3421 }
            r0 = 0
            X.C62502rV.A00(r0, r10, r0)     // Catch:{ all -> 0x3421 }
        L_0x2aba:
            r11.A00(r2, r4)     // Catch:{ all -> 0x3421 }
            goto L_0x341f
        L_0x2abf:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x3421 }
            r1.<init>()     // Catch:{ all -> 0x3421 }
            java.lang.String r0 = "GroupNotificationHandler/handleAnnouncement/old version, gjid="
            r1.append(r0)     // Catch:{ all -> 0x3421 }
            r1.append(r2)     // Catch:{ all -> 0x3421 }
            java.lang.String r0 = "; version="
            r1.append(r0)     // Catch:{ all -> 0x3421 }
            r1.append(r4)     // Catch:{ all -> 0x3421 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x3421 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x3421 }
            goto L_0x341f
        L_0x2add:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x2add }
            throw r0     // Catch:{ all -> 0x3421 }
        L_0x2ae0:
            java.lang.String r1 = "groupmgr/onGroupNoFrequentlyForwardedToggled/new group"
            goto L_0x2c41
        L_0x2ae4:
            java.lang.String r1 = "groupmgr/onGroupEphemeralChanged/did not change"
            goto L_0x2c41
        L_0x2ae8:
            java.lang.String r1 = "groupmgr/onGroupEphemeralChanged/new group"
            goto L_0x2c41
        L_0x2aec:
            int r1 = r5.size()
            if (r1 != r6) goto L_0x2c44
            java.util.Iterator r1 = r8.iterator()
            java.lang.Object r3 = r1.next()
            X.A2B r3 = (X.A2B) r3
            r2 = 0
            java.lang.Integer r10 = java.lang.Integer.valueOf(r2)
            java.lang.Object r1 = r5.get(r2)
            X.A2B r1 = (X.A2B) r1
            java.lang.Integer r11 = X.AnonymousClass00R.A0N
            r15 = r2
            r5 = r1
            r6 = r3
            r7 = r4
            r8 = r9
            r9 = r0
            r12 = r25
            r14 = r2
            X.AnonymousClass126.A07(r5, r6, r7, r8, r9, r10, r11, r12, r14, r15)
            return
        L_0x2b16:
            java.lang.String r0 = "parent_group"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x2bb8
            java.util.LinkedHashSet r6 = r3.A02(r1, r12)
            X.126 r11 = r3.A0B
            X.2rV r10 = r3.A04(r12)
            int r0 = r6.size()
            if (r0 != r12) goto L_0x2b46
            r0 = 3
            if (r4 == r0) goto L_0x2b46
            X.1CJ r0 = r11.A0I
            int r1 = r0.A06(r2)
            r0 = 6
            if (r1 != r0) goto L_0x2b4b
            X.0ve r3 = r11.A0U
            r1 = 5021(0x139d, float:7.036E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r3, r1)
            if (r0 == 0) goto L_0x2b4b
        L_0x2b46:
            r0 = 0
            X.C62502rV.A00(r0, r10, r0)
            return
        L_0x2b4b:
            java.util.Iterator r0 = r6.iterator()
            java.lang.Object r14 = r0.next()
            X.A2B r14 = (X.A2B) r14
            X.00H r0 = r11.A0m
            java.lang.Object r3 = r0.get()
            X.1kb r3 = (X.C34511kb) r3
            com.whatsapp.jid.GroupJid r8 = r14.A02
            X.1EC r1 = X.C42941yz.A00(r8)
            java.util.List r0 = java.util.Collections.singletonList(r2)
            r3.A0N(r1, r0)
            r7 = 3010(0xbc2, float:4.218E-42)
            if (r4 != r5) goto L_0x2b94
            java.lang.String r0 = "groupChatManager/unlink due to delete parent group"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1Uh r13 = r11.A0V
            X.1PQ r1 = r11.A0h
            X.1Me r0 = r11.A0A
            java.lang.String r6 = r0.A0Y(r8)
            X.1PP r0 = r1.A02
            X.205 r5 = r0.A01(r2, r12)
            r4 = 87
            X.2MU r3 = new X.2MU
            r0 = r25
            r3.<init>(r5, r4, r0)
            r3.A00 = r6
            r3.A0d(r9)
            r13.BcH(r3, r7)
        L_0x2b94:
            X.1PQ r3 = r11.A0h
            java.lang.String r4 = r14.A06
            X.1PP r0 = r3.A02
            X.205 r13 = r0.A01(r2, r12)
            r14 = 0
            r15 = 116(0x74, float:1.63E-43)
            X.98G r1 = new X.98G
            r12 = r1
            r16 = r25
            r12.<init>((X.AnonymousClass205) r13, (X.C62502rV) r14, (int) r15, (long) r16)
            r1.A03 = r10
            r1.A1F(r8, r4)
            r0 = 0
            X.AnonymousClass1PQ.A01(r9, r1, r3, r0)
            X.1Uh r0 = r11.A0V
            r0.BcH(r1, r7)
            return
        L_0x2bb8:
            java.lang.String r0 = "sibling_group"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x2c49
            java.util.LinkedHashSet r5 = r3.A02(r1, r5)
            X.126 r7 = r3.A0B
            X.2rV r0 = r3.A04(r12)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)
            java.util.Iterator r4 = r5.iterator()
        L_0x2bd3:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x2bf5
            java.lang.Object r1 = r4.next()
            X.A2B r1 = (X.A2B) r1
            com.whatsapp.jid.GroupJid r1 = r1.A02
            X.1EC r3 = X.C42941yz.A00(r1)
            if (r3 == 0) goto L_0x2bd3
            X.00H r1 = r7.A0m
            java.lang.Object r1 = r1.get()
            X.1kb r1 = (X.C34511kb) r1
            X.1MG r1 = r1.A08
            r1.A06(r3)
            goto L_0x2bd3
        L_0x2bf5:
            boolean r1 = r5.isEmpty()
            if (r1 != 0) goto L_0x2c44
            X.1Uh r4 = r7.A0V
            X.00H r1 = r7.A0m
            java.lang.Object r1 = r1.get()
            X.1kb r1 = (X.C34511kb) r1
            X.1EC r6 = r1.A05(r2)
            X.1PQ r1 = r7.A0h
            int r7 = r8.intValue()
            r3 = 4
            X.1PP r1 = r1.A02
            X.205 r11 = r1.A01(r2, r12)
            r12 = 0
            if (r7 != r3) goto L_0x2c34
            r13 = 171(0xab, float:2.4E-43)
            X.98K r1 = new X.98K
            r10 = r1
            r14 = r25
            r10.<init>((X.AnonymousClass205) r11, (X.C62502rV) r12, (int) r13, (long) r14)
        L_0x2c23:
            r1.A03 = r0
            r1.A0d(r9)
            r1.A1F(r6)
            r1.A1G(r5)
            r0 = 3011(0xbc3, float:4.22E-42)
            r4.BcH(r1, r0)
            return
        L_0x2c34:
            r13 = 109(0x6d, float:1.53E-43)
            X.98M r1 = new X.98M
            r10 = r1
            r14 = r25
            r10.<init>((X.AnonymousClass205) r11, (X.C62502rV) r12, (int) r13, (long) r14)
            goto L_0x2c23
        L_0x2c3f:
            java.lang.String r1 = "groupmgr/onGroupNoFrequentlyForwardedToggled/did not change"
        L_0x2c41:
            com.whatsapp.util.Log.i((java.lang.String) r1)
        L_0x2c44:
            r1 = 0
            X.C62502rV.A00(r1, r0, r1)
            return
        L_0x2c49:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "GroupNotificationHandler/handleGroupUnlinked/incorrect link type = "
            r1.append(r0)
            r1.append(r6)
            goto L_0x3494
        L_0x2c58:
            java.lang.String r0 = "GroupNotificationHandler/handleAnnouncement/null growth lock, ignoring"
            goto L_0x2c91
        L_0x2c5b:
            r1 = move-exception
            r12.close()     // Catch:{ all -> 0x2c60 }
            goto L_0x2c64
        L_0x2c60:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x2c65 }
        L_0x2c64:
            throw r1     // Catch:{ all -> 0x2c65 }
        L_0x2c65:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x2c6a }
            throw r1
        L_0x2c6a:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        L_0x2c6f:
            r1 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x2c6f }
            throw r1
        L_0x2c72:
            java.lang.String r0 = "groupmgr/onGroupMemberAddModeToggled/did not change"
            goto L_0x2c91
        L_0x2c75:
            java.lang.String r0 = "groupmgr/onGroupMemberAddModeToggled/new group"
            goto L_0x2c91
        L_0x2c78:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "GroupNotificationHandler/handleSubject/parent_group_jid is null: "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = " or localParentGroupJid is null: "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        L_0x2c91:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x2c95:
            if (r9 != 0) goto L_0x2d02
            X.11S r0 = r3.A01
            r0.A0I()
            com.whatsapp.jid.PhoneUserJid r6 = r0.A0E
            X.C17960vV.A07(r6)
        L_0x2ca1:
            X.9tC r0 = new X.9tC
            r14 = r0
            r15 = r2
            r17 = r6
            r18 = r5
            r19 = r8
            r20 = r25
            r14.<init>(r15, r16, r17, r18, r19, r20)
            r7.add(r0)
        L_0x2cb3:
            X.126 r6 = r3.A0B
            java.lang.String r8 = "suppress_sys_msg"
            java.lang.String r0 = "false"
            java.lang.String r0 = r1.A0Q(r8, r0)
            boolean r13 = java.lang.Boolean.parseBoolean(r0)
            X.1MZ r8 = r6.A0O
            boolean r12 = r8.A0K(r2)
            X.1M9 r11 = r6.A08
            X.1E7 r0 = r11.A0H(r2)
            boolean r1 = X.C62822s3.A02(r0)
            if (r12 != 0) goto L_0x2fe0
            if (r1 == 0) goto L_0x2d0f
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r13 = r7.iterator()
        L_0x2cdf:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x2d04
            java.lang.Object r0 = r13.next()
            X.9tC r0 = (X.C195349tC) r0
            com.whatsapp.jid.UserJid r11 = r0.A03
            com.whatsapp.jid.UserJid r10 = r0.A04
            long r0 = r0.A00
            X.9sD r5 = new X.9sD
            r16 = r11
            r17 = r10
            r18 = r0
            r14 = r5
            r15 = r2
            r14.<init>(r15, r16, r17, r18)
            r12.add(r5)
            goto L_0x2cdf
        L_0x2d02:
            r6 = r9
            goto L_0x2ca1
        L_0x2d04:
            X.00H r0 = r6.A16
            java.lang.Object r0 = r0.get()
            X.9re r0 = (X.C194389re) r0
            r0.A02(r12)
        L_0x2d0f:
            X.A2B r10 = X.AnonymousClass126.A02(r6, r2)
            java.util.Iterator r5 = r7.iterator()
        L_0x2d17:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x304f
            java.lang.Object r0 = r5.next()
            X.9tC r0 = (X.C195349tC) r0
            X.11S r1 = r6.A05
            com.whatsapp.jid.UserJid r0 = r0.A04
            boolean r0 = r1.A0O(r0)
            if (r0 == 0) goto L_0x2d17
            boolean r0 = r8.A0J(r2)
            if (r0 != 0) goto L_0x304f
            if (r10 == 0) goto L_0x304f
            X.0ve r5 = r6.A0U
            r1 = 8070(0x1f86, float:1.1308E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r5, r1)
            if (r0 == 0) goto L_0x304f
            X.1MG r1 = r6.A0a
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r1.A07(r2, r0)
            if (r0 == 0) goto L_0x304f
            X.1Rg r0 = r6.A0b
            r0.A00(r2)
            goto L_0x304f
        L_0x2d55:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "GroupNotificationHandler/handleCreatedGroupMembershipApprovalRequests/incorrect membership_approval_request.requestMethod="
            r1.append(r0)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            X.1UI r0 = new X.1UI
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x2d6c:
            X.126 r5 = r3.A0B     // Catch:{ all -> 0x3421 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x3421 }
            r4.<init>()     // Catch:{ all -> 0x3421 }
            java.lang.String r1 = "groupmgr/onAllowNonAdminSubGroupCreation/"
            r4.append(r1)     // Catch:{ all -> 0x3421 }
            r4.append(r2)     // Catch:{ all -> 0x3421 }
            java.lang.String r1 = "/"
            r4.append(r1)     // Catch:{ all -> 0x3421 }
            r4.append(r0)     // Catch:{ all -> 0x3421 }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x3421 }
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x3421 }
            X.1EC r7 = X.C42941yz.A00(r2)     // Catch:{ all -> 0x3421 }
            if (r7 != 0) goto L_0x2d97
            java.lang.String r0 = "groupmgr/onAllowNonAdminSubGroupCreation/parent not group"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x3421 }
            goto L_0x341f
        L_0x2d97:
            X.10I r2 = r5.A0k     // Catch:{ all -> 0x3421 }
            r8 = 2
            X.7R2 r1 = new X.7R2     // Catch:{ all -> 0x3421 }
            r4 = r1
            r6 = r9
            r9 = r25
            r11 = r0
            r4.<init>(r5, r6, r7, r8, r9, r11)     // Catch:{ all -> 0x3421 }
            r2.CGF(r1)     // Catch:{ all -> 0x3421 }
            goto L_0x341f
        L_0x2da9:
            java.lang.String r5 = "reports"
            boolean r5 = X.C29621ca.A07(r1, r5)
            if (r5 == 0) goto L_0x2dbe
            X.10I r5 = r3.A0F
            r1 = 15
            X.3C5 r0 = new X.3C5
            r0.<init>(r3, r4, r2, r1)
            r5.CGF(r0)
            return
        L_0x2dbe:
            java.lang.String r5 = "created_sub_group_suggestion"
            boolean r7 = X.C29621ca.A07(r1, r5)
            if (r7 == 0) goto L_0x3137
            java.lang.String r1 = "notification"
            X.C29621ca.A04(r4, r1)
            X.2rm r1 = new X.2rm
            r1.<init>()
            java.lang.String[] r7 = new java.lang.String[r0]
            java.lang.String r8 = "participant"
            r7[r6] = r8
            java.lang.Class<com.whatsapp.jid.UserJid> r29 = com.whatsapp.jid.UserJid.class
            r13 = -9007199254740991(0xffe0000000000001, double:-8.988465674311582E307)
            java.lang.Long r30 = java.lang.Long.valueOf(r13)
            r13 = 9007199254740991(0x1fffffffffffff, double:4.4501477170144023E-308)
            java.lang.Long r31 = java.lang.Long.valueOf(r13)
            r20 = 0
            r27 = r1
            r28 = r4
            r32 = r20
            r33 = r7
            r34 = r6
            java.lang.Object r7 = r27.A05(r28, r29, r30, r31, r32, r33, r34)
            if (r7 == 0) goto L_0x312f
            r8 = 3
            java.lang.String[] r11 = new java.lang.String[r8]
            r11[r6] = r5
            java.lang.String r19 = "sub_group_suggestion"
            r11[r0] = r19
            java.lang.String r13 = "jid"
            r7 = 2
            r11[r7] = r13
            java.lang.Class<X.1EC> r34 = X.AnonymousClass1EC.class
            r32 = r1
            r33 = r4
            r35 = r30
            r36 = r31
            r37 = r20
            r38 = r11
            r39 = r6
            java.lang.Object r18 = r32.A05(r33, r34, r35, r36, r37, r38, r39)
            r11 = r18
            X.1EC r11 = (X.AnonymousClass1EC) r11
            r18 = r11
            if (r11 == 0) goto L_0x3127
            java.lang.String[] r11 = new java.lang.String[r8]
            r11[r6] = r5
            r11[r0] = r19
            java.lang.String r13 = "creator"
            r11[r7] = r13
            r32 = r20
            r33 = r11
            r34 = r6
            java.lang.Object r17 = r27.A05(r28, r29, r30, r31, r32, r33, r34)
            r11 = r17
            com.whatsapp.jid.UserJid r11 = (com.whatsapp.jid.UserJid) r11
            r17 = r11
            if (r11 == 0) goto L_0x311f
            java.lang.String[] r11 = new java.lang.String[r8]
            r11[r6] = r5
            r11[r0] = r19
            java.lang.String r13 = "creation"
            r11[r7] = r13
            java.lang.Class r29 = java.lang.Long.TYPE
            java.lang.Long r30 = java.lang.Long.valueOf(r21)
            r33 = r11
            java.lang.Object r16 = r27.A05(r28, r29, r30, r31, r32, r33, r34)
            r11 = r16
            java.lang.Number r11 = (java.lang.Number) r11
            r16 = r11
            if (r11 == 0) goto L_0x3117
            r11 = 4
            java.lang.String[] r11 = new java.lang.String[r11]
            r11[r6] = r5
            r11[r0] = r19
            r11[r7] = r10
            java.lang.String r10 = "#elementValue"
            r11[r8] = r10
            java.lang.Class<java.lang.String> r29 = java.lang.String.class
            r13 = 1
            java.lang.Long r30 = java.lang.Long.valueOf(r13)
            r13 = 65536(0x10000, double:3.2379E-319)
            java.lang.Long r31 = java.lang.Long.valueOf(r13)
            r33 = r11
            java.lang.Object r10 = r27.A04(r28, r29, r30, r31, r32, r33)
            java.lang.String r10 = (java.lang.String) r10
            if (r10 == 0) goto L_0x310f
            X.A97 r13 = X.A97.A00
            r14 = 22
            X.AhU r11 = new X.AhU
            r11.<init>(r13, r14)
            java.lang.Object r11 = r11.BCF(r4, r1)
            if (r11 == 0) goto L_0x3107
            java.lang.String[] r14 = new java.lang.String[r8]
            r14[r6] = r5
            r14[r0] = r19
            r14[r7] = r12
            r12 = 23
            X.AhU r11 = new X.AhU
            r11.<init>(r13, r12)
            r1.A02(r4, r11, r14)
            java.lang.String[] r14 = new java.lang.String[r8]
            r14[r6] = r5
            r14[r0] = r19
            java.lang.String r11 = "is_existing_group"
            r14[r7] = r11
            r12 = 24
            X.AhU r11 = new X.AhU
            r11.<init>(r13, r12)
            java.lang.Object r11 = r1.A02(r4, r11, r14)
            X.9CY r11 = (X.AnonymousClass9CY) r11
            java.lang.String[] r15 = new java.lang.String[r8]
            r15[r6] = r5
            r15[r0] = r19
            java.lang.String r12 = "participant_count"
            r15[r7] = r12
            r12 = 25
            X.AhU r14 = new X.AhU
            r14.<init>(r13, r12)
            java.lang.Object r12 = r1.A02(r4, r14, r15)
            X.9CX r12 = (X.AnonymousClass9CX) r12
            java.lang.String[] r15 = new java.lang.String[r8]
            r15[r6] = r5
            r15[r0] = r19
            java.lang.String r8 = "hidden_group"
            r15[r7] = r8
            r8 = 26
            X.AhU r14 = new X.AhU
            r14.<init>(r13, r8)
            java.lang.Object r8 = r1.A02(r4, r14, r15)
            java.lang.String[] r1 = new java.lang.String[r7]
            r1[r6] = r5
            r1[r0] = r19
            X.2V8 r0 = new X.2V8
            r0.<init>()
            java.util.ArrayList r0 = X.C29601cY.A00(r4, r1)
            java.lang.Object r5 = r0.get(r6)
            X.1ca r5 = (X.C29621ca) r5
            java.lang.String r1 = "notify"
            r0 = r20
            java.lang.String r4 = r4.A0Q(r1, r0)
            X.C17960vV.A07(r2)
            X.1yX r0 = X.A8d.A04(r5, r5)
            java.lang.String r5 = r0.A03
            if (r12 == 0) goto L_0x2f16
            long r0 = r12.A00
            int r6 = (int) r0
        L_0x2f16:
            if (r11 == 0) goto L_0x2fa3
            java.lang.String r0 = r11.A01
            boolean r37 = java.lang.Boolean.parseBoolean(r0)
        L_0x2f1e:
            r38 = 0
            if (r8 == 0) goto L_0x2f24
            r38 = 1
        L_0x2f24:
            X.126 r7 = r3.A0B
            long r33 = r16.longValue()
            long r0 = (long) r6
            X.2mu r6 = new X.2mu
            r29 = r18
            r30 = r17
            r31 = r10
            r32 = r5
            r35 = r0
            r27 = r6
            r28 = r2
            r27.<init>(r28, r29, r30, r31, r32, r33, r35, r37, r38)
            X.00H r0 = r7.A13
            java.lang.Object r0 = r0.get()
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager r0 = (com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager) r0
            r0.A04(r6, r2)
            X.11S r0 = r7.A05
            boolean r0 = r0.A0O(r9)
            if (r0 != 0) goto L_0x304f
            X.1MZ r14 = r7.A0O
            boolean r0 = r14.A0K(r2)
            if (r0 == 0) goto L_0x304f
            X.1Uh r13 = r7.A0V
            X.1PQ r1 = r7.A0h
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r12 = "SystemMessageFactory/newSubGroupSuggestionSystemMessage/groupjid="
            r0.append(r12)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1PP r11 = r1.A02
            r0 = 1
            X.205 r8 = r11.A01(r2, r0)
            r6 = 145(0x91, float:2.03E-43)
            X.2Mh r5 = new X.2Mh
            r0 = r25
            r5.<init>(r8, r6, r0)
            r0 = r17
            r5.A0d(r0)
            r5.A0i(r10)
            r6 = 3018(0xbca, float:4.229E-42)
            r13.BcH(r5, r6)
            X.00H r0 = r7.A0n
            java.lang.Object r0 = r0.get()
            X.2l0 r0 = (X.C58632l0) r0
            X.1EC r1 = r0.A00(r2)
            if (r1 != 0) goto L_0x2fa7
            java.lang.String r0 = "groupmgr/onSubgroupSuggestion/no cag"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x304f
        L_0x2fa3:
            r37 = 0
            goto L_0x2f1e
        L_0x2fa7:
            boolean r0 = r14.A0J(r1)
            if (r0 != 0) goto L_0x2fb4
            java.lang.String r0 = "groupmgr/onSubgroupSuggestion/not participant"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x304f
        L_0x2fb4:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r12)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 1
            X.205 r7 = r11.A01(r1, r0)
            r5 = 145(0x91, float:2.03E-43)
            X.2Mh r2 = new X.2Mh
            r0 = r25
            r2.<init>(r7, r5, r0)
            r0 = r17
            r2.A0d(r0)
            r2.A0i(r10)
            r13.BcH(r2, r6)
            goto L_0x304f
        L_0x2fe0:
            X.00H r0 = r6.A0z
            java.lang.Object r0 = r0.get()
            X.9u7 r0 = (X.C195899u7) r0
            r0.A03(r7)
            r8 = 0
            r11.A0g(r2, r8)
            if (r13 != 0) goto L_0x304f
            if (r1 == 0) goto L_0x30c0
            java.lang.Object r0 = r7.get(r8)
            X.9tC r0 = (X.C195349tC) r0
            java.lang.String r0 = r0.A05
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x30c0
            X.11S r2 = r6.A05
            java.lang.Object r0 = r7.get(r8)
            X.9tC r0 = (X.C195349tC) r0
            com.whatsapp.jid.UserJid r0 = r0.A03
            boolean r0 = r2.A0O(r0)
            if (r0 == 0) goto L_0x3053
            X.190 r5 = r6.A03
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "gid="
            r1.append(r0)
            java.lang.Object r0 = r7.get(r8)
            X.9tC r0 = (X.C195349tC) r0
            X.1EC r0 = r0.A01
            r1.append(r0)
            java.lang.String r0 = ", me jid = "
            r1.append(r0)
            r2.A0I()
            com.whatsapp.jid.PhoneUserJid r0 = r2.A0E
            r1.append(r0)
            java.lang.String r0 = ", requestor jid = "
            r1.append(r0)
            java.lang.Object r0 = r7.get(r8)
            X.9tC r0 = (X.C195349tC) r0
            com.whatsapp.jid.UserJid r0 = r0.A04
            r1.append(r0)
            java.lang.String r2 = r1.toString()
            r1 = 1
            java.lang.String r0 = "Unexpected args while creating nonadmingjr system message"
            r5.A0G(r0, r2, r1)
        L_0x304f:
            r3.A03(r9, r4)
            return
        L_0x3053:
            X.1PQ r11 = r6.A0h
            java.lang.Object r10 = r7.get(r8)
            X.9tC r10 = (X.C195349tC) r10
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "SystemMessageFactory/newGroupMembershipApprovalRequestsNonAdminAddSystemMessage/groupjid="
            r1.append(r0)
            X.1EC r2 = r10.A01
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            long r0 = r10.A00
            r15 = 120(0x78, float:1.68E-43)
            r12 = r5
            r13 = r2
            r14 = r5
            r16 = r0
            X.2Mh r5 = r11.A06(r12, r13, r14, r15, r16)
            X.2MV r5 = (X.AnonymousClass2MV) r5
            com.whatsapp.jid.UserJid r0 = r10.A04
            r5.A0d(r0)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r7.iterator()
        L_0x308e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x30a0
            java.lang.Object r0 = r1.next()
            X.9tC r0 = (X.C195349tC) r0
            com.whatsapp.jid.UserJid r0 = r0.A04
            r2.add(r0)
            goto L_0x308e
        L_0x30a0:
            com.whatsapp.jid.UserJid r1 = r10.A03
            X.C17960vV.A07(r1)
            X.C18070vi.A0d(r1, r8)
            r0 = 1
            r5.A00 = r1
            r5.A01 = r2
            com.whatsapp.jid.UserJid[] r0 = new com.whatsapp.jid.UserJid[r0]
            r0[r8] = r1
            java.util.ArrayList r0 = X.AnonymousClass1ZU.A06(r0)
            r0.addAll(r2)
            r5.A01 = r0
            r0 = 3026(0xbd2, float:4.24E-42)
            r6.A0O(r0, r5)
            goto L_0x304f
        L_0x30c0:
            java.util.Iterator r10 = r7.iterator()
        L_0x30c4:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x304f
            java.lang.Object r8 = r10.next()
            X.9tC r8 = (X.C195349tC) r8
            X.1PQ r7 = r6.A0h
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "SystemMessageFactory/newGroupMembershipApprovalRequestSystemMessage/groupjid="
            r1.append(r0)
            X.1EC r2 = r8.A01
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            long r0 = r8.A00
            r15 = 83
            r12 = r5
            r11 = r7
            r13 = r2
            r14 = r5
            r16 = r0
            X.2Mh r1 = r11.A06(r12, r13, r14, r15, r16)
            X.989 r1 = (X.AnonymousClass989) r1
            com.whatsapp.jid.UserJid r0 = r8.A04
            r1.A0d(r0)
            java.lang.String r0 = r8.A05
            r1.A00 = r0
            r0 = 3020(0xbcc, float:4.232E-42)
            r6.A0O(r0, r1)
            goto L_0x30c4
        L_0x3107:
            java.lang.String r1 = r1.A00
            X.1UI r0 = new X.1UI
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x310f:
            java.lang.String r1 = r1.A00
            X.1UI r0 = new X.1UI
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x3117:
            java.lang.String r1 = r1.A00
            X.1UI r0 = new X.1UI
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x311f:
            java.lang.String r1 = r1.A00
            X.1UI r0 = new X.1UI
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x3127:
            java.lang.String r1 = r1.A00
            X.1UI r0 = new X.1UI
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x312f:
            java.lang.String r1 = r1.A00
            X.1UI r0 = new X.1UI
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x3137:
            java.lang.String r5 = "revoked_sub_group_suggestions"
            boolean r5 = X.C29621ca.A07(r1, r5)
            if (r5 == 0) goto L_0x31e3
            java.lang.String r5 = "notify"
            r0 = 0
            java.lang.String r6 = r4.A0Q(r5, r0)
            X.C17960vV.A07(r2)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.lang.String r0 = "sub_group_suggestion"
            java.util.List r0 = r1.A0R(r0)
            java.util.Iterator r10 = r0.iterator()
        L_0x3159:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x318e
            java.lang.Object r8 = r10.next()
            X.1ca r8 = (X.C29621ca) r8
            java.lang.Class<X.1EC> r1 = X.AnonymousClass1EC.class
            java.lang.String r0 = "jid"
            com.whatsapp.jid.Jid r7 = r8.A0F(r1, r0)
            X.1EC r7 = (X.AnonymousClass1EC) r7
            java.lang.String r1 = "reason"
            r0 = 0
            java.lang.String r4 = r8.A0Q(r1, r0)
            java.lang.Class<com.whatsapp.jid.UserJid> r1 = com.whatsapp.jid.UserJid.class
            java.lang.String r0 = "creator"
            com.whatsapp.jid.Jid r0 = r8.A0F(r1, r0)
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            X.2m5 r1 = new X.2m5
            r1.<init>(r2, r7, r0)
            X.1D6 r0 = new X.1D6
            r0.<init>(r1, r4)
            r5.add(r0)
            goto L_0x3159
        L_0x318e:
            X.126 r0 = r3.A0B
            X.00H r0 = r0.A13
            java.lang.Object r7 = r0.get()
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager r7 = (com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager) r7
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            r0 = 10
            int r0 = X.C29351c6.A0C(r5, r0)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r0)
            java.util.Iterator r1 = r5.iterator()
        L_0x31ab:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x31bd
            java.lang.Object r0 = r1.next()
            X.1D6 r0 = (X.AnonymousClass1D6) r0
            java.lang.Object r0 = r0.first
            r4.add(r0)
            goto L_0x31ab
        L_0x31bd:
            X.00H r0 = r7.A09
            java.lang.Object r0 = r0.get()
            X.2lJ r0 = (X.C58822lJ) r0
            r0.A01(r2, r4)
            java.util.SortedSet r1 = r7.A03(r2)
            X.3IN r0 = new X.3IN
            r0.<init>(r4)
            X.C29401cD.A0K(r1, r0)
            X.1KB r4 = r7.A00
            r1 = 1
            X.3Cl r0 = new X.3Cl
            r0.<init>(r7, r2, r5, r1)
            r4.A0J(r0)
            r3.A03(r9, r6)
            return
        L_0x31e3:
            java.lang.String r5 = "change_number"
            boolean r5 = X.C29621ca.A07(r1, r5)
            if (r5 == 0) goto L_0x3388
            java.lang.String r5 = "notify"
            r0 = 0
            java.lang.String r11 = r4.A0Q(r5, r0)
            X.C17960vV.A07(r2)
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            java.lang.String r5 = "jid"
            com.whatsapp.jid.Jid r10 = r1.A0F(r0, r5)
            com.whatsapp.jid.UserJid r10 = (com.whatsapp.jid.UserJid) r10
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.lang.String r0 = "sub_group_suggestion"
            java.util.List r0 = r1.A0R(r0)
            java.util.Iterator r4 = r0.iterator()
        L_0x320f:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x322c
            java.lang.Object r1 = r4.next()
            X.1ca r1 = (X.C29621ca) r1
            java.lang.Class<X.1EC> r0 = X.AnonymousClass1EC.class
            com.whatsapp.jid.Jid r1 = r1.A0F(r0, r5)
            X.1EC r1 = (X.AnonymousClass1EC) r1
            X.2m5 r0 = new X.2m5
            r0.<init>(r2, r1, r9)
            r8.add(r0)
            goto L_0x320f
        L_0x322c:
            X.126 r0 = r3.A0B
            X.00H r0 = r0.A13
            java.lang.Object r1 = r0.get()
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager r1 = (com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager) r1
            r20 = 0
            X.C18070vi.A0d(r2, r6)
            r0 = 2
            X.C18070vi.A0d(r9, r0)
            r0 = 3
            X.C18070vi.A0d(r10, r0)
            X.1Mz r12 = r1.A01
            java.lang.Object r0 = r12.A0A(r2)
            r19 = 0
            if (r0 != 0) goto L_0x324f
            r19 = 1
        L_0x324f:
            X.00H r0 = r1.A09
            java.lang.Object r0 = r0.get()
            X.2lJ r0 = (X.C58822lJ) r0
            X.1Lt r0 = r0.A00     // Catch:{ SQLiteDatabaseCorruptException -> 0x32ee }
            X.1au r5 = r0.A06()     // Catch:{ SQLiteDatabaseCorruptException -> 0x32ee }
            X.1xA r6 = r5.BD0()     // Catch:{ all -> 0x32e7 }
            java.util.Iterator r18 = r8.iterator()     // Catch:{ all -> 0x32e0 }
        L_0x3265:
            boolean r0 = r18.hasNext()     // Catch:{ all -> 0x32e0 }
            if (r0 == 0) goto L_0x32d6
            java.lang.Object r14 = r18.next()     // Catch:{ all -> 0x32e0 }
            X.2m5 r14 = (X.C59302m5) r14     // Catch:{ all -> 0x32e0 }
            r0 = 8
            android.content.ContentValues r7 = new android.content.ContentValues     // Catch:{ all -> 0x32e0 }
            r7.<init>(r0)     // Catch:{ all -> 0x32e0 }
            java.lang.String r4 = "creator_jid"
            java.lang.String r0 = r10.getRawString()     // Catch:{ all -> 0x32e0 }
            r7.put(r4, r0)     // Catch:{ all -> 0x32e0 }
            com.whatsapp.jid.UserJid r15 = r14.A01     // Catch:{ all -> 0x32e0 }
            r17 = 1
            r13 = 2
            if (r15 == 0) goto L_0x32b4
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x32e0 }
            X.1Ev r4 = r0.A02     // Catch:{ all -> 0x32e0 }
            r0 = 3
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ all -> 0x32e0 }
            java.lang.String r16 = r2.getRawString()     // Catch:{ all -> 0x32e0 }
            r0[r20] = r16     // Catch:{ all -> 0x32e0 }
            X.1EC r14 = r14.A00     // Catch:{ all -> 0x32e0 }
            java.lang.String r14 = r14.getRawString()     // Catch:{ all -> 0x32e0 }
            r0[r17] = r14     // Catch:{ all -> 0x32e0 }
            java.lang.String r14 = r15.getRawString()     // Catch:{ all -> 0x32e0 }
            r0[r13] = r14     // Catch:{ all -> 0x32e0 }
            java.lang.String r25 = "UPDATE_MEMBER_SUGGESTED_GROUPS_CREATOR"
            java.lang.String r23 = "member_suggested_groups_v2"
            java.lang.String r24 = "parent_group_jid = ?  AND group_jid = ?  AND creator_jid = ?"
        L_0x32aa:
            r21 = r4
            r22 = r7
            r26 = r0
            r21.A02(r22, r23, r24, r25, r26)     // Catch:{ all -> 0x32e0 }
            goto L_0x3265
        L_0x32b4:
            java.lang.String r0 = "updateSubgroupSuggestionCreatorHelper/Deprecated sql UPDATE_MEMBER_SUGGESTED_GROUPS is used, missing creator"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x32e0 }
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x32e0 }
            X.1Ev r4 = r0.A02     // Catch:{ all -> 0x32e0 }
            java.lang.String[] r0 = new java.lang.String[r13]     // Catch:{ all -> 0x32e0 }
            java.lang.String r13 = r2.getRawString()     // Catch:{ all -> 0x32e0 }
            r0[r20] = r13     // Catch:{ all -> 0x32e0 }
            X.1EC r13 = r14.A00     // Catch:{ all -> 0x32e0 }
            java.lang.String r13 = r13.getRawString()     // Catch:{ all -> 0x32e0 }
            r0[r17] = r13     // Catch:{ all -> 0x32e0 }
            java.lang.String r25 = "UPDATE_MEMBER_SUGGESTED_GROUPS"
            java.lang.String r23 = "member_suggested_groups_v2"
            java.lang.String r24 = "parent_group_jid = ?  AND group_jid = ?"
            goto L_0x32aa
        L_0x32d6:
            r6.A00()     // Catch:{ all -> 0x32e0 }
            r6.close()     // Catch:{ all -> 0x32e7 }
            r5.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x32ee }
            goto L_0x32f2
        L_0x32e0:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x32e2 }
        L_0x32e2:
            r0 = move-exception
            X.CDX.A00(r6, r4)     // Catch:{ all -> 0x32e7 }
            throw r0     // Catch:{ all -> 0x32e7 }
        L_0x32e7:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x32e9 }
        L_0x32e9:
            r0 = move-exception
            X.CDX.A00(r5, r4)     // Catch:{ SQLiteDatabaseCorruptException -> 0x32ee }
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x32ee }
        L_0x32ee:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
        L_0x32f2:
            java.util.SortedSet r4 = r1.A03(r2)
            if (r19 != 0) goto L_0x3378
            r0 = 10
            int r0 = X.C29351c6.A0C(r4, r0)
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>(r0)
            java.util.Iterator r16 = r4.iterator()
        L_0x3307:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x336b
            java.lang.Object r14 = r16.next()
            X.2mu r14 = (X.C59802mu) r14
            boolean r0 = r8 instanceof java.util.Collection
            if (r0 == 0) goto L_0x3321
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x3321
        L_0x331d:
            r15.add(r14)
            goto L_0x3307
        L_0x3321:
            java.util.Iterator r5 = r8.iterator()
        L_0x3325:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x331d
            java.lang.Object r4 = r5.next()
            X.2m5 r4 = (X.C59302m5) r4
            X.1EC r0 = r4.A00
            X.1EC r13 = r14.A02
            boolean r0 = X.C18070vi.A18(r0, r13)
            if (r0 == 0) goto L_0x3325
            com.whatsapp.jid.UserJid r0 = r4.A01
            boolean r0 = X.C18070vi.A18(r0, r9)
            if (r0 == 0) goto L_0x3325
            X.1EC r0 = r14.A03
            r18 = r0
            java.lang.String r0 = r14.A06
            r21 = r0
            java.lang.String r0 = r14.A05
            r22 = r0
            long r6 = r14.A00
            long r4 = r14.A01
            boolean r0 = r14.A07
            r27 = r0
            boolean r0 = r14.A08
            X.2mu r14 = new X.2mu
            r17 = r14
            r19 = r13
            r20 = r10
            r23 = r6
            r25 = r4
            r28 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r25, r27, r28)
            goto L_0x331d
        L_0x336b:
            X.3D0 r4 = r1.A03
            java.util.TreeSet r0 = new java.util.TreeSet
            r0.<init>(r4)
            X.C29431cG.A17(r15, r0)
            r12.A0F(r2, r0)
        L_0x3378:
            X.1KB r5 = r1.A00
            r4 = 31
            X.4rk r0 = new X.4rk
            r0.<init>(r1, r2, r4)
            r5.A0J(r0)
            r3.A03(r9, r11)
            return
        L_0x3388:
            java.lang.String r4 = "group_history"
            boolean r4 = X.C29621ca.A07(r1, r4)
            if (r4 != 0) goto L_0x3399
            java.lang.String r0 = "no_group_history"
            boolean r0 = X.C29621ca.A07(r1, r0)
            if (r0 == 0) goto L_0x3424
            r0 = 0
        L_0x3399:
            monitor-enter(r3)
            X.126 r5 = r3.A0B     // Catch:{ all -> 0x3421 }
            X.0ve r6 = r5.A0U     // Catch:{ all -> 0x3421 }
            r4 = 5046(0x13b6, float:7.071E-42)
            X.0vf r1 = X.C18040vf.A02     // Catch:{ all -> 0x3421 }
            boolean r1 = X.C18020vd.A05(r1, r6, r4)     // Catch:{ all -> 0x3421 }
            if (r1 == 0) goto L_0x341f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x3421 }
            r4.<init>()     // Catch:{ all -> 0x3421 }
            java.lang.String r1 = "groupmgr/onGroupHistory/"
            r4.append(r1)     // Catch:{ all -> 0x3421 }
            r4.append(r2)     // Catch:{ all -> 0x3421 }
            java.lang.String r1 = "/"
            r4.append(r1)     // Catch:{ all -> 0x3421 }
            r4.append(r0)     // Catch:{ all -> 0x3421 }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x3421 }
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x3421 }
            if (r2 != 0) goto L_0x33c7
            goto L_0x33e9
        L_0x33c7:
            X.1M9 r6 = r5.A08     // Catch:{ all -> 0x3421 }
            X.1E7 r1 = r6.A0G(r2)     // Catch:{ all -> 0x3421 }
            if (r1 != 0) goto L_0x33d2
            java.lang.String r0 = "groupmgr/onGroupHistory/new group"
            goto L_0x33eb
        L_0x33d2:
            boolean r1 = r1.A0i     // Catch:{ all -> 0x3421 }
            if (r1 != r0) goto L_0x33d9
            java.lang.String r0 = "groupmgr/onGroupHistory/did not change"
            goto L_0x33eb
        L_0x33d9:
            java.lang.String r1 = "groupmgr/onGroupHistory/changed"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x3421 }
            X.1MZ r1 = r5.A0O     // Catch:{ all -> 0x3421 }
            boolean r1 = r1.A0J(r2)     // Catch:{ all -> 0x3421 }
            if (r1 != 0) goto L_0x33ef
            java.lang.String r0 = "groupmgr/onGroupHistory/not participant"
            goto L_0x33eb
        L_0x33e9:
            java.lang.String r0 = "groupmgr/onGroupHistory/not group"
        L_0x33eb:
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x3421 }
            goto L_0x341f
        L_0x33ef:
            X.1E7 r4 = r6.A0H(r2)     // Catch:{ all -> 0x3421 }
            boolean r1 = r4.A0i     // Catch:{ all -> 0x3421 }
            if (r1 == r0) goto L_0x3403
            r4.A0i = r0     // Catch:{ all -> 0x3421 }
            X.1M2 r1 = r6.A04     // Catch:{ all -> 0x3421 }
            r1.A0R(r4)     // Catch:{ all -> 0x3421 }
            X.1MA r1 = r6.A03     // Catch:{ all -> 0x3421 }
            r1.A0B(r4)     // Catch:{ all -> 0x3421 }
        L_0x3403:
            X.1Uh r4 = r5.A0V     // Catch:{ all -> 0x3421 }
            X.1PQ r1 = r5.A0h     // Catch:{ all -> 0x3421 }
            r11 = 0
            r14 = 151(0x97, float:2.12E-43)
            if (r0 == 0) goto L_0x340e
            r14 = 150(0x96, float:2.1E-43)
        L_0x340e:
            r10 = r1
            r12 = r2
            r13 = r11
            r15 = r25
            X.2Mh r1 = r10.A06(r11, r12, r13, r14, r15)     // Catch:{ all -> 0x3421 }
            r1.A0d(r9)     // Catch:{ all -> 0x3421 }
            r0 = 3019(0xbcb, float:4.23E-42)
            r4.BcH(r1, r0)     // Catch:{ all -> 0x3421 }
        L_0x341f:
            monitor-exit(r3)
            return
        L_0x3421:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x3424:
            java.lang.String r0 = "groups_dirty"
            boolean r0 = X.C29621ca.A07(r1, r0)
            if (r0 == 0) goto L_0x3473
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.lang.String r0 = "group"
            java.util.List r0 = r1.A0R(r0)
            java.util.Iterator r4 = r0.iterator()
        L_0x343b:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x345e
            java.lang.Object r2 = r4.next()
            X.1ca r2 = (X.C29621ca) r2
            java.lang.String r1 = "jid"
            r0 = 0
            java.lang.String r2 = r2.A0Q(r1, r0)
            X.C17960vV.A07(r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            X.1D6 r0 = new X.1D6
            r0.<init>(r2, r1)
            r5.add(r0)
            goto L_0x343b
        L_0x345e:
            X.1Mm r0 = r3.A02
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            X.9Hx r3 = X.C179429Hx.A04
            r7 = 0
            r4 = 0
            r8 = 3
            com.whatsapp.group.batch.FetchTruncatedGroupsJob r2 = new com.whatsapp.group.batch.FetchTruncatedGroupsJob
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r0.A01(r2)
            return
        L_0x3473:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "GroupNotificationHandler/handleXmppMessage: unknown tag="
            r2.append(r0)
            java.lang.String r0 = r1.A00
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            goto L_0x3498
        L_0x3487:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "GroupNotificationHandler/handleGroupLinked/incorrect link type = "
            r1.append(r0)
            r1.append(r4)
        L_0x3494:
            java.lang.String r0 = r1.toString()
        L_0x3498:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x349c:
            X.126 r3 = r3.A0B
            r0 = 3
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = r1.A00
            r9 = 5
            r6 = 0
            r7 = r36
            r8 = r0
            r4 = r2
            r3.A0d(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36071nI.A05(X.1ca, int):void");
    }
}
