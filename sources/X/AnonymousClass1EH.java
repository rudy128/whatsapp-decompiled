package X;

import java.util.Set;

/* renamed from: X.1EH  reason: invalid class name */
public class AnonymousClass1EH {
    public final /* synthetic */ C22621Co A00;

    public AnonymousClass1EH(C22621Co r1) {
        this.A00 = r1;
    }

    public static void A00(AnonymousClass1EH r5) {
        AnonymousClass00H r3 = r5.A00.A01;
        ((C28771as) r3.get()).A0I.A09("ChatManager_loadHostedJids");
        AnonymousClass12B r0 = (AnonymousClass12B) ((C28771as) r3.get()).A0R.get();
        AnonymousClass12B.A00(r0);
        Set set = r0.A00;
        if (set == null) {
            C18070vi.A11("hostedUserJids");
            throw null;
        }
        int size = set.size();
        AnonymousClass1Bd r02 = ((C28771as) r3.get()).A0I;
        String valueOf = String.valueOf(size);
        C222119a r4 = r02.A04;
        if (r4 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("ChatManager_loadHostedJids");
            sb.append("_end");
            String obj = sb.toString();
            C222219b r2 = r4.A05;
            if (r2.A01()) {
                r4.A07.markerPoint(r2.A06, obj, valueOf);
            }
        }
    }
}
