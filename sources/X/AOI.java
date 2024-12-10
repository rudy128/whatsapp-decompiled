package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity;
import com.whatsapp.payments.ui.IndiaUpiSendPaymentToVpaFragment;
import com.whatsapp.payments.ui.PaymentBottomSheet;
import com.whatsapp.payments.ui.PaymentTransactionDetailsListActivity;
import com.whatsapp.payments.ui.viewmodel.IndiaUpiPayNumberContactPickerViewModel;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.VoipActivityV2;
import java.lang.ref.Reference;

public class AOI implements C72073Kn {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public AOI(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public void C3p(boolean z) {
        Object r0;
        Context context;
        switch (this.A00) {
            case 0:
                if (z) {
                    Looper.getMainLooper();
                    Activity activity = (Activity) this.A01;
                    C18070vi.A0z(activity, "null cannot be cast to non-null type com.whatsapp.DialogActivity");
                    ((AnonymousClass1FU) activity).CMk((DialogFragment) this.A02, "SharePhoneNumberBottomSheet");
                    return;
                }
                return;
            case 1:
                Reference reference = (Reference) this.A01;
                Intent intent = (Intent) this.A02;
                if (z && (context = (Context) reference.get()) != null) {
                    context.startActivity(intent);
                    return;
                }
                return;
            case 2:
                C191759n8 r5 = (C191759n8) this.A01;
                C1418477e r3 = (C1418477e) this.A02;
                if (z) {
                    String str = r5.A07;
                    Bundle A0D = C17880vN.A0D();
                    A0D.putParcelable("extra_payment_handle", r3);
                    A0D.putString("extra_referral_screen", str);
                    IndiaUpiSendPaymentToVpaFragment indiaUpiSendPaymentToVpaFragment = new IndiaUpiSendPaymentToVpaFragment();
                    indiaUpiSendPaymentToVpaFragment.A1R(A0D);
                    r5.A00 = indiaUpiSendPaymentToVpaFragment;
                    r5.A00((PaymentBottomSheet) null);
                    return;
                }
                AnonymousClass1FR r4 = r5.A04;
                Object[] A1a = AnonymousClass3MW.A1a();
                A1a[0] = r5.A03.getString(2131891337);
                r4.BhU(A1a, 0, 2131897291);
                return;
            case 3:
                IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = (IndiaUpiSendPaymentActivity) this.A01;
                Runnable runnable = (Runnable) this.A02;
                if (z) {
                    runnable.run();
                    return;
                } else if (indiaUpiSendPaymentActivity.A0J) {
                    indiaUpiSendPaymentActivity.A00 = 3;
                    IndiaUpiSendPaymentActivity.A0d(indiaUpiSendPaymentActivity);
                    return;
                } else {
                    AnonymousClass4Yv.A01(indiaUpiSendPaymentActivity, 22);
                    return;
                }
            case 4:
                C161588Gc r42 = ((PaymentTransactionDetailsListActivity) this.A01).A0Q;
                String str2 = ((C198789yu) this.A02).A0I;
                C198789yu A002 = C198789yu.A00(8);
                Context context2 = r42.A0P.A00;
                int i = 2131897291;
                if (z) {
                    i = 2131897287;
                }
                A002.A0E = C72473Md.A0j(context2, str2, i);
                r42.A08.A0F(A002);
                return;
            case 5:
                C188449hR r2 = (C188449hR) this.A02;
                AnonymousClass1DT r1 = ((IndiaUpiPayNumberContactPickerViewModel) this.A01).A01;
                if (z) {
                    r0 = new AnonymousClass962(r2);
                } else {
                    r0 = new AnonymousClass961(r2);
                }
                r1.A0E(r0);
                return;
            default:
                VoipActivityV2 voipActivityV2 = (VoipActivityV2) this.A01;
                UserJid userJid = (UserJid) this.A02;
                CallInfo A04 = C40811vJ.A04(voipActivityV2.A0Y);
                if (A04 != null) {
                    C160968Au r12 = voipActivityV2.A0p;
                    boolean z2 = A04.videoEnabled;
                    if (z) {
                        r12.CRe(userJid, z2);
                        return;
                    } else {
                        r12.CRd(userJid, z2);
                        return;
                    }
                } else {
                    return;
                }
        }
    }
}
