package X;

import android.view.View;

public class AFN implements View.OnClickListener {
    public final int A00;
    public final Object A01;

    public AFN(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(View view, Object obj, int i) {
        view.setOnClickListener(new AFN(obj, i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: X.AEy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: X.AEw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v15, resolved type: X.AEy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v16, resolved type: X.AEy} */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0346, code lost:
        if (r3.A0Q.A06() == false) goto L_0x0348;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0079, code lost:
        r0 = new X.CXL();
        r0.A02 = r1;
        r2.A08(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0083, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01e2, code lost:
        r0.invoke();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01e5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0283, code lost:
        r1.A02 = r0;
        r2.A0A();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0288, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r13) {
        /*
            r12 = this;
            int r0 = r12.A00
            switch(r0) {
                case 0: goto L_0x042e;
                case 1: goto L_0x029f;
                case 2: goto L_0x029f;
                case 3: goto L_0x041f;
                case 4: goto L_0x0413;
                case 5: goto L_0x03d9;
                case 6: goto L_0x03bc;
                case 7: goto L_0x03a2;
                case 8: goto L_0x039c;
                case 9: goto L_0x0355;
                case 10: goto L_0x031d;
                case 11: goto L_0x006f;
                case 12: goto L_0x0064;
                case 13: goto L_0x0315;
                case 14: goto L_0x02d9;
                case 15: goto L_0x0022;
                case 16: goto L_0x02a7;
                case 17: goto L_0x029f;
                case 18: goto L_0x0297;
                case 19: goto L_0x0013;
                case 20: goto L_0x0289;
                case 21: goto L_0x027c;
                case 22: goto L_0x029f;
                case 23: goto L_0x029f;
                case 24: goto L_0x026d;
                case 25: goto L_0x0258;
                case 26: goto L_0x022e;
                case 27: goto L_0x0222;
                case 28: goto L_0x0218;
                case 29: goto L_0x0218;
                case 30: goto L_0x020e;
                case 31: goto L_0x0204;
                case 32: goto L_0x01fa;
                case 33: goto L_0x01f0;
                case 34: goto L_0x01e6;
                case 35: goto L_0x01da;
                case 36: goto L_0x01ce;
                case 37: goto L_0x01c2;
                case 38: goto L_0x01b3;
                case 39: goto L_0x01a3;
                case 40: goto L_0x0193;
                case 41: goto L_0x018a;
                case 42: goto L_0x0172;
                case 43: goto L_0x015a;
                case 44: goto L_0x0136;
                case 45: goto L_0x00dc;
                case 46: goto L_0x009d;
                case 47: goto L_0x0084;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r12.A01
            X.8wF r2 = (X.C174108wF) r2
            java.util.List r0 = X.C42011xT.A0I
            X.B7s r1 = r2.A01
            java.lang.String r0 = r2.A02
            r1.C43(r0)
        L_0x0012:
            return
        L_0x0013:
            java.lang.Object r0 = r12.A01
            com.whatsapp.businessdirectory.view.custom.FilterBottomSheetDialogFragment r0 = (com.whatsapp.businessdirectory.view.custom.FilterBottomSheetDialogFragment) r0
            r0.A28()
            X.BAZ r0 = r0.A02
            if (r0 == 0) goto L_0x0012
            r0.Bmp()
            return
        L_0x0022:
            java.lang.Object r1 = r12.A01
            X.8kf r1 = (X.C169258kf) r1
            com.whatsapp.businessdirectory.view.activity.BusinessDirectorySERPMapViewActivity r1 = (com.whatsapp.businessdirectory.view.activity.BusinessDirectorySERPMapViewActivity) r1
            X.DAE r0 = r1.A03
            if (r0 == 0) goto L_0x0012
            X.8FG r4 = r1.A4b()
            X.CtJ r0 = r0.A0R
            X.CbC r0 = r0.A06()
            X.AEl r0 = r0.A04
            X.AEc r3 = r0.A00()
            X.1DT r1 = r4.A02
            r0 = 2
            X.AnonymousClass3MX.A1J(r1, r0)
            X.AM7 r5 = r4.A0J
            X.A5L r0 = r4.A0L
            java.lang.Integer r6 = r0.A04()
            r9 = 11
            java.lang.Integer r7 = java.lang.Integer.valueOf(r9)
            r8 = 0
            r10 = 68
            r11 = 1
            r5.A08(r6, r7, r8, r9, r10, r11)
            X.B3V r2 = new X.B3V
            r2.<init>(r4)
            X.10I r1 = r4.A0X
            r0 = 15
            X.C21434Ak1.A00(r1, r4, r3, r2, r0)
            return
        L_0x0064:
            java.lang.Object r0 = r12.A01
            com.whatsapp.businessdirectory.view.activity.BusinessDirectorySERPMapViewActivity r0 = (com.whatsapp.businessdirectory.view.activity.BusinessDirectorySERPMapViewActivity) r0
            X.DAE r2 = r0.A03
            if (r2 == 0) goto L_0x0012
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x0079
        L_0x006f:
            java.lang.Object r0 = r12.A01
            com.whatsapp.businessdirectory.view.activity.BusinessDirectorySERPMapViewActivity r0 = (com.whatsapp.businessdirectory.view.activity.BusinessDirectorySERPMapViewActivity) r0
            X.DAE r2 = r0.A03
            if (r2 == 0) goto L_0x0012
            r1 = 1065353216(0x3f800000, float:1.0)
        L_0x0079:
            X.CXL r0 = new X.CXL
            r0.<init>()
            r0.A02 = r1
            r2.A08(r0)
            return
        L_0x0084:
            java.lang.Object r1 = r12.A01
            X.8wT r1 = (X.C174248wT) r1
            java.util.List r0 = X.C42011xT.A0I
            X.9X4 r0 = r1.A00
            com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel r2 = r0.A00
            r0 = 0
            r2.A02 = r0
            X.A36 r1 = r2.A0R
            java.util.HashSet r0 = X.C17880vN.A12()
            r1.A01 = r0
            com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel.A0E(r2)
            return
        L_0x009d:
            java.lang.Object r1 = r12.A01
            X.8wb r1 = (X.C174328wb) r1
            java.util.List r0 = X.C42011xT.A0I
            X.B58 r3 = r1.A00
            X.APa r3 = (X.C20541APa) r3
            int r2 = r3.A00
            java.lang.Object r1 = r3.A01
            X.A2L r1 = (X.A2L) r1
            X.00H r0 = r1.A07
            java.lang.Object r4 = r0.get()
            X.AM7 r4 = (X.AM7) r4
            X.A5L r0 = r1.A04
            java.lang.Integer r5 = r0.A04()
            r8 = 1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)
            r7 = 0
            if (r2 == 0) goto L_0x00d1
            r9 = 36
            r10 = 5
            r4.A08(r5, r6, r7, r8, r9, r10)
            java.lang.Object r0 = r3.A02
            X.AEw r0 = (X.C20288AEw) r0
        L_0x00cd:
            r1.A03(r0)
            return
        L_0x00d1:
            r9 = 47
            r10 = 5
            r4.A08(r5, r6, r7, r8, r9, r10)
            java.lang.Object r0 = r3.A02
            X.AEy r0 = (X.C20290AEy) r0
            goto L_0x00cd
        L_0x00dc:
            java.lang.Object r1 = r12.A01
            X.8wb r1 = (X.C174328wb) r1
            java.util.List r0 = X.C42011xT.A0I
            X.B58 r5 = r1.A00
            X.APa r5 = (X.C20541APa) r5
            int r0 = r5.A00
            if (r0 == 0) goto L_0x010d
            java.lang.Object r3 = r5.A01
            X.A2L r3 = (X.A2L) r3
            boolean r2 = r5.A03
            r1 = 36
            if (r2 == 0) goto L_0x00f6
            r1 = 32
        L_0x00f6:
            java.lang.Object r5 = r5.A02
            X.AEw r5 = (X.C20288AEw) r5
            r0 = 2
            X.A2L.A00(r5, r3, r1, r0, r2)
            long r0 = java.lang.System.currentTimeMillis()
            r5.A00 = r0
            r3.A02(r5)
            X.1DT r0 = r3.A02
        L_0x0109:
            r0.A0F(r5)
            return
        L_0x010d:
            java.lang.Object r4 = r5.A01
            X.A2L r4 = (X.A2L) r4
            boolean r3 = r5.A03
            r2 = 47
            if (r3 == 0) goto L_0x0119
            r2 = 32
        L_0x0119:
            java.lang.Object r5 = r5.A02
            X.AEy r5 = (X.C20290AEy) r5
            java.lang.String r0 = r5.A01
            r1 = 2
            boolean r0 = X.C196559vG.A01(r0)
            if (r0 == 0) goto L_0x0127
            r1 = 3
        L_0x0127:
            X.A2L.A00(r5, r4, r2, r1, r3)
            long r0 = java.lang.System.currentTimeMillis()
            r5.A00 = r0
            r4.A02(r5)
            X.1DT r0 = r4.A01
            goto L_0x0109
        L_0x0136:
            java.lang.Object r1 = r12.A01
            X.8wQ r1 = (X.C174218wQ) r1
            java.util.List r0 = X.C42011xT.A0I
            com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryConsumerHomeViewModel r1 = r1.A00
            X.AM7 r2 = com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryConsumerHomeViewModel.A00(r1)
            X.A5L r0 = r1.A07
            java.lang.Integer r3 = r0.A04()
            r8 = 1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
            r5 = 0
            r6 = 0
            r7 = 7
            r2.A08(r3, r4, r5, r6, r7, r8)
            X.1wy r1 = r1.A0D
            r0 = 6
            X.AnonymousClass3MX.A1J(r1, r0)
            return
        L_0x015a:
            java.lang.Object r1 = r12.A01
            X.8w7 r1 = (X.C174028w7) r1
            java.util.List r0 = X.C42011xT.A0I
            X.AP6 r3 = r1.A00
            java.lang.Class<X.AP6> r2 = X.AP6.class
            monitor-enter(r2)
            X.9hD r1 = r3.A06     // Catch:{ all -> 0x016f }
            r0 = 3
            r1.A02 = r0     // Catch:{ all -> 0x016f }
            r3.A0A()     // Catch:{ all -> 0x016f }
            monitor-exit(r2)     // Catch:{ all -> 0x016f }
            return
        L_0x016f:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x016f }
            throw r0
        L_0x0172:
            java.lang.Object r1 = r12.A01
            X.8w7 r1 = (X.C174028w7) r1
            java.util.List r0 = X.C42011xT.A0I
            X.AP6 r3 = r1.A00
            java.lang.Class<X.AP6> r2 = X.AP6.class
            monitor-enter(r2)
            X.9hD r1 = r3.A06     // Catch:{ all -> 0x0187 }
            r0 = 3
            r1.A02 = r0     // Catch:{ all -> 0x0187 }
            r3.A0A()     // Catch:{ all -> 0x0187 }
            monitor-exit(r2)     // Catch:{ all -> 0x0187 }
            return
        L_0x0187:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0187 }
            throw r0
        L_0x018a:
            java.lang.Object r1 = r12.A01
            X.8wO r1 = (X.C174198wO) r1
            java.util.List r0 = X.C42011xT.A0I
            X.0vk r0 = r1.A00
            goto L_0x01e2
        L_0x0193:
            java.lang.Object r1 = r12.A01
            X.8wN r1 = (X.C174188wN) r1
            java.util.List r0 = X.C42011xT.A0I
            X.9X2 r0 = r1.A00
            X.AP6 r2 = r0.A00
            X.9hD r1 = r2.A06
            r0 = 9
            goto L_0x0283
        L_0x01a3:
            java.lang.Object r1 = r12.A01
            X.8wN r1 = (X.C174188wN) r1
            java.util.List r0 = X.C42011xT.A0I
            X.9X2 r0 = r1.A00
            X.AP6 r2 = r0.A00
            X.9hD r1 = r2.A06
            r0 = 8
            goto L_0x0283
        L_0x01b3:
            java.lang.Object r1 = r12.A01
            X.8wW r1 = (X.C174278wW) r1
            java.util.List r0 = X.C42011xT.A0I
            X.9X3 r0 = r1.A01
            X.AP6 r2 = r0.A00
            X.9hD r1 = r2.A06
            r0 = 7
            goto L_0x0283
        L_0x01c2:
            java.lang.Object r1 = r12.A01
            X.8wS r1 = (X.C174238wS) r1
            java.util.List r0 = X.C42011xT.A0I
            X.BAc r0 = r1.A00
            r0.Byj()
            return
        L_0x01ce:
            java.lang.Object r1 = r12.A01
            X.8wS r1 = (X.C174238wS) r1
            java.util.List r0 = X.C42011xT.A0I
            X.BAc r0 = r1.A00
            r0.BlM()
            return
        L_0x01da:
            java.lang.Object r1 = r12.A01
            X.8wV r1 = (X.C174268wV) r1
            java.util.List r0 = X.C42011xT.A0I
            X.0vk r0 = r1.A02
        L_0x01e2:
            r0.invoke()
            return
        L_0x01e6:
            java.lang.Object r1 = r12.A01
            X.BCq r1 = (X.C22557BCq) r1
            java.util.List r0 = X.C42011xT.A0I
            r1.C44()
            return
        L_0x01f0:
            java.lang.Object r1 = r12.A01
            X.BCq r1 = (X.C22557BCq) r1
            java.util.List r0 = X.C42011xT.A0I
            r1.C45()
            return
        L_0x01fa:
            java.lang.Object r1 = r12.A01
            X.BCq r1 = (X.C22557BCq) r1
            java.util.List r0 = X.C42011xT.A0I
            r1.Boj()
            return
        L_0x0204:
            java.lang.Object r1 = r12.A01
            X.BCq r1 = (X.C22557BCq) r1
            java.util.List r0 = X.C42011xT.A0I
            r1.C4r()
            return
        L_0x020e:
            java.lang.Object r1 = r12.A01
            X.BCq r1 = (X.C22557BCq) r1
            java.util.List r0 = X.C42011xT.A0I
            r1.BxL()
            return
        L_0x0218:
            java.lang.Object r0 = r12.A01
            X.8J2 r0 = (X.AnonymousClass8J2) r0
            X.BCk r0 = r0.A00
            r0.Bo2()
            return
        L_0x0222:
            java.lang.Object r1 = r12.A01
            X.8J2 r1 = (X.AnonymousClass8J2) r1
            java.util.List r0 = X.C42011xT.A0I
            X.BCk r0 = r1.A00
            r0.Boh()
            return
        L_0x022e:
            java.lang.Object r1 = r12.A01
            X.8wI r1 = (X.C174138wI) r1
            java.util.List r0 = X.C42011xT.A0I
            X.9ad r2 = r1.A00
            X.A2L r1 = r2.A01
            X.00H r0 = r1.A07
            java.lang.Object r3 = r0.get()
            X.AM7 r3 = (X.AM7) r3
            X.A5L r0 = r1.A04
            java.lang.Integer r4 = r0.A04()
            r7 = 1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)
            r6 = 0
            r8 = 34
            r9 = 5
            r3.A08(r4, r5, r6, r7, r8, r9)
            X.AEx r0 = r2.A00
            r1.A03(r0)
            return
        L_0x0258:
            java.lang.Object r2 = r12.A01
            com.whatsapp.businessdirectory.view.fragment.BusinessDirectorySearchFragment r2 = (com.whatsapp.businessdirectory.view.fragment.BusinessDirectorySearchFragment) r2
            com.google.android.material.chip.Chip r1 = r2.A00
            r0 = 8
            r1.setVisibility(r0)
            X.8FD r0 = r2.A0A
            X.AOq r0 = r0.A0N
            X.8FJ r0 = r0.A00
            r0.A0H()
            return
        L_0x026d:
            java.lang.Object r1 = r12.A01
            com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryLocationErrorDialog r1 = (com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryLocationErrorDialog) r1
            X.5ba r0 = r1.A02
            if (r0 == 0) goto L_0x0278
            r0.BxK()
        L_0x0278:
            r0 = 1
            r1.A03 = r0
            return
        L_0x027c:
            java.lang.Object r2 = r12.A01
            X.AP6 r2 = (X.AP6) r2
            X.9hD r1 = r2.A06
            r0 = 5
        L_0x0283:
            r1.A02 = r0
            r2.A0A()
            return
        L_0x0289:
            java.lang.Object r2 = r12.A01
            X.AP5 r2 = (X.AP5) r2
            X.9hx r1 = r2.A09
            r0 = 11
            r1.A03 = r0
            r2.A0B()
            return
        L_0x0297:
            java.lang.Object r0 = r12.A01
            android.app.Dialog r0 = (android.app.Dialog) r0
            r0.dismiss()
            return
        L_0x029f:
            java.lang.Object r0 = r12.A01
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.A28()
            return
        L_0x02a7:
            java.lang.Object r3 = r12.A01
            com.whatsapp.businessdirectory.view.custom.ClearLocationDialogFragment r3 = (com.whatsapp.businessdirectory.view.custom.ClearLocationDialogFragment) r3
            X.9nx r2 = r3.A00
            monitor-enter(r2)
            X.8ve r1 = r2.A00     // Catch:{ all -> 0x02d6 }
            r1.A00()     // Catch:{ all -> 0x02d6 }
            r0 = 0
            r1.A02(r0)     // Catch:{ all -> 0x02d6 }
            java.util.Set r0 = r2.A01     // Catch:{ all -> 0x02d4 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x02d4 }
        L_0x02bd:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x02d4 }
            if (r0 == 0) goto L_0x02cf
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x02d4 }
            X.APC r0 = (X.APC) r0     // Catch:{ all -> 0x02d4 }
            X.BCj r0 = r0.A07     // Catch:{ all -> 0x02d4 }
            r0.CRJ()     // Catch:{ all -> 0x02d4 }
            goto L_0x02bd
        L_0x02cf:
            monitor-exit(r2)
            r3.A28()
            return
        L_0x02d4:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x02d6 }
        L_0x02d6:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x02d9:
            java.lang.Object r3 = r12.A01
            com.whatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity r3 = (com.whatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity) r3
            X.AA9 r0 = r3.A0A
            boolean r0 = r0.A0D
            if (r0 != 0) goto L_0x0311
            X.0z4 r0 = r3.A0A
            java.lang.String[] r1 = X.C27091Ur.A09
            boolean r0 = X.AnonymousClass74O.A0S(r0, r1)
            if (r0 == 0) goto L_0x0311
            boolean r0 = X.AnonymousClass74O.A0N(r3, r1)
            if (r0 != 0) goto L_0x0311
            X.AA9 r2 = r3.A0A
            r1 = 0
            X.AP9 r0 = new X.AP9
            r0.<init>(r3, r1)
            r2.A02(r0)
            X.AA9 r0 = r3.A0A
            r2 = 1
            r0.A0E = r2
            X.8ve r0 = r0.A0J
            X.9kR r0 = r0.A03
            android.content.SharedPreferences$Editor r1 = X.AnonymousClass8BT.A05(r0)
            java.lang.String r0 = "DIRECTORY_LOCATION_INFO_SHOWN"
            X.C17880vN.A1F(r1, r0, r2)
            return
        L_0x0311:
            com.whatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity.A0q(r3)
            return
        L_0x0315:
            java.lang.Object r0 = r12.A01
            com.whatsapp.businessdirectory.view.activity.BusinessDirectorySERPMapViewActivity r0 = (com.whatsapp.businessdirectory.view.activity.BusinessDirectorySERPMapViewActivity) r0
            r0.onBackPressed()
            return
        L_0x031d:
            java.lang.Object r0 = r12.A01
            X.8kf r0 = (X.C169258kf) r0
            X.8FG r3 = r0.A4b()
            X.AM7 r4 = r3.A0J
            X.A5L r0 = r3.A0L
            java.lang.Integer r5 = r0.A04()
            r6 = 0
            r8 = 11
            r9 = 69
            r10 = 1
            r7 = r6
            r4.A08(r5, r6, r7, r8, r9, r10)
            boolean r0 = r0.A05()
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0348
            X.17x r0 = r3.A0Q
            boolean r0 = r0.A06()
            r2 = 0
            if (r0 != 0) goto L_0x0349
        L_0x0348:
            r2 = 1
        L_0x0349:
            X.1wy r1 = r3.A0W
            r0 = 7
            if (r2 == 0) goto L_0x034f
            r0 = 2
        L_0x034f:
            X.AnonymousClass3MX.A1J(r1, r0)
            r3.A0D = r10
            return
        L_0x0355:
            java.lang.Object r2 = r12.A01
            com.whatsapp.businessdirectory.view.activity.BusinessDirectoryActivity r2 = (com.whatsapp.businessdirectory.view.activity.BusinessDirectoryActivity) r2
            java.util.TimerTask r0 = r2.A0E
            if (r0 == 0) goto L_0x0360
            r0.cancel()
        L_0x0360:
            com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryContextualSearchFragment r4 = r2.A03
            if (r4 == 0) goto L_0x0390
            android.os.Bundle r3 = r4.A06
            if (r3 == 0) goto L_0x039a
            java.lang.String r1 = "ARG_PREVIOUS_SCREEN"
            r0 = -1
            int r0 = r3.getInt(r1, r0)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
        L_0x0373:
            com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel r1 = r4.A07
            int r0 = r1.A01
            r9 = 1
            boolean r0 = X.AnonymousClass000.A1T(r0, r9)
            X.AM7 r3 = com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel.A03(r1)
            r7 = 1
            r8 = 31
            if (r0 == 0) goto L_0x0388
            r7 = 2
            r8 = 30
        L_0x0388:
            java.lang.Integer r4 = X.A5L.A00(r1)
            r6 = 0
            r3.A08(r4, r5, r6, r7, r8, r9)
        L_0x0390:
            X.99t r1 = r2.A02
            r0 = 1
            r1.A05(r0)
            r2.onBackPressed()
            return
        L_0x039a:
            r5 = 0
            goto L_0x0373
        L_0x039c:
            java.lang.Object r0 = r12.A01
            X.AnonymousClass3MW.A1U(r0)
            return
        L_0x03a2:
            java.lang.Object r2 = r12.A01
            X.9aX r2 = (X.C184179aX) r2
            java.util.List r0 = X.C42011xT.A0I
            boolean r0 = r2 instanceof X.C169028kF
            if (r0 == 0) goto L_0x03b6
            X.BAV r1 = r2.A00
            X.8kF r2 = (X.C169028kF) r2
            X.9rR r0 = r2.A00
            r1.BwE(r0)
            return
        L_0x03b6:
            X.BAV r0 = r2.A00
            r0.C49()
            return
        L_0x03bc:
            java.lang.Object r3 = r12.A01
            X.8kE r3 = (X.C169018kE) r3
            X.2UJ r0 = r3.A0F
            if (r0 == 0) goto L_0x03d2
            com.whatsapp.jid.UserJid r2 = r3.A4c()
            r1 = 0
            r0 = 2
            com.whatsapp.biz.cart.view.fragment.CartFragment r0 = X.AnonymousClass9PJ.A00(r2, r1, r0)
            r3.CMl(r0)
            return
        L_0x03d2:
            java.lang.String r0 = "orderFragments"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x03d9:
            java.lang.Object r1 = r12.A01
            X.8wL r1 = (X.C174168wL) r1
            java.util.List r0 = X.C42011xT.A0I
            X.9Wz r0 = r1.A00
            X.8F9 r4 = r0.A00
            r3 = 0
            r4.A00 = r3
            X.1Dg r2 = r4.A05
            java.lang.Object r0 = r2.A06()
            if (r0 == 0) goto L_0x040c
            java.lang.Object r0 = r2.A06()
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.ArrayList r1 = X.C17880vN.A10(r0)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x040c
            java.lang.Object r0 = r1.get(r3)
            boolean r0 = r0 instanceof X.C174168wL
            if (r0 == 0) goto L_0x040c
            r1.remove(r3)
            r2.A0E(r1)
        L_0x040c:
            X.1wy r1 = r4.A0G
            r0 = 2
            X.AnonymousClass3MX.A1K(r1, r0)
            return
        L_0x0413:
            java.lang.Object r1 = r12.A01
            X.8wA r1 = (X.C174058wA) r1
            java.util.List r0 = X.C42011xT.A0I
            X.B7b r0 = r1.A01
            r0.C42(r1)
            return
        L_0x041f:
            java.lang.Object r1 = r12.A01
            X.8wX r1 = (X.C174288wX) r1
            java.util.List r0 = X.C42011xT.A0I
            X.1Di r0 = r1.A03
            X.C18070vi.A0b(r13)
            r0.invoke(r13)
            return
        L_0x042e:
            java.lang.Object r1 = r12.A01
            com.whatsapp.businessapisearch.view.activity.BusinessApiSearchActivity r1 = (com.whatsapp.businessapisearch.view.activity.BusinessApiSearchActivity) r1
            com.whatsapp.businessapisearch.view.fragment.BusinessApiHomeFragment r0 = r1.A02
            if (r0 == 0) goto L_0x043a
            r0.A26()
            return
        L_0x043a:
            r1.onBackPressed()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AFN.onClick(android.view.View):void");
    }
}
