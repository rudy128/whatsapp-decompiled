package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.expressionstray.expression.gifs.GifExpressionsFragment;
import com.whatsapp.expressionstray.search.ExpressionsSearchViewModel;
import com.whatsapp.infra.gifsearch.controls.AdaptiveRecyclerView;

/* renamed from: X.7z5  reason: invalid class name */
public final class AnonymousClass7z5 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ GifExpressionsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7z5(GifExpressionsFragment gifExpressionsFragment) {
        super(1);
        this.this$0 = gifExpressionsFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        GifExpressionsFragment gifExpressionsFragment;
        C132446mp r3;
        Context A1n;
        int i;
        if (C18070vi.A18(obj, AnonymousClass600.A00)) {
            GifExpressionsFragment gifExpressionsFragment2 = this.this$0;
            C72453Mb.A1C(gifExpressionsFragment2.A03);
            int A0D = C72453Mb.A0D(gifExpressionsFragment2.A00);
            AdaptiveRecyclerView adaptiveRecyclerView = gifExpressionsFragment2.A0B;
            if (adaptiveRecyclerView != null) {
                adaptiveRecyclerView.setVisibility(A0D);
            }
            View view = gifExpressionsFragment2.A02;
            if (view != null) {
                view.setVisibility(A0D);
            }
        } else {
            if (C18070vi.A18(obj, C117555zz.A00)) {
                gifExpressionsFragment = this.this$0;
                C72453Mb.A1C(gifExpressionsFragment.A0B);
                int A0D2 = C72453Mb.A0D(gifExpressionsFragment.A03);
                View view2 = gifExpressionsFragment.A00;
                if (view2 != null) {
                    view2.setVisibility(A0D2);
                }
                View view3 = gifExpressionsFragment.A02;
                if (view3 != null) {
                    view3.setVisibility(A0D2);
                }
                AnonymousClass00H r0 = gifExpressionsFragment.A0E;
                if (r0 != null) {
                    r3 = (C132446mp) r0.get();
                    A1n = gifExpressionsFragment.A1n();
                    i = 2131890257;
                }
                C18070vi.A11("talkbackForSearchLazy");
                throw null;
            } else if (C18070vi.A18(obj, C117545zy.A00)) {
                gifExpressionsFragment = this.this$0;
                C72453Mb.A1C(gifExpressionsFragment.A00);
                int A0D3 = C72453Mb.A0D(gifExpressionsFragment.A0B);
                View view4 = gifExpressionsFragment.A03;
                if (view4 != null) {
                    view4.setVisibility(A0D3);
                }
                View view5 = gifExpressionsFragment.A02;
                if (view5 != null) {
                    view5.setVisibility(A0D3);
                }
                AnonymousClass00H r02 = gifExpressionsFragment.A0E;
                if (r02 != null) {
                    r3 = (C132446mp) r02.get();
                    A1n = gifExpressionsFragment.A1n();
                    i = 2131890255;
                }
                C18070vi.A11("talkbackForSearchLazy");
                throw null;
            } else if (C18070vi.A18(obj, AnonymousClass601.A00)) {
                gifExpressionsFragment = this.this$0;
                C72453Mb.A1C(gifExpressionsFragment.A02);
                int A0D4 = C72453Mb.A0D(gifExpressionsFragment.A03);
                View view6 = gifExpressionsFragment.A00;
                if (view6 != null) {
                    view6.setVisibility(A0D4);
                }
                AdaptiveRecyclerView adaptiveRecyclerView2 = gifExpressionsFragment.A0B;
                if (adaptiveRecyclerView2 != null) {
                    adaptiveRecyclerView2.setVisibility(A0D4);
                }
                AnonymousClass00H r03 = gifExpressionsFragment.A0E;
                if (r03 != null) {
                    r3 = (C132446mp) r03.get();
                    A1n = gifExpressionsFragment.A1n();
                    i = 2131890258;
                }
                C18070vi.A11("talkbackForSearchLazy");
                throw null;
            }
            r3.A00(A1n, AnonymousClass3MY.A0n(gifExpressionsFragment, i));
        }
        ExpressionsSearchViewModel expressionsSearchViewModel = this.this$0.A06;
        if (expressionsSearchViewModel != null) {
            expressionsSearchViewModel.A05 = obj instanceof C117545zy;
        }
        return C27621Wu.A00;
    }
}
