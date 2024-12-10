package X;

/* renamed from: X.8sp  reason: invalid class name and case insensitive filesystem */
public final class C172118sp extends C136716uH {
    public final AnonymousClass122 A00;
    public final A2M A01;
    public final AnonymousClass206 A02;

    public C172118sp(AnonymousClass122 r2, A2M a2m, AnonymousClass206 r4) {
        C18070vi.A0d(a2m, 3);
        this.A02 = r4;
        this.A00 = r2;
        this.A01 = a2m;
    }

    public Object A04(C30391dr r14) {
        if (this.A00.getJSONObject("data").optBoolean("disable_cta")) {
            C181329Qb.A00(this.A00, this.A02);
        }
        long optLong = this.A00.getJSONObject("data").optLong("extension_screen_length", 0);
        String optString = this.A00.getJSONObject("data").optString("screen_progress", (String) null);
        boolean z = false;
        boolean optBoolean = this.A00.getJSONObject("data").optBoolean("is_restored", false);
        boolean optBoolean2 = this.A00.getJSONObject("data").optBoolean("is_success", false);
        long optLong2 = this.A00.getJSONObject("data").optLong("sequence_number", 0);
        A2M a2m = this.A01;
        Boolean valueOf = Boolean.valueOf(optBoolean2);
        Long l = new Long(optLong);
        if (optString != null) {
            a2m.A04 = optString;
        }
        a2m.A02 = valueOf;
        a2m.A00 = l.longValue();
        C195839tz r0 = a2m.A01;
        if (r0 != null) {
            r0.A01 = optBoolean;
            r0.A00 = optLong2;
        }
        if (!this.A00.getJSONObject("data").has("is_success")) {
            valueOf = null;
        }
        if (!this.A00.getJSONObject("data").has("is_success") && optString == null) {
            z = true;
        }
        a2m.A01((C195839tz) null, valueOf, optString, z);
        return C27621Wu.A00;
    }
}
