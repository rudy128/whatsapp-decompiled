package X;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.D7p  reason: case insensitive filesystem */
public abstract class C26642D7p implements E3k, E7H, C28646ECe {
    public float A00;
    public BlurMaskFilter A01;
    public C22735BMy A02;
    public C24904COx A03;
    public C26642D7p A04;
    public C26642D7p A05;
    public boolean A06;
    public Paint A07;
    public List A08;
    public boolean A09;
    public final Matrix A0A;
    public final Paint A0B = new Paint(1);
    public final Paint A0C;
    public final Paint A0D;
    public final Path A0E = C108945cZ.A0L();
    public final RectF A0F;
    public final RectF A0G;
    public final RectF A0H;
    public final RectF A0I;
    public final C38631rd A0J;
    public final C25266Cc7 A0K;
    public final C40941vX A0L;
    public final List A0M;
    public final Matrix A0N = C108945cZ.A0J();
    public final Matrix A0O = C108945cZ.A0J();
    public final Paint A0P;
    public final Paint A0Q;
    public final RectF A0R;

    public void CIY(List list, List list2) {
    }

    private void A05() {
        if (this.A08 == null) {
            C26642D7p d7p = this.A05;
            if (d7p == null) {
                this.A08 = Collections.emptyList();
                return;
            }
            this.A08 = AnonymousClass000.A13();
            do {
                this.A08.add(d7p);
                d7p = d7p.A05;
            } while (d7p != null);
        }
    }

