package X;

import com.whatsapp.comments.CommentListManager$messageObserver$1$onMessageChanged$1;
import com.whatsapp.comments.CommentListManager$messageObserver$1$onMessagesChanged$1;
import com.whatsapp.comments.CommentListManager$messageObserver$1$onMessagesDeleted$1;
import com.whatsapp.event.EventsViewModel$messageObserver$1$onMessageChanged$1;
import com.whatsapp.event.EventsViewModel$messageObserver$1$onMessageReplaced$1;
import com.whatsapp.event.EventsViewModel$messageObserver$1$onMessagesDeleted$1;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.location.PlaceInfo;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.4mM  reason: invalid class name and case insensitive filesystem */
public class C95514mM implements AnonymousClass1WR, AnonymousClass1WS, C23971Ii {
    public final int A00;
    public final Object A01;

    public static void A00(C95514mM r3, AnonymousClass206 r4) {
        String str;
        C18070vi.A0d(r4, 0);
        AnonymousClass3Uj r32 = (AnonymousClass3Uj) r3.A01;
        AnonymousClass1EC r1 = r32.A06;
        AnonymousClass205 r2 = r4.A0v;
        if (C18070vi.A18(r1, r2.A00)) {
            C691536c A002 = C60492o7.A00(r4);
            if (A002 == null || (str = A002.A02.A01) == null) {
                str = r2.A01;
            }
            C18070vi.A0b(str);
            C55492fr r0 = r32.A00;
            if (r0 != null && r0.A04.contains(str)) {
                AnonymousClass3Uj.A00(r32);
            }
        }
    }

