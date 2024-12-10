package com.whatsapp.jobqueue.job;

import X.AnonymousClass000;
import X.AnonymousClass0DT;
import X.AnonymousClass10E;
import X.AnonymousClass1BI;
import X.AnonymousClass1DL;
import X.AnonymousClass1N5;
import X.AnonymousClass1OZ;
import X.C000100c;
import X.C17880vN;
import X.C17890vO;
import X.C17900vP;
import X.C20133A8t;
import X.C22488B9u;
import X.C22931Dv;
import X.C22971Dz;
import X.C28791au;
import X.C28801av;
import X.C41851xA;
import X.C53352cO;
import X.C54982f1;
import X.C57692jU;
import X.C58762lD;
import android.content.ContentValues;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import org.whispersystems.jobqueue.Job;

public class SendPlayedReceiptJobV2 extends Job implements C22488B9u {
    public static final long serialVersionUID = 1;
    public transient C53352cO A00;
    public transient AnonymousClass1OZ A01;
    public transient AnonymousClass1N5 A02;
    public final String[] messageIds;
    public final Long[] messageRowIds;
    public final String participantRawJid;
    public final boolean playedSelfFromPeer;
    public final String toRawJid;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SendPlayedReceiptJobV2(X.C57692jU r5, boolean r6) {
        /*
            r4 = this;
            X.9lc r3 = new X.9lc
            r3.<init>()
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "played-receipt-v2-"
            r2.append(r0)
            X.1BI r1 = r5.A01
            java.lang.String r0 = r1.getRawString()
            X.C17960vV.A07(r0)
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r2)
            X.AnonymousClass3EB.A00(r0, r3)
            org.whispersystems.jobqueue.JobParameters r0 = r3.A00()
            r4.<init>(r0)
            java.lang.String r0 = r1.getRawString()
            X.C17960vV.A07(r0)
            r4.toRawJid = r0
            X.1BI r0 = r5.A00
            if (r0 != 0) goto L_0x0046
            r0 = 0
        L_0x0033:
            r4.participantRawJid = r0
            java.lang.Long[] r0 = r5.A02
            X.C17960vV.A0J(r0)
            r4.messageRowIds = r0
            java.lang.String[] r0 = r5.A03
            X.C17960vV.A0J(r0)
            r4.messageIds = r0
            r4.playedSelfFromPeer = r6
            return
        L_0x0046:
            java.lang.String r0 = r0.getRawString()
            goto L_0x0033
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendPlayedReceiptJobV2.<init>(X.2jU, boolean):void");
    }

    private String A00() {
        String str = this.toRawJid;
        C22931Dv r1 = AnonymousClass1BI.A00;
        AnonymousClass1BI A022 = r1.A02(str);
        AnonymousClass1BI A023 = r1.A02(this.participantRawJid);
        StringBuilder A10 = AnonymousClass000.A10();
        C17900vP.A0W(A022, "; jid=", A10);
        A10.append(A023);
        A10.append("; id=");
        String[] strArr = this.messageIds;
        A10.append(strArr[0]);
        A10.append("; count=");
        return C17880vN.A0t(A10, strArr.length);
    }

    public void A0A() {
        boolean z;
        String str;
        C41851xA BD0;
        String str2 = this.toRawJid;
        C22931Dv r0 = AnonymousClass1BI.A00;
        AnonymousClass1BI A012 = C22931Dv.A01(str2);
        String str3 = this.participantRawJid;
        C22931Dv r1 = AnonymousClass1BI.A00;
        Pair A05 = C20133A8t.A05((DeviceJid) null, A012, r1.A02(str3));
        if (!this.A02.A04(C22931Dv.A00((Jid) A05.first)) || C22971Dz.A0V(C22931Dv.A00((Jid) A05.first))) {
            z = false;
            str = "played-self";
        } else {
            z = true;
            str = "played";
        }
        A00();
        if (!z) {
            C53352cO r12 = this.A00;
            C57692jU r11 = new C57692jU(C22931Dv.A01(this.toRawJid), r1.A02(this.participantRawJid), this.messageRowIds, this.messageIds);
            C17900vP.A0Y(r11, "PlayedSelfReceiptStore/insertPlayedSelfReceipt/toJid = ", AnonymousClass000.A10());
            ContentValues A08 = C17880vN.A08();
            int i = 0;
            while (true) {
                String[] strArr = r11.A03;
                if (i >= strArr.length) {
                    break;
                }
                A08.clear();
                AnonymousClass1DL r4 = r12.A00;
                A08.put("to_jid_row_id", AnonymousClass1DL.A04(r4, r11.A01));
                AnonymousClass1BI r02 = r11.A00;
                if (r02 != null) {
                    A08.put("participant_jid_row_id", AnonymousClass1DL.A04(r4, r02));
                }
                A08.put("message_row_id", r11.A02[i]);
                A08.put("message_id", strArr[i]);
                C28791au A052 = r12.A01.A05();
                try {
                    BD0 = A052.BD0();
                    if (((C28801av) A052).A02.A05("played_self_receipt", "PlayedSelfReceiptStore/INSERT_PLAYED_SELF_RECEIPT", A08) == -1) {
                        Log.w("PlayedSelfReceiptStore/insertPlayedSelfReceipt fail to insert");
                    }
                    BD0.A00();
                    BD0.close();
                    A052.close();
                    i++;
                } catch (Throwable th) {
                    try {
                        A052.close();
                        throw th;
                    } catch (Throwable th2) {
                        AnonymousClass0DT.A00(th, th2);
                        throw th;
                    }
                }
            }
            if (this.playedSelfFromPeer) {
                return;
            }
        }
        C58762lD r13 = new C58762lD();
        r13.A02 = (Jid) A05.first;
        r13.A06 = "receipt";
        r13.A09 = str;
        r13.A08 = this.messageIds[0];
        r13.A01 = (Jid) A05.second;
        this.A01.A07(Message.obtain((Handler) null, 0, 38, 0, new C54982f1(C22931Dv.A00((Jid) A05.first), C22931Dv.A00((Jid) A05.second), str, this.messageIds)), r13.A00()).get();
        return;
        throw th;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        if (!TextUtils.isEmpty(this.toRawJid)) {
            String[] strArr = this.messageIds;
            if (strArr == null || strArr.length == 0) {
                throw new InvalidObjectException("messageIds must not be empty");
            }
            return;
        }
        throw new InvalidObjectException("toJid must not be empty");
    }

    public void A08() {
        A00();
    }

    public void A09() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SendPlayedReceiptJobV2/onCanceled; ");
        C17890vO.A1B(A10, A00());
    }

    public boolean A0C(Exception exc) {
        A00();
        return true;
    }

    public void CIZ(Context context) {
        C000100c A0H = C17890vO.A0H(context);
        this.A01 = A0H.BAA();
        AnonymousClass10E r1 = (AnonymousClass10E) A0H;
        this.A02 = (AnonymousClass1N5) r1.A9K.get();
        this.A00 = (C53352cO) r1.A8U.get();
    }
}
