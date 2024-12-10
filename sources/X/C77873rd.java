package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* renamed from: X.3rd  reason: invalid class name and case insensitive filesystem */
public final class C77873rd extends C77913rm {
    public C106625Wo A00;
    public C106645Wq A01;
    public C24771Lp A02;
    public AnonymousClass11C A03;
    public boolean A04;
    public final C73543Wj A05;
    public final AnonymousClass4DV A06 = AnonymousClass4DV.BOT_MEDIA;
    public final RecyclerView A07;
    public final C136166tN A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C77873rd(Context context, AnonymousClass73D r8) {
        super(context);
        C18070vi.A0d(r8, 2);
        A04();
        A04();
        View.inflate(context, 2131624314, this);
        C72453Mb.A17(context, this, 2131231610);
        setVisibility(8);
        RecyclerView recyclerView = (RecyclerView) C18070vi.A05(this, 2131431534);
        this.A07 = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
        C136166tN r2 = new C136166tN(C17890vO.A0D(), getBitmapCaches(), this.A03, "image-loader-bot-image-picker");
        this.A08 = r2;
        C73543Wj r0 = new C73543Wj((AnonymousClass4KQ) ((C92964iD) getAdapterFactory()).A00.A01.A0I.get(), r8, r2);
        this.A05 = r0;
        recyclerView.setAdapter(r0);
    }

    public void CMX() {
        int A052 = A05(0);
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131165483);
        if (A052 > dimensionPixelSize) {
            A052 = dimensionPixelSize;
        }
        A08(A052, false);
    }

    public final void setAdapterFactory(C106625Wo r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public final void setBitmapCaches(C24771Lp r2) {
        C18070vi.A0d(r2, 0);
        this.A02 = r2;
    }

    public final void setSystemServices(AnonymousClass11C r2) {
        C18070vi.A0d(r2, 0);
        this.A03 = r2;
    }

    public boolean BEB() {
        return AnonymousClass000.A1R(this.A05.A04.size());
    }

    public final C106625Wo getAdapterFactory() {
        C106625Wo r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("adapterFactory");
        throw null;
    }

    public final C24771Lp getBitmapCaches() {
        C24771Lp r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("bitmapCaches");
        throw null;
    }

    public final List getBotMediaList() {
        return this.A05.A04;
    }

    public View getContentView() {
        return this.A07;
    }

    public final AnonymousClass11C getSystemServices() {
        AnonymousClass11C r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1N();
        throw null;
    }

    public AnonymousClass4DV getType() {
        return this.A06;
    }

    public final C106645Wq getViewListener$app_product_bot_bot() {
        return this.A01;
    }

    public final void setAdapterListener(C106635Wp r2) {
        this.A05.A00 = r2;
    }

    public final void setupView(View view) {
        if (view != null) {
            setAnchorWidthView(view);
            view.addOnLayoutChangeListener(new C90204dh(view, this, 1));
        }
    }

    public void A09(boolean z) {
        AnonymousClass4aY r5;
        super.A09(z);
        C106645Wq r0 = this.A01;
        if (r0 != null) {
            C92984iF r02 = (C92984iF) r0;
            if (!z) {
                C88204Ys r2 = r02.A00;
                r5 = r02.A01;
                FrameLayout frameLayout = r5.A0W;
                if (frameLayout != null) {
                    frameLayout.removeView(r2.A00);
                }
                C77873rd r1 = r2.A00;
                if (r1 != null) {
                    r1.A01 = null;
                    r1.setAdapterListener((C106635Wp) null);
                }
                r2.A00 = null;
                AnonymousClass4aY.A1P(r5, 0);
                AnonymousClass3V4 r12 = r5.A2Y;
                boolean z2 = r12.A01.A06;
                C41111vp r3 = r12.A05;
                if (AnonymousClass3MX.A0e(r3).A03 != z2) {
                    C88134Yl A0e = AnonymousClass3MX.A0e(r3);
                    AnonymousClass3V4.A00(r3, A0e, A0e.A0B, A0e.A04, z2);
                }
                if (AnonymousClass4aY.A2A(r5)) {
                    r5.A2Y.A0Z(true);
                }
            } else {
                r5 = r02.A01;
                AnonymousClass4aY.A0q(r5);
                C41111vp r32 = r5.A2Y.A05;
                if (AnonymousClass3MX.A0e(r32).A03) {
                    C88134Yl A0e2 = AnonymousClass3MX.A0e(r32);
                    AnonymousClass3V4.A00(r32, A0e2, A0e2.A0B, A0e2.A04, false);
                }
                if (AnonymousClass4aY.A2A(r5)) {
                    r5.A2Y.A0Z(false);
                }
                r5.A2d.A0b((String) null);
                r5.A0V.setVisibility(8);
            }
            r5.A2e();
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A08.A00();
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            A06();
        }
    }

    public final void setViewListener$app_product_bot_bot(C106645Wq r1) {
        this.A01 = r1;
    }
}
