package X;

/* renamed from: X.Aef  reason: case insensitive filesystem */
public class C21111Aef implements AnonymousClass1TI {
    public final int A00;
    public final Object A01;

    public C21111Aef(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x02cf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void accept(java.lang.Object r21) {
        /*
            r20 = this;
            r1 = r21
            r2 = r20
            int r0 = r2.A00
            switch(r0) {
                case 0: goto L_0x0325;
                case 1: goto L_0x02fb;
                case 2: goto L_0x02f3;
                case 3: goto L_0x00a6;
                case 4: goto L_0x02a2;
                case 5: goto L_0x0293;
                case 6: goto L_0x0289;
                case 7: goto L_0x022f;
                case 8: goto L_0x0223;
                case 9: goto L_0x0211;
                case 10: goto L_0x0062;
                case 11: goto L_0x002c;
                case 12: goto L_0x020b;
                case 13: goto L_0x0015;
                case 14: goto L_0x01fc;
                case 15: goto L_0x01f1;
                case 16: goto L_0x01df;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r1 = r2.A01
            X.1DS r1 = (X.AnonymousClass1DS) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.AnonymousClass3MY.A1M(r1, r0)
        L_0x0014:
            return
        L_0x0015:
            java.lang.Object r3 = r2.A01
            X.91y r3 = (X.AnonymousClass91y) r3
            boolean r0 = X.AnonymousClass000.A1Y(r1)
            if (r0 == 0) goto L_0x0014
            X.10I r2 = r3.A0E
            r1 = 26
            X.Ajt r0 = new X.Ajt
            r0.<init>(r3, r1)
            r2.CGF(r0)
            return
        L_0x002c:
            java.lang.Object r4 = r2.A01
            X.9yw r4 = (X.C198809yw) r4
            X.AEs r1 = (X.C20284AEs) r1
            X.8pb r3 = r1.A08
            X.8pT r3 = (X.AnonymousClass8pT) r3
            if (r3 == 0) goto L_0x0014
            java.lang.String r2 = "VISA"
            java.lang.String r0 = r3.A02
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0014
            java.lang.String r0 = r3.A05
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0014
            android.content.Context r6 = r4.A00
            X.1KB r7 = r4.A01
            X.1ex r9 = r4.A0D
            X.1jG r8 = r4.A0C
            X.AYV r10 = new X.AYV
            r10.<init>(r1, r4, r3)
            X.9ml r5 = new X.9ml
            r5.<init>(r6, r7, r8, r9, r10)
            java.lang.String r0 = r4.A0S
            r5.A00(r0)
            return
        L_0x0062:
            java.lang.Object r6 = r2.A01
            com.whatsapp.payments.IndiaUpiPaymentInvitePickerActivity r6 = (com.whatsapp.payments.IndiaUpiPaymentInvitePickerActivity) r6
            X.A7B r1 = (X.A7B) r1
            r0 = 0
            r6.A06 = r0
            boolean r0 = r6.isFinishing()
            if (r0 != 0) goto L_0x0014
            X.A7s r5 = r6.A01
            int r11 = r1.A00
            r0 = 5
            X.A9w r7 = X.C20160A9w.A00(r6, r0)
            r10 = 0
            r9 = r7
            r8 = r7
            X.05w r0 = r5.A07(r6, r7, r8, r9, r10, r11)
            r0.show()
            java.lang.String r5 = X.AnonymousClass8BV.A0o(r6)
            X.AZ6 r4 = r6.A04
            java.lang.Integer r3 = X.C17880vN.A0k()
            java.lang.Integer r2 = X.AnonymousClass8BS.A0V()
            java.lang.String r0 = "payment_home"
            X.8sO r2 = r4.A07(r3, r2, r0, r5)
            int r0 = r1.A00
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2.A0S = r0
            X.AZ6 r0 = r6.A04
            r0.BiH(r2)
            return
        L_0x00a6:
            java.lang.Object r4 = r2.A01
            X.37K r4 = (X.AnonymousClass37K) r4
            java.util.List r1 = (java.util.List) r1
            r0 = 1
            X.C18070vi.A0d(r1, r0)
            X.1OZ r3 = r4.A08
            java.lang.String r10 = r3.A0B()
            java.util.HashSet r9 = X.C17880vN.A12()
            java.util.HashMap r8 = X.C17880vN.A11()
            java.util.HashMap r7 = X.C17880vN.A11()
            java.lang.String r0 = "sync"
            X.1cX r11 = X.C108945cZ.A0t(r0)
            java.util.Iterator r19 = r1.iterator()
        L_0x00cc:
            boolean r0 = r19.hasNext()
            if (r0 == 0) goto L_0x0147
            java.lang.Object r2 = r19.next()
            X.9gA r2 = (X.C187659gA) r2
            if (r2 == 0) goto L_0x00cc
            java.lang.String r15 = r2.A02
            X.1TS r0 = r4.A07
            java.lang.Long r18 = r0.A01(r15)
            java.util.List r14 = r2.A04
            X.C18070vi.A0W(r14)
            X.2BT r0 = r2.A01
            byte[] r13 = r2.A05
            X.11S r2 = r4.A02
            boolean r16 = r2.A0N()
            java.lang.String r2 = "collection"
            X.1cX r12 = X.C108945cZ.A0t(r2)
            java.lang.String r2 = "critical_unblock_low"
            boolean r2 = r2.equals(r15)
            r5 = r2 ^ 1
            java.lang.String r2 = "name"
            X.C29591cX.A01(r12, r2, r15)
            java.lang.String r2 = "order"
            X.C108965cb.A1H(r12, r2, r5)
            if (r18 == 0) goto L_0x0114
            java.lang.String r2 = "version"
            long r5 = r18.longValue()
            X.C108965cb.A1I(r12, r2, r5)
        L_0x0114:
            if (r16 == 0) goto L_0x0129
            if (r18 == 0) goto L_0x0122
            r16 = 0
            long r5 = r18.longValue()
            int r2 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r2 != 0) goto L_0x0129
        L_0x0122:
            java.lang.String r5 = "return_snapshot"
            java.lang.String r2 = "true"
            X.C29591cX.A01(r12, r5, r2)
        L_0x0129:
            if (r0 == 0) goto L_0x0140
            r6 = 0
            byte[] r5 = r0.A0M()
            java.lang.String r2 = "patch"
            X.1ca r0 = new X.1ca
            r0.<init>((java.lang.String) r2, (byte[]) r5, (X.AnonymousClass1MD[]) r6)
            r12.A05(r0)
            r8.put(r15, r14)
            r7.put(r15, r13)
        L_0x0140:
            r9.add(r15)
            X.C108955ca.A1P(r12, r11)
            goto L_0x00cc
        L_0x0147:
            X.1cX r5 = X.AnonymousClass8BY.A0O()
            java.lang.String r0 = "w:sync:app:state"
            X.AnonymousClass8BY.A17(r5, r0)
            java.lang.String r0 = "id"
            X.C29591cX.A01(r5, r0, r10)
            java.util.List r0 = r11.A02
            r0.clear()
            java.lang.String r2 = "data_namespace"
            r0 = 3
            X.C108965cb.A1H(r11, r2, r0)
            X.1ca r12 = X.C29591cX.A00(r11, r5)
            X.9oi r0 = new X.9oi
            r15 = r7
            r16 = r9
            r11 = r0
            r13 = r10
            r14 = r8
            r11.<init>(r12, r13, r14, r15, r16)
            r4.A00 = r0
            java.util.List r0 = X.C29431cG.A0q(r1)
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            java.util.Iterator r2 = r0.iterator()
        L_0x017d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0191
            java.lang.Object r0 = r2.next()
            X.9gA r0 = (X.C187659gA) r0
            X.2n3 r0 = r0.A00
            if (r0 == 0) goto L_0x017d
            r5.add(r0)
            goto L_0x017d
        L_0x0191:
            r4.A01 = r5
            X.1TZ r0 = r4.A06
            r0.A03(r1)
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "sync-request-handler/sendIq iqId:"
            r2.append(r0)
            X.9oi r0 = r4.A00
            if (r0 == 0) goto L_0x01dd
            java.lang.String r0 = r0.A01
        L_0x01a7:
            X.C17890vO.A1A(r2, r0)
            X.9oi r0 = r4.A00
            if (r0 == 0) goto L_0x0014
            java.lang.String r2 = r0.A01
            X.1ca r0 = r0.A00
            r8 = 32000(0x7d00, double:1.581E-319)
            r7 = 238(0xee, float:3.34E-43)
            r5 = r0
            r6 = r2
            r3.A0J(r4, r5, r6, r7, r8)
            X.1Rw r3 = r4.A05
            java.util.List r0 = X.C29431cG.A0q(r1)
            java.util.ArrayList r2 = X.AnonymousClass000.A13()
            java.util.Iterator r1 = r0.iterator()
        L_0x01c9:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x032e
            java.lang.Object r0 = r1.next()
            X.9gA r0 = (X.C187659gA) r0
            java.util.List r0 = r0.A03
            if (r0 == 0) goto L_0x01c9
            r2.add(r0)
            goto L_0x01c9
        L_0x01dd:
            r0 = 0
            goto L_0x01a7
        L_0x01df:
            java.lang.Object r0 = r2.A01
            X.8yc r0 = (X.C175378yc) r0
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r0 = r0.A01
            com.whatsapp.payments.ui.PaymentMethodsListPickerFragment r0 = (com.whatsapp.payments.ui.PaymentMethodsListPickerFragment) r0
            X.8DB r0 = r0.A04
            r0.A00 = r1
            r0.notifyDataSetChanged()
            return
        L_0x01f1:
            java.lang.Object r2 = r2.A01
            X.91y r2 = (X.AnonymousClass91y) r2
            X.AEs r1 = (X.C20284AEs) r1
            r0 = 1
            r2.A4c(r1, r0)
            return
        L_0x01fc:
            java.lang.Object r2 = r2.A01
            X.91R r2 = (X.AnonymousClass91R) r2
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            X.8pf r0 = r2.A0P
            r0.A0J = r1
            r0 = 0
            r2.A5V(r0)
            return
        L_0x020b:
            java.lang.Object r0 = r2.A01
            X.AnonymousClass3MW.A1U(r0)
            return
        L_0x0211:
            java.lang.Object r0 = r2.A01
            X.1QD r0 = (X.AnonymousClass1QD) r0
            boolean r2 = X.AnonymousClass000.A1Y(r1)
            android.content.SharedPreferences$Editor r1 = X.AnonymousClass8BU.A07(r0)
            java.lang.String r0 = "payment_is_first_send"
            X.C17880vN.A1F(r1, r0, r2)
            return
        L_0x0223:
            java.lang.Object r2 = r2.A01
            X.AWH r2 = (X.AWH) r2
            long r0 = X.C17880vN.A05(r1)
            X.AWH.A01(r2, r0)
            return
        L_0x022f:
            java.lang.Object r2 = r2.A01
            X.8ff r2 = (X.C167228ff) r2
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r0 = "mediaupload/oncancelled, request="
            r3.append(r0)
            X.2rU r0 = r2.A0W
            r3.append(r0)
            java.lang.String r0 = ", this="
            java.lang.String r0 = X.AnonymousClass001.A1E(r2, r0, r3)
            com.whatsapp.util.Log.i(r0, r1)
            boolean r0 = r1 instanceof java.io.FileNotFoundException
            if (r0 == 0) goto L_0x0259
            r1 = 7
        L_0x0251:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            X.C167228ff.A03(r2, r0)
            return
        L_0x0259:
            boolean r0 = r1 instanceof java.io.IOException
            if (r0 == 0) goto L_0x0269
            X.1KX r0 = r2.A0Q
            boolean r0 = r0.A03(r1)
            r1 = 3
            if (r0 == 0) goto L_0x0251
            r1 = 18
            goto L_0x0251
        L_0x0269:
            boolean r0 = r1 instanceof X.AnonymousClass2RQ
            if (r0 == 0) goto L_0x0270
            r1 = 21
            goto L_0x0251
        L_0x0270:
            boolean r0 = r1 instanceof java.security.NoSuchAlgorithmException
            if (r0 == 0) goto L_0x0277
            r1 = 16
            goto L_0x0251
        L_0x0277:
            java.util.concurrent.FutureTask r0 = r2.A02
            boolean r0 = r0.isCancelled()
            if (r0 == 0) goto L_0x0281
            r1 = 1
            goto L_0x0251
        L_0x0281:
            java.lang.String r0 = "MediaUpload/onError unknown"
            com.whatsapp.util.Log.e(r0, r1)
            r1 = 31
            goto L_0x0251
        L_0x0289:
            java.lang.Object r0 = r2.A01
            X.8ff r0 = (X.C167228ff) r0
            java.lang.Integer r1 = (java.lang.Integer) r1
            X.C167228ff.A03(r0, r1)
            return
        L_0x0293:
            java.lang.Object r0 = r2.A01
            X.1lA r0 = (X.C34841lA) r0
            X.1lB r1 = r0.A03
            monitor-enter(r1)
            r0 = 0
            r1.A00 = r0     // Catch:{ all -> 0x029f }
            monitor-exit(r1)
            return
        L_0x029f:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x02a2:
            java.lang.Object r4 = r2.A01
            X.37K r4 = (X.AnonymousClass37K) r4
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            r0 = 1
            java.lang.StringBuilder r2 = X.AnonymousClass3MZ.A19(r1, r0)
            java.lang.String r0 = "sync-request-handler/sendRequest preparing request failed - "
            X.C17900vP.A0X(r1, r0, r2)
            java.util.ArrayList r2 = X.AnonymousClass000.A13()
            boolean r0 = r1 instanceof X.AnonymousClass9LH
            if (r0 == 0) goto L_0x02e7
            r0 = r1
            X.9LH r0 = (X.AnonymousClass9LH) r0
            java.util.List r0 = r0.throwables
            X.C18070vi.A0X(r0)
            r2.addAll(r0)
        L_0x02c5:
            java.util.Iterator r3 = r2.iterator()
        L_0x02c9:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x02eb
            java.lang.Object r2 = r3.next()
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            boolean r0 = r2 instanceof X.AnonymousClass2E0
            if (r0 != 0) goto L_0x02e1
            boolean r0 = r2 instanceof X.AnonymousClass2E1
            if (r0 != 0) goto L_0x02e1
            boolean r0 = r2 instanceof X.C26831Tq
            if (r0 == 0) goto L_0x02c9
        L_0x02e1:
            X.2tu r0 = r4.A03
            r0.A07(r2)
            return
        L_0x02e7:
            r2.add(r1)
            goto L_0x02c5
        L_0x02eb:
            java.lang.String r2 = "sync-request-handler/sendRequest unexpected exception was caught! Only SyncdFailedException, SyncdRetriableException and SyncdFatalException are allowed here."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2, r1)
            throw r0
        L_0x02f3:
            java.lang.Object r0 = r2.A01
            X.Af0 r0 = (X.C21132Af0) r0
            r0.A0B(r1)
            return
        L_0x02fb:
            java.lang.Object r3 = r2.A01
            X.Af0 r3 = (X.C21132Af0) r3
            java.util.List r1 = (java.util.List) r1
            boolean r2 = X.C18070vi.A16(r3, r1)
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0317
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0317
        L_0x030f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r3.A0B(r0)
            return
        L_0x0317:
            java.util.Iterator r1 = r1.iterator()
        L_0x031b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x030f
            r1.next()
            goto L_0x031b
        L_0x0325:
            java.lang.Object r1 = r2.A01
            X.1z1 r1 = (X.C42961z1) r1
            r0 = 1
            X.C42961z1.A00(r1, r0)
            return
        L_0x032e:
            java.util.ArrayList r0 = X.C29351c6.A0F(r2)
            r3.A0H(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21111Aef.accept(java.lang.Object):void");
    }
}
