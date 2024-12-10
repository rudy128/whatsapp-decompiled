package com.whatsapp.usercontrol.view;

import X.AnonymousClass1FU;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass5YY;
import X.AnonymousClass6U3;
import X.AnonymousClass78L;
import X.AnonymousClass7AS;
import X.C121566Km;
import X.C121576Kn;
import X.C121586Ko;
import X.C143007Bq;
import X.C157097vn;
import X.C1588282e;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C18100vl;
import X.C23520Bik;
import X.C30391dr;
import X.C72453Mb;
import android.content.Context;
import android.os.Bundle;
import android.text.Spannable;
import android.view.View;
import com.whatsapp.FAQTextView;
import com.whatsapp.WaTextView;
import com.whatsapp.usercontrol.viewmodel.UserControlMessageLevelViewModel;
import com.whatsapp.wds.components.list.listitem.WDSListItem;

public final class UserControlMessageLevelFragment extends UserControlBaseFragment {
    public void A21(Bundle bundle, View view) {
        String str;
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        C18100vl r3 = this.A0C;
        AnonymousClass7AS.A00(this, ((UserControlMessageLevelViewModel) r3.getValue()).A03, new C1588282e(view, this), 33);
        ((UserControlMessageLevelViewModel) r3.getValue()).A02.A0A(this, new AnonymousClass7AS(this, 34));
        UserControlMessageLevelViewModel userControlMessageLevelViewModel = (UserControlMessageLevelViewModel) r3.getValue();
        C18030ve r2 = userControlMessageLevelViewModel.A07.A00;
        C18040vf r1 = C18040vf.A02;
        if (!C18020vd.A05(r1, r2, 11241) || C18020vd.A05(r1, r2, 10668) || UserControlMessageLevelViewModel.A04(userControlMessageLevelViewModel)) {
            str = "1027276182478056";
        } else {
            str = "849628780369041";
        }
        FAQTextView fAQTextView = this.A02;
        if (fAQTextView != null) {
            fAQTextView.setEducationTextFromArticleID((Spannable) AnonymousClass3MW.A09(A1H(2131897228)), str, (AnonymousClass5YY) new C143007Bq(this, 0));
        }
        AnonymousClass3MX.A1Q(new UserControlMessageLevelFragment$onViewCreated$2(this, (C30391dr) null), AnonymousClass3MZ.A0H(this));
    }

    public void A2K(AnonymousClass6U3 r6) {
        if (r6 instanceof C121586Ko) {
            if (this.A06 != null) {
                AnonymousClass1FU r1 = (AnonymousClass1FU) C72453Mb.A0Z(this);
                String str = ((C121586Ko) r6).A00;
                C157097vn r4 = new C157097vn(r6, this);
                C18070vi.A0d(r1, 0);
                C23520Bik A00 = C23520Bik.A00((Context) null, r1.A00, str, 0);
                A00.A0F(new AnonymousClass78L(r4, 13), 2131897301);
                A00.A08();
                A28();
                return;
            }
            C18070vi.A11("userControlUtils");
            throw null;
        } else if (r6 instanceof C121576Kn) {
            WaTextView waTextView = this.A03;
            if (waTextView != null) {
                waTextView.setText(((C121576Kn) r6).A00);
            }
        } else if (r6 instanceof C121566Km) {
            WDSListItem wDSListItem = this.A08;
            if (wDSListItem != null) {
                wDSListItem.setText((CharSequence) ((C121566Km) r6).A00);
            }
        } else {
            super.A2K(r6);
        }
    }
}
