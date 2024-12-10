package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;

/* renamed from: X.6lz  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C131986lz {
    public final /* synthetic */ AnonymousClass682 A00;
    public final /* synthetic */ AnonymousClass206 A01;

    public final void A00() {
        int andIncrement;
        AnonymousClass682 r7 = this.A00;
        AnonymousClass206 r8 = this.A01;
        try {
            C60012nF A02 = r7.A09.A02(r7.A0C);
            AnonymousClass682.A00(r7.A08.A00(r8, A02), r7);
            if (r8 instanceof C441722k) {
                andIncrement = AnonymousClass682.A0F.getAndIncrement();
                AnonymousClass19T r3 = r7.A0A;
                r3.Bj1(494345647, andIncrement, false);
                C127316e9 A06 = r7.A07.A06(r8, A02, andIncrement);
                r3.markerPoint(494345647, andIncrement, "notification_creation_end");
                r3.markerAnnotate(494345647, andIncrement, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "audio");
                AnonymousClass682.A00(A06, r7);
                r3.markerEnd(494345647, andIncrement, 2);
                return;
            }
            AnonymousClass682.A00(r7.A07.A06(r8, A02, -1), r7);
        } catch (SecurityException unused) {
            Log.e("StellaEventDispatcher/cannot create event for untrusted package");
        } catch (Throwable th) {
            r7.A0A.markerEnd(494345647, andIncrement, 2);
            throw th;
        }
    }

    public /* synthetic */ C131986lz(AnonymousClass682 r1, AnonymousClass206 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
