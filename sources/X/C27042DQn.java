package X;

import com.whatsapp.conversation.conversationrow.ConversationRowAudioPreview;
import com.whatsapp.conversation.ui.AudioPlayerMetadataView;

/* renamed from: X.DQn  reason: case insensitive filesystem */
public class C27042DQn implements C28539E6n {
    public final int A00;
    public final Object A01;

    public C27042DQn(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void C0o(int i, String str) {
        AudioPlayerMetadataView audioPlayerMetadataView;
        switch (this.A00) {
            case 0:
                C24133Bvz bvz = (C24133Bvz) this.A01;
                bvz.A00.setDuration(str);
                ConversationRowAudioPreview conversationRowAudioPreview = bvz.A00;
                if (i != 0) {
                    conversationRowAudioPreview.A01();
                    return;
                } else {
                    BEA.A1B(conversationRowAudioPreview);
                    return;
                }
            case 1:
                C18070vi.A0d(str, 2);
                audioPlayerMetadataView = ((C24135Bw1) this.A01).A04;
                if (audioPlayerMetadataView == null) {
                    C18070vi.A11("audioPlayerMetadataView");
                    throw null;
                }
                break;
            default:
                audioPlayerMetadataView = ((C24134Bw0) this.A01).A04;
                break;
        }
        audioPlayerMetadataView.setDescription(str);
    }
}
