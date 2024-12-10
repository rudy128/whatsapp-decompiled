package X;

/* renamed from: X.4is  reason: invalid class name and case insensitive filesystem */
public final class C93374is implements C106725Wy {
    public final int A00;
    public final int A01;
    public final long A02;
    public final AnonymousClass4ZN A03;
    public final AnonymousClass4ZN A04;
    public final AnonymousClass4ZN A05;
    public final C178119Bw A06;
    public final Integer A07;
    public final Integer A08;
    public final String A09;
    public final AnonymousClass1D6 A0A;
    public final C22821Di A0B;
    public final boolean A0C;
    public final boolean A0D;

    public int hashCode() {
        return AnonymousClass000.A0P(this.A0B.invoke(this.A06), AnonymousClass000.A1b(this, 2), 1);
    }

    public C93374is(AnonymousClass4ZN r1, AnonymousClass4ZN r2, AnonymousClass4ZN r3, C178119Bw r4, Integer num, Integer num2, String str, AnonymousClass1D6 r8, C22821Di r9, int i, int i2, long j, boolean z, boolean z2) {
        this.A0C = z;
        this.A06 = r4;
        this.A00 = i;
        this.A01 = i2;
        this.A04 = r1;
        this.A08 = num;
        this.A07 = num2;
        this.A02 = j;
        this.A03 = r2;
        this.A09 = str;
        this.A05 = r3;
        this.A0A = r8;
        this.A0D = z2;
        this.A0B = r9;
    }

    public boolean equals(Object obj) {
        if (super.equals(obj) && (obj instanceof C93374is)) {
            C93374is r4 = (C93374is) obj;
            if (AnonymousClass000.A1Y(this.A0B.invoke(this.A06)) != AnonymousClass000.A1Y(r4.A0B.invoke(r4.A06))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CallLogItem(callInfoOptimized=");
        A10.append(this.A0C);
        A10.append(", callLog=");
        A10.append(this.A06);
        A10.append(", callTypeIcon=");
        A10.append(this.A00);
        A10.append(", callTypeIconColor=");
        A10.append(this.A01);
        A10.append(", callTypeLabel=");
        A10.append(this.A04);
        A10.append(", callTypeLabelColor=");
        A10.append(this.A08);
        A10.append(", avIcon=");
        A10.append(this.A07);
        A10.append(", callDateTime=");
        A10.append(this.A02);
        A10.append(", callDurationString=");
        A10.append(this.A03);
        A10.append(", callDataString=");
        A10.append(this.A09);
        A10.append(", callerInfoString=");
        A10.append(this.A05);
        A10.append(", silencedReasonLabelIconPair=");
        A10.append(this.A0A);
        A10.append(", useVrOsBackground=");
        A10.append(this.A0D);
        A10.append(", isSelected=");
        return AnonymousClass001.A1F(this.A0B, A10);
    }
}
