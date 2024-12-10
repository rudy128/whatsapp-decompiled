package X;

import android.net.Uri;
import com.whatsapp.util.Log;

/* renamed from: X.2lU  reason: invalid class name and case insensitive filesystem */
public final class C58932lU {
    public C27301Vn A00;
    public C18030ve A01;

    public final String A00(AnonymousClass1E7 r2, AnonymousClass1Nb r3) {
        C42551yM r0;
        C18070vi.A0d(r3, 0);
        AnonymousClass1BI A002 = AnonymousClass1E7.A00(r2);
        if (A002 != null) {
            r0 = r3.A0a(A002);
        } else {
            r0 = null;
        }
        C43551zz r02 = (C43551zz) r0;
        if (r02 != null) {
            return r02.A0E();
        }
        return null;
    }

    public final String A01(AnonymousClass1E7 r2, AnonymousClass1Nb r3) {
        C42551yM r0;
        C18070vi.A0d(r3, 0);
        AnonymousClass1BI A002 = AnonymousClass1E7.A00(r2);
        if (A002 != null) {
            r0 = r3.A0a(A002);
        } else {
            r0 = null;
        }
        C43551zz r02 = (C43551zz) r0;
        if (r02 != null) {
            return r02.A0F();
        }
        return null;
    }

    public final String A02(AnonymousClass1E7 r13, AnonymousClass1Nb r14) {
        C42551yM r4;
        C18070vi.A0d(r14, 0);
        AnonymousClass1BI A002 = AnonymousClass1E7.A00(r13);
        if (A002 != null) {
            r4 = r14.A0a(A002);
        } else {
            r4 = null;
        }
        C43551zz r42 = (C43551zz) r4;
        if (C18020vd.A05(C18040vf.A02, this.A01, 6307)) {
            if (r42 == null) {
                return null;
            }
            C25201Nh r1 = r42.A00;
            String A0E = r1.A0E("voip_notification");
            if (A0E == null) {
                return r1.A0D((Uri) null, r1.A0F("voip_notification"), "voip_notification", (String) null, (String) null, (String) null, 4);
            }
            return A0E;
        } else if (r42 == null) {
            return null;
        } else {
            C25201Nh r43 = r42.A00;
            String A0E2 = r43.A0E("voip_notification");
            if (A0E2 != null) {
                String A012 = C25201Nh.A0N.A01(A0E2);
                if (!r43.A0U(A0E2)) {
                    return A0E2;
                }
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("NotificationChannelsManager26/repairVoIPNotificationChannel repairing channel:");
                String A07 = C22971Dz.A07(A012);
                if (A07 == null) {
                    A07 = "null";
                }
                C17890vO.A1A(A10, A07);
                try {
                    r43.A0R(A012);
                } catch (SecurityException unused) {
                    Log.w("NotificationChannelsManager26/repairVoIPNotificationChannel SecurityException in deleteNotificationChannel");
                    return A0E2;
                }
            }
            return r43.A0D((Uri) null, r43.A0F("voip_notification"), "voip_notification", (String) null, (String) null, (String) null, 4);
        }
    }

    public C58932lU(C27301Vn r1, C18030ve r2) {
        C18070vi.A0j(r2, r1);
        this.A01 = r2;
        this.A00 = r1;
    }
}
