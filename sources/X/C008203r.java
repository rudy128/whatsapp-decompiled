package X;

import android.app.Application;
import android.app.Service;

/* renamed from: X.03r  reason: invalid class name and case insensitive filesystem */
public final class C008203r implements AnonymousClass009 {
    public Object A00;
    public final Service A01;

    public Object generatedComponent() {
        Object obj = this.A00;
        if (obj != null) {
            return obj;
        }
        Service service = this.A01;
        Application application = service.getApplication();
        C008303s.A00("Hilt service must be attached to an @HiltAndroidApp Application. Found: %s", new Object[]{application.getClass()}, application instanceof AnonymousClass009);
        C008403t CHi = ((C000000a) C000400h.A00(C000000a.class, application)).CHi();
        CHi.CHh(service);
        C008503u BDT = CHi.BDT();
        this.A00 = BDT;
        return BDT;
    }

    public C008203r(Service service) {
        this.A01 = service;
    }
}
