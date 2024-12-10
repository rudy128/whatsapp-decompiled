package X;

/* renamed from: X.7G3  reason: invalid class name */
public class AnonymousClass7G3 implements BCV {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public AnonymousClass7G3(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public void Bki() {
        if (this.A00 != 0) {
            C108965cb.A1N(this.A02);
            AnonymousClass1FU r3 = (AnonymousClass1FU) this.A01;
            r3.A05.A08(2131893931, 0);
            r3.finish();
        }
    }

    public void Bsy(Integer num) {
        if (this.A00 != 0) {
            AnonymousClass3MW.A1U(this.A01);
            return;
        }
        C145187Kh r1 = (C145187Kh) this.A02;
        r1.A00.A01.postDelayed(new C21427Aju(r1, 25), 2000);
    }

    public void C8h(Integer num) {
        if (this.A00 != 0) {
            C108965cb.A1N(this.A02);
            AnonymousClass1FU r3 = (AnonymousClass1FU) this.A01;
            r3.A05.A08(2131893931, 0);
            r3.finish();
            return;
        }
        C145187Kh r1 = (C145187Kh) this.A02;
        r1.A00.A01.postDelayed(new C21427Aju(r1, 24), 2000);
    }

    public void onSuccess() {
        if (this.A00 != 0) {
            C108965cb.A1N(this.A02);
            AnonymousClass91q.A0r((AnonymousClass91q) this.A01);
            return;
        }
        AnonymousClass72F r4 = (AnonymousClass72F) this.A01;
        C19830z4 r3 = r4.A0A.A01;
        C17880vN.A1C(C19830z4.A00(r3), "payment_background_backoff_attempt", 0);
        C17880vN.A1B(C19830z4.A00(r3), "payment_backgrounds_backoff_timestamp");
        r3.A1i("payment_backgrounds_last_fetch_timestamp");
        r4.A0C.CGF(new C70653Bz(this, this.A02, 40));
    }
}
