package X;

import android.view.View;
import com.whatsapp.TextEmojiLabel;
import java.util.List;

/* renamed from: X.5wJ  reason: invalid class name and case insensitive filesystem */
public final class C116055wJ extends C1188965r {
    public final View A00;
    public final TextEmojiLabel A01;
    public final C133196oK A02;
    public final C24671Lf A03;
    public final C37451pZ A04;
    public final List A05 = AnonymousClass000.A13();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C116055wJ(View view, C133196oK r3, C24671Lf r4, C37451pZ r5) {
        super(view);
        C18070vi.A0d(view, 1);
        this.A00 = view;
        this.A03 = r4;
        this.A04 = r5;
        this.A02 = r3;
        this.A01 = AnonymousClass3MX.A0V(view, 2131428567);
    }

    public void A0D() {
        List<Object> list = this.A05;
        for (Object unregisterObserver : list) {
            this.A03.unregisterObserver(unregisterObserver);
        }
        list.clear();
    }
}
