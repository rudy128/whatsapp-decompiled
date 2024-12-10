package X;

import com.whatsapp.mediacomposer.ImageComposerFragment;

/* renamed from: X.7wN  reason: invalid class name */
public final class AnonymousClass7wN extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C1409573s $doodle;
    public final /* synthetic */ String $doodleTemplateStr;
    public final /* synthetic */ String $editState;
    public final /* synthetic */ ImageComposerFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7wN(ImageComposerFragment imageComposerFragment, C1409573s r3, String str, String str2) {
        super(0);
        this.$doodle = r3;
        this.this$0 = imageComposerFragment;
        this.$editState = str;
        this.$doodleTemplateStr = str2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C1409573s r2 = this.$doodle;
        if (r2 != null) {
            ImageComposerFragment imageComposerFragment = this.this$0;
            C108995ce.A1D(imageComposerFragment, r2, this.$editState);
            C160888Ai A29 = imageComposerFragment.A29();
            if (A29 != null) {
                A29.Bs5();
            }
        }
        return C27621Wu.A00;
    }
}
