package X;

import com.whatsapp.calling.controls.viewmodel.SingleLiveEventOrFlow$observe$1;

/* renamed from: X.4YS  reason: invalid class name */
public final class AnonymousClass4YS {
    public Object A00;
    public final C18100vl A01;
    public final C18100vl A02;
    public final boolean A03;

    public AnonymousClass4YS() {
        this(false);
    }

    public final void A00(AnonymousClass1F9 r5, C22821Di r6) {
        if (this.A03) {
            C88604aC.A03(AnonymousClass2SS.A00(r5), new C27183DXs((AnonymousClass1OS) new SingleLiveEventOrFlow$observe$1((C30391dr) null, r6), AnonymousClass3MX.A18(this.A01), 10));
            return;
        }
        AnonymousClass3MY.A1K(r5, (AnonymousClass1DS) this.A02.getValue(), new C105125Qu(r6), 23);
    }

    public void A01(Object obj) {
        this.A00 = obj;
        if (obj == null) {
            return;
        }
        if (this.A03) {
            ((AnonymousClass1G3) this.A01.getValue()).CPw(obj);
        } else {
            ((AnonymousClass1DS) this.A02.getValue()).A0F(obj);
        }
    }

    public final void A02(Object obj) {
        this.A00 = obj;
        if (this.A03) {
            ((AnonymousClass1G3) this.A01.getValue()).CPw(obj);
        } else {
            ((AnonymousClass1DS) this.A02.getValue()).A0E(obj);
        }
    }

    public AnonymousClass4YS(boolean z) {
        this.A03 = z;
        Integer num = AnonymousClass00R.A01;
        this.A02 = AnonymousClass1DF.A00(num, C104815Pp.A00);
        this.A01 = AnonymousClass1DF.A00(num, new AnonymousClass5PV(C25691Pg.DROP_OLDEST));
    }
}
