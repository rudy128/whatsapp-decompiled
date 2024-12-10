package X;

import android.view.View;
import android.widget.FrameLayout;
import com.whatsapp.stickers.StickerView;

/* renamed from: X.61I  reason: invalid class name */
public final class AnonymousClass61I extends C112825m6 {
    public String A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final int A04;
    public final View A05;
    public final FrameLayout A06;
    public final C25311Ns A07;
    public final C26631Sw A08;
    public final AnonymousClass88B A09;
    public final AnonymousClass88B A0A;
    public final StickerView A0B;
    public final AnonymousClass00H A0C;
    public final C18100vl A0D = AnonymousClass1DF.A01(new C150557ks(this));
    public final C18100vl A0E = AnonymousClass1DF.A01(new C150567kt(this));
    public final C18100vl A0F = AnonymousClass1DF.A01(new C150577ku(this));
    public final C18100vl A0G = AnonymousClass1DF.A01(new C150587kv(this));
    public final C18100vl A0H = AnonymousClass1DF.A01(new C150597kw(this));
    public final AnonymousClass1OS A0I;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass61I(View view, C25311Ns r3, C26631Sw r4, AnonymousClass88B r5, AnonymousClass88B r6, AnonymousClass00H r7, AnonymousClass1OS r8, int i) {
        super(view);
        C18070vi.A0d(view, 1);
        C72473Md.A1M(r7, r4, r5, 2);
        C18070vi.A0l(r8, r3);
        this.A05 = view;
        this.A0C = r7;
        this.A04 = i;
        this.A08 = r4;
        this.A0A = r5;
        this.A0I = r8;
        this.A07 = r3;
        this.A09 = r6;
        this.A0B = (StickerView) AnonymousClass3MX.A0C(view, 2131435719);
        this.A06 = (FrameLayout) AnonymousClass3MX.A0C(view, 2131435720);
    }

    public static final boolean A00(C1177260s r2) {
        AnonymousClass6UU r22 = r2.A00;
        if ((r22 instanceof AnonymousClass612) && C18070vi.A18(((AnonymousClass612) r22).A00, C120426Dq.A00)) {
            return true;
        }
        if (!(r22 instanceof AnonymousClass615) || !C18070vi.A18(r22.A00(), "starred")) {
            return false;
        }
        return true;
    }

    public static final boolean A01(C1177260s r2) {
        AnonymousClass6UU r22 = r2.A00;
        if ((r22 instanceof AnonymousClass612) && C18070vi.A18(((AnonymousClass612) r22).A00, C120406Do.A00)) {
            return true;
        }
        if (!(r22 instanceof AnonymousClass615) || !C18070vi.A18(r22.A00(), "recent")) {
            return false;
        }
        return true;
    }

    public final void A0B(boolean z) {
        if (this.A01 != z) {
            this.A01 = z;
            if (!z || !this.A03) {
                StickerView stickerView = this.A0B;
                stickerView.A03 = false;
                stickerView.A08();
                return;
            }
            StickerView stickerView2 = this.A0B;
            stickerView2.A03 = true;
            stickerView2.A07();
        }
    }

    public final void A0C(boolean z) {
        if (z != this.A03) {
            this.A03 = z;
            if (!this.A01 || !z) {
                StickerView stickerView = this.A0B;
                stickerView.A03 = false;
                stickerView.A08();
                return;
            }
            StickerView stickerView2 = this.A0B;
            stickerView2.A03 = true;
            stickerView2.A07();
        }
    }

    public String toString() {
        String r0 = super.toString();
        C18070vi.A0X(r0);
        StringBuilder A11 = AnonymousClass000.A11(r0);
        A11.append("\nitem id = ");
        return AnonymousClass000.A0y(this.A00, A11);
    }
}
