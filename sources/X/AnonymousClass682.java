package X;

import com.whatsapp.util.Log;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.682  reason: invalid class name */
public class AnonymousClass682 extends C123506Us {
    public static final AtomicInteger A0F = new AtomicInteger(0);
    public final AnonymousClass195 A00;
    public final AnonymousClass1HQ A01;
    public final AnonymousClass1TM A02;
    public final C138566xI A03;
    public final AnonymousClass1HY A04;
    public final C47612Jb A05;
    public final AnonymousClass683 A06;
    public final C47632Jd A07;
    public final C47622Jc A08;
    public final C37011op A09;
    public final AnonymousClass19T A0A;
    public final AnonymousClass10I A0B;
    public final String A0C = "com.facebook.stella";
    public final C37071ov A0D;
    public final C37211p9 A0E;

    public AnonymousClass682(AnonymousClass195 r2, AnonymousClass1HQ r3, AnonymousClass1TM r4, C138566xI r5, AnonymousClass1HY r6, C37071ov r7, C47612Jb r8, AnonymousClass683 r9, C37211p9 r10, C47632Jd r11, C47622Jc r12, C37011op r13, AnonymousClass19T r14, AnonymousClass10I r15) {
        this.A0B = r15;
        this.A01 = r3;
        this.A0A = r14;
        this.A03 = r5;
        this.A04 = r6;
        this.A05 = r8;
        this.A02 = r4;
        this.A00 = r2;
        this.A0E = r10;
        this.A08 = r12;
        this.A07 = r11;
        this.A06 = r9;
        this.A0D = r7;
        this.A09 = r13;
    }

    public static void A00(C127316e9 r4, AnonymousClass682 r5) {
        if (r4 != null) {
            try {
                C138566xI r3 = r5.A03;
                JSONObject A15 = C17880vN.A15();
                A15.put("action", r4.A00);
                A15.putOpt("payload", r4.A01);
                C138566xI.A00(r3, A15.toString(), r5.A0C, true);
            } catch (JSONException unused) {
                Log.e("StellaEventDispatcher/failed to create event");
            }
        }
    }

    public static void A01(AnonymousClass682 r3) {
        try {
            if (C18020vd.A05(C18040vf.A02, r3.A02.A01, 6408)) {
                A00(r3.A06.A00(r3.A09.A02(r3.A0C), r3.A01.BO3()), r3);
            }
        } catch (SecurityException e) {
            Log.e("StellaEventDispatcher/cannot create event for untrusted package", e);
        }
    }
}
