package X;

import android.view.View;
import com.whatsapp.authentication.AppAuthSettingsActivity;
import com.whatsapp.ptt.TranscriptionOnboardingBottomSheetFragment;
import com.whatsapp.ptt.TranscriptionOnboardingBottomSheetFragment$onViewCreated$2$1;

/* renamed from: X.4cu  reason: invalid class name and case insensitive filesystem */
public class C89714cu implements View.OnClickListener {
    public final int A00;
    public final long A01;
    public final Object A02;

    public C89714cu(Object obj, long j, int i) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = j;
    }

    public final void onClick(View view) {
        switch (this.A00) {
            case 0:
                C17880vN.A1D(C19830z4.A00(((AppAuthSettingsActivity) this.A02).A0A), "privacy_fingerprint_timeout", this.A01);
                return;
            case 1:
                C79353vH r0 = (C79353vH) this.A02;
                r0.A02.invoke(r0.A01, Long.valueOf(this.A01));
                return;
            default:
                TranscriptionOnboardingBottomSheetFragment transcriptionOnboardingBottomSheetFragment = (TranscriptionOnboardingBottomSheetFragment) this.A02;
                long j = this.A01;
                C37581pm A002 = AnonymousClass2SS.A00(transcriptionOnboardingBottomSheetFragment);
                C18600wl r2 = transcriptionOnboardingBottomSheetFragment.A0C;
                if (r2 != null) {
                    AnonymousClass3MW.A1X(r2, new TranscriptionOnboardingBottomSheetFragment$onViewCreated$2$1(transcriptionOnboardingBottomSheetFragment, (C30391dr) null, j), A002);
                    return;
                } else {
                    AnonymousClass3MW.A1K();
                    throw null;
                }
        }
    }
}
