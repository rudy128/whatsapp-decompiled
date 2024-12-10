package X;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.io.IOException;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: X.1Jp  reason: invalid class name and case insensitive filesystem */
public class C24291Jp extends C24281Jo {
    public static final PorterDuff.Mode A08 = PorterDuff.Mode.SRC_IN;
    public AnonymousClass26j A00;
    public boolean A01;
    public ColorFilter A02;
    public PorterDuffColorFilter A03;
    public boolean A04;
    public final Matrix A05;
    public final Rect A06;
    public final float[] A07;

    public static C24291Jp A00(Resources.Theme theme, Resources resources, int i) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            C24291Jp r1 = new C24291Jp();
            r1.A00 = C40501uo.A00(theme, resources, i);
            return r1;
        }
        try {
            XmlResourceParser xml = resources.getXml(i);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    C24291Jp r0 = new C24291Jp();
                    r0.inflate(resources, xml, asAttributeSet, theme);
                    return r0;
                }
            } while (next != 1);
            throw new XmlPullParserException("No start tag found");
        } catch (IOException | XmlPullParserException e) {
            Log.e("VectorDrawableCompat", "parser error", e);
            return null;
        }
    }

    public static C24291Jp A01(Resources.Theme theme, Resources resources, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        C24291Jp r0 = new C24291Jp();
        r0.inflate(resources, xmlPullParser, attributeSet, theme);
        return r0;
    }

    public PorterDuffColorFilter A02(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.A00;
        if (drawable == null) {
            return false;
        }
        C62682rn.A02(drawable);
        return false;
    }

    public void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.A06;
        copyBounds(rect);
        if (rect.width() > 0 && rect.height() > 0) {
            ColorFilter colorFilter = this.A02;
            if (colorFilter == null) {
                colorFilter = this.A03;
            }
            Matrix matrix = this.A05;
            canvas.getMatrix(matrix);
            float[] fArr = this.A07;
            matrix.getValues(fArr);
            float abs = Math.abs(fArr[0]);
            float abs2 = Math.abs(fArr[4]);
            float abs3 = Math.abs(fArr[1]);
            float abs4 = Math.abs(fArr[3]);
            if (!(abs3 == 0.0f && abs4 == 0.0f)) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int min = Math.min(EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH, (int) (((float) rect.width()) * abs));
            int min2 = Math.min(EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH, (int) (((float) rect.height()) * abs2));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                canvas.translate((float) rect.left, (float) rect.top);
                if (isAutoMirrored() && C27831Xu.A00(this) == 1) {
                    canvas.translate((float) rect.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                rect.offsetTo(0, 0);
                AnonymousClass26j r1 = this.A00;
                Bitmap bitmap = r1.A04;
                if (!(bitmap != null && min == bitmap.getWidth() && min2 == r1.A04.getHeight())) {
                    r1.A04 = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
                    r1.A0A = true;
                }
                boolean z = this.A01;
                AnonymousClass26j r8 = this.A00;
                if (!z) {
                    r8.A00(min, min2);
                } else if (!(!r8.A0A && r8.A02 == r8.A03 && r8.A06 == r8.A07 && r8.A0B == r8.A09 && r8.A00 == r8.A08.A04)) {
                    r8.A00(min, min2);
                    AnonymousClass26j r12 = this.A00;
                    r12.A02 = r12.A03;
                    r12.A06 = r12.A07;
                    r12.A00 = r12.A08.A04;
                    r12.A0B = r12.A09;
                    r12.A0A = false;
                }
                AnonymousClass26j r6 = this.A00;
                if (r6.A08.A04 < 255 || colorFilter != null) {
                    if (r6.A05 == null) {
                        Paint paint2 = new Paint();
                        r6.A05 = paint2;
                        paint2.setFilterBitmap(true);
                    }
                    r6.A05.setAlpha(r6.A08.A04);
                    r6.A05.setColorFilter(colorFilter);
                    paint = r6.A05;
                } else {
                    paint = null;
                }
                canvas.drawBitmap(r6.A04, (Rect) null, rect, paint);
                canvas.restoreToCount(save);
            }
        }
    }

    public int getAlpha() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return this.A00.A08.A04;
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.A00.A01;
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return C62682rn.A00(drawable);
        }
        return this.A02;
    }

    public Drawable.ConstantState getConstantState() {
        Drawable drawable = this.A00;
        if (drawable != null && Build.VERSION.SDK_INT >= 24) {
            return new AnonymousClass26l(drawable.getConstantState());
        }
        this.A00.A01 = getChangingConfigurations();
        return this.A00;
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.A00.A08.A00;
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.A00.A08.A01;
    }

    public int getOpacity() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int i;
        int i2;
        Drawable drawable = this.A00;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        AttributeSet attributeSet2 = attributeSet;
        Resources.Theme theme2 = theme;
        Resources resources2 = resources;
        if (drawable != null) {
            C62682rn.A01(theme2, resources2, drawable, attributeSet2, xmlPullParser2);
            return;
        }
        AnonymousClass26j r4 = this.A00;
        r4.A08 = new C63612tP();
        TypedArray A042 = C63882tq.A04(theme2, resources2, attributeSet2, C50992Wo.A0A);
        AnonymousClass26j r3 = this.A00;
        C63612tP r10 = r3.A08;
        int A022 = C63882tq.A02(A042, "tintMode", xmlPullParser2, 6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (A022 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (A022 != 5) {
            if (A022 != 9) {
                switch (A022) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        r3.A07 = mode;
        ColorStateList A032 = C63882tq.A03(theme2, A042, xmlPullParser2);
        if (A032 != null) {
            r3.A03 = A032;
        }
        r3.A09 = C63882tq.A06(A042, xmlPullParser2, r3.A09);
        r10.A03 = C63882tq.A00(A042, "viewportWidth", xmlPullParser2, r10.A03, 7);
        float A002 = C63882tq.A00(A042, "viewportHeight", xmlPullParser2, r10.A02, 8);
        r10.A02 = A002;
        if (r10.A03 <= 0.0f) {
            StringBuilder sb = new StringBuilder();
            sb.append(A042.getPositionDescription());
            sb.append("<vector> tag requires viewportWidth > 0");
            throw new XmlPullParserException(sb.toString());
        } else if (A002 > 0.0f) {
            r10.A01 = A042.getDimension(3, r10.A01);
            float dimension = A042.getDimension(2, r10.A00);
            r10.A00 = dimension;
            if (r10.A01 <= 0.0f) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(A042.getPositionDescription());
                sb2.append("<vector> tag requires width > 0");
                throw new XmlPullParserException(sb2.toString());
            } else if (dimension > 0.0f) {
                r10.setAlpha(C63882tq.A00(A042, "alpha", xmlPullParser2, r10.getAlpha(), 4));
                String string = A042.getString(0);
                if (string != null) {
                    r10.A09 = string;
                    r10.A0E.put(string, r10);
                }
                A042.recycle();
                r4.A01 = getChangingConfigurations();
                r4.A0A = true;
                AnonymousClass26j r2 = this.A00;
                C63612tP r1 = r2.A08;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(r1.A0F);
                int eventType = xmlPullParser2.getEventType();
                int depth = xmlPullParser2.getDepth() + 1;
                boolean z = true;
                while (eventType != 1 && (xmlPullParser2.getDepth() >= depth || eventType != 3)) {
                    if (eventType == 2) {
                        String name = xmlPullParser2.getName();
                        C454428z r102 = (C454428z) arrayDeque.peek();
                        if (r102 != null) {
                            if ("path".equals(name)) {
                                C454228x r13 = new C454228x();
                                TypedArray A043 = C63882tq.A04(theme2, resources2, attributeSet2, C50992Wo.A09);
                                r13.A0B = null;
                                if (C63882tq.A07("pathData", xmlPullParser2)) {
                                    String string2 = A043.getString(0);
                                    if (string2 != null) {
                                        r13.A02 = string2;
                                    }
                                    String string3 = A043.getString(2);
                                    if (string3 != null) {
                                        r13.A03 = C63382sy.A03(string3);
                                    }
                                    r13.A09 = C63882tq.A05(theme2, A043, "fillColor", xmlPullParser2, 1);
                                    r13.A00 = C63882tq.A00(A043, "fillAlpha", xmlPullParser2, r13.A00, 12);
                                    int A023 = C63882tq.A02(A043, "strokeLineCap", xmlPullParser2, 8, -1);
                                    Paint.Cap cap = r13.A07;
                                    if (A023 == 0) {
                                        cap = Paint.Cap.BUTT;
                                    } else if (A023 == 1) {
                                        cap = Paint.Cap.ROUND;
                                    } else if (A023 == 2) {
                                        cap = Paint.Cap.SQUARE;
                                    }
                                    r13.A07 = cap;
                                    int A024 = C63882tq.A02(A043, "strokeLineJoin", xmlPullParser2, 9, -1);
                                    Paint.Join join = r13.A08;
                                    if (A024 == 0) {
                                        join = Paint.Join.MITER;
                                    } else if (A024 == 1) {
                                        join = Paint.Join.ROUND;
                                    } else if (A024 == 2) {
                                        join = Paint.Join.BEVEL;
                                    }
                                    r13.A08 = join;
                                    r13.A02 = C63882tq.A00(A043, "strokeMiterLimit", xmlPullParser2, r13.A02, 10);
                                    r13.A0A = C63882tq.A05(theme2, A043, "strokeColor", xmlPullParser2, 3);
                                    r13.A01 = C63882tq.A00(A043, "strokeAlpha", xmlPullParser2, r13.A01, 11);
                                    r13.A03 = C63882tq.A00(A043, "strokeWidth", xmlPullParser2, r13.A03, 4);
                                    r13.A04 = C63882tq.A00(A043, "trimPathEnd", xmlPullParser2, r13.A04, 6);
                                    r13.A05 = C63882tq.A00(A043, "trimPathOffset", xmlPullParser2, r13.A05, 7);
                                    r13.A06 = C63882tq.A00(A043, "trimPathStart", xmlPullParser2, r13.A06, 5);
                                    r13.A01 = C63882tq.A02(A043, "fillType", xmlPullParser2, 13, r13.A01);
                                }
                                A043.recycle();
                                r102.A0C.add(r13);
                                String str = r13.A02;
                                if (str != null) {
                                    r1.A0E.put(str, r13);
                                }
                                r2.A01 = r13.A00 | r2.A01;
                                z = false;
                            } else {
                                if ("clip-path".equals(name)) {
                                    C454328y r132 = new C454328y();
                                    if (C63882tq.A07("pathData", xmlPullParser2)) {
                                        TypedArray A044 = C63882tq.A04(theme2, resources2, attributeSet2, C50992Wo.A07);
                                        String string4 = A044.getString(0);
                                        if (string4 != null) {
                                            r132.A02 = string4;
                                        }
                                        String string5 = A044.getString(1);
                                        if (string5 != null) {
                                            r132.A03 = C63382sy.A03(string5);
                                        }
                                        r132.A01 = C63882tq.A02(A044, "fillType", xmlPullParser2, 2, 0);
                                        A044.recycle();
                                    }
                                    r102.A0C.add(r132);
                                    String str2 = r132.A02;
                                    if (str2 != null) {
                                        r1.A0E.put(str2, r132);
                                    }
                                    i = r2.A01;
                                    i2 = r132.A00;
                                } else if ("group".equals(name)) {
                                    C454428z r11 = new C454428z();
                                    TypedArray A045 = C63882tq.A04(theme2, resources2, attributeSet2, C50992Wo.A08);
                                    r11.A09 = null;
                                    r11.A02 = C63882tq.A00(A045, "rotation", xmlPullParser2, r11.A02, 5);
                                    r11.A00 = A045.getFloat(1, r11.A00);
                                    r11.A01 = A045.getFloat(2, r11.A01);
                                    r11.A03 = C63882tq.A00(A045, "scaleX", xmlPullParser2, r11.A03, 3);
                                    r11.A04 = C63882tq.A00(A045, "scaleY", xmlPullParser2, r11.A04, 4);
                                    r11.A05 = C63882tq.A00(A045, "translateX", xmlPullParser2, r11.A05, 6);
                                    r11.A06 = C63882tq.A00(A045, "translateY", xmlPullParser2, r11.A06, 7);
                                    String string6 = A045.getString(0);
                                    if (string6 != null) {
                                        r11.A08 = string6;
                                    }
                                    C454428z.A00(r11);
                                    A045.recycle();
                                    r102.A0C.add(r11);
                                    arrayDeque.push(r11);
                                    String str3 = r11.A08;
                                    if (str3 != null) {
                                        r1.A0E.put(str3, r11);
                                    }
                                    i = r2.A01;
                                    i2 = r11.A07;
                                }
                                r2.A01 = i2 | i;
                            }
                        }
                    } else if (eventType == 3 && "group".equals(xmlPullParser2.getName())) {
                        arrayDeque.pop();
                    }
                    eventType = xmlPullParser2.next();
                }
                if (!z) {
                    this.A03 = A02(r4.A03, r4.A07);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(A042.getPositionDescription());
                sb3.append("<vector> tag requires height > 0");
                throw new XmlPullParserException(sb3.toString());
            }
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(A042.getPositionDescription());
            sb4.append("<vector> tag requires viewportHeight > 0");
            throw new XmlPullParserException(sb4.toString());
        }
    }

    public void invalidateSelf() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.isAutoMirrored();
        }
        return this.A00.A09;
    }

    public boolean isStateful() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        AnonymousClass26j r0 = this.A00;
        if (r0 == null) {
            return false;
        }
        C63612tP r1 = r0.A08;
        Boolean bool = r1.A08;
        if (bool == null) {
            bool = Boolean.valueOf(r1.A0F.A01());
            r1.A08 = bool;
        }
        if (bool.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.A00.A03;
        if (colorStateList == null || !colorStateList.isStateful()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [android.graphics.drawable.Drawable$ConstantState, X.26j] */
    public Drawable mutate() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.mutate();
        } else if (!this.A04 && super.mutate() == this) {
            AnonymousClass26j r4 = this.A00;
            ? constantState = new Drawable.ConstantState();
            constantState.A03 = null;
            constantState.A07 = A08;
            if (r4 != null) {
                constantState.A01 = r4.A01;
                C63612tP r2 = new C63612tP(r4.A08);
                constantState.A08 = r2;
                Paint paint = r4.A08.A05;
                if (paint != null) {
                    r2.A05 = new Paint(paint);
                }
                Paint paint2 = r4.A08.A06;
                if (paint2 != null) {
                    constantState.A08.A06 = new Paint(paint2);
                }
                constantState.A03 = r4.A03;
                constantState.A07 = r4.A07;
                constantState.A09 = r4.A09;
            }
            this.A00 = constantState;
            this.A04 = true;
            return this;
        }
        return this;
    }

    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    public boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        AnonymousClass26j r4 = this.A00;
        ColorStateList colorStateList = r4.A03;
        if (colorStateList == null || (mode = r4.A07) == null) {
            z = false;
        } else {
            this.A03 = A02(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        C63612tP r1 = r4.A08;
        Boolean bool = r1.A08;
        if (bool == null) {
            bool = Boolean.valueOf(r1.A0F.A01());
            r1.A08 = bool;
        }
        if (bool.booleanValue()) {
            boolean A022 = r4.A08.A0F.A02(iArr);
            r4.A0A |= A022;
            if (A022) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    public void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    public void setAlpha(int i) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setAlpha(i);
            return;
        }
        C63612tP r1 = this.A00.A08;
        if (r1.A04 != i) {
            r1.A04 = i;
            invalidateSelf();
        }
    }

    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.A00.A09 = z;
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.A02 = colorFilter;
        invalidateSelf();
    }

    public void setTint(int i) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            C27831Xu.A0D(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            C27831Xu.A04(colorStateList, drawable);
            return;
        }
        AnonymousClass26j r1 = this.A00;
        if (r1.A03 != colorStateList) {
            r1.A03 = colorStateList;
            this.A03 = A02(colorStateList, r1.A07);
            invalidateSelf();
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            C27831Xu.A08(mode, drawable);
            return;
        }
        AnonymousClass26j r1 = this.A00;
        if (r1.A07 != mode) {
            r1.A07 = mode;
            this.A03 = A02(r1.A03, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        return super.setVisible(z, z2);
    }

    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    public C24291Jp(AnonymousClass26j r3) {
        this.A01 = true;
        this.A07 = new float[9];
        this.A05 = new Matrix();
        this.A06 = new Rect();
        this.A00 = r3;
        this.A03 = A02(r3.A03, r3.A07);
    }

    public C24291Jp() {
        this.A01 = true;
        this.A07 = new float[9];
        this.A05 = new Matrix();
        this.A06 = new Rect();
        this.A00 = new AnonymousClass26j();
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
        }
    }
}
