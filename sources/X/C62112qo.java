package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.2qo  reason: invalid class name and case insensitive filesystem */
public class C62112qo {
    public final List A00 = AnonymousClass000.A13();
    public final Map A01 = C17880vN.A11();
    public final C19880zA A02;
    public final C19880zA A03;
    public final AnonymousClass1M9 A04;
    public final AnonymousClass1CJ A05;
    public final C18030ve A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09;
    public final AnonymousClass00H A0A;

    public synchronized C1605388w A01(AnonymousClass77Z r3) {
        if (r3 == null) {
            return null;
        }
        Map map = this.A01;
        if (map.isEmpty()) {
            A00(this);
        }
        return (C1605388w) AnonymousClass000.A0w(map, r3.A01);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003c, code lost:
        if (X.C18020vd.A05(X.C18040vf.A01, r1.A01, 7769) != false) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001e, code lost:
        if (X.C18020vd.A05(X.C18040vf.A01, r1.A01, 6450) == false) goto L_0x0020;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.C62112qo r11) {
        /*
            java.util.List r10 = r11.A00
            r10.clear()
            X.00H r4 = r11.A08
            java.lang.Object r1 = r4.get()
            X.1a8 r1 = (X.C28391a8) r1
            boolean r0 = r1.A02()
            if (r0 == 0) goto L_0x0020
            X.0ve r2 = r1.A01
            X.0vf r1 = X.C18040vf.A01
            r0 = 6450(0x1932, float:9.038E-42)
            boolean r1 = X.C18020vd.A05(r1, r2, r0)
            r0 = 1
            if (r1 != 0) goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            r7 = 4
            r8 = 1
            r9 = 0
            if (r0 == 0) goto L_0x003e
            java.lang.Object r1 = r4.get()
            X.1a8 r1 = (X.C28391a8) r1
            boolean r0 = r1.A02()
            if (r0 == 0) goto L_0x0108
            X.0ve r2 = r1.A01
            X.0vf r1 = X.C18040vf.A01
            r0 = 7769(0x1e59, float:1.0887E-41)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 == 0) goto L_0x0108
        L_0x003e:
            r3 = 2131434871(0x7f0b1d77, float:1.8491568E38)
            r2 = 2131890393(0x7f1210d9, float:1.9415477E38)
            r1 = 2131232184(0x7f0805b8, float:1.808047E38)
            X.77Z r0 = new X.77Z
            r0.<init>(r9, r3, r2, r1)
            r10.add(r0)
            r2 = 2131434944(0x7f0b1dc0, float:1.8491716E38)
            r1 = 2131890406(0x7f1210e6, float:1.9415503E38)
            r0 = 2131232182(0x7f0805b6, float:1.8080466E38)
            X.77Z r3 = new X.77Z
            r3.<init>(r8, r2, r1, r0)
        L_0x005d:
            r10.add(r3)
            X.0ve r6 = r11.A06
            r1 = 1608(0x648, float:2.253E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r6, r1)
            r5 = 2
            if (r0 != 0) goto L_0x007e
            r3 = 2131434973(0x7f0b1ddd, float:1.8491775E38)
            r2 = 2131890409(0x7f1210e9, float:1.941551E38)
            r1 = 2131232371(0x7f080673, float:1.808085E38)
            X.77Z r0 = new X.77Z
            r0.<init>(r5, r3, r2, r1)
            r10.add(r0)
        L_0x007e:
            java.util.Map r3 = r11.A01
            r2 = 6
            java.lang.Object r1 = X.AnonymousClass000.A0w(r3, r2)
            X.88w r1 = (X.C1605388w) r1
            r3.clear()
            if (r1 == 0) goto L_0x009d
            X.00H r0 = r11.A09
            java.lang.Object r0 = r0.get()
            X.1rO r0 = (X.C38501rO) r0
            boolean r0 = r0.A07()
            if (r0 == 0) goto L_0x009d
            X.C17880vN.A1O(r1, r3, r2)
        L_0x009d:
            X.1M9 r1 = r11.A04
            X.2zD r0 = new X.2zD
            r0.<init>(r1)
            X.C17880vN.A1O(r0, r3, r9)
            X.2zF r0 = new X.2zF
            r0.<init>(r1)
            X.C17880vN.A1O(r0, r3, r8)
            java.lang.Object r1 = r4.get()
            X.1a8 r1 = (X.C28391a8) r1
            boolean r0 = r1.A02()
            if (r0 == 0) goto L_0x00cf
            X.0ve r2 = r1.A01
            X.0vf r1 = X.C18040vf.A01
            r0 = 6450(0x1932, float:9.038E-42)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 == 0) goto L_0x00cf
            X.2zA r0 = new X.2zA
            r0.<init>()
            X.C17880vN.A1O(r0, r3, r7)
        L_0x00cf:
            X.1CJ r2 = r11.A05
            X.00H r0 = r11.A0A
            java.lang.Object r1 = r0.get()
            X.1xp r1 = (X.C42221xp) r1
            X.2zI r0 = new X.2zI
            r0.<init>(r2, r1, r6)
            X.C17880vN.A1O(r0, r3, r5)
            X.2zE r1 = new X.2zE
            r1.<init>(r2)
            r0 = 3
            X.C17880vN.A1O(r1, r3, r0)
            java.lang.Object r0 = r4.get()
            X.1a8 r0 = (X.C28391a8) r0
            boolean r0 = r0.A03()
            if (r0 == 0) goto L_0x0107
            X.00H r0 = r11.A07
            java.lang.Object r0 = r0.get()
            com.whatsapp.favorite.FavoriteManager r0 = (com.whatsapp.favorite.FavoriteManager) r0
            X.2zC r1 = new X.2zC
            r1.<init>(r0)
            r0 = 5
            X.C17880vN.A1O(r1, r3, r0)
        L_0x0107:
            return
        L_0x0108:
            r2 = 2131434893(0x7f0b1d8d, float:1.8491613E38)
            r1 = 2131890397(0x7f1210dd, float:1.9415485E38)
            r0 = 2131231956(0x7f0804d4, float:1.8080008E38)
            X.77Z r3 = new X.77Z
            r3.<init>(r7, r2, r1, r0)
            goto L_0x005d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62112qo.A00(X.2qo):void");
    }

    public C62112qo(C19880zA r2, C19880zA r3, AnonymousClass1M9 r4, AnonymousClass1CJ r5, C18030ve r6, AnonymousClass00H r7, AnonymousClass00H r8, AnonymousClass00H r9, AnonymousClass00H r10) {
        this.A06 = r6;
        this.A05 = r5;
        this.A03 = r2;
        this.A02 = r3;
        this.A04 = r4;
        this.A07 = r8;
        this.A08 = r9;
        this.A0A = r10;
        this.A09 = r7;
    }
}
