package X;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.telecom.CallAudioState;
import android.telecom.CallEndpoint;
import android.telecom.ConnectionRequest;
import android.telecom.PhoneAccount;
import android.telecom.PhoneAccountHandle;
import android.telecom.TelecomManager;
import com.whatsapp.calling.telecom.SelfManagedConnectionService;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: X.1VN  reason: invalid class name */
public class AnonymousClass1VN extends AnonymousClass11D {
    public PhoneAccountHandle A00;
    public boolean A01;
    public final AnonymousClass11C A02;
    public final ConcurrentMap A03 = new ConcurrentHashMap(2);
    public final ComponentName A04;
    public final AnonymousClass1VL A05;
    public final AnonymousClass11S A06;
    public final AnonymousClass118 A07;
    public final C18030ve A08;
    public final AnonymousClass1DC A09;
    public volatile boolean A0A;

    public static /* synthetic */ void A05(AnonymousClass1VR r4, String str) {
        if (r4 instanceof AnonymousClass1VS) {
            AnonymousClass1VS r42 = (AnonymousClass1VS) r4;
            C17960vV.A02();
            AnonymousClass1VQ r3 = r42.A01;
            C62172qu r2 = r3.A0g;
            StringBuilder sb = new StringBuilder();
            sb.append("app/startOutgoingCall/onCreateOutgoingConnectionFailed ");
            sb.append(str);
            sb.append(", pendingCallCommand: ");
            sb.append(r2);
            Log.i(sb.toString());
            if (r2 != null && str.equals(r2.A0B)) {
                Log.w("app/startOutgoingCall/failed_create_outgoing_connection");
                r3.A0g = null;
                r3.A02.removeMessages(1);
            }
            r42.A00.A04(str, 97);
            return;
        }
        C17960vV.A02();
    }

    public static /* synthetic */ void A07(AnonymousClass1VR r0, String str, boolean z, boolean z2) {
        if (z) {
            r0.A06(str, z2);
        } else {
            r0.A02(str);
        }
    }

    public int A08() {
        return C18020vd.A00(C18040vf.A02, ((AnonymousClass1DD) this.A09).A02, 1658);
    }

    public C161328Ct A0A(String str) {
        return (C161328Ct) this.A03.get(str);
    }

    public void A0C() {
        AnonymousClass11C r4 = this.A02;
        if (r4.A0I() == null) {
            Log.w("voip/SelfManagedConnectionsManager/unregisterPhoneAccount telecomManager is null");
            return;
        }
        Log.i("voip/SelfManagedConnectionsManager/unregisterPhoneAccounts");
        try {
            TelecomManager.class.getMethod("clearPhoneAccounts", new Class[0]).invoke(r4.A0I(), new Object[0]);
            this.A00 = null;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("voip/SelfManagedConnectionsManager/unregisterPhoneAccounts ");
            sb.append(e);
            Log.e(sb.toString());
        }
    }

    public void A0D(CallAudioState callAudioState, String str) {
        notifyAllObservers(new AnonymousClass35I(callAudioState, str));
    }

    public void A0E(CallEndpoint callEndpoint, String str) {
        notifyAllObservers(new AnonymousClass35H(callEndpoint, str));
    }

    public boolean A0L() {
        return C18020vd.A05(C18040vf.A02, ((AnonymousClass1DD) this.A09).A02, 2186);
    }

    public boolean A0M() {
        this.A0A = C18020vd.A05(C18040vf.A02, this.A08, 1641);
        return this.A0A;
    }

    public boolean A0N() {
        boolean A052 = C18020vd.A05(C18040vf.A02, this.A08, 1642);
        this.A01 = A052;
        return A052;
    }

