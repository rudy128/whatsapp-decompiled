package X;

/* renamed from: X.1Mo  reason: invalid class name and case insensitive filesystem */
public class C25021Mo {
    public C25041Mq A00;
    public String A01;
    public String A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;

    public static C25031Mp A01(C25021Mo r2, C25041Mq r3, String str) {
        r2.A02 = str;
        r2.A00 = r3;
        r2.A04 = true;
        r2.A0E(0);
        return r2.A0B();
    }

    public static C25041Mq A03(C25021Mo r3, Object obj, Object[] objArr) {
        objArr[0] = obj;
        r3.A02 = "prop_name";
        C25041Mq r2 = C25041Mq.TEXT;
        r3.A00 = r2;
        r3.A06 = true;
        objArr[1] = r3.A0B();
        r3.A02 = "prop_value";
        return r2;
    }

    public static void A04(C25021Mo r1, C25041Mq r2, Object[] objArr) {
        r1.A00 = r2;
        r1.A04 = true;
        objArr[2] = r1.A0B();
    }

    public static void A05(C25021Mo r1, C25041Mq r2, Object[] objArr) {
        r1.A00 = r2;
        r1.A04 = true;
        objArr[4] = r1.A0B();
    }

    public static void A07(C25021Mo r2, Object[] objArr) {
        r2.A04 = true;
        objArr[1] = r2.A0B();
    }

    public static void A09(C25021Mo r2, Object[] objArr) {
        r2.A04 = true;
        objArr[0] = r2.A0B();
    }

    public C25031Mp A0B() {
        C25031Mp r1 = new C25031Mp(this);
        this.A02 = null;
        this.A00 = null;
        this.A01 = null;
        this.A05 = false;
        this.A04 = false;
        this.A06 = false;
        this.A03 = false;
        return r1;
    }

    public void A0C() {
        this.A03 = true;
    }

    public void A0D() {
        this.A05 = true;
    }

    public static C25031Mp A00(C25021Mo r1, C25041Mq r2) {
        r1.A00 = r2;
        r1.A05 = true;
        r1.A03 = true;
        return r1.A0B();
    }

    public static C25031Mp A02(C25021Mo r0, C25041Mq r1, String str) {
        r0.A02 = str;
        r0.A00 = r1;
        return r0.A0B();
    }

    public static void A06(C25021Mo r0, C25041Mq r1, Object[] objArr) {
        r0.A00 = r1;
        objArr[2] = r0.A0B();
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.1Mo, java.lang.Object] */
    public static C25031Mp[] A0A() {
        ? obj = new Object();
        obj.A02 = "jid";
        obj.A00 = C25041Mq.TEXT;
        obj.A04 = true;
        return new C25031Mp[]{obj.A0B()};
    }

    public static void A08(C25021Mo r1, Object[] objArr) {
        objArr[3] = r1.A0B();
    }

    public void A0E(int i) {
        this.A01 = Integer.toString(i);
    }
}
