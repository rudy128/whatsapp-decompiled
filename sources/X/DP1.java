package X;

import com.whatsapp.conversation.ui.AudioPlayerMetadataView;

public class DP1 implements C28529E6d {
    public final int A00;
    public final Object A01;

    public DP1(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void BsR(int i) {
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
}
