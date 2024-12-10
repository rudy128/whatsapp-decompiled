package X;

public class CWN {
    public C19945A0c A00 = C19945A0c.A00();
    public C128176fZ A01;
    public final CDV A02;

    public void A00() {
        C22562BCv bCv = this.A00.A00;
        byte[] BLs = bCv.BLs();
        this.A01 = new C128176fZ(bCv.generatePublicKey(BLs), BLs);
    }

    public CWN(CDV cdv) {
        this.A02 = cdv;
    }
}
