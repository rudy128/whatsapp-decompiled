package X;

import android.util.Pair;
import com.facebook.common.dextricks.StringTreeSet;

/* renamed from: X.Ctl  reason: case insensitive filesystem */
public abstract class C26169Ctl {
    public static final byte[] A00 = "OpusHead".getBytes(CIB.A05);

    public static Pair A00(C26207Cui cui, int i, int i2) {
        int i3;
        int i4;
        C26207Cui cui2 = cui;
        int i5 = cui2.A01;
        while (i5 - i < i2) {
            int A02 = C26207Cui.A02(cui2, i5);
            C84.A00(AnonymousClass000.A1R(A02), "childAtomSize must be positive");
            if (cui2.A03() == 1936289382) {
                int i6 = i5 + 8;
                boolean z = false;
                CSG csg = null;
                String str = null;
                Integer num = null;
                int i7 = -1;
                int i8 = 0;
                while (i6 - i5 < A02) {
                    int A022 = C26207Cui.A02(cui2, i6);
                    int A03 = cui2.A03();
                    if (A03 == 1718775137) {
                        num = Integer.valueOf(cui2.A03());
                    } else if (A03 == 1935894637) {
                        cui2.A0J(4);
                        str = cui2.A0E(4);
                    } else if (A03 == 1935894633) {
                        i7 = i6;
                        i8 = A022;
                    }
                    i6 += A022;
                }
                if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
                    C84.A00(AnonymousClass000.A1W(num), "frma atom is mandatory");
                    C84.A00(AnonymousClass000.A1S(i7, -1), "schi atom is mandatory");
                    int i9 = i7 + 8;
                    while (true) {
                        byte[] bArr = null;
                        if (i9 - i7 >= i8) {
                            break;
                        }
                        int A023 = C26207Cui.A02(cui2, i9);
                        if (cui2.A03() == 1952804451) {
                            int A032 = (cui2.A03() >> 24) & 255;
                            cui2.A0J(1);
                            if (A032 == 0) {
                                cui2.A0J(1);
                                i3 = 0;
                                i4 = 0;
                            } else {
                                int A04 = cui2.A04();
                                i3 = (A04 & 240) >> 4;
                                i4 = A04 & 15;
                            }
                            boolean A1T = AnonymousClass000.A1T(cui2.A04(), 1);
                            int A042 = cui2.A04();
                            byte[] bArr2 = new byte[16];
                            cui2.A0K(bArr2, 0, 16);
                            if (A1T && A042 == 0) {
                                int A043 = cui2.A04();
                                bArr = new byte[A043];
                                cui2.A0K(bArr, 0, A043);
                            }
                            csg = new CSG(str, bArr2, bArr, A042, i3, i4, A1T);
                            z = true;
                        } else {
                            i9 += A023;
                        }
                    }
                    C84.A00(z, "tenc atom is mandatory");
                    Pair create = Pair.create(num, csg);
                    if (create != null) {
                        return create;
                    }
                }
            }
            i5 += A02;
        }
        return null;
    }

    public static C25702CkX A01(String str, int i) {
        C25702CkX ckX = new C25702CkX();
        ckX.A0P = Integer.toString(i);
        ckX.A0R = str;
        return ckX;
    }

    public static CR4 A02(C26207Cui cui, int i) {
        cui.A0I(i + 8 + 4);
        cui.A0J(1);
        do {
        } while ((cui.A04() & 128) == 128);
        int A01 = C26207Cui.A01(cui, 2);
        if ((A01 & 128) != 0) {
            cui.A0J(2);
        }
        if ((A01 & 64) != 0) {
            cui.A0J(cui.A04());
        }
        if ((A01 & 32) != 0) {
            cui.A0J(2);
        }
        cui.A0J(1);
        do {
        } while ((cui.A04() & 128) == 128);
        String A02 = C26233CvQ.A02(cui.A04());
        if ("audio/mpeg".equals(A02) || "audio/vnd.dts".equals(A02) || "audio/vnd.dts.hd".equals(A02)) {
            return new CR4(A02, (byte[]) null, -1, -1);
        }
        cui.A0J(4);
        long A09 = cui.A09();
        long A092 = cui.A09();
        int A012 = C26207Cui.A01(cui, 1);
        int i2 = A012 & StringTreeSet.OFFSET_BASE_ENCODING;
        while ((A012 & 128) == 128) {
            A012 = cui.A04();
            i2 = (i2 << 7) | (A012 & StringTreeSet.OFFSET_BASE_ENCODING);
        }
        byte[] bArr = new byte[i2];
        cui.A0K(bArr, 0, i2);
        long j = -1;
        if (A092 <= 0) {
            A092 = -1;
        }
        if (A09 > 0) {
            j = A09;
        }
        return new CR4(A02, bArr, A092, j);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v0, resolved type: X.CSG[]} */
    /* JADX WARNING: type inference failed for: r10v5, types: [java.lang.Object, X.Cqu] */
    /* JADX WARNING: type inference failed for: r10v8, types: [java.lang.Object, X.Cqu] */
    /* JADX WARNING: type inference failed for: r10v13, types: [X.Ckw, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v58, types: [java.lang.Object, X.Cui] */
    /* JADX WARNING: type inference failed for: r3v66, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x080a, code lost:
        if (r20 != null) goto L_0x080c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x0840, code lost:
        if (r22 <= 0) goto L_0x0842;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:692:0x0e35, code lost:
        if (r1 == 7) goto L_0x0e37;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:767:0x0ff4, code lost:
        if ((r5.A04() & 128) == 0) goto L_0x0ff6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:779:0x100d, code lost:
        if (r0 == 7) goto L_0x100f;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:1009:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x036e  */
    /* JADX WARNING: Removed duplicated region for block: B:343:0x0740  */
    /* JADX WARNING: Removed duplicated region for block: B:375:0x081f  */
    /* JADX WARNING: Removed duplicated region for block: B:884:0x11a9  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.CU2 A03(X.DUU r73, X.C22769BOi r74, X.C22768BOh r75, long r76, boolean r78) {
        /*
            r1 = 1835297121(0x6d646961, float:4.4181236E27)
            r67 = r74
            r0 = r67
            X.BOi r6 = r0.A00(r1)
            X.C26056CrS.A01(r6)
            r0 = 1751411826(0x68646c72, float:4.3148E24)
            X.BOh r0 = r6.A01(r0)
            X.C26056CrS.A01(r0)
            X.Cui r1 = r0.A00
            r0 = 16
            int r1 = X.C26207Cui.A02(r1, r0)
            r0 = 1936684398(0x736f756e, float:1.8971874E31)
            if (r1 != r0) goto L_0x10dc
            r25 = 1
        L_0x0027:
            r1 = -1
            r33 = 0
            r0 = r25
            if (r0 == r1) goto L_0x11c8
            r1 = 1953196132(0x746b6864, float:7.46037E31)
            r0 = r67
            X.BOh r0 = r0.A01(r1)
            X.C26056CrS.A01(r0)
            X.Cui r10 = r0.A00
            r9 = 8
            int r11 = X.C26207Cui.A00(r10)
            r8 = 16
            r0 = 16
            if (r11 != 0) goto L_0x004a
            r0 = 8
        L_0x004a:
            r10.A0J(r0)
            int r45 = r10.A03()
            r7 = 4
            r10.A0J(r7)
            int r5 = r10.A01
            if (r11 != 0) goto L_0x005a
            r9 = 4
        L_0x005a:
            r30 = 0
            r4 = 0
        L_0x005d:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r9) goto L_0x10d7
            byte[] r2 = r10.A02
            int r3 = r5 + r4
            byte r3 = r2[r3]
            r2 = -1
            if (r3 == r2) goto L_0x10d3
            if (r11 != 0) goto L_0x10cd
            long r11 = r10.A09()
        L_0x0073:
            r3 = 0
            int r2 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x007a
            r0 = r11
        L_0x007a:
            r10.A0J(r8)
            int r5 = r10.A03()
            int r4 = r10.A03()
            r10.A0J(r7)
            int r7 = r10.A03()
            int r8 = r10.A03()
            r3 = 65536(0x10000, float:9.18355E-41)
            r2 = -65536(0xffffffffffff0000, float:NaN)
            if (r5 != 0) goto L_0x10c1
            if (r4 != r3) goto L_0x10b7
            if (r7 != r2) goto L_0x009e
            if (r8 != 0) goto L_0x009e
            r30 = 90
        L_0x009e:
            r71 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r76 > r71 ? 1 : (r76 == r71 ? 0 : -1))
            if (r2 == 0) goto L_0x00a9
            r0 = r76
        L_0x00a9:
            r2 = r75
            X.Cui r4 = r2.A00
            r3 = 8
            int r2 = X.C26207Cui.A00(r4)
            if (r2 == 0) goto L_0x00b7
            r3 = 16
        L_0x00b7:
            r4.A0J(r3)
            long r42 = r4.A09()
            int r2 = (r0 > r71 ? 1 : (r0 == r71 ? 0 : -1))
            if (r2 == 0) goto L_0x00c8
            r2 = r42
            long r71 = X.BE8.A0E(r0, r2)
        L_0x00c8:
            r0 = 1835626086(0x6d696e66, float:4.515217E27)
            X.BOi r1 = r6.A00(r0)
            X.C26056CrS.A01(r1)
            r0 = 1937007212(0x7374626c, float:1.9362132E31)
            X.BOi r2 = r1.A00(r0)
            X.C26056CrS.A01(r2)
            r0 = 1835296868(0x6d646864, float:4.418049E27)
            X.BOh r0 = r6.A01(r0)
            X.C26056CrS.A01(r0)
            X.Cui r6 = r0.A00
            r3 = 8
            int r1 = X.C26207Cui.A00(r6)
            r0 = 16
            if (r1 != 0) goto L_0x00f4
            r0 = 8
        L_0x00f4:
            r6.A0J(r0)
            long r4 = r6.A09()
            if (r1 != 0) goto L_0x00fe
            r3 = 4
        L_0x00fe:
            r6.A0J(r3)
            int r3 = r6.A06()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = ""
            r1.append(r0)
            int r0 = r3 >> 10
            r0 = r0 & 31
            int r0 = r0 + 96
            char r0 = (char) r0
            r1.append(r0)
            int r0 = r3 >> 5
            r0 = r0 & 31
            int r0 = r0 + 96
            char r0 = (char) r0
            r1.append(r0)
            r0 = r3 & 31
            int r0 = r0 + 96
            char r0 = (char) r0
            java.lang.String r1 = X.C17890vO.A0c(r1, r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            android.util.Pair r44 = android.util.Pair.create(r0, r1)
            r0 = 1937011556(0x73747364, float:1.9367383E31)
            X.BOh r0 = r2.A01(r0)
            X.C26056CrS.A01(r0)
            X.Cui r5 = r0.A00
            r0 = r44
            java.lang.Object r0 = r0.second
            r40 = r0
            r0 = r40
            java.lang.String r0 = (java.lang.String) r0
            r40 = r0
            r0 = 12
            int r41 = X.C26207Cui.A02(r5, r0)
            r4 = 0
            r38 = 0
            r0 = r41
            X.CSG[] r0 = new X.CSG[r0]
            r34 = r0
            r65 = 0
            r24 = 0
        L_0x015e:
            r1 = r24
            r0 = r41
            if (r1 >= r0) goto L_0x1144
            int r0 = r5.A01
            r16 = r0
            int r31 = r5.A03()
            boolean r0 = X.AnonymousClass000.A1R(r31)
            java.lang.String r39 = "childAtomSize must be positive"
            r1 = r39
            X.C84.A00(r0, r1)
            int r7 = r5.A03()
            r0 = 1635148593(0x61766331, float:2.840654E20)
            r2 = r73
            if (r7 == r0) goto L_0x0757
            r0 = 1635148595(0x61766333, float:2.8406544E20)
            if (r7 == r0) goto L_0x0757
            r0 = 1701733238(0x656e6376, float:7.035987E22)
            if (r7 == r0) goto L_0x0757
            r0 = 1831958048(0x6d317620, float:3.4326032E27)
            if (r7 == r0) goto L_0x0757
            r0 = 1836070006(0x6d703476, float:4.646239E27)
            if (r7 == r0) goto L_0x0757
            r0 = 1752589105(0x68766331, float:4.6541277E24)
            if (r7 == r0) goto L_0x0757
            r0 = 1751479857(0x68657631, float:4.3344087E24)
            if (r7 == r0) goto L_0x0757
            r0 = 1932670515(0x73323633, float:1.4119387E31)
            if (r7 == r0) goto L_0x0757
            r0 = 1211250227(0x48323633, float:182488.8)
            if (r7 == r0) goto L_0x0757
            r0 = 1987063864(0x76703038, float:1.21789965E33)
            if (r7 == r0) goto L_0x0757
            r0 = 1987063865(0x76703039, float:1.2178997E33)
            if (r7 == r0) goto L_0x0757
            r0 = 1635135537(0x61763031, float:2.8383572E20)
            if (r7 == r0) goto L_0x0757
            r0 = 1685479798(0x64766176, float:1.8179687E22)
            if (r7 == r0) goto L_0x0757
            r0 = 1685479729(0x64766131, float:1.817961E22)
            if (r7 == r0) goto L_0x0757
            r0 = 1685481573(0x64766865, float:1.8181686E22)
            if (r7 == r0) goto L_0x0757
            r0 = 1685481521(0x64766831, float:1.8181627E22)
            if (r7 == r0) goto L_0x0757
            r0 = 1836069985(0x6d703461, float:4.6462328E27)
            if (r7 == r0) goto L_0x02ff
            r0 = 1701733217(0x656e6361, float:7.0359778E22)
            if (r7 == r0) goto L_0x02ff
            r0 = 1633889587(0x61632d33, float:2.6191674E20)
            if (r7 == r0) goto L_0x02ff
            r0 = 1700998451(0x65632d33, float:6.7050686E22)
            if (r7 == r0) goto L_0x02ff
            r0 = 1633889588(0x61632d34, float:2.6191676E20)
            if (r7 == r0) goto L_0x02ff
            r0 = 1835823201(0x6d6c7061, float:4.573395E27)
            if (r7 == r0) goto L_0x02ff
            r0 = 1685353315(0x64747363, float:1.803728E22)
            if (r7 == r0) goto L_0x02ff
            r0 = 1685353317(0x64747365, float:1.8037282E22)
            if (r7 == r0) goto L_0x02ff
            r0 = 1685353320(0x64747368, float:1.8037286E22)
            if (r7 == r0) goto L_0x02ff
            r0 = 1685353324(0x6474736c, float:1.803729E22)
            if (r7 == r0) goto L_0x02ff
            r0 = 1685353336(0x64747378, float:1.8037304E22)
            if (r7 == r0) goto L_0x02ff
            r0 = 1935764850(0x73616d72, float:1.7860208E31)
            if (r7 == r0) goto L_0x02ff
            r0 = 1935767394(0x73617762, float:1.7863284E31)
            if (r7 == r0) goto L_0x02ff
            r0 = 1819304813(0x6c70636d, float:1.1624469E27)
            if (r7 == r0) goto L_0x02ff
            r0 = 1936684916(0x736f7774, float:1.89725E31)
            if (r7 == r0) goto L_0x02ff
            r0 = 1953984371(0x74776f73, float:7.841539E31)
            if (r7 == r0) goto L_0x02ff
            r0 = 778924082(0x2e6d7032, float:5.398721E-11)
            if (r7 == r0) goto L_0x02ff
            r0 = 778924083(0x2e6d7033, float:5.3987214E-11)
            if (r7 == r0) goto L_0x02ff
            r0 = 1835557169(0x6d686131, float:4.4948762E27)
            if (r7 == r0) goto L_0x02ff
            r0 = 1835560241(0x6d686d31, float:4.495783E27)
            if (r7 == r0) goto L_0x02ff
            r0 = 1634492771(0x616c6163, float:2.7252807E20)
            if (r7 == r0) goto L_0x02ff
            r0 = 1634492791(0x616c6177, float:2.7252842E20)
            if (r7 == r0) goto L_0x02ff
            r0 = 1970037111(0x756c6177, float:2.9964816E32)
            if (r7 == r0) goto L_0x02ff
            r0 = 1332770163(0x4f707573, float:4.03422899E9)
            if (r7 == r0) goto L_0x02ff
            r0 = 1716281667(0x664c6143, float:2.4128923E23)
            if (r7 == r0) goto L_0x02ff
            r0 = 1414810956(0x54544d4c, float:3.64731957E12)
            if (r7 == r0) goto L_0x02a8
            r0 = 1954034535(0x74783367, float:7.865797E31)
            if (r7 == r0) goto L_0x02a8
            r0 = 2004251764(0x77767474, float:4.998699E33)
            if (r7 == r0) goto L_0x02a8
            r0 = 1937010800(0x73747070, float:1.9366469E31)
            if (r7 == r0) goto L_0x02a8
            r0 = 1664495672(0x63363038, float:3.360782E21)
            if (r7 == r0) goto L_0x02a8
            r0 = 1835365492(0x6d657474, float:4.4383032E27)
            if (r7 != r0) goto L_0x028e
            int r0 = r16 + 8
            int r0 = r0 + 8
            r5.A0I(r0)
            r5.A0B()
            java.lang.String r0 = r5.A0B()
            if (r0 == 0) goto L_0x0283
            r1 = r45
            X.CkX r0 = A01(r0, r1)
            X.D48 r4 = new X.D48
            r4.<init>(r0)
        L_0x0283:
            int r16 = r16 + r31
            r0 = r16
            r5.A0I(r0)
            int r24 = r24 + 1
            goto L_0x015e
        L_0x028e:
            r0 = 1667329389(0x63616d6d, float:4.1584024E21)
            if (r7 != r0) goto L_0x0283
            X.CkX r0 = new X.CkX
            r0.<init>()
            java.lang.String r1 = java.lang.Integer.toString(r45)
            r0.A0P = r1
            java.lang.String r1 = "application/x-camera-motion"
            r0.A0R = r1
            X.D48 r4 = new X.D48
            r4.<init>(r0)
            goto L_0x0283
        L_0x02a8:
            int r0 = r16 + 8
            int r0 = r0 + 8
            r5.A0I(r0)
            r2 = 1414810956(0x54544d4c, float:3.64731957E12)
            java.lang.String r4 = "application/ttml+xml"
            r3 = 0
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r7 == r2) goto L_0x02d1
            r2 = 1954034535(0x74783367, float:7.865797E31)
            if (r7 != r2) goto L_0x02e5
            int r2 = r31 + -8
            int r4 = r2 + -8
            byte[] r3 = new byte[r4]
            r2 = 0
            r5.A0K(r3, r2, r4)
            X.1IX r3 = X.AnonymousClass1IX.of(r3)
            java.lang.String r4 = "application/x-quicktime-tx3g"
        L_0x02d1:
            r2 = r45
            X.CkX r2 = A01(r4, r2)
            r4 = r40
            r2.A0Q = r4
            r2.A0I = r0
            r2.A0S = r3
            X.D48 r4 = new X.D48
            r4.<init>(r2)
            goto L_0x0283
        L_0x02e5:
            r2 = 2004251764(0x77767474, float:4.998699E33)
            if (r7 != r2) goto L_0x02ed
            java.lang.String r4 = "application/x-mp4-vtt"
            goto L_0x02d1
        L_0x02ed:
            r2 = 1937010800(0x73747070, float:1.9366469E31)
            if (r7 != r2) goto L_0x02f5
            r0 = 0
            goto L_0x02d1
        L_0x02f5:
            r2 = 1664495672(0x63363038, float:3.360782E21)
            if (r7 != r2) goto L_0x1108
            r65 = 1
            java.lang.String r4 = "application/x-mp4-cea-608"
            goto L_0x02d1
        L_0x02ff:
            r11 = r2
            int r0 = r16 + 8
            r1 = 8
            int r0 = r0 + 8
            r5.A0I(r0)
            r0 = 6
            if (r78 == 0) goto L_0x0719
            int r6 = r5.A06()
            r5.A0J(r0)
        L_0x0313:
            r3 = 16
            r14 = 4
            r8 = 2
            r1 = 1
            if (r6 == 0) goto L_0x06ef
            if (r6 == r1) goto L_0x06ef
            if (r6 != r8) goto L_0x0283
            r5.A0J(r3)
            long r0 = r5.A08()
            double r0 = java.lang.Double.longBitsToDouble(r0)
            long r0 = java.lang.Math.round(r0)
            int r9 = (int) r0
            int r10 = r5.A05()
            r0 = 20
            r5.A0J(r0)
            r19 = 0
        L_0x0339:
            int r8 = r5.A01
            r0 = 1701733217(0x656e6361, float:7.0359778E22)
            if (r7 != r0) goto L_0x0358
            r1 = r16
            r0 = r31
            android.util.Pair r3 = A00(r5, r1, r0)
            if (r3 == 0) goto L_0x0355
            int r7 = X.C108965cb.A01(r3)
            if (r73 != 0) goto L_0x06d8
            r11 = 0
        L_0x0351:
            java.lang.Object r0 = r3.second
            r34[r24] = r0
        L_0x0355:
            r5.A0I(r8)
        L_0x0358:
            r0 = 1633889587(0x61632d33, float:2.6191674E20)
            r1 = 1634492771(0x616c6163, float:2.7252807E20)
            if (r7 != r0) goto L_0x061a
            java.lang.String r6 = "audio/ac3"
        L_0x0362:
            r18 = -1
        L_0x0364:
            r7 = 0
            r17 = 0
            r3 = 0
        L_0x0368:
            int r1 = r8 - r16
            r0 = r31
            if (r1 >= r0) goto L_0x071f
            int r2 = X.C26207Cui.A02(r5, r8)
            boolean r1 = X.AnonymousClass000.A1R(r2)
            r0 = r39
            X.C84.A00(r1, r0)
            int r0 = r5.A03()
            r1 = 1835557187(0x6d686143, float:4.4948815E27)
            if (r0 != r1) goto L_0x0397
            int r3 = r2 + -13
            byte[] r1 = new byte[r3]
            int r0 = r8 + 13
            r5.A0I(r0)
            r0 = 0
            r5.A0K(r1, r0, r3)
            X.1IX r3 = X.AnonymousClass1IX.of(r1)
        L_0x0395:
            int r8 = r8 + r2
            goto L_0x0368
        L_0x0397:
            r12 = 1702061171(0x65736473, float:7.183675E22)
            if (r0 == r12) goto L_0x059d
            if (r78 == 0) goto L_0x03c7
            r1 = 2002876005(0x77617665, float:4.5729223E33)
            if (r0 != r1) goto L_0x03c7
            int r1 = r5.A01
            boolean r13 = X.C108975cc.A1C(r1, r8)
            r0 = r33
            X.C84.A00(r13, r0)
        L_0x03ae:
            int r0 = r1 - r8
            if (r0 >= r2) goto L_0x0395
            int r14 = X.C26207Cui.A02(r5, r1)
            boolean r13 = X.AnonymousClass000.A1R(r14)
            r0 = r39
            X.C84.A00(r13, r0)
            int r0 = r5.A03()
            if (r0 == r12) goto L_0x059e
            int r1 = r1 + r14
            goto L_0x03ae
        L_0x03c7:
            r1 = 1684103987(0x64616333, float:1.6630662E22)
            if (r0 != r1) goto L_0x040f
            int r0 = r8 + 8
            r5.A0I(r0)
            java.lang.String r0 = java.lang.Integer.toString(r45)
            int r1 = r5.A04()
            r1 = r1 & 192(0xc0, float:2.69E-43)
            int r4 = r1 >> 6
            int[] r1 = X.C24716CHd.A02
            r12 = r1[r4]
            int r13 = r5.A04()
            int[] r4 = X.C24716CHd.A01
            r1 = r13 & 56
            int r1 = r1 >> 3
            r4 = r4[r1]
            r1 = r13 & 4
            if (r1 == 0) goto L_0x03f3
            int r4 = r4 + 1
        L_0x03f3:
            X.CkX r1 = new X.CkX
            r1.<init>()
            r1.A0P = r0
            java.lang.String r0 = "audio/ac3"
            r1.A0R = r0
            r1.A04 = r4
            r1.A0E = r12
            r1.A00(r11)
            r0 = r40
            r1.A0Q = r0
            X.D48 r4 = new X.D48
            r4.<init>(r1)
            goto L_0x0395
        L_0x040f:
            r1 = 1684366131(0x64656333, float:1.692581E22)
            if (r0 != r1) goto L_0x047e
            int r0 = r8 + 8
            r5.A0I(r0)
            java.lang.String r13 = java.lang.Integer.toString(r45)
            r0 = 2
            int r1 = X.C26207Cui.A01(r5, r0)
            r1 = r1 & 192(0xc0, float:2.69E-43)
            int r4 = r1 >> 6
            int[] r1 = X.C24716CHd.A02
            r12 = r1[r4]
            int r14 = r5.A04()
            int[] r4 = X.C24716CHd.A01
            r1 = r14 & 14
            int r1 = r1 >> 1
            r4 = r4[r1]
            r1 = r14 & 1
            if (r1 == 0) goto L_0x043c
            int r4 = r4 + 1
        L_0x043c:
            int r1 = r5.A04()
            r1 = r1 & 30
            int r1 = r1 >> 1
            if (r1 <= 0) goto L_0x044f
            int r1 = r5.A04()
            r0 = r0 & r1
            if (r0 == 0) goto L_0x044f
            int r4 = r4 + 2
        L_0x044f:
            int r1 = r5.A00
            int r0 = r5.A01
            int r1 = r1 - r0
            if (r1 <= 0) goto L_0x047b
            int r0 = r5.A04()
            r0 = r0 & 1
            if (r0 == 0) goto L_0x047b
            java.lang.String r1 = "audio/eac3-joc"
        L_0x0460:
            X.CkX r0 = new X.CkX
            r0.<init>()
            r0.A0P = r13
            r0.A0R = r1
            r0.A04 = r4
            r0.A0E = r12
            r0.A00(r11)
            r1 = r40
            r0.A0Q = r1
            X.D48 r4 = new X.D48
            r4.<init>(r0)
            goto L_0x0395
        L_0x047b:
            java.lang.String r1 = "audio/eac3"
            goto L_0x0460
        L_0x047e:
            r1 = 1684103988(0x64616334, float:1.6630663E22)
            if (r0 != r1) goto L_0x04bc
            int r0 = r8 + 8
            r5.A0I(r0)
            java.lang.String r12 = java.lang.Integer.toString(r45)
            r0 = 1
            int r0 = X.C26207Cui.A01(r5, r0)
            r0 = r0 & 32
            int r4 = r0 >> 5
            r0 = 1
            r1 = 44100(0xac44, float:6.1797E-41)
            if (r4 != r0) goto L_0x049e
            r1 = 48000(0xbb80, float:6.7262E-41)
        L_0x049e:
            X.CkX r0 = new X.CkX
            r0.<init>()
            r0.A0P = r12
            java.lang.String r4 = "audio/ac4"
            r0.A0R = r4
            r4 = 2
            r0.A04 = r4
            r0.A0E = r1
            r0.A00(r11)
            r1 = r40
            r0.A0Q = r1
            X.D48 r4 = new X.D48
            r4.<init>(r0)
            goto L_0x0395
        L_0x04bc:
            r1 = 1684892784(0x646d6c70, float:1.7518768E22)
            if (r0 != r1) goto L_0x04c8
            if (r19 <= 0) goto L_0x110d
            r9 = r19
            r10 = 2
            goto L_0x0395
        L_0x04c8:
            r1 = 1684305011(0x64647473, float:1.6856995E22)
            if (r0 != r1) goto L_0x04e5
            r0 = r45
            X.CkX r0 = A01(r6, r0)
            r0.A04 = r10
            r0.A0E = r9
            r0.A00(r11)
            r1 = r40
            r0.A0Q = r1
            X.D48 r4 = new X.D48
            r4.<init>(r0)
            goto L_0x0395
        L_0x04e5:
            r1 = 1682927731(0x644f7073, float:1.5306315E22)
            if (r0 != r1) goto L_0x0528
            int r1 = r2 + -8
            byte[] r3 = A00
            int r0 = r3.length
            int r12 = r0 + r1
            byte[] r12 = java.util.Arrays.copyOf(r3, r12)
            int r3 = r8 + 8
            r5.A0I(r3)
            r5.A0K(r12, r0, r1)
            r0 = 11
            byte r0 = r12[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r0 << 8
            r0 = 10
            byte r0 = r12[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r0 = r0 | r1
            long r0 = (long) r0
            r13 = 1000000000(0x3b9aca00, double:4.94065646E-315)
            long r0 = r0 * r13
            r13 = 48000(0xbb80, double:2.3715E-319)
            long r0 = r0 / r13
            r3 = 3
            java.util.ArrayList r3 = X.C17880vN.A0z(r3)
            r3.add(r12)
            X.BEB.A1R(r3, r0)
            r0 = 80000000(0x4c4b400, double:3.95252517E-316)
            X.BEB.A1R(r3, r0)
            goto L_0x0395
        L_0x0528:
            r1 = 1684425825(0x64664c61, float:1.6993019E22)
            if (r0 != r1) goto L_0x0556
            int r3 = r2 + -12
            int r0 = r3 + 4
            byte[] r1 = new byte[r0]
            r12 = 102(0x66, float:1.43E-43)
            r0 = 0
            r1[r0] = r12
            r12 = 76
            r0 = 1
            r1[r0] = r12
            r12 = 97
            r0 = 2
            r1[r0] = r12
            r12 = 3
            r0 = 67
            r1[r12] = r0
            int r0 = r8 + 12
            r5.A0I(r0)
            r0 = 4
            r5.A0K(r1, r0, r3)
            X.1IX r3 = X.AnonymousClass1IX.of(r1)
            goto L_0x0395
        L_0x0556:
            r1 = 1634492771(0x616c6163, float:2.7252807E20)
            if (r0 != r1) goto L_0x0395
            int r1 = r2 + -12
            byte[] r0 = new byte[r1]
            int r3 = r8 + 12
            r5.A0I(r3)
            r3 = 0
            r5.A0K(r0, r3, r1)
            X.Cui r3 = new X.Cui
            r3.<init>()
            r3.A02 = r0
            r3.A00 = r1
            r1 = 9
            r3.A0I(r1)
            int r9 = r3.A04()
            r1 = 20
            r3.A0I(r1)
            int r1 = r3.A05()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            android.util.Pair r1 = android.util.Pair.create(r3, r1)
            int r9 = X.C108965cb.A01(r1)
            int r10 = X.C108965cb.A00(r1)
            X.1IX r3 = X.AnonymousClass1IX.of(r0)
            goto L_0x0395
        L_0x059d:
            r1 = r8
        L_0x059e:
            r15 = -1
            if (r1 == r15) goto L_0x0395
            X.CR4 r7 = A02(r5, r1)
            java.lang.String r6 = r7.A02
            byte[] r1 = r7.A03
            if (r1 == 0) goto L_0x0395
            java.lang.String r0 = "audio/mp4a-latm"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x0614
            int r0 = r1.length
            X.Ckw r10 = new X.Ckw
            r10.<init>()
            r10.A03 = r1
            r10.A01 = r0
            r0 = 5
            int r0 = r10.A01(r0)
            r12 = 31
            if (r0 != r12) goto L_0x05cd
            r0 = 6
            int r0 = r10.A01(r0)
            int r0 = r0 + 32
        L_0x05cd:
            int r9 = X.Cfg.A00(r10)
            r3 = 4
            int r17 = r10.A01(r3)
            java.lang.StringBuilder r14 = X.AnonymousClass000.A10()
            java.lang.String r13 = "mp4a.40."
            java.lang.String r14 = X.AnonymousClass001.A1I(r13, r14, r0)
            r13 = 5
            if (r0 == r13) goto L_0x05e7
            r13 = 29
            if (r0 != r13) goto L_0x0601
        L_0x05e7:
            int r9 = X.Cfg.A00(r10)
            r0 = 5
            int r0 = r10.A01(r0)
            if (r0 != r12) goto L_0x05f9
            r0 = 6
            int r0 = r10.A01(r0)
            int r0 = r0 + 32
        L_0x05f9:
            r12 = 22
            if (r0 != r12) goto L_0x0601
            int r17 = r10.A01(r3)
        L_0x0601:
            int[] r0 = X.Cfg.A00
            r3 = r0[r17]
            if (r3 == r15) goto L_0x1122
            X.CP7 r0 = new X.CP7
            r0.<init>(r9, r3, r14)
            int r9 = r0.A01
            int r10 = r0.A00
            java.lang.String r0 = r0.A02
            r17 = r0
        L_0x0614:
            X.1IX r3 = X.AnonymousClass1IX.of(r1)
            goto L_0x0395
        L_0x061a:
            r0 = 1700998451(0x65632d33, float:6.7050686E22)
            if (r7 != r0) goto L_0x0623
            java.lang.String r6 = "audio/eac3"
            goto L_0x0362
        L_0x0623:
            r0 = 1633889588(0x61632d34, float:2.6191676E20)
            if (r7 != r0) goto L_0x062c
            java.lang.String r6 = "audio/ac4"
            goto L_0x0362
        L_0x062c:
            r0 = 1685353315(0x64747363, float:1.803728E22)
            if (r7 != r0) goto L_0x0635
            java.lang.String r6 = "audio/vnd.dts"
            goto L_0x0362
        L_0x0635:
            r0 = 1685353320(0x64747368, float:1.8037286E22)
            if (r7 == r0) goto L_0x06d4
            r0 = 1685353324(0x6474736c, float:1.803729E22)
            if (r7 == r0) goto L_0x06d4
            r0 = 1685353317(0x64747365, float:1.8037282E22)
            if (r7 != r0) goto L_0x0648
            java.lang.String r6 = "audio/vnd.dts.hd;profile=lbr"
            goto L_0x0362
        L_0x0648:
            r0 = 1685353336(0x64747378, float:1.8037304E22)
            if (r7 != r0) goto L_0x0651
            java.lang.String r6 = "audio/vnd.dts.uhd;profile=p2"
            goto L_0x0362
        L_0x0651:
            r0 = 1935764850(0x73616d72, float:1.7860208E31)
            if (r7 != r0) goto L_0x065a
            java.lang.String r6 = "audio/3gpp"
            goto L_0x0362
        L_0x065a:
            r0 = 1935767394(0x73617762, float:1.7863284E31)
            if (r7 != r0) goto L_0x0663
            java.lang.String r6 = "audio/amr-wb"
            goto L_0x0362
        L_0x0663:
            r0 = 1819304813(0x6c70636d, float:1.1624469E27)
            java.lang.String r6 = "audio/raw"
            if (r7 == r0) goto L_0x06d0
            r0 = 1936684916(0x736f7774, float:1.89725E31)
            if (r7 == r0) goto L_0x06d0
            r0 = 1953984371(0x74776f73, float:7.841539E31)
            if (r7 != r0) goto L_0x0678
            r18 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x0364
        L_0x0678:
            r0 = 778924082(0x2e6d7032, float:5.398721E-11)
            if (r7 == r0) goto L_0x06cc
            r0 = 778924083(0x2e6d7033, float:5.3987214E-11)
            if (r7 == r0) goto L_0x06cc
            r0 = 1835557169(0x6d686131, float:4.4948762E27)
            if (r7 != r0) goto L_0x068b
            java.lang.String r6 = "audio/mha1"
            goto L_0x0362
        L_0x068b:
            r0 = 1835560241(0x6d686d31, float:4.495783E27)
            if (r7 != r0) goto L_0x0694
            java.lang.String r6 = "audio/mhm1"
            goto L_0x0362
        L_0x0694:
            if (r7 != r1) goto L_0x069a
            java.lang.String r6 = "audio/alac"
            goto L_0x0362
        L_0x069a:
            r0 = 1634492791(0x616c6177, float:2.7252842E20)
            if (r7 != r0) goto L_0x06a3
            java.lang.String r6 = "audio/g711-alaw"
            goto L_0x0362
        L_0x06a3:
            r0 = 1970037111(0x756c6177, float:2.9964816E32)
            if (r7 != r0) goto L_0x06ac
            java.lang.String r6 = "audio/g711-mlaw"
            goto L_0x0362
        L_0x06ac:
            r0 = 1332770163(0x4f707573, float:4.03422899E9)
            if (r7 != r0) goto L_0x06b5
            java.lang.String r6 = "audio/opus"
            goto L_0x0362
        L_0x06b5:
            r0 = 1716281667(0x664c6143, float:2.4128923E23)
            if (r7 != r0) goto L_0x06be
            java.lang.String r6 = "audio/flac"
            goto L_0x0362
        L_0x06be:
            r0 = 1835823201(0x6d6c7061, float:4.573395E27)
            if (r7 != r0) goto L_0x06c7
            java.lang.String r6 = "audio/true-hd"
            goto L_0x0362
        L_0x06c7:
            r18 = -1
            r6 = 0
            goto L_0x0364
        L_0x06cc:
            java.lang.String r6 = "audio/mpeg"
            goto L_0x0362
        L_0x06d0:
            r18 = 2
            goto L_0x0364
        L_0x06d4:
            java.lang.String r6 = "audio/vnd.dts.hd"
            goto L_0x0362
        L_0x06d8:
            java.lang.Object r0 = r3.second
            X.CSG r0 = (X.CSG) r0
            java.lang.String r1 = r0.A02
            java.lang.String r0 = r2.A02
            boolean r0 = com.facebook.android.exoplayer2.util.Util.A0D(r0, r1)
            if (r0 != 0) goto L_0x0351
            X.D3w[] r0 = r2.A03
            X.DUU r11 = new X.DUU
            r11.<init>(r1, r0)
            goto L_0x0351
        L_0x06ef:
            int r10 = r5.A06()
            r5.A0J(r0)
            byte[] r8 = r5.A02
            int r0 = r5.A01
            int r9 = r0 + 1
            byte r0 = r8[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r13 = r0 << 8
            int r12 = r9 + 1
            byte r0 = r8[r9]
            r9 = r0 & 255(0xff, float:3.57E-43)
            r9 = r9 | r13
            int r0 = r12 + 2
            r5.A01 = r0
            int r0 = r0 - r14
            int r19 = X.C26207Cui.A02(r5, r0)
            if (r6 != r1) goto L_0x0339
            r5.A0J(r3)
            goto L_0x0339
        L_0x0719:
            r5.A0J(r1)
            r6 = 0
            goto L_0x0313
        L_0x071f:
            if (r4 != 0) goto L_0x0283
            if (r6 == 0) goto L_0x0283
            r0 = r45
            X.CkX r2 = A01(r6, r0)
            r0 = r17
            r2.A0N = r0
            r2.A04 = r10
            r2.A0E = r9
            r0 = r18
            r2.A0A = r0
            r2.A0S = r3
            r2.A00(r11)
            r0 = r40
            r2.A0Q = r0
            if (r7 == 0) goto L_0x0750
            long r0 = r7.A00
            int r0 = X.C25336Cdv.A00(r0)
            r2.A03 = r0
            long r0 = r7.A01
            int r0 = X.C25336Cdv.A00(r0)
            r2.A0B = r0
        L_0x0750:
            X.D48 r4 = new X.D48
            r4.<init>(r2)
            goto L_0x0283
        L_0x0757:
            r32 = r2
            int r0 = r16 + 8
            int r0 = r0 + 8
            r5.A0I(r0)
            r0 = 16
            r5.A0J(r0)
            int r36 = r5.A06()
            int r37 = r5.A06()
            r0 = 50
            r5.A0J(r0)
            int r0 = r5.A01
            r28 = r0
            r0 = 1701733238(0x656e6376, float:7.035987E22)
            if (r7 != r0) goto L_0x0796
            r1 = r16
            r0 = r31
            android.util.Pair r3 = A00(r5, r1, r0)
            if (r3 == 0) goto L_0x0791
            int r7 = X.C108965cb.A01(r3)
            if (r73 != 0) goto L_0x109e
            r32 = 0
        L_0x078d:
            java.lang.Object r0 = r3.second
            r34[r24] = r0
        L_0x0791:
            r0 = r28
            r5.A0I(r0)
        L_0x0796:
            r0 = 1831958048(0x6d317620, float:3.4326032E27)
            java.lang.String r35 = "video/3gpp"
            if (r7 != r0) goto L_0x1094
            java.lang.String r11 = "video/mpeg"
        L_0x079f:
            r27 = 1065353216(0x3f800000, float:1.0)
            r26 = 0
            r49 = 0
            r48 = 0
            r21 = -1
            r19 = -1
            r18 = -1
            r17 = -1
            r20 = 0
            r29 = 0
            r23 = 0
        L_0x07b5:
            int r1 = r28 - r16
            r0 = r31
            if (r1 >= r0) goto L_0x07d0
            r0 = r28
            r5.A0I(r0)
            int r2 = r5.A01
            int r22 = r5.A03()
            if (r22 != 0) goto L_0x083f
            int r1 = r5.A01
            int r1 = r1 - r16
            r0 = r31
            if (r1 != r0) goto L_0x0842
        L_0x07d0:
            if (r11 == 0) goto L_0x0283
            r0 = r45
            X.CkX r2 = A01(r11, r0)
            r0 = r49
            r2.A0N = r0
            r0 = r36
            r2.A0H = r0
            r0 = r37
            r2.A08 = r0
            r0 = r27
            r2.A01 = r0
            r0 = r30
            r2.A0D = r0
            r0 = r26
            r2.A0T = r0
            r0 = r21
            r2.A0G = r0
            r0 = r48
            r2.A0S = r0
            r0 = r32
            r2.A00(r0)
            r0 = -1
            r1 = r19
            if (r1 != r0) goto L_0x083a
            r1 = r18
            if (r1 != r0) goto L_0x083a
            r1 = r17
            if (r1 != r0) goto L_0x083a
            if (r20 == 0) goto L_0x081d
        L_0x080c:
            byte[] r1 = r20.array()
        L_0x0810:
            X.D3h r0 = new X.D3h
            r3 = r19
            r4 = r18
            r6 = r17
            r0.<init>(r1, r3, r4, r6)
            r2.A0M = r0
        L_0x081d:
            if (r29 == 0) goto L_0x0833
            r0 = r29
            long r0 = r0.A00
            int r0 = X.C25336Cdv.A00(r0)
            r2.A03 = r0
            r0 = r29
            long r0 = r0.A01
            int r0 = X.C25336Cdv.A00(r0)
            r2.A0B = r0
        L_0x0833:
            X.D48 r4 = new X.D48
            r4.<init>(r2)
            goto L_0x0283
        L_0x083a:
            if (r20 != 0) goto L_0x080c
            r1 = r33
            goto L_0x0810
        L_0x083f:
            r1 = 1
            if (r22 > 0) goto L_0x0843
        L_0x0842:
            r1 = 0
        L_0x0843:
            r0 = r39
            X.C84.A00(r1, r0)
            int r1 = r5.A03()
            r0 = 1635148611(0x61766343, float:2.8406573E20)
            if (r1 != r0) goto L_0x0a1d
            boolean r1 = X.AnonymousClass000.A1X(r11)
            r0 = r33
            X.C84.A00(r1, r0)
            int r0 = r2 + 8
            r5.A0I(r0)
            r0 = 4
            int r1 = X.C26207Cui.A01(r5, r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1130 }
            r0 = 3
            r1 = r1 & 3
            int r14 = r1 + 1
            if (r14 == r0) goto L_0x112b
            java.util.ArrayList r11 = X.AnonymousClass000.A13()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1130 }
            int r0 = r5.A04()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1130 }
            r10 = r0 & 31
            r9 = 0
            r8 = 0
        L_0x0877:
            if (r8 >= r10) goto L_0x0897
            int r6 = r5.A06()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1130 }
            int r12 = r5.A01     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1130 }
            r5.A0J(r6)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1130 }
            byte[] r3 = r5.A02     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1130 }
            byte[] r2 = X.C24696CGi.A00     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1130 }
            r0 = 4
            r1 = 4
            int r0 = r0 + r6
            byte[] r0 = new byte[r0]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1130 }
            java.lang.System.arraycopy(r2, r9, r0, r9, r1)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1130 }
            java.lang.System.arraycopy(r3, r12, r0, r1, r6)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1130 }
            r11.add(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1130 }
            int r8 = r8 + 1
            goto L_0x0877
        L_0x0897:
            int r13 = r5.A04()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1130 }
            r8 = 0
        L_0x089c:
            if (r8 >= r13) goto L_0x08bc
            int r6 = r5.A06()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1130 }
            int r12 = r5.A01     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1130 }
            r5.A0J(r6)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1130 }
            byte[] r3 = r5.A02     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1130 }
            byte[] r2 = X.C24696CGi.A00     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1130 }
            r0 = 4
            r1 = 4
            int r0 = r0 + r6
            byte[] r0 = new byte[r0]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1130 }
            java.lang.System.arraycopy(r2, r9, r0, r9, r1)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1130 }
            java.lang.System.arraycopy(r3, r12, r0, r1, r6)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1130 }
            r11.add(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1130 }
            int r8 = r8 + 1
            goto L_0x089c
        L_0x08bc:
            if (r10 <= 0) goto L_0x09e9
            java.lang.Object r0 = r11.get(r9)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1130 }
            byte[] r0 = (byte[]) r0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1130 }
            java.lang.Object r2 = r11.get(r9)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1130 }
            byte[] r2 = (byte[]) r2     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1130 }
            int r1 = r0.length     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1130 }
            int r0 = r14 + 1
            X.Cqu r10 = new X.Cqu     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1130 }
            r10.<init>()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1130 }
            r10.A03 = r2     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1130 }
            r10.A02 = r0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1130 }
            r10.A01 = r1     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1130 }
            r10.A00 = r9     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1130 }
            X.C26034Cqu.A01(r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1130 }
            r0 = 8
            int r9 = r10.A03(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1130 }
            int r47 = r10.A03(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1130 }
            int r15 = r10.A03(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1130 }
            X.C26034Cqu.A00(r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1130 }
            r0 = 100
            r8 = 3
            r12 = 1
            if (r9 == r0) goto L_0x0918
            r0 = 110(0x6e, float:1.54E-43)
            if (r9 == r0) goto L_0x0918
            r0 = 122(0x7a, float:1.71E-43)
            if (r9 == r0) goto L_0x0918
            r0 = 244(0xf4, float:3.42E-43)
            if (r9 == r0) goto L_0x0918
            r0 = 44
            if (r9 == r0) goto L_0x0918
            r0 = 83
            if (r9 == r0) goto L_0x0918
            r0 = 86
            if (r9 == r0) goto L_0x0918
            r0 = 118(0x76, float:1.65E-43)
            if (r9 == r0) goto L_0x0918
            r0 = 128(0x80, float:1.794E-43)
            if (r9 == r0) goto L_0x0918
            r0 = 138(0x8a, float:1.93E-43)
            if (r9 != r0) goto L_0x096c
        L_0x0918:
            int r0 = X.C26034Cqu.A00(r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1130 }
            if (r0 != r8) goto L_0x0921
            r10.A04()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1130 }
        L_0x0921:
            X.C26034Cqu.A00(r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1130 }
            X.C26034Cqu.A00(r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1130 }
            r10.A04()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1130 }
            boolean r1 = r10.A06()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1130 }
            if (r1 == 0) goto L_0x096c
            r6 = 12
            if (r0 == r8) goto L_0x0936
            r6 = 8
        L_0x0936:
            r3 = 0
        L_0x0937:
            boolean r0 = r10.A06()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1130 }
            if (r0 == 0) goto L_0x0967
            r0 = 6
            r2 = 64
            if (r3 >= r0) goto L_0x0944
            r2 = 16
        L_0x0944:
            r46 = 8
            r1 = 0
        L_0x0947:
            int r38 = X.C26034Cqu.A00(r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1130 }
            int r13 = r38 % 2
            r0 = 1
            if (r13 != 0) goto L_0x0951
            r0 = -1
        L_0x0951:
            int r13 = r38 + 1
            int r13 = r13 / 2
            int r0 = r0 * r13
            int r0 = r0 + r46
            int r0 = r0 + 256
            int r0 = r0 % 256
            if (r0 == 0) goto L_0x0960
            r46 = r0
        L_0x0960:
            int r1 = r1 + 1
            if (r1 >= r2) goto L_0x0967
            if (r0 == 0) goto L_0x0960
            goto L_0x0947
        L_0x0967:
            int r3 = r3 + 1
            if (r3 >= r6) goto L_0x096c
            goto L_0x0937
        L_0x096c:
            X.C26034Cqu.A00(r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1130 }
            int r0 = X.C26034Cqu.A00(r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1130 }
            if (r0 != 0) goto L_0x09c7
            X.C26034Cqu.A00(r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1130 }
        L_0x0978:
            X.C26034Cqu.A00(r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1130 }
            r10.A04()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1130 }
            X.C26034Cqu.A00(r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1130 }
            X.C26034Cqu.A00(r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1130 }
            boolean r0 = r10.A06()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1130 }
            if (r0 != 0) goto L_0x098d
            r10.A04()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1130 }
        L_0x098d:
            r10.A04()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1130 }
            boolean r0 = r10.A06()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1130 }
            if (r0 == 0) goto L_0x09a2
            X.C26034Cqu.A00(r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1130 }
            X.C26034Cqu.A00(r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1130 }
            X.C26034Cqu.A00(r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1130 }
            X.C26034Cqu.A00(r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1130 }
        L_0x09a2:
            boolean r0 = r10.A06()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1130 }
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L_0x09f5
            boolean r0 = r10.A06()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1130 }
            if (r0 == 0) goto L_0x09f5
            r0 = 8
            int r2 = r10.A03(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1130 }
            r0 = 255(0xff, float:3.57E-43)
            if (r2 != r0) goto L_0x09ed
            r2 = 16
            int r0 = r10.A03(r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1130 }
            int r2 = r10.A03(r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1130 }
            if (r0 == 0) goto L_0x09f5
            goto L_0x09e3
        L_0x09c7:
            if (r0 != r12) goto L_0x0978
            r10.A04()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1130 }
            X.C26034Cqu.A00(r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1130 }
            X.C26034Cqu.A00(r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1130 }
            int r0 = X.C26034Cqu.A00(r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1130 }
            long r2 = (long) r0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1130 }
            r6 = 0
        L_0x09d8:
            long r0 = (long) r6     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1130 }
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 >= 0) goto L_0x0978
            X.C26034Cqu.A00(r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1130 }
            int r6 = r6 + 1
            goto L_0x09d8
        L_0x09e3:
            if (r2 == 0) goto L_0x09f5
            float r1 = (float) r0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1130 }
            float r0 = (float) r2     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1130 }
            float r1 = r1 / r0
            goto L_0x09f5
        L_0x09e9:
            r2 = 0
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0a06
        L_0x09ed:
            float[] r3 = X.C24727CHp.A03     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1130 }
            r0 = 17
            if (r2 >= r0) goto L_0x0a0d
            r1 = r3[r2]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1130 }
        L_0x09f5:
            java.lang.Object[] r3 = new java.lang.Object[r8]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1130 }
            r2 = 0
            r0 = r47
            X.BEA.A1V(r3, r9, r2, r0, r12)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1130 }
            X.BE8.A1M(r3, r15)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1130 }
            java.lang.String r0 = "avc1.%02X%02X%02X"
            java.lang.String r2 = java.lang.String.format(r0, r3)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1130 }
        L_0x0a06:
            X.CRA r0 = new X.CRA     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1130 }
            r0.<init>(r2, r11, r1, r14)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1130 }
            goto L_0x107c
        L_0x0a0d:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1130 }
            java.lang.String r0 = "Unexpected aspect_ratio_idc value: "
            java.lang.String r2 = X.AnonymousClass001.A1I(r0, r3, r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1130 }
            java.lang.String r0 = "NalUnitUtil"
            android.util.Log.w(r0, r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1130 }
            goto L_0x09f5
        L_0x0a1d:
            r0 = 1752589123(0x68766343, float:4.6541328E24)
            if (r1 != r0) goto L_0x0de8
            boolean r1 = X.AnonymousClass000.A1X(r11)
            r0 = r33
            X.C84.A00(r1, r0)
            int r0 = r2 + 8
            r5.A0I(r0)
            r0 = 21
            int r0 = X.C26207Cui.A01(r5, r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            r64 = r0 & 3
            int r63 = r5.A04()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            int r3 = r5.A01     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            r2 = 0
            r62 = 0
        L_0x0a41:
            r1 = 1
            r0 = r63
            if (r2 >= r0) goto L_0x0a61
            r5.A0J(r1)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            int r6 = r5.A06()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            r1 = 0
        L_0x0a4e:
            if (r1 >= r6) goto L_0x0a5e
            int r0 = r5.A06()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            int r8 = r0 + 4
            int r62 = r62 + r8
            r5.A0J(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            int r1 = r1 + 1
            goto L_0x0a4e
        L_0x0a5e:
            int r2 = r2 + 1
            goto L_0x0a41
        L_0x0a61:
            r5.A0I(r3)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            r0 = r62
            byte[] r0 = new byte[r0]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            r66 = r0
            r3 = 0
            r61 = 0
            r11 = 0
            r8 = 1065353216(0x3f800000, float:1.0)
        L_0x0a70:
            r1 = r61
            r0 = r63
            if (r1 >= r0) goto L_0x0dc0
            int r0 = r5.A04()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            r10 = r0 & 127(0x7f, float:1.78E-43)
            int r60 = r5.A06()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            r59 = 0
        L_0x0a82:
            r1 = r59
            r0 = r60
            if (r1 >= r0) goto L_0x0dbc
            int r58 = r5.A06()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            byte[] r6 = X.C24727CHp.A02     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            r1 = 4
            r2 = 0
            r0 = r66
            java.lang.System.arraycopy(r6, r2, r0, r11, r1)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            int r11 = r11 + 4
            byte[] r9 = r5.A02     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            int r6 = r5.A01     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            r1 = r0
            r0 = r58
            java.lang.System.arraycopy(r9, r6, r1, r11, r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            r0 = 33
            if (r10 != r0) goto L_0x0db1
            if (r59 != 0) goto L_0x0db1
            int r3 = r11 + r58
            int r1 = r11 + 2
            X.Cqu r10 = new X.Cqu     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            r10.<init>()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            r0 = r66
            r10.A03 = r0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            r10.A02 = r1     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            r10.A01 = r3     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            r10.A00 = r2     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            X.C26034Cqu.A01(r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            r0 = 4
            r10.A05(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            r2 = 3
            int r1 = r10.A03(r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            r10.A04()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            r0 = 2
            int r57 = r10.A03(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            boolean r56 = r10.A06()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            r0 = 5
            int r55 = r10.A03(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            r54 = 0
            r3 = 0
        L_0x0ada:
            r0 = 32
            r9 = 1
            if (r3 >= r0) goto L_0x0aeb
            boolean r0 = r10.A06()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            if (r0 == 0) goto L_0x0ae8
            int r9 = r9 << r3
            r54 = r54 | r9
        L_0x0ae8:
            int r3 = r3 + 1
            goto L_0x0ada
        L_0x0aeb:
            r0 = 6
            int[] r0 = new int[r0]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            r53 = r0
            r3 = 0
        L_0x0af1:
            r0 = 8
            int r0 = r10.A03(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            r53[r3] = r0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            int r3 = r3 + 1
            r0 = 6
            if (r3 < r0) goto L_0x0af1
            r0 = 8
            int r52 = r10.A03(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            r3 = 0
            r0 = 0
        L_0x0b06:
            if (r3 >= r1) goto L_0x0b1b
            boolean r6 = r10.A06()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            if (r6 == 0) goto L_0x0b10
            int r0 = r0 + 89
        L_0x0b10:
            boolean r6 = r10.A06()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            if (r6 == 0) goto L_0x0b18
            int r0 = r0 + 8
        L_0x0b18:
            int r3 = r3 + 1
            goto L_0x0b06
        L_0x0b1b:
            r10.A05(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            if (r1 <= 0) goto L_0x0b27
            int r0 = 8 - r1
            int r0 = r0 * 2
            r10.A05(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
        L_0x0b27:
            X.C26034Cqu.A00(r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            int r0 = X.C26034Cqu.A00(r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            if (r0 != r2) goto L_0x0b33
            r10.A04()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
        L_0x0b33:
            X.C26034Cqu.A00(r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            X.C26034Cqu.A00(r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            boolean r0 = r10.A06()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            if (r0 == 0) goto L_0x0b4b
            X.C26034Cqu.A00(r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            X.C26034Cqu.A00(r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            X.C26034Cqu.A00(r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            X.C26034Cqu.A00(r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
        L_0x0b4b:
            X.C26034Cqu.A00(r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            X.C26034Cqu.A00(r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            int r51 = X.C26034Cqu.A00(r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            boolean r2 = r10.A06()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            r0 = r1
            if (r2 == 0) goto L_0x0b5d
            r0 = 0
        L_0x0b5d:
            X.C26034Cqu.A00(r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            X.C26034Cqu.A00(r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            if (r0 > r1) goto L_0x0b6b
            X.C26034Cqu.A00(r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            int r0 = r0 + 1
            goto L_0x0b5d
        L_0x0b6b:
            X.C26034Cqu.A00(r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            X.C26034Cqu.A00(r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            X.C26034Cqu.A00(r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            X.C26034Cqu.A00(r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            boolean r0 = r10.A06()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            if (r0 == 0) goto L_0x0bb8
            boolean r0 = r10.A06()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            if (r0 == 0) goto L_0x0bb8
            r1 = 0
        L_0x0b84:
            r2 = 0
        L_0x0b85:
            boolean r0 = r10.A06()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            r6 = 1
            if (r0 != 0) goto L_0x0b90
            X.C26034Cqu.A00(r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            goto L_0x0baa
        L_0x0b90:
            int r0 = r1 << 1
            int r0 = r0 + 4
            int r3 = r9 << r0
            r0 = 64
            int r3 = java.lang.Math.min(r0, r3)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            if (r1 <= r9) goto L_0x0ba1
            X.C26034Cqu.A00(r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
        L_0x0ba1:
            r0 = 0
        L_0x0ba2:
            if (r0 >= r3) goto L_0x0baa
            X.C26034Cqu.A00(r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            int r0 = r0 + 1
            goto L_0x0ba2
        L_0x0baa:
            r0 = 3
            if (r1 != r0) goto L_0x0bae
            r6 = 3
        L_0x0bae:
            int r2 = r2 + r6
            r0 = 6
            if (r2 < r0) goto L_0x0b85
            int r1 = r1 + 1
            r0 = 4
            if (r1 >= r0) goto L_0x0bb8
            goto L_0x0b84
        L_0x0bb8:
            r0 = 2
            r10.A05(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            boolean r0 = r10.A06()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            if (r0 == 0) goto L_0x0bd0
            r0 = 8
            r10.A05(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            X.C26034Cqu.A00(r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            X.C26034Cqu.A00(r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            r10.A04()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
        L_0x0bd0:
            int r50 = X.C26034Cqu.A00(r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            r0 = 0
            int[] r15 = new int[r0]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            int[] r12 = new int[r0]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            r8 = -1
            r6 = -1
            r49 = 0
        L_0x0bdd:
            r1 = r50
            r0 = r49
            if (r0 >= r1) goto L_0x0ccc
            if (r0 == 0) goto L_0x0c9a
            boolean r0 = r10.A06()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            if (r0 == 0) goto L_0x0c9a
            int r13 = r8 + r6
            boolean r2 = r10.A06()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            int r0 = X.C26034Cqu.A00(r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            int r1 = r0 + 1
            int r0 = r2 * 2
            int r48 = 1 - r0
            int r48 = r48 * r1
            int r2 = r13 + 1
            boolean[] r3 = new boolean[r2]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            r0 = 0
        L_0x0c02:
            if (r0 > r13) goto L_0x0c16
            boolean r1 = r10.A06()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            if (r1 != 0) goto L_0x0c11
            boolean r1 = r10.A06()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            r3[r0] = r1     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            goto L_0x0c13
        L_0x0c11:
            r3[r0] = r9     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
        L_0x0c13:
            int r0 = r0 + 1
            goto L_0x0c02
        L_0x0c16:
            int[] r1 = new int[r2]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            int[] r14 = new int[r2]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            int r46 = r6 + -1
            r2 = 0
        L_0x0c1d:
            if (r46 < 0) goto L_0x0c33
            r38 = r12[r46]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            int r38 = r38 + r48
            if (r38 >= 0) goto L_0x0c30
            int r0 = r8 + r46
            boolean r0 = r3[r0]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            if (r0 == 0) goto L_0x0c30
            int r0 = r2 + 1
            r1[r2] = r38     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            r2 = r0
        L_0x0c30:
            int r46 = r46 + -1
            goto L_0x0c1d
        L_0x0c33:
            if (r48 >= 0) goto L_0x0c3e
            boolean r0 = r3[r13]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            if (r0 == 0) goto L_0x0c3e
            int r0 = r2 + 1
            r1[r2] = r48     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            r2 = r0
        L_0x0c3e:
            r0 = 0
        L_0x0c3f:
            if (r0 >= r8) goto L_0x0c54
            r46 = r15[r0]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            int r46 = r46 + r48
            if (r46 >= 0) goto L_0x0c51
            boolean r38 = r3[r0]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            if (r38 == 0) goto L_0x0c51
            int r38 = r2 + 1
            r1[r2] = r46     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            r2 = r38
        L_0x0c51:
            int r0 = r0 + 1
            goto L_0x0c3f
        L_0x0c54:
            int[] r47 = java.util.Arrays.copyOf(r1, r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            int r46 = r8 + -1
            r1 = 0
        L_0x0c5b:
            if (r46 < 0) goto L_0x0c6f
            r38 = r15[r46]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            int r38 = r38 + r48
            if (r38 <= 0) goto L_0x0c6c
            boolean r0 = r3[r46]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            if (r0 == 0) goto L_0x0c6c
            int r0 = r1 + 1
            r14[r1] = r38     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            r1 = r0
        L_0x0c6c:
            int r46 = r46 + -1
            goto L_0x0c5b
        L_0x0c6f:
            if (r48 <= 0) goto L_0x0c7a
            boolean r0 = r3[r13]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            if (r0 == 0) goto L_0x0c7a
            int r0 = r1 + 1
            r14[r1] = r48     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            r1 = r0
        L_0x0c7a:
            r0 = 0
        L_0x0c7b:
            if (r0 >= r6) goto L_0x0c91
            r15 = r12[r0]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            int r15 = r15 + r48
            if (r15 <= 0) goto L_0x0c8e
            int r13 = r8 + r0
            boolean r13 = r3[r13]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            if (r13 == 0) goto L_0x0c8e
            int r13 = r1 + 1
            r14[r1] = r15     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            r1 = r13
        L_0x0c8e:
            int r0 = r0 + 1
            goto L_0x0c7b
        L_0x0c91:
            int[] r12 = java.util.Arrays.copyOf(r14, r1)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            r15 = r47
            r8 = r2
            r6 = r1
            goto L_0x0cc8
        L_0x0c9a:
            int r8 = X.C26034Cqu.A00(r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            int r6 = X.C26034Cqu.A00(r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            int[] r15 = new int[r8]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            r0 = 0
        L_0x0ca5:
            if (r0 >= r8) goto L_0x0cb5
            int r1 = X.C26034Cqu.A00(r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            int r1 = r1 + 1
            r15[r0] = r1     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            r10.A04()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            int r0 = r0 + 1
            goto L_0x0ca5
        L_0x0cb5:
            int[] r12 = new int[r6]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            r0 = 0
        L_0x0cb8:
            if (r0 >= r6) goto L_0x0cc8
            int r1 = X.C26034Cqu.A00(r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            int r1 = r1 + 1
            r12[r0] = r1     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            r10.A04()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            int r0 = r0 + 1
            goto L_0x0cb8
        L_0x0cc8:
            int r49 = r49 + 1
            goto L_0x0bdd
        L_0x0ccc:
            boolean r0 = r10.A06()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            if (r0 == 0) goto L_0x0ce3
            r1 = 0
        L_0x0cd3:
            int r0 = X.C26034Cqu.A00(r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            if (r1 >= r0) goto L_0x0ce3
            int r0 = r51 + 4
            int r0 = r0 + 1
            r10.A05(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            int r1 = r1 + 1
            goto L_0x0cd3
        L_0x0ce3:
            r0 = 2
            r10.A05(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            boolean r0 = r10.A06()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            r8 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L_0x0d49
            boolean r0 = r10.A06()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            if (r0 == 0) goto L_0x0d19
            r0 = 8
            int r2 = r10.A03(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            r0 = 255(0xff, float:3.57E-43)
            if (r2 != r0) goto L_0x0d11
            r0 = 16
            int r1 = r10.A03(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            int r0 = r10.A03(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            if (r1 == 0) goto L_0x0d19
            if (r0 == 0) goto L_0x0d19
            float r8 = (float) r1     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            float r0 = (float) r0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            float r8 = r8 / r0
            goto L_0x0d19
        L_0x0d11:
            float[] r1 = X.C24727CHp.A03     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            r0 = 17
            if (r2 >= r0) goto L_0x0d5e
            r8 = r1[r2]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
        L_0x0d19:
            boolean r0 = r10.A06()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            if (r0 == 0) goto L_0x0d22
            r10.A04()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
        L_0x0d22:
            boolean r0 = r10.A06()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            if (r0 == 0) goto L_0x0d37
            r0 = 4
            r10.A05(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            boolean r0 = r10.A06()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            if (r0 == 0) goto L_0x0d37
            r0 = 24
            r10.A05(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
        L_0x0d37:
            boolean r0 = r10.A06()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            if (r0 == 0) goto L_0x0d43
            X.C26034Cqu.A00(r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            X.C26034Cqu.A00(r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
        L_0x0d43:
            r10.A04()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            r10.A04()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
        L_0x0d49:
            r10 = 33
            r0 = 5
            java.lang.Object[] r6 = new java.lang.Object[r0]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            java.lang.String[] r0 = X.C24696CGi.A01     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            r1 = r0[r57]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            r3 = 0
            r0 = r55
            X.BE8.A1A(r1, r6, r3, r0, r9)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            r0 = r54
            X.BE8.A1M(r6, r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            goto L_0x0d6e
        L_0x0d5e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            java.lang.String r0 = "Unexpected aspect_ratio_idc value: "
            java.lang.String r1 = X.AnonymousClass001.A1I(r0, r1, r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            java.lang.String r0 = "NalUnitUtil"
            android.util.Log.w(r0, r1)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            goto L_0x0d19
        L_0x0d6e:
            r0 = 76
            if (r56 == 0) goto L_0x0d74
            r0 = 72
        L_0x0d74:
            java.lang.Character r12 = java.lang.Character.valueOf(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            r2 = 3
            r1 = 4
            r0 = r52
            X.BE8.A1A(r12, r6, r2, r0, r1)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            java.lang.String r1 = "hvc1.%s%d.%X.%c%d"
            java.util.Locale r0 = java.util.Locale.US     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            java.lang.String r0 = java.lang.String.format(r0, r1, r6)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            java.lang.StringBuilder r12 = X.BE6.A0u(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            r6 = 6
        L_0x0d8c:
            int r0 = r6 + -1
            r0 = r53[r0]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            if (r0 != 0) goto L_0x0d97
            int r6 = r6 + -1
            if (r6 <= 0) goto L_0x0dad
            goto L_0x0d8c
        L_0x0d97:
            r2 = 0
        L_0x0d98:
            java.lang.Object[] r1 = new java.lang.Object[r9]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            r0 = r53[r2]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            X.C17880vN.A1T(r1, r0, r3)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            java.lang.String r0 = ".%02X"
            java.lang.String r0 = java.lang.String.format(r0, r1)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            r12.append(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            int r2 = r2 + 1
            if (r2 >= r6) goto L_0x0dad
            goto L_0x0d98
        L_0x0dad:
            java.lang.String r3 = r12.toString()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
        L_0x0db1:
            int r11 = r11 + r58
            r0 = r58
            r5.A0J(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            int r59 = r59 + 1
            goto L_0x0a82
        L_0x0dbc:
            int r61 = r61 + 1
            goto L_0x0a70
        L_0x0dc0:
            if (r62 != 0) goto L_0x0dc7
            java.util.List r2 = java.util.Collections.emptyList()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            goto L_0x0dcb
        L_0x0dc7:
            java.util.List r2 = java.util.Collections.singletonList(r66)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
        L_0x0dcb:
            int r1 = r64 + 1
            X.CRB r0 = new X.CRB     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            r0.<init>(r3, r2, r8, r1)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x113a }
            java.util.List r1 = r0.A03
            r48 = r1
            int r1 = r0.A01
            r38 = r1
            if (r23 != 0) goto L_0x0de0
            float r1 = r0.A00
            r27 = r1
        L_0x0de0:
            java.lang.String r0 = r0.A02
            r49 = r0
            java.lang.String r11 = "video/hevc"
            goto L_0x1090
        L_0x0de8:
            r0 = 1685480259(0x64766343, float:1.8180206E22)
            if (r1 == r0) goto L_0x1034
            r0 = 1685485123(0x64767643, float:1.8185683E22)
            if (r1 == r0) goto L_0x1034
            r0 = 1987076931(0x76706343, float:1.21891066E33)
            r3 = 2
            if (r1 != r0) goto L_0x0e60
            boolean r1 = X.AnonymousClass000.A1X(r11)
            r0 = r33
            X.C84.A00(r1, r0)
            r0 = 1987063864(0x76703038, float:1.21789965E33)
            if (r7 != r0) goto L_0x0e5d
            java.lang.String r11 = "video/x-vnd.on2.vp8"
        L_0x0e08:
            int r0 = r2 + 12
            r5.A0I(r0)
            int r0 = X.C26207Cui.A01(r5, r3)
            r0 = r0 & 1
            boolean r6 = X.AnonymousClass000.A1O(r0)
            int r1 = r5.A04()
            int r2 = r5.A04()
            r19 = 1
            r0 = r19
            if (r1 == r0) goto L_0x0e39
            r0 = 9
            r3 = 6
            if (r1 == r0) goto L_0x0e5a
            r0 = 4
            if (r1 == r0) goto L_0x0e37
            r0 = 5
            if (r1 == r0) goto L_0x0e37
            if (r1 == r3) goto L_0x0e37
            r0 = 7
            r19 = -1
            if (r1 != r0) goto L_0x0e39
        L_0x0e37:
            r19 = 2
        L_0x0e39:
            r18 = 2
            if (r6 == 0) goto L_0x0e3f
            r18 = 1
        L_0x0e3f:
            r0 = 1
            if (r2 == r0) goto L_0x0e56
            r0 = 16
            r1 = 6
            r17 = 6
            if (r2 == r0) goto L_0x1090
            r0 = 18
            r17 = 7
            if (r2 == r0) goto L_0x1090
            if (r2 == r1) goto L_0x0e56
            r0 = 7
            r17 = -1
            if (r2 != r0) goto L_0x1090
        L_0x0e56:
            r17 = 3
            goto L_0x1090
        L_0x0e5a:
            r19 = 6
            goto L_0x0e39
        L_0x0e5d:
            java.lang.String r11 = "video/x-vnd.on2.vp9"
            goto L_0x0e08
        L_0x0e60:
            r0 = 1635135811(0x61763143, float:2.8384055E20)
            if (r1 != r0) goto L_0x0e72
            boolean r1 = X.AnonymousClass000.A1X(r11)
            r0 = r33
            X.C84.A00(r1, r0)
            java.lang.String r11 = "video/av01"
            goto L_0x1090
        L_0x0e72:
            r0 = 1668050025(0x636c6c69, float:4.3612434E21)
            if (r1 != r0) goto L_0x0e9c
            if (r20 != 0) goto L_0x0e85
            r0 = 25
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r0)
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r20 = r1.order(r0)
        L_0x0e85:
            r0 = 21
            r1 = r20
            r1.position(r0)
            short r0 = r5.A0F()
            r1.putShort(r0)
            short r0 = r5.A0F()
            r1.putShort(r0)
            goto L_0x1090
        L_0x0e9c:
            r0 = 1835295606(0x6d646376, float:4.4176764E27)
            if (r1 != r0) goto L_0x0f0e
            if (r20 != 0) goto L_0x0eaf
            r0 = 25
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r0)
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r20 = r1.order(r0)
        L_0x0eaf:
            short r14 = r5.A0F()
            short r47 = r5.A0F()
            short r46 = r5.A0F()
            short r15 = r5.A0F()
            short r13 = r5.A0F()
            short r12 = r5.A0F()
            short r10 = r5.A0F()
            short r9 = r5.A0F()
            long r2 = r5.A09()
            long r0 = r5.A09()
            r8 = 1
            r6 = r20
            r6.position(r8)
            r6.putShort(r13)
            r6.putShort(r12)
            r6.putShort(r14)
            r8 = r6
            r6 = r47
            r8.putShort(r6)
            r6 = r46
            r8.putShort(r6)
            r8.putShort(r15)
            r8.putShort(r10)
            r8.putShort(r9)
            r8 = 10000(0x2710, double:4.9407E-320)
            long r2 = r2 / r8
            int r6 = (int) r2
            short r3 = (short) r6
            r2 = r20
            r2.putShort(r3)
            long r0 = r0 / r8
            int r2 = (int) r0
            short r0 = (short) r2
            r1 = r20
            r1.putShort(r0)
            goto L_0x1090
        L_0x0f0e:
            r0 = 1681012275(0x64323633, float:1.3149704E22)
            if (r1 != r0) goto L_0x0f20
            boolean r1 = X.AnonymousClass000.A1X(r11)
            r0 = r33
            X.C84.A00(r1, r0)
            r11 = r35
            goto L_0x1090
        L_0x0f20:
            r0 = 1702061171(0x65736473, float:7.183675E22)
            if (r1 != r0) goto L_0x0f40
            boolean r1 = X.AnonymousClass000.A1X(r11)
            r0 = r33
            X.C84.A00(r1, r0)
            X.CR4 r29 = A02(r5, r2)
            r0 = r29
            java.lang.String r11 = r0.A02
            byte[] r0 = r0.A03
            if (r0 == 0) goto L_0x1090
            X.1IX r48 = X.AnonymousClass1IX.of(r0)
            goto L_0x1090
        L_0x0f40:
            r0 = 1885434736(0x70617370, float:2.7909473E29)
            if (r1 != r0) goto L_0x0f5c
            int r0 = r2 + 8
            r5.A0I(r0)
            int r0 = r5.A05()
            int r1 = r5.A05()
            float r0 = (float) r0
            r27 = r0
            float r0 = (float) r1
            float r27 = r27 / r0
            r23 = 1
            goto L_0x1090
        L_0x0f5c:
            r0 = 1937126244(0x73763364, float:1.9506033E31)
            if (r1 != r0) goto L_0x0f85
            int r6 = r2 + 8
        L_0x0f63:
            int r1 = r6 - r2
            r0 = r22
            if (r1 >= r0) goto L_0x0f81
            int r3 = X.C26207Cui.A02(r5, r6)
            int r1 = r5.A03()
            r0 = 1886547818(0x70726f6a, float:3.0012025E29)
            if (r1 != r0) goto L_0x0f7f
            byte[] r0 = r5.A02
            int r3 = r3 + r6
            byte[] r26 = java.util.Arrays.copyOfRange(r0, r6, r3)
            goto L_0x1090
        L_0x0f7f:
            int r6 = r6 + r3
            goto L_0x0f63
        L_0x0f81:
            r26 = 0
            goto L_0x1090
        L_0x0f85:
            r0 = 1936995172(0x73743364, float:1.9347576E31)
            if (r1 != r0) goto L_0x0fb1
            int r0 = r5.A04()
            r2 = 3
            r5.A0J(r2)
            if (r0 != 0) goto L_0x1090
            int r1 = r5.A04()
            if (r1 == 0) goto L_0x0fad
            r0 = 1
            if (r1 == r0) goto L_0x0fa9
            if (r1 == r3) goto L_0x0fa5
            if (r1 != r2) goto L_0x1090
            r21 = 3
            goto L_0x1090
        L_0x0fa5:
            r21 = 2
            goto L_0x1090
        L_0x0fa9:
            r21 = 1
            goto L_0x1090
        L_0x0fad:
            r21 = 0
            goto L_0x1090
        L_0x0fb1:
            r0 = 1668246642(0x636f6c72, float:4.4165861E21)
            if (r1 != r0) goto L_0x1090
            int r2 = r5.A03()
            r0 = 1852009592(0x6e636c78, float:1.7596057E28)
            if (r2 == r0) goto L_0x0fdc
            r0 = 1852009571(0x6e636c63, float:1.7596032E28)
            if (r2 == r0) goto L_0x0fdc
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Unsupported color type: "
            r1.append(r0)
            java.lang.String r0 = X.C25973Cpg.A00(r2)
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)
            java.lang.String r0 = "AtomParsers"
            android.util.Log.w(r0, r1)
            goto L_0x1090
        L_0x0fdc:
            int r0 = r5.A06()
            int r2 = r5.A06()
            r5.A0J(r3)
            r1 = 19
            r3 = r22
            if (r3 != r1) goto L_0x0ff6
            int r1 = r5.A04()
            r1 = r1 & 128(0x80, float:1.794E-43)
            r6 = 1
            if (r1 != 0) goto L_0x0ff7
        L_0x0ff6:
            r6 = 0
        L_0x0ff7:
            r19 = 1
            r1 = r19
            if (r0 == r1) goto L_0x1011
            r1 = 9
            r3 = 6
            if (r0 == r1) goto L_0x1031
            r1 = 4
            if (r0 == r1) goto L_0x100f
            r1 = 5
            if (r0 == r1) goto L_0x100f
            if (r0 == r3) goto L_0x100f
            r1 = 7
            r19 = -1
            if (r0 != r1) goto L_0x1011
        L_0x100f:
            r19 = 2
        L_0x1011:
            r18 = 2
            if (r6 == 0) goto L_0x1017
            r18 = 1
        L_0x1017:
            r0 = 1
            if (r2 == r0) goto L_0x102e
            r0 = 16
            r1 = 6
            r17 = 6
            if (r2 == r0) goto L_0x1090
            r0 = 18
            r17 = 7
            if (r2 == r0) goto L_0x1090
            if (r2 == r1) goto L_0x102e
            r0 = 7
            r17 = -1
            if (r2 != r0) goto L_0x1090
        L_0x102e:
            r17 = 3
            goto L_0x1090
        L_0x1031:
            r19 = 6
            goto L_0x1011
        L_0x1034:
            r0 = 2
            int r0 = X.C26207Cui.A01(r5, r0)
            int r3 = r0 >> 1
            r6 = r0 & 1
            r2 = 5
            int r6 = r6 << r2
            int r0 = r5.A04()
            int r0 = r0 >> 3
            r1 = r0 & 31
            r1 = r1 | r6
            r0 = 4
            if (r3 == r0) goto L_0x1079
            if (r3 == r2) goto L_0x1079
            r0 = 7
            if (r3 == r0) goto L_0x1079
            r0 = 8
            if (r3 != r0) goto L_0x1072
            java.lang.String r0 = "hev1"
        L_0x1056:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A11(r0)
            java.lang.String r0 = ".0"
            r2.append(r0)
            r2.append(r3)
            java.lang.String r1 = X.AnonymousClass001.A1I(r0, r2, r1)
            X.CJ7 r0 = new X.CJ7
            r0.<init>(r1)
            java.lang.String r0 = r0.A00
            r49 = r0
            java.lang.String r11 = "video/dolby-vision"
            goto L_0x1090
        L_0x1072:
            r0 = 9
            if (r3 != r0) goto L_0x1090
            java.lang.String r0 = "avc3"
            goto L_0x1056
        L_0x1079:
            java.lang.String r0 = "dvhe"
            goto L_0x1056
        L_0x107c:
            java.util.List r1 = r0.A03
            r48 = r1
            int r1 = r0.A01
            r38 = r1
            if (r23 != 0) goto L_0x108a
            float r1 = r0.A00
            r27 = r1
        L_0x108a:
            java.lang.String r0 = r0.A02
            r49 = r0
            java.lang.String r11 = "video/avc"
        L_0x1090:
            int r28 = r28 + r22
            goto L_0x07b5
        L_0x1094:
            r0 = 1211250227(0x48323633, float:182488.8)
            r11 = 0
            if (r7 != r0) goto L_0x079f
            r11 = r35
            goto L_0x079f
        L_0x109e:
            java.lang.Object r0 = r3.second
            X.CSG r0 = (X.CSG) r0
            java.lang.String r1 = r0.A02
            java.lang.String r0 = r2.A02
            boolean r0 = com.facebook.android.exoplayer2.util.Util.A0D(r0, r1)
            if (r0 != 0) goto L_0x078d
            X.D3w[] r2 = r2.A03
            X.DUU r32 = new X.DUU
            r0 = r32
            r0.<init>(r1, r2)
            goto L_0x078d
        L_0x10b7:
            if (r4 != r2) goto L_0x009e
            if (r7 != r3) goto L_0x009e
            if (r8 != 0) goto L_0x009e
            r30 = 270(0x10e, float:3.78E-43)
            goto L_0x009e
        L_0x10c1:
            if (r5 != r2) goto L_0x009e
            if (r4 != 0) goto L_0x009e
            if (r7 != 0) goto L_0x009e
            if (r8 != r2) goto L_0x009e
            r30 = 180(0xb4, float:2.52E-43)
            goto L_0x009e
        L_0x10cd:
            long r11 = r10.A0A()
            goto L_0x0073
        L_0x10d3:
            int r4 = r4 + 1
            goto L_0x005d
        L_0x10d7:
            r10.A0J(r9)
            goto L_0x007a
        L_0x10dc:
            r0 = 1986618469(0x76696465, float:1.1834389E33)
            if (r1 != r0) goto L_0x10e5
            r25 = 2
            goto L_0x0027
        L_0x10e5:
            r0 = 1952807028(0x74657874, float:7.272211E31)
            if (r1 == r0) goto L_0x1104
            r0 = 1935832172(0x7362746c, float:1.7941596E31)
            if (r1 == r0) goto L_0x1104
            r0 = 1937072756(0x73756274, float:1.944137E31)
            if (r1 == r0) goto L_0x1104
            r0 = 1668047728(0x636c6370, float:4.3605968E21)
            if (r1 == r0) goto L_0x1104
            r0 = 1835365473(0x6d657461, float:4.4382975E27)
            r25 = -1
            if (r1 != r0) goto L_0x0027
            r25 = 5
            goto L_0x0027
        L_0x1104:
            r25 = 3
            goto L_0x0027
        L_0x1108:
            java.lang.IllegalStateException r3 = X.BE6.A0k()
            throw r3
        L_0x110d:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r1 = "Invalid sample rate for Dolby TrueHD MLP stream: "
            r0 = r19
            java.lang.String r2 = X.AnonymousClass001.A1I(r1, r2, r0)
            r1 = 1
            X.BxS r3 = new X.BxS
            r0 = r33
            r3.<init>(r2, r0, r1)
            throw r3
        L_0x1122:
            r3 = 1
            X.BxS r2 = new X.BxS
            r1 = r33
            r2.<init>(r1, r1, r3)
            throw r2
        L_0x112b:
            java.lang.IllegalStateException r0 = X.BE6.A0k()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1130 }
            throw r0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1130 }
        L_0x1130:
            r3 = move-exception
            java.lang.String r2 = "Error parsing AVC config"
            r1 = 1
            X.BxS r0 = new X.BxS
            r0.<init>(r2, r3, r1)
            throw r0
        L_0x113a:
            r3 = move-exception
            java.lang.String r2 = "Error parsing HEVC config"
            r1 = 1
            X.BxS r0 = new X.BxS
            r0.<init>(r2, r3, r1)
            throw r0
        L_0x1144:
            r1 = 1701082227(0x65647473, float:6.742798E22)
            r0 = r67
            X.BOi r1 = r0.A00(r1)
            if (r1 == 0) goto L_0x11c9
            r0 = 1701606260(0x656c7374, float:6.9788014E22)
            X.BOh r0 = r1.A01(r0)
            if (r0 == 0) goto L_0x11c9
            X.Cui r9 = r0.A00
            int r8 = X.C26207Cui.A00(r9)
            int r7 = r9.A05()
            long[] r6 = new long[r7]
            long[] r5 = new long[r7]
            r3 = 0
        L_0x1167:
            if (r3 >= r7) goto L_0x1199
            r2 = 1
            if (r8 != r2) goto L_0x118d
            long r0 = r9.A0A()
        L_0x1170:
            r6[r3] = r0
            if (r8 != r2) goto L_0x1187
            long r0 = r9.A08()
        L_0x1178:
            r5[r3] = r0
            short r0 = r9.A0F()
            if (r0 != r2) goto L_0x1192
            r0 = 2
            r9.A0J(r0)
            int r3 = r3 + 1
            goto L_0x1167
        L_0x1187:
            int r0 = r9.A03()
            long r0 = (long) r0
            goto L_0x1178
        L_0x118d:
            long r0 = r9.A09()
            goto L_0x1170
        L_0x1192:
            java.lang.String r0 = "Unsupported media rate."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x1199:
            android.util.Pair r0 = android.util.Pair.create(r6, r5)
            if (r0 == 0) goto L_0x11c9
            java.lang.Object r1 = r0.first
            long[] r1 = (long[]) r1
            java.lang.Object r0 = r0.second
            long[] r0 = (long[]) r0
        L_0x11a7:
            if (r4 == 0) goto L_0x11c8
            r2 = r44
            java.lang.Object r2 = r2.first
            long r67 = X.C17880vN.A05(r2)
            X.CU2 r33 = new X.CU2
            r58 = r33
            r59 = r4
            r60 = r1
            r61 = r0
            r62 = r34
            r63 = r45
            r64 = r25
            r66 = r38
            r69 = r42
            r58.<init>(r59, r60, r61, r62, r63, r64, r65, r66, r67, r69, r71)
        L_0x11c8:
            return r33
        L_0x11c9:
            r1 = r33
            r0 = r1
            goto L_0x11a7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26169Ctl.A03(X.DUU, X.BOi, X.BOh, long, boolean):X.CU2");
    }
}
