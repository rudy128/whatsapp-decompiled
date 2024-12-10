package com.whatsapp.conversationslist;

import X.AnonymousClass1Y5;
import X.C17880vN;
import X.C18070vi;
import X.C25161Nd;
import X.C29351c6;
import X.C38231qw;
import X.C38461rK;
import X.C39631tO;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class FolderConversationsFragment extends Hilt_FolderConversationsFragment {
    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        View A1q = super.A1q(bundle, layoutInflater, viewGroup);
        C38231qw r1 = this.A1m;
        if (r1 != null) {
            r1.CEk(this.A1Q);
        }
        return A1q;
    }

    public List A28() {
        ArrayList arrayList;
        boolean z = this instanceof InteropConversationsFragment;
        C25161Nd r0 = this.A1K;
        if (z) {
            ArrayList A09 = r0.A09();
            arrayList = C29351c6.A0D(A09);
            Iterator it = A09.iterator();
            while (it.hasNext()) {
                arrayList.add(new C39631tO(C17880vN.A0Q(it), 2));
            }
        } else {
            ArrayList A07 = r0.A07();
            arrayList = C17880vN.A0z(A07.size());
            Iterator it2 = A07.iterator();
            while (it2.hasNext()) {
                arrayList.add(new C39631tO(C17880vN.A0Q(it2), 2));
            }
        }
        return arrayList;
    }

    public void A2C() {
        A2B();
        A2D();
        C38461rK r1 = this.A1L;
        if (r1 != null) {
            r1.setVisibility(false);
        }
    }

    public final View A2L(int i) {
        LayoutInflater layoutInflater = A1D().getLayoutInflater();
        C38231qw r1 = this.A1m;
        ViewGroup viewGroup = null;
        if (r1 != null) {
            viewGroup = r1.BbU();
        }
        View inflate = layoutInflater.inflate(i, viewGroup, false);
        C18070vi.A0X(inflate);
        FrameLayout frameLayout = new FrameLayout(A14());
        AnonymousClass1Y5.A0A(frameLayout, false);
        frameLayout.addView(inflate);
        C38231qw r0 = this.A1m;
        if (r0 != null) {
            r0.BBD(frameLayout, false);
        }
        return inflate;
    }
}
