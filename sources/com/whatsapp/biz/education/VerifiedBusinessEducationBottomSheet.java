package com.whatsapp.biz.education;

import X.AnonymousClass00H;
import X.AnonymousClass129;
import X.AnonymousClass1L9;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.C17890vO;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C25491Cgm;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.WaTextView;

public final class VerifiedBusinessEducationBottomSheet extends Hilt_VerifiedBusinessEducationBottomSheet {
    public AnonymousClass1L9 A00;
    public C18030ve A01;
    public AnonymousClass129 A02;
    public AnonymousClass00H A03;
    public AnonymousClass00H A04;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i;
        C18070vi.A0d(layoutInflater, 0);
        View A0A = AnonymousClass3MX.A0A(layoutInflater, viewGroup, 2131624403);
        WaTextView A0U = AnonymousClass3MW.A0U(A0A, 2131429927);
        C18030ve abProps = A0U.getAbProps();
        C18040vf r2 = C18040vf.A02;
        if (C18020vd.A05(r2, abProps, 7976)) {
            i = 2131887165;
        } else {
            i = 2131887163;
            if (C18020vd.A05(r2, A0U.getAbProps(), 6127)) {
                i = 2131887164;
            }
        }
        A0U.setText(i);
        AnonymousClass3MZ.A1I(A0A.findViewById(2131431962), this, 11);
        return A0A;
    }

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        AnonymousClass00H r0 = this.A04;
        if (r0 != null) {
            C25491Cgm cgm = (C25491Cgm) r0.get();
            String string = A15().getString("biz_owner_jid");
            if (string != null) {
                C25491Cgm.A00(cgm, 2, string, 2, 2);
                return;
            }
            throw C17890vO.A0K();
        }
        C18070vi.A11("metaVerifiedInteractionLogger");
        throw null;
    }
}
