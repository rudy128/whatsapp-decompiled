package X;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import com.whatsapp.calling.incallnotifbanner.viewmodel.InCallBannerViewModel;
import com.whatsapp.calling.incallnotifbanner.viewmodel.InCallBannerViewModelV2;
import com.whatsapp.calling.incallnotifbanner.viewmodel.InCallBannerViewModelV2$onBannerDismissed$1;
import java.util.List;

/* renamed from: X.5tL  reason: invalid class name and case insensitive filesystem */
public final class C115065tL extends AnonymousClass4VL {
    public C160968Au A00;
    public boolean A01 = true;
    public final C125666bS A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C115065tL(ViewStub viewStub, AnonymousClass1KB r4, C125666bS r5) {
        super(r4, new C28931bI(viewStub));
        C18070vi.A0d(r4, 1);
        C18070vi.A0k(viewStub, r5);
        this.A02 = r5;
        C145907Nb.A00(this.A00, this, 0);
    }

    public static final void A00(View view, C115065tL r4) {
        Resources A0Y;
        int i;
        if (r4.A01) {
            A0Y = view.getResources();
            i = 2131165630;
        } else {
            A0Y = AnonymousClass000.A0Y(view);
            i = 2131168774;
        }
        int dimensionPixelSize = A0Y.getDimensionPixelSize(i);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = r4.A02.A00 + dimensionPixelSize;
            view.setLayoutParams(marginLayoutParams);
            return;
        }
        throw AnonymousClass000.A0s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public /* bridge */ /* synthetic */ void A02() {
        InCallBannerViewModel inCallBannerViewModel;
        C160968Au r1 = this.A00;
        if (r1 == null) {
            AnonymousClass3MW.A1H();
            throw null;
        } else if ((r1 instanceof InCallBannerViewModel) && (inCallBannerViewModel = (InCallBannerViewModel) r1) != null) {
            inCallBannerViewModel.A0T(true);
        }
    }

    public /* bridge */ /* synthetic */ void A03(C108745cE r6) {
        AnonymousClass7C7 r62 = (AnonymousClass7C7) r6;
        C18070vi.A0d(r62, 0);
        C160968Au r4 = this.A00;
        if (r4 == null) {
            AnonymousClass3MW.A1H();
            throw null;
        } else if (r4 instanceof InCallBannerViewModel) {
            ((InCallBannerViewModel) r4).A0T(false);
        } else if (r4 instanceof InCallBannerViewModelV2) {
            InCallBannerViewModelV2 inCallBannerViewModelV2 = (InCallBannerViewModelV2) r4;
            AnonymousClass3MW.A1X(inCallBannerViewModelV2.A0K, new InCallBannerViewModelV2$onBannerDismissed$1(r62, inCallBannerViewModelV2, (C30391dr) null), C41561wd.A00(inCallBannerViewModelV2));
        }
    }

    /* renamed from: A05 */
    public void A04(AnonymousClass7C7 r31) {
        boolean z;
        AnonymousClass7C7 r14 = r31;
        C18070vi.A0d(r14, 0);
        C160968Au r1 = this.A00;
        if (r1 == null) {
            AnonymousClass3MW.A1H();
            throw null;
        }
        if ((r1 instanceof InCallBannerViewModel) && z) {
            C90084dV r11 = new C90084dV((Object) r1, (Object) r14, (Object) this, 34);
            C122636Rd r16 = r14.A04;
            AnonymousClass4ZN r15 = r14.A09;
            AnonymousClass4ZN r10 = r14.A08;
            List list = r14.A0B;
            C107345Zi r8 = r14.A05;
            int i = r14.A00;
            ImageView.ScaleType scaleType = r14.A03;
            boolean z2 = r14.A0F;
            boolean z3 = r14.A0G;
            AnonymousClass4ZN r3 = r14.A06;
            AnonymousClass4ZN r2 = r14.A07;
            int i2 = i;
            List list2 = list;
            Long l = r14.A0A;
            AnonymousClass4ZN r22 = r2;
            AnonymousClass4ZN r21 = r3;
            AnonymousClass4ZN r20 = r10;
            AnonymousClass4ZN r19 = r15;
            C107345Zi r18 = r8;
            C122636Rd r17 = r16;
            ImageView.ScaleType scaleType2 = scaleType;
            C90084dV r152 = r11;
            r14 = new AnonymousClass7C7(r152, scaleType2, r17, r18, r19, r20, r21, r22, l, list2, i2, z2, z3, (z = r14.A0C), r14.A0D);
        }
        super.A04(r14);
    }

    public void A01() {
        InCallBannerViewModel inCallBannerViewModel;
        super.A01();
        C160968Au r1 = this.A00;
        if (r1 == null) {
            AnonymousClass3MW.A1H();
            throw null;
        } else if ((r1 instanceof InCallBannerViewModel) && (inCallBannerViewModel = (InCallBannerViewModel) r1) != null) {
            inCallBannerViewModel.A0T(false);
        }
    }
}
