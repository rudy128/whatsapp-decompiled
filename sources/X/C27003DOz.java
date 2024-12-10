package X;

import com.whatsapp.conversation.conversationrow.ConversationRowAudioPreview;
import com.whatsapp.search.views.itemviews.AudioPlayerView;

/* renamed from: X.DOz  reason: case insensitive filesystem */
public abstract class C27003DOz implements C160838Ad {
    public int A00 = -1;
    public final ConversationRowAudioPreview A01;
    public final C28529E6d A02;
    public final C28530E6e A03;
    public final AudioPlayerView A04;

    public void C0A(int i) {
        AudioPlayerView audioPlayerView = this.A04;
        audioPlayerView.setPlayButtonState(0);
        audioPlayerView.setSeekbarMax(BRX().A0D * 1000);
        audioPlayerView.setSeekbarProgress(i);
        audioPlayerView.setSeekbarContentDescription((long) i);
        this.A02.BsR(BRX().A0D);
        ConversationRowAudioPreview conversationRowAudioPreview = this.A01;
        if (conversationRowAudioPreview != null) {
            conversationRowAudioPreview.A01();
        }
    }

    public void C20(int i) {
        int i2 = i / 1000;
        if (this.A00 != i2) {
            this.A00 = i2;
            this.A02.BsR(i2);
        }
        AudioPlayerView audioPlayerView = this.A04;
        audioPlayerView.setSeekbarProgress(i);
        audioPlayerView.setSeekbarContentDescription((long) i);
    }

    public void C3y() {
        this.A04.setPlayButtonState(1);
        ConversationRowAudioPreview conversationRowAudioPreview = this.A01;
        if (conversationRowAudioPreview != null) {
            BEA.A1B(conversationRowAudioPreview);
        }
    }

    public void C6B(int i) {
        AudioPlayerView audioPlayerView = this.A04;
        audioPlayerView.setPlayButtonState(1);
        audioPlayerView.setSeekbarMax(i);
        this.A00 = -1;
        ConversationRowAudioPreview conversationRowAudioPreview = this.A01;
        if (conversationRowAudioPreview != null) {
            BEA.A1B(conversationRowAudioPreview);
        }
    }

    public void C70(int i, boolean z) {
        AudioPlayerView audioPlayerView = this.A04;
        audioPlayerView.setPlayButtonState(0);
        if (z) {
            audioPlayerView.setSeekbarProgress(0);
        }
        this.A02.BsR(i / 1000);
        ConversationRowAudioPreview conversationRowAudioPreview = this.A01;
        if (conversationRowAudioPreview != null) {
            conversationRowAudioPreview.A01();
        }
        this.A03.C5U(false);
    }

    public C27003DOz(ConversationRowAudioPreview conversationRowAudioPreview, C28529E6d e6d, C28530E6e e6e, AudioPlayerView audioPlayerView) {
        this.A04 = audioPlayerView;
        this.A02 = e6d;
        this.A03 = e6e;
        this.A01 = conversationRowAudioPreview;
    }
}
