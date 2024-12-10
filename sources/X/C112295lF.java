package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.stickers.store.StickerStoreMyTabFragment;
import com.whatsapp.stickers.store.StickerStoreTabFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5lF  reason: invalid class name and case insensitive filesystem */
public abstract class C112295lF extends C38391rD {
    public List A00;
    public final /* synthetic */ StickerStoreTabFragment A01;

    public static void A01(C112295lF r10, C113495nB r11, AnonymousClass4VT r12) {
        AnonymousClass6RG r1;
        AnonymousClass4VT r6 = r12;
        if (r12 != null) {
            StickerStoreTabFragment stickerStoreTabFragment = r10.A01;
            int dimensionPixelSize = AnonymousClass3MZ.A09(stickerStoreTabFragment).getDimensionPixelSize(2131168929);
            C18030ve r3 = stickerStoreTabFragment.A07;
            C26631Sw r5 = stickerStoreTabFragment.A09;
            if (stickerStoreTabFragment instanceof StickerStoreMyTabFragment) {
                r1 = AnonymousClass6RG.STICKER_STORE_MY_TAB;
            } else {
                r1 = AnonymousClass6RG.STICKER_STORE_FEATURED_TAB;
            }
            r11.A00 = new C112345lK(r3, stickerStoreTabFragment.A08, r5, r6, dimensionPixelSize, 0, false, r1.equals(AnonymousClass6RG.STICKER_STORE_MY_TAB));
        }
    }

    public C112295lF(StickerStoreTabFragment stickerStoreTabFragment, List list) {
        this.A01 = stickerStoreTabFragment;
        this.A00 = list;
    }

    public static void A00(AnonymousClass725 r6, C112295lF r7, C113495nB r8) {
        C112345lK r5 = r8.A00;
        if (r5 != null) {
            List list = r6.A07;
            C18070vi.A0b(list);
            ArrayList arrayList = null;
            if (AnonymousClass000.A1a(list)) {
                arrayList = C29351c6.A0D(list);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C1418377d A0x = C108945cZ.A0x(it);
                    C18070vi.A0b(A0x);
                    arrayList.add(new C135906sx(A0x, false, false));
                }
            }
            r5.A01 = r6;
            r5.A03 = arrayList;
            C112345lK r2 = r8.A00;
            int i = r7.A01.A00;
            r2.A00 = i;
            r8.A0F.A1g(i);
            r8.A00.notifyDataSetChanged();
            r8.A0G.setAdapter(r8.A00);
            AnonymousClass3MY.A1E(r8.A0I, r7, r6, 33);
            r8.A05.setVisibility(C72453Mb.A07(r6.A0Q ? 1 : 0));
        }
    }

    public void Bmc(C42011xT r6, int i) {
        C113495nB r62 = (C113495nB) r6;
        AnonymousClass725 r4 = (AnonymousClass725) this.A00.get(i);
        r62.A0C.setText(r4.A0K);
        r62.A0D.setVisibility(4);
        r62.A01.setVisibility(4);
        r62.A0E.setText(r4.A04);
        View view = r62.A02;
        AnonymousClass1Y5.A0A(view, true);
        view.setClickable(true);
        AnonymousClass78T.A00(view, this, r4, i, 29);
        StickerStoreTabFragment stickerStoreTabFragment = this.A01;
        if (C18020vd.A05(C18040vf.A02, stickerStoreTabFragment.A07, 7296)) {
            AnonymousClass7RO.A02(stickerStoreTabFragment.A0C, this, r62, r4, 8);
            return;
        }
        if (r62.A00 == null) {
            A01(this, r62, stickerStoreTabFragment.A0A.A08());
        }
        A00(r4, this, r62);
    }

    public C42011xT BqY(ViewGroup viewGroup, int i) {
        StickerStoreTabFragment stickerStoreTabFragment = this.A01;
        View inflate = stickerStoreTabFragment.A01.inflate(2131627121, viewGroup, false);
        RecyclerView A0Q = AnonymousClass3MX.A0Q(inflate, 2131435763);
        A0Q.setNestedScrollingEnabled(false);
        A0Q.A0r(new C112585li(this, AnonymousClass3MZ.A09(stickerStoreTabFragment).getDimensionPixelSize(2131168930), 3));
        int dimensionPixelSize = AnonymousClass3MZ.A09(stickerStoreTabFragment).getDimensionPixelSize(2131168929);
        if (stickerStoreTabFragment.A00 == 0) {
            stickerStoreTabFragment.A00 = Math.min(5, Math.max(viewGroup.getWidth() / dimensionPixelSize, 1));
        }
        return new C113495nB(inflate, stickerStoreTabFragment);
    }
}
