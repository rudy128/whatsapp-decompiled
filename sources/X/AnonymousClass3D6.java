package X;

import java.lang.Character;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.3D6  reason: invalid class name */
public final class AnonymousClass3D6 implements Iterator {
    public static final Pattern A08;
    public static final Pattern A09;
    public static final Pattern A0A = Pattern.compile("\\d{1,5}-+\\d{1,5}\\s{0,4}\\(\\d{1,4}");
    public static final Pattern A0B = Pattern.compile("(?:(?:[0-3]?\\d/[01]?\\d)|(?:[01]?\\d/[0-3]?\\d))/(?:[12]\\d)?\\d{2}");
    public static final Pattern A0C = Pattern.compile("[12]\\d{3}[-/]?[01]\\d[-/]?[0-3]\\d [0-2]\\d$");
    public static final Pattern A0D = Pattern.compile(":[0-5]\\d");
    public static final Pattern A0E;
    public static final Pattern A0F;
    public long A00;
    public C59212lw A01 = null;
    public Integer A02 = AnonymousClass00R.A00;
    public int A03 = 0;
    public final CharSequence A04;
    public final C49322Qa A05;
    public final C42771yi A06;
    public final String A07;

    private C59212lw A00(String str, int i) {
        char charAt;
        char charAt2;
        try {
            String str2 = str;
            if (A0F.matcher(str).matches()) {
                C49322Qa r3 = this.A05;
                if (r3.compareTo(C49322Qa.A00) >= 0) {
                    if (i > 0 && !A0E.matcher(str).lookingAt() && ((charAt2 = this.A04.charAt(i - 1)) == '%' || Character.getType(charAt2) == 26 || A03(charAt2))) {
                        return null;
                    }
                    int length = str.length() + i;
                    CharSequence charSequence = this.A04;
                    if (length < charSequence.length() && ((charAt = charSequence.charAt(length)) == '%' || Character.getType(charAt) == 26 || A03(charAt))) {
                        return null;
                    }
                }
                C42771yi r5 = this.A06;
                String str3 = this.A07;
                C42811ym r6 = new C42811ym();
                C42771yi.A06(r5, r6, str2, str3, true, true);
                if (r3.A00(r5, r6, str)) {
                    r6.hasCountryCodeSource = false;
                    r6.countryCodeSource_ = C42821yn.FROM_NUMBER_WITH_PLUS_SIGN;
                    r6.hasRawInput = false;
                    r6.rawInput_ = "";
                    r6.hasPreferredDomesticCarrierCode = false;
                    r6.preferredDomesticCarrierCode_ = "";
                    return new C59212lw(r6, str, i);
                }
                return null;
            }
            return null;
        } catch (C24931Mf unused) {
        }
    }

    public static boolean A05(C42771yi r5, C42811ym r6, String str) {
        int i = 0;
        while (i < str.length() - 1) {
            char charAt = str.charAt(i);
            if (charAt == 'x' || charAt == 'X') {
                char charAt2 = str.charAt(i + 1);
                if (charAt2 == 'x' || charAt2 == 'X') {
                    i++;
                    if (r5.A0C(r6, str.substring(i)) != C49392Qh.NSN_MATCH) {
                        return false;
                    }
                } else if (!C42771yi.A05(str.substring(i), false).toString().equals(r6.extension_)) {
                    return false;
                }
            }
            i++;
        }
        return true;
    }

    public static boolean A06(C42811ym r4, StringBuilder sb, String[] strArr) {
        int i = 0;
        int i2 = 0;
        while (i < strArr.length) {
            int indexOf = sb.indexOf(strArr[i], i2);
            if (indexOf < 0) {
                return false;
            }
            i2 = indexOf + strArr[i].length();
            if (i != 0 || i2 >= sb.length() || !Character.isDigit(sb.charAt(i2))) {
                i++;
            } else {
                return sb.substring(i2 - strArr[i].length()).startsWith(C42771yi.A03(r4));
            }
        }
        return sb.substring(i2).contains(r4.extension_);
    }

    static {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("[^");
        A10.append("(\\[（［");
        A10.append(")\\]）］");
        String A0y = AnonymousClass000.A0y("]", A10);
        String A022 = A02(0, 3);
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("(?:[");
        A102.append("(\\[（［");
        A102.append("])?(?:");
        A102.append(A0y);
        A102.append("+[");
        A102.append(")\\]）］");
        A102.append("])?");
        A102.append(A0y);
        C17900vP.A0c("+(?:[", "(\\[（［", "]", A0y, A102);
        A102.append("+[");
        A102.append(")\\]）］");
        C17890vO.A10("])", A022, A0y, A102);
        A0F = Pattern.compile(AnonymousClass000.A0y("*", A102));
        String A023 = A02(0, 2);
        String A024 = A02(0, 4);
        String A025 = A02(0, 19);
        String A1H = AnonymousClass001.A1H("[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～]", A024, AnonymousClass000.A10());
        StringBuilder A103 = AnonymousClass000.A10();
        A103.append("\\p{Nd}");
        String A0y2 = AnonymousClass000.A0y(A02(1, 19), A103);
        String A0y3 = AnonymousClass000.A0y("+＋", AnonymousClass000.A11("(\\[（［"));
        StringBuilder A104 = AnonymousClass000.A10();
        C17890vO.A10("[", A0y3, "]", A104);
        String obj = A104.toString();
        A0E = Pattern.compile(obj);
        StringBuilder A105 = AnonymousClass000.A10();
        A105.append("\\p{Z}[^");
        A105.append(A0y3);
        A08 = Pattern.compile(AnonymousClass000.A0y("\\p{Nd}]*", A105));
        StringBuilder A106 = AnonymousClass000.A10();
        C17890vO.A10("(?:", obj, A1H, A106);
        C17900vP.A0c(")", A023, A0y2, "(?:", A106);
        C17900vP.A0c(A1H, A0y2, ")", A025, A106);
        A106.append("(?:");
        A106.append(C42771yi.A08);
        A09 = Pattern.compile(AnonymousClass000.A0y(")?", A106), 66);
    }

