package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.plugins.MetaAiLinkView;

/* renamed from: X.3uc  reason: invalid class name and case insensitive filesystem */
public final class C79123uc extends C79143uj {
    public C28931bI A00;
    public final int A01 = AnonymousClass000.A0Y(this).getDimensionPixelSize(2131166262);
    public final MetaAiLinkView A02;

    public C28931bI getSelectionView() {
        return this.A00;
    }

    public C79123uc(Context context, C108875cR r4) {
        super(context, r4);
        A01();
        View.inflate(context, 2131625811, this);
        this.A02 = (MetaAiLinkView) C18070vi.A05(this, 2131432730);
        this.A00 = C72453Mb.A0s(this, 2131435134);
    }

    public void A02(AnonymousClass210 r4) {
        Integer num;
        super.A02(r4);
        int i = r4.A01;
        MetaAiLinkView metaAiLinkView = this.A02;
        if (i == 4) {
            metaAiLinkView.A05(AnonymousClass4GJ.A00());
            return;
        }
        metaAiLinkView.A04();
        metaAiLinkView.setTitle(r4.A06);
        metaAiLinkView.setUrl(r4.A07);
        metaAiLinkView.A06(r4, this.A01);
        C692136i A002 = AnonymousClass2UX.A00(r4);
        if (A002 != null) {
            num = A002.A02;
        } else {
            num = null;
        }
        metaAiLinkView.setReferenceIndex(num);
    }
}
