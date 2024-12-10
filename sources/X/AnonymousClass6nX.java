package X;

import android.content.Context;
import android.os.Build;

/* renamed from: X.6nX  reason: invalid class name */
public final class AnonymousClass6nX {
    public final AnonymousClass118 A00;
    public final AnonymousClass1RK A01;
    public final C18030ve A02;
    public final C19880zA A03;
    public final AnonymousClass00H A04;

    public final C1409673t A00(String str) {
        Context context = this.A00.A00;
        C1409673t A032 = C217217d.A03(context);
        A032.A0M = "other_notifications@1";
        this.A04.get();
        A032.A0A = C1408573i.A00(context, 0, C87404Vl.A01(context, 3), 0);
        int i = -2;
        if (Build.VERSION.SDK_INT >= 26) {
            i = -1;
        }
        A032.A03 = i;
        A032.A0F(str);
        A032.A0D(str);
        A032.A08.icon = 2131232039;
        return A032;
    }

    public AnonymousClass6nX(C19880zA r1, AnonymousClass118 r2, AnonymousClass1RK r3, C18030ve r4, AnonymousClass00H r5) {
        C18070vi.A0w(r2, r4, r1, r5, r3);
        this.A00 = r2;
        this.A02 = r4;
        this.A03 = r1;
        this.A04 = r5;
        this.A01 = r3;
    }
}
