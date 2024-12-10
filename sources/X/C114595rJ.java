package X;

import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.mediaview.MediaViewBaseFragment;
import com.whatsapp.mediaview.PhotoView;

/* renamed from: X.5rJ  reason: invalid class name and case insensitive filesystem */
public class C114595rJ extends AnonymousClass290 {
    public final AnonymousClass8AR A00;
    public final /* synthetic */ MediaViewBaseFragment A01;

    public C114595rJ(AnonymousClass8AR r1, MediaViewBaseFragment mediaViewBaseFragment) {
        this.A01 = mediaViewBaseFragment;
        this.A00 = r1;
    }

    public void A0D(ViewGroup viewGroup) {
        this.A00.Bue();
    }

    public int A0E() {
        return this.A00.getCount();
    }

    public /* bridge */ /* synthetic */ int A0I(Object obj) {
        Object obj2;
        C19760yx r3 = (C19760yx) obj;
        if (r3.A00 == null || (obj2 = r3.A01) == null) {
            return -2;
        }
        return this.A00.BXK(obj2);
    }

    public /* bridge */ /* synthetic */ Object A0J(ViewGroup viewGroup, int i) {
        C19760yx BHw = this.A00.BHw(i);
        Object obj = BHw.A00;
        if (obj != null) {
            View view = (View) obj;
            Object obj2 = BHw.A01;
            MediaViewBaseFragment.A01(view, this.A01);
            view.setTag(obj2);
            viewGroup.addView(view, 0);
        }
        return BHw;
    }

    public /* bridge */ /* synthetic */ void A0K(ViewGroup viewGroup, Object obj, int i) {
        Object obj2 = ((C19760yx) obj).A00;
        if (obj2 != null) {
            View view = (View) obj2;
            viewGroup.removeView(view);
            PhotoView.A02(view);
        }
        this.A00.BIX(i);
    }

    public /* bridge */ /* synthetic */ boolean A0L(View view, Object obj) {
        return AnonymousClass000.A1Z(view, ((C19760yx) obj).A00);
    }

    public CharSequence A0C(int i) {
        return "";
    }
}
