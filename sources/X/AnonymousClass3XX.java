package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.3XX  reason: invalid class name */
public final class AnonymousClass3XX extends C39711tW {
    public int A00;
    public final float A01;
    public final boolean A02;
    public final /* synthetic */ C80053wT A03;

    public void A04(RecyclerView recyclerView, int i, int i2) {
        float f;
        C18070vi.A0d(recyclerView, 0);
        int i3 = this.A00;
        if (!this.A02) {
            i = -i;
        }
        int i4 = i3 + i;
        this.A00 = i4;
        float f2 = (float) i4;
        float f3 = this.A01;
        int i5 = (f2 > f3 ? 1 : (f2 == f3 ? 0 : -1));
        View view = this.A03.A01;
        if (i5 < 0) {
            if (view != null) {
                f = Math.max(f2, 0.0f) / f3;
            }
            C18070vi.A11("leftEndBlurView");
            throw null;
        }
        if (view != null) {
            f = 1.0f;
        }
        C18070vi.A11("leftEndBlurView");
        throw null;
        view.setAlpha(f);
    }

    public AnonymousClass3XX(C80053wT r3) {
        this.A03 = r3;
        this.A01 = AnonymousClass3MW.A00(r3.getResources(), 2131168425) / 4.0f;
        this.A02 = AnonymousClass3MY.A1b(r3.getWhatsAppLocale());
    }
}
