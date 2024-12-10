package X;

/* renamed from: X.7Dh  reason: invalid class name */
public final class AnonymousClass7Dh implements AnonymousClass8AM {
    public final A8V A00;

    public AnonymousClass7Dh(A8V a8v) {
        C18070vi.A0d(a8v, 1);
        this.A00 = a8v;
    }

    public void BiN(int i, int i2) {
        String str;
        A8V a8v = this.A00;
        C25411Oc r0 = C124566Yv.A01;
        int i3 = r0.A00;
        if (i <= r0.A01 && i3 <= i) {
            C25411Oc r02 = C124566Yv.A00;
            int i4 = r02.A00;
            if (i2 <= r02.A01 && i4 <= i2) {
                str = "age_collection_monthday";
                a8v.A0L(str, "age_collection_monthday_input_error", "next", "generic_error");
            }
        }
        str = "age_collection_year";
        a8v.A0L(str, "age_collection_monthday_input_error", "next", "generic_error");
    }

    public void BiQ(boolean z) {
        String str;
        A8V a8v = this.A00;
        if (z) {
            str = "age_collection_monthday";
        } else {
            str = "age_collection_year";
        }
        a8v.A0L(str, "age_collection_year_input_error", "next", "invalid_age");
    }

    public void BiT() {
        this.A00.A0L("age_collection_monthday", "age_collection_monthday_input_error", "next", "month_day_not_entered");
    }

    public void BiU(int i, int i2) {
        String str;
        A8V a8v = this.A00;
        C25411Oc r0 = C124566Yv.A01;
        int i3 = r0.A00;
        if (i <= r0.A01 && i3 <= i) {
            C25411Oc r02 = C124566Yv.A00;
            int i4 = r02.A00;
            if (i2 <= r02.A01 && i4 <= i2) {
                str = "age_collection_monthday";
                a8v.A0L(str, "age_collection_monthday_input_error", "next", "network_error");
            }
        }
        str = "age_collection_year";
        a8v.A0L(str, "age_collection_monthday_input_error", "next", "network_error");
    }

    public void Bic() {
        this.A00.A0L("age_collection_year", "age_collection_year_input_error", "next", "year_not_entered");
    }
}
