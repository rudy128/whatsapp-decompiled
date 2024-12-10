package X;

import com.facebook.wearable.applinks.AppLinkLinkInfoResponse;

public final class BWC extends C22610BFq {
    public void Bsn(int i, String str) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("releaseMwaResources: onError ");
        A10.append(i);
        A10.append(". ");
        A10.append(str);
        C26294Cx6.A09("lam:LinkedAppManager", C17890vO.A0c(A10, '.'), (Throwable) null);
    }

    public void C3b(AppLinkLinkInfoResponse appLinkLinkInfoResponse) {
        C26294Cx6.A06("lam:LinkedAppManager", AnonymousClass001.A1E(appLinkLinkInfoResponse, "releaseMwaResources: onResult ", C18070vi.A0K(appLinkLinkInfoResponse)));
    }
}
