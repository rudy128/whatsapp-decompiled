package X;

import android.os.Handler;
import java.util.Map;
import java.util.Set;

/* renamed from: X.CpP  reason: case insensitive filesystem */
public final class C25957CpP {
    public static final Handler A07 = C17890vO.A0D();
    public final CZ6 A00;
    public final C26962DNk A01;
    public final C26012CqT A02;
    public final Object A03 = C17880vN.A0p();
    public final Map A04 = C17880vN.A13();
    public final Map A05 = C17880vN.A13();
    public final Set A06 = C17880vN.A14();

    public C25957CpP(CZ6 cz6, C26962DNk dNk, C26012CqT cqT) {
        C18070vi.A0d(cz6, 3);
        this.A01 = dNk;
        this.A02 = cqT;
        this.A00 = cz6;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:72:0x02d5, code lost:
        if (r1 == null) goto L_0x02d7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List A00(X.C25957CpP r35, X.C23736Boh r36, X.CO8 r37, X.C25233CbU r38, java.lang.Integer r39) {
        /*
            r24 = r39
            r6 = r37
            boolean r0 = r6 instanceof X.C23725BoW
            java.lang.String r3 = "BloksComponentQueryManager"
            r4 = r36
            r7 = r38
            if (r0 != 0) goto L_0x003e
            boolean r0 = r6 instanceof X.C23726BoX
            if (r0 == 0) goto L_0x037b
            java.lang.Integer r24 = X.AnonymousClass00R.A0C
            java.lang.String r1 = "appId"
            X.E8A r0 = r7.A00
            java.lang.Object r2 = X.CBt.A00(r4, r0, r1)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L_0x0022
            java.lang.String r2 = "unknown"
        L_0x0022:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Network request failed for component query with app id "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ". To find the server-side error trace, open Opes and filter to buenopaths containing that app id."
            java.lang.String r2 = X.AnonymousClass000.A0y(r0, r1)
            r0 = r6
            X.BoX r0 = (X.C23726BoX) r0
            java.lang.Throwable r1 = r0.A00
            X.DOZ r0 = r4.A00
            X.C25913CoX.A00(r0, r3, r2, r1)
        L_0x003e:
            java.util.Set r0 = r7.A06
            if (r0 != 0) goto L_0x0044
            X.1Om r0 = X.C25511Om.A00
        L_0x0044:
            java.util.Iterator r1 = r0.iterator()
        L_0x0048:
            boolean r0 = r1.hasNext()
            r5 = r35
            if (r0 == 0) goto L_0x007f
            java.lang.Object r2 = r1.next()
            java.util.Set r0 = r5.A06
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L_0x0048
            java.util.Map r1 = r5.A05
            java.lang.Object r0 = r1.get(r2)
            if (r0 != 0) goto L_0x006b
            java.util.LinkedHashSet r0 = X.C17880vN.A14()
            r1.put(r2, r0)
        L_0x006b:
            java.util.Set r0 = (java.util.Set) r0
            java.lang.String r2 = r7.A04
            r0.add(r2)
            java.util.Map r1 = r5.A04
            X.CaE r0 = new X.CaE
            r0.<init>(r6, r7)
            r1.put(r2, r0)
            X.0wS r0 = X.C18460wS.A00
            return r0
        L_0x007f:
            java.util.Set r0 = r5.A06
            java.lang.String r2 = r7.A04
            r0.add(r2)
            java.util.Map r0 = r5.A04
            r39 = r0
            r0.remove(r2)
            r0 = r24
            java.util.LinkedHashMap r23 = X.CC4.A00(r6, r0)
            boolean r0 = r6 instanceof X.C23723BoU
            r8 = 0
            if (r0 != 0) goto L_0x0106
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "query_info_"
            java.lang.String r6 = X.AnonymousClass001.A1H(r0, r2, r1)
            X.Bno r1 = new X.Bno
            r0 = r23
            r1.<init>(r6, r0)
            X.CaF r0 = new X.CaF
            r0.<init>(r1, r8)
            java.util.List r0 = X.C18070vi.A0M(r0)
        L_0x00b2:
            java.util.ArrayList r8 = X.C29431cG.A0m(r0)
            java.util.Map r7 = r5.A05
            java.lang.Object r0 = r7.get(r2)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            if (r0 == 0) goto L_0x0103
            java.util.Set r0 = X.C29431cG.A12(r0)
        L_0x00c4:
            java.util.Iterator r9 = r0.iterator()
        L_0x00c8:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0361
            java.lang.String r6 = X.C17880vN.A0v(r9)
            r0 = r39
            java.lang.Object r0 = r0.get(r6)
            X.CaE r0 = (X.C25163CaE) r0
            if (r0 != 0) goto L_0x00f2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Expected to find pending response for "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = " but found none."
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            X.C25913CoX.A01(r3, r0)
            goto L_0x00c8
        L_0x00f2:
            X.CbU r6 = r0.A01
            X.CO8 r1 = r0.A00
            r0 = r24
            java.util.List r0 = A00(r5, r4, r1, r6, r0)
            r8.addAll(r0)
            r7.remove(r2)
            goto L_0x00c8
        L_0x0103:
            X.1Om r0 = X.C25511Om.A00
            goto L_0x00c4
        L_0x0106:
            java.util.Map r0 = r7.A05
            if (r0 == 0) goto L_0x015f
            java.util.Map r10 = X.AnonymousClass1D7.A0F(r0)
        L_0x010e:
            X.BoU r6 = (X.C23723BoU) r6
            X.Cad r0 = r6.A00
            java.util.Map r9 = r0.A01
            java.util.HashMap r1 = X.C17880vN.A11()
            java.util.Iterator r12 = X.AnonymousClass000.A15(r10)
        L_0x011c:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0164
            java.util.Map$Entry r0 = X.AnonymousClass000.A16(r12)
            java.lang.String r11 = X.C17880vN.A0x(r0)
            java.lang.Object r10 = r0.getValue()
            X.Caf r10 = (X.C25189Caf) r10
            java.lang.Object r0 = r9.get(r11)
            if (r0 != 0) goto L_0x015b
            java.lang.StringBuilder r6 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Missing "
            r6.append(r0)
            r6.append(r11)
            java.lang.String r0 = " parseResult for target "
            r6.append(r0)
            int r0 = r10.A00
            r6.append(r0)
            r0 = 58
            r6.append(r0)
            java.util.List r0 = r10.A02
            java.lang.String r0 = X.C17890vO.A0V(r0, r6)
            X.C25913CoX.A01(r3, r0)
            goto L_0x011c
        L_0x015b:
            r1.put(r10, r0)
            goto L_0x011c
        L_0x015f:
            X.1CQ r10 = X.AnonymousClass1D7.A0I()
            goto L_0x010e
        L_0x0164:
            boolean r0 = r7.A08
            if (r0 == 0) goto L_0x0358
            java.util.ArrayList r9 = X.AnonymousClass000.A13()
            java.util.concurrent.atomic.AtomicInteger r0 = X.CFq.A00
            int r0 = r0.incrementAndGet()
            X.C17890vO.A1D(r9, r0)
        L_0x0175:
            int r0 = r1.size()
            java.util.ArrayList r22 = X.C17880vN.A0z(r0)
            java.util.Iterator r21 = X.C17890vO.A0i(r1)
        L_0x0181:
            boolean r0 = r21.hasNext()
            if (r0 == 0) goto L_0x035b
            java.util.Map$Entry r0 = X.AnonymousClass000.A16(r21)
            java.lang.Object r11 = r0.getValue()
            X.CvV r11 = (X.C26235CvV) r11
            java.lang.Object r10 = r0.getKey()
            X.Caf r10 = (X.C25189Caf) r10
            int r0 = r10.A00
            r38 = r0
            X.DFL r6 = r11.A01
            X.C18070vi.A0b(r6)
            r1 = 1
            X.BoM r0 = new X.BoM
            r0.<init>(r9, r6, r1)
            X.DFL r6 = X.CC3.A00(r8, r0, r6)
            X.Cip r1 = r11.A00
            java.util.List r0 = r1.A05
            r37 = r0
            java.util.Map r0 = r1.A06
            r36 = r0
            java.util.List r0 = r1.A02
            r35 = r0
            java.util.List r0 = r1.A01
            X.C18070vi.A0W(r0)
            java.util.ArrayList r20 = X.C29351c6.A0D(r0)
            java.util.Iterator r19 = r0.iterator()
        L_0x01c5:
            boolean r0 = r19.hasNext()
            if (r0 == 0) goto L_0x026c
            java.lang.Object r12 = r19.next()
            X.CbU r12 = (X.C25233CbU) r12
            X.C18070vi.A0b(r6)
            X.C18070vi.A0b(r12)
            r0 = 0
            X.C18070vi.A0d(r6, r0)
            r0 = 1
            X.C18070vi.A0d(r12, r0)
            java.util.Map r0 = r12.A05
            if (r0 == 0) goto L_0x0232
            java.util.LinkedHashMap r11 = X.C108995ce.A0b(r0)
            java.util.Iterator r18 = X.AnonymousClass000.A15(r0)
        L_0x01eb:
            boolean r0 = r18.hasNext()
            if (r0 == 0) goto L_0x0233
            java.util.Map$Entry r0 = X.AnonymousClass000.A16(r18)
            java.lang.Object r17 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            X.Caf r0 = (X.C25189Caf) r0
            java.lang.String r0 = r0.A01
            X.DNn r13 = new X.DNn
            r13.<init>(r0)
            r0 = 2
            X.DFL r13 = X.DNW.A00(r6, r13, r0)
            if (r13 == 0) goto L_0x0366
            java.lang.String r16 = r13.A0C()
            X.C18070vi.A0b(r16)
            int r0 = r13.A04
            r25 = r0
            java.util.List r0 = r13.A0A
            if (r0 == 0) goto L_0x022f
            java.util.List r15 = X.C29431cG.A0t(r0)
        L_0x0220:
            X.Caf r14 = new X.Caf
            r13 = r25
            r0 = r16
            r14.<init>(r15, r13, r0)
            r0 = r17
            r11.put(r0, r14)
            goto L_0x01eb
        L_0x022f:
            X.0wS r15 = X.C18460wS.A00
            goto L_0x0220
        L_0x0232:
            r11 = 0
        L_0x0233:
            java.lang.String r0 = r12.A04
            r30 = r0
            X.E8A r0 = r12.A00
            r18 = r0
            X.E8A r0 = r12.A03
            r17 = r0
            X.E8A r0 = r12.A02
            r16 = r0
            java.util.Set r0 = r12.A06
            r15 = r0
            X.E8A r0 = r12.A01
            r14 = r0
            boolean r0 = r12.A07
            r13 = r0
            boolean r0 = r12.A08
            X.CbU r12 = new X.CbU
            r25 = r12
            r26 = r18
            r27 = r17
            r28 = r16
            r29 = r14
            r31 = r11
            r32 = r15
            r33 = r13
            r34 = r0
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r0 = r20
            r0.add(r12)
            goto L_0x01c5
        L_0x026c:
            java.util.List r0 = r1.A03
            r14 = r0
            X.CZq r13 = r1.A00
            java.util.Map r12 = r1.A07
            java.util.List r0 = r1.A04
            X.Cip r11 = new X.Cip
            r25 = r11
            r26 = r13
            r27 = r37
            r28 = r35
            r29 = r20
            r30 = r14
            r31 = r0
            r32 = r36
            r33 = r12
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33)
            r0 = r38
            long r0 = (long) r0
            X.DNm r13 = new X.DNm
            r13.<init>(r0)
            java.util.List r12 = X.C18070vi.A0M(r6)
            X.DNl r1 = new X.DNl
            r1.<init>(r13)
            X.Bod r0 = new X.Bod
            r0.<init>(r13, r12)
            android.util.Pair r0 = X.C108945cZ.A0N(r1, r0)
            java.lang.Object r12 = r0.first
            X.C18070vi.A0W(r12)
            X.E6I r12 = (X.E6I) r12
            java.lang.Object r1 = r0.second
            X.C18070vi.A0W(r1)
            X.C5s r1 = (X.C24477C5s) r1
            X.CvV r0 = new X.CvV
            r0.<init>(r11, r6, r8)
            X.Cae r11 = new X.Cae
            r11.<init>(r0, r12, r1)
            X.E8A r6 = r7.A02
            if (r6 == 0) goto L_0x02d7
            X.9zJ r1 = X.C199029zJ.A01
            java.util.List r0 = r10.A02
            X.Boh r0 = X.C23736Boh.A02(r4, r0)
            java.lang.Object r1 = X.CCJ.A00(r1, r6, r0)
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>"
            X.C18070vi.A0z(r1, r0)
            java.util.Map r1 = (java.util.Map) r1
            if (r1 != 0) goto L_0x02db
        L_0x02d7:
            X.1CQ r1 = X.AnonymousClass1D7.A0I()
        L_0x02db:
            int r0 = r1.size()
            java.util.ArrayList r6 = X.C17880vN.A0z(r0)
            java.util.Iterator r13 = X.AnonymousClass000.A15(r1)
        L_0x02e7:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x031f
            java.util.Map$Entry r1 = X.AnonymousClass000.A16(r13)
            java.lang.String r12 = X.C17880vN.A0x(r1)
            if (r9 == 0) goto L_0x030d
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x030d
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            java.lang.String r0 = X.C25339Cdy.A00(r0, r9)
            X.C18070vi.A0X(r0)
            java.lang.String r12 = X.C25339Cdy.A01(r12, r0)
            X.C18070vi.A0X(r12)
        L_0x030d:
            java.lang.Object r0 = r1.getValue()
            X.Bno r1 = new X.Bno
            r1.<init>(r12, r0)
            X.CaF r0 = new X.CaF
            r0.<init>(r1, r8)
            r6.add(r0)
            goto L_0x02e7
        L_0x031f:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "query_info_"
            java.lang.String r12 = X.AnonymousClass001.A1H(r0, r2, r1)
            java.util.List r1 = r10.A02
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0341
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            java.lang.String r0 = X.C25339Cdy.A00(r0, r1)
            X.C18070vi.A0X(r0)
            java.lang.String r12 = X.C25339Cdy.A01(r12, r0)
            X.C18070vi.A0X(r12)
        L_0x0341:
            X.Bno r1 = new X.Bno
            r0 = r23
            r1.<init>(r12, r0)
            X.CaF r0 = new X.CaF
            r0.<init>(r1, r11)
            java.util.ArrayList r1 = X.C29431cG.A0l(r0, r6)
            r0 = r22
            r0.add(r1)
            goto L_0x0181
        L_0x0358:
            r9 = r8
            goto L_0x0175
        L_0x035b:
            java.util.ArrayList r0 = X.C29351c6.A0F(r22)
            goto L_0x00b2
        L_0x0361:
            java.util.List r0 = X.C29431cG.A0t(r8)
            return r0
        L_0x0366:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Failed to find async component container for "
            r1.append(r0)
            java.lang.String r0 = r12.A04
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            java.lang.Exception r1 = new java.lang.Exception
            r1.<init>(r0)
            throw r1
        L_0x037b:
            X.3EW r1 = X.AnonymousClass3MW.A14()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25957CpP.A00(X.CpP, X.Boh, X.CO8, X.CbU, java.lang.Integer):java.util.List");
    }
}
