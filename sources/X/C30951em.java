package X;

import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;

/* renamed from: X.1em  reason: invalid class name and case insensitive filesystem */
public class C30951em {
    public final AnonymousClass11S A00;
    public final AnonymousClass121 A01;
    public final AnonymousClass1KI A02;
    public final AnonymousClass1QD A03;
    public final AnonymousClass1QJ A04;
    public final AnonymousClass1QS A05;
    public final C30971eo A06 = new C30971eo((AnonymousClass190) null, new Object(), (C54002dR) null);
    public final AnonymousClass00H A07;
    public final AnonymousClass1NG A08;

    public static AW0 A00(C29621ca r7, long j) {
        byte[] bArr;
        String A0Q = r7.A0Q("country", "IN");
        int A012 = C20099A7c.A01(r7.A0Q("version", (String) null), 1);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(DefaultCrypto.BUFFER_SIZE);
            AnonymousClass37M.A01(r7, byteArrayOutputStream);
            bArr = byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("PAY: PaymentsProtoParser serializeProtocolNode: ");
            sb.append(e);
            Log.e(sb.toString());
            bArr = null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("PAY PaymentsProtoParser: buildFuturePaymentFromPayNode: futurePayment country=");
        sb2.append(A0Q);
        sb2.append(" version=");
        sb2.append(A012);
        Log.i(sb2.toString());
        AW0 aw0 = new AW0(A0Q, 5, A012, 0, j);
        aw0.A0R = bArr;
        return aw0;
    }

    public AW0 A01(UserJid userJid, UserJid userJid2, C29621ca r25, long j) {
        BD1 bd1;
        long j2 = j;
        C29621ca r7 = r25;
        String A0Q = r7.A0Q("country", this.A04.A02().A03);
        int A012 = C20099A7c.A01(r7.A0Q("version", (String) null), 1);
        String A0Q2 = r7.A0Q("request-id", (String) null);
        String A0Q3 = r7.A0Q("expiry-ts", (String) null);
        UserJid A042 = UserJid.Companion.A04(r7.A0Q("sender", (String) null));
        if (A042 == null) {
            A042 = userJid;
        }
        C17960vV.A07(A0Q);
        String str = ((AnonymousClass1KL) AnonymousClass1KL.A0C).A06;
        C18070vi.A0W(str);
        C57312is A043 = this.A05.A04(A0Q);
        if (A043 != null) {
            bd1 = A043.A00(str);
        } else {
            bd1 = null;
        }
        C17960vV.A07(bd1);
        AnonymousClass1KJ A013 = this.A02.A01(str);
        C17960vV.A07(A042);
        AW0 A022 = C20128A8n.A02(A013, new AnonymousClass1KN(new BigDecimal(0), 1), A042, userJid2, str, A0Q2, A0Q, 20, 12, A012, bd1.BZ3(), 0, j2);
        AnonymousClass8pG BdL = bd1.BdL();
        if (BdL != null) {
            A022.A09(BdL, C20099A7c.A04(A0Q3, j / 1000) * 1000);
        }
        return A022;
    }

