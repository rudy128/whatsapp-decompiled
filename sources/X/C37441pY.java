package X;

import java.util.HashSet;

/* renamed from: X.1pY  reason: invalid class name and case insensitive filesystem */
public class C37441pY implements C37431pX {
    public Runnable A00;
    public boolean A01;
    public int A02;
    public int A03;
    public boolean A04;
    public final HashSet A05 = new HashSet();

    public void A00(int i, int i2) {
        int i3 = i - 1;
        boolean z = false;
        if (i2 >= i3) {
            z = true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Last visible row [");
        sb.append(i2);
        sb.append("] should be >= First visible row [");
        sb.append(i3);
        sb.append("]");
        C17960vV.A0F(z, sb.toString());
        this.A02 = i;
        this.A03 = i2;
        this.A04 = true;
        if (this.A00 != null && isValid()) {
            this.A00.run();
        }
    }

    public boolean isValid() {
        if (this.A04) {
            int i = this.A02;
            while (i <= this.A03) {
                if (this.A05.contains(Integer.valueOf(i))) {
                    i++;
                }
            }
            this.A01 = true;
            return true;
        }
        return false;
    }
}
