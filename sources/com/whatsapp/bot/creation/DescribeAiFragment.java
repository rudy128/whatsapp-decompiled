package com.whatsapp.bot.creation;

import X.AnonymousClass1FL;
import X.AnonymousClass1GW;
import X.AnonymousClass20F;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3U6;
import X.AnonymousClass5BT;
import X.AnonymousClass5BU;
import X.AnonymousClass5BV;
import X.AnonymousClass5BW;
import X.AnonymousClass5M2;
import X.AnonymousClass5M3;
import X.C17880vN;
import X.C18070vi;
import X.C18100vl;
import X.C23401Fx;
import X.C30391dr;
import X.C41561wd;
import X.C77543qX;
import X.C87954Xt;
import X.C89554ce;
import X.C99274sY;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.whatsapp.bot.creation.viewmodel.AiCreationViewModel;
import com.whatsapp.bot.creation.viewmodel.AiCreationViewModel$createGenAiPersona$1;

public final class DescribeAiFragment extends Fragment implements AnonymousClass1GW {
    public TextView A00;
    public EditText A01;
    public final C18100vl A02;
    public final C18100vl A03;

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        AnonymousClass1FL A1D = A1D();
        AnonymousClass3MY.A0t(A1D, 2131886611);
        A1D.A2P(this, C23401Fx.RESUMED, A1G());
        TextView A0E = C17880vN.A0E(view, 2131431982);
        this.A00 = A0E;
        if (A0E != null) {
            Object[] A1b = AnonymousClass3MW.A1b();
            AnonymousClass3MX.A1R(A1b, 0);
            C17880vN.A1T(A1b, 1000, 1);
            A0E.setText(A1I(2131886610, A1b));
        }
        EditText editText = (EditText) view.findViewById(2131427722);
        this.A01 = editText;
        if (editText != null) {
            editText.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(1000)});
        }
        EditText editText2 = this.A01;
        if (editText2 != null) {
            C89554ce.A00(editText2, this, 0);
        }
    }

    public void BqV(Menu menu, MenuInflater menuInflater) {
        Editable text;
        C18070vi.A0d(menu, 0);
        boolean z = false;
        MenuItem add = menu.add(0, 2131432604, 0, 2131886608);
        EditText editText = this.A01;
        if (editText == null || (text = editText.getText()) == null || text.length() == 0) {
            z = true;
        }
        add.setEnabled(!z).setShowAsAction(2);
    }

    public /* synthetic */ void ByC(Menu menu) {
    }

    public boolean ByD(MenuItem menuItem) {
        String str;
        Editable text;
        if (AnonymousClass3MY.A01(menuItem, 0) != 2131432604) {
            return false;
        }
        EditText editText = this.A01;
        if (editText == null || (text = editText.getText()) == null || (str = text.toString()) == null) {
            str = "";
        }
        if (str.length() <= 0) {
            return true;
        }
        AiCreationViewModel aiCreationViewModel = (AiCreationViewModel) this.A02.getValue();
        AnonymousClass3MX.A1Q(new AiCreationViewModel$createGenAiPersona$1(aiCreationViewModel, str, (C30391dr) null), C41561wd.A00(aiCreationViewModel));
        ((AnonymousClass3U6) this.A03.getValue()).A0T(C87954Xt.A00);
        return true;
    }

    public /* synthetic */ void C1X(Menu menu) {
    }

    public DescribeAiFragment() {
        this.A02 = 2131624155;
        AnonymousClass20F A15 = AnonymousClass3MW.A15(C77543qX.class);
        this.A03 = C99274sY.A00(new AnonymousClass5BT(this), new AnonymousClass5BU(this), new AnonymousClass5M2(this), A15);
        AnonymousClass20F A152 = AnonymousClass3MW.A15(AiCreationViewModel.class);
        this.A02 = C99274sY.A00(new AnonymousClass5BV(this), new AnonymousClass5BW(this), new AnonymousClass5M3(this), A152);
    }

    public void A1s() {
        super.A1s();
        this.A00 = null;
        this.A01 = null;
    }
}
