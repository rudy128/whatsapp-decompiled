package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.whatsapp.stickers.StickerView;

/* renamed from: X.5kO  reason: invalid class name and case insensitive filesystem */
public final class C111765kO extends C41251w3 {
    public final C26631Sw A00;
    public final C135516sK A01;
    public final C22821Di A02;

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        return new C113465n8(AnonymousClass3MY.A0E(C72463Mc.A0K(viewGroup, 0), viewGroup, 2131625157), this.A00, this.A01, this.A02);
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r18, int i) {
        C113465n8 r3 = (C113465n8) r18;
        int i2 = i;
        C134966rR r0 = (C134966rR) C72463Mc.A0l(this, r3, i2);
        C18070vi.A0d(r0, 0);
        C1418377d r8 = r0.A00;
        C18100vl r4 = r3.A09;
        int A0I = C72453Mb.A0I(r4);
        View view = r3.A01;
        C108975cc.A0v(view, A0I);
        C135516sK r5 = r3.A04;
        int A002 = r5.A00(AnonymousClass3MY.A04(view));
        StickerView stickerView = r3.A05;
        C124146Xf.A00(stickerView, A002);
        int A012 = r5.A01(AnonymousClass3MY.A04(view));
        C18100vl r1 = r3.A06;
        C124146Xf.A00(AnonymousClass3MW.A0A(r1), A012);
        int A013 = r5.A01(AnonymousClass3MY.A04(view));
        FrameLayout frameLayout = r3.A02;
        C124146Xf.A00(frameLayout, A013);
        C72453Mb.A1U(r3.A07, 0);
        C108965cb.A1N(r1.getValue());
        r3.A0H.setBackgroundResource(2131232942);
        stickerView.A02 = true;
        r3.A03.A06(new C59842my(stickerView, r8, new AnonymousClass7MM(r8, r3), C72453Mb.A0I(r4), C72453Mb.A0I(r4), 0, i2, true, true, false));
        AnonymousClass3MZ.A1P(frameLayout, r8, r3, 39);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C111765kO(C26631Sw r2, C135516sK r3, C22821Di r4) {
        super((C40411uf) C111605jz.A00);
        C18070vi.A0j(r3, r2);
        this.A01 = r3;
        this.A00 = r2;
        this.A02 = r4;
    }
}
