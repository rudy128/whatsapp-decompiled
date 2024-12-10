package X;

import android.app.ActivityManager;
import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.protocol.VoipStanzaChildNode;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.CallLinkInfo;
import com.whatsapp.voipcalling.CallState;
import com.whatsapp.voipcalling.Voip;
import java.io.File;
import java.io.IOException;

/* renamed from: X.1vJ  reason: invalid class name and case insensitive filesystem */
public abstract class C40811vJ {
    public static boolean A0O(C23661Hd r3, C18030ve r4) {
        return (!r3.A02(true) || C18020vd.A05(C18040vf.A02, r4, 10709)) && C18020vd.A05(C18040vf.A01, r4, 4624);
    }

    public static UserJid A01(AnonymousClass11S r0, boolean z) {
        if (z) {
            return r0.A09();
        }
        r0.A0I();
        return r0.A0E;
    }

    public static VoipStanzaChildNode.Builder A02(VoipStanzaChildNode voipStanzaChildNode) {
        VoipStanzaChildNode.Builder builder = new VoipStanzaChildNode.Builder(voipStanzaChildNode.tag);
        builder.addAttributes(voipStanzaChildNode.getAttributesCopy());
        return builder;
    }

    public static String A08(int i) {
        if (i == 0) {
            return "CALL_STATE_IDLE";
        }
        if (i == 1) {
            return "CALL_STATE_RINGING";
        }
        if (i != 2) {
            return "UNKNOWN_TELEPHONY_CALL_STATE";
        }
        return "CALL_STATE_OFFHOOK";
    }

    public static String A09(String str) {
        if (str.startsWith("call:")) {
            return str.replaceFirst("call:", "");
        }
        return str;
    }

