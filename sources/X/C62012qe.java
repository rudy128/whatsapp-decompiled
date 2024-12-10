package X;

import java.util.regex.Pattern;

/* renamed from: X.2qe  reason: invalid class name and case insensitive filesystem */
public class C62012qe {
    public static final AnonymousClass00H A03 = new C18150vq((Object) null, new C21517AlQ(26));
    public static final AnonymousClass00H A04 = new C18150vq((Object) null, new C21517AlQ(28));
    public static final AnonymousClass00H A05 = new C18150vq((Object) null, new C21517AlQ(27));
    public final AnonymousClass1MZ A00;
    public final AnonymousClass1TM A01;
    public final AnonymousClass00H A02 = C221618v.A00(AnonymousClass17K.class);

    public boolean A00(AnonymousClass1E7 r3) {
        this.A02.get();
        String A032 = AnonymousClass17K.A03(AnonymousClass1E7.A00(r3));
        if (A032 == null) {
            return false;
        }
        return ((Pattern) A03.get()).matcher(A032).matches();
    }

    public C62012qe(AnonymousClass1MZ r2, AnonymousClass1TM r3) {
        this.A01 = r3;
        this.A00 = r2;
    }
}
