package X;

/* renamed from: X.0fU  reason: invalid class name and case insensitive filesystem */
public final class C08680fU extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C98494rF $config;
    public final /* synthetic */ AnonymousClass0XV this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C08680fU(AnonymousClass0XV r2, C98494rF r3) {
        super(0);
        this.this$0 = r2;
        this.$config = r3;
    }

    public final void A00() {
        AnonymousClass0QR r1 = this.this$0.A0S;
        C98494rF r6 = this.$config;
        if ((r1.A01.A00 & 8) != 0) {
            for (AnonymousClass0XW r5 = r1.A05; r5 != null; r5 = r5.A04) {
                if ((r5.A01 & 8) != 0) {
                    C06970a9 r4 = null;
                    AnonymousClass0XW r3 = r5;
                    do {
                        if (r3 instanceof C17660v1) {
                            C17660v1 r32 = (C17660v1) r3;
                            if (r32.BZA()) {
                                C06370Yb r0 = new C06370Yb();
                                r6.element = r0;
                                r0.A06(true);
                            }
                            if (r32.BZC()) {
                                ((C06370Yb) r6.element).A07(true);
                            }
                            r32.BCT((C06370Yb) r6.element);
                        } else if ((r3.A01 & 8) != 0 && (r3 instanceof C014308l)) {
                            int i = 0;
                            for (AnonymousClass0XW r2 = ((C014308l) r3).A00; r2 != null; r2 = r2.A02) {
                                if ((r2.A01 & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        r3 = r2;
                                    } else {
                                        r4 = AnonymousClass001.A0z(r4);
                                        r3 = AnonymousClass000.A0d(r4, r3);
                                        r4.A0F(r2);
                                    }
                                }
                            }
                            if (i == 1) {
                                continue;
                            }
                        }
                        r3 = AnonymousClass0QV.A00(r4);
                        continue;
                    } while (r3 != null);
                }
            }
        }
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        A00();
        return C27621Wu.A00;
    }
}
