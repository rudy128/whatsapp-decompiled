package X;

import android.util.Pair;
import java.util.Collection;
import java.util.List;

/* renamed from: X.1ho  reason: invalid class name and case insensitive filesystem */
public class C32821ho {
    public final C25311Ns A00;
    public final C18030ve A01;
    public final AnonymousClass19Y A02;
    public final C26521Sl A03;
    public final C32021gV A04;
    public final AnonymousClass190 A05;
    public final C25351Nw A06;
    public final AnonymousClass1SJ A07;
    public final AnonymousClass00H A08;

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.C62572rc r8, X.C32821ho r9, X.C55362fe r10, X.AnonymousClass21V r11) {
        /*
            boolean r0 = r10.A03
            if (r0 == 0) goto L_0x00fe
            java.lang.String r0 = r11.A19()
            r2 = 0
            if (r0 == 0) goto L_0x001b
            android.net.Uri r1 = android.net.Uri.parse(r0)
            if (r1 == 0) goto L_0x001b
            boolean r0 = r1.isAbsolute()
            if (r0 == 0) goto L_0x001b
            java.io.File r2 = X.C64062u9.A04(r1)
        L_0x001b:
            java.io.File r3 = r10.A00
            X.C17960vV.A07(r3)
            boolean r0 = r10 instanceof X.AnonymousClass2KL
            if (r0 != 0) goto L_0x002a
            java.lang.String r0 = r3.getName()
            r11.A09 = r0
        L_0x002a:
            long r0 = r3.length()
            r8.A0A = r0
            r11.A01 = r0
            r8.A0G = r3
            X.36u r0 = r11.A0O()
            if (r0 == 0) goto L_0x0048
            byte[] r0 = r10.A04
            if (r0 == 0) goto L_0x0048
            r11.A0p(r0)
            X.1gV r1 = r9.A04
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            r1.A0J(r11, r0)
        L_0x0048:
            java.lang.Integer r4 = r10.A01
            r5 = 1
            if (r4 == 0) goto L_0x0071
            X.19Y r7 = r9.A02
            r6 = 415039489(0x18bd0001, float:4.885536E-24)
            r7.markerStart(r6)
            boolean r0 = r10 instanceof X.AnonymousClass2KN
            java.lang.String r1 = "media"
            if (r0 == 0) goto L_0x00a7
            java.lang.String r0 = "image"
        L_0x005d:
            r7.markerAnnotate((int) r6, (java.lang.String) r1, (java.lang.String) r0)
        L_0x0060:
            int r0 = r4.intValue()
            r4 = 2
            java.lang.String r1 = "model"
            if (r5 != r0) goto L_0x009e
            java.lang.String r0 = "rbs"
        L_0x006b:
            r7.markerAnnotate((int) r6, (java.lang.String) r1, (java.lang.String) r0)
            r7.markerEnd(r6, r4)
        L_0x0071:
            r8.A0U = r5
            r8.A0Q = r5
            boolean r0 = r10 instanceof X.AnonymousClass2KN
            if (r0 == 0) goto L_0x00b8
            r1 = r10
            X.2KN r1 = (X.AnonymousClass2KN) r1
            int r0 = r1.A02
            r8.A06 = r0
            int r0 = r1.A03
            r8.A08 = r0
            int r0 = r1.A00
            r8.A02 = r0
            int r0 = r1.A01
            r8.A03 = r0
            boolean r0 = r1.A04
            if (r0 == 0) goto L_0x00ca
            int[] r4 = r1.A05
            int r0 = r4.length
            if (r0 <= 0) goto L_0x00ca
            X.36v r1 = r11.A17()
            X.C17960vV.A07(r1)
            monitor-enter(r1)
            goto L_0x00af
        L_0x009e:
            if (r4 != r0) goto L_0x00a3
            java.lang.String r0 = "rbm"
            goto L_0x006b
        L_0x00a3:
            java.lang.String r0 = "unknown"
            goto L_0x006b
        L_0x00a7:
            boolean r0 = r10 instanceof X.C24017Bu3
            if (r0 == 0) goto L_0x0060
            java.lang.String r0 = "video"
            goto L_0x005d
        L_0x00af:
            r1.A01 = r4     // Catch:{ all -> 0x00b5 }
            r1.A00 = r5     // Catch:{ all -> 0x00b5 }
            monitor-exit(r1)
            goto L_0x00ca
        L_0x00b5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x00b8:
            boolean r0 = r10 instanceof X.C24017Bu3
            if (r0 == 0) goto L_0x00dc
            r0 = r10
            X.Bu3 r0 = (X.C24017Bu3) r0
            int r0 = r0.A00
            r11.A0D = r0
            r0 = 0
            r11.A05 = r0
            r11.A08 = r0
            r8.A0K = r0
        L_0x00ca:
            java.lang.String r0 = r10.A02
            r11.A0B = r0
            if (r2 == 0) goto L_0x00db
            boolean r0 = r2.equals(r3)
            if (r0 != 0) goto L_0x00db
            X.1Sl r0 = r9.A03
            r0.A0n(r2)
        L_0x00db:
            return
        L_0x00dc:
            boolean r0 = r10 instanceof X.AnonymousClass2KM
            if (r0 == 0) goto L_0x00ca
            r1 = r10
            X.2KM r1 = (X.AnonymousClass2KM) r1
            java.lang.String r0 = r1.A02
            r11.A05 = r0
            r0 = 0
            r11.A08 = r0
            int r0 = r1.A00
            if (r0 <= 0) goto L_0x00f0
            r8.A04 = r0
        L_0x00f0:
            java.lang.Boolean r0 = r1.A01
            if (r0 == 0) goto L_0x00ca
            r1 = r11
            X.22g r1 = (X.C441322g) r1
            boolean r0 = r0.booleanValue()
            r1.A03 = r0
            goto L_0x00ca
        L_0x00fe:
            r0 = 0
            r8.A0f = r0
            r11.A0U()
            r8.A0Q = r0
            r8.A0U = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32821ho.A01(X.2rc, X.1ho, X.2fe, X.21V):void");
    }

    public static void A02(C62572rc r5, C32821ho r6, C55612g5 r7, AnonymousClass21V r8) {
        AnonymousClass1IX copyOf;
        String str;
        String str2;
        String str3;
        C196299un r2 = r7.A02;
        r6.A05(r5, r2, r8);
        int i = r7.A00;
        if (i == 0) {
            if (r2.A07() != null) {
                r8.A07 = r2.A07();
            }
            if (r2.A03() != null) {
                r5.A0J = r6.A07.A00(r2.A03(), true);
            }
            synchronized (r2) {
                str = r2.A0F;
            }
            if (str != null && C25291Nq.A05(r6.A01, C63972u0.A02(r8))) {
                if (C60502o8.A00(r8) == null) {
                    C60502o8.A01(r8, C693536w.A00(r6.A05, r8));
                }
                C693536w A002 = C60502o8.A00(r8);
                synchronized (r2) {
                    str2 = r2.A0F;
                }
                A002.A05 = str2;
                synchronized (r2) {
                    str3 = r2.A0G;
                }
                A002.A09 = str3;
                A002.A0E = true;
            }
        } else if (i == 12 && r8.A17() != null) {
            r8.A17().A01();
        }
        if (!C137266vB.A01(i)) {
            r5.A0Q = false;
        }
        synchronized (r2) {
            List list = r2.A0J;
            C18070vi.A0d(list, 0);
            copyOf = AnonymousClass1IX.copyOf((Collection) list);
            C18070vi.A0X(copyOf);
        }
        if (!copyOf.isEmpty() && (r8 instanceof AnonymousClass21W)) {
            if (C18020vd.A05(C18040vf.A02, r6.A01, 9096)) {
                ((AnonymousClass21W) r8).A1H(copyOf);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0035, code lost:
        if (r0 != false) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004b, code lost:
        if (r0 != false) goto L_0x004d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A04(X.C32821ho r5, X.C55612g5 r6, X.AnonymousClass21V r7) {
        /*
            boolean r0 = r7 instanceof X.C441522i
            r4 = 1
            if (r0 != 0) goto L_0x0016
            X.0ve r1 = r5.A01
            X.205 r0 = r7.A0v
            X.1BI r0 = r0.A00
            boolean r0 = X.C22971Dz.A0a(r0)
            boolean r0 = X.C63652tT.A03(r1, r7, r0)
            if (r0 != 0) goto L_0x0016
            return
        L_0x0016:
            X.9un r3 = r6.A02
            X.36w r0 = X.C60502o8.A00(r7)
            if (r0 != 0) goto L_0x0027
            X.190 r0 = r5.A05
            X.36w r0 = X.C693536w.A00(r0, r7)
            X.C60502o8.A01(r7, r0)
        L_0x0027:
            X.36w r2 = X.C60502o8.A00(r7)
            java.lang.String r0 = r3.A05()
            if (r0 != 0) goto L_0x0037
            monitor-enter(r3)
            boolean r0 = r3.A0K     // Catch:{ all -> 0x0047 }
            monitor-exit(r3)
            if (r0 == 0) goto L_0x003d
        L_0x0037:
            java.lang.String r0 = r3.A05()
            r2.A06 = r0
        L_0x003d:
            java.lang.String r0 = r3.A06()
            if (r0 != 0) goto L_0x004d
            monitor-enter(r3)
            boolean r0 = r3.A0L     // Catch:{ all -> 0x0047 }
            goto L_0x004a
        L_0x0047:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x004a:
            monitor-exit(r3)
            if (r0 == 0) goto L_0x0053
        L_0x004d:
            java.lang.String r0 = r3.A06()
            r2.A09 = r0
        L_0x0053:
            X.2pa r0 = r3.A00()
            if (r0 == 0) goto L_0x0069
            X.2pa r0 = r3.A00()
            byte[] r0 = r0.A01
            r2.A0B = r0
            X.2pa r0 = r3.A00()
            long r0 = r0.A00
            r2.A02 = r0
        L_0x0069:
            int r0 = r6.A00
            if (r0 != 0) goto L_0x007f
            java.lang.String r0 = r3.A03()
            if (r0 == 0) goto L_0x007f
            X.1SJ r1 = r5.A07
            java.lang.String r0 = r3.A03()
            java.lang.String r0 = r1.A00(r0, r4)
            r2.A05 = r0
        L_0x007f:
            X.0ve r0 = r5.A01
            boolean r0 = X.C63652tT.A02(r0, r7)
            r2.A0E = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32821ho.A04(X.1ho, X.2g5, X.21V):void");
    }

    public boolean A06(AnonymousClass21V r5, boolean z) {
        boolean z2;
        C18030ve r2 = this.A01;
        C18070vi.A0d(r2, 0);
        if (C18020vd.A05(C18040vf.A02, r2, 11380)) {
            C62572rc r22 = r5.A02;
            C17960vV.A07(r22);
            if (r5.A0D() != 1) {
                return false;
            }
            r5.A0U();
            r22.A0f = false;
            r22.A0V = false;
            r22.A0Q = z;
            r22.A0C = 0;
            return true;
        }
        synchronized (r5) {
            C62572rc r23 = r5.A02;
            C17960vV.A07(r23);
            if (r5.A0D() == 1) {
                r5.A0U();
                r23.A0f = false;
                r23.A0V = false;
                r23.A0Q = z;
                r23.A0C = 0;
                z2 = true;
            } else {
                z2 = false;
            }
        }
        return z2;
    }

    public C32821ho(AnonymousClass190 r1, C25311Ns r2, C18030ve r3, C25351Nw r4, AnonymousClass1SJ r5, AnonymousClass19Y r6, C26521Sl r7, C32021gV r8, AnonymousClass00H r9) {
        this.A02 = r6;
        this.A01 = r3;
        this.A05 = r1;
        this.A03 = r7;
        this.A08 = r9;
        this.A07 = r5;
        this.A04 = r8;
        this.A06 = r4;
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0024, code lost:
        if (X.C63972u0.A07(r3) != false) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.C62572rc r4, X.C32821ho r5, X.C54912eu r6, X.AnonymousClass21V r7) {
        /*
            X.1So r3 = X.C63972u0.A02(r7)
            X.36u r0 = r7.A0O()
            if (r0 == 0) goto L_0x002a
            byte[] r2 = r6.A02
            if (r2 == 0) goto L_0x002a
            X.1Nw r1 = r5.A06
            java.lang.Class<X.36u> r0 = X.C693336u.class
            X.25F r0 = X.C18070vi.A09(r7, r0)
            r1.Bhl(r0)
            boolean r0 = X.C25291Nq.A06(r3)
            if (r0 != 0) goto L_0x0026
            boolean r1 = X.C63972u0.A07(r3)
            r0 = 0
            if (r1 == 0) goto L_0x0027
        L_0x0026:
            r0 = 1
        L_0x0027:
            r7.A15(r2, r0)
        L_0x002a:
            android.util.Pair r1 = r6.A01
            if (r1 == 0) goto L_0x0042
            java.lang.Object r0 = r1.first
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r4.A08 = r0
            java.lang.Object r0 = r1.second
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r4.A06 = r0
        L_0x0042:
            android.util.Pair r1 = r6.A00
            if (r1 == 0) goto L_0x005a
            java.lang.Object r0 = r1.first
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r4.A02 = r0
            java.lang.Object r0 = r1.second
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r4.A03 = r0
        L_0x005a:
            byte[] r3 = r6.A03
            if (r3 == 0) goto L_0x0075
            boolean r0 = r7 instanceof X.C441322g
            if (r0 == 0) goto L_0x0075
            r2 = r7
            X.22g r2 = (X.C441322g) r2
            X.00H r0 = r5.A08
            java.lang.Object r1 = r0.get()
            X.70H r1 = (X.AnonymousClass70H) r1
            java.lang.String r0 = r7.A06
            X.73B r0 = r1.A04(r0, r3)
            r2.A05 = r0
        L_0x0075:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32821ho.A00(X.2rc, X.1ho, X.2eu, X.21V):void");
    }

    public static void A03(C32821ho r2, C54912eu r3, AnonymousClass21V r4) {
        if (C60502o8.A00(r4) == null) {
            C60502o8.A01(r4, C693536w.A00(r2.A05, r4));
        }
        C693536w A002 = C60502o8.A00(r4);
        A002.A0C = r3.A02;
        Pair pair = r3.A01;
        if (pair != null) {
            A002.A01 = ((Number) pair.first).intValue();
            A002.A00 = ((Number) pair.second).intValue();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001c, code lost:
        if (r0 != false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        if (r0 != false) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(X.C62572rc r4, X.C196299un r5, X.AnonymousClass21V r6) {
        /*
            r3 = this;
            java.lang.String r0 = r5.A05()
            if (r0 != 0) goto L_0x000c
            monitor-enter(r5)
            boolean r0 = r5.A0K     // Catch:{ all -> 0x00d1 }
            monitor-exit(r5)
            if (r0 == 0) goto L_0x0012
        L_0x000c:
            java.lang.String r0 = r5.A05()
            r6.A08 = r0
        L_0x0012:
            java.lang.String r0 = r5.A06()
            if (r0 != 0) goto L_0x001e
            monitor-enter(r5)
            boolean r0 = r5.A0L     // Catch:{ all -> 0x00d1 }
            monitor-exit(r5)
            if (r0 == 0) goto L_0x0024
        L_0x001e:
            java.lang.String r0 = r5.A06()
            r6.A05 = r0
        L_0x0024:
            monitor-enter(r5)
            java.lang.String r0 = r5.A0C     // Catch:{ all -> 0x00d1 }
            monitor-exit(r5)
            if (r0 == 0) goto L_0x0030
            monitor-enter(r5)
            java.lang.String r0 = r5.A0C     // Catch:{ all -> 0x00d1 }
            monitor-exit(r5)
            r6.A06 = r0
        L_0x0030:
            monitor-enter(r5)
            X.2d7 r0 = r5.A02     // Catch:{ all -> 0x00d1 }
            monitor-exit(r5)
            if (r0 == 0) goto L_0x0050
            X.36v r2 = r6.A17()
            X.C17960vV.A07(r2)
            byte[] r1 = r0.A00
            int[] r0 = r0.A01
            r2.A04(r1, r0)
            X.36v r1 = r6.A17()
            X.0ve r0 = r3.A01
            boolean r0 = X.C63652tT.A01(r0, r6)
            r1.A04 = r0
        L_0x0050:
            if (r4 == 0) goto L_0x00d0
            byte[] r0 = r5.A0C()
            if (r0 == 0) goto L_0x005e
            byte[] r0 = r5.A0C()
            r4.A0W = r0
        L_0x005e:
            monitor-enter(r5)
            byte[] r0 = r5.A0O     // Catch:{ all -> 0x00d1 }
            monitor-exit(r5)
            if (r0 == 0) goto L_0x006a
            monitor-enter(r5)
            byte[] r0 = r5.A0O     // Catch:{ all -> 0x00d1 }
            monitor-exit(r5)
            r4.A0Y = r0
        L_0x006a:
            byte[] r0 = r5.A0D()
            if (r0 == 0) goto L_0x0076
            byte[] r0 = r5.A0D()
            r4.A0Z = r0
        L_0x0076:
            X.2pa r0 = r5.A00()
            if (r0 == 0) goto L_0x008c
            X.2pa r0 = r5.A00()
            byte[] r0 = r0.A01
            r4.A0a = r0
            X.2pa r0 = r5.A00()
            long r0 = r0.A00
            r4.A0B = r0
        L_0x008c:
            java.lang.Integer r0 = r5.A01()
            if (r0 == 0) goto L_0x009c
            java.lang.Integer r0 = r5.A01()
            int r0 = r0.intValue()
            r4.A06 = r0
        L_0x009c:
            java.lang.Integer r0 = r5.A02()
            if (r0 == 0) goto L_0x00ac
            java.lang.Integer r0 = r5.A02()
            int r0 = r0.intValue()
            r4.A08 = r0
        L_0x00ac:
            monitor-enter(r5)
            java.lang.String r0 = r5.A0E     // Catch:{ all -> 0x00d1 }
            monitor-exit(r5)
            if (r0 == 0) goto L_0x00b8
            monitor-enter(r5)
            java.lang.String r0 = r5.A0E     // Catch:{ all -> 0x00d1 }
            monitor-exit(r5)
            r4.A0O = r0
        L_0x00b8:
            monitor-enter(r5)
            byte[] r0 = r5.A0N     // Catch:{ all -> 0x00d1 }
            monitor-exit(r5)
            if (r0 == 0) goto L_0x00c4
            monitor-enter(r5)
            byte[] r0 = r5.A0N     // Catch:{ all -> 0x00d1 }
            monitor-exit(r5)
            r4.A0X = r0
        L_0x00c4:
            boolean r0 = r6.A0w()
            if (r0 == 0) goto L_0x00d0
            java.lang.String r0 = r5.A04()
            r4.A0M = r0
        L_0x00d0:
            return
        L_0x00d1:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32821ho.A05(X.2rc, X.9un, X.21V):void");
    }
}
