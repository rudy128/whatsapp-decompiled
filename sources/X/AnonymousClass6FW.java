package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.whatsapp.WaImageView;
import com.whatsapp.stickers.StickerView;

/* renamed from: X.6FW  reason: invalid class name */
public final class AnonymousClass6FW extends C116435xG {
    public AnonymousClass1KB A00;
    public AnonymousClass70H A01;
    public C26631Sw A02;
    public StickerView A03 = ((StickerView) C18070vi.A05(this, 2131435781));
    public AnonymousClass10I A04;
    public boolean A05;
    public View A06 = C18070vi.A05(this, 2131433364);
    public WaImageView A07 = C108965cb.A0I(this, 2131431907);
    public WaImageView A08 = C108965cb.A0I(this, 2131435579);
    public final int A09 = getResources().getDimensionPixelSize(2131168564);

    public AnonymousClass6FW(Context context) {
        super(context, (AttributeSet) null);
        A02();
        this.A00 = 1.0f;
        View.inflate(context, 2131626819, this);
    }

    public static final void setMessage$lambda$2(AnonymousClass6FW r4, C441322g r5, ViewGroup viewGroup) {
        C18070vi.A0d(r4, 0);
        C18070vi.A0d(r5, 1);
        C18070vi.A0d(viewGroup, 2);
        r4.getGlobalUI().A0J(new C146617Py(r5, viewGroup, r4, r4.getStickerFactory().A01(r5), 19));
    }

    public static final void setMessage$lambda$2$lambda$1(C441322g r9, ViewGroup viewGroup, AnonymousClass6FW r11, C1418377d r12) {
        boolean A17 = C18070vi.A17(r9, viewGroup);
        C1418377d r3 = r12;
        C18070vi.A0k(r11, r12);
        if (C108965cb.A1V(viewGroup, r9.A0v)) {
            StickerView stickerView = r11.A03;
            C108955ca.A1B(AnonymousClass3MY.A04(r11), stickerView, r12);
            C26631Sw stickerImageFileLoader = r11.getStickerImageFileLoader();
            int i = r11.A09;
            stickerImageFileLoader.A06(new C59842my(stickerView, r3, new AnonymousClass7MK(r11, A17 ? 1 : 0), i, i, A17, 0, A17, A17, false));
        }
    }

    public final void setGlobalUI(AnonymousClass1KB r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public void setMessage(C441322g r6) {
        C18070vi.A0d(r6, 0);
        this.A03 = r6;
        WaImageView waImageView = this.A08;
        WaImageView waImageView2 = this.A07;
        A04(waImageView, waImageView2);
        View view = this.A06;
        int i = 0;
        if (!(waImageView.getVisibility() == 0 || waImageView2.getVisibility() == 0)) {
            i = 8;
        }
        view.setVisibility(i);
        StickerView stickerView = this.A03;
        stickerView.A02 = true;
        ViewParent parent = stickerView.getParent();
        C18070vi.A0z(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        View view2 = (View) parent;
        AnonymousClass205 r0 = r6.A0v;
        view2.setTag(r0);
        AnonymousClass10I waWorkers = getWaWorkers();
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(r0.A01);
        waWorkers.CGL(new AnonymousClass3C5(this, r6, view2, 41), AnonymousClass000.A0y("loadSticker", A10));
    }

    public final void setStickerFactory(AnonymousClass70H r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public final void setStickerImageFileLoader(C26631Sw r2) {
        C18070vi.A0d(r2, 0);
        this.A02 = r2;
    }

    public final void setWaWorkers(AnonymousClass10I r2) {
        C18070vi.A0d(r2, 0);
        this.A04 = r2;
    }

    public final AnonymousClass1KB getGlobalUI() {
        AnonymousClass1KB r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1C();
        throw null;
    }

    public final AnonymousClass70H getStickerFactory() {
        AnonymousClass70H r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("stickerFactory");
        throw null;
    }

    public final C26631Sw getStickerImageFileLoader() {
        C26631Sw r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("stickerImageFileLoader");
        throw null;
    }

    public final AnonymousClass10I getWaWorkers() {
        AnonymousClass10I r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1G();
        throw null;
    }

    public void setRadius(int i) {
        this.A00 = i;
        if (i > 0) {
            View view = this.A06;
            AnonymousClass3MY.A0v(getContext(), view, 2131232923);
            C108965cb.A12(view, -1);
            Drawable background = view.getBackground();
            C18070vi.A0z(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            ((GradientDrawable) background).setCornerRadius((float) i);
        }
    }
}
