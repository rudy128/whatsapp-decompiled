package com.whatsapp.status;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass1AP;
import X.AnonymousClass1FL;
import X.AnonymousClass1KB;
import X.AnonymousClass1KW;
import X.AnonymousClass1W2;
import X.AnonymousClass205;
import X.AnonymousClass206;
import X.AnonymousClass4a6;
import X.AnonymousClass4aU;
import X.C010105w;
import X.C126466cm;
import X.C18070vi;
import X.C33251iW;
import X.C73203Rj;
import X.C83954Hh;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment;

public final class StatusDeleteDialogFragment extends Hilt_StatusDeleteDialogFragment {
    public AnonymousClass1KB A00;
    public C33251iW A01;
    public AnonymousClass1KW A02;
    public AnonymousClass00H A03;
    public StatusPlaybackContactFragment A04;

    public void onDismiss(DialogInterface dialogInterface) {
        C18070vi.A0d(dialogInterface, 0);
        super.onDismiss(dialogInterface);
        StatusPlaybackContactFragment statusPlaybackContactFragment = this.A04;
        if (statusPlaybackContactFragment != null) {
            statusPlaybackContactFragment.BrY(false);
        }
    }

    public Dialog A27(Bundle bundle) {
        String str;
        StatusPlaybackContactFragment statusPlaybackContactFragment = this.A04;
        if (statusPlaybackContactFragment != null) {
            statusPlaybackContactFragment.BrY(true);
        }
        AnonymousClass205 A032 = AnonymousClass4aU.A03(A15(), "");
        AnonymousClass00H r0 = this.A03;
        if (r0 != null) {
            AnonymousClass206 A012 = AnonymousClass1W2.A01(A032, r0);
            if (A012 != null) {
                AnonymousClass1FL A1B = A1B();
                if (A1B != null) {
                    AnonymousClass1KB r6 = this.A00;
                    if (r6 != null) {
                        AnonymousClass1KW r8 = this.A02;
                        if (r8 != null) {
                            C33251iW r7 = this.A01;
                            if (r7 != null) {
                                C010105w A002 = C83954Hh.A00(A1B, r6, r7, r8, (C126466cm) null, AnonymousClass1AP.A03(A012));
                                if (A002 != null) {
                                    return A002;
                                }
                            } else {
                                str = "userActions";
                            }
                        } else {
                            str = "emojiLoader";
                        }
                    } else {
                        str = "globalUI";
                    }
                } else {
                    throw AnonymousClass000.A0k("Required value was null.");
                }
            }
            AnonymousClass1FL A1B2 = A1B();
            if (A1B2 != null) {
                C73203Rj A003 = AnonymousClass4a6.A00(A1B2);
                A003.A0D(2131896336);
                return A003.create();
            }
            throw AnonymousClass000.A0k("Required value was null.");
        }
        str = "fMessageDatabase";
        C18070vi.A11(str);
        throw null;
    }

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        try {
            Fragment A19 = A19();
            C18070vi.A0z(A19, "null cannot be cast to non-null type com.whatsapp.status.StatusDeleteDialogFragment.Host");
            this.A04 = (StatusPlaybackContactFragment) A19;
        } catch (ClassCastException unused) {
            throw new ClassCastException("Calling fragment must implement Host interface");
        }
    }
}