    public boolean A0O() {
        String str;
        if (this.A00 != null) {
            return true;
        }
        AnonymousClass11C r4 = this.A02;
        if (r4.A0I() == null) {
            str = "voip/SelfManagedConnectionsManager/registerPhoneAccount telecomManager is null";
        } else {
            AnonymousClass11S r0 = this.A06;
            r0.A0I();
            PhoneUserJid phoneUserJid = r0.A0E;
            if (phoneUserJid == null) {
                str = "voip/SelfManagedConnectionsManager/registerPhoneAccount jid is null";
            } else {
                Uri A002 = A00(phoneUserJid);
                if (A002 == null) {
                    str = "voip/SelfManagedConnectionsManager/registerPhoneAccount address is null";
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("voip/SelfManagedConnectionsManager/registerPhoneAccount ");
                    sb.append(phoneUserJid);
                    Log.i(sb.toString());
                    PhoneAccountHandle phoneAccountHandle = new PhoneAccountHandle(this.A04, phoneUserJid.getRawString());
                    this.A00 = phoneAccountHandle;
                    Context context = this.A07.A00;
                    PhoneAccount.Builder shortDescription = PhoneAccount.builder(phoneAccountHandle, context.getString(2131898572)).addSupportedUriScheme("tel").setAddress(A002).setCapabilities(3080).setShortDescription(context.getString(2131898274));
                    if (Build.VERSION.SDK_INT >= 28) {
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("android.telecom.extra.LOG_SELF_MANAGED_CALLS", false);
                        shortDescription.setExtras(bundle);
                    }
                    try {
                        r4.A0I().registerPhoneAccount(shortDescription.build());
                        return true;
                    } catch (Exception e) {
                        Log.e((Throwable) e);
                        this.A00 = null;
                        return false;
                    }
                }
            }
        }
        Log.w(str);
        return false;
    }

    public AnonymousClass1VN(AnonymousClass1VL r4, AnonymousClass11S r5, AnonymousClass11C r6, AnonymousClass118 r7, C18030ve r8, AnonymousClass1DC r9, AnonymousClass00H r10) {
        super(r10);
        this.A08 = r8;
        this.A06 = r5;
        this.A07 = r7;
        this.A09 = r9;
        this.A02 = r6;
        this.A05 = r4;
        this.A04 = new ComponentName(r7.A00, SelfManagedConnectionService.class);
    }

    public static Uri A00(UserJid userJid) {
        String str;
        if (C22971Dz.A0T(userJid)) {
            if (userJid == null || (r2 = userJid.user) == null) {
                str = "voip/SelfManagedConnectionsManager/getPhoneCallUri failed to get lid user";
            }
            return Uri.fromParts("tel", r2, "");
        }
        String str2 = C63942tw.A04(AnonymousClass17K.A00(C42771yi.A00(), userJid));
        if (str2 == null) {
            str = "voip/SelfManagedConnectionsManager/getPhoneCallUri failed to get phone number";
        }
        return Uri.fromParts("tel", str2, "");
        Log.i(str);
        return null;
    }

    public C161328Ct A09(ConnectionRequest connectionRequest, boolean z) {
        Bundle bundle;
        StringBuilder sb;
        String str;
        C17960vV.A02();
        Bundle extras = connectionRequest.getExtras();
        if (extras == null) {
            sb = new StringBuilder();
            str = "voip/SelfManagedConnectionsManager/createSelfManagedConnection extras is null for request ";
        } else {
            if (!z) {
                bundle = extras.getBundle("android.telecom.extra.INCOMING_CALL_EXTRAS");
                if (bundle == null) {
                    sb = new StringBuilder();
                    str = "voip/SelfManagedConnectionsManager/createSelfManagedConnection EXTRA_INCOMING_CALL_EXTRAS is null for request ";
                }
            } else {
                bundle = extras;
            }
            String string = bundle.getString("call_id");
            UserJid A042 = UserJid.Companion.A04(bundle.getString("peer_jid"));
            String string2 = bundle.getString("peer_display_name");
            boolean z2 = bundle.getBoolean("is_rejoin", false);
            if (string == null || A042 == null || string2 == null) {
                sb = new StringBuilder();
                str = "voip/SelfManagedConnectionsManager/createSelfManagedConnection invalid request ";
            } else {
                C161328Ct A002 = this.A05.A00(this, string);
                A002.setConnectionProperties(128);
                A002.setAddress(connectionRequest.getAddress(), 1);
                A002.setCallerDisplayName(string2, 1);
                A002.setConnectionCapabilities(A002.getConnectionCapabilities() | 2);
                A002.setVideoState(connectionRequest.getVideoState());
                A002.setExtras(extras);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("voip/SelfManagedConnectionsManager/createSelfManagedConnection with ");
                sb2.append(A042);
                sb2.append(", call id: ");
                sb2.append(string);
                sb2.append(", isOutgoing ");
                sb2.append(z);
                Log.i(sb2.toString());
                A0H(A002);
                notifyAllObservers(new AnonymousClass35R(string, z, z2));
                return A002;
            }
        }
        sb.append(str);
        sb.append(connectionRequest);
        Log.i(sb.toString());
        return null;
    }

