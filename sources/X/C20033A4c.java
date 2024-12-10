package X;

import com.facebook.cameracore.ardelivery.model.ARModelMetadataRequest;
import com.facebook.cameracore.ardelivery.model.ModelPathsHolder;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import com.facebook.cameracore.ardelivery.modelmanager.metadataloader.ARModelMetadataDownloader;
import com.facebook.cameracore.common.exception.EffectsFrameworkException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.A4c  reason: case insensitive filesystem */
public class C20033A4c {
    public final C20123A8i A00;
    public final C199099zQ A01 = new C199099zQ();
    public final A23 A02;
    public final Map A03;
    public final ARModelMetadataDownloader A04;
    public final AnonymousClass9P7 A05;

    public static synchronized void A00(C199099zQ r4, VersionedCapability versionedCapability, C20033A4c a4c, int i) {
        synchronized (a4c) {
            try {
                C22532BBp bBp = (C22532BBp) a4c.A03.get(versionedCapability);
                if (bBp == null) {
                    Object[] A1a = AnonymousClass3MW.A1a();
                    A1a[0] = versionedCapability.toServerValue();
                    C26294Cx6.A0H("DefaultARModelFetcher", "Trying to load model from unsupported capability: %s", A1a);
                } else if (bBp.Bhq(r4, versionedCapability, i)) {
                    C199099zQ r0 = a4c.A01;
                    ModelPathsHolder A002 = C199099zQ.A00(r4, versionedCapability);
                    if (A002 != null) {
                        r0.A00.put(versionedCapability, A002);
                    }
                }
            } catch (EffectsFrameworkException e) {
                throw new AnonymousClass9LN((Exception) e);
            }
        }
    }

    public static synchronized boolean A01(C20282AEq aEq, VersionedCapability versionedCapability, C20033A4c a4c) {
        boolean z;
        synchronized (a4c) {
            try {
                C22532BBp bBp = (C22532BBp) a4c.A03.get(versionedCapability);
                if (bBp == null) {
                    Object[] A1a = AnonymousClass3MW.A1a();
                    z = false;
                    A1a[0] = versionedCapability.toServerValue();
                    C26294Cx6.A0H("DefaultARModelFetcher", "Trying to load model from unsupported capability: %s", A1a);
                } else {
                    z = bBp.BB0(aEq.A01, versionedCapability);
                }
            } catch (EffectsFrameworkException e) {
                throw new AnonymousClass9LN((Exception) e);
            }
        }
        return z;
    }

