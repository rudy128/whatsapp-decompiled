package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.DDk  reason: case insensitive filesystem */
public class C26780DDk implements E98 {
    public C24488C6f A00;
    public C25588CiS A01;
    public EAJ A02;
    public final C25639CjS A03;

    /* JADX WARNING: type inference failed for: r1v53, types: [X.C6f, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02fe, code lost:
        if (r7 == null) goto L_0x0300;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0307, code lost:
        if (r10 != false) goto L_0x0309;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0310, code lost:
        if (r8 != false) goto L_0x0312;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0329, code lost:
        if (r7 != false) goto L_0x032b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007e, code lost:
        if (r9.A00() != false) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0088, code lost:
        if (r7.A00() != false) goto L_0x008a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.EAJ r24, X.EA3 r25, X.EAK r26) {
        /*
            r23 = this;
            r4 = 1
            r3 = 0
            java.lang.String r0 = "GlCopyRenderer.renderFrame()"
            android.os.Trace.beginSection(r0)
            r22 = r26
            java.lang.Object r17 = r22.BU8()
            monitor-enter(r17)
            r6 = r23
            r18 = r24
            if (r24 != 0) goto L_0x0016
            goto L_0x033a
        L_0x0016:
            X.EAJ r1 = r6.A02     // Catch:{ all -> 0x0346 }
            r0 = r18
            if (r0 == r1) goto L_0x0023
            X.CjS r1 = r6.A03     // Catch:{ all -> 0x0346 }
            X.C0H r0 = X.C0H.A03     // Catch:{ all -> 0x0346 }
            r1.A00(r0)     // Catch:{ all -> 0x0346 }
        L_0x0023:
            X.CiS r5 = r6.A01     // Catch:{ all -> 0x0346 }
            X.CWu r7 = r18.BY7()     // Catch:{ all -> 0x0346 }
            X.ChF r0 = r7.A01     // Catch:{ all -> 0x0346 }
            X.C9S r2 = X.C25517ChF.A0D     // Catch:{ all -> 0x0346 }
            java.lang.Boolean r1 = X.AnonymousClass000.A0h()     // Catch:{ all -> 0x0346 }
            java.util.Map r0 = r0.A00     // Catch:{ all -> 0x0346 }
            java.lang.Object r0 = X.BE8.A0e(r2, r1, r0)     // Catch:{ all -> 0x0346 }
            boolean r0 = X.AnonymousClass000.A1Y(r0)     // Catch:{ all -> 0x0346 }
            if (r0 == 0) goto L_0x003f
            X.CiS r5 = r7.A02     // Catch:{ all -> 0x0346 }
        L_0x003f:
            if (r5 != 0) goto L_0x004d
            android.os.Trace.endSection()     // Catch:{ all -> 0x0346 }
            X.CjS r1 = r6.A03     // Catch:{ all -> 0x0346 }
            X.C0H r0 = X.C0H.A05     // Catch:{ all -> 0x0346 }
            r1.A00(r0)     // Catch:{ all -> 0x0346 }
            goto L_0x0344
        L_0x004d:
            r1 = r25
            X.CZB r2 = r1.getTexture()     // Catch:{ all -> 0x0346 }
            r0 = r22
            boolean r0 = r0.Beb(r1)     // Catch:{ all -> 0x0346 }
            r7 = r0 ^ 1
            if (r2 == 0) goto L_0x0322
            if (r7 != 0) goto L_0x032b
            java.lang.String r0 = "GlCopyRenderer.makeCurrent()"
            android.os.Trace.beginSection(r0)     // Catch:{ all -> 0x031a }
            java.lang.RuntimeException r0 = r22.Bif()     // Catch:{ all -> 0x031a }
            android.os.Trace.endSection()     // Catch:{ all -> 0x031a }
            if (r0 != 0) goto L_0x0333
            r0 = r22
            X.CWX r7 = r0.CR7(r1)     // Catch:{ all -> 0x031a }
            X.CWX r9 = r1.Bbf()     // Catch:{ all -> 0x031a }
            if (r9 == 0) goto L_0x0080
            boolean r0 = r9.A00()     // Catch:{ all -> 0x031a }
            r10 = 1
            if (r0 == 0) goto L_0x0081
        L_0x0080:
            r10 = 0
        L_0x0081:
            if (r7 == 0) goto L_0x008a
            boolean r0 = r7.A00()     // Catch:{ all -> 0x031a }
            r8 = 1
            if (r0 == 0) goto L_0x008b
        L_0x008a:
            r8 = 0
        L_0x008b:
            if (r9 == 0) goto L_0x02f7
            if (r7 == 0) goto L_0x0300
            if (r10 != 0) goto L_0x0309
            if (r8 != 0) goto L_0x0312
            java.lang.String r0 = "GlCopyRenderer.draw()"
            android.os.Trace.beginSection(r0)     // Catch:{ all -> 0x031a }
            int r15 = r1.BOx()     // Catch:{ all -> 0x031a }
            X.C3L r8 = r1.BSL()     // Catch:{ all -> 0x031a }
            X.C6f r1 = r6.A00     // Catch:{ all -> 0x031a }
            if (r1 != 0) goto L_0x010b
            int r14 = r22.BVt()     // Catch:{ all -> 0x031a }
            boolean r13 = r22.Bfh()     // Catch:{ all -> 0x031a }
            int r12 = r7.A01     // Catch:{ all -> 0x031a }
            int r11 = r7.A00     // Catch:{ all -> 0x031a }
            float[] r10 = r9.A03     // Catch:{ all -> 0x031a }
            float[] r0 = r7.A03     // Catch:{ all -> 0x031a }
            float[] r9 = r9.A02     // Catch:{ all -> 0x031a }
            float[] r7 = r7.A02     // Catch:{ all -> 0x031a }
            X.C6f r1 = new X.C6f     // Catch:{ all -> 0x031a }
            r1.<init>()     // Catch:{ all -> 0x031a }
            r1.A00 = r15     // Catch:{ all -> 0x031a }
            r1.A01 = r14     // Catch:{ all -> 0x031a }
            r1.A05 = r4     // Catch:{ all -> 0x031a }
            r1.A06 = r13     // Catch:{ all -> 0x031a }
            r1.A03 = r12     // Catch:{ all -> 0x031a }
            r1.A02 = r11     // Catch:{ all -> 0x031a }
            r1.A0A = r10     // Catch:{ all -> 0x031a }
            r1.A08 = r0     // Catch:{ all -> 0x031a }
            r1.A09 = r9     // Catch:{ all -> 0x031a }
            r1.A07 = r7     // Catch:{ all -> 0x031a }
            r1.A04 = r8     // Catch:{ all -> 0x031a }
            r6.A00 = r1     // Catch:{ all -> 0x031a }
        L_0x00d5:
            X.CqE r12 = r18.BXf()     // Catch:{ all -> 0x031a }
            int r11 = r1.A00     // Catch:{ all -> 0x031a }
            int r10 = r1.A01     // Catch:{ all -> 0x031a }
            boolean r13 = r1.A05     // Catch:{ all -> 0x031a }
            boolean r14 = r1.A06     // Catch:{ all -> 0x031a }
            int r0 = r1.A03     // Catch:{ all -> 0x031a }
            r21 = r0
            int r0 = r1.A02     // Catch:{ all -> 0x031a }
            r20 = r0
            float[] r9 = r1.A0A     // Catch:{ all -> 0x031a }
            if (r9 != 0) goto L_0x00ef
            float[] r9 = X.C25588CiS.A05     // Catch:{ all -> 0x031a }
        L_0x00ef:
            float[] r8 = r1.A08     // Catch:{ all -> 0x031a }
            if (r8 != 0) goto L_0x00f5
            float[] r8 = X.C25588CiS.A05     // Catch:{ all -> 0x031a }
        L_0x00f5:
            float[] r7 = r1.A09     // Catch:{ all -> 0x031a }
            if (r7 != 0) goto L_0x00fb
            float[] r7 = X.C25588CiS.A05     // Catch:{ all -> 0x031a }
        L_0x00fb:
            float[] r6 = r1.A07     // Catch:{ all -> 0x031a }
            if (r6 != 0) goto L_0x0101
            float[] r6 = X.C25588CiS.A05     // Catch:{ all -> 0x031a }
        L_0x0101:
            java.lang.String r16 = "uMaxContentLuminance"
            java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch:{ all -> 0x031a }
            java.lang.String r0 = "GlCoreCopyRenderer::renderFrame:err1 Already in error state entering renderAfterBind"
            X.C26058CrU.A03(r0, r1)     // Catch:{ all -> 0x031a }
            goto L_0x0138
        L_0x010b:
            r1.A00 = r15     // Catch:{ all -> 0x031a }
            int r0 = r22.BVt()     // Catch:{ all -> 0x031a }
            r1.A01 = r0     // Catch:{ all -> 0x031a }
            X.C6f r1 = r6.A00     // Catch:{ all -> 0x031a }
            r1.A05 = r4     // Catch:{ all -> 0x031a }
            boolean r0 = r22.Bfh()     // Catch:{ all -> 0x031a }
            r1.A06 = r0     // Catch:{ all -> 0x031a }
            int r0 = r7.A01     // Catch:{ all -> 0x031a }
            r1.A03 = r0     // Catch:{ all -> 0x031a }
            int r0 = r7.A00     // Catch:{ all -> 0x031a }
            r1.A02 = r0     // Catch:{ all -> 0x031a }
            float[] r0 = r9.A03     // Catch:{ all -> 0x031a }
            r1.A0A = r0     // Catch:{ all -> 0x031a }
            float[] r0 = r7.A03     // Catch:{ all -> 0x031a }
            r1.A08 = r0     // Catch:{ all -> 0x031a }
            float[] r0 = r9.A02     // Catch:{ all -> 0x031a }
            r1.A09 = r0     // Catch:{ all -> 0x031a }
            float[] r0 = r7.A02     // Catch:{ all -> 0x031a }
            r1.A07 = r0     // Catch:{ all -> 0x031a }
            r1.A04 = r8     // Catch:{ all -> 0x031a }
            goto L_0x00d5
        L_0x0138:
            r1 = 3042(0xbe2, float:4.263E-42)
            if (r14 != 0) goto L_0x0140
            android.opengl.GLES20.glDisable(r1)     // Catch:{ all -> 0x031a }
            goto L_0x014e
        L_0x0140:
            r0 = 771(0x303, float:1.08E-42)
            android.opengl.GLES20.glBlendFunc(r4, r0)     // Catch:{ all -> 0x031a }
            r0 = 32774(0x8006, float:4.5926E-41)
            android.opengl.GLES20.glBlendEquation(r0)     // Catch:{ all -> 0x031a }
            android.opengl.GLES20.glEnable(r1)     // Catch:{ all -> 0x031a }
        L_0x014e:
            r0 = 2929(0xb71, float:4.104E-42)
            android.opengl.GLES20.glDisable(r0)     // Catch:{ all -> 0x031a }
            r0 = 2884(0xb44, float:4.041E-42)
            android.opengl.GLES20.glDisable(r0)     // Catch:{ all -> 0x031a }
            java.lang.String r0 = "GlCoreCopyRenderer::renderFrame:err4"
            X.C26058CrU.A01(r0)     // Catch:{ all -> 0x031a }
            r1 = r21
            r0 = r20
            android.opengl.GLES20.glViewport(r3, r3, r1, r0)     // Catch:{ all -> 0x031a }
            java.lang.String r0 = "GlCoreCopyRenderer::renderFrame:err4b glViewport"
            X.C26058CrU.A01(r0)     // Catch:{ all -> 0x031a }
            r1 = 0
            r0 = 1065353216(0x3f800000, float:1.0)
            android.opengl.GLES20.glClearColor(r1, r1, r1, r0)     // Catch:{ all -> 0x031a }
            java.lang.String r0 = "GlCoreCopyRenderer::renderFrame:err5a glClearColor"
            X.C26058CrU.A01(r0)     // Catch:{ all -> 0x031a }
            r0 = 16640(0x4100, float:2.3318E-41)
            android.opengl.GLES20.glClear(r0)     // Catch:{ all -> 0x031a }
            java.lang.String r0 = "GlCoreCopyRenderer::renderFrame:err5b glClear"
            X.C26058CrU.A01(r0)     // Catch:{ all -> 0x031a }
            if (r13 == 0) goto L_0x02d5
            int r1 = r2.A01     // Catch:{ all -> 0x031a }
            r0 = 36197(0x8d65, float:5.0723E-41)
            boolean r14 = X.AnonymousClass000.A1T(r1, r0)
            int r0 = r11 * 2
            int r1 = r14 + r0
            int r0 = r10 * 100
            int r1 = r1 + r0
            java.util.Map r0 = r5.A04     // Catch:{ all -> 0x031a }
            r19 = r0
            java.lang.Integer r13 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x031a }
            java.lang.Object r1 = r0.get(r13)     // Catch:{ all -> 0x031a }
            X.Cl9 r1 = (X.C25739Cl9) r1     // Catch:{ all -> 0x031a }
            if (r1 != 0) goto L_0x0258
            r0 = -1
            if (r11 == r0) goto L_0x0240
            r15 = 7
            r1 = 3
            r0 = 6
            if (r11 == r0) goto L_0x021b
            if (r11 == r15) goto L_0x01cc
            if (r14 == 0) goto L_0x01c0
            boolean r0 = r5.A01     // Catch:{ Exception -> 0x0249 }
            if (r0 != 0) goto L_0x01b4
            r0 = 9
            if (r10 != r0) goto L_0x01c0
        L_0x01b4:
            r1 = 2132017215(0x7f14003f, float:1.9672702E38)
            r0 = 2132017157(0x7f140005, float:1.9672584E38)
            X.Cl9 r1 = r12.A02(r1, r0, r4)     // Catch:{ Exception -> 0x0249 }
            goto L_0x0253
        L_0x01c0:
            r1 = 2132017217(0x7f140041, float:1.9672706E38)
            r0 = 2132017216(0x7f140040, float:1.9672704E38)
            X.Cl9 r1 = r12.A02(r1, r0, r14)     // Catch:{ Exception -> 0x0249 }
            goto L_0x0253
        L_0x01cc:
            java.lang.String r11 = "alpha"
            if (r14 == 0) goto L_0x01f6
            r15 = 3
            r1 = 2132017215(0x7f14003f, float:1.9672702E38)
            r0 = 2132017259(0x7f14006b, float:1.9672791E38)
            if (r10 == r15) goto L_0x01e4
            r1 = 2132017175(0x7f140017, float:1.967262E38)
            r0 = 2132017174(0x7f140016, float:1.9672619E38)
            X.Cl9 r1 = r12.A02(r1, r0, r4)     // Catch:{ Exception -> 0x0249 }
            goto L_0x0253
        L_0x01e4:
            X.Cl9 r1 = r12.A02(r1, r0, r4)     // Catch:{ Exception -> 0x0249 }
            X.Ckg r0 = r1.A01()     // Catch:{ Exception -> 0x0249 }
            r10 = 1065353216(0x3f800000, float:1.0)
            int r0 = X.C25710Ckg.A00(r0, r11)     // Catch:{ Exception -> 0x0249 }
            android.opengl.GLES20.glUniform1f(r0, r10)     // Catch:{ Exception -> 0x0249 }
            goto L_0x0253
        L_0x01f6:
            if (r10 != r1) goto L_0x0210
            r1 = 2132017215(0x7f14003f, float:1.9672702E38)
            r0 = 2132017156(0x7f140004, float:1.9672582E38)
            X.Cl9 r1 = r12.A02(r1, r0, r3)     // Catch:{ Exception -> 0x0249 }
            X.Ckg r0 = r1.A01()     // Catch:{ Exception -> 0x0249 }
            r10 = 1065353216(0x3f800000, float:1.0)
            int r0 = X.C25710Ckg.A00(r0, r11)     // Catch:{ Exception -> 0x0249 }
            android.opengl.GLES20.glUniform1f(r0, r10)     // Catch:{ Exception -> 0x0249 }
            goto L_0x0253
        L_0x0210:
            r1 = 2132017217(0x7f140041, float:1.9672706E38)
            r0 = 2132017216(0x7f140040, float:1.9672704E38)
            X.Cl9 r1 = r12.A02(r1, r0, r3)     // Catch:{ Exception -> 0x0249 }
            goto L_0x0253
        L_0x021b:
            if (r10 != r1) goto L_0x0228
            r1 = 2132017262(0x7f14006e, float:1.9672797E38)
            r0 = 2132017260(0x7f14006c, float:1.9672793E38)
            X.Cl9 r1 = r12.A02(r1, r0, r14)     // Catch:{ Exception -> 0x0249 }
            goto L_0x0253
        L_0x0228:
            if (r10 != r15) goto L_0x0235
            r1 = 2132017262(0x7f14006e, float:1.9672797E38)
            r0 = 2132017261(0x7f14006d, float:1.9672795E38)
            X.Cl9 r1 = r12.A02(r1, r0, r14)     // Catch:{ Exception -> 0x0249 }
            goto L_0x0253
        L_0x0235:
            r1 = 2132017175(0x7f140017, float:1.967262E38)
            r0 = 2132017174(0x7f140016, float:1.9672619E38)
            X.Cl9 r1 = r12.A02(r1, r0, r14)     // Catch:{ Exception -> 0x0249 }
            goto L_0x0253
        L_0x0240:
            java.lang.String r1 = "#version 300 es\nprecision mediump float;\nuniform mat4 uTextureTransformMatrix;\nuniform mat4 uCropTransformMatrix;\nuniform mat4 uInContentTransformMatrix;\nuniform mat4 uContentTransformMatrix;\n\nin vec4 aPosition;\nin vec4 aTextureCoord;\n\nout vec2 vTextureCoord;\n\nvoid main() {\n  gl_Position = uContentTransformMatrix * uInContentTransformMatrix * aPosition;\n  vTextureCoord = (uTextureTransformMatrix * uCropTransformMatrix * aTextureCoord).xy;\n}"
            java.lang.String r0 = "#version 300 es\n\n#extension GL_OES_EGL_image_external : require\nprecision mediump float; // highp here doesn't seem to matter\n\nuniform samplerExternalOES sTexture;\n\nin vec2 vTextureCoord;\nout vec4 outColor;\n\n// Column-major matrix declarations; pre-multiply by input vectors\nconst mat3 P3_BT709 = mat3(1.22476, -0.0420633, -0.0196438, -0.224866, 1.04206, -0.00786447, 0, 0, 1.09854);\n\nhighp vec3 sRGB_EOTF_Inv(highp vec3 x) {\n    highp vec3 A = 12.92 * x;\n    highp vec3 B = 1.055 * pow(x, vec3(1.0 / 2.4)) - 0.055;\n    return mix(A, B, step(0.0031308, x));\n}\n\nhighp vec3 sRGB_EOTF(highp vec3 x) {\n    highp vec3 A = x / 12.92;\n    highp vec3 B = pow((x + 0.055) / 1.055, vec3(2.4));\n    return mix(A, B, step(0.04045, x));\n}\n\nvoid main() {\n  highp vec3 srcRGB = texture(sTexture, vTextureCoord).xyz;\n\n  // Display P3 RGB non-linear to Display P3 RGB display linear\n  highp vec3 rgb_P3_displayLinear = sRGB_EOTF(srcRGB);\n\n  // Display P3 RGB display linear -> BT.709 display linear\n  highp vec3 rgb_BT709_displayLinear = P3_BT709 * rgb_P3_displayLinear;\n\n  // Color gamut compression\n  rgb_BT709_displayLinear = clamp(rgb_BT709_displayLinear, 0., 1.);\n\n  // BT.709 display linear -> BT.709 non-linear\n  highp vec3 rgb_BT709_sRGB = sRGB_EOTF_Inv(rgb_BT709_displayLinear);\n\n  outColor = vec4(rgb_BT709_sRGB, 1.0);\n}\n"
            X.Cl9 r1 = r12.A03(r1, r0, r14)     // Catch:{ Exception -> 0x0249 }
            goto L_0x0253
        L_0x0249:
            r1 = 2132017217(0x7f140041, float:1.9672706E38)
            r0 = 2132017216(0x7f140040, float:1.9672704E38)
            X.Cl9 r1 = r12.A02(r1, r0, r14)     // Catch:{ all -> 0x031a }
        L_0x0253:
            r0 = r19
            r0.put(r13, r1)     // Catch:{ all -> 0x031a }
        L_0x0258:
            java.lang.String r0 = "GlCoreCopyRenderer::renderFrame:err6"
            X.C26058CrU.A01(r0)     // Catch:{ all -> 0x031a }
            X.CRH r0 = r2.A02     // Catch:{ DZt -> 0x02bf }
            int r13 = r0.A01     // Catch:{ DZt -> 0x02bf }
            int r10 = r0.A00     // Catch:{ DZt -> 0x02bf }
            boolean r0 = r5.A00     // Catch:{ DZt -> 0x02bf }
            if (r0 == 0) goto L_0x0284
            java.lang.String r12 = "GlCoreCopyRenderer"
            java.lang.Object[] r11 = X.BE6.A1a()     // Catch:{ DZt -> 0x02bf }
            X.BEA.A1V(r11, r13, r3, r10, r4)     // Catch:{ DZt -> 0x02bf }
            r0 = r21
            X.BE8.A1M(r11, r0)     // Catch:{ DZt -> 0x02bf }
            r10 = 3
            r0 = r20
            X.C17880vN.A1T(r11, r0, r10)     // Catch:{ DZt -> 0x02bf }
            java.lang.String r0 = "input=%dx%d output=%dx%d"
            java.lang.String r0 = java.lang.String.format(r0, r11)     // Catch:{ DZt -> 0x02bf }
            X.C26294Cx6.A04(r12, r0)     // Catch:{ DZt -> 0x02bf }
        L_0x0284:
            X.Ckg r10 = r1.A01()     // Catch:{ DZt -> 0x02bf }
            java.lang.String r0 = "uTextureTransformMatrix"
            r10.A02(r0, r9)     // Catch:{ DZt -> 0x02bf }
            java.lang.String r0 = "uCropTransformMatrix"
            r10.A02(r0, r8)     // Catch:{ DZt -> 0x02bf }
            java.lang.String r0 = "uInContentTransformMatrix"
            r10.A02(r0, r7)     // Catch:{ DZt -> 0x02bf }
            java.lang.String r0 = "uContentTransformMatrix"
            r10.A02(r0, r6)     // Catch:{ DZt -> 0x02bf }
            java.lang.String r0 = "sTexture"
            r10.A01(r2, r0)     // Catch:{ DZt -> 0x02bf }
            X.Cl9 r6 = r10.A00     // Catch:{ DZt -> 0x02bf }
            int r1 = r6.A00     // Catch:{ DZt -> 0x02bf }
            r0 = r16
            int r1 = android.opengl.GLES20.glGetUniformLocation(r1, r0)     // Catch:{ DZt -> 0x02bf }
            r0 = -1
            if (r1 == r0) goto L_0x02b9
            r1 = 1148846080(0x447a0000, float:1000.0)
            r0 = r16
            int r0 = X.C25710Ckg.A00(r10, r0)     // Catch:{ DZt -> 0x02bf }
            android.opengl.GLES20.glUniform1f(r0, r1)     // Catch:{ DZt -> 0x02bf }
        L_0x02b9:
            X.CPT r0 = r5.A03     // Catch:{ DZt -> 0x02bf }
            X.C25739Cl9.A00(r0, r6)     // Catch:{ DZt -> 0x02bf }
            goto L_0x02d5
        L_0x02bf:
            r3 = move-exception
            int r2 = r3.mLastErrorCode     // Catch:{ all -> 0x031a }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x031a }
            java.lang.String r0 = "GlCoreCopyRenderer"
            java.lang.String r1 = X.C17900vP.A0C(r0, r1, r3)     // Catch:{ all -> 0x031a }
            X.DZt r0 = new X.DZt     // Catch:{ all -> 0x031a }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x031a }
            r0.initCause(r3)     // Catch:{ all -> 0x031a }
            throw r0     // Catch:{ all -> 0x031a }
        L_0x02d5:
            java.lang.Object[] r1 = X.AnonymousClass3MW.A1b()     // Catch:{ all -> 0x031a }
            int r0 = r2.A01     // Catch:{ all -> 0x031a }
            X.C17880vN.A1T(r1, r0, r3)     // Catch:{ all -> 0x031a }
            int r0 = r2.A00     // Catch:{ all -> 0x031a }
            X.C17880vN.A1T(r1, r0, r4)     // Catch:{ all -> 0x031a }
            java.lang.String r0 = "GlCoreCopyRenderer::renderFrame: textureTarget: %s textureHandle: %s"
            X.C26058CrU.A03(r0, r1)     // Catch:{ all -> 0x031a }
            android.os.Trace.endSection()     // Catch:{ all -> 0x031a }
            java.lang.String r0 = "GlCopyRenderer.swapBuffers()"
            android.os.Trace.beginSection(r0)     // Catch:{ all -> 0x031a }
            r22.COr()     // Catch:{ all -> 0x031a }
            android.os.Trace.endSection()     // Catch:{ all -> 0x031a }
            goto L_0x0333
        L_0x02f7:
            X.CjS r1 = r6.A03     // Catch:{ all -> 0x031a }
            X.C0H r0 = X.C0H.A07     // Catch:{ all -> 0x031a }
            r1.A00(r0)     // Catch:{ all -> 0x031a }
            if (r7 != 0) goto L_0x0307
        L_0x0300:
            X.CjS r1 = r6.A03     // Catch:{ all -> 0x031a }
            X.C0H r0 = X.C0H.A06     // Catch:{ all -> 0x031a }
            r1.A00(r0)     // Catch:{ all -> 0x031a }
        L_0x0307:
            if (r10 == 0) goto L_0x0310
        L_0x0309:
            X.CjS r1 = r6.A03     // Catch:{ all -> 0x031a }
            X.C0H r0 = X.C0H.A0E     // Catch:{ all -> 0x031a }
            r1.A00(r0)     // Catch:{ all -> 0x031a }
        L_0x0310:
            if (r8 == 0) goto L_0x0333
        L_0x0312:
            X.CjS r1 = r6.A03     // Catch:{ all -> 0x031a }
            X.C0H r0 = X.C0H.A0D     // Catch:{ all -> 0x031a }
            r1.A00(r0)     // Catch:{ all -> 0x031a }
            goto L_0x0333
        L_0x031a:
            r0 = move-exception
            r18.Big()     // Catch:{ all -> 0x0346 }
            android.os.Trace.endSection()     // Catch:{ all -> 0x0346 }
            throw r0     // Catch:{ all -> 0x0346 }
        L_0x0322:
            X.CjS r1 = r6.A03     // Catch:{ all -> 0x0346 }
            X.C0H r0 = X.C0H.A09     // Catch:{ all -> 0x0346 }
            r1.A00(r0)     // Catch:{ all -> 0x0346 }
            if (r7 == 0) goto L_0x0336
        L_0x032b:
            X.CjS r1 = r6.A03     // Catch:{ all -> 0x0346 }
            X.C0H r0 = X.C0H.A0A     // Catch:{ all -> 0x0346 }
            r1.A00(r0)     // Catch:{ all -> 0x0346 }
            goto L_0x0336
        L_0x0333:
            r18.Big()     // Catch:{ all -> 0x0346 }
        L_0x0336:
            android.os.Trace.endSection()     // Catch:{ all -> 0x0346 }
            goto L_0x0344
        L_0x033a:
            android.os.Trace.endSection()     // Catch:{ all -> 0x0346 }
            X.CjS r1 = r6.A03     // Catch:{ all -> 0x0346 }
            X.C0H r0 = X.C0H.A08     // Catch:{ all -> 0x0346 }
            r1.A00(r0)     // Catch:{ all -> 0x0346 }
        L_0x0344:
            monitor-exit(r17)     // Catch:{ all -> 0x0346 }
            return
        L_0x0346:
            r0 = move-exception
            monitor-exit(r17)     // Catch:{ all -> 0x0346 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26780DDk.A00(X.EAJ, X.EA3, X.EAK):void");
    }

    public void Bd8(C26045Cr9 cr9) {
    }

    public void release() {
    }

    public void BCi(EAJ eaj) {
        EAJ eaj2 = this.A02;
        if (!(eaj2 == null || eaj2 == eaj)) {
            this.A03.A00(C0H.A02);
        }
        this.A02 = eaj;
        C25517ChF chF = eaj.BY7().A01;
        C9S c9s = C25517ChF.A0D;
        Boolean A0h = AnonymousClass000.A0h();
        Map map = chF.A00;
        if (!AnonymousClass000.A1Y(BE8.A0e(c9s, A0h, map)) && this.A01 == null) {
            C25588CiS ciS = new C25588CiS(chF);
            ciS.A01 = AnonymousClass000.A1Y(BE8.A0e(C25517ChF.A08, AnonymousClass000.A0h(), map));
            this.A01 = ciS;
        }
    }

    public void BIY() {
        C25588CiS ciS = this.A01;
        if (ciS != null) {
            Map map = ciS.A04;
            Iterator A0l = C17890vO.A0l(map);
            while (A0l.hasNext()) {
                ((C25739Cl9) A0l.next()).A02();
            }
            map.clear();
            this.A01 = null;
        }
        this.A02 = null;
    }

    public C26780DDk(C25639CjS cjS) {
        this.A03 = cjS;
    }
}
