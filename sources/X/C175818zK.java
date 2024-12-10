package X;

import android.content.Context;
import android.text.TextUtils;
import com.whatsapp.voipcalling.CallLinkInfo;
import java.util.ArrayList;

/* renamed from: X.8zK  reason: invalid class name and case insensitive filesystem */
public class C175818zK extends C197889xR {
    public final Context A00;
    public final AnonymousClass1KB A01;
    public final AnonymousClass1KI A02;
    public final AnonymousClass1OZ A03;
    public final A7U A04;
    public final C33711jG A05;
    public final C195859u1 A06;
    public final A0B A07;
    public final String A08;
    public final C31061ex A09;

    public C175818zK(Context context, AnonymousClass1KB r3, AnonymousClass1KI r4, AnonymousClass1OZ r5, A7U a7u, C33711jG r7, C31061ex r8, C195859u1 r9, A0B a0b, C30931ek r11) {
        super(a7u.A04, r8);
        this.A00 = context;
        this.A01 = r3;
        this.A03 = r5;
        this.A08 = r11.A01();
        this.A04 = a7u;
        this.A07 = a0b;
        this.A09 = r8;
        this.A06 = r9;
        this.A02 = r4;
        this.A05 = r7;
    }

    public static void A00(C1418477e r3, C1418477e r4, C33661jB r5, C175818zK r6, String str, String str2) {
        ArrayList A13 = AnonymousClass000.A13();
        C17890vO.A11("action", "upi-remove-credential", A13);
        C17890vO.A11("vpa", AnonymousClass8BS.A0h(r3), A13);
        if (!TextUtils.isEmpty(str)) {
            C17890vO.A11("vpa-id", str, A13);
        }
        C17890vO.A11("upi-bank-info", (String) AnonymousClass8BT.A0q(r4), A13);
        C17890vO.A11("device-id", r6.A08, A13);
        C17890vO.A11("credential-id", str2, A13);
        r6.A09.A0C(r5, AnonymousClass8BX.A0P(A13));
    }

    public void A01(C1418477e r4, C1418477e r5, C33661jB r6, String str, String str2, boolean z, boolean z2) {
        ArrayList A13 = AnonymousClass000.A13();
        C17890vO.A11("action", "upi-edit-default-credential", A13);
        C17890vO.A11("vpa", AnonymousClass8BS.A0h(r4), A13);
        if (!TextUtils.isEmpty(str)) {
            C17890vO.A11("vpa-id", str, A13);
        }
        C17890vO.A11("upi-bank-info", (String) C20061A5k.A01(r5), A13);
        C17890vO.A11("device-id", this.A08, A13);
        C17890vO.A11("credential-id", str2, A13);
        C17890vO.A11(CallLinkInfo.DEFAULT_CALL_LINK_CALL_ID, Integer.toString(z ? 1 : 0), A13);
        C17890vO.A11("default-debit-p2m", Integer.toString(z2 ? 1 : 0), A13);
        this.A09.A0D(r6, AnonymousClass8BX.A0P(A13));
    }
}
