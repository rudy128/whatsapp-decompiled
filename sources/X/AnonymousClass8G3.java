package X;

import com.whatsapp.util.Log;
import java.util.List;
import java.util.regex.Matcher;

/* renamed from: X.8G3  reason: invalid class name */
public abstract class AnonymousClass8G3 extends AnonymousClass1J2 {
    public String A00;
    public final AnonymousClass1DT A01;
    public final AnonymousClass18O A02;
    public final AnonymousClass11P A03;
    public final AnonymousClass122 A04;
    public final C18030ve A05;
    public final C20112A7u A06 = C20112A7u.A02();
    public final BD4 A07;
    public final C32551hN A08;
    public final C41731wy A09 = AnonymousClass3MW.A0o();

    public String A0T() {
        if (this instanceof C1768195t) {
            return "report_this_payment_submitted";
        }
        if (this instanceof C1768095s) {
            return "appeal_request_ack";
        }
        return "contact_ombudsman_submitted";
    }

    public String A0U() {
        if (this instanceof C1768195t) {
            return "report_this_payment";
        }
        if (this instanceof C1768095s) {
            return "restore_payment";
        }
        return "contact_ombudsman";
    }

    public String A0V() {
        if (this instanceof C1768195t) {
            return "### ";
        }
        if (this instanceof C1768095s) {
            return "#### ";
        }
        return null;
    }

    public void A0Z(String str) {
        this.A00 = str;
        this.A06.A07("transaction_id", str);
    }

    public AnonymousClass8G3(AnonymousClass18O r4, AnonymousClass11P r5, AnonymousClass122 r6, C18030ve r7, BD4 bd4, C32551hN r9) {
        AnonymousClass1DT A0L = AnonymousClass3MW.A0L();
        this.A01 = A0L;
        this.A05 = r7;
        this.A02 = r4;
        this.A03 = r5;
        this.A04 = r6;
        this.A08 = r9;
        this.A07 = bd4;
        A0L.A0F(new C184969bo(1));
    }

    public String A0W(String str, String str2) {
        StringBuilder A10 = AnonymousClass000.A10();
        String A0V = A0V();
        if (A0V != null) {
            A10.append(A0V);
            if (!AnonymousClass1EG.A0H(str)) {
                A10.append(str);
            }
            A10.append(10);
        }
        return AnonymousClass000.A0y(str2, A10);
    }

    public void A0X(String str) {
        C20112A7u A022 = C20112A7u.A02();
        A022.A07("product_flow", "p2m");
        A022.A05(this.A06);
        A022.A07("status", str);
        this.A07.BiM(A022, 114, A0U(), (String) null, 1);
    }

    public void A0Y(String str) {
        int i;
        if (str.getBytes().length >= 10) {
            Matcher A0z = AnonymousClass8BU.A0z(str, "[a-zA-Z\\u0080-\\u00ff]+");
            int i2 = 0;
            while (A0z.find()) {
                i2++;
                if (i2 >= 3) {
                    A0X("sent");
                    this.A01.A0F(new C184969bo(4));
                    boolean z = this instanceof C1767995r;
                    C18030ve r1 = this.A05;
                    if (z) {
                        i = 1925;
                    } else {
                        i = 1924;
                    }
                    String A0I = r1.A0I(i);
                    C17960vV.A07(A0I);
                    try {
                        C32551hN r2 = this.A08;
                        C22931Dv r0 = AnonymousClass1BI.A00;
                        this.A04.BBM(r2.A00(C22931Dv.A01(A0I), (AnonymousClass206) null, new C21320Ai5(), A0W(this.A00, str), (List) null, AnonymousClass11P.A01(this.A03)));
                        return;
                    } catch (AnonymousClass11T unused) {
                        Log.e("PAY: BrazilPaymentCareBaseViewModel - failed to send message to Payment Support Brazil JID");
                        return;
                    }
                }
            }
        }
        A0X("failed");
        this.A01.A0F(new C184969bo(2));
    }
}
