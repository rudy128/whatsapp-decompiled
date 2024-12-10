package X;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity;
import java.util.List;

public class AFH implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    public AFH(Object obj, Object obj2, Object obj3, String str, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A04 = str;
        this.A02 = obj2;
        this.A03 = obj3;
    }

    public final void onClick(View view) {
        String str;
        AZ6 az6;
        int i;
        int i2;
        C175368yb r5;
        AW0 aw0;
        Context context;
        switch (this.A00) {
            case 0:
                String str2 = this.A04;
                List list = C42011xT.A0I;
                ((AnonymousClass1L9) this.A01).CGU(((View) this.A02).getContext(), ((AnonymousClass129) this.A03).A04(str2), (AnonymousClass206) null);
                return;
            case 1:
                String str3 = this.A04;
                ((Dialog) this.A01).dismiss();
                Intent intent = new Intent("android.settings.REQUEST_SCHEDULE_EXACT_ALARM", Uri.parse(AnonymousClass001.A1H("package:", str3, AnonymousClass000.A10())));
                ((C116665yQ) this.A02).A04.A08((Context) this.A03, intent);
                return;
            case 2:
                Context context2 = (Context) this.A02;
                str = this.A04;
                context2.startActivity(IndiaUpiMandatePaymentActivity.A03(context2, (AW0) this.A03, str, 5));
                az6 = ((C175368yb) this.A01).A06;
                i = 117;
                break;
            case 3:
                Context context3 = (Context) this.A02;
                str = this.A04;
                context3.startActivity(IndiaUpiMandatePaymentActivity.A03(context3, (AW0) this.A03, str, 6));
                az6 = ((C175368yb) this.A01).A06;
                i = 118;
                break;
            case 4:
                r5 = (C175368yb) this.A01;
                context = (Context) this.A02;
                aw0 = (AW0) this.A03;
                str = this.A04;
                i2 = 8;
                break;
            case 5:
                r5 = (C175368yb) this.A01;
                context = (Context) this.A02;
                aw0 = (AW0) this.A03;
                str = this.A04;
                i2 = 1;
                break;
            case 6:
                Context context4 = (Context) this.A02;
                str = this.A04;
                context4.startActivity(IndiaUpiMandatePaymentActivity.A03(context4, (AW0) this.A03, str, 2));
                az6 = ((C175368yb) this.A01).A06;
                i = 105;
                break;
            case 7:
                Context context5 = (Context) this.A02;
                String str4 = this.A04;
                context5.startActivity(IndiaUpiMandatePaymentActivity.A03(context5, (AW0) this.A03, str4, 3));
                ((C175368yb) this.A01).A06.BiI(3, str4, (String) null, 1, true);
                return;
            default:
                Object obj = this.A01;
                C108135bB r1 = (C108135bB) this.A02;
                C33531iy r4 = (C33531iy) this.A03;
                String str5 = this.A04;
                C72473Md.A1I(r1, str5);
                C18070vi.A0d(view, 4);
                r1.setBadgeIcon((Drawable) null);
                C21433Ak0 ak0 = new C21433Ak0(r4, obj, 27);
                C200710s r2 = r4.A04;
                r2.execute(ak0);
                r2.execute(new C21433Ak0(r4, obj, 28));
                r4.A00.A08(view.getContext(), new Intent("android.intent.action.VIEW", Uri.parse(str5)));
                return;
        }
        if (!r5.A04.A0E()) {
            Intent A042 = AnonymousClass8BS.A04(context);
            A042.putExtra("extra_setup_mode", 1);
            C60442o2.A00(A042, r5.A01, "mandateRequest");
            context.startActivity(A042);
        } else {
            r5.A05.A04(context, aw0, new C20757AXm(context, aw0, r5, str, i2), false);
        }
        az6 = r5.A06;
        i = 104;
        az6.BiI(Integer.valueOf(i), str, (String) null, 1, true);
    }
}
