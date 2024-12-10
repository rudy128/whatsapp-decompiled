package X;

import com.whatsapp.jid.DeviceJid;
import java.util.Map;

/* renamed from: X.5yt  reason: invalid class name and case insensitive filesystem */
public final class C116945yt extends C20126A8l {
    public final DeviceJid A00;
    public final Map A01;
    public final String[] A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C116945yt(C62382rJ r13, C19999A2n a2n, DeviceJid deviceJid, String str, Map map, long j) {
        super(r13, a2n, str, "regular_low", 7, j, false);
        C18070vi.A0d(r13, 4);
        this.A00 = deviceJid;
        this.A01 = map;
        String[] A1Z = C17880vN.A1Z();
        A1Z[0] = "device_capabilities";
        A1Z[1] = deviceJid.getRawStringWithNoAgent();
        this.A02 = A1Z;
    }

    public C163398Uv A08() {
        int i;
        C163398Uv A08 = super.A08();
        C23624Bmt A0N = AnonymousClass8XT.DEFAULT_INSTANCE.A0N();
        Number A1E = C108945cZ.A1E("chat_lock_support_level", this.A01);
        if (A1E != null) {
            i = A1E.intValue();
        } else {
            i = C122756Ru.NONE.value;
        }
        C122756Ru A002 = C122756Ru.A00(i);
        AnonymousClass8XT r1 = (AnonymousClass8XT) C17880vN.A0G(A0N);
        r1.chatLockSupportLevel_ = A002.value;
        r1.bitField0_ |= 1;
        AnonymousClass8XT r12 = (AnonymousClass8XT) A0N.A0C();
        C166378cn r2 = (C166378cn) C17880vN.A0G(A08);
        int i2 = C166378cn.AGENT_ACTION_FIELD_NUMBER;
        r12.getClass();
        r2.deviceCapabilities_ = r12;
        r2.bitField1_ |= 65536;
        return A08;
    }

    public String A0B() {
        return "device_capabilities";
    }

    public String[] A0F() {
        return this.A02;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("DeviceCapabilitiesMutation{deviceId=");
        A10.append(this.A00);
        A10.append(" capabilities=");
        A10.append(this.A01);
        return C17890vO.A0b(A10);
    }
}
