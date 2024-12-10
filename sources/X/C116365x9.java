package X;

import android.content.SharedPreferences;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.util.Log;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.5x9  reason: invalid class name and case insensitive filesystem */
public final class C116365x9 extends C60192nY {
    public final AnonymousClass11P A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass11S A02;
    public final C143847Fa A03;

    public C20126A8l A0C(A6U a6u, String str, boolean z) {
        DeviceJid A06;
        C18070vi.A0d(a6u, 2);
        C166378cn r2 = a6u.A03;
        if (r2 == null) {
            return null;
        }
        String[] strArr = a6u.A06;
        if (!C18070vi.A18(strArr[0], "device_capabilities") || strArr.length != 2 || !r2.A0R() || (r2.bitField1_ & 65536) == 0 || (A06 = DeviceJid.Companion.A06(strArr[1])) == null) {
            return null;
        }
        long j = r2.timestamp_;
        C19999A2n a2n = a6u.A02;
        C62382rJ r7 = a6u.A01;
        AnonymousClass8XT r1 = r2.deviceCapabilities_;
        if (r1 == null) {
            r1 = AnonymousClass8XT.DEFAULT_INSTANCE;
        }
        C18070vi.A0X(r1);
        LinkedHashMap A13 = C17880vN.A13();
        if ((r1.bitField0_ & 1) != 0) {
            C122756Ru A002 = C122756Ru.A00(r1.chatLockSupportLevel_);
            if (A002 == null) {
                A002 = C122756Ru.NONE;
            }
            A13.put("chat_lock_support_level", Integer.valueOf(A002.value));
        }
        return new C116945yt(r7, a2n, A06, str, A13, j);
    }

    public /* bridge */ /* synthetic */ void A0H(C20126A8l a8l) {
        C18070vi.A0d(a8l, 0);
        A08(a8l);
    }

    public boolean A0J() {
        return true;
    }

    public /* bridge */ /* synthetic */ void A0I(C20126A8l a8l, C20126A8l a8l2) {
        C116945yt r8 = (C116945yt) a8l;
        C18070vi.A0d(r8, 0);
        if (a8l2 == null || a8l2.A04 < r8.A04) {
            C62382rJ r1 = r8.A05;
            if (C18070vi.A18(r1, C62382rJ.A02)) {
                ((C131536lG) this.A01.get()).A00(r8.A00);
                this.A00.A0H(r8);
            } else if (C18070vi.A18(r1, C62382rJ.A03)) {
                AnonymousClass00H r5 = ((C131536lG) this.A01.get()).A00;
                DeviceJid deviceJid = r8.A00;
                LinkedHashSet A14 = C17880vN.A14();
                C18100vl r4 = ((COS) r5.get()).A01;
                SharedPreferences A0C = C17880vN.A0C(r4);
                C25511Om r12 = C25511Om.A00;
                Set<String> stringSet = A0C.getStringSet("registered_devices", r12);
                if (stringSet == null) {
                    stringSet = r12;
                }
                A14.addAll(stringSet);
                A14.remove(deviceJid.getRawStringWithNoAgent());
                A14.add(deviceJid.getRawStringWithNoAgent());
                C17890vO.A0A(r4).putStringSet("registered_devices", A14).apply();
                int A0B = C72463Mc.A0B(C108945cZ.A1E("chat_lock_support_level", r8.A01));
                String rawStringWithNoAgent = deviceJid.getRawStringWithNoAgent();
                C18070vi.A0d(rawStringWithNoAgent, 0);
                C17880vN.A1C(C17890vO.A0A(((COS) r5.get()).A01), AnonymousClass001.A1H("chat_lock_support_level:", rawStringWithNoAgent, AnonymousClass000.A10()), A0B);
                A0B(r8, a8l2);
            } else {
                Log.e("DeviceCapabilitiesHandler/handleMutation received undefined SyncD operation");
            }
        } else {
            A09(r8);
        }
    }

    public final C116945yt A0K() {
        AnonymousClass11S r0 = this.A02;
        r0.A0I();
        AnonymousClass1E3 r3 = r0.A02;
        if (r3 == null) {
            return null;
        }
        return new C116945yt(C62382rJ.A03, (C19999A2n) null, r3, (String) null, C108975cc.A0h("chat_lock_support_level", C17880vN.A0i()), AnonymousClass11P.A01(this.A00));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C116365x9(AnonymousClass11S r1, C143847Fa r2, AnonymousClass11P r3, C26331Rs r4, AnonymousClass00H r5) {
        super(r4);
        C18070vi.A0w(r4, r3, r1, r5, r2);
        this.A00 = r3;
        this.A02 = r1;
        this.A01 = r5;
        this.A03 = r2;
    }

    public String A0D() {
        return "regular_low";
    }

    public String A0E() {
        return "device_capabilities";
    }

    public List A0F(boolean z) {
        C116945yt A0K = A0K();
        if (A0K == null) {
            return AnonymousClass000.A13();
        }
        return AnonymousClass1ZU.A06(A0K);
    }
}
