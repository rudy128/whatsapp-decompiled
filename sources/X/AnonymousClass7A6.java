package X;

import android.os.Bundle;

/* renamed from: X.7A6  reason: invalid class name */
public final /* synthetic */ class AnonymousClass7A6 implements AnonymousClass1XI {
    public final /* synthetic */ C20245ADd A00;
    public final /* synthetic */ C139606z8 A01;
    public final /* synthetic */ AnonymousClass77B A02;

    public final void Bv0(String str, Bundle bundle) {
        C139606z8 r4 = this.A01;
        AnonymousClass77B r3 = this.A02;
        C20245ADd aDd = this.A00;
        C108985cd.A1D(str, bundle);
        if (str.hashCode() == -661782138 && str.equals("text.option.selection.request.key")) {
            int i = bundle.getInt("text.option.selection.result");
            C139606z8.A00(r4);
            r4.A06.Bds(aDd, r3, i);
        }
    }

    public /* synthetic */ AnonymousClass7A6(C20245ADd aDd, C139606z8 r2, AnonymousClass77B r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = aDd;
    }
}
