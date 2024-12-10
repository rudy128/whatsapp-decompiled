package X;

import android.text.Editable;

/* renamed from: X.4iM  reason: invalid class name and case insensitive filesystem */
public final class C93054iM implements C108725cC {
    public final C38731rn A00;
    public final AnonymousClass4YH A01 = AnonymousClass4YH.A03;
    public final C1408073d A02;
    public final C32951i1 A03;
    public final AnonymousClass2JS A04;

    public int Baw() {
        return 0;
    }

    public void Bqz() {
    }

    public void Bsj(Editable editable) {
    }

    public void Bkw(AnonymousClass3V2 r7) {
        C32951i1 r5 = this.A03;
        AnonymousClass1BI r4 = r7.A06;
        r5.A0T.execute(new C70773Cl(r5, r4, C32951i1.A00(r5), 27));
        AnonymousClass3MY.A1P(r4, this.A04, 22, false);
    }

    public C86574Se C55(AnonymousClass3V2 r7, C57982jx r8) {
        Integer num;
        if (!this.A02.A08()) {
            num = AnonymousClass00R.A00;
        } else if (this.A00.A01()) {
            C32951i1 r5 = this.A03;
            AnonymousClass1BI r4 = r7.A06;
            r5.A0T.execute(new C70773Cl(r5, r4, C32951i1.A00(r5), 25));
            AnonymousClass3MY.A1P(r4, this.A04, 9, true);
            r8.A06 = true;
            return AnonymousClass4WL.A00;
        } else {
            num = AnonymousClass00R.A01;
        }
        return new C86574Se(num);
    }

    public C93054iM(C38731rn r2, C1408073d r3, C32951i1 r4, AnonymousClass2JS r5) {
        C18070vi.A0s(r3, r4, r5, r2);
        this.A02 = r3;
        this.A03 = r4;
        this.A04 = r5;
        this.A00 = r2;
    }
}
