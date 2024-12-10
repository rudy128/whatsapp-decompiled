package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.whatsapp.WaImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3Wv  reason: invalid class name and case insensitive filesystem */
public final class C73663Wv extends C38391rD {
    public List A00;
    public final C22821Di A01;

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        C18070vi.A0d(viewGroup, 0);
        FrameLayout A0B = AnonymousClass3Ma.A0B(viewGroup);
        int A012 = AnonymousClass3MW.A01(AnonymousClass000.A0Y(viewGroup), 2131165868);
        A0B.setLayoutParams(new C38491rN(A012, A012));
        WaImageView waImageView = new WaImageView(AnonymousClass3MY.A04(viewGroup), (AttributeSet) null);
        A0B.addView(waImageView);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(A012, A012);
        layoutParams.gravity = 17;
        waImageView.setLayoutParams(layoutParams);
        return new C74053Yi(A0B);
    }

    public int A0Q() {
        return this.A00.size();
    }

    public final void A0U(List list) {
        if (this.A00.size() != list.size()) {
            this.A00 = list;
            notifyDataSetChanged();
            return;
        }
        ArrayList A13 = AnonymousClass000.A13();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!AnonymousClass3Ma.A1a(this.A00.get(i), list, i)) {
                C17890vO.A1D(A13, i);
            }
        }
        this.A00 = list;
        Iterator it = A13.iterator();
        while (it.hasNext()) {
            A0G(C72453Mb.A0H(it));
        }
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r6, int i) {
        Context context;
        C74053Yi r62 = (C74053Yi) r6;
        C18070vi.A0d(r62, 0);
        int i2 = ((AnonymousClass4UC) this.A00.get(i)).A00;
        FrameLayout frameLayout = r62.A00;
        if (i2 != 0) {
            context = new C003101k(frameLayout.getContext(), i2);
        } else {
            context = frameLayout.getContext();
        }
        View childAt = frameLayout.getChildAt(0);
        C18070vi.A0z(childAt, "null cannot be cast to non-null type com.whatsapp.settings.chat.theme.view.WaCheckableImageView");
        C75333h0 r1 = (C75333h0) childAt;
        AnonymousClass3MX.A1B(context, r1, 2131232940);
        r1.setChecked(((AnonymousClass4UC) this.A00.get(i)).A02);
        C90104dX.A00(frameLayout, this, i, 29);
    }

    public C73663Wv(List list, C22821Di r2) {
        this.A00 = list;
        this.A01 = r2;
    }
}
