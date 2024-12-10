package X;

import android.view.KeyEvent;
import android.view.View;

/* renamed from: X.D4t  reason: case insensitive filesystem */
public final /* synthetic */ class C26579D4t implements View.OnKeyListener {
    public final /* synthetic */ DOZ A00;
    public final /* synthetic */ DFL A01;
    public final /* synthetic */ E8A A02;
    public final /* synthetic */ E8A A03;

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        boolean z;
        E8A e8a = this.A02;
        DFL dfl = this.A01;
        DOZ doz = this.A00;
        E8A e8a2 = this.A03;
        if (keyEvent == null || keyEvent.getAction() != 0 || e8a == null) {
            z = false;
            if (keyEvent == null) {
                return false;
            }
        } else {
            z = AnonymousClass000.A1Y(C25681CkC.A03(doz, dfl, BE7.A0R(BE7.A0Q(dfl), Integer.valueOf(i), 1), e8a));
        }
        if (keyEvent.getAction() != 1 || e8a2 == null) {
            return z;
        }
        return AnonymousClass000.A1Y(C25681CkC.A03(doz, dfl, BE7.A0R(BE7.A0Q(dfl), Integer.valueOf(i), 1), e8a2));
    }

    public /* synthetic */ C26579D4t(DOZ doz, DFL dfl, E8A e8a, E8A e8a2) {
        this.A02 = e8a;
        this.A01 = dfl;
        this.A00 = doz;
        this.A03 = e8a2;
    }
}
