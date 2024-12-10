package X;

/* renamed from: X.708  reason: invalid class name */
public final class AnonymousClass708 {
    public static final C138776xf A07 = new Object();
    public final int A00;
    public final int A01;
    public final C122716Rq A02;
    public final Integer A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public AnonymousClass708(C122716Rq r2, Integer num, String str, String str2, String str3, int i, int i2) {
        C18070vi.A0d(r2, 7);
        this.A06 = str;
        this.A01 = i;
        this.A04 = str2;
        this.A00 = i2;
        this.A05 = str3;
        this.A03 = num;
        this.A02 = r2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass708) {
                AnonymousClass708 r5 = (AnonymousClass708) obj;
                if (!(C18070vi.A18(this.A06, r5.A06) && this.A01 == r5.A01 && C18070vi.A18(this.A04, r5.A04) && this.A00 == r5.A00 && C18070vi.A18(this.A05, r5.A05) && this.A03 == r5.A03 && this.A02 == r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final A6Y A00() {
        C192939pH r3 = new C192939pH();
        r3.A00.put("ML_MODEL_WORKER_MODEL_FEATURE_NAME", this.A02.toString());
        return r3.A00();
    }

    public int hashCode() {
        String str;
        String str2 = this.A04;
        int A022 = C17890vO.A02(this.A05, (C17890vO.A02(str2, (C17880vN.A03(this.A06) + this.A01) * 31) + this.A00) * 31);
        int intValue = this.A03.intValue();
        if (intValue != 0) {
            str = "BROTLI";
        } else {
            str = "NONE";
        }
        return AnonymousClass000.A0O(this.A02, (A022 + str.hashCode() + intValue) * 31);
    }

    public String toString() {
        String str;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MLModelV2(name=");
        A10.append(this.A06);
        A10.append(", version=");
        A10.append(this.A01);
        A10.append(", hash=");
        A10.append(this.A04);
        A10.append(", uncompressedFileSizeInBytes=");
        A10.append(this.A00);
        A10.append(", modelExtension=");
        A10.append(this.A05);
        A10.append(", compressionType=");
        if (this.A03.intValue() != 0) {
            str = "TAR_BROTLI";
        } else {
            str = "NONE";
        }
        A10.append(str);
        A10.append(", feature=");
        return AnonymousClass001.A1F(this.A02, A10);
    }
}
