package X;

/* renamed from: X.3Bp  reason: invalid class name and case insensitive filesystem */
public class C70563Bp implements Runnable {
    public final int A00;
    public final Object A01;

    public C70563Bp(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02e0, code lost:
        r1.A01(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x02e3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0098, code lost:
        r1.A01 = java.lang.Integer.valueOf(r0);
        r2.A01.CC7(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x05d6, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x05da, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0101, code lost:
        if (r0 <= 0) goto L_0x0103;
     */
    /* JADX WARNING: Removed duplicated region for block: B:301:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0223 A[Catch:{ Exception -> 0x05dc }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r18 = this;
            r1 = r18
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x02f3;
                case 1: goto L_0x0310;
                case 2: goto L_0x031b;
                case 3: goto L_0x0323;
                case 4: goto L_0x000f;
                case 5: goto L_0x0341;
                case 6: goto L_0x034d;
                case 7: goto L_0x0382;
                case 8: goto L_0x03b9;
                case 9: goto L_0x03c5;
                case 10: goto L_0x03cd;
                case 11: goto L_0x03d7;
                case 12: goto L_0x03f7;
                case 13: goto L_0x0037;
                case 14: goto L_0x03ff;
                case 15: goto L_0x0418;
                case 16: goto L_0x004c;
                case 17: goto L_0x005a;
                case 18: goto L_0x006f;
                case 19: goto L_0x0084;
                case 20: goto L_0x0420;
                case 21: goto L_0x042c;
                case 22: goto L_0x042c;
                case 23: goto L_0x0438;
                case 24: goto L_0x0442;
                case 25: goto L_0x0007;
                case 26: goto L_0x0007;
                case 27: goto L_0x0007;
                case 28: goto L_0x00a4;
                case 29: goto L_0x044f;
                case 30: goto L_0x0465;
                case 31: goto L_0x04aa;
                case 32: goto L_0x00b4;
                case 33: goto L_0x04c2;
                case 34: goto L_0x04db;
                case 35: goto L_0x01e0;
                case 36: goto L_0x04e3;
                case 37: goto L_0x0541;
                case 38: goto L_0x0550;
                case 39: goto L_0x0561;
                case 40: goto L_0x0590;
                case 41: goto L_0x022a;
                case 42: goto L_0x0598;
                case 43: goto L_0x05a0;
                case 44: goto L_0x05ac;
                case 45: goto L_0x05b4;
                case 46: goto L_0x05bc;
                case 47: goto L_0x025b;
                case 48: goto L_0x05b4;
                case 49: goto L_0x02e6;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r1.A01
            X.3Kp r0 = (X.C72093Kp) r0
            r0.CC1()
        L_0x000e:
            return
        L_0x000f:
            java.lang.Object r0 = r1.A01
            com.whatsapp.contact.picker.ContactPickerFragment r0 = (com.whatsapp.contact.picker.ContactPickerFragment) r0
            android.content.Context r4 = r0.A1n()
            java.util.ArrayList r0 = r0.A33
            java.util.Iterator r3 = r0.iterator()
        L_0x001d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x000e
            java.lang.Object r2 = r3.next()
            android.net.Uri r2 = (android.net.Uri) r2
            java.lang.String r1 = "com.whatsapp"
            r0 = 1
            r4.grantUriPermission(r1, r2, r0)     // Catch:{ SecurityException -> 0x0030 }
            goto L_0x001d
        L_0x0030:
            r1 = move-exception
            java.lang.String r0 = "contactpicker/permission "
            com.whatsapp.util.Log.w(r0, r1)
            goto L_0x001d
        L_0x0037:
            java.lang.Object r2 = r1.A01
            X.73j r2 = (X.C1408673j) r2
            java.lang.String r0 = "onSearchBarOpened"
            X.63d r1 = X.C1408673j.A00(r2, r0)
            if (r1 == 0) goto L_0x000e
            java.lang.Integer r0 = X.C17880vN.A0m()
            r1.A02 = r0
            r0 = 15
            goto L_0x0098
        L_0x004c:
            java.lang.Object r2 = r1.A01
            X.73j r2 = (X.C1408673j) r2
            java.lang.String r0 = "onContactPickerCreated"
            X.63d r1 = X.C1408673j.A00(r2, r0)
            if (r1 == 0) goto L_0x000e
            r0 = 3
            goto L_0x0098
        L_0x005a:
            java.lang.Object r2 = r1.A01
            X.73j r2 = (X.C1408673j) r2
            java.lang.String r0 = "onInviteCanceled"
            X.63d r1 = X.C1408673j.A00(r2, r0)
            if (r1 == 0) goto L_0x000e
            java.lang.Integer r0 = X.C17880vN.A0m()
            r1.A02 = r0
            r0 = 17
            goto L_0x0098
        L_0x006f:
            java.lang.Object r2 = r1.A01
            X.73j r2 = (X.C1408673j) r2
            java.lang.String r0 = "onBackPressed"
            X.63d r1 = X.C1408673j.A00(r2, r0)
            if (r1 == 0) goto L_0x000e
            java.lang.Integer r0 = X.C17880vN.A0m()
            r1.A02 = r0
            r0 = 18
            goto L_0x0098
        L_0x0084:
            java.lang.Object r2 = r1.A01
            X.73j r2 = (X.C1408673j) r2
            java.lang.String r0 = "onAddToCallButtonClicked"
            X.63d r1 = X.C1408673j.A00(r2, r0)
            if (r1 == 0) goto L_0x000e
            java.lang.Integer r0 = X.C17880vN.A0m()
            r1.A02 = r0
            r0 = 19
        L_0x0098:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A01 = r0
            X.18K r0 = r2.A01
            r0.CC7(r1)
            return
        L_0x00a4:
            java.lang.Object r0 = r1.A01
            X.6il r0 = (X.C130026il) r0
            android.widget.PopupWindow r1 = r0.A02
            boolean r0 = r1.isShowing()
            if (r0 == 0) goto L_0x000e
            r1.dismiss()
            return
        L_0x00b4:
            java.lang.Object r0 = r1.A01
            X.2zL r0 = (X.C67162zL) r0
            X.12E r3 = r0.A00
            X.11S r0 = r3.A04
            boolean r17 = r0.A0N()
            r5 = 1
            r6 = 0
            X.1Tt r8 = r3.A0C
            android.content.SharedPreferences r1 = X.C26861Tt.A00(r8)
            if (r17 == 0) goto L_0x01b6
            java.lang.String r0 = "last_status_full_sync"
        L_0x00cd:
            long r1 = X.C17890vO.A04(r1, r0)
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x00d6
            r5 = 0
        L_0x00d6:
            X.11P r0 = r3.A0E
            long r15 = X.AnonymousClass11P.A01(r0)
            r13 = 1800000(0x1b7740, double:8.89318E-318)
            if (r17 != 0) goto L_0x0164
            android.content.SharedPreferences r2 = X.C26861Tt.A00(r8)
            java.lang.String r10 = "contact_full_sync_wait"
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r11 = r2.getLong(r10, r0)
            long r11 = r11 - r15
            android.content.SharedPreferences r1 = X.C26861Tt.A00(r8)
            java.lang.String r0 = "last_contact_full_sync"
            r6 = -1
            long r0 = r1.getLong(r0, r6)
            long r11 = r11 + r0
            if (r5 != 0) goto L_0x0103
            int r0 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            r11 = 0
            if (r0 > 0) goto L_0x0104
        L_0x0103:
            r11 = 1
        L_0x0104:
            android.content.SharedPreferences r9 = X.C26861Tt.A00(r8)
            java.lang.String r4 = "sidelist_full_sync_wait"
            android.content.SharedPreferences r2 = X.C26861Tt.A00(r8)
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r0 = r2.getLong(r10, r0)
            long r9 = r9.getLong(r4, r0)
            long r9 = r9 - r15
            android.content.SharedPreferences r1 = X.C26861Tt.A00(r8)
            java.lang.String r0 = "last_sidelist_full_sync"
            long r0 = r1.getLong(r0, r6)
            long r9 = r9 + r0
            int r1 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            r0 = 0
            if (r1 > 0) goto L_0x012c
            r0 = 1
        L_0x012c:
            if (r11 == 0) goto L_0x015f
            X.2qq r2 = X.C62132qq.A0J
        L_0x0130:
            X.2R1 r1 = X.AnonymousClass2R1.A03
            java.util.Set r0 = java.util.Collections.emptySet()
            X.AnonymousClass12E.A01(r3, r2, r1, r0, r5)
        L_0x0139:
            if (r5 == 0) goto L_0x000e
            java.lang.String r0 = "contactsyncmethods/fullSyncAndInitialize/fullsync/neversynced"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r17 != 0) goto L_0x0147
            X.1Rh r0 = r3.A0J
            r0.A00()
        L_0x0147:
            X.1Rl r1 = r3.A05
            r0 = 0
            r1.A01(r0)
            X.0zA r1 = r3.A01
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x01ba
            r1.A03()
            java.lang.String r0 = "loadSettingToSharedPreferences"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x015f:
            if (r0 == 0) goto L_0x0139
            X.2qq r2 = X.C62132qq.A0K
            goto L_0x0130
        L_0x0164:
            android.content.SharedPreferences r7 = X.C26861Tt.A00(r8)
            java.lang.String r6 = "status_full_sync_wait"
            android.content.SharedPreferences r4 = X.C26861Tt.A00(r8)
            java.lang.String r2 = "contact_full_sync_wait"
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r0 = r4.getLong(r2, r0)
            long r6 = r7.getLong(r6, r0)
            long r6 = r6 - r15
            android.content.SharedPreferences r1 = X.C26861Tt.A00(r8)
            java.lang.String r0 = "last_status_full_sync"
            long r0 = X.C17890vO.A04(r1, r0)
            long r6 = r6 + r0
            int r0 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r0 > 0) goto L_0x0139
            X.2qq r4 = X.C62132qq.A0D
            java.util.ArrayList r2 = X.AnonymousClass000.A13()
            X.1M9 r0 = r3.A09
            java.util.ArrayList r0 = r0.A0L()
            java.util.Iterator r1 = r0.iterator()
        L_0x019c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01b0
            X.1E7 r0 = X.C17880vN.A0O(r1)
            com.whatsapp.jid.Jid r0 = X.AnonymousClass1E7.A01(r0)
            if (r0 == 0) goto L_0x019c
            r2.add(r0)
            goto L_0x019c
        L_0x01b0:
            X.2R1 r0 = X.AnonymousClass2R1.A04
            X.AnonymousClass12E.A01(r3, r4, r0, r2, r5)
            goto L_0x0139
        L_0x01b6:
            java.lang.String r0 = "last_contact_full_sync"
            goto L_0x00cd
        L_0x01ba:
            X.1Rn r0 = r3.A0H
            r0.A00()
            X.1Ro r0 = r3.A0F
            X.1Cd r0 = r0.A00
            r0.A06()
            java.io.File r0 = r0.A03
            boolean r0 = r0.exists()
            if (r0 == 0) goto L_0x000e
            X.1Le r0 = r3.A0G
            boolean r0 = r0.A0I()
            if (r0 != 0) goto L_0x000e
            X.1Mm r1 = r3.A06
            X.0zA r0 = r3.A02
            com.whatsapp.jobqueue.job.GetStatusPrivacyJob r0 = X.C50252Ts.A00(r0)
            goto L_0x02e0
        L_0x01e0:
            java.lang.Object r4 = r1.A01
            X.12E r4 = (X.AnonymousClass12E) r4
            X.1Ue r5 = r4.A0A
            X.1Ud r3 = r5.A01
            r0 = 3
            r3.A00 = r5
            com.whatsapp.contact.sync.NativeContactsDownloadHelper r2 = r3.A01
            r1 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.1Ug r0 = r2.A01(r0, r1)
            java.lang.Object r0 = r0.get()     // Catch:{ InterruptedException -> 0x0203, ExecutionException -> 0x0207 }
            X.2Wa r0 = (X.C50852Wa) r0     // Catch:{ InterruptedException -> 0x0203, ExecutionException -> 0x0207 }
            X.C18070vi.A0b(r0)     // Catch:{ InterruptedException -> 0x0203, ExecutionException -> 0x0207 }
            X.C26951Ud.A02(r3, r0)     // Catch:{ InterruptedException -> 0x0203, ExecutionException -> 0x0207 }
            goto L_0x0212
        L_0x0203:
            r1 = move-exception
            java.lang.String r0 = "NativeContactsMetadataUploadSyncManager/downloadContacts: Interrupted"
            goto L_0x020a
        L_0x0207:
            r1 = move-exception
            java.lang.String r0 = "NativeContactsMetadataUploadSyncManager/downloadContacts: Failed to download contacts"
        L_0x020a:
            com.whatsapp.util.Log.e(r0, r1)
            X.2Cv r0 = X.C46082Cv.A00
            X.C26951Ud.A02(r3, r0)
        L_0x0212:
            X.1Ug r3 = r5.A02
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ Exception -> 0x05dc }
            r0 = 60000(0xea60, double:2.9644E-319)
            java.lang.Object r0 = r3.get(r0, r2)     // Catch:{ Exception -> 0x05dc }
            X.2Rg r0 = (X.C49632Rg) r0     // Catch:{ Exception -> 0x05dc }
            boolean r0 = r0 instanceof X.C46042Cq     // Catch:{ Exception -> 0x05dc }
            if (r0 == 0) goto L_0x000e
            java.lang.Integer r0 = X.AnonymousClass00R.A0Y     // Catch:{ Exception -> 0x05dc }
            r4.A0D(r0)     // Catch:{ Exception -> 0x05dc }
            goto L_0x05db
        L_0x022a:
            java.lang.Object r0 = r1.A01
            X.4eJ r0 = (X.C90584eJ) r0
            java.lang.Object r4 = r0.A01
            X.3RS r4 = (X.AnonymousClass3RS) r4
            java.lang.ref.WeakReference r0 = r4.A09
            java.lang.Object r3 = r0.get()
            android.app.Activity r3 = (android.app.Activity) r3
            if (r3 == 0) goto L_0x000e
            X.AnonymousClass3RS.A02(r4)
            com.whatsapp.conversation.ConversationAttachmentContentView r1 = r4.A08
            android.content.res.Resources r0 = r3.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.orientation
            r1.A00 = r0
            r1.A0D()
            boolean r2 = r4.A02
            int r1 = X.AnonymousClass3RS.A00(r3, r4)
            r0 = 0
            X.AnonymousClass3RS.A01(r3, r4, r0, r1, r2)
            return
        L_0x025b:
            java.lang.Object r4 = r1.A01
            X.3rW r4 = (X.AnonymousClass3rW) r4
            X.1E7 r1 = r4.A0H
            X.1BI r0 = r1.A0J
            if (r0 == 0) goto L_0x000e
            X.1yf r0 = r1.A0G
            if (r0 == 0) goto L_0x000e
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x000e
            X.0ve r2 = r4.A0d
            r1 = 4006(0xfa6, float:5.614E-42)
            X.0vf r0 = X.C18040vf.A02
            java.lang.String r1 = X.C18020vd.A01(r0, r2, r1)
            boolean r0 = X.AnonymousClass1EG.A0H(r1)
            if (r0 != 0) goto L_0x02e4
            java.lang.String r0 = "\\s*,\\s*"
            java.lang.String[] r0 = r1.split(r0)
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.util.ArrayList r1 = X.C17880vN.A10(r0)
        L_0x028d:
            X.1E7 r0 = r4.A0H
            X.1BI r0 = r0.A0J
            java.lang.String r0 = X.AnonymousClass17K.A04(r0)
            if (r1 == 0) goto L_0x000e
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x000e
            X.1Me r3 = r4.A0Z
            X.1E7 r2 = r4.A0H
            r1 = -1
            r0 = 1
            X.1yg r0 = r3.A0F(r2, r1, r0, r0)
            java.lang.Integer r1 = r0.A00
            java.lang.Integer r0 = X.AnonymousClass00R.A0N
            if (r1 == r0) goto L_0x02b6
            X.1E7 r0 = r4.A0H
            X.1yf r0 = r0.A0G
            int r1 = r0.A03
            r0 = 3
            if (r1 >= r0) goto L_0x000e
        L_0x02b6:
            X.1E7 r0 = r4.A0H
            X.1BI r0 = r0.A0J
            com.whatsapp.jid.UserJid r3 = X.C22941Dw.A00(r0)
            X.00H r2 = r4.A0K
            java.lang.Object r1 = r2.get()
            X.2nO r1 = (X.C60102nO) r1
            java.lang.String r0 = "ContactConversationTitle"
            r1.A02(r0)
            java.lang.Object r2 = r2.get()
            X.2nO r2 = (X.C60102nO) r2
            java.lang.String r1 = "entry_point"
            java.lang.String r0 = "sev_fix"
            r2.A03(r1, r0)
            X.1Mm r1 = r4.A0C
            com.whatsapp.jobqueue.job.GetVNameCertificateJob r0 = new com.whatsapp.jobqueue.job.GetVNameCertificateJob
            r0.<init>(r3)
        L_0x02e0:
            r1.A01(r0)
            return
        L_0x02e4:
            r1 = 0
            goto L_0x028d
        L_0x02e6:
            java.lang.Object r0 = r1.A01
            X.3rW r0 = (X.AnonymousClass3rW) r0
            X.1bI r1 = r0.A03
            if (r1 == 0) goto L_0x000e
            r0 = 0
            r1.A04(r0)
            return
        L_0x02f3:
            java.lang.Object r3 = r1.A01
            com.whatsapp.contact.picker.ContactPickerBottomSheetActivity r3 = (com.whatsapp.contact.picker.ContactPickerBottomSheetActivity) r3
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = r3.A02
            r0 = 6
            r1.A0W(r0)
            android.view.ViewGroup r2 = r3.A00
            if (r2 != 0) goto L_0x0305
            java.lang.String r0 = "contactPickerLayout"
            goto L_0x05d6
        L_0x0305:
            r1 = 49
            X.7Pc r0 = new X.7Pc
            r0.<init>(r3, r1)
            r2.post(r0)
            return
        L_0x0310:
            java.lang.Object r0 = r1.A01
            com.whatsapp.contact.picker.ContactPickerBottomSheetActivity r0 = (com.whatsapp.contact.picker.ContactPickerBottomSheetActivity) r0
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = r0.A02
            r0 = 3
            r1.A0W(r0)
            return
        L_0x031b:
            java.lang.Object r0 = r1.A01
            X.CtN r0 = (X.C26155CtN) r0
            r0.A08()
            return
        L_0x0323:
            java.lang.Object r0 = r1.A01
            com.whatsapp.contact.picker.ContactPickerFragment r0 = (com.whatsapp.contact.picker.ContactPickerFragment) r0
            android.widget.ImageView r3 = com.whatsapp.contact.picker.ContactPickerFragment.A05(r0)
            X.0vb r2 = r0.A19
            android.content.Context r1 = r0.A1n()
            r0 = 2131231682(0x7f0803c2, float:1.8079452E38)
            android.graphics.drawable.Drawable r1 = X.C24261Jm.A00(r1, r0)
            X.3cP r0 = new X.3cP
            r0.<init>(r1, r2)
            r3.setImageDrawable(r0)
            return
        L_0x0341:
            java.lang.Object r0 = r1.A01
            X.48m r0 = (X.AnonymousClass48m) r0
            java.lang.Object r0 = r0.A01
            com.whatsapp.contact.picker.ContactPickerFragment r0 = (com.whatsapp.contact.picker.ContactPickerFragment) r0
            r0.A2M()
            return
        L_0x034d:
            java.lang.Object r0 = r1.A01
            X.48m r0 = (X.AnonymousClass48m) r0
            java.lang.Object r1 = r0.A01
            com.whatsapp.contact.picker.ContactPickerFragment r1 = (com.whatsapp.contact.picker.ContactPickerFragment) r1
            X.00H r0 = r1.A28
            java.lang.Object r0 = r0.get()
            X.1UD r0 = (X.AnonymousClass1UD) r0
            boolean r0 = r0.A07()
            if (r0 == 0) goto L_0x0367
            com.whatsapp.contact.picker.ContactPickerFragment.A0J(r1)
            return
        L_0x0367:
            X.00H r0 = r1.A25
            java.lang.Object r4 = r0.get()
            X.73Z r4 = (X.AnonymousClass73Z) r4
            r0 = 1
            X.5w3 r3 = new X.5w3
            r3.<init>(r0)
            r2 = 290(0x122, float:4.06E-43)
            r0 = 24
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 0
            X.AnonymousClass73Z.A01(r3, r4, r1, r2, r0)
            return
        L_0x0382:
            java.lang.Object r1 = r1.A01
            X.48m r1 = (X.AnonymousClass48m) r1
            java.lang.Object r2 = r1.A01
            com.whatsapp.contact.picker.ContactPickerFragment r2 = (com.whatsapp.contact.picker.ContactPickerFragment) r2
            boolean r0 = r2.A3F
            if (r0 == 0) goto L_0x03b5
            X.1E7 r0 = r2.A1P
            if (r0 == 0) goto L_0x03b5
            r0 = 36
            X.757 r4 = new X.757
            r4.<init>(r1, r0)
            boolean r0 = r2.A3S
            r3 = 2131892815(0x7f121a4f, float:1.9420389E38)
            r5 = 2131892814(0x7f121a4e, float:1.9420387E38)
            if (r0 == 0) goto L_0x03a9
            r3 = 2131892633(0x7f121999, float:1.942002E38)
            r5 = 2131892632(0x7f121998, float:1.9420018E38)
        L_0x03a9:
            X.10I r0 = r2.A1y
            r6 = 3
            X.3Cq r1 = new X.3Cq
            r1.<init>((java.lang.Object) r2, (int) r3, (java.lang.Object) r4, (int) r5, (int) r6)
            r0.CGF(r1)
            return
        L_0x03b5:
            com.whatsapp.contact.picker.ContactPickerFragment.A0M(r2)
            return
        L_0x03b9:
            java.lang.Object r0 = r1.A01
            X.7E0 r0 = (X.AnonymousClass7E0) r0
            java.lang.Object r0 = r0.A01
            com.whatsapp.contact.picker.ContactPickerFragment r0 = (com.whatsapp.contact.picker.ContactPickerFragment) r0
            r0.A2J()
            return
        L_0x03c5:
            java.lang.Object r0 = r1.A01
            X.79i r0 = (X.C1424079i) r0
            r0.A00()
            return
        L_0x03cd:
            java.lang.Object r0 = r1.A01
            X.6oF r0 = (X.C133146oF) r0
            X.6MQ r0 = r0.A00
            X.C17890vO.A0t(r0)
            return
        L_0x03d7:
            java.lang.Object r3 = r1.A01
            X.6oT r3 = (X.C133266oT) r3
            android.widget.FrameLayout r1 = r3.A08
            r0 = 8
            r1.setVisibility(r0)
            boolean r2 = r3.A01
            boolean r0 = r3.A0N
            r1 = 0
            if (r0 != 0) goto L_0x03ed
            boolean r0 = r3.A02
            if (r0 == 0) goto L_0x03f1
        L_0x03ed:
            if (r2 != 0) goto L_0x03f1
            r1 = 8
        L_0x03f1:
            android.view.ViewGroup r0 = r3.A06
            r0.setVisibility(r1)
            return
        L_0x03f7:
            java.lang.Object r0 = r1.A01
            com.whatsapp.contact.picker.StatusMentionsContactPickerFragment r0 = (com.whatsapp.contact.picker.StatusMentionsContactPickerFragment) r0
            com.whatsapp.contact.picker.StatusMentionsContactPickerFragment.A01(r0)
            return
        L_0x03ff:
            java.lang.Object r0 = r1.A01
            X.73j r0 = (X.C1408673j) r0
            java.util.UUID r4 = java.util.UUID.randomUUID()
            X.C18070vi.A0X(r4)
            r2 = 0
            r5 = 15
            r6 = 6
            r7 = 0
            X.6to r1 = new X.6to
            r3 = r2
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r0.A00 = r1
            return
        L_0x0418:
            java.lang.Object r1 = r1.A01
            X.73j r1 = (X.C1408673j) r1
            r0 = 0
            r1.A00 = r0
            return
        L_0x0420:
            java.lang.Object r1 = r1.A01
            android.app.Dialog r1 = (android.app.Dialog) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            r1.show()
            return
        L_0x042c:
            java.lang.Object r1 = r1.A01
            android.app.Dialog r1 = (android.app.Dialog) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            r1.hide()
            return
        L_0x0438:
            java.lang.Object r0 = r1.A01
            X.5hB r0 = (X.C110835hB) r0
            X.0vk r0 = r0.A00
            r0.invoke()
            return
        L_0x0442:
            java.lang.Object r3 = r1.A01
            X.1pJ r3 = (X.C37311pJ) r3
            X.1jR r2 = r3.A03
            r1 = 2
            java.lang.String r0 = "NativeContactsLauncher"
            r2.A00(r3, r0, r1)
            return
        L_0x044f:
            java.lang.Object r3 = r1.A01
            X.1kL r3 = (X.C34351kL) r3
            X.1Tt r0 = r3.A0D
            r0.A01()
            X.10I r2 = r3.A0P
            r1 = 30
            X.3Bp r0 = new X.3Bp
            r0.<init>(r3, r1)
            r2.CGF(r0)
            return
        L_0x0465:
            java.lang.Object r0 = r1.A01
            X.1kL r0 = (X.C34351kL) r0
            X.12E r4 = r0.A0C
            r3 = 0
            X.11S r0 = r4.A04
            boolean r0 = r0.A0N()
            if (r0 == 0) goto L_0x049e
            java.util.ArrayList r2 = X.AnonymousClass000.A13()
            X.1M9 r0 = r4.A09
            java.util.ArrayList r0 = r0.A0L()
            java.util.Iterator r1 = r0.iterator()
        L_0x0482:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0496
            X.1E7 r0 = X.C17880vN.A0O(r1)
            com.whatsapp.jid.Jid r0 = X.AnonymousClass1E7.A01(r0)
            if (r0 == 0) goto L_0x0482
            r2.add(r0)
            goto L_0x0482
        L_0x0496:
            X.2R1 r1 = X.AnonymousClass2R1.A04
            X.2qq r0 = X.C62132qq.A0D
            X.AnonymousClass12E.A01(r4, r0, r1, r2, r3)
            return
        L_0x049e:
            X.2qq r2 = X.C62132qq.A0C
            X.2R1 r1 = X.AnonymousClass2R1.A03
            java.util.Set r0 = java.util.Collections.emptySet()
            X.AnonymousClass12E.A01(r4, r2, r1, r0, r3)
            return
        L_0x04aa:
            java.lang.Object r0 = r1.A01
            X.1UO r0 = (X.AnonymousClass1UO) r0
            X.00H r0 = r0.A0S
            java.lang.Object r3 = r0.get()
            X.1jR r3 = (X.C33821jR) r3
            X.2yq r2 = new X.2yq
            r2.<init>()
            r1 = 0
            java.lang.String r0 = "delta-sync"
            r3.A00(r2, r0, r1)
            return
        L_0x04c2:
            java.lang.Object r1 = r1.A01
            X.12E r1 = (X.AnonymousClass12E) r1
            r1.A09()     // Catch:{ RuntimeException -> 0x04ca }
            return
        L_0x04ca:
            r0 = move-exception
            java.lang.String r3 = "contactsyncmethods/forceSyncIfNeeded"
            com.whatsapp.util.Log.e(r3, r0)
            X.190 r2 = r1.A03
            java.lang.String r1 = r0.getMessage()
            r0 = 1
            r2.A0G(r3, r1, r0)
            return
        L_0x04db:
            java.lang.Object r0 = r1.A01
            X.12E r0 = (X.AnonymousClass12E) r0
            r0.A08()
            return
        L_0x04e3:
            java.lang.Object r7 = r1.A01
            X.1US r7 = (X.AnonymousClass1US) r7
            java.util.concurrent.atomic.AtomicBoolean r5 = r7.A0X
            monitor-enter(r5)
            X.1UT r6 = r7.A0E     // Catch:{ all -> 0x053e }
            monitor-enter(r6)     // Catch:{ all -> 0x053e }
            java.util.Set r4 = r6.A02     // Catch:{ all -> 0x053b }
            monitor-exit(r6)     // Catch:{ all -> 0x053e }
            java.util.Iterator r3 = r4.iterator()     // Catch:{ all -> 0x053e }
        L_0x04f4:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x053e }
            if (r0 == 0) goto L_0x0514
            java.lang.Object r2 = r3.next()     // Catch:{ all -> 0x053e }
            X.2re r2 = (X.C62592re) r2     // Catch:{ all -> 0x053e }
            android.os.Handler r1 = X.AnonymousClass1US.A00(r7)     // Catch:{ all -> 0x053e }
            monitor-enter(r6)     // Catch:{ all -> 0x053e }
            java.util.Map r0 = r6.A01     // Catch:{ all -> 0x053b }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ all -> 0x053b }
            X.2c8 r0 = (X.C53192c8) r0     // Catch:{ all -> 0x053b }
            java.lang.Runnable r0 = r0.A01     // Catch:{ all -> 0x053b }
            monitor-exit(r6)     // Catch:{ all -> 0x053e }
            r1.removeCallbacks(r0)     // Catch:{ all -> 0x053e }
            goto L_0x04f4
        L_0x0514:
            r6.A01()     // Catch:{ all -> 0x053e }
            X.1UU r1 = r7.A0D     // Catch:{ all -> 0x053e }
            monitor-enter(r1)     // Catch:{ all -> 0x053e }
            java.util.LinkedList r0 = new java.util.LinkedList     // Catch:{ all -> 0x0538 }
            r0.<init>()     // Catch:{ all -> 0x0538 }
            r1.A00 = r0     // Catch:{ all -> 0x0538 }
            monitor-exit(r1)     // Catch:{ all -> 0x053e }
            java.util.Iterator r1 = r4.iterator()     // Catch:{ all -> 0x053e }
        L_0x0526:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x053e }
            if (r0 == 0) goto L_0x0536
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x053e }
            X.2re r0 = (X.C62592re) r0     // Catch:{ all -> 0x053e }
            X.AnonymousClass1US.A03(r7, r0)     // Catch:{ all -> 0x053e }
            goto L_0x0526
        L_0x0536:
            monitor-exit(r5)     // Catch:{ all -> 0x053e }
            return
        L_0x0538:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x053e }
            goto L_0x053d
        L_0x053b:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x053e }
        L_0x053d:
            throw r0     // Catch:{ all -> 0x053e }
        L_0x053e:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x053e }
            throw r0
        L_0x0541:
            java.lang.Object r2 = r1.A01
            X.10T r2 = (X.AnonymousClass10T) r2
            r1 = 17
            X.7KX r0 = new X.7KX
            r0.<init>(r1)
            r2.notifyAllObservers(r0)
            return
        L_0x0550:
            java.lang.Object r0 = r1.A01
            X.1Lr r0 = (X.C24791Lr) r0
            X.1Lp r0 = r0.A02
            X.1ga r0 = r0.A04()
            r1 = 0
            X.1N0 r0 = r0.A02
            r0.A07(r1)
            return
        L_0x0561:
            java.lang.Object r2 = r1.A01
            X.1Re r2 = (X.C26191Re) r2
            monitor-enter(r2)
            java.util.HashSet r1 = X.C26191Re.A00(r2)     // Catch:{ all -> 0x058d }
            r1.size()     // Catch:{ all -> 0x058d }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x058d }
            if (r0 != 0) goto L_0x058b
            r0 = 0
            com.whatsapp.jid.UserJid[] r0 = new com.whatsapp.jid.UserJid[r0]     // Catch:{ all -> 0x058d }
            java.lang.Object[] r1 = r1.toArray(r0)     // Catch:{ all -> 0x058d }
            com.whatsapp.jid.UserJid[] r1 = (com.whatsapp.jid.UserJid[]) r1     // Catch:{ all -> 0x058d }
            r0 = 3
            r2.A01(r1, r0)     // Catch:{ all -> 0x058d }
            X.0z4 r0 = r2.A05     // Catch:{ all -> 0x058d }
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r0)     // Catch:{ all -> 0x058d }
            java.lang.String r0 = "pending_users_to_sync_device"
            X.C17880vN.A1B(r1, r0)     // Catch:{ all -> 0x058d }
        L_0x058b:
            monitor-exit(r2)
            return
        L_0x058d:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0590:
            java.lang.Object r0 = r1.A01
            X.3RS r0 = (X.AnonymousClass3RS) r0
            r0.A05()
            return
        L_0x0598:
            java.lang.Object r0 = r1.A01
            android.view.View r0 = (android.view.View) r0
            r0.requestLayout()
            return
        L_0x05a0:
            java.lang.Object r0 = r1.A01
            X.3RR r0 = (X.AnonymousClass3RR) r0
            X.5YX r1 = r0.A04
            com.whatsapp.KeyboardPopupLayout r1 = (com.whatsapp.KeyboardPopupLayout) r1
            r0 = 0
            r1.A09 = r0
            return
        L_0x05ac:
            java.lang.Object r0 = r1.A01
            X.3hU r0 = (X.C75433hU) r0
            r0.A0I()
            return
        L_0x05b4:
            java.lang.Object r0 = r1.A01
            X.3hU r0 = (X.C75433hU) r0
            r0.A0C()
            return
        L_0x05bc:
            java.lang.Object r1 = r1.A01
            com.whatsapp.conversation.CommentsBottomSheet r1 = (com.whatsapp.conversation.CommentsBottomSheet) r1
            X.00H r0 = r1.A0P
            if (r0 == 0) goto L_0x05d4
            java.lang.Object r2 = r0.get()
            X.1o3 r2 = (X.C36531o3) r2
            X.1FL r1 = r1.A1D()
            java.lang.String r0 = "community-no-longer-available"
            r2.A01(r1, r0)
            return
        L_0x05d4:
            java.lang.String r0 = "contextualHelpHandler"
        L_0x05d6:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x05db:
            return
        L_0x05dc:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Error: interupption ->  "
            r1.append(r0)
            java.lang.String r0 = r2.getMessage()
            X.C17890vO.A1A(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70563Bp.run():void");
    }
}
