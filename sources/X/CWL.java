package X;

import com.whatsapp.search.views.itemviews.VoiceNoteProfileAvatarView;

public class CWL {
    public final C134196qC A00;
    public final C19830z4 A01;
    public final VoiceNoteProfileAvatarView A02;

    public void A00(C441822l r7) {
        C145777Mo r1;
        AnonymousClass70T r0;
        C31131f4 r12 = this.A00.A02;
        if (r12.A0D(r7)) {
            r1 = r12.A00();
            if (r1 != null) {
                r1.A07++;
            }
        } else {
            r1 = null;
        }
        int i = C145777Mo.A15;
        int i2 = 1;
        if (i != 0) {
            i2 = 2;
            if (i != 1) {
                if (i == 2) {
                    i2 = 0;
                } else {
                    throw AnonymousClass8BX.A0W("fastPlaybackOnClick: Did not handle fastPlaybackPlayerState: ", AnonymousClass000.A10(), i);
                }
            }
        }
        if (r1 == null || (r0 = r1.A0M) == null || !r0.A0C() || r1.A0J(i2)) {
            C145777Mo.A15 = i2;
            C17880vN.A1C(C19830z4.A00(this.A01), "ptt_fast_playback_player_state", i2);
            AnonymousClass205 r02 = r7.A0v;
            boolean z = r02.A02;
            boolean A0e = C22971Dz.A0e(r02.A00);
            int i3 = 1;
            if (i2 != 0) {
                i3 = 2;
                if (i2 != 1) {
                    i3 = 3;
                }
            }
            this.A02.A03(i3, false, z, A0e);
        }
    }

    public CWL(C134196qC r1, C19830z4 r2, VoiceNoteProfileAvatarView voiceNoteProfileAvatarView) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = voiceNoteProfileAvatarView;
    }
}
