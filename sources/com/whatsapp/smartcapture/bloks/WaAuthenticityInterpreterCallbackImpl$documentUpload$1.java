package com.whatsapp.smartcapture.bloks;

import X.AnonymousClass01C;
import X.AnonymousClass1OS;
import X.C18090vk;
import X.C22821Di;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.smartcapture.bloks.WaAuthenticityInterpreterCallbackImpl$documentUpload$1", f = "WaAuthenticityInterpreterCallbackImpl.kt", i = {}, l = {125}, m = "invokeSuspend", n = {}, s = {})
public final class WaAuthenticityInterpreterCallbackImpl$documentUpload$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass01C $activity;
    public final /* synthetic */ String $fileUri;
    public final /* synthetic */ String $namespace;
    public final /* synthetic */ C18090vk $onCancel;
    public final /* synthetic */ C22821Di $onFailure;
    public final /* synthetic */ C22821Di $onSuccess;
    public int label;
    public final /* synthetic */ WaAuthenticityInterpreterCallbackImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WaAuthenticityInterpreterCallbackImpl$documentUpload$1(AnonymousClass01C r2, WaAuthenticityInterpreterCallbackImpl waAuthenticityInterpreterCallbackImpl, String str, String str2, C30391dr r6, C18090vk r7, C22821Di r8, C22821Di r9) {
        super(2, r6);
        this.this$0 = waAuthenticityInterpreterCallbackImpl;
        this.$fileUri = str;
        this.$namespace = str2;
        this.$activity = r2;
        this.$onSuccess = r8;
        this.$onFailure = r9;
        this.$onCancel = r7;
    }

    public final C30391dr create(Object obj, C30391dr r11) {
        WaAuthenticityInterpreterCallbackImpl waAuthenticityInterpreterCallbackImpl = this.this$0;
        String str = this.$fileUri;
        String str2 = this.$namespace;
        return new WaAuthenticityInterpreterCallbackImpl$documentUpload$1(this.$activity, waAuthenticityInterpreterCallbackImpl, str, str2, r11, this.$onCancel, this.$onSuccess, this.$onFailure);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01a5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        X.CDX.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01a9, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01ac, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01b0, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01c3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01c7, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01ca, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:?, code lost:
        X.CDX.A00(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01dc, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:?, code lost:
        X.CDX.A00(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01e0, code lost:
        throw r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x023c A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            r22 = this;
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            r5 = r22
            int r0 = r5.label
            r1 = 1
            if (r0 == 0) goto L_0x0011
            if (r0 != r1) goto L_0x023d
            X.C30691eM.A01(r23)
        L_0x000e:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0011:
            X.C30691eM.A01(r23)
            com.whatsapp.smartcapture.bloks.WaAuthenticityInterpreterCallbackImpl r3 = r5.this$0
            java.lang.String r2 = r5.$fileUri
            java.lang.String r6 = r5.$namespace
            X.1Di r0 = r5.$onSuccess
            r21 = r0
            X.1Di r0 = r5.$onFailure
            r20 = r0
            X.0vk r0 = r5.$onCancel
            r19 = r0
            r5.label = r1
            X.00H r0 = r3.A02
            java.lang.Object r0 = r0.get()
            X.A4s r0 = (X.C20049A4s) r0
            java.lang.String r8 = r0.A02(r2)
            X.9f8 r7 = r3.A00
            r0 = 2
            X.C18070vi.A0d(r6, r0)
            java.util.UUID r14 = java.util.UUID.randomUUID()     // Catch:{ Exception -> 0x01f4 }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x01f4 }
            java.lang.String r0 = X.C197569wu.A0d     // Catch:{ Exception -> 0x01f4 }
            X.C17900vP.A0d(r0, r6, r2)     // Catch:{ Exception -> 0x01f4 }
            java.lang.String r0 = X.AnonymousClass001.A1F(r14, r2)     // Catch:{ Exception -> 0x01f4 }
            java.net.URLConnection r12 = X.AnonymousClass8BV.A0v(r0)     // Catch:{ Exception -> 0x01f4 }
            javax.net.ssl.HttpsURLConnection r12 = (javax.net.ssl.HttpsURLConnection) r12     // Catch:{ Exception -> 0x01f4 }
            X.C18070vi.A0X(r12)     // Catch:{ Exception -> 0x01f4 }
            java.lang.String r0 = "POST"
            r12.setRequestMethod(r0)     // Catch:{ Exception -> 0x01f4 }
            r12.setDoOutput(r1)     // Catch:{ Exception -> 0x01f4 }
            android.net.Uri r6 = android.net.Uri.parse(r8)     // Catch:{ Exception -> 0x01f4 }
            X.11C r0 = r7.A00     // Catch:{ Exception -> 0x01f4 }
            r18 = r0
            X.11B r0 = r18.A0O()     // Catch:{ Exception -> 0x01f4 }
            r11 = 0
            if (r0 == 0) goto L_0x01e1
            android.database.Cursor r2 = r0.A02(r6, r11)     // Catch:{ Exception -> 0x01f4 }
            if (r2 == 0) goto L_0x01e1
            boolean r0 = r2.moveToFirst()     // Catch:{ all -> 0x01da }
            if (r0 != r1) goto L_0x008c
            java.lang.String r0 = "_display_name"
            int r9 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x01da }
            java.lang.String r0 = "_size"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x01da }
            java.lang.String r9 = r2.getString(r9)     // Catch:{ all -> 0x01da }
            java.lang.Long r16 = X.C17890vO.A0M(r2, r0)     // Catch:{ all -> 0x01da }
            goto L_0x008f
        L_0x008c:
            r16 = r11
            r9 = r11
        L_0x008f:
            r2.close()     // Catch:{ Exception -> 0x01f4 }
            if (r16 == 0) goto L_0x01e1
            if (r9 == 0) goto L_0x01e1
            X.00H r0 = r7.A01     // Catch:{ Exception -> 0x01f4 }
            java.lang.Object r2 = r0.get()     // Catch:{ Exception -> 0x01f4 }
            X.1j8 r2 = (X.C33631j8) r2     // Catch:{ Exception -> 0x01f4 }
            X.1lW r0 = X.AnonymousClass9TO.A00     // Catch:{ Exception -> 0x01f4 }
            X.732 r0 = r2.A04(r0)     // Catch:{ Exception -> 0x01f4 }
            java.lang.String r10 = ""
            if (r0 == 0) goto L_0x01cf
            X.77e r0 = r0.A02     // Catch:{ Exception -> 0x01f4 }
            java.lang.Object r13 = r0.A00     // Catch:{ Exception -> 0x01f4 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ Exception -> 0x01f4 }
            if (r13 == 0) goto L_0x01cf
            if (r13 == r10) goto L_0x01cf
            java.lang.String r2 = "Content-Type"
            java.lang.StringBuilder r15 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x01f4 }
            java.lang.String r0 = "multipart/form-data; boundary=Boundary-"
            java.lang.String r0 = X.AnonymousClass001.A1E(r14, r0, r15)     // Catch:{ Exception -> 0x01f4 }
            r12.setRequestProperty(r2, r0)     // Catch:{ Exception -> 0x01f4 }
            java.lang.String r0 = "X-Entity-Name"
            r12.setRequestProperty(r0, r9)     // Catch:{ Exception -> 0x01f4 }
            java.lang.String r2 = "X-Entity-Type"
            java.lang.String r0 = "application/octet-stream"
            r12.setRequestProperty(r2, r0)     // Catch:{ Exception -> 0x01f4 }
            java.lang.String r2 = "X-Entity-Length"
            java.lang.String r0 = java.lang.String.valueOf(r16)     // Catch:{ Exception -> 0x01f4 }
            r12.setRequestProperty(r2, r0)     // Catch:{ Exception -> 0x01f4 }
            java.lang.String r2 = "Offset"
            java.lang.String r0 = "0"
            r12.setRequestProperty(r2, r0)     // Catch:{ Exception -> 0x01f4 }
            java.lang.String r9 = "Authorization"
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x01f4 }
            java.lang.String r0 = "OAuth "
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r13, r2)     // Catch:{ Exception -> 0x01f4 }
            r12.setRequestProperty(r9, r0)     // Catch:{ Exception -> 0x01f4 }
            r12.connect()     // Catch:{ Exception -> 0x01f4 }
            X.00H r0 = r7.A02     // Catch:{ Exception -> 0x01f4 }
            r17 = r0
            java.lang.Object r14 = r17.get()     // Catch:{ Exception -> 0x01f4 }
            X.9xZ r14 = (X.C197969xZ) r14     // Catch:{ Exception -> 0x01f4 }
            java.lang.String r16 = "DocumentUploadManager"
            java.lang.String r9 = "mv_doc_upload_tag"
            r13 = 946799995(0x386f057b, float:5.6987144E-5)
            X.00H r0 = r14.A00     // Catch:{ Exception -> 0x01f4 }
            X.0vd r15 = X.C17880vN.A0P(r0)     // Catch:{ Exception -> 0x01f4 }
            r2 = 9199(0x23ef, float:1.289E-41)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ Exception -> 0x01f4 }
            boolean r0 = X.C18020vd.A05(r0, r15, r2)     // Catch:{ Exception -> 0x01f4 }
            if (r0 == 0) goto L_0x011d
            X.00H r0 = r14.A01     // Catch:{ Exception -> 0x01f4 }
            java.lang.Object r2 = r0.get()     // Catch:{ Exception -> 0x01f4 }
            X.A2u r2 = (X.C20004A2u) r2     // Catch:{ Exception -> 0x01f4 }
            r0 = r16
            r2.A01(r13, r9, r0)     // Catch:{ Exception -> 0x01f4 }
        L_0x011d:
            X.11B r0 = r18.A0O()     // Catch:{ Exception -> 0x01f4 }
            if (r0 == 0) goto L_0x0128
            java.io.InputStream r6 = r0.A07(r6)     // Catch:{ Exception -> 0x01f4 }
            goto L_0x0129
        L_0x0128:
            r6 = r11
        L_0x0129:
            X.00H r14 = r7.A03     // Catch:{ all -> 0x01c8 }
            java.lang.Object r15 = r14.get()     // Catch:{ all -> 0x01c8 }
            X.181 r15 = (X.AnonymousClass181) r15     // Catch:{ all -> 0x01c8 }
            r0 = 37
            java.lang.Integer r13 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x01c8 }
            java.io.OutputStream r0 = r12.getOutputStream()     // Catch:{ all -> 0x01c8 }
            X.9He r2 = new X.9He     // Catch:{ all -> 0x01c8 }
            r2.<init>(r15, r0, r11, r13)     // Catch:{ all -> 0x01c8 }
            if (r6 == 0) goto L_0x01b1
            X.C18070vi.A0b(r2)     // Catch:{ all -> 0x01c1 }
            X.C196989vy.A00(r6, r2)     // Catch:{ all -> 0x01c1 }
            r12.getResponseMessage()     // Catch:{ all -> 0x01c1 }
            r2.close()     // Catch:{ all -> 0x01c8 }
            r6.close()     // Catch:{ Exception -> 0x01f4 }
            int r2 = r12.getResponseCode()     // Catch:{ Exception -> 0x01f4 }
            r0 = 200(0xc8, float:2.8E-43)
            if (r2 != r0) goto L_0x0216
            java.lang.Object r6 = r14.get()     // Catch:{ Exception -> 0x01f4 }
            X.181 r6 = (X.AnonymousClass181) r6     // Catch:{ Exception -> 0x01f4 }
            java.io.InputStream r0 = r12.getInputStream()     // Catch:{ Exception -> 0x01f4 }
            X.9Hb r2 = new X.9Hb     // Catch:{ Exception -> 0x01f4 }
            r2.<init>(r6, r0, r11, r13)     // Catch:{ Exception -> 0x01f4 }
            java.io.BufferedReader r6 = X.AnonymousClass8BW.A0W(r2)     // Catch:{ all -> 0x01aa }
            java.lang.StringBuilder r8 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x01a3 }
        L_0x0170:
            java.lang.String r0 = r6.readLine()     // Catch:{ all -> 0x01a3 }
            if (r0 == 0) goto L_0x017f
            r8.append(r0)     // Catch:{ all -> 0x01a3 }
            r0 = 10
            r8.append(r0)     // Catch:{ all -> 0x01a3 }
            goto L_0x0170
        L_0x017f:
            java.lang.Object r0 = r17.get()     // Catch:{ all -> 0x01a3 }
            X.9xZ r0 = (X.C197969xZ) r0     // Catch:{ all -> 0x01a3 }
            X.C197969xZ.A00(r0, r9, r1)     // Catch:{ all -> 0x01a3 }
            java.lang.String r0 = r8.toString()     // Catch:{ all -> 0x01a3 }
            org.json.JSONObject r1 = X.C17880vN.A16(r0)     // Catch:{ all -> 0x01a3 }
            java.lang.String r0 = "h"
            java.lang.String r0 = X.C108955ca.A11(r0, r1)     // Catch:{ all -> 0x01a3 }
            X.979 r8 = new X.979     // Catch:{ all -> 0x01a3 }
            r8.<init>(r0)     // Catch:{ all -> 0x01a3 }
            r6.close()     // Catch:{ all -> 0x01aa }
            r2.close()     // Catch:{ Exception -> 0x01f4 }
            goto L_0x0225
        L_0x01a3:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x01a5 }
        L_0x01a5:
            r0 = move-exception
            X.CDX.A00(r6, r1)     // Catch:{ all -> 0x01aa }
            throw r0     // Catch:{ all -> 0x01aa }
        L_0x01aa:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x01ac }
        L_0x01ac:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ Exception -> 0x01f4 }
            throw r0     // Catch:{ Exception -> 0x01f4 }
        L_0x01b1:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x01c1 }
            java.lang.String r0 = "File not found: "
            java.lang.String r1 = X.AnonymousClass001.A1H(r0, r8, r1)     // Catch:{ all -> 0x01c1 }
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch:{ all -> 0x01c1 }
            r0.<init>(r1)     // Catch:{ all -> 0x01c1 }
            throw r0     // Catch:{ all -> 0x01c1 }
        L_0x01c1:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x01c3 }
        L_0x01c3:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x01c8 }
            throw r0     // Catch:{ all -> 0x01c8 }
        L_0x01c8:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x01ca }
        L_0x01ca:
            r1 = move-exception
            X.CDX.A00(r6, r0)     // Catch:{ Exception -> 0x01f4 }
            goto L_0x01e0
        L_0x01cf:
            java.lang.String r0 = "DocumentUploadManager/uploadFile empty access token"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ Exception -> 0x01f4 }
            X.978 r8 = new X.978     // Catch:{ Exception -> 0x01f4 }
            r8.<init>(r0)     // Catch:{ Exception -> 0x01f4 }
            goto L_0x0225
        L_0x01da:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x01dc }
        L_0x01dc:
            r1 = move-exception
            X.CDX.A00(r2, r0)     // Catch:{ Exception -> 0x01f4 }
        L_0x01e0:
            throw r1     // Catch:{ Exception -> 0x01f4 }
        L_0x01e1:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x01f4 }
            java.lang.String r0 = "DocumentUploadManager/uploadFile couldn't retrieve file for "
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r8, r1)     // Catch:{ Exception -> 0x01f4 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ Exception -> 0x01f4 }
            X.978 r8 = new X.978     // Catch:{ Exception -> 0x01f4 }
            r8.<init>(r0)     // Catch:{ Exception -> 0x01f4 }
            goto L_0x0225
        L_0x01f4:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "DocumentUploadManager/uploadFile "
            java.lang.String r6 = X.AnonymousClass001.A1E(r2, r0, r1)
            com.whatsapp.util.Log.e((java.lang.String) r6)
            X.00H r0 = r7.A02
            java.lang.Object r2 = r0.get()
            X.9xZ r2 = (X.C197969xZ) r2
            r1 = 0
            java.lang.String r0 = "mv_doc_upload_tag"
            X.C197969xZ.A00(r2, r0, r1)
            X.978 r8 = new X.978
            r8.<init>(r6)
            goto L_0x0225
        L_0x0216:
            java.lang.Object r1 = r17.get()
            X.9xZ r1 = (X.C197969xZ) r1
            r0 = 0
            X.C197969xZ.A00(r1, r9, r0)
            X.978 r8 = new X.978
            r8.<init>(r10)
        L_0x0225:
            X.0wl r1 = r3.A08
            r9 = 0
            com.whatsapp.smartcapture.bloks.WaAuthenticityInterpreterCallbackImpl$documentUploadInternal$2 r0 = new com.whatsapp.smartcapture.bloks.WaAuthenticityInterpreterCallbackImpl$documentUploadInternal$2
            r6 = r0
            r7 = r8
            r8 = r3
            r10 = r19
            r11 = r21
            r12 = r20
            r6.<init>(r7, r8, r9, r10, r11, r12)
            java.lang.Object r0 = X.C30451dy.A00(r5, r1, r0)
            if (r0 != r4) goto L_0x000e
            return r4
        L_0x023d:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.smartcapture.bloks.WaAuthenticityInterpreterCallbackImpl$documentUpload$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((WaAuthenticityInterpreterCallbackImpl$documentUpload$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
