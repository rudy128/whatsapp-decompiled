package X;

import androidx.appcompat.widget.Toolbar;
import com.whatsapp.biz.linkedaccounts.LinkedIGPostsSummaryViewActivity;

/* renamed from: X.AyD  reason: case insensitive filesystem */
public final class C22135AyD extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ LinkedIGPostsSummaryViewActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22135AyD(LinkedIGPostsSummaryViewActivity linkedIGPostsSummaryViewActivity) {
        super(1);
        this.this$0 = linkedIGPostsSummaryViewActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str = (String) obj;
        LinkedIGPostsSummaryViewActivity linkedIGPostsSummaryViewActivity = this.this$0;
        C18070vi.A0b(str);
        Toolbar toolbar = linkedIGPostsSummaryViewActivity.A00;
        if (toolbar == null) {
            C18070vi.A11("toolbar");
            throw null;
        }
        toolbar.setSubtitle((CharSequence) str);
        toolbar.A0Q(toolbar.getContext(), 2132083960);
        return C27621Wu.A00;
    }
}
