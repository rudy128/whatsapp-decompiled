package com.whatsapp.documentpicker.fragments;

import X.AnonymousClass11C;
import X.AnonymousClass1BI;
import X.AnonymousClass1E7;
import X.AnonymousClass1KW;
import X.AnonymousClass1M9;
import X.AnonymousClass1PM;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass4a6;
import X.AnonymousClass747;
import X.C17880vN;
import X.C17960vV;
import X.C18000vb;
import X.C18070vi;
import X.C24141Ja;
import X.C24921Me;
import X.C43251zV;
import X.C62272r8;
import X.C73203Rj;
import X.C88184Yq;
import X.C88584aA;
import X.C88824as;
import X.C88884az;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;

public final class SendDocumentsConfirmationDialogFragment extends Hilt_SendDocumentsConfirmationDialogFragment {
    public AnonymousClass1M9 A00;
    public AnonymousClass1PM A01;
    public C24921Me A02;
    public C88184Yq A03;
    public AnonymousClass11C A04;
    public AnonymousClass1KW A05;

    public Dialog A27(Bundle bundle) {
        String str;
        int i;
        int i2;
        String quantityString;
        AnonymousClass1BI A022 = AnonymousClass1BI.A00.A02(A15().getString("jid"));
        C17960vV.A07(A022);
        C18070vi.A0X(A022);
        AnonymousClass1M9 r0 = this.A00;
        if (r0 != null) {
            AnonymousClass1E7 A0H = r0.A0H(A022);
            C24921Me r02 = this.A02;
            if (r02 != null) {
                String A0I = r02.A0I(A0H);
                ArrayList A012 = C24141Ja.A01(A15(), Uri.class, "uri_list");
                if (A012 == null) {
                    return super.A27(bundle);
                }
                int i3 = A15().getInt("dialog_type");
                int i4 = A15().getInt("origin");
                boolean z = A15().getBoolean("selection_from_gallery_picker");
                boolean z2 = A15().getBoolean("finish_on_cancel");
                C17960vV.A07(Boolean.valueOf(z2));
                AnonymousClass747 r5 = C62272r8.A04;
                AnonymousClass11C r1 = this.A04;
                if (r1 != null) {
                    Object obj = A012.get(0);
                    C18070vi.A0X(obj);
                    String A023 = AnonymousClass747.A02((Uri) obj, r1);
                    int size = A012.size();
                    if (i3 == 0) {
                        quantityString = A1H(2131888723);
                    } else {
                        if (i3 == 2) {
                            i = 2131890912;
                            i2 = 2131755169;
                        } else {
                            i = 2131888721;
                            i2 = 2131755069;
                            if (i4 == 51) {
                                i = 2131888722;
                                i2 = 2131755070;
                            }
                        }
                        if (size != 1 || A023 == null || A023.length() == 0) {
                            Resources A09 = AnonymousClass3MZ.A09(this);
                            Object[] objArr = new Object[2];
                            C17880vN.A1T(objArr, size, 0);
                            objArr[1] = A0I;
                            quantityString = A09.getQuantityString(i2, size, objArr);
                        } else {
                            Object[] objArr2 = new Object[2];
                            objArr2[0] = A023;
                            quantityString = AnonymousClass3MX.A16(this, A0I, objArr2, 1, i);
                        }
                    }
                    C18070vi.A0b(quantityString);
                    C73203Rj A042 = AnonymousClass4a6.A04(this);
                    int i5 = 2131899381;
                    if (i4 == 51) {
                        i5 = 2131895677;
                    }
                    Context A14 = A14();
                    AnonymousClass1KW r03 = this.A05;
                    if (r03 != null) {
                        CharSequence A052 = C43251zV.A05(A14, r03, quantityString);
                        if (i3 == 0) {
                            A042.setTitle(A052);
                            C18000vb r2 = this.A01;
                            AnonymousClass11C r04 = this.A04;
                            if (r04 != null) {
                                String A024 = C88584aA.A02(r2, r5.A08(r04, A012));
                                C18070vi.A0X(A024);
                                int i6 = 2131888724;
                                if (A012.size() == 1) {
                                    i6 = 2131888725;
                                }
                                String A0o = AnonymousClass3MY.A0o(this, A024, 0, i6);
                                C18070vi.A0X(A0o);
                                A042.A0S(A0o);
                                i5 = 2131895677;
                            }
                        } else {
                            A042.A0S(A052);
                        }
                        A042.setPositiveButton(i5, new C88884az(A012, this, A022, 2, z));
                        A042.setNegativeButton(2131898766, new C88824as(2, this, z2));
                        return AnonymousClass3MY.A0L(A042);
                    }
                    str = "emojiLoader";
                }
                str = "systemServices";
            } else {
                str = "waContactNames";
            }
        } else {
            str = "contactManager";
        }
        C18070vi.A11(str);
        throw null;
    }
}
