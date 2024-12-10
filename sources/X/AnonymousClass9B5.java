package X;

import android.app.Activity;
import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;

/* renamed from: X.9B5  reason: invalid class name */
public class AnonymousClass9B5 extends A34 {
    public final Activity A00;
    public final AW0 A01;
    public final B8Z A02;
    public final /* synthetic */ C20746AXb A03;

    public AnonymousClass9B5(Activity activity, AW0 aw0, C20746AXb aXb, B8Z b8z) {
        this.A03 = aXb;
        this.A01 = aw0;
        this.A02 = b8z;
        this.A00 = activity;
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        boolean z;
        B8Z b8z;
        C20284AEs aEs = (C20284AEs) obj;
        if (aEs == null && (b8z = this.A02) != null) {
            b8z.C2r(A7B.A00());
        }
        C20746AXb aXb = this.A03;
        Context context = aXb.A01.A00;
        C18030ve r8 = aXb.A03;
        AnonymousClass1KB r7 = aXb.A00;
        AnonymousClass1OZ r5 = aXb.A04;
        C30931ek r4 = aXb.A0A;
        A0B a0b = aXb.A09;
        Context context2 = context;
        AnonymousClass1KB r15 = r7;
        C18030ve r16 = r8;
        AnonymousClass1OZ r17 = r5;
        C175828zL r13 = new C175828zL(context2, r15, r16, r17, aXb.A05, aXb.A06, aXb.A07, a0b, r4);
        AXT axt = new AXT(this, 0);
        AW0 aw0 = this.A01;
        C170318pf A0C = AnonymousClass8BS.A0C(aw0);
        C170278pb r0 = aEs.A08;
        C17960vV.A07(r0);
        AnonymousClass8pS r02 = (AnonymousClass8pS) r0;
        String str = aw0.A0K;
        AnonymousClass1KN r2 = aw0.A09;
        if (r2 == null) {
            r2 = null;
        }
        String str2 = A0C.A0T;
        String str3 = A0C.A0U;
        String str4 = A0C.A0R;
        C1418477e r1 = r02.A05;
        C29621ca r9 = null;
        Log.i("PAY: rejectCollect called");
        AnonymousClass1OZ r28 = r13.A02;
        String A0B = r28.A0B();
        String A012 = r13.A05.A01();
        String str5 = (String) AnonymousClass8BT.A0q(r1);
        String A013 = r13.A04.A01();
        if (r2 != null) {
            r9 = C178749Eh.A00(C175828zL.A00(r13.A01.A01(AnonymousClass1KL.A0B, r2)), "amount").A03();
            z = true;
        } else {
            z = false;
        }
        C18070vi.A0p(str, A012, str2);
        C18070vi.A0d(str4, 7);
        C29591cX A0Y = C108955ca.A0Y();
        AnonymousClass8BY.A13(A0Y);
        AnonymousClass8BY.A15(A0Y, A0B);
        C29591cX A0R = AnonymousClass8BS.A0R();
        C29591cX.A01(A0R, "action", "upi-reject-collect");
        AnonymousClass8BW.A1F(A0R, PublicKeyCredentialControllerUtility.JSON_KEY_ID, str, AnonymousClass8BV.A1Y(str, 1, false) ? 1 : 0);
        AnonymousClass8BY.A1C(A0R, A012, false);
        if (C29601cY.A04(str2, 1, 100, false)) {
            C29591cX.A01(A0R, "sender-vpa", str2);
        }
        if (str3 != null && C29601cY.A04(str3, 1, 100, true)) {
            C29591cX.A01(A0R, "sender-vpa-id", str3);
        }
        if (str5 != null && AnonymousClass8BU.A1Z(str5, 0, true)) {
            C29591cX.A01(A0R, "upi-bank-info", str5);
        }
        if (C29601cY.A04(str4, 1, 100, false)) {
            C29591cX.A01(A0R, "receiver-vpa", str4);
        }
        if (A013 != null) {
            AnonymousClass8BY.A14(A0R, A013);
        }
        if (z) {
            A0R.A05(r9);
        }
        C29621ca A002 = C29591cX.A00(A0R, A0Y);
        C196259ui A04 = C197889xR.A04(r13, "upi-reject-collect");
        r28.A0N(new C175978za(r13.A00, r13.A01, (B8Z) axt, r13.A03, A04, r13), A002, A0B, 204, 0);
    }
}
