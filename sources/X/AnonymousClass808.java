package X;

import android.net.Uri;
import com.whatsapp.mediacomposer.MediaComposerActivity;
import com.whatsapp.mediacomposer.StickerComposerFragment;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.808  reason: invalid class name */
public final class AnonymousClass808 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ StickerComposerFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass808(StickerComposerFragment stickerComposerFragment) {
        super(1);
        this.this$0 = stickerComposerFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C160888Ai A29;
        Uri uri = (Uri) obj;
        if (!(uri == null || (A29 = this.this$0.A29()) == null)) {
            MediaComposerActivity mediaComposerActivity = (MediaComposerActivity) A29;
            AnonymousClass7JS r3 = mediaComposerActivity.A0X;
            List list = r3.A0D;
            list.add(uri);
            r3.A04.A0E(Collections.unmodifiableList(list));
            r3.A0D(AnonymousClass3MX.A01(list));
            C17880vN.A1N(uri, mediaComposerActivity.A1w, ((long) AnonymousClass7JS.A01(mediaComposerActivity)) - 1);
            AnonymousClass73D r1 = mediaComposerActivity.A1q;
            AnonymousClass72S r2 = new AnonymousClass72S(uri);
            r2.A0O(C17880vN.A0h());
            r2.A0N(C64062u9.A04(uri));
            Map map = r1.A00;
            synchronized (map) {
                map.put(uri, r2);
            }
            C116345x6 r0 = mediaComposerActivity.A0Z;
            if (r0 != null) {
                r0.A04();
            }
            AnonymousClass7JN.A01(mediaComposerActivity);
            mediaComposerActivity.A0a.A0A(true);
            mediaComposerActivity.A0S.A0J(mediaComposerActivity.A0X.A07(), true ^ C138766xe.A00(mediaComposerActivity.A0h));
            MediaComposerActivity.A18(mediaComposerActivity, mediaComposerActivity.A0X.A07());
        }
        StickerComposerFragment.A00(this.this$0);
        return C27621Wu.A00;
    }
}
