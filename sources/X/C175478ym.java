package X;

import android.content.Context;

/* renamed from: X.8ym  reason: invalid class name and case insensitive filesystem */
public abstract class C175478ym extends C20992Ack {
    public final C22461B8t A00;

    public void A07(A7B a7b) {
        C195929uA r2;
        long j;
        A4K a4k;
        A54 a54;
        C198959zC r0;
        AnonymousClass1QE r1;
        String str;
        A4K a4k2;
        if (this instanceof AnonymousClass90V) {
            AnonymousClass90V r22 = (AnonymousClass90V) this;
            if (r22.A00 != 0) {
                if (a7b == null) {
                    A4K a4k3 = (A4K) r22.A01;
                    a4k3.A08.A07("deleteFingerprint success");
                    a4k3.A09.A03();
                    return;
                }
                a4k2 = (A4K) r22.A01;
                a4k2.A08.A07(AnonymousClass001.A1E(a7b, "deleteFingerprint error: ", AnonymousClass000.A10()));
                int i = a7b.A00;
                if (i == 1441) {
                    a4k2.A09.A04(r22.A03);
                    r2 = a4k2.A0A;
                    j = a7b.A02;
                } else if (!(i == 1440 || i == 445)) {
                    if (i == 1448) {
                        a4k2.A09.A04(r22.A03);
                        a54 = a4k2.A07;
                        r0 = (C198959zC) r22.A02;
                        a54.A02(a7b, r0.A00.A05, "PIN");
                        return;
                    }
                    return;
                }
            } else if (a7b == null) {
                a4k2 = (A4K) r22.A01;
                a4k2.A08.A07("setFingerprintFromPin success");
            } else {
                a4k = (A4K) r22.A01;
                a4k.A08.A07(AnonymousClass001.A1E(a7b, "setFingerprintFromPin error: ", AnonymousClass000.A10()));
                a4k.A09.A03();
                int i2 = a7b.A00;
                if (i2 != 1441) {
                    if (i2 == 1448) {
                        a54 = a4k.A07;
                        r0 = (C198959zC) r22.A02;
                        a54.A02(a7b, r0.A00.A05, "PIN");
                        return;
                    }
                    return;
                }
                r2 = a4k.A0A;
                j = a7b.A02;
            }
            a4k2.A09.A04(r22.A03);
            return;
        }
        if (this instanceof AnonymousClass90U) {
            AnonymousClass90U r5 = (AnonymousClass90U) this;
            if (a7b == null) {
                r1 = r5.A01.A08;
                str = "verifyPinToken success";
            } else {
                a4k = r5.A01;
                a4k.A08.A07(AnonymousClass001.A1E(a7b, "verifyPinToken error: ", AnonymousClass000.A10()));
                int i3 = a7b.A00;
                if (i3 != 1441) {
                    if (i3 == 1448) {
                        a54 = a4k.A07;
                        r0 = r5.A00;
                        a54.A02(a7b, r0.A00.A05, "PIN");
                        return;
                    }
                    return;
                }
                r2 = a4k.A0A;
                j = a7b.A02;
            }
        } else {
            if (this instanceof AnonymousClass90T) {
                AnonymousClass90T r23 = (AnonymousClass90T) this;
                if (a7b == null) {
                    r2 = r23.A01.A0A;
                    r2.A02(true);
                    j = 0;
                } else if (a7b.A00 == 1448) {
                    a54 = r23.A01.A07;
                    r0 = r23.A00;
                } else {
                    return;
                }
            } else {
                AnonymousClass90S r52 = (AnonymousClass90S) this;
                if (a7b == null) {
                    r1 = r52.A01.A08;
                    str = "changePin success";
                } else {
                    a4k = r52.A01;
                    a4k.A08.A07(AnonymousClass001.A1E(a7b, "changePin error: ", AnonymousClass000.A10()));
                    int i4 = a7b.A00;
                    if (i4 != 1441) {
                        if (i4 == 1448) {
                            a54 = a4k.A07;
                            r0 = r52.A00;
                        } else {
                            return;
                        }
                    }
                    r2 = a4k.A0A;
                    j = a7b.A02;
                }
            }
            a54.A02(a7b, r0.A00.A05, "PIN");
            return;
        }
        r1.A07(str);
        return;
        r2.A01(j);
    }

    public C175478ym(Context context, AnonymousClass1KB r2, C33711jG r3, C22461B8t b8t) {
        super(context, r3, r2);
        this.A00 = b8t;
    }

    public void A04(A7B a7b) {
        A07(a7b);
        this.A00.C3f(a7b);
    }

    public void A05(A7B a7b) {
        A07(a7b);
        this.A00.C3f(a7b);
    }

    public void A06(C29621ca r3) {
        A7B a7b;
        C29621ca A0j = AnonymousClass8BR.A0j(r3);
        if (A0j != null) {
            a7b = A7B.A01(A0j);
        } else {
            a7b = null;
        }
        A07(a7b);
        this.A00.C3f(a7b);
    }
}
