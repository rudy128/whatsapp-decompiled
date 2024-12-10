package com.whatsapp.jobqueue.job;

import X.AnonymousClass000;
import X.AnonymousClass10E;
import X.AnonymousClass12E;
import X.AnonymousClass1BI;
import X.AnonymousClass205;
import X.AnonymousClass2R1;
import X.AnonymousClass3EC;
import X.C17880vN;
import X.C17890vO;
import X.C17900vP;
import X.C17960vV;
import X.C190849lc;
import X.C22488B9u;
import X.C22941Dw;
import X.C22971Dz;
import X.C26171Rc;
import X.C36321nh;
import X.C444023h;
import X.C58752lC;
import X.C62132qq;
import X.C62602rf;
import android.content.Context;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Set;
import org.whispersystems.jobqueue.Job;

public class SyncDevicesAndSendInvisibleMessageJob extends Job implements C22488B9u {
    public static final long serialVersionUID = 1;
    public transient AnonymousClass12E A00;
    public transient C26171Rc A01;
    public transient AnonymousClass205 A02;
    public transient C58752lC A03;
    public transient Set A04 = C17880vN.A12();
    public final String messageId;
    public final String rawGroupJid;
    public final String[] rawUserJids;

    public SyncDevicesAndSendInvisibleMessageJob(C444023h r6, UserJid[] userJidArr) {
        super(AnonymousClass3EC.A00(new C190849lc()));
        C17960vV.A0J(userJidArr);
        AnonymousClass205 r3 = r6.A0v;
        AnonymousClass1BI r2 = r3.A00;
        C17960vV.A0G(r2 instanceof GroupJid, "Invalid message");
        this.A02 = r3;
        C17960vV.A07(r2);
        this.rawGroupJid = r2.getRawString();
        this.messageId = r3.A01;
        for (UserJid userJid : userJidArr) {
            Set set = this.A04;
            C17960vV.A08(userJid, "invalid jid");
            set.add(userJid);
        }
        this.rawUserJids = C22971Dz.A0j(Arrays.asList(userJidArr));
    }

    private String A00() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("; key=");
        A10.append(this.A02);
        A10.append("; rawJids=");
        return C17890vO.A0V(this.A04, A10);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        int length;
        objectInputStream.defaultReadObject();
        String[] strArr = this.rawUserJids;
        if (strArr == null || (length = strArr.length) == 0) {
            throw new InvalidObjectException("rawJids must not be empty");
        }
        this.A04 = C17880vN.A12();
        int i = 0;
        while (i < length) {
            String str = strArr[i];
            UserJid A022 = C22941Dw.A02(str);
            if (A022 != null) {
                this.A04.add(A022);
                i++;
            } else {
                throw new InvalidObjectException(C17900vP.A0A("invalid jid:", str));
            }
        }
        GroupJid A032 = GroupJid.Companion.A03(this.rawGroupJid);
        if (A032 != null) {
            this.A02 = AnonymousClass205.A01(A032, this.messageId, true);
        } else {
            throw C17900vP.A06(this.rawGroupJid, AnonymousClass000.A11("invalid jid:"));
        }
    }

    public void A08() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SyncDevicesAndSendInvisibleMessageJob/onAdded/sync devices job added param=");
        C17890vO.A1A(A10, A00());
    }

    public void A09() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SyncDeviceAndResendMessageJob/onCanceled/param=");
        C17890vO.A1B(A10, A00());
        C26171Rc r1 = this.A01;
        AnonymousClass205 r0 = this.A02;
        Set set = r1.A02;
        synchronized (set) {
            set.remove(r0);
        }
    }

    public void A0A() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SyncDevicesAndSendInvisibleMessageJob/onRun/param=");
        C17890vO.A1A(A10, A00());
        try {
            AnonymousClass12E r1 = this.A00;
            Set set = this.A04;
            C17960vV.A0A("jid list is empty", set);
            AnonymousClass2R1 r3 = AnonymousClass2R1.A0I;
            set.size();
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("SyncDevicesAndSendInvisibleMessageJob/onRun/sync is success=");
            C17900vP.A0r(A102, ((C62602rf) r1.A04(C62132qq.A0H, r3, set, true, true).get()).A00());
            C58752lC r2 = this.A03;
            String str = this.rawGroupJid;
            C36321nh r0 = GroupJid.Companion;
            r2.A01(AnonymousClass205.A01(C36321nh.A01(str), this.messageId, true));
        } catch (Exception e) {
            StringBuilder A103 = AnonymousClass000.A10();
            A103.append("SyncDevicesAndSendInvisibleMessageJob/onRun/error, param=");
            C17890vO.A19(A103, A00());
            throw e;
        }
    }

    public boolean A0C(Exception exc) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SyncDeviceAndResendMessageJob/onShouldReply/param=");
        A10.append(A00());
        C17900vP.A0Z(exc, " ;exception=", A10);
        return true;
    }

    public void CIZ(Context context) {
        AnonymousClass10E r1 = (AnonymousClass10E) C17900vP.A04(context);
        this.A00 = (AnonymousClass12E) r1.A2k.get();
        this.A01 = (C26171Rc) r1.A3N.get();
        this.A03 = (C58752lC) r1.AAC.get();
        this.A01.A01(this.A02);
    }
}
