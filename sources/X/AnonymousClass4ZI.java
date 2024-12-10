package X;

import android.app.Activity;
import android.content.DialogInterface;
import android.view.View;
import java.util.List;

/* renamed from: X.4ZI  reason: invalid class name */
public final class AnonymousClass4ZI {
    public final AnonymousClass11E A00;
    public final C18030ve A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final C18600wl A04;
    public final AnonymousClass1OX A05;
    public final AnonymousClass11C A06;

    public static final void A00(Activity activity) {
        Object[] A1a = AnonymousClass3MW.A1a();
        AnonymousClass3MY.A1H(AnonymousClass4FY.A00(new C1411874q(22), (DialogInterface.OnClickListener) null, C17880vN.A0q(activity, activity.getString(2131888733), A1a, 0, 2131894998), (Object[]) null, new Object[0], -1, 0, 2131899286, 0, 2131892932), (AnonymousClass1FL) activity, (String) null);
    }

    public static final void A01(AnonymousClass1FU r6, AnonymousClass4ZI r7) {
        AnonymousClass1FU r2 = r6;
        if (r6 != null && !r6.isDestroyed() && !r6.isFinishing()) {
            View findViewById = r6.findViewById(16908298);
            C18070vi.A0b(findViewById);
            new C90594eK(findViewById, (AnonymousClass1F9) r2, r7.A06, (List) AnonymousClass000.A13(), 2131896625, 2000, false).A03();
        }
    }

    public AnonymousClass4ZI(AnonymousClass11E r1, AnonymousClass11C r2, C18030ve r3, AnonymousClass00H r4, AnonymousClass00H r5, C18600wl r6, AnonymousClass1OX r7) {
        C18070vi.A0w(r3, r4, r7, r6, r2);
        C18070vi.A0l(r5, r1);
        this.A01 = r3;
        this.A03 = r4;
        this.A05 = r7;
        this.A04 = r6;
        this.A06 = r2;
        this.A02 = r5;
        this.A00 = r1;
    }
}
