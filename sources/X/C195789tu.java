package X;

import com.facebook.cameracore.ardelivery.model.ARRequestAsset$CompressionMethod;
import java.util.List;

/* renamed from: X.9tu  reason: invalid class name and case insensitive filesystem */
public final class C195789tu {
    public final int A00;
    public final ARRequestAsset$CompressionMethod A01;
    public final AnonymousClass9JJ A02;
    public final C194199rL A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final List A0B;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C195789tu) {
                C195789tu r5 = (C195789tu) obj;
                if (this.A02 != r5.A02 || !C18070vi.A18(this.A04, r5.A04) || !C18070vi.A18(this.A08, r5.A08) || !C18070vi.A18(this.A05, r5.A05) || !C18070vi.A18(this.A0A, r5.A0A) || !C18070vi.A18(this.A07, r5.A07) || !C18070vi.A18(this.A09, r5.A09) || !C18070vi.A18(this.A06, r5.A06) || this.A00 != r5.A00 || this.A01 != r5.A01 || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A0B, r5.A0B)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A022 = C17890vO.A02(this.A09, C17890vO.A02(this.A07, C17890vO.A02(this.A0A, C17890vO.A02(this.A05, C17890vO.A02(this.A08, C17890vO.A02(this.A04, AnonymousClass000.A0L(this.A02)))))));
        return AnonymousClass000.A0O(this.A0B, AnonymousClass000.A0N(this.A03, AnonymousClass000.A0N(this.A01, (C17890vO.A02(this.A06, A022) + this.A00) * 31)));
    }

    public C195789tu(ARRequestAsset$CompressionMethod aRRequestAsset$CompressionMethod, AnonymousClass9JJ r2, C194199rL r3, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, int i) {
        this.A02 = r2;
        this.A04 = str;
        this.A08 = str2;
        this.A05 = str3;
        this.A0A = str4;
        this.A07 = str5;
        this.A09 = str6;
        this.A06 = str7;
        this.A00 = i;
        this.A01 = aRRequestAsset$CompressionMethod;
        this.A03 = r3;
        this.A0B = list;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("NativeMLModelAssetMetadata(name=");
        A10.append(this.A02);
        A10.append(", id=");
        A10.append(this.A04);
        A10.append(", cacheKey=");
        A10.append(this.A08);
        A10.append(", sourceContentHash=");
        A10.append(this.A05);
        A10.append(", md5Hash=");
        A10.append(this.A0A);
        A10.append(", assetHandle=");
        A10.append(this.A07);
        A10.append(", creationTime=");
        A10.append(this.A09);
        A10.append(", url=");
        A10.append(this.A06);
        A10.append(", fileSizeBytes=");
        A10.append(this.A00);
        A10.append(", compressionMethod=");
        A10.append(this.A01);
        A10.append(", metadata=");
        A10.append(this.A03);
        A10.append(", deltaCache=");
        return AnonymousClass001.A1F(this.A0B, A10);
    }
}
