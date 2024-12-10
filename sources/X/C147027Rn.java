package X;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: X.7Rn  reason: invalid class name and case insensitive filesystem */
public class C147027Rn implements Comparator {
    public final int A00;

    public C147027Rn(int i) {
        this.A00 = i;
    }

    public static List A00(Iterable iterable, int i) {
        return C29431cG.A0y(iterable, new C147027Rn(i));
    }

    public static void A01(int i, List list) {
        Collections.sort(list, new C147027Rn(i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x025d, code lost:
        if (r0 <= 0) goto L_0x025f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0409, code lost:
        return X.C40151uF.A00(r1, java.lang.Integer.valueOf(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0433, code lost:
        return X.C40151uF.A00(r2, java.lang.Long.valueOf(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0078, code lost:
        if (r4.contains(r2) != r3.contains(r2)) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01fc, code lost:
        return java.lang.Float.compare(r5, r6);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ int compare(java.lang.Object r10, java.lang.Object r11) {
        /*
            r9 = this;
            int r0 = r9.A00
            switch(r0) {
                case 0: goto L_0x00d6;
                case 1: goto L_0x00e4;
                case 2: goto L_0x0020;
                case 3: goto L_0x00f5;
                case 4: goto L_0x0103;
                case 5: goto L_0x0129;
                case 6: goto L_0x013b;
                case 7: goto L_0x0149;
                case 8: goto L_0x0157;
                case 9: goto L_0x00a3;
                case 10: goto L_0x0170;
                case 11: goto L_0x0185;
                case 12: goto L_0x0193;
                case 13: goto L_0x01a2;
                case 14: goto L_0x0034;
                case 15: goto L_0x01b1;
                case 16: goto L_0x01d3;
                case 17: goto L_0x01fd;
                case 18: goto L_0x020b;
                case 19: goto L_0x021d;
                case 20: goto L_0x022f;
                case 21: goto L_0x023a;
                case 22: goto L_0x0248;
                case 23: goto L_0x0293;
                case 24: goto L_0x0293;
                case 25: goto L_0x02a1;
                case 26: goto L_0x02c4;
                case 27: goto L_0x02e7;
                case 28: goto L_0x01a2;
                case 29: goto L_0x02f5;
                case 30: goto L_0x0303;
                case 31: goto L_0x030f;
                case 32: goto L_0x031d;
                case 33: goto L_0x0328;
                case 34: goto L_0x0049;
                case 35: goto L_0x0339;
                case 36: goto L_0x034a;
                case 37: goto L_0x0081;
                case 38: goto L_0x035d;
                case 39: goto L_0x0371;
                case 40: goto L_0x039f;
                case 41: goto L_0x03a8;
                case 42: goto L_0x03c1;
                case 43: goto L_0x03dc;
                case 44: goto L_0x03f1;
                case 45: goto L_0x0005;
                case 46: goto L_0x0005;
                case 47: goto L_0x040a;
                case 48: goto L_0x041f;
                case 49: goto L_0x0434;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.77d r10 = (X.C1418377d) r10
            X.77d r11 = (X.C1418377d) r11
            if (r10 == r11) goto L_0x003c
            if (r10 == 0) goto L_0x0449
            if (r11 == 0) goto L_0x00cf
            java.lang.String r1 = r10.A0G
            if (r1 != 0) goto L_0x0015
            java.lang.String r1 = ""
        L_0x0015:
            java.lang.String r0 = r11.A0G
            if (r0 != 0) goto L_0x001b
            java.lang.String r0 = ""
        L_0x001b:
            int r6 = r1.compareTo(r0)
        L_0x001f:
            return r6
        L_0x0020:
            X.70A r10 = (X.AnonymousClass70A) r10
            X.70A r11 = (X.AnonymousClass70A) r11
            android.util.Pair r0 = r10.A09
            int r1 = X.C108965cb.A01(r0)
            android.util.Pair r0 = r11.A09
            int r0 = X.C108965cb.A01(r0)
            if (r1 <= r0) goto L_0x0449
            goto L_0x00cf
        L_0x0034:
            X.A2B r10 = (X.A2B) r10
            X.A2B r11 = (X.A2B) r11
            if (r10 != 0) goto L_0x003e
            if (r11 != 0) goto L_0x0449
        L_0x003c:
            r6 = 0
            return r6
        L_0x003e:
            if (r11 == 0) goto L_0x00cf
            com.whatsapp.jid.GroupJid r1 = r10.A02
            com.whatsapp.jid.GroupJid r0 = r11.A02
            int r6 = r1.compareTo((com.whatsapp.jid.Jid) r0)
            return r6
        L_0x0049:
            java.io.File r10 = (java.io.File) r10
            java.io.File r11 = (java.io.File) r11
            java.lang.String r4 = r10.getName()
            java.lang.String r3 = r11.getName()
            java.lang.String r2 = "wallpaper-"
            boolean r1 = r4.contains(r2)
            boolean r0 = r3.contains(r2)
            r6 = -1
            if (r1 != r0) goto L_0x007a
            boolean r0 = r4.contains(r2)
            if (r0 != 0) goto L_0x00d1
            boolean r0 = r3.contains(r2)
            if (r0 != 0) goto L_0x00d1
            java.lang.String r2 = "LightWallpaper"
            boolean r1 = r4.contains(r2)
            boolean r0 = r3.contains(r2)
            if (r1 == r0) goto L_0x00d1
        L_0x007a:
            boolean r0 = r4.contains(r2)
            if (r0 == 0) goto L_0x00cf
            return r6
        L_0x0081:
            X.2sx r10 = (X.C63372sx) r10
            X.2sx r11 = (X.C63372sx) r11
            com.whatsapp.jid.UserJid r0 = r10.A0A
            boolean r0 = X.C22971Dz.A0Z(r0)
            if (r0 != 0) goto L_0x0449
            com.whatsapp.jid.UserJid r0 = r11.A0A
            boolean r0 = X.C22971Dz.A0Z(r0)
            if (r0 != 0) goto L_0x00cf
            long r2 = r10.A04()
            long r0 = r11.A04()
            int r0 = X.C18070vi.A01(r2, r0)
            int r6 = -r0
            return r6
        L_0x00a3:
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r8 = r11.getValue()
            X.3Bh r8 = (X.C70493Bh) r8
            java.lang.Object r7 = r10.getValue()
            X.3Bh r7 = (X.C70493Bh) r7
            r6 = 0
            if (r7 == r8) goto L_0x001f
            int r1 = r8.A00
            int r0 = r7.A00
            int r1 = r1 - r0
            long r2 = (long) r1
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x00c7
            long r2 = r8.A01
            long r0 = r7.A01
            long r2 = r2 - r0
        L_0x00c7:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x0449
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x001f
        L_0x00cf:
            r6 = 1
            return r6
        L_0x00d1:
            int r6 = r4.compareTo(r3)
            return r6
        L_0x00d6:
            android.view.View r10 = (android.view.View) r10
            android.view.View r11 = (android.view.View) r11
            int r6 = r10.getTop()
            int r0 = r11.getTop()
            int r6 = r6 - r0
            return r6
        L_0x00e4:
            X.7PS r11 = (X.AnonymousClass7PS) r11
            java.lang.Object r1 = r11.third
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            X.7PS r10 = (X.AnonymousClass7PS) r10
            java.lang.Object r0 = r10.third
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            int r6 = X.C40151uF.A00(r1, r0)
            return r6
        L_0x00f5:
            X.70A r10 = (X.AnonymousClass70A) r10
            X.70A r11 = (X.AnonymousClass70A) r11
            int r1 = r10.A06
            int r0 = r11.A06
            int r0 = X.AnonymousClass1XO.A00(r1, r0)
            int r6 = -r0
            return r6
        L_0x0103:
            X.70A r10 = (X.AnonymousClass70A) r10
            X.70A r11 = (X.AnonymousClass70A) r11
            boolean r0 = r10.A01()
            if (r0 == 0) goto L_0x0124
            boolean r0 = r11.A01()
            if (r0 == 0) goto L_0x0449
            android.util.Pair r0 = r10.A09
            int r1 = X.C108965cb.A00(r0)
            android.util.Pair r0 = r11.A09
            int r0 = X.C108965cb.A00(r0)
            int r6 = X.AnonymousClass1XO.A00(r1, r0)
            return r6
        L_0x0124:
            boolean r6 = r11.A01()
            return r6
        L_0x0129:
            X.70A r10 = (X.AnonymousClass70A) r10
            X.70A r11 = (X.AnonymousClass70A) r11
            android.util.Pair r0 = r11.A09
            int r6 = X.C108965cb.A00(r0)
            android.util.Pair r0 = r10.A09
            int r0 = X.C108965cb.A00(r0)
            int r6 = r6 - r0
            return r6
        L_0x013b:
            X.A8l r10 = (X.C20126A8l) r10
            long r0 = r10.A04
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            X.A8l r11 = (X.C20126A8l) r11
            long r0 = r11.A04
            goto L_0x042b
        L_0x0149:
            X.2lY r11 = (X.C58972lY) r11
            long r0 = r11.A00
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            X.2lY r10 = (X.C58972lY) r10
            long r0 = r10.A00
            goto L_0x042b
        L_0x0157:
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r0 = r10.getValue()
            X.6ma r0 = (X.C132316ma) r0
            int r1 = r0.A01
            java.lang.Object r0 = r11.getValue()
            X.6ma r0 = (X.C132316ma) r0
            int r0 = r0.A01
            int r6 = X.C18070vi.A00(r1, r0)
            return r6
        L_0x0170:
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r1 = r11.getValue()
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.lang.Object r0 = r10.getValue()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r6 = r1.compareTo(r0)
            return r6
        L_0x0185:
            X.6e2 r10 = (X.C127246e2) r10
            int r0 = r10.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            X.6e2 r11 = (X.C127246e2) r11
            int r0 = r11.A00
            goto L_0x0401
        L_0x0193:
            java.io.File r10 = (java.io.File) r10
            java.io.File r11 = (java.io.File) r11
            long r2 = r11.lastModified()
            long r0 = r10.lastModified()
            int r6 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            return r6
        L_0x01a2:
            java.io.File r10 = (java.io.File) r10
            java.io.File r11 = (java.io.File) r11
            long r2 = r10.lastModified()
            long r0 = r11.lastModified()
            int r6 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            return r6
        L_0x01b1:
            X.7Ib r10 = (X.C144627Ib) r10
            X.7Ib r11 = (X.C144627Ib) r11
            X.C18070vi.A0h(r10, r11)
            float r6 = r10.A00
            float r5 = r11.A00
            float r0 = X.C108945cZ.A00(r6, r5)
            double r3 = (double) r0
            r1 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x01f8
            long r2 = r11.A02
            long r0 = r10.A02
            int r6 = X.C18070vi.A01(r2, r0)
            return r6
        L_0x01d3:
            X.8AP r10 = (X.AnonymousClass8AP) r10
            X.8AP r11 = (X.AnonymousClass8AP) r11
            float r6 = r10.Bbo()
            float r5 = r11.Bbo()
            float r0 = X.C108945cZ.A00(r6, r5)
            double r3 = (double) r0
            r1 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x01f8
            long r2 = r11.BMZ()
            long r0 = r10.BMZ()
            int r6 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            return r6
        L_0x01f8:
            int r6 = java.lang.Float.compare(r5, r6)
            return r6
        L_0x01fd:
            X.6sl r10 = (X.C135786sl) r10
            long r0 = r10.A01
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            X.6sl r11 = (X.C135786sl) r11
            long r0 = r11.A01
            goto L_0x042b
        L_0x020b:
            X.0yx r10 = (X.C19760yx) r10
            X.0yx r11 = (X.C19760yx) r11
            java.lang.Object r0 = r10.A01
            android.graphics.Point r0 = (android.graphics.Point) r0
            int r6 = r0.x
            java.lang.Object r0 = r11.A01
            android.graphics.Point r0 = (android.graphics.Point) r0
            int r0 = r0.x
            int r6 = r6 - r0
            return r6
        L_0x021d:
            X.0yx r10 = (X.C19760yx) r10
            X.0yx r11 = (X.C19760yx) r11
            java.lang.Object r0 = r10.A01
            android.graphics.Point r0 = (android.graphics.Point) r0
            int r6 = r0.y
            java.lang.Object r0 = r11.A01
            android.graphics.Point r0 = (android.graphics.Point) r0
            int r0 = r0.y
            int r6 = r6 - r0
            return r6
        L_0x022f:
            X.6eJ r10 = (X.C127406eJ) r10
            X.6eJ r11 = (X.C127406eJ) r11
            long r2 = r10.A00
            long r0 = r11.A00
            int r6 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            return r6
        L_0x023a:
            X.6tO r10 = (X.C136176tO) r10
            long r0 = r10.A00
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            X.6tO r11 = (X.C136176tO) r11
            long r0 = r11.A00
            goto L_0x042b
        L_0x0248:
            X.6rD r10 = (X.C134826rD) r10
            X.1E7 r1 = r10.A00
            r4 = 0
            if (r1 == 0) goto L_0x0291
            X.1BI r0 = r1.A0J
        L_0x0251:
            boolean r0 = X.C22971Dz.A0U(r0)
            r3 = 0
            if (r0 == 0) goto L_0x028a
            if (r1 == 0) goto L_0x025f
            int r0 = r1.A08
            r1 = 0
            if (r0 > 0) goto L_0x0260
        L_0x025f:
            r1 = 1
        L_0x0260:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            X.6rD r11 = (X.C134826rD) r11
            X.1E7 r1 = r11.A00
            if (r1 == 0) goto L_0x026c
            X.1BI r4 = r1.A0J
        L_0x026c:
            boolean r0 = X.C22971Dz.A0U(r4)
            if (r0 == 0) goto L_0x0283
            if (r1 == 0) goto L_0x0281
            int r0 = r1.A08
            if (r0 <= 0) goto L_0x0281
        L_0x0278:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            int r6 = X.C40151uF.A00(r2, r0)
            return r6
        L_0x0281:
            r3 = 1
            goto L_0x0278
        L_0x0283:
            java.lang.String r0 = r11.A01
            r3 = 3
            if (r0 == 0) goto L_0x0278
            r3 = 2
            goto L_0x0278
        L_0x028a:
            java.lang.String r0 = r10.A01
            r1 = 3
            if (r0 == 0) goto L_0x0260
            r1 = 2
            goto L_0x0260
        L_0x0291:
            r0 = r4
            goto L_0x0251
        L_0x0293:
            X.6tS r11 = (X.C136216tS) r11
            int r0 = r11.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            X.6tS r10 = (X.C136216tS) r10
            int r0 = r10.A00
            goto L_0x0401
        L_0x02a1:
            X.6B5 r10 = (X.AnonymousClass6B5) r10
            X.2Dk r0 = r10.A06
            X.9Ig r0 = r0.A02
            X.9Ig r2 = X.C179509Ig.GUEST
            boolean r0 = X.AnonymousClass000.A1Z(r0, r2)
            java.lang.Boolean r1 = X.C108945cZ.A1A(r0)
            X.6B5 r11 = (X.AnonymousClass6B5) r11
            X.2Dk r0 = r11.A06
            X.9Ig r0 = r0.A02
            boolean r0 = X.AnonymousClass000.A1Z(r0, r2)
            java.lang.Boolean r0 = X.C108945cZ.A1A(r0)
            int r6 = X.C40151uF.A00(r1, r0)
            return r6
        L_0x02c4:
            java.util.List r10 = (java.util.List) r10
            java.util.List r11 = (java.util.List) r11
            int r0 = X.AnonymousClass3MX.A01(r10)
            java.lang.Object r0 = r10.get(r0)
            X.2nW r0 = (X.C60182nW) r0
            X.206 r1 = r0.A00
            int r0 = X.AnonymousClass3MX.A01(r11)
            java.lang.Object r0 = r11.get(r0)
            X.2nW r0 = (X.C60182nW) r0
            X.206 r0 = r0.A00
            long r2 = r1.A0I
            long r0 = r0.A0I
            int r6 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            return r6
        L_0x02e7:
            X.2mq r10 = (X.C59762mq) r10
            int r0 = r10.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            X.2mq r11 = (X.C59762mq) r11
            int r0 = r11.A00
            goto L_0x0401
        L_0x02f5:
            X.206 r10 = (X.AnonymousClass206) r10
            X.206 r11 = (X.AnonymousClass206) r11
            X.C18070vi.A0h(r10, r11)
            long r2 = r11.A0y
            long r0 = r10.A0y
            long r2 = r2 - r0
            int r6 = (int) r2
            return r6
        L_0x0303:
            X.206 r10 = (X.AnonymousClass206) r10
            X.206 r11 = (X.AnonymousClass206) r11
            long r3 = r10.A0I
            long r1 = r11.A0I
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            int r6 = -r0
            return r6
        L_0x030f:
            X.708 r11 = (X.AnonymousClass708) r11
            int r0 = r11.A01
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            X.708 r10 = (X.AnonymousClass708) r10
            int r0 = r10.A01
            goto L_0x0401
        L_0x031d:
            X.6FH r10 = (X.AnonymousClass6FH) r10
            X.6FH r11 = (X.AnonymousClass6FH) r11
            long r2 = r11.A00
            long r0 = r10.A00
            int r6 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            return r6
        L_0x0328:
            android.util.Pair r10 = (android.util.Pair) r10
            android.util.Pair r11 = (android.util.Pair) r11
            java.lang.Object r1 = r11.second
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.lang.Object r0 = r10.second
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r6 = r1.compareTo(r0)
            return r6
        L_0x0339:
            java.io.File r10 = (java.io.File) r10
            java.io.File r11 = (java.io.File) r11
            java.lang.String r1 = r10.getName()
            java.lang.String r0 = r11.getName()
            int r6 = r1.compareTo(r0)
            return r6
        L_0x034a:
            X.6zs r10 = (X.C140056zs) r10
            X.6zs r11 = (X.C140056zs) r11
            int r0 = r10.A00
            int r6 = r11.A00
            if (r0 == r6) goto L_0x0356
            int r6 = r6 - r0
            return r6
        L_0x0356:
            long r2 = r11.A01
            long r0 = r10.A01
            long r2 = r2 - r0
            int r6 = (int) r2
            return r6
        L_0x035d:
            X.2sx r10 = (X.C63372sx) r10
            X.2sx r11 = (X.C63372sx) r11
            X.C18070vi.A0h(r10, r11)
            long r2 = r10.A04()
            long r0 = r11.A04()
            int r6 = X.C18070vi.A01(r0, r2)
            return r6
        L_0x0371:
            X.2sx r10 = (X.C63372sx) r10
            X.2sx r11 = (X.C63372sx) r11
            X.C18070vi.A0h(r10, r11)
            monitor-enter(r10)
            X.206 r0 = r10.A07     // Catch:{ all -> 0x039c }
            monitor-exit(r10)
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r0 == 0) goto L_0x0387
            long r1 = r0.A0I
        L_0x0385:
            monitor-enter(r11)
            goto L_0x038d
        L_0x0387:
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L_0x0385
        L_0x038d:
            X.206 r0 = r11.A07     // Catch:{ all -> 0x0399 }
            monitor-exit(r11)
            if (r0 == 0) goto L_0x0394
            long r3 = r0.A0I
        L_0x0394:
            int r6 = X.C18070vi.A01(r1, r3)
            return r6
        L_0x0399:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        L_0x039c:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        L_0x039f:
            com.whatsapp.jid.Jid r11 = (com.whatsapp.jid.Jid) r11
            com.whatsapp.jid.Jid r10 = (com.whatsapp.jid.Jid) r10
            int r6 = X.C40151uF.A00(r11, r10)
            return r6
        L_0x03a8:
            X.1D6 r11 = (X.AnonymousClass1D6) r11
            int r0 = X.C108955ca.A09(r11)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            X.1D6 r10 = (X.AnonymousClass1D6) r10
            int r0 = X.C108955ca.A09(r10)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r6 = X.C40151uF.A00(r1, r0)
            return r6
        L_0x03c1:
            java.io.File r10 = (java.io.File) r10
            java.io.File r11 = (java.io.File) r11
            java.lang.String r1 = r10.getName()
            java.lang.String r3 = r11.getName()
            r2 = 0
            r0 = 2
            java.lang.String r1 = r1.substring(r2, r0)
            java.lang.String r0 = r3.substring(r2, r0)
            int r6 = r1.compareTo(r0)
            return r6
        L_0x03dc:
            X.6ok r11 = (X.C133436ok) r11
            X.725 r0 = r11.A00()
            int r0 = r0.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            X.6ok r10 = (X.C133436ok) r10
            X.725 r0 = r10.A00()
            int r0 = r0.A00
            goto L_0x0401
        L_0x03f1:
            X.6HG r11 = (X.AnonymousClass6HG) r11
            X.725 r0 = r11.A00
            int r0 = r0.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            X.6HG r10 = (X.AnonymousClass6HG) r10
            X.725 r0 = r10.A00
            int r0 = r0.A00
        L_0x0401:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r6 = X.C40151uF.A00(r1, r0)
            return r6
        L_0x040a:
            X.6Jh r11 = (X.C121346Jh) r11
            boolean r0 = r11.A04
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            X.6Jh r10 = (X.C121346Jh) r10
            boolean r0 = r10.A04
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            int r6 = X.C40151uF.A00(r1, r0)
            return r6
        L_0x041f:
            X.2sr r11 = (X.C63312sr) r11
            long r0 = r11.A02
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            X.2sr r10 = (X.C63312sr) r10
            long r0 = r10.A02
        L_0x042b:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            int r6 = X.C40151uF.A00(r2, r0)
            return r6
        L_0x0434:
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r1 = r11.getValue()
            java.lang.Long r1 = (java.lang.Long) r1
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            java.lang.Object r0 = r10.getValue()
            java.lang.Long r0 = (java.lang.Long) r0
            int r6 = X.C40151uF.A00(r1, r0)
            return r6
        L_0x0449:
            r6 = -1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C147027Rn.compare(java.lang.Object, java.lang.Object):int");
    }
}
