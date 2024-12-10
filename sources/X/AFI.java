package X;

import android.text.TextUtils;
import android.view.View;
import com.whatsapp.conversation.conversationrow.InteractiveMessageView;

public class AFI implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;
    public final String A04;

    public AFI(Object obj, Object obj2, String str, String str2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = str;
        this.A04 = str2;
    }

    public final void onClick(View view) {
        double d;
        double d2;
        InteractiveMessageView interactiveMessageView;
        if (this.A00 != 0) {
            AnonymousClass4Q7 r4 = (AnonymousClass4Q7) this.A01;
            String str = this.A03;
            String str2 = this.A04;
            AnonymousClass206 r3 = (AnonymousClass206) this.A02;
            if (!TextUtils.isEmpty(str)) {
                interactiveMessageView = r4.A00;
                ((C136286tZ) interactiveMessageView.A0D.get()).A01(str);
            } else {
                C61762qD r5 = new C61762qD("", str2, "", 2, 0);
                interactiveMessageView = r4.A00;
                interactiveMessageView.A08.A04(interactiveMessageView.getContext(), r3, r5);
            }
            interactiveMessageView.A0C.CGF(new C98814rl(r4, r3, 45));
            return;
        }
        C20042A4l a4l = (C20042A4l) this.A01;
        String str3 = this.A03;
        String str4 = this.A04;
        C18070vi.A0d(str3, 2);
        C20042A4l.A01(a4l);
        AnonymousClass689 r32 = a4l.A0H;
        AnonymousClass1FU r42 = a4l.A05;
        AEG aeg = ((AEW) this.A02).A08.A00;
        Double d3 = aeg.A02;
        if (d3 != null) {
            d = d3.doubleValue();
        } else {
            d = 0.0d;
        }
        Double d4 = aeg.A03;
        if (d4 != null) {
            d2 = d4.doubleValue();
        } else {
            d2 = 0.0d;
        }
        if (str3.length() != 0) {
            str4 = str3;
        }
        r32.A09(r42, str4, str3, d, d2);
    }
}
