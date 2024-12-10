package X;

import android.content.ContentValues;
import com.whatsapp.util.Log;

/* renamed from: X.1MU  reason: invalid class name */
public final class AnonymousClass1MU {
    public final AnonymousClass1CJ A00;
    public final C18030ve A01;
    public final AnonymousClass190 A02;
    public final AnonymousClass11S A03;
    public final AnonymousClass1DL A04;
    public final AnonymousClass1Cd A05;
    public final C200710s A06;
    public final AnonymousClass10I A07;

    public AnonymousClass1MU(AnonymousClass190 r3, AnonymousClass11S r4, AnonymousClass1CJ r5, AnonymousClass1DL r6, AnonymousClass1Cd r7, C18030ve r8, AnonymousClass10I r9) {
        C18070vi.A0d(r8, 1);
        C18070vi.A0d(r5, 2);
        C18070vi.A0d(r3, 3);
        C18070vi.A0d(r6, 4);
        C18070vi.A0d(r4, 5);
        C18070vi.A0d(r7, 6);
        C18070vi.A0d(r9, 7);
        this.A01 = r8;
        this.A00 = r5;
        this.A02 = r3;
        this.A04 = r6;
        this.A03 = r4;
        this.A05 = r7;
        this.A07 = r9;
        this.A06 = new C200710s(r9, false);
    }

    public static final void A02(AnonymousClass1MU r4, AnonymousClass1E9 r5, String str, C18090vk r7, boolean z) {
        AnonymousClass1MU r3 = r4;
        C18030ve r2 = r4.A01;
        C18040vf r1 = C18040vf.A02;
        if (C18020vd.A05(r1, r2, 8088) && C18020vd.A05(r1, r2, 8089)) {
            AnonymousClass1E9 r42 = r5;
            C18090vk r52 = r7;
            if (C22781De.A03()) {
                r3.A06.execute(new C98624rS(r3, r42, r52, str, 1, z));
            } else {
                A01(r3, r42, str, r7, z);
            }
        }
    }

    public final void A05(C28791au r3, AnonymousClass1E9 r4, int i) {
        C29701cj r1;
        C18070vi.A0d(r4, 1);
        StringBuilder sb = new StringBuilder();
        sb.append("ParticipationChatsCache/setParticipatingForRank: ");
        sb.append(i);
        Log.i(sb.toString());
        if (i == 0) {
            r1 = C29701cj.PARTICIPANT;
        } else if (i == 1) {
            r1 = C29701cj.ADMIN;
        } else if (i != 2) {
            r1 = C29701cj.UNSET;
        } else {
            r1 = C29701cj.SUPER_ADMIN;
        }
        if (r1 != C29701cj.UNSET) {
            A00(this, r1, r3, r4);
        }
    }

    public final boolean A06(AnonymousClass1E9 r4) {
        C18070vi.A0d(r4, 0);
        if (!C18020vd.A05(C18040vf.A02, this.A01, 8088) || this.A00.A0C(r4) == C29701cj.UNSET) {
            return false;
        }
        return true;
    }

