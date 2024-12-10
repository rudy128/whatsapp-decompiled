package X;

import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.6u1  reason: invalid class name and case insensitive filesystem */
public final class C136566u1 {
    public final int A00;
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

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C136566u1) {
                C136566u1 r5 = (C136566u1) obj;
                if (!C18070vi.A18(this.A08, r5.A08) || !C18070vi.A18(this.A06, r5.A06) || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A09, r5.A09) || !C18070vi.A18(this.A07, r5.A07) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A05, r5.A05) || !C18070vi.A18(this.A0A, r5.A0A) || this.A00 != r5.A00 || !C18070vi.A18(this.A04, r5.A04) || !C18070vi.A18(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((((((((((((((C17900vP.A00(this.A08) * 31) + C17900vP.A00(this.A06)) * 31) + C17900vP.A00(this.A03)) * 31) + C17900vP.A00(this.A09)) * 31) + C17900vP.A00(this.A07)) * 31) + C17900vP.A00(this.A01)) * 31) + C17900vP.A00(this.A05)) * 31) + C17900vP.A00(this.A0A)) * 31) + this.A00) * 31) + C17900vP.A00(this.A04)) * 31) + C108955ca.A06(this.A02);
    }

    public C136566u1(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i) {
        this.A08 = str;
        this.A06 = str2;
        this.A03 = str3;
        this.A09 = str4;
        this.A07 = str5;
        this.A01 = str6;
        this.A05 = str7;
        this.A0A = str8;
        this.A00 = i;
        this.A04 = str9;
        this.A02 = str10;
    }

    public String toString() {
        return C108955ca.A12(Locale.getDefault(), "ModelAsset: name=%s id=%s cacheKey=%s sourceContentHash=%s md5Hash=%s assetHandle=%s creationTime=%s url=%s fileSizeBytes=%s compressionType=%s assetType=%s", Arrays.copyOf(new Object[]{this.A08, this.A06, this.A03, this.A09, this.A07, this.A01, this.A05, this.A0A, Integer.valueOf(this.A00), this.A04, this.A02}, 11));
    }
}