    public static boolean A04(C42771yi r5, C42811ym r6) {
        C42831yo A0G;
        C42901yv A0E2;
        if (!(r6.countryCodeSource_ != C42821yn.FROM_DEFAULT_COUNTRY || (A0G = r5.A0G(r5.A0I(r6.countryCode_))) == null || (A0E2 = r5.A0E(C42771yi.A03(r6), A0G.numberFormat_)) == null)) {
            String str = A0E2.nationalPrefixFormattingRule_;
            if (str.length() > 0 && !A0E2.nationalPrefixOptionalWhenFormatting_ && C42771yi.A05(str.substring(0, str.indexOf("$1")), false).toString().length() != 0) {
                return r5.A0L(A0G, new StringBuilder(C42771yi.A05(r6.rawInput_, false).toString()), (StringBuilder) null);
            }
        }
        return true;
    }

    public boolean hasNext() {
        C59212lw r0;
        Integer num = this.A02;
        if (num == AnonymousClass00R.A00) {
            int i = this.A03;
            Pattern pattern = A09;
            CharSequence charSequence = this.A04;
            Matcher matcher = pattern.matcher(charSequence);
            while (true) {
                if (this.A00 <= 0 || !matcher.find(i)) {
                    r0 = null;
                } else {
                    int start = matcher.start();
                    CharSequence A012 = A01(charSequence.subSequence(start, matcher.end()), C42771yi.A0G);
                    if (!A0A.matcher(A012).find() && !A0B.matcher(A012).find()) {
                        if (A0C.matcher(A012).find()) {
                            if (A0D.matcher(charSequence.toString().substring(A012.length() + start)).lookingAt()) {
                                continue;
                            }
                        }
                        String charSequence2 = A012.toString();
                        r0 = A00(charSequence2, start);
                        if (r0 != null) {
                            break;
                        }
                        Matcher matcher2 = A08.matcher(charSequence2);
                        if (matcher2.find()) {
                            String substring = charSequence2.substring(0, matcher2.start());
                            Pattern pattern2 = C42771yi.A0H;
                            CharSequence A013 = A01(substring, pattern2);
                            r0 = A00(A013.toString(), start);
                            if (r0 != null) {
                                break;
                            }
                            this.A00--;
                            int end = matcher2.end();
                            r0 = A00(A01(charSequence2.substring(end), pattern2).toString(), start + end);
                            if (r0 != null) {
                                break;
                            }
                            long j = this.A00 - 1;
                            this.A00 = j;
                            if (j > 0) {
                                while (matcher2.find()) {
                                    end = matcher2.start();
                                }
                                CharSequence A014 = A01(charSequence2.substring(0, end), pattern2);
                                if (!A014.equals(A013)) {
                                    r0 = A00(A014.toString(), start);
                                    if (r0 != null) {
                                        break;
                                    }
                                    this.A00--;
                                } else {
                                    continue;
                                }
                            } else {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    }
                    i = start + A012.length();
                    this.A00--;
                }
            }
            this.A01 = r0;
            if (r0 == null) {
                num = AnonymousClass00R.A0C;
            } else {
                this.A03 = r0.A00 + r0.A01.length();
                num = AnonymousClass00R.A01;
            }
            this.A02 = num;
        }
        return AnonymousClass000.A1Z(num, AnonymousClass00R.A01);
    }

    public static CharSequence A01(CharSequence charSequence, Pattern pattern) {
        Matcher matcher = pattern.matcher(charSequence);
        if (matcher.find()) {
            return charSequence.subSequence(0, matcher.start());
        }
        return charSequence;
    }

    public static String A02(int i, int i2) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("{");
        A10.append(i);
        A10.append(",");
        A10.append(i2);
        return AnonymousClass000.A0y("}", A10);
    }

    public static boolean A03(char c) {
        if (Character.isLetter(c) || Character.getType(c) == 6) {
            Character.UnicodeBlock of = Character.UnicodeBlock.of(c);
            if (of.equals(Character.UnicodeBlock.BASIC_LATIN) || of.equals(Character.UnicodeBlock.LATIN_1_SUPPLEMENT) || of.equals(Character.UnicodeBlock.LATIN_EXTENDED_A) || of.equals(Character.UnicodeBlock.LATIN_EXTENDED_ADDITIONAL) || of.equals(Character.UnicodeBlock.LATIN_EXTENDED_B) || of.equals(Character.UnicodeBlock.COMBINING_DIACRITICAL_MARKS)) {
                return true;
            }
        }
        return false;
    }

    public /* bridge */ /* synthetic */ Object next() {
        if (hasNext()) {
            C59212lw r1 = this.A01;
            this.A01 = null;
            this.A02 = AnonymousClass00R.A00;
            return r1;
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        throw C17880vN.A0y();
    }

    public AnonymousClass3D6(C49322Qa r4, C42771yi r5, CharSequence charSequence, String str) {
        this.A06 = r5;
        this.A04 = charSequence;
        this.A07 = str;
        this.A05 = r4;
        this.A00 = Long.MAX_VALUE;
    }
}