    public void A02(C190889lg r19, C22408B6m b6m, A4D a4d, List list) {
        AnonymousClass9LN th;
        int i;
        new AIN(this, 0);
        C22408B6m b6m2 = b6m;
        try {
            ArrayList A13 = AnonymousClass000.A13();
            ArrayList A132 = AnonymousClass000.A13();
            Iterator it = list.iterator();
            while (true) {
                A4D a4d2 = a4d;
                if (it.hasNext()) {
                    ARModelMetadataRequest aRModelMetadataRequest = (ARModelMetadataRequest) it.next();
                    Map map = this.A03;
                    if (!map.containsKey(aRModelMetadataRequest.mCapability)) {
                        StringBuilder A10 = AnonymousClass000.A10();
                        A10.append("Capability not found, Requested fetching unsupported capability: ");
                        th = new AnonymousClass9LN(C17890vO.A0V(aRModelMetadataRequest.mCapability, A10));
                        break;
                    }
                    int i2 = aRModelMetadataRequest.mMinVersion;
                    int i3 = aRModelMetadataRequest.mPreferredVersion;
                    A23 a23 = this.A02;
                    if (!A23.A00(a4d2, a23)) {
                        C167128fS r4 = a23.A02;
                        String str = a4d2.A01;
                        C18070vi.A0X(str);
                        int A0P = AnonymousClass000.A0P(aRModelMetadataRequest.mCapability.name(), C17890vO.A1a(str), 1);
                        r4.A00.Bj1(22413317, A0P, false);
                        r4.A05(a4d2, A0P);
                        r4.A03(A0P, "model_type", aRModelMetadataRequest.mCapability.name());
                        r4.A03(A0P, "min_version", String.valueOf(aRModelMetadataRequest.mMinVersion));
                        r4.A03(A0P, "model_cache_check_call_site", "DefaultARModelFetcher.addCachedModelsAndReturnMissing");
                        r4.A03(A0P, "is_min_version_translated_to_nmlml", String.valueOf(aRModelMetadataRequest.mIsMinVersionTranslatedToNmlml));
                        r4.A02(A0P, "model_cache_check_start");
                    }
                    if (!aRModelMetadataRequest.mForceDownload) {
                        VersionedCapability versionedCapability = aRModelMetadataRequest.mCapability;
                        synchronized (this) {
                            try {
                                C22532BBp bBp = (C22532BBp) map.get(versionedCapability);
                                if (bBp == null) {
                                    Object[] A1a = AnonymousClass3MW.A1a();
                                    A1a[0] = versionedCapability.toServerValue();
                                    C26294Cx6.A0H("DefaultARModelFetcher", "Trying to load model from unsupported capability: %s", A1a);
                                } else {
                                    C199099zQ r1 = new C199099zQ();
                                    if (bBp.Bho(r1, versionedCapability)) {
                                        C199099zQ r0 = this.A01;
                                        Map map2 = r1.A00;
                                        ModelPathsHolder modelPathsHolder = (ModelPathsHolder) map2.get(versionedCapability);
                                        if (modelPathsHolder != null) {
                                            r0.A00.put(versionedCapability, modelPathsHolder);
                                        }
                                        if (map2.get(aRModelMetadataRequest.mCapability) != null && (i = ((ModelPathsHolder) map2.get(aRModelMetadataRequest.mCapability)).mVersion) >= i2 && i <= i3) {
                                            A132.add(aRModelMetadataRequest.mCapability);
                                            a23.A02(aRModelMetadataRequest, a4d2, i3, true);
                                        }
                                    }
                                }
                            } catch (EffectsFrameworkException e) {
                                throw new AnonymousClass9LN((Exception) e);
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                    }
                    A13.add(aRModelMetadataRequest);
                } else {
                    C199099zQ r8 = this.A01;
                    C199099zQ r5 = new C199099zQ();
                    Iterator it2 = A132.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        Object obj = r8.A00.get(next);
                        if (obj != null) {
                            r5.A00.put(next, obj);
                        }
                    }
                    C19760yx A0B = AnonymousClass8BR.A0B(A13, r5);
                    List list2 = (List) A0B.A00;
                    C199099zQ r42 = (C199099zQ) A0B.A01;
                    C190889lg r9 = r19;
                    if (list2.size() == 0) {
                        if (r19 != null) {
                            r9.A00(-1.0d);
                        }
                        b6m2.BpH(r42, (Exception) null);
                        return;
                    }
                    AtomicReference atomicReference = new AtomicReference();
                    AtomicReference atomicReference2 = new AtomicReference(Double.valueOf((((double) (list.size() - list2.size())) * 1.0d) / ((double) list.size())));
                    if (r19 != null) {
                        r9.A00(AnonymousClass8BW.A00(atomicReference2));
                    }
                    this.A04.downloadModelMetadata(list2, a4d2, new AIY(r9, r42, this, b6m2, a4d2, atomicReference, atomicReference2));
                    return;
                }
            }
            throw th;
        } catch (AnonymousClass9LN e2) {
            b6m2.BpH((C199099zQ) null, e2);
        }
    }

    public C20033A4c(C20123A8i a8i, AIW aiw, AIX aix, ARModelMetadataDownloader aRModelMetadataDownloader, A23 a23, AnonymousClass9P7 r10) {
        this.A00 = a8i;
        this.A04 = aRModelMetadataDownloader;
        this.A02 = a23;
        this.A05 = r10;
        this.A03 = C17880vN.A11();
        Iterator it = AnonymousClass1IX.of(VersionedCapability.Facetracker, VersionedCapability.Segmentation, VersionedCapability.HairSegmentation, VersionedCapability.MSuggestionsCore).iterator();
        while (it.hasNext()) {
            this.A03.put(it.next(), aix);
        }
        AnonymousClass1IZ it2 = aiw.A00.A00.iterator();
        while (it2.hasNext()) {
            this.A03.put(it2.next(), aiw);
        }
    }
}
