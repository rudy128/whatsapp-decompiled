package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.CbX  reason: case insensitive filesystem */
public final class C25236CbX {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final List A06;
    public final Map A07;
    public final Map A08;
    public final Map A09;
    public final Map A0A;
    public final Boolean A0B;
    public final boolean A0C;
    public final boolean A0D;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25236CbX) {
                C25236CbX cbX = (C25236CbX) obj;
                if (!C18070vi.A18(this.A03, cbX.A03) || !C18070vi.A18(this.A00, cbX.A00) || !C18070vi.A18(this.A01, cbX.A01) || !C18070vi.A18(this.A02, cbX.A02) || this.A0D != cbX.A0D || !C18070vi.A18(this.A04, cbX.A04) || !C18070vi.A18(this.A05, cbX.A05) || this.A0C != cbX.A0C || !C18070vi.A18(this.A07, cbX.A07) || !C18070vi.A18(this.A0B, cbX.A0B) || !C18070vi.A18(this.A09, cbX.A09) || !C18070vi.A18(this.A0A, cbX.A0A) || !C18070vi.A18(this.A08, cbX.A08) || !C18070vi.A18(this.A06, cbX.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A002 = AnonymousClass0DV.A00((((AnonymousClass0DV.A00((C17890vO.A02(this.A01, C17890vO.A02(this.A00, C17880vN.A03(this.A03))) + C17900vP.A00(this.A02)) * 31, this.A0D) + C17900vP.A00(this.A04)) * 31) + C17900vP.A00(this.A05)) * 31, this.A0C);
        return AnonymousClass000.A0O(this.A06, (((((((AnonymousClass000.A0N(this.A07, A002) + AnonymousClass001.A0k(this.A0B)) * 31) + AnonymousClass001.A0k(this.A09)) * 31) + AnonymousClass001.A0k(this.A0A)) * 31) + C17880vN.A02(this.A08)) * 31);
    }

    public C25236CbX(Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, List list, Map map, Map map2, Map map3, Map map4, boolean z, boolean z2) {
        this.A03 = str;
        this.A00 = str2;
        this.A01 = str3;
        this.A02 = str4;
        this.A0D = z;
        this.A04 = str5;
        this.A05 = str6;
        this.A0C = z2;
        this.A07 = map;
        this.A0B = bool;
        this.A09 = map2;
        this.A0A = map3;
        this.A08 = map4;
        this.A06 = list;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AvatarLiveEditingPrefetchBridgeParams(revisionId=");
        A10.append(this.A03);
        A10.append(", cdlProfileName=");
        A10.append(this.A00);
        A10.append(", deliverySpecId=");
        A10.append(this.A01);
        A10.append(", effectId=");
        A10.append(this.A02);
        A10.append(", useAle=");
        A10.append(this.A0D);
        A10.append(", surfaceType=");
        A10.append(this.A04);
        A10.append(", trigger=");
        A10.append(this.A05);
        A10.append(", allowCdlCreation=");
        A10.append(this.A0C);
        A10.append(", currentConfig=");
        A10.append(this.A07);
        A10.append(", shouldRenderUsingLegacyAsset=");
        A10.append(this.A0B);
        A10.append(", experimentsConfig=");
        A10.append(this.A09);
        A10.append(", serializedNetworkConfig=");
        A10.append(this.A0A);
        A10.append(", dynamicMemoryHandlingInfo=");
        A10.append(this.A08);
        A10.append(", assetMetadata=");
        return AnonymousClass001.A1F(this.A06, A10);
    }
}