    public static String A0A(String str) {
        if (str == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("call:");
        sb.append(str);
        return sb.toString();
    }

    public static void A0B(C18030ve r2) {
        if (C18020vd.A05(C18040vf.A02, r2, 3321)) {
            C24521Kq r0 = C24521Kq.$redex_init_class;
        }
    }

    public static boolean A0C(AnonymousClass11S r2, C18030ve r3) {
        if (C18020vd.A00(C18040vf.A02, r3, 3362) < 2 || r2.A0N()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r7 < X.C18020vd.A00(r4, r6, 4675)) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0J(X.AnonymousClass11S r5, X.C18030ve r6, int r7, boolean r8) {
        /*
            r0 = 4676(0x1244, float:6.552E-42)
            X.0vf r4 = X.C18040vf.A02
            int r0 = X.C18020vd.A00(r4, r6, r0)
            r3 = 1
            if (r7 > r0) goto L_0x0014
            r0 = 4675(0x1243, float:6.551E-42)
            int r0 = X.C18020vd.A00(r4, r6, r0)
            r2 = 1
            if (r7 >= r0) goto L_0x0015
        L_0x0014:
            r2 = 0
        L_0x0015:
            r0 = 3362(0xd22, float:4.711E-42)
            int r1 = X.C18020vd.A00(r4, r6, r0)
            r0 = 2
            if (r1 < r0) goto L_0x0032
            boolean r0 = r5.A0N()
            if (r0 != 0) goto L_0x0032
            if (r2 != 0) goto L_0x0031
            if (r8 == 0) goto L_0x0032
            r0 = 10194(0x27d2, float:1.4285E-41)
            int r1 = X.C18020vd.A00(r4, r6, r0)
            r0 = 2
            if (r1 < r0) goto L_0x0032
        L_0x0031:
            return r3
        L_0x0032:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40811vJ.A0J(X.11S, X.0ve, int, boolean):boolean");
    }

    public static boolean A0L(AEW aew, AnonymousClass1E7 r1) {
        C42741yf r12;
        if (aew == null || r1 == null || (r12 = r1.A0G) == null || !aew.A0W || !r12.A01()) {
            return false;
        }
        return true;
    }

    public static boolean A0N(C219217x r2) {
        if (Build.VERSION.SDK_INT < 31 || r2.A0H()) {
            return true;
        }
        return false;
    }

    public static boolean A0P(C18030ve r2) {
        if (C18020vd.A00(C18040vf.A02, r2, 10194) < 1) {
            return false;
        }
        return true;
    }

    public static boolean A0Q(C18030ve r2) {
        if (C18020vd.A00(C18040vf.A02, r2, 4067) < 1) {
            return false;
        }
        return true;
    }

    public static boolean A0R(C18030ve r2) {
        if (C18020vd.A00(C18040vf.A02, r2, 6818) > 0) {
            return true;
        }
        return false;
    }

    public static boolean A0S(C18030ve r2) {
        if (C18020vd.A00(C18040vf.A02, r2, 4067) >= 2) {
            return true;
        }
        return false;
    }

    public static boolean A0T(C18030ve r2) {
        if (Build.VERSION.SDK_INT < 29 || !C18020vd.A05(C18040vf.A02, r2, 6530)) {
            return false;
        }
        return true;
    }

    public static boolean A0U(C18030ve r2) {
        if ((C18020vd.A00(C18040vf.A01, r2, 9788) & 2) != 0) {
            return true;
        }
        return false;
    }

    public static boolean A0V(C18030ve r2) {
        if (C18020vd.A05(C18040vf.A02, r2, 3015)) {
            String str = Build.MANUFACTURER;
            if ("oculus".equalsIgnoreCase(str) || "meta".equalsIgnoreCase(str)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean A0W(C18030ve r2) {
        C18040vf r1 = C18040vf.A02;
        if (C18020vd.A05(r1, r2, 3015) || C18020vd.A05(r1, r2, 3459)) {
            String str = Build.MANUFACTURER;
            if ("oculus".equalsIgnoreCase(str) || "meta".equalsIgnoreCase(str)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean A0X(C18030ve r2) {
        if (C18020vd.A00(C18040vf.A02, r2, 6228) < 1) {
            return false;
        }
        return true;
    }

    public static boolean A0Y(C18030ve r2) {
        C18040vf r1 = C18040vf.A01;
        if ((C18020vd.A00(r1, r2, 11758) & 1) == 0 || (C18020vd.A00(r1, r2, 11758) & 2) == 0) {
            return false;
        }
        return true;
    }

    public static boolean A0Z(C18030ve r3, int i) {
        C18040vf r2 = C18040vf.A02;
        if (C18020vd.A00(r2, r3, 5429) >= 2) {
            return true;
        }
        if (i < C18020vd.A00(r2, r3, 6069) || i > C18020vd.A00(r2, r3, 6070)) {
            return false;
        }
        return true;
    }

    public static boolean A0a(C18030ve r2, AnonymousClass1BI r3, Boolean bool) {
        int i;
        if (r3 != null) {
            boolean A0e = C22971Dz.A0e(r3);
            i = 2;
            if (A0e) {
                i = 0;
            }
        } else {
            i = 1;
            if (bool.booleanValue()) {
                i = 3;
            }
        }
        if ((C18020vd.A00(C18040vf.A02, r2, 11853) & (1 << i)) == 0) {
            return false;
        }
        return true;
    }

    public static boolean A0c(C18030ve r2, boolean z) {
        if (!z || (C18020vd.A00(C18040vf.A01, r2, 9788) & 4) == 0) {
            return false;
        }
        return true;
    }

    public static boolean A0d(GroupJid groupJid, CallInfo callInfo) {
        CallState callState;
        if (callInfo == null || (callState = callInfo.callState) == CallState.NONE || callState == CallState.RECEIVED_CALL || callState == CallState.ACTIVE_ELSEWHERE || !groupJid.equals(callInfo.groupJid)) {
            return false;
        }
        return true;
    }

    public static boolean A0e(CallInfo callInfo) {
        if (callInfo == null || callInfo.callState == CallState.NONE) {
            return false;
        }
        return true;
    }

    public static boolean A0f(CallState callState) {
        if (callState == CallState.ACTIVE || callState == CallState.CONNECTED_LONELY || callState == CallState.CALLING || callState == CallState.PRE_ACCEPT_RECEIVED) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        if (r5 != com.whatsapp.voipcalling.CallState.NONE) goto L_0x000a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0014, code lost:
        if (r5 != com.whatsapp.voipcalling.CallState.NONE) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0g(com.whatsapp.voipcalling.CallState r4, com.whatsapp.voipcalling.CallState r5, int r6, boolean r7) {
        /*
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.REJOINING
            r3 = 1
            if (r4 != r0) goto L_0x000a
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            r2 = 1
            if (r5 == r0) goto L_0x000b
        L_0x000a:
            r2 = 0
        L_0x000b:
            boolean r0 = X.AnonymousClass72U.A03(r4)
            if (r0 == 0) goto L_0x0016
            com.whatsapp.voipcalling.CallState r1 = com.whatsapp.voipcalling.CallState.NONE
            r0 = 1
            if (r5 == r1) goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            if (r2 != 0) goto L_0x001d
            if (r0 == 0) goto L_0x003b
            if (r7 != 0) goto L_0x003b
        L_0x001d:
            r0 = 2
            if (r6 == r0) goto L_0x003a
            r0 = 17
            if (r6 == r0) goto L_0x003a
            r0 = 4
            if (r6 == r0) goto L_0x003a
            r0 = 9
            if (r6 == r0) goto L_0x003a
            r0 = 5
            if (r6 == r0) goto L_0x003a
            r0 = 10
            if (r6 == r0) goto L_0x003a
            r0 = 25
            if (r6 == r0) goto L_0x003a
            r0 = 16
            if (r6 != r0) goto L_0x003b
        L_0x003a:
            return r3
        L_0x003b:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40811vJ.A0g(com.whatsapp.voipcalling.CallState, com.whatsapp.voipcalling.CallState, int, boolean):boolean");
    }

    public static int A00(Context context) {
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("android.resource://");
            sb.append(context.getPackageName());
            sb.append("/");
            sb.append(2132017171);
            mediaMetadataRetriever.setDataSource(context, Uri.parse(sb.toString()));
            int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(9));
            try {
                mediaMetadataRetriever.release();
                return parseInt;
            } catch (IOException e) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("VoipUtilV2/getEndCallToneDurationFromMedia/ ");
                sb2.append(e);
                Log.e(sb2.toString());
                return parseInt;
            }
        } catch (Exception e2) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("VoipUtilV2/getEndCallToneDurationFromMedia/ ");
            sb3.append(e2);
            Log.e(sb3.toString());
            C17960vV.A0B(e2);
            try {
                mediaMetadataRetriever.release();
                return -1;
            } catch (IOException e3) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("VoipUtilV2/getEndCallToneDurationFromMedia/ ");
                sb4.append(e3);
                Log.e(sb4.toString());
                return -1;
            }
        } catch (Throwable th) {
            try {
                mediaMetadataRetriever.release();
                throw th;
            } catch (IOException e4) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append("VoipUtilV2/getEndCallToneDurationFromMedia/ ");
                sb5.append(e4);
                Log.e(sb5.toString());
                throw th;
            }
        }
    }

    public static VoipStanzaChildNode A03(VoipStanzaChildNode voipStanzaChildNode, String str) {
        VoipStanzaChildNode[] childrenCopy = voipStanzaChildNode.getChildrenCopy();
        if (childrenCopy != null) {
            for (VoipStanzaChildNode voipStanzaChildNode2 : childrenCopy) {
                if (str.equals(voipStanzaChildNode2.tag)) {
                    return voipStanzaChildNode2;
                }
            }
        }
        return null;
    }

    public static CallInfo A04(AnonymousClass1HQ r1) {
        if (!r1.BeE()) {
            return r1.BO3();
        }
        CallLinkInfo callLinkInfo = Voip.getCallLinkInfo();
        if (callLinkInfo != null) {
            return CallInfo.convertCallLinkInfoToCallInfo(callLinkInfo);
        }
        return null;
    }

    public static C89444cT A05(AnonymousClass1HQ r4) {
        CallInfo BO3 = r4.BO3();
        if (BO3 == null) {
            return null;
        }
        UserJid peerJid = BO3.getPeerJid();
        C17960vV.A07(peerJid);
        boolean z = BO3.isCaller;
        return new C89444cT(BO3.initialGroupTransactionId, peerJid, A0A(BO3.callId), z);
    }

    public static File A06(Context context) {
        File file = new File(context.getCacheDir(), "voip_time_series");
        if (!file.exists() || !file.isDirectory()) {
            if (file.exists()) {
                file.delete();
            }
            if (!file.mkdirs()) {
                StringBuilder sb = new StringBuilder();
                sb.append("VoipUtil failed to create time series directory: ");
                sb.append(file.getAbsolutePath());
                Log.e(sb.toString());
                return null;
            }
        }
        return file;
    }

    public static Byte A07(VoipStanzaChildNode voipStanzaChildNode) {
        AnonymousClass1MD[] attributesCopy = voipStanzaChildNode.getAttributesCopy();
        byte b = 0;
        if (attributesCopy != null) {
            int length = attributesCopy.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                AnonymousClass1MD r2 = attributesCopy[i];
                if ("count".equals(r2.A02)) {
                    try {
                        b = Byte.parseByte(r2.A03);
                        break;
                    } catch (NumberFormatException unused) {
                        return null;
                    }
                } else {
                    i++;
                }
            }
        }
        return Byte.valueOf(b);
    }

    public static boolean A0D(AnonymousClass11S r1, C18030ve r2) {
        if (r1.A0N()) {
            C18040vf r12 = C18040vf.A01;
            if (!C18020vd.A05(r12, r2, 10666) || !C18020vd.A05(r12, r2, 8929)) {
                return false;
            }
        }
        if (C18020vd.A00(C18040vf.A02, r2, 4708) >= 1) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
        if (X.C18020vd.A05(r1, r2, 8929) != false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0E(X.AnonymousClass11S r1, X.C18030ve r2) {
        /*
            boolean r0 = r1.A0N()
            if (r0 == 0) goto L_0x0018
            X.0vf r1 = X.C18040vf.A01
            r0 = 10666(0x29aa, float:1.4946E-41)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 == 0) goto L_0x0024
            r0 = 8929(0x22e1, float:1.2512E-41)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 == 0) goto L_0x0024
        L_0x0018:
            r1 = 4708(0x1264, float:6.597E-42)
            X.0vf r0 = X.C18040vf.A02
            int r2 = X.C18020vd.A00(r0, r2, r1)
            r1 = 2
            r0 = 1
            if (r2 >= r1) goto L_0x0025
        L_0x0024:
            r0 = 0
        L_0x0025:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40811vJ.A0E(X.11S, X.0ve):boolean");
    }

    public static boolean A0F(AnonymousClass11S r1, C18030ve r2) {
        if (r1.A0N() || !C18020vd.A05(C18040vf.A02, r2, 4933)) {
            return false;
        }
        return true;
    }

    public static boolean A0G(AnonymousClass11S r1, C18030ve r2) {
        if (r1.A0N() || !C18020vd.A05(C18040vf.A01, r2, 7179)) {
            return false;
        }
        return true;
    }

    public static boolean A0H(AnonymousClass11S r1, C18030ve r2, int i) {
        if (!A0I(r1, r2, i) || A0J(r1, r2, i, false)) {
            return false;
        }
        return true;
    }

    public static boolean A0I(AnonymousClass11S r2, C18030ve r3, int i) {
        if (r2.A0N()) {
            return false;
        }
        C18040vf r22 = C18040vf.A02;
        if (C18020vd.A00(r22, r3, 3362) < 2 || i < C18020vd.A00(r22, r3, 4675)) {
            return false;
        }
        if (C18020vd.A05(r22, r3, 6610) || i <= C18020vd.A00(r22, r3, 4676)) {
            return true;
        }
        return false;
    }

    public static boolean A0K(AnonymousClass11S r1, UserJid userJid) {
        r1.A0I();
        if (userJid.equals(r1.A0E) || userJid.equals(r1.A09())) {
            return true;
        }
        return false;
    }

    public static boolean A0M(AnonymousClass11C r3) {
        ActivityManager A04 = r3.A04();
        try {
            if (Build.VERSION.SDK_INT >= 28 && A04 != null) {
                return A04.isBackgroundRestricted();
            }
        } catch (RuntimeException unused) {
            Log.e("System server dead, cannot get background restriction setting");
        }
        return false;
    }

    public static boolean A0b(C18030ve r2, C18140vp r3) {
        if (!((Boolean) r3.get()).booleanValue() || !C18020vd.A05(C18040vf.A01, r2, 9086)) {
            return false;
        }
        return true;
    }
}
