package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.whatsapp.WaNetworkResourceImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.expressionstray.expression.stickers.SearchFunStickersBottomSheet;
import com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel;
import com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel$rollingPrompt$1;
import com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel$stopRollingPrompt$1;

/* renamed from: X.5cm  reason: invalid class name and case insensitive filesystem */
public final class C109075cm extends AnimatorListenerAdapter {
    public final /* synthetic */ int A00;
    public final /* synthetic */ WaNetworkResourceImageView A01;
    public final /* synthetic */ WaNetworkResourceImageView A02;
    public final /* synthetic */ SearchFunStickersBottomSheet A03;

    public void onAnimationEnd(Animator animator, boolean z) {
        C18070vi.A0d(animator, 0);
        super.onAnimationEnd(animator, z);
        WaNetworkResourceImageView waNetworkResourceImageView = this.A02;
        if (waNetworkResourceImageView != null) {
            waNetworkResourceImageView.setAlpha(0.0f);
        }
        SearchFunStickersBottomSheet searchFunStickersBottomSheet = this.A03;
        WaTextView waTextView = searchFunStickersBottomSheet.A0E;
        if (waTextView != null) {
            waTextView.setAlpha(0.0f);
        }
        SearchFunStickersBottomSheet.A01(searchFunStickersBottomSheet.A0H, searchFunStickersBottomSheet, this.A00);
        WaNetworkResourceImageView waNetworkResourceImageView2 = this.A01;
        if (waNetworkResourceImageView2 != null) {
            waNetworkResourceImageView2.setAlpha(1.0f);
        }
        WaTextView waTextView2 = searchFunStickersBottomSheet.A0H;
        if (waTextView2 != null) {
            waTextView2.setAlpha(1.0f);
        }
        SearchFunStickersViewModel A0Q = C108955ca.A0Q(searchFunStickersBottomSheet);
        AnonymousClass3MX.A1Q(new SearchFunStickersViewModel$stopRollingPrompt$1(A0Q, (C30391dr) null), C41561wd.A00(A0Q));
        A0Q.A08 = AnonymousClass3MY.A0s(new SearchFunStickersViewModel$rollingPrompt$1(A0Q, (C30391dr) null), C41561wd.A00(A0Q));
    }

    public C109075cm(WaNetworkResourceImageView waNetworkResourceImageView, WaNetworkResourceImageView waNetworkResourceImageView2, SearchFunStickersBottomSheet searchFunStickersBottomSheet, int i) {
        this.A02 = waNetworkResourceImageView;
        this.A03 = searchFunStickersBottomSheet;
        this.A00 = i;
        this.A01 = waNetworkResourceImageView2;
    }
}
