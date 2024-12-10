package X;

import java.util.Map;

/* renamed from: X.9BO  reason: invalid class name */
public class AnonymousClass9BO extends A34 {
    public boolean A00 = false;
    public final AnonymousClass181 A01;
    public final BCV A02;
    public final C196279uk A03;
    public final AnonymousClass1D9 A04;
    public final C220418j A05;
    public final C24451Kj A06 = new C24451Kj(1, 1000);
    public final Integer A07;
    public final Object A08;
    public final String A09;
    public final Map A0A;

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        Integer num = (Integer) obj;
        this.A03.A09 = false;
        BCV bcv = this.A02;
        if (bcv == null) {
            return;
        }
        if (num.intValue() == 0) {
            bcv.onSuccess();
        } else if (this.A00) {
            bcv.C8h(num);
        } else {
            bcv.Bsy(num);
        }
    }

    public AnonymousClass9BO(AnonymousClass181 r6, BCV bcv, C196279uk r8, AnonymousClass1D9 r9, C220418j r10, Integer num, Object obj, String str, Map map) {
        this.A01 = r6;
        this.A05 = r10;
        this.A03 = r8;
        this.A04 = r9;
        this.A09 = str;
        this.A08 = obj;
        this.A0A = map;
        this.A02 = bcv;
        this.A07 = num;
        if (r8 instanceof C170648qR) {
            C170648qR r82 = (C170648qR) r8;
            r82.A00 = C170648qR.A00(r82);
            r82.A01 = AnonymousClass8BU.A0l(r82.A06);
            r82.A0B.CC7(r82.A00);
        }
    }
}
