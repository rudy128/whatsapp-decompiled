package X;

public class DPU implements C28531E6f {
    public final int A00;
    public final Object A01;

    public DPU(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void C22(int i) {
        CXH cxh;
        int i2 = this.A00;
        Object obj = this.A01;
        switch (i2) {
            case 0:
                cxh = ((C24018Bu4) obj).A00;
                break;
            case 1:
                cxh = ((C24019Bu5) obj).A06;
                break;
            default:
                cxh = ((C24020Bu6) obj).A0A;
                break;
        }
        C52302ah r0 = cxh.A03;
        if (r0 != null) {
            r0.A00.A04.A04(Integer.valueOf(i));
        }
    }
}
