package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.WaTextView;
import com.whatsapp.wds.components.list.footer.WDSSectionFooter;
import java.util.Set;

public final class AOL implements B7T {
    public final View A00;
    public final C18100vl A01;
    public final C18030ve A02;
    public final AnonymousClass1LU A03;
    public final C41461wR A04;
    public final C36401np A05;
    public final Set A06;

    public void Bmb(B7U b7u) {
        View view = this.A00;
        if (view instanceof WaTextView) {
            TextView textView = (TextView) view;
            if (AnonymousClass9PX.A00(this.A04, this.A06)) {
                C36401np r4 = this.A05;
                C18100vl r0 = this.A01;
                textView.setText(r4.A05((Context) AnonymousClass3MX.A14(r0), new C21445AkC(this, 24), ((Context) AnonymousClass3MX.A14(r0)).getString(2131887192), "third-party-settings"));
                AnonymousClass3Ma.A1I(textView, this.A02);
                return;
            }
            textView.setText(2131887191);
        } else if (view instanceof WDSSectionFooter) {
            WDSSectionFooter wDSSectionFooter = (WDSSectionFooter) view;
            if (AnonymousClass9PX.A00(this.A04, this.A06)) {
                wDSSectionFooter.setFooterTextWithLink(C18070vi.A0F((Context) AnonymousClass3MX.A14(this.A01), 2131887192), "third-party-settings", AnonymousClass4DZ.A03, new C39441t5(this.A02), new C21445AkC(this, 25));
            } else {
                wDSSectionFooter.setFooterText(2131887191);
            }
        }
    }

    public AOL(View view, C18030ve r3, AnonymousClass1LU r4, C41461wR r5, C36401np r6, Set set) {
        C18070vi.A0w(view, set, r5, r6, r4);
        C18070vi.A0d(r3, 6);
        this.A06 = set;
        this.A04 = r5;
        this.A05 = r6;
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = C21528Alb.A00(view, 13);
        this.A00 = view.findViewById(2131428219);
    }
}
