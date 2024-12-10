package X;

public final class CSJ {
    public final int A00;
    public final C25716Ckm A01;
    public final Object A02;
    public final C25715Ckl[] A03;
    public final C28650ECj[] A04;

    public CSJ(C25716Ckm ckm, Object obj, C25715Ckl[] cklArr, C28650ECj[] eCjArr) {
        this.A03 = cklArr;
        this.A04 = (C28650ECj[]) eCjArr.clone();
        this.A01 = ckm;
        this.A02 = obj;
        this.A00 = cklArr.length;
    }
}
