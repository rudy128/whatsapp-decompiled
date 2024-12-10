package X;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public final class AU0 implements C1606989o {
    public final /* synthetic */ C22409B6n A00;
    public final /* synthetic */ AIZ A01;
    public final /* synthetic */ List A02;
    public final /* synthetic */ C22821Di A03;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: java.lang.Throwable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BE5(X.C138506xC r44) {
        /*
            r43 = this;
            r12 = 0
            r0 = r44
            X.C18070vi.A0d(r0, r12)
            X.161 r4 = r0.A03
            X.C18070vi.A0X(r4)
            X.163 r3 = r0.A04
            X.C18070vi.A0X(r3)
            int r1 = r0.A00
            r0 = 0
            r2 = r43
            if (r1 == 0) goto L_0x0039
            java.lang.Object r3 = r3.A00()
            boolean r1 = r3 instanceof X.C179969Kp
            if (r1 == 0) goto L_0x0022
            r0 = r3
            java.lang.Throwable r0 = (java.lang.Throwable) r0
        L_0x0022:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r1 = "ArdModelMetadataDownloader Error response: "
            X.C17900vP.A0X(r0, r1, r3)
            X.1Di r7 = r2.A03
            if (r0 != 0) goto L_0x0031
            X.8fR r0 = X.C167118fR.A00
        L_0x0031:
            X.9LV r0 = X.AIZ.A00(r0)
            r7.invoke(r0)
            return
        L_0x0039:
            java.lang.String r1 = "ArdModelMetadataDownloader Success"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            java.lang.Object r1 = r4.A00
            X.9pJ r1 = (X.C192959pJ) r1
            if (r1 == 0) goto L_0x00bd
            X.A22 r1 = r1.A00
            java.util.List r4 = r1.A00
            java.util.List r1 = r2.A02
            r42 = r1
            r7 = 10
            java.util.ArrayList r5 = X.C29351c6.A0E(r42)
            java.util.Iterator r3 = r42.iterator()
        L_0x0056:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x0068
            java.lang.Object r1 = r3.next()
            com.facebook.cameracore.ardelivery.model.ARModelMetadataRequest r1 = (com.facebook.cameracore.ardelivery.model.ARModelMetadataRequest) r1
            com.facebook.cameracore.ardelivery.model.VersionedCapability r1 = r1.mCapability
            r5.add(r1)
            goto L_0x0056
        L_0x0068:
            java.util.Set r6 = X.C29431cG.A12(r5)
            java.util.ArrayList r5 = X.C29351c6.A0E(r4)
            java.util.Iterator r3 = r4.iterator()
        L_0x0074:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x0086
            java.lang.Object r1 = r3.next()
            X.9sE r1 = (X.C194749sE) r1
            com.facebook.cameracore.ardelivery.model.VersionedCapability r1 = r1.A01
            r5.add(r1)
            goto L_0x0074
        L_0x0086:
            java.util.Set r5 = X.C29431cG.A12(r5)
            boolean r1 = X.C18070vi.A18(r5, r6)
            if (r1 != 0) goto L_0x00c3
            X.1Di r7 = r2.A03
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()
            java.lang.String r1 = "Requested for "
            r4.append(r1)
            java.util.List r1 = X.C29431cG.A0s(r6)
            java.lang.String r3 = ", "
            java.lang.String r2 = ""
            java.lang.String r1 = X.C29431cG.A0g(r3, r2, r2, r1, r0)
            r4.append(r1)
            java.lang.String r1 = ", received "
            r4.append(r1)
            java.util.List r1 = X.C29431cG.A0s(r5)
            java.lang.String r0 = X.C29431cG.A0g(r3, r2, r2, r1, r0)
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0o(r0, r4)
            goto L_0x0031
        L_0x00bd:
            X.1Di r7 = r2.A03
            X.8fQ r0 = X.C167108fQ.A00
            goto L_0x0031
        L_0x00c3:
            X.AIZ r1 = r2.A01     // Catch:{ IllegalStateException -> 0x01d8 }
            r41 = r1
            int r1 = X.C29351c6.A0C(r4, r7)     // Catch:{ IllegalStateException -> 0x01d8 }
            int r3 = X.C200610r.A03(r1)     // Catch:{ IllegalStateException -> 0x01d8 }
            r1 = 16
            if (r3 >= r1) goto L_0x00d5
            r3 = 16
        L_0x00d5:
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap     // Catch:{ IllegalStateException -> 0x01d8 }
            r6.<init>(r3)     // Catch:{ IllegalStateException -> 0x01d8 }
            java.util.Iterator r17 = r4.iterator()     // Catch:{ IllegalStateException -> 0x01d8 }
        L_0x00de:
            boolean r1 = r17.hasNext()     // Catch:{ IllegalStateException -> 0x01d8 }
            if (r1 == 0) goto L_0x01d0
            java.lang.Object r4 = r17.next()     // Catch:{ IllegalStateException -> 0x01d8 }
            X.9sE r4 = (X.C194749sE) r4     // Catch:{ IllegalStateException -> 0x01d8 }
            com.facebook.cameracore.ardelivery.model.VersionedCapability r5 = r4.A01     // Catch:{ IllegalStateException -> 0x01d8 }
            java.util.List r1 = r4.A02     // Catch:{ IllegalStateException -> 0x01d8 }
            java.util.ArrayList r11 = X.C29351c6.A0E(r1)     // Catch:{ IllegalStateException -> 0x01d8 }
            java.util.Iterator r16 = r1.iterator()     // Catch:{ IllegalStateException -> 0x01d8 }
        L_0x00f6:
            boolean r1 = r16.hasNext()     // Catch:{ IllegalStateException -> 0x01d8 }
            if (r1 == 0) goto L_0x01b4
            java.lang.Object r1 = r16.next()     // Catch:{ IllegalStateException -> 0x01d8 }
            X.9tu r1 = (X.C195789tu) r1     // Catch:{ IllegalStateException -> 0x01d8 }
            X.9JJ r7 = r1.A02     // Catch:{ IllegalStateException -> 0x01d8 }
            X.0vl r3 = X.C198909z7.A01     // Catch:{ IllegalStateException -> 0x01d8 }
            r3 = r41
            X.00H r3 = r3.A02     // Catch:{ IllegalStateException -> 0x01d8 }
            java.lang.Object r3 = X.C18070vi.A0E(r3)     // Catch:{ IllegalStateException -> 0x01d8 }
            X.0vd r3 = (X.C18020vd) r3     // Catch:{ IllegalStateException -> 0x01d8 }
            X.C18070vi.A0d(r3, r12)     // Catch:{ IllegalStateException -> 0x01d8 }
            com.facebook.cameracore.ardelivery.model.VersionedCapability r26 = com.facebook.cameracore.ardelivery.model.VersionedCapability.Facetracker     // Catch:{ IllegalStateException -> 0x01d8 }
            X.9JJ r18 = X.AnonymousClass9JJ.A08     // Catch:{ IllegalStateException -> 0x01d8 }
            X.9JJ r20 = X.AnonymousClass9JJ.A0C     // Catch:{ IllegalStateException -> 0x01d8 }
            X.9JJ r22 = X.AnonymousClass9JJ.A0A     // Catch:{ IllegalStateException -> 0x01d8 }
            X.9JJ r24 = X.AnonymousClass9JJ.A0E     // Catch:{ IllegalStateException -> 0x01d8 }
            java.lang.String r25 = "5e393972fefea10ed23589622eecf0bc53b6e83d4376009791003b42978a246d"
            java.lang.String r19 = "9314a74762f36e6f5bf6cdef5054f1630cafbe42269c2ef6e987de45b836e3a9"
            java.lang.String r21 = "418ba26569faa19bb4349abe25cfcc95ff4c9d2381d7ee5d1316123d69197581"
            java.lang.String r23 = "6dacaf20921b2ce236ea3dc5605a044d391d85d43ea9ded96c750283e0f3a5d8"
            X.10w r27 = X.C201110w.of(r18, r19, r20, r21, r22, r23, r24, r25)     // Catch:{ IllegalStateException -> 0x01d8 }
            com.facebook.cameracore.ardelivery.model.VersionedCapability r28 = com.facebook.cameracore.ardelivery.model.VersionedCapability.FaceExpressionFitting     // Catch:{ IllegalStateException -> 0x01d8 }
            X.9JJ r9 = X.AnonymousClass9JJ.A06     // Catch:{ IllegalStateException -> 0x01d8 }
            java.lang.String r8 = "3c30c0179af6432ace62be98f652e475a17e56977671dac08ff7f3cea820a369"
            X.10w r29 = X.C201110w.of(r9, r8)     // Catch:{ IllegalStateException -> 0x01d8 }
            com.facebook.cameracore.ardelivery.model.VersionedCapability r30 = com.facebook.cameracore.ardelivery.model.VersionedCapability.Segmentation     // Catch:{ IllegalStateException -> 0x01d8 }
            X.0vf r9 = X.C18040vf.A01     // Catch:{ IllegalStateException -> 0x01d8 }
            r8 = 11940(0x2ea4, float:1.6732E-41)
            boolean r3 = X.C18020vd.A05(r9, r3, r8)     // Catch:{ IllegalStateException -> 0x01d8 }
            if (r3 == 0) goto L_0x01a7
            X.9JJ r8 = X.AnonymousClass9JJ.A04     // Catch:{ IllegalStateException -> 0x01d8 }
            java.lang.String r3 = "3db4304c267ffa219608b42501c574ddb5adb4943f5f0920ecb86a6d65522de6"
            X.10w r31 = X.C201110w.of(r8, r3)     // Catch:{ IllegalStateException -> 0x01d8 }
        L_0x0147:
            X.10w r3 = X.C201110w.of(r26, r27, r28, r29, r30, r31)     // Catch:{ IllegalStateException -> 0x01d8 }
            X.C18070vi.A0X(r3)     // Catch:{ IllegalStateException -> 0x01d8 }
            java.lang.Object r3 = r3.get(r5)     // Catch:{ IllegalStateException -> 0x01d8 }
            X.10w r3 = (X.C201110w) r3     // Catch:{ IllegalStateException -> 0x01d8 }
            if (r3 == 0) goto L_0x01b9
            java.lang.Object r3 = r3.get(r7)     // Catch:{ IllegalStateException -> 0x01d8 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ IllegalStateException -> 0x01d8 }
            if (r3 == 0) goto L_0x01b9
            int r8 = r4.A00     // Catch:{ IllegalStateException -> 0x01d8 }
            r20 = r8
            java.lang.String r8 = r1.A04     // Catch:{ IllegalStateException -> 0x01d8 }
            r18 = r8
            X.9rL r8 = r1.A03     // Catch:{ IllegalStateException -> 0x01d8 }
            java.lang.String r15 = r8.A00     // Catch:{ IllegalStateException -> 0x01d8 }
            java.lang.String r14 = r1.A06     // Catch:{ IllegalStateException -> 0x01d8 }
            int r8 = r1.A00     // Catch:{ IllegalStateException -> 0x01d8 }
            long r8 = (long) r8     // Catch:{ IllegalStateException -> 0x01d8 }
            com.facebook.cameracore.ardelivery.model.ARRequestAsset$CompressionMethod r13 = r1.A01     // Catch:{ IllegalStateException -> 0x01d8 }
            java.lang.String r10 = r1.A05     // Catch:{ IllegalStateException -> 0x01d8 }
            java.lang.Integer r24 = X.AnonymousClass00R.A01     // Catch:{ IllegalStateException -> 0x01d8 }
            r38 = 0
            com.facebook.cameracore.ardelivery.model.ARAssetType r19 = com.facebook.cameracore.ardelivery.model.ARAssetType.SUPPORT     // Catch:{ IllegalStateException -> 0x01d8 }
            X.AEq r1 = new X.AEq     // Catch:{ IllegalStateException -> 0x01d8 }
            r28 = r15
            r31 = r0
            r33 = r0
            r34 = r0
            r21 = r0
            r22 = r7
            r23 = r5
            r25 = r18
            r26 = r0
            r27 = r15
            r29 = r14
            r30 = r3
            r32 = r10
            r35 = r20
            r36 = r8
            r40 = r12
            r18 = r1
            r20 = r13
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r38, r40)     // Catch:{ IllegalStateException -> 0x01d8 }
            r11.add(r1)     // Catch:{ IllegalStateException -> 0x01d8 }
            goto L_0x00f6
        L_0x01a7:
            X.9JJ r10 = X.AnonymousClass9JJ.A02     // Catch:{ IllegalStateException -> 0x01d8 }
            X.9JJ r9 = X.AnonymousClass9JJ.A03     // Catch:{ IllegalStateException -> 0x01d8 }
            java.lang.String r8 = "a63d8014dba891345b30174df2b2a57efbb65b4f9f09b98f245d1b3192277ece"
            java.lang.String r3 = "e45331a6e6708f4529069d8bde1a2ef5786a9e2d1ada3da396d881086da46ab5"
            X.10w r31 = X.C201110w.of(r10, r3, r9, r8)     // Catch:{ IllegalStateException -> 0x01d8 }
            goto L_0x0147
        L_0x01b4:
            r6.put(r5, r11)     // Catch:{ IllegalStateException -> 0x01d8 }
            goto L_0x00de
        L_0x01b9:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IllegalStateException -> 0x01d8 }
            java.lang.String r0 = "No hash found for "
            r1.append(r0)     // Catch:{ IllegalStateException -> 0x01d8 }
            r1.append(r5)     // Catch:{ IllegalStateException -> 0x01d8 }
            java.lang.String r0 = " and "
            java.lang.String r0 = X.AnonymousClass001.A1E(r7, r0, r1)     // Catch:{ IllegalStateException -> 0x01d8 }
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)     // Catch:{ IllegalStateException -> 0x01d8 }
            throw r0     // Catch:{ IllegalStateException -> 0x01d8 }
        L_0x01d0:
            X.B6n r2 = r2.A00
            r1 = r42
            r2.BpO(r0, r1, r6)
            return
        L_0x01d8:
            r0 = move-exception
            X.1Di r1 = r2.A03
            X.9LV r0 = X.AIZ.A00(r0)
            r1.invoke(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AU0.BE5(X.6xC):void");
    }

    public void BrB(IOException iOException) {
        C18070vi.A0d(iOException, 0);
        this.A00.BpO(AIZ.A00(iOException), this.A02, (Map) null);
    }

    public void Bsw(Exception exc) {
        C18070vi.A0d(exc, 0);
        this.A00.BpO(AIZ.A00(exc), this.A02, (Map) null);
    }

    public AU0(C22409B6n b6n, AIZ aiz, List list, C22821Di r4) {
        this.A03 = r4;
        this.A01 = aiz;
        this.A02 = list;
        this.A00 = b6n;
    }
}
