package X;

import android.content.Context;
import android.util.SparseArray;
import android.view.MenuItem;
import android.view.View;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.1LF  reason: invalid class name */
public final class AnonymousClass1LF {
    public C454028v A00;
    public C28941bJ A01;
    public final int A02;
    public final AnonymousClass1LI A03 = new AnonymousClass1LI(80);
    public final AnonymousClass1LI A04 = new AnonymousClass1LI(3);
    public final C18000vb A05;
    public final C18030ve A06;
    public final AnonymousClass00H A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;

    public AnonymousClass1LF(C18000vb r9, C18030ve r10, AnonymousClass1DC r11, AnonymousClass00H r12) {
        C18070vi.A0d(r11, 1);
        C18070vi.A0d(r10, 2);
        C18070vi.A0d(r9, 3);
        C18070vi.A0d(r12, 4);
        this.A06 = r10;
        this.A05 = r9;
        this.A07 = r12;
        this.A08 = false | C18020vd.A05(C18040vf.A01, r10, 3625);
        C18040vf r2 = C18040vf.A02;
        int A002 = C18020vd.A00(r2, r10, 5378);
        this.A02 = A002;
        List asList = Arrays.asList(new Integer[]{10, 12});
        C18070vi.A0X(asList);
        this.A0E = asList.contains(Integer.valueOf(A002));
        this.A0C = C18020vd.A05(r2, r10, 4459);
        this.A0B = C18020vd.A05(r2, r10, 4458);
        this.A0A = C18020vd.A05(r2, r10, 4562);
        this.A0D = C18020vd.A05(r2, r10, 5376);
        this.A09 = C18020vd.A05(r2, r10, 6988);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        r0 = X.C28851b7.A08(0, r5.getChildCount());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final android.view.View A00(android.view.View r5) {
        /*
            r4 = this;
            java.lang.Class<X.1bP> r1 = X.C28991bP.class
            if (r5 == 0) goto L_0x0010
            boolean r0 = r1.isInstance(r5)
            if (r0 == 0) goto L_0x0011
            java.lang.Object r5 = r1.cast(r5)
            android.view.View r5 = (android.view.View) r5
        L_0x0010:
            return r5
        L_0x0011:
            boolean r0 = r5 instanceof android.view.ViewGroup
            r3 = 0
            if (r0 == 0) goto L_0x0039
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            if (r5 == 0) goto L_0x0039
            r1 = 0
            int r0 = r5.getChildCount()
            X.1Oc r0 = X.C28851b7.A08(r1, r0)
            int r2 = r0.A00
            int r1 = r0.A01
            if (r2 > r1) goto L_0x0039
        L_0x0029:
            android.view.View r0 = r5.getChildAt(r2)
            android.view.View r0 = r4.A00(r0)
            if (r0 == 0) goto L_0x0034
            return r0
        L_0x0034:
            if (r2 == r1) goto L_0x0039
            int r2 = r2 + 1
            goto L_0x0029
        L_0x0039:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1LF.A00(android.view.View):android.view.View");
    }

    private final void A02(MenuItem menuItem, C29221bq r6, C28941bJ r7, C49662Rj r8) {
        View findViewById;
        View findViewById2;
        if (!C18070vi.A18(r8, AnonymousClass2JP.A00)) {
            C29341c3 r0 = (C29341c3) r7.A04.A0N.get(menuItem.getItemId());
            if (r0 != null) {
                r0.A09(false);
            }
            if (!(r6 == null || (findViewById2 = r6.findViewById(2131428337)) == null)) {
                findViewById2.setVisibility(8);
            }
        }
        if (!(r8 instanceof AnonymousClass2JN)) {
            C29341c3 r02 = (C29341c3) r7.A04.A0N.get(menuItem.getItemId());
            if (r02 != null) {
                r02.A09(false);
            }
        }
        if (!C18070vi.A18(r8, AnonymousClass2JO.A00) && r6 != null && (findViewById = r6.findViewById(2131427802)) != null) {
            findViewById.setVisibility(8);
            C454028v r03 = this.A00;
            if (r03 != null) {
                r03.stop();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x011d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0070  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A03(int r17) {
        /*
            r16 = this;
            r0 = 600(0x258, float:8.41E-43)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            r0 = 800(0x320, float:1.121E-42)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            r0 = 300(0x12c, float:4.2E-43)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            r0 = 400(0x190, float:5.6E-43)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            r0 = 200(0xc8, float:2.8E-43)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            r15 = 0
            r2 = 5
            r14 = 2
            java.lang.Integer r9 = java.lang.Integer.valueOf(r14)
            r13 = 1
            java.lang.Integer r11 = java.lang.Integer.valueOf(r13)
            r0 = 3
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r12 = 4
            java.lang.Integer r3 = java.lang.Integer.valueOf(r12)
            r1 = r16
            boolean r0 = r1.A0C
            if (r0 == 0) goto L_0x0075
            X.1D6[] r2 = new X.AnonymousClass1D6[r2]
            X.1D6 r0 = new X.1D6
            r0.<init>(r10, r11)
            r2[r15] = r0
            X.1D6 r0 = new X.1D6
            r0.<init>(r7, r9)
            r2[r13] = r0
            X.1D6 r0 = new X.1D6
            r0.<init>(r8, r4)
            r2[r14] = r0
            X.1D6 r1 = new X.1D6
            r1.<init>(r5, r3)
        L_0x0056:
            r0 = 3
            r2[r0] = r1
            X.1D6 r0 = new X.1D6
            r0.<init>(r6, r3)
        L_0x005e:
            r2[r12] = r0
            java.util.LinkedHashMap r1 = X.AnonymousClass1D7.A0B(r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r17)
            java.lang.Object r0 = r1.get(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x011d
            int r0 = r0.intValue()
            return r0
        L_0x0075:
            boolean r0 = r1.A0B
            if (r0 == 0) goto L_0x0096
            X.1D6[] r2 = new X.AnonymousClass1D6[r2]
            X.1D6 r0 = new X.1D6
            r0.<init>(r10, r11)
            r2[r15] = r0
            X.1D6 r0 = new X.1D6
            r0.<init>(r7, r9)
            r2[r13] = r0
            X.1D6 r0 = new X.1D6
            r0.<init>(r5, r4)
        L_0x008e:
            r2[r14] = r0
            X.1D6 r1 = new X.1D6
            r1.<init>(r8, r3)
            goto L_0x0056
        L_0x0096:
            boolean r0 = r1.A0A
            if (r0 == 0) goto L_0x00b0
            X.1D6[] r2 = new X.AnonymousClass1D6[r2]
            X.1D6 r0 = new X.1D6
            r0.<init>(r10, r11)
            r2[r15] = r0
            X.1D6 r0 = new X.1D6
            r0.<init>(r5, r9)
            r2[r13] = r0
            X.1D6 r0 = new X.1D6
            r0.<init>(r7, r4)
            goto L_0x008e
        L_0x00b0:
            boolean r0 = r1.A09
            if (r0 == 0) goto L_0x00d9
            X.1D6[] r2 = new X.AnonymousClass1D6[r2]
            X.1D6 r0 = new X.1D6
            r0.<init>(r10, r11)
            r2[r15] = r0
            X.1D6 r0 = new X.1D6
            r0.<init>(r5, r9)
            r2[r13] = r0
            X.1D6 r0 = new X.1D6
            r0.<init>(r8, r4)
            r2[r14] = r0
            X.1D6 r1 = new X.1D6
            r1.<init>(r6, r4)
            r0 = 3
            r2[r0] = r1
            X.1D6 r0 = new X.1D6
            r0.<init>(r7, r3)
            goto L_0x005e
        L_0x00d9:
            boolean r1 = r1.A0D
            X.1D6[] r2 = new X.AnonymousClass1D6[r2]
            X.1D6 r0 = new X.1D6
            if (r1 == 0) goto L_0x0103
            r0.<init>(r7, r11)
            r2[r15] = r0
            X.1D6 r0 = new X.1D6
            r0.<init>(r10, r9)
            r2[r13] = r0
            X.1D6 r0 = new X.1D6
            r0.<init>(r8, r4)
            r2[r14] = r0
            X.1D6 r1 = new X.1D6
            r1.<init>(r6, r4)
            r0 = 3
            r2[r0] = r1
            X.1D6 r0 = new X.1D6
            r0.<init>(r5, r3)
            goto L_0x005e
        L_0x0103:
            r0.<init>(r10, r11)
            r2[r15] = r0
            X.1D6 r0 = new X.1D6
            r0.<init>(r5, r9)
            r2[r13] = r0
            X.1D6 r0 = new X.1D6
            r0.<init>(r8, r4)
            r2[r14] = r0
            X.1D6 r1 = new X.1D6
            r1.<init>(r7, r3)
            goto L_0x0056
        L_0x011d:
            r0 = 2147483647(0x7fffffff, float:NaN)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1LF.A03(int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003d, code lost:
        if ((r1 instanceof X.C29221bq) != false) goto L_0x003f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0164  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(android.content.Context r7, X.C49672Rk r8, int r9) {
        /*
            r6 = this;
            X.1bJ r2 = r6.A01
            if (r2 == 0) goto L_0x00d1
            X.1bM r0 = r2.A03
            int r0 = r0.size()
            if (r0 == 0) goto L_0x00d1
            if (r9 < 0) goto L_0x01c8
            X.1bM r1 = r2.A03
            int r0 = r1.size()
            if (r9 > r0) goto L_0x01c8
            int r0 = r1.size()
            if (r0 == 0) goto L_0x01c8
            android.view.MenuItem r3 = r1.getItem(r9)
            if (r3 == 0) goto L_0x00d1
            X.0ve r4 = r6.A06
            r1 = 8326(0x2086, float:1.1667E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r4, r1)
            r4 = 0
            if (r0 == 0) goto L_0x0174
            X.1bJ r1 = r6.A01
            if (r1 == 0) goto L_0x0171
            int r0 = r3.getItemId()
            android.view.View r1 = r1.findViewById(r0)
        L_0x003b:
            boolean r0 = r1 instanceof X.C29221bq
            if (r0 == 0) goto L_0x0042
        L_0x003f:
            r4 = r1
            X.1bq r4 = (X.C29221bq) r4
        L_0x0042:
            boolean r0 = r8 instanceof X.AnonymousClass2JQ
            if (r0 == 0) goto L_0x0164
            X.2JQ r8 = (X.AnonymousClass2JQ) r8
            X.2Rj r1 = r8.A00
            r6.A02(r3, r4, r2, r1)
            boolean r0 = r1 instanceof X.AnonymousClass2JN
            if (r0 == 0) goto L_0x00d2
            X.2JN r1 = (X.AnonymousClass2JN) r1
            int r5 = r1.A00
            if (r5 == 0) goto L_0x00d1
            X.1c3 r2 = A01(r7, r3, r2)
            r2.A07()
            r0 = 1086324736(0x40c00000, float:6.0)
            int r0 = X.C62762rw.A01(r7, r0)
            X.2fK r1 = r2.A08
            X.2uw r4 = r1.A04
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.A0E = r0
            X.2uw r3 = r1.A03
            r3.A0E = r0
            X.C29341c3.A04(r2)
            r4.A0D = r0
            r3.A0D = r0
            X.C29341c3.A04(r2)
            r0 = 1090519040(0x41000000, float:8.0)
            int r0 = X.C62762rw.A01(r7, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.A0G = r0
            r3.A0G = r0
            X.C29341c3.A04(r2)
            r4.A0F = r0
            r3.A0F = r0
            X.C29341c3.A04(r2)
            X.0vb r0 = r6.A05
            java.util.Locale r1 = r0.A0N()
            java.util.Locale r0 = r3.A0H
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00a9
            r4.A0H = r1
            r3.A0H = r1
            r2.invalidateSelf()
        L_0x00a9:
            r1 = 3
            int r0 = r3.A04
            if (r0 == r1) goto L_0x00b5
            r4.A04 = r1
            r3.A04 = r1
            X.C29341c3.A03(r2)
        L_0x00b5:
            r0 = 0
            int r1 = java.lang.Math.max(r0, r5)
            int r0 = r3.A05
            if (r0 == r1) goto L_0x00cd
            r4.A05 = r1
            r3.A05 = r1
            X.CZD r1 = r2.A09
            r0 = 1
            r1.A02 = r0
            X.C29341c3.A04(r2)
            r2.invalidateSelf()
        L_0x00cd:
            r0 = 1
            r2.A09(r0)
        L_0x00d1:
            return
        L_0x00d2:
            X.2JP r0 = X.AnonymousClass2JP.A00
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x0106
            boolean r0 = r6.A0E
            if (r0 == 0) goto L_0x0186
            if (r4 == 0) goto L_0x00d1
            r0 = 2131428337(0x7f0b03f1, float:1.8478316E38)
            android.view.View r1 = r4.findViewById(r0)
            if (r1 != 0) goto L_0x0101
            int r1 = r6.A02
            r0 = 12
            r2 = 2131624321(0x7f0e0181, float:1.8875818E38)
            if (r1 != r0) goto L_0x00f5
            r2 = 2131624322(0x7f0e0182, float:1.887582E38)
        L_0x00f5:
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r7)
            r0 = 1
            android.view.View r1 = r1.inflate(r2, r4, r0)
            X.C18070vi.A0X(r1)
        L_0x0101:
            r0 = 0
            r1.setVisibility(r0)
            return
        L_0x0106:
            X.2JO r0 = X.AnonymousClass2JO.A00
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x00d1
            r1 = 0
            if (r4 == 0) goto L_0x00d1
            r0 = 2131427802(0x7f0b01da, float:1.847723E38)
            android.view.View r0 = r4.findViewById(r0)
            if (r0 == 0) goto L_0x0125
            r0.setVisibility(r1)
        L_0x011d:
            X.28v r0 = r6.A00
            if (r0 == 0) goto L_0x00d1
            r0.start()
            return
        L_0x0125:
            android.content.Context r3 = r2.getContext()
            X.C18070vi.A0X(r3)
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r3)
            r1 = 2131624193(0x7f0e0101, float:1.8875559E38)
            r0 = 1
            android.view.View r1 = r2.inflate(r1, r4, r0)
            r0 = 2131427802(0x7f0b01da, float:1.847723E38)
            android.view.View r2 = r1.findViewById(r0)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r1 <= r0) goto L_0x015d
            X.28v r0 = r6.A00
            if (r0 != 0) goto L_0x0156
            r0 = 2131231763(0x7f080413, float:1.8079616E38)
            X.28v r0 = X.C454028v.A03(r3, r0)
            if (r0 == 0) goto L_0x011d
            r6.A00 = r0
        L_0x0156:
            r2.setImageDrawable(r0)
            r0.start()
            goto L_0x011d
        L_0x015d:
            r0 = 2131233230(0x7f0809ce, float:1.8082592E38)
            r2.setImageResource(r0)
            goto L_0x011d
        L_0x0164:
            X.2JR r0 = X.AnonymousClass2JR.A00
            boolean r0 = X.C18070vi.A18(r8, r0)
            if (r0 == 0) goto L_0x00d1
            r0 = 0
            r6.A02(r3, r4, r2, r0)
            return
        L_0x0171:
            r1 = r4
            goto L_0x003b
        L_0x0174:
            X.1bJ r0 = r6.A01
            android.view.View r1 = r6.A00(r0)
            if (r1 == 0) goto L_0x0042
            int r0 = r3.getItemId()
            android.view.View r1 = r1.findViewById(r0)
            goto L_0x003f
        L_0x0186:
            X.1c3 r3 = A01(r7, r3, r2)
            r3.A07()
            r0 = 1073741824(0x40000000, float:2.0)
            int r0 = X.C62762rw.A01(r7, r0)
            X.2fK r1 = r3.A08
            X.2uw r2 = r1.A04
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A0E = r0
            X.2uw r1 = r1.A03
            r1.A0E = r0
            X.C29341c3.A04(r3)
            r2.A0D = r0
            r1.A0D = r0
            X.C29341c3.A04(r3)
            r0 = 1086324736(0x40c00000, float:6.0)
            int r0 = X.C62762rw.A01(r7, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A0G = r0
            r1.A0G = r0
            X.C29341c3.A04(r3)
            r2.A0F = r0
            r1.A0F = r0
            X.C29341c3.A04(r3)
            r0 = 1
            r3.A09(r0)
            return
        L_0x01c8:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Tried to set badge for invalid tab id, index: "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = ", count: "
            r1.append(r0)
            int r0 = r2.getChildCount()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r1)
            r0 = 0
            X.C17960vV.A0F(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1LF.A04(android.content.Context, X.2Rk, int):void");
    }

    public static final C29341c3 A01(Context context, MenuItem menuItem, C28941bJ r9) {
        int itemId = menuItem.getItemId();
        C28991bP r3 = r9.A04;
        if (itemId != -1) {
            SparseArray sparseArray = r3.A0N;
            C29341c3 r4 = (C29341c3) sparseArray.get(itemId);
            if (r4 == null) {
                r4 = new C29341c3(r3.getContext(), (C64542uw) null);
                sparseArray.put(itemId, r4);
            }
            C29221bq[] r5 = r3.A0J;
            if (r5 != null) {
                int length = r5.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    C29221bq r1 = r5[i];
                    if (r1.getId() == itemId) {
                        r1.setBadge(r4);
                        break;
                    }
                    i++;
                }
            }
            int A002 = C19740yt.A00(context, AnonymousClass1YL.A00(context, 2130968844, 2131099924));
            C55172fK r12 = r4.A08;
            C64542uw r32 = r12.A04;
            Integer valueOf = Integer.valueOf(A002);
            r32.A0A = valueOf;
            C64542uw r2 = r12.A03;
            r2.A0A = valueOf;
            C29341c3.A01(r4);
            if (r2.A0B.intValue() != 8388661) {
                r32.A0B = 8388661;
                r2.A0B = 8388661;
                C29341c3.A02(r4);
            }
            return r4;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(itemId);
        sb.append(" is not a valid view id");
        throw new IllegalArgumentException(sb.toString());
    }
}
