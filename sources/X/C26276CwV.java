package X;

import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.MetricAffectingSpan;
import android.text.style.TypefaceSpan;
import android.util.TypedValue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.CwV  reason: case insensitive filesystem */
public final class C26276CwV {
    public static final C26276CwV A00 = new Object();

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r6 == 16917) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C24949CQz A02(X.DOZ r7, X.DFL r8, X.DFL r9, X.DFL r10, int r11, int r12, boolean r13) {
        /*
            r5 = r10
            int r6 = r10.A05
            r0 = 16891(0x41fb, float:2.367E-41)
            if (r6 == r0) goto L_0x000c
            r0 = 16917(0x4215, float:2.3706E-41)
            r10 = 0
            if (r6 != r0) goto L_0x000d
        L_0x000c:
            r10 = 1
        L_0x000d:
            X.CXP r1 = new X.CXP
            r2 = r7
            r4 = r8
            r3 = r9
            r7 = r11
            r8 = r12
            r9 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            X.CQz r0 = new X.CQz
            r0.<init>(r1, r11, r12, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26276CwV.A02(X.DOZ, X.DFL, X.DFL, X.DFL, int, int, boolean):X.CQz");
    }

    public static final CP1 A04(DOZ doz, DFL dfl, List list, boolean z) {
        DOZ doz2 = doz;
        List list2 = list;
        C18070vi.A0h(list, doz);
        C26276CwV cwV = A00;
        DFL dfl2 = dfl;
        if (!z) {
            return A03(doz, dfl, list);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        StringBuilder A10 = AnonymousClass000.A10();
        ArrayList A05 = cwV.A05(spannableStringBuilder, doz2, dfl2, A10, list2);
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it = A05.iterator();
        while (it.hasNext()) {
            C24949CQz cQz = (C24949CQz) it.next();
            if (cQz.A03) {
                A13.add(cQz);
            } else {
                cQz.A02.A00((Layout) null, spannableStringBuilder, cQz, -1, -1);
            }
        }
        return new CP1(spannableStringBuilder, C18070vi.A0H(A10), A13);
    }

    public static final void A06(Spannable spannable, DOZ doz, String str, int i, int i2) {
        if (str != null) {
            try {
                spannable.setSpan(new AbsoluteSizeSpan((int) TypedValue.applyDimension(2, A90.A02(str), C108965cb.A08(doz.A00))), i, i2, 0);
            } catch (AnonymousClass9HX e) {
                C25913CoX.A00(doz, "TextNodeUtils:TextSpan:size-parsing", "Error parsing TextSpan size", e);
            }
        }
    }

    public static final void A07(Spannable spannable, DOZ doz, String str, String str2, int i, int i2) {
        Typeface typeface;
        if (str != null) {
            typeface = C25995CqB.A00().A02.A00(doz.A00, str);
        } else {
            typeface = null;
        }
        if (str2 != null) {
            try {
                typeface = AnonymousClass9OS.A00(doz.A00, typeface, str2, str);
            } catch (AnonymousClass9HX e) {
                C25913CoX.A00(doz, "TextNodeUtils:TextSpan:text-style-parsing", "Error parsing TextSpan textStyle", e);
            }
        }
        if (typeface != null) {
            spannable.setSpan(A00(typeface), i, i2, 0);
        }
    }

    public static final boolean A08(Spannable spannable, DOZ doz, DFL dfl, DFL dfl2, String str, String str2, String str3, int i, int i2, boolean z) {
        String str4;
        String str5;
        Rect A07;
        int hashCode;
        if (!(str == null || str2 == null)) {
            DFL dfl3 = dfl;
            if (dfl != null) {
                DOZ doz2 = doz;
                try {
                    float A01 = A90.A01(str);
                    try {
                        float A012 = A90.A01(str2);
                        if (!(A012 == 0.0f || A01 == 0.0f)) {
                            DFL dfl4 = dfl2;
                            if (dfl2 != null) {
                                int A002 = (int) CC7.A00(dfl4, 42);
                                int A003 = (int) CC7.A00(dfl4, 40);
                                int A004 = (int) CC7.A00(dfl4, 41);
                                int A005 = (int) CC7.A00(dfl4, 35);
                                int A006 = (int) CC7.A00(dfl4, 36);
                                int A007 = (int) CC7.A00(dfl4, 38);
                                if (CC8.A00(doz.A00)) {
                                    if (A004 == 0) {
                                        A004 = A006;
                                    }
                                    if (A002 == 0) {
                                        A002 = A007;
                                    }
                                    A07 = new Rect(A004, A003, A002, A005);
                                } else {
                                    if (A002 == 0) {
                                        A002 = A006;
                                    }
                                    if (A004 == 0) {
                                        A004 = A007;
                                    }
                                    A07 = new Rect(A002, A003, A004, A005);
                                }
                            } else {
                                A07 = AnonymousClass3MW.A07();
                            }
                            if (doz.A02.A01.BSo() != null) {
                                int i3 = 1;
                                String str6 = str3;
                                if (!(str3 == null || (hashCode = str6.hashCode()) == -1720785339)) {
                                    if (hashCode != -1383228885) {
                                        if (hashCode == -1364013995 && str6.equals("center")) {
                                            i3 = 2;
                                        }
                                    } else if (str6.equals("bottom")) {
                                        i3 = 0;
                                    }
                                }
                                C22831BRj bRj = new C22831BRj(A07, doz2, dfl3, z ? 1 : 0, i3);
                                int i4 = (int) A01;
                                int i5 = (int) A012;
                                int i6 = i2;
                                if (i6 > spannable.length()) {
                                    return true;
                                }
                                E4Q e4q = bRj.A03;
                                C18070vi.A0z(e4q, "null cannot be cast to non-null type android.graphics.drawable.Drawable");
                                ((Drawable) e4q).setBounds(0, 0, i4, i5);
                                bRj.A00 = null;
                                spannable.setSpan(bRj, i, i6, 33);
                                return true;
                            }
                        }
                        return false;
                    } catch (AnonymousClass9HX e) {
                        e = e;
                        str4 = "Error parsing image height";
                        str5 = "TextNodeUtils:ImageSpan:img-height-parsing";
                        C25913CoX.A00(doz, str5, str4, e);
                        return false;
                    }
                } catch (AnonymousClass9HX e2) {
                    e = e2;
                    str4 = "Error parsing image width";
                    str5 = "TextNodeUtils:ImageSpan:img-width-parsing";
                    C25913CoX.A00(doz, str5, str4, e);
                    return false;
                }
            }
        }
        C25913CoX.A01("TextNodeUtils:ImageSpan:invalid-attributes", "Invalid image span attributes specified.");
        return false;
    }

    public static final MetricAffectingSpan A00(Typeface typeface) {
        if (Build.VERSION.SDK_INT >= 28) {
            return A01(typeface);
        }
        return new BGg(typeface);
    }

    public static final TypefaceSpan A01(Typeface typeface) {
        return new TypefaceSpan(typeface);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x006d, code lost:
        if (X.BE7.A0d(r0) != null) goto L_0x006f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0182  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.CP1 A03(X.DOZ r22, X.DFL r23, java.util.List r24) {
        /*
            android.text.SpannableStringBuilder r12 = new android.text.SpannableStringBuilder
            r12.<init>()
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()
            java.util.Iterator r11 = r24.iterator()
        L_0x000d:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x01be
            X.DFL r0 = X.BE6.A0d(r11)
            int r2 = r12.length()
            r1 = 59
            X.DFL r1 = r0.A09(r1)
            boolean r6 = X.AnonymousClass000.A1W(r1)
            r1 = 41
            X.DFL r5 = r0.A09(r1)
            java.lang.String r3 = ""
            java.lang.String r1 = X.BE7.A0f(r0)
            if (r1 == 0) goto L_0x0034
            r3 = r1
        L_0x0034:
            if (r6 == 0) goto L_0x01b3
            java.lang.String r3 = " "
        L_0x0038:
            r12.append(r3)
            int r1 = r12.length()
            r13 = r22
            if (r6 == 0) goto L_0x00ee
            r5 = 62
            java.lang.String r16 = r0.A0D(r5)
            r5 = 61
            java.lang.String r17 = r0.A0D(r5)
            r5 = 59
            X.DFL r14 = r0.A09(r5)
            r5 = 68
            java.lang.String r18 = r0.A0D(r5)
            r5 = 69
            X.DFL r15 = r0.A09(r5)
            java.lang.String r5 = X.BE7.A0i(r0)
            if (r5 != 0) goto L_0x006f
            java.lang.String r5 = X.BE7.A0d(r0)
            r21 = 0
            if (r5 == 0) goto L_0x0071
        L_0x006f:
            r21 = 1
        L_0x0071:
            r19 = r2
            r20 = r1
            boolean r5 = A08(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            if (r5 == 0) goto L_0x009d
            java.lang.String r5 = X.BE7.A0i(r0)
            A06(r12, r13, r5, r2, r1)
            java.lang.String r8 = X.BE7.A0d(r0)
            r7 = 0
            if (r8 == 0) goto L_0x009d
            android.content.Context r6 = r13.A00
            X.CqB r5 = X.C25995CqB.A00()
            X.C5r r5 = r5.A02
            android.graphics.Typeface r6 = r5.A00(r6, r8)
            X.BGg r5 = new X.BGg
            r5.<init>(r6)
            r12.setSpan(r5, r2, r1, r7)
        L_0x009d:
            r5 = 66
            java.lang.String r19 = r0.A0D(r5)
            r5 = 67
            java.lang.String r20 = r0.A0D(r5)
            r5 = 36
            X.E8A r18 = r0.A0A(r5)
            r6 = 0
            r16 = r23
            if (r18 == 0) goto L_0x00c1
            X.BVG r14 = new X.BVG
            r15 = r13
            r17 = r0
            r21 = r6
            r14.<init>(r15, r16, r17, r18, r19, r20, r21)
            r12.setSpan(r14, r2, r1, r6)
        L_0x00c1:
            r5 = 57
            X.E8A r18 = r0.A0A(r5)
            if (r18 == 0) goto L_0x00d6
            r21 = 1
            X.BVG r14 = new X.BVG
            r15 = r13
            r17 = r0
            r14.<init>(r15, r16, r17, r18, r19, r20, r21)
            r12.setSpan(r14, r2, r1, r6)
        L_0x00d6:
            r1 = 66
            java.lang.String r1 = r0.A0D(r1)
            if (r1 == 0) goto L_0x00e9
            int r0 = r1.length()
            if (r0 == 0) goto L_0x00e9
            r4.append(r1)
            goto L_0x000d
        L_0x00e9:
            r4.append(r3)
            goto L_0x000d
        L_0x00ee:
            r5 = 44
            X.DFL r6 = r0.A09(r5)
            java.lang.String r5 = X.BE7.A0g(r0)
            if (r6 == 0) goto L_0x019d
            int r5 = X.C25340Cdz.A00(r13, r6)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
        L_0x0102:
            if (r5 == 0) goto L_0x0111
            int r5 = r5.intValue()
            android.text.style.ForegroundColorSpan r6 = new android.text.style.ForegroundColorSpan
            r6.<init>(r5)
            r5 = 0
            r12.setSpan(r6, r2, r1, r5)
        L_0x0111:
            java.lang.String r5 = X.BE7.A0i(r0)
            A06(r12, r13, r5, r2, r1)
            java.lang.String r7 = X.BE7.A0d(r0)
            r5 = 43
            java.lang.String r8 = r0.A0D(r5)
            r6 = r13
            r5 = r12
            r9 = r2
            r10 = r1
            A07(r5, r6, r7, r8, r9, r10)
            r5 = 45
            r6 = 0
            boolean r5 = r0.A0I(r5, r6)
            if (r5 == 0) goto L_0x013a
            android.text.style.StrikethroughSpan r5 = new android.text.style.StrikethroughSpan
            r5.<init>()
            r12.setSpan(r5, r2, r1, r6)
        L_0x013a:
            r5 = 52
            boolean r5 = r0.A0I(r5, r6)
            if (r5 == 0) goto L_0x014a
            android.text.style.UnderlineSpan r5 = new android.text.style.UnderlineSpan
            r5.<init>()
            r12.setSpan(r5, r2, r1, r6)
        L_0x014a:
            r5 = 56
            r6 = 0
            float r10 = r0.A03(r5, r6)
            r5 = 54
            float r9 = r0.A03(r5, r6)
            r5 = 55
            float r7 = r0.A03(r5, r6)
            r5 = 53
            X.DFL r6 = r0.A09(r5)
            r8 = 0
            r5 = 0
            int r5 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r5 <= 0) goto L_0x0177
            if (r6 == 0) goto L_0x019b
            int r6 = X.C25340Cdz.A01(r13, r6, r8)
        L_0x016f:
            X.BGS r5 = new X.BGS
            r5.<init>(r10, r9, r7, r6)
            r12.setSpan(r5, r2, r1, r8)
        L_0x0177:
            r6 = 49
            r5 = 1
            float r7 = r0.A03(r6, r5)
            int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r5 == 0) goto L_0x009d
            X.CqB r5 = X.C25995CqB.A00()
            android.content.Context r5 = r5.A00
            X.C18070vi.A0X(r5)
            android.util.DisplayMetrics r5 = X.C108965cb.A08(r5)
            float r6 = r5.scaledDensity
            X.BGh r5 = new X.BGh
            r5.<init>(r7, r6)
            r12.setSpan(r5, r2, r1, r8)
            goto L_0x009d
        L_0x019b:
            r6 = 0
            goto L_0x016f
        L_0x019d:
            if (r5 == 0) goto L_0x0111
            int r5 = X.A90.A04(r5)     // Catch:{ 9HX -> 0x01a9 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ 9HX -> 0x01a9 }
            goto L_0x0102
        L_0x01a9:
            r7 = move-exception
            java.lang.String r6 = "Error parsing TextSpan color"
            java.lang.String r5 = "TextNodeUtils:TextSpan:color-parsing"
            X.C25913CoX.A00(r13, r5, r6, r7)
            goto L_0x0111
        L_0x01b3:
            if (r5 == 0) goto L_0x01b9
            java.lang.String r3 = X.CBz.A00(r5)
        L_0x01b9:
            X.C18070vi.A0b(r3)
            goto L_0x0038
        L_0x01be:
            java.lang.String r2 = X.C18070vi.A0H(r4)
            X.0wS r1 = X.C18460wS.A00
            X.CP1 r0 = new X.CP1
            r0.<init>(r12, r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26276CwV.A03(X.DOZ, X.DFL, java.util.List):X.CP1");
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [java.lang.String] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.ArrayList A05(android.text.SpannableStringBuilder r21, X.DOZ r22, X.DFL r23, java.lang.StringBuilder r24, java.util.List r25) {
        /*
            r20 = this;
            java.util.ArrayList r1 = X.AnonymousClass000.A13()
            java.util.Iterator r8 = r25.iterator()
        L_0x0008:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00e9
            X.DFL r11 = X.BE6.A0d(r8)
            int r2 = r11.A05
            r0 = 16887(0x41f7, float:2.3664E-41)
            r9 = r22
            r10 = r23
            r15 = r21
            r4 = r24
            if (r2 != r0) goto L_0x0063
            java.util.ArrayList r2 = X.AnonymousClass000.A13()
            java.lang.StringBuilder r5 = X.AnonymousClass000.A10()
            java.lang.String r7 = X.BE7.A0d(r11)
            r0 = 36
            java.util.List r19 = X.BE7.A0s(r11, r0)
            int r13 = r15.length()
            r14 = r20
            r16 = r9
            r17 = r10
            r18 = r5
            java.util.ArrayList r6 = r14.A05(r15, r16, r17, r18, r19)
            int r14 = r15.length()
            r0 = 38
            java.util.List r0 = X.BE7.A0s(r11, r0)
            java.util.Iterator r3 = r0.iterator()
        L_0x0050:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00d9
            X.DFL r12 = X.BE6.A0d(r3)
            r15 = 0
            X.CQz r0 = A02(r9, r10, r11, r12, r13, r14, r15)
            r2.add(r0)
            goto L_0x0050
        L_0x0063:
            r0 = 16898(0x4202, float:2.3679E-41)
            if (r2 != r0) goto L_0x00d1
            r6 = 1
            r2 = 0
        L_0x0069:
            java.lang.String r5 = ""
            if (r6 == 0) goto L_0x00c0
            java.lang.String r5 = " "
        L_0x006f:
            int r13 = r15.length()
            r15.append(r5)
            int r14 = r15.length()
            r0 = 35
            if (r6 == 0) goto L_0x0080
            r0 = 44
        L_0x0080:
            java.lang.String r2 = r11.A0D(r0)
            if (r2 == 0) goto L_0x008d
            int r0 = r2.length()
            if (r0 == 0) goto L_0x008d
            r5 = r2
        L_0x008d:
            r0 = 36
            if (r6 == 0) goto L_0x0093
            r0 = 43
        L_0x0093:
            java.util.List r3 = X.BE7.A0s(r11, r0)
            r4.append(r5)
            java.util.ArrayList r2 = X.AnonymousClass000.A13()
            if (r6 == 0) goto L_0x00a9
            r15 = 1
            r12 = r11
            X.CQz r0 = A02(r9, r10, r11, r12, r13, r14, r15)
            r2.add(r0)
        L_0x00a9:
            java.util.Iterator r3 = r3.iterator()
        L_0x00ad:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00e4
            X.DFL r12 = X.BE6.A0d(r3)
            r15 = 0
            X.CQz r0 = A02(r9, r10, r11, r12, r13, r14, r15)
            r2.add(r0)
            goto L_0x00ad
        L_0x00c0:
            java.lang.String r0 = X.BE7.A0f(r11)
            if (r0 == 0) goto L_0x00c7
            r5 = r0
        L_0x00c7:
            if (r2 == 0) goto L_0x00cd
            java.lang.String r5 = X.CBz.A00(r2)
        L_0x00cd:
            X.C18070vi.A0b(r5)
            goto L_0x006f
        L_0x00d1:
            r6 = 0
            r0 = 40
            X.DFL r2 = r11.A09(r0)
            goto L_0x0069
        L_0x00d9:
            r2.addAll(r6)
            if (r7 == 0) goto L_0x00df
            r5 = r7
        L_0x00df:
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r4.append(r5)
        L_0x00e4:
            r1.addAll(r2)
            goto L_0x0008
        L_0x00e9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26276CwV.A05(android.text.SpannableStringBuilder, X.DOZ, X.DFL, java.lang.StringBuilder, java.util.List):java.util.ArrayList");
    }
}
