package X;

import android.text.TextUtils;

/* renamed from: X.21u  reason: invalid class name and case insensitive filesystem */
public class C440121u extends C440021t implements C439421n {
    public C58072k6 A00;

    public String BS4() {
        if (TextUtils.isEmpty(this.A00.A03)) {
            return this.A00.A02;
        }
        StringBuilder sb = new StringBuilder();
        C58072k6 r1 = this.A00;
        sb.append(r1.A02);
        sb.append(" ");
        sb.append(r1.A03);
        return sb.toString();
    }

    public String BVS() {
        StringBuilder sb = new StringBuilder();
        sb.append("👾 ");
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
