package com.whatsapp.util;

import X.AnonymousClass00H;
import X.AnonymousClass121;
import X.AnonymousClass18K;
import X.AnonymousClass190;
import X.AnonymousClass1KB;
import X.AnonymousClass1L9;
import X.AnonymousClass1M9;
import X.AnonymousClass1W2;
import X.AnonymousClass206;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4a6;
import X.AnonymousClass789;
import X.AnonymousClass78L;
import X.C010105w;
import X.C108955ca;
import X.C18070vi;
import X.C32211gp;
import X.C73203Rj;
import android.app.Dialog;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

public final class DocumentWarningDialogFragment extends Hilt_DocumentWarningDialogFragment {
    public C010105w A00;
    public AnonymousClass1L9 A01;
    public AnonymousClass190 A02;
    public AnonymousClass1KB A03;
    public AnonymousClass1M9 A04;
    public AnonymousClass121 A05;
    public C32211gp A06;
    public AnonymousClass18K A07;
    public AnonymousClass00H A08;

    public final AnonymousClass206 A2H(long j) {
        AnonymousClass00H r0 = this.A08;
        if (r0 != null) {
            return AnonymousClass1W2.A02(r0, j);
        }
        C18070vi.A11("fMessageDatabase");
        throw null;
    }

    public Dialog A27(Bundle bundle) {
        Window window;
        View A0D = AnonymousClass3MY.A0D(A16(), 2131625102);
        C18070vi.A0b(A0D);
        AnonymousClass3MW.A0J(A0D, 2131429980).setText(A15().getInt("warning_id", 2131898477));
        boolean z = A15().getBoolean("allowed_to_open");
        Resources A09 = AnonymousClass3MZ.A09(this);
        int i = 2131899286;
        if (z) {
            i = 2131893156;
        }
        CharSequence text = A09.getText(i);
        C18070vi.A0b(text);
        TextView A0J = AnonymousClass3MW.A0J(A0D, 2131433292);
        A0J.setText(text);
        A0J.setOnClickListener(new AnonymousClass789(this, A0J, 8, z));
        boolean z2 = A15().getBoolean("allowed_to_open");
        View A052 = C18070vi.A05(A0D, 2131428815);
        if (z2) {
            AnonymousClass78L.A00(A052, this, 20);
        } else {
            A052.setVisibility(8);
        }
        C73203Rj A032 = AnonymousClass4a6.A03(this);
        A032.A0c(A0D);
        C010105w create = A032.create();
        this.A00 = create;
        if (!(create == null || (window = create.getWindow()) == null)) {
            AnonymousClass3Ma.A1H(window, C108955ca.A01(A14()));
        }
        C010105w r0 = this.A00;
        C18070vi.A0b(r0);
        return r0;
    }
}
