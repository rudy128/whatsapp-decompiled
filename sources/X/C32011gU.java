package X;

import android.text.Spannable;
import android.text.style.URLSpan;
import android.util.Pair;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.1gU  reason: invalid class name and case insensitive filesystem */
public final class C32011gU {
    public final C18030ve A00;

    public C32011gU(C18030ve r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public static final String A00(String str) {
        StringBuilder sb;
        C18070vi.A0d(str, 0);
        String[] strArr = C50912Wg.A03;
        int i = 0;
        while (true) {
            String str2 = strArr[i];
            if (!C60402ny.A01(str, str2)) {
                i++;
                if (i >= 2) {
                    sb = new StringBuilder();
                    sb.append("https://");
                    sb.append(str);
                    break;
                }
            } else if (C18070vi.A18(str2, "https") && str.regionMatches(0, str2, 0, str2.length())) {
                return str;
            } else {
                sb = new StringBuilder();
                sb.append("https");
                String substring = str.substring(str2.length());
                C18070vi.A0X(substring);
                sb.append(substring);
            }
        }
        return sb.toString();
    }

    public static final ArrayList A01(Spannable spannable) {
        CharSequence charSequence;
        Pair A002;
        ArrayList arrayList = new ArrayList();
        Pattern pattern = C50912Wg.A00;
        if (spannable.length() > 4096) {
            charSequence = spannable.subSequence(0, ZipDecompressor.UNZIP_BUFFER_SIZE);
        } else {
            charSequence = spannable;
        }
        Matcher matcher = pattern.matcher(charSequence);
        while (matcher.find()) {
            String group = matcher.group(5);
            String group2 = matcher.group(6);
            if ((group == null || group.length() == 0 || group2 == null || group2.length() == 0 || C50912Wg.A02.matcher(group2).matches()) && (A002 = C60402ny.A00(spannable, matcher.start(), matcher.end())) != null) {
                arrayList.add(new AnonymousClass1D6(A002.first, A002.second));
            }
        }
        return arrayList;
    }

    public final String A02(String str) {
        String str2;
        ArrayList A04 = A04(str, true);
        if (A04 == null || (str2 = (String) A04.get(0)) == null) {
            return null;
        }
        return A00(str2);
    }

    public final ArrayList A03(String str) {
        ArrayList A04 = A04(str, false);
        if (A04 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(A04.size());
        Iterator it = A04.iterator();
        C18070vi.A0X(it);
        while (it.hasNext()) {
            Object next = it.next();
            C18070vi.A0X(next);
            String A002 = A00((String) next);
            if (!arrayList.contains(A002)) {
                arrayList.add(A002);
            }
        }
        return arrayList;
    }

    public final ArrayList A04(String str, boolean z) {
        int length;
        Pattern pattern;
        String str2;
        ArrayList arrayList = null;
        if (!(str == null || (length = str.length()) == 0)) {
            boolean A05 = C18020vd.A05(C18040vf.A02, this.A00, 6517);
            if (A05) {
                pattern = C50912Wg.A00;
            } else {
                pattern = C50912Wg.A01;
            }
            if (length > 4096) {
                str2 = str.substring(0, ZipDecompressor.UNZIP_BUFFER_SIZE);
                C18070vi.A0X(str2);
            } else {
                str2 = str;
            }
            Matcher matcher = pattern.matcher(str2);
            while (matcher.find()) {
                Pair A002 = C60402ny.A00(str, matcher.start(), matcher.end());
                if (A002 != null) {
                    Object obj = A002.first;
                    C18070vi.A0W(obj);
                    int intValue = ((Number) obj).intValue();
                    Object obj2 = A002.second;
                    C18070vi.A0W(obj2);
                    String substring = str.substring(intValue, ((Number) obj2).intValue());
                    C18070vi.A0X(substring);
                    if (!A05) {
                        String[] strArr = C50912Wg.A03;
                        int i = 0;
                        while (true) {
                            if (C60402ny.A01(substring, strArr[i])) {
                                break;
                            }
                            i++;
                            if (i >= 2) {
                                break;
                            }
                        }
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        arrayList.add(substring);
                        if (z) {
                            return arrayList;
                        }
                    } else if (!arrayList.contains(substring)) {
                        arrayList.add(substring);
                    }
                }
            }
        }
        return arrayList;
    }

    public final void A05(Spannable spannable) {
        ArrayList A01 = A01(spannable);
        A01.isEmpty();
        Iterator it = A01.iterator();
        while (it.hasNext()) {
            AnonymousClass1D6 r1 = (AnonymousClass1D6) it.next();
            int intValue = ((Number) r1.first).intValue();
            int intValue2 = ((Number) r1.second).intValue();
            spannable.setSpan(new URLSpan(A00(spannable.subSequence(intValue, intValue2).toString())), intValue, intValue2, 33);
        }
    }
}
