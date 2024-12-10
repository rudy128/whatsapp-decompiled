package X;

/* renamed from: X.2nU  reason: invalid class name and case insensitive filesystem */
public final class C60162nU {
    public Long A00;
    public final C30071dL A01;
    public final C56972iK A02;
    public final C19830z4 A03;
    public final C18030ve A04;

    public final void A05(String str, String str2) {
        Long l;
        C18070vi.A0d(str2, 1);
        if (C18020vd.A05(C18040vf.A02, this.A02.A00, 8104) && (l = this.A00) != null) {
            this.A01.flowAnnotate(l.longValue(), str, str2);
        }
    }

    public final void A00() {
        if (C18020vd.A05(C18040vf.A02, this.A02.A00, 8104)) {
            Long l = this.A00;
            if (l != null) {
                this.A01.flowEndSuccess(l.longValue());
            }
            this.A00 = null;
        }
    }

    public final void A01(int i, String str, long j) {
        C18030ve r1 = this.A02.A00;
        C18040vf r4 = C18040vf.A02;
        if (C18020vd.A05(r4, r1, 8104)) {
            Long l = this.A00;
            if (l != null) {
                this.A01.flowEndFail(l.longValue(), "flow_started_before_previous_ended", (String) null);
            }
            C30071dL r5 = this.A01;
            long j2 = ((long) i) | (0 << 32);
            r5.BLQ(new C58442kh(str, false), j2);
            r5.flowAnnotate(j2, "status_session_id", j);
            if (C18020vd.A05(r4, this.A04, 6084)) {
                r5.flowAnnotate(j2, "encrypted_rid", this.A03.A0d());
            }
            this.A00 = Long.valueOf(j2);
        }
    }

    public final void A02(AnonymousClass77K r6) {
        String A002;
        C18030ve r4 = this.A02.A00;
        C18040vf r1 = C18040vf.A02;
        if (C18020vd.A05(r1, r4, 8104)) {
            boolean z = r6.A05;
            if (C18020vd.A05(r1, r4, 8104) && (A002 = C50502Ur.A00(r6)) != null) {
                A05("status_privacy_type_end", A002);
            }
            A06("is_fb_auto_crossposting_enabled_end", z);
        }
    }

    public final void A03(AnonymousClass77K r6) {
        String A002;
        C18030ve r4 = this.A02.A00;
        C18040vf r1 = C18040vf.A02;
        if (C18020vd.A05(r1, r4, 8104)) {
            boolean z = r6.A05;
            if (C18020vd.A05(r1, r4, 8104) && (A002 = C50502Ur.A00(r6)) != null) {
                A05("status_privacy_type_start", A002);
            }
            A06("is_fb_auto_crossposting_enabled_start", z);
        }
    }

    public final void A04(String str) {
        Long l;
        if (C18020vd.A05(C18040vf.A02, this.A02.A00, 8104) && (l = this.A00) != null) {
            this.A01.flowMarkPoint(l.longValue(), str);
        }
    }

    public final void A06(String str, boolean z) {
        Long l;
        if (C18020vd.A05(C18040vf.A02, this.A02.A00, 8104) && (l = this.A00) != null) {
            this.A01.flowAnnotate(l.longValue(), str, z);
        }
    }

    public C60162nU(C19830z4 r1, C18030ve r2, C30071dL r3, C56972iK r4) {
        this.A01 = r3;
        this.A04 = r2;
        this.A02 = r4;
        this.A03 = r1;
    }
}
