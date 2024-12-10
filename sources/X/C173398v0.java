package X;

import android.text.TextUtils;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.CallState;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.8v0  reason: invalid class name and case insensitive filesystem */
public class C173398v0 extends A3R implements C72203La {
    public A99 A00;
    public Runnable A01;
    public final AnonymousClass11S A02;
    public final AnonymousClass1V7 A03;
    public final AnonymousClass1M9 A04;
    public final C24921Me A05;
    public final AnonymousClass1TM A06;
    public final C19959A0q A07;
    public final C20047A4q A08;
    public final AnonymousClass19T A09;
    public final AnonymousClass10I A0A;
    public final C18140vp A0B;
    public final C18140vp A0C;

    public void C5G() {
        this.A00 = null;
    }

    public void C5F(A99 a99) {
        this.A00 = a99;
        this.A09.markerPoint(494341755, "bind_voice_service_end");
    }

    public C173398v0(AnonymousClass11S r1, AnonymousClass1V7 r2, AnonymousClass1M9 r3, C24921Me r4, AnonymousClass1TM r5, C19959A0q a0q, C20047A4q a4q, AnonymousClass19T r8, AnonymousClass10I r9, C18140vp r10, C18140vp r11) {
        this.A09 = r8;
        this.A02 = r1;
        this.A0A = r9;
        this.A04 = r3;
        this.A05 = r4;
        this.A0B = r10;
        this.A0C = r11;
        this.A03 = r2;
        this.A06 = r5;
        this.A08 = a4q;
        this.A07 = a0q;
    }

    public static String A00(CallState callState) {
        switch (callState.ordinal()) {
            case 1:
            case 2:
                return "outgoing_ringing";
            case 3:
                return "incoming_ringing";
            case 4:
            case 5:
            case 6:
            case 10:
                return "active";
            default:
                return "idle";
        }
    }

    public static JSONObject A01(AnonymousClass11S r24, A99 a99, AnonymousClass1M9 r26, C24921Me r27, AnonymousClass1TM r28, C19959A0q a0q, C20047A4q a4q, AnonymousClass19T r31, C60012nF r32, CallInfo callInfo, CallState callState) {
        C134216qE infoByJid;
        AnonymousClass19T r8 = r31;
        r8.markerPoint(494341755, "make_call_state_start");
        C18030ve r7 = r28.A01;
        C18040vf r5 = C18040vf.A02;
        r8.markerAnnotate(494341755, "extended_state", C18020vd.A05(r5, r7, 6408));
        String A002 = A00(callState);
        JSONObject A15 = C17880vN.A15();
        A15.put("call_state", A002);
        if (!"idle".equals(A002)) {
            CallInfo callInfo2 = callInfo;
            if (callInfo != null) {
                C17960vV.A07(callInfo2.getPeerJid());
                C19959A0q a0q2 = a0q;
                C60012nF r20 = r32;
                A15.put("caller_contact_id", a0q2.A02(callInfo2.getPeerJid(), r20));
                r8.markerPoint(494341755, "caller_id_resolved");
                AnonymousClass1M9 r23 = r26;
                C24921Me r22 = r27;
                A15.put("caller_name", r22.A0H(r23.A0H(callInfo2.getPeerJid()), false).A01);
                r8.markerPoint(494341755, "caller_name_resolved");
                GroupJid groupJid = callInfo2.groupJid;
                if (groupJid != null) {
                    A15.put("group_name", r22.A0I(r23.A0H(groupJid)));
                    r8.markerPoint(494341755, "caller_group_name_resolved");
                }
                Set<UserJid> keySet = callInfo2.participants.keySet();
                if (!keySet.isEmpty()) {
                    JSONArray A1A = AnonymousClass8BR.A1A();
                    JSONArray A1A2 = AnonymousClass8BR.A1A();
                    JSONArray A1A3 = AnonymousClass8BR.A1A();
                    String str = null;
                    String str2 = null;
                    int i = 0;
                    for (UserJid userJid : keySet) {
                        String str3 = "on";
                        if (!r24.A0O(userJid)) {
                            JSONObject A152 = C17880vN.A15();
                            String str4 = r22.A0H(r23.A0H(userJid), false).A01;
                            String A022 = a0q2.A02(userJid, r20);
                            if (C18020vd.A05(r5, r7, 6408)) {
                                A152.put("call_participant_name", str4);
                                A152.put("call_participant_id", A022);
                                C134216qE infoByJid2 = callInfo2.getInfoByJid(userJid);
                                if (infoByJid2 != null) {
                                    if (infoByJid2.A08 != 1) {
                                        str3 = "off";
                                    }
                                    A152.put("call_participant_video_status", str3);
                                }
                                A1A3.put(A152);
                            }
                            if (TextUtils.isEmpty(str4)) {
                                i++;
                            } else {
                                A1A.put(A022);
                                A1A2.put(str4);
                            }
                        } else if (C18020vd.A05(r5, r7, 6408) && (infoByJid = callInfo2.getInfoByJid(userJid)) != null) {
                            if (infoByJid.A0I) {
                                str = "muted";
                            } else {
                                str = str3;
                            }
                            str2 = "off";
                            if (infoByJid.A08 == 1) {
                                str2 = str3;
                            }
                        }
                    }
                    A15.put("call_participant_contact_ids", A1A);
                    A15.put("call_participant_names", A1A2);
                    A15.put("unnamed_call_participant_count", i);
                    if (C18020vd.A05(r5, r7, 6408)) {
                        if (str != null) {
                            A15.put("mic_status", str);
                        }
                        if (str2 != null) {
                            A15.put("video_status", str2);
                        }
                        A15.put("call_participant_list", A1A3);
                    }
                    r8.markerPoint(494341755, "caller_participant_info_resolved");
                }
                A15.put("call_id", a4q.A03(r20, callInfo2.callId));
                A15.put("video_call", callInfo2.videoEnabled);
                if (C18020vd.A05(r5, r7, 6408)) {
                    A15.put("call_active_time", callInfo2.callActiveTime);
                }
                A99 a992 = a99;
                if (a99 != null && C18020vd.A05(r5, r7, 6408)) {
                    C21067Adx adx = a992.A0R;
                    C17960vV.A07(adx);
                    A15.put("call_is_audio_route_bt", AnonymousClass000.A1T(adx.A00, 3));
                }
                r8.markerPoint(494341755, "make_call_state_end");
                return A15;
            }
        }
        r8.markerAnnotate(494341755, "early_end", "idle_call");
        return A15;
    }
}
