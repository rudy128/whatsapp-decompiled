package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.1s1  reason: invalid class name and case insensitive filesystem */
public final class C38861s1 {
    public int A00 = 0;
    public View A01 = null;
    public ViewGroup A02 = null;
    public C28911bG A03 = null;
    public C38831ry A04 = null;
    public String A05 = null;
    public boolean A06 = false;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38861s1) {
                C38861s1 r5 = (C38861s1) obj;
                if (!C18070vi.A18(this.A05, r5.A05) || !C18070vi.A18(this.A04, r5.A04) || !C18070vi.A18(this.A02, r5.A02) || this.A00 != r5.A00 || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A03, r5.A03) || this.A06 != r5.A06) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("WaAsyncInflateRequest(id=");
        sb.append(this.A05);
        sb.append(", asyncInflater=");
        sb.append(this.A04);
        sb.append(", parent=");
        sb.append(this.A02);
        sb.append(", resid=");
        sb.append(this.A00);
        sb.append(", view=");
        sb.append(this.A01);
        sb.append(", callback=");
        sb.append(this.A03);
        sb.append(", prewarm=");
        sb.append(this.A06);
        sb.append(')');
        return sb.toString();
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        String str = this.A05;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        C38831ry r0 = this.A04;
        if (r0 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = r0.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        ViewGroup viewGroup = this.A02;
        if (viewGroup == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = viewGroup.hashCode();
        }
        int i4 = (((i3 + hashCode3) * 31) + this.A00) * 31;
        View view = this.A01;
        if (view == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = view.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        C28911bG r02 = this.A03;
        if (r02 != null) {
            i = r02.hashCode();
        }
        int i6 = (i5 + i) * 31;
        int i7 = 1237;
        if (this.A06) {
            i7 = 1231;
        }
        return i6 + i7;
    }
}
