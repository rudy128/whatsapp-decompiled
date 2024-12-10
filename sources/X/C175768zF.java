package X;

import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.8zF  reason: invalid class name and case insensitive filesystem */
public class C175768zF extends C197889xR {
    public BBA A00;
    public final Context A01;
    public final AnonymousClass1KB A02;
    public final AnonymousClass1KI A03;
    public final C18030ve A04;
    public final AnonymousClass1OZ A05;
    public final A7U A06;
    public final C33711jG A07;
    public final AnonymousClass1QS A08;
    public final AZ6 A09;
    public final AnonymousClass90Z A0A;

    public void A00(String str, String str2) {
        Log.i("PAY: IndiaUpiPaymentSetup createPaymentAccountBatch called");
        AZ6 az6 = this.A09;
        AZ6 az62 = az6;
        AnonymousClass90Z r7 = null;
        az6.A0A((A7B) null, 3, 0);
        C196259ui r8 = this.A00;
        r8.A02("upi-batch");
        AnonymousClass1OZ r5 = this.A05;
        String A0B = r5.A0B();
        List A0o = AnonymousClass8BX.A0o("0", "1", 2, 1);
        List A0o2 = AnonymousClass8BX.A0o("0", "1", 2, 1);
        String[] strArr = new String[10];
        AnonymousClass8BY.A1Q(strArr);
        AnonymousClass8BY.A1P(strArr);
        List A0O = C18070vi.A0O("UNKNOWN", strArr, 9);
        C29591cX A0Y = C108955ca.A0Y();
        AnonymousClass8BY.A19(A0Y, "xmlns", "w:pay");
        C29591cX.A01(A0Y, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set");
        AnonymousClass8BY.A15(A0Y, A0B);
        C29591cX A0R = AnonymousClass8BS.A0R();
        C29591cX.A01(A0R, "action", "upi-batch");
        C29591cX.A01(A0R, "version", "2");
        String str3 = str2;
        if (AnonymousClass8BV.A1V(str3, 1, true)) {
            C29591cX.A01(A0R, "provider-type", str3);
        }
        A0R.A08("1", "include-banks", A0o);
        A0R.A08("0", "popular-banks", A0o2);
        A0R.A08(str, "account-type", A0O);
        C29621ca A002 = C29591cX.A00(A0R, A0Y);
        boolean A052 = C18020vd.A05(C18040vf.A02, this.A04, 2227);
        String str4 = "in_upi_batch_tag";
        if (A052) {
            this.A0A.A01(185468726, str4);
        }
        Context context = this.A01;
        AnonymousClass1KB r12 = this.A02;
        C33711jG r0 = this.A07;
        if (A052) {
            r7 = this.A0A;
        } else {
            str4 = null;
        }
        AnonymousClass8BW.A1B(r5, new C175958zY(context, r12, r0, r8, this, az62, r7, str4, 2), A002, A0B);
    }

    public C175768zF(Context context, AnonymousClass1KB r3, AnonymousClass1KI r4, C18030ve r5, AnonymousClass1OZ r6, A7U a7u, C33711jG r8, C31061ex r9, AnonymousClass1QS r10, BBA bba, AZ6 az6, AnonymousClass90Z r13) {
        super(a7u.A04, r9);
        this.A04 = r5;
        this.A01 = context;
        this.A02 = r3;
        this.A05 = r6;
        this.A08 = r10;
        this.A06 = a7u;
        this.A03 = r4;
        this.A09 = az6;
        this.A07 = r8;
        this.A0A = r13;
        this.A00 = bba;
    }
}
