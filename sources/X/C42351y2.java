package X;

import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.widget.TextView;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: X.1y2  reason: invalid class name and case insensitive filesystem */
public final class C42351y2 {
    public final AnonymousClass118 A00;
    public final C18000vb A01;
    public final AnonymousClass11S A02;

    public C42351y2(AnonymousClass11S r2, AnonymousClass118 r3, C18000vb r4) {
        C18070vi.A0d(r3, 1);
        C18070vi.A0d(r2, 2);
        C18070vi.A0d(r4, 3);
        this.A00 = r3;
        this.A02 = r2;
        this.A01 = r4;
    }

    public final SpannableStringBuilder A00(TextView textView, C445823z r10, AnonymousClass1BI r11, Integer num, Integer num2, Integer num3) {
        int i;
        AnonymousClass118 r4;
        String A012;
        C18070vi.A0d(r10, 0);
        boolean A0O = this.A02.A0O(r11);
        switch (num.intValue()) {
            case 0:
                int i2 = 2131890073;
                if (A0O) {
                    i2 = 2131890072;
                }
                r4 = this.A00;
                C18000vb r3 = this.A01;
                String A022 = r4.A02(i2, r10.A06, new SimpleDateFormat("MMM dd", r3.A0N()).format(new Date(r10.A00)), new SimpleDateFormat("h:mma", r3.A0N()).format(new Date(r10.A00)));
                C18070vi.A0X(A022);
                A012 = A8I.A01(r3, A022, r10.A00);
                break;
            case 1:
                i = 2131890089;
                if (A0O) {
                    i = 2131890088;
                    break;
                }
                break;
            case 2:
                i = 2131890060;
                if (A0O) {
                    i = 2131890059;
                    break;
                }
                break;
            case 3:
                i = 2131890134;
                if (A0O) {
                    i = 2131890133;
                    break;
                }
                break;
            case 4:
                i = 2131890136;
                if (A0O) {
                    i = 2131890135;
                    break;
                }
                break;
            case 5:
                i = 2131890140;
                if (A0O) {
                    i = 2131890139;
                    break;
                }
                break;
            case 6:
                i = 2131890138;
                if (A0O) {
                    i = 2131890137;
                    break;
                }
                break;
            default:
                r4 = this.A00;
                i = 2131890142;
                break;
        }
        r4 = this.A00;
        A012 = r4.A02(i, r10.A06);
        C18070vi.A0X(A012);
        if (num3 != null && (A012 = AnonymousClass1EG.A0E(A012, num3.intValue())) == null) {
            throw new IllegalStateException("Should never happen according to method contract");
        } else if (num2.intValue() != 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" ");
            Drawable A023 = AnonymousClass4aX.A02(r4.A00, 2131233223, 2131101888);
            C18070vi.A0X(A023);
            if (textView != null) {
                AnonymousClass4aX.A0C(A023, textView);
            }
            spannableStringBuilder.setSpan(new ImageSpan(A023), 0, 1, 33);
            SpannableStringBuilder append = new SpannableStringBuilder().append(spannableStringBuilder);
            StringBuilder sb = new StringBuilder();
            sb.append(' ');
            sb.append(A012);
            SpannableStringBuilder append2 = append.append(sb.toString());
            C18070vi.A0X(append2);
            return append2;
        } else {
            C56302hF r42 = C61522pp.A03;
            if (A012.length() > 0) {
                StringBuilder sb2 = new StringBuilder();
                char charAt = A012.charAt(0);
                String valueOf = String.valueOf(charAt);
                C18070vi.A0z(valueOf, "null cannot be cast to non-null type java.lang.String");
                String upperCase = valueOf.toUpperCase(Locale.ROOT);
                C18070vi.A0X(upperCase);
                if (upperCase.length() <= 1) {
                    upperCase = String.valueOf(Character.toTitleCase(charAt));
                } else if (charAt != 329) {
                    char charAt2 = upperCase.charAt(0);
                    String substring = upperCase.substring(1);
                    C18070vi.A0X(substring);
                    String lowerCase = substring.toLowerCase(Locale.ROOT);
                    C18070vi.A0X(lowerCase);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(charAt2);
                    sb3.append(lowerCase);
                    upperCase = sb3.toString();
                }
                sb2.append(upperCase);
                String substring2 = A012.substring(1);
                C18070vi.A0X(substring2);
                sb2.append(substring2);
                A012 = sb2.toString();
            }
            return new SpannableStringBuilder(r42.A00(A012, "🗓", (String) null));
        }
    }
}
