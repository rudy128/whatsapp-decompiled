package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.wds.components.banners.WDSBanner;
import java.lang.ref.WeakReference;

/* renamed from: X.3Yu  reason: invalid class name and case insensitive filesystem */
public final class C74173Yu extends C42011xT {
    public final C36531o3 A00;
    public final WeakReference A01;

    public C74173Yu(View view, ViewGroup viewGroup, C36531o3 r8, WeakReference weakReference) {
        super(view);
        this.A01 = weakReference;
        this.A00 = r8;
        View findViewById = view.findViewById(2131429724);
        C18070vi.A0z(findViewById, "null cannot be cast to non-null type com.whatsapp.wds.components.banners.WDSBanner");
        WDSBanner wDSBanner = (WDSBanner) findViewById;
        Context A04 = AnonymousClass3MY.A04(viewGroup);
        AnonymousClass4XT r2 = new AnonymousClass4XT();
        r2.A02 = AnonymousClass4A8.A00;
        r2.A04 = A04.getString(2131898591);
        r2.A03 = AnonymousClass4W6.A01(A04, C18070vi.A0F(A04, 2131898590), C18070vi.A0F(A04, 2131898592));
        r2.A05 = false;
        wDSBanner.setState(r2.A01());
        AnonymousClass3Ma.A1B(wDSBanner, this, 5);
    }
}
