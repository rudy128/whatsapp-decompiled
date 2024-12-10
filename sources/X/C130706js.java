package X;

import android.view.View;
import com.whatsapp.WaImageView;
import com.whatsapp.metaai.voice.ui.MetaAiSpeechIndicatorView;
import com.whatsapp.metaai.voice.ui.MetaAiVoiceViewModel;

/* renamed from: X.6js  reason: invalid class name and case insensitive filesystem */
public final class C130706js {
    public View A00;
    public WaImageView A01;
    public WaImageView A02;
    public WaImageView A03;
    public WaImageView A04;
    public final MetaAiSpeechIndicatorView A05;
    public final AnonymousClass6UR A06;
    public final C1407472v A07;
    public final MetaAiVoiceViewModel A08;

    public C130706js(View view, AnonymousClass1F9 r5, MetaAiSpeechIndicatorView metaAiSpeechIndicatorView, AnonymousClass6UR r7, C1407472v r8, MetaAiVoiceViewModel metaAiVoiceViewModel) {
        C18070vi.A0d(metaAiVoiceViewModel, 3);
        this.A08 = metaAiVoiceViewModel;
        this.A06 = r7;
        this.A05 = metaAiSpeechIndicatorView;
        this.A07 = r8;
        this.A00 = AnonymousClass1HF.A06(view, 2131436860);
        this.A03 = AnonymousClass3MW.A0R(view, 2131435542);
        this.A04 = AnonymousClass3MW.A0R(view, 2131436875);
        this.A01 = AnonymousClass3MW.A0R(view, 2131436876);
        this.A02 = AnonymousClass3MW.A0R(view, 2131436877);
        WaImageView waImageView = this.A01;
        if (waImageView != null) {
            C90054dS.A00(waImageView, this, 7);
        }
        WaImageView waImageView2 = this.A02;
        if (waImageView2 != null) {
            C90054dS.A00(waImageView2, this, 8);
        }
        WaImageView waImageView3 = this.A03;
        if (waImageView3 != null) {
            C90054dS.A00(waImageView3, this, 9);
        }
        WaImageView waImageView4 = this.A04;
        if (waImageView4 != null) {
            C90054dS.A00(waImageView4, this, 10);
        }
        AnonymousClass7AT.A01(r5, C108945cZ.A0Q(metaAiVoiceViewModel.A0X), C108945cZ.A1K(this, 24), 43);
        AnonymousClass7AT.A01(r5, metaAiVoiceViewModel.A0N, C108945cZ.A1K(this, 25), 43);
        AnonymousClass7AT.A01(r5, metaAiVoiceViewModel.A0O, C108945cZ.A1K(this, 26), 43);
    }
}
