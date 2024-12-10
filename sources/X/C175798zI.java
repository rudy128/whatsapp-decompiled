package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.8zI  reason: invalid class name and case insensitive filesystem */
public class C175798zI extends C197889xR {
    public final AnonymousClass1QE A00 = AnonymousClass1QE.A00("IndiaUpiRegisterAliasAction", "network", "COMMON");
    public final AnonymousClass1KB A01;
    public final AnonymousClass118 A02;
    public final AZ6 A03;
    public final C30931ek A04;
    public final AnonymousClass00H A05;

    public C175798zI(AnonymousClass1KB r4, AnonymousClass118 r5, A7U a7u, C31061ex r7, AZ6 az6, C30931ek r9, AnonymousClass00H r10) {
        super(a7u.A04, r7);
        this.A02 = r5;
        this.A01 = r4;
        this.A04 = r9;
        this.A05 = r10;
        this.A03 = az6;
    }

    public static void A00(A7B a7b, C175798zI r3, String str) {
        AZ6 az6;
        int i;
        if (str.equalsIgnoreCase("add")) {
            az6 = r3.A03;
            i = 22;
        } else if (str.equalsIgnoreCase("port")) {
            az6 = r3.A03;
            i = 24;
        } else {
            return;
        }
        az6.Bi4(a7b, i);
    }

    public void A01(C1418477e r16, C1418477e r17, C22453B8l b8l, String str, String str2, String str3) {
        Log.i("PAY: registerAlias called");
        C196259ui r5 = this.A00;
        r5.A02("register-alias");
        ArrayList A13 = AnonymousClass000.A13();
        C17890vO.A11("alias_value", AnonymousClass8BS.A0h(r17), A13);
        C17890vO.A11("alias_type", str2, A13);
        String str4 = str;
        if (!TextUtils.isEmpty(str4)) {
            C17890vO.A11("vpa_id", str4, A13);
        }
        C1418477e r1 = r16;
        if (!C20061A5k.A02(r1)) {
            C17890vO.A11("vpa", (String) r1.A00, A13);
        }
        ArrayList A132 = AnonymousClass000.A13();
        C17890vO.A11("action", "register-alias", A132);
        C17890vO.A11("device_id", this.A04.A01(), A132);
        String str5 = str3;
        C17890vO.A11("op", str5, A132);
        this.A01.A0I(new C175888zR(this.A02.A00, this.A01, AnonymousClass8BR.A0a(this.A05), r5, b8l, this, str5), new C29621ca(AnonymousClass8BR.A0k("alias", AnonymousClass8BT.A1b(A13, 0)), "account", AnonymousClass8BT.A1b(A132, 0)), "set", 0);
    }
}
