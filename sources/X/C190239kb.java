package X;

import android.content.Intent;
import java.util.GregorianCalendar;

/* renamed from: X.9kb  reason: invalid class name and case insensitive filesystem */
public final class C190239kb {
    public final C190699lN A00;
    public final A2C A01;

    public final void A00(Intent intent, AnonymousClass1FU r10, C22375B5e b5e) {
        C18070vi.A0d(intent, 1);
        long A06 = C108975cc.A06(intent, "dob_timestamp_ms");
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeInMillis(A06);
        this.A01.A02(new C20789AYs(r10, b5e, this), "kyc-recollect", (String) null, gregorianCalendar.get(1), gregorianCalendar.get(2), AnonymousClass8BT.A02(gregorianCalendar));
    }

    public C190239kb(A2C a2c, C190699lN r2) {
        C18070vi.A0j(a2c, r2);
        this.A01 = a2c;
        this.A00 = r2;
    }
}
