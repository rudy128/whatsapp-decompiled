package X;

import com.whatsapp.mediacomposer.ImageComposerFragment;

/* renamed from: X.7tr  reason: invalid class name and case insensitive filesystem */
public final class C156127tr extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ int $errorMessageId;
    public final /* synthetic */ ImageComposerFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C156127tr(ImageComposerFragment imageComposerFragment, int i) {
        super(0);
        this.this$0 = imageComposerFragment;
        this.$errorMessageId = i;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        ImageComposerFragment imageComposerFragment = this.this$0;
        AnonymousClass1KB r2 = imageComposerFragment.A07;
        if (r2 != null) {
            r2.A0E((AnonymousClass1FU) imageComposerFragment.A1B(), this.$errorMessageId);
            return C27621Wu.A00;
        }
        AnonymousClass3MW.A1C();
        throw null;
    }
}
