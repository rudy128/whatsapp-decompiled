package com.whatsapp.polls.creator;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass11P;
import X.AnonymousClass1DS;
import X.AnonymousClass1DT;
import X.AnonymousClass1J2;
import X.AnonymousClass3MW;
import X.C108985cd;
import X.C109005cf;
import X.C1769396i;
import X.C1769496j;
import X.C1769596k;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C18100vl;
import X.C183499Ym;
import X.C21528Alb;
import X.C29431cG;
import X.C33251iW;
import X.C41731wy;
import X.C72453Mb;
import android.text.TextUtils;
import java.util.Collection;
import java.util.List;

public final class PollCreatorViewModel extends AnonymousClass1J2 {
    public int A00;
    public int A01;
    public final AnonymousClass1DS A02;
    public final AnonymousClass1DT A03;
    public final AnonymousClass1DT A04;
    public final AnonymousClass1DT A05;
    public final AnonymousClass1DT A06 = AnonymousClass3MW.A0L();
    public final AnonymousClass1DT A07;
    public final C18030ve A08;
    public final C1769496j A09;
    public final C41731wy A0A;
    public final C41731wy A0B;
    public final C41731wy A0C;
    public final List A0D = AnonymousClass000.A13();
    public final List A0E;
    public final C18100vl A0F;
    public final AnonymousClass1DS A0G;
    public final AnonymousClass1DS A0H;
    public final C33251iW A0I;
    public final AnonymousClass11P A0J;
    public final C1769396i A0K;
    public final AnonymousClass00H A0L;
    public final AnonymousClass00H A0M;

    /* JADX WARNING: type inference failed for: r1v1, types: [X.9Ym, X.96j] */
    /* JADX WARNING: type inference failed for: r0v12, types: [X.9Ym, X.96i] */
    public PollCreatorViewModel(C33251iW r8, AnonymousClass11P r9, C18030ve r10, AnonymousClass00H r11, AnonymousClass00H r12) {
        C18070vi.A0d(r9, 1);
        C18070vi.A0p(r10, r8, r11);
        C18070vi.A0d(r12, 5);
        this.A0J = r9;
        this.A08 = r10;
        this.A0I = r8;
        this.A0L = r11;
        this.A0M = r12;
        AnonymousClass1DT A0M2 = AnonymousClass3MW.A0M(true);
        this.A05 = A0M2;
        AnonymousClass1DT A0M3 = AnonymousClass3MW.A0M(AnonymousClass000.A0h());
        this.A07 = A0M3;
        AnonymousClass1DT A0M4 = AnonymousClass3MW.A0M((Object) null);
        this.A03 = A0M4;
        this.A0B = AnonymousClass3MW.A0o();
        this.A0A = AnonymousClass3MW.A0o();
        this.A04 = AnonymousClass3MW.A0L();
        this.A0E = AnonymousClass000.A13();
        this.A00 = -1;
        ? r1 = new C183499Ym(-2);
        r1.A00 = "";
        this.A09 = r1;
        this.A0K = new C183499Ym(-1);
        this.A0C = AnonymousClass3MW.A0o();
        List list = this.A0D;
        list.add(new C1769596k(0, C72453Mb.A1Y((Boolean) this.A07.A06())));
        list.add(new C1769596k(1, C72453Mb.A1Y((Boolean) this.A07.A06())));
        this.A01 = 2;
        A03(this);
        this.A02 = A0M2;
        this.A0F = C21528Alb.A00(this, 49);
        this.A0H = A0M3;
        this.A0G = A0M4;
    }

    public final boolean A0X(String str, int i) {
        List list = this.A0D;
        C1769596k r1 = (C1769596k) list.get(i);
        if (TextUtils.equals(r1.A00, str)) {
            return false;
        }
        r1.A00 = str;
        if (list.size() < C18020vd.A00(C18040vf.A02, this.A08, 1408) && A04(this)) {
            int i2 = this.A01;
            this.A01 = i2 + 1;
            list.add(new C1769596k(i2, C72453Mb.A1Y((Boolean) this.A07.A06())));
        }
        A03(this);
        return true;
    }

