package X;

import org.json.JSONObject;

/* renamed from: X.4S3  reason: invalid class name */
public abstract class AnonymousClass4S3 {
    public C108385bc A00;
    public boolean A01;
    public final AnonymousClass11P A02;
    public final C24521Kq A03;

    public C108385bc A00() {
        Object obj;
        Object obj2;
        Object obj3;
        if (this instanceof C80673xl) {
            Object obj4 = null;
            try {
                C24521Kq r0 = C24521Kq.$redex_init_class;
                if ("".length() > 0) {
                    JSONObject A16 = C17880vN.A16("");
                    obj3 = new C95744mj(C18070vi.A0J("surface_name", A16), C18070vi.A0J("biggest_ghost_view", A16), A16.getInt("total_views"), A16.getInt("ghost_views"), A16.getInt("ghost_percent"));
                } else {
                    obj3 = null;
                }
            } catch (Throwable th) {
                obj3 = new AnonymousClass1IU(th);
            }
            if (!(obj3 instanceof AnonymousClass1IU)) {
                obj4 = obj3;
            }
            return (C95744mj) obj4;
        } else if (this instanceof C80653xj) {
            Object obj5 = null;
            try {
                C24521Kq r02 = C24521Kq.$redex_init_class;
                if ("".length() > 0) {
                    obj2 = new C95724mh(C18070vi.A0J("stacktrace", C17880vN.A16("")));
                } else {
                    obj2 = null;
                }
            } catch (Throwable th2) {
                obj2 = new AnonymousClass1IU(th2);
            }
            if (!(obj2 instanceof AnonymousClass1IU)) {
                obj5 = obj2;
            }
            return (C95724mh) obj5;
        } else {
            Object obj6 = null;
            try {
                C24521Kq r03 = C24521Kq.$redex_init_class;
                String str = "";
                if (str.length() <= 0) {
                    str = null;
                }
                JSONObject A162 = C17880vN.A16(str);
                obj = new C95734mi(Long.parseLong(C18070vi.A0J("inflationTimeMs", A162)), Integer.parseInt(C18070vi.A0J("renderedBubbleType", A162)), Long.parseLong(C18070vi.A0J("rowId", A162)));
            } catch (Throwable th3) {
                obj = new AnonymousClass1IU(th3);
            }
            if (!(obj instanceof AnonymousClass1IU)) {
                obj6 = obj;
            }
            return (C108385bc) obj6;
        }
    }

    public boolean A01() {
        C24521Kq r0 = C24521Kq.$redex_init_class;
        if (AnonymousClass11P.A01(this.A02) < 0 || this.A00 == null) {
            return false;
        }
        return true;
    }

    public AnonymousClass4S3(AnonymousClass11P r1, C24521Kq r2) {
        this.A02 = r1;
        this.A03 = r2;
    }
}
