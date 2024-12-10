package X;

import android.widget.FrameLayout;
import com.whatsapp.WaEditText;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.expressionstray.expression.stickers.SearchFunStickersBottomSheet;

/* renamed from: X.7z9  reason: invalid class name */
public final class AnonymousClass7z9 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ SearchFunStickersBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7z9(SearchFunStickersBottomSheet searchFunStickersBottomSheet) {
        super(1);
        this.this$0 = searchFunStickersBottomSheet;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        SearchFunStickersBottomSheet searchFunStickersBottomSheet;
        FrameLayout frameLayout;
        int i;
        if (C18070vi.A18(obj, AnonymousClass60P.A00)) {
            searchFunStickersBottomSheet = this.this$0;
            SearchFunStickersBottomSheet.A05(searchFunStickersBottomSheet);
            AnonymousClass3Ma.A1M(searchFunStickersBottomSheet.A0O);
            C72453Mb.A1C(searchFunStickersBottomSheet.A00);
            AnonymousClass3Ma.A1M(searchFunStickersBottomSheet.A0P);
            WaTextView waTextView = searchFunStickersBottomSheet.A0I;
            if (waTextView != null) {
                waTextView.setText(2131890562);
            }
            WaImageView waImageView = searchFunStickersBottomSheet.A0C;
            if (waImageView != null) {
                waImageView.setImageDrawable(AnonymousClass03S.A01(searchFunStickersBottomSheet.A14(), 2131231814));
            }
            frameLayout = searchFunStickersBottomSheet.A01;
            if (frameLayout != null) {
                i = 31;
            }
            return C27621Wu.A00;
        } else if (C18070vi.A18(obj, AnonymousClass60N.A00)) {
            searchFunStickersBottomSheet = this.this$0;
            C111825kU r0 = searchFunStickersBottomSheet.A0L;
            if (r0 != null) {
                r0.A02 = false;
            }
            WaEditText waEditText = searchFunStickersBottomSheet.A0A;
            if (waEditText != null) {
                waEditText.A0H();
            }
            SearchFunStickersBottomSheet.A05(searchFunStickersBottomSheet);
            C72453Mb.A1D(searchFunStickersBottomSheet.A00);
            C28931bI r02 = searchFunStickersBottomSheet.A0O;
            if (r02 != null) {
                r02.A04(0);
            }
            AnonymousClass3Ma.A1M(searchFunStickersBottomSheet.A0P);
            WaTextView waTextView2 = searchFunStickersBottomSheet.A0I;
            if (waTextView2 != null) {
                waTextView2.setText(2131890558);
            }
            WaImageView waImageView2 = searchFunStickersBottomSheet.A0C;
            if (waImageView2 != null) {
                waImageView2.setImageDrawable(AnonymousClass03S.A01(searchFunStickersBottomSheet.A14(), 2131231672));
            }
            frameLayout = searchFunStickersBottomSheet.A01;
            if (frameLayout != null) {
                i = 34;
            }
            return C27621Wu.A00;
        } else {
            if (C18070vi.A18(obj, AnonymousClass60O.A00)) {
                searchFunStickersBottomSheet = this.this$0;
                C111825kU r1 = searchFunStickersBottomSheet.A0L;
                if (r1 != null) {
                    r1.A02 = true;
                }
                SearchFunStickersBottomSheet.A07(searchFunStickersBottomSheet);
                AnonymousClass3Ma.A1M(searchFunStickersBottomSheet.A0O);
                C72453Mb.A1C(searchFunStickersBottomSheet.A00);
                SearchFunStickersBottomSheet.A08(searchFunStickersBottomSheet);
                WaTextView waTextView3 = searchFunStickersBottomSheet.A0I;
                if (waTextView3 != null) {
                    waTextView3.setText(2131890562);
                }
                WaImageView waImageView3 = searchFunStickersBottomSheet.A0C;
                if (waImageView3 != null) {
                    waImageView3.setImageDrawable(AnonymousClass03S.A01(searchFunStickersBottomSheet.A14(), 2131231814));
                }
                frameLayout = searchFunStickersBottomSheet.A01;
                if (frameLayout != null) {
                    i = 33;
                }
            }
            return C27621Wu.A00;
        }
        AnonymousClass78O.A00(frameLayout, searchFunStickersBottomSheet, i);
        return C27621Wu.A00;
    }
}
