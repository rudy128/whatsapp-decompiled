package X;

import com.facebook.cameracore.ardelivery.model.ARAssetType;
import com.facebook.cameracore.ardelivery.model.ARRequestAsset$CompressionMethod;
import com.facebook.cameracore.ardelivery.model.EffectAssetType;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import com.facebook.cameracore.ardelivery.storage.interfaces.StorageCallback;
import java.io.File;
import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.AId  reason: case insensitive filesystem */
public class C20372AId implements C22551BCi {
    public final C162428Kr A00;
    public final Map A01;

    public static A6K A00(A6K a6k, ARRequestAsset$CompressionMethod aRRequestAsset$CompressionMethod) {
        A6K a6k2 = a6k;
        ARAssetType aRAssetType = a6k2.A02;
        boolean z = false;
        ARRequestAsset$CompressionMethod aRRequestAsset$CompressionMethod2 = aRRequestAsset$CompressionMethod;
        switch (aRAssetType.ordinal()) {
            case 0:
                String str = a6k2.A0A;
                String str2 = a6k2.A0B;
                String str3 = a6k2.A0C;
                ARAssetType aRAssetType2 = ARAssetType.EFFECT;
                if (aRAssetType == aRAssetType2) {
                    z = true;
                }
                C26159CtX.A04(z, "Cannot get effect asset type from asset type other than effect");
                EffectAssetType effectAssetType = a6k2.A04;
                C26159CtX.A04(AnonymousClass000.A1Z(aRAssetType, aRAssetType2), "Cannot get required SDK version from support asset");
                String str4 = a6k2.A0D;
                String str5 = a6k2.A09;
                C26159CtX.A04(AnonymousClass3Ma.A1Z(aRAssetType, ARAssetType.SUPPORT), "Cannot get isLoggingDisabled from support asset");
                String str6 = str4;
                String str7 = str3;
                String str8 = str2;
                String str9 = str;
                return new A6K(aRAssetType, aRRequestAsset$CompressionMethod2, effectAssetType, (AnonymousClass9IY) null, (AnonymousClass9JJ) null, (VersionedCapability) null, a6k2.A08, a6k2.A07, str9, str8, str7, str6, str5, (String) null, -1);
            case 1:
                String str10 = a6k2.A0A;
                String str11 = a6k2.A0C;
                VersionedCapability A02 = a6k2.A02();
                if (aRAssetType == ARAssetType.SUPPORT) {
                    z = true;
                }
                C26159CtX.A04(z, "Cannot get Version from Effect Asset");
                int i = a6k2.A01;
                String str12 = a6k2.A09;
                String str13 = str12;
                String str14 = str11;
                String str15 = str10;
                return new A6K(aRAssetType, aRRequestAsset$CompressionMethod2, (EffectAssetType) null, (AnonymousClass9IY) null, a6k2.A06, A02, false, a6k2.A07, str15, (String) null, str14, (String) null, str13, (String) null, i);
            case 2:
            case 3:
                String str16 = a6k2.A0A;
                String str17 = a6k2.A0B;
                String str18 = a6k2.A0C;
                String str19 = a6k2.A09;
                if (aRAssetType != ARAssetType.SUPPORT) {
                    z = true;
                }
                C26159CtX.A04(z, "Cannot get isLoggingDisabled from support asset");
                Boolean bool = a6k2.A08;
                String str20 = str18;
                String str21 = str17;
                String str22 = str16;
                return new A6K(aRAssetType, aRRequestAsset$CompressionMethod2, (EffectAssetType) null, a6k2.A05, (AnonymousClass9JJ) null, (VersionedCapability) null, bool, a6k2.A07, str22, str21, str20, (String) null, str19, (String) null, -1);
            case 4:
                String str23 = a6k2.A0A;
                String str24 = a6k2.A0B;
                String str25 = a6k2.A0C;
                ARRequestAsset$CompressionMethod aRRequestAsset$CompressionMethod3 = a6k2.A03;
                String str26 = a6k2.A09;
                if (aRAssetType != ARAssetType.SUPPORT) {
                    z = true;
                }
                C26159CtX.A04(z, "Cannot get isLoggingDisabled from support asset");
                String str27 = str25;
                String str28 = str24;
                String str29 = str23;
                return new A6K(aRAssetType, aRRequestAsset$CompressionMethod3, (EffectAssetType) null, (AnonymousClass9IY) null, (AnonymousClass9JJ) null, (VersionedCapability) null, a6k2.A08, a6k2.A07, str29, str28, str27, (String) null, str26, (String) null, -1);
            case 5:
                String str30 = a6k2.A0A;
                String str31 = a6k2.A0C;
                String str32 = a6k2.A09;
                String str33 = str32;
                String str34 = str31;
                String str35 = str30;
                return new A6K(aRAssetType, aRRequestAsset$CompressionMethod2, (EffectAssetType) null, (AnonymousClass9IY) null, a6k2.A06, (VersionedCapability) null, false, a6k2.A07, str35, (String) null, str34, (String) null, str33, a6k2.A0E, -1);
            default:
                Object[] A1a = AnonymousClass3MW.A1a();
                A1a[0] = aRAssetType;
                throw AnonymousClass000.A0k(MessageFormat.format("Unknown asset type : {0}", A1a));
        }
    }

