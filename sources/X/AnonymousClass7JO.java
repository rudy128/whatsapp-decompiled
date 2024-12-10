package X;

import android.graphics.Point;
import android.net.Uri;
import com.whatsapp.mediacomposer.VideoComposerFragment;

/* renamed from: X.7JO  reason: invalid class name */
public final class AnonymousClass7JO implements AnonymousClass87X {
    public final /* synthetic */ VideoComposerFragment A00;

    public AnonymousClass7JO(VideoComposerFragment videoComposerFragment) {
        this.A00 = videoComposerFragment;
    }

    public void C8f(long j, long j2) {
        VideoComposerFragment videoComposerFragment = this.A00;
        AnonymousClass70X r0 = videoComposerFragment.A0W;
        if (r0 != null && r0.A0a()) {
            videoComposerFragment.A2T();
        }
        videoComposerFragment.A06 = j;
        videoComposerFragment.A07 = j2;
        long j3 = 0;
        if (j - 200 <= 0 && j2 + 200 >= C108995ce.A09(videoComposerFragment)) {
            j2 = 0;
        } else if (j2 - j < 1000) {
            j2 = j + 1000;
            long A09 = C108995ce.A09(videoComposerFragment);
            if (j2 > A09) {
                j2 = A09;
            }
            long j4 = j2 - 1000;
            long j5 = 0;
            if (0 < j4) {
                j5 = j4;
            }
            j3 = j5;
        } else {
            j3 = j;
        }
        C160888Ai A29 = videoComposerFragment.A29();
        if (A29 != null) {
            Uri uri = videoComposerFragment.A01;
            if (uri != null) {
                AnonymousClass73D.A00(uri, A29).A0L(new Point((int) j3, (int) j2));
            } else {
                throw C17880vN.A0g();
            }
        }
        AnonymousClass70X r1 = videoComposerFragment.A0W;
        if (r1 != null) {
            r1.A0M((int) j);
        }
        videoComposerFragment.A2H();
        VideoComposerFragment.A0A(videoComposerFragment);
        VideoComposerFragment.A08(videoComposerFragment);
    }
}
