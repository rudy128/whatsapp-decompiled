package X;

import android.app.Activity;
import android.content.DialogInterface;
import java.util.Calendar;

/* renamed from: X.752  reason: invalid class name */
public final /* synthetic */ class AnonymousClass752 implements DialogInterface.OnClickListener {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C116665yQ A01;
    public final /* synthetic */ AnonymousClass1BI A02;
    public final /* synthetic */ AnonymousClass206 A03;

    public final void onClick(DialogInterface dialogInterface, int i) {
        C116665yQ r5 = this.A01;
        Activity activity = this.A00;
        AnonymousClass206 r6 = this.A03;
        AnonymousClass1BI r4 = this.A02;
        if (!AnonymousClass112.A08() || r5.A05.A00.A00()) {
            Calendar instance = Calendar.getInstance();
            Calendar calendar = r5.A03;
            if (calendar != null) {
                if (!calendar.before(instance)) {
                    Calendar calendar2 = r5.A03;
                    if (calendar2 != null) {
                        long timeInMillis = calendar2.getTimeInMillis();
                        if (timeInMillis != 0) {
                            ((C56802i3) r5.A0E.get()).A00(r6, "cta_reminder", "cta_cancel_reminder");
                            r5.A0D.CGF(new AnonymousClass3C8(r4, r5, r6, 4, timeInMillis));
                            return;
                        }
                    }
                }
                C73203Rj A002 = AnonymousClass4a6.A00(activity);
                A002.A0D(2131892410);
                C73203Rj.A06(A002);
                AnonymousClass3MY.A1G(A002);
                return;
            }
            C18070vi.A11("reminderDateTime");
            throw null;
        }
        C116665yQ.A00(activity, r5);
    }

    public /* synthetic */ AnonymousClass752(Activity activity, C116665yQ r2, AnonymousClass1BI r3, AnonymousClass206 r4) {
        this.A01 = r2;
        this.A00 = activity;
        this.A03 = r4;
        this.A02 = r3;
    }
}
