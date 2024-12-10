package X;

import android.view.View;
import android.view.animation.AlphaAnimation;
import com.whatsapp.mediacomposer.GifComposerFragment;
import com.whatsapp.mediacomposer.ImageComposerFragment;
import com.whatsapp.mediacomposer.MediaComposerActivity;
import com.whatsapp.mediacomposer.MediaComposerFragment;
import com.whatsapp.mediacomposer.PtvComposerFragment;
import com.whatsapp.mediacomposer.VideoComposerFragment;
import com.whatsapp.mediacomposer.doodle.ImagePreviewContentLayout;

/* renamed from: X.696  reason: invalid class name */
public class AnonymousClass696 extends C136926ud {
    public final int A00 = 0;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass696(GifComposerFragment gifComposerFragment) {
        super(gifComposerFragment);
        this.A01 = gifComposerFragment;
    }

    public void A00() {
        if (1 - this.A00 != 0) {
            super.A00();
            return;
        }
        super.A00();
        ImageComposerFragment imageComposerFragment = (ImageComposerFragment) this.A01;
        C1419877s r0 = ((ImagePreviewContentLayout) AnonymousClass3MX.A14(imageComposerFragment.A0G)).A02;
        if (r0.A04 <= r0.A01) {
            ImageComposerFragment.A0B(imageComposerFragment, true, false);
        }
    }

    public void A01() {
        if (1 - this.A00 != 0) {
            super.A01();
            return;
        }
        super.A01();
        ImageComposerFragment.A0B((ImageComposerFragment) this.A01, false, true);
    }

    public void A02() {
        switch (this.A00) {
            case 1:
                C160888Ai A29 = ((MediaComposerFragment) this.A01).A29();
                if (A29 != null) {
                    MediaComposerActivity mediaComposerActivity = (MediaComposerActivity) A29;
                    AnonymousClass7JN r2 = mediaComposerActivity.A0a;
                    boolean A0G = mediaComposerActivity.A0X.A0G();
                    r2.A02 = true;
                    r2.A08(A0G);
                    return;
                }
                return;
            case 2:
            case 3:
                super.A02();
                View view = ((VideoComposerFragment) this.A01).A0B;
                AlphaAnimation A0H = C108985cd.A0H();
                A0H.setDuration(300);
                if (view != null) {
                    view.startAnimation(A0H);
                    view.setVisibility(4);
                    return;
                }
                return;
            default:
                super.A02();
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002c, code lost:
        if (r0.A0G.A09() != 6) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03() {
        /*
            r4 = this;
            int r0 = r4.A00
            switch(r0) {
                case 1: goto L_0x0009;
                case 2: goto L_0x0005;
                case 3: goto L_0x0055;
                default: goto L_0x0005;
            }
        L_0x0005:
            super.A03()
        L_0x0008:
            return
        L_0x0009:
            java.lang.Object r3 = r4.A01
            com.whatsapp.mediacomposer.ImageComposerFragment r3 = (com.whatsapp.mediacomposer.ImageComposerFragment) r3
            X.8Ai r0 = r3.A29()
            if (r0 == 0) goto L_0x0008
            r0.Bs7()
            X.8Ai r0 = r3.A29()
            if (r0 == 0) goto L_0x002e
            com.whatsapp.mediacomposer.MediaComposerActivity r0 = (com.whatsapp.mediacomposer.MediaComposerActivity) r0
            X.6uj r0 = X.C108955ca.A0U(r0)
            if (r0 == 0) goto L_0x002e
            X.7JS r0 = r0.A0G
            int r1 = r0.A09()
            r0 = 6
            r2 = 1
            if (r1 == r0) goto L_0x002f
        L_0x002e:
            r2 = 0
        L_0x002f:
            X.0vl r0 = r3.A0G
            java.lang.Object r0 = X.AnonymousClass3MX.A14(r0)
            com.whatsapp.mediacomposer.doodle.ImagePreviewContentLayout r0 = (com.whatsapp.mediacomposer.doodle.ImagePreviewContentLayout) r0
            X.77s r0 = r0.A02
            float r1 = r0.A04
            float r0 = r0.A01
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0008
            X.7JF r0 = r3.A0J
            if (r0 == 0) goto L_0x0008
            com.whatsapp.mediacomposer.doodle.ColorPickerComponent r0 = r0.A0L
            boolean r0 = r0.A06()
            if (r0 != 0) goto L_0x0008
            if (r2 != 0) goto L_0x0008
            r1 = 1
            r0 = 0
            com.whatsapp.mediacomposer.ImageComposerFragment.A0B(r3, r1, r0)
            return
        L_0x0055:
            super.A03()
            java.lang.Object r1 = r4.A01
            com.whatsapp.mediacomposer.VideoComposerFragment r1 = (com.whatsapp.mediacomposer.VideoComposerFragment) r1
            android.view.View r0 = r1.A0B
            if (r0 == 0) goto L_0x0067
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0067
            return
        L_0x0067:
            boolean r0 = r1.A2V()
            if (r0 != 0) goto L_0x0008
            android.view.View r2 = r1.A0B
            r0 = 300(0x12c, double:1.48E-321)
            com.whatsapp.mediacomposer.VideoComposerFragment.A07(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass696.A03():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        if (r0 == false) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04() {
        /*
            r6 = this;
            int r0 = r6.A00
            int r0 = 1 - r0
            if (r0 == 0) goto L_0x000a
            super.A04()
        L_0x0009:
            return
        L_0x000a:
            java.lang.Object r5 = r6.A01
            com.whatsapp.mediacomposer.ImageComposerFragment r5 = (com.whatsapp.mediacomposer.ImageComposerFragment) r5
            X.740 r4 = r5.A05
            r3 = 0
            if (r4 == 0) goto L_0x0042
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r4.A0A
            r2 = 0
            if (r0 == 0) goto L_0x001e
            int r1 = r0.A0J
            r0 = 3
            if (r1 != r0) goto L_0x001e
            r2 = 1
        L_0x001e:
            boolean r0 = X.AnonymousClass740.A05(r4)
            if (r2 == 0) goto L_0x0026
            if (r0 == 0) goto L_0x002b
        L_0x0026:
            r0 = r0 ^ 1
            com.whatsapp.mediacomposer.ImageComposerFragment.A0B(r5, r3, r0)
        L_0x002b:
            X.8Ai r1 = r5.A29()
            if (r1 == 0) goto L_0x0009
            X.740 r0 = r5.A05
            if (r0 == 0) goto L_0x0037
            boolean r3 = r0.A0I
        L_0x0037:
            com.whatsapp.mediacomposer.MediaComposerActivity r1 = (com.whatsapp.mediacomposer.MediaComposerActivity) r1
            boolean r0 = r1.isFinishing()
            if (r0 != 0) goto L_0x0009
            r1.A1R = r3
            return
        L_0x0042:
            r0 = 0
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass696.A04():void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass696(ImageComposerFragment imageComposerFragment) {
        super(imageComposerFragment);
        this.A01 = imageComposerFragment;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass696(VideoComposerFragment videoComposerFragment) {
        super(videoComposerFragment);
        this.A01 = videoComposerFragment;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass696(PtvComposerFragment ptvComposerFragment) {
        super(ptvComposerFragment);
        this.A01 = ptvComposerFragment;
    }
}
