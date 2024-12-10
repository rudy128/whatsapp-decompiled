package X;

import android.view.ViewStub;
import android.widget.TextView;
import com.whatsapp.WaTextView;
import com.whatsapp.util.Log;
import java.util.Collection;

/* renamed from: X.3tp  reason: invalid class name and case insensitive filesystem */
public final class C78873tp extends C78483ss {
    public Collection A00;
    public ViewStub A01;
    public WaTextView A02;
    public WaTextView A03;
    public boolean A04;

    public final void setBotPluginMessages(Collection collection) {
        C18070vi.A0d(collection, 0);
        this.A00 = collection;
        if (AnonymousClass3MW.A0X(this.A1k).A05()) {
            A2s(collection);
        }
    }

    public final void A2t() {
        String str;
        if (!this.A04) {
            ViewStub viewStub = (ViewStub) AnonymousClass3MX.A0C(this, 2131432736);
            this.A01 = viewStub;
            if (viewStub == null) {
                str = "bottomSourceComponent";
            } else {
                viewStub.setVisibility(0);
                this.A02 = C72453Mb.A0g(this, 2131436816);
                this.A03 = C72453Mb.A0g(this, 2131436815);
                AnonymousClass1FU A0K = AnonymousClass3Ma.A0K(this);
                if (A0K != null) {
                    WaTextView waTextView = this.A03;
                    if (waTextView == null) {
                        str = "viewSourceEntryPoint";
                    } else {
                        C90074dU.A01(waTextView, A0K, this, 7);
                    }
                } else {
                    Log.e("ConversationRowBotSearchSources/cannot open source bottomsheet");
                }
                C42491yG.A0B(this.A06, 8);
                this.A04 = true;
                return;
            }
            C18070vi.A11(str);
            throw null;
        }
    }

    public void A2i() {
        Collection collection;
        super.A2i();
        if (AnonymousClass3MW.A0X(this.A1k).A05() && (collection = this.A00) != null) {
            A2s(collection);
        }
    }

    public TextView getDateView() {
        A2t();
        WaTextView waTextView = this.A02;
        if (waTextView != null) {
            return waTextView;
        }
        C18070vi.A11("viewSourceDate");
        throw null;
    }
}
