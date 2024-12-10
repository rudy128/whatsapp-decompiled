package X;

import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: X.CjU  reason: case insensitive filesystem */
public class C25641CjU {
    public static final Pattern A01 = Pattern.compile("\\s*,\\s*");
    public final List A00;

    public C25641CjU(List list) {
        this.A00 = Collections.unmodifiableList(list);
    }

    public String toString() {
        return BEA.A0m(C25888Cnz.A00(this.A00, ",", ""), BE9.A0q());
    }
}
