package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass00H;
import X.AnonymousClass1DT;
import X.AnonymousClass1J2;
import X.AnonymousClass1KB;
import X.AnonymousClass1W2;
import X.AnonymousClass205;
import X.AnonymousClass206;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass4S9;
import X.AnonymousClass4aU;
import X.C18070vi;
import X.C24681Lg;
import X.C37361pP;
import X.C91804gH;
import X.C95144ll;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;

public final class MessageSelectionViewModel extends AnonymousClass1J2 {
    public final AnonymousClass1DT A00;
    public final AnonymousClass1DT A01;
    public final AnonymousClass1KB A02;
    public final C24681Lg A03;
    public final AnonymousClass00H A04;

    public final void A0T() {
        AnonymousClass3MX.A1J(this.A01, 0);
        AnonymousClass1DT r1 = this.A00;
        AnonymousClass4S9 r0 = (AnonymousClass4S9) r1.A06();
        if (r0 != null) {
            r0.A01();
            r1.A0F((Object) null);
        }
    }

    public final void A0U(int i) {
        AnonymousClass1DT r1 = this.A01;
        Number number = (Number) r1.A06();
        if (number != null && number.intValue() == 0) {
            AnonymousClass3MX.A1J(r1, i);
        }
    }

    public MessageSelectionViewModel(C37361pP r8, AnonymousClass1KB r9, C24681Lg r10, AnonymousClass00H r11) {
        ArrayList A042;
        C18070vi.A0s(r8, r9, r11, r10);
        this.A02 = r9;
        this.A04 = r11;
        this.A03 = r10;
        this.A01 = r8.A00(AnonymousClass3MY.A0f(), "selectionUiLiveData");
        Bundle bundle = (Bundle) r8.A02("selectedMessagesLiveData");
        AnonymousClass4S9 r4 = null;
        if (!(bundle == null || (A042 = AnonymousClass4aU.A04(bundle)) == null)) {
            r4 = new AnonymousClass4S9(this.A02, new C95144ll(this, 0), (AnonymousClass4S9) null, this.A03);
            Iterator it = A042.iterator();
            while (it.hasNext()) {
                AnonymousClass206 A012 = AnonymousClass1W2.A01((AnonymousClass205) it.next(), this.A04);
                if (A012 != null) {
                    r4.A03.put(A012.A0v, A012);
                }
            }
        }
        this.A00 = AnonymousClass3MW.A0M(r4);
        r8.A04.put("selectedMessagesLiveData", new C91804gH(this, 1));
    }
}
