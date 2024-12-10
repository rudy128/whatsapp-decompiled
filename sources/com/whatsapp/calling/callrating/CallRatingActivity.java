package com.whatsapp.calling.callrating;

import X.AnonymousClass000;
import X.AnonymousClass1DF;
import X.AnonymousClass1FP;
import X.AnonymousClass1VE;
import X.AnonymousClass1YF;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass5MJ;
import X.C101445Cq;
import X.C101455Cr;
import X.C101465Cs;
import X.C105055Qn;
import X.C17880vN;
import X.C17890vO;
import X.C17960vV;
import X.C18100vl;
import X.C72453Mb;
import X.C84734Kq;
import X.C99274sY;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.calling.callrating.viewmodel.CallRatingViewModel;
import com.whatsapp.fieldstats.events.WamCall;
import java.util.HashSet;
import java.util.Iterator;

public class CallRatingActivity extends AnonymousClass1FP {
    public final C18100vl A00 = AnonymousClass1DF.A01(new C101445Cq(this));
    public final C18100vl A01 = C99274sY.A00(new C101465Cs(this), new C101455Cr(this), new AnonymousClass5MJ(this), AnonymousClass3MW.A15(CallRatingViewModel.class));

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle A09 = AnonymousClass3MY.A09(this);
        if (A09 == null || !AnonymousClass3MX.A0Z(this.A01).A0U(A09)) {
            finish();
        }
        ((DialogFragment) this.A00.getValue()).A2C(getSupportFragmentManager(), "CallRatingBottomSheet");
        AnonymousClass3MY.A1K(this, AnonymousClass3MX.A0Z(this.A01).A04, new C105055Qn(this), 19);
    }

    public void onStop() {
        String str;
        String str2;
        super.onStop();
        if (!isChangingConfigurations()) {
            CallRatingViewModel A0Z = AnonymousClass3MX.A0Z(this.A01);
            WamCall wamCall = A0Z.A00;
            if (wamCall != null) {
                HashSet hashSet = A0Z.A0E;
                if (!hashSet.isEmpty()) {
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        int A0H = C72453Mb.A0H(it);
                        C84734Kq r2 = A0Z.A08;
                        boolean z = false;
                        if (A0H <= 51) {
                            z = true;
                        }
                        C17960vV.A0G(z, "MAX_PERMISSIBLE_INDEX to set is 51");
                        r2.A00 |= 1 << A0H;
                    }
                    WamCall wamCall2 = A0Z.A00;
                    if (wamCall2 != null) {
                        wamCall2.userProblems = Long.valueOf(A0Z.A08.A00);
                    }
                }
                String str3 = A0Z.A02;
                String str4 = null;
                if (str3 == null || !(!AnonymousClass1YF.A0T(str3))) {
                    str = null;
                } else {
                    str = A0Z.A02;
                }
                wamCall.userDescription = str;
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("CallRatingViewModel/userRating: ");
                A10.append(wamCall.userRating);
                A10.append(", userDescription: ");
                A10.append(wamCall.userDescription);
                A10.append(", userProblem binary: ");
                Long l = wamCall.userProblems;
                if (l != null) {
                    str4 = Long.toBinaryString(l.longValue());
                }
                A10.append(str4);
                A10.append(", timeSeriesDir: ");
                C17890vO.A1A(A10, A0Z.A01);
                A0Z.A09.A02(wamCall, A0Z.A03);
                AnonymousClass1VE r1 = A0Z.A07;
                WamCall wamCall3 = A0Z.A00;
                if (wamCall3 != null) {
                    str2 = wamCall3.callRandomId;
                } else {
                    str2 = null;
                }
                C17880vN.A1E(AnonymousClass3MZ.A08(r1), "call_rating_last_call", str2);
                String str5 = A0Z.A01;
                if (str5 != null) {
                    A0Z.A0A.A07(wamCall, AnonymousClass3MZ.A15(A0Z.A0B, 11081), str5);
                }
            }
            finish();
        }
    }
}
