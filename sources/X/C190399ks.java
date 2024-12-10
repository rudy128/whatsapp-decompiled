package X;

import com.facebook.cameracore.ardelivery.model.ARModelMetadataRequest;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.9ks  reason: invalid class name and case insensitive filesystem */
public class C190399ks {
    public final /* synthetic */ ARModelMetadataRequest A00;
    public final /* synthetic */ AIY A01;
    public final /* synthetic */ CountDownLatch A02;

    public C190399ks(ARModelMetadataRequest aRModelMetadataRequest, AIY aiy, CountDownLatch countDownLatch) {
        this.A01 = aiy;
        this.A00 = aRModelMetadataRequest;
        this.A02 = countDownLatch;
    }

    public void A00(AnonymousClass9LV r6) {
        AIY aiy = this.A01;
        if (r6 != null) {
            aiy.A05.set(r6);
            aiy.A02.A02.A01(this.A00, r6, aiy.A04, false);
        } else {
            aiy.A02.A02.A01(this.A00, (AnonymousClass9LV) null, aiy.A04, true);
        }
        this.A02.countDown();
    }
}
