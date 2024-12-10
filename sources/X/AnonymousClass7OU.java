package X;

import android.view.Window;
import com.whatsapp.wabloks.ui.WaBloksActivity;

/* renamed from: X.7OU  reason: invalid class name */
public final class AnonymousClass7OU implements AnonymousClass89V {
    public final C18000vb A00;

    public AnonymousClass7OU(C18000vb r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public C115085tN BHZ(WaBloksActivity waBloksActivity) {
        return new AnonymousClass6Nu(waBloksActivity, this.A00, waBloksActivity);
    }

    public C115075tM BHc(WaBloksActivity waBloksActivity, AnonymousClass74k r6) {
        Window window;
        int A02;
        C115075tM r2 = new C115075tM(this.A00, waBloksActivity);
        if (AnonymousClass112.A01() || !C22891Dp.A02) {
            window = waBloksActivity.getWindow();
            C18070vi.A0X(window);
            A02 = C108955ca.A02(waBloksActivity);
        } else {
            window = waBloksActivity.getWindow();
            C18070vi.A0X(window);
            A02 = 2131103100;
        }
        C28271Zs.A00(window, C19740yt.A00(waBloksActivity, A02), true);
        return r2;
    }
}
