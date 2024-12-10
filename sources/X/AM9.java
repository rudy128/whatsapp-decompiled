package X;

import com.facebook.cameracore.ardelivery.model.ARRequestAsset$CompressionMethod;
import java.util.List;

public final class AM9 implements C108735cD {
    public final int A00;
    public final int A01;
    public final ARRequestAsset$CompressionMethod A02;
    public final C89304cF A03;
    public final C89304cF A04;
    public final C75593hm A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final List A0B;
    public final List A0C;
    public final boolean A0D;
    public final boolean A0E;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AM9) {
                AM9 am9 = (AM9) obj;
                if (!C18070vi.A18(this.A03, am9.A03) || !C18070vi.A18(this.A05, am9.A05) || !C18070vi.A18(this.A04, am9.A04) || !C18070vi.A18(this.A06, am9.A06) || !C18070vi.A18(this.A0A, am9.A0A) || !C18070vi.A18(this.A08, am9.A08) || !C18070vi.A18(this.A09, am9.A09) || this.A00 != am9.A00 || this.A01 != am9.A01 || this.A02 != am9.A02 || !C18070vi.A18(this.A0B, am9.A0B) || !C18070vi.A18(this.A07, am9.A07) || this.A0E != am9.A0E || !C18070vi.A18(this.A0C, am9.A0C)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A022 = C17890vO.A02(this.A08, C17890vO.A02(this.A0A, C17890vO.A02(this.A06, AnonymousClass000.A0N(this.A04, AnonymousClass000.A0N(this.A05, AnonymousClass000.A0L(this.A03))))));
        return AnonymousClass000.A0O(this.A0C, AnonymousClass0DV.A00(C17890vO.A02(this.A07, AnonymousClass000.A0N(this.A0B, AnonymousClass000.A0N(this.A02, (((C17890vO.A02(this.A09, A022) + this.A00) * 31) + this.A01) * 31))), this.A0E));
    }

    public AM9(ARRequestAsset$CompressionMethod aRRequestAsset$CompressionMethod, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, List list2, int i, int i2, boolean z) {
        C18070vi.A0w(str, str2, str3, str4, str5);
        C18070vi.A0l(str6, str7);
        C108975cc.A10(aRRequestAsset$CompressionMethod, 10, str8);
        C89304cF r2 = new C89304cF(str);
        C75593hm r1 = new C75593hm(str3);
        C89304cF r0 = new C89304cF(str2);
        this.A03 = r2;
        this.A05 = r1;
        this.A04 = r0;
        this.A06 = str4;
        this.A0A = str5;
        this.A08 = str6;
        this.A09 = str7;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = aRRequestAsset$CompressionMethod;
        this.A0B = list;
        this.A07 = str8;
        boolean z2 = z;
        this.A0E = z2;
        this.A0C = list2;
        this.A0D = z2;
    }

    public C89304cF BSi() {
        return this.A03;
    }

    public C89304cF BT7() {
        return this.A04;
    }

    public /* bridge */ /* synthetic */ Float BUT() {
        return null;
    }

    public /* bridge */ /* synthetic */ AnonymousClass4E5 BVB() {
        return this.A05;
    }

    public boolean BYG() {
        return this.A0D;
    }

    public boolean Be7() {
        return true;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ArEngineEffectMetadata(id=");
        A10.append(this.A03);
        A10.append(", name=");
        A10.append(this.A05);
        A10.append(", instanceId=");
        A10.append(this.A04);
        A10.append(", cacheKey=");
        A10.append(this.A06);
        A10.append(", uri=");
        A10.append(this.A0A);
        A10.append(", md5Hash=");
        A10.append(this.A08);
        A10.append(", requiredSdkVersion=");
        A10.append(this.A09);
        A10.append(", fileSizeBytes=");
        A10.append(this.A00);
        A10.append(", uncompressedFileSizeBytes=");
        A10.append(this.A01);
        A10.append(", compressionMethod=");
        A10.append(this.A02);
        A10.append(", arCapabilityMinVersionModelings=");
        A10.append(this.A0B);
        A10.append(", manifestJson=");
        A10.append(this.A07);
        A10.append(", usesFlmCapability=");
        A10.append(this.A0E);
        A10.append(", effectInstructions=");
        return AnonymousClass001.A1F(this.A0C, A10);
    }
}
