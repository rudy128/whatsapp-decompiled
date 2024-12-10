package X;

import com.facebook.cameracore.ardelivery.model.ARModelMetadataRequest;
import com.facebook.cameracore.ardelivery.model.ARRequestAsset$CompressionMethod;
import com.facebook.cameracore.ardelivery.modelmanager.metadataloader.ARModelMetadataDownloader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class AIZ implements ARModelMetadataDownloader {
    public static final C195099sn A05;
    public final C182779Vr A00;
    public final A23 A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04 = C201811d.A00(49532);

    static {
        C18460wS r3 = C18460wS.A00;
        ARRequestAsset$CompressionMethod[] aRRequestAsset$CompressionMethodArr = new ARRequestAsset$CompressionMethod[2];
        aRRequestAsset$CompressionMethodArr[0] = ARRequestAsset$CompressionMethod.TAR_BROTLI;
        C18460wS r4 = r3;
        A05 = new C195099sn(r3, r4, r3, r3, C18070vi.A0O(ARRequestAsset$CompressionMethod.NONE, aRRequestAsset$CompressionMethodArr, 1));
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.9zw] */
    public static final AnonymousClass9LV A00(Throwable th) {
        ? obj = new Object();
        obj.A00 = C179629Is.MODEL_METADATA_DOWNLOAD_FAILURE;
        obj.A03 = th;
        return obj.A01();
    }

    public AIZ(C182779Vr r2, A23 a23, AnonymousClass00H r4, AnonymousClass00H r5) {
        C18070vi.A0p(r4, r2, r5);
        this.A01 = a23;
        this.A02 = r4;
        this.A00 = r2;
        this.A03 = r5;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.9zw] */
    public void downloadModelMetadata(List list, A4D a4d, C22409B6n b6n) {
        String str;
        C18070vi.A0n(list, a4d, b6n);
        B0P b0p = new B0P(b6n, list);
        ArrayList A0D = C29351c6.A0D(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ARModelMetadataRequest aRModelMetadataRequest = (ARModelMetadataRequest) it.next();
            Object obj = C198909z7.A00.A00((C18030ve) C18070vi.A0E(this.A02)).get(aRModelMetadataRequest.mCapability);
            if (obj != null) {
                str = String.valueOf(obj);
            } else {
                str = null;
            }
            A23 a23 = this.A01;
            if (!A23.A00(a4d, a23)) {
                C167128fS r4 = a23.A02;
                String str2 = a4d.A01;
                C18070vi.A0X(str2);
                int A0P = AnonymousClass000.A0P(aRModelMetadataRequest.mCapability.name(), C17890vO.A1a(str2), 1);
                r4.A02(A0P, "model_cache_metadata_download_start");
                r4.A03(A0P, "is_model_metadata_downloader_nmlml", String.valueOf(true));
            }
            A0D.add(new C193339pv(aRModelMetadataRequest.mCapability.name(), str));
        }
        C193349pw r6 = new C193349pw(A05, A0D);
        AnonymousClass10E r0 = this.A00.A00.A00;
        C172438tQ r42 = new C172438tQ(C108965cb.A0H(r0), r6, AnonymousClass3Ma.A0c(r0), AnonymousClass10E.A8r(r0), C108945cZ.A14(r0));
        this.A04.get();
        if (!((AnonymousClass9WS) this.A03.get()).A00.A09()) {
            ? obj2 = new Object();
            obj2.A00 = C179629Is.DEVICE_OFFLINE;
            b0p.invoke(obj2.A01());
            return;
        }
        r42.CBv(new AU0(b6n, this, list, b0p));
    }
}
