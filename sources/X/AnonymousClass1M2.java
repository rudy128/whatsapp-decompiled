package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.Build;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1M2  reason: invalid class name */
public class AnonymousClass1M2 extends C24861Ly implements AnonymousClass1M1 {
    public C18000vb A00;
    public C200710s A01;
    public Integer A02;
    public final AnonymousClass11S A03;
    public final C24851Lx A04;
    public final AnonymousClass11P A05;
    public final C18030ve A06;
    public final C24871Lz A07;
    public final AnonymousClass10I A08;
    public final AnonymousClass00H A09;
    public final Object A0A = new Object();
    public final AnonymousClass1LY A0B;

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003f, code lost:
        if (r2 == null) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0045, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        X.AnonymousClass0DT.A00(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004a, code lost:
        r1 = th;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:12:0x0034, B:20:0x0041] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass1E7 A0J(long r9) {
        /*
            r8 = this;
            r1 = 1
            X.1Ez r5 = new X.1Ez
            r5.<init>((boolean) r1)
            r5.A04()
            r6 = 0
            r4 = 0
            X.1Lt r0 = r8.A00     // Catch:{ IllegalStateException -> 0x0059 }
            X.1at r7 = r0.get()     // Catch:{ IllegalStateException -> 0x0059 }
            java.lang.String r2 = X.C42631yU.A08     // Catch:{ all -> 0x004c }
            r3 = 1
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch:{ all -> 0x004c }
            java.lang.String r0 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x004c }
            r1[r6] = r0     // Catch:{ all -> 0x004c }
            java.lang.String r0 = "CONTACT"
            android.database.Cursor r2 = X.C24861Ly.A03(r7, r2, r0, r1)     // Catch:{ all -> 0x004c }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x003d }
            if (r0 == 0) goto L_0x002f
            X.0vb r0 = r8.A00     // Catch:{ all -> 0x003d }
            X.1E7 r4 = X.C42651yW.A02(r2, r0)     // Catch:{ all -> 0x003d }
            goto L_0x0030
        L_0x002f:
            r3 = 0
        L_0x0030:
            int r6 = r2.getCount()     // Catch:{ all -> 0x003b }
            r2.close()     // Catch:{ all -> 0x004a }
            r7.close()     // Catch:{ IllegalStateException -> 0x0057 }
            goto L_0x0060
        L_0x003b:
            r1 = move-exception
            goto L_0x0041
        L_0x003d:
            r1 = move-exception
            r3 = 0
            if (r2 == 0) goto L_0x0049
        L_0x0041:
            r2.close()     // Catch:{ all -> 0x0045 }
            goto L_0x0049
        L_0x0045:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x004a }
        L_0x0049:
            throw r1     // Catch:{ all -> 0x004a }
        L_0x004a:
            r1 = move-exception
            goto L_0x004e
        L_0x004c:
            r1 = move-exception
            r3 = 0
        L_0x004e:
            r7.close()     // Catch:{ all -> 0x0052 }
            goto L_0x0056
        L_0x0052:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IllegalStateException -> 0x0057 }
        L_0x0056:
            throw r1     // Catch:{ IllegalStateException -> 0x0057 }
        L_0x0057:
            r1 = move-exception
            goto L_0x005b
        L_0x0059:
            r1 = move-exception
            r3 = 0
        L_0x005b:
            java.lang.String r0 = "ContactManagerDatabase/getContactById/"
            A0G(r1, r0, r6, r3)     // Catch:{ all -> 0x0069 }
        L_0x0060:
            X.1Lz r0 = r8.A07
            r0.A0I(r4)
            r5.A01()
            return r4
        L_0x0069:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1M2.A0J(long):X.1E7");
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    public X.AnonymousClass1E7 A0K(com.whatsapp.jid.Jid r13) {
        /*
            r12 = this;
            r5 = 0
            if (r13 != 0) goto L_0x0009
            java.lang.String r0 = "ContactManagerDatabase/getContactByJid cannot get contact by null jid"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return r5
        L_0x0009:
            r10 = 1
            X.1Ez r4 = new X.1Ez
            r4.<init>((boolean) r10)
            r4.A04()
            r3 = 0
            X.1Lt r0 = r12.A00     // Catch:{ IllegalStateException -> 0x00c9 }
            X.1at r7 = r0.get()     // Catch:{ IllegalStateException -> 0x00c9 }
            java.lang.String r6 = "GET_CONTACT_BY_JID"
            boolean r0 = X.C22971Dz.A0d(r13)     // Catch:{ all -> 0x00bb }
            if (r0 == 0) goto L_0x0068
            X.1Lx r8 = r12.A04     // Catch:{ all -> 0x00bb }
            X.0ve r9 = r8.A01     // Catch:{ all -> 0x00bb }
            X.0vf r2 = X.C18040vf.A01     // Catch:{ all -> 0x00bb }
            r0 = 9529(0x2539, float:1.3353E-41)
            boolean r1 = X.C18020vd.A05(r2, r9, r0)     // Catch:{ all -> 0x00bb }
            r0 = r13
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0     // Catch:{ all -> 0x00bb }
            if (r1 == 0) goto L_0x0063
            com.whatsapp.jid.UserJid r8 = r8.A01(r0)     // Catch:{ all -> 0x00bb }
        L_0x0036:
            boolean r0 = r13.equals(r8)     // Catch:{ all -> 0x00bb }
            if (r0 != 0) goto L_0x005a
            r0 = 9529(0x2539, float:1.3353E-41)
            boolean r0 = X.C18020vd.A05(r2, r9, r0)     // Catch:{ all -> 0x00bb }
            if (r0 == 0) goto L_0x005a
            java.lang.String r2 = X.C42631yU.A06     // Catch:{ all -> 0x00bb }
            r0 = 2
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x00bb }
            java.lang.String r0 = r13.getRawString()     // Catch:{ all -> 0x00bb }
            r1[r3] = r0     // Catch:{ all -> 0x00bb }
            java.lang.String r0 = r8.getRawString()     // Catch:{ all -> 0x00bb }
            r1[r10] = r0     // Catch:{ all -> 0x00bb }
        L_0x0055:
            android.database.Cursor r9 = X.C24861Ly.A03(r7, r2, r6, r1)     // Catch:{ all -> 0x00bb }
            goto L_0x0073
        L_0x005a:
            java.lang.String r2 = X.C42631yU.A04     // Catch:{ all -> 0x00bb }
            java.lang.String[] r1 = new java.lang.String[r10]     // Catch:{ all -> 0x00bb }
            java.lang.String r0 = r8.getRawString()     // Catch:{ all -> 0x00bb }
            goto L_0x0070
        L_0x0063:
            com.whatsapp.jid.UserJid r8 = r8.A00(r0)     // Catch:{ all -> 0x00bb }
            goto L_0x0036
        L_0x0068:
            java.lang.String r2 = X.C42631yU.A04     // Catch:{ all -> 0x00bb }
            java.lang.String[] r1 = new java.lang.String[r10]     // Catch:{ all -> 0x00bb }
            java.lang.String r0 = r13.getRawString()     // Catch:{ all -> 0x00bb }
        L_0x0070:
            r1[r3] = r0     // Catch:{ all -> 0x00bb }
            goto L_0x0055
        L_0x0073:
            r6 = r5
            r2 = 0
        L_0x0075:
            boolean r0 = r9.moveToNext()     // Catch:{ all -> 0x00ad }
            if (r0 == 0) goto L_0x00a2
            X.0vb r0 = r12.A00     // Catch:{ all -> 0x00ad }
            X.1E7 r8 = X.C42651yW.A02(r9, r0)     // Catch:{ all -> 0x00ad }
            int r2 = r2 + 1
            X.1E7 r5 = A07(r12, r8, r5)     // Catch:{ all -> 0x00ad }
            X.2lf r0 = r8.A0H     // Catch:{ all -> 0x00ad }
            if (r0 != 0) goto L_0x0075
            X.0ve r11 = r12.A06     // Catch:{ all -> 0x00ad }
            r1 = 5868(0x16ec, float:8.223E-42)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ all -> 0x00ad }
            boolean r0 = X.C18020vd.A05(r0, r11, r1)     // Catch:{ all -> 0x00ad }
            if (r0 == 0) goto L_0x00a0
            int r1 = r8.A01     // Catch:{ all -> 0x00ad }
            r0 = 2
            if (r1 == r0) goto L_0x0075
            int r0 = r8.A09     // Catch:{ all -> 0x00ad }
            if (r0 != r10) goto L_0x0075
        L_0x00a0:
            r6 = r8
            goto L_0x0075
        L_0x00a2:
            int r3 = r9.getCount()     // Catch:{ all -> 0x00ad }
            r9.close()     // Catch:{ all -> 0x00b9 }
            r7.close()     // Catch:{ IllegalStateException -> 0x00c7 }
            goto L_0x00d1
        L_0x00ad:
            r1 = move-exception
            if (r9 == 0) goto L_0x00b8
            r9.close()     // Catch:{ all -> 0x00b4 }
            goto L_0x00b8
        L_0x00b4:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x00b9 }
        L_0x00b8:
            throw r1     // Catch:{ all -> 0x00b9 }
        L_0x00b9:
            r1 = move-exception
            goto L_0x00be
        L_0x00bb:
            r1 = move-exception
            r6 = r5
            r2 = 0
        L_0x00be:
            r7.close()     // Catch:{ all -> 0x00c2 }
            goto L_0x00c6
        L_0x00c2:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IllegalStateException -> 0x00c7 }
        L_0x00c6:
            throw r1     // Catch:{ IllegalStateException -> 0x00c7 }
        L_0x00c7:
            r1 = move-exception
            goto L_0x00cc
        L_0x00c9:
            r1 = move-exception
            r6 = r5
            r2 = 0
        L_0x00cc:
            java.lang.String r0 = "ContactManagerDatabase/getContactByJid/"
            A0G(r1, r0, r3, r2)     // Catch:{ all -> 0x0106 }
        L_0x00d1:
            if (r6 == 0) goto L_0x00f3
            if (r6 == r5) goto L_0x00f3
            r3 = r12
            monitor-enter(r3)
            X.10s r2 = r12.A01     // Catch:{ all -> 0x00e6 }
            if (r2 != 0) goto L_0x00e9
            X.10I r1 = r12.A08     // Catch:{ all -> 0x00e6 }
            r0 = 0
            X.10s r2 = new X.10s     // Catch:{ all -> 0x00e6 }
            r2.<init>(r1, r0)     // Catch:{ all -> 0x00e6 }
            r12.A01 = r2     // Catch:{ all -> 0x00e6 }
            goto L_0x00e9
        L_0x00e6:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x00e9:
            monitor-exit(r3)
            r1 = 6
            X.3Cl r0 = new X.3Cl
            r0.<init>(r12, r6, r5, r1)
            r2.execute(r0)
        L_0x00f3:
            X.1Lz r0 = r12.A07
            r0.A0I(r5)
            if (r5 == 0) goto L_0x0102
            boolean r0 = r13 instanceof X.AnonymousClass1BI
            if (r0 == 0) goto L_0x0102
            X.1BI r13 = (X.AnonymousClass1BI) r13
            r5.A0J = r13
        L_0x0102:
            r4.A01()
            return r5
        L_0x0106:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1M2.A0K(com.whatsapp.jid.Jid):X.1E7");
    }

    public ArrayList A0L() {
        int count;
        AnonymousClass1Ez r7 = new AnonymousClass1Ez(true);
        r7.A04();
        ArrayList arrayList = new ArrayList();
        C28781at A052 = this.A00.get();
        try {
            Cursor A032 = C24861Ly.A03(A052, C42631yU.A00, "GET_ALL_DB_CONTACTS", (String[]) null);
            try {
                count = A032.getCount();
                while (A032.moveToNext()) {
                    arrayList.add(C42651yW.A02(A032, this.A00));
                }
            } catch (IllegalStateException e) {
                A0G(e, "ContactManagerDatabase/getAllDBContacts/", count, arrayList.size());
            } catch (Throwable th) {
                if (A032 != null) {
                    A032.close();
                }
                throw th;
            }
            A032.close();
            A052.close();
            this.A07.A0J(arrayList);
            arrayList.size();
            r7.A01();
            return arrayList;
        } catch (Throwable th2) {
            try {
                A052.close();
                throw th2;
            } catch (Throwable th3) {
                AnonymousClass0DT.A00(th2, th3);
                throw th2;
            }
        }
    }

    public ArrayList A0M() {
        Cursor A032;
        AnonymousClass1Ez r5 = new AnonymousClass1Ez(true);
        r5.A04();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        try {
            C28781at A052 = this.A00.get();
            try {
                A032 = C24861Ly.A03(A052, C42631yU.A01, "GET_ALL_GROUP_CHATS", (String[]) null);
                i = A032.getCount();
                while (A032.moveToNext()) {
                    AnonymousClass1E7 A022 = C42651yW.A02(A032, this.A00);
                    if (A022.A0J != null) {
                        arrayList.add(A022);
                    }
                }
                A032.close();
                A052.close();
                arrayList.size();
                r5.A01();
                return arrayList;
            } catch (Throwable th) {
                A052.close();
                throw th;
            }
            throw th;
        } catch (IllegalStateException e) {
            A0G(e, "ContactManagerDatabase/getAllGroupChats/", i, arrayList.size());
        } catch (Throwable th2) {
            AnonymousClass0DT.A00(th, th2);
        }
    }

    public ArrayList A0N(AnonymousClass1BI r10) {
        Cursor A032;
        AnonymousClass1Ez r4 = new AnonymousClass1Ez(true);
        r4.A04();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        try {
            C28781at A052 = this.A00.get();
            try {
                String str = C42631yU.A04;
                AnonymousClass1BI r2 = r10;
                if (C22971Dz.A0d(r10)) {
                    r2 = this.A04.A00((UserJid) r2);
                }
                A032 = C24861Ly.A03(A052, str, "GET_CONTACTS_BY_JID", new String[]{r2.getRawString()});
                i = A032.getCount();
                while (A032.moveToNext()) {
                    AnonymousClass1E7 A022 = C42651yW.A02(A032, this.A00);
                    if (A022.A0J != null) {
                        A022.A0J = r10;
                        arrayList.add(A022);
                    }
                }
                A032.close();
                A052.close();
                this.A07.A0J(arrayList);
                arrayList.size();
                r4.A01();
                return arrayList;
            } catch (Throwable th) {
                A052.close();
                throw th;
            }
            throw th;
        } catch (IllegalStateException e) {
            A0G(e, "ContactManagerDatabase/getContactsByJid/", i, arrayList.size());
        } catch (Throwable th2) {
            AnonymousClass0DT.A00(th, th2);
        }
    }

    public void A0O(AnonymousClass1E7 r7) {
        C28791au A062;
        AnonymousClass1Ez r3 = new AnonymousClass1Ez(true);
        r3.A04();
        AnonymousClass1BI r5 = r7.A0J;
        if (r5 == null) {
            Log.w("ContactManagerDatabase/unable to add group chat with null jid");
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("jid", r5.getRawString());
        contentValues.put("is_whatsapp_user", true);
        contentValues.put("status", r7.A0Z);
        contentValues.put("status_timestamp", Long.valueOf(r7.A0F));
        contentValues.put("display_name", r7.A0K());
        contentValues.put("phone_label", r7.A0X);
        contentValues.put("history_sync_initial_phash", r7.A0U);
        try {
            A062 = this.A00.A06();
            r7.A0M(A06(contentValues, this, A062, r5));
            A0F(r7, (AnonymousClass1E9) r7.A06(AnonymousClass1E9.class));
            A062.close();
        } catch (IllegalArgumentException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("ContactManagerDatabase/unable to add group chat ");
            sb.append(r7);
            C17960vV.A09(sb.toString(), e);
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
        }
        r3.A01();
        return;
        throw th;
    }

    public void A0P(AnonymousClass1E7 r7) {
        C28791au A062;
        String str;
        AnonymousClass1Ez r3 = new AnonymousClass1Ez(true);
        r3.A04();
        AnonymousClass1BI r5 = r7.A0J;
        if (r5 == null) {
            str = "ContactManagerDatabase/addUnknownContact unable to add unknown contact with null jid";
        } else {
            AnonymousClass11S r1 = this.A03;
            r1.A0I();
            if (r1.A0E == null) {
                str = "ContactManagerDatabase/addUnknownContact unable to add unknown contact due to null me record";
            } else if (r7.A0F() || !r1.A0O(r5)) {
                ContentValues contentValues = new ContentValues(4);
                contentValues.put("is_whatsapp_user", true);
                contentValues.put("status", r7.A0Z);
                contentValues.put("status_timestamp", Long.valueOf(r7.A0F));
                contentValues.put("status_emoji", r7.A0a);
                try {
                    A062 = this.A00.A06();
                    r7.A0M(A06(contentValues, this, A062, r5));
                    A062.close();
                    AnonymousClass35V.A00((C47812Kb) this.A09.get(), Collections.singletonList(r7), 5);
                    r3.A01();
                    return;
                } catch (IllegalArgumentException e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("ContactManagerDatabase/unable to add unknown contact ");
                    sb.append(r7);
                    C17960vV.A09(sb.toString(), e);
                    return;
                } catch (Throwable th) {
                    AnonymousClass0DT.A00(th, th);
                }
            } else {
                Log.i("ContactManagerDatabase/addUnknownContact unable to add unknown contact due to matching jid prefix");
                return;
            }
        }
        Log.w(str);
        return;
        throw th;
    }

    public void A0Q(AnonymousClass1E7 r5) {
        AnonymousClass1Ez r3 = new AnonymousClass1Ez(true);
        r3.A04();
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("wa_name", r5.A0c);
        A0A(contentValues, this, r5.A0J);
        StringBuilder sb = new StringBuilder();
        sb.append("ContactManagerDatabase/updateContactWAName for contact jid=");
        sb.append(r5.A0J);
        sb.append(" | time: ");
        sb.append(r3.A01());
        Log.i(sb.toString());
    }

    public void A0R(AnonymousClass1E7 r5) {
        AnonymousClass1Ez r3 = new AnonymousClass1Ez(true);
        r3.A04();
        ContentValues contentValues = new ContentValues(5);
        contentValues.put("display_name", r5.A0K());
        contentValues.put("phone_label", r5.A0X);
        contentValues.put("is_whatsapp_user", Boolean.valueOf(r5.A10));
        contentValues.put("history_sync_initial_phash", r5.A0U);
        A0A(contentValues, this, r5.A0J);
        A0F(r5, (AnonymousClass1E9) r5.A06(AnonymousClass1EC.class));
        StringBuilder sb = new StringBuilder();
        sb.append("ContactManagerDatabase/updateGroupInfo for jid=");
        sb.append(r5.A0J);
        sb.append(" | time: ");
        sb.append(r3.A01());
        Log.i(sb.toString());
        AnonymousClass35V.A00((C47812Kb) this.A09.get(), Collections.singleton(r5), 5);
    }

    public void A0T(AnonymousClass1E7 r6) {
        AnonymousClass1Ez r3 = new AnonymousClass1Ez(true);
        r3.A04();
        ContentValues contentValues = new ContentValues(3);
        contentValues.put("photo_ts", Integer.valueOf(r6.A07));
        contentValues.put("thumb_ts", Integer.valueOf(r6.A08));
        contentValues.put("photo_id_timestamp", Long.valueOf(r6.A0E));
        A0A(contentValues, this, r6.A0J);
        StringBuilder sb = new StringBuilder();
        sb.append("ContactManagerDatabase/updatePhotoId for contact jid=");
        sb.append(r6.A0J);
        sb.append(' ');
        sb.append(contentValues);
        sb.append(" | time: ");
        sb.append(r3.A01());
        Log.i(sb.toString());
    }

    public void A0U(AnonymousClass1E7 r5, GroupJid groupJid, String str, long j) {
        AnonymousClass1Ez r1 = new AnonymousClass1Ez(true);
        r1.A04();
        ContentValues contentValues = new ContentValues(3);
        contentValues.put("jid", groupJid.getRawString());
        contentValues.put("display_name", str);
        contentValues.put("phone_label", Long.toString(j));
        A0A(contentValues, this, r5.A0J);
        A0F(r5, groupJid);
        StringBuilder sb = new StringBuilder();
        sb.append("ContactManagerDatabase/updateTempGroup");
        sb.append("");
        sb.append(" creationTime=");
        sb.append(j);
        sb.append(" oldJid=");
        sb.append(r5.A0J);
        sb.append(" newJid=");
        sb.append(groupJid);
        sb.append(" | time: ");
        sb.append(r1.A01());
        Log.i(sb.toString());
    }

    public void A0V(UserJid userJid, String str, long j) {
        C28791au A062;
        AnonymousClass1Ez r3 = new AnonymousClass1Ez(true);
        r3.A04();
        ContentValues contentValues = new ContentValues(2);
        contentValues.put("status", str);
        contentValues.put("status_timestamp", Long.valueOf(j));
        try {
            A062 = this.A00.A06();
            A09(contentValues, this, A062, userJid);
            A062.close();
        } catch (IllegalArgumentException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("ContactManagerDatabase/updateContactStatus failed ");
            sb.append(userJid);
            sb.append(", statusNull=");
            boolean z = false;
            if (str == null) {
                z = true;
            }
            sb.append(z);
            C17960vV.A09(sb.toString(), e);
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
        }
        r3.A01();
        return;
        throw th;
    }

    public /* synthetic */ void BwP(Collection collection) {
    }

    public static AnonymousClass1E7 A07(AnonymousClass1M2 r5, AnonymousClass1E7 r6, AnonymousClass1E7 r7) {
        UserJid userJid;
        C59042lf r0;
        AnonymousClass1BI r1 = r6.A0J;
        C22941Dw r02 = UserJid.Companion;
        UserJid A012 = C22941Dw.A01(r1);
        if (r7 != null) {
            userJid = C22941Dw.A01(r7.A0J);
        } else {
            userJid = null;
        }
        if (A012 == null || userJid == null || A012.equals(userJid)) {
            if (r7 != null) {
                C59042lf r2 = r7.A0H;
                if (r2 == null && r6.A0H != null) {
                    return r6;
                }
                if (Build.MANUFACTURER.equalsIgnoreCase("lge") && r2 != null && r2.A00 == -2 && (r0 = r6.A0H) != null && r0.A00 != -2) {
                    return r6;
                }
                if (!r7.A10 && r6.A10) {
                    return r6;
                }
                if (C18020vd.A05(C18040vf.A02, r5.A06, 5868) && r7.A09 == 0 && r6.A09 == 1) {
                    return r6;
                }
                if (!r7.A10 || !r6.A10 || r6.A0J() >= r7.A0J()) {
                    return r7;
                }
                return r6;
            }
        } else if (!(A012 instanceof PhoneUserJid)) {
            return r7;
        }
        return r6;
    }

    public static ArrayList A08(AnonymousClass1M2 r6, boolean z) {
        ArrayList arrayList = new ArrayList();
        AnonymousClass11S r0 = r6.A03;
        r0.A0I();
        String A062 = C22971Dz.A06(r0.A0E);
        String[] strArr = new String[2];
        if (A062 == null) {
            A062 = C173438v4.A00.getRawString();
        }
        strArr[0] = A062;
        strArr[1] = C42541yL.A00.getRawString();
        C28781at A052 = r6.A00.get();
        try {
            Cursor A032 = C24861Ly.A03(A052, C42631yU.A00(z, true), "GET_SIDE_LIST_CONTACT_JIDS", strArr);
            try {
                int count = A032.getCount();
                while (A032.moveToNext()) {
                    AnonymousClass1BI A022 = AnonymousClass1BI.A00.A02(A032.getString(A032.getColumnIndexOrThrow("jid")));
                    if (C22971Dz.A0d(A022)) {
                        arrayList.add(C22941Dw.A01(A022));
                    }
                }
            } catch (IllegalStateException e) {
                A0G(e, "ContactManagerDatabase/getSideListContactJids/", 0, arrayList.size());
            } catch (Throwable th) {
                if (A032 != null) {
                    A032.close();
                }
                throw th;
            }
            if (A032 != null) {
                A032.close();
            }
            A052.close();
            arrayList.size();
            return arrayList;
        } catch (Throwable th2) {
            try {
                A052.close();
                throw th2;
            } catch (Throwable th3) {
                AnonymousClass0DT.A00(th2, th3);
                throw th2;
            }
        }
    }

    public static void A09(ContentValues contentValues, AnonymousClass1M2 r5, C28791au r6, UserJid userJid) {
        C24861Ly.A01(contentValues, r6, "wa_contacts", "jid = ?", new String[]{r5.A04.A00(userJid).getRawString()});
    }

    public static void A0A(ContentValues contentValues, AnonymousClass1M2 r7, AnonymousClass1BI r8) {
        C28791au A062;
        try {
            A062 = r7.A00.A06();
            if (C22971Dz.A0d(r8)) {
                C22941Dw r0 = UserJid.Companion;
                UserJid A012 = C22941Dw.A01(r8);
                if (A012 != null) {
                    A09(contentValues, r7, A062, A012);
                }
            } else if (r8 != null) {
                C24861Ly.A01(contentValues, A062, "wa_contacts", "jid = ?", new String[]{r8.getRawString()});
            } else {
                throw new IllegalArgumentException("Chat jid is null.");
            }
            A062.close();
            return;
        } catch (IllegalArgumentException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("ContactManagerDatabase/unable to update contact by jid ");
            sb.append(r8);
            C17960vV.A09(sb.toString(), e);
            return;
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
        }
        throw th;
    }

    public static void A0B(AnonymousClass1M2 r3, AnonymousClass1E7 r4) {
        C41851xA BD0;
        C28791au A062 = r3.A00.A06();
        try {
            BD0 = A062.BD0();
            C17960vV.A0D(BD0.A01());
            AnonymousClass1Ez r0 = new AnonymousClass1Ez(true);
            r0.A04();
            A0D(BD0, r4, A062);
            r0.A01();
            BD0.A00();
            BD0.close();
            A062.close();
            return;
        } catch (Throwable th) {
            try {
                A062.close();
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
            }
            throw th;
        }
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0053, code lost:
        if (r3 != 5) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x03a3, code lost:
        r21 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005c, code lost:
        if (r12 != false) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006b, code lost:
        if (r1 != false) goto L_0x006d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x03b0 A[Catch:{ all -> 0x040f, all -> 0x0416, IllegalStateException -> 0x041b }] */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0436 A[Catch:{ all -> 0x0494, all -> 0x049d }, LOOP:9: B:187:0x0430->B:189:0x0436, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0458 A[Catch:{ all -> 0x0494, all -> 0x049d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0C(X.AnonymousClass1M2 r29, java.util.List r30, int r31, boolean r32, boolean r33, boolean r34, boolean r35, boolean r36) {
        /*
            java.lang.String r27 = "contact-mgr-db/getContactPickerList"
            r6 = 1
            X.1Ez r26 = new X.1Ez
            r0 = r26
            r0.<init>((boolean) r6)
            r26.A04()
            r4 = r29
            X.11S r0 = r4.A03
            r0.A0I()
            com.whatsapp.jid.PhoneUserJid r5 = r0.A0E
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            r10 = 0
            if (r5 != 0) goto L_0x002a
            java.lang.String[] r2 = new java.lang.String[r10]
        L_0x0020:
            java.util.ArrayList r25 = new java.util.ArrayList
            r25.<init>()
            long r16 = android.os.SystemClock.uptimeMillis()
            goto L_0x0033
        L_0x002a:
            java.lang.String[] r2 = new java.lang.String[r6]
            java.lang.String r0 = r5.getRawString()
            r2[r10] = r0
            goto L_0x0020
        L_0x0033:
            X.1Lt r0 = r4.A00     // Catch:{ IllegalArgumentException -> 0x04a7 }
            r29 = r0
            X.1at r24 = r29.get()     // Catch:{ IllegalArgumentException -> 0x04a7 }
            X.0ve r0 = r4.A06     // Catch:{ all -> 0x049d }
            r28 = r0
            r3 = 5868(0x16ec, float:8.223E-42)
            X.0vf r23 = X.C18040vf.A02     // Catch:{ all -> 0x049d }
            r1 = r0
            r0 = r23
            boolean r13 = X.C18020vd.A05(r0, r1, r3)     // Catch:{ all -> 0x049d }
            r15 = 3
            r12 = 1
            r3 = r31
            if (r3 == r15) goto L_0x0055
            r12 = 0
            r0 = 5
            r1 = 1
            if (r3 == r0) goto L_0x005e
        L_0x0055:
            r1 = 0
            if (r3 == r6) goto L_0x005e
            r0 = 2
            if (r3 == r0) goto L_0x005e
            r9 = 0
            if (r12 == 0) goto L_0x005f
        L_0x005e:
            r9 = 1
        L_0x005f:
            r8 = 0
            if (r5 == 0) goto L_0x0063
            r8 = 1
        L_0x0063:
            r0 = 4
            r7 = 0
            if (r3 != r0) goto L_0x0068
            r7 = 1
        L_0x0068:
            if (r12 != 0) goto L_0x006d
            r6 = 0
            if (r1 == 0) goto L_0x006e
        L_0x006d:
            r6 = 1
        L_0x006e:
            java.lang.String r0 = X.C42631yU.A0A     // Catch:{ IllegalStateException -> 0x041d }
            if (r7 == 0) goto L_0x0097
            java.lang.String r5 = "wa_contacts INNER JOIN wa_vnames ON (wa_contacts.jid = wa_vnames.jid) LEFT JOIN wa_group_descriptions ON (wa_contacts.jid = wa_group_descriptions.jid) LEFT JOIN wa_group_admin_settings ON (wa_contacts.jid = wa_group_admin_settings.jid) LEFT JOIN wa_biz_profiles ON (wa_contacts.jid = wa_biz_profiles.jid)"
        L_0x0075:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IllegalStateException -> 0x041d }
            r1.<init>()     // Catch:{ IllegalStateException -> 0x041d }
            java.lang.String r0 = "SELECT "
            r1.append(r0)     // Catch:{ IllegalStateException -> 0x041d }
            java.lang.String r0 = X.C42641yV.A00     // Catch:{ IllegalStateException -> 0x041d }
            r1.append(r0)     // Catch:{ IllegalStateException -> 0x041d }
            java.lang.String r0 = " FROM "
            r1.append(r0)     // Catch:{ IllegalStateException -> 0x041d }
            r1.append(r5)     // Catch:{ IllegalStateException -> 0x041d }
            java.lang.String r0 = " WHERE "
            r1.append(r0)     // Catch:{ IllegalStateException -> 0x041d }
            java.lang.String r0 = "is_whatsapp_user"
            r1.append(r0)     // Catch:{ IllegalStateException -> 0x041d }
            goto L_0x009b
        L_0x0097:
            java.lang.String r5 = "wa_contacts LEFT JOIN wa_vnames ON (wa_contacts.jid = wa_vnames.jid) LEFT JOIN wa_group_descriptions ON (wa_contacts.jid = wa_group_descriptions.jid) LEFT JOIN wa_group_admin_settings ON (wa_contacts.jid = wa_group_admin_settings.jid) LEFT JOIN wa_biz_profiles ON (wa_contacts.jid = wa_biz_profiles.jid)"
            goto L_0x0075
        L_0x009b:
            if (r32 == 0) goto L_0x00a0
            java.lang.String r0 = " = 0"
            goto L_0x00a2
        L_0x00a0:
            java.lang.String r0 = " = 1"
        L_0x00a2:
            r1.append(r0)     // Catch:{ IllegalStateException -> 0x041d }
            java.lang.String r0 = r1.toString()     // Catch:{ IllegalStateException -> 0x041d }
            if (r8 == 0) goto L_0x00bc
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IllegalStateException -> 0x041d }
            r1.<init>()     // Catch:{ IllegalStateException -> 0x041d }
            r1.append(r0)     // Catch:{ IllegalStateException -> 0x041d }
            java.lang.String r0 = " AND wa_contacts.jid != ?"
            r1.append(r0)     // Catch:{ IllegalStateException -> 0x041d }
            java.lang.String r0 = r1.toString()     // Catch:{ IllegalStateException -> 0x041d }
        L_0x00bc:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IllegalStateException -> 0x041d }
            r1.<init>()     // Catch:{ IllegalStateException -> 0x041d }
            r1.append(r0)     // Catch:{ IllegalStateException -> 0x041d }
            java.lang.String r0 = " AND wa_contacts.jid NOT LIKE '%@lid'"
            r1.append(r0)     // Catch:{ IllegalStateException -> 0x041d }
            java.lang.String r0 = r1.toString()     // Catch:{ IllegalStateException -> 0x041d }
            if (r35 == 0) goto L_0x00e0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IllegalStateException -> 0x041d }
            r1.<init>()     // Catch:{ IllegalStateException -> 0x041d }
            r1.append(r0)     // Catch:{ IllegalStateException -> 0x041d }
            java.lang.String r0 = " AND wa_contacts.jid NOT LIKE '%@newsletter'"
            r1.append(r0)     // Catch:{ IllegalStateException -> 0x041d }
            java.lang.String r0 = r1.toString()     // Catch:{ IllegalStateException -> 0x041d }
        L_0x00e0:
            if (r9 == 0) goto L_0x013d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IllegalStateException -> 0x041d }
            r1.<init>()     // Catch:{ IllegalStateException -> 0x041d }
            r1.append(r0)     // Catch:{ IllegalStateException -> 0x041d }
            java.lang.String r0 = " AND (raw_contact_id > 0 OR raw_contact_id = -2 OR raw_contact_id = -3"
            r1.append(r0)     // Catch:{ IllegalStateException -> 0x041d }
            java.lang.String r0 = r1.toString()     // Catch:{ IllegalStateException -> 0x041d }
            if (r6 == 0) goto L_0x0106
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IllegalStateException -> 0x041d }
            r1.<init>()     // Catch:{ IllegalStateException -> 0x041d }
            r1.append(r0)     // Catch:{ IllegalStateException -> 0x041d }
            java.lang.String r0 = " OR wa_contacts.jid LIKE '%@g.us'"
            r1.append(r0)     // Catch:{ IllegalStateException -> 0x041d }
            java.lang.String r0 = r1.toString()     // Catch:{ IllegalStateException -> 0x041d }
        L_0x0106:
            if (r13 == 0) goto L_0x0119
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IllegalStateException -> 0x041d }
            r1.<init>()     // Catch:{ IllegalStateException -> 0x041d }
            r1.append(r0)     // Catch:{ IllegalStateException -> 0x041d }
            java.lang.String r0 = " OR raw_contact_id = -5"
            r1.append(r0)     // Catch:{ IllegalStateException -> 0x041d }
            java.lang.String r0 = r1.toString()     // Catch:{ IllegalStateException -> 0x041d }
        L_0x0119:
            if (r7 == 0) goto L_0x012c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IllegalStateException -> 0x041d }
            r1.<init>()     // Catch:{ IllegalStateException -> 0x041d }
            r1.append(r0)     // Catch:{ IllegalStateException -> 0x041d }
            java.lang.String r0 = " AND verified_level != -1 AND verified_level != 0"
            r1.append(r0)     // Catch:{ IllegalStateException -> 0x041d }
            java.lang.String r0 = r1.toString()     // Catch:{ IllegalStateException -> 0x041d }
        L_0x012c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IllegalStateException -> 0x041d }
            r1.<init>()     // Catch:{ IllegalStateException -> 0x041d }
            r1.append(r0)     // Catch:{ IllegalStateException -> 0x041d }
            java.lang.String r0 = ")"
            r1.append(r0)     // Catch:{ IllegalStateException -> 0x041d }
            java.lang.String r0 = r1.toString()     // Catch:{ IllegalStateException -> 0x041d }
        L_0x013d:
            if (r33 == 0) goto L_0x0150
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IllegalStateException -> 0x041d }
            r1.<init>()     // Catch:{ IllegalStateException -> 0x041d }
            r1.append(r0)     // Catch:{ IllegalStateException -> 0x041d }
            java.lang.String r0 = " AND is_starred = 1"
            r1.append(r0)     // Catch:{ IllegalStateException -> 0x041d }
            java.lang.String r0 = r1.toString()     // Catch:{ IllegalStateException -> 0x041d }
        L_0x0150:
            if (r36 == 0) goto L_0x0163
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IllegalStateException -> 0x041d }
            r1.<init>()     // Catch:{ IllegalStateException -> 0x041d }
            r1.append(r0)     // Catch:{ IllegalStateException -> 0x041d }
            java.lang.String r0 = " AND (phone_label is not null OR display_name is not null OR number is not null OR given_name is not null OR family_name is not null OR wa_name is not null OR sort_name is not null OR nickname is not null OR company is not null OR title is not null) "
            r1.append(r0)     // Catch:{ IllegalStateException -> 0x041d }
            java.lang.String r0 = r1.toString()     // Catch:{ IllegalStateException -> 0x041d }
        L_0x0163:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IllegalStateException -> 0x041d }
            r1.<init>()     // Catch:{ IllegalStateException -> 0x041d }
            r1.append(r0)     // Catch:{ IllegalStateException -> 0x041d }
            java.lang.String r0 = " ORDER BY display_name, wa_contacts.jid, phone_type ASC"
            r1.append(r0)     // Catch:{ IllegalStateException -> 0x041d }
            java.lang.String r5 = r1.toString()     // Catch:{ IllegalStateException -> 0x041d }
            java.lang.String r1 = "CONTACT_PICKER_LIST"
            r0 = r24
            android.database.Cursor r12 = X.C24861Ly.A03(r0, r5, r1, r2)     // Catch:{ IllegalStateException -> 0x041d }
            r7 = 0
        L_0x017d:
            boolean r0 = r12.moveToNext()     // Catch:{ all -> 0x040f }
            if (r0 == 0) goto L_0x040b
            int r7 = r7 + 1
            X.0vb r0 = r4.A00     // Catch:{ all -> 0x040f }
            X.1E7 r6 = X.C42651yW.A02(r12, r0)     // Catch:{ all -> 0x040f }
            X.1BI r1 = r6.A0J     // Catch:{ all -> 0x040f }
            if (r1 == 0) goto L_0x017d
            boolean r0 = X.C22971Dz.A0a(r1)     // Catch:{ all -> 0x040f }
            if (r0 != 0) goto L_0x017d
            boolean r0 = X.C22971Dz.A0c(r1)     // Catch:{ all -> 0x040f }
            if (r0 != 0) goto L_0x017d
            boolean r0 = X.C22971Dz.A0b(r1)     // Catch:{ all -> 0x040f }
            if (r0 != 0) goto L_0x017d
            boolean r0 = X.C42701yb.A01(r1)     // Catch:{ all -> 0x040f }
            if (r0 != 0) goto L_0x017d
            if (r3 != r15) goto L_0x01b0
            boolean r0 = X.C22971Dz.A0O(r1)     // Catch:{ all -> 0x040f }
            if (r0 == 0) goto L_0x01b0
            goto L_0x017d
        L_0x01b0:
            X.1BI r0 = r6.A0J     // Catch:{ all -> 0x040f }
            boolean r0 = r11.containsKey(r0)     // Catch:{ all -> 0x040f }
            if (r0 == 0) goto L_0x03f6
            java.lang.Object r5 = r11.get(r1)     // Catch:{ all -> 0x040f }
            java.util.List r5 = (java.util.List) r5     // Catch:{ all -> 0x040f }
            X.C17960vV.A07(r5)     // Catch:{ all -> 0x040f }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x040f }
            r2.<init>()     // Catch:{ all -> 0x040f }
            X.2lf r0 = r6.A0H     // Catch:{ all -> 0x040f }
            java.lang.String r13 = "ContactManagerDatabase/process-contact/removing duplicate contact with null key "
            r22 = 1
            r21 = 0
            if (r0 != 0) goto L_0x0209
            boolean r0 = r5.isEmpty()     // Catch:{ all -> 0x040f }
            if (r0 != 0) goto L_0x0403
            java.lang.Object r14 = r5.get(r10)     // Catch:{ all -> 0x040f }
            X.1E7 r14 = (X.AnonymousClass1E7) r14     // Catch:{ all -> 0x040f }
            X.2lf r0 = r14.A0H     // Catch:{ all -> 0x040f }
            if (r0 != 0) goto L_0x01f2
            long r8 = r14.A0D     // Catch:{ all -> 0x040f }
            long r0 = r6.A0D     // Catch:{ all -> 0x040f }
            int r18 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r18 >= 0) goto L_0x0204
            r5.remove(r14)     // Catch:{ all -> 0x040f }
            r2.add(r14)     // Catch:{ all -> 0x040f }
            r5.add(r6)     // Catch:{ all -> 0x040f }
            goto L_0x0207
        L_0x01f2:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x040f }
            r0.<init>()     // Catch:{ all -> 0x040f }
            r0.append(r13)     // Catch:{ all -> 0x040f }
            r0.append(r6)     // Catch:{ all -> 0x040f }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x040f }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x040f }
        L_0x0204:
            r2.add(r6)     // Catch:{ all -> 0x040f }
        L_0x0207:
            r21 = 1
        L_0x0209:
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x040f }
            r8.<init>()     // Catch:{ all -> 0x040f }
            if (r21 != 0) goto L_0x03a5
            java.util.Iterator r9 = r5.iterator()     // Catch:{ all -> 0x040f }
        L_0x0214:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x040f }
            if (r0 == 0) goto L_0x0241
            java.lang.Object r1 = r9.next()     // Catch:{ all -> 0x040f }
            X.1E7 r1 = (X.AnonymousClass1E7) r1     // Catch:{ all -> 0x040f }
            X.2lf r0 = r1.A0H     // Catch:{ all -> 0x040f }
            if (r0 != 0) goto L_0x0214
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x040f }
            r0.<init>()     // Catch:{ all -> 0x040f }
            r0.append(r13)     // Catch:{ all -> 0x040f }
            r0.append(r1)     // Catch:{ all -> 0x040f }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x040f }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x040f }
            r8.add(r1)     // Catch:{ all -> 0x040f }
            r2.add(r1)     // Catch:{ all -> 0x040f }
            r5.add(r6)     // Catch:{ all -> 0x040f }
            goto L_0x03a3
        L_0x0241:
            r9 = 5868(0x16ec, float:8.223E-42)
            r1 = r28
            r0 = r23
            boolean r13 = X.C18020vd.A05(r0, r1, r9)     // Catch:{ all -> 0x040f }
            java.util.Iterator r9 = r5.iterator()     // Catch:{ all -> 0x040f }
        L_0x024f:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x040f }
            if (r0 == 0) goto L_0x0271
            java.lang.Object r0 = r9.next()     // Catch:{ all -> 0x040f }
            X.1E7 r0 = (X.AnonymousClass1E7) r0     // Catch:{ all -> 0x040f }
            X.2lf r1 = r6.A0H     // Catch:{ all -> 0x040f }
            X.2lf r0 = r0.A0H     // Catch:{ all -> 0x040f }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x040f }
            if (r0 == 0) goto L_0x024f
            if (r13 == 0) goto L_0x038c
            X.2lf r0 = r6.A0H     // Catch:{ all -> 0x040f }
            long r0 = r0.A00     // Catch:{ all -> 0x040f }
            r13 = -5
            int r9 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r9 != 0) goto L_0x038c
        L_0x0271:
            java.util.Iterator r14 = r5.iterator()     // Catch:{ all -> 0x040f }
        L_0x0275:
            boolean r0 = r14.hasNext()     // Catch:{ all -> 0x040f }
            if (r0 == 0) goto L_0x02b3
            java.lang.Object r9 = r14.next()     // Catch:{ all -> 0x040f }
            X.1E7 r9 = (X.AnonymousClass1E7) r9     // Catch:{ all -> 0x040f }
            X.2lf r0 = r6.A0H     // Catch:{ all -> 0x040f }
            long r0 = r0.A00     // Catch:{ all -> 0x040f }
            r18 = -2
            int r13 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r13 == 0) goto L_0x0275
            X.2lf r0 = r9.A0H     // Catch:{ all -> 0x040f }
            X.C17960vV.A07(r0)     // Catch:{ all -> 0x040f }
            long r0 = r0.A00     // Catch:{ all -> 0x040f }
            int r13 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r13 != 0) goto L_0x0275
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x040f }
            r1.<init>()     // Catch:{ all -> 0x040f }
            java.lang.String r0 = "ContactManagerDatabase/process-contact/removing sim card duplicate contact "
            r1.append(r0)     // Catch:{ all -> 0x040f }
            r1.append(r9)     // Catch:{ all -> 0x040f }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x040f }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x040f }
            r8.add(r9)     // Catch:{ all -> 0x040f }
            r2.add(r9)     // Catch:{ all -> 0x040f }
            r21 = 1
            goto L_0x0275
        L_0x02b3:
            if (r21 != 0) goto L_0x0388
            java.util.Iterator r13 = r5.iterator()     // Catch:{ all -> 0x040f }
        L_0x02b9:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x040f }
            if (r0 == 0) goto L_0x02ff
            java.lang.Object r9 = r13.next()     // Catch:{ all -> 0x040f }
            X.1E7 r9 = (X.AnonymousClass1E7) r9     // Catch:{ all -> 0x040f }
            java.lang.String r0 = r9.A0K()     // Catch:{ all -> 0x040f }
            if (r0 != 0) goto L_0x02d1
            java.lang.String r0 = r6.A0K()     // Catch:{ all -> 0x040f }
            if (r0 != 0) goto L_0x02e5
        L_0x02d1:
            java.lang.String r0 = r9.A0K()     // Catch:{ all -> 0x040f }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x040f }
            if (r0 == 0) goto L_0x02b9
            java.lang.String r0 = r6.A0K()     // Catch:{ all -> 0x040f }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x040f }
            if (r0 != 0) goto L_0x02b9
        L_0x02e5:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x040f }
            r1.<init>()     // Catch:{ all -> 0x040f }
            java.lang.String r0 = "ContactManagerDatabase/process-contact/deduping null/empty display name contact "
            r1.append(r0)     // Catch:{ all -> 0x040f }
            r1.append(r9)     // Catch:{ all -> 0x040f }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x040f }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x040f }
            r8.add(r9)     // Catch:{ all -> 0x040f }
            r21 = 1
            goto L_0x02b9
        L_0x02ff:
            if (r21 != 0) goto L_0x0388
            java.lang.String r0 = r6.A0K()     // Catch:{ all -> 0x040f }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x040f }
            if (r0 == 0) goto L_0x032b
            java.util.Iterator r1 = r5.iterator()     // Catch:{ all -> 0x040f }
        L_0x030f:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x040f }
            if (r0 == 0) goto L_0x032b
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x040f }
            X.1E7 r0 = (X.AnonymousClass1E7) r0     // Catch:{ all -> 0x040f }
            java.lang.String r0 = r0.A0K()     // Catch:{ all -> 0x040f }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x040f }
            if (r0 != 0) goto L_0x030f
            java.lang.String r0 = "ContactManagerDatabase/process-contact/ignoring empty name since we have non-empty one"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x040f }
            goto L_0x03a3
        L_0x032b:
            java.util.Iterator r20 = r5.iterator()     // Catch:{ all -> 0x040f }
        L_0x032f:
            boolean r0 = r20.hasNext()     // Catch:{ all -> 0x040f }
            if (r0 == 0) goto L_0x0361
            java.lang.Object r9 = r20.next()     // Catch:{ all -> 0x040f }
            X.1E7 r9 = (X.AnonymousClass1E7) r9     // Catch:{ all -> 0x040f }
            java.lang.String r0 = r9.A0K()     // Catch:{ all -> 0x040f }
            if (r0 == 0) goto L_0x032f
            java.lang.String r1 = r9.A0K()     // Catch:{ all -> 0x040f }
            java.lang.String r0 = r6.A0K()     // Catch:{ all -> 0x040f }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x040f }
            if (r0 == 0) goto L_0x032f
            long r18 = r6.A0J()     // Catch:{ all -> 0x040f }
            long r13 = r9.A0J()     // Catch:{ all -> 0x040f }
            int r0 = (r18 > r13 ? 1 : (r18 == r13 ? 0 : -1))
            if (r0 >= 0) goto L_0x032f
            r8.add(r9)     // Catch:{ all -> 0x040f }
            r21 = 1
            goto L_0x032f
        L_0x0361:
            if (r21 != 0) goto L_0x0388
            java.lang.String r0 = r6.A0K()     // Catch:{ all -> 0x040f }
            if (r0 == 0) goto L_0x03a5
            java.util.Iterator r9 = r5.iterator()     // Catch:{ all -> 0x040f }
        L_0x036d:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x040f }
            if (r0 == 0) goto L_0x03a8
            java.lang.Object r0 = r9.next()     // Catch:{ all -> 0x040f }
            X.1E7 r0 = (X.AnonymousClass1E7) r0     // Catch:{ all -> 0x040f }
            java.lang.String r1 = r6.A0K()     // Catch:{ all -> 0x040f }
            java.lang.String r0 = r0.A0K()     // Catch:{ all -> 0x040f }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x040f }
            if (r0 == 0) goto L_0x036d
            goto L_0x03a5
        L_0x0388:
            r5.add(r6)     // Catch:{ all -> 0x040f }
            goto L_0x03a5
        L_0x038c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x040f }
            r1.<init>()     // Catch:{ all -> 0x040f }
            java.lang.String r0 = "ContactManagerDatabase/process-contact/removing duplicate contact with matching key "
            r1.append(r0)     // Catch:{ all -> 0x040f }
            r1.append(r6)     // Catch:{ all -> 0x040f }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x040f }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x040f }
            r2.add(r6)     // Catch:{ all -> 0x040f }
        L_0x03a3:
            r21 = 1
        L_0x03a5:
            r22 = r21
            goto L_0x03ab
        L_0x03a8:
            r5.add(r6)     // Catch:{ all -> 0x040f }
        L_0x03ab:
            r5.removeAll(r8)     // Catch:{ all -> 0x040f }
            if (r22 != 0) goto L_0x03ef
            java.lang.String r0 = "existing_contacts: "
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x040f }
            r8.<init>(r0)     // Catch:{ all -> 0x040f }
            java.util.Iterator r1 = r5.iterator()     // Catch:{ all -> 0x040f }
        L_0x03bb:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x040f }
            if (r0 == 0) goto L_0x03ce
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x040f }
            r8.append(r0)     // Catch:{ all -> 0x040f }
            java.lang.String r0 = ", "
            r8.append(r0)     // Catch:{ all -> 0x040f }
            goto L_0x03bb
        L_0x03ce:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x040f }
            r1.<init>()     // Catch:{ all -> 0x040f }
            java.lang.String r0 = "ContactManagerDatabase/process-contact/contacts are identical, yet not ("
            r1.append(r0)     // Catch:{ all -> 0x040f }
            r1.append(r8)     // Catch:{ all -> 0x040f }
            java.lang.String r0 = " and "
            r1.append(r0)     // Catch:{ all -> 0x040f }
            r1.append(r6)     // Catch:{ all -> 0x040f }
            r0 = 41
            r1.append(r0)     // Catch:{ all -> 0x040f }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x040f }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x040f }
        L_0x03ef:
            r0 = r25
            r0.addAll(r2)     // Catch:{ all -> 0x040f }
            goto L_0x017d
        L_0x03f6:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x040f }
            r0.<init>()     // Catch:{ all -> 0x040f }
            r0.add(r6)     // Catch:{ all -> 0x040f }
            r11.put(r1, r0)     // Catch:{ all -> 0x040f }
            goto L_0x017d
        L_0x0403:
            java.lang.String r1 = "same jid contacts must not be empty"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x040f }
            r0.<init>(r1)     // Catch:{ all -> 0x040f }
            throw r0     // Catch:{ all -> 0x040f }
        L_0x040b:
            r12.close()     // Catch:{ IllegalStateException -> 0x041b }
            goto L_0x0428
        L_0x040f:
            r1 = move-exception
            if (r12 == 0) goto L_0x041a
            r12.close()     // Catch:{ all -> 0x0416 }
            goto L_0x041a
        L_0x0416:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IllegalStateException -> 0x041b }
        L_0x041a:
            throw r1     // Catch:{ IllegalStateException -> 0x041b }
        L_0x041b:
            r2 = move-exception
            goto L_0x041f
        L_0x041d:
            r2 = move-exception
            r7 = 0
        L_0x041f:
            java.lang.String r1 = "ContactManagerDatabase/getContactPickerList/"
            int r0 = r11.size()     // Catch:{ all -> 0x049d }
            A0G(r2, r1, r7, r0)     // Catch:{ all -> 0x049d }
        L_0x0428:
            java.util.Set r0 = r11.entrySet()     // Catch:{ all -> 0x049d }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x049d }
        L_0x0430:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x049d }
            if (r0 == 0) goto L_0x044b
            java.lang.Object r0 = r2.next()     // Catch:{ all -> 0x049d }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x049d }
            java.lang.Object r1 = r0.getValue()     // Catch:{ all -> 0x049d }
            java.util.Collection r1 = (java.util.Collection) r1     // Catch:{ all -> 0x049d }
            r0 = r30
            r0.addAll(r1)     // Catch:{ all -> 0x049d }
            r2.remove()     // Catch:{ all -> 0x049d }
            goto L_0x0430
        L_0x044b:
            X.1Lz r1 = r4.A07     // Catch:{ all -> 0x049d }
            r0 = r30
            r1.A0J(r0)     // Catch:{ all -> 0x049d }
            boolean r0 = r25.isEmpty()     // Catch:{ all -> 0x049d }
            if (r0 != 0) goto L_0x0499
            X.1au r3 = r29.A06()     // Catch:{ all -> 0x049d }
            if (r34 == 0) goto L_0x0463
            X.1xA r2 = r3.BD1()     // Catch:{ all -> 0x048f }
            goto L_0x0467
        L_0x0463:
            X.1xA r2 = r3.BD0()     // Catch:{ all -> 0x048f }
        L_0x0467:
            java.util.Iterator r1 = r25.iterator()     // Catch:{ all -> 0x0485 }
        L_0x046b:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0485 }
            if (r0 == 0) goto L_0x047b
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0485 }
            X.1E7 r0 = (X.AnonymousClass1E7) r0     // Catch:{ all -> 0x0485 }
            A0D(r2, r0, r3)     // Catch:{ all -> 0x0485 }
            goto L_0x046b
        L_0x047b:
            r2.A00()     // Catch:{ all -> 0x0485 }
            r2.close()     // Catch:{ all -> 0x048f }
            r3.close()     // Catch:{ all -> 0x049d }
            goto L_0x0499
        L_0x0485:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x048a }
            goto L_0x048e
        L_0x048a:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x048f }
        L_0x048e:
            throw r1     // Catch:{ all -> 0x048f }
        L_0x048f:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0494 }
            goto L_0x0498
        L_0x0494:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x049d }
        L_0x0498:
            throw r1     // Catch:{ all -> 0x049d }
        L_0x0499:
            r24.close()     // Catch:{ IllegalArgumentException -> 0x04a7 }
            goto L_0x04ad
        L_0x049d:
            r1 = move-exception
            r24.close()     // Catch:{ all -> 0x04a2 }
            goto L_0x04a6
        L_0x04a2:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IllegalArgumentException -> 0x04a7 }
        L_0x04a6:
            throw r1     // Catch:{ IllegalArgumentException -> 0x04a7 }
        L_0x04a7:
            r1 = move-exception
            java.lang.String r0 = "ContactManagerDatabase/unable to apply contact picker list de-dupe batch "
            X.C17960vV.A09(r0, r1)     // Catch:{ all -> 0x04c1 }
        L_0x04ad:
            X.1LY r3 = r4.A0B
            long r1 = android.os.SystemClock.uptimeMillis()
            long r1 = r1 - r16
            r0 = r27
            r3.A01(r0, r1)
            r30.size()
            r26.A01()
            return
        L_0x04c1:
            r5 = move-exception
            X.1LY r3 = r4.A0B
            long r1 = android.os.SystemClock.uptimeMillis()
            long r1 = r1 - r16
            r0 = r27
            r3.A01(r0, r1)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1M2.A0C(X.1M2, java.util.List, int, boolean, boolean, boolean, boolean, boolean):void");
    }

    private void A0F(AnonymousClass1E7 r25, AnonymousClass1E9 r26) {
        C41851xA BD0;
        AnonymousClass1E9 r1 = r26;
        if (r26 != null) {
            try {
                C28791au A062 = this.A00.A06();
                try {
                    BD0 = A062.BD0();
                    AnonymousClass1E7 r4 = r25;
                    A0E(BD0, A062, r1, r4.A0M);
                    boolean z = r4.A13;
                    boolean z2 = r4.A0f;
                    boolean z3 = r4.A11;
                    int i = r4.A04;
                    UserJid userJid = r4.A0K;
                    boolean z4 = r4.A0j;
                    boolean z5 = r4.A0t;
                    boolean z6 = r4.A12;
                    int i2 = r4.A06;
                    boolean z7 = r4.A0k;
                    int i3 = r4.A05;
                    boolean z8 = r4.A0v;
                    String str = r4.A0O;
                    boolean z9 = r4.A0r;
                    boolean z10 = r4.A0e;
                    boolean z11 = r4.A0w;
                    boolean z12 = r4.A0i;
                    boolean z13 = r4.A0n;
                    int i4 = r4.A03;
                    if (!C22971Dz.A0c(r1)) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("jid", r1.getRawString());
                        contentValues.put("restrict_mode", Boolean.valueOf(z));
                        contentValues.put("announcement_group", Boolean.valueOf(z2));
                        contentValues.put("no_frequently_forwarded", Boolean.valueOf(z3));
                        contentValues.put("ephemeral_duration", Integer.valueOf(i));
                        contentValues.put("creator_jid", C22971Dz.A06(userJid));
                        contentValues.put("in_app_support", Boolean.valueOf(z4));
                        contentValues.put("is_suspended", Boolean.valueOf(z5));
                        contentValues.put("require_membership_approval", Boolean.valueOf(z6));
                        contentValues.put("member_add_mode", Integer.valueOf(i2));
                        contentValues.put("incognito", Boolean.valueOf(z7));
                        contentValues.put("group_state", Integer.valueOf(i3));
                        contentValues.put("is_pending_requests_banner_acknowledged", Boolean.valueOf(z8));
                        contentValues.put("addressing_mode", str);
                        contentValues.put("is_report_to_admin_enabled", Boolean.valueOf(z9));
                        contentValues.put("allow_non_admin_subgroup_creation", Boolean.valueOf(z10));
                        contentValues.put("is_pending_suggestions_banner_acknowledged", Boolean.valueOf(z11));
                        contentValues.put("history_enabled", Boolean.valueOf(z12));
                        contentValues.put("is_hidden_subgroup", Boolean.valueOf(z13));
                        contentValues.put("e2ee_state", Integer.valueOf(i4));
                        C24861Ly.A05(contentValues, A062, "wa_group_admin_settings");
                    }
                    BD0.A00();
                    BD0.close();
                    A062.close();
                    return;
                } catch (Throwable th) {
                    A062.close();
                    throw th;
                }
            } catch (IllegalArgumentException e) {
                C17960vV.A09("ContactManagerDatabase/unable to update group settings ", e);
                return;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
            }
        } else {
            return;
        }
        throw th;
    }

    public int A0I() {
        int i;
        Cursor A032;
        Integer num;
        synchronized (this.A0A) {
            i = -1;
            if (this.A02 == null) {
                AnonymousClass11S r0 = this.A03;
                r0.A0I();
                PhoneUserJid phoneUserJid = r0.A0E;
                if (phoneUserJid != null) {
                    AnonymousClass1Ez r6 = new AnonymousClass1Ez(true);
                    r6.A04();
                    C28781at A052 = this.A00.get();
                    try {
                        A032 = C24861Ly.A03(A052, "SELECT count(*) AS _count FROM wa_contacts LEFT JOIN wa_vnames ON (wa_contacts.jid = wa_vnames.jid) LEFT JOIN wa_group_descriptions ON (wa_contacts.jid = wa_group_descriptions.jid) LEFT JOIN wa_group_admin_settings ON (wa_contacts.jid = wa_group_admin_settings.jid) LEFT JOIN wa_biz_profiles ON (wa_contacts.jid = wa_biz_profiles.jid) WHERE is_whatsapp_user = 1 AND raw_contact_id NOT NULL AND raw_contact_id != -1 AND wa_contacts.jid != ?", "initIndividualContactCount", new String[]{phoneUserJid.getRawString()});
                        if (A032.moveToNext()) {
                            int i2 = A032.getInt(A032.getColumnIndexOrThrow("_count"));
                            r6.A01();
                            num = Integer.valueOf(i2);
                        } else {
                            Log.w("ContactManagerDatabase/initIndividualContactCount missing cursor");
                            num = null;
                        }
                        this.A02 = num;
                        A032.close();
                        A052.close();
                    } catch (Throwable th) {
                        try {
                            A052.close();
                        } catch (Throwable th2) {
                            AnonymousClass0DT.A00(th, th2);
                        }
                        throw th;
                    }
                }
            }
            Integer num2 = this.A02;
            if (num2 != null) {
                i = num2.intValue();
            }
        }
        return i;
        throw th;
    }

    public void A0S(AnonymousClass1E7 r9) {
        C41851xA BD0;
        long j;
        try {
            C28791au A062 = this.A00.A06();
            try {
                BD0 = A062.BD0();
                ContentValues contentValues = new ContentValues(10);
                contentValues.put("given_name", r9.A0T);
                contentValues.put("family_name", r9.A0S);
                contentValues.put("display_name", r9.A0K());
                contentValues.put("is_whatsapp_user", true);
                contentValues.put("wa_name", r9.A0c);
                contentValues.put("sync_policy", Integer.valueOf(r9.A09));
                C59042lf r0 = r9.A0H;
                if (r0 == null) {
                    j = 0;
                } else {
                    j = r0.A00;
                }
                contentValues.put("raw_contact_id", Long.valueOf(j));
                contentValues.put("number", r9.A0H.A01);
                contentValues.put("is_contact_synced", Integer.valueOf(r9.A01));
                C24861Ly.A01(contentValues, A062, "wa_contacts", "_id = ?", new String[]{String.valueOf(r9.A0J())});
                BD0.A00();
                BD0.close();
                A062.close();
            } catch (Throwable th) {
                A062.close();
                throw th;
            }
        } catch (IllegalArgumentException e) {
            C17960vV.A09("ContactManagerDatabase/unable to update contact", e);
        } catch (Throwable th2) {
            AnonymousClass0DT.A00(th, th2);
        }
        AnonymousClass35V.A00((C47812Kb) this.A09.get(), Collections.singletonList(r9), 5);
        return;
        throw th;
    }

    public void A0W(List list, int i) {
        C41851xA BD0;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass1BI r0 = ((AnonymousClass1E7) it.next()).A0J;
            if (r0 != null) {
                arrayList.add(r0.getRawString());
            }
        }
        try {
            C28791au A062 = this.A00.A06();
            try {
                BD0 = A062.BD0();
                for (int i2 = 0; i2 < arrayList.size(); i2 += 975) {
                    List subList = arrayList.subList(i2, Math.min(i2 + 975, arrayList.size()));
                    ContentValues contentValues = new ContentValues(1);
                    contentValues.put("is_contact_synced", Integer.valueOf(i));
                    StringBuilder sb = new StringBuilder();
                    sb.append("jid IN ");
                    sb.append(AnonymousClass1H2.A00(subList.size()));
                    sb.append(" AND ");
                    sb.append("is_contact_synced");
                    sb.append(" != ");
                    sb.append(2);
                    C24861Ly.A01(contentValues, A062, "wa_contacts", sb.toString(), (String[]) subList.toArray(new String[subList.size()]));
                }
                BD0.A00();
                BD0.close();
                A062.close();
                AnonymousClass35V.A00((C47812Kb) this.A09.get(), list, 5);
                return;
            } catch (Throwable th) {
                A062.close();
                throw th;
            }
            throw th;
        } catch (IllegalArgumentException e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ContactManagerDatabase/unable to mark the contacts as dirty ");
            sb2.append(list);
            C17960vV.A09(sb2.toString(), e);
        } catch (Throwable th2) {
            AnonymousClass0DT.A00(th, th2);
        }
    }

    public void Bpx(AnonymousClass1E7 r5) {
        synchronized (this.A0A) {
            Integer num = this.A02;
            if (num != null) {
                Integer valueOf = Integer.valueOf(num.intValue() - 1);
                this.A02 = valueOf;
                StringBuilder sb = new StringBuilder();
                sb.append("ContactManagerDatabase/onContactUnlinkedFromPhonebook individualContactCount = ");
                sb.append(valueOf);
                Log.i(sb.toString());
            }
        }
    }

    public void Bq0(Collection collection) {
        synchronized (this.A0A) {
            Integer num = this.A02;
            if (num != null) {
                this.A02 = Integer.valueOf(num.intValue() + A04(collection));
            }
        }
    }

    public void Bq3(Collection collection) {
        synchronized (this.A0A) {
            int A042 = A04(collection);
            Integer num = this.A02;
            if (num != null) {
                Integer valueOf = Integer.valueOf(num.intValue() - A042);
                this.A02 = valueOf;
                StringBuilder sb = new StringBuilder();
                sb.append("ContactManagerDatabase/onContactsRemoved individualContactCount = ");
                sb.append(valueOf);
                Log.i(sb.toString());
            }
        }
    }

    public AnonymousClass1M2(AnonymousClass11S r2, C24851Lx r3, AnonymousClass11P r4, AnonymousClass1LY r5, C18030ve r6, C24871Lz r7, AnonymousClass10I r8, C24811Lt r9, AnonymousClass00H r10) {
        super(r9);
        this.A05 = r4;
        this.A06 = r6;
        this.A03 = r2;
        this.A08 = r8;
        this.A0B = r5;
        this.A04 = r3;
        this.A07 = r7;
        this.A09 = r10;
    }

    private int A04(Collection collection) {
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            AnonymousClass1E7 r2 = (AnonymousClass1E7) it.next();
            if (r2 != null && r2.A10 && r2.A0H != null && !this.A03.A0O(r2.A0J)) {
                i++;
            }
        }
        return i;
    }

    public static long A06(ContentValues contentValues, AnonymousClass1M2 r3, C28791au r4, Jid jid) {
        if (C22971Dz.A0d(jid)) {
            jid = r3.A04.A00((UserJid) jid);
        }
        contentValues.put("jid", jid.getRawString());
        return C24861Ly.A00(contentValues, r4, "wa_contacts");
    }

    public static void A0D(C41851xA r7, AnonymousClass1E7 r8, C28791au r9) {
        C17960vV.A0D(r7.A01());
        AnonymousClass1BI r5 = r8.A0J;
        String A062 = C22971Dz.A06(r5);
        C24861Ly.A02(r9, "wa_contacts", "_id = ?", new String[]{String.valueOf(r8.A0J())});
        C24861Ly.A02(r9, "wa_contact_storage_usage", "jid = ? AND NOT EXISTS (SELECT 1 FROM wa_contacts WHERE jid = ?)", new String[]{A062, A062});
        if (r5 instanceof AnonymousClass1EC) {
            A0E(r7, r9, (AnonymousClass1E9) r5, (C42661yX) null);
        }
        C24861Ly.A02(r9, "wa_group_admin_settings", "jid = ?", new String[]{A062});
    }

    public static void A0E(C41851xA r6, C28791au r7, AnonymousClass1E9 r8, C42661yX r9) {
        String str;
        String str2;
        C17960vV.A0D(r6.A01());
        if (r8 != null && !C22971Dz.A0O(r8) && !C22971Dz.A0c(r8)) {
            String rawString = r8.getRawString();
            C17960vV.A07(rawString);
            if (r9 == null || (str = r9.A04) == null) {
                C24861Ly.A02(r7, "wa_group_descriptions", "jid = ?", new String[]{rawString});
                return;
            }
            String str3 = r9.A03;
            if (str3 != null) {
                C24861Ly.A02(r7, "wa_group_descriptions", "jid = ?", new String[]{rawString});
                ContentValues contentValues = new ContentValues(5);
                contentValues.put("jid", rawString);
                contentValues.put("description", str3);
                contentValues.put("description_id_string", str);
                contentValues.put("description_time", Long.valueOf(r9.A00));
                UserJid userJid = r9.A02;
                if (userJid != null) {
                    str2 = userJid.getRawString();
                } else {
                    str2 = "";
                }
                contentValues.put("description_setter_jid", str2);
                C24861Ly.A00(contentValues, r7, "wa_group_descriptions");
            }
        }
    }

    public static void A0G(IllegalStateException illegalStateException, String str, int i, int i2) {
        if (illegalStateException.getMessage() == null || !illegalStateException.getMessage().contains("Make sure the Cursor is initialized correctly before accessing data from it")) {
            throw illegalStateException;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("illegal-state-exception/cursor count=");
        sb.append(i);
        sb.append("; partial list size=");
        sb.append(i2);
        C17960vV.A09(sb.toString(), illegalStateException);
    }
}
