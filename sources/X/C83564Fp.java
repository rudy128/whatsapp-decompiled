package X;

import com.whatsapp.infra.graphql.generated.aihome.GenerateImageCandidateMutationResponseImpl;

/* renamed from: X.4Fp  reason: invalid class name and case insensitive filesystem */
public abstract class C83564Fp {
    public static final C89394cO A00(GenerateImageCandidateMutationResponseImpl.XfbGenaiPersonaImageCandidateGeneration xfbGenaiPersonaImageCandidateGeneration) {
        String A0F = xfbGenaiPersonaImageCandidateGeneration.A0F("temporary_image_id");
        String str = "";
        if (A0F == null) {
            A0F = str;
        }
        String A0F2 = xfbGenaiPersonaImageCandidateGeneration.A0F("temporary_image_cdn_url");
        if (A0F2 == null) {
            A0F2 = str;
        }
        String A0F3 = xfbGenaiPersonaImageCandidateGeneration.A0F("temporary_image_prompt");
        if (A0F3 != null) {
            str = A0F3;
        }
        return new C89394cO(A0F, A0F2, str);
    }
}
