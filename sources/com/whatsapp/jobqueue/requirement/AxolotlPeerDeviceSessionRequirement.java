package com.whatsapp.jobqueue.requirement;

import X.AnonymousClass000;
import X.AnonymousClass10E;
import X.AnonymousClass1MR;
import X.AnonymousClass1P3;
import X.C17890vO;
import X.C17960vV;
import X.C22488B9u;
import X.C63962tz;
import android.content.Context;
import com.whatsapp.jid.DeviceJid;
import org.whispersystems.jobqueue.requirements.Requirement;

public class AxolotlPeerDeviceSessionRequirement implements Requirement, C22488B9u {
    public static final long serialVersionUID = 1;
    public transient AnonymousClass1P3 A00;
    public transient AnonymousClass1MR A01;
    public final String targetJidRawString;

    public boolean Bfv() {
        DeviceJid A06 = DeviceJid.Companion.A06(this.targetJidRawString);
        C17960vV.A07(A06);
        if (this.A01.A02().contains(A06)) {
            return this.A00.A0b(C63962tz.A02(A06));
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AxolotlDeviceSessionRequirement/isPresent/warning: the specific device is not in db, handle the error in the job. jid=");
        C17890vO.A1B(A10, this.targetJidRawString);
        return true;
    }

    public AxolotlPeerDeviceSessionRequirement(DeviceJid deviceJid) {
        this.targetJidRawString = deviceJid.getRawString();
    }

    public void CIZ(Context context) {
        AnonymousClass10E r1 = (AnonymousClass10E) C17890vO.A0H(context);
        this.A01 = (AnonymousClass1MR) r1.ABD.get();
        this.A00 = (AnonymousClass1P3) r1.A9y.get();
    }
}
