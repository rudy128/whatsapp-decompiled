package com.whatsapp.consent;

import X.AnonymousClass1CM;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.C108975cc;
import X.C17880vN;
import X.C18070vi;
import X.C30391dr;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.pancake.dosa.DosaAgeRemediationPassFragment;
import com.whatsapp.pancake.dosa.DosaAgeRemediationPassFragment$onClick$1;

public abstract class AgeRemediationResultFragment extends Hilt_AgeRemediationResultFragment implements View.OnClickListener {
    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return AnonymousClass3MX.A0B(layoutInflater, viewGroup, 2131624151, false);
    }

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        C108975cc.A0t(view, 2131427702);
        AnonymousClass3MW.A0H(view, 2131427699).setImageResource(2131233672);
        C17880vN.A0E(view, 2131427701).setText(AnonymousClass3MY.A0m(AnonymousClass3MZ.A09(this), 2131894590));
        C17880vN.A0E(view, 2131427700).setText(AnonymousClass3MY.A0m(AnonymousClass3MZ.A09(this), 2131894589));
        TextView A0E = C17880vN.A0E(view, 2131427698);
        A0E.setVisibility(0);
        A0E.setText(AnonymousClass3MY.A0m(AnonymousClass3MZ.A09(this), 2131894585));
        A0E.setOnClickListener(this);
    }

    public void onClick(View view) {
        AgeRemediationPassFragment ageRemediationPassFragment = (AgeRemediationPassFragment) this;
        if (ageRemediationPassFragment instanceof DosaAgeRemediationPassFragment) {
            DosaAgeRemediationPassFragment dosaAgeRemediationPassFragment = (DosaAgeRemediationPassFragment) ageRemediationPassFragment;
            AnonymousClass3MX.A1Q(new DosaAgeRemediationPassFragment$onClick$1(dosaAgeRemediationPassFragment, (C30391dr) null), AnonymousClass3MZ.A0H(dosaAgeRemediationPassFragment));
            return;
        }
        AnonymousClass1CM r1 = ageRemediationPassFragment.A00;
        if (r1 != null) {
            r1.A01(36);
        } else {
            C18070vi.A11("registrationStateManager");
            throw null;
        }
    }
}
