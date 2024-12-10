package X;

import android.text.TextUtils;
import com.whatsapp.WaTextView;
import java.util.ArrayList;

/* renamed from: X.4FH  reason: invalid class name */
public abstract class AnonymousClass4FH {
    public C107485Zw A00;

    public void A00(C107485Zw r5, C139106yE r6, ArrayList arrayList) {
        WaTextView waTextView;
        String str;
        WaTextView waTextView2;
        int i;
        if (this instanceof AnonymousClass40Y) {
            AnonymousClass40Y r1 = (AnonymousClass40Y) this;
            r1.A00 = r5;
            String str2 = ((C96244nX) r5).A00;
            if (TextUtils.isEmpty(str2)) {
                waTextView2 = r1.A00;
                i = 2131895498;
            } else {
                waTextView = r1.A00;
                str = C72473Md.A0j(r1.A01, str2, 2131895497);
                waTextView.setText(str);
                return;
            }
        } else {
            AnonymousClass40X r12 = (AnonymousClass40X) this;
            r12.A00 = r5;
            if (r5 instanceof C96224nV) {
                int i2 = ((C96224nV) r5).A00;
                waTextView = r12.A00;
                str = C72483Me.A0W(r12.A01.getResources(), i2, 2131755489);
                waTextView.setText(str);
                return;
            } else if (r5 instanceof C96214nU) {
                waTextView2 = r12.A00;
                i = 2131893586;
            } else {
                return;
            }
        }
        waTextView2.setText(i);
    }
}
