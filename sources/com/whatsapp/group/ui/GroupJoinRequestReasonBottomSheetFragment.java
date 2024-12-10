package com.whatsapp.group.ui;

import X.AnonymousClass00R;
import X.AnonymousClass11C;
import X.AnonymousClass1DF;
import X.AnonymousClass1E7;
import X.AnonymousClass1KW;
import X.AnonymousClass1L2;
import X.AnonymousClass1M9;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass48E;
import X.AnonymousClass5O0;
import X.C104395Nz;
import X.C17880vN;
import X.C18000vb;
import X.C18010vc;
import X.C18030ve;
import X.C18070vi;
import X.C18100vl;
import X.C24921Me;
import X.C33251iW;
import X.C72453Mb;
import X.C83774Gp;
import X.C88414Zp;
import X.C90014dO;
import X.C90044dR;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import com.whatsapp.WaEditText;
import com.whatsapp.wds.components.button.WDSButton;

public final class GroupJoinRequestReasonBottomSheetFragment extends Hilt_GroupJoinRequestReasonBottomSheetFragment {
    public C33251iW A00;
    public AnonymousClass1M9 A01;
    public C24921Me A02;
    public AnonymousClass11C A03;
    public C18000vb A04;
    public AnonymousClass1L2 A05;
    public AnonymousClass1KW A06;
    public C18030ve A07;
    public C18010vc A08;
    public WDSButton A09;
    public String A0A = "";
    public final C18100vl A0B;
    public final C18100vl A0C;
    public final C18100vl A0D = C88414Zp.A02(this, "group_subject");
    public final C18100vl A0E = C88414Zp.A02(this, "raw_parent_jid");
    public final C18100vl A0F = C88414Zp.A02(this, "message");

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        View inflate = layoutInflater.inflate(2131625502, viewGroup);
        C18070vi.A0X(inflate);
        return inflate;
    }

    public void A21(Bundle bundle, View view) {
        String str;
        String A1I;
        View view2 = view;
        C18070vi.A0d(view2, 0);
        super.A21(bundle, view2);
        TextView A0E2 = C17880vN.A0E(view2, 2131434580);
        ScrollView scrollView = (ScrollView) view2.findViewById(2131434834);
        WaEditText waEditText = (WaEditText) view2.findViewById(2131431895);
        TextView A0E3 = C17880vN.A0E(view2, 2131436208);
        TextView A0E4 = C17880vN.A0E(view2, 2131434582);
        TextView A0E5 = C17880vN.A0E(view2, 2131434588);
        View findViewById = view2.findViewById(2131428013);
        this.A09 = AnonymousClass3MW.A0r(view2, 2131434576);
        C18030ve r5 = this.A07;
        if (r5 != null) {
            Context A14 = A14();
            AnonymousClass1KW r4 = this.A06;
            if (r4 != null) {
                AnonymousClass11C r3 = this.A03;
                if (r3 != null) {
                    C18000vb r2 = this.A04;
                    if (r2 != null) {
                        C18010vc r1 = this.A08;
                        if (r1 != null) {
                            AnonymousClass1L2 r0 = this.A05;
                            if (r0 != null) {
                                AnonymousClass1KW r21 = r4;
                                AnonymousClass1L2 r20 = r0;
                                C18000vb r19 = r2;
                                AnonymousClass11C r18 = r3;
                                WaEditText waEditText2 = waEditText;
                                C83774Gp.A00(A14, scrollView, A0E2, A0E5, waEditText2, r18, r19, r20, r21, r5, r1, 65536);
                                AnonymousClass48E.A00(waEditText, this, 11);
                                C72453Mb.A1G(waEditText, this.A0F);
                                WDSButton wDSButton = this.A09;
                                if (wDSButton != null) {
                                    C90014dO.A00(wDSButton, this, view2, 44);
                                }
                                C72453Mb.A1G(A0E3, this.A0D);
                                AnonymousClass1M9 r12 = this.A01;
                                if (r12 != null) {
                                    AnonymousClass1E7 A0E6 = r12.A0E(AnonymousClass3MX.A0m(this.A0B));
                                    if (A0E6 == null) {
                                        A1I = A1H(2131891527);
                                    } else {
                                        Object[] A1a = AnonymousClass3MW.A1a();
                                        C24921Me r02 = this.A02;
                                        if (r02 != null) {
                                            AnonymousClass3MX.A1N(r02, A0E6, A1a, 0);
                                            A1I = A1I(2131891526, A1a);
                                        } else {
                                            str = "waContactNames";
                                        }
                                    }
                                    A0E4.setText(A1I);
                                    C90044dR.A00(findViewById, this, 31);
                                    return;
                                }
                                str = "contactManager";
                            } else {
                                str = "emojiRichFormatterStaticCaller";
                            }
                        } else {
                            str = "sharedPreferencesFactory";
                        }
                    } else {
                        str = "whatsAppLocale";
                    }
                } else {
                    str = "systemServices";
                }
            } else {
                str = "emojiLoader";
            }
        } else {
            str = "abProps";
        }
        C18070vi.A11(str);
        throw null;
    }

    public GroupJoinRequestReasonBottomSheetFragment() {
        Integer num = AnonymousClass00R.A0C;
        this.A0B = AnonymousClass1DF.A00(num, new C104395Nz(this));
        this.A0C = AnonymousClass1DF.A00(num, new AnonymousClass5O0(this));
    }

    public int A25() {
        return 2132083614;
    }
}
