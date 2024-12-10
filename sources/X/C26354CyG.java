package X;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;

/* renamed from: X.CyG  reason: case insensitive filesystem */
public class C26354CyG implements SensorEventListener {
    public final int A00;
    public final Object A01;

    public C26354CyG(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x025b, code lost:
        if (r5 != 3) goto L_0x025d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x013a, code lost:
        if (r3 != 3) goto L_0x013c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSensorChanged(android.hardware.SensorEvent r19) {
        /*
            r18 = this;
            r1 = r18
            int r0 = r1.A00
            r7 = r19
            switch(r0) {
                case 0: goto L_0x0373;
                case 1: goto L_0x0346;
                case 2: goto L_0x0317;
                case 3: goto L_0x02ed;
                case 4: goto L_0x02cd;
                case 5: goto L_0x02ad;
                case 6: goto L_0x028d;
                case 7: goto L_0x0176;
                case 8: goto L_0x0028;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r3 = r1.A01
            com.whatsapp.notification.PopupNotification r3 = (com.whatsapp.notification.PopupNotification) r3
            float[] r1 = r7.values
            r0 = 0
            r2 = r1[r0]
            r3.A00 = r2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "popupnotification/proximity:"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0027:
            return
        L_0x0028:
            java.lang.Object r4 = r1.A01
            X.Bti r4 = (X.C24001Bti) r4
            X.Ccm r0 = r4.A08
            if (r0 == 0) goto L_0x0027
            android.location.Location r0 = r4.A06
            if (r0 == 0) goto L_0x0027
            r8 = 0
            r5 = 3
            float[] r1 = r4.A0G     // Catch:{ IllegalArgumentException -> 0x003e }
            float[] r0 = r7.values     // Catch:{ IllegalArgumentException -> 0x003e }
            android.hardware.SensorManager.getRotationMatrixFromVector(r1, r0)     // Catch:{ IllegalArgumentException -> 0x003e }
            goto L_0x004d
        L_0x003e:
            float[] r2 = r7.values
            int r0 = r2.length
            if (r0 <= r5) goto L_0x004d
            float[] r1 = r4.A0F
            java.lang.System.arraycopy(r2, r8, r1, r8, r5)
            float[] r0 = r4.A0G
            android.hardware.SensorManager.getRotationMatrixFromVector(r0, r1)
        L_0x004d:
            android.view.Display r0 = r4.A07
            int r3 = r0.getRotation()
            long r6 = java.lang.System.currentTimeMillis()
            android.location.Location r0 = r4.A06
            long r0 = r0.getTime()
            long r6 = r6 - r0
            r1 = 5000(0x1388, double:2.4703E-320)
            r11 = 0
            r9 = 2
            r10 = 1
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0125
            android.location.Location r0 = r4.A06
            boolean r0 = r0.hasBearing()
            if (r0 == 0) goto L_0x0125
            android.location.Location r0 = r4.A06
            float r0 = r0.getSpeed()
            double r0 = (double) r0
            r6 = 4606228376254955242(0x3fec9c4da9003eea, double:0.89408)
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 <= 0) goto L_0x0125
            android.location.Location r0 = r4.A06
            float r2 = r0.getBearing()
        L_0x0085:
            float r11 = r4.A00
            long r7 = java.lang.System.currentTimeMillis()
            long r5 = r4.A04
            long r0 = r7 - r5
            float r5 = (float) r0
            r0 = 1137180672(0x43c80000, float:400.0)
            float r5 = r5 / r0
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x009b
            r5 = 1065353216(0x3f800000, float:1.0)
        L_0x009b:
            r4.A04 = r7
            float r6 = r2 - r11
            float r1 = java.lang.Math.abs(r6)
            r0 = 1127481344(0x43340000, float:180.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0102
            r0 = 1114636288(0x42700000, float:60.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x00b2
            float r5 = r5 * r6
            float r2 = r11 + r5
        L_0x00b2:
            r4.A00 = r2
            if (r3 == 0) goto L_0x00f1
            if (r3 == r9) goto L_0x00f1
            float[] r0 = r4.A0H
            r0 = r0[r9]
            double r0 = (double) r0
            double r0 = java.lang.Math.toDegrees(r0)
            double r1 = java.lang.Math.abs(r0)
            float r0 = (float) r1
            r4.A02 = r0
        L_0x00c8:
            int r0 = r4.A03
            if (r0 != 0) goto L_0x0027
            boolean r0 = r4.A0B
            if (r0 != 0) goto L_0x0027
            android.location.Location r0 = r4.A06
            double r5 = r0.getLatitude()
            android.location.Location r0 = r4.A06
            double r1 = r0.getLongitude()
            com.google.android.gms.maps.model.LatLng r0 = new com.google.android.gms.maps.model.LatLng
            r0.<init>(r5, r1)
            com.google.android.gms.maps.model.CameraPosition r0 = X.DJ0.A0B(r0, r4)
            X.Ccm r2 = r4.A08
            X.CLK r1 = X.C26080Crv.A00(r0)
            X.E2G r0 = r4.A0E
            r2.A0A(r1, r0)
            return
        L_0x00f1:
            float[] r0 = r4.A0H
            r0 = r0[r10]
            double r0 = (double) r0
            double r0 = java.lang.Math.toDegrees(r0)
            double r1 = java.lang.Math.abs(r0)
            float r0 = (float) r1
            r4.A02 = r0
            goto L_0x00c8
        L_0x0102:
            double r0 = (double) r1
            r12 = 4645040803167600640(0x4076800000000000, double:360.0)
            double r12 = r12 - r0
            r6 = 4633641066610819072(0x404e000000000000, double:60.0)
            int r0 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r0 > 0) goto L_0x00b2
            r1 = 1135869952(0x43b40000, float:360.0)
            int r0 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x011e
            float r2 = r2 + r1
            float r2 = r2 - r11
            float r2 = r2 % r1
            float r5 = r5 * r2
            float r11 = r11 + r5
        L_0x011a:
            float r11 = r11 + r1
            float r2 = r11 % r1
            goto L_0x00b2
        L_0x011e:
            float r0 = r1 - r2
            float r0 = r0 + r11
            float r0 = r0 % r1
            float r5 = r5 * r0
            float r11 = r11 - r5
            goto L_0x011a
        L_0x0125:
            float[] r1 = r4.A0G
            float[] r0 = r4.A0H
            android.hardware.SensorManager.getOrientation(r1, r0)
            r0 = r0[r8]
            double r0 = (double) r0
            double r0 = java.lang.Math.toDegrees(r0)
            float r2 = (float) r0
            if (r3 == r10) goto L_0x016f
            if (r3 == r9) goto L_0x0172
            r0 = 1132920832(0x43870000, float:270.0)
            if (r3 == r5) goto L_0x0174
        L_0x013c:
            r5 = 1135869952(0x43b40000, float:360.0)
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r0 >= 0) goto L_0x0143
            float r2 = r2 + r5
        L_0x0143:
            android.location.Location r0 = r4.A06
            double r0 = r0.getLatitude()
            float r12 = (float) r0
            android.location.Location r0 = r4.A06
            double r0 = r0.getLongitude()
            float r13 = (float) r0
            android.location.Location r0 = r4.A06
            double r0 = r0.getAltitude()
            float r14 = (float) r0
            android.location.Location r0 = r4.A06
            long r15 = r0.getTime()
            android.hardware.GeomagneticField r11 = new android.hardware.GeomagneticField
            r11.<init>(r12, r13, r14, r15)
            float r0 = r11.getDeclination()
            float r2 = r2 + r0
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x0085
            float r2 = r2 - r5
            goto L_0x0085
        L_0x016f:
            r0 = 1119092736(0x42b40000, float:90.0)
            goto L_0x0174
        L_0x0172:
            r0 = 1127481344(0x43340000, float:180.0)
        L_0x0174:
            float r2 = r2 + r0
            goto L_0x013c
        L_0x0176:
            java.lang.Object r3 = r1.A01
            X.Bth r3 = (X.C24000Bth) r3
            double r0 = X.BIS.A0n
            X.E46 r0 = r3.A0F
            X.DAE r2 = r3.A0J(r0)
            if (r2 == 0) goto L_0x0027
            android.location.Location r11 = r3.getMyLocation()
            if (r11 == 0) goto L_0x0027
            r4 = 0
            r6 = 3
            float[] r1 = r3.A0H     // Catch:{ IllegalArgumentException -> 0x0194 }
            float[] r0 = r7.values     // Catch:{ IllegalArgumentException -> 0x0194 }
            android.hardware.SensorManager.getRotationMatrixFromVector(r1, r0)     // Catch:{ IllegalArgumentException -> 0x0194 }
            goto L_0x01a3
        L_0x0194:
            float[] r5 = r7.values
            int r0 = r5.length
            if (r0 <= r6) goto L_0x01a3
            float[] r1 = r3.A0G
            java.lang.System.arraycopy(r5, r4, r1, r4, r6)
            float[] r0 = r3.A0H
            android.hardware.SensorManager.getRotationMatrixFromVector(r0, r1)
        L_0x01a3:
            android.view.Display r0 = r3.A05
            int r5 = r0.getRotation()
            long r9 = java.lang.System.currentTimeMillis()
            long r0 = r11.getTime()
            long r9 = r9 - r0
            r7 = 5000(0x1388, double:2.4703E-320)
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x0242
            boolean r0 = r11.hasBearing()
            if (r0 == 0) goto L_0x0242
            float r0 = r11.getSpeed()
            double r7 = (double) r0
            r9 = 4606228376254955242(0x3fec9c4da9003eea, double:0.89408)
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x0242
            float r6 = r11.getBearing()
        L_0x01d0:
            float r9 = r3.A00
            long r7 = java.lang.System.currentTimeMillis()
            long r4 = r3.A03
            long r0 = r7 - r4
            float r10 = (float) r0
            r0 = 1137180672(0x43c80000, float:400.0)
            float r10 = r10 / r0
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x01e6
            r10 = 1065353216(0x3f800000, float:1.0)
        L_0x01e6:
            r3.A03 = r7
            float r4 = r6 - r9
            float r1 = java.lang.Math.abs(r4)
            r0 = 1127481344(0x43340000, float:180.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x021f
            r0 = 1114636288(0x42700000, float:60.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x01fd
            float r10 = r10 * r4
            float r6 = r9 + r10
        L_0x01fd:
            r3.A00 = r6
            int r0 = r3.A02
            if (r0 != 0) goto L_0x0027
            X.AEc r5 = X.BEA.A0T(r11)
            float r4 = r3.A00
            float r1 = r3.A01
            r0 = 1097859072(0x41700000, float:15.0)
            float r3 = java.lang.Math.max(r1, r0)
            r1 = 1
            X.D44 r0 = new X.D44
            r0.<init>(r5, r3, r1, r4)
            X.CXL r0 = X.C25306CdA.A00(r0)
            r2.A09(r0)
            return
        L_0x021f:
            double r0 = (double) r1
            r7 = 4645040803167600640(0x4076800000000000, double:360.0)
            double r7 = r7 - r0
            r4 = 4633641066610819072(0x404e000000000000, double:60.0)
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x01fd
            r1 = 1135869952(0x43b40000, float:360.0)
            int r0 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x023b
            float r6 = r6 + r1
            float r6 = r6 - r9
            float r6 = r6 % r1
            float r10 = r10 * r6
            float r9 = r9 + r10
        L_0x0237:
            float r9 = r9 + r1
            float r6 = r9 % r1
            goto L_0x01fd
        L_0x023b:
            float r0 = r1 - r6
            float r0 = r0 + r9
            float r0 = r0 % r1
            float r10 = r10 * r0
            float r9 = r9 - r10
            goto L_0x0237
        L_0x0242:
            float[] r1 = r3.A0H
            float[] r0 = r3.A0I
            android.hardware.SensorManager.getOrientation(r1, r0)
            r0 = r0[r4]
            double r0 = (double) r0
            double r0 = java.lang.Math.toDegrees(r0)
            float r4 = (float) r0
            r1 = 1
            r0 = 1119092736(0x42b40000, float:90.0)
            if (r5 == r1) goto L_0x028b
            r0 = 2
            if (r5 == r0) goto L_0x0289
            r0 = 1132920832(0x43870000, float:270.0)
            if (r5 == r6) goto L_0x028b
        L_0x025d:
            r0 = 0
            r5 = 1135869952(0x43b40000, float:360.0)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0265
            float r4 = r4 + r5
        L_0x0265:
            double r0 = r11.getLatitude()
            float r13 = (float) r0
            double r0 = r11.getLongitude()
            float r14 = (float) r0
            double r0 = r11.getAltitude()
            float r15 = (float) r0
            long r16 = r11.getTime()
            android.hardware.GeomagneticField r12 = new android.hardware.GeomagneticField
            r12.<init>(r13, r14, r15, r16)
            float r6 = r12.getDeclination()
            float r6 = r6 + r4
            int r0 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x01d0
            float r6 = r6 - r5
            goto L_0x01d0
        L_0x0289:
            r0 = 1127481344(0x43340000, float:180.0)
        L_0x028b:
            float r4 = r4 + r0
            goto L_0x025d
        L_0x028d:
            java.lang.Object r0 = r1.A01
            X.DAs r0 = (X.C26718DAs) r0
            java.util.ArrayList r0 = r0.A0N
            java.util.Iterator r5 = r0.iterator()
        L_0x0297:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0027
            java.lang.Object r4 = r5.next()
            com.facebook.cameracore.mediapipeline.dataproviders.motion.implementation.MotionDataSourceWrapper r4 = (com.facebook.cameracore.mediapipeline.dataproviders.motion.implementation.MotionDataSourceWrapper) r4
            X.Bxo r3 = X.C24234Bxo.RAW_MAGNETOMETER
            float[] r2 = r7.values
            long r0 = r7.timestamp
            r4.onRawSensorMeasurementChanged(r3, r2, r0)
            goto L_0x0297
        L_0x02ad:
            java.lang.Object r0 = r1.A01
            X.DAs r0 = (X.C26718DAs) r0
            java.util.ArrayList r0 = r0.A0N
            java.util.Iterator r5 = r0.iterator()
        L_0x02b7:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0027
            java.lang.Object r4 = r5.next()
            com.facebook.cameracore.mediapipeline.dataproviders.motion.implementation.MotionDataSourceWrapper r4 = (com.facebook.cameracore.mediapipeline.dataproviders.motion.implementation.MotionDataSourceWrapper) r4
            X.Bxo r3 = X.C24234Bxo.RAW_GYROSCOPE
            float[] r2 = r7.values
            long r0 = r7.timestamp
            r4.onRawSensorMeasurementChanged(r3, r2, r0)
            goto L_0x02b7
        L_0x02cd:
            java.lang.Object r0 = r1.A01
            X.DAs r0 = (X.C26718DAs) r0
            java.util.ArrayList r0 = r0.A0N
            java.util.Iterator r5 = r0.iterator()
        L_0x02d7:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0027
            java.lang.Object r4 = r5.next()
            com.facebook.cameracore.mediapipeline.dataproviders.motion.implementation.MotionDataSourceWrapper r4 = (com.facebook.cameracore.mediapipeline.dataproviders.motion.implementation.MotionDataSourceWrapper) r4
            X.Bxo r3 = X.C24234Bxo.RAW_ACCELEROMETER
            float[] r2 = r7.values
            long r0 = r7.timestamp
            r4.onRawSensorMeasurementChanged(r3, r2, r0)
            goto L_0x02d7
        L_0x02ed:
            java.lang.Object r4 = r1.A01
            X.DAs r4 = (X.C26718DAs) r4
            monitor-enter(r4)
            boolean r0 = r4.A04     // Catch:{ all -> 0x0343 }
            if (r0 == 0) goto L_0x0341
            android.hardware.Sensor r0 = r7.sensor     // Catch:{ all -> 0x0343 }
            int r1 = r0.getType()     // Catch:{ all -> 0x0343 }
            r0 = 4
            if (r1 != r0) goto L_0x0341
            float[] r3 = r4.A0T     // Catch:{ all -> 0x0343 }
            float[] r2 = r7.values     // Catch:{ all -> 0x0343 }
            r1 = 0
            r0 = r2[r1]     // Catch:{ all -> 0x0343 }
            r3[r1] = r0     // Catch:{ all -> 0x0343 }
            r1 = 1
            r0 = r2[r1]     // Catch:{ all -> 0x0343 }
            r3[r1] = r0     // Catch:{ all -> 0x0343 }
            r1 = 2
            r0 = r2[r1]     // Catch:{ all -> 0x0343 }
            r3[r1] = r0     // Catch:{ all -> 0x0343 }
            long r0 = r7.timestamp     // Catch:{ all -> 0x0343 }
            r4.A02 = r0     // Catch:{ all -> 0x0343 }
            goto L_0x0341
        L_0x0317:
            java.lang.Object r4 = r1.A01
            X.DAs r4 = (X.C26718DAs) r4
            monitor-enter(r4)
            boolean r0 = r4.A04     // Catch:{ all -> 0x0343 }
            if (r0 == 0) goto L_0x0341
            android.hardware.Sensor r0 = r7.sensor     // Catch:{ all -> 0x0343 }
            int r1 = r0.getType()     // Catch:{ all -> 0x0343 }
            r0 = 9
            if (r1 != r0) goto L_0x0341
            float[] r3 = r4.A0P     // Catch:{ all -> 0x0343 }
            float[] r2 = r7.values     // Catch:{ all -> 0x0343 }
            r1 = 0
            r0 = r2[r1]     // Catch:{ all -> 0x0343 }
            r3[r1] = r0     // Catch:{ all -> 0x0343 }
            r1 = 1
            r0 = r2[r1]     // Catch:{ all -> 0x0343 }
            r3[r1] = r0     // Catch:{ all -> 0x0343 }
            r1 = 2
            r0 = r2[r1]     // Catch:{ all -> 0x0343 }
            r3[r1] = r0     // Catch:{ all -> 0x0343 }
            long r0 = r7.timestamp     // Catch:{ all -> 0x0343 }
            r4.A02 = r0     // Catch:{ all -> 0x0343 }
        L_0x0341:
            monitor-exit(r4)
            return
        L_0x0343:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x0346:
            java.lang.Object r5 = r1.A01
            X.DAs r5 = (X.C26718DAs) r5
            monitor-enter(r5)
            boolean r0 = r5.A04     // Catch:{ all -> 0x0370 }
            if (r0 == 0) goto L_0x036e
            android.hardware.Sensor r0 = r7.sensor     // Catch:{ all -> 0x0370 }
            int r0 = r0.getType()     // Catch:{ all -> 0x0370 }
            r4 = 1
            if (r0 != r4) goto L_0x036e
            float[] r3 = r5.A0O     // Catch:{ all -> 0x0370 }
            float[] r2 = r7.values     // Catch:{ all -> 0x0370 }
            r1 = 0
            r0 = r2[r1]     // Catch:{ all -> 0x0370 }
            r3[r1] = r0     // Catch:{ all -> 0x0370 }
            r0 = r2[r4]     // Catch:{ all -> 0x0370 }
            r3[r4] = r0     // Catch:{ all -> 0x0370 }
            r1 = 2
            r0 = r2[r1]     // Catch:{ all -> 0x0370 }
            r3[r1] = r0     // Catch:{ all -> 0x0370 }
            long r0 = r7.timestamp     // Catch:{ all -> 0x0370 }
            r5.A02 = r0     // Catch:{ all -> 0x0370 }
        L_0x036e:
            monitor-exit(r5)
            return
        L_0x0370:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x0373:
            java.lang.Object r3 = r1.A01
            X.DAs r3 = (X.C26718DAs) r3
            monitor-enter(r3)
            boolean r0 = r3.A04     // Catch:{ all -> 0x0461 }
            if (r0 == 0) goto L_0x045f
            android.hardware.Sensor r0 = r7.sensor     // Catch:{ all -> 0x0461 }
            int r1 = r0.getType()     // Catch:{ all -> 0x0461 }
            r0 = 11
            if (r1 == r0) goto L_0x039c
            android.hardware.Sensor r0 = r7.sensor     // Catch:{ all -> 0x0461 }
            int r1 = r0.getType()     // Catch:{ all -> 0x0461 }
            r0 = 15
            if (r1 == r0) goto L_0x039c
            android.hardware.Sensor r0 = r7.sensor     // Catch:{ all -> 0x0461 }
            int r1 = r0.getType()     // Catch:{ all -> 0x0461 }
            r0 = 20
            if (r1 == r0) goto L_0x039c
            goto L_0x045f
        L_0x039c:
            float[] r6 = r3.A0Q     // Catch:{ all -> 0x0461 }
            float[] r0 = r7.values     // Catch:{ all -> 0x0461 }
            android.hardware.SensorManager.getRotationMatrixFromVector(r6, r0)     // Catch:{ all -> 0x0461 }
            android.view.WindowManager r0 = r3.A0L     // Catch:{ all -> 0x0461 }
            android.view.Display r0 = r0.getDefaultDisplay()     // Catch:{ all -> 0x0461 }
            int r4 = r0.getRotation()     // Catch:{ all -> 0x0461 }
            float[] r5 = r3.A0R     // Catch:{ all -> 0x0461 }
            r2 = 129(0x81, float:1.81E-43)
            r1 = 3
            r0 = 1
            if (r4 == r0) goto L_0x03c2
            r0 = 2
            if (r4 == r0) goto L_0x03bf
            r2 = 1
            if (r4 != r1) goto L_0x03c5
            r2 = 131(0x83, float:1.84E-43)
            r1 = 1
            goto L_0x03c5
        L_0x03bf:
            r1 = 131(0x83, float:1.84E-43)
            goto L_0x03c5
        L_0x03c2:
            r2 = 3
            r1 = 129(0x81, float:1.81E-43)
        L_0x03c5:
            android.hardware.SensorManager.remapCoordinateSystem(r6, r2, r1, r5)     // Catch:{ all -> 0x0461 }
            float[] r10 = r3.A0S     // Catch:{ all -> 0x0461 }
            r1 = 0
            r0 = r5[r1]     // Catch:{ all -> 0x0461 }
            r10[r1] = r0     // Catch:{ all -> 0x0461 }
            r2 = 2
            r1 = r5[r2]     // Catch:{ all -> 0x0461 }
            r0 = 1
            r10[r0] = r1     // Catch:{ all -> 0x0461 }
            r0 = r5[r0]     // Catch:{ all -> 0x0461 }
            float r0 = -r0
            r10[r2] = r0     // Catch:{ all -> 0x0461 }
            r0 = 3
            r13 = 0
            r10[r0] = r13     // Catch:{ all -> 0x0461 }
            r9 = 8
            r0 = r5[r9]     // Catch:{ all -> 0x0461 }
            r8 = 4
            r10[r8] = r0     // Catch:{ all -> 0x0461 }
            r6 = 10
            r0 = r5[r6]     // Catch:{ all -> 0x0461 }
            r4 = 5
            r10[r4] = r0     // Catch:{ all -> 0x0461 }
            r2 = 9
            r0 = r5[r2]     // Catch:{ all -> 0x0461 }
            float r0 = -r0
            r1 = 6
            r10[r1] = r0     // Catch:{ all -> 0x0461 }
            r0 = 7
            r10[r0] = r13     // Catch:{ all -> 0x0461 }
            r0 = r5[r8]     // Catch:{ all -> 0x0461 }
            float r0 = -r0
            r10[r9] = r0     // Catch:{ all -> 0x0461 }
            r0 = r5[r1]     // Catch:{ all -> 0x0461 }
            float r0 = -r0
            r10[r2] = r0     // Catch:{ all -> 0x0461 }
            r0 = r5[r4]     // Catch:{ all -> 0x0461 }
            r10[r6] = r0     // Catch:{ all -> 0x0461 }
            r0 = 11
            r10[r0] = r13     // Catch:{ all -> 0x0461 }
            r0 = 12
            r10[r0] = r13     // Catch:{ all -> 0x0461 }
            r0 = 13
            r10[r0] = r13     // Catch:{ all -> 0x0461 }
            r0 = 14
            r10[r0] = r13     // Catch:{ all -> 0x0461 }
            r1 = 15
            r0 = 1065353216(0x3f800000, float:1.0)
            r10[r1] = r0     // Catch:{ all -> 0x0461 }
            boolean r0 = r3.A05     // Catch:{ all -> 0x0461 }
            if (r0 != 0) goto L_0x0436
            float[] r1 = r7.values     // Catch:{ all -> 0x0461 }
            r0 = 0
            r0 = r1[r0]     // Catch:{ all -> 0x0461 }
            int r0 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r0 != 0) goto L_0x044a
            r0 = 1
            r0 = r1[r0]     // Catch:{ all -> 0x0461 }
            int r0 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r0 != 0) goto L_0x044a
            r0 = 2
            r0 = r1[r0]     // Catch:{ all -> 0x0461 }
            int r0 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r0 != 0) goto L_0x044a
        L_0x0436:
            float r12 = r3.A00     // Catch:{ all -> 0x0461 }
            r14 = 1065353216(0x3f800000, float:1.0)
            r11 = 0
            r15 = r13
            android.opengl.Matrix.rotateM(r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x0461 }
            android.opengl.Matrix.invertM(r10, r11, r10, r11)     // Catch:{ all -> 0x0461 }
            long r0 = r7.timestamp     // Catch:{ all -> 0x0461 }
            r3.A02 = r0     // Catch:{ all -> 0x0461 }
            X.C26718DAs.A00(r3)     // Catch:{ all -> 0x0461 }
            goto L_0x045f
        L_0x044a:
            r0 = 3
            float[] r1 = new float[r0]     // Catch:{ all -> 0x0461 }
            android.hardware.SensorManager.getOrientation(r10, r1)     // Catch:{ all -> 0x0461 }
            r0 = 2
            r0 = r1[r0]     // Catch:{ all -> 0x0461 }
            double r0 = (double) r0     // Catch:{ all -> 0x0461 }
            double r1 = java.lang.Math.toDegrees(r0)     // Catch:{ all -> 0x0461 }
            float r0 = (float) r1     // Catch:{ all -> 0x0461 }
            r3.A00 = r0     // Catch:{ all -> 0x0461 }
            r0 = 1
            r3.A05 = r0     // Catch:{ all -> 0x0461 }
            goto L_0x0436
        L_0x045f:
            monitor-exit(r3)
            return
        L_0x0461:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26354CyG.onSensorChanged(android.hardware.SensorEvent):void");
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
    }
}
