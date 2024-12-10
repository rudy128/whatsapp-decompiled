package X;

import com.whatsapp.util.Log;

/* renamed from: X.1P0  reason: invalid class name */
public final class AnonymousClass1P0 {
    public int A00;
    public C52962bl A01;
    public final AnonymousClass11P A02;
    public final AnonymousClass1MH A03;
    public final C18030ve A04;
    public final AnonymousClass1MK A05;

    public AnonymousClass1P0(AnonymousClass11P r2, AnonymousClass1MH r3, C18030ve r4, AnonymousClass1MK r5) {
        C18070vi.A0d(r2, 1);
        C18070vi.A0d(r4, 2);
        C18070vi.A0d(r3, 3);
        C18070vi.A0d(r5, 4);
        this.A02 = r2;
        this.A04 = r4;
        this.A03 = r3;
        this.A05 = r5;
    }

    public static final boolean A00(C60002nE r3, byte[] bArr) {
        C18070vi.A0d(bArr, 1);
        StringBuilder sb = new StringBuilder();
        sb.append("SignalIdentityKeyStore/trusting ");
        sb.append(r3);
        sb.append(" key pair with ");
        sb.append(bArr);
        sb.append(" as identity key");
        Log.i(sb.toString());
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0095, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        X.CDX.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0099, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00aa, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ad, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ae, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b1, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.HashMap A04(java.util.List r14) {
        /*
            r13 = this;
            r0 = 0
            X.C18070vi.A0d(r14, r0)
            java.util.Iterator r4 = r14.iterator()
        L_0x0008:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x001e
            java.lang.Object r3 = r4.next()
            X.2nE r3 = (X.C60002nE) r3
            X.1MK r2 = r13.A05
            java.lang.String r1 = "identities"
            java.lang.String r0 = "removeIdentity"
            r2.A07(r3, r1, r0)
            goto L_0x0008
        L_0x001e:
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            X.1MH r7 = r13.A03
            X.1au r4 = r7.A06()
            X.1xA r5 = r4.BD0()     // Catch:{ all -> 0x00ab }
            java.util.Iterator r12 = r14.iterator()     // Catch:{ all -> 0x00a4 }
        L_0x0031:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x00a4 }
            if (r0 == 0) goto L_0x009a
            java.lang.Object r9 = r12.next()     // Catch:{ all -> 0x00a4 }
            X.2nE r9 = (X.C60002nE) r9     // Catch:{ all -> 0x00a4 }
            r0 = 0
            X.C18070vi.A0d(r9, r0)     // Catch:{ all -> 0x00a4 }
            X.1MK r1 = r13.A05     // Catch:{ all -> 0x00a4 }
            java.lang.String r0 = "removeIdentity"
            java.lang.String r10 = "identities"
            r1.A07(r9, r10, r0)     // Catch:{ all -> 0x00a4 }
            X.1au r6 = r7.A06()     // Catch:{ all -> 0x00a4 }
            r0 = r6
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0093 }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x0093 }
            java.lang.String r2 = "recipient_id =? AND recipient_type = ? AND device_id =?"
            java.lang.String[] r1 = r9.A00()     // Catch:{ all -> 0x0093 }
            java.lang.String r0 = "SignalIdentityKeyStore/removeIdentity"
            int r0 = r3.A04(r10, r2, r0, r1)     // Catch:{ all -> 0x0093 }
            long r2 = (long) r0     // Catch:{ all -> 0x0093 }
            r10 = 0
            int r0 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x0082
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0093 }
            r1.<init>()     // Catch:{ all -> 0x0093 }
            java.lang.String r0 = "SignalIdentityKeyStore/remove deleted "
            r1.append(r0)     // Catch:{ all -> 0x0093 }
            r1.append(r2)     // Catch:{ all -> 0x0093 }
            java.lang.String r0 = " identities for "
            r1.append(r0)     // Catch:{ all -> 0x0093 }
            r1.append(r9)     // Catch:{ all -> 0x0093 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0093 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0093 }
        L_0x0082:
            int r1 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            r0 = 0
            if (r1 <= 0) goto L_0x0088
            r0 = 1
        L_0x0088:
            r6.close()     // Catch:{ all -> 0x00a4 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x00a4 }
            r8.put(r9, r0)     // Catch:{ all -> 0x00a4 }
            goto L_0x0031
        L_0x0093:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0095 }
        L_0x0095:
            r0 = move-exception
            X.CDX.A00(r6, r1)     // Catch:{ all -> 0x00a4 }
            throw r0     // Catch:{ all -> 0x00a4 }
        L_0x009a:
            r5.A00()     // Catch:{ all -> 0x00a4 }
            r5.close()     // Catch:{ all -> 0x00ab }
            r4.close()
            return r8
        L_0x00a4:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00a6 }
        L_0x00a6:
            r0 = move-exception
            X.CDX.A00(r5, r1)     // Catch:{ all -> 0x00ab }
            throw r0     // Catch:{ all -> 0x00ab }
        L_0x00ab:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00ad }
        L_0x00ad:
            r0 = move-exception
            X.CDX.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1P0.A04(java.util.List):java.util.HashMap");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x014a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        X.CDX.A00(r11, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x014e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x018e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x018f, code lost:
        X.CDX.A00(r9, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0192, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map A05(java.util.Set r16) {
        /*
            r15 = this;
            r5 = 0
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            r3 = r16
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x000f
            return r4
        L_0x000f:
            java.util.Iterator r7 = r3.iterator()
        L_0x0013:
            boolean r0 = r7.hasNext()
            java.lang.String r6 = "getIdentityPublicKeys"
            if (r0 == 0) goto L_0x0029
            java.lang.Object r2 = r7.next()
            X.2nE r2 = (X.C60002nE) r2
            X.1MK r1 = r15.A05
            java.lang.String r0 = "identities"
            r1.A07(r2, r0, r6)
            goto L_0x0013
        L_0x0029:
            java.util.LinkedHashMap r13 = new java.util.LinkedHashMap
            r13.<init>()
            X.0ve r2 = r15.A04
            r1 = 6484(0x1954, float:9.086E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0045
            X.1MK r1 = r15.A05
            java.lang.String r0 = "identities"
            java.util.LinkedHashMap r0 = r1.A05(r6, r0, r3)
            r13.putAll(r0)
        L_0x0045:
            java.util.Set r0 = r13.keySet()
            java.util.Set r3 = X.C41841x9.A06(r0, r3)
            r0 = 10
            int r0 = X.C29351c6.A0C(r3, r0)
            int r1 = X.C200610r.A03(r0)
            r0 = 16
            if (r1 >= r0) goto L_0x005d
            r1 = 16
        L_0x005d:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>(r1)
            java.util.Iterator r1 = r3.iterator()
        L_0x0066:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0074
            java.lang.Object r0 = r1.next()
            r2.put(r0, r0)
            goto L_0x0066
        L_0x0074:
            r13.putAll(r2)
            java.util.Collection r0 = r13.values()
            java.util.Set r1 = X.C29431cG.A12(r0)
            X.2nE[] r0 = new X.C60002nE[r5]
            java.lang.Object[] r2 = r1.toArray(r0)
            r0 = 100
            X.23b r1 = new X.23b
            r1.<init>(r2, r0)
            X.1MH r0 = r15.A03
            X.1at r9 = r0.get()
            java.util.Iterator r14 = r1.iterator()     // Catch:{ all -> 0x018c }
        L_0x0096:
            boolean r0 = r14.hasNext()     // Catch:{ all -> 0x018c }
            if (r0 == 0) goto L_0x014f
            java.lang.Object r1 = r14.next()     // Catch:{ all -> 0x018c }
            X.2nE[] r1 = (X.C60002nE[]) r1     // Catch:{ all -> 0x018c }
            X.C18070vi.A0b(r9)     // Catch:{ all -> 0x018c }
            X.C18070vi.A0b(r1)     // Catch:{ all -> 0x018c }
            java.util.List r0 = X.C200410p.A0Q(r1)     // Catch:{ all -> 0x018c }
            java.lang.String[] r3 = X.AnonymousClass2TO.A00(r0)     // Catch:{ all -> 0x018c }
            r0 = r9
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x018c }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x018c }
            int r6 = r1.length     // Catch:{ all -> 0x018c }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x018c }
            r5.<init>()     // Catch:{ all -> 0x018c }
            java.lang.String r0 = "SELECT public_key, "
            r5.append(r0)     // Catch:{ all -> 0x018c }
            java.lang.String r0 = "timestamp, "
            r5.append(r0)     // Catch:{ all -> 0x018c }
            java.lang.String r0 = "recipient_id, "
            r5.append(r0)     // Catch:{ all -> 0x018c }
            java.lang.String r0 = "recipient_type, "
            r5.append(r0)     // Catch:{ all -> 0x018c }
            java.lang.String r0 = "device_id "
            r5.append(r0)     // Catch:{ all -> 0x018c }
            java.lang.String r0 = "FROM identities "
            r5.append(r0)     // Catch:{ all -> 0x018c }
            java.lang.String r0 = " WHERE "
            r5.append(r0)     // Catch:{ all -> 0x018c }
            r1 = 0
        L_0x00e0:
            if (r1 >= r6) goto L_0x00f3
            java.lang.String r0 = "(recipient_id = ? AND recipient_type = ? AND device_id = ?)"
            r5.append(r0)     // Catch:{ all -> 0x018c }
            int r0 = r6 + -1
            if (r1 == r0) goto L_0x00f0
            java.lang.String r0 = " OR "
            r5.append(r0)     // Catch:{ all -> 0x018c }
        L_0x00f0:
            int r1 = r1 + 1
            goto L_0x00e0
        L_0x00f3:
            java.lang.String r1 = r5.toString()     // Catch:{ all -> 0x018c }
            X.C18070vi.A0X(r1)     // Catch:{ all -> 0x018c }
            java.lang.String r0 = "SignalIdentityKeyStore/getIdentityPublicKeys"
            android.database.Cursor r11 = r2.A0A(r1, r0, r3)     // Catch:{ all -> 0x018c }
            java.lang.String r0 = "public_key"
            int r12 = r11.getColumnIndex(r0)     // Catch:{ all -> 0x0148 }
            java.lang.String r0 = "timestamp"
            int r10 = r11.getColumnIndex(r0)     // Catch:{ all -> 0x0148 }
            java.lang.String r0 = "recipient_id"
            int r8 = r11.getColumnIndex(r0)     // Catch:{ all -> 0x0148 }
            java.lang.String r0 = "recipient_type"
            int r7 = r11.getColumnIndex(r0)     // Catch:{ all -> 0x0148 }
            java.lang.String r0 = "device_id"
            int r6 = r11.getColumnIndex(r0)     // Catch:{ all -> 0x0148 }
        L_0x011f:
            boolean r0 = r11.moveToNext()     // Catch:{ all -> 0x0148 }
            if (r0 == 0) goto L_0x0143
            java.lang.String r5 = r11.getString(r8)     // Catch:{ all -> 0x0148 }
            int r3 = r11.getInt(r7)     // Catch:{ all -> 0x0148 }
            int r2 = r11.getInt(r6)     // Catch:{ all -> 0x0148 }
            java.lang.Integer r1 = X.AnonymousClass00R.A00     // Catch:{ all -> 0x0148 }
            X.2nE r0 = new X.2nE     // Catch:{ all -> 0x0148 }
            r0.<init>(r1, r5, r3, r2)     // Catch:{ all -> 0x0148 }
            byte[] r1 = r11.getBlob(r12)     // Catch:{ all -> 0x0148 }
            r11.getLong(r10)     // Catch:{ all -> 0x0148 }
            r4.put(r0, r1)     // Catch:{ all -> 0x0148 }
            goto L_0x011f
        L_0x0143:
            r11.close()     // Catch:{ all -> 0x018c }
            goto L_0x0096
        L_0x0148:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x014a }
        L_0x014a:
            r0 = move-exception
            X.CDX.A00(r11, r1)     // Catch:{ all -> 0x018c }
            throw r0     // Catch:{ all -> 0x018c }
        L_0x014f:
            r9.close()
            java.util.Set r2 = r13.entrySet()
            r0 = 10
            int r0 = X.C29351c6.A0C(r2, r0)
            int r1 = X.C200610r.A03(r0)
            r0 = 16
            if (r1 >= r0) goto L_0x0166
            r1 = 16
        L_0x0166:
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>(r1)
            java.util.Iterator r2 = r2.iterator()
        L_0x016f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x018b
            java.lang.Object r0 = r2.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            java.lang.Object r0 = r4.get(r0)
            r3.put(r1, r0)
            goto L_0x016f
        L_0x018b:
            return r3
        L_0x018c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x018e }
        L_0x018e:
            r0 = move-exception
            X.CDX.A00(r9, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1P0.A05(java.util.Set):java.util.Map");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0047, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004f, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0052, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A01() {
        /*
            r5 = this;
            java.lang.String r2 = "0"
            X.1MH r0 = r5.A03
            X.1at r3 = r0.get()
            r0 = 3
            java.lang.String[] r4 = new java.lang.String[r0]     // Catch:{ all -> 0x004c }
            r0 = -1
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x004c }
            r0 = 0
            r4[r0] = r1     // Catch:{ all -> 0x004c }
            r0 = 1
            r4[r0] = r2     // Catch:{ all -> 0x004c }
            r0 = 2
            r4[r0] = r2     // Catch:{ all -> 0x004c }
            r0 = r3
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x004c }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x004c }
            java.lang.String r1 = "SELECT next_prekey_id FROM identities WHERE recipient_id =? AND recipient_type = ? AND device_id =?"
            java.lang.String r0 = "SignalIdentityKeyStore/getNextPreKeyId"
            android.database.Cursor r2 = r2.A0A(r1, r0, r4)     // Catch:{ all -> 0x004c }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0045 }
            if (r0 == 0) goto L_0x003d
            java.lang.String r0 = "next_prekey_id"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0045 }
            int r0 = r2.getInt(r0)     // Catch:{ all -> 0x0045 }
            r2.close()     // Catch:{ all -> 0x004c }
            r3.close()
            return r0
        L_0x003d:
            java.lang.String r1 = "Missing entry for self in identities table"
            android.database.sqlite.SQLiteException r0 = new android.database.sqlite.SQLiteException     // Catch:{ all -> 0x0045 }
            r0.<init>(r1)     // Catch:{ all -> 0x0045 }
            throw r0     // Catch:{ all -> 0x0045 }
        L_0x0045:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0047 }
        L_0x0047:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x004c }
            throw r0     // Catch:{ all -> 0x004c }
        L_0x004c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x004e }
        L_0x004e:
            r0 = move-exception
            X.CDX.A00(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1P0.A01():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0051, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0052, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0055, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A02() {
        /*
            r5 = this;
            java.lang.String r2 = "0"
            int r0 = r5.A00
            if (r0 != 0) goto L_0x0059
            X.1MH r0 = r5.A03
            X.1at r3 = r0.get()
            r0 = 3
            java.lang.String[] r4 = new java.lang.String[r0]     // Catch:{ all -> 0x004f }
            r0 = -1
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x004f }
            r0 = 0
            r4[r0] = r1     // Catch:{ all -> 0x004f }
            r0 = 1
            r4[r0] = r2     // Catch:{ all -> 0x004f }
            r0 = 2
            r4[r0] = r2     // Catch:{ all -> 0x004f }
            r0 = r3
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x004f }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x004f }
            java.lang.String r1 = "SELECT registration_id FROM identities WHERE recipient_id =? AND recipient_type = ? AND device_id =?"
            java.lang.String r0 = "SignalIdentityKeyStore/getRegistrationId"
            android.database.Cursor r2 = r2.A0A(r1, r0, r4)     // Catch:{ all -> 0x004f }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0048 }
            if (r0 == 0) goto L_0x0040
            java.lang.String r0 = "registration_id"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0048 }
            int r0 = r2.getInt(r0)     // Catch:{ all -> 0x0048 }
            r5.A00 = r0     // Catch:{ all -> 0x0048 }
            r2.close()     // Catch:{ all -> 0x004f }
            goto L_0x0056
        L_0x0040:
            java.lang.String r1 = "Missing entry for self in identities table"
            android.database.sqlite.SQLiteException r0 = new android.database.sqlite.SQLiteException     // Catch:{ all -> 0x0048 }
            r0.<init>(r1)     // Catch:{ all -> 0x0048 }
            throw r0     // Catch:{ all -> 0x0048 }
        L_0x0048:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x004a }
        L_0x004a:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x004f }
            throw r0     // Catch:{ all -> 0x004f }
        L_0x004f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0051 }
        L_0x0051:
            r0 = move-exception
            X.CDX.A00(r3, r1)
            throw r0
        L_0x0056:
            r3.close()
        L_0x0059:
            int r0 = r5.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1P0.A02():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0063, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0066, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0067, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006a, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C52962bl A03() {
        /*
            r5 = this;
            java.lang.String r2 = "0"
            X.2bl r0 = r5.A01
            if (r0 != 0) goto L_0x006e
            X.1MH r0 = r5.A03
            X.1at r3 = r0.get()
            r0 = 3
            java.lang.String[] r4 = new java.lang.String[r0]     // Catch:{ all -> 0x0064 }
            r0 = -1
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0064 }
            r0 = 0
            r4[r0] = r1     // Catch:{ all -> 0x0064 }
            r0 = 1
            r4[r0] = r2     // Catch:{ all -> 0x0064 }
            r0 = 2
            r4[r0] = r2     // Catch:{ all -> 0x0064 }
            r0 = r3
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0064 }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x0064 }
            java.lang.String r1 = "SELECT public_key, private_key FROM identities WHERE recipient_id =? AND recipient_type = ? AND device_id =?"
            java.lang.String r0 = "SignalIdentityKeyStore/getIdentityKeyPair"
            android.database.Cursor r4 = r2.A0A(r1, r0, r4)     // Catch:{ all -> 0x0064 }
            boolean r0 = r4.moveToNext()     // Catch:{ all -> 0x005d }
            if (r0 == 0) goto L_0x0055
            java.lang.String r0 = "public_key"
            int r0 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x005d }
            byte[] r2 = r4.getBlob(r0)     // Catch:{ all -> 0x005d }
            X.C18070vi.A0X(r2)     // Catch:{ all -> 0x005d }
            java.lang.String r0 = "private_key"
            int r0 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x005d }
            byte[] r1 = r4.getBlob(r0)     // Catch:{ all -> 0x005d }
            X.C18070vi.A0X(r1)     // Catch:{ all -> 0x005d }
            X.2bl r0 = new X.2bl     // Catch:{ all -> 0x005d }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x005d }
            r5.A01 = r0     // Catch:{ all -> 0x005d }
            r4.close()     // Catch:{ all -> 0x0064 }
            goto L_0x006b
        L_0x0055:
            java.lang.String r1 = "Missing entry for self in identities table"
            android.database.sqlite.SQLiteException r0 = new android.database.sqlite.SQLiteException     // Catch:{ all -> 0x005d }
            r0.<init>(r1)     // Catch:{ all -> 0x005d }
            throw r0     // Catch:{ all -> 0x005d }
        L_0x005d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x005f }
        L_0x005f:
            r0 = move-exception
            X.CDX.A00(r4, r1)     // Catch:{ all -> 0x0064 }
            throw r0     // Catch:{ all -> 0x0064 }
        L_0x0064:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0066 }
        L_0x0066:
            r0 = move-exception
            X.CDX.A00(r3, r1)
            throw r0
        L_0x006b:
            r3.close()
        L_0x006e:
            X.2bl r0 = r5.A01
            if (r0 == 0) goto L_0x0073
            return r0
        L_0x0073:
            java.lang.String r1 = "self identity cannot be null"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1P0.A03():X.2bl");
    }
}
