package X;

import java.util.Map;
import java.util.Set;

public class A7C {
    public final AnonymousClass190 A00;
    public final AnonymousClass11S A01;
    public final AnonymousClass121 A02;
    public final C18030ve A03;
    public final AnonymousClass1N9 A04;
    public final AnonymousClass1R0 A05;
    public final C192299o8 A06;
    public final C193209pi A07;
    public final A6X A08;
    public final AnonymousClass10I A09;
    public final Map A0A;
    public final Set A0B;
    public final Set A0C;
    public final C198969zD A0D;
    public final C19969A1e A0E;
    public final AnonymousClass00H A0F;

    private C445323u A01(C166398cp r10, AnonymousClass205 r11, C20285AEt aEt, long j, boolean z, boolean z2) {
        C165688bb r4;
        C445323u r5 = new C445323u(r11, aEt, j);
        C192099nn r3 = (C192099nn) this.A0F.get();
        C165638bW r2 = r10.header_;
        if (r2 == null) {
            r2 = C165638bW.DEFAULT_INSTANCE;
        }
        if (r2.mediaCase_ == 9) {
            r4 = (C165688bb) r2.media_;
        } else {
            r4 = C165688bb.DEFAULT_INSTANCE;
        }
        r3.A01(r4, r5, r5.A01, z, z2);
        return r5;
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [X.21a, X.21X, X.206, X.21W] */
    private C438121a A02(C166398cp r7, AnonymousClass205 r8, C20285AEt aEt, long j, boolean z, boolean z2) {
        C166248ca r1;
        C165638bW r2 = r7.header_;
        if (r2 == null) {
            r2 = C165638bW.DEFAULT_INSTANCE;
        }
        if (r2.mediaCase_ == 7) {
            r1 = (C166248ca) r2.media_;
        } else {
            r1 = C166248ca.DEFAULT_INSTANCE;
        }
        C18070vi.A0d(aEt, 3);
        ? r22 = new AnonymousClass21X(r8, 62, j);
        r22.A00 = aEt;
        this.A0E.A03(r1, r22, r22.A01, z, z2);
        C19969A1e.A00(r1, r22, r22.A01, z);
        return r22;
    }

    public A7C(AnonymousClass190 r2, AnonymousClass11S r3, AnonymousClass121 r4, C18030ve r5, AnonymousClass1N9 r6, AnonymousClass1R0 r7, C192299o8 r8, C193209pi r9, C198969zD r10, C19969A1e a1e, A6X a6x, AnonymousClass10I r13, AnonymousClass00H r14, Map map, Set set, Set set2) {
        this.A07 = r9;
        this.A0E = a1e;
        this.A06 = r8;
        this.A0D = r10;
        this.A0F = r14;
        this.A02 = r4;
        this.A04 = r6;
        this.A00 = r2;
        this.A05 = r7;
        this.A03 = r5;
        this.A09 = r13;
        this.A0A = map;
        this.A0B = set;
        this.A08 = a6x;
        this.A01 = r3;
        this.A0C = set2;
    }

    public static int A00(C166398cp r3) {
        int intValue = r3.A0T().intValue();
        if (intValue == 0) {
            return 4;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return 0;
            }
            return 7;
        } else if (C20093A6v.A01(r3)) {
            return 3;
        } else {
            if (r3.interactiveMessageCase_ == 6 && C20093A6v.A02(r3, "payment_info")) {
                return 10;
            }
            if (r3.interactiveMessageCase_ == 6 && C20093A6v.A02(r3, "mpm")) {
                return 6;
            }
            if (r3.interactiveMessageCase_ != 6 || (r3.bitField0_ & 1) == 0) {
                return 5;
            }
            C165638bW r0 = r3.header_;
            if (r0 == null) {
                r0 = C165638bW.DEFAULT_INSTANCE;
            }
            if (r0.mediaCase_ != 9) {
                return 5;
            }
            return 9;
        }
    }

