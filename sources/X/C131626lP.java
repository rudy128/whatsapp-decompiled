package X;

import java.util.LinkedHashMap;

/* renamed from: X.6lP  reason: invalid class name and case insensitive filesystem */
public abstract class C131626lP {
    public String A00 = "";

    public LinkedHashMap A00() {
        AnonymousClass1D6[] r3;
        if (this instanceof AnonymousClass6EU) {
            r3 = new AnonymousClass1D6[3];
            C72463Mc.A1H("acs_token", this.A00, r3);
            C108985cd.A1G("acs_project", "WA_StatusMusic", r3);
            C72463Mc.A1I("doc_id", "8360352280687329", r3);
        } else if (this instanceof AnonymousClass6EW) {
            AnonymousClass6EW r2 = (AnonymousClass6EW) this;
            r3 = new AnonymousClass1D6[4];
            C72463Mc.A1H("acs_token", r2.A00, r3);
            C108985cd.A1G("acs_project", "WA_StatusMusicReporting", r3);
            C72463Mc.A1I("doc_id", "8346567772135259", r3);
            C72463Mc.A1J("variables", r2.A01, r3);
        } else {
            AnonymousClass6EV r22 = (AnonymousClass6EV) this;
            r3 = new AnonymousClass1D6[5];
            C72463Mc.A1H("acs_token", r22.A00, r3);
            C108985cd.A1G("acs_project", "WA_StatusMusic", r3);
            C72463Mc.A1I("app_id", C197569wu.A0D, r3);
            C72463Mc.A1J("doc_id", "8484308851648677", r3);
            r3[4] = AnonymousClass1D6.A01("variables", r22.A01);
        }
        return AnonymousClass1D7.A0B(r3);
    }
}
