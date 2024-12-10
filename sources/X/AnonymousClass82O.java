package X;

import android.net.Uri;
import com.whatsapp.mediacomposer.VideoComposerFragment;

/* renamed from: X.82O  reason: invalid class name */
public final class AnonymousClass82O extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ Uri $uri;
    public final /* synthetic */ VideoComposerFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass82O(Uri uri, VideoComposerFragment videoComposerFragment) {
        super(1);
        this.this$0 = videoComposerFragment;
        this.$uri = uri;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C26052CrM crM = (C26052CrM) obj;
        C18070vi.A0d(crM, 0);
        C160888Ai A29 = this.this$0.A29();
        if (A29 != null) {
            A29.CQs(this.$uri, crM);
        }
        return C27621Wu.A00;
    }
}
