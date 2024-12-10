package X;

import com.whatsapp.jid.UserJid;
import java.util.Map;
import java.util.Set;

/* renamed from: X.2Mq  reason: invalid class name and case insensitive filesystem */
public class C48482Mq extends C48532Mv {
    public static final Set A04;
    public final AnonymousClass11S A00;
    public final AnonymousClass11P A01;
    public final AnonymousClass1NG A02;
    public final C31441fZ A03;

    static {
        String[] strArr = new String[4];
        strArr[0] = "offer";
        strArr[1] = "accept";
        strArr[2] = "reject";
        A04 = C17900vP.A0I("enc_rekey", strArr, 3);
    }

    public C48482Mq(AnonymousClass190 r11, AnonymousClass11S r12, AnonymousClass11P r13, AnonymousClass1NG r14, C18030ve r15, AnonymousClass18K r16, AnonymousClass37L r17, C31641ft r18, AnonymousClass1OZ r19, C31441fZ r20, C31411fW r21, Map map) {
        super(r11, r15, r16, r17, r18, r19, r21, map);
        this.A01 = r13;
        this.A00 = r12;
        this.A02 = r14;
        this.A03 = r20;
    }

    private AnonymousClass1BI A00(AnonymousClass1BI r4) {
        C24751Ln r1;
        C49502Qs r12;
        if (C22971Dz.A0M(r4)) {
            if (C18020vd.A05(C18040vf.A02, this.A02, 11660)) {
                return C22971Dz.A03((UserJid) r4);
            }
        }
        AnonymousClass1NG r2 = this.A02;
        if (!C22971Dz.A0d(r4)) {
            return r4;
        }
        if (C22971Dz.A0U(r4) && r2.A05()) {
            C29691ci A0A = ((AnonymousClass1CJ) r2.A00.get()).A0A(r4);
            if (A0A != null) {
                r12 = A0A.A0b;
            } else {
                r12 = null;
            }
            if (r12 == C49502Qs.CTWA) {
                return r4;
            }
            r1 = (C24751Ln) r2.A03.get();
            C18070vi.A0z(r4, "null cannot be cast to non-null type com.whatsapp.jid.LidUserJid");
            r4 = (AnonymousClass1E2) r4;
        } else if (!C22971Dz.A0Y(r4) || !r2.A04()) {
            return r4;
        } else {
            r1 = (C24751Ln) r2.A03.get();
            C18070vi.A0z(r4, "null cannot be cast to non-null type com.whatsapp.jid.UserJid");
        }
        return r1.A0F((UserJid) r4);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v10, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v11, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v1, resolved type: X.2eE} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v12, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v13, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v14, resolved type: byte[]} */
    /* JADX WARNING: type inference failed for: r12v10, types: [X.2eE] */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x053d, code lost:
        if (r14 != false) goto L_0x053f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x01c2, code lost:
        if (r1.A00.A0O(X.C22971Dz.A00(r5.A02)) == false) goto L_0x01c4;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x048e  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0492  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0496  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x049a  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x04e4  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x04e7  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x04f2  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x04fd  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0508  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0511  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0513  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x051e  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0172  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(X.C29621ca r45, java.lang.Integer r46, java.util.Map r47) {
        /*
            r44 = this;
            long r42 = android.os.SystemClock.uptimeMillis()
            java.lang.Class<com.whatsapp.jid.Jid> r25 = com.whatsapp.jid.Jid.class
            java.lang.String r2 = "from"
            r0 = r45
            r1 = r25
            com.whatsapp.jid.Jid r12 = r0.A0F(r1, r2)
            java.lang.String r24 = "id"
            r1 = r24
            java.lang.String r10 = r0.A0P(r1)
            java.lang.String r13 = "type"
            java.lang.String r15 = "delivery"
            java.lang.String r3 = r0.A0Q(r13, r15)
            java.lang.String r1 = "category"
            r4 = 0
            java.lang.String r21 = r0.A0Q(r1, r4)
            java.lang.String r20 = "participant"
            r2 = r25
            r1 = r20
            com.whatsapp.jid.Jid r6 = r0.A0F(r2, r1)
            java.lang.Class<com.whatsapp.jid.UserJid> r19 = com.whatsapp.jid.UserJid.class
            java.lang.String r2 = "recipient"
            r1 = r19
            com.whatsapp.jid.Jid r9 = r0.A0F(r1, r2)
            com.whatsapp.jid.UserJid r9 = (com.whatsapp.jid.UserJid) r9
            java.lang.String r1 = "edit"
            java.lang.String r18 = r0.A0Q(r1, r4)
            java.lang.String r17 = "offline"
            r1 = r17
            java.lang.String r5 = r0.A0Q(r1, r4)
            if (r5 == 0) goto L_0x005d
            java.lang.Integer r23 = java.lang.Integer.valueOf(r5)     // Catch:{ NumberFormatException -> 0x0053 }
            goto L_0x005f
        L_0x0053:
            r4 = move-exception
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r1 = "connection/handleReceipt: got bad offline="
            X.C17900vP.A0h(r1, r5, r2, r4)
        L_0x005d:
            r23 = 0
        L_0x005f:
            X.1BI r5 = X.C22971Dz.A00(r12)
            if (r9 == 0) goto L_0x049a
            boolean r1 = X.C22971Dz.A0e(r5)
            if (r1 != 0) goto L_0x049a
            r5 = r9
        L_0x006c:
            java.lang.String r11 = "retry"
            boolean r16 = r11.equals(r3)
            if (r16 == 0) goto L_0x0496
            X.1ca r4 = r0.A0L(r11)
            java.lang.String r2 = "v"
            java.lang.String r1 = "1"
            java.lang.String r37 = r4.A0Q(r2, r1)
        L_0x0081:
            int r39 = X.C64002u3.A04(r5)
            if (r6 == 0) goto L_0x0492
            r1 = 1
            com.whatsapp.jid.Jid[] r2 = new com.whatsapp.jid.Jid[r1]
            r1 = 0
            r2[r1] = r6
            java.util.HashSet r38 = X.AnonymousClass1AP.A01(r2)
        L_0x0091:
            r1 = r44
            X.1fZ r4 = r1.A03
            if (r3 != 0) goto L_0x048e
            java.lang.String r36 = ""
        L_0x0099:
            r8 = 1
            java.util.concurrent.atomic.AtomicLong r2 = r4.A06
            long r40 = r2.getAndIncrement()
            X.11P r2 = r4.A01
            r28 = r2
            X.0ve r2 = r4.A02
            r22 = r2
            X.190 r14 = r4.A00
            X.18K r7 = r4.A03
            X.1N7 r5 = r4.A04
            X.00H r2 = r4.A05
            java.lang.Object r4 = r2.get()
            X.1CP r4 = (X.AnonymousClass1CP) r4
            X.8vK r2 = new X.8vK
            r34 = r46
            r26 = r2
            r27 = r14
            r29 = r4
            r30 = r22
            r31 = r7
            r32 = r5
            r33 = r23
            r35 = r10
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r42)
            r5.A04(r2)
            long r4 = r2.A03
            r26 = r4
            r7 = 2
            java.lang.Integer r32 = java.lang.Integer.valueOf(r7)
            java.lang.Integer r34 = java.lang.Integer.valueOf(r39)
            r4 = 0
            r29 = r4
            r35 = r4
            r36 = r4
            r30 = r1
            r31 = r23
            r33 = r4
            r37 = r3
            r30.A02(r31, r32, r33, r34, r35, r36, r37)
            X.2lD r14 = new X.2lD
            r14.<init>()
            r14.A02 = r12
            java.lang.String r12 = "receipt"
            r14.A06 = r12
            r14.A08 = r10
            r14.A09 = r3
            r5 = r21
            r14.A05 = r5
            r14.A01 = r6
            r14.A03 = r9
            r5 = r18
            r14.A07 = r5
            r5 = r26
            r14.A00 = r5
            X.2nR r5 = r14.A00()
            boolean r6 = r15.equals(r3)
            java.lang.String r14 = "error"
            if (r6 == 0) goto L_0x0172
            r3 = 0
            X.1ca r9 = r0.A0J(r3)
            if (r9 == 0) goto L_0x04d0
            java.util.Set r6 = A04
            java.lang.String r3 = r9.A00
            boolean r3 = r6.contains(r3)
            if (r3 == 0) goto L_0x04d0
            r2.A05(r7)
            com.whatsapp.jid.Jid r2 = r5.A02
            com.whatsapp.jid.DeviceJid r6 = X.AnonymousClass1E0.A00(r2)
            if (r6 == 0) goto L_0x04ab
            com.whatsapp.protocol.VoipStanzaChildNode r2 = com.whatsapp.protocol.VoipStanzaChildNode.fromProtocolTreeNode(r9)
            X.37L r4 = r1.A04
            java.lang.String r0 = r5.A08
            X.C17960vV.A07(r0)
            X.2d5 r3 = new X.2d5
            r3.<init>(r6, r2)
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ConnectionThreadRequestsImpl/on-call-incoming-receipt tag="
            r2.append(r0)
            com.whatsapp.protocol.VoipStanzaChildNode r0 = r3.A01
            java.lang.String r0 = r0.tag
            r2.append(r0)
            java.lang.String r0 = " from="
            r2.append(r0)
            com.whatsapp.jid.DeviceJid r0 = r3.A00
            r2.append(r0)
            java.lang.String r0 = " type=delivery"
            X.C17890vO.A1A(r2, r0)
            X.3LB r2 = r4.A00
            r0 = 197(0xc5, float:2.76E-43)
            X.C17890vO.A0p(r2, r3, r0)
        L_0x016c:
            X.1OZ r0 = r1.A01
            r0.A0K(r5)
            return
        L_0x0172:
            java.lang.String r6 = "inactive"
            boolean r6 = r6.equals(r3)
            if (r6 != 0) goto L_0x04d0
            java.lang.String r6 = "sender"
            boolean r6 = r6.equals(r3)
            if (r6 != 0) goto L_0x04d0
            java.lang.String r6 = "played"
            boolean r6 = r6.equals(r3)
            if (r6 != 0) goto L_0x04d0
            java.lang.String r6 = "played-self"
            boolean r6 = r6.equals(r3)
            if (r6 != 0) goto L_0x04d0
            java.lang.String r6 = "read"
            boolean r6 = r6.equals(r3)
            if (r6 != 0) goto L_0x04d0
            java.lang.String r6 = "read-self"
            boolean r6 = r6.equals(r3)
            if (r6 != 0) goto L_0x04d0
            java.lang.String r6 = "server-error"
            boolean r6 = r6.equals(r3)
            if (r6 == 0) goto L_0x026d
            java.lang.String r6 = "rmr"
            X.1ca r11 = r0.A0K(r6)
            r10 = 1
            if (r11 != 0) goto L_0x01c4
            r10 = 0
            X.11S r9 = r1.A00
            com.whatsapp.jid.Jid r6 = r5.A02
            X.1BI r6 = X.C22971Dz.A00(r6)
            boolean r6 = r9.A0O(r6)
            if (r6 != 0) goto L_0x0471
        L_0x01c4:
            com.whatsapp.jid.Jid r13 = r5.A02
            X.C17960vV.A07(r13)
            com.whatsapp.jid.Jid r6 = r5.A01
            X.1BI r6 = X.C22971Dz.A00(r6)
            com.whatsapp.jid.UserJid r6 = X.C22941Dw.A00(r6)
            if (r10 == 0) goto L_0x01f4
            java.lang.String r8 = "jid"
            r6 = r25
            com.whatsapp.jid.Jid r13 = r11.A0F(r6, r8)
            java.lang.String r6 = "from_me"
            java.lang.String r8 = r11.A0Q(r6, r4)
            java.lang.String r6 = "true"
            boolean r8 = r6.equals(r8)
            r9 = r19
            r6 = r20
            com.whatsapp.jid.Jid r6 = r11.A0F(r9, r6)
            com.whatsapp.jid.UserJid r6 = (com.whatsapp.jid.UserJid) r6
        L_0x01f4:
            if (r13 == 0) goto L_0x0471
            java.lang.String r3 = "encrypt"
            X.1ca r9 = r0.A0K(r3)
            r2.A05(r7)
            X.37L r2 = r1.A04
            java.lang.String r0 = "enc_p"
            r1 = 0
            if (r9 == 0) goto L_0x026b
            X.1ca r0 = r9.A0K(r0)
            if (r0 == 0) goto L_0x026b
            byte[] r3 = r0.A01
        L_0x020e:
            java.lang.String r0 = "enc_iv"
            if (r9 == 0) goto L_0x021a
            X.1ca r0 = r9.A0K(r0)
            if (r0 == 0) goto L_0x021a
            byte[] r1 = r0.A01
        L_0x021a:
            java.lang.StringBuilder r7 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ConnectionThreadRequestsImpl/server-error-for-target remote_jid = "
            r7.append(r0)
            r7.append(r13)
            java.lang.String r0 = "; id="
            r7.append(r0)
            java.lang.String r0 = r5.A08
            r7.append(r0)
            java.lang.String r0 = "; participant="
            r7.append(r0)
            r7.append(r6)
            java.lang.String r0 = "; recipient="
            r7.append(r0)
            com.whatsapp.jid.UserJid r0 = r5.A03
            r7.append(r0)
            java.lang.String r0 = "; fromMe="
            r7.append(r0)
            r7.append(r8)
            java.lang.String r0 = "; isMdRmr="
            X.C17900vP.A0n(r0, r7, r10)
            X.3LB r2 = r2.A00
            X.2gN r12 = new X.2gN
            r14 = r6
            r15 = r5
            r16 = r3
            r17 = r1
            r18 = r8
            r19 = r10
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            r1 = 0
            r0 = 69
            android.os.Message r0 = android.os.Message.obtain(r4, r1, r0, r1, r12)
        L_0x0267:
            r2.CAe(r0)
            return
        L_0x026b:
            r3 = r4
            goto L_0x020e
        L_0x026d:
            if (r16 == 0) goto L_0x037d
            X.1ca r6 = r0.A0L(r11)
            java.lang.String r10 = "registration"
            X.1ca r10 = r0.A0L(r10)
            byte[] r14 = r10.A01
            if (r14 == 0) goto L_0x04c2
            int r11 = r14.length
            r10 = 4
            if (r11 != r10) goto L_0x04c2
            java.lang.String r10 = "v"
            java.lang.String r11 = "1"
            java.lang.String r10 = r6.A0Q(r10, r11)
            boolean r10 = r11.equals(r10)
            if (r10 == 0) goto L_0x0471
            java.lang.String r3 = "count"
            int r30 = r6.A0A(r3, r8)
            java.lang.String r10 = "t"
            java.lang.String r3 = r6.A0P(r10)
            long r10 = r6.A0E(r3, r10)
            r31 = 1000(0x3e8, double:4.94E-321)
            long r31 = r31 * r10
            r3 = r24
            java.lang.String r10 = r6.A0P(r3)
            if (r9 != 0) goto L_0x02b3
            com.whatsapp.jid.Jid r3 = r5.A02
            X.1BI r9 = X.C22971Dz.A00(r3)
        L_0x02b3:
            X.1BI r3 = r1.A00(r9)
            X.205 r22 = X.AnonymousClass205.A01(r3, r10, r8)
            java.lang.String r3 = "mediareason"
            r16 = 0
            r6.A0Q(r3, r4)
            java.lang.String r3 = "keys"
            X.1ca r10 = r0.A0K(r3)
            r15 = 0
            if (r10 == 0) goto L_0x037b
            java.lang.String r3 = "identity"
            X.1ca r3 = r10.A0L(r3)
            X.1ca r6 = r10.A0L(r13)
            byte[] r6 = r6.A01
            if (r6 == 0) goto L_0x04ba
            int r6 = r6.length
            if (r6 != r8) goto L_0x04ba
            byte[] r3 = r3.A01
            r16 = r3
            java.lang.String r3 = "key"
            X.1ca r6 = r10.A0K(r3)
            java.lang.String r3 = "value"
            if (r6 == 0) goto L_0x0379
            r9 = r24
            X.1ca r9 = r6.A0L(r9)
            X.1ca r6 = r6.A0L(r3)
            byte[] r9 = r9.A01
            byte[] r6 = r6.A01
            X.2eE r12 = new X.2eE
            r12.<init>(r9, r6, r4)
        L_0x02fe:
            java.lang.String r6 = "skey"
            X.1ca r11 = r10.A0L(r6)
            r6 = r24
            X.1ca r9 = r11.A0L(r6)
            X.1ca r6 = r11.A0L(r3)
            java.lang.String r3 = "signature"
            X.1ca r3 = r11.A0L(r3)
            byte[] r11 = r9.A01
            byte[] r9 = r6.A01
            byte[] r6 = r3.A01
            X.2eE r3 = new X.2eE
            r3.<init>(r11, r9, r6)
            java.lang.String r6 = "device-identity"
            X.1ca r6 = r10.A0K(r6)
            if (r6 == 0) goto L_0x032b
            byte[] r15 = r6.A01
        L_0x032b:
            r29 = r15
            r15 = r12
        L_0x032e:
            r2.A05(r7)
            X.37L r2 = r1.A04
            r1 = r17
            java.lang.String r1 = r0.A0Q(r1, r4)
            if (r1 != 0) goto L_0x033c
            r8 = 0
        L_0x033c:
            java.lang.String r1 = "is_lid"
            java.lang.String r1 = r0.A0Q(r1, r4)
            java.lang.String r0 = "true"
            boolean r34 = r0.equals(r1)
            java.lang.String r0 = "ConnectionThreadRequestsImpl/on-message-retry-by-target"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.3LB r2 = r2.A00
            X.2h0 r6 = new X.2h0
            r23 = r3
            r24 = r15
            r25 = r5
            r26 = r21
            r27 = r14
            r28 = r16
            r33 = r8
            r21 = r6
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r33, r34)
            java.lang.String r1 = "peer"
            java.lang.String r0 = r6.A06
            boolean r0 = r1.equals(r0)
            r1 = 2
            if (r0 == 0) goto L_0x0372
            r1 = 263(0x107, float:3.69E-43)
        L_0x0372:
            r0 = 0
            android.os.Message r0 = android.os.Message.obtain(r4, r0, r1, r0, r6)
            goto L_0x0267
        L_0x0379:
            r12 = r4
            goto L_0x02fe
        L_0x037b:
            r3 = r4
            goto L_0x032e
        L_0x037d:
            java.lang.String r6 = "enc_rekey_retry"
            boolean r6 = r6.equals(r3)
            if (r6 == 0) goto L_0x03f9
            java.lang.String r3 = "registration"
            X.1ca r3 = r0.A0L(r3)
            byte[] r6 = r3.A01
            if (r6 == 0) goto L_0x04c9
            int r4 = r6.length
            r3 = 4
            if (r4 != r3) goto L_0x04c9
            java.lang.String r3 = "enc_rekey"
            X.1ca r4 = r0.A0L(r3)
            java.lang.String r0 = "call-id"
            java.lang.String r9 = r4.A0P(r0)
            java.lang.String r3 = "count"
            java.lang.String r0 = r4.A0P(r3)
            int r0 = r4.A0B(r0, r3)
            byte r8 = (byte) r0
            r2.A05(r7)
            X.37L r3 = r1.A04
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ConnectionThreadRequestsImpl/on-call-rekey stanzaKey="
            r2.append(r0)
            r2.append(r5)
            java.lang.String r0 = " callId="
            r2.append(r0)
            r2.append(r9)
            java.lang.String r0 = " retry="
            X.C17900vP.A0j(r0, r2, r8)
            X.3LB r4 = r3.A00
            android.os.Bundle r3 = X.C17880vN.A0D()
            com.whatsapp.jid.Jid r0 = r5.A02
            com.whatsapp.jid.DeviceJid r0 = X.AnonymousClass1E0.A00(r0)
            X.C17960vV.A07(r0)
            java.lang.String r2 = r0.getRawString()
            java.lang.String r0 = "deviceJidRawString"
            r3.putString(r0, r2)
            java.lang.String r0 = r5.A09
            r3.putString(r13, r0)
            java.lang.String r0 = "callId"
            r3.putString(r0, r9)
            java.lang.String r0 = "registrationId"
            r3.putByteArray(r0, r6)
            r3.putByte(r11, r8)
            r0 = 150(0x96, float:2.1E-43)
            X.C17890vO.A0p(r4, r3, r0)
            goto L_0x016c
        L_0x03f9:
            boolean r6 = r14.equals(r3)
            if (r6 == 0) goto L_0x0425
            X.1ca r7 = r0.A0L(r14)
            java.lang.String r2 = r7.A0P(r13)
            java.lang.String r0 = "enc-v2-unknown-tags"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x016c
            java.lang.String r6 = "feature-incapable"
            boolean r0 = r6.equals(r2)
            if (r0 == 0) goto L_0x0471
            java.lang.String r0 = "reason"
            java.lang.String r3 = r7.A0Q(r0, r4)
            X.190 r2 = r1.A01
            r0 = 0
            r2.A0G(r6, r3, r0)
            goto L_0x016c
        L_0x0425:
            java.lang.String r0 = "peer_msg"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x044b
            r2.A05(r7)
            X.37L r2 = r1.A04
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ConnectionThreadRequestsImpl/on-peer-message-receipt stanza-id="
            r1.append(r0)
            java.lang.String r0 = r5.A08
            X.C17890vO.A1A(r1, r0)
            X.3LB r2 = r2.A00
            r1 = 0
            r0 = 221(0xdd, float:3.1E-43)
            android.os.Message r0 = android.os.Message.obtain(r4, r1, r0, r1, r5)
            goto L_0x0267
        L_0x044b:
            java.lang.String r0 = "hist_sync"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0471
            r2.A05(r7)
            X.37L r2 = r1.A04
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ConnectionThreadRequestsImpl/on-history-sync-receipt stanza-id="
            r1.append(r0)
            java.lang.String r0 = r5.A08
            X.C17890vO.A1A(r1, r0)
            X.3LB r2 = r2.A00
            r1 = 0
            r0 = 212(0xd4, float:2.97E-43)
            android.os.Message r0 = android.os.Message.obtain(r4, r1, r0, r1, r5)
            goto L_0x0267
        L_0x0471:
            X.2lD r2 = r5.A00()
            java.lang.String r0 = "487"
            r2.A01(r0)
            X.2nR r5 = r2.A00()
            X.2FH r2 = new X.2FH
            r2.<init>()
            r2.A00 = r12
            r2.A01 = r3
            X.18K r0 = r1.A03
            r0.CC7(r2)
            goto L_0x016c
        L_0x048e:
            r36 = r3
            goto L_0x0099
        L_0x0492:
            r38 = 0
            goto L_0x0091
        L_0x0496:
            r37 = 0
            goto L_0x0081
        L_0x049a:
            if (r5 != 0) goto L_0x006c
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ChatJid is null, receipt id="
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r10, r1)
            X.1UI r0 = X.AnonymousClass1UI.A01(r0)
            throw r0
        L_0x04ab:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "CallReceipt from invalid jid "
            java.lang.String r0 = X.AnonymousClass001.A1E(r2, r0, r1)
            X.1UI r0 = X.AnonymousClass1UI.A01(r0)
            throw r0
        L_0x04ba:
            java.lang.String r0 = "type node should contain exactly 1 byte"
            X.1UI r0 = X.AnonymousClass1UI.A01(r0)
            throw r0
        L_0x04c2:
            java.lang.String r0 = "invalid registration node"
            X.1UI r0 = X.AnonymousClass1UI.A01(r0)
            throw r0
        L_0x04c9:
            java.lang.String r0 = "invalid registration node"
            X.1UI r0 = X.AnonymousClass1UI.A01(r0)
            throw r0
        L_0x04d0:
            java.lang.String r9 = r5.A09
            X.C17960vV.A07(r9)
            int r3 = r9.hashCode()
            switch(r3) {
                case -1159650013: goto L_0x051e;
                case -985752877: goto L_0x0513;
                case -905962955: goto L_0x0508;
                case 3496342: goto L_0x04fd;
                case 24665195: goto L_0x04f2;
                case 110109190: goto L_0x04e7;
                case 823466996: goto L_0x04e4;
                default: goto L_0x04dc;
            }
        L_0x04dc:
            java.lang.String r1 = "invalid type"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x04e4:
            java.lang.String r3 = "delivery"
            goto L_0x050b
        L_0x04e7:
            java.lang.String r3 = "played-self"
            boolean r3 = r9.equals(r3)
            if (r3 == 0) goto L_0x04dc
            r6 = 18
            goto L_0x0528
        L_0x04f2:
            java.lang.String r3 = "inactive"
            boolean r3 = r9.equals(r3)
            if (r3 == 0) goto L_0x04dc
            r6 = 15
            goto L_0x0528
        L_0x04fd:
            java.lang.String r3 = "read"
            boolean r3 = r9.equals(r3)
            if (r3 == 0) goto L_0x04dc
            r6 = 13
            goto L_0x0528
        L_0x0508:
            java.lang.String r3 = "sender"
        L_0x050b:
            boolean r3 = r9.equals(r3)
            if (r3 == 0) goto L_0x04dc
            r6 = 5
            goto L_0x0528
        L_0x0513:
            java.lang.String r3 = "played"
            boolean r3 = r9.equals(r3)
            if (r3 == 0) goto L_0x04dc
            r6 = 8
            goto L_0x0528
        L_0x051e:
            java.lang.String r3 = "read-self"
            boolean r3 = r9.equals(r3)
            if (r3 == 0) goto L_0x04dc
            r6 = 17
        L_0x0528:
            com.whatsapp.jid.UserJid r11 = r5.A03
            java.lang.String r3 = "read-self"
            boolean r14 = r3.equals(r9)
            java.lang.String r3 = "sender"
            boolean r3 = r3.equals(r9)
            r13 = 0
            if (r11 == 0) goto L_0x053c
            if (r3 == 0) goto L_0x053f
        L_0x053c:
            r12 = 1
            if (r14 == 0) goto L_0x0540
        L_0x053f:
            r12 = 0
        L_0x0540:
            if (r3 == 0) goto L_0x0557
            if (r11 != 0) goto L_0x0557
            com.whatsapp.jid.Jid r3 = r5.A01
            X.1BI r3 = X.C22971Dz.A00(r3)
            com.whatsapp.jid.UserJid r3 = X.C22941Dw.A00(r3)
            if (r3 != 0) goto L_0x0557
            java.lang.String r0 = "Sender receipts must have a recipient or participant jid"
            X.1UI r0 = X.AnonymousClass1UI.A01(r0)
            throw r0
        L_0x0557:
            if (r14 == 0) goto L_0x056e
            if (r11 != 0) goto L_0x056e
            com.whatsapp.jid.Jid r3 = r5.A02
            X.1BI r3 = X.C22971Dz.A00(r3)
            boolean r3 = X.C22971Dz.A0V(r3)
            if (r3 != 0) goto L_0x056e
            java.lang.String r0 = "Read-self receipts must have a recipient jid"
            X.1UI r0 = X.AnonymousClass1UI.A01(r0)
            throw r0
        L_0x056e:
            com.whatsapp.jid.Jid r3 = r5.A02
            r26 = r3
            X.1BI r14 = X.C22971Dz.A00(r26)
            if (r11 == 0) goto L_0x0610
            boolean r3 = X.C22971Dz.A0e(r14)
            if (r3 != 0) goto L_0x0610
            boolean r3 = X.C22971Dz.A0a(r14)
            if (r3 != 0) goto L_0x0610
        L_0x0584:
            X.1BI r11 = r1.A00(r11)
            X.C17960vV.A07(r11)
            boolean r3 = r15.equals(r9)
            java.lang.String r9 = "biz"
            if (r3 == 0) goto L_0x060d
            X.1ca r15 = r0.A0K(r9)
            if (r15 == 0) goto L_0x060d
            java.lang.String r3 = "host_storage"
            java.lang.String r16 = r15.A0Q(r3, r4)
            java.lang.String r3 = "actual_actors"
            java.lang.String r14 = r15.A0Q(r3, r4)
            java.lang.String r3 = "privacy_mode_ts"
            java.lang.String r15 = r15.A0Q(r3, r4)
            X.1ya r22 = new X.1ya
            r4 = r16
            r3 = r22
            r3.<init>((java.lang.String) r4, (java.lang.String) r14, (java.lang.String) r15)
        L_0x05b4:
            X.1ca r3 = r0.A0J(r13)
            java.lang.String r4 = "participants"
            boolean r4 = X.C29621ca.A07(r3, r4)
            if (r4 == 0) goto L_0x0690
            java.lang.String r0 = "key"
            java.lang.String r21 = r3.A0P(r0)
            r0 = r21
            X.205 r20 = X.AnonymousClass205.A01(r11, r0, r12)
            X.1ca[] r14 = r3.A02
            if (r14 == 0) goto L_0x0689
            int r13 = r14.length
            java.util.ArrayList r12 = X.C17880vN.A0z(r13)
            java.util.HashSet r11 = new java.util.HashSet
            r11.<init>(r13)
            X.11P r0 = r1.A01
            long r3 = X.AnonymousClass11P.A01(r0)
            r18 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 / r18
            r10 = 0
        L_0x05e5:
            if (r10 >= r13) goto L_0x0613
            r9 = r14[r10]
            java.lang.String r15 = "jid"
            r0 = r25
            com.whatsapp.jid.Jid r0 = r9.A0F(r0, r15)
            if (r0 == 0) goto L_0x060a
            com.whatsapp.jid.DeviceJid r15 = X.AnonymousClass1E0.A00(r0)
            java.lang.String r0 = "t"
            long r16 = r9.A0D(r0, r3)
            long r16 = r16 * r18
            java.lang.Long r0 = java.lang.Long.valueOf(r16)
            X.C17880vN.A1K(r15, r0, r12)
            r11.add(r15)
        L_0x060a:
            int r10 = r10 + 1
            goto L_0x05e5
        L_0x060d:
            r22 = 0
            goto L_0x05b4
        L_0x0610:
            r11 = r14
            goto L_0x0584
        L_0x0613:
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r12, r11)
            java.lang.Object r3 = r0.first
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r4 = r0.second
            java.util.Set r4 = (java.util.Set) r4
            r0 = r21
            r2.A03 = r0
            r2.A04 = r4
            int r0 = r4.size()
            if (r0 <= r8) goto L_0x062e
            r2.A00 = r7
        L_0x062e:
            r2.A05(r7)
            X.37L r4 = r1.A04
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ConnectionThreadRequestsImpl/receipt-from-multiple-targets id="
            r2.append(r0)
            r0 = r20
            java.lang.String r0 = r0.A01
            r2.append(r0)
            java.lang.String r1 = "; remoteJid="
            r0 = r26
            X.C17900vP.A0W(r0, r1, r2)
            com.whatsapp.jid.Jid r0 = r5.A01
            com.whatsapp.jid.DeviceJid r0 = X.AnonymousClass1E0.A00(r0)
            r2.append(r0)
            java.lang.String r0 = "; status="
            r2.append(r0)
            r2.append(r6)
            java.lang.String r0 = "; offline="
            r2.append(r0)
            r0 = r23
            r2.append(r0)
            java.lang.String r0 = "; targetTimestampPairList="
            r2.append(r0)
            r2.append(r3)
            java.lang.String r1 = "; receiptPrivacyMode="
            r0 = r22
            X.C17900vP.A0Y(r0, r1, r2)
            X.3LB r1 = r4.A00
            X.AVa r0 = new X.AVa
            r9 = r0
            r10 = r26
            r11 = r20
            r12 = r22
            r13 = r5
            r14 = r3
            r15 = r6
            r9.<init>(r10, r11, r12, r13, r14, r15)
            X.C17890vO.A0o(r1, r0, r8)
            return
        L_0x0689:
            java.lang.String r0 = "ReceiptStanzaHandler/handleSuccessfulMessageReceipt empty participants"
            X.1UI r0 = X.AnonymousClass1UI.A01(r0)
            throw r0
        L_0x0690:
            boolean r3 = X.C29621ca.A07(r3, r9)
            if (r3 == 0) goto L_0x0714
            X.205 r3 = X.AnonymousClass205.A01(r11, r10, r12)
            X.205[] r9 = new X.AnonymousClass205[r8]
            r9[r13] = r3
        L_0x069e:
            java.lang.String r3 = "t"
            java.lang.String r0 = X.C29621ca.A02(r0, r3)
            r3 = 0
            long r3 = X.C20099A7c.A04(r0, r3)
            r10 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r10
            int r0 = r9.length
            if (r0 <= r8) goto L_0x06b3
            r2.A00 = r8
        L_0x06b3:
            r2.A05(r7)
            X.37L r11 = r1.A04
            java.lang.StringBuilder r10 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ConnectionThreadRequestsImpl/receipt-from-target keys="
            r10.append(r0)
            java.lang.String r0 = java.util.Arrays.toString(r9)
            r10.append(r0)
            java.lang.String r1 = "; remoteJid="
            r0 = r26
            X.C17900vP.A0W(r0, r1, r10)
            com.whatsapp.jid.Jid r7 = r5.A01
            X.1E0 r2 = com.whatsapp.jid.DeviceJid.Companion
            com.whatsapp.jid.DeviceJid r0 = r2.A02(r7)
            r10.append(r0)
            java.lang.String r0 = "; status="
            r10.append(r0)
            r10.append(r6)
            java.lang.String r0 = "; timestamp="
            r10.append(r0)
            r10.append(r3)
            java.lang.String r0 = "; offline="
            r10.append(r0)
            r0 = r23
            r10.append(r0)
            java.lang.String r1 = "; receiptPrivacyMode="
            r0 = r22
            X.C17900vP.A0Y(r0, r1, r10)
            X.3LB r0 = r11.A00
            com.whatsapp.jid.DeviceJid r11 = r2.A02(r7)
            X.AVb r10 = new X.AVb
            r12 = r26
            r13 = r22
            r14 = r5
            r15 = r9
            r16 = r6
            r17 = r3
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            X.C17890vO.A0o(r0, r10, r8)
            return
        L_0x0714:
            X.1ca[] r4 = r0.A02
            r15 = 0
            if (r4 == 0) goto L_0x0744
            int r3 = r4.length
            if (r3 != r8) goto L_0x0744
            r4 = r4[r13]
            java.lang.String r3 = "list"
            X.C29621ca.A04(r4, r3)
            X.1ca[] r9 = r4.A02
            if (r9 == 0) goto L_0x0742
            int r4 = r9.length
        L_0x0728:
            int r3 = r4 + 1
            java.lang.String[] r14 = new java.lang.String[r3]
            r14[r13] = r10
        L_0x072e:
            if (r15 >= r4) goto L_0x0748
            r10 = r9[r15]
            java.lang.String r3 = "item"
            X.C29621ca.A04(r10, r3)
            r3 = r24
            java.lang.String r3 = X.C29621ca.A02(r10, r3)
            int r15 = r15 + 1
            r14[r15] = r3
            goto L_0x072e
        L_0x0742:
            r4 = 0
            goto L_0x0728
        L_0x0744:
            java.lang.String[] r14 = new java.lang.String[r8]
            r14[r13] = r10
        L_0x0748:
            int r4 = r14.length
            X.205[] r9 = new X.AnonymousClass205[r4]
        L_0x074b:
            if (r13 >= r4) goto L_0x069e
            r3 = r14[r13]
            X.205 r3 = X.AnonymousClass205.A01(r11, r3, r12)
            r9[r13] = r3
            int r13 = r13 + 1
            goto L_0x074b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48482Mq.A04(X.1ca, java.lang.Integer, java.util.Map):void");
    }
}
