package X;

import android.content.Context;
import android.content.ServiceConnection;
import android.net.Uri;
import org.npci.upi.security.services.CLRemoteService;

/* renamed from: X.9fE  reason: invalid class name and case insensitive filesystem */
public class C187079fE {
    public static C187079fE A04;
    public static final Uri A05 = Uri.parse("content://org.npci.upi.security.pinactivitycomponent.clservices/execute");
    public static final Uri A06 = Uri.parse("content://org.npci.upi.security.pinactivitycomponent.clservices/getChallenge");
    public static final Uri A07 = Uri.parse("content://org.npci.upi.security.pinactivitycomponent.clservices/getCredentialIntent");
    public static final Uri A08 = Uri.parse("content://org.npci.upi.security.pinactivitycomponent.clservices/getCredential");
    public static final Uri A09 = Uri.parse("content://org.npci.upi.security.pinactivitycomponent.clservices/registerApp");
    public Context A00;
    public ServiceConnection A01;
    public AnonymousClass9YG A02;
    public CLRemoteService A03;
}