    private AnonymousClass9US A01(ARAssetType aRAssetType) {
        AnonymousClass9US r0 = (AnonymousClass9US) this.A01.get(aRAssetType);
        if (r0 != null) {
            return r0;
        }
        throw AnonymousClass8BX.A0V(aRAssetType, "unsupported asset type : ", AnonymousClass000.A10());
    }

    public File BNx(A6K a6k, StorageCallback storageCallback) {
        A01(a6k.A02);
        return this.A00.BNx(A00(a6k, ARRequestAsset$CompressionMethod.NONE), storageCallback);
    }

    public boolean BeA(A6K a6k) {
        A01(a6k.A02);
        return this.A00.BeA(A00(a6k, ARRequestAsset$CompressionMethod.NONE));
    }

    public void CEX(A6K a6k) {
        this.A00.CEX(a6k);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: X.9N9} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.io.File] */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x010e A[Catch:{ all -> 0x0109, all -> 0x0114 }] */
    /* JADX WARNING: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.io.File CGf(X.A6K r13, com.facebook.cameracore.ardelivery.storage.interfaces.StorageCallback r14, java.io.File r15) {
        /*
            r12 = this;
            com.facebook.cameracore.ardelivery.model.ARAssetType r0 = r13.A02
            X.9US r4 = r12.A01(r0)
            if (r15 != 0) goto L_0x000a
            r3 = 0
        L_0x0009:
            return r3
        L_0x000a:
            X.8Kr r7 = r12.A00
            java.lang.String r6 = "decompression result is null"
            java.lang.Boolean r1 = r13.A07     // Catch:{ all -> 0x0114 }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x0114 }
            r3 = 0
            r2 = 0
            if (r1 == 0) goto L_0x001f
            java.lang.String r6 = "Encountered Unexpected Encrypted Asset in Android Delivery"
        L_0x001a:
            r14.onExtractionFinish(r2, r6)     // Catch:{ all -> 0x0114 }
            goto L_0x00e8
        L_0x001f:
            com.facebook.cameracore.ardelivery.model.ARRequestAsset$CompressionMethod r5 = r13.A03     // Catch:{ all -> 0x0114 }
            com.facebook.cameracore.ardelivery.model.ARRequestAsset$CompressionMethod r1 = com.facebook.cameracore.ardelivery.model.ARRequestAsset$CompressionMethod.NONE     // Catch:{ all -> 0x0114 }
            r10 = 1
            if (r5 == r1) goto L_0x00ce
            r14.onExtractionStart()     // Catch:{ all -> 0x0114 }
            X.0vp r1 = r4.A00     // Catch:{ all -> 0x0102 }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x0102 }
            X.9Zf r1 = (X.C183689Zf) r1     // Catch:{ all -> 0x0102 }
            if (r1 == 0) goto L_0x001a
            java.lang.String r1 = r1.A01     // Catch:{ all -> 0x0102 }
            java.lang.String r9 = r13.A0A     // Catch:{ all -> 0x0102 }
            java.io.File r11 = X.AnonymousClass8BR.A0u(r1, r9)     // Catch:{ all -> 0x0102 }
            X.C196389uy.A00(r11)     // Catch:{ all -> 0x0102 }
            int r4 = r5.ordinal()     // Catch:{ all -> 0x00fd }
            if (r4 == r10) goto L_0x0059
            r1 = 2
            if (r4 != r1) goto L_0x00f2
            X.C182259Tr.A00()     // Catch:{ all -> 0x00fd }
            X.B6j r5 = X.C182259Tr.A00     // Catch:{ all -> 0x00fd }
            java.lang.String r4 = r15.getPath()     // Catch:{ all -> 0x00fd }
            java.lang.String r1 = r11.getPath()     // Catch:{ all -> 0x00fd }
            X.9N9 r8 = r5.decompress(r4, r1)     // Catch:{ all -> 0x00fd }
            goto L_0x006a
        L_0x0059:
            X.C182259Tr.A00()     // Catch:{ all -> 0x00fd }
            X.B6j r5 = X.C182259Tr.A01     // Catch:{ all -> 0x00fd }
            java.lang.String r4 = r15.getPath()     // Catch:{ all -> 0x00fd }
            java.lang.String r1 = r11.getPath()     // Catch:{ all -> 0x00fd }
            X.9N9 r8 = r5.decompress(r4, r1)     // Catch:{ all -> 0x00fd }
        L_0x006a:
            java.io.File r1 = r8.A00     // Catch:{ all -> 0x0102 }
            if (r1 != 0) goto L_0x0071
            X.C196389uy.A00(r11)     // Catch:{ all -> 0x0102 }
        L_0x0071:
            java.io.File r4 = r8.A00     // Catch:{ all -> 0x0104 }
            com.facebook.cameracore.ardelivery.model.ARAssetType r1 = com.facebook.cameracore.ardelivery.model.ARAssetType.SUPPORT     // Catch:{ all -> 0x0104 }
            if (r0 == r1) goto L_0x007b
            com.facebook.cameracore.ardelivery.model.ARAssetType r1 = com.facebook.cameracore.ardelivery.model.ARAssetType.REMOTE     // Catch:{ all -> 0x0104 }
            if (r0 != r1) goto L_0x00c2
        L_0x007b:
            r11 = 0
            if (r4 == 0) goto L_0x009b
            boolean r1 = r4.exists()     // Catch:{ all -> 0x0104 }
            if (r1 == 0) goto L_0x009b
            boolean r1 = r4.isDirectory()     // Catch:{ all -> 0x0104 }
            if (r1 == 0) goto L_0x009b
            java.lang.String[] r5 = r4.list()     // Catch:{ all -> 0x0104 }
            if (r5 == 0) goto L_0x009b
            int r1 = r5.length     // Catch:{ all -> 0x0104 }
            if (r1 == 0) goto L_0x009b
            if (r1 != r10) goto L_0x009b
            r1 = r5[r2]     // Catch:{ all -> 0x0104 }
            java.io.File r11 = X.C17880vN.A0e(r4, r1)     // Catch:{ all -> 0x0104 }
        L_0x009b:
            if (r11 != 0) goto L_0x00c1
            if (r4 == 0) goto L_0x00c1
            boolean r1 = r4.isDirectory()     // Catch:{ all -> 0x0104 }
            if (r1 == 0) goto L_0x00c1
            java.lang.String[] r1 = r4.list()     // Catch:{ all -> 0x0104 }
            if (r1 == 0) goto L_0x00c1
            int r1 = r1.length     // Catch:{ all -> 0x0104 }
            if (r1 <= r10) goto L_0x00c1
            java.lang.String r5 = "AlwaysUnzipStorageStrategy"
            java.lang.String r4 = "%s [%s] has more than one file in tar."
            java.lang.Object[] r1 = X.AnonymousClass3MW.A1b()     // Catch:{ all -> 0x0104 }
            java.lang.String r0 = r0.name()     // Catch:{ all -> 0x0104 }
            r1[r2] = r0     // Catch:{ all -> 0x0104 }
            r1[r10] = r9     // Catch:{ all -> 0x0104 }
            X.C26294Cx6.A0H(r5, r4, r1)     // Catch:{ all -> 0x0104 }
        L_0x00c1:
            r4 = r11
        L_0x00c2:
            boolean r1 = X.C196389uy.A01(r4)     // Catch:{ all -> 0x0104 }
            if (r1 != 0) goto L_0x00d0
            java.lang.String r0 = r8.A01     // Catch:{ all -> 0x0114 }
            r14.onExtractionFinish(r1, r0)     // Catch:{ all -> 0x0114 }
            goto L_0x00e8
        L_0x00ce:
            r4 = r15
            goto L_0x00d5
        L_0x00d0:
            java.lang.String r0 = r8.A01     // Catch:{ all -> 0x0114 }
            r14.onExtractionFinish(r1, r0)     // Catch:{ all -> 0x0114 }
        L_0x00d5:
            com.facebook.cameracore.ardelivery.model.ARRequestAsset$CompressionMethod r0 = com.facebook.cameracore.ardelivery.model.ARRequestAsset$CompressionMethod.NONE     // Catch:{ all -> 0x0114 }
            X.A6K r0 = A00(r13, r0)     // Catch:{ all -> 0x0114 }
            r14.onCachePutStart()     // Catch:{ all -> 0x0114 }
            java.io.File r3 = r7.CGf(r0, r14, r4)     // Catch:{ all -> 0x0109 }
            if (r3 == 0) goto L_0x00e5
            r2 = 1
        L_0x00e5:
            r14.onCachePutFinish(r2)     // Catch:{ all -> 0x0114 }
        L_0x00e8:
            boolean r0 = X.C196389uy.A01(r15)
            if (r0 == 0) goto L_0x0009
            r15.delete()
            return r3
        L_0x00f2:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x00fd }
            java.lang.String r0 = "Got unsupported compression: "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass8BX.A0V(r5, r0, r1)     // Catch:{ all -> 0x00fd }
            throw r0     // Catch:{ all -> 0x00fd }
        L_0x00fd:
            r0 = move-exception
            X.C196389uy.A00(r11)     // Catch:{ all -> 0x0102 }
            throw r0     // Catch:{ all -> 0x0102 }
        L_0x0102:
            r0 = move-exception
            goto L_0x0106
        L_0x0104:
            r0 = move-exception
            r3 = r8
        L_0x0106:
            if (r3 == 0) goto L_0x0110
            goto L_0x010e
        L_0x0109:
            r0 = move-exception
            r14.onCachePutFinish(r2)     // Catch:{ all -> 0x0114 }
            goto L_0x0113
        L_0x010e:
            java.lang.String r6 = r3.A01     // Catch:{ all -> 0x0114 }
        L_0x0110:
            r14.onExtractionFinish(r2, r6)     // Catch:{ all -> 0x0114 }
        L_0x0113:
            throw r0     // Catch:{ all -> 0x0114 }
        L_0x0114:
            r1 = move-exception
            boolean r0 = X.C196389uy.A01(r15)
            if (r0 == 0) goto L_0x011e
            r15.delete()
        L_0x011e:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20372AId.CGf(X.A6K, com.facebook.cameracore.ardelivery.storage.interfaces.StorageCallback, java.io.File):java.io.File");
    }

    public void CRS(A6K a6k) {
        this.A00.CRS(a6k);
    }

    public C20372AId(C162428Kr r3, AnonymousClass9US r4, AnonymousClass9US r5, AnonymousClass9US r6, AnonymousClass9US r7, AnonymousClass9US r8, AnonymousClass9US r9) {
        this.A00 = r3;
        HashMap A11 = C17880vN.A11();
        this.A01 = A11;
        A11.put(ARAssetType.EFFECT, r4);
        A11.put(ARAssetType.SUPPORT, r5);
        A11.put(ARAssetType.ASYNC, r6);
        A11.put(ARAssetType.REMOTE, r7);
        A11.put(ARAssetType.SCRIPTING_PACKAGE, r8);
        A11.put(ARAssetType.SPARKVISION, r9);
    }
}
