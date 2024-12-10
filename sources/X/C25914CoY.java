package X;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.util.TypedValue;
import com.whatsapp.TextEmojiLabel;
import java.text.MessageFormat;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.CoY  reason: case insensitive filesystem */
public abstract class C25914CoY {
    public static final Pattern A00 = Pattern.compile("\\[(\\d+)]");

    public static void A01(Spannable spannable, AnonymousClass03P r7, DOZ doz, DFL dfl, C26025Cqj cqj) {
        AnonymousClass3Ma.A1L(cqj.A05, (TextEmojiLabel) r7);
        r7.setText(spannable);
        String A0f = BE7.A0f(dfl);
        if (A0f != null) {
            try {
                r7.setGravity(A90.A06(A0f));
            } catch (AnonymousClass9HX e) {
                C25913CoX.A00(doz, "WaRcRichTextComponentBinderUtils", String.format("Failed to parse text align %s", new Object[]{A0f}), e);
            }
        }
        String A0d = BE7.A0d(dfl);
        if (A0d != null) {
            try {
                r7.setLineHeight((int) A90.A01(A0d));
            } catch (AnonymousClass9HX e2) {
                C25913CoX.A00(doz, "WaRcRichTextComponentBinderUtils", String.format("Failed to parse line height pixel  %s", new Object[]{A0d}), e2);
            }
        }
    }

    public static SpannableStringBuilder A00(DOZ doz, DFL dfl) {
        Object[] objArr;
        Integer num;
        DFL dfl2 = dfl;
        Object A002 = DFL.A00(dfl2, 44);
        int i = 0;
        if (A002 != null) {
            objArr = ((List) A002).toArray(new String[0]);
        } else {
            objArr = null;
        }
        String A0e = BE7.A0e(dfl2);
        if (objArr != null) {
            A0e = MessageFormat.format(A0e, objArr);
        }
        if (A0e == null) {
            return new SpannableStringBuilder();
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(A0e);
        DFL A09 = dfl2.A09(43);
        int i2 = 40;
        String A0D = dfl2.A0D(40);
        DOZ doz2 = doz;
        if (A09 != null) {
            num = Integer.valueOf(C25340Cdz.A01(doz, A09, 0));
        } else {
            if (A0D != null) {
                try {
                    num = Integer.valueOf(A90.A04(A0D));
                } catch (AnonymousClass9HX e) {
                    C25913CoX.A00(doz, "WaRcRichTextComponentBinderUtils", AnonymousClass8BS.A0l(A0D, "Failed to parse text color %s", new Object[1], 0), e);
                }
            }
            num = null;
        }
        if (num != null) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(num.intValue()), 0, A0e.length(), 0);
        }
        String A0h = BE7.A0h(dfl2);
        if (A0h != null) {
            try {
                spannableStringBuilder.setSpan(new AbsoluteSizeSpan(Math.round(A90.A01(A0h))), 0, A0e.length(), 0);
            } catch (AnonymousClass9HX e2) {
                C25913CoX.A00(doz, "WaRcRichTextComponentBinderUtils", AnonymousClass8BS.A0l(A0D, "Failed to parse text color %s", new Object[1], 0), e2);
            }
        }
        String A0i = BE7.A0i(dfl2);
        if (A0i != null) {
            try {
                spannableStringBuilder.setSpan(new StyleSpan(A90.A07(A0i)), 0, A0e.length(), 0);
            } catch (AnonymousClass9HX e3) {
                C25913CoX.A00(doz, "WaRcRichTextComponentBinderUtils", String.format("Failed to textStyle  %s", new Object[]{A0h}), e3);
            }
        }
        Matcher matcher = A00.matcher(A0e);
        int i3 = 0;
        while (matcher.find()) {
            String group = matcher.group();
            int A01 = C20099A7c.A01(group.replaceAll("[\\[\\]]", ""), -1);
            if (A01 >= 0 && A01 < dfl2.A0E().size()) {
                DFL A0G = AnonymousClass8BR.A0G(dfl2.A0E(), A01);
                String A0f = BE7.A0f(A0G);
                if (objArr != null) {
                    A0f = MessageFormat.format(A0f, objArr);
                }
                int start = matcher.start() + i3;
                if (A0f != null) {
                    int length = A0f.length();
                    int length2 = group.length();
                    i3 += length - length2;
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(A0f);
                    String A0D2 = A0G.A0D(i2);
                    if (A0D2 != null) {
                        try {
                            spannableStringBuilder2.setSpan(new ForegroundColorSpan(A90.A04(A0D2)), i, length, i);
                        } catch (AnonymousClass9HX unused) {
                            C25913CoX.A01("WaRcRichTextComponentBinderUtils", "Error parsing TextSpan color");
                        }
                    }
                    DFL A092 = A0G.A09(44);
                    if (A092 != null) {
                        spannableStringBuilder2.setSpan(new ForegroundColorSpan(C25340Cdz.A01(doz2, A092, i)), 0, length, 0);
                    }
                    String A0i2 = BE7.A0i(A0G);
                    if (A0i2 != null) {
                        try {
                            spannableStringBuilder2.setSpan(new AbsoluteSizeSpan(Math.round(TypedValue.applyDimension(2, A90.A02(A0i2), C108965cb.A08(doz2.A00)))), 0, length, 0);
                        } catch (AnonymousClass9HX unused2) {
                            C25913CoX.A01("WaRcRichTextComponentBinderUtils", "Error parsing TextSpan size");
                        }
                    }
                    String A0D3 = A0G.A0D(43);
                    if (A0D3 != null) {
                        try {
                            spannableStringBuilder2.setSpan(new StyleSpan(A90.A07(A0D3)), 0, length, 0);
                        } catch (AnonymousClass9HX unused3) {
                            C25913CoX.A01("WaRcRichTextComponentBinderUtils", "Error parsing TextSpan textStyle");
                        }
                    }
                    String A0d = BE7.A0d(A0G);
                    if (A0d != null) {
                        spannableStringBuilder2.setSpan(new TypefaceSpan(A0d), 0, length, 0);
                    }
                    E8A A0A = A0G.A0A(36);
                    if (A0A != null) {
                        int A0B = C72463Mc.A0B(num);
                        if (A092 != null) {
                            A0B = C25340Cdz.A00(doz2, A092);
                        }
                        spannableStringBuilder2.setSpan(new C166588d9(new C21455AkM(dfl2, A0A, doz2, 42), A0B), 0, length, 0);
                    }
                    spannableStringBuilder.replace(start, length2 + start, spannableStringBuilder2);
                }
            }
            i = 0;
            i2 = 40;
        }
        return spannableStringBuilder;
    }
}
