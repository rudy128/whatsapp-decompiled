package com.whatsapp.registration.timers;

import X.AnonymousClass000;
import X.AnonymousClass1CM;
import X.AnonymousClass1DS;
import X.AnonymousClass1DT;
import X.AnonymousClass1J2;
import X.AnonymousClass3MW;
import X.AnonymousClass8BT;
import X.C161158Ca;
import X.C17880vN;
import X.C17890vO;
import X.C18070vi;
import android.os.CountDownTimer;
import java.util.Iterator;
import java.util.Map;

public final class RetryCodeCountdownTimersViewModel extends AnonymousClass1J2 {
    public boolean A00;
    public final AnonymousClass1DS A01;
    public final AnonymousClass1DT A02;
    public final AnonymousClass1CM A03;
    public final Map A04 = C17880vN.A13();
    public final Map A05 = C17880vN.A13();
    public final Map A06 = C17880vN.A13();

    public RetryCodeCountdownTimersViewModel(AnonymousClass1CM r2) {
        C18070vi.A0d(r2, 1);
        this.A03 = r2;
        AnonymousClass1DT A0M = AnonymousClass3MW.A0M(C17890vO.A0L());
        this.A02 = A0M;
        this.A01 = A0M;
    }

    public final AnonymousClass1DT A0T(String str, long j) {
        if (1 <= j && j < 3000) {
            return null;
        }
        if (j < 0) {
            AnonymousClass8BT.A1O(str, this.A04, -1000);
            return null;
        }
        this.A00 = str.equals("email_capture");
        Map map = this.A06;
        if (map.containsKey(str)) {
            CountDownTimer countDownTimer = (CountDownTimer) map.get(str);
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            AnonymousClass8BT.A1O(str, this.A04, 0);
        }
        Map map2 = this.A05;
        Object obj = map2.get(str);
        if (obj == null) {
            obj = AnonymousClass3MW.A0L();
            map2.put(str, obj);
        }
        AnonymousClass1DT r5 = (AnonymousClass1DT) obj;
        r5.A0E("running");
        map2.put(str, r5);
        C161158Ca r4 = new C161158Ca(r5, this, str, j);
        r4.start();
        map.put(str, r4);
        return r5;
    }

    public final void A0U() {
        Map map = this.A06;
        Iterator A15 = AnonymousClass000.A15(map);
        while (A15.hasNext()) {
            ((CountDownTimer) C17890vO.A0P(A15)).cancel();
        }
        map.clear();
        this.A04.clear();
        this.A02.A0E(Long.MAX_VALUE);
    }

    public final void A0V(String str) {
        Map map = this.A06;
        CountDownTimer countDownTimer = (CountDownTimer) map.get(str);
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        map.remove(str);
        this.A04.remove(str);
    }

    public void A0S() {
        A0U();
    }
}
