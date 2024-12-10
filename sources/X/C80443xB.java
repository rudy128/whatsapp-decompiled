package X;

import android.view.ViewGroup;

/* renamed from: X.3xB  reason: invalid class name and case insensitive filesystem */
public class C80443xB extends AnonymousClass28I {
    public /* bridge */ /* synthetic */ void Bmc(C42011xT r4, int i) {
        AnonymousClass3Z8 r42 = (AnonymousClass3Z8) r4;
        AnonymousClass1IX r0 = this.A00.A01;
        if (r0 == null) {
            r0 = AnonymousClass1IX.of();
        }
        AnonymousClass4NK r2 = (AnonymousClass4NK) r0.get(i);
        r42.A00 = r2;
        r42.A02.setText(r2.A02.A00);
        r42.A01.setChecked(r2.A00);
        r2.A01.A0C(new C91604fx(r42, 14));
    }

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        return new AnonymousClass3Z8(AnonymousClass3MX.A09(AnonymousClass3MZ.A0D(viewGroup), viewGroup, 2131625565));
    }
}
