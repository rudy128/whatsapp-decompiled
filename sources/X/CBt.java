package X;

public abstract class CBt {
    public static final Object A00(C23736Boh boh, E8A e8a, String str) {
        if (e8a == null) {
            return null;
        }
        try {
            return CCJ.A00(C199029zJ.A01, e8a, boh);
        } catch (C27230Da9 e) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Exception when evaluating ");
            A10.append(str);
            C25913CoX.A00((DOZ) null, "BloksComponentQueryManager", AnonymousClass000.A0y(" for async component query.", A10), e);
            return null;
        }
    }
}
