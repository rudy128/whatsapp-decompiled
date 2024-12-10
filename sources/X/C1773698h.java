package X;

import android.content.Context;
import android.graphics.Paint;

/* renamed from: X.98h  reason: invalid class name and case insensitive filesystem */
public final class C1773698h extends C20083A6j {
    public CharSequence A07(Context context, Paint paint) {
        AER aer = this.A02.A07;
        if (aer == null) {
            return super.A07(context, paint);
        }
        long A00 = (long) aer.A00();
        C18000vb r2 = this.A00;
        Object[] objArr = new Object[1];
        AnonymousClass3MX.A1S(objArr, 0, A00);
        String A0K = r2.A0K(objArr, 2131755344, A00);
        C18070vi.A0X(A0K);
        return A0K;
    }

    public String A0B() {
        StringBuilder A10 = AnonymousClass000.A10();
        String A0D = A0D();
        String str = A0D;
        String str2 = "";
        if (A0D == null) {
            A0D = str2;
        }
        if (A0D.length() > 0) {
            A10.append(str);
        }
        C20285AEt aEt = this.A02;
        AER aer = aEt.A07;
        if (aer != null) {
            int A00 = aer.A00();
            A10.append("\n");
            Object[] A1a = AnonymousClass3MW.A1a();
            C17880vN.A1T(A1a, A00, 0);
            A10.append(this.A00.A0K(A1a, 2131755344, (long) A00));
        }
        String str3 = aEt.A0B;
        String str4 = str3;
        if (str3 == null) {
            str4 = str2;
        }
        if (str4.length() > 0) {
            A10.append("\n");
            A10.append(str3);
        }
        String str5 = aEt.A0C;
        if (str5 != null) {
            str2 = str5;
        }
        if (str2.length() > 0) {
            A10.append("\n");
            A10.append(str5);
        }
        return C18070vi.A0H(A10);
    }

    public void A0H(C19998A2m a2m, AnonymousClass206 r3) {
        C18070vi.A0h(a2m, r3);
        C20120A8f.A05(this.A01, a2m, r3);
    }
}
