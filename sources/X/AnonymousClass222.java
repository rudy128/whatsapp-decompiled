package X;

import android.text.TextUtils;

/* renamed from: X.222  reason: invalid class name */
public class AnonymousClass222 extends C438921i implements C439421n {
    public C58072k6 A00;

    public String BS4() {
        String str;
        if (!TextUtils.isEmpty(this.A00.A03)) {
            StringBuilder sb = new StringBuilder();
            C58072k6 r1 = this.A00;
            sb.append(r1.A02);
            sb.append(" ");
            sb.append(r1.A03);
            str = sb.toString();
        } else {
            str = this.A00.A02;
        }
        String A1G = A1G();
        if (TextUtils.isEmpty(A1G)) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(A1G);
        sb2.append(" ");
        sb2.append(str);
        return sb2.toString();
    }

    public String BVS() {
        StringBuilder sb = new StringBuilder();
        sb.append("📄 ");
        sb.append(this.A00.A02);
        return sb.toString();
    }

    public String BXV() {
        return this.A00.A02;
    }

    public String BXn() {
        return this.A00.A02;
    }

    public C58072k6 BaE() {
        return this.A00;
    }

    public void CL3(C58072k6 r1) {
        this.A00 = r1;
    }
}
