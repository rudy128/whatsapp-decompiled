package X;

import android.view.View;
import com.whatsapp.conversation.conversationrow.ConversationRowAudioPreview;
import com.whatsapp.search.views.itemviews.AudioPlayerView;

/* renamed from: X.Bqk  reason: case insensitive filesystem */
public class C23827Bqk extends C27003DOz {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23827Bqk(C28529E6d e6d, C28530E6e e6e, C24135Bw1 bw1, AudioPlayerView audioPlayerView) {
        super((ConversationRowAudioPreview) null, e6d, e6e, audioPlayerView);
        this.A00 = 2;
        this.A01 = e6e;
        this.A02 = bw1;
    }

    public C441822l BRX() {
        switch (this.A00) {
            case 0:
                return (C441822l) ((AnonymousClass21V) ((C79093uR) this.A01).A0I);
            case 2:
                C441822l r0 = ((C24136Bw2) this.A02).A09;
                C18070vi.A0X(r0);
                return r0;
            default:
                return ((C24136Bw2) this.A01).A09;
        }
    }

    public void BsS(boolean z) {
        View findViewById;
        Object obj;
        switch (this.A00) {
            case 0:
                if (((C145777Mo) this.A02).A0a == null && (findViewById = AnonymousClass3Ma.A05((C23820BqX) this.A01).findViewById(2131434215)) != null) {
                    new C28931bI(findViewById).A04(C72453Mb.A07(z ? 1 : 0));
                    return;
                }
                return;
            case 2:
                C145777Mo A002 = ((C24136Bw2) this.A02).A03.A00();
                if (A002 != null && A002.A0a == null) {
                    obj = this.A01;
                    break;
                } else {
                    return;
                }
                break;
            default:
                C145777Mo A003 = ((C24136Bw2) this.A01).A03.A00();
                if (A003 != null && A003.A0a == null) {
                    obj = this.A02;
                    break;
                } else {
                    return;
                }
        }
        ((C28530E6e) obj).C5U(z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: X.Bw0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: X.Bw1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: X.Bw0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: X.Bw0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void C70(int r5, boolean r6) {
        /*
            r4 = this;
            int r0 = r4.A00
            switch(r0) {
                case 2: goto L_0x0009;
                case 3: goto L_0x001f;
                default: goto L_0x0005;
            }
        L_0x0005:
            super.C70(r5, r6)
        L_0x0008:
            return
        L_0x0009:
            super.C70(r5, r6)
            java.lang.Object r1 = r4.A02
            X.Bw1 r1 = (X.C24135Bw1) r1
            boolean r0 = r1.A0D
            if (r0 == 0) goto L_0x0008
            com.whatsapp.search.views.itemviews.VoiceNoteProfileAvatarView r3 = r1.A0A
            if (r3 != 0) goto L_0x002c
            java.lang.String r0 = "newsletterAudioProfileAvatarView"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x001f:
            super.C70(r5, r6)
            java.lang.Object r1 = r4.A01
            X.Bw0 r1 = (X.C24134Bw0) r1
            boolean r0 = r1.A0E
            if (r0 == 0) goto L_0x0008
            com.whatsapp.search.views.itemviews.VoiceNoteProfileAvatarView r3 = r1.A0A
        L_0x002c:
            X.22l r0 = r1.A09
            X.205 r0 = r0.A0v
            boolean r2 = r0.A02
            X.1BI r0 = r0.A00
            boolean r1 = X.C22971Dz.A0e(r0)
            r0 = 0
            r3.A03(r0, r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23827Bqk.C70(int, boolean):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23827Bqk(C28529E6d e6d, C28530E6e e6e, C28530E6e e6e2, C24134Bw0 bw0, AudioPlayerView audioPlayerView) {
        super((ConversationRowAudioPreview) null, e6d, e6e, audioPlayerView);
        this.A00 = 3;
        this.A01 = bw0;
        this.A02 = e6e2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23827Bqk(ConversationRowAudioPreview conversationRowAudioPreview, C28529E6d e6d, C28530E6e e6e, AudioPlayerView audioPlayerView, Object obj, Object obj2, int i) {
        super(conversationRowAudioPreview, e6d, e6e, audioPlayerView);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }
}
