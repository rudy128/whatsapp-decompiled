package X;

import com.whatsapp.Mp4Ops;
import com.whatsapp.media.WamediaManager;
import java.io.File;
import org.json.JSONObject;

public final class DPW implements C28532E6g {
    public static int A0U;
    public static final C25035CUm A0V = new Object();
    public float A00 = 3.0f;
    public C2Z A01;
    public C28531E6f A02;
    public C1409573s A03;
    public File A04;
    public boolean A05;
    public boolean A06;
    public C28563E7p A07;
    public File A08;
    public File A09;
    public final AnonymousClass190 A0A;
    public final AnonymousClass70S A0B;
    public final AnonymousClass1NM A0C;
    public final C18030ve A0D;
    public final WamediaManager A0E;
    public final C25811CmO A0F;
    public final C25576CiG A0G;
    public final File A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final int A0K;
    public final int A0L;
    public final long A0M;
    public final long A0N;
    public final AnonymousClass118 A0O;
    public final C26431Sc A0P;
    public final AnonymousClass10I A0Q;
    public final boolean A0R;
    public volatile boolean A0S;
    public volatile boolean A0T;

    public void cancel() {
        this.A0S = true;
        C28563E7p e7p = this.A07;
        if (e7p != null) {
            e7p.cancel();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0061, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0065, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.DPW r4) {
        /*
            boolean r0 = r4.A0R
            if (r0 == 0) goto L_0x0066
            java.io.File r0 = r4.A04
            java.lang.String r0 = r0.getPath()
            X.C18070vi.A0X(r0)
            java.lang.String r3 = ".gif"
            boolean r0 = r0.endsWith(r3)
            if (r0 != 0) goto L_0x0066
            X.0ve r2 = r4.A0D
            r1 = 9020(0x233c, float:1.264E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 != 0) goto L_0x0066
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.io.File r0 = r4.A04
            java.io.File r0 = r0.getAbsoluteFile()
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r3, r1)
            java.io.File r0 = X.C108945cZ.A17(r0)
            r4.A08 = r0
            java.io.File r0 = r4.A04     // Catch:{ Exception -> 0x0066 }
            java.io.FileInputStream r3 = X.C108945cZ.A18(r0)     // Catch:{ Exception -> 0x0066 }
            java.io.File r0 = r4.A08     // Catch:{ all -> 0x005f }
            java.io.FileOutputStream r2 = X.C108945cZ.A19(r0)     // Catch:{ all -> 0x005f }
            X.C64062u9.A00(r3, r2)     // Catch:{ all -> 0x0058 }
            java.io.File r1 = r4.A08     // Catch:{ all -> 0x0058 }
            java.lang.String r0 = "null cannot be cast to non-null type java.io.File"
            X.C18070vi.A0z(r1, r0)     // Catch:{ all -> 0x0058 }
            r4.A04 = r1     // Catch:{ all -> 0x0058 }
            r2.close()     // Catch:{ all -> 0x005f }
            r3.close()     // Catch:{ Exception -> 0x0066 }
            return
        L_0x0058:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x005a }
        L_0x005a:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x005f }
            throw r0     // Catch:{ all -> 0x005f }
        L_0x005f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0061 }
        L_0x0061:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ Exception -> 0x0066 }
            throw r0     // Catch:{ Exception -> 0x0066 }
        L_0x0066:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DPW.A01(X.DPW):void");
    }

    private final void A02(File file, File file2) {
        File parentFile;
        File[] listFiles;
        if (file != null) {
            C64062u9.A0Q(file);
        }
        if (file2 != null) {
            C64062u9.A0Q(file2);
        }
        if (A03() && (parentFile = this.A0H.getParentFile()) != null && (listFiles = parentFile.listFiles()) != null) {
            for (File file3 : listFiles) {
                String name = file3.getName();
                C18070vi.A0X(name);
                if (!name.endsWith(".aud")) {
                    String name2 = file3.getName();
                    C18070vi.A0X(name2);
                    if (!name2.endsWith(".vid")) {
                    }
                }
                C64062u9.A0Q(file3);
            }
        }
    }

    private final boolean A03() {
        Integer A002 = Mp4Ops.A00();
        if (A002 == null || A002.intValue() != 1) {
            if (!C18020vd.A05(C18040vf.A02, this.A0D, 8176)) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0094, code lost:
        if (r3.exists() != false) goto L_0x0096;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04() {
        /*
            r44 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            r15 = r44
            java.io.File r14 = r15.A0H
            java.io.File r0 = r14.getAbsoluteFile()
            X.AnonymousClass8BS.A1D(r0, r1)
            java.lang.String r0 = ".h264"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            java.io.File r0 = X.C108945cZ.A17(r0)
            r15.A09 = r0
            X.70S r1 = r15.A0B
            r0 = 4
            X.64V r1 = r1.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A0A = r0
            boolean r11 = r15.A0R     // Catch:{ all -> 0x017c }
            r12 = 1
            r15.A0T = r12     // Catch:{ all -> 0x017c }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x017c }
            java.io.File r0 = r14.getAbsoluteFile()     // Catch:{ all -> 0x017c }
            X.AnonymousClass8BS.A1D(r0, r1)     // Catch:{ all -> 0x017c }
            java.lang.String r0 = ".png"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ all -> 0x017c }
            java.io.File r10 = X.C108945cZ.A17(r0)     // Catch:{ all -> 0x017c }
            boolean r0 = r15.A03()     // Catch:{ all -> 0x017c }
            if (r0 == 0) goto L_0x0096
            java.io.File r0 = r14.getAbsoluteFile()     // Catch:{ all -> 0x017c }
            java.lang.String r1 = X.C18070vi.A0H(r0)     // Catch:{ all -> 0x017c }
            java.lang.String r0 = ".mp4"
            java.lang.String r3 = ""
            r2 = 0
            java.lang.String r1 = X.AnonymousClass1YE.A07(r1, r0, r3, r2)     // Catch:{ all -> 0x017c }
            java.lang.String r0 = ".gif"
            java.lang.String r2 = X.AnonymousClass1YE.A07(r1, r0, r3, r2)     // Catch:{ all -> 0x017c }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r2)     // Catch:{ all -> 0x017c }
            java.lang.String r0 = ".aud"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ all -> 0x017c }
            java.io.File r4 = X.C108945cZ.A17(r0)     // Catch:{ all -> 0x017c }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r2)     // Catch:{ all -> 0x017c }
            java.lang.String r0 = ".vid"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ all -> 0x017c }
            java.io.File r3 = X.C108945cZ.A17(r0)     // Catch:{ all -> 0x017c }
            r4.createNewFile()     // Catch:{ IOException -> 0x0081 }
            r3.createNewFile()     // Catch:{ IOException -> 0x0081 }
            r2 = 0
            goto L_0x008a
        L_0x0081:
            r1 = move-exception
            java.lang.String r0 = "VideoTranscoder/transcodeVideoNew failed to create aud vid files"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x017c }
            r2 = 1
            goto L_0x0155
        L_0x008a:
            boolean r0 = r4.exists()     // Catch:{ all -> 0x017c }
            if (r0 == 0) goto L_0x0155
            boolean r0 = r3.exists()     // Catch:{ all -> 0x017c }
            if (r0 == 0) goto L_0x0155
        L_0x0096:
            X.CmO r9 = r15.A0F     // Catch:{ all -> 0x017c }
            boolean r0 = r9.A07     // Catch:{ all -> 0x017c }
            if (r0 != 0) goto L_0x00d8
            android.graphics.RectF r0 = r9.A02     // Catch:{ all -> 0x017c }
            if (r0 != 0) goto L_0x00d8
            java.io.File r8 = r15.A04     // Catch:{ all -> 0x017c }
            r1 = 0
            r27 = 1
            X.BVz r0 = new X.BVz     // Catch:{ all -> 0x017c }
            r0.<init>(r15, r10, r12, r12)     // Catch:{ all -> 0x017c }
            int r7 = r9.A01     // Catch:{ all -> 0x017c }
            int r6 = r9.A00     // Catch:{ all -> 0x017c }
            boolean r5 = r9.A05     // Catch:{ all -> 0x017c }
            X.73s r12 = r15.A03     // Catch:{ all -> 0x017c }
            boolean r4 = r9.A09     // Catch:{ all -> 0x017c }
            java.lang.String r3 = r9.A04     // Catch:{ all -> 0x017c }
            X.6rN r2 = r9.A03     // Catch:{ all -> 0x017c }
        L_0x00b8:
            r30 = 0
            r26 = r5
            r28 = r11
            r29 = r4
            r23 = r3
            r24 = r7
            r25 = r6
            r20 = r8
            r21 = r14
            r22 = r10
            r17 = r0
            r18 = r12
            r19 = r2
            r16 = r1
            r15.A00(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)     // Catch:{ all -> 0x017c }
            goto L_0x0146
        L_0x00d8:
            boolean r0 = r9.A06     // Catch:{ all -> 0x017c }
            if (r0 == 0) goto L_0x00f6
            java.io.File r8 = r15.A04     // Catch:{ all -> 0x017c }
            X.BVz r0 = new X.BVz     // Catch:{ all -> 0x017c }
            r0.<init>(r15, r10, r12, r12)     // Catch:{ all -> 0x017c }
            int r7 = r9.A01     // Catch:{ all -> 0x017c }
            int r6 = r9.A00     // Catch:{ all -> 0x017c }
            boolean r5 = r9.A05     // Catch:{ all -> 0x017c }
            android.graphics.RectF r1 = r9.A02     // Catch:{ all -> 0x017c }
            X.73s r12 = r15.A03     // Catch:{ all -> 0x017c }
            boolean r4 = r9.A09     // Catch:{ all -> 0x017c }
            java.lang.String r3 = r9.A04     // Catch:{ all -> 0x017c }
            X.6rN r2 = r9.A03     // Catch:{ all -> 0x017c }
            r27 = 0
            goto L_0x00b8
        L_0x00f6:
            X.1NM r1 = r15.A0C     // Catch:{ all -> 0x017c }
            java.io.File r0 = r15.A04     // Catch:{ all -> 0x017c }
            java.io.File r8 = r1.A01(r0)     // Catch:{ all -> 0x017c }
            X.C18070vi.A0X(r8)     // Catch:{ all -> 0x017c }
            java.io.File r13 = r15.A04     // Catch:{ all -> 0x017c }
            r1 = 2
            X.BVz r0 = new X.BVz     // Catch:{ all -> 0x017c }
            r0.<init>(r15, r10, r12, r1)     // Catch:{ all -> 0x017c }
            int r7 = r9.A01     // Catch:{ all -> 0x017c }
            int r6 = r9.A00     // Catch:{ all -> 0x017c }
            boolean r5 = r9.A05     // Catch:{ all -> 0x017c }
            boolean r4 = r9.A09     // Catch:{ all -> 0x017c }
            java.lang.String r3 = r9.A04     // Catch:{ all -> 0x017c }
            X.6rN r2 = r9.A03     // Catch:{ all -> 0x017c }
            r29 = 0
            r27 = 1
            r43 = r12
            r28 = r15
            r30 = r0
            r31 = r29
            r32 = r2
            r33 = r13
            r34 = r8
            r35 = r10
            r36 = r3
            r37 = r7
            r38 = r6
            r39 = r5
            r40 = r12
            r41 = r11
            r42 = r4
            r28.A00(r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43)     // Catch:{ all -> 0x017c }
            X.BVz r0 = new X.BVz     // Catch:{ all -> 0x017c }
            r0.<init>(r15, r10, r1, r1)     // Catch:{ all -> 0x017c }
            android.graphics.RectF r1 = r9.A02     // Catch:{ all -> 0x017c }
            X.73s r12 = r15.A03     // Catch:{ all -> 0x017c }
            r11 = 0
            goto L_0x00b8
        L_0x0146:
            java.io.File r1 = r15.A09
            java.io.File r0 = r15.A08
            r15.A02(r1, r0)
            boolean r0 = r15.A0S
            if (r0 == 0) goto L_0x0154
            X.C64062u9.A0Q(r14)
        L_0x0154:
            return
        L_0x0155:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x017c }
            java.lang.String r0 = "Failed to create temp files .vid:"
            r1.append(r0)     // Catch:{ all -> 0x017c }
            boolean r0 = r3.exists()     // Catch:{ all -> 0x017c }
            r1.append(r0)     // Catch:{ all -> 0x017c }
            java.lang.String r0 = " | .aud:"
            r1.append(r0)     // Catch:{ all -> 0x017c }
            boolean r0 = r4.exists()     // Catch:{ all -> 0x017c }
            r1.append(r0)     // Catch:{ all -> 0x017c }
            java.lang.String r0 = " | create:"
            java.lang.String r0 = X.C17900vP.A0D(r0, r1, r2)     // Catch:{ all -> 0x017c }
            java.io.IOException r0 = X.C17880vN.A0f(r0)     // Catch:{ all -> 0x017c }
            throw r0     // Catch:{ all -> 0x017c }
        L_0x017c:
            r2 = move-exception
            java.io.File r1 = r15.A09
            java.io.File r0 = r15.A08
            r15.A02(r1, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DPW.A04():void");
    }

    /* JADX WARNING: type inference failed for: r0v19, types: [X.CiG, java.lang.Object] */
    public DPW(AnonymousClass190 r31, AnonymousClass70S r32, AnonymousClass1NM r33, AnonymousClass118 r34, C18030ve r35, WamediaManager wamediaManager, C26431Sc r37, C25811CmO cmO, AnonymousClass10I r39, File file, File file2, int i, int i2, long j, long j2, boolean z) {
        C25020CTw cTw;
        this.A0O = r34;
        C18030ve r5 = r35;
        this.A0D = r5;
        this.A0Q = r39;
        this.A0P = r37;
        WamediaManager wamediaManager2 = wamediaManager;
        this.A0E = wamediaManager2;
        this.A0C = r33;
        this.A04 = file;
        this.A0H = file2;
        long j3 = j;
        this.A0M = j3;
        long j4 = j2;
        this.A0N = j4;
        this.A0F = cmO;
        this.A0L = i;
        this.A0K = i2;
        this.A0R = z;
        this.A0B = r32;
        this.A0A = r31;
        C18040vf r4 = C18040vf.A02;
        this.A0I = C18020vd.A05(r4, r5, 8201);
        if (j2 <= 0 || j != j2) {
            A01(this);
            boolean A052 = C18020vd.A05(r4, r5, 8874);
            this.A0J = A052;
            JSONObject A0J2 = r5.A0J(8203);
            double optDouble = A0J2.optDouble("intercept", 17.2294d);
            double optDouble2 = A0J2.optDouble("coeff_ratio_of_src_target_bitrate", -0.029d);
            double optDouble3 = A0J2.optDouble("coeff_ar_class_v2_log", 0.104d);
            double optDouble4 = A0J2.optDouble("coeff_target_bitrate_bps_log", 2.219d);
            double optDouble5 = A0J2.optDouble("coeff_ratio_of_src_target_resolution", -1.707d);
            double optDouble6 = A0J2.optDouble("coeff_src_resolution_log", 3.461d);
            A0J2.optDouble("coeff_is_target_codec_hevc", 3.497d);
            A0J2.optDouble("coeff_is_target_hdr", 3.682d);
            A0J2.optDouble("coeff_is_passthrough_upload", 0.741d);
            C25009CTj cTj = new C25009CTj(optDouble, optDouble6, optDouble3, optDouble4, A0J2.optDouble("coeff_key_frame_size_log", 0.0d), A0J2.optDouble("coeff_partial_frame_size_log", 0.0d), A0J2.optDouble("coeff_frame_rate_log", -0.667d), optDouble2, optDouble5);
            if (A052) {
                JSONObject A0J3 = r5.A0J(8204);
                double optDouble7 = A0J3.optDouble("v2_intercept", 33.49d);
                A0J3.optDouble("v2_coeff_is_hdr", 3.5426d);
                cTw = new C25020CTw(optDouble7, A0J3.optDouble("v2_coeff_source_bitrate_sigmoid", 3.2071d), A0J3.optDouble("v2_coeff_source_framerate", 0.1451d), A0J3.optDouble("v2_coeff_source_resolution_sigmoid", 9.7525d), A0J3.optDouble("v2_coeff_source_to_upload_bitrate_sigmoid", 3.3998d), A0J3.optDouble("v2_coeff_spatial_ssim_pow", -0.829d), A0J3.optDouble("v2_coeff_upload_framerate", 5.0E-4d), A0J3.optDouble("v2_coeff_upload_resolution_sigmoid", 16.1976d), A0J3.optDouble("v2_power_transform_exponent_spatial_ssim", 43.5d), A0J3.optDouble("v2_power_transform_scale", 1000.0d));
            } else {
                cTw = null;
            }
            ? obj = new Object();
            obj.A00 = cTj;
            obj.A01 = cTw;
            this.A0G = obj;
            wamediaManager2.ensureWamediaManagerStarted();
            return;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("timeFrom:");
        A10.append(j3);
        throw AnonymousClass000.A0k(C17890vO.A0a(" timeTo:", A10, j4));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v3, resolved type: X.CWZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v1, resolved type: X.E7l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v4, resolved type: X.CWZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v2, resolved type: X.E7l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v3, resolved type: X.E7l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: X.DGq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v23, resolved type: X.DGq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v24, resolved type: X.DGq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v7, resolved type: X.E7l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v8, resolved type: X.E7l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v7, resolved type: X.CWZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v92, resolved type: X.DHG} */
    /* JADX WARNING: type inference failed for: r15v0, types: [X.DGX, java.lang.Object, X.E7l] */
    /* JADX WARNING: type inference failed for: r7v0, types: [boolean, int] */
    /* JADX WARNING: type inference failed for: r2v3, types: [X.DGu, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v42, types: [X.E7s] */
    /* JADX WARNING: type inference failed for: r32v1, types: [X.E54, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r34v1, types: [X.CAM, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v9, types: [X.DGt, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r29v1, types: [java.lang.Object, X.CAH] */
    /* JADX WARNING: type inference failed for: r8v10, types: [X.DHW, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r28v1, types: [java.lang.Object, X.CdW] */
    /* JADX WARNING: type inference failed for: r10v12, types: [X.E7q, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v29, types: [X.DGt, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v165, types: [com.facebook.videolite.transcoder.base.composition.MediaEffect, X.BW6] */
    /* JADX WARNING: type inference failed for: r7v14, types: [X.CXD, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v29, types: [X.CRR, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v91 */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0293, code lost:
        if (X.C18020vd.A05(r1, r0, 10027) == false) goto L_0x0295;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x05f1, code lost:
        if (X.C18020vd.A05(r23, r49, 11636) == false) goto L_0x02cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0619, code lost:
        if (r41 != false) goto L_0x061b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x07e2, code lost:
        if (X.C18020vd.A05(r23, r49, 8043) == false) goto L_0x07e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0161, code lost:
        if (r4 == 180) goto L_0x0163;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x027b, code lost:
        if (r5.A05 != false) goto L_0x027d;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0346  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0370 A[SYNTHETIC, Splitter:B:142:0x0370] */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x0593  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x05e5  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x05ff A[LOOP:17: B:229:0x05f9->B:231:0x05ff, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x0618  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x0649  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x0652  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x0660  */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x067f A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x069d  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x06ab  */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x06b2  */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x06c2  */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x06d3  */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x06f5  */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x070c  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x0713  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x071f  */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x0739 A[Catch:{ all -> 0x0796 }] */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x0755 A[Catch:{ all -> 0x0796 }] */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x075c A[Catch:{ all -> 0x0796 }] */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x0765 A[Catch:{ all -> 0x0796 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A00(android.graphics.RectF r53, X.C26867DGy r54, X.C1409573s r55, X.C134926rN r56, java.io.File r57, java.io.File r58, java.io.File r59, java.lang.String r60, int r61, int r62, boolean r63, boolean r64, boolean r65, boolean r66, boolean r67) {
        /*
            r52 = this;
            r5 = r52
            X.0ve r0 = r5.A0D
            r49 = r0
            r2 = 10149(0x27a5, float:1.4222E-41)
            X.0vf r23 = X.C18040vf.A02
            r1 = r23
            boolean r0 = X.C18020vd.A05(r1, r0, r2)
            if (r0 == 0) goto L_0x002a
            java.lang.String r0 = "VideoTranscoder/transcode/mediaTranscodingAATestEnabled"
        L_0x0014:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r2 = 7412(0x1cf4, float:1.0386E-41)
            r0 = r49
            boolean r19 = X.C18020vd.A05(r1, r0, r2)
            r50 = r58
            if (r19 == 0) goto L_0x0030
            boolean r0 = r50.exists()
            if (r0 != 0) goto L_0x0030
            goto L_0x002d
        L_0x002a:
            java.lang.String r0 = "VideoTranscoder/transcode/mediaTranscodingAATestDisabled"
            goto L_0x0014
        L_0x002d:
            r50.createNewFile()     // Catch:{ IOException -> 0x0030 }
        L_0x0030:
            X.118 r0 = r5.A0O
            android.content.Context r0 = r0.A00
            r48 = r0
            X.C18070vi.A0X(r48)
            X.DGX r15 = new X.DGX
            r15.<init>()
            int r1 = r5.A0L
            int r0 = r5.A0K
            r31 = r0
            float r14 = r5.A00
            X.70S r13 = r5.A0B
            r3 = 8074(0x1f8a, float:1.1314E-41)
            r2 = r23
            r0 = r49
            boolean r24 = X.C18020vd.A05(r2, r0, r3)
            X.CmO r0 = r5.A0F
            boolean r0 = r0.A08
            r21 = r0
            r11 = 0
            r51 = r57
            boolean r7 = X.AnonymousClass8BU.A1X(r51)
            java.lang.Integer r1 = X.C50322Tz.A00(r1)
            r22 = r65
            if (r65 != 0) goto L_0x00ca
            if (r0 != 0) goto L_0x00ca
            java.lang.String r2 = r51.getPath()
            r0 = r48
            X.CXd r8 = X.C25872Cng.A01(r0, r2)
        L_0x0073:
            if (r8 == 0) goto L_0x08d6
            r3 = 0
            int r2 = r8.A02
            r0 = 7
            if (r2 == r0) goto L_0x007e
            r0 = 6
            if (r2 != r0) goto L_0x007f
        L_0x007e:
            r3 = 1
        L_0x007f:
            X.64V r0 = r13.A01
            r47 = r0
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r3)
            r0.A06 = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r61)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r62)
            X.ClM r2 = X.C26431Sc.A06(r8, r1, r2, r0)
            int r10 = r2.A0A
            int r9 = r2.A08
            r20 = r53
            if (r21 != 0) goto L_0x0206
            r18 = 3
            r17 = 7
            r12 = r55
            if (r55 == 0) goto L_0x018b
            android.graphics.Bitmap r6 = X.BE8.A0J(r10, r9)
            android.graphics.Canvas r4 = new android.graphics.Canvas
            r4.<init>(r6)
            java.util.List r0 = r12.A04
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            java.util.Iterator r16 = r0.iterator()
        L_0x00b8:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x00dc
            java.lang.Object r1 = r16.next()
            boolean r0 = r1 instanceof X.AnonymousClass69W
            if (r0 == 0) goto L_0x00b8
            r3.add(r1)
            goto L_0x00b8
        L_0x00ca:
            X.DGu r2 = new X.DGu     // Catch:{ Exception -> 0x08e1 }
            r2.<init>()     // Catch:{ Exception -> 0x08e1 }
            java.lang.String r0 = r51.getPath()     // Catch:{ Exception -> 0x08e1 }
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch:{ Exception -> 0x08e1 }
            X.CXd r8 = r2.BKv(r0)     // Catch:{ Exception -> 0x08e1 }
            goto L_0x0073
        L_0x00dc:
            java.util.Iterator r1 = r3.iterator()
        L_0x00e0:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00f0
            java.lang.Object r0 = r1.next()
            X.73u r0 = (X.C1409773u) r0
            r0.A0N(r4)
            goto L_0x00e0
        L_0x00f0:
            r29 = r11
            r30 = r11
            r25 = r12
            r26 = r6
            r27 = r4
            r28 = r11
            r25.A09(r26, r27, r28, r29, r30)
            java.util.List r0 = r12.A04
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            java.util.Iterator r16 = r0.iterator()
        L_0x0109:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x011d
            java.lang.Object r1 = r16.next()
            boolean r0 = r1 instanceof X.AnonymousClass69W
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0109
            r3.add(r1)
            goto L_0x0109
        L_0x011d:
            java.util.Iterator r16 = r3.iterator()
        L_0x0121:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0144
            java.lang.Object r3 = r16.next()
            X.73u r3 = (X.C1409773u) r3
            boolean r0 = r3 instanceof X.AnonymousClass69V
            if (r0 == 0) goto L_0x0140
            r1 = r3
            X.69V r1 = (X.AnonymousClass69V) r1
            X.70B r0 = r1.A04
            boolean r0 = r0 instanceof X.C1196869l
            if (r0 == 0) goto L_0x0140
            X.69K r0 = r12.A04()
            r1.A03 = r0
        L_0x0140:
            r3.A0N(r4)
            goto L_0x0121
        L_0x0144:
            android.graphics.Bitmap$CompressFormat r3 = android.graphics.Bitmap.CompressFormat.PNG
            java.io.FileOutputStream r1 = X.C108945cZ.A19(r59)
            r0 = 100
            r6.compress(r3, r0, r1)
            r1.close()
            android.net.Uri r0 = android.net.Uri.fromFile(r59)
            X.C18070vi.A0X(r0)
            int r4 = r8.A04
            r3 = 180(0xb4, float:2.52E-43)
            if (r4 == 0) goto L_0x0163
            float r6 = (float) r9
            float r1 = (float) r10
            if (r4 != r3) goto L_0x0165
        L_0x0163:
            float r6 = (float) r10
            float r1 = (float) r9
        L_0x0165:
            float r6 = r6 / r1
            int r4 = r4 % r3
            if (r4 == 0) goto L_0x016d
            r1 = 1065353216(0x3f800000, float:1.0)
            float r6 = r1 / r6
        L_0x016d:
            X.DRN r8 = r15.Bhn(r0)
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r8 == 0) goto L_0x0198
            java.lang.Object r1 = r8.A05()     // Catch:{ all -> 0x0187 }
            X.C18070vi.A0X(r1)     // Catch:{ all -> 0x0187 }
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1     // Catch:{ all -> 0x0187 }
            int r3 = r1.getHeight()     // Catch:{ all -> 0x0187 }
            int r1 = r1.getWidth()     // Catch:{ all -> 0x0187 }
            goto L_0x018e
        L_0x0187:
            r8.close()
            goto L_0x0198
        L_0x018b:
            X.0wS r0 = X.C18460wS.A00
            goto L_0x01fe
        L_0x018e:
            r8.close()
            if (r1 <= 0) goto L_0x0198
            if (r3 <= 0) goto L_0x0198
            float r4 = (float) r1
            float r1 = (float) r3
            float r4 = r4 / r1
        L_0x0198:
            X.CRR r3 = new X.CRR
            r3.<init>()
            java.lang.String r0 = r0.toString()
            r3.A02 = r0
            r1 = 1065353216(0x3f800000, float:1.0)
            r3.A01 = r1
            r0 = 0
            int r8 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r8 <= 0) goto L_0x01af
            float r1 = r1 * r6
            float r0 = r1 / r4
        L_0x01af:
            r3.A00 = r0
            r0 = r64
            r3.A03 = r0
            X.CRS r12 = new X.CRS
            r12.<init>(r3)
            r0 = r65 ^ 1
            X.DGS r8 = new X.DGS
            r8.<init>(r0)
            r6 = 2
            if (r53 == 0) goto L_0x01f1
            r0 = 8
            float[] r4 = new float[r0]
            r0 = r20
            float r3 = r0.left
            r4[r11] = r3
            float r1 = r0.bottom
            r4[r7] = r1
            float r0 = r0.right
            r4[r6] = r0
            r4[r18] = r1
            r1 = 4
            r4[r1] = r3
            r3 = 5
            r1 = r20
            float r1 = r1.top
            r4[r3] = r1
            r3 = 6
            r4[r3] = r0
            r4[r17] = r1
            X.ChL r0 = r8.A04
            java.nio.FloatBuffer r0 = r0.A01
            r0.put(r4)
            r0.position(r11)
        L_0x01f1:
            X.DGR r0 = new X.DGR
            r0.<init>(r15, r12)
            X.E9y[] r1 = new X.C28607E9y[r6]
            r1[r11] = r8
            java.util.List r0 = X.C18070vi.A0O(r0, r1, r7)
        L_0x01fe:
            boolean r1 = X.AnonymousClass000.A1a(r0)
            if (r1 == 0) goto L_0x0206
            r2.A0H = r0
        L_0x0206:
            r1 = 30
            if (r65 == 0) goto L_0x021e
            int r0 = r10 * r9
            float r0 = (float) r0
            r1 = 1209401344(0x48160000, float:153600.0)
            float r1 = r1 / r0
            r0 = 1092616192(0x41200000, float:10.0)
            float r1 = java.lang.Math.min(r0, r1)
            r0 = 1073741824(0x40000000, float:2.0)
            float r14 = java.lang.Math.max(r0, r1)
            r1 = 15
        L_0x021e:
            int r10 = r10 * r9
            float r0 = (float) r10
            float r0 = r0 * r14
            int r3 = (int) r0
            r0 = r31
            int r0 = java.lang.Math.min(r0, r3)
            r2.A09 = r11
            r3 = r63 ^ 1
            r2.A0K = r3
            r3 = 10
            r2.A02 = r3
            r2.A01 = r1
            r2.A00 = r0
            r2.A0I = r7
            if (r24 == 0) goto L_0x0245
            X.Bzp r3 = X.C24354Bzp.CODEC_VIDEO_H264
            r1 = 256(0x100, float:3.59E-43)
            X.Cab r0 = new X.Cab
            r0.<init>(r3, r7, r1)
            r2.A0E = r0
        L_0x0245:
            X.CiG r0 = r5.A0G
            if (r0 == 0) goto L_0x024b
            r0.A02 = r2
        L_0x024b:
            int r1 = r2.A0A
            int r0 = r2.A08
            r13.A04(r1, r0)
            int r0 = r2.A00()
            long r0 = (long) r0
            r8 = 0
            int r3 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r3 <= 0) goto L_0x0269
            long r0 = X.C17880vN.A04(r0)
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            r0 = r47
            r0.A0Y = r1
        L_0x0269:
            X.10I r0 = r5.A0Q
            r46 = r0
            long r0 = r5.A0M
            r17 = r0
            long r3 = r5.A0N
            boolean r0 = r5.A06
            if (r0 != 0) goto L_0x027d
            boolean r0 = r5.A05
            r44 = 0
            if (r0 == 0) goto L_0x027f
        L_0x027d:
            r44 = 1
        L_0x027f:
            r6 = 3768(0xeb8, float:5.28E-42)
            r1 = r23
            r0 = r49
            boolean r43 = X.C18020vd.A05(r1, r0, r6)
            if (r66 != 0) goto L_0x0295
            r6 = 10027(0x272b, float:1.4051E-41)
            boolean r0 = X.C18020vd.A05(r1, r0, r6)
            r42 = 1
            if (r0 != 0) goto L_0x0297
        L_0x0295:
            r42 = 0
        L_0x0297:
            r45 = r56
            if (r56 == 0) goto L_0x0366
            r6 = 10024(0x2728, float:1.4047E-41)
            r0 = r49
            boolean r0 = X.C18020vd.A05(r1, r0, r6)
            if (r0 == 0) goto L_0x0366
            r41 = 1
            if (r21 == 0) goto L_0x0368
            X.Cac r6 = new X.Cac
            r6.<init>()
            X.BzJ r0 = X.C24322BzJ.VIDEO
            X.CqR r9 = new X.CqR
            r9.<init>(r0)
            X.CXD r8 = new X.CXD
            r0 = r51
            r8.<init>(r0)
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0 = 15000(0x3a98, double:7.411E-320)
            long r0 = r10.toMicros(r0)
            r8.A02 = r0
            r8.A00 = r7
            X.CcJ r0 = r8.A00()
            X.C25833Cmm.A00(r6, r9, r0)
        L_0x02cf:
            r11 = 0
            if (r21 == 0) goto L_0x0352
            r3 = 15000(0x3a98, double:7.411E-320)
        L_0x02d5:
            if (r56 == 0) goto L_0x0332
            r0 = r45
            X.77c r0 = r0.A00
            java.lang.String r1 = r0.A0A
            if (r1 == 0) goto L_0x0332
            r0 = r45
            java.lang.Long r0 = r0.A01
            if (r0 == 0) goto L_0x02e9
            long r11 = r0.longValue()
        L_0x02e9:
            long r3 = r3 + r11
            if (r44 == 0) goto L_0x02fb
            X.BzJ r7 = X.C24322BzJ.AUDIO
            java.util.HashMap r0 = r6.A02
            java.lang.Object r0 = r0.get(r7)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 == 0) goto L_0x02fb
            r0.clear()
        L_0x02fb:
            X.BzJ r0 = X.C24322BzJ.AUDIO
            X.CqR r8 = new X.CqR
            r8.<init>(r0)
            java.net.URL r9 = new java.net.URL
            r9.<init>(r1)
            X.CXD r7 = new X.CXD
            r7.<init>()
            r0 = 0
            r7.A03 = r0
            r7.A06 = r0
            r0 = -1
            r7.A02 = r0
            r7.A01 = r0
            r0 = -1
            r7.A00 = r0
            X.By8 r0 = X.C24250By8.UNKNOWN
            r7.A04 = r0
            r7.A06 = r9
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.MILLISECONDS
            X.A5W r0 = new X.A5W
            r9 = r0
            r13 = r3
            r9.<init>(r10, r11, r13)
            r7.A03 = r0
            X.CcJ r0 = r7.A00()
            X.C25833Cmm.A00(r6, r8, r0)
        L_0x0332:
            if (r42 == 0) goto L_0x0616
            java.util.List r0 = r2.A0H
            if (r0 == 0) goto L_0x0616
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            java.util.Iterator r3 = r0.iterator()
        L_0x0340:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x05f5
            java.lang.Object r1 = r3.next()
            boolean r0 = r1 instanceof X.DGR
            if (r0 == 0) goto L_0x0340
            r4.add(r1)
            goto L_0x0340
        L_0x0352:
            long r3 = r3 - r17
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            int r0 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r0 <= 0) goto L_0x0360
            if (r1 == 0) goto L_0x0360
            goto L_0x02d5
        L_0x0360:
            long r3 = X.C26511Sk.A05(r51)
            goto L_0x02d5
        L_0x0366:
            r41 = 0
        L_0x0368:
            if (r60 == 0) goto L_0x0593
            int r0 = r60.length()
            if (r0 == 0) goto L_0x0593
            org.json.JSONObject r40 = X.C17880vN.A16(r60)     // Catch:{ Exception -> 0x08cf }
            java.lang.String r1 = "mTypeToTracksMap"
            r0 = r40
            org.json.JSONArray r38 = r0.getJSONArray(r1)     // Catch:{ Exception -> 0x08cf }
            java.util.HashMap r37 = X.C17880vN.A11()     // Catch:{ Exception -> 0x08cf }
            r10 = 0
        L_0x0381:
            int r0 = r38.length()     // Catch:{ Exception -> 0x08cf }
            if (r10 >= r0) goto L_0x04f3
            r0 = r38
            org.json.JSONObject r6 = r0.getJSONObject(r10)     // Catch:{ Exception -> 0x08cf }
            java.lang.String r0 = "TrackType"
            int r1 = r6.getInt(r0)     // Catch:{ Exception -> 0x08cf }
            r0 = 1
            if (r1 == r0) goto L_0x039c
            r0 = 2
            if (r1 == r0) goto L_0x039f
            X.BzJ r9 = X.C24322BzJ.MIXED     // Catch:{ Exception -> 0x08cf }
            goto L_0x03a1
        L_0x039c:
            X.BzJ r9 = X.C24322BzJ.AUDIO     // Catch:{ Exception -> 0x08cf }
            goto L_0x03a1
        L_0x039f:
            X.BzJ r9 = X.C24322BzJ.VIDEO     // Catch:{ Exception -> 0x08cf }
        L_0x03a1:
            java.lang.String r0 = "TrackMap"
            org.json.JSONArray r36 = r6.getJSONArray(r0)     // Catch:{ Exception -> 0x08cf }
            int r35 = r36.length()     // Catch:{ Exception -> 0x08cf }
            java.util.HashMap r34 = X.C17880vN.A11()     // Catch:{ Exception -> 0x08cf }
            r8 = 0
        L_0x03b0:
            r0 = r35
            if (r8 >= r0) goto L_0x04e8
            r0 = r36
            org.json.JSONObject r1 = r0.getJSONObject(r8)     // Catch:{ Exception -> 0x08cf }
            java.lang.String r0 = "TrackIndex"
            int r33 = r1.getInt(r0)     // Catch:{ Exception -> 0x08cf }
            java.lang.String r0 = "MediaTrackComposition"
            org.json.JSONObject r7 = r1.getJSONObject(r0)     // Catch:{ Exception -> 0x08cf }
            java.lang.String r0 = "mName"
            java.lang.String r32 = r7.getString(r0)     // Catch:{ Exception -> 0x08cf }
            java.lang.String r0 = "mStartAtTimeUs"
            long r30 = r7.getLong(r0)     // Catch:{ Exception -> 0x08cf }
            java.lang.String r0 = "mTrackType"
            int r1 = r7.getInt(r0)     // Catch:{ Exception -> 0x08cf }
            r0 = 1
            if (r1 == r0) goto L_0x03e1
            r0 = 2
            if (r1 == r0) goto L_0x03e4
            X.BzJ r11 = X.C24322BzJ.MIXED     // Catch:{ Exception -> 0x08cf }
            goto L_0x03e6
        L_0x03e1:
            X.BzJ r11 = X.C24322BzJ.AUDIO     // Catch:{ Exception -> 0x08cf }
            goto L_0x03e6
        L_0x03e4:
            X.BzJ r11 = X.C24322BzJ.VIDEO     // Catch:{ Exception -> 0x08cf }
        L_0x03e6:
            java.lang.String r0 = "mSegments"
            org.json.JSONArray r29 = r7.getJSONArray(r0)     // Catch:{ Exception -> 0x08cf }
            int r28 = r29.length()     // Catch:{ Exception -> 0x08cf }
            java.util.ArrayList r27 = X.AnonymousClass000.A13()     // Catch:{ Exception -> 0x08cf }
            r12 = 0
        L_0x03f5:
            r0 = r28
            if (r12 >= r0) goto L_0x0462
            r0 = r29
            org.json.JSONObject r1 = r0.getJSONObject(r12)     // Catch:{ Exception -> 0x08cf }
            java.lang.String r0 = "mSourceFile"
            java.lang.String r13 = r1.optString(r0)     // Catch:{ Exception -> 0x08cf }
            int r0 = r13.length()     // Catch:{ Exception -> 0x08cf }
            r6 = 0
            if (r0 != 0) goto L_0x040f
            r26 = r6
            goto L_0x0413
        L_0x040f:
            java.io.File r26 = X.C108945cZ.A17(r13)     // Catch:{ Exception -> 0x08cf }
        L_0x0413:
            java.lang.String r0 = "mUrl"
            java.lang.String r0 = r1.optString(r0)     // Catch:{ Exception -> 0x08cf }
            int r13 = r0.length()     // Catch:{ Exception -> 0x08cf }
            if (r13 == 0) goto L_0x0424
            java.net.URL r6 = new java.net.URL     // Catch:{ Exception -> 0x08cf }
            r6.<init>(r0)     // Catch:{ Exception -> 0x08cf }
        L_0x0424:
            java.lang.String r0 = "mSourceTimeRange"
            org.json.JSONObject r0 = r1.getJSONObject(r0)     // Catch:{ Exception -> 0x08cf }
            X.A5W r25 = X.A5W.A00(r0)     // Catch:{ Exception -> 0x08cf }
            java.lang.String r0 = "mPhotoDurationUs"
            long r15 = r1.getLong(r0)     // Catch:{ Exception -> 0x08cf }
            java.lang.String r0 = "mOutputFps"
            int r24 = r1.getInt(r0)     // Catch:{ Exception -> 0x08cf }
            java.lang.String r0 = "mMediaOriginalDurationMs"
            int r0 = r1.getInt(r0)     // Catch:{ Exception -> 0x08cf }
            long r13 = (long) r0     // Catch:{ Exception -> 0x08cf }
            X.CXD r1 = new X.CXD     // Catch:{ Exception -> 0x08cf }
            r0 = r26
            r1.<init>(r0)     // Catch:{ Exception -> 0x08cf }
            r0 = r25
            r1.A03 = r0     // Catch:{ Exception -> 0x08cf }
            r1.A02 = r15     // Catch:{ Exception -> 0x08cf }
            r0 = r24
            r1.A00 = r0     // Catch:{ Exception -> 0x08cf }
            r1.A06 = r6     // Catch:{ Exception -> 0x08cf }
            r1.A01 = r13     // Catch:{ Exception -> 0x08cf }
            X.CcJ r1 = r1.A00()     // Catch:{ Exception -> 0x08cf }
            r0 = r27
            r0.add(r1)     // Catch:{ Exception -> 0x08cf }
            int r12 = r12 + 1
            goto L_0x03f5
        L_0x0462:
            X.CqR r6 = new X.CqR     // Catch:{ Exception -> 0x08cf }
            r12 = r32
            r0 = r30
            r6.<init>(r11, r12, r0)     // Catch:{ Exception -> 0x08cf }
            java.util.Iterator r11 = r27.iterator()     // Catch:{ Exception -> 0x08cf }
        L_0x046f:
            boolean r0 = r11.hasNext()     // Catch:{ Exception -> 0x08cf }
            if (r0 == 0) goto L_0x0481
            java.lang.Object r1 = r11.next()     // Catch:{ Exception -> 0x08cf }
            X.CcJ r1 = (X.C25271CcJ) r1     // Catch:{ Exception -> 0x08cf }
            java.util.List r0 = r6.A04     // Catch:{ Exception -> 0x08cf }
            r0.add(r1)     // Catch:{ Exception -> 0x08cf }
            goto L_0x046f
        L_0x0481:
            java.lang.String r0 = "mTimelineSpeedList"
            org.json.JSONArray r14 = r7.getJSONArray(r0)     // Catch:{ Exception -> 0x08cf }
            int r13 = r14.length()     // Catch:{ Exception -> 0x08cf }
            java.util.ArrayList r12 = X.AnonymousClass000.A13()     // Catch:{ Exception -> 0x08cf }
            r11 = 0
        L_0x0490:
            if (r11 >= r13) goto L_0x04a1
            org.json.JSONObject r1 = r14.getJSONObject(r11)     // Catch:{ Exception -> 0x08cf }
            X.Cll r0 = new X.Cll     // Catch:{ Exception -> 0x08cf }
            r0.<init>(r1)     // Catch:{ Exception -> 0x08cf }
            r12.add(r0)     // Catch:{ Exception -> 0x08cf }
            int r11 = r11 + 1
            goto L_0x0490
        L_0x04a1:
            java.util.Iterator r11 = r12.iterator()     // Catch:{ Exception -> 0x08cf }
        L_0x04a5:
            boolean r0 = r11.hasNext()     // Catch:{ Exception -> 0x08cf }
            if (r0 == 0) goto L_0x04b9
            java.lang.Object r0 = r11.next()     // Catch:{ Exception -> 0x08cf }
            X.Cll r0 = (X.C25774Cll) r0     // Catch:{ Exception -> 0x08cf }
            X.A5W r1 = r0.A01     // Catch:{ Exception -> 0x08cf }
            float r0 = r0.A00     // Catch:{ Exception -> 0x08cf }
            r6.A01(r1, r0)     // Catch:{ Exception -> 0x08cf }
            goto L_0x04a5
        L_0x04b9:
            java.lang.String r0 = "mTimelineEffects"
            r7.getJSONArray(r0)     // Catch:{ Exception -> 0x08cf }
            java.util.ArrayList r0 = X.AnonymousClass000.A13()     // Catch:{ Exception -> 0x08cf }
            java.util.Iterator r7 = r0.iterator()     // Catch:{ Exception -> 0x08cf }
        L_0x04c6:
            boolean r0 = r7.hasNext()     // Catch:{ Exception -> 0x08cf }
            if (r0 == 0) goto L_0x04d8
            java.lang.Object r1 = r7.next()     // Catch:{ Exception -> 0x08cf }
            X.C6M r1 = (X.C6M) r1     // Catch:{ Exception -> 0x08cf }
            java.util.List r0 = r6.A05     // Catch:{ Exception -> 0x08cf }
            r0.add(r1)     // Catch:{ Exception -> 0x08cf }
            goto L_0x04c6
        L_0x04d8:
            X.Cmm r7 = new X.Cmm     // Catch:{ Exception -> 0x08cf }
            r7.<init>(r6)     // Catch:{ Exception -> 0x08cf }
            r1 = r34
            r0 = r33
            X.C108955ca.A1V(r7, r1, r0)     // Catch:{ Exception -> 0x08cf }
            int r8 = r8 + 1
            goto L_0x03b0
        L_0x04e8:
            r1 = r37
            r0 = r34
            r1.put(r9, r0)     // Catch:{ Exception -> 0x08cf }
            int r10 = r10 + 1
            goto L_0x0381
        L_0x04f3:
            X.Cac r8 = new X.Cac     // Catch:{ Exception -> 0x08cf }
            r8.<init>()     // Catch:{ Exception -> 0x08cf }
            java.util.Iterator r6 = X.C17890vO.A0j(r37)     // Catch:{ Exception -> 0x08cf }
        L_0x04fc:
            boolean r0 = r6.hasNext()     // Catch:{ Exception -> 0x08cf }
            if (r0 == 0) goto L_0x051c
            java.lang.Object r0 = r6.next()     // Catch:{ Exception -> 0x08cf }
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ Exception -> 0x08cf }
            java.util.Iterator r1 = X.C17890vO.A0j(r0)     // Catch:{ Exception -> 0x08cf }
        L_0x050c:
            boolean r0 = r1.hasNext()     // Catch:{ Exception -> 0x08cf }
            if (r0 == 0) goto L_0x04fc
            java.lang.Object r0 = r1.next()     // Catch:{ Exception -> 0x08cf }
            X.Cmm r0 = (X.C25833Cmm) r0     // Catch:{ Exception -> 0x08cf }
            r8.A02(r0)     // Catch:{ Exception -> 0x08cf }
            goto L_0x050c
        L_0x051c:
            java.lang.String r1 = "mTrackTypeToTimelineEffects"
            r0 = r40
            org.json.JSONArray r11 = r0.getJSONArray(r1)     // Catch:{ Exception -> 0x08cf }
            java.util.HashMap r10 = X.C17880vN.A11()     // Catch:{ Exception -> 0x08cf }
            int r9 = r11.length()     // Catch:{ Exception -> 0x08cf }
            r7 = 0
        L_0x052d:
            if (r7 >= r9) goto L_0x0556
            org.json.JSONObject r6 = r11.getJSONObject(r7)     // Catch:{ Exception -> 0x08cf }
            java.lang.String r0 = "TrackType"
            int r1 = r6.getInt(r0)     // Catch:{ Exception -> 0x08cf }
            r0 = 1
            if (r1 == r0) goto L_0x0542
            r0 = 2
            if (r1 == r0) goto L_0x0545
            X.BzJ r1 = X.C24322BzJ.MIXED     // Catch:{ Exception -> 0x08cf }
            goto L_0x0547
        L_0x0542:
            X.BzJ r1 = X.C24322BzJ.AUDIO     // Catch:{ Exception -> 0x08cf }
            goto L_0x0547
        L_0x0545:
            X.BzJ r1 = X.C24322BzJ.VIDEO     // Catch:{ Exception -> 0x08cf }
        L_0x0547:
            java.lang.String r0 = "TimelineEffects"
            r6.getJSONArray(r0)     // Catch:{ Exception -> 0x08cf }
            java.util.ArrayList r0 = X.AnonymousClass000.A13()     // Catch:{ Exception -> 0x08cf }
            r10.put(r1, r0)     // Catch:{ Exception -> 0x08cf }
            int r7 = r7 + 1
            goto L_0x052d
        L_0x0556:
            java.util.Iterator r10 = X.C17890vO.A0i(r10)     // Catch:{ Exception -> 0x08cf }
        L_0x055a:
            boolean r0 = r10.hasNext()     // Catch:{ Exception -> 0x08cf }
            if (r0 == 0) goto L_0x0586
            java.util.Map$Entry r9 = X.AnonymousClass000.A16(r10)     // Catch:{ Exception -> 0x08cf }
            java.lang.Object r0 = r9.getValue()     // Catch:{ Exception -> 0x08cf }
            java.util.Iterator r7 = X.AnonymousClass8BR.A13(r0)     // Catch:{ Exception -> 0x08cf }
        L_0x056c:
            boolean r0 = r7.hasNext()     // Catch:{ Exception -> 0x08cf }
            if (r0 == 0) goto L_0x055a
            java.lang.Object r0 = r7.next()     // Catch:{ Exception -> 0x08cf }
            X.C6M r0 = (X.C6M) r0     // Catch:{ Exception -> 0x08cf }
            java.lang.Object r6 = r9.getKey()     // Catch:{ Exception -> 0x08cf }
            X.BzJ r6 = (X.C24322BzJ) r6     // Catch:{ Exception -> 0x08cf }
            X.A5W r1 = r0.A00     // Catch:{ Exception -> 0x08cf }
            com.facebook.videolite.transcoder.base.composition.MediaEffect r0 = r0.A01     // Catch:{ Exception -> 0x08cf }
            r8.A00(r1, r6, r0)     // Catch:{ Exception -> 0x08cf }
            goto L_0x056c
        L_0x0586:
            X.CrM r0 = new X.CrM     // Catch:{ Exception -> 0x08cf }
            r0.<init>(r8)     // Catch:{ Exception -> 0x08cf }
            X.Cac r6 = r0.A02()
            X.C18070vi.A0b(r6)
            goto L_0x05e3
        L_0x0593:
            r12 = r3
            r10 = r17
            X.CXD r1 = new X.CXD
            r0 = r51
            r1.<init>(r0)
            int r0 = (r17 > r8 ? 1 : (r17 == r8 ? 0 : -1))
            if (r0 > 0) goto L_0x05a3
            r10 = 0
        L_0x05a3:
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 > 0) goto L_0x05a9
            r12 = -1
        L_0x05a9:
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS
            X.A5W r8 = new X.A5W
            r8.<init>(r9, r10, r12)
            r1.A03 = r8
            X.CcJ r6 = r1.A00()
            X.BzJ r1 = X.C24322BzJ.VIDEO
            X.CqR r0 = new X.CqR
            r0.<init>(r1)
            java.util.List r1 = r0.A04
            r1.add(r6)
            X.Cmm r7 = new X.Cmm
            r7.<init>(r0)
            X.BzJ r0 = X.C24322BzJ.AUDIO
            X.CqR r1 = new X.CqR
            r1.<init>(r0)
            java.util.List r0 = r1.A04
            r0.add(r6)
            X.Cmm r0 = new X.Cmm
            r0.<init>(r1)
            X.Cac r6 = new X.Cac
            r6.<init>()
            r6.A02(r7)
            r6.A02(r0)
        L_0x05e3:
            if (r41 == 0) goto L_0x0332
            if (r21 != 0) goto L_0x02cf
            r7 = 11636(0x2d74, float:1.6306E-41)
            r1 = r23
            r0 = r49
            boolean r0 = X.C18020vd.A05(r1, r0, r7)
            if (r0 != 0) goto L_0x0332
            goto L_0x02cf
        L_0x05f5:
            java.util.Iterator r4 = r4.iterator()
        L_0x05f9:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0616
            java.lang.Object r3 = r4.next()
            X.DGR r3 = (X.DGR) r3
            X.BzJ r1 = X.C24322BzJ.VIDEO
            r0 = 1
            X.C18070vi.A0d(r3, r0)
            X.BW6 r0 = new X.BW6
            r0.<init>()
            r0.A00 = r3
            r6.A01(r1, r0)
            goto L_0x05f9
        L_0x0616:
            if (r44 == 0) goto L_0x061b
            r4 = 1
            if (r41 == 0) goto L_0x061c
        L_0x061b:
            r4 = 0
        L_0x061c:
            X.CrM r3 = new X.CrM
            r3.<init>(r6)
            X.CpX r0 = new X.CpX
            r0.<init>()
            r1 = r51
            r0.A0A = r1
            r0.A04 = r2
            java.lang.String r1 = r50.getPath()
            r0.A0C = r1
            r0.A0E = r4
            r1 = r54
            r0.A05 = r1
            X.BWB r6 = new X.BWB
            r4 = r49
            r2 = r21
            r1 = r22
            r6.<init>(r4, r1, r2)
            r0.A08 = r6
            r0.A06 = r3
            if (r43 == 0) goto L_0x071f
            java.util.concurrent.ExecutorService r11 = java.util.concurrent.Executors.newCachedThreadPool()
        L_0x064d:
            X.C18070vi.A0b(r11)
            if (r19 == 0) goto L_0x0713
            java.lang.String r1 = "VideoLiteHelper/getCodecMuxerFactory/mp4MuxerEnabled"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.DHC r4 = new X.DHC
            r4.<init>()
        L_0x065c:
            X.E7r r4 = (X.C28564E7r) r4
            if (r42 == 0) goto L_0x070c
            X.CKz r3 = new X.CKz
            r3.<init>()
            X.CAL r6 = X.C25516ChE.A08
            X.CLs r2 = new X.CLs
            r1 = r48
            r2.<init>(r1)
            java.util.Map r1 = r3.A00
            r1.put(r6, r2)
            X.ChE r2 = new X.ChE
            r2.<init>(r3)
            X.DHG r1 = new X.DHG
            r1.<init>(r2)
        L_0x067d:
            if (r60 != 0) goto L_0x0705
            if (r41 != 0) goto L_0x0705
            X.DH5 r6 = new X.DH5
            r6.<init>()
        L_0x0686:
            X.E55 r6 = (X.E55) r6
            r26 = 0
            r27 = 0
            X.CUT r3 = new X.CUT
            r3.<init>(r0)
            X.DGw r32 = new X.DGw
            r32.<init>()
            X.CAM r34 = new X.CAM
            r34.<init>()
            if (r65 == 0) goto L_0x06f5
            X.DGu r2 = new X.DGu
            r2.<init>()
        L_0x06a2:
            X.E7q r2 = (X.E7q) r2
            X.CAH r29 = new X.CAH
            r29.<init>()
            if (r65 == 0) goto L_0x06b0
            X.CWZ r26 = new X.CWZ
            r26.<init>()
        L_0x06b0:
            if (r21 == 0) goto L_0x06b7
            X.DGV r27 = new X.DGV
            r27.<init>()
        L_0x06b7:
            X.C26159CtX.A01(r11)
            X.C26159CtX.A01(r4)
            X.C26159CtX.A01(r6)
            if (r2 != 0) goto L_0x06d1
            X.DGt r2 = new X.DGt
            r2.<init>()
            r8 = 0
            X.DGv r7 = new X.DGv
            r0 = r48
            r7.<init>(r0, r8)
            r2.A00 = r7
        L_0x06d1:
            if (r27 != 0) goto L_0x06d5
            X.E7l r27 = X.C24667CEh.A00
        L_0x06d5:
            X.Cw4 r0 = new X.Cw4
            r0.<init>()
            X.DHW r8 = new X.DHW
            r8.<init>()
            r8.A00 = r0
            r8.A01 = r1
            X.CdW r28 = new X.CdW
            r28.<init>()
            X.C26159CtX.A01(r11)
            X.C26159CtX.A01(r4)
            X.C26159CtX.A01(r6)
            X.C26159CtX.A01(r27)
            goto L_0x0733
        L_0x06f5:
            X.DGt r2 = new X.DGt
            r2.<init>()
            r8 = 0
            X.DGv r7 = new X.DGv
            r0 = r48
            r7.<init>(r0, r8)
            r2.A00 = r7
            goto L_0x06a2
        L_0x0705:
            X.DH6 r6 = new X.DH6
            r6.<init>()
            goto L_0x0686
        L_0x070c:
            X.DHF r1 = new X.DHF
            r1.<init>()
            goto L_0x067d
        L_0x0713:
            java.lang.String r1 = "VideoLiteHelper/getCodecMuxerFactory/mp4MuxerDisabled"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.DHB r4 = new X.DHB
            r4.<init>()
            goto L_0x065c
        L_0x071f:
            java.util.concurrent.LinkedBlockingQueue r8 = new java.util.concurrent.LinkedBlockingQueue
            r8.<init>()
            java.lang.String r7 = "VideoLiteTranscodeQueue"
            r9 = 1
            r12 = 0
            r11 = r9
            r6 = r46
            r10 = r9
            X.2Py r11 = r6.BHv(r7, r8, r9, r10, r11, r12)
            goto L_0x064d
        L_0x0733:
            r7 = 0
            r1 = 1
            X.CrM r0 = r3.A06     // Catch:{ all -> 0x0796 }
            if (r0 == 0) goto L_0x075c
            X.DGu r10 = new X.DGu     // Catch:{ all -> 0x0796 }
            r10.<init>()     // Catch:{ all -> 0x0796 }
            X.CZT r9 = r3.A08     // Catch:{ all -> 0x0796 }
            boolean r9 = r9.A02()     // Catch:{ all -> 0x0796 }
            X.CXd r30 = X.C25328CdZ.A00(r10, r2, r0, r1, r9)     // Catch:{ all -> 0x0796 }
        L_0x0748:
            X.C18070vi.A0b(r30)     // Catch:{ all -> 0x0796 }
            boolean r0 = r3.A0F     // Catch:{ all -> 0x0796 }
            if (r0 != 0) goto L_0x0765
            boolean r0 = X.C25872Cng.A02(r3)     // Catch:{ all -> 0x0796 }
            if (r0 == 0) goto L_0x0765
            java.lang.String r0 = "Incompatible MediaExtractor for pass through"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)     // Catch:{ all -> 0x0796 }
            throw r0     // Catch:{ all -> 0x0796 }
        L_0x075c:
            java.io.File r0 = r3.A0A     // Catch:{ all -> 0x0796 }
            if (r0 == 0) goto L_0x078f
            X.CXd r30 = X.BE7.A0I(r2, r0)     // Catch:{ all -> 0x0796 }
            goto L_0x0748
        L_0x0765:
            X.Cj7 r0 = new X.Cj7     // Catch:{ all -> 0x0796 }
            r24 = r0
            r25 = r48
            r31 = r2
            r33 = r6
            r35 = r4
            r36 = r3
            r37 = r8
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)     // Catch:{ all -> 0x0796 }
            X.CKw r9 = new X.CKw     // Catch:{ all -> 0x0796 }
            r9.<init>(r11)     // Catch:{ all -> 0x0796 }
            X.DGq r8 = new X.DGq     // Catch:{ all -> 0x0796 }
            r8.<init>(r0)     // Catch:{ all -> 0x0796 }
            java.util.concurrent.ExecutorService r6 = r9.A00     // Catch:{ all -> 0x0796 }
            r4 = 27
            X.DTg r2 = new X.DTg     // Catch:{ all -> 0x0796 }
            r2.<init>(r8, r9, r0, r4)     // Catch:{ all -> 0x0796 }
            r6.execute(r2)     // Catch:{ all -> 0x0796 }
            goto L_0x07b7
        L_0x078f:
            java.lang.String r0 = "unable to extract MediaMetadata without MediaComposition or input file"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)     // Catch:{ all -> 0x0796 }
            throw r0     // Catch:{ all -> 0x0796 }
        L_0x0796:
            r4 = move-exception
            java.lang.String r2 = "TranscodeUtil"
            java.lang.String r0 = "Throwable"
            X.C26294Cx6.A09(r2, r0, r4)
            r4.getMessage()
            X.E9F r3 = r3.A05
            if (r3 == 0) goto L_0x07b2
            X.C2Z r2 = new X.C2Z
            r2.<init>((java.lang.Throwable) r4)
            X.CmX r0 = new X.CmX
            r0.<init>()
            r3.BtX(r0, r2)
        L_0x07b2:
            X.DGp r8 = new X.DGp
            r8.<init>()
        L_0x07b7:
            r5.A07 = r8
            java.lang.String r3 = "VideoTranscoder/videolite exception"
            r8.CS0()     // Catch:{ 2RS -> 0x0836, InterruptedException | ExecutionException -> 0x0831 }
            X.C2Z r2 = r5.A01     // Catch:{ 2RS -> 0x0836, InterruptedException | ExecutionException -> 0x0831 }
            if (r2 != 0) goto L_0x0830
            boolean r0 = r5.A0S     // Catch:{ 2RS -> 0x0836, InterruptedException | ExecutionException -> 0x0831 }
            if (r0 != 0) goto L_0x0817
            if (r67 != 0) goto L_0x07e4
            if (r19 == 0) goto L_0x07e4
            java.lang.Integer r0 = com.whatsapp.Mp4Ops.A00()     // Catch:{ 2RS -> 0x0836, InterruptedException | ExecutionException -> 0x0831 }
            if (r0 == 0) goto L_0x07d7
            int r0 = r0.intValue()     // Catch:{ 2RS -> 0x0836, InterruptedException | ExecutionException -> 0x0831 }
            if (r0 != r1) goto L_0x07d7
            goto L_0x07e4
        L_0x07d7:
            r4 = 8043(0x1f6b, float:1.127E-41)
            r2 = r23
            r0 = r49
            boolean r0 = X.C18020vd.A05(r2, r0, r4)     // Catch:{ 2RS -> 0x0836, InterruptedException | ExecutionException -> 0x0831 }
            r2 = 1
            if (r0 != 0) goto L_0x07e5
        L_0x07e4:
            r2 = 0
        L_0x07e5:
            boolean r0 = r50.exists()     // Catch:{ 2RS -> 0x0836, InterruptedException | ExecutionException -> 0x0831 }
            if (r0 == 0) goto L_0x0818
            long r10 = r50.length()     // Catch:{ 2RS -> 0x0836, InterruptedException | ExecutionException -> 0x0831 }
            r8 = 0
            int r0 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x0818
            com.whatsapp.media.WamediaManager r6 = r5.A0E     // Catch:{ 2RS -> 0x0836, InterruptedException | ExecutionException -> 0x0831 }
            if (r2 == 0) goto L_0x0811
            r4 = 10153(0x27a9, float:1.4227E-41)
            r2 = r23
            r0 = r49
            boolean r2 = X.C18020vd.A05(r2, r0, r4)     // Catch:{ 2RS -> 0x0836, InterruptedException | ExecutionException -> 0x0831 }
            r0 = r50
            r6.check(r0, r2)     // Catch:{ 2RS -> 0x0836, InterruptedException | ExecutionException -> 0x0831 }
        L_0x0808:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ 2RS -> 0x0836, InterruptedException | ExecutionException -> 0x0831 }
            r0 = r47
            r0.A02 = r1     // Catch:{ 2RS -> 0x0836, InterruptedException | ExecutionException -> 0x0831 }
            goto L_0x0817
        L_0x0811:
            r0 = r50
            r6.checkAndRepair(r0)     // Catch:{ 2RS -> 0x0836, InterruptedException | ExecutionException -> 0x0831 }
            goto L_0x0808
        L_0x0817:
            return
        L_0x0818:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ 2RS -> 0x0836, InterruptedException | ExecutionException -> 0x0831 }
            java.lang.String r0 = "output file not exist after transcode | size="
            r2.append(r0)     // Catch:{ 2RS -> 0x0836, InterruptedException | ExecutionException -> 0x0831 }
            java.io.File r0 = r5.A0H     // Catch:{ 2RS -> 0x0836, InterruptedException | ExecutionException -> 0x0831 }
            long r0 = r0.length()     // Catch:{ 2RS -> 0x0836, InterruptedException | ExecutionException -> 0x0831 }
            java.lang.String r0 = X.C17880vN.A0u(r2, r0)     // Catch:{ 2RS -> 0x0836, InterruptedException | ExecutionException -> 0x0831 }
            X.C1l r2 = new X.C1l     // Catch:{ 2RS -> 0x0836, InterruptedException | ExecutionException -> 0x0831 }
            r2.<init>(r0)     // Catch:{ 2RS -> 0x0836, InterruptedException | ExecutionException -> 0x0831 }
        L_0x0830:
            throw r2     // Catch:{ 2RS -> 0x0836, InterruptedException | ExecutionException -> 0x0831 }
        L_0x0831:
            r0 = move-exception
            com.whatsapp.util.Log.e(r3, r0)
            throw r0
        L_0x0836:
            r4 = move-exception
            java.lang.String r3 = "transcode"
            if (r53 == 0) goto L_0x0858
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>(r2, r0, r0, r2)
            r0 = r20
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0858
            if (r63 != 0) goto L_0x0858
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r3)
            java.lang.String r0 = "_from_channel"
            java.lang.String r3 = X.AnonymousClass000.A0y(r0, r1)
        L_0x0858:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            boolean r0 = r5.A03()
            if (r0 == 0) goto L_0x08ac
            java.io.File r0 = r50.getAbsoluteFile()
            java.lang.String r1 = X.C18070vi.A0H(r0)
            java.lang.String r0 = ".mp4"
            java.lang.String r6 = ""
            java.lang.String r1 = X.AnonymousClass1YE.A07(r1, r0, r6, r7)
            java.lang.String r0 = ".gif"
            java.lang.String r8 = X.AnonymousClass1YE.A07(r1, r0, r6, r7)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r8)
            java.lang.String r0 = ".aud"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            java.io.File r6 = X.C108945cZ.A17(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r8)
            java.lang.String r0 = ".vid"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            java.io.File r1 = X.C108945cZ.A17(r0)
            java.lang.String r0 = " | audFileExists="
            r2.append(r0)
            boolean r0 = r6.exists()
            r2.append(r0)
            java.lang.String r0 = " | vidFileExists="
            r2.append(r0)
            boolean r0 = r1.exists()
            r2.append(r0)
        L_0x08ac:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r7)
            r0 = r47
            r0.A02 = r1
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = r4.detailMessage
            java.lang.String r0 = X.AnonymousClass001.A1E(r2, r0, r1)
            r4.detailMessage = r0
            java.lang.String r0 = "VideoTranscoder/libmp4muxexception"
            com.whatsapp.util.Log.e(r0, r4)
            com.whatsapp.media.WamediaManager r2 = r5.A0E
            boolean r1 = r5.A0I
            r0 = r50
            r2.uploadMp4FailureLogs(r0, r4, r3, r1)
            throw r4
        L_0x08cf:
            r1 = move-exception
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        L_0x08d6:
            java.lang.String r0 = "VideoLiteHelper/VideoMetadataFetchException sourceVideoMetadata==null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.Bw9 r0 = new X.Bw9
            r0.<init>()
            throw r0
        L_0x08e1:
            X.Bw8 r0 = new X.Bw8
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DPW.A00(android.graphics.RectF, X.DGy, X.73s, X.6rN, java.io.File, java.io.File, java.io.File, java.lang.String, int, int, boolean, boolean, boolean, boolean, boolean):void");
    }
}
