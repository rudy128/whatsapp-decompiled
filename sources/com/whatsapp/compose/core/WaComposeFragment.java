package com.whatsapp.compose.core;

import X.AnonymousClass0LC;
import X.AnonymousClass1OS;
import X.AnonymousClass781;
import X.C06230Xm;
import X.C27143DWe;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.whatsapp.base.WaFragment;
import com.whatsapp.profile.fragments.UsernameSetSuccessDialogFragment;

public abstract class WaComposeFragment extends WaFragment {
    public AnonymousClass1OS A26() {
        return ((UsernameSetSuccessDialogFragment) this).A02;
    }

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ComposeView composeView = new ComposeView(A14(), (AttributeSet) null, 0);
        composeView.setViewCompositionStrategy(C06230Xm.A00);
        composeView.setContent(AnonymousClass0LC.A01(new C27143DWe(this, 1), 1275987970, true));
        composeView.setOnClickListener(new AnonymousClass781(3));
        return composeView;
    }
}
