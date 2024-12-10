package com.whatsapp.jobqueue.job;

import X.A8G;
import X.AnonymousClass000;
import X.AnonymousClass0DT;
import X.AnonymousClass10E;
import X.AnonymousClass11Q;
import X.AnonymousClass11S;
import X.AnonymousClass1P3;
import X.AnonymousClass1PT;
import X.C000100c;
import X.C17880vN;
import X.C17890vO;
import X.C17900vP;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C20133A8t;
import X.C21490Akz;
import X.C22488B9u;
import X.C22911Dt;
import X.C22941Dw;
import X.C25571Os;
import X.C25581Ot;
import X.C54492eE;
import X.C56222h7;
import X.C58762lD;
import X.C59752mp;
import X.C60132nR;
import X.C61592pw;
import X.C71363Ez;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Random;
import org.whispersystems.jobqueue.Job;

public final class SendRetryReceiptJob extends Job implements C22488B9u {
    public static final long serialVersionUID = 1;
    public transient AnonymousClass11S A00;
    public transient AnonymousClass11Q A01;
    public transient AnonymousClass1P3 A02;
    public transient C25581Ot A03;
    public transient C25571Os A04;
    public transient C18030ve A05;
    public transient C61592pw A06;
    public transient AnonymousClass1PT A07;
    public final String category;
    public final String id;
    public final String jid;
    public final int localRegistrationId;
    public final long loggableStanzaId;
    public final String participant;
    public final String recipientJid;
    public final int retryCount;
    public final int retryErrorCode;
    public final long timestamp;

