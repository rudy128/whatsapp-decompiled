package X;

import android.view.View;
import com.whatsapp.mediaview.MediaViewBaseFragment;
import com.whatsapp.mediaview.MediaViewFragment;

/* renamed from: X.7Hk  reason: invalid class name and case insensitive filesystem */
public class C144467Hk implements E9X {
    public final float A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ MediaViewBaseFragment A02;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        if (r4.A2M() == false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C144467Hk(android.view.View r3, com.whatsapp.mediaview.MediaViewBaseFragment r4) {
        /*
            r2 = this;
            r2.A02 = r4
            r2.A01 = r3
            r2.<init>()
            X.745 r0 = r4.A0B
            boolean r0 = r0 instanceof X.AnonymousClass6A8
            if (r0 != 0) goto L_0x0016
            boolean r1 = r4.A2M()
            r0 = 1061997773(0x3f4ccccd, float:0.8)
            if (r1 != 0) goto L_0x0018
        L_0x0016:
            r0 = 1056964608(0x3f000000, float:0.5)
        L_0x0018:
            r2.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C144467Hk.<init>(android.view.View, com.whatsapp.mediaview.MediaViewBaseFragment):void");
    }

    public boolean BeX(View view) {
        return AnonymousClass000.A1Z(view, this.A02.A04);
    }

    public void Brt() {
        MediaViewBaseFragment mediaViewBaseFragment = this.A02;
        if (((mediaViewBaseFragment.A0B instanceof AnonymousClass6A8) || !mediaViewBaseFragment.A2M()) && (mediaViewBaseFragment.A0B instanceof AnonymousClass6A9)) {
            mediaViewBaseFragment.A09.setAlpha(0.0f);
        }
        mediaViewBaseFragment.A2E();
    }

    public void BsL(int i) {
        MediaViewBaseFragment mediaViewBaseFragment = this.A02;
        if (mediaViewBaseFragment instanceof MediaViewFragment) {
            MediaViewFragment mediaViewFragment = (MediaViewFragment) mediaViewBaseFragment;
            AnonymousClass70X r1 = mediaViewFragment.A1E;
            if (i == 1) {
                if (r1 != null) {
                    r1.A0B();
                    C121996Mj A0A = mediaViewFragment.A1E.A0A();
                    if (A0A != null && !C108995ce.A1U(A0A.A0F)) {
                        A0A.A05();
                        A0A.A0A(3000);
                    }
                }
                MediaViewFragment.A0D(mediaViewFragment);
            } else if (r1 != null && r1.A0A() == null) {
                r1.A0K();
            }
        }
    }

    public void C5M() {
        C23301Fm r0 = (C23301Fm) this.A02.A1B();
        if (r0 != null) {
            r0.C86();
        }
    }

    public void C5n(float f) {
        float f2;
        MediaViewBaseFragment mediaViewBaseFragment = this.A02;
        C23301Fm r1 = (C23301Fm) mediaViewBaseFragment.A1B();
        if (r1 != null && !r1.isFinishing()) {
            r1.Brw();
            float f3 = 1.0f - f;
            float f4 = this.A00;
            if (f3 < f4) {
                f2 = 0.0f;
            } else {
                f2 = (f3 - f4) / (1.0f - f4);
            }
            this.A01.setAlpha(f2);
            mediaViewBaseFragment.A03.setAlpha(f2);
            mediaViewBaseFragment.A07.setAlpha(f2);
            if ((mediaViewBaseFragment.A0B instanceof AnonymousClass6A8) || !mediaViewBaseFragment.A2M()) {
                mediaViewBaseFragment.A09.setAlpha(f2);
            }
            int childCount = mediaViewBaseFragment.A09.getChildCount();
            for (int i = 0; i < childCount; i++) {
                mediaViewBaseFragment.A09.getChildAt(i).findViewById(2131430949).setAlpha(f2 * f2);
            }
            mediaViewBaseFragment.A2L(true, true);
        }
    }
}
