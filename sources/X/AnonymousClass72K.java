package X;

import android.media.AudioRecord;
import com.whatsapp.audioRecording.AudioRecordFactory;
import com.whatsapp.audioRecording.NoiseMetricsCallback;
import com.whatsapp.audioRecording.OpusRecorderFactory;
import com.whatsapp.util.Log;
import com.whatsapp.util.OpusRecorder;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: X.72K  reason: invalid class name */
public final class AnonymousClass72K {
    public long A00;
    public long A01;
    public boolean A02;
    public boolean A03;
    public final float A04;
    public final AnonymousClass1KB A05;
    public final NoiseMetricsCallback A06;
    public final AnonymousClass89T A07;
    public final C18100vl A08;
    public final C18100vl A09;
    public final C18100vl A0A = AnonymousClass1DF.A01(AnonymousClass7xP.A00);
    public final C18100vl A0B;
    public final C18100vl A0C;
    public final C18100vl A0D;
    public final C18100vl A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final AnonymousClass190 A0H;
    public final AnonymousClass11P A0I;
    public final Object A0J;
    public final boolean A0K;
    public volatile FileOutputStream A0L;

    public static OpusRecorder A00(AnonymousClass72K r0) {
        return (OpusRecorder) r0.A0D.getValue();
    }

    public static final boolean A01(AnonymousClass72K r4) {
        if (r4.A0L == null) {
            synchronized (r4.A0J) {
                if (r4.A0L == null) {
                    try {
                        C18100vl r2 = r4.A0E;
                        if (((File) r2.getValue()).createNewFile()) {
                            r4.A0L = C108945cZ.A19((File) r2.getValue());
                        } else {
                            StringBuilder A10 = AnonymousClass000.A10();
                            A10.append("voiceRecorder/unable to create visualization file; visualizationPath=");
                            C17890vO.A1B(A10, ((File) r2.getValue()).getPath());
                        }
                    } catch (IOException e) {
                        Log.e("voiceRecorder/error creating visualization file ", e);
                    }
                }
            }
        }
        return AnonymousClass000.A1W(r4.A0L);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0075 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0096 A[Catch:{ IOException -> 0x00a7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public float A02() {
        /*
            r8 = this;
            int r5 = android.os.Build.VERSION.SDK_INT
            r7 = 0
            r4 = 23
            X.0vl r0 = r8.A09
            java.lang.Object r3 = r0.getValue()
            android.media.AudioRecord r3 = (android.media.AudioRecord) r3
            X.0vl r6 = r8.A08
            java.lang.Object r2 = r6.getValue()
            short[] r2 = (short[]) r2
            java.lang.Object r0 = r6.getValue()
            short[] r0 = (short[]) r0
            int r1 = r0.length
            if (r5 < r4) goto L_0x006c
            r0 = 1
            int r5 = r3.read(r2, r7, r1, r0)
        L_0x0023:
            r3 = 0
            if (r5 <= 0) goto L_0x004c
            r8.A00 = r3
            boolean r0 = r8.A03
            if (r0 == 0) goto L_0x003b
            r8.A03 = r7
            X.1KB r2 = r8.A05
            r1 = 10
        L_0x0033:
            X.7Qp r0 = new X.7Qp
            r0.<init>(r8, r1)
            r2.A0J(r0)
        L_0x003b:
            r1 = 0
        L_0x003c:
            if (r7 >= r5) goto L_0x0071
            java.lang.Object r0 = r6.getValue()
            short[] r0 = (short[]) r0
            short r0 = r0[r7]
            if (r0 <= r1) goto L_0x0049
            r1 = r0
        L_0x0049:
            int r7 = r7 + 1
            goto L_0x003c
        L_0x004c:
            long r1 = r8.A00
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            long r3 = android.os.SystemClock.elapsedRealtime()
            if (r0 != 0) goto L_0x0059
            r8.A00 = r3
            goto L_0x003b
        L_0x0059:
            long r3 = r3 - r1
            r1 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x003b
            boolean r0 = r8.A03
            if (r0 != 0) goto L_0x003b
            r0 = 1
            r8.A03 = r0
            X.1KB r2 = r8.A05
            r1 = 11
            goto L_0x0033
        L_0x006c:
            int r5 = r3.read(r2, r7, r1)
            goto L_0x0023
        L_0x0071:
            boolean r0 = r8.A0K
            if (r0 == 0) goto L_0x007a
            if (r5 != 0) goto L_0x007a
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x0079:
            return r2
        L_0x007a:
            double r2 = (double) r1
            r0 = 4598175219545276416(0x3fd0000000000000, double:0.25)
            double r3 = java.lang.Math.log(r2)
            double r3 = r3 * r0
            r0 = 4609797659283161088(0x3ff94a8c20000000, double:1.5807000398635864)
            double r3 = r3 - r0
            float r2 = (float) r3
            r1 = 0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r2 = X.C28851b7.A02(r2, r1, r0)
            boolean r0 = A01(r8)     // Catch:{ IOException -> 0x00a7 }
            if (r0 == 0) goto L_0x0079
            java.io.FileOutputStream r1 = r8.A0L     // Catch:{ IOException -> 0x00a7 }
            if (r1 == 0) goto L_0x00a2
            r0 = 1120403456(0x42c80000, float:100.0)
            float r0 = r0 * r2
            int r0 = (int) r0     // Catch:{ IOException -> 0x00a7 }
            r1.write(r0)     // Catch:{ IOException -> 0x00a7 }
            return r2
        L_0x00a2:
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()     // Catch:{ IOException -> 0x00a7 }
            throw r0     // Catch:{ IOException -> 0x00a7 }
        L_0x00a7:
            r1 = move-exception
            java.lang.String r0 = "voiceRecorder/getandstorevisualizationvalue/ error writing visualization file data "
            com.whatsapp.util.Log.e(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass72K.A02():float");
    }

    public File A03() {
        if (!this.A02) {
            this.A0H.A0G("voiceRecorder/getPreparedFile called without preparing", "", true);
        }
        return (File) this.A0C.getValue();
    }

    public void A05() {
        C18100vl r2 = this.A09;
        if (((AudioRecord) r2.getValue()).getState() == 1) {
            ((AudioRecord) r2.getValue()).stop();
        }
        this.A00 = 0;
        this.A03 = false;
        this.A05.A0J(new C146787Qp(this, 9));
    }

    public AnonymousClass72K(AnonymousClass190 r3, C218617r r4, AnonymousClass1KB r5, AudioRecordFactory audioRecordFactory, NoiseMetricsCallback noiseMetricsCallback, OpusRecorderFactory opusRecorderFactory, AnonymousClass11P r9, C18030ve r10, AnonymousClass89T r11, float f, boolean z, boolean z2) {
        this.A0I = r9;
        this.A05 = r5;
        this.A0H = r3;
        this.A07 = r11;
        this.A06 = noiseMetricsCallback;
        this.A0G = z;
        this.A0F = z2;
        this.A04 = f;
        this.A09 = AnonymousClass1DF.A01(new C157107vo(audioRecordFactory, this));
        this.A08 = AnonymousClass1DF.A01(new C154717ra(this));
        this.A0K = C18020vd.A05(C18040vf.A02, r10, 1139);
        Boolean bool = C17970vW.A03;
        this.A0J = C17880vN.A0p();
        this.A0B = AnonymousClass1DF.A01(new C154727rb(r4));
        this.A0C = AnonymousClass1DF.A01(new C154737rc(this));
        this.A0E = AnonymousClass1DF.A01(new C154747rd(this));
        this.A0D = AnonymousClass1DF.A01(new AnonymousClass7wF(opusRecorderFactory, r10, this));
    }

    public void A04() {
        A00(this).start();
        C18100vl r2 = this.A09;
        if (((AudioRecord) r2.getValue()).getState() == 1) {
            ((AudioRecord) r2.getValue()).startRecording();
        }
    }
}
