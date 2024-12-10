package X;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.WaImageView;
import java.util.List;

/* renamed from: X.3Wj  reason: invalid class name and case insensitive filesystem */
public final class C73543Wj extends C38391rD {
    public C106635Wp A00;
    public final AnonymousClass4KQ A01;
    public final AnonymousClass73D A02;
    public final C136166tN A03;
    public final List A04 = AnonymousClass000.A13();

    public C73543Wj(AnonymousClass4KQ r2, AnonymousClass73D r3, C136166tN r4) {
        C18070vi.A0d(r2, 3);
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = r2;
    }

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        return new AnonymousClass3Z5(AnonymousClass3MY.A0E(C72463Mc.A0K(viewGroup, 0), viewGroup, 2131624315), this);
    }

    public int A0Q() {
        return this.A04.size();
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r20, int i) {
        AnonymousClass7HZ r1;
        AnonymousClass3Z5 r4 = (AnonymousClass3Z5) r20;
        C18070vi.A0d(r4, 0);
        C89334cI r3 = (C89334cI) this.A04.get(i);
        C18070vi.A0d(r3, 0);
        View view = r4.A0H;
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(2131165485);
        C73543Wj r2 = r4.A02;
        AnonymousClass4KQ r12 = r2.A01;
        Context A042 = AnonymousClass3MY.A04(view);
        Uri uri = r3.A00;
        AnonymousClass72S A022 = r2.A02.A02(uri);
        AnonymousClass10E r7 = r12.A00.A00;
        C18030ve A8r = AnonymousClass10E.A8r(r7);
        AnonymousClass7HZ r8 = new AnonymousClass7HZ(A042, uri, (AnonymousClass1T1) r7.A43.get(), AnonymousClass10E.A6Q(r7), AnonymousClass3Ma.A0f(r7), A8r, A022, (C25291Nq) r7.A6E.get(), (C26631Sw) r7.AAO.get(), dimensionPixelSize);
        C136166tN r72 = r2.A03;
        WaImageView waImageView = r4.A01;
        Object tag = waImageView.getTag();
        if (tag instanceof AnonymousClass7HZ) {
            r1 = (AnonymousClass7HZ) tag;
        } else {
            r1 = null;
        }
        r72.A01(r1);
        r72.A02(r8, new C96104nJ(waImageView, r8));
        view.setOnClickListener(new AnonymousClass78Q((Object) r2, (Object) r3, 37));
        C90084dV.A00(r4.A00, r2, r4, r3, 16);
    }
}
