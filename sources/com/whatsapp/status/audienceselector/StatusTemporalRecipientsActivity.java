package com.whatsapp.status.audienceselector;

import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FB;
import X.AnonymousClass1K1;
import X.AnonymousClass77K;
import X.C000200d;
import X.C108955ca;
import X.C108965cb;
import X.C109005cf;
import X.C114635rQ;
import X.C126426ci;
import X.C138896xs;
import X.C1423279a;
import X.C18020vd;
import X.C18040vf;
import X.C18070vi;
import X.C25001Mm;
import X.C41911xI;
import X.C56422hR;
import android.os.Bundle;
import com.whatsapp.util.Log;
import java.util.List;

public final class StatusTemporalRecipientsActivity extends StatusRecipientsActivity {
    public AnonymousClass77K A00;
    public AnonymousClass00H A01;
    public AnonymousClass00H A02;
    public AnonymousClass00H A03;
    public AnonymousClass00H A04;
    public List A05;
    public boolean A06;

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0012, code lost:
        if (r0 == null) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass77K A12(com.whatsapp.status.audienceselector.StatusTemporalRecipientsActivity r8) {
        /*
            X.77K r0 = r8.A00
            if (r0 != 0) goto L_0x0039
            android.os.Bundle r1 = X.AnonymousClass3MY.A09(r8)
            if (r1 == 0) goto L_0x0014
            X.00H r0 = r8.A02
            if (r0 == 0) goto L_0x003d
            X.77K r0 = X.AnonymousClass727.A00(r1, r0)
            if (r0 != 0) goto L_0x0037
        L_0x0014:
            X.1Le r0 = r8.A03
            if (r0 == 0) goto L_0x003a
            int r3 = r0.A05()
            java.util.List r0 = r8.A4c()
            java.util.ArrayList r1 = X.C29431cG.A0m(r0)
            X.77K r0 = A12(r8)
            java.util.List r0 = r0.A02
            java.util.ArrayList r2 = X.C29431cG.A0m(r0)
            r4 = 0
            r6 = r4
            r7 = r4
            X.77K r0 = new X.77K
            r5 = r4
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
        L_0x0037:
            r8.A00 = r0
        L_0x0039:
            return r0
        L_0x003a:
            java.lang.String r0 = "statusStore"
            goto L_0x003f
        L_0x003d:
            java.lang.String r0 = "statusAudienceRepository"
        L_0x003f:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.status.audienceselector.StatusTemporalRecipientsActivity.A12(com.whatsapp.status.audienceselector.StatusTemporalRecipientsActivity):X.77K");
    }

    public void A2y() {
        if (!this.A06) {
            this.A06 = true;
            AnonymousClass1K1 A0K = C108955ca.A0K(this);
            AnonymousClass10E A0A = C109005cf.A0A(A0K, this);
            AnonymousClass1FB.A0M(A0A, this);
            AnonymousClass10G r1 = A0A.A00;
            C109005cf.A0d(A0A, r1, this);
            C109005cf.A0e(A0A, r1, this, r1.A5A);
            C114635rQ.A10(this, A0K, A0A, r1);
            this.A00 = (C56422hR) A0K.A2t.get();
            this.A03 = C108955ca.A0M(A0A);
            this.A04 = C108965cb.A0Z(A0A);
            this.A02 = (C41911xI) A0A.AAl.get();
            this.A01 = (C25001Mm) A0A.ABf.get();
            this.A01 = C000200d.A00(A0A.A9u);
            this.A02 = C000200d.A00(r1.A4e);
            this.A03 = C000200d.A00(A0A.AAB);
            this.A04 = C000200d.A00(r1.AHb);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0039, code lost:
        if (r0 == false) goto L_0x003b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void finish() {
        /*
            r6 = this;
            X.00H r0 = r6.A03
            if (r0 == 0) goto L_0x0057
            X.0ve r2 = X.C108955ca.A0R(r0)
            r1 = 8104(0x1fa8, float:1.1356E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0050
            X.00H r0 = r6.A04
            if (r0 == 0) goto L_0x0054
            java.lang.Object r5 = r0.get()
            X.6ci r5 = (X.C126426ci) r5
            java.lang.String r4 = "selection_changed"
            java.util.List r0 = r6.A05
            java.lang.String r3 = "originalSelectedContacts"
            if (r0 == 0) goto L_0x005d
            int r2 = r0.size()
            java.util.Set r1 = r6.A0S
            int r0 = r1.size()
            if (r2 != r0) goto L_0x003b
            java.util.List r0 = r6.A05
            if (r0 == 0) goto L_0x005d
            boolean r0 = r0.containsAll(r1)
            r1 = 0
            if (r0 != 0) goto L_0x003c
        L_0x003b:
            r1 = 1
        L_0x003c:
            X.2nU r0 = r5.A00
            r0.A06(r4, r1)
            X.00H r0 = r6.A04
            if (r0 == 0) goto L_0x0054
            java.lang.Object r0 = r0.get()
            X.6ci r0 = (X.C126426ci) r0
            X.2nU r0 = r0.A00
            r0.A00()
        L_0x0050:
            super.finish()
            return
        L_0x0054:
            java.lang.String r0 = "statusQplLoggerLazy"
            goto L_0x0059
        L_0x0057:
            java.lang.String r0 = "statusConfig"
        L_0x0059:
            X.C18070vi.A11(r0)
            goto L_0x0060
        L_0x005d:
            X.C18070vi.A11(r3)
        L_0x0060:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.status.audienceselector.StatusTemporalRecipientsActivity.finish():void");
    }

    public StatusTemporalRecipientsActivity(int i) {
        this.A06 = false;
        C1423279a.A00(this, 42);
    }

    public void onCreate(Bundle bundle) {
        List list;
        String str;
        String str2;
        super.onCreate(bundle);
        Log.i("StatusTemporalRecipientsActivity/onCreate");
        boolean z = this.A0K;
        AnonymousClass77K A12 = A12(this);
        if (z) {
            list = A12.A02;
        } else {
            list = A12.A01;
        }
        this.A05 = list;
        AnonymousClass00H r0 = this.A03;
        if (r0 != null) {
            if (C18020vd.A05(C18040vf.A02, C108955ca.A0R(r0), 8104)) {
                AnonymousClass00H r02 = this.A01;
                if (r02 != null) {
                    Long l = ((C138896xs) r02.get()).A00;
                    if (l != null) {
                        long longValue = l.longValue();
                        AnonymousClass00H r03 = this.A04;
                        if (r03 != null) {
                            C126426ci r1 = (C126426ci) r03.get();
                            if (!this.A0K) {
                                str2 = "default_only_share_with";
                            } else {
                                str2 = "default_my_contacts_except";
                            }
                            r1.A00.A01(453118039, str2, longValue);
                            AnonymousClass00H r04 = this.A04;
                            if (r04 != null) {
                                ((C126426ci) r04.get()).A00.A04("see_full_screen_status_audience_selector");
                                return;
                            }
                        }
                        str = "statusQplLoggerLazy";
                    } else {
                        return;
                    }
                } else {
                    str = "sharingSessionManager";
                }
            } else {
                return;
            }
        } else {
            str = "statusConfig";
        }
        C18070vi.A11(str);
        throw null;
    }

    public StatusTemporalRecipientsActivity() {
        this(0);
    }
}
