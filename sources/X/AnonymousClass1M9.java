package X;

import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import android.util.Base64;
import android.util.LruCache;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

/* renamed from: X.1M9  reason: invalid class name */
public class AnonymousClass1M9 implements AnonymousClass1M1, AnonymousClass1M6, AnonymousClass1M7, AnonymousClass1M8 {
    public LruCache A00;
    public final AnonymousClass11S A01;
    public final C24761Lo A02;
    public final AnonymousClass1MA A03;
    public final AnonymousClass1M2 A04;
    public final C24671Lf A05;
    public final AnonymousClass1M3 A06;
    public final C24791Lr A07;
    public final AnonymousClass11C A08;
    public final AnonymousClass11P A09;
    public final AnonymousClass118 A0A;
    public final C19830z4 A0B;
    public final C18000vb A0C;
    public final AnonymousClass1M4 A0D;
    public final C24681Lg A0E;
    public final C24661Le A0F;
    public final C24751Ln A0G;
    public final C18030ve A0H;
    public final AnonymousClass11A A0I;
    public final AnonymousClass00H A0J;
    public final AnonymousClass00H A0K;
    public final AnonymousClass00H A0L;
    public final AnonymousClass00H A0M;
    public final AnonymousClass00H A0N;
    public final AnonymousClass00H A0O;

