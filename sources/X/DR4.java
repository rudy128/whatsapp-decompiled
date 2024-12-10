package X;

public class DR4 implements AnonymousClass88R {
    public final AnonymousClass205 A00;
    public final /* synthetic */ DR0 A01;

    public DR4(AnonymousClass205 r1, DR0 dr0) {
        this.A01 = dr0;
        this.A00 = r1;
    }

    public void C6F() {
        AnonymousClass205 r1 = this.A00;
        DR0 dr0 = this.A01;
        if (r1 == dr0.A06 && dr0.A0A != null) {
            C24149BwF bwF = (C24149BwF) dr0.A08;
            AnonymousClass70X r0 = bwF.A0H;
            if (r0 != null) {
                bwF.A0o.setText(CDS.A00(bwF.A0u, bwF.A0v, (long) r0.A06()));
            }
            C24149BwF bwF2 = (C24149BwF) dr0.A08;
            bwF2.A0W.setVisibility(8);
            bwF2.A0X.setVisibility(8);
            dr0.A08.A0E();
            C24149BwF bwF3 = (C24149BwF) dr0.A08;
            bwF3.A0h.setVisibility(0);
            if (bwF3.A0M && bwF3.A0d.getVisibility() != 0) {
                bwF3.A0i.setVisibility(0);
            }
            dr0.A05.requestFocus();
            C25022CTy cTy = dr0.A0N;
            cTy.A04 = true;
            cTy.A08.A00();
            cTy.A07.A01();
            cTy.A09.A02();
        }
    }
}
