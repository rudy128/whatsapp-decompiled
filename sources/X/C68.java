package X;

import android.text.TextUtils;
import java.util.Calendar;

public class C68 {
    public int A00;
    public long A01;
    public C6B A02;
    public C6B A03;
    public C6B A04;
    public C6L A05;
    public String A06;

    public String toString() {
        String A002;
        String A003;
        String str;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("time=");
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(this.A01);
        Object[] A1b = AnonymousClass000.A1b(instance, 6);
        A1b[1] = instance;
        A1b[2] = instance;
        A1b[3] = instance;
        A1b[4] = instance;
        A1b[5] = instance;
        A10.append(String.format("%tm-%td %tH:%tM:%tS.%tL", A1b));
        A10.append(" processed=");
        C6B c6b = this.A04;
        String str2 = "<null>";
        if (c6b == null) {
            A002 = str2;
        } else {
            A002 = c6b.A00();
        }
        A10.append(A002);
        A10.append(" org=");
        C6B c6b2 = this.A03;
        if (c6b2 == null) {
            A003 = str2;
        } else {
            A003 = c6b2.A00();
        }
        A10.append(A003);
        A10.append(" dest=");
        C6B c6b3 = this.A02;
        if (c6b3 != null) {
            str2 = c6b3.A00();
        }
        A10.append(str2);
        A10.append(" what=");
        if (this.A05 != null) {
            str = null;
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            int i = this.A00;
            A10.append(i);
            BE9.A1J("(0x", A10, i);
            str = ")";
        }
        A10.append(str);
        if (!TextUtils.isEmpty(this.A06)) {
            BE6.A1J(A10);
            A10.append(this.A06);
        }
        return A10.toString();
    }
}
