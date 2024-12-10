package X;

import java.util.Arrays;

/* renamed from: X.1vr  reason: invalid class name and case insensitive filesystem */
public class C41131vr implements C41121vq {
    public final int A00;
    public final int A01;
    public final String A02;
    public final boolean A03;

    public int BTW() {
        return 0;
    }

    public AnonymousClass1BI BTb() {
        return null;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{0, Integer.valueOf(this.A01), Boolean.valueOf(this.A03), Integer.valueOf(this.A00), this.A02});
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C41131vr)) {
            return false;
        }
        C41131vr r4 = (C41131vr) obj;
        if (this.A01 == r4.A01 && this.A03 == r4.A03 && this.A00 == r4.A00 && C42171xk.A00(this.A02, r4.A02)) {
            return true;
        }
        return false;
    }

    public C41131vr(String str) {
        this.A01 = 2131887803;
        this.A02 = str;
        this.A03 = true;
        this.A00 = 0;
    }

    public /* synthetic */ C70483Bg BO2() {
        return null;
    }

    public /* synthetic */ int BYi() {
        return -1;
    }

    public C41131vr(int i, int i2) {
        this.A01 = 2131887799;
        this.A02 = "";
        this.A03 = false;
        this.A00 = i2;
    }

    public C41131vr(int i) {
        this.A01 = i;
        this.A02 = "";
        this.A03 = false;
        this.A00 = 0;
    }
}
