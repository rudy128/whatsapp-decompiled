package com.whatsapp.jobqueue.job;

import X.A83;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass0DT;
import X.AnonymousClass10E;
import X.AnonymousClass11P;
import X.AnonymousClass1E0;
import X.AnonymousClass1MD;
import X.AnonymousClass1P3;
import X.AnonymousClass3DD;
import X.AnonymousClass3EF;
import X.AnonymousClass8X8;
import X.AnonymousClass8ZH;
import X.C163908Wu;
import X.C166418cr;
import X.C173408v1;
import X.C17880vN;
import X.C17890vO;
import X.C17900vP;
import X.C17960vV;
import X.C189809jt;
import X.C194059r6;
import X.C198079xk;
import X.C21499Al8;
import X.C22488B9u;
import X.C22941Dw;
import X.C22971Dz;
import X.C25571Os;
import X.C25581Ot;
import X.C25611Ow;
import X.C27101Us;
import X.C27131Uv;
import X.C29621ca;
import X.C32501hI;
import X.C51942a6;
import X.C58762lD;
import X.C59982nC;
import X.C60132nR;
import X.C62812s2;
import X.C63962tz;
import X.C71363Ez;
import X.DSQ;
import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.jobqueue.requirement.AxolotlSessionRequirement;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.whispersystems.jobqueue.Job;
import org.whispersystems.jobqueue.requirements.Requirement;

