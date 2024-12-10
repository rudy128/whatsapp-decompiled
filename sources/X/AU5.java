package X;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.crypto.SecretKey;

public final class AU5 implements C1606989o {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C195639tf A02;
    public final /* synthetic */ BBM A03;
    public final /* synthetic */ AnonymousClass908 A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ Map A0A;
    public final /* synthetic */ Map A0B;
    public final /* synthetic */ SecretKey A0C;
    public final /* synthetic */ byte[] A0D;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: java.util.LinkedHashMap} */
    /* JADX WARNING: type inference failed for: r7v0 */
    /* JADX WARNING: type inference failed for: r7v3, types: [java.util.List, java.util.Collection] */
    /* JADX WARNING: type inference failed for: r7v20 */
    /* JADX WARNING: type inference failed for: r7v21 */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02c9, code lost:
        if (r10 == false) goto L_0x02b2;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0151  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BE5(X.C138506xC r21) {
        /*
            r20 = this;
            r1 = 0
            r8 = r21
            X.C18070vi.A0d(r8, r1)
            r0 = r20
            X.908 r13 = r0.A04
            X.00H r9 = r13.A0E
            X.A6h r5 = X.AnonymousClass8BR.A0V(r9)
            boolean r2 = r13.A02
            r4 = 1
            r2 = r2 ^ 1
            int r3 = r0.A01
            if (r2 == 0) goto L_0x0356
            java.lang.String r2 = "forward_network_1_end"
        L_0x001b:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            r5.A0B(r6, r2)
            int r2 = r8.A00
            r7 = 0
            if (r2 != 0) goto L_0x0048
            X.161 r5 = r8.A03
            java.lang.String r2 = "null cannot be cast to non-null type com.whatsapp.flows.data.exchange.FlowsDataExchangeGraphqlDataProcessor"
            X.C18070vi.A0z(r5, r2)
            X.8tK r5 = (X.C172378tK) r5
            java.lang.Object r10 = r5.A00
            java.lang.String r10 = (java.lang.String) r10
            if (r10 != 0) goto L_0x01c2
            java.util.LinkedHashMap r6 = A00(r13)
            X.BBM r2 = r0.A03
            r5 = 0
            java.util.Map r0 = r0.A0B
            java.lang.String r4 = "extensions-decryption-failed-data-is-null"
        L_0x0041:
            r3 = r13
            r7 = r0
            r8 = r1
            X.AnonymousClass908.A02(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0048:
            X.163 r8 = r8.A04
            java.lang.String r2 = "null cannot be cast to non-null type com.whatsapp.flows.data.exchange.FlowsDataExchangeGraphqlErrorProcessor"
            X.C18070vi.A0z(r8, r2)
            java.lang.Object r2 = r8.A00()
            java.lang.Number r2 = (java.lang.Number) r2
            if (r2 == 0) goto L_0x0067
            int r3 = r2.intValue()
            r2 = 2498098(0x261e32, float:3.500581E-39)
            if (r3 != r2) goto L_0x0067
            X.A6h r2 = X.AnonymousClass8BR.A0V(r9)
            r2.A0A(r6)
        L_0x0067:
            boolean r2 = r13.A02
            r6 = 10
            if (r2 == 0) goto L_0x00cb
            java.util.Map r2 = r8.A00
            if (r2 == 0) goto L_0x00cb
            java.util.Set r3 = r2.keySet()
            if (r3 == 0) goto L_0x00cb
            r2 = 2498061(0x261e0d, float:3.500529E-39)
            boolean r2 = X.C108965cb.A1b(r3, r2)
            if (r2 != r4) goto L_0x00cb
            java.util.List r3 = r13.A0H
            java.lang.String r2 = "extensions-business-decryption-error"
            r3.add(r2)
            java.util.List r10 = r13.A0G
            java.lang.StringBuilder r9 = X.AnonymousClass000.A10()
            java.util.Map r5 = r8.A01
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            java.lang.Object r2 = r5.get(r3)
            X.71m r2 = (X.C1404571m) r2
            if (r2 == 0) goto L_0x00c9
            java.lang.String r2 = r2.A06
        L_0x009d:
            r9.append(r2)
            r9.append(r6)
            java.lang.Object r2 = r5.get(r3)
            X.71m r2 = (X.C1404571m) r2
            if (r2 == 0) goto L_0x00ad
            java.lang.String r7 = r2.A05
        L_0x00ad:
            java.lang.String r2 = X.AnonymousClass000.A0y(r7, r9)
            r10.add(r2)
            long r5 = r13.A00
            r2 = 1
            long r5 = r5 + r2
            r13.A00 = r5
            r13.A02 = r1
            r13.A03 = r4
            java.util.Map r2 = r0.A0A
            X.9tf r1 = r0.A02
            X.BBM r0 = r0.A03
            X.AnonymousClass908.A00(r1, r0, r13, r2)
            return
        L_0x00c9:
            r2 = r7
            goto L_0x009d
        L_0x00cb:
            java.util.Map r2 = r8.A00
            if (r2 == 0) goto L_0x018c
            java.util.Set r3 = r2.keySet()
            if (r3 == 0) goto L_0x018c
            r2 = 2498058(0x261e0a, float:3.500525E-39)
            boolean r2 = X.C108965cb.A1b(r3, r2)
            if (r2 != r4) goto L_0x018c
            X.118 r3 = r13.A06
            r2 = 2131890449(0x7f121111, float:1.941559E38)
            java.lang.String r9 = r3.A01(r2)
            java.lang.String r5 = "extensions-timeout-error"
        L_0x00e9:
            X.C18070vi.A0b(r9)
            X.0ve r3 = r13.A07
            r2 = 3192(0xc78, float:4.473E-42)
            java.lang.String r2 = r3.A0I(r2)
            if (r2 == 0) goto L_0x00fa
            java.util.List r7 = X.C108985cd.A0s(r2, r4)
        L_0x00fa:
            java.util.Map r10 = r8.A00
            if (r10 == 0) goto L_0x010a
            if (r7 == 0) goto L_0x010a
            boolean r2 = r7 instanceof java.util.Collection
            if (r2 == 0) goto L_0x016b
            boolean r2 = r7.isEmpty()
            if (r2 == 0) goto L_0x016b
        L_0x010a:
            r10 = 0
        L_0x010b:
            java.lang.String r2 = r13.A01
            if (r2 == 0) goto L_0x0151
            int r2 = r2.length()
            if (r2 == 0) goto L_0x0151
            X.00H r2 = r13.A0A
            r2.get()
            java.lang.String r2 = r13.A01
            java.util.LinkedHashMap r11 = X.C20052A4y.A00(r9, r2)
        L_0x0120:
            X.BBM r3 = r0.A03
            java.lang.StringBuilder r9 = X.AnonymousClass000.A10()
            java.util.Map r7 = r8.A01
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            java.lang.Object r2 = r7.get(r4)
            X.71m r2 = (X.C1404571m) r2
            if (r2 == 0) goto L_0x014f
            java.lang.String r2 = r2.A06
        L_0x0136:
            r9.append(r2)
            r9.append(r6)
            java.lang.Object r2 = r7.get(r4)
            X.71m r2 = (X.C1404571m) r2
            if (r2 == 0) goto L_0x014d
            java.lang.String r2 = r2.A05
        L_0x0146:
            java.lang.String r10 = X.AnonymousClass000.A0y(r2, r9)
            java.util.Map r6 = r0.A0B
            goto L_0x01bb
        L_0x014d:
            r2 = 0
            goto L_0x0146
        L_0x014f:
            r2 = 0
            goto L_0x0136
        L_0x0151:
            r2 = 2
            X.1D6[] r7 = new X.AnonymousClass1D6[r2]
            java.lang.String r3 = "error"
            X.A1m r2 = X.C19976A1m.A00(r9)
            X.AnonymousClass1D6.A03(r3, r2, r7, r1)
            java.lang.String r3 = "disable_nfm_cta"
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r10)
            X.AnonymousClass1D6.A03(r3, r2, r7, r4)
            java.util.LinkedHashMap r11 = X.AnonymousClass1D7.A0B(r7)
            goto L_0x0120
        L_0x016b:
            java.util.Iterator r7 = r7.iterator()
        L_0x016f:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L_0x010a
            java.lang.String r2 = X.C17880vN.A0v(r7)
            java.util.Set r3 = r10.keySet()
            int r2 = java.lang.Integer.parseInt(r2)
            boolean r2 = X.C108965cb.A1b(r3, r2)
            if (r2 == 0) goto L_0x016f
            r10 = 1
            r2 = 0
            r13.A01 = r2
            goto L_0x010b
        L_0x018c:
            X.118 r3 = r13.A06
            r2 = 2131890448(0x7f121110, float:1.9415588E38)
            java.lang.String r9 = r3.A01(r2)
            java.lang.String r5 = "extensions-business-endpoint-response-error"
            goto L_0x00e9
        L_0x0199:
            r10 = 0
            r13.A01 = r10
            X.118 r7 = r13.A06
            if (r12 == 0) goto L_0x0340
            r2 = 2131890444(0x7f12110c, float:1.941558E38)
            java.lang.Object[] r0 = new java.lang.Object[r4]
            if (r8 != 0) goto L_0x01a9
            java.lang.String r8 = ""
        L_0x01a9:
            java.lang.String r2 = X.AnonymousClass8BS.A0f(r7, r8, r0, r1, r2)
        L_0x01ad:
            X.C18070vi.A0b(r2)
            X.00H r0 = r13.A0A
            r0.get()
            java.lang.String r0 = r13.A01
            java.util.LinkedHashMap r11 = X.C20052A4y.A00(r2, r0)
        L_0x01bb:
            r7 = r3
            r8 = r13
            r9 = r5
            r12 = r6
            r13 = r1
            goto L_0x02c5
        L_0x01c2:
            X.00H r2 = r13.A0C
            java.lang.Object r8 = r2.get()
            X.9ng r8 = (X.C192049ng) r8
            javax.crypto.SecretKey r3 = r0.A0C
            byte[] r2 = r0.A0D
            java.lang.String r8 = r8.A00(r10, r3, r2)
            X.A6h r3 = X.AnonymousClass8BR.A0V(r9)
            boolean r2 = r13.A02
            r2 = r2 ^ 1
            if (r2 == 0) goto L_0x02cf
            java.lang.String r2 = "decryption_1_end"
        L_0x01de:
            r3.A0B(r6, r2)
            if (r8 != 0) goto L_0x01f6
            java.util.Map r3 = r0.A0A
            X.9tf r2 = r0.A02
            java.util.Map r2 = r2.A05
            X.BBM r12 = r0.A03
            java.lang.String r14 = "response-decryption-error"
            java.lang.String r15 = "We failed to decrypt your payload. Please check your encryption/decryption logic."
            r16 = r3
            r17 = r2
            X.AnonymousClass908.A01(r12, r13, r14, r15, r16, r17)
        L_0x01f6:
            int r2 = r5.A00
            if (r2 != 0) goto L_0x02d3
            java.util.Map r14 = X.AnonymousClass9RE.A00(r8)
            java.lang.String r15 = r0.A08
            if (r15 == 0) goto L_0x0349
            java.lang.String r6 = r0.A09
            if (r6 == 0) goto L_0x0349
            if (r14 == 0) goto L_0x0349
            X.10I r3 = r13.A09
            java.lang.String r5 = r0.A07
            java.lang.String r2 = r0.A05
            X.AjA r12 = new X.AjA
            r18 = r2
            r19 = r4
            r16 = r6
            r17 = r5
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            r3.CGF(r12)
            java.lang.String r2 = "screen"
            java.lang.String r8 = X.AnonymousClass8BW.A0f(r2, r14)
            java.util.Map r9 = r0.A0A
            java.lang.String r2 = "routing_model"
            java.util.Map r19 = X.AnonymousClass8BW.A0v(r2, r9)
            java.lang.String r2 = "entry_screens"
            java.lang.Object r10 = r9.get(r2)
            boolean r2 = r10 instanceof java.util.List
            if (r2 == 0) goto L_0x02cc
            java.util.List r10 = (java.util.List) r10
        L_0x0238:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>(r14)
            java.lang.String r6 = r0.A06
            if (r6 == 0) goto L_0x0246
            java.lang.String r3 = "prev_screen_name"
            r2.put(r3, r6)
        L_0x0246:
            X.00H r3 = r13.A0F
            java.lang.Object r3 = r3.get()
            X.9jC r3 = (X.C189409jC) r3
            r14 = r3
            r15 = r6
            r16 = r8
            r18 = r10
            java.lang.Integer r5 = r14.A00(r15, r16, r17, r18, r19)
            java.lang.Integer r3 = X.AnonymousClass00R.A00
            boolean r10 = X.AnonymousClass000.A1Z(r5, r3)
            java.util.Map r6 = r0.A0B
            java.lang.String r3 = "is_draft"
            java.lang.Object r3 = r6.get(r3)
            boolean r12 = X.C18070vi.A19(r3, r4)
            X.0ve r7 = r13.A07
            r5 = 4425(0x1149, float:6.201E-42)
            X.0vf r3 = X.C18040vf.A02
            boolean r3 = X.C18020vd.A05(r3, r7, r5)
            java.lang.String r5 = "extensions-invalid-screen-transition-error"
            if (r3 == 0) goto L_0x02c9
            if (r10 != 0) goto L_0x02bc
            X.9tf r3 = r0.A02
            java.util.Map r11 = r3.A05
            X.BBM r3 = r0.A03
            java.lang.StringBuilder r10 = X.AnonymousClass000.A10()
            java.lang.String r7 = "Screen transition to "
            r10.append(r7)
            r10.append(r8)
            java.lang.String r7 = " is invalid. Please check your routing model."
            java.lang.String r17 = X.AnonymousClass000.A0y(r7, r10)
            java.lang.String r16 = "invalid-screen-transition"
            r14 = r3
            r15 = r13
            r18 = r9
            r19 = r11
            X.AnonymousClass908.A01(r14, r15, r16, r17, r18, r19)
            if (r12 != 0) goto L_0x0199
            int r9 = r0.A00
            r7 = 120(0x78, float:1.68E-43)
            if (r9 >= r7) goto L_0x0199
            X.00H r1 = r13.A0A
            java.lang.Object r3 = r1.get()
            X.A4y r3 = (X.C20052A4y) r3
            java.lang.String r1 = "Business has published flows with invalid routing model."
            r3.A03(r5, r1, r6)
        L_0x02b2:
            java.util.List r1 = r13.A0H
            r1.add(r5)
            java.util.List r1 = r13.A0G
            r1.add(r5)
        L_0x02bc:
            X.BBM r0 = r0.A03
            r9 = 0
            r7 = r0
            r8 = r13
            r10 = r9
            r11 = r2
            r12 = r6
            r13 = r4
        L_0x02c5:
            X.AnonymousClass908.A02(r7, r8, r9, r10, r11, r12, r13)
            return
        L_0x02c9:
            if (r10 != 0) goto L_0x02bc
            goto L_0x02b2
        L_0x02cc:
            r10 = r7
            goto L_0x0238
        L_0x02cf:
            java.lang.String r2 = "decryption_end"
            goto L_0x01de
        L_0x02d3:
            X.00H r2 = r13.A0D
            r2.get()
            java.lang.String r9 = X.A25.A00(r8)
            java.lang.String r5 = "extensions-invalid-flow-token-error"
            if (r9 != 0) goto L_0x02ea
            java.util.List r2 = r13.A0H
            r2.add(r5)
            java.util.List r2 = r13.A0G
            r2.add(r5)
        L_0x02ea:
            r2 = 0
            r13.A01 = r2
            X.00H r2 = r13.A0A
            java.lang.Object r15 = r2.get()
            X.A4y r15 = (X.C20052A4y) r15
            java.util.Map r6 = r0.A0B
            java.lang.String r2 = "business_jid"
            java.lang.String r16 = X.C17880vN.A0s(r2, r6)
            java.lang.String r2 = "message_id"
            java.lang.String r17 = X.C17880vN.A0s(r2, r6)
            java.lang.String r2 = "action_name"
            java.lang.String r4 = X.AnonymousClass8BW.A0g(r2, r6)
            r3 = 2
            X.C18070vi.A0d(r4, r3)
            if (r17 == 0) goto L_0x031d
            X.10I r2 = r15.A01
            X.Aiw r14 = new X.Aiw
            r18 = r4
            r19 = r3
            r14.<init>(r15, r16, r17, r18, r19)
            r2.CGF(r14)
        L_0x031d:
            java.lang.String r8 = "error"
            if (r9 != 0) goto L_0x033e
            X.118 r3 = r13.A06
            r2 = 2131890453(0x7f121115, float:1.9415598E38)
            java.lang.String r7 = X.C18070vi.A0G(r3, r2)
        L_0x032a:
            r10 = 0
            r2 = -1
            X.A1m r4 = new X.A1m
            r4.<init>(r7, r10, r2)
            java.util.Map r11 = X.C108975cc.A0h(r8, r4)
            X.BBM r3 = r0.A03
            if (r9 != 0) goto L_0x01bb
            java.lang.String r5 = "extensions-decryption-failed-exception"
            goto L_0x01bb
        L_0x033e:
            r7 = r9
            goto L_0x032a
        L_0x0340:
            r0 = 2131890448(0x7f121110, float:1.9415588E38)
            java.lang.String r2 = r7.A01(r0)
            goto L_0x01ad
        L_0x0349:
            java.util.LinkedHashMap r6 = A00(r13)
            X.BBM r2 = r0.A03
            r5 = 0
            java.util.Map r0 = r0.A0B
            java.lang.String r4 = "extensions-decryption-failed-exception"
            goto L_0x0041
        L_0x0356:
            java.lang.String r2 = "forward_network_end"
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AU5.BE5(X.6xC):void");
    }

    public void BrB(IOException iOException) {
        String str;
        C18070vi.A0d(iOException, 0);
        AnonymousClass908 r3 = this.A04;
        C20081A6h A0V = AnonymousClass8BR.A0V(r3.A0E);
        boolean z = !r3.A02;
        int i = this.A01;
        if (z) {
            str = "forward_network_1_end";
        } else {
            str = "forward_network_end";
        }
        C20081A6h.A02(A0V, str, i);
        AnonymousClass908.A02(this.A03, r3, "extensions-data-exchange-graphql-response-error", iOException.getMessage(), A00(r3), this.A0B, false);
    }

    public void Bsw(Exception exc) {
        String str;
        C18070vi.A0d(exc, 0);
        AnonymousClass908 r3 = this.A04;
        C20081A6h A0V = AnonymousClass8BR.A0V(r3.A0E);
        boolean z = !r3.A02;
        int i = this.A01;
        if (z) {
            str = "forward_network_1_end";
        } else {
            str = "forward_network_end";
        }
        C20081A6h.A02(A0V, str, i);
        LinkedHashMap A002 = A00(r3);
        BBM bbm = this.A03;
        String message = exc.getMessage();
        if (message == null) {
            message = "extensions-data-exchange-graphql-response-error";
        }
        AnonymousClass908.A02(bbm, r3, message, exc.getMessage(), A002, this.A0B, false);
    }

    public AU5(C195639tf r1, BBM bbm, AnonymousClass908 r3, String str, String str2, String str3, String str4, String str5, Map map, Map map2, SecretKey secretKey, byte[] bArr, int i, int i2) {
        this.A04 = r3;
        this.A01 = i;
        this.A03 = bbm;
        this.A0B = map;
        this.A0C = secretKey;
        this.A0D = bArr;
        this.A0A = map2;
        this.A02 = r1;
        this.A08 = str;
        this.A09 = str2;
        this.A06 = str3;
        this.A07 = str4;
        this.A00 = i2;
        this.A05 = str5;
    }

    public static LinkedHashMap A00(AnonymousClass908 r2) {
        AnonymousClass00H r0 = r2.A0A;
        r0.get();
        return C20052A4y.A00(((C20052A4y) r0.get()).A02(), r2.A01);
    }
}
