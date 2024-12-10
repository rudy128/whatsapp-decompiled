package X;

import android.widget.CompoundButton;
import com.whatsapp.payments.ui.BrazilPaymentDPOActivity;
import com.whatsapp.polls.creator.PollCreatorActivity;
import com.whatsapp.polls.creator.PollCreatorViewModel;

public class AG1 implements CompoundButton.OnCheckedChangeListener {
    public final int A00;
    public final Object A01;

    public AG1(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = this.A00;
        Object obj = this.A01;
        if (i != 0) {
            PollCreatorViewModel A0d = AnonymousClass8BR.A0d(((PollCreatorActivity) obj).A0E);
            AnonymousClass3MY.A1M(A0d.A05, z);
            if (z && C72453Mb.A1a(A0d.A0F)) {
                AnonymousClass3MY.A1M(A0d.A07, false);
                return;
            }
            return;
        }
        C1768095s r3 = ((BrazilPaymentDPOActivity) obj).A00;
        String A18 = AnonymousClass3MZ.A18(compoundButton);
        C20112A7u A02 = C20112A7u.A02();
        A02.A07("product_flow", "p2m");
        A02.A07("checkbox_text", A18);
        BD4 bd4 = r3.A07;
        int i2 = 123;
        if (z) {
            i2 = 122;
        }
        bd4.BiM(A02, Integer.valueOf(i2), "restore_payment", (String) null, 1);
    }
}
