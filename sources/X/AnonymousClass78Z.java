package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.WaTextView;
import com.whatsapp.stickers.info.bottomsheet.EditCustomStickerPackBottomSheet;
import com.whatsapp.webpagepreview.WebPagePreviewView;
import java.util.List;

/* renamed from: X.78Z  reason: invalid class name */
public class AnonymousClass78Z implements View.OnLayoutChangeListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public AnonymousClass78Z(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        WaTextView waTextView;
        C122086Ms r5;
        C110595gJ r0;
        C29341c3 r2;
        int A0R;
        View view2 = view;
        switch (this.A00) {
            case 0:
                View view3 = (View) this.A02;
                if (view3.getVisibility() == 0 && (r2 = r0.A06) != null && view3 == (r0 = (C110595gJ) this.A01).A01) {
                    Rect A07 = AnonymousClass3MW.A07();
                    view3.getDrawingRect(A07);
                    r2.setBounds(A07);
                    r2.A08(view3, (FrameLayout) null);
                    return;
                }
                return;
            case 1:
                View view4 = (View) this.A01;
                ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = (ViewTreeObserver.OnGlobalLayoutListener) this.A02;
                int visibility = view4.getVisibility();
                ViewTreeObserver viewTreeObserver = view4.getViewTreeObserver();
                if (visibility == 0) {
                    viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
                    return;
                } else {
                    viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
                    return;
                }
            case 2:
                int[] A1W = C108945cZ.A1W();
                View view5 = (View) this.A01;
                view5.getLocationOnScreen(A1W);
                C109225d1 r4 = (C109225d1) this.A02;
                int i9 = r4.A00;
                if (i9 != 0 && i9 - A1W[1] >= 0) {
                    ViewGroup.MarginLayoutParams A0P = C72463Mc.A0P(view5);
                    A0P.topMargin = r4.A00 - A1W[1];
                    view5.setLayoutParams(A0P);
                    return;
                }
                return;
            case 3:
                int i10 = 0;
                C18070vi.A0d(view2, 0);
                AnonymousClass6GW r42 = (AnonymousClass6GW) this.A02;
                C143017Br r3 = ((C143017Br[]) this.A01)[0];
                C18070vi.A0U(r3);
                String str = r3.A04;
                boolean z = r3.A06;
                C36391no r7 = r42.A09;
                AnonymousClass210 r52 = r42.A0E;
                if (r7.BX2(r52.A0H(), r52, str) != null) {
                    r42.A0F.A01();
                    r42.A05.A01();
                } else {
                    CardView webPagePreviewContainer = r42.A0G.getWebPagePreviewContainer();
                    r42.A01 = webPagePreviewContainer;
                    int i11 = 3;
                    if (z) {
                        i11 = 2;
                    }
                    r42.A03 = Integer.valueOf(i11);
                    webPagePreviewContainer.setVisibility(0);
                    View findViewById = webPagePreviewContainer.findViewById(2131437042);
                    WebPagePreviewView webPagePreviewView = (WebPagePreviewView) C18070vi.A05(findViewById, 2131432020);
                    View A05 = C18070vi.A05(webPagePreviewView, 2131432018);
                    String A022 = r42.A0D.A02(r52.A17());
                    if (A022 != null && C63712tZ.A01(A022) == 4) {
                        if (C18020vd.A05(C18040vf.A02, r42.A0B, 9790)) {
                            View view6 = r42.A01;
                            if (view6 != null) {
                                int dimensionPixelSize = view6.getResources().getDimensionPixelSize(2131168872);
                                int dimensionPixelSize2 = view6.getResources().getDimensionPixelSize(2131168870);
                                Bitmap A0H = C108945cZ.A0H(dimensionPixelSize, dimensionPixelSize2);
                                C18070vi.A0X(A0H);
                                C24149BwF A0C = C109005cf.A0C(view6.getContext(), view6, new C25022CTy((AnonymousClass18K) r42.A0I.get()));
                                C61862qP r13 = r42.A07;
                                ViewGroup viewGroup = null;
                                if (r13 != null) {
                                    r5 = r13.A01(A0H, r52, A0C, A022, dimensionPixelSize2);
                                    viewGroup = r5.A0B;
                                } else {
                                    r5 = null;
                                }
                                webPagePreviewView.addView(viewGroup);
                                view6.setVisibility(0);
                                if (r5 != null) {
                                    r5.A0T(new C146137Ny(r5, r42, 3));
                                    r5.A0E();
                                }
                            }
                        }
                    }
                    if (C18070vi.A18(str, A022)) {
                        r42.A04 = str;
                        C18070vi.A0b(findViewById);
                        C1420878c r132 = new C1420878c(A05, findViewById, r42, webPagePreviewView, z);
                        if (!C87504Vv.A01(A022)) {
                            C32981i4 r43 = r42.A0A;
                            if (!r43.A0I(A022) && !r43.A0J(A022)) {
                                waTextView = webPagePreviewView.A0G;
                                waTextView.addOnLayoutChangeListener(r132);
                                webPagePreviewView.A0K.setImageDrawable((Drawable) null);
                                webPagePreviewView.A0K.setVisibility(8);
                                webPagePreviewView.A0D.setVisibility(8);
                                WebPagePreviewView.A0C(webPagePreviewView, Integer.valueOf(r52.A00), r52.A06, r52.A05, webPagePreviewView.A0Q.A02(r52.A17()), (List) null, -1, 0, AnonymousClass000.A1W(webPagePreviewView.A0M.BX2(r52.A0I(), r52, str)), false, false);
                            }
                        }
                        waTextView = webPagePreviewView.A0E;
                        waTextView.addOnLayoutChangeListener(r132);
                        webPagePreviewView.A0K.setImageDrawable((Drawable) null);
                        webPagePreviewView.A0K.setVisibility(8);
                        webPagePreviewView.A0D.setVisibility(8);
                        WebPagePreviewView.A0C(webPagePreviewView, Integer.valueOf(r52.A00), r52.A06, r52.A05, webPagePreviewView.A0Q.A02(r52.A17()), (List) null, -1, 0, AnonymousClass000.A1W(webPagePreviewView.A0M.BX2(r52.A0I(), r52, str)), false, false);
                    } else {
                        r42.A0F.A01();
                        r42.A05.A01();
                        i10 = 8;
                    }
                    webPagePreviewView.setVisibility(i10);
                }
                view2.removeOnLayoutChangeListener(this);
                return;
            case 4:
                view2.removeOnLayoutChangeListener(this);
                GridLayoutManager gridLayoutManager = (GridLayoutManager) this.A01;
                int width = view2.getWidth() / C72453Mb.A0I(((EditCustomStickerPackBottomSheet) this.A02).A0D);
                int i12 = 1;
                if (1 < width) {
                    i12 = width;
                }
                gridLayoutManager.A1g(i12);
                return;
            case 5:
                view2.removeOnLayoutChangeListener(this);
                View view7 = (View) this.A01;
                BottomSheetBehavior A023 = BottomSheetBehavior.A02(view7);
                Fragment fragment = (Fragment) this.A02;
                View view8 = fragment.A0B;
                if (view8 != null) {
                    A0R = view8.getHeight();
                } else {
                    A0R = A023.A0R();
                }
                C108995ce.A15(A023, A0R);
                View view9 = fragment.A0B;
                if (view9 != null) {
                    view9.getHeight();
                }
                view7.getHeight();
                View view10 = fragment.A0B;
                if (view10 != null) {
                    view10.invalidate();
                    return;
                }
                return;
            case 6:
                view2.removeOnLayoutChangeListener(this);
                View view11 = (View) this.A01;
                BottomSheetBehavior A024 = BottomSheetBehavior.A02(view11);
                C108995ce.A15(A024, view11.getHeight());
                A024.A0Z(new C114255qP(A024, this.A02, 4));
                return;
            default:
                view2.removeOnLayoutChangeListener(this);
                ((View) this.A01).addOnLayoutChangeListener((C1420978d) this.A02);
                return;
        }
    }
}
