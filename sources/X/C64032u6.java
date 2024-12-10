package X;

import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.2u6  reason: invalid class name and case insensitive filesystem */
public class C64032u6 {
    public static final Pattern A0M = Pattern.compile("\\[([^\\[\\]])*\\]");
    public static final Pattern A0N = Pattern.compile("[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～]*(\\$\\d[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～]*)+");
    public static final Pattern A0O = Pattern.compile("[- ]");
    public static final Pattern A0P = Pattern.compile("\\d(?=[^,}][^,}])");
    public static final C42831yo A0Q;
    public static final Pattern A0R = Pattern.compile(" ");
    public int A00 = 0;
    public int A01 = 0;
    public C42831yo A02;
    public C42781yj A03;
    public String A04 = "";
    public String A05 = "";
    public StringBuilder A06 = AnonymousClass000.A10();
    public StringBuilder A07 = AnonymousClass000.A10();
    public StringBuilder A08 = AnonymousClass000.A10();
    public StringBuilder A09 = AnonymousClass000.A10();
    public StringBuilder A0A = AnonymousClass000.A10();
    public List A0B = AnonymousClass000.A13();
    public boolean A0C = true;
    public boolean A0D = false;
    public boolean A0E = false;
    public boolean A0F = false;
    public int A0G = 0;
    public C42831yo A0H;
    public String A0I = "";
    public String A0J;
    public boolean A0K = false;
    public final C42771yi A0L = C42771yi.A00();

    static {
        C42831yo r2 = new C42831yo();
        r2.hasInternationalPrefix = true;
        r2.internationalPrefix_ = "NA";
        A0Q = r2;
    }

