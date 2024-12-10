package X;

import android.widget.ImageView;
import com.whatsapp.businessdirectory.view.activity.BusinessDirectorySERPMapViewActivity;

public final class AI7 implements E7P {
    public final /* synthetic */ BusinessDirectorySERPMapViewActivity A00;
    public final /* synthetic */ C193039pR A01;

    public void Bnj() {
    }

    public AI7(BusinessDirectorySERPMapViewActivity businessDirectorySERPMapViewActivity, C193039pR r2) {
        this.A01 = r2;
        this.A00 = businessDirectorySERPMapViewActivity;
    }

    public void Buc() {
        BusinessDirectorySERPMapViewActivity businessDirectorySERPMapViewActivity = this.A00;
        ImageView imageView = businessDirectorySERPMapViewActivity.A00;
        if (imageView == null) {
            C18070vi.A11("myLocationBtn");
            throw null;
        } else {
            imageView.post(new C21446AkD(businessDirectorySERPMapViewActivity, 19));
        }
    }
}
