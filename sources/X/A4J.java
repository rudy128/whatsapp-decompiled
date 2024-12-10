package X;

import android.os.SystemClock;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class A4J {
    public C189189if A00 = null;
    public C22414B6w A01 = null;
    public C20132A8s A02 = null;
    public final ALM A03;
    public final C20368AHy A04;
    public final C22358B4m A05;
    public final AnonymousClass9Z8 A06;
    public final C191469me A07;
    public final AtomicLong A08 = new AtomicLong();
    public final AtomicReference A09 = new AtomicReference(C198009xd.A02);
    public final AtomicReference A0A = new AtomicReference();

    public static String A00(String str, int i) {
        String str2;
        boolean A1T = AnonymousClass000.A1T(i, 2);
        StringBuilder A10 = AnonymousClass000.A10();
        if (A1T) {
            str2 = "cc_";
        } else {
            str2 = "nc_";
        }
        return AnonymousClass001.A1H(str2, str, A10);
    }

    public A4J(ALM alm, C20368AHy aHy, C22358B4m b4m) {
        C191469me r0 = C25995CqB.A00().A09;
        this.A07 = r0;
        this.A06 = r0.A00;
        this.A03 = alm;
        this.A04 = aHy;
        this.A05 = b4m;
        SystemClock.elapsedRealtime();
    }

    public static void A01(C198009xd r11, C20132A8s a8s) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C20132A8s a8s2 = a8s;
        if (r11.A01.A00) {
            Iterator A0i = C17890vO.A0i(C17880vN.A11());
            while (A0i.hasNext()) {
                Map.Entry A16 = AnonymousClass000.A16(A0i);
                a8s.A0I(C17880vN.A0x(A16), C17880vN.A05(A16.getValue()));
            }
            HashMap A11 = C17880vN.A11();
            if ("".length() > 0) {
                A11.put("fb_request_id", "");
            }
            Iterator A0i2 = C17890vO.A0i(A11);
            while (A0i2.hasNext()) {
                Map.Entry A162 = AnonymousClass000.A16(A0i2);
                a8s.A0J(C17880vN.A0x(A162), AnonymousClass8BR.A10(A162));
            }
        }
        if (r11.A00 != 2) {
            a8s.A0G("bloks_query");
        } else {
            a8s2.A0B(0, "bloks_query", true, elapsedRealtime);
        }
    }
}
