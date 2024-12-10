package X;

import android.app.Activity;
import com.whatsapp.util.Log;

/* renamed from: X.68N  reason: invalid class name */
public final class AnonymousClass68N extends C144787Ir {
    public final C143877Fd A00;
    public final AnonymousClass10I A01;

    public AnonymousClass68N(Activity activity, AnonymousClass1KB r11, C24921Me r12, AnonymousClass1NM r13, AnonymousClass11Z r14, AnonymousClass18K r15, C143877Fd r16, AnonymousClass10I r17) {
        super(activity, r11, r12, r13, r14, (AnonymousClass1E7) null, r15);
        this.A00 = r16;
        this.A01 = r17;
    }

    public void BsD(C1409173o r6, C136996uk r7) {
        C143877Fd r1;
        int i;
        C18070vi.A0d(r6, 0);
        if (r6.A03()) {
            r1 = this.A00;
            synchronized (r1) {
                Log.i("gdpr/on-report-downloaded");
                i = 3;
                r1.A0D(i);
            }
        } else {
            int i2 = r6.A01;
            if (i2 == 5 || i2 == 8) {
                A01(new Object[0], i2, 2131889562, 2131890640);
                this.A01.CGF(new C146767Qn(this, 25));
            } else if (i2 == 4) {
                A01(new Object[0], i2, 2131889562, 2131891425);
            } else {
                A00(r6);
                r1 = this.A00;
                synchronized (r1) {
                    Log.i("gdpr/on-report-download-failed");
                    i = 4;
                    r1.A0D(i);
                }
            }
        }
        this.A00 = null;
    }
}
