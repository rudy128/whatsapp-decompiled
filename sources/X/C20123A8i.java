package X;

import com.facebook.cameracore.ardelivery.model.ARAssetType;
import com.facebook.cameracore.ardelivery.model.ARRequestAsset$CompressionMethod;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: X.A8i  reason: case insensitive filesystem */
public class C20123A8i {
    public final A65 A00;
    public final A7A A01;
    public final C20372AId A02;
    public final A23 A03;
    public final C188989iK A04;
    public final Object A05 = C17880vN.A0p();
    public final Executor A06;
    public final Executor A07;
    public final AnonymousClass9P7 A08;
    public final List A09 = AnonymousClass000.A13();
    public final Executor A0A;

    public static void A08(C20123A8i a8i, C20282AEq aEq, Integer num, List list, boolean z) {
        A07(a8i, aEq, (AnonymousClass9LV) null, num, list, -1, z);
    }

    public static AnonymousClass1IX A01(C20123A8i a8i, C190899lh r7) {
        AnonymousClass1IX copyOf;
        synchronized (a8i.A05) {
            A7A a7a = a8i.A01;
            Collection A0t = AnonymousClass8BS.A0t(r7, a7a.A05);
            if (A0t == null) {
                if (!a7a.A00) {
                    a7a.A00 = true;
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("InternalLoadRequest not present in mInternalToExternalMap: ");
                    a7a.A01.A00("InternalStateManager", AnonymousClass000.A0y(r7.A03.A01.A0A, A10), (Throwable) null, false);
                }
                A0t = AnonymousClass000.A13();
            }
            copyOf = AnonymousClass1IX.copyOf(A0t);
        }
        return copyOf;
    }

    public static String A02(C20282AEq aEq) {
        Object[] objArr;
        String str;
        A6K a6k = aEq.A01;
        ARAssetType aRAssetType = a6k.A02;
        switch (aRAssetType.ordinal()) {
            case 0:
                return "AREffect";
            case 1:
                VersionedCapability A022 = a6k.A02();
                C26159CtX.A01(A022);
                switch (A022.ordinal()) {
                    case 0:
                        return "FaceTrackerModel";
                    case 1:
                        return "HandTrackerModel";
                    case 2:
                        return "SegmentationModel";
                    case 3:
                        return "HairSegmentationModel";
                    case 4:
                        return "XRayModel";
                    case 7:
                        return "MSuggestionsCoreModel";
                    case 14:
                        return "BodyTrackingModel";
                    default:
                        objArr = new Object[]{a6k.A02()};
                        str = "Invalid capability: ";
                        break;
                }
            case 2:
                AnonymousClass9IY r1 = a6k.A05;
                if (r1 != AnonymousClass9IY.Block && r1 != AnonymousClass9IY.ShareableBlock) {
                    objArr = new Object[]{r1};
                    str = "Invalid async asset type: ";
                    break;
                } else {
                    return "Block";
                }
                break;
            case 3:
                return "RemoteAsset";
            case 4:
                return "ScriptingPackage";
            case 5:
                return "SparkVisionNativeMLModel";
            default:
                objArr = new Object[]{aRAssetType.name()};
                str = "Invalid ARAssetType: %s";
                break;
        }
        C26294Cx6.A0H("ARDeliveryLoggerUtil", str, objArr);
        return "UnknownAssetType";
    }

