package com.whatsapp.jobqueue.job;

import X.AnonymousClass000;
import X.AnonymousClass10E;
import X.AnonymousClass1BI;
import X.AnonymousClass1OZ;
import X.C000100c;
import X.C17890vO;
import X.C17900vP;
import X.C17960vV;
import X.C17970vW;
import X.C18070vi;
import X.C22488B9u;
import X.C22931Dv;
import X.C22971Dz;
import X.C55642g8;
import X.C55802gO;
import X.C58762lD;
import X.C60132nR;
import X.C61242pM;
import X.C61992qc;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.whatsapp.wamsys.JniBridge;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import org.whispersystems.jobqueue.Job;

public final class SendMediaErrorReceiptJob extends Job implements C22488B9u {
    public static final long serialVersionUID = 1;
    public transient C61992qc A00;
    public transient AnonymousClass1OZ A01;
    public final String category;
    public final boolean mediaFromMe;
    public final byte[] mediaKey;
    public final String messageId;
    public final String myPrimaryJid;
    public final String remoteJidRawJid;
    public final String remoteResourceRawJid;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SendMediaErrorReceiptJob(X.AnonymousClass1BI r3, X.AnonymousClass206 r4, java.lang.String r5, byte[] r6) {
        /*
            r2 = this;
            X.9lc r1 = new X.9lc
            r1.<init>()
            java.lang.String r0 = "media-error-receipt"
            X.AnonymousClass3EB.A00(r0, r1)
            org.whispersystems.jobqueue.JobParameters r0 = r1.A00()
            r2.<init>(r0)
            X.205 r1 = r4.A0v
            X.1BI r0 = r1.A00
            X.C17960vV.A07(r0)
            java.lang.String r0 = r0.getRawString()
            r2.remoteJidRawJid = r0
            X.1BI r0 = r4.A0H()
            java.lang.String r0 = X.C22971Dz.A06(r0)
            r2.remoteResourceRawJid = r0
            java.lang.String r0 = X.C22971Dz.A06(r3)
            r2.myPrimaryJid = r0
            java.lang.String r0 = r1.A01
            r2.messageId = r0
            r2.mediaKey = r6
            r2.category = r5
            boolean r0 = r1.A02
            r2.mediaFromMe = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendMediaErrorReceiptJob.<init>(X.1BI, X.206, java.lang.String, byte[]):void");
    }

    public void A0A() {
        AnonymousClass1BI r9;
        boolean z;
        AnonymousClass1BI r7;
        Message obtain;
        String str = this.remoteJidRawJid;
        C22931Dv r1 = AnonymousClass1BI.A00;
        AnonymousClass1BI A02 = r1.A02(str);
        AnonymousClass1BI r2 = null;
        if (!TextUtils.isEmpty(this.remoteResourceRawJid)) {
            r9 = r1.A02(this.remoteResourceRawJid);
        } else {
            r9 = null;
        }
        boolean A0N = C22971Dz.A0N(r9);
        String str2 = this.myPrimaryJid;
        if (str2 != null) {
            z = true;
            r7 = C22931Dv.A01(str2);
            C17960vV.A07(A02);
        } else {
            z = false;
            r7 = A02;
            if (A0N) {
                r7 = r9;
            }
            C17960vV.A07(r7);
        }
        if (!C22971Dz.A0e(A02) && !C22971Dz.A0a(A02)) {
            r9 = null;
            if (A0N) {
                r9 = A02;
            }
        }
        C58762lD r12 = new C58762lD();
        r12.A02 = r7;
        r12.A06 = "receipt";
        r12.A09 = "server-error";
        r12.A08 = this.messageId;
        if (!z) {
            r2 = r9;
        }
        r12.A01 = r2;
        C60132nR A002 = r12.A00();
        byte[] A0I = C17970vW.A0I(12);
        String str3 = this.messageId;
        C18070vi.A0d(str3, 0);
        C61242pM r0 = new C61242pM(str3);
        byte[] bArr = this.mediaKey;
        String str4 = this.messageId;
        C18070vi.A0j(bArr, str4);
        C61992qc.A00(bArr, A0I);
        byte[] bArr2 = (byte[]) JniBridge.jvidispatchOOOOO(0, str4, r0.A00, bArr, A0I);
        if (z) {
            obtain = Message.obtain((Handler) null, 0, 327, 0, new C55802gO(r7, A02, r9, this.messageId, bArr2, A0I, this.mediaFromMe));
        } else {
            obtain = Message.obtain((Handler) null, 0, 77, 0, new C55642g8(r7, r9, this.messageId, this.category, bArr2, A0I));
        }
        this.A01.A07(obtain, A002).get();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        if (TextUtils.isEmpty(this.remoteJidRawJid)) {
            throw new InvalidObjectException("remoteJid must not be empty");
        } else if (TextUtils.isEmpty(this.messageId)) {
            throw new InvalidObjectException("messageId must not be empty");
        }
    }

    public void A08() {
    }

    public void A09() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SendMediaErrorReceiptJob/canceled send played receipts job id=");
        C17890vO.A1B(A10, this.messageId);
    }

    public boolean A0C(Exception exc) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SendMediaErrorReceiptJob/exception while running sent played receipt job id=");
        C17890vO.A13(this.messageId, A10, exc);
        return true;
    }

    public void CIZ(Context context) {
        C000100c A04 = C17900vP.A04(context);
        this.A01 = A04.BAA();
        this.A00 = (C61992qc) ((AnonymousClass10E) A04).A9Y.get();
    }
}
