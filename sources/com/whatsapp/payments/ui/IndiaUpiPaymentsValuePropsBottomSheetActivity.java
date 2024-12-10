package com.whatsapp.payments.ui;

import X.AFP;
import X.AZ6;
import X.AnonymousClass000;
import X.AnonymousClass1FL;
import X.AnonymousClass1HF;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass8BS;
import X.AnonymousClass8BU;
import X.C1763492f;
import X.C17880vN;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C20112A7u;
import X.C20750AXf;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextSwitcher;
import android.widget.TextView;

public class IndiaUpiPaymentsValuePropsBottomSheetActivity extends C1763492f {
    public C18030ve A00;

    public class BottomSheetValuePropsFragment extends Hilt_IndiaUpiPaymentsValuePropsBottomSheetActivity_BottomSheetValuePropsFragment {
        public C18030ve A00;

        public static IndiaUpiPaymentsValuePropsBottomSheetActivity A00(BottomSheetValuePropsFragment bottomSheetValuePropsFragment) {
            AnonymousClass1FL A1B = bottomSheetValuePropsFragment.A1B();
            if (A1B == null || A1B.isFinishing() || !(A1B instanceof IndiaUpiPaymentsValuePropsBottomSheetActivity)) {
                return null;
            }
            return (IndiaUpiPaymentsValuePropsBottomSheetActivity) A1B;
        }

        public void A1K() {
            super.A1K();
            IndiaUpiPaymentsValuePropsBottomSheetActivity A002 = A00(this);
            if (A002 != null) {
                A002.A52();
            }
            IndiaUpiPaymentsValuePropsBottomSheetActivity A003 = A00(this);
            if (A003 != null) {
                A003.finish();
            }
        }

        public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View inflate = layoutInflater.inflate(2131625671, viewGroup, false);
            View A06 = AnonymousClass8BS.A06(inflate);
            IndiaUpiPaymentsValuePropsBottomSheetActivity A002 = A00(this);
            if (A002 != null) {
                AFP.A00(A06, this, 31);
                TextView A0J = AnonymousClass3MW.A0J(inflate, 2131436208);
                TextView A0J2 = AnonymousClass3MW.A0J(inflate, 2131436252);
                TextView A0J3 = AnonymousClass3MW.A0J(inflate, 2131435862);
                ImageView A0G = AnonymousClass3MW.A0G(inflate, 2131432251);
                TextView A0J4 = AnonymousClass3MW.A0J(inflate, 2131436656);
                View A062 = AnonymousClass1HF.A06(inflate, 2131436653);
                TextSwitcher textSwitcher = (TextSwitcher) AnonymousClass1HF.A06(inflate, 2131436655);
                TextView A0J5 = AnonymousClass3MW.A0J(inflate, 2131436654);
                if (A002.A02 == 2) {
                    A0J5.setText(2131887451);
                    A062.setVisibility(8);
                    A0J4.setText(2131894230);
                    textSwitcher.setText(A1H(2131894229));
                    A002.A54((Long) null);
                    if (A002.A0I != null) {
                        A002.A0S.A0C(C17880vN.A0h(), 55, "chat", A002.A0f, A002.A0m, A002.A0l, AnonymousClass000.A1T(A002.A02, 11));
                    }
                } else {
                    if (A002.A10) {
                        AnonymousClass8BU.A16(A062, A0J4, textSwitcher, 8);
                        AnonymousClass3MW.A1S(A0J);
                        A0J5.setText(2131886501);
                        AnonymousClass8BU.A16(A0J2, A0J3, A0G, 0);
                        if (C18020vd.A05(C18040vf.A02, this.A00, 10659)) {
                            A0G.setImageResource(2131233628);
                            A0J2.setText(2131893953);
                            A0J3.setText(2131893952);
                        }
                    } else if (A002.A56()) {
                        AnonymousClass8BU.A16(A06, A0J4, A062, 8);
                        textSwitcher.setVisibility(8);
                        A0J.setVisibility(8);
                        A0J2.setText(2131894232);
                        A0J3.setText(Html.fromHtml(A1H(2131894231)));
                        A0J5.setText(2131897410);
                        A0J2.setVisibility(0);
                        A0J3.setVisibility(0);
                    } else {
                        A002.A53(textSwitcher);
                        if (A002.A02 == 11) {
                            A0J4.setText(2131894233);
                            AnonymousClass3MY.A1A(inflate, 2131436657, 0);
                        }
                    }
                    C20112A7u A03 = C20112A7u.A03(new C20112A7u[0]);
                    AZ6 az6 = A002.A0S;
                    String A50 = A002.A50();
                    String str = A002.A0f;
                    boolean A1T = AnonymousClass000.A1T(A002.A02, 11);
                    az6.BiJ(C20750AXf.A00((Uri) A002.getIntent().getParcelableExtra("extra_deep_link_url"), A03), (Integer) null, A50, str, A002.A0m, A002.A0l, 0, false, A1T, false);
                }
                AFP.A00(A0J5, A002, 32);
            }
            return inflate;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
            if (r1 == false) goto L_0x000d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void A2I(X.C139436yq r3) {
            /*
                r2 = this;
                com.whatsapp.payments.ui.IndiaUpiPaymentsValuePropsBottomSheetActivity r0 = A00(r2)
                if (r0 == 0) goto L_0x000d
                boolean r1 = r0.A56()
                r0 = 1
                if (r1 != 0) goto L_0x000e
            L_0x000d:
                r0 = 0
            L_0x000e:
                r3.A01(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.IndiaUpiPaymentsValuePropsBottomSheetActivity.BottomSheetValuePropsFragment.A2I(X.6yq):void");
        }
    }

    public boolean A56() {
        if (!C18020vd.A05(C18040vf.A02, this.A00, 8989) || !"payment_composer_icon".equals(this.A0f)) {
            return false;
        }
        return true;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        CMl(new Hilt_IndiaUpiPaymentsValuePropsBottomSheetActivity_BottomSheetValuePropsFragment());
    }
}
