package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.style.URLSpan;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.whatsapp.inappsupport.ui.ContactUsActivity;
import com.whatsapp.payments.ui.instructions.PaymentCustomInstructionsBottomSheet;
import java.util.Map;

/* renamed from: X.8dB  reason: invalid class name and case insensitive filesystem */
public class C166608dB extends C39381sz {
    public final int A00 = 1;
    public final Object A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C166608dB(Context context, Context context2, ContactUsActivity contactUsActivity) {
        super(context);
        this.A01 = contactUsActivity;
        this.A02 = context2;
    }

    public void onClick(View view) {
        PackageManager packageManager;
        AnonymousClass1FL A1B;
        switch (this.A00) {
            case 0:
                Runnable runnable = (Runnable) ((Map) this.A01).get(((URLSpan) this.A02).getURL());
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                ContactUsActivity contactUsActivity = (ContactUsActivity) this.A01;
                Class BWu = contactUsActivity.A0I.A06().BWu();
                C17900vP.A0Y(BWu, "PAY: ContactUsActivity starting settings ", AnonymousClass000.A10());
                AnonymousClass8BT.A16((Context) this.A02, BWu);
                BD4 A0U = AnonymousClass8BT.A0U(contactUsActivity.A0I);
                if (A0U != null) {
                    C20112A7u A03 = C20112A7u.A03(new C20112A7u[0]);
                    A03.A07("hc_entrypoint", "wa_settings_support");
                    A03.A07("app_type", "consumer");
                    A0U.BiM(A03, 39, "settings_contact_us", (String) null, 1);
                    return;
                }
                return;
            default:
                Intent A07 = AnonymousClass3MY.A07(Uri.parse(((URLSpan) this.A01).getURL()));
                Fragment fragment = (Fragment) this.A02;
                AnonymousClass1FL A1B2 = fragment.A1B();
                if (A1B2 != null && (packageManager = A1B2.getPackageManager()) != null && packageManager.resolveActivity(A07, 0) != null && (A1B = fragment.A1B()) != null) {
                    A1B.startActivity(A07);
                    return;
                }
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C166608dB(Context context, URLSpan uRLSpan, PaymentCustomInstructionsBottomSheet paymentCustomInstructionsBottomSheet, int i) {
        super(context, i);
        this.A01 = uRLSpan;
        this.A02 = paymentCustomInstructionsBottomSheet;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C166608dB(Context context, URLSpan uRLSpan, Map map, int i) {
        super(context, i, i, i);
        this.A01 = map;
        this.A02 = uRLSpan;
    }
}
