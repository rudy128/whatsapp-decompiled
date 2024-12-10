package com.whatsapp.calling.participantlist.view;

import X.AnonymousClass00R;
import X.AnonymousClass1DF;
import X.AnonymousClass20F;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass5E7;
import X.AnonymousClass5E8;
import X.AnonymousClass5E9;
import X.AnonymousClass5R6;
import X.C155407sh;
import X.C155417si;
import X.C18070vi;
import X.C18100vl;
import X.C72453Mb;
import X.C90034dQ;
import X.C99274sY;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.WaImageView;
import com.whatsapp.calling.participantlist.viewmodel.ParticipantsListViewModel;

public final class VoiceChatParticipantListBottomSheetDialog extends ParticipantListBottomSheetDialog {
    public WaImageView A00;
    public final C18100vl A01;

    public void A21(Bundle bundle, View view) {
        WaImageView waImageView;
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        View A0S = C72453Mb.A0S(view, 2131429137);
        if (A0S instanceof WaImageView) {
            waImageView = (WaImageView) A0S;
        } else {
            waImageView = null;
        }
        this.A00 = waImageView;
        if (waImageView != null) {
            C90034dQ.A01(waImageView, this, 43);
        }
        AnonymousClass3MY.A1K(A1G(), A2K().A0I, new AnonymousClass5R6(this), 29);
    }

    public VoiceChatParticipantListBottomSheetDialog() {
        C18100vl A002 = AnonymousClass1DF.A00(AnonymousClass00R.A0C, new AnonymousClass5E8(new AnonymousClass5E7(this)));
        AnonymousClass20F A15 = AnonymousClass3MW.A15(ParticipantsListViewModel.class);
        this.A01 = C99274sY.A00(new AnonymousClass5E9(A002), new C155417si(this, A002), new C155407sh(A002), A15);
    }

    public void A1s() {
        super.A1s();
        this.A00 = null;
    }
}
