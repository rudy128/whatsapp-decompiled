package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.73s  reason: invalid class name and case insensitive filesystem */
public final class C1409573s {
    public static final C139426yp A06 = new Object();
    public int A00;
    public RectF A01;
    public RectF A02;
    public String A03;
    public List A04;
    public final C25291Nq A05;

    public C1409573s(RectF rectF, RectF rectF2, C25291Nq r4, List list, int i) {
        C18070vi.A0d(r4, 1);
        this.A05 = r4;
        this.A02 = rectF;
        this.A01 = rectF2;
        this.A00 = i;
        this.A04 = list;
    }

    public final void A07(Bitmap bitmap) {
        C18070vi.A0d(bitmap, 0);
        Canvas A0I = C108945cZ.A0I(bitmap);
        int i = this.A00;
        RectF rectF = this.A01;
        Matrix A002 = A00((float) bitmap.getWidth(), (float) bitmap.getHeight(), (float) i, rectF.width(), rectF.height(), false, false);
        A002.preTranslate(-rectF.left, -rectF.top);
        A0I.concat(A002);
        A02(A0I);
    }

    public final void A08(Bitmap bitmap, int i, boolean z, boolean z2) {
        Bitmap bitmap2 = bitmap;
        C18070vi.A0d(bitmap, 0);
        Canvas A0I = C108945cZ.A0I(bitmap);
        List list = this.A04;
        ArrayList A13 = AnonymousClass000.A13();
        for (Object next : list) {
            if (next instanceof AnonymousClass69W) {
                A13.add(next);
            }
        }
        Iterator it = A13.iterator();
        while (it.hasNext()) {
            C108945cZ.A0k(it).A0M(A0I);
        }
        A09(bitmap2, A0I, i, z, z2);
        A02(A0I);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0018, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x001c, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0C(java.io.File r5) {
        /*
            r4 = this;
            r1 = 0
            java.lang.String r0 = r4.A05()
            r3 = 0
            if (r0 != 0) goto L_0x0009
            return r1
        L_0x0009:
            java.io.FileWriter r2 = new java.io.FileWriter     // Catch:{ IOException -> 0x001d }
            r2.<init>(r5)     // Catch:{ IOException -> 0x001d }
            r2.write(r0)     // Catch:{ all -> 0x0016 }
            r2.close()     // Catch:{ IOException -> 0x001d }
            r3 = 1
            return r3
        L_0x0016:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0018 }
        L_0x0018:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ IOException -> 0x001d }
            throw r0     // Catch:{ IOException -> 0x001d }
        L_0x001d:
            r1 = move-exception
            java.lang.String r0 = "Doodle/save failed to save doodle string to file"
            com.whatsapp.util.Log.e(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1409573s.A0C(java.io.File):boolean");
    }

    private final C138456x7 A01() {
        List list = this.A04;
        ArrayList<AnonymousClass69V> A13 = AnonymousClass000.A13();
        for (Object next : list) {
            if (next instanceof AnonymousClass69V) {
                A13.add(next);
            }
        }
        for (AnonymousClass69V r0 : A13) {
            C138456x7 r02 = r0.A05;
            if (r02 != null) {
                return r02;
            }
        }
        return null;
    }

    private final void A02(Canvas canvas) {
        List list = this.A04;
        ArrayList A13 = AnonymousClass000.A13();
        for (Object next : list) {
            AnonymousClass3MZ.A1V(next, A13, next instanceof AnonymousClass69W ? 1 : 0);
        }
        Iterator it = A13.iterator();
        while (it.hasNext()) {
            C1409773u A0k = C108945cZ.A0k(it);
            if (A0k instanceof AnonymousClass69V) {
                AnonymousClass69V r1 = (AnonymousClass69V) A0k;
                if (r1.A04 instanceof C1196869l) {
                    r1.A03 = A04();
                }
            }
            A0k.A0M(canvas);
        }
    }

    public static final boolean A03(C1409573s r2, String... strArr) {
        List list = r2.A04;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (C200410p.A0U(C108945cZ.A0k(it).A0D(), strArr)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final AnonymousClass69K A04() {
        List list = this.A04;
        ArrayList A13 = AnonymousClass000.A13();
        for (Object next : list) {
            if (next instanceof AnonymousClass69K) {
                A13.add(next);
            }
        }
        return (AnonymousClass69K) C29431cG.A0c(A13);
    }

    public final String A05() {
        JSONObject jSONObject;
        try {
            JSONArray jSONArray = new JSONArray();
            Iterator it = this.A04.iterator();
            while (it.hasNext()) {
                C1409773u A0k = C108945cZ.A0k(it);
                JSONObject A15 = C17880vN.A15();
                A0k.A0Q(A15);
                jSONArray.put(A15);
            }
            JSONObject A152 = C17880vN.A15();
            boolean z = true;
            A152.put("version", 1);
            RectF rectF = this.A02;
            A152.put("l", (int) (rectF.left * 100.0f));
            A152.put("t", (int) (rectF.top * 100.0f));
            A152.put("r", (int) (rectF.right * 100.0f));
            A152.put("b", (int) (rectF.bottom * 100.0f));
            RectF rectF2 = this.A01;
            A152.put("crop-l", (int) (rectF2.left * 100.0f));
            A152.put("crop-t", (int) (rectF2.top * 100.0f));
            A152.put("crop-r", (int) (rectF2.right * 100.0f));
            A152.put("crop-b", (int) (rectF2.bottom * 100.0f));
            A152.put("rotate", this.A00);
            C138456x7 A012 = A01();
            if (A012 != null) {
                if (A012.A03 == null) {
                    jSONObject = null;
                } else {
                    jSONObject = C17880vN.A15();
                    jSONObject.put("origin-width", A012.A01);
                    jSONObject.put("origin-height", A012.A00);
                    jSONObject.put("small-bitmap", AnonymousClass204.A0E(A012.A03));
                }
                A152.put("blurred-bitmap-provider", jSONObject);
            }
            A152.put("shapes", jSONArray);
            String A0H = C18070vi.A0H(A152);
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Doodle/toJson/shapes = ");
            A10.append(this.A04.size());
            A10.append(" | isBlurried = ");
            if (A01() == null) {
                z = false;
            }
            C17900vP.A0r(A10, z);
            return A0H;
        } catch (JSONException e) {
            Log.e("Doodle/toJson error while constructing JSON", e);
            return null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: com.whatsapp.SerializablePoint[]} */
    /* JADX WARNING: type inference failed for: r15v1, types: [com.whatsapp.SerializablePoint, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r15v2, types: [com.whatsapp.SerializablePoint, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r11v1, types: [com.whatsapp.SerializablePoint, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v6, types: [com.whatsapp.SerializablePoint, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v7, types: [com.whatsapp.InteractiveAnnotation, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v9, types: [com.whatsapp.InteractiveAnnotation, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v2, types: [com.whatsapp.SerializableLocation, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList A06(float r24, float r25) {
        /*
            r23 = this;
            r4 = r23
            java.util.List r0 = r4.A04
            java.util.ArrayList r2 = X.AnonymousClass000.A13()
            java.util.Iterator r3 = r0.iterator()
        L_0x000c:
            boolean r0 = r3.hasNext()
            r22 = 0
            if (r0 == 0) goto L_0x0022
            java.lang.Object r1 = r3.next()
            boolean r0 = r1 instanceof X.AnonymousClass87T
            if (r0 == 0) goto L_0x000c
            if (r1 == 0) goto L_0x000c
            r2.add(r1)
            goto L_0x000c
        L_0x0022:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0172
            int r0 = r4.A00
            float r0 = (float) r0
            android.graphics.RectF r9 = r4.A01
            float r17 = r9.width()
            float r18 = r9.height()
            r19 = 0
            r14 = r24
            r13 = r25
            r15 = r13
            r16 = r0
            r20 = r19
            android.graphics.Matrix r12 = A00(r14, r15, r16, r17, r18, r19, r20)
            java.util.ArrayList r10 = X.AnonymousClass000.A13()
            java.util.Iterator r21 = r2.iterator()
        L_0x004c:
            boolean r0 = r21.hasNext()
            if (r0 == 0) goto L_0x016b
            java.lang.Object r6 = r21.next()
            X.87T r6 = (X.AnonymousClass87T) r6
            android.graphics.PointF r1 = new android.graphics.PointF
            r1.<init>(r14, r13)
            r4 = r6
            X.73u r4 = (X.C1409773u) r4
            r20 = 0
            r19 = 1
            r18 = 2
            android.graphics.RectF r5 = r4.A06
            r5.sort()
            android.graphics.Matrix r3 = X.C108945cZ.A0J()
            r3.preConcat(r12)
            float r0 = r9.left
            float r2 = -r0
            float r0 = r9.top
            float r0 = -r0
            r3.preTranslate(r2, r0)
            float r4 = r4.A02
            float r2 = r5.centerX()
            float r0 = r5.centerY()
            r3.preRotate(r4, r2, r0)
            r0 = 8
            float[] r7 = new float[r0]
            float r4 = r5.left
            r7[r20] = r4
            float r2 = r5.top
            r7[r19] = r2
            float r0 = r5.right
            r7[r18] = r0
            r17 = 3
            r7[r17] = r2
            r11 = 4
            r7[r11] = r0
            float r2 = r5.bottom
            r16 = 5
            r7[r16] = r2
            r0 = 6
            r7[r0] = r4
            r0 = 7
            r7[r0] = r2
            r3.mapPoints(r7)
            com.whatsapp.SerializablePoint[] r5 = new com.whatsapp.SerializablePoint[r11]
            r0 = r7[r20]
            float r8 = r1.x
            float r0 = r0 / r8
            double r2 = (double) r0
            r0 = r7[r19]
            float r4 = r1.y
            float r0 = r0 / r4
            double r0 = (double) r0
            com.whatsapp.SerializablePoint r15 = new com.whatsapp.SerializablePoint
            r15.<init>()
            r15.x = r2
            r15.y = r0
            r5[r20] = r15
            r0 = r7[r18]
            float r0 = r0 / r8
            double r2 = (double) r0
            r0 = r7[r17]
            float r0 = r0 / r4
            double r0 = (double) r0
            com.whatsapp.SerializablePoint r15 = new com.whatsapp.SerializablePoint
            r15.<init>()
            r15.x = r2
            r15.y = r0
            r5[r19] = r15
            r0 = r7[r11]
            float r0 = r0 / r8
            double r2 = (double) r0
            r0 = r7[r16]
            float r0 = r0 / r4
            double r0 = (double) r0
            com.whatsapp.SerializablePoint r11 = new com.whatsapp.SerializablePoint
            r11.<init>()
            r11.x = r2
            r11.y = r0
            r5[r18] = r11
            r0 = 6
            r0 = r7[r0]
            float r0 = r0 / r8
            double r0 = (double) r0
            r2 = 7
            r2 = r7[r2]
            float r2 = r2 / r4
            double r2 = (double) r2
            com.whatsapp.SerializablePoint r4 = new com.whatsapp.SerializablePoint
            r4.<init>()
            r4.x = r0
            r4.y = r2
            r5[r17] = r4
            boolean r0 = r6 instanceof X.AnonymousClass69Y
            if (r0 == 0) goto L_0x0131
            boolean r11 = r6.CNP()
            X.69Y r6 = (X.AnonymousClass69Y) r6
            double r2 = r6.A00
            double r0 = r6.A01
            java.lang.String r8 = r6.A05
            r6 = -1
            com.whatsapp.InteractiveAnnotation r4 = new com.whatsapp.InteractiveAnnotation
            r4.<init>()
            r4.interactiveAnnotationId = r6
            r4.polygonVertices = r5
            r4.skipConfirmation = r11
            com.whatsapp.SerializableLocation r5 = new com.whatsapp.SerializableLocation
            r5.<init>()
            r5.latitude = r2
            r5.longitude = r0
            r5.name = r8
            r4.data = r5
        L_0x012c:
            r10.add(r4)
            goto L_0x004c
        L_0x0131:
            boolean r0 = r6 instanceof X.AnonymousClass69e
            if (r0 == 0) goto L_0x004c
            X.25J r2 = X.C29681ch.A03
            r1 = r6
            X.69e r1 = (X.AnonymousClass69e) r1
            java.lang.String r0 = r1.A03
            X.1ch r16 = r2.A01(r0)
            if (r16 == 0) goto L_0x004c
            boolean r8 = r6.CNP()
            int r7 = r1.A00
            java.lang.String r6 = r1.A04
            X.9Id r3 = r1.A01
            java.lang.String r2 = r1.A02
            r0 = -1
            com.whatsapp.InteractiveAnnotation r4 = new com.whatsapp.InteractiveAnnotation
            r4.<init>()
            r4.interactiveAnnotationId = r0
            r4.polygonVertices = r5
            r4.skipConfirmation = r8
            X.Ac1 r15 = new X.Ac1
            r18 = r6
            r19 = r2
            r20 = r7
            r17 = r3
            r15.<init>(r16, r17, r18, r19, r20)
            r4.data = r15
            goto L_0x012c
        L_0x016b:
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L_0x0172
            return r10
        L_0x0172:
            return r22
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1409573s.A06(float, float):java.util.ArrayList");
    }

    public final boolean A0B() {
        List list = this.A04;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C1409773u A0k = C108945cZ.A0k(it);
                if (!(A0k instanceof AnonymousClass69e) && !(A0k instanceof AnonymousClass69K) && !(A0k instanceof AnonymousClass69W)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final Matrix A00(float f, float f2, float f3, float f4, float f5, boolean z, boolean z2) {
        float f6;
        float f7;
        float f8;
        Matrix A0J = C108945cZ.A0J();
        float f9 = f3 % 180.0f;
        if (f9 == 90.0f) {
            f6 = f2 / f4;
            f7 = f / f5;
        } else {
            float f10 = f2 / f5;
            f6 = f / f4;
            f7 = f10;
        }
        A0J.preScale(f6, f7);
        float f11 = 0.0f;
        if (z) {
            Matrix A0J2 = C108945cZ.A0J();
            A0J2.setValues(new float[]{-1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
            A0J.preConcat(A0J2);
            float f12 = f4;
            if (f9 == 90.0f) {
                f12 = f5;
            }
            A0J.preTranslate(-f12, 0.0f);
        }
        if (z2) {
            Matrix A0J3 = C108945cZ.A0J();
            A0J3.setValues(new float[]{1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
            A0J.preConcat(A0J3);
            float f13 = f5;
            if (f9 == 90.0f) {
                f13 = f4;
            }
            A0J.preTranslate(-f13, 0.0f);
        }
        A0J.preRotate(f3);
        if (f3 == 90.0f) {
            A0J.preTranslate(0.0f, -f5);
        } else {
            if (f3 == 180.0f) {
                f8 = -f4;
                f11 = -f5;
            } else {
                f8 = -f4;
                if (f3 != 270.0f) {
                    if (f3 != 0.0f) {
                        throw AnonymousClass000.A0k("Failed requirement.");
                    }
                }
            }
            A0J.preTranslate(f8, f11);
            return A0J;
        }
        return A0J;
    }

    public final void A09(Bitmap bitmap, Canvas canvas, int i, boolean z, boolean z2) {
        RectF rectF = this.A02;
        canvas.concat(A00((float) bitmap.getWidth(), (float) bitmap.getHeight(), (float) i, rectF.width(), rectF.height(), z, z2));
    }

    public final void A0A(AnonymousClass64U r10) {
        String[] A1Y = C17880vN.A1Y();
        A1Y[0] = "pen";
        long j = 0;
        if (A03(this, A1Y)) {
            r10.A0M = C17880vN.A0o(C17900vP.A01(r10.A0M), 1);
        }
        if (A03(this, "arrow", "oval", "thinking-bubble", "speech-bubble-oval", "speech-bubble-rect", "digital-clock", "analog-clock", "location", "sticker", "emoji", "add-yours")) {
            r10.A0Q = C17880vN.A0o(C17900vP.A01(r10.A0Q), 1);
        }
        List list = this.A04;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C1409773u A0k = C108945cZ.A0k(it);
                if ((A0k instanceof AnonymousClass69N) && ((AnonymousClass69N) A0k).A01) {
                    r10.A0I = C17880vN.A0o(C17900vP.A01(r10.A0I), 1);
                    break;
                }
            }
        }
        String[] A1Y2 = C17880vN.A1Y();
        A1Y2[0] = "text";
        if (A03(this, A1Y2)) {
            r10.A0S = C17880vN.A0o(C17900vP.A01(r10.A0S), 1);
        }
        String[] A1Y3 = C17880vN.A1Y();
        A1Y3[0] = "main-image-file";
        if (A03(this, A1Y3)) {
            AnonymousClass69K A042 = A04();
            if (A042 != null && A042.A0c()) {
                r10.A0a = C17880vN.A0o(C17900vP.A01(r10.A0a), 1);
            }
            AnonymousClass69K A043 = A04();
            if (A043 != null && A043.A0b()) {
                Long l = r10.A0B;
                if (l != null) {
                    j = l.longValue();
                }
                r10.A0B = C17880vN.A0o(j, 1);
            }
        }
        r10.A05 = Boolean.valueOf(A03(this, C17880vN.A1a("location", 0)));
    }
}
