package X;

import com.whatsapp.jid.Jid;
import java.util.List;

/* renamed from: X.4kb  reason: invalid class name and case insensitive filesystem */
public class C94424kb implements C108615c0 {
    public final C34511kb A00;
    public final C86414Rn A01;
    public final A6O A02;

    public void BdS(AnonymousClass1FY r1) {
    }

    public void BjQ() {
        this.A01.A00.A00(C77953rs.class);
    }

    public void CMd() {
        C77943rr r8 = (C77943rr) this.A01.A00.A00(C77943rr.class);
        if (r8 != null) {
            boolean A08 = r8.A08();
            boolean A09 = r8.A09();
            if (A08) {
                if (!A09) {
                    C19830z4 r6 = r8.A05;
                    if (C17890vO.A0B(r6).getLong("pref_cag_events_banner_first_seen_timestamp", 0) == 0) {
                        C17880vN.A1D(C19830z4.A00(r6), "pref_cag_events_banner_first_seen_timestamp", AnonymousClass11P.A01(r8.A04));
                    }
                    r8.A07(false);
                }
            } else if (A09) {
                r8.A06(false);
            }
        }
    }

    public void CQk(AnonymousClass1E7 r4) {
        C77963rt r2 = (C77963rt) this.A01.A00.A00(C77963rt.class);
        if (r2 != null) {
            r2.A00 = r4;
            boolean A0C = r2.BEC(r4);
            boolean A09 = r2.A09();
            if (A0C) {
                if (A09) {
                    AnonymousClass1E7 r1 = r2.A00;
                    if (r1 != null) {
                        r2.BD4((AnonymousClass5Z8) null, r1);
                        return;
                    }
                    return;
                }
                r2.A07(false);
            } else if (A09) {
                r2.A06(false);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002a, code lost:
        if (r1 == com.whatsapp.voipcalling.CallState.RECEIVED_CALL) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005a, code lost:
        if (X.C40811vJ.A0F(r6.A0D, r6.A0J) != false) goto L_0x005c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void CQn(X.C178119Bw r11) {
        /*
            r10 = this;
            X.4Rn r0 = r10.A01
            java.lang.Class<X.3s0> r1 = X.AnonymousClass3s0.class
            X.4XJ r0 = r0.A00
            X.4rI r6 = r0.A00(r1)
            X.3s0 r6 = (X.AnonymousClass3s0) r6
            if (r6 == 0) goto L_0x008f
            X.1HQ r0 = r6.A0E
            com.whatsapp.voipcalling.CallInfo r5 = r0.BO3()
            r4 = 0
            if (r5 == 0) goto L_0x00b0
            com.whatsapp.jid.GroupJid r0 = r5.groupJid
        L_0x0019:
            X.1E7 r3 = r6.A0I
            boolean r0 = X.AnonymousClass3MZ.A1Y(r3, r0)
            r9 = 1
            r2 = 0
            if (r0 == 0) goto L_0x002c
            if (r5 == 0) goto L_0x00ad
            com.whatsapp.voipcalling.CallState r1 = r5.callState
        L_0x0027:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.RECEIVED_CALL
            r8 = 0
            if (r1 != r0) goto L_0x002d
        L_0x002c:
            r8 = 1
        L_0x002d:
            if (r11 == 0) goto L_0x00ab
            com.whatsapp.jid.GroupJid r0 = r11.A0C
            if (r0 == 0) goto L_0x00ab
            com.whatsapp.jid.GroupJid r0 = r11.A0C
            boolean r0 = X.AnonymousClass3MZ.A1Y(r3, r0)
            if (r0 == 0) goto L_0x00ab
            int r1 = r11.A07
            r0 = 3
            boolean r0 = X.AnonymousClass000.A1T(r1, r0)
            if (r0 == 0) goto L_0x004c
            X.0ve r0 = r6.A0J
            boolean r0 = X.C40811vJ.A0U(r0)
            if (r0 != 0) goto L_0x00ab
        L_0x004c:
            boolean r0 = r11.A0W()
            if (r0 != 0) goto L_0x005c
            X.0ve r1 = r6.A0J
            X.11S r0 = r6.A0D
            boolean r0 = X.C40811vJ.A0F(r0, r1)
            if (r0 == 0) goto L_0x00ab
        L_0x005c:
            r7 = 1
        L_0x005d:
            com.whatsapp.voipcalling.CallState r1 = r6.A09
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r1 != r0) goto L_0x0069
            if (r5 == 0) goto L_0x00a9
            com.whatsapp.voipcalling.CallState r0 = r5.callState
            if (r0 == 0) goto L_0x00a9
        L_0x0069:
            r3 = 1
        L_0x006a:
            if (r11 == 0) goto L_0x007c
            java.util.ArrayList r1 = r11.A0B()
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0093
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0093
        L_0x007a:
            r9 = 0
        L_0x007b:
            r2 = r9
        L_0x007c:
            if (r8 == 0) goto L_0x0090
            if (r7 == 0) goto L_0x0090
            if (r3 == 0) goto L_0x0090
            if (r2 == 0) goto L_0x0090
            r6.A08 = r11
        L_0x0086:
            X.AnonymousClass3s0.A02(r6)
            if (r5 == 0) goto L_0x008d
            com.whatsapp.voipcalling.CallState r4 = r5.callState
        L_0x008d:
            r6.A09 = r4
        L_0x008f:
            return
        L_0x0090:
            r6.A08 = r4
            goto L_0x0086
        L_0x0093:
            java.util.Iterator r2 = r1.iterator()
        L_0x0097:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x007a
            java.lang.Object r0 = r2.next()
            X.9Bv r0 = (X.C178109Bv) r0
            int r1 = r0.A01
            r0 = 5
            if (r1 != r0) goto L_0x0097
            goto L_0x007b
        L_0x00a9:
            r3 = 0
            goto L_0x006a
        L_0x00ab:
            r7 = 0
            goto L_0x005d
        L_0x00ad:
            r1 = r4
            goto L_0x0027
        L_0x00b0:
            r0 = r4
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94424kb.CQn(X.9Bw):void");
    }

    public void CQt(Jid jid, int i) {
        AnonymousClass1EC A05;
        C78003rx r3 = (C78003rx) this.A01.A00.A00(C78003rx.class);
        if (r3 != null && (jid instanceof AnonymousClass1EC) && (A05 = this.A00.A05((AnonymousClass1EC) jid)) != null) {
            r3.A00 = i;
            r3.A02 = A05;
            boolean A08 = r3.A08();
            boolean A09 = r3.A09();
            if (A08) {
                if (A09) {
                    C78003rx.A00(r3);
                } else {
                    r3.A07(false);
                }
            } else if (A09) {
                r3.A06(false);
            }
        }
    }

    public void CR3() {
        C77993rw r2 = (C77993rw) this.A01.A00.A00(C77993rw.class);
        if (r2 == null) {
            return;
        }
        if (!r2.A08()) {
            r2.A06(false);
        } else if (r2.A09()) {
            r2.A0A();
        } else {
            r2.A07(false);
        }
    }

    public void CR4(AnonymousClass1E7 r8) {
        C78013ry r5 = (C78013ry) this.A01.A00.A00(C78013ry.class);
        if (r5 != null) {
            r5.A01 = r8;
            AnonymousClass1SG r6 = r5.A07;
            C29691ci A0A = r6.A01.A0A((AnonymousClass1BI) C72453Mb.A0m(r8));
            if (A0A != null && A0A.A0E != -1) {
                C17890vO.A0u(new AnonymousClass491(r5, r6, r5.A09), r5.A0A);
            } else if (r5.A09()) {
                r5.A06(true);
            }
        }
    }

    public void CRD(AnonymousClass1E7 r4, int i) {
        AnonymousClass1EC r0;
        C77933rq r2 = (C77933rq) this.A01.A00.A00(C77933rq.class);
        if (r2 != null) {
            r2.A00 = i;
            if (r4.A0F()) {
                r0 = AnonymousClass3Ma.A0n(r4);
            } else {
                r0 = null;
            }
            r2.A02 = r0;
            r2.A03 = r4.A0v;
            boolean A08 = r2.A08();
            boolean A09 = r2.A09();
            if (A08) {
                if (A09) {
                    C77933rq.A00(r2);
                } else {
                    r2.A07(false);
                }
            } else if (A09) {
                r2.A06(false);
            }
        }
    }

    public void CRP(C195409tI r6) {
        if (r6 != null) {
            this.A02.A03(new C134696r0(r6.A04, r6.A03), r6.A01, "ConversationDelegate/updateSurveyBanner before conversationBanners.show");
        }
        this.A01.A01(C77983rv.class, false);
    }

    public C94424kb(C34511kb r1, C86414Rn r2, A6O a6o) {
        this.A02 = a6o;
        this.A01 = r2;
        this.A00 = r1;
    }

    public void C0e(List list) {
        list.size();
        C77973ru r0 = (C77973ru) this.A01.A00.A00(C77973ru.class);
        if (r0 != null) {
            list.size();
            r0.A04.A0T(list);
        }
    }
}
