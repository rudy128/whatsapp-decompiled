package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.8tY  reason: invalid class name and case insensitive filesystem */
public abstract class C172518tY extends AnonymousClass7IA {
    public final AnonymousClass11W A00;

    public C172518tY(AnonymousClass181 r14, C19830z4 r15, C18030ve r16, C31611fq r17, AnonymousClass11W r18, AnonymousClass00H r19, C18140vp r20, C18140vp r21, long j) {
        super(r14, r15, r16, r17, r19, C197569wu.A08, (Map) null, r20, r21, j);
        this.A00 = r18;
        A09("search");
    }

    public String A05() {
        return this.A00.A04(A08());
    }

    public String A06() {
        String A06 = super.A06();
        HashMap A08 = A08();
        if (!A08.containsKey(A06)) {
            return A06;
        }
        String A1G = C108945cZ.A1G(A06, A08);
        if (A1G == null) {
            return "en_US";
        }
        return A1G;
    }
}
