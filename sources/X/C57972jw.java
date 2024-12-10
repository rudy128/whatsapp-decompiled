package X;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;

/* renamed from: X.2jw  reason: invalid class name and case insensitive filesystem */
public final class C57972jw {
    public final AnonymousClass118 A00;
    public final C27301Vn A01;
    public final C26031Qo A02;
    public final C18030ve A03;
    public final AnonymousClass1VC A04;
    public final AnonymousClass1LU A05;

    public final void A00(boolean z, String str) {
        if (z) {
            if (C18020vd.A05(C18040vf.A02, this.A03, 8008)) {
                if (str != null) {
                    try {
                        AnonymousClass1VC r7 = this.A04;
                        long parseLong = Long.parseLong(str) * 1000;
                        C19830z4 r9 = r7.A02;
                        long j = C17890vO.A0B(r9).getLong("TOwmL_start_time_in_ms", 0);
                        if (j <= 0) {
                            j = AnonymousClass11P.A01(r7.A01);
                        }
                        C17880vN.A1D(C19830z4.A00(r9).putBoolean("TOwmL_is_active", true).putLong("TOwmL_start_time_in_ms", j), "TOwmL_end_time_in_ms", parseLong);
                        boolean A022 = r7.A02();
                        r7.A01();
                        if (!A022) {
                            r7.A00();
                            return;
                        }
                        return;
                    } catch (NumberFormatException e) {
                        C17900vP.A0e("Invalid timelock duration but isActive is true: ", str, AnonymousClass000.A10());
                        this.A02.A01(C80543xL.A02, AnonymousClass001.A1H("numberFormatEx ", str, AnonymousClass000.A10()), e);
                        return;
                    }
                } else {
                    Log.e("Timelock duration is null but isActive is true");
                    this.A02.A00(C80543xL.A02, "timeNull");
                    return;
                }
            }
        }
        AnonymousClass1VC r6 = this.A04;
        boolean A032 = r6.A03();
        C17880vN.A1F(C19830z4.A00(r6.A02).putBoolean("TOwmL_is_active", false).putLong("TOwmL_start_time_in_ms", 0).putLong("TOwmL_end_time_in_ms", 0), "TOwmL_is_visible", false);
        r6.A01();
        if (A032) {
            Context context = this.A00.A00;
            C18070vi.A0X(context);
            String A0F = C18070vi.A0F(context, 2131894902);
            String A0F2 = C18070vi.A0F(context, 2131894900);
            String A0F3 = C18070vi.A0F(context, 2131894901);
            Intent A023 = AnonymousClass1LU.A02(context);
            C1409673t A033 = C217217d.A03(context);
            A033.A0M = "critical_app_alerts@1";
            A033.A03 = 1;
            A033.A0F(A0F3);
            A033.A06(3);
            C17890vO.A0m(A033, A0F, A0F2, true);
            C17900vP.A0L(A033, A0F2);
            A033.A0A = C17880vN.A07(context, A023, 1);
            C17880vN.A1G(A033);
            C27301Vn r2 = this.A01;
            Notification A052 = A033.A05();
            C18070vi.A0X(A052);
            r2.BkR(96, A052);
        }
    }

    public C57972jw(AnonymousClass118 r2, C27301Vn r3, C26031Qo r4, C18030ve r5, AnonymousClass1VC r6, AnonymousClass1LU r7) {
        C18070vi.A0w(r5, r2, r7, r4, r3);
        C18070vi.A0d(r6, 6);
        this.A03 = r5;
        this.A00 = r2;
        this.A05 = r7;
        this.A02 = r4;
        this.A01 = r3;
        this.A04 = r6;
    }
}
