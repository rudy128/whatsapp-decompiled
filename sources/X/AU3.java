package X;

import java.io.IOException;

public class AU3 implements C1606989o {
    public final /* synthetic */ C19995A2i A00;
    public final /* synthetic */ AnonymousClass705 A01;
    public final /* synthetic */ C187029f9 A02;
    public final /* synthetic */ ADL A03;
    public final /* synthetic */ BCH A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ boolean A0A;

    public AU3(C19995A2i a2i, AnonymousClass705 r2, C187029f9 r3, ADL adl, BCH bch, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        this.A00 = a2i;
        this.A07 = str;
        this.A03 = adl;
        this.A05 = str2;
        this.A06 = str3;
        this.A09 = z;
        this.A0A = z2;
        this.A02 = r3;
        this.A04 = bch;
        this.A01 = r2;
        this.A08 = str4;
    }

    /* JADX WARNING: type inference failed for: r0v44, types: [java.lang.Object, X.9NR] */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00eb, code lost:
        r2 = r3.A06;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BE5(X.C138506xC r22) {
        /*
            r21 = this;
            r1 = r22
            X.163 r4 = r1.A04
            X.161 r8 = r1.A03
            int r0 = r1.A00
            r11 = r21
            if (r0 != 0) goto L_0x009b
            X.A2i r12 = r11.A00
            java.lang.String r4 = r11.A07
            java.lang.Object r0 = r8.A00
            java.lang.String r0 = (java.lang.String) r0
            int r3 = r0.length()
            long r0 = r1.A02
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.util.HashMap r2 = X.C17880vN.A11()
            if (r0 == 0) goto L_0x002d
            java.lang.String r1 = "EVENT_PARAM_COMPRESSED_SIZE"
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2.put(r1, r0)
        L_0x002d:
            java.lang.String r1 = "EVENT_PARAM_UNCOMPRESSED_SIZE"
            java.lang.String r0 = java.lang.String.valueOf(r3)
            r2.put(r1, r0)
            X.A0a r1 = r12.A05
            java.lang.String r0 = "PAYLOAD_SIZE"
            r1.A02(r4, r0, r2)
            X.ADL r14 = r11.A03
            if (r14 == 0) goto L_0x0085
            java.lang.String r10 = r14.A02
            java.lang.String r0 = "ASYNC_COMPONENT"
            if (r10 == r0) goto L_0x0085
            X.00H r0 = r12.A08     // Catch:{ Exception -> 0x007f }
            java.lang.Object r9 = r0.get()     // Catch:{ Exception -> 0x007f }
            X.A2o r9 = (X.C20000A2o) r9     // Catch:{ Exception -> 0x007f }
            X.00H r0 = r12.A09     // Catch:{ Exception -> 0x007f }
            java.lang.Object r3 = r0.get()     // Catch:{ Exception -> 0x007f }
            X.9xG r3 = (X.C197789xG) r3     // Catch:{ Exception -> 0x007f }
            java.lang.String r2 = r11.A05     // Catch:{ Exception -> 0x007f }
            java.lang.String r1 = r11.A06     // Catch:{ Exception -> 0x007f }
            r0 = 0
            X.C18070vi.A0d(r2, r0)     // Catch:{ Exception -> 0x007f }
            X.9By r7 = new X.9By     // Catch:{ Exception -> 0x007f }
            r7.<init>(r3, r2, r1)     // Catch:{ Exception -> 0x007f }
            java.lang.Object r6 = r8.A00     // Catch:{ Exception -> 0x007f }
            long r3 = r14.A00     // Catch:{ Exception -> 0x007f }
            boolean r5 = r14.A03     // Catch:{ Exception -> 0x007f }
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x007f }
            X.9NR r0 = new X.9NR     // Catch:{ Exception -> 0x007f }
            r0.<init>()     // Catch:{ Exception -> 0x007f }
            r0.A02 = r6     // Catch:{ Exception -> 0x007f }
            r0.A01 = r3     // Catch:{ Exception -> 0x007f }
            r0.A00 = r1     // Catch:{ Exception -> 0x007f }
            r0.A03 = r5     // Catch:{ Exception -> 0x007f }
            r9.A03(r7, r0, r10)     // Catch:{ Exception -> 0x007f }
            goto L_0x0085
        L_0x007f:
            r1 = move-exception
            java.lang.String r0 = "Failed to save the bk-cache"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0085:
            java.lang.Object r2 = r8.A00
            java.lang.String r2 = (java.lang.String) r2
            boolean r1 = r11.A09
            boolean r0 = r11.A0A
            if (r0 == 0) goto L_0x009a
            X.9f9 r13 = r11.A02
            X.BCH r15 = r11.A04
            r16 = r2
            r17 = r1
            r12.A01(r13, r14, r15, r16, r17)
        L_0x009a:
            return
        L_0x009b:
            X.A2i r3 = r11.A00
            X.9f9 r13 = r11.A02
            java.lang.String r1 = r11.A05
            X.705 r12 = r11.A01
            java.lang.String r6 = r11.A06
            boolean r5 = r11.A09
            X.ADL r14 = r11.A03
            java.lang.String r2 = r11.A08
            boolean r0 = r11.A0A
            X.BCH r15 = r11.A04
            X.Ajd r10 = new X.Ajd
            r16 = r1
            r17 = r6
            r18 = r2
            r19 = r5
            r20 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.String r5 = r11.A07
            r6 = 4
            if (r4 == 0) goto L_0x0184
            java.util.Map r0 = r4.A00
            if (r0 == 0) goto L_0x0184
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0184
            java.util.Map r0 = r4.A00
            if (r0 == 0) goto L_0x014e
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x014e
            java.util.Map r0 = r4.A00
            java.lang.Object r7 = r4.A02(r13, r0)
        L_0x00dd:
            java.lang.String r7 = (java.lang.String) r7
            X.9y5 r0 = r3.A04
            X.9aO r0 = X.C198279y5.A00(r0, r1)
            X.9aN r0 = r0.A01
            X.1lW r0 = r0.A01
            if (r0 == 0) goto L_0x00fa
            X.1lS r2 = r3.A06
            X.732 r1 = r2.A00(r0)
            if (r1 == 0) goto L_0x00fa
            int r0 = r13.A00
            if (r0 == r6) goto L_0x0100
            switch(r0) {
                case 8: goto L_0x0114;
                case 9: goto L_0x0129;
                case 10: goto L_0x013e;
                default: goto L_0x00fa;
            }
        L_0x00fa:
            if (r7 == 0) goto L_0x0150
            r3.A02(r13, r15, r7)
            return
        L_0x0100:
            java.lang.Exception r0 = r13.A02
            if (r0 == 0) goto L_0x0114
            boolean r0 = r0 instanceof org.json.JSONException
            if (r0 == 0) goto L_0x0114
            boolean r0 = r12.A04()
            if (r0 == 0) goto L_0x0114
            X.10I r0 = r3.A07
            r0.CGF(r10)
            return
        L_0x0114:
            boolean r0 = r12.A04()
            if (r0 == 0) goto L_0x0129
            r9 = 2
            X.31i r0 = new X.31i
            r4 = r0
            r5 = r10
            r6 = r13
            r7 = r15
            r8 = r3
            r4.<init>(r5, r6, r7, r8, r9)
            r2.A02(r1, r0, r12)
            return
        L_0x0129:
            boolean r0 = r12.A04()
            if (r0 == 0) goto L_0x013e
            r9 = 3
            X.31i r0 = new X.31i
            r4 = r0
            r5 = r10
            r6 = r13
            r7 = r15
            r8 = r3
            r4.<init>(r5, r6, r7, r8, r9)
            r2.A01(r1, r0, r12)
            return
        L_0x013e:
            java.lang.Long r0 = r12.A01()
            if (r0 == 0) goto L_0x00fa
            X.10I r2 = r3.A07
            long r0 = r0.longValue()
            r2.CGv(r10, r0)
            return
        L_0x014e:
            r7 = 0
            goto L_0x00dd
        L_0x0150:
            java.util.Map r0 = r4.A00
            java.util.Iterator r0 = X.AnonymousClass000.A15(r0)
            java.lang.Object r4 = X.C17890vO.A0P(r0)
            X.71m r4 = (X.C1404571m) r4
            r13.A00 = r6
            X.6Sa r0 = new X.6Sa
            r0.<init>(r4)
            r13.A02 = r0
            int r1 = r4.A01
            r0 = 2498098(0x261e32, float:3.500581E-39)
            if (r1 != r0) goto L_0x0174
            X.A0a r2 = r3.A05
            java.lang.String r1 = "DROP_QPL_LOGGING_MARKER"
            r0 = 0
            r2.A02(r5, r1, r0)
        L_0x0174:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Something went wrong :"
            r1.append(r0)
            java.lang.String r0 = r4.A05
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            goto L_0x0188
        L_0x0184:
            r13.A00 = r6
            java.lang.String r0 = "Something went wrong"
        L_0x0188:
            r3.A02(r13, r15, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AU3.BE5(X.6xC):void");
    }

    public void BrB(IOException iOException) {
        C187029f9 r3 = this.A02;
        r3.A02 = iOException;
        r3.A00 = 7;
        this.A00.A02(r3, this.A04, iOException.getLocalizedMessage());
    }

    public void Bsw(Exception exc) {
        C187029f9 r3 = this.A02;
        r3.A02 = exc;
        r3.A00 = 4;
        this.A00.A02(r3, this.A04, exc.getLocalizedMessage());
    }
}
