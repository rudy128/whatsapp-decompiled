package X;

import com.whatsapp.conversation.conversationrow.ConversationRowAudioPreview;
import com.whatsapp.search.views.itemviews.AudioPlayerView;

/* renamed from: X.Bvz  reason: case insensitive filesystem */
public class C24133Bvz extends C24136Bw2 {
    public ConversationRowAudioPreview A00;
    public C134196qC A01;
    public C18000vb A02;
    public AudioPlayerView A03;
    public AnonymousClass00H A04;
    public boolean A05;

    public static void A01(C24133Bvz bvz) {
        C441822l r9 = bvz.A09;
        DP1 dp1 = new DP1(bvz, 1);
        DP2 dp2 = new DP2(bvz, 1);
        AudioPlayerView audioPlayerView = bvz.A03;
        C23827Bqk bqk = new C23827Bqk(bvz.A00, dp1, dp2, audioPlayerView, bvz, dp2, 1);
        C27042DQn dQn = new C27042DQn(bvz, 0);
        C23827Bqk bqk2 = bqk;
        C26066Crg.A02(bqk2, bvz.A03, bvz.A02, r9, dQn, audioPlayerView);
    }

    public /* synthetic */ void A07(int i) {
        if (i == 0) {
            this.A03.getProgressBar().A04(8);
            A01(this);
        } else if (i != 1) {
            this.A03.getProgressBar().A04(8);
            this.A00.A01();
            this.A00.setDuration(C26066Crg.A01(this.A02, this.A09));
        } else {
            this.A00.A01();
            this.A00.setDuration(C88584aA.A02(this.A02, this.A09.A01));
            C88564a8.A01(this.A06, this.A09, this.A03.getProgressBar());
        }
    }
}
