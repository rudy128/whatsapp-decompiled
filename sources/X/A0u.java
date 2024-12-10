package X;

import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class A0u {
    public AXS A00;
    public final C18100vl A01 = AnonymousClass1DF.A01(new C21958AvM(this));
    public final AnonymousClass11N A02;

    public final C195029sg A01(String str) {
        long j;
        C18070vi.A0d(str, 0);
        C18100vl r5 = this.A01;
        C195029sg r0 = (C195029sg) AnonymousClass8BV.A0n(str, r5);
        if (r0 != null) {
            j = r0.A00;
        } else {
            j = 0;
        }
        if (j < TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis())) {
            AnonymousClass3MW.A12(r5).remove(str);
            A00(this, AnonymousClass3MW.A12(r5));
        }
        return (C195029sg) AnonymousClass8BV.A0n(str, r5);
    }

    public final boolean A02() {
        C18100vl r6 = this.A01;
        Iterator A15 = AnonymousClass000.A15(AnonymousClass3MW.A12(r6));
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            if (((C195029sg) A16.getValue()).A00 < TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis())) {
                AnonymousClass3MW.A12(r6).remove(((C195029sg) A16.getValue()).A03);
                A00(this, AnonymousClass3MW.A12(r6));
            }
        }
        return AnonymousClass8BR.A1Y(AnonymousClass3MW.A12(r6));
    }

    public A0u(AnonymousClass11N r2, AXS axs) {
        C18070vi.A0j(axs, r2);
        this.A00 = axs;
        this.A02 = r2;
    }

    public static final void A00(A0u a0u, Map map) {
        JSONArray A1A = AnonymousClass8BR.A1A();
        try {
            Iterator A15 = AnonymousClass000.A15(map);
            while (A15.hasNext()) {
                C195029sg r4 = (C195029sg) C17890vO.A0P(A15);
                JSONObject A152 = C17880vN.A15();
                A152.put("credentialId", r4.A03);
                A152.put("internationalActivationStatus", r4.A02);
                A152.put("startTime", r4.A01);
                A152.put("endTime", r4.A00);
                A1A.put(A152);
            }
            AXS axs = a0u.A00;
            synchronized (axs) {
                AnonymousClass1QD r0 = axs.A01;
                C17880vN.A1E(AnonymousClass8BU.A07(r0), "payments_upi_international_status", A1A.toString());
            }
        } catch (JSONException unused) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs saveInternationalState threw: an exception ");
        }
    }
}
