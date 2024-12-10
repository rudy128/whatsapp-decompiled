package X;

public class AZV implements C22461B8t {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public AZV(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0083, code lost:
        ((X.AnonymousClass91F) r0).A01.setChecked(r1);
        r2.A28();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008e, code lost:
        r5 = r7.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0092, code lost:
        if (r5 != 1440) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0094, code lost:
        r2.A2O(r7.A01, 2131755316);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009f, code lost:
        if (r5 != 1441) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a1, code lost:
        X.AnonymousClass8BX.A1E(r2, r7.A02);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a6, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a7, code lost:
        r1 = (X.C188459hS) r1.A01;
        r4 = X.C20160A9w.A00(r2, 30);
        r3 = X.C20160A9w.A00(r2, 31);
        r2 = r1.A02;
        r1 = r1.A01;
        r0 = r2.A06(r1, r4, r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00bf, code lost:
        if (r0 != null) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c1, code lost:
        r0 = r2.A05(r1, r4, r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c5, code lost:
        if (r0 != null) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c7, code lost:
        r0 = X.C20110A7s.A00(r1, r3, r1.getString(2131893867));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r7 == null) goto L_0x000b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d2, code lost:
        r0.show();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00eb, code lost:
        X.AnonymousClass91q.A0q(r3, (java.util.Map) null, r7.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00f1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000b, code lost:
        r3.A00("on_success");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void C3f(X.A7B r7) {
        /*
            r6 = this;
            int r0 = r6.A00
            switch(r0) {
                case 0: goto L_0x0044;
                case 1: goto L_0x0005;
                case 2: goto L_0x0011;
                case 3: goto L_0x0005;
                case 4: goto L_0x006f;
                case 5: goto L_0x005a;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r3 = r6.A02
            X.9sN r3 = (X.C194839sN) r3
            if (r7 != 0) goto L_0x00eb
        L_0x000b:
            java.lang.String r0 = "on_success"
            r3.A00(r0)
            return
        L_0x0011:
            java.lang.Object r3 = r6.A02
            X.9sN r3 = (X.C194839sN) r3
            if (r7 == 0) goto L_0x000b
            java.util.HashMap r2 = X.C17880vN.A11()
            int r1 = r7.A00
            r0 = 1440(0x5a0, float:2.018E-42)
            if (r1 != r0) goto L_0x0032
            int r0 = r7.A01
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "remaining_retries"
            r2.put(r0, r1)
            java.lang.String r0 = "pin_incorrect"
        L_0x002e:
            r3.A01(r0, r2)
            return
        L_0x0032:
            r0 = 1441(0x5a1, float:2.019E-42)
            if (r1 != r0) goto L_0x00d6
            long r0 = r7.A02
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "next_retry_ts"
            r2.put(r0, r1)
            java.lang.String r0 = "pin_rate_limited"
            goto L_0x002e
        L_0x0044:
            java.lang.Object r2 = r6.A01
            X.91q r2 = (X.AnonymousClass91q) r2
            java.lang.Object r3 = r6.A02
            X.9sN r3 = (X.C194839sN) r3
            if (r7 != 0) goto L_0x00da
            X.00H r0 = r2.A0V
            java.lang.Object r0 = r0.get()
            X.9sf r0 = (X.C195019sf) r0
            r0.A00()
            goto L_0x000b
        L_0x005a:
            java.lang.Object r1 = r6.A01
            X.AZW r1 = (X.AZW) r1
            java.lang.Object r2 = r6.A02
            com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment r2 = (com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment) r2
            r2.A2M()
            if (r7 != 0) goto L_0x008e
            java.lang.Object r0 = r1.A01
            X.9hS r0 = (X.C188459hS) r0
            X.B99 r0 = r0.A07
            r1 = 1
            goto L_0x0083
        L_0x006f:
            java.lang.Object r1 = r6.A01
            X.AZW r1 = (X.AZW) r1
            java.lang.Object r2 = r6.A02
            com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment r2 = (com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment) r2
            r2.A2M()
            if (r7 != 0) goto L_0x008e
            java.lang.Object r0 = r1.A01
            X.9hS r0 = (X.C188459hS) r0
            X.B99 r0 = r0.A07
            r1 = 0
        L_0x0083:
            X.91F r0 = (X.AnonymousClass91F) r0
            androidx.appcompat.widget.SwitchCompat r0 = r0.A01
            r0.setChecked(r1)
            r2.A28()
            return
        L_0x008e:
            int r5 = r7.A00
            r0 = 1440(0x5a0, float:2.018E-42)
            if (r5 != r0) goto L_0x009d
            int r1 = r7.A01
            r0 = 2131755316(0x7f100134, float:1.9141508E38)
            r2.A2O(r1, r0)
            return
        L_0x009d:
            r0 = 1441(0x5a1, float:2.019E-42)
            if (r5 != r0) goto L_0x00a7
            long r0 = r7.A02
            X.AnonymousClass8BX.A1E(r2, r0)
            return
        L_0x00a7:
            java.lang.Object r1 = r1.A01
            X.9hS r1 = (X.C188459hS) r1
            r0 = 30
            X.A9w r4 = X.C20160A9w.A00(r2, r0)
            r0 = 31
            X.A9w r3 = X.C20160A9w.A00(r2, r0)
            X.A7s r2 = r1.A02
            X.1FY r1 = r1.A01
            X.05w r0 = r2.A06(r1, r4, r3, r5)
            if (r0 != 0) goto L_0x00d2
            X.05w r0 = r2.A05(r1, r4, r3, r5)
            if (r0 != 0) goto L_0x00d2
            r0 = 2131893867(0x7f121e6b, float:1.9422523E38)
            java.lang.String r0 = r1.getString(r0)
            X.05w r0 = X.C20110A7s.A00(r1, r3, r0)
        L_0x00d2:
            r0.show()
            return
        L_0x00d6:
            X.AnonymousClass91q.A0q(r3, r2, r1)
            return
        L_0x00da:
            int r1 = r7.A00
            r0 = 450(0x1c2, float:6.3E-43)
            if (r1 != r0) goto L_0x00eb
            java.lang.String r0 = "Encountered PaymentNetworkError.PIN_ALREADY_SET error; correcting PIN state"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.9uA r1 = r2.A0P
            r0 = 1
            r1.A02(r0)
        L_0x00eb:
            r1 = 0
            int r0 = r7.A00
            X.AnonymousClass91q.A0q(r3, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AZV.C3f(X.A7B):void");
    }
}
