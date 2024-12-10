package X;

import android.app.Activity;
import android.content.Context;
import android.widget.Toast;

/* renamed from: X.9BC  reason: invalid class name */
public class AnonymousClass9BC extends A34 {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    public AnonymousClass9BC(Object obj, int i, int i2, Object obj2) {
        this.A00 = i2;
        this.A03 = obj2;
        this.A02 = obj;
        this.A01 = i;
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        if (this.A00 == 0) {
            C62562rb r12 = (C62562rb) obj;
            if (r12 == null) {
                C29491cN r3 = (C29491cN) this.A03;
                r3.A0A.A1H(0);
                Toast.makeText((Context) this.A02, 2131894630, 0).show();
                r3.A05.A0G("maybeSwitchToMostRecentAccount/no inactive accounts", (String) null, true);
                return;
            }
            ((C29491cN) this.A03).A0I((Context) this.A02, r12.A07, r12.A05, (String) null, (String) null, (C18090vk) null, this.A01, false, false, false);
        } else if (AnonymousClass000.A1Y(obj)) {
            AnonymousClass4Yv.A01((Activity) this.A02, this.A01);
        } else {
            C108945cZ.A1P(this.A03);
        }
    }
}
