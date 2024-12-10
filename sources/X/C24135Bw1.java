package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.whatsapp.conversation.ui.AudioPlayerMetadataView;
import com.whatsapp.search.views.itemviews.AudioPlayerView;
import com.whatsapp.search.views.itemviews.VoiceNoteProfileAvatarView;
import java.util.List;

/* renamed from: X.Bw1  reason: case insensitive filesystem */
public final class C24135Bw1 extends C24136Bw2 {
    public AnonymousClass11S A00;
    public AnonymousClass1M9 A01;
    public C27201Vd A02;
    public C134196qC A03;
    public AudioPlayerMetadataView A04 = ((AudioPlayerMetadataView) C18070vi.A05(this, 2131434962));
    public C18000vb A05;
    public C25931Qe A06;
    public C28537E6l A07;
    public CWL A08;
    public AudioPlayerView A09 = ((AudioPlayerView) C18070vi.A05(this, 2131434961));
    public VoiceNoteProfileAvatarView A0A = ((VoiceNoteProfileAvatarView) C18070vi.A05(this, 2131434963));
    public AnonymousClass00H A0B;
    public boolean A0C;
    public boolean A0D;
    public final C37451pZ A0E;

    public static final void A01(C24135Bw1 bw1) {
        DP1 dp1 = new DP1(bw1, 2);
        DP2 dp2 = new DP2(bw1, 2);
        AudioPlayerView audioPlayerView = bw1.A09;
        if (audioPlayerView == null) {
            C18070vi.A11("audioPlayerView");
            throw null;
        }
        C23827Bqk bqk = new C23827Bqk(dp1, dp2, bw1, audioPlayerView);
        C441822l r6 = bw1.A09;
        C27042DQn dQn = new C27042DQn(bw1, 1);
        C26066Crg.A02(bqk, bw1.A03, bw1.getWhatsAppLocale(), r6, dQn, audioPlayerView);
    }

    public static final void setUpViewBasedOnMessageState$lambda$3(C24135Bw1 bw1) {
        List A11;
        C18070vi.A0d(bw1, 0);
        AudioPlayerView audioPlayerView = bw1.A09;
        if (audioPlayerView == null) {
            C18070vi.A11("audioPlayerView");
            throw null;
        } else if (audioPlayerView.getTag() != null && C18070vi.A18(bw1.A09.A0v, audioPlayerView.getTag())) {
            C441822l r0 = bw1.A09;
            C18070vi.A0W(r0);
            AnonymousClass7LG r02 = (AnonymousClass7LG) r0.A00.A02;
            if (r02 != null && (A11 = AnonymousClass3MW.A11(r02.A06)) != null) {
                audioPlayerView.A03(A11);
            }
        }
    }

