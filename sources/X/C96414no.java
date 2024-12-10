package X;

import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.4no  reason: invalid class name and case insensitive filesystem */
public class C96414no implements BC2 {
    public final int A00;
    public final Object A01;

    public C96414no(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void BrE() {
        switch (this.A00) {
            case 0:
                return;
            case 2:
                AnonymousClass3VM.A03((AnonymousClass3VM) this.A01, -408, 2);
                return;
            default:
                throw AnonymousClass04E.createAndThrow();
        }
    }

    public void BvM(AnonymousClass1EC r27, AnonymousClass1EC r28, UserJid userJid, C42661yX r30, String str, String str2, Map map, int i, int i2, int i3, long j) {
        AnonymousClass1EC r3 = r27;
        UserJid userJid2 = userJid;
        C42661yX r5 = r30;
        String str3 = str;
        String str4 = str2;
        Map map2 = map;
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        long j2 = j;
        switch (this.A00) {
            case 0:
                AnonymousClass49R r1 = (AnonymousClass49R) this.A01;
                r1.A01 = new AnonymousClass4PG(r3, userJid2, r5, str3, str4, r1.A02.A0M(map2), i4, i5, i6, j2, false);
                return;
            case 3:
                C827049k.A00((C827049k) this.A01, r3, userJid2, r5, str3, str4, map2.keySet(), i4, i5, i6, j2);
                return;
            default:
                AnonymousClass3VM r12 = (AnonymousClass3VM) this.A01;
                ArrayList A0M = r12.A0X.A0M(map2);
                r12.A07 = r3;
                AnonymousClass1EC r2 = r28;
                if (r28 != null) {
                    r12.A08 = AnonymousClass000.A1R(r12.A0J.A08(r2).size());
                }
                r12.A0T(new AnonymousClass4PG(r3, userJid2, r5, str3, str4, A0M, i4, i5, i6, j2, false));
                return;
        }
    }

    public void onError(int i) {
        AnonymousClass3VM r1;
        int i2;
        switch (this.A00) {
            case 0:
                ((AnonymousClass49R) this.A01).A00 = i;
                return;
            case 1:
                r1 = (AnonymousClass3VM) this.A01;
                i2 = 0;
                break;
            case 2:
                r1 = (AnonymousClass3VM) this.A01;
                i2 = 2;
                break;
            default:
                ((C827049k) this.A01).A00 = i;
                return;
        }
        AnonymousClass3VM.A03(r1, i, i2);
    }
}
