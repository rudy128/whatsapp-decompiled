package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public class BMR extends C38171qo {
    public final /* synthetic */ BMP A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BMR(RecyclerView recyclerView, BMP bmp) {
        super(recyclerView);
        this.A00 = bmp;
    }

    public void A1Z(View view, C26228CvK cvK) {
        AnonymousClass1XU r0 = this.A00.A00;
        if (r0 != null) {
            r0.A1Z(view, cvK);
        }
        cvK.A0M(C26137Ct0.A0e);
        cvK.A0M(C26137Ct0.A0Y);
        cvK.A0M(C26137Ct0.A0b);
        cvK.A0M(C26137Ct0.A0c);
        cvK.A0M(C26137Ct0.A0Z);
        cvK.A0M(C26137Ct0.A0X);
        cvK.A0p(false);
    }
}
