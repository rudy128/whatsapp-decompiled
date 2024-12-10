package X;

import java.util.Map;

/* renamed from: X.AjA  reason: case insensitive filesystem */
public class C21381AjA implements Runnable {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public C21381AjA(Object obj, Object obj2, String str, String str2, String str3, String str4, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A03 = str;
        this.A04 = str2;
        this.A05 = str3;
        this.A06 = str4;
        this.A02 = obj2;
    }

    public final void run() {
        if (this.A00 != 0) {
            ((AnonymousClass908) this.A01).A08.A03(this.A03, this.A04, this.A05, this.A06, (Map) this.A02);
            return;
        }
        String str = this.A03;
        String str2 = this.A04;
        String str3 = this.A05;
        String str4 = this.A06;
        Map map = (Map) this.A02;
        C18070vi.A0d(map, 5);
        ((AnonymousClass9C3) this.A01).A00.A03(str, str2, str3, str4, map);
    }
}
