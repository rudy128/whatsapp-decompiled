package com.whatsapp.jobqueue.requirement;

import X.AnonymousClass000;
import X.AnonymousClass10E;
import X.AnonymousClass11T;
import X.AnonymousClass1P1;
import X.AnonymousClass1P3;
import X.C17890vO;
import X.C17900vP;
import X.C22488B9u;
import X.C63962tz;
import android.content.Context;
import com.whatsapp.jid.DeviceJid;
import java.io.ObjectInputStream;
import org.whispersystems.jobqueue.requirements.Requirement;

public final class AxolotlSessionRequirement implements Requirement, C22488B9u {
    public static final long serialVersionUID = 1;
    public transient DeviceJid A00;
    public transient AnonymousClass1P1 A01;
    public transient AnonymousClass1P3 A02;
    public final String jid;

    public boolean Bfv() {
        return this.A02.A0b(this.A01.A01(C63962tz.A02(this.A00)));
    }

    public AxolotlSessionRequirement(DeviceJid deviceJid) {
        this.A00 = deviceJid;
        this.jid = deviceJid.getRawString();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        try {
            this.A00 = DeviceJid.Companion.A05(this.jid);
        } catch (AnonymousClass11T unused) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("jid must be a valid user jid; jid=");
            throw C17900vP.A06(this.jid, A10);
        }
    }

    public void CIZ(Context context) {
        AnonymousClass10E r1 = (AnonymousClass10E) C17890vO.A0H(context);
        this.A02 = (AnonymousClass1P3) r1.A9y.get();
        this.A01 = (AnonymousClass1P1) r1.A3K.get();
    }
}
