package X;

import java.util.Map;

/* renamed from: X.Aec  reason: case insensitive filesystem */
public class C21108Aec implements C22396B5z {
    public final String A00;
    public final String A01;
    public final Map A02;

    public C21108Aec(String str, String str2, Map map) {
        this.A01 = str;
        this.A00 = str2;
        this.A02 = map;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("QplEventCallback{instanceKey='");
        A10.append(this.A01);
        A10.append('\'');
        A10.append(", eventType='");
        A10.append(this.A00);
        A10.append('\'');
        A10.append(", params=");
        return AnonymousClass8BX.A0c(this.A02, A10);
    }
}
