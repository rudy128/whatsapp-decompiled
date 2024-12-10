package X;

import android.os.SystemClock;
import com.whatsapp.mediacomposer.VideoComposerFragment;

/* renamed from: X.7La  reason: invalid class name and case insensitive filesystem */
public class C145377La implements C1607889x {
    public final int A00;
    public final Object A01;

    public C145377La(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public int BUQ() {
        long j;
        switch (this.A00) {
            case 0:
                j = ((AnonymousClass7DY) this.A01).A0u;
                break;
            case 1:
                VideoComposerFragment videoComposerFragment = (VideoComposerFragment) this.A01;
                C1405471x r0 = videoComposerFragment.A0T;
                if (r0 == null) {
                    j = videoComposerFragment.A02;
                    break;
                } else {
                    j = r0.A03;
                    break;
                }
            case 2:
                j = ((AnonymousClass74G) this.A01).A0O;
                break;
            default:
                AnonymousClass70X r02 = ((AnonymousClass74G) this.A01).A09.A00;
                if (r02 != null) {
                    return r02.A06();
                }
                return 0;
        }
        return (int) j;
    }

    public C41111vp BZB() {
        int i = this.A00;
        Object obj = this.A01;
        switch (i) {
            case 0:
                return ((AnonymousClass7DY) obj).A1M;
            case 1:
                return (C41111vp) ((VideoComposerFragment) obj).A0x.getValue();
            case 2:
                return ((AnonymousClass74G) obj).A0w;
            default:
                return ((AnonymousClass74G) obj).A0y;
        }
    }

    public int getValue() {
        long j;
        int i;
        switch (this.A00) {
            case 0:
                AnonymousClass7DY r1 = (AnonymousClass7DY) this.A01;
                if (C72463Mc.A1O(r1.A1M)) {
                    C140086zv r0 = r1.A0T;
                    if (r0 != null) {
                        j = SystemClock.elapsedRealtime() - r0.A00;
                        break;
                    } else {
                        C18070vi.A11("recordingController");
                        throw null;
                    }
                } else {
                    return 0;
                }
            case 1:
                AnonymousClass70X r02 = ((VideoComposerFragment) this.A01).A0W;
                if (r02 != null) {
                    i = r02.A07();
                } else {
                    i = 0;
                }
                int max = Math.max(i, 0);
                if (max <= 1) {
                    return 0;
                }
                return max;
            case 2:
                AnonymousClass74G r3 = (AnonymousClass74G) this.A01;
                long j2 = r3.A02;
                int i2 = (j2 > -1 ? 1 : (j2 == -1 ? 0 : -1));
                int i3 = r3.A00;
                if (i2 != 0) {
                    j = (((long) i3) + System.currentTimeMillis()) - j2;
                    break;
                } else {
                    return i3;
                }
            default:
                AnonymousClass70X r03 = ((AnonymousClass74G) this.A01).A09.A00;
                if (r03 != null) {
                    return r03.A05();
                }
                return 0;
        }
        return (int) j;
    }
}
