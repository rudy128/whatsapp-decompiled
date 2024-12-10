package com.whatsapp.calling.calllink.viewmodel;

import X.A69;
import X.AnonymousClass000;
import X.AnonymousClass00R;
import X.AnonymousClass11E;
import X.AnonymousClass1DT;
import X.AnonymousClass1J2;
import X.AnonymousClass1VF;
import X.AnonymousClass1VH;
import X.AnonymousClass1YL;
import X.AnonymousClass3MX;
import X.AnonymousClass6h1;
import X.AnonymousClass74H;
import X.AnonymousClass8A4;
import X.C108945cZ;
import X.C1417476u;
import X.C18070vi;
import X.C37361pP;
import android.os.Handler;
import android.os.Message;
import java.util.Set;

public class CallLinkViewModel extends AnonymousClass1J2 implements AnonymousClass8A4 {
    public final AnonymousClass1DT A00;
    public final AnonymousClass1DT A01;
    public final C37361pP A02;
    public final AnonymousClass11E A03;
    public final AnonymousClass1VF A04;
    public final AnonymousClass6h1 A05;

    public /* synthetic */ void BsT() {
    }

    public /* synthetic */ void Bwh() {
    }

    public static void A00(CallLinkViewModel callLinkViewModel, boolean z) {
        callLinkViewModel.A04.A00(AnonymousClass1VH.CALL_LINK);
        if (!callLinkViewModel.A03.A09()) {
            callLinkViewModel.A02.A04("saved_state_link", new C1417476u(AnonymousClass00R.A00, "", "", 3, 0, 2131101314, 0));
            return;
        }
        C37361pP r3 = callLinkViewModel.A02;
        Integer num = AnonymousClass00R.A00;
        AnonymousClass6h1 r4 = callLinkViewModel.A05;
        r3.A04("saved_state_link", new C1417476u(num, "", "", 0, 0, AnonymousClass1YL.A00(r4.A02.A00, 2130970340, 2131101312), 2131889110));
        r4.A01.A00(new A69(Message.obtain((Handler) null, 0, z ? 1 : 0, 0), "create_call_link"));
    }

    public void A0S() {
        AnonymousClass6h1 r1 = this.A05;
        Set set = r1.A03;
        set.remove(this);
        if (set.size() == 0) {
            r1.A00.unregisterObserver(r1);
        }
    }

    public void A0T(int i) {
        boolean z;
        C37361pP r3 = this.A02;
        boolean z2 = true;
        r3.A04("saved_state_is_video_requested", Boolean.valueOf(AnonymousClass000.A1P(i)));
        Boolean bool = (Boolean) r3.A02("saved_state_is_video");
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = true;
        }
        if (i != (!z)) {
            if (i != 0) {
                z2 = false;
            }
            A00(this, z2);
        }
    }

    public void Bn9() {
        this.A02.A04("saved_state_link", new C1417476u(AnonymousClass00R.A00, "", "", 2, 0, 2131101314, 0));
    }

    public void Bwg(String str, boolean z) {
        Integer num;
        C37361pP r2 = this.A02;
        r2.A04("saved_state_is_video", Boolean.valueOf(z));
        int i = 2131887686;
        if (z) {
            i = 2131887685;
        }
        String str2 = str;
        String A07 = AnonymousClass74H.A07(str, z);
        C18070vi.A0d(A07, 0);
        C18070vi.A0d(str, 0);
        if (z) {
            num = AnonymousClass00R.A01;
        } else {
            num = AnonymousClass00R.A00;
        }
        r2.A04("saved_state_link", new C1417476u(num, str2, A07, 1, i, 2131101314, 0));
    }

    public CallLinkViewModel(C37361pP r4, AnonymousClass1VF r5, AnonymousClass6h1 r6, AnonymousClass11E r7) {
        boolean z;
        AnonymousClass1DT A0S = C108945cZ.A0S();
        this.A01 = A0S;
        AnonymousClass1DT A0S2 = C108945cZ.A0S();
        this.A00 = A0S2;
        this.A05 = r6;
        r6.A03.add(this);
        this.A02 = r4;
        this.A03 = r7;
        this.A04 = r5;
        AnonymousClass3MX.A1J(A0S2, 2131887652);
        AnonymousClass3MX.A1J(A0S, 2131887683);
        AnonymousClass1DT A012 = this.A02.A01("saved_state_link");
        if (A012.A06() == null || ((C1417476u) A012.A06()).A03 != 1) {
            Boolean bool = (Boolean) this.A02.A02("saved_state_is_video");
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = true;
            }
            A00(this, z);
        }
    }
}
