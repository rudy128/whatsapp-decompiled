package com.whatsapp.voipcalling;

import X.AnonymousClass1HF;
import X.AnonymousClass20F;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass4a6;
import X.AnonymousClass5PE;
import X.AnonymousClass6VI;
import X.AnonymousClass78L;
import X.C010105w;
import X.C103785Lq;
import X.C103795Lr;
import X.C18100vl;
import X.C19740yt;
import X.C73203Rj;
import X.C99274sY;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.base.WaDialogFragment;
import com.whatsapp.calling.screenshare.ScreenShareViewModel;

public final class ScreenSharePermissionDialogFragment extends WaDialogFragment {
    public final C18100vl A00;

    public ScreenSharePermissionDialogFragment() {
        AnonymousClass20F A15 = AnonymousClass3MW.A15(ScreenShareViewModel.class);
        this.A00 = C99274sY.A00(new C103785Lq(this), new C103795Lr(this), new AnonymousClass5PE(this), A15);
    }

    public Dialog A27(Bundle bundle) {
        Bundle A15 = A15();
        View A08 = AnonymousClass3MX.A08(A14(), 2131626448);
        int i = 0;
        A08.setPadding(0, A08.getPaddingTop(), 0, A08.getPaddingBottom());
        ImageView A0G = AnonymousClass3MW.A0G(A08, 2131433768);
        A0G.setImageResource(2131233365);
        int dimensionPixelSize = A0G.getResources().getDimensionPixelSize(2131168522);
        ViewGroup.LayoutParams layoutParams = A0G.getLayoutParams();
        layoutParams.height = dimensionPixelSize;
        layoutParams.width = dimensionPixelSize;
        AnonymousClass3MW.A0J(A08, 2131433770).setText(AnonymousClass6VI.A00(A1H(A15.getInt("BodyTextId", 0))));
        AnonymousClass1HF.A06(A08, 2131435879).setOnClickListener(new AnonymousClass78L(this, 37));
        TextView A0J = AnonymousClass3MW.A0J(A08, 2131428811);
        if (!A15.getBoolean("CancelEnabled", true)) {
            i = 8;
        }
        A0J.setVisibility(i);
        A0J.setText(2131887905);
        A0J.setOnClickListener(new AnonymousClass78L(this, 38));
        C73203Rj A03 = AnonymousClass4a6.A03(this);
        A03.A0c(A08);
        A03.A0T(true);
        C010105w A0L = AnonymousClass3MY.A0L(A03);
        Window window = A0L.getWindow();
        if (window != null) {
            AnonymousClass3Ma.A1H(window, C19740yt.A00(A14(), 2131102739));
        }
        return A0L;
    }
}
