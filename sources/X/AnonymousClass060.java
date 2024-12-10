package X;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: X.060  reason: invalid class name */
public class AnonymousClass060 extends AnonymousClass061 implements C24271Jn {
    public AnonymousClass062 A00;
    public int A01;
    public int A02;
    public C02150Cx A03;
    public boolean A04;

    private void A03(Context context, Resources.Theme theme, Resources resources, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        Drawable drawable;
        Drawable drawable2;
        int next;
        TypedArray A042 = C63882tq.A04(theme, resources, attributeSet, AnonymousClass0GY.A01);
        int resourceId = A042.getResourceId(0, 0);
        int resourceId2 = A042.getResourceId(1, -1);
        if (resourceId2 > 0) {
            drawable = AnonymousClass02D.A03().A09(context, resourceId2);
        } else {
            drawable = null;
        }
        A042.recycle();
        int attributeCount = attributeSet.getAttributeCount();
        int[] iArr = new int[attributeCount];
        int i = 0;
        for (int i2 = 0; i2 < attributeCount; i2++) {
            int attributeNameResource = attributeSet.getAttributeNameResource(i2);
            if (!(attributeNameResource == 0 || attributeNameResource == 16842960 || attributeNameResource == 16843161)) {
                int i3 = i + 1;
                if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                    attributeNameResource = -attributeNameResource;
                }
                iArr[i] = attributeNameResource;
                i = i3;
            }
        }
        int[] trimStateSet = StateSet.trimStateSet(iArr, i);
        if (drawable2 == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next == 2) {
                if (xmlPullParser.getName().equals("vector")) {
                    drawable2 = C24291Jp.A01(theme, resources, attributeSet, xmlPullParser);
                } else {
                    drawable2 = A01(resources, xmlPullParser, attributeSet, theme);
                }
                if (drawable2 == null) {
                    throw new XmlPullParserException(AnonymousClass001.A1H(xmlPullParser.getPositionDescription(), ": <item> tag requires a 'drawable' attribute or child tag defining a drawable", AnonymousClass000.A10()));
                }
            } else {
                throw new XmlPullParserException(AnonymousClass001.A1H(xmlPullParser.getPositionDescription(), ": <item> tag requires a 'drawable' attribute or child tag defining a drawable", AnonymousClass000.A10()));
            }
        }
        AnonymousClass062 r1 = this.A00;
        int A022 = r1.A02(drawable2);
        r1.A00[A022] = trimStateSet;
        r1.A01.A02(A022, Integer.valueOf(resourceId));
    }

    private void A04(Context context, Resources.Theme theme, Resources resources, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        Drawable drawable;
        Drawable drawable2;
        long j;
        int next;
        Resources.Theme theme2 = theme;
        Resources resources2 = resources;
        AttributeSet attributeSet2 = attributeSet;
        TypedArray A042 = C63882tq.A04(theme2, resources2, attributeSet2, AnonymousClass0GY.A02);
        int resourceId = A042.getResourceId(2, -1);
        int resourceId2 = A042.getResourceId(1, -1);
        int resourceId3 = A042.getResourceId(0, -1);
        Context context2 = context;
        if (resourceId3 > 0) {
            drawable = AnonymousClass02D.A03().A09(context2, resourceId3);
        } else {
            drawable = null;
        }
        boolean z = A042.getBoolean(3, false);
        A042.recycle();
        XmlPullParser xmlPullParser2 = xmlPullParser;
        if (drawable2 == null) {
            do {
                next = xmlPullParser2.next();
            } while (next == 4);
            if (next == 2) {
                if (xmlPullParser2.getName().equals("animated-vector")) {
                    drawable2 = C454028v.A04(context2, theme2, resources2, attributeSet2, xmlPullParser2);
                } else {
                    drawable2 = A01(resources2, xmlPullParser2, attributeSet2, theme2);
                }
                if (drawable2 == null) {
                    throw new XmlPullParserException(AnonymousClass001.A1H(xmlPullParser2.getPositionDescription(), ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable", AnonymousClass000.A10()));
                }
            } else {
                throw new XmlPullParserException(AnonymousClass001.A1H(xmlPullParser2.getPositionDescription(), ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable", AnonymousClass000.A10()));
            }
        }
        if (resourceId == -1 || resourceId2 == -1) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append(xmlPullParser2.getPositionDescription());
            throw new XmlPullParserException(AnonymousClass000.A0y(": <transition> tag requires 'fromId' & 'toId' attributes", A10));
        }
        AnonymousClass062 r14 = this.A00;
        int A022 = r14.A02(drawable2);
        long j2 = (long) resourceId;
        long j3 = (long) resourceId2;
        long j4 = j3 | (j2 << 32);
        if (z) {
            j = 8589934592L;
        } else {
            j = 0;
        }
        long j5 = (long) A022;
        r14.A00.A09(j4, Long.valueOf(j5 | j));
        if (z) {
            r14.A00.A09(j2 | (j3 << 32), Long.valueOf(j5 | 4294967296L | j));
        }
    }

    private boolean A05(int i) {
        int i2;
        C02150Cx r0;
        Object obj;
        Object obj2;
        C02150Cx r1 = this.A03;
        if (r1 != null) {
            i2 = this.A02;
            if (i != i2) {
                if (i != this.A01 || !r1.A04()) {
                    r1.A03();
                } else {
                    r1.A01();
                    this.A02 = this.A01;
                    this.A01 = i;
                }
            }
            return true;
        }
        i2 = this.A00;
        this.A03 = null;
        this.A01 = -1;
        this.A02 = -1;
        AnonymousClass062 r4 = this.A00;
        int i3 = 0;
        if (i2 >= 0) {
            AnonymousClass04B r3 = r4.A01;
            int i4 = 0;
            int A002 = AnonymousClass00Q.A00(r3.A01, r3.A00, i2);
            if (A002 >= 0 && (obj2 = r3.A02[A002]) != AnonymousClass0LW.A00) {
                i4 = obj2;
            }
            i3 = AnonymousClass000.A0M(i4);
        }
        int i5 = 0;
        if (i >= 0) {
            AnonymousClass04B r32 = r4.A01;
            int i6 = 0;
            int A003 = AnonymousClass00Q.A00(r32.A01, r32.A00, i);
            if (A003 >= 0 && (obj = r32.A02[A003]) != AnonymousClass0LW.A00) {
                i6 = obj;
            }
            i5 = AnonymousClass000.A0M(i6);
        }
        if (!(i5 == 0 || i3 == 0)) {
            long j = ((long) i5) | (((long) i3) << 32);
            int longValue = (int) ((Number) r4.A00.A06(-1L, j)).longValue();
            if (longValue >= 0) {
                boolean A1O = AnonymousClass000.A1O(((((Number) r4.A00.A06(-1L, j)).longValue() & 8589934592L) > 0 ? 1 : ((((Number) r4.A00.A06(-1L, j)).longValue() & 8589934592L) == 0 ? 0 : -1)));
                A07(longValue);
                Drawable drawable = this.A01;
                if (drawable instanceof AnimationDrawable) {
                    r0 = new AnonymousClass05z((AnimationDrawable) drawable, AnonymousClass000.A1O(((((Number) r4.A00.A06(-1L, j)).longValue() & 4294967296L) > 0 ? 1 : ((((Number) r4.A00.A06(-1L, j)).longValue() & 4294967296L) == 0 ? 0 : -1))), A1O);
                } else if (drawable instanceof C454028v) {
                    r0 = new AnonymousClass05y((C454028v) drawable);
                } else if (drawable instanceof Animatable) {
                    r0 = new C010205x((Animatable) drawable);
                }
                r0.A02();
                this.A03 = r0;
                this.A01 = i2;
                this.A02 = i;
                return true;
            }
        }
        return false;
    }

    public /* bridge */ /* synthetic */ AnonymousClass04Q A08() {
        return new AnonymousClass062((Resources) null, this.A00, this);
    }

    public /* bridge */ /* synthetic */ AnonymousClass063 A0A() {
        return new AnonymousClass062((Resources) null, this.A00, this);
    }

    public void A0C(Context context, Resources.Theme theme, Resources resources, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        int depth;
        TypedArray A042 = C63882tq.A04(theme, resources, attributeSet, AnonymousClass0GY.A00);
        setVisible(A042.getBoolean(1, true), true);
        AnonymousClass062 r3 = this.A00;
        r3.A00 |= A00(A042);
        r3.A0W = A042.getBoolean(2, r3.A0W);
        r3.A0P = A042.getBoolean(3, r3.A0P);
        r3.A07 = A042.getInt(4, r3.A07);
        r3.A08 = A042.getInt(5, r3.A08);
        setDither(A042.getBoolean(0, r3.A0Q));
        this.A02.A08(resources);
        A042.recycle();
        int depth2 = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                onStateChange(getState());
            } else if (next == 2 && depth <= depth2) {
                if (xmlPullParser.getName().equals("item")) {
                    A03(context, theme, resources, attributeSet, xmlPullParser);
                } else if (xmlPullParser.getName().equals("transition")) {
                    A04(context, theme, resources, attributeSet, xmlPullParser);
                }
            }
        }
        onStateChange(getState());
    }

    public Drawable mutate() {
        if (!this.A04) {
            super.mutate();
            this.A00.A05();
            this.A04 = true;
        }
        return this;
    }

    public boolean onStateChange(int[] iArr) {
        boolean z;
        int A0B = this.A00.A0B(iArr);
        if (A0B == this.A00 || (!A05(A0B) && !A07(A0B))) {
            z = false;
        } else {
            z = true;
        }
        Drawable drawable = this.A01;
        if (drawable != null) {
            return z | drawable.setState(iArr);
        }
        return z;
    }

    public AnonymousClass060(Resources resources, AnonymousClass062 r3) {
        this.A02 = -1;
        this.A01 = -1;
        A09(new AnonymousClass062(resources, r3, this));
        onStateChange(getState());
        jumpToCurrentState();
    }

    public static int A00(TypedArray typedArray) {
        return typedArray.getChangingConfigurations();
    }

    public static Drawable A01(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        return Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
    }

    public static AnonymousClass060 A02(Context context, Resources.Theme theme, Resources resources, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            AnonymousClass060 r2 = new AnonymousClass060((Resources) null, (AnonymousClass062) null);
            r2.A0C(context, theme, resources, attributeSet, xmlPullParser);
            return r2;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(xmlPullParser.getPositionDescription());
        throw new XmlPullParserException(AnonymousClass001.A1H(": invalid animated-selector tag ", name, A10));
    }

    public void A09(AnonymousClass04Q r2) {
        super.A09(r2);
        if (r2 instanceof AnonymousClass062) {
            this.A00 = (AnonymousClass062) r2;
        }
    }

    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        C02150Cx r0 = this.A03;
        if (r0 != null) {
            r0.A03();
            this.A03 = null;
            A07(this.A02);
            this.A02 = -1;
            this.A01 = -1;
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        C02150Cx r0 = this.A03;
        if (r0 != null && (visible || z2)) {
            if (z) {
                r0.A02();
            } else {
                jumpToCurrentState();
                return visible;
            }
        }
        return visible;
    }

    public AnonymousClass060() {
        this((Resources) null, (AnonymousClass062) null);
    }
}
