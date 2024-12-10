package X;

import android.content.ClipData;
import android.net.Uri;

/* renamed from: X.DpP  reason: case insensitive filesystem */
public final class C27988DpP extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C25982Cpv this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27988DpP(C25982Cpv cpv) {
        super(1);
        this.this$0 = cpv;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ClipData.Item item = (ClipData.Item) obj;
        C18070vi.A0d(item, 0);
        Object text = item.getText();
        if (text == null && (text = item.getHtmlText()) == null) {
            Uri uri = item.getUri();
            if (uri != null) {
                return C25982Cpv.A01(C26511Sk.A04(C26511Sk.A0M(uri, this.this$0.A00.A0O())));
            }
            return null;
        }
        C25982Cpv cpv = this.this$0;
        if (cpv.A03.A02(text.toString()) != null) {
            return C24298Byv.TYPE_LINK;
        }
        return C24298Byv.TYPE_TEXT;
    }
}
