package com.whatsapp.jid;

import X.AnonymousClass11T;
import X.AnonymousClass1E0;
import X.AnonymousClass1E5;
import X.AnonymousClass1EG;
import X.C18070vi;

public abstract class DeviceJid extends Jid {
    public static final AnonymousClass1E0 Companion = new Object();
    public final byte deviceByte;
    public final UserJid userJid;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeviceJid(UserJid userJid2, int i) {
        super(userJid2.user);
        byte b = (byte) i;
        this.userJid = userJid2;
        this.deviceByte = b;
        if (userJid2 == AnonymousClass1E5.A00) {
            throw new AnonymousClass11T((Jid) userJid2);
        } else if (b < 0 || b > 99) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid device: ");
            sb.append(b);
            throw new AnonymousClass11T(sb.toString());
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C18070vi.A18(getClass(), obj.getClass()) || !super.equals(obj)) {
            return false;
        }
        DeviceJid deviceJid = (DeviceJid) obj;
        if (getDevice() == deviceJid.getDevice()) {
            return C18070vi.A18(this.userJid, deviceJid.userJid);
        }
        return false;
    }

    public String getObfuscatedString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AnonymousClass1EG.A0B(this.user, 4));
        sb.append(':');
        sb.append(getDevice());
        sb.append('@');
        sb.append(getServer());
        return sb.toString();
    }

    public String getRawString() {
        return AnonymousClass1E0.A01(this.user, getServer(), getAgent(), getDevice());
    }

    public final String getRawStringWithNoAgent() {
        String str = this.user;
        String server = getServer();
        int device = getDevice();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(':');
        sb.append(device);
        sb.append('@');
        sb.append(server);
        return sb.toString();
    }

    public int hashCode() {
        return (((super.hashCode() * 31) + this.userJid.hashCode()) * 31) + getDevice();
    }
}
