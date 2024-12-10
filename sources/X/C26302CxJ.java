package X;

import android.content.Context;
import android.graphics.Paint;
import android.net.Uri;
import android.text.Editable;
import android.text.Html;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.TextEmojiLabel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.CxJ  reason: case insensitive filesystem */
public abstract class C26302CxJ {
    public static final CharSequence A00 = ". ";
    public static final HashMap A01 = new C27323Dbu(4);

    public static SpannableStringBuilder A02(CharSequence charSequence, float f, int i, int i2, boolean z) {
        CharSequence charSequence2 = charSequence;
        if (charSequence == null) {
            return null;
        }
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence2);
        int i3 = i2;
        List list = (List) A07((C18030ve) null, (C25807CmK) null, charSequence2, i3, false).A00;
        A0R(valueOf, A0I((TextPaint) null, new C25807CmK(-16777216, 0, 0, false, false, false, false, false), charSequence2, list, f, i3, false), list);
        A0Q(valueOf, list, i, z);
        return valueOf;
    }

    public static CharSequence A0C(AnonymousClass11C r2, C18010vc r3, CharSequence charSequence) {
        return A0D(r2, r3, charSequence, -16777216, false);
    }

    public static CharSequence A0E(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        List<C25954CpM> list = (List) A07((C18030ve) null, (C25807CmK) null, charSequence, 150, false).A00;
        SpannableStringBuilder spannableStringBuilder = charSequence;
        if (!list.isEmpty()) {
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
            for (C25954CpM cpM : list) {
                int i = cpM.A00;
                int i2 = cpM.A03;
                valueOf.replace(i - i2, i, "");
                A0T(list, cpM.A00 - i2, i2);
                int i3 = cpM.A01 + i2;
                if (i3 > valueOf.length()) {
                    spannableStringBuilder = valueOf;
                    break;
                }
                valueOf.replace(cpM.A01, i3, "");
                A0T(list, cpM.A01, i2);
            }
            spannableStringBuilder = valueOf;
        }
        return spannableStringBuilder;
    }

    public static void A0J(Context context, Paint paint, Editable editable, AnonymousClass11C r7, AnonymousClass1KW r8, C18030ve r9, C18010vc r10, float f) {
        Context context2 = context;
        C18070vi.A0g(context2, 2, r8);
        Paint paint2 = paint;
        Editable editable2 = editable;
        C43251zV.A08(context2, paint2, editable2, r8, r9, f);
        A0S(editable2, false);
        A0D(r7, r10, editable2, paint2.getColor(), true);
    }

    public static void A0L(Context context, Editable editable, TextPaint textPaint, AnonymousClass11C r15, AnonymousClass1KW r16, C18030ve r17, C18010vc r18, int i, int i2, boolean z) {
        Context context2 = context;
        TextPaint textPaint2 = textPaint;
        AnonymousClass11C r14 = r15;
        AnonymousClass1KW r152 = r16;
        C18030ve r162 = r17;
        C18010vc r1 = r18;
        if (z) {
            C25807CmK cmK = new C25807CmK(C19740yt.A00(context2, i), C19740yt.A00(context2, i2), 0, false, false, false, true, false);
            C18070vi.A0g(context2, 2, r152);
            Context context3 = context2;
            C43251zV.A08(context3, textPaint2, editable, r152, r162, 1.3f);
            A0S(editable, true);
            if (editable != null) {
                A05(context3, SpannableStringBuilder.valueOf(editable), textPaint2, (C18030ve) null, cmK, editable, A00(r14, r1));
                return;
            }
            return;
        }
        A0J(context2, textPaint2, editable, r14, r152, r162, r1, 1.3f);
    }

    public static void A0P(Editable editable, Class cls, int i) {
        Object[] spans = editable.getSpans(0, i, cls);
        if (spans != null) {
            for (Object removeSpan : spans) {
                editable.removeSpan(removeSpan);
            }
        }
    }

    public static SpannableStringBuilder A04(String str, Spannable... spannableArr) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        for (int i = 0; i < spannableArr.length; i++) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("%");
            A10.append(i + 1);
            String A0y = AnonymousClass000.A0y("$s", A10);
            int indexOf = spannableStringBuilder.toString().indexOf(A0y);
            if (indexOf != -1) {
                spannableStringBuilder.replace(indexOf, A0y.length() + indexOf, spannableArr[i]);
            } else {
                StringBuilder A102 = AnonymousClass000.A10();
                A102.append("RichTextUtils/formatSpannableString: skipping placeholder of index ");
                A102.append(i + 1);
                C17900vP.A0e(" as we cannot find it in template: ", str, A102);
            }
        }
        return spannableStringBuilder;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0108  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C19760yx A05(android.content.Context r19, android.text.Editable r20, android.text.TextPaint r21, X.C18030ve r22, X.C25807CmK r23, java.lang.CharSequence r24, int r25) {
        /*
            r12 = r21
            float r16 = r12.getTextSize()
            r5 = 1
            r0 = r22
            r13 = r23
            r14 = r24
            r6 = r25
            X.0yx r0 = A07(r0, r13, r14, r6, r5)
            java.lang.Object r15 = r0.A00
            java.util.List r15 = (java.util.List) r15
            java.lang.Object r3 = r0.A01
            java.util.List r3 = (java.util.List) r3
            java.util.Iterator r2 = r15.iterator()
        L_0x001f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x010c
            java.lang.Object r0 = r2.next()
            X.CpM r0 = (X.C25954CpM) r0
            int r1 = r0.A02
            r0 = 6
            if (r1 != r0) goto L_0x001f
            r11 = 1
        L_0x0031:
            int r0 = r3.size()
            r4 = r20
            if (r0 <= 0) goto L_0x004c
            r17 = r6
            r18 = r5
            java.util.ArrayList r1 = A0I(r12, r13, r14, r15, r16, r17, r18)
            int r0 = r1.size()
            if (r0 > 0) goto L_0x0048
            r5 = r11
        L_0x0048:
            A0R(r4, r1, r15)
            r11 = r5
        L_0x004c:
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            java.util.Iterator r10 = r15.iterator()
        L_0x0054:
            boolean r0 = r10.hasNext()
            r5 = 17
            if (r0 == 0) goto L_0x010f
            java.lang.Object r6 = r10.next()
            X.CpM r6 = (X.C25954CpM) r6
            int r2 = r6.A02
            r0 = 6
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            if (r2 != r0) goto L_0x0074
            boolean r0 = r13.A03
            if (r0 == 0) goto L_0x0070
            A0N(r4, r6, r1)
        L_0x0070:
            r3.add(r6)
            goto L_0x0054
        L_0x0074:
            r0 = 8
            if (r2 != r0) goto L_0x008e
            boolean r0 = r13.A03
            if (r0 != 0) goto L_0x00fa
            int r2 = r6.A00
            int r1 = r6.A01
            java.lang.String r0 = ""
            r4.replace(r2, r1, r0)
            int r1 = r6.A01
            int r0 = r6.A00
            int r1 = r1 - r0
            A0T(r15, r0, r1)
            goto L_0x0054
        L_0x008e:
            r0 = 12
            if (r2 != r0) goto L_0x00fa
            r7 = r19
            if (r19 == 0) goto L_0x00fa
            boolean r0 = r13.A04
            if (r0 == 0) goto L_0x00fa
            r2 = 0
            android.text.style.AbsoluteSizeSpan r8 = new android.text.style.AbsoluteSizeSpan
            r8.<init>(r2, r2)
            int r1 = r6.A00
            int r0 = r1 + 1
            r5 = 33
            r4.setSpan(r8, r1, r0, r5)
            android.view.LayoutInflater r8 = android.view.LayoutInflater.from(r7)
            r1 = 2131626287(0x7f0e092f, float:1.8879806E38)
            r0 = 0
            android.view.View r9 = r8.inflate(r1, r0)
            java.lang.CharSequence r8 = r6.A05
            if (r8 == 0) goto L_0x00c7
            r0 = 2131433230(0x7f0b170e, float:1.848824E38)
            android.widget.TextView r1 = X.C17880vN.A0E(r9, r0)
            java.lang.String r0 = r8.toString()
            r1.setText(r0)
        L_0x00c7:
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r2)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r2)
            X.C108995ce.A0v(r9, r1, r0)
            int r2 = r9.getMeasuredWidth()
            int r1 = r9.getMeasuredHeight()
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r2, r1, r0)
            android.graphics.Canvas r0 = new android.graphics.Canvas
            r0.<init>(r1)
            r9.draw(r0)
            java.lang.String r0 = r8.toString()
            X.3No r2 = new X.3No
            r2.<init>(r7, r1, r0)
            int r1 = r6.A00
            int r0 = r1 + 1
        L_0x00f5:
            r4.setSpan(r2, r1, r0, r5)
            goto L_0x0054
        L_0x00fa:
            boolean r0 = r13.A03
            if (r0 == 0) goto L_0x0108
            A0N(r4, r6, r1)
        L_0x0101:
            android.text.ParcelableSpan r2 = r6.A04
            int r1 = r6.A00
            int r0 = r6.A01
            goto L_0x00f5
        L_0x0108:
            A0O(r4, r6, r15)
            goto L_0x0101
        L_0x010c:
            r11 = 0
            goto L_0x0031
        L_0x010f:
            java.util.Iterator r7 = r3.iterator()
        L_0x0113:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0152
            java.lang.Object r6 = r7.next()
            X.CpM r6 = (X.C25954CpM) r6
            android.text.ParcelableSpan r2 = r6.A04
            int r1 = r6.A00
            int r0 = r6.A01
            r4.setSpan(r2, r1, r0, r5)
            boolean r0 = r13.A03
            if (r0 != 0) goto L_0x0150
            int r1 = r6.A00
            int r3 = r6.A03
            int r0 = r1 - r3
            java.lang.String r2 = X.C19620yd.A07
            r4.replace(r0, r1, r2)
            int r1 = r6.A01
            int r0 = r1 + r3
            r4.replace(r1, r0, r2)
            r3 = 1
        L_0x013f:
            int r0 = r13.A00
            android.text.style.BackgroundColorSpan r2 = new android.text.style.BackgroundColorSpan
            r2.<init>(r0)
            int r1 = r6.A00
            int r1 = r1 - r3
            int r0 = r6.A01
            int r0 = r0 + r3
            r4.setSpan(r2, r1, r0, r5)
            goto L_0x0113
        L_0x0150:
            r3 = 0
            goto L_0x013f
        L_0x0152:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r11)
            X.0yx r0 = new X.0yx
            r0.<init>(r4, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26302CxJ.A05(android.content.Context, android.text.Editable, android.text.TextPaint, X.0ve, X.CmK, java.lang.CharSequence, int):X.0yx");
    }

    public static final C19760yx A08(CharSequence charSequence, int i) {
        int i2 = i - 1;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i2 < 0 || charSequence.charAt(i2) == 10 || i4 >= 8 || i5 >= 2) {
                i3 = i4;
            } else {
                if (charSequence.charAt(i2) == ' ') {
                    i4++;
                } else {
                    i5++;
                    if (charSequence.charAt(i2) != 9) {
                        i5 = 0;
                        break;
                    }
                }
                i2--;
            }
        }
        i3 = i4;
        return new C19760yx(Integer.valueOf(i3), Integer.valueOf(i5));
    }

    public static C24935CQi A09(C19760yx r4, CharSequence charSequence, int i) {
        int i2;
        int A0M = AnonymousClass000.A0M(r4.A00);
        int A0M2 = AnonymousClass000.A0M(r4.A01);
        if (A0M2 == 2 || A0M2 == 1) {
            i -= A0M2;
            i2 = A0M2 / 1;
            A0M = A0M2;
        } else if (A0M == 8 || A0M == 4) {
            i -= A0M;
            i2 = A0M / 4;
        } else {
            if (i > 0) {
                if (charSequence.charAt(i - 1) != 10) {
                    return null;
                }
            } else if (i != 0) {
                return null;
            }
            A0M = 0;
            i2 = 0;
        }
        return new C24935CQi(i, A0M, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        if (r6.A07 == false) goto L_0x0007;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0071, code lost:
        if (java.lang.Character.codePointAt(r7, r9 + 1) != 32) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0081, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00a7, code lost:
        if (A0X(r7, r8, r9) == false) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0110, code lost:
        if (r2 >= r7.length()) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x011a, code lost:
        if (java.lang.Character.codePointAt(r7, r4 + 1) != 46) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0122, code lost:
        if (java.lang.Character.codePointAt(r7, r2) != 32) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0124, code lost:
        r1 = r4 + 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x012a, code lost:
        if (r1 >= r7.length()) goto L_0x0134;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0130, code lost:
        if (r7.charAt(r1) != ' ') goto L_0x0134;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0134, code lost:
        r0 = A09(A08(r7, r9), r7, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x013c, code lost:
        if (r0 == null) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x013e, code lost:
        r3 = r0.A02;
        r4 = r0.A00;
        r6 = r0.A01;
        r2 = 11;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C25956CpO A0A(X.C25807CmK r6, java.lang.CharSequence r7, java.lang.Character r8, int r9, boolean r10) {
        /*
            if (r6 == 0) goto L_0x0007
            boolean r0 = r6.A07
            r5 = 1
            if (r0 != 0) goto L_0x0008
        L_0x0007:
            r5 = 0
        L_0x0008:
            if (r10 == 0) goto L_0x0047
            if (r5 == 0) goto L_0x0047
            char r1 = r8.charValue()
            r0 = 42
            if (r1 == r0) goto L_0x001c
            r0 = 45
            if (r1 == r0) goto L_0x001c
            r0 = 43
            if (r1 != r0) goto L_0x0047
        L_0x001c:
            int r0 = r7.length()
            int r0 = r0 + -1
            if (r9 >= r0) goto L_0x0047
            int r0 = r9 + 1
            int r1 = java.lang.Character.codePointAt(r7, r0)
            r0 = 32
            if (r1 != r0) goto L_0x0047
            X.0yx r0 = A08(r7, r9)
            X.CQi r0 = A09(r0, r7, r9)
            if (r0 == 0) goto L_0x0047
            int r3 = r0.A02
            int r4 = r0.A00
            r5 = 1
            int r6 = r0.A01
            r2 = 10
        L_0x0041:
            X.CpO r1 = new X.CpO
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
        L_0x0047:
            char r3 = r8.charValue()
            r0 = 42
            if (r3 == r0) goto L_0x0053
            r0 = 45
            if (r3 != r0) goto L_0x0083
        L_0x0053:
            r2 = 1
            if (r9 <= 0) goto L_0x007f
            int r0 = r9 + -1
            char r1 = r7.charAt(r0)
            r0 = 10
            if (r1 == r0) goto L_0x0081
        L_0x0060:
            r4 = 0
        L_0x0061:
            int r0 = r7.length()
            int r0 = r0 - r2
            if (r9 >= r0) goto L_0x0073
            int r0 = r9 + 1
            int r2 = java.lang.Character.codePointAt(r7, r0)
            r1 = 32
            r0 = 1
            if (r2 == r1) goto L_0x0074
        L_0x0073:
            r0 = 0
        L_0x0074:
            if (r4 == 0) goto L_0x0083
            if (r0 == 0) goto L_0x0083
            r1 = 2
        L_0x0079:
            X.CpO r2 = new X.CpO
            r2.<init>(r1, r9)
            return r2
        L_0x007f:
            if (r9 != 0) goto L_0x0060
        L_0x0081:
            r4 = 1
            goto L_0x0061
        L_0x0083:
            if (r10 == 0) goto L_0x0155
            if (r5 == 0) goto L_0x0148
            boolean r0 = java.lang.Character.isDigit(r3)
            if (r0 == 0) goto L_0x009b
            if (r9 <= 0) goto L_0x00ec
            int r0 = r9 + -1
            char r0 = r7.charAt(r0)
            boolean r0 = java.lang.Character.isWhitespace(r0)
            if (r0 != 0) goto L_0x00ec
        L_0x009b:
            if (r6 == 0) goto L_0x00a9
            boolean r0 = r6.A06
            if (r0 == 0) goto L_0x00a9
            boolean r0 = A0X(r7, r8, r9)
            r1 = 9
            if (r0 != 0) goto L_0x0079
        L_0x00a9:
            r0 = 62
            if (r3 != r0) goto L_0x0155
            r3 = 1
            if (r9 <= 0) goto L_0x00e8
            int r0 = r9 + -1
            char r1 = r7.charAt(r0)
            r0 = 10
            if (r1 == r0) goto L_0x00ea
        L_0x00ba:
            r2 = 0
        L_0x00bb:
            int r0 = r7.length()
            int r0 = r0 - r3
            if (r9 >= r0) goto L_0x00e6
            int r0 = r9 + 1
            int r1 = java.lang.Character.codePointAt(r7, r0)
            r0 = 32
            if (r1 != r0) goto L_0x00e6
        L_0x00cc:
            int r1 = r9 + 2
            int r0 = r7.length()
            if (r1 >= r0) goto L_0x00e4
            char r0 = r7.charAt(r1)
            boolean r0 = java.lang.Character.isWhitespace(r0)
        L_0x00dc:
            if (r2 == 0) goto L_0x0155
            if (r3 == 0) goto L_0x0155
            if (r0 != 0) goto L_0x0155
            r1 = 5
            goto L_0x0079
        L_0x00e4:
            r0 = 1
            goto L_0x00dc
        L_0x00e6:
            r3 = 0
            goto L_0x00cc
        L_0x00e8:
            if (r9 != 0) goto L_0x00ba
        L_0x00ea:
            r2 = 1
            goto L_0x00bb
        L_0x00ec:
            r4 = r9
            r5 = 1
        L_0x00ee:
            int r1 = r4 + 1
            int r0 = r7.length()
            if (r1 >= r0) goto L_0x010a
            int r0 = r4 + 1
            char r0 = r7.charAt(r0)
            boolean r0 = java.lang.Character.isDigit(r0)
            if (r0 == 0) goto L_0x010a
            int r5 = r5 + 1
            int r4 = r4 + 1
            r0 = 2
            if (r5 <= r0) goto L_0x00ee
            goto L_0x009b
        L_0x010a:
            int r2 = r4 + 2
            int r0 = r7.length()
            if (r2 >= r0) goto L_0x009b
            int r0 = r4 + 1
            int r1 = java.lang.Character.codePointAt(r7, r0)
            r0 = 46
            if (r1 != r0) goto L_0x009b
            int r0 = java.lang.Character.codePointAt(r7, r2)
            r2 = 32
            if (r0 != r2) goto L_0x009b
            int r1 = r4 + 3
            int r0 = r7.length()
            if (r1 >= r0) goto L_0x0134
            char r0 = r7.charAt(r1)
            if (r0 != r2) goto L_0x0134
            goto L_0x009b
        L_0x0134:
            X.0yx r0 = A08(r7, r9)
            X.CQi r0 = A09(r0, r7, r9)
            if (r0 == 0) goto L_0x009b
            int r3 = r0.A02
            int r4 = r0.A00
            int r6 = r0.A01
            r2 = 11
            goto L_0x0041
        L_0x0148:
            int r1 = A01(r7, r8, r9)
            if (r1 <= 0) goto L_0x009b
            r0 = 4
            X.CpO r2 = new X.CpO
            r2.<init>(r0, r9, r1)
            return r2
        L_0x0155:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26302CxJ.A0A(X.CmK, java.lang.CharSequence, java.lang.Character, int, boolean):X.CpO");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001f, code lost:
        if (r18 != null) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
        r1 = X.C18040vf.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        if (X.C18020vd.A05(r1, r4, 12539) == false) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        r14 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0032, code lost:
        if (X.C18020vd.A05(r1, r4, 10886) != false) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        r14 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0035, code lost:
        r5 = (java.util.List) A07(r4, new X.C25807CmK(0, 0, 0, true, r13, r14, false, false), r2, A00(r17, r19), false).A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0054, code lost:
        if (r5.isEmpty() == false) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0056, code lost:
        return r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0057, code lost:
        r6 = android.text.SpannableStringBuilder.valueOf(r2);
        r8 = r5.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0063, code lost:
        if (r8.hasNext() == false) goto L_0x0005;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0065, code lost:
        r7 = (X.C25954CpM) r8.next();
        r1 = r7.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006f, code lost:
        if (r1 != 8) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0071, code lost:
        r6.replace(r7.A00, r7.A01, "");
        r1 = r7.A01;
        r0 = r7.A00;
        A0T(r5, r0, r1 - r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0085, code lost:
        if (r1 != 9) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008b, code lost:
        if (A0W(r4) == false) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008d, code lost:
        r3 = new android.text.style.AbsoluteSizeSpan(0, false);
        r2 = r7.A00;
        r1 = r2 + 2;
        r0 = 33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0098, code lost:
        r6.setSpan(r3, r2, r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009c, code lost:
        A0O(r6, r7, r5);
        r3 = r7.A04;
        r2 = r7.A00;
        r1 = r7.A01;
        r0 = 17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        if (X.C18020vd.A05(r1, r4, 10986) == false) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.CharSequence A0B(X.AnonymousClass11C r17, X.C18030ve r18, X.C18010vc r19, java.lang.CharSequence r20) {
        /*
            r2 = r20
            if (r20 != 0) goto L_0x0006
            r6 = 0
        L_0x0005:
            return r6
        L_0x0006:
            r9 = 0
            r4 = r18
            if (r18 == 0) goto L_0x001e
            X.0vf r1 = X.C18040vf.A01
            r0 = 12539(0x30fb, float:1.7571E-41)
            boolean r0 = X.C18020vd.A05(r1, r4, r0)
            if (r0 == 0) goto L_0x001e
            r0 = 10986(0x2aea, float:1.5395E-41)
            boolean r0 = X.C18020vd.A05(r1, r4, r0)
            r13 = 1
            if (r0 != 0) goto L_0x0021
        L_0x001e:
            r13 = 0
            if (r18 == 0) goto L_0x0034
        L_0x0021:
            X.0vf r1 = X.C18040vf.A01
            r0 = 12539(0x30fb, float:1.7571E-41)
            boolean r0 = X.C18020vd.A05(r1, r4, r0)
            if (r0 == 0) goto L_0x0034
            r0 = 10886(0x2a86, float:1.5255E-41)
            boolean r0 = X.C18020vd.A05(r1, r4, r0)
            r14 = 1
            if (r0 != 0) goto L_0x0035
        L_0x0034:
            r14 = 0
        L_0x0035:
            r12 = 1
            X.CmK r8 = new X.CmK
            r11 = r9
            r15 = r9
            r16 = r9
            r10 = r9
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            r1 = r17
            r0 = r19
            int r0 = A00(r1, r0)
            X.0yx r0 = A07(r4, r8, r2, r0, r9)
            java.lang.Object r5 = r0.A00
            java.util.List r5 = (java.util.List) r5
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x0057
            return r20
        L_0x0057:
            android.text.SpannableStringBuilder r6 = android.text.SpannableStringBuilder.valueOf(r2)
            java.util.Iterator r8 = r5.iterator()
        L_0x005f:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0005
            java.lang.Object r7 = r8.next()
            X.CpM r7 = (X.C25954CpM) r7
            int r1 = r7.A02
            r0 = 8
            if (r1 != r0) goto L_0x0083
            int r2 = r7.A00
            int r1 = r7.A01
            java.lang.String r0 = ""
            r6.replace(r2, r1, r0)
            int r1 = r7.A01
            int r0 = r7.A00
            int r1 = r1 - r0
            A0T(r5, r0, r1)
            goto L_0x005f
        L_0x0083:
            r0 = 9
            if (r1 != r0) goto L_0x009c
            boolean r0 = A0W(r4)
            if (r0 == 0) goto L_0x009c
            android.text.style.AbsoluteSizeSpan r3 = new android.text.style.AbsoluteSizeSpan
            r3.<init>(r9, r9)
            int r2 = r7.A00
            int r1 = r2 + 2
            r0 = 33
        L_0x0098:
            r6.setSpan(r3, r2, r1, r0)
            goto L_0x005f
        L_0x009c:
            A0O(r6, r7, r5)
            android.text.ParcelableSpan r3 = r7.A04
            int r2 = r7.A00
            int r1 = r7.A01
            r0 = 17
            goto L_0x0098
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26302CxJ.A0B(X.11C, X.0ve, X.0vc, java.lang.CharSequence):java.lang.CharSequence");
    }

    public static CharSequence A0D(AnonymousClass11C r1, C18010vc r2, CharSequence charSequence, int i, boolean z) {
        if (charSequence == null) {
            return null;
        }
        List list = (List) A07((C18030ve) null, (C25807CmK) null, charSequence, A00(r1, r2), false).A00;
        if (list.isEmpty()) {
            return charSequence;
        }
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
        A0Q(valueOf, list, i, z);
        return valueOf;
    }

    public static String A0G(String str, boolean z) {
        if (str == null) {
            return "";
        }
        if (str.contains("⠀")) {
            str = str.replace("⠀", " ");
        }
        String trim = str.trim();
        if (!z || !C39761tb.A07() || !trim.contains("­")) {
            return trim;
        }
        return trim.replace("­", "");
    }

    public static ArrayList A0H(Spannable spannable) {
        int i;
        int i2 = 0;
        Object[] spans = spannable.getSpans(0, spannable.length(), URLSpan.class);
        if (spans == null || spans.length == 0) {
            return null;
        }
        ArrayList A10 = C17880vN.A10(Arrays.asList(spans));
        DUP.A00(spannable, A10, 17);
        int size = A10.size();
        while (i2 < size - 1) {
            Object obj = A10.get(i2);
            Object obj2 = A10.get(i2 + 1);
            int spanStart = spannable.getSpanStart(obj);
            int spanEnd = spannable.getSpanEnd(obj);
            int spanStart2 = spannable.getSpanStart(obj2);
            int spanEnd2 = spannable.getSpanEnd(obj2);
            if (spanStart <= spanStart2 && spanEnd > spanStart2) {
                if (spanEnd2 <= spanEnd || spanEnd - spanStart > spanEnd2 - spanStart2) {
                    i = i2 + 1;
                    spannable.removeSpan(obj2);
                } else if (spanEnd - spanStart < spanEnd2 - spanStart2) {
                    spannable.removeSpan(obj);
                    i = i2;
                }
                if (i != -1) {
                    A10.remove(i);
                    size--;
                }
            }
            i2++;
        }
        return A10;
    }

    public static void A0K(Context context, Uri uri, AnonymousClass1L9 r10, AnonymousClass1KB r11, TextEmojiLabel textEmojiLabel, AnonymousClass11C r13, C18030ve r14, String str, String str2) {
        A0M(context, r10, r11, textEmojiLabel, r13, r14, str, new C27313Dbk(str2, uri));
    }

    public static void A0O(Editable editable, C25954CpM cpM, List list) {
        int i = cpM.A00;
        int i2 = cpM.A03;
        int i3 = i - i2;
        if (i3 >= 0) {
            editable.replace(i3, i, "");
            A0T(list, cpM.A00 - i2, i2);
        }
        if (cpM.A01 + i2 <= editable.length()) {
            int i4 = cpM.A01;
            editable.replace(i4, i4 + i2, "");
            A0T(list, cpM.A01, i2);
        }
    }

    public static boolean A0V(AnonymousClass11C r0, C18010vc r1, CharSequence charSequence) {
        if (charSequence == null || AnonymousClass1EG.A0H(A0C(r0, r1, charSequence))) {
            return false;
        }
        return true;
    }

    public static boolean A0W(C18030ve r2) {
        if (r2 != null) {
            C18040vf r1 = C18040vf.A01;
            if (!C18020vd.A05(r1, r2, 12539) || !C18020vd.A05(r1, r2, 10986)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static int A00(AnonymousClass11C r1, C18010vc r2) {
        if (C24191Jf.A01(r1, r2) < 2011) {
            return 512;
        }
        return EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0041, code lost:
        if (java.lang.Character.codePointAt(r8, r1) != 46) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0055, code lost:
        if (java.lang.Character.codePointAt(r8, r6 + 2) != 32) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0069, code lost:
        if (r8.charAt(r6 + 3) != ' ') goto L_0x006b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A01(java.lang.CharSequence r8, java.lang.Character r9, int r10) {
        /*
            char r0 = r9.charValue()
            boolean r0 = java.lang.Character.isDigit(r0)
            r7 = 0
            if (r0 == 0) goto L_0x0017
            if (r10 <= 0) goto L_0x0018
            int r0 = r10 + -1
            char r1 = r8.charAt(r0)
            r0 = 10
            if (r1 == r0) goto L_0x001a
        L_0x0017:
            return r7
        L_0x0018:
            if (r10 != 0) goto L_0x0017
        L_0x001a:
            r6 = r10
        L_0x001b:
            int r1 = r6 + 1
            int r0 = r8.length()
            if (r1 >= r0) goto L_0x0032
            int r0 = r6 + 1
            char r0 = r8.charAt(r0)
            boolean r0 = java.lang.Character.isDigit(r0)
            if (r0 == 0) goto L_0x0032
            int r6 = r6 + 1
            goto L_0x001b
        L_0x0032:
            int r1 = r6 + 1
            int r0 = r8.length()
            if (r1 >= r0) goto L_0x0043
            int r1 = java.lang.Character.codePointAt(r8, r1)
            r0 = 46
            r5 = 1
            if (r1 == r0) goto L_0x0044
        L_0x0043:
            r5 = 0
        L_0x0044:
            int r0 = r8.length()
            r4 = 2
            int r0 = r0 - r4
            r1 = 32
            if (r6 >= r0) goto L_0x0057
            int r0 = r6 + 2
            int r0 = java.lang.Character.codePointAt(r8, r0)
            r3 = 1
            if (r0 == r1) goto L_0x0058
        L_0x0057:
            r3 = 0
        L_0x0058:
            int r0 = r8.length()
            int r0 = r0 + -3
            if (r6 >= r0) goto L_0x006b
            int r0 = r6 + 3
            char r2 = r8.charAt(r0)
            r0 = 32
            r1 = 1
            if (r2 == r0) goto L_0x006c
        L_0x006b:
            r1 = 0
        L_0x006c:
            int r6 = r6 - r10
            int r0 = r6 + 1
            if (r0 > r4) goto L_0x0017
            if (r1 != 0) goto L_0x0017
            if (r5 == 0) goto L_0x0017
            if (r3 == 0) goto L_0x0017
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26302CxJ.A01(java.lang.CharSequence, java.lang.Character, int):int");
    }

    public static SpannableStringBuilder A03(String str, Map map) {
        Spanned fromHtml = Html.fromHtml(str);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(fromHtml);
        URLSpan[] uRLSpanArr = (URLSpan[]) fromHtml.getSpans(0, fromHtml.length(), URLSpan.class);
        if (uRLSpanArr != null) {
            for (URLSpan uRLSpan : uRLSpanArr) {
                Object obj = map.get(uRLSpan.getURL());
                if (obj != null) {
                    int spanStart = spannableStringBuilder.getSpanStart(uRLSpan);
                    int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan);
                    int spanFlags = spannableStringBuilder.getSpanFlags(uRLSpan);
                    spannableStringBuilder.removeSpan(uRLSpan);
                    spannableStringBuilder.setSpan(obj, spanStart, spanEnd, spanFlags);
                }
            }
        }
        return spannableStringBuilder;
    }

    public static C19760yx A06(TextPaint textPaint, AnonymousClass11C r5, C18010vc r6, C25807CmK cmK, CharSequence charSequence) {
        int A002 = A00(r5, r6);
        return A05((Context) null, SpannableStringBuilder.valueOf(charSequence), textPaint, (C18030ve) null, cmK, charSequence, A002);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0161: MOVE  (r11v10 int) = (r18v1 int)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x02a6  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0147  */
    public static X.C19760yx A07(X.C18030ve r31, X.C25807CmK r32, java.lang.CharSequence r33, int r34, boolean r35) {
        /*
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            java.util.ArrayList r23 = X.AnonymousClass000.A13()
            r6 = r33
            int r8 = r6.length()
            r9 = r32
            if (r32 == 0) goto L_0x0018
            boolean r0 = r9.A06
            r22 = 1
            if (r0 != 0) goto L_0x001a
        L_0x0018:
            r22 = 0
        L_0x001a:
            r2 = 0
            r21 = 32
            r20 = -1
            r1 = 32
            r0 = 0
            r19 = 0
            r5 = -1
            r10 = -1
            r18 = -1
            r17 = -1
        L_0x002a:
            if (r0 >= r8) goto L_0x02ea
            char r3 = r6.charAt(r0)
            r7 = 42
            if (r3 != r7) goto L_0x004b
            int r7 = r8 + -1
            if (r0 >= r7) goto L_0x004b
            int r3 = r0 + 1
            int r11 = java.lang.Character.codePointAt(r6, r3)
            r3 = 42
            r7 = 8419(0x20e3, float:1.1798E-41)
            if (r11 == r7) goto L_0x0049
            r7 = 65039(0xfe0f, float:9.1139E-41)
            if (r11 != r7) goto L_0x004b
        L_0x0049:
            r3 = 32
        L_0x004b:
            r12 = r35
            if (r35 == 0) goto L_0x02c2
            java.lang.Character r7 = java.lang.Character.valueOf(r3)
            X.CpO r11 = A0A(r9, r6, r7, r0, r12)
            if (r11 == 0) goto L_0x005e
            r7 = r23
            r7.add(r11)
        L_0x005e:
            int r7 = r8 + -1
            if (r0 >= r7) goto L_0x02c2
            int r7 = r0 + 1
            char r11 = r6.charAt(r7)
        L_0x0068:
            r7 = 42
            if (r3 != r7) goto L_0x02a6
            r12 = 0
        L_0x006d:
            java.lang.String r11 = "monospace"
            if (r12 < 0) goto L_0x0221
            if (r2 != 0) goto L_0x007a
            r2 = 4
            int[] r2 = new int[r2]
            r7 = -1
            java.util.Arrays.fill(r2, r7)
        L_0x007a:
            r7 = r2[r12]
            if (r7 >= 0) goto L_0x01b9
            if (r1 == r3) goto L_0x01b9
            boolean r7 = java.lang.Character.isWhitespace(r1)
            if (r7 != 0) goto L_0x00ca
            r7 = 95
            if (r1 == r7) goto L_0x00ca
            r7 = 126(0x7e, float:1.77E-43)
            if (r1 == r7) goto L_0x00ca
            r7 = 42
            if (r1 == r7) goto L_0x00ca
            r7 = 46
            if (r1 == r7) goto L_0x00ca
            r7 = 44
            if (r1 == r7) goto L_0x00ca
            r7 = 58
            if (r1 == r7) goto L_0x00ca
            r7 = 34
            if (r1 == r7) goto L_0x00ca
            r7 = 40
            if (r1 == r7) goto L_0x00ca
            r7 = 47
            if (r1 == r7) goto L_0x00ca
            r7 = 59
            if (r1 == r7) goto L_0x00ca
            r7 = 8206(0x200e, float:1.1499E-41)
            if (r1 == r7) goto L_0x00ca
            r7 = 8207(0x200f, float:1.15E-41)
            if (r1 == r7) goto L_0x00ca
            r7 = 8294(0x2066, float:1.1622E-41)
            if (r1 == r7) goto L_0x00ca
            r7 = 8295(0x2067, float:1.1624E-41)
            if (r1 == r7) goto L_0x00ca
            r7 = 8296(0x2068, float:1.1625E-41)
            if (r1 == r7) goto L_0x00ca
            r7 = 8237(0x202d, float:1.1542E-41)
            if (r1 == r7) goto L_0x00ca
            r7 = 8238(0x202e, float:1.1544E-41)
            if (r1 != r7) goto L_0x01b9
        L_0x00ca:
            int r7 = r0 + 1
            if (r7 >= r8) goto L_0x00de
            int r7 = r0 + 1
            char r7 = r6.charAt(r7)
            boolean r7 = java.lang.Character.isWhitespace(r7)
            if (r7 != 0) goto L_0x00de
            int r7 = r0 + 1
            r2[r12] = r7
        L_0x00de:
            if (r32 == 0) goto L_0x0140
            boolean r7 = r9.A05
            if (r7 == 0) goto L_0x0140
            r12 = 91
            java.lang.String r7 = ""
            if (r3 != r12) goto L_0x0147
            r10 = r0
        L_0x00eb:
            if (r22 == 0) goto L_0x010f
        L_0x00ed:
            if (r19 == 0) goto L_0x010f
        L_0x00ef:
            r11 = 2
            if (r0 < r11) goto L_0x010f
            r12 = 35
            r11 = r21
            if (r11 != r12) goto L_0x010f
            r11 = 32
            if (r1 != r11) goto L_0x010f
            int r13 = r0 + -2
            android.text.style.TypefaceSpan r12 = new android.text.style.TypefaceSpan
            r12.<init>(r7)
            r16 = 9
            r15 = 0
            X.CpM r11 = new X.CpM
            r14 = r0
            r11.<init>(r12, r13, r14, r15, r16)
            r4.add(r11)
        L_0x010f:
            java.util.HashMap r13 = A01
            java.lang.Character r12 = java.lang.Character.valueOf(r3)
            boolean r11 = r13.containsKey(r12)
            if (r11 == 0) goto L_0x0140
            boolean r11 = r9.A04
            if (r11 == 0) goto L_0x0140
            java.lang.Object r12 = r13.get(r12)
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            android.text.style.TypefaceSpan r11 = new android.text.style.TypefaceSpan
            r11.<init>(r7)
            r30 = 12
            r29 = 1
            X.CpM r7 = new X.CpM
            r28 = r0
            r24 = r7
            r25 = r11
            r26 = r12
            r27 = r0
            r24.<init>(r25, r26, r27, r28, r29, r30)
            r4.add(r7)
        L_0x0140:
            int r0 = r0 + 1
            r21 = r1
            r1 = r3
            goto L_0x002a
        L_0x0147:
            if (r10 < 0) goto L_0x01a3
            r11 = 93
            if (r3 != r11) goto L_0x0152
            if (r1 == r12) goto L_0x00eb
            r18 = r0
            goto L_0x00eb
        L_0x0152:
            r12 = 40
            if (r3 != r12) goto L_0x015b
            if (r1 != r11) goto L_0x00eb
            r17 = r0
            goto L_0x00eb
        L_0x015b:
            r11 = 41
            if (r3 != r11) goto L_0x00eb
            if (r1 == r12) goto L_0x00eb
            r11 = r18
            if (r10 >= r11) goto L_0x00eb
            r12 = r11
            r11 = r17
            if (r12 >= r11) goto L_0x00eb
            if (r11 >= r0) goto L_0x00eb
            r13 = r31
            if (r31 == 0) goto L_0x00eb
            X.0vf r12 = X.C18040vf.A01
            r11 = 9318(0x2466, float:1.3057E-41)
            boolean r11 = X.C18020vd.A05(r12, r13, r11)
            if (r11 == 0) goto L_0x00eb
            int r13 = r10 + 1
            android.text.style.TypefaceSpan r12 = new android.text.style.TypefaceSpan
            r12.<init>(r7)
            r16 = 7
            r15 = 1
            X.CpM r11 = new X.CpM
            r14 = r18
            r11.<init>(r12, r13, r14, r15, r16)
            r4.add(r11)
            int r14 = r0 + 1
            android.text.style.TypefaceSpan r12 = new android.text.style.TypefaceSpan
            r12.<init>(r7)
            r16 = 8
            X.CpM r11 = new X.CpM
            r13 = r17
            r11.<init>(r12, r13, r14, r15, r16)
            r4.add(r11)
            goto L_0x00eb
        L_0x01a3:
            if (r22 == 0) goto L_0x010f
            r11 = 35
            if (r3 != r11) goto L_0x00ed
            if (r0 == 0) goto L_0x01b1
            if (r0 <= 0) goto L_0x01b5
            r11 = 10
            if (r1 != r11) goto L_0x01b5
        L_0x01b1:
            r19 = 1
            goto L_0x00ef
        L_0x01b5:
            r19 = 0
            goto L_0x010f
        L_0x01b9:
            r7 = r2[r12]
            if (r7 < 0) goto L_0x00de
            boolean r7 = java.lang.Character.isWhitespace(r1)
            if (r7 != 0) goto L_0x00de
            int r7 = r8 + -1
            if (r0 == r7) goto L_0x01d3
            int r7 = r0 + 1
            int r7 = java.lang.Character.codePointAt(r6, r7)
            boolean r7 = java.lang.Character.isLetterOrDigit(r7)
            if (r7 != 0) goto L_0x00de
        L_0x01d3:
            r13 = r2[r12]
            if (r13 >= r0) goto L_0x02f2
            r7 = 3
            if (r12 != r7) goto L_0x01fc
            java.util.ArrayList r14 = X.AnonymousClass000.A13()
            java.util.Iterator r16 = r4.iterator()
        L_0x01e2:
            boolean r7 = r16.hasNext()
            if (r7 == 0) goto L_0x02c6
            java.lang.Object r13 = r16.next()
            X.CpM r13 = (X.C25954CpM) r13
            int r15 = r13.A00
            r7 = r2[r12]
            if (r15 <= r7) goto L_0x01e2
            int r7 = r13.A01
            if (r7 >= r0) goto L_0x01e2
            r14.add(r13)
            goto L_0x01e2
        L_0x01fc:
            r7 = 42
            r14 = 1
            if (r3 == r7) goto L_0x021b
            r7 = 95
            r14 = 2
            if (r3 == r7) goto L_0x021b
            r7 = 126(0x7e, float:1.77E-43)
            if (r3 == r7) goto L_0x0215
            r11 = 0
        L_0x020b:
            X.CpM r7 = new X.CpM
            r7.<init>(r11, r13, r0)
            r4.add(r7)
            goto L_0x02e2
        L_0x0215:
            android.text.style.StrikethroughSpan r11 = new android.text.style.StrikethroughSpan
            r11.<init>()
            goto L_0x020b
        L_0x021b:
            android.text.style.StyleSpan r11 = new android.text.style.StyleSpan
            r11.<init>(r14)
            goto L_0x020b
        L_0x0221:
            r12 = 96
            if (r3 != r12) goto L_0x029a
            if (r1 != r12) goto L_0x00de
            r7 = r21
            if (r7 != r12) goto L_0x00de
            if (r20 < 0) goto L_0x0233
            int r12 = r0 + -2
            r7 = r20
            if (r7 >= r12) goto L_0x00de
        L_0x0233:
            if (r5 >= 0) goto L_0x0239
            int r5 = r0 + 1
            goto L_0x00de
        L_0x0239:
            int r7 = r0 + -2
            if (r5 >= r7) goto L_0x00de
            r12 = r5
        L_0x023e:
            int r7 = r0 + -2
            if (r12 >= r7) goto L_0x00de
            char r7 = r6.charAt(r12)
            boolean r7 = java.lang.Character.isWhitespace(r7)
            if (r7 != 0) goto L_0x0281
            int r14 = r0 + -2
            android.text.style.TypefaceSpan r12 = new android.text.style.TypefaceSpan
            r12.<init>(r11)
            r16 = 1
            r15 = 3
            X.CpM r7 = new X.CpM
            r11 = r7
            r13 = r5
            r11.<init>(r12, r13, r14, r15, r16)
            java.util.ArrayList r13 = X.BE8.A0n(r7, r4)
            java.util.Iterator r14 = r4.iterator()
        L_0x0265:
            boolean r7 = r14.hasNext()
            if (r7 == 0) goto L_0x0284
            java.lang.Object r12 = r14.next()
            X.CpM r12 = (X.C25954CpM) r12
            int r11 = r12.A00
            int r7 = r5 + -1
            if (r11 <= r7) goto L_0x0265
            int r11 = r12.A01
            int r7 = r0 + -2
            if (r11 >= r7) goto L_0x0265
            r13.add(r12)
            goto L_0x0265
        L_0x0281:
            int r12 = r12 + 1
            goto L_0x023e
        L_0x0284:
            r4.removeAll(r13)
            if (r2 == 0) goto L_0x028d
            r5 = -1
            java.util.Arrays.fill(r2, r5)
        L_0x028d:
            int r7 = r4.size()
            r5 = r34
            if (r7 >= r5) goto L_0x02ea
            r20 = r0
            r5 = -1
            goto L_0x00de
        L_0x029a:
            r7 = 10
            if (r3 != r7) goto L_0x00de
            if (r2 == 0) goto L_0x00de
            r7 = -1
            java.util.Arrays.fill(r2, r7)
            goto L_0x00de
        L_0x02a6:
            r7 = 95
            if (r3 != r7) goto L_0x02ad
            r12 = 1
            goto L_0x006d
        L_0x02ad:
            r7 = 126(0x7e, float:1.77E-43)
            if (r3 != r7) goto L_0x02b4
            r12 = 2
            goto L_0x006d
        L_0x02b4:
            if (r35 == 0) goto L_0x02bf
            r7 = 96
            if (r3 != r7) goto L_0x02bf
            if (r11 == r7) goto L_0x02bf
            r12 = 3
            if (r1 != r7) goto L_0x006d
        L_0x02bf:
            r12 = -1
            goto L_0x006d
        L_0x02c2:
            r11 = 32
            goto L_0x0068
        L_0x02c6:
            r4.removeAll(r14)
            r26 = r2[r12]
            android.text.style.TypefaceSpan r7 = new android.text.style.TypefaceSpan
            r7.<init>(r11)
            r29 = 6
            r28 = 1
            X.CpM r11 = new X.CpM
            r24 = r11
            r25 = r7
            r27 = r0
            r24.<init>(r25, r26, r27, r28, r29)
            r4.add(r11)
        L_0x02e2:
            int r11 = r4.size()
            r7 = r34
            if (r11 < r7) goto L_0x02f2
        L_0x02ea:
            X.0yx r1 = new X.0yx
            r0 = r23
            r1.<init>(r4, r0)
            return r1
        L_0x02f2:
            r13 = 0
        L_0x02f3:
            int r7 = r2.length
            if (r13 >= r7) goto L_0x0304
            if (r13 == r12) goto L_0x0301
            r11 = r2[r12]
            r7 = r2[r13]
            if (r11 >= r7) goto L_0x0301
            r7 = -1
            r2[r13] = r7
        L_0x0301:
            int r13 = r13 + 1
            goto L_0x02f3
        L_0x0304:
            r11 = -1
            r7 = r2[r12]
            if (r7 >= r5) goto L_0x030a
            r5 = -1
        L_0x030a:
            r2[r12] = r11
            goto L_0x00de
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26302CxJ.A07(X.0ve, X.CmK, java.lang.CharSequence, int, boolean):X.0yx");
    }

    public static String A0F(String str) {
        int length;
        StringBuilder A10 = AnonymousClass000.A10();
        int i = 0;
        int i2 = 0;
        while (true) {
            length = str.length();
            if (i >= length - 2) {
                break;
            }
            if (A0X(str, Character.valueOf(str.charAt(i)), i)) {
                A10.append(str.substring(i2, i));
                i2 = i + 2;
            }
            i++;
        }
        if (i2 < length) {
            A10.append(str.substring(i2));
        }
        return A10.toString();
    }

    public static void A0M(Context context, AnonymousClass1L9 r11, AnonymousClass1KB r12, TextEmojiLabel textEmojiLabel, AnonymousClass11C r14, C18030ve r15, String str, Map map) {
        HashMap A11 = C17880vN.A11();
        Iterator A15 = AnonymousClass000.A15(map);
        while (true) {
            AnonymousClass11C r8 = r14;
            if (A15.hasNext()) {
                Map.Entry A16 = AnonymousClass000.A16(A15);
                A11.put(A16.getKey(), new C74703cE(context, r11, r12, r8, A16.getValue().toString()));
            } else {
                SpannableStringBuilder A03 = A03(str, A11);
                AnonymousClass3Ma.A1L(r15, textEmojiLabel);
                textEmojiLabel.setAccessibilityHelper(new C39411t2(textEmojiLabel, r14));
                textEmojiLabel.setText(A03);
                return;
            }
        }
    }

    public static void A0N(Editable editable, C25954CpM cpM, int i) {
        int i2 = (i & 16777215) | 855638016;
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(i2);
        int i3 = cpM.A00;
        int i4 = cpM.A03;
        editable.setSpan(foregroundColorSpan, i3 - i4, i3, 18);
        ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(i2);
        int i5 = cpM.A01;
        editable.setSpan(foregroundColorSpan2, i5, i5 + i4, 18);
    }

    public static void A0Q(Editable editable, List list, int i, boolean z) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C25954CpM cpM = (C25954CpM) it.next();
            if (z) {
                A0N(editable, cpM, i);
            } else {
                A0O(editable, cpM, list);
            }
            editable.setSpan(cpM.A04, cpM.A00, cpM.A01, 17);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0031  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0R(android.text.Editable r8, java.util.List r9, java.util.List r10) {
        /*
            java.util.Iterator r7 = r9.iterator()
        L_0x0004:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x008d
            java.lang.Object r4 = r7.next()
            X.CpM r4 = (X.C25954CpM) r4
            int r6 = r4.A02
            r0 = 2
            r3 = 33
            r5 = 0
            if (r6 != r0) goto L_0x0080
            android.text.style.AbsoluteSizeSpan r2 = new android.text.style.AbsoluteSizeSpan
            r2.<init>(r5, r5)
            int r1 = r4.A00
            int r0 = r1 + 1
        L_0x0021:
            r8.setSpan(r2, r1, r0, r3)
        L_0x0024:
            android.text.ParcelableSpan r2 = r4.A04
            int r1 = r4.A00
            int r0 = r4.A01
            r8.setSpan(r2, r1, r0, r3)
            r0 = 9
            if (r6 != r0) goto L_0x003e
            android.text.style.AbsoluteSizeSpan r2 = new android.text.style.AbsoluteSizeSpan
            r2.<init>(r5, r5)
            int r1 = r4.A00
            int r0 = r1 + 2
        L_0x003a:
            r8.setSpan(r2, r1, r0, r3)
            goto L_0x0004
        L_0x003e:
            r0 = 10
            if (r6 != r0) goto L_0x004f
            android.text.style.AbsoluteSizeSpan r2 = new android.text.style.AbsoluteSizeSpan
            r2.<init>(r5, r5)
            int r1 = r4.A00
            int r0 = r4.A03
            int r0 = r0 + r1
            int r0 = r0 + 1
            goto L_0x003a
        L_0x004f:
            r0 = 11
            if (r6 != r0) goto L_0x0004
            java.lang.CharSequence r3 = r4.A05
            if (r3 == 0) goto L_0x0004
            int r1 = r4.A00
            int r2 = r4.A03
            int r0 = r1 + r2
            r8.replace(r1, r0, r3)
            int r1 = r3.length()
            int r1 = r1 - r2
            if (r1 >= 0) goto L_0x0073
            int r0 = r4.A00
            int r1 = -r1
            A0T(r9, r0, r1)
            int r0 = r4.A00
            A0T(r10, r0, r1)
            goto L_0x0004
        L_0x0073:
            if (r1 <= 0) goto L_0x0004
            int r0 = r4.A00
            A0U(r9, r0, r1)
            int r0 = r4.A00
            A0U(r10, r0, r1)
            goto L_0x0004
        L_0x0080:
            r0 = 5
            if (r6 != r0) goto L_0x0024
            android.text.style.AbsoluteSizeSpan r2 = new android.text.style.AbsoluteSizeSpan
            r2.<init>(r5, r5)
            int r1 = r4.A00
            int r0 = r1 + 2
            goto L_0x0021
        L_0x008d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26302CxJ.A0R(android.text.Editable, java.util.List, java.util.List):void");
    }

    public static void A0S(Editable editable, boolean z) {
        for (ForegroundColorSpan foregroundColorSpan : (ForegroundColorSpan[]) editable.getSpans(0, editable.length(), ForegroundColorSpan.class)) {
            if (!(foregroundColorSpan instanceof AnonymousClass5YO)) {
                editable.removeSpan(foregroundColorSpan);
            }
        }
        A0P(editable, StyleSpan.class, editable.length());
        A0P(editable, StrikethroughSpan.class, editable.length());
        A0P(editable, TypefaceSpan.class, editable.length());
        A0P(editable, BGZ.class, editable.length());
        A0P(editable, LeadingMarginSpan.Standard.class, editable.length());
        A0P(editable, AbsoluteSizeSpan.class, editable.length());
        if (z) {
            A0P(editable, BackgroundColorSpan.class, editable.length());
        }
    }

    public static void A0T(List list, int i, int i2) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C25954CpM cpM = (C25954CpM) it.next();
            int i3 = cpM.A00;
            if (i3 > i) {
                cpM.A00 = i3 - i2;
            }
            int i4 = cpM.A01;
            if (i4 > i) {
                cpM.A01 = i4 - i2;
            }
        }
    }

    public static void A0U(List list, int i, int i2) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C25954CpM cpM = (C25954CpM) it.next();
            int i3 = cpM.A00;
            if (i3 > i) {
                cpM.A00 = i3 + i2;
            }
            int i4 = cpM.A01;
            if (i4 > i) {
                cpM.A01 = i4 + i2;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0027, code lost:
        if (java.lang.Character.codePointAt(r6, r8 + 1) != 32) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0039, code lost:
        if (java.lang.Character.codePointAt(r6, r8 + 2) == 10) goto L_0x003b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0X(java.lang.CharSequence r6, java.lang.Character r7, int r8) {
        /*
            char r1 = r7.charValue()
            r0 = 35
            r5 = 0
            if (r1 != r0) goto L_0x0043
            r4 = 10
            r1 = 1
            if (r8 <= 0) goto L_0x0044
            int r0 = r8 + -1
            char r0 = r6.charAt(r0)
            if (r0 == r4) goto L_0x0046
        L_0x0016:
            r3 = 0
        L_0x0017:
            int r0 = r6.length()
            int r0 = r0 - r1
            if (r8 >= r0) goto L_0x0029
            int r0 = r8 + 1
            int r1 = java.lang.Character.codePointAt(r6, r0)
            r0 = 32
            r2 = 1
            if (r1 == r0) goto L_0x002a
        L_0x0029:
            r2 = 0
        L_0x002a:
            int r0 = r6.length()
            int r0 = r0 + -2
            if (r8 >= r0) goto L_0x003b
            int r0 = r8 + 2
            int r1 = java.lang.Character.codePointAt(r6, r0)
            r0 = 1
            if (r1 != r4) goto L_0x003c
        L_0x003b:
            r0 = 0
        L_0x003c:
            if (r3 == 0) goto L_0x0043
            if (r2 == 0) goto L_0x0043
            if (r0 == 0) goto L_0x0043
            r5 = 1
        L_0x0043:
            return r5
        L_0x0044:
            if (r8 != 0) goto L_0x0016
        L_0x0046:
            r3 = 1
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26302CxJ.A0X(java.lang.CharSequence, java.lang.Character, int):boolean");
    }

    public static ArrayList A0I(TextPaint textPaint, C25807CmK cmK, CharSequence charSequence, List list, float f, int i, boolean z) {
        C24969CRt cRt;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        float f2;
        int i7;
        int i8;
        int i9;
        C25807CmK cmK2 = cmK;
        float f3 = f;
        boolean z2 = cmK2.A07;
        boolean z3 = z;
        if (z2) {
            cRt = new C24140Bw6(f3);
        } else if (z) {
            cRt = new C24139Bw5(f3);
        } else {
            cRt = new C24969CRt(f3);
        }
        int i10 = (int) (0.17f * f);
        int i11 = (int) (1.0f * f);
        int i12 = (int) (f * 0.14f);
        int i13 = (int) (f * 1.9f);
        CharSequence charSequence2 = charSequence;
        int length = charSequence2.length();
        ArrayList A13 = AnonymousClass000.A13();
        ArrayList A132 = AnonymousClass000.A13();
        C25956CpO cpO = null;
        int i14 = -1;
        for (int i15 = 0; i15 < length; i15++) {
            char charAt = charSequence2.charAt(i15);
            C25956CpO A0A = A0A(cmK2, charSequence2, Character.valueOf(charAt), i15, z3);
            if (A0A != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        cpO = A0A;
                        i14 = i15;
                        break;
                    }
                    C25954CpM cpM = (C25954CpM) it.next();
                    if (cpM.A02 == 1 && cpM.A00 < i15 && cpM.A01 > i15) {
                        cpO = null;
                        i14 = -1;
                        break;
                    }
                }
            } else if (charAt == 10 || i15 == length - 1) {
                if (!(cpO == null || i14 == -1)) {
                    int i16 = cpO.A05;
                    if (i16 == 2) {
                        int i17 = cRt.A02;
                        if (cRt instanceof C24139Bw5) {
                            i9 = ((C24139Bw5) cRt).A00;
                        } else if (cRt instanceof C24140Bw6) {
                            i9 = ((C24140Bw6) cRt).A00;
                        } else {
                            i9 = cRt.A03;
                        }
                        A13.add(new C25954CpM(new LeadingMarginSpan.Standard(i17, (i9 * 2) + i17), i14, i15, 2, 3));
                        A13.add(new C25954CpM(new BGZ(i9, cRt.A01), i14, i15, 2, 2));
                    } else {
                        TextPaint textPaint2 = textPaint;
                        if (z) {
                            if (textPaint != null && i16 == 4) {
                                int i18 = cpO.A06;
                                cpO.A00 = Layout.getDesiredWidth(charSequence2, i18, cpO.A04 + i18 + 2, textPaint2);
                                cpO.A01 = i15;
                                A132.add(cpO);
                            } else if (i16 == 5) {
                                int i19 = i15 + 1;
                                int i20 = cmK2.A01;
                                A13.add(new C25954CpM(new ForegroundColorSpan(i20), i14, i19));
                                A13.add(new C25954CpM(new BGX((float) i12, i10, i11, i20), i14, i19, 2, 5));
                            }
                        }
                        if (cmK2.A06 && i16 == 9) {
                            A13.add(new C25954CpM(new AbsoluteSizeSpan(cmK2.A02, false), i14, i15 + 1, 1, 9));
                        } else if (z2) {
                            if (i16 == 10) {
                                int i21 = cpO.A06;
                                int i22 = i15 + 1;
                                int i23 = cpO.A04 + cpO.A03;
                                int i24 = cpO.A02;
                                if (cRt instanceof C24140Bw6) {
                                    C24140Bw6 bw6 = (C24140Bw6) cRt;
                                    if (i24 != 0) {
                                        if (i24 == 1) {
                                            i7 = (bw6.A02 * 2) + (bw6.A00 * 2);
                                            i8 = bw6.A01;
                                        } else if (i24 != 2) {
                                            i2 = 0;
                                        } else {
                                            i7 = (bw6.A02 * 3) + (bw6.A00 * 2) + bw6.A01 + (bw6.A01 * 2);
                                            i8 = (int) (bw6.A00 * 0.7f);
                                        }
                                        i2 = i7 + i8;
                                    } else {
                                        i2 = bw6.A02;
                                    }
                                    if (i24 == 0) {
                                        i5 = bw6.A00;
                                        i3 = i5 * 2;
                                        i4 = i3 + i2;
                                    } else if (i24 == 1) {
                                        i5 = bw6.A01;
                                        i3 = i5 * 2;
                                        i4 = i3 + i2;
                                    } else if (i24 != 2) {
                                        i4 = 0;
                                    } else {
                                        i3 = bw6.A03;
                                        i4 = i3 + i2;
                                    }
                                    A13.add(new C25954CpM(new LeadingMarginSpan.Standard(i2, i4), i21, i22, i23, 3));
                                    int i25 = bw6.A00;
                                    if (i24 != 0) {
                                        if (i24 == 1) {
                                            f2 = 0.7f;
                                        } else if (i24 != 2) {
                                            i6 = 0;
                                        } else {
                                            f2 = 0.715f;
                                        }
                                        i6 = (int) (bw6.A00 * f2);
                                    } else {
                                        i6 = bw6.A01;
                                    }
                                    A13.add(new C25954CpM(new C24138Bw4((float) bw6.A02, i25, i6, i24, bw6.A01, bw6.A03), i21, i22, i23, 10));
                                }
                            } else if (textPaint != null && i16 == 11) {
                                int i26 = cpO.A06;
                                int i27 = i15 + 1;
                                int i28 = cpO.A03;
                                int i29 = cpO.A04;
                                int i30 = cpO.A02;
                                int i31 = i26 + i28;
                                String A0k = BE7.A0k(charSequence2, i31, i31 + i29);
                                float desiredWidth = Layout.getDesiredWidth(C17890vO.A0V(". ", AnonymousClass000.A11(A0k)), textPaint2);
                                int i32 = i13;
                                if (i30 != 0) {
                                    if (i30 != 1) {
                                        i32 = i13 * 3;
                                        if (i30 != 2) {
                                            i32 = 0;
                                        }
                                    } else {
                                        i32 = i13 * 2;
                                    }
                                }
                                A13.add(new C25954CpM(new BGY(i32 - ((int) desiredWidth), i32), A0k, i26, i27, i28 + i29, 11));
                            }
                        }
                    }
                }
                cpO = null;
                i14 = -1;
            }
            if (list.size() + A13.size() >= i) {
                break;
            }
        }
        Iterator it2 = A132.iterator();
        while (it2.hasNext()) {
            C25956CpO cpO2 = (C25956CpO) it2.next();
            A13.add(new C25954CpM(new BGY(i13 - ((int) cpO2.A00), i13), cpO2.A06, cpO2.A01, 2, 4));
        }
        return A13;
    }
}