    public AnonymousClass1M9(AnonymousClass11S r6, C24761Lo r7, AnonymousClass1M2 r8, C24671Lf r9, AnonymousClass1M3 r10, C24851Lx r11, C24791Lr r12, AnonymousClass11C r13, AnonymousClass11P r14, AnonymousClass118 r15, C19830z4 r16, C18000vb r17, AnonymousClass1M4 r18, C24681Lg r19, C24661Le r20, C24751Ln r21, C18030ve r22, AnonymousClass11A r23, C24571Kv r24, AnonymousClass00H r25, AnonymousClass00H r26, AnonymousClass00H r27, AnonymousClass00H r28, AnonymousClass00H r29, AnonymousClass00H r30) {
        C18000vb r3 = r17;
        C18030ve r4 = r22;
        AnonymousClass1MA r0 = new AnonymousClass1MA(r11, r4, r24, new C18150vq((Object) null, new C70953Dd(r15, r3, 0)));
        this.A09 = r14;
        this.A0H = r4;
        this.A01 = r6;
        this.A0A = r15;
        this.A0F = r20;
        this.A03 = r0;
        this.A0J = r25;
        this.A08 = r13;
        this.A0C = r3;
        this.A0L = r26;
        this.A05 = r9;
        this.A0E = r19;
        this.A0I = r23;
        this.A0G = r21;
        this.A02 = r7;
        this.A07 = r12;
        this.A0O = r27;
        this.A0K = r28;
        this.A0B = r16;
        this.A0M = r29;
        this.A0N = r30;
        this.A04 = r8;
        this.A06 = r10;
        this.A0D = r18;
        Boolean bool = C17960vV.A01;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0014, code lost:
        if ((r5 instanceof X.AnonymousClass1E2) != false) goto L_0x0016;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x003f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A06(X.AnonymousClass1M9 r7, X.AnonymousClass1E7 r8) {
        /*
            r6 = 0
            if (r8 == 0) goto L_0x0074
            java.lang.Class<X.1E1> r0 = X.AnonymousClass1E1.class
            com.whatsapp.jid.Jid r5 = r8.A06(r0)
            X.1E1 r5 = (X.AnonymousClass1E1) r5
            if (r5 == 0) goto L_0x0074
            boolean r1 = r5 instanceof X.AnonymousClass1ED
            if (r1 != 0) goto L_0x0016
            boolean r0 = r5 instanceof X.AnonymousClass1E2
            r4 = 0
            if (r0 == 0) goto L_0x0017
        L_0x0016:
            r4 = 1
        L_0x0017:
            java.lang.String r3 = r8.A0K()
            if (r1 != 0) goto L_0x0055
            boolean r0 = r5 instanceof X.AnonymousClass1E2
            if (r0 == 0) goto L_0x003d
            X.1Ln r0 = r7.A0G
            com.whatsapp.jid.PhoneUserJid r2 = r0.A0D(r5)
            if (r2 == 0) goto L_0x0055
            X.1E7 r1 = r7.A0E(r2)
            if (r1 == 0) goto L_0x004a
            boolean r0 = r1.A0B()
            if (r0 == 0) goto L_0x004a
            java.lang.String r0 = r1.A0K()
            r8.A0R = r0
            r8.A0I = r1
        L_0x003d:
            if (r4 == 0) goto L_0x0074
            java.lang.String r0 = r8.A0K()
            boolean r0 = X.C42171xk.A00(r3, r0)
            r0 = r0 ^ 1
            return r0
        L_0x004a:
            java.lang.String r1 = r2.user
            X.1yi r0 = X.C42771yi.A00()
            java.lang.String r0 = X.AnonymousClass17K.A01(r0, r1)
            goto L_0x0067
        L_0x0055:
            X.1M4 r0 = r7.A0D
            java.lang.String r0 = r0.BMm(r5)
            if (r0 != 0) goto L_0x0067
            java.lang.String r0 = r8.A0c
            boolean r0 = X.AnonymousClass1EG.A0H(r0)
            if (r0 != 0) goto L_0x006a
            java.lang.String r0 = r8.A0c
        L_0x0067:
            r8.A0R = r0
            goto L_0x003d
        L_0x006a:
            X.118 r1 = r7.A0A
            r0 = 2131891604(0x7f121594, float:1.9417933E38)
            java.lang.String r0 = r1.A01(r0)
            goto L_0x0067
        L_0x0074:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1M9.A06(X.1M9, X.1E7):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0033  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.net.Uri A09(X.AnonymousClass1E7 r7, X.AnonymousClass11B r8) {
        /*
            r6 = this;
            r5 = 0
            if (r7 == 0) goto L_0x008e
            X.00H r0 = r6.A0K
            java.lang.Object r0 = r0.get()
            X.1dX r0 = (X.C30191dX) r0
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x008e
            X.11S r0 = r6.A01
            boolean r0 = r0.A0N()
            if (r0 != 0) goto L_0x008e
            X.2lf r0 = r7.A0H
            if (r0 == 0) goto L_0x0042
            long r1 = r0.A00
            r3 = -2
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0042
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0042
            android.net.Uri r0 = android.provider.ContactsContract.RawContacts.CONTENT_URI
            android.net.Uri r4 = android.content.ContentUris.withAppendedId(r0, r1)
        L_0x0031:
            if (r4 == 0) goto L_0x008e
            r3 = r6
            X.0ve r2 = r6.A0H
            r1 = 5914(0x171a, float:8.287E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0056
            monitor-enter(r3)
            goto L_0x0044
        L_0x0042:
            r4 = 0
            goto L_0x0031
        L_0x0044:
            android.util.LruCache r1 = r6.A00     // Catch:{ all -> 0x0053 }
            if (r1 != 0) goto L_0x0051
            r0 = 20
            android.util.LruCache r1 = new android.util.LruCache     // Catch:{ all -> 0x0053 }
            r1.<init>(r0)     // Catch:{ all -> 0x0053 }
            r6.A00 = r1     // Catch:{ all -> 0x0053 }
        L_0x0051:
            monitor-exit(r3)     // Catch:{ all -> 0x0053 }
            goto L_0x0057
        L_0x0053:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0053 }
            throw r0
        L_0x0056:
            r1 = 0
        L_0x0057:
            if (r1 == 0) goto L_0x0062
            java.lang.Object r0 = r1.get(r4)
            android.net.Uri r0 = (android.net.Uri) r0
            if (r0 == 0) goto L_0x0062
        L_0x0061:
            return r0
        L_0x0062:
            if (r8 == 0) goto L_0x008e
            android.content.ContentResolver r0 = r8.A00     // Catch:{ SecurityException -> 0x0079, NullPointerException -> 0x0072 }
            android.net.Uri r0 = android.provider.ContactsContract.RawContacts.getContactLookupUri(r0, r4)     // Catch:{ SecurityException -> 0x0079, NullPointerException -> 0x0072 }
            if (r1 == 0) goto L_0x0061
            if (r0 == 0) goto L_0x0061
            r1.put(r4, r0)     // Catch:{ SecurityException -> 0x0079, NullPointerException -> 0x0072 }
            return r0
        L_0x0072:
            r1 = move-exception
            java.lang.String r0 = "ContactManager/NPE"
            com.whatsapp.util.Log.w(r0, r1)
            return r5
        L_0x0079:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "ContactManager/permission problem:"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x008e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1M9.A09(X.1E7, X.11B):android.net.Uri");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00af, code lost:
        if (r2 == null) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        X.AnonymousClass0DT.A00(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ba, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00bb, code lost:
        r11 = r8;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:28:0x00a1, B:38:0x00b1] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x010c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x010d A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass1E7 A0J(java.lang.String r14, boolean r15) {
        /*
            r13 = this;
            r12 = 0
            if (r14 != 0) goto L_0x0004
            return r12
        L_0x0004:
            java.lang.String r0 = r14.trim()
            java.lang.String r7 = android.telephony.PhoneNumberUtils.stripSeparators(r0)
            int r0 = r7.length()
            if (r0 <= 0) goto L_0x0022
            r0 = 0
            char r0 = r7.charAt(r0)
            boolean r0 = java.lang.Character.isDigit(r0)
            if (r0 != 0) goto L_0x0022
            r0 = 1
            java.lang.String r7 = r7.substring(r0)
        L_0x0022:
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x0029
            return r12
        L_0x0029:
            X.1M2 r5 = r13.A04
            r10 = r7
            r6 = 1
            X.1Ez r4 = new X.1Ez
            r4.<init>((boolean) r6)
            r4.A04()
            int r2 = r7.length()
            r0 = 5
            if (r2 < r0) goto L_0x005a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "%"
            r1.append(r0)
            r0 = 5
            if (r2 <= r0) goto L_0x0053
            int r2 = r2 - r0
            r0 = 3
            int r0 = java.lang.Math.min(r2, r0)
            java.lang.String r10 = r7.substring(r0)
        L_0x0053:
            r1.append(r10)
            java.lang.String r10 = r1.toString()
        L_0x005a:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r3 = 0
            X.1Lt r0 = r5.A00     // Catch:{ IllegalStateException -> 0x00c7 }
            X.1at r9 = r0.get()     // Catch:{ IllegalStateException -> 0x00c7 }
            java.lang.String r8 = X.C42631yU.A05     // Catch:{ all -> 0x00bd }
            java.lang.String[] r2 = new java.lang.String[r6]     // Catch:{ all -> 0x00bd }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bd }
            r1.<init>()     // Catch:{ all -> 0x00bd }
            r1.append(r10)     // Catch:{ all -> 0x00bd }
            java.lang.String r0 = "@"
            r1.append(r0)     // Catch:{ all -> 0x00bd }
            java.lang.String r0 = "s.whatsapp.net"
            r1.append(r0)     // Catch:{ all -> 0x00bd }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00bd }
            r2[r3] = r0     // Catch:{ all -> 0x00bd }
            java.lang.String r0 = "GET_CONTACTS_BY_JID_PATTERN"
            android.database.Cursor r2 = X.C24861Ly.A03(r9, r8, r0, r2)     // Catch:{ all -> 0x00bd }
            int r3 = r2.getCount()     // Catch:{ all -> 0x00ad }
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x00ad }
            r8.<init>(r3)     // Catch:{ all -> 0x00ad }
        L_0x0091:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x00ab }
            if (r0 == 0) goto L_0x00a1
            X.0vb r0 = r5.A00     // Catch:{ all -> 0x00ab }
            X.1E7 r0 = X.C42651yW.A02(r2, r0)     // Catch:{ all -> 0x00ab }
            r8.add(r0)     // Catch:{ all -> 0x00ab }
            goto L_0x0091
        L_0x00a1:
            r2.close()     // Catch:{ all -> 0x00ba }
            r9.close()     // Catch:{ IllegalStateException -> 0x00a8 }
            goto L_0x00d2
        L_0x00a8:
            r2 = move-exception
            r11 = r8
            goto L_0x00c8
        L_0x00ab:
            r1 = move-exception
            goto L_0x00b1
        L_0x00ad:
            r1 = move-exception
            r8 = r11
            if (r2 == 0) goto L_0x00b9
        L_0x00b1:
            r2.close()     // Catch:{ all -> 0x00b5 }
            goto L_0x00b9
        L_0x00b5:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x00ba }
        L_0x00b9:
            throw r1     // Catch:{ all -> 0x00ba }
        L_0x00ba:
            r1 = move-exception
            r11 = r8
            goto L_0x00be
        L_0x00bd:
            r1 = move-exception
        L_0x00be:
            r9.close()     // Catch:{ all -> 0x00c2 }
            goto L_0x00c6
        L_0x00c2:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IllegalStateException -> 0x00c7 }
        L_0x00c6:
            throw r1     // Catch:{ IllegalStateException -> 0x00c7 }
        L_0x00c7:
            r2 = move-exception
        L_0x00c8:
            java.lang.String r1 = "ContactManagerDatabase/getContactsByPhoneNumberLoose/"
            int r0 = r11.size()     // Catch:{ all -> 0x010e }
            X.AnonymousClass1M2.A0G(r2, r1, r3, r0)     // Catch:{ all -> 0x010e }
            r8 = r11
        L_0x00d2:
            X.1Lz r0 = r5.A07
            r0.A0J(r8)
            r8.size()
            r4.A01()
            java.util.Iterator r5 = r8.iterator()
            r4 = 0
            r3 = r12
        L_0x00e3:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x010a
            java.lang.Object r2 = r5.next()
            X.1E7 r2 = (X.AnonymousClass1E7) r2
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r1 = r2.A06(r0)
            if (r1 == 0) goto L_0x00e3
            boolean r0 = r2.A10
            if (r0 != 0) goto L_0x00fd
            if (r15 != 0) goto L_0x00e3
        L_0x00fd:
            java.lang.String r0 = r1.user
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0106
            return r2
        L_0x0106:
            int r4 = r4 + 1
            r3 = r2
            goto L_0x00e3
        L_0x010a:
            if (r4 != r6) goto L_0x010d
            return r3
        L_0x010d:
            return r12
        L_0x010e:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1M9.A0J(java.lang.String, boolean):X.1E7");
    }

    public void A0T(AnonymousClass1E7 r6) {
        r6.A0x = true;
        AnonymousClass1M2 r2 = this.A04;
        AnonymousClass1Ez r4 = new AnonymousClass1Ez(true);
        r4.A04();
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("is_spam_reported", Boolean.valueOf(r6.A0x));
        AnonymousClass1M2.A0A(contentValues, r2, r6.A0J);
        StringBuilder sb = new StringBuilder();
        sb.append("ContactManagerDatabase/updateContactStatusAutodownloadDisabled for jid=");
        sb.append(r6.A0J);
        sb.append(' ');
        sb.append(contentValues);
        sb.append(" | time: ");
        sb.append(r4.A01());
        Log.i(sb.toString());
        this.A03.A0B(r6);
    }

    public void A0Y(AnonymousClass1E7 r25, AnonymousClass1BI r26, Long l, String str, String str2) {
        Cursor A032;
        AnonymousClass11C r0 = this.A08;
        long longValue = l.longValue();
        AnonymousClass11B A0O2 = r0.A0O();
        if (A0O2 == null) {
            Log.w("contact-mgr-db/deleteContact cr=null");
        } else {
            String[] strArr = {"data1"};
            String valueOf = String.valueOf(longValue);
            String[] strArr2 = {valueOf, "vnd.android.cursor.item/phone_v2"};
            try {
                Uri uri = ContactsContract.Data.CONTENT_URI;
                A032 = A0O2.A03(uri, strArr, "raw_contact_id = ? AND mimetype = ? ", strArr2, (String) null);
                if (A032 != null) {
                    if (A032.getCount() == 1) {
                        A0O2.A01(ContentUris.withAppendedId(ContactsContract.RawContacts.CONTENT_URI, longValue), (String) null, (String[]) null);
                    } else {
                        int i = 0;
                        int i2 = 0;
                        while (A032.moveToNext()) {
                            String string = A032.getString(A032.getColumnIndex("data1"));
                            String str3 = str2;
                            if (str2 == null || C63942tw.A06(string, str, str3)) {
                                A0O2.A01(uri, "raw_contact_id = ? AND mimetype = ? AND data1 = ? ", new String[]{valueOf, "vnd.android.cursor.item/phone_v2", string});
                                i2++;
                            }
                            i++;
                        }
                        if (i == i2) {
                            A0O2.A01(ContentUris.withAppendedId(ContactsContract.RawContacts.CONTENT_URI, longValue), (String) null, (String[]) null);
                        }
                    }
                    A032.close();
                    A032.close();
                }
            } catch (Exception e) {
                C17960vV.A09("contact-mgr-db/delete unable to delete contact ", e);
            } catch (Throwable th) {
                AnonymousClass0DT.A00(th, th);
            }
        }
        ((AnonymousClass10T) this.A04.A09.get()).notifyAllObservers(new AnonymousClass35V(Collections.singleton(r25), 6));
        this.A03.A0C(r26);
        return;
        throw th;
    }

    public /* synthetic */ void Bmt(UserJid userJid) {
    }

    public /* synthetic */ void Bq6() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0177, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0178, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x017b, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.AnonymousClass1M9 r11, java.lang.Boolean r12, java.util.List r13) {
        /*
            X.1M2 r8 = r11.A04
            boolean r0 = r13.isEmpty()
            if (r0 == 0) goto L_0x0049
            java.lang.String r0 = "ContactManagerDatabase/delete contacts called without any contacts"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x000d:
            boolean r0 = r12.booleanValue()
            if (r0 != 0) goto L_0x017f
            X.0ve r2 = r11.A0H
            r1 = 10624(0x2980, float:1.4887E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x017f
            X.1Lo r0 = r11.A02
            X.00H r0 = r0.A00
            java.lang.Object r2 = r0.get()
            X.1Ly r2 = (X.C24861Ly) r2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "AddressBookStore/deleteContactsFromTable "
            r1.append(r0)
            int r0 = r13.size()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1Lt r0 = r2.A00
            X.1au r5 = r0.A06()
            goto L_0x010d
        L_0x0049:
            r9 = 1
            X.1Ez r4 = new X.1Ez
            r4.<init>((boolean) r9)
            r4.A04()
            X.1Lt r7 = r8.A00     // Catch:{ IllegalArgumentException -> 0x00f6 }
            X.1au r3 = r7.A06()     // Catch:{ IllegalArgumentException -> 0x00f6 }
            X.1xA r2 = r3.BD0()     // Catch:{ all -> 0x00ec }
            java.util.Iterator r1 = r13.iterator()     // Catch:{ all -> 0x00e2 }
        L_0x0060:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x00e2 }
            if (r0 == 0) goto L_0x0070
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x00e2 }
            X.1E7 r0 = (X.AnonymousClass1E7) r0     // Catch:{ all -> 0x00e2 }
            X.AnonymousClass1M2.A0D(r2, r0, r3)     // Catch:{ all -> 0x00e2 }
            goto L_0x0060
        L_0x0070:
            r2.A00()     // Catch:{ all -> 0x00e2 }
            r1 = 29
            X.3Bv r0 = new X.3Bv     // Catch:{ all -> 0x00e2 }
            r0.<init>(r8, r13, r1)     // Catch:{ all -> 0x00e2 }
            r3.BJ7(r0)     // Catch:{ all -> 0x00e2 }
            r2.close()     // Catch:{ all -> 0x00ec }
            r3.close()     // Catch:{ IllegalArgumentException -> 0x00f6 }
            r4.A01()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r10 = r13.iterator()
        L_0x008f:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x00c8
            java.lang.Object r6 = r10.next()
            X.1E7 r6 = (X.AnonymousClass1E7) r6
            java.lang.Class<X.1BI> r0 = X.AnonymousClass1BI.class
            com.whatsapp.jid.Jid r0 = r6.A06(r0)
            if (r0 == 0) goto L_0x008f
            X.1at r4 = r7.get()
            java.lang.String r3 = "SELECT 1 FROM wa_contacts LEFT JOIN wa_vnames ON (wa_contacts.jid = wa_vnames.jid) LEFT JOIN wa_group_descriptions ON (wa_contacts.jid = wa_group_descriptions.jid) LEFT JOIN wa_group_admin_settings ON (wa_contacts.jid = wa_group_admin_settings.jid) LEFT JOIN wa_biz_profiles ON (wa_contacts.jid = wa_biz_profiles.jid) WHERE wa_contacts.jid = ?"
            java.lang.String[] r2 = new java.lang.String[r9]     // Catch:{ all -> 0x018c }
            java.lang.String r1 = r0.getRawString()     // Catch:{ all -> 0x018c }
            r0 = 0
            r2[r0] = r1     // Catch:{ all -> 0x018c }
            java.lang.String r0 = "HAS_CONTACT_FOR_JID"
            android.database.Cursor r2 = X.C24861Ly.A03(r4, r3, r0, r2)     // Catch:{ all -> 0x018c }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0180 }
            r2.close()     // Catch:{ all -> 0x018c }
            r4.close()
            if (r0 != 0) goto L_0x008f
            r5.add(r6)
            goto L_0x008f
        L_0x00c8:
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x000d
            X.00H r0 = r8.A09
            java.lang.Object r2 = r0.get()
            X.10T r2 = (X.AnonymousClass10T) r2
            r1 = 8
            X.35V r0 = new X.35V
            r0.<init>(r5, r1)
            r2.notifyAllObservers(r0)
            goto L_0x000d
        L_0x00e2:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x00e7 }
            goto L_0x00eb
        L_0x00e7:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x00ec }
        L_0x00eb:
            throw r1     // Catch:{ all -> 0x00ec }
        L_0x00ec:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x00f1 }
            goto L_0x00f5
        L_0x00f1:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IllegalArgumentException -> 0x00f6 }
        L_0x00f5:
            throw r1     // Catch:{ IllegalArgumentException -> 0x00f6 }
        L_0x00f6:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "ContactManagerDatabase/unable to delete contacts "
            r1.append(r0)
            r1.append(r13)
            java.lang.String r0 = r1.toString()
            X.C17960vV.A09(r0, r2)
            goto L_0x000d
        L_0x010d:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0175 }
            r3.<init>()     // Catch:{ all -> 0x0175 }
            java.util.Iterator r2 = r13.iterator()     // Catch:{ all -> 0x0175 }
        L_0x0116:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0175 }
            if (r0 == 0) goto L_0x012d
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x0175 }
            r0 = r1
            X.1E7 r0 = (X.AnonymousClass1E7) r0     // Catch:{ all -> 0x0175 }
            boolean r0 = r0.A0B()     // Catch:{ all -> 0x0175 }
            if (r0 == 0) goto L_0x0116
            r3.add(r1)     // Catch:{ all -> 0x0175 }
            goto L_0x0116
        L_0x012d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0175 }
            r1.<init>()     // Catch:{ all -> 0x0175 }
            java.lang.String r0 = "AddressBookStore/deleteContactsFromTable address book contacts count: "
            r1.append(r0)     // Catch:{ all -> 0x0175 }
            int r0 = r3.size()     // Catch:{ all -> 0x0175 }
            r1.append(r0)     // Catch:{ all -> 0x0175 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0175 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0175 }
            java.util.Iterator r4 = r3.iterator()     // Catch:{ all -> 0x0175 }
            r2 = 0
        L_0x014b:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x0175 }
            if (r0 == 0) goto L_0x0160
            java.lang.Object r0 = r4.next()     // Catch:{ all -> 0x0175 }
            X.1E7 r0 = (X.AnonymousClass1E7) r0     // Catch:{ all -> 0x0175 }
            X.C18070vi.A0b(r5)     // Catch:{ all -> 0x0175 }
            long r0 = X.AnonymousClass2Q6.A04(r0, r5)     // Catch:{ all -> 0x0175 }
            long r2 = r2 + r0
            goto L_0x014b
        L_0x0160:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0175 }
            r1.<init>()     // Catch:{ all -> 0x0175 }
            java.lang.String r0 = "AddressBookStore/deleteContactsFromTable deleted contacts count: "
            r1.append(r0)     // Catch:{ all -> 0x0175 }
            r1.append(r2)     // Catch:{ all -> 0x0175 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0175 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0175 }
            goto L_0x017c
        L_0x0175:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0177 }
        L_0x0177:
            r0 = move-exception
            X.CDX.A00(r5, r1)
            throw r0
        L_0x017c:
            r5.close()
        L_0x017f:
            return
        L_0x0180:
            r1 = move-exception
            if (r2 == 0) goto L_0x018b
            r2.close()     // Catch:{ all -> 0x0187 }
            goto L_0x018b
        L_0x0187:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x018c }
        L_0x018b:
            throw r1     // Catch:{ all -> 0x018c }
        L_0x018c:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x0191 }
            throw r1
        L_0x0191:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1M9.A00(X.1M9, java.lang.Boolean, java.util.List):void");
    }

    public static void A01(AnonymousClass1M9 r4, List list) {
        AnonymousClass1MA r42 = r4.A03;
        HashMap hashMap = new HashMap();
        for (AnonymousClass1E7 r1 : C29431cG.A0z(C29431cG.A0q(list), new C99234sU(8))) {
            hashMap.put(r1.A0J, r1);
        }
        r42.A02.putAll(hashMap);
    }

    private void A03(AnonymousClass1E7 r4) {
        AnonymousClass1BI r1;
        AnonymousClass1E1 r12;
        if (r4 != null) {
            if (C18020vd.A05(C18040vf.A02, this.A0H, 4746) && (r1 = r4.A0J) != null) {
                if (r1 instanceof PhoneUserJid) {
                    r12 = this.A0G.A0A((PhoneUserJid) r1);
                } else if (r1 instanceof AnonymousClass1E2) {
                    r12 = (AnonymousClass1E1) r1;
                } else {
                    return;
                }
                if (r12 != null) {
                    this.A0D.BMn(r12);
                }
            }
        }
    }

    public int A07() {
        Cursor A032;
        AnonymousClass1M2 r1 = this.A04;
        AnonymousClass1Ez r4 = new AnonymousClass1Ez(true);
        r4.A04();
        Integer num = 0;
        try {
            C28781at A052 = r1.A00.get();
            try {
                A032 = C24861Ly.A03(A052, "SELECT count(*) AS _count FROM wa_contacts WHERE is_whatsapp_user != 1 AND raw_contact_id NOT NULL AND raw_contact_id != -1", "OUT_OF_NETWORK_CONTACTS", (String[]) null);
                if (A032.moveToNext()) {
                    num = Integer.valueOf(A032.getInt(A032.getColumnIndexOrThrow("_count")));
                    r4.A01();
                } else {
                    Log.w("ContactManagerDatabase/getOutOfNetworkContactsCount missing cursor");
                }
                A032.close();
                A052.close();
            } catch (Throwable th) {
                A052.close();
                throw th;
            }
        } catch (IllegalStateException e) {
            AnonymousClass1M2.A0G(e, "ContactManagerDatabase/getOutOfNetworkContactsCount/", 0, 0);
        } catch (Throwable th2) {
            AnonymousClass0DT.A00(th, th2);
        }
        r4.A01();
        return num.intValue();
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0040, code lost:
        if (r3 == null) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0046, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        X.AnonymousClass0DT.A00(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004b, code lost:
        r1 = th;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:16:0x0037, B:23:0x0042] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A08() {
        /*
            r7 = this;
            X.1M2 r1 = r7.A04
            r0 = 1
            X.1Ez r5 = new X.1Ez
            r5.<init>((boolean) r0)
            r5.A04()
            r4 = 0
            X.1Lt r0 = r1.A00     // Catch:{ IllegalStateException -> 0x005a }
            X.1at r6 = r0.get()     // Catch:{ IllegalStateException -> 0x005a }
            java.lang.String r2 = "SELECT COUNT(DISTINCT jid) AS _count FROM wa_contacts WHERE is_whatsapp_user = 1 AND raw_contact_id NOT NULL AND raw_contact_id != -1"
            java.lang.String r1 = "UNIQUE_IN_NETWORK_CONTACTS_COUNT"
            r0 = 0
            android.database.Cursor r3 = X.C24861Ly.A03(r6, r2, r1, r0)     // Catch:{ all -> 0x004d }
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = "_count"
            int r0 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x003e }
            int r2 = r3.getInt(r0)     // Catch:{ all -> 0x003e }
            r5.A01()     // Catch:{ all -> 0x002f }
            goto L_0x0037
        L_0x002f:
            r1 = move-exception
            goto L_0x0042
        L_0x0031:
            java.lang.String r0 = "ContactManagerDatabase/getUniqueInNetworkContactsCount missing cursor"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x003e }
            r2 = 0
        L_0x0037:
            r3.close()     // Catch:{ all -> 0x004b }
            r6.close()     // Catch:{ IllegalStateException -> 0x0058 }
            goto L_0x0061
        L_0x003e:
            r1 = move-exception
            r2 = 0
            if (r3 == 0) goto L_0x004a
        L_0x0042:
            r3.close()     // Catch:{ all -> 0x0046 }
            goto L_0x004a
        L_0x0046:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x004b }
        L_0x004a:
            throw r1     // Catch:{ all -> 0x004b }
        L_0x004b:
            r1 = move-exception
            goto L_0x004f
        L_0x004d:
            r1 = move-exception
            r2 = 0
        L_0x004f:
            r6.close()     // Catch:{ all -> 0x0053 }
            goto L_0x0057
        L_0x0053:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IllegalStateException -> 0x0058 }
        L_0x0057:
            throw r1     // Catch:{ IllegalStateException -> 0x0058 }
        L_0x0058:
            r1 = move-exception
            goto L_0x005c
        L_0x005a:
            r1 = move-exception
            r2 = 0
        L_0x005c:
            java.lang.String r0 = "ContactManagerDatabase/getUniqueInNetworkContactsCount/"
            X.AnonymousClass1M2.A0G(r1, r0, r4, r4)
        L_0x0061:
            r5.A01()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1M9.A08():int");
    }

    @Deprecated
    public AnonymousClass1E7 A0A(long j) {
        AnonymousClass1MA r4 = this.A03;
        AnonymousClass00H r3 = r4.A01;
        r3.get();
        if (j == -2) {
            AnonymousClass1E7 r5 = (AnonymousClass1E7) r3.get();
            if (r5 != null) {
                return r5;
            }
        } else {
            Map map = r4.A02;
            synchronized (map) {
                for (AnonymousClass1E7 r52 : map.values()) {
                    if (j == r52.A0J()) {
                        return r52;
                    }
                }
            }
        }
        return this.A04.A0J(j);
    }

    public AnonymousClass1E7 A0C(C47712Jo r6, String str, String str2, long j) {
        AnonymousClass1E7 r4 = new AnonymousClass1E7(r6);
        C42661yX r3 = C42661yX.A05;
        C18070vi.A0d(r3, 4);
        Log.i("addGroupChatContact");
        r4.A0R = str;
        r4.A0X = Long.toString(j);
        r4.A0j = false;
        r4.A13 = false;
        r4.A0f = false;
        r4.A11 = false;
        r4.A04 = 0;
        r4.A0K = null;
        r4.A0t = false;
        r4.A09(r3);
        r4.A0k = false;
        r4.A06 = 0;
        r4.A12 = false;
        r4.A0O = str2;
        r4.A0r = false;
        r4.A0e = false;
        r4.A0i = false;
        r4.A03 = 0;
        r4.A0n = false;
        this.A04.A0O(r4);
        return r4;
    }

    public AnonymousClass1E7 A0D(AnonymousClass1BI r3) {
        AnonymousClass11S r1 = this.A01;
        if (r1.A0O(r3)) {
            r1.A0I();
            return r1.A0D;
        }
        boolean A0Z = C22971Dz.A0Z(r3);
        AnonymousClass1MA r0 = this.A03;
        if (A0Z) {
            return (AnonymousClass1E7) r0.A01.get();
        }
        return r0.A0A(r3);
    }

    public AnonymousClass1E7 A0E(AnonymousClass1BI r3) {
        AnonymousClass11S r1 = this.A01;
        if (!r1.A0O(r3)) {
            return A0I(r3, false);
        }
        r1.A0I();
        return r1.A0D;
    }

    public AnonymousClass1E7 A0F(AnonymousClass1BI r3) {
        AnonymousClass11S r1 = this.A01;
        if (!r1.A0O(r3)) {
            return this.A03.A0A(r3);
        }
        r1.A0I();
        return r1.A0D;
    }

    public AnonymousClass1E7 A0G(AnonymousClass1BI r5) {
        AnonymousClass1MA r1 = this.A03;
        AnonymousClass1E7 A0A2 = r1.A0A(r5);
        if (A0A2 != null) {
            return A0A2;
        }
        AnonymousClass1E7 A0K2 = this.A04.A0K(r5);
        A02(A0K2);
        A03(A0K2);
        if (A0K2 != null) {
            Class<AnonymousClass1BI> cls = AnonymousClass1BI.class;
            if (A0K2.A06(cls) != null) {
                Map map = r1.A02;
                Jid A062 = A0K2.A06(cls);
                C17960vV.A07(A062);
                map.put(A062, A0K2);
            }
        }
        return A0K2;
    }

    public AnonymousClass1E7 A0I(AnonymousClass1BI r2, boolean z) {
        if (r2 == null) {
            return null;
        }
        if (C22971Dz.A0Z(r2)) {
            return (AnonymousClass1E7) this.A03.A01.get();
        }
        if (z) {
            this.A03.A0C(r2);
        }
        return A0G(r2);
    }

    public UserJid A0K(GroupJid groupJid) {
        UserJid userJid;
        String str;
        int indexOf;
        String substring;
        AnonymousClass1E7 A0E2;
        if (groupJid == null || (A0E2 = A0E(groupJid)) == null || (userJid = A0E2.A0K) == null) {
            userJid = null;
            if (!(groupJid == null || (str = groupJid.user) == null || (indexOf = str.indexOf("-")) == -1 || (substring = str.substring(0, indexOf)) == null)) {
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append(substring);
                    sb.append("@");
                    sb.append("s.whatsapp.net");
                    String obj = sb.toString();
                    C22941Dw r0 = UserJid.Companion;
                    return C22941Dw.A03(obj);
                } catch (AnonymousClass11T unused) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("jids/failed to get group creator jid from group jid: ");
                    sb2.append(groupJid.getRawString());
                    Log.w(sb2.toString());
                    return null;
                }
            }
        }
        return userJid;
    }

    public ArrayList A0L() {
        Cursor A032;
        AnonymousClass1M2 r6 = this.A04;
        AnonymousClass1Ez r5 = new AnonymousClass1Ez(true);
        r5.A04();
        ArrayList arrayList = new ArrayList();
        AnonymousClass11S r0 = r6.A03;
        r0.A0I();
        String A062 = C22971Dz.A06(r0.A0E);
        String[] strArr = new String[1];
        if (A062 == null) {
            A062 = C173438v4.A00.getRawString();
        }
        int i = 0;
        strArr[0] = A062;
        try {
            C28781at A052 = r6.A00.get();
            try {
                A032 = C24861Ly.A03(A052, C42631yU.A02, "CONTACT", strArr);
                A032.getCount();
                i = A032.getCount();
                while (A032.moveToNext()) {
                    arrayList.add(C42651yW.A02(A032, r6.A00));
                }
                A032.close();
                A052.close();
            } catch (Throwable th) {
                A052.close();
                throw th;
            }
        } catch (IllegalStateException e) {
            AnonymousClass1M2.A0G(e, "ContactManagerDatabase/getAllIndividualContacts/", i, arrayList.size());
        } catch (Throwable th2) {
            AnonymousClass0DT.A00(th, th2);
        }
        r6.A07.A0J(arrayList);
        arrayList.size();
        r5.A01();
        return arrayList;
        throw th;
    }

    public ArrayList A0M() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.A04.A0M().iterator();
        while (it.hasNext()) {
            AnonymousClass1E7 r1 = (AnonymousClass1E7) it.next();
            if (C22971Dz.A0W(r1.A0J)) {
                arrayList.add(r1);
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x006c A[SYNTHETIC, Splitter:B:32:0x006c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList A0N() {
        /*
            r10 = this;
            X.1M2 r8 = r10.A04
            r6 = 999(0x3e7, float:1.4E-42)
            r1 = 1
            X.1Ez r4 = new X.1Ez
            r4.<init>((boolean) r1)
            r4.A04()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2 = 0
            X.1Lt r0 = r8.A00     // Catch:{ IllegalStateException -> 0x00f5 }
            X.1at r7 = r0.get()     // Catch:{ IllegalStateException -> 0x00f5 }
            java.lang.String[] r5 = new java.lang.String[r1]     // Catch:{ all -> 0x00ea }
            java.lang.String r0 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x00ea }
            r5[r2] = r0     // Catch:{ all -> 0x00ea }
            java.util.HashSet r6 = new java.util.HashSet     // Catch:{ all -> 0x00ea }
            r6.<init>()     // Catch:{ all -> 0x00ea }
            java.lang.String r1 = "SELECT wa_contacts.jid FROM wa_contacts WHERE jid IS NOT NULL AND is_whatsapp_user = 1 AND raw_contact_id NOT NULL AND raw_contact_id != -1 AND raw_contact_id != -4 AND is_contact_synced != 1 AND is_contact_synced != 2 LIMIT ?"
            java.lang.String r0 = "CONTACT"
            android.database.Cursor r9 = X.C24861Ly.A03(r7, r1, r0, r5)     // Catch:{ IllegalStateException -> 0x005f }
            r5 = 0
        L_0x002f:
            boolean r0 = r9.moveToNext()     // Catch:{ all -> 0x0051 }
            if (r0 == 0) goto L_0x004d
            int r5 = r5 + 1
            java.lang.String r0 = "jid"
            int r0 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0051 }
            java.lang.String r1 = r9.getString(r0)     // Catch:{ all -> 0x0051 }
            X.1Dv r0 = X.AnonymousClass1BI.A00     // Catch:{ all -> 0x0051 }
            X.1BI r0 = r0.A02(r1)     // Catch:{ all -> 0x0051 }
            if (r0 == 0) goto L_0x002f
            r6.add(r0)     // Catch:{ all -> 0x0051 }
            goto L_0x002f
        L_0x004d:
            r9.close()     // Catch:{ IllegalStateException -> 0x005d }
            goto L_0x0066
        L_0x0051:
            r1 = move-exception
            if (r9 == 0) goto L_0x005c
            r9.close()     // Catch:{ all -> 0x0058 }
            goto L_0x005c
        L_0x0058:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IllegalStateException -> 0x005d }
        L_0x005c:
            throw r1     // Catch:{ IllegalStateException -> 0x005d }
        L_0x005d:
            r1 = move-exception
            goto L_0x0061
        L_0x005f:
            r1 = move-exception
            r5 = 0
        L_0x0061:
            java.lang.String r0 = "ContactManagerDatabase/getIndividualForUploadContacts/getJids"
            X.AnonymousClass1M2.A0G(r1, r0, r2, r5)     // Catch:{ all -> 0x00e7 }
        L_0x0066:
            boolean r0 = r6.isEmpty()     // Catch:{ all -> 0x00e7 }
            if (r0 != 0) goto L_0x00e3
            java.lang.String[] r5 = X.C22971Dz.A0j(r6)     // Catch:{ all -> 0x00ea }
            int r6 = r5.length     // Catch:{ IllegalStateException -> 0x00d9 }
            java.lang.String r0 = X.C42631yU.A0A     // Catch:{ IllegalStateException -> 0x00d9 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IllegalStateException -> 0x00d9 }
            r1.<init>()     // Catch:{ IllegalStateException -> 0x00d9 }
            java.lang.String r0 = "SELECT "
            r1.append(r0)     // Catch:{ IllegalStateException -> 0x00d9 }
            java.lang.String r0 = X.C42641yV.A00     // Catch:{ IllegalStateException -> 0x00d9 }
            r1.append(r0)     // Catch:{ IllegalStateException -> 0x00d9 }
            java.lang.String r0 = " FROM "
            r1.append(r0)     // Catch:{ IllegalStateException -> 0x00d9 }
            java.lang.String r0 = "wa_contacts LEFT JOIN wa_vnames ON (wa_contacts.jid = wa_vnames.jid) LEFT JOIN wa_group_descriptions ON (wa_contacts.jid = wa_group_descriptions.jid) LEFT JOIN wa_group_admin_settings ON (wa_contacts.jid = wa_group_admin_settings.jid) LEFT JOIN wa_biz_profiles ON (wa_contacts.jid = wa_biz_profiles.jid)"
            r1.append(r0)     // Catch:{ IllegalStateException -> 0x00d9 }
            java.lang.String r0 = " WHERE "
            r1.append(r0)     // Catch:{ IllegalStateException -> 0x00d9 }
            java.lang.String r0 = "wa_contacts.is_contact_synced != 2"
            r1.append(r0)     // Catch:{ IllegalStateException -> 0x00d9 }
            java.lang.String r0 = " AND "
            r1.append(r0)     // Catch:{ IllegalStateException -> 0x00d9 }
            java.lang.String r0 = "wa_contacts.jid IN "
            r1.append(r0)     // Catch:{ IllegalStateException -> 0x00d9 }
            java.lang.String r0 = X.AnonymousClass1H2.A00(r6)     // Catch:{ IllegalStateException -> 0x00d9 }
            r1.append(r0)     // Catch:{ IllegalStateException -> 0x00d9 }
            java.lang.String r1 = r1.toString()     // Catch:{ IllegalStateException -> 0x00d9 }
            java.lang.String r0 = "CONTACTS_BULK"
            android.database.Cursor r6 = X.C24861Ly.A03(r7, r1, r0, r5)     // Catch:{ IllegalStateException -> 0x00d9 }
            r5 = 0
        L_0x00b5:
            boolean r0 = r6.moveToNext()     // Catch:{ all -> 0x00cb }
            if (r0 == 0) goto L_0x00c7
            int r5 = r5 + 1
            X.0vb r0 = r8.A00     // Catch:{ all -> 0x00cb }
            X.1E7 r0 = X.C42651yW.A02(r6, r0)     // Catch:{ all -> 0x00cb }
            r3.add(r0)     // Catch:{ all -> 0x00cb }
            goto L_0x00b5
        L_0x00c7:
            r6.close()     // Catch:{ IllegalStateException -> 0x00d7 }
            goto L_0x00e3
        L_0x00cb:
            r1 = move-exception
            if (r6 == 0) goto L_0x00d6
            r6.close()     // Catch:{ all -> 0x00d2 }
            goto L_0x00d6
        L_0x00d2:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IllegalStateException -> 0x00d7 }
        L_0x00d6:
            throw r1     // Catch:{ IllegalStateException -> 0x00d7 }
        L_0x00d7:
            r1 = move-exception
            goto L_0x00db
        L_0x00d9:
            r1 = move-exception
            r5 = 0
        L_0x00db:
            java.lang.String r0 = "ContactManagerDatabase/getIndividualForUploadContacts/getContactsByJid"
            X.AnonymousClass1M2.A0G(r1, r0, r2, r5)     // Catch:{ all -> 0x00e1 }
            goto L_0x00e3
        L_0x00e1:
            r1 = move-exception
            goto L_0x00ec
        L_0x00e3:
            r7.close()     // Catch:{ IllegalStateException -> 0x00f8 }
            goto L_0x00fe
        L_0x00e7:
            r1 = move-exception
            r2 = 0
            goto L_0x00ec
        L_0x00ea:
            r1 = move-exception
            r5 = 0
        L_0x00ec:
            r7.close()     // Catch:{ all -> 0x00f0 }
            goto L_0x00f4
        L_0x00f0:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IllegalStateException -> 0x00f8 }
        L_0x00f4:
            throw r1     // Catch:{ IllegalStateException -> 0x00f8 }
        L_0x00f5:
            r1 = move-exception
            r5 = 0
            goto L_0x00f9
        L_0x00f8:
            r1 = move-exception
        L_0x00f9:
            java.lang.String r0 = "ContactManagerDatabase/getIndividualForUploadContacts/get db"
            X.AnonymousClass1M2.A0G(r1, r0, r2, r5)
        L_0x00fe:
            r3.size()
            r4.A01()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1M9.A0N():java.util.ArrayList");
    }

    public HashMap A0P(Collection collection) {
        HashMap hashMap;
        C41851xA BD0;
        int i;
        Throwable th;
        HashSet hashSet = new HashSet(collection);
        HashMap hashMap2 = new HashMap(hashSet.size(), 1.0f);
        Iterator it = hashSet.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            AnonymousClass1BI r3 = (AnonymousClass1BI) it.next();
            AnonymousClass11S r1 = this.A01;
            if (r1.A0O(r3)) {
                r1.A0I();
                hashMap2.put(r3, r1.A0D);
            }
            if (C22971Dz.A0Z(r3)) {
                hashMap2.put(r3, this.A03.A01.get());
            }
        }
        hashSet.removeAll(hashMap2.keySet());
        Boolean bool = C17960vV.A01;
        HashMap hashMap3 = new HashMap(hashSet.size(), 1.0f);
        HashSet hashSet2 = new HashSet(hashSet.size(), 1.0f);
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            AnonymousClass1BI r12 = (AnonymousClass1BI) it2.next();
            AnonymousClass1E7 A0A2 = this.A03.A0A(r12);
            if (A0A2 != null) {
                hashMap3.put(r12, A0A2);
            } else {
                hashSet2.add(r12);
            }
        }
        AnonymousClass1M2 r122 = this.A04;
        C24851Lx r14 = r122.A04;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C18030ve r11 = r14.A01;
        C18040vf r32 = C18040vf.A01;
        if (!C18020vd.A05(r32, r11, 8573)) {
            int A032 = C200610r.A03(C29351c6.A0C(hashSet2, 10));
            if (A032 < 16) {
                A032 = 16;
            }
            linkedHashMap = new LinkedHashMap(A032);
            Iterator it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                Object next = it3.next();
                linkedHashMap.put(next, next);
            }
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it4 = hashSet2.iterator();
            while (it4.hasNext()) {
                Object next2 = it4.next();
                if (next2 instanceof AnonymousClass1E2) {
                    linkedHashSet.add(next2);
                } else {
                    linkedHashMap.put(next2, next2);
                }
            }
            LinkedHashMap A0H2 = r14.A00.A0H(linkedHashSet);
            Set<Map.Entry> entrySet = A0H2.entrySet();
            int A033 = C200610r.A03(C29351c6.A0C(entrySet, 10));
            if (A033 < 16) {
                A033 = 16;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(A033);
            for (Map.Entry entry : entrySet) {
                linkedHashMap2.put(entry.getValue(), entry.getKey());
            }
            linkedHashMap.putAll(linkedHashMap2);
            for (Object next3 : C41841x9.A06(C29431cG.A12(A0H2.values()), linkedHashSet)) {
                linkedHashMap.put(next3, next3);
            }
        }
        Collection collection2 = hashSet2;
        if (C18020vd.A05(r32, r11, 8573)) {
            collection2 = linkedHashMap.values();
        }
        int min = Math.min(975, 975);
        AnonymousClass1Ez r0 = new AnonymousClass1Ez(true);
        r0.A04();
        HashMap hashMap4 = new HashMap(collection2.size(), 1.0f);
        HashSet hashSet3 = new HashSet();
        C443423b r13 = new C443423b(C22971Dz.A0j(collection2), min);
        C28791au A062 = r122.A00.A06();
        try {
            Iterator it5 = r13.iterator();
            while (it5.hasNext()) {
                String[] strArr = (String[]) it5.next();
                int length = strArr.length;
                int i2 = 0;
                boolean z = false;
                if (length <= 975) {
                    z = true;
                }
                C17960vV.A0G(z, "SQL param length exceeded");
                try {
                    String str = C42631yU.A0A;
                    StringBuilder sb = new StringBuilder();
                    sb.append("SELECT ");
                    sb.append(C42641yV.A00);
                    sb.append(" FROM ");
                    sb.append("wa_contacts LEFT JOIN wa_vnames ON (wa_contacts.jid = wa_vnames.jid) LEFT JOIN wa_group_descriptions ON (wa_contacts.jid = wa_group_descriptions.jid) LEFT JOIN wa_group_admin_settings ON (wa_contacts.jid = wa_group_admin_settings.jid) LEFT JOIN wa_biz_profiles ON (wa_contacts.jid = wa_biz_profiles.jid)");
                    sb.append(" WHERE ");
                    sb.append("wa_contacts.jid IN ");
                    sb.append(AnonymousClass1H2.A00(length));
                    sb.append(" ORDER BY ");
                    sb.append("wa_contacts.jid");
                    Cursor A034 = C24861Ly.A03(A062, sb.toString(), "CONTACTS_BULK", strArr);
                    try {
                        int count = A034.getCount();
                        while (A034.moveToNext()) {
                            try {
                                AnonymousClass1E7 A022 = C42651yW.A02(A034, r122.A00);
                                i2++;
                                AnonymousClass1E7 A072 = AnonymousClass1M2.A07(r122, A022, (AnonymousClass1E7) hashMap4.get(A022.A0J));
                                hashMap4.put(A072.A0J, A072);
                                if (A022.A0H == null) {
                                    hashSet3.add(A022);
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                i = i2;
                                i2 = count;
                                try {
                                    A034.close();
                                } catch (Throwable th3) {
                                    try {
                                        AnonymousClass0DT.A00(th, th3);
                                    } catch (IllegalStateException e) {
                                        e = e;
                                        AnonymousClass1M2.A0G(e, "ContactManagerDatabase/fetchContacts/", i2, i);
                                    }
                                }
                                throw th;
                            }
                        }
                        try {
                            A034.close();
                        } catch (IllegalStateException e2) {
                            e = e2;
                            i = i2;
                            i2 = count;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        i = 0;
                        if (A034 == null) {
                            throw th;
                        }
                        A034.close();
                        throw th;
                    }
                } catch (IllegalStateException e3) {
                    e = e3;
                    i = 0;
                    AnonymousClass1M2.A0G(e, "ContactManagerDatabase/fetchContacts/", i2, i);
                }
            }
            Collection values = hashMap4.values();
            if (hashSet3.size() != 0) {
                BD0 = A062.BD0();
                Iterator it6 = hashSet3.iterator();
                while (it6.hasNext()) {
                    AnonymousClass1E7 r15 = (AnonymousClass1E7) it6.next();
                    if (!values.contains(r15)) {
                        AnonymousClass1M2.A0B(r122, r15);
                    }
                }
                BD0.A00();
                BD0.close();
            }
            r122.A07.A0J(values);
            A062.close();
            r0.A02();
            if (C18020vd.A05(r32, r11, 8573)) {
                hashMap = new HashMap(collection2.size(), 1.0f);
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    AnonymousClass1BI r16 = (AnonymousClass1BI) entry2.getKey();
                    AnonymousClass1E7 r02 = (AnonymousClass1E7) hashMap4.get(entry2.getValue());
                    if (r02 != null) {
                        r02.A0J = r16;
                        hashMap.put(r16, r02);
                    }
                }
            } else {
                hashMap = hashMap4;
            }
            for (Map.Entry entry3 : hashMap.entrySet()) {
                A02((AnonymousClass1E7) entry3.getValue());
                A03((AnonymousClass1E7) entry3.getValue());
                AnonymousClass1MA r17 = this.A03;
                AnonymousClass1E7 r33 = (AnonymousClass1E7) entry3.getValue();
                if (r33 != null) {
                    Class<AnonymousClass1BI> cls = AnonymousClass1BI.class;
                    if (r33.A06(cls) != null) {
                        Map map = r17.A02;
                        Jid A063 = r33.A06(cls);
                        C17960vV.A07(A063);
                        map.put(A063, r33);
                    }
                }
                hashMap3.put(entry3.getKey(), entry3.getValue());
            }
            hashMap2.putAll(hashMap3);
            return hashMap2;
        } catch (Throwable th5) {
            try {
                A062.close();
            } catch (Throwable th6) {
                AnonymousClass0DT.A00(th5, th6);
            }
            throw th5;
        }
        throw th;
    }

    public HashSet A0R(Collection collection) {
        AnonymousClass1E7 A0D2;
        if (collection == null || collection.size() == 0) {
            return new HashSet();
        }
        HashSet hashSet = new HashSet(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AnonymousClass1BI r0 = (AnonymousClass1BI) it.next();
            if (!(r0 == null || (A0D2 = A0D(r0)) == null)) {
                hashSet.add(A0D2);
            }
        }
        return hashSet;
    }

    public void A0S() {
        byte[] bArr = new byte[12];
        new Random().nextBytes(bArr);
        C19830z4.A00(this.A0B).putString("web_contact_checksum", Base64.encodeToString(bArr, 8)).apply();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0116, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0117, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x011a, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0U(X.AnonymousClass1E7 r25) {
        /*
            r24 = this;
            r7 = r24
            X.1M2 r0 = r7.A04
            r23 = r0
            r0 = 5
            android.content.ContentValues r13 = new android.content.ContentValues
            r13.<init>(r0)
            r11 = 0
            java.lang.String r10 = "given_name"
            r13.put(r10, r11)
            java.lang.String r9 = "display_name"
            r13.put(r9, r11)
            r0 = -1
            java.lang.Long r6 = java.lang.Long.valueOf(r0)
            java.lang.String r5 = "raw_contact_id"
            r13.put(r5, r6)
            r1 = 2
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            java.lang.String r3 = "is_contact_synced"
            r13.put(r3, r4)
            r22 = 0
            r8 = r25
            r0 = r23
            X.1Lt r0 = r0.A00     // Catch:{ IllegalArgumentException -> 0x00a1 }
            X.1au r12 = r0.A06()     // Catch:{ IllegalArgumentException -> 0x00a1 }
            X.1xA r21 = r12.BD0()     // Catch:{ all -> 0x0097 }
            java.lang.String r14 = "wa_contacts"
            java.lang.String r2 = "wa_contacts._id = ?"
            r15 = 1
            java.lang.String[] r0 = new java.lang.String[r15]     // Catch:{ all -> 0x008d }
            long r16 = r8.A0J()     // Catch:{ all -> 0x008d }
            java.lang.String r16 = java.lang.String.valueOf(r16)     // Catch:{ all -> 0x008d }
            r0[r22] = r16     // Catch:{ all -> 0x008d }
            long r19 = X.C24861Ly.A01(r13, r12, r14, r2, r0)     // Catch:{ all -> 0x008d }
            r17 = 1
            int r0 = (r19 > r17 ? 1 : (r19 == r17 ? 0 : -1))
            if (r0 != 0) goto L_0x005c
            r22 = 1
            goto L_0x007f
        L_0x005c:
            java.lang.String r16 = "wa_contacts.display_name = ? AND wa_contacts.jid = ?"
            java.lang.String[] r2 = new java.lang.String[r1]     // Catch:{ all -> 0x0089 }
            java.lang.String r0 = r8.A0K()     // Catch:{ all -> 0x0089 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0089 }
            r2[r22] = r0     // Catch:{ all -> 0x0089 }
            X.1BI r0 = r8.A0J     // Catch:{ all -> 0x0089 }
            java.lang.String r0 = r0.getRawString()     // Catch:{ all -> 0x0089 }
            r2[r15] = r0     // Catch:{ all -> 0x0089 }
            r0 = r16
            long r13 = X.C24861Ly.A01(r13, r12, r14, r0, r2)     // Catch:{ all -> 0x0089 }
            int r0 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
            if (r0 != 0) goto L_0x007f
            r22 = 1
        L_0x007f:
            r21.A00()     // Catch:{ all -> 0x008d }
            r21.close()     // Catch:{ all -> 0x0097 }
            r12.close()     // Catch:{ IllegalArgumentException -> 0x00a1 }
            goto L_0x00b8
        L_0x0089:
            r2 = move-exception
            r22 = 0
            goto L_0x008e
        L_0x008d:
            r2 = move-exception
        L_0x008e:
            r21.close()     // Catch:{ all -> 0x0092 }
            goto L_0x0096
        L_0x0092:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r2, r0)     // Catch:{ all -> 0x0097 }
        L_0x0096:
            throw r2     // Catch:{ all -> 0x0097 }
        L_0x0097:
            r2 = move-exception
            r12.close()     // Catch:{ all -> 0x009c }
            goto L_0x00a0
        L_0x009c:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r2, r0)     // Catch:{ IllegalArgumentException -> 0x00a1 }
        L_0x00a0:
            throw r2     // Catch:{ IllegalArgumentException -> 0x00a1 }
        L_0x00a1:
            r12 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "ContactManagerDatabase/unable to remove contact "
            r2.append(r0)
            X.1BI r0 = r8.A0J
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            X.C17960vV.A09(r0, r12)
        L_0x00b8:
            r8.A0R = r11
            r8.A0T = r11
            r8.A0H = r11
            r8.A01 = r1
            X.1E7 r0 = r8.A0I
            if (r0 == 0) goto L_0x00c6
            r8.A0I = r11
        L_0x00c6:
            if (r22 == 0) goto L_0x00df
            r0 = r23
            X.00H r0 = r0.A09
            java.lang.Object r12 = r0.get()
            X.10T r12 = (X.AnonymousClass10T) r12
            java.util.Set r2 = java.util.Collections.singleton(r8)
            r1 = 6
            X.35V r0 = new X.35V
            r0.<init>(r2, r1)
            r12.notifyAllObservers(r0)
        L_0x00df:
            X.0ve r2 = r7.A0H
            r1 = 10624(0x2980, float:1.4887E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x011e
            X.1Lo r0 = r7.A02
            X.00H r0 = r0.A00
            java.lang.Object r2 = r0.get()
            X.1Ly r2 = (X.C24861Ly) r2
            r0 = 4
            android.content.ContentValues r1 = new android.content.ContentValues
            r1.<init>(r0)
            r1.put(r10, r11)
            r1.put(r9, r11)
            r1.put(r5, r6)
            r1.put(r3, r4)
            X.1Lt r0 = r2.A00
            X.1au r2 = r0.A06()
            X.C18070vi.A0b(r2)     // Catch:{ all -> 0x0114 }
            X.AnonymousClass2Q6.A07(r1, r8, r2)     // Catch:{ all -> 0x0114 }
            goto L_0x011b
        L_0x0114:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0116 }
        L_0x0116:
            r0 = move-exception
            X.CDX.A00(r2, r1)
            throw r0
        L_0x011b:
            r2.close()
        L_0x011e:
            X.1MA r1 = r7.A03
            X.1BI r0 = r8.A0J
            r1.A0C(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1M9.A0U(X.1E7):void");
    }

    public void A0V(AnonymousClass1E7 r6) {
        AnonymousClass1M2 r2 = this.A04;
        AnonymousClass1Ez r4 = new AnonymousClass1Ez(true);
        r4.A04();
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("status_autodownload_disabled", Integer.valueOf(r6.A14 ? 1 : 0));
        AnonymousClass1M2.A0A(contentValues, r2, r6.A0J);
        StringBuilder sb = new StringBuilder();
        sb.append("ContactManagerDatabase/updateContactStatusAutodownloadDisabled jid=");
        sb.append(r6.A0J);
        sb.append(' ');
        sb.append(contentValues);
        sb.append(" | time: ");
        sb.append(r4.A01());
        Log.i(sb.toString());
        this.A03.A0B(r6);
    }

    public void A0W(AnonymousClass1E7 r4) {
        this.A04.A0Q(r4);
        this.A03.A0B(r4);
        A0S();
        this.A0I.A00(new C70623Bv(this, r4, 23));
    }

    public void A0X(AnonymousClass1E7 r4) {
        this.A04.A0R(r4);
        this.A03.A0B(r4);
        this.A0I.A00(new C146437Pc(this, 32));
    }

    public void A0Z(AnonymousClass1E1 r4) {
        if (A06(this, this.A03.A0A(r4))) {
            this.A0I.A00(new C70623Bv(this, r4, 28));
        }
    }

    public void A0a(AnonymousClass1E1 r4) {
        ((C58362kZ) this.A0L.get()).A01(new C70623Bv(this, r4, 24));
    }

    public void A0i(UserJid userJid, int i, long j) {
        C28791au A062;
        AnonymousClass1M2 r5 = this.A04;
        long j2 = (long) i;
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("disappearing_mode_duration", Long.valueOf(j2));
        contentValues.put("disappearing_mode_timestamp", Long.valueOf(j));
        try {
            A062 = r5.A00.A06();
            AnonymousClass1M2.A09(contentValues, r5, A062, userJid);
            A062.close();
        } catch (IllegalArgumentException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("ContactManagerDatabase/unable to update disappearing_mode_duration state ");
            sb.append(userJid);
            sb.append(", ");
            sb.append(j2);
            C17960vV.A09(sb.toString(), e);
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
        }
        this.A03.A0C(userJid);
        A0S();
        return;
        throw th;
    }

    public void A0j(UserJid userJid, String str, long j) {
        this.A04.A0V(userJid, str, j);
        this.A03.A0C(userJid);
        this.A0I.A00(new C70623Bv(this, userJid, 26));
    }

    public void A0k(UserJid userJid, String str, String str2, long j) {
        C28791au A062;
        AnonymousClass1M2 r4 = this.A04;
        AnonymousClass1Ez r3 = new AnonymousClass1Ez(true);
        r3.A04();
        ContentValues contentValues = new ContentValues(3);
        contentValues.put("status", str);
        contentValues.put("status_timestamp", Long.valueOf(j));
        contentValues.put("status_emoji", str2);
        try {
            A062 = r4.A00.A06();
            AnonymousClass1M2.A09(contentValues, r4, A062, userJid);
            A062.close();
        } catch (IllegalArgumentException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("ContactManagerDatabase/updateContactTextStatus failed ");
            sb.append(userJid);
            C17960vV.A09(sb.toString(), e);
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
        }
        r3.A01();
        this.A03.A0C(userJid);
        this.A0I.A00(new C70623Bv(this, userJid, 25));
        return;
        throw th;
    }

    public void A0l(UserJid userJid, boolean z) {
        C28791au A062;
        AnonymousClass1M2 r3 = this.A04;
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("is_sidelist_synced", Boolean.valueOf(z));
        try {
            A062 = r3.A00.A06();
            AnonymousClass1M2.A09(contentValues, r3, A062, userJid);
            A062.close();
        } catch (IllegalArgumentException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("ContactManagerDatabase/updateContactSideListSync failed ");
            sb.append(userJid);
            sb.append(", ");
            sb.append(z);
            C17960vV.A09(sb.toString(), e);
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
        }
        this.A03.A0C(userJid);
        return;
        throw th;
    }

    public void A0m(ArrayList arrayList) {
        AnonymousClass1M2.A0C(this.A04, arrayList, 1, false, false, false, false, false);
    }

    public void A0n(ArrayList arrayList) {
        AnonymousClass1M2.A0C(this.A04, arrayList, 5, false, false, false, false, false);
    }

    public void A0o(ArrayList arrayList) {
        Cursor A032;
        AnonymousClass11B A0O2 = this.A08.A0O();
        if (A0O2 == null) {
            Log.w("contact-mgr-db/wadbhelper/get-contact-nux-suggest-list cr=null");
            return;
        }
        try {
            A032 = A0O2.A03(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, new String[]{"raw_contact_id"}, "starred=1", (String[]) null, (String) null);
            if (A032 != null) {
                int columnIndexOrThrow = A032.getColumnIndexOrThrow("raw_contact_id");
                HashSet hashSet = new HashSet();
                while (A032.moveToNext()) {
                    Long valueOf = Long.valueOf(A032.getLong(columnIndexOrThrow));
                    if (hashSet.add(valueOf)) {
                        arrayList.add(valueOf);
                    }
                }
                A032.close();
                return;
            }
            return;
        } catch (Exception e) {
            Log.e("contact-mgr-db/unable to query the phone book for favorited contacts", e);
            return;
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
        }
        throw th;
    }

    public void A0q(Collection collection) {
        AnonymousClass1E7 r2;
        C41851xA BD0;
        AnonymousClass1M2 r1 = this.A04;
        if (!collection.isEmpty()) {
            AnonymousClass1Ez r5 = new AnonymousClass1Ez(true);
            r5.A04();
            ContentValues contentValues = new ContentValues(1);
            try {
                C28791au A062 = r1.A00.A06();
                try {
                    BD0 = A062.BD0();
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        AnonymousClass1E7 r9 = (AnonymousClass1E7) it.next();
                        AnonymousClass1BI r22 = r9.A0J;
                        if (r22 == null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("ContactManagerDatabase/update contact skipped for jid=");
                            sb.append(r22);
                            Log.i(sb.toString());
                        } else {
                            contentValues.put("keep_timestamp", Long.valueOf(r9.A0D));
                            C24861Ly.A01(contentValues, A062, "wa_contacts", "_id = ?", new String[]{String.valueOf(r9.A0J())});
                        }
                    }
                    BD0.A00();
                    BD0.close();
                    A062.close();
                    collection.size();
                    r5.A01();
                } catch (Throwable th) {
                    A062.close();
                    throw th;
                }
            } catch (IllegalArgumentException e) {
                C17960vV.A09("ContactManagerDatabase/unable to update keep timestamp ", e);
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
            }
        }
        AnonymousClass1MA r52 = this.A03;
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            AnonymousClass1E7 r3 = (AnonymousClass1E7) it2.next();
            Jid A063 = r3.A06(AnonymousClass1BI.class);
            if (!(A063 == null || (r2 = (AnonymousClass1E7) r52.A02.get(A063)) == null)) {
                r2.A0D = r3.A0D;
            }
        }
        return;
        throw th;
    }

    public void A0r(Collection collection, int i) {
        this.A04.A0W(new ArrayList(collection), i);
        this.A02.A01(collection);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            this.A03.A0B((AnonymousClass1E7) it.next());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:86:0x015b A[Catch:{ all -> 0x02a6 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0s(java.util.Collection r19, boolean r20) {
        /*
            r18 = this;
            r7 = r18
            X.1M2 r6 = r7.A04
            r8 = r19
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x0046
            java.lang.String r0 = "ContactManagerDatabase/add contacts called without any contacts"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0011:
            if (r20 != 0) goto L_0x0045
            X.0ve r2 = r7.A0H
            r1 = 10624(0x2980, float:1.4887E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0045
            X.1Lo r0 = r7.A02
            r3 = 0
            X.00H r0 = r0.A00
            java.lang.Object r2 = r0.get()
            X.2Q6 r2 = (X.AnonymousClass2Q6) r2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "AddressBookStore/addContacts not in usync "
            r1.append(r0)
            int r0 = r8.size()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.AnonymousClass2Q6.A08(r2, r8, r3)
        L_0x0045:
            return
        L_0x0046:
            r12 = 1
            X.1Ez r5 = new X.1Ez
            r5.<init>((boolean) r12)
            r5.A04()
            android.content.ContentValues r4 = new android.content.ContentValues
            r4.<init>()
            X.1Lt r15 = r6.A00     // Catch:{ IllegalArgumentException -> 0x02ba }
            X.1au r3 = r15.A06()     // Catch:{ IllegalArgumentException -> 0x02ba }
            X.1xA r2 = r3.BD0()     // Catch:{ all -> 0x02b0 }
            java.util.Iterator r17 = r8.iterator()     // Catch:{ all -> 0x02a6 }
        L_0x0062:
            boolean r0 = r17.hasNext()     // Catch:{ all -> 0x02a6 }
            if (r0 == 0) goto L_0x0194
            java.lang.Object r11 = r17.next()     // Catch:{ all -> 0x02a6 }
            X.1E7 r11 = (X.AnonymousClass1E7) r11     // Catch:{ all -> 0x02a6 }
            if (r11 == 0) goto L_0x0062
            java.lang.Class<X.1BI> r0 = X.AnonymousClass1BI.class
            com.whatsapp.jid.Jid r0 = r11.A06(r0)     // Catch:{ all -> 0x02a6 }
            X.1BI r0 = (X.AnonymousClass1BI) r0     // Catch:{ all -> 0x02a6 }
            if (r0 == 0) goto L_0x0062
            java.util.ArrayList r0 = r6.A0N(r0)     // Catch:{ all -> 0x02a6 }
            java.util.Iterator r13 = r0.iterator()     // Catch:{ all -> 0x02a6 }
        L_0x0082:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x02a6 }
            if (r0 == 0) goto L_0x00c0
            java.lang.Object r1 = r13.next()     // Catch:{ all -> 0x02a6 }
            X.1E7 r1 = (X.AnonymousClass1E7) r1     // Catch:{ all -> 0x02a6 }
            if (r1 == 0) goto L_0x0082
            boolean r0 = r1.A0H()     // Catch:{ all -> 0x02a6 }
            if (r0 == 0) goto L_0x00aa
            X.2lf r10 = r11.A0H     // Catch:{ all -> 0x02a6 }
            if (r10 == 0) goto L_0x0082
            X.2lf r0 = r1.A0H     // Catch:{ all -> 0x02a6 }
            if (r0 == 0) goto L_0x0082
            java.lang.String r9 = r0.A01     // Catch:{ all -> 0x02a6 }
            if (r9 == 0) goto L_0x0082
            java.lang.String r0 = r10.A01     // Catch:{ all -> 0x02a6 }
            boolean r0 = r9.equals(r0)     // Catch:{ all -> 0x02a6 }
            if (r0 == 0) goto L_0x0082
        L_0x00aa:
            boolean r0 = r2.A01()     // Catch:{ all -> 0x02a6 }
            X.C17960vV.A0D(r0)     // Catch:{ all -> 0x02a6 }
            X.1Ez r0 = new X.1Ez     // Catch:{ all -> 0x02a6 }
            r0.<init>((boolean) r12)     // Catch:{ all -> 0x02a6 }
            r0.A04()     // Catch:{ all -> 0x02a6 }
            X.AnonymousClass1M2.A0D(r2, r1, r3)     // Catch:{ all -> 0x02a6 }
            r0.A01()     // Catch:{ all -> 0x02a6 }
            goto L_0x0082
        L_0x00c0:
            X.0ve r9 = r6.A06     // Catch:{ all -> 0x02a6 }
            r1 = 5868(0x16ec, float:8.223E-42)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ all -> 0x02a6 }
            boolean r0 = X.C18020vd.A05(r0, r9, r1)     // Catch:{ all -> 0x02a6 }
            if (r0 == 0) goto L_0x0062
            X.2lf r10 = r11.A0H     // Catch:{ all -> 0x02a6 }
            if (r10 == 0) goto L_0x0062
            long r0 = r10.A00     // Catch:{ all -> 0x02a6 }
            r13 = -5
            int r9 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r9 != 0) goto L_0x0062
            java.lang.String r0 = r10.A01     // Catch:{ all -> 0x02a6 }
            X.1Ez r14 = new X.1Ez     // Catch:{ all -> 0x02a6 }
            r14.<init>((boolean) r12)     // Catch:{ all -> 0x02a6 }
            r14.A04()     // Catch:{ all -> 0x02a6 }
            java.util.ArrayList r16 = new java.util.ArrayList     // Catch:{ all -> 0x02a6 }
            r16.<init>()     // Catch:{ all -> 0x02a6 }
            r13 = 0
            X.1at r10 = r15.get()     // Catch:{ IllegalStateException -> 0x013a }
            java.lang.String r9 = X.C42631yU.A07     // Catch:{ all -> 0x0130 }
            java.lang.String[] r1 = new java.lang.String[r12]     // Catch:{ all -> 0x0130 }
            r1[r13] = r0     // Catch:{ all -> 0x0130 }
            java.lang.String r0 = "CONTACTS-BY-NUMBER"
            android.database.Cursor r0 = X.C24861Ly.A03(r10, r9, r0, r1)     // Catch:{ all -> 0x0130 }
            int r13 = r0.getCount()     // Catch:{ all -> 0x011e }
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x011e }
            r9.<init>(r13)     // Catch:{ all -> 0x011e }
        L_0x0101:
            boolean r1 = r0.moveToNext()     // Catch:{ all -> 0x011c }
            if (r1 == 0) goto L_0x0111
            X.0vb r1 = r6.A00     // Catch:{ all -> 0x011c }
            X.1E7 r1 = X.C42651yW.A02(r0, r1)     // Catch:{ all -> 0x011c }
            r9.add(r1)     // Catch:{ all -> 0x011c }
            goto L_0x0101
        L_0x0111:
            r0.close()     // Catch:{ all -> 0x012c }
            r10.close()     // Catch:{ IllegalStateException -> 0x0118 }
            goto L_0x0146
        L_0x0118:
            r1 = move-exception
            r16 = r9
            goto L_0x013b
        L_0x011c:
            r1 = move-exception
            goto L_0x0123
        L_0x011e:
            r1 = move-exception
            r9 = r16
            if (r0 == 0) goto L_0x012b
        L_0x0123:
            r0.close()     // Catch:{ all -> 0x0127 }
            goto L_0x012b
        L_0x0127:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x012c }
        L_0x012b:
            throw r1     // Catch:{ all -> 0x012c }
        L_0x012c:
            r0 = move-exception
            r16 = r9
            goto L_0x0131
        L_0x0130:
            r0 = move-exception
        L_0x0131:
            r10.close()     // Catch:{ all -> 0x0135 }
            goto L_0x0139
        L_0x0135:
            r1 = move-exception
            X.AnonymousClass0DT.A00(r0, r1)     // Catch:{ IllegalStateException -> 0x013a }
        L_0x0139:
            throw r0     // Catch:{ IllegalStateException -> 0x013a }
        L_0x013a:
            r1 = move-exception
        L_0x013b:
            java.lang.String r9 = "ContactManagerDatabase/getContactsByPhoneNumberLoose/"
            int r0 = r16.size()     // Catch:{ all -> 0x0192 }
            X.AnonymousClass1M2.A0G(r1, r9, r13, r0)     // Catch:{ all -> 0x0192 }
            r9 = r16
        L_0x0146:
            X.1Lz r0 = r6.A07     // Catch:{ all -> 0x02a6 }
            r0.A0J(r9)     // Catch:{ all -> 0x02a6 }
            r9.size()     // Catch:{ all -> 0x02a6 }
            r14.A01()     // Catch:{ all -> 0x02a6 }
            java.util.Iterator r10 = r9.iterator()     // Catch:{ all -> 0x02a6 }
        L_0x0155:
            boolean r0 = r10.hasNext()     // Catch:{ all -> 0x02a6 }
            if (r0 == 0) goto L_0x0062
            java.lang.Object r9 = r10.next()     // Catch:{ all -> 0x02a6 }
            X.1E7 r9 = (X.AnonymousClass1E7) r9     // Catch:{ all -> 0x02a6 }
            java.lang.String r0 = r9.A0K()     // Catch:{ all -> 0x02a6 }
            if (r0 == 0) goto L_0x0155
            java.lang.String r1 = r9.A0K()     // Catch:{ all -> 0x02a6 }
            java.lang.String r0 = r11.A0K()     // Catch:{ all -> 0x02a6 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x02a6 }
            if (r0 == 0) goto L_0x0155
            int r1 = r9.A01     // Catch:{ all -> 0x02a6 }
            if (r1 == 0) goto L_0x017c
            r0 = 2
            if (r1 != r0) goto L_0x0155
        L_0x017c:
            boolean r0 = r2.A01()     // Catch:{ all -> 0x02a6 }
            X.C17960vV.A0D(r0)     // Catch:{ all -> 0x02a6 }
            X.1Ez r0 = new X.1Ez     // Catch:{ all -> 0x02a6 }
            r0.<init>((boolean) r12)     // Catch:{ all -> 0x02a6 }
            r0.A04()     // Catch:{ all -> 0x02a6 }
            X.AnonymousClass1M2.A0D(r2, r9, r3)     // Catch:{ all -> 0x02a6 }
            r0.A01()     // Catch:{ all -> 0x02a6 }
            goto L_0x0155
        L_0x0192:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x02a6 }
        L_0x0194:
            java.util.Iterator r12 = r8.iterator()     // Catch:{ all -> 0x02a6 }
        L_0x0198:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x02a6 }
            if (r0 == 0) goto L_0x028b
            java.lang.Object r9 = r12.next()     // Catch:{ all -> 0x02a6 }
            X.1E7 r9 = (X.AnonymousClass1E7) r9     // Catch:{ all -> 0x02a6 }
            X.1BI r0 = r9.A0J     // Catch:{ all -> 0x02a6 }
            if (r0 != 0) goto L_0x01bd
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x02a6 }
            r1.<init>()     // Catch:{ all -> 0x02a6 }
            java.lang.String r0 = "ContactManagerDatabase/skipped adding contact due to empty jid: "
            r1.append(r0)     // Catch:{ all -> 0x02a6 }
            r1.append(r9)     // Catch:{ all -> 0x02a6 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x02a6 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x02a6 }
            goto L_0x0198
        L_0x01bd:
            boolean r0 = r9.A10     // Catch:{ all -> 0x02a6 }
            X.2lf r11 = r9.A0H     // Catch:{ all -> 0x02a6 }
            java.lang.String r1 = "is_whatsapp_user"
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x02a6 }
            r4.put(r1, r0)     // Catch:{ all -> 0x02a6 }
            java.lang.String r1 = "status"
            java.lang.String r0 = r9.A0Z     // Catch:{ all -> 0x02a6 }
            r4.put(r1, r0)     // Catch:{ all -> 0x02a6 }
            java.lang.String r10 = "status_timestamp"
            long r0 = r9.A0F     // Catch:{ all -> 0x02a6 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x02a6 }
            r4.put(r10, r0)     // Catch:{ all -> 0x02a6 }
            java.lang.String r10 = "number"
            r1 = 0
            if (r11 == 0) goto L_0x0256
            java.lang.String r0 = r11.A01     // Catch:{ all -> 0x02a6 }
        L_0x01e5:
            r4.put(r10, r0)     // Catch:{ all -> 0x02a6 }
            java.lang.String r10 = "raw_contact_id"
            if (r11 == 0) goto L_0x01f2
            long r0 = r11.A00     // Catch:{ all -> 0x02a6 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x02a6 }
        L_0x01f2:
            r4.put(r10, r1)     // Catch:{ all -> 0x02a6 }
            java.lang.String r1 = "display_name"
            java.lang.String r0 = r9.A0K()     // Catch:{ all -> 0x02a6 }
            r4.put(r1, r0)     // Catch:{ all -> 0x02a6 }
            java.lang.String r1 = "phone_type"
            java.lang.Integer r0 = r9.A0N     // Catch:{ all -> 0x02a6 }
            r4.put(r1, r0)     // Catch:{ all -> 0x02a6 }
            java.lang.String r1 = "phone_label"
            java.lang.String r0 = r9.A0X     // Catch:{ all -> 0x02a6 }
            r4.put(r1, r0)     // Catch:{ all -> 0x02a6 }
            java.lang.String r1 = "given_name"
            java.lang.String r0 = r9.A0T     // Catch:{ all -> 0x02a6 }
            r4.put(r1, r0)     // Catch:{ all -> 0x02a6 }
            java.lang.String r1 = "family_name"
            java.lang.String r0 = r9.A0S     // Catch:{ all -> 0x02a6 }
            r4.put(r1, r0)     // Catch:{ all -> 0x02a6 }
            java.lang.String r1 = "sort_name"
            java.lang.String r0 = r9.A0Y     // Catch:{ all -> 0x02a6 }
            r4.put(r1, r0)     // Catch:{ all -> 0x02a6 }
            java.lang.String r1 = "nickname"
            java.lang.String r0 = r9.A0W     // Catch:{ all -> 0x02a6 }
            r4.put(r1, r0)     // Catch:{ all -> 0x02a6 }
            java.lang.String r1 = "company"
            java.lang.String r0 = r9.A0Q     // Catch:{ all -> 0x02a6 }
            r4.put(r1, r0)     // Catch:{ all -> 0x02a6 }
            java.lang.String r1 = "title"
            java.lang.String r0 = r9.A0b     // Catch:{ all -> 0x02a6 }
            r4.put(r1, r0)     // Catch:{ all -> 0x02a6 }
            java.lang.String r1 = "is_spam_reported"
            boolean r0 = r9.A0x     // Catch:{ all -> 0x02a6 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x02a6 }
            r4.put(r1, r0)     // Catch:{ all -> 0x02a6 }
            java.lang.String r1 = "status_emoji"
            java.lang.String r0 = r9.A0a     // Catch:{ all -> 0x02a6 }
            r4.put(r1, r0)     // Catch:{ all -> 0x02a6 }
            X.0ve r10 = r6.A06     // Catch:{ all -> 0x02a6 }
            r1 = 5868(0x16ec, float:8.223E-42)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ all -> 0x02a6 }
            boolean r0 = X.C18020vd.A05(r0, r10, r1)     // Catch:{ all -> 0x02a6 }
            goto L_0x0258
        L_0x0256:
            r0 = r1
            goto L_0x01e5
        L_0x0258:
            if (r0 == 0) goto L_0x0271
            java.lang.String r1 = "sync_policy"
            int r0 = r9.A09     // Catch:{ all -> 0x02a6 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x02a6 }
            r4.put(r1, r0)     // Catch:{ all -> 0x02a6 }
            java.lang.String r1 = "is_contact_synced"
            int r0 = r9.A01     // Catch:{ all -> 0x02a6 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x02a6 }
            r4.put(r1, r0)     // Catch:{ all -> 0x02a6 }
        L_0x0271:
            X.1BI r0 = r9.A0J     // Catch:{ all -> 0x02a6 }
            X.AnonymousClass1M2.A06(r4, r6, r3, r0)     // Catch:{ all -> 0x02a6 }
            X.1BI r0 = r9.A0J     // Catch:{ all -> 0x02a6 }
            boolean r0 = r0 instanceof X.AnonymousClass1EC     // Catch:{ all -> 0x02a6 }
            if (r0 == 0) goto L_0x0198
            java.lang.Class<X.1EC> r0 = X.AnonymousClass1EC.class
            com.whatsapp.jid.Jid r1 = r9.A06(r0)     // Catch:{ all -> 0x02a6 }
            X.1E9 r1 = (X.AnonymousClass1E9) r1     // Catch:{ all -> 0x02a6 }
            X.1yX r0 = r9.A0M     // Catch:{ all -> 0x02a6 }
            X.AnonymousClass1M2.A0E(r2, r3, r1, r0)     // Catch:{ all -> 0x02a6 }
            goto L_0x0198
        L_0x028b:
            r2.A00()     // Catch:{ all -> 0x02a6 }
            r1 = 30
            X.3Bv r0 = new X.3Bv     // Catch:{ all -> 0x02a6 }
            r0.<init>(r6, r8, r1)     // Catch:{ all -> 0x02a6 }
            r3.BJ7(r0)     // Catch:{ all -> 0x02a6 }
            r2.close()     // Catch:{ all -> 0x02b0 }
            r3.close()     // Catch:{ IllegalArgumentException -> 0x02ba }
            r8.size()
            r5.A01()
            goto L_0x0011
        L_0x02a6:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x02ab }
            goto L_0x02af
        L_0x02ab:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x02b0 }
        L_0x02af:
            throw r1     // Catch:{ all -> 0x02b0 }
        L_0x02b0:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x02b5 }
            goto L_0x02b9
        L_0x02b5:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IllegalArgumentException -> 0x02ba }
        L_0x02b9:
            throw r1     // Catch:{ IllegalArgumentException -> 0x02ba }
        L_0x02ba:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "ContactManagerDatabase/unable to add "
            r1.append(r0)
            int r0 = r8.size()
            r1.append(r0)
            java.lang.String r0 = " contacts "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            X.C17960vV.A09(r0, r2)
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1M9.A0s(java.util.Collection, boolean):void");
    }

    public void A0t(Collection collection, boolean z) {
        C41851xA BD1;
        String rawString;
        String str;
        AnonymousClass1M2 r10 = this.A04;
        AnonymousClass1Ez r8 = new AnonymousClass1Ez(true);
        r8.A04();
        ArrayList arrayList = new ArrayList();
        ContentValues contentValues = new ContentValues();
        Collection<AnonymousClass1E7> collection2 = collection;
        try {
            C28791au A062 = r10.A00.A06();
            try {
                BD1 = A062.BD1();
                for (AnonymousClass1E7 r3 : collection2) {
                    AnonymousClass1BI r2 = r3.A0J;
                    if (r2 == null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("ContactManagerDatabase/updateOrAddContacts skipped for jid=");
                        sb.append(r2);
                        Log.i(sb.toString());
                    } else {
                        if (C22971Dz.A0d(r2)) {
                            rawString = C22971Dz.A06(r10.A04.A00((UserJid) r2));
                        } else {
                            rawString = r2.getRawString();
                        }
                        arrayList.add(r3);
                        contentValues.clear();
                        long A0J2 = r3.A0J();
                        if (A0J2 > 0) {
                            contentValues.put("_id", Long.valueOf(A0J2));
                        }
                        contentValues.put("jid", rawString);
                        contentValues.put("is_whatsapp_user", Boolean.valueOf(r3.A10));
                        contentValues.put("status", r3.A0Z);
                        contentValues.put("status_timestamp", Long.valueOf(r3.A0F));
                        C59042lf r0 = r3.A0H;
                        Long l = null;
                        if (r0 != null) {
                            str = r0.A01;
                        } else {
                            str = null;
                        }
                        contentValues.put("number", str);
                        C59042lf r02 = r3.A0H;
                        if (r02 != null) {
                            l = Long.valueOf(r02.A00);
                        }
                        contentValues.put("raw_contact_id", l);
                        if (r3.A0o) {
                            contentValues.put("raw_contact_id", -4L);
                        }
                        contentValues.put("display_name", r3.A0K());
                        contentValues.put("phone_type", r3.A0N);
                        contentValues.put("phone_label", r3.A0X);
                        contentValues.put("given_name", r3.A0T);
                        contentValues.put("family_name", r3.A0S);
                        contentValues.put("sort_name", r3.A0Y);
                        contentValues.put("photo_ts", Integer.valueOf(r3.A07));
                        contentValues.put("thumb_ts", Integer.valueOf(r3.A08));
                        contentValues.put("photo_id_timestamp", Long.valueOf(r3.A0E));
                        contentValues.put("history_sync_initial_phash", r3.A0U);
                        contentValues.put("wa_name", r3.A0c);
                        contentValues.put("nickname", r3.A0W);
                        contentValues.put("company", r3.A0Q);
                        contentValues.put("title", r3.A0b);
                        contentValues.put("is_spam_reported", Boolean.valueOf(r3.A0x));
                        contentValues.put("is_starred", Boolean.valueOf(r3.A0s));
                        contentValues.put("status_emoji", r3.A0a);
                        if (C18020vd.A05(C18040vf.A02, r10.A06, 5868)) {
                            contentValues.put("sync_policy", Integer.valueOf(r3.A09));
                            contentValues.put("is_contact_synced", Integer.valueOf(r3.A01));
                        }
                        C24861Ly.A05(contentValues, A062, "wa_contacts");
                        if (r2 instanceof AnonymousClass1EC) {
                            AnonymousClass1M2.A0E(BD1, A062, (AnonymousClass1EC) r2, r3.A0M);
                        }
                    }
                }
                BD1.A00();
                BD1.close();
                A062.close();
                AnonymousClass35V.A00((C47812Kb) r10.A09.get(), arrayList, 5);
                collection2.size();
                r8.A01();
                if (!z) {
                    this.A02.A01(collection2);
                }
                for (AnonymousClass1E7 A0B2 : collection2) {
                    this.A03.A0B(A0B2);
                }
                return;
            } catch (Throwable th) {
                A062.close();
                throw th;
            }
            throw th;
        } catch (IllegalArgumentException e) {
            C17960vV.A09("ContactManagerDatabase/unable to update or add contacts ", e);
        } catch (Throwable th2) {
            AnonymousClass0DT.A00(th, th2);
        }
    }

    public void A0u(List list) {
        AnonymousClass1M2.A0C(this.A04, list, 0, false, false, false, false, false);
        A01(this, list);
    }

    public void A0v(List list) {
        if (!C18020vd.A05(C18040vf.A02, this.A0H, 5868) || !this.A0B.A2K() || ((C30191dX) this.A0K.get()).A00()) {
            AnonymousClass1M2.A0C(this.A04, list, 0, true, false, false, false, false);
            A01(this, list);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0097, code lost:
        if (r1 != false) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0142, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0146, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0149, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x014a, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x014d, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x015b A[LOOP:2: B:81:0x0155->B:83:0x015b, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0w(java.util.List r28) {
        /*
            r27 = this;
            r10 = r27
            X.1M2 r0 = r10.A04
            r25 = r0
            r0 = 5
            android.content.ContentValues r13 = new android.content.ContentValues
            r13.<init>(r0)
            r11 = 0
            java.lang.String r9 = "given_name"
            r13.put(r9, r11)
            java.lang.String r8 = "display_name"
            r13.put(r8, r11)
            r0 = -1
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
            java.lang.String r6 = "raw_contact_id"
            r13.put(r6, r7)
            r12 = 2
            java.lang.Integer r5 = java.lang.Integer.valueOf(r12)
            java.lang.String r4 = "is_contact_synced"
            r13.put(r4, r5)
            r24 = 0
            r26 = r28
            r0 = r25
            X.1Lt r0 = r0.A00     // Catch:{ IllegalArgumentException -> 0x00d0 }
            X.1au r14 = r0.A06()     // Catch:{ IllegalArgumentException -> 0x00d0 }
            X.1xA r23 = r14.BD0()     // Catch:{ all -> 0x00c6 }
            java.util.Iterator r22 = r26.iterator()     // Catch:{ all -> 0x00bc }
            r21 = 0
        L_0x0042:
            boolean r0 = r22.hasNext()     // Catch:{ all -> 0x00b8 }
            if (r0 == 0) goto L_0x00aa
            java.lang.Object r3 = r22.next()     // Catch:{ all -> 0x00b8 }
            X.1E7 r3 = (X.AnonymousClass1E7) r3     // Catch:{ all -> 0x00b8 }
            java.lang.String r2 = "wa_contacts"
            java.lang.String r18 = "wa_contacts._id = ?"
            r15 = 1
            java.lang.String[] r1 = new java.lang.String[r15]     // Catch:{ all -> 0x00b8 }
            long r16 = r3.A0J()     // Catch:{ all -> 0x00b8 }
            java.lang.String r0 = java.lang.String.valueOf(r16)     // Catch:{ all -> 0x00b8 }
            r1[r24] = r0     // Catch:{ all -> 0x00b8 }
            r0 = r18
            long r19 = X.C24861Ly.A01(r13, r14, r2, r0, r1)     // Catch:{ all -> 0x00b8 }
            r17 = 1
            int r0 = (r19 > r17 ? 1 : (r19 == r17 ? 0 : -1))
            if (r0 != 0) goto L_0x006e
            goto L_0x0092
        L_0x006e:
            java.lang.String r16 = "wa_contacts.display_name = ? AND wa_contacts.jid = ?"
            java.lang.String[] r1 = new java.lang.String[r12]     // Catch:{ all -> 0x00b8 }
            java.lang.String r0 = r3.A0K()     // Catch:{ all -> 0x00b8 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x00b8 }
            r1[r24] = r0     // Catch:{ all -> 0x00b8 }
            X.1BI r0 = r3.A0J     // Catch:{ all -> 0x00b8 }
            java.lang.String r0 = r0.getRawString()     // Catch:{ all -> 0x00b8 }
            r1[r15] = r0     // Catch:{ all -> 0x00b8 }
            r0 = r16
            long r1 = X.C24861Ly.A01(r13, r14, r2, r0, r1)     // Catch:{ all -> 0x00b8 }
            int r0 = (r1 > r17 ? 1 : (r1 == r17 ? 0 : -1))
            r1 = 0
            if (r0 != 0) goto L_0x0093
            r1 = 1
            goto L_0x0093
        L_0x0092:
            r1 = 1
        L_0x0093:
            if (r21 != 0) goto L_0x0099
            r21 = 0
            if (r1 == 0) goto L_0x009b
        L_0x0099:
            r21 = 1
        L_0x009b:
            r3.A0R = r11     // Catch:{ all -> 0x00b8 }
            r3.A0T = r11     // Catch:{ all -> 0x00b8 }
            r3.A0H = r11     // Catch:{ all -> 0x00b8 }
            r3.A01 = r12     // Catch:{ all -> 0x00b8 }
            X.1E7 r0 = r3.A0I     // Catch:{ all -> 0x00b8 }
            if (r0 == 0) goto L_0x0042
            r3.A0I = r11     // Catch:{ all -> 0x00b8 }
            goto L_0x0042
        L_0x00aa:
            r23.A00()     // Catch:{ all -> 0x00b8 }
            r23.close()     // Catch:{ all -> 0x00b4 }
            r14.close()     // Catch:{ IllegalArgumentException -> 0x00d2 }
            goto L_0x00dc
        L_0x00b4:
            r1 = move-exception
            r24 = r21
            goto L_0x00c7
        L_0x00b8:
            r1 = move-exception
            r24 = r21
            goto L_0x00bd
        L_0x00bc:
            r1 = move-exception
        L_0x00bd:
            r23.close()     // Catch:{ all -> 0x00c1 }
            goto L_0x00c5
        L_0x00c1:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x00c6 }
        L_0x00c5:
            throw r1     // Catch:{ all -> 0x00c6 }
        L_0x00c6:
            r1 = move-exception
        L_0x00c7:
            r14.close()     // Catch:{ all -> 0x00cb }
            goto L_0x00cf
        L_0x00cb:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IllegalArgumentException -> 0x00d0 }
        L_0x00cf:
            throw r1     // Catch:{ IllegalArgumentException -> 0x00d0 }
        L_0x00d0:
            r1 = move-exception
            goto L_0x00d5
        L_0x00d2:
            r1 = move-exception
            r24 = r21
        L_0x00d5:
            java.lang.String r0 = "ContactManagerDatabase/unable to remove contact "
            X.C17960vV.A09(r0, r1)
            r21 = r24
        L_0x00dc:
            if (r21 == 0) goto L_0x00f3
            r0 = r25
            X.00H r0 = r0.A09
            java.lang.Object r3 = r0.get()
            X.10T r3 = (X.AnonymousClass10T) r3
            r2 = 6
            X.35V r1 = new X.35V
            r0 = r26
            r1.<init>(r0, r2)
            r3.notifyAllObservers(r1)
        L_0x00f3:
            X.0ve r2 = r10.A0H
            r1 = 10624(0x2980, float:1.4887E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0151
            X.1Lo r0 = r10.A02
            X.00H r0 = r0.A00
            java.lang.Object r1 = r0.get()
            X.1Ly r1 = (X.C24861Ly) r1
            r0 = 4
            android.content.ContentValues r12 = new android.content.ContentValues
            r12.<init>(r0)
            r12.put(r9, r11)
            r12.put(r8, r11)
            r12.put(r6, r7)
            r12.put(r4, r5)
            X.1Lt r0 = r1.A00
            X.1au r3 = r0.A06()
            X.1xA r2 = r3.BD0()     // Catch:{ all -> 0x0147 }
            java.util.Iterator r1 = r26.iterator()     // Catch:{ all -> 0x0140 }
        L_0x0129:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0140 }
            if (r0 == 0) goto L_0x0139
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0140 }
            X.1E7 r0 = (X.AnonymousClass1E7) r0     // Catch:{ all -> 0x0140 }
            X.AnonymousClass2Q6.A07(r12, r0, r3)     // Catch:{ all -> 0x0140 }
            goto L_0x0129
        L_0x0139:
            r2.A00()     // Catch:{ all -> 0x0140 }
            r2.close()     // Catch:{ all -> 0x0147 }
            goto L_0x014e
        L_0x0140:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0142 }
        L_0x0142:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x0147 }
            throw r0     // Catch:{ all -> 0x0147 }
        L_0x0147:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0149 }
        L_0x0149:
            r0 = move-exception
            X.CDX.A00(r3, r1)
            throw r0
        L_0x014e:
            r3.close()
        L_0x0151:
            java.util.Iterator r2 = r26.iterator()
        L_0x0155:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0169
            java.lang.Object r0 = r2.next()
            X.1E7 r0 = (X.AnonymousClass1E7) r0
            X.1MA r1 = r10.A03
            X.1BI r0 = r0.A0J
            r1.A0C(r0)
            goto L_0x0155
        L_0x0169:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1M9.A0w(java.util.List):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x010d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0111, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0114, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0115, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0118, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0x(java.util.Set r11) {
        /*
            r10 = this;
            X.1M2 r5 = r10.A04
            X.1Lt r0 = r5.A00     // Catch:{ IllegalArgumentException -> 0x00b7 }
            X.1au r6 = r0.A06()     // Catch:{ IllegalArgumentException -> 0x00b7 }
            X.1xA r9 = r6.BD0()     // Catch:{ all -> 0x00ad }
            java.util.Iterator r8 = r11.iterator()     // Catch:{ all -> 0x00a3 }
        L_0x0010:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x00a3 }
            if (r0 == 0) goto L_0x0099
            java.lang.Object r3 = r8.next()     // Catch:{ all -> 0x00a3 }
            X.1E7 r3 = (X.AnonymousClass1E7) r3     // Catch:{ all -> 0x00a3 }
            r0 = 9
            android.content.ContentValues r7 = new android.content.ContentValues     // Catch:{ all -> 0x00a3 }
            r7.<init>(r0)     // Catch:{ all -> 0x00a3 }
            java.lang.String r1 = "given_name"
            java.lang.String r0 = r3.A0T     // Catch:{ all -> 0x00a3 }
            r7.put(r1, r0)     // Catch:{ all -> 0x00a3 }
            java.lang.String r1 = "family_name"
            java.lang.String r0 = r3.A0S     // Catch:{ all -> 0x00a3 }
            r7.put(r1, r0)     // Catch:{ all -> 0x00a3 }
            java.lang.String r1 = "display_name"
            java.lang.String r0 = r3.A0K()     // Catch:{ all -> 0x00a3 }
            r7.put(r1, r0)     // Catch:{ all -> 0x00a3 }
            java.lang.String r1 = "is_whatsapp_user"
            r2 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x00a3 }
            r7.put(r1, r0)     // Catch:{ all -> 0x00a3 }
            java.lang.String r1 = "wa_name"
            java.lang.String r0 = r3.A0c     // Catch:{ all -> 0x00a3 }
            r7.put(r1, r0)     // Catch:{ all -> 0x00a3 }
            java.lang.String r1 = "sync_policy"
            int r0 = r3.A09     // Catch:{ all -> 0x00a3 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00a3 }
            r7.put(r1, r0)     // Catch:{ all -> 0x00a3 }
            java.lang.String r4 = "raw_contact_id"
            X.2lf r0 = r3.A0H     // Catch:{ all -> 0x00a3 }
            if (r0 != 0) goto L_0x0061
            r0 = 0
            goto L_0x0063
        L_0x0061:
            long r0 = r0.A00     // Catch:{ all -> 0x00a3 }
        L_0x0063:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00a3 }
            r7.put(r4, r0)     // Catch:{ all -> 0x00a3 }
            X.2lf r0 = r3.A0H     // Catch:{ all -> 0x00a3 }
            if (r0 == 0) goto L_0x0077
            java.lang.String r1 = r0.A01     // Catch:{ all -> 0x00a3 }
            if (r1 == 0) goto L_0x0077
            java.lang.String r0 = "number"
            r7.put(r0, r1)     // Catch:{ all -> 0x00a3 }
        L_0x0077:
            java.lang.String r1 = "is_contact_synced"
            int r0 = r3.A01     // Catch:{ all -> 0x00a3 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00a3 }
            r7.put(r1, r0)     // Catch:{ all -> 0x00a3 }
            long r0 = r3.A0J()     // Catch:{ all -> 0x00a3 }
            java.lang.String r4 = "wa_contacts"
            java.lang.String r3 = "_id = ?"
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ all -> 0x00a3 }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x00a3 }
            r0 = 0
            r2[r0] = r1     // Catch:{ all -> 0x00a3 }
            X.C24861Ly.A01(r7, r6, r4, r3, r2)     // Catch:{ all -> 0x00a3 }
            goto L_0x0010
        L_0x0099:
            r9.A00()     // Catch:{ all -> 0x00a3 }
            r9.close()     // Catch:{ all -> 0x00ad }
            r6.close()     // Catch:{ IllegalArgumentException -> 0x00b7 }
            goto L_0x00bd
        L_0x00a3:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x00a8 }
            goto L_0x00ac
        L_0x00a8:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x00ad }
        L_0x00ac:
            throw r1     // Catch:{ all -> 0x00ad }
        L_0x00ad:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x00b2 }
            goto L_0x00b6
        L_0x00b2:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IllegalArgumentException -> 0x00b7 }
        L_0x00b6:
            throw r1     // Catch:{ IllegalArgumentException -> 0x00b7 }
        L_0x00b7:
            r1 = move-exception
            java.lang.String r0 = "ContactManagerDatabase/unable to update contacts"
            X.C17960vV.A09(r0, r1)
        L_0x00bd:
            X.00H r0 = r5.A09
            java.lang.Object r1 = r0.get()
            X.2Kb r1 = (X.C47812Kb) r1
            r0 = 5
            X.AnonymousClass35V.A00(r1, r11, r0)
            r11.size()
            X.0ve r2 = r10.A0H
            r1 = 10624(0x2980, float:1.4887E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x011c
            X.1Lo r0 = r10.A02
            X.00H r0 = r0.A00
            java.lang.Object r0 = r0.get()
            X.1Ly r0 = (X.C24861Ly) r0
            X.1Lt r0 = r0.A00
            X.1au r4 = r0.A06()
            X.1xA r3 = r4.BD0()     // Catch:{ all -> 0x0112 }
            java.util.Iterator r2 = r11.iterator()     // Catch:{ all -> 0x010b }
        L_0x00f0:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x010b }
            if (r0 == 0) goto L_0x0104
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x010b }
            X.1E7 r1 = (X.AnonymousClass1E7) r1     // Catch:{ all -> 0x010b }
            android.content.ContentValues r0 = X.AnonymousClass2Q6.A06(r1)     // Catch:{ all -> 0x010b }
            X.AnonymousClass2Q6.A07(r0, r1, r4)     // Catch:{ all -> 0x010b }
            goto L_0x00f0
        L_0x0104:
            r3.A00()     // Catch:{ all -> 0x010b }
            r3.close()     // Catch:{ all -> 0x0112 }
            goto L_0x0119
        L_0x010b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x010d }
        L_0x010d:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ all -> 0x0112 }
            throw r0     // Catch:{ all -> 0x0112 }
        L_0x0112:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0114 }
        L_0x0114:
            r0 = move-exception
            X.CDX.A00(r4, r1)
            throw r0
        L_0x0119:
            r4.close()
        L_0x011c:
            X.11A r2 = r10.A0I
            r1 = 21
            X.3Bv r0 = new X.3Bv
            r0.<init>(r10, r11, r1)
            r2.A00(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1M9.A0x(java.util.Set):void");
    }

    public boolean A0y() {
        int A0I2 = this.A04.A0I();
        StringBuilder sb = new StringBuilder();
        sb.append("ContactManager/indivcount count=");
        sb.append(A0I2);
        Log.i(sb.toString());
        if (A0I2 > 0) {
            return true;
        }
        return false;
    }

    public void Bkj() {
        C24671Lf r3 = this.A05;
        AnonymousClass11S r0 = this.A01;
        r0.A0I();
        PhoneUserJid phoneUserJid = r0.A0E;
        C17960vV.A07(phoneUserJid);
        r3.notifyAllObservers(new AnonymousClass35V(phoneUserJid, 16));
    }

    public void Bmw(UserJid userJid) {
        this.A03.A0C(userJid);
    }

    public void Bpx(AnonymousClass1E7 r3) {
        this.A03.A0C((AnonymousClass1BI) r3.A06(AnonymousClass1BI.class));
    }

    public void Bq3(Collection collection) {
        this.A0I.A00(new C70623Bv(this, collection, 17));
        A05(collection);
    }

    public void Bq5(Collection collection, boolean z) {
        if (z) {
            this.A03.A02.clear();
            C24671Lf r2 = this.A05;
            r2.notifyAllObservers(new AnonymousClass7KX(15));
            r2.notifyAllObservers(new AnonymousClass35V(collection, 13));
        }
    }

    public void BwP(Collection collection) {
        C18070vi.A0d(collection, 0);
        ((AnonymousClass10T) this.A0M.get()).notifyAllObservers(new C97014om(collection, 8));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AnonymousClass1E7 r1 = (AnonymousClass1E7) it.next();
            C24791Lr r0 = this.A07;
            r0.A03(r1);
            r0.A04(r1);
        }
    }

    private void A02(AnonymousClass1E7 r4) {
        UserJid userJid;
        String string;
        A06(this, r4);
        if (r4 != null && (userJid = (UserJid) r4.A06(UserJid.class)) != null && C42701yb.A01(userJid)) {
            AnonymousClass00H r1 = this.A0J;
            if (((AnonymousClass1PW) r1.get()).A08()) {
                string = ((AnonymousClass1PW) r1.get()).A06(userJid);
            } else {
                Context context = this.A0A.A00;
                C18070vi.A0d(context, 0);
                string = context.getString(2131898736);
                C18070vi.A0X(string);
            }
            r4.A0R = string;
        }
    }

    public static void A04(String str, String str2, Collection collection) {
        int size = collection.size();
        StringBuilder sb = new StringBuilder();
        sb.append("ContactManager/logContacts ");
        sb.append(str);
        sb.append("/");
        sb.append(str2);
        sb.append("/count ");
        sb.append(size);
        Log.i(sb.toString());
    }

    private void A05(Collection collection) {
        if (collection.size() == 1) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                this.A03.A0C((AnonymousClass1BI) ((AnonymousClass1E7) it.next()).A06(AnonymousClass1BI.class));
            }
            return;
        }
        AnonymousClass1MA r4 = this.A03;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            Jid A062 = ((AnonymousClass1E7) it2.next()).A06(AnonymousClass1BI.class);
            if (A062 != null) {
                r4.A02.remove(A062);
            }
            if (A062 instanceof UserJid) {
                arrayList.add(A062);
            }
        }
        C24851Lx r6 = r4.A00;
        if (C18020vd.A05(C18040vf.A01, r6.A01, 8573) && !arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                Object next = it3.next();
                if (next instanceof PhoneUserJid) {
                    arrayList2.add(next);
                }
            }
            Set A12 = C29431cG.A12(arrayList2);
            ArrayList arrayList3 = new ArrayList();
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                Object next2 = it4.next();
                if (next2 instanceof AnonymousClass1E1) {
                    arrayList3.add(next2);
                }
            }
            Set A122 = C29431cG.A12(arrayList3);
            C24751Ln r7 = r6.A00;
            Set<Map.Entry> entrySet = r7.A0L(A12).entrySet();
            int A032 = C200610r.A03(C29351c6.A0C(entrySet, 10));
            if (A032 < 16) {
                A032 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(A032);
            for (Map.Entry entry : entrySet) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
            Set<Map.Entry> entrySet2 = r7.A0H(A122).entrySet();
            int A033 = C200610r.A03(C29351c6.A0C(entrySet2, 10));
            if (A033 < 16) {
                A033 = 16;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(A033);
            for (Map.Entry entry2 : entrySet2) {
                linkedHashMap2.put(entry2.getValue(), entry2.getKey());
            }
            for (Object remove : AnonymousClass1D7.A09(linkedHashMap, linkedHashMap2).values()) {
                r4.A02.remove(remove);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0070, code lost:
        r1 = r9.A04;
        r4 = r1.A0J(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0076, code lost:
        if (r4 == null) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007e, code lost:
        if (X.C22971Dz.A0d(r4.A0J) == false) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0080, code lost:
        r3 = r1.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008c, code lost:
        if (X.C18020vd.A05(X.C18040vf.A01, r3.A01, 8573) == false) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008e, code lost:
        r1 = (com.whatsapp.jid.UserJid) r4.A0J;
        r0 = r1 instanceof X.AnonymousClass1E2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0094, code lost:
        if (r8 == false) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0096, code lost:
        if (r0 != false) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0098, code lost:
        r0 = r3.A01(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x009c, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x009e, code lost:
        r4.A0J = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a0, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a1, code lost:
        if (r0 != false) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a3, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a4, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003b, code lost:
        if (r4 != null) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass1E7 A0B(android.content.Intent r10) {
        /*
            r9 = this;
            android.net.Uri r0 = r10.getData()
            boolean r0 = X.C62952sG.A01(r0)
            if (r0 == 0) goto L_0x00cf
            java.lang.String r1 = "extra_contact_is_lid"
            boolean r0 = r10.hasExtra(r1)
            if (r0 == 0) goto L_0x00b0
            r0 = 0
            boolean r8 = r10.getBooleanExtra(r1, r0)
            android.net.Uri r1 = r10.getData()
            X.C18070vi.A0d(r1, r0)
            boolean r0 = X.C62952sG.A01(r1)
            if (r0 == 0) goto L_0x00a8
            long r2 = android.content.ContentUris.parseId(r1)
            X.1MA r6 = r9.A03
            X.00H r1 = r6.A01
            r1.get()
            r4 = -2
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x003e
            java.lang.Object r4 = r1.get()
            X.1E7 r4 = (X.AnonymousClass1E7) r4
            if (r4 == 0) goto L_0x0070
        L_0x003d:
            return r4
        L_0x003e:
            java.util.Map r7 = r6.A02
            monitor-enter(r7)
            java.util.Collection r0 = r7.values()     // Catch:{ all -> 0x00a5 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x00a5 }
        L_0x0049:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x00a5 }
            if (r0 == 0) goto L_0x006f
            java.lang.Object r4 = r1.next()     // Catch:{ all -> 0x00a5 }
            X.1E7 r4 = (X.AnonymousClass1E7) r4     // Catch:{ all -> 0x00a5 }
            long r5 = r4.A0J()     // Catch:{ all -> 0x00a5 }
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x0049
            if (r8 != 0) goto L_0x0060
            goto L_0x0067
        L_0x0060:
            X.1BI r0 = r4.A0J     // Catch:{ all -> 0x00a5 }
            boolean r0 = r0 instanceof X.AnonymousClass1E2     // Catch:{ all -> 0x00a5 }
            if (r0 == 0) goto L_0x0049
            goto L_0x006d
        L_0x0067:
            X.1BI r0 = r4.A0J     // Catch:{ all -> 0x00a5 }
            boolean r0 = r0 instanceof X.AnonymousClass1E2     // Catch:{ all -> 0x00a5 }
            if (r0 != 0) goto L_0x0049
        L_0x006d:
            monitor-exit(r7)     // Catch:{ all -> 0x00a5 }
            goto L_0x00a4
        L_0x006f:
            monitor-exit(r7)     // Catch:{ all -> 0x00a5 }
        L_0x0070:
            X.1M2 r1 = r9.A04
            X.1E7 r4 = r1.A0J(r2)
            if (r4 == 0) goto L_0x003d
            X.1BI r0 = r4.A0J
            boolean r0 = X.C22971Dz.A0d(r0)
            if (r0 == 0) goto L_0x003d
            X.1Lx r3 = r1.A04
            X.0ve r2 = r3.A01
            X.0vf r1 = X.C18040vf.A01
            r0 = 8573(0x217d, float:1.2013E-41)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 == 0) goto L_0x003d
            X.1BI r1 = r4.A0J
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            boolean r0 = r1 instanceof X.AnonymousClass1E2
            if (r8 == 0) goto L_0x00a1
            if (r0 != 0) goto L_0x003d
        L_0x0098:
            com.whatsapp.jid.UserJid r0 = r3.A01(r1)
            if (r0 == 0) goto L_0x00cf
            r4.A0J = r0
            return r4
        L_0x00a1:
            if (r0 != 0) goto L_0x0098
            return r4
        L_0x00a4:
            return r4
        L_0x00a5:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x00a5 }
            throw r0
        L_0x00a8:
            java.lang.String r1 = "Check failed."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x00b0:
            android.net.Uri r1 = r10.getData()
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            boolean r0 = X.C62952sG.A01(r1)
            if (r0 == 0) goto L_0x00c7
            long r0 = android.content.ContentUris.parseId(r1)
            X.1E7 r4 = r9.A0A(r0)
            return r4
        L_0x00c7:
            java.lang.String r1 = "Check failed."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x00cf:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1M9.A0B(android.content.Intent):X.1E7");
    }

    public AnonymousClass1E7 A0H(AnonymousClass1BI r3) {
        AnonymousClass1E7 A0E2 = A0E(r3);
        if (A0E2 != null) {
            return A0E2;
        }
        AnonymousClass1E7 r1 = new AnonymousClass1E7(r3);
        this.A04.A0P(r1);
        return r1;
    }

    public ArrayList A0O(Set set) {
        AnonymousClass1E7 A0E2;
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        boolean A052 = C18020vd.A05(C18040vf.A02, this.A0H, 11575);
        AnonymousClass1M2 r2 = this.A04;
        if (A052) {
            Iterator it = AnonymousClass1M2.A08(r2, false).iterator();
            while (it.hasNext()) {
                AnonymousClass1BI r1 = (AnonymousClass1BI) it.next();
                if (set.contains(r1) && (A0E2 = A0E(r1)) != null) {
                    arrayList.add(A0E2);
                }
            }
        } else {
            ArrayList arrayList2 = new ArrayList();
            AnonymousClass11S r0 = r2.A03;
            r0.A0I();
            String A062 = C22971Dz.A06(r0.A0E);
            String[] strArr = new String[2];
            if (A062 == null) {
                A062 = C173438v4.A00.getRawString();
            }
            strArr[0] = A062;
            strArr[1] = C42541yL.A00.getRawString();
            C28781at A053 = r2.A00.get();
            try {
                Cursor A032 = C24861Ly.A03(A053, C42631yU.A00(false, false), "GET_SIDE_LIST_CONTACTS", strArr);
                while (A032.moveToNext()) {
                    try {
                        AnonymousClass1E7 A022 = C42651yW.A02(A032, r2.A00);
                        if (A022.A0J != null) {
                            arrayList2.add(A022);
                        }
                    } catch (IllegalStateException e) {
                        AnonymousClass1M2.A0G(e, "ContactManagerDatabase/getSideListContacts/", -1, arrayList2.size());
                    } catch (Throwable th) {
                        if (A032 != null) {
                            A032.close();
                        }
                        throw th;
                    }
                }
                if (A032 != null) {
                    A032.close();
                }
                A053.close();
                arrayList2.size();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    AnonymousClass1E7 r12 = (AnonymousClass1E7) it2.next();
                    if (set.contains(r12.A0J)) {
                        arrayList.add(r12);
                    }
                }
            } catch (Throwable th2) {
                try {
                    A053.close();
                    throw th2;
                } catch (Throwable th3) {
                    AnonymousClass0DT.A00(th2, th3);
                    throw th2;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("ContactManager/returned ");
        sb.append(arrayList.size());
        sb.append(" sidelist sync pending contacts | time: ");
        sb.append(System.currentTimeMillis() - currentTimeMillis);
        Log.i(sb.toString());
        return arrayList;
    }

    public HashMap A0Q(Collection collection) {
        HashMap A0P = A0P(collection);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AnonymousClass1BI r2 = (AnonymousClass1BI) it.next();
            if (!A0P.containsKey(r2)) {
                AnonymousClass1E7 r1 = new AnonymousClass1E7(r2);
                A0P.put(r2, r1);
                this.A04.A0P(r1);
            }
        }
        return A0P;
    }

    public void A0b(GroupJid groupJid, int i) {
        AnonymousClass1E7 A0H2 = A0H(groupJid);
        if (A0H2.A05 != i) {
            A0H2.A05 = i;
            this.A04.A0R(A0H2);
            this.A03.A0B(A0H2);
        }
    }

    public void A0c(GroupJid groupJid, boolean z) {
        AnonymousClass1E7 A0H2 = A0H(groupJid);
        if (A0H2.A0t != z) {
            A0H2.A0t = z;
            this.A04.A0R(A0H2);
            this.A03.A0B(A0H2);
        }
    }

    public void A0d(GroupJid groupJid, boolean z) {
        AnonymousClass1E7 A0H2 = A0H(groupJid);
        if (A0H2.A0n != z) {
            A0H2.A0n = z;
            this.A04.A0R(A0H2);
            this.A03.A0B(A0H2);
        }
    }

    public void A0e(AnonymousClass1EC r3, int i) {
        AnonymousClass1E7 A0H2 = A0H(r3);
        if (A0H2.A04 != i) {
            A0H2.A04 = i;
            this.A04.A0R(A0H2);
            this.A03.A0B(A0H2);
        }
    }

    public void A0f(AnonymousClass1EC r3, C42661yX r4) {
        AnonymousClass1E7 A0H2 = A0H(r3);
        A0H2.A09(r4);
        this.A04.A0R(A0H2);
        this.A03.A0B(A0H2);
    }

    public void A0g(AnonymousClass1EC r3, boolean z) {
        AnonymousClass1E7 A0H2 = A0H(r3);
        if (A0H2.A0v != z) {
            A0H2.A0v = z;
            this.A04.A0R(A0H2);
            this.A03.A0B(A0H2);
        }
    }

    public void A0h(AnonymousClass1EC r3, boolean z) {
        AnonymousClass1E7 A0H2 = A0H(r3);
        if (A0H2.A0w != z) {
            A0H2.A0w = z;
            this.A04.A0R(A0H2);
            this.A03.A0B(A0H2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b2, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b5, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0p(java.util.Collection r10) {
        /*
            r9 = this;
            java.util.Iterator r8 = r10.iterator()
        L_0x0004:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00b6
            java.lang.Object r5 = r8.next()
            X.1E7 r5 = (X.AnonymousClass1E7) r5
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r7 = r5.A06(r0)
            X.C17960vV.A07(r7)
            com.whatsapp.jid.UserJid r7 = (com.whatsapp.jid.UserJid) r7
            X.1M2 r2 = r9.A04
            boolean r4 = r5.A10
            r0 = 1
            android.content.ContentValues r1 = new android.content.ContentValues
            r1.<init>(r0)
            java.lang.String r3 = "is_whatsapp_user"
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r1.put(r3, r0)
            X.1Lt r0 = r2.A00     // Catch:{ IllegalArgumentException -> 0x0045 }
            X.1au r0 = r0.A06()     // Catch:{ IllegalArgumentException -> 0x0045 }
            X.AnonymousClass1M2.A09(r1, r2, r0, r7)     // Catch:{ all -> 0x003b }
            r0.close()     // Catch:{ IllegalArgumentException -> 0x0045 }
            goto L_0x0062
        L_0x003b:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x0040 }
            goto L_0x0044
        L_0x0040:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IllegalArgumentException -> 0x0045 }
        L_0x0044:
            throw r1     // Catch:{ IllegalArgumentException -> 0x0045 }
        L_0x0045:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "ContactManagerDatabase/updateContactWhatsAppUserState failed "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = ", "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            X.C17960vV.A09(r0, r2)
        L_0x0062:
            X.1Lo r0 = r9.A02
            boolean r2 = r5.A10
            r6 = 0
            X.C18070vi.A0d(r7, r6)
            X.00H r0 = r0.A00
            java.lang.Object r1 = r0.get()
            X.1Ly r1 = (X.C24861Ly) r1
            r0 = 1
            android.content.ContentValues r4 = new android.content.ContentValues
            r4.<init>(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r4.put(r3, r0)
            X.1Lt r0 = r1.A00
            X.1au r3 = r0.A06()
            X.C18070vi.A0b(r3)     // Catch:{ all -> 0x00af }
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x00af }
            java.lang.String r0 = r7.getRawString()     // Catch:{ all -> 0x00af }
            r2[r6] = r0     // Catch:{ all -> 0x00af }
            java.lang.String r1 = "wa_address_book"
            java.lang.String r0 = "jid = ?"
            X.C24861Ly.A01(r4, r3, r1, r0, r2)     // Catch:{ all -> 0x00af }
            r3.close()
            X.1MA r0 = r9.A03
            r0.A0B(r5)
            X.11A r2 = r9.A0I
            r1 = 27
            X.3Bv r0 = new X.3Bv
            r0.<init>(r9, r5, r1)
            r2.A00(r0)
            goto L_0x0004
        L_0x00af:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00b1 }
        L_0x00b1:
            r0 = move-exception
            X.CDX.A00(r3, r1)
            throw r0
        L_0x00b6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1M9.A0p(java.util.Collection):void");
    }

    public boolean A0z(AnonymousClass1BI r3) {
        AnonymousClass1E7 A0E2 = A0E(r3);
        if (A0E2 == null || !A0E2.A0B()) {
            return false;
        }
        return true;
    }

    public void Bq0(Collection collection) {
        A05(collection);
        this.A0I.A00(new C70623Bv(this, collection, 19));
    }
}
