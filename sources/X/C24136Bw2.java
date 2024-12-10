package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.search.views.itemviews.AudioPlayerView;
import com.whatsapp.search.views.itemviews.VoiceNoteProfileAvatarView;

/* renamed from: X.Bw2  reason: case insensitive filesystem */
public abstract class C24136Bw2 extends C22660BIs {
    public AnonymousClass1KB A00;
    public C34531kd A01;
    public C33251iW A02;
    public C31131f4 A03;
    public C219217x A04;
    public C18030ve A05;
    public C32861hs A06;
    public C32431hB A07;
    public C139246yW A08;
    public C441822l A09;
    public C32021gV A0A;
    public AnonymousClass00H A0B;
    public AnonymousClass00H A0C;
    public final View.OnClickListener A0D = new C90064dT((Object) this, 13);
    public final C38471rL A0E = new AnonymousClass48o(this, 22);
    public final C38471rL A0F = new AnonymousClass48o(this, 20);
    public final C38471rL A0G = new AnonymousClass48o(this, 21);

    public void A05() {
        if (this instanceof C24134Bw0) {
            C24134Bw0 bw0 = (C24134Bw0) this;
            C145777Mo A002 = bw0.A03.A00(AnonymousClass3Ma.A05(bw0), bw0.A09, false);
            A002.A0D(bw0.A09);
            boolean z = bw0.A0E;
            A002.A0G(z);
            if (z && A002.A14) {
                VoiceNoteProfileAvatarView voiceNoteProfileAvatarView = bw0.A0A;
                int i = C145777Mo.A15;
                AnonymousClass205 r0 = bw0.A09.A0v;
                voiceNoteProfileAvatarView.A02(i, true, r0.A02, C22971Dz.A0e(r0.A00));
            }
            C24134Bw0.A01(bw0);
        } else if (this instanceof C24135Bw1) {
            C24135Bw1 bw1 = (C24135Bw1) this;
            C145777Mo A003 = bw1.getMessageAudioPlayerFactory().A00(AnonymousClass3Ma.A05(bw1), bw1.A09, false);
            C18070vi.A0X(A003);
            A003.A0D(bw1.A09);
            boolean z2 = bw1.A0D;
            A003.A0G(z2);
            if (z2 && A003.A14) {
                VoiceNoteProfileAvatarView voiceNoteProfileAvatarView2 = bw1.A0A;
                if (voiceNoteProfileAvatarView2 == null) {
                    C18070vi.A11("newsletterAudioProfileAvatarView");
                    throw null;
                }
                int i2 = C145777Mo.A15;
                AnonymousClass205 r02 = bw1.A09.A0v;
                voiceNoteProfileAvatarView2.A02(i2, true, r02.A02, C22971Dz.A0e(r02.A00));
            }
            C24135Bw1.A01(bw1);
        } else {
            C24133Bvz bvz = (C24133Bvz) this;
            C145777Mo A004 = bvz.A01.A00(AnonymousClass3Ma.A05(bvz), bvz.A09, false);
            A004.A0I = new DP0(bvz, 1);
            A004.A0D(bvz.A09);
            A004.A0G(false);
            C24133Bvz.A01(bvz);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0123, code lost:
        if (r1.A0G == null) goto L_0x0125;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0252, code lost:
        if (r0 == null) goto L_0x0254;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x02d3, code lost:
        if (r1.A0G == null) goto L_0x02d5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x02ad  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06() {
        /*
            r12 = this;
            boolean r0 = r12 instanceof X.C24134Bw0
            if (r0 == 0) goto L_0x0152
            r5 = r12
            X.Bw0 r5 = (X.C24134Bw0) r5
            X.22l r9 = r5.A09
            com.whatsapp.search.views.itemviews.AudioPlayerView r4 = r5.A09
            X.1rL r8 = r5.A0E
            X.1rL r7 = r5.A0G
            X.1rL r6 = r5.A0F
            android.view.View$OnClickListener r2 = r5.A0D
            X.2rc r1 = r9.A02
            X.C17960vV.A07(r1)
            boolean r0 = X.AnonymousClass25A.A11(r9)
            r3 = 0
            if (r0 == 0) goto L_0x00f9
            r0 = 4
            r4.setPlayButtonState(r0)
            r4.setOnControlButtonClickListener(r8)
            r4.setSeekbarProgress(r3)
            com.whatsapp.conversation.ui.AudioPlayerMetadataView r6 = r5.A04
            X.0vb r2 = r5.A05
            X.22l r0 = r5.A09
            long r0 = r0.A01
            java.lang.String r0 = X.C88584aA.A02(r2, r0)
            r6.setDescription(r0)
            X.1hs r2 = r5.A06
            X.1bI r1 = r4.getProgressBar()
            X.22l r0 = r5.A09
            X.C88564a8.A01(r2, r0, r1)
        L_0x0043:
            com.whatsapp.search.views.itemviews.VoiceNoteProfileAvatarView r2 = r5.A0A
            android.content.Context r6 = r5.getContext()
            r1 = 2130971095(0x7f0409d7, float:1.7550919E38)
            r0 = 2131102422(0x7f060ad6, float:1.7817281E38)
            int r0 = X.AnonymousClass1YL.A00(r6, r1, r0)
            r2.setupIconBackgroundColor(r0)
            X.22l r0 = r5.A09
            X.AnonymousClass72W.A03(r0, r4, r2)
            boolean r7 = r5.A0E
            if (r7 == 0) goto L_0x006e
            X.22l r0 = r5.A09
            X.205 r0 = r0.A0v
            boolean r1 = r0.A02
            X.1BI r0 = r0.A00
            boolean r0 = X.C22971Dz.A0e(r0)
            r2.A03(r3, r3, r1, r0)
        L_0x006e:
            X.22l r0 = r5.A09
            boolean r0 = r0.A1J()
            if (r0 == 0) goto L_0x00a5
            r1 = 1
            r0 = 4
            r2.A04(r1, r0)
        L_0x007b:
            X.00H r0 = r5.A0C
            java.lang.Object r2 = r0.get()
            X.8AF r2 = (X.AnonymousClass8AF) r2
            X.22l r0 = r5.A09
            long r0 = r0.A0x
            int r0 = r2.BXk(r0)
            if (r0 < 0) goto L_0x0090
            r4.setSeekbarProgress(r0)
        L_0x0090:
            if (r7 == 0) goto L_0x00a4
            X.22l r2 = r5.A09
            r0 = 32768(0x8000, double:1.61895E-319)
            boolean r0 = r2.A11(r0)
            if (r0 != 0) goto L_0x02ee
            r0 = 0
            r4.setTag(r0)
            r4.A02()
        L_0x00a4:
            return
        L_0x00a5:
            r2.setIsForwardedByNonAuthorPttUi(r3)
            android.widget.ImageView r8 = r2.A04
            X.22l r9 = r5.A09
            X.205 r1 = r9.A0v
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x00c2
            X.1pZ r1 = r5.A0F
            X.11S r0 = r5.A00
            r0.A0I()
            X.1E8 r0 = r0.A0D
            X.C17960vV.A07(r0)
        L_0x00be:
            r1.A07(r8, r0)
            goto L_0x007b
        L_0x00c2:
            android.widget.ImageView r6 = r2.A02
            X.1BI r2 = r1.A00
            X.C17960vV.A07(r2)
            boolean r1 = X.C22971Dz.A0e(r2)
            r0 = 8
            if (r1 == 0) goto L_0x00ea
            X.1BI r2 = r9.A0H()
            X.C17960vV.A07(r2)
            r6.setVisibility(r3)
            r8.setVisibility(r0)
            X.1pZ r1 = r5.A0F
            X.1M9 r0 = r5.A01
            X.1E7 r0 = r0.A0H(r2)
            r1.A07(r6, r0)
            goto L_0x007b
        L_0x00ea:
            r6.setVisibility(r0)
            r8.setVisibility(r3)
            X.1pZ r1 = r5.A0F
            X.1M9 r0 = r5.A01
            X.1E7 r0 = r0.A0H(r2)
            goto L_0x00be
        L_0x00f9:
            boolean r0 = X.AnonymousClass25A.A12(r9)
            if (r0 == 0) goto L_0x0116
            X.BEB.A13(r1, r9)
            A03(r4)
            r4.setOnControlButtonClickListener(r2)
            r1 = 8
            X.1bI r0 = r4.getProgressBar()
            r0.A04(r1)
            X.C24134Bw0.A01(r5)
            goto L_0x0043
        L_0x0116:
            X.2rc r1 = r9.A02
            X.205 r0 = r9.A0v
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0125
            if (r1 == 0) goto L_0x0125
            java.io.File r0 = r1.A0G
            r2 = 1
            if (r0 != 0) goto L_0x0126
        L_0x0125:
            r2 = 0
        L_0x0126:
            r1 = 2
            r0 = 3
            if (r2 == 0) goto L_0x014b
            r4.setPlayButtonState(r1)
            r4.setOnControlButtonClickListener(r7)
        L_0x0130:
            A03(r4)
            r1 = 8
            X.1bI r0 = r4.getProgressBar()
            r0.A04(r1)
            com.whatsapp.conversation.ui.AudioPlayerMetadataView r2 = r5.A04
            X.22l r1 = r5.A09
            X.0vb r0 = r5.A05
            java.lang.String r0 = X.C26066Crg.A01(r0, r1)
            r2.setDescription(r0)
            goto L_0x0043
        L_0x014b:
            r4.setPlayButtonState(r0)
            r4.setOnControlButtonClickListener(r6)
            goto L_0x0130
        L_0x0152:
            boolean r0 = r12 instanceof X.C24135Bw1
            if (r0 == 0) goto L_0x0272
            r4 = r12
            X.Bw1 r4 = (X.C24135Bw1) r4
            X.22l r10 = r4.A09
            com.whatsapp.search.views.itemviews.AudioPlayerView r3 = r4.A09
            java.lang.String r0 = "audioPlayerView"
            r5 = 0
            if (r3 == 0) goto L_0x0322
            X.1rL r9 = r4.A0E
            X.1rL r8 = r4.A0G
            X.1rL r6 = r4.A0F
            android.view.View$OnClickListener r2 = r4.A0D
            X.2rc r1 = r10.A02
            X.C17960vV.A07(r1)
            boolean r0 = X.AnonymousClass25A.A11(r10)
            r7 = 0
            if (r0 == 0) goto L_0x0231
            r0 = 4
            r3.setPlayButtonState(r0)
            r3.setOnControlButtonClickListener(r9)
            r3.setSeekbarProgress(r7)
            r2 = 1
        L_0x0181:
            X.C24135Bw1.A02(r4, r2)
        L_0x0184:
            com.whatsapp.search.views.itemviews.VoiceNoteProfileAvatarView r2 = r4.A0A
            java.lang.String r0 = "newsletterAudioProfileAvatarView"
            if (r2 == 0) goto L_0x0322
            android.content.Context r6 = r4.getContext()
            r1 = 2130971095(0x7f0409d7, float:1.7550919E38)
            r0 = 2131102422(0x7f060ad6, float:1.7817281E38)
            int r0 = X.AnonymousClass1YL.A00(r6, r1, r0)
            r2.setupIconBackgroundColor(r0)
            X.22l r0 = r4.A09
            X.AnonymousClass72W.A03(r0, r3, r2)
            boolean r6 = r4.A0D
            if (r6 == 0) goto L_0x01b3
            X.22l r0 = r4.A09
            X.205 r0 = r0.A0v
            boolean r1 = r0.A02
            X.1BI r0 = r0.A00
            boolean r0 = X.C22971Dz.A0e(r0)
            r2.A03(r7, r7, r1, r0)
        L_0x01b3:
            X.22l r0 = r4.A09
            r2.setIsNewsletterAudioOrPttUi(r0)
            r11 = 0
            r2.setIsForwardedByNonAuthorPttUi(r7)
            android.widget.ImageView r10 = r2.A04
            X.C18070vi.A0X(r10)
            android.widget.ImageView r9 = r2.A02
            X.C18070vi.A0X(r9)
            X.22l r1 = r4.A09
            X.205 r0 = r1.A0v
            X.1BI r0 = r0.A00
            boolean r8 = X.C22971Dz.A0e(r0)
            r7 = r10
            if (r8 == 0) goto L_0x01d4
            r7 = r9
        L_0x01d4:
            X.Ac1 r1 = X.AnonymousClass9RY.A00(r1)
            X.22l r0 = r4.A09
            X.205 r0 = r0.A0v
            X.1BI r2 = r0.A00
            X.C17960vV.A07(r2)
            X.C18070vi.A0X(r2)
            if (r1 == 0) goto L_0x01eb
            X.1ch r2 = r1.A01
            X.C17960vV.A07(r2)
        L_0x01eb:
            int r0 = X.C72453Mb.A07(r8)
            r9.setVisibility(r0)
            if (r8 == 0) goto L_0x01f6
            r11 = 8
        L_0x01f6:
            r10.setVisibility(r11)
            X.1pZ r1 = r4.A0E
            X.1M9 r0 = r4.getContactManager()
            X.1E7 r0 = r0.A0H(r2)
            r1.A07(r7, r0)
            X.00H r0 = r4.getPttSavedPlaybackPositionControllerLazy()
            java.lang.Object r2 = r0.get()
            X.8AF r2 = (X.AnonymousClass8AF) r2
            X.22l r0 = r4.A09
            long r0 = r0.A0x
            int r0 = r2.BXk(r0)
            if (r0 < 0) goto L_0x021d
            r3.setSeekbarProgress(r0)
        L_0x021d:
            if (r6 == 0) goto L_0x00a4
            X.22l r2 = r4.A09
            r0 = 32768(0x8000, double:1.61895E-319)
            boolean r0 = r2.A11(r0)
            if (r0 != 0) goto L_0x0307
            r3.setTag(r5)
            r3.A02()
            return
        L_0x0231:
            boolean r0 = X.AnonymousClass25A.A12(r10)
            if (r0 == 0) goto L_0x0245
            X.BEB.A13(r1, r10)
            A03(r3)
            r3.setOnControlButtonClickListener(r2)
            X.C24135Bw1.A02(r4, r7)
            goto L_0x0184
        L_0x0245:
            X.2rc r1 = r10.A02
            X.205 r0 = r10.A0v
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0254
            if (r1 == 0) goto L_0x0254
            java.io.File r0 = r1.A0G
            r1 = 1
            if (r0 != 0) goto L_0x0255
        L_0x0254:
            r1 = 0
        L_0x0255:
            r0 = 2
            r2 = 3
            if (r1 == 0) goto L_0x0264
            r3.setPlayButtonState(r0)
            r3.setOnControlButtonClickListener(r8)
            A03(r3)
            goto L_0x0181
        L_0x0264:
            r3.setPlayButtonState(r2)
            r3.setOnControlButtonClickListener(r6)
            A03(r3)
            X.C24135Bw1.A02(r4, r0)
            goto L_0x0184
        L_0x0272:
            r3 = r12
            X.Bvz r3 = (X.C24133Bvz) r3
            X.22l r9 = r3.A09
            com.whatsapp.search.views.itemviews.AudioPlayerView r6 = r3.A03
            X.1rL r8 = r3.A0E
            X.1rL r7 = r3.A0G
            X.1rL r5 = r3.A0F
            android.view.View$OnClickListener r4 = r3.A0D
            X.2rc r1 = r9.A02
            X.C17960vV.A07(r1)
            boolean r0 = X.AnonymousClass25A.A11(r9)
            r2 = 0
            if (r0 == 0) goto L_0x02b3
            r0 = 4
            r6.setPlayButtonState(r0)
            r6.setOnControlButtonClickListener(r8)
            r6.setSeekbarProgress(r2)
            r1 = 1
        L_0x0298:
            r3.A07(r1)
        L_0x029b:
            X.00H r0 = r3.A04
            java.lang.Object r2 = r0.get()
            X.8AF r2 = (X.AnonymousClass8AF) r2
            X.22l r0 = r3.A09
            long r0 = r0.A0x
            int r1 = r2.BXk(r0)
            if (r1 < 0) goto L_0x00a4
            com.whatsapp.search.views.itemviews.AudioPlayerView r0 = r3.A03
            r0.setSeekbarProgress(r1)
            return
        L_0x02b3:
            boolean r0 = X.AnonymousClass25A.A12(r9)
            if (r0 == 0) goto L_0x02c6
            X.BEB.A13(r1, r9)
            A03(r6)
            r6.setOnControlButtonClickListener(r4)
        L_0x02c2:
            r3.A07(r2)
            goto L_0x029b
        L_0x02c6:
            X.2rc r1 = r9.A02
            X.205 r0 = r9.A0v
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x02d5
            if (r1 == 0) goto L_0x02d5
            java.io.File r1 = r1.A0G
            r0 = 1
            if (r1 != 0) goto L_0x02d6
        L_0x02d5:
            r0 = 0
        L_0x02d6:
            r1 = 2
            r2 = 3
            if (r0 == 0) goto L_0x02e4
            r6.setPlayButtonState(r1)
            r6.setOnControlButtonClickListener(r7)
            A03(r6)
            goto L_0x02c2
        L_0x02e4:
            r6.setPlayButtonState(r2)
            r6.setOnControlButtonClickListener(r5)
            A03(r6)
            goto L_0x0298
        L_0x02ee:
            X.205 r0 = r2.A0v
            r4.setTag(r0)
            X.1Qe r4 = r5.A06
            X.22l r2 = r5.A09
            r0 = 21
            X.7Qo r1 = new X.7Qo
            r1.<init>((java.lang.Object) r5, (int) r0)
            X.C18070vi.A0d(r2, r3)
            X.1Om r0 = X.C25511Om.A00
            r4.A06(r2, r1, r0)
            return
        L_0x0307:
            X.205 r0 = r2.A0v
            r3.setTag(r0)
            X.1Qe r3 = r4.getFMessageLazyManager()
            X.22l r2 = r4.A09
            X.C18070vi.A0W(r2)
            r0 = 20
            X.7Qo r1 = new X.7Qo
            r1.<init>((java.lang.Object) r4, (int) r0)
            X.1Om r0 = X.C25511Om.A00
            r3.A06(r2, r1, r0)
            return
        L_0x0322:
            X.C18070vi.A11(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24136Bw2.A06():void");
    }

    public C441822l getFMessageAudio() {
        return this.A09;
    }

    public final void setAudioMessage(C441822l r1) {
        this.A09 = r1;
        A06();
    }

    public C24136Bw2(Context context) {
        super(context);
        A04();
    }

    public static void A03(AudioPlayerView audioPlayerView) {
        audioPlayerView.setSeekbarColor(C19740yt.A00(audioPlayerView.getContext(), 2131101947));
    }
}
