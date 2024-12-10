package X;

import com.whatsapp.mediacomposer.GifComposerFragment;
import com.whatsapp.mediacomposer.MediaComposerActivity;
import com.whatsapp.mediacomposer.MediaComposerFragment;
import com.whatsapp.mediacomposer.VideoComposerFragment;

/* renamed from: X.6ud  reason: invalid class name and case insensitive filesystem */
public abstract class C136926ud {
    public final /* synthetic */ MediaComposerFragment A00;

    public boolean A05() {
        AnonymousClass70X r0;
        AnonymousClass696 r1 = (AnonymousClass696) this;
        switch (r1.A00) {
            case 0:
                r0 = ((GifComposerFragment) r1.A01).A00;
                break;
            case 2:
            case 3:
                r0 = ((VideoComposerFragment) r1.A01).A0W;
                break;
            default:
                return true;
        }
        if (r0 != null) {
            return C108975cc.A1B(r0.A0Z() ? 1 : 0);
        }
        return false;
    }

    public C136926ud(MediaComposerFragment mediaComposerFragment) {
        this.A00 = mediaComposerFragment;
    }

    public void A00() {
        AnonymousClass7JN r1;
        MediaComposerFragment mediaComposerFragment = this.A00;
        if (C18020vd.A05(C18040vf.A02, C108955ca.A0R(mediaComposerFragment.A2B()), 9237) && (r1 = mediaComposerFragment.A0I) != null && !r1.A02) {
            r1.A03();
        }
    }

    public void A01() {
        AnonymousClass7JN r0;
        MediaComposerFragment mediaComposerFragment = this.A00;
        if (C18020vd.A05(C18040vf.A02, C108955ca.A0R(mediaComposerFragment.A2B()), 9237) && (r0 = mediaComposerFragment.A0I) != null) {
            r0.A04();
        }
    }

    public void A02() {
        C160888Ai A29 = this.A00.A29();
        if (A29 != null) {
            MediaComposerActivity mediaComposerActivity = (MediaComposerActivity) A29;
            AnonymousClass7JN r2 = mediaComposerActivity.A0a;
            boolean A0G = mediaComposerActivity.A0X.A0G();
            r2.A02 = true;
            r2.A08(A0G);
        }
    }

    public void A03() {
        C160888Ai A29 = this.A00.A29();
        if (A29 != null) {
            A29.Bs7();
        }
    }

    public void A04() {
        C160888Ai A29;
        MediaComposerFragment mediaComposerFragment = this.A00;
        AnonymousClass1FL A1B = mediaComposerFragment.A1B();
        if (A1B != null && !A1B.isFinishing() && (A29 = mediaComposerFragment.A29()) != null) {
            MediaComposerActivity mediaComposerActivity = (MediaComposerActivity) A29;
            if (!mediaComposerActivity.isFinishing()) {
                mediaComposerActivity.A1R = false;
            }
        }
    }
}
