package com.whatsapp.settings.notificationsandsounds;

import X.AnonymousClass00H;
import X.AnonymousClass10I;
import X.AnonymousClass11S;
import X.AnonymousClass1BI;
import X.AnonymousClass1CJ;
import X.AnonymousClass1D6;
import X.AnonymousClass1DT;
import X.AnonymousClass1E9;
import X.AnonymousClass1EC;
import X.AnonymousClass1J2;
import X.AnonymousClass1MZ;
import X.AnonymousClass1Nb;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.C146527Pl;
import X.C146597Pw;
import X.C17880vN;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C22971Dz;
import X.C40811vJ;
import X.C41731wy;
import X.C42551yM;
import X.C55502fs;
import X.C72453Mb;
import X.C96314ne;
import com.whatsapp.jid.GroupJid;
import java.util.HashMap;

public final class NotificationsAndSoundsViewModel extends AnonymousClass1J2 {
    public AnonymousClass1BI A00;
    public final AnonymousClass1DT A01 = AnonymousClass3MW.A0L();
    public final AnonymousClass1DT A02 = AnonymousClass3MW.A0L();
    public final AnonymousClass1DT A03 = AnonymousClass3MW.A0L();
    public final C18030ve A04;
    public final AnonymousClass1Nb A05;
    public final C55502fs A06;
    public final C41731wy A07 = AnonymousClass3MW.A0o();
    public final AnonymousClass10I A08;
    public final C96314ne A09;
    public final AnonymousClass11S A0A;
    public final AnonymousClass1CJ A0B;
    public final AnonymousClass1MZ A0C;
    public final AnonymousClass00H A0D;

    public static final void A00(AnonymousClass1BI r10, NotificationsAndSoundsViewModel notificationsAndSoundsViewModel) {
        int i;
        int A062;
        boolean z = false;
        if (r10 == null) {
            notificationsAndSoundsViewModel.A03.A0E(C17880vN.A11());
            notificationsAndSoundsViewModel.A01.A0E(C17880vN.A11());
        } else {
            C55502fs r4 = notificationsAndSoundsViewModel.A06;
            r4.A03.execute(new C146527Pl(r4, r10, 33));
            AnonymousClass1Nb r2 = notificationsAndSoundsViewModel.A05;
            C42551yM A0a = r2.A0a(r10);
            if (true != A0a.A0V) {
                A0a.A0Q = A0a.A0C();
                A0a.A0V = true;
                AnonymousClass1Nb.A07(A0a, r2);
            }
            C42551yM A0a2 = r2.A0a(r10);
            HashMap A11 = C17880vN.A11();
            boolean z2 = r10 instanceof AnonymousClass1EC;
            if (z2) {
                if (C18020vd.A05(C18040vf.A02, notificationsAndSoundsViewModel.A04, 11088)) {
                    A11.put("jid_message_activity_level", String.valueOf(A0a2.A0A.value));
                }
            }
            A11.put("jid_message_mute", "");
            String A072 = A0a2.A07();
            C18070vi.A0X(A072);
            A11.put("jid_message_tone", A072);
            String A082 = A0a2.A08();
            C18070vi.A0X(A082);
            A11.put("jid_message_vibration", A082);
            A11.put("jid_message_advanced", "");
            HashMap A112 = C17880vN.A11();
            if (z2) {
                i = notificationsAndSoundsViewModel.A0C.A08.A0A((AnonymousClass1E9) r10);
            } else {
                i = 0;
            }
            C18030ve r6 = notificationsAndSoundsViewModel.A04;
            if (C40811vJ.A0J(notificationsAndSoundsViewModel.A0A, r6, i, false) && i > Math.min(64, C18020vd.A00(C18040vf.A02, r6, 4189))) {
                z = true;
            }
            if (C22971Dz.A0d(r10)) {
                String A032 = A0a2.A03();
                if (A032 != null) {
                    A112.put("jid_call_ringtone", A032);
                }
                String A042 = A0a2.A04();
                if (A042 != null) {
                    A112.put("jid_call_vibration", A042);
                }
            }
            if (!(!C22971Dz.A0W(r10) || (A062 = notificationsAndSoundsViewModel.A0B.A06((GroupJid) r10)) == 1 || A062 == 3)) {
                if (notificationsAndSoundsViewModel.A0C.A08.A0A((AnonymousClass1E9) r10) > 2 && C18020vd.A05(C18040vf.A02, r6, 7481)) {
                    A112.put("jid_call_mute", "");
                }
            }
            notificationsAndSoundsViewModel.A03.A0E(A11);
            notificationsAndSoundsViewModel.A01.A0E(A112);
        }
        AnonymousClass3MY.A1M(notificationsAndSoundsViewModel.A02, z);
    }

    public final void A0T(String str, String str2) {
        String str3 = str2;
        C18070vi.A0d(str2, 1);
        AnonymousClass1BI r3 = this.A00;
        if (r3 != null) {
            this.A08.CGF(new C146597Pw(this, r3, str, str3, 13));
            this.A07.A0F(AnonymousClass1D6.A01(str, str2));
        }
    }

    public void A0S() {
        C17880vN.A0V(this.A0D).unregisterObserver(this.A09);
    }

    public NotificationsAndSoundsViewModel(AnonymousClass11S r3, AnonymousClass1CJ r4, AnonymousClass1MZ r5, C18030ve r6, AnonymousClass1Nb r7, C55502fs r8, AnonymousClass10I r9, AnonymousClass00H r10) {
        C18070vi.A0w(r6, r3, r9, r4, r7);
        C18070vi.A0q(r5, r10, r8);
        this.A04 = r6;
        this.A0A = r3;
        this.A08 = r9;
        this.A0B = r4;
        this.A05 = r7;
        this.A0C = r5;
        this.A0D = r10;
        this.A06 = r8;
        C96314ne r0 = new C96314ne(this, 23);
        this.A09 = r0;
        C72453Mb.A1Q(r10, r0);
    }
}
