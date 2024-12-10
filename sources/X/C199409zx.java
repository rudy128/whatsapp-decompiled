package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.9zx  reason: invalid class name and case insensitive filesystem */
public final class C199409zx {
    public final C26911Ty A00;
    public final C19830z4 A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass10I A04;

    public final void A01(BAC bac, String str, String str2) {
        BAC bac2 = bac;
        String str3 = str;
        if (str == null || AnonymousClass1YF.A0T(str) || str2 == null) {
            bac.Bts(AnonymousClass1D7.A0I());
            return;
        }
        this.A04.CGF(new C21456AkN(this, AnonymousClass8BR.A0X(str2), bac2, str3, 5));
    }

    public C199409zx(C26911Ty r1, C19830z4 r2, AnonymousClass10I r3, AnonymousClass00H r4, AnonymousClass00H r5) {
        C18070vi.A0w(r4, r1, r3, r2, r5);
        this.A02 = r4;
        this.A00 = r1;
        this.A04 = r3;
        this.A01 = r2;
        this.A03 = r5;
    }

    public static final void A00(BAC bac, C199409zx r4, C183899a0 r5, UserJid userJid, String str, String str2) {
        String str3;
        int hashCode = str.hashCode();
        String str4 = "in_pin_code_invalid";
        if (hashCode != -1930003499) {
            if (hashCode != -1867169789) {
                if (hashCode == 688255102 && str.equals("unserviceable_location")) {
                    str4 = "in_pin_code_not_servicable";
                }
            } else if (str.equals("success")) {
                bac.onSuccess();
                UserJid A0F = AnonymousClass8BV.A0F(userJid, r4.A03);
                if (r5 != null && (str3 = r5.A00) != null) {
                    C19830z4 r42 = r4.A01;
                    AnonymousClass8BX.A0z(C19830z4.A00(r42), "dc_user_postcode_", A0F.getRawString(), str2, AnonymousClass000.A10());
                    AnonymousClass8BX.A0z(C19830z4.A00(r42), "dc_location_name_", A0F.getRawString(), str3, AnonymousClass000.A10());
                    return;
                }
                return;
            }
        }
        bac.Bts(C108975cc.A0h("validation_errors", C108975cc.A0h("in_pin_code", str4)));
    }
}
