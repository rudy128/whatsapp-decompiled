package X;

import com.facebook.cameracore.ardelivery.storage.interfaces.StorageCallback;
import java.util.List;

/* renamed from: X.AIf  reason: case insensitive filesystem */
public class C20374AIf implements StorageCallback {
    public final /* synthetic */ C20123A8i A00;
    public final /* synthetic */ C20282AEq A01;
    public final /* synthetic */ List A02;

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, X.9zw] */
    public void onDecryptionFinish(boolean z, String str) {
        AnonymousClass9LV r2;
        boolean z2 = z;
        if (!z) {
            ? obj = new Object();
            obj.A00 = C179629Is.ASSET_DECRYPTION_FAILURE;
            if (str == null) {
                str = "missing failure reason";
            }
            obj.A01 = str;
            r2 = obj.A01();
        } else {
            r2 = null;
        }
        C20123A8i.A07(this.A00, this.A01, r2, AnonymousClass00R.A19, this.A02, -1, z2);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, X.9zw] */
    public void onEncodingFinish(boolean z, String str) {
        AnonymousClass9LV r2;
        boolean z2 = z;
        if (!z) {
            ? obj = new Object();
            obj.A00 = C179629Is.ASSET_ENCODING_FAILURE;
            if (str == null) {
                str = "missing failure reason";
            }
            obj.A01 = str;
            r2 = obj.A01();
        } else {
            r2 = null;
        }
        C20123A8i.A07(this.A00, this.A01, r2, AnonymousClass00R.A05, this.A02, -1, z2);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, X.9zw] */
    public void onExtractionFinish(boolean z, String str) {
        AnonymousClass9LV r2;
        boolean z2 = z;
        if (!z) {
            ? obj = new Object();
            obj.A00 = C179629Is.EXTRACTION_FAILED;
            if (str == null) {
                str = "missing failure reason";
            }
            obj.A01 = str;
            r2 = obj.A01();
        } else {
            r2 = null;
        }
        C20123A8i.A07(this.A00, this.A01, r2, AnonymousClass00R.A03, this.A02, -1, z2);
    }

    public C20374AIf(C20123A8i a8i, C20282AEq aEq, List list) {
        this.A00 = a8i;
        this.A02 = list;
        this.A01 = aEq;
    }

    public void onCachePutFinish(boolean z) {
        C20123A8i.A08(this.A00, this.A01, AnonymousClass00R.A09, this.A02, z);
    }

    public void onCachePutStart() {
        C20123A8i.A08(this.A00, this.A01, AnonymousClass00R.A08, this.A02, true);
    }

    public void onDecryptionOperationFinish() {
        C20123A8i.A08(this.A00, this.A01, AnonymousClass00R.A18, this.A02, true);
    }

    public void onDecryptionOperationStart() {
        C20123A8i.A08(this.A00, this.A01, AnonymousClass00R.A15, this.A02, true);
    }

    public void onDecryptionStart() {
        C20123A8i.A08(this.A00, this.A01, AnonymousClass00R.A0u, this.A02, true);
    }

    public void onEncodingOperationFinish() {
        C20123A8i.A08(this.A00, this.A01, AnonymousClass00R.A07, this.A02, true);
    }

    public void onEncodingOperationStart() {
        C20123A8i.A08(this.A00, this.A01, AnonymousClass00R.A06, this.A02, true);
    }

    public void onEncodingStart() {
        C20123A8i.A08(this.A00, this.A01, AnonymousClass00R.A04, this.A02, true);
    }

    public void onExtractionStart() {
        C20123A8i.A08(this.A00, this.A01, AnonymousClass00R.A02, this.A02, true);
    }
}