    private C42831yo A00(String str) {
        int i;
        C42771yi r4 = this.A0L;
        if (str == null || !r4.A07.contains(str)) {
            Logger logger = C42771yi.A0A;
            Level level = Level.WARNING;
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Invalid or missing region code (");
            if (str == null) {
                str = "null";
            }
            A10.append(str);
            logger.log(level, AnonymousClass000.A0y(") provided.", A10));
            i = 0;
        } else {
            C42831yo A0G2 = r4.A0G(str);
            if (A0G2 != null) {
                i = A0G2.countryCode_;
            } else {
                StringBuilder A102 = AnonymousClass000.A10();
                A102.append("Invalid region code: ");
                throw AnonymousClass001.A12(str, A102);
            }
        }
        C42831yo A0G3 = r4.A0G(r4.A0I(i));
        if (A0G3 == null) {
            return A0Q;
        }
        return A0G3;
    }

    private String A01() {
        C42831yo r1;
        List<C42901yv> list;
        List list2;
        StringBuilder sb = this.A09;
        if (sb.length() < 3) {
            return A06(sb.toString());
        }
        String substring = sb.substring(0, 3);
        C42831yo r12 = this.A02;
        if (r12 != null) {
            if (!this.A0D || (list2 = r12.intlNumberFormat_) == null || list2.size() <= 0) {
                r1 = this.A02;
                list = r1.numberFormat_;
            } else {
                r1 = this.A02;
                list = r1.intlNumberFormat_;
            }
            boolean z = r1.hasNationalPrefix;
            for (C42901yv r2 : list) {
                if (z && !this.A0D && !r2.nationalPrefixOptionalWhenFormatting_) {
                    if (!C42771yi.A0D.matcher(r2.nationalPrefixFormattingRule_).matches()) {
                    }
                }
                if (A0N.matcher(r2.format_).matches()) {
                    this.A0B.add(r2);
                }
            }
            A07(substring);
        }
        if (A0A()) {
            return A02();
        }
        return this.A06.toString();
    }

    private String A02() {
        StringBuilder sb;
        String A042;
        StringBuilder sb2 = this.A09;
        int length = sb2.length();
        if (length > 0) {
            int i = 0;
            do {
                A042 = A04(sb2.charAt(i));
                i++;
            } while (i < length);
            if (this.A0C) {
                return A06(A042);
            }
            sb = this.A06;
        } else {
            sb = this.A0A;
        }
        return sb.toString();
    }

    private String A03() {
        C42831yo r0 = this.A02;
        boolean z = false;
        if (r0 != null && r0.countryCode_ == 1) {
            StringBuilder sb = this.A09;
            if (!(sb.charAt(0) != '1' || sb.charAt(1) == '0' || sb.charAt(1) == '1')) {
                z = true;
            }
        }
        int i = 1;
        if (z) {
            StringBuilder sb2 = this.A0A;
            sb2.append('1');
            sb2.append(' ');
            this.A0D = true;
        } else {
            C42831yo r2 = this.A02;
            if (r2 != null && r2.hasNationalPrefixForParsing) {
                Pattern A002 = this.A03.A00(r2.nationalPrefixForParsing_);
                StringBuilder sb3 = this.A09;
                Matcher matcher = A002.matcher(sb3);
                if (matcher.lookingAt()) {
                    this.A0D = true;
                    i = matcher.end();
                    this.A0A.append(sb3.substring(0, i));
                }
            }
            i = 0;
        }
        StringBuilder sb4 = this.A09;
        String substring = sb4.substring(0, i);
        sb4.delete(0, i);
        return substring;
    }

    private String A04(char c) {
        Pattern pattern = A0R;
        StringBuilder sb = this.A08;
        Matcher matcher = pattern.matcher(sb);
        if (matcher.find(this.A0G)) {
            String replaceFirst = matcher.replaceFirst(Character.toString(c));
            sb.replace(0, replaceFirst.length(), replaceFirst);
            int start = matcher.start();
            this.A0G = start;
            return sb.substring(0, start + 1);
        }
        if (this.A0B.size() == 1) {
            this.A0C = false;
        }
        this.A0I = "";
        return this.A06.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0044, code lost:
        if (r7.A08() != false) goto L_0x0046;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A05(X.C64032u6 r7, char r8, boolean r9) {
        /*
            java.lang.StringBuilder r2 = r7.A06
            r2.append(r8)
            if (r9 == 0) goto L_0x000d
            int r0 = r2.length()
            r7.A00 = r0
        L_0x000d:
            boolean r0 = java.lang.Character.isDigit(r8)
            r5 = 1
            if (r0 != 0) goto L_0x002a
            int r0 = r2.length()
            if (r0 != r5) goto L_0x00a7
            java.util.regex.Pattern r1 = X.C42771yi.A0F
            java.lang.String r0 = java.lang.Character.toString(r8)
            java.util.regex.Matcher r0 = r1.matcher(r0)
            boolean r0 = r0.matches()
            if (r0 == 0) goto L_0x00a7
        L_0x002a:
            r3 = 0
            r4 = 1
            if (r5 != 0) goto L_0x0082
            r7.A0C = r3
            r7.A0K = r4
        L_0x0032:
            boolean r0 = r7.A0C
            if (r0 != 0) goto L_0x00a9
            boolean r0 = r7.A0K
            if (r0 != 0) goto L_0x0160
            boolean r0 = r7.A09()
            if (r0 == 0) goto L_0x0054
            boolean r0 = r7.A08()
            if (r0 == 0) goto L_0x0160
        L_0x0046:
            r7.A0C = r4
            r7.A0E = r3
            java.util.List r0 = r7.A0B
            r0.clear()
            java.lang.String r0 = r7.A01()
            return r0
        L_0x0054:
            java.lang.String r1 = r7.A05
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x006c
            java.lang.StringBuilder r0 = r7.A09
            r0.insert(r3, r1)
            java.lang.StringBuilder r1 = r7.A0A
            java.lang.String r0 = r7.A05
            int r0 = r1.lastIndexOf(r0)
            r1.setLength(r0)
        L_0x006c:
            java.lang.String r1 = r7.A05
            java.lang.String r0 = r7.A03()
            boolean r0 = r1.equals(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0160
            java.lang.StringBuilder r1 = r7.A0A
            r0 = 32
            r1.append(r0)
            goto L_0x0046
        L_0x0082:
            r0 = 43
            if (r8 != r0) goto L_0x0095
            java.lang.StringBuilder r1 = r7.A07
            r0 = r1
        L_0x0089:
            r1.append(r8)
            if (r9 == 0) goto L_0x0032
            int r0 = r0.length()
            r7.A01 = r0
            goto L_0x0032
        L_0x0095:
            r1 = 10
            int r0 = java.lang.Character.digit(r8, r1)
            char r8 = java.lang.Character.forDigit(r0, r1)
            java.lang.StringBuilder r0 = r7.A07
            r0.append(r8)
            java.lang.StringBuilder r1 = r7.A09
            goto L_0x0089
        L_0x00a7:
            r5 = 0
            goto L_0x002a
        L_0x00a9:
            java.lang.StringBuilder r0 = r7.A07
            int r1 = r0.length()
            if (r1 == 0) goto L_0x0160
            if (r1 == r4) goto L_0x0160
            r0 = 2
            if (r1 == r0) goto L_0x0160
            r0 = 3
            if (r1 != r0) goto L_0x00c1
            boolean r0 = r7.A09()
            if (r0 == 0) goto L_0x0155
            r7.A0E = r4
        L_0x00c1:
            boolean r0 = r7.A0E
            if (r0 == 0) goto L_0x00e1
            boolean r0 = r7.A08()
            if (r0 == 0) goto L_0x00cd
            r7.A0E = r3
        L_0x00cd:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.StringBuilder r0 = r7.A0A
            r1.append(r0)
            java.lang.StringBuilder r0 = r7.A09
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            return r0
        L_0x00e1:
            java.util.List r1 = r7.A0B
            int r0 = r1.size()
            if (r0 <= 0) goto L_0x0150
            java.lang.String r3 = r7.A04(r8)
            java.util.Iterator r6 = r1.iterator()
        L_0x00f1:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0130
            java.lang.Object r5 = r6.next()
            X.1yv r5 = (X.C42901yv) r5
            X.1yj r1 = r7.A03
            java.lang.String r0 = r5.pattern_
            java.util.regex.Pattern r1 = r1.A00(r0)
            java.lang.StringBuilder r0 = r7.A09
            java.util.regex.Matcher r4 = r1.matcher(r0)
            boolean r0 = r4.matches()
            if (r0 == 0) goto L_0x00f1
            java.util.regex.Pattern r1 = A0O
            java.lang.String r0 = r5.nationalPrefixFormattingRule_
            java.util.regex.Matcher r0 = r1.matcher(r0)
            boolean r0 = r0.find()
            r7.A0F = r0
            java.lang.String r0 = r5.format_
            java.lang.String r0 = r4.replaceAll(r0)
            java.lang.String r1 = r7.A06(r0)
        L_0x0129:
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x0133
            return r1
        L_0x0130:
            java.lang.String r1 = ""
            goto L_0x0129
        L_0x0133:
            java.lang.StringBuilder r0 = r7.A09
            java.lang.String r0 = r0.toString()
            r7.A07(r0)
            boolean r0 = r7.A0A()
            if (r0 == 0) goto L_0x0147
            java.lang.String r0 = r7.A02()
            return r0
        L_0x0147:
            boolean r0 = r7.A0C
            if (r0 == 0) goto L_0x0160
            java.lang.String r0 = r7.A06(r3)
            return r0
        L_0x0150:
            java.lang.String r0 = r7.A01()
            return r0
        L_0x0155:
            java.lang.String r0 = r7.A03()
            r7.A05 = r0
            java.lang.String r0 = r7.A01()
            return r0
        L_0x0160:
            java.lang.String r0 = r2.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64032u6.A05(X.2u6, char, boolean):java.lang.String");
    }

    private String A06(String str) {
        StringBuilder A0f;
        StringBuilder sb = this.A0A;
        int length = sb.length();
        if (!this.A0F || length <= 0 || sb.charAt(length - 1) == ' ') {
            A0f = C17890vO.A0f(sb);
        } else {
            A0f = AnonymousClass000.A10();
            A0f.append(new String(sb));
            A0f.append(' ');
        }
        return AnonymousClass000.A0y(str, A0f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r0 = X.AnonymousClass000.A10();
        r3 = r5.A0L;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean A08() {
        /*
            r5 = this;
            java.lang.StringBuilder r4 = r5.A09
            int r0 = r4.length()
            r1 = 0
            if (r0 == 0) goto L_0x004a
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()
            X.1yi r3 = r5.A0L
            int r2 = r3.A0A(r4, r0)
            if (r2 == 0) goto L_0x004a
            r4.setLength(r1)
            r4.append(r0)
            java.lang.String r1 = r3.A0I(r2)
            java.lang.String r0 = "001"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x003d
            X.1yo r0 = r3.A0F(r2)
        L_0x002b:
            r5.A02 = r0
        L_0x002d:
            java.lang.String r0 = java.lang.Integer.toString(r2)
            java.lang.StringBuilder r1 = r5.A0A
            r1.append(r0)
            r0 = 32
            r1.append(r0)
            r0 = 1
            return r0
        L_0x003d:
            java.lang.String r0 = r5.A0J
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x002d
            X.1yo r0 = r5.A00(r1)
            goto L_0x002b
        L_0x004a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64032u6.A08():boolean");
    }

    private boolean A09() {
        C42831yo r3 = this.A02;
        if (r3 != null) {
            C42781yj r2 = this.A03;
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("\\+|");
            Pattern A002 = r2.A00(AnonymousClass000.A0y(r3.internationalPrefix_, A10));
            StringBuilder sb = this.A07;
            Matcher matcher = A002.matcher(sb);
            if (matcher.lookingAt()) {
                this.A0D = true;
                int end = matcher.end();
                StringBuilder sb2 = this.A09;
                sb2.setLength(0);
                sb2.append(sb.substring(end));
                StringBuilder sb3 = this.A0A;
                sb3.setLength(0);
                sb3.append(sb.substring(0, end));
                if (sb.charAt(0) != '+') {
                    sb3.append(' ');
                }
                return true;
            }
        }
        return false;
    }

    private boolean A0A() {
        String replaceAll;
        Iterator it = this.A0B.iterator();
        while (true) {
            if (!it.hasNext()) {
                this.A0C = false;
                break;
            }
            C42901yv r5 = (C42901yv) it.next();
            String str = r5.pattern_;
            if (this.A0I.equals(str)) {
                break;
            }
            if (str.indexOf(124) == -1) {
                String replaceAll2 = A0P.matcher(A0M.matcher(str).replaceAll("\\\\d")).replaceAll("\\\\d");
                StringBuilder sb = this.A08;
                sb.setLength(0);
                String str2 = r5.format_;
                Matcher matcher = this.A03.A00(replaceAll2).matcher("999999999999999");
                matcher.find();
                String group = matcher.group();
                if (group.length() < this.A09.length()) {
                    replaceAll = "";
                } else {
                    replaceAll = group.replaceAll(replaceAll2, str2).replaceAll("9", " ");
                }
                if (replaceAll.length() > 0) {
                    sb.append(replaceAll);
                    this.A0I = str;
                    this.A0F = A0O.matcher(r5.nationalPrefixFormattingRule_).find();
                    this.A0G = 0;
                    return true;
                }
            }
            it.remove();
        }
        return false;
    }

    public void A0B() {
        this.A04 = "";
        this.A06.setLength(0);
        this.A07.setLength(0);
        this.A08.setLength(0);
        this.A0G = 0;
        this.A0I = "";
        this.A0A.setLength(0);
        this.A05 = "";
        this.A09.setLength(0);
        this.A0C = true;
        this.A0K = false;
        this.A01 = 0;
        this.A00 = 0;
        this.A0D = false;
        this.A0E = false;
        this.A0B.clear();
        this.A0F = false;
        C42831yo r1 = this.A02;
        if (r1 == null || !r1.equals(this.A0H)) {
            this.A02 = A00(this.A0J);
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.1yj, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v1, types: [X.1yk, java.lang.Object] */
    public C64032u6(String str) {
        ? obj = new Object();
        ? obj2 = new Object();
        obj2.A00 = 64;
        obj2.A01 = new C42801yl(obj2, 86);
        obj.A00 = obj2;
        this.A03 = obj;
        this.A0J = str;
        C42831yo A002 = A00(str);
        this.A02 = A002;
        this.A0H = A002;
    }

    private void A07(String str) {
        int length = str.length() - 3;
        Iterator it = this.A0B.iterator();
        while (it.hasNext()) {
            C42901yv r2 = (C42901yv) it.next();
            if (r2.leadingDigitsPattern_.size() > length && !this.A03.A00(C17880vN.A0w(r2.leadingDigitsPattern_, length)).matcher(str).lookingAt()) {
                it.remove();
            }
        }
    }
}