    public static String A03(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "COLLECTION_MESSAGE";
            case 2:
                return "NATIVE_FLOW_MESSAGE";
            case 3:
                return "CAROUSEL_MESSAGE";
            case 4:
                return "INTERACTIVEMESSAGE_NOT_SET";
            default:
                return "SHOP_STOREFRONT_MESSAGE";
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v15, resolved type: X.23u} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v16, resolved type: X.21a} */
    /* JADX WARNING: type inference failed for: r13v6, types: [X.21d, X.21e, X.206] */
    /* JADX WARNING: type inference failed for: r2v95, types: [X.21B, X.21l, X.218, X.206] */
    /* JADX WARNING: type inference failed for: r2v98, types: [X.21j, X.21V, X.206] */
    /* JADX WARNING: type inference failed for: r2v104, types: [X.21d, X.21e, X.206] */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0041, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r4.A03, 4668) == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002d, code lost:
        if (X.C20093A6v.A02(r12, "call_permission_request") == false) goto L_0x002f;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:267:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0110 A[Catch:{ 1hd -> 0x046d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass206 A04(X.C166418cr r29, X.AnonymousClass205 r30, java.lang.String r31, java.lang.String r32, int r33, long r34, boolean r36, boolean r37, boolean r38) {
        /*
            r28 = this;
            r5 = r29
            X.8cp r12 = X.A89.A00(r5)
            r4 = r28
            r3 = r30
            r25 = r33
            r0 = r34
            X.11S r2 = r4.A01     // Catch:{ 1hd -> 0x046d }
            boolean r2 = r2.A0N()     // Catch:{ 1hd -> 0x046d }
            if (r2 == 0) goto L_0x002f
            r6 = 5
            int r2 = A00(r12)     // Catch:{ 1hd -> 0x046d }
            if (r6 != r2) goto L_0x002f
            r2 = 0
            X.C18070vi.A0d(r12, r2)     // Catch:{ 1hd -> 0x046d }
            int r6 = r12.interactiveMessageCase_     // Catch:{ 1hd -> 0x046d }
            r2 = 6
            if (r6 != r2) goto L_0x002f
            java.lang.String r2 = "call_permission_request"
            boolean r2 = X.C20093A6v.A02(r12, r2)     // Catch:{ 1hd -> 0x046d }
            r8 = 1
            if (r2 != 0) goto L_0x0043
        L_0x002f:
            r8 = 0
            int r6 = A00(r12)     // Catch:{ 1hd -> 0x046d }
            r2 = 7
            if (r6 != r2) goto L_0x0056
            X.0ve r7 = r4.A03     // Catch:{ 1hd -> 0x046d }
            r6 = 4668(0x123c, float:6.541E-42)
            X.0vf r2 = X.C18040vf.A02     // Catch:{ 1hd -> 0x046d }
            boolean r2 = X.C18020vd.A05(r2, r7, r6)     // Catch:{ 1hd -> 0x046d }
            if (r2 != 0) goto L_0x0056
        L_0x0043:
            byte[] r23 = r5.A0M()     // Catch:{ 1hd -> 0x046d }
            r24 = 2
            X.23U r2 = new X.23U     // Catch:{ 1hd -> 0x046d }
            r21 = r2
            r22 = r3
            r26 = r0
            r21.<init>(r22, r23, r24, r25, r26)     // Catch:{ 1hd -> 0x046d }
            goto L_0x010e
        L_0x0056:
            X.0ve r13 = r4.A03     // Catch:{ 1hd -> 0x046d }
            r2 = 11469(0x2ccd, float:1.6071E-41)
            X.0vf r6 = X.C18040vf.A02     // Catch:{ 1hd -> 0x046d }
            boolean r2 = X.C18020vd.A05(r6, r13, r2)     // Catch:{ 1hd -> 0x046d }
            if (r2 == 0) goto L_0x0085
            boolean r2 = X.C20093A6v.A01(r12)     // Catch:{ 1hd -> 0x046d }
            if (r2 == 0) goto L_0x0085
            int r2 = r12.bitField0_     // Catch:{ 1hd -> 0x046d }
            r2 = r2 & 1
            if (r2 == 0) goto L_0x0085
            X.8bW r2 = r12.header_     // Catch:{ 1hd -> 0x046d }
            r7 = r2
            if (r2 != 0) goto L_0x0075
            X.8bW r2 = X.C165638bW.DEFAULT_INSTANCE     // Catch:{ 1hd -> 0x046d }
        L_0x0075:
            int r2 = r2.bitField0_     // Catch:{ 1hd -> 0x046d }
            r2 = r2 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x0085
            if (r7 != 0) goto L_0x007f
            X.8bW r7 = X.C165638bW.DEFAULT_INSTANCE     // Catch:{ 1hd -> 0x046d }
        L_0x007f:
            int r7 = r7.mediaCase_     // Catch:{ 1hd -> 0x046d }
            r2 = 3
            if (r7 != r2) goto L_0x0085
            goto L_0x0043
        L_0x0085:
            java.lang.Integer r2 = r12.A0T()     // Catch:{ 1hd -> 0x046d }
            java.lang.String r7 = "FMessageInteractiveFactory/isUnknownInteractiveMessage"
            r10 = 1
            if (r2 == 0) goto L_0x0105
            java.lang.Integer r9 = X.AnonymousClass00R.A0Y     // Catch:{ 1hd -> 0x046d }
            if (r2 == r9) goto L_0x0105
            int r11 = r2.intValue()     // Catch:{ 1hd -> 0x046d }
            if (r11 == r8) goto L_0x00b8
            r9 = 2
            if (r11 == r9) goto L_0x00b1
            r9 = 3
            if (r11 == r9) goto L_0x00c7
            if (r11 == r10) goto L_0x00a2
            r11 = -1
            goto L_0x00cd
        L_0x00a2:
            int r11 = r12.interactiveMessageCase_     // Catch:{ 1hd -> 0x046d }
            r9 = 5
            if (r11 != r9) goto L_0x00ae
            java.lang.Object r9 = r12.interactiveMessage_     // Catch:{ 1hd -> 0x046d }
            X.8a6 r9 = (X.C164808a6) r9     // Catch:{ 1hd -> 0x046d }
        L_0x00ab:
            int r11 = r9.messageVersion_     // Catch:{ 1hd -> 0x046d }
            goto L_0x00cd
        L_0x00ae:
            X.8a6 r9 = X.C164808a6.DEFAULT_INSTANCE     // Catch:{ 1hd -> 0x046d }
            goto L_0x00ab
        L_0x00b1:
            X.8a7 r9 = r12.A0S()     // Catch:{ 1hd -> 0x046d }
            int r11 = r9.messageVersion_     // Catch:{ 1hd -> 0x046d }
            goto L_0x00cd
        L_0x00b8:
            int r11 = r12.interactiveMessageCase_     // Catch:{ 1hd -> 0x046d }
            r9 = 4
            if (r11 != r9) goto L_0x00c4
            java.lang.Object r9 = r12.interactiveMessage_     // Catch:{ 1hd -> 0x046d }
            X.8a8 r9 = (X.C164828a8) r9     // Catch:{ 1hd -> 0x046d }
        L_0x00c1:
            int r11 = r9.messageVersion_     // Catch:{ 1hd -> 0x046d }
            goto L_0x00cd
        L_0x00c4:
            X.8a8 r9 = X.C164828a8.DEFAULT_INSTANCE     // Catch:{ 1hd -> 0x046d }
            goto L_0x00c1
        L_0x00c7:
            X.8Z2 r9 = r12.A0R()     // Catch:{ 1hd -> 0x046d }
            int r11 = r9.messageVersion_     // Catch:{ 1hd -> 0x046d }
        L_0x00cd:
            r15 = -1
            java.lang.String r9 = ", version: "
            java.lang.String r14 = "message: "
            if (r11 != r15) goto L_0x00ea
            X.190 r10 = r4.A00     // Catch:{ 1hd -> 0x046d }
            java.lang.StringBuilder r6 = X.AnonymousClass000.A11(r14)     // Catch:{ 1hd -> 0x046d }
            java.lang.String r2 = A03(r2)     // Catch:{ 1hd -> 0x046d }
            r6.append(r2)     // Catch:{ 1hd -> 0x046d }
            java.lang.String r2 = X.AnonymousClass001.A1I(r9, r6, r11)     // Catch:{ 1hd -> 0x046d }
            r10.A0G(r7, r2, r8)     // Catch:{ 1hd -> 0x046d }
            goto L_0x0043
        L_0x00ea:
            if (r11 > r10) goto L_0x00ed
            goto L_0x0115
        L_0x00ed:
            X.190 r7 = r4.A00     // Catch:{ 1hd -> 0x046d }
            java.lang.StringBuilder r6 = X.AnonymousClass000.A11(r14)     // Catch:{ 1hd -> 0x046d }
            java.lang.String r2 = A03(r2)     // Catch:{ 1hd -> 0x046d }
            r6.append(r2)     // Catch:{ 1hd -> 0x046d }
            java.lang.String r6 = X.AnonymousClass001.A1I(r9, r6, r11)     // Catch:{ 1hd -> 0x046d }
            java.lang.String r2 = "FMessageInteractiveFactory/isUnknownInteractiveMessage: unsupported version"
            r7.A0G(r2, r6, r8)     // Catch:{ 1hd -> 0x046d }
            goto L_0x0043
        L_0x0105:
            X.190 r6 = r4.A00     // Catch:{ 1hd -> 0x046d }
            java.lang.String r2 = "messageCase null/not_set"
            r6.A0G(r7, r2, r8)     // Catch:{ 1hd -> 0x046d }
            goto L_0x0043
        L_0x010e:
            if (r8 == 0) goto L_0x04a3
            r6 = 10003(0x2713, float:1.4017E-41)
            r2.A00 = r6     // Catch:{ 1hd -> 0x046d }
            return r2
        L_0x0115:
            int r9 = A00(r12)     // Catch:{ 1hd -> 0x046d }
            java.util.Map r2 = r4.A0A     // Catch:{ 1hd -> 0x046d }
            java.lang.Object r7 = X.AnonymousClass000.A0w(r2, r9)     // Catch:{ 1hd -> 0x046d }
            X.A1v r7 = (X.C19985A1v) r7     // Catch:{ 1hd -> 0x046d }
            if (r7 == 0) goto L_0x045c
            r2 = r31
            r7.A00 = r2     // Catch:{ 1hd -> 0x046d }
            r9 = r38
            r7.A01 = r9     // Catch:{ 1hd -> 0x046d }
            X.AEt r9 = r7.A01(r12)     // Catch:{ 1hd -> 0x046d }
            r7 = r32
            r9.A0D = r7     // Catch:{ 1hd -> 0x046d }
            boolean r7 = r5.A0R()     // Catch:{ 1hd -> 0x046d }
            if (r7 == 0) goto L_0x014e
            X.8ck r7 = r5.templateMessage_     // Catch:{ 1hd -> 0x046d }
            r11 = r7
            if (r7 != 0) goto L_0x0140
            X.8ck r7 = X.C166348ck.DEFAULT_INSTANCE     // Catch:{ 1hd -> 0x046d }
        L_0x0140:
            int r7 = r7.bitField0_     // Catch:{ 1hd -> 0x046d }
            r7 = r7 & 32
            if (r7 == 0) goto L_0x014e
            if (r11 != 0) goto L_0x014a
            X.8ck r11 = X.C166348ck.DEFAULT_INSTANCE     // Catch:{ 1hd -> 0x046d }
        L_0x014a:
            java.lang.String r7 = r11.templateId_     // Catch:{ 1hd -> 0x046d }
            r9.A0E = r7     // Catch:{ 1hd -> 0x046d }
        L_0x014e:
            X.8cp r7 = X.A89.A00(r5)     // Catch:{ 1hd -> 0x046d }
            boolean r11 = X.C20093A6v.A01(r7)     // Catch:{ 1hd -> 0x046d }
            if (r11 != 0) goto L_0x0168
            X.C18070vi.A0d(r7, r8)     // Catch:{ 1hd -> 0x046d }
            int r12 = r7.interactiveMessageCase_     // Catch:{ 1hd -> 0x046d }
            r11 = 6
            if (r12 != r11) goto L_0x018b
            java.lang.String r11 = "payment_info"
            boolean r11 = X.C20093A6v.A02(r7, r11)     // Catch:{ 1hd -> 0x046d }
            if (r11 == 0) goto L_0x018b
        L_0x0168:
            X.21R r2 = new X.21R     // Catch:{ 1hd -> 0x046d }
            r2.<init>(r3, r0)     // Catch:{ 1hd -> 0x046d }
            r2.CIS(r9)     // Catch:{ 1hd -> 0x046d }
            X.A6X r6 = r4.A08     // Catch:{ 1hd -> 0x046d }
            r6.A04(r2)     // Catch:{ 1hd -> 0x046d }
            java.util.Set r6 = r4.A0B     // Catch:{ 1hd -> 0x046d }
            java.util.Iterator r7 = r6.iterator()     // Catch:{ 1hd -> 0x046d }
        L_0x017b:
            boolean r6 = r7.hasNext()     // Catch:{ 1hd -> 0x046d }
            if (r6 == 0) goto L_0x04a3
            java.lang.Object r6 = r7.next()     // Catch:{ 1hd -> 0x046d }
            X.9lL r6 = (X.C190679lL) r6     // Catch:{ 1hd -> 0x046d }
            r6.A00(r2)     // Catch:{ 1hd -> 0x046d }
            goto L_0x017b
        L_0x018b:
            r11 = 0
            java.lang.String r12 = "review_order"
            boolean r14 = X.C20093A6v.A02(r7, r12)     // Catch:{ 1hd -> 0x046d }
            if (r14 != 0) goto L_0x03f0
            java.lang.String r14 = "payment_method"
            boolean r14 = X.C20093A6v.A02(r7, r14)     // Catch:{ 1hd -> 0x046d }
            if (r14 != 0) goto L_0x03f0
            java.lang.String r14 = "payment_status"
            boolean r14 = X.C20093A6v.A02(r7, r14)     // Catch:{ 1hd -> 0x046d }
            if (r14 != 0) goto L_0x03f0
            int r6 = r7.bitField0_     // Catch:{ 1hd -> 0x046d }
            r14 = r6 & 1
            r16 = r36
            r24 = r37
            if (r14 == 0) goto L_0x028f
            X.8bW r12 = r7.header_     // Catch:{ 1hd -> 0x046d }
            r6 = r12
            r13 = r12
            if (r12 != 0) goto L_0x01b6
            X.8bW r12 = X.C165638bW.DEFAULT_INSTANCE     // Catch:{ 1hd -> 0x046d }
        L_0x01b6:
            int r12 = r12.bitField0_     // Catch:{ 1hd -> 0x046d }
            r12 = r12 & 256(0x100, float:3.59E-43)
            if (r12 == 0) goto L_0x01f6
            if (r6 != 0) goto L_0x01c0
            X.8bW r13 = X.C165638bW.DEFAULT_INSTANCE     // Catch:{ 1hd -> 0x046d }
        L_0x01c0:
            int r13 = r13.mediaCase_     // Catch:{ 1hd -> 0x046d }
            r12 = 4
            if (r13 != r12) goto L_0x01f6
            java.lang.String r13 = "catalog_message"
            boolean r2 = r13.equals(r2)     // Catch:{ 1hd -> 0x046d }
            if (r2 != 0) goto L_0x01f6
            r6 = 57
            X.21e r2 = new X.21e     // Catch:{ 1hd -> 0x046d }
            r2.<init>(r3, r6, r0)     // Catch:{ 1hd -> 0x046d }
            r2.A00 = r9     // Catch:{ 1hd -> 0x046d }
            X.9pi r8 = r4.A07     // Catch:{ 1hd -> 0x046d }
            X.8bW r7 = r7.header_     // Catch:{ 1hd -> 0x046d }
            if (r7 != 0) goto L_0x01de
            X.8bW r7 = X.C165638bW.DEFAULT_INSTANCE     // Catch:{ 1hd -> 0x046d }
        L_0x01de:
            int r6 = r7.mediaCase_     // Catch:{ 1hd -> 0x046d }
            if (r6 != r12) goto L_0x01f2
            java.lang.Object r9 = r7.media_     // Catch:{ 1hd -> 0x046d }
            X.8cc r9 = (X.C166268cc) r9     // Catch:{ 1hd -> 0x046d }
        L_0x01e6:
            int r6 = r2.A01     // Catch:{ 1hd -> 0x046d }
            r10 = r2
            r11 = r6
            r12 = r16
            r13 = r24
            r8.A02(r9, r10, r11, r12, r13)     // Catch:{ 1hd -> 0x046d }
            goto L_0x01f5
        L_0x01f2:
            X.8cc r9 = X.C166268cc.DEFAULT_INSTANCE     // Catch:{ 1hd -> 0x046d }
            goto L_0x01e6
        L_0x01f5:
            return r2
        L_0x01f6:
            r2 = r6
            r12 = r6
            if (r6 != 0) goto L_0x01fc
            X.8bW r2 = X.C165638bW.DEFAULT_INSTANCE     // Catch:{ 1hd -> 0x046d }
        L_0x01fc:
            int r2 = r2.bitField0_     // Catch:{ 1hd -> 0x046d }
            r2 = r2 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x0217
            if (r6 != 0) goto L_0x0206
            X.8bW r12 = X.C165638bW.DEFAULT_INSTANCE     // Catch:{ 1hd -> 0x046d }
        L_0x0206:
            int r12 = r12.mediaCase_     // Catch:{ 1hd -> 0x046d }
            r2 = 7
            if (r12 != r2) goto L_0x0217
            r10 = r4
            r11 = r7
            r12 = r3
            r13 = r9
            r14 = r0
            r17 = r24
            X.21a r2 = r10.A02(r11, r12, r13, r14, r16, r17)     // Catch:{ 1hd -> 0x046d }
            return r2
        L_0x0217:
            r2 = r6
            r12 = r6
            if (r6 != 0) goto L_0x021d
            X.8bW r2 = X.C165638bW.DEFAULT_INSTANCE     // Catch:{ 1hd -> 0x046d }
        L_0x021d:
            int r2 = r2.bitField0_     // Catch:{ 1hd -> 0x046d }
            r2 = r2 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x0255
            if (r6 != 0) goto L_0x0227
            X.8bW r12 = X.C165638bW.DEFAULT_INSTANCE     // Catch:{ 1hd -> 0x046d }
        L_0x0227:
            int r2 = r12.mediaCase_     // Catch:{ 1hd -> 0x046d }
            r12 = 3
            if (r2 != r12) goto L_0x0255
            r6 = 63
            X.21j r2 = new X.21j     // Catch:{ 1hd -> 0x046d }
            r2.<init>(r3, r6, r0)     // Catch:{ 1hd -> 0x046d }
            r2.A00 = r9     // Catch:{ 1hd -> 0x046d }
            X.9o8 r8 = r4.A06     // Catch:{ 1hd -> 0x046d }
            X.8bW r7 = r7.header_     // Catch:{ 1hd -> 0x046d }
            if (r7 != 0) goto L_0x023d
            X.8bW r7 = X.C165638bW.DEFAULT_INSTANCE     // Catch:{ 1hd -> 0x046d }
        L_0x023d:
            int r6 = r7.mediaCase_     // Catch:{ 1hd -> 0x046d }
            if (r6 != r12) goto L_0x0251
            java.lang.Object r9 = r7.media_     // Catch:{ 1hd -> 0x046d }
            X.8cW r9 = (X.C166208cW) r9     // Catch:{ 1hd -> 0x046d }
        L_0x0245:
            int r6 = r2.A01     // Catch:{ 1hd -> 0x046d }
            r10 = r2
            r11 = r6
            r12 = r16
            r13 = r24
            r8.A01(r9, r10, r11, r12, r13)     // Catch:{ 1hd -> 0x046d }
            goto L_0x0254
        L_0x0251:
            X.8cW r9 = X.C166208cW.DEFAULT_INSTANCE     // Catch:{ 1hd -> 0x046d }
            goto L_0x0245
        L_0x0254:
            return r2
        L_0x0255:
            r2 = r6
            if (r6 != 0) goto L_0x025a
            X.8bW r2 = X.C165638bW.DEFAULT_INSTANCE     // Catch:{ 1hd -> 0x046d }
        L_0x025a:
            int r2 = r2.bitField0_     // Catch:{ 1hd -> 0x046d }
            r2 = r2 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x028f
            if (r6 != 0) goto L_0x0264
            X.8bW r6 = X.C165638bW.DEFAULT_INSTANCE     // Catch:{ 1hd -> 0x046d }
        L_0x0264:
            int r2 = r6.mediaCase_     // Catch:{ 1hd -> 0x046d }
            r12 = 8
            if (r2 != r12) goto L_0x028f
            r6 = 85
            X.21l r2 = new X.21l     // Catch:{ 1hd -> 0x046d }
            r2.<init>(r3, r6, r0)     // Catch:{ 1hd -> 0x046d }
            r2.A02 = r10     // Catch:{ 1hd -> 0x046d }
            r2.A02 = r8     // Catch:{ 1hd -> 0x046d }
            r2.A00 = r9     // Catch:{ 1hd -> 0x046d }
            X.8bW r7 = r7.header_     // Catch:{ 1hd -> 0x046d }
            if (r7 != 0) goto L_0x027d
            X.8bW r7 = X.C165638bW.DEFAULT_INSTANCE     // Catch:{ 1hd -> 0x046d }
        L_0x027d:
            int r6 = r7.mediaCase_     // Catch:{ 1hd -> 0x046d }
            if (r6 != r12) goto L_0x028b
            java.lang.Object r7 = r7.media_     // Catch:{ 1hd -> 0x046d }
            X.8cE r7 = (X.C166028cE) r7     // Catch:{ 1hd -> 0x046d }
        L_0x0285:
            r6 = r24
            X.C198969zD.A00(r7, r2, r6)     // Catch:{ 1hd -> 0x046d }
            goto L_0x028e
        L_0x028b:
            X.8cE r7 = X.C166028cE.DEFAULT_INSTANCE     // Catch:{ 1hd -> 0x046d }
            goto L_0x0285
        L_0x028e:
            return r2
        L_0x028f:
            int r6 = r7.interactiveMessageCase_     // Catch:{ 1hd -> 0x046d }
            r2 = 7
            if (r6 != r2) goto L_0x03c2
            X.8Z2 r2 = r7.A0R()     // Catch:{ 1hd -> 0x046d }
            X.EE9 r8 = r2.cards_     // Catch:{ 1hd -> 0x046d }
            java.util.ArrayList r7 = X.AnonymousClass000.A13()     // Catch:{ 1hd -> 0x046d }
        L_0x029e:
            int r2 = r8.size()     // Catch:{ 1hd -> 0x046d }
            if (r11 >= r2) goto L_0x03b6
            java.lang.Object r6 = r8.get(r11)     // Catch:{ 1hd -> 0x046d }
            X.8cp r6 = (X.C166398cp) r6     // Catch:{ 1hd -> 0x046d }
            int r2 = r6.bitField0_     // Catch:{ 1hd -> 0x046d }
            r2 = r2 & 1
            if (r2 == 0) goto L_0x030b
            X.8bW r2 = r6.header_     // Catch:{ 1hd -> 0x046d }
            r12 = r2
            if (r2 != 0) goto L_0x02b7
            X.8bW r2 = X.C165638bW.DEFAULT_INSTANCE     // Catch:{ 1hd -> 0x046d }
        L_0x02b7:
            int r2 = r2.bitField0_     // Catch:{ 1hd -> 0x046d }
            r2 = r2 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x030b
            if (r12 != 0) goto L_0x02c1
            X.8bW r12 = X.C165638bW.DEFAULT_INSTANCE     // Catch:{ 1hd -> 0x046d }
        L_0x02c1:
            int r2 = r12.mediaCase_     // Catch:{ 1hd -> 0x046d }
            r14 = 4
            if (r2 != r14) goto L_0x030b
            X.2M2 r15 = new X.2M2     // Catch:{ 1hd -> 0x046d }
            r15.<init>(r3, r11)     // Catch:{ 1hd -> 0x046d }
            X.ADa r2 = r9.A04     // Catch:{ 1hd -> 0x046d }
            X.C17960vV.A07(r2)     // Catch:{ 1hd -> 0x046d }
            java.util.List r2 = r2.A00     // Catch:{ 1hd -> 0x046d }
            java.lang.Object r12 = r2.get(r11)     // Catch:{ 1hd -> 0x046d }
            X.AEt r12 = (X.C20285AEt) r12     // Catch:{ 1hd -> 0x046d }
            r2 = 3
            X.C18070vi.A0d(r12, r2)     // Catch:{ 1hd -> 0x046d }
            r2 = 57
            X.21e r13 = new X.21e     // Catch:{ 1hd -> 0x046d }
            r13.<init>(r15, r2, r0)     // Catch:{ 1hd -> 0x046d }
            r13.A00 = r12     // Catch:{ 1hd -> 0x046d }
            X.9pi r12 = r4.A07     // Catch:{ 1hd -> 0x046d }
            X.8bW r6 = r6.header_     // Catch:{ 1hd -> 0x046d }
            if (r6 != 0) goto L_0x02ed
            X.8bW r6 = X.C165638bW.DEFAULT_INSTANCE     // Catch:{ 1hd -> 0x046d }
        L_0x02ed:
            int r2 = r6.mediaCase_     // Catch:{ 1hd -> 0x046d }
            if (r2 != r14) goto L_0x0308
            java.lang.Object r6 = r6.media_     // Catch:{ 1hd -> 0x046d }
            X.8cc r6 = (X.C166268cc) r6     // Catch:{ 1hd -> 0x046d }
        L_0x02f5:
            int r2 = r13.A01     // Catch:{ 1hd -> 0x046d }
            r21 = r16
            r22 = r24
            r17 = r12
            r18 = r6
            r19 = r13
            r20 = r2
            r17.A02(r18, r19, r20, r21, r22)     // Catch:{ 1hd -> 0x046d }
            goto L_0x038a
        L_0x0308:
            X.8cc r6 = X.C166268cc.DEFAULT_INSTANCE     // Catch:{ 1hd -> 0x046d }
            goto L_0x02f5
        L_0x030b:
            int r2 = r6.bitField0_     // Catch:{ 1hd -> 0x046d }
            r2 = r2 & 1
            if (r2 == 0) goto L_0x0321
            X.8bW r2 = r6.header_     // Catch:{ 1hd -> 0x046d }
            r12 = r2
            if (r2 != 0) goto L_0x0318
            X.8bW r2 = X.C165638bW.DEFAULT_INSTANCE     // Catch:{ 1hd -> 0x046d }
        L_0x0318:
            int r2 = r2.bitField0_     // Catch:{ 1hd -> 0x046d }
            r2 = r2 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x0321
            if (r12 != 0) goto L_0x0363
            goto L_0x0361
        L_0x0321:
            int r2 = r6.bitField0_     // Catch:{ 1hd -> 0x046d }
            r2 = r2 & 1
            if (r2 == 0) goto L_0x03ac
            X.8bW r2 = r6.header_     // Catch:{ 1hd -> 0x046d }
            r12 = r2
            if (r2 != 0) goto L_0x032e
            X.8bW r2 = X.C165638bW.DEFAULT_INSTANCE     // Catch:{ 1hd -> 0x046d }
        L_0x032e:
            int r2 = r2.bitField0_     // Catch:{ 1hd -> 0x046d }
            r2 = r2 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x03ac
            if (r12 != 0) goto L_0x0338
            X.8bW r12 = X.C165638bW.DEFAULT_INSTANCE     // Catch:{ 1hd -> 0x046d }
        L_0x0338:
            int r12 = r12.mediaCase_     // Catch:{ 1hd -> 0x046d }
            r2 = 9
            if (r12 != r2) goto L_0x03ac
            X.2M2 r12 = new X.2M2     // Catch:{ 1hd -> 0x046d }
            r12.<init>(r3, r11)     // Catch:{ 1hd -> 0x046d }
            X.ADa r2 = r9.A04     // Catch:{ 1hd -> 0x046d }
            X.C17960vV.A07(r2)     // Catch:{ 1hd -> 0x046d }
            java.util.List r2 = r2.A00     // Catch:{ 1hd -> 0x046d }
            java.lang.Object r2 = r2.get(r11)     // Catch:{ 1hd -> 0x046d }
            X.AEt r2 = (X.C20285AEt) r2     // Catch:{ 1hd -> 0x046d }
            r17 = r4
            r18 = r6
            r19 = r12
            r20 = r2
            r21 = r0
            r23 = r16
            X.23u r13 = r17.A01(r18, r19, r20, r21, r23, r24)     // Catch:{ 1hd -> 0x046d }
            goto L_0x038a
        L_0x0361:
            X.8bW r12 = X.C165638bW.DEFAULT_INSTANCE     // Catch:{ 1hd -> 0x046d }
        L_0x0363:
            int r12 = r12.mediaCase_     // Catch:{ 1hd -> 0x046d }
            r2 = 7
            if (r12 != r2) goto L_0x0321
            X.2M2 r12 = new X.2M2     // Catch:{ 1hd -> 0x046d }
            r12.<init>(r3, r11)     // Catch:{ 1hd -> 0x046d }
            X.ADa r2 = r9.A04     // Catch:{ 1hd -> 0x046d }
            X.C17960vV.A07(r2)     // Catch:{ 1hd -> 0x046d }
            java.util.List r2 = r2.A00     // Catch:{ 1hd -> 0x046d }
            java.lang.Object r2 = r2.get(r11)     // Catch:{ 1hd -> 0x046d }
            X.AEt r2 = (X.C20285AEt) r2     // Catch:{ 1hd -> 0x046d }
            r17 = r4
            r18 = r6
            r19 = r12
            r20 = r2
            r21 = r0
            r23 = r16
            X.21a r13 = r17.A02(r18, r19, r20, r21, r23, r24)     // Catch:{ 1hd -> 0x046d }
        L_0x038a:
            boolean r2 = r13 instanceof X.AnonymousClass21K     // Catch:{ 1hd -> 0x046d }
            if (r2 == 0) goto L_0x03a5
            r12 = r13
            X.21K r12 = (X.AnonymousClass21K) r12     // Catch:{ 1hd -> 0x046d }
            X.AEt r2 = r12.BPK()     // Catch:{ 1hd -> 0x046d }
            if (r2 == 0) goto L_0x03a5
            X.AEn r2 = r2.A02     // Catch:{ 1hd -> 0x046d }
            if (r2 == 0) goto L_0x03a5
            X.10I r6 = r4.A09     // Catch:{ 1hd -> 0x046d }
            X.7Pk r2 = new X.7Pk     // Catch:{ 1hd -> 0x046d }
            r2.<init>(r4, r12, r10)     // Catch:{ 1hd -> 0x046d }
            r6.CGF(r2)     // Catch:{ 1hd -> 0x046d }
        L_0x03a5:
            r7.add(r13)     // Catch:{ 1hd -> 0x046d }
            int r11 = r11 + 1
            goto L_0x029e
        L_0x03ac:
            r6 = 26
            java.lang.String r2 = "not supported carousel card type"
            X.1hd r2 = X.AnonymousClass8BR.A0p(r2, r6)     // Catch:{ 1hd -> 0x046d }
            goto L_0x046c
        L_0x03b6:
            X.21L r2 = new X.21L     // Catch:{ 1hd -> 0x046d }
            r2.<init>(r3, r0)     // Catch:{ 1hd -> 0x046d }
            r2.CIS(r9)     // Catch:{ 1hd -> 0x046d }
            r2.A18(r7)     // Catch:{ 1hd -> 0x046d }
            return r2
        L_0x03c2:
            if (r14 == 0) goto L_0x03e7
            X.8bW r2 = r7.header_     // Catch:{ 1hd -> 0x046d }
            r6 = r2
            if (r2 != 0) goto L_0x03cb
            X.8bW r2 = X.C165638bW.DEFAULT_INSTANCE     // Catch:{ 1hd -> 0x046d }
        L_0x03cb:
            int r2 = r2.bitField0_     // Catch:{ 1hd -> 0x046d }
            r2 = r2 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x03e7
            if (r6 != 0) goto L_0x03d5
            X.8bW r6 = X.C165638bW.DEFAULT_INSTANCE     // Catch:{ 1hd -> 0x046d }
        L_0x03d5:
            int r6 = r6.mediaCase_     // Catch:{ 1hd -> 0x046d }
            r2 = 9
            if (r6 != r2) goto L_0x03e7
            r10 = r4
            r11 = r7
            r12 = r3
            r13 = r9
            r14 = r0
            r17 = r24
            X.23u r2 = r10.A01(r11, r12, r13, r14, r16, r17)     // Catch:{ 1hd -> 0x046d }
            return r2
        L_0x03e7:
            X.21L r2 = new X.21L     // Catch:{ 1hd -> 0x046d }
            r2.<init>(r3, r0)     // Catch:{ 1hd -> 0x046d }
            r2.CIS(r9)     // Catch:{ 1hd -> 0x046d }
            return r2
        L_0x03f0:
            r2 = 5770(0x168a, float:8.085E-42)
            boolean r7 = X.C18020vd.A05(r6, r13, r2)     // Catch:{ 1hd -> 0x046d }
            r2 = 8355(0x20a3, float:1.1708E-41)
            boolean r15 = X.C18020vd.A05(r6, r13, r2)     // Catch:{ 1hd -> 0x046d }
            X.8cp r10 = X.A89.A00(r5)     // Catch:{ 1hd -> 0x046d }
            X.21L r2 = new X.21L     // Catch:{ 1hd -> 0x046d }
            r2.<init>(r3, r0)     // Catch:{ 1hd -> 0x046d }
            r2.CIS(r9)     // Catch:{ 1hd -> 0x046d }
            X.C18070vi.A0d(r10, r8)     // Catch:{ 1hd -> 0x046d }
            java.lang.String r6 = "payment_method"
            boolean r6 = X.C20093A6v.A02(r10, r6)     // Catch:{ 1hd -> 0x046d }
            if (r6 != 0) goto L_0x0435
            java.lang.String r6 = "payment_status"
            boolean r6 = X.C20093A6v.A02(r10, r6)     // Catch:{ 1hd -> 0x046d }
            if (r6 != 0) goto L_0x0435
            boolean r6 = X.C20093A6v.A02(r10, r12)     // Catch:{ 1hd -> 0x046d }
            if (r6 == 0) goto L_0x04a3
            X.121 r8 = r4.A02     // Catch:{ 1hd -> 0x046d }
            X.1BI r9 = r3.A00     // Catch:{ 1hd -> 0x046d }
            X.C17960vV.A07(r9)     // Catch:{ 1hd -> 0x046d }
            X.1N9 r10 = r4.A04     // Catch:{ 1hd -> 0x046d }
            java.util.Set r6 = r4.A0C     // Catch:{ 1hd -> 0x046d }
            r12 = r2
            r13 = r6
            r14 = r7
            r11 = r5
            X.21K r7 = X.A63.A00(r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ 1hd -> 0x046d }
            goto L_0x0440
        L_0x0435:
            X.121 r8 = r4.A02     // Catch:{ 1hd -> 0x046d }
            X.1BI r6 = r3.A00     // Catch:{ 1hd -> 0x046d }
            X.C17960vV.A07(r6)     // Catch:{ 1hd -> 0x046d }
            X.21K r7 = X.A63.A01(r8, r6, r5, r7)     // Catch:{ 1hd -> 0x046d }
        L_0x0440:
            if (r7 == 0) goto L_0x04a3
            X.206 r7 = (X.AnonymousClass206) r7     // Catch:{ 1hd -> 0x046d }
            boolean r6 = X.C20120A8f.A06(r7)     // Catch:{ 1hd -> 0x046d }
            if (r6 == 0) goto L_0x0456
            X.205 r6 = r7.A0v     // Catch:{ 1hd -> 0x046d }
            X.2M2 r6 = (X.AnonymousClass2M2) r6     // Catch:{ 1hd -> 0x046d }
            int r6 = r6.A00     // Catch:{ 1hd -> 0x046d }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ 1hd -> 0x046d }
            r2.A01 = r6     // Catch:{ 1hd -> 0x046d }
        L_0x0456:
            X.1R0 r6 = r4.A05     // Catch:{ 1hd -> 0x046d }
            r6.A00(r2, r7)     // Catch:{ 1hd -> 0x046d }
            return r2
        L_0x045c:
            java.lang.StringBuilder r6 = X.AnonymousClass000.A10()     // Catch:{ 1hd -> 0x046d }
            java.lang.String r2 = "unknown type: "
            java.lang.String r6 = X.AnonymousClass001.A1I(r2, r6, r9)     // Catch:{ 1hd -> 0x046d }
            r2 = 26
            X.1hd r2 = X.AnonymousClass8BR.A0p(r6, r2)     // Catch:{ 1hd -> 0x046d }
        L_0x046c:
            throw r2     // Catch:{ 1hd -> 0x046d }
        L_0x046d:
            r8 = move-exception
            int r2 = r8.e2eFailureReason
            if (r2 == 0) goto L_0x04a4
            java.lang.StringBuilder r6 = X.AnonymousClass000.A10()
            java.lang.String r2 = "FMessageInteractiveFactory/parseInteractiveMessage/invalid message; message.key="
            X.C17900vP.A0Z(r3, r2, r6)
            X.190 r7 = r4.A00
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()
            java.lang.String r2 = "error: "
            r4.append(r2)
            java.lang.String r2 = r8.description
            java.lang.String r6 = X.AnonymousClass000.A0y(r2, r4)
            r4 = 1
            java.lang.String r2 = "FMessageInteractiveFactory/parseInteractiveMessage/invalid_message"
            r7.A0G(r2, r6, r4)
            byte[] r23 = r5.A0M()
            r24 = 2
            X.23U r2 = new X.23U
            r21 = r2
            r22 = r3
            r26 = r0
            r21.<init>(r22, r23, r24, r25, r26)
        L_0x04a3:
            return r2
        L_0x04a4:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A7C.A04(X.8cr, X.205, java.lang.String, java.lang.String, int, long, boolean, boolean, boolean):X.206");
    }
}
