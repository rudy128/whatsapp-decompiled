package X;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import java.util.Date;
import java.util.TimeZone;

/* renamed from: X.8dG  reason: invalid class name and case insensitive filesystem */
public class C166628dG extends C161028Bb {
    public final /* synthetic */ AnonymousClass194 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C166628dG(Activity activity, AnonymousClass194 r9, AnonymousClass11C r10, AnonymousClass11P r11, C18000vb r12, C18030ve r13) {
        super(activity, r10, r11, r12, r13, 2131624543);
        this.A00 = r9;
    }

    public void onCreate(Bundle bundle) {
        long time;
        super.onCreate(bundle);
        Date date = new Date();
        C17900vP.A0Z(date, "conversations/clock-wrong-time ", AnonymousClass000.A10());
        Date date2 = this.A00.A00;
        if (date2 != null) {
            time = date2.getTime();
        } else {
            time = date.getTime();
        }
        Activity activity = this.A00;
        Object[] A1b = AnonymousClass3MW.A1b();
        C18000vb r2 = this.A02;
        A1b[0] = A87.A03(r2, AnonymousClass11X.A00.A0B(r2, time), A8I.A00(r2, time));
        ((TextView) findViewById(2131429130)).setText(C17880vN.A0q(activity, TimeZone.getDefault().getDisplayName(r2.A0N()), A1b, 1, 2131888330));
        AnonymousClass3MZ.A1N(findViewById(2131429132), this, 27);
    }
}
