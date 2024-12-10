package X;

import com.whatsapp.videoplayback.ExoPlayerErrorFrame;

/* renamed from: X.6le  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C131776le {
    public final /* synthetic */ C122076Mr A00;

    public final void A00(String str, boolean z, int i) {
        C122076Mr r3 = this.A00;
        boolean z2 = false;
        if (i == 1) {
            C122076Mr.A01(r3, C17880vN.A0l(), str, "download_failed", z);
        } else if (i == 2) {
            C121996Mj r0 = r3.A0C;
            if (r0 != null) {
                r0.setPlayControlVisibility(0);
            }
            r3.A0F();
            r3.A0E();
        }
        C122126Mw r32 = r3.A0a;
        if (i == 1) {
            z2 = true;
        }
        r32.A03 = str;
        C133906ph r2 = r32.A01;
        if (r2 != null && r32.A04 != z2) {
            int i2 = r32.A00;
            if (z2) {
                if (i2 == 2) {
                    r2.A01(str);
                }
            } else if (i2 == 2) {
                ExoPlayerErrorFrame exoPlayerErrorFrame = r2.A02;
                exoPlayerErrorFrame.setLoadingViewVisibility(0);
                C72453Mb.A1D(exoPlayerErrorFrame.A02);
            }
            r32.A04 = z2;
        }
    }

    public /* synthetic */ C131776le(C122076Mr r1) {
        this.A00 = r1;
    }
}
