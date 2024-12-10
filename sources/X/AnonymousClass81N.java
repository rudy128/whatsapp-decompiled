package X;

import android.app.Dialog;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.stickers.info.bottomsheet.StickerInfoBottomSheet;
import java.util.List;

/* renamed from: X.81N  reason: invalid class name */
public final class AnonymousClass81N extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ StickerInfoBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass81N(StickerInfoBottomSheet stickerInfoBottomSheet) {
        super(1);
        this.this$0 = stickerInfoBottomSheet;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        View findViewById;
        int A0R;
        int i;
        int i2;
        String string;
        String str;
        List<C123246Tr> list = (List) obj;
        StickerInfoBottomSheet stickerInfoBottomSheet = this.this$0;
        C18070vi.A0b(list);
        list.size();
        if (!list.isEmpty()) {
            LayoutInflater from = LayoutInflater.from(stickerInfoBottomSheet.A14());
            for (C123246Tr r6 : list) {
                View A09 = AnonymousClass3MX.A09(from, stickerInfoBottomSheet.A00, 2131626165);
                C18070vi.A0b(A09);
                C74793cj r2 = (C74793cj) C18070vi.A05(A09, 2131432098);
                boolean z = r6 instanceof C121046Hk;
                if (z) {
                    i = 2131233544;
                } else if (r6 instanceof C121036Hj) {
                    i = 2131233543;
                } else if (r6 instanceof C121026Hi) {
                    i = 2131233541;
                } else if ((r6 instanceof C121016Hh) || (r6 instanceof C121006Hg)) {
                    i = 2131233540;
                } else if (r6 instanceof AnonymousClass6HY) {
                    i = 2131233539;
                    if (((AnonymousClass6HY) r6).A00) {
                        i = 2131233538;
                    }
                } else if (r6 instanceof C120996Hf) {
                    i = 2131233537;
                } else if (r6 instanceof C120986He) {
                    i = 2131233389;
                } else if (r6 instanceof C120976Hd) {
                    i = 2131233334;
                } else if (r6 instanceof C120966Hc) {
                    i = 2131233536;
                } else if (r6 instanceof AnonymousClass6HX) {
                    i = ((AnonymousClass6HX) r6).A00;
                } else if (r6 instanceof C120956Hb) {
                    i = 2131233534;
                } else if (r6 instanceof AnonymousClass6HW) {
                    i = ((AnonymousClass6HW) r6).A00;
                } else if (r6 instanceof C120946Ha) {
                    i = 2131233533;
                } else {
                    i = 2131233542;
                }
                AnonymousClass1FL A1D = stickerInfoBottomSheet.A1D();
                C18000vb r0 = stickerInfoBottomSheet.A02;
                if (r0 != null) {
                    r2.setIcon((Drawable) AnonymousClass3NL.A00(A1D, r0, i));
                    if (z) {
                        i2 = 2131896419;
                    } else if (r6 instanceof C121036Hj) {
                        i2 = 2131896418;
                    } else if (r6 instanceof C121026Hi) {
                        i2 = 2131896417;
                    } else if (r6 instanceof C121016Hh) {
                        i2 = 2131899383;
                    } else if (r6 instanceof C121006Hg) {
                        i2 = 2131896416;
                    } else if (r6 instanceof AnonymousClass6HY) {
                        i2 = 2131896414;
                        if (((AnonymousClass6HY) r6).A00) {
                            i2 = 2131896413;
                        }
                    } else if (r6 instanceof C120996Hf) {
                        i2 = 2131899457;
                    } else if (r6 instanceof C120986He) {
                        i2 = 2131896412;
                    } else if (r6 instanceof C120976Hd) {
                        i2 = 2131896411;
                    } else if (r6 instanceof C120966Hc) {
                        i2 = 2131896410;
                    } else if (r6 instanceof AnonymousClass6HX) {
                        i2 = 2131896404;
                    } else if (r6 instanceof C120956Hb) {
                        i2 = 2131896405;
                    } else if (r6 instanceof AnonymousClass6HW) {
                        i2 = 2131896415;
                    } else if (r6 instanceof C120946Ha) {
                        i2 = 2131899456;
                    } else {
                        i2 = 2131899455;
                    }
                    boolean z2 = r6 instanceof C121016Hh;
                    Resources A092 = AnonymousClass3MZ.A09(stickerInfoBottomSheet);
                    if (z2) {
                        Object[] A1a = AnonymousClass3MW.A1a();
                        AnonymousClass1E7 r02 = C108965cb.A0c(stickerInfoBottomSheet).A00;
                        if (r02 != null) {
                            str = r02.A0K();
                        } else {
                            str = null;
                        }
                        string = AnonymousClass3MW.A0x(A092, str, A1a, 0, i2);
                    } else {
                        string = A092.getString(i2);
                    }
                    r2.setTitle((CharSequence) string);
                    AnonymousClass3MZ.A1P(A09, r6, stickerInfoBottomSheet, 40);
                    AnonymousClass3MW.A1Q(A09);
                    ViewGroup viewGroup = stickerInfoBottomSheet.A00;
                    if (viewGroup != null) {
                        viewGroup.addView(A09);
                    }
                } else {
                    AnonymousClass3MW.A1M();
                    throw null;
                }
            }
            ViewGroup viewGroup2 = stickerInfoBottomSheet.A00;
            if (viewGroup2 != null) {
                viewGroup2.requestLayout();
            }
            ViewGroup viewGroup3 = stickerInfoBottomSheet.A00;
            if (viewGroup3 != null) {
                viewGroup3.invalidate();
            }
            Dialog dialog = stickerInfoBottomSheet.A03;
            if (!(!(dialog instanceof C110745gz) || dialog == null || (findViewById = dialog.findViewById(2131429948)) == null)) {
                if (!findViewById.isLaidOut() || findViewById.isLayoutRequested()) {
                    findViewById.addOnLayoutChangeListener(new AnonymousClass78Z(findViewById, stickerInfoBottomSheet, 5));
                } else {
                    BottomSheetBehavior A02 = BottomSheetBehavior.A02(findViewById);
                    View view = stickerInfoBottomSheet.A0B;
                    if (view != null) {
                        A0R = view.getHeight();
                    } else {
                        A0R = A02.A0R();
                    }
                    C108995ce.A15(A02, A0R);
                    View view2 = stickerInfoBottomSheet.A0B;
                    if (view2 != null) {
                        view2.getHeight();
                    }
                    findViewById.getHeight();
                    View view3 = stickerInfoBottomSheet.A0B;
                    if (view3 != null) {
                        view3.invalidate();
                    }
                }
            }
        }
        return C27621Wu.A00;
    }
}