public final class SendLiveLocationKeyJob extends Job implements C22488B9u {
    public static final long serialVersionUID = 1;
    public transient AnonymousClass1P3 A00;
    public transient C32501hI A01;
    public transient C25581Ot A02;
    public transient C27131Uv A03;
    public transient C27101Us A04;
    public final ArrayList rawJids;
    public final Integer retryCount;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SendLiveLocationKeyJob(java.util.List r5) {
        /*
            r4 = this;
            X.9lc r3 = new X.9lc
            r3.<init>()
            java.util.Iterator r2 = r5.iterator()
        L_0x0009:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0029
            com.whatsapp.jid.UserJid r1 = X.C17880vN.A0T(r2)
            if (r1 == 0) goto L_0x0009
            X.1E0 r0 = com.whatsapp.jid.DeviceJid.Companion
            com.whatsapp.jid.DeviceJid r0 = r1.getPrimaryDevice()
            X.C17960vV.A07(r0)
            com.whatsapp.jobqueue.requirement.AxolotlSessionRequirement r1 = new com.whatsapp.jobqueue.requirement.AxolotlSessionRequirement
            r1.<init>(r0)
            java.util.List r0 = r3.A01
            r0.add(r1)
            goto L_0x0009
        L_0x0029:
            java.lang.String r0 = "SendLiveLocationKeyJob"
            X.AnonymousClass3EB.A00(r0, r3)
            org.whispersystems.jobqueue.JobParameters r0 = r3.A00()
            r4.<init>(r0)
            java.lang.String r0 = ""
            X.C17960vV.A0A(r0, r5)
            java.util.ArrayList r0 = X.C22971Dz.A0B(r5)
            r4.rawJids = r0
            r0 = 0
            r4.retryCount = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendLiveLocationKeyJob.<init>(java.util.List):void");
    }

    public static C166418cr A00(Jid jid, SendLiveLocationKeyJob sendLiveLocationKeyJob) {
        C59982nC r3 = new C59982nC(C63962tz.A02(sendLiveLocationKeyJob.A03.A0L()), jid.getRawString());
        AnonymousClass1P3 r1 = sendLiveLocationKeyJob.A00;
        C71363Ez A012 = C25571Os.A01(r1.A0H, r3);
        A012.lock();
        try {
            C51942a6 r12 = new C51942a6(new C189809jt(r1.A01.A00.A01).A00(C62812s2.A02(r3)).A01);
            A012.close();
            AnonymousClass8X8 A002 = C166418cr.A00();
            AnonymousClass8ZH r0 = ((C166418cr) A002.A00).fastRatchetKeySenderKeyDistributionMessage_;
            if (r0 == null) {
                r0 = AnonymousClass8ZH.DEFAULT_INSTANCE;
            }
            C163908Wu r32 = (C163908Wu) r0.A0O();
            r32.A0H(jid.getRawString());
            byte[] bArr = r12.A00;
            C17960vV.A07(bArr);
            r32.A0G(DSQ.A01(bArr, 0, bArr.length));
            C166418cr r13 = (C166418cr) C17880vN.A0G(A002);
            AnonymousClass8ZH r02 = (AnonymousClass8ZH) r32.A0C();
            r02.getClass();
            r13.fastRatchetKeySenderKeyDistributionMessage_ = r02;
            r13.bitField0_ |= 16384;
            return (C166418cr) A002.A0C();
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
            throw th;
        }
    }

    public void A0A() {
        ArrayList arrayList;
        C166418cr r3;
        C194059r6 r0;
        DeviceJid deviceJid;
        Integer num = this.retryCount;
        int i = 0;
        C27131Uv r10 = this.A03;
        if (num != null) {
            UserJid A022 = C22941Dw.A02((String) this.rawJids.get(0));
            int intValue = this.retryCount.intValue();
            synchronized (r10.A0U) {
                if (!r10.A0e(A022, intValue)) {
                    List emptyList = Collections.emptyList();
                    arrayList = emptyList;
                } else {
                    List singletonList = Collections.singletonList(A022);
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("LocationSharingManager/markParticipantsAsNeedSenderKey; jids.size");
                    C17900vP.A0o(A10, singletonList.size());
                    ArrayList A13 = AnonymousClass000.A13();
                    C27131Uv.A06(r10);
                    Iterator it = singletonList.iterator();
                    while (it.hasNext()) {
                        UserJid A0T = C17880vN.A0T(it);
                        if (!r10.A08.A0O(A0T)) {
                            HashSet hashSet = r10.A0V;
                            if (hashSet.contains(A0T)) {
                                hashSet.remove(A0T);
                                A13.add(A0T);
                            }
                        }
                    }
                    r10.A0K.A09(A13, false);
                    new Object();
                    ((C25611Ow) r10.A0N.get()).A00.A00();
                    StringBuilder A102 = AnonymousClass000.A10();
                    A102.append("LocationSharingManager/markSendingLocationKeyRetry/marking; remote_resource=");
                    A102.append(A022);
                    C17900vP.A0j("; retryCount=", A102, intValue);
                    r10.A0Z.put(A022, C17890vO.A0F(Long.valueOf(AnonymousClass11P.A01(r10.A0D)), intValue));
                    r10.A0b.put(A022, C17880vN.A0h());
                    List singletonList2 = Collections.singletonList(A022);
                    arrayList = singletonList2;
                }
            }
        } else {
            ArrayList A0A = C22971Dz.A0A(UserJid.class, this.rawJids);
            synchronized (r10.A0U) {
                ArrayList A132 = AnonymousClass000.A13();
                ArrayList A0M = r10.A0M();
                Iterator it2 = A0A.iterator();
                while (it2.hasNext()) {
                    UserJid A0T2 = C17880vN.A0T(it2);
                    Map map = r10.A0b;
                    Integer num2 = (Integer) map.get(A0T2);
                    if (A0M.contains(A0T2) && (num2 == null || num2.intValue() != 1)) {
                        A132.add(A0T2);
                        C17880vN.A1P(A0T2, map, 1);
                    }
                }
                arrayList = A132;
            }
        }
        boolean isEmpty = arrayList.isEmpty();
        StringBuilder A103 = AnonymousClass000.A10();
        if (isEmpty) {
            A103.append("skip send live location key job; no one to send");
            C17890vO.A1A(A103, A01());
            return;
        }
        A103.append("run send live location key job");
        C17890vO.A1A(A103, A01());
        try {
            C173408v1 r8 = C173408v1.A00;
            if (this.A00.A0Y()) {
                r3 = A00(r8, this);
            } else {
                C25581Ot r32 = this.A02;
                r3 = (C166418cr) r32.A00.submit(new C21499Al8(r8, this, 4)).get();
            }
            HashMap A11 = C17880vN.A11();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                UserJid A0T3 = C17880vN.A0T(it3);
                if (this.A00.A0Y()) {
                    AnonymousClass1E0 r02 = DeviceJid.Companion;
                    if (A0T3 != null) {
                        deviceJid = A0T3.getPrimaryDevice();
                    } else {
                        deviceJid = null;
                    }
                    r0 = C198079xk.A00(this.A00.A0B(C63962tz.A02(deviceJid), r3.A0M()));
                } else {
                    C25581Ot r6 = this.A02;
                    r0 = (C194059r6) r6.A00.submit(new AnonymousClass3DD(r3, this, A0T3, 3)).get();
                }
                A11.put(A0T3, r0);
            }
            C27101Us r33 = this.A04;
            Integer num3 = this.retryCount;
            if (num3 != null) {
                i = num3.intValue();
            }
            AnonymousClass00H r9 = r33.A02;
            String A0C = C17880vN.A0U(r9).A0C();
            C58762lD r03 = new C58762lD();
            r03.A06 = "notification";
            r03.A09 = "location";
            r03.A02 = r8;
            r03.A08 = A0C;
            C60132nR A002 = r03.A00();
            AnonymousClass1MD[] r5 = new AnonymousClass1MD[3];
            boolean A1W = C17890vO.A1W(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0C, r5);
            r5[1] = new AnonymousClass1MD((Jid) r8, "to");
            C17890vO.A12(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "location", r5);
            C29621ca[] r102 = new C29621ca[A11.size()];
            Iterator A0i = C17890vO.A0i(A11);
            int i2 = 0;
            while (A0i.hasNext()) {
                Map.Entry A16 = AnonymousClass000.A16(A0i);
                AnonymousClass1MD[] r34 = new AnonymousClass1MD[1];
                C17880vN.A1I((Jid) A16.getKey(), "jid", r34, A1W ? 1 : 0);
                r102[i2] = new C29621ca(A83.A01((C194059r6) A16.getValue(), i), "to", r34);
                i2++;
            }
            C17880vN.A0U(r9).A08(new C29621ca(new C29621ca("participants", (AnonymousClass1MD[]) null, r102), "notification", r5), A002, 123).get();
            StringBuilder A104 = AnonymousClass000.A10();
            A104.append("sent location key distribution notifications");
            C17890vO.A1A(A104, A01());
            C27131Uv r7 = this.A03;
            StringBuilder A105 = AnonymousClass000.A10();
            A105.append("LocationSharingManager/markSentLocationKey; jids.size=");
            C17900vP.A0o(A105, arrayList.size());
            ArrayList A133 = AnonymousClass000.A13();
            synchronized (r7.A0U) {
                C27131Uv.A06(r7);
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    UserJid A0T4 = C17880vN.A0T(it4);
                    if (!r7.A08.A0O(A0T4)) {
                        HashSet hashSet2 = r7.A0V;
                        if (!hashSet2.contains(A0T4)) {
                            Map map2 = r7.A0b;
                            Integer num4 = (Integer) map2.get(A0T4);
                            if (num4 != null && num4.intValue() == 1) {
                                hashSet2.add(A0T4);
                                A133.add(A0T4);
                                map2.remove(A0T4);
                            }
                        }
                    }
                }
                r7.A0K.A09(A133, true);
                if (r7.A0b()) {
                    r7.A0T();
                }
            }
            new Object();
            ((C25611Ow) r7.A0N.get()).A00.A00();
        } catch (Exception e) {
            C27131Uv r4 = this.A03;
            synchronized (r4.A0U) {
                Iterator it5 = arrayList.iterator();
                while (it5.hasNext()) {
                    r4.A0b.remove(C17880vN.A0T(it5));
                }
                throw e;
            }
        }
    }

    private String A01() {
        StringBuilder A10 = AnonymousClass000.A10();
        C17900vP.A0q(A10, this);
        A10.append("; jids.size()=");
        A10.append(this.rawJids.size());
        A10.append("; retryCount=");
        return C17890vO.A0V(this.retryCount, A10);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        if (!this.rawJids.isEmpty()) {
            Integer num = this.retryCount;
            if (num != null && num.intValue() < 0) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("retryCount cannot be negative");
                throw C17900vP.A06(A01(), A10);
            }
            return;
        }
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("jids must not be empty");
        throw C17900vP.A06(A01(), A102);
    }

    public void A08() {
        DeviceJid deviceJid;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("live location key notification send job added");
        C17890vO.A1A(A10, A01());
        HashSet A12 = C17880vN.A12();
        for (Requirement requirement : this.parameters.requirements) {
            if (requirement instanceof AxolotlSessionRequirement) {
                AxolotlSessionRequirement axolotlSessionRequirement = (AxolotlSessionRequirement) requirement;
                if (!axolotlSessionRequirement.Bfv()) {
                    deviceJid = axolotlSessionRequirement.A00;
                }
            } else if (requirement instanceof AnonymousClass3EF) {
                AnonymousClass3EF r1 = (AnonymousClass3EF) requirement;
                if (!r1.Bfv()) {
                    deviceJid = r1.A00;
                }
            }
            A12.add(deviceJid);
        }
        this.A01.A04((DeviceJid[]) A12.toArray(new DeviceJid[0]), 4, false);
    }

    public void A09() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("canceled send live location key job");
        C17890vO.A1B(A10, A01());
    }

    public boolean A0C(Exception exc) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("exception while running send live location key job");
        C17890vO.A13(A01(), A10, exc);
        return true;
    }

    public void CIZ(Context context) {
        AnonymousClass10E r1 = (AnonymousClass10E) C17900vP.A04(context);
        this.A02 = (C25581Ot) r1.A9z.get();
        this.A00 = (AnonymousClass1P3) r1.A9y.get();
        this.A04 = (C27101Us) r1.A5r.get();
        this.A01 = (C32501hI) r1.A8Y.get();
        this.A03 = (C27131Uv) r1.A5p.get();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SendLiveLocationKeyJob(com.whatsapp.jid.DeviceJid r4, byte[] r5, int r6) {
        /*
            r3 = this;
            X.9lc r2 = new X.9lc
            r2.<init>()
            if (r5 == 0) goto L_0x0011
            int r0 = r5.length
            if (r0 != 0) goto L_0x0011
            java.lang.String r0 = "cannot use empty old alice base key"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x0011:
            com.whatsapp.jobqueue.requirement.AxolotlSessionRequirement r0 = new com.whatsapp.jobqueue.requirement.AxolotlSessionRequirement
            r0.<init>(r4)
            java.util.List r1 = r2.A01
            r1.add(r0)
            if (r5 == 0) goto L_0x0025
            X.3EF r0 = new X.3EF
            r0.<init>(r4, r5)
            r1.add(r0)
        L_0x0025:
            java.lang.String r0 = "SendLiveLocationKeyJob"
            r2.A00 = r0
            r0 = 1
            r2.A02 = r0
            X.3EB r0 = new X.3EB
            r0.<init>()
            r1.add(r0)
            org.whispersystems.jobqueue.JobParameters r0 = r2.A00()
            r3.<init>(r0)
            if (r6 < 0) goto L_0x0053
            java.util.ArrayList r1 = X.AnonymousClass000.A13()
            r3.rawJids = r1
            com.whatsapp.jid.UserJid r0 = r4.userJid
            java.lang.String r0 = r0.getRawString()
            r1.add(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r3.retryCount = r0
            return
        L_0x0053:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "retryCount cannot be negative"
            r1.append(r0)
            java.lang.String r0 = r3.A01()
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A12(r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendLiveLocationKeyJob.<init>(com.whatsapp.jid.DeviceJid, byte[], int):void");
    }
}
