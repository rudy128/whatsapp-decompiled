package com.whatsapp.jobqueue.requirement;

import X.AnonymousClass10E;
import X.AnonymousClass11S;
import X.AnonymousClass1CJ;
import X.AnonymousClass1E9;
import X.AnonymousClass1MS;
import X.AnonymousClass1MZ;
import X.C000100c;
import X.C17900vP;
import X.C18030ve;
import X.C63182se;
import android.content.Context;
import java.util.Set;

public class AxolotlMultiDeviceSenderKeyRequirement extends AxolotlMultiDeviceSessionRequirement {
    public static final long serialVersionUID = 1;
    public transient AnonymousClass11S A00;
    public transient AnonymousClass1CJ A01;
    public transient AnonymousClass1MS A02;
    public transient AnonymousClass1MZ A03;
    public transient C18030ve A04;
    public transient C63182se A05;
    public final String groupParticipantHash;
    public final boolean useLidForEncryption;
    public final boolean useParticipantUserHash;

    public AxolotlMultiDeviceSenderKeyRequirement(AnonymousClass1E9 r7, Boolean bool, String str, String str2, Set set, int i, boolean z, boolean z2) {
        super(r7, bool, str, set, i);
        this.groupParticipantHash = str2;
        this.useLidForEncryption = z;
        this.useParticipantUserHash = z2;
    }

    public void CIZ(Context context) {
        super.CIZ(context);
        C000100c A042 = C17900vP.A04(context);
        this.A04 = A042.BAL();
        this.A00 = A042.BA6();
        AnonymousClass10E r1 = (AnonymousClass10E) A042;
        this.A01 = (AnonymousClass1CJ) r1.A2H.get();
        this.A02 = (AnonymousClass1MS) r1.A4s.get();
        this.A03 = (AnonymousClass1MZ) r1.A4t.get();
        this.A05 = (C63182se) r1.A0b.get();
    }
}
