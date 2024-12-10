package X;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.whatsapp.WaMediaThumbnailView;
import java.util.List;
import java.util.Set;

/* renamed from: X.5l8  reason: invalid class name and case insensitive filesystem */
public class C112225l8 extends C38391rD {
    public final C136166tN A00;
    public final List A01 = AnonymousClass000.A13();
    public final AnonymousClass1OS A02;
    public final LayoutInflater A03;

    public C112225l8(LayoutInflater layoutInflater, C136166tN r3, AnonymousClass1OS r4) {
        C18070vi.A0d(r3, 2);
        this.A03 = layoutInflater;
        this.A00 = r3;
        this.A02 = r4;
    }

    /* renamed from: A0U */
    public C113555nH BqY(ViewGroup viewGroup, int i) {
        int i2;
        C18070vi.A0d(viewGroup, 0);
        LayoutInflater layoutInflater = this.A03;
        if (this instanceof AnonymousClass65L) {
            i2 = 2131626875;
        } else {
            i2 = 2131626872;
        }
        return new C113555nH(AnonymousClass3MX.A0B(layoutInflater, viewGroup, i2, false), this.A00, this.A02);
    }

    public int A0Q() {
        return this.A01.size();
    }

    public /* bridge */ /* synthetic */ void A0R(C42011xT r3) {
        C113555nH r32 = (C113555nH) r3;
        C18070vi.A0d(r32, 0);
        WaMediaThumbnailView waMediaThumbnailView = r32.A03;
        waMediaThumbnailView.setImageDrawable((Drawable) null);
        waMediaThumbnailView.A01 = null;
        waMediaThumbnailView.setThumbnail((Bitmap) null);
        waMediaThumbnailView.setTag((Object) null);
    }

    public void A0V(Set set) {
        C24490C6i r0;
        List list = this.A01;
        List A0t = C29431cG.A0t(set);
        List list2 = list;
        if (this instanceof AnonymousClass65L) {
            C18070vi.A0d(list, 0);
            if (list.size() > 3) {
                list2 = C29431cG.A0k(C29431cG.A10(list, 1), C29431cG.A0v(list, 2));
            }
            if (A0t.size() > 3) {
                A0t = C29431cG.A0k(C29431cG.A10(A0t, 1), C29431cG.A0v(A0t, 2));
            }
            r0 = new C111455jk(list2, A0t);
        } else {
            C18070vi.A0d(list, 0);
            r0 = new C111375jc(list, A0t);
        }
        C25367CeS.A00(r0).A02(this);
        list.clear();
        list.addAll(set);
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r4, int i) {
        int i2;
        C113555nH r42 = (C113555nH) r4;
        if (this instanceof AnonymousClass65L) {
            C18070vi.A0d(r42, 0);
            if (i >= 2) {
                i2 = (AnonymousClass3MX.A01(this.A01) + i) - 2;
            } else {
                i2 = i;
            }
            r42.A0B((AnonymousClass8B2) this.A01.get(i2));
            WaMediaThumbnailView waMediaThumbnailView = r42.A03;
            waMediaThumbnailView.setColorFilter(AnonymousClass3MY.A02(waMediaThumbnailView, 2131101220));
            AnonymousClass65L.A00(r42, i);
            return;
        }
        C18070vi.A0d(r42, 0);
        r42.A0B((AnonymousClass8B2) this.A01.get(i));
    }
}
