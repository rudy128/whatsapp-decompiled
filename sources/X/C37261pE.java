package X;

import android.content.pm.PackageManager;
import com.whatsapp.util.Log;

/* renamed from: X.1pE  reason: invalid class name and case insensitive filesystem */
public class C37261pE {
    public final AnonymousClass1TM A00;
    public final AnonymousClass1HY A01;
    public final AnonymousClass00H A02 = C221618v.A00(C37271pF.class);
    public final C37251pD A03;

    public void A00(String str) {
        AnonymousClass18O r0 = this.A00.A00;
        AnonymousClass18R r2 = AnonymousClass18O.A0G;
        if (r0.A09(r2)) {
            C37251pD r1 = this.A03;
            if (r1.A01.A00.A09(r2)) {
                C37231pB r12 = r1.A02;
                try {
                    if (r12.A02.A01(str).A03) {
                        AnonymousClass00H r02 = (AnonymousClass00H) r12.A00.A00.get(str);
                        if (r02 != null) {
                            ((C123506Us) r02.get()).A03();
                        }
                        r12.A03.A00(str);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
                StringBuilder sb = new StringBuilder();
                sb.append("InstrumentationChangeDispatcher/verification failed, dropping event for package - ");
                sb.append(str);
                Log.w(sb.toString());
            }
            this.A01.A05(str);
        }
    }

    public C37261pE(C37251pD r2, AnonymousClass1TM r3, AnonymousClass1HY r4) {
        this.A01 = r4;
        this.A00 = r3;
        this.A03 = r2;
    }
}
