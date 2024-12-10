package X;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: X.0NX  reason: invalid class name */
public final class AnonymousClass0NX {
    public int A00 = 0;
    public final XmlPullParser A01;

    public AnonymousClass0NX(XmlPullParser xmlPullParser) {
        this.A01 = xmlPullParser;
    }

    public final boolean A06(TypedArray typedArray) {
        boolean A06 = C63882tq.A06(typedArray, this.A01, false);
        A00(typedArray, this);
        return A06;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass0NX) {
                AnonymousClass0NX r5 = (AnonymousClass0NX) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final float A01(TypedArray typedArray, String str, float f, int i) {
        float A002 = C63882tq.A00(typedArray, str, this.A01, f, i);
        A00(typedArray, this);
        return A002;
    }

    public final int A02(TypedArray typedArray, String str, int i, int i2) {
        int A02 = C63882tq.A02(typedArray, str, this.A01, i, i2);
        A00(typedArray, this);
        return A02;
    }

    public final ColorStateList A03(Resources.Theme theme, TypedArray typedArray) {
        ColorStateList A03 = C63882tq.A03(theme, typedArray, this.A01);
        A00(typedArray, this);
        return A03;
    }

    public final C59202lv A05(Resources.Theme theme, TypedArray typedArray, String str, int i) {
        C59202lv A05 = C63882tq.A05(theme, typedArray, str, this.A01, i);
        A00(typedArray, this);
        return A05;
    }

    public int hashCode() {
        return AnonymousClass000.A0L(this.A01) + this.A00;
    }

    public static void A00(TypedArray typedArray, AnonymousClass0NX r2) {
        r2.A00 = typedArray.getChangingConfigurations() | r2.A00;
    }

    public final TypedArray A04(Resources.Theme theme, Resources resources, AttributeSet attributeSet, int[] iArr) {
        TypedArray A04 = C63882tq.A04(theme, resources, attributeSet, iArr);
        A00(A04, this);
        return A04;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AndroidVectorParser(xmlParser=");
        A10.append(this.A01);
        A10.append(", config=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
