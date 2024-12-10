package com.whatsapp.wabloks.ui;

import X.A2X;
import X.AnonymousClass00H;
import X.AnonymousClass1DF;
import X.AnonymousClass3MY;
import X.AnonymousClass7NI;
import X.AnonymousClass7NN;
import X.AnonymousClass86W;
import X.C108955ca;
import X.C108985cd;
import X.C154847rn;
import X.C178149Bz;
import X.C17880vN;
import X.C18070vi;
import X.C18100vl;
import X.C20000A2o;
import X.C56382hN;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;
import java.util.Map;

public final class BkActionBottomSheet extends Hilt_BkActionBottomSheet {
    public C56382hN A00;
    public AnonymousClass00H A01;
    public AnonymousClass00H A02;
    public Map A03;
    public final C18100vl A04 = AnonymousClass1DF.A01(new C154847rn(this));

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        AnonymousClass7NI.A00((A2X) this.A04.getValue(), AnonymousClass7NN.class, this, 6);
        Bundle A15 = A15();
        View inflate = layoutInflater.inflate(2131623985, viewGroup, false);
        C18070vi.A0z(inflate, "null cannot be cast to non-null type android.widget.LinearLayout");
        ViewGroup viewGroup2 = (ViewGroup) inflate;
        TextView A0E = C17880vN.A0E(viewGroup2, 2131428236);
        TextView A0E2 = C17880vN.A0E(viewGroup2, 2131428235);
        String string = A15.getString("action_sheet_title", "");
        String string2 = A15.getString("action_sheet_message", "");
        if (C108955ca.A05(string) > 0) {
            A0E.setVisibility(0);
            A0E.setText(A15.getString("action_sheet_title"));
        }
        if (C108955ca.A05(string2) > 0) {
            A0E2.setVisibility(0);
            A0E2.setText(A15.getString("action_sheet_message"));
        }
        if (A15.getBoolean("action_sheet_has_buttons")) {
            boolean z = A15.getBoolean("action_sheet_has_buttons", false);
            String string3 = A15.getString("action_sheet_buttons", "");
            if (z) {
                AnonymousClass00H r0 = this.A02;
                if (r0 != null) {
                    C18070vi.A0b(string3);
                    List<AnonymousClass86W> list = (List) ((C20000A2o) r0.get()).A01(C178149Bz.A00(string3), "action_sheet_buttons", 0);
                    if (list != null) {
                        for (AnonymousClass86W r2 : list) {
                            View inflate2 = layoutInflater.inflate(2131623996, viewGroup, false);
                            C18070vi.A0z(inflate2, "null cannot be cast to non-null type com.whatsapp.wds.components.button.WDSButton");
                            TextView textView = (TextView) inflate2;
                            textView.setText(C108985cd.A0k(r2));
                            AnonymousClass3MY.A1E(textView, r2, this, 35);
                            viewGroup2.addView(textView);
                        }
                    }
                } else {
                    C18070vi.A11("waBloksCache");
                    throw null;
                }
            }
            A28();
        }
        return viewGroup2;
    }
}
