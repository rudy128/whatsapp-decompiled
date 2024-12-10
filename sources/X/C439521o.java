package X;

import android.text.TextUtils;

/* renamed from: X.21o  reason: invalid class name and case insensitive filesystem */
public class C439521o extends AnonymousClass210 implements C439421n {
    public C58072k6 A00;

    public String A1B() {
        if (TextUtils.isEmpty(A0P())) {
            return this.A00.A02;
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("*");
        sb2.append(A0P());
        sb2.append("*");
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append(this.A00.A02);
        return sb.toString();
    }

    public String BS4() {
        C58072k6 r1;
        String str;
        if (!TextUtils.isEmpty(A0P())) {
            StringBuilder sb = new StringBuilder();
            sb.append(A0P());
            sb.append(" ");
            r1 = this.A00;
            sb.append(r1.A02);
            str = sb.toString();
        } else {
            r1 = this.A00;
            str = r1.A02;
        }
        if (TextUtils.isEmpty(r1.A03)) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(" ");
        sb2.append(this.A00.A03);
        return sb2.toString();
    }

    public String BVS() {
        if (!TextUtils.isEmpty(A0P())) {
            return A0P();
        }
        return this.A00.A02;
    }

    public String BXV() {
        if (!TextUtils.isEmpty(A0P())) {
            return A0P();
        }
        return this.A00.A02;
    }

    public String BXn() {
        return A1B();
    }

    public C58072k6 BaE() {
        return this.A00;
    }

    public void CL3(C58072k6 r1) {
        this.A00 = r1;
    }
}