    public void A0B() {
        C17960vV.A02();
        ConcurrentMap concurrentMap = this.A03;
        if (!concurrentMap.isEmpty()) {
            Log.i("voip/SelfManagedConnectionsManager/removeAllConnections");
            Iterator it = new ArrayList(concurrentMap.values()).iterator();
            while (it.hasNext()) {
                ((C161328Ct) it.next()).A08(2);
            }
            C17960vV.A0F(concurrentMap.isEmpty(), "all connection should have been removed");
        }
    }

    public void A0F(ConnectionRequest connectionRequest) {
        String string;
        C17960vV.A02();
        Bundle extras = connectionRequest.getExtras();
        if (extras != null && (string = extras.getString("call_id")) != null) {
            notifyAllObservers(new C20738AWt(string, 4));
        }
    }

    public void A0G(ConnectionRequest connectionRequest) {
        String string;
        C17960vV.A02();
        Bundle extras = connectionRequest.getExtras();
        if (extras != null && (string = extras.getString("call_id")) != null) {
            notifyAllObservers(new C20738AWt(string, 3));
        }
    }

    public void A0H(C161328Ct r4) {
        C17960vV.A02();
        ConcurrentMap concurrentMap = this.A03;
        concurrentMap.put(r4.A06(), r4);
        StringBuilder sb = new StringBuilder();
        sb.append("voip/SelfManagedConnectionsManager/addConnection");
        sb.append(r4);
        sb.append(", total connection count: ");
        sb.append(concurrentMap.size());
        Log.i(sb.toString());
    }

    public void A0I(C161328Ct r4) {
        C17960vV.A02();
        ConcurrentMap concurrentMap = this.A03;
        concurrentMap.remove(r4.A06());
        StringBuilder sb = new StringBuilder();
        sb.append("voip/SelfManagedConnectionsManager/removeConnection");
        sb.append(r4);
        sb.append(", total connection count: ");
        sb.append(concurrentMap.size());
        Log.i(sb.toString());
    }

    public void A0J(String str) {
        C17960vV.A02();
        StringBuilder sb = new StringBuilder();
        sb.append("voip/SelfManagedConnectionsManager/disconnectConnectionIfExists");
        sb.append(str);
        Log.i(sb.toString());
        C161328Ct A0A2 = A0A(str);
        if (A0A2 != null) {
            A0A2.A08(2);
        }
    }

    public void A0K(String str, String str2) {
        C161328Ct A0A2 = A0A(str);
        if (A0A2 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("voip/SelfManagedConnectionsManager/onCallAutoConnected changing CallId from: ");
            sb.append(str);
            sb.append(" -> ");
            sb.append(str2);
            Log.i(sb.toString());
            A0I(A0A2);
            A0A2.A09(str2);
            A0H(A0A2);
        }
    }

