package X;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.1wr  reason: invalid class name and case insensitive filesystem */
public final class C41661wr implements Serializable {
    public Set _options;
    public final Pattern nativePattern;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C41661wr(java.lang.String r2) {
        /*
            r1 = this;
            r0 = 1
            X.C18070vi.A0d(r2, r0)
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r2)
            X.C18070vi.A0X(r0)
            r1.<init>((java.util.regex.Pattern) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41661wr.<init>(java.lang.String):void");
    }

    public final String A00(CharSequence charSequence, String str) {
        C18070vi.A0d(charSequence, 0);
        String replaceAll = this.nativePattern.matcher(charSequence).replaceAll(str);
        C18070vi.A0X(replaceAll);
        return replaceAll;
    }

    public final List A01(CharSequence charSequence, int i) {
        C18070vi.A0d(charSequence, 0);
        Matcher matcher = this.nativePattern.matcher(charSequence);
        if (i == 1 || !matcher.find()) {
            List singletonList = Collections.singletonList(charSequence.toString());
            C18070vi.A0X(singletonList);
            return singletonList;
        }
        int i2 = 10;
        if (i > 0) {
            i2 = i;
        }
        ArrayList arrayList = new ArrayList(i2);
        int i3 = i - 1;
        int i4 = 0;
        do {
            arrayList.add(charSequence.subSequence(i4, matcher.start()).toString());
            i4 = matcher.end();
            if ((i3 >= 0 && arrayList.size() == i3) || !matcher.find()) {
                arrayList.add(charSequence.subSequence(i4, charSequence.length()).toString());
            }
            arrayList.add(charSequence.subSequence(i4, matcher.start()).toString());
            i4 = matcher.end();
            break;
        } while (!matcher.find());
        arrayList.add(charSequence.subSequence(i4, charSequence.length()).toString());
        return arrayList;
    }

    public final C133636pE A02(CharSequence charSequence, int i) {
        C18070vi.A0d(charSequence, 0);
        Matcher matcher = this.nativePattern.matcher(charSequence);
        C18070vi.A0X(matcher);
        if (!matcher.find(i)) {
            return null;
        }
        return new C133636pE(charSequence, matcher);
    }

    public final boolean A03(CharSequence charSequence) {
        C18070vi.A0d(charSequence, 0);
        return this.nativePattern.matcher(charSequence).matches();
    }

    private final Object writeReplace() {
        String pattern = this.nativePattern.pattern();
        C18070vi.A0X(pattern);
        return new C70463Bd(pattern, this.nativePattern.flags());
    }

    public String toString() {
        String obj = this.nativePattern.toString();
        C18070vi.A0X(obj);
        return obj;
    }

    public C41661wr(Pattern pattern) {
        this.nativePattern = pattern;
    }
}
