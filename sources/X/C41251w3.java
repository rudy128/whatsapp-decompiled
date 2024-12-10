package X;

import java.util.List;

/* renamed from: X.1w3  reason: invalid class name and case insensitive filesystem */
public abstract class C41251w3 extends C38391rD {
    public final C40431uh A00;
    public final C41281w6 A01;

    public int A0Q() {
        return this.A00.A02.size();
    }

    public Object A0U(int i) {
        return this.A00.A02.get(i);
    }

    public void A0V(Runnable runnable, List list) {
        this.A00.A00(runnable, list);
    }

    public void A0W(List list) {
        this.A00.A00((Runnable) null, list);
    }

    public C41251w3(C40411uf r5) {
        C41291w7 r3 = new C41291w7(this);
        this.A01 = r3;
        C40431uh r0 = new C40431uh(new C40471ul(r5).A00(), (C40451uj) new C40461uk(this));
        this.A00 = r0;
        r0.A06.add(r3);
    }

    public C41251w3(C40481um r4) {
        C41291w7 r2 = new C41291w7(this);
        this.A01 = r2;
        C40431uh r0 = new C40431uh(r4, (C40451uj) new C40461uk(this));
        this.A00 = r0;
        r0.A06.add(r2);
    }
}
