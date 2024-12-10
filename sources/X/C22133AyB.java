package X;

import com.whatsapp.biz.linkedaccounts.LinkedIGPostsSummaryViewActivity;
import com.whatsapp.ui.media.MediaCardGrid;
import java.util.ArrayList;

/* renamed from: X.AyB  reason: case insensitive filesystem */
public final class C22133AyB extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ LinkedIGPostsSummaryViewActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22133AyB(LinkedIGPostsSummaryViewActivity linkedIGPostsSummaryViewActivity) {
        super(1);
        this.this$0 = linkedIGPostsSummaryViewActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        LinkedIGPostsSummaryViewActivity linkedIGPostsSummaryViewActivity = this.this$0;
        C18070vi.A0b(arrayList);
        MediaCardGrid mediaCardGrid = linkedIGPostsSummaryViewActivity.A06;
        if (mediaCardGrid == null) {
            C18070vi.A11("mediaCard");
            throw null;
        }
        mediaCardGrid.A08(arrayList, Integer.MAX_VALUE);
        return C27621Wu.A00;
    }
}
