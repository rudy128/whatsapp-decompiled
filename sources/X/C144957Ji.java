package X;

/* renamed from: X.7Ji  reason: invalid class name and case insensitive filesystem */
public final class C144957Ji implements C25471Oi {
    public final AnonymousClass71A A00;
    public final C32741hg A01;
    public final AnonymousClass11P A02;
    public final C24886COe A03;
    public final AnonymousClass10I A04;

    public /* synthetic */ void BBw(AnonymousClass206 r1, C63362sw r2) {
    }

    public /* synthetic */ void Bvr(C166278cd r1, AnonymousClass206 r2, C63362sw r3) {
    }

    public void Bvt(C63362sw r7) {
        AnonymousClass10I r2;
        int i;
        C18070vi.A0d(r7, 0);
        if (C22971Dz.A0a(r7.A0Z)) {
            AnonymousClass206 r0 = r7.A0A;
            if (r0 == null || r0.A0u != 56) {
                r2 = this.A04;
                i = 47;
            } else {
                r2 = this.A04;
                i = 48;
            }
            r2.CGF(new C146527Pl(this, r7, i));
        }
        AnonymousClass206 r5 = r7.A0A;
        if (r5 != null && r5.A0u != 103 && r5.A0K() != null) {
            C24886COe cOe = this.A03;
            C17880vN.A1D(C17890vO.A0A(cOe.A01), "status_like_reply_last_timestamp", AnonymousClass11P.A01(this.A02));
            AnonymousClass206 A0K = r5.A0K();
            C17960vV.A07(A0K);
            C18070vi.A0X(A0K);
            if (C22971Dz.A0g(A0K)) {
                C32741hg r3 = this.A01;
                C1181762l r22 = new C1181762l();
                AnonymousClass00H r1 = r3.A0I;
                r22.A00 = Integer.valueOf(C62242r5.A00(A0K, r1));
                r22.A02 = AnonymousClass11S.A01(r3.A06).getRawString();
                r22.A01 = Integer.valueOf(C32741hg.A00(r5, r3, C62242r5.A00(r5, r1)));
                r3.A0C.CC7(r22);
            }
        }
    }

    public C144957Ji(AnonymousClass11P r1, C24886COe cOe, AnonymousClass71A r3, C32741hg r4, AnonymousClass10I r5) {
        C18070vi.A0w(r5, r4, r3, cOe, r1);
        this.A04 = r5;
        this.A01 = r4;
        this.A00 = r3;
        this.A03 = cOe;
        this.A02 = r1;
    }

    public String BSr() {
        return "StatusIncomingMessageListener";
    }

    public /* synthetic */ B5J BCv(AnonymousClass206 r2, C63362sw r3) {
        return C20699AVf.A00;
    }

    public /* synthetic */ B5I Bvs(C166418cr r2, C63362sw r3, boolean z) {
        return C20697AVd.A00;
    }
}
