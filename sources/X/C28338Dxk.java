package X;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

/* renamed from: X.Dxk  reason: case insensitive filesystem */
public class C28338Dxk extends AnonymousClass1Bz {
    public byte[] A00;

    private SimpleDateFormat A05() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(A0M() ? "yyyyMMddHHmmss.SSSz" : A0O() ? "yyyyMMddHHmmssz" : A0N() ? "yyyyMMddHHmmz" : "yyyyMMddHHz");
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        return simpleDateFormat;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r2 = r1[r4];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean A07(int r4) {
        /*
            r3 = this;
            byte[] r1 = r3.A00
            int r0 = r1.length
            if (r0 <= r4) goto L_0x0010
            byte r2 = r1[r4]
            r0 = 48
            if (r2 < r0) goto L_0x0010
            r1 = 57
            r0 = 1
            if (r2 <= r1) goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28338Dxk.A07(int):boolean");
    }

    public boolean A0H() {
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Date A0L() {
        /*
            r5 = this;
            byte[] r0 = r5.A00
            java.lang.String r2 = X.AnonymousClass1Bo.A02(r0)
            java.lang.String r4 = "Z"
            boolean r0 = r2.endsWith(r4)
            r3 = 0
            if (r0 == 0) goto L_0x004c
            boolean r0 = r5.A0M()
            if (r0 == 0) goto L_0x0037
            java.lang.String r0 = "yyyyMMddHHmmss.SSS'Z'"
        L_0x0017:
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            r1.<init>(r0)
        L_0x001c:
            java.util.SimpleTimeZone r0 = new java.util.SimpleTimeZone
            r0.<init>(r3, r4)
            r1.setTimeZone(r0)
        L_0x0024:
            boolean r0 = r5.A0M()
            if (r0 == 0) goto L_0x002e
            java.lang.String r2 = A04(r2)
        L_0x002e:
            java.util.Date r0 = r1.parse(r2)
            java.util.Date r0 = X.C25454Cg6.A00(r0)
            return r0
        L_0x0037:
            boolean r0 = r5.A0O()
            if (r0 == 0) goto L_0x0040
            java.lang.String r0 = "yyyyMMddHHmmss'Z'"
            goto L_0x0017
        L_0x0040:
            boolean r0 = r5.A0N()
            if (r0 == 0) goto L_0x0049
            java.lang.String r0 = "yyyyMMddHHmm'Z'"
            goto L_0x0017
        L_0x0049:
            java.lang.String r0 = "yyyyMMddHH'Z'"
            goto L_0x0017
        L_0x004c:
            r0 = 45
            int r0 = r2.indexOf(r0)
            if (r0 > 0) goto L_0x0087
            r0 = 43
            int r0 = r2.indexOf(r0)
            if (r0 > 0) goto L_0x0087
            boolean r0 = r5.A0M()
            if (r0 == 0) goto L_0x0072
            java.lang.String r0 = "yyyyMMddHHmmss.SSS"
        L_0x0064:
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            r1.<init>(r0)
            java.util.TimeZone r0 = java.util.TimeZone.getDefault()
            java.lang.String r4 = r0.getID()
            goto L_0x001c
        L_0x0072:
            boolean r0 = r5.A0O()
            if (r0 == 0) goto L_0x007b
            java.lang.String r0 = "yyyyMMddHHmmss"
            goto L_0x0064
        L_0x007b:
            boolean r0 = r5.A0N()
            if (r0 == 0) goto L_0x0084
            java.lang.String r0 = "yyyyMMddHHmm"
            goto L_0x0064
        L_0x0084:
            java.lang.String r0 = "yyyyMMddHH"
            goto L_0x0064
        L_0x0087:
            java.lang.String r2 = r5.A0K()
            java.text.SimpleDateFormat r1 = r5.A05()
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28338Dxk.A0L():java.util.Date");
    }

    public boolean A0M() {
        int i = 0;
        while (true) {
            byte[] bArr = this.A00;
            if (i == bArr.length) {
                return false;
            }
            if (bArr[i] == 46 && i == 14) {
                return true;
            }
            i++;
        }
    }

    public boolean A0N() {
        return A07(10) && A07(11);
    }

    public boolean A0O() {
        return A07(12) && A07(13);
    }

    public int hashCode() {
        return AnonymousClass1C2.A00(this.A00);
    }

    public static String A03(int i) {
        if (i < 10) {
            return AnonymousClass001.A1I("0", AnonymousClass000.A10(), i);
        }
        return Integer.toString(i);
    }

    public static String A04(String str) {
        StringBuilder A0t;
        String str2;
        String substring = str.substring(14);
        int i = 1;
        while (i < substring.length() && '0' <= (r1 = substring.charAt(i)) && r1 <= '9') {
            i++;
        }
        int i2 = i - 1;
        if (i2 > 3) {
            A0t = AnonymousClass000.A10();
            str2 = substring.substring(0, 4);
        } else if (i2 == 1) {
            A0t = BE9.A0t(i, substring);
            str2 = "00";
        } else if (i2 != 2) {
            return str;
        } else {
            A0t = BE9.A0t(i, substring);
            str2 = "0";
        }
        A0t.append(str2);
        return AnonymousClass001.A1H(str.substring(0, 14), AnonymousClass000.A0y(substring.substring(i), A0t), AnonymousClass000.A10());
    }

    public static C28338Dxk A06(Object obj) {
        if (obj == null || (obj instanceof C28338Dxk)) {
            return (C28338Dxk) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return (C28338Dxk) AnonymousClass1Bz.A01((byte[]) obj);
            } catch (Exception e) {
                throw AnonymousClass000.A0k(BEA.A0j(e, "encoding error in getInstance: ", AnonymousClass000.A10()));
            }
        } else {
            throw BEB.A0T(obj, "illegal object in getInstance: ", AnonymousClass000.A10());
        }
    }

    public int A0D() {
        byte[] bArr;
        if (this instanceof C28272Dwg) {
            bArr = C28272Dwg.A02((C28272Dwg) this);
        } else {
            bArr = this.A00;
        }
        int length = bArr.length;
        return C26084Cs1.A00(length) + 1 + length;
    }

    public AnonymousClass1Bz A0E() {
        return new C28338Dxk(this.A00);
    }

    public AnonymousClass1Bz A0F() {
        return new C28338Dxk(this.A00);
    }

    public void A0G(C26039Cr0 cr0, boolean z) {
        int i;
        byte[] bArr;
        if (this instanceof C28272Dwg) {
            i = 24;
            bArr = C28272Dwg.A02((C28272Dwg) this);
        } else {
            i = 24;
            bArr = this.A00;
        }
        cr0.A06(bArr, i, z);
    }

    public boolean A0I(AnonymousClass1Bz r3) {
        if (!(r3 instanceof C28338Dxk)) {
            return false;
        }
        return Arrays.equals(this.A00, ((C28338Dxk) r3).A00);
    }

    public String A0K() {
        StringBuilder sb;
        String str;
        StringBuilder A11;
        String str2;
        String A0y;
        String A02 = AnonymousClass1Bo.A02(this.A00);
        int length = A02.length();
        int i = length - 1;
        if (A02.charAt(i) == 'Z') {
            A11 = BE9.A0t(i, A02);
            A0y = "GMT+00:00";
        } else {
            int i2 = length - 6;
            char charAt = A02.charAt(i2);
            if ((charAt == '-' || charAt == '+') && A02.indexOf("GMT") == i2 - 3) {
                return A02;
            }
            int i3 = length - 5;
            char charAt2 = A02.charAt(i3);
            if (charAt2 == '-' || charAt2 == '+') {
                sb = BE9.A0t(i3, A02);
                sb.append("GMT");
                int i4 = i3 + 3;
                sb.append(A02.substring(i3, i4));
                sb.append(":");
                str = A02.substring(i4);
            } else {
                int i5 = length - 3;
                char charAt3 = A02.charAt(i5);
                if (charAt3 == '-' || charAt3 == '+') {
                    sb = BE9.A0t(i5, A02);
                    sb.append("GMT");
                    sb.append(A02.substring(i5));
                    str = ":00";
                } else {
                    A11 = AnonymousClass000.A11(A02);
                    TimeZone timeZone = TimeZone.getDefault();
                    int rawOffset = timeZone.getRawOffset();
                    if (rawOffset < 0) {
                        rawOffset = -rawOffset;
                        str2 = "-";
                    } else {
                        str2 = "+";
                    }
                    int i6 = rawOffset / 3600000;
                    int i7 = (rawOffset - (((i6 * 60) * 60) * 1000)) / 60000;
                    try {
                        if (timeZone.useDaylightTime()) {
                            if (A0M()) {
                                A02 = A04(A02);
                            }
                            SimpleDateFormat A05 = A05();
                            StringBuilder A0H = C17900vP.A0H(A02, "GMT", str2);
                            A0H.append(A03(i6));
                            A0H.append(":");
                            if (timeZone.inDaylightTime(A05.parse(AnonymousClass000.A0y(A03(i7), A0H)))) {
                                int i8 = -1;
                                if (str2.equals("+")) {
                                    i8 = 1;
                                }
                                i6 += i8;
                            }
                        }
                    } catch (ParseException unused) {
                    }
                    StringBuilder A0o = AnonymousClass8BW.A0o("GMT", str2);
                    A0o.append(A03(i6));
                    A0o.append(":");
                    A0y = AnonymousClass000.A0y(A03(i7), A0o);
                }
            }
            return AnonymousClass000.A0y(str, sb);
        }
        return AnonymousClass000.A0y(A0y, A11);
    }

    public C28338Dxk(byte[] bArr) {
        if (bArr.length >= 4) {
            this.A00 = bArr;
            if (!A07(0) || !A07(1) || !A07(2) || !A07(3)) {
                throw AnonymousClass000.A0k("illegal characters in GeneralizedTime string");
            }
            return;
        }
        throw AnonymousClass000.A0k("GeneralizedTime string too short");
    }

    public C28338Dxk(String str) {
        this.A00 = AnonymousClass1Bo.A03(str);
        try {
            A0L();
        } catch (ParseException e) {
            throw AnonymousClass000.A0k(C17900vP.A0C("invalid date string: ", AnonymousClass000.A10(), e));
        }
    }
}
