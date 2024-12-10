package X;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import com.whatsapp.biz.serviceofferings.ServiceOfferingsRecyclerView;

/* renamed from: X.4P2  reason: invalid class name */
public final class AnonymousClass4P2 {
    public AnonymousClass3WU A00;
    public ServiceOfferingsRecyclerView A01;
    public final Context A02;
    public final View A03;
    public final C18000vb A04;
    public final C18030ve A05;
    public final AnonymousClass1KB A06;
    public final C28931bI A07;

    public AnonymousClass4P2(Context context, View view, AnonymousClass1KB r8, C18000vb r9, C18030ve r10) {
        C72473Md.A1M(r8, r9, context, 2);
        this.A05 = r10;
        this.A06 = r8;
        this.A03 = view;
        this.A04 = r9;
        this.A02 = context;
        this.A07 = C28931bI.A00(view, 2131435216);
        View view2 = this.A03;
        this.A01 = (ServiceOfferingsRecyclerView) C18070vi.A05(view2, 2131435219);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(view2.getContext(), 2);
        ServiceOfferingsRecyclerView serviceOfferingsRecyclerView = this.A01;
        if (serviceOfferingsRecyclerView != null) {
            serviceOfferingsRecyclerView.setLayoutManager(gridLayoutManager);
            ServiceOfferingsRecyclerView serviceOfferingsRecyclerView2 = this.A01;
            if (serviceOfferingsRecyclerView2 != null) {
                serviceOfferingsRecyclerView2.A0r(new AnonymousClass28M(this.A04, this.A02.getResources().getDimensionPixelSize(2131168346)));
                ServiceOfferingsRecyclerView serviceOfferingsRecyclerView3 = this.A01;
                if (serviceOfferingsRecyclerView3 != null) {
                    serviceOfferingsRecyclerView3.setNestedScrollingEnabled(false);
                    AnonymousClass3WU r1 = new AnonymousClass3WU(this.A05);
                    this.A00 = r1;
                    ServiceOfferingsRecyclerView serviceOfferingsRecyclerView4 = this.A01;
                    if (serviceOfferingsRecyclerView4 != null) {
                        serviceOfferingsRecyclerView4.setAdapter(r1);
                        return;
                    }
                }
            }
        }
        C18070vi.A11("serviceOfferingsRecyclerView");
        throw null;
    }
}
