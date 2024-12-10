package X;

import android.view.View;
import com.whatsapp.biz.BusinessHoursView;

public final /* synthetic */ class AFJ implements View.OnClickListener {
    public final /* synthetic */ BusinessHoursView A00;
    public final /* synthetic */ Integer A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;

    public final void onClick(View view) {
        BusinessHoursView businessHoursView = this.A00;
        String str = this.A02;
        Integer num = this.A01;
        boolean z = this.A03;
        boolean z2 = this.A04;
        if (!businessHoursView.A05) {
            businessHoursView.getBusinessProfileAnalyticsManager().A07((Integer) null, num, str, 4, z, z2);
        }
        businessHoursView.A05 = !businessHoursView.A05;
        BusinessHoursView.A01(businessHoursView);
    }

    public /* synthetic */ AFJ(BusinessHoursView businessHoursView, Integer num, String str, boolean z, boolean z2) {
        this.A00 = businessHoursView;
        this.A02 = str;
        this.A01 = num;
        this.A03 = z;
        this.A04 = z2;
    }
}