    /* JADX WARNING: type inference failed for: r1v7, types: [java.lang.Object, X.9zw] */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x011f, code lost:
        if (r8.A01 > 0) goto L_0x0121;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0036, code lost:
        if (r8.A01 > 0) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList A03(X.C20123A8i r17, java.util.List r18, java.util.List r19, boolean r20) {
        /*
            r6 = r17
            r1 = r18
            r0 = r19
            r10 = r20
            X.0yx r1 = A00(r6, r1, r0, r10)
            java.lang.Object r0 = r1.A00
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r9 = r1.A01
            java.util.List r9 = (java.util.List) r9
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            java.lang.Object r4 = r6.A05
            monitor-enter(r4)
            java.util.Iterator r20 = X.AnonymousClass000.A15(r0)     // Catch:{ all -> 0x01bf }
        L_0x001f:
            boolean r0 = r20.hasNext()     // Catch:{ all -> 0x01bf }
            if (r0 == 0) goto L_0x0108
            java.util.Map$Entry r2 = X.AnonymousClass000.A16(r20)     // Catch:{ all -> 0x01bf }
            java.lang.Object r8 = r2.getKey()     // Catch:{ all -> 0x01bf }
            X.9lh r8 = (X.C190899lh) r8     // Catch:{ all -> 0x01bf }
            int r0 = r8.A00     // Catch:{ all -> 0x01bf }
            if (r0 > 0) goto L_0x0038
            int r1 = r8.A01     // Catch:{ all -> 0x01bf }
            r0 = 0
            if (r1 <= 0) goto L_0x0039
        L_0x0038:
            r0 = 1
        L_0x0039:
            if (r0 == 0) goto L_0x001f
            java.lang.Object r7 = r2.getValue()     // Catch:{ all -> 0x01bf }
            X.9Ze r7 = (X.C183679Ze) r7     // Catch:{ all -> 0x01bf }
            X.1IX r2 = A01(r6, r8)     // Catch:{ all -> 0x01bf }
            if (r7 != 0) goto L_0x006c
            if (r10 == 0) goto L_0x004d
            r9.add(r8)     // Catch:{ all -> 0x01bf }
            goto L_0x001f
        L_0x004d:
            java.util.Iterator r1 = r2.iterator()     // Catch:{ all -> 0x01bf }
        L_0x0051:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x01bf }
            if (r0 == 0) goto L_0x0065
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x01bf }
            X.9p5 r0 = (X.C192849p5) r0     // Catch:{ all -> 0x01bf }
            boolean r0 = r0.A00()     // Catch:{ all -> 0x01bf }
            if (r0 != 0) goto L_0x0051
            r0 = 1
            goto L_0x0066
        L_0x0065:
            r0 = 0
        L_0x0066:
            if (r0 == 0) goto L_0x006c
            r5.add(r8)     // Catch:{ all -> 0x01bf }
            goto L_0x001f
        L_0x006c:
            java.util.Iterator r19 = r2.iterator()     // Catch:{ all -> 0x01bf }
        L_0x0070:
            boolean r0 = r19.hasNext()     // Catch:{ all -> 0x01bf }
            if (r0 == 0) goto L_0x00fd
            java.lang.Object r1 = r19.next()     // Catch:{ all -> 0x01bf }
            X.9p5 r1 = (X.C192849p5) r1     // Catch:{ all -> 0x01bf }
            X.AEq r0 = r8.A03     // Catch:{ all -> 0x01bf }
            X.9Lm r14 = r1.A05     // Catch:{ all -> 0x01bf }
            if (r14 == 0) goto L_0x0070
            X.A6K r0 = r0.A01     // Catch:{ all -> 0x01bf }
            java.lang.String r3 = r0.A0A     // Catch:{ all -> 0x01bf }
            r15 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r15 = r15 / r15
            monitor-enter(r1)     // Catch:{ all -> 0x01bf }
            java.util.Map r2 = r1.A08     // Catch:{ all -> 0x0104 }
            boolean r0 = r2.containsKey(r3)     // Catch:{ all -> 0x0104 }
            if (r0 == 0) goto L_0x00ab
            java.lang.Object r0 = r2.get(r3)     // Catch:{ all -> 0x0104 }
            java.lang.Double r0 = (java.lang.Double) r0     // Catch:{ all -> 0x0104 }
            double r11 = r0.doubleValue()     // Catch:{ all -> 0x0104 }
        L_0x009c:
            java.lang.Double r0 = java.lang.Double.valueOf(r15)     // Catch:{ all -> 0x0104 }
            r2.put(r3, r0)     // Catch:{ all -> 0x0104 }
            double r2 = r1.A00     // Catch:{ all -> 0x0104 }
            double r2 = r2 + r15
            double r2 = r2 - r11
            r1.A00 = r2     // Catch:{ all -> 0x0104 }
            monitor-exit(r1)     // Catch:{ all -> 0x0104 }
            goto L_0x00ae
        L_0x00ab:
            r11 = 0
            goto L_0x009c
        L_0x00ae:
            int r0 = r1.A04     // Catch:{ all -> 0x01bf }
            double r0 = (double) r0     // Catch:{ all -> 0x01bf }
            double r2 = r2 / r0
            boolean r0 = r14 instanceof X.C162418Kq     // Catch:{ all -> 0x01bf }
            if (r0 == 0) goto L_0x00e6
            X.8Kq r14 = (X.C162418Kq) r14     // Catch:{ all -> 0x01bf }
            X.9lg r11 = r14.A01     // Catch:{ all -> 0x01bf }
            if (r11 == 0) goto L_0x0070
            java.util.concurrent.atomic.AtomicReference r13 = r14.A04     // Catch:{ all -> 0x01bf }
            double r17 = X.AnonymousClass8BW.A00(r13)     // Catch:{ all -> 0x01bf }
            java.util.concurrent.atomic.AtomicReference r12 = r14.A03     // Catch:{ all -> 0x01bf }
            double r0 = X.AnonymousClass8BW.A00(r12)     // Catch:{ all -> 0x01bf }
            double r15 = r2 - r0
            int r0 = r14.A00     // Catch:{ all -> 0x01bf }
            double r0 = (double) r0     // Catch:{ all -> 0x01bf }
            double r15 = r15 / r0
            double r17 = r17 + r15
            java.lang.Double r0 = java.lang.Double.valueOf(r17)     // Catch:{ all -> 0x01bf }
            r13.set(r0)     // Catch:{ all -> 0x01bf }
            java.lang.Double r0 = java.lang.Double.valueOf(r2)     // Catch:{ all -> 0x01bf }
            r12.set(r0)     // Catch:{ all -> 0x01bf }
            double r0 = X.AnonymousClass8BW.A00(r13)     // Catch:{ all -> 0x01bf }
            r11.A00(r0)     // Catch:{ all -> 0x01bf }
            goto L_0x0070
        L_0x00e6:
            X.8Kp r14 = (X.C162408Kp) r14     // Catch:{ all -> 0x01bf }
            java.util.concurrent.atomic.AtomicReference r13 = r14.A01     // Catch:{ all -> 0x01bf }
            java.util.concurrent.atomic.AtomicReference r0 = r14.A03     // Catch:{ all -> 0x01bf }
            double r11 = X.AnonymousClass8BW.A00(r0)     // Catch:{ all -> 0x01bf }
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r0 = r0 - r11
            double r2 = r2 * r0
            java.lang.Double r0 = java.lang.Double.valueOf(r2)     // Catch:{ all -> 0x01bf }
            r13.set(r0)     // Catch:{ all -> 0x01bf }
            goto L_0x0070
        L_0x00fd:
            r1 = 0
            r0 = 1
            A06(r6, r8, r7, r1, r0)     // Catch:{ all -> 0x01bf }
            goto L_0x001f
        L_0x0104:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0104 }
            goto L_0x01bc
        L_0x0108:
            java.util.Iterator r15 = r9.iterator()     // Catch:{ all -> 0x01bf }
        L_0x010c:
            boolean r0 = r15.hasNext()     // Catch:{ all -> 0x01bf }
            if (r0 == 0) goto L_0x01bd
            java.lang.Object r8 = r15.next()     // Catch:{ all -> 0x01bf }
            X.9lh r8 = (X.C190899lh) r8     // Catch:{ all -> 0x01bf }
            int r2 = r8.A00     // Catch:{ all -> 0x01bf }
            if (r2 > 0) goto L_0x0121
            int r1 = r8.A01     // Catch:{ all -> 0x01bf }
            r0 = 0
            if (r1 <= 0) goto L_0x0122
        L_0x0121:
            r0 = 1
        L_0x0122:
            if (r0 == 0) goto L_0x010c
            X.AEq r11 = r8.A03     // Catch:{ all -> 0x01bf }
            X.A65 r13 = r6.A00     // Catch:{ all -> 0x01bf }
            boolean r0 = X.AnonymousClass000.A1R(r2)
            r14 = r0 ^ 1
            X.9kr r3 = new X.9kr     // Catch:{ all -> 0x01bf }
            r3.<init>(r6, r8, r11)     // Catch:{ all -> 0x01bf }
            r10 = 0
            X.9WS r0 = r13.A01     // Catch:{ all -> 0x01bf }
            X.11E r0 = r0.A00     // Catch:{ all -> 0x01bf }
            boolean r0 = r0.A09()     // Catch:{ all -> 0x01bf }
            if (r0 != 0) goto L_0x014f
            X.9zw r1 = new X.9zw     // Catch:{ all -> 0x01bf }
            r1.<init>()     // Catch:{ all -> 0x01bf }
            X.9Is r0 = X.C179629Is.DEVICE_OFFLINE     // Catch:{ all -> 0x01bf }
            r1.A00 = r0     // Catch:{ all -> 0x01bf }
            X.9LV r0 = r1.A01()     // Catch:{ all -> 0x01bf }
            r3.A00(r11, r0, r10)     // Catch:{ all -> 0x01bf }
            goto L_0x010c
        L_0x014f:
            java.lang.String r12 = r11.A08     // Catch:{ all -> 0x01bf }
            java.lang.Object r7 = r13.A03     // Catch:{ all -> 0x01bf }
            monitor-enter(r7)     // Catch:{ all -> 0x01bf }
            r9 = 0
            if (r12 != 0) goto L_0x0161
            X.9iK r2 = r13.A02     // Catch:{ all -> 0x01ac }
            java.lang.String r1 = "SerialAssetDownloadManager"
            java.lang.String r0 = "Uri is null "
            r2.A00(r1, r0, r10, r9)     // Catch:{ all -> 0x01ac }
            goto L_0x017a
        L_0x0161:
            java.util.Map r2 = r13.A06     // Catch:{ all -> 0x01ac }
            boolean r0 = r2.containsKey(r12)     // Catch:{ all -> 0x01ac }
            if (r0 == 0) goto L_0x017c
            X.9iK r3 = r13.A02     // Catch:{ all -> 0x01ac }
            java.lang.String r2 = "SerialAssetDownloadManager"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x01ac }
            java.lang.String r0 = "Already download "
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r12, r1)     // Catch:{ all -> 0x01ac }
            r3.A00(r2, r0, r10, r9)     // Catch:{ all -> 0x01ac }
        L_0x017a:
            monitor-exit(r7)     // Catch:{ all -> 0x01ac }
            goto L_0x010c
        L_0x017c:
            X.A05 r1 = new X.A05     // Catch:{ all -> 0x01ac }
            r1.<init>(r3, r11, r14)     // Catch:{ all -> 0x01ac }
            r2.put(r12, r1)     // Catch:{ all -> 0x01ac }
            java.util.Queue r0 = r13.A07     // Catch:{ all -> 0x01ac }
            r0.offer(r1)     // Catch:{ all -> 0x01ac }
            X.A65.A01(r13)     // Catch:{ all -> 0x01ac }
            java.util.ArrayList r0 = X.A65.A00(r13)     // Catch:{ all -> 0x01ac }
            monitor-exit(r7)     // Catch:{ all -> 0x01ac }
            X.A65.A02(r13, r0)     // Catch:{ all -> 0x01bf }
            X.9zP r3 = new X.9zP     // Catch:{ all -> 0x01bf }
            r3.<init>(r1, r13)     // Catch:{ all -> 0x01bf }
            X.A7A r0 = r6.A01     // Catch:{ all -> 0x01bf }
            java.util.Map r1 = r0.A02     // Catch:{ all -> 0x01bf }
            X.A6K r0 = r11.A01     // Catch:{ all -> 0x01bf }
            java.lang.String r2 = r0.A0A     // Catch:{ all -> 0x01bf }
            java.lang.Object r0 = r1.put(r2, r3)     // Catch:{ all -> 0x01bf }
            if (r0 != 0) goto L_0x01af
            r0 = 1
            r8.A02 = r0     // Catch:{ all -> 0x01bf }
            goto L_0x010c
        L_0x01ac:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x01ac }
            goto L_0x01bc
        L_0x01af:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x01bf }
            java.lang.String r0 = "InternalLoadRequest already has linked token: "
            r1.append(r0)     // Catch:{ all -> 0x01bf }
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0o(r2, r1)     // Catch:{ all -> 0x01bf }
        L_0x01bc:
            throw r0     // Catch:{ all -> 0x01bf }
        L_0x01bd:
            monitor-exit(r4)     // Catch:{ all -> 0x01bf }
            return r5
        L_0x01bf:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x01bf }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20123A8i.A03(X.A8i, java.util.List, java.util.List, boolean):java.util.ArrayList");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        if (r4.A01 > 0) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List A04(X.C20123A8i r3, X.C190899lh r4) {
        /*
            java.lang.Object r2 = r3.A05
            monitor-enter(r2)
            int r0 = r4.A00     // Catch:{ all -> 0x0018 }
            if (r0 > 0) goto L_0x000c
            int r1 = r4.A01     // Catch:{ all -> 0x0018 }
            r0 = 0
            if (r1 <= 0) goto L_0x000d
        L_0x000c:
            r0 = 1
        L_0x000d:
            if (r0 != 0) goto L_0x0012
            java.util.List r0 = java.util.Collections.EMPTY_LIST     // Catch:{ all -> 0x0018 }
            goto L_0x0016
        L_0x0012:
            X.1IX r0 = A01(r3, r4)     // Catch:{ all -> 0x0018 }
        L_0x0016:
            monitor-exit(r2)     // Catch:{ all -> 0x0018 }
            return r0
        L_0x0018:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0018 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20123A8i.A04(X.A8i, X.9lh):java.util.List");
    }

    public static void A05(C20123A8i a8i) {
        ArrayList A10;
        BA6 ba6;
        AnonymousClass9LV r3;
        Object obj;
        synchronized (a8i.A05) {
            List list = a8i.A09;
            A10 = C17880vN.A10(list);
            list.clear();
        }
        Iterator it = A10.iterator();
        while (it.hasNext()) {
            C192849p5 r5 = (C192849p5) it.next();
            ArrayList A13 = AnonymousClass000.A13();
            synchronized (r5) {
                boolean z = false;
                if (r5.A01 == r5.A04) {
                    z = true;
                }
                C26159CtX.A03(z);
                C26159CtX.A03(!r5.A03);
                r5.A03 = true;
                ba6 = r5.A06;
                r3 = r5.A02;
                if (r3 == null) {
                    Iterator A0l = C17890vO.A0l(r5.A09);
                    while (A0l.hasNext()) {
                        C19760yx r1 = (C19760yx) A0l.next();
                        if (AnonymousClass000.A1Y(r1.A00) && (obj = r1.A01) != null) {
                            A13.add((C183679Ze) obj);
                        }
                    }
                }
            }
            if (r3 != null) {
                ba6.Btj(r3);
            } else {
                ba6.onSuccess(A13);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00d9, code lost:
        r0 = th;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A06(X.C20123A8i r10, X.C190899lh r11, X.C183679Ze r12, X.AnonymousClass9LV r13, boolean r14) {
        /*
            java.lang.Object r2 = r10.A05
            monitor-enter(r2)
            X.A7A r5 = r10.A01     // Catch:{ all -> 0x00dc }
            java.util.Map r1 = r5.A02     // Catch:{ all -> 0x00dc }
            X.AEq r0 = r11.A03     // Catch:{ all -> 0x00dc }
            X.A6K r0 = r0.A01     // Catch:{ all -> 0x00dc }
            java.lang.String r4 = r0.A0A     // Catch:{ all -> 0x00dc }
            java.lang.Object r0 = r1.get(r4)     // Catch:{ all -> 0x00dc }
            if (r0 != 0) goto L_0x00cb
            X.A7A.A03(r11, r5)     // Catch:{ all -> 0x00dc }
            java.util.List r0 = X.A7A.A00(r11, r5)     // Catch:{ all -> 0x00dc }
            java.util.Iterator r9 = r0.iterator()     // Catch:{ all -> 0x00dc }
        L_0x001e:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x00dc }
            if (r0 == 0) goto L_0x00c9
            java.lang.Object r3 = r9.next()     // Catch:{ all -> 0x00dc }
            X.9p5 r3 = (X.C192849p5) r3     // Catch:{ all -> 0x00dc }
            monitor-enter(r3)     // Catch:{ all -> 0x00dc }
            if (r14 == 0) goto L_0x0031
            if (r13 == 0) goto L_0x0034
            goto L_0x00b2
        L_0x0031:
            if (r13 != 0) goto L_0x0034
            goto L_0x00ab
        L_0x0034:
            java.util.Map r7 = r3.A09     // Catch:{ all -> 0x00d9 }
            java.lang.Object r0 = r7.get(r4)     // Catch:{ all -> 0x00d9 }
            r8 = 0
            boolean r0 = X.AnonymousClass000.A1X(r0)
            X.C26159CtX.A03(r0)     // Catch:{ all -> 0x00d9 }
            int r0 = r3.A01     // Catch:{ all -> 0x00d9 }
            int r1 = r3.A04     // Catch:{ all -> 0x00d9 }
            boolean r0 = X.AnonymousClass000.A1U(r0, r1)
            X.C26159CtX.A03(r0)     // Catch:{ all -> 0x00d9 }
            boolean r0 = r3.A03     // Catch:{ all -> 0x00d9 }
            r0 = r0 ^ 1
            X.C26159CtX.A03(r0)     // Catch:{ all -> 0x00d9 }
            if (r14 == 0) goto L_0x0060
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x00d9 }
            X.0yx r0 = X.AnonymousClass8BR.A0B(r0, r12)     // Catch:{ all -> 0x00d9 }
            r7.put(r4, r0)     // Catch:{ all -> 0x00d9 }
            goto L_0x0070
        L_0x0060:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00d9 }
            r0 = 0
            X.0yx r0 = X.AnonymousClass8BR.A0B(r6, r0)     // Catch:{ all -> 0x00d9 }
            r7.put(r4, r0)     // Catch:{ all -> 0x00d9 }
            X.9LV r0 = r3.A02     // Catch:{ all -> 0x00d9 }
            if (r0 != 0) goto L_0x0070
            r3.A02 = r13     // Catch:{ all -> 0x00d9 }
        L_0x0070:
            int r0 = r3.A01     // Catch:{ all -> 0x00d9 }
            int r0 = r0 + 1
            r3.A01 = r0     // Catch:{ all -> 0x00d9 }
            if (r0 != r1) goto L_0x0079
            r8 = 1
        L_0x0079:
            monitor-exit(r3)     // Catch:{ all -> 0x00dc }
            if (r8 == 0) goto L_0x001e
            java.util.List r1 = r5.A04(r3)     // Catch:{ all -> 0x00dc }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x00dc }
            if (r0 != 0) goto L_0x00a4
            java.util.ArrayList r3 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x00dc }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00dc }
        L_0x008e:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x00dc }
            if (r0 == 0) goto L_0x00ba
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x00dc }
            X.9lh r0 = (X.C190899lh) r0     // Catch:{ all -> 0x00dc }
            X.AEq r0 = r0.A03     // Catch:{ all -> 0x00dc }
            X.A6K r0 = r0.A01     // Catch:{ all -> 0x00dc }
            java.lang.String r0 = r0.A0A     // Catch:{ all -> 0x00dc }
            r3.add(r0)     // Catch:{ all -> 0x00dc }
            goto L_0x008e
        L_0x00a4:
            java.util.List r0 = r10.A09     // Catch:{ all -> 0x00dc }
            r0.add(r3)     // Catch:{ all -> 0x00dc }
            goto L_0x001e
        L_0x00ab:
            java.lang.String r0 = "Got null exception for failure"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)     // Catch:{ all -> 0x00d9 }
            goto L_0x00b9
        L_0x00b2:
            java.lang.String r1 = "Got non-null exception for success"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00d9 }
            r0.<init>(r1, r13)     // Catch:{ all -> 0x00d9 }
        L_0x00b9:
            throw r0     // Catch:{ all -> 0x00d9 }
        L_0x00ba:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x00dc }
            java.lang.String r0 = "Internal loads still pending for finished ExternalLoadRequest: "
            java.lang.String r0 = X.AnonymousClass001.A1E(r3, r0, r1)     // Catch:{ all -> 0x00dc }
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)     // Catch:{ all -> 0x00dc }
            goto L_0x00db
        L_0x00c9:
            monitor-exit(r2)     // Catch:{ all -> 0x00dc }
            return
        L_0x00cb:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x00dc }
            java.lang.String r0 = "InternalLoadRequest still has associated download token: "
            r1.append(r0)     // Catch:{ all -> 0x00dc }
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0o(r4, r1)     // Catch:{ all -> 0x00dc }
            goto L_0x00db
        L_0x00d9:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00dc }
        L_0x00db:
            throw r0     // Catch:{ all -> 0x00dc }
        L_0x00dc:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00dc }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20123A8i.A06(X.A8i, X.9lh, X.9Ze, X.9LV, boolean):void");
    }

    public AIM A09(C180189Lm r10, BA6 ba6, AnonymousClass9OY r12, A4D a4d, List list) {
        C192849p5 r3;
        Executor executor;
        synchronized (this.A05) {
            A7A a7a = this.A01;
            r3 = new C192849p5(r10, ba6, r12, a4d, list);
            a7a.A04.put(r3, AnonymousClass000.A13());
        }
        if (a4d.A02) {
            executor = this.A0A;
        } else {
            executor = this.A06;
        }
        executor.execute(new C27081DTg(list, this, r3, 16));
        return new AIM(this, r3);
    }

    public C20123A8i(A65 a65, C20372AId aId, A23 a23, C188989iK r5, AnonymousClass9P7 r6, Executor executor, Executor executor2, Executor executor3) {
        this.A06 = executor;
        this.A0A = executor2;
        this.A07 = executor3;
        this.A02 = aId;
        this.A00 = a65;
        this.A03 = a23;
        this.A01 = new A7A(r5);
        this.A08 = r6;
        this.A04 = r5;
        C182259Tr.A00();
    }

    public static C19760yx A00(C20123A8i a8i, List list, List list2, boolean z) {
        C183679Ze r0;
        HashMap A11 = C17880vN.A11();
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            C190899lh r4 = (C190899lh) it.next();
            C20282AEq aEq = r4.A03;
            A6K a6k = aEq.A01;
            A08(a8i, aEq, AnonymousClass00R.A00, list, true);
            C20372AId aId = a8i.A02;
            boolean BeA = aId.BeA(a6k);
            A08(a8i, aEq, AnonymousClass00R.A01, list, BeA);
            if (BeA) {
                if (z || a6k.A03 == ARRequestAsset$CompressionMethod.NONE) {
                    File BNx = aId.BNx(a6k, new C20374AIf(a8i, aEq, list));
                    if (C196389uy.A01(BNx)) {
                        C28111Yx.A02(BNx);
                        r0 = new C183679Ze(aEq, BNx);
                    } else {
                        C26294Cx6.A0H("DefaultAssetManager", "Cached file not found? id=%s", a6k.A0A);
                        aId.CEX(a6k);
                    }
                } else {
                    aId.CRS(a6k);
                    r0 = null;
                }
                A11.put(r4, r0);
            }
            A13.add(r4);
        }
        return AnonymousClass8BR.A0B(A11, A13);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x021d, code lost:
        r2.A02(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01c5, code lost:
        r3.A02(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01c8, code lost:
        if (r15 != false) goto L_0x0004;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01ca, code lost:
        if (r10 == null) goto L_0x01d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01cc, code lost:
        r1 = r10.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01d0, code lost:
        if (r1 != null) goto L_0x01d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01d2, code lost:
        r1 = "missing failure reason";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01d4, code lost:
        r3.A03(r2, "failure_reason", r1);
        r3.A04(r2, 3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A07(X.C20123A8i r8, X.C20282AEq r9, X.AnonymousClass9LV r10, java.lang.Integer r11, java.util.List r12, long r13, boolean r15) {
        /*
            java.util.Iterator r7 = r12.iterator()
        L_0x0004:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0293
            java.lang.Object r5 = r7.next()
            X.A4D r5 = (X.A4D) r5
            int r0 = r11.intValue()
            switch(r0) {
                case 0: goto L_0x0249;
                case 1: goto L_0x0222;
                case 2: goto L_0x00ce;
                case 3: goto L_0x0017;
                case 4: goto L_0x0017;
                case 5: goto L_0x0061;
                case 6: goto L_0x020a;
                case 7: goto L_0x01f6;
                case 8: goto L_0x01e2;
                case 9: goto L_0x01b0;
                case 10: goto L_0x019c;
                case 11: goto L_0x0183;
                case 12: goto L_0x016e;
                case 13: goto L_0x0155;
                case 14: goto L_0x0140;
                case 15: goto L_0x012b;
                case 16: goto L_0x0116;
                case 17: goto L_0x00f2;
                default: goto L_0x0017;
            }
        L_0x0017:
            java.lang.Object[] r2 = X.AnonymousClass3MW.A1a()
            r1 = 0
            switch(r0) {
                case 0: goto L_0x005e;
                case 1: goto L_0x005b;
                case 2: goto L_0x0058;
                case 3: goto L_0x0055;
                case 4: goto L_0x0052;
                case 5: goto L_0x004f;
                case 6: goto L_0x004c;
                case 7: goto L_0x0049;
                case 8: goto L_0x0046;
                case 9: goto L_0x0043;
                case 10: goto L_0x0040;
                case 11: goto L_0x003d;
                case 12: goto L_0x003a;
                case 13: goto L_0x0037;
                case 14: goto L_0x0034;
                case 15: goto L_0x0031;
                case 16: goto L_0x002e;
                default: goto L_0x001f;
            }
        L_0x001f:
            java.lang.String r0 = "CACHE_PUT_END"
        L_0x0021:
            r2[r1] = r0
            java.lang.String r0 = "unknown asset loading stage reported : {0}"
            java.lang.String r0 = java.text.MessageFormat.format(r0, r2)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x002e:
            java.lang.String r0 = "CACHE_PUT_START"
            goto L_0x0021
        L_0x0031:
            java.lang.String r0 = "ENCODE_OPERATION_END"
            goto L_0x0021
        L_0x0034:
            java.lang.String r0 = "ENCODE_OPERATION_START"
            goto L_0x0021
        L_0x0037:
            java.lang.String r0 = "ENCODE_END"
            goto L_0x0021
        L_0x003a:
            java.lang.String r0 = "ENCODE_START"
            goto L_0x0021
        L_0x003d:
            java.lang.String r0 = "EXTRACT_END"
            goto L_0x0021
        L_0x0040:
            java.lang.String r0 = "EXTRACT_START"
            goto L_0x0021
        L_0x0043:
            java.lang.String r0 = "DECRYPT_END"
            goto L_0x0021
        L_0x0046:
            java.lang.String r0 = "DECRYPT_OPERATION_FINISH"
            goto L_0x0021
        L_0x0049:
            java.lang.String r0 = "DECRYPT_OPERATION_START"
            goto L_0x0021
        L_0x004c:
            java.lang.String r0 = "DECRYPT_START"
            goto L_0x0021
        L_0x004f:
            java.lang.String r0 = "DOWNLOAD_END"
            goto L_0x0021
        L_0x0052:
            java.lang.String r0 = "DOWNLOAD_RESUME"
            goto L_0x0021
        L_0x0055:
            java.lang.String r0 = "DOWNLOAD_PAUSE"
            goto L_0x0021
        L_0x0058:
            java.lang.String r0 = "DOWNLOAD_START"
            goto L_0x0021
        L_0x005b:
            java.lang.String r0 = "CACHE_CHECK_END"
            goto L_0x0021
        L_0x005e:
            java.lang.String r0 = "CACHE_CHECK_START"
            goto L_0x0021
        L_0x0061:
            X.A23 r1 = r8.A03
            r0 = 0
            X.C18070vi.A0d(r9, r0)
            r2 = 3
            X.C18070vi.A0d(r5, r2)
            boolean r0 = X.A23.A00(r5, r1)
            if (r0 != 0) goto L_0x0004
            X.8fT r4 = r1.A00
            java.lang.String r6 = r5.A01
            X.C18070vi.A0X(r6)
            int r3 = X.C167138fT.A01(r9, r6)
            if (r15 == 0) goto L_0x00b8
            java.lang.String r0 = "download_success"
        L_0x0080:
            r4.A02(r3, r0)
            if (r15 == 0) goto L_0x00bb
            r1 = 0
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00ad
            java.lang.String r5 = A02(r9)
            java.lang.String r2 = X.AnonymousClass9OX.A00(r9)
            java.lang.StringBuilder r1 = X.C108955ca.A15(r2)
            java.lang.String r0 = "AssetQplLogger/logAssetDownloadFinish Successful download with empty result: "
            r1.append(r0)
            r1.append(r6)
            r0 = 32
            r1.append(r0)
            r1.append(r5)
            r1.append(r0)
            X.C17890vO.A19(r1, r2)
        L_0x00ad:
            java.lang.String r1 = "downloaded_bytes"
            java.lang.String r0 = java.lang.String.valueOf(r13)
            r4.A03(r3, r1, r0)
            goto L_0x0004
        L_0x00b8:
            java.lang.String r0 = "download_fail"
            goto L_0x0080
        L_0x00bb:
            if (r10 == 0) goto L_0x00c9
            java.lang.String r1 = r10.A00()
            X.C18070vi.A0X(r1)
            java.lang.String r0 = "failure_reason"
            r4.A03(r3, r0, r1)
        L_0x00c9:
            r4.A04(r3, r2)
            goto L_0x0004
        L_0x00ce:
            X.A23 r1 = r8.A03
            X.C18070vi.A0h(r9, r5)
            boolean r0 = X.A23.A00(r5, r1)
            if (r0 != 0) goto L_0x0004
            X.8fT r3 = r1.A00
            int r2 = X.C167138fT.A00(r9, r5)
            java.lang.String r1 = "UNKNOWN"
            java.lang.String r0 = "connection_class"
            r3.A03(r2, r0, r1)
            java.lang.String r0 = "connection_name"
            r3.A03(r2, r0, r1)
            java.lang.String r0 = "download_start"
            r3.A02(r2, r0)
            goto L_0x0004
        L_0x00f2:
            X.A23 r1 = r8.A03
            X.C18070vi.A0i(r9, r5)
            boolean r0 = X.A23.A00(r5, r1)
            if (r0 != 0) goto L_0x0004
            X.8fT r2 = r1.A00
            int r1 = X.C167138fT.A00(r9, r5)
            if (r15 == 0) goto L_0x0113
            java.lang.String r0 = "put_to_cache_success"
        L_0x0107:
            r2.A02(r1, r0)
            r0 = 3
            if (r15 == 0) goto L_0x010e
            r0 = 2
        L_0x010e:
            r2.A04(r1, r0)
            goto L_0x0004
        L_0x0113:
            java.lang.String r0 = "put_to_cache_fail"
            goto L_0x0107
        L_0x0116:
            X.A23 r1 = r8.A03
            X.C18070vi.A0h(r9, r5)
            boolean r0 = X.A23.A00(r5, r1)
            if (r0 != 0) goto L_0x0004
            X.8fT r2 = r1.A00
            int r1 = X.C167138fT.A00(r9, r5)
            java.lang.String r0 = "put_to_cache_start"
            goto L_0x021d
        L_0x012b:
            X.A23 r1 = r8.A03
            X.C18070vi.A0h(r9, r5)
            boolean r0 = X.A23.A00(r5, r1)
            if (r0 != 0) goto L_0x0004
            X.8fT r2 = r1.A00
            int r1 = X.C167138fT.A00(r9, r5)
            java.lang.String r0 = "encoding_operation_finish"
            goto L_0x021d
        L_0x0140:
            X.A23 r1 = r8.A03
            X.C18070vi.A0h(r9, r5)
            boolean r0 = X.A23.A00(r5, r1)
            if (r0 != 0) goto L_0x0004
            X.8fT r2 = r1.A00
            int r1 = X.C167138fT.A00(r9, r5)
            java.lang.String r0 = "encoding_operation_start"
            goto L_0x021d
        L_0x0155:
            X.A23 r1 = r8.A03
            X.C18070vi.A0i(r9, r5)
            boolean r0 = X.A23.A00(r5, r1)
            if (r0 != 0) goto L_0x0004
            X.8fT r3 = r1.A00
            int r2 = X.C167138fT.A00(r9, r5)
            if (r15 == 0) goto L_0x016b
            java.lang.String r0 = "encoding_success"
            goto L_0x01c5
        L_0x016b:
            java.lang.String r0 = "encoding_fail"
            goto L_0x01c5
        L_0x016e:
            X.A23 r1 = r8.A03
            X.C18070vi.A0h(r9, r5)
            boolean r0 = X.A23.A00(r5, r1)
            if (r0 != 0) goto L_0x0004
            X.8fT r2 = r1.A00
            int r1 = X.C167138fT.A00(r9, r5)
            java.lang.String r0 = "encoding_start"
            goto L_0x021d
        L_0x0183:
            X.A23 r1 = r8.A03
            X.C18070vi.A0i(r9, r5)
            boolean r0 = X.A23.A00(r5, r1)
            if (r0 != 0) goto L_0x0004
            X.8fT r3 = r1.A00
            int r2 = X.C167138fT.A00(r9, r5)
            if (r15 == 0) goto L_0x0199
            java.lang.String r0 = "extraction_success"
            goto L_0x01c5
        L_0x0199:
            java.lang.String r0 = "extraction_fail"
            goto L_0x01c5
        L_0x019c:
            X.A23 r1 = r8.A03
            X.C18070vi.A0h(r9, r5)
            boolean r0 = X.A23.A00(r5, r1)
            if (r0 != 0) goto L_0x0004
            X.8fT r2 = r1.A00
            int r1 = X.C167138fT.A00(r9, r5)
            java.lang.String r0 = "extraction_start"
            goto L_0x021d
        L_0x01b0:
            X.A23 r1 = r8.A03
            X.C18070vi.A0i(r9, r5)
            boolean r0 = X.A23.A00(r5, r1)
            if (r0 != 0) goto L_0x0004
            X.8fT r3 = r1.A00
            int r2 = X.C167138fT.A00(r9, r5)
            if (r15 == 0) goto L_0x01df
            java.lang.String r0 = "decryption_success"
        L_0x01c5:
            r3.A02(r2, r0)
            if (r15 != 0) goto L_0x0004
            if (r10 == 0) goto L_0x01d2
            java.lang.String r1 = r10.A00()
            if (r1 != 0) goto L_0x01d4
        L_0x01d2:
            java.lang.String r1 = "missing failure reason"
        L_0x01d4:
            java.lang.String r0 = "failure_reason"
            r3.A03(r2, r0, r1)
            r0 = 3
            r3.A04(r2, r0)
            goto L_0x0004
        L_0x01df:
            java.lang.String r0 = "decryption_fail"
            goto L_0x01c5
        L_0x01e2:
            X.A23 r1 = r8.A03
            X.C18070vi.A0h(r9, r5)
            boolean r0 = X.A23.A00(r5, r1)
            if (r0 != 0) goto L_0x0004
            X.8fT r2 = r1.A00
            int r1 = X.C167138fT.A00(r9, r5)
            java.lang.String r0 = "decryption_operation_finish"
            goto L_0x021d
        L_0x01f6:
            X.A23 r1 = r8.A03
            X.C18070vi.A0h(r9, r5)
            boolean r0 = X.A23.A00(r5, r1)
            if (r0 != 0) goto L_0x0004
            X.8fT r2 = r1.A00
            int r1 = X.C167138fT.A00(r9, r5)
            java.lang.String r0 = "decryption_operation_start"
            goto L_0x021d
        L_0x020a:
            X.A23 r1 = r8.A03
            X.C18070vi.A0h(r9, r5)
            boolean r0 = X.A23.A00(r5, r1)
            if (r0 != 0) goto L_0x0004
            X.8fT r2 = r1.A00
            int r1 = X.C167138fT.A00(r9, r5)
            java.lang.String r0 = "decryption_start"
        L_0x021d:
            r2.A02(r1, r0)
            goto L_0x0004
        L_0x0222:
            X.A23 r1 = r8.A03
            r0 = 0
            X.C18070vi.A0d(r9, r0)
            r3 = 2
            X.C18070vi.A0d(r5, r3)
            boolean r0 = X.A23.A00(r5, r1)
            if (r0 != 0) goto L_0x0004
            X.8fT r2 = r1.A00
            int r1 = X.C167138fT.A00(r9, r5)
            if (r15 == 0) goto L_0x0246
            java.lang.String r0 = "cache_check_hit"
        L_0x023c:
            r2.A02(r1, r0)
            if (r15 == 0) goto L_0x0004
            r2.A04(r1, r3)
            goto L_0x0004
        L_0x0246:
            java.lang.String r0 = "cache_check_miss"
            goto L_0x023c
        L_0x0249:
            X.A23 r1 = r8.A03
            boolean r4 = X.C18070vi.A15(r9, r5)
            boolean r0 = X.A23.A00(r5, r1)
            if (r0 != 0) goto L_0x0004
            X.8fT r3 = r1.A00
            int r2 = X.C167138fT.A00(r9, r5)
            X.19Y r1 = r3.A00
            r0 = 22413316(0x1560004, float:3.9305604E-38)
            r1.Bj1(r0, r2, r4)
            X.A6K r0 = r9.A01
            java.lang.Boolean r0 = r0.A07
            boolean r0 = r0.booleanValue()
            java.lang.String r1 = X.AnonymousClass8BS.A0b(r0)
            java.lang.String r0 = "is_encrypted"
            r3.A03(r2, r0, r1)
            java.lang.String r0 = "cache_check_start"
            r3.A02(r2, r0)
            java.lang.String r1 = X.AnonymousClass9OX.A00(r9)
            X.C18070vi.A0X(r1)
            java.lang.String r0 = "asset_id"
            r3.A03(r2, r0, r1)
            java.lang.String r1 = A02(r9)
            java.lang.String r0 = "asset_type"
            r3.A03(r2, r0, r1)
            r3.A05(r5, r2)
            goto L_0x0004
        L_0x0293:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20123A8i.A07(X.A8i, X.AEq, X.9LV, java.lang.Integer, java.util.List, long, boolean):void");
    }
}
