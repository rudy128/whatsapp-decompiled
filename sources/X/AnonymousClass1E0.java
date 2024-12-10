package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.1E0  reason: invalid class name */
public final class AnonymousClass1E0 {
    public final DeviceJid A03(UserJid userJid, int i) {
        String server;
        C18070vi.A0d(userJid, 0);
        boolean z = false;
        if (i == 99) {
            z = true;
        }
        boolean z2 = userJid instanceof AnonymousClass1E2;
        if (!z) {
            server = userJid.getServer();
        } else if (z2) {
            server = "hosted.lid";
        } else {
            server = "hosted";
        }
        return A05(A01(userJid.user, server, userJid.getAgent(), i));
    }

    public final DeviceJid A04(UserJid userJid, int i) {
        Object obj;
        C18070vi.A0d(userJid, 0);
        try {
            obj = A03(userJid, i);
        } catch (Throwable th) {
            obj = new AnonymousClass1IU(th);
        }
        if (obj instanceof AnonymousClass1IU) {
            obj = null;
        }
        return (DeviceJid) obj;
    }

    public final DeviceJid A06(String str) {
        Object obj;
        Object obj2 = null;
        if (str == null || str.length() == 0) {
            return null;
        }
        try {
            obj = A05(str);
        } catch (Throwable th) {
            obj = new AnonymousClass1IU(th);
        }
        if (!(obj instanceof AnonymousClass1IU)) {
            obj2 = obj;
        }
        return (DeviceJid) obj2;
    }

    public static DeviceJid A00(Jid jid) {
        return DeviceJid.Companion.A02(jid);
    }

    public static final String A01(String str, String str2, int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('.');
        sb.append(i);
        sb.append(':');
        sb.append(i2);
        sb.append('@');
        sb.append(str2);
        return sb.toString();
    }

    public final DeviceJid A02(Jid jid) {
        UserJid userJid;
        if (jid instanceof DeviceJid) {
            return (DeviceJid) jid;
        }
        if (!(jid instanceof UserJid) || (userJid = (UserJid) jid) == null) {
            return null;
        }
        return userJid.getPrimaryDevice();
    }

    public final DeviceJid A05(String str) {
        DeviceJid primaryDevice;
        C22911Dt r0 = Jid.Companion;
        Jid A00 = C22911Dt.A00(str);
        if (A00 instanceof DeviceJid) {
            return (DeviceJid) A00;
        }
        if (A00 instanceof UserJid) {
            UserJid userJid = (UserJid) A00;
            if (userJid != null && (primaryDevice = userJid.getPrimaryDevice()) != null) {
                return primaryDevice;
            }
            throw new AnonymousClass11T(str);
        }
        throw new AnonymousClass11T(str);
    }
}
