package com.whatsapp.ptt;

import X.AnonymousClass00H;
import X.AnonymousClass11E;
import X.AnonymousClass1HF;
import X.AnonymousClass1KB;
import X.AnonymousClass1L9;
import X.AnonymousClass1LU;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3Ma;
import X.AnonymousClass7RB;
import X.C107615aJ;
import X.C122716Rq;
import X.C131606lN;
import X.C139436yq;
import X.C1407873b;
import X.C17880vN;
import X.C18030ve;
import X.C18070vi;
import X.C18600wl;
import X.C19830z4;
import X.C36401np;
import X.C72453Mb;
import X.C72473Md;
import X.C88534a3;
import X.C89714cu;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.whatsapp.WaImageButton;
import com.whatsapp.WaTextView;
import com.whatsapp.wds.components.button.WDSButton;

public final class TranscriptionOnboardingBottomSheetFragment extends Hilt_TranscriptionOnboardingBottomSheetFragment {
    public AnonymousClass1L9 A00;
    public AnonymousClass1KB A01;
    public WaTextView A02;
    public AnonymousClass11E A03;
    public C19830z4 A04;
    public C18030ve A05;
    public AnonymousClass1LU A06;
    public C131606lN A07;
    public C107615aJ A08;
    public C36401np A09;
    public C88534a3 A0A;
    public AnonymousClass00H A0B;
    public C18600wl A0C;
    public C18600wl A0D;
    public WaImageButton A0E;
    public WDSButton A0F;

    public void A21(Bundle bundle, View view) {
        String str;
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        C131606lN r1 = this.A07;
        if (r1 != null) {
            long j = ((((long) r1.A00(C122716Rq.TRANSCRIPTION, false).BV1().A00) + 1048576) - 1) / 1048576;
            WaTextView A0T = AnonymousClass3MW.A0T(view, 2131436406);
            this.A02 = A0T;
            if (A0T != null) {
                C36401np r7 = this.A09;
                if (r7 != null) {
                    SpannableStringBuilder A062 = r7.A06(A0T.getContext(), new AnonymousClass7RB((Object) this, 1), A1H(2131897097), "transcripts-learn-more", 2131102731);
                    C72473Md.A1D(A0T);
                    A0T.setText(A062);
                } else {
                    str = "linkifier";
                }
            }
            this.A0E = (WaImageButton) AnonymousClass1HF.A06(view, 2131436409);
            WDSButton A0q = AnonymousClass3MW.A0q(view, 2131436410);
            this.A0F = A0q;
            if (A0q != null) {
                A0q.setText(AnonymousClass3MX.A16(this, Long.valueOf(j), AnonymousClass3MW.A1a(), 0, 2131897099));
            }
            WaImageButton waImageButton = this.A0E;
            if (waImageButton != null) {
                AnonymousClass3Ma.A1A(waImageButton, this, 5);
            }
            WDSButton wDSButton = this.A0F;
            if (wDSButton != null) {
                wDSButton.setOnClickListener(new C89714cu(this, j, 2));
                return;
            }
            return;
        }
        str = "mlProviderFactory";
        C18070vi.A11(str);
        throw null;
    }

    public static final void A00(TranscriptionOnboardingBottomSheetFragment transcriptionOnboardingBottomSheetFragment, boolean z) {
        String str;
        C19830z4 r0 = transcriptionOnboardingBottomSheetFragment.A04;
        if (r0 != null) {
            C17880vN.A1F(C19830z4.A00(r0), "PREF_IS_DOWNLOAD_TRANSCRIPT_MODEL_WIFI_ONLY", z);
            C88534a3 r1 = transcriptionOnboardingBottomSheetFragment.A0A;
            if (r1 != null) {
                r1.A08(true);
                AnonymousClass00H r02 = transcriptionOnboardingBottomSheetFragment.A0B;
                if (r02 != null) {
                    ((C1407873b) r02.get()).A07(C122716Rq.TRANSCRIPTION);
                    AnonymousClass1KB r2 = transcriptionOnboardingBottomSheetFragment.A01;
                    if (r2 != null) {
                        r2.A0J(new AnonymousClass7RB((Object) transcriptionOnboardingBottomSheetFragment, 2));
                        transcriptionOnboardingBottomSheetFragment.A28();
                        return;
                    }
                    str = "globalUI";
                } else {
                    str = "mlModelManager";
                }
            } else {
                str = "pttTranscriptionConfig";
            }
        } else {
            str = "waSharedPreferences";
        }
        C18070vi.A11(str);
        throw null;
    }

    public void A1s() {
        WaImageButton waImageButton = this.A0E;
        if (waImageButton != null) {
            waImageButton.setOnClickListener((View.OnClickListener) null);
        }
        this.A0E = null;
        WDSButton wDSButton = this.A0F;
        if (wDSButton != null) {
            wDSButton.setOnClickListener((View.OnClickListener) null);
        }
        this.A0F = null;
        WaTextView waTextView = this.A02;
        if (waTextView != null) {
            waTextView.setOnClickListener((View.OnClickListener) null);
        }
        this.A02 = null;
        super.A1s();
    }

    public void A2I(C139436yq r1) {
        C72453Mb.A1N(r1);
    }

    public int A2F() {
        return 2131627229;
    }
}
