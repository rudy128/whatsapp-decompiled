package com.whatsapp.jobqueue.job.messagejob;

import X.AnonymousClass000;
import X.AnonymousClass10E;
import X.AnonymousClass1Cd;
import X.AnonymousClass1W6;
import X.C000100c;
import X.C17890vO;
import X.C22488B9u;
import android.content.Context;
import org.whispersystems.jobqueue.Job;

public abstract class AsyncMessageJob extends Job implements C22488B9u {
    public transient AnonymousClass1Cd A00;
    public transient AnonymousClass1W6 A01;
    public final long rowId;
    public final long sortId;

    public void A08() {
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AsyncMessageJob(long r3, long r5) {
        /*
            r2 = this;
            X.9lc r1 = new X.9lc
            r1.<init>()
            java.lang.String r0 = "async-message"
            r1.A00 = r0
            r0 = 1
            r1.A02 = r0
            org.whispersystems.jobqueue.JobParameters r0 = r1.A00()
            r2.<init>(r0)
            r2.rowId = r3
            r2.sortId = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.messagejob.AsyncMessageJob.<init>(long, long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:121:0x01eb, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x01f0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:?, code lost:
        X.AnonymousClass0DT.A00(r1, r0);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:111:0x019f, B:115:0x01c1] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0A() {
        /*
            r20 = this;
            r1 = r20
            X.1Cd r0 = r1.A00
            X.1au r19 = r0.A05()
            X.1xA r18 = r19.BD0()     // Catch:{ all -> 0x020c }
            X.1W6 r0 = r1.A01     // Catch:{ all -> 0x0202 }
            long r2 = r1.rowId     // Catch:{ all -> 0x0202 }
            X.1W2 r0 = r0.A01     // Catch:{ all -> 0x0202 }
            X.206 r2 = r0.A03(r2)     // Catch:{ all -> 0x0202 }
            r18.A00()     // Catch:{ all -> 0x0202 }
            r18.close()     // Catch:{ all -> 0x020c }
            r19.close()
            if (r2 == 0) goto L_0x0201
            boolean r5 = r1 instanceof com.whatsapp.jobqueue.job.messagejob.ProcessVCardMessageJob
            if (r5 == 0) goto L_0x003d
            r7 = r1
            com.whatsapp.jobqueue.job.messagejob.ProcessVCardMessageJob r7 = (com.whatsapp.jobqueue.job.messagejob.ProcessVCardMessageJob) r7
            X.1kY r0 = r7.A06
            java.util.List r6 = X.C62872s8.A02(r2, r0)
            if (r6 == 0) goto L_0x0064
            X.118 r4 = r7.A02     // Catch:{ Exception -> 0x0059 }
            X.1M9 r3 = r7.A00     // Catch:{ Exception -> 0x0059 }
            X.11C r2 = r7.A01     // Catch:{ Exception -> 0x0059 }
            X.0vb r0 = r7.A03     // Catch:{ Exception -> 0x0059 }
            java.util.ArrayList r2 = X.AnonymousClass73Y.A02(r3, r2, r4, r0, r6)     // Catch:{ Exception -> 0x0059 }
            goto L_0x0068
        L_0x003d:
            r4 = r1
            com.whatsapp.jobqueue.job.messagejob.AsyncMessageTokenizationJob r4 = (com.whatsapp.jobqueue.job.messagejob.AsyncMessageTokenizationJob) r4
            java.lang.String r0 = "ftsMessageStore/backgroundTokenize"
            X.1Ez r3 = new X.1Ez
            r3.<init>((java.lang.String) r0)
            X.1QB r0 = r4.A00
            java.lang.String r2 = r0.A0F(r2)
            X.1QB r0 = r4.A00
            X.0vb r0 = r0.A04
            java.lang.String r2 = X.C20103A7h.A01(r0, r2)
            r3.A02()
            goto L_0x0068
        L_0x0059:
            r3 = move-exception
            java.lang.String r2 = "processvcard/error constructing contacts"
            X.2RP r0 = new X.2RP
            r0.<init>(r3)
            com.whatsapp.util.Log.e(r2, r0)
        L_0x0064:
            java.util.List r2 = java.util.Collections.emptyList()
        L_0x0068:
            X.1Cd r0 = r1.A00
            X.1au r19 = r0.A05()
            X.1xA r18 = r19.BD0()     // Catch:{ all -> 0x020c }
            X.1W6 r0 = r1.A01     // Catch:{ all -> 0x0202 }
            long r3 = r1.rowId     // Catch:{ all -> 0x0202 }
            X.1W2 r0 = r0.A01     // Catch:{ all -> 0x0202 }
            X.206 r10 = r0.A03(r3)     // Catch:{ all -> 0x0202 }
            if (r10 == 0) goto L_0x01f8
            boolean r0 = r10.A0z     // Catch:{ all -> 0x0202 }
            if (r0 != 0) goto L_0x01f8
            if (r5 == 0) goto L_0x01a3
            com.whatsapp.jobqueue.job.messagejob.ProcessVCardMessageJob r1 = (com.whatsapp.jobqueue.job.messagejob.ProcessVCardMessageJob) r1     // Catch:{ all -> 0x0202 }
            java.util.List r2 = (java.util.List) r2     // Catch:{ all -> 0x0202 }
            boolean r0 = r10 instanceof X.C442022n     // Catch:{ all -> 0x0202 }
            if (r0 == 0) goto L_0x0091
            r0 = r10
            X.22n r0 = (X.C442022n) r0     // Catch:{ all -> 0x0202 }
            r0.A01 = r2     // Catch:{ all -> 0x0202 }
        L_0x0091:
            X.17l r0 = r1.A04     // Catch:{ all -> 0x0202 }
            r0.CQy(r10)     // Catch:{ all -> 0x0202 }
            X.1QY r9 = r1.A05     // Catch:{ all -> 0x0202 }
            X.205 r0 = r10.A0v     // Catch:{ all -> 0x0202 }
            boolean r0 = r0.A02     // Catch:{ all -> 0x0202 }
            if (r0 == 0) goto L_0x00a5
            X.11S r0 = r9.A00     // Catch:{ all -> 0x0202 }
            com.whatsapp.jid.PhoneUserJid r3 = X.AnonymousClass11S.A00(r0)     // Catch:{ all -> 0x0202 }
            goto L_0x00a9
        L_0x00a5:
            com.whatsapp.jid.UserJid r3 = r10.A0I()     // Catch:{ all -> 0x0202 }
        L_0x00a9:
            if (r3 == 0) goto L_0x01f8
            X.1M9 r0 = r9.A01     // Catch:{ all -> 0x0202 }
            X.1E7 r1 = r0.A0E(r3)     // Catch:{ all -> 0x0202 }
            X.11S r0 = r9.A00     // Catch:{ all -> 0x0202 }
            boolean r0 = r0.A0O(r3)     // Catch:{ all -> 0x0202 }
            if (r0 != 0) goto L_0x00c1
            if (r1 == 0) goto L_0x01f8
            X.2lf r0 = r1.A0H     // Catch:{ all -> 0x0202 }
            if (r0 != 0) goto L_0x00c1
            goto L_0x01f8
        L_0x00c1:
            X.1Cd r8 = r9.A06     // Catch:{ all -> 0x0202 }
            X.1au r17 = r8.A05()     // Catch:{ all -> 0x0202 }
            X.1xA r16 = r17.BD0()     // Catch:{ all -> 0x019e }
            java.util.Iterator r15 = r2.iterator()     // Catch:{ all -> 0x0194 }
        L_0x00cf:
            boolean r0 = r15.hasNext()     // Catch:{ all -> 0x0194 }
            if (r0 == 0) goto L_0x018a
            java.lang.Object r7 = r15.next()     // Catch:{ all -> 0x0194 }
            X.2dU r7 = (X.C54032dU) r7     // Catch:{ all -> 0x0194 }
            long r5 = r10.A0x     // Catch:{ all -> 0x0194 }
            java.lang.String r4 = r7.A00     // Catch:{ all -> 0x0194 }
            X.1at r14 = r8.get()     // Catch:{ all -> 0x0194 }
            r0 = r14
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0180 }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x0180 }
            java.lang.String r2 = "SELECT _id FROM message_vcard WHERE message_row_id = ? AND vcard = ?"
            java.lang.String[] r1 = X.C17880vN.A1Z()     // Catch:{ all -> 0x0180 }
            java.lang.String r0 = java.lang.Long.toString(r5)     // Catch:{ all -> 0x0180 }
            X.AnonymousClass001.A1Q(r0, r4, r1)     // Catch:{ all -> 0x0180 }
            java.lang.String r0 = "GET_VCARD_ROW_ID_BY_VCARD"
            android.database.Cursor r2 = r3.A0A(r2, r0, r1)     // Catch:{ all -> 0x0180 }
            boolean r0 = r2.moveToFirst()     // Catch:{ all -> 0x0174 }
            if (r0 == 0) goto L_0x010b
            java.lang.String r0 = "_id"
            long r3 = X.C17890vO.A06(r2, r0)     // Catch:{ all -> 0x0174 }
            r2.close()     // Catch:{ all -> 0x0180 }
            goto L_0x0114
        L_0x010b:
            r2.close()     // Catch:{ all -> 0x0180 }
            r14.close()     // Catch:{ all -> 0x0194 }
            r3 = -1
            goto L_0x0117
        L_0x0114:
            r14.close()     // Catch:{ all -> 0x0194 }
        L_0x0117:
            X.73C r0 = r7.A01     // Catch:{ all -> 0x0194 }
            java.util.List r0 = r0.A06     // Catch:{ all -> 0x0194 }
            if (r0 == 0) goto L_0x00cf
            X.1au r14 = r8.A05()     // Catch:{ all -> 0x0194 }
            X.1xA r13 = r14.BD0()     // Catch:{ all -> 0x0180 }
            java.util.Iterator r12 = r0.iterator()     // Catch:{ all -> 0x016f }
        L_0x0129:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x016f }
            if (r0 == 0) goto L_0x0164
            java.lang.Object r11 = r12.next()     // Catch:{ all -> 0x016f }
            X.6ib r11 = (X.C129926ib) r11     // Catch:{ all -> 0x016f }
            com.whatsapp.jid.UserJid r0 = r11.A01     // Catch:{ all -> 0x016f }
            if (r0 == 0) goto L_0x0129
            r0 = 3
            android.content.ContentValues r7 = X.C17880vN.A09(r0)     // Catch:{ all -> 0x016f }
            java.lang.String r2 = "vcard_jid_row_id"
            X.1DL r1 = r9.A04     // Catch:{ all -> 0x016f }
            com.whatsapp.jid.UserJid r0 = r11.A01     // Catch:{ all -> 0x016f }
            long r0 = r1.A09(r0)     // Catch:{ all -> 0x016f }
            X.C17880vN.A19(r7, r2, r0)     // Catch:{ all -> 0x016f }
            java.lang.String r0 = "vcard_row_id"
            X.C17880vN.A19(r7, r0, r3)     // Catch:{ all -> 0x016f }
            java.lang.String r0 = "message_row_id"
            X.C17880vN.A19(r7, r0, r5)     // Catch:{ all -> 0x016f }
            r0 = r14
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x016f }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x016f }
            java.lang.String r1 = "message_vcard_jid"
            java.lang.String r0 = "INSERT_VCARD_JID_SQL"
            r2.A05(r1, r0, r7)     // Catch:{ all -> 0x016f }
            goto L_0x0129
        L_0x0164:
            r13.A00()     // Catch:{ all -> 0x016f }
            r13.close()     // Catch:{ all -> 0x0180 }
            r14.close()     // Catch:{ all -> 0x0194 }
            goto L_0x00cf
        L_0x016f:
            r1 = move-exception
            r13.close()     // Catch:{ all -> 0x017b }
            goto L_0x017f
        L_0x0174:
            r1 = move-exception
            if (r2 == 0) goto L_0x017f
            r2.close()     // Catch:{ all -> 0x017b }
            goto L_0x017f
        L_0x017b:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0180 }
        L_0x017f:
            throw r1     // Catch:{ all -> 0x0180 }
        L_0x0180:
            r1 = move-exception
            r14.close()     // Catch:{ all -> 0x0185 }
            goto L_0x0189
        L_0x0185:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0194 }
        L_0x0189:
            throw r1     // Catch:{ all -> 0x0194 }
        L_0x018a:
            r16.A00()     // Catch:{ all -> 0x0194 }
            r16.close()     // Catch:{ all -> 0x019e }
            r17.close()     // Catch:{ all -> 0x0202 }
            goto L_0x01f8
        L_0x0194:
            r1 = move-exception
            r16.close()     // Catch:{ all -> 0x0199 }
            goto L_0x019d
        L_0x0199:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x019e }
        L_0x019d:
            throw r1     // Catch:{ all -> 0x019e }
        L_0x019e:
            r1 = move-exception
            r17.close()     // Catch:{ all -> 0x01f0 }
            goto L_0x01f4
        L_0x01a3:
            com.whatsapp.jobqueue.job.messagejob.AsyncMessageTokenizationJob r1 = (com.whatsapp.jobqueue.job.messagejob.AsyncMessageTokenizationJob) r1     // Catch:{ all -> 0x0202 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0202 }
            X.1QB r6 = r1.A00     // Catch:{ all -> 0x0202 }
            long r9 = r6.BS5()     // Catch:{ all -> 0x0202 }
            long r7 = r1.sortId     // Catch:{ all -> 0x0202 }
            long r3 = r1.rowId     // Catch:{ all -> 0x0202 }
            r1 = 1
            X.2pl r5 = new X.2pl     // Catch:{ all -> 0x0202 }
            r11 = r5
            r12 = r7
            r14 = r1
            r15 = r3
            r11.<init>(r12, r14, r15)     // Catch:{ all -> 0x0202 }
            X.1Cd r0 = r6.A0C     // Catch:{ all -> 0x0202 }
            X.1au r4 = r0.A05()     // Catch:{ all -> 0x0202 }
            android.content.ContentValues r12 = X.C17880vN.A09(r1)     // Catch:{ all -> 0x01eb }
            java.lang.String r0 = "content"
            r12.put(r0, r2)     // Catch:{ all -> 0x01eb }
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x01eb }
            X.1Ev r11 = r0.A02     // Catch:{ all -> 0x01eb }
            java.lang.String r13 = "message_ftsv2"
            java.lang.String r14 = "docid = ?"
            java.lang.String[] r3 = new java.lang.String[r1]     // Catch:{ all -> 0x01eb }
            long r0 = r5.A02     // Catch:{ all -> 0x01eb }
            X.C17890vO.A1J(r3, r0)     // Catch:{ all -> 0x01eb }
            java.lang.String r15 = "UPDATE_FTS_TEXT"
            r16 = r3
            r11.A02(r12, r13, r14, r15, r16)     // Catch:{ all -> 0x01eb }
            r4.close()     // Catch:{ all -> 0x0202 }
            r3 = 1
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x01f8
            goto L_0x01f5
        L_0x01eb:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x01f0 }
            goto L_0x01f4
        L_0x01f0:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0202 }
        L_0x01f4:
            throw r1     // Catch:{ all -> 0x0202 }
        L_0x01f5:
            X.AnonymousClass1QB.A00(r5, r6, r2)     // Catch:{ all -> 0x0202 }
        L_0x01f8:
            r18.A00()     // Catch:{ all -> 0x0202 }
            r18.close()     // Catch:{ all -> 0x020c }
            r19.close()
        L_0x0201:
            return
        L_0x0202:
            r1 = move-exception
            r18.close()     // Catch:{ all -> 0x0207 }
            goto L_0x020b
        L_0x0207:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x020c }
        L_0x020b:
            throw r1     // Catch:{ all -> 0x020c }
        L_0x020c:
            r1 = move-exception
            r19.close()     // Catch:{ all -> 0x0211 }
            throw r1
        L_0x0211:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.messagejob.AsyncMessageJob.A0A():void");
    }

    public void A09() {
        String str;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("asyncMessageJob/canceled async message job");
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("; rowId=");
        A102.append(this.rowId);
        A102.append("; job=");
        if (this instanceof ProcessVCardMessageJob) {
            str = "processVCard";
        } else {
            str = "asyncTokenize";
        }
        C17890vO.A1B(A10, AnonymousClass000.A0y(str, A102));
    }

    public boolean A0C(Exception exc) {
        String str;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("asyncMessageJob/exception while running async message job");
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("; rowId=");
        A102.append(this.rowId);
        A102.append("; job=");
        if (this instanceof ProcessVCardMessageJob) {
            str = "processVCard";
        } else {
            str = "asyncTokenize";
        }
        C17890vO.A13(AnonymousClass000.A0y(str, A102), A10, exc);
        return true;
    }

    public void CIZ(Context context) {
        C000100c A0H = C17890vO.A0H(context);
        this.A01 = (AnonymousClass1W6) ((AnonymousClass10E) A0H).A3w.get();
        this.A00 = A0H.Bjr();
    }
}
