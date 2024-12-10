package X;

public class ALY implements C24401Ke {
    public final int A00;
    public final Object A01;

    public ALY(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void BlT() {
        if (this.A00 != 0) {
            C20129A8p.A07((C20129A8p) this.A01, "appForegrounded");
        } else {
            ((C25749ClJ) this.A01).A01();
        }
    }

    public void onAppBackgrounded() {
        if (this.A00 != 0) {
            C20129A8p.A07((C20129A8p) this.A01, "appBackgrounded");
        }
    }
}
