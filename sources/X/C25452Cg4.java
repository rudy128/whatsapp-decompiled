package X;

import java.util.List;

/* renamed from: X.Cg4  reason: case insensitive filesystem */
public abstract class C25452Cg4 {
    public static final List A00;
    public static final List A01;
    public static final List A02;

    static {
        String[] strArr = new String[6];
        strArr[0] = "👍";
        strArr[1] = "❤️";
        strArr[2] = "😂";
        strArr[3] = "😮";
        strArr[4] = "😢";
        A00 = C18070vi.A0O("🙏", strArr, 5);
        String[] A1b = C17880vN.A1b("👍", "❤️", 7, 1);
        A1b[2] = "😂";
        A1b[3] = "😮";
        A1b[4] = "😢";
        A1b[5] = "🙏";
        A01 = C18070vi.A0O("🎉", A1b, 6);
        String[] strArr2 = new String[6];
        strArr2[0] = "👏";
        strArr2[1] = "🥰";
        strArr2[2] = "🥹";
        strArr2[3] = "😭";
        strArr2[4] = "🔥";
        A02 = C18070vi.A0O("🤣", strArr2, 5);
    }

    public static final boolean A00(String str) {
        if (C18070vi.A18(str, "🎉") || C18070vi.A18(str, "🎊") || C18070vi.A18(str, "🥳")) {
            return true;
        }
        return false;
    }
}