    public static final String A00(PollCreatorViewModel pollCreatorViewModel) {
        String str = pollCreatorViewModel.A09.A00;
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            int i2 = length;
            if (!z) {
                i2 = i;
            }
            boolean A0u = C109005cf.A0u(str, i2);
            if (z) {
                if (!A0u) {
                    break;
                }
                length--;
            } else if (!A0u) {
                z = true;
            } else {
                i++;
            }
        }
        return C108985cd.A0g(length, i, str);
    }

    public static final void A03(PollCreatorViewModel pollCreatorViewModel) {
        AnonymousClass1DT r3 = pollCreatorViewModel.A06;
        C183499Ym[] r2 = new C183499Ym[2];
        r2[0] = pollCreatorViewModel.A09;
        r3.A0F(C29431cG.A0k(pollCreatorViewModel.A0D, C18070vi.A0O(pollCreatorViewModel.A0K, r2, 1)));
    }

    public static final boolean A04(PollCreatorViewModel pollCreatorViewModel) {
        List<C1769596k> list = pollCreatorViewModel.A0D;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (C1769596k r0 : list) {
                if (r0.A00.length() == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0065, code lost:
        if (r6.A03.A06() == null) goto L_0x0067;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00cd A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01e2  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0U(X.AnonymousClass1BI r18, X.C30391dr r19, long r20) {
        /*
            r17 = this;
            r7 = r19
            r5 = r18
            r0 = r20
            boolean r2 = r7 instanceof X.C21704AoX
            r6 = r17
            if (r2 == 0) goto L_0x00c6
            r10 = r7
            X.AoX r10 = (X.C21704AoX) r10
            int r4 = r10.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r4 & r3
            if (r2 == 0) goto L_0x00c6
            int r4 = r4 - r3
            r10.label = r4
        L_0x001a:
            java.lang.Object r3 = r10.result
            X.1g4 r9 = X.C31751g4.COROUTINE_SUSPENDED
            int r2 = r10.label
            r8 = 1
            if (r2 == 0) goto L_0x007c
            if (r2 != r8) goto L_0x01e8
            long r0 = r10.J$0
            java.lang.Object r2 = r10.L$2
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r5 = r10.L$1
            X.1BI r5 = (X.AnonymousClass1BI) r5
            java.lang.Object r6 = r10.L$0
            com.whatsapp.polls.creator.PollCreatorViewModel r6 = (com.whatsapp.polls.creator.PollCreatorViewModel) r6
            X.C30691eM.A01(r3)
        L_0x0036:
            boolean r7 = X.AnonymousClass000.A1Y(r3)
            X.1iW r4 = r6.A0I
            java.lang.String r12 = A00(r6)
            X.1DT r3 = r6.A05
            java.lang.Object r3 = r3.A06()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = X.C72453Mb.A1Y(r3)
            r10 = r3 ^ 1
            X.1DT r3 = r6.A07
            java.lang.Object r3 = r3.A06()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r8 = X.C72453Mb.A1Y(r3)
            r3 = 0
            if (r8 == 0) goto L_0x0067
            X.1DT r8 = r6.A03
            java.lang.Object r8 = r8.A06()
            r16 = 1
            if (r8 != 0) goto L_0x0069
        L_0x0067:
            r16 = 0
        L_0x0069:
            X.1DT r8 = r6.A03
            java.lang.Object r8 = r8.A06()
            X.96k r8 = (X.C1769596k) r8
            if (r8 == 0) goto L_0x0075
            java.lang.String r3 = r8.A00
        L_0x0075:
            r13 = 0
            int r8 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r8 <= 0) goto L_0x00d6
            goto L_0x00cd
        L_0x007c:
            X.C30691eM.A01(r3)
            java.util.List r3 = r6.A0D
            java.util.ArrayList r2 = X.AnonymousClass000.A13()
            java.util.Iterator r7 = r3.iterator()
        L_0x0089:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L_0x00a1
            java.lang.Object r3 = r7.next()
            X.96k r3 = (X.C1769596k) r3
            java.lang.String r4 = r3.A00
            boolean r3 = X.AnonymousClass1YF.A0T(r4)
            if (r3 != 0) goto L_0x0089
            r2.add(r4)
            goto L_0x0089
        L_0x00a1:
            X.00H r3 = r6.A0M
            java.lang.Object r7 = r3.get()
            X.4Qa r7 = (X.C86064Qa) r7
            r10.L$0 = r6
            r10.L$1 = r5
            r10.L$2 = r2
            r10.J$0 = r0
            r10.label = r8
            X.3Dp r4 = X.C108975cc.A0k(r10)
            X.7P2 r3 = new X.7P2
            r3.<init>(r4, r8)
            r7.A00(r5, r3)
            java.lang.Object r3 = r4.A00()
            if (r3 != r9) goto L_0x0036
            return r9
        L_0x00c6:
            X.AoX r10 = new X.AoX
            r10.<init>(r6, r7)
            goto L_0x001a
        L_0x00cd:
            X.00H r8 = r4.A1L     // Catch:{ all -> 0x00d4 }
            X.206 r9 = X.AnonymousClass1W2.A02(r8, r0)     // Catch:{ all -> 0x00d4 }
            goto L_0x00d7
        L_0x00d4:
            r0 = move-exception
            throw r0
        L_0x00d6:
            r9 = 0
        L_0x00d7:
            com.whatsapp.wamsys.JniBridge r11 = r4.A1A
            X.1PP r0 = r4.A0x
            X.205 r13 = X.C17880vN.A0Z(r5, r0)
            X.11P r0 = r4.A0K
            long r0 = X.AnonymousClass11P.A01(r0)
            X.22H r8 = new X.22H
            r8.<init>(r13, r0)
            r8.A05 = r12
            r8.A02 = r10
            java.util.List r10 = r8.A07
            r10.clear()
            java.util.Iterator r15 = r2.iterator()
        L_0x00f7:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x013c
            java.lang.Object r12 = r15.next()
            r1 = 6
            java.util.concurrent.atomic.AtomicReference r0 = r11.wajContext
            java.lang.Object r0 = r0.get()
            java.lang.Object r1 = com.whatsapp.wamsys.JniBridge.jvidispatchOOO(r1, r12, r0)
            com.facebook.simplejni.NativeHolder r1 = (com.facebook.simplejni.NativeHolder) r1
            if (r1 == 0) goto L_0x00f7
            X.9ZC r0 = new X.9ZC
            r0.<init>(r1)
            com.whatsapp.wamsys.JniBridge.getInstance()
            com.facebook.simplejni.NativeHolder r13 = r0.A00
            r12 = 1
            r0 = 56
            java.lang.Object r12 = com.whatsapp.wamsys.JniBridge.jvidispatchOIO(r12, r0, r13)
            java.lang.String r12 = (java.lang.String) r12
            com.whatsapp.wamsys.JniBridge.getInstance()
            r14 = 0
            r0 = 55
            java.lang.Object r0 = com.whatsapp.wamsys.JniBridge.jvidispatchOIO(r14, r0, r13)
            byte[] r0 = (byte[]) r0
            java.lang.String r1 = X.C108955ca.A14(r0)
            X.A18 r0 = new X.A18
            r0.<init>(r12, r1)
            r10.add(r0)
            goto L_0x00f7
        L_0x013c:
            X.205 r0 = r8.A0v
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0152
            java.util.UUID r0 = java.util.UUID.randomUUID()
            long r0 = r0.getMostSignificantBits()
            r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r0 = r0 & r11
            r8.A04 = r0
        L_0x0152:
            if (r16 == 0) goto L_0x0174
            if (r3 == 0) goto L_0x0174
            java.util.Iterator r10 = r10.iterator()
        L_0x015a:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0174
            java.lang.Object r1 = r10.next()
            X.A18 r1 = (X.A18) r1
            java.lang.String r0 = r1.A04
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x015a
            r0 = 1
            r1.A03 = r0
            r8.A01 = r0
            goto L_0x015a
        L_0x0174:
            X.0ve r3 = r4.A0c
            r1 = 2663(0xa67, float:3.732E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r3, r1)
            if (r0 == 0) goto L_0x0185
            X.1R0 r0 = r4.A10
            r0.A00(r8, r9)
        L_0x0185:
            r4.A0b(r8)
            boolean r0 = r8.A0w()
            if (r0 == 0) goto L_0x01e2
            X.C33251iW.A0D(r4, r8, r7)
            X.00H r0 = r4.A1S
            java.lang.Object r0 = r0.get()
            X.2rF r0 = (X.C62342rF) r0
            r0.A02(r8)
        L_0x019c:
            X.00H r0 = r6.A0L
            java.lang.Object r4 = r0.get()
            X.72e r4 = (X.C1406072e) r4
            X.11P r0 = r6.A0J
            long r6 = X.AnonymousClass11P.A01(r0)
            int r3 = r2.size()
            r0 = 0
            X.C18070vi.A0d(r5, r0)
            X.63g r2 = new X.63g
            r2.<init>()
            X.C1406072e.A00(r2, r5, r4)
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r0 = r6 % r0
            long r6 = r6 - r0
            long r0 = X.C17880vN.A04(r6)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A05 = r0
            java.lang.Long r0 = X.C17880vN.A0n(r3)
            r2.A06 = r0
            java.lang.Integer r0 = X.C17880vN.A0i()
            r2.A04 = r0
            r0 = 0
            X.C1406072e.A01(r2, r5, r0)
            X.18K r0 = r4.A00
            r0.CC7(r2)
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x01e2:
            X.122 r0 = r4.A0U
            r0.BBM(r8)
            goto L_0x019c
        L_0x01e8:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.polls.creator.PollCreatorViewModel.A0U(X.1BI, X.1dr, long):java.lang.Object");
    }

    public final boolean A0V() {
        List<C1769596k> list = this.A0D;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (C1769596k r0 : list) {
                if (r0.A00.length() != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean A0W(int i) {
        List list = this.A0D;
        int size = list.size();
        if (size <= 0 || i != size - 1) {
            return false;
        }
        if (size == C18020vd.A00(C18040vf.A02, this.A08, 1408) && ((C1769596k) list.get(size - 1)).A00.length() == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00be, code lost:
        if (r1 < 2) goto L_0x006b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A0T(boolean r9) {
        /*
            r8 = this;
            java.util.LinkedHashSet r5 = X.C17880vN.A14()
            java.util.List r6 = r8.A0E
            r6.clear()
            java.util.List r7 = r8.A0D
            int r4 = r7.size()
            r3 = 0
            r2 = 0
        L_0x0011:
            if (r2 >= r4) goto L_0x0039
            java.lang.Object r0 = r7.get(r2)
            X.96k r0 = (X.C1769596k) r0
            java.lang.String r0 = r0.A00
            java.lang.String r1 = X.AnonymousClass1YF.A0I(r0)
            int r0 = r1.length()
            if (r0 == 0) goto L_0x002e
            boolean r0 = r5.contains(r1)
            if (r0 != 0) goto L_0x0031
            r5.add(r1)
        L_0x002e:
            int r2 = r2 + 1
            goto L_0x0011
        L_0x0031:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r6.add(r0)
            goto L_0x002e
        L_0x0039:
            X.1wy r2 = r8.A0A
            java.util.ArrayList r1 = X.C17880vN.A10(r6)
            boolean r0 = X.AnonymousClass000.A1a(r6)
            if (r0 == 0) goto L_0x0048
            if (r9 == 0) goto L_0x0048
            r3 = 1
        L_0x0048:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            android.util.Pair r0 = X.C108945cZ.A0N(r1, r0)
            r2.A0E(r0)
            java.lang.String r0 = A00(r8)
            int r0 = r0.length()
            r5 = 0
            boolean r4 = X.AnonymousClass000.A1R(r0)
            boolean r0 = r7 instanceof java.util.Collection
            r3 = 2
            if (r0 == 0) goto L_0x0097
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x0097
        L_0x006b:
            r0 = 0
        L_0x006c:
            if (r4 != 0) goto L_0x0073
            r5 = 2
            if (r0 != 0) goto L_0x0072
            r5 = 1
        L_0x0072:
            return r5
        L_0x0073:
            if (r0 != 0) goto L_0x0077
            r5 = 3
            return r5
        L_0x0077:
            boolean r0 = X.AnonymousClass000.A1a(r6)
            if (r0 == 0) goto L_0x007f
            r5 = 4
            return r5
        L_0x007f:
            X.1DT r0 = r8.A07
            java.lang.Object r0 = r0.A06()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = X.C72453Mb.A1Y(r0)
            if (r0 == 0) goto L_0x0072
            X.1DT r0 = r8.A03
            java.lang.Object r0 = r0.A06()
            if (r0 != 0) goto L_0x0072
            r5 = 5
            return r5
        L_0x0097:
            java.util.Iterator r2 = r7.iterator()
            r1 = 0
        L_0x009c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00bd
            java.lang.Object r0 = r2.next()
            X.96k r0 = (X.C1769596k) r0
            java.lang.String r0 = r0.A00
            java.lang.String r0 = X.AnonymousClass1YF.A0I(r0)
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x009c
            int r1 = r1 + 1
            if (r1 >= 0) goto L_0x009c
            X.AnonymousClass1ZU.A0A()
            r0 = 0
            throw r0
        L_0x00bd:
            r0 = 1
            if (r1 >= r3) goto L_0x006c
            goto L_0x006b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.polls.creator.PollCreatorViewModel.A0T(boolean):int");
    }
}
