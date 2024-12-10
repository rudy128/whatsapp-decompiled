package X;

import com.facebook.cameracore.ardelivery.model.ARAssetType;
import com.facebook.cameracore.ardelivery.model.ARRequestAsset$CompressionMethod;
import com.facebook.cameracore.ardelivery.model.EffectAssetType;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import java.nio.ByteBuffer;

public class A6K {
    public VersionedCapability A00;
    public final int A01;
    public final ARAssetType A02;
    public final ARRequestAsset$CompressionMethod A03;
    public final EffectAssetType A04;
    public final AnonymousClass9IY A05;
    public final AnonymousClass9JJ A06;
    public final Boolean A07;
    public final Boolean A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;

    public static void A01(String str, ByteBuffer byteBuffer) {
        if (str == null) {
            byteBuffer.putInt(-1);
            return;
        }
        byteBuffer.putInt(str.getBytes().length);
        byteBuffer.put(str.getBytes());
    }

    public VersionedCapability A02() {
        C26159CtX.A04(AnonymousClass000.A1Z(this.A02, ARAssetType.SUPPORT), "Cannot get VersionedCapability from Effect Asset");
        return this.A00;
    }

    public String A03() {
        ARAssetType aRAssetType = this.A02;
        int ordinal = aRAssetType.ordinal();
        if (ordinal == 0) {
            EffectAssetType effectAssetType = this.A04;
            if (effectAssetType == null) {
                return null;
            }
            return effectAssetType.name();
        } else if (ordinal == 1) {
            VersionedCapability versionedCapability = this.A00;
            C26159CtX.A01(versionedCapability);
            return versionedCapability.toServerValue();
        } else if (ordinal == 2 || ordinal == 3) {
            AnonymousClass9IY r0 = this.A05;
            C26159CtX.A01(r0);
            return r0.toString();
        } else {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Unsupported asset type: ");
            throw AnonymousClass000.A0o(aRAssetType.toString(), A10);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:119:0x01c0, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x01c1, code lost:
        r4 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:?, code lost:
        r6 = com.facebook.cameracore.ardelivery.model.VersionedCapability.fromServerValue(r2);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:81:0x0129 */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x017c A[Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0183 A[Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x018a A[Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0196 A[Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x019e A[Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01ae A[Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01b5 A[Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x01bd A[Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x01c0 A[ExcHandler: IllegalArgumentException | IllegalStateException | BufferUnderflowException (e java.lang.Throwable), PHI: r2 
      PHI: (r2v5 java.lang.String) = (r2v4 java.lang.String), (r2v7 java.lang.String), (r2v6 java.lang.String), (r2v6 java.lang.String) binds: [B:9:0x0031, B:91:0x014e, B:25:0x006b, B:81:0x0129] A[DONT_GENERATE, DONT_INLINE], Splitter:B:9:0x0031] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0160 A[Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x016c A[Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c0 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public A6K(java.nio.ByteBuffer r10) {
        /*
            r9 = this;
            r9.<init>()
            int r5 = r10.remaining()
            r4 = 0
            long r2 = r10.getLong()     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01d5 }
            r6 = 7310021016723351138(0x65726962726f6662, double:4.774966457081997E180)
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x01c6
            java.lang.String r1 = A00(r10)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01d5 }
            X.C26159CtX.A01(r1)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01d5 }
            r9.A0A = r1     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c3 }
            java.lang.String r6 = A00(r10)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c3 }
            r9.A0B = r6     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01d8 }
            java.lang.String r6 = A00(r10)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01d8 }
            r9.A0C = r6     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01d8 }
            java.lang.String r2 = A00(r10)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01d8 }
            X.C26159CtX.A01(r2)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01d8 }
            com.facebook.cameracore.ardelivery.model.ARAssetType r7 = com.facebook.cameracore.ardelivery.model.ARAssetType.valueOf(r2)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c0 }
            r9.A02 = r7     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c0 }
            java.lang.String r2 = A00(r10)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c0 }
            int r6 = r7.ordinal()     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c0 }
            r3 = 0
            if (r6 == r3) goto L_0x0130
            r0 = 1
            if (r6 == r0) goto L_0x0069
            r0 = 2
            if (r6 == r0) goto L_0x005d
            r0 = 3
            if (r6 == r0) goto L_0x005d
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c0 }
            java.lang.String r0 = "Illegal asset type: "
            r3.append(r0)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c0 }
            java.lang.String r0 = r7.toString()     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c0 }
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0o(r0, r3)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c0 }
            throw r0     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c0 }
        L_0x005d:
            if (r2 != 0) goto L_0x0064
            r7 = r4
        L_0x0060:
            r6 = r4
            r0 = r4
            goto L_0x013b
        L_0x0064:
            X.9IY r7 = X.AnonymousClass9IY.valueOf(r2)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c0 }
            goto L_0x0060
        L_0x0069:
            java.lang.String r6 = "AML_FACE_TRACKER"
            boolean r0 = r2.equals(r6)     // Catch:{ IllegalArgumentException -> 0x0129, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c0 }
            if (r0 == 0) goto L_0x0084
            java.lang.Integer r0 = X.AnonymousClass00R.A00     // Catch:{ IllegalArgumentException -> 0x0129, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c0 }
        L_0x0073:
            int r8 = r0.intValue()     // Catch:{ IllegalArgumentException -> 0x0129, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c0 }
            switch(r8) {
                case 0: goto L_0x0102;
                case 1: goto L_0x007a;
                case 2: goto L_0x0105;
                case 3: goto L_0x0108;
                case 4: goto L_0x010b;
                case 5: goto L_0x010e;
                case 6: goto L_0x0111;
                case 7: goto L_0x0114;
                case 8: goto L_0x0117;
                case 9: goto L_0x011a;
                default: goto L_0x007a;
            }     // Catch:{ IllegalArgumentException -> 0x0129, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c0 }
        L_0x007a:
            java.lang.StringBuilder r7 = X.AnonymousClass000.A10()     // Catch:{ IllegalArgumentException -> 0x0129, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c0 }
            java.lang.String r0 = "VersionedCapability is not set up for the given SupportAssetType:"
            r7.append(r0)     // Catch:{ IllegalArgumentException -> 0x0129, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c0 }
            goto L_0x00e7
        L_0x0084:
            java.lang.String r0 = "TARGET_RECOGNITION"
            boolean r0 = r2.equals(r0)     // Catch:{ IllegalArgumentException -> 0x0129, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c0 }
            if (r0 == 0) goto L_0x008f
            java.lang.Integer r0 = X.AnonymousClass00R.A01     // Catch:{ IllegalArgumentException -> 0x0129, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c0 }
            goto L_0x0073
        L_0x008f:
            java.lang.String r0 = "SEGMENTATION"
            boolean r0 = r2.equals(r0)     // Catch:{ IllegalArgumentException -> 0x0129, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c0 }
            if (r0 == 0) goto L_0x009a
            java.lang.Integer r0 = X.AnonymousClass00R.A0C     // Catch:{ IllegalArgumentException -> 0x0129, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c0 }
            goto L_0x0073
        L_0x009a:
            java.lang.String r0 = "HAIR_SEGMENTATION"
            boolean r0 = r2.equals(r0)     // Catch:{ IllegalArgumentException -> 0x0129, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c0 }
            if (r0 == 0) goto L_0x00a5
            java.lang.Integer r0 = X.AnonymousClass00R.A0N     // Catch:{ IllegalArgumentException -> 0x0129, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c0 }
            goto L_0x0073
        L_0x00a5:
            java.lang.String r0 = "HAND_TRACKING"
            boolean r0 = r2.equals(r0)     // Catch:{ IllegalArgumentException -> 0x0129, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c0 }
            if (r0 == 0) goto L_0x00b0
            java.lang.Integer r0 = X.AnonymousClass00R.A0Y     // Catch:{ IllegalArgumentException -> 0x0129, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c0 }
            goto L_0x0073
        L_0x00b0:
            java.lang.String r0 = "XRAY"
            boolean r0 = r2.equals(r0)     // Catch:{ IllegalArgumentException -> 0x0129, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c0 }
            if (r0 == 0) goto L_0x00bb
            java.lang.Integer r0 = X.AnonymousClass00R.A0j     // Catch:{ IllegalArgumentException -> 0x0129, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c0 }
            goto L_0x0073
        L_0x00bb:
            java.lang.String r0 = "M_SUGGESTIONS_CORE"
            boolean r0 = r2.equals(r0)     // Catch:{ IllegalArgumentException -> 0x0129, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c0 }
            if (r0 == 0) goto L_0x00c6
            java.lang.Integer r0 = X.AnonymousClass00R.A0u     // Catch:{ IllegalArgumentException -> 0x0129, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c0 }
            goto L_0x0073
        L_0x00c6:
            java.lang.String r0 = "FITTED_EXPRESSION_TRACKER"
            boolean r0 = r2.equals(r0)     // Catch:{ IllegalArgumentException -> 0x0129, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c0 }
            if (r0 == 0) goto L_0x00d1
            java.lang.Integer r0 = X.AnonymousClass00R.A15     // Catch:{ IllegalArgumentException -> 0x0129, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c0 }
            goto L_0x0073
        L_0x00d1:
            java.lang.String r0 = "GAZE_CORRECTION"
            boolean r0 = r2.equals(r0)     // Catch:{ IllegalArgumentException -> 0x0129, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c0 }
            if (r0 == 0) goto L_0x00dc
            java.lang.Integer r0 = X.AnonymousClass00R.A18     // Catch:{ IllegalArgumentException -> 0x0129, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c0 }
            goto L_0x0073
        L_0x00dc:
            java.lang.String r0 = "BI_BYTEDOC"
            boolean r0 = r2.equals(r0)     // Catch:{ IllegalArgumentException -> 0x0129, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c0 }
            if (r0 == 0) goto L_0x011d
            java.lang.Integer r0 = X.AnonymousClass00R.A19     // Catch:{ IllegalArgumentException -> 0x0129, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c0 }
            goto L_0x0073
        L_0x00e7:
            switch(r8) {
                case 0: goto L_0x0124;
                case 1: goto L_0x0122;
                case 2: goto L_0x00ff;
                case 3: goto L_0x00fc;
                case 4: goto L_0x00f9;
                case 5: goto L_0x00f6;
                case 6: goto L_0x00f3;
                case 7: goto L_0x00f0;
                case 8: goto L_0x00ed;
                default: goto L_0x00ea;
            }     // Catch:{ IllegalArgumentException -> 0x0129, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c0 }
        L_0x00ea:
            java.lang.String r6 = "BI_BYTEDOC"
            goto L_0x0124
        L_0x00ed:
            java.lang.String r6 = "GAZE_CORRECTION"
            goto L_0x0124
        L_0x00f0:
            java.lang.String r6 = "FITTED_EXPRESSION_TRACKER"
            goto L_0x0124
        L_0x00f3:
            java.lang.String r6 = "M_SUGGESTIONS_CORE"
            goto L_0x0124
        L_0x00f6:
            java.lang.String r6 = "XRAY"
            goto L_0x0124
        L_0x00f9:
            java.lang.String r6 = "HAND_TRACKING"
            goto L_0x0124
        L_0x00fc:
            java.lang.String r6 = "HAIR_SEGMENTATION"
            goto L_0x0124
        L_0x00ff:
            java.lang.String r6 = "SEGMENTATION"
            goto L_0x0124
        L_0x0102:
            com.facebook.cameracore.ardelivery.model.VersionedCapability r6 = com.facebook.cameracore.ardelivery.model.VersionedCapability.Facetracker     // Catch:{ IllegalArgumentException -> 0x0129, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c0 }
            goto L_0x012d
        L_0x0105:
            com.facebook.cameracore.ardelivery.model.VersionedCapability r6 = com.facebook.cameracore.ardelivery.model.VersionedCapability.Segmentation     // Catch:{ IllegalArgumentException -> 0x0129, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c0 }
            goto L_0x012d
        L_0x0108:
            com.facebook.cameracore.ardelivery.model.VersionedCapability r6 = com.facebook.cameracore.ardelivery.model.VersionedCapability.HairSegmentation     // Catch:{ IllegalArgumentException -> 0x0129, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c0 }
            goto L_0x012d
        L_0x010b:
            com.facebook.cameracore.ardelivery.model.VersionedCapability r6 = com.facebook.cameracore.ardelivery.model.VersionedCapability.HandTracker     // Catch:{ IllegalArgumentException -> 0x0129, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c0 }
            goto L_0x012d
        L_0x010e:
            com.facebook.cameracore.ardelivery.model.VersionedCapability r6 = com.facebook.cameracore.ardelivery.model.VersionedCapability.XRay     // Catch:{ IllegalArgumentException -> 0x0129, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c0 }
            goto L_0x012d
        L_0x0111:
            com.facebook.cameracore.ardelivery.model.VersionedCapability r6 = com.facebook.cameracore.ardelivery.model.VersionedCapability.MSuggestionsCore     // Catch:{ IllegalArgumentException -> 0x0129, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c0 }
            goto L_0x012d
        L_0x0114:
            com.facebook.cameracore.ardelivery.model.VersionedCapability r6 = com.facebook.cameracore.ardelivery.model.VersionedCapability.FaceExpressionFitting     // Catch:{ IllegalArgumentException -> 0x0129, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c0 }
            goto L_0x012d
        L_0x0117:
            com.facebook.cameracore.ardelivery.model.VersionedCapability r6 = com.facebook.cameracore.ardelivery.model.VersionedCapability.GazeCorrection     // Catch:{ IllegalArgumentException -> 0x0129, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c0 }
            goto L_0x012d
        L_0x011a:
            com.facebook.cameracore.ardelivery.model.VersionedCapability r6 = com.facebook.cameracore.ardelivery.model.VersionedCapability.BiBytedoc     // Catch:{ IllegalArgumentException -> 0x0129, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c0 }
            goto L_0x012d
        L_0x011d:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r2)     // Catch:{ IllegalArgumentException -> 0x0129, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c0 }
            goto L_0x0128
        L_0x0122:
            java.lang.String r6 = "TARGET_RECOGNITION"
        L_0x0124:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A12(r6, r7)     // Catch:{ IllegalArgumentException -> 0x0129, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c0 }
        L_0x0128:
            throw r0     // Catch:{ IllegalArgumentException -> 0x0129, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c0 }
        L_0x0129:
            com.facebook.cameracore.ardelivery.model.VersionedCapability r6 = com.facebook.cameracore.ardelivery.model.VersionedCapability.fromServerValue(r2)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c0 }
        L_0x012d:
            r7 = r4
            r0 = r4
            goto L_0x013b
        L_0x0130:
            if (r2 != 0) goto L_0x0135
            com.facebook.cameracore.ardelivery.model.EffectAssetType r0 = com.facebook.cameracore.ardelivery.model.EffectAssetType.NORMAL_EFFECT     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c0 }
            goto L_0x0139
        L_0x0135:
            com.facebook.cameracore.ardelivery.model.EffectAssetType r0 = com.facebook.cameracore.ardelivery.model.EffectAssetType.valueOf(r2)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c0 }
        L_0x0139:
            r6 = r4
            r7 = r4
        L_0x013b:
            r9.A04 = r0     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c0 }
            r9.A00 = r6     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c0 }
            r9.A05 = r7     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c0 }
            java.lang.String r6 = A00(r10)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c0 }
            r9.A0D = r6     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01d8 }
            java.lang.String r2 = A00(r10)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01d8 }
            X.C26159CtX.A01(r2)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01d8 }
            com.facebook.cameracore.ardelivery.model.ARRequestAsset$CompressionMethod r0 = com.facebook.cameracore.ardelivery.model.ARRequestAsset$CompressionMethod.valueOf(r2)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c0 }
            r9.A03 = r0     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c0 }
            int r0 = r10.getInt()     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c0 }
            r9.A01 = r0     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c0 }
            boolean r0 = r10.hasRemaining()     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c0 }
            if (r0 == 0) goto L_0x018a
            java.lang.String r2 = A00(r10)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c0 }
            r9.A09 = r2     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c0 }
        L_0x0166:
            boolean r0 = r10.hasRemaining()     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c0 }
            if (r0 == 0) goto L_0x0183
            java.lang.String r0 = A00(r10)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c0 }
            java.lang.Boolean r0 = X.AnonymousClass8BU.A0g(r0)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c0 }
            r9.A08 = r0     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c0 }
        L_0x0176:
            boolean r0 = r10.hasRemaining()     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c0 }
            if (r0 == 0) goto L_0x0196
            java.lang.String r2 = A00(r10)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c0 }
            if (r2 != 0) goto L_0x018f
            goto L_0x018d
        L_0x0183:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c0 }
            r9.A08 = r0     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c0 }
            goto L_0x0176
        L_0x018a:
            r9.A09 = r4     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c0 }
            goto L_0x0166
        L_0x018d:
            r0 = r4
            goto L_0x0193
        L_0x018f:
            X.9JJ r0 = X.AnonymousClass9JJ.valueOf(r2)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c0 }
        L_0x0193:
            r9.A06 = r0     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c0 }
            goto L_0x0198
        L_0x0196:
            r9.A06 = r4     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c0 }
        L_0x0198:
            boolean r0 = r10.hasRemaining()     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c0 }
            if (r0 == 0) goto L_0x01b5
            java.lang.String r0 = A00(r10)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c0 }
            java.lang.Boolean r0 = X.AnonymousClass8BU.A0g(r0)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c0 }
            r9.A07 = r0     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c0 }
        L_0x01a8:
            boolean r0 = r10.hasRemaining()     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c0 }
            if (r0 == 0) goto L_0x01bd
            java.lang.String r0 = A00(r10)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c0 }
            r9.A0E = r0     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c0 }
            goto L_0x01bc
        L_0x01b5:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c0 }
            r9.A07 = r0     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c0 }
            goto L_0x01a8
        L_0x01bc:
            return
        L_0x01bd:
            r9.A0E = r4     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01c0 }
            return
        L_0x01c0:
            r0 = move-exception
            r4 = r1
            goto L_0x01db
        L_0x01c3:
            r0 = move-exception
            r4 = r1
            goto L_0x01d6
        L_0x01c6:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01d5 }
            java.lang.String r0 = "Invalid data: "
            java.lang.String r0 = X.C17890vO.A0a(r0, r1, r2)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01d5 }
            java.io.IOException r0 = X.C17880vN.A0f(r0)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01d5 }
            throw r0     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01d5 }
        L_0x01d5:
            r0 = move-exception
        L_0x01d6:
            r2 = r4
            goto L_0x01db
        L_0x01d8:
            r0 = move-exception
            r4 = r1
            r2 = r6
        L_0x01db:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            X.AnonymousClass8BS.A1I(r1, r0)
            java.lang.String r0 = " -- ByteBuffer size:"
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = ", effect id:"
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = ", error string:"
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r2, r1)
            java.io.IOException r0 = X.C17880vN.A0f(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A6K.<init>(java.nio.ByteBuffer):void");
    }

    public static String A00(ByteBuffer byteBuffer) {
        int i = byteBuffer.getInt();
        if (i == -1) {
            return null;
        }
        if (i < 0) {
            throw AnonymousClass000.A0n("read the wrong cache");
        } else if (i == 0) {
            throw AnonymousClass000.A0n("the number of bytes shouldn't be 0");
        } else if (i <= 4096) {
            byte[] bArr = new byte[i];
            byteBuffer.get(bArr);
            return new String(bArr);
        } else {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("trying to allocate ");
            A10.append(i);
            throw AnonymousClass000.A0o(" bytes which exceeds the buffer limit.", A10);
        }
    }

    public A6K(ARAssetType aRAssetType, ARRequestAsset$CompressionMethod aRRequestAsset$CompressionMethod, EffectAssetType effectAssetType, AnonymousClass9IY r6, AnonymousClass9JJ r7, VersionedCapability versionedCapability, Boolean bool, Boolean bool2, String str, String str2, String str3, String str4, String str5, String str6, int i) {
        switch (aRAssetType.ordinal()) {
            case 0:
                C26159CtX.A01(str2);
                break;
            case 1:
                if (str2 == null) {
                    C26159CtX.A01(versionedCapability);
                    if (str4 != null) {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
                break;
            case 2:
            case 3:
                C26159CtX.A01(r6);
                break;
            case 4:
                break;
            case 5:
                break;
            default:
                throw AnonymousClass8BX.A0V(aRAssetType, "Got unsupported type: ", AnonymousClass000.A10());
        }
        C26159CtX.A01(str5);
        this.A0A = str;
        this.A0B = str2;
        this.A0C = str3;
        this.A02 = aRAssetType;
        this.A00 = versionedCapability;
        if (aRAssetType != ARAssetType.EFFECT) {
            effectAssetType = null;
        } else if (effectAssetType == null) {
            effectAssetType = EffectAssetType.NORMAL_EFFECT;
        }
        this.A04 = effectAssetType;
        this.A0D = str4;
        this.A03 = aRRequestAsset$CompressionMethod;
        this.A01 = i;
        this.A09 = str5;
        this.A08 = bool;
        this.A06 = r7;
        this.A05 = r6;
        this.A07 = bool2;
        this.A0E = str6;
    }
}
