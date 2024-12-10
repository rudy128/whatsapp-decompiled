package X;

import android.media.AudioAttributes;
import com.facebook.android.exoplayer2.util.Util;

/* renamed from: X.CIu  reason: case insensitive filesystem */
public final class C24757CIu {
    public final AudioAttributes A00;

    public C24757CIu(C25720Ckq ckq) {
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(ckq.A01);
        int i = Util.A00;
        if (i >= 29) {
            C24528C7z.A00(usage);
            if (i >= 32) {
                C80.A00(usage);
            }
        }
        this.A00 = usage.build();
    }
}
