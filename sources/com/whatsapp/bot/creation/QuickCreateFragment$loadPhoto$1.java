package com.whatsapp.bot.creation;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C17890vO;
import X.C18070vi;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C72453Mb;
import X.C89474cW;
import android.graphics.drawable.Drawable;
import com.whatsapp.bot.creation.service.AiCreationPhotoLoader;
import com.whatsapp.components.button.ThumbnailButton;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.bot.creation.QuickCreateFragment$loadPhoto$1", f = "QuickCreateFragment.kt", i = {}, l = {185}, m = "invokeSuspend", n = {}, s = {})
public final class QuickCreateFragment$loadPhoto$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ String $photoUrl;
    public int label;
    public final /* synthetic */ QuickCreateFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public QuickCreateFragment$loadPhoto$1(QuickCreateFragment quickCreateFragment, String str, C30391dr r4) {
        super(2, r4);
        this.this$0 = quickCreateFragment;
        this.$photoUrl = str;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new QuickCreateFragment$loadPhoto$1(this.this$0, this.$photoUrl, r5);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        C31751g4 r3 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C72453Mb.A1C(this.this$0.A00);
            ThumbnailButton thumbnailButton = this.this$0.A07;
            if (thumbnailButton != null) {
                thumbnailButton.setImageResource(2131230997);
            }
            AiCreationPhotoLoader aiCreationPhotoLoader = this.this$0.A06;
            if (aiCreationPhotoLoader != null) {
                String str2 = this.$photoUrl;
                this.label = 1;
                obj = aiCreationPhotoLoader.A01(str2, this);
                if (obj == r3) {
                    return r3;
                }
            } else {
                C18070vi.A11("aiCreationPhotoLoader");
                throw null;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        Drawable drawable = (Drawable) obj;
        C72453Mb.A1D(this.this$0.A00);
        if (drawable == null) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Failed to load photo for bot ");
            C89474cW r0 = this.this$0.A05;
            if (r0 != null) {
                str = r0.A04;
            } else {
                str = null;
            }
            C17890vO.A1B(A10, str);
        } else {
            ThumbnailButton thumbnailButton2 = this.this$0.A07;
            if (thumbnailButton2 != null) {
                thumbnailButton2.setImageDrawable(drawable);
            }
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((QuickCreateFragment$loadPhoto$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
