package X;

import android.net.Uri;
import android.view.View;

/* renamed from: X.Ae2  reason: case insensitive filesystem */
public final /* synthetic */ class C21072Ae2 implements C107705aS {
    public final /* synthetic */ C20287AEv A00;
    public final /* synthetic */ C20507ANs A01;

    public final void Bp3(View view) {
        C20507ANs aNs = this.A01;
        String str = this.A00.A0G;
        if (str != null) {
            aNs.A02.CGU(aNs.A04.getContext(), Uri.parse(str), (AnonymousClass206) null);
        }
    }

    public /* synthetic */ C21072Ae2(C20287AEv aEv, C20507ANs aNs) {
        this.A01 = aNs;
        this.A00 = aEv;
    }
}
