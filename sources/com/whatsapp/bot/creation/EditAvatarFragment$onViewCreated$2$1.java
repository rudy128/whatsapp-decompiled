package com.whatsapp.bot.creation;

import X.A7K;
import X.AIj;
import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.C100214u9;
import X.C18070vi;
import X.C18600wl;
import X.C20125A8k;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import X.C83564Fp;
import X.C89394cO;
import X.C99934th;
import android.text.Editable;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.whatsapp.WaEditText;
import com.whatsapp.bot.creation.service.AiCreationService;
import com.whatsapp.bot.creation.service.AiCreationService$generatePersonaImage$response$1;
import com.whatsapp.bot.creation.viewmodel.AiCreationViewModel;
import com.whatsapp.infra.graphql.generated.aihome.GenerateImageCandidateMutationImpl$Builder;
import com.whatsapp.infra.graphql.generated.aihome.GenerateImageCandidateMutationResponseImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.bot.creation.EditAvatarFragment$onViewCreated$2$1", f = "EditAvatarFragment.kt", i = {}, l = {76}, m = "invokeSuspend", n = {}, s = {})
public final class EditAvatarFragment$onViewCreated$2$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ EditAvatarFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditAvatarFragment$onViewCreated$2$1(EditAvatarFragment editAvatarFragment, C30391dr r3) {
        super(2, r3);
        this.this$0 = editAvatarFragment;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new EditAvatarFragment$onViewCreated$2$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new EditAvatarFragment$onViewCreated$2$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        Editable editable;
        C31751g4 r8 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            EditAvatarFragment editAvatarFragment = this.this$0;
            String str2 = editAvatarFragment.A08;
            if (!(str2 == null || (str = editAvatarFragment.A09) == null)) {
                WaEditText waEditText = editAvatarFragment.A02;
                if (waEditText != null) {
                    editable = waEditText.getText();
                } else {
                    editable = null;
                }
                String valueOf = String.valueOf(editable);
                C18070vi.A0d(valueOf, 2);
                AiCreationViewModel aiCreationViewModel = (AiCreationViewModel) this.this$0.A0B.getValue();
                this.label = 1;
                C100214u9 r1 = new C100214u9(aiCreationViewModel, this);
                obj = r1.result;
                int i2 = r1.label;
                if (i2 == 0) {
                    C30691eM.A01(obj);
                    AiCreationService aiCreationService = aiCreationViewModel.A01;
                    r1.L$0 = aiCreationViewModel;
                    r1.label = 1;
                    C99934th r4 = new C99934th(aiCreationService, r1);
                    Object obj2 = r4.result;
                    int i3 = r4.label;
                    obj = null;
                    if (i3 == 0) {
                        C30691eM.A01(obj2);
                        if (aiCreationService.A00.A02()) {
                            GenerateImageCandidateMutationImpl$Builder generateImageCandidateMutationImpl$Builder = new GenerateImageCandidateMutationImpl$Builder();
                            GraphQlCallInput graphQlCallInput = new GraphQlCallInput();
                            graphQlCallInput.A05("persona_id", str2);
                            graphQlCallInput.A05("image_prompt", valueOf);
                            graphQlCallInput.A05("persona_version_id", str);
                            A7K a7k = generateImageCandidateMutationImpl$Builder.A00;
                            a7k.A04(graphQlCallInput, "input");
                            AIj aIj = new AIj(a7k, GenerateImageCandidateMutationResponseImpl.class, "GenerateImageCandidateMutation");
                            C18600wl r12 = aiCreationService.A01;
                            AiCreationService$generatePersonaImage$response$1 aiCreationService$generatePersonaImage$response$1 = new AiCreationService$generatePersonaImage$response$1(aIj, aiCreationService, (C30391dr) null);
                            r4.label = 1;
                            obj2 = C30451dy.A00(r4, r12, aiCreationService$generatePersonaImage$response$1);
                            if (obj2 == r8) {
                                return r8;
                            }
                        }
                    } else if (i3 == 1) {
                        C30691eM.A01(obj2);
                    } else {
                        throw AnonymousClass000.A0l();
                    }
                    GenerateImageCandidateMutationResponseImpl.XfbGenaiPersonaImageCandidateGeneration xfbGenaiPersonaImageCandidateGeneration = (GenerateImageCandidateMutationResponseImpl.XfbGenaiPersonaImageCandidateGeneration) ((C20125A8k) obj2).A09(GenerateImageCandidateMutationResponseImpl.XfbGenaiPersonaImageCandidateGeneration.class, "xfb_genai_persona_image_candidate_generation");
                    if (xfbGenaiPersonaImageCandidateGeneration != null && (obj = C83564Fp.A00(xfbGenaiPersonaImageCandidateGeneration)) == r8) {
                        return r8;
                    }
                } else if (i2 == 1) {
                    aiCreationViewModel = (AiCreationViewModel) r1.L$0;
                    C30691eM.A01(obj);
                } else {
                    throw AnonymousClass000.A0l();
                }
                aiCreationViewModel.A00.A04("generated_image", obj);
                if (obj == r8) {
                    return r8;
                }
            }
            return C27621Wu.A00;
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        C89394cO r122 = (C89394cO) obj;
        if (r122 != null) {
            EditAvatarFragment editAvatarFragment2 = this.this$0;
            String str3 = r122.A01;
            editAvatarFragment2.A06 = str3;
            editAvatarFragment2.A05 = r122.A00;
            String str4 = r122.A02;
            editAvatarFragment2.A07 = str4;
            WaEditText waEditText2 = editAvatarFragment2.A02;
            if (waEditText2 != null) {
                waEditText2.setText(str3);
            }
            AnonymousClass3MX.A1Q(new EditAvatarFragment$loadPhoto$1(editAvatarFragment2, str4, (C30391dr) null), AnonymousClass3MZ.A0G(editAvatarFragment2));
        }
        return C27621Wu.A00;
    }
}
