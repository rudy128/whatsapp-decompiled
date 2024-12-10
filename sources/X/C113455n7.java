package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import com.whatsapp.WaButtonWithLoader;
import com.whatsapp.WaTextView;

/* renamed from: X.5n7  reason: invalid class name and case insensitive filesystem */
public final class C113455n7 extends C42011xT {
    public WaButtonWithLoader A00;
    public final ViewStub A01;
    public final ImageView A02;
    public final AnonymousClass6l4 A03;
    public final WaTextView A04;
    public final C24921Me A05;
    public final C37451pZ A06;
    public final AnonymousClass1c4 A07;
    public final AnonymousClass85W A08;
    public final AQC A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C113455n7(View view, AnonymousClass6l4 r6, C24921Me r7, C37451pZ r8, AnonymousClass1c4 r9, AnonymousClass85W r10, AQC aqc) {
        super(view);
        C18070vi.A0w(view, r7, aqc, r9, r6);
        this.A05 = r7;
        this.A09 = aqc;
        this.A07 = r9;
        this.A03 = r6;
        this.A08 = r10;
        this.A06 = r8;
        this.A02 = AnonymousClass3MW.A0H(view, 2131429463);
        this.A04 = AnonymousClass3MW.A0U(view, 2131429428);
        ViewStub A0F = AnonymousClass3MW.A0F(view, 2131436704);
        this.A01 = A0F;
        aqc.A00 = 2131231056;
        WaButtonWithLoader waButtonWithLoader = (WaButtonWithLoader) view.findViewById(2131430943);
        waButtonWithLoader.setVariant(C27881Xz.TONAL);
        waButtonWithLoader.setSize(AnonymousClass4D1.SMALL);
        this.A00 = waButtonWithLoader;
        A0F.setLayoutResource(C18020vd.A05(C18040vf.A02, r9.A02, 5276) ? 2131627337 : 2131627336);
    }
}
