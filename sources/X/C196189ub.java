package X;

import org.json.JSONObject;

/* renamed from: X.9ub  reason: invalid class name and case insensitive filesystem */
public final class C196189ub {
    public final int A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C196189ub) {
                C196189ub r5 = (C196189ub) obj;
                if (!(this.A00 == r5.A00 && this.A0A == r5.A0A && this.A02 == r5.A02 && this.A09 == r5.A09 && this.A05 == r5.A05 && this.A08 == r5.A08 && this.A01 == r5.A01 && this.A06 == r5.A06 && this.A07 == r5.A07 && this.A03 == r5.A03 && this.A04 == r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.9nJ, java.lang.Object] */
    public final C191859nJ A00() {
        ? obj = new Object();
        obj.A00 = this.A00;
        obj.A02 = this.A02;
        obj.A0A = this.A0A;
        obj.A09 = this.A09;
        obj.A05 = this.A05;
        obj.A08 = this.A08;
        obj.A01 = this.A01;
        obj.A06 = this.A06;
        obj.A07 = this.A07;
        obj.A03 = this.A03;
        obj.A04 = this.A04;
        return obj;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(this.A00 * 31, this.A0A), this.A02), this.A09), this.A05), this.A08), this.A01), this.A06), this.A07), this.A03), this.A04);
    }

    public C196189ub(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        this.A00 = i;
        this.A0A = z;
        this.A02 = z2;
        this.A09 = z3;
        this.A05 = z4;
        this.A08 = z5;
        this.A01 = z6;
        this.A06 = z7;
        this.A07 = z8;
        this.A03 = z9;
        this.A04 = z10;
    }

    public final JSONObject A01() {
        JSONObject A15 = C17880vN.A15();
        A15.put("brc", this.A00);
        A15.put("cslm", this.A02);
        A15.put("fml", this.A09);
        A15.put("fcl", this.A05);
        A15.put("flcl", this.A08);
        A15.put("fkci", this.A01);
        A15.put("fccl", this.A06);
        A15.put("fclcl", this.A07);
        A15.put("fbcl", this.A03);
        A15.put("fblcl", this.A04);
        A15.put("rms", this.A0A);
        return A15;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ConversionLoggingTracker(bizMessageReplyCount=");
        A10.append(this.A00);
        A10.append(", repeatMessageSent=");
        A10.append(this.A0A);
        A10.append(", hasCustomerSentLastMessage=");
        A10.append(this.A02);
        A10.append(", hasFirstMessageBeenLogged=");
        A10.append(this.A09);
        A10.append(", hasFirstCallBeenLogged=");
        A10.append(this.A05);
        A10.append(", hasFirstLongCallBeenLogged=");
        A10.append(this.A08);
        A10.append(", hasConsumerInitiatedCall=");
        A10.append(this.A01);
        A10.append(", hasFirstCustomerCallBeenLogged=");
        A10.append(this.A06);
        A10.append(", hasFirstCustomerLongCallBeenLogged=");
        A10.append(this.A07);
        A10.append(", hasFirstBizCallBeenLogged=");
        A10.append(this.A03);
        A10.append(", hasFirstBizLongCallBeenLogged=");
        return C17900vP.A0F(A10, this.A04);
    }
}
