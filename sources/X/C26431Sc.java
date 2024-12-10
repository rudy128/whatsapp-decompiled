package X;

import android.content.Context;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.net.Uri;
import android.util.Pair;
import android.util.Range;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.media.WamediaManager;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.camera.VoipLiteCamera;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1Sc  reason: invalid class name and case insensitive filesystem */
public class C26431Sc {
    public final AnonymousClass190 A00;
    public final C218617r A01;
    public final AnonymousClass11E A02;
    public final C18030ve A03;
    public final WamediaManager A04;
    public final AnonymousClass1SK A05;
    public final C24641Lc A06;
    public final AnonymousClass1SO A07;
    public final AnonymousClass11C A08;
    public final C18010vc A09;

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00f9, code lost:
        if (r14.isEmpty() != false) goto L_0x00fb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C25752ClM A06(X.C25092CXd r24, java.lang.Integer r25, java.lang.Integer r26, java.lang.Integer r27) {
        /*
            r6 = 1
            r2 = 0
            r7 = r25
            int r4 = r7.intValue()
            r0 = 0
            r1 = 2
            if (r4 == r0) goto L_0x00b8
            if (r4 == r6) goto L_0x00b1
            r0 = 3
            int[] r3 = new int[r1]
            if (r4 == r0) goto L_0x00ac
            r3 = {720, 1280} // fill-array
        L_0x0016:
            X.Chb r5 = X.C25538Chb.A02
            r1 = r3[r6]
            r0 = 0
            r0 = r3[r0]
            int r9 = java.lang.Math.max(r1, r0)
            r5.A01 = r9
            r12 = r24
            int r4 = r12.A04
            int r6 = r4 % 180
            r13 = 0
            if (r6 == 0) goto L_0x002d
            r13 = 1
        L_0x002d:
            X.ClM r3 = new X.ClM
            r3.<init>()
            int r8 = r12.A05
            r25 = r8
            int r1 = r12.A03
            r24 = r1
            if (r26 == 0) goto L_0x004c
            if (r27 == 0) goto L_0x004c
            int r10 = r26.intValue()
            if (r10 <= 0) goto L_0x004c
            int r0 = r27.intValue()
            if (r0 <= 0) goto L_0x004c
            r8 = r10
            r1 = r0
        L_0x004c:
            r0 = r25
            r3.A07 = r0
            r0 = r24
            r3.A05 = r0
            r3.A06 = r4
            r0 = 30
            r3.A01 = r0
            r0 = 10
            r3.A02 = r0
            r3.A0H = r2
            if (r6 == 0) goto L_0x00a3
            if (r13 == 0) goto L_0x00a3
            r3.A0A = r1
            r10 = r1
            r3.A08 = r8
            r0 = 0
            r3.A09 = r0
        L_0x006c:
            r11 = r25
            r2 = r24
            if (r26 == 0) goto L_0x008c
            if (r27 == 0) goto L_0x008c
            int r1 = r26.intValue()
            if (r1 <= 0) goto L_0x008c
            int r0 = r27.intValue()
            if (r0 <= 0) goto L_0x008c
            r11 = r1
            r2 = r0
            if (r13 == 0) goto L_0x0086
            r11 = r0
            r2 = r1
        L_0x0086:
            int r9 = java.lang.Math.max(r0, r1)
            r5.A01 = r9
        L_0x008c:
            int r0 = java.lang.Math.max(r11, r2)
            int r2 = java.lang.Math.min(r0, r9)
            float r1 = (float) r10
            float r0 = (float) r8
            float r1 = r1 / r0
            X.CAJ.A00(r3, r1, r2)
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            if (r7 == r0) goto L_0x00bf
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            if (r7 == r0) goto L_0x00bf
            return r3
        L_0x00a3:
            r3.A0A = r8
            r10 = r8
            r3.A08 = r1
            r8 = r1
            r3.A09 = r4
            goto L_0x006c
        L_0x00ac:
            r3 = {1080, 1920} // fill-array
            goto L_0x0016
        L_0x00b1:
            int[] r3 = new int[r1]
            r3 = {480, 848} // fill-array
            goto L_0x0016
        L_0x00b8:
            int[] r3 = new int[r1]
            r3 = {360, 640} // fill-array
            goto L_0x0016
        L_0x00bf:
            r2 = r25
            r7 = r24
            if (r26 == 0) goto L_0x00d9
            if (r27 == 0) goto L_0x00d9
            int r1 = r26.intValue()
            if (r1 <= 0) goto L_0x00d9
            int r0 = r27.intValue()
            if (r0 <= 0) goto L_0x00d9
            r2 = r1
            r7 = r0
            if (r6 == 0) goto L_0x00d9
            r2 = r0
            r7 = r1
        L_0x00d9:
            int r11 = r3.A04
            android.graphics.RectF r1 = r3.A0C
            java.lang.Integer r0 = r3.A0F
            r23 = r0
            X.Cab r0 = r3.A0E
            r22 = r0
            int r0 = r3.A0B
            r21 = r0
            boolean r0 = r3.A0I
            r20 = r0
            int r15 = r3.A02
            java.util.List r14 = r3.A0H
            if (r14 == 0) goto L_0x00fb
            boolean r0 = r14.isEmpty()
            r17 = 1
            if (r0 == 0) goto L_0x00fd
        L_0x00fb:
            r17 = 0
        L_0x00fd:
            r0 = 90
            if (r4 == r0) goto L_0x0421
            r0 = 270(0x10e, float:3.78E-43)
            if (r4 == r0) goto L_0x0421
            r0 = r2
            r2 = r7
        L_0x0107:
            float r10 = (float) r0
            float r0 = r1.width()
            float r3 = r10 * r0
            float r7 = (float) r2
            float r0 = r1.height()
            float r2 = r7 * r0
            int r9 = (int) r3
            int r8 = (int) r2
            if (r9 <= r8) goto L_0x0416
            int r0 = r5.A01
            if (r9 <= r0) goto L_0x0416
            int r8 = r8 * r0
            int r8 = r8 / r9
            r9 = r0
        L_0x0120:
            android.media.MediaCodecInfo$CodecCapabilities r6 = A02()
            if (r6 == 0) goto L_0x0412
            android.media.MediaCodecInfo$VideoCapabilities r0 = r6.getVideoCapabilities()
            if (r0 == 0) goto L_0x0412
            android.media.MediaCodecInfo$VideoCapabilities r0 = r6.getVideoCapabilities()
            int r19 = r0.getWidthAlignment()
        L_0x0134:
            android.media.MediaCodecInfo$CodecCapabilities r6 = A02()
            if (r6 == 0) goto L_0x040e
            android.media.MediaCodecInfo$VideoCapabilities r0 = r6.getVideoCapabilities()
            if (r0 == 0) goto L_0x040e
            android.media.MediaCodecInfo$VideoCapabilities r0 = r6.getVideoCapabilities()
            int r18 = r0.getHeightAlignment()
        L_0x0148:
            float r13 = (float) r9
            float r16 = r13 / r3
            float r6 = (float) r8
            float r0 = r6 / r2
            float r3 = r1.left
            float r2 = r1.top
            float r16 = r16 * r10
            float r13 = r13 / r16
            float r1 = r3 + r13
            float r0 = r0 * r7
            float r6 = r6 / r0
            float r0 = r2 + r6
            android.graphics.RectF r13 = new android.graphics.RectF
            r13.<init>(r3, r2, r1, r0)
            r10 = 0
            if (r17 == 0) goto L_0x016c
            int r0 = r11 % 180
            if (r0 == 0) goto L_0x016b
            r0 = r8
            r8 = r9
            r9 = r0
        L_0x016b:
            int r10 = -r11
        L_0x016c:
            android.media.MediaCodecInfo$CodecCapabilities r1 = A02()
            if (r1 == 0) goto L_0x03fc
            android.media.MediaCodecInfo$VideoCapabilities r0 = r1.getVideoCapabilities()
            if (r0 == 0) goto L_0x03fc
            android.media.MediaCodecInfo$VideoCapabilities r0 = r1.getVideoCapabilities()
            android.util.Range r17 = r0.getSupportedWidths()
        L_0x0180:
            android.media.MediaCodecInfo$CodecCapabilities r1 = A02()
            if (r1 == 0) goto L_0x03ea
            android.media.MediaCodecInfo$VideoCapabilities r0 = r1.getVideoCapabilities()
            if (r0 == 0) goto L_0x03ea
            android.media.MediaCodecInfo$VideoCapabilities r0 = r1.getVideoCapabilities()
            android.util.Range r16 = r0.getSupportedHeights()
        L_0x0194:
            X.ClM r7 = new X.ClM
            r7.<init>()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "getCorrectedResolution: Input targetWidth="
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = " targetHeight = "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = r1.toString()
            r6.append(r0)
            if (r8 == 0) goto L_0x01be
            if (r9 != 0) goto L_0x01c7
        L_0x01be:
            java.lang.String r0 = "getCorrectedResolution-1"
            r6.append(r0)
            r8 = 1280(0x500, float:1.794E-42)
            r9 = 720(0x2d0, float:1.009E-42)
        L_0x01c7:
            boolean r0 = A07(r9, r8)
            if (r0 != 0) goto L_0x01d0
            A07(r8, r9)
        L_0x01d0:
            r1 = r9
            r2 = r8
            int r0 = r9 % r19
            if (r0 == 0) goto L_0x01df
            int r1 = r19 - r0
            int r1 = r1 + r9
            float r3 = (float) r8
            float r2 = (float) r1
            float r0 = (float) r9
            float r2 = r2 / r0
            float r3 = r3 * r2
            int r2 = (int) r3
        L_0x01df:
            int r0 = r2 % r18
            if (r0 == 0) goto L_0x01e6
            int r0 = r18 - r0
            int r2 = r2 + r0
        L_0x01e6:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            android.util.Pair r2 = new android.util.Pair
            r2.<init>(r1, r0)
            boolean r0 = A07(r9, r8)
            if (r0 != 0) goto L_0x0224
            java.lang.Object r0 = r2.first
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            java.lang.Object r0 = r2.second
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            boolean r0 = A07(r1, r0)
            if (r0 == 0) goto L_0x0224
            java.lang.String r0 = "getCorrectedResolution-3"
            r6.append(r0)
            java.lang.Object r0 = r2.first
            java.lang.Number r0 = (java.lang.Number) r0
            int r9 = r0.intValue()
            java.lang.Object r0 = r2.second
            java.lang.Number r0 = (java.lang.Number) r0
            int r8 = r0.intValue()
        L_0x0224:
            boolean r0 = A07(r9, r8)
            if (r0 != 0) goto L_0x023d
            java.lang.Object r0 = r2.second
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            java.lang.Object r0 = r2.first
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            A07(r1, r0)
        L_0x023d:
            r2 = r9
            r3 = r8
            int r0 = r9 % r19
            if (r0 == 0) goto L_0x024b
            int r2 = r9 - r0
            float r3 = (float) r8
            float r1 = (float) r2
            float r0 = (float) r9
            float r1 = r1 / r0
            float r3 = r3 * r1
            int r3 = (int) r3
        L_0x024b:
            int r0 = r3 % r18
            if (r0 == 0) goto L_0x0250
            int r3 = r3 - r0
        L_0x0250:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            android.util.Pair r2 = new android.util.Pair
            r2.<init>(r1, r0)
            boolean r0 = A07(r9, r8)
            if (r0 != 0) goto L_0x028e
            java.lang.Object r0 = r2.first
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            java.lang.Object r0 = r2.second
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            boolean r0 = A07(r1, r0)
            if (r0 == 0) goto L_0x028e
            java.lang.String r0 = "getCorrectedResolution-5"
            r6.append(r0)
            java.lang.Object r0 = r2.first
            java.lang.Number r0 = (java.lang.Number) r0
            int r9 = r0.intValue()
            java.lang.Object r0 = r2.second
            java.lang.Number r0 = (java.lang.Number) r0
            int r8 = r0.intValue()
        L_0x028e:
            boolean r0 = A07(r9, r8)
            if (r0 != 0) goto L_0x02a7
            java.lang.Object r0 = r2.second
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            java.lang.Object r0 = r2.first
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            A07(r1, r0)
        L_0x02a7:
            r16.getUpper()
            r17.getUpper()
            boolean r0 = A07(r9, r8)
            if (r0 != 0) goto L_0x0306
            java.lang.Comparable r0 = r16.getUpper()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r8 <= r0) goto L_0x0306
            java.lang.String r0 = "getCorrectedResolution-9"
            r6.append(r0)
            double r2 = (double) r9
            double r0 = (double) r8
            double r2 = r2 / r0
            java.lang.Comparable r0 = r16.getUpper()
            java.lang.Number r0 = (java.lang.Number) r0
            int r8 = r0.intValue()
            java.lang.Comparable r0 = r16.getUpper()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            double r0 = (double) r0
            double r2 = r2 * r0
            int r1 = (int) r2
            int r1 = r1 / r19
            int r1 = r1 * r19
            android.util.Range r0 = A05(r8)
            java.lang.Comparable r0 = r0.getLower()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r1 = java.lang.Math.max(r1, r0)
            android.util.Range r0 = A05(r8)
            java.lang.Comparable r0 = r0.getUpper()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r9 = java.lang.Math.min(r1, r0)
        L_0x0306:
            boolean r0 = A07(r9, r8)
            if (r0 != 0) goto L_0x033b
            java.lang.Comparable r0 = r17.getUpper()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r9 <= r0) goto L_0x033b
            java.lang.String r0 = "getCorrectedResolution-10"
            r6.append(r0)
            double r0 = (double) r8
            double r2 = (double) r9
            double r0 = r0 / r2
            java.lang.Comparable r2 = r17.getUpper()
            java.lang.Number r2 = (java.lang.Number) r2
            int r9 = r2.intValue()
            java.lang.Comparable r2 = r17.getUpper()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            double r2 = (double) r2
            double r0 = r0 * r2
            int r8 = (int) r0
            int r8 = r8 / r18
            int r8 = r8 * r18
        L_0x033b:
            boolean r0 = A07(r9, r8)
            if (r0 != 0) goto L_0x0370
            java.lang.Comparable r0 = r16.getLower()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r8 >= r0) goto L_0x0370
            java.lang.String r0 = "getCorrectedResolution-11"
            r6.append(r0)
            double r2 = (double) r9
            double r0 = (double) r8
            double r2 = r2 / r0
            java.lang.Comparable r0 = r16.getLower()
            java.lang.Number r0 = (java.lang.Number) r0
            int r8 = r0.intValue()
            java.lang.Comparable r0 = r16.getLower()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            double r0 = (double) r0
            double r2 = r2 * r0
            int r9 = (int) r2
            int r9 = r9 / r19
            int r9 = r9 * r19
        L_0x0370:
            boolean r0 = A07(r9, r8)
            if (r0 != 0) goto L_0x03a5
            java.lang.Comparable r0 = r17.getLower()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r9 >= r0) goto L_0x03a5
            java.lang.String r0 = "getCorrectedResolution-12"
            r6.append(r0)
            double r2 = (double) r8
            double r0 = (double) r9
            double r2 = r2 / r0
            java.lang.Comparable r0 = r17.getLower()
            java.lang.Number r0 = (java.lang.Number) r0
            int r9 = r0.intValue()
            java.lang.Comparable r0 = r17.getLower()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            double r0 = (double) r0
            double r2 = r2 * r0
            int r8 = (int) r2
            int r8 = r8 / r18
            int r8 = r8 * r18
        L_0x03a5:
            boolean r0 = A07(r9, r8)
            if (r0 != 0) goto L_0x0424
            java.lang.String r0 = "getCorrectedResolution-13"
            r6.append(r0)
            java.lang.Comparable r0 = r17.getUpper()
            java.lang.Number r0 = (java.lang.Number) r0
            int r9 = r0.intValue()
            android.media.MediaCodecInfo$CodecCapabilities r1 = A02()
            if (r1 == 0) goto L_0x03d9
            android.media.MediaCodecInfo$VideoCapabilities r0 = r1.getVideoCapabilities()
            if (r0 == 0) goto L_0x03d9
            android.media.MediaCodecInfo$VideoCapabilities r0 = r1.getVideoCapabilities()
            android.util.Range r0 = r0.getSupportedHeightsFor(r9)
        L_0x03ce:
            java.lang.Comparable r0 = r0.getUpper()
            java.lang.Number r0 = (java.lang.Number) r0
            int r8 = r0.intValue()
            goto L_0x0424
        L_0x03d9:
            r0 = 32
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 1280(0x500, float:1.794E-42)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            android.util.Range r0 = android.util.Range.create(r1, r0)
            goto L_0x03ce
        L_0x03ea:
            r0 = 32
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 1280(0x500, float:1.794E-42)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            android.util.Range r16 = android.util.Range.create(r1, r0)
            goto L_0x0194
        L_0x03fc:
            r0 = 32
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 1280(0x500, float:1.794E-42)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            android.util.Range r17 = android.util.Range.create(r1, r0)
            goto L_0x0180
        L_0x040e:
            r18 = 16
            goto L_0x0148
        L_0x0412:
            r19 = 16
            goto L_0x0134
        L_0x0416:
            if (r8 <= r9) goto L_0x0120
            int r0 = r5.A01
            if (r8 <= r0) goto L_0x0120
            int r9 = r9 * r0
            int r9 = r9 / r8
            r8 = r0
            goto L_0x0120
        L_0x0421:
            r0 = r7
            goto L_0x0107
        L_0x0424:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x04ad }
            r2.<init>()     // Catch:{ IllegalArgumentException -> 0x04ad }
            java.lang.String r0 = "getSupportedFrameRatesFor ="
            r2.append(r0)     // Catch:{ IllegalArgumentException -> 0x04ad }
            android.media.MediaCodecInfo$CodecCapabilities r1 = A02()     // Catch:{ IllegalArgumentException -> 0x04ad }
            if (r1 == 0) goto L_0x049c
            android.media.MediaCodecInfo$VideoCapabilities r0 = r1.getVideoCapabilities()     // Catch:{ IllegalArgumentException -> 0x04ad }
            if (r0 == 0) goto L_0x049c
            android.media.MediaCodecInfo$VideoCapabilities r0 = r1.getVideoCapabilities()     // Catch:{ IllegalArgumentException -> 0x04ad }
            android.util.Range r0 = r0.getSupportedFrameRatesFor(r9, r8)     // Catch:{ IllegalArgumentException -> 0x04ad }
        L_0x0442:
            r2.append(r0)     // Catch:{ IllegalArgumentException -> 0x04ad }
            java.lang.String r0 = r2.toString()     // Catch:{ IllegalArgumentException -> 0x04ad }
            r6.append(r0)     // Catch:{ IllegalArgumentException -> 0x04ad }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x04ad }
            r2.<init>()     // Catch:{ IllegalArgumentException -> 0x04ad }
            java.lang.String r0 = "getBitrateRange ="
            r2.append(r0)     // Catch:{ IllegalArgumentException -> 0x04ad }
            android.media.MediaCodecInfo$CodecCapabilities r1 = A02()     // Catch:{ IllegalArgumentException -> 0x04ad }
            if (r1 == 0) goto L_0x048b
            android.media.MediaCodecInfo$VideoCapabilities r0 = r1.getVideoCapabilities()     // Catch:{ IllegalArgumentException -> 0x04ad }
            if (r0 == 0) goto L_0x048b
            android.media.MediaCodecInfo$VideoCapabilities r0 = r1.getVideoCapabilities()     // Catch:{ IllegalArgumentException -> 0x04ad }
            android.util.Range r0 = r0.getBitrateRange()     // Catch:{ IllegalArgumentException -> 0x04ad }
        L_0x046a:
            r2.append(r0)     // Catch:{ IllegalArgumentException -> 0x04ad }
            java.lang.String r0 = r2.toString()     // Catch:{ IllegalArgumentException -> 0x04ad }
            r6.append(r0)     // Catch:{ IllegalArgumentException -> 0x04ad }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x04ad }
            r1.<init>()     // Catch:{ IllegalArgumentException -> 0x04ad }
            java.lang.String r0 = "mediaTranscodeParams.targetRotationDegreesClockwise = "
            r1.append(r0)     // Catch:{ IllegalArgumentException -> 0x04ad }
            int r0 = r7.A09     // Catch:{ IllegalArgumentException -> 0x04ad }
            r1.append(r0)     // Catch:{ IllegalArgumentException -> 0x04ad }
            java.lang.String r0 = r1.toString()     // Catch:{ IllegalArgumentException -> 0x04ad }
            r6.append(r0)     // Catch:{ IllegalArgumentException -> 0x04ad }
            goto L_0x04c6
        L_0x048b:
            r0 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ IllegalArgumentException -> 0x04ad }
            r0 = 500000(0x7a120, float:7.00649E-40)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IllegalArgumentException -> 0x04ad }
            android.util.Range r0 = android.util.Range.create(r1, r0)     // Catch:{ IllegalArgumentException -> 0x04ad }
            goto L_0x046a
        L_0x049c:
            r0 = 0
            java.lang.Double r1 = java.lang.Double.valueOf(r0)     // Catch:{ IllegalArgumentException -> 0x04ad }
            r16 = 4629137466983448576(0x403e000000000000, double:30.0)
            java.lang.Double r0 = java.lang.Double.valueOf(r16)     // Catch:{ IllegalArgumentException -> 0x04ad }
            android.util.Range r0 = android.util.Range.create(r1, r0)     // Catch:{ IllegalArgumentException -> 0x04ad }
            goto L_0x0442
        L_0x04ad:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "exception = "
            r1.append(r0)
            java.lang.String r0 = r2.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r6.append(r0)
        L_0x04c6:
            r7.A0A = r9
            r7.A08 = r8
            java.lang.String r2 = r6.toString()
            r7.A0G = r2
            int r0 = r7.A09
            int r10 = r10 + r0
            X.ClM r1 = new X.ClM
            r1.<init>()
            r0 = r24
            r1.A05 = r0
            r0 = r25
            r1.A07 = r0
            r1.A06 = r4
            r1.A04 = r11
            r0 = 0
            r1.A0K = r0
            r1.A09 = r10
            r1.A08 = r8
            r1.A0A = r9
            r1.A0C = r13
            r0 = r23
            r1.A0F = r0
            int r0 = r5.A00
            if (r0 > 0) goto L_0x04fa
            long r3 = r12.A06
            int r0 = (int) r3
        L_0x04fa:
            r1.A00 = r0
            r0 = 1106247680(0x41f00000, float:30.0)
            int r0 = java.lang.Math.round(r0)
            r1.A01 = r0
            r1.A02 = r15
            r0 = r22
            r1.A0E = r0
            r1.A0H = r14
            r0 = r21
            r1.A0B = r0
            r1.A0G = r2
            r0 = r20
            r1.A0I = r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26431Sc.A06(X.CXd, java.lang.Integer, java.lang.Integer, java.lang.Integer):X.ClM");
    }

    public boolean A0E(C26551So r4, File file) {
        if (file != null) {
            try {
                if (C63972u0.A09(r4)) {
                    if (AnonymousClass1SO.A04(file).A01 != 0) {
                        return true;
                    }
                } else if ((C26551So.A05 == r4 || C26551So.A0M == r4 || C26551So.A0S == r4 || C26551So.A0W == r4) && AnonymousClass1SO.A04(file).A01 == 2) {
                    return true;
                }
            } catch (IOException e) {
                Log.e("transcodeutils/isEligibleForMp4Check exception", e);
                return false;
            }
        }
        return false;
    }

    public boolean A0G(C26551So r6, File file, long j, boolean z, boolean z2) {
        int i;
        if (!z && !z2) {
            C18030ve r2 = this.A03;
            if (r6 == C26551So.A0d) {
                i = 4155;
            } else {
                i = 3656;
                if (C63972u0.A08(r6)) {
                    i = 3185;
                }
            }
            if (j <= ((long) C18020vd.A00(C18040vf.A02, r2, i)) * 1048576) {
                return !this.A07.A0G(file);
            }
        }
        return true;
    }

    public static float A00(int i, int i2, int i3, int i4, long j) {
        if (i2 == 0 || i3 == 0) {
            return 3.0f;
        }
        float f = (((float) ((i * EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) * EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH)) * 8000.0f) / ((float) (((i2 * i3) * 3) + 96000));
        float max = Math.max(0.0f, f - ((float) j)) / f;
        return (((float) (i4 - 3)) * max * max) + 3.0f;
    }

    public static int A01(C26431Sc r10, int i) {
        JSONObject jSONObject;
        Float BNL = r10.A05.BNL(0);
        C18030ve r3 = r10.A03;
        r3.A0J(5550);
        C18040vf r2 = C18040vf.A02;
        JSONObject A022 = C18020vd.A02(r2, r3, 5550);
        if (i <= 640) {
            try {
                jSONObject = A022.getJSONObject("360");
            } catch (JSONException unused) {
            }
        } else if (i <= 854) {
            jSONObject = A022.getJSONObject("480");
        } else if (i <= 1280) {
            jSONObject = A022.getJSONObject("720");
        } else {
            jSONObject = A022.getJSONObject("1080");
        }
        int i2 = jSONObject.getInt("min_bitrate");
        int i3 = jSONObject.getInt("max_bitrate");
        int i4 = jSONObject.getInt("null_bitrate");
        int i5 = jSONObject.getInt("min_bandwidth");
        int i6 = jSONObject.getInt("max_bandwidth");
        if (BNL != null) {
            float floatValue = BNL.floatValue();
            float f = (float) i5;
            if (floatValue <= f) {
                i4 = i2;
            } else if (floatValue >= ((float) i6)) {
                i4 = i3;
            } else {
                i4 = (int) ((((floatValue - f) / ((float) (i6 - i5))) * ((float) (i3 - i2))) + ((float) i2));
            }
        }
        if (i4 > 0 && C18020vd.A05(r2, r3, 5549)) {
            return i4;
        }
        int i7 = 3755;
        if (i > 640) {
            i7 = 3756;
            if (i > 854) {
                i7 = 3758;
                if (i <= 1280) {
                    i7 = 3757;
                }
            }
        }
        return C18020vd.A00(r2, r3, i7);
    }

    public static Pair A03(int i, int i2, int i3) {
        Integer valueOf;
        Integer valueOf2;
        if (i > i2) {
            if (i > i3) {
                valueOf = Integer.valueOf(i3);
                i2 = (i2 * i3) / i;
            }
            valueOf = Integer.valueOf(i);
        } else {
            if (i2 > i3) {
                valueOf = Integer.valueOf((i * i3) / i2);
                valueOf2 = Integer.valueOf(i3);
                return new Pair(valueOf, valueOf2);
            }
            valueOf = Integer.valueOf(i);
        }
        valueOf2 = Integer.valueOf(i2);
        return new Pair(valueOf, valueOf2);
    }

    public static Pair A04(C59382mD r13, C1405471x r14, int i) {
        String str;
        String str2;
        ArrayList arrayList = new ArrayList();
        int i2 = r14.A02;
        int i3 = r14.A00;
        long j = r14.A03;
        boolean z = true;
        if (!r14.A07) {
            if (i == 13) {
                if (r14.A06) {
                    str2 = "GifHasGifTag";
                } else if (r14.A05.length() > 262144) {
                    float f = (float) (i2 * i3);
                    float A012 = ((float) r14.A01()) / f;
                    float max = Math.max(2.0f, Math.min(10.0f, 153600.0f / f)) * 1.1f;
                    if (A012 <= max) {
                        z = false;
                        StringBuilder sb = new StringBuilder();
                        sb.append("originalBitrate<=1.1TimesTranscodeBitrate | ");
                        sb.append(A012);
                        sb.append(" <= ");
                        sb.append(max);
                        str = sb.toString();
                    }
                } else {
                    str2 = "IsAnimatedGif";
                }
                arrayList.add(str2);
                z = false;
            } else {
                int i4 = r13.A02;
                if (i2 > i4 || i3 > i4) {
                    if (i2 < i3) {
                        i2 = (i2 * i4) / i3;
                        i3 = i4;
                    } else {
                        i3 = (i3 * i4) / i2;
                        i2 = i4;
                    }
                }
                long j2 = j / 1000;
                if (((long) (((Math.min((float) r13.A01, ((float) (i2 * i3)) * A00(r13.A00, i2, i3, 9, j)) * ((float) j2)) / 8.0f) + ((float) ((j2 * 96000) / 8)))) >= r14.A05.length()) {
                    z = false;
                    str = "estimatedDstSize>=inputSize";
                }
            }
            arrayList.add(str);
        }
        return new Pair(Boolean.valueOf(z), arrayList);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0083, code lost:
        if (r24 != false) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0085, code lost:
        r0 = 96000.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0090, code lost:
        return (long) (((r1 + r0) * ((float) (r9 / 1000))) / 8.0f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a4, code lost:
        if (r22 != false) goto L_0x0082;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long A09(X.C59382mD r12, X.C1405471x r13, java.io.File r14, java.lang.Integer r15, java.lang.Integer r16, long r17, long r19, boolean r21, boolean r22, boolean r23, boolean r24) {
        /*
            r11 = this;
            long r0 = r17 - r19
            r2 = 1000(0x3e8, double:4.94E-321)
            long r9 = java.lang.Math.max(r2, r0)
            if (r23 != 0) goto L_0x0056
            r4 = 0
            int r0 = (r19 > r4 ? 1 : (r19 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x003a
            long r0 = r13.A03
            int r4 = (r17 > r0 ? 1 : (r17 == r0 ? 0 : -1))
            if (r4 != 0) goto L_0x003a
            long r6 = r14.length()
            int r0 = r12.A00
            long r0 = (long) r0
            r4 = 1048576(0x100000, double:5.180654E-318)
            long r0 = r0 * r4
            int r4 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r4 > 0) goto L_0x003a
            if (r15 == 0) goto L_0x002d
            int r0 = r15.intValue()
            if (r0 > 0) goto L_0x003a
        L_0x002d:
            if (r16 == 0) goto L_0x0035
            int r0 = r16.intValue()
            if (r0 > 0) goto L_0x003a
        L_0x0035:
            long r2 = r14.length()
            return r2
        L_0x003a:
            r0 = 3
            if (r21 == 0) goto L_0x003f
            r0 = 13
        L_0x003f:
            android.util.Pair r0 = A04(r12, r13, r0)
            java.lang.Object r0 = r0.first
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0056
            long r2 = r14.length()
            long r2 = r2 * r9
            long r0 = r13.A03
            long r2 = r2 / r0
            return r2
        L_0x0056:
            if (r15 != 0) goto L_0x00ac
            int r5 = r13.A02
        L_0x005a:
            if (r16 != 0) goto L_0x00a7
            int r4 = r13.A00
        L_0x005e:
            int r1 = r12.A02
            int r0 = java.lang.Math.max(r5, r4)
            int r0 = java.lang.Math.min(r1, r0)
            android.util.Pair r1 = A03(r5, r4, r0)
            java.lang.Object r0 = r1.first
            java.lang.Number r0 = (java.lang.Number) r0
            int r6 = r0.intValue()
            java.lang.Object r0 = r1.second
            java.lang.Number r0 = (java.lang.Number) r0
            int r7 = r0.intValue()
            if (r21 == 0) goto L_0x0091
            int r6 = r6 * r7
            int r0 = r6 * 2
            float r1 = (float) r0
        L_0x0082:
            r0 = 0
            if (r24 == 0) goto L_0x0088
        L_0x0085:
            r0 = 1203470336(0x47bb8000, float:96000.0)
        L_0x0088:
            float r1 = r1 + r0
            long r9 = r9 / r2
            float r0 = (float) r9
            float r1 = r1 * r0
            r0 = 1090519040(0x41000000, float:8.0)
            float r1 = r1 / r0
            long r2 = (long) r1
            return r2
        L_0x0091:
            int r0 = r12.A01
            float r4 = (float) r0
            int r0 = r6 * r7
            float r1 = (float) r0
            int r5 = r12.A00
            r8 = 9
            float r0 = A00(r5, r6, r7, r8, r9)
            float r1 = r1 * r0
            float r1 = java.lang.Math.min(r4, r1)
            if (r22 == 0) goto L_0x0085
            goto L_0x0082
        L_0x00a7:
            int r4 = r16.intValue()
            goto L_0x005e
        L_0x00ac:
            int r5 = r15.intValue()
            goto L_0x005a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26431Sc.A09(X.2mD, X.71x, java.io.File, java.lang.Integer, java.lang.Integer, long, long, boolean, boolean, boolean, boolean):long");
    }

    public Pair A0A(long j, long j2) {
        int i;
        ArrayList arrayList = new ArrayList();
        int A002 = C18020vd.A00(C18040vf.A02, this.A03, 3183);
        boolean z = true;
        boolean z2 = true;
        if (j <= 262144) {
            z2 = false;
            StringBuilder sb = new StringBuilder();
            sb.append("videoSize<=MIN_FILE_SIZE_FOR_BITRATE_CHECK | ");
            sb.append(j / 1024);
            sb.append("Kb <= 256Kb");
            arrayList.add(sb.toString());
        }
        if (j2 == 0) {
            i = 0;
        } else {
            i = (int) ((j * 8) / (j2 * 1000));
        }
        boolean z3 = false;
        if (i > A01(this, A002)) {
            z3 = true;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("videoBitrate<=maxBitrate | ");
            sb2.append(i);
            sb2.append("Kbps <= ");
            sb2.append(A01(this, A002));
            sb2.append("Kbps");
            arrayList.add(sb2.toString());
        }
        if (!z2 || !z3) {
            z = false;
        }
        return new Pair(Boolean.valueOf(z), arrayList);
    }

    public C59382mD A0B() {
        C18030ve r2 = this.A03;
        C18040vf r1 = C18040vf.A02;
        int A002 = C18020vd.A00(r1, r2, 594);
        return new C59382mD(C18020vd.A00(r1, r2, 596), A002, (int) (((long) A01(this, A002)) * 1000));
    }

    /* JADX WARNING: type inference failed for: r5v11, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C59382mD A0C(boolean r10, boolean r11, boolean r12) {
        /*
            r9 = this;
            X.0ve r3 = r9.A03
            r0 = 3183(0xc6f, float:4.46E-42)
            X.0vf r1 = X.C18040vf.A02
            int r5 = X.C18020vd.A00(r1, r3, r0)
            r0 = 3185(0xc71, float:4.463E-42)
            int r2 = X.C18020vd.A00(r1, r3, r0)
            if (r11 == 0) goto L_0x001e
            r0 = 3656(0xe48, float:5.123E-42)
            int r2 = X.C18020vd.A00(r1, r3, r0)
            r0 = 3654(0xe46, float:5.12E-42)
            int r5 = X.C18020vd.A00(r1, r3, r0)
        L_0x001e:
            if (r12 == 0) goto L_0x002c
            r0 = 4155(0x103b, float:5.822E-42)
            int r2 = X.C18020vd.A00(r1, r3, r0)
            r0 = 4686(0x124e, float:6.566E-42)
            int r5 = X.C18020vd.A00(r1, r3, r0)
        L_0x002c:
            if (r10 == 0) goto L_0x00ac
            r0 = 3659(0xe4b, float:5.127E-42)
            int r2 = X.C18020vd.A00(r1, r3, r0)
            X.1Lc r0 = r9.A06
            X.0ve r4 = r0.A01
            r0 = 9705(0x25e9, float:1.36E-41)
            org.json.JSONObject r5 = X.C18020vd.A02(r1, r4, r0)
            java.lang.String r4 = "min_bandwidth"
            boolean r0 = r5.has(r4)
            if (r0 == 0) goto L_0x0071
            int r8 = r5.getInt(r4)
        L_0x004a:
            java.lang.String r4 = "network_types"
            boolean r0 = r5.has(r4)
            if (r0 == 0) goto L_0x007b
            org.json.JSONArray r7 = r5.getJSONArray(r4)
            X.C18070vi.A0X(r7)
            int r6 = r7.length()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r6)
            r4 = 0
        L_0x0063:
            if (r4 >= r6) goto L_0x007d
            java.lang.Object r0 = r7.get(r4)
            if (r0 == 0) goto L_0x0073
            r5.add(r0)
            int r4 = r4 + 1
            goto L_0x0063
        L_0x0071:
            r8 = -1
            goto L_0x004a
        L_0x0073:
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Int"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x007b:
            X.0wS r5 = X.C18460wS.A00
        L_0x007d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            X.1D6 r4 = new X.1D6
            r4.<init>(r0, r5)
            java.lang.Object r0 = r4.first
            java.lang.Number r0 = (java.lang.Number) r0
            int r6 = r0.intValue()
            java.lang.Object r5 = r4.second
            java.util.List r5 = (java.util.List) r5
            if (r6 <= 0) goto L_0x00a6
            X.1SK r4 = r9.A05
            r0 = 0
            java.lang.Float r0 = r4.BNL(r0)
            if (r0 == 0) goto L_0x00bb
            float r4 = r0.floatValue()
            float r0 = (float) r6
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x00d6
        L_0x00a6:
            r0 = 4685(0x124d, float:6.565E-42)
            int r5 = X.C18020vd.A00(r1, r3, r0)
        L_0x00ac:
            int r0 = A01(r9, r5)
            long r3 = (long) r0
            r0 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r0
            int r1 = (int) r3
            X.2mD r0 = new X.2mD
            r0.<init>(r2, r5, r1)
            return r0
        L_0x00bb:
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x00a6
            X.11E r0 = r9.A02
            X.1LR r0 = r0.A04()
            int r0 = X.AnonymousClass1SL.A00(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r5.contains(r0)
            if (r0 == 0) goto L_0x00d6
            goto L_0x00a6
        L_0x00d6:
            r5 = 640(0x280, float:8.97E-43)
            goto L_0x00ac
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26431Sc.A0C(boolean, boolean, boolean):X.2mD");
    }

    public AnonymousClass1D6 A0D(Context context, Uri uri, C1405471x r36, Integer num, Integer num2, int i) {
        C25092CXd A002;
        C1405471x r8 = r36;
        if (r36 != null) {
            if (C18020vd.A05(C18040vf.A02, this.A03, 6781)) {
                long j = r8.A03;
                int i2 = r8.A02;
                int i3 = r8.A00;
                int i4 = i2;
                int i5 = i3;
                A002 = new C25092CXd((C26543D3e) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, "VIDEO", (HashMap) null, i4, i5, r8.A01, 0, 0, 0, j, (long) r8.A01(), r8.A05.length(), !r8.A07);
                C25752ClM A062 = A06(A002, C50322Tz.A00(i), num, num2);
                return new AnonymousClass1D6(Integer.valueOf(A062.A08), Integer.valueOf(A062.A0A));
            }
        }
        boolean A052 = C18020vd.A05(C18040vf.A02, this.A03, 6654);
        Uri uri2 = uri;
        C18070vi.A0d(uri2, 0);
        A002 = C25872Cng.A00(context, uri2, A052);
        if (A002 == null) {
            Log.e("videolite/BadVideoException sourceVideoMetadata==null");
            return new AnonymousClass1D6(0, 0);
        }
        C25752ClM A0622 = A06(A002, C50322Tz.A00(i), num, num2);
        return new AnonymousClass1D6(Integer.valueOf(A0622.A08), Integer.valueOf(A0622.A0A));
    }

    public boolean A0F(C26551So r10, File file) {
        int i;
        try {
            byte[] bArr = C26551So.A10;
            if (!C63972u0.A09(r10)) {
                return false;
            }
            C18030ve r8 = this.A03;
            if (r10 == C26551So.A0d) {
                i = 4155;
            } else {
                i = 3656;
                if (C63972u0.A08(r10)) {
                    i = 3185;
                }
            }
            C18040vf r7 = C18040vf.A02;
            if (file.length() > ((long) C18020vd.A00(r7, r8, i)) * 1048576) {
                return true;
            }
            try {
                C1405471x r6 = new C1405471x(this.A04, file);
                int A002 = C18020vd.A00(r7, r8, 3183);
                if (file.length() <= 262144 || r6.A01() / 1000 <= A01(this, A002)) {
                    return !this.A07.A0G(file);
                }
                return true;
            } catch (C26451Se e) {
                Log.e("videopreview/bad video", e);
                return true;
            }
        } catch (IOException e2) {
            Log.e("transcodeutils/needtranscodemedia exception", e2);
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x006d, code lost:
        if (X.C26511Sk.A0H(r10.A01, r1).exists() == false) goto L_0x006f;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x002b */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0053 A[Catch:{ IOException -> 0x0097 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0091 A[Catch:{ IOException -> 0x0097 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0H(X.AnonymousClass21V r11) {
        /*
            r10 = this;
            X.2rc r2 = r11.A02     // Catch:{ IOException -> 0x0097 }
            boolean r0 = r11.A1F()     // Catch:{ IOException -> 0x0097 }
            r1 = 0
            if (r0 == 0) goto L_0x0010
            if (r2 == 0) goto L_0x0096
            java.io.File r0 = r2.A0G     // Catch:{ IOException -> 0x0097 }
            if (r0 != 0) goto L_0x0010
            return r1
        L_0x0010:
            X.C17960vV.A07(r2)     // Catch:{ IOException -> 0x0097 }
            boolean r0 = r2.A0U     // Catch:{ IOException -> 0x0097 }
            if (r0 != 0) goto L_0x0096
            X.1So r4 = X.C63972u0.A02(r11)     // Catch:{ IOException -> 0x0097 }
            X.1So r0 = X.C26551So.A04     // Catch:{ IOException -> 0x0097 }
            if (r4 == r0) goto L_0x0023
            X.1So r0 = X.C26551So.A0U     // Catch:{ IOException -> 0x0097 }
            if (r4 != r0) goto L_0x002b
        L_0x0023:
            java.io.File r0 = r2.A0G     // Catch:{ IOException -> 0x0097 }
            if (r0 == 0) goto L_0x0095
            X.DRK.A04(r0)     // Catch:{ IOException -> 0x002b }
            goto L_0x0095
        L_0x002b:
            X.1So r0 = X.C26551So.A0E     // Catch:{ IOException -> 0x0097 }
            if (r4 == r0) goto L_0x0091
            X.1So r0 = X.C26551So.A0t     // Catch:{ IOException -> 0x0097 }
            if (r4 == r0) goto L_0x0091
            X.1So r0 = X.C26551So.A0K     // Catch:{ IOException -> 0x0097 }
            if (r4 == r0) goto L_0x0091
            X.1So r0 = X.C26551So.A09     // Catch:{ IOException -> 0x0097 }
            if (r4 == r0) goto L_0x0091
            X.1So r0 = X.C26551So.A0h     // Catch:{ IOException -> 0x0097 }
            if (r4 == r0) goto L_0x0091
            X.1So r0 = X.C26551So.A0o     // Catch:{ IOException -> 0x0097 }
            if (r4 == r0) goto L_0x0091
            X.1So r0 = X.C26551So.A0A     // Catch:{ IOException -> 0x0097 }
            if (r4 == r0) goto L_0x0091
            X.1So r0 = X.C26551So.A0V     // Catch:{ IOException -> 0x0097 }
            if (r4 == r0) goto L_0x0091
            X.1So r0 = X.C26551So.A0H     // Catch:{ IOException -> 0x0097 }
            if (r4 == r0) goto L_0x0091
            X.1So r0 = X.C26551So.A0I     // Catch:{ IOException -> 0x0097 }
            if (r4 == r0) goto L_0x0091
            boolean r0 = X.C63972u0.A09(r4)     // Catch:{ IOException -> 0x0097 }
            r3 = r10
            if (r0 == 0) goto L_0x0079
            X.2ra r0 = r2.A0F     // Catch:{ IOException -> 0x0097 }
            boolean r8 = r0.A07     // Catch:{ IOException -> 0x0097 }
            java.lang.String r1 = r2.A0K     // Catch:{ IOException -> 0x0097 }
            if (r1 == 0) goto L_0x006f
            X.17r r0 = r10.A01     // Catch:{ IOException -> 0x0097 }
            java.io.File r0 = X.C26511Sk.A0H(r0, r1)     // Catch:{ IOException -> 0x0097 }
            boolean r0 = r0.exists()     // Catch:{ IOException -> 0x0097 }
            r9 = 1
            if (r0 != 0) goto L_0x0070
        L_0x006f:
            r9 = 0
        L_0x0070:
            java.io.File r5 = r2.A0G     // Catch:{ IOException -> 0x0097 }
            long r6 = r11.A01     // Catch:{ IOException -> 0x0097 }
            boolean r1 = r3.A0G(r4, r5, r6, r8, r9)     // Catch:{ IOException -> 0x0097 }
            return r1
        L_0x0079:
            boolean r0 = X.C63972u0.A03(r4)     // Catch:{ IOException -> 0x0097 }
            if (r0 == 0) goto L_0x008a
            X.1SO r1 = r10.A07     // Catch:{ IOException -> 0x0097 }
            java.io.File r0 = r2.A0G     // Catch:{ IOException -> 0x0097 }
            boolean r0 = r1.A0F(r0)     // Catch:{ IOException -> 0x0097 }
            r1 = r0 ^ 1
            return r1
        L_0x008a:
            boolean r0 = X.C63972u0.A07(r4)     // Catch:{ IOException -> 0x0097 }
            if (r0 == 0) goto L_0x0096
            goto L_0x0095
        L_0x0091:
            java.io.File r0 = r2.A0G     // Catch:{ IOException -> 0x0097 }
            if (r0 != 0) goto L_0x0096
        L_0x0095:
            r1 = 1
        L_0x0096:
            return r1
        L_0x0097:
            r1 = move-exception
            java.lang.String r0 = "transcodeutils/needtranscodemedia exception"
            com.whatsapp.util.Log.e(r0, r1)
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26431Sc.A0H(X.21V):boolean");
    }

    public C26431Sc(AnonymousClass190 r1, C218617r r2, AnonymousClass11E r3, AnonymousClass11C r4, C18030ve r5, WamediaManager wamediaManager, AnonymousClass1SK r7, C18010vc r8, C24641Lc r9, AnonymousClass1SO r10) {
        this.A03 = r5;
        this.A00 = r1;
        this.A01 = r2;
        this.A06 = r9;
        this.A08 = r4;
        this.A04 = wamediaManager;
        this.A05 = r7;
        this.A07 = r10;
        this.A09 = r8;
        this.A02 = r3;
    }

    public static MediaCodecInfo.CodecCapabilities A02() {
        for (MediaCodecInfo mediaCodecInfo : new MediaCodecList(1).getCodecInfos()) {
            if (mediaCodecInfo.isEncoder()) {
                for (String str : mediaCodecInfo.getSupportedTypes()) {
                    if (str.equalsIgnoreCase("video/avc")) {
                        return mediaCodecInfo.getCapabilitiesForType(str);
                    }
                }
                continue;
            }
        }
        return null;
    }

    public static Range A05(int i) {
        MediaCodecInfo.CodecCapabilities A022 = A02();
        if (A022 == null || A022.getVideoCapabilities() == null) {
            return Range.create(32, Integer.valueOf(VoipLiteCamera.DEFAULT_SUPERNOVA_HEIGHT));
        }
        return A022.getVideoCapabilities().getSupportedWidthsFor(i);
    }

    public static boolean A07(int i, int i2) {
        MediaCodecInfo.CodecCapabilities A022 = A02();
        if (A022 == null || A022.getVideoCapabilities() == null) {
            return true;
        }
        return A022.getVideoCapabilities().isSizeSupported(i, i2);
    }

    public static boolean A08(C26551So r2, File file) {
        if (C63972u0.A09(r2)) {
            return true;
        }
        if (r2 == C26551So.A05 || r2 == C26551So.A0s) {
            return DPV.A01(file);
        }
        if (r2 == C26551So.A0E || r2 == C26551So.A0t || r2 == C26551So.A0h || r2 == C26551So.A09 || C63972u0.A07(r2) || r2 == C26551So.A0K || r2 == C26551So.A0Q || r2 == C26551So.A0A || r2 == C26551So.A0V || r2 == C26551So.A0H || r2 == C26551So.A0I || r2 == C26551So.A08 || r2 == C26551So.A0P) {
            return true;
        }
        return false;
    }
}
