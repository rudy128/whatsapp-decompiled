package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import com.whatsapp.WaNetworkResourceImageView;
import com.whatsapp.expressionstray.expression.stickers.SearchFunStickersBottomSheet;
import java.util.Map;

/* renamed from: X.7zB  reason: invalid class name */
public final class AnonymousClass7zB extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ SearchFunStickersBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7zB(SearchFunStickersBottomSheet searchFunStickersBottomSheet) {
        super(1);
        this.this$0 = searchFunStickersBottomSheet;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C135206rp r11 = (C135206rp) obj;
        if (C18070vi.A18(C108955ca.A0Q(this.this$0).A0A.A06(), AnonymousClass60M.A00)) {
            SearchFunStickersBottomSheet searchFunStickersBottomSheet = this.this$0;
            C18070vi.A0b(r11);
            int i = r11.A01;
            int i2 = r11.A00;
            int i3 = r11.A02;
            SearchFunStickersBottomSheet.A01(searchFunStickersBottomSheet.A0E, searchFunStickersBottomSheet, i3);
            Map map = searchFunStickersBottomSheet.A0W;
            WaNetworkResourceImageView waNetworkResourceImageView = (WaNetworkResourceImageView) AnonymousClass000.A0w(map, i);
            WaNetworkResourceImageView waNetworkResourceImageView2 = (WaNetworkResourceImageView) AnonymousClass000.A0w(map, i2);
            ValueAnimator A00 = SearchFunStickersBottomSheet.A00(waNetworkResourceImageView, 1.0f, 0.0f);
            ValueAnimator A002 = SearchFunStickersBottomSheet.A00(searchFunStickersBottomSheet.A0H, 1.0f, 0.0f);
            ValueAnimator A003 = SearchFunStickersBottomSheet.A00(waNetworkResourceImageView2, 0.0f, 1.0f);
            ValueAnimator A004 = SearchFunStickersBottomSheet.A00(searchFunStickersBottomSheet.A0E, 0.0f, 1.0f);
            AnimatorSet A0B = C108945cZ.A0B();
            Animator[] animatorArr = new Animator[4];
            C17900vP.A0O(A00, A002, A003, A004, animatorArr);
            A0B.playTogether(animatorArr);
            A0B.addListener(new C109075cm(waNetworkResourceImageView, waNetworkResourceImageView2, searchFunStickersBottomSheet, i3));
            A0B.start();
        }
        return C27621Wu.A00;
    }
}
