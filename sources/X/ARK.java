package X;

public class ARK implements C22442B7y {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public ARK(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A00 = i;
        this.A01 = obj3;
        this.A02 = obj2;
        this.A03 = obj4;
        this.A04 = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: com.whatsapp.payments.ui.IndiaUpiBankAccountPickerActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void BlH(java.util.List r10) {
        /*
            r9 = this;
            int r0 = r9.A00
            switch(r0) {
                case 0: goto L_0x002c;
                case 1: goto L_0x00c5;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r8 = r9.A01
            com.whatsapp.payments.ui.BrazilPayBloksActivity r8 = (com.whatsapp.payments.ui.BrazilPayBloksActivity) r8
            java.lang.Object r7 = r9.A02
            java.util.AbstractList r7 = (java.util.AbstractList) r7
            java.lang.Object r3 = r9.A03
            X.9sN r3 = (X.C194839sN) r3
            java.lang.Object r5 = r9.A04
            java.util.Map r5 = (java.util.Map) r5
            int r6 = X.AnonymousClass8BX.A02(r8, r7)
            X.A0b r0 = r8.A05
            org.json.JSONArray r4 = r0.A01(r7)
            boolean r0 = X.C19944A0b.A00(r7)
            if (r0 == 0) goto L_0x0091
            r1 = 0
            r0 = -233(0xffffffffffffff17, float:NaN)
            X.AnonymousClass91q.A0q(r3, r1, r0)
        L_0x002b:
            return
        L_0x002c:
            java.lang.Object r2 = r9.A01
            X.8za r2 = (X.C175978za) r2
            java.lang.Object r0 = r9.A02
            X.8pS r0 = (X.AnonymousClass8pS) r0
            java.lang.Object r4 = r9.A03
            X.8pN r4 = (X.AnonymousClass8pN) r4
            java.lang.Object r3 = r9.A04
            X.B5W r3 = (X.B5W) r3
            if (r0 == 0) goto L_0x0055
            X.77e r0 = r0.A08
            boolean r0 = X.C20061A5k.A02(r0)
            if (r0 != 0) goto L_0x0055
            java.lang.Object r0 = r2.A01
            X.8zG r0 = (X.C175778zG) r0
            X.1QL r1 = r0.A03
            java.lang.String r0 = "add_bank"
            X.1QM r0 = r1.A04(r0)
            r1.A0A(r0)
        L_0x0055:
            java.lang.Object r2 = r2.A01
            X.8zG r2 = (X.C175778zG) r2
            X.B8m r1 = r2.A01
            if (r1 == 0) goto L_0x002b
            if (r4 == 0) goto L_0x002b
            r0 = 0
            r1.C2m(r4, r0)
            X.8pb r0 = r4.A08
            X.8pS r0 = (X.AnonymousClass8pS) r0
            if (r0 == 0) goto L_0x002b
            boolean r0 = X.C170278pb.A03(r0)
            if (r0 == 0) goto L_0x002b
            X.1QL r1 = r2.A03
            java.lang.String r0 = "2fa"
            X.1QM r0 = r1.A04(r0)
            r1.A0A(r0)
            X.AZb r3 = (X.C20798AZb) r3
            int r0 = r3.A00
            java.lang.Object r1 = r3.A01
            int r0 = 2 - r0
            if (r0 == 0) goto L_0x008c
            com.whatsapp.payments.ui.IndiaUpiBankAccountPickerActivity r1 = (com.whatsapp.payments.ui.IndiaUpiBankAccountPickerActivity) r1
            X.9je r0 = r1.A0B
        L_0x0088:
            r0.A00(r1)
            return
        L_0x008c:
            com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity r1 = (com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity) r1
            X.9je r0 = r1.A0H
            goto L_0x0088
        L_0x0091:
            if (r4 == 0) goto L_0x00bf
            int r2 = com.whatsapp.payments.ui.BrazilPayBloksActivity.A0d(r7)
            java.lang.String r1 = "default_selected_position"
            java.lang.String r0 = java.lang.String.valueOf(r2)
            r5.put(r1, r0)
            X.0ve r1 = r8.A0E
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r1, r6)
            if (r0 == 0) goto L_0x00b6
            r0 = -1
            if (r2 == r0) goto L_0x00b6
            java.lang.Object r0 = r7.get(r2)
            X.Aib r0 = (X.C21347Aib) r0
            com.whatsapp.payments.ui.BrazilPayBloksActivity.A0y(r0, r5)
        L_0x00b6:
            java.lang.String r1 = "verify_methods"
            java.lang.String r0 = r4.toString()
            r5.put(r1, r0)
        L_0x00bf:
            java.lang.String r0 = "on_success"
            r3.A01(r0, r5)
            return
        L_0x00c5:
            java.lang.Object r4 = r9.A01
            com.whatsapp.payments.ui.BrazilPayBloksActivity r4 = (com.whatsapp.payments.ui.BrazilPayBloksActivity) r4
            java.lang.Object r3 = r9.A02
            X.8pK r3 = (X.AnonymousClass8pK) r3
            java.lang.Object r2 = r9.A03
            java.util.Map r2 = (java.util.Map) r2
            java.lang.Object r1 = r9.A04
            X.9sN r1 = (X.C194839sN) r1
            r0 = 0
            com.whatsapp.payments.ui.BrazilPayBloksActivity.A0x(r3, r4, r0, r2)
            java.lang.String r0 = "on_success"
            r1.A01(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ARK.BlH(java.util.List):void");
    }
}
