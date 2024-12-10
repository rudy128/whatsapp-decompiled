package X;

import android.content.ContentValues;
import com.whatsapp.util.Log;

/* renamed from: X.1hF  reason: invalid class name and case insensitive filesystem */
public final class C32471hF {
    public final AnonymousClass1LW A00;
    public final AnonymousClass1CJ A01;
    public final AnonymousClass121 A02;
    public final AnonymousClass1Cd A03;
    public final C59422mH A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;
    public final C19830z4 A08;
    public final AnonymousClass1Q6 A09;
    public final C32461hE A0A;
    public final AnonymousClass00H A0B;

    public C32471hF(C19830z4 r2, AnonymousClass1LW r3, AnonymousClass1CJ r4, AnonymousClass121 r5, AnonymousClass1Q6 r6, AnonymousClass1Cd r7, C32461hE r8, C59422mH r9, AnonymousClass00H r10, AnonymousClass00H r11, AnonymousClass00H r12, AnonymousClass00H r13) {
        C18070vi.A0d(r3, 1);
        C18070vi.A0d(r4, 2);
        C18070vi.A0d(r10, 3);
        C18070vi.A0d(r11, 4);
        C18070vi.A0d(r9, 5);
        C18070vi.A0d(r6, 6);
        C18070vi.A0d(r7, 7);
        C18070vi.A0d(r2, 8);
        C18070vi.A0d(r5, 9);
        C18070vi.A0d(r8, 10);
        C18070vi.A0d(r12, 11);
        C18070vi.A0d(r13, 12);
        this.A00 = r3;
        this.A01 = r4;
        this.A07 = r10;
        this.A05 = r11;
        this.A04 = r9;
        this.A09 = r6;
        this.A03 = r7;
        this.A08 = r2;
        this.A02 = r5;
        this.A0A = r8;
        this.A06 = r12;
        this.A0B = r13;
    }

    public final AnonymousClass206 A02(C29681ch r2, long j) {
        C18070vi.A0d(r2, 0);
        return ((AnonymousClass1W6) ((AnonymousClass122) this.A02).A1E.get()).A03(r2, j);
    }

