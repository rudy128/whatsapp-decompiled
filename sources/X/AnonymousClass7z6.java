package X;

import android.text.Editable;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import com.airbnb.lottie.LottieAnimationView;
import com.whatsapp.WaEditText;
import com.whatsapp.WaTextView;
import com.whatsapp.expressionstray.expression.stickers.SearchFunStickersBottomSheet;
import com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel;
import com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel$rollingPrompt$1;
import com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel$stopRollingPrompt$1;

/* renamed from: X.7z6  reason: invalid class name */
public final class AnonymousClass7z6 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ SearchFunStickersBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7z6(SearchFunStickersBottomSheet searchFunStickersBottomSheet) {
        super(1);
        this.this$0 = searchFunStickersBottomSheet;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int i;
        String str;
        C111825kU r1;
        Editable text;
        AnonymousClass6TG r7 = (AnonymousClass6TG) obj;
        if (r7 instanceof AnonymousClass60M) {
            SearchFunStickersBottomSheet searchFunStickersBottomSheet = this.this$0;
            searchFunStickersBottomSheet.A0S = null;
            int A0D = C72453Mb.A0D(searchFunStickersBottomSheet.A04);
            WaTextView waTextView = searchFunStickersBottomSheet.A0G;
            if (waTextView != null) {
                waTextView.setVisibility(A0D);
            }
            SearchFunStickersBottomSheet.A03(this.this$0);
            AnonymousClass3Ma.A1M(this.this$0.A0P);
            SearchFunStickersViewModel A0Q = C108955ca.A0Q(this.this$0);
            AnonymousClass3MX.A1Q(new SearchFunStickersViewModel$stopRollingPrompt$1(A0Q, (C30391dr) null), C41561wd.A00(A0Q));
            SearchFunStickersViewModel A0Q2 = C108955ca.A0Q(this.this$0);
            AnonymousClass3MX.A1Q(new SearchFunStickersViewModel$stopRollingPrompt$1(A0Q2, (C30391dr) null), C41561wd.A00(A0Q2));
            A0Q2.A08 = AnonymousClass3MY.A0s(new SearchFunStickersViewModel$rollingPrompt$1(A0Q2, (C30391dr) null), C41561wd.A00(A0Q2));
        } else {
            if (r7 instanceof AnonymousClass60J) {
                SearchFunStickersBottomSheet searchFunStickersBottomSheet2 = this.this$0;
                WaEditText waEditText = searchFunStickersBottomSheet2.A0A;
                if (waEditText == null || (text = waEditText.getText()) == null || (str = text.toString()) == null) {
                    str = "";
                }
                searchFunStickersBottomSheet2.A0S = str;
                SearchFunStickersBottomSheet.A05(this.this$0);
                SearchFunStickersBottomSheet searchFunStickersBottomSheet3 = this.this$0;
                LottieAnimationView lottieAnimationView = searchFunStickersBottomSheet3.A08;
                if (lottieAnimationView == null || !lottieAnimationView.A06()) {
                    int A0D2 = C72453Mb.A0D(searchFunStickersBottomSheet3.A0H);
                    FrameLayout frameLayout = searchFunStickersBottomSheet3.A03;
                    if (frameLayout != null) {
                        frameLayout.setVisibility(A0D2);
                    }
                    LottieAnimationView lottieAnimationView2 = searchFunStickersBottomSheet3.A08;
                    if (lottieAnimationView2 != null) {
                        lottieAnimationView2.setRepeatCount(-1);
                        lottieAnimationView2.A04();
                    }
                    int A0D3 = C72453Mb.A0D(searchFunStickersBottomSheet3.A04);
                    WaTextView waTextView2 = searchFunStickersBottomSheet3.A0G;
                    if (waTextView2 != null) {
                        waTextView2.setVisibility(A0D3);
                    }
                    if (!SearchFunStickersBottomSheet.A0B(searchFunStickersBottomSheet3) && (r1 = searchFunStickersBottomSheet3.A0L) != null) {
                        r1.A0W(C29431cG.A0t(r1.A07));
                    }
                    C72453Mb.A1C(searchFunStickersBottomSheet3.A06);
                }
                SearchFunStickersBottomSheet searchFunStickersBottomSheet4 = this.this$0;
                int A0D4 = C72453Mb.A0D(searchFunStickersBottomSheet4.A04);
                WaTextView waTextView3 = searchFunStickersBottomSheet4.A0G;
                if (waTextView3 != null) {
                    waTextView3.setVisibility(A0D4);
                }
                AnonymousClass3Ma.A1M(this.this$0.A0P);
                AnonymousClass1FL A1D = this.this$0.A1D();
                SearchFunStickersBottomSheet searchFunStickersBottomSheet5 = this.this$0;
                AnonymousClass11C r12 = searchFunStickersBottomSheet5.A0J;
                if (r12 != null) {
                    AnonymousClass1Y5.A00(A1D, r12, searchFunStickersBottomSheet5.A1H(2131886123));
                    NestedScrollView nestedScrollView = this.this$0.A06;
                    if (nestedScrollView != null) {
                        nestedScrollView.A0F(0);
                    }
                }
            } else if (r7 instanceof AnonymousClass60K) {
                SearchFunStickersBottomSheet.A06(this.this$0);
                SearchFunStickersBottomSheet searchFunStickersBottomSheet6 = this.this$0;
                C18070vi.A0b(r7);
                AnonymousClass60K r72 = (AnonymousClass60K) r7;
                NestedScrollView nestedScrollView2 = searchFunStickersBottomSheet6.A06;
                int i2 = 8;
                if (nestedScrollView2 != null) {
                    nestedScrollView2.setVisibility(C72453Mb.A07(SearchFunStickersBottomSheet.A0B(searchFunStickersBottomSheet6) ? 1 : 0));
                }
                WaTextView waTextView4 = searchFunStickersBottomSheet6.A0F;
                if (waTextView4 != null) {
                    Exception exc = r72.A00;
                    if (exc instanceof AnonymousClass6S5) {
                        i = 2131890549;
                    } else if (exc instanceof AnonymousClass6S6) {
                        i = 2131890550;
                    } else {
                        boolean z = exc instanceof AnonymousClass6SV;
                        i = 2131890543;
                        if (z) {
                            i = 2131890546;
                        }
                    }
                    waTextView4.setText(i);
                }
                ConstraintLayout constraintLayout = searchFunStickersBottomSheet6.A04;
                if (constraintLayout != null) {
                    constraintLayout.setVisibility(0);
                }
                WaTextView waTextView5 = searchFunStickersBottomSheet6.A0G;
                if (waTextView5 != null) {
                    if (r72.A00 instanceof AnonymousClass6S5) {
                        i2 = 0;
                    }
                    waTextView5.setVisibility(i2);
                }
                SearchFunStickersBottomSheet.A04(searchFunStickersBottomSheet6);
                AnonymousClass3Ma.A1M(this.this$0.A0P);
                SearchFunStickersBottomSheet.A02(this.this$0);
            } else if (r7 instanceof AnonymousClass60L) {
                if (!SearchFunStickersBottomSheet.A0B(this.this$0)) {
                    SearchFunStickersBottomSheet.A09(this.this$0, ((AnonymousClass60L) r7).A01);
                }
                SearchFunStickersBottomSheet.A08(this.this$0);
                AnonymousClass1FL A1D2 = this.this$0.A1D();
                SearchFunStickersBottomSheet searchFunStickersBottomSheet7 = this.this$0;
                AnonymousClass11C r13 = searchFunStickersBottomSheet7.A0J;
                if (r13 != null) {
                    AnonymousClass1Y5.A00(A1D2, r13, searchFunStickersBottomSheet7.A1H(2131886122));
                    AnonymousClass60L r73 = (AnonymousClass60L) r7;
                    if (r73.A02) {
                        SearchFunStickersBottomSheet searchFunStickersBottomSheet8 = this.this$0;
                        String str2 = r73.A00;
                        searchFunStickersBottomSheet8.A0S = str2;
                        WaEditText waEditText2 = searchFunStickersBottomSheet8.A0A;
                        if (waEditText2 != null) {
                            waEditText2.removeTextChangedListener(searchFunStickersBottomSheet8.A0V);
                        }
                        WaEditText waEditText3 = searchFunStickersBottomSheet8.A0A;
                        if (waEditText3 != null) {
                            waEditText3.setText(str2);
                        }
                        WaEditText waEditText4 = searchFunStickersBottomSheet8.A0A;
                        if (waEditText4 != null) {
                            waEditText4.selectAll();
                        }
                        WaEditText waEditText5 = searchFunStickersBottomSheet8.A0A;
                        if (waEditText5 != null) {
                            waEditText5.addTextChangedListener(searchFunStickersBottomSheet8.A0V);
                        }
                    }
                }
            }
            AnonymousClass3MW.A1N();
            throw null;
        }
        return C27621Wu.A00;
    }
}
