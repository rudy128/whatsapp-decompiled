package X;

import com.whatsapp.mediacomposer.MediaComposerActivity;
import com.whatsapp.mediacomposer.MediaComposerFragment;

/* renamed from: X.7Al  reason: invalid class name and case insensitive filesystem */
public class C142697Al implements C23521Gp {
    public final /* synthetic */ MediaComposerActivity A00;

    public void Bzw(int i) {
    }

    public void Bzx(int i, float f, int i2) {
    }

    public C142697Al(MediaComposerActivity mediaComposerActivity) {
        this.A00 = mediaComposerActivity;
    }

    public void Bzy(int i) {
        MediaComposerActivity mediaComposerActivity = this.A00;
        MediaComposerFragment A0d = MediaComposerActivity.A0d(mediaComposerActivity);
        if (A0d != null) {
            MediaComposerActivity.A1A(mediaComposerActivity, A0d);
        }
        MediaComposerActivity.A10(mediaComposerActivity);
        C116345x6 r0 = mediaComposerActivity.A0Z;
        if (r0 != null) {
            MediaComposerActivity.A18(mediaComposerActivity, C116345x6.A00(r0, i));
        }
        if (!mediaComposerActivity.A1W) {
            C108965cb.A0f(mediaComposerActivity).A02(C108955ca.A0j(), 7, mediaComposerActivity.A0X.A06());
        }
        mediaComposerActivity.A1W = false;
    }
}
