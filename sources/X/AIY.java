package X;

import com.facebook.cameracore.ardelivery.model.ARAssetType;
import com.facebook.cameracore.ardelivery.model.ARModelMetadataRequest;
import com.facebook.common.stringformat.StringFormatUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

public class AIY implements C22409B6n {
    public final /* synthetic */ C190889lg A00;
    public final /* synthetic */ C199099zQ A01;
    public final /* synthetic */ C20033A4c A02;
    public final /* synthetic */ C22408B6m A03;
    public final /* synthetic */ A4D A04;
    public final /* synthetic */ AtomicReference A05;
    public final /* synthetic */ AtomicReference A06;

    public AIY(C190889lg r1, C199099zQ r2, C20033A4c a4c, C22408B6m b6m, A4D a4d, AtomicReference atomicReference, AtomicReference atomicReference2) {
        this.A02 = a4c;
        this.A05 = atomicReference;
        this.A04 = a4d;
        this.A03 = b6m;
        this.A01 = r2;
        this.A06 = atomicReference2;
        this.A00 = r1;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.9zw] */
    /* JADX WARNING: type inference failed for: r1v7, types: [java.lang.Object, X.9zw] */
    /* JADX WARNING: type inference failed for: r1v11, types: [java.lang.Object, X.9zw] */
    /* JADX WARNING: type inference failed for: r3v2, types: [java.lang.Object, X.9zw] */
    /* JADX WARNING: type inference failed for: r1v13, types: [java.lang.Object, X.9zw] */
    /* JADX WARNING: type inference failed for: r1v15, types: [java.lang.Object, X.9zw] */
    public void BpO(Exception exc, List list, Map map) {
        AnonymousClass9LV r0;
        AtomicReference atomicReference = this.A05;
        if (atomicReference.get() != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A23 a23 = this.A02.A02;
                A4D a4d = this.A04;
                ? obj = new Object();
                obj.A00 = C179629Is.METADATA_FETCH_FAILED;
                obj.A01 = "cancel due to other metadata requests failed";
                a23.A01((ARModelMetadataRequest) it.next(), obj.A01(), a4d, false);
            }
        }
        Exception exc2 = exc;
        if (exc == null || !AnonymousClass00N.A00((Object) null, exc2, atomicReference)) {
            CountDownLatch countDownLatch = new CountDownLatch(list.size());
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ARModelMetadataRequest aRModelMetadataRequest = (ARModelMetadataRequest) it2.next();
                List<C20282AEq> A0t = AnonymousClass8BS.A0t(aRModelMetadataRequest.mCapability, map);
                if (A0t == null || A0t.isEmpty()) {
                    String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("metadata is missing from result. capability: %s version %d", aRModelMetadataRequest.mCapability, Integer.valueOf(aRModelMetadataRequest.mPreferredVersion));
                    ? obj2 = new Object();
                    obj2.A00 = C179629Is.MODEL_METADATA_DOWNLOAD_FAILURE;
                    obj2.A01 = formatStrLocaleSafe;
                    AnonymousClass9LV A012 = obj2.A01();
                    this.A02.A02.A01(aRModelMetadataRequest, A012, this.A04, false);
                    this.A03.BpH((C199099zQ) null, A012);
                    return;
                }
                C20033A4c a4c = this.A02;
                int size = list.size();
                A4D a4d2 = this.A04;
                C199099zQ r25 = this.A01;
                AtomicReference atomicReference2 = this.A06;
                C190889lg r11 = this.A00;
                C190399ks r2 = new C190399ks(aRModelMetadataRequest, this, countDownLatch);
                if (!a4c.A03.containsKey(aRModelMetadataRequest.mCapability)) {
                    ? obj3 = new Object();
                    obj3.A00 = C179629Is.METADATA_FETCH_FAILED;
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("Requested fetching unsupported capability: ");
                    obj3.A01 = C17890vO.A0V(aRModelMetadataRequest.mCapability, A10);
                    r0 = obj3.A01();
                } else {
                    ArrayList A13 = AnonymousClass000.A13();
                    A6K a6k = ((C20282AEq) A0t.get(0)).A01;
                    C26159CtX.A04(AnonymousClass000.A1Z(a6k.A02, ARAssetType.SUPPORT), "Cannot get Version from Effect Asset");
                    int i = a6k.A01;
                    for (C20282AEq aEq : A0t) {
                        try {
                            if (!C20033A4c.A01(aEq, aRModelMetadataRequest.mCapability, a4c)) {
                                A13.add(aEq);
                            }
                        } catch (AnonymousClass9LN e) {
                            ? obj4 = new Object();
                            obj4.A00 = C179629Is.MODEL_FETCH_FAILURE;
                            obj4.A03 = e;
                            r2.A00(obj4.A01());
                        }
                    }
                    if (A13.size() == 0) {
                        C20033A4c.A00(r25, aRModelMetadataRequest.mCapability, a4c, i);
                        if (r11 != null) {
                            C199610h.A04(atomicReference2);
                            atomicReference2.set(Double.valueOf(AnonymousClass8BW.A00(atomicReference2) + (1.0d / ((double) size))));
                            r11.A00(AnonymousClass8BW.A00(atomicReference2));
                        }
                        a4c.A02.A02(aRModelMetadataRequest, a4d2, i, true);
                        r0 = null;
                    } else {
                        a4c.A02.A02(aRModelMetadataRequest, a4d2, i, false);
                        C162418Kq r19 = new C162418Kq(r11, a4c, atomicReference2, new AtomicReference(AnonymousClass8BV.A0Q()), size);
                        a4c.A00.A09(r19, new AIQ(aRModelMetadataRequest, r25, r2, a4c, A0t, 0), new AnonymousClass9OY(), a4d2, A13);
                    }
                }
                r2.A00(r0);
            }
            try {
                countDownLatch.await();
                if (atomicReference.get() != null) {
                    this.A03.BpH((C199099zQ) null, (Exception) atomicReference.get());
                } else {
                    this.A03.BpH(this.A01, (Exception) null);
                }
            } catch (InterruptedException e2) {
                ? obj5 = new Object();
                obj5.A00 = C179629Is.MODEL_FETCH_FAILURE;
                obj5.A03 = e2;
                this.A03.BpH((C199099zQ) null, obj5.A01());
            }
        } else {
            ? obj6 = new Object();
            obj6.A00 = C179629Is.MODEL_METADATA_DOWNLOAD_FAILURE;
            obj6.A03 = exc2;
            AnonymousClass9LV A013 = obj6.A01();
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                this.A02.A02.A01((ARModelMetadataRequest) it3.next(), A013, this.A04, false);
            }
            this.A03.BpH((C199099zQ) null, A013);
        }
    }
}
