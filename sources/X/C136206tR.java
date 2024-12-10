package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.6tR  reason: invalid class name and case insensitive filesystem */
public final class C136206tR {
    public final int A00;
    public final String A01;
    public final ArrayList A02;
    public final int A03;
    public final String A04;
    public final String A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C136206tR) {
                C136206tR r5 = (C136206tR) obj;
                if (!C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A04, r5.A04) || this.A00 != r5.A00 || this.A03 != r5.A03 || !C18070vi.A18(this.A05, r5.A05) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((((AnonymousClass000.A0L(this.A02) + C17900vP.A00(this.A04)) * 31) + this.A00) * 31) + this.A03) * 31) + C17900vP.A00(this.A05)) * 31) + C108955ca.A06(this.A01);
    }

    public C136206tR(String str, String str2, String str3, ArrayList arrayList, int i, int i2) {
        this.A02 = arrayList;
        this.A04 = str;
        this.A00 = i;
        this.A03 = i2;
        this.A05 = str2;
        this.A01 = str3;
    }

    public String toString() {
        Locale locale = Locale.getDefault();
        Object[] objArr = new Object[6];
        objArr[0] = this.A02;
        objArr[1] = this.A04;
        AnonymousClass3Ma.A1S(objArr, this.A00);
        C17890vO.A1G(objArr, this.A03);
        objArr[4] = this.A05;
        objArr[5] = this.A01;
        return C108955ca.A12(locale, "MLModelMetadataGraphqlResponse: models=%s entryPoint=%s assetCount=%d modelCount=%d status=%s statusDetails=%s", Arrays.copyOf(objArr, 6));
    }
}
