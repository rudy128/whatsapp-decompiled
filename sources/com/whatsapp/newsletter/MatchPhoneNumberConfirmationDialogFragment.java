package com.whatsapp.newsletter;

import X.AnonymousClass00R;
import X.AnonymousClass1DF;
import X.AnonymousClass1FL;
import X.AnonymousClass1GP;
import X.AnonymousClass3MY;
import X.AnonymousClass4a6;
import X.AnonymousClass4bB;
import X.AnonymousClass5PW;
import X.C010105w;
import X.C17890vO;
import X.C18100vl;
import X.C21356Ail;
import X.C72463Mc;
import X.C73203Rj;
import X.C83004Cz;
import X.C90054dS;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.whatsapp.phonematching.CountryAndPhoneNumberFragment;
import com.whatsapp.phonematching.MatchPhoneNumberFragment;

public final class MatchPhoneNumberConfirmationDialogFragment extends Hilt_MatchPhoneNumberConfirmationDialogFragment {
    public final C18100vl A00 = AnonymousClass1DF.A00(AnonymousClass00R.A0C, new AnonymousClass5PW(this, C83004Cz.NONE));

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r2 = r0.A1E();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDismiss(android.content.DialogInterface r4) {
        /*
            r3 = this;
            androidx.fragment.app.Fragment r0 = r3.A0E
            if (r0 == 0) goto L_0x001c
            X.1GP r2 = r0.A1E()
            r0 = 2131433788(0x7f0b193c, float:1.8489372E38)
            androidx.fragment.app.Fragment r1 = r2.A0O(r0)
            if (r1 == 0) goto L_0x001c
            X.1jj r0 = new X.1jj
            r0.<init>(r2)
            r0.A07(r1)
            r0.A01()
        L_0x001c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.newsletter.MatchPhoneNumberConfirmationDialogFragment.onDismiss(android.content.DialogInterface):void");
    }

    public static final MatchPhoneNumberFragment A00(MatchPhoneNumberConfirmationDialogFragment matchPhoneNumberConfirmationDialogFragment) {
        Fragment fragment;
        AnonymousClass1GP supportFragmentManager;
        AnonymousClass1FL A1B = matchPhoneNumberConfirmationDialogFragment.A1B();
        if (A1B == null || (supportFragmentManager = A1B.getSupportFragmentManager()) == null) {
            fragment = null;
        } else {
            fragment = supportFragmentManager.A0O(2131433788);
        }
        if (fragment instanceof MatchPhoneNumberFragment) {
            return (MatchPhoneNumberFragment) fragment;
        }
        return null;
    }

    public static final void A01(MatchPhoneNumberConfirmationDialogFragment matchPhoneNumberConfirmationDialogFragment) {
        String str;
        boolean z;
        View view;
        MatchPhoneNumberFragment A002 = A00(matchPhoneNumberConfirmationDialogFragment);
        if (A002 != null) {
            int A26 = A002.A26();
            MatchPhoneNumberFragment A003 = A00(matchPhoneNumberConfirmationDialogFragment);
            if (A26 != 1) {
                if (A003 != null) {
                    str = A003.A27(A26);
                } else {
                    str = null;
                }
                boolean z2 = false;
                switch (A26) {
                    case 2:
                    case 3:
                        z = false;
                        break;
                    default:
                        z = true;
                        break;
                }
                if (A26 == 2) {
                    z2 = true;
                }
                MatchPhoneNumberFragment A004 = A00(matchPhoneNumberConfirmationDialogFragment);
                if (str == null) {
                    if (A004 != null) {
                        str = AnonymousClass3MY.A0n(matchPhoneNumberConfirmationDialogFragment, 2131896261);
                    } else {
                        return;
                    }
                } else if (A004 == null) {
                    return;
                }
                if (z) {
                    TextView textView = A004.A03;
                    if (textView != null) {
                        textView.setVisibility(0);
                    }
                    TextView textView2 = A004.A03;
                    if (textView2 != null) {
                        textView2.setText(str);
                    }
                    view = A004.A06;
                } else {
                    if (z2) {
                        CountryAndPhoneNumberFragment.A01(A004, true);
                        TextView textView3 = A004.A01;
                        if (textView3 != null) {
                            textView3.setText(str);
                        }
                    }
                    view = A004.A00;
                }
                if (view != null) {
                    view.requestFocus();
                }
            } else if (A003 != null) {
                A003.A28();
            }
        }
    }

    public void A1v() {
        C010105w r1;
        super.A1v();
        Dialog dialog = this.A03;
        if ((dialog instanceof C010105w) && (r1 = (C010105w) dialog) != null) {
            Button button = r1.A00.A0H;
            C72463Mc.A0w(r1.getContext(), r1.getContext(), button, 2130970927, 2131102371);
            C90054dS.A00(button, this, 29);
        }
        A00(this);
        C17890vO.A0D().postDelayed(new C21356Ail(this, 11), 100);
    }

    public Dialog A27(Bundle bundle) {
        int i;
        int i2;
        AnonymousClass1FL A1D = A1D();
        View A0D = AnonymousClass3MY.A0D(LayoutInflater.from(A1D), 2131625380);
        C73203Rj A002 = AnonymousClass4a6.A00(A1D);
        C18100vl r5 = this.A00;
        int ordinal = ((C83004Cz) r5.getValue()).ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                i = 2131892901;
            }
            return AnonymousClass3MY.A0L(A002);
        }
        i = 2131889325;
        A002.A0D(i);
        A002.A0c(A0D);
        A002.A0T(false);
        A002.A0X(new AnonymousClass4bB(this, 29), 2131898766);
        int ordinal2 = ((C83004Cz) r5.getValue()).ordinal();
        if (ordinal2 != 0) {
            if (ordinal2 == 1) {
                i2 = 2131892900;
            }
            return AnonymousClass3MY.A0L(A002);
        }
        i2 = 2131898874;
        C73203Rj.A0A(A002, this, 30, i2);
        return AnonymousClass3MY.A0L(A002);
    }
}
