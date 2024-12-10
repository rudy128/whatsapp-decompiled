package X;

import android.content.ContentValues;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.PhoneUserJid;

/* renamed from: X.30e  reason: invalid class name and case insensitive filesystem */
public final class C676130e implements C108035b1 {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;

    public final boolean A02(ContentValues contentValues, AnonymousClass1BI r10) {
        long A002;
        C18070vi.A0d(r10, 0);
        if (C18020vd.A00(C18040vf.A02, C17880vN.A0P(this.A00), 11812) <= 0) {
            return true;
        }
        if ((r10 instanceof PhoneUserJid) && !C42701yb.A01(r10)) {
            PhoneUserJid phoneUserJid = (PhoneUserJid) r10;
            if (((AnonymousClass1NG) this.A01.get()).A04()) {
                ((AnonymousClass190) this.A04.get()).A0G("ChatStoreMigrationHelper/handlePhoneUserJidRow", phoneUserJid.toString(), true);
                return false;
            }
            AnonymousClass1E2 A0C = ((C24751Ln) this.A05.get()).A0C(phoneUserJid);
            if (A0C == null) {
                ((AnonymousClass190) this.A04.get()).A0G("ChatStoreMigrationHelper/logMissingLid", phoneUserJid.toString(), true);
                return false;
            }
            if (((AnonymousClass1CJ) this.A02.get()).A0P(A0C)) {
                C18070vi.A0d(phoneUserJid, 0);
                Jid jid = (Jid) ((C62082ql) this.A03.get()).A00(C18070vi.A0P(phoneUserJid)).get(phoneUserJid);
                if (jid != null) {
                    A002 = A00(jid);
                } else {
                    throw AnonymousClass000.A0n(AnonymousClass001.A1E(phoneUserJid, "ClientAssignedLidManager/client assigned lid is null for ", AnonymousClass000.A10()));
                }
            } else {
                A002 = A00(A0C);
            }
            C17880vN.A19(contentValues, "account_jid_row_id", A002);
            return true;
        } else if (r10 instanceof AnonymousClass1E2) {
            AnonymousClass1E1 r102 = (AnonymousClass1E1) r10;
            long A003 = A00(r102);
            PhoneUserJid A0D = ((C24751Ln) this.A05.get()).A0D(r102);
            if (A0D != null) {
                AnonymousClass00H r1 = this.A01;
                if (!((AnonymousClass1NG) r1.get()).A04() && ((AnonymousClass1CJ) ((AnonymousClass1NG) r1.get()).A00.get()).A0P(A0D)) {
                    AnonymousClass1E1 r0 = (AnonymousClass1E1) ((C62082ql) this.A03.get()).A00(C18070vi.A0P(A0D)).get(A0D);
                    if (r0 != null) {
                        A01(r0, A0D);
                    } else {
                        throw AnonymousClass000.A0n(AnonymousClass001.A1E(A0D, "ChatStoreMigrationHelper/Client assigned lid is null for ", AnonymousClass000.A10()));
                    }
                }
            }
            Long valueOf = Long.valueOf(A003);
            contentValues.put("jid_row_id", valueOf);
            contentValues.put("account_jid_row_id", valueOf);
            return true;
        } else {
            contentValues.put("account_jid_row_id", Long.valueOf(A00(r10)));
            return true;
        }
    }

    public void BwN(AnonymousClass1E1 r1, AnonymousClass1E1 r2, PhoneUserJid phoneUserJid) {
    }

    private final long A00(Jid jid) {
        long A022 = AnonymousClass1DL.A02(jid, this.A06);
        if (A022 != -1) {
            return A022;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ChatStoreMigrationHelper/row id is not found for ");
        A10.append(jid);
        A10.append(':');
        throw AnonymousClass000.A0n(C17880vN.A0u(A10, A022));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0053, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0054, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0057, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A01(X.AnonymousClass1E1 r14, com.whatsapp.jid.PhoneUserJid r15) {
        /*
            r13 = this;
            X.00H r1 = r13.A01
            java.lang.Object r0 = r1.get()
            X.1NG r0 = (X.AnonymousClass1NG) r0
            boolean r0 = r0.A04()
            if (r0 != 0) goto L_0x0058
            java.lang.Object r0 = r1.get()
            X.1NG r0 = (X.AnonymousClass1NG) r0
            X.00H r0 = r0.A00
            java.lang.Object r0 = r0.get()
            X.1CJ r0 = (X.AnonymousClass1CJ) r0
            boolean r0 = r0.A0P(r15)
            if (r0 == 0) goto L_0x0058
            long r0 = r13.A00(r15)
            long r3 = r13.A00(r14)
            X.00H r2 = r13.A07
            X.1au r5 = X.AnonymousClass1Cd.A00(r2)
            r6 = 1
            android.content.ContentValues r8 = X.C17880vN.A09(r6)     // Catch:{ all -> 0x0051 }
            java.lang.String r2 = "account_jid_row_id"
            X.C17880vN.A19(r8, r2, r3)     // Catch:{ all -> 0x0051 }
            r2 = r5
            X.1av r2 = (X.C28801av) r2     // Catch:{ all -> 0x0051 }
            X.1Ev r7 = r2.A02     // Catch:{ all -> 0x0051 }
            java.lang.String r9 = "chat"
            java.lang.String r10 = "jid_row_id = ?"
            java.lang.String[] r12 = new java.lang.String[r6]     // Catch:{ all -> 0x0051 }
            X.C17890vO.A1J(r12, r0)     // Catch:{ all -> 0x0051 }
            java.lang.String r11 = "ChatStoreMigrationHelper/mutateAccountJidForPnRow"
            r7.A02(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0051 }
            r5.close()
            return
        L_0x0051:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0053 }
        L_0x0053:
            r0 = move-exception
            X.CDX.A00(r5, r1)
            throw r0
        L_0x0058:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C676130e.A01(X.1E1, com.whatsapp.jid.PhoneUserJid):void");
    }

    public void BwO(AnonymousClass1E1 r4, AnonymousClass1E1 r5, PhoneUserJid phoneUserJid) {
        if (C18020vd.A00(C18040vf.A02, C17880vN.A0P(this.A00), 11812) > 0) {
            A01(r4, phoneUserJid);
        }
    }

    public C676130e(AnonymousClass00H r1, AnonymousClass00H r2, AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7, AnonymousClass00H r8) {
        C18070vi.A0w(r1, r2, r3, r4, r5);
        C18070vi.A0q(r6, r7, r8);
        this.A00 = r1;
        this.A06 = r2;
        this.A04 = r3;
        this.A02 = r4;
        this.A05 = r5;
        this.A07 = r6;
        this.A01 = r7;
        this.A03 = r8;
    }
}