    public C95514mM(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static final boolean A01(C95514mM r6, AnonymousClass206 r7) {
        if (!(r7 instanceof C445823z)) {
            return false;
        }
        C73333Ur r3 = (C73333Ur) r6.A01;
        AnonymousClass1BI r2 = r3.A04;
        if (!(r2 instanceof AnonymousClass1EC) || r3.A02.A06((GroupJid) r2) != 1) {
            return C18070vi.A18(r7.A0v.A00, r2);
        }
        C34511kb r1 = r3.A00;
        C18070vi.A0z(r2, "null cannot be cast to non-null type com.whatsapp.jid.PermanentGroupJid");
        Iterator it = r1.A08((AnonymousClass1EC) r2).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (C18070vi.A18(r7.A0v.A00, ((A2B) next).A02)) {
                if (next != null) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public boolean A02(AnonymousClass206 r4) {
        AnonymousClass1EC A0i;
        if (r4.A0u == 92 && (A0i = AnonymousClass3MW.A0i(r4.A0v.A00)) != null) {
            AnonymousClass3Uc r2 = (AnonymousClass3Uc) this.A01;
            AnonymousClass1EC A05 = r2.A0N.A05(A0i);
            if (A05 == null || !r2.A0q.equals(A05)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public boolean A03(AnonymousClass206 r4) {
        AnonymousClass1EC A0i;
        int i = r4.A0u;
        if ((i != 1 && i != 3 && i != 9 && i != 0) || (A0i = AnonymousClass3MW.A0i(r4.A0v.A00)) == null) {
            return false;
        }
        AnonymousClass3Uc r2 = (AnonymousClass3Uc) this.A01;
        AnonymousClass1EC A05 = r2.A0N.A05(A0i);
        if (A05 != null) {
            return r2.A0q.equals(A05);
        }
        return false;
    }

    public final boolean A04(AnonymousClass206 r3) {
        String str;
        AnonymousClass205 r0;
        if (r3 instanceof C445823z) {
            String str2 = r3.A0v.A01;
            C445823z A0T = ((AnonymousClass3VY) this.A01).A0T();
            if (A0T == null || (r0 = A0T.A0v) == null) {
                str = null;
            } else {
                str = r0.A01;
            }
            if (!C18070vi.A18(str2, str)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public /* synthetic */ void Bwj(AnonymousClass1BI r3) {
        if (3 - this.A00 == 0) {
            AnonymousClass3Uj r1 = (AnonymousClass3Uj) this.A01;
            if (C18070vi.A18(r1.A06, r3)) {
                AnonymousClass3Uj.A00(r1);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void ByH(X.AnonymousClass206 r6, int r7) {
        /*
            r5 = this;
            int r0 = r5.A00
            switch(r0) {
                case 0: goto L_0x0096;
                case 1: goto L_0x0077;
                case 2: goto L_0x0020;
                case 3: goto L_0x0005;
                case 4: goto L_0x0006;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            r0 = 0
            X.C18070vi.A0d(r6, r0)
            boolean r0 = r6 instanceof X.C445823z
            if (r0 == 0) goto L_0x0005
            java.lang.Object r1 = r5.A01
            X.3Ur r1 = (X.C73333Ur) r1
            X.1OX r4 = X.C41561wd.A00(r1)
            X.0wl r3 = r1.A05
            r0 = 0
            com.whatsapp.event.EventsViewModel$messageObserver$1$onMessageAdded$1 r2 = new com.whatsapp.event.EventsViewModel$messageObserver$1$onMessageAdded$1
            r2.<init>(r5, r1, r6, r0)
            goto L_0x00ae
        L_0x0020:
            boolean r0 = r6 instanceof X.C48352Md
            if (r0 == 0) goto L_0x003f
            r1 = r6
            X.2Mg r1 = (X.C48382Mg) r1
            r0 = 1
            com.whatsapp.jid.GroupJid r3 = r1.A19(r0)
        L_0x002c:
            if (r3 == 0) goto L_0x0049
            java.lang.Object r0 = r5.A01
            X.3VJ r0 = (X.AnonymousClass3VJ) r0
            X.10s r2 = r0.A0P
            r0 = 16
            X.4rk r1 = new X.4rk
            r1.<init>(r5, r3, r0)
        L_0x003b:
            r2.execute(r1)
            return
        L_0x003f:
            boolean r0 = r6 instanceof X.AnonymousClass2MW
            if (r0 == 0) goto L_0x0049
            r0 = r6
            X.2MW r0 = (X.AnonymousClass2MW) r0
            com.whatsapp.jid.GroupJid r3 = r0.A01
            goto L_0x002c
        L_0x0049:
            boolean r0 = r6 instanceof X.AnonymousClass98B
            if (r0 == 0) goto L_0x005b
            java.lang.Object r0 = r5.A01
            X.3VJ r0 = (X.AnonymousClass3VJ) r0
            X.10s r2 = r0.A0P
            r0 = 40
        L_0x0055:
            X.4rf r1 = new X.4rf
            r1.<init>(r5, r0)
            goto L_0x003b
        L_0x005b:
            boolean r0 = r6 instanceof X.AnonymousClass98N
            if (r0 == 0) goto L_0x0068
            java.lang.Object r0 = r5.A01
            X.3VJ r0 = (X.AnonymousClass3VJ) r0
            X.10s r2 = r0.A0P
            r0 = 41
            goto L_0x0055
        L_0x0068:
            boolean r0 = X.AnonymousClass25A.A0q(r6)
            if (r0 == 0) goto L_0x0005
            java.lang.Object r0 = r5.A01
            X.3VJ r0 = (X.AnonymousClass3VJ) r0
            X.10s r2 = r0.A0P
            r0 = 42
            goto L_0x0055
        L_0x0077:
            boolean r0 = r5.A02(r6)
            if (r0 == 0) goto L_0x0088
            java.lang.Object r2 = r5.A01
            X.3Uc r2 = (X.AnonymousClass3Uc) r2
            X.10s r1 = r2.A10
            r0 = 17
            X.C98754rf.A00(r1, r2, r0)
        L_0x0088:
            boolean r0 = r5.A03(r6)
            if (r0 == 0) goto L_0x0005
            java.lang.Object r0 = r5.A01
            X.3Uc r0 = (X.AnonymousClass3Uc) r0
            r0.A0T()
            return
        L_0x0096:
            r0 = 0
            X.C18070vi.A0d(r6, r0)
            java.lang.Object r1 = r5.A01
            X.4ZK r1 = (X.AnonymousClass4ZK) r1
            boolean r0 = X.AnonymousClass4ZK.A00(r1, r6)
            if (r0 == 0) goto L_0x0005
            X.1OX r4 = r1.A07
            X.0wl r3 = r1.A06
            r0 = 0
            com.whatsapp.comments.CommentListManager$messageObserver$1$onMessageAdded$1 r2 = new com.whatsapp.comments.CommentListManager$messageObserver$1$onMessageAdded$1
            r2.<init>(r1, r6, r0)
        L_0x00ae:
            X.AnonymousClass3MW.A1X(r3, r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C95514mM.ByH(X.206, int):void");
    }

    public void ByK(AnonymousClass206 r6, int i) {
        AnonymousClass1OX r4;
        C18600wl r3;
        AnonymousClass1OS r2;
        switch (this.A00) {
            case 0:
                C18070vi.A0d(r6, 0);
                if (i == 24) {
                    AnonymousClass4ZK r1 = (AnonymousClass4ZK) this.A01;
                    if (AnonymousClass4ZK.A00(r1, r6)) {
                        r4 = r1.A07;
                        r3 = r1.A06;
                        r2 = new CommentListManager$messageObserver$1$onMessageChanged$1(r1, r6, (C30391dr) null);
                        break;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 3:
                A00(this, r6);
                return;
            case 4:
                C18070vi.A0d(r6, 0);
                if (r6 instanceof C445823z) {
                    C73333Ur r12 = (C73333Ur) this.A01;
                    r4 = C41561wd.A00(r12);
                    r3 = r12.A05;
                    r2 = new EventsViewModel$messageObserver$1$onMessageChanged$1(this, r12, r6, (C30391dr) null);
                    break;
                } else {
                    return;
                }
            default:
                return;
        }
        AnonymousClass3MW.A1X(r3, r2, r4);
    }

    public /* synthetic */ void ByN(AnonymousClass206 r2) {
        if (3 - this.A00 == 0) {
            A00(this, r2);
        }
    }

    public /* synthetic */ void ByQ(AnonymousClass206 r10, AnonymousClass206 r11) {
        Object value;
        AnonymousClass4YY r0;
        Integer num;
        PlaceInfo placeInfo;
        switch (this.A00) {
            case 1:
                if (A02(r11)) {
                    AnonymousClass3Uc r2 = (AnonymousClass3Uc) this.A01;
                    C98754rf.A00(r2.A10, r2, 17);
                }
                if (A03(r11)) {
                    ((AnonymousClass3Uc) this.A01).A0T();
                    return;
                }
                return;
            case 3:
                A00(this, r10);
                return;
            case 4:
                C18070vi.A0h(r10, r11);
                if ((r10 instanceof C445823z) && (r11 instanceof C445823z)) {
                    C73333Ur r4 = (C73333Ur) this.A01;
                    AnonymousClass3MW.A1X(r4.A05, new EventsViewModel$messageObserver$1$onMessageReplaced$1(this, r4, r11, (C30391dr) null), C41561wd.A00(r4));
                    return;
                }
                return;
            case 5:
                C18070vi.A0h(r10, r11);
                if (A04(r10)) {
                    AnonymousClass1G4 r22 = ((AnonymousClass3VY) this.A01).A0L;
                    do {
                        value = r22.getValue();
                        r0 = (AnonymousClass4YY) value;
                        num = AnonymousClass00R.A01;
                        placeInfo = r0.A02;
                    } while (!r22.BFK(value, new AnonymousClass4YY(r0.A01, (C445823z) r11, placeInfo, num, r0.A04)));
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void ByY(Collection collection, int i) {
        if (this.A00 != 0) {
            AnonymousClass2TK.A00(this, collection, i);
            return;
        }
        C18070vi.A0d(collection, 0);
        AnonymousClass4ZK r4 = (AnonymousClass4ZK) this.A01;
        AnonymousClass3MW.A1X(r4.A06, new CommentListManager$messageObserver$1$onMessagesChanged$1(r4, collection, (C30391dr) null), r4.A07);
    }

    public void Bya(Collection collection, Map map) {
        AnonymousClass1OX r4;
        C18600wl r3;
        AnonymousClass1OS r2;
        String str;
        Object value;
        AnonymousClass4YY r0;
        Integer num;
        switch (this.A00) {
            case 0:
                C18070vi.A0d(collection, 0);
                AnonymousClass4ZK r1 = (AnonymousClass4ZK) this.A01;
                r4 = r1.A07;
                r3 = r1.A06;
                r2 = new CommentListManager$messageObserver$1$onMessagesDeleted$1(r1, collection, (C30391dr) null);
                break;
            case 1:
                Iterator it = collection.iterator();
                boolean z = false;
                boolean z2 = false;
                while (it.hasNext()) {
                    AnonymousClass206 A0Y = C17880vN.A0Y(it);
                    if (!z && A02(A0Y)) {
                        AnonymousClass3Uc r22 = (AnonymousClass3Uc) this.A01;
                        C98754rf.A00(r22.A10, r22, 17);
                        z = true;
                    }
                    if (!z2) {
                        if (A03(A0Y)) {
                            ((AnonymousClass3Uc) this.A01).A0T();
                            z2 = true;
                        } else {
                            continue;
                        }
                    }
                    if (z) {
                        return;
                    }
                }
                return;
            case 2:
                return;
            case 3:
                C18070vi.A0d(collection, 0);
                AnonymousClass3Uj r5 = (AnonymousClass3Uj) this.A01;
                if (!collection.isEmpty()) {
                    Iterator it2 = collection.iterator();
                    while (it2.hasNext()) {
                        AnonymousClass206 A0Y2 = C17880vN.A0Y(it2);
                        AnonymousClass205 r23 = A0Y2.A0v;
                        if (C18070vi.A18(r23.A00, r5.A06)) {
                            C691536c A002 = C60492o7.A00(A0Y2);
                            if (A002 == null || (str = A002.A02.A01) == null) {
                                str = r23.A01;
                            }
                            C18070vi.A0b(str);
                            C55492fr r02 = r5.A00;
                            if (r02 != null && r02.A04.contains(str)) {
                                AnonymousClass3Uj.A00(r5);
                                return;
                            }
                        }
                    }
                    return;
                }
                return;
            case 4:
                C18070vi.A0d(collection, 0);
                C73333Ur r12 = (C73333Ur) this.A01;
                r4 = C41561wd.A00(r12);
                r3 = r12.A05;
                r2 = new EventsViewModel$messageObserver$1$onMessagesDeleted$1(this, r12, collection, (C30391dr) null);
                break;
            default:
                C18070vi.A0d(collection, 0);
                Iterator it3 = collection.iterator();
                while (it3.hasNext()) {
                    if (A04(C17880vN.A0Y(it3))) {
                        AnonymousClass1G4 r24 = ((AnonymousClass3VY) this.A01).A0L;
                        do {
                            value = r24.getValue();
                            r0 = (AnonymousClass4YY) value;
                            num = AnonymousClass00R.A0C;
                        } while (!r24.BFK(value, new AnonymousClass4YY(r0.A01, r0.A00, r0.A02, num, r0.A04)));
                        return;
                    }
                }
                return;
        }
        AnonymousClass3MW.A1X(r3, r2, r4);
    }

    public /* synthetic */ void BsP(AnonymousClass206 r1) {
    }

    public /* synthetic */ void ByG(AnonymousClass206 r1) {
    }

    public /* synthetic */ void ByR(AnonymousClass206 r1) {
    }

    public /* synthetic */ void ByZ(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void Byb(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void Byd(Collection collection) {
    }

    public /* synthetic */ void Bz8(C29681ch r1) {
    }

    public /* synthetic */ void Bz9(AnonymousClass206 r1) {
    }

    public /* synthetic */ void BzC(C29681ch r1) {
    }

    public /* synthetic */ void BmY(AnonymousClass206 r1, int i) {
    }

    public /* synthetic */ void BzA(C29681ch r1, boolean z) {
    }

    public /* synthetic */ void C0d(AnonymousClass206 r1, AnonymousClass206 r2) {
    }

    public /* synthetic */ void C0h(AnonymousClass206 r1, AnonymousClass206 r2) {
    }

    public /* synthetic */ void Byc(AnonymousClass1BI r1, Collection collection, boolean z) {
    }
}
