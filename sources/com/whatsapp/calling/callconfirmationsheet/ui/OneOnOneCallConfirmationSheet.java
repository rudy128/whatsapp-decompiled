package com.whatsapp.calling.callconfirmationsheet.ui;

import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass1DF;
import X.AnonymousClass20F;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass4U0;
import X.AnonymousClass4ZN;
import X.AnonymousClass5CD;
import X.AnonymousClass5CE;
import X.AnonymousClass5CF;
import X.C155297sW;
import X.C155307sX;
import X.C18000vb;
import X.C18070vi;
import X.C18100vl;
import X.C72453Mb;
import X.C83614Fz;
import X.C99274sY;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.calling.callconfirmationsheet.vm.OneOnOneCallConfirmationSheetViewModel;
import com.whatsapp.wds.components.button.WDSButton;

public final class OneOnOneCallConfirmationSheet extends Hilt_OneOnOneCallConfirmationSheet {
    public C18000vb A00;
    public AnonymousClass00H A01;
    public final C18100vl A02;

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        C72453Mb.A1D(this.A02);
    }

    public void A2M(AnonymousClass4U0 r4) {
        C18070vi.A0d(r4, 0);
        TextView textView = this.A01;
        if (textView != null) {
            AnonymousClass4ZN.A01(A14(), textView, r4.A02);
        }
        WDSButton wDSButton = this.A06;
        if (wDSButton != null) {
            AnonymousClass4ZN.A01(A14(), wDSButton, r4.A01);
        }
        WDSButton wDSButton2 = this.A06;
        if (wDSButton2 != null) {
            wDSButton2.setIcon(r4.A00.BQt(A14()));
        }
        super.A2L();
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C18070vi.A0d(dialogInterface, 0);
        super.onDismiss(dialogInterface);
        OneOnOneCallConfirmationSheetViewModel oneOnOneCallConfirmationSheetViewModel = (OneOnOneCallConfirmationSheetViewModel) this.A02.getValue();
        if (!oneOnOneCallConfirmationSheetViewModel.A00 && C83614Fz.A00(oneOnOneCallConfirmationSheetViewModel.A01)) {
            oneOnOneCallConfirmationSheetViewModel.A02.BiX(AnonymousClass3MY.A0h(), (Integer) null, 8, false);
        }
    }

    public OneOnOneCallConfirmationSheet() {
        C18100vl A002 = AnonymousClass1DF.A00(AnonymousClass00R.A0C, new AnonymousClass5CE(new AnonymousClass5CD(this)));
        AnonymousClass20F A15 = AnonymousClass3MW.A15(OneOnOneCallConfirmationSheetViewModel.class);
        this.A02 = C99274sY.A00(new AnonymousClass5CF(A002), new C155307sX(this, A002), new C155297sW(A002), A15);
    }
}