    public final void A04(AnonymousClass206 r11) {
        C46162Dk r7;
        long j;
        long j2;
        long j3;
        int A0D;
        C691336a A002;
        Integer num;
        C18070vi.A0d(r11, 0);
        AnonymousClass1CJ r1 = this.A01;
        AnonymousClass205 r5 = r11.A0v;
        C29691ci A0A2 = r1.A0A(r5.A00);
        if ((A0A2 instanceof C46162Dk) && (r7 = (C46162Dk) A0A2) != null) {
            long j4 = r11.A0x;
            if (j4 != 1) {
                synchronized (A0A2) {
                    j = r7.A0W;
                }
                if (j < j4) {
                    this.A09.A0B(r11);
                    if (r7.A02 != C179509Ig.GUEST) {
                        C19830z4.A00(this.A08).putBoolean("newsletter_message_received", true).apply();
                    }
                    if (r11.A0y > r7.A0X) {
                        r7.A0W = r11.A0x;
                        r7.A0X = r11.A0y;
                        r7.A0P = r11.A0x;
                        r7.A0Q = r11.A0y;
                        r7.A0Z = r11.A0I;
                        r7.A0g = r11;
                        r7.A0f = r11;
                        C46162Dk.A02(r7, r11);
                    } else {
                        r7.A0g = null;
                    }
                    if (!(r5.A02 || (A0D = r11.A0D()) == 16 || A0D == 18 || A0D == 17 || A0D == 9 || A0D == 10 || r11.A0u() || ((A002 = C50382Uf.A00(r11)) != null && A002.A07 && (num = r11.A0S) != null && num.intValue() == 100))) {
                        long j5 = r7.A0S;
                        if (j5 < 100) {
                            j5 = 100;
                        }
                        int i = r7.A0A;
                        int i2 = (int) (r11.A0y - j5);
                        if (i < i2) {
                            i = i2;
                        }
                        r7.A0A = i;
                    }
                    int A022 = ((C32991i5) this.A07.get()).A02(r7);
                    StringBuilder sb = new StringBuilder();
                    sb.append("NewsletterMessageStore/updateNewsletterInfo/updated:");
                    sb.append(A022);
                    sb.append(" newRowId:");
                    synchronized (A0A2) {
                        j2 = r7.A0P;
                    }
                    sb.append(j2);
                    sb.append(" newSortId:");
                    synchronized (A0A2) {
                        j3 = r7.A0Q;
                    }
                    sb.append(j3);
                    Log.i(sb.toString());
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0031, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0035, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0038, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x003c, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(X.AnonymousClass206 r5) {
        /*
            r4 = this;
            r0 = 0
            X.C18070vi.A0d(r5, r0)
            X.1Cd r0 = r4.A03     // Catch:{ SQLNonTransientException -> 0x0041, IllegalArgumentException -> 0x003d }
            X.1au r3 = r0.A05()     // Catch:{ SQLNonTransientException -> 0x0041, IllegalArgumentException -> 0x003d }
            X.1xA r2 = r3.BD0()     // Catch:{ all -> 0x0036 }
            r4.A03(r3, r5)     // Catch:{ all -> 0x002f }
            r4.A00(r5)     // Catch:{ all -> 0x002f }
            r2.A00()     // Catch:{ all -> 0x002f }
            r2.close()     // Catch:{ all -> 0x0036 }
            r3.close()     // Catch:{ SQLNonTransientException -> 0x0041, IllegalArgumentException -> 0x003d }
            boolean r0 = r5.A0u()     // Catch:{ SQLNonTransientException -> 0x0041, IllegalArgumentException -> 0x003d }
            if (r0 != 0) goto L_0x0047
            X.00H r0 = r4.A06     // Catch:{ SQLNonTransientException -> 0x0041, IllegalArgumentException -> 0x003d }
            java.lang.Object r0 = r0.get()     // Catch:{ SQLNonTransientException -> 0x0041, IllegalArgumentException -> 0x003d }
            X.2jH r0 = (X.C57562jH) r0     // Catch:{ SQLNonTransientException -> 0x0041, IllegalArgumentException -> 0x003d }
            r0.A00(r5)     // Catch:{ SQLNonTransientException -> 0x0041, IllegalArgumentException -> 0x003d }
            return
        L_0x002f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0031 }
        L_0x0031:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x0036 }
            throw r0     // Catch:{ all -> 0x0036 }
        L_0x0036:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0038 }
        L_0x0038:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ SQLNonTransientException -> 0x0041, IllegalArgumentException -> 0x003d }
            throw r0     // Catch:{ SQLNonTransientException -> 0x0041, IllegalArgumentException -> 0x003d }
        L_0x003d:
            r1 = move-exception
            java.lang.String r0 = "NewsletterMessageStore/failed to update the message due to message constraints"
            goto L_0x0044
        L_0x0041:
            r1 = move-exception
            java.lang.String r0 = "NewsletterMessageStore/failed to update the message"
        L_0x0044:
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0047:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32471hF.A05(X.206):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0058, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x005f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0063, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A06(X.AnonymousClass206 r7) {
        /*
            r6 = this;
            r5 = 0
            X.1Cd r0 = r6.A03     // Catch:{ Exception -> 0x0064 }
            X.1au r3 = r0.A05()     // Catch:{ Exception -> 0x0064 }
            X.1xA r2 = r3.BD0()     // Catch:{ all -> 0x005d }
            X.121 r0 = r6.A02     // Catch:{ all -> 0x0056 }
            r4 = 1
            X.2qj r0 = r0.CST(r7, r4)     // Catch:{ all -> 0x0056 }
            X.C18070vi.A0X(r0)     // Catch:{ all -> 0x0056 }
            boolean r0 = r0.A04     // Catch:{ all -> 0x0056 }
            if (r0 != 0) goto L_0x0025
            java.lang.String r0 = "NewsletterMessageStore/failed to insert message"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0056 }
            r2.close()     // Catch:{ all -> 0x005d }
            r3.close()     // Catch:{ Exception -> 0x0064 }
            return r5
        L_0x0025:
            r6.A03(r3, r7)     // Catch:{ all -> 0x0056 }
            r6.A00(r7)     // Catch:{ all -> 0x0056 }
            r6.A04(r7)     // Catch:{ all -> 0x0056 }
            r2.A00()     // Catch:{ all -> 0x0056 }
            r2.close()     // Catch:{ all -> 0x005d }
            r3.close()     // Catch:{ Exception -> 0x0064 }
            boolean r0 = r7.A0u()     // Catch:{ Exception -> 0x0064 }
            if (r0 != 0) goto L_0x0055
            X.00H r0 = r6.A06     // Catch:{ Exception -> 0x0064 }
            java.lang.Object r3 = r0.get()     // Catch:{ Exception -> 0x0064 }
            X.2jH r3 = (X.C57562jH) r3     // Catch:{ Exception -> 0x0064 }
            X.00H r0 = r3.A02     // Catch:{ Exception -> 0x0064 }
            X.11A r2 = X.C17880vN.A0d(r0)     // Catch:{ Exception -> 0x0064 }
            r1 = 49
            X.AkP r0 = new X.AkP     // Catch:{ Exception -> 0x0064 }
            r0.<init>(r7, r3, r1)     // Catch:{ Exception -> 0x0064 }
            r2.A00(r0)     // Catch:{ Exception -> 0x0064 }
        L_0x0055:
            return r4
        L_0x0056:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0058 }
        L_0x0058:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x005d }
            throw r0     // Catch:{ all -> 0x005d }
        L_0x005d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x005f }
        L_0x005f:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ Exception -> 0x0064 }
            throw r0     // Catch:{ Exception -> 0x0064 }
        L_0x0064:
            r1 = move-exception
            java.lang.String r0 = "NewsletterMessageStore/failed to insert the message"
            com.whatsapp.util.Log.e(r0, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32471hF.A06(X.206):boolean");
    }

    public static final String[] A01(C29681ch r6, C32471hF r7, Long l, Long l2, long j) {
        if (l2 == null && l == null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        Long l3 = null;
        if (l != null) {
            l3 = l;
            if (l2 == null) {
                l2 = Long.valueOf(l.longValue() - (j - 1));
            }
        } else if (l2 != null) {
            l3 = Long.valueOf(l2.longValue() + j + 1);
        } else {
            l2 = null;
        }
        return new String[]{String.valueOf(r7.A00.A09(r6)), String.valueOf(l3), String.valueOf(l2)};
    }

    public final void A03(C28791au r7, AnonymousClass206 r8) {
        C23141Ev r4 = ((C28801av) r7).A02;
        AnonymousClass1BI r2 = r8.A0v.A00;
        if (r2 != null) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("message_row_id", Long.valueOf(r8.A0x));
            contentValues.put("chat_row_id", Long.valueOf(this.A00.A09(r2)));
            contentValues.put("server_message_id", Long.valueOf(r8.A0y));
            contentValues.put("comments_count", 0);
            C691336a A002 = C50382Uf.A00(r8);
            if (A002 != null) {
                contentValues.put("comments_count", Long.valueOf(A002.A00));
                contentValues.put("reaction_from_me", A002.A05);
                contentValues.put("reactions_from_me_ts", A002.A04);
                contentValues.put("extra_newsletter_tables", Long.valueOf(A002.A01));
                contentValues.put("extra_table_last_update_ts", Long.valueOf(A002.A02));
                contentValues.put("view_count", Long.valueOf(A002.A03));
                C50072Ta.A00(contentValues, "is_autodelete_eligible", A002.A06);
                contentValues.put("is_wamo_sub", Boolean.valueOf(A002.A07));
            }
            r4.A09("newsletter_message", "INSERT_OR_REPLACE_NEWSLETTER_MESSAGE", contentValues, 5);
            return;
        }
        throw new IllegalStateException("NewsletterMessageStore/getContentValuesForInsert invalid message");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0083, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0087, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008e, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A00(X.AnonymousClass206 r11) {
        /*
            r10 = this;
            X.8BG r0 = X.C63892tr.A01(r11)
            if (r0 == 0) goto L_0x00a0
            X.00H r0 = r10.A0B
            java.lang.Object r0 = r0.get()
            X.2co r0 = (X.C53612co) r0
            r8 = 0
            r1 = 1
            X.1Cd r0 = r0.A01     // Catch:{ all -> 0x008f }
            X.1au r3 = r0.A05()     // Catch:{ all -> 0x008f }
            X.1xA r4 = r3.BD0()     // Catch:{ all -> 0x0088 }
            r0 = r3
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0081 }
            X.1Ev r6 = r0.A02     // Catch:{ all -> 0x0081 }
            java.lang.String r5 = "newsletter_message_reaction"
            java.lang.String r7 = "message_row_id = ?"
            java.lang.String[] r2 = new java.lang.String[r1]     // Catch:{ all -> 0x0081 }
            long r0 = r11.A0x     // Catch:{ all -> 0x0081 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0081 }
            r2[r8] = r0     // Catch:{ all -> 0x0081 }
            java.lang.String r0 = "DELETE_NEWSLETTER_MESSAGE_REACTION_FOR_MESSAGE"
            r6.A04(r5, r7, r0, r2)     // Catch:{ all -> 0x0081 }
            X.8BG r8 = X.C63892tr.A01(r11)     // Catch:{ all -> 0x0081 }
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.newsletter.data.NewsletterMessageReactions"
            X.C18070vi.A0z(r8, r0)     // Catch:{ all -> 0x0081 }
            X.7C9 r8 = (X.AnonymousClass7C9) r8     // Catch:{ all -> 0x0081 }
            android.content.ContentValues r7 = new android.content.ContentValues     // Catch:{ all -> 0x0081 }
            r7.<init>()     // Catch:{ all -> 0x0081 }
            java.lang.String r2 = "message_row_id"
            long r0 = r11.A0x     // Catch:{ all -> 0x0081 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0081 }
            r7.put(r2, r0)     // Catch:{ all -> 0x0081 }
            java.util.Iterator r9 = r8.BMh()     // Catch:{ all -> 0x0081 }
        L_0x0051:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x0081 }
            if (r0 == 0) goto L_0x0075
            java.lang.Object r8 = r9.next()     // Catch:{ all -> 0x0081 }
            X.5tR r8 = (X.C115125tR) r8     // Catch:{ all -> 0x0081 }
            java.lang.String r1 = "reaction"
            java.lang.String r0 = r8.A02     // Catch:{ all -> 0x0081 }
            r7.put(r1, r0)     // Catch:{ all -> 0x0081 }
            java.lang.String r2 = "reaction_count"
            long r0 = r8.A00     // Catch:{ all -> 0x0081 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0081 }
            r7.put(r2, r0)     // Catch:{ all -> 0x0081 }
            java.lang.String r0 = "NewsletterMessageReactionStore/insertOrReplaceNewsletterMessageReactions"
            r6.A06(r5, r0, r7)     // Catch:{ all -> 0x0081 }
            goto L_0x0051
        L_0x0075:
            r4.A00()     // Catch:{ all -> 0x0081 }
            X.1Wu r1 = X.C27621Wu.A00     // Catch:{ all -> 0x0081 }
            r4.close()     // Catch:{ all -> 0x0088 }
            r3.close()     // Catch:{ all -> 0x008f }
            goto L_0x0095
        L_0x0081:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0083 }
        L_0x0083:
            r0 = move-exception
            X.CDX.A00(r4, r1)     // Catch:{ all -> 0x0088 }
            throw r0     // Catch:{ all -> 0x0088 }
        L_0x0088:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x008a }
        L_0x008a:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ all -> 0x008f }
            throw r0     // Catch:{ all -> 0x008f }
        L_0x008f:
            r0 = move-exception
            X.1IU r1 = new X.1IU
            r1.<init>(r0)
        L_0x0095:
            java.lang.Throwable r1 = X.C30671eK.A00(r1)
            if (r1 == 0) goto L_0x00a0
            java.lang.String r0 = "NewsletterMessageReactionStore/failed to insert the message"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x00a0:
            boolean r0 = r11 instanceof X.AnonymousClass22H
            if (r0 == 0) goto L_0x00ba
            X.22H r11 = (X.AnonymousClass22H) r11
            java.util.List r1 = r11.A07
            X.C18070vi.A0X(r1)
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x00bb
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x00bb
        L_0x00b5:
            X.2mH r0 = r10.A04
            r0.A01(r11)
        L_0x00ba:
            return
        L_0x00bb:
            java.util.Iterator r5 = r1.iterator()
        L_0x00bf:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x00b5
            java.lang.Object r0 = r5.next()
            X.A18 r0 = (X.A18) r0
            long r3 = r0.A01
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00bf
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32471hF.A00(X.206):void");
    }
}
