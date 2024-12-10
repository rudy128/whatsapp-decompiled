package X;

import android.widget.SeekBar;
import com.whatsapp.conversation.ui.AudioPlayerMetadataView;

/* renamed from: X.Bvy  reason: case insensitive filesystem */
public class C24132Bvy extends AnonymousClass79T {
    public final int A00;
    public final Object A01;

    public C24132Bvy(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void A00(int i) {
        AudioPlayerMetadataView audioPlayerMetadataView;
        C18000vb whatsAppLocale;
        switch (this.A00) {
            case 0:
                C23820BqX bqX = (C23820BqX) this.A01;
                bqX.setDuration(BE7.A0j(bqX.A0D, i));
                return;
            case 1:
                C24133Bvz bvz = (C24133Bvz) this.A01;
                bvz.A00.setDuration(BE7.A0j(bvz.A02, i));
                return;
            case 2:
                C24135Bw1 bw1 = (C24135Bw1) this.A01;
                audioPlayerMetadataView = bw1.A04;
                if (audioPlayerMetadataView != null) {
                    whatsAppLocale = bw1.getWhatsAppLocale();
                    break;
                } else {
                    C18070vi.A11("audioPlayerMetadataView");
                    throw null;
                }
            default:
                C24134Bw0 bw0 = (C24134Bw0) this.A01;
                audioPlayerMetadataView = bw0.A04;
                whatsAppLocale = bw0.A05;
                break;
        }
        audioPlayerMetadataView.setDescription(BE7.A0j(whatsAppLocale, i));
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (this.A00 != 0) {
            super.onProgressChanged(seekBar, i, z);
            return;
        }
        C23820BqX bqX = (C23820BqX) this.A01;
        int seekbarProgress = bqX.A04.getSeekbarProgress();
        C17890vO.A0z(((C441822l) ((AnonymousClass21V) bqX.A0I)).A0v, C145777Mo.A17, seekbarProgress);
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        C145777Mo A002;
        if (this.A00 != 0) {
            super.onStopTrackingTouch(seekBar);
            return;
        }
        C23820BqX bqX = (C23820BqX) this.A01;
        C441822l r3 = (C441822l) ((AnonymousClass21V) bqX.A0I);
        C17890vO.A0z(r3.A0v, C145777Mo.A17, bqX.A04.getSeekbarProgress());
        C31131f4 r1 = bqX.A03.A02;
        if (r1.A0D(r3) && (A002 = r1.A00()) != null) {
            A002.A06++;
        }
    }
}
