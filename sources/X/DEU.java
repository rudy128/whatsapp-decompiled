package X;

import android.hardware.camera2.CaptureResult;

public class DEU implements E9A, E7d {
    public static int A0K = 16;
    public static int A0L = 400;
    public static long A0M = 30000000;
    public static int A0N;
    public static boolean A0O;
    public static boolean A0P;
    public static final float[] A0Q = new float[4];
    public static final int[] A0R = new int[18];
    public C27223Da2 A00;
    public CVA A01;
    public CVB A02;
    public CKD A03;
    public CKE A04;
    public C28501E4j A05;
    public E1E A06;
    public C25648Cje A07;
    public E9T A08;
    public CKH A09;
    public Boolean A0A;
    public Integer A0B;
    public boolean A0C;
    public int A0D = 0;
    public final C25203Caw A0E;
    public final C28502E4k A0F;
    public volatile int A0G = 0;
    public volatile boolean A0H;
    public volatile boolean A0I;
    public volatile boolean A0J;

    private void A00(E9T e9t) {
        if (this.A0G == 1) {
            this.A0G = 0;
            this.A0A = true;
            this.A08 = e9t;
            this.A0E.A01();
            E1E e1e = this.A06;
            if (e1e != null) {
                DER der = (DER) e1e;
                int i = der.A00;
                C26225CvG cvG = (C26225CvG) der.A01;
                if (i == 0) {
                    C26175Cts.A01((Object) null, 18, 0);
                    C25103CXw cXw = cvG.A0Q;
                    if (cXw != null) {
                        cXw.A00();
                    }
                    if (!cvG.A0M.A00.isEmpty()) {
                        C26078Crs.A00(C27082DTh.A00(cvG, 25));
                    }
                }
                cvG.A0O.A07("handle_preview_started", new C27132DVt((Object) cvG, 15));
                return;
            }
            return;
        }
        throw AnonymousClass8BR.A0w("Starting preview outside BLOCK_STATE_STARTING_PREVIEW state");
    }

    private void A01(E9T e9t) {
        if (this.A0G == 7) {
            this.A0G = 0;
            this.A0A = AnonymousClass000.A0i();
            this.A08 = e9t;
            this.A0E.A01();
            return;
        }
        throw AnonymousClass8BR.A0w("Starting recording outside BLOCK_STATE_STARTING_RECORD state");
    }

    public static boolean A02(CVD cvd) {
        Number number = (Number) cvd.A00(CaptureResult.SENSOR_EXPOSURE_TIME);
        Number number2 = (Number) cvd.A00(CaptureResult.SENSOR_SENSITIVITY);
        if (number == null || number2 == null) {
            return false;
        }
        boolean z = A0P;
        long longValue = number.longValue();
        if (!z) {
            if (longValue <= A0M || number2.intValue() <= A0L) {
                return false;
            }
        } else if (((double) longValue) <= ((double) A0M) * 0.5d || ((double) number2.intValue()) <= ((double) A0L) * 0.5d) {
            return false;
        }
        return true;
    }

    public void BDG() {
        this.A0E.A00();
    }

