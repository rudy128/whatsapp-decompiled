package com.whatsapp.jobqueue.job;

import X.AnonymousClass000;
import X.AnonymousClass10E;
import X.AnonymousClass1MD;
import X.AnonymousClass1OZ;
import X.C000100c;
import X.C173438v4;
import X.C17880vN;
import X.C17890vO;
import X.C17900vP;
import X.C18070vi;
import X.C20978AcW;
import X.C22488B9u;
import X.C25111Mx;
import X.C26981Ug;
import X.C29621ca;
import X.C53122c1;
import X.C60062nK;
import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import org.whispersystems.jobqueue.Job;

public final class GeneratePrivacyTokenJob extends Job implements C22488B9u {
    public static final long serialVersionUID = 1;
    public transient C25111Mx A00;
    public transient UserJid A01;
    public transient AnonymousClass1OZ A02;
    public transient C60062nK A03;
    public final String toJid;

    public void A08() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001d, code lost:
        if (r1 >= 500) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0C(java.lang.Exception r4) {
        /*
            r3 = this;
            r0 = 0
            X.C18070vi.A0d(r4, r0)
            java.lang.Throwable r1 = r4.getCause()
            boolean r0 = r1 instanceof X.C122936Sm
            if (r0 == 0) goto L_0x001f
            X.6Sm r1 = (X.C122936Sm) r1
            X.1ca r0 = r1.node
            if (r0 == 0) goto L_0x001f
            int r1 = X.C60482o6.A00(r0)
            r0 = 400(0x190, float:5.6E-43)
            if (r0 > r1) goto L_0x001f
            r0 = 500(0x1f4, float:7.0E-43)
            r2 = 0
            if (r1 < r0) goto L_0x0020
        L_0x001f:
            r2 = 1
        L_0x0020:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "exception while running generate privacy token job, "
            r1.append(r0)
            if (r2 == 0) goto L_0x0044
            java.lang.String r0 = ""
        L_0x002d:
            r1.append(r0)
            java.lang.String r0 = "retrying"
            r1.append(r0)
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()
            X.C17900vP.A0q(r0, r3)
            java.lang.String r0 = r0.toString()
            X.C17890vO.A13(r0, r1, r4)
            return r2
        L_0x0044:
            java.lang.String r0 = "not "
            goto L_0x002d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.GeneratePrivacyTokenJob.A0C(java.lang.Exception):boolean");
    }

    public void CIZ(Context context) {
        C18070vi.A0d(context, 0);
        C000100c A0H = C17890vO.A0H(context);
        this.A02 = A0H.BAA();
        AnonymousClass10E r1 = (AnonymousClass10E) A0H;
        this.A00 = (C25111Mx) r1.A8k.get();
        this.A03 = (C60062nK) r1.A8l.get();
        UserJid A04 = UserJid.Companion.A04(this.toJid);
        this.A01 = A04;
        if (A04 != null) {
            C60062nK r0 = this.A03;
            if (r0 == null) {
                C18070vi.A11("privacyTokenSendManager");
                throw null;
            } else {
                r0.A03(A04);
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public GeneratePrivacyTokenJob(com.whatsapp.jid.UserJid r3) {
        /*
            r2 = this;
            X.9lc r1 = new X.9lc
            r1.<init>()
            java.lang.String r0 = "generate-tc-token"
            X.AnonymousClass3EB.A00(r0, r1)
            org.whispersystems.jobqueue.JobParameters r0 = r1.A00()
            r2.<init>(r0)
            java.lang.String r0 = r3.getRawString()
            r2.toJid = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.GeneratePrivacyTokenJob.<init>(com.whatsapp.jid.UserJid):void");
    }

    public void A09() {
        UserJid userJid = this.A01;
        if (userJid != null) {
            C60062nK r0 = this.A03;
            if (r0 == null) {
                C18070vi.A11("privacyTokenSendManager");
                throw null;
            }
            r0.A01(userJid);
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("canceled generate privacy token job ");
        StringBuilder A102 = AnonymousClass000.A10();
        C17900vP.A0q(A102, this);
        C17890vO.A1B(A10, A102.toString());
    }

    public void A0A() {
        Long l;
        UserJid userJid = this.A01;
        if (userJid == null) {
            Log.e("GeneratePrivacyTokenJob/onRun Stored UserJid String was invalid");
            return;
        }
        C25111Mx r0 = this.A00;
        if (r0 != null) {
            C53122c1 A06 = r0.A06(userJid);
            if (A06 != null) {
                l = Long.valueOf(A06.A00);
            } else {
                l = null;
            }
            if (l != null) {
                C25111Mx r02 = this.A00;
                if (r02 != null) {
                    long longValue = l.longValue();
                    if (longValue >= r02.A03()) {
                        AnonymousClass1OZ r1 = this.A02;
                        if (r1 != null) {
                            String A0B = r1.A0B();
                            C26981Ug r19 = new C26981Ug();
                            AnonymousClass1OZ r7 = this.A02;
                            if (r7 != null) {
                                AnonymousClass1MD[] r2 = new AnonymousClass1MD[3];
                                C17880vN.A1I(userJid, "jid", r2, 0);
                                C17880vN.A1Q(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "trusted_contact", r2, 1);
                                r2[2] = new AnonymousClass1MD("t", longValue);
                                C29621ca r3 = new C29621ca(new C29621ca("token", r2), "tokens", (AnonymousClass1MD[]) null);
                                AnonymousClass1MD[] r22 = new AnonymousClass1MD[4];
                                C17880vN.A1Q(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0B, r22, 0);
                                C17880vN.A1I(C173438v4.A00, "to", r22, 1);
                                C17880vN.A1Q("xmlns", "privacy", r22, 2);
                                C17880vN.A1Q(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set", r22, 3);
                                C29621ca r03 = new C29621ca(r3, "iq", r22);
                                r7.A0N(new C20978AcW(l, r19, this, userJid, 4), r03, A0B, 299, 32000);
                                try {
                                    r19.get();
                                    C60062nK r04 = this.A03;
                                    if (r04 == null) {
                                        C18070vi.A11("privacyTokenSendManager");
                                        throw null;
                                    } else {
                                        r04.A01(userJid);
                                        return;
                                    }
                                } catch (Exception e) {
                                    Log.e("GeneratePrivacyTokenJob/onRun Failed to deliver Privacy Token generate request");
                                    throw e;
                                }
                            }
                        }
                        C18070vi.A11("messageClient");
                        throw null;
                    }
                }
            }
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("GeneratePrivacyTokenJob/onRun Token timestamp ");
            A10.append(l);
            C17890vO.A1B(A10, " missing or too old to send");
            C60062nK r05 = this.A03;
            if (r05 == null) {
                C18070vi.A11("privacyTokenSendManager");
                throw null;
            } else {
                r05.A01(userJid);
                return;
            }
        }
        C18070vi.A11("privacyTokenManager");
        throw null;
    }
}
