package X;

import android.content.Intent;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.6yg  reason: invalid class name and case insensitive filesystem */
public final class C139346yg {
    public final AnonymousClass11E A00;
    public final C219217x A01;
    public final C25291Nq A02;
    public final AnonymousClass1OX A03;
    public final AnonymousClass1OX A04;
    public final C18030ve A05;
    public final C127276e5 A06;
    public final AnonymousClass1T6 A07;
    public final AnonymousClass00H A08;
    public final C18600wl A09;
    public final C18600wl A0A;

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.02h] */
    public static final void A00(AnonymousClass1FY r23, C139346yg r24, UserJid userJid, C22821Di r26, JSONObject jSONObject) {
        String str;
        int i;
        int i2;
        int i3;
        long j;
        int i4;
        Intent intent;
        String str2;
        JSONArray jSONArray;
        boolean z;
        String optString;
        String str3 = "";
        JSONObject jSONObject2 = jSONObject;
        if (!(jSONObject == null || (optString = jSONObject2.optString("collectionId", str3)) == null)) {
            str3 = optString;
        }
        C139346yg r11 = r24;
        C18030ve r10 = r11.A05;
        C18040vf r9 = C18040vf.A02;
        int A002 = C18020vd.A00(r9, r10, 3660) * 1048576;
        if (jSONObject != null) {
            A002 = jSONObject2.optInt("maxFileSizeBytes", A002);
        }
        if (jSONObject == null || (str = jSONObject2.optString("inputType", "gallery")) == null) {
            str = "gallery";
        }
        AnonymousClass1FY r242 = r23;
        AnonymousClass05q A042 = r242.A04.A04(new C1423579d(r11, str3, str, r26, A002), new Object(), "flowsMediaPickerResultKey");
        if (jSONObject != null) {
            i = jSONObject2.optInt("maxItems", 1);
        } else {
            i = 1;
        }
        int hashCode = str.hashCode();
        if (hashCode == -1367751899) {
            if (str.equals("camera")) {
                r11.A08.get();
                i2 = 40;
                i3 = 68;
                j = 0;
                i4 = 18;
            }
            r11.A08.get();
            i2 = 40;
            i3 = 68;
            j = 0;
            i4 = 17;
        } else if (hashCode != -196315310) {
            if (hashCode == 861720859 && str.equals("document")) {
                if (jSONObject != null) {
                    jSONArray = jSONObject2.optJSONArray("allowedMimeTypes");
                } else {
                    jSONArray = null;
                }
                ArrayList A13 = AnonymousClass000.A13();
                if (jSONArray == null || jSONArray.length() <= 0) {
                    z = false;
                } else {
                    int length = jSONArray.length();
                    z = true;
                    for (int i5 = 0; i5 < length; i5++) {
                        String obj = jSONArray.get(i5).toString();
                        A13.add(obj);
                        if (obj != null && obj.equalsIgnoreCase("image/jpeg")) {
                            z = false;
                        }
                    }
                }
                r11.A08.get();
                intent = AnonymousClass1LU.A0i(r242, userJid, (String) null, (List) null, false).putExtra("max_items", i).putExtra("origin", 51).putExtra("allowed_mime_types", C17890vO.A1b(A13, 0)).putExtra("hide_choose_from_gallery", z).putExtra("choose_from_gallery_subtitle_only_photos", true).putExtra("max_file_size_mb", A002 / 1048576);
                C18070vi.A0b(intent);
                intent.putExtra("include_media", 1);
                intent.putExtra("include", 1);
                intent.putExtra("max_items", i);
                intent.putExtra("should_hide_caption_view", true);
                intent.putExtra("should_set_gallery_result", true);
                intent.putExtra("send", false);
                intent.putExtra("should_send_media", false);
                A042.A02((C1406772n) null, intent);
            }
            r11.A08.get();
            i2 = 40;
            i3 = 68;
            j = 0;
            i4 = 17;
        } else {
            if (str.equals("gallery")) {
                r11.A08.get();
                boolean A052 = C18020vd.A05(r9, r10, 7951);
                intent = C17880vN.A0A();
                String packageName = r242.getPackageName();
                if (A052) {
                    str2 = "com.whatsapp.gallerypicker.GalleryPickerBottomSheetActivity";
                } else {
                    str2 = "com.whatsapp.gallerypicker.GalleryPicker";
                }
                intent.setClassName(packageName, str2);
                intent.putExtra("max_items", i);
                intent.putExtra("skip_max_items_new_limit", true);
                intent.putExtra("preview", true);
                intent.putExtra("send", false);
                intent.putExtra("include_media", 1);
                intent.putExtra("should_send_media", false);
                intent.putExtra("should_hide_caption_view", true);
                intent.putExtra("should_set_gallery_result", true);
                intent.putExtra("origin", 51);
                intent.putExtra("media_sharing_user_journey_origin", 40);
                C18070vi.A0b(intent);
                intent.putExtra("include_media", 1);
                intent.putExtra("include", 1);
                intent.putExtra("max_items", i);
                intent.putExtra("should_hide_caption_view", true);
                intent.putExtra("should_set_gallery_result", true);
                intent.putExtra("send", false);
                intent.putExtra("should_send_media", false);
                A042.A02((C1406772n) null, intent);
            }
            r11.A08.get();
            i2 = 40;
            i3 = 68;
            j = 0;
            i4 = 17;
        }
        intent = AnonymousClass1LU.A0g(r242, (AnonymousClass1BI) null, i2, i3, (Integer) null, (Integer) null, (Integer) null, (String) null, (String) null, (List) null, i4, j, false);
        C18070vi.A0b(intent);
        intent.putExtra("include_media", 1);
        intent.putExtra("include", 1);
        intent.putExtra("max_items", i);
        intent.putExtra("should_hide_caption_view", true);
        intent.putExtra("should_set_gallery_result", true);
        intent.putExtra("send", false);
        intent.putExtra("should_send_media", false);
        A042.A02((C1406772n) null, intent);
    }

    public C139346yg(AnonymousClass11E r2, C219217x r3, C18030ve r4, C127276e5 r5, AnonymousClass1T6 r6, C25291Nq r7, AnonymousClass00H r8, C18600wl r9, C18600wl r10) {
        C18070vi.A0s(r8, r7, r6, r4);
        C18070vi.A0q(r2, r3, r9);
        C18070vi.A0d(r10, 9);
        this.A08 = r8;
        this.A02 = r7;
        this.A07 = r6;
        this.A05 = r4;
        this.A06 = r5;
        this.A00 = r2;
        this.A01 = r3;
        this.A09 = r9;
        this.A0A = r10;
        this.A04 = AnonymousClass1OW.A02(r10);
        this.A03 = AnonymousClass1OW.A02(r9);
    }

    /* JADX WARNING: type inference failed for: r16v0, types: [java.lang.Object, X.4rE] */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        X.CDX.A00(r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0056, code lost:
        if (r26 == null) goto L_0x0058;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0052 A[SYNTHETIC, Splitter:B:31:0x0052] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(android.net.Uri r42, java.lang.String r43, java.lang.String r44, java.lang.String r45, X.C22821Di r46, int r47, boolean r48) {
        /*
            r41 = this;
            r6 = 0
            r5 = 1
            r3 = 0
            r4 = r41
            r7 = r42
            java.io.ByteArrayOutputStream r8 = X.C108945cZ.A15()     // Catch:{ 2RM -> 0x0044, IOException -> 0x0040, OutOfMemoryError -> 0x0048 }
            X.1Nq r1 = r4.A02     // Catch:{ all -> 0x0039 }
            r0 = 200(0xc8, float:2.8E-43)
            android.graphics.Bitmap r2 = r1.A07(r7, r0, r0)     // Catch:{ all -> 0x0039 }
            int r1 = r2.getWidth()     // Catch:{ all -> 0x0039 }
            int r0 = r2.getHeight()     // Catch:{ all -> 0x0039 }
            if (r1 <= r0) goto L_0x001e
            r1 = r0
        L_0x001e:
            r0 = 0
            android.graphics.Bitmap r2 = X.C26511Sk.A06(r2, r0, r1)     // Catch:{ all -> 0x0039 }
            if (r2 == 0) goto L_0x002c
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ all -> 0x0039 }
            r0 = 80
            r2.compress(r1, r0, r8)     // Catch:{ all -> 0x0039 }
        L_0x002c:
            byte[] r3 = r8.toByteArray()     // Catch:{ all -> 0x0039 }
            if (r2 == 0) goto L_0x0035
            r2.recycle()     // Catch:{ all -> 0x0039 }
        L_0x0035:
            r8.close()     // Catch:{ 2RM -> 0x0044, IOException -> 0x0040, OutOfMemoryError -> 0x0048 }
            goto L_0x004e
        L_0x0039:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x003b }
        L_0x003b:
            r0 = move-exception
            X.CDX.A00(r8, r1)     // Catch:{ 2RM -> 0x0044, IOException -> 0x0040, OutOfMemoryError -> 0x0048 }
            throw r0     // Catch:{ 2RM -> 0x0044, IOException -> 0x0040, OutOfMemoryError -> 0x0048 }
        L_0x0040:
            r1 = move-exception
            java.lang.String r0 = "FlowsLogger/getImageThumb/unable to load image"
            goto L_0x004b
        L_0x0044:
            r1 = move-exception
            java.lang.String r0 = "FlowsLogger/getImageThumb/file is not an image"
            goto L_0x004b
        L_0x0048:
            r1 = move-exception
            java.lang.String r0 = "FlowsLogger/getImageThumb/out of memory when generating the thumbnail"
        L_0x004b:
            com.whatsapp.util.Log.e(r0, r1)
        L_0x004e:
            java.lang.String r1 = ""
            if (r3 == 0) goto L_0x0058
            java.lang.String r26 = android.util.Base64.encodeToString(r3, r6)     // Catch:{ Exception -> 0x005b }
            if (r26 != 0) goto L_0x0061
        L_0x0058:
            r26 = r1
            goto L_0x0061
        L_0x005b:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            r26 = r1
        L_0x0061:
            X.4rE r16 = new X.4rE
            r16.<init>()
            X.2qf r13 = new X.2qf
            r13.<init>(r6, r6, r5)
            X.4rF r3 = X.C98494rF.A00()
            java.lang.String r0 = "image"
            r3.element = r0
            X.4rF r2 = X.C98494rF.A00()
            java.lang.String r0 = "image/jpeg"
            r2.element = r0
            java.lang.String r0 = "document"
            r1 = r45
            boolean r0 = X.C18070vi.A18(r1, r0)
            r24 = r43
            r25 = r44
            r15 = r46
            r20 = r48
            if (r0 == 0) goto L_0x015d
            if (r48 != 0) goto L_0x015d
            X.6e5 r10 = r4.A06
            java.lang.String r1 = r7.getScheme()
            java.lang.String r0 = "file"
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 != 0) goto L_0x010c
            java.lang.String r9 = "_size"
            java.lang.String r1 = "_display_name"
            r0 = 2
            java.lang.String[] r8 = X.C17880vN.A1b(r1, r9, r0, r5)     // Catch:{ Exception -> 0x0108 }
            X.11C r14 = r10.A00     // Catch:{ Exception -> 0x0108 }
            X.11B r0 = r14.A0O()     // Catch:{ Exception -> 0x0108 }
            if (r0 == 0) goto L_0x010c
            android.database.Cursor r8 = r0.A02(r7, r8)     // Catch:{ Exception -> 0x0108 }
            if (r8 == 0) goto L_0x010c
            boolean r0 = r8.moveToFirst()     // Catch:{ all -> 0x0101 }
            if (r0 != r5) goto L_0x00fd
            int r1 = r8.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0101 }
            int r0 = r8.getColumnIndexOrThrow(r9)     // Catch:{ all -> 0x0101 }
            java.lang.String r11 = r8.getString(r1)     // Catch:{ all -> 0x0101 }
            long r0 = r8.getLong(r0)     // Catch:{ all -> 0x0101 }
            X.1Sl r9 = r10.A01     // Catch:{ all -> 0x0101 }
            java.io.File r9 = r9.A0k(r11, r0)     // Catch:{ all -> 0x0101 }
            r9.createNewFile()     // Catch:{ all -> 0x0101 }
            java.io.FileOutputStream r12 = X.C108945cZ.A19(r9)     // Catch:{ Exception -> 0x00f5 }
            X.11B r0 = r14.A0O()     // Catch:{ Exception -> 0x00f5 }
            if (r0 == 0) goto L_0x00f1
            java.io.InputStream r11 = r0.A07(r7)     // Catch:{ Exception -> 0x00f5 }
            if (r11 == 0) goto L_0x00f1
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r1 = new byte[r0]     // Catch:{ Exception -> 0x00f5 }
        L_0x00e7:
            int r0 = r11.read(r1)     // Catch:{ Exception -> 0x00f5 }
            if (r0 <= 0) goto L_0x00f1
            r12.write(r1, r6, r0)     // Catch:{ Exception -> 0x00f5 }
            goto L_0x00e7
        L_0x00f1:
            r12.flush()     // Catch:{ Exception -> 0x00f5 }
            goto L_0x00f9
        L_0x00f5:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ all -> 0x0101 }
        L_0x00f9:
            r8.close()     // Catch:{ Exception -> 0x0108 }
            goto L_0x0114
        L_0x00fd:
            r8.close()     // Catch:{ Exception -> 0x0108 }
            goto L_0x010c
        L_0x0101:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0103 }
        L_0x0103:
            r0 = move-exception
            X.CDX.A00(r8, r1)     // Catch:{ Exception -> 0x0108 }
            throw r0     // Catch:{ Exception -> 0x0108 }
        L_0x0108:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
        L_0x010c:
            java.lang.String r0 = r7.getPath()
            java.io.File r9 = X.C108945cZ.A17(r0)
        L_0x0114:
            X.1Sl r0 = r10.A01
            java.lang.String r1 = X.C108975cc.A0c(r7, r0)
            r2.element = r1
            X.747 r0 = X.C62272r8.A04
            int r31 = r0.A07(r9, r1)
            X.1So r34 = X.C26551So.A07
            java.lang.Object r1 = r2.element
            java.lang.String r1 = (java.lang.String) r1
            X.0ve r8 = r4.A05
            X.68e r0 = new X.68e
            r0.<init>(r8)
            r27 = 0
            r38 = r27
            r32 = r0
            r33 = r13
            r35 = r27
            r36 = r9
            r37 = r25
            r39 = r1
            r40 = r6
            X.2ta r1 = X.C63722ta.A02(r32, r33, r34, r35, r36, r37, r38, r39, r40)
            X.1OX r6 = r4.A04
            com.whatsapp.flows.webview.nativeUI.FlowsMediaPicker$startJob$mediaJobRequestData$1$1 r0 = new com.whatsapp.flows.webview.nativeUI.FlowsMediaPicker$startJob$mediaJobRequestData$1$1
            r21 = r0
            r22 = r4
            r23 = r9
            r28 = r15
            r29 = r16
            r30 = r3
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r8 = 0
            X.AnonymousClass3MX.A1Q(r0, r6)
            goto L_0x017f
        L_0x015d:
            X.1So r31 = X.C26551So.A08
            X.0ve r1 = r4.A05
            X.68e r0 = new X.68e
            r0.<init>(r1)
            r28 = 0
            r8 = 0
            r35 = r6
            r37 = r5
            r27 = r7
            r29 = r0
            r30 = r13
            r32 = r8
            r33 = r25
            r34 = r6
            r36 = r5
            X.2ta r1 = X.C63722ta.A00(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
        L_0x017f:
            X.C18070vi.A0b(r1)
            X.1T6 r6 = r4.A07
            X.34B r5 = r6.A0C(r1, r5)
            java.lang.String r0 = "mms"
            r5.A0Z = r0
            X.7Nl r1 = new X.7Nl
            r10 = r1
            r11 = r4
            r12 = r24
            r13 = r25
            r14 = r26
            r10.<init>(r11, r12, r13, r14, r15, r16)
            X.1TJ r0 = r5.A0H
            r0.A03(r1, r8)
            X.7Nf r9 = new X.7Nf
            r1 = r12
            r9.<init>(r12, r13, r15)
            X.1TJ r0 = r5.A0K
            r0.A03(r9, r8)
            X.7Nn r0 = new X.7Nn
            r19 = r47
            r17 = r2
            r18 = r3
            r12 = r5
            r13 = r1
            r14 = r25
            r9 = r0
            r10 = r7
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r5.A07(r0, r8)
            java.lang.String r0 = "flow media upload"
            r6.A0J(r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C139346yg.A01(android.net.Uri, java.lang.String, java.lang.String, java.lang.String, X.1Di, int, boolean):void");
    }
}
