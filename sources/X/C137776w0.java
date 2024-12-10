package X;

import android.os.Environment;
import java.util.Locale;

/* renamed from: X.6w0  reason: invalid class name and case insensitive filesystem */
public abstract class C137776w0 {
    public static final String A00;
    public static final String A01;
    public static final String A02;
    public static final C129026h8[] A03 = {new C129026h8(4, 1, A00(A00), 2131890605), new C129026h8(5, 4, A00(A00), 2131890607), new C129026h8(6, 2, A00(A00), 2131890605), new C129026h8(0, 1, (String) null, 2131886643), new C129026h8(1, 4, (String) null, 2131886645), new C129026h8(2, 2, (String) null, 2131886642)};
    public static final C129026h8[] A04 = {new C129026h8(7, 7, A00(A00), 2131890604), new C129026h8(3, 7, (String) null, 2131886644), new C129026h8(1, 4, (String) null, 2131886645)};
    public static final C129026h8[] A05 = {new C129026h8(3, 7, (String) null, 2131894952), new C129026h8(7, 7, A00(A00), 2131890604), new C129026h8(1, 4, (String) null, 2131886646), new C129026h8(10, 7, A00(A02), 2131895471), new C129026h8(11, 7, A00(A01), 2131889569)};

    static {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(Environment.getExternalStorageDirectory());
        A00 = AnonymousClass000.A0y("/DCIM/Camera", A10);
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append(Environment.getExternalStorageDirectory());
        A02 = AnonymousClass000.A0y("/DCIM/Screenshots", A102);
        StringBuilder A103 = AnonymousClass000.A10();
        A103.append(Environment.getExternalStorageDirectory());
        A01 = AnonymousClass000.A0y("/Download", A103);
    }

    public static final String A00(String str) {
        Locale locale = Locale.getDefault();
        C18070vi.A0X(locale);
        String lowerCase = str.toLowerCase(locale);
        C18070vi.A0X(lowerCase);
        return String.valueOf(lowerCase.hashCode());
    }
}
