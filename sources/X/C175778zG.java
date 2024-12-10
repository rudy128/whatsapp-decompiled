package X;

import android.content.Context;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.8zG  reason: invalid class name and case insensitive filesystem */
public class C175778zG extends C197889xR {
    public AnonymousClass8pS A00;
    public C22454B8m A01;
    public final AnonymousClass1KI A02;
    public final AnonymousClass1QL A03;
    public final AnonymousClass1QS A04;
    public final AZ6 A05;
    public final Context A06;
    public final AnonymousClass1KB A07;
    public final C18030ve A08;
    public final AnonymousClass1OZ A09;
    public final AXS A0A;
    public final C33711jG A0B;
    public final AnonymousClass90Z A0C;
    public final C30931ek A0D;

    public C175778zG(Context context, AnonymousClass1KB r3, AnonymousClass1KI r4, C18030ve r5, AnonymousClass1OZ r6, A7U a7u, AXS axs, AnonymousClass1QL r9, C33711jG r10, C31061ex r11, AnonymousClass1QS r12, C22454B8m b8m, AZ6 az6, AnonymousClass90Z r15, C30931ek r16) {
        super(a7u.A04, r11);
        this.A06 = context;
        this.A08 = r5;
        this.A07 = r3;
        this.A09 = r6;
        this.A0D = r16;
        this.A04 = r12;
        this.A03 = r9;
        this.A02 = r4;
        this.A0B = r10;
        this.A0A = axs;
        this.A05 = az6;
        this.A0C = r15;
        this.A01 = b8m;
    }

    public void A00(AnonymousClass8pS r30, B5W b5w, boolean z, boolean z2, boolean z3) {
        Log.i("PAY: IndiaUpiPaymentSetup registerVpa called");
        C196259ui r28 = this.A00;
        r28.A02("upi-register-vpa");
        AnonymousClass1OZ r27 = this.A09;
        String A0B2 = r27.A0B();
        String A012 = this.A0D.A01();
        AnonymousClass8pS r8 = r30;
        String str = (String) AnonymousClass8BT.A0q(r8.A05);
        String A0G = this.A0A.A0G();
        String str2 = (String) AnonymousClass8BT.A0q(r8.A08);
        String str3 = r8.A0E;
        String str4 = "0";
        if (z) {
            str4 = "1";
        }
        String str5 = "0";
        if (z2) {
            str5 = "1";
        }
        String str6 = "0";
        if (z3) {
            str6 = "1";
        }
        AnonymousClass3Ma.A1O(A012, 2, str);
        List A0N = C18070vi.A0N("0", "1", new String[2], 0, 1);
        List A0o = AnonymousClass8BX.A0o("0", "1", 2, 1);
        List A0o2 = AnonymousClass8BX.A0o("0", "1", 2, 1);
        C29591cX A0Y = C108955ca.A0Y();
        AnonymousClass8BY.A13(A0Y);
        AnonymousClass8BY.A15(A0Y, A0B2);
        C29591cX A0R = AnonymousClass8BS.A0R();
        C29591cX.A01(A0R, "action", "upi-register-vpa");
        if (AnonymousClass8BV.A1Y(A012, 1, false)) {
            C29591cX.A01(A0R, "device-id", A012);
        }
        if (C29601cY.A04(str, 1, 100000, false)) {
            C29591cX.A01(A0R, "upi-bank-info", str);
        }
        if (A0G != null && AnonymousClass8BV.A1V(A0G, 1, true)) {
            C29591cX.A01(A0R, "provider-type", A0G);
        }
        if (str2 != null && C29601cY.A04(str2, 1, 200, true)) {
            C29591cX.A01(A0R, "vpa", str2);
        }
        if (str3 != null && AnonymousClass8BV.A1W(str3, 1, true)) {
            C29591cX.A01(A0R, "vpa-id", str3);
        }
        A0R.A09(str4, "default-debit", A0N);
        A0R.A09(str5, "default-credit", A0o);
        A0R.A08(str6, "default-debit-p2m", A0o2);
        C29621ca A002 = C29591cX.A00(A0R, A0Y);
        this.A00 = r8;
        AZ6 az6 = this.A05;
        AnonymousClass90Z r5 = null;
        az6.A0A((A7B) null, 5, 0);
        boolean A052 = C18020vd.A05(C18040vf.A02, this.A08, 2227);
        String str7 = "in_upi_register_tag";
        if (A052) {
            this.A0C.A01(185475893, str7);
        }
        Context context = this.A06;
        AnonymousClass1KB r1 = this.A07;
        C33711jG r0 = this.A0B;
        if (A052) {
            r5 = this.A0C;
        } else {
            str7 = null;
        }
        AnonymousClass1OZ r02 = r27;
        AnonymousClass8BW.A1B(r02, new C175978za(context, r1, r0, r28, this, az6, b5w, r5, str7), A002, A0B2);
    }
}
