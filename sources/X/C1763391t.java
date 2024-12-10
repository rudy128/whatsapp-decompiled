package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.payments.ui.IndiaUpiMandateHistoryActivity;
import com.whatsapp.payments.ui.PaymentTransactionDetailsListActivity;
import com.whatsapp.payments.ui.widget.PayToolbar;
import java.util.List;

/* renamed from: X.91t  reason: invalid class name and case insensitive filesystem */
public abstract class C1763391t extends AnonymousClass8e5 {
    public RecyclerView A00;
    public PayToolbar A01;
    public final C161678Hh A02 = new C161678Hh(this);
    public final AnonymousClass1QE A03 = AnonymousClass1QE.A00("PaymentComponentListActivity", "infra", "COMMON");

    /* JADX WARNING: type inference failed for: r2v1, types: [X.1xT, X.6By] */
    /* JADX WARNING: type inference failed for: r2v4, types: [X.1xT, X.94q] */
    public C42011xT A4b(ViewGroup viewGroup, int i) {
        boolean z;
        this.A03.A04(AnonymousClass001.A1I("Create view holder for ", AnonymousClass000.A10(), i));
        switch (i) {
            case 100:
                View A0G = AnonymousClass8BX.A0G(AnonymousClass3MY.A0B(viewGroup), viewGroup, 2131626350);
                ? r2 = new C42011xT(A0G);
                r2.A00 = AnonymousClass3MW.A0J(A0G, 2131431385);
                return r2;
            case 102:
                z = false;
                break;
            case 103:
                z = true;
                break;
            case 104:
                View A0G2 = AnonymousClass8BX.A0G(AnonymousClass3MY.A0B(viewGroup), viewGroup, 2131626349);
                ? r22 = new C42011xT(A0G2);
                r22.A01 = AnonymousClass3MW.A0J(A0G2, 2131436243);
                r22.A00 = AnonymousClass3MW.A0J(A0G2, 2131435894);
                return r22;
            default:
                throw AnonymousClass8BR.A0w(AnonymousClass1QE.A01("PaymentComponentListActivity", AnonymousClass001.A1I("no valid mapping for: ", AnonymousClass000.A10(), i)));
        }
        List list = C42011xT.A0I;
        LayoutInflater A0K = C72463Mc.A0K(viewGroup, 0);
        int i2 = 2131626351;
        if (z) {
            i2 = 2131625125;
        }
        return new C42011xT(C108955ca.A0G(A0K, viewGroup, i2, false));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if ((this instanceof PaymentTransactionDetailsListActivity) || (this instanceof IndiaUpiMandateHistoryActivity)) {
            setContentView(2131626352);
        } else {
            setContentView(2131626353);
            int A002 = C19740yt.A00(this, 2131100602);
            PayToolbar payToolbar = (PayToolbar) findViewById(2131433485);
            this.A01 = payToolbar;
            C003401n A0K = AnonymousClass3MY.A0K(this, payToolbar);
            if (A0K != null) {
                AnonymousClass8BU.A17(A0K, 2131890283);
                AnonymousClass8BY.A0d(this, A0K, A002);
            }
        }
        RecyclerView recyclerView = (RecyclerView) findViewById(2131433508);
        this.A00 = recyclerView;
        AnonymousClass3Ma.A15(this, recyclerView);
        this.A00.setAdapter(this.A02);
    }
}
