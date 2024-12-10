package X;

import android.graphics.Bitmap;
import com.whatsapp.plugins.MetaAiLinkView;

/* renamed from: X.DOi  reason: case insensitive filesystem */
public final class C26986DOi implements BCQ {
    public final /* synthetic */ MetaAiLinkView A00;

    public /* bridge */ /* synthetic */ void Bx6(Bitmap bitmap, BCx bCx, boolean z) {
        C18070vi.A0d(bitmap, 1);
        MetaAiLinkView metaAiLinkView = this.A00;
        metaAiLinkView.A04();
        metaAiLinkView.getImageThumbView().setVisibility(0);
        metaAiLinkView.getImageThumbView().setImageBitmap(bitmap);
    }

    public C26986DOi(MetaAiLinkView metaAiLinkView) {
        this.A00 = metaAiLinkView;
    }

    public /* bridge */ /* synthetic */ void Bwu(BCx bCx) {
        MetaAiLinkView metaAiLinkView = this.A00;
        metaAiLinkView.A04();
        metaAiLinkView.A02();
    }

    public /* bridge */ /* synthetic */ void Blh(BCx bCx) {
    }

    public /* bridge */ /* synthetic */ void Bx1(BCx bCx) {
    }
}
