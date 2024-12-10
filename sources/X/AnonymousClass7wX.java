package X;

import android.graphics.Rect;
import android.net.Uri;
import com.whatsapp.mediacomposer.MediaComposerActivity;
import java.io.File;

/* renamed from: X.7wX  reason: invalid class name */
public final class AnonymousClass7wX extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C160888Ai $composerContainer;
    public final /* synthetic */ File $cropFile;
    public final /* synthetic */ Rect $cropRect;
    public final /* synthetic */ Uri $currentUri;
    public final /* synthetic */ int $rotation;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7wX(Rect rect, Uri uri, C160888Ai r4, File file, int i) {
        super(0);
        this.$composerContainer = r4;
        this.$currentUri = uri;
        this.$cropFile = file;
        this.$cropRect = rect;
        this.$rotation = i;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C160888Ai r6 = this.$composerContainer;
        Uri uri = this.$currentUri;
        File file = this.$cropFile;
        Rect rect = this.$cropRect;
        int i = this.$rotation;
        MediaComposerActivity mediaComposerActivity = (MediaComposerActivity) r6;
        AnonymousClass72S A02 = mediaComposerActivity.A1q.A02(uri);
        synchronized (A02) {
            A02.A04 = rect;
        }
        synchronized (A02) {
            A02.A01 = i;
        }
        synchronized (A02) {
            A02.A08 = file;
        }
        MediaComposerActivity.A0v(uri, mediaComposerActivity);
        AnonymousClass7JN.A01(mediaComposerActivity);
        MediaComposerActivity.A16(mediaComposerActivity);
        return C27621Wu.A00;
    }
}
