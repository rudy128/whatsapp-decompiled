package X;

import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.whatsapp.mediacomposer.StickerComposerFragment;

/* renamed from: X.80A  reason: invalid class name */
public final class AnonymousClass80A extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ StickerComposerFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass80A(StickerComposerFragment stickerComposerFragment) {
        super(1);
        this.this$0 = stickerComposerFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        StickerComposerFragment stickerComposerFragment = this.this$0;
        int A03 = AnonymousClass3MY.A03((Number) obj);
        CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) stickerComposerFragment.A04.getValue();
        if (circularProgressIndicator != null) {
            circularProgressIndicator.A01(A03, true);
        }
        return C27621Wu.A00;
    }
}
