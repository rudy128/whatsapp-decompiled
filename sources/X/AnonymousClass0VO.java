package X;

/* renamed from: X.0VO  reason: invalid class name */
public final class AnonymousClass0VO implements C16260ry {
    public final C04620Oc A00;
    public final AnonymousClass0Jq A01;
    public final boolean A02;

    public Integer BPk() {
        C04620Oc r0 = this.A00;
        int i = r0.A02;
        int i2 = r0.A00;
        if (i < i2) {
            return AnonymousClass00R.A01;
        }
        if (i > i2) {
            return AnonymousClass00R.A00;
        }
        return AnonymousClass00R.A0C;
    }

    public AnonymousClass0VO(C04620Oc r1, AnonymousClass0Jq r2, boolean z) {
        this.A02 = z;
        this.A01 = r2;
        this.A00 = r1;
    }

    public String toString() {
        String str;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SingleSelectionLayout(isStartHandle=");
        A10.append(this.A02);
        A10.append(", crossed=");
        switch (BPk().intValue()) {
            case 0:
                str = "CROSSED";
                break;
            case 1:
                str = "NOT_CROSSED";
                break;
            default:
                str = "COLLAPSED";
                break;
        }
        A10.append(str);
        A10.append(", info=\n\t");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
