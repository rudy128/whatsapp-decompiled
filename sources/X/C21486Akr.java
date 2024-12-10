package X;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: X.Akr  reason: case insensitive filesystem */
public class C21486Akr implements Comparator {
    public final int A00;

    public C21486Akr(int i) {
        this.A00 = i;
    }

    public static List A00(Iterable iterable, int i) {
        return C29431cG.A0y(iterable, new C21486Akr(i));
    }

    public static void A01(int i, List list) {
        Collections.sort(list, new C21486Akr(i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:151:?, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:?, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:?, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:?, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:?, code lost:
        return -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:?, code lost:
        return -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0055, code lost:
        if (r1 != null) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0057, code lost:
        if (r0 != null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006d, code lost:
        r3 = r6.A02;
        r1 = r7.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0073, code lost:
        if (r3 > r1) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0077, code lost:
        if (r3 >= r1) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007a, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0088, code lost:
        return java.lang.Double.compare(r1.doubleValue(), r0.doubleValue());
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x019a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int compare(java.lang.Object r6, java.lang.Object r7) {
        /*
            r5 = this;
            int r0 = r5.A00
            switch(r0) {
                case 0: goto L_0x0031;
                case 1: goto L_0x00b5;
                case 2: goto L_0x00ce;
                case 3: goto L_0x00d7;
                case 4: goto L_0x0005;
                case 5: goto L_0x00e8;
                case 6: goto L_0x0024;
                case 7: goto L_0x0049;
                case 8: goto L_0x00f7;
                case 9: goto L_0x0005;
                case 10: goto L_0x0005;
                case 11: goto L_0x0108;
                case 12: goto L_0x0121;
                case 13: goto L_0x013a;
                case 14: goto L_0x0005;
                case 15: goto L_0x014f;
                case 16: goto L_0x016f;
                case 17: goto L_0x01b9;
                case 18: goto L_0x01b9;
                case 19: goto L_0x01d2;
                case 20: goto L_0x01e4;
                case 21: goto L_0x01f5;
                case 22: goto L_0x0202;
                case 23: goto L_0x020d;
                case 24: goto L_0x00d7;
                case 25: goto L_0x0069;
                case 26: goto L_0x005b;
                case 27: goto L_0x0016;
                case 28: goto L_0x0216;
                case 29: goto L_0x022b;
                case 30: goto L_0x0240;
                case 31: goto L_0x0255;
                case 32: goto L_0x026e;
                case 33: goto L_0x0279;
                case 34: goto L_0x0288;
                case 35: goto L_0x0295;
                case 36: goto L_0x029e;
                case 37: goto L_0x02bb;
                case 38: goto L_0x02da;
                case 39: goto L_0x02e5;
                case 40: goto L_0x02f0;
                case 41: goto L_0x0305;
                case 42: goto L_0x0059;
                case 43: goto L_0x00d7;
                case 44: goto L_0x0089;
                case 45: goto L_0x031a;
                case 46: goto L_0x0328;
                case 47: goto L_0x0335;
                case 48: goto L_0x0356;
                case 49: goto L_0x0360;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.AF1 r6 = (X.AF1) r6
            X.AEz r0 = r6.A0B
            java.lang.Double r1 = r0.A04
            X.AF1 r7 = (X.AF1) r7
            X.AEz r0 = r7.A0B
            java.lang.Double r0 = r0.A04
            int r4 = X.C40151uF.A00(r1, r0)
        L_0x0015:
            return r4
        L_0x0016:
            X.2ml r6 = (X.C59712ml) r6
            X.2ml r7 = (X.C59712ml) r7
            int r1 = r6.A00
            int r0 = r7.A00
            if (r1 > r0) goto L_0x0067
            if (r1 >= r0) goto L_0x006d
            goto L_0x00b3
        L_0x0024:
            X.BCm r6 = (X.BCm) r6
            X.BCm r7 = (X.BCm) r7
            java.lang.Double r1 = r7.BXO()
            java.lang.Double r0 = r6.BXO()
            goto L_0x0055
        L_0x0031:
            byte[] r6 = (byte[]) r6
            byte[] r7 = (byte[]) r7
            int r4 = r6.length
            int r0 = r7.length
            if (r4 == r0) goto L_0x003b
            int r4 = r4 - r0
            return r4
        L_0x003b:
            r2 = 0
        L_0x003c:
            if (r2 >= r4) goto L_0x0059
            byte r1 = r6[r2]
            byte r0 = r7[r2]
            if (r1 == r0) goto L_0x0046
            int r1 = r1 - r0
            return r1
        L_0x0046:
            int r2 = r2 + 1
            goto L_0x003c
        L_0x0049:
            X.BCm r6 = (X.BCm) r6
            X.BCm r7 = (X.BCm) r7
            java.lang.Double r1 = r6.BXO()
            java.lang.Double r0 = r7.BXO()
        L_0x0055:
            if (r1 != 0) goto L_0x007a
            if (r0 != 0) goto L_0x0067
        L_0x0059:
            r4 = 0
            return r4
        L_0x005b:
            X.2ml r6 = (X.C59712ml) r6
            X.2ml r7 = (X.C59712ml) r7
            int r1 = r6.A01
            int r0 = r7.A01
            if (r1 > r0) goto L_0x00b3
            if (r1 >= r0) goto L_0x006d
        L_0x0067:
            r4 = 1
            return r4
        L_0x0069:
            X.2ml r6 = (X.C59712ml) r6
            X.2ml r7 = (X.C59712ml) r7
        L_0x006d:
            long r3 = r6.A02
            long r1 = r7.A02
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x00b3
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0059
            goto L_0x0067
        L_0x007a:
            if (r0 == 0) goto L_0x00b3
            double r2 = r1.doubleValue()
            double r0 = r0.doubleValue()
            int r4 = java.lang.Double.compare(r2, r0)
            return r4
        L_0x0089:
            X.1ca r6 = (X.C29621ca) r6
            X.1ca r7 = (X.C29621ca) r7
            java.lang.String r3 = "jid"
            r4 = 0
            java.lang.Class<com.whatsapp.jid.DeviceJid> r1 = com.whatsapp.jid.DeviceJid.class
            com.whatsapp.jid.Jid r0 = r6.A0G(r1, r3)     // Catch:{ 1UI -> 0x0015 }
            com.whatsapp.jid.DeviceJid r0 = (com.whatsapp.jid.DeviceJid) r0     // Catch:{ 1UI -> 0x0015 }
            int r0 = r0.getDevice()     // Catch:{ 1UI -> 0x0015 }
            r2 = 0
            if (r0 != 0) goto L_0x00a0
            r2 = 1
        L_0x00a0:
            com.whatsapp.jid.Jid r0 = r7.A0G(r1, r3)     // Catch:{ 1UI -> 0x0015 }
            com.whatsapp.jid.DeviceJid r0 = (com.whatsapp.jid.DeviceJid) r0     // Catch:{ 1UI -> 0x0015 }
            int r1 = r0.getDevice()     // Catch:{ 1UI -> 0x0015 }
            r0 = 0
            if (r1 != 0) goto L_0x00ae
            r0 = 1
        L_0x00ae:
            if (r2 == r0) goto L_0x0015
            r4 = 1
            if (r2 == 0) goto L_0x0015
        L_0x00b3:
            r4 = -1
            return r4
        L_0x00b5:
            X.9rK r6 = (X.C194189rK) r6
            X.2rb r0 = r6.A01
            long r0 = r0.A02
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            X.9rK r7 = (X.C194189rK) r7
            X.2rb r0 = r7.A01
            long r0 = r0.A02
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            int r4 = X.C40151uF.A00(r2, r0)
            return r4
        L_0x00ce:
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = (java.lang.String) r7
            int r4 = X.C40151uF.A00(r6, r7)
            return r4
        L_0x00d7:
            X.1D6 r6 = (X.AnonymousClass1D6) r6
            java.lang.Object r1 = r6.first
            java.lang.Integer r1 = (java.lang.Integer) r1
            X.1D6 r7 = (X.AnonymousClass1D6) r7
            java.lang.Object r0 = r7.first
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r4 = X.C40151uF.A00(r1, r0)
            return r4
        L_0x00e8:
            X.B7g r6 = (X.C22424B7g) r6
            X.B7g r7 = (X.C22424B7g) r7
            long r2 = r7.BaP()
            long r0 = r6.BaP()
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            return r4
        L_0x00f7:
            X.BCm r6 = (X.BCm) r6
            X.BCm r7 = (X.BCm) r7
            double r2 = r6.BQl()
            double r0 = r7.BQl()
            int r4 = java.lang.Double.compare(r2, r0)
            return r4
        L_0x0108:
            X.AiY r6 = (X.C21345AiY) r6
            X.B6i r0 = r6.A03
            X.AF1 r0 = (X.AF1) r0
            X.AEz r0 = r0.A0B
            java.lang.Double r1 = r0.A04
            X.AiY r7 = (X.C21345AiY) r7
            X.B6i r0 = r7.A03
            X.AF1 r0 = (X.AF1) r0
            X.AEz r0 = r0.A0B
            java.lang.Double r0 = r0.A04
            int r4 = X.C40151uF.A00(r1, r0)
            return r4
        L_0x0121:
            X.AF1 r6 = (X.AF1) r6
            X.AF1 r7 = (X.AF1) r7
            X.AEz r0 = r6.A0B
            java.lang.Double r0 = r0.A04
            double r2 = r0.doubleValue()
            X.AEz r0 = r7.A0B
            java.lang.Double r0 = r0.A04
            double r0 = r0.doubleValue()
            int r4 = java.lang.Double.compare(r2, r0)
            return r4
        L_0x013a:
            X.AF1 r6 = (X.AF1) r6
            float r0 = r6.A06
            java.lang.Float r1 = java.lang.Float.valueOf(r0)
            X.AF1 r7 = (X.AF1) r7
            float r0 = r7.A06
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            int r4 = X.C40151uF.A00(r1, r0)
            return r4
        L_0x014f:
            java.io.File r6 = (java.io.File) r6
            java.io.File r7 = (java.io.File) r7
            java.lang.String r0 = r6.getName()     // Catch:{ Exception -> 0x01e2 }
            r1 = 8
            java.lang.String r0 = r0.substring(r1)     // Catch:{ Exception -> 0x01e2 }
            int r4 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x01e2 }
            java.lang.String r0 = r7.getName()     // Catch:{ Exception -> 0x01e2 }
            java.lang.String r0 = r0.substring(r1)     // Catch:{ Exception -> 0x01e2 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x01e2 }
            int r4 = r4 - r0
            return r4
        L_0x016f:
            X.2BT r6 = (X.AnonymousClass2BT) r6
            int r0 = r6.bitField0_
            boolean r0 = X.AnonymousClass8BW.A1Q(r0)
            r1 = 0
            if (r0 == 0) goto L_0x01b6
            X.8Xv r0 = r6.version_
            r3 = r0
            if (r0 != 0) goto L_0x0182
            X.8Xv r0 = X.C164178Xv.DEFAULT_INSTANCE
        L_0x0182:
            int r0 = r0.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x01b6
            if (r3 != 0) goto L_0x018c
            X.8Xv r3 = X.C164178Xv.DEFAULT_INSTANCE
        L_0x018c:
            long r3 = r3.version_
        L_0x018e:
            java.lang.Long r4 = java.lang.Long.valueOf(r3)
            X.2BT r7 = (X.AnonymousClass2BT) r7
            int r0 = r7.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x01ad
            X.8Xv r0 = r7.version_
            r3 = r0
            if (r0 != 0) goto L_0x01a1
            X.8Xv r0 = X.C164178Xv.DEFAULT_INSTANCE
        L_0x01a1:
            int r0 = r0.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x01ad
            if (r3 != 0) goto L_0x01ab
            X.8Xv r3 = X.C164178Xv.DEFAULT_INSTANCE
        L_0x01ab:
            long r1 = r3.version_
        L_0x01ad:
            java.lang.Long r0 = java.lang.Long.valueOf(r1)
            int r4 = X.C40151uF.A00(r4, r0)
            return r4
        L_0x01b6:
            r3 = 0
            goto L_0x018e
        L_0x01b9:
            X.A24 r7 = (X.A24) r7
            X.8qH r0 = r7.A00
            long r0 = r0.A04
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            X.A24 r6 = (X.A24) r6
            X.8qH r0 = r6.A00
            long r0 = r0.A04
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            int r4 = X.C40151uF.A00(r2, r0)
            return r4
        L_0x01d2:
            X.1ca r6 = (X.C29621ca) r6
            X.1ca r7 = (X.C29621ca) r7
            java.lang.String r0 = "id"
            int r4 = r6.A09(r0)     // Catch:{  }
            int r0 = r7.A09(r0)     // Catch:{  }
            int r4 = r4 - r0
            return r4
        L_0x01e2:
            r4 = 0
            return r4
        L_0x01e4:
            java.lang.Number r7 = (java.lang.Number) r7
            java.lang.Long r1 = X.AnonymousClass8BT.A0o(r7)
            java.lang.Number r6 = (java.lang.Number) r6
            java.lang.Long r0 = X.AnonymousClass8BT.A0o(r6)
            int r4 = X.C40151uF.A00(r1, r0)
            return r4
        L_0x01f5:
            X.AEs r6 = (X.C20284AEs) r6
            X.AEs r7 = (X.C20284AEs) r7
            java.lang.String r1 = r6.A0A
            java.lang.String r0 = r7.A0A
            int r4 = r1.compareTo(r0)
            return r4
        L_0x0202:
            X.9uL r6 = (X.C196029uL) r6
            X.9uL r7 = (X.C196029uL) r7
            long r2 = r7.A00
            long r0 = r6.A00
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            return r4
        L_0x020d:
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = (java.lang.String) r7
            int r4 = r6.compareToIgnoreCase(r7)
            return r4
        L_0x0216:
            X.9qk r6 = (X.C193839qk) r6
            int r0 = r6.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            X.9qk r7 = (X.C193839qk) r7
            int r0 = r7.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r4 = X.C40151uF.A00(r1, r0)
            return r4
        L_0x022b:
            X.9rn r6 = (X.C194479rn) r6
            int r0 = r6.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            X.9rn r7 = (X.C194479rn) r7
            int r0 = r7.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r4 = X.C40151uF.A00(r1, r0)
            return r4
        L_0x0240:
            X.9Bw r7 = (X.C178119Bw) r7
            long r0 = r7.A01
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            X.9Bw r6 = (X.C178119Bw) r6
            long r0 = r6.A01
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            int r4 = X.C40151uF.A00(r2, r0)
            return r4
        L_0x0255:
            X.1ci r7 = (X.C29691ci) r7
            long r0 = r7.A05()
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            X.1ci r6 = (X.C29691ci) r6
            long r0 = r6.A05()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            int r4 = X.C40151uF.A00(r2, r0)
            return r4
        L_0x026e:
            X.206 r6 = (X.AnonymousClass206) r6
            X.206 r7 = (X.AnonymousClass206) r7
            long r2 = r6.A0x
            long r0 = r7.A0x
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            return r4
        L_0x0279:
            X.1ci r6 = (X.C29691ci) r6
            X.1ci r7 = (X.C29691ci) r7
            long r2 = r7.A05()
            long r0 = r6.A05()
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            return r4
        L_0x0288:
            X.9gG r6 = (X.C187719gG) r6
            X.9gG r7 = (X.C187719gG) r7
            java.lang.String r1 = r6.A04
            java.lang.String r0 = r7.A04
            int r4 = r1.compareTo(r0)
            return r4
        L_0x0295:
            android.util.Pair r6 = (android.util.Pair) r6
            android.util.Pair r7 = (android.util.Pair) r7
            int r4 = X.A8U.A00(r6, r7)
            return r4
        L_0x029e:
            X.9se r6 = (X.C195009se) r6
            X.1E7 r0 = r6.A00
            r2 = 1
            boolean r0 = X.AnonymousClass000.A1X(r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            X.9se r7 = (X.C195009se) r7
            X.1E7 r0 = r7.A00
            if (r0 == 0) goto L_0x02b2
            r2 = 0
        L_0x02b2:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            int r4 = X.C40151uF.A00(r1, r0)
            return r4
        L_0x02bb:
            X.8pW r6 = (X.AnonymousClass8pW) r6
            X.8pW r7 = (X.AnonymousClass8pW) r7
            X.77e r0 = r6.A01
            java.lang.Object r1 = X.AnonymousClass8BT.A0q(r0)
            java.lang.String r1 = (java.lang.String) r1
            X.C17960vV.A07(r1)
            X.77e r0 = r7.A01
            java.lang.Object r0 = X.AnonymousClass8BT.A0q(r0)
            java.lang.String r0 = (java.lang.String) r0
            X.C17960vV.A07(r0)
            int r4 = r1.compareTo(r0)
            return r4
        L_0x02da:
            X.AW0 r6 = (X.AW0) r6
            X.AW0 r7 = (X.AW0) r7
            long r2 = r7.A06
            long r0 = r6.A06
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            return r4
        L_0x02e5:
            X.AW0 r6 = (X.AW0) r6
            X.AW0 r7 = (X.AW0) r7
            long r2 = r7.A05
            long r0 = r6.A05
            long r2 = r2 - r0
            int r4 = (int) r2
            return r4
        L_0x02f0:
            X.ADx r6 = (X.C20265ADx) r6
            java.util.List r0 = r6.A01
            java.lang.Integer r1 = X.AnonymousClass8BT.A0l(r0)
            X.ADx r7 = (X.C20265ADx) r7
            java.util.List r0 = r7.A01
            java.lang.Integer r0 = X.AnonymousClass8BT.A0l(r0)
            int r4 = X.C40151uF.A00(r1, r0)
            return r4
        L_0x0305:
            X.A18 r7 = (X.A18) r7
            int r0 = r7.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            X.A18 r6 = (X.A18) r6
            int r0 = r6.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r4 = X.C40151uF.A00(r1, r0)
            return r4
        L_0x031a:
            X.9Bw r6 = (X.C178119Bw) r6
            X.9Bw r7 = (X.C178119Bw) r7
            X.4cT r0 = r6.A04
            int r4 = r0.A00
            X.4cT r0 = r7.A04
            int r0 = r0.A00
            int r4 = r4 - r0
            return r4
        L_0x0328:
            X.2md r7 = (X.C59632md) r7
            com.whatsapp.jid.GroupJid r1 = r7.A02
            X.2md r6 = (X.C59632md) r6
            com.whatsapp.jid.GroupJid r0 = r6.A02
            int r4 = X.C40151uF.A00(r1, r0)
            return r4
        L_0x0335:
            X.9Yz r6 = (X.C183629Yz) r6
            X.9pl r0 = r6.A00
            X.9rC r0 = r0.A00
            int r0 = r0.A01
            int r0 = r0 >>> 3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            X.9Yz r7 = (X.C183629Yz) r7
            X.9pl r0 = r7.A00
            X.9rC r0 = r0.A00
            int r0 = r0.A01
            int r0 = r0 >>> 3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r4 = X.C40151uF.A00(r1, r0)
            return r4
        L_0x0356:
            X.9JN r6 = (X.AnonymousClass9JN) r6
            X.9JN r7 = (X.AnonymousClass9JN) r7
            int r4 = r6.version
            int r0 = r7.version
            int r4 = r4 - r0
            return r4
        L_0x0360:
            X.9qV r6 = (X.C193689qV) r6
            X.9qV r7 = (X.C193689qV) r7
            int r4 = org.pjsip.PjCameraInfo.lambda$static$0(r6, r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21486Akr.compare(java.lang.Object, java.lang.Object):int");
    }
}
