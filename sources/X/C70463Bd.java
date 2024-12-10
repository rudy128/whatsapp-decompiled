package X;

import java.io.Serializable;
import java.util.regex.Pattern;

/* renamed from: X.3Bd  reason: invalid class name and case insensitive filesystem */
public final class C70463Bd implements Serializable {
    public static final long serialVersionUID = 0;
    public final int flags;
    public final String pattern;

    private final Object readResolve() {
        Pattern compile = Pattern.compile(this.pattern, this.flags);
        C18070vi.A0X(compile);
        return new C41661wr(compile);
    }

    public C70463Bd(String str, int i) {
        this.pattern = str;
        this.flags = i;
    }
}
