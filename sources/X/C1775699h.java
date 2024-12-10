package X;

/* renamed from: X.99h  reason: invalid class name and case insensitive filesystem */
public final class C1775699h extends C177919Bc {
    public double A00;
    public final /* synthetic */ C1775799i A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1775699h(C1775799i r3) {
        super(r3, false, true, false);
        this.A01 = r3;
    }

    public /* bridge */ /* synthetic */ void A0I(Object[] objArr) {
        Integer[] numArr = (Integer[]) objArr;
        C18070vi.A0d(numArr, 0);
        Integer num = numArr[0];
        if (num != null) {
            C1775799i r5 = this.A01;
            double intValue = ((double) num.intValue()) / 2.0d;
            this.A00 = intValue;
            C17880vN.A0V(r5.A04).notifyAllObservers(new C20725AWf((int) intValue, 100, 2));
        }
    }
}
