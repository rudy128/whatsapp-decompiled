package X;

import com.whatsapp.jid.DeviceJid;

/* renamed from: X.9ya  reason: invalid class name and case insensitive filesystem */
public final class C198589ya {
    public final int A00;
    public final C57652jQ A01;
    public final AnonymousClass11P A02;
    public final C18030ve A03;
    public final AnonymousClass18K A04;
    public final Integer A05;
    public final String A06 = C108985cd.A0f();

    public C198589ya(C57652jQ r3, AnonymousClass11P r4, C18030ve r5, AnonymousClass18K r6, DeviceJid deviceJid, String str) {
        Integer num;
        C18070vi.A0d(str, 1);
        C72473Md.A1M(r3, r4, r6, 3);
        C18070vi.A0d(r5, 6);
        this.A01 = r3;
        this.A02 = r4;
        this.A04 = r6;
        this.A03 = r5;
        int i = 21;
        switch (str.hashCode()) {
            case -1852384041:
                if (str.equals("hosted_device_pairing")) {
                    i = 39;
                    break;
                }
                break;
            case -1620833947:
                if (str.equals("smb_subscription_deactivated")) {
                    i = 25;
                    break;
                }
                break;
            case -1616921827:
                if (str.equals("syncd_error_during_bootstrap")) {
                    i = 18;
                    break;
                }
                break;
            case -1308281513:
                if (str.equals("unknown_companion")) {
                    i = 15;
                    break;
                }
                break;
            case -54013859:
                if (str.equals("critical_sync_timeout")) {
                    i = 5;
                    break;
                }
                break;
            case 998429839:
                if (str.equals("account_sync_timeout")) {
                    i = 13;
                    break;
                }
                break;
            case 1896208500:
                if (str.equals("syncd_failure")) {
                    i = 4;
                    break;
                }
                break;
            case 1985742918:
                if (str.equals("invalid_adv_status")) {
                    i = 12;
                    break;
                }
                break;
        }
        this.A00 = i;
        if (deviceJid != null) {
            num = Integer.valueOf(C72453Mb.A03(C62832s4.A00(deviceJid) ? 1 : 0));
        } else {
            num = null;
        }
        this.A05 = num;
    }

    public static final void A00(C198589ya r4, Long l, String str, int i) {
        C171348rZ r3 = new C171348rZ();
        r3.A04 = Long.valueOf(AnonymousClass11P.A00(r4.A02));
        r3.A06 = r4.A06;
        r3.A01 = Integer.valueOf(r4.A00);
        r3.A03 = Integer.valueOf(i);
        r3.A02 = C17880vN.A0h();
        r3.A00 = r4.A05;
        r3.A05 = l;
        r3.A07 = str;
        if (C18020vd.A05(C18040vf.A02, r4.A03, 12408)) {
            r4.A04.CC7(r3);
        } else {
            C17900vP.A0Y(r3, "CompanionDeviceUnpairingLogger/logEvent disabled: ", AnonymousClass000.A10());
        }
    }
}
