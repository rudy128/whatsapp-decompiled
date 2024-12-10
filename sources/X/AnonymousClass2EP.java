package X;

/* renamed from: X.2EP  reason: invalid class name */
public final class AnonymousClass2EP extends C25871Py implements AnonymousClass12D, AnonymousClass191, C33691jE {
    public boolean A00;
    public final AnonymousClass1UW A01;
    public final AnonymousClass11P A02;
    public final C19830z4 A03;
    public final AnonymousClass1UN A04;
    public final AnonymousClass1UZ A05;
    public final C33501iv A06;
    public final C34341kK A07;
    public final AnonymousClass12E A08;
    public final C33831jS A09;
    public final C33821jR A0A;
    public final C22881Do A0B;

    public /* synthetic */ void Blf() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003a, code lost:
        if (r1.A02.A2J() == false) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bp4(X.C49642Rh r7) {
        /*
            r6 = this;
            r0 = 0
            X.C18070vi.A0d(r7, r0)
            X.2Cw r0 = X.C46092Cw.A00
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x0028
            boolean r0 = r7 instanceof X.AnonymousClass8nK
            if (r0 == 0) goto L_0x0028
            X.0z4 r5 = r6.A03
            long r3 = r5.A0O()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0029
            int r1 = r5.A0D()
            r0 = 1
            if (r1 != r0) goto L_0x0029
            X.12E r0 = r6.A08
            r0.A08()
        L_0x0028:
            return
        L_0x0029:
            X.1jS r3 = r6.A09
            X.1UN r1 = r3.A01
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x003c
            X.0z4 r0 = r1.A02
            boolean r1 = r0.A2J()
            r0 = 1
            if (r1 != 0) goto L_0x003d
        L_0x003c:
            r0 = 0
        L_0x003d:
            X.0z4 r2 = r3.A00
            if (r0 != 0) goto L_0x0046
            r0 = 0
            r2.A1G(r0)
            return
        L_0x0046:
            android.content.SharedPreferences r1 = X.C17890vO.A0B(r2)
            java.lang.String r0 = "native_contacts_phone_number_change_state"
            int r1 = X.C17890vO.A00(r1, r0)
            r0 = 2
            if (r1 != r0) goto L_0x0028
            r0 = 3
            r2.A1G(r0)
            r3.A00()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2EP.Bp4(X.2Rh):void");
    }

    public static final void A00(AnonymousClass2EP r6) {
        C33821jR r2 = r6.A0A;
        if (r2.A00.A00() == null && r6.A03.A0D() == 1) {
            r2.A00(r6, "NativeContactAsyncInit", 0);
            return;
        }
        C19830z4 r5 = r6.A03;
        if (r5.A0O() > 0 || r5.A0D() != 1) {
            r6.A09.A00();
        } else {
            r6.A08.A08();
        }
    }

    public void Blg() {
        this.A0B.registerObserver(this);
        C19830z4 r5 = this.A03;
        if (r5.A0D() != 1) {
            r5.A0D();
            this.A07.A00();
        } else if (this.A04.A06()) {
            A00(this);
        } else if (r5.A0O() <= 0) {
            r5.A1M(AnonymousClass11P.A01(this.A02));
        }
    }

    public void BxO(boolean z) {
        if (z) {
            this.A0B.unregisterObserver(this);
            C17880vN.A1F(C17890vO.A0B(this.A03).edit().putInt("native_contacts_integrity_pending", 0).putLong("native_contacts_enter_integrity_unknown_timestamp", 0).putLong("native_contacts_download_timestamp", 0).putLong("native_contacts_enter_integrity_pass_timestamp", 0).putLong("native_contacts_enter_integrity_pending_timestamp", 0).putLong("native_contacts_enter_integrity_timelock_timestamp", 0).putInt("native_contacts_phone_number_change_state", 0).putBoolean("native_contacts_backup_contacts", false), "native_contacts_nux_shown", false);
            this.A05.A00(false);
            this.A01.A02();
            this.A06.A02();
        }
    }

    public AnonymousClass2EP(C34341kK r2, AnonymousClass12E r3, C33831jS r4, AnonymousClass1UW r5, C33821jR r6, AnonymousClass11P r7, C19830z4 r8, AnonymousClass1UN r9, AnonymousClass1UZ r10, C33501iv r11, C22881Do r12) {
        C18070vi.A0w(r6, r5, r3, r8, r2);
        C18070vi.A0x(r4, r9, r7, r12, r11);
        C18070vi.A0d(r10, 11);
        this.A0A = r6;
        this.A01 = r5;
        this.A08 = r3;
        this.A03 = r8;
        this.A07 = r2;
        this.A09 = r4;
        this.A04 = r9;
        this.A02 = r7;
        this.A0B = r12;
        this.A06 = r11;
        this.A05 = r10;
    }

    public void Ba9() {
    }
}
