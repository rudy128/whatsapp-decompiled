package X;

import java.util.regex.Pattern;

/* renamed from: X.1yj  reason: invalid class name and case insensitive filesystem */
public class C42781yj {
    public C42791yk A00;

    public Pattern A00(String str) {
        Object obj;
        C42791yk r2 = this.A00;
        synchronized (r2) {
            obj = r2.A01.get(str);
        }
        Pattern pattern = (Pattern) obj;
        if (pattern == null) {
            pattern = Pattern.compile(str);
            synchronized (r2) {
                r2.A01.put(str, pattern);
            }
        }
        return pattern;
    }
}
