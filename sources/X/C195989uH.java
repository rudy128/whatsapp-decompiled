package X;

import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.9uH  reason: invalid class name and case insensitive filesystem */
public final class C195989uH {
    public final C193379pz A00;
    public final C193379pz A01;
    public final C24288Byl A02;
    public final List A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C195989uH) {
                C195989uH r5 = (C195989uH) obj;
                if (!C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00) || this.A02 != r5.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0N(this.A02, AnonymousClass000.A0N(this.A00, AnonymousClass000.A0N(this.A01, AnonymousClass000.A0L(this.A03)))) * 31 * 31 * 31;
    }

    public /* synthetic */ C195989uH(C193379pz r1, C193379pz r2, C24288Byl byl, List list) {
        this.A03 = list;
        this.A01 = r1;
        this.A00 = r2;
        this.A02 = byl;
    }

    public final JSONObject A00() {
        JSONObject A15 = C17880vN.A15();
        A15.put("manifest_capabilities", new JSONArray(this.A03));
        C193379pz r3 = this.A01;
        JSONObject A152 = C17880vN.A15();
        A152.put("min_version", r3.A01);
        A152.put("max_version", r3.A00);
        A15.put("supported_sdk_versions", A152);
        C193379pz r32 = this.A00;
        JSONObject A153 = C17880vN.A15();
        A153.put("min_version", r32.A01);
        A153.put("max_version", r32.A00);
        A15.put("supported_beta_sdk_versions", A153);
        A15.put("texture_compression", this.A02.name());
        return A15;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ArEffectDeviceCapabilities(manifestCapabilities=");
        A10.append(this.A03);
        A10.append(", supportedSdkVersions=");
        A10.append(this.A01);
        A10.append(", supportedBetaSdkVersions=");
        A10.append(this.A00);
        A10.append(", textureCompression=");
        A10.append(this.A02);
        C108975cc.A17(A10, ", areCapabilityListId=");
        AnonymousClass000.A1G(A10, ", excludedCapabilities=");
        AnonymousClass000.A1G(A10, ", modelsMaxSupportedVersions=");
        A10.append(", supportedTextureFormats=");
        return AnonymousClass001.A1F((Object) null, A10);
    }
}
