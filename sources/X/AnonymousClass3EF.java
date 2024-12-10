package X;

import android.content.Context;
import com.whatsapp.jid.DeviceJid;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import org.whispersystems.jobqueue.requirements.Requirement;

/* renamed from: X.3EF  reason: invalid class name */
public final class AnonymousClass3EF implements Requirement, C22488B9u {
    public static final long serialVersionUID = 1;
    public transient DeviceJid A00;
    public transient AnonymousClass1P1 A01;
    public transient AnonymousClass1P3 A02;
    public final String jid;
    public final byte[] oldAliceBaseKey;

    public AnonymousClass3EF(DeviceJid deviceJid, byte[] bArr) {
        C18070vi.A0d(deviceJid, 1);
        this.A00 = deviceJid;
        this.jid = deviceJid.getRawString();
        C17960vV.A0I(bArr);
        this.oldAliceBaseKey = bArr;
    }

    public void CIZ(Context context) {
        C18070vi.A0d(context, 0);
        AnonymousClass10E r1 = (AnonymousClass10E) C17890vO.A0H(context);
        this.A02 = (AnonymousClass1P3) r1.A9y.get();
        this.A01 = (AnonymousClass1P1) r1.A3K.get();
    }

    public boolean Bfv() {
        AnonymousClass1P1 r1 = this.A01;
        if (r1 != null) {
            C60002nE A012 = r1.A01(C63962tz.A02(this.A00));
            AnonymousClass1P3 r0 = this.A02;
            if (r0 != null) {
                return !Arrays.equals(this.oldAliceBaseKey, r0.A0F(A012).A01.A00.aliceBaseKey_.A06());
            }
        }
        return false;
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        try {
            this.A00 = DeviceJid.Companion.A05(this.jid);
            byte[] bArr = this.oldAliceBaseKey;
            if (bArr == null || bArr.length == 0) {
                throw new InvalidObjectException("oldAliceBaseKey must not be empty");
            }
        } catch (AnonymousClass11T unused) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("jid must be a valid user jid; jid=");
            throw C17900vP.A06(this.jid, A10);
        }
    }
}
