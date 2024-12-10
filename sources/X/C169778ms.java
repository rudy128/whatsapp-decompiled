package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.8ms  reason: invalid class name and case insensitive filesystem */
public final class C169778ms extends C60192nY {
    public final AnonymousClass11S A00;
    public final AnonymousClass11P A01;
    public final AnonymousClass1RK A02;
    public final C26331Rs A03;
    public final C18030ve A04;

    public C20126A8l A0C(A6U a6u, String str, boolean z) {
        C166128cO r6;
        String str2;
        C178119Bw A032;
        long j;
        C19999A2n a2n;
        C194399rf r10;
        A6U a6u2 = a6u;
        C18070vi.A0d(a6u2, 2);
        AnonymousClass11S r9 = this.A00;
        String[] strArr = a6u2.A06;
        if (strArr.length == 4 && AnonymousClass8BU.A1a("call_log", strArr)) {
            UserJid A042 = UserJid.Companion.A04(strArr[1]);
            if (A042 == null) {
                str2 = "CallLogSyncMutation/fromKeyValue unable to create call creator jid";
            } else {
                Boolean A002 = C20068A5s.A00(strArr[3]);
                if (A002 == null) {
                    str2 = "CallLogSyncMutation/fromKeyValue unable to create is incoming value";
                } else {
                    String str3 = strArr[2];
                    C62382rJ r62 = a6u2.A01;
                    C166378cn r5 = a6u2.A03;
                    if (r5 != null && AnonymousClass8BW.A1Q(r5.bitField0_)) {
                        C62382rJ r11 = C62382rJ.A02;
                        if (r11.equals(r62)) {
                            a2n = a6u2.A02;
                            r10 = new C194399rf(A042, str3, A002.booleanValue());
                            A032 = null;
                            j = 0;
                        } else {
                            C164208Xy r0 = r5.callLogAction_;
                            if ((r0 == null && (r0 = C164208Xy.DEFAULT_INSTANCE) == null) || ((r6 = r0.callLogRecord_) == null && (r6 = C166128cO.DEFAULT_INSTANCE) == null)) {
                                return null;
                            }
                            if (!C18070vi.A18(A042.getRawString(), r6.callCreatorJid_) || !C18070vi.A18(str3, r6.callId_) || !A002.equals(Boolean.valueOf(r6.isIncoming_))) {
                                str2 = "CallLogSyncMutation/fromKeyValue critical values are not matched in mutation index and value";
                            } else {
                                A032 = A77.A00.A03(r6);
                                if (A032 != null) {
                                    j = r5.timestamp_;
                                    a2n = a6u2.A02;
                                    r11 = C62382rJ.A03;
                                    r10 = new C194399rf(A042, str3, A002.booleanValue());
                                }
                            }
                        }
                        return new AnonymousClass8q4(r9, r10, r11, a2n, A032, str, j);
                    }
                }
            }
            Log.e(str2);
        }
        return null;
    }

    public /* bridge */ /* synthetic */ void A0G(C20126A8l a8l) {
        C18070vi.A0d(a8l, 0);
        C17960vV.A0F(false, "CallLogSyncMutation shouldn't have dependencies");
        A07(a8l);
    }

    public /* bridge */ /* synthetic */ void A0I(C20126A8l a8l, C20126A8l a8l2) {
        C18070vi.A0d(a8l, 0);
        A09(a8l);
    }

    public boolean A0J() {
        C18030ve r3 = this.A04;
        C18040vf r2 = C18040vf.A02;
        if (C18020vd.A00(r2, r3, 5417) >= 1 || C18020vd.A00(r2, r3, 6646) >= 1) {
            return true;
        }
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C169778ms(AnonymousClass11S r1, AnonymousClass11P r2, AnonymousClass1RK r3, C26331Rs r4, C18030ve r5) {
        super(r4);
        C18070vi.A0w(r2, r5, r1, r4, r3);
        this.A01 = r2;
        this.A04 = r5;
        this.A00 = r1;
        this.A03 = r4;
        this.A02 = r3;
    }

    public String A0D() {
        return "regular";
    }

    public String A0E() {
        return "call_log";
    }

    public List A0F(boolean z) {
        return C18460wS.A00;
    }

    public /* bridge */ /* synthetic */ void A0H(C20126A8l a8l) {
        AnonymousClass8BU.A1B(this, a8l);
    }
}
