package X;

/* renamed from: X.4a0  reason: invalid class name and case insensitive filesystem */
public final class C88514a0 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final AnonymousClass4TS A03;
    public final AnonymousClass4OI A04;
    public final Integer A05;
    public final boolean A06;
    public final boolean A07;

    public C88514a0() {
        this((AnonymousClass4TS) null, (AnonymousClass4OI) null, AnonymousClass00R.A00, 1, 0, 4, false, true);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C88514a0) {
                C88514a0 r5 = (C88514a0) obj;
                if (!(C18070vi.A18(this.A03, r5.A03) && this.A07 == r5.A07 && this.A02 == r5.A02 && this.A06 == r5.A06 && this.A05 == r5.A05 && C18070vi.A18(this.A04, r5.A04) && this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static C88514a0 A00(C88514a0 r9, Integer num) {
        AnonymousClass4TS r1 = r9.A03;
        boolean z = r9.A07;
        return new C88514a0(r1, r9.A04, num, r9.A02, r9.A01, r9.A00, z, r9.A06);
    }

    public final int A02() {
        int intValue = this.A05.intValue();
        if (intValue == 0 || intValue == 4) {
            return 1;
        }
        if (intValue == 1 || intValue == 2) {
            return 2;
        }
        if (intValue == 3) {
            return this.A02;
        }
        throw AnonymousClass3MW.A14();
    }

    public int hashCode() {
        int A002 = AnonymousClass0DV.A00((AnonymousClass0DV.A00(AnonymousClass001.A0k(this.A03) * 31, this.A07) + this.A02) * 31, this.A06);
        Integer num = this.A05;
        return ((((((A002 + C72453Mb.A0E(num, A01(num))) * 31) + C17880vN.A02(this.A04)) * 31) + this.A01) * 31) + this.A00;
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "CREATING_PLAYER";
            case 2:
                return "AWAITING_COMPLETION";
            case 3:
                return "INITIALIZED";
            case 4:
                return "FAILED";
            default:
                return "UNINITIALIZED";
        }
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("State(mediaSource=");
        A10.append(this.A03);
        A10.append(", playWhenReady=");
        A10.append(this.A07);
        A10.append(", videoPlayerPlaybackState=");
        A10.append(this.A02);
        A10.append(", mute=");
        A10.append(this.A06);
        A10.append(", preparePhase=");
        A10.append(A01(this.A05));
        A10.append(", videoPlayer=");
        A10.append(this.A04);
        A10.append(", seekPositionWhenCreated=");
        A10.append(this.A01);
        A10.append(", resizeMode=");
        return AnonymousClass001.A1L(A10, this.A00);
    }

    public C88514a0(AnonymousClass4TS r1, AnonymousClass4OI r2, Integer num, int i, int i2, int i3, boolean z, boolean z2) {
        this.A03 = r1;
        this.A07 = z;
        this.A02 = i;
        this.A06 = z2;
        this.A05 = num;
        this.A04 = r2;
        this.A01 = i2;
        this.A00 = i3;
    }
}
