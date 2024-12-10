package X;

import android.os.Handler;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;

/* renamed from: X.4SD  reason: invalid class name */
public class AnonymousClass4SD {
    public ListAdapter A00;
    public ListView A01;
    public C108325bW A02;
    public boolean A03 = false;
    public final Handler A04 = C17890vO.A0D();
    public final Runnable A05 = new C70613Bu(this, 5);

    public synchronized void A01(ListAdapter listAdapter) {
        if (this.A01 == null) {
            this.A02.setContentView(17367060);
        }
        this.A00 = listAdapter;
        ListView listView = this.A01;
        C17960vV.A05(listView);
        listView.setAdapter(listAdapter);
    }

    public void A00() {
        this.A02.C80();
        View findViewById = this.A02.findViewById(16908292);
        C108325bW r1 = this.A02;
        C17960vV.A07(r1);
        ListView listView = (ListView) r1.findViewById(16908298);
        this.A01 = listView;
        if (listView != null) {
            if (findViewById != null) {
                listView.setEmptyView(findViewById);
            }
            if (this.A03) {
                A01(this.A00);
            }
            this.A04.post(this.A05);
            this.A03 = true;
            return;
        }
        throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
    }
}
