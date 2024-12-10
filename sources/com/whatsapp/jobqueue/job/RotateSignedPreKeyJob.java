package com.whatsapp.jobqueue.job;

import X.A8G;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0DT;
import X.AnonymousClass10E;
import X.AnonymousClass120;
import X.AnonymousClass1MD;
import X.AnonymousClass1OZ;
import X.AnonymousClass1P3;
import X.C000100c;
import X.C146447Pd;
import X.C146507Pj;
import X.C173438v4;
import X.C17890vO;
import X.C17900vP;
import X.C21490Akz;
import X.C22488B9u;
import X.C25571Os;
import X.C25581Ot;
import X.C29621ca;
import X.C54492eE;
import X.C60482o6;
import X.C71363Ez;
import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.security.MessageDigest;
import java.util.Arrays;
import org.whispersystems.jobqueue.Job;

public final class RotateSignedPreKeyJob extends Job implements C22488B9u {
    public static final long serialVersionUID = 1;
    public transient AnonymousClass1P3 A00;
    public transient AnonymousClass120 A01;
    public transient C25581Ot A02;
    public transient C25571Os A03;
    public transient AnonymousClass1OZ A04;
    public final byte[] data;
    public final byte[] id;
    public final byte[] signature;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public RotateSignedPreKeyJob(byte[] r4, byte[] r5, byte[] r6) {
        /*
            r3 = this;
            X.9lc r1 = new X.9lc
            r1.<init>()
            java.lang.String r0 = "RotateSignedPreKeyJob"
            X.AnonymousClass3EB.A00(r0, r1)
            org.whispersystems.jobqueue.JobParameters r0 = r1.A00()
            r3.<init>(r0)
            X.C17960vV.A0I(r4)
            r3.id = r4
            X.C17960vV.A0I(r5)
            r3.data = r5
            X.C17960vV.A0I(r6)
            r3.signature = r6
            int r2 = r4.length
            r0 = 3
            if (r2 != r0) goto L_0x0045
            int r2 = r5.length
            r0 = 32
            if (r2 != r0) goto L_0x003a
            int r2 = r6.length
            r0 = 64
            if (r2 != r0) goto L_0x002f
            return
        L_0x002f:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "invalid signed pre-key signature length: "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A13(r0, r1, r2)
            throw r0
        L_0x003a:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "invalid signed pre-key length: "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A13(r0, r1, r2)
            throw r0
        L_0x0045:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "invalid signed pre-key id length: "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A13(r0, r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.RotateSignedPreKeyJob.<init>(byte[], byte[], byte[]):void");
    }

    public static void A00(RotateSignedPreKeyJob rotateSignedPreKeyJob, byte[] bArr) {
        C71363Ez A07 = rotateSignedPreKeyJob.A03.A07();
        try {
            if (!MessageDigest.isEqual(bArr, rotateSignedPreKeyJob.A00.A0f())) {
                rotateSignedPreKeyJob.A00.A0Q();
                rotateSignedPreKeyJob.A01.A07();
            }
            if (A07 != null) {
                A07.close();
            }
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
            throw th;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        byte[] bArr = this.id;
        if (bArr != null) {
            byte[] bArr2 = this.data;
            if (bArr2 != null) {
                byte[] bArr3 = this.signature;
                if (bArr3 != null) {
                    int length = bArr.length;
                    if (length == 3) {
                        int length2 = bArr2.length;
                        if (length2 == 32) {
                            int length3 = bArr3.length;
                            if (length3 != 64) {
                                throw new InvalidObjectException(AnonymousClass001.A1I("invalid signed pre-key signature length: ", AnonymousClass000.A10(), length3));
                            }
                            return;
                        }
                        throw new InvalidObjectException(AnonymousClass001.A1I("invalid signed pre-key length: ", AnonymousClass000.A10(), length2));
                    }
                    throw new InvalidObjectException(AnonymousClass001.A1I("invalid signed pre-key id length: ", AnonymousClass000.A10(), length));
                }
                throw new InvalidObjectException("signature cannot be null");
            }
            throw new InvalidObjectException("data cannot be null");
        }
        throw new InvalidObjectException("id cannot be null");
    }

    public void A08() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("RotateSignedPreKeyJob/rotate signed pre key job added");
        C17890vO.A1A(A10, A0D());
    }

    public void A09() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("RotateSignedPreKeyJob/canceled rotate signed pre key job");
        C17890vO.A1B(A10, A0D());
    }

    public void A0A() {
        C54492eE r0;
        StringBuilder A11;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("RotateSignedPreKeyJob/starting rotate signed pre key job");
        C17890vO.A1A(A10, A0D());
        boolean A0Y = this.A00.A0Y();
        if (A0Y) {
            r0 = this.A00.A0J();
        } else {
            C25581Ot r2 = this.A02;
            r0 = (C54492eE) r2.A00.submit(new C21490Akz(this, 10)).get();
        }
        if (!Arrays.equals(this.id, r0.A01)) {
            A11 = AnonymousClass000.A10();
            A11.append("RotateSignedPreKeyJob/aborting rotate signed pre key job due to id mismatch with latest");
        } else {
            String A0B = this.A04.A0B();
            Log.i("RotateSignedPreKeyJob/rotate pre key");
            AnonymousClass1OZ r6 = this.A04;
            C54492eE r10 = new C54492eE(this.id, this.data, this.signature);
            AnonymousClass1MD[] r8 = new AnonymousClass1MD[4];
            boolean A1W = C17890vO.A1W("xmlns", "encrypt", r8);
            r8[1] = new AnonymousClass1MD(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set");
            r8[2] = new AnonymousClass1MD((Jid) C173438v4.A00, "to");
            r8[3] = new AnonymousClass1MD(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0B);
            C29621ca[] r22 = new C29621ca[3];
            byte[] bArr = null;
            C29621ca.A06(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r10.A01, r22, A1W ? 1 : 0);
            C29621ca.A06("value", r10.A00, r22, 1);
            C29621ca.A06(PublicKeyCredentialControllerUtility.JSON_KEY_SIGNATURE, r10.A02, r22, 2);
            C29621ca r23 = (C29621ca) r6.A09(new C29621ca(new C29621ca(new C29621ca("skey", (AnonymousClass1MD[]) null, r22), "rotate", (AnonymousClass1MD[]) null), "iq", r8), A0B, 86).get();
            int i = 0;
            if ("result".equals(r23.A0Q(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, (String) null))) {
                if (A0Y) {
                    this.A00.A0R(A8G.A00(this.id));
                } else {
                    this.A02.A00(new C146447Pd(this, 35));
                }
            } else if (C60482o6.A00(r23) != 0) {
                C29621ca A0L = r23.A0L("error");
                i = A0L.A0A("code", A1W);
                C29621ca A0K = A0L.A0K("identity");
                if (A0K != null) {
                    bArr = A0K.A01;
                }
                if (i == 503) {
                    StringBuilder A102 = AnonymousClass000.A10();
                    A102.append("server 503 error during rotate signed pre key job");
                    throw new Exception(AnonymousClass000.A0y(A0D(), A102));
                }
            }
            if (i == 409) {
                StringBuilder A112 = AnonymousClass000.A11("RotateSignedPreKeyJob/server error code returned during rotate signed pre key job; errorCode=");
                A112.append(i);
                C17890vO.A1B(A112, A0D());
                if (bArr == null) {
                    return;
                }
                if (A0Y) {
                    A00(this, bArr);
                    return;
                } else {
                    this.A02.A00(new C146507Pj(this, bArr, 33));
                    return;
                }
            } else if (i != 0) {
                A11 = AnonymousClass000.A11("RotateSignedPreKeyJob/server error code returned during rotate signed pre key job; errorCode=");
                A11.append(i);
            } else {
                return;
            }
        }
        C17890vO.A1B(A11, A0D());
    }

    public boolean A0C(Exception exc) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("RotateSignedPreKeyJob/exception while running rotate signed pre key job");
        C17890vO.A13(A0D(), A10, exc);
        return true;
    }

    public String A0D() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("; signedPreKeyId=");
        A10.append(A8G.A00(this.id));
        C17900vP.A0q(A10, this);
        return A10.toString();
    }

    public void CIZ(Context context) {
        C000100c A042 = C17900vP.A04(context);
        AnonymousClass10E r1 = (AnonymousClass10E) A042;
        this.A03 = (C25571Os) r1.AA0.get();
        this.A04 = A042.BAA();
        this.A02 = (C25581Ot) r1.A9z.get();
        this.A01 = (AnonymousClass120) r1.A6z.get();
        this.A00 = (AnonymousClass1P3) r1.A9y.get();
    }
}
