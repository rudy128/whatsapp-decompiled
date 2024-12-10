package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import org.json.JSONObject;

/* renamed from: X.73u  reason: invalid class name and case insensitive filesystem */
public abstract class C1409773u {
    public static float A07 = 12.0f;
    public static float A08 = 24.0f;
    public static float A09 = 32.0f;
    public static float A0A = 96.0f;
    public float A00;
    public float A01;
    public float A02;
    public float A03 = 1.0f;
    public String A04;
    public final Paint A05;
    public final RectF A06 = AnonymousClass3MW.A08();

    public static RectF A06(C1409773u r1, Object obj) {
        C18070vi.A0d(obj, 0);
        RectF rectF = r1.A06;
        rectF.sort();
        return rectF;
    }

    public static void A07(Canvas canvas, RectF rectF, float f, float f2, float f3) {
        canvas.scale(f3, f / f2, rectF.left, rectF.top);
        canvas.translate(rectF.left, rectF.top);
    }

    public static void A08(Canvas canvas, C1409773u r2) {
        C18070vi.A0d(canvas, 0);
        r2.A0M(canvas);
    }

    public void A0Q(JSONObject jSONObject) {
        C18070vi.A0d(jSONObject, 0);
        jSONObject.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, A0D());
        RectF rectF = this.A06;
        jSONObject.put("l", (int) (rectF.left * 100.0f));
        jSONObject.put("t", (int) (rectF.top * 100.0f));
        jSONObject.put("r", (int) (rectF.right * 100.0f));
        jSONObject.put("b", (int) (rectF.bottom * 100.0f));
        float f = this.A02;
        if (f != 0.0f) {
            jSONObject.put("rotate", (int) (f * 100.0f));
        }
        jSONObject.put("dx", (int) (this.A00 * 100.0f));
        jSONObject.put("dy", (int) (this.A01 * 100.0f));
        jSONObject.put("scale", (int) (this.A03 * 100.0f));
        jSONObject.put("color", this.A05.getColor());
        jSONObject.put("stroke", (int) (A0B() * 100.0f));
        String str = this.A04;
        if (str != null) {
            jSONObject.put("tag", str);
        }
    }

    public final void A0R(JSONObject jSONObject) {
        float A002 = C109005cf.A00(this.A06, jSONObject);
        this.A02 = ((float) jSONObject.optInt("rotate", 0)) / A002;
        this.A00 = ((float) jSONObject.optInt("dx", 0)) / A002;
        this.A01 = ((float) jSONObject.optInt("dy", 0)) / A002;
        this.A03 = ((float) jSONObject.optInt("scale", 100)) / A002;
        A0K(jSONObject.getInt("color"));
        A0J(((float) jSONObject.getInt("stroke")) / A002);
        this.A04 = A6n.A02("tag", jSONObject);
    }

    public static void A09(RectF rectF, float f, float f2, float f3, float f4) {
        rectF.set(f - ((f - rectF.left) * f2), f3 - ((f3 - rectF.top) * f4), f - (f2 * (f - rectF.right)), f3 - (f4 * (f3 - rectF.bottom)));
    }

    public static void A0A(C1409773u r6, float f) {
        RectF rectF = r6.A06;
        float centerX = rectF.centerX();
        float centerY = rectF.centerY();
        rectF.set(centerX - ((centerX - rectF.left) * f), centerY - ((centerY - rectF.top) * f), centerX - ((centerX - rectF.right) * f), centerY - (f * (centerY - rectF.bottom)));
        r6.A0F();
    }

    public float A0B() {
        float strokeWidth;
        float f;
        if (this instanceof AnonymousClass69b) {
            strokeWidth = this.A05.getStrokeWidth() * 5.0f;
            f = 3.0f;
        } else if (!(this instanceof AnonymousClass69d) && !(this instanceof AnonymousClass69U)) {
            return this.A05.getStrokeWidth();
        } else {
            strokeWidth = this.A05.getStrokeWidth() * 3.0f;
            f = 2.0f;
        }
        return strokeWidth / f;
    }

    public C129116hH A0C() {
        if (this instanceof AnonymousClass69c) {
            AnonymousClass69c r1 = (AnonymousClass69c) this;
            RectF rectF = r1.A06;
            float f = r1.A02;
            int color = r1.A05.getColor();
            return new AnonymousClass69P(rectF, r1.A0C, f, r1.A0B(), r1.A07, r1.A06, color, r1.A09, r1.A0A, r1.A0G.A02);
        }
        return new C129116hH(this.A06, this.A02, A0B(), this.A05.getColor());
    }

    public String A0D() {
        if (this instanceof AnonymousClass69b) {
            return "thinking-bubble";
        }
        if (this instanceof AnonymousClass69c) {
            return "text";
        }
        if (this instanceof AnonymousClass69d) {
            return "speech-bubble-rect";
        }
        if (this instanceof AnonymousClass69U) {
            return "speech-bubble-oval";
        }
        if (this instanceof AnonymousClass69T) {
            return "rect";
        }
        if (this instanceof AnonymousClass69V) {
            return "pen";
        }
        if (this instanceof AnonymousClass69S) {
            return "oval";
        }
        if (this instanceof AnonymousClass69e) {
            return "newsletter";
        }
        if (this instanceof AnonymousClass69W) {
            return "image-file";
        }
        if (this instanceof AnonymousClass69R) {
            return "circular-mask";
        }
        if (this instanceof AnonymousClass69Q) {
            return "arrow";
        }
        if (this instanceof AnonymousClass69N) {
            return "sticker";
        }
        if (this instanceof AnonymousClass69K) {
            return "main-image-file";
        }
        if (this instanceof AnonymousClass69M) {
            return "emoji";
        }
        return ((AnonymousClass69L) this).A0N;
    }

    public String A0E(Context context) {
        String valueOf;
        if (this instanceof AnonymousClass69b) {
            C18070vi.A0d(context, 0);
            return C18070vi.A0F(context, 2131889559);
        } else if (this instanceof AnonymousClass69c) {
            return ((AnonymousClass69c) this).A0C;
        } else {
            if (this instanceof AnonymousClass69d) {
                C18070vi.A0d(context, 0);
                return C18070vi.A0F(context, 2131889558);
            } else if (this instanceof AnonymousClass69U) {
                C18070vi.A0d(context, 0);
                return C18070vi.A0F(context, 2131889556);
            } else if (this instanceof AnonymousClass69T) {
                C18070vi.A0d(context, 0);
                return C18070vi.A0F(context, 2131889557);
            } else if (this instanceof AnonymousClass69V) {
                return "";
            } else {
                if (this instanceof AnonymousClass69S) {
                    C18070vi.A0d(context, 0);
                    return C18070vi.A0F(context, 2131889555);
                } else if ((this instanceof AnonymousClass69e) || (this instanceof AnonymousClass69W) || (this instanceof AnonymousClass69R)) {
                    return "";
                } else {
                    if (this instanceof AnonymousClass69Q) {
                        C18070vi.A0d(context, 0);
                        return C18070vi.A0F(context, 2131889552);
                    } else if (this instanceof AnonymousClass69N) {
                        return ((AnonymousClass69N) this).A08;
                    } else {
                        if (this instanceof AnonymousClass69K) {
                            return "";
                        }
                        if (this instanceof AnonymousClass69M) {
                            C18070vi.A0d(context, 0);
                            AnonymousClass737 r0 = ((AnonymousClass69M) this).A01;
                            if (r0 == null) {
                                valueOf = context.getString(2131898949);
                            } else {
                                valueOf = String.valueOf(r0);
                            }
                            C18070vi.A0b(valueOf);
                            return valueOf;
                        }
                        C18070vi.A0d(context, 0);
                        return C18070vi.A0F(context, 2131889553);
                    }
                }
            }
        }
    }

    public void A0F() {
        if (this instanceof AnonymousClass69c) {
            RectF rectF = this.A06;
            if (rectF.width() < 12.0f) {
                rectF.set(rectF.centerX() - 6.0f, rectF.top, rectF.centerX() + 6.0f, rectF.bottom);
            }
            if (rectF.height() < 12.0f) {
                rectF.set(rectF.left, rectF.centerY() - 6.0f, rectF.right, rectF.centerY() + 6.0f);
            }
        } else if (this instanceof AnonymousClass69L) {
            AnonymousClass69L r1 = (AnonymousClass69L) this;
            float f = (A07 * r1.A00) / 116.0f;
            RectF rectF2 = r1.A06;
            if (rectF2.height() < A07 || rectF2.width() < f) {
                float f2 = f / 2.0f;
                rectF2.set(rectF2.centerX() - f2, rectF2.centerY() - (A07 / 2.0f), rectF2.centerX() + f2, rectF2.centerY() + (A07 / 2.0f));
            }
        } else {
            RectF rectF3 = this.A06;
            if (rectF3.width() < A07) {
                rectF3.set(rectF3.centerX() - (A07 / 2.0f), rectF3.top, rectF3.centerX() + (A07 / 2.0f), rectF3.bottom);
            }
            if (rectF3.height() < A07) {
                rectF3.set(rectF3.left, rectF3.centerY() - (A07 / 2.0f), rectF3.right, rectF3.centerY() + (A07 / 2.0f));
            }
        }
    }

    public void A0G() {
        if (this instanceof AnonymousClass69L) {
            ((AnonymousClass69L) this).A0M.A00 = false;
        }
    }

    public void A0H(float f) {
        if (this instanceof AnonymousClass69L) {
            A0A(this, f);
            return;
        }
        this.A03 *= f;
        A0A(this, f);
    }

    public void A0I(float f) {
        if (this instanceof AnonymousClass69K) {
            AnonymousClass69K r1 = (AnonymousClass69K) this;
            r1.A0L(2, f);
            r1.A00 = f;
        } else if (this instanceof AnonymousClass69L) {
            AnonymousClass69L r12 = (AnonymousClass69L) this;
            r12.A0L(2, f);
            r12.A0M.A00(f);
        } else {
            A0L(2, f);
        }
    }

    public void A0J(float f) {
        this.A05.setStrokeWidth(f);
    }

    public void A0K(int i) {
        this.A05.setColor(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0037, code lost:
        if (r7 == 2) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x005b, code lost:
        if (r7 == 2) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        if (r7 == 2) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0L(int r7, float r8) {
        /*
            r6 = this;
            boolean r0 = r6 instanceof X.AnonymousClass69d
            if (r0 == 0) goto L_0x0024
            android.graphics.RectF r5 = r6.A06
            float r4 = r5.centerX()
            float r3 = r5.centerY()
            r2 = 2
            if (r7 == 0) goto L_0x0015
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r7 != r2) goto L_0x0016
        L_0x0015:
            r1 = r8
        L_0x0016:
            r0 = 1
            if (r7 == r0) goto L_0x001d
            if (r7 == r2) goto L_0x001d
            r8 = 1065353216(0x3f800000, float:1.0)
        L_0x001d:
            A09(r5, r4, r1, r3, r8)
            r6.A0F()
            return
        L_0x0024:
            boolean r0 = r6 instanceof X.AnonymousClass69T
            if (r0 == 0) goto L_0x0048
            android.graphics.RectF r5 = r6.A06
            float r4 = r5.centerX()
            float r3 = r5.centerY()
            r2 = 2
            if (r7 == 0) goto L_0x0039
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r7 != r2) goto L_0x003a
        L_0x0039:
            r1 = r8
        L_0x003a:
            r0 = 1
            if (r7 == r0) goto L_0x0041
            if (r7 == r2) goto L_0x0041
            r8 = 1065353216(0x3f800000, float:1.0)
        L_0x0041:
            A09(r5, r4, r1, r3, r8)
            r6.A0F()
            return
        L_0x0048:
            boolean r0 = r6 instanceof X.AnonymousClass69S
            if (r0 == 0) goto L_0x006c
            android.graphics.RectF r5 = r6.A06
            float r4 = r5.centerX()
            float r3 = r5.centerY()
            r2 = 2
            if (r7 == 0) goto L_0x005d
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r7 != r2) goto L_0x005e
        L_0x005d:
            r1 = r8
        L_0x005e:
            r0 = 1
            if (r7 == r0) goto L_0x0065
            if (r7 == r2) goto L_0x0065
            r8 = 1065353216(0x3f800000, float:1.0)
        L_0x0065:
            A09(r5, r4, r1, r3, r8)
            r6.A0F()
            return
        L_0x006c:
            r6.A0H(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1409773u.A0L(int, float):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:152:0x0495  */
    /* JADX WARNING: Removed duplicated region for block: B:178:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0146 A[LOOP:0: B:43:0x0140->B:45:0x0146, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0160  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0M(android.graphics.Canvas r21) {
        /*
            r20 = this;
            r3 = r20
            boolean r0 = r3 instanceof X.AnonymousClass69b
            r14 = r21
            if (r0 == 0) goto L_0x006f
            X.69b r3 = (X.AnonymousClass69b) r3
            android.graphics.RectF r7 = A06(r3, r14)
            r14.save()
            android.graphics.Matrix r6 = r3.A00
            android.graphics.RectF r0 = r3.A05
            float r5 = r0.left
            float r4 = r0.top
            float r2 = r0.right
            float r0 = r0.bottom
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>(r5, r4, r2, r0)
            android.graphics.Matrix$ScaleToFit r0 = android.graphics.Matrix.ScaleToFit.CENTER
            r6.setRectToRect(r1, r7, r0)
            android.graphics.Path r2 = r3.A04
            r2.reset()
            android.graphics.Path$FillType r0 = android.graphics.Path.FillType.WINDING
            r2.setFillType(r0)
            android.graphics.Path r0 = r3.A02
            r0.transform(r6, r2)
            android.graphics.Paint r1 = r3.A01
            X.C108945cZ.A1L(r1)
            r0 = -31
            r1.setColor(r0)
            r2.close()
            r14.drawPath(r2, r1)
            r2.reset()
            android.graphics.Path$FillType r0 = android.graphics.Path.FillType.WINDING
            r2.setFillType(r0)
            android.graphics.Path r0 = r3.A03
            r0.transform(r6, r2)
            android.graphics.Paint r0 = r3.A05
            X.AnonymousClass3MW.A1P(r0)
            r14.drawPath(r2, r0)
            r14.restore()
            r1 = 1067869798(0x3fa66666, float:1.3)
            r0 = 1065353216(0x3f800000, float:1.0)
            X.AnonymousClass69b.A00(r14, r3, r1, r0)
            r1 = 1071225242(0x3fd9999a, float:1.7)
            r0 = 1056964608(0x3f000000, float:0.5)
            X.AnonymousClass69b.A00(r14, r3, r1, r0)
        L_0x006e:
            return
        L_0x006f:
            boolean r0 = r3 instanceof X.AnonymousClass69c
            if (r0 == 0) goto L_0x0164
            X.69c r3 = (X.AnonymousClass69c) r3
            r0 = 0
            X.C18070vi.A0d(r14, r0)
            java.lang.String r0 = r3.A0C
            int r0 = r0.length()
            if (r0 == 0) goto L_0x006e
            android.graphics.RectF r9 = r3.A06
            r9.sort()
            r14.save()
            float r2 = r3.A02
            float r1 = java.lang.Math.abs(r2)
            r0 = 1077936128(0x40400000, float:3.0)
            r8 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0097
            r2 = 0
        L_0x0097:
            X.C108985cd.A0w(r14, r9, r2)
            android.text.TextPaint r4 = r3.A0E
            X.6pZ r5 = r3.A0G
            int r0 = r5.A01
            r4.setColor(r0)
            float r1 = r5.A00
            r0 = 1132396544(0x437f0000, float:255.0)
            float r1 = r1 * r0
            int r0 = (int) r1
            r4.setAlpha(r0)
            android.content.Context r12 = r3.A0D
            android.text.StaticLayout r7 = r3.A0B
            java.lang.String r13 = "layout"
            r2 = 0
            if (r7 != 0) goto L_0x00b9
            X.C18070vi.A11(r13)
            throw r2
        L_0x00b9:
            float r6 = r3.A07
            float r1 = r3.A06
            float r6 = r6 * r1
            r10 = 2
            r0 = 1073741824(0x40000000, float:2.0)
            float r6 = r6 / r0
            java.util.ArrayList r11 = X.C26167Cth.A00(r12, r7, r6, r1)
            int r0 = r3.A09
            if (r0 != r10) goto L_0x00de
            android.text.StaticLayout r7 = r3.A0B
            if (r7 != 0) goto L_0x00d2
            X.C18070vi.A11(r13)
            throw r2
        L_0x00d2:
            float r6 = r3.A07
            float r1 = r3.A06
            float r6 = r6 * r1
            r0 = 1073741824(0x40000000, float:2.0)
            float r6 = r6 / r0
            java.util.ArrayList r11 = X.C26167Cth.A01(r12, r7, r6, r1)
        L_0x00de:
            float r7 = r9.width()
            float r0 = r3.A01
            float r7 = r7 / r0
            int r1 = r3.A0A
            if (r1 == 0) goto L_0x010b
            r0 = 1
            if (r1 == r0) goto L_0x0122
            if (r1 == r10) goto L_0x00fa
            float r6 = r9.centerX()
            android.text.StaticLayout r0 = r3.A0B
            if (r0 != 0) goto L_0x0117
            X.C18070vi.A11(r13)
            throw r2
        L_0x00fa:
            float r6 = r9.right
            android.text.StaticLayout r0 = r3.A0B
            if (r0 != 0) goto L_0x0104
            X.C18070vi.A11(r13)
            throw r2
        L_0x0104:
            int r0 = r0.getWidth()
            float r1 = (float) r0
            float r1 = r1 * r7
            goto L_0x0120
        L_0x010b:
            float r6 = r9.centerX()
            android.text.StaticLayout r0 = r3.A0B
            if (r0 != 0) goto L_0x0117
            X.C18070vi.A11(r13)
            throw r2
        L_0x0117:
            int r0 = r0.getWidth()
            float r1 = (float) r0
            float r1 = r1 * r7
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r0
        L_0x0120:
            float r6 = r6 - r1
            goto L_0x0124
        L_0x0122:
            float r6 = r9.left
        L_0x0124:
            float r0 = r9.top
            r14.translate(r6, r0)
            r14.scale(r7, r7, r8, r8)
            float r1 = r3.A07
            float r0 = r3.A06
            float r1 = r1 * r0
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r0
            android.graphics.CornerPathEffect r0 = new android.graphics.CornerPathEffect
            r0.<init>(r1)
            r4.setPathEffect(r0)
            java.util.Iterator r1 = r11.iterator()
        L_0x0140:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0150
            java.lang.Object r0 = r1.next()
            android.graphics.Path r0 = (android.graphics.Path) r0
            r14.drawPath(r0, r4)
            goto L_0x0140
        L_0x0150:
            r4.setPathEffect(r2)
            int r0 = r5.A04
            r4.setColor(r0)
            android.text.StaticLayout r0 = r3.A0B
            if (r0 != 0) goto L_0x0160
            X.C18070vi.A11(r13)
            throw r2
        L_0x0160:
            r0.draw(r14)
            goto L_0x01db
        L_0x0164:
            boolean r0 = r3 instanceof X.AnonymousClass69U
            if (r0 == 0) goto L_0x01c6
            X.69U r3 = (X.AnonymousClass69U) r3
            android.graphics.RectF r4 = A06(r3, r14)
            android.graphics.Paint r6 = r3.A05
            X.AnonymousClass3MW.A1P(r6)
            android.graphics.Matrix r5 = r3.A00
            r5.reset()
            float r1 = r3.A02
            r0 = 0
            r5.setRotate(r1, r0, r0)
            float r2 = r4.width()
            r1 = 1157234688(0x44fa0000, float:2000.0)
            float r2 = r2 / r1
            float r0 = r4.height()
            float r0 = r0 / r1
            r5.postScale(r2, r0)
            float r1 = r4.centerX()
            float r0 = r4.centerY()
            r5.postTranslate(r1, r0)
            android.graphics.Path r4 = r3.A03
            r4.reset()
            android.graphics.Path$FillType r0 = android.graphics.Path.FillType.WINDING
            r4.setFillType(r0)
            android.graphics.Path r2 = r3.A02
            r2.transform(r5, r4)
            android.graphics.Paint r1 = r3.A01
            X.C108945cZ.A1L(r1)
            r0 = -31
            r1.setColor(r0)
            r4.close()
            r14.drawPath(r4, r1)
            r4.reset()
            android.graphics.Path$FillType r0 = android.graphics.Path.FillType.WINDING
            r4.setFillType(r0)
            r2.transform(r5, r4)
            r14.drawPath(r4, r6)
            return
        L_0x01c6:
            boolean r0 = r3 instanceof X.AnonymousClass69T
            if (r0 == 0) goto L_0x01df
            android.graphics.RectF r1 = A06(r3, r14)
            r14.save()
            float r0 = r3.A02
            X.C108985cd.A0w(r14, r1, r0)
            android.graphics.Paint r0 = r3.A05
            r14.drawRect(r1, r0)
        L_0x01db:
            r14.restore()
            return
        L_0x01df:
            boolean r0 = r3 instanceof X.AnonymousClass69V
            if (r0 == 0) goto L_0x0225
            X.69V r3 = (X.AnonymousClass69V) r3
            r0 = 0
            X.C18070vi.A0d(r14, r0)
            boolean r0 = r3.A06
            if (r0 == 0) goto L_0x006e
            X.69K r4 = r3.A03
            if (r4 == 0) goto L_0x0215
            X.70B r0 = r3.A04
            boolean r0 = r0 instanceof X.C1196869l
            if (r0 == 0) goto L_0x0215
            r14.save()
            float r1 = r4.A02
            android.graphics.RectF r0 = r4.A06
            X.C108985cd.A0w(r14, r0, r1)
            float r2 = r4.A03
            float r1 = r0.centerX()
            float r0 = r0.centerY()
            r14.scale(r2, r2, r1, r0)
            float r1 = r4.A00
            float r0 = r4.A01
            r14.translate(r1, r0)
        L_0x0215:
            X.70B r0 = r3.A04
            if (r0 == 0) goto L_0x021c
            r0.A04(r14)
        L_0x021c:
            if (r4 == 0) goto L_0x006e
            X.70B r0 = r3.A04
            boolean r0 = r0 instanceof X.C1196869l
            if (r0 == 0) goto L_0x006e
            goto L_0x01db
        L_0x0225:
            boolean r0 = r3 instanceof X.AnonymousClass69S
            if (r0 == 0) goto L_0x023b
            android.graphics.RectF r1 = A06(r3, r14)
            r14.save()
            float r0 = r3.A02
            X.C108985cd.A0w(r14, r1, r0)
            android.graphics.Paint r0 = r3.A05
            r14.drawOval(r1, r0)
            goto L_0x01db
        L_0x023b:
            boolean r0 = r3 instanceof X.AnonymousClass69e
            if (r0 != 0) goto L_0x006e
            boolean r0 = r3 instanceof X.AnonymousClass69W
            if (r0 == 0) goto L_0x0264
            X.69W r3 = (X.AnonymousClass69W) r3
            r0 = 0
            X.C18070vi.A0d(r14, r0)
            java.lang.String r0 = r3.A01
            android.graphics.Bitmap r4 = android.graphics.BitmapFactory.decodeFile(r0)
            int r0 = r14.getWidth()
            float r1 = (float) r0
            int r0 = r14.getHeight()
            float r0 = (float) r0
            android.graphics.RectF r2 = X.C108965cb.A04(r1, r0)
            android.graphics.Paint r1 = r3.A00
            r0 = 0
            r14.drawBitmap(r4, r0, r2, r1)
            return
        L_0x0264:
            boolean r0 = r3 instanceof X.AnonymousClass69R
            if (r0 == 0) goto L_0x02ad
            android.graphics.RectF r0 = A06(r3, r14)
            r14.save()
            android.graphics.Path r7 = X.C108945cZ.A0L()
            float r6 = r0.width()
            float r5 = r0.height()
            r1 = 1073741824(0x40000000, float:2.0)
            float r4 = r6 / r1
            float r3 = r5 / r1
            r2 = 1065772646(0x3f866666, float:1.05)
            float r0 = java.lang.Math.min(r6, r5)
            float r2 = r2 * r0
            float r2 = r2 / r1
            android.graphics.Path$Direction r1 = android.graphics.Path.Direction.CW
            r7.addCircle(r4, r3, r2, r1)
            android.graphics.RectF r0 = X.C108965cb.A04(r6, r5)
            android.graphics.Path r2 = X.C108945cZ.A0L()
            r2.addRect(r0, r1)
            android.graphics.Path$Op r0 = android.graphics.Path.Op.DIFFERENCE
            r2.op(r7, r0)
            android.graphics.Paint r1 = X.AnonymousClass3MZ.A0A()
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            X.AnonymousClass3MZ.A1D(r0, r1)
            r14.drawPath(r2, r1)
            goto L_0x01db
        L_0x02ad:
            boolean r0 = r3 instanceof X.AnonymousClass69Q
            if (r0 == 0) goto L_0x032f
            r0 = 0
            X.C18070vi.A0d(r14, r0)
            r14.save()
            float r1 = r3.A02
            android.graphics.RectF r0 = r3.A06
            X.C108985cd.A0w(r14, r0, r1)
            float r15 = r0.left
            float r1 = r0.bottom
            float r4 = r0.right
            float r5 = r0.top
            android.graphics.Paint r2 = r3.A05
            r16 = r1
            r17 = r4
            r18 = r5
            r19 = r2
            r14.drawLine(r15, r16, r17, r18, r19)
            int r0 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r0 != 0) goto L_0x031c
            r0 = 90
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x02de:
            r14.save()
            r14.translate(r4, r5)
            float r3 = X.AnonymousClass000.A04(r0)
            int r1 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            r0 = 150(0x96, float:2.1E-43)
            if (r1 <= 0) goto L_0x02f0
            r0 = 30
        L_0x02f0:
            float r0 = (float) r0
            float r3 = r3 + r0
            r14.rotate(r3)
            float r8 = r2.getStrokeWidth()
            r3 = 1084227584(0x40a00000, float:5.0)
            float r8 = r8 * r3
            r6 = 0
            r9 = r6
            r5 = r14
            r7 = r6
            r10 = r2
            r5.drawLine(r6, r7, r8, r9, r10)
            int r1 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            r0 = 1114636288(0x42700000, float:60.0)
            if (r1 <= 0) goto L_0x030c
            r0 = -1032847360(0xffffffffc2700000, float:-60.0)
        L_0x030c:
            r14.rotate(r0)
            float r8 = r2.getStrokeWidth()
            float r8 = r8 * r3
            r5.drawLine(r6, r7, r8, r9, r10)
            r14.restore()
            goto L_0x01db
        L_0x031c:
            float r1 = r5 - r1
            float r0 = r4 - r15
            float r1 = r1 / r0
            double r0 = (double) r1
            double r0 = java.lang.Math.atan(r0)
            double r0 = java.lang.Math.toDegrees(r0)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            goto L_0x02de
        L_0x032f:
            boolean r0 = r3 instanceof X.AnonymousClass69N
            if (r0 == 0) goto L_0x037f
            X.69N r3 = (X.AnonymousClass69N) r3
            r0 = 0
            X.C18070vi.A0d(r14, r0)
            android.graphics.drawable.Drawable r0 = r3.A00
            if (r0 == 0) goto L_0x006e
            r14.save()
            android.graphics.drawable.Drawable r2 = r3.A00
            boolean r0 = r2 instanceof X.C109515dZ
            if (r0 == 0) goto L_0x0364
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.stickers.animation.AnimatedStickerDrawable"
            X.C18070vi.A0z(r2, r0)
            X.5dZ r2 = (X.C109515dZ) r2
            android.graphics.Rect r0 = r2.getBounds()
            int r1 = r0.right
            int r0 = r0.bottom
            X.AnonymousClass69N.A01(r14, r3, r1, r0)
            X.6zD r0 = r2.A06
            android.graphics.Bitmap r0 = r0.A0B
            X.C18070vi.A0X(r0)
            X.C109515dZ.A00(r0, r14, r2)
            goto L_0x01db
        L_0x0364:
            java.lang.String r0 = "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable"
            X.C18070vi.A0z(r2, r0)
            android.graphics.drawable.BitmapDrawable r2 = (android.graphics.drawable.BitmapDrawable) r2
            android.graphics.Bitmap r0 = r2.getBitmap()
            int r1 = r0.getWidth()
            int r0 = r0.getHeight()
            X.AnonymousClass69N.A01(r14, r3, r1, r0)
            r2.draw(r14)
            goto L_0x01db
        L_0x037f:
            boolean r0 = r3 instanceof X.AnonymousClass69K
            if (r0 == 0) goto L_0x039f
            X.69K r3 = (X.AnonymousClass69K) r3
            r0 = 0
            X.C18070vi.A0d(r14, r0)
            android.graphics.Bitmap r4 = r3.A01
            if (r4 == 0) goto L_0x006e
            r14.save()
            float r0 = r3.A02
            android.graphics.RectF r2 = r3.A06
            X.C108985cd.A0w(r14, r2, r0)
            android.graphics.Paint r1 = r3.A03
            r0 = 0
            r14.drawBitmap(r4, r0, r2, r1)
            goto L_0x01db
        L_0x039f:
            boolean r0 = r3 instanceof X.AnonymousClass69M
            if (r0 == 0) goto L_0x03cb
            X.69M r3 = (X.AnonymousClass69M) r3
            r0 = 0
            X.C18070vi.A0d(r14, r0)
            android.graphics.drawable.Drawable r6 = r3.A00
            if (r6 == 0) goto L_0x006e
            android.graphics.RectF r5 = r3.A06
            float r0 = r5.left
            int r4 = (int) r0
            float r0 = r5.top
            int r2 = (int) r0
            float r0 = r5.right
            int r1 = (int) r0
            float r0 = r5.bottom
            int r0 = (int) r0
            r6.setBounds(r4, r2, r1, r0)
            r14.save()
            float r0 = r3.A02
            X.C108985cd.A0w(r14, r5, r0)
            r6.draw(r14)
            goto L_0x01db
        L_0x03cb:
            X.69L r3 = (X.AnonymousClass69L) r3
            r0 = 0
            X.C18070vi.A0d(r14, r0)
            X.6ov r1 = r3.A0L
            float r5 = r1.A00()
            boolean r7 = r3.A06
            boolean r0 = r1.A01
            if (r0 == 0) goto L_0x03e6
            float r1 = r1.A00
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x03e6
            r7 = r7 ^ 1
        L_0x03e6:
            r14.save()
            android.graphics.RectF r2 = r3.A06
            r2.sort()
            float r0 = r3.A02
            X.C108985cd.A0w(r14, r2, r0)
            float r4 = r2.width()
            float r0 = r3.A00
            float r4 = r4 / r0
            float r1 = r2.height()
            r0 = 1122500608(0x42e80000, float:116.0)
            A07(r14, r2, r1, r0, r4)
            float r1 = r3.A00
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r0
            r0 = 1114112000(0x42680000, float:58.0)
            r14.scale(r5, r5, r1, r0)
            if (r7 == 0) goto L_0x0431
            X.6hG[] r0 = r3.A0P
        L_0x0411:
            java.util.List r0 = X.C200410p.A0P(r0)
            java.util.Iterator r6 = r0.iterator()
        L_0x0419:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0434
            java.lang.Object r0 = r6.next()
            X.6hG r0 = (X.C129106hG) r0
            android.graphics.RectF r5 = r0.A03
            float r4 = r0.A00
            float r1 = r0.A01
            android.graphics.Paint r0 = r0.A02
            r14.drawRoundRect(r5, r4, r1, r0)
            goto L_0x0419
        L_0x0431:
            X.6hG[] r0 = r3.A0Q
            goto L_0x0411
        L_0x0434:
            if (r7 == 0) goto L_0x04b5
            android.text.TextPaint r6 = r3.A0H
            android.text.TextPaint r5 = r3.A0G
        L_0x043a:
            java.lang.String r4 = r3.A02
            java.lang.String r10 = "formattedTime"
            if (r4 == 0) goto L_0x04be
            int r1 = r4.length()
            android.graphics.Rect r9 = r3.A0F
            r0 = 0
            r6.getTextBounds(r4, r0, r1, r9)
            float r4 = r3.A00
            r8 = 2
            r0 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r0
            java.lang.String r0 = r3.A02
            if (r0 == 0) goto L_0x04be
            float r1 = r6.measureText(r0)
            java.lang.String r0 = r3.A01
            java.lang.String r7 = "formattedPeriod"
            if (r0 == 0) goto L_0x04ba
            float r0 = r5.measureText(r0)
            float r1 = r1 + r0
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r0
            float r4 = r4 - r1
            int r0 = r9.height()
            int r0 = r0 / r8
            int r0 = r0 + 58
            float r1 = (float) r0
            boolean r0 = r3.A07
            if (r0 != 0) goto L_0x04ad
            boolean r0 = r3.A09
            if (r0 == 0) goto L_0x049d
            java.lang.String r0 = r3.A02
            if (r0 == 0) goto L_0x04be
            r14.drawText(r0, r4, r1, r6)
            java.lang.String r0 = r3.A02
            if (r0 == 0) goto L_0x04be
            float r0 = r6.measureText(r0)
            float r4 = r4 + r0
            java.lang.String r0 = r3.A01
            if (r0 == 0) goto L_0x04ba
            r14.drawText(r0, r4, r1, r5)
        L_0x048e:
            r14.restore()
            boolean r0 = r3.A0O
            if (r0 != 0) goto L_0x006e
            X.6pL r1 = r3.A0M
            float r0 = r3.A02
            r1.A01(r14, r2, r0)
            return
        L_0x049d:
            java.lang.String r0 = r3.A01
            if (r0 == 0) goto L_0x04ba
            r14.drawText(r0, r4, r1, r5)
            java.lang.String r0 = r3.A01
            if (r0 == 0) goto L_0x04ba
            float r0 = r5.measureText(r0)
            float r4 = r4 + r0
        L_0x04ad:
            java.lang.String r0 = r3.A02
            if (r0 == 0) goto L_0x04be
            r14.drawText(r0, r4, r1, r6)
            goto L_0x048e
        L_0x04b5:
            android.text.TextPaint r6 = r3.A0J
            android.text.TextPaint r5 = r3.A0I
            goto L_0x043a
        L_0x04ba:
            X.C18070vi.A11(r7)
            goto L_0x04c1
        L_0x04be:
            X.C18070vi.A11(r10)
        L_0x04c1:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1409773u.A0M(android.graphics.Canvas):void");
    }

    public void A0N(Canvas canvas) {
        if (this instanceof AnonymousClass69b) {
            A08(canvas, this);
        } else if (this instanceof AnonymousClass69c) {
            A08(canvas, this);
        } else if (this instanceof AnonymousClass69d) {
            A08(canvas, this);
        } else if (this instanceof AnonymousClass69U) {
            A08(canvas, this);
        } else if (this instanceof AnonymousClass69T) {
            A08(canvas, this);
        } else if (this instanceof AnonymousClass69V) {
            A08(canvas, this);
        } else if (this instanceof AnonymousClass69S) {
            A08(canvas, this);
        } else if (this instanceof AnonymousClass69e) {
        } else {
            if (this instanceof AnonymousClass69W) {
                A08(canvas, this);
            } else if (this instanceof AnonymousClass69R) {
                A08(canvas, this);
            } else if (this instanceof AnonymousClass69Q) {
                A08(canvas, this);
            } else if (this instanceof AnonymousClass69N) {
                AnonymousClass69N r1 = (AnonymousClass69N) this;
                C18070vi.A0d(canvas, 0);
                if (r1.A00 != null) {
                    canvas.save();
                    r1.A0M(canvas);
                    canvas.restore();
                }
            } else if (this instanceof AnonymousClass69K) {
                A08(canvas, this);
            } else {
                A08(canvas, this);
            }
        }
    }

    public void A0O(RectF rectF, float f, float f2, float f3, float f4) {
        if (f == f3) {
            f3 += 1.0f;
        }
        if (f2 == f4) {
            f4 += 1.0f;
        }
        RectF rectF2 = this.A06;
        rectF2.set(f, f2, f3, f4);
        rectF2.sort();
        A0F();
    }

    public void A0P(C129116hH r3) {
        this.A06.set(r3.A03);
        this.A02 = r3.A00;
        A0K(r3.A02);
        A0J(r3.A01);
    }

    public boolean A0S() {
        if ((this instanceof AnonymousClass69c) || (this instanceof AnonymousClass69V) || (this instanceof AnonymousClass69N) || (this instanceof AnonymousClass69K) || (this instanceof AnonymousClass69M) || (this instanceof AnonymousClass69L)) {
            return false;
        }
        return true;
    }

    public boolean A0T() {
        if ((this instanceof AnonymousClass69c) || (this instanceof AnonymousClass69V) || (this instanceof AnonymousClass69N) || (this instanceof AnonymousClass69K) || (this instanceof AnonymousClass69M) || (this instanceof AnonymousClass69L)) {
            return false;
        }
        return true;
    }

    public boolean A0U() {
        if (this instanceof AnonymousClass69L) {
            return true;
        }
        return false;
    }

    public boolean A0V() {
        if (this instanceof AnonymousClass69L) {
            return ((AnonymousClass69L) this).A0L.A01;
        }
        return false;
    }

    public boolean A0W() {
        if ((this instanceof AnonymousClass69V) || (this instanceof AnonymousClass69e)) {
            return false;
        }
        return true;
    }

    public boolean A0X() {
        if (this instanceof AnonymousClass69K) {
            return false;
        }
        return true;
    }

    public boolean A0Y() {
        if (!(this instanceof AnonymousClass69L)) {
            return false;
        }
        AnonymousClass69L r3 = (AnonymousClass69L) this;
        String str = r3.A02;
        if (str != null) {
            AnonymousClass69L.A01(r3);
            String str2 = r3.A02;
            if (str2 != null) {
                boolean z = !str.equals(str2);
                if (z) {
                    AnonymousClass69L.A00(r3);
                }
                return z;
            }
        }
        C18070vi.A11("formattedTime");
        throw null;
    }

    public boolean A0Z() {
        if (!(this instanceof AnonymousClass69L)) {
            return false;
        }
        C123946Wl.A00(((AnonymousClass69L) this).A0L);
        return true;
    }

    public C1409773u() {
        Paint A0A2 = AnonymousClass3MZ.A0A();
        AnonymousClass3MW.A1P(A0A2);
        A0A2.setStrokeJoin(Paint.Join.ROUND);
        A0A2.setStrokeCap(Paint.Cap.ROUND);
        this.A05 = A0A2;
    }
}
