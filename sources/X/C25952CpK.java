package X;

import android.content.Context;
import java.util.Arrays;

/* renamed from: X.CpK  reason: case insensitive filesystem */
public final class C25952CpK {
    public int A00;
    public Long A01;
    public final int A02;
    public final Context A03;
    public final C18000vb A04;

    public C25952CpK(Context context, C18000vb r3) {
        this.A03 = context;
        this.A04 = r3;
        this.A02 = C19740yt.A00(context, 2131102666);
        this.A00 = C19740yt.A00(context, 2131102662);
    }

    public static final String A00(C25952CpK cpK, String str, int i) {
        String A002 = C25970Cpd.A00(str);
        if (A002 == null) {
            return AnonymousClass3MY.A0m(cpK.A03.getResources(), i);
        }
        return A002;
    }

    public static final String A01(C25952CpK cpK, String str, String str2, int i) {
        String string;
        String A002 = C25970Cpd.A00(str);
        if (A002 != null) {
            string = String.format(A002, Arrays.copyOf(new Object[]{str2}, 1));
        } else {
            string = cpK.A03.getResources().getString(i, new Object[]{str2});
        }
        C18070vi.A0X(string);
        return string;
    }
}
