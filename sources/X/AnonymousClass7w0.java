package X;

import android.net.Uri;
import android.os.Bundle;
import com.whatsapp.mediacomposer.VideoComposerFragment;

/* renamed from: X.7w0  reason: invalid class name */
public final class AnonymousClass7w0 extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ Bundle $savedInstanceState;
    public final /* synthetic */ Uri $uri;
    public final /* synthetic */ VideoComposerFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7w0(Uri uri, Bundle bundle, VideoComposerFragment videoComposerFragment) {
        super(0);
        this.this$0 = videoComposerFragment;
        this.$savedInstanceState = bundle;
        this.$uri = uri;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        VideoComposerFragment videoComposerFragment = this.this$0;
        VideoComposerFragment.A06(this.$uri, this.$savedInstanceState, videoComposerFragment);
        return C27621Wu.A00;
    }
}
