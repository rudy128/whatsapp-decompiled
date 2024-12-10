package X;

import com.whatsapp.jid.PhoneUserJid;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.8mv  reason: invalid class name and case insensitive filesystem */
public abstract class C169808mv extends C60192nY {
    public final AnonymousClass9j5 A00;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0029, code lost:
        if (r1 != null) goto L_0x002b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0073  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C20126A8l A0C(X.A6U r15, java.lang.String r16, boolean r17) {
        /*
            r14 = this;
            r0 = 2
            X.C18070vi.A0d(r15, r0)
            r3 = 1
            java.lang.String[] r2 = r15.A06
            X.8cn r4 = r15.A03
            X.2rJ r0 = X.C62382rJ.A03
            X.2rJ r1 = r15.A01
            boolean r0 = X.C18070vi.A18(r0, r1)
            if (r0 == 0) goto L_0x010c
            if (r4 == 0) goto L_0x010c
            int r0 = r4.bitField0_
            boolean r0 = X.AnonymousClass8BW.A1Q(r0)
            if (r0 == 0) goto L_0x010c
            r6 = r14
            boolean r5 = r14 instanceof X.AnonymousClass8n9
            if (r5 == 0) goto L_0x00a1
            X.8Xx r1 = r4.botWelcomeRequestAction_
            if (r1 != 0) goto L_0x002b
            X.8Xx r1 = X.C164198Xx.DEFAULT_INSTANCE
            r0 = 0
            if (r1 == 0) goto L_0x0031
        L_0x002b:
            boolean r0 = r1.isSent_
            boolean r0 = X.C108975cc.A1B(r0)
        L_0x0031:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r0)
        L_0x0035:
            if (r5 == 0) goto L_0x0073
            r0 = r6
            X.8n9 r0 = (X.AnonymousClass8n9) r0
            java.lang.Integer r0 = r0.A04
        L_0x003c:
            int r1 = r0.intValue()
            r0 = 0
            r10 = r16
            r13 = r17
            if (r1 == r0) goto L_0x005f
            if (r1 != r3) goto L_0x0107
            long r11 = r4.timestamp_
            X.C18070vi.A0d(r2, r0)
            int r0 = r2.length
            if (r3 >= r0) goto L_0x005d
            r9 = r2[r3]
        L_0x0053:
            X.A2n r7 = r15.A02
            X.8qD r5 = new X.8qD
            r5.<init>(r6, r7, r8, r9, r10, r11, r13)
        L_0x005a:
            X.A8l r5 = (X.C20126A8l) r5
            return r5
        L_0x005d:
            r9 = 0
            goto L_0x0053
        L_0x005f:
            long r11 = r4.timestamp_
            X.C18070vi.A0d(r2, r0)
            int r0 = r2.length
            if (r3 >= r0) goto L_0x0071
            r9 = r2[r3]
        L_0x0069:
            X.A2n r7 = r15.A02
            X.8nA r5 = new X.8nA
            r5.<init>(r6, r7, r8, r9, r10, r11, r13)
            goto L_0x005a
        L_0x0071:
            r9 = 0
            goto L_0x0069
        L_0x0073:
            boolean r0 = r14 instanceof X.AnonymousClass8n8
            if (r0 == 0) goto L_0x007d
            r0 = r6
            X.8n8 r0 = (X.AnonymousClass8n8) r0
            java.lang.Integer r0 = r0.A03
            goto L_0x003c
        L_0x007d:
            boolean r0 = r14 instanceof X.AnonymousClass8n6
            if (r0 == 0) goto L_0x0087
            r0 = r6
            X.8n6 r0 = (X.AnonymousClass8n6) r0
            java.lang.Integer r0 = r0.A02
            goto L_0x003c
        L_0x0087:
            boolean r0 = r14 instanceof X.AnonymousClass8n5
            if (r0 == 0) goto L_0x0091
            r0 = r6
            X.8n5 r0 = (X.AnonymousClass8n5) r0
            java.lang.Integer r0 = r0.A02
            goto L_0x003c
        L_0x0091:
            boolean r0 = r14 instanceof X.AnonymousClass8n7
            if (r0 == 0) goto L_0x009b
            r0 = r6
            X.8n7 r0 = (X.AnonymousClass8n7) r0
            java.lang.Integer r0 = r0.A02
            goto L_0x003c
        L_0x009b:
            r0 = r6
            X.8n4 r0 = (X.AnonymousClass8n4) r0
            java.lang.Integer r0 = r0.A02
            goto L_0x003c
        L_0x00a1:
            boolean r0 = r14 instanceof X.AnonymousClass8n8
            if (r0 == 0) goto L_0x00b0
            X.8YC r0 = r4.nuxAction_
            if (r0 != 0) goto L_0x00ad
            X.8YC r0 = X.AnonymousClass8YC.DEFAULT_INSTANCE
            if (r0 == 0) goto L_0x00e0
        L_0x00ad:
            boolean r0 = r0.acknowledged_
            goto L_0x0031
        L_0x00b0:
            boolean r0 = r14 instanceof X.AnonymousClass8n6
            if (r0 == 0) goto L_0x00c0
            X.8YI r0 = r4.privacySettingRelayAllCalls_
            if (r0 != 0) goto L_0x00bc
            X.8YI r0 = X.AnonymousClass8YI.DEFAULT_INSTANCE
            if (r0 == 0) goto L_0x00e0
        L_0x00bc:
            boolean r0 = r0.isEnabled_
            goto L_0x0031
        L_0x00c0:
            boolean r0 = r14 instanceof X.AnonymousClass8n5
            if (r0 == 0) goto L_0x00d0
            X.8YH r0 = r4.privacySettingDisableLinkPreviewsAction_
            if (r0 != 0) goto L_0x00cc
            X.8YH r0 = X.AnonymousClass8YH.DEFAULT_INSTANCE
            if (r0 == 0) goto L_0x00e0
        L_0x00cc:
            boolean r0 = r0.isPreviewsDisabled_
            goto L_0x0031
        L_0x00d0:
            boolean r0 = r14 instanceof X.AnonymousClass8n7
            if (r0 == 0) goto L_0x00e3
            X.8Y4 r0 = r4.externalWebBetaAction_
            if (r0 != 0) goto L_0x00dc
            X.8Y4 r0 = X.AnonymousClass8Y4.DEFAULT_INSTANCE
            if (r0 == 0) goto L_0x00e0
        L_0x00dc:
            boolean r0 = r0.isOptIn_
            goto L_0x0031
        L_0x00e0:
            r8 = 0
            goto L_0x0035
        L_0x00e3:
            X.8YO r0 = r4.ugcBot_
            r1 = r0
            if (r0 != 0) goto L_0x00ea
            X.8YO r0 = X.AnonymousClass8YO.DEFAULT_INSTANCE
        L_0x00ea:
            r8 = 0
            if (r0 == 0) goto L_0x0035
            int r0 = r0.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0035
            if (r1 != 0) goto L_0x00f9
            X.8YO r1 = X.AnonymousClass8YO.DEFAULT_INSTANCE
            if (r1 == 0) goto L_0x0035
        L_0x00f9:
            X.DSQ r0 = r1.definition_
            if (r0 == 0) goto L_0x0035
            byte[] r0 = r0.A06()
            java.lang.String r8 = X.C108955ca.A13(r0)
            goto L_0x0035
        L_0x0107:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x010c:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "PropertySyncHandler failed to parse mutation, operation: "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = ", "
            r2.append(r0)
            r5 = 0
            if (r4 == 0) goto L_0x012a
            long r0 = r4.timestamp_
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L_0x0126:
            X.AnonymousClass8BW.A1N(r0, r2)
            return r5
        L_0x012a:
            r0 = r5
            goto L_0x0126
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C169808mv.A0C(X.A6U, java.lang.String, boolean):X.A8l");
    }

    /* renamed from: A0M */
    public void A0I(C170558qD r6, C170558qD r7) {
        C18070vi.A0d(r6, 0);
        if (r7 != null && r7.A04 >= r6.A04) {
            A09(r6);
        } else if (A0N(r6)) {
            A0B(r6, r7);
        } else {
            A0A(r6);
        }
    }

    public /* bridge */ /* synthetic */ void A0G(C20126A8l a8l) {
        C170558qD r2 = (C170558qD) a8l;
        C18070vi.A0d(r2, 0);
        if (A0N(r2)) {
            A07(r2);
        }
    }

    public /* bridge */ /* synthetic */ void A0H(C20126A8l a8l) {
        C170558qD r2 = (C170558qD) a8l;
        C18070vi.A0d(r2, 0);
        if (A0N(r2)) {
            A08(r2);
        } else {
            A06(r2);
        }
    }

    public Integer A0K() {
        if (this instanceof AnonymousClass8n9) {
            return ((AnonymousClass8n9) this).A03;
        }
        if (this instanceof AnonymousClass8n8) {
            return ((AnonymousClass8n8) this).A02;
        }
        if (this instanceof AnonymousClass8n6) {
            return ((AnonymousClass8n6) this).A01;
        }
        if (this instanceof AnonymousClass8n5) {
            return ((AnonymousClass8n5) this).A01;
        }
        if (this instanceof AnonymousClass8n7) {
            return ((AnonymousClass8n7) this).A01;
        }
        return ((AnonymousClass8n4) this).A01;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0085, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0089, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008d, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0090, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List A0L() {
        /*
            r7 = this;
            boolean r0 = r7 instanceof X.AnonymousClass8n9
            if (r0 == 0) goto L_0x0091
            r4 = r7
            X.8n9 r4 = (X.AnonymousClass8n9) r4
            X.00H r0 = r4.A02
            java.lang.Object r0 = r0.get()
            X.2hw r0 = (X.C56732hw) r0
            java.util.HashSet r6 = X.C17880vN.A12()
            X.1Cd r0 = r0.A00
            X.1at r3 = r0.get()
            r0 = r3
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x008a }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x008a }
            java.lang.String r1 = "SELECT chat_row_id FROM bot_chat_info WHERE welcome_request_message_sent = 1"
            java.lang.String r0 = "BotChatInfoStoreGET_ALL_CHATS_HAVE_SENT_WELCOME_REQUEST_MESSAGE"
            android.database.Cursor r2 = X.C23141Ev.A00(r2, r1, r0)     // Catch:{ all -> 0x008a }
            java.lang.String r0 = "chat_row_id"
            int r1 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0083 }
        L_0x002c:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0083 }
            if (r0 == 0) goto L_0x0036
            X.C17900vP.A0K(r2, r6, r1)     // Catch:{ all -> 0x0083 }
            goto L_0x002c
        L_0x0036:
            r6.size()     // Catch:{ all -> 0x0083 }
            r2.close()     // Catch:{ all -> 0x008a }
            r3.close()
            java.util.HashSet r5 = X.C17880vN.A12()
            java.util.Iterator r3 = r6.iterator()
        L_0x0047:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x005d
            long r1 = X.C17890vO.A07(r3)
            X.1LW r0 = r4.A01
            X.1BI r0 = r0.A0B(r1)
            if (r0 == 0) goto L_0x0047
            r5.add(r0)
            goto L_0x0047
        L_0x005d:
            r5.size()
            java.util.ArrayList r4 = X.C29351c6.A0D(r5)
            java.util.Iterator r3 = r5.iterator()
        L_0x0068:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0105
            com.whatsapp.jid.Jid r0 = X.C17880vN.A0S(r3)
            java.lang.Boolean r2 = X.AnonymousClass000.A0i()
            java.lang.String r1 = r0.getRawString()
            X.9qc r0 = new X.9qc
            r0.<init>(r2, r1)
            r4.add(r0)
            goto L_0x0068
        L_0x0083:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0085 }
        L_0x0085:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x008a }
            throw r0     // Catch:{ all -> 0x008a }
        L_0x008a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x008c }
        L_0x008c:
            r0 = move-exception
            X.CDX.A00(r3, r1)
            throw r0
        L_0x0091:
            boolean r0 = r7 instanceof X.AnonymousClass8n8
            if (r0 == 0) goto L_0x0106
            r0 = r7
            X.8n8 r0 = (X.AnonymousClass8n8) r0
            X.00H r0 = r0.A00
            java.lang.Object r0 = r0.get()
            X.1aA r0 = (X.C28401aA) r0
            java.util.Map r0 = r0.A02
            java.util.Collection r0 = r0.values()
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            java.util.Iterator r3 = r0.iterator()
        L_0x00ae:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00c6
            java.lang.Object r2 = r3.next()
            r1 = r2
            X.1aB r1 = (X.C28411aB) r1
            r0 = 0
            boolean r0 = r1.Bck(r0)
            if (r0 == 0) goto L_0x00ae
            r4.add(r2)
            goto L_0x00ae
        L_0x00c6:
            java.util.ArrayList r2 = X.C29351c6.A0D(r4)
            java.util.Iterator r1 = r4.iterator()
        L_0x00ce:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00e2
            java.lang.Object r0 = r1.next()
            X.1aB r0 = (X.C28411aB) r0
            java.lang.String r0 = r0.BVY()
            r2.add(r0)
            goto L_0x00ce
        L_0x00e2:
            java.util.Set r0 = X.C29431cG.A11(r2)
            java.util.ArrayList r4 = X.C29351c6.A0D(r0)
            java.util.Iterator r3 = r0.iterator()
        L_0x00ee:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0105
            java.lang.String r2 = X.C17880vN.A0v(r3)
            java.lang.Boolean r1 = X.AnonymousClass000.A0i()
            X.9qc r0 = new X.9qc
            r0.<init>(r1, r2)
            r4.add(r0)
            goto L_0x00ee
        L_0x0105:
            return r4
        L_0x0106:
            boolean r0 = r7 instanceof X.AnonymousClass8n6
            if (r0 == 0) goto L_0x012a
            r0 = r7
            X.8n6 r0 = (X.AnonymousClass8n6) r0
            X.1VE r0 = r0.A00
            android.content.SharedPreferences r1 = X.AnonymousClass1VE.A00(r0)
            java.lang.String r0 = "privacy_always_relay"
            boolean r0 = X.C17880vN.A1W(r1, r0)
            if (r0 == 0) goto L_0x0184
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            r1 = 0
            X.9qc r0 = new X.9qc
            r0.<init>(r2, r1)
            java.util.List r0 = X.C18070vi.A0M(r0)
            return r0
        L_0x012a:
            boolean r0 = r7 instanceof X.AnonymousClass8n5
            if (r0 == 0) goto L_0x014e
            r0 = r7
            X.8n5 r0 = (X.AnonymousClass8n5) r0
            X.0z4 r0 = r0.A00
            android.content.SharedPreferences r1 = X.C17890vO.A0B(r0)
            java.lang.String r0 = "privacy_linkpreview"
            boolean r0 = X.C17880vN.A1W(r1, r0)
            if (r0 == 0) goto L_0x0184
            java.lang.Boolean r2 = X.AnonymousClass000.A0i()
            r1 = 0
            X.9qc r0 = new X.9qc
            r0.<init>(r2, r1)
            java.util.List r0 = X.C18070vi.A0M(r0)
            return r0
        L_0x014e:
            boolean r0 = r7 instanceof X.AnonymousClass8n7
            if (r0 == 0) goto L_0x0172
            r0 = r7
            X.8n7 r0 = (X.AnonymousClass8n7) r0
            X.0z4 r0 = r0.A00
            android.content.SharedPreferences r1 = X.C17890vO.A0B(r0)
            java.lang.String r0 = "external_web_beta_is_opt_in"
            boolean r0 = X.C17880vN.A1W(r1, r0)
            if (r0 == 0) goto L_0x0184
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            r1 = 0
            X.9qc r0 = new X.9qc
            r0.<init>(r2, r1)
            java.util.List r0 = X.C18070vi.A0M(r0)
            return r0
        L_0x0172:
            r0 = r7
            X.8n4 r0 = (X.AnonymousClass8n4) r0
            X.00H r0 = r0.A00
            java.lang.Object r0 = r0.get()
            X.9fR r0 = (X.C187209fR) r0
            X.00H r0 = r0.A00
            r0.get()
            X.1Kq r0 = X.C24521Kq.$redex_init_class
        L_0x0184:
            X.0wS r0 = X.C18460wS.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C169808mv.A0L():java.util.List");
    }

    public boolean A0N(C170558qD r7) {
        Boolean bool;
        if (this instanceof AnonymousClass8n9) {
            AnonymousClass8n9 r5 = (AnonymousClass8n9) this;
            Object obj = r7.A00;
            if (obj instanceof Boolean) {
                bool = (Boolean) obj;
            } else {
                bool = null;
            }
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                AnonymousClass1BI A02 = AnonymousClass1BI.A00.A02(r7.A02);
                if (A02 != null) {
                    if (A02 instanceof PhoneUserJid) {
                        C42701yb.A01(A02);
                    }
                    r7.A0G(A02.getRawString()).A0A();
                    r7.A0G(A02.getRawString()).A0A();
                    A02.equals(A02);
                    ((C56732hw) r5.A02.get()).A00(r5.A01.A09(A02), booleanValue);
                }
            }
            return true;
        } else if (this instanceof AnonymousClass8n8) {
            AnonymousClass8n8 r3 = (AnonymousClass8n8) this;
            String str = r7.A02;
            Object obj2 = r7.A00;
            if (!(obj2 instanceof Boolean) || str == null) {
                return false;
            }
            boolean A1Y = AnonymousClass000.A1Y(obj2);
            C28411aB r0 = (C28411aB) ((C28401aA) r3.A01.get()).A02.get(str);
            if (r0 == null) {
                return true;
            }
            r0.BkZ(A1Y);
            return true;
        } else if (this instanceof AnonymousClass8n6) {
            AnonymousClass8n6 r1 = (AnonymousClass8n6) this;
            Object obj3 = r7.A00;
            if (!(obj3 instanceof Boolean)) {
                return false;
            }
            AnonymousClass1VE r12 = r1.A00;
            C18070vi.A0z(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            C17880vN.A1F(AnonymousClass3MZ.A08(r12), "privacy_always_relay", AnonymousClass000.A1Y(obj3));
            return true;
        } else if (this instanceof AnonymousClass8n5) {
            AnonymousClass8n5 r13 = (AnonymousClass8n5) this;
            Object obj4 = r7.A00;
            if (!(obj4 instanceof Boolean)) {
                return false;
            }
            C19830z4 r14 = r13.A00;
            C18070vi.A0z(obj4, "null cannot be cast to non-null type kotlin.Boolean");
            C17880vN.A1F(C19830z4.A00(r14), "privacy_linkpreview", AnonymousClass000.A1Y(obj4));
            return true;
        } else if (this instanceof AnonymousClass8n7) {
            AnonymousClass8n7 r15 = (AnonymousClass8n7) this;
            Object obj5 = r7.A00;
            if (!(obj5 instanceof Boolean)) {
                return false;
            }
            C19830z4 r16 = r15.A00;
            C18070vi.A0z(obj5, "null cannot be cast to non-null type kotlin.Boolean");
            C17880vN.A1F(C19830z4.A00(r16), "external_web_beta_is_opt_in", AnonymousClass000.A1Y(obj5));
            return true;
        } else {
            ((C187209fR) ((AnonymousClass8n4) this).A00.get()).A00.get();
            C24521Kq r02 = C24521Kq.$redex_init_class;
            return true;
        }
    }

    public C169808mv(AnonymousClass9j5 r1, C26331Rs r2) {
        super(r2);
        this.A00 = r1;
    }

    public String A0E() {
        return AnonymousClass9QQ.A00(A0K());
    }

    public List A0F(boolean z) {
        List<C193759qc> A0L = A0L();
        ArrayList A0D = C29351c6.A0D(A0L);
        for (C193759qc A002 : A0L) {
            A0D.add(this.A00.A00(this, A002));
        }
        return A0D;
    }
}
