package X;

import android.os.AsyncTask;

public abstract class A34 {
    public AnonymousClass1GC A00;
    public AnonymousClass1F9 A01;
    public final AnonymousClass8CU A02;

    public void A0D(Object obj) {
    }

    public void A0E() {
    }

    public void A0H(Object obj) {
    }

    public void A0I(Object... objArr) {
    }

    public final int A09() {
        AsyncTask.Status status = this.A02.getStatus();
        if (status == AsyncTask.Status.PENDING) {
            return 0;
        }
        if (status == AsyncTask.Status.RUNNING) {
            return 1;
        }
        return 2;
    }

    public AnonymousClass1F9 A0A(Class cls) {
        if (AnonymousClass1F9.class.equals(cls)) {
            return this.A01;
        }
        return (AnonymousClass1F9) cls.cast(this.A01);
    }

    public final void A0B(boolean z) {
        this.A02.cancel(z);
    }

    public final void A0C(Object... objArr) {
        this.A02.A01(objArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: com.whatsapp.accountsync.ProfileActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v20, resolved type: com.whatsapp.registration.VerifyTwoFactorAuth} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v21, resolved type: com.whatsapp.accountsync.ProfileActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v22, resolved type: com.whatsapp.accountsync.ProfileActivity} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0F() {
        /*
            r4 = this;
            boolean r0 = r4 instanceof X.AnonymousClass9BX
            if (r0 == 0) goto L_0x001d
            r0 = r4
            X.9BX r0 = (X.AnonymousClass9BX) r0
            java.lang.ref.WeakReference r0 = r0.A0A
            java.lang.Object r1 = r0.get()
            X.B9P r1 = (X.B9P) r1
            if (r1 == 0) goto L_0x0126
            r0 = 0
            r1.CIM(r0)
            com.whatsapp.registration.VerifyTwoFactorAuth r1 = (com.whatsapp.registration.VerifyTwoFactorAuth) r1
            int r0 = r1.A00
        L_0x0019:
            X.AnonymousClass4Yv.A01(r1, r0)
        L_0x001c:
            return
        L_0x001d:
            boolean r0 = r4 instanceof X.C177899Ba
            if (r0 == 0) goto L_0x0039
            r2 = r4
            X.9Ba r2 = (X.C177899Ba) r2
            X.0z4 r1 = r2.A03
            java.lang.String r0 = "did_not_query"
            r1.A1W(r0)
            r0 = -1
            r1.A18(r0)
            X.9c7 r0 = r2.A0A
            X.9hs r0 = r0.A00
            X.1DT r0 = r0.A04
            X.C72463Mc.A1B(r0)
            return
        L_0x0039:
            boolean r0 = r4 instanceof X.AnonymousClass9BJ
            if (r0 == 0) goto L_0x004a
            r0 = r4
            X.9BJ r0 = (X.AnonymousClass9BJ) r0
            X.1KB r2 = r0.A01
            r1 = 0
            r0 = 2131891797(0x7f121655, float:1.9418324E38)
            r2.A07(r1, r0)
            return
        L_0x004a:
            boolean r0 = r4 instanceof X.AnonymousClass9BY
            if (r0 == 0) goto L_0x005c
            r1 = r4
            X.9BY r1 = (X.AnonymousClass9BY) r1
            boolean r0 = r1.A00
            if (r0 == 0) goto L_0x001c
            X.8Gc r1 = r1.A03
        L_0x0057:
            r0 = 1
            r1.A0q(r0)
            return
        L_0x005c:
            boolean r0 = r4 instanceof X.AnonymousClass9BU
            if (r0 == 0) goto L_0x006a
            r1 = r4
            X.9BU r1 = (X.AnonymousClass9BU) r1
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x001c
            X.8Gc r1 = r1.A03
            goto L_0x0057
        L_0x006a:
            boolean r0 = r4 instanceof X.C177739Aj
            if (r0 == 0) goto L_0x0085
            r0 = r4
            X.9Aj r0 = (X.C177739Aj) r0
            com.whatsapp.payments.ui.IndiaUpiCheckOrderDetailsActivity r2 = r0.A00
            java.util.concurrent.atomic.AtomicInteger r1 = r2.A0r
            int r0 = r1.get()
            if (r0 != 0) goto L_0x0081
            r0 = 2131895077(0x7f122325, float:1.9424977E38)
            r2.CNA(r0)
        L_0x0081:
            r1.incrementAndGet()
            return
        L_0x0085:
            boolean r0 = r4 instanceof X.AnonymousClass9BN
            if (r0 == 0) goto L_0x00a4
            r0 = r4
            X.9BN r0 = (X.AnonymousClass9BN) r0
            java.lang.ref.WeakReference r0 = r0.A06
            X.1FU r2 = X.C108945cZ.A0Z(r0)
            if (r2 == 0) goto L_0x001c
            boolean r0 = r2.isFinishing()
            if (r0 != 0) goto L_0x001c
            r1 = 2131897382(0x7f122c26, float:1.9429652E38)
            r0 = 2131895077(0x7f122325, float:1.9424977E38)
        L_0x00a0:
            r2.CNB(r1, r0)
            return
        L_0x00a4:
            boolean r0 = r4 instanceof X.C177909Bb
            if (r0 == 0) goto L_0x00bb
            r2 = r4
            X.9Bb r2 = (X.C177909Bb) r2
            X.8yM r1 = r2.A09
            r0 = 24
            X.C20735AWq.A00(r1, r0)
            X.1O1 r2 = r2.A0E
            java.lang.String r1 = "db_backup"
            r0 = 1
            r2.A01(r1, r0)
            return
        L_0x00bb:
            boolean r0 = r4 instanceof X.AnonymousClass9BS
            if (r0 == 0) goto L_0x00c8
            r0 = r4
            X.9BS r0 = (X.AnonymousClass9BS) r0
            X.BBx r0 = r0.A01
            r0.C8D()
            return
        L_0x00c8:
            boolean r0 = r4 instanceof X.AnonymousClass9BF
            if (r0 == 0) goto L_0x00e2
            r0 = r4
            X.9BF r0 = (X.AnonymousClass9BF) r0
            java.lang.ref.WeakReference r0 = r0.A00
            X.1FU r2 = X.C108945cZ.A0Z(r0)
            if (r2 == 0) goto L_0x001c
            boolean r0 = r2.Bed()
            if (r0 != 0) goto L_0x001c
            r1 = 0
            r0 = 2131895534(0x7f1224ee, float:1.9425904E38)
            goto L_0x00a0
        L_0x00e2:
            boolean r0 = r4 instanceof X.AnonymousClass9BV
            if (r0 == 0) goto L_0x00ef
            r0 = r4
            X.9BV r0 = (X.AnonymousClass9BV) r0
            java.lang.ref.WeakReference r0 = r0.A04
            r0.get()
            return
        L_0x00ef:
            boolean r0 = r4 instanceof X.C177959Bg
            if (r0 == 0) goto L_0x0103
            r0 = r4
            X.9Bg r0 = (X.C177959Bg) r0
            java.util.Timer r3 = r0.A09
            X.Amr r2 = new X.Amr
            r2.<init>(r0)
            r0 = 30000(0x7530, double:1.4822E-319)
            r3.schedule(r2, r0)
            return
        L_0x0103:
            boolean r0 = r4 instanceof X.C177709Ag
            if (r0 == 0) goto L_0x0110
            r0 = r4
            X.9Ag r0 = (X.C177709Ag) r0
            com.whatsapp.accountsync.ProfileActivity r1 = r0.A00
            r0 = 104(0x68, float:1.46E-43)
            goto L_0x0019
        L_0x0110:
            boolean r0 = r4 instanceof X.AnonymousClass9BP
            if (r0 == 0) goto L_0x001c
            r0 = r4
            X.9BP r0 = (X.AnonymousClass9BP) r0
            java.lang.ref.WeakReference r0 = r0.A00
            X.1FU r1 = X.C108945cZ.A0Z(r0)
            if (r1 == 0) goto L_0x001c
            r0 = 2131894984(0x7f1222c8, float:1.9424788E38)
            r1.CNA(r0)
            return
        L_0x0126:
            java.lang.String r0 = "SecurityCodeTask/onPreExecute/null callback"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A34.A0F():void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v93, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v94, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v95, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v96, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v97, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v98, resolved type: java.util.ArrayList} */
    /* JADX WARNING: type inference failed for: r1v230, types: [X.2ml, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v147, types: [X.9rc, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v82, types: [java.lang.Object, X.9eh] */
    /* JADX WARNING: type inference failed for: r5v25, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:1017:0x1628, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1019:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1020:0x162c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1151:0x18c2, code lost:
        if (r3 == null) goto L_0x18c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1271:0x1ae3, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1273:?, code lost:
        X.CDX.A00(r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1274:0x1ae7, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1278:0x1aea, code lost:
        r2 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1280:?, code lost:
        X.CDX.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1286:0x1af9, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1288:?, code lost:
        X.CDX.A00(r5, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1289:0x1afd, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x05ad, code lost:
        if (X.C20103A7h.A04(r4.A04, r4.A0F.A0T(r8), r5, true) != false) goto L_0x05af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:394:0x0884, code lost:
        if (r3 == null) goto L_0x0886;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:452:0x09d7, code lost:
        if (r3 == null) goto L_0x09d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:665:0x0e47, code lost:
        return java.lang.Integer.valueOf(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0026, code lost:
        if (r1.A06.A04().size() > 0) goto L_0x0028;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x028a  */
    /* JADX WARNING: Removed duplicated region for block: B:1158:0x18cf  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x02e7  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x02e9  */
    /* JADX WARNING: Removed duplicated region for block: B:1324:0x0b14 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:1334:0x0e0f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:666:0x0e48  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0280  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A0G(java.lang.Object... r36) {
        /*
            r35 = this;
            r2 = r36
            r0 = r35
            boolean r1 = r0 instanceof X.C177929Bd
            if (r1 == 0) goto L_0x018d
            X.9Bd r0 = (X.C177929Bd) r0
            int r1 = r0.A00
            switch(r1) {
                case 0: goto L_0x017a;
                case 1: goto L_0x0147;
                case 2: goto L_0x013e;
                case 3: goto L_0x0133;
                case 4: goto L_0x0105;
                case 5: goto L_0x00f6;
                case 6: goto L_0x00db;
                case 7: goto L_0x00ce;
                case 8: goto L_0x00c3;
                case 9: goto L_0x00b8;
                case 10: goto L_0x00a1;
                case 11: goto L_0x002e;
                case 12: goto L_0x000f;
                case 13: goto L_0x000f;
                case 14: goto L_0x007d;
                default: goto L_0x000f;
            }
        L_0x000f:
            java.lang.Object r1 = r0.A01
            X.A5V r1 = (X.A5V) r1
            X.1QD r0 = r1.A08
            X.ADT r0 = r0.A04()
            if (r0 != 0) goto L_0x0028
            X.1QG r0 = r1.A06
            java.util.ArrayList r0 = r0.A04()
            int r1 = r0.size()
            r0 = 0
            if (r1 <= 0) goto L_0x0029
        L_0x0028:
            r0 = 1
        L_0x0029:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r0)
        L_0x002d:
            return r7
        L_0x002e:
            java.lang.Object r6 = r0.A01
            X.91M r6 = (X.AnonymousClass91M) r6
            X.1QL r0 = r6.A0K
            java.util.ArrayList r2 = r0.A05()
            X.1QL r1 = r6.A0K
            java.lang.String r0 = "2fa"
            X.1QM r1 = r1.A04(r0)
            boolean r0 = r2.contains(r1)
            if (r0 != 0) goto L_0x004b
            X.1QL r0 = r6.A0K
            r0.A0A(r1)
        L_0x004b:
            X.1QS r0 = r6.A0Q
            java.util.ArrayList r5 = X.AnonymousClass8BU.A0t(r0)
            X.8pN r0 = r6.A00
            java.lang.String r0 = r0.A0A
            X.AEs r7 = X.AnonymousClass1KH.A01(r0, r5)
            if (r7 == 0) goto L_0x002d
            X.8pb r4 = r7.A08
            if (r4 == 0) goto L_0x002d
            X.8pS r4 = (X.AnonymousClass8pS) r4
            X.7Ik r3 = X.AnonymousClass8BR.A0Z()
            java.lang.Class<java.lang.Boolean> r2 = java.lang.Boolean.class
            java.lang.Boolean r1 = X.AnonymousClass000.A0i()
            java.lang.String r0 = "isPinSet"
            X.77e r0 = X.AnonymousClass8BR.A0Y(r3, r2, r1, r0)
            r4.A04 = r0
            X.1QS r0 = r6.A0Q
            X.1KH r0 = X.AnonymousClass8BR.A0R(r0)
            r0.A0M(r5)
            return r7
        L_0x007d:
            java.lang.Object r0 = r0.A01
            X.A5G r0 = (X.A5G) r0
            com.whatsapp.quickcontact.QuickContactActivity r2 = r0.A00
            X.00H r0 = r2.A0q
            X.1kb r1 = X.AnonymousClass3MW.A0Z(r0)
            X.1E7 r0 = r2.A0S
            X.1BI r0 = r0.A0J
            X.1EC r0 = (X.AnonymousClass1EC) r0
            X.1EC r1 = r1.A05(r0)
            if (r1 == 0) goto L_0x009e
            X.1M9 r0 = r2.A0H
            X.1E7 r7 = r0.A0E(r1)
            if (r7 == 0) goto L_0x009e
            return r7
        L_0x009e:
            X.1E7 r7 = r2.A0S
            return r7
        L_0x00a1:
            java.lang.Object r0 = r0.A01
            X.AXN r0 = (X.AXN) r0
            java.lang.Object r2 = r0.A01
            X.91M r2 = (X.AnonymousClass91M) r2
            X.1QS r0 = r2.A0Q
            X.1KH r1 = X.AnonymousClass8BR.A0R(r0)
            X.8pN r0 = r2.A00
            java.lang.String r0 = r0.A0A
            X.AEs r7 = r1.A08(r0)
            return r7
        L_0x00b8:
            java.lang.Object r0 = r0.A01
            X.91y r0 = (X.AnonymousClass91y) r0
            X.1QS r0 = r0.A0A
            java.util.ArrayList r7 = X.AnonymousClass8BU.A0t(r0)
            return r7
        L_0x00c3:
            java.lang.Object r1 = r0.A01
            X.A0F r1 = (X.A0F) r1
            X.118 r0 = r1.A03
            X.A0F.A00(r0, r1)
            r7 = 0
            return r7
        L_0x00ce:
            java.lang.Object r0 = r0.A01
            X.9yP r0 = (X.C198479yP) r0
            int r0 = X.C198479yP.A00(r0)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            return r7
        L_0x00db:
            java.lang.Object r2 = r0.A01
            com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentViewModel r2 = (com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentViewModel) r2
            java.util.concurrent.locks.Lock r3 = r2.A0s
            r3.lock()
            java.util.LinkedHashMap r0 = r2.A0r     // Catch:{ all -> 0x012e }
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap     // Catch:{ all -> 0x012e }
            r1.<init>(r0)     // Catch:{ all -> 0x012e }
            java.util.ArrayList r0 = r2.A0p     // Catch:{ all -> 0x012e }
            java.util.ArrayList r0 = X.C17880vN.A10(r0)     // Catch:{ all -> 0x012e }
            android.util.Pair r7 = X.C108945cZ.A0N(r1, r0)     // Catch:{ all -> 0x012e }
            goto L_0x012a
        L_0x00f6:
            java.lang.Object r0 = r0.A01
            com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentViewModel r0 = (com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentViewModel) r0
            X.1M9 r0 = r0.A0Z
            boolean r0 = r0.A0y()
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r0)
            return r7
        L_0x0105:
            java.lang.Object r0 = r0.A01
            X.1vh r0 = (X.C41031vh) r0
            com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentViewModel r4 = r0.A00
            java.util.concurrent.locks.Lock r3 = r4.A0s
            r3.lock()
            java.util.LinkedHashMap r2 = r4.A0r     // Catch:{ all -> 0x012e }
            int r0 = r2.size()     // Catch:{ all -> 0x012e }
            if (r0 <= 0) goto L_0x011b
            r2.clear()     // Catch:{ all -> 0x012e }
        L_0x011b:
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap     // Catch:{ all -> 0x012e }
            r1.<init>(r2)     // Catch:{ all -> 0x012e }
            java.util.ArrayList r0 = r4.A0p     // Catch:{ all -> 0x012e }
            java.util.ArrayList r0 = X.C17880vN.A10(r0)     // Catch:{ all -> 0x012e }
            android.util.Pair r7 = X.C108945cZ.A0N(r1, r0)     // Catch:{ all -> 0x012e }
        L_0x012a:
            r3.unlock()
            return r7
        L_0x012e:
            r1 = move-exception
            r3.unlock()
            throw r1
        L_0x0133:
            java.lang.Object r0 = r0.A01
            X.1pj r0 = (X.C37551pj) r0
            X.1pe r0 = r0.A02
            java.util.HashSet r7 = r0.A0I()
            return r7
        L_0x013e:
            java.lang.Object r0 = r0.A01
            com.whatsapp.accountswitching.ui.AccountSwitchingBottomSheet r0 = (com.whatsapp.accountswitching.ui.AccountSwitchingBottomSheet) r0
            java.util.ArrayList r7 = com.whatsapp.accountswitching.ui.AccountSwitchingBottomSheet.A00(r0)
            return r7
        L_0x0147:
            java.lang.Object r3 = r0.A01
            com.whatsapp.HomeActivity r3 = (com.whatsapp.HomeActivity) r3
            X.00H r0 = r3.A13
            X.2u4 r0 = X.C17880vN.A0J(r0)
            java.util.List r0 = r0.A0F()
            int r0 = r0.size()
            r1 = 0
            r2 = 0
            if (r0 != 0) goto L_0x0163
            r2 = 1
            X.0z4 r0 = r3.A0A
            r0.A1H(r1)
        L_0x0163:
            X.00H r0 = r3.A12
            X.1cN r0 = X.C17880vN.A0I(r0)
            boolean r0 = r0.A0H()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            android.util.Pair r7 = X.C108945cZ.A0N(r1, r0)
            return r7
        L_0x017a:
            java.lang.Object r0 = r0.A01
            com.whatsapp.HomeActivity r0 = (com.whatsapp.HomeActivity) r0
            X.00H r0 = r0.A12
            X.1cN r0 = X.C17880vN.A0I(r0)
            boolean r0 = r0.A0H()
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r0)
            return r7
        L_0x018d:
            boolean r1 = r0 instanceof X.AnonymousClass9BC
            if (r1 == 0) goto L_0x01da
            X.9BC r0 = (X.AnonymousClass9BC) r0
            int r1 = r0.A00
            if (r1 == 0) goto L_0x01cb
            java.lang.Object r6 = r0.A02
            com.whatsapp.payments.ui.IndiaUpiBankAccountDetailsActivity r6 = (com.whatsapp.payments.ui.IndiaUpiBankAccountDetailsActivity) r6
            X.1QS r0 = r6.A0A
            X.1QR r5 = X.AnonymousClass8BR.A0O(r0)
            r0 = 2
            java.lang.Integer[] r4 = new java.lang.Integer[r0]
            r0 = 417(0x1a1, float:5.84E-43)
            boolean r3 = X.C72453Mb.A1b(r4, r0)
            r0 = 418(0x1a2, float:5.86E-43)
            boolean r2 = X.AnonymousClass8BU.A1b(r4, r0)
            java.lang.Integer[] r1 = new java.lang.Integer[r2]
            r0 = 40
            X.C17880vN.A1T(r1, r0, r3)
            X.8pN r0 = r6.A00
            java.lang.String r0 = r0.A0A
            java.util.List r0 = r5.A0W(r0, r4, r1, r2)
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x01c6
            r3 = 1
        L_0x01c6:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        L_0x01cb:
            java.lang.Object r0 = r0.A03
            X.1cN r0 = (X.C29491cN) r0
            X.00H r0 = r0.A0F
            X.2u4 r0 = X.C17880vN.A0J(r0)
            X.2rb r0 = r0.A0B()
            return r0
        L_0x01da:
            boolean r1 = r0 instanceof X.C177919Bc
            if (r1 == 0) goto L_0x0222
            X.9Bc r0 = (X.C177919Bc) r0
            long r7 = java.lang.System.currentTimeMillis()
            X.9nf r2 = r0.A0J()
            r1 = 1
            java.lang.Integer[] r3 = new java.lang.Integer[r1]
            r1 = 100
            X.AnonymousClass000.A1L(r3, r1)
            r0.A0C(r3)
            long r5 = java.lang.System.currentTimeMillis()
            r3 = 3000(0xbb8, double:1.482E-320)
            long r5 = r5 - r7
            long r3 = r3 - r5
            r0.A0M(r3)
            boolean r1 = r2.A00()
            if (r1 == 0) goto L_0x0221
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r1 = r0.A0K()
            r3.append(r1)
            java.lang.String r1 = "result: "
            X.C17900vP.A0Y(r2, r1, r3)
            r0.A0N(r2)
            X.9tS r1 = r0.A03
            X.2lH r1 = r1.A04
            r1.A00()
            r0.A0L()
        L_0x0221:
            return r2
        L_0x0222:
            boolean r1 = r0 instanceof X.AnonymousClass9BX
            if (r1 == 0) goto L_0x0234
            X.9BX r0 = (X.AnonymousClass9BX) r0
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.String"
            r4 = 0
            X.C18070vi.A0d(r2, r4)
            java.lang.String r15 = r0.A08
            int r5 = r0.A01
            goto L_0x1119
        L_0x0234:
            boolean r1 = r0 instanceof X.AnonymousClass9BM
            if (r1 == 0) goto L_0x023f
            X.9BM r0 = (X.AnonymousClass9BM) r0
            java.lang.String r3 = "/failureReason="
            r2 = 0
            goto L_0x125e
        L_0x023f:
            boolean r1 = r0 instanceof X.AnonymousClass9BG
            if (r1 == 0) goto L_0x0248
            X.9BG r0 = (X.AnonymousClass9BG) r0
            r4 = 0
            goto L_0x13c5
        L_0x0248:
            boolean r1 = r0 instanceof X.AnonymousClass9Am
            if (r1 == 0) goto L_0x0250
            X.9Am r0 = (X.AnonymousClass9Am) r0
            goto L_0x13fd
        L_0x0250:
            boolean r1 = r0 instanceof X.AnonymousClass9BJ
            if (r1 == 0) goto L_0x032a
            X.9BJ r0 = (X.AnonymousClass9BJ) r0
            X.9Yw r1 = r0.A06
            java.util.Set r4 = r1.A00
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L_0x0322
            int r1 = r4.size()
            boolean r2 = X.C17890vO.A1R(r1)
            java.lang.String r1 = "Multiple bridges registered. Not supported."
            X.C17960vV.A0F(r2, r1)
            java.util.Iterator r1 = r4.iterator()
            java.lang.Object r1 = r1.next()
            X.A7w r1 = (X.C20113A7w) r1
            if (r1 == 0) goto L_0x0322
            boolean r1 = r1.A0H()
        L_0x027d:
            r5 = 1
            if (r1 == 0) goto L_0x028a
            java.lang.String r0 = "restore>DetermineRestoreStateBackgroundTask/google-migrate-flow/import is still running"
        L_0x0282:
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0285:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            return r0
        L_0x028a:
            X.1Cn r1 = r0.A03
            X.1Cd r2 = r1.A00
            r1 = 0
            r3 = 0
            boolean r1 = r2.A09(r1, r3)
            if (r1 != 0) goto L_0x031a
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L_0x02c0
            int r1 = r4.size()
            r2 = 1
            if (r1 == r5) goto L_0x02a4
            r2 = 0
        L_0x02a4:
            java.lang.String r1 = "Multiple bridges registered. Not supported."
            X.C17960vV.A0F(r2, r1)
            java.util.Iterator r1 = r4.iterator()
            java.lang.Object r1 = r1.next()
            X.A7w r1 = (X.C20113A7w) r1
            if (r1 == 0) goto L_0x02c0
            X.9ua r1 = r1.A03
            boolean r1 = r1.A03()
            if (r1 == 0) goto L_0x02c5
            java.lang.String r0 = "restore>DetermineRestoreStateBackgroundTask/google-migrate-flow"
            goto L_0x0282
        L_0x02c0:
            java.lang.String r1 = "GoogleMigrateUtil/hasWhatsAppData/no-bridge"
            com.whatsapp.util.Log.i((java.lang.String) r1)
        L_0x02c5:
            X.19D r4 = r0.A04
            r1 = 10527(0x291f, float:1.4751E-41)
            X.0vf r2 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r2, r4, r1)
            if (r1 != 0) goto L_0x02e9
            r1 = 2989(0xbad, float:4.188E-42)
            boolean r1 = X.C18020vd.A05(r2, r4, r1)
            if (r1 == 0) goto L_0x02e9
            X.0z4 r1 = r0.A02
            android.content.SharedPreferences r2 = X.C17890vO.A0B(r1)
            java.lang.String r1 = "first_party_migration_initiated"
            boolean r1 = r2.getBoolean(r1, r3)
            if (r1 == 0) goto L_0x02e9
            r5 = 5
            goto L_0x0285
        L_0x02e9:
            X.1Vu r1 = r0.A05
            X.0z4 r0 = r1.A02
            boolean r0 = r0.A2O()
            if (r0 == 0) goto L_0x02f6
            r1.A01()
        L_0x02f6:
            java.lang.String r1 = android.os.Environment.getExternalStorageState()
            java.lang.String r0 = "mounted"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0312
            java.lang.String r0 = "mounted_ro"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0312
            java.lang.String r0 = "restore>DetermineRestoreStateBackgroundTask/media-storage-unreachable"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r5 = 3
            goto L_0x0285
        L_0x0312:
            java.lang.String r0 = "restore>DetermineRestoreStateBackgroundTask/restore-from-backup"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r5 = 0
            goto L_0x0285
        L_0x031a:
            java.lang.String r0 = "restore>DetermineRestoreStateBackgroundTask/msg-store-is-healthy"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r5 = 4
            goto L_0x0285
        L_0x0322:
            java.lang.String r1 = "GoogleMigrateUtil/isImportRunning/no-bridge"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            r1 = 0
            goto L_0x027d
        L_0x032a:
            boolean r1 = r0 instanceof X.AnonymousClass9BE
            if (r1 == 0) goto L_0x033a
            X.9BE r0 = (X.AnonymousClass9BE) r0
            int r2 = r0.A01
            int r1 = r0.A00
            int r2 = java.lang.Math.max(r2, r1)
            goto L_0x1412
        L_0x033a:
            boolean r1 = r0 instanceof X.AnonymousClass9BY
            if (r1 == 0) goto L_0x0345
            X.9BY r0 = (X.AnonymousClass9BY) r0
            X.9NU r0 = r0.A0J()
            return r0
        L_0x0345:
            boolean r1 = r0 instanceof X.AnonymousClass9BU
            if (r1 == 0) goto L_0x039e
            X.9BU r0 = (X.AnonymousClass9BU) r0
            X.8Gc r1 = r0.A03
            X.1QR r7 = r1.A0T
            X.205 r1 = r0.A00
            java.lang.String r2 = r1.A01
            java.lang.String r1 = r0.A01
            android.util.Pair r0 = X.AnonymousClass1QR.A07(r2, r1)
            if (r0 != 0) goto L_0x0361
            r6 = 0
        L_0x035c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            return r0
        L_0x0361:
            X.1Cd r0 = r7.A03     // Catch:{ SQLiteDatabaseCorruptException -> 0x0394 }
            X.1au r5 = r0.A05()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0394 }
            android.util.Pair r0 = X.AnonymousClass1QR.A08(r2, r1)     // Catch:{ all -> 0x038a }
            r6 = 0
            if (r0 == 0) goto L_0x0386
            java.lang.Object r4 = r0.first     // Catch:{ all -> 0x038a }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x038a }
            java.lang.Object r3 = r0.second     // Catch:{ all -> 0x038a }
            java.lang.String[] r3 = (java.lang.String[]) r3     // Catch:{ all -> 0x038a }
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x038a }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x038a }
            java.lang.String r1 = "pay_transaction"
            java.lang.String r0 = "removeTransactionInfoByTransIdV2/DELETE_PAY_TRANSACTION"
            int r0 = r2.A04(r1, r4, r0, r3)     // Catch:{ all -> 0x038a }
            if (r0 <= 0) goto L_0x0386
            r6 = 1
        L_0x0386:
            r5.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0394 }
            goto L_0x035c
        L_0x038a:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x038f }
            goto L_0x0393
        L_0x038f:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0394 }
        L_0x0393:
            throw r1     // Catch:{ SQLiteDatabaseCorruptException -> 0x0394 }
        L_0x0394:
            r2 = move-exception
            X.1QE r1 = r7.A04
            java.lang.String r0 = "removeTransactionInfoByTransId"
            r1.A0A(r0, r2)
            r6 = 0
            goto L_0x035c
        L_0x039e:
            boolean r1 = r0 instanceof X.AnonymousClass9B0
            if (r1 == 0) goto L_0x03b6
            X.9B0 r0 = (X.AnonymousClass9B0) r0
            X.1QR r4 = r0.A01
            r3 = 0
            java.lang.Integer[] r2 = new java.lang.Integer[r3]
            r0 = 1
            java.lang.Integer[] r1 = new java.lang.Integer[r0]
            r0 = 300(0x12c, float:4.2E-43)
            X.C17880vN.A1T(r1, r0, r3)
            java.util.List r0 = r4.A0X(r2, r1, r3)
            return r0
        L_0x03b6:
            boolean r1 = r0 instanceof X.C177889Az
            if (r1 == 0) goto L_0x03d2
            X.9Az r0 = (X.C177889Az) r0
            java.lang.String r3 = r0.A00
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            r2 = 0
            if (r1 != 0) goto L_0x03d1
            X.8GL r0 = r0.A01
            X.1QS r0 = r0.A0G
            X.1QR r0 = X.AnonymousClass8BR.A0O(r0)
            X.AW0 r2 = X.AnonymousClass8BU.A0J(r0, r2, r3)
        L_0x03d1:
            return r2
        L_0x03d2:
            boolean r1 = r0 instanceof X.C177949Bf
            if (r1 == 0) goto L_0x0414
            X.9Bf r0 = (X.C177949Bf) r0
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            java.util.ArrayList r2 = X.AnonymousClass000.A13()
            boolean r1 = r0.A0B
            if (r1 == 0) goto L_0x0400
            X.9gq r3 = r0.A04
            r1 = 1
            r3.A04 = r1
            X.1QS r1 = r0.A03
            X.1QR r2 = X.AnonymousClass8BR.A0O(r1)
            java.util.ArrayList r3 = r2.A0T(r3)
            X.AnonymousClass1QS.A00(r1)
            int r1 = r0.A00
            java.util.ArrayList r2 = r2.A0S(r1)
        L_0x0400:
            boolean r1 = r0.A0A
            if (r1 == 0) goto L_0x040e
            X.1QS r0 = r0.A03
            X.1KH r0 = X.AnonymousClass8BR.A0R(r0)
            java.util.ArrayList r4 = r0.A0A()
        L_0x040e:
            X.9dm r0 = new X.9dm
            r0.<init>(r4, r3, r2)
            return r0
        L_0x0414:
            boolean r1 = r0 instanceof X.AnonymousClass9BB
            if (r1 == 0) goto L_0x04ff
            X.9BB r0 = (X.AnonymousClass9BB) r0
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            X.1M9 r1 = r0.A00
            r1.A0u(r3)
            X.1Qn r1 = r0.A01
            java.util.ArrayList r2 = r1.A02()
            X.9yE r1 = r0.A03
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x04f5
            java.util.List r7 = r1.A01
            X.C18070vi.A0X(r7)
            r8 = 1
            java.util.ArrayList r6 = X.AnonymousClass000.A13()
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0451
            X.1D6 r0 = X.AnonymousClass1D6.A01(r6, r7)
        L_0x0443:
            java.lang.Object r2 = r0.first
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r1 = r0.second
            java.util.List r1 = (java.util.List) r1
        L_0x044b:
            X.9bn r0 = new X.9bn
            r0.<init>(r2, r1)
            return r0
        L_0x0451:
            java.util.HashMap r4 = X.C17880vN.A11()
            java.util.Iterator r1 = r3.iterator()
        L_0x0459:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0463
            X.AnonymousClass8BY.A1M(r4, r1)
            goto L_0x0459
        L_0x0463:
            r2.size()
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            java.util.Iterator r9 = r2.iterator()
        L_0x046e:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x04b2
            java.lang.Object r1 = r9.next()
            X.21L r1 = (X.AnonymousClass21L) r1
            X.205 r0 = r1.A0v
            X.1BI r0 = r0.A00
            r3 = 0
            if (r0 == 0) goto L_0x0485
            java.lang.String r3 = r0.getRawString()
        L_0x0485:
            java.lang.Object r2 = r4.get(r3)
            if (r2 == 0) goto L_0x046e
            boolean r0 = r6.contains(r2)
            if (r0 != 0) goto L_0x046e
            X.AEt r0 = r1.A00
            if (r0 == 0) goto L_0x046e
            X.AEn r1 = r0.A02
            if (r1 == 0) goto L_0x046e
            int r0 = X.C20089A6r.A00(r1)
            if (r0 != r8) goto L_0x04a7
            java.lang.String r0 = r1.A08
            if (r0 != 0) goto L_0x04a7
            boolean r0 = r1.A09
            if (r0 == 0) goto L_0x046e
        L_0x04a7:
            java.lang.String r0 = java.lang.String.valueOf(r3)
            r5.add(r0)
            r6.add(r2)
            goto L_0x046e
        L_0x04b2:
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            int r1 = r6.size()
            r0 = 3
            if (r1 >= r0) goto L_0x04e9
            r3 = 0
            r2 = 0
        L_0x04bf:
            int r0 = r6.size()
            int r0 = r0 - r2
            int r0 = 3 - r0
            int r0 = X.C108955ca.A08(r7, r0)
            if (r3 >= r0) goto L_0x04e9
            java.lang.String r1 = X.C17880vN.A0w(r7, r3)
            X.1Dx r0 = com.whatsapp.jid.PhoneUserJid.Companion
            com.whatsapp.jid.PhoneUserJid r0 = X.C22951Dx.A01(r1)
            int r3 = r3 + 1
            java.lang.String r0 = r0.getRawString()
            boolean r0 = r5.contains(r0)
            if (r0 == 0) goto L_0x04e5
            int r2 = r2 + 1
            goto L_0x04bf
        L_0x04e5:
            r4.add(r1)
            goto L_0x04bf
        L_0x04e9:
            r6.size()
            r4.size()
            X.1D6 r0 = X.AnonymousClass1D6.A01(r6, r4)
            goto L_0x0443
        L_0x04f5:
            java.util.ArrayList r2 = X.AnonymousClass9RR.A00(r3, r2)
            java.util.ArrayList r1 = X.AnonymousClass000.A13()
            goto L_0x044b
        L_0x04ff:
            boolean r1 = r0 instanceof X.C177879Ay
            if (r1 == 0) goto L_0x051c
            X.9Ay r0 = (X.C177879Ay) r0
            java.lang.String r1 = r0.A00
            r0 = 0
            byte[] r2 = android.util.Base64.decode(r1, r0)
            X.C18070vi.A0X(r2)
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options
            r1.<init>()
            r0 = 1
            r1.inJustDecodeBounds = r0
            android.graphics.Bitmap r0 = X.C72473Md.A0E(r2)
            return r0
        L_0x051c:
            boolean r1 = r0 instanceof X.AnonymousClass9BA
            if (r1 == 0) goto L_0x063a
            X.9BA r0 = (X.AnonymousClass9BA) r0
            com.whatsapp.payments.ui.PaymentTransactionHistoryActivity r4 = r0.A03
            X.1BI r1 = r4.A07
            if (r1 != 0) goto L_0x062b
            boolean r1 = r4.A0Q
            r8 = 0
            r7 = 1
            if (r1 != 0) goto L_0x05e3
            X.18O r2 = r4.A06
            X.18R r1 = X.AnonymousClass18O.A0a
            boolean r1 = r2.A09(r1)
            if (r1 == 0) goto L_0x05e3
            X.9gq r2 = r4.A0X
            boolean r1 = r2.A03
            if (r1 != 0) goto L_0x054e
            boolean r1 = r2.A02
            if (r1 != 0) goto L_0x054e
            X.9RF r1 = r2.A00
            if (r1 != 0) goto L_0x054e
            boolean r1 = r2.A06
            if (r1 != 0) goto L_0x054e
            X.ADh r1 = r2.A01
            if (r1 == 0) goto L_0x05e3
        L_0x054e:
            r2.A05 = r8
            r2.A04 = r7
            X.1QS r1 = r4.A0A
            X.1QR r1 = X.AnonymousClass8BR.A0O(r1)
            java.util.ArrayList r7 = r1.A0T(r2)
        L_0x055c:
            java.util.ArrayList r6 = X.AnonymousClass000.A13()
            java.util.ArrayList r5 = r0.A02
            if (r5 == 0) goto L_0x05cb
            boolean r1 = r5.isEmpty()
            if (r1 != 0) goto L_0x05cb
            java.util.Iterator r9 = r7.iterator()
        L_0x056e:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x05be
            java.lang.Object r8 = r9.next()
            X.AW0 r8 = (X.AW0) r8
            X.00H r1 = r4.A0I
            X.2lL r1 = X.AnonymousClass8BR.A0N(r1)
            X.206 r1 = r1.A00(r8)
            if (r1 == 0) goto L_0x05c9
            java.lang.String r2 = r1.A0P()
        L_0x058a:
            X.0vb r1 = r4.A04
            r3 = 1
            boolean r1 = X.C20103A7h.A04(r1, r2, r5, r3)
            if (r1 != 0) goto L_0x05af
            X.1R2 r1 = r4.A0F
            java.lang.String r2 = r1.A0U(r8)
            X.0vb r1 = r4.A04
            boolean r1 = X.C20103A7h.A04(r1, r2, r5, r3)
            if (r1 != 0) goto L_0x05af
            X.1R2 r1 = r4.A0F
            java.lang.String r2 = r1.A0T(r8)
            X.0vb r1 = r4.A04
            boolean r1 = X.C20103A7h.A04(r1, r2, r5, r3)
            if (r1 == 0) goto L_0x05b2
        L_0x05af:
            r6.add(r8)
        L_0x05b2:
            boolean r1 = X.C108945cZ.A1T(r0)
            if (r1 == 0) goto L_0x056e
            r6.clear()
            r6.addAll(r7)
        L_0x05be:
            X.9pf r0 = r0.A01
            java.util.ArrayList r0 = r0.A02(r6)
            X.0yx r0 = X.AnonymousClass8BR.A0B(r6, r0)
            return r0
        L_0x05c9:
            r2 = 0
            goto L_0x058a
        L_0x05cb:
            r6.addAll(r7)
            r1 = 38
            X.C21486Akr.A01(r1, r6)
            boolean r1 = r4.A0R
            if (r1 != 0) goto L_0x05be
            boolean r1 = r4.A0N
            if (r1 != 0) goto L_0x05be
            X.10I r2 = r4.A05
            r1 = 40
            X.C21432Ajz.A00(r2, r0, r7, r1)
            goto L_0x05be
        L_0x05e3:
            boolean r1 = r4.A0P
            r5 = -1
            if (r1 == 0) goto L_0x0614
            java.lang.Integer[] r6 = new java.lang.Integer[r7]
            r1 = 40
            X.C17880vN.A1T(r6, r1, r8)
            boolean r3 = r4.A0O
            r1 = 2
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            if (r3 == 0) goto L_0x060c
            r1 = 20
            X.C17880vN.A1T(r2, r1, r8)
            r1 = 401(0x191, float:5.62E-43)
        L_0x05fd:
            X.C17880vN.A1T(r2, r1, r7)
            X.1QS r1 = r4.A0A
            X.1QR r1 = X.AnonymousClass8BR.A0O(r1)
            java.util.List r7 = r1.A0X(r2, r6, r5)
            goto L_0x055c
        L_0x060c:
            r1 = 417(0x1a1, float:5.84E-43)
            X.C17880vN.A1T(r2, r1, r8)
            r1 = 418(0x1a2, float:5.86E-43)
            goto L_0x05fd
        L_0x0614:
            boolean r3 = r4.A0Q
            X.1QS r1 = r4.A0A
            X.1QR r2 = X.AnonymousClass8BR.A0O(r1)
            if (r3 == 0) goto L_0x0624
            java.util.ArrayList r7 = r2.A0S(r5)
            goto L_0x055c
        L_0x0624:
            r1 = 0
            java.util.ArrayList r7 = X.AnonymousClass1QR.A0C(r2, r1, r5)
            goto L_0x055c
        L_0x062b:
            X.1QS r1 = r4.A0A
            X.1QR r3 = X.AnonymousClass8BR.A0O(r1)
            X.1BI r2 = r4.A07
            r1 = -1
            java.util.ArrayList r7 = X.AnonymousClass1QR.A0C(r3, r2, r1)
            goto L_0x055c
        L_0x063a:
            boolean r1 = r0 instanceof X.AnonymousClass9B9
            if (r1 == 0) goto L_0x0674
            X.9B9 r0 = (X.AnonymousClass9B9) r0
            X.1QS r6 = r0.A00
            X.1KH r1 = X.AnonymousClass8BR.A0R(r6)
            java.util.ArrayList r3 = r1.A0A()
            X.9YM r1 = r0.A02
            if (r1 == 0) goto L_0x1424
            com.whatsapp.payments.ui.IndiaUpiBankAccountDetailsActivity r1 = r1.A00
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            X.AEs r1 = r1.A04
            boolean r4 = X.C20063A5m.A01(r1)
            java.util.Iterator r3 = r3.iterator()
        L_0x065e:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x1423
            X.AEs r2 = X.AnonymousClass8BR.A0P(r3)
            if (r4 != 0) goto L_0x0670
            boolean r1 = X.C20063A5m.A01(r2)
            if (r1 != 0) goto L_0x065e
        L_0x0670:
            r5.add(r2)
            goto L_0x065e
        L_0x0674:
            boolean r1 = r0 instanceof X.C177759Al
            if (r1 == 0) goto L_0x06f4
            X.9Al r0 = (X.C177759Al) r0
            java.util.HashSet r7 = X.C17880vN.A12()
            com.whatsapp.payments.ui.PaymentGroupParticipantPickerActivity r6 = r0.A00
            X.1MZ r1 = r6.A07
            com.whatsapp.jid.GroupJid r2 = r6.A0A
            X.1MW r1 = r1.A08
            X.2tp r2 = r1.A0C(r2)
            int r1 = r2.A00
            if (r1 == 0) goto L_0x06ef
            java.util.Map r1 = r2.A08
            java.util.Collection r1 = r1.values()
            X.10f r1 = X.C199410f.copyOf((java.util.Collection) r1)
        L_0x0698:
            X.1IZ r8 = r1.iterator()
        L_0x069c:
            boolean r1 = r8.hasNext()
            r5 = 0
            if (r1 == 0) goto L_0x1453
            java.lang.Object r1 = r8.next()
            X.2sr r1 = (X.C63312sr) r1
            X.1M9 r2 = r6.A01
            com.whatsapp.jid.UserJid r1 = r1.A04
            X.1E7 r4 = r2.A0H(r1)
            boolean r1 = r7.contains(r4)
            if (r1 != 0) goto L_0x069c
            X.11S r1 = r6.A02
            boolean r1 = X.AnonymousClass3Ma.A1V(r1, r4)
            if (r1 != 0) goto L_0x069c
            com.whatsapp.jid.UserJid r3 = X.AnonymousClass3MZ.A0x(r4)
            boolean r1 = X.C22971Dz.A0T(r3)
            if (r1 == 0) goto L_0x06d3
            X.1Ln r1 = r6.A08
            X.1E1 r3 = (X.AnonymousClass1E1) r3
            com.whatsapp.jid.PhoneUserJid r3 = r1.A0D(r3)
            r4.A0J = r3
        L_0x06d3:
            if (r3 == 0) goto L_0x06e1
            X.1QS r1 = r6.A0C
            X.1KH r2 = X.AnonymousClass8BR.A0R(r1)
            X.1Ln r1 = r6.A08
            X.8pI r5 = X.C62862s7.A00(r1, r2, r3)
        L_0x06e1:
            java.util.ArrayList r2 = r6.A0N
            X.9bf r1 = new X.9bf
            r1.<init>(r4, r5)
            r2.add(r1)
            r7.add(r4)
            goto L_0x069c
        L_0x06ef:
            X.10f r1 = r2.A0B()
            goto L_0x0698
        L_0x06f4:
            boolean r1 = r0 instanceof X.C177869Ax
            if (r1 == 0) goto L_0x0741
            X.9Ax r0 = (X.C177869Ax) r0
            java.util.ArrayList r7 = X.AnonymousClass000.A13()
            java.util.HashSet r9 = X.C17880vN.A12()
            java.util.ArrayList r8 = r0.A00
            if (r8 == 0) goto L_0x1469
            boolean r1 = r8.isEmpty()
            if (r1 != 0) goto L_0x1469
            com.whatsapp.payments.ui.PaymentGroupParticipantPickerActivity r6 = r0.A01
            java.util.ArrayList r1 = r6.A0N
            java.util.Iterator r5 = r1.iterator()
        L_0x0714:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x0740
            java.lang.Object r4 = r5.next()
            X.9bf r4 = (X.C184879bf) r4
            X.1E7 r3 = r4.A00
            com.whatsapp.jid.Jid r2 = X.AnonymousClass1E7.A01(r3)
            X.1Me r1 = r6.A03
            boolean r1 = r1.A0l(r3, r8)
            if (r1 == 0) goto L_0x073a
            boolean r1 = r9.contains(r2)
            if (r1 != 0) goto L_0x073a
            r7.add(r4)
            r9.add(r2)
        L_0x073a:
            boolean r1 = X.C108945cZ.A1T(r0)
            if (r1 == 0) goto L_0x0714
        L_0x0740:
            return r7
        L_0x0741:
            boolean r1 = r0 instanceof X.AnonymousClass9B2
            if (r1 == 0) goto L_0x0752
            X.9B2 r0 = (X.AnonymousClass9B2) r0
            X.9mY r1 = r0.A00
            X.1QR r1 = r1.A02
            java.lang.String r0 = r0.A02
            X.AW0 r0 = r1.A0M(r0)
            return r0
        L_0x0752:
            boolean r1 = r0 instanceof X.C177859Aw
            if (r1 == 0) goto L_0x078c
            X.9Aw r0 = (X.C177859Aw) r0
            X.1QS r1 = r0.A01
            java.util.ArrayList r7 = X.AnonymousClass8BU.A0t(r1)
            int r1 = r7.size()
            r6 = 0
            if (r1 <= 0) goto L_0x078b
            r2 = 9
            X.Akk r1 = new X.Akk
            r1.<init>(r0, r2)
            java.util.Collections.sort(r7, r1)
            java.lang.Object r5 = X.AnonymousClass8BS.A0Y(r7)
            X.AEs r5 = (X.C20284AEs) r5
            X.8pb r0 = r5.A08
            if (r0 == 0) goto L_0x078b
            X.8pY r0 = (X.AnonymousClass8pY) r0
            long r3 = r0.A06
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x078b
            int r0 = r7.size()
            X.0yx r6 = X.AnonymousClass8BV.A08(r5, r0)
        L_0x078b:
            return r6
        L_0x078c:
            boolean r1 = r0 instanceof X.C177849Av
            if (r1 == 0) goto L_0x07a7
            X.9Av r0 = (X.C177849Av) r0
            X.1QS r0 = r0.A00
            java.util.ArrayList r1 = X.AnonymousClass8BU.A0t(r0)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x1471
            int r0 = X.A8e.A01(r1)
            java.lang.Object r0 = r1.get(r0)
            return r0
        L_0x07a7:
            boolean r1 = r0 instanceof X.AnonymousClass9B1
            if (r1 == 0) goto L_0x07b7
            X.9B1 r0 = (X.AnonymousClass9B1) r0
            X.1QR r2 = r0.A01
            int r1 = r0.A00
            r0 = 0
            java.util.ArrayList r0 = X.AnonymousClass1QR.A0C(r2, r0, r1)
            return r0
        L_0x07b7:
            boolean r1 = r0 instanceof X.C177939Be
            if (r1 == 0) goto L_0x07f0
            X.9Be r0 = (X.C177939Be) r0
            com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity r5 = r0.A02
            X.1QS r1 = r5.A0Q
            X.1KH r2 = X.AnonymousClass8BR.A0R(r1)
            com.whatsapp.jid.UserJid r6 = r0.A00
            X.1Ln r1 = r5.A09
            X.8pI r4 = X.C62862s7.A00(r1, r2, r6)
            boolean r1 = r4 instanceof X.AnonymousClass8pF
            r3 = 0
            if (r1 == 0) goto L_0x1473
            X.8pF r4 = (X.AnonymousClass8pF) r4
            if (r4 == 0) goto L_0x1473
            X.77e r1 = r4.A01
            boolean r1 = X.C20061A5k.A02(r1)
            if (r1 != 0) goto L_0x1473
            X.77e r1 = r4.A00
            boolean r1 = X.C20061A5k.A02(r1)
            if (r1 == 0) goto L_0x07ef
            r2 = 2
            X.AY9 r1 = new X.AY9
            r1.<init>(r5, r2)
            X.C177939Be.A00(r6, r1, r0)
        L_0x07ef:
            return r4
        L_0x07f0:
            boolean r1 = r0 instanceof X.AnonymousClass9BD
            if (r1 == 0) goto L_0x0800
            X.9BD r0 = (X.AnonymousClass9BD) r0
            int r2 = r0.A01
            int r1 = r0.A00
            int r2 = java.lang.Math.max(r2, r1)
            goto L_0x1488
        L_0x0800:
            boolean r1 = r0 instanceof X.C177839Au
            if (r1 == 0) goto L_0x0862
            X.9Au r0 = (X.C177839Au) r0
            X.91S r0 = r0.A00
            X.118 r15 = r0.A05
            X.1KB r14 = r0.A05
            X.190 r13 = r0.A03
            X.11S r12 = r0.A02
            X.10I r11 = r0.A05
            X.9ui r10 = r0.A04
            X.1OZ r21 = X.AnonymousClass8BT.A0M(r0)
            X.1ek r9 = r0.A0A
            X.A0B r8 = r0.A09
            X.1QD r7 = r0.A0Q
            X.1ex r6 = r0.A0N
            X.00H r1 = r0.A0E
            java.lang.Object r5 = r1.get()
            X.1QH r5 = (X.AnonymousClass1QH) r5
            X.00H r1 = r0.A0C
            java.lang.Object r4 = r1.get()
            X.AZC r4 = (X.AZC) r4
            X.1KG r3 = r0.A0M
            X.AZ6 r2 = r0.A0S
            X.1jG r24 = X.AnonymousClass8BT.A0S(r0)
            X.AXS r1 = r0.A0N
            X.BCB r0 = r0.A02
            X.9nB r16 = new X.9nB
            r31 = r4
            r32 = r8
            r33 = r9
            r34 = r11
            r27 = r7
            r28 = r6
            r29 = r5
            r30 = r2
            r23 = r0
            r25 = r10
            r26 = r3
            r22 = r1
            r20 = r15
            r19 = r12
            r18 = r14
            r17 = r13
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            return r16
        L_0x0862:
            boolean r1 = r0 instanceof X.C177749Ak
            if (r1 == 0) goto L_0x0871
            X.9Ak r0 = (X.C177749Ak) r0
            X.91R r0 = r0.A00
            X.1QS r0 = r0.A0Q
            java.util.ArrayList r0 = X.AnonymousClass8BU.A0t(r0)
            return r0
        L_0x0871:
            boolean r1 = r0 instanceof X.AnonymousClass9B8
            if (r1 == 0) goto L_0x08eb
            X.9B8 r0 = (X.AnonymousClass9B8) r0
            X.91R r1 = r0.A00
            com.whatsapp.payments.ui.widget.PaymentView r2 = r1.A4b()
            if (r2 == 0) goto L_0x0886
            X.77d r3 = r2.getStickerIfSelected()
            r2 = 1
            if (r3 != 0) goto L_0x0887
        L_0x0886:
            r2 = 0
        L_0x0887:
            if (r2 == 0) goto L_0x1499
            X.2ju r7 = r1.A0W
            com.whatsapp.payments.ui.widget.PaymentView r0 = r1.A0J
            if (r0 == 0) goto L_0x08e8
            X.77d r17 = r0.getStickerIfSelected()
        L_0x0893:
            X.C17960vV.A07(r17)
            X.34B r15 = r1.A09
            java.lang.String r4 = r1.A0W
            X.1BI r13 = r1.A0G
            X.C17960vV.A07(r13)
            com.whatsapp.jid.UserJid r14 = r1.A0J
            long r2 = r1.A02
            r5 = 0
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x08e5
            X.00H r0 = r1.A0d
            X.1W6 r0 = X.C17880vN.A0c(r0)
            long r2 = r1.A02
            X.1W2 r0 = r0.A01
            X.206 r16 = r0.A03(r2)
        L_0x08b7:
            com.whatsapp.payments.ui.widget.PaymentView r3 = r1.A0J
            if (r3 == 0) goto L_0x08e2
            java.lang.Integer r18 = r3.getStickerSendOrigin()
        L_0x08bf:
            X.1KN r9 = r1.A09
            X.1KJ r8 = r1.A06
            X.AEs r10 = r1.A0B
            X.8pf r11 = r1.A0P
            java.lang.String r2 = r1.A0r
            java.lang.String r0 = r1.A0s
            if (r3 == 0) goto L_0x08e0
            X.AEX r12 = r3.getPaymentBackground()
        L_0x08d1:
            boolean r22 = X.AnonymousClass8BT.A1X(r1)
            r19 = r4
            r20 = r2
            r21 = r0
            X.AW0 r0 = r7.A00(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return r0
        L_0x08e0:
            r12 = 0
            goto L_0x08d1
        L_0x08e2:
            r18 = 0
            goto L_0x08bf
        L_0x08e5:
            r16 = 0
            goto L_0x08b7
        L_0x08e8:
            r17 = 0
            goto L_0x0893
        L_0x08eb:
            boolean r1 = r0 instanceof X.C177689Ae
            if (r1 == 0) goto L_0x08fb
            X.9Ae r0 = (X.C177689Ae) r0
            com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity r0 = r0.A00
            com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity.A0x(r0)
            com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity.A0y(r0)
            r0 = 0
            return r0
        L_0x08fb:
            boolean r1 = r0 instanceof X.C177829At
            if (r1 == 0) goto L_0x0972
            X.9At r0 = (X.C177829At) r0
            com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity r0 = r0.A00
            X.9ui r1 = r0.A0B
            java.lang.String r2 = "upi-get-challenge"
            java.util.concurrent.CopyOnWriteArrayList r1 = r1.A07
            boolean r1 = r1.contains(r2)
            if (r1 != 0) goto L_0x0970
            X.AXS r1 = r0.A0N
            X.77e r1 = r1.A0E()
            java.lang.Object r1 = r1.A00
            if (r1 != 0) goto L_0x0970
            X.9ui r1 = r0.A0B
            r1.A01(r2)
            X.118 r15 = r0.A05
            X.1KB r13 = r0.A05
            X.190 r12 = r0.A03
            X.11S r14 = r0.A02
            X.10I r10 = r0.A05
            X.9ui r9 = r0.A0B
            X.1OZ r16 = X.AnonymousClass8BT.A0M(r0)
            X.1ek r8 = r0.A0J
            X.A0B r7 = r0.A0E
            X.1QD r6 = r0.A0Q
            X.1ex r5 = r0.A0N
            X.00H r1 = r0.A0N
            java.lang.Object r4 = r1.get()
            X.1QH r4 = (X.AnonymousClass1QH) r4
            X.00H r1 = r0.A0K
            java.lang.Object r3 = r1.get()
            X.AZC r3 = (X.AZC) r3
            X.1KG r2 = r0.A0M
            X.AZ6 r1 = r0.A0S
            X.1jG r19 = X.AnonymousClass8BT.A0S(r0)
            X.AXS r0 = r0.A0N
            X.BCB r18 = com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity.A0j
            X.9nB r11 = new X.9nB
            r26 = r3
            r27 = r7
            r28 = r8
            r29 = r10
            r22 = r6
            r23 = r5
            r24 = r4
            r25 = r1
            r20 = r9
            r21 = r2
            r17 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r11.A00()
        L_0x0970:
            r0 = 0
            return r0
        L_0x0972:
            boolean r1 = r0 instanceof X.C177739Aj
            if (r1 == 0) goto L_0x0992
            X.9Aj r0 = (X.C177739Aj) r0
            com.whatsapp.payments.ui.IndiaUpiCheckOrderDetailsActivity r0 = r0.A00
            X.Aa6 r0 = r0.A09
            X.8Gd r0 = r0.A06
            r2 = 0
            X.21K r0 = r0.A0V()
            if (r0 == 0) goto L_0x03d1
            X.AEt r0 = r0.BPK()
            if (r0 == 0) goto L_0x03d1
            X.AEn r0 = r0.A02
            if (r0 == 0) goto L_0x03d1
            java.util.List r2 = r0.A0N
            return r2
        L_0x0992:
            boolean r1 = r0 instanceof X.C177729Ai
            if (r1 == 0) goto L_0x09a1
            X.9Ai r0 = (X.C177729Ai) r0
            com.whatsapp.payments.ui.IndiaUpiChangePinActivity r0 = r0.A00
            X.1QS r0 = r0.A0Q
            java.util.ArrayList r0 = X.AnonymousClass8BU.A0t(r0)
            return r0
        L_0x09a1:
            boolean r1 = r0 instanceof X.C177819As
            if (r1 == 0) goto L_0x09c4
            X.9As r0 = (X.C177819As) r0
            X.1QS r0 = r0.A00
            java.util.ArrayList r1 = X.AnonymousClass8BU.A0t(r0)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x14f5
            int r0 = X.A8e.A01(r1)
            java.lang.Object r0 = r1.get(r0)
            X.AEs r0 = (X.C20284AEs) r0
            X.8pb r2 = r0.A08
            boolean r0 = r2 instanceof X.AnonymousClass8pS
            if (r0 == 0) goto L_0x14f5
            return r2
        L_0x09c4:
            boolean r1 = r0 instanceof X.AnonymousClass9BL
            if (r1 == 0) goto L_0x0a4a
            X.9BL r0 = (X.AnonymousClass9BL) r0
            com.whatsapp.payments.ui.BrazilPaymentActivity r1 = r0.A05
            com.whatsapp.payments.ui.widget.PaymentView r2 = r1.A4b()
            if (r2 == 0) goto L_0x09d9
            X.77d r3 = r2.getStickerIfSelected()
            r2 = 1
            if (r3 != 0) goto L_0x09da
        L_0x09d9:
            r2 = 0
        L_0x09da:
            java.lang.String r5 = "p2m"
            if (r2 == 0) goto L_0x14f7
            X.2ju r12 = r1.A0W
            com.whatsapp.payments.ui.widget.PaymentView r2 = r1.A0W
            if (r2 == 0) goto L_0x0a47
            X.77d r22 = r2.getStickerIfSelected()
        L_0x09e8:
            X.C17960vV.A07(r22)
            X.34B r4 = r0.A03
            r21 = 0
            if (r4 == 0) goto L_0x0a44
            X.2h4 r2 = r4.A0N
            java.lang.String r8 = r2.A0D
        L_0x09f5:
            X.1BI r7 = r1.A0G
            X.C17960vV.A07(r7)
            com.whatsapp.jid.UserJid r6 = r1.A0J
            long r2 = r1.A02
            r10 = 0
            int r9 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r9 == 0) goto L_0x0a12
            X.00H r2 = r1.A0d
            X.1W6 r9 = X.C17880vN.A0c(r2)
            long r2 = r1.A02
            X.1W2 r9 = r9.A01
            X.206 r21 = r9.A03(r2)
        L_0x0a12:
            com.whatsapp.payments.ui.widget.PaymentView r2 = r1.A0W
            if (r2 == 0) goto L_0x0a41
            java.lang.Integer r23 = r2.getStickerSendOrigin()
        L_0x0a1a:
            X.1KN r14 = r0.A01
            X.1KJ r13 = r0.A00
            X.AEs r15 = r0.A02
            X.8pe r2 = r0.A04
            java.lang.String r3 = r1.A0r
            java.lang.String r1 = r0.A07
            java.lang.String r0 = r0.A08
            boolean r27 = r5.equals(r0)
            r17 = 0
            r20 = r4
            r24 = r8
            r25 = r3
            r26 = r1
            r18 = r7
            r19 = r6
            r16 = r2
            X.AW0 r0 = r12.A00(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            return r0
        L_0x0a41:
            r23 = 0
            goto L_0x0a1a
        L_0x0a44:
            r8 = r21
            goto L_0x09f5
        L_0x0a47:
            r22 = 0
            goto L_0x09e8
        L_0x0a4a:
            boolean r1 = r0 instanceof X.AnonymousClass9B7
            if (r1 == 0) goto L_0x0b15
            X.9B7 r0 = (X.AnonymousClass9B7) r0
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            java.util.ArrayList r9 = r0.A01
            if (r9 == 0) goto L_0x0a5e
            boolean r1 = r9.isEmpty()
            if (r1 == 0) goto L_0x0a68
        L_0x0a5e:
            com.whatsapp.payments.onboarding.IndiaUpiBankPickerActivity r1 = r0.A03
            java.util.List r1 = r1.A0J
            if (r1 == 0) goto L_0x0a68
            r4.addAll(r1)
        L_0x0a67:
            return r4
        L_0x0a68:
            java.util.List r1 = r0.A02
            if (r1 == 0) goto L_0x0a67
            java.util.Iterator r16 = r1.iterator()
        L_0x0a70:
            boolean r1 = r16.hasNext()
            if (r1 == 0) goto L_0x0a67
            java.lang.Object r8 = r16.next()
            X.8pS r8 = (X.AnonymousClass8pS) r8
            X.77e r1 = r8.A01
            java.lang.Object r3 = X.AnonymousClass8BT.A0q(r1)
            java.lang.String r3 = (java.lang.String) r3
            com.whatsapp.payments.onboarding.IndiaUpiBankPickerActivity r5 = r0.A03
            X.0vb r2 = r5.A00
            r1 = 1
            boolean r1 = X.C20103A7h.A04(r2, r3, r9, r1)
            if (r1 != 0) goto L_0x0b04
            X.77e r1 = r8.A01
            java.lang.Object r2 = X.AnonymousClass8BT.A0q(r1)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = r0.A00
            X.0vb r5 = r5.A00
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            r12 = 0
            if (r1 != 0) goto L_0x0b0e
            java.util.regex.Pattern r1 = X.C20103A7h.A01
            java.util.regex.Matcher r2 = r1.matcher(r2)
            java.lang.String r1 = " "
            java.lang.String r11 = r2.replaceAll(r1)
            java.util.regex.Pattern r1 = X.AnonymousClass2W6.A00
            java.util.regex.Matcher r1 = r1.matcher(r11)
            boolean r1 = r1.find()
            r15 = r1 ^ 1
            if (r15 == 0) goto L_0x0ac0
            java.lang.String r11 = X.AnonymousClass1EG.A06(r11)
        L_0x0ac0:
            java.text.BreakIterator r10 = X.C20103A7h.A02(r5)
            r10.setText(r11)
            int r14 = r10.first()
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 != 0) goto L_0x0b01
            java.lang.String r1 = X.AnonymousClass1EG.A06(r3)
        L_0x0ad5:
            char[] r7 = r1.toCharArray()
            int r6 = r7.length
            r5 = 0
        L_0x0adb:
            if (r5 >= r6) goto L_0x0b04
            char r3 = r7[r5]
        L_0x0adf:
            int r13 = r10.next()
            r2 = r14
            r14 = r13
            r1 = -1
            if (r13 == r1) goto L_0x0b0e
            java.lang.String r2 = r11.substring(r2, r13)
            if (r15 != 0) goto L_0x0af2
            java.lang.String r2 = X.AnonymousClass1EG.A06(r2)
        L_0x0af2:
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L_0x0adf
            char r1 = r2.charAt(r12)
            if (r3 != r1) goto L_0x0adf
            int r5 = r5 + 1
            goto L_0x0adb
        L_0x0b01:
            java.lang.String r1 = ""
            goto L_0x0ad5
        L_0x0b04:
            r3 = 3
            r2 = 0
            X.9oQ r1 = new X.9oQ
            r1.<init>(r8, r2, r3)
            r4.add(r1)
        L_0x0b0e:
            boolean r1 = X.C108945cZ.A1T(r0)
            if (r1 == 0) goto L_0x0a70
            return r4
        L_0x0b15:
            boolean r1 = r0 instanceof X.C177809Ar
            if (r1 == 0) goto L_0x0b1e
            X.9Ar r0 = (X.C177809Ar) r0
            monitor-enter(r0)
            goto L_0x1513
        L_0x0b1e:
            boolean r1 = r0 instanceof X.C177699Af
            if (r1 == 0) goto L_0x0b3c
            X.9Af r0 = (X.C177699Af) r0
            X.A7B r4 = X.A7B.A00()
            X.11E r1 = r0.A00
            boolean r1 = r1.A09()
            if (r1 != 0) goto L_0x1521
            r0 = 6
            X.A7B r1 = new X.A7B
            r1.<init>((int) r0)
            r0 = 0
            X.0yx r0 = X.AnonymousClass8BR.A0B(r0, r1)
            return r0
        L_0x0b3c:
            boolean r1 = r0 instanceof X.AnonymousClass9BI
            if (r1 == 0) goto L_0x0b57
            X.9BI r0 = (X.AnonymousClass9BI) r0
            X.1QS r1 = r0.A04
            X.1QR r1 = X.AnonymousClass8BR.A0O(r1)
            java.lang.String r2 = r0.A06
            int r3 = r0.A01
            long r5 = r0.A02
            long r7 = r0.A03
            int r4 = r0.A00
            r1.A0a(r2, r3, r4, r5, r7)
            r0 = 0
            return r0
        L_0x0b57:
            boolean r1 = r0 instanceof X.AnonymousClass9B6
            if (r1 == 0) goto L_0x0b70
            X.9B6 r0 = (X.AnonymousClass9B6) r0
            X.AZC r2 = r0.A01
            java.lang.String r1 = r0.A03
            X.1ek r0 = r0.A02
            java.lang.String r0 = r0.A01()
            boolean r0 = r2.CDs(r1, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x0b70:
            boolean r1 = r0 instanceof X.AnonymousClass9BK
            if (r1 == 0) goto L_0x0b87
            X.9BK r0 = (X.AnonymousClass9BK) r0
            X.AZC r3 = r0.A03
            java.lang.String r2 = r0.A05
            X.1ek r1 = r0.A04
            java.lang.String r1 = r1.A01()
            boolean r0 = r0.A06
            java.lang.String r0 = r3.BOS(r2, r1, r0)
            return r0
        L_0x0b87:
            boolean r1 = r0 instanceof X.AnonymousClass9B5
            if (r1 == 0) goto L_0x0ba7
            X.9B5 r0 = (X.AnonymousClass9B5) r0
            X.AXb r0 = r0.A03
            X.1QS r0 = r0.A08
            java.util.ArrayList r1 = X.AnonymousClass8BU.A0t(r0)
            X.2tK r0 = X.C63572tK.A0F
            java.util.ArrayList r2 = X.C20284AEs.A04(r0, r1)
            int r1 = r2.size()
            r0 = 0
            if (r1 <= 0) goto L_0x0ba6
            java.lang.Object r0 = X.AnonymousClass8BS.A0Y(r2)
        L_0x0ba6:
            return r0
        L_0x0ba7:
            boolean r1 = r0 instanceof X.C177799Aq
            if (r1 == 0) goto L_0x0be1
            X.9Aq r0 = (X.C177799Aq) r0
            X.1QS r1 = r0.A01
            java.util.ArrayList r7 = X.AnonymousClass8BU.A0t(r1)
            int r1 = r7.size()
            r6 = 0
            if (r1 <= 0) goto L_0x078b
            r2 = 8
            X.Akk r1 = new X.Akk
            r1.<init>(r0, r2)
            java.util.Collections.sort(r7, r1)
            java.lang.Object r5 = X.AnonymousClass8BS.A0Y(r7)
            X.AEs r5 = (X.C20284AEs) r5
            X.8pb r0 = r5.A08
            if (r0 == 0) goto L_0x078b
            X.8pY r0 = (X.AnonymousClass8pY) r0
            long r3 = r0.A06
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x078b
            int r0 = r7.size()
            X.0yx r6 = X.AnonymousClass8BV.A08(r5, r0)
            return r6
        L_0x0be1:
            boolean r1 = r0 instanceof X.AnonymousClass9BH
            if (r1 == 0) goto L_0x0c13
            X.9BH r0 = (X.AnonymousClass9BH) r0
            java.lang.String r4 = "PAY: ShareImageTask cannot process image for sharing"
            java.lang.String r1 = "PAY: ShareImageTask start share image background job"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            java.lang.String r1 = "android.intent.action.SEND"
            android.content.Intent r7 = X.C108945cZ.A0G(r1)
            java.lang.String r1 = "image/*"
            r7.setType(r1)
            X.17r r2 = r0.A04
            java.lang.String r1 = "share_image.jpg"
            java.io.File r2 = r2.A0a(r1)
            java.lang.ref.WeakReference r1 = r0.A06
            java.lang.Object r1 = r1.get()
            android.content.Context r1 = (android.content.Context) r1
            android.net.Uri r6 = X.C64062u9.A02(r1, r2)
            X.C18070vi.A0X(r6)
            r5 = 0
            goto L_0x15d0
        L_0x0c13:
            boolean r1 = r0 instanceof X.AnonymousClass9BZ
            if (r1 == 0) goto L_0x0c33
            X.9BZ r0 = (X.AnonymousClass9BZ) r0
            long r6 = android.os.SystemClock.elapsedRealtime()
            X.12M r4 = r0.A03
            X.1EC r3 = r0.A04
            com.whatsapp.jid.UserJid r1 = r0.A05
            java.util.List r2 = X.C18070vi.A0M(r1)
            X.9Xf r1 = new X.9Xf
            r1.<init>(r0)
            X.5qs r3 = r4.A08(r1, r3, r2)
            r5 = 0
            goto L_0x162d
        L_0x0c33:
            boolean r1 = r0 instanceof X.AnonymousClass9BN
            if (r1 == 0) goto L_0x0cb5
            X.9BN r0 = (X.AnonymousClass9BN) r0
            long r12 = android.os.SystemClock.elapsedRealtime()
            X.12M r8 = r0.A04
            X.1EC r10 = r0.A05
            java.util.List r9 = r0.A08
            java.util.List r5 = r0.A07
            r4 = 0
            X.9XY r7 = new X.9XY
            r7.<init>(r0)
            X.00H r6 = r8.A0A
            java.lang.String r3 = X.C17890vO.A0T(r6)
            java.util.ArrayList r2 = X.AnonymousClass000.A13()
            boolean r1 = r9.isEmpty()
            if (r1 != 0) goto L_0x0c64
            java.lang.String r1 = "promote"
            X.1ca r1 = X.AnonymousClass12M.A00(r1, r9)
            r2.add(r1)
        L_0x0c64:
            boolean r1 = r5.isEmpty()
            if (r1 != 0) goto L_0x0c73
            java.lang.String r1 = "demote"
            X.1ca r1 = X.AnonymousClass12M.A00(r1, r5)
            r2.add(r1)
        L_0x0c73:
            r11 = 0
            X.1ca[] r2 = X.C17890vO.A1Y(r2, r11)
            java.lang.String r1 = "admin"
            X.1ca r9 = X.AnonymousClass8BR.A0l(r1, r4, r2)
            r1 = 4
            X.1MD[] r5 = new X.AnonymousClass1MD[r1]
            java.lang.String r1 = "id"
            X.C17880vN.A1Q(r1, r3, r5, r11)
            java.lang.String r2 = "xmlns"
            java.lang.String r1 = "w:g2"
            X.AnonymousClass8BV.A1N(r2, r1, r5)
            java.lang.String r2 = "type"
            java.lang.String r1 = "set"
            X.C17890vO.A12(r2, r1, r5)
            X.1ca r16 = X.C29621ca.A00(r10, r9, r5)
            X.5qs r5 = new X.5qs
            r5.<init>()
            r1 = 9
            X.Acl r15 = new X.Acl
            r15.<init>(r5, r8, r7, r1)
            X.1OZ r14 = X.C17880vN.A0U(r6)
            r18 = 166(0xa6, float:2.33E-43)
            r1 = 32000(0x7d00, double:1.581E-319)
            r17 = r3
            r19 = r1
            r14.A0I(r15, r16, r17, r18, r19)
            goto L_0x1650
        L_0x0cb5:
            boolean r1 = r0 instanceof X.C177789Ap
            if (r1 == 0) goto L_0x0cd8
            X.9Ap r0 = (X.C177789Ap) r0
            java.lang.String r5 = "GraphApiACSNetworkRequest/TimeoutTask/doInBackground: Error while generating or parsing the JSON: "
            r1 = 7
            X.Aik r3 = new X.Aik
            r3.<init>(r0, r1)
            java.lang.String r2 = "MAIN_CHECK"
            X.10v r1 = new X.10v
            r1.<init>(r3, r2)
            r0.A00 = r1
            r1.start()
            X.9eh r2 = new X.9eh
            r2.<init>()
            r4 = 1
            r3 = 0
            goto L_0x1002
        L_0x0cd8:
            boolean r1 = r0 instanceof X.AnonymousClass48s
            if (r1 == 0) goto L_0x0d00
            X.48s r0 = (X.AnonymousClass48s) r0
            X.1Me r3 = r0.A07
            X.1E7 r5 = r0.A08
            java.lang.String r2 = r3.A0I(r5)
            r1 = -1
            boolean r1 = r3.A0j(r5, r1)
            if (r1 == 0) goto L_0x0cfb
            java.lang.String r1 = r5.A0c
            if (r1 == 0) goto L_0x0cfb
            int r1 = r1.length()
            if (r1 == 0) goto L_0x0cfb
            java.lang.String r2 = r3.A0Q(r5)
        L_0x0cfb:
            r0.A01 = r2
            r1 = 0
            goto L_0x1679
        L_0x0d00:
            boolean r1 = r0 instanceof X.AnonymousClass9BO
            if (r1 == 0) goto L_0x0e62
            X.9BO r0 = (X.AnonymousClass9BO) r0
            java.lang.String r10 = r0.A09
            X.1Kj r9 = r0.A06
            r9.A02()
            X.9uk r6 = r0.A03
            r7 = 0
            java.lang.String r2 = r6.A06()
            boolean r1 = r6.A08()
            if (r1 == 0) goto L_0x0d1b
            r7 = r2
        L_0x0d1b:
            r5 = 1
            r8 = 0
            r11 = 1
        L_0x0d1e:
            int r1 = r6.A00
            if (r8 >= r1) goto L_0x0ddd
            r12 = 0
            java.lang.String r4 = "FetchAssetAsyncTask: "
            r1 = 14
            android.net.TrafficStats.setThreadStatsTag(r1)
            X.1D9 r2 = r0.A04     // Catch:{ Exception -> 0x0dce }
            X.18j r1 = r0.A05     // Catch:{ Exception -> 0x0dce }
            X.AUZ r3 = r2.A05(r12, r1, r10, r7)     // Catch:{ Exception -> 0x0dce }
            java.net.HttpURLConnection r2 = r3.A01     // Catch:{ all -> 0x0dc4 }
            int r11 = r2.getResponseCode()     // Catch:{ all -> 0x0dc4 }
            r1 = 304(0x130, float:4.26E-43)
            if (r11 != r1) goto L_0x0d40
            r6.A03()     // Catch:{ all -> 0x0dc4 }
            goto L_0x0da7
        L_0x0d40:
            int r11 = r2.getResponseCode()     // Catch:{ all -> 0x0dc4 }
            r1 = 200(0xc8, float:2.8E-43)
            if (r11 == r1) goto L_0x0d50
            r2.getResponseCode()     // Catch:{ all -> 0x0dc4 }
            r3.close()     // Catch:{ Exception -> 0x0dce }
            goto L_0x0dd8
        L_0x0d50:
            X.181 r11 = r0.A01     // Catch:{ all -> 0x0dc4 }
            java.lang.Integer r1 = r0.A07     // Catch:{ all -> 0x0dc4 }
            X.9Hb r13 = r3.BMP(r11, r12, r1)     // Catch:{ all -> 0x0dc4 }
            java.lang.String r1 = "signature"
            java.lang.String r11 = r2.getHeaderField(r1)     // Catch:{ all -> 0x0dba }
            byte[] r12 = X.AnonymousClass1EY.A04(r13)     // Catch:{ all -> 0x0dba }
            java.util.Map r1 = r0.A0A     // Catch:{ all -> 0x0dba }
            boolean r1 = r6.A0A(r11, r1, r12)     // Catch:{ all -> 0x0dba }
            if (r1 != 0) goto L_0x0d72
            r13.close()     // Catch:{ all -> 0x0dc4 }
            r3.close()     // Catch:{ Exception -> 0x0dce }
            goto L_0x0e09
        L_0x0d72:
            java.lang.String r1 = "Is-Encrypted"
            r2.getHeaderField(r1)     // Catch:{ all -> 0x0dba }
            java.io.ByteArrayInputStream r11 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x0dba }
            r11.<init>(r12)     // Catch:{ all -> 0x0dba }
            java.lang.Object r1 = r0.A08     // Catch:{ all -> 0x0dba }
            boolean r1 = r6.A09(r11, r1)     // Catch:{ all -> 0x0dba }
            if (r1 == 0) goto L_0x0daf
            boolean r1 = r6 instanceof X.C170628qP     // Catch:{ all -> 0x0dba }
            if (r1 != 0) goto L_0x0d8d
            boolean r1 = r6 instanceof X.C170648qR     // Catch:{ all -> 0x0dba }
            if (r1 != 0) goto L_0x0d8d
            goto L_0x0d8f
        L_0x0d8d:
            r1 = 1
            goto L_0x0d90
        L_0x0d8f:
            r1 = 0
        L_0x0d90:
            if (r1 == 0) goto L_0x0da4
            r6.A03()     // Catch:{ all -> 0x0dba }
            java.lang.String r1 = "etag"
            java.lang.String r2 = r2.getHeaderField(r1)     // Catch:{ all -> 0x0dba }
            boolean r1 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0dba }
            if (r1 != 0) goto L_0x0da4
            r6.A07(r2)     // Catch:{ all -> 0x0dba }
        L_0x0da4:
            r13.close()     // Catch:{ all -> 0x0dc4 }
        L_0x0da7:
            r3.close()     // Catch:{ Exception -> 0x0dce }
            android.net.TrafficStats.clearThreadStatsTag()
            r11 = 0
            goto L_0x0e0d
        L_0x0daf:
            r13.close()     // Catch:{ all -> 0x0dc4 }
            r3.close()     // Catch:{ Exception -> 0x0dce }
            android.net.TrafficStats.clearThreadStatsTag()
            r11 = 4
            goto L_0x0e0d
        L_0x0dba:
            r2 = move-exception
            r13.close()     // Catch:{ all -> 0x0dbf }
            goto L_0x0dc3
        L_0x0dbf:
            r1 = move-exception
            X.AnonymousClass0DT.A00(r2, r1)     // Catch:{ all -> 0x0dc4 }
        L_0x0dc3:
            throw r2     // Catch:{ all -> 0x0dc4 }
        L_0x0dc4:
            r2 = move-exception
            r3.close()     // Catch:{ all -> 0x0dc9 }
            goto L_0x0dcd
        L_0x0dc9:
            r1 = move-exception
            X.AnonymousClass0DT.A00(r2, r1)     // Catch:{ Exception -> 0x0dce }
        L_0x0dcd:
            throw r2     // Catch:{ Exception -> 0x0dce }
        L_0x0dce:
            r3 = move-exception
            java.lang.String r2 = " Exception: "
            java.lang.StringBuilder r1 = X.AnonymousClass8BW.A0o(r4, r10)     // Catch:{ all -> 0x1729 }
            X.C17900vP.A0X(r3, r2, r1)     // Catch:{ all -> 0x1729 }
        L_0x0dd8:
            android.net.TrafficStats.clearThreadStatsTag()
            r11 = 1
            goto L_0x0e0d
        L_0x0ddd:
            boolean r0 = r6 instanceof X.C170648qR
            if (r0 == 0) goto L_0x0e43
            X.8qR r6 = (X.C170648qR) r6
            X.8rK r4 = X.C170648qR.A00(r6)
            r6.A00 = r4
            java.lang.Boolean r0 = X.AnonymousClass000.A0h()
            r4.A00 = r0
            X.11P r0 = r6.A06
            long r2 = X.AnonymousClass11P.A01(r0)
            java.lang.Long r0 = r6.A01
            long r0 = r0.longValue()
            java.lang.Long r0 = X.C108945cZ.A1B(r2, r0)
            r4.A04 = r0
            X.18K r1 = r6.A0B
            X.8rK r0 = r6.A00
            r1.CC7(r0)
            goto L_0x0e43
        L_0x0e09:
            android.net.TrafficStats.clearThreadStatsTag()
            r11 = 2
        L_0x0e0d:
            if (r11 != 0) goto L_0x0e48
            boolean r0 = r6 instanceof X.C170648qR
            if (r0 == 0) goto L_0x0e41
            r7 = r6
            X.8qR r7 = (X.C170648qR) r7
            X.8rK r4 = X.C170648qR.A00(r7)
            r7.A00 = r4
            java.lang.Boolean r0 = X.AnonymousClass000.A0i()
            r4.A00 = r0
            java.lang.Long r0 = X.C17880vN.A0n(r8)
            r4.A03 = r0
            X.11P r0 = r7.A06
            long r2 = X.AnonymousClass11P.A01(r0)
            java.lang.Long r0 = r7.A01
            long r0 = r0.longValue()
            java.lang.Long r0 = X.C108945cZ.A1B(r2, r0)
            r4.A04 = r0
            X.18K r1 = r7.A0B
            X.8rK r0 = r7.A00
            r1.CC7(r0)
        L_0x0e41:
            r6.A08 = r5
        L_0x0e43:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            return r0
        L_0x0e48:
            int r1 = r6.A01
            if (r8 != r1) goto L_0x0e4f
            r0.A00 = r5
            goto L_0x0e43
        L_0x0e4f:
            int r1 = r6.A00
            int r1 = r1 - r5
            if (r8 >= r1) goto L_0x0e5e
            long r3 = r9.A01()     // Catch:{ InterruptedException -> 0x0e5e }
            r1 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r1
            java.lang.Thread.sleep(r3)     // Catch:{ InterruptedException -> 0x0e5e }
        L_0x0e5e:
            int r8 = r8 + 1
            goto L_0x0d1e
        L_0x0e62:
            boolean r1 = r0 instanceof X.AnonymousClass9B4
            if (r1 == 0) goto L_0x0e73
            X.9B4 r0 = (X.AnonymousClass9B4) r0
            X.1KH r2 = r0.A01
            com.whatsapp.jid.UserJid r1 = r0.A02
            X.1Ln r0 = r0.A00
            X.8pI r0 = X.C62862s7.A00(r0, r2, r1)
            return r0
        L_0x0e73:
            boolean r1 = r0 instanceof X.AnonymousClass8p0
            if (r1 == 0) goto L_0x0e89
            X.8p0 r0 = (X.AnonymousClass8p0) r0
            X.A5I r0 = r0.A00
            X.1KH r6 = r0.A01
            boolean r5 = r6.A0I()
            X.2Di r0 = r6.A00
            X.1au r4 = r0.A06()
            goto L_0x172e
        L_0x0e89:
            boolean r1 = r0 instanceof X.AnonymousClass8p2
            if (r1 == 0) goto L_0x0eb8
            X.8p2 r0 = (X.AnonymousClass8p2) r0
            X.8pI r4 = r0.A02
            com.whatsapp.jid.UserJid r3 = r4.A03
            if (r3 == 0) goto L_0x0ea9
            X.A5I r1 = r0.A00
            X.1KH r2 = r1.A01
            X.1Ln r1 = r0.A01
            X.8pI r2 = X.C62862s7.A00(r1, r2, r3)
            if (r2 == 0) goto L_0x0ea9
            X.9xL r1 = r2.A01
            r4.A01 = r1
            X.76o r1 = r2.A02
            r4.A02 = r1
        L_0x0ea9:
            X.A5I r1 = r0.A00
            X.1KH r1 = r1.A01
            X.1Ln r0 = r0.A01
            boolean r0 = X.C62862s7.A01(r0, r4, r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x0eb8:
            boolean r1 = r0 instanceof X.AnonymousClass8p1
            if (r1 == 0) goto L_0x0ecd
            X.8p1 r0 = (X.AnonymousClass8p1) r0
            X.A5I r1 = r0.A00
            X.1QR r1 = r1.A00
            java.util.List r0 = r0.A01
            boolean r0 = r1.A0g(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x0ecd:
            boolean r1 = r0 instanceof X.C170258oz
            if (r1 == 0) goto L_0x0efe
            X.8oz r0 = (X.C170258oz) r0
            X.1KH r1 = r0.A00
            java.util.ArrayList r5 = r1.A0A()
            java.util.Iterator r4 = r5.iterator()
        L_0x0edd:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0fd0
            X.AEs r3 = X.AnonymousClass8BR.A0P(r4)
            java.lang.String r2 = r0.A02
            java.lang.String r1 = r3.A0A
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0edd
            X.9YH r1 = r0.A01
            int r2 = r1.A00
            X.8pb r1 = r3.A08
            X.8pY r1 = (X.AnonymousClass8pY) r1
            if (r1 == 0) goto L_0x0edd
            r1.A04 = r2
            goto L_0x0edd
        L_0x0efe:
            boolean r1 = r0 instanceof X.C170238ox
            if (r1 == 0) goto L_0x0f0d
            X.8ox r0 = (X.C170238ox) r0
            java.util.List r2 = r0.A00
            java.lang.String r1 = "p2p_context"
            X.9ax r0 = r0.A0J(r1, r2)
            return r0
        L_0x0f0d:
            boolean r1 = r0 instanceof X.C170248oy
            if (r1 == 0) goto L_0x0f37
            X.8oy r0 = (X.C170248oy) r0
            X.1KH r1 = r0.A00
            java.util.ArrayList r1 = r1.A0A()
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            java.util.Iterator r3 = r1.iterator()
        L_0x0f21:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x178c
            java.lang.Object r2 = r3.next()
            java.util.Set r1 = r0.A02
            boolean r1 = r1.contains(r2)
            if (r1 != 0) goto L_0x0f21
            r4.add(r2)
            goto L_0x0f21
        L_0x0f37:
            boolean r1 = r0 instanceof X.C170228ow
            if (r1 == 0) goto L_0x0f50
            X.8ow r0 = (X.C170228ow) r0
            X.A5I r0 = r0.A00
            X.1KH r0 = r0.A01
            boolean r2 = r0.A0I()
            r0 = 0
            java.util.ArrayList r1 = X.C17880vN.A0z(r0)
            X.9ax r0 = new X.9ax
            r0.<init>(r1, r2)
            return r0
        L_0x0f50:
            boolean r1 = r0 instanceof X.AnonymousClass9BS
            if (r1 == 0) goto L_0x0f58
            X.9BS r0 = (X.AnonymousClass9BS) r0
            goto L_0x17c1
        L_0x0f58:
            boolean r1 = r0 instanceof X.AnonymousClass9BF
            if (r1 == 0) goto L_0x0f71
            X.9BF r0 = (X.AnonymousClass9BF) r0
            java.lang.String r9 = "\r\n"
            java.lang.String r3 = "*****"
            java.io.File r8 = r0.A05
            boolean r1 = r8.exists()
            r2 = 0
            if (r1 != 0) goto L_0x17d5
            java.lang.String r0 = "GoogleReverseImageSearchAsyncTask/doInBackground invalid file to search"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r2
        L_0x0f71:
            boolean r1 = r0 instanceof X.AnonymousClass9BV
            if (r1 == 0) goto L_0x18dd
            X.9BV r0 = (X.AnonymousClass9BV) r0
            X.11E r1 = r0.A00
            boolean r1 = r1.A09()
            r4 = 0
            if (r1 != 0) goto L_0x0f87
            X.2rf r0 = X.C62602rf.A04
            android.util.Pair r6 = X.C108945cZ.A0N(r0, r4)
            return r6
        L_0x0f87:
            X.1OZ r3 = r0.A03     // Catch:{ 1oV -> 0x18d6 }
            r1 = 32000(0x7d00, double:1.581E-319)
            r3.A0E(r1)     // Catch:{ 1oV -> 0x18d6 }
            X.31f r3 = r0.A02
            X.2R1 r2 = X.AnonymousClass2R1.A0F
            java.util.List r1 = r0.A05
            android.util.Pair r1 = r3.A04(r2, r1)
            java.lang.Object r5 = r1.second
            X.9i3[] r5 = (X.C188829i3[]) r5
            java.lang.Object r2 = r1.first
            X.2rf r2 = (X.C62602rf) r2
            r4 = 0
            if (r5 == 0) goto L_0x0fce
            int r1 = r5.length
        L_0x0fa4:
            X.1E7[] r1 = new X.AnonymousClass1E7[r1]
            android.util.Pair r6 = X.C108945cZ.A0N(r2, r1)
            boolean r1 = r2.A01()
            if (r1 == 0) goto L_0x078b
            if (r5 == 0) goto L_0x078b
        L_0x0fb2:
            int r1 = r5.length
            if (r4 >= r1) goto L_0x078b
            r1 = r5[r4]
            if (r1 == 0) goto L_0x0fc9
            java.lang.Object r3 = r6.second
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            com.whatsapp.jid.UserJid r2 = r1.A0D
            if (r2 == 0) goto L_0x0fcc
            X.1M9 r1 = r0.A01
            X.1E7 r1 = r1.A0H(r2)
        L_0x0fc7:
            r3[r4] = r1
        L_0x0fc9:
            int r4 = r4 + 1
            goto L_0x0fb2
        L_0x0fcc:
            r1 = 0
            goto L_0x0fc7
        L_0x0fce:
            r1 = 0
            goto L_0x0fa4
        L_0x0fd0:
            java.lang.String r1 = "p2p_context"
            X.9ax r2 = r0.A0J(r1, r5)
            r6 = 1
            java.util.ArrayList r5 = X.C17880vN.A0z(r6)
            boolean r1 = r2.A01
            if (r1 == 0) goto L_0x03d1
            java.util.List r1 = r2.A00
            java.util.Iterator r4 = r1.iterator()
        L_0x0fe5:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0ffc
            X.AEs r3 = X.AnonymousClass8BR.A0P(r4)
            java.lang.String r2 = r0.A02
            java.lang.String r1 = r3.A0A
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0fe5
            r5.add(r3)
        L_0x0ffc:
            X.9ax r2 = new X.9ax
            r2.<init>(r5, r6)
            return r2
        L_0x1002:
            X.ALz r13 = r0.A01     // Catch:{ JSONException -> 0x10da, IOException -> 0x10f8, Exception -> 0x10c1 }
            X.9mx r12 = r13.A04     // Catch:{ JSONException -> 0x10da, IOException -> 0x10f8, Exception -> 0x10c1 }
            boolean r1 = r13 instanceof X.C172198t2     // Catch:{ JSONException -> 0x10da, IOException -> 0x10f8, Exception -> 0x10c1 }
            if (r1 == 0) goto L_0x100d
            r18 = 20
            goto L_0x100f
        L_0x100d:
            r18 = 19
        L_0x100f:
            org.json.JSONObject r17 = r13.A0C()     // Catch:{ JSONException -> 0x10da, IOException -> 0x10f8, Exception -> 0x10c1 }
            java.lang.String r14 = r13.A0A()     // Catch:{ JSONException -> 0x10da, IOException -> 0x10f8, Exception -> 0x10c1 }
            java.lang.String r15 = X.C197569wu.A0Q     // Catch:{ JSONException -> 0x10da, IOException -> 0x10f8, Exception -> 0x10c1 }
            if (r1 == 0) goto L_0x101e
            java.lang.String r16 = X.C197569wu.A07     // Catch:{ JSONException -> 0x10da, IOException -> 0x10f8, Exception -> 0x10c1 }
            goto L_0x1020
        L_0x101e:
            java.lang.String r16 = X.C197569wu.A09     // Catch:{ JSONException -> 0x10da, IOException -> 0x10f8, Exception -> 0x10c1 }
        L_0x1020:
            if (r1 == 0) goto L_0x1025
            r19 = 33
            goto L_0x1027
        L_0x1025:
            r19 = 19
        L_0x1027:
            X.9xl r10 = r12.A00(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ JSONException -> 0x10da, IOException -> 0x10f8, Exception -> 0x10c1 }
            X.A2b r6 = r13.A05     // Catch:{ JSONException -> 0x10da, IOException -> 0x10f8, Exception -> 0x10c1 }
            if (r6 == 0) goto L_0x104e
            java.lang.Integer r1 = r6.A00     // Catch:{ JSONException -> 0x10da, IOException -> 0x10f8, Exception -> 0x10c1 }
            java.lang.String r11 = "graphapi_request_end"
            if (r1 == 0) goto L_0x1058
            int r12 = r1.intValue()     // Catch:{ JSONException -> 0x10da, IOException -> 0x10f8, Exception -> 0x10c1 }
            X.19T r9 = r6.A03     // Catch:{ JSONException -> 0x10da, IOException -> 0x10f8, Exception -> 0x10c1 }
            int r8 = r6.A02     // Catch:{ JSONException -> 0x10da, IOException -> 0x10f8, Exception -> 0x10c1 }
            java.lang.String r1 = r6.A01     // Catch:{ JSONException -> 0x10da, IOException -> 0x10f8, Exception -> 0x10c1 }
            if (r1 == 0) goto L_0x10bb
            java.lang.StringBuilder r7 = X.AnonymousClass000.A11(r1)     // Catch:{ JSONException -> 0x10da, IOException -> 0x10f8, Exception -> 0x10c1 }
            r1 = 95
            java.lang.String r1 = X.C17890vO.A0Z(r11, r7, r1)     // Catch:{ JSONException -> 0x10da, IOException -> 0x10f8, Exception -> 0x10c1 }
            r9.markerPoint((int) r8, (int) r12, (java.lang.String) r1)     // Catch:{ JSONException -> 0x10da, IOException -> 0x10f8, Exception -> 0x10c1 }
        L_0x104e:
            int r1 = r10.A01     // Catch:{ JSONException -> 0x10da, IOException -> 0x10f8, Exception -> 0x10c1 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)     // Catch:{ JSONException -> 0x10da, IOException -> 0x10f8, Exception -> 0x10c1 }
            r13.A0F(r2, r10)     // Catch:{ JSONException -> 0x10da, IOException -> 0x10f8, Exception -> 0x10c1 }
            goto L_0x106e
        L_0x1058:
            X.19T r9 = r6.A03     // Catch:{ JSONException -> 0x10da, IOException -> 0x10f8, Exception -> 0x10c1 }
            int r8 = r6.A02     // Catch:{ JSONException -> 0x10da, IOException -> 0x10f8, Exception -> 0x10c1 }
            java.lang.String r1 = r6.A01     // Catch:{ JSONException -> 0x10da, IOException -> 0x10f8, Exception -> 0x10c1 }
            if (r1 == 0) goto L_0x10bb
            java.lang.StringBuilder r7 = X.AnonymousClass000.A11(r1)     // Catch:{ JSONException -> 0x10da, IOException -> 0x10f8, Exception -> 0x10c1 }
            r1 = 95
            java.lang.String r1 = X.C17890vO.A0Z(r11, r7, r1)     // Catch:{ JSONException -> 0x10da, IOException -> 0x10f8, Exception -> 0x10c1 }
            r9.markerPoint(r8, r1)     // Catch:{ JSONException -> 0x10da, IOException -> 0x10f8, Exception -> 0x10c1 }
            goto L_0x104e
        L_0x106e:
            if (r6 == 0) goto L_0x108f
            java.lang.Integer r1 = r6.A00     // Catch:{ JSONException -> 0x10da, IOException -> 0x10f8, Exception -> 0x10c1 }
            java.lang.String r9 = "graphapi_response_parsing_success"
            if (r1 == 0) goto L_0x109e
            int r10 = r1.intValue()     // Catch:{ JSONException -> 0x10da, IOException -> 0x10f8, Exception -> 0x10c1 }
            X.19T r8 = r6.A03     // Catch:{ JSONException -> 0x10da, IOException -> 0x10f8, Exception -> 0x10c1 }
            int r7 = r6.A02     // Catch:{ JSONException -> 0x10da, IOException -> 0x10f8, Exception -> 0x10c1 }
            java.lang.String r1 = r6.A01     // Catch:{ JSONException -> 0x10da, IOException -> 0x10f8, Exception -> 0x10c1 }
            if (r1 == 0) goto L_0x10b4
            java.lang.StringBuilder r6 = X.AnonymousClass000.A11(r1)     // Catch:{ JSONException -> 0x10da, IOException -> 0x10f8, Exception -> 0x10c1 }
            r1 = 95
            java.lang.String r1 = X.C17890vO.A0Z(r9, r6, r1)     // Catch:{ JSONException -> 0x10da, IOException -> 0x10f8, Exception -> 0x10c1 }
            r8.markerPoint((int) r7, (int) r10, (java.lang.String) r1)     // Catch:{ JSONException -> 0x10da, IOException -> 0x10f8, Exception -> 0x10c1 }
        L_0x108f:
            java.lang.Thread r1 = r0.A00     // Catch:{ JSONException -> 0x10da, IOException -> 0x10f8, Exception -> 0x10c1 }
            boolean r1 = r1.isAlive()     // Catch:{ JSONException -> 0x10da, IOException -> 0x10f8, Exception -> 0x10c1 }
            if (r1 == 0) goto L_0x0221
            java.lang.Thread r1 = r0.A00     // Catch:{ JSONException -> 0x10da, IOException -> 0x10f8, Exception -> 0x10c1 }
            r1.interrupt()     // Catch:{ JSONException -> 0x10da, IOException -> 0x10f8, Exception -> 0x10c1 }
            goto L_0x1678
        L_0x109e:
            X.19T r8 = r6.A03     // Catch:{ JSONException -> 0x10da, IOException -> 0x10f8, Exception -> 0x10c1 }
            int r7 = r6.A02     // Catch:{ JSONException -> 0x10da, IOException -> 0x10f8, Exception -> 0x10c1 }
            java.lang.String r1 = r6.A01     // Catch:{ JSONException -> 0x10da, IOException -> 0x10f8, Exception -> 0x10c1 }
            if (r1 == 0) goto L_0x10b4
            java.lang.StringBuilder r6 = X.AnonymousClass000.A11(r1)     // Catch:{ JSONException -> 0x10da, IOException -> 0x10f8, Exception -> 0x10c1 }
            r1 = 95
            java.lang.String r1 = X.C17890vO.A0Z(r9, r6, r1)     // Catch:{ JSONException -> 0x10da, IOException -> 0x10f8, Exception -> 0x10c1 }
            r8.markerPoint(r7, r1)     // Catch:{ JSONException -> 0x10da, IOException -> 0x10f8, Exception -> 0x10c1 }
            goto L_0x108f
        L_0x10b4:
            java.lang.String r1 = "endpointName"
            X.C18070vi.A11(r1)     // Catch:{ JSONException -> 0x10da, IOException -> 0x10f8, Exception -> 0x10c1 }
            r1 = 0
            throw r1     // Catch:{ JSONException -> 0x10da, IOException -> 0x10f8, Exception -> 0x10c1 }
        L_0x10bb:
            java.lang.String r1 = "endpointName"
            X.C18070vi.A11(r1)     // Catch:{ JSONException -> 0x10da, IOException -> 0x10f8, Exception -> 0x10c1 }
            throw r3     // Catch:{ JSONException -> 0x10da, IOException -> 0x10f8, Exception -> 0x10c1 }
        L_0x10c1:
            r1 = move-exception
            X.ALz r0 = r0.A01
            java.lang.String r6 = X.C108955ca.A0x(r1)
            r0.A0G(r6)
            X.190 r0 = r0.A02
            X.AnonymousClass8BS.A17(r0, r5, r1, r4)
            java.lang.String r0 = "GraphApiACSNetworkRequest/TimeoutTask/doInBackground: generic error - "
            com.whatsapp.util.Log.e(r0, r1)
            r0 = 3
            r2.A00 = r0
            r0 = 6
            goto L_0x10f2
        L_0x10da:
            r1 = move-exception
            X.ALz r0 = r0.A01
            java.lang.String r6 = X.C108955ca.A0x(r1)
            r0.A0G(r6)
            X.190 r0 = r0.A02
            X.AnonymousClass8BS.A17(r0, r5, r1, r4)
            java.lang.String r0 = "GraphApiACSNetworkRequest/TimeoutTask/doInBackground: Error while generating or parsing the JSON"
            com.whatsapp.util.Log.e(r0, r1)
            r0 = 2
            r2.A00 = r0
            r0 = 7
        L_0x10f2:
            X.9lD r1 = new X.9lD
            r1.<init>(r3, r6, r0)
            goto L_0x1116
        L_0x10f8:
            r6 = move-exception
            X.ALz r1 = r0.A01
            java.lang.String r5 = X.C108955ca.A0x(r6)
            r1.A0G(r5)
            boolean r0 = X.C108945cZ.A1T(r0)
            if (r0 != 0) goto L_0x0221
            java.lang.String r0 = "GraphApiACSNetworkRequest/TimeoutTask/doInBackground failed"
            com.whatsapp.util.Log.e(r0, r6)
            r2.A00 = r4
            r0 = 8
            X.9lD r1 = new X.9lD
            r1.<init>(r3, r5, r0)
        L_0x1116:
            r2.A01 = r1
            return r2
        L_0x1119:
            X.0z4 r7 = r0.A02     // Catch:{ Exception -> 0x1255 }
            X.00H r6 = r7.A00     // Catch:{ Exception -> 0x1255 }
            android.content.SharedPreferences r1 = X.C17880vN.A0B(r6)     // Catch:{ Exception -> 0x1255 }
            java.lang.String r2 = "reg_attempts_verify_2fa"
            int r1 = r1.getInt(r2, r4)     // Catch:{ Exception -> 0x1255 }
            int r1 = r1 + 1
            X.C17900vP.A0M(r7, r2, r1)     // Catch:{ Exception -> 0x1255 }
            r2 = 2
            r4 = 0
            X.9zb r12 = new X.9zb     // Catch:{ Exception -> 0x1255 }
            r12.<init>(r1, r4)     // Catch:{ Exception -> 0x1255 }
            java.lang.String r10 = "Required value was null."
            if (r15 == 0) goto L_0x11e1
            X.00H r9 = r0.A05     // Catch:{ Exception -> 0x1255 }
            java.lang.Object r1 = r9.get()     // Catch:{ Exception -> 0x1255 }
            if (r1 == 0) goto L_0x11c9
            android.content.SharedPreferences r1 = X.C17880vN.A0B(r6)     // Catch:{ Exception -> 0x1255 }
            java.lang.String r8 = "pref_wfs_blob"
            java.lang.String r1 = r1.getString(r8, r4)     // Catch:{ Exception -> 0x1255 }
            if (r1 == 0) goto L_0x11c9
            java.lang.String r1 = r7.A0p()     // Catch:{ Exception -> 0x1255 }
            if (r1 == 0) goto L_0x11c9
            android.content.SharedPreferences r2 = X.C17880vN.A0B(r6)     // Catch:{ Exception -> 0x1255 }
            java.lang.String r1 = "pref_wfs_pw"
            java.lang.String r1 = r2.getString(r1, r4)     // Catch:{ Exception -> 0x1255 }
            if (r1 == 0) goto L_0x11c9
            android.content.SharedPreferences r1 = X.C17880vN.A0B(r6)     // Catch:{ Exception -> 0x1255 }
            java.lang.String r5 = "pref_wfs_id_sign"
            java.lang.String r1 = r1.getString(r5, r4)     // Catch:{ Exception -> 0x1255 }
            if (r1 == 0) goto L_0x11c9
            java.lang.Object r1 = r9.get()     // Catch:{ Exception -> 0x1255 }
            X.2iS r1 = (X.C57052iS) r1     // Catch:{ Exception -> 0x1255 }
            if (r1 == 0) goto L_0x11c3
            X.9nK r1 = r1.A00()     // Catch:{ Exception -> 0x1255 }
            if (r1 == 0) goto L_0x11c3
            java.lang.String r2 = "foa_authproof"
            android.content.SharedPreferences r1 = X.C17880vN.A0B(r6)     // Catch:{ Exception -> 0x1255 }
            java.lang.String r1 = r1.getString(r8, r4)     // Catch:{ Exception -> 0x1255 }
            X.C18070vi.A0z(r1, r3)     // Catch:{ Exception -> 0x1255 }
            X.1D6 r16 = X.AnonymousClass1D6.A01(r2, r1)     // Catch:{ Exception -> 0x1255 }
            java.lang.String r2 = "wa_ac_ent_id"
            java.lang.String r1 = r7.A0p()     // Catch:{ Exception -> 0x1255 }
            X.C18070vi.A0z(r1, r3)     // Catch:{ Exception -> 0x1255 }
            X.1D6 r17 = X.AnonymousClass1D6.A01(r2, r1)     // Catch:{ Exception -> 0x1255 }
            java.lang.String r2 = "id_ac_sign"
            android.content.SharedPreferences r1 = X.C17880vN.A0B(r6)     // Catch:{ Exception -> 0x1255 }
            java.lang.String r1 = r1.getString(r5, r4)     // Catch:{ Exception -> 0x1255 }
            X.C18070vi.A0z(r1, r3)     // Catch:{ Exception -> 0x1255 }
            X.1D6 r18 = X.AnonymousClass1D6.A01(r2, r1)     // Catch:{ Exception -> 0x1255 }
            X.2kw r1 = r0.A04     // Catch:{ Exception -> 0x1255 }
            java.lang.String r2 = r1.A00()     // Catch:{ Exception -> 0x1255 }
            if (r2 == 0) goto L_0x11b4
            java.lang.String r1 = "wa_ac_machine_id"
            X.1D6 r4 = X.AnonymousClass1D6.A01(r1, r2)     // Catch:{ Exception -> 0x1255 }
        L_0x11b4:
            X.A98 r11 = r0.A03     // Catch:{ Exception -> 0x1255 }
            java.lang.String r13 = r0.A06     // Catch:{ Exception -> 0x1255 }
            java.lang.String r14 = r0.A07     // Catch:{ Exception -> 0x1255 }
            r19 = r4
            X.9Na r1 = r11.A0O(r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ Exception -> 0x1255 }
            r0.A00 = r1     // Catch:{ Exception -> 0x1255 }
            goto L_0x120d
        L_0x11c3:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r10)     // Catch:{ Exception -> 0x1255 }
            goto L_0x1254
        L_0x11c9:
            X.A98 r3 = r0.A03     // Catch:{ Exception -> 0x1255 }
            java.lang.String r2 = r0.A06     // Catch:{ Exception -> 0x1255 }
            java.lang.String r1 = r0.A07     // Catch:{ Exception -> 0x1255 }
            r17 = r4
            r18 = r4
            r19 = r4
            r11 = r3
            r13 = r2
            r14 = r1
            r16 = r4
            X.9Na r1 = r11.A0O(r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ Exception -> 0x1255 }
            r0.A00 = r1     // Catch:{ Exception -> 0x1255 }
            goto L_0x120d
        L_0x11e1:
            r1 = 1
            if (r5 != r1) goto L_0x11e5
            goto L_0x11fa
        L_0x11e5:
            if (r5 != r2) goto L_0x120d
            X.A98 r11 = r0.A03     // Catch:{ Exception -> 0x1255 }
            java.lang.String r13 = r0.A06     // Catch:{ Exception -> 0x1255 }
            java.lang.String r14 = r0.A07     // Catch:{ Exception -> 0x1255 }
            java.lang.String r15 = "wipe"
            java.lang.String r1 = r0.A09     // Catch:{ Exception -> 0x1255 }
            r16 = r1
            X.9Na r1 = r11.A0N(r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x1255 }
            r0.A00 = r1     // Catch:{ Exception -> 0x1255 }
            goto L_0x120d
        L_0x11fa:
            X.A98 r3 = r0.A03     // Catch:{ Exception -> 0x1255 }
            java.lang.String r2 = r0.A06     // Catch:{ Exception -> 0x1255 }
            java.lang.String r1 = r0.A07     // Catch:{ Exception -> 0x1255 }
            java.lang.String r15 = "email"
            r11 = r3
            r13 = r2
            r14 = r1
            r16 = r4
            X.9Na r1 = r11.A0N(r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x1255 }
            r0.A00 = r1     // Catch:{ Exception -> 0x1255 }
        L_0x120d:
            X.9Na r2 = r0.A00     // Catch:{ Exception -> 0x1255 }
            if (r2 != 0) goto L_0x1219
            java.lang.String r0 = "SecurityCodeTask/doInBackground/null SecurityResult"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x1255 }
            X.9IN r0 = X.AnonymousClass9IN.ERROR_UNSPECIFIED     // Catch:{ Exception -> 0x1255 }
            return r0
        L_0x1219:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x1255 }
            java.lang.String r1 = "SecurityCodeTask/security entrypoint response//resetMethod="
            r3.append(r1)     // Catch:{ Exception -> 0x1255 }
            java.lang.String r1 = r2.A0B     // Catch:{ Exception -> 0x1255 }
            r3.append(r1)     // Catch:{ Exception -> 0x1255 }
            java.lang.String r1 = "/wipeWait="
            r3.append(r1)     // Catch:{ Exception -> 0x1255 }
            long r1 = r2.A02     // Catch:{ Exception -> 0x1255 }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ Exception -> 0x1255 }
            X.C17900vP.A0b(r1, r3)     // Catch:{ Exception -> 0x1255 }
            X.2kw r2 = r0.A04     // Catch:{ Exception -> 0x1255 }
            X.9Na r1 = r0.A00     // Catch:{ Exception -> 0x1255 }
            if (r1 == 0) goto L_0x124b
            java.lang.String r1 = r1.A08     // Catch:{ Exception -> 0x1255 }
            if (r1 != 0) goto L_0x1241
            java.lang.String r1 = ""
        L_0x1241:
            r2.A01(r1)     // Catch:{ Exception -> 0x1255 }
            X.9Na r0 = r0.A00     // Catch:{ Exception -> 0x1255 }
            if (r0 == 0) goto L_0x1250
            X.9IN r0 = r0.A03     // Catch:{ Exception -> 0x1255 }
            return r0
        L_0x124b:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r10)     // Catch:{ Exception -> 0x1255 }
            goto L_0x1254
        L_0x1250:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r10)     // Catch:{ Exception -> 0x1255 }
        L_0x1254:
            throw r0     // Catch:{ Exception -> 0x1255 }
        L_0x1255:
            r1 = move-exception
            java.lang.String r0 = "SecurityCodeTask/doInBackground/error "
            com.whatsapp.util.Log.e(r0, r1)
            X.9IN r0 = X.AnonymousClass9IN.ERROR_UNSPECIFIED
            return r0
        L_0x125e:
            X.A98 r4 = r0.A02     // Catch:{ Exception -> 0x13ba }
            boolean r10 = r0.A07     // Catch:{ Exception -> 0x13ba }
            java.lang.String r11 = r0.A05     // Catch:{ Exception -> 0x13ba }
            java.lang.String r12 = r0.A06     // Catch:{ Exception -> 0x13ba }
            java.lang.String r13 = r0.A04     // Catch:{ Exception -> 0x13ba }
            X.Ct9 r1 = r0.A03     // Catch:{ Exception -> 0x13ba }
            byte[] r15 = r1.A03()     // Catch:{ Exception -> 0x13ba }
            r6 = 2
            X.C18070vi.A0d(r11, r6)     // Catch:{ Exception -> 0x13ba }
            X.C108985cd.A1D(r12, r13)     // Catch:{ Exception -> 0x13ba }
            r9 = 0
            if (r15 != 0) goto L_0x127e
            java.lang.String r5 = "RegistrationHttpManager/makeAutoconfRequest/null clientCapabilities"
            com.whatsapp.util.Log.e((java.lang.String) r5)     // Catch:{ Exception -> 0x13ba }
            goto L_0x12c1
        L_0x127e:
            boolean r5 = r4.A0T()     // Catch:{ Exception -> 0x13ba }
            if (r5 == 0) goto L_0x12c1
            r8 = 1
            r4.A0S(r8)     // Catch:{ Exception -> 0x13ba }
            X.1D6[] r7 = new X.AnonymousClass1D6[r6]     // Catch:{ Exception -> 0x13ba }
            java.lang.String r5 = java.lang.String.valueOf(r2)     // Catch:{ Exception -> 0x13ba }
            java.nio.charset.Charset r9 = X.C26571Sq.A05     // Catch:{ Exception -> 0x13ba }
            byte[] r6 = X.C18070vi.A1A(r5, r9)     // Catch:{ Exception -> 0x13ba }
            java.lang.String r5 = "consent_shown"
            X.AnonymousClass1D6.A03(r5, r6, r7, r2)     // Catch:{ Exception -> 0x13ba }
            java.lang.String r5 = java.lang.String.valueOf(r10)     // Catch:{ Exception -> 0x13ba }
            byte[] r6 = X.C18070vi.A1A(r5, r9)     // Catch:{ Exception -> 0x13ba }
            java.lang.String r5 = "create_verifier"
            X.AnonymousClass1D6.A03(r5, r6, r7, r8)     // Catch:{ Exception -> 0x13ba }
            java.util.LinkedHashMap r14 = X.AnonymousClass1D7.A0C(r7)     // Catch:{ Exception -> 0x13ba }
            X.A98.A08(r4, r14)     // Catch:{ Exception -> 0x13ba }
            X.A98.A06(r4, r14)     // Catch:{ Exception -> 0x13ba }
            X.A7d r10 = X.A98.A00(r4)     // Catch:{ Exception -> 0x13ba }
            X.2bP r9 = r4.A09     // Catch:{ Exception -> 0x13ba }
            X.9CG r8 = new X.9CG     // Catch:{ Exception -> 0x13ba }
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x13ba }
            java.lang.Object r9 = X.C19951A0i.A00(r8)     // Catch:{ Exception -> 0x13ba }
            X.9ft r9 = (X.C187489ft) r9     // Catch:{ Exception -> 0x13ba }
        L_0x12c1:
            if (r9 != 0) goto L_0x12cd
            java.lang.String r0 = "AutoconfTask/doInBackground/null autoconfResult"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ Exception -> 0x13ba }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)     // Catch:{ Exception -> 0x13ba }
            return r0
        L_0x12cd:
            java.lang.StringBuilder r7 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x13ba }
            java.lang.String r5 = "AutoconfTask/autoconf entrypoint response/status="
            r7.append(r5)     // Catch:{ Exception -> 0x13ba }
            int r5 = r9.A04     // Catch:{ Exception -> 0x13ba }
            r7.append(r5)     // Catch:{ Exception -> 0x13ba }
            r7.append(r3)     // Catch:{ Exception -> 0x13ba }
            int r5 = r9.A00     // Catch:{ Exception -> 0x13ba }
            r7.append(r5)     // Catch:{ Exception -> 0x13ba }
            java.lang.String r5 = "/non-null registerStartMessage="
            r7.append(r5)     // Catch:{ Exception -> 0x13ba }
            java.lang.String r6 = r9.A03     // Catch:{ Exception -> 0x13ba }
            r5 = 1
            boolean r6 = X.AnonymousClass000.A1W(r6)
            X.C17900vP.A0r(r7, r6)     // Catch:{ Exception -> 0x13ba }
            boolean r6 = r0.A08     // Catch:{ Exception -> 0x13ba }
            int r7 = X.C72453Mb.A03(r6)
            int r8 = r0.A00     // Catch:{ Exception -> 0x13ba }
            java.lang.String r0 = r9.A03     // Catch:{ Exception -> 0x13ba }
            byte[] r14 = r1.A06(r0)     // Catch:{ Exception -> 0x13ba }
            r6 = 0
            if (r14 != 0) goto L_0x130a
            java.lang.String r0 = "RegistrationHttpManager/makeAutoconfVerifierRequest/null verifier"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ Exception -> 0x13ba }
            goto L_0x1390
        L_0x130a:
            boolean r0 = r4.A0T()     // Catch:{ Exception -> 0x13ba }
            if (r0 == 0) goto L_0x1390
            r4.A0S(r5)     // Catch:{ Exception -> 0x13ba }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x13ba }
            java.lang.String r0 = "RegistrationHttpManager/makeAutoconfVerifierRequest/codeEntryMethod="
            r1.append(r0)     // Catch:{ Exception -> 0x13ba }
            r1.append(r7)     // Catch:{ Exception -> 0x13ba }
            java.lang.String r0 = "/registrationMethod="
            X.C17900vP.A0j(r0, r1, r8)     // Catch:{ Exception -> 0x13ba }
            java.util.LinkedHashMap r6 = X.C17880vN.A13()     // Catch:{ Exception -> 0x13ba }
            X.0z4 r0 = r4.A07     // Catch:{ Exception -> 0x13ba }
            X.00H r10 = r0.A00     // Catch:{ Exception -> 0x13ba }
            android.content.SharedPreferences r1 = X.C17880vN.A0B(r10)     // Catch:{ Exception -> 0x13ba }
            java.lang.String r0 = "registration_code"
            java.lang.String r9 = X.C17880vN.A0r(r1, r0)     // Catch:{ Exception -> 0x13ba }
            if (r9 == 0) goto L_0x1353
            int r0 = r9.length()     // Catch:{ Exception -> 0x13ba }
            if (r0 == 0) goto L_0x1353
            android.content.SharedPreferences r1 = X.C17880vN.A0B(r10)     // Catch:{ Exception -> 0x13ba }
            java.lang.String r0 = "pref_autoconf_secure_verifier"
            boolean r0 = r1.getBoolean(r0, r2)     // Catch:{ Exception -> 0x13ba }
            if (r0 == 0) goto L_0x1353
            byte[] r1 = X.C108975cc.A1O(r9)     // Catch:{ Exception -> 0x13ba }
            java.lang.String r0 = "code"
            r6.put(r0, r1)     // Catch:{ Exception -> 0x13ba }
        L_0x1353:
            java.lang.String r0 = java.lang.String.valueOf(r7)     // Catch:{ Exception -> 0x13ba }
            java.nio.charset.Charset r7 = X.C26571Sq.A05     // Catch:{ Exception -> 0x13ba }
            byte[] r1 = X.C18070vi.A1A(r0, r7)     // Catch:{ Exception -> 0x13ba }
            java.lang.String r0 = "entered"
            r6.put(r0, r1)     // Catch:{ Exception -> 0x13ba }
            java.lang.String r0 = java.lang.String.valueOf(r8)     // Catch:{ Exception -> 0x13ba }
            byte[] r1 = X.C18070vi.A1A(r0, r7)     // Catch:{ Exception -> 0x13ba }
            java.lang.String r0 = "registration_method"
            r6.put(r0, r1)     // Catch:{ Exception -> 0x13ba }
            X.A98.A08(r4, r6)     // Catch:{ Exception -> 0x13ba }
            X.A98.A06(r4, r6)     // Catch:{ Exception -> 0x13ba }
            X.A7d r15 = X.A98.A00(r4)     // Catch:{ Exception -> 0x13ba }
            X.2bP r0 = r4.A09     // Catch:{ Exception -> 0x13ba }
            X.9CF r13 = new X.9CF     // Catch:{ Exception -> 0x13ba }
            r17 = r6
            r18 = r11
            r19 = r12
            r20 = r2
            r16 = r0
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)     // Catch:{ Exception -> 0x13ba }
            java.lang.Object r6 = X.C19951A0i.A00(r13)     // Catch:{ Exception -> 0x13ba }
            X.9sk r6 = (X.C195069sk) r6     // Catch:{ Exception -> 0x13ba }
        L_0x1390:
            if (r6 != 0) goto L_0x139c
            java.lang.String r0 = "AutoconfTask/doInBackground/null autoconfVerifierResult"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ Exception -> 0x13ba }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)     // Catch:{ Exception -> 0x13ba }
            return r0
        L_0x139c:
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x13ba }
            java.lang.String r0 = "AutoconfTask/autoconf_verifier entrypoint response/status="
            r4.append(r0)     // Catch:{ Exception -> 0x13ba }
            int r1 = r6.A03     // Catch:{ Exception -> 0x13ba }
            r4.append(r1)     // Catch:{ Exception -> 0x13ba }
            r4.append(r3)     // Catch:{ Exception -> 0x13ba }
            int r0 = r6.A00     // Catch:{ Exception -> 0x13ba }
            X.C17900vP.A0o(r4, r0)     // Catch:{ Exception -> 0x13ba }
            if (r1 == r5) goto L_0x13b5
            r5 = 0
        L_0x13b5:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)     // Catch:{ Exception -> 0x13ba }
            return r0
        L_0x13ba:
            r1 = move-exception
            java.lang.String r0 = "AutoconfTask/entrypoint call error: "
            com.whatsapp.util.Log.e(r0, r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        L_0x13c5:
            X.0z4 r5 = r0.A01     // Catch:{ Exception -> 0x13f6 }
            android.content.SharedPreferences r3 = X.C17890vO.A0B(r5)     // Catch:{ Exception -> 0x13f6 }
            r1 = 0
            java.lang.String r2 = "reg_attempts_check_exist"
            int r1 = r3.getInt(r2, r1)     // Catch:{ Exception -> 0x13f6 }
            int r1 = r1 + 1
            X.C17900vP.A0M(r5, r2, r1)     // Catch:{ Exception -> 0x13f6 }
            X.9zb r6 = new X.9zb     // Catch:{ Exception -> 0x13f6 }
            r6.<init>(r1, r4)     // Catch:{ Exception -> 0x13f6 }
            X.118 r1 = r0.A00     // Catch:{ Exception -> 0x13f6 }
            android.content.Context r2 = r1.A00     // Catch:{ Exception -> 0x13f6 }
            java.lang.String r8 = r0.A04     // Catch:{ Exception -> 0x13f6 }
            X.2qI r1 = X.C182119Td.A00     // Catch:{ Exception -> 0x13f6 }
            java.lang.String r9 = r1.A01(r2, r8)     // Catch:{ Exception -> 0x13f6 }
            X.A98 r5 = r0.A02     // Catch:{ Exception -> 0x13f6 }
            java.lang.String r7 = r0.A03     // Catch:{ Exception -> 0x13f6 }
            java.lang.String r10 = "-1"
            r13 = 1
            r12 = r4
            r11 = r4
            X.9yx r4 = r5.A0L(r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x13f6 }
            return r4
        L_0x13f6:
            r1 = move-exception
            java.lang.String r0 = "VerifyTwoFactorAuth/checkifexists/error"
            com.whatsapp.util.Log.e(r0, r1)
            return r4
        L_0x13fd:
            com.whatsapp.registration.EULA r0 = r0.A00     // Catch:{ Exception -> 0x140a }
            X.1mH r2 = r0.A0S     // Catch:{ Exception -> 0x140a }
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ Exception -> 0x140a }
            r0 = 10
            X.1mK r0 = r2.A01(r1, r0)     // Catch:{ Exception -> 0x140a }
            return r0
        L_0x140a:
            r1 = move-exception
            java.lang.String r0 = "EULA/exception while waiting on task killers thread to finish during onCreate "
            com.whatsapp.util.Log.w(r0, r1)
            r0 = 0
            return r0
        L_0x1412:
            X.1Sl r1 = r0.A03     // Catch:{ 1iX | IOException -> 0x141b }
            android.net.Uri r0 = r0.A02     // Catch:{ 1iX | IOException -> 0x141b }
            android.graphics.Bitmap r0 = r1.A0h(r0, r2, r2)     // Catch:{ 1iX | IOException -> 0x141b }
            return r0
        L_0x141b:
            r1 = move-exception
            java.lang.String r0 = "BaseQrActivity/loadImageRunnable Failed to load image"
            com.whatsapp.util.Log.e(r0, r1)
            r0 = 0
            return r0
        L_0x1423:
            r3 = r5
        L_0x1424:
            X.1QE r2 = r0.A01
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "#methods="
            X.C17890vO.A14(r0, r1, r3)
            X.AnonymousClass8BS.A19(r2, r1)
            int r0 = r3.size()
            r1 = 1
            if (r0 <= r1) goto L_0x1440
            r1 = 201(0xc9, float:2.82E-43)
        L_0x143b:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            return r0
        L_0x1440:
            X.1QR r0 = X.AnonymousClass8BR.A0O(r6)
            java.util.List r0 = r0.A0V(r1)
            int r0 = r0.size()
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 <= 0) goto L_0x143b
            r1 = 202(0xca, float:2.83E-43)
            goto L_0x143b
        L_0x1453:
            X.11S r3 = r6.A02
            X.1Me r2 = r6.A03
            r1 = 1
            X.4s0 r4 = new X.4s0
            r4.<init>(r3, r2, r1)
            java.util.ArrayList r3 = r6.A0N
            r2 = 5
            X.Akm r1 = new X.Akm
            r1.<init>(r0, r4, r2)
            java.util.Collections.sort(r3, r1)
            return r5
        L_0x1469:
            com.whatsapp.payments.ui.PaymentGroupParticipantPickerActivity r0 = r0.A01
            java.util.ArrayList r0 = r0.A0N
            r7.addAll(r0)
            return r7
        L_0x1471:
            r0 = 0
            return r0
        L_0x1473:
            r2 = 1
            X.AY9 r1 = new X.AY9
            r1.<init>(r5, r2)
            X.C177939Be.A00(r6, r1, r0)
            r5.A0d = r2
            r2 = 5
            X.Aju r1 = new X.Aju
            r1.<init>(r0, r2)
            r5.runOnUiThread(r1)
            return r3
        L_0x1488:
            X.1Sl r1 = r0.A03     // Catch:{ 1iX | IOException -> 0x1491 }
            android.net.Uri r0 = r0.A02     // Catch:{ 1iX | IOException -> 0x1491 }
            android.graphics.Bitmap r0 = r1.A0h(r0, r2, r2)     // Catch:{ 1iX | IOException -> 0x1491 }
            return r0
        L_0x1491:
            r1 = move-exception
            java.lang.String r0 = "IndiaUpiQrTabActivity/loadImageRunnable Failed to load image"
            com.whatsapp.util.Log.e(r0, r1)
            r0 = 0
            return r0
        L_0x1499:
            boolean r2 = r0.A03
            java.lang.String r7 = r0.A01
            java.util.List r8 = r0.A02
            if (r2 == 0) goto L_0x14f0
            X.1hN r3 = r1.A0Z
            X.1NG r2 = r1.A0A
            com.whatsapp.jid.UserJid r0 = r1.A0H
            X.1BI r4 = r2.A00(r0)
            X.C17960vV.A07(r4)
            X.Ai5 r6 = new X.Ai5
            r6.<init>()
            r5 = 0
            r9 = 0
            X.210 r8 = r3.A00(r4, r5, r6, r7, r8, r9)
            java.lang.String r0 = r1.A0T
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x14cf
            X.8pf r2 = r1.A0P
            java.lang.String r0 = r1.A0T
            r2.A0T(r0)
            X.8pf r2 = r1.A0P
            java.lang.String r0 = r1.A0U
            r2.A0L = r0
        L_0x14cf:
            X.1ex r2 = r1.A0N
            X.1KN r4 = r1.A09
            X.1KJ r3 = r1.A06
            X.AEs r5 = r1.A0B
            X.8pf r6 = r1.A0P
            java.lang.String r9 = r1.A0r
            java.lang.String r10 = r1.A0s
            com.whatsapp.payments.ui.widget.PaymentView r0 = r1.A0J
            if (r0 == 0) goto L_0x14ee
            X.AEX r7 = r0.getPaymentBackground()
        L_0x14e5:
            boolean r11 = X.AnonymousClass8BT.A1X(r1)
            X.AW0 r0 = r2.A02(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r0
        L_0x14ee:
            r7 = 0
            goto L_0x14e5
        L_0x14f0:
            X.210 r8 = r1.A4c(r7, r8)
            goto L_0x14cf
        L_0x14f5:
            r2 = 0
            return r2
        L_0x14f7:
            X.1ex r6 = r1.A0N
            X.210 r12 = r0.A06
            X.1KN r8 = r0.A01
            X.1KJ r7 = r0.A00
            X.AEs r9 = r0.A02
            X.8pe r10 = r0.A04
            java.lang.String r13 = r1.A0r
            java.lang.String r14 = r0.A07
            java.lang.String r0 = r0.A08
            boolean r15 = r5.equals(r0)
            r11 = 0
            X.AW0 r0 = r6.A02(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r0
        L_0x1513:
            X.122 r2 = r0.A00     // Catch:{ all -> 0x151e }
            r1 = 0
            r2.A0N(r1, r1)     // Catch:{ all -> 0x151e }
            r2.A0L()     // Catch:{ all -> 0x151e }
            monitor-exit(r0)
            return r1
        L_0x151e:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x1521:
            boolean r1 = r0 instanceof X.C175538ys
            if (r1 == 0) goto L_0x155e
            r3 = r0
            X.8ys r3 = (X.C175538ys) r3
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            java.lang.String r2 = "creditCardNumber"
            java.lang.String r1 = r3.A03
            X.AnonymousClass3Ma.A1P(r2, r1, r5)
            java.lang.String r2 = "csc"
            java.lang.String r1 = r3.A02
            X.AnonymousClass3Ma.A1P(r2, r1, r5)
        L_0x153a:
            X.1QD r1 = r0.A01
            android.content.SharedPreferences r2 = r1.A03()
            java.lang.String r1 = "payments_sandbox"
            boolean r1 = X.C17880vN.A1W(r2, r1)
            if (r1 == 0) goto L_0x1553
            java.lang.String r2 = "payment_dev_cycle"
            java.lang.String r1 = "dev"
            X.0yx r1 = X.AnonymousClass8BR.A0B(r2, r1)
            r5.add(r1)
        L_0x1553:
            X.1ex r0 = r0.A02
            java.lang.String r0 = r0.A07(r4, r5)
            X.0yx r0 = X.AnonymousClass8BR.A0B(r0, r4)
            return r0
        L_0x155e:
            boolean r1 = r0 instanceof X.C175558yu
            if (r1 == 0) goto L_0x1571
            r1 = r0
            X.8yu r1 = (X.C175558yu) r1
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            java.lang.String r2 = "bank_account_number"
            java.lang.String r1 = r1.A0A
            X.AnonymousClass3Ma.A1P(r2, r1, r5)
            goto L_0x153a
        L_0x1571:
            boolean r1 = r0 instanceof X.C175548yt
            if (r1 == 0) goto L_0x1584
            r1 = r0
            X.8yt r1 = (X.C175548yt) r1
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            java.lang.String r2 = "csc"
            java.lang.String r1 = r1.A0C
            X.AnonymousClass3Ma.A1P(r2, r1, r5)
            goto L_0x153a
        L_0x1584:
            boolean r1 = r0 instanceof X.C175568yv
            if (r1 == 0) goto L_0x15ae
            r3 = r0
            X.8yv r3 = (X.C175568yv) r3
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            java.lang.String r1 = "BANK"
            java.lang.String r2 = r3.A0F
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x15a1
            java.lang.String r2 = "bank_account_number"
            java.lang.String r1 = r3.A09
        L_0x159d:
            X.AnonymousClass3Ma.A1P(r2, r1, r5)
            goto L_0x153a
        L_0x15a1:
            java.lang.String r1 = "PREPAID"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x153a
            java.lang.String r2 = "creditCardNumber"
            java.lang.String r1 = r3.A0D
            goto L_0x159d
        L_0x15ae:
            boolean r1 = r0 instanceof X.C175578yw
            if (r1 == 0) goto L_0x15c9
            r3 = r0
            X.8yw r3 = (X.C175578yw) r3
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            java.lang.String r2 = "creditCardNumber"
            java.lang.String r1 = r3.A0M
            X.AnonymousClass3Ma.A1P(r2, r1, r5)
            java.lang.String r2 = "csc"
            java.lang.String r1 = r3.A0N
            X.AnonymousClass3Ma.A1P(r2, r1, r5)
            goto L_0x153a
        L_0x15c9:
            r1 = r0
            X.8yr r1 = (X.C175528yr) r1
            java.util.List r5 = r1.A03
            goto L_0x153a
        L_0x15d0:
            java.io.FileOutputStream r3 = X.C108945cZ.A19(r2)     // Catch:{ IOException | NullPointerException -> 0x1644 }
            android.view.View r10 = r0.A02     // Catch:{ all -> 0x1626 }
            r9 = 0
            X.C18070vi.A0d(r10, r9)     // Catch:{ all -> 0x1626 }
            android.graphics.Bitmap r8 = r10.getDrawingCache()     // Catch:{ all -> 0x1626 }
            if (r8 != 0) goto L_0x1605
            int r2 = r0.A01     // Catch:{ all -> 0x1626 }
            if (r2 <= 0) goto L_0x15fd
            int r1 = r0.A00     // Catch:{ all -> 0x1626 }
            if (r1 <= 0) goto L_0x15fd
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x1626 }
            android.graphics.Bitmap r8 = android.graphics.Bitmap.createBitmap(r2, r1, r0)     // Catch:{ all -> 0x1626 }
            X.C18070vi.A0X(r8)     // Catch:{ all -> 0x1626 }
            android.graphics.Canvas r0 = new android.graphics.Canvas     // Catch:{ all -> 0x1626 }
            r0.<init>(r8)     // Catch:{ all -> 0x1626 }
            r10.layout(r9, r9, r2, r1)     // Catch:{ all -> 0x1626 }
            r10.draw(r0)     // Catch:{ all -> 0x1626 }
            goto L_0x1605
        L_0x15fd:
            X.190 r1 = r0.A03     // Catch:{ all -> 0x1626 }
            java.lang.String r0 = "convert-to-bitmap-failed"
            r1.A0G(r0, r5, r9)     // Catch:{ all -> 0x1626 }
            r8 = r5
        L_0x1605:
            if (r8 != 0) goto L_0x160b
            r3.close()     // Catch:{ IOException | NullPointerException -> 0x1644 }
            return r5
        L_0x160b:
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r8)     // Catch:{ all -> 0x1626 }
            X.C18070vi.A0X(r2)     // Catch:{ all -> 0x1626 }
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ all -> 0x1626 }
            r0 = 100
            r2.compress(r1, r0, r3)     // Catch:{ all -> 0x1626 }
            r3.close()     // Catch:{ IOException | NullPointerException -> 0x1644 }
            java.lang.String r0 = "android.intent.extra.STREAM"
            r7.putExtra(r0, r6)
            android.content.Intent r5 = android.content.Intent.createChooser(r7, r5)
            return r5
        L_0x1626:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x1628 }
        L_0x1628:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ IOException | NullPointerException -> 0x1644 }
            throw r0     // Catch:{ IOException | NullPointerException -> 0x1644 }
        L_0x162d:
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ Exception -> 0x1649 }
            r0 = 32000(0x7d00, double:1.581E-319)
            r3.get(r0, r2)     // Catch:{ Exception -> 0x1649 }
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r3 = r3 - r6
            r1 = 500(0x1f4, double:2.47E-321)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x1648
            long r1 = r1 - r3
            android.os.SystemClock.sleep(r1)
            return r5
        L_0x1644:
            r0 = move-exception
            com.whatsapp.util.Log.e(r4, r0)
        L_0x1648:
            return r5
        L_0x1649:
            r1 = move-exception
            java.lang.String r0 = "RevokeInviteAsyncTask/doInBackground/timeout"
            com.whatsapp.util.Log.e(r0, r1)
            return r5
        L_0x1650:
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ Exception -> 0x1665 }
            r5.get(r1, r3)     // Catch:{ Exception -> 0x1665 }
            long r5 = android.os.SystemClock.elapsedRealtime()
            long r5 = r5 - r12
            r1 = 500(0x1f4, double:2.47E-321)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x1677
            long r1 = r1 - r5
            java.lang.Thread.sleep(r1)     // Catch:{ InterruptedException -> 0x1677 }
            return r4
        L_0x1665:
            r2 = move-exception
            java.lang.String r1 = "modify-admins/timeout"
            com.whatsapp.util.Log.w(r1, r2)
            X.1KB r3 = r0.A00
            r2 = 30
            X.Aik r1 = new X.Aik
            r1.<init>(r0, r2)
            r3.A0J(r1)
        L_0x1677:
            return r4
        L_0x1678:
            return r2
        L_0x1679:
            X.1yi r3 = X.C42771yi.A00()     // Catch:{ 1Mf -> 0x16c1 }
            java.lang.String r2 = X.AnonymousClass17K.A02(r5)     // Catch:{ 1Mf -> 0x16c1 }
            X.1ym r3 = r3.A0H(r2, r1)     // Catch:{ 1Mf -> 0x16c1 }
            int r2 = r3.countryCode_     // Catch:{ 1Mf -> 0x16c1 }
            java.lang.String r4 = java.lang.String.valueOf(r2)     // Catch:{ 1Mf -> 0x16c1 }
            long r2 = r3.nationalNumber_     // Catch:{ 1Mf -> 0x16c1 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ 1Mf -> 0x16c1 }
            java.lang.String r4 = X.AnonymousClass1K3.A01(r4, r2)     // Catch:{ 1Mf -> 0x16c1 }
            X.C18070vi.A0X(r4)     // Catch:{ 1Mf -> 0x16c1 }
            X.11S r2 = r0.A03     // Catch:{ 1Mf -> 0x16c1 }
            r2.A0I()     // Catch:{ 1Mf -> 0x16c1 }
            com.whatsapp.Me r2 = r2.A00     // Catch:{ 1Mf -> 0x16c1 }
            if (r2 == 0) goto L_0x16af
            java.lang.String r3 = r2.cc     // Catch:{ 1Mf -> 0x16c1 }
            java.lang.String r2 = r2.number     // Catch:{ 1Mf -> 0x16c1 }
            java.lang.String r2 = X.AnonymousClass1K3.A01(r3, r2)     // Catch:{ 1Mf -> 0x16c1 }
            boolean r2 = r4.equals(r2)     // Catch:{ 1Mf -> 0x16c1 }
            if (r2 != 0) goto L_0x16c5
        L_0x16af:
            java.lang.String r2 = ""
            java.util.Locale r3 = new java.util.Locale     // Catch:{ 1Mf -> 0x16c1 }
            r3.<init>(r2, r4)     // Catch:{ 1Mf -> 0x16c1 }
            java.util.Locale r2 = java.util.Locale.getDefault()     // Catch:{ 1Mf -> 0x16c1 }
            java.lang.String r2 = r3.getDisplayCountry(r2)     // Catch:{ 1Mf -> 0x16c1 }
            r0.A02 = r2     // Catch:{ 1Mf -> 0x16c1 }
            goto L_0x16c5
        L_0x16c1:
            r2 = move-exception
            com.whatsapp.util.Log.w((java.lang.Throwable) r2)
        L_0x16c5:
            X.9aH r3 = r0.A06
            r2 = 0
            X.C18070vi.A0d(r5, r2)
            X.0ve r4 = r3.A01
            r3 = 11061(0x2b35, float:1.55E-41)
            X.0vf r2 = X.C18040vf.A02
            boolean r2 = X.C18020vd.A05(r2, r4, r3)
            if (r2 == 0) goto L_0x16f8
            boolean r2 = r5.A0G()
            if (r2 == 0) goto L_0x16f8
            com.whatsapp.jid.UserJid r4 = X.AnonymousClass3MZ.A0x(r5)
            if (r4 == 0) goto L_0x16f6
            X.A1E r3 = r0.A05
            java.util.concurrent.ConcurrentHashMap r2 = r3.A06
            boolean r1 = r2.containsKey(r4)
            if (r1 != 0) goto L_0x16f0
            r3.A01(r4)
        L_0x16f0:
            java.lang.Object r1 = r2.get(r4)
            X.9tc r1 = (X.C195609tc) r1
        L_0x16f6:
            r0.A00 = r1
        L_0x16f8:
            boolean r1 = r5.A0C()
            if (r1 == 0) goto L_0x1722
            r4 = 0
            java.lang.String r0 = ""
            r2 = 0
            X.2ml r1 = new X.2ml
            r1.<init>()
            r1.A01 = r4
            r1.A02 = r2
            r1.A03 = r0
            r1.A04 = r4
            r1.A05 = r4
            r1.A00 = r4
            X.9rc r0 = new X.9rc
            r0.<init>()
            r0.A00 = r4
            r0.A01 = r4
            r0.A02 = r1
            r0.A00 = r4
            return r0
        L_0x1722:
            X.1UL r0 = r0.A0A
            X.9rc r0 = r0.A01(r5)
            return r0
        L_0x1729:
            r1 = move-exception
            android.net.TrafficStats.clearThreadStatsTag()
            throw r1
        L_0x172e:
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x1782 }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x1782 }
            java.lang.String r2 = "contacts"
            java.lang.String r1 = "PaymentStore/removeAllContacts/DELETE_SCHEMA_PAY_CONTACTS"
            r0 = 0
            int r2 = r3.A04(r2, r0, r1, r0)     // Catch:{ all -> 0x1782 }
            if (r2 < 0) goto L_0x1749
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x1782 }
            java.lang.String r0 = "PAY: PaymentStore removeAllContacts deleted num rows: "
            X.C17900vP.A0j(r0, r1, r2)     // Catch:{ all -> 0x1782 }
            r0 = 1
            goto L_0x1753
        L_0x1749:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x1782 }
            java.lang.String r0 = "PAY: PaymentStore removeAllContacts could not delete all rows: "
            X.C17900vP.A0k(r0, r1, r2)     // Catch:{ all -> 0x1782 }
            r0 = 0
        L_0x1753:
            r4.close()
            r5 = r5 & r0
            X.2Di r0 = r6.A00
            X.1au r4 = r0.A06()
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x1782 }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x1782 }
            java.lang.String r2 = "tmp_transactions"
            java.lang.String r1 = "removeAllPaymentTransactionTmpInfo/DELETE_SCHEMA_PAY_TRANSACTIONS_TMP"
            r0 = 0
            int r2 = r3.A04(r2, r0, r1, r0)     // Catch:{ all -> 0x1782 }
            if (r2 < 0) goto L_0x176f
            r0 = 1
            goto L_0x1779
        L_0x176f:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x1782 }
            java.lang.String r0 = "PAY: PaymentStore removeAllPaymentTransactionTmpInfo could not delete all rows: "
            X.C17900vP.A0k(r0, r1, r2)     // Catch:{ all -> 0x1782 }
            r0 = 0
        L_0x1779:
            r4.close()
            r5 = r5 & r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            return r0
        L_0x1782:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x1787 }
            throw r1
        L_0x1787:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        L_0x178c:
            java.util.Set r5 = r0.A02
            r4.addAll(r5)
            java.lang.String r1 = r0.A01
            X.9ax r4 = r0.A0J(r1, r4)
            int r0 = r5.size()
            java.util.ArrayList r3 = X.C17880vN.A0z(r0)
            java.util.List r0 = r4.A00
            java.util.Iterator r2 = r0.iterator()
        L_0x17a5:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x17b9
            java.lang.Object r1 = r2.next()
            boolean r0 = r5.contains(r1)
            if (r0 == 0) goto L_0x17a5
            r3.add(r1)
            goto L_0x17a5
        L_0x17b9:
            boolean r1 = r4.A01
            X.9ax r0 = new X.9ax
            r0.<init>(r3, r1)
            return r0
        L_0x17c1:
            X.1OZ r3 = r0.A03     // Catch:{ 1oV -> 0x17d3 }
            r1 = 32000(0x7d00, double:1.581E-319)
            r3.A0E(r1)     // Catch:{ 1oV -> 0x17d3 }
            X.31f r2 = r0.A00
            X.2R1 r1 = X.AnonymousClass2R1.A0F
            com.whatsapp.jid.UserJid r0 = r0.A02
            X.2rf r0 = r2.A06(r1, r0)
            return r0
        L_0x17d3:
            r0 = 0
            return r0
        L_0x17d5:
            X.6uK r4 = r0.A04
            r4.A02()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r3)     // Catch:{ IOException | URISyntaxException -> 0x18bb, all -> 0x18b9 }
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ IOException | URISyntaxException -> 0x18bb, all -> 0x18b9 }
            r1.append(r5)     // Catch:{ IOException | URISyntaxException -> 0x18bb, all -> 0x18b9 }
            java.lang.String r7 = X.AnonymousClass000.A0y(r3, r1)     // Catch:{ IOException | URISyntaxException -> 0x18bb, all -> 0x18b9 }
            java.lang.String r1 = "https://images.google.com/searchbyimage/upload"
            java.net.URLConnection r3 = X.AnonymousClass8BV.A0v(r1)     // Catch:{ IOException | URISyntaxException -> 0x18bb, all -> 0x18b9 }
            javax.net.ssl.HttpsURLConnection r3 = (javax.net.ssl.HttpsURLConnection) r3     // Catch:{ IOException | URISyntaxException -> 0x18bb, all -> 0x18b9 }
            r10 = 1
            r3.setDoInput(r10)     // Catch:{ IOException -> 0x18b7, URISyntaxException -> 0x18b5 }
            r1 = 0
            r3.setDoOutput(r1)     // Catch:{ IOException -> 0x18b7, URISyntaxException -> 0x18b5 }
            r3.setUseCaches(r1)     // Catch:{ IOException -> 0x18b7, URISyntaxException -> 0x18b5 }
            r1 = 15000(0x3a98, float:2.102E-41)
            r3.setConnectTimeout(r1)     // Catch:{ IOException -> 0x18b7, URISyntaxException -> 0x18b5 }
            r1 = 30000(0x7530, float:4.2039E-41)
            r3.setReadTimeout(r1)     // Catch:{ IOException -> 0x18b7, URISyntaxException -> 0x18b5 }
            java.lang.String r1 = "POST"
            r3.setRequestMethod(r1)     // Catch:{ IOException -> 0x18b7, URISyntaxException -> 0x18b5 }
            java.lang.String r5 = "Connection"
            java.lang.String r1 = "Keep-Alive"
            r3.setRequestProperty(r5, r1)     // Catch:{ IOException -> 0x18b7, URISyntaxException -> 0x18b5 }
            java.lang.String r5 = "Cache-Control"
            java.lang.String r1 = "no-cache"
            r3.setRequestProperty(r5, r1)     // Catch:{ IOException -> 0x18b7, URISyntaxException -> 0x18b5 }
            java.lang.String r6 = "Content-Type"
            java.lang.StringBuilder r5 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x18b7, URISyntaxException -> 0x18b5 }
            java.lang.String r1 = "multipart/form-data; boundary="
            java.lang.String r1 = X.AnonymousClass001.A1H(r1, r7, r5)     // Catch:{ IOException -> 0x18b7, URISyntaxException -> 0x18b5 }
            r3.setRequestProperty(r6, r1)     // Catch:{ IOException -> 0x18b7, URISyntaxException -> 0x18b5 }
            X.181 r6 = r0.A02     // Catch:{ IOException -> 0x18b7, URISyntaxException -> 0x18b5 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)     // Catch:{ IOException -> 0x18b7, URISyntaxException -> 0x18b5 }
            java.io.OutputStream r1 = r3.getOutputStream()     // Catch:{ IOException -> 0x18b7, URISyntaxException -> 0x18b5 }
            X.9He r0 = new X.9He     // Catch:{ IOException -> 0x18b7, URISyntaxException -> 0x18b5 }
            r0.<init>(r6, r1, r2, r5)     // Catch:{ IOException -> 0x18b7, URISyntaxException -> 0x18b5 }
            java.io.DataOutputStream r5 = new java.io.DataOutputStream     // Catch:{ IOException -> 0x18b7, URISyntaxException -> 0x18b5 }
            r5.<init>(r0)     // Catch:{ IOException -> 0x18b7, URISyntaxException -> 0x18b5 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x18ab }
            java.lang.String r0 = "--"
            X.C17890vO.A10(r0, r7, r9, r1)     // Catch:{ all -> 0x18ab }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x18ab }
            r5.writeBytes(r0)     // Catch:{ all -> 0x18ab }
            java.lang.String r0 = "Content-Disposition: form-data; name=\"encoded_image\"\r\n"
            r5.writeBytes(r0)     // Catch:{ all -> 0x18ab }
            java.lang.String r0 = "Content-Type: image/jpeg\r\n"
            r5.writeBytes(r0)     // Catch:{ all -> 0x18ab }
            java.lang.String r0 = "Content-Transfer-Encoding: binary\r\n"
            r5.writeBytes(r0)     // Catch:{ all -> 0x18ab }
            r5.writeBytes(r9)     // Catch:{ all -> 0x18ab }
            java.io.FileInputStream r6 = X.C108945cZ.A18(r8)     // Catch:{ all -> 0x18ab }
            X.C64062u9.A00(r6, r5)     // Catch:{ all -> 0x18a1 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x18a1 }
            java.lang.String r0 = "\r\n--"
            r1.append(r0)     // Catch:{ all -> 0x18a1 }
            r1.append(r7)     // Catch:{ all -> 0x18a1 }
            java.lang.String r0 = "--\r\n"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ all -> 0x18a1 }
            r5.writeBytes(r0)     // Catch:{ all -> 0x18a1 }
            r6.close()     // Catch:{ all -> 0x18ab }
            int r1 = r3.getResponseCode()     // Catch:{ all -> 0x18ab }
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 != r0) goto L_0x189d
            java.net.URL r0 = r3.getURL()     // Catch:{ all -> 0x18ab }
            java.net.URI r0 = r0.toURI()     // Catch:{ all -> 0x18ab }
            if (r0 == 0) goto L_0x189d
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x18ab }
            r5.close()     // Catch:{ IOException -> 0x18b7, URISyntaxException -> 0x18b5 }
            r3.disconnect()
            r4.A00()
            return r0
        L_0x189d:
            r5.close()     // Catch:{ IOException -> 0x18b7, URISyntaxException -> 0x18b5 }
            goto L_0x18c4
        L_0x18a1:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x18a6 }
            goto L_0x18aa
        L_0x18a6:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x18ab }
        L_0x18aa:
            throw r1     // Catch:{ all -> 0x18ab }
        L_0x18ab:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x18b0 }
            goto L_0x18b4
        L_0x18b0:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IOException -> 0x18b7, URISyntaxException -> 0x18b5 }
        L_0x18b4:
            throw r1     // Catch:{ IOException -> 0x18b7, URISyntaxException -> 0x18b5 }
        L_0x18b5:
            r1 = move-exception
            goto L_0x18bd
        L_0x18b7:
            r1 = move-exception
            goto L_0x18bd
        L_0x18b9:
            r0 = move-exception
            goto L_0x18cd
        L_0x18bb:
            r1 = move-exception
            r3 = r2
        L_0x18bd:
            java.lang.String r0 = "GoogleReverseImageSearchAsyncTask/searchImage/malformedUrl "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x18cb }
            if (r3 == 0) goto L_0x18c7
        L_0x18c4:
            r3.disconnect()
        L_0x18c7:
            r4.A00()
            return r2
        L_0x18cb:
            r0 = move-exception
            r2 = r3
        L_0x18cd:
            if (r2 == 0) goto L_0x18d2
            r2.disconnect()
        L_0x18d2:
            r4.A00()
            throw r0
        L_0x18d6:
            X.2rf r0 = X.C62602rf.A04
            android.util.Pair r6 = X.C108945cZ.A0N(r0, r4)
            return r6
        L_0x18dd:
            boolean r1 = r0 instanceof X.C177779Ao
            if (r1 == 0) goto L_0x18fe
            X.9Ao r0 = (X.C177779Ao) r0
            android.net.Uri[] r2 = (android.net.Uri[]) r2
            int r1 = r2.length
            if (r1 <= 0) goto L_0x18fc
            r1 = 0
            r1 = r2[r1]
            if (r1 == 0) goto L_0x18fc
            java.lang.ref.WeakReference r0 = r0.A00
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            if (r0 == 0) goto L_0x18fc
            android.media.Ringtone r0 = android.media.RingtoneManager.getRingtone(r0, r1)
            return r0
        L_0x18fc:
            r0 = 0
            return r0
        L_0x18fe:
            boolean r1 = r0 instanceof X.AnonymousClass9B3
            if (r1 == 0) goto L_0x1932
            X.9B3 r0 = (X.AnonymousClass9B3) r0
            X.118 r1 = r0.A02
            java.io.File r2 = X.AnonymousClass8BR.A0t(r1)
            java.lang.String r1 = X.C198229y0.A03
            java.io.File r2 = X.C17880vN.A0e(r2, r1)
            boolean r1 = r2.exists()
            if (r1 != 0) goto L_0x1923
            boolean r1 = r2.mkdirs()
            if (r1 != 0) goto L_0x1923
            java.lang.String r0 = "BloksImageManager/getBitmap/unable to get images directory"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 0
            return r0
        L_0x1923:
            java.lang.String r0 = r0.A03
            java.io.File r0 = X.C17880vN.A0e(r2, r0)
            java.lang.String r0 = r0.getAbsolutePath()
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeFile(r0)
            return r0
        L_0x1932:
            boolean r1 = r0 instanceof X.C177709Ag
            if (r1 == 0) goto L_0x1988
            X.9Ag r0 = (X.C177709Ag) r0
            com.whatsapp.accountsync.ProfileActivity r3 = r0.A00
            X.126 r0 = r3.A07
            X.00H r0 = r0.A12
            java.lang.Object r0 = r0.get()
            X.127 r0 = (X.AnonymousClass127) r0
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x1961
            r5 = 90000(0x15f90, double:4.4466E-319)
        L_0x194b:
            r4 = 0
        L_0x194c:
            X.126 r0 = r3.A07
            boolean r0 = r0.A0l()
            if (r0 == 0) goto L_0x1965
            long r1 = (long) r4
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x1965
            int r4 = r4 + 200
            r0 = 200(0xc8, double:9.9E-322)
            android.os.SystemClock.sleep(r0)
            goto L_0x194c
        L_0x1961:
            r5 = 45000(0xafc8, double:2.2233E-319)
            goto L_0x194b
        L_0x1965:
            long r1 = (long) r4
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x1986
            X.126 r0 = r3.A07
            boolean r0 = r0.A0l()
            if (r0 == 0) goto L_0x1986
            X.126 r0 = r3.A07
            X.00H r0 = r0.A12
            java.lang.Object r0 = r0.get()
            X.127 r0 = (X.AnonymousClass127) r0
            boolean r0 = r0.A01
            if (r0 != 0) goto L_0x1986
            X.126 r1 = r3.A07
            r0 = 3
            r1.A0N(r0)
        L_0x1986:
            r0 = 0
            return r0
        L_0x1988:
            boolean r1 = r0 instanceof X.C177769An
            if (r1 == 0) goto L_0x19ca
            X.9An r0 = (X.C177769An) r0
            r1 = 2000(0x7d0, double:9.88E-321)
            android.os.SystemClock.sleep(r1)
            com.whatsapp.accountsync.LoginActivity r4 = r0.A01
            r0 = 2131898700(0x7f12314c, float:1.9432325E38)
            java.lang.String r1 = r4.getString(r0)
            java.lang.String r0 = "com.whatsapp"
            android.accounts.Account r3 = new android.accounts.Account
            r3.<init>(r1, r0)
            android.accounts.AccountManager r1 = android.accounts.AccountManager.get(r4)
            r0 = 0
            boolean r0 = r1.addAccountExplicitly(r3, r0, r0)
            if (r0 == 0) goto L_0x19c8
            android.os.Bundle r2 = X.C17880vN.A0D()
            java.lang.String r1 = "authAccount"
            java.lang.String r0 = r3.name
            r2.putString(r1, r0)
            java.lang.String r1 = "accountType"
            java.lang.String r0 = r3.type
            r2.putString(r1, r0)
            r4.A00 = r2
            r0 = 1
        L_0x19c3:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x19c8:
            r0 = 0
            goto L_0x19c3
        L_0x19ca:
            X.9BP r0 = (X.AnonymousClass9BP) r0
            java.lang.ref.WeakReference r1 = r0.A00
            java.lang.Object r1 = r1.get()
            if (r1 == 0) goto L_0x1b02
            r12 = -1
            r4 = 0
            X.A98 r6 = r0.A09     // Catch:{ IOException -> 0x1afe, Exception -> 0x1b04 }
            java.util.LinkedHashMap r8 = X.C17880vN.A13()     // Catch:{ IOException -> 0x1afe, Exception -> 0x1b04 }
            java.lang.String r3 = X.C197569wu.A0I     // Catch:{ IOException -> 0x1afe, Exception -> 0x1b04 }
            X.C18070vi.A0b(r3)     // Catch:{ IOException -> 0x1afe, Exception -> 0x1b04 }
            X.1D9 r2 = r6.A08     // Catch:{ IOException -> 0x1afe, Exception -> 0x1b04 }
            java.lang.Integer r1 = X.C17880vN.A0l()     // Catch:{ IOException -> 0x1afe, Exception -> 0x1b04 }
            X.AUZ r5 = r2.A08(r1, r3)     // Catch:{ IOException -> 0x1afe, Exception -> 0x1b04 }
            X.C18070vi.A0X(r5)     // Catch:{ IOException -> 0x1afe, Exception -> 0x1b04 }
            java.net.HttpURLConnection r1 = r5.A01     // Catch:{ all -> 0x1af7 }
            int r3 = r1.getResponseCode()     // Catch:{ all -> 0x1af7 }
            r1 = 200(0xc8, float:2.8E-43)
            if (r3 == r1) goto L_0x1a03
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x1af7 }
            java.lang.String r1 = "RegistrationHttpManager/serverstatus/error status="
            X.C17900vP.A0i(r1, r2, r3)     // Catch:{ all -> 0x1af7 }
            goto L_0x1a89
        L_0x1a03:
            java.lang.StringBuilder r9 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x1af7 }
            X.181 r2 = r6.A03     // Catch:{ all -> 0x1af7 }
            r11 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x1af7 }
            X.9Hb r6 = r5.BMP(r2, r4, r1)     // Catch:{ all -> 0x1af7 }
            java.lang.String r1 = X.C19620yd.A0A     // Catch:{ all -> 0x1ae8 }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ all -> 0x1ae8 }
            r3.<init>(r6, r1)     // Catch:{ all -> 0x1ae8 }
            r1 = 4096(0x1000, float:5.74E-42)
            char[] r2 = new char[r1]     // Catch:{ all -> 0x1ae1 }
        L_0x1a1d:
            int r1 = r3.read(r2)     // Catch:{ all -> 0x1ae1 }
            r7 = 0
            if (r1 < 0) goto L_0x1a28
            r9.append(r2, r7, r1)     // Catch:{ all -> 0x1ae1 }
            goto L_0x1a1d
        L_0x1a28:
            java.lang.String r1 = X.C18070vi.A0H(r9)     // Catch:{ all -> 0x1ae1 }
            r3.close()     // Catch:{ all -> 0x1ae8 }
            r6.close()     // Catch:{ all -> 0x1af7 }
            org.json.JSONObject r6 = X.C17880vN.A16(r1)     // Catch:{ JSONException -> 0x1adf }
            java.util.Iterator r10 = r6.keys()     // Catch:{ JSONException -> 0x1adf }
        L_0x1a3a:
            boolean r1 = r10.hasNext()     // Catch:{ JSONException -> 0x1adf }
            if (r1 == 0) goto L_0x1a89
            java.lang.String r9 = X.C17880vN.A0v(r10)     // Catch:{ JSONException -> 0x1adf }
            org.json.JSONObject r2 = r6.getJSONObject(r9)     // Catch:{ JSONException -> 0x1adf }
            java.lang.String r1 = "available"
            java.lang.String r3 = r2.getString(r1)     // Catch:{ JSONException -> 0x1adf }
            java.lang.String r1 = "false"
            boolean r1 = X.C18070vi.A18(r3, r1)     // Catch:{ JSONException -> 0x1adf }
            if (r1 == 0) goto L_0x1a61
            X.C18070vi.A0b(r9)     // Catch:{ JSONException -> 0x1adf }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r7)     // Catch:{ JSONException -> 0x1adf }
            r8.put(r9, r1)     // Catch:{ JSONException -> 0x1adf }
            goto L_0x1a3a
        L_0x1a61:
            java.lang.String r1 = "true"
            boolean r1 = X.C18070vi.A18(r3, r1)     // Catch:{ JSONException -> 0x1adf }
            if (r1 == 0) goto L_0x1a74
            X.C18070vi.A0b(r9)     // Catch:{ JSONException -> 0x1adf }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r11)     // Catch:{ JSONException -> 0x1adf }
            r8.put(r9, r1)     // Catch:{ JSONException -> 0x1adf }
            goto L_0x1a3a
        L_0x1a74:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ JSONException -> 0x1adf }
            java.lang.String r1 = "RegistrationHttpManager/serverstatus/error "
            r2.append(r1)     // Catch:{ JSONException -> 0x1adf }
            r2.append(r9)     // Catch:{ JSONException -> 0x1adf }
            r1 = 61
            r2.append(r1)     // Catch:{ JSONException -> 0x1adf }
            X.C17890vO.A19(r2, r3)     // Catch:{ JSONException -> 0x1adf }
            goto L_0x1a3a
        L_0x1a89:
            r5.close()     // Catch:{ IOException -> 0x1afe, Exception -> 0x1b04 }
            r0.A01 = r8     // Catch:{ IOException -> 0x1afe, Exception -> 0x1b04 }
            boolean r1 = r0.A0C     // Catch:{ IOException -> 0x1afe, Exception -> 0x1b04 }
            if (r1 != 0) goto L_0x1b02
            X.11C r1 = r0.A05     // Catch:{ SettingNotFoundException -> 0x1ac4, Exception -> 0x1ac0 }
            X.11B r1 = r1.A0O()     // Catch:{ SettingNotFoundException -> 0x1ac4, Exception -> 0x1ac0 }
            X.C17960vV.A07(r1)     // Catch:{ SettingNotFoundException -> 0x1ac4, Exception -> 0x1ac0 }
            android.content.ContentResolver r2 = r1.A00     // Catch:{ SettingNotFoundException -> 0x1ac4, Exception -> 0x1ac0 }
            java.lang.String r1 = "wifi_sleep_policy"
            int r2 = android.provider.Settings.System.getInt(r2, r1)     // Catch:{ SettingNotFoundException -> 0x1ac4, Exception -> 0x1ac0 }
            if (r2 == 0) goto L_0x1ab1
            r1 = 1
            if (r2 == r1) goto L_0x1aae
            r1 = 2
            if (r2 == r1) goto L_0x1ab4
            java.lang.String r3 = "unknown"
            goto L_0x1ab6
        L_0x1aae:
            java.lang.String r3 = "never-while-plugged"
            goto L_0x1ab6
        L_0x1ab1:
            java.lang.String r3 = "default"
            goto L_0x1ab6
        L_0x1ab4:
            java.lang.String r3 = "never"
        L_0x1ab6:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ SettingNotFoundException -> 0x1ac4, Exception -> 0x1ac0 }
            java.lang.String r1 = "about/wifisleep/"
            X.C17900vP.A0f(r1, r3, r2)     // Catch:{ SettingNotFoundException -> 0x1ac4, Exception -> 0x1ac0 }
            goto L_0x1aca
        L_0x1ac0:
            r2 = move-exception
            java.lang.String r1 = "about/wifisleep/error "
            goto L_0x1ac7
        L_0x1ac4:
            r2 = move-exception
            java.lang.String r1 = "about/wifisleep/not-found"
        L_0x1ac7:
            com.whatsapp.util.Log.i(r1, r2)     // Catch:{ IOException -> 0x1afe, Exception -> 0x1b04 }
        L_0x1aca:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x1afe, Exception -> 0x1b04 }
            java.lang.String r1 = "about/contacts/count "
            r3.append(r1)     // Catch:{ IOException -> 0x1afe, Exception -> 0x1b04 }
            X.11C r2 = r0.A05     // Catch:{ IOException -> 0x1afe, Exception -> 0x1b04 }
            X.17x r1 = r0.A06     // Catch:{ IOException -> 0x1afe, Exception -> 0x1b04 }
            java.lang.Integer r1 = X.AnonymousClass2T4.A00(r2, r1)     // Catch:{ IOException -> 0x1afe, Exception -> 0x1b04 }
            X.C17900vP.A0b(r1, r3)     // Catch:{ IOException -> 0x1afe, Exception -> 0x1b04 }
            goto L_0x1b02
        L_0x1adf:
            r3 = move-exception
            goto L_0x1aef
        L_0x1ae1:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x1ae3 }
        L_0x1ae3:
            r1 = move-exception
            X.CDX.A00(r3, r2)     // Catch:{ all -> 0x1ae8 }
            throw r1     // Catch:{ all -> 0x1ae8 }
        L_0x1ae8:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x1aea }
        L_0x1aea:
            r2 = move-exception
            X.CDX.A00(r6, r1)     // Catch:{ all -> 0x1af7 }
            goto L_0x1af6
        L_0x1aef:
            java.lang.String r1 = "error parsing json"
            java.io.IOException r2 = new java.io.IOException     // Catch:{ all -> 0x1af7 }
            r2.<init>(r1, r3)     // Catch:{ all -> 0x1af7 }
        L_0x1af6:
            throw r2     // Catch:{ all -> 0x1af7 }
        L_0x1af7:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x1af9 }
        L_0x1af9:
            r1 = move-exception
            X.CDX.A00(r5, r2)     // Catch:{ IOException -> 0x1afe, Exception -> 0x1b04 }
            throw r1     // Catch:{ IOException -> 0x1afe, Exception -> 0x1b04 }
        L_0x1afe:
            r2 = move-exception
            java.lang.String r1 = "checksystemstatus/ioerror "
            goto L_0x1b07
        L_0x1b02:
            r12 = 0
            goto L_0x1b0c
        L_0x1b04:
            r2 = move-exception
            java.lang.String r1 = "checksystemstatus/error "
        L_0x1b07:
            com.whatsapp.util.Log.w(r1, r2)
            r0.A01 = r4
        L_0x1b0c:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A34.A0G(java.lang.Object[]):java.lang.Object");
    }

    public A34(AnonymousClass1F9 r3, boolean z) {
        this();
        C17960vV.A02();
        C17960vV.A0D(AnonymousClass3Ma.A1Z(((C23391Fw) r3.getLifecycle()).A02, C23401Fx.DESTROYED));
        this.A01 = r3;
        this.A00 = new C20322AGe(this, z);
        r3.getLifecycle().A05(this.A00);
    }

    public A34() {
        this.A02 = new AnonymousClass8CU(this);
    }
}
