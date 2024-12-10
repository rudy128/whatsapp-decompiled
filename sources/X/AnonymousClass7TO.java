package X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.whatsapp.mediacomposer.viewmodel.VideoComposerViewModel;
import java.io.File;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.mediacomposer.viewmodel.VideoComposerViewModel", f = "VideoComposerViewModel.kt", i = {}, l = {128}, m = "prepareDataInternal", n = {}, s = {})
/* renamed from: X.7TO  reason: invalid class name */
public final class AnonymousClass7TO extends C30421du {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ VideoComposerViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7TO(VideoComposerViewModel videoComposerViewModel, C30391dr r2) {
        super(r2);
        this.this$0 = videoComposerViewModel;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return VideoComposerViewModel.A00((Context) null, (Uri) null, (Bundle) null, (C160888Ai) null, this.this$0, (C131126kY) null, (File) null, this);
    }
}
