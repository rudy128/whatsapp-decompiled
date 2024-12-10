package X;

import android.media.ImageReader;
import com.whatsapp.util.Log;

/* renamed from: X.CyK  reason: case insensitive filesystem */
public final /* synthetic */ class C26358CyK implements ImageReader.OnImageAvailableListener {
    public final /* synthetic */ C28629EBc A00;
    public final /* synthetic */ C26983DOf A01;

    public final void onImageAvailable(ImageReader imageReader) {
        C28629EBc eBc = this.A00;
        C26983DOf dOf = this.A01;
        eBc.onImageAvailable(imageReader);
        if (dOf.A06) {
            Log.i("SparkCameraProcessor/onImageAvailable Adding self-preview GL output");
            DDR.A08((EDC) dOf.A09.BP7(EDC.A01)).A03(dOf.A01, 0);
            dOf.A06 = false;
        }
    }

    public /* synthetic */ C26358CyK(C28629EBc eBc, C26983DOf dOf) {
        this.A00 = eBc;
        this.A01 = dOf;
    }
}
