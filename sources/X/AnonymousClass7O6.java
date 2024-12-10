package X;

import com.whatsapp.mediaview.MediaViewBaseFragment;

/* renamed from: X.7O6  reason: invalid class name */
public class AnonymousClass7O6 implements AnonymousClass88U {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public AnonymousClass7O6(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public void CAE(int i) {
        MediaViewBaseFragment mediaViewBaseFragment;
        boolean z;
        if (this.A00 != 0) {
            mediaViewBaseFragment = (MediaViewBaseFragment) this.A01;
            if (((AnonymousClass70X) this.A02).A0e() && mediaViewBaseFragment.A1B() != null) {
                boolean A1P = AnonymousClass000.A1P(AnonymousClass3MZ.A0F(mediaViewBaseFragment.A1D()).getSystemUiVisibility() & 4);
                if (i == 0) {
                    if (!A1P) {
                        mediaViewBaseFragment.A2L(true, true);
                        return;
                    }
                    return;
                } else if (i != 4 || !A1P) {
                    return;
                }
            } else {
                return;
            }
        } else if (((C122076Mr) ((C98494rF) this.A01).element).A0I) {
            mediaViewBaseFragment = (MediaViewBaseFragment) this.A02;
            if (mediaViewBaseFragment.A1B() == null) {
                return;
            }
            if (i == 0) {
                z = true;
                mediaViewBaseFragment.A2L(z, true);
            } else if (i != 4) {
                return;
            }
        } else {
            return;
        }
        z = false;
        mediaViewBaseFragment.A2L(z, true);
    }
}