    private void A06(Canvas canvas) {
        RectF rectF = this.A0H;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.A0P);
    }

    public C24747CIj A08() {
        if (!(this instanceof BN1)) {
            return this.A0L.A0E;
        }
        BN1 bn1 = (BN1) this;
        C24747CIj cIj = bn1.A0L.A0E;
        if (cIj == null) {
            return bn1.A01.A08();
        }
        return cIj;
    }

    public CS8 A09() {
        if (!(this instanceof BN1)) {
            return this.A0L.A0F;
        }
        BN1 bn1 = (BN1) this;
        CS8 cs8 = bn1.A0L.A0F;
        if (cs8 == null) {
            return bn1.A01.A09();
        }
        return cs8;
    }

    public void A0A(float f) {
        C25266Cc7 cc7 = this.A0K;
        C26049CrJ crJ = cc7.A02;
        if (crJ != null) {
            crJ.A09(f);
        }
        C26049CrJ crJ2 = cc7.A06;
        if (crJ2 != null) {
            crJ2.A09(f);
        }
        C26049CrJ crJ3 = cc7.A01;
        if (crJ3 != null) {
            crJ3.A09(f);
        }
        C26049CrJ crJ4 = cc7.A00;
        if (crJ4 != null) {
            crJ4.A09(f);
        }
        C26049CrJ crJ5 = cc7.A03;
        if (crJ5 != null) {
            crJ5.A09(f);
        }
        C26049CrJ crJ6 = cc7.A05;
        if (crJ6 != null) {
            crJ6.A09(f);
        }
        C26049CrJ crJ7 = cc7.A04;
        if (crJ7 != null) {
            crJ7.A09(f);
        }
        C22735BMy bMy = cc7.A07;
        if (bMy != null) {
            bMy.A09(f);
        }
        C22735BMy bMy2 = cc7.A08;
        if (bMy2 != null) {
            bMy2.A09(f);
        }
        C24904COx cOx = this.A03;
        if (cOx != null) {
            int i = 0;
            while (true) {
                List list = cOx.A00;
                if (i >= list.size()) {
                    break;
                }
                ((C26049CrJ) list.get(i)).A09(f);
                i++;
            }
        }
        C22735BMy bMy3 = this.A02;
        if (bMy3 != null) {
            bMy3.A09(f);
        }
        C26642D7p d7p = this.A04;
        if (d7p != null) {
            d7p.A0A(f);
        }
        List list2 = this.A0M;
        list2.size();
        for (int i2 = 0; i2 < list2.size(); i2++) {
            ((C26049CrJ) list2.get(i2)).A09(f);
        }
        list2.size();
    }

    public void A0B(Canvas canvas, Matrix matrix, int i) {
        Bitmap bitmap;
        String str;
        C55152fI r7;
        int width;
        int height;
        int A0M2;
        int i2 = i;
        if (this instanceof BN3) {
            BN3 bn3 = (BN3) this;
            C40941vX r6 = bn3.A04;
            int alpha = Color.alpha(r6.A04);
            if (alpha != 0) {
                C26049CrJ crJ = bn3.A0K.A02;
                if (crJ == null) {
                    A0M2 = 100;
                } else {
                    A0M2 = AnonymousClass000.A0M(crJ.A05());
                }
                int A012 = (int) ((((float) i2) / 255.0f) * BE7.A01(((float) alpha) / 255.0f, (float) A0M2) * 255.0f);
                Paint paint = bn3.A02;
                paint.setAlpha(A012);
                C26049CrJ crJ2 = bn3.A00;
                if (crJ2 != null) {
                    paint.setColor(AnonymousClass000.A0M(crJ2.A05()));
                }
                BEA.A13(paint, bn3.A01);
                if (A012 > 0) {
                    float[] fArr = bn3.A05;
                    fArr[0] = 0.0f;
                    fArr[1] = 0.0f;
                    float f = (float) r6.A06;
                    fArr[2] = f;
                    fArr[3] = 0.0f;
                    fArr[4] = f;
                    float f2 = (float) r6.A05;
                    fArr[5] = f2;
                    fArr[6] = 0.0f;
                    fArr[7] = f2;
                    matrix.mapPoints(fArr);
                    Path path = bn3.A03;
                    path.reset();
                    path.moveTo(fArr[0], fArr[1]);
                    path.lineTo(fArr[2], fArr[3]);
                    path.lineTo(fArr[4], fArr[5]);
                    path.lineTo(fArr[6], fArr[7]);
                    BE8.A0w(canvas, paint, path, fArr[0], fArr[1]);
                }
            }
        } else if (this instanceof BN1) {
            ((BN1) this).A00.BJJ(canvas, matrix, i2);
        } else if (!(this instanceof BN0)) {
            if (this instanceof BN2) {
                BN2 bn2 = (BN2) this;
                C26049CrJ crJ3 = bn2.A01;
                if (crJ3 == null || (bitmap = (Bitmap) crJ3.A05()) == null) {
                    String str2 = bn2.A0L.A0K;
                    C38631rd r72 = bn2.A0J;
                    C25577CiH ciH = r72.A0K;
                    if (ciH != null) {
                        Drawable.Callback callback = r72.getCallback();
                        Context context = null;
                        if (callback != null && (callback instanceof View)) {
                            context = ((View) callback).getContext();
                        }
                        Context context2 = ciH.A01;
                        if (context2 instanceof Application) {
                            context = context.getApplicationContext();
                        }
                        if (context != context2) {
                            r72.A0K = null;
                        }
                    }
                    C25577CiH ciH2 = r72.A0K;
                    if (ciH2 == null) {
                        ciH2 = new C25577CiH(r72.getCallback(), r72.A0P, r72.A0G.A0A);
                        r72.A0K = ciH2;
                    }
                    Map map = ciH2.A03;
                    C55152fI r8 = (C55152fI) map.get(str2);
                    if (r8 != null) {
                        bitmap = r8.A00;
                        if (bitmap == null) {
                            Context context3 = ciH2.A01;
                            if (context3 != null) {
                                String str3 = r8.A03;
                                BitmapFactory.Options options = new BitmapFactory.Options();
                                options.inScaled = true;
                                options.inDensity = 160;
                                if (!str3.startsWith("data:") || str3.indexOf("base64,") <= 0) {
                                    try {
                                        String str4 = ciH2.A02;
                                        if (!TextUtils.isEmpty(str4)) {
                                            try {
                                                bitmap = BitmapFactory.decodeStream(context3.getAssets().open(C17900vP.A0A(str4, str3)), (Rect) null, options);
                                                if (bitmap == null) {
                                                    StringBuilder A10 = AnonymousClass000.A10();
                                                    A10.append("Decoded image `");
                                                    A10.append(str2);
                                                    C196379ux.A00(AnonymousClass000.A0y("` is null.", A10));
                                                } else {
                                                    int i3 = r8.A02;
                                                    int i4 = r8.A01;
                                                    if (!(bitmap.getWidth() == i3 && bitmap.getHeight() == i4)) {
                                                        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i3, i4, true);
                                                        bitmap.recycle();
                                                        bitmap = createScaledBitmap;
                                                    }
                                                }
                                            } catch (IllegalArgumentException e) {
                                                StringBuilder A102 = AnonymousClass000.A10();
                                                A102.append("Unable to decode image `");
                                                A102.append(str2);
                                                C196379ux.A01(AnonymousClass000.A0y("`.", A102), e);
                                            }
                                        } else {
                                            throw AnonymousClass000.A0n("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
                                        }
                                    } catch (IOException e2) {
                                        e = e2;
                                        str = "Unable to open asset.";
                                        C196379ux.A01(str, e);
                                        C55152fI r0 = bn2.A05;
                                        return;
                                    }
                                } else {
                                    try {
                                        byte[] decode = Base64.decode(BE6.A0p(str3.indexOf(44), str3), 0);
                                        bitmap = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
                                    } catch (IllegalArgumentException e3) {
                                        e = e3;
                                        str = "data URL did not have correct base64 format.";
                                    }
                                }
                                synchronized (C25577CiH.A04) {
                                    ((C55152fI) map.get(str2)).A00 = bitmap;
                                }
                                if (bitmap != null) {
                                }
                            }
                        }
                    }
                    C55152fI r02 = bn2.A05;
                    if (r02 == null || (bitmap = r02.A00) == null) {
                        return;
                    }
                }
                if (!bitmap.isRecycled() && (r7 = bn2.A05) != null) {
                    float A002 = C40171uH.A00();
                    Paint paint2 = bn2.A02;
                    paint2.setAlpha(i2);
                    BEA.A13(paint2, bn2.A00);
                    canvas.save();
                    canvas.concat(matrix);
                    Rect rect = bn2.A04;
                    rect.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
                    boolean z = bn2.A0J.A0W;
                    Rect rect2 = bn2.A03;
                    if (z) {
                        width = (int) (((float) r7.A02) * A002);
                        height = r7.A01;
                    } else {
                        width = (int) (((float) bitmap.getWidth()) * A002);
                        height = bitmap.getHeight();
                    }
                    rect2.set(0, 0, width, (int) (((float) height) * A002));
                    canvas.drawBitmap(bitmap, rect, rect2, paint2);
                } else {
                    return;
                }
            } else {
                BN4 bn4 = (BN4) this;
                RectF rectF = bn4.A04;
                C40941vX r5 = bn4.A0L;
                rectF.set(0.0f, 0.0f, r5.A01, r5.A00);
                matrix.mapRect(rectF);
                if (!bn4.A0J.A0U || bn4.A05.size() <= 1 || i2 == 255) {
                    canvas.save();
                } else {
                    Paint paint3 = bn4.A03;
                    paint3.setAlpha(i2);
                    C40171uH.A02(canvas, paint3, rectF, 31);
                    i2 = 255;
                }
                List list = bn4.A05;
                for (int A022 = AnonymousClass3MX.A02(list, 1); A022 >= 0; A022--) {
                    if ((!bn4.A01 && "__container".equals(r5.A0J)) || rectF.isEmpty() || canvas.clipRect(rectF)) {
                        ((C26642D7p) list.get(A022)).BJJ(canvas, matrix, i2);
                    }
                }
            }
            canvas.restore();
        }
    }

    public void A0C(C26049CrJ crJ) {
        if (crJ != null) {
            this.A0M.add(crJ);
        }
    }

    public void A0D(C26046CrD crD, C26046CrD crD2, List list, int i) {
        if (this instanceof BN1) {
            ((BN1) this).A00.CFv(crD, crD2, list, i);
        } else if (this instanceof BN4) {
            BN4 bn4 = (BN4) this;
            int i2 = 0;
            while (true) {
                List list2 = bn4.A05;
                if (i2 < list2.size()) {
                    ((C26642D7p) list2.get(i2)).CFv(crD, crD2, list, i);
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    public void A0E(boolean z) {
        if (z && this.A07 == null) {
            this.A07 = new Paint();
        }
        this.A09 = z;
    }

    public void BBs(C25723Ckt ckt, Object obj) {
        this.A0K.A04(ckt, obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: X.CMU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: X.CMU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: X.CMU} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BJJ(android.graphics.Canvas r21, android.graphics.Matrix r22, int r23) {
        /*
            r20 = this;
            r2 = r20
            boolean r0 = r2.A06
            if (r0 == 0) goto L_0x0314
            X.1vX r0 = r2.A0L
            r18 = r0
            boolean r0 = r0.A0O
            if (r0 != 0) goto L_0x0314
            r2.A05()
            android.graphics.Matrix r4 = r2.A0O
            r4.reset()
            r19 = r22
            r0 = r19
            r4.set(r0)
            java.util.List r0 = r2.A08
            int r1 = r0.size()
        L_0x0023:
            int r1 = r1 + -1
            if (r1 < 0) goto L_0x0039
            java.util.List r0 = r2.A08
            java.lang.Object r0 = r0.get(r1)
            X.D7p r0 = (X.C26642D7p) r0
            X.Cc7 r0 = r0.A0K
            android.graphics.Matrix r0 = r0.A00()
            r4.preConcat(r0)
            goto L_0x0023
        L_0x0039:
            X.Cc7 r10 = r2.A0K
            X.CrJ r0 = r10.A02
            if (r0 == 0) goto L_0x0121
            java.lang.Object r0 = r0.A05()
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0121
            int r0 = r0.intValue()
        L_0x004b:
            r1 = r23
            float r3 = (float) r1
            r1 = 1132396544(0x437f0000, float:255.0)
            float r3 = r3 / r1
            float r0 = (float) r0
            float r0 = X.BE7.A01(r3, r0)
            float r0 = r0 * r1
            int r3 = (int) r0
            X.D7p r0 = r2.A04
            r5 = r21
            if (r0 != 0) goto L_0x006a
            X.COx r0 = r2.A03
            if (r0 == 0) goto L_0x0261
            java.util.List r0 = r0.A00
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0261
        L_0x006a:
            android.graphics.RectF r1 = r2.A0H
            r0 = 0
            r2.BNg(r4, r1, r0)
            X.D7p r0 = r2.A04
            if (r0 == 0) goto L_0x0093
            r0 = r18
            java.lang.Integer r6 = r0.A0I
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            if (r6 == r0) goto L_0x0093
            android.graphics.RectF r9 = r2.A0G
            r8 = 0
            r9.set(r8, r8, r8, r8)
            X.D7p r7 = r2.A04
            r6 = 1
            r0 = r19
            r7.BNg(r0, r9, r6)
            boolean r0 = r1.intersect(r9)
            if (r0 != 0) goto L_0x0093
            r1.set(r8, r8, r8, r8)
        L_0x0093:
            android.graphics.Matrix r0 = r10.A00()
            r4.preConcat(r0)
            android.graphics.RectF r10 = r2.A0F
            r9 = 0
            r10.set(r9, r9, r9, r9)
            X.COx r6 = r2.A03
            if (r6 == 0) goto L_0x012e
            java.util.List r0 = r6.A00
            r17 = r0
            boolean r0 = r17.isEmpty()
            if (r0 != 0) goto L_0x012e
            java.util.List r0 = r6.A01
            r16 = r0
            int r12 = r16.size()
            r11 = 0
            r8 = 0
        L_0x00b8:
            if (r8 >= r12) goto L_0x0125
            r0 = r16
            java.lang.Object r13 = r0.get(r8)
            X.CQx r13 = (X.C24947CQx) r13
            r0 = r17
            java.lang.Object r0 = r0.get(r8)
            X.CrJ r0 = (X.C26049CrJ) r0
            java.lang.Object r0 = r0.A05()
            android.graphics.Path r0 = (android.graphics.Path) r0
            if (r0 == 0) goto L_0x00f5
            android.graphics.Path r7 = r2.A0E
            r7.set(r0)
            r7.transform(r4)
            java.lang.Integer r0 = r13.A02
            int r14 = r0.intValue()
            r0 = 3
            if (r14 == r0) goto L_0x012e
            r0 = 1
            if (r14 == r0) goto L_0x012e
            r0 = 2
            if (r14 == r0) goto L_0x011c
            if (r14 == r11) goto L_0x011c
        L_0x00eb:
            android.graphics.RectF r0 = r2.A0I
            r7.computeBounds(r0, r11)
            if (r8 != 0) goto L_0x00f8
            r10.set(r0)
        L_0x00f5:
            int r8 = r8 + 1
            goto L_0x00b8
        L_0x00f8:
            float r13 = r10.left
            float r7 = r0.left
            float r14 = java.lang.Math.min(r13, r7)
            float r13 = r10.top
            float r7 = r0.top
            float r13 = java.lang.Math.min(r13, r7)
            float r15 = r10.right
            float r7 = r0.right
            float r7 = java.lang.Math.max(r15, r7)
            float r15 = r10.bottom
            float r0 = r0.bottom
            float r0 = java.lang.Math.max(r15, r0)
            r10.set(r14, r13, r7, r0)
            goto L_0x00f5
        L_0x011c:
            boolean r0 = r13.A03
            if (r0 == 0) goto L_0x00eb
            goto L_0x012e
        L_0x0121:
            r0 = 100
            goto L_0x004b
        L_0x0125:
            boolean r0 = r1.intersect(r10)
            if (r0 != 0) goto L_0x012e
            r1.set(r9, r9, r9, r9)
        L_0x012e:
            android.graphics.RectF r8 = r2.A0R
            int r0 = r5.getWidth()
            float r7 = (float) r0
            int r0 = r5.getHeight()
            float r0 = (float) r0
            r8.set(r9, r9, r7, r0)
            android.graphics.Matrix r7 = r2.A0N
            r5.getMatrix(r7)
            boolean r0 = r7.isIdentity()
            if (r0 != 0) goto L_0x014e
            r7.invert(r7)
            r7.mapRect(r8)
        L_0x014e:
            boolean r0 = r1.intersect(r8)
            if (r0 != 0) goto L_0x0157
            r1.set(r9, r9, r9, r9)
        L_0x0157:
            float r0 = r1.width()
            r7 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x028a
            float r0 = r1.height()
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x028a
            android.graphics.Paint r10 = r2.A0B
            r9 = 255(0xff, float:3.57E-43)
            r10.setAlpha(r9)
            r8 = 31
            X.C40171uH.A02(r5, r10, r1, r8)
            r2.A06(r5)
            r2.A0B(r5, r4, r3)
            if (r6 == 0) goto L_0x026f
            java.util.List r0 = r6.A00
            r17 = r0
            boolean r0 = r17.isEmpty()
            if (r0 != 0) goto L_0x026f
            android.graphics.Paint r11 = r2.A0C
            r0 = 19
            X.C40171uH.A02(r5, r11, r1, r0)
            int r7 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r7 >= r0) goto L_0x0197
            r2.A06(r5)
        L_0x0197:
            r7 = 0
        L_0x0198:
            java.util.List r0 = r6.A01
            r16 = r0
            int r0 = r16.size()
            if (r7 >= r0) goto L_0x026c
            r0 = r16
            java.lang.Object r14 = r0.get(r7)
            X.CQx r14 = (X.C24947CQx) r14
            r0 = r17
            java.lang.Object r13 = r0.get(r7)
            X.CrJ r13 = (X.C26049CrJ) r13
            java.util.List r0 = r6.A02
            java.lang.Object r12 = r0.get(r7)
            X.CrJ r12 = (X.C26049CrJ) r12
            java.lang.Integer r0 = r14.A02
            int r15 = r0.intValue()
            r0 = 3
            if (r15 == r0) goto L_0x023c
            r0 = 1
            if (r15 == r0) goto L_0x01f3
            r0 = 2
            if (r15 == r0) goto L_0x020d
            r0 = 0
            if (r15 != r0) goto L_0x01e5
            boolean r0 = r14.A03
            if (r0 == 0) goto L_0x01e8
            X.C40171uH.A02(r5, r10, r1, r8)
            r5.drawRect(r1, r10)
            android.graphics.Path r13 = A04(r4, r13, r2)
            A07(r10, r12)
            android.graphics.Paint r0 = r2.A0D
            r5.drawPath(r13, r0)
        L_0x01e2:
            r5.restore()
        L_0x01e5:
            int r7 = r7 + 1
            goto L_0x0198
        L_0x01e8:
            android.graphics.Path r0 = A04(r4, r13, r2)
            A07(r10, r12)
            r5.drawPath(r0, r10)
            goto L_0x01e5
        L_0x01f3:
            if (r7 != 0) goto L_0x0200
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r10.setColor(r0)
            r10.setAlpha(r9)
            r5.drawRect(r1, r10)
        L_0x0200:
            boolean r0 = r14.A03
            if (r0 == 0) goto L_0x0232
            android.graphics.Paint r14 = r2.A0D
            X.C40171uH.A02(r5, r14, r1, r8)
            r5.drawRect(r1, r10)
            goto L_0x0219
        L_0x020d:
            boolean r0 = r14.A03
            if (r0 == 0) goto L_0x0224
            X.C40171uH.A02(r5, r11, r1, r8)
            r5.drawRect(r1, r10)
            android.graphics.Paint r14 = r2.A0D
        L_0x0219:
            A07(r14, r12)
            android.graphics.Path r0 = A04(r4, r13, r2)
            r5.drawPath(r0, r14)
            goto L_0x01e2
        L_0x0224:
            X.C40171uH.A02(r5, r11, r1, r8)
            android.graphics.Path r0 = A04(r4, r13, r2)
            A07(r10, r12)
            r5.drawPath(r0, r10)
            goto L_0x01e2
        L_0x0232:
            android.graphics.Path r12 = A04(r4, r13, r2)
            android.graphics.Paint r0 = r2.A0D
            r5.drawPath(r12, r0)
            goto L_0x01e5
        L_0x023c:
            boolean r0 = r17.isEmpty()
            if (r0 != 0) goto L_0x01e5
            r13 = 0
        L_0x0243:
            int r0 = r16.size()
            if (r13 >= r0) goto L_0x025a
            r0 = r16
            java.lang.Object r0 = r0.get(r13)
            X.CQx r0 = (X.C24947CQx) r0
            java.lang.Integer r12 = r0.A02
            java.lang.Integer r0 = X.AnonymousClass00R.A0N
            if (r12 != r0) goto L_0x01e5
            int r13 = r13 + 1
            goto L_0x0243
        L_0x025a:
            r10.setAlpha(r9)
            r5.drawRect(r1, r10)
            goto L_0x01e5
        L_0x0261:
            android.graphics.Matrix r0 = r10.A00()
            r4.preConcat(r0)
            r2.A0B(r5, r4, r3)
            goto L_0x02bb
        L_0x026c:
            r5.restore()
        L_0x026f:
            X.D7p r0 = r2.A04
            if (r0 == 0) goto L_0x0287
            android.graphics.Paint r4 = r2.A0Q
            r0 = 19
            X.C40171uH.A02(r5, r4, r1, r0)
            r2.A06(r5)
            X.D7p r4 = r2.A04
            r0 = r19
            r4.BJJ(r5, r0, r3)
            r5.restore()
        L_0x0287:
            r5.restore()
        L_0x028a:
            boolean r0 = r2.A09
            if (r0 == 0) goto L_0x02bb
            android.graphics.Paint r0 = r2.A07
            if (r0 == 0) goto L_0x02bb
            X.AnonymousClass3MW.A1P(r0)
            android.graphics.Paint r3 = r2.A07
            r0 = -251901(0xfffffffffffc2803, float:NaN)
            r3.setColor(r0)
            android.graphics.Paint r3 = r2.A07
            r0 = 1082130432(0x40800000, float:4.0)
            r3.setStrokeWidth(r0)
            android.graphics.Paint r0 = r2.A07
            r5.drawRect(r1, r0)
            android.graphics.Paint r0 = r2.A07
            X.C108945cZ.A1L(r0)
            android.graphics.Paint r3 = r2.A07
            r0 = 1357638635(0x50ebebeb, float:3.1664855E10)
            r3.setColor(r0)
            android.graphics.Paint r0 = r2.A07
            r5.drawRect(r1, r0)
        L_0x02bb:
            X.1rd r0 = r2.A0J
            X.1tf r0 = r0.A0G
            X.1uM r5 = r0.A0D
            r0 = r18
            java.lang.String r4 = r0.A0J
            boolean r0 = r5.A00
            if (r0 == 0) goto L_0x0314
            java.util.Map r0 = r5.A01
            java.lang.Object r3 = r0.get(r4)
            X.CMU r3 = (X.CMU) r3
            if (r3 != 0) goto L_0x02db
            X.CMU r3 = new X.CMU
            r3.<init>()
            r0.put(r4, r3)
        L_0x02db:
            r0 = 0
            float r2 = r3.A00
            float r2 = r2 + r0
            r3.A00 = r2
            int r0 = r3.A01
            int r1 = r0 + 1
            r3.A01 = r1
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r0) goto L_0x02f6
            r0 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r0
            r3.A00 = r2
            r0 = 1073741823(0x3fffffff, float:1.9999999)
            r3.A01 = r0
        L_0x02f6:
            java.lang.String r0 = "__container"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0314
            java.util.Set r0 = r5.A02
            java.util.Iterator r1 = r0.iterator()
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0314
            r1.next()
            java.lang.String r0 = "onFrameRendered"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x0314:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26642D7p.BJJ(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    public void BNg(Matrix matrix, RectF rectF, boolean z) {
        this.A0H.set(0.0f, 0.0f, 0.0f, 0.0f);
        A05();
        Matrix matrix2 = this.A0A;
        matrix2.set(matrix);
        if (z) {
            List list = this.A08;
            if (list != null) {
                int size = list.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    matrix2.preConcat(((C26642D7p) this.A08.get(size)).A0K.A00());
                }
            } else {
                C26642D7p d7p = this.A05;
                if (d7p != null) {
                    matrix2.preConcat(d7p.A0K.A00());
                }
            }
        }
        matrix2.preConcat(this.A0K.A00());
    }

    public void C9s() {
        this.A0J.invalidateSelf();
    }

    public void CFv(C26046CrD crD, C26046CrD crD2, List list, int i) {
        C26642D7p d7p = this.A04;
        if (d7p != null) {
            String str = d7p.A0L.A0J;
            C26046CrD crD3 = new C26046CrD(crD2);
            crD3.A01.add(str);
            if (crD.A01(this.A04.A0L.A0J, i)) {
                C26642D7p d7p2 = this.A04;
                C26046CrD crD4 = new C26046CrD(crD3);
                crD4.A00 = d7p2;
                list.add(crD4);
            }
            if (crD.A03(this.A0L.A0J, i)) {
                this.A04.A0D(crD, crD3, list, crD.A00(this.A04.A0L.A0J, i) + i);
            }
        }
        String str2 = this.A0L.A0J;
        if (crD.A02(str2, i)) {
            if (!"__container".equals(str2)) {
                C26046CrD crD5 = new C26046CrD(crD2);
                crD5.A01.add(str2);
                crD2 = crD5;
                if (crD.A01(str2, i)) {
                    C26046CrD crD6 = new C26046CrD(crD5);
                    crD6.A00 = this;
                    list.add(crD6);
                }
            }
            if (crD.A03(str2, i)) {
                A0D(crD, crD2, list, i + crD.A00(str2, i));
            }
        }
    }

    public String getName() {
        return this.A0L.A0J;
    }

    /* JADX WARNING: type inference failed for: r1v6, types: [X.BMy, X.CrJ] */
    public C26642D7p(C38631rd r6, C40941vX r7) {
        PorterDuff.Mode mode;
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_IN;
        Paint paint = new Paint(1);
        C108965cb.A11(paint, mode2);
        this.A0C = paint;
        PorterDuff.Mode mode3 = PorterDuff.Mode.DST_OUT;
        Paint paint2 = new Paint(1);
        C108965cb.A11(paint2, mode3);
        this.A0D = paint2;
        Paint paint3 = new Paint(1);
        this.A0Q = paint3;
        PorterDuff.Mode mode4 = PorterDuff.Mode.CLEAR;
        Paint paint4 = new Paint();
        C108965cb.A11(paint4, mode4);
        this.A0P = paint4;
        this.A0H = AnonymousClass3MW.A08();
        this.A0R = AnonymousClass3MW.A08();
        this.A0F = AnonymousClass3MW.A08();
        this.A0G = AnonymousClass3MW.A08();
        this.A0I = AnonymousClass3MW.A08();
        this.A0A = C108945cZ.A0J();
        this.A0M = AnonymousClass000.A13();
        this.A06 = true;
        this.A00 = 0.0f;
        this.A0J = r6;
        this.A0L = r7;
        if (r7.A0I == AnonymousClass00R.A0C) {
            mode = PorterDuff.Mode.DST_OUT;
        } else {
            mode = PorterDuff.Mode.DST_IN;
        }
        C108965cb.A11(paint3, mode);
        C25266Cc7 cc7 = new C25266Cc7(r7.A0D);
        this.A0K = cc7;
        cc7.A02(this);
        List list = r7.A0M;
        if (list != null && !list.isEmpty()) {
            C24904COx cOx = new C24904COx(list);
            this.A03 = cOx;
            for (C26049CrJ A0A2 : cOx.A00) {
                A0A2.A0A(this);
            }
            for (C26049CrJ crJ : this.A03.A02) {
                A0C(crJ);
                crJ.A0A(this);
            }
        }
        List list2 = this.A0L.A0L;
        boolean z = true;
        if (!list2.isEmpty()) {
            ? crJ2 = new C26049CrJ(list2);
            this.A02 = crJ2;
            crJ2.A04 = true;
            crJ2.A0A(new C26637D7k(this));
            z = C26049CrJ.A01(this.A02) != 1.0f ? false : z;
            if (z != this.A06) {
                this.A06 = z;
                this.A0J.invalidateSelf();
            }
            A0C(this.A02);
        } else if (true != this.A06) {
            this.A06 = true;
            this.A0J.invalidateSelf();
        }
    }

    public static Path A04(Matrix matrix, C26049CrJ crJ, C26642D7p d7p) {
        Path path = d7p.A0E;
        path.set((Path) crJ.A05());
        path.transform(matrix);
        return path;
    }

    public static void A07(Paint paint, C26049CrJ crJ) {
        paint.setAlpha((int) (((float) ((Number) crJ.A05()).intValue()) * 2.55f));
    }
}