    /* JADX WARNING: type inference failed for: r7v1, types: [X.2r3, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r14v1, types: [java.lang.Object, X.CUj] */
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processHandlersOutBlocks(RegionMaker.java:1008)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:978)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x033a  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x035f  */
    /* JADX WARNING: Removed duplicated region for block: B:249:? A[ExcHandler: JSONException (unused org.json.JSONException), SYNTHETIC, Splitter:B:237:0x05d4] */
    public X.AW0 A03(X.C21522AlV r62, X.C29621ca r63) {
        /*
            r61 = this;
            r9 = r61
            X.1NG r4 = r9.A08
            java.lang.String r1 = "sender"
            r3 = 0
            r0 = r63
            java.lang.String r1 = r0.A0Q(r1, r3)
            X.1Dw r2 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.jid.UserJid r1 = r2.A04(r1)
            X.1BI r44 = r4.A00(r1)
            r1 = r44
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            r44 = r1
            java.lang.String r1 = "receiver"
            java.lang.String r1 = r0.A0Q(r1, r3)
            com.whatsapp.jid.UserJid r1 = r2.A04(r1)
            X.1BI r43 = r4.A00(r1)
            r1 = r43
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            r43 = r1
            java.lang.String r2 = "transaction-type"
            java.lang.String r1 = "p2p"
            java.lang.String r8 = r0.A0Q(r2, r1)
            int r46 = r8.hashCode()
            r3 = 0
            switch(r46) {
                case -1703305877: goto L_0x06bc;
                case -1629586251: goto L_0x06b8;
                case -934813832: goto L_0x06b5;
                case 1554454174: goto L_0x06b2;
                default: goto L_0x0043;
            }
        L_0x0043:
            X.11S r2 = r9.A00
            r1 = r44
            boolean r1 = r2.A0O(r1)
            if (r1 != 0) goto L_0x004f
            if (r43 != 0) goto L_0x0050
        L_0x004f:
            r3 = 1
        L_0x0050:
            java.lang.String r7 = "country"
            java.lang.String r45 = "IN"
            r1 = r45
            java.lang.String r4 = r0.A0Q(r7, r1)
            java.lang.String r6 = "version"
            r10 = 0
            java.lang.String r2 = r0.A0Q(r6, r10)
            r1 = 1
            int r1 = X.C20099A7c.A01(r2, r1)
            boolean r1 = X.C20128A8n.A09(r4, r1)
            if (r1 != 0) goto L_0x0074
            r1 = -1
            X.AW0 r7 = A00(r0, r1)
        L_0x0073:
            return r7
        L_0x0074:
            java.lang.String r1 = "message-id"
            r13 = 0
            java.lang.String r42 = r0.A0Q(r1, r10)
            java.lang.String r1 = "group"
            java.lang.String r2 = r0.A0Q(r1, r10)
            X.1nh r1 = com.whatsapp.jid.GroupJid.Companion
            com.whatsapp.jid.GroupJid r41 = r1.A03(r2)
            java.lang.String r37 = "id"
            r1 = r37
            java.lang.String r40 = r0.A0Q(r1, r10)
            java.lang.String r1 = "status"
            java.lang.String r2 = r0.A0Q(r1, r10)
            java.lang.String r1 = "ts"
            java.lang.String r1 = r0.A0Q(r1, r10)
            r4 = 0
            long r18 = X.C20099A7c.A04(r1, r4)
            r11 = 1000(0x3e8, double:4.94E-321)
            long r18 = r18 * r11
            java.lang.String r1 = "credential-id"
            java.lang.String r22 = r0.A0Q(r1, r10)
            java.lang.String r1 = "error-code"
            java.lang.String r39 = r0.A0Q(r1, r10)
            java.lang.String r1 = "bank-transaction-id"
            java.lang.String r38 = r0.A0Q(r1, r10)
            java.lang.String r1 = "expiry-ts"
            java.lang.String r1 = r0.A0Q(r1, r10)
            long r20 = X.C20099A7c.A04(r1, r4)
            long r20 = r20 * r11
            java.lang.String r1 = "created-ts"
            java.lang.String r1 = r0.A0Q(r1, r10)
            long r16 = X.C20099A7c.A04(r1, r4)
            long r16 = r16 * r11
            java.lang.String r1 = "counter"
            java.lang.String r4 = r0.A0Q(r1, r10)
            r1 = 0
            int r36 = X.C20099A7c.A01(r4, r1)
            java.lang.String r1 = "sender-alias"
            java.lang.String r35 = r0.A0Q(r1, r10)
            java.lang.String r1 = "receiver-alias"
            java.lang.String r34 = r0.A0Q(r1, r10)
            java.lang.String r1 = "note"
            java.lang.String r30 = r0.A0Q(r1, r10)
            java.lang.String r1 = "payment_initiator"
            java.lang.String r11 = r0.A0Q(r1, r10)
            boolean r1 = android.text.TextUtils.isEmpty(r11)
            if (r1 != 0) goto L_0x0103
            java.lang.String r1 = "p2m"
            boolean r1 = r1.equals(r8)
            if (r1 != 0) goto L_0x0105
        L_0x0103:
            java.lang.String r11 = "na"
        L_0x0105:
            java.lang.String r1 = "mandate"
            X.1ca r1 = r0.A0K(r1)
            r10 = 0
            if (r1 == 0) goto L_0x012d
            r10 = 1
            X.1QD r12 = r9.A03
            android.content.SharedPreferences r5 = r12.A03()
            java.lang.String r4 = "payment_has_received_upi_mandate_request"
            r1 = 0
            boolean r1 = r5.getBoolean(r4, r1)
            if (r1 != 0) goto L_0x012d
            android.content.SharedPreferences r1 = r12.A03()
            android.content.SharedPreferences$Editor r1 = r1.edit()
            android.content.SharedPreferences$Editor r1 = r1.putBoolean(r4, r10)
            r1.apply()
        L_0x012d:
            X.1QJ r1 = r9.A04
            X.2tK r15 = r1.A02()
            java.lang.String r33 = r0.A0Q(r7, r13)
            if (r33 != 0) goto L_0x013f
            if (r15 == 0) goto L_0x051e
            java.lang.String r1 = r15.A03
            r33 = r1
        L_0x013f:
            java.lang.String r4 = r0.A0Q(r6, r13)
            r1 = 1
            int r56 = X.C20099A7c.A01(r4, r1)
            java.lang.String r1 = "onboarding-provider-id"
            java.lang.String r32 = r0.A0Q(r1, r13)
            java.lang.String r4 = "onboarding-provider-name"
            r1 = 0
            r0.A0Q(r4, r13)
            java.lang.String r4 = "is_vpa"
            java.lang.String r5 = r0.A0Q(r4, r13)
            r4 = 0
            int r5 = X.C20099A7c.A01(r5, r4)
            r31 = 1
            r4 = r31
            if (r5 == r4) goto L_0x0176
            java.lang.String r4 = "is-vpa"
            java.lang.String r5 = r0.A0Q(r4, r13)
            r4 = 0
            int r5 = X.C20099A7c.A01(r5, r4)
            r4 = r31
            if (r5 == r4) goto L_0x0176
            r31 = 0
        L_0x0176:
            java.lang.String r4 = "sync-status"
            java.lang.String r5 = r0.A0Q(r4, r13)
            boolean r4 = android.text.TextUtils.isEmpty(r5)
            if (r4 != 0) goto L_0x018d
            java.lang.String r4 = "PARTIAL"
            boolean r4 = r4.equalsIgnoreCase(r5)
            r29 = 1
            if (r4 != 0) goto L_0x018f
        L_0x018d:
            r29 = 0
        L_0x018f:
            X.2r3 r7 = new X.2r3
            r7.<init>()
            X.1KJ r6 = X.AnonymousClass1KL.A0C
            r7.A02 = r6
            X.ARR r28 = r7.A00()
            if (r29 != 0) goto L_0x01ca
            java.lang.String r14 = "amount"
            X.1ca r5 = r0.A0K(r14)
            java.lang.String r4 = "currency"
            java.lang.String r12 = "PAY: PaymentsProtoParser :: extractAmountFromNode"
            if (r5 != 0) goto L_0x04b9
            java.lang.String r4 = r0.A0Q(r4, r13)
            java.lang.String r13 = r0.A0Q(r14, r13)
            if (r4 != 0) goto L_0x0498
            if (r13 != 0) goto L_0x04a2
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r12)
            java.lang.String r4 = " :: amount node is null"
        L_0x01c0:
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            com.whatsapp.util.Log.e((java.lang.String) r4)
        L_0x01ca:
            r4 = r28
            X.1KJ r4 = r4.A01
            X.1KL r4 = (X.AnonymousClass1KL) r4
            java.lang.String r5 = r4.A06
            X.C18070vi.A0W(r5)
            X.1KI r14 = r9.A02
            X.1KJ r47 = r14.A01(r5)
            X.1KL r6 = (X.AnonymousClass1KL) r6
            java.lang.String r4 = r6.A06
            X.C18070vi.A0W(r4)
            boolean r27 = r5.equals(r4)
            r7 = 0
            if (r27 != 0) goto L_0x0495
            r4 = r28
            X.1KN r13 = r4.A02
            java.math.BigDecimal r4 = r13.A00
            double r25 = r4.doubleValue()
            r23 = 0
            int r4 = (r25 > r23 ? 1 : (r25 == r23 ? 0 : -1))
            if (r4 <= 0) goto L_0x0495
        L_0x01f9:
            if (r29 != 0) goto L_0x0204
            boolean r4 = android.text.TextUtils.isEmpty(r2)
            r4 = r4 ^ 1
            X.C17960vV.A0D(r4)
        L_0x0204:
            java.lang.String r6 = "service"
            java.lang.String r12 = r0.A0Q(r6, r1)
            java.lang.String r4 = "P2M_LITE"
            boolean r12 = r4.equals(r12)
            X.1QS r9 = r9.A05
            if (r12 == 0) goto L_0x0487
            X.AZ9 r12 = r9.A05(r4)
        L_0x0219:
            if (r12 == 0) goto L_0x06d1
            int r7 = r11.hashCode()
            r4 = -906014849(0xffffffffc9ff4f7f, float:-2091503.9)
            if (r7 == r4) goto L_0x047a
            r4 = 3507(0xdb3, float:4.914E-42)
            if (r7 == r4) goto L_0x0237
            r4 = 94110131(0x59c01b3, float:1.4670794E-35)
            if (r7 != r4) goto L_0x0237
            java.lang.String r4 = "buyer"
            boolean r4 = r11.equals(r4)
            r58 = 1
            if (r4 != 0) goto L_0x0239
        L_0x0237:
            r58 = 0
        L_0x0239:
            if (r29 == 0) goto L_0x02c3
            int r57 = r12.BZ3()
            r54 = 1000(0x3e8, float:1.401E-42)
            r55 = 0
            r52 = r1
            r48 = r1
            r49 = r44
            r50 = r43
            r51 = r5
            r53 = r33
            r59 = r18
            X.AW0 r7 = X.C20128A8n.A02(r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59)
        L_0x0255:
            java.lang.String r4 = "order"
            X.1ca r6 = r0.A0K(r4)
            if (r15 == 0) goto L_0x027d
            java.lang.String r5 = r15.A03
            r2 = r45
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L_0x026f
            java.lang.String r2 = "BR"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x027d
        L_0x026f:
            if (r6 == 0) goto L_0x027d
            boolean r2 = android.text.TextUtils.isEmpty(r42)
            if (r2 == 0) goto L_0x027d
            java.lang.String r2 = "message_id"
            java.lang.String r42 = r6.A0Q(r2, r1)
        L_0x027d:
            if (r42 != 0) goto L_0x0281
            java.lang.String r42 = ""
        L_0x0281:
            r2 = r42
            r7.A0L = r2
            if (r41 != 0) goto L_0x028d
            r41 = r44
            if (r3 == 0) goto L_0x028d
            r41 = r43
        L_0x028d:
            r2 = r41
            r7.A0C = r2
            r7.A0Q = r3
            r2 = r40
            r7.A0K = r2
            r2 = r38
            r7.A0F = r2
            r2 = r22
            r7.A0H = r2
            r2 = r39
            r7.A0J = r2
            r2 = r18
            r7.A06 = r2
            r2 = r16
            r7.A05 = r2
            r2 = r31
            r7.A0P = r2
            if (r27 != 0) goto L_0x02b5
            r2 = r28
            r7.A08 = r2
        L_0x02b5:
            X.8pG r5 = r12.BdL()
            if (r5 == 0) goto L_0x065c
            android.text.TextUtils.isEmpty(r32)
            int r2 = r7.A03
            monitor-enter(r7)
            goto L_0x0524
        L_0x02c3:
            java.lang.String r4 = "COLLECT_SUCCESS"
            boolean r4 = r4.equalsIgnoreCase(r2)
            if (r4 != 0) goto L_0x0412
            java.lang.String r4 = "COLLECT_FAILED"
            boolean r4 = r4.equalsIgnoreCase(r2)
            if (r4 != 0) goto L_0x0412
            java.lang.String r4 = "COLLECT_FAILED_RISK"
            boolean r4 = r4.equalsIgnoreCase(r2)
            if (r4 != 0) goto L_0x0412
            java.lang.String r4 = "COLLECT_REJECTED"
            boolean r4 = r4.equalsIgnoreCase(r2)
            if (r4 != 0) goto L_0x0412
            java.lang.String r4 = "COLLECT_EXPIRED"
            boolean r4 = r4.equalsIgnoreCase(r2)
            if (r4 != 0) goto L_0x0412
            if (r10 == 0) goto L_0x02fd
            java.lang.String r4 = "AUTH_SUCCESS"
            boolean r4 = r4.equalsIgnoreCase(r2)
            if (r4 != 0) goto L_0x0412
            java.lang.String r4 = "AUTH_CANCELED"
            boolean r4 = r4.equalsIgnoreCase(r2)
            if (r4 != 0) goto L_0x0412
        L_0x02fd:
            boolean r7 = android.text.TextUtils.isEmpty(r8)
            r4 = 2
            if (r7 != 0) goto L_0x0311
            java.util.Locale r7 = java.util.Locale.US
            java.lang.String r9 = r8.toLowerCase(r7)
            int r7 = r9.hashCode()
            switch(r7) {
                case -1703305877: goto L_0x0406;
                case -1629586251: goto L_0x03f9;
                case -995205722: goto L_0x03ed;
                case -934813832: goto L_0x03e2;
                case 109291: goto L_0x03d2;
                case 1554454174: goto L_0x03c7;
                default: goto L_0x0311;
            }
        L_0x0311:
            if (r3 == 0) goto L_0x0314
            r4 = 1
        L_0x0314:
            int r57 = r12.BZ3()
            r7 = 9
            if (r4 != r7) goto L_0x0335
            java.lang.String r7 = r0.A0Q(r6, r1)
            boolean r6 = android.text.TextUtils.isEmpty(r7)
            if (r6 != 0) goto L_0x0333
            java.util.Locale r6 = java.util.Locale.US
            java.lang.String r7 = r7.toLowerCase(r6)
            int r6 = r7.hashCode()
            switch(r6) {
                case -2031560318: goto L_0x03bb;
                case 116014: goto L_0x03ae;
                case 97229420: goto L_0x03a3;
                default: goto L_0x0333;
            }
        L_0x0333:
            r57 = 0
        L_0x0335:
            switch(r46) {
                case -1629586251: goto L_0x0376;
                case -934813832: goto L_0x037a;
                case 1554454174: goto L_0x037d;
                default: goto L_0x0338;
            }
        L_0x0338:
            if (r3 == 0) goto L_0x035f
            X.C17960vV.A07(r12)
            int r57 = r12.BZ3()
            r59 = -1
            r55 = 401(0x191, float:5.62E-43)
            r48 = r13
            r49 = r44
            r50 = r43
            r51 = r5
            r52 = r1
            r53 = r33
            r54 = r4
            X.AW0 r7 = X.C20128A8n.A02(r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59)
        L_0x0357:
            int r2 = X.C20128A8n.A00(r4, r2)
        L_0x035b:
            r7.A02 = r2
            goto L_0x0255
        L_0x035f:
            r55 = 101(0x65, float:1.42E-43)
            r48 = r13
            r49 = r44
            r50 = r43
            r51 = r5
            r52 = r1
            r53 = r33
            r54 = r4
            r59 = r18
            X.AW0 r7 = X.C20128A8n.A02(r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59)
            goto L_0x0357
        L_0x0376:
            java.lang.String r6 = "withdrawal"
            goto L_0x037f
        L_0x037a:
            java.lang.String r6 = "refund"
            goto L_0x037f
        L_0x037d:
            java.lang.String r6 = "deposit"
        L_0x037f:
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L_0x0338
            X.C17960vV.A07(r12)
            int r57 = r12.BZ3()
            r55 = 401(0x191, float:5.62E-43)
            r48 = r13
            r49 = r44
            r50 = r43
            r51 = r5
            r52 = r1
            r53 = r33
            r54 = r4
            r59 = r18
            X.AW0 r7 = X.C20128A8n.A02(r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59)
            goto L_0x0357
        L_0x03a3:
            java.lang.String r6 = "fbpay"
            boolean r6 = r7.equals(r6)
            r57 = 2
            if (r6 != 0) goto L_0x0335
            goto L_0x0333
        L_0x03ae:
            java.lang.String r6 = "upi"
            boolean r6 = r7.equals(r6)
            r57 = 1
            if (r6 != 0) goto L_0x0335
            goto L_0x0333
        L_0x03bb:
            java.lang.String r6 = "p2m_lite"
            boolean r6 = r7.equals(r6)
            r57 = 4
            if (r6 != 0) goto L_0x0335
            goto L_0x0333
        L_0x03c7:
            java.lang.String r7 = "deposit"
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto L_0x0311
            r4 = 6
            goto L_0x0314
        L_0x03d2:
            java.lang.String r7 = "p2m"
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto L_0x0311
            r4 = 200(0xc8, float:2.8E-43)
            if (r3 == 0) goto L_0x0314
            r4 = 100
            goto L_0x0314
        L_0x03e2:
            java.lang.String r7 = "refund"
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto L_0x0311
            r4 = 7
            goto L_0x0314
        L_0x03ed:
            java.lang.String r7 = "payout"
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto L_0x0311
            r4 = 300(0x12c, float:4.2E-43)
            goto L_0x0314
        L_0x03f9:
            java.lang.String r7 = "withdrawal"
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto L_0x0311
            r4 = 8
            goto L_0x0314
        L_0x0406:
            java.lang.String r7 = "incentive"
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto L_0x0311
            r4 = 9
            goto L_0x0314
        L_0x0412:
            if (r3 == 0) goto L_0x0459
            if (r10 == 0) goto L_0x043a
            int r57 = r12.BZ3()
            r55 = 12
            r58 = 0
            r54 = 40
            r48 = r13
            r49 = r44
            r50 = r43
            r51 = r5
            r52 = r1
            r53 = r33
            r59 = r18
            X.AW0 r7 = X.C20128A8n.A02(r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59)
        L_0x0432:
            int r4 = r7.A03
        L_0x0434:
            int r2 = X.C20128A8n.A00(r4, r2)
            goto L_0x035b
        L_0x043a:
            int r55 = X.C196679vS.A00(r33)
            r54 = 12
            r57 = 0
            r53 = 20
            r46 = r47
            r47 = r13
            r48 = r44
            r49 = r43
            r50 = r5
            r51 = r1
            r52 = r33
            r58 = r18
            X.AW0 r7 = X.C20128A8n.A02(r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58)
            goto L_0x0432
        L_0x0459:
            int r55 = X.C196679vS.A00(r33)
            r57 = 0
            r53 = 10
            r54 = 11
            r46 = r47
            r47 = r13
            r48 = r44
            r49 = r43
            r50 = r5
            r51 = r1
            r52 = r33
            r58 = r18
            X.AW0 r7 = X.C20128A8n.A02(r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58)
            r4 = 10
            goto L_0x0434
        L_0x047a:
            java.lang.String r4 = "seller"
            boolean r4 = r11.equals(r4)
            r58 = 2
            if (r4 != 0) goto L_0x0239
            goto L_0x0237
        L_0x0487:
            r4 = r33
            X.2is r4 = r9.A04(r4)
            if (r4 == 0) goto L_0x06d1
            X.BD1 r12 = r4.A00(r5)
            goto L_0x0219
        L_0x0495:
            r13 = r1
            goto L_0x01f9
        L_0x0498:
            X.1KI r5 = r9.A02
            X.1KJ r4 = r5.A01(r4)
            r7.A02 = r4
            if (r13 == 0) goto L_0x04af
        L_0x04a2:
            double r4 = java.lang.Double.parseDouble(r13)
            r12 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r4 = r4 * r12
            long r12 = (long) r4
            r7.A01 = r12
        L_0x04af:
            r4 = 1000(0x3e8, float:1.401E-42)
            r7.A00 = r4
            X.ARR r28 = r7.A00()
            goto L_0x01ca
        L_0x04b9:
            java.lang.String r14 = "money"
            X.1ca r5 = r5.A0K(r14)
            if (r5 != 0) goto L_0x04cd
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r12)
            java.lang.String r4 = " :: money node is null"
            goto L_0x01c0
        L_0x04cd:
            java.lang.String r14 = "value"
            java.lang.String r23 = r5.A0Q(r14, r13)     // Catch:{ Exception -> 0x0500 }
            java.lang.String r14 = "offset"
            java.lang.String r14 = r5.A0Q(r14, r13)     // Catch:{ Exception -> 0x0500 }
            java.lang.String r5 = r5.A0Q(r4, r13)     // Catch:{ Exception -> 0x0500 }
            X.1KI r4 = r9.A02     // Catch:{ Exception -> 0x0500 }
            X.1KJ r13 = r4.A01(r5)     // Catch:{ Exception -> 0x0500 }
            java.lang.Long r4 = java.lang.Long.valueOf(r23)     // Catch:{ Exception -> 0x0500 }
            long r4 = r4.longValue()     // Catch:{ Exception -> 0x0500 }
            r7.A01 = r4     // Catch:{ Exception -> 0x0500 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r14)     // Catch:{ Exception -> 0x0500 }
            int r4 = r4.intValue()     // Catch:{ Exception -> 0x0500 }
            r7.A00 = r4     // Catch:{ Exception -> 0x0500 }
            r7.A02 = r13     // Catch:{ Exception -> 0x0500 }
            X.ARR r28 = r7.A00()     // Catch:{ Exception -> 0x0500 }
            goto L_0x01ca
        L_0x0500:
            r7 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r12)
            java.lang.String r4 = " :: an error occurred while parsing the money node :: e = "
            r5.append(r4)
            java.lang.String r4 = r7.getMessage()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            com.whatsapp.util.Log.e((java.lang.String) r4)
            goto L_0x01ca
        L_0x051e:
            X.2tK r1 = X.C63572tK.A0E
            java.lang.String r33 = "UNSET"
            goto L_0x013f
        L_0x0524:
            X.8pG r6 = r7.A0A     // Catch:{ all -> 0x06ce }
            if (r6 != 0) goto L_0x052b
            r7.A0A = r5     // Catch:{ all -> 0x06ce }
            r6 = r5
        L_0x052b:
            r6.A05(r14, r0, r2)     // Catch:{ all -> 0x06ce }
            X.BDa r2 = r7.A08     // Catch:{ all -> 0x06ce }
            if (r2 == 0) goto L_0x0534
            r6.A00 = r2     // Catch:{ all -> 0x06ce }
        L_0x0534:
            java.lang.String r2 = "offer_claim"
            X.1ca r3 = r0.A0K(r2)     // Catch:{ all -> 0x06ce }
            if (r3 == 0) goto L_0x0562
            java.lang.String r2 = "offer_id"
            java.lang.String r9 = r3.A0Q(r2, r1)     // Catch:{ all -> 0x06ce }
            r2 = r37
            java.lang.String r10 = r3.A0Q(r2, r1)     // Catch:{ all -> 0x06ce }
            java.lang.String r2 = "parent_transaction_id"
            java.lang.String r8 = r3.A0Q(r2, r1)     // Catch:{ all -> 0x06ce }
            java.lang.String r2 = "incentive_payment_id"
            java.lang.String r3 = r3.A0Q(r2, r1)     // Catch:{ all -> 0x06ce }
            if (r9 == 0) goto L_0x0562
            if (r10 != 0) goto L_0x055b
            if (r8 != 0) goto L_0x055b
            goto L_0x0562
        L_0x055b:
            X.ADR r2 = new X.ADR     // Catch:{ all -> 0x06ce }
            r2.<init>(r9, r10, r8, r3)     // Catch:{ all -> 0x06ce }
            r6.A01 = r2     // Catch:{ all -> 0x06ce }
        L_0x0562:
            X.1ca r10 = r0.A0K(r4)     // Catch:{ all -> 0x06ce }
            if (r10 == 0) goto L_0x058d
            r2 = r37
            java.lang.String r9 = r10.A0Q(r2, r1)     // Catch:{ all -> 0x06ce }
            if (r9 == 0) goto L_0x058d
            java.lang.String r2 = "message_id"
            java.lang.String r8 = r10.A0Q(r2, r1)     // Catch:{ all -> 0x06ce }
            if (r8 == 0) goto L_0x058d
            r2 = 0
            java.lang.String r4 = "expiry_ts"
            long r2 = r10.A0D(r4, r2)     // Catch:{ 1UI -> 0x0581 }
            goto L_0x0586
        L_0x0581:
            java.lang.String r4 = "PAY: PaymentTransactionCountryData/parseOrderData : invalid expiry timestamp format"
            com.whatsapp.util.Log.e((java.lang.String) r4)     // Catch:{ all -> 0x06ce }
        L_0x0586:
            X.AEo r4 = new X.AEo     // Catch:{ all -> 0x06ce }
            r4.<init>(r2, r9, r8)     // Catch:{ all -> 0x06ce }
            r6.A02 = r4     // Catch:{ all -> 0x06ce }
        L_0x058d:
            monitor-exit(r7)
            r2 = r36
            r7.A08(r5, r2)
            monitor-enter(r7)
            boolean r2 = android.text.TextUtils.isEmpty(r35)     // Catch:{ all -> 0x06ce }
            if (r2 != 0) goto L_0x05a6
            X.8pG r3 = r7.A0A     // Catch:{ all -> 0x06ce }
            if (r3 != 0) goto L_0x05a1
            r7.A0A = r5     // Catch:{ all -> 0x06ce }
            r3 = r5
        L_0x05a1:
            r2 = r35
            r3.A0V(r2)     // Catch:{ all -> 0x06ce }
        L_0x05a6:
            monitor-exit(r7)
            monitor-enter(r7)
            boolean r2 = android.text.TextUtils.isEmpty(r34)     // Catch:{ all -> 0x06ce }
            if (r2 != 0) goto L_0x05ba
            X.8pG r3 = r7.A0A     // Catch:{ all -> 0x06ce }
            if (r3 != 0) goto L_0x05b5
            r7.A0A = r5     // Catch:{ all -> 0x06ce }
            r3 = r5
        L_0x05b5:
            r2 = r34
            r3.A0U(r2)     // Catch:{ all -> 0x06ce }
        L_0x05ba:
            monitor-exit(r7)
            r2 = r20
            r7.A09(r5, r2)
            r4 = r62
            if (r62 == 0) goto L_0x065c
            if (r31 == 0) goto L_0x065c
            boolean r2 = android.text.TextUtils.isEmpty(r30)
            if (r2 != 0) goto L_0x065c
            boolean r2 = android.text.TextUtils.isEmpty(r30)
            if (r2 != 0) goto L_0x065c
            if (r30 == 0) goto L_0x065c
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x065c }
            r2 = r30
            r3.<init>(r2)     // Catch:{ JSONException -> 0x065c }
            java.lang.String r2 = "pkeVersion"
            r3.getInt(r2)     // Catch:{ JSONException -> 0x065c }
            java.lang.String r2 = "nonce"
            java.lang.String r8 = r3.getString(r2)     // Catch:{ JSONException -> 0x065c }
            java.lang.String r2 = "serverPubKey"
            java.lang.String r9 = r3.getString(r2)     // Catch:{ JSONException -> 0x065c }
            java.lang.String r2 = "serverPubKeySig"
            java.lang.String r6 = r3.getString(r2)     // Catch:{ JSONException -> 0x065c }
            java.lang.String r2 = "cert"
            java.lang.String r12 = r3.getString(r2)     // Catch:{ JSONException -> 0x065c }
            java.lang.String r2 = "encData"
            java.lang.String r3 = r3.getString(r2)     // Catch:{ JSONException -> 0x065c }
            r2 = 8
            byte[] r8 = android.util.Base64.decode(r8, r2)     // Catch:{ JSONException -> 0x065c }
            byte[] r9 = android.util.Base64.decode(r9, r2)     // Catch:{ JSONException -> 0x065c }
            byte[] r11 = android.util.Base64.decode(r6, r2)     // Catch:{ JSONException -> 0x065c }
            byte[] r6 = android.util.Base64.decode(r3, r2)     // Catch:{ JSONException -> 0x065c }
            X.CUj r14 = new X.CUj
            r14.<init>()
            r2 = 1
            r10 = 0
            java.lang.String[] r3 = new java.lang.String[r2]     // Catch:{ CertificateExpiredException -> 0x0657, JSONException -> 0x065c }
            java.lang.String r2 = "CN=Facebook Purpose Encryption Signature"
            r3[r10] = r2     // Catch:{ CertificateExpiredException -> 0x0657, JSONException -> 0x065c }
            java.security.cert.X509Certificate r10 = r14.A00(r12, r3)     // Catch:{ CertificateExpiredException -> 0x0657, JSONException -> 0x065c }
            java.lang.String r2 = "SHA256withRSA"
            java.security.Signature r3 = java.security.Signature.getInstance(r2)     // Catch:{ CertificateExpiredException -> 0x0657, JSONException -> 0x065c }
            java.security.PublicKey r2 = r10.getPublicKey()     // Catch:{ CertificateExpiredException -> 0x0657, JSONException -> 0x065c }
            r3.initVerify(r2)     // Catch:{ CertificateExpiredException -> 0x0657, JSONException -> 0x065c }
            r3.update(r9)     // Catch:{ CertificateExpiredException -> 0x0657, JSONException -> 0x065c }
            boolean r2 = r3.verify(r11)     // Catch:{ CertificateExpiredException -> 0x0657, JSONException -> 0x065c }
            if (r2 == 0) goto L_0x065c
            java.util.concurrent.atomic.AtomicBoolean r2 = r4.A00
            boolean r2 = r2.get()
            if (r2 != 0) goto L_0x06c6
            byte[] r2 = r4.A01
            byte[] r2 = X.C26098CsI.A00(r9, r2)
            byte[] r3 = X.C25892Co3.A01(r2, r8, r6)
            java.lang.String r2 = new java.lang.String
            r2.<init>(r3)
            r5.A0T(r2)
            r4.destroy()
            goto L_0x065c
        L_0x0657:
            java.lang.String r2 = "Certificate expired"
            com.whatsapp.util.Log.e((java.lang.String) r2)
        L_0x065c:
            if (r13 == 0) goto L_0x0073
            if (r15 == 0) goto L_0x0073
            java.lang.String r2 = "is_hpp"
            java.lang.String r3 = r0.A0Q(r2, r1)
            java.lang.String r2 = "1"
            boolean r3 = r2.equals(r3)
            java.lang.String r2 = "gateway_name"
            java.lang.String r1 = r0.A0Q(r2, r1)
            if (r3 == 0) goto L_0x0073
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0073
            java.util.ArrayList r0 = r7.A0N
            r3 = 1
            if (r0 != 0) goto L_0x0686
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r3)
            r7.A0N = r0
        L_0x0686:
            X.8pL r2 = new X.8pL
            r2.<init>()
            X.C17960vV.A07(r15)
            r2.A07 = r15
            r0 = r22
            r2.A0A = r0
            r2.A0B(r1)
            java.util.ArrayList r1 = r7.A0N
            X.9dI r0 = new X.9dI
            r0.<init>(r13, r2, r3)
            r1.add(r0)
            long r1 = r7.A06
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x0073
            long r1 = r7.A05
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0073
            r7.A06 = r1
            return r7
        L_0x06b2:
            java.lang.String r1 = "deposit"
            goto L_0x06be
        L_0x06b5:
            java.lang.String r1 = "refund"
            goto L_0x06be
        L_0x06b8:
            java.lang.String r1 = "withdrawal"
            goto L_0x06be
        L_0x06bc:
            java.lang.String r1 = "incentive"
        L_0x06be:
            boolean r1 = r8.equals(r1)
            if (r1 == 0) goto L_0x0043
            goto L_0x0050
        L_0x06c6:
            java.lang.String r1 = "key has been destroyed"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x06ce:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L_0x06d1:
            java.lang.String r0 = "PaymentsProtoParser/parsePaymentTransaction service == null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30951em.A03(X.AlV, X.1ca):X.AW0");
    }

    public ArrayList A04(C21522AlV alV, C29621ca r9) {
        C29621ca[] r0;
        int length;
        C29621ca A0K = r9.A0K("account");
        if (A0K == null || (r0 = A0K.A02) == null || (length = r0.length) <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(length);
        int i = 0;
        do {
            C29621ca A0J = A0K.A0J(i);
            C17960vV.A07(A0J);
            if ("transaction".equals(A0J.A00)) {
                arrayList.add(A03(alV, A0J));
            }
            i++;
        } while (i < length);
        return arrayList;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: X.AEs} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: X.AEs} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: X.AEs} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: X.AEs} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: X.AEs} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: X.AEs} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: X.AEs} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: X.AEs} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: X.AEs} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: X.AEs} */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r2v27 */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x027e, code lost:
        switch(r12) {
            case 0: goto L_0x02b2;
            case 1: goto L_0x02ad;
            case 2: goto L_0x02a8;
            case 3: goto L_0x02a3;
            case 4: goto L_0x02b9;
            case 5: goto L_0x02b4;
            case 6: goto L_0x02a0;
            case 7: goto L_0x029b;
            case 8: goto L_0x0299;
            case 9: goto L_0x028e;
            case 10: goto L_0x0289;
            case 11: goto L_0x0284;
            default: goto L_0x0281;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0284, code lost:
        r17 = "1".equals(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0289, code lost:
        r14 = "1".equals(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x028e, code lost:
        r30 = X.C20099A7c.A04(r6, 0) * 1000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0299, code lost:
        r7 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x029b, code lost:
        r16 = "1".equals(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02a0, code lost:
        r23 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02a3, code lost:
        r18 = "1".equals(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02a8, code lost:
        r15 = "1".equals(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x02ad, code lost:
        r13 = "1".equals(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02b2, code lost:
        r2 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02b4, code lost:
        r24 = X.C20085A6m.A00(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02b9, code lost:
        r29 = X.C20085A6m.A01(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0321, code lost:
        if (r0 == false) goto L_0x027b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x035d, code lost:
        if (r17 != false) goto L_0x035f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0365, code lost:
        if (r15 != false) goto L_0x0367;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005b, code lost:
        com.whatsapp.util.Log.w("PAY: PaymentsProtoParser unset payment method");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0060, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x0281, code lost:
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0281, code lost:
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0281, code lost:
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x0281, code lost:
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x0281, code lost:
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0281, code lost:
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x0281, code lost:
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0281, code lost:
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x0281, code lost:
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0281, code lost:
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0281, code lost:
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0281, code lost:
        r2 = r2;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0066 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList A05(X.C29621ca r33) {
        /*
            r32 = this;
            r9 = r33
            if (r33 == 0) goto L_0x0413
            java.lang.String r1 = "wa-support-phone-number"
            r0 = 0
            java.lang.String r2 = r9.A0Q(r1, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            r3 = r32
            if (r0 != 0) goto L_0x0027
            X.1QD r0 = r3.A03
            android.content.SharedPreferences r0 = r0.A03()
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "payments_support_phone_number"
            android.content.SharedPreferences$Editor r0 = r1.putString(r0, r2)
            r0.apply()
        L_0x0027:
            X.1ca[] r0 = r9.A02
            if (r0 == 0) goto L_0x0413
            int r0 = r0.length
            r19 = r0
            if (r0 <= 0) goto L_0x0413
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r4 = 0
        L_0x0036:
            r0 = r19
            if (r4 >= r0) goto L_0x0414
            X.1ca r5 = r9.A0J(r4)
            X.C17960vV.A07(r5)
            java.lang.String r1 = r5.A00
            int r0 = r1.hashCode()
            switch(r0) {
                case -795192327: goto L_0x03fb;
                case -505296440: goto L_0x03ff;
                case 3016252: goto L_0x0402;
                case 3046160: goto L_0x0405;
                case 1368775624: goto L_0x0408;
                default: goto L_0x004a;
            }
        L_0x004a:
            java.lang.String r0 = "PAY: PaymentsProtoParser unset payment method"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r0 = 0
        L_0x0050:
            if (r0 == 0) goto L_0x0066
            java.lang.String r1 = r5.A00
            int r0 = r1.hashCode()
            switch(r0) {
                case -795192327: goto L_0x0069;
                case -505296440: goto L_0x0095;
                case 3016252: goto L_0x015c;
                case 3046160: goto L_0x0241;
                case 1368775624: goto L_0x037f;
                default: goto L_0x005b;
            }
        L_0x005b:
            java.lang.String r0 = "PAY: PaymentsProtoParser unset payment method"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0060:
            r2 = 0
        L_0x0061:
            if (r2 == 0) goto L_0x0066
            r8.add(r2)
        L_0x0066:
            int r4 = r4 + 1
            goto L_0x0036
        L_0x0069:
            java.lang.String r0 = "wallet"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x005b
            java.lang.String r0 = "country"
            r2 = 0
            java.lang.String r1 = r5.A0Q(r0, r2)
            X.1QS r0 = r3.A05
            X.2is r0 = r0.A04(r1)
            X.C17960vV.A07(r0)
            X.BD1 r0 = r0.A00(r2)
            X.8pU r0 = r0.BdM()
            X.C17960vV.A07(r0)
            java.lang.String r1 = "fromNetwork"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x0095:
            java.lang.String r0 = "merchant"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x005b
            r2 = 0
            X.1MD[] r12 = r5.A0S()     // Catch:{ Exception -> 0x0154 }
            if (r12 != 0) goto L_0x00aa
            java.lang.String r0 = "PAY: PaymentsProtoParser when parsing merchant: attributes are null"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ Exception -> 0x0154 }
            goto L_0x0061
        L_0x00aa:
            r11 = 0
            r14 = r2
            r13 = r2
            r22 = r2
            r21 = r2
            r10 = 0
            r24 = 0
            r25 = 0
            r23 = 0
        L_0x00b8:
            int r0 = r12.length     // Catch:{ Exception -> 0x0154 }
            if (r10 >= r0) goto L_0x0119
            r0 = r12[r10]     // Catch:{ Exception -> 0x0154 }
            java.lang.String r7 = r0.A02     // Catch:{ Exception -> 0x0154 }
            r0 = r12[r10]     // Catch:{ Exception -> 0x0154 }
            java.lang.String r6 = r0.A03     // Catch:{ Exception -> 0x0154 }
            java.lang.String r0 = "credential-id"
            boolean r0 = r7.equals(r0)     // Catch:{ Exception -> 0x0154 }
            if (r0 == 0) goto L_0x00cd
            r13 = r6
            goto L_0x0116
        L_0x00cd:
            java.lang.String r0 = "country"
            boolean r0 = r7.equals(r0)     // Catch:{ Exception -> 0x0154 }
            if (r0 == 0) goto L_0x00d6
            goto L_0x0115
        L_0x00d6:
            java.lang.String r0 = "merchant-id"
            boolean r0 = r7.equals(r0)     // Catch:{ Exception -> 0x0154 }
            if (r0 == 0) goto L_0x00e1
            r21 = r6
            goto L_0x0116
        L_0x00e1:
            java.lang.String r0 = "p2m-eligible"
            boolean r0 = r7.equals(r0)     // Catch:{ Exception -> 0x0154 }
            java.lang.String r1 = "1"
            if (r0 == 0) goto L_0x00f0
            boolean r24 = r1.equals(r6)     // Catch:{ Exception -> 0x0154 }
            goto L_0x0116
        L_0x00f0:
            java.lang.String r0 = "p2p-eligible"
            boolean r0 = r7.equals(r0)     // Catch:{ Exception -> 0x0154 }
            if (r0 == 0) goto L_0x00fd
            boolean r25 = r1.equals(r6)     // Catch:{ Exception -> 0x0154 }
            goto L_0x0116
        L_0x00fd:
            java.lang.String r0 = "logo-uri"
            boolean r0 = r7.equals(r0)     // Catch:{ Exception -> 0x0154 }
            if (r0 == 0) goto L_0x0108
            r22 = r6
            goto L_0x0116
        L_0x0108:
            java.lang.String r0 = "max_installment_count"
            boolean r0 = r7.equals(r0)     // Catch:{ Exception -> 0x0154 }
            if (r0 == 0) goto L_0x0116
            int r23 = java.lang.Integer.parseInt(r6)     // Catch:{ Exception -> 0x0154 }
            goto L_0x0116
        L_0x0115:
            r14 = r6
        L_0x0116:
            int r10 = r10 + 1
            goto L_0x00b8
        L_0x0119:
            java.lang.String r1 = "gateway-name"
            java.lang.String r0 = ""
            java.lang.String r7 = r5.A0Q(r1, r0)     // Catch:{ Exception -> 0x0154 }
            X.1QS r0 = r3.A05     // Catch:{ Exception -> 0x0154 }
            X.2is r0 = r0.A04(r14)     // Catch:{ Exception -> 0x0154 }
            X.C17960vV.A07(r0)     // Catch:{ Exception -> 0x0154 }
            X.BD1 r0 = r0.A00(r2)     // Catch:{ Exception -> 0x0154 }
            X.8pX r6 = r0.BdK()     // Catch:{ Exception -> 0x0154 }
            X.C17960vV.A07(r6)     // Catch:{ Exception -> 0x0154 }
            X.1KI r0 = r3.A02     // Catch:{ Exception -> 0x0154 }
            r6.A05(r0, r5, r11)     // Catch:{ Exception -> 0x0154 }
            X.2tK r1 = X.C63572tK.A00(r14)     // Catch:{ Exception -> 0x0154 }
            X.8pO r0 = new X.8pO     // Catch:{ Exception -> 0x0154 }
            r20 = r0
            r20.<init>(r21, r22, r23, r24, r25)     // Catch:{ Exception -> 0x0154 }
            X.C17960vV.A07(r1)     // Catch:{ Exception -> 0x0154 }
            r0.A07 = r1     // Catch:{ Exception -> 0x0154 }
            r0.A0A = r13     // Catch:{ Exception -> 0x0154 }
            r0.A08 = r6     // Catch:{ Exception -> 0x0154 }
            r0.A0B(r7)     // Catch:{ Exception -> 0x0154 }
            r2 = r0
            goto L_0x0061
        L_0x0154:
            r1 = move-exception
            java.lang.String r0 = "PAY: PaymentsProtoParser when creating merchant account: "
            com.whatsapp.util.Log.w(r0, r1)
            goto L_0x0061
        L_0x015c:
            java.lang.String r0 = "bank"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x005b
            r2 = 0
            X.1MD[] r13 = r5.A0S()     // Catch:{ Exception -> 0x0239 }
            if (r13 != 0) goto L_0x0172
            java.lang.String r0 = "PAY: PaymentsProtoParser when creating bank account: attributes are null"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ Exception -> 0x0239 }
            goto L_0x0061
        L_0x0172:
            r0 = 0
            r22 = r2
            r21 = r2
            r20 = r2
            r18 = r2
            r6 = 0
            r12 = 0
            r17 = 0
            r16 = 0
        L_0x0183:
            int r10 = r13.length     // Catch:{ Exception -> 0x0239 }
            if (r12 >= r10) goto L_0x01e9
            r10 = r13[r12]     // Catch:{ Exception -> 0x0239 }
            java.lang.String r14 = r10.A02     // Catch:{ Exception -> 0x0239 }
            r10 = r13[r12]     // Catch:{ Exception -> 0x0239 }
            java.lang.String r11 = r10.A03     // Catch:{ Exception -> 0x0239 }
            java.lang.String r10 = "credential-id"
            boolean r10 = r14.equals(r10)     // Catch:{ Exception -> 0x0239 }
            if (r10 == 0) goto L_0x0199
            r21 = r11
            goto L_0x01e6
        L_0x0199:
            java.lang.String r10 = "account-number"
            boolean r10 = r14.equals(r10)     // Catch:{ Exception -> 0x0239 }
            if (r10 == 0) goto L_0x01a2
            goto L_0x01e4
        L_0x01a2:
            java.lang.String r10 = "bank-name"
            boolean r10 = r14.equals(r10)     // Catch:{ Exception -> 0x0239 }
            if (r10 == 0) goto L_0x01ad
            r18 = r11
            goto L_0x01e6
        L_0x01ad:
            java.lang.String r10 = "country"
            boolean r10 = r14.equals(r10)     // Catch:{ Exception -> 0x0239 }
            if (r10 == 0) goto L_0x01b8
            r22 = r11
            goto L_0x01e6
        L_0x01b8:
            java.lang.String r10 = "default-debit"
            boolean r10 = r14.equals(r10)     // Catch:{ Exception -> 0x0239 }
            java.lang.String r15 = "1"
            if (r10 == 0) goto L_0x01c7
            boolean r17 = r11.equals(r15)     // Catch:{ Exception -> 0x0239 }
            goto L_0x01e6
        L_0x01c7:
            java.lang.String r10 = "default-credit"
            boolean r10 = r14.equals(r10)     // Catch:{ Exception -> 0x0239 }
            if (r10 == 0) goto L_0x01d4
            boolean r16 = r11.equals(r15)     // Catch:{ Exception -> 0x0239 }
            goto L_0x01e6
        L_0x01d4:
            java.lang.String r10 = "created"
            boolean r10 = r14.equals(r10)     // Catch:{ Exception -> 0x0239 }
            if (r10 == 0) goto L_0x01e6
            long r6 = X.C20099A7c.A04(r11, r0)     // Catch:{ Exception -> 0x0239 }
            r10 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 * r10
            goto L_0x01e6
        L_0x01e4:
            r20 = r11
        L_0x01e6:
            int r12 = r12 + 1
            goto L_0x0183
        L_0x01e9:
            X.1QS r1 = r3.A05     // Catch:{ Exception -> 0x0239 }
            r0 = r22
            X.2is r0 = r1.A04(r0)     // Catch:{ Exception -> 0x0239 }
            X.C17960vV.A07(r0)     // Catch:{ Exception -> 0x0239 }
            X.BD1 r0 = r0.A00(r2)     // Catch:{ Exception -> 0x0239 }
            X.8pW r11 = r0.BdG()     // Catch:{ Exception -> 0x0239 }
            X.C17960vV.A07(r11)     // Catch:{ Exception -> 0x0239 }
            X.1KI r1 = r3.A02     // Catch:{ Exception -> 0x0239 }
            r0 = 0
            r11.A05(r1, r5, r0)     // Catch:{ Exception -> 0x0239 }
            X.2tK r13 = X.C63572tK.A00(r22)     // Catch:{ Exception -> 0x0239 }
            r12 = 0
            if (r17 == 0) goto L_0x020d
            r12 = 2
        L_0x020d:
            r10 = 0
            if (r16 == 0) goto L_0x0211
            r10 = 2
        L_0x0211:
            r0 = -1
            X.8pN r5 = new X.8pN     // Catch:{ Exception -> 0x0239 }
            r5.<init>()     // Catch:{ Exception -> 0x0239 }
            X.C17960vV.A07(r13)     // Catch:{ Exception -> 0x0239 }
            r5.A07 = r13     // Catch:{ Exception -> 0x0239 }
            r5.A05 = r6     // Catch:{ Exception -> 0x0239 }
            r5.A06 = r0     // Catch:{ Exception -> 0x0239 }
            r5.A00 = r10     // Catch:{ Exception -> 0x0239 }
            r5.A01 = r12     // Catch:{ Exception -> 0x0239 }
            r0 = r21
            r5.A0A = r0     // Catch:{ Exception -> 0x0239 }
            r0 = r20
            r5.A0B(r0)     // Catch:{ Exception -> 0x0239 }
            r0 = r18
            r5.A0B = r0     // Catch:{ Exception -> 0x0239 }
            r5.A0D = r2     // Catch:{ Exception -> 0x0239 }
            r5.A08 = r11     // Catch:{ Exception -> 0x0239 }
            r2 = r5
            goto L_0x0061
        L_0x0239:
            r1 = move-exception
            java.lang.String r0 = "PAY: PaymentsProtoParser when creating bank account: "
            com.whatsapp.util.Log.w(r0, r1)
            goto L_0x0061
        L_0x0241:
            java.lang.String r0 = "card"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x005b
            X.1MD[] r11 = r5.A0S()
            r2 = 0
            if (r11 != 0) goto L_0x0257
            java.lang.String r0 = "PAY: PaymentsProtoParser when parsing card: attributes are null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0061
        L_0x0257:
            r23 = r2
            r30 = -1
            r10 = 0
            r18 = 0
            r24 = 7
            r17 = 0
            r16 = 0
            r15 = 0
            r14 = 0
            r29 = 0
            r13 = 0
            r7 = r2
        L_0x026a:
            int r0 = r11.length
            r12 = 2
            if (r10 >= r0) goto L_0x0325
            r0 = r11[r10]
            java.lang.String r1 = r0.A02
            java.lang.String r6 = r0.A03
            int r0 = r1.hashCode()
            switch(r0) {
                case -1485088175: goto L_0x031a;
                case -387679965: goto L_0x0312;
                case -387679962: goto L_0x030b;
                case -129299872: goto L_0x0303;
                case -65633415: goto L_0x02fb;
                case 3575610: goto L_0x02f2;
                case 102744158: goto L_0x02ea;
                case 270132229: goto L_0x02e2;
                case 957831062: goto L_0x02d9;
                case 1028554472: goto L_0x02d0;
                case 1830091262: goto L_0x02c7;
                case 1830091265: goto L_0x02be;
                default: goto L_0x027b;
            }
        L_0x027b:
            r12 = -1
        L_0x027c:
            java.lang.String r0 = "1"
            switch(r12) {
                case 0: goto L_0x02b2;
                case 1: goto L_0x02ad;
                case 2: goto L_0x02a8;
                case 3: goto L_0x02a3;
                case 4: goto L_0x02b9;
                case 5: goto L_0x02b4;
                case 6: goto L_0x02a0;
                case 7: goto L_0x029b;
                case 8: goto L_0x0299;
                case 9: goto L_0x028e;
                case 10: goto L_0x0289;
                case 11: goto L_0x0284;
                default: goto L_0x0281;
            }
        L_0x0281:
            int r10 = r10 + 1
            goto L_0x026a
        L_0x0284:
            boolean r17 = r0.equals(r6)
            goto L_0x0281
        L_0x0289:
            boolean r14 = r0.equals(r6)
            goto L_0x0281
        L_0x028e:
            r0 = 0
            long r30 = X.C20099A7c.A04(r6, r0)
            r0 = 1000(0x3e8, double:4.94E-321)
            long r30 = r30 * r0
            goto L_0x0281
        L_0x0299:
            r7 = r6
            goto L_0x0281
        L_0x029b:
            boolean r16 = r0.equals(r6)
            goto L_0x0281
        L_0x02a0:
            r23 = r6
            goto L_0x0281
        L_0x02a3:
            boolean r18 = r0.equals(r6)
            goto L_0x0281
        L_0x02a8:
            boolean r15 = r0.equals(r6)
            goto L_0x0281
        L_0x02ad:
            boolean r13 = r0.equals(r6)
            goto L_0x0281
        L_0x02b2:
            r2 = r6
            goto L_0x0281
        L_0x02b4:
            int r24 = X.C20085A6m.A00(r6)
            goto L_0x0281
        L_0x02b9:
            int r29 = X.C20085A6m.A01(r6)
            goto L_0x0281
        L_0x02be:
            java.lang.String r0 = "default-debit-p2p"
            boolean r0 = r1.equals(r0)
            r12 = 11
            goto L_0x0321
        L_0x02c7:
            java.lang.String r0 = "default-debit-p2m"
            boolean r0 = r1.equals(r0)
            r12 = 10
            goto L_0x0321
        L_0x02d0:
            java.lang.String r0 = "created"
            boolean r0 = r1.equals(r0)
            r12 = 9
            goto L_0x0321
        L_0x02d9:
            java.lang.String r0 = "country"
            boolean r0 = r1.equals(r0)
            r12 = 8
            goto L_0x0321
        L_0x02e2:
            java.lang.String r0 = "default-credit"
            boolean r0 = r1.equals(r0)
            r12 = 7
            goto L_0x0321
        L_0x02ea:
            java.lang.String r0 = "last4"
            boolean r0 = r1.equals(r0)
            r12 = 6
            goto L_0x0321
        L_0x02f2:
            java.lang.String r0 = "type"
            boolean r0 = r1.equals(r0)
            r12 = 5
            goto L_0x0321
        L_0x02fb:
            java.lang.String r0 = "network-type"
            boolean r0 = r1.equals(r0)
            r12 = 4
            goto L_0x0321
        L_0x0303:
            java.lang.String r0 = "default-debit"
            boolean r0 = r1.equals(r0)
            r12 = 3
            goto L_0x0321
        L_0x030b:
            java.lang.String r0 = "default-credit-p2p"
            boolean r0 = r1.equals(r0)
            goto L_0x0321
        L_0x0312:
            java.lang.String r0 = "default-credit-p2m"
            boolean r0 = r1.equals(r0)
            r12 = 1
            goto L_0x0321
        L_0x031a:
            java.lang.String r0 = "credential-id"
            boolean r0 = r1.equals(r0)
            r12 = 0
        L_0x0321:
            if (r0 != 0) goto L_0x027c
            goto L_0x027b
        L_0x0325:
            X.1QS r0 = r3.A05
            X.2is r1 = r0.A04(r7)
            if (r1 != 0) goto L_0x0343
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "[PAY] : PaymentsProtoParser/parseCard unsupported country : "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0060
        L_0x0343:
            r0 = 0
            X.BD1 r0 = r1.A00(r0)
            X.8pY r0 = r0.BdH()
            X.C17960vV.A07(r0)
            X.1KI r6 = r3.A02
            r1 = 0
            r0.A05(r6, r5, r1)
            X.2tK r20 = X.C63572tK.A00(r7)
            if (r18 != 0) goto L_0x035f
            r25 = 0
            if (r17 == 0) goto L_0x0361
        L_0x035f:
            r25 = 2
        L_0x0361:
            if (r16 != 0) goto L_0x0367
            r26 = 0
            if (r15 == 0) goto L_0x0369
        L_0x0367:
            r26 = 2
        L_0x0369:
            r27 = 0
            if (r14 == 0) goto L_0x036f
            r27 = 2
        L_0x036f:
            r28 = 0
            if (r13 == 0) goto L_0x0375
            r28 = 2
        L_0x0375:
            r21 = r0
            r22 = r2
            X.8pK r2 = X.C20085A6m.A02(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            goto L_0x0061
        L_0x037f:
            java.lang.String r0 = "custom_payment_method"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x005b
            r2 = 0
            X.1MD[] r13 = r5.A0S()     // Catch:{ Exception -> 0x03f3 }
            if (r13 != 0) goto L_0x0395
            java.lang.String r0 = "PAY: PaymentsProtoParser when parsing custom payment method: attributes are null"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ Exception -> 0x03f3 }
            goto L_0x0061
        L_0x0395:
            r11 = 0
            r10 = r2
            r7 = r2
            r6 = r2
            r12 = 0
        L_0x039a:
            int r0 = r13.length     // Catch:{ Exception -> 0x03f3 }
            if (r12 >= r0) goto L_0x03c7
            r0 = r13[r12]     // Catch:{ Exception -> 0x03f3 }
            java.lang.String r14 = r0.A02     // Catch:{ Exception -> 0x03f3 }
            r0 = r13[r12]     // Catch:{ Exception -> 0x03f3 }
            java.lang.String r1 = r0.A03     // Catch:{ Exception -> 0x03f3 }
            java.lang.String r0 = "credential-id"
            boolean r0 = r14.equals(r0)     // Catch:{ Exception -> 0x03f3 }
            if (r0 == 0) goto L_0x03af
            r6 = r1
            goto L_0x03c4
        L_0x03af:
            java.lang.String r0 = "country"
            boolean r0 = r14.equals(r0)     // Catch:{ Exception -> 0x03f3 }
            if (r0 == 0) goto L_0x03b8
            goto L_0x03c3
        L_0x03b8:
            java.lang.String r0 = "type"
            boolean r0 = r14.equals(r0)     // Catch:{ Exception -> 0x03f3 }
            if (r0 == 0) goto L_0x03c4
            r7 = r1
            goto L_0x03c4
        L_0x03c3:
            r10 = r1
        L_0x03c4:
            int r12 = r12 + 1
            goto L_0x039a
        L_0x03c7:
            X.1QS r0 = r3.A05     // Catch:{ Exception -> 0x03f3 }
            X.2is r0 = r0.A04(r10)     // Catch:{ Exception -> 0x03f3 }
            X.C17960vV.A07(r0)     // Catch:{ Exception -> 0x03f3 }
            X.BD1 r0 = r0.A00(r2)     // Catch:{ Exception -> 0x03f3 }
            if (r0 != 0) goto L_0x03dd
            java.lang.String r0 = "PAY: PaymentsProtoParser when parsing custom payment method: service is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ Exception -> 0x03f3 }
            goto L_0x0061
        L_0x03dd:
            X.8pV r1 = r0.BdJ()     // Catch:{ Exception -> 0x03f3 }
            X.C17960vV.A07(r1)     // Catch:{ Exception -> 0x03f3 }
            X.1KI r0 = r3.A02     // Catch:{ Exception -> 0x03f3 }
            r1.A05(r0, r5, r11)     // Catch:{ Exception -> 0x03f3 }
            X.2tK r0 = X.C63572tK.A00(r10)     // Catch:{ Exception -> 0x03f3 }
            X.8pM r2 = X.AnonymousClass9QM.A00(r0, r1, r7, r6, r7)     // Catch:{ Exception -> 0x03f3 }
            goto L_0x0061
        L_0x03f3:
            r1 = move-exception
            java.lang.String r0 = "PAY: PaymentsProtoParser when creating merchant account: "
            com.whatsapp.util.Log.w(r0, r1)
            goto L_0x0061
        L_0x03fb:
            java.lang.String r0 = "wallet"
            goto L_0x040a
        L_0x03ff:
            java.lang.String r0 = "merchant"
            goto L_0x040a
        L_0x0402:
            java.lang.String r0 = "bank"
            goto L_0x040a
        L_0x0405:
            java.lang.String r0 = "card"
            goto L_0x040a
        L_0x0408:
            java.lang.String r0 = "custom_payment_method"
        L_0x040a:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004a
            r0 = 1
            goto L_0x0050
        L_0x0413:
            r8 = 0
        L_0x0414:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30951em.A05(X.1ca):java.util.ArrayList");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.1en, java.lang.Object] */
    public C30951em(AnonymousClass11S r4, AnonymousClass121 r5, AnonymousClass1NG r6, AnonymousClass1KI r7, AnonymousClass1QD r8, AnonymousClass1QJ r9, AnonymousClass1QS r10, AnonymousClass00H r11) {
        this.A00 = r4;
        this.A05 = r10;
        this.A01 = r5;
        this.A03 = r8;
        this.A07 = r11;
        this.A08 = r6;
        this.A02 = r7;
        this.A04 = r9;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c6 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AW0 A02(com.whatsapp.jid.UserJid r18, X.C29621ca r19, long r20) {
        /*
            r17 = this;
            java.lang.String r0 = "version"
            r3 = 0
            r1 = r19
            java.lang.String r2 = r1.A0Q(r0, r3)
            r0 = 1
            int r12 = X.C20099A7c.A01(r2, r0)
            java.lang.String r0 = "sync-status"
            java.lang.String r2 = r1.A0Q(r0, r3)
            X.A8n r0 = X.C20128A8n.$redex_init_class
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x00bb
            java.lang.String r0 = "PARTIAL"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x00bb
            r5 = 1
            X.1KJ r0 = X.AnonymousClass1KL.A0C
            X.1KL r0 = (X.AnonymousClass1KL) r0
            java.lang.String r7 = r0.A06
            X.C18070vi.A0W(r7)
            X.2tK r0 = X.C63572tK.A0F
        L_0x0032:
            java.lang.String r2 = r0.A03
            java.lang.String r0 = "country"
            java.lang.String r9 = r1.A0Q(r0, r2)
            java.lang.String r0 = "amount"
            java.lang.String r2 = r1.A0Q(r0, r3)
            java.lang.String r0 = "receiver"
            java.lang.String r3 = r1.A0Q(r0, r3)
            X.1Dw r0 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.jid.UserJid r6 = r0.A04(r3)
            r3 = r17
            if (r6 != 0) goto L_0x00b7
            X.11S r4 = r3.A00
            boolean r0 = r4.A0N()
            if (r0 == 0) goto L_0x00b7
            r4.A0I()
            com.whatsapp.jid.PhoneUserJid r6 = r4.A0E
        L_0x005d:
            java.lang.String r0 = "UNSET"
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x006b
            X.1QS r0 = r3.A05
            java.lang.String r9 = r0.A07(r7)
        L_0x006b:
            X.1QS r0 = r3.A05
            X.2is r0 = r0.A04(r9)
            if (r0 == 0) goto L_0x00b5
            X.BD1 r0 = r0.A00(r7)
            if (r0 == 0) goto L_0x00b5
            int r13 = r0.BZ3()
        L_0x007d:
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            r8 = 0
            if (r0 != 0) goto L_0x00c6
            X.1KI r0 = r3.A02
            X.1KJ r3 = r0.A01(r7)
            if (r5 == 0) goto L_0x00aa
            r4 = r8
            r10 = 1000(0x3e8, float:1.401E-42)
        L_0x008f:
            r11 = 0
            r5 = r18
            r15 = r20
            r14 = r11
            X.AW0 r2 = X.C20128A8n.A02(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            java.lang.String r0 = "transaction-id"
            java.lang.String r1 = r1.A0Q(r0, r8)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x00a9
            r2.A0C(r1)
        L_0x00a9:
            return r2
        L_0x00aa:
            r0 = r3
            X.1KK r0 = (X.AnonymousClass1KK) r0
            int r0 = r0.A01
            X.1KN r4 = X.AnonymousClass2TQ.A00(r2, r0)
            r10 = 3
            goto L_0x008f
        L_0x00b5:
            r13 = 0
            goto L_0x007d
        L_0x00b7:
            X.C17960vV.A07(r6)
            goto L_0x005d
        L_0x00bb:
            r5 = 0
            java.lang.String r0 = "currency"
            java.lang.String r7 = r1.A0Q(r0, r3)
            X.2tK r0 = X.C63572tK.A0G
            goto L_0x0032
        L_0x00c6:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30951em.A02(com.whatsapp.jid.UserJid, X.1ca, long):X.AW0");
    }
}
