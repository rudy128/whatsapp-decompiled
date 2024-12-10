package X;

import android.text.TextUtils;

/* renamed from: X.44Q  reason: invalid class name */
public class AnonymousClass44Q extends AnonymousClass8G3 {
    public final AnonymousClass1DT A00 = AnonymousClass3MW.A0L();

    public String A0T() {
        return "contact_support_submitted_p2p";
    }

    public String A0U() {
        return "contact_support_p2p";
    }

    public String A0V() {
        return "###### ";
    }

    public AnonymousClass44Q(AnonymousClass18O r2, AnonymousClass11P r3, AnonymousClass122 r4, C18030ve r5, BD4 bd4, C32551hN r7) {
        super(r2, r3, r4, r5, bd4, r7);
    }

    public void A0Z(String str) {
        AnonymousClass1DT r2;
        C85214Mn r1;
        super.A0Z(str);
        String A07 = this.A02.A07(AnonymousClass18O.A1Z);
        if (TextUtils.isEmpty(A07) || !C20128A8n.A08(str)) {
            boolean isEmpty = TextUtils.isEmpty(A07);
            r2 = this.A00;
            if (!isEmpty) {
                r1 = new C85214Mn(A07, (String) null);
            } else {
                r2.A0F((Object) null);
                return;
            }
        } else {
            r2 = this.A00;
            r1 = new C85214Mn(A07, str);
        }
        r2.A0F(r1);
    }
}