    public final void setContactManager(AnonymousClass1M9 r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public final void setContactPhotos(C27201Vd r2) {
        C18070vi.A0d(r2, 0);
        this.A02 = r2;
    }

    public final void setFMessageLazyManager(C25931Qe r2) {
        C18070vi.A0d(r2, 0);
        this.A06 = r2;
    }

    public final void setMeManager(AnonymousClass11S r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public final void setMessageAudioPlayerFactory(C134196qC r2) {
        C18070vi.A0d(r2, 0);
        this.A03 = r2;
    }

    public final void setPttFastPlaybackControllerFactory(C28537E6l e6l) {
        C18070vi.A0d(e6l, 0);
        this.A07 = e6l;
    }

    public final void setPttSavedPlaybackPositionControllerLazy(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A0B = r2;
    }

    public final void setWhatsAppLocale(C18000vb r2) {
        C18070vi.A0d(r2, 0);
        this.A05 = r2;
    }

    public static final void A02(C24135Bw1 bw1, int i) {
        if (i != 0) {
            if (i != 1) {
                AudioPlayerView audioPlayerView = bw1.A09;
                if (audioPlayerView != null) {
                    audioPlayerView.getProgressBar().A04(8);
                    AudioPlayerMetadataView audioPlayerMetadataView = bw1.A04;
                    if (audioPlayerMetadataView != null) {
                        audioPlayerMetadataView.setDescription(C26066Crg.A01(bw1.getWhatsAppLocale(), bw1.A09));
                        return;
                    }
                }
            } else {
                AudioPlayerMetadataView audioPlayerMetadataView2 = bw1.A04;
                if (audioPlayerMetadataView2 != null) {
                    audioPlayerMetadataView2.setDescription(C88584aA.A02(bw1.getWhatsAppLocale(), bw1.A09.A01));
                    C32861hs r2 = bw1.A06;
                    AudioPlayerView audioPlayerView2 = bw1.A09;
                    if (audioPlayerView2 != null) {
                        C88564a8.A01(r2, bw1.A09, audioPlayerView2.getProgressBar());
                        return;
                    }
                }
            }
            C18070vi.A11("audioPlayerMetadataView");
            throw null;
        }
        AudioPlayerView audioPlayerView3 = bw1.A09;
        if (audioPlayerView3 != null) {
            audioPlayerView3.getProgressBar().A04(8);
            A01(bw1);
            return;
        }
        C18070vi.A11("audioPlayerView");
        throw null;
    }

    public final AnonymousClass1M9 getContactManager() {
        AnonymousClass1M9 r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("contactManager");
        throw null;
    }

    public final C27201Vd getContactPhotos() {
        C27201Vd r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("contactPhotos");
        throw null;
    }

    public final C25931Qe getFMessageLazyManager() {
        C25931Qe r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("fMessageLazyManager");
        throw null;
    }

    public final AnonymousClass11S getMeManager() {
        AnonymousClass11S r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("meManager");
        throw null;
    }

    public final C134196qC getMessageAudioPlayerFactory() {
        C134196qC r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("messageAudioPlayerFactory");
        throw null;
    }

    public final C28537E6l getPttFastPlaybackControllerFactory() {
        C28537E6l e6l = this.A07;
        if (e6l != null) {
            return e6l;
        }
        C18070vi.A11("pttFastPlaybackControllerFactory");
        throw null;
    }

    public final AnonymousClass00H getPttSavedPlaybackPositionControllerLazy() {
        AnonymousClass00H r0 = this.A0B;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("pttSavedPlaybackPositionControllerLazy");
        throw null;
    }

    public final C18000vb getWhatsAppLocale() {
        C18000vb r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("whatsAppLocale");
        throw null;
    }

    public C24135Bw1(Context context) {
        super(context);
        A04();
        this.A0E = getContactPhotos().A05(context, "attachment-newsletter-audio-view");
        setOrientation(0);
        setGravity(16);
        View.inflate(context, 2131626773, this);
        Drawable A002 = C24261Jm.A00(context, 2131232919);
        C17960vV.A07(A002);
        setBackground(AnonymousClass4aX.A08(A002, AnonymousClass3MZ.A02(getContext(), getContext(), 2130971095, 2131102422)));
        C24132Bvy bvy = new C24132Bvy(this, 2);
        C27043DQo dQo = new C27043DQo(this, 2);
        AudioPlayerView audioPlayerView = this.A09;
        String str = "audioPlayerView";
        if (audioPlayerView != null) {
            AnonymousClass79X r4 = new AnonymousClass79X(this.A03, audioPlayerView, dQo, bvy, getPttSavedPlaybackPositionControllerLazy());
            AudioPlayerView audioPlayerView2 = this.A09;
            if (audioPlayerView2 != null) {
                audioPlayerView2.setPlaybackListener(r4);
                boolean A052 = C18020vd.A05(C18040vf.A02, this.A05, 1316);
                this.A0D = A052;
                if (A052) {
                    C28537E6l pttFastPlaybackControllerFactory = getPttFastPlaybackControllerFactory();
                    VoiceNoteProfileAvatarView voiceNoteProfileAvatarView = this.A0A;
                    str = "newsletterAudioProfileAvatarView";
                    if (voiceNoteProfileAvatarView != null) {
                        this.A08 = pttFastPlaybackControllerFactory.BGf(voiceNoteProfileAvatarView);
                        VoiceNoteProfileAvatarView voiceNoteProfileAvatarView2 = this.A0A;
                        if (voiceNoteProfileAvatarView2 != null) {
                            voiceNoteProfileAvatarView2.setOnFastPlaybackButtonClickListener(new C90064dT((Object) this, 11));
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
        }
        C18070vi.A11(str);
        throw null;
    }
}
