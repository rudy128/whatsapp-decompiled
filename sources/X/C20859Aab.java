package X;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.orderdetails.PaymentOptionsBottomSheet;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.Aab  reason: case insensitive filesystem */
public class C20859Aab implements BD6 {
    public final /* synthetic */ AnonymousClass1FY A00;
    public final /* synthetic */ UserJid A01;
    public final /* synthetic */ BD5 A02;
    public final /* synthetic */ C20828Aa6 A03;

    public void C0L(ARR arr, AnonymousClass21K r9, String str, String str2, List list) {
        C20828Aa6 aa6 = this.A03;
        aa6.A0O.A07(r9, aa6.A08, 9);
        PaymentOptionsBottomSheet A002 = PaymentOptionsBottomSheet.A00(str, (String) null, list, false);
        AnonymousClass1FY r2 = this.A00;
        A002.A05 = new C20848AaQ(r2, arr, this, r9, str2);
        C20098A7b.A00(A002, r2);
    }

    public /* synthetic */ void CA9(AnonymousClass1DT r1, AnonymousClass21K r2) {
    }

    public C20859Aab(AnonymousClass1FY r1, UserJid userJid, BD5 bd5, C20828Aa6 aa6) {
        this.A03 = aa6;
        this.A02 = bd5;
        this.A00 = r1;
        this.A01 = userJid;
    }

    public void Bl6(String str) {
        this.A02.Bl6(str);
    }

    public void BlW() {
        this.A02.BlW();
    }

    public void Bob(ARR arr, AnonymousClass1BI r11, ADQ adq, C191559mn r13, AnonymousClass21K r14, String str, String str2, String str3, HashMap hashMap) {
        C20828Aa6 aa6 = this.A03;
        AnonymousClass21K r6 = r14;
        aa6.A0O.A07(r14, aa6.A08, 5);
        String str4 = aa6.A08;
        if ("WhatsappPay".equals(str4) || "p2m_lite".equals(str4)) {
            if (this.A02.Be9()) {
                aa6.A05.A0B.A02();
            } else {
                this.A00.CNA(2131895077);
            }
            AnonymousClass10I r7 = aa6.A0P;
            AnonymousClass122 r2 = aa6.A0H;
            C33651jA r5 = aa6.A0L;
            A63.A02(aa6.A0E, r2, aa6.A0I, new C20600ARk(arr, this, r14, str), r5, r6, r7);
        } else if ("GlobalPayment".equals(str4) || "CustomPaymentInstructions".equals(str4)) {
            this.A02.Bpc(r11, r13, r14);
        } else {
            boolean equals = "checkout_lite".equals(str4);
            r14.BPK().getClass();
            C20279AEn aEn = r14.BPK().A02;
            if (equals) {
                aEn.getClass();
                List list = aEn.A0Q;
                list.getClass();
                C17960vV.A0C(AnonymousClass000.A1a(list));
                C20932Abm abm = (C20932Abm) ((C20251ADj) C108955ca.A0p(list)).A00;
                abm.getClass();
                AnonymousClass1FY r3 = this.A00;
                String str5 = abm.A02;
                r3.startActivity(AnonymousClass6X6.A00(r3, aa6.A0J, this.A01, str5));
                return;
            }
            aEn.getClass();
            r14.BPK().A02.A0O.getClass();
            C17960vV.A0C(!r14.BPK().A02.A0O.isEmpty());
            String str6 = ((C20267ADz) r14.BPK().A02.A0O.get(0)).A02;
            AnonymousClass1FY r8 = this.A00;
            C73203Rj A002 = AnonymousClass4a6.A00(r8);
            A002.A0T(false);
            A002.A0k(r8.getString(2131893195));
            A002.A0S(C17890vO.A0R(r8, str6, 1, 0, 2131893194));
            A002.A0X((DialogInterface.OnClickListener) null, 2131898766);
            A002.A0Z(new C20141A9d(r8, this, r14, str6, 1), 2131887451);
            AnonymousClass3MY.A1G(A002);
        }
    }

    public void ByJ(AnonymousClass1BI r5, AnonymousClass21K r6, long j) {
        C20828Aa6 aa6 = this.A03;
        aa6.A0O.A07(r6, aa6.A08, 8);
        Intent A06 = AnonymousClass3MY.A06(aa6.A01, aa6.A0K, r5);
        A06.putExtra("extra_quoted_message_row_id", j);
        aa6.A01.startActivity(A06);
    }

    public void Bza() {
        C191379mV r1 = this.A03.A02;
        r1.A04 = "wa_p2m_lite_receipt_support";
        r1.A00(this.A00);
    }

    public void Bzc(AnonymousClass21K r10, String str) {
        C20279AEn aEn;
        C20828Aa6 aa6 = this.A03;
        AnonymousClass205 r5 = null;
        aa6.A0O.A07(r10, aa6.A08, 7);
        String str2 = null;
        if (r10 instanceof AnonymousClass206) {
            r5 = ((AnonymousClass206) r10).A0v;
        }
        C20285AEt BPK = r10.BPK();
        if (BPK == null || (aEn = BPK.A02) == null) {
            aEn = null;
        } else {
            str2 = aEn.A0I;
        }
        C192479oS r2 = aa6.A0M;
        AnonymousClass1FY r3 = this.A00;
        Intent A002 = r2.A00(r3, aEn, r5, str2, str, "order_details");
        if (A002 == null) {
            Log.e("Pay: PaymentCheckoutOrderDetailsCoordinator/onOpenTransactionDetailClicked the transaction details intent is null");
        } else {
            r3.startActivity(A002);
        }
    }

    public void C32() {
        this.A02.C32();
    }

    public void C5T(AES aes, String str) {
        this.A02.C5T(aes, str);
    }

    public void CAA() {
        this.A00.startActivity(AnonymousClass1LU.A1p(Uri.parse("https://faq.whatsapp.com/3314129148717498")));
    }
}
