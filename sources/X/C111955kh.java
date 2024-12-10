package X;

import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.reels.ReelsPreviewView;
import java.util.List;

/* renamed from: X.5kh  reason: invalid class name and case insensitive filesystem */
public final class C111955kh extends C38391rD {
    public final List A00 = AnonymousClass000.A13();
    public final /* synthetic */ AnonymousClass6AS A01;

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        View inflate = C72463Mc.A0K(viewGroup, 0).inflate(2131627468, viewGroup, false);
        C18070vi.A0z(inflate, "null cannot be cast to non-null type com.whatsapp.reels.ReelsPreviewView");
        return new C113115mZ(this.A01, (ReelsPreviewView) inflate);
    }

    public C111955kh(AnonymousClass6AS r2) {
        this.A01 = r2;
    }

    public int A0Q() {
        return this.A00.size();
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r10, int i) {
        C113115mZ r102 = (C113115mZ) r10;
        C18070vi.A0d(r102, 0);
        C135826sp r7 = (C135826sp) this.A00.get(i);
        C18070vi.A0d(r7, 0);
        ReelsPreviewView reelsPreviewView = r102.A00;
        String str = r7.A02;
        AnonymousClass6AS r4 = r102.A01;
        AnonymousClass00H r2 = r4.A07;
        reelsPreviewView.A06(str, new C147967gg(r2.get(), 3), new C147967gg(r2.get(), 4));
        reelsPreviewView.A07(r7.A01, false);
        reelsPreviewView.setTitle(r7.A00);
        AnonymousClass3Ma.A1F(reelsPreviewView, r4, r102, r7, 15);
    }
}
