package X;

import android.text.TextUtils;

public class A7B {
    public int A00;
    public int A01;
    public long A02;
    public C29621ca A03;
    public C29621ca A04;
    public String A05;
    public String A06;
    public String A07;
    public C29621ca A08;

    public static A7B A00() {
        return new A7B();
    }

    public static A7B A01(C29621ca r1) {
        if (!TextUtils.isEmpty(C29621ca.A02(r1, "error-code")) || (r1 = r1.A0K("pin")) != null) {
            return new A7B(r1);
        }
        return null;
    }

    public A7B(C29621ca r5) {
        this.A01 = -1;
        this.A00 = C20099A7c.A01(r5.A0Q("error-code", (String) null), 0);
        this.A07 = r5.A0Q("error-text", (String) null);
        r5.A0Q("display_title", (String) null);
        this.A06 = r5.A0Q("display_text", (String) null);
        this.A01 = C20099A7c.A01(r5.A0Q("remaining-retries", (String) null), -1);
        this.A02 = C20099A7c.A03(r5.A0Q("next-retry-ts", (String) null));
        this.A05 = r5.A0Q("auth-ticket-fp", (String) null);
        this.A08 = r5.A0K("offer_eligibility");
        int i = this.A00;
        if (i == 1448) {
            this.A03 = r5.A0K("key");
        } else if (i == 10718) {
            this.A01 = 0;
        } else if (i == 454) {
            this.A04 = r5.A0K("step_up");
        }
    }

    public String toString() {
        String str;
        String str2;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("[ code: ");
        A10.append(this.A00);
        A10.append(" text: ");
        A10.append(this.A07);
        A10.append(" remaining-retries: ");
        A10.append(this.A01);
        A10.append(" next-attempt-ts: ");
        A10.append(this.A02);
        String str3 = this.A05;
        if (str3 != null) {
            str = AnonymousClass001.A1H(" auth-ticket-fp: ", str3, AnonymousClass000.A10());
        } else {
            str = "";
        }
        A10.append(str);
        A10.append(" key-node: ");
        if (this.A03 != null) {
            str2 = "set";
        } else {
            str2 = "null";
        }
        A10.append(str2);
        return AnonymousClass000.A0y(" ]", A10);
    }

    public A7B(int i) {
        this.A01 = -1;
        this.A00 = i;
    }

    public A7B() {
        this.A01 = -1;
        this.A00 = 0;
    }
}
