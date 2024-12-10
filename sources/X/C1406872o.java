package X;

import android.graphics.PointF;
import com.whatsapp.InteractiveAnnotation;
import com.whatsapp.SerializablePoint;

/* renamed from: X.72o  reason: invalid class name and case insensitive filesystem */
public final class C1406872o {
    public static final C1406872o A00 = new Object();

    /* JADX WARNING: type inference failed for: r4v0, types: [com.whatsapp.SerializablePoint, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r13v0, types: [com.whatsapp.SerializablePoint, java.lang.Object] */
    public static final InteractiveAnnotation A00(C18030ve r23, AnonymousClass21V r24, float[] fArr, float[] fArr2, boolean z) {
        InteractiveAnnotation[] interactiveAnnotationArr;
        C18070vi.A0d(r23, 0);
        C62572rc r0 = r24.A02;
        if (!(r0 == null || (interactiveAnnotationArr = r0.A0b) == null)) {
            if (interactiveAnnotationArr.length != 0) {
                PointF pointF = new PointF(fArr2[0], fArr2[1]);
                double d = (double) ((int) fArr[0]);
                double d2 = (double) ((int) fArr[1]);
                ? obj = new Object();
                obj.x = d;
                obj.y = d2;
                double d3 = d / ((double) pointF.x);
                ? obj2 = new Object();
                obj2.x = d3;
                obj2.y = d2 / ((double) pointF.y);
                for (InteractiveAnnotation interactiveAnnotation : interactiveAnnotationArr) {
                    if (interactiveAnnotation.type != C49482Qq.FUTURE_PROOF) {
                        SerializablePoint[] serializablePointArr = interactiveAnnotation.polygonVertices;
                        SerializablePoint[] serializablePointArr2 = serializablePointArr;
                        C18070vi.A0W(serializablePointArr2);
                        int length = serializablePointArr.length;
                        boolean z2 = false;
                        for (int i = 0; i < length; i++) {
                            SerializablePoint serializablePoint = serializablePointArr2[i];
                            SerializablePoint serializablePoint2 = serializablePointArr2[(i + 1) % length];
                            double d4 = serializablePoint.x;
                            double d5 = obj2.x;
                            if ((d4 <= d5 && d5 < serializablePoint2.x) || (serializablePoint2.x <= d5 && d5 < serializablePoint.x)) {
                                double d6 = serializablePoint2.y;
                                double d7 = serializablePoint.y;
                                double d8 = serializablePoint.x;
                                if (obj2.y < (((d6 - d7) * (d5 - d8)) / (serializablePoint2.x - d8)) + d7) {
                                    z2 = !z2;
                                }
                            }
                        }
                        if (z2 && ((!A01(interactiveAnnotation) || C18020vd.A05(C18040vf.A02, r23, 11819)) && (!(interactiveAnnotation.data instanceof C20947Ac1) || !z || interactiveAnnotation.skipConfirmation))) {
                            return interactiveAnnotation;
                        }
                    }
                }
            }
        }
        return null;
    }

    public static final boolean A01(InteractiveAnnotation interactiveAnnotation) {
        C18070vi.A0d(interactiveAnnotation, 0);
        if (!(interactiveAnnotation.data instanceof C180379Mh) || interactiveAnnotation.type != C49482Qq.LINKCLICK) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0052, code lost:
        if (r11 > (r1 * 0.8333333f)) goto L_0x0054;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.whatsapp.InteractiveAnnotation A02(android.widget.ImageView r8, X.C18030ve r9, X.AnonymousClass21V r10, float r11, float r12) {
        /*
            r7 = this;
            r6 = 0
            r4 = 1
            int r3 = X.C72453Mb.A0G(r8, r10, r4)
            android.graphics.drawable.Drawable r5 = r8.getDrawable()
            if (r5 != 0) goto L_0x000e
            r0 = 0
            return r0
        L_0x000e:
            android.graphics.Matrix r1 = X.C108945cZ.A0J()
            android.graphics.Matrix r0 = r8.getImageMatrix()
            r0.invert(r1)
            float[] r2 = new float[r3]
            int r0 = r8.getLeft()
            float r0 = (float) r0
            float r0 = r11 - r0
            r2[r6] = r0
            int r0 = r8.getTop()
            float r0 = (float) r0
            float r12 = r12 - r0
            r2[r4] = r12
            float[] r3 = new float[r3]
            int r0 = r5.getIntrinsicWidth()
            float r0 = (float) r0
            r3[r6] = r0
            int r0 = r5.getIntrinsicHeight()
            float r0 = (float) r0
            r3[r4] = r0
            r1.mapPoints(r2)
            float r1 = X.C108945cZ.A03(r8)
            r0 = 1042983595(0x3e2aaaab, float:0.16666667)
            float r0 = r0 * r1
            int r0 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0054
            r0 = 1062557013(0x3f555555, float:0.8333333)
            float r1 = r1 * r0
            int r1 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            r0 = 0
            if (r1 <= 0) goto L_0x0055
        L_0x0054:
            r0 = 1
        L_0x0055:
            com.whatsapp.InteractiveAnnotation r0 = A00(r9, r10, r2, r3, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1406872o.A02(android.widget.ImageView, X.0ve, X.21V, float, float):com.whatsapp.InteractiveAnnotation");
    }
}
