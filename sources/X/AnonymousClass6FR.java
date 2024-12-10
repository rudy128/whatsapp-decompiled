package X;

import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.6FR  reason: invalid class name */
public class AnonymousClass6FR extends AnonymousClass6Fc {
    public C24134Bw0 A00;
    public C88534a3 A01;
    public boolean A02;

    public /* bridge */ /* synthetic */ void A07(AnonymousClass1E7 r7, AnonymousClass1E7 r8, AnonymousClass206 r9, List list) {
        C441822l r5 = (C441822l) r9;
        super.A07(r7, r8, r5, list);
        setContentDescription(AnonymousClass72W.A02(getContext(), this.A02, this.A03, this.A05, this.A06, r5));
    }

    public void A09(CharSequence charSequence, CharSequence charSequence2) {
        C18030ve r2 = this.A01.A01;
        C18040vf r1 = C18040vf.A02;
        if (!C18020vd.A05(r1, r2, 2890) || !C18020vd.A05(r1, r2, 10286)) {
            super.A09(charSequence, charSequence2);
            return;
        }
        super.A09(charSequence, "");
        C24134Bw0 bw0 = this.A00;
        if (bw0 == null) {
            Log.e("SearchMessageVoiceNoteListItemView unexpected null voiceNoteAttachmentView");
        } else {
            bw0.setTranscriptionPreviewText(charSequence2);
        }
    }

    public void A0A(C441822l r2, List list) {
        super.A08(r2, list);
        this.A00.setAudioMessage(r2);
    }

    public void setVoiceNoteAttachmentView(C24134Bw0 bw0) {
        this.A00 = bw0;
    }
}