    public void A08() {
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SendRetryReceiptJob(X.C63362sw r4, int r5, int r6) {
        /*
            r3 = this;
            X.9lc r2 = new X.9lc
            r2.<init>()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "retry-receipt-"
            r1.append(r0)
            X.1BI r0 = r4.A03()
            java.lang.String r0 = X.C22971Dz.A06(r0)
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            X.AnonymousClass3EB.A00(r0, r2)
            org.whispersystems.jobqueue.JobParameters r0 = r2.A00()
            r3.<init>(r0)
            com.whatsapp.jid.Jid r0 = r4.A0Z
            X.C17960vV.A07(r0)
            java.lang.String r0 = r0.getRawString()
            r3.jid = r0
            java.lang.String r0 = r4.A0h
            X.C17960vV.A07(r0)
            r3.id = r0
            com.whatsapp.jid.Jid r0 = r4.A0Y
            java.lang.String r0 = X.C22971Dz.A06(r0)
            r3.participant = r0
            com.whatsapp.jid.UserJid r0 = r4.A0f
            java.lang.String r0 = X.C22971Dz.A06(r0)
            r3.recipientJid = r0
            long r0 = r4.A0X
            r3.timestamp = r0
            int r0 = r4.A02()
            r3.retryCount = r0
            r3.localRegistrationId = r5
            long r0 = r4.A04
            r3.loggableStanzaId = r0
            java.lang.String r0 = r4.A0N
            r3.category = r0
            r3.retryErrorCode = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendRetryReceiptJob.<init>(X.2sw, int, int):void");
    }

    public static Pair A00(SendRetryReceiptJob sendRetryReceiptJob) {
        C71363Ez A072 = sendRetryReceiptJob.A04.A07();
        try {
            Pair pair = new Pair(sendRetryReceiptJob.A02.A0f(), new C54492eE[]{sendRetryReceiptJob.A02.A0J(), sendRetryReceiptJob.A02.A0K()});
            if (A072 != null) {
                A072.close();
            }
            return pair;
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
            throw th;
        }
    }

    public void A0A() {
        C56222h7 r13;
        Pair pair;
        byte[] bArr;
        byte[] A032 = A8G.A03(this.localRegistrationId);
        String str = this.jid;
        C22911Dt r2 = Jid.Companion;
        Jid A022 = r2.A02(str);
        Jid A023 = r2.A02(this.participant);
        byte[] bArr2 = null;
        Pair A052 = C20133A8t.A05((DeviceJid) null, A022, A023);
        C58762lD r22 = new C58762lD();
        r22.A02 = (Jid) A052.first;
        r22.A06 = "receipt";
        r22.A09 = "retry";
        r22.A08 = this.id;
        r22.A01 = (Jid) A052.second;
        String str2 = this.category;
        if (str2 != null) {
            r22.A05 = str2;
        }
        C60132nR A002 = r22.A00();
        if (this.retryCount > 0) {
            if (this.A02.A0Y()) {
                pair = A00(this);
            } else {
                C25581Ot r3 = this.A03;
                pair = (Pair) r3.A00.submit(new C21490Akz(this, 11)).get();
            }
            byte[] bArr3 = (byte[]) pair.first;
            C54492eE[] r23 = (C54492eE[]) pair.second;
            C54492eE r17 = r23[0];
            C54492eE r18 = r23[1];
            if (this.A00.A0N()) {
                bArr2 = this.A01.A03();
            }
            String str3 = this.id;
            UserJid A024 = C22941Dw.A02(this.recipientJid);
            long j = this.timestamp;
            int i = 1 + this.retryCount;
            long j2 = this.loggableStanzaId;
            String str4 = this.category;
            int i2 = this.retryErrorCode;
            C18030ve r6 = this.A05;
            C18040vf r10 = C18040vf.A02;
            if (C18020vd.A05(r10, r6, 8312) || (A023 == null && C18020vd.A05(r10, this.A05, 9208))) {
                bArr = new byte[1635];
                new Random().nextBytes(bArr);
            } else {
                bArr = null;
            }
            Jid jid2 = A023;
            Jid jid3 = A022;
            r13 = new C56222h7(jid3, jid2, A024, r17, r18, str3, str4, A032, bArr3, bArr2, bArr, (byte) 5, i, i2, j, j2);
        } else {
            String str5 = this.id;
            UserJid A025 = C22941Dw.A02(this.recipientJid);
            long j3 = this.timestamp;
            long j4 = this.loggableStanzaId;
            Jid jid4 = A023;
            Jid jid5 = A022;
            r13 = new C56222h7(jid5, jid4, A025, (C54492eE) null, (C54492eE) null, str5, this.category, A032, (byte[]) null, (byte[]) null, (byte[]) null, (byte) 0, 1 + this.retryCount, this.retryErrorCode, j3, j4);
        }
        AnonymousClass1PT r5 = this.A07;
        String str6 = r13.A0B;
        int i3 = r13.A01;
        r5.A0E(new C59752mp(r13.A05, r13.A06, r13.A07, str6, i3, r13.A03));
        C61592pw r4 = this.A06;
        Message obtain = Message.obtain((Handler) null, 0, 11, 0, r13);
        C61592pw.A00((C56222h7) obtain.obj);
        C17880vN.A0U(r4.A03).A07(obtain, A002).get();
    }

    public String A0D() {
        String str = this.jid;
        C22911Dt r1 = Jid.Companion;
        Jid A022 = r1.A02(str);
        Jid A023 = r1.A02(this.participant);
        StringBuilder A0d = C17890vO.A0d();
        A0d.append(A022);
        A0d.append("; id=");
        A0d.append(this.id);
        A0d.append("; participant=");
        A0d.append(A023);
        A0d.append("; retryCount=");
        return C17880vN.A0t(A0d, this.retryCount);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        if (Jid.Companion.A02(this.jid) == null) {
            throw new InvalidObjectException("jid must not be empty");
        } else if (TextUtils.isEmpty(this.id)) {
            throw new InvalidObjectException("id must not be empty");
        }
    }

    public void A09() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("canceled sent read receipts job");
        C17890vO.A1B(A10, A0D());
    }

    public boolean A0C(Exception exc) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("exception while running sent persistent retry job");
        C17890vO.A13(A0D(), A10, exc);
        return true;
    }

    public void CIZ(Context context) {
        C000100c A042 = C17900vP.A04(context);
        this.A05 = A042.BAL();
        this.A00 = A042.BA6();
        AnonymousClass10E r1 = (AnonymousClass10E) A042;
        this.A04 = (C25571Os) r1.AA0.get();
        this.A03 = (C25581Ot) r1.A9z.get();
        this.A02 = (AnonymousClass1P3) r1.A9y.get();
        this.A07 = (AnonymousClass1PT) r1.A6U.get();
        this.A06 = (C61592pw) r1.A6b.get();
        this.A01 = (AnonymousClass11Q) r1.A2T.get();
    }
}
