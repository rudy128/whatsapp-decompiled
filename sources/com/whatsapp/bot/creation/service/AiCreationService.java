package com.whatsapp.bot.creation.service;

import X.AnonymousClass1PY;
import X.C18070vi;
import X.C18600wl;

public final class AiCreationService {
    public final AnonymousClass1PY A00;
    public final C18600wl A01;

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C89394cO A00(X.C30391dr r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C99934th
            if (r0 == 0) goto L_0x0044
            r4 = r6
            X.4th r4 = (X.C99934th) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0044
            int r2 = r2 - r1
            r4.label = r2
        L_0x0012:
            java.lang.Object r3 = r4.result
            int r1 = r4.label
            r0 = 1
            r2 = 0
            if (r1 == 0) goto L_0x0032
            if (r1 != r0) goto L_0x004a
            X.C30691eM.A01(r3)
            X.A8k r3 = (X.C20125A8k) r3
            java.lang.String r1 = "xfb_genai_persona_image_candidate_generation"
            java.lang.Class<com.whatsapp.infra.graphql.generated.aihome.GenerateImageCandidateMutationResponseImpl$XfbGenaiPersonaImageCandidateGeneration> r0 = com.whatsapp.infra.graphql.generated.aihome.GenerateImageCandidateMutationResponseImpl.XfbGenaiPersonaImageCandidateGeneration.class
            X.A8k r0 = r3.A09(r0, r1)
            com.whatsapp.infra.graphql.generated.aihome.GenerateImageCandidateMutationResponseImpl$XfbGenaiPersonaImageCandidateGeneration r0 = (com.whatsapp.infra.graphql.generated.aihome.GenerateImageCandidateMutationResponseImpl.XfbGenaiPersonaImageCandidateGeneration) r0
            if (r0 == 0) goto L_0x0031
            X.4cO r2 = X.C83564Fp.A00(r0)
        L_0x0031:
            return r2
        L_0x0032:
            X.C30691eM.A01(r3)
            X.1PY r0 = r5.A00
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = "getFbid"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x0044:
            X.4th r4 = new X.4th
            r4.<init>(r5, r6)
            goto L_0x0012
        L_0x004a:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.bot.creation.service.AiCreationService.A00(X.1dr):X.4cO");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.AnonymousClass4V7 r10, X.C30391dr r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof X.C99914tf
            if (r0 == 0) goto L_0x00b0
            r5 = r11
            X.4tf r5 = (X.C99914tf) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00b0
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r2 = r5.result
            X.1g4 r6 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r5.label
            r4 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0038
            if (r0 != r4) goto L_0x00b7
            X.C30691eM.A01(r2)
        L_0x0021:
            X.A8k r2 = (X.C20125A8k) r2
            java.lang.String r1 = "xfb_kirby_mobile_complete_quick_create_genai_persona"
            java.lang.Class<com.whatsapp.infra.graphql.generated.aihome.QuickCompleteMutationResponseImpl$XfbKirbyMobileCompleteQuickCreateGenaiPersona> r0 = com.whatsapp.infra.graphql.generated.aihome.QuickCompleteMutationResponseImpl.XfbKirbyMobileCompleteQuickCreateGenaiPersona.class
            X.A8k r0 = r2.A09(r0, r1)
            if (r0 == 0) goto L_0x0037
            org.json.JSONObject r0 = r0.A00
            X.C18070vi.A0W(r0)
            com.whatsapp.infra.graphql.generated.aihome.AiHomeBotImpl r3 = new com.whatsapp.infra.graphql.generated.aihome.AiHomeBotImpl
            r3.<init>(r0)
        L_0x0037:
            return r3
        L_0x0038:
            X.C30691eM.A01(r2)
            X.1PY r0 = r9.A00
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x0037
            java.lang.String r1 = r10.A01
            java.lang.String r8 = r10.A05
            X.A7K r7 = new X.A7K
            r7.<init>()
            com.whatsapp.infra.graphql.generated.aihome.calls.XFBKirbyMobileCompleteQuickCreateGenaiPersonaData r2 = new com.whatsapp.infra.graphql.generated.aihome.calls.XFBKirbyMobileCompleteQuickCreateGenaiPersonaData
            r2.<init>()
            java.lang.String r0 = "persona_id"
            r2.A05(r0, r1)
            java.lang.String r1 = r10.A03
            java.lang.String r0 = "persona_version_id"
            r2.A05(r0, r1)
            java.lang.String r1 = r10.A02
            java.lang.String r0 = "name"
            r2.A05(r0, r1)
            java.lang.String r1 = r10.A00
            java.lang.String r0 = "description"
            r2.A05(r0, r1)
            java.lang.String r1 = r10.A04
            java.lang.String r0 = "tagline"
            r2.A05(r0, r1)
            java.lang.String r1 = "ONLY_ME"
            java.lang.String r0 = "audience"
            r2.A05(r0, r1)
            X.0wS r1 = X.C18460wS.A00
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            java.lang.String r0 = "discoverable_apps"
            r2.A06(r0, r1)
            if (r8 == 0) goto L_0x008b
            java.lang.String r0 = "updated_image_id"
            r2.A05(r0, r8)
        L_0x008b:
            java.lang.String r1 = r10.A06
            java.lang.String r0 = "updated_image_prompt"
            r2.A05(r0, r1)
            java.lang.String r0 = "input"
            r7.A04(r2, r0)
            java.lang.Class<com.whatsapp.infra.graphql.generated.aihome.QuickCompleteMutationResponseImpl> r1 = com.whatsapp.infra.graphql.generated.aihome.QuickCompleteMutationResponseImpl.class
            java.lang.String r0 = "QuickCompleteMutation"
            X.AIj r2 = new X.AIj
            r2.<init>(r7, r1, r0)
            X.0wl r1 = r9.A01
            com.whatsapp.bot.creation.service.AiCreationService$completeQuickPersonaCreation$response$1 r0 = new com.whatsapp.bot.creation.service.AiCreationService$completeQuickPersonaCreation$response$1
            r0.<init>(r2, r9, r3)
            r5.label = r4
            java.lang.Object r2 = X.C30451dy.A00(r5, r1, r0)
            if (r2 != r6) goto L_0x0021
            return r6
        L_0x00b0:
            X.4tf r5 = new X.4tf
            r5.<init>(r9, r11)
            goto L_0x0012
        L_0x00b7:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.bot.creation.service.AiCreationService.A01(X.4V7, X.1dr):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00db, code lost:
        if (r9 != null) goto L_0x00df;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(java.lang.String r19, X.C30391dr r20) {
        /*
            r18 = this;
            r3 = r20
            boolean r0 = r3 instanceof X.C99924tg
            r6 = r18
            if (r0 == 0) goto L_0x012f
            r5 = r3
            X.4tg r5 = (X.C99924tg) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x012f
            int r2 = r2 - r1
            r5.label = r2
        L_0x0016:
            java.lang.Object r2 = r5.result
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r5.label
            r8 = 0
            r3 = 1
            if (r0 == 0) goto L_0x00e5
            if (r0 != r3) goto L_0x0136
            X.C30691eM.A01(r2)
        L_0x0025:
            X.A8k r2 = (X.C20125A8k) r2
            java.lang.String r1 = "xfb_kirby_mobile_quick_create_genai_persona"
            java.lang.Class<com.whatsapp.infra.graphql.generated.aihome.WAAIStudioQuickCreateAIMutationResponseImpl$XfbKirbyMobileQuickCreateGenaiPersona> r0 = com.whatsapp.infra.graphql.generated.aihome.WAAIStudioQuickCreateAIMutationResponseImpl.XfbKirbyMobileQuickCreateGenaiPersona.class
            X.A8k r3 = r2.A09(r0, r1)
            if (r3 == 0) goto L_0x00e4
            java.lang.String r1 = "id"
            java.lang.String r10 = r3.A0F(r1)
            java.lang.String r5 = ""
            if (r10 != 0) goto L_0x003c
            r10 = r5
        L_0x003c:
            java.lang.String r4 = "persona_version_for_viewer"
            java.lang.Class<com.whatsapp.infra.graphql.generated.aihome.WAAIStudioQuickCreateAIMutationResponseImpl$XfbKirbyMobileQuickCreateGenaiPersona$PersonaVersionForViewer> r2 = com.whatsapp.infra.graphql.generated.aihome.WAAIStudioQuickCreateAIMutationResponseImpl.XfbKirbyMobileQuickCreateGenaiPersona.PersonaVersionForViewer.class
            X.A8k r0 = r3.A09(r2, r4)
            if (r0 == 0) goto L_0x004c
            java.lang.String r11 = r0.A0F(r1)
            if (r11 != 0) goto L_0x004d
        L_0x004c:
            r11 = r5
        L_0x004d:
            X.A8k r1 = r3.A09(r2, r4)
            if (r1 == 0) goto L_0x005b
            java.lang.String r0 = "description"
            java.lang.String r12 = r1.A0F(r0)
            if (r12 != 0) goto L_0x005c
        L_0x005b:
            r12 = r5
        L_0x005c:
            X.A8k r1 = r3.A09(r2, r4)
            if (r1 == 0) goto L_0x006a
            java.lang.String r0 = "tagline"
            java.lang.String r13 = r1.A0F(r0)
            if (r13 != 0) goto L_0x006b
        L_0x006a:
            r13 = r5
        L_0x006b:
            X.A8k r1 = r3.A09(r2, r4)
            if (r1 == 0) goto L_0x0079
            java.lang.String r0 = "name"
            java.lang.String r14 = r1.A0F(r0)
            if (r14 != 0) goto L_0x007a
        L_0x0079:
            r14 = r5
        L_0x007a:
            X.A8k r1 = r3.A09(r2, r4)
            if (r1 == 0) goto L_0x0088
            java.lang.String r0 = "image_prompt"
            java.lang.String r15 = r1.A0F(r0)
            if (r15 != 0) goto L_0x0089
        L_0x0088:
            r15 = r5
        L_0x0089:
            X.A8k r1 = r3.A09(r2, r4)
            r16 = 0
            if (r1 == 0) goto L_0x0097
            java.lang.String r0 = "profile_image_id"
            java.lang.String r16 = r1.A0F(r0)
        L_0x0097:
            X.A8k r1 = r3.A09(r2, r4)
            if (r1 == 0) goto L_0x00a5
            java.lang.String r0 = "profile_image_url_for_whatsapp"
            java.lang.String r17 = r1.A0F(r0)
            if (r17 != 0) goto L_0x00b5
        L_0x00a5:
            X.A8k r1 = r3.A09(r2, r4)
            if (r1 == 0) goto L_0x00b3
            java.lang.String r0 = "temporary_profile_image_uri"
            java.lang.String r17 = r1.A0F(r0)
            if (r17 != 0) goto L_0x00b5
        L_0x00b3:
            r17 = r5
        L_0x00b5:
            X.A8k r1 = r3.A09(r2, r4)
            if (r1 == 0) goto L_0x00dd
            java.lang.String r0 = "__typename"
            org.json.JSONObject r3 = r1.A00
            java.lang.String r0 = r3.optString(r0)
            int r1 = r0.hashCode()
            r0 = -250981214(0xfffffffff10a54a2, float:-6.8497994E29)
            if (r1 != r0) goto L_0x00dd
            com.whatsapp.infra.graphql.generated.aihome.WAAIStudioAudienceInfoImpl r2 = new com.whatsapp.infra.graphql.generated.aihome.WAAIStudioAudienceInfoImpl
            r2.<init>(r3)
            com.whatsapp.infra.graphql.generated.aihome.enums.GraphQLXFBGenAIPersonaAudience r1 = com.whatsapp.infra.graphql.generated.aihome.enums.GraphQLXFBGenAIPersonaAudience.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "displayed_audience_selection"
            java.lang.Enum r9 = r2.A0E(r1, r0)
            com.whatsapp.infra.graphql.generated.aihome.enums.GraphQLXFBGenAIPersonaAudience r9 = (com.whatsapp.infra.graphql.generated.aihome.enums.GraphQLXFBGenAIPersonaAudience) r9
            if (r9 != 0) goto L_0x00df
        L_0x00dd:
            com.whatsapp.infra.graphql.generated.aihome.enums.GraphQLXFBGenAIPersonaAudience r9 = com.whatsapp.infra.graphql.generated.aihome.enums.GraphQLXFBGenAIPersonaAudience.ONLY_ME
        L_0x00df:
            X.4cW r8 = new X.4cW
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17)
        L_0x00e4:
            return r8
        L_0x00e5:
            X.C30691eM.A01(r2)
            X.1PY r0 = r6.A00
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x00e4
            X.A7K r7 = new X.A7K
            r7.<init>()
            X.9ju r1 = com.facebook.graphql.calls.GraphQlCallInput.A02
            java.lang.String r0 = "description"
            X.8Kx r2 = r1.A00()
            r1 = r19
            X.C162478Kx.A01(r2, r1, r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            java.lang.String r0 = "force_generate_image_synchronously"
            X.C162478Kx.A01(r2, r1, r0)
            java.lang.String r1 = "input"
            X.29S r0 = r7.A00
            X.8Kx r0 = r0.A02()
            r0.A06(r2, r1)
            java.lang.Class<com.whatsapp.infra.graphql.generated.aihome.WAAIStudioQuickCreateAIMutationResponseImpl> r1 = com.whatsapp.infra.graphql.generated.aihome.WAAIStudioQuickCreateAIMutationResponseImpl.class
            java.lang.String r0 = "WAAIStudioQuickCreateAIMutation"
            X.AIj r2 = new X.AIj
            r2.<init>(r7, r1, r0)
            X.0wl r1 = r6.A01
            com.whatsapp.bot.creation.service.AiCreationService$createGenAiPersona$response$1 r0 = new com.whatsapp.bot.creation.service.AiCreationService$createGenAiPersona$response$1
            r0.<init>(r2, r6, r8)
            r5.label = r3
            java.lang.Object r2 = X.C30451dy.A00(r5, r1, r0)
            if (r2 != r4) goto L_0x0025
            return r4
        L_0x012f:
            X.4tg r5 = new X.4tg
            r5.<init>(r6, r3)
            goto L_0x0016
        L_0x0136:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.bot.creation.service.AiCreationService.A02(java.lang.String, X.1dr):java.lang.Object");
    }

    public AiCreationService(AnonymousClass1PY r1, C18600wl r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
