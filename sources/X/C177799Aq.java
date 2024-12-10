package X;

import android.content.Intent;
import java.util.HashMap;

/* renamed from: X.9Aq  reason: invalid class name and case insensitive filesystem */
public class C177799Aq extends A34 {
    public final AnonymousClass9Y7 A00;
    public final AnonymousClass1QS A01;

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        String str;
        C19760yx r6 = (C19760yx) obj;
        if (r6 != null) {
            Object obj2 = r6.A01;
            C17960vV.A07(obj2);
            C20284AEs aEs = (C20284AEs) obj2;
            AnonymousClass1FY r4 = this.A00.A00;
            if (aEs == null) {
                AnonymousClass4Yv.A01(r4, 102);
                return;
            }
            HashMap A11 = C17880vN.A11();
            A11.put("credential_id", aEs.A0A);
            A11.put("last4", C20284AEs.A02(aEs));
            AnonymousClass8pY r2 = (AnonymousClass8pY) aEs.A08;
            if (r2 != null) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("");
                str = C17880vN.A0t(A10, r2.A04);
            } else {
                str = "-1";
            }
            A11.put("remaining_retries", str);
            Intent A03 = AnonymousClass8BS.A03(r4);
            A03.putExtra("screen_name", "brpay_p_reset_pin_from_card");
            A03.putExtra("screen_params", A11);
            r4.startActivity(A03);
            return;
        }
        AnonymousClass4Yv.A01(this.A00.A00, 102);
    }

    public C177799Aq(AnonymousClass9Y7 r1, AnonymousClass1QS r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
