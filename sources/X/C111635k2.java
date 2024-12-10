package X;

/* renamed from: X.5k2  reason: invalid class name and case insensitive filesystem */
public class C111635k2 extends C58342kX {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C111635k2(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002f, code lost:
        if (r1 == 3) goto L_0x010b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00ee, code lost:
        if (r1 == 8) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00f2, code lost:
        r0 = r5.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0109, code lost:
        if ((X.C112265lC.A00((X.C112265lC) ((androidx.recyclerview.widget.RecyclerView) r5.A01).A0B, r6) & 4294967295L) == 4294967295L) goto L_0x010b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x010b, code lost:
        r0 = r5.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0111, code lost:
        return ((androidx.recyclerview.widget.GridLayoutManager) r0).A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        if (r1 == 0) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        return 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A00(int r6) {
        /*
            r5 = this;
            int r0 = r5.A00
            switch(r0) {
                case 0: goto L_0x00f5;
                case 1: goto L_0x0005;
                case 2: goto L_0x0005;
                case 3: goto L_0x0005;
                case 4: goto L_0x0005;
                case 5: goto L_0x0093;
                case 6: goto L_0x00c8;
                case 7: goto L_0x001e;
                case 8: goto L_0x0055;
                case 9: goto L_0x0033;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r5.A02
            com.whatsapp.expressionstray.expression.avatars.AvatarExpressionsFragment r0 = (com.whatsapp.expressionstray.expression.avatars.AvatarExpressionsFragment) r0
            X.5kV r0 = r0.A0C
            if (r0 == 0) goto L_0x00f2
            int r1 = r0.getItemViewType(r6)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r0 == 0) goto L_0x00f2
            r0 = 2
            if (r1 == r0) goto L_0x001c
            if (r1 != 0) goto L_0x00f2
        L_0x001c:
            r4 = 1
        L_0x001d:
            return r4
        L_0x001e:
            java.lang.Object r0 = r5.A01
            X.1rD r0 = (X.C38391rD) r0
            if (r0 == 0) goto L_0x001c
            int r1 = r0.getItemViewType(r6)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r0 == 0) goto L_0x001c
            r0 = 3
            if (r1 != r0) goto L_0x001c
            goto L_0x010b
        L_0x0033:
            java.lang.Object r3 = r5.A01
            androidx.recyclerview.widget.GridLayoutManager r3 = (androidx.recyclerview.widget.GridLayoutManager) r3
            int r2 = r3.A0K()
            java.lang.Object r1 = r5.A02
            X.6KR r1 = (X.AnonymousClass6KR) r1
            java.util.List r0 = X.C42011xT.A0I
            X.8AU r0 = r1.A0A
            X.6zt r0 = r0.BTV()
            int r0 = r0.A00
            if (r2 <= r0) goto L_0x001c
            int r0 = r0 * 2
            int r0 = r0 + 1
            int r6 = r6 % r0
            if (r6 != 0) goto L_0x001c
            int r4 = r3.A00
            return r4
        L_0x0055:
            java.lang.Object r1 = r5.A02
            com.whatsapp.search.SearchGridLayoutManager r1 = (com.whatsapp.search.SearchGridLayoutManager) r1
            java.lang.Object r0 = r5.A01
            android.content.Context r0 = (android.content.Context) r0
            int r3 = X.C72453Mb.A08(r0)
            X.1rD r0 = r1.A00
            int r2 = r0.getItemViewType(r6)
            r0 = -1
            if (r2 == r0) goto L_0x0112
            r1 = 1
            if (r2 == r1) goto L_0x0112
            r0 = 2
            if (r2 == r0) goto L_0x0112
            r4 = 3
            if (r2 == r4) goto L_0x0112
            r0 = 4
            if (r2 == r0) goto L_0x0112
            switch(r2) {
                case 6: goto L_0x0112;
                case 7: goto L_0x0112;
                case 8: goto L_0x00c1;
                case 9: goto L_0x0090;
                case 10: goto L_0x0090;
                case 11: goto L_0x0112;
                case 12: goto L_0x0112;
                case 13: goto L_0x0112;
                case 14: goto L_0x0112;
                case 15: goto L_0x0112;
                case 16: goto L_0x0112;
                case 17: goto L_0x0112;
                case 18: goto L_0x0112;
                case 19: goto L_0x0112;
                case 20: goto L_0x0112;
                case 21: goto L_0x0112;
                case 22: goto L_0x0112;
                case 23: goto L_0x0112;
                case 24: goto L_0x0112;
                case 25: goto L_0x0112;
                case 26: goto L_0x0112;
                case 27: goto L_0x0112;
                case 28: goto L_0x0112;
                case 29: goto L_0x0112;
                case 30: goto L_0x0112;
                case 31: goto L_0x0112;
                case 32: goto L_0x0112;
                case 33: goto L_0x0112;
                case 34: goto L_0x0112;
                case 35: goto L_0x0112;
                case 36: goto L_0x0112;
                case 37: goto L_0x0112;
                case 38: goto L_0x0112;
                case 39: goto L_0x0112;
                case 40: goto L_0x0112;
                case 41: goto L_0x0112;
                case 42: goto L_0x0112;
                case 43: goto L_0x0112;
                case 44: goto L_0x0112;
                case 45: goto L_0x0112;
                case 46: goto L_0x0112;
                case 47: goto L_0x0112;
                case 48: goto L_0x0112;
                case 49: goto L_0x0112;
                case 50: goto L_0x008c;
                case 51: goto L_0x0112;
                case 52: goto L_0x008c;
                case 53: goto L_0x0112;
                default: goto L_0x0079;
            }
        L_0x0079:
            switch(r2) {
                case 99: goto L_0x0112;
                case 100: goto L_0x0112;
                case 101: goto L_0x0112;
                default: goto L_0x007c;
            }
        L_0x007c:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Invalid viewType: "
            java.lang.String r1 = X.AnonymousClass001.A1I(r0, r1, r2)
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r1)
            throw r0
        L_0x008c:
            if (r3 != r1) goto L_0x001d
            r4 = 6
            return r4
        L_0x0090:
            if (r3 != r1) goto L_0x00bd
            goto L_0x00c5
        L_0x0093:
            java.lang.Object r0 = r5.A01
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            X.1rD r0 = r0.A0B
            if (r0 == 0) goto L_0x00bf
            int r0 = r0.getItemViewType(r6)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x00a3:
            r4 = 1
            if (r0 == 0) goto L_0x001d
            int r0 = r0.intValue()
            if (r0 == 0) goto L_0x001d
            if (r0 != r4) goto L_0x001d
            java.lang.Object r0 = r5.A02
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.content.Context r0 = r0.A14()
            int r0 = X.C72453Mb.A08(r0)
            r4 = 2
            if (r0 != r4) goto L_0x001d
        L_0x00bd:
            r4 = 4
            return r4
        L_0x00bf:
            r0 = 0
            goto L_0x00a3
        L_0x00c1:
            r4 = 12
            if (r3 == r1) goto L_0x001d
        L_0x00c5:
            r4 = 8
            return r4
        L_0x00c8:
            java.lang.Object r0 = r5.A02
            com.whatsapp.expressionstray.expression.stickers.StickerExpressionsFragment r0 = (com.whatsapp.expressionstray.expression.stickers.StickerExpressionsFragment) r0
            X.5kV r0 = r0.A0F
            if (r0 == 0) goto L_0x00f2
            int r1 = r0.getItemViewType(r6)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r0 == 0) goto L_0x00f2
            r0 = 2
            if (r1 == r0) goto L_0x001c
            if (r1 == 0) goto L_0x001c
            r0 = 5
            if (r1 == r0) goto L_0x001c
            r0 = 11
            if (r1 == r0) goto L_0x001c
            r0 = 6
            if (r1 == r0) goto L_0x001c
            r0 = 3
            if (r1 == r0) goto L_0x001c
            r0 = 8
            if (r1 != r0) goto L_0x00f2
            goto L_0x001c
        L_0x00f2:
            java.lang.Object r0 = r5.A01
            goto L_0x010d
        L_0x00f5:
            java.lang.Object r0 = r5.A01
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            X.1rD r0 = r0.A0B
            X.5lC r0 = (X.C112265lC) r0
            long r3 = X.C112265lC.A00(r0, r6)
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x001c
        L_0x010b:
            java.lang.Object r0 = r5.A02
        L_0x010d:
            androidx.recyclerview.widget.GridLayoutManager r0 = (androidx.recyclerview.widget.GridLayoutManager) r0
            int r4 = r0.A00
            return r4
        L_0x0112:
            r4 = 24
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C111635k2.A00(int):int");
    }
}
