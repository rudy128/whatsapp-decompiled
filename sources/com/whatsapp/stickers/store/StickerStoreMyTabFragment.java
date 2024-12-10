package com.whatsapp.stickers.store;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass1SB;
import X.AnonymousClass6IG;
import X.AnonymousClass6MX;
import X.AnonymousClass725;
import X.AnonymousClass7RQ;
import X.AnonymousClass8AI;
import X.BM5;
import X.C108945cZ;
import X.C108965cb;
import X.C112295lF;
import X.C17890vO;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StickerStoreMyTabFragment extends Hilt_StickerStoreMyTabFragment implements AnonymousClass8AI {
    public View A00;
    public BM5 A01;
    public AnonymousClass00H A02;
    public AnonymousClass00H A03;
    public boolean A04;
    public AnonymousClass6MX A05;

    public void Bzs() {
        this.A05 = null;
    }

    public static void A00(StickerStoreMyTabFragment stickerStoreMyTabFragment) {
        C17890vO.A0t(stickerStoreMyTabFragment.A05);
        AnonymousClass6MX r1 = new AnonymousClass6MX(stickerStoreMyTabFragment.A0A, stickerStoreMyTabFragment);
        stickerStoreMyTabFragment.A05 = r1;
        C17890vO.A0u(r1, stickerStoreMyTabFragment.A0C);
    }

    public void Bzq(AnonymousClass725 r5) {
        C112295lF r3 = this.A0B;
        if ((r3 instanceof AnonymousClass6IG) && r3.A00 != null) {
            String str = r5.A0H;
            for (int i = 0; i < r3.A00.size(); i++) {
                if (str.equals(((AnonymousClass725) r3.A00.get(i)).A0H)) {
                    r3.A00.set(i, r5);
                    r3.A0G(i);
                    return;
                }
            }
        }
    }

    public void Bzt(String str) {
        if (this.A0J != null) {
            for (int i = 0; i < this.A0J.size(); i++) {
                if (AnonymousClass725.A01(str, this.A0J, i)) {
                    this.A0J.remove(i);
                    C112295lF r1 = this.A0B;
                    if (r1 instanceof AnonymousClass6IG) {
                        r1.A00 = this.A0J;
                        r1.notifyDataSetChanged();
                        return;
                    }
                    return;
                }
            }
        }
    }

    public void A1j() {
        super.A1j();
        List list = this.A0J;
        if (list != null && this.A04) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C108965cb.A0b(this, i).A00 = size - i;
            }
            AnonymousClass1SB r3 = this.A0A;
            AnonymousClass7RQ.A02(r3.A0C, r3, this.A0J, 24);
        }
    }

    public void Bzr(List list) {
        if (!A29()) {
            ArrayList A13 = AnonymousClass000.A13();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AnonymousClass725 A0y = C108945cZ.A0y(it);
                if (!A0y.A0S) {
                    A13.add(A0y);
                }
            }
            list = A13;
        }
        this.A0J = list;
        C112295lF r0 = this.A0B;
        if (r0 == null) {
            AnonymousClass6IG r3 = new AnonymousClass6IG(this, list);
            this.A0B = r3;
            RecyclerView recyclerView = this.A04;
            if (recyclerView != null) {
                recyclerView.suppressLayout(false);
                RecyclerView.A0C(r3, recyclerView, true, true);
                recyclerView.A0x(true);
                recyclerView.requestLayout();
            }
            A27();
            return;
        }
        r0.A00 = list;
        r0.notifyDataSetChanged();
    }
}