    public static final void A00(AnonymousClass1MU r9, C29701cj r10, C28791au r11, AnonymousClass1E9 r12) {
        StringBuilder sb = new StringBuilder();
        sb.append("ParticipationChatsCache/setParticipating: ");
        sb.append(r12);
        sb.append(' ');
        sb.append(r10);
        Log.i(sb.toString());
        C29691ci A002 = AnonymousClass1CJ.A00(r9.A00, r12);
        if (A002 != null) {
            ContentValues contentValues = new ContentValues(1);
            contentValues.put("participation_status", Integer.valueOf(r10.status));
            ((C28801av) r11).A02.A02(contentValues, "chat", "_id = ?", "participationChatsCache/setParticipating", new String[]{String.valueOf(A002.A0Y)});
            A002.A0c = r10;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        if (A06(r0) != false) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(X.C63872tp r5) {
        /*
            r4 = this;
            X.0ve r3 = r4.A01
            r2 = 8088(0x1f98, float:1.1334E-41)
            X.0vf r1 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r1, r3, r2)
            if (r0 == 0) goto L_0x0017
            X.1E9 r0 = r5.A06
            X.C18070vi.A0X(r0)
            boolean r0 = r4.A06(r0)
            if (r0 == 0) goto L_0x0025
        L_0x0017:
            boolean r0 = X.C18020vd.A05(r1, r3, r2)
            if (r0 == 0) goto L_0x004d
            r0 = 8090(0x1f9a, float:1.1337E-41)
            boolean r0 = X.C18020vd.A05(r1, r3, r0)
            if (r0 == 0) goto L_0x004d
        L_0x0025:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "ParticipationChatsCache/cacheMeParticipatingOnRead/unset: "
            r1.append(r0)
            X.1E9 r0 = r5.A06
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            boolean r0 = X.C22781De.A03()
            if (r0 == 0) goto L_0x004e
            X.10s r2 = r4.A06
            r1 = 43
            X.3Bx r0 = new X.3Bx
            r0.<init>(r4, r5, r1)
            r2.execute(r0)
        L_0x004d:
            return
        L_0x004e:
            r4.A04(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1MU.A03(X.2tp):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0060, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0061, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0064, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(X.C63872tp r7) {
        /*
            r6 = this;
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "ParticipationChatsCache/updateMeParticipating: "
            r1.append(r0)
            X.1E9 r5 = r7.A06
            r1.append(r5)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1Cd r0 = r6.A05
            X.1au r4 = r0.A05()
            X.10f r0 = r7.A08()     // Catch:{ all -> 0x005e }
            X.C18070vi.A0X(r0)     // Catch:{ all -> 0x005e }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ all -> 0x005e }
        L_0x0027:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x005e }
            r2 = 0
            if (r0 == 0) goto L_0x003f
            java.lang.Object r2 = r3.next()     // Catch:{ all -> 0x005e }
            r0 = r2
            X.2sr r0 = (X.C63312sr) r0     // Catch:{ all -> 0x005e }
            X.11S r1 = r6.A03     // Catch:{ all -> 0x005e }
            com.whatsapp.jid.UserJid r0 = r0.A04     // Catch:{ all -> 0x005e }
            boolean r0 = r1.A0O(r0)     // Catch:{ all -> 0x005e }
            if (r0 == 0) goto L_0x0027
        L_0x003f:
            X.2sr r2 = (X.C63312sr) r2     // Catch:{ all -> 0x005e }
            if (r2 == 0) goto L_0x004f
            X.C18070vi.A0b(r4)     // Catch:{ all -> 0x005e }
            X.C18070vi.A0X(r5)     // Catch:{ all -> 0x005e }
            int r0 = r2.A01     // Catch:{ all -> 0x005e }
            r6.A05(r4, r5, r0)     // Catch:{ all -> 0x005e }
            goto L_0x005a
        L_0x004f:
            X.C18070vi.A0b(r4)     // Catch:{ all -> 0x005e }
            X.C18070vi.A0X(r5)     // Catch:{ all -> 0x005e }
            X.1cj r0 = X.C29701cj.NOT_PARTICIPANT     // Catch:{ all -> 0x005e }
            A00(r6, r0, r4, r5)     // Catch:{ all -> 0x005e }
        L_0x005a:
            r4.close()
            return
        L_0x005e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0060 }
        L_0x0060:
            r0 = move-exception
            X.CDX.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1MU.A04(X.2tp):void");
    }

    public static final void A01(AnonymousClass1MU r5, AnonymousClass1E9 r6, String str, C18090vk r8, boolean z) {
        boolean booleanValue = ((Boolean) r8.invoke()).booleanValue();
        if (z != booleanValue) {
            StringBuilder sb = new StringBuilder();
            sb.append("ParticipationChatsCache/");
            sb.append(str);
            sb.append("/cache fail: ");
            sb.append(r6);
            sb.append(' ');
            sb.append(z);
            sb.append(' ');
            sb.append(booleanValue);
            Log.e(sb.toString());
            AnonymousClass190 r3 = r5.A02;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(' ');
            sb2.append(r6);
            sb2.append(' ');
            sb2.append(z);
            sb2.append(' ');
            sb2.append(booleanValue);
            r3.A0G("participation_cache_fail", sb2.toString(), false);
        }
    }
}
