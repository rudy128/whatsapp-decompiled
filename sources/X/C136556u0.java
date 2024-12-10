package X;

import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.6u0  reason: invalid class name and case insensitive filesystem */
public final class C136556u0 {
    public final String A00;
    public final String A01;
    public final String A02;
    public final int A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C136556u0) {
                C136556u0 r5 = (C136556u0) obj;
                if (!C18070vi.A18(this.A09, r5.A09) || !C18070vi.A18(this.A08, r5.A08) || !C18070vi.A18(this.A05, r5.A05) || !C18070vi.A18(this.A0A, r5.A0A) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A04, r5.A04) || !C18070vi.A18(this.A07, r5.A07) || !C18070vi.A18(this.A02, r5.A02) || this.A03 != r5.A03 || !C18070vi.A18(this.A06, r5.A06) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A022 = C17890vO.A02(this.A07, C17890vO.A02(this.A04, C17890vO.A02(this.A01, C17890vO.A02(this.A0A, C17890vO.A02(this.A05, C17890vO.A02(this.A08, C17880vN.A03(this.A09)))))));
        return C108945cZ.A09(this.A00, C17890vO.A02(this.A06, (C17890vO.A02(this.A02, A022) + this.A03) * 31));
    }

    public C136556u0(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i) {
        this.A09 = str;
        this.A08 = str2;
        this.A05 = str3;
        this.A0A = str4;
        this.A01 = str5;
        this.A04 = str6;
        this.A07 = str7;
        this.A02 = str8;
        this.A03 = i;
        this.A06 = str9;
        this.A00 = str10;
    }

    public String toString() {
        return C108955ca.A12(Locale.getDefault(), "ModelAsset: name=%s id=%s cacheKey=%s sourceContentHash=%s md5Hash=%s assetHandle=%s creationTime=%s url=%s fileSizeBytes=%s compressionType=%s assetType=%s", Arrays.copyOf(new Object[]{this.A09, this.A08, this.A05, this.A0A, this.A01, this.A04, this.A07, this.A02, Integer.valueOf(this.A03), this.A06, this.A00}, 11));
    }
}
