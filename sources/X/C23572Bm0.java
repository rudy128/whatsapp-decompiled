package X;

/* renamed from: X.Bm0  reason: case insensitive filesystem */
public final class C23572Bm0 extends C24686CFk {
    public final long A00;
    public final long A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof C24686CFk)) {
                return false;
            }
            String str = this.A04;
            C23572Bm0 bm0 = (C23572Bm0) ((C24686CFk) obj);
            String str2 = bm0.A04;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            if (!this.A02.equals(bm0.A02)) {
                return false;
            }
            String str3 = this.A03;
            String str4 = bm0.A03;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (!str3.equals(str4)) {
                return false;
            }
            String str5 = this.A06;
            String str6 = bm0.A06;
            if (str5 == null) {
                if (str6 != null) {
                    return false;
                }
            } else if (!str5.equals(str6)) {
                return false;
            }
            if (this.A00 != bm0.A00 || this.A01 != bm0.A01) {
                return false;
            }
            String str7 = this.A05;
            String str8 = bm0.A05;
            return str7 == null ? str8 == null : str7.equals(str8);
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.CXF, java.lang.Object] */
    public CXF A01() {
        ? obj = new Object();
        obj.A04 = this.A04;
        obj.A00 = this.A02;
        obj.A03 = this.A03;
        obj.A06 = this.A06;
        obj.A01 = Long.valueOf(this.A00);
        obj.A02 = Long.valueOf(this.A01);
        obj.A05 = this.A05;
        return obj;
    }

    public C23572Bm0(Integer num, String str, String str2, String str3, String str4, long j, long j2) {
        this.A04 = str;
        this.A02 = num;
        this.A03 = str2;
        this.A06 = str3;
        this.A00 = j;
        this.A01 = j2;
        this.A05 = str4;
    }

    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "NOT_GENERATED";
            case 2:
                return "UNREGISTERED";
            case 3:
                return "REGISTERED";
            case 4:
                return "REGISTER_ERROR";
            default:
                return "ATTEMPT_MIGRATION";
        }
    }

    public int hashCode() {
        Integer num = this.A02;
        long j = this.A00;
        long j2 = this.A01;
        return ((((((((((((1000003 ^ C17900vP.A00(this.A04)) * 1000003) ^ C72453Mb.A0E(num, A00(num))) * 1000003) ^ C17900vP.A00(this.A03)) * 1000003) ^ C17900vP.A00(this.A06)) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ C108955ca.A06(this.A05);
    }

    public String toString() {
        String str;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PersistedInstallationEntry{firebaseInstallationId=");
        A10.append(this.A04);
        A10.append(", registrationStatus=");
        Integer num = this.A02;
        if (num != null) {
            str = A00(num);
        } else {
            str = "null";
        }
        A10.append(str);
        A10.append(", authToken=");
        A10.append(this.A03);
        A10.append(", refreshToken=");
        A10.append(this.A06);
        A10.append(", expiresInSecs=");
        A10.append(this.A00);
        A10.append(", tokenCreationEpochInSecs=");
        A10.append(this.A01);
        A10.append(", fisError=");
        return BEA.A0n(this.A05, A10);
    }
}
