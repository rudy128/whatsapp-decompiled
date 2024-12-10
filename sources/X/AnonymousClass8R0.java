package X;

/* renamed from: X.8R0  reason: invalid class name */
public final class AnonymousClass8R0 extends C180969Oq {
    public final Integer A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;

    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof C180969Oq)) {
                return false;
            }
            Integer num = this.A00;
            AnonymousClass8R0 r4 = (AnonymousClass8R0) ((C180969Oq) obj);
            Integer num2 = r4.A00;
            if (num == null) {
                if (num2 != null) {
                    return false;
                }
            } else if (!num.equals(num2)) {
                return false;
            }
            String str = this.A09;
            String str2 = r4.A09;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            String str3 = this.A05;
            String str4 = r4.A05;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (!str3.equals(str4)) {
                return false;
            }
            String str5 = this.A03;
            String str6 = r4.A03;
            if (str5 == null) {
                if (str6 != null) {
                    return false;
                }
            } else if (!str5.equals(str6)) {
                return false;
            }
            String str7 = this.A0B;
            String str8 = r4.A0B;
            if (str7 == null) {
                if (str8 != null) {
                    return false;
                }
            } else if (!str7.equals(str8)) {
                return false;
            }
            String str9 = this.A0A;
            String str10 = r4.A0A;
            if (str9 == null) {
                if (str10 != null) {
                    return false;
                }
            } else if (!str9.equals(str10)) {
                return false;
            }
            String str11 = this.A07;
            String str12 = r4.A07;
            if (str11 == null) {
                if (str12 != null) {
                    return false;
                }
            } else if (!str11.equals(str12)) {
                return false;
            }
            String str13 = this.A04;
            String str14 = r4.A04;
            if (str13 == null) {
                if (str14 != null) {
                    return false;
                }
            } else if (!str13.equals(str14)) {
                return false;
            }
            String str15 = this.A06;
            String str16 = r4.A06;
            if (str15 == null) {
                if (str16 != null) {
                    return false;
                }
            } else if (!str15.equals(str16)) {
                return false;
            }
            String str17 = this.A02;
            String str18 = r4.A02;
            if (str17 == null) {
                if (str18 != null) {
                    return false;
                }
            } else if (!str17.equals(str18)) {
                return false;
            }
            String str19 = this.A08;
            String str20 = r4.A08;
            if (str19 == null) {
                if (str20 != null) {
                    return false;
                }
            } else if (!str19.equals(str20)) {
                return false;
            }
            String str21 = this.A01;
            String str22 = r4.A01;
            return str21 == null ? str22 == null : str21.equals(str22);
        }
    }

    public AnonymousClass8R0(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.A00 = num;
        this.A09 = str;
        this.A05 = str2;
        this.A03 = str3;
        this.A0B = str4;
        this.A0A = str5;
        this.A07 = str6;
        this.A04 = str7;
        this.A06 = str8;
        this.A02 = str9;
        this.A08 = str10;
        this.A01 = str11;
    }

    public int hashCode() {
        return ((((((((((((((((((((((1000003 ^ AnonymousClass001.A0k(this.A00)) * 1000003) ^ C17900vP.A00(this.A09)) * 1000003) ^ C17900vP.A00(this.A05)) * 1000003) ^ C17900vP.A00(this.A03)) * 1000003) ^ C17900vP.A00(this.A0B)) * 1000003) ^ C17900vP.A00(this.A0A)) * 1000003) ^ C17900vP.A00(this.A07)) * 1000003) ^ C17900vP.A00(this.A04)) * 1000003) ^ C17900vP.A00(this.A06)) * 1000003) ^ C17900vP.A00(this.A02)) * 1000003) ^ C17900vP.A00(this.A08)) * 1000003) ^ C108955ca.A06(this.A01);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AndroidClientInfo{sdkVersion=");
        A10.append(this.A00);
        A10.append(", model=");
        A10.append(this.A09);
        A10.append(", hardware=");
        A10.append(this.A05);
        A10.append(", device=");
        A10.append(this.A03);
        A10.append(", product=");
        A10.append(this.A0B);
        A10.append(", osBuild=");
        A10.append(this.A0A);
        A10.append(", manufacturer=");
        A10.append(this.A07);
        A10.append(", fingerprint=");
        A10.append(this.A04);
        A10.append(", locale=");
        A10.append(this.A06);
        A10.append(", country=");
        A10.append(this.A02);
        A10.append(", mccMnc=");
        A10.append(this.A08);
        A10.append(", applicationBuild=");
        A10.append(this.A01);
        return AnonymousClass000.A0y("}", A10);
    }
}
