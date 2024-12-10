package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.shareselection.ShareActionsViewModel;
import java.util.List;

/* renamed from: X.3Wg  reason: invalid class name and case insensitive filesystem */
public final class C73513Wg extends C38391rD {
    public final Context A00;
    public final C18000vb A01;
    public final ShareActionsViewModel A02;

    public C73513Wg(Context context, C18000vb r3, ShareActionsViewModel shareActionsViewModel) {
        C18070vi.A0d(r3, 2);
        this.A00 = context;
        this.A01 = r3;
        this.A02 = shareActionsViewModel;
    }

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        View inflate = C72463Mc.A0K(viewGroup, 0).inflate(2131626943, viewGroup, false);
        C18070vi.A0z(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        return new AnonymousClass3ZE((ViewGroup) inflate, this);
    }

    public int A0Q() {
        List list = this.A02.A00;
        if (list != null) {
            return list.size();
        }
        C18070vi.A11("shareActions");
        throw null;
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r5, int i) {
        AnonymousClass3ZE r52 = (AnonymousClass3ZE) r5;
        C18070vi.A0d(r52, 0);
        List list = this.A02.A00;
        if (list == null) {
            C18070vi.A11("shareActions");
            throw null;
        }
        C108305bT r1 = (C108305bT) list.get(i);
        C18070vi.A0d(r1, 2);
        Context context = this.A00;
        String BaV = r1.BaV(context);
        Drawable BSe = r1.BSe(context);
        C90104dX r12 = new C90104dX(this, i, 32);
        r52.A01.setText(BaV);
        r52.A00.setImageDrawable(BSe);
        r52.A0H.setOnClickListener(r12);
    }
}
