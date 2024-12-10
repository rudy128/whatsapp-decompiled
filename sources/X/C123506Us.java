package X;

import android.os.Handler;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.CallState;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.6Us  reason: invalid class name and case insensitive filesystem */
public abstract class C123506Us {
    public void A02() {
    }

    public void A03() {
        if (this instanceof AnonymousClass682) {
            AnonymousClass682 r5 = (AnonymousClass682) this;
            C127316e9 r4 = new C127316e9("authorization_revoked", (JSONObject) null);
            try {
                C138566xI r3 = r5.A03;
                JSONObject A15 = C17880vN.A15();
                A15.put("action", "authorization_revoked");
                A15.putOpt("payload", r4.A01);
                C138566xI.A00(r3, A15.toString(), r5.A0C, false);
            } catch (JSONException unused) {
                Log.e("StellaEventDispatcher/failed to create event");
            }
        }
    }

    public void A04(int i) {
        String str;
        String str2;
        C127316e9 r0;
        if (this instanceof AnonymousClass682) {
            AnonymousClass682 r5 = (AnonymousClass682) this;
            try {
                C60012nF A02 = r5.A09.A02(r5.A0C);
                C47612Jb r1 = r5.A05;
                CallInfo BO3 = r5.A01.BO3();
                switch (i) {
                    case 1:
                    case 2:
                    case 14:
                    case 18:
                        str = "user_ended_call";
                        break;
                    case 3:
                    case 5:
                    case 6:
                    case 11:
                    case 13:
                    case 15:
                    case 16:
                    case 17:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        str = "call_failed";
                        break;
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 25:
                    case 27:
                        str = "not_accepted";
                        break;
                    case 12:
                        str = "rejected";
                        break;
                    case 24:
                        str = "missing_voip_permissions";
                        break;
                    default:
                        str = "other";
                        break;
                }
                if (BO3 == null) {
                    str2 = null;
                } else {
                    str2 = r1.A00.A03(A02, BO3.callId);
                }
                try {
                    JSONObject A15 = C17880vN.A15();
                    A15.put("call_ended_reason", str);
                    A15.put("call_id", str2);
                    r0 = new C127316e9("call_ended", A15);
                } catch (JSONException unused) {
                    r0 = null;
                }
                AnonymousClass682.A00(r0, r5);
            } catch (SecurityException e) {
                Log.e("StellaEventDispatcher/cannot create event for untrusted package", e);
            }
        }
    }

    public void A05(AnonymousClass206 r6) {
        AnonymousClass10I r3;
        Runnable r2;
        if (this instanceof AnonymousClass682) {
            AnonymousClass682 r4 = (AnonymousClass682) this;
            if (!r4.A00.A00 && !r6.A0v.A02) {
                if (C18020vd.A05(C18040vf.A02, r4.A02.A01, 8366)) {
                    r3 = r4.A0B;
                    r2 = new C146507Pj(r4, r6, 25);
                } else {
                    AnonymousClass1HY r22 = r4.A04;
                    C131986lz r1 = new C131986lz(r4, r6);
                    if (r22.A00 != null) {
                        r1.A00();
                        return;
                    } else {
                        r3 = r22.A02;
                        r2 = new C146447Pd(r1, 19);
                    }
                }
                r3.CGF(r2);
            }
        }
    }

    public void A06(CallState callState, CallInfo callInfo) {
        if (this instanceof AnonymousClass682) {
            AnonymousClass682 r2 = (AnonymousClass682) this;
            if (!C173398v0.A00(callState).equals(C173398v0.A00(callInfo.callState))) {
                try {
                    AnonymousClass682.A00(r2.A06.A00(r2.A09.A02(r2.A0C), callInfo), r2);
                } catch (SecurityException e) {
                    Log.e("StellaEventDispatcher/cannot create event for untrusted package", e);
                }
            }
        }
    }

    public void A07(Integer num) {
        if (this instanceof AnonymousClass681) {
            AnonymousClass681 r1 = (AnonymousClass681) this;
            Handler handler = r1.A00;
            handler.removeCallbacksAndMessages((Object) null);
            handler.postDelayed(new C146507Pj(r1, num, 23), 2000);
        }
    }
}
