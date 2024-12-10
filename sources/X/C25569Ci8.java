package X;

import android.util.SparseArray;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: X.Ci8  reason: case insensitive filesystem */
public class C25569Ci8 {
    public SparseArray A00 = BE6.A0Q();
    public SparseArray A01 = BE6.A0Q();
    public C2t A02 = null;
    public final ConstraintLayout A03;

    /* JADX WARNING: type inference failed for: r8v0, types: [X.C5f, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v3, types: [X.C5V, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r9v8, types: [X.C66, java.lang.Object] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x009d, code lost:
        if (r6 == -1) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x0631, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x0632, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:?, code lost:
        r0.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x0637, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x0638, code lost:
        r0.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x078c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x078d, code lost:
        r0.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x00f5, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:451:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x078c A[ExcHandler: IOException | XmlPullParserException (r0v4 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:1:0x0024] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C25569Ci8(android.content.Context r21, androidx.constraintlayout.widget.ConstraintLayout r22, int r23) {
        /*
            r20 = this;
            r4 = r20
            r4.<init>()
            android.util.SparseArray r0 = X.BE6.A0Q()
            r4.A01 = r0
            android.util.SparseArray r0 = X.BE6.A0Q()
            r4.A00 = r0
            r3 = 0
            r4.A02 = r3
            r0 = r22
            r4.A03 = r0
            r5 = r21
            android.content.res.Resources r0 = r5.getResources()
            r1 = r23
            android.content.res.XmlResourceParser r18 = r0.getXml(r1)
            int r1 = r18.getEventType()     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            r2 = 0
        L_0x0029:
            r0 = 1
            if (r1 == r0) goto L_0x0790
            if (r1 == 0) goto L_0x0032
            r0 = 2
            if (r1 != r0) goto L_0x0050
            goto L_0x0036
        L_0x0032:
            r18.getName()     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            goto L_0x0050
        L_0x0036:
            java.lang.String r6 = r18.getName()     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            int r0 = r6.hashCode()     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            switch(r0) {
                case -1349929691: goto L_0x0055;
                case 80204913: goto L_0x0644;
                case 1382829617: goto L_0x06c6;
                case 1657696882: goto L_0x06d0;
                case 1901439077: goto L_0x06da;
                default: goto L_0x0041;
            }     // Catch:{ IOException | XmlPullParserException -> 0x078c }
        L_0x0041:
            java.lang.String r7 = "ConstraintLayoutStates"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            java.lang.String r0 = "unknown tag "
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r6, r1)     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            android.util.Log.v(r7, r0)     // Catch:{ IOException | XmlPullParserException -> 0x078c }
        L_0x0050:
            int r1 = r18.next()     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            goto L_0x0029
        L_0x0055:
            java.lang.String r1 = "ConstraintSet"
            boolean r0 = r6.equals(r1)     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            if (r0 == 0) goto L_0x0041
            X.Cw9 r17 = new X.Cw9     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            r17.<init>()     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            int r7 = r18.getAttributeCount()     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            r6 = 0
        L_0x0067:
            if (r6 >= r7) goto L_0x0050
            r0 = r18
            java.lang.String r0 = r0.getAttributeName(r6)     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            java.lang.String r10 = "id"
            boolean r0 = r10.equals(r0)     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            if (r0 == 0) goto L_0x00b0
            r0 = r18
            java.lang.String r9 = r0.getAttributeValue(r6)     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            java.lang.String r0 = "/"
            boolean r0 = r9.contains(r0)     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            r7 = 1
            if (r0 == 0) goto L_0x00ae
            r0 = 47
            int r0 = r9.indexOf(r0)     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            java.lang.String r8 = X.BE6.A0p(r0, r9)     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            android.content.res.Resources r6 = r5.getResources()     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            java.lang.String r0 = r5.getPackageName()     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            int r6 = r6.getIdentifier(r8, r10, r0)     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            r0 = -1
            if (r6 != r0) goto L_0x00ba
        L_0x009f:
            int r0 = r9.length()     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            if (r0 <= r7) goto L_0x00b3
            java.lang.String r0 = r9.substring(r7)     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            int r6 = java.lang.Integer.parseInt(r0)     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            goto L_0x00ba
        L_0x00ae:
            r6 = -1
            goto L_0x009f
        L_0x00b0:
            int r6 = r6 + 1
            goto L_0x0067
        L_0x00b3:
            java.lang.String r8 = "ConstraintLayoutStates"
            java.lang.String r0 = "error in parsing id"
            android.util.Log.e(r8, r0)     // Catch:{ IOException | XmlPullParserException -> 0x078c }
        L_0x00ba:
            int r11 = r18.getEventType()     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r8 = r3
        L_0x00bf:
            if (r11 == r7) goto L_0x063b
            if (r11 == 0) goto L_0x00e6
            java.lang.String r10 = "Constraint"
            r9 = 3
            r0 = 2
            if (r11 == r0) goto L_0x00ea
            if (r11 != r9) goto L_0x00f5
            java.lang.String r9 = r18.getName()     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            boolean r0 = r1.equals(r9)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            if (r0 != 0) goto L_0x063b
            boolean r0 = r9.equalsIgnoreCase(r10)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            if (r0 == 0) goto L_0x00f5
            r0 = r17
            java.util.HashMap r9 = r0.A00     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            int r0 = r8.A00     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            X.C108955ca.A1V(r8, r9, r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r8 = r3
            goto L_0x00f5
        L_0x00e6:
            r18.getName()     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x00f5
        L_0x00ea:
            java.lang.String r9 = r18.getName()     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            int r0 = r9.hashCode()     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            switch(r0) {
                case -2025855158: goto L_0x00fa;
                case -1984451626: goto L_0x0397;
                case -1269513683: goto L_0x0410;
                case -1238332596: goto L_0x046f;
                case -71750448: goto L_0x0508;
                case 1331510167: goto L_0x0520;
                case 1791837707: goto L_0x0536;
                case 1803088381: goto L_0x0609;
                default: goto L_0x00f5;
            }     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
        L_0x00f5:
            int r11 = r18.next()     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x00bf
        L_0x00fa:
            java.lang.String r0 = "Layout"
            boolean r0 = r9.equals(r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            if (r0 == 0) goto L_0x00f5
            if (r8 == 0) goto L_0x0619
            X.CpY r11 = r8.A02     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            android.util.AttributeSet r9 = android.util.Xml.asAttributeSet(r18)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            int[] r0 = X.C39121sW.A03     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            android.content.res.TypedArray r10 = r5.obtainStyledAttributes(r9, r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r11.A0w = r7     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            int r16 = r10.getIndexCount()     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r9 = 0
        L_0x0117:
            r0 = r16
            if (r9 >= r0) goto L_0x0392
            int r12 = r10.getIndex(r9)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            android.util.SparseIntArray r15 = X.C25966CpY.A10     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            int r13 = r15.get(r12)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r0 = 80
            if (r13 == r0) goto L_0x0386
            r0 = 81
            if (r13 == r0) goto L_0x037d
            switch(r13) {
                case 1: goto L_0x0210;
                case 2: goto L_0x021a;
                case 3: goto L_0x0224;
                case 4: goto L_0x022e;
                case 5: goto L_0x0238;
                case 6: goto L_0x0240;
                case 7: goto L_0x024a;
                case 8: goto L_0x01fc;
                case 9: goto L_0x0254;
                case 10: goto L_0x025e;
                case 11: goto L_0x0268;
                case 12: goto L_0x0272;
                case 13: goto L_0x027c;
                case 14: goto L_0x0286;
                case 15: goto L_0x0290;
                case 16: goto L_0x029a;
                case 17: goto L_0x02a4;
                case 18: goto L_0x02ae;
                case 19: goto L_0x02b8;
                case 20: goto L_0x02c2;
                case 21: goto L_0x02cc;
                case 22: goto L_0x02d6;
                case 23: goto L_0x02e0;
                case 24: goto L_0x02ea;
                case 25: goto L_0x02f4;
                case 26: goto L_0x02fe;
                case 27: goto L_0x0308;
                case 28: goto L_0x0311;
                case 29: goto L_0x031a;
                case 30: goto L_0x0206;
                case 31: goto L_0x0323;
                case 32: goto L_0x032c;
                case 33: goto L_0x0335;
                case 34: goto L_0x033e;
                case 35: goto L_0x0347;
                case 36: goto L_0x0350;
                case 37: goto L_0x0359;
                case 38: goto L_0x0362;
                case 39: goto L_0x036b;
                case 40: goto L_0x0374;
                default: goto L_0x0130;
            }     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
        L_0x0130:
            switch(r13) {
                case 54: goto L_0x01c0;
                case 55: goto L_0x01ca;
                case 56: goto L_0x01d4;
                case 57: goto L_0x01de;
                case 58: goto L_0x01e8;
                case 59: goto L_0x01f2;
                default: goto L_0x0133;
            }     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
        L_0x0133:
            switch(r13) {
                case 61: goto L_0x01a2;
                case 62: goto L_0x01ac;
                case 63: goto L_0x01b6;
                default: goto L_0x0136;
            }     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
        L_0x0136:
            r0 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r14 = "   "
            switch(r13) {
                case 69: goto L_0x015d;
                case 70: goto L_0x0165;
                case 71: goto L_0x016d;
                case 72: goto L_0x0174;
                case 73: goto L_0x017e;
                case 74: goto L_0x0188;
                case 75: goto L_0x0190;
                case 76: goto L_0x0156;
                case 77: goto L_0x019a;
                default: goto L_0x013d;
            }     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
        L_0x013d:
            java.lang.StringBuilder r13 = X.AnonymousClass000.A10()     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            java.lang.String r0 = "Unknown attribute 0x"
        L_0x0143:
            X.BE9.A1J(r0, r13, r12)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r13.append(r14)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            int r0 = r15.get(r12)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            java.lang.String r0 = X.C17880vN.A0t(r13, r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            android.util.Log.w(r1, r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x038e
        L_0x0156:
            java.lang.StringBuilder r13 = X.AnonymousClass000.A10()     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            java.lang.String r0 = "unused attribute 0x"
            goto L_0x0143
        L_0x015d:
            float r0 = r10.getFloat(r12, r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r11.A07 = r0     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x038e
        L_0x0165:
            float r0 = r10.getFloat(r12, r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r11.A02 = r0     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x038e
        L_0x016d:
            java.lang.String r0 = "CURRENTLY UNSUPPORTED"
            android.util.Log.e(r1, r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x038e
        L_0x0174:
            int r0 = r11.A0Y     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            int r0 = r10.getInt(r12, r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r11.A0Y = r0     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x038e
        L_0x017e:
            int r0 = r11.A0Z     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            int r0 = r10.getDimensionPixelSize(r12, r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r11.A0Z = r0     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x038e
        L_0x0188:
            java.lang.String r0 = r10.getString(r12)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r11.A0t = r0     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x038e
        L_0x0190:
            boolean r0 = r11.A0x     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            boolean r0 = r10.getBoolean(r12, r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r11.A0x = r0     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x038e
        L_0x019a:
            java.lang.String r0 = r10.getString(r12)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r11.A0s = r0     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x038e
        L_0x01a2:
            int r0 = r11.A0C     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            int r0 = X.C26264Cw9.A00(r10, r12, r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r11.A0C = r0     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x038e
        L_0x01ac:
            int r0 = r11.A0D     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            int r0 = r10.getDimensionPixelSize(r12, r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r11.A0D = r0     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x038e
        L_0x01b6:
            float r0 = r11.A00     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            float r0 = r10.getFloat(r12, r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r11.A00 = r0     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x038e
        L_0x01c0:
            int r0 = r11.A0o     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            int r0 = r10.getInt(r12, r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r11.A0o = r0     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x038e
        L_0x01ca:
            int r0 = r11.A0R     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            int r0 = r10.getInt(r12, r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r11.A0R = r0     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x038e
        L_0x01d4:
            int r0 = r11.A0p     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            int r0 = r10.getDimensionPixelSize(r12, r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r11.A0p = r0     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x038e
        L_0x01de:
            int r0 = r11.A0S     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            int r0 = r10.getDimensionPixelSize(r12, r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r11.A0S = r0     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x038e
        L_0x01e8:
            int r0 = r11.A0q     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            int r0 = r10.getDimensionPixelSize(r12, r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r11.A0q = r0     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x038e
        L_0x01f2:
            int r0 = r11.A0T     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            int r0 = r10.getDimensionPixelSize(r12, r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r11.A0T = r0     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x038e
        L_0x01fc:
            int r0 = r11.A0G     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            int r0 = r10.getDimensionPixelSize(r12, r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r11.A0G = r0     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x038e
        L_0x0206:
            int r0 = r11.A0h     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            int r0 = r10.getDimensionPixelSize(r12, r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r11.A0h = r0     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x038e
        L_0x0210:
            int r0 = r11.A08     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            int r0 = X.C26264Cw9.A00(r10, r12, r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r11.A08 = r0     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x038e
        L_0x021a:
            int r0 = r11.A09     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            int r0 = r10.getDimensionPixelSize(r12, r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r11.A09 = r0     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x038e
        L_0x0224:
            int r0 = r11.A0A     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            int r0 = X.C26264Cw9.A00(r10, r12, r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r11.A0A = r0     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x038e
        L_0x022e:
            int r0 = r11.A0B     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            int r0 = X.C26264Cw9.A00(r10, r12, r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r11.A0B = r0     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x038e
        L_0x0238:
            java.lang.String r0 = r10.getString(r12)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r11.A0r = r0     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x038e
        L_0x0240:
            int r0 = r11.A0E     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            int r0 = r10.getDimensionPixelOffset(r12, r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r11.A0E = r0     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x038e
        L_0x024a:
            int r0 = r11.A0F     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            int r0 = r10.getDimensionPixelOffset(r12, r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r11.A0F = r0     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x038e
        L_0x0254:
            int r0 = r11.A0H     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            int r0 = X.C26264Cw9.A00(r10, r12, r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r11.A0H = r0     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x038e
        L_0x025e:
            int r0 = r11.A0I     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            int r0 = X.C26264Cw9.A00(r10, r12, r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r11.A0I = r0     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x038e
        L_0x0268:
            int r0 = r11.A0J     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            int r0 = r10.getDimensionPixelSize(r12, r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r11.A0J = r0     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x038e
        L_0x0272:
            int r0 = r11.A0K     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            int r0 = r10.getDimensionPixelSize(r12, r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r11.A0K = r0     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x038e
        L_0x027c:
            int r0 = r11.A0L     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            int r0 = r10.getDimensionPixelSize(r12, r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r11.A0L = r0     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x038e
        L_0x0286:
            int r0 = r11.A0M     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            int r0 = r10.getDimensionPixelSize(r12, r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r11.A0M = r0     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x038e
        L_0x0290:
            int r0 = r11.A0N     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            int r0 = r10.getDimensionPixelSize(r12, r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r11.A0N = r0     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x038e
        L_0x029a:
            int r0 = r11.A0O     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            int r0 = r10.getDimensionPixelSize(r12, r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r11.A0O = r0     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x038e
        L_0x02a4:
            int r0 = r11.A0P     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            int r0 = r10.getDimensionPixelOffset(r12, r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r11.A0P = r0     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x038e
        L_0x02ae:
            int r0 = r11.A0Q     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            int r0 = r10.getDimensionPixelOffset(r12, r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r11.A0Q = r0     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x038e
        L_0x02b8:
            float r0 = r11.A01     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            float r0 = r10.getFloat(r12, r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r11.A01 = r0     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x038e
        L_0x02c2:
            float r0 = r11.A03     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            float r0 = r10.getFloat(r12, r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r11.A03 = r0     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x038e
        L_0x02cc:
            int r0 = r11.A0a     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            int r0 = r10.getLayoutDimension(r12, r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r11.A0a = r0     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x038e
        L_0x02d6:
            int r0 = r11.A0c     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            int r0 = r10.getLayoutDimension(r12, r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r11.A0c = r0     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x038e
        L_0x02e0:
            int r0 = r11.A0V     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            int r0 = r10.getDimensionPixelSize(r12, r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r11.A0V = r0     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x038e
        L_0x02ea:
            int r0 = r11.A0W     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            int r0 = X.C26264Cw9.A00(r10, r12, r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r11.A0W = r0     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x038e
        L_0x02f4:
            int r0 = r11.A0X     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            int r0 = X.C26264Cw9.A00(r10, r12, r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r11.A0X = r0     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x038e
        L_0x02fe:
            int r0 = r11.A0d     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            int r0 = r10.getInt(r12, r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r11.A0d = r0     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x038e
        L_0x0308:
            int r0 = r11.A0e     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            int r0 = r10.getDimensionPixelSize(r12, r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r11.A0e = r0     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x038e
        L_0x0311:
            int r0 = r11.A0f     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            int r0 = X.C26264Cw9.A00(r10, r12, r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r11.A0f = r0     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x038e
        L_0x031a:
            int r0 = r11.A0g     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            int r0 = X.C26264Cw9.A00(r10, r12, r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r11.A0g = r0     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x038e
        L_0x0323:
            int r0 = r11.A0i     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            int r0 = X.C26264Cw9.A00(r10, r12, r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r11.A0i = r0     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x038e
        L_0x032c:
            int r0 = r11.A0j     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            int r0 = X.C26264Cw9.A00(r10, r12, r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r11.A0j = r0     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x038e
        L_0x0335:
            int r0 = r11.A0k     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            int r0 = r10.getDimensionPixelSize(r12, r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r11.A0k = r0     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x038e
        L_0x033e:
            int r0 = r11.A0l     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            int r0 = X.C26264Cw9.A00(r10, r12, r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r11.A0l = r0     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x038e
        L_0x0347:
            int r0 = r11.A0m     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            int r0 = X.C26264Cw9.A00(r10, r12, r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r11.A0m = r0     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x038e
        L_0x0350:
            float r0 = r11.A05     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            float r0 = r10.getFloat(r12, r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r11.A05 = r0     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x038e
        L_0x0359:
            float r0 = r11.A04     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            float r0 = r10.getFloat(r12, r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r11.A04 = r0     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x038e
        L_0x0362:
            float r0 = r11.A06     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            float r0 = r10.getFloat(r12, r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r11.A06 = r0     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x038e
        L_0x036b:
            int r0 = r11.A0U     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            int r0 = r10.getInt(r12, r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r11.A0U = r0     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x038e
        L_0x0374:
            int r0 = r11.A0n     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            int r0 = r10.getInt(r12, r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r11.A0n = r0     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x038e
        L_0x037d:
            boolean r0 = r11.A0u     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            boolean r0 = r10.getBoolean(r12, r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r11.A0u = r0     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x038e
        L_0x0386:
            boolean r0 = r11.A0v     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            boolean r0 = r10.getBoolean(r12, r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r11.A0v = r0     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
        L_0x038e:
            int r9 = r9 + 1
            goto L_0x0117
        L_0x0392:
            r10.recycle()     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x00f5
        L_0x0397:
            java.lang.String r0 = "Motion"
            boolean r0 = r9.equals(r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            if (r0 == 0) goto L_0x00f5
            if (r8 == 0) goto L_0x061e
            X.Cik r13 = r8.A03     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            android.util.AttributeSet r9 = android.util.Xml.asAttributeSet(r18)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            int[] r0 = X.C39121sW.A04     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            android.content.res.TypedArray r12 = r5.obtainStyledAttributes(r9, r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r13.A06 = r7     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            int r11 = r12.getIndexCount()     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r10 = 0
            r9 = 0
        L_0x03b5:
            if (r9 >= r11) goto L_0x040b
            int r14 = r12.getIndex(r9)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            android.util.SparseIntArray r0 = X.C25605Cik.A07     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            int r0 = r0.get(r14)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            switch(r0) {
                case 1: goto L_0x03c5;
                case 2: goto L_0x03ce;
                case 3: goto L_0x03d7;
                case 4: goto L_0x03f0;
                case 5: goto L_0x03f7;
                case 6: goto L_0x0400;
                default: goto L_0x03c4;
            }     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
        L_0x03c4:
            goto L_0x0408
        L_0x03c5:
            float r0 = r13.A01     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            float r0 = r12.getFloat(r14, r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r13.A01 = r0     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x0408
        L_0x03ce:
            int r0 = r13.A04     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            int r0 = r12.getInt(r14, r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r13.A04 = r0     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x0408
        L_0x03d7:
            android.util.TypedValue r0 = r12.peekValue(r14)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            int r15 = r0.type     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r0 = 3
            if (r15 != r0) goto L_0x03e7
            java.lang.String r0 = r12.getString(r14)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
        L_0x03e4:
            r13.A05 = r0     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x0408
        L_0x03e7:
            java.lang.String[] r15 = X.CEB.A00     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            int r0 = r12.getInteger(r14, r10)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r0 = r15[r0]     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x03e4
        L_0x03f0:
            int r0 = r12.getInt(r14, r10)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r13.A03 = r0     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x0408
        L_0x03f7:
            int r0 = r13.A02     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            int r0 = X.C26264Cw9.A00(r12, r14, r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r13.A02 = r0     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x0408
        L_0x0400:
            float r0 = r13.A00     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            float r0 = r12.getFloat(r14, r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r13.A00 = r0     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
        L_0x0408:
            int r9 = r9 + 1
            goto L_0x03b5
        L_0x040b:
            r12.recycle()     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x00f5
        L_0x0410:
            java.lang.String r0 = "PropertySet"
            boolean r0 = r9.equals(r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            if (r0 == 0) goto L_0x00f5
            if (r8 == 0) goto L_0x0623
            X.CS4 r12 = r8.A04     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            android.util.AttributeSet r9 = android.util.Xml.asAttributeSet(r18)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            int[] r0 = X.C39121sW.A05     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            android.content.res.TypedArray r11 = r5.obtainStyledAttributes(r9, r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r12.A04 = r7     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            int r10 = r11.getIndexCount()     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r9 = 0
        L_0x042d:
            if (r9 >= r10) goto L_0x046a
            int r13 = r11.getIndex(r9)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            if (r13 != r7) goto L_0x043e
            float r0 = r12.A00     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            float r0 = r11.getFloat(r13, r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r12.A00 = r0     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x0467
        L_0x043e:
            r0 = 0
            if (r13 != r0) goto L_0x0450
            int r0 = r12.A03     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            int r13 = r11.getInt(r13, r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r12.A03 = r13     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            int[] r0 = X.C26264Cw9.A03     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r0 = r0[r13]     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r12.A03 = r0     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x0467
        L_0x0450:
            r0 = 4
            if (r13 != r0) goto L_0x045c
            int r0 = r12.A02     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            int r0 = r11.getInt(r13, r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r12.A02 = r0     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x0467
        L_0x045c:
            r0 = 3
            if (r13 != r0) goto L_0x0467
            float r0 = r12.A01     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            float r0 = r11.getFloat(r13, r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r12.A01 = r0     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
        L_0x0467:
            int r9 = r9 + 1
            goto L_0x042d
        L_0x046a:
            r11.recycle()     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x00f5
        L_0x046f:
            java.lang.String r0 = "Transform"
            boolean r0 = r9.equals(r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            if (r0 == 0) goto L_0x00f5
            if (r8 == 0) goto L_0x0628
            X.Cj0 r12 = r8.A05     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            android.util.AttributeSet r9 = android.util.Xml.asAttributeSet(r18)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            int[] r0 = X.C39121sW.A07     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            android.content.res.TypedArray r11 = r5.obtainStyledAttributes(r9, r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r12.A0C = r7     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            int r10 = r11.getIndexCount()     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r9 = 0
        L_0x048c:
            if (r9 >= r10) goto L_0x0503
            int r13 = r11.getIndex(r9)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            android.util.SparseIntArray r0 = X.C25620Cj0.A0D     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            int r0 = r0.get(r13)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            switch(r0) {
                case 1: goto L_0x04e4;
                case 2: goto L_0x04db;
                case 3: goto L_0x04d2;
                case 4: goto L_0x04c9;
                case 5: goto L_0x04c0;
                case 6: goto L_0x04b7;
                case 7: goto L_0x04ae;
                case 8: goto L_0x04a5;
                case 9: goto L_0x049c;
                case 10: goto L_0x04f8;
                case 11: goto L_0x04ed;
                default: goto L_0x049b;
            }     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
        L_0x049b:
            goto L_0x0500
        L_0x049c:
            float r0 = r12.A09     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            float r0 = r11.getDimension(r13, r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r12.A09 = r0     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x0500
        L_0x04a5:
            float r0 = r12.A08     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            float r0 = r11.getDimension(r13, r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r12.A08 = r0     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x0500
        L_0x04ae:
            float r0 = r12.A07     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            float r0 = r11.getDimension(r13, r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r12.A07 = r0     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x0500
        L_0x04b7:
            float r0 = r12.A06     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            float r0 = r11.getDimension(r13, r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r12.A06 = r0     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x0500
        L_0x04c0:
            float r0 = r12.A05     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            float r0 = r11.getFloat(r13, r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r12.A05 = r0     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x0500
        L_0x04c9:
            float r0 = r12.A04     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            float r0 = r11.getFloat(r13, r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r12.A04 = r0     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x0500
        L_0x04d2:
            float r0 = r12.A03     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            float r0 = r11.getFloat(r13, r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r12.A03 = r0     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x0500
        L_0x04db:
            float r0 = r12.A02     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            float r0 = r11.getFloat(r13, r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r12.A02 = r0     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x0500
        L_0x04e4:
            float r0 = r12.A01     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            float r0 = r11.getFloat(r13, r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r12.A01 = r0     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x0500
        L_0x04ed:
            r12.A0B = r7     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            float r0 = r12.A00     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            float r0 = r11.getDimension(r13, r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r12.A00 = r0     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x0500
        L_0x04f8:
            float r0 = r12.A0A     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            float r0 = r11.getDimension(r13, r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r12.A0A = r0     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
        L_0x0500:
            int r9 = r9 + 1
            goto L_0x048c
        L_0x0503:
            r11.recycle()     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x00f5
        L_0x0508:
            java.lang.String r0 = "Guideline"
            boolean r0 = r9.equals(r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            if (r0 == 0) goto L_0x00f5
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r18)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            X.CZ8 r8 = X.C26264Cw9.A02(r5, r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            X.CpY r0 = r8.A02     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r0.A0y = r7     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r0.A0w = r7     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x00f5
        L_0x0520:
            java.lang.String r0 = "Barrier"
            boolean r0 = r9.equals(r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            if (r0 == 0) goto L_0x00f5
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r18)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            X.CZ8 r8 = X.C26264Cw9.A02(r5, r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            X.CpY r0 = r8.A02     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r0.A0b = r7     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x00f5
        L_0x0536:
            java.lang.String r0 = "CustomAttribute"
            boolean r0 = r9.equals(r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            if (r0 == 0) goto L_0x00f5
            if (r8 == 0) goto L_0x062d
            java.util.HashMap r0 = r8.A01     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r19 = r0
            android.util.AttributeSet r9 = android.util.Xml.asAttributeSet(r18)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            int[] r0 = X.C39121sW.A02     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            android.content.res.TypedArray r12 = r5.obtainStyledAttributes(r9, r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            int r16 = r12.getIndexCount()     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r11 = 0
            r14 = 0
            r13 = r3
            r10 = r3
            r9 = 0
        L_0x0557:
            r0 = r16
            if (r9 >= r0) goto L_0x05ef
            int r15 = r12.getIndex(r9)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            if (r15 != r14) goto L_0x0585
            java.lang.String r11 = r12.getString(r15)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            if (r11 == 0) goto L_0x05eb
            int r0 = r11.length()     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            if (r0 <= 0) goto L_0x05eb
            java.lang.StringBuilder r15 = X.AnonymousClass000.A10()     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            char r0 = r11.charAt(r14)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            char r0 = java.lang.Character.toUpperCase(r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r15.append(r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            java.lang.String r0 = r11.substring(r7)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            java.lang.String r11 = X.AnonymousClass000.A0y(r0, r15)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x05eb
        L_0x0585:
            if (r15 != r7) goto L_0x0592
            boolean r0 = r12.getBoolean(r15, r14)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            java.lang.Integer r10 = X.AnonymousClass00R.A0j     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x05eb
        L_0x0592:
            r0 = 3
            if (r15 != r0) goto L_0x0596
            goto L_0x05d6
        L_0x0596:
            r0 = 2
            if (r15 != r0) goto L_0x059c
            java.lang.Integer r10 = X.AnonymousClass00R.A0N     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x05d8
        L_0x059c:
            r0 = 7
            if (r15 != r0) goto L_0x05a0
            goto L_0x05b7
        L_0x05a0:
            r0 = 4
            if (r15 != r0) goto L_0x05ab
            java.lang.Integer r10 = X.AnonymousClass00R.A0u     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r0 = 0
            float r0 = r12.getDimension(r15, r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x05c6
        L_0x05ab:
            r0 = 5
            if (r15 != r0) goto L_0x05cb
            java.lang.Integer r10 = X.AnonymousClass00R.A01     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r0 = 2143289344(0x7fc00000, float:NaN)
            float r0 = r12.getFloat(r15, r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x05c6
        L_0x05b7:
            java.lang.Integer r10 = X.AnonymousClass00R.A0u     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r0 = 0
            float r13 = r12.getDimension(r15, r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            android.util.DisplayMetrics r0 = X.C108965cb.A08(r5)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            float r0 = android.util.TypedValue.applyDimension(r7, r13, r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
        L_0x05c6:
            java.lang.Float r13 = java.lang.Float.valueOf(r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x05eb
        L_0x05cb:
            r0 = 6
            if (r15 != r0) goto L_0x05e1
            java.lang.Integer r10 = X.AnonymousClass00R.A00     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r0 = -1
            int r0 = r12.getInteger(r15, r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x05dc
        L_0x05d6:
            java.lang.Integer r10 = X.AnonymousClass00R.A0C     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
        L_0x05d8:
            int r0 = r12.getColor(r15, r14)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
        L_0x05dc:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x05eb
        L_0x05e1:
            r0 = 8
            if (r15 != r0) goto L_0x05eb
            java.lang.Integer r10 = X.AnonymousClass00R.A0Y     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            java.lang.String r13 = r12.getString(r15)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
        L_0x05eb:
            int r9 = r9 + 1
            goto L_0x0557
        L_0x05ef:
            if (r11 == 0) goto L_0x0604
            if (r13 == 0) goto L_0x0604
            X.C66 r9 = new X.C66     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r9.<init>()     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r9.A04 = r11     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r9.A03 = r10     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r9.A00(r13)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            r0 = r19
            r0.put(r11, r9)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
        L_0x0604:
            r12.recycle()     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x00f5
        L_0x0609:
            boolean r0 = r9.equals(r10)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            if (r0 == 0) goto L_0x00f5
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r18)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            X.CZ8 r8 = X.C26264Cw9.A02(r5, r0)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x00f5
        L_0x0619:
            java.lang.RuntimeException r0 = A00(r18)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x0631
        L_0x061e:
            java.lang.RuntimeException r0 = A00(r18)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x0631
        L_0x0623:
            java.lang.RuntimeException r0 = A00(r18)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x0631
        L_0x0628:
            java.lang.RuntimeException r0 = A00(r18)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
            goto L_0x0631
        L_0x062d:
            java.lang.RuntimeException r0 = A00(r18)     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
        L_0x0631:
            throw r0     // Catch:{ XmlPullParserException -> 0x0632, IOException -> 0x0637, IOException | XmlPullParserException -> 0x078c }
        L_0x0632:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            goto L_0x063b
        L_0x0637:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ IOException | XmlPullParserException -> 0x078c }
        L_0x063b:
            android.util.SparseArray r1 = r4.A00     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            r0 = r17
            r1.put(r6, r0)     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            goto L_0x0050
        L_0x0644:
            java.lang.String r0 = "State"
            boolean r0 = r6.equals(r0)     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            if (r0 == 0) goto L_0x0041
            X.C5V r2 = new X.C5V     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            r2.<init>()     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            java.util.ArrayList r0 = X.AnonymousClass000.A13()     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            r2.A03 = r0     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            r0 = -1
            r2.A00 = r0     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r18)     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            int[] r0 = X.C39121sW.A06     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            android.content.res.TypedArray r9 = r5.obtainStyledAttributes(r1, r0)     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            int r8 = r9.getIndexCount()     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            r7 = 0
        L_0x0669:
            if (r7 >= r8) goto L_0x06ba
            int r1 = r9.getIndex(r7)     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            r0 = 0
            if (r1 != r0) goto L_0x067b
            int r0 = r2.A01     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            int r0 = r9.getResourceId(r1, r0)     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            r2.A01 = r0     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            goto L_0x06b7
        L_0x067b:
            r0 = 1
            if (r1 != r0) goto L_0x06b7
            int r0 = r2.A00     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            int r0 = r9.getResourceId(r1, r0)     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            r2.A00 = r0     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            android.content.res.Resources r1 = r5.getResources()     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            int r0 = r2.A00     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            java.lang.String r6 = r1.getResourceTypeName(r0)     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            android.content.res.Resources r1 = r5.getResources()     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            int r0 = r2.A00     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            r1.getResourceName(r0)     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            java.lang.String r0 = "layout"
            boolean r0 = r0.equals(r6)     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            if (r0 == 0) goto L_0x06b7
            X.Cw9 r6 = new X.Cw9     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            r6.<init>()     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            r2.A02 = r6     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            int r1 = r2.A00     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r5)     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            android.view.View r0 = r0.inflate(r1, r3)     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            r6.A0C(r0)     // Catch:{ IOException | XmlPullParserException -> 0x078c }
        L_0x06b7:
            int r7 = r7 + 1
            goto L_0x0669
        L_0x06ba:
            r9.recycle()     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            android.util.SparseArray r1 = r4.A01     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            int r0 = r2.A01     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            r1.put(r0, r2)     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            goto L_0x0050
        L_0x06c6:
            java.lang.String r0 = "StateSet"
            boolean r0 = r6.equals(r0)     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            if (r0 == 0) goto L_0x0041
            goto L_0x0050
        L_0x06d0:
            java.lang.String r0 = "layoutDescription"
            boolean r0 = r6.equals(r0)     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            if (r0 == 0) goto L_0x0041
            goto L_0x0050
        L_0x06da:
            java.lang.String r0 = "Variant"
            boolean r0 = r6.equals(r0)     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            if (r0 == 0) goto L_0x0041
            X.C5f r8 = new X.C5f     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            r8.<init>()     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            r0 = 2143289344(0x7fc00000, float:NaN)
            r8.A03 = r0     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            r8.A02 = r0     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            r8.A01 = r0     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            r8.A00 = r0     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            r0 = -1
            r8.A04 = r0     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r18)     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            int[] r0 = X.C39121sW.A08     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            android.content.res.TypedArray r9 = r5.obtainStyledAttributes(r1, r0)     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            int r7 = r9.getIndexCount()     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            r6 = 0
        L_0x0703:
            if (r6 >= r7) goto L_0x0780
            int r1 = r9.getIndex(r6)     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            r0 = 0
            if (r1 != r0) goto L_0x0746
            int r0 = r8.A04     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            int r0 = r9.getResourceId(r1, r0)     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            r8.A04 = r0     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            android.content.res.Resources r1 = r5.getResources()     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            int r0 = r8.A04     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            java.lang.String r10 = r1.getResourceTypeName(r0)     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            android.content.res.Resources r1 = r5.getResources()     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            int r0 = r8.A04     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            r1.getResourceName(r0)     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            java.lang.String r0 = "layout"
            boolean r0 = r0.equals(r10)     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            if (r0 == 0) goto L_0x077d
            X.Cw9 r10 = new X.Cw9     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            r10.<init>()     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            r8.A05 = r10     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            int r1 = r8.A04     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r5)     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            android.view.View r0 = r0.inflate(r1, r3)     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            r10.A0C(r0)     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            goto L_0x077d
        L_0x0746:
            r0 = 1
            if (r1 != r0) goto L_0x0752
            float r0 = r8.A00     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            float r0 = r9.getDimension(r1, r0)     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            r8.A00 = r0     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            goto L_0x077d
        L_0x0752:
            r0 = 2
            if (r1 != r0) goto L_0x075e
            float r0 = r8.A02     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            float r0 = r9.getDimension(r1, r0)     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            r8.A02 = r0     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            goto L_0x077d
        L_0x075e:
            r0 = 3
            if (r1 != r0) goto L_0x076a
            float r0 = r8.A01     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            float r0 = r9.getDimension(r1, r0)     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            r8.A01 = r0     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            goto L_0x077d
        L_0x076a:
            r0 = 4
            if (r1 != r0) goto L_0x0776
            float r0 = r8.A03     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            float r0 = r9.getDimension(r1, r0)     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            r8.A03 = r0     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            goto L_0x077d
        L_0x0776:
            java.lang.String r1 = "ConstraintLayoutStates"
            java.lang.String r0 = "Unknown tag"
            android.util.Log.v(r1, r0)     // Catch:{ IOException | XmlPullParserException -> 0x078c }
        L_0x077d:
            int r6 = r6 + 1
            goto L_0x0703
        L_0x0780:
            r9.recycle()     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            if (r2 == 0) goto L_0x0050
            java.util.ArrayList r0 = r2.A03     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            r0.add(r8)     // Catch:{ IOException | XmlPullParserException -> 0x078c }
            goto L_0x0050
        L_0x078c:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0790:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25569Ci8.<init>(android.content.Context, androidx.constraintlayout.widget.ConstraintLayout, int):void");
    }

    public static RuntimeException A00(XmlPullParser xmlPullParser) {
        StringBuilder sb = new StringBuilder();
        sb.append("XML parser error must be within a Constraint ");
        sb.append(xmlPullParser.getLineNumber());
        return new RuntimeException(sb.toString());
    }
}
