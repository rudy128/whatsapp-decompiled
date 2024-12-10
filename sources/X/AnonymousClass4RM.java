package X;

import android.content.Context;
import android.os.Environment;
import android.util.Pair;
import com.whatsapp.jid.UserJid;
import com.whatsapp.voipcalling.CallInfo;
import java.util.List;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: X.4RM  reason: invalid class name */
public final class AnonymousClass4RM {
    public long A00;
    public String A01;
    public final AnonymousClass00H A02;
    public final Context A03;
    public final C23501Gn A04 = new C95274ly(this, 0);
    public final AnonymousClass1NM A05;
    public final C35551mQ A06;
    public final AnonymousClass00H A07;

    public AnonymousClass4RM(Context context, AnonymousClass1NM r4, C35551mQ r5, AnonymousClass00H r6, AnonymousClass00H r7) {
        C18070vi.A0p(r5, r4, r6);
        C18070vi.A0d(r7, 5);
        this.A03 = context;
        this.A06 = r5;
        this.A05 = r4;
        this.A07 = r6;
        this.A02 = r7;
        String externalStorageState = Environment.getExternalStorageState();
        C18070vi.A0X(externalStorageState);
        this.A01 = externalStorageState;
    }

    public final String A00(String str) {
        JSONObject A15;
        String str2;
        String str3;
        String externalStorageState = Environment.getExternalStorageState();
        C18070vi.A0X(externalStorageState);
        this.A01 = externalStorageState;
        if (this.A05.A03(this.A04)) {
            this.A00 = ((AnonymousClass11Z) this.A07.get()).A01();
        }
        C85734On r11 = (C85734On) this.A02.get();
        C89444cT r0 = r11.A01;
        CallInfo callInfo = r11.A00;
        if (r0 == null && callInfo == null) {
            A15 = null;
        } else {
            A15 = C17880vN.A15();
            String str4 = "Video";
            String str5 = "Call not started";
            if (r0 != null) {
                AnonymousClass1TD r14 = r11.A04;
                UserJid userJid = r0.A01;
                boolean z = r0.A03;
                String str6 = r0.A02;
                C178119Bw A072 = r14.A07(new C89444cT(r0.A00, userJid, str6, z));
                if (A072 != null) {
                    A15.put("callID", A072.A04.A02);
                    switch (A072.A06) {
                        case 0:
                            str3 = "Invalid";
                            break;
                        case 1:
                            str3 = "Canceled";
                            break;
                        case 2:
                            str3 = "Missed";
                            break;
                        case 3:
                            str3 = "Unavailable";
                            break;
                        case 4:
                            str3 = "Rejected";
                            break;
                        case 5:
                            str3 = "Connected";
                            break;
                        case 6:
                            str3 = "Accepted elsewhere";
                            break;
                        default:
                            str3 = "";
                            break;
                    }
                    A15.put("Call result", str3);
                    if (A072.A08 != 0) {
                        str5 = C72483Me.A0Y("MMM-dd-yyyy HH:mm:ss z", Locale.US, A072.A01 - ((long) A072.A08));
                    }
                    A15.put("Call start time", str5);
                    A15.put("Call end time", C72483Me.A0Y("MMM-dd-yyyy HH:mm:ss z", Locale.US, A072.A01));
                    if (!A072.A0J) {
                        str4 = "Voice";
                    }
                    A15.put("Media type", str4);
                    AnonymousClass1VE r02 = r11.A03;
                    String A09 = C40811vJ.A09(str6);
                    String A0r = C17880vN.A0r(AnonymousClass1VE.A00(r02), "call_relay_uuid");
                    if (A0r != null) {
                        String[] split = A0r.split(";");
                        int length = split.length;
                        int i = 0;
                        while (true) {
                            if (i < length) {
                                String[] split2 = split[i].split("#");
                                if (A09.equals(split2[0])) {
                                    str2 = split2[1];
                                } else {
                                    i++;
                                }
                            }
                        }
                    }
                }
            } else if (callInfo != null) {
                A15.put("callID", callInfo.callId);
                A15.put("Call state", callInfo.callState.name());
                long j = callInfo.callDuration;
                if (j != 0) {
                    str5 = C72483Me.A0Y("MMM-dd-yyyy HH:mm:ss z", Locale.US, System.currentTimeMillis() - j);
                }
                A15.put("Call start time", str5);
                if (!callInfo.videoEnabled) {
                    str4 = "Voice";
                }
                A15.put("Media type", str4);
                str2 = callInfo.relayCallUuid;
            }
            if (str2 != null) {
                A15.put("Call Relay UUID", str2);
            }
        }
        long A022 = ((AnonymousClass11Z) this.A07.get()).A02();
        String A042 = this.A06.A04(this.A03, (Pair) null, (AnonymousClass1EC) null, "InAppBugReporting", (String) null, (String) null, this.A01, str, (List) null, (List) null, A15, this.A00, A022, true, false, false);
        C18070vi.A0X(A042);
        return A042;
    }
}
