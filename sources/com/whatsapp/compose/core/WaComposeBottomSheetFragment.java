package com.whatsapp.compose.core;

import X.AnonymousClass0LC;
import X.AnonymousClass1OS;
import X.C27143DWe;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.whatsapp.profile.fragments.UsernamePinEntryBottomSheetFragment;
import com.whatsapp.wds.components.bottomsheet.WDSBottomSheetDialogFragment;

public abstract class WaComposeBottomSheetFragment extends WDSBottomSheetDialogFragment {
    public AnonymousClass1OS A2K() {
        return ((UsernamePinEntryBottomSheetFragment) this).A03;
    }

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ComposeView composeView = new ComposeView(A14(), (AttributeSet) null, 0);
        composeView.setContent(AnonymousClass0LC.A01(new C27143DWe(this, 0), 533372242, true));
        return composeView;
    }
}
