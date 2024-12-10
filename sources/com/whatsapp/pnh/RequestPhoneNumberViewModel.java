package com.whatsapp.pnh;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10I;
import X.AnonymousClass129;
import X.AnonymousClass1DT;
import X.AnonymousClass1E2;
import X.AnonymousClass1J2;
import X.AnonymousClass1RL;
import X.AnonymousClass3MW;
import X.C17890vO;
import X.C18070vi;
import X.C24751Ln;
import X.C33251iW;
import X.C72463Mc;
import X.C87244Uv;
import android.net.Uri;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public final class RequestPhoneNumberViewModel extends AnonymousClass1J2 {
    public final Uri A00;
    public final AnonymousClass1DT A01 = AnonymousClass3MW.A0L();
    public final C33251iW A02;
    public final C24751Ln A03;
    public final AnonymousClass1RL A04;
    public final AnonymousClass10I A05;
    public final AnonymousClass00H A06;
    public final Map A07;

    public static final void A00(AnonymousClass1E2 r7, RequestPhoneNumberViewModel requestPhoneNumberViewModel) {
        AnonymousClass1DT r2 = requestPhoneNumberViewModel.A01;
        Uri uri = requestPhoneNumberViewModel.A00;
        AnonymousClass1E2 r5 = r7;
        boolean A1W = AnonymousClass000.A1W(requestPhoneNumberViewModel.A03.A0D(r7));
        AnonymousClass1RL r1 = requestPhoneNumberViewModel.A04;
        r2.A0E(new C87244Uv(uri, r5, A1W, C72463Mc.A1Y(r1.A06(r7)), r1.A09(r5)));
    }

    public void A0S() {
        Map map = this.A07;
        Iterator A15 = AnonymousClass000.A15(map);
        while (A15.hasNext()) {
            Object A0P = C17890vO.A0P(A15);
            AnonymousClass1RL r1 = this.A04;
            C18070vi.A0d(A0P, 0);
            Set set = r1.A08;
            synchronized (set) {
                set.remove(A0P);
            }
        }
        map.clear();
    }

    public RequestPhoneNumberViewModel(C33251iW r2, C24751Ln r3, AnonymousClass1RL r4, AnonymousClass129 r5, AnonymousClass10I r6, AnonymousClass00H r7) {
        C18070vi.A0w(r5, r6, r2, r3, r4);
        C18070vi.A0d(r7, 6);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.A05 = r6;
        this.A02 = r2;
        this.A03 = r3;
        this.A04 = r4;
        this.A06 = r7;
        this.A07 = concurrentHashMap;
        Uri A032 = r5.A03("626403979060997");
        C18070vi.A0X(A032);
        this.A00 = A032;
    }
}
