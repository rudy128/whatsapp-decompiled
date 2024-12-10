package X;

import com.whatsapp.mediacomposer.VideoComposerFragment;

/* renamed from: X.7Lb  reason: invalid class name and case insensitive filesystem */
public class C145387Lb implements AnonymousClass8AG {
    public final int A00;
    public final Object A01;

    public C145387Lb(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public /* bridge */ /* synthetic */ C41111vp BTO() {
        int i = this.A00;
        Object obj = this.A01;
        switch (i) {
            case 0:
                return (C41111vp) ((VideoComposerFragment) obj).A0x.getValue();
            case 1:
                return ((AnonymousClass74G) obj).A0w;
            default:
                return ((AnonymousClass74G) obj).A0y;
        }
    }

    public /* bridge */ /* synthetic */ AnonymousClass1DS BV3() {
        switch (this.A00) {
            case 0:
                return C108945cZ.A0Q(((VideoComposerFragment) this.A01).A0r);
            case 1:
                return AnonymousClass3MW.A0n(AnonymousClass3MY.A0f());
            default:
                return ((AnonymousClass74G) this.A01).A0x;
        }
    }

    public int getCurrentPosition() {
        int i;
        switch (this.A00) {
            case 0:
                AnonymousClass70X r0 = ((VideoComposerFragment) this.A01).A0W;
                if (r0 != null) {
                    i = r0.A07();
                } else {
                    i = 0;
                }
                return Math.max(i, 0);
            case 1:
                AnonymousClass74G r6 = (AnonymousClass74G) this.A01;
                long j = r6.A02;
                int i2 = (j > -1 ? 1 : (j == -1 ? 0 : -1));
                long j2 = (long) r6.A00;
                if (i2 != 0) {
                    j2 = (j2 + System.currentTimeMillis()) - j;
                }
                if (C72463Mc.A1O(r6.A0w) && j2 > r6.A0O) {
                    r6.A0u.A05 = true;
                    AnonymousClass74G.A07(r6, new AnonymousClass7RB((Object) r6, 9));
                }
                return (int) j2;
            default:
                AnonymousClass70X r02 = ((AnonymousClass74G) this.A01).A09.A00;
                if (r02 != null) {
                    return r02.A05();
                }
                return 0;
        }
    }

    public int getDuration() {
        long j;
        switch (this.A00) {
            case 0:
                VideoComposerFragment videoComposerFragment = (VideoComposerFragment) this.A01;
                C1405471x r0 = videoComposerFragment.A0T;
                if (r0 != null) {
                    j = r0.A03;
                } else {
                    j = videoComposerFragment.A02;
                }
                return (int) j;
            case 1:
                return getCurrentPosition();
            default:
                AnonymousClass70X r02 = ((AnonymousClass74G) this.A01).A09.A00;
                if (r02 != null) {
                    return r02.A06();
                }
                return 0;
        }
    }
}
