package com.whatsapp.chatinfo.fragment;

import X.AnonymousClass000;
import X.AnonymousClass129;
import X.AnonymousClass12L;
import X.AnonymousClass1BI;
import X.AnonymousClass1E7;
import X.AnonymousClass1FL;
import X.AnonymousClass1KW;
import X.AnonymousClass1L9;
import X.AnonymousClass1M9;
import X.AnonymousClass1MB;
import X.AnonymousClass3MX;
import X.AnonymousClass4a6;
import X.AnonymousClass4aq;
import X.AnonymousClass4at;
import X.AnonymousClass4bC;
import X.C1402170l;
import X.C17900vP;
import X.C17960vV;
import X.C18030ve;
import X.C22971Dz;
import X.C36531o3;
import X.C43251zV;
import X.C43381zi;
import X.C73203Rj;
import android.app.Dialog;
import android.os.Bundle;

public class EncryptionExplanationDialogFragment extends Hilt_EncryptionExplanationDialogFragment {
    public AnonymousClass1L9 A00;
    public AnonymousClass1M9 A01;
    public C36531o3 A02;
    public AnonymousClass1KW A03;
    public AnonymousClass12L A04;
    public AnonymousClass1MB A05;
    public AnonymousClass129 A06;

    public Dialog A27(Bundle bundle) {
        int i;
        String str;
        int i2;
        Object[] objArr;
        Bundle A15 = A15();
        String string = A15.getString("jid");
        String string2 = A15.getString("display_name");
        int i3 = A15.getInt("provider_category", 0);
        AnonymousClass1M9 r1 = this.A01;
        AnonymousClass1BI A0l = AnonymousClass3MX.A0l(string);
        C17960vV.A08(A0l, string);
        AnonymousClass1E7 A0H = r1.A0H(A0l);
        C18030ve r2 = this.A02;
        AnonymousClass1MB r0 = this.A05;
        AnonymousClass1FL A1D = A1D();
        AnonymousClass1BI r8 = A0H.A0J;
        if (r8 != null) {
            AnonymousClass12L r12 = this.A04;
            if (r0.A03(r8) || C43381zi.A01(r2, r8)) {
                i = 2131888785;
            } else {
                if (i3 != 1) {
                    if (i3 == 2) {
                        C17960vV.A07(string2);
                        i2 = 2131888782;
                    } else if (i3 == 3 || i3 == 4) {
                        C17960vV.A07(string2);
                        boolean A002 = C1402170l.A00(r12, r8);
                        i2 = 2131888784;
                        if (A002) {
                            i2 = 2131888783;
                            objArr = new Object[]{string2};
                            str = A1D.getString(i2, objArr);
                            C73203Rj A022 = AnonymousClass4a6.A02(this);
                            A022.A0S(C43251zV.A05(A1D(), this.A03, str));
                            A022.A0T(true);
                            A022.A0X(new AnonymousClass4aq(this, 40), 2131899286);
                            A022.A0Y(new AnonymousClass4at(this, i3, 0), 2131899101);
                            if (!A0H.A0F() && !C22971Dz.A0N(A0H.A0J) && i3 == 1) {
                                A022.setPositiveButton(2131891240, new AnonymousClass4bC((Object) this, (Object) A0H, 3));
                            }
                            return A022.create();
                        }
                    } else {
                        C17900vP.A0i("providerCategoryToModal unexpected argument value for providerCategory: ", AnonymousClass000.A10(), i3);
                    }
                    objArr = new Object[]{string2, string2};
                    str = A1D.getString(i2, objArr);
                    C73203Rj A0222 = AnonymousClass4a6.A02(this);
                    A0222.A0S(C43251zV.A05(A1D(), this.A03, str));
                    A0222.A0T(true);
                    A0222.A0X(new AnonymousClass4aq(this, 40), 2131899286);
                    A0222.A0Y(new AnonymousClass4at(this, i3, 0), 2131899101);
                    A0222.setPositiveButton(2131891240, new AnonymousClass4bC((Object) this, (Object) A0H, 3));
                    return A0222.create();
                }
                i = 2131889883;
            }
            str = A1D.getString(i);
            C73203Rj A02222 = AnonymousClass4a6.A02(this);
            A02222.A0S(C43251zV.A05(A1D(), this.A03, str));
            A02222.A0T(true);
            A02222.A0X(new AnonymousClass4aq(this, 40), 2131899286);
            A02222.A0Y(new AnonymousClass4at(this, i3, 0), 2131899101);
            A02222.setPositiveButton(2131891240, new AnonymousClass4bC((Object) this, (Object) A0H, 3));
            return A02222.create();
        }
        throw new NullPointerException();
    }
}
