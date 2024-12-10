package X;

import android.content.Context;
import android.os.Build;

/* renamed from: X.4YR  reason: invalid class name */
public class AnonymousClass4YR {
    public static final int[] A03 = (Build.VERSION.SDK_INT >= 29 ? new int[]{2131896023, 2131896024, 2131896021} : new int[]{2131896024, 2131896021});
    public final AnonymousClass11O A00;
    public final Context A01;
    public final C18000vb A02;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (r4 != 2) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002f, code lost:
        if (r4 != 2) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.AnonymousClass1FU r7) {
        /*
            r6 = this;
            r5 = 2
            X.11O r0 = r6.A00
            int r4 = r0.A00()
            int r2 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            r0 = 1
            r3 = 2
            if (r2 < r1) goto L_0x002f
            if (r4 == r0) goto L_0x0032
            if (r4 == r5) goto L_0x0014
        L_0x0013:
            r3 = 0
        L_0x0014:
            r2 = 2131896022(0x7f1226d6, float:1.9426894E38)
            X.0vb r1 = r6.A02
            int[] r0 = A03
            java.lang.String[] r0 = r1.A0R(r0)
            android.os.Bundle r1 = com.whatsapp.SingleSelectionDialogFragment.A03(r0, r5, r3, r2)
            com.whatsapp.SingleSelectionDialogFragment r0 = new com.whatsapp.SingleSelectionDialogFragment
            r0.<init>()
            r0.A1R(r1)
            r7.CMl(r0)
            return
        L_0x002f:
            if (r4 == r5) goto L_0x0032
            goto L_0x0013
        L_0x0032:
            r3 = 1
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4YR.A01(X.1FU):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        if (r4 != 2) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001e, code lost:
        if (r4 != 2) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A00() {
        /*
            r7 = this;
            android.content.Context r6 = r7.A01
            int[] r5 = A03
            X.11O r0 = r7.A00
            int r4 = r0.A00()
            int r3 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            r1 = 1
            r0 = 2
            if (r3 < r2) goto L_0x001e
            if (r4 == r1) goto L_0x0021
            if (r4 == r0) goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            r0 = r5[r0]
            java.lang.String r0 = r6.getString(r0)
            return r0
        L_0x001e:
            if (r4 == r0) goto L_0x0021
            goto L_0x0016
        L_0x0021:
            r0 = 1
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4YR.A00():java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        if (r7 == 2) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        if (r7 != 1) goto L_0x0028;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0016  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A02(int r7) {
        /*
            r6 = this;
            X.11O r5 = r6.A00
            int r4 = r5.A00()
            int r3 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            r1 = 2
            r0 = 1
            if (r3 < r2) goto L_0x0026
            if (r7 == r0) goto L_0x0028
            r2 = -1
            if (r7 != r1) goto L_0x0014
        L_0x0013:
            r2 = 2
        L_0x0014:
            if (r4 == r2) goto L_0x002a
            android.content.SharedPreferences r0 = r5.A00
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "night_mode"
            X.C17880vN.A1C(r1, r0, r2)
            X.AnonymousClass013.A03(r2)
            r0 = 1
            return r0
        L_0x0026:
            if (r7 == r0) goto L_0x0013
        L_0x0028:
            r2 = 1
            goto L_0x0014
        L_0x002a:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4YR.A02(int):boolean");
    }

    public AnonymousClass4YR(Context context, AnonymousClass11O r2, C18000vb r3) {
        this.A01 = context;
        this.A02 = r3;
        this.A00 = r2;
    }
}
