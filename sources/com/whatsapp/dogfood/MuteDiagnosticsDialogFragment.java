package com.whatsapp.dogfood;

import X.AnonymousClass000;
import X.AnonymousClass00R;
import X.AnonymousClass1DF;
import X.AnonymousClass20F;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass4DY;
import X.AnonymousClass4a6;
import X.AnonymousClass4bA;
import X.AnonymousClass5HM;
import X.AnonymousClass5HN;
import X.AnonymousClass5HO;
import X.C155617t2;
import X.C155627t3;
import X.C18000vb;
import X.C18070vi;
import X.C18100vl;
import X.C19830z4;
import X.C64052u8;
import X.C73203Rj;
import X.C90904ep;
import X.C99274sY;
import android.app.Dialog;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import com.whatsapp.radio.RadioButtonWithSubtitle;

public final class MuteDiagnosticsDialogFragment extends Hilt_MuteDiagnosticsDialogFragment {
    public C19830z4 A00;
    public final C18100vl A01;

    public MuteDiagnosticsDialogFragment() {
        C18100vl A002 = AnonymousClass1DF.A00(AnonymousClass00R.A0C, new AnonymousClass5HN(new AnonymousClass5HM(this)));
        AnonymousClass20F A15 = AnonymousClass3MW.A15(MuteDiagnosticsDialogViewModel.class);
        this.A01 = C99274sY.A00(new AnonymousClass5HO(A002), new C155627t3(this, A002), new C155617t2(A002), A15);
    }

    public Dialog A27(Bundle bundle) {
        C18000vb r0;
        String str;
        C73203Rj A04 = AnonymousClass4a6.A04(this);
        View inflate = AnonymousClass3MZ.A0E(this).inflate(2131626131, (ViewGroup) null, false);
        A04.setTitle("Mute Diagnostics Notifications");
        A04.setPositiveButton(2131899286, new AnonymousClass4bA(this, 33));
        AnonymousClass4bA.A00(A04, this, 34, 2131898766);
        RadioGroup radioGroup = (RadioGroup) C18070vi.A05(inflate, 2131432884);
        for (AnonymousClass4DY r9 : AnonymousClass4DY.values()) {
            RadioButtonWithSubtitle radioButtonWithSubtitle = new RadioButtonWithSubtitle(A14(), (AttributeSet) null, 16842878);
            int ordinal = r9.ordinal();
            int i = 2;
            int i2 = 1;
            if (ordinal == 0) {
                r0 = this.A01;
                i2 = 8;
            } else if (ordinal == 1) {
                str = C64052u8.A02(this.A01, 1, 3);
                C18070vi.A0X(str);
                radioButtonWithSubtitle.setTitle(str);
                radioButtonWithSubtitle.setTag(r9.name());
                radioButtonWithSubtitle.setId(View.generateViewId());
                radioButtonWithSubtitle.setChecked(AnonymousClass000.A1Z(r9, ((MuteDiagnosticsDialogViewModel) this.A01.getValue()).A00));
                radioGroup.addView(radioButtonWithSubtitle);
            } else if (ordinal == 2) {
                r0 = this.A01;
                i = 4;
            } else {
                throw AnonymousClass3MW.A14();
            }
            str = C64052u8.A02(r0, i2, i);
            C18070vi.A0X(str);
            radioButtonWithSubtitle.setTitle(str);
            radioButtonWithSubtitle.setTag(r9.name());
            radioButtonWithSubtitle.setId(View.generateViewId());
            radioButtonWithSubtitle.setChecked(AnonymousClass000.A1Z(r9, ((MuteDiagnosticsDialogViewModel) this.A01.getValue()).A00));
            radioGroup.addView(radioButtonWithSubtitle);
        }
        radioGroup.setOnCheckedChangeListener(new C90904ep(this, radioGroup, 2));
        A04.setView(inflate);
        return AnonymousClass3MY.A0L(A04);
    }
}
