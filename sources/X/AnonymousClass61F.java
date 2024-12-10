package X;

import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.WaTextView;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.61F  reason: invalid class name */
public final class AnonymousClass61F extends C112825m6 {
    public ViewGroup A00;
    public WaTextView A01;
    public WDSButton A02;
    public final View A03;
    public final AnonymousClass00H A04;
    public final C18090vk A05;
    public final boolean A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass61F(View view, AnonymousClass00H r4, C18090vk r5, boolean z) {
        super(view);
        C18070vi.A0j(view, r4);
        this.A03 = view;
        this.A04 = r4;
        this.A06 = z;
        this.A05 = r5;
        ViewGroup viewGroup = (ViewGroup) C18070vi.A05(view, 2131435736);
        this.A00 = viewGroup;
        this.A02 = (WDSButton) C18070vi.A05(viewGroup, 2131427483);
        this.A01 = AnonymousClass3Ma.A0N(view, 2131427528);
    }
}
