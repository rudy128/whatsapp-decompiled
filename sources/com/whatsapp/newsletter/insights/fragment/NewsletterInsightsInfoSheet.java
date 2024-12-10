package com.whatsapp.newsletter.insights.fragment;

import X.AnonymousClass000;
import X.AnonymousClass00R;
import X.AnonymousClass11P;
import X.AnonymousClass11X;
import X.AnonymousClass11Y;
import X.AnonymousClass1DF;
import X.AnonymousClass1FL;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass3VG;
import X.AnonymousClass4UM;
import X.AnonymousClass5OA;
import X.AnonymousClass5PU;
import X.AnonymousClass74D;
import X.C17880vN;
import X.C17960vV;
import X.C18000vb;
import X.C18030ve;
import X.C18070vi;
import X.C18100vl;
import X.C21356Ail;
import X.C36401np;
import X.C36531o3;
import X.C72453Mb;
import X.C821643h;
import X.C84394Ji;
import X.C87234Uu;
import X.C88414Zp;
import X.C91774gE;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Map;

public final class NewsletterInsightsInfoSheet extends Hilt_NewsletterInsightsInfoSheet {
    public C84394Ji A00;
    public C36531o3 A01;
    public C18000vb A02;
    public C18030ve A03;
    public AnonymousClass74D A04;
    public C36401np A05;
    public AnonymousClass3VG A06;
    public final C18100vl A07 = C88414Zp.A03(this, "content", 0);
    public final C18100vl A08;
    public final C18100vl A09;
    public final C18100vl A0A;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i;
        C18070vi.A0d(layoutInflater, 0);
        View inflate = layoutInflater.inflate(2131626215, viewGroup, true);
        int A0I = C72453Mb.A0I(this.A07);
        if (A0I == 1) {
            i = 2131626212;
        } else if (A0I == 2) {
            i = 2131626213;
        } else if (A0I == 3) {
            i = 2131626217;
        } else if (A0I != 4) {
            i = 2131626218;
            if (A0I != 5) {
                i = 2131626214;
            }
        } else {
            i = 2131626216;
        }
        layoutInflater.inflate(i, AnonymousClass3MW.A0D(inflate, 2131433040), true);
        return inflate;
    }

    public void A21(Bundle bundle, View view) {
        String str;
        long A012;
        AnonymousClass4UM r0;
        Long l;
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        TextView A0E = C17880vN.A0E(view, 2131433041);
        StringBuilder A10 = AnonymousClass000.A10();
        if (C72453Mb.A0I(this.A07) == 5) {
            AnonymousClass3VG r2 = this.A06;
            if (r2 == null) {
                str = "newsletterInsightsViewModel";
            } else {
                C87234Uu r1 = C821643h.A04;
                C18070vi.A0d(r1, 0);
                Map map = (Map) r2.A00.A06();
                if (map == null || (r0 = (AnonymousClass4UM) map.get(r1)) == null || (l = r0.A00) == null) {
                    A012 = AnonymousClass11P.A01(r2.A02);
                } else {
                    A012 = l.longValue();
                }
                AnonymousClass11Y r5 = AnonymousClass11X.A00;
                C18000vb r02 = this.A02;
                if (r02 != null) {
                    A10.append(AnonymousClass3MY.A0o(this, r5.A06(r02, A012), 0, 2131892695));
                    A10.append(' ');
                } else {
                    str = "whatsAppLocale";
                }
            }
            C18070vi.A11(str);
            throw null;
        }
        String A0y = AnonymousClass000.A0y(AnonymousClass3MX.A16(this, "in-development", new Object[1], 0, 2131892696), A10);
        C18070vi.A0X(A0y);
        C36401np r3 = this.A05;
        if (r3 != null) {
            A0E.setText(r3.A05(A0E.getContext(), new C21356Ail(this, 25), A0y, "in-development"));
            C18030ve r03 = this.A03;
            if (r03 != null) {
                AnonymousClass3Ma.A1I(A0E, r03);
                return;
            }
            str = "abProps";
        } else {
            str = "linkifier";
        }
        C18070vi.A11(str);
        throw null;
    }

    public NewsletterInsightsInfoSheet() {
        Integer num = AnonymousClass00R.A0C;
        this.A08 = AnonymousClass1DF.A00(num, new AnonymousClass5OA(this));
        this.A09 = AnonymousClass1DF.A00(num, new AnonymousClass5PU(this, "session_id"));
        this.A0A = C88414Zp.A03(this, "surface", 0);
    }

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        AnonymousClass1FL A1D = A1D();
        C84394Ji r2 = this.A00;
        if (r2 != null) {
            Object value = this.A08.getValue();
            C17960vV.A07(value);
            C18070vi.A0X(value);
            this.A06 = (AnonymousClass3VG) C91774gE.A00(A1D, r2, value, 14).A00(AnonymousClass3VG.class);
            return;
        }
        C18070vi.A11("newsletterInsightsViewModelFactory");
        throw null;
    }
}
