package com.whatsapp.usercontrol.view.controls;

import X.AnonymousClass1DF;
import X.AnonymousClass1HF;
import X.AnonymousClass206;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass78L;
import X.AnonymousClass7AS;
import X.C154697rY;
import X.C18070vi;
import X.C18100vl;
import X.C30391dr;
import X.C35761ml;
import X.C35771mm;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.FAQTextView;
import com.whatsapp.WaImageButton;
import com.whatsapp.WaTextView;
import com.whatsapp.jid.UserJid;
import com.whatsapp.usercontrol.viewmodel.UserControlStopResumeViewModel;
import com.whatsapp.wds.components.button.WDSButton;

public final class UCOffersAndAnnouncementsFragment extends Hilt_UCOffersAndAnnouncementsFragment {
    public FAQTextView A00;
    public WaTextView A01;
    public C35761ml A02;
    public WDSButton A03;
    public WaImageButton A04;
    public final C18100vl A05 = AnonymousClass1DF.A01(new C154697rY(this));

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        this.A01 = AnonymousClass3MW.A0T(A17(), 2131436490);
        this.A00 = (FAQTextView) AnonymousClass1HF.A06(A17(), 2131436604);
        WDSButton A0q = AnonymousClass3MW.A0q(A17(), 2131436492);
        AnonymousClass78L.A00(A0q, this, 15);
        this.A03 = A0q;
        WaImageButton waImageButton = (WaImageButton) AnonymousClass1HF.A06(A17(), 2131436489);
        AnonymousClass78L.A00(waImageButton, this, 16);
        this.A04 = waImageButton;
        C18100vl r3 = this.A05;
        ((UserControlStopResumeViewModel) r3.getValue()).A03.A0A(this, new AnonymousClass7AS(this, 35));
        ((UserControlStopResumeViewModel) r3.getValue()).A04.A0A(this, new AnonymousClass7AS(this, 36));
        AnonymousClass3MX.A1Q(new UCOffersAndAnnouncementsFragment$onViewCreated$3(this, (C30391dr) null), AnonymousClass3MZ.A0H(this));
    }

    public void onCancel(DialogInterface dialogInterface) {
        C18070vi.A0d(dialogInterface, 0);
        UserControlStopResumeViewModel userControlStopResumeViewModel = (UserControlStopResumeViewModel) this.A05.getValue();
        UserJid userJid = userControlStopResumeViewModel.A00;
        if (userJid != null) {
            C35771mm.A02((C35771mm) userControlStopResumeViewModel.A08.get(), userJid, (String) null);
        }
        userControlStopResumeViewModel.A05.A02((AnonymousClass206) null);
    }

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        A2A(0, 2132083971);
        ((UserControlStopResumeViewModel) this.A05.getValue()).A0U(this.A06);
    }
}