    public /* bridge */ /* synthetic */ Object BYK() {
        Boolean bool = this.A0A;
        if (bool == null) {
            throw AnonymousClass000.A0n("Start Preview operation hasn't completed yet.");
        } else if (bool.booleanValue()) {
            return this.A08;
        } else {
            throw this.A00;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:19|20|21|(1:23)|24|25|(1:27)|28|(2:31|(2:33|(1:35)(2:47|(2:49|50))))) */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x01f3, code lost:
        if (r0 != 5) goto L_0x0206;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0200, code lost:
        if (r7.intValue() != 4) goto L_0x0202;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x015c, code lost:
        if (((java.lang.Float) r10.A00(r1)).floatValue() >= 385.0f) goto L_0x015e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x016c, code lost:
        if (r3 < r1) goto L_0x016e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x005b */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0199  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0065 A[Catch:{ IllegalArgumentException -> 0x006f }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0073  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bnu(X.E9T r9, X.CVD r10) {
        /*
            r8 = this;
            boolean r0 = r8.A0I
            if (r0 == 0) goto L_0x02ba
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.CONTROL_AE_STATE
            java.lang.Object r0 = r10.A00(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x003a
            int r2 = r0.intValue()
            int r0 = r8.A0D
            if (r2 == r0) goto L_0x003a
            r8.A0D = r2
            X.CKE r0 = r8.A04
            if (r0 == 0) goto L_0x003a
            X.DVh r1 = r0.A00
            java.lang.Object r4 = r1.A01
            X.Cc8 r4 = (X.C25267Cc8) r4
            boolean r0 = r4.A0C
            if (r0 == 0) goto L_0x003a
            boolean r0 = r4.A0E
            if (r0 != 0) goto L_0x003a
            r0 = 1
            if (r2 != r0) goto L_0x003a
            java.lang.Object r3 = r1.A03
            android.hardware.camera2.CaptureRequest$Builder r3 = (android.hardware.camera2.CaptureRequest.Builder) r3
            java.lang.Object r2 = r1.A02
            X.DEU r2 = (X.DEU) r2
            r0 = 0
            r4.A02(r3, r2, r0)
        L_0x003a:
            boolean r0 = r8.A0J
            if (r0 == 0) goto L_0x0084
            X.Cje r0 = r8.A07
            if (r0 == 0) goto L_0x0084
            X.ClK r3 = r0.A01(r10)
            r2 = 0
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.COLOR_CORRECTION_GAINS     // Catch:{ IllegalArgumentException -> 0x005b }
            java.lang.Object r0 = r10.A00(r0)     // Catch:{ IllegalArgumentException -> 0x005b }
            android.hardware.camera2.params.RggbChannelVector r0 = (android.hardware.camera2.params.RggbChannelVector) r0     // Catch:{ IllegalArgumentException -> 0x005b }
            if (r0 == 0) goto L_0x005b
            float[] r1 = A0Q     // Catch:{ IllegalArgumentException -> 0x005b }
            r0.copyTo(r1, r2)     // Catch:{ IllegalArgumentException -> 0x005b }
            X.CKL r0 = X.C25750ClK.A0H     // Catch:{ IllegalArgumentException -> 0x005b }
            r3.A01(r0, r1)     // Catch:{ IllegalArgumentException -> 0x005b }
        L_0x005b:
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.COLOR_CORRECTION_TRANSFORM     // Catch:{ IllegalArgumentException -> 0x006f }
            java.lang.Object r0 = r10.A00(r0)     // Catch:{ IllegalArgumentException -> 0x006f }
            android.hardware.camera2.params.ColorSpaceTransform r0 = (android.hardware.camera2.params.ColorSpaceTransform) r0     // Catch:{ IllegalArgumentException -> 0x006f }
            if (r0 == 0) goto L_0x006f
            int[] r1 = A0R     // Catch:{ IllegalArgumentException -> 0x006f }
            r0.copyElements(r1, r2)     // Catch:{ IllegalArgumentException -> 0x006f }
            X.CKL r0 = X.C25750ClK.A0I     // Catch:{ IllegalArgumentException -> 0x006f }
            r3.A01(r0, r1)     // Catch:{ IllegalArgumentException -> 0x006f }
        L_0x006f:
            X.CKH r0 = r8.A09
            if (r0 == 0) goto L_0x0084
            X.DEe r1 = r0.A00
            r1.A01 = r8
            X.CnB r0 = r1.A02
            if (r0 == 0) goto L_0x0084
            boolean r0 = r0.A09()
            if (r0 == 0) goto L_0x00ab
            X.C26796DEe.A00(r1)
        L_0x0084:
            boolean r0 = r8.A0H
            if (r0 == 0) goto L_0x008d
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.SENSOR_EXPOSURE_TIME
            r10.A00(r0)
        L_0x008d:
            X.CVB r0 = r8.A02
            if (r0 == 0) goto L_0x018c
            java.lang.String r0 = "samsung"
            java.lang.String r1 = android.os.Build.MANUFACTURER
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x00ca
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto L_0x0160
            java.lang.String r2 = "samsung.android.control.nightModeSuggestion"
            java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
            android.hardware.camera2.CaptureResult$Key r0 = new android.hardware.camera2.CaptureResult$Key
            r0.<init>(r2, r1)
            goto L_0x00b9
        L_0x00ab:
            android.media.Image r0 = r1.A00
            if (r0 == 0) goto L_0x0084
            X.CnB r2 = r1.A02     // Catch:{ Exception -> 0x0084 }
            java.util.concurrent.Callable r1 = r1.A07     // Catch:{ Exception -> 0x0084 }
            java.lang.String r0 = "onFrameCaptured"
            r2.A07(r0, r1)     // Catch:{ Exception -> 0x0084 }
            goto L_0x0084
        L_0x00b9:
            java.lang.Object r0 = r10.A00(r0)     // Catch:{ IllegalArgumentException -> 0x0160 }
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ IllegalArgumentException -> 0x0160 }
            if (r0 == 0) goto L_0x0160
            int r0 = r0.intValue()     // Catch:{ IllegalArgumentException -> 0x0160 }
            r5 = 1
            if (r0 != r5) goto L_0x01a0
            goto L_0x016e
        L_0x00ca:
            java.lang.String r0 = "google"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x00f9
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto L_0x0160
            java.lang.String r2 = "com.google.pixel.experimental2019.GcamAE.Output"
            java.lang.Class<float[]> r1 = float[].class
            android.hardware.camera2.CaptureResult$Key r0 = new android.hardware.camera2.CaptureResult$Key
            r0.<init>(r2, r1)
            java.lang.Object r1 = r10.A00(r0)     // Catch:{  }
            float[] r1 = (float[]) r1     // Catch:{  }
            if (r1 == 0) goto L_0x0160
            r0 = 6
            r1 = r1[r0]     // Catch:{  }
            boolean r0 = A0P     // Catch:{  }
            r5 = 1
            double r3 = (double) r1     // Catch:{  }
            if (r0 != 0) goto L_0x00f3
            goto L_0x0165
        L_0x00f3:
            r1 = -4611010478483282330(0xc002666666666666, double:-2.3)
            goto L_0x016a
        L_0x00f9:
            java.lang.String r0 = "xiaomi"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L_0x0138
            java.lang.String r0 = "oneplus"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L_0x0138
            java.lang.String r0 = "vivo"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x0133
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto L_0x0160
            java.lang.String r2 = "vivo.feedback.aeluxindex"
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            android.hardware.camera2.CaptureResult$Key r1 = new android.hardware.camera2.CaptureResult$Key     // Catch:{  }
            r1.<init>(r2, r0)     // Catch:{  }
            java.lang.Object r0 = r10.A00(r1)     // Catch:{  }
            if (r0 == 0) goto L_0x01a0
            java.lang.Object r0 = r10.A00(r1)     // Catch:{  }
            int r1 = X.BE6.A0F(r0)     // Catch:{  }
            r0 = 370(0x172, float:5.18E-43)
            if (r1 >= r0) goto L_0x01a0
            goto L_0x015e
        L_0x0133:
            boolean r5 = A02(r10)
            goto L_0x016e
        L_0x0138:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto L_0x0160
            java.lang.String r2 = "org.quic.camera2.statsconfigs.AECLuxIndex"
            java.lang.Class<java.lang.Float> r0 = java.lang.Float.class
            android.hardware.camera2.CaptureResult$Key r1 = new android.hardware.camera2.CaptureResult$Key     // Catch:{  }
            r1.<init>(r2, r0)     // Catch:{  }
            java.lang.Object r0 = r10.A00(r1)     // Catch:{  }
            if (r0 == 0) goto L_0x01a0
            java.lang.Object r0 = r10.A00(r1)     // Catch:{  }
            java.lang.Float r0 = (java.lang.Float) r0     // Catch:{  }
            float r1 = r0.floatValue()     // Catch:{  }
            r0 = 1136689152(0x43c08000, float:385.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x01a0
        L_0x015e:
            r5 = 1
            goto L_0x016e
        L_0x0160:
            boolean r5 = A02(r10)
            goto L_0x016e
        L_0x0165:
            r1 = -4609749470587618591(0xc006e147ae147ae1, double:-2.86)
        L_0x016a:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x01a0
        L_0x016e:
            boolean r3 = A0O
            r2 = 0
            if (r5 == r3) goto L_0x0199
            A0O = r5
            r3 = r5
            A0N = r2
            r1 = 0
        L_0x0179:
            int r0 = A0K
            if (r1 < r0) goto L_0x018c
            X.CVB r1 = r8.A02
            int r0 = X.AnonymousClass8BU.A00(r3)
            r1.A00(r0)
            boolean r0 = A0O
            A0P = r0
            A0N = r2
        L_0x018c:
            X.CKD r0 = r8.A03
            if (r0 == 0) goto L_0x01cf
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 35
            r3 = 0
            if (r1 < r0) goto L_0x01c3
            r2 = 0
            goto L_0x01a2
        L_0x0199:
            int r0 = A0N
            int r1 = r0 + 1
            A0N = r1
            goto L_0x0179
        L_0x01a0:
            r5 = 0
            goto L_0x016e
        L_0x01a2:
            java.lang.Class<android.hardware.camera2.CaptureResult> r1 = android.hardware.camera2.CaptureResult.class
            java.lang.String r0 = "CONTROL_LOW_LIGHT_BOOST_STATE"
            java.lang.reflect.Field r0 = r1.getField(r0)     // Catch:{ IllegalAccessException | IllegalArgumentException | NoSuchFieldException -> 0x01b1 }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ IllegalAccessException | IllegalArgumentException | NoSuchFieldException -> 0x01b1 }
            android.hardware.camera2.CaptureResult$Key r0 = (android.hardware.camera2.CaptureResult.Key) r0     // Catch:{ IllegalAccessException | IllegalArgumentException | NoSuchFieldException -> 0x01b1 }
            r2 = r0
        L_0x01b1:
            if (r2 == 0) goto L_0x01c3
            java.lang.Object r0 = r10.A00(r2)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x01c3
            int r0 = r0.intValue()
            boolean r3 = X.C108975cc.A1B(r0)
        L_0x01c3:
            X.CKD r2 = r8.A03
            r1 = 8
            X.7RP r0 = new X.7RP
            r0.<init>(r2, r3, r1)
            X.C26078Crs.A00(r0)
        L_0x01cf:
            X.E4j r0 = r8.A05
            r3 = 0
            r2 = 1
            r4 = 5
            r5 = 4
            if (r0 == 0) goto L_0x0206
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.CONTROL_AF_STATE
            java.lang.Object r7 = r10.A00(r0)
            java.lang.Number r7 = (java.lang.Number) r7
            if (r7 == 0) goto L_0x01f5
            X.E4j r6 = r8.A05
            if (r6 == 0) goto L_0x01ed
            int r1 = r7.intValue()
            if (r1 != r2) goto L_0x020e
            r8.A0C = r2
        L_0x01ed:
            int r0 = r7.intValue()
            if (r0 == r5) goto L_0x01f5
            if (r0 != r4) goto L_0x0206
        L_0x01f5:
            X.E4j r6 = r8.A05
            if (r6 == 0) goto L_0x0206
            if (r7 == 0) goto L_0x0202
            int r1 = r7.intValue()
            r0 = 1
            if (r1 == r5) goto L_0x0203
        L_0x0202:
            r0 = 0
        L_0x0203:
            r6.Bup(r0)
        L_0x0206:
            int r0 = r8.A0G
            if (r0 != r2) goto L_0x0222
            r8.A00(r9)
            return
        L_0x020e:
            boolean r0 = r8.A0C
            if (r0 == 0) goto L_0x01ed
            r0 = 2
            if (r1 != r0) goto L_0x021b
            r6.Bup(r2)
        L_0x0218:
            r8.A0C = r3
            goto L_0x01ed
        L_0x021b:
            r0 = 6
            if (r1 != r0) goto L_0x01ed
            r6.Bup(r3)
            goto L_0x0218
        L_0x0222:
            int r1 = r8.A0G
            r0 = 7
            if (r1 != r0) goto L_0x022b
            r8.A01(r9)
            return
        L_0x022b:
            int r0 = r8.A0G
            r1 = 2
            if (r0 != r1) goto L_0x0258
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.CONTROL_AE_STATE
            java.lang.Object r0 = r10.A00(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r8.A0B = r0
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.CONTROL_AF_STATE
            java.lang.Object r0 = r10.A00(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x024c
            int r0 = r0.intValue()
            if (r0 == r5) goto L_0x024c
            if (r0 != r4) goto L_0x02ba
        L_0x024c:
            int r0 = r8.A0G
            if (r0 != r1) goto L_0x02ba
        L_0x0250:
            r8.A0G = r3
            X.Caw r0 = r8.A0E
            r0.A01()
            return
        L_0x0258:
            int r1 = r8.A0G
            r0 = 3
            if (r1 != r0) goto L_0x0272
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.CONTROL_AE_STATE
            java.lang.Object r0 = r10.A00(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r8.A0B = r0
            if (r0 == 0) goto L_0x026f
            int r0 = r0.intValue()
            if (r0 != r4) goto L_0x02ba
        L_0x026f:
            r8.A0G = r5
            return
        L_0x0272:
            int r0 = r8.A0G
            if (r0 != r5) goto L_0x0289
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.CONTROL_AE_STATE
            java.lang.Object r0 = r10.A00(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r8.A0B = r0
            if (r0 == 0) goto L_0x0250
            int r0 = r0.intValue()
            if (r0 == r4) goto L_0x02ba
            goto L_0x0250
        L_0x0289:
            int r0 = r8.A0G
            r1 = 6
            if (r0 != r4) goto L_0x02a3
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.CONTROL_AE_STATE
            java.lang.Object r0 = r10.A00(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r8.A0B = r0
            if (r0 == 0) goto L_0x02a0
            int r0 = r0.intValue()
            if (r0 != r2) goto L_0x02ba
        L_0x02a0:
            r8.A0G = r1
            return
        L_0x02a3:
            int r0 = r8.A0G
            if (r0 != r1) goto L_0x02ba
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.CONTROL_AE_STATE
            java.lang.Object r0 = r10.A00(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r8.A0B = r0
            if (r0 == 0) goto L_0x0250
            int r0 = r0.intValue()
            if (r0 == r2) goto L_0x02ba
            goto L_0x0250
        L_0x02ba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DEU.Bnu(X.E9T, X.CVD):void");
    }

    public void Bnw(CKG ckg) {
        if (!this.A0I) {
            return;
        }
        if (this.A0G == 1 || this.A0G == 7) {
            this.A0G = 0;
            this.A0A = false;
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Failed to start operation. Reason: ");
            int i = ckg.A00;
            this.A00 = new C27223Da2(C17880vN.A0t(A10, i));
            CVA cva = this.A01;
            if (cva != null) {
                if (i == 0 || i != 1) {
                    cva.A00(0);
                } else {
                    cva.A00(1);
                }
            }
            this.A0E.A01();
        }
    }

    public void Bnz(E9T e9t) {
        if (!this.A0I) {
            return;
        }
        if (this.A0G == 1) {
            A00(e9t);
        } else if (this.A0G == 7) {
            A01(e9t);
        }
    }

    public DEU() {
        DES des = new DES(this, 0);
        this.A0F = des;
        this.A0I = true;
        C25203Caw caw = new C25203Caw();
        this.A0E = caw;
        caw.A00 = des;
    }

    public void BxW(int i) {
    }
}
