package X;

/* renamed from: X.6zw  reason: invalid class name and case insensitive filesystem */
public final class C140096zw {
    public String A00;
    public final int A01;
    public final AnonymousClass1DT A02;
    public final AnonymousClass1DT A03;
    public final AnonymousClass1DT A04;
    public final AnonymousClass1DT A05;
    public final AnonymousClass1DT A06;
    public final Integer A07;
    public final String A08;

    public /* synthetic */ C140096zw(Integer num, String str, String str2, int i, int i2) {
        AnonymousClass1DT r5;
        AnonymousClass1DT r4;
        AnonymousClass1DT r3;
        AnonymousClass1DT r1;
        AnonymousClass1DT r6 = null;
        if ((i2 & 4) != 0) {
            r5 = AnonymousClass3MW.A0M("");
        } else {
            r5 = null;
        }
        num = (i2 & 8) != 0 ? null : num;
        if ((i2 & 64) != 0) {
            r4 = AnonymousClass3MW.A0M("");
        } else {
            r4 = null;
        }
        if ((i2 & 128) != 0) {
            r3 = AnonymousClass3MW.A0M(Float.valueOf(0.0f));
        } else {
            r3 = null;
        }
        if ((i2 & 256) != 0) {
            r1 = C108965cb.A0D(0);
        } else {
            r1 = null;
        }
        r6 = (i2 & 512) != 0 ? C108965cb.A0D(0) : r6;
        C18070vi.A0d(r5, 3);
        C72483Me.A16(r4, r3, r1, r6, 7);
        this.A08 = str;
        this.A00 = str2;
        this.A04 = r5;
        this.A07 = num;
        this.A01 = i;
        this.A03 = r4;
        this.A05 = r3;
        this.A06 = r1;
        this.A02 = r6;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C140096zw) {
                C140096zw r5 = (C140096zw) obj;
                if (!C18070vi.A18(this.A08, r5.A08) || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A04, r5.A04) || !C18070vi.A18(this.A07, r5.A07) || this.A01 != r5.A01 || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A05, r5.A05) || !C18070vi.A18(this.A06, r5.A06) || !C18070vi.A18(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static boolean A00(Object obj, Object obj2) {
        return C18070vi.A18(((C140096zw) obj).A00, obj2);
    }

    public int hashCode() {
        AnonymousClass1DT r0 = this.A04;
        return AnonymousClass000.A0O(this.A02, AnonymousClass000.A0N(this.A06, AnonymousClass000.A0N(this.A05, AnonymousClass000.A0N(this.A03, (((AnonymousClass000.A0N(r0, ((C17900vP.A00(this.A08) * 31) + C17900vP.A00(this.A00)) * 31) + AnonymousClass001.A0k(this.A07)) * 31 * 31) + this.A01) * 31))));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ThunderstormContactItem(thunderstormDeviceId=");
        A10.append(this.A08);
        A10.append(", endpointId=");
        A10.append(this.A00);
        A10.append(", text=");
        A10.append(this.A04);
        A10.append(", icon=");
        A10.append(this.A07);
        AnonymousClass000.A1G(A10, ", bleDevice=");
        A10.append(", viewType=");
        A10.append(this.A01);
        A10.append(", subtitle=");
        A10.append(this.A03);
        A10.append(", transferProgress=");
        A10.append(this.A05);
        A10.append(", transferState=");
        A10.append(this.A06);
        A10.append(", state=");
        return AnonymousClass001.A1F(this.A02, A10);
    }
}
