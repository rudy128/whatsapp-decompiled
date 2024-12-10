package X;

/* renamed from: X.8ml  reason: invalid class name and case insensitive filesystem */
public abstract class C169708ml extends C60192nY {
    public final C26371Rw A00;
    public final AnonymousClass1S4 A01;
    public final AnonymousClass1CJ A02;

    public /* bridge */ /* synthetic */ void A0G(C20126A8l a8l) {
        C170598qH r2 = (C170598qH) a8l;
        C18070vi.A0d(r2, 0);
        if (A0K(C196619vM.A00(r2))) {
            A07(r2);
        }
    }

    public /* bridge */ /* synthetic */ void A0H(C20126A8l a8l) {
        C170598qH r2 = (C170598qH) a8l;
        C18070vi.A0d(r2, 0);
        if (A0K(C196619vM.A00(r2))) {
            A08(r2);
        } else {
            A06(r2);
        }
    }

    public /* bridge */ /* synthetic */ void A0I(C20126A8l a8l, C20126A8l a8l2) {
        C170598qH r8 = (C170598qH) a8l;
        C18070vi.A0d(r8, 0);
        A24 A002 = C196619vM.A00(r8);
        if (a8l2 == null) {
            C26331Rs r0 = this.A00;
            C18070vi.A0W(r0);
            a8l2 = C196619vM.A01(A002, r0);
        }
        if (this instanceof C169698mk) {
            C169698mk r6 = (C169698mk) this;
            C170598qH r4 = A002.A00;
            C170498px r3 = (C170498px) r4;
            C170498px A0H = r3.A0H(A002.A02);
            C18070vi.A0z(A0H, "null cannot be cast to non-null type T of com.whatsapp.companiondevice.sync.handlers.MessageKeyMutationWrapper");
            AnonymousClass205 r2 = A0H.A01;
            C170498px A0H2 = r3.A0H(A002.A01);
            C18070vi.A0z(A0H2, "null cannot be cast to non-null type T of com.whatsapp.companiondevice.sync.handlers.MessageKeyMutationWrapper");
            AnonymousClass205 r1 = A0H2.A01;
            C170488pw r42 = (C170488pw) r4;
            if (C169698mk.A01(r6, r42, r2) || (!A002.A05 && C169698mk.A01(r6, r42, r1))) {
                this.A00.A03.A06("cross_index_conflict_counter", 1);
                A0B(r8, a8l2);
                return;
            }
        }
        if (a8l2 == null || a8l2.A04 < r8.A04) {
            if (!A0K(A002)) {
                A0A(r8);
                return;
            }
            A0B(r8, a8l2);
            return;
        }
        A09(r8);
    }

    public boolean A0K(A24 a24) {
        AnonymousClass201 r1;
        if (this instanceof C169698mk) {
            C169698mk r4 = (C169698mk) this;
            C170598qH r3 = a24.A00;
            AnonymousClass206 A002 = AnonymousClass2T0.A00(r4.A03, A24.A00(a24, r3), (AnonymousClass1W6) C18070vi.A0E(r4.A05));
            if (A002 == null) {
                return false;
            }
            boolean z = ((C170488pw) r3).A01;
            boolean z2 = A002.A0q;
            if (z) {
                if (z2) {
                    return true;
                }
                r4.A04.A00(C18070vi.A0P(A002));
                return true;
            } else if (!z2) {
                return true;
            } else {
                r4.A04.A01(C18070vi.A0P(A002));
                return true;
            }
        } else {
            AnonymousClass1CJ r0 = this.A02;
            AnonymousClass1BI r6 = a24.A01;
            if (!r0.A0P(r6)) {
                return false;
            }
            if (this instanceof C169688mj) {
                C169688mj r7 = (C169688mj) this;
                C170438pr r12 = (C170438pr) a24.A00;
                C18070vi.A0d(r12, 0);
                AnonymousClass9KE r32 = r12.A00;
                if (r32 == null) {
                    return true;
                }
                C17900vP.A0Y(r32, "NotificationActivityLevelMutationHandler/set notification activity level to: ", AnonymousClass000.A10());
                C218217n r2 = r7.A01;
                int ordinal = r32.ordinal();
                if (ordinal == 0) {
                    r1 = AnonymousClass201.DEFAULT_ALL_MESSAGES;
                } else if (ordinal == 1) {
                    r1 = AnonymousClass201.ALL_MESSAGES;
                } else if (ordinal == 2) {
                    r1 = AnonymousClass201.RELEVANT_MESSAGES;
                } else if (ordinal == 3) {
                    r1 = AnonymousClass201.DEFAULT_RELEVANT_MESSAGES;
                } else {
                    throw AnonymousClass8BX.A0V(r32, "NotificationActivityLevelMutationHandler/fromSyncDNotificationSettingType/Missing SyncD mapping for NotificationActivityLevel = ", AnonymousClass000.A10());
                }
                r2.A04.A10(r6, r1);
                return true;
            }
            C169678mi r72 = (C169678mi) this;
            C170458pt r13 = (C170458pt) a24.A00;
            if (r13.A01) {
                long j = r13.A00;
                if (j != -1) {
                    j = r72.A00.A09(j);
                }
                C218217n r02 = r72.A01;
                r02.A04.A0z(r6, C32961i2.OTHER, j);
                return true;
            }
            AnonymousClass1Nb r14 = r72.A01.A04;
            if (!r14.A0x(r6)) {
                return true;
            }
            r14.A0w(r6);
            return true;
        }
    }

    public C169708ml(C26371Rw r1, AnonymousClass1S4 r2, AnonymousClass1CJ r3, C26331Rs r4) {
        super(r4);
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }
}
