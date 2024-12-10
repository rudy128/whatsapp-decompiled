package com.whatsapp.media.utwonet;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass6RK;
import X.C108945cZ;
import X.C18070vi;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import android.graphics.Bitmap;
import android.net.Uri;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.media.utwonet.UTwoNetViewModel$process$1", f = "UTwoNetViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class UTwoNetViewModel$process$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ int $maxDimension;
    public final /* synthetic */ int $minDimension;
    public final /* synthetic */ AnonymousClass6RK $predictionSize;
    public final /* synthetic */ List $types;
    public final /* synthetic */ Uri $uri;
    public int label;
    public final /* synthetic */ UTwoNetViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UTwoNetViewModel$process$1(Uri uri, UTwoNetViewModel uTwoNetViewModel, AnonymousClass6RK r4, List list, C30391dr r6, int i, int i2) {
        super(2, r6);
        this.this$0 = uTwoNetViewModel;
        this.$uri = uri;
        this.$minDimension = i;
        this.$maxDimension = i2;
        this.$types = list;
        this.$predictionSize = r4;
    }

    public static final Bitmap A00(int[] iArr, int i, int i2) {
        int[] iArr2 = iArr;
        int i3 = i;
        if (iArr.length == i * i2) {
            Bitmap A0H = C108945cZ.A0H(i, i2);
            C18070vi.A0X(A0H);
            A0H.setPixels(iArr2, 0, i3, 0, 0, i, i2);
            return A0H;
        }
        throw AnonymousClass000.A0n("Check failed.");
    }

    public final C30391dr create(Object obj, C30391dr r10) {
        UTwoNetViewModel uTwoNetViewModel = this.this$0;
        Uri uri = this.$uri;
        int i = this.$minDimension;
        int i2 = this.$maxDimension;
        return new UTwoNetViewModel$process$1(uri, uTwoNetViewModel, this.$predictionSize, this.$types, r10, i, i2);
    }

    public static final double[] A01(double d) {
        double d2 = d * d;
        double d3 = d2 * d;
        double d4 = d * 0.5d;
        return new double[]{(((-0.5d * d3) + d2) - d4) * 1.0d, (((1.5d * d3) - (2.5d * d2)) + 1.0d) * 1.0d, ((-1.5d * d3) + (2.0d * d2) + d4) * 1.0d, ((d3 * 0.5d) - (d2 * 0.5d)) * 1.0d};
    }

    /* JADX WARNING: type inference failed for: r0v21, types: [X.6VQ, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v38, types: [X.6VQ, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v124, types: [X.6VQ, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v143, types: [X.6VQ, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v177, types: [X.6VQ, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x03ae, code lost:
        if (r13[(r10 * r6) + r0] < r4[r9 + 1][r1 + 1]) goto L_0x03b0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r46) {
        /*
            r45 = this;
            r5 = r45
            int r0 = r5.label
            if (r0 != 0) goto L_0x0577
            X.C30691eM.A01(r46)
            com.whatsapp.media.utwonet.UTwoNetViewModel r0 = r5.this$0
            r44 = r0
            X.6c5 r4 = r0.A00
            if (r4 == 0) goto L_0x0574
            android.net.Uri r3 = r5.$uri
            int r2 = r5.$minDimension
            int r1 = r5.$maxDimension
            java.util.List r0 = r5.$types
            r38 = r0
            X.6RK r14 = r5.$predictionSize
            r0 = r44
            X.1Nq r0 = r0.A05     // Catch:{ OutOfMemoryError -> 0x0565, Exception -> 0x0561 }
            android.graphics.Bitmap r22 = r0.A07(r3, r2, r1)     // Catch:{ OutOfMemoryError -> 0x0565, Exception -> 0x0561 }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ OutOfMemoryError -> 0x0565, Exception -> 0x0561 }
            java.lang.String r1 = "UTwoNetViewModel/runProcess/sourceBitmap: width = "
            r0 = r22
            X.C108975cc.A0o(r0, r1, r2)     // Catch:{ OutOfMemoryError -> 0x0565, Exception -> 0x0561 }
            java.lang.String r0 = " ; height = "
            r2.append(r0)     // Catch:{ OutOfMemoryError -> 0x0565, Exception -> 0x0561 }
            int r0 = r22.getHeight()     // Catch:{ OutOfMemoryError -> 0x0565, Exception -> 0x0561 }
            X.C17900vP.A0o(r2, r0)     // Catch:{ OutOfMemoryError -> 0x0565, Exception -> 0x0561 }
            X.5oN r1 = new X.5oN     // Catch:{ OutOfMemoryError -> 0x0565, Exception -> 0x0561 }
            r0 = r22
            r1.<init>(r0)     // Catch:{ OutOfMemoryError -> 0x0565, Exception -> 0x0561 }
            java.util.List r3 = X.C18070vi.A0M(r1)     // Catch:{ OutOfMemoryError -> 0x0565, Exception -> 0x0561 }
            r2 = 1
            r0 = r38
            X.C18070vi.A0d(r0, r2)     // Catch:{ OutOfMemoryError -> 0x0565, Exception -> 0x0561 }
            boolean r1 = X.C108975cc.A1J(r14)     // Catch:{ OutOfMemoryError -> 0x0565, Exception -> 0x0561 }
            X.6ml r8 = r4.A00     // Catch:{ OutOfMemoryError -> 0x0565, Exception -> 0x0561 }
            java.lang.String r7 = "UTwoNet"
            boolean r0 = r8.A00()     // Catch:{ OutOfMemoryError -> 0x0565, Exception -> 0x0561 }
            if (r0 != 0) goto L_0x008c
            X.6VQ r0 = new X.6VQ     // Catch:{ OutOfMemoryError -> 0x0565, Exception -> 0x0561 }
            r0.<init>()     // Catch:{ OutOfMemoryError -> 0x0565, Exception -> 0x0561 }
            X.5oQ r2 = new X.5oQ     // Catch:{ OutOfMemoryError -> 0x0565, Exception -> 0x0561 }
            r2.<init>(r0)     // Catch:{ OutOfMemoryError -> 0x0565, Exception -> 0x0561 }
        L_0x0065:
            boolean r0 = r2 instanceof X.C114025oR     // Catch:{ OutOfMemoryError -> 0x0565, Exception -> 0x0561 }
            if (r0 == 0) goto L_0x0524
            java.lang.String r0 = "UTwoNetViewModel/processBitmap/successful"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ OutOfMemoryError -> 0x0565, Exception -> 0x0561 }
            X.5oR r2 = (X.C114025oR) r2     // Catch:{ OutOfMemoryError -> 0x0565, Exception -> 0x0561 }
            java.util.List r0 = r2.A00     // Catch:{ OutOfMemoryError -> 0x0565, Exception -> 0x0561 }
            java.util.ArrayList r3 = X.AnonymousClass000.A13()     // Catch:{ OutOfMemoryError -> 0x0565, Exception -> 0x0561 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ OutOfMemoryError -> 0x0565, Exception -> 0x0561 }
        L_0x007a:
            boolean r0 = r2.hasNext()     // Catch:{ OutOfMemoryError -> 0x0565, Exception -> 0x0561 }
            if (r0 == 0) goto L_0x0508
            java.lang.Object r1 = r2.next()     // Catch:{ OutOfMemoryError -> 0x0565, Exception -> 0x0561 }
            boolean r0 = r1 instanceof X.C113995oO     // Catch:{ OutOfMemoryError -> 0x0565, Exception -> 0x0561 }
            if (r0 == 0) goto L_0x007a
            r3.add(r1)     // Catch:{ OutOfMemoryError -> 0x0565, Exception -> 0x0561 }
            goto L_0x007a
        L_0x008c:
            java.lang.Object r1 = r3.get(r1)     // Catch:{ OutOfMemoryError -> 0x0565, Exception -> 0x0561 }
            java.lang.String r0 = "null cannot be cast to non-null type com.aiplatform.inputs.AiInputBitmap"
            X.C18070vi.A0z(r1, r0)     // Catch:{ OutOfMemoryError -> 0x0565, Exception -> 0x0561 }
            X.5oN r1 = (X.C113985oN) r1     // Catch:{ OutOfMemoryError -> 0x0565, Exception -> 0x0561 }
            android.graphics.Bitmap r0 = r1.A00     // Catch:{ OutOfMemoryError -> 0x0565, Exception -> 0x0561 }
            r43 = r0
            int r6 = r43.getWidth()     // Catch:{ OutOfMemoryError -> 0x0565, Exception -> 0x0561 }
            int r5 = r43.getHeight()     // Catch:{ OutOfMemoryError -> 0x0565, Exception -> 0x0561 }
            int r1 = r14.value     // Catch:{ OutOfMemoryError -> 0x0565, Exception -> 0x0561 }
            android.graphics.Bitmap r29 = android.graphics.Bitmap.createScaledBitmap(r0, r1, r1, r2)     // Catch:{ OutOfMemoryError -> 0x0565, Exception -> 0x0561 }
            X.C18070vi.A0X(r29)     // Catch:{ OutOfMemoryError -> 0x0565, Exception -> 0x0561 }
            r11 = 0
            int r9 = r29.getWidth()     // Catch:{ Exception -> 0x04ec }
            int r12 = r29.getHeight()     // Catch:{ Exception -> 0x04ec }
            int r13 = r12 * r9
            int[] r0 = new int[r13]     // Catch:{ Exception -> 0x04ec }
            r21 = r0
            r10 = 0
            r37 = 0
            r33 = r11
            r34 = r11
            r35 = r9
            r30 = r0
            r31 = r11
            r32 = r9
            r36 = r12
            r29.getPixels(r30, r31, r32, r33, r34, r35, r36)     // Catch:{ Exception -> 0x04ec }
            int r20 = r13 * 2
            int r0 = r9 * 3
            int r0 = r0 * r12
            r15 = 4
            int r0 = r0 * 4
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocateDirect(r0)     // Catch:{ Exception -> 0x04ec }
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()     // Catch:{ Exception -> 0x04ec }
            java.nio.ByteBuffer r0 = r1.order(r0)     // Catch:{ Exception -> 0x04ec }
            java.nio.FloatBuffer r4 = r0.asFloatBuffer()     // Catch:{ Exception -> 0x04ec }
        L_0x00e7:
            r19 = 1
            r3 = 2
            if (r10 >= r13) goto L_0x012d
            r1 = r21[r10]     // Catch:{ Exception -> 0x04ec }
            int r0 = r1 >> 16
            r0 = r0 & 255(0xff, float:3.57E-43)
            float r0 = (float) r0     // Catch:{ Exception -> 0x04ec }
            r16 = 1132396544(0x437f0000, float:255.0)
            float r0 = r0 / r16
            int r2 = r1 >> 8
            r2 = r2 & 255(0xff, float:3.57E-43)
            float r2 = (float) r2     // Catch:{ Exception -> 0x04ec }
            float r2 = r2 / r16
            r1 = r1 & 255(0xff, float:3.57E-43)
            float r1 = (float) r1     // Catch:{ Exception -> 0x04ec }
            float r1 = r1 / r16
            float[] r18 = X.AnonymousClass6Z0.A00     // Catch:{ Exception -> 0x04ec }
            r16 = r18[r11]     // Catch:{ Exception -> 0x04ec }
            float r0 = r0 - r16
            float[] r17 = X.AnonymousClass6Z0.A01     // Catch:{ Exception -> 0x04ec }
            r16 = r17[r11]     // Catch:{ Exception -> 0x04ec }
            float r0 = r0 / r16
            r4.put(r10, r0)     // Catch:{ Exception -> 0x04ec }
            int r0 = r13 + r10
            r16 = r18[r19]     // Catch:{ Exception -> 0x04ec }
            float r2 = r2 - r16
            r16 = r17[r19]     // Catch:{ Exception -> 0x04ec }
            float r2 = r2 / r16
            r4.put(r0, r2)     // Catch:{ Exception -> 0x04ec }
            int r0 = r20 + r10
            r2 = r18[r3]     // Catch:{ Exception -> 0x04ec }
            float r1 = r1 - r2
            r2 = r17[r3]     // Catch:{ Exception -> 0x04ec }
            float r1 = r1 / r2
            r4.put(r0, r1)     // Catch:{ Exception -> 0x04ec }
            int r10 = r10 + 1
            goto L_0x00e7
        L_0x012d:
            X.C18070vi.A0b(r4)     // Catch:{ Exception -> 0x04ec }
            long[] r2 = new long[r15]     // Catch:{ Exception -> 0x04ec }
            r0 = 1
            r2[r11] = r0     // Catch:{ Exception -> 0x04ec }
            r0 = 3
            r2[r19] = r0     // Catch:{ Exception -> 0x04ec }
            long r0 = (long) r12     // Catch:{ Exception -> 0x04ec }
            r2[r3] = r0     // Catch:{ Exception -> 0x04ec }
            long r0 = (long) r9     // Catch:{ Exception -> 0x04ec }
            r9 = 3
            r2[r9] = r0     // Catch:{ Exception -> 0x04ec }
            X.6eL r0 = new X.6eL     // Catch:{ Exception -> 0x04ec }
            r0.<init>(r4, r2)     // Catch:{ Exception -> 0x04ec }
            java.nio.FloatBuffer r2 = r0.A00     // Catch:{ Exception -> 0x04ec }
            long[] r1 = r0.A01     // Catch:{ Exception -> 0x04ec }
            X.C18070vi.A0d(r1, r3)     // Catch:{ Exception -> 0x04ec }
            X.0ve r4 = r8.A00     // Catch:{ Exception -> 0x04ec }
            r3 = 10857(0x2a69, float:1.5214E-41)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ Exception -> 0x04ec }
            boolean r0 = X.C18020vd.A05(r0, r4, r3)     // Catch:{ Exception -> 0x04ec }
            if (r0 == 0) goto L_0x0166
            X.00H r0 = r8.A01     // Catch:{ Exception -> 0x04ec }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x04ec }
            com.whatsapp.executorch.WhatsAppDynamicExecuTorchLoader r0 = (com.whatsapp.executorch.WhatsAppDynamicExecuTorchLoader) r0     // Catch:{ Exception -> 0x04ec }
            float[] r28 = r0.runModel(r7, r2, r1)     // Catch:{ Exception -> 0x04ec }
            goto L_0x0172
        L_0x0166:
            X.00H r0 = r8.A02     // Catch:{ Exception -> 0x04ec }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x04ec }
            com.whatsapp.pytorch.WhatsAppDynamicPytorchLoader r0 = (com.whatsapp.pytorch.WhatsAppDynamicPytorchLoader) r0     // Catch:{ Exception -> 0x04ec }
            float[] r28 = r0.runModel(r7, r2, r1)     // Catch:{ Exception -> 0x04ec }
        L_0x0172:
            if (r28 != 0) goto L_0x0180
            X.6VQ r0 = new X.6VQ     // Catch:{ Exception -> 0x04ec }
            r0.<init>()     // Catch:{ Exception -> 0x04ec }
            X.5oQ r2 = new X.5oQ     // Catch:{ Exception -> 0x04ec }
            r2.<init>(r0)     // Catch:{ Exception -> 0x04ec }
            goto L_0x0065
        L_0x0180:
            int r0 = r14.value     // Catch:{ Exception -> 0x04ec }
            r27 = r0
            double r7 = (double) r0     // Catch:{ Exception -> 0x04ec }
            double r0 = (double) r6     // Catch:{ Exception -> 0x04ec }
            double r25 = r7 / r0
            double r0 = (double) r5     // Catch:{ Exception -> 0x04ec }
            double r7 = r7 / r0
            int r15 = r6 * r5
            float[] r4 = new float[r15]     // Catch:{ Exception -> 0x04ec }
            r10 = 0
        L_0x018f:
            if (r10 >= r5) goto L_0x01ee
            r9 = 0
        L_0x0192:
            if (r9 >= r6) goto L_0x01eb
            double r2 = (double) r9     // Catch:{ Exception -> 0x04ec }
            double r2 = r2 * r25
            double r0 = (double) r10     // Catch:{ Exception -> 0x04ec }
            double r0 = r0 * r7
            int r12 = (int) r2     // Catch:{ Exception -> 0x04ec }
            r24 = r12
            int r12 = (int) r0     // Catch:{ Exception -> 0x04ec }
            r23 = r12
            r12 = r24
            double r12 = (double) r12     // Catch:{ Exception -> 0x04ec }
            double r2 = r2 - r12
            r12 = r23
            double r12 = (double) r12     // Catch:{ Exception -> 0x04ec }
            double r0 = r0 - r12
            double[] r21 = A01(r2)     // Catch:{ Exception -> 0x04ec }
            double[] r20 = A01(r0)     // Catch:{ Exception -> 0x04ec }
            r2 = 0
            r13 = 0
        L_0x01b2:
            r12 = 0
        L_0x01b3:
            int r1 = r24 + -1
            int r1 = r1 + r13
            int r14 = r27 + -1
            if (r1 >= r11) goto L_0x01de
            r1 = 0
        L_0x01bb:
            int r0 = r23 + -1
            int r0 = r0 + r12
            if (r0 >= r11) goto L_0x01c2
            r0 = 0
            goto L_0x01c5
        L_0x01c2:
            if (r0 <= r14) goto L_0x01c5
            r0 = r14
        L_0x01c5:
            r18 = r21[r13]     // Catch:{ Exception -> 0x04ec }
            r16 = r20[r12]     // Catch:{ Exception -> 0x04ec }
            double r18 = r18 * r16
            int r0 = r0 * r27
            int r0 = r0 + r1
            r0 = r28[r0]     // Catch:{ Exception -> 0x04ec }
            double r0 = (double) r0     // Catch:{ Exception -> 0x04ec }
            double r0 = r0 * r18
            double r2 = r2 + r0
            int r12 = r12 + 1
            r0 = 4
            if (r12 < r0) goto L_0x01b3
            int r13 = r13 + 1
            if (r13 < r0) goto L_0x01b2
            goto L_0x01e2
        L_0x01de:
            if (r1 <= r14) goto L_0x01bb
            r1 = r14
            goto L_0x01bb
        L_0x01e2:
            int r1 = r10 * r6
            int r1 = r1 + r9
            float r0 = (float) r2     // Catch:{ Exception -> 0x04ec }
            r4[r1] = r0     // Catch:{ Exception -> 0x04ec }
            int r9 = r9 + 1
            goto L_0x0192
        L_0x01eb:
            int r10 = r10 + 1
            goto L_0x018f
        L_0x01ee:
            if (r15 == 0) goto L_0x04e0
            r3 = r4[r11]     // Catch:{ Exception -> 0x04ec }
            r8 = r3
            int r2 = r15 + -1
            r1 = 1
            if (r1 > r2) goto L_0x0203
        L_0x01f8:
            r0 = r4[r1]     // Catch:{ Exception -> 0x04ec }
            float r3 = java.lang.Math.max(r3, r0)     // Catch:{ Exception -> 0x04ec }
            if (r1 == r2) goto L_0x0203
            int r1 = r1 + 1
            goto L_0x01f8
        L_0x0203:
            java.lang.Float r0 = java.lang.Float.valueOf(r3)     // Catch:{ Exception -> 0x04ec }
            r3 = 0
            if (r0 == 0) goto L_0x04e0
            float r7 = r0.floatValue()     // Catch:{ Exception -> 0x04ec }
            r1 = 1
            if (r1 > r2) goto L_0x021c
        L_0x0211:
            r0 = r4[r1]     // Catch:{ Exception -> 0x04ec }
            float r8 = java.lang.Math.min(r8, r0)     // Catch:{ Exception -> 0x04ec }
            if (r1 == r2) goto L_0x021c
            int r1 = r1 + 1
            goto L_0x0211
        L_0x021c:
            java.lang.Float r0 = java.lang.Float.valueOf(r8)     // Catch:{ Exception -> 0x04ec }
            if (r0 == 0) goto L_0x04e0
            float r2 = r0.floatValue()     // Catch:{ Exception -> 0x04ec }
        L_0x0226:
            r1 = r4[r3]     // Catch:{ Exception -> 0x04ec }
            float r1 = r1 - r2
            float r0 = r7 - r2
            float r1 = r1 / r0
            r4[r3] = r1     // Catch:{ Exception -> 0x04ec }
            r0 = 1056964608(0x3f000000, float:0.5)
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r0 = 0
            if (r1 <= 0) goto L_0x0237
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x0237:
            r4[r3] = r0     // Catch:{ Exception -> 0x04ec }
            int r3 = r3 + 1
            if (r3 < r15) goto L_0x0226
            java.util.ArrayList r21 = X.AnonymousClass000.A13()     // Catch:{ Exception -> 0x04ec }
            java.util.Iterator r20 = r38.iterator()     // Catch:{ Exception -> 0x04ec }
        L_0x0245:
            boolean r0 = r20.hasNext()     // Catch:{ Exception -> 0x04ec }
            if (r0 == 0) goto L_0x04d7
            java.lang.String r11 = X.C17880vN.A0v(r20)     // Catch:{ Exception -> 0x04ec }
            int r0 = r11.hashCode()     // Catch:{ Exception -> 0x04ec }
            switch(r0) {
                case -1630362878: goto L_0x0305;
                case -379005363: goto L_0x02b0;
                case -222102746: goto L_0x02a1;
                case 1725137378: goto L_0x0262;
                default: goto L_0x0256;
            }     // Catch:{ Exception -> 0x04ec }
        L_0x0256:
            X.6VQ r0 = new X.6VQ     // Catch:{ Exception -> 0x04ec }
            r0.<init>()     // Catch:{ Exception -> 0x04ec }
            X.5oQ r2 = new X.5oQ     // Catch:{ Exception -> 0x04ec }
            r2.<init>(r0)     // Catch:{ Exception -> 0x04ec }
            goto L_0x0065
        L_0x0262:
            java.lang.String r0 = "MASK_BITMAP"
            boolean r0 = r11.equals(r0)     // Catch:{ Exception -> 0x04ec }
            if (r0 == 0) goto L_0x0256
            int r8 = r29.getWidth()     // Catch:{ Exception -> 0x04ec }
            int r7 = r29.getHeight()     // Catch:{ Exception -> 0x04ec }
            int r0 = r8 * r7
            int[] r3 = new int[r0]     // Catch:{ Exception -> 0x04ec }
            r9 = 0
        L_0x0277:
            if (r9 >= r7) goto L_0x0291
            r2 = 0
        L_0x027a:
            if (r2 >= r8) goto L_0x028e
            int r10 = r9 * r8
            int r10 = r10 + r2
            r1 = r4[r10]     // Catch:{ Exception -> 0x04ec }
            r0 = 1132396544(0x437f0000, float:255.0)
            float r1 = r1 * r0
            int r0 = (int) r1     // Catch:{ Exception -> 0x04ec }
            int r0 = android.graphics.Color.rgb(r0, r0, r0)     // Catch:{ Exception -> 0x04ec }
            r3[r10] = r0     // Catch:{ Exception -> 0x04ec }
            int r2 = r2 + 1
            goto L_0x027a
        L_0x028e:
            int r9 = r9 + 1
            goto L_0x0277
        L_0x0291:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ Exception -> 0x04ec }
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r3, r8, r7, r0)     // Catch:{ Exception -> 0x04ec }
            X.C18070vi.A0X(r0)     // Catch:{ Exception -> 0x04ec }
            X.5oO r1 = new X.5oO     // Catch:{ Exception -> 0x04ec }
            r1.<init>(r0, r11)     // Catch:{ Exception -> 0x04ec }
            goto L_0x04a4
        L_0x02a1:
            java.lang.String r0 = "MASK_ARRAY"
            boolean r0 = r11.equals(r0)     // Catch:{ Exception -> 0x04ec }
            if (r0 == 0) goto L_0x0256
            X.5oP r1 = new X.5oP     // Catch:{ Exception -> 0x04ec }
            r1.<init>(r11, r4)     // Catch:{ Exception -> 0x04ec }
            goto L_0x04a4
        L_0x02b0:
            java.lang.String r0 = "WA_CUTOUT_BITMAP"
            boolean r0 = r11.equals(r0)     // Catch:{ Exception -> 0x04ec }
            if (r0 == 0) goto L_0x0256
            float[] r4 = X.C137556ve.A00(r4, r6, r5)     // Catch:{ Exception -> 0x04ec }
            r7 = 1
            int[] r3 = new int[r15]     // Catch:{ Exception -> 0x04ec }
            r2 = 0
        L_0x02c0:
            if (r2 >= r15) goto L_0x02d1
            r1 = r4[r2]     // Catch:{ Exception -> 0x04ec }
            r0 = 1056964608(0x3f000000, float:0.5)
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r0 = 0
            if (r1 < 0) goto L_0x02cc
            r0 = -1
        L_0x02cc:
            r3[r2] = r0     // Catch:{ Exception -> 0x04ec }
            int r2 = r2 + 1
            goto L_0x02c0
        L_0x02d1:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ Exception -> 0x04ec }
            android.graphics.Bitmap r9 = android.graphics.Bitmap.createBitmap(r3, r6, r5, r0)     // Catch:{ Exception -> 0x04ec }
            X.C18070vi.A0X(r9)     // Catch:{ Exception -> 0x04ec }
            android.graphics.Bitmap r8 = android.graphics.Bitmap.createBitmap(r6, r5, r0)     // Catch:{ Exception -> 0x04ec }
            X.C18070vi.A0X(r8)     // Catch:{ Exception -> 0x04ec }
            android.graphics.Paint r7 = X.C108945cZ.A0K(r7)     // Catch:{ Exception -> 0x04ec }
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.DST_IN     // Catch:{ Exception -> 0x04ec }
            X.C108965cb.A11(r7, r0)     // Catch:{ Exception -> 0x04ec }
            android.graphics.Canvas r3 = X.C108945cZ.A0I(r8)     // Catch:{ Exception -> 0x04ec }
            r2 = 0
            r1 = 0
            r0 = r43
            r3.drawBitmap(r0, r1, r1, r2)     // Catch:{ Exception -> 0x04ec }
            r3.drawBitmap(r9, r1, r1, r7)     // Catch:{ Exception -> 0x04ec }
            r9.recycle()     // Catch:{ Exception -> 0x04ec }
            r43.recycle()     // Catch:{ Exception -> 0x04ec }
            X.5oO r1 = new X.5oO     // Catch:{ Exception -> 0x04ec }
            r1.<init>(r8, r11)     // Catch:{ Exception -> 0x04ec }
            goto L_0x04a4
        L_0x0305:
            java.lang.String r0 = "CUTOUT_BITMAP"
            boolean r0 = r11.equals(r0)     // Catch:{ Exception -> 0x04ec }
            if (r0 == 0) goto L_0x0256
            int r14 = r4.length     // Catch:{ Exception -> 0x04ec }
            float[] r13 = new float[r14]     // Catch:{ Exception -> 0x04ec }
            r2 = 3
            float[][] r12 = new float[r2][]     // Catch:{ Exception -> 0x04ec }
            float[] r0 = new float[r2]     // Catch:{ Exception -> 0x04ec }
            r0 = {1065353216, 1065353216, 1065353216} // fill-array     // Catch:{ Exception -> 0x04ec }
            r12[r37] = r0     // Catch:{ Exception -> 0x04ec }
            float[] r1 = new float[r2]     // Catch:{ Exception -> 0x04ec }
            r1 = {1065353216, 1065353216, 1065353216} // fill-array     // Catch:{ Exception -> 0x04ec }
            r0 = 1
            r12[r0] = r1     // Catch:{ Exception -> 0x04ec }
            float[] r1 = new float[r2]     // Catch:{ Exception -> 0x04ec }
            r1 = {1065353216, 1065353216, 1065353216} // fill-array     // Catch:{ Exception -> 0x04ec }
            r0 = 2
            r12[r0] = r1     // Catch:{ Exception -> 0x04ec }
            r10 = 0
        L_0x032b:
            r9 = 0
        L_0x032c:
            if (r9 >= r5) goto L_0x0366
            r8 = 0
        L_0x032f:
            if (r8 >= r6) goto L_0x0363
            r7 = 0
            r3 = -1
        L_0x0333:
            r2 = -1
        L_0x0334:
            int r1 = r9 + r3
            int r0 = r8 + r2
            if (r1 < 0) goto L_0x0352
            if (r1 >= r5) goto L_0x0352
            if (r0 < 0) goto L_0x0352
            if (r0 >= r6) goto L_0x0352
            int r16 = r3 + 1
            r17 = r12[r16]     // Catch:{ Exception -> 0x04ec }
            int r16 = r2 + 1
            r16 = r17[r16]     // Catch:{ Exception -> 0x04ec }
            int r1 = r1 * r6
            int r1 = r1 + r0
            r0 = r4[r1]     // Catch:{ Exception -> 0x04ec }
            float r0 = r0 * r16
            float r7 = java.lang.Math.max(r7, r0)     // Catch:{ Exception -> 0x04ec }
        L_0x0352:
            int r2 = r2 + 1
            r0 = 2
            if (r2 < r0) goto L_0x0334
            int r3 = r3 + 1
            if (r3 < r0) goto L_0x0333
            int r0 = r9 * r6
            int r0 = r0 + r8
            r13[r0] = r7     // Catch:{ Exception -> 0x04ec }
            int r8 = r8 + 1
            goto L_0x032f
        L_0x0363:
            int r9 = r9 + 1
            goto L_0x032c
        L_0x0366:
            int r10 = r10 + 1
            r0 = 5
            if (r10 < r0) goto L_0x032b
            float[] r7 = new float[r14]     // Catch:{ Exception -> 0x04ec }
            r2 = 3
            float[][] r4 = new float[r2][]     // Catch:{ Exception -> 0x04ec }
            float[] r0 = new float[r2]     // Catch:{ Exception -> 0x04ec }
            r0 = {1065353216, 1065353216, 1065353216} // fill-array     // Catch:{ Exception -> 0x04ec }
            r4[r37] = r0     // Catch:{ Exception -> 0x04ec }
            float[] r1 = new float[r2]     // Catch:{ Exception -> 0x04ec }
            r1 = {1065353216, 1065353216, 1065353216} // fill-array     // Catch:{ Exception -> 0x04ec }
            r0 = 1
            r4[r0] = r1     // Catch:{ Exception -> 0x04ec }
            float[] r1 = new float[r2]     // Catch:{ Exception -> 0x04ec }
            r1 = {1065353216, 1065353216, 1065353216} // fill-array     // Catch:{ Exception -> 0x04ec }
            r0 = 2
            r4[r0] = r1     // Catch:{ Exception -> 0x04ec }
            r3 = 0
        L_0x0388:
            r8 = 0
        L_0x0389:
            if (r8 >= r5) goto L_0x03ca
            r2 = 0
        L_0x038c:
            if (r2 >= r6) goto L_0x03c7
            r9 = -1
            r12 = 1
        L_0x0390:
            r1 = -1
        L_0x0391:
            int r10 = r8 + r9
            int r0 = r2 + r1
            if (r10 < 0) goto L_0x03b0
            if (r10 >= r5) goto L_0x03b0
            if (r0 < 0) goto L_0x03b0
            if (r0 >= r6) goto L_0x03b0
            if (r12 == 0) goto L_0x03b0
            int r10 = r10 * r6
            int r10 = r10 + r0
            r12 = r13[r10]     // Catch:{ Exception -> 0x04ec }
            int r0 = r9 + 1
            r10 = r4[r0]     // Catch:{ Exception -> 0x04ec }
            int r0 = r1 + 1
            r0 = r10[r0]     // Catch:{ Exception -> 0x04ec }
            int r0 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r12 = 1
            if (r0 >= 0) goto L_0x03b1
        L_0x03b0:
            r12 = 0
        L_0x03b1:
            int r1 = r1 + 1
            r0 = 2
            if (r1 < r0) goto L_0x0391
            int r9 = r9 + 1
            if (r9 < r0) goto L_0x0390
            int r1 = r8 * r6
            int r1 = r1 + r2
            r0 = 0
            if (r12 == 0) goto L_0x03c2
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x03c2:
            r7[r1] = r0     // Catch:{ Exception -> 0x04ec }
            int r2 = r2 + 1
            goto L_0x038c
        L_0x03c7:
            int r8 = r8 + 1
            goto L_0x0389
        L_0x03ca:
            int r3 = r3 + 1
            r0 = 5
            if (r3 < r0) goto L_0x0388
            float[] r9 = X.C137556ve.A00(r7, r6, r5)     // Catch:{ Exception -> 0x04ec }
            int r0 = r9.length     // Catch:{ Exception -> 0x04ec }
            float[] r4 = java.util.Arrays.copyOf(r9, r0)     // Catch:{ Exception -> 0x04ec }
            X.C18070vi.A0X(r4)     // Catch:{ Exception -> 0x04ec }
            r8 = 0
        L_0x03dc:
            if (r8 >= r5) goto L_0x0425
            r7 = 0
        L_0x03df:
            if (r7 >= r6) goto L_0x0422
            int r19 = r8 * r6
            int r19 = r19 + r7
            int[] r18 = X.C108945cZ.A1W()     // Catch:{ Exception -> 0x04ec }
            r18 = {1, 1} // fill-array     // Catch:{ Exception -> 0x04ec }
            int[][] r17 = X.C124556Yu.A01     // Catch:{ Exception -> 0x04ec }
            r3 = 9
            r16 = 0
            r2 = 0
        L_0x03f3:
            r0 = r17[r2]     // Catch:{ Exception -> 0x04ec }
            r14 = r0[r37]     // Catch:{ Exception -> 0x04ec }
            int r1 = r8 + r14
            r13 = 1
            r12 = r0[r13]     // Catch:{ Exception -> 0x04ec }
            int r0 = r7 + r12
            if (r1 < 0) goto L_0x0419
            if (r1 >= r5) goto L_0x0419
            if (r0 < 0) goto L_0x0419
            if (r0 >= r6) goto L_0x0419
            int r1 = r1 * r6
            int r1 = r1 + r0
            r10 = r9[r1]     // Catch:{ Exception -> 0x04ec }
            float[][] r1 = X.C124556Yu.A00     // Catch:{ Exception -> 0x04ec }
            r0 = r18[r37]     // Catch:{ Exception -> 0x04ec }
            int r0 = r0 + r14
            r1 = r1[r0]     // Catch:{ Exception -> 0x04ec }
            r0 = r18[r13]     // Catch:{ Exception -> 0x04ec }
            int r0 = r0 + r12
            r0 = r1[r0]     // Catch:{ Exception -> 0x04ec }
            float r10 = r10 * r0
            float r16 = r16 + r10
        L_0x0419:
            int r2 = r2 + 1
            if (r2 < r3) goto L_0x03f3
            r4[r19] = r16     // Catch:{ Exception -> 0x04ec }
            int r7 = r7 + 1
            goto L_0x03df
        L_0x0422:
            int r8 = r8 + 1
            goto L_0x03dc
        L_0x0425:
            int r10 = r43.getWidth()     // Catch:{ Exception -> 0x04ec }
            int r3 = r43.getHeight()     // Catch:{ Exception -> 0x04ec }
            int r38 = r43.getWidth()     // Catch:{ Exception -> 0x04ec }
            int r42 = r43.getHeight()     // Catch:{ Exception -> 0x04ec }
            int r0 = r38 * r42
            int[] r9 = new int[r0]     // Catch:{ Exception -> 0x04ec }
            r40 = r37
            r35 = r43
            r36 = r9
            r39 = r37
            r41 = r38
            r35.getPixels(r36, r37, r38, r39, r40, r41, r42)     // Catch:{ Exception -> 0x04ec }
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = 2147483647(0x7fffffff, float:NaN)
            android.graphics.Rect r13 = new android.graphics.Rect     // Catch:{ Exception -> 0x04ec }
            r13.<init>(r7, r7, r0, r0)     // Catch:{ Exception -> 0x04ec }
            r8 = 0
        L_0x0451:
            if (r8 >= r10) goto L_0x048f
            r2 = 0
        L_0x0454:
            if (r2 >= r3) goto L_0x048c
            int r12 = r2 * r10
            int r12 = r12 + r8
            r1 = r4[r12]     // Catch:{ Exception -> 0x04ec }
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0481
            int r0 = r13.left     // Catch:{ Exception -> 0x04ec }
            int r0 = java.lang.Math.min(r8, r0)     // Catch:{ Exception -> 0x04ec }
            r13.left = r0     // Catch:{ Exception -> 0x04ec }
            int r0 = r13.right     // Catch:{ Exception -> 0x04ec }
            int r0 = java.lang.Math.max(r8, r0)     // Catch:{ Exception -> 0x04ec }
            r13.right = r0     // Catch:{ Exception -> 0x04ec }
            int r0 = r13.top     // Catch:{ Exception -> 0x04ec }
            int r0 = java.lang.Math.min(r2, r0)     // Catch:{ Exception -> 0x04ec }
            r13.top = r0     // Catch:{ Exception -> 0x04ec }
            int r0 = r13.bottom     // Catch:{ Exception -> 0x04ec }
            int r0 = java.lang.Math.max(r2, r0)     // Catch:{ Exception -> 0x04ec }
            r13.bottom = r0     // Catch:{ Exception -> 0x04ec }
            goto L_0x0489
        L_0x0481:
            r1 = r9[r12]     // Catch:{ Exception -> 0x04ec }
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            r1 = r1 & r0
            r9[r12] = r1     // Catch:{ Exception -> 0x04ec }
        L_0x0489:
            int r2 = r2 + 1
            goto L_0x0454
        L_0x048c:
            int r8 = r8 + 1
            goto L_0x0451
        L_0x048f:
            int r0 = r13.left     // Catch:{ Exception -> 0x04ec }
            if (r0 != r7) goto L_0x04ab
            int r1 = r43.getWidth()     // Catch:{ Exception -> 0x04ec }
            int r0 = r43.getHeight()     // Catch:{ Exception -> 0x04ec }
            android.graphics.Bitmap r0 = A00(r9, r1, r0)     // Catch:{ Exception -> 0x04ec }
        L_0x049f:
            X.5oO r1 = new X.5oO     // Catch:{ Exception -> 0x04ec }
            r1.<init>(r0, r11)     // Catch:{ Exception -> 0x04ec }
        L_0x04a4:
            r0 = r21
            r0.add(r1)     // Catch:{ Exception -> 0x04ec }
            goto L_0x0245
        L_0x04ab:
            int r12 = r13.width()     // Catch:{ Exception -> 0x04ec }
            int r8 = r13.height()     // Catch:{ Exception -> 0x04ec }
            int r0 = r12 * r8
            int[] r7 = new int[r0]     // Catch:{ Exception -> 0x04ec }
            r3 = 0
        L_0x04b8:
            if (r3 >= r12) goto L_0x04d2
            r2 = 0
        L_0x04bb:
            if (r2 >= r8) goto L_0x04cf
            int r1 = r13.left     // Catch:{ Exception -> 0x04ec }
            int r1 = r1 + r3
            int r0 = r13.top     // Catch:{ Exception -> 0x04ec }
            int r0 = r0 + r2
            int r0 = r0 * r10
            int r1 = r1 + r0
            int r14 = r2 * r12
            int r14 = r14 + r3
            r0 = r9[r1]     // Catch:{ Exception -> 0x04ec }
            r7[r14] = r0     // Catch:{ Exception -> 0x04ec }
            int r2 = r2 + 1
            goto L_0x04bb
        L_0x04cf:
            int r3 = r3 + 1
            goto L_0x04b8
        L_0x04d2:
            android.graphics.Bitmap r0 = A00(r7, r12, r8)     // Catch:{ Exception -> 0x04ec }
            goto L_0x049f
        L_0x04d7:
            X.5oR r2 = new X.5oR     // Catch:{ Exception -> 0x04ec }
            r0 = r21
            r2.<init>(r0)     // Catch:{ Exception -> 0x04ec }
            goto L_0x0065
        L_0x04e0:
            X.6VQ r0 = new X.6VQ     // Catch:{ Exception -> 0x04ec }
            r0.<init>()     // Catch:{ Exception -> 0x04ec }
            X.5oQ r2 = new X.5oQ     // Catch:{ Exception -> 0x04ec }
            r2.<init>(r0)     // Catch:{ Exception -> 0x04ec }
            goto L_0x0065
        L_0x04ec:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ OutOfMemoryError -> 0x0565, Exception -> 0x0561 }
            java.lang.String r0 = "Prediction Error "
            r1.append(r0)     // Catch:{ OutOfMemoryError -> 0x0565, Exception -> 0x0561 }
            r1.append(r2)     // Catch:{ OutOfMemoryError -> 0x0565, Exception -> 0x0561 }
            r1.toString()     // Catch:{ OutOfMemoryError -> 0x0565, Exception -> 0x0561 }
            X.6VQ r0 = new X.6VQ     // Catch:{ OutOfMemoryError -> 0x0565, Exception -> 0x0561 }
            r0.<init>()     // Catch:{ OutOfMemoryError -> 0x0565, Exception -> 0x0561 }
            X.5oQ r2 = new X.5oQ     // Catch:{ OutOfMemoryError -> 0x0565, Exception -> 0x0561 }
            r2.<init>(r0)     // Catch:{ OutOfMemoryError -> 0x0565, Exception -> 0x0561 }
            goto L_0x0065
        L_0x0508:
            java.util.ArrayList r2 = X.AnonymousClass000.A13()     // Catch:{ OutOfMemoryError -> 0x0565, Exception -> 0x0561 }
            java.util.Iterator r1 = r3.iterator()     // Catch:{ OutOfMemoryError -> 0x0565, Exception -> 0x0561 }
        L_0x0510:
            boolean r0 = r1.hasNext()     // Catch:{ OutOfMemoryError -> 0x0565, Exception -> 0x0561 }
            if (r0 == 0) goto L_0x0544
            java.lang.Object r0 = r1.next()     // Catch:{ OutOfMemoryError -> 0x0565, Exception -> 0x0561 }
            X.5oO r0 = (X.C113995oO) r0     // Catch:{ OutOfMemoryError -> 0x0565, Exception -> 0x0561 }
            android.graphics.Bitmap r0 = r0.A00     // Catch:{ OutOfMemoryError -> 0x0565, Exception -> 0x0561 }
            if (r0 == 0) goto L_0x0510
            r2.add(r0)     // Catch:{ OutOfMemoryError -> 0x0565, Exception -> 0x0561 }
            goto L_0x0510
        L_0x0524:
            java.lang.String r0 = "UTwoNetViewModel/processBitmap/unsuccessful"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ OutOfMemoryError -> 0x0565, Exception -> 0x0561 }
            boolean r0 = r2 instanceof X.C114015oQ     // Catch:{ OutOfMemoryError -> 0x0565, Exception -> 0x0561 }
            if (r0 == 0) goto L_0x053d
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ OutOfMemoryError -> 0x0565, Exception -> 0x0561 }
            java.lang.String r0 = "UTwoNetViewModel/processBitmap/"
            r1.append(r0)     // Catch:{ OutOfMemoryError -> 0x0565, Exception -> 0x0561 }
            X.5oQ r2 = (X.C114015oQ) r2     // Catch:{ OutOfMemoryError -> 0x0565, Exception -> 0x0561 }
            X.6VQ r0 = r2.A00     // Catch:{ OutOfMemoryError -> 0x0565, Exception -> 0x0561 }
            X.C17900vP.A0b(r0, r1)     // Catch:{ OutOfMemoryError -> 0x0565, Exception -> 0x0561 }
        L_0x053d:
            r0 = r44
            X.1DT r0 = r0.A02     // Catch:{ OutOfMemoryError -> 0x0565, Exception -> 0x0561 }
            X.68t r1 = X.C1195768t.A00     // Catch:{ OutOfMemoryError -> 0x0565, Exception -> 0x0561 }
            goto L_0x0554
        L_0x0544:
            java.util.List r2 = X.C29431cG.A0t(r2)     // Catch:{ OutOfMemoryError -> 0x0565, Exception -> 0x0561 }
            boolean r0 = r2.isEmpty()     // Catch:{ OutOfMemoryError -> 0x0565, Exception -> 0x0561 }
            if (r0 == 0) goto L_0x055b
            X.68t r1 = X.C1195768t.A00     // Catch:{ OutOfMemoryError -> 0x0565, Exception -> 0x0561 }
        L_0x0550:
            r0 = r44
            X.1DT r0 = r0.A02     // Catch:{ OutOfMemoryError -> 0x0565, Exception -> 0x0561 }
        L_0x0554:
            r0.A0E(r1)     // Catch:{ OutOfMemoryError -> 0x0565, Exception -> 0x0561 }
            r22.recycle()     // Catch:{ OutOfMemoryError -> 0x0565, Exception -> 0x0561 }
            goto L_0x0574
        L_0x055b:
            X.68s r1 = new X.68s     // Catch:{ OutOfMemoryError -> 0x0565, Exception -> 0x0561 }
            r1.<init>(r2)     // Catch:{ OutOfMemoryError -> 0x0565, Exception -> 0x0561 }
            goto L_0x0550
        L_0x0561:
            r1 = move-exception
            java.lang.String r0 = "UTwoNetViewModel/process/uri/error"
            goto L_0x0568
        L_0x0565:
            r1 = move-exception
            java.lang.String r0 = "UTwoNetViewModel/process/uri/oom"
        L_0x0568:
            com.whatsapp.util.Log.e(r0, r1)
            r0 = r44
            X.1DT r1 = r0.A02
            X.68t r0 = X.C1195768t.A00
            r1.A0E(r0)
        L_0x0574:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0577:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.media.utwonet.UTwoNetViewModel$process$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((UTwoNetViewModel$process$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
