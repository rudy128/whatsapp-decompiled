package X;

import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.plugins.MetaAiLinkView;
import java.util.List;

/* renamed from: X.5ki  reason: invalid class name and case insensitive filesystem */
public final class C111965ki extends C38391rD {
    public final AnonymousClass1L9 A00;
    public final List A01 = AnonymousClass000.A13();

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        View inflate = C72463Mc.A0K(viewGroup, 0).inflate(2131627470, viewGroup, false);
        C18070vi.A0z(inflate, "null cannot be cast to non-null type com.whatsapp.plugins.MetaAiLinkView");
        return new C112975mL((MetaAiLinkView) inflate);
    }

    public int A0Q() {
        return this.A01.size();
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r5, int i) {
        C112975mL r52 = (C112975mL) r5;
        C18070vi.A0d(r52, 0);
        C135326s1 r3 = (C135326s1) this.A01.get(i);
        AnonymousClass1L9 r2 = this.A00;
        C18070vi.A0d(r3, 0);
        MetaAiLinkView metaAiLinkView = r52.A00;
        metaAiLinkView.setTitle(r3.A02);
        metaAiLinkView.setUrl(r3.A00);
        AnonymousClass3Ma.A1F(metaAiLinkView, r3, r2, r52, 17);
        metaAiLinkView.A03();
        metaAiLinkView.A07(r3.A01);
    }

    public C111965ki(AnonymousClass1L9 r2) {
        this.A00 = r2;
    }
}
