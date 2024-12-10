package X;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.whatsapp.payments.ui.PaymentBottomSheet;
import com.whatsapp.payments.ui.widget.PaymentDescriptionRow;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.AZk  reason: case insensitive filesystem */
public class C20807AZk implements C22564BCz {
    public final /* synthetic */ AnonymousClass8pQ A00;
    public final /* synthetic */ ARR A01;
    public final /* synthetic */ AnonymousClass92u A02;
    public final /* synthetic */ PaymentBottomSheet A03;

    public /* synthetic */ void Bw1(PaymentBottomSheet paymentBottomSheet, List list, int i, int i2) {
    }

    public /* synthetic */ void C0J(C20284AEs aEs) {
    }

    public /* synthetic */ void C0M(PaymentBottomSheet paymentBottomSheet, int i) {
    }

    public /* synthetic */ void C0O(PaymentBottomSheet paymentBottomSheet, int i) {
    }

    public /* synthetic */ void C0P(int i) {
    }

    public /* synthetic */ void C95(PaymentBottomSheet paymentBottomSheet, PaymentDescriptionRow paymentDescriptionRow) {
    }

    public C20807AZk(AnonymousClass8pQ r1, ARR arr, AnonymousClass92u r3, PaymentBottomSheet paymentBottomSheet) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = arr;
        this.A03 = paymentBottomSheet;
    }

    public void BpZ(View view, View view2, C20274AEh aEh, AnonymousClass8pI r26, C20284AEs aEs, PaymentBottomSheet paymentBottomSheet) {
        String A07;
        String str;
        C20284AEs aEs2 = aEs;
        AnonymousClass92u r0 = this.A02;
        r0.BiK(r0.A0S.A08(aEs2, (C20112A7u) null), 1, C17880vN.A0k(), "payment_confirm_prompt");
        ARR arr = this.A01;
        r0.A5T(arr);
        AnonymousClass8pQ r1 = (AnonymousClass8pQ) aEs2;
        try {
            r0.A00 = r1;
            if (r0 instanceof AnonymousClass92s) {
                AnonymousClass92s r5 = (AnonymousClass92s) r0;
                String A5h = r5.A5h();
                String obj = arr.A02.A00.toString();
                if (!TextUtils.isEmpty(r5.A0A)) {
                    str = r5.A0A;
                } else {
                    str = r5.A0C;
                }
                String str2 = r5.A0a;
                String str3 = r5.A0d;
                String str4 = r5.A0n;
                C20118A8b a8b = new C20118A8b(A5h, obj, str, str2, (String) null, (String) null, "04", str3, (String) null, (String) AnonymousClass8BT.A0q(r5.A0J), (String) null, (String) null);
                a8b.A07 = C20118A8b.A05(str4, false);
                A07 = a8b.A07();
            } else {
                C18070vi.A0d(arr, 0);
                A07 = new C20118A8b(r0.A5h(), arr.A02.A00.toString(), r0.A0h, r0.A0a, r0.A0s, r0.A0e, "04", r0.A0d, r0.A0q, (String) AnonymousClass8BT.A0q(r0.A0J), (String) null, "SCANNED_QR_CODE").A07();
                C18070vi.A0X(A07);
            }
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(A07));
            intent.putExtra("launching_upi_intent_from_wa", true);
            Object obj2 = r1.A00.A00;
            if ("other".equals(obj2)) {
                intent = Intent.createChooser(intent, r0.getString(2131897596));
                C17880vN.A1E(AnonymousClass8BU.A07(r0.A0Q), "pref_p2m_hybrid_last_used_payment_option", (String) null);
            } else {
                String str5 = (String) obj2;
                r0.A02.get();
                C17960vV.A07(str5);
                List list = A8K.A03;
                C18070vi.A0d(str5, 1);
                if (AnonymousClass000.A1W(C24211Jh.A02(r0, str5))) {
                    intent.setPackage(str5);
                    C17880vN.A1E(AnonymousClass8BU.A07(r0.A0Q), "pref_p2m_hybrid_last_used_payment_option", str5);
                } else {
                    r0.A02.get();
                    try {
                        Intent A0G = C108945cZ.A0G("android.intent.action.VIEW");
                        A0G.setData(Uri.parse(AnonymousClass001.A1H("market://details?id=", str5, AnonymousClass000.A10())));
                        r0.startActivity(A0G);
                    } catch (ActivityNotFoundException e) {
                        Log.e("Failed to launch the app store", e);
                    }
                    this.A03.A28();
                    ((A0J) r0.A0R.get()).A01(AnonymousClass4aU.A02(r0.getIntent()));
                }
            }
            r0.startActivityForResult(intent, 1022);
            this.A03.A28();
            ((A0J) r0.A0R.get()).A01(AnonymousClass4aU.A02(r0.getIntent()));
        } catch (ActivityNotFoundException unused) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("PAY: /launchExternalUpiApp activity not found for ");
            C17890vO.A1B(A10, (String) r1.A00.A00);
            C73193Ri A002 = C73193Ri.A00(r0);
            A002.A0V(2131897599);
            A002.A0d(C108975cc.A0b(r0, C20284AEs.A02(r1), new Object[1], 2131897597));
            A002.A0X(new C20153A9p(paymentBottomSheet, this, 21), 2131897598);
            A002.A0W((DialogInterface.OnClickListener) null, 2131898766);
            A002.A0C();
        }
    }

    public void C0G(PaymentBottomSheet paymentBottomSheet) {
        AnonymousClass92u r5 = this.A02;
        AZ6 az6 = r5.A0S;
        AnonymousClass8pQ r4 = this.A00;
        r5.BiK(az6.A08(r4, (C20112A7u) null), C17880vN.A0h(), 84, "payment_confirm_prompt");
        r5.A5S(r4, this.A01, this.A03, AnonymousClass000.A0h());
    }
}
