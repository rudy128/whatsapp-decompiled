package X;

/* renamed from: X.1qZ  reason: invalid class name and case insensitive filesystem */
public class C38021qZ {
    public int A00 = 0;
    public int A01;
    public int A02;
    public int A03 = 0;
    public int A04 = 1;
    public int A05 = 0;
    public int A06 = -1;
    public long A07;
    public boolean A08 = false;
    public boolean A09 = false;
    public boolean A0A = false;
    public boolean A0B = false;
    public boolean A0C = false;
    public boolean A0D = false;

    public int A00() {
        if (this.A08) {
            return this.A05 - this.A00;
        }
        return this.A03;
    }

    public void A01(int i) {
        int i2 = this.A04;
        if ((i2 & i) == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Layout state should be one of ");
            sb.append(Integer.toBinaryString(i));
            sb.append(" but it is ");
            sb.append(Integer.toBinaryString(i2));
            throw new IllegalStateException(sb.toString());
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("State{mTargetPosition=");
        sb.append(this.A06);
        sb.append(", mData=");
        sb.append((Object) null);
        sb.append(", mItemCount=");
        sb.append(this.A03);
        sb.append(", mIsMeasuring=");
        sb.append(this.A09);
        sb.append(", mPreviousLayoutItemCount=");
        sb.append(this.A05);
        sb.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
        sb.append(this.A00);
        sb.append(", mStructureChanged=");
        sb.append(this.A0C);
        sb.append(", mInPreLayout=");
        sb.append(this.A08);
        sb.append(", mRunSimpleAnimations=");
        sb.append(this.A0B);
        sb.append(", mRunPredictiveAnimations=");
        sb.append(this.A0A);
        sb.append('}');
        return sb.toString();
    }
}
