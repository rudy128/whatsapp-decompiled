package X;

import android.os.Bundle;

/* renamed from: X.2vc  reason: invalid class name and case insensitive filesystem */
public class C64962vc implements AnonymousClass1XI {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public C64962vc(AnonymousClass1FY r1, AnonymousClass4YL r2, C31191fA r3, C72213Lb r4, AnonymousClass1BI r5, int i) {
        this.A00 = i;
        if (i != 0) {
            this.A01 = r3;
            this.A02 = r1;
            this.A03 = r5;
            this.A04 = r4;
            this.A05 = r2;
            return;
        }
        this.A01 = r5;
        this.A02 = r3;
        this.A03 = r4;
        this.A04 = r2;
        this.A05 = r1;
    }

    public final void Bv0(String str, Bundle bundle) {
        Bundle bundle2 = bundle;
        if (this.A00 != 0) {
            AnonymousClass1FY r2 = (AnonymousClass1FY) this.A02;
            C72213Lb r5 = (C72213Lb) this.A04;
            C31191fA.A03(bundle2, r2, (AnonymousClass4YL) this.A05, (C31191fA) this.A01, r5, (AnonymousClass1BI) this.A03);
            return;
        }
        C31191fA r4 = (C31191fA) this.A02;
        C72213Lb r52 = (C72213Lb) this.A03;
        AnonymousClass4YL r3 = (AnonymousClass4YL) this.A04;
        C31191fA.A04(bundle2, (AnonymousClass1FY) this.A05, r3, r4, r52, (AnonymousClass1BI) this.A01);
    }
}
