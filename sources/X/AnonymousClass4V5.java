package X;

import android.content.Context;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.ptt.Hilt_TranscriptionOnboardingBottomSheetFragment;
import com.whatsapp.ptt.Hilt_TranscriptionOnboardingWithLanguageSelectionBottomSheetFragment;
import com.whatsapp.ptt.language.EnableTranscriptionUserActions$changeLanguageAndTranscribe$1;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4V5  reason: invalid class name */
public final class AnonymousClass4V5 {
    public final C25749ClJ A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final C18600wl A03;
    public final C18600wl A04;
    public final AnonymousClass1OX A05;

    public final void A00(Context context, List list) {
        C18070vi.A0d(list, 1);
        AnonymousClass3MW.A1X(this.A04, new EnableTranscriptionUserActions$changeLanguageAndTranscribe$1(context, this, list, (C30391dr) null), this.A05);
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [com.whatsapp.ptt.TranscriptionOnboardingBottomSheetFragment, com.whatsapp.ptt.Hilt_TranscriptionOnboardingBottomSheetFragment] */
    /* JADX WARNING: type inference failed for: r1v5, types: [com.whatsapp.ptt.TranscriptionOnboardingWithLanguageSelectionBottomSheetFragment, com.whatsapp.ptt.Hilt_TranscriptionOnboardingWithLanguageSelectionBottomSheetFragment] */
    public final void A01(Context context, List list) {
        DialogFragment dialogFragment;
        if (C18020vd.A05(C18040vf.A02, AnonymousClass3MX.A0y(this.A02).A01, 9215)) {
            AnonymousClass78A r0 = new AnonymousClass78A(this, context, list, 37);
            ? hilt_TranscriptionOnboardingWithLanguageSelectionBottomSheetFragment = new Hilt_TranscriptionOnboardingWithLanguageSelectionBottomSheetFragment();
            hilt_TranscriptionOnboardingWithLanguageSelectionBottomSheetFragment.A00 = r0;
            dialogFragment = hilt_TranscriptionOnboardingWithLanguageSelectionBottomSheetFragment;
        } else {
            C97604pk r02 = new C97604pk(this, list, 0);
            ? hilt_TranscriptionOnboardingBottomSheetFragment = new Hilt_TranscriptionOnboardingBottomSheetFragment();
            hilt_TranscriptionOnboardingBottomSheetFragment.A08 = r02;
            dialogFragment = hilt_TranscriptionOnboardingBottomSheetFragment;
        }
        C20098A7b.A01(dialogFragment, ((AnonymousClass1FL) AnonymousClass1L9.A01(context, AnonymousClass01E.class)).getSupportFragmentManager());
    }

    public final void A02(Context context, List list) {
        if (AnonymousClass3MX.A0y(this.A02).A09()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.A00.A02(new C24027BuE((C441822l) it.next(), true, false));
            }
            return;
        }
        A01(context, list);
    }

    public AnonymousClass4V5(C25749ClJ clJ, AnonymousClass00H r3, AnonymousClass00H r4, C18600wl r5, C18600wl r6, AnonymousClass1OX r7) {
        C18070vi.A0w(clJ, r3, r4, r7, r5);
        C18070vi.A0d(r6, 6);
        this.A00 = clJ;
        this.A05 = r7;
        this.A03 = r5;
        this.A04 = r6;
        this.A02 = r3;
        this.A01 = r4;
    }
}
