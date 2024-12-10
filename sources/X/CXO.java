package X;

public class CXO {
    public int A00;
    public int A01;
    public int A02 = 0;
    public int A03;
    public int A04;
    public int A05 = 0;
    public boolean A06;
    public boolean A07 = true;
    public boolean A08;

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("LayoutState{mAvailable=");
        A10.append(this.A00);
        A10.append(", mCurrentPosition=");
        A10.append(this.A01);
        A10.append(", mItemDirection=");
        A10.append(this.A03);
        A10.append(", mLayoutDirection=");
        A10.append(this.A04);
        A10.append(", mStartLine=");
        A10.append(this.A05);
        A10.append(", mEndLine=");
        A10.append(this.A02);
        return C17890vO.A0b(A10);
    }
}
