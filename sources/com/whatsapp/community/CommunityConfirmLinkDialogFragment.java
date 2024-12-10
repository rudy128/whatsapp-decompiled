package com.whatsapp.community;

import X.AnonymousClass000;
import X.AnonymousClass00R;
import X.AnonymousClass1BI;
import X.AnonymousClass1CJ;
import X.AnonymousClass1DF;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass4a6;
import X.AnonymousClass4aq;
import X.AnonymousClass5PI;
import X.C103975Mj;
import X.C107965au;
import X.C17880vN;
import X.C18070vi;
import X.C18100vl;
import X.C24921Me;
import X.C72463Mc;
import X.C72473Md;
import X.C73203Rj;
import X.C82884Cn;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class CommunityConfirmLinkDialogFragment extends Hilt_CommunityConfirmLinkDialogFragment {
    public C107965au A00;
    public C24921Me A01;
    public AnonymousClass1CJ A02;
    public final C18100vl A03;
    public final C18100vl A04;

    public void A1x(Context context) {
        C18070vi.A0d(context, 0);
        super.A1x(context);
        if (context instanceof C107965au) {
            this.A00 = (C107965au) context;
            return;
        }
        throw AnonymousClass000.A0n("NewCommunityConfirmLinkDialogFragment requires a Listener as it's host");
    }

    public CommunityConfirmLinkDialogFragment() {
        Integer num = AnonymousClass00R.A0C;
        this.A04 = AnonymousClass1DF.A00(num, new C103975Mj(this));
        this.A03 = AnonymousClass1DF.A00(num, new AnonymousClass5PI(this, C82884Cn.DIRECT_LINK));
    }

    public Dialog A27(Bundle bundle) {
        String quantityString;
        C73203Rj A042 = AnonymousClass4a6.A04(this);
        C18100vl r7 = this.A04;
        List A11 = AnonymousClass3MW.A11(r7);
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it = A11.iterator();
        while (it.hasNext()) {
            AnonymousClass1BI A0Q = C17880vN.A0Q(it);
            AnonymousClass1CJ r0 = this.A02;
            if (r0 != null) {
                String A0F = r0.A0F(A0Q);
                if (A0F != null) {
                    A13.add(A0F);
                }
            } else {
                AnonymousClass3MW.A1I();
                throw null;
            }
        }
        int size = A13.size();
        if (size == 1) {
            quantityString = C17880vN.A0q(A14(), A13.get(0), new Object[1], 0, 2131891635);
        } else if (size == 2) {
            Context A14 = A14();
            Object[] objArr = new Object[2];
            C72473Md.A1O(A13, objArr);
            quantityString = A14.getString(2131891636, objArr);
        } else {
            Resources A09 = AnonymousClass3MZ.A09(this);
            if (size >= 3) {
                int A022 = AnonymousClass3MX.A02(A13, 2);
                Object[] objArr2 = new Object[3];
                C72473Md.A1O(A13, objArr2);
                C17880vN.A1T(objArr2, AnonymousClass3MX.A02(A13, 2), 2);
                quantityString = A09.getQuantityString(2131755205, A022, objArr2);
            } else {
                quantityString = A09.getQuantityString(2131755206, C72463Mc.A0D(r7));
            }
        }
        C18070vi.A0a(quantityString);
        A042.setTitle(quantityString);
        View A08 = AnonymousClass3MX.A08(A1n(), 2131625092);
        TextView A0E = C17880vN.A0E(A08, 2131432023);
        Resources A0Y = AnonymousClass000.A0Y(A0E);
        int i = 2131755207;
        if (this.A03.getValue() == C82884Cn.SUGGEST) {
            i = 2131755421;
        }
        A0E.setText(A0Y.getQuantityText(i, C72463Mc.A0D(r7)));
        A042.setView(A08);
        A042.setNegativeButton(2131898766, new AnonymousClass4aq(this, 47));
        A042.setPositiveButton(2131893145, new AnonymousClass4aq(this, 48));
        return AnonymousClass3MY.A0L(A042);
    }
}