    public boolean A0P(UserJid userJid, String str, String str2, boolean z) {
        String str3;
        C17960vV.A02();
        StringBuilder sb = new StringBuilder();
        sb.append("voip/SelfManagedConnectionsManager/addNewIncomingCall ");
        sb.append(userJid);
        Log.i(sb.toString());
        if (!this.A0A) {
            str3 = "voip/SelfManagedConnectionsManager/addNewIncomingCall incomingEnabled is false";
        } else {
            AnonymousClass11C r4 = this.A02;
            if (r4.A0I() == null) {
                str3 = "voip/SelfManagedConnectionsManager/addNewIncomingCall telecomManager is null";
            } else if (this.A00 == null) {
                str3 = "voip/SelfManagedConnectionsManager/addNewIncomingCall phoneAccountHandle is null";
            } else {
                try {
                    if (!r4.A0I().isIncomingCallPermitted(this.A00)) {
                        Log.i("voip/SelfManagedConnectionsManager/addNewIncomingCall incoming call not permitted for the phone account handle");
                        return false;
                    }
                    Uri A002 = A00(userJid);
                    if (A002 != null) {
                        Bundle bundle = new Bundle();
                        if (z) {
                            bundle.putInt("android.telecom.extra.START_CALL_WITH_VIDEO_STATE", 3);
                        }
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("call_id", str);
                        bundle2.putString("peer_jid", userJid.getRawString());
                        bundle2.putString("peer_display_name", str2);
                        bundle2.putBoolean("is_rejoin", false);
                        bundle.putParcelable("android.telecom.extra.INCOMING_CALL_EXTRAS", bundle2);
                        bundle.putParcelable("android.telecom.extra.INCOMING_CALL_ADDRESS", A002);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("voip/SelfManagedConnectionsManager/addNewIncomingCall callId=");
                        sb2.append(str);
                        sb2.append(", peerJid=");
                        sb2.append(userJid);
                        sb2.append(", videoCall=");
                        sb2.append(z);
                        sb2.append(", isRejoin=false");
                        Log.i(sb2.toString());
                        r4.A0I().addNewIncomingCall(this.A00, bundle);
                        return true;
                    }
                    return false;
                } catch (Exception e) {
                    Log.e((Throwable) e);
                    return false;
                }
            }
        }
        Log.w(str3);
        return false;
    }

    public boolean A0Q(UserJid userJid, String str, String str2, boolean z, boolean z2) {
        String str3;
        C17960vV.A02();
        StringBuilder sb = new StringBuilder();
        sb.append("voip/SelfManagedConnectionsManager/placeOutgoingCall ");
        sb.append(userJid);
        Log.i(sb.toString());
        if (!this.A01) {
            str3 = "voip/SelfManagedConnectionsManager/placeOutgoingCall outgoingEnabled is false";
        } else {
            AnonymousClass11C r4 = this.A02;
            if (r4.A0I() == null) {
                str3 = "voip/SelfManagedConnectionsManager/placeOutgoingCall telecomManager is null";
            } else if (this.A00 == null) {
                str3 = "voip/SelfManagedConnectionsManager/placeOutgoingCall phoneAccountHandle is null";
            } else {
                try {
                    if (!r4.A0I().isOutgoingCallPermitted(this.A00)) {
                        Log.w("voip/SelfManagedConnectionsManager/placeOutgoingCall outgoing call not permitted for the phone account handle");
                        return false;
                    }
                    Uri A002 = A00(userJid);
                    if (A002 != null) {
                        if (z) {
                            String str4 = Build.MANUFACTURER;
                            if (str4.equalsIgnoreCase("samsung") || str4.equalsIgnoreCase("oppo") || str4.equalsIgnoreCase("OnePlus")) {
                                z = false;
                            }
                        }
                        Bundle bundle = new Bundle();
                        if (z) {
                            bundle.putInt("android.telecom.extra.START_CALL_WITH_VIDEO_STATE", 3);
                        }
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("call_id", str);
                        bundle2.putString("peer_jid", userJid.getRawString());
                        bundle2.putString("peer_display_name", str2);
                        bundle2.putBoolean("is_rejoin", z2);
                        bundle.putParcelable("android.telecom.extra.OUTGOING_CALL_EXTRAS", bundle2);
                        bundle.putParcelable("android.telecom.extra.PHONE_ACCOUNT_HANDLE", this.A00);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("voip/SelfManagedConnectionsManager/placeOutgoingCall callId=");
                        sb2.append(str);
                        sb2.append(", peerJid=");
                        sb2.append(userJid);
                        sb2.append(", videoCall=");
                        sb2.append(z);
                        sb2.append(", isRejoin=");
                        sb2.append(z2);
                        Log.i(sb2.toString());
                        r4.A0I().placeCall(A002, bundle);
                        return true;
                    }
                    return false;
                } catch (Exception e) {
                    Log.e((Throwable) e);
                    return false;
                }
            }
        }
        Log.w(str3);
        return false;
    }
}
