package com.whatsapp.bot.creation;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C18070vi;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C72453Mb;
import android.graphics.drawable.Drawable;
import android.widget.ProgressBar;
import com.whatsapp.bot.creation.service.AiCreationPhotoLoader;
import com.whatsapp.components.button.ThumbnailButton;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.bot.creation.EditAvatarFragment$loadPhoto$1", f = "EditAvatarFragment.kt", i = {}, l = {142}, m = "invokeSuspend", n = {}, s = {})
public final class EditAvatarFragment$loadPhoto$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ String $photoUrl;
    public int label;
    public final /* synthetic */ EditAvatarFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditAvatarFragment$loadPhoto$1(EditAvatarFragment editAvatarFragment, String str, C30391dr r4) {
        super(2, r4);
        this.this$0 = editAvatarFragment;
        this.$photoUrl = str;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new EditAvatarFragment$loadPhoto$1(this.this$0, this.$photoUrl, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            ProgressBar progressBar = this.this$0.A00;
            if (progressBar != null) {
                progressBar.setVisibility(0);
            }
            AiCreationPhotoLoader aiCreationPhotoLoader = this.this$0.A03;
            if (aiCreationPhotoLoader != null) {
                String str = this.$photoUrl;
                this.label = 1;
                obj = aiCreationPhotoLoader.A01(str, this);
                if (obj == r4) {
                    return r4;
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
        EditAvatarFragment editAvatarFragment = this.this$0;
        if (drawable != null) {
            ThumbnailButton thumbnailButton = editAvatarFragment.A04;
            if (thumbnailButton != null) {
                thumbnailButton.setImageDrawable(drawable);
            }
        } else {
            ThumbnailButton thumbnailButton2 = editAvatarFragment.A04;
            if (thumbnailButton2 != null) {
                thumbnailButton2.setImageResource(2131230997);
            }
        }
        ThumbnailButton thumbnailButton3 = this.this$0.A04;
        if (thumbnailButton3 != null) {
            thumbnailButton3.setVisibility(0);
        }
        C72453Mb.A1D(this.this$0.A00);
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((EditAvatarFragment$loadPhoto$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
