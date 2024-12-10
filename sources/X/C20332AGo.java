package X;

import com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsPinHandlerActivity;

/* renamed from: X.AGo  reason: case insensitive filesystem */
public class C20332AGo implements C22851Dl {
    public int A00;
    public final int A01 = 1;
    public final Object A02;

    public C20332AGo(IndiaUpiFcsPinHandlerActivity indiaUpiFcsPinHandlerActivity, int i) {
        this.A02 = indiaUpiFcsPinHandlerActivity;
        this.A00 = i;
    }

    public final void Bo9(Object obj) {
        if (this.A01 != 0) {
            int i = this.A00;
            if (i > 0) {
                this.A00 = i - 1;
            } else {
                ((AnonymousClass1DS) this.A02).A0F(obj);
            }
        } else {
            IndiaUpiFcsPinHandlerActivity indiaUpiFcsPinHandlerActivity = (IndiaUpiFcsPinHandlerActivity) this.A02;
            AnonymousClass4Yv.A00(indiaUpiFcsPinHandlerActivity, this.A00);
            IndiaUpiFcsPinHandlerActivity.A0V(indiaUpiFcsPinHandlerActivity);
        }
    }

    public C20332AGo(C22801Dg r2) {
        this.A02 = r2;
        this.A00 = 1;
    }
}
