package com.whatsapp.bot.creation;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass3U6;
import X.C106665Ws;
import X.C23421Fz;
import X.C26067Crh;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C87924Xq;
import X.C89394cO;
import X.C89474cW;
import X.C93004iH;
import com.whatsapp.WaEditText;
import com.whatsapp.bot.creation.viewmodel.AiCreationViewModel;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.bot.creation.EditAvatarFragment$onViewCreated$3", f = "EditAvatarFragment.kt", i = {}, l = {96}, m = "invokeSuspend", n = {}, s = {})
public final class EditAvatarFragment$onViewCreated$3 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ EditAvatarFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditAvatarFragment$onViewCreated$3(EditAvatarFragment editAvatarFragment, C30391dr r3) {
        super(2, r3);
        this.this$0 = editAvatarFragment;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new EditAvatarFragment$onViewCreated$3(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new EditAvatarFragment$onViewCreated$3(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r3 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C89394cO r0 = (C89394cO) ((AiCreationViewModel) this.this$0.A0B.getValue()).A00.A02("generated_image");
            if (r0 != null) {
                EditAvatarFragment editAvatarFragment = this.this$0;
                String str = r0.A02;
                AnonymousClass3MX.A1Q(new EditAvatarFragment$loadPhoto$1(editAvatarFragment, str, (C30391dr) null), AnonymousClass3MZ.A0G(editAvatarFragment));
                return C27621Wu.A00;
            }
            C23421Fz A18 = AnonymousClass3MX.A18(((AiCreationViewModel) this.this$0.A0B.getValue()).A04);
            this.label = 1;
            obj = C26067Crh.A02(this, A18);
            if (obj == r3) {
                return r3;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        C106665Ws r6 = (C106665Ws) obj;
        if (r6 instanceof C93004iH) {
            EditAvatarFragment editAvatarFragment2 = this.this$0;
            C89474cW r2 = (C89474cW) ((C93004iH) r6).A00;
            editAvatarFragment2.A08 = r2.A02;
            editAvatarFragment2.A09 = r2.A05;
            String str2 = r2.A03;
            editAvatarFragment2.A06 = str2;
            editAvatarFragment2.A05 = r2.A06;
            String str3 = r2.A08;
            editAvatarFragment2.A07 = str3;
            WaEditText waEditText = editAvatarFragment2.A02;
            if (waEditText != null) {
                waEditText.setText(str2);
            }
            AnonymousClass3MX.A1Q(new EditAvatarFragment$loadPhoto$1(editAvatarFragment2, str3, (C30391dr) null), AnonymousClass3MZ.A0G(editAvatarFragment2));
        } else {
            ((AnonymousClass3U6) this.this$0.A0C.getValue()).A0T(C87924Xq.A00);
        }
        return C27621Wu.A00;
    }
}
