package X;

import android.util.Log;
import com.facebook.android.exoplayer2.util.Util;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.Cut  reason: case insensitive filesystem */
public abstract class C26214Cut {
    public static Pattern A00 = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$");
    public static final Pattern A01 = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$");

    public static DSC A01(File file, String str, long j, long j2, long j3) {
        long j4 = j3;
        File file2 = file;
        if (j3 <= 0) {
            j4 = file.length();
        }
        return new DSC(file2, str, j, j4, j2, true);
    }

    public static DSC A02(String str, long j) {
        return new DSC((File) null, str, j, -1, -1, false);
    }

    public static DSC A00(File file, long j, long j2, boolean z, boolean z2) {
        int lastIndexOf;
        int lastIndexOf2;
        long j3 = j2;
        long j4 = j;
        File file2 = file;
        if (z2) {
            String name = file2.getName();
            int lastIndexOf3 = name.lastIndexOf(46);
            if (lastIndexOf3 == -1 || (lastIndexOf = name.lastIndexOf(46, lastIndexOf3 - 1)) == -1 || (lastIndexOf2 = name.lastIndexOf(46, lastIndexOf - 1)) == -1) {
                return null;
            }
            String substring = name.substring(lastIndexOf2 + 1, lastIndexOf);
            int lastIndexOf4 = name.lastIndexOf(46, lastIndexOf2 - 1);
            if (lastIndexOf4 == -1) {
                return null;
            }
            String substring2 = name.substring(lastIndexOf4 + 1, lastIndexOf2);
            String A0o = AnonymousClass8BS.A0o(name, lastIndexOf4);
            if (j == -1) {
                j4 = file2.length();
            }
            if (j4 == 0) {
                return null;
            }
            if (j2 == -9223372036854775807L) {
                try {
                    j3 = Long.parseLong(substring);
                } catch (NumberFormatException e) {
                    Log.e("CacheSpan", AnonymousClass001.A1H("invalid filename: ", name, AnonymousClass000.A10()), e);
                    return null;
                }
            }
            return A01(file2, A0o, Long.parseLong(substring2), j3, j4);
        }
        Matcher matcher = A01.matcher(file2.getName());
        if (!matcher.matches()) {
            return null;
        }
        String group = matcher.group(1);
        if (!z) {
            int length = group.length();
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (group.charAt(i3) == '%') {
                    i2++;
                }
            }
            if (i2 != 0) {
                int i4 = length - (i2 * 2);
                StringBuilder A0t = BE6.A0t(i4);
                Matcher matcher2 = Util.A05.matcher(group);
                while (i2 > 0 && matcher2.find()) {
                    String group2 = matcher2.group(1);
                    C26056CrS.A01(group2);
                    char parseInt = (char) Integer.parseInt(group2, 16);
                    A0t.append(group, i, matcher2.start());
                    A0t.append(parseInt);
                    i = matcher2.end();
                    i2--;
                }
                if (i < length) {
                    A0t.append(group, i, length);
                }
                if (A0t.length() != i4) {
                    return null;
                }
                group = A0t.toString();
            }
            return A01(file2, group, Long.parseLong(matcher.group(2)), Long.parseLong(matcher.group(3)), j4);
        }
        if (group == null) {
            return null;
        }
        return A01(file2, group, Long.parseLong(matcher.group(2)), Long.parseLong(matcher.group(3)), j4);
    }

    public static File A03(File file, String str, long j, long j2, boolean z) {
        if (!z) {
            int length = str.length();
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (Util.A0B(str.charAt(i3))) {
                    i2++;
                }
            }
            if (i2 != 0) {
                StringBuilder A0q = BE7.A0q(i2 * 2, length);
                while (i2 > 0) {
                    int i4 = i + 1;
                    char charAt = str.charAt(i);
                    if (Util.A0B(charAt)) {
                        A0q.append('%');
                        BE7.A10(charAt, A0q);
                        i2--;
                    } else {
                        A0q.append(charAt);
                    }
                    i = i4;
                }
                if (i < length) {
                    A0q.append(str, i, length);
                }
                str = A0q.toString();
            }
        }
        StringBuilder A11 = AnonymousClass000.A11(str);
        A11.append(".");
        A11.append(j);
        A11.append(".");
        A11.append(j2);
        return AnonymousClass8BW.A0X(file, ".v2.exo", A11);
    }

    public static File A04(File file, boolean z) {
        Matcher matcher = A00.matcher(file.getName());
        if (!matcher.matches()) {
            return file;
        }
        File A03 = A03(file.getParentFile(), matcher.group(1), Long.parseLong(matcher.group(2)), Long.parseLong(matcher.group(3)), z);
        file.renameTo(A03);
        return A03;
    }
}
