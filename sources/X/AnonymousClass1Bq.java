package X;

import java.security.PrivilegedAction;

/* renamed from: X.1Bq  reason: invalid class name */
public class AnonymousClass1Bq implements PrivilegedAction {
    public final /* synthetic */ AnonymousClass1Bl A00;

    public AnonymousClass1Bq(AnonymousClass1Bl r1) {
        this.A00 = r1;
    }

    public Object run() {
        AnonymousClass1Bl r2 = this.A00;
        AnonymousClass1Bl.A00("org.spongycastle.jcajce.provider.digest.", r2, AnonymousClass1Bl.A02);
        AnonymousClass1Bl.A00("org.spongycastle.jcajce.provider.symmetric.", r2, AnonymousClass1Bl.A04);
        AnonymousClass1Bl.A00("org.spongycastle.jcajce.provider.symmetric.", r2, AnonymousClass1Bl.A03);
        return null;
    }
}
