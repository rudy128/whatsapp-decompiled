package X;

import android.os.Bundle;
import com.whatsapp.calling.dialer.DialerActivity;
import com.whatsapp.calling.dialer.DialerViewModel;
import com.whatsapp.calling.dialer.NumberNotInWhatsAppDialog;
import java.util.ArrayList;

/* renamed from: X.5W4  reason: invalid class name */
public final class AnonymousClass5W4 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ DialerActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5W4(DialerActivity dialerActivity) {
        super(1);
        this.this$0 = dialerActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass1V9 r3 = this.this$0.A09;
        if (r3 != null) {
            r3.A01(14, 59, 15);
            Object value = AnonymousClass3MZ.A0X(this.this$0).A0J.getValue();
            C18070vi.A0d(value, 0);
            NumberNotInWhatsAppDialog numberNotInWhatsAppDialog = new NumberNotInWhatsAppDialog();
            AnonymousClass1D6[] r1 = new AnonymousClass1D6[1];
            AnonymousClass1D6.A03("phone_number_formatted", value, r1, 0);
            AnonymousClass3MX.A1I(numberNotInWhatsAppDialog, r1);
            numberNotInWhatsAppDialog.A2C(this.this$0.getSupportFragmentManager(), "NumberNotInWhatsAppDialog");
            DialerActivity dialerActivity = this.this$0;
            dialerActivity.getSupportFragmentManager().A0t(new C91374fa(dialerActivity, 4), dialerActivity, "NumberNotInWhatsAppDialog");
            return C27621Wu.A00;
        }
        C18070vi.A11("callUserJourneyLogger");
        throw null;
    }

    public static final void A00(Bundle bundle, DialerActivity dialerActivity, String str) {
        C18070vi.A0j(str, bundle);
        if (str.equals("NumberNotInWhatsAppDialog")) {
            boolean z = bundle.getBoolean("NumberNotInWhatsAppDialog");
            ArrayList arrayList = DialerActivity.A0I;
            if (z) {
                DialerViewModel A0X = AnonymousClass3MZ.A0X(dialerActivity);
                StringBuilder sb = A0X.A0C;
                if (sb.length() > 0) {
                    sb.setLength(0);
                    DialerViewModel.A03(A0X);
                }
                DialerActivity.A0c(dialerActivity, false);
            }
        }
        dialerActivity.getSupportFragmentManager().A0u("NumberNotInWhatsAppDialog");
    }
}
