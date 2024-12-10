package X;

/* renamed from: X.7Pc  reason: invalid class name and case insensitive filesystem */
public class C146437Pc implements Runnable {
    public final int A00;
    public final Object A01;

    public C146437Pc(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:871)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:128)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:200:0x048b=Splitter:B:200:0x048b, B:170:0x040f=Splitter:B:170:0x040f} */
    public final void run() {
        /*
            r30 = this;
            r1 = r30
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x03ec;
                case 1: goto L_0x0448;
                case 2: goto L_0x0455;
                case 3: goto L_0x0091;
                case 4: goto L_0x045f;
                case 5: goto L_0x00b7;
                case 6: goto L_0x00dd;
                case 7: goto L_0x046c;
                case 8: goto L_0x051f;
                case 9: goto L_0x0543;
                case 10: goto L_0x0551;
                case 11: goto L_0x055d;
                case 12: goto L_0x0569;
                case 13: goto L_0x0573;
                case 14: goto L_0x057f;
                case 15: goto L_0x05c5;
                case 16: goto L_0x05dd;
                case 17: goto L_0x05ff;
                case 18: goto L_0x060f;
                case 19: goto L_0x061a;
                case 20: goto L_0x001c;
                case 21: goto L_0x0053;
                case 22: goto L_0x03b5;
                case 23: goto L_0x0624;
                case 24: goto L_0x0067;
                case 25: goto L_0x064d;
                case 26: goto L_0x00ec;
                case 27: goto L_0x0655;
                case 28: goto L_0x0687;
                case 29: goto L_0x068f;
                case 30: goto L_0x069d;
                case 31: goto L_0x06a9;
                case 32: goto L_0x06b5;
                case 33: goto L_0x06bc;
                case 34: goto L_0x0717;
                case 35: goto L_0x0138;
                case 36: goto L_0x0739;
                case 37: goto L_0x027e;
                case 38: goto L_0x030c;
                case 39: goto L_0x031f;
                case 40: goto L_0x0790;
                case 41: goto L_0x07fb;
                case 42: goto L_0x030c;
                case 43: goto L_0x0805;
                case 44: goto L_0x0819;
                case 45: goto L_0x035c;
                case 46: goto L_0x0827;
                case 47: goto L_0x0007;
                case 48: goto L_0x0007;
                case 49: goto L_0x03a2;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r1.A01
            X.6zB r0 = (X.C139626zB) r0
            X.8Am r4 = r0.A07
            X.6pq r3 = r0.A04
            X.5xr r2 = r0.A06
            X.71l r1 = r0.A05
            r0 = 1
            android.content.Intent r0 = X.AnonymousClass743.A00(r3, r1, r2, r0, r0)
        L_0x0018:
            r4.C4L(r0)
        L_0x001b:
            return
        L_0x001c:
            java.lang.Object r3 = r1.A01
            com.whatsapp.companionmode.registration.RegisterAsCompanionLinkCodeActivity r3 = (com.whatsapp.companionmode.registration.RegisterAsCompanionLinkCodeActivity) r3
            X.1Dw r0 = com.whatsapp.jid.UserJid.Companion
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = r3.A07
            if (r0 != 0) goto L_0x002e
            java.lang.String r0 = "cc"
            goto L_0x03b0
        L_0x002e:
            r1.append(r0)
            java.lang.String r0 = r3.A09
            if (r0 != 0) goto L_0x0039
            java.lang.String r0 = "pn"
            goto L_0x03b0
        L_0x0039:
            r1.append(r0)
            java.lang.String r0 = "@s.whatsapp.net"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            com.whatsapp.jid.UserJid r2 = X.C22941Dw.A03(r0)
            X.1Tf r0 = r3.A02
            if (r0 == 0) goto L_0x0063
            r1 = 1
            X.11w r0 = X.C26721Tf.A00(r0)
            r0.A09(r2, r1)
            return
        L_0x0053:
            java.lang.Object r0 = r1.A01
            com.whatsapp.companionmode.registration.RegisterAsCompanionLinkCodeActivity r0 = (com.whatsapp.companionmode.registration.RegisterAsCompanionLinkCodeActivity) r0
            X.1Tf r0 = r0.A02
            if (r0 == 0) goto L_0x0063
            X.11w r0 = X.C26721Tf.A00(r0)
            r0.A05()
            return
        L_0x0063:
            java.lang.String r0 = "companionRegistrationManager"
            goto L_0x03b0
        L_0x0067:
            java.lang.Object r3 = r1.A01
            com.whatsapp.companionmode.registration.RegisterAsCompanionLinkCodeActivity r3 = (com.whatsapp.companionmode.registration.RegisterAsCompanionLinkCodeActivity) r3
            X.00H r0 = r3.A06
            if (r0 == 0) goto L_0x008d
            java.lang.Object r0 = r0.get()
            X.1cN r0 = (X.C29491cN) r0
            java.lang.String r1 = r0.A01
            if (r1 == 0) goto L_0x03d0
            int r0 = r1.length()
            if (r0 == 0) goto L_0x03d0
            X.00H r0 = r3.A06
            if (r0 == 0) goto L_0x008d
            java.lang.Object r0 = X.C18070vi.A0E(r0)
            X.1cN r0 = (X.C29491cN) r0
            X.AnonymousClass6W4.A00(r3, r0, r1)
            return
        L_0x008d:
            java.lang.String r0 = "accountSwitcher"
            goto L_0x03b0
        L_0x0091:
            java.lang.Object r2 = r1.A01
            X.1To r2 = (X.C26811To) r2
            X.1Te r0 = r2.A0A
            boolean r0 = r0.A04()
            if (r0 == 0) goto L_0x00ad
            X.11S r0 = r2.A07
            boolean r0 = r0.A0N()
            r1 = 1
            r0 = r0 ^ 1
            X.C17960vV.A0C(r0)
            r2.A0K(r1)
            return
        L_0x00ad:
            boolean r0 = r2.A0T()
            if (r0 == 0) goto L_0x001b
            r2.A0I()
            return
        L_0x00b7:
            java.lang.Object r2 = r1.A01
            X.1To r2 = (X.C26811To) r2
            X.11S r0 = r2.A07
            boolean r0 = r0.A0N()
            if (r0 != 0) goto L_0x001b
            X.00H r0 = r2.A0a
            java.lang.Object r1 = r0.get()
            X.2lN r1 = (X.C58862lN) r1
            java.lang.String r0 = "primary_feature"
            X.2nY r0 = r1.A00(r0)
            X.2Cn r0 = (X.C46012Cn) r0
            if (r0 == 0) goto L_0x001b
            java.util.List r0 = r0.A0L()
            r2.A0N(r0)
            return
        L_0x00dd:
            java.lang.Object r1 = r1.A01
            X.2Cp r1 = (X.C46032Cp) r1
            X.11S r0 = r1.A03
            boolean r0 = r0.A0N()
            if (r0 == 0) goto L_0x001b
            monitor-enter(r1)
            goto L_0x083a
        L_0x00ec:
            java.lang.Object r4 = r1.A01
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            r3 = 0
            r6 = 0
            r5 = 0
            r2 = 0
        L_0x00f4:
            int r0 = r4.getChildCount()
            if (r6 >= r0) goto L_0x0110
            android.view.View r1 = r4.getChildAt(r6)
            int r0 = r1.getWidth()
            int r5 = r5 + r0
            android.view.ViewGroup$MarginLayoutParams r0 = X.AnonymousClass3MW.A0B(r1)
            int r1 = r0.leftMargin
            int r0 = r0.rightMargin
            int r1 = r1 + r0
            int r2 = r2 + r1
            int r6 = r6 + 1
            goto L_0x00f4
        L_0x0110:
            if (r5 <= 0) goto L_0x001b
            android.view.ViewGroup$MarginLayoutParams r0 = X.AnonymousClass3MW.A0B(r4)
            int r1 = r0.leftMargin
            int r0 = r0.rightMargin
            int r1 = r1 + r0
            int r0 = r4.getPaddingLeft()
            int r1 = r1 + r0
            int r0 = r4.getPaddingRight()
            int r1 = r1 + r0
            int r0 = r4.getWidth()
            int r0 = r0 - r1
            int r0 = r0 - r2
            if (r5 < r0) goto L_0x012e
            r3 = 1
        L_0x012e:
            int r0 = r4.getOrientation()
            if (r0 == r3) goto L_0x001b
            r4.setOrientation(r3)
            return
        L_0x0138:
            java.lang.Object r0 = r1.A01
            com.whatsapp.contact.contactform.ContactFormActivity r0 = (com.whatsapp.contact.contactform.ContactFormActivity) r0
            X.6oN r9 = r0.A0A     // Catch:{ Exception -> 0x001b }
            if (r9 != 0) goto L_0x0147
            java.lang.String r0 = "contactFormDeleteContactController"
            X.C18070vi.A11(r0)     // Catch:{ Exception -> 0x001b }
            r0 = 0
            throw r0     // Catch:{ Exception -> 0x001b }
        L_0x0147:
            X.1M9 r8 = r9.A01     // Catch:{ Exception -> 0x001b }
            X.1BI r7 = r9.A06     // Catch:{ Exception -> 0x001b }
            X.1E7 r6 = r8.A0E(r7)     // Catch:{ Exception -> 0x001b }
            X.5xr r0 = r9.A03     // Catch:{ Exception -> 0x001b }
            java.lang.String r23 = r0.A05()     // Catch:{ Exception -> 0x001b }
            java.lang.String r22 = r0.A02()     // Catch:{ Exception -> 0x001b }
            android.content.Intent r5 = X.C17880vN.A0A()     // Catch:{ Exception -> 0x001b }
            if (r6 == 0) goto L_0x0273
            int r0 = r23.length()     // Catch:{ Exception -> 0x001b }
            if (r0 <= 0) goto L_0x0273
            boolean r0 = r9.A08     // Catch:{ Exception -> 0x001b }
            if (r0 == 0) goto L_0x0254
            java.lang.Long r1 = r9.A07     // Catch:{ Exception -> 0x001b }
            if (r1 == 0) goto L_0x0254
            r13 = 2
            r6.A01 = r13     // Catch:{ Exception -> 0x001b }
            X.11C r0 = r8.A08     // Catch:{ Exception -> 0x001b }
            long r20 = r1.longValue()     // Catch:{ Exception -> 0x001b }
            X.11B r4 = r0.A0O()     // Catch:{ Exception -> 0x001b }
            if (r4 != 0) goto L_0x0198
            java.lang.String r0 = "contact-mgr-db/deleteContact cr=null"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ Exception -> 0x001b }
        L_0x0181:
            X.1M2 r0 = r8.A04     // Catch:{ Exception -> 0x001b }
            X.00H r0 = r0.A09     // Catch:{ Exception -> 0x001b }
            X.10T r2 = X.C17880vN.A0V(r0)     // Catch:{ Exception -> 0x001b }
            java.util.Set r1 = java.util.Collections.singleton(r6)     // Catch:{ Exception -> 0x001b }
            r0 = 6
            X.AnonymousClass35V.A00(r2, r1, r0)     // Catch:{ Exception -> 0x001b }
            X.1MA r0 = r8.A03     // Catch:{ Exception -> 0x001b }
            r0.A0C(r7)     // Catch:{ Exception -> 0x001b }
            goto L_0x0855
        L_0x0198:
            r3 = 1
            java.lang.String[] r1 = new java.lang.String[r3]     // Catch:{ Exception -> 0x001b }
            r2 = 0
            java.lang.String r19 = "data1"
            r1[r2] = r19     // Catch:{ Exception -> 0x001b }
            java.lang.String r27 = "raw_contact_id = ? AND mimetype = ? "
            java.lang.String[] r0 = new java.lang.String[r13]     // Catch:{ Exception -> 0x001b }
            java.lang.String r18 = java.lang.String.valueOf(r20)     // Catch:{ Exception -> 0x001b }
            r0[r2] = r18     // Catch:{ Exception -> 0x001b }
            java.lang.String r12 = "vnd.android.cursor.item/phone_v2"
            r0[r3] = r12     // Catch:{ Exception -> 0x001b }
            android.net.Uri r17 = android.provider.ContactsContract.Data.CONTENT_URI     // Catch:{ Exception -> 0x0237 }
            r2 = 0
            r24 = r4
            r25 = r17
            r26 = r1
            r28 = r0
            r29 = r2
            android.database.Cursor r10 = r24.A03(r25, r26, r27, r28, r29)     // Catch:{ Exception -> 0x0237 }
            if (r10 == 0) goto L_0x0181
            int r0 = r10.getCount()     // Catch:{ all -> 0x022d }
            if (r0 != r3) goto L_0x01e7
            android.net.Uri r11 = android.provider.ContactsContract.RawContacts.CONTENT_URI     // Catch:{ all -> 0x022d }
            r0 = r20
            android.net.Uri r0 = android.content.ContentUris.withAppendedId(r11, r0)     // Catch:{ all -> 0x022d }
            r4.A01(r0, r2, r2)     // Catch:{ all -> 0x022d }
        L_0x01d2:
            r10.close()     // Catch:{ all -> 0x022d }
            java.lang.String r0 = "deleted_synced_contact"
            r5.putExtra(r0, r3)     // Catch:{ all -> 0x022d }
            X.1KB r2 = r9.A00     // Catch:{ all -> 0x022d }
            r1 = 9
            X.3Cl r0 = new X.3Cl     // Catch:{ all -> 0x022d }
            r0.<init>(r9, r5, r6, r1)     // Catch:{ all -> 0x022d }
            r2.A0J(r0)     // Catch:{ all -> 0x022d }
            goto L_0x0228
        L_0x01e7:
            r14 = 0
            r11 = 0
        L_0x01e9:
            boolean r0 = r10.moveToNext()     // Catch:{ all -> 0x022d }
            if (r0 == 0) goto L_0x021a
            r0 = r19
            int r0 = r10.getColumnIndex(r0)     // Catch:{ all -> 0x022d }
            java.lang.String r1 = r10.getString(r0)     // Catch:{ all -> 0x022d }
            r15 = r23
            r0 = r22
            boolean r0 = X.C63942tw.A06(r1, r15, r0)     // Catch:{ all -> 0x022d }
            if (r0 == 0) goto L_0x0217
            java.lang.String r16 = "raw_contact_id = ? AND mimetype = ? AND data1 = ? "
            r15 = 3
            r0 = r18
            java.lang.String[] r15 = X.C17880vN.A1b(r0, r12, r15, r3)     // Catch:{ all -> 0x022d }
            r15[r13] = r1     // Catch:{ all -> 0x022d }
            r1 = r16
            r0 = r17
            r4.A01(r0, r1, r15)     // Catch:{ all -> 0x022d }
            int r11 = r11 + 1
        L_0x0217:
            int r14 = r14 + 1
            goto L_0x01e9
        L_0x021a:
            if (r14 != r11) goto L_0x01d2
            android.net.Uri r11 = android.provider.ContactsContract.RawContacts.CONTENT_URI     // Catch:{ all -> 0x022d }
            r0 = r20
            android.net.Uri r0 = android.content.ContentUris.withAppendedId(r11, r0)     // Catch:{ all -> 0x022d }
            r4.A01(r0, r2, r2)     // Catch:{ all -> 0x022d }
            goto L_0x01d2
        L_0x0228:
            r10.close()     // Catch:{ Exception -> 0x0237 }
            goto L_0x0181
        L_0x022d:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x0232 }
            goto L_0x0236
        L_0x0232:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ Exception -> 0x0237 }
        L_0x0236:
            throw r1     // Catch:{ Exception -> 0x0237 }
        L_0x0237:
            r4 = move-exception
            int r0 = r6.A09     // Catch:{ Exception -> 0x001b }
            boolean r3 = X.AnonymousClass000.A1P(r0)
            boolean r2 = r6.A10     // Catch:{ Exception -> 0x001b }
            X.0z4 r0 = r9.A05     // Catch:{ Exception -> 0x001b }
            boolean r1 = r0.A2J()     // Catch:{ Exception -> 0x001b }
            java.lang.Integer r0 = X.C17880vN.A0m()     // Catch:{ Exception -> 0x001b }
            r9.A00(r0, r2, r3, r1)     // Catch:{ Exception -> 0x001b }
            java.lang.String r0 = "contact-mgr-db/delete unable to delete contact "
            X.C17960vV.A09(r0, r4)     // Catch:{ Exception -> 0x001b }
            goto L_0x0181
        L_0x0254:
            r0 = 2
            r6.A01 = r0     // Catch:{ Exception -> 0x001b }
            r8.A0U(r6)     // Catch:{ Exception -> 0x001b }
            X.12E r0 = r9.A04     // Catch:{ Exception -> 0x001b }
            r0.A09()     // Catch:{ Exception -> 0x001b }
            java.lang.String r1 = "deleted_synced_contact"
            r0 = 0
            r5.putExtra(r1, r0)     // Catch:{ Exception -> 0x001b }
            X.1KB r2 = r9.A00     // Catch:{ Exception -> 0x001b }
            r1 = 8
            X.3Cl r0 = new X.3Cl     // Catch:{ Exception -> 0x001b }
            r0.<init>(r9, r5, r6, r1)     // Catch:{ Exception -> 0x001b }
            r2.A0J(r0)     // Catch:{ Exception -> 0x001b }
            goto L_0x0856
        L_0x0273:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x001b }
            java.lang.String r0 = "ContactManager/removeWAContact attempting to remove contact that is not in db with jid="
            X.C17900vP.A0X(r7, r0, r1)     // Catch:{ Exception -> 0x001b }
            goto L_0x0857
        L_0x027e:
            java.lang.Object r7 = r1.A01
            X.6oP r7 = (X.C133246oP) r7
            java.lang.ref.WeakReference r0 = r7.A0B
            java.lang.Object r0 = r0.get()
            X.86n r0 = (X.C1599586n) r0
            if (r0 == 0) goto L_0x001b
            boolean r0 = r0.BeF()
            if (r0 != 0) goto L_0x001b
            android.accounts.Account[] r0 = r7.A02
            r8 = 0
            r0 = r0[r8]
            java.lang.String r6 = r0.name
            r7.A00 = r0
            X.1UN r5 = r7.A07
            boolean r0 = r5.A07()
            if (r0 == 0) goto L_0x02b4
            boolean r0 = r7.A01
            if (r0 != 0) goto L_0x02b4
        L_0x02a7:
            X.1bI r0 = r7.A08
            r1 = 8
            r0.A04(r1)
            X.1bI r0 = r7.A09
            r0.A04(r1)
            return
        L_0x02b4:
            android.accounts.Account[] r0 = r7.A02
            if (r0 == 0) goto L_0x02a7
            int r1 = r0.length
            r0 = 3
            if (r1 < r0) goto L_0x02a7
            X.1bI r4 = r7.A08
            android.view.View r3 = r4.A02()
            com.google.android.material.textfield.TextInputLayout r3 = (com.google.android.material.textfield.TextInputLayout) r3
            android.content.Context r0 = r7.A03
            android.content.res.Resources r2 = r0.getResources()
            boolean r1 = r5.A07()
            r0 = 2131888768(0x7f120a80, float:1.941218E38)
            if (r1 == 0) goto L_0x02d6
            r0 = 2131888769(0x7f120a81, float:1.9412183E38)
        L_0x02d6:
            java.lang.String r0 = r2.getString(r0)
            r3.setHint((java.lang.CharSequence) r0)
            android.view.View r1 = X.AnonymousClass3MY.A0I(r4, r8)
            r0 = 2131435809(0x7f0b2121, float:1.849347E38)
            android.widget.TextView r1 = X.AnonymousClass3MW.A0J(r1, r0)
            r0 = 23
            X.AnonymousClass3Ma.A1B(r1, r7, r0)
            r1.setText(r6)
            X.1bI r0 = r7.A09
            android.view.View r2 = r0.A02()
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            X.1sZ r1 = (X.C39151sZ) r1
            r0 = 2131429497(0x7f0b0879, float:1.8480668E38)
            r1.A0B = r0
            boolean r0 = r5.A07()
            if (r0 == 0) goto L_0x001b
            r0 = 4
            r2.setVisibility(r0)
            return
        L_0x030c:
            java.lang.Object r0 = r1.A01
            X.70L r0 = (X.AnonymousClass70L) r0
            X.8Am r4 = r0.A0H
            r3 = 1
            X.6pq r2 = r0.A0D
            X.5xr r1 = r0.A0G
            X.71l r0 = r0.A0F
            android.content.Intent r0 = X.AnonymousClass743.A00(r2, r0, r1, r3, r3)
            goto L_0x0018
        L_0x031f:
            java.lang.Object r3 = r1.A01
            X.70L r3 = (X.AnonymousClass70L) r3
            java.lang.Long r0 = r3.A0P
            if (r0 == 0) goto L_0x001b
            X.1M9 r4 = r3.A09
            long r0 = r0.longValue()
            X.1E7 r5 = r4.A0A(r0)
            if (r5 == 0) goto L_0x001b
            X.1BI r6 = r3.A0N
            if (r6 == 0) goto L_0x001b
            java.lang.Long r7 = r3.A0Q
            if (r7 == 0) goto L_0x001b
            r0 = 2
            r5.A01 = r0
            X.1BI r0 = r5.A0J
            java.lang.String r8 = r0.user
            X.5xr r0 = r3.A0G
            java.lang.String r9 = r0.A02()
            r4.A0Y(r5, r6, r7, r8, r9)
            X.1KB r2 = r3.A06
            r1 = 38
            X.7Pc r0 = new X.7Pc
            r0.<init>(r3, r1)
            r2.A0J(r0)
            r0 = 0
            X.AnonymousClass70L.A00(r3, r0)
            return
        L_0x035c:
            java.lang.Object r0 = r1.A01
            X.7E3 r0 = (X.AnonymousClass7E3) r0
            X.70L r6 = r0.A00
            X.8Am r4 = r6.A0H
            boolean r5 = r6.A02
            java.lang.Long r0 = r6.A0Q
            if (r0 == 0) goto L_0x0395
            X.71l r3 = r6.A0F
            java.lang.String r1 = r3.A01
            android.widget.EditText r0 = r3.A04
            java.lang.String r0 = X.C1404471l.A00(r0)
            boolean r0 = X.C18070vi.A18(r1, r0)
            r2 = r0 ^ 1
            java.lang.String r1 = r3.A02
            android.widget.EditText r0 = r3.A05
            java.lang.String r0 = X.C1404471l.A00(r0)
            boolean r0 = X.C18070vi.A18(r1, r0)
            r0 = r0 ^ 1
            if (r2 != 0) goto L_0x038c
            if (r0 == 0) goto L_0x0395
        L_0x038c:
            X.1UN r0 = r6.A0L
            boolean r0 = r0.A05()
            r3 = 1
            if (r0 != 0) goto L_0x0396
        L_0x0395:
            r3 = 0
        L_0x0396:
            X.6pq r2 = r6.A0D
            X.5xr r1 = r6.A0G
            X.71l r0 = r6.A0F
            android.content.Intent r0 = X.AnonymousClass743.A00(r2, r0, r1, r5, r3)
            goto L_0x0018
        L_0x03a2:
            java.lang.Object r0 = r1.A01
            com.whatsapp.contact.picker.ContactPickerBottomSheetActivity r0 = (com.whatsapp.contact.picker.ContactPickerBottomSheetActivity) r0
            com.whatsapp.contact.picker.ContactPickerFragment r3 = r0.A05
            if (r3 == 0) goto L_0x001b
            android.view.ViewGroup r0 = r0.A00
            if (r0 != 0) goto L_0x0858
            java.lang.String r0 = "contactPickerLayout"
        L_0x03b0:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x03b5:
            java.lang.Object r2 = r1.A01
            android.content.Context r2 = (android.content.Context) r2
            X.3Rj r4 = X.AnonymousClass4a6.A00(r2)
            r1 = 2131888647(0x7f120a07, float:1.9411935E38)
            r0 = 13
            X.AnonymousClass757.A01(r4, r2, r0, r1)
            r0 = 2131888649(0x7f120a09, float:1.941194E38)
            r4.A0D(r0)
            r0 = 2131888648(0x7f120a08, float:1.9411937E38)
            goto L_0x0642
        L_0x03d0:
            X.3Rj r4 = X.AnonymousClass4a6.A00(r3)
            r2 = 2131899286(0x7f123396, float:1.9433514E38)
            r1 = 48
            X.7AN r0 = new X.7AN
            r0.<init>(r3, r1)
            r4.A0g(r3, r0, r2)
            r0 = 2131888645(0x7f120a05, float:1.9411931E38)
            r4.A0D(r0)
            r0 = 2131888646(0x7f120a06, float:1.9411933E38)
            goto L_0x0642
        L_0x03ec:
            java.lang.Object r0 = r1.A01
            X.1lA r0 = (X.C34841lA) r0
            X.1To r0 = r0.A04
            X.1S3 r3 = r0.A0K
            monitor-enter(r3)
            X.1Rs r6 = r3.A01     // Catch:{ all -> 0x051c }
            r5 = 0
            java.lang.String r4 = "SyncdMutationsTable.SELECT_ALL_MUTATIONS_WITH_SUPPORTED_VERSIONS_AND_MISSING_DEPENDENCIES"
            java.lang.String r2 = "SELECT mutation_index, mutation_value, mutation_version, are_dependencies_missing, device_id, epoch, mutation_mac FROM syncd_mutations WHERE are_dependencies_missing = 1 ORDER BY _id ASC"
            java.util.ArrayList r1 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x051c }
            X.1Oq r0 = r6.A00     // Catch:{ all -> 0x051c }
            X.1at r7 = r0.get()     // Catch:{ all -> 0x051c }
            r0 = r7
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0512 }
            X.1Ev r0 = r0.A02     // Catch:{ all -> 0x0512 }
            android.database.Cursor r2 = r0.A0A(r2, r4, r5)     // Catch:{ all -> 0x0512 }
        L_0x040f:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0506 }
            if (r0 == 0) goto L_0x0428
            java.lang.String r0 = "mutation_index"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0506 }
            r2.getString(r0)     // Catch:{ all -> 0x0506 }
            X.A8l r0 = X.C26331Rs.A01(r2, r6)     // Catch:{ all -> 0x0506 }
            if (r0 == 0) goto L_0x040f
            r1.add(r0)     // Catch:{ all -> 0x0506 }
            goto L_0x040f
        L_0x0428:
            r2.close()     // Catch:{ all -> 0x0512 }
            r7.close()     // Catch:{ all -> 0x051c }
            java.util.Iterator r2 = r1.iterator()     // Catch:{ all -> 0x051c }
        L_0x0432:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x051c }
            if (r0 == 0) goto L_0x0446
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x051c }
            X.A8l r1 = (X.C20126A8l) r1     // Catch:{ all -> 0x051c }
            boolean r0 = r1 instanceof X.C72173Kx     // Catch:{ all -> 0x051c }
            if (r0 == 0) goto L_0x0432
            r3.A05(r1)     // Catch:{ all -> 0x051c }
            goto L_0x0432
        L_0x0446:
            monitor-exit(r3)
            return
        L_0x0448:
            java.lang.Object r1 = r1.A01
            X.1To r1 = (X.C26811To) r1
            X.1TZ r0 = r1.A0H
            r0.A00()
            r1.A0G()
            goto L_0x0468
        L_0x0455:
            java.lang.Object r1 = r1.A01
            X.1S3 r1 = (X.AnonymousClass1S3) r1
            java.lang.String r0 = "archive"
            X.AnonymousClass1S3.A01(r1, r0)
            return
        L_0x045f:
            java.lang.Object r1 = r1.A01
            X.1To r1 = (X.C26811To) r1
            X.1TZ r0 = r1.A0H
            r0.A00()
        L_0x0468:
            r1.A0I()
            return
        L_0x046c:
            java.lang.Object r3 = r1.A01
            X.1S3 r3 = (X.AnonymousClass1S3) r3
            monitor-enter(r3)
            X.1Rs r5 = r3.A01     // Catch:{ all -> 0x051c }
            r6 = 0
            java.lang.String r2 = "SyncdMutationsTable.SELECT_ALL_MUTATIONS_WITH_SUPPORTED_VERSIONS_AND_MISSING_DEPENDENCIES"
            java.lang.String r1 = "SELECT mutation_index, mutation_value, mutation_version, are_dependencies_missing, device_id, epoch, mutation_mac FROM syncd_mutations WHERE are_dependencies_missing = 1 ORDER BY _id ASC"
            java.util.ArrayList r4 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x051c }
            X.1Oq r0 = r5.A00     // Catch:{ all -> 0x051c }
            X.1at r7 = r0.get()     // Catch:{ all -> 0x051c }
            r0 = r7
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0512 }
            X.1Ev r0 = r0.A02     // Catch:{ all -> 0x0512 }
            android.database.Cursor r2 = r0.A0A(r1, r2, r6)     // Catch:{ all -> 0x0512 }
        L_0x048b:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0506 }
            if (r0 == 0) goto L_0x04b1
            java.lang.String r0 = "mutation_index"
            java.lang.String r1 = X.C17890vO.A0S(r2, r0)     // Catch:{ all -> 0x0506 }
            r0 = 0
            X.C18070vi.A0d(r1, r0)     // Catch:{ all -> 0x0506 }
            java.lang.String r0 = X.A4M.A00(r1)     // Catch:{ all -> 0x0506 }
            boolean r0 = X.AnonymousClass2T1.A00(r0)     // Catch:{ all -> 0x0506 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x048b
            X.A8l r0 = X.C26331Rs.A01(r2, r5)     // Catch:{ all -> 0x0506 }
            if (r0 == 0) goto L_0x048b
            r4.add(r0)     // Catch:{ all -> 0x0506 }
            goto L_0x048b
        L_0x04b1:
            r2.close()     // Catch:{ all -> 0x0512 }
            r7.close()     // Catch:{ all -> 0x051c }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x051c }
        L_0x04bb:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x051c }
            if (r0 == 0) goto L_0x04f3
            java.lang.Object r2 = r4.next()     // Catch:{ all -> 0x051c }
            X.A8l r2 = (X.C20126A8l) r2     // Catch:{ all -> 0x051c }
            X.00H r0 = r3.A03     // Catch:{ all -> 0x051c }
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x051c }
            X.2lN r1 = (X.C58862lN) r1     // Catch:{ all -> 0x051c }
            if (r2 != 0) goto L_0x04d3
            r1 = 0
            goto L_0x04db
        L_0x04d3:
            java.lang.String r0 = r2.A0B()     // Catch:{ all -> 0x051c }
            X.2nY r1 = r1.A00(r0)     // Catch:{ all -> 0x051c }
        L_0x04db:
            monitor-enter(r3)     // Catch:{ all -> 0x051c }
            if (r1 == 0) goto L_0x04eb
            java.lang.String r0 = r2.A0A()     // Catch:{ all -> 0x04f0 }
            X.A8l r0 = r5.A09(r0)     // Catch:{ all -> 0x04f0 }
            r1.A0I(r2, r0)     // Catch:{ all -> 0x04f0 }
            monitor-exit(r3)     // Catch:{ all -> 0x051c }
            goto L_0x04bb
        L_0x04eb:
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()     // Catch:{ all -> 0x04f0 }
            throw r0     // Catch:{ all -> 0x04f0 }
        L_0x04f0:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x051c }
            throw r0     // Catch:{ all -> 0x051c }
        L_0x04f3:
            monitor-exit(r3)
            X.1Pw r0 = r3.A00
            r2 = 1
            android.content.SharedPreferences r0 = X.C25851Pw.A00(r0)
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "pref_lid_migration_post_processing_complete"
            android.content.SharedPreferences$Editor r0 = r1.putBoolean(r0, r2)
            goto L_0x053f
        L_0x0506:
            r1 = move-exception
            if (r2 == 0) goto L_0x0511
            r2.close()     // Catch:{ all -> 0x050d }
            goto L_0x0511
        L_0x050d:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0512 }
        L_0x0511:
            throw r1     // Catch:{ all -> 0x0512 }
        L_0x0512:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x0517 }
            goto L_0x051b
        L_0x0517:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x051c }
        L_0x051b:
            throw r1     // Catch:{ all -> 0x051c }
        L_0x051c:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x051f:
            java.lang.Object r2 = r1.A01
            X.1TR r2 = (X.AnonymousClass1TR) r2
            r1 = 15
            r0 = 0
            X.AnonymousClass1TR.A01(r2, r0, r1)
            X.1Pw r1 = r2.A03
            X.11P r0 = r2.A07
            long r2 = X.AnonymousClass11P.A01(r0)
            android.content.SharedPreferences r0 = X.C25851Pw.A00(r1)
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "syncd_last_lthash_consistency_check_time"
            android.content.SharedPreferences$Editor r0 = r1.putLong(r0, r2)
        L_0x053f:
            r0.apply()
            return
        L_0x0543:
            java.lang.Object r0 = r1.A01
            X.2tk r0 = (X.C63822tk) r0
            X.00H r0 = r0.A0S
            X.10T r1 = X.C17880vN.A0V(r0)
            r0 = 41
            goto L_0x06a5
        L_0x0551:
            java.lang.Object r1 = r1.A01
            java.util.concurrent.CountDownLatch r1 = (java.util.concurrent.CountDownLatch) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            r1.countDown()
            return
        L_0x055d:
            java.lang.Object r2 = r1.A01
            com.whatsapp.companionmode.registration.CompanionPostLogoutActivity r2 = (com.whatsapp.companionmode.registration.CompanionPostLogoutActivity) r2
            X.6pu r1 = r2.A01
            java.lang.String r0 = "CompanionPostLogoutActivity"
            r1.A01(r2, r0)
            return
        L_0x0569:
            java.lang.Object r3 = r1.A01
            X.11w r3 = (X.C203711w) r3
            X.A15 r2 = r3.A0h
            java.lang.String r1 = "companion_link_code_pair_success_timeout"
            goto L_0x0607
        L_0x0573:
            java.lang.Object r1 = r1.A01
            X.Af0 r1 = (X.C21132Af0) r1
            java.lang.Boolean r0 = X.AnonymousClass000.A0i()
            r1.A0B(r0)
            return
        L_0x057f:
            java.lang.Object r6 = r1.A01
            X.11w r6 = (X.C203711w) r6
            monitor-enter(r6)
            r1 = 0
            r6.A04 = r1     // Catch:{ all -> 0x05c2 }
            r6.A0F = r1     // Catch:{ all -> 0x05c2 }
            java.util.concurrent.atomic.AtomicReference r0 = r6.A0t     // Catch:{ all -> 0x05c2 }
            r0.set(r1)     // Catch:{ all -> 0x05c2 }
            r6.A0H = r1     // Catch:{ all -> 0x05c2 }
            X.00H r0 = r6.A0o     // Catch:{ all -> 0x05c2 }
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x05c2 }
            X.17v r1 = (X.C219017v) r1     // Catch:{ all -> 0x05c2 }
            r0 = 16
            r5 = 0
            r1.A0F(r5, r0)     // Catch:{ all -> 0x05c2 }
            monitor-exit(r6)     // Catch:{ all -> 0x05c2 }
            int r0 = r6.A01
            long r3 = (long) r0
            r1 = 4
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x05ba
            java.lang.String r0 = "companion/registration/auto refreshing link code"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            int r0 = r6.A01
            r1 = 1
            int r0 = r0 + 1
            r6.A01 = r0
            com.whatsapp.jid.UserJid r0 = r6.A08
            r6.A09(r0, r1)
            return
        L_0x05ba:
            r0 = 12
            X.AnonymousClass7KX.A00(r6, r0)
            r6.A01 = r5
            return
        L_0x05c2:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x05c2 }
            throw r0
        L_0x05c5:
            java.lang.Object r4 = r1.A01
            X.11w r4 = (X.C203711w) r4
            X.1fL r3 = r4.A0O
            r2 = 2
            r0 = 401(0x191, double:1.98E-321)
            r3.A01(r2, r0)
            X.A15 r2 = r4.A0h
            java.lang.String r1 = "companion_server_registration_timeout"
            r0 = 0
            r2.A02(r1, r0)
            r4.A05()
            return
        L_0x05dd:
            java.lang.Object r3 = r1.A01
            X.11w r3 = (X.C203711w) r3
            monitor-enter(r3)
            r2 = 0
            X.1Dn r0 = r3.A0P     // Catch:{ all -> 0x05fc }
            r0.A01(r2)     // Catch:{ all -> 0x05fc }
            X.00H r0 = r3.A0o     // Catch:{ all -> 0x05fc }
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x05fc }
            X.17v r1 = (X.C219017v) r1     // Catch:{ all -> 0x05fc }
            r0 = 16
            r1.A0F(r2, r0)     // Catch:{ all -> 0x05fc }
            monitor-exit(r3)     // Catch:{ all -> 0x05fc }
            r0 = 10
            X.AnonymousClass7KX.A00(r3, r0)
            return
        L_0x05fc:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x05fc }
            throw r0
        L_0x05ff:
            java.lang.Object r3 = r1.A01
            X.11w r3 = (X.C203711w) r3
            X.A15 r2 = r3.A0h
            java.lang.String r1 = "companion_verification_timeout"
        L_0x0607:
            r0 = 0
            r2.A02(r1, r0)
            r3.A05()
            return
        L_0x060f:
            java.lang.Object r1 = r1.A01
            com.whatsapp.companionmode.registration.CompanionRegistrationViewModel r1 = (com.whatsapp.companionmode.registration.CompanionRegistrationViewModel) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.1Tf r0 = r1.A06
            goto L_0x0620
        L_0x061a:
            java.lang.Object r0 = r1.A01
            com.whatsapp.companionmode.registration.CompanionRegistrationViewModel r0 = (com.whatsapp.companionmode.registration.CompanionRegistrationViewModel) r0
            X.1Tf r0 = r0.A06
        L_0x0620:
            r0.A01()
            return
        L_0x0624:
            java.lang.Object r3 = r1.A01
            X.1FB r3 = (X.AnonymousClass1FB) r3
            X.3Rj r4 = X.AnonymousClass4a6.A00(r3)
            r2 = 2131899286(0x7f123396, float:1.9433514E38)
            r1 = 47
            X.7AN r0 = new X.7AN
            r0.<init>(r3, r1)
            r4.A0g(r3, r0, r2)
            r0 = 2131888654(0x7f120a0e, float:1.941195E38)
            r4.A0D(r0)
            r0 = 2131888653(0x7f120a0d, float:1.9411947E38)
        L_0x0642:
            r4.A0E(r0)
            r0 = 0
            r4.A0T(r0)
            r4.A0C()
            return
        L_0x064d:
            java.lang.Object r0 = r1.A01
            android.animation.Animator r0 = (android.animation.Animator) r0
            r0.start()
            return
        L_0x0655:
            java.lang.Object r3 = r1.A01
            com.whatsapp.components.AutoScrollView r3 = (com.whatsapp.components.AutoScrollView) r3
            boolean r1 = r3.A02
            boolean r0 = r3.A03
            if (r1 == 0) goto L_0x0678
            r2 = 0
            android.widget.HorizontalScrollView r1 = r3.A00
            if (r0 == 0) goto L_0x066a
            int r0 = r3.A04
            r1.scrollTo(r0, r2)
            return
        L_0x066a:
            int r0 = r1.getMeasuredWidth()
            r1.scrollTo(r0, r2)
            int r0 = r3.A04
            int r0 = -r0
            r1.scrollBy(r0, r2)
            return
        L_0x0678:
            android.widget.HorizontalScrollView r1 = r3.A00
            if (r0 == 0) goto L_0x0681
            r0 = 0
            r1.scrollTo(r0, r0)
            return
        L_0x0681:
            r0 = 66
            r1.fullScroll(r0)
            return
        L_0x0687:
            java.lang.Object r0 = r1.A01
            X.1LQ r0 = (X.AnonymousClass1LQ) r0
            X.AnonymousClass1LQ.A01(r0)
            return
        L_0x068f:
            java.lang.Object r0 = r1.A01
            X.1M9 r0 = (X.AnonymousClass1M9) r0
            X.1Lf r2 = r0.A05
            java.util.ArrayList r1 = X.AnonymousClass000.A13()
            r0 = 15
            goto L_0x0735
        L_0x069d:
            java.lang.Object r0 = r1.A01
            X.1M9 r0 = (X.AnonymousClass1M9) r0
            X.1Lf r1 = r0.A05
            r0 = 15
        L_0x06a5:
            X.AnonymousClass7KX.A00(r1, r0)
            return
        L_0x06a9:
            java.lang.Object r0 = r1.A01
            X.1M9 r0 = (X.AnonymousClass1M9) r0
            X.1Lg r1 = r0.A0E
            X.1cg r0 = X.C29671cg.A00
            r1.A00(r0)
            return
        L_0x06b5:
            java.lang.Object r0 = r1.A01
            X.1M9 r0 = (X.AnonymousClass1M9) r0
            X.1Lf r2 = r0.A05
            goto L_0x0732
        L_0x06bc:
            java.lang.Object r3 = r1.A01
            X.70Q r3 = (X.AnonymousClass70Q) r3
            r4 = 0
            X.11C r0 = r3.A0A
            android.telephony.TelephonyManager r1 = r0.A0K()
            java.nio.charset.Charset r0 = X.AnonymousClass1K3.A06
            if (r1 == 0) goto L_0x0703
            java.lang.String r2 = r1.getSimCountryIso()
            if (r2 == 0) goto L_0x06d7
            int r0 = r2.length()
            if (r0 != 0) goto L_0x06fa
        L_0x06d7:
            X.1K3 r1 = r3.A0C
            X.0vb r0 = r3.A0B
            java.util.Locale r0 = r0.A0N()
            java.lang.String r0 = X.AnonymousClass1X0.A04(r0)
            java.util.List r1 = X.AnonymousClass1K3.A02(r1, r0)
            X.C18070vi.A0X(r1)
            boolean r0 = X.AnonymousClass000.A1a(r1)
            if (r0 == 0) goto L_0x06f8
            java.lang.Object r0 = r1.get(r4)
            X.2dJ r0 = (X.C53922dJ) r0
            java.lang.String r2 = r0.A00
        L_0x06f8:
            if (r2 == 0) goto L_0x0700
        L_0x06fa:
            int r0 = r2.length()
            if (r0 != 0) goto L_0x0705
        L_0x0700:
            java.lang.String r2 = "us"
            goto L_0x0705
        L_0x0703:
            r2 = 0
            goto L_0x06d7
        L_0x0705:
            X.1LA r0 = r3.A07     // Catch:{ IOException -> 0x070c }
            java.lang.String r1 = r0.A06(r2)     // Catch:{ IOException -> 0x070c }
            goto L_0x070d
        L_0x070c:
            r1 = 0
        L_0x070d:
            X.1KB r5 = r3.A08
            r0 = 8
            X.7Pq r4 = new X.7Pq
            r4.<init>(r3, r2, r1, r0)
            goto L_0x0768
        L_0x0717:
            java.lang.Object r2 = r1.A01
            X.700 r2 = (X.AnonymousClass700) r2
            X.1M9 r0 = r2.A02
            X.1MA r0 = r0.A03
            java.util.Map r0 = r0.A02
            r0.clear()
            X.1Me r1 = r2.A04
            java.util.concurrent.ConcurrentHashMap r0 = r1.A06
            r0.clear()
            java.util.concurrent.ConcurrentHashMap r0 = r1.A07
            r0.clear()
            X.1Lf r2 = r2.A03
        L_0x0732:
            r1 = 0
            r0 = 13
        L_0x0735:
            X.AnonymousClass35V.A00(r2, r1, r0)
            return
        L_0x0739:
            java.lang.Object r6 = r1.A01
            X.6oP r6 = (X.C133246oP) r6
            X.17x r1 = r6.A06
            X.1dX r0 = r6.A05
            boolean r0 = X.AnonymousClass743.A07(r0, r1)
            java.lang.String r5 = "PHONE"
            r8 = 0
            r7 = 1
            if (r0 != 0) goto L_0x076c
            android.accounts.Account[] r4 = new android.accounts.Account[r7]
            android.content.Context r1 = r6.A03
            r0 = 2131894509(0x7f1220ed, float:1.9423825E38)
            java.lang.String r1 = r1.getString(r0)
            android.accounts.Account r0 = new android.accounts.Account
            r0.<init>(r1, r5)
            r4[r8] = r0
        L_0x075d:
            r6.A02 = r4
            X.1KB r5 = r6.A04
            r0 = 37
            X.7Pc r4 = new X.7Pc
            r4.<init>(r6, r0)
        L_0x0768:
            r5.A0J(r4)
            return
        L_0x076c:
            android.content.Context r3 = r6.A03
            android.accounts.AccountManager r1 = android.accounts.AccountManager.get(r3)
            java.lang.String r0 = "com.google"
            android.accounts.Account[] r1 = r1.getAccountsByType(r0)
            int r0 = r1.length
            int r2 = r0 + 1
            android.accounts.Account[] r4 = new android.accounts.Account[r2]
            java.lang.System.arraycopy(r1, r8, r4, r8, r0)
            int r2 = r2 - r7
            r0 = 2131894509(0x7f1220ed, float:1.9423825E38)
            java.lang.String r1 = r3.getString(r0)
            android.accounts.Account r0 = new android.accounts.Account
            r0.<init>(r1, r5)
            r4[r2] = r0
            goto L_0x075d
        L_0x0790:
            java.lang.Object r3 = r1.A01
            X.70L r3 = (X.AnonymousClass70L) r3
            r10 = 1
            r3.A04 = r10     // Catch:{ Exception -> 0x07de }
            X.5xr r2 = r3.A0G     // Catch:{ Exception -> 0x07de }
            boolean r0 = r2.A0A()     // Catch:{ Exception -> 0x07de }
            if (r0 != 0) goto L_0x07ce
            java.lang.String r8 = r2.A04()     // Catch:{ Exception -> 0x07de }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r8)     // Catch:{ Exception -> 0x07de }
            java.lang.String r0 = "@"
            r1.append(r0)     // Catch:{ Exception -> 0x07de }
            java.lang.String r0 = "s.whatsapp.net"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ Exception -> 0x07de }
            X.1BI r6 = X.AnonymousClass3MX.A0l(r0)     // Catch:{ Exception -> 0x07de }
            java.lang.Long r0 = r3.A0Q     // Catch:{ Exception -> 0x07de }
            long r0 = r0.longValue()     // Catch:{ Exception -> 0x07de }
            java.lang.String r2 = r2.A05()     // Catch:{ Exception -> 0x07de }
            X.2lf r5 = new X.2lf     // Catch:{ Exception -> 0x07de }
            r5.<init>(r0, r2)     // Catch:{ Exception -> 0x07de }
            X.6zB r4 = r3.A0I     // Catch:{ Exception -> 0x07de }
            java.lang.Long r7 = r3.A0P     // Catch:{ Exception -> 0x07de }
            java.lang.String r9 = r3.A01     // Catch:{ Exception -> 0x07de }
            r4.A01(r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x07de }
        L_0x07ce:
            r3.A07(r10)     // Catch:{ Exception -> 0x07de }
            X.1KB r2 = r3.A06     // Catch:{ Exception -> 0x07de }
            r1 = 43
            X.7Pc r0 = new X.7Pc     // Catch:{ Exception -> 0x07de }
            r0.<init>(r3, r1)     // Catch:{ Exception -> 0x07de }
            r2.A0J(r0)     // Catch:{ Exception -> 0x07de }
            return
        L_0x07de:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ContactFormSaveContactController: unable to save contact to Phone "
            X.C108995ce.A1M(r0, r1, r2)
            X.190 r3 = r3.A05
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Failed to save contact to phone: "
            java.lang.String r2 = X.C17900vP.A0C(r0, r1, r2)
            r1 = 0
            java.lang.String r0 = "ContactFormSaveContactController: unable to save contact to Phone"
            r3.A0G(r0, r2, r1)
            return
        L_0x07fb:
            java.lang.Object r0 = r1.A01
            X.70L r0 = (X.AnonymousClass70L) r0
            X.8Am r0 = r0.A0H
            r0.C4I()
            return
        L_0x0805:
            java.lang.Object r0 = r1.A01
            X.70L r0 = (X.AnonymousClass70L) r0
            X.8Am r3 = r0.A0H
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = "contact_updated"
            r0 = 1
            r2.putExtra(r1, r0)
            r3.C4L(r2)
            return
        L_0x0819:
            java.lang.Object r0 = r1.A01
            X.7E3 r0 = (X.AnonymousClass7E3) r0
            X.70L r0 = r0.A00
            X.8Am r2 = r0.A0H
            r1 = 6
            r0 = 0
            r2.C4H(r1, r0)
            return
        L_0x0827:
            java.lang.Object r0 = r1.A01
            X.6mY r0 = (X.C132296mY) r0
            X.6or r1 = r0.A02
            android.app.Activity r0 = r0.A00
            android.content.res.Configuration r0 = X.C108965cb.A03(r0)
            X.C18070vi.A0X(r0)
            r1.A00(r0)
            return
        L_0x083a:
            java.util.List r5 = r1.A01     // Catch:{ all -> 0x0852 }
            java.util.ArrayList r0 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x0852 }
            r1.A01 = r0     // Catch:{ all -> 0x0852 }
            r0 = 0
            r1.A00 = r0     // Catch:{ all -> 0x0852 }
            X.12E r2 = r1.A06     // Catch:{ all -> 0x0852 }
            X.2R1 r4 = X.AnonymousClass2R1.A04     // Catch:{ all -> 0x0852 }
            X.2qq r3 = X.C62132qq.A0D     // Catch:{ all -> 0x0852 }
            r6 = 0
            r7 = 1
            r2.A04(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0852 }
            monitor-exit(r1)     // Catch:{ all -> 0x0852 }
            return
        L_0x0852:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0852 }
            throw r0
        L_0x0855:
            return
        L_0x0856:
            return
        L_0x0857:
            return
        L_0x0858:
            float r0 = r0.getY()
            int r2 = (int) r0
            android.view.ViewGroup r0 = r3.A0A
            android.view.ViewGroup$MarginLayoutParams r1 = X.AnonymousClass3MW.A0B(r0)
            r0 = 0
            r1.setMargins(r0, r0, r0, r2)
            android.view.ViewGroup r0 = r3.A0A
            r0.setLayoutParams(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C146437Pc.run():void");
    }
}
