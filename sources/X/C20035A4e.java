package X;

import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.A4e  reason: case insensitive filesystem */
public final class C20035A4e {
    public final C18030ve A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass11P A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;

    public static final void A01(C20035A4e a4e, UserJid userJid, Map map) {
        AnonymousClass1E2 A0C;
        long currentTimeMillis;
        AnonymousClass8oQ r5;
        UserJid userJid2 = userJid;
        Map map2 = map;
        if (!C18020vd.A05(C18040vf.A02, a4e.A00, 11287)) {
            currentTimeMillis = System.currentTimeMillis();
            A0C = null;
        } else {
            map.get(C179569Im.PARTNER_NAME);
            map.get(C179569Im.ENTRY_POINT_TYPE);
            if (userJid instanceof AnonymousClass1E2) {
                PhoneUserJid A0D = ((C24751Ln) a4e.A02.get()).A0D((AnonymousClass1E1) userJid2);
                if (A0D != null) {
                    r5 = new AnonymousClass8oQ((AnonymousClass1E2) userJid2, A0D, map, System.currentTimeMillis());
                    ((C30781eV) a4e.A04.get()).A01(r5);
                }
                return;
            } else if ((userJid instanceof PhoneUserJid) && (A0C = ((C24751Ln) a4e.A02.get()).A0C((PhoneUserJid) userJid2)) != null) {
                currentTimeMillis = System.currentTimeMillis();
            } else {
                return;
            }
        }
        r5 = new AnonymousClass8oQ(A0C, userJid2, map2, currentTimeMillis);
        ((C30781eV) a4e.A04.get()).A01(r5);
    }

    public static final void A00(C20035A4e a4e, AnonymousClass6RX r4, UserJid userJid, Integer num, String str, boolean z) {
        Integer num2;
        int A002 = C18020vd.A00(C18040vf.A02, a4e.A00, 12636);
        if (A002 == 1) {
            num2 = AnonymousClass00R.A01;
        } else if (A002 != 2) {
            num2 = AnonymousClass00R.A00;
        } else {
            num2 = AnonymousClass00R.A0C;
        }
        if (num2 == AnonymousClass00R.A00 || ((C30771eU) a4e.A05.get()).A02(userJid) != null) {
            AnonymousClass1D6[] r2 = new AnonymousClass1D6[1];
            C72463Mc.A1H(C179569Im.ENTRY_POINT_TYPE, String.valueOf(r4.value), r2);
            LinkedHashMap A0C = AnonymousClass1D7.A0C(r2);
            if (num != null) {
                A0C.put(C179569Im.ENTRY_POINT_SOURCE, num.toString());
            }
            if (str != null) {
                A0C.put(C179569Im.PARTNER_NAME, str);
            }
            if (!z) {
                A0C.put(C179569Im.AUTH_FAIL, "1");
            }
            A01(a4e, userJid, A0C);
        }
    }

    public final void A02(AnonymousClass6RX r3, UserJid userJid, Integer num, String str, String str2, String str3) {
        if (userJid != null) {
            ((AnonymousClass10I) this.A06.get()).CGF(new C21439Ak6(this, r3, userJid, num, str, str2, str3));
        }
    }

    public C20035A4e(AnonymousClass11P r1, C18030ve r2, AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7) {
        C18070vi.A0w(r3, r2, r1, r4, r5);
        C18070vi.A0l(r6, r7);
        this.A06 = r3;
        this.A00 = r2;
        this.A03 = r1;
        this.A02 = r4;
        this.A04 = r5;
        this.A05 = r6;
        this.A01 = r7;
    }
}
