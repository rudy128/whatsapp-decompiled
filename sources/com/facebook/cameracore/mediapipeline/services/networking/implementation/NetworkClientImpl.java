package com.facebook.cameracore.mediapipeline.services.networking.implementation;

import X.C28426E0r;
import com.facebook.cameracore.mediapipeline.services.networking.interfaces.NetworkClient;
import com.facebook.jni.HybridData;

public class NetworkClientImpl extends NetworkClient {
    public final C28426E0r mWorker;

    private native HybridData initHybrid();

    /* JADX WARNING: type inference failed for: r6v0, types: [com.facebook.cameracore.mediapipeline.services.networking.implementation.HTTPClientResponseHandler, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00db A[SYNTHETIC, Splitter:B:31:0x00db] */
    /* JADX WARNING: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void sendRequest(com.facebook.native_bridge.NativeDataPromise r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String[] r24, java.lang.String[] r25, boolean r26) {
        /*
            r19 = this;
            r14 = r23
            r0 = r19
            r2 = r20
            X.E0r r1 = r0.mWorker     // Catch:{ Exception -> 0x00e6 }
            com.facebook.cameracore.mediapipeline.services.networking.implementation.HTTPClientResponseHandler r6 = new com.facebook.cameracore.mediapipeline.services.networking.implementation.HTTPClientResponseHandler     // Catch:{ Exception -> 0x00e6 }
            r6.<init>()     // Catch:{ Exception -> 0x00e6 }
            X.DMo r3 = new X.DMo     // Catch:{ Exception -> 0x00e6 }
            r3.<init>(r0, r2)     // Catch:{ Exception -> 0x00e6 }
            X.DAz r1 = (X.C26723DAz) r1     // Catch:{ Exception -> 0x00e6 }
            r5 = 0
            r13 = r21
            X.C18070vi.A0d(r13, r5)     // Catch:{ Exception -> 0x00e6 }
            r7 = r22
            r12 = r24
            X.C72473Md.A1I(r7, r12)     // Catch:{ Exception -> 0x00e6 }
            r0 = 4
            r11 = r25
            X.C18070vi.A0d(r11, r0)     // Catch:{ Exception -> 0x00e6 }
            X.CQQ r1 = r1.A00     // Catch:{ Exception -> 0x00e6 }
            java.lang.String r0 = "AvatarSdkHttpClient Starting request"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x00e6 }
            r4 = 0
            java.util.Locale r0 = java.util.Locale.ROOT     // Catch:{ all -> 0x00d0 }
            java.lang.String r8 = r7.toUpperCase(r0)     // Catch:{ all -> 0x00d0 }
            X.C18070vi.A0X(r8)     // Catch:{ all -> 0x00d0 }
            java.lang.String r0 = "GET"
            boolean r0 = r8.equals(r0)     // Catch:{ all -> 0x00d0 }
            if (r0 != 0) goto L_0x0056
            java.lang.String r0 = "POST"
            boolean r0 = r8.equals(r0)     // Catch:{ all -> 0x00d0 }
            if (r0 != 0) goto L_0x0056
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x00d0 }
            java.lang.String r0 = "Unsupported method: "
            r1.append(r0)     // Catch:{ all -> 0x00d0 }
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A12(r7, r1)     // Catch:{ all -> 0x00d0 }
            throw r0     // Catch:{ all -> 0x00d0 }
        L_0x0056:
            int r7 = r12.length     // Catch:{ all -> 0x00d0 }
            int r0 = r11.length     // Catch:{ all -> 0x00d0 }
            int r10 = java.lang.Math.min(r7, r0)     // Catch:{ all -> 0x00d0 }
            java.util.ArrayList r9 = X.C17880vN.A0z(r10)     // Catch:{ all -> 0x00d0 }
            r8 = 0
        L_0x0061:
            if (r8 >= r10) goto L_0x0071
            r7 = r24[r8]     // Catch:{ all -> 0x00d0 }
            r0 = r25[r8]     // Catch:{ all -> 0x00d0 }
            X.1D6 r0 = X.AnonymousClass1D6.A01(r7, r0)     // Catch:{ all -> 0x00d0 }
            r9.add(r0)     // Catch:{ all -> 0x00d0 }
            int r8 = r8 + 1
            goto L_0x0061
        L_0x0071:
            java.util.Map r16 = X.AnonymousClass1D7.A0D(r9)     // Catch:{ all -> 0x00d0 }
            X.1D9 r11 = r1.A01     // Catch:{ all -> 0x00d0 }
            if (r23 == 0) goto L_0x007f
            int r0 = r14.length()     // Catch:{ all -> 0x00d0 }
            if (r0 != 0) goto L_0x0080
        L_0x007f:
            r14 = r4
        L_0x0080:
            X.11W r0 = r1.A02     // Catch:{ all -> 0x00d0 }
            java.lang.String r15 = r0.A02()     // Catch:{ all -> 0x00d0 }
            r0 = 35
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00d0 }
            r17 = r5
            r18 = r5
            X.AUZ r7 = r11.A09(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x00d0 }
            java.net.HttpURLConnection r0 = r7.A01     // Catch:{ all -> 0x00cd }
            int r5 = r0.getResponseCode()     // Catch:{ all -> 0x00cd }
            X.181 r0 = r1.A00     // Catch:{ all -> 0x00cd }
            X.9Hb r8 = r7.BMP(r0, r4, r12)     // Catch:{ all -> 0x00cd }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x00cd }
            java.lang.String r0 = "AvatarSdkHttpClient Success with code: "
            X.C17900vP.A0j(r0, r1, r5)     // Catch:{ all -> 0x00cd }
            org.apache.http.HttpVersion r4 = org.apache.http.HttpVersion.HTTP_1_1     // Catch:{ all -> 0x00cd }
            org.apache.http.impl.EnglishReasonPhraseCatalog r1 = org.apache.http.impl.EnglishReasonPhraseCatalog.INSTANCE     // Catch:{ all -> 0x00cd }
            java.util.Locale r0 = java.util.Locale.ENGLISH     // Catch:{ all -> 0x00cd }
            java.lang.String r0 = r1.getReason(r5, r0)     // Catch:{ all -> 0x00cd }
            org.apache.http.message.BasicHttpResponse r1 = new org.apache.http.message.BasicHttpResponse     // Catch:{ all -> 0x00cd }
            r1.<init>(r4, r5, r0)     // Catch:{ all -> 0x00cd }
            r4 = -1
            org.apache.http.entity.InputStreamEntity r0 = new org.apache.http.entity.InputStreamEntity     // Catch:{ all -> 0x00cd }
            r0.<init>(r8, r4)     // Catch:{ all -> 0x00cd }
            r1.setEntity(r0)     // Catch:{ all -> 0x00cd }
            java.lang.Object r0 = r6.handleResponse(r1)     // Catch:{ all -> 0x00cd }
            r3.onSuccess(r0)     // Catch:{ all -> 0x00cd }
            r7.close()     // Catch:{ Exception -> 0x00e6 }
            return
        L_0x00cd:
            r1 = move-exception
            r4 = r7
            goto L_0x00d1
        L_0x00d0:
            r1 = move-exception
        L_0x00d1:
            java.lang.String r0 = "AvatarSdkHttpClient Error occurred"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x00df }
            r3.Btr(r1)     // Catch:{ all -> 0x00df }
            if (r4 == 0) goto L_0x00ee
            r4.close()     // Catch:{ Exception -> 0x00e6 }
            return
        L_0x00df:
            r0 = move-exception
            if (r4 == 0) goto L_0x00e5
            r4.close()     // Catch:{ Exception -> 0x00e6 }
        L_0x00e5:
            throw r0     // Catch:{ Exception -> 0x00e6 }
        L_0x00e6:
            r0 = move-exception
            java.lang.String r0 = r0.toString()
            r2.setException(r0)
        L_0x00ee:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.mediapipeline.services.networking.implementation.NetworkClientImpl.sendRequest(com.facebook.native_bridge.NativeDataPromise, java.lang.String, java.lang.String, java.lang.String, java.lang.String[], java.lang.String[], boolean):void");
    }

    public NetworkClientImpl(C28426E0r e0r) {
        this.mWorker = e0r;
        this.mHybridData = initHybrid();
    }
}
