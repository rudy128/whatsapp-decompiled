package X;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: X.2tK  reason: invalid class name and case insensitive filesystem */
public class C63572tK {
    public static final C63572tK A0E;
    public static final C63572tK A0F;
    public static final C63572tK A0G;
    public static final C63572tK[] A0H;
    public final int A00;
    public final int A01;
    public final AnonymousClass1KJ A02;
    public final String A03;
    public final String A04;
    public final LinkedHashSet A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final int[] A09;
    public final int[] A0A;
    public final AnonymousClass1QM[] A0B;
    public final AnonymousClass1QM[] A0C;
    public final AnonymousClass1QM[] A0D;

    static {
        AnonymousClass1KJ r14 = AnonymousClass1KL.A0C;
        C63572tK r13 = new C63572tK(r14, "UNSET", "UNSET", new LinkedHashSet(Collections.singletonList(r14)), (int[]) null, (int[]) null, (AnonymousClass1QM[]) null, (AnonymousClass1QM[]) null, new AnonymousClass1QM[0], 0, 0, false, false, false);
        A0G = r13;
        AnonymousClass1KJ r15 = AnonymousClass1KL.A0B;
        LinkedHashSet linkedHashSet = new LinkedHashSet(Collections.singletonList(r15));
        LinkedHashSet linkedHashSet2 = linkedHashSet;
        int[] iArr = {2};
        C63572tK r142 = new C63572tK(r15, "IN", "91", linkedHashSet2, iArr, new int[]{2}, new AnonymousClass1QM[]{new AnonymousClass1QM("tos_no_wallet", "1", false), new AnonymousClass1QM("add_bank", "1", false), new AnonymousClass1QM("2fa", "1", false)}, new AnonymousClass1QM[]{new AnonymousClass1QM("add_payment_service", "1", false)}, new AnonymousClass1QM[0], 3, 3, true, true, true);
        A0F = r142;
        AnonymousClass1KJ r16 = AnonymousClass1KL.A0A;
        LinkedHashSet linkedHashSet3 = new LinkedHashSet(Collections.singletonList(r16));
        AnonymousClass1QM[] r3 = {new AnonymousClass1QM("tos_no_wallet", "1", false), new AnonymousClass1QM("kyc", "1", false), new AnonymousClass1QM("add_card", "1", false)};
        int[] iArr2 = {1, 4, 6};
        int[] iArr3 = {1, 4, 6};
        AnonymousClass1QM[] r22 = r3;
        LinkedHashSet linkedHashSet4 = linkedHashSet3;
        C63572tK r152 = new C63572tK(r16, "BR", "55", linkedHashSet4, iArr2, iArr3, r22, new AnonymousClass1QM[]{new AnonymousClass1QM("add_business", "1", false)}, new AnonymousClass1QM[]{new AnonymousClass1QM("custom_payment_method_tos", "1", false)}, 1, 1, true, true, false);
        A0E = r152;
        A0H = new C63572tK[]{r13, r142, r152};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001f, code lost:
        if (r1.A03.equalsIgnoreCase(r6) != false) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C63572tK A00(java.lang.String r6) {
        /*
            if (r6 == 0) goto L_0x0022
            X.2tK[] r5 = A0H
            r4 = 3
            r3 = 0
            r2 = 0
        L_0x0007:
            r1 = r5[r2]
            java.lang.String r0 = r1.A03
            boolean r0 = r0.equalsIgnoreCase(r6)
            if (r0 != 0) goto L_0x0021
            int r2 = r2 + 1
            if (r2 < r4) goto L_0x0007
            X.2tK[] r0 = X.C50872Wc.A00
            r1 = r0[r3]
            java.lang.String r0 = r1.A03
            boolean r0 = r0.equalsIgnoreCase(r6)
            if (r0 == 0) goto L_0x0022
        L_0x0021:
            return r1
        L_0x0022:
            X.2tK r0 = A0G
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63572tK.A00(java.lang.String):X.2tK");
    }

    public AnonymousClass1KJ A02() {
        Iterator it = this.A05.iterator();
        while (it.hasNext()) {
            AnonymousClass1KJ r1 = (AnonymousClass1KJ) it.next();
            if (((AnonymousClass1KK) r1).A00 == 0) {
                return r1;
            }
        }
        return null;
    }

    public AnonymousClass1QM[] A03(String str) {
        if ("merchant_account_linking_context".equals(str)) {
            return this.A0C;
        }
        if ("custom_payment_method_linking".equals(str)) {
            return this.A0B;
        }
        return this.A0D;
    }

    public C63572tK(AnonymousClass1KJ r1, String str, String str2, LinkedHashSet linkedHashSet, int[] iArr, int[] iArr2, AnonymousClass1QM[] r7, AnonymousClass1QM[] r8, AnonymousClass1QM[] r9, int i, int i2, boolean z, boolean z2, boolean z3) {
        C17960vV.A06(str);
        this.A03 = str;
        this.A04 = str2;
        this.A06 = z;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = r1;
        this.A05 = linkedHashSet;
        this.A08 = z2;
        this.A09 = iArr;
        this.A0A = iArr2;
        this.A0D = r7;
        this.A0C = r8;
        this.A0B = r9;
        this.A07 = z3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        if (r1.A04.equalsIgnoreCase(r6) != false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0025, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C63572tK A01(java.lang.String r6) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x0026
            X.2tK[] r5 = A0H
            r4 = 3
            r3 = 0
            r2 = 0
        L_0x000b:
            r1 = r5[r2]
            java.lang.String r0 = r1.A04
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x0025
            int r2 = r2 + 1
            if (r2 < r4) goto L_0x000b
            X.2tK[] r0 = X.C50872Wc.A00
            r1 = r0[r3]
            java.lang.String r0 = r1.A04
            boolean r0 = r0.equalsIgnoreCase(r6)
            if (r0 == 0) goto L_0x0026
        L_0x0025:
            return r1
        L_0x0026:
            X.2tK r0 = A0G
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63572tK.A01(java.lang.String):X.2tK");
    }
}
