package X;

import com.whatsapp.bot.onboarding.CustomBotTosBottomSheet;

/* renamed from: X.7D6  reason: invalid class name */
public class AnonymousClass7D6 implements C1598686e {
    public final int A00;
    public final Object A01;

    public AnonymousClass7D6(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void C3p(boolean z) {
        AnonymousClass6R9 r0;
        if (this.A00 != 0) {
            AnonymousClass86Z r1 = (AnonymousClass86Z) this.A01;
            if (r1 != null) {
                if (z) {
                    r0 = AnonymousClass6R9.ACCEPT_NOT_NEEDED;
                } else {
                    r0 = AnonymousClass6R9.NOT_ACCEPTED;
                }
                r1.BzU(r0);
                return;
            }
            return;
        }
        CustomBotTosBottomSheet customBotTosBottomSheet = (CustomBotTosBottomSheet) this.A01;
        AnonymousClass1KB r2 = customBotTosBottomSheet.A00;
        if (r2 != null) {
            r2.CGP(new AnonymousClass7RK(13, (Object) customBotTosBottomSheet, z));
        } else {
            AnonymousClass3MW.A1C();
            throw null;
        }
    }
}
