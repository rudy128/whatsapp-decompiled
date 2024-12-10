package X;

import android.content.Context;

/* renamed from: X.21g  reason: invalid class name and case insensitive filesystem */
public final class C438721g extends AnonymousClass210 {
    public C20268AEb A00;

    public final String A1B(Context context) {
        C18070vi.A0d(context, 0);
        int i = 2131890456;
        if (this.A0v.A02) {
            i = 2131890457;
        }
        String string = context.getString(i);
        C18070vi.A0b(string);
        return string;
    }

    public final boolean A1D(C18030ve r3) {
        C18070vi.A0d(r3, 0);
        C20268AEb aEb = this.A00;
        if (aEb != null) {
            return aEb.A01(r3, this.A0v.A02);
        }
        return false;
    }

    public C438721g(AnonymousClass205 r2, long j) {
        super(r2, 46, j);
    }

    public final String A1C(C18030ve r6) {
        C195059sj A002;
        C20268AEb aEb = this.A00;
        String str = null;
        if (aEb == null || !aEb.A01(r6, this.A0v.A02)) {
            C20268AEb aEb2 = this.A00;
            if (aEb2 == null) {
                return "";
            }
            String str2 = aEb2.A04;
            if (str2 == null || str2.length() == 0) {
                String str3 = aEb2.A05;
                if (str3 == null) {
                    return "";
                }
                return str3;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("\n     ");
            sb.append(aEb2.A05);
            sb.append("\n     ");
            sb.append(str2);
            sb.append("\n     ");
            return AnonymousClass1Y7.A01(sb.toString());
        }
        C20268AEb aEb3 = this.A00;
        if (!(aEb3 == null || (A002 = aEb3.A00()) == null)) {
            str = A002.A03;
        }
        return String.valueOf(str);
    }
}
