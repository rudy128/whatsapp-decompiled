package X;

import android.content.Context;
import java.util.Locale;

public class AR5 implements C72143Ku {
    public final AnonymousClass18O A00;
    public final AnonymousClass1NP A01;
    public final AnonymousClass1NT A02;
    public final AnonymousClass118 A03;
    public final C19830z4 A04;

    public void C0w(C171888sR r17) {
        int i;
        int i2;
        Context context = this.A03.A00;
        boolean z = false;
        if (C41371wF.A00(context) == 0) {
            z = true;
        }
        C171888sR r6 = r17;
        r6.A0K = Boolean.valueOf(z);
        r6.A1A = Long.valueOf(C24211Jh.A00(context, "com.google.android.gms"));
        r6.A02 = Boolean.valueOf(this.A00.A09(AnonymousClass18O.A0J));
        r6.A01 = Boolean.valueOf(C41361wE.A09(context));
        r6.A0v = Long.valueOf(AnonymousClass8BX.A06(this.A02.A04() ? 1 : 0));
        AnonymousClass1NP r8 = this.A01;
        int A032 = r8.A03();
        if (A032 == 0) {
            i = 0;
        } else if (A032 != 1) {
            int i3 = 2;
            if (A032 != 2) {
                i3 = 3;
                if (A032 != 3) {
                    i3 = 4;
                    if (A032 != 4) {
                        C17900vP.A0i("alarm-service/update-expensive-fieldstats/gdrive-backup/unexpected-frequency/", AnonymousClass000.A10(), A032);
                        i = Integer.valueOf(A032);
                    }
                }
            }
            i = Integer.valueOf(i3);
        } else {
            i = 1;
        }
        r6.A0h = i;
        C19830z4 r5 = this.A04;
        String A0f = r5.A0f();
        if (A0f != null) {
            long A0U = r5.A0U(A0f);
            if (!(A0U == 0 || A0U == -1)) {
                Locale locale = Locale.ENGLISH;
                Long valueOf = Long.valueOf(A0U);
                C108955ca.A1X("alarm-service/update-expensive-fieldstats/last-backup-timestamp/%d", locale, new Object[]{valueOf});
                r6.A1F = valueOf;
            }
            long A0V = r5.A0V(A0f);
            if (A0U != -1) {
                Locale locale2 = Locale.ENGLISH;
                Long valueOf2 = Long.valueOf(A0V);
                C108955ca.A1X("alarm-service/update-expensive-fieldstats/last-cloud-backup-size/%d", locale2, new Object[]{valueOf2});
                r6.A1G = valueOf2;
            }
            int A042 = r8.A04();
            if (A042 == 0) {
                i2 = 0;
            } else if (A042 != 1) {
                C17900vP.A0i("alarm-service/update-expensive-fieldstats/gdrive-backup/unexpected-network-setting/", AnonymousClass000.A10(), A042);
                i2 = Integer.valueOf(A042);
            } else {
                i2 = 1;
            }
            r6.A0g = i2;
        }
    }

    public AR5(AnonymousClass18O r1, AnonymousClass1NP r2, AnonymousClass1NT r3, AnonymousClass118 r4, C19830z4 r5) {
        this.A03 = r4;
        this.A00 = r1;
        this.A04 = r5;
        this.A02 = r3;
        this.A01 = r2;
    }
}
