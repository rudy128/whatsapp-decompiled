package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.conversation.ui.AudioPlayerMetadataView;
import com.whatsapp.search.views.itemviews.AudioPlayerView;
import com.whatsapp.search.views.itemviews.VoiceNoteProfileAvatarView;

/* renamed from: X.Bw0  reason: case insensitive filesystem */
public class C24134Bw0 extends C24136Bw2 {
    public AnonymousClass11S A00;
    public AnonymousClass1M9 A01;
    public C27201Vd A02;
    public C134196qC A03;
    public AudioPlayerMetadataView A04 = ((AudioPlayerMetadataView) AnonymousClass1HF.A06(this, 2131434967));
    public C18000vb A05;
    public C25931Qe A06;
    public C28537E6l A07;
    public CWL A08;
    public AudioPlayerView A09 = ((AudioPlayerView) AnonymousClass1HF.A06(this, 2131434966));
    public VoiceNoteProfileAvatarView A0A = ((VoiceNoteProfileAvatarView) AnonymousClass1HF.A06(this, 2131434968));
    public C28931bI A0B = C28931bI.A00(this, 2131434850);
    public AnonymousClass00H A0C;
    public boolean A0D;
    public boolean A0E;
    public final C37451pZ A0F;

    public static void A01(C24134Bw0 bw0) {
        DP1 dp1 = new DP1(bw0, 3);
        DP2 dp2 = new DP2(bw0, 3);
        AudioPlayerView audioPlayerView = bw0.A09;
        C23827Bqk bqk = new C23827Bqk(dp1, dp2, dp2, bw0, audioPlayerView);
        C441822l r10 = bw0.A09;
        C27042DQn dQn = new C27042DQn(bw0, 2);
        C23827Bqk bqk2 = bqk;
        C26066Crg.A02(bqk2, bw0.A03, bw0.A05, r10, dQn, audioPlayerView);
    }

    public C24134Bw0(Context context) {
        super(context);
        A04();
        this.A0F = this.A02.A05(context, "attachment-voice-note-audio-view");
        setOrientation(1);
        View.inflate(context, 2131626775, this);
        Drawable A002 = C24261Jm.A00(context, 2131232919);
        C17960vV.A07(A002);
        setBackground(AnonymousClass4aX.A08(A002, AnonymousClass3MZ.A02(getContext(), getContext(), 2130971095, 2131102422)));
        C24132Bvy bvy = new C24132Bvy(this, 3);
        C27043DQo dQo = new C27043DQo(this, 3);
        AudioPlayerView audioPlayerView = this.A09;
        audioPlayerView.setPlaybackListener(new AnonymousClass79X(this.A03, audioPlayerView, dQo, bvy, this.A0C));
        boolean A052 = C18020vd.A05(C18040vf.A02, this.A05, 1316);
        this.A0E = A052;
        if (A052) {
            this.A08 = this.A07.BGf(this.A0A);
            this.A0A.setOnFastPlaybackButtonClickListener(new C90064dT((Object) this, 12));
        }
    }

    public void setTranscriptionPreviewText(CharSequence charSequence) {
        int i;
        View view;
        if (TextUtils.isEmpty(charSequence)) {
            C28931bI r1 = this.A0B;
            if (r1.A0A()) {
                i = 8;
                view = r1.A02();
            } else {
                return;
            }
        } else {
            TextView textView = (TextView) this.A0B.A02();
            textView.setText(charSequence);
            i = 0;
            view = textView;
        }
        view.setVisibility(i);
    }
}
