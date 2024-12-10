package com.whatsapp.pancake;

import X.A3H;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass8AD;
import X.C109675dp;
import X.C17880vN;
import X.C18070vi;
import X.C19740yt;
import X.C21425Ajs;
import X.C30391dr;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.text.style.TextAppearanceSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.base.WaFragment;
import com.whatsapp.pancake.dosa.DosaPearPancakeFragment;
import com.whatsapp.pancake.dosa.DosaPearPancakeViewModel;

public abstract class PearPancakeFragment extends WaFragment implements View.OnClickListener {
    public TextView A00;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return AnonymousClass3MX.A0B(layoutInflater, viewGroup, 2131626497, false);
    }

    /* JADX WARNING: type inference failed for: r0v15, types: [X.5dp, android.text.method.LinkMovementMethod] */
    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        C17880vN.A0E(view, 2131433411).setText(2131899324);
        TextView A0E = C17880vN.A0E(view, 2131433410);
        A0E.setText(A3H.A00(A14(), (TextAppearanceSpan) null, new C21425Ajs((Object) this, 20), AnonymousClass3MY.A0n(this, 2131899323), "learn-more", C19740yt.A00(A14(), 2131103150), true));
        C109675dp r0 = C109675dp.A00;
        C109675dp r02 = r0;
        if (r0 == null) {
            ? linkMovementMethod = new LinkMovementMethod();
            C109675dp.A00 = linkMovementMethod;
            r02 = linkMovementMethod;
        }
        A0E.setMovementMethod(r02);
        TextView A0E2 = C17880vN.A0E(view, 2131433407);
        A0E2.setOnClickListener(this);
        A0E2.setText(2131899320);
        TextView A0E3 = C17880vN.A0E(view, 2131433409);
        A0E3.setOnClickListener(this);
        this.A00 = A0E3;
        AnonymousClass3MZ.A0G(this).A01(new PearPancakeFragment$onViewCreated$1(this, (C30391dr) null));
    }

    public AnonymousClass8AD A26() {
        if (this instanceof DosaPearPancakeFragment) {
            return (DosaPearPancakeViewModel) ((DosaPearPancakeFragment) this).A00.getValue();
        }
        return (PomegranatePancakeViewModel) ((PomegranatePancakeFragment) this).A00.getValue();
    }

    public void onClick(View view) {
        if (view != null) {
            int id = view.getId();
            if (Integer.valueOf(id) == null) {
                return;
            }
            if (id == 2131433407) {
                A26().C5R();
            } else if (id == 2131433409) {
                A26().BG1();
            }
        }
    }
}
